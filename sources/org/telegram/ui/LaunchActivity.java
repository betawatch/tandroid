package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StatFs;
import android.os.StrictMode;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticApiModelOutline0;
import androidx.arch.core.util.Function;
import androidx.collection.LongSparseArray;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.google.android.gms.common.api.Status;
import com.google.common.primitives.Longs;
import j$.util.function.Consumer$-CC;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.pip.PipActivityController;
import org.telegram.messenger.pip.activity.IPipActivity;
import org.telegram.messenger.pip.activity.IPipActivityHandler;
import org.telegram.messenger.pip.activity.IPipActivityListener;
import org.telegram.messenger.utils.FrameMetricsOverlayView;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.Components.ActivityWindowEmptyBackgroundDrawable;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AppIconBulletinLayout;
import org.telegram.ui.Components.AttachBotIntroTopView;
import org.telegram.ui.Components.BatteryDrawable;
import org.telegram.ui.Components.BlockingUpdateView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.PasscodeViewDialog;
import org.telegram.ui.Components.PhonebookShareAlert;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.SearchTagsList;
import org.telegram.ui.Components.ShareTopView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickerSetBulletinLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TermsOfServiceView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LauncherIconController;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.ISuperRipple;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.SuperRipple;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* loaded from: classes4.dex */
public class LaunchActivity extends BasePermissionsActivity implements INavigationLayout.INavigationLayoutDelegate, NotificationCenter.NotificationCenterDelegate, DialogsActivity.DialogsActivityDelegate, IPipActivity {
    public static final Pattern PREFIX_T_ME_PATTERN = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    private static int activeInstanceCount;
    public static LaunchActivity instance;
    public static boolean isActive;
    public static boolean isResumed;
    public static Runnable onResumeStaticCallback;
    private static LaunchActivity staticInstanceForAlerts;
    public static boolean systemBlurEnabled;
    private static Pattern timestampPattern;
    public static Runnable whenResumed;
    public ActionBarLayout actionBarLayout;
    private long alreadyShownFreeDiscSpaceAlertForced;
    private SizeNotifierFrameLayout backgroundTablet;
    private final LiteMode.BatteryReceiver batteryReceiver;
    private BlockingUpdateView blockingUpdateView;
    private Consumer blurListener;
    private BottomSheetTabsOverlay bottomSheetTabsOverlay;
    private boolean checkFreeDiscSpaceShown;
    private ArrayList contactsToSend;
    private Uri contactsToSendUri;
    private int currentConnectionState;
    private ISuperRipple currentRipple;
    private String documentsMimeType;
    private ArrayList documentsOriginalPathsArray;
    private ArrayList documentsPathsArray;
    private ArrayList documentsUrisArray;
    public DrawerLayoutContainer drawerLayoutContainer;
    private HashMap englishLocaleStrings;
    private Uri exportingChatUri;
    View feedbackView;
    private boolean finished;
    private FireworksOverlay fireworksOverlay;
    private boolean firstAppUpdateCheck;
    private FlagSecureReason flagSecureReason;
    public FrameLayout frameLayout;
    private FrameMetricsOverlayView frameMetricsOverlayView;
    private NotificationCenter.ObserversGroup globalObserversGroup;
    private ArrayList importingStickers;
    private ArrayList importingStickersEmoji;
    private String importingStickersSoftware;
    private final int instanceId;
    private boolean isInPictureInPictureMode;
    private boolean isNavigationBarColorFrozen;
    private boolean isStarted;
    private RelativeLayout launchLayout;
    private ActionBarLayout layersActionBarLayout;
    private boolean loadingLocaleDialog;
    private TLRPC.TL_theme loadingTheme;
    private boolean loadingThemeAccent;
    private String loadingThemeFileName;
    private Theme.ThemeInfo loadingThemeInfo;
    private AlertDialog loadingThemeProgressDialog;
    private TLRPC.TL_wallPaper loadingThemeWallpaper;
    private String loadingThemeWallpaperName;
    private Dialog localeDialog;
    private Runnable lockRunnable;
    private AlertDialog memoryLeakErrorAlertDialog;
    private ValueAnimator navBarAnimator;
    private boolean navigateToPremiumBot;
    public Runnable navigateToPremiumGiftCallback;
    private NotificationCenter.ObserversGroup observersGroup;
    private Object onBackAnimationCallback;
    private Object onBackInvokedCallback;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private Utilities.Callback onPowerSaverCallback;
    private List onUserLeaveHintListeners;
    private List overlayPasscodeViews;
    private PasscodeViewDialog passcodeDialog;
    private Intent passcodeSaveIntent;
    private boolean passcodeSaveIntentIsNew;
    private boolean passcodeSaveIntentIsRestore;
    private ArrayList photoPathsArray;
    private final PipActivityController pipActivityController;
    private final IPipActivityHandler pipActivityHandler;
    private Dialog proxyErrorDialog;
    private int reasonsToHideDecorView;
    private int reasonsToHideMainContent;
    private SparseIntArray requestedPermissions;
    private int requsetPermissionsPointer;
    public ActionBarLayout rightActionBarLayout;
    private View rippleAbove;
    private WindowAnimatedInsetsProvider rootAnimatedInsetsListener;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
    private CharSequence sendingText;
    private FrameLayout shadowTablet;
    private boolean switchingAccount;
    private HashMap systemLocaleStrings;
    private boolean tabletFullSize;
    private int[] tempLocation;
    private TermsOfServiceView termsOfServiceView;
    private ImageView themeSwitchImageView;
    private ImageView themeSwitchSunView;
    private AlertDialog tlErrorAlertDialog;
    private String videoPath;
    private ActionMode visibleActionMode;
    public final ArrayList visibleDialogs;
    private String voicePath;
    public boolean voipLaunchedInBackground;
    private boolean wasMutedByAdminRaisedHand;
    private Utilities.Callback webviewShareAPIDoneListener;
    public ArrayList sheetFragmentsStack = new ArrayList();
    private final ArrayList mainFragmentsStack = new ArrayList();
    private final ArrayList layerFragmentsStack = new ArrayList();
    private final ArrayList rightFragmentsStack = new ArrayList();

    public static /* synthetic */ void $r8$lambda$65VHYkg1vsJ3EsSWZZHCDAFY2UU(View view) {
    }

    @Override // org.telegram.ui.ActionBar.INavigationLayout.INavigationLayoutDelegate
    public /* synthetic */ boolean needPresentFragment(BaseFragment baseFragment, boolean z, boolean z2, INavigationLayout iNavigationLayout) {
        return INavigationLayout.INavigationLayoutDelegate.-CC.$default$needPresentFragment(this, baseFragment, z, z2, iNavigationLayout);
    }

    @Override // org.telegram.ui.ActionBar.INavigationLayout.INavigationLayoutDelegate
    public /* synthetic */ void onMeasureOverride(int[] iArr) {
        INavigationLayout.INavigationLayoutDelegate.-CC.$default$onMeasureOverride(this, iArr);
    }

    public LaunchActivity() {
        PipActivityController pipActivityController = new PipActivityController(this);
        this.pipActivityController = pipActivityController;
        this.pipActivityHandler = pipActivityController.getHandler();
        this.overlayPasscodeViews = new ArrayList();
        this.visibleDialogs = new ArrayList();
        this.isNavigationBarColorFrozen = false;
        this.onUserLeaveHintListeners = new ArrayList();
        this.requestedPermissions = new SparseIntArray();
        this.requsetPermissionsPointer = 5934;
        this.blurListener = new Consumer() { // from class: org.telegram.ui.LaunchActivity.1
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$-CC.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public void s(Boolean bool) {
                LaunchActivity.systemBlurEnabled = bool.booleanValue();
            }
        };
        this.batteryReceiver = new LiteMode.BatteryReceiver();
        this.firstAppUpdateCheck = true;
        this.instanceId = System.identityHashCode(this);
        this.reasonsToHideMainContent = 0;
        this.reasonsToHideDecorView = 0;
    }

    public Dialog getVisibleDialog() {
        for (int size = this.visibleDialogs.size() - 1; size >= 0; size--) {
            Dialog dialog = (Dialog) this.visibleDialogs.get(size);
            if (dialog.isShowing()) {
                return dialog;
            }
        }
        return null;
    }

    public WindowAnimatedInsetsProvider getRootAnimatedInsetsListener() {
        return this.rootAnimatedInsetsListener;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        boolean isBackgroundRestricted;
        ActionBarLayout actionBarLayout;
        Bundle bundle2;
        boolean isInMultiWindowMode;
        Intent intent;
        Uri data;
        isActive = true;
        activeInstanceCount++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        instance = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.currentAccount = UserConfig.selectedAccount;
        registerReceiver(this.batteryReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (!UserConfig.getInstance(this.currentAccount).isClientActivated() && (intent = getIntent()) != null && intent.getAction() != null) {
            if ("android.intent.action.SEND".equals(intent.getAction()) || "android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                super.onCreate(bundle);
                finish();
                return;
            } else if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null) {
                String lowerCase = data.toString().toLowerCase();
                if (!lowerCase.startsWith("tg:proxy") && !lowerCase.startsWith("tg://proxy") && !lowerCase.startsWith("tg:socks")) {
                    lowerCase.startsWith("tg://socks");
                }
            }
        }
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, Theme.getColor(Theme.key_actionBarDefault) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new ActivityWindowEmptyBackgroundDrawable());
        getWindow().setFormat(-1);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new FlagSecureReason.FlagSecureCondition() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda24
            @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
            public final boolean run() {
                return LaunchActivity.$r8$lambda$zgDmHDYwCMzcay6OxRkyPCmZOe8();
            }
        });
        this.flagSecureReason = flagSecureReason;
        flagSecureReason.attach();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            isInMultiWindowMode = isInMultiWindowMode();
            AndroidUtilities.isInMultiwindow = isInMultiWindowMode;
        }
        Theme.createCommonChatResources();
        Theme.createDialogsResources(this);
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        this.actionBarLayout = new ActionBarLayout(this, true);
        ActivityContentLayout activityContentLayout = new ActivityContentLayout(this);
        this.frameLayout = activityContentLayout;
        activityContentLayout.setClipToPadding(false);
        this.frameLayout.setClipChildren(false);
        setContentView(this.frameLayout);
        this.rootAnimatedInsetsListener = new WindowAnimatedInsetsProvider(this.frameLayout);
        this.pipActivityController.addPipListener(new IPipActivityListener() { // from class: org.telegram.ui.LaunchActivity.2
            final ActivityVisibilityController activityVisibilityController;

            @Override // org.telegram.messenger.pip.activity.IPipActivityListener
            public /* synthetic */ void onPipStashEnd() {
                IPipActivityListener.-CC.$default$onPipStashEnd(this);
            }

            @Override // org.telegram.messenger.pip.activity.IPipActivityListener
            public /* synthetic */ void onPipStashStart() {
                IPipActivityListener.-CC.$default$onPipStashStart(this);
            }

            @Override // org.telegram.messenger.pip.activity.IPipActivityListener
            public /* synthetic */ void onStartEnterToPip() {
                IPipActivityListener.-CC.$default$onStartEnterToPip(this);
            }

            {
                this.activityVisibilityController = LaunchActivity.this.createActivityVisibilityController(false);
            }

            @Override // org.telegram.messenger.pip.activity.IPipActivityListener
            public void onCompleteEnterToPip() {
                LaunchActivity.this.isInPictureInPictureMode = true;
                this.activityVisibilityController.hide();
                LaunchActivity.this.checkDecorViewVisibility();
            }

            @Override // org.telegram.messenger.pip.activity.IPipActivityListener
            public void onStartExitFromPip(boolean z) {
                this.activityVisibilityController.show();
            }

            @Override // org.telegram.messenger.pip.activity.IPipActivityListener
            public void onCompleteExitFromPip(boolean z) {
                LaunchActivity.this.isInPictureInPictureMode = false;
                LaunchActivity.this.checkDecorViewVisibility();
            }
        });
        ((ViewGroup) getWindow().getDecorView()).addView(this.pipActivityController.getPipContentView());
        this.pipActivityController.getPipContentView().bringToFront();
        ImageView imageView = new ImageView(this);
        this.themeSwitchImageView = imageView;
        imageView.setVisibility(8);
        DrawerLayoutContainer drawerLayoutContainer = new DrawerLayoutContainer(this);
        this.drawerLayoutContainer = drawerLayoutContainer;
        drawerLayoutContainer.setActionBarLayout(this.actionBarLayout);
        this.drawerLayoutContainer.addOnLayoutChangeListener(new 3());
        this.drawerLayoutContainer.setClipChildren(false);
        this.drawerLayoutContainer.setClipToPadding(false);
        this.frameLayout.addView(this.drawerLayoutContainer, LayoutHelper.createFrame(-1, -1.0f));
        ImageView imageView2 = new ImageView(this) { // from class: org.telegram.ui.LaunchActivity.4
            @Override // android.widget.ImageView, android.view.View
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                invalidate();
            }
        };
        this.themeSwitchSunView = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.frameLayout.addView(this.themeSwitchSunView, LayoutHelper.createFrame(48, 48.0f));
        this.themeSwitchSunView.setVisibility(8);
        FrameLayout frameLayout = this.frameLayout;
        BottomSheetTabsOverlay bottomSheetTabsOverlay = new BottomSheetTabsOverlay(this);
        this.bottomSheetTabsOverlay = bottomSheetTabsOverlay;
        frameLayout.addView(bottomSheetTabsOverlay);
        FrameLayout frameLayout2 = this.frameLayout;
        FireworksOverlay fireworksOverlay = new FireworksOverlay(this) { // from class: org.telegram.ui.LaunchActivity.5
            {
                setVisibility(8);
            }

            @Override // org.telegram.ui.Components.FireworksOverlay
            public void start(boolean z) {
                setVisibility(0);
                super.start(z);
            }

            @Override // org.telegram.ui.Components.FireworksOverlay
            protected void onStop() {
                super.onStop();
                setVisibility(8);
            }
        };
        this.fireworksOverlay = fireworksOverlay;
        frameLayout2.addView(fireworksOverlay);
        setupActionBarLayout();
        this.drawerLayoutContainer.setParentActionBarLayout(this.actionBarLayout);
        this.actionBarLayout.setDrawerLayoutContainer(this.drawerLayoutContainer);
        this.actionBarLayout.setFragmentStack(this.mainFragmentsStack);
        this.actionBarLayout.setFragmentStackChangedListener(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$9AkzApKoX_H9580rMgJ6DWboCok(LaunchActivity.this);
            }
        });
        this.actionBarLayout.setDelegate(this);
        Theme.loadWallpaper(true);
        checkCurrentAccount();
        updateCurrentConnectionState(this.currentAccount);
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i = NotificationCenter.closeOtherAppActivities;
        globalInstance.postNotificationName(i, this);
        this.currentConnectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.globalObserversGroup;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.globalObserversGroup = null;
        }
        this.globalObserversGroup = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda26
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                LaunchActivity.this.onPowerSaver(((Boolean) obj).booleanValue());
            }
        };
        this.onPowerSaverCallback = callback;
        LiteMode.addOnPowerSaverAppliedListener(callback);
        if (this.actionBarLayout.getFragmentStack().isEmpty() && ((actionBarLayout = this.layersActionBarLayout) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!UserConfig.getInstance(this.currentAccount).isClientActivated()) {
                this.actionBarLayout.addFragmentToStack(getClientNotActivatedFragment());
            } else {
                this.actionBarLayout.addFragmentToStack(new MainTabsActivity());
            }
            if (bundle != null) {
                try {
                    String string = bundle.getString("fragment");
                    if (string != null) {
                        bundle2 = bundle.getBundle("args");
                        switch (string) {
                            case "chat":
                                if (bundle2 != null) {
                                    ChatActivity chatActivity = new ChatActivity(bundle2);
                                    if (this.actionBarLayout.addFragmentToStack(chatActivity)) {
                                        chatActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case "settings":
                                bundle2.putLong("user_id", UserConfig.getInstance(this.currentAccount).clientUserId);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2);
                                this.actionBarLayout.addFragmentToStack(profileActivity);
                                profileActivity.restoreSelfArgs(bundle);
                                break;
                            case "settings2":
                                this.actionBarLayout.addFragmentToStack(new SettingsActivity());
                                break;
                            case "group":
                                if (bundle2 != null) {
                                    GroupCreateFinalActivity groupCreateFinalActivity = new GroupCreateFinalActivity(bundle2);
                                    if (this.actionBarLayout.addFragmentToStack(groupCreateFinalActivity)) {
                                        groupCreateFinalActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case "channel":
                                if (bundle2 != null) {
                                    ChannelCreateActivity channelCreateActivity = new ChannelCreateActivity(bundle2);
                                    if (this.actionBarLayout.addFragmentToStack(channelCreateActivity)) {
                                        channelCreateActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case "chat_profile":
                                if (bundle2 != null) {
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2);
                                    if (this.actionBarLayout.addFragmentToStack(profileActivity2)) {
                                        profileActivity2.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case "wallpapers":
                                WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(0);
                                this.actionBarLayout.addFragmentToStack(wallpapersListActivity);
                                wallpapersListActivity.restoreSelfArgs(bundle);
                                break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        checkLayout();
        checkSystemBarColors();
        handleIntent(getIntent(), false, bundle != null, false, null, true, true);
        try {
            String str = Build.DISPLAY;
            String str2 = Build.USER;
            String lowerCase2 = str != null ? str.toLowerCase() : "";
            String lowerCase3 = str2 != null ? lowerCase2.toLowerCase() : "";
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("OS name " + lowerCase2 + " " + lowerCase3);
            }
            if ((lowerCase2.contains("flyme") || lowerCase3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                AndroidUtilities.incorrectDisplaySizeFix = true;
                final View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda27
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        LaunchActivity.$r8$lambda$DDOCmwt7UXAtUfyR4lE720_wK_U(rootView);
                    }
                };
                this.onGlobalLayoutListener = onGlobalLayoutListener;
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            FingerprintController.checkKeyReady();
        }
        if (i2 >= 28) {
            isBackgroundRestricted = ((ActivityManager) getSystemService("activity")).isBackgroundRestricted();
            if (isBackgroundRestricted && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000 && SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
                AlertsCreator.createBackgroundActivityDialog(this).show();
                SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
            }
        }
        if (i2 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: org.telegram.ui.LaunchActivity.6
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    LaunchActivity.this.getWindowManager().addCrossWindowBlurEnabledListener(LaunchActivity.this.blurListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    LaunchActivity.this.getWindowManager().removeCrossWindowBlurEnabledListener(LaunchActivity.this.blurListener);
                }
            });
        }
        Bulletin.addDelegate(this.frameLayout, new Bulletin.Delegate() { // from class: org.telegram.ui.LaunchActivity.7
            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean allowLayoutChanges() {
                return Bulletin.Delegate.-CC.$default$allowLayoutChanges(this);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.-CC.$default$bottomOffsetAnimated(this);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean clipWithGradient(int i3) {
                return Bulletin.Delegate.-CC.$default$clipWithGradient(this, i3);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ int getTopOffset(int i3) {
                return Bulletin.Delegate.-CC.$default$getTopOffset(this, i3);
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
            public int getBottomOffset(int i3) {
                return AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(16.0f);
            }
        });
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        RestrictedLanguagesSelectActivity.checkRestrictedLanguages(false);
        if (i2 >= 34) {
            if (this.onBackAnimationCallback == null) {
                this.onBackAnimationCallback = new OnBackAnimationCallback() { // from class: org.telegram.ui.LaunchActivity.8
                    private boolean locked;
                    private boolean predictiveBackStarted;
                    private AnimationNotificationsLocker locker = new AnimationNotificationsLocker();
                    private boolean started = false;
                    private boolean invoked = false;

                    @Override // android.window.OnBackInvokedCallback
                    public void onBackInvoked() {
                        this.invoked = true;
                        if (this.locked) {
                            this.locker.unlock();
                            this.locked = false;
                        }
                        if (AndroidUtilities.isTablet()) {
                            LaunchActivity.this.onBackPressed();
                            return;
                        }
                        if (LaunchActivity.this.onBackPressed(true)) {
                            LaunchActivity launchActivity = LaunchActivity.this;
                            ActionBarLayout actionBarLayout2 = launchActivity.actionBarLayout;
                            if (actionBarLayout2 != null) {
                                actionBarLayout2.onBackInvoked();
                            } else {
                                launchActivity.onBackPressed();
                            }
                        }
                    }

                    @Override // android.window.OnBackAnimationCallback
                    public void onBackStarted(BackEvent backEvent) {
                        this.started = true;
                        this.invoked = false;
                        this.predictiveBackStarted = false;
                    }

                    private void onBackStartedInternal(BackEvent backEvent) {
                        ActionBarLayout actionBarLayout2;
                        float touchX;
                        float touchY;
                        if (AndroidUtilities.isTablet() || !LaunchActivity.this.onBackPressed(false) || (actionBarLayout2 = LaunchActivity.this.actionBarLayout) == null) {
                            return;
                        }
                        touchX = backEvent.getTouchX();
                        touchY = backEvent.getTouchY();
                        if (!actionBarLayout2.onBackStarted(touchX, touchY) || this.locked) {
                            return;
                        }
                        this.locker.lock();
                        this.locked = true;
                    }

                    @Override // android.window.OnBackAnimationCallback
                    public void onBackProgressed(BackEvent backEvent) {
                        float progress;
                        ActionBarLayout actionBarLayout2;
                        if (this.started && this.invoked) {
                            return;
                        }
                        progress = backEvent.getProgress();
                        if (!this.predictiveBackStarted && progress > 0.015f) {
                            this.predictiveBackStarted = true;
                            onBackStartedInternal(backEvent);
                        }
                        float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
                        if (AndroidUtilities.isTablet() || (actionBarLayout2 = LaunchActivity.this.actionBarLayout) == null) {
                            return;
                        }
                        actionBarLayout2.onBackProgress(max);
                    }

                    @Override // android.window.OnBackAnimationCallback
                    public void onBackCancelled() {
                        ActionBarLayout actionBarLayout2;
                        this.started = false;
                        this.invoked = false;
                        if (this.locked) {
                            this.locker.unlock();
                            this.locked = false;
                        }
                        if (AndroidUtilities.isTablet() || (actionBarLayout2 = LaunchActivity.this.actionBarLayout) == null) {
                            return;
                        }
                        actionBarLayout2.onBackCancelled();
                    }
                };
            }
            onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, LaunchActivity$$ExternalSyntheticApiModelOutline3.m(this.onBackAnimationCallback));
        } else if (i2 >= 33) {
            if (this.onBackInvokedCallback == null) {
                this.onBackInvokedCallback = new OnBackInvokedCallback() { // from class: org.telegram.ui.LaunchActivity.9
                    @Override // android.window.OnBackInvokedCallback
                    public void onBackInvoked() {
                        if (AndroidUtilities.isTablet()) {
                            LaunchActivity.this.onBackPressed();
                            return;
                        }
                        if (LaunchActivity.this.onBackPressed(true)) {
                            LaunchActivity launchActivity = LaunchActivity.this;
                            ActionBarLayout actionBarLayout2 = launchActivity.actionBarLayout;
                            if (actionBarLayout2 != null) {
                                actionBarLayout2.onBackInvoked();
                            } else {
                                launchActivity.onBackPressed();
                            }
                        }
                    }
                };
            }
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticApiModelOutline0.m(this.onBackInvokedCallback));
        }
        checkFrameMetrics();
    }

    public static /* synthetic */ boolean $r8$lambda$zgDmHDYwCMzcay6OxRkyPCmZOe8() {
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    class 3 implements View.OnLayoutChangeListener {
        private boolean wasPortrait;

        3() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z = i4 - i2 > i3 - i;
            if (z != this.wasPortrait) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$3$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.3.$r8$lambda$gJJcd-7XputTh4oW-D1mOPj3Hpo(LaunchActivity.3.this);
                    }
                });
                this.wasPortrait = z;
            }
        }

        public static /* synthetic */ void $r8$lambda$gJJcd-7XputTh4oW-D1mOPj3Hpo(3 r1) {
            if (LaunchActivity.this.selectAnimatedEmojiDialog != null) {
                LaunchActivity.this.selectAnimatedEmojiDialog.dismiss();
                LaunchActivity.this.selectAnimatedEmojiDialog = null;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$9AkzApKoX_H9580rMgJ6DWboCok(LaunchActivity launchActivity) {
        launchActivity.checkSystemBarColors(true, false);
        if (getLastFragment() == null || getLastFragment().getLastStoryViewer() == null) {
            return;
        }
        getLastFragment().getLastStoryViewer().updatePlayingMode();
    }

    public static /* synthetic */ void $r8$lambda$DDOCmwt7UXAtUfyR4lE720_wK_U(View view) {
        int measuredHeight = view.getMeasuredHeight();
        FileLog.d("height = " + measuredHeight + " displayHeight = " + AndroidUtilities.displaySize.y);
        int i = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
        if (i <= AndroidUtilities.dp(100.0f) || i >= AndroidUtilities.displaySize.y) {
            return;
        }
        int dp = AndroidUtilities.dp(100.0f) + i;
        Point point = AndroidUtilities.displaySize;
        if (dp > point.y) {
            point.y = i;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("fix display size y to " + AndroidUtilities.displaySize.y);
            }
        }
    }

    public void checkFrameMetrics() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.frameMetricsOverlayView == null && SharedConfig.frameMetricsEnabled) {
                this.frameMetricsOverlayView = FrameMetricsOverlayView.attachToActivityCorner(this, 8388627, 12, this.frameLayout);
            }
            FrameMetricsOverlayView frameMetricsOverlayView = this.frameMetricsOverlayView;
            if (frameMetricsOverlayView == null || SharedConfig.frameMetricsEnabled) {
                return;
            }
            frameMetricsOverlayView.detach();
            this.frameMetricsOverlayView = null;
        }
    }

    public static void showAttachMenuBot(LaunchActivity launchActivity, int i, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z) {
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment == null) {
            return;
        }
        long j = tL_attachMenuBot.bot_id;
        WebViewRequestProps of = WebViewRequestProps.of(i, j, j, tL_attachMenuBot.short_name, null, 1, 0, 0L, false, null, false, str, null, 2, false, false);
        if (launchActivity.getBottomSheetTabs() == null || launchActivity.getBottomSheetTabs().tryReopenTab(of) == null) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
            String restrictionReason = user == null ? null : MessagesController.getInstance(i).getRestrictionReason(user.restriction_reason);
            if (!TextUtils.isEmpty(restrictionReason)) {
                MessagesController.getInstance(i);
                MessagesController.showCantOpenAlert(lastFragment, restrictionReason);
                return;
            }
            BotWebViewSheet botWebViewSheet = new BotWebViewSheet(launchActivity, lastFragment.getResourceProvider());
            botWebViewSheet.setNeedsContext(false);
            botWebViewSheet.setDefaultFullsize(z);
            botWebViewSheet.setParentActivity(launchActivity);
            botWebViewSheet.requestWebView(lastFragment, of);
            botWebViewSheet.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.INavigationLayout.INavigationLayoutDelegate
    public void onThemeProgress(float f) {
        if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
            ArticleViewer.getInstance().updateThemeColors(f);
        }
        if (PhotoViewer.hasInstance()) {
            PhotoViewer.getInstance().updateColors();
        }
    }

    private void setupActionBarLayout() {
        DrawerLayoutContainer drawerLayoutContainer;
        ViewGroup view;
        if (this.drawerLayoutContainer.indexOfChild(this.launchLayout) != -1) {
            drawerLayoutContainer = this.drawerLayoutContainer;
            view = this.launchLayout;
        } else {
            drawerLayoutContainer = this.drawerLayoutContainer;
            view = this.actionBarLayout.getView();
        }
        int indexOfChild = drawerLayoutContainer.indexOfChild(view);
        if (indexOfChild != -1) {
            this.drawerLayoutContainer.removeViewAt(indexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            10 r2 = new 10(this);
            this.launchLayout = r2;
            if (indexOfChild != -1) {
                this.drawerLayoutContainer.addView(r2, indexOfChild, LayoutHelper.createFrame(-1, -1.0f));
            } else {
                this.drawerLayoutContainer.addView(r2, LayoutHelper.createFrame(-1, -1.0f));
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(this) { // from class: org.telegram.ui.LaunchActivity.11
                @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
                protected boolean isActionBarVisible() {
                    return false;
                }
            };
            this.backgroundTablet = sizeNotifierFrameLayout;
            sizeNotifierFrameLayout.setOccupyStatusBar(false);
            this.backgroundTablet.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion());
            this.launchLayout.addView(this.backgroundTablet, LayoutHelper.createRelative(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.actionBarLayout.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.actionBarLayout.getView());
            }
            this.launchLayout.addView(this.actionBarLayout.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.rightActionBarLayout = actionBarLayout;
            actionBarLayout.setIsRightLayout();
            this.rightActionBarLayout.setFragmentStack(this.rightFragmentsStack);
            this.rightActionBarLayout.setDelegate(this);
            this.launchLayout.addView(this.rightActionBarLayout.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.shadowTablet = frameLayout;
            frameLayout.setVisibility(this.layerFragmentsStack.isEmpty() ? 8 : 0);
            this.shadowTablet.setBackgroundColor(1056964608);
            this.launchLayout.addView(this.shadowTablet);
            this.shadowTablet.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda22
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return LaunchActivity.$r8$lambda$zML9RIqlQqjVZJt2Kl3RCqAbqLA(LaunchActivity.this, view2, motionEvent);
                }
            });
            this.shadowTablet.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda23
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LaunchActivity.$r8$lambda$65VHYkg1vsJ3EsSWZZHCDAFY2UU(view2);
                }
            });
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.layersActionBarLayout = actionBarLayout2;
            actionBarLayout2.setIsLayersLayout();
            this.layersActionBarLayout.setRemoveActionBarExtraHeight(true);
            this.layersActionBarLayout.setBackgroundView(this.shadowTablet);
            this.layersActionBarLayout.setUseAlphaAnimations(true);
            this.layersActionBarLayout.setFragmentStack(this.layerFragmentsStack);
            this.layersActionBarLayout.setDelegate(this);
            this.layersActionBarLayout.setDrawerLayoutContainer(this.drawerLayoutContainer);
            ViewGroup view2 = this.layersActionBarLayout.getView();
            view2.setVisibility(this.layerFragmentsStack.isEmpty() ? 8 : 0);
            this.launchLayout.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.actionBarLayout.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.actionBarLayout.getView());
            }
            this.actionBarLayout.setFragmentStack(this.mainFragmentsStack);
            if (indexOfChild != -1) {
                this.drawerLayoutContainer.addView(this.actionBarLayout.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.drawerLayoutContainer.addView(this.actionBarLayout.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        FloatingDebugController.setActive(this, SharedConfig.isFloatingDebugActive, false);
    }

    class 10 extends RelativeLayout {
        private boolean inLayout;
        private Insets insets;

        10(Context context) {
            super(context);
            this.insets = Insets.NONE;
            ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.LaunchActivity$10$$ExternalSyntheticLambda0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return LaunchActivity.10.$r8$lambda$AJE4fAKxH8p4qA-8nhLpMA1m3CY(LaunchActivity.10.this, view, windowInsetsCompat);
                }
            });
        }

        public static /* synthetic */ WindowInsetsCompat $r8$lambda$AJE4fAKxH8p4qA-8nhLpMA1m3CY(10 r2, View view, WindowInsetsCompat windowInsetsCompat) {
            r2.getClass();
            Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
            if (!r2.insets.equals(defaultWindowInsets)) {
                r2.insets = defaultWindowInsets;
                r2.requestLayout();
            }
            int childCount = r2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewCompat.dispatchApplyWindowInsets(r2.getChildAt(i), windowInsetsCompat);
            }
            return windowInsetsCompat;
        }

        @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
        public void requestLayout() {
            if (this.inLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override // android.widget.RelativeLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            this.inLayout = true;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            if (AndroidUtilities.isInMultiwindow || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
                LaunchActivity.this.tabletFullSize = true;
                LaunchActivity.this.actionBarLayout.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else {
                LaunchActivity.this.tabletFullSize = false;
                Insets insets = this.insets;
                int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, insets.left, insets.right);
                LaunchActivity.this.actionBarLayout.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                LaunchActivity.this.rightActionBarLayout.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            }
            LaunchActivity.this.backgroundTablet.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            LaunchActivity.this.shadowTablet.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            ViewGroup view = LaunchActivity.this.layersActionBarLayout.getView();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), TLObject.FLAG_30);
            Insets insets2 = this.insets;
            view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
            this.inLayout = false;
        }

        @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredWidth = getMeasuredWidth();
            getMeasuredHeight();
            if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                Insets insets = this.insets;
                int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, insets.left, insets.right);
                LaunchActivity.this.actionBarLayout.getView().layout(0, 0, LaunchActivity.this.actionBarLayout.getView().getMeasuredWidth(), LaunchActivity.this.actionBarLayout.getView().getMeasuredHeight());
                LaunchActivity.this.rightActionBarLayout.getView().layout(tabletLeftFragmentSize, 0, LaunchActivity.this.rightActionBarLayout.getView().getMeasuredWidth() + tabletLeftFragmentSize, LaunchActivity.this.rightActionBarLayout.getView().getMeasuredHeight());
            } else {
                LaunchActivity.this.actionBarLayout.getView().layout(0, 0, LaunchActivity.this.actionBarLayout.getView().getMeasuredWidth(), LaunchActivity.this.actionBarLayout.getView().getMeasuredHeight());
            }
            int measuredWidth2 = (measuredWidth - LaunchActivity.this.layersActionBarLayout.getView().getMeasuredWidth()) / 2;
            int dp = this.insets.top + AndroidUtilities.dp(8.0f);
            LaunchActivity.this.layersActionBarLayout.getView().layout(measuredWidth2, dp, LaunchActivity.this.layersActionBarLayout.getView().getMeasuredWidth() + measuredWidth2, LaunchActivity.this.layersActionBarLayout.getView().getMeasuredHeight() + dp);
            LaunchActivity.this.backgroundTablet.layout(0, 0, LaunchActivity.this.backgroundTablet.getMeasuredWidth(), LaunchActivity.this.backgroundTablet.getMeasuredHeight());
            LaunchActivity.this.shadowTablet.layout(0, 0, LaunchActivity.this.shadowTablet.getMeasuredWidth(), LaunchActivity.this.shadowTablet.getMeasuredHeight());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            if (LaunchActivity.this.layersActionBarLayout != null) {
                LaunchActivity.this.layersActionBarLayout.parentDraw(this, canvas);
            }
            super.dispatchDraw(canvas);
        }
    }

    public static /* synthetic */ boolean $r8$lambda$zML9RIqlQqjVZJt2Kl3RCqAbqLA(LaunchActivity launchActivity, View view, MotionEvent motionEvent) {
        if (!launchActivity.actionBarLayout.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int[] iArr = new int[2];
            launchActivity.layersActionBarLayout.getView().getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            if (!launchActivity.layersActionBarLayout.checkTransitionAnimation() && (x <= i || x >= i + launchActivity.layersActionBarLayout.getView().getWidth() || y <= i2 || y >= i2 + launchActivity.layersActionBarLayout.getView().getHeight())) {
                if (!launchActivity.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    while (launchActivity.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                        ActionBarLayout actionBarLayout = launchActivity.layersActionBarLayout;
                        actionBarLayout.removeFragmentFromStack(actionBarLayout.getFragmentStack().get(0));
                    }
                    launchActivity.layersActionBarLayout.closeLastFragment(true);
                }
                return true;
            }
        }
        return false;
    }

    public void addOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.add(runnable);
    }

    public void removeOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.remove(runnable);
    }

    private BaseFragment getClientNotActivatedFragment() {
        if (LoginActivity.loadCurrentState(false, this.currentAccount).getInt("currentViewNum", 0) != 0) {
            return new LoginActivity();
        }
        return new IntroActivity();
    }

    public FireworksOverlay getFireworksOverlay() {
        return this.fireworksOverlay;
    }

    public BottomSheetTabsOverlay getBottomSheetTabsOverlay() {
        return this.bottomSheetTabsOverlay;
    }

    private void checkSystemBarColors() {
        checkSystemBarColors(false, true, !this.isNavigationBarColorFrozen);
    }

    private void checkSystemBarColors(boolean z) {
        checkSystemBarColors(z, true, !this.isNavigationBarColorFrozen);
    }

    private void checkSystemBarColors(boolean z, boolean z2) {
        checkSystemBarColors(false, z, z2);
    }

    public void checkSystemBarColors(boolean z, boolean z2, boolean z3) {
        BaseFragment baseFragment;
        boolean z4;
        boolean z5 = true;
        if (this.mainFragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            ArrayList arrayList = this.mainFragmentsStack;
            baseFragment = (BaseFragment) arrayList.get(arrayList.size() - 1);
        }
        char c = 2;
        if (baseFragment != null && (baseFragment.isRemovingFromStack() || baseFragment.isInPreviewMode())) {
            if (this.mainFragmentsStack.size() > 1) {
                ArrayList arrayList2 = this.mainFragmentsStack;
                baseFragment = (BaseFragment) arrayList2.get(arrayList2.size() - 2);
            } else {
                baseFragment = null;
            }
        }
        if (baseFragment != null) {
            baseFragment.hasForceLightStatusBar();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (z2) {
                if (baseFragment != null) {
                    z4 = baseFragment.isLightStatusBar();
                    if (baseFragment.getParentLayout() instanceof ActionBarLayout) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) baseFragment.getParentLayout();
                        if (actionBarLayout.getSheetFragment(false) != null && actionBarLayout.getSheetFragment(false).getLastSheet() != null) {
                            BaseFragment.AttachedSheet lastSheet = actionBarLayout.getSheetFragment(false).getLastSheet();
                            if (lastSheet.isShown()) {
                                z4 = lastSheet.isAttachedLightStatusBar();
                            }
                        } else {
                            ArrayList<BaseFragment.AttachedSheet> arrayList3 = baseFragment.sheetsStack;
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                ArrayList<BaseFragment.AttachedSheet> arrayList4 = baseFragment.sheetsStack;
                                BaseFragment.AttachedSheet attachedSheet = arrayList4.get(arrayList4.size() - 1);
                                if (attachedSheet.isShown()) {
                                    z4 = attachedSheet.isAttachedLightStatusBar();
                                }
                            }
                        }
                    }
                } else {
                    z4 = ColorUtils.calculateLuminance(Theme.getColor(Theme.key_actionBarDefault, null, true)) > 0.699999988079071d;
                }
                AndroidUtilities.setLightStatusBar(this, z4);
            }
            if (i >= 26 && z3 && (!z || baseFragment == null || !baseFragment.isInPreviewMode())) {
                int color = (baseFragment == null || !z) ? Theme.getColor(Theme.key_windowBackgroundGray, null, true) : baseFragment.getNavigationBarColor();
                if (!(baseFragment instanceof ChatActivity)) {
                    c = 0;
                } else if (!((ChatActivity) baseFragment).isShouldHaveLightNavigationBarIcons()) {
                    c = 1;
                }
                if (getBottomSheetTabs() != null && getBottomSheetTabs().getHeight(false) > 0) {
                    c = 0;
                }
                if (this.actionBarLayout.getSheetFragment(false) != null) {
                    EmptyBaseFragment sheetFragment = this.actionBarLayout.getSheetFragment(false);
                    if (sheetFragment.sheetsStack != null) {
                        for (int i2 = 0; i2 < sheetFragment.sheetsStack.size(); i2++) {
                            BaseFragment.AttachedSheet attachedSheet2 = sheetFragment.sheetsStack.get(i2);
                            if (attachedSheet2.attachedToParent()) {
                                color = attachedSheet2.getNavigationBarColor(color);
                                c = 0;
                            }
                        }
                    }
                }
                Iterator it = BotWebViewSheet.activeSheets.iterator();
                while (it.hasNext()) {
                    color = ((BotWebViewSheet) it.next()).getNavigationBarColor(color);
                    c = 0;
                }
                setNavigationBarColor(color);
                if ((c != 0 || AndroidUtilities.computePerceivedBrightness(color) < 0.721f) && c != 1) {
                    z5 = false;
                }
                AndroidUtilities.setLightNavigationBar(this, z5);
            }
        }
        if (z2) {
            getWindow().setStatusBarColor(0);
        }
    }

    public FrameLayout getMainContainerFrameLayout() {
        return this.frameLayout;
    }

    public static /* synthetic */ MainTabsActivity $r8$lambda$AgtVsDJu6qeK8DrzrChE17ZgC88(Void r0) {
        return new MainTabsActivity();
    }

    public void switchToAccount(int i, boolean z) {
        switchToAccount(i, z, new GenericProvider() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda45
            @Override // org.telegram.messenger.GenericProvider
            public final Object provide(Object obj) {
                return LaunchActivity.$r8$lambda$AgtVsDJu6qeK8DrzrChE17ZgC88((Void) obj);
            }
        });
    }

    public void switchToAccount(int i, boolean z, GenericProvider genericProvider) {
        if (i == UserConfig.selectedAccount || !UserConfig.isValidAccount(i)) {
            return;
        }
        this.switchingAccount = true;
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        UserConfig.selectedAccount = i;
        UserConfig.getInstance(0).saveConfig(false);
        checkCurrentAccount();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.activeAccountChanged, Integer.valueOf(i));
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.removeAllFragments();
            this.rightActionBarLayout.removeAllFragments();
            if (!this.tabletFullSize) {
                if (this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                    this.backgroundTablet.setVisibility(0);
                }
                this.rightActionBarLayout.getView().setVisibility(8);
            }
            this.layersActionBarLayout.getView().setVisibility(8);
        }
        if (z) {
            this.actionBarLayout.removeAllFragments();
        } else {
            this.actionBarLayout.removeFragmentFromStack(0);
        }
        this.actionBarLayout.addFragmentToStack((MainTabsActivity) genericProvider.provide(null), -3);
        this.actionBarLayout.rebuildFragments(1);
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.rebuildFragments(1);
            this.rightActionBarLayout.rebuildFragments(1);
        }
        if (!ApplicationLoader.mainInterfacePaused) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        if (UserConfig.getInstance(i).unacceptedTermsOfService != null) {
            showTosActivity(i, UserConfig.getInstance(i).unacceptedTermsOfService);
        }
        updateCurrentConnectionState(this.currentAccount);
        this.switchingAccount = false;
    }

    private void switchToAvailableAccountOrLogout() {
        int i = 0;
        while (true) {
            if (i >= 4) {
                i = -1;
                break;
            } else if (UserConfig.getInstance(i).isClientActivated()) {
                break;
            } else {
                i++;
            }
        }
        TermsOfServiceView termsOfServiceView = this.termsOfServiceView;
        if (termsOfServiceView != null) {
            termsOfServiceView.setVisibility(8);
        }
        if (i != -1) {
            switchToAccount(i, true);
            return;
        }
        RestrictedLanguagesSelectActivity.checkRestrictedLanguages(true);
        clearFragments();
        this.actionBarLayout.rebuildLogout();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.rebuildLogout();
            this.rightActionBarLayout.rebuildLogout();
        }
        presentFragment(new IntroActivity().setOnLogout());
    }

    public void clearFragments() {
        ArrayList arrayList = this.mainFragmentsStack;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((BaseFragment) obj).onFragmentDestroy();
        }
        this.mainFragmentsStack.clear();
        if (AndroidUtilities.isTablet()) {
            ArrayList arrayList2 = this.layerFragmentsStack;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ((BaseFragment) obj2).onFragmentDestroy();
            }
            this.layerFragmentsStack.clear();
            ArrayList arrayList3 = this.rightFragmentsStack;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                ((BaseFragment) obj3).onFragmentDestroy();
            }
            this.rightFragmentsStack.clear();
        }
    }

    public int getMainFragmentsCount() {
        return this.mainFragmentsStack.size();
    }

    private void checkCurrentAccount() {
        if (this.currentAccount != UserConfig.selectedAccount || this.observersGroup == null) {
            NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.observersGroup = null;
            }
            int i = UserConfig.selectedAccount;
            this.currentAccount = i;
            this.observersGroup = NotificationCenter.getInstance(i).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
        }
    }

    private void checkLayout() {
        if (!AndroidUtilities.isTablet() || this.rightActionBarLayout == null) {
            return;
        }
        if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
            if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                this.tabletFullSize = false;
                List<BaseFragment> fragmentStack = this.actionBarLayout.getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    while (1 < fragmentStack.size()) {
                        BaseFragment baseFragment = fragmentStack.get(1);
                        if (baseFragment instanceof ChatActivity) {
                            ((ChatActivity) baseFragment).setIgnoreAttachOnPause(true);
                        }
                        baseFragment.onPause();
                        baseFragment.onFragmentDestroy();
                        baseFragment.setParentLayout(null);
                        fragmentStack.remove(baseFragment);
                        this.rightActionBarLayout.addFragmentToStack(baseFragment);
                    }
                    PasscodeViewDialog passcodeViewDialog = this.passcodeDialog;
                    if (passcodeViewDialog == null || passcodeViewDialog.passcodeView.getVisibility() != 0) {
                        this.actionBarLayout.rebuildFragments(1);
                        this.rightActionBarLayout.rebuildFragments(1);
                    }
                }
                this.rightActionBarLayout.getView().setVisibility(this.rightActionBarLayout.getFragmentStack().isEmpty() ? 8 : 0);
                this.backgroundTablet.setVisibility(this.rightActionBarLayout.getFragmentStack().isEmpty() ? 0 : 8);
                return;
            }
            this.tabletFullSize = true;
            List<BaseFragment> fragmentStack2 = this.rightActionBarLayout.getFragmentStack();
            if (!fragmentStack2.isEmpty()) {
                while (fragmentStack2.size() > 0) {
                    BaseFragment baseFragment2 = fragmentStack2.get(0);
                    if (baseFragment2 instanceof ChatActivity) {
                        ((ChatActivity) baseFragment2).setIgnoreAttachOnPause(true);
                    }
                    baseFragment2.onPause();
                    baseFragment2.onFragmentDestroy();
                    baseFragment2.setParentLayout(null);
                    fragmentStack2.remove(baseFragment2);
                    this.actionBarLayout.addFragmentToStack(baseFragment2);
                }
                PasscodeViewDialog passcodeViewDialog2 = this.passcodeDialog;
                if (passcodeViewDialog2 == null || passcodeViewDialog2.passcodeView.getVisibility() != 0) {
                    this.actionBarLayout.rebuildFragments(1);
                }
            }
            this.rightActionBarLayout.getView().setVisibility(8);
            this.backgroundTablet.setVisibility(this.actionBarLayout.getFragmentStack().isEmpty() ? 0 : 8);
        }
    }

    private void showUpdateActivity(int i, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z) {
        if (this.blockingUpdateView == null) {
            BlockingUpdateView blockingUpdateView = new BlockingUpdateView(this);
            this.blockingUpdateView = blockingUpdateView;
            this.drawerLayoutContainer.addView(blockingUpdateView, LayoutHelper.createFrame(-1, -1.0f));
        }
        this.blockingUpdateView.show(i, tL_help_appUpdate, z);
    }

    private void showTosActivity(int i, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        if (this.termsOfServiceView == null) {
            TermsOfServiceView termsOfServiceView = new TermsOfServiceView(this);
            this.termsOfServiceView = termsOfServiceView;
            termsOfServiceView.setAlpha(0.0f);
            this.drawerLayoutContainer.addView(this.termsOfServiceView, LayoutHelper.createFrame(-1, -1.0f));
            this.termsOfServiceView.setDelegate(new 12());
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            UserConfig.getInstance(i).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i).saveConfig(false);
        }
        this.termsOfServiceView.show(i, tL_help_termsOfService);
        this.termsOfServiceView.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    class 12 implements TermsOfServiceView.TermsOfServiceViewDelegate {
        12() {
        }

        @Override // org.telegram.ui.Components.TermsOfServiceView.TermsOfServiceViewDelegate
        public void onAcceptTerms(int i) {
            UserConfig.getInstance(i).unacceptedTermsOfService = null;
            UserConfig.getInstance(i).saveConfig(false);
            if (!LaunchActivity.this.mainFragmentsStack.isEmpty()) {
                ((BaseFragment) LaunchActivity.this.mainFragmentsStack.get(LaunchActivity.this.mainFragmentsStack.size() - 1)).onResume();
            }
            LaunchActivity.this.termsOfServiceView.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new Runnable() { // from class: org.telegram.ui.LaunchActivity$12$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.this.termsOfServiceView.setVisibility(8);
                }
            }).start();
        }
    }

    public void showPasscodeActivity(boolean z, boolean z2, int i, int i2, final Runnable runnable, Runnable runnable2) {
        if (this.drawerLayoutContainer == null || isFinishing()) {
            return;
        }
        if (this.passcodeDialog == null) {
            this.passcodeDialog = new PasscodeViewDialog(this);
        }
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = this.selectAnimatedEmojiDialog;
        if (selectAnimatedEmojiDialogWindow != null) {
            selectAnimatedEmojiDialogWindow.dismiss();
            this.selectAnimatedEmojiDialog = null;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
            SecretMediaViewer.getInstance().closePhoto(false, false);
        } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(false, true);
        } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
            ArticleViewer.getInstance().close(false, true);
        }
        StoryRecorder.destroyInstance();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.passcodeDialog.show();
        this.passcodeDialog.passcodeView.onShow(this.overlayPasscodeViews.isEmpty() && z, z2, i, i2, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda66
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$I68XixBXLxie7kwlMyjhz9OyGl8(LaunchActivity.this, runnable);
            }
        }, runnable2);
        int i3 = 0;
        while (i3 < this.overlayPasscodeViews.size()) {
            ((PasscodeView) this.overlayPasscodeViews.get(i3)).onShow(z && i3 == this.overlayPasscodeViews.size() - 1, z2, i, i2, null, null);
            i3++;
        }
        SharedConfig.isWaitingForPasscodeEnter = true;
        PasscodeView.PasscodeViewDelegate passcodeViewDelegate = new PasscodeView.PasscodeViewDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda67
            @Override // org.telegram.ui.Components.PasscodeView.PasscodeViewDelegate
            public final void didAcceptedPassword(PasscodeView passcodeView) {
                LaunchActivity.$r8$lambda$IfB6GqFCi5U6-6kUzLC96Y8xJSM(LaunchActivity.this, passcodeView);
            }
        };
        this.passcodeDialog.passcodeView.setDelegate(passcodeViewDelegate);
        Iterator it = this.overlayPasscodeViews.iterator();
        while (it.hasNext()) {
            ((PasscodeView) it.next()).setDelegate(passcodeViewDelegate);
        }
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$I68XixBXLxie7kwlMyjhz9OyGl8(LaunchActivity launchActivity, Runnable runnable) {
        launchActivity.actionBarLayout.getView().setVisibility(4);
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = launchActivity.layersActionBarLayout;
            if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity.layersActionBarLayout.getView().getVisibility() == 0) {
                launchActivity.layersActionBarLayout.getView().setVisibility(4);
            }
            ActionBarLayout actionBarLayout2 = launchActivity.rightActionBarLayout;
            if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                launchActivity.rightActionBarLayout.getView().setVisibility(4);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void $r8$lambda$IfB6GqFCi5U6-6kUzLC96Y8xJSM(LaunchActivity launchActivity, PasscodeView passcodeView) {
        LaunchActivity launchActivity2;
        launchActivity.getClass();
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = launchActivity.passcodeSaveIntent;
        if (intent != null) {
            launchActivity2 = launchActivity;
            launchActivity2.handleIntent(intent, launchActivity.passcodeSaveIntentIsNew, launchActivity.passcodeSaveIntentIsRestore, true, null, false, true);
            launchActivity2.passcodeSaveIntent = null;
        } else {
            launchActivity2 = launchActivity;
        }
        launchActivity2.actionBarLayout.getView().setVisibility(0);
        launchActivity2.actionBarLayout.rebuildFragments(1);
        launchActivity2.actionBarLayout.updateTitleOverlay();
        if (AndroidUtilities.isTablet()) {
            launchActivity2.layersActionBarLayout.rebuildFragments(1);
            launchActivity2.rightActionBarLayout.rebuildFragments(1);
            if (launchActivity2.layersActionBarLayout.getView().getVisibility() == 4) {
                launchActivity2.layersActionBarLayout.getView().setVisibility(0);
            }
            launchActivity2.rightActionBarLayout.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.passcodeDismissed, passcodeView);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean allowShowFingerprintDialog(PasscodeView passcodeView) {
        PasscodeViewDialog passcodeViewDialog;
        if (this.overlayPasscodeViews.isEmpty() && (passcodeViewDialog = this.passcodeDialog) != null) {
            return passcodeView == passcodeViewDialog.passcodeView;
        }
        List list = this.overlayPasscodeViews;
        return list.get(list.size() - 1) == passcodeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleIntent(Intent intent, boolean z, boolean z2, boolean z3) {
        return handleIntent(intent, z, z2, z3, null, true, false);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private boolean handleIntent(android.content.Intent r123, boolean r124, boolean r125, boolean r126, org.telegram.messenger.browser.Browser.Progress r127, boolean r128, boolean r129) {
        /*
            Method dump skipped, instructions count: 16750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.handleIntent(android.content.Intent, boolean, boolean, boolean, org.telegram.messenger.browser.Browser$Progress, boolean, boolean):boolean");
    }

    public static /* synthetic */ void $r8$lambda$KtcFdvAwoqck_Ig354C69CG5RzA(LaunchActivity launchActivity, String str) {
        if (launchActivity.actionBarLayout.getFragmentStack().isEmpty()) {
            return;
        }
        launchActivity.actionBarLayout.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(Uri.parse(str).getQueryParameter("ref")));
    }

    public static /* synthetic */ void $r8$lambda$bklYIs1kXhzCAeMbvvqBB0elvZA(LaunchActivity launchActivity, Browser.Progress progress, int[] iArr, Long l) {
        if (progress != null) {
            launchActivity.getClass();
            progress.end();
        }
        if (MessagesController.getInstance(launchActivity.currentAccount).getUserOrChat(l.longValue()) == null) {
            BaseFragment lastFragment = getLastFragment();
            if (lastFragment == null || !(lastFragment instanceof ChatActivity)) {
                return;
            }
            ((ChatActivity) lastFragment).shakeContent();
            return;
        }
        new GiftSheet(launchActivity, iArr[0], l.longValue(), null).show();
    }

    public static /* synthetic */ void $r8$lambda$j2GMg77xnTofmPW1OC5FOopP7dQ(final LaunchActivity launchActivity, final AlertDialog alertDialog, final String str, final Bundle bundle, final TL_account.sendConfirmPhoneCode sendconfirmphonecode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda61
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$mlbbl-mTuXmxxG_idsaGxgMCBmU(LaunchActivity.this, alertDialog, tL_error, str, bundle, tLObject, sendconfirmphonecode);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$mlbbl-mTuXmxxG_idsaGxgMCBmU(LaunchActivity launchActivity, AlertDialog alertDialog, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        launchActivity.getClass();
        alertDialog.dismiss();
        if (tL_error == null) {
            launchActivity.presentFragment(new LoginActivity().cancelAccountDeletion(str, bundle, (TLRPC.TL_auth_sentCode) tLObject));
        } else {
            AlertsCreator.processError(launchActivity.currentAccount, tL_error, launchActivity.getActionBarLayout().getLastFragment(), sendconfirmphonecode, new Object[0]);
        }
    }

    public static /* synthetic */ void $r8$lambda$-9M1gxwse1ksfnMQsUgYbJcJTls(final LaunchActivity launchActivity, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda72
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$dFeh6xvpvxxrEJ3oGQZStmTqLKA(LaunchActivity.this, tLObject, tL_messages_requestUrlAuth, str, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$dFeh6xvpvxxrEJ3oGQZStmTqLKA(LaunchActivity launchActivity, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        BaseFragment safeLastFragment = getSafeLastFragment();
        if (tLObject == null) {
            if (tL_error != null) {
                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    OAuthSheet.getBulletinFactory().createSimpleBulletin(R.raw.error, launchActivity.getString(R.string.BotAuthLoggedInFailTitle), launchActivity.getString(R.string.BotAuthLoggedInFailNoDomain)).show();
                    return;
                } else {
                    OAuthSheet.getBulletinFactory().showForError(tL_error);
                    return;
                }
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            OAuthSheet.handle(false, launchActivity.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            OAuthSheet.handle(false, launchActivity.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            AlertsCreator.showOpenUrlAlert(safeLastFragment, str, false, true);
        }
    }

    public static /* synthetic */ void $r8$lambda$P0oRrXFeUL3NT4gecm2lIEB0S_Q(LaunchActivity launchActivity, long j, long j2, ChatActivity chatActivity) {
        FileLog.d("LaunchActivity openForum after load " + j + " " + j2 + " TL_forumTopic " + MessagesController.getInstance(launchActivity.currentAccount).getTopicsController().findTopic(j, j2));
        if (launchActivity.actionBarLayout != null) {
            ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(-j, j2));
            launchActivity.getActionBarLayout().presentFragment(chatActivity);
        }
    }

    public static /* synthetic */ void $r8$lambda$FxhdM6pQV9yBtklMrifeF_HqZZ4(LaunchActivity launchActivity, final int[] iArr, LocationController.SharingLocationInfo sharingLocationInfo) {
        launchActivity.getClass();
        int i = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i;
        launchActivity.switchToAccount(i, true);
        LocationActivity locationActivity = new LocationActivity(2);
        locationActivity.setMessageObject(sharingLocationInfo.messageObject);
        final long dialogId = sharingLocationInfo.messageObject.getDialogId();
        locationActivity.setDelegate(new LocationActivity.LocationActivityDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda112
            @Override // org.telegram.ui.LocationActivity.LocationActivityDelegate
            public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i2, boolean z, int i3, long j) {
                SendMessagesHelper.getInstance(iArr[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, dialogId, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z, i3, 0));
            }
        });
        launchActivity.presentFragment(locationActivity);
    }

    public static /* synthetic */ void $r8$lambda$vbXJJh3cl36xmR2l1M6qyDd-QsY(LaunchActivity launchActivity) {
        if (launchActivity.actionBarLayout.getFragmentStack().isEmpty()) {
            return;
        }
        launchActivity.actionBarLayout.getFragmentStack().get(0).showDialog(new StickersAlert(launchActivity, launchActivity.importingStickersSoftware, launchActivity.importingStickers, launchActivity.importingStickersEmoji, null));
    }

    public static /* synthetic */ void $r8$lambda$SskSHm-KgKD01wwG8_g1POBiAhg(final LaunchActivity launchActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        if (tLObject != null) {
            final TL_account.Password password = (TL_account.Password) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda59
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.this.openEmailSettings(password);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$ksHaz3PmaQJ4RT7QsI69okqVoLo(LaunchActivity launchActivity, boolean z, int[] iArr, TLRPC.User user, String str, ContactsActivity contactsActivity) {
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.currentAccount).getUserFull(user.id);
        VoIPHelper.startCall(user, z, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    public static /* synthetic */ void $r8$lambda$OJseYXkkfkk58Y6LE1hZ2jGLHQo(LaunchActivity launchActivity, final ActionIntroActivity actionIntroActivity, String str) {
        launchActivity.getClass();
        final AlertDialog alertDialog = new AlertDialog(launchActivity, 3);
        alertDialog.setCanCancel(false);
        alertDialog.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.currentAccount).sendRequest(tL_auth_acceptLoginToken, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda164
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda174
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.$r8$lambda$X0rdunuIBBWow6MqpGueY3reziI(AlertDialog.this, tLObject, r3, tL_error);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$X0rdunuIBBWow6MqpGueY3reziI(AlertDialog alertDialog, TLObject tLObject, final ActionIntroActivity actionIntroActivity, final TLRPC.TL_error tL_error) {
        try {
            alertDialog.dismiss();
        } catch (Exception unused) {
        }
        if (tLObject instanceof TLRPC.TL_authorization) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda185
            @Override // java.lang.Runnable
            public final void run() {
                AlertsCreator.showSimpleAlert(ActionIntroActivity.this, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$XG6PiwjlicGFaPK4g14QM7UbDkc(LaunchActivity launchActivity, BaseFragment baseFragment, String str, String str2, AlertDialog alertDialog, int i) {
        launchActivity.getClass();
        NewContactBottomSheet newContactBottomSheet = new NewContactBottomSheet(baseFragment, launchActivity);
        newContactBottomSheet.setInitialPhoneNumber(str, false);
        if (str2 != null) {
            String[] split = str2.split(" ", 2);
            newContactBottomSheet.setInitialName(split[0], split.length > 1 ? split[1] : null);
        }
        newContactBottomSheet.show();
    }

    public void openEmailSettings(TL_account.Password password) {
        String str;
        final LoginActivity changeEmail = new LoginActivity().changeEmail(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda130
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$_WjVZWDhntEhRaG47LNg50EEprc(LaunchActivity.this);
            }
        });
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                textStyleRun.start = indexOf;
                int i = lastIndexOf + 1;
                textStyleRun.end = i;
                valueOf.setSpan(new TextStyleSpan(textStyleRun), indexOf, i, 0);
            }
            new AlertDialog.Builder(this).setTitle(valueOf).setMessage(getString(R.string.EmailLoginChangeMessage)).setPositiveButton(getString(R.string.ChangeEmail), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda131
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i2) {
                    LaunchActivity.this.presentFragment(changeEmail);
                }
            }).setNegativeButton(getString(R.string.Cancel), null).show();
            return;
        }
        presentFragment(changeEmail);
    }

    public static /* synthetic */ void $r8$lambda$_WjVZWDhntEhRaG47LNg50EEprc(LaunchActivity launchActivity) {
        launchActivity.getClass();
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(launchActivity, null);
        lottieLayout.setAnimation(R.raw.email_check_inbox, new String[0]);
        lottieLayout.textView.setText(launchActivity.getString(R.string.YourLoginEmailChangedSuccess));
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment != null) {
            Bulletin.make(lastFragment, lottieLayout, 1500).show();
            try {
                lastFragment.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public static int getTimestampFromLink(Uri uri) {
        String queryParameter;
        if (uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            queryParameter = uri.getQuery();
        } else {
            queryParameter = uri.getQueryParameter("t") != null ? uri.getQueryParameter("t") : null;
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return -1;
        }
        if (timestampPattern == null) {
            timestampPattern = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
        }
        try {
            Matcher matcher = timestampPattern.matcher(queryParameter);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                int i = 0;
                int parseInt = TextUtils.isEmpty(group) ? 0 : Integer.parseInt(group);
                int parseInt2 = TextUtils.isEmpty(group2) ? 0 : Integer.parseInt(group2);
                int parseInt3 = TextUtils.isEmpty(group3) ? 0 : Integer.parseInt(group3);
                if (!TextUtils.isEmpty(group4)) {
                    i = Integer.parseInt(group4);
                }
                return i + (parseInt3 * 60) + (parseInt2 * 3600) + (parseInt * 86400);
            }
        } catch (Throwable unused) {
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused2) {
            if (!queryParameter.contains(":")) {
                return -1;
            }
            String[] split = queryParameter.split(":");
            try {
                return Integer.parseInt(split.length - 1 < 0 ? "0" : split[split.length - 1]) + (Integer.parseInt(split.length - 2 < 0 ? "0" : split[split.length - 2]) * 60) + (Integer.parseInt(split.length - 3 < 0 ? "0" : split[split.length - 3]) * 3600) + (Integer.parseInt(split.length - 4 >= 0 ? split[split.length - 4] : "0") * 86400);
            } catch (Exception e) {
                FileLog.e(e);
                return -1;
            }
        }
    }

    private void openDialogsToSend(boolean z) {
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("canSelectTopics", true);
        bundle.putInt("dialogsType", 3);
        bundle.putBoolean("allowSwitchAccount", true);
        ArrayList arrayList2 = this.contactsToSend;
        if (arrayList2 != null) {
            if (arrayList2.size() != 1) {
                bundle.putString("selectAlertString", LocaleController.getString(R.string.SendMessagesToText));
                bundle.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
            }
        } else {
            bundle.putString("selectAlertString", LocaleController.getString(R.string.SendMessagesToText));
            bundle.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendMessagesToGroupText));
        }
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(this);
        if (this.videoPath != null || ((arrayList = this.photoPathsArray) != null && !arrayList.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.photoPathsArray;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(ChatActivity.createEntriesFromMedia(this.photoPathsArray, false, null));
            }
            String str = this.videoPath;
            if (str != null) {
                arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L));
            }
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(this.sendingText)) {
                    ((MediaController.PhotoEntry) arrayList3.get(0)).caption = this.sendingText;
                }
                dialogsActivity.setSharedMedia(arrayList3, this.sendingText);
            }
        } else if (!TextUtils.isEmpty(this.sendingText)) {
            String extractFirstUrl = ShareTopView.extractFirstUrl(this.sendingText);
            if (extractFirstUrl != null) {
                dialogsActivity.setSharedLink(extractFirstUrl, this.sendingText);
            } else {
                CharSequence charSequence = this.sendingText;
                dialogsActivity.setSharedText(charSequence, charSequence);
            }
        }
        getActionBarLayout().presentFragment(dialogsActivity, !AndroidUtilities.isTablet() ? this.actionBarLayout.getFragmentStack().size() <= 1 || !(this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity) : this.layersActionBarLayout.getFragmentStack().isEmpty() || !(this.layersActionBarLayout.getFragmentStack().get(this.layersActionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity), !z, true, false);
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
            SecretMediaViewer.getInstance().closePhoto(false, false);
        } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(false, true);
        } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
            ArticleViewer.getInstance().close(false, true);
        }
        StoryRecorder.destroyInstance();
        GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.dismiss();
        }
        if (z || !AndroidUtilities.isTablet()) {
            return;
        }
        this.actionBarLayout.rebuildFragments(1);
        this.rightActionBarLayout.rebuildFragments(1);
    }

    private int runCommentRequest(int i, Runnable runnable, Integer num, Integer num2, Long l, Integer num3, TLRPC.Chat chat) {
        return runCommentRequest(i, runnable, num, num2, l, num3, null, chat, null, null, 0, -1);
    }

    private int runCommentRequest(final int i, final Runnable runnable, final Integer num, final Integer num2, final Long l, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable2, final String str, final int i2, final int i3) {
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = num2 != null ? num.intValue() : (int) l.longValue();
        return ConnectionsManager.getInstance(i).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda123
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.$r8$lambda$BmYV1XhBFqSHmH-gy-0EzR1HiTM(LaunchActivity.this, i, chat, l, num2, num, runnable2, str, num3, bArr, i2, i3, tL_messages_getDiscussionMessage, runnable, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$BmYV1XhBFqSHmH-gy-0EzR1HiTM(final LaunchActivity launchActivity, final int i, final TLRPC.Chat chat, final Long l, final Integer num, final Integer num2, final Runnable runnable, final String str, final Integer num3, final byte[] bArr, final int i2, final int i3, final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final Runnable runnable2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda154
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$YQG96Nhd9_b1ySwuJG7WBJeVtoY(LaunchActivity.this, tLObject, i, chat, l, num, num2, runnable, str, num3, bArr, i2, i3, tL_messages_getDiscussionMessage, runnable2);
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(5:3|(1:5)|6|7|(4:14|(3:16|(1:18)(1:32)|19)(3:33|(1:(1:36)(1:(1:39)(1:40)))(1:(1:(1:43)(1:(1:45)(1:46))))|37)|(2:30|31)|(2:22|28)(1:29)))|47|48|(1:50)|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0130, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013b A[Catch: Exception -> 0x013f, TRY_LEAVE, TryCatch #1 {Exception -> 0x013f, blocks: (B:31:0x0136, B:22:0x013b), top: B:30:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$YQG96Nhd9_b1ySwuJG7WBJeVtoY(LaunchActivity launchActivity, TLObject tLObject, int i, TLRPC.Chat chat, Long l, Integer num, Integer num2, Runnable runnable, String str, Integer num3, byte[] bArr, int i2, int i3, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, Runnable runnable2) {
        launchActivity.getClass();
        if (tLObject instanceof TLRPC.TL_messages_discussionMessage) {
            TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = (TLRPC.TL_messages_discussionMessage) tLObject;
            MessagesController.getInstance(i).putUsers(tL_messages_discussionMessage.users, false);
            MessagesController.getInstance(i).putChats(tL_messages_discussionMessage.chats, false);
            ArrayList arrayList = new ArrayList();
            int size = tL_messages_discussionMessage.messages.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new MessageObject(UserConfig.selectedAccount, tL_messages_discussionMessage.messages.get(i4), true, true));
            }
            if (!arrayList.isEmpty() || (chat.forum && l != null && l.longValue() == 1)) {
                if (chat.forum) {
                    launchActivity.openTopicRequest(i, (int) l.longValue(), chat, (num != null ? num : num2).intValue(), null, runnable, str, num3, bArr, i2, arrayList, i3);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -((MessageObject) arrayList.get(0)).getDialogId());
                    bundle.putInt("message_id", Math.max(1, num2.intValue()));
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    chatActivity.setThreadMessages(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
                    if (num != null) {
                        if (bArr != null) {
                            chatActivity.highlightPollOptionId = bArr;
                            chatActivity.setHighlightMessageId(num.intValue());
                        } else if (str != null) {
                            chatActivity.setHighlightQuote(num.intValue(), str, i3);
                        } else {
                            chatActivity.highlightTaskId = num3;
                            chatActivity.setHighlightMessageId(num.intValue());
                        }
                    } else if (l != null) {
                        if (bArr != null) {
                            chatActivity.highlightPollOptionId = bArr;
                            chatActivity.setHighlightMessageId(num2.intValue());
                        } else if (str != null) {
                            chatActivity.setHighlightQuote(num2.intValue(), str, i3);
                        } else {
                            chatActivity.highlightTaskId = num3;
                            chatActivity.setHighlightMessageId(num2.intValue());
                        }
                    }
                    launchActivity.presentFragment(chatActivity);
                }
                if (runnable2 != null) {
                    try {
                        runnable2.run();
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                if (runnable == null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        if (!launchActivity.mainFragmentsStack.isEmpty()) {
            ArrayList arrayList2 = launchActivity.mainFragmentsStack;
            BulletinFactory.of((BaseFragment) arrayList2.get(arrayList2.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.ChannelPostDeleted)).show();
        }
        if (runnable2 != null) {
        }
        if (runnable == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void openTopicRequest(final int i, int i2, final TLRPC.Chat chat, final int i3, TLRPC.TL_forumTopic tL_forumTopic, final Runnable runnable, final String str, final Integer num, final byte[] bArr, final int i4, final ArrayList arrayList, final int i5) {
        final int i6;
        TLRPC.TL_forumTopic tL_forumTopic2;
        BaseFragment baseFragment;
        ArrayList arrayList2;
        if (tL_forumTopic == null) {
            i6 = i2;
            tL_forumTopic2 = MessagesController.getInstance(i).getTopicsController().findTopic(chat.id, i6);
        } else {
            i6 = i2;
            tL_forumTopic2 = tL_forumTopic;
        }
        if (tL_forumTopic2 == null) {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
            tL_messages_getForumTopicsByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-chat.id);
            tL_messages_getForumTopicsByID.topics.add(Integer.valueOf(i6));
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda165
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LaunchActivity.$r8$lambda$jVRvbplEgn4IsvHBuCKPakUxnFg(LaunchActivity.this, i, chat, i6, i3, runnable, str, num, bArr, i4, arrayList, i5, tLObject, tL_error);
                }
            });
            return;
        }
        if (this.mainFragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            ArrayList arrayList3 = this.mainFragmentsStack;
            baseFragment = (BaseFragment) arrayList3.get(arrayList3.size() - 1);
        }
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            if (chatActivity.getDialogId() == (-chat.id) && chatActivity.isTopic && chatActivity.getTopicId() == tL_forumTopic2.id) {
                if (str != null) {
                    chatActivity.setHighlightQuote(i3, str, i5);
                }
                chatActivity.highlightTaskId = num;
                chatActivity.scrollToMessageId(i3, i4, true, 0, true, 0, null, null);
                if (runnable == null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i3 != tL_forumTopic2.id) {
            bundle.putInt("message_id", Math.max(1, i3));
        }
        if (num != null) {
            bundle.putInt("task_id", num.intValue());
        }
        ChatActivity chatActivity2 = new ChatActivity(bundle);
        if (arrayList.isEmpty()) {
            TLRPC.Message message = new TLRPC.Message();
            message.id = 1;
            message.action = new TLRPC.TL_messageActionChannelMigrateFrom();
            arrayList2 = arrayList;
            arrayList2.add(new MessageObject(i, message, false, false));
        } else {
            arrayList2 = arrayList;
        }
        chatActivity2.setThreadMessages(arrayList2, chat, i3, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i3 != tL_forumTopic2.id) {
            if (str != null) {
                chatActivity2.setHighlightQuote(i3, str, i5);
            } else {
                chatActivity2.highlightTaskId = num;
                chatActivity2.setHighlightMessageId(i3);
            }
            chatActivity2.scrollToMessageId(i3, i4, true, 0, true, 0, null, null);
        }
        presentFragment(chatActivity2);
        if (runnable == null) {
        }
    }

    public static /* synthetic */ void $r8$lambda$jVRvbplEgn4IsvHBuCKPakUxnFg(final LaunchActivity launchActivity, final int i, final TLRPC.Chat chat, final int i2, final int i3, final Runnable runnable, final String str, final Integer num, final byte[] bArr, final int i4, final ArrayList arrayList, final int i5, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda178
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$YqbPB6xbZPq1UEs3FaOHAXFmAAw(LaunchActivity.this, tL_error, tLObject, i, chat, i2, i3, runnable, str, num, bArr, i4, arrayList, i5);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$YqbPB6xbZPq1UEs3FaOHAXFmAAw(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, TLRPC.Chat chat, int i2, int i3, Runnable runnable, String str, Integer num, byte[] bArr, int i4, ArrayList arrayList, int i5) {
        launchActivity.getClass();
        if (tL_error == null) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i6 = 0; i6 < tL_messages_forumTopics.messages.size(); i6++) {
                longSparseArray.put(tL_messages_forumTopics.messages.get(i6).id, tL_messages_forumTopics.messages.get(i6));
            }
            MessagesController.getInstance(i).putUsers(tL_messages_forumTopics.users, false);
            MessagesController.getInstance(i).putChats(tL_messages_forumTopics.chats, false);
            MessagesController.getInstance(i).getTopicsController().processTopics(chat.id, tL_messages_forumTopics.topics, longSparseArray, false, 2, -1);
            launchActivity.openTopicRequest(i, i2, chat, i3, MessagesController.getInstance(i).getTopicsController().findTopic(chat.id, i2), runnable, str, num, bArr, i4, arrayList, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r8 = new java.io.BufferedReader(new java.io.InputStreamReader(r0));
        r5 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r6 = r8.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r6 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 >= 100) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r5.append(r6);
        r5.append('\n');
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        r4 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        r0.closeEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String readImport(Uri uri) {
        InputStream inputStream;
        String fixFileName = FileLoader.fixFileName(MediaController.getFileName(uri));
        int i = 0;
        InputStream inputStream2 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        String str = null;
        if (fixFileName != null && fixFileName.endsWith(".zip")) {
            try {
                ZipInputStream zipInputStream = new ZipInputStream(getContentResolver().openInputStream(uri));
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    while (true) {
                        if (nextEntry == null) {
                            break;
                        }
                        String name = nextEntry.getName();
                        if (name == null) {
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            int lastIndexOf = name.lastIndexOf("/");
                            if (lastIndexOf >= 0) {
                                name = name.substring(lastIndexOf + 1);
                            }
                            if (name.endsWith(".txt")) {
                                try {
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    zipInputStream.close();
                                    return null;
                                }
                            }
                            nextEntry = zipInputStream.getNextEntry();
                        }
                    }
                } finally {
                }
            } catch (Exception e2) {
                try {
                    FileLog.e(e2);
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                return str;
            }
        } else {
            try {
                inputStream = getContentResolver().openInputStream(uri);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null || i >= 100) {
                                break;
                            }
                            sb.append(readLine);
                            sb.append('\n');
                            i++;
                        }
                        String sb2 = sb.toString();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                return sb2;
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                        }
                        return sb2;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception e5) {
                                FileLog.e(e5);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    FileLog.e(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    return null;
                }
            } catch (Exception e8) {
                e = e8;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private void runImportRequest(final Uri uri, ArrayList arrayList) {
        final int i = UserConfig.selectedAccount;
        final AlertDialog alertDialog = new AlertDialog(this, 3);
        final int[] iArr = {0};
        String readImport = readImport(uri);
        if (readImport == null) {
            return;
        }
        TLRPC.TL_messages_checkHistoryImport tL_messages_checkHistoryImport = new TLRPC.TL_messages_checkHistoryImport();
        tL_messages_checkHistoryImport.import_head = readImport;
        iArr[0] = ConnectionsManager.getInstance(i).sendRequest(tL_messages_checkHistoryImport, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda62
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.$r8$lambda$emKEWY_QPcXrlEyYgHtQM-QrHI8(LaunchActivity.this, uri, i, alertDialog, tLObject, tL_error);
            }
        });
        final Runnable runnable = null;
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda63
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                LaunchActivity.$r8$lambda$VZAaUMjN6E3NqCTXQ3h4wXTBJCY(i, iArr, runnable, dialogInterface);
            }
        });
        try {
            alertDialog.showDelayed(300L);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void $r8$lambda$emKEWY_QPcXrlEyYgHtQM-QrHI8(final LaunchActivity launchActivity, final Uri uri, final int i, final AlertDialog alertDialog, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda120
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$1FELCmW2EMWQVJKV7gWxqAgyvrY(LaunchActivity.this, tLObject, uri, i, alertDialog);
            }
        }, 2L);
    }

    public static /* synthetic */ void $r8$lambda$1FELCmW2EMWQVJKV7gWxqAgyvrY(LaunchActivity launchActivity, TLObject tLObject, Uri uri, int i, AlertDialog alertDialog) {
        boolean z;
        if (launchActivity.isFinishing()) {
            return;
        }
        if (tLObject != null && launchActivity.actionBarLayout != null) {
            TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putString("importTitle", tL_messages_historyImportParsed.title);
            bundle.putBoolean("allowSwitchAccount", true);
            if (tL_messages_historyImportParsed.pm) {
                bundle.putInt("dialogsType", 12);
            } else if (tL_messages_historyImportParsed.group) {
                bundle.putInt("dialogsType", 11);
            } else {
                String uri2 = uri.toString();
                Iterator<String> it = MessagesController.getInstance(i).exportPrivateUri.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (uri2.contains(it.next())) {
                        bundle.putInt("dialogsType", 12);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Iterator<String> it2 = MessagesController.getInstance(i).exportGroupUri.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (uri2.contains(it2.next())) {
                            bundle.putInt("dialogsType", 11);
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        bundle.putInt("dialogsType", 13);
                    }
                }
            }
            if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
                SecretMediaViewer.getInstance().closePhoto(false, false);
            } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
                PhotoViewer.getInstance().closePhoto(false, true);
            } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
                ArticleViewer.getInstance().close(false, true);
            }
            StoryRecorder.destroyInstance();
            GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
            if (groupCallActivity != null) {
                groupCallActivity.dismiss();
            }
            if (AndroidUtilities.isTablet()) {
                launchActivity.actionBarLayout.rebuildFragments(1);
                launchActivity.rightActionBarLayout.rebuildFragments(1);
            }
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(launchActivity);
            launchActivity.getActionBarLayout().presentFragment(dialogsActivity, !AndroidUtilities.isTablet() ? launchActivity.actionBarLayout.getFragmentStack().size() <= 1 || !(launchActivity.actionBarLayout.getFragmentStack().get(launchActivity.actionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity) : launchActivity.layersActionBarLayout.getFragmentStack().isEmpty() || !(launchActivity.layersActionBarLayout.getFragmentStack().get(launchActivity.layersActionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity), false, true, false);
        } else {
            if (launchActivity.documentsUrisArray == null) {
                launchActivity.documentsUrisArray = new ArrayList();
            }
            launchActivity.documentsUrisArray.add(0, launchActivity.exportingChatUri);
            launchActivity.exportingChatUri = null;
            launchActivity.openDialogsToSend(true);
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$VZAaUMjN6E3NqCTXQ3h4wXTBJCY(int i, int[] iArr, Runnable runnable, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void openMessage(final long j, final int i, final String str, final Browser.Progress progress, int i2, final int i3, final Integer num, final byte[] bArr) {
        BaseFragment baseFragment;
        TLRPC.Chat chat;
        if (j < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j))) != null && ChatObject.isForum(chat)) {
            if (progress != null) {
                progress.init();
            }
            openForumFromLink(j, Integer.valueOf(i), str, num, bArr, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda145
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$ZQkYyW7VMas9w9nlFUFEBEYpJxA(Browser.Progress.this);
                }
            }, i2, i3);
            return;
        }
        if (progress != null) {
            progress.init();
        }
        final Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            long j2 = -j;
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2));
            if (chat2 != null && chat2.forum) {
                openForumFromLink(j, Integer.valueOf(i), str, num, bArr, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda146
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.$r8$lambda$XRXtU1WgKRmPfPHe76sbDecUuNw(Browser.Progress.this);
                    }
                }, i2, i3);
                return;
            }
            bundle.putLong("chat_id", j2);
        }
        bundle.putInt("message_id", i);
        if (this.mainFragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            baseFragment = (BaseFragment) this.mainFragmentsStack.get(r1.size() - 1);
        }
        final BaseFragment baseFragment2 = baseFragment;
        if (baseFragment2 == null || MessagesController.getInstance(this.currentAccount).checkCanOpenChat(bundle, baseFragment2)) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda147
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$jGKfRNqAOZfMm3pJDAKuWsmnux4(LaunchActivity.this, bundle, bArr, i, num, str, i3, j, progress, baseFragment2);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$ZQkYyW7VMas9w9nlFUFEBEYpJxA(Browser.Progress progress) {
        if (progress != null) {
            progress.end();
        }
    }

    public static /* synthetic */ void $r8$lambda$XRXtU1WgKRmPfPHe76sbDecUuNw(Browser.Progress progress) {
        if (progress != null) {
            progress.end();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$jGKfRNqAOZfMm3pJDAKuWsmnux4(final LaunchActivity launchActivity, final Bundle bundle, final byte[] bArr, final int i, final Integer num, String str, int i2, final long j, final Browser.Progress progress, final BaseFragment baseFragment) {
        final String str2;
        final int i3;
        launchActivity.getClass();
        final ChatActivity chatActivity = new ChatActivity(bundle);
        if (bArr != null) {
            chatActivity.highlightPollOptionId = bArr;
            chatActivity.setHighlightMessageId(i);
        } else if (num != null) {
            chatActivity.highlightTaskId = num;
            chatActivity.setHighlightMessageId(i);
        } else {
            str2 = str;
            i3 = i2;
            chatActivity.setHighlightQuote(i, str2, i3);
            if (!(!AndroidUtilities.isTablet() ? launchActivity.rightActionBarLayout : launchActivity.getActionBarLayout()).presentFragment(chatActivity) || j >= 0) {
                if (progress == null) {
                    progress.end();
                    return;
                }
                return;
            }
            TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = -j;
            tL_channels_getChannels.id.add(tL_inputChannel);
            final int sendRequest = ConnectionsManager.getInstance(launchActivity.currentAccount).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda171
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LaunchActivity.$r8$lambda$Xq2uTB1KR_8zr7OekF3scLzsa3o(LaunchActivity.this, progress, j, i, num, bArr, baseFragment, bundle, chatActivity, str2, i3, tLObject, tL_error);
                }
            });
            if (progress != null) {
                progress.onCancel(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda172
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConnectionsManager.getInstance(LaunchActivity.this.currentAccount).cancelRequest(sendRequest, true);
                    }
                });
                return;
            }
            return;
        }
        str2 = str;
        i3 = i2;
        if ((!AndroidUtilities.isTablet() ? launchActivity.rightActionBarLayout : launchActivity.getActionBarLayout()).presentFragment(chatActivity)) {
        }
        if (progress == null) {
        }
    }

    public static /* synthetic */ void $r8$lambda$Xq2uTB1KR_8zr7OekF3scLzsa3o(final LaunchActivity launchActivity, final Browser.Progress progress, final long j, final int i, final Integer num, final byte[] bArr, final BaseFragment baseFragment, final Bundle bundle, final ChatActivity chatActivity, final String str, final int i2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda177
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$swVyFNNqZwT6zrgiJr40OpqK9Ng(LaunchActivity.this, progress, tLObject, j, i, num, bArr, baseFragment, bundle, chatActivity, str, i2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$swVyFNNqZwT6zrgiJr40OpqK9Ng(LaunchActivity launchActivity, Browser.Progress progress, TLObject tLObject, long j, int i, Integer num, byte[] bArr, BaseFragment baseFragment, Bundle bundle, ChatActivity chatActivity, String str, int i2) {
        launchActivity.getClass();
        if (progress != null) {
            progress.end();
        }
        if (tLObject instanceof TLRPC.TL_messages_chats) {
            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
            if (!tL_messages_chats.chats.isEmpty()) {
                MessagesController.getInstance(launchActivity.currentAccount).putChats(tL_messages_chats.chats, false);
                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                if (chat != null && chat.forum) {
                    launchActivity.openForumFromLink(-j, Integer.valueOf(i), null, num, bArr, null, 0, -1);
                }
                if (baseFragment == null || MessagesController.getInstance(launchActivity.currentAccount).checkCanOpenChat(bundle, baseFragment)) {
                    ChatActivity chatActivity2 = new ChatActivity(bundle);
                    chatActivity.setHighlightQuote(i, str, i2);
                    launchActivity.getActionBarLayout().presentFragment(chatActivity2);
                    return;
                }
                return;
            }
        }
        launchActivity.showAlertDialog(AlertsCreator.createNoAccessAlert(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void runLinkRequest(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final String str26, final String str27, final Browser.Progress progress, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final String str28, final String str29, final boolean z5, final String str30, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str31, final Integer num3, final boolean z11, final byte[] bArr) {
        final int[] iArr;
        final AlertDialog alertDialog;
        Runnable runnable;
        char c;
        final AlertDialog alertDialog2;
        BaseFragment baseFragment;
        final Runnable runnable2;
        WallpapersListActivity.ColorWallpaper colorWallpaper;
        EmojiPacksAlert emojiPacksAlert;
        StickersAlert stickersAlert;
        if (i2 == 0 && UserConfig.getActivatedAccountsCount() >= 2 && hashMap != null) {
            AlertsCreator.createAccountSelectDialog(this, new AlertsCreator.AccountSelectDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda74
                @Override // org.telegram.ui.Components.AlertsCreator.AccountSelectDelegate
                public final void didSelectAccount(int i7) {
                    LaunchActivity.$r8$lambda$1b1_yUsMLIPUze1quyMrqrcgqME(LaunchActivity.this, i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i3, str23, str24, str25, str26, str27, progress, z3, i4, z4, i5, i6, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr, i7);
                }
            }).show();
            return;
        }
        final int i7 = i;
        final Browser.Progress progress2 = progress;
        if (str16 != null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i8 = NotificationCenter.didReceiveSmsCode;
            if (globalInstance.hasObservers(i8)) {
                NotificationCenter.getGlobalInstance().postNotificationName(i8, str16);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(LocaleController.getString(R.string.AppName));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OtherLoginCode, str16)));
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
            showAlertDialog(builder);
            return;
        }
        if (str17 != null) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setTitle(LocaleController.getString(R.string.AuthAnotherClient));
            builder2.setMessage(LocaleController.getString(R.string.AuthAnotherClientUrl));
            builder2.setPositiveButton(LocaleController.getString(R.string.OK), null);
            showAlertDialog(builder2);
            return;
        }
        final AlertDialog alertDialog3 = new AlertDialog(this, 3);
        final Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda85
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$Wvkj0mq9f__0fBrmV-_PPQkSvCs(Browser.Progress.this, alertDialog3);
            }
        };
        final int[] iArr2 = {0};
        if (str10 != null) {
            TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
            tL_contacts_importContactToken.token = str10;
            iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_importContactToken, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda91
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LaunchActivity.$r8$lambda$FBTXyYDbyr2zcz99nywrivT5sTY(LaunchActivity.this, i7, str10, runnable3, tLObject, tL_error);
                }
            });
        } else if (str11 != null) {
            TL_chatlists.TL_chatlists_checkChatlistInvite tL_chatlists_checkChatlistInvite = new TL_chatlists.TL_chatlists_checkChatlistInvite();
            tL_chatlists_checkChatlistInvite.slug = str11;
            iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(tL_chatlists_checkChatlistInvite, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda92
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LaunchActivity.$r8$lambda$q2Uf98ro_fi7F94dTKHXaRQJUbk(LaunchActivity.this, i7, str11, runnable3, tLObject, tL_error);
                }
            });
        } else if (str29 != null) {
            iArr2[0] = GiftAuctionController.getInstance(this.currentAccount).requestGiftAuctionBySlug(str29, new Utilities.Callback2() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda93
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    LaunchActivity.$r8$lambda$tBItb7ZxWjTexhf6JLfAYQf0RME(LaunchActivity.this, runnable3, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                }
            });
        } else if (str28 != null) {
            iArr2[0] = GiftAuctionController.getInstance(this.currentAccount).requestGiftAuctionBySlug(str28, new Utilities.Callback2() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda94
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    LaunchActivity.$r8$lambda$8DMaFpxmsAoUTpjevDV-IMT1oog(LaunchActivity.this, runnable3, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                }
            });
        } else if (str19 != null) {
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = str19;
            iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(getuniquestargift, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda95
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LaunchActivity.$r8$lambda$XAHPM8g5xbUONQC56qAIsAEv4l0(LaunchActivity.this, i7, str19, runnable3, tLObject, tL_error);
                }
            });
        } else {
            if (str18 != null) {
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                final TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = str18;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                iArr2[0] = ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda96
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LaunchActivity.$r8$lambda$fUgs1k0ItlszO5iaFO4Mk-26QlA(LaunchActivity.this, tL_inputInvoiceSlug, runnable3, i7, str18, tLObject, tL_error);
                    }
                });
                i7 = i;
                alertDialog2 = alertDialog3;
                c = 0;
                runnable = null;
                runnable2 = runnable;
                if (iArr2[c] != 0) {
                    alertDialog2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda89
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            LaunchActivity.$r8$lambda$b8_jE36SgVCmV2pCHxxTTVUeQKg(i7, iArr2, runnable2, dialogInterface);
                        }
                    });
                    if (progress2 != null) {
                        progress2.onCancel(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda90
                            @Override // java.lang.Runnable
                            public final void run() {
                                LaunchActivity.$r8$lambda$TM6JX28wzkzxsvR5ekD00J0O4F0(i7, iArr2, runnable2);
                            }
                        });
                    }
                    try {
                        if (progress2 != null) {
                            progress2.init();
                        } else {
                            alertDialog2.showDelayed(300L);
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            if (str != null) {
                if (progress2 != null) {
                    progress2.init();
                }
                UserNameResolver userNameResolver = MessagesController.getInstance(i).getUserNameResolver();
                i7 = i;
                iArr = iArr2;
                alertDialog = alertDialog3;
                com.google.android.exoplayer2.util.Consumer consumer = new com.google.android.exoplayer2.util.Consumer() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda97
                    @Override // com.google.android.exoplayer2.util.Consumer
                    public final void accept(Object obj) {
                        LaunchActivity.$r8$lambda$yXlYTGjbPgf1ftYN4L9did6mFKw(LaunchActivity.this, runnable3, z4, i4, i5, str13, str21, z2, str22, str26, i7, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, i2, i3, str23, str24, str25, progress2, z3, i6, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr, str27, iArr, (Long) obj);
                    }
                };
                progress2 = progress2;
                userNameResolver.resolve(str, str31, consumer);
            } else {
                String str32 = str3;
                iArr = iArr2;
                alertDialog = alertDialog3;
                if (str2 == null) {
                    runnable = null;
                    if (str32 != null) {
                        if (this.mainFragmentsStack.isEmpty()) {
                            return;
                        }
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = str32;
                        ArrayList arrayList = this.mainFragmentsStack;
                        BaseFragment baseFragment2 = (BaseFragment) arrayList.get(arrayList.size() - 1);
                        if (baseFragment2 instanceof ChatActivity) {
                            ChatActivity chatActivity = (ChatActivity) baseFragment2;
                            stickersAlert = new StickersAlert(this, baseFragment2, tL_inputStickerSetShortName, null, chatActivity.getChatActivityEnterViewForStickers(), chatActivity.getResourceProvider(), false);
                            stickersAlert.setCalcMandatoryInsets(chatActivity.isKeyboardVisible());
                        } else {
                            stickersAlert = new StickersAlert(this, baseFragment2, tL_inputStickerSetShortName, null, null, false);
                        }
                        stickersAlert.probablyEmojis = str4 != null;
                        baseFragment2.showDialog(stickersAlert);
                        return;
                    }
                    if (str4 != null) {
                        if (this.mainFragmentsStack.isEmpty()) {
                            return;
                        }
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
                        if (str32 == null) {
                            str32 = str4;
                        }
                        tL_inputStickerSetShortName2.short_name = str32;
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(tL_inputStickerSetShortName2);
                        ArrayList arrayList3 = this.mainFragmentsStack;
                        BaseFragment baseFragment3 = (BaseFragment) arrayList3.get(arrayList3.size() - 1);
                        if (baseFragment3 instanceof ChatActivity) {
                            ChatActivity chatActivity2 = (ChatActivity) baseFragment3;
                            emojiPacksAlert = new EmojiPacksAlert(baseFragment3, this, chatActivity2.getResourceProvider(), arrayList2);
                            emojiPacksAlert.setCalcMandatoryInsets(chatActivity2.isKeyboardVisible());
                        } else {
                            emojiPacksAlert = new EmojiPacksAlert(baseFragment3, this, null, arrayList2);
                        }
                        baseFragment3.showDialog(emojiPacksAlert);
                        return;
                    }
                    if (str9 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("onlySelect", true);
                        bundle.putInt("dialogsType", 3);
                        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
                        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda76
                            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                            public /* synthetic */ boolean canSelectStories() {
                                return DialogsActivity.DialogsActivityDelegate.-CC.$default$canSelectStories(this);
                            }

                            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList4, CharSequence charSequence, boolean z12, boolean z13, int i9, int i10, TopicsFragment topicsFragment) {
                                return LaunchActivity.$r8$lambda$AVrpjPGBBcjmhOq1Ko7IvhplP4E(LaunchActivity.this, z, i, str9, dialogsActivity2, arrayList4, charSequence, z12, z13, i9, i10, topicsFragment);
                            }

                            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                            public /* synthetic */ boolean didSelectStories(DialogsActivity dialogsActivity2) {
                                return DialogsActivity.DialogsActivityDelegate.-CC.$default$didSelectStories(this, dialogsActivity2);
                            }
                        });
                        c = 0;
                        presentFragment(dialogsActivity, false, true);
                        i7 = i;
                    } else {
                        c = 0;
                        if (hashMap != null) {
                            long longValue = Utilities.parseLong((String) hashMap.get("bot_id")).longValue();
                            if (longValue == 0) {
                                return;
                            }
                            final String str33 = (String) hashMap.get("payload");
                            final String str34 = (String) hashMap.get("nonce");
                            final String str35 = (String) hashMap.get("callback_url");
                            final TL_account.getAuthorizationForm getauthorizationform = new TL_account.getAuthorizationForm();
                            getauthorizationform.bot_id = longValue;
                            getauthorizationform.scope = (String) hashMap.get("scope");
                            getauthorizationform.public_key = (String) hashMap.get("public_key");
                            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(getauthorizationform, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda77
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    LaunchActivity.$r8$lambda$90iQfbq4f5TDEiRQE6hj2E1O5y4(LaunchActivity.this, iArr, i, runnable3, getauthorizationform, str33, str34, str35, tLObject, tL_error);
                                }
                            });
                        } else if (str15 != null) {
                            TLRPC.TL_help_getDeepLinkInfo tL_help_getDeepLinkInfo = new TLRPC.TL_help_getDeepLinkInfo();
                            tL_help_getDeepLinkInfo.path = str15;
                            iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getDeepLinkInfo, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda78
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    LaunchActivity.$r8$lambda$Ro6UGIYBh6umRgI-jM0l9mHaVZ8(LaunchActivity.this, runnable3, tLObject, tL_error);
                                }
                            });
                        } else if (str14 != null) {
                            TLRPC.TL_langpack_getLanguage tL_langpack_getLanguage = new TLRPC.TL_langpack_getLanguage();
                            tL_langpack_getLanguage.lang_code = str14;
                            tL_langpack_getLanguage.lang_pack = "android";
                            iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_langpack_getLanguage, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda79
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    LaunchActivity.$r8$lambda$DYQb4Mgb6DcqBDPXE0EOqa7ZUMw(LaunchActivity.this, runnable3, tLObject, tL_error);
                                }
                            });
                        } else if (tL_wallPaper != null) {
                            if (TextUtils.isEmpty(tL_wallPaper.slug)) {
                                try {
                                    TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                                    int i9 = wallPaperSettings.third_background_color;
                                    if (i9 != 0) {
                                        colorWallpaper = new WallpapersListActivity.ColorWallpaper("c", wallPaperSettings.background_color, wallPaperSettings.second_background_color, i9, wallPaperSettings.fourth_background_color);
                                    } else {
                                        colorWallpaper = new WallpapersListActivity.ColorWallpaper("c", wallPaperSettings.background_color, wallPaperSettings.second_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false));
                                    }
                                    final ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(colorWallpaper, null, true, false);
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda80
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            LaunchActivity.this.presentFragment(themePreviewActivity);
                                        }
                                    });
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = tL_wallPaper.slug;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpaper, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda81
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    LaunchActivity.$r8$lambda$gjbEng6lKRjnK0jkEdg0k213Glw(LaunchActivity.this, runnable3, tL_wallPaper, tLObject, tL_error);
                                }
                            });
                        } else if (str20 != null) {
                            Runnable runnable4 = new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda82
                                @Override // java.lang.Runnable
                                public final void run() {
                                    LaunchActivity.$r8$lambda$RDGbpXTA-by6blh4WjXhYlXdrzE(LaunchActivity.this, progress2);
                                }
                            };
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.format = "android";
                            TLRPC.TL_inputThemeSlug tL_inputThemeSlug = new TLRPC.TL_inputThemeSlug();
                            tL_inputThemeSlug.slug = str20;
                            gettheme.theme = tL_inputThemeSlug;
                            alertDialog2 = alertDialog;
                            iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettheme, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda83
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    LaunchActivity.$r8$lambda$8o6qztisjUWaFehHIvxkHpOs3z4(LaunchActivity.this, alertDialog2, runnable3, tLObject, tL_error);
                                }
                            });
                            i7 = i;
                            runnable2 = runnable4;
                            iArr2 = iArr;
                            if (iArr2[c] != 0) {
                            }
                        } else {
                            alertDialog2 = alertDialog;
                            if (l == null || (num == null && !z5)) {
                                i7 = i;
                                iArr2 = iArr;
                                if (str30 != null) {
                                    TL_account.resolveBusinessChatLink resolvebusinesschatlink = new TL_account.resolveBusinessChatLink();
                                    resolvebusinesschatlink.slug = str30;
                                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(resolvebusinesschatlink, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda88
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            LaunchActivity.$r8$lambda$w14zS2k4vqUMscyFFuuHaFvJ-wE(LaunchActivity.this, tLObject, tL_error);
                                        }
                                    });
                                }
                            } else {
                                if (l2 != null) {
                                    TLRPC.Chat chat = MessagesController.getInstance(i).getChat(l);
                                    if (chat != null) {
                                        iArr[0] = runCommentRequest(i, runnable3, num, num2, l2, num3, chat);
                                    } else {
                                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                                        tL_inputChannel.channel_id = l.longValue();
                                        tL_channels_getChannels.id.add(tL_inputChannel);
                                        iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda84
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                LaunchActivity.$r8$lambda$seqAGN02m3Envl6a3uP1JRO4G6k(LaunchActivity.this, iArr, i, runnable3, num, num2, l2, num3, tLObject, tL_error);
                                            }
                                        });
                                    }
                                } else {
                                    final Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", l.longValue());
                                    if (num != null) {
                                        bundle2.putInt("message_id", num.intValue());
                                    }
                                    if (num3 != null) {
                                        bundle2.putInt("task_id", num3.intValue());
                                    }
                                    if (bArr != null) {
                                        bundle2.putByteArray("poll_option_id", bArr);
                                    }
                                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(l);
                                    if (chat2 != null && ChatObject.isBoostSupported(chat2) && z5) {
                                        processBoostDialog(Long.valueOf(-l.longValue()), runnable3, progress2);
                                    } else if (chat2 != null && chat2.forum) {
                                        openForumFromLink(-l.longValue(), num, null, num3, bArr, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda86
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                LaunchActivity.$r8$lambda$XNe2F-LqGs0mRlipvOGxRBN2nig(runnable3);
                                            }
                                        }, 0, -1);
                                    } else {
                                        if (this.mainFragmentsStack.isEmpty()) {
                                            baseFragment = null;
                                        } else {
                                            ArrayList arrayList4 = this.mainFragmentsStack;
                                            baseFragment = (BaseFragment) arrayList4.get(arrayList4.size() - 1);
                                        }
                                        if (baseFragment == null || MessagesController.getInstance(i).checkCanOpenChat(bundle2, baseFragment)) {
                                            final BaseFragment baseFragment4 = baseFragment;
                                            iArr2 = iArr;
                                            i7 = i;
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda87
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    LaunchActivity.$r8$lambda$5vJApXAPSDtKi583nPviPu5yl8Q(LaunchActivity.this, bundle2, l, iArr, runnable3, z5, progress2, l2, num, num3, bArr, baseFragment4, i);
                                                }
                                            });
                                        }
                                    }
                                }
                                i7 = i;
                                iArr2 = iArr;
                            }
                        }
                        i7 = i;
                    }
                    iArr2 = iArr;
                    alertDialog2 = alertDialog;
                } else if (i2 == 0) {
                    TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                    tL_messages_checkChatInvite.hash = str2;
                    iArr[0] = ConnectionsManager.getInstance(i).sendRequest(tL_messages_checkChatInvite, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda98
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            LaunchActivity.$r8$lambda$0Rv2Fhvgz35KPuWwsuhPfcAwN1s(LaunchActivity.this, i, alertDialog, runnable3, str2, tLObject, tL_error);
                        }
                    }, 2);
                    i7 = i;
                } else {
                    if (i2 == 1) {
                        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                        tL_messages_importChatInvite.hash = str2;
                        runnable = null;
                        ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_importChatInvite, null, new Utilities.Callback2() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda75
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                LaunchActivity.$r8$lambda$divvYjw3YmYwb2XnSTDy5__LR64(LaunchActivity.this, runnable3, i, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                            }
                        }, 2);
                    } else {
                        runnable = null;
                    }
                    i7 = i;
                    iArr2 = iArr;
                    alertDialog2 = alertDialog;
                    c = 0;
                }
                runnable2 = runnable;
                if (iArr2[c] != 0) {
                }
            }
            iArr2 = iArr;
            alertDialog2 = alertDialog;
            c = 0;
            runnable = null;
            runnable2 = runnable;
            if (iArr2[c] != 0) {
            }
        }
        alertDialog2 = alertDialog3;
        c = 0;
        runnable = null;
        runnable2 = runnable;
        if (iArr2[c] != 0) {
        }
    }

    public static /* synthetic */ void $r8$lambda$1b1_yUsMLIPUze1quyMrqrcgqME(LaunchActivity launchActivity, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l, Long l2, Integer num2, String str13, HashMap hashMap, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, String str23, String str24, String str25, String str26, String str27, Browser.Progress progress, boolean z3, int i3, boolean z4, int i4, int i5, String str28, String str29, boolean z5, String str30, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str31, Integer num3, boolean z11, byte[] bArr, int i6) {
        LaunchActivity launchActivity2;
        if (i6 != i) {
            launchActivity2 = launchActivity;
            launchActivity2.switchToAccount(i6, true);
        } else {
            launchActivity2 = launchActivity;
        }
        launchActivity2.runLinkRequest(i6, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, 1, i2, str23, str24, str25, str26, str27, progress, z3, i3, z4, i4, i5, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr);
    }

    public static /* synthetic */ void $r8$lambda$Wvkj0mq9f__0fBrmV-_PPQkSvCs(Browser.Progress progress, AlertDialog alertDialog) {
        if (progress != null) {
            progress.end();
        }
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public static /* synthetic */ void $r8$lambda$FBTXyYDbyr2zcz99nywrivT5sTY(final LaunchActivity launchActivity, final int i, final String str, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda119
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$jYGLcbemxOutcvd6AcPfeEzBt18(LaunchActivity.this, tLObject, i, str, tL_error, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$jYGLcbemxOutcvd6AcPfeEzBt18(LaunchActivity launchActivity, TLObject tLObject, int i, String str, TLRPC.TL_error tL_error, Runnable runnable) {
        launchActivity.getClass();
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            MessagesController.getInstance(i).putUser(user, false);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            launchActivity.presentFragment(new ChatActivity(bundle));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("cant import contact token. token=");
            sb.append(str);
            sb.append(" err=");
            sb.append(tL_error == null ? null : tL_error.text);
            FileLog.e(sb.toString());
            BulletinFactory.of((BaseFragment) launchActivity.mainFragmentsStack.get(r1.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.NoUsernameFound)).show();
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$q2Uf98ro_fi7F94dTKHXaRQJUbk(final LaunchActivity launchActivity, final int i, final String str, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda127
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$TSnPBEqsCp8vZ1csbddX8rbSbno(LaunchActivity.this, tLObject, i, str, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$TSnPBEqsCp8vZ1csbddX8rbSbno(LaunchActivity launchActivity, TLObject tLObject, int i, String str, Runnable runnable) {
        ArrayList<TLRPC.Chat> arrayList;
        ArrayList<TLRPC.User> arrayList2;
        BaseFragment baseFragment = (BaseFragment) launchActivity.mainFragmentsStack.get(r5.size() - 1);
        if (tLObject instanceof TL_chatlists.chatlist_ChatlistInvite) {
            TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject;
            boolean z = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
            if (z) {
                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                arrayList = tL_chatlists_chatlistInvite.chats;
                arrayList2 = tL_chatlists_chatlistInvite.users;
            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                arrayList = tL_chatlists_chatlistInviteAlready.chats;
                arrayList2 = tL_chatlists_chatlistInviteAlready.users;
            } else {
                arrayList = null;
                arrayList2 = null;
            }
            MessagesController.getInstance(i).putChats(arrayList, false);
            MessagesController.getInstance(i).putUsers(arrayList2, false);
            if (!z || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                FolderBottomSheet folderBottomSheet = new FolderBottomSheet(baseFragment, str, chatlist_chatlistinvite);
                if (baseFragment != null) {
                    baseFragment.showDialog(folderBottomSheet);
                } else {
                    folderBottomSheet.show();
                }
            } else {
                BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString(R.string.NoFolderFound)).show();
            }
        } else {
            BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString(R.string.NoFolderFound)).show();
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$tBItb7ZxWjTexhf6JLfAYQf0RME(LaunchActivity launchActivity, Runnable runnable, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.of((BaseFragment) launchActivity.mainFragmentsStack.get(r9.size() - 1)).createSimpleBulletin(R.raw.error, launchActivity.getString(R.string.GiftAuctionNotFound)).show();
        } else if (tL_StarGiftAuctionState != null) {
            GiftAuctionController.Auction auction = GiftAuctionController.getInstance(launchActivity.currentAccount).getAuction(tL_StarGiftAuctionState.gift.id);
            if (auction != null) {
                new StarGiftPreviewSheet(launchActivity, null, launchActivity.currentAccount, auction.gift.title, auction.previewAttributes, false).show();
            }
        } else {
            launchActivity.getClass();
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$8DMaFpxmsAoUTpjevDV-IMT1oog(LaunchActivity launchActivity, Runnable runnable, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.of((BaseFragment) launchActivity.mainFragmentsStack.get(r10.size() - 1)).createSimpleBulletin(R.raw.error, launchActivity.getString(R.string.GiftAuctionNotFound)).show();
        } else if (tL_StarGiftAuctionState != null) {
            AuctionJoinSheet.show(launchActivity, (Theme.ResourcesProvider) null, launchActivity.currentAccount, 0L, tL_StarGiftAuctionState.gift.id, (Runnable) null);
        } else {
            launchActivity.getClass();
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$XAHPM8g5xbUONQC56qAIsAEv4l0(final LaunchActivity launchActivity, final int i, final String str, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda133
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$pg82FGNoDXuswz7Iv6dSMTknTkQ(LaunchActivity.this, tL_error, tLObject, i, str, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$pg82FGNoDXuswz7Iv6dSMTknTkQ(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, String str, Runnable runnable) {
        launchActivity.getClass();
        if (tL_error != null) {
            BaseFragment safeLastFragment = getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.fire_on, launchActivity.getString(R.string.UniqueGiftNotFoundBurned)).show();
            } else {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, launchActivity.getString(R.string.UniqueGiftNotFound)).show();
            }
        } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(launchActivity.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(launchActivity.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            BaseFragment safeLastFragment2 = getSafeLastFragment();
            TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                StarGiftSheet starGiftSheet = new StarGiftSheet(launchActivity, i, 0L, null).set(str, (TL_stars.TL_starGiftUnique) starGift, null);
                if (safeLastFragment2 != null) {
                    if (safeLastFragment2.getLastStoryViewer() != null && safeLastFragment2.getLastStoryViewer().isFullyVisible()) {
                        safeLastFragment2.getLastStoryViewer().showDialog(starGiftSheet);
                    } else {
                        safeLastFragment2.showDialog(starGiftSheet);
                    }
                } else {
                    starGiftSheet.show();
                }
            }
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$fUgs1k0ItlszO5iaFO4Mk-26QlA(final LaunchActivity launchActivity, final TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, final Runnable runnable, final int i, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda137
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$5tueuJXYhqB3B3bgNul4OU_ud-M(LaunchActivity.this, tL_error, tLObject, tL_inputInvoiceSlug, runnable, i, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$5tueuJXYhqB3B3bgNul4OU_ud-M(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, final Runnable runnable, int i, String str) {
        PaymentFormActivity paymentFormActivity;
        if (tL_error != null) {
            launchActivity.getClass();
            if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error.text)) {
                BulletinFactory.of((BaseFragment) launchActivity.mainFragmentsStack.get(r6.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid)).show();
            } else {
                BulletinFactory.of((BaseFragment) launchActivity.mainFragmentsStack.get(r6.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.PaymentInvoiceLinkInvalid)).show();
            }
        } else if (!launchActivity.isFinishing()) {
            if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                final Runnable runnable2 = launchActivity.navigateToPremiumGiftCallback;
                launchActivity.navigateToPremiumGiftCallback = null;
                StarsController.getInstance(launchActivity.currentAccount).openPaymentForm(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda141
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.$r8$lambda$ocIXHVEoedOxciyh_BA8wPlh9rw(runnable);
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda142
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        LaunchActivity.$r8$lambda$2G-e-tBTAp-xSqGJbgnqyvBtaK0(runnable2, (String) obj);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC.PaymentForm) {
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                MessagesController.getInstance(i).putUsers(paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(paymentForm, str, launchActivity.getActionBarLayout().getLastFragment());
            } else {
                paymentFormActivity = tLObject instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                final Runnable runnable3 = launchActivity.navigateToPremiumGiftCallback;
                if (runnable3 != null) {
                    launchActivity.navigateToPremiumGiftCallback = null;
                    paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda143
                        @Override // org.telegram.ui.PaymentFormActivity.PaymentFormCallback
                        public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                            LaunchActivity.$r8$lambda$4l-XYP_0mw3pVJ5Dyug1d5PCoIo(runnable3, invoiceStatus);
                        }
                    });
                }
                launchActivity.presentFragment(paymentFormActivity);
            }
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$ocIXHVEoedOxciyh_BA8wPlh9rw(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$2G-e-tBTAp-xSqGJbgnqyvBtaK0(Runnable runnable, String str) {
        if (runnable == null || !"paid".equals(str)) {
            return;
        }
        runnable.run();
    }

    public static /* synthetic */ void $r8$lambda$4l-XYP_0mw3pVJ5Dyug1d5PCoIo(Runnable runnable, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            runnable.run();
        }
    }

    public static /* synthetic */ void $r8$lambda$yXlYTGjbPgf1ftYN4L9did6mFKw(final LaunchActivity launchActivity, final Runnable runnable, final boolean z, final int i, final int i2, final String str, final String str2, final boolean z2, final String str3, final String str4, final int i3, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final String str13, final String str14, final String str15, final String str16, final boolean z3, final Integer num, final Long l, final Long l2, final Integer num2, final HashMap hashMap, final String str17, final String str18, final String str19, final String str20, final TLRPC.TL_wallPaper tL_wallPaper, final String str21, final String str22, final String str23, final int i4, final int i5, final String str24, final String str25, final String str26, final Browser.Progress progress, final boolean z4, final int i6, final String str27, final String str28, final boolean z5, final String str29, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str30, final Integer num3, final boolean z11, final byte[] bArr, final String str31, int[] iArr, final Long l3) {
        final Runnable runnable2;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        byte[] bArr2;
        long j;
        TLRPC.User user;
        int i7;
        int i8;
        String str37;
        long j2;
        long j3;
        boolean z12;
        boolean z13;
        BaseFragment baseFragment;
        final TLRPC.User user2;
        if (l3 != null) {
            launchActivity.getClass();
            if (l3.longValue() == Long.MAX_VALUE) {
                try {
                    runnable.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                new AlertDialog.Builder(launchActivity, null).setTitle(LocaleController.getString(R.string.AffiliateLinkExpiredTitle)).setMessage(LocaleController.getString(R.string.AffiliateLinkExpiredText)).setNegativeButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
        }
        if (launchActivity.isFinishing()) {
            return;
        }
        if (z && l3 != null) {
            MessagesController.getInstance(launchActivity.currentAccount).getStoriesController().resolveLiveStoryLink(l3.longValue(), new com.google.android.exoplayer2.util.Consumer() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda103
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    LaunchActivity.$r8$lambda$EKHLt88XnKGkdcM9Ths98am_A_o(LaunchActivity.this, runnable, l3, (TL_stories.StoryItem) obj);
                }
            });
            return;
        }
        if (i != 0 && l3 != null) {
            MessagesController.getInstance(launchActivity.currentAccount).getStoriesController().resolveStoryLink(l3.longValue(), i, new com.google.android.exoplayer2.util.Consumer() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda104
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    LaunchActivity.$r8$lambda$zYvaDOB43AH2RJCfprgKWc6l81U(LaunchActivity.this, runnable, l3, (TL_stories.StoryItem) obj);
                }
            });
            return;
        }
        if (i2 != 0 && l3 != null) {
            MessagesController.getInstance(launchActivity.currentAccount).getStoriesController().resolveStoryAlbumLink(l3.longValue(), i2, new com.google.android.exoplayer2.util.Consumer() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda105
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    LaunchActivity.$r8$lambda$ZDOTUIMFYA8z2RmrXCsM9XODhP8(LaunchActivity.this, runnable, l3, i2, (TL_stories.TL_storyAlbum) obj);
                }
            });
            return;
        }
        if (l3 != null && launchActivity.actionBarLayout != null && ((str == null && str2 == null) || ((str != null && l3.longValue() > 0) || ((str2 != null && l3.longValue() > 0) || ((z2 && l3.longValue() < 0) || (str3 != null && l3.longValue() < 0)))))) {
            if (!TextUtils.isEmpty(str4) && (user2 = MessagesController.getInstance(i3).getUser(l3)) != null && user2.bot) {
                if (user2.bot_attach_menu && !MediaDataController.getInstance(i3).botInAttachMenu(user2.id)) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(i3).getInputUser(l3.longValue());
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda106
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            LaunchActivity.$r8$lambda$c011pomATnucppcEdJqaPouAT7k(LaunchActivity.this, i3, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z3, num, l, l2, num2, str, hashMap, str17, str18, str19, str20, tL_wallPaper, str21, str22, str23, str2, z2, str3, i4, i5, str24, str25, str26, progress, z4, i, z, i2, i6, str27, str28, z5, str29, z6, z7, z8, z9, z10, str30, num3, z11, bArr, l3, str4, str31, user2, runnable, tLObject, tL_error);
                        }
                    });
                    return;
                }
                launchActivity.processWebAppBot(i3, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z3, num, l, l2, num2, str, hashMap, str17, str18, str19, str20, tL_wallPaper, str21, str22, str23, str2, z2, str3, i4, i5, str24, str25, str26, str4, str31, progress, z4, i, false, i2, i6, z5, str29, user2, runnable, false, false, z6, z7, z8, z9, z10, str30, z11);
                return;
            }
            if (z5 && ChatObject.isBoostSupported(MessagesController.getInstance(i3).getChat(Long.valueOf(-l3.longValue())))) {
                launchActivity.processBoostDialog(l3, runnable, progress);
                return;
            }
            if (str31 != null) {
                TLRPC.User user3 = MessagesController.getInstance(i3).getUser(l3);
                if (user3 != null && user3.bot) {
                    MessagesController.getInstance(i3).openApp(null, user3, str31, 0, progress, z6, z7);
                }
            } else if (str24 != null && str25 == null) {
                TLRPC.User user4 = MessagesController.getInstance(i3).getUser(l3);
                if (user4 != null && user4.bot) {
                    if (user4.bot_attach_menu) {
                        launchActivity.processAttachMenuBot(i3, l3.longValue(), str26, user4, str24, str31);
                    } else {
                        ArrayList arrayList = launchActivity.mainFragmentsStack;
                        BulletinFactory.of((BaseFragment) arrayList.get(arrayList.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.BotCantAddToAttachMenu)).show();
                    }
                } else {
                    ArrayList arrayList2 = launchActivity.mainFragmentsStack;
                    BulletinFactory.of((BaseFragment) arrayList2.get(arrayList2.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.BotSetAttachLinkNotBot)).show();
                }
            } else if (num != null && ((num2 != null || l2 != null) && l3.longValue() < 0)) {
                int runCommentRequest = launchActivity.runCommentRequest(i3, runnable, num, num2, l2, null, MessagesController.getInstance(i3).getChat(Long.valueOf(-l3.longValue())));
                iArr[0] = runCommentRequest;
                if (runCommentRequest != 0) {
                    return;
                }
            } else if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("cantSendToChannels", true);
                bundle.putInt("dialogsType", 1);
                bundle.putString("selectAlertString", LocaleController.getString(R.string.SendGameToText));
                bundle.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendGameToGroupText));
                DialogsActivity dialogsActivity = new DialogsActivity(bundle);
                final TLRPC.User user5 = MessagesController.getInstance(i3).getUser(l3);
                dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda107
                    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                    public /* synthetic */ boolean canSelectStories() {
                        return DialogsActivity.DialogsActivityDelegate.-CC.$default$canSelectStories(this);
                    }

                    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                    public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList3, CharSequence charSequence, boolean z14, boolean z15, int i9, int i10, TopicsFragment topicsFragment) {
                        return LaunchActivity.$r8$lambda$NKLzs-QEjwrak18C-Yg3MOZaOdI(LaunchActivity.this, str, i3, user5, dialogsActivity2, arrayList3, charSequence, z14, z15, i9, i10, topicsFragment);
                    }

                    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                    public /* synthetic */ boolean didSelectStories(DialogsActivity dialogsActivity2) {
                        return DialogsActivity.DialogsActivityDelegate.-CC.$default$didSelectStories(this, dialogsActivity2);
                    }
                });
                launchActivity.getActionBarLayout().presentFragment(dialogsActivity, !AndroidUtilities.isTablet() ? launchActivity.actionBarLayout.getFragmentStack().size() <= 1 || !(launchActivity.actionBarLayout.getFragmentStack().get(launchActivity.actionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity) : launchActivity.layersActionBarLayout.getFragmentStack().isEmpty() || !(launchActivity.layersActionBarLayout.getFragmentStack().get(launchActivity.layersActionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity), true, true, false);
                if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
                    SecretMediaViewer.getInstance().closePhoto(false, false);
                } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
                    PhotoViewer.getInstance().closePhoto(false, true);
                } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
                    ArticleViewer.getInstance().close(false, true);
                }
                StoryRecorder.destroyInstance();
                GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                if (groupCallActivity != null) {
                    groupCallActivity.dismiss();
                }
                if (AndroidUtilities.isTablet()) {
                    launchActivity.actionBarLayout.rebuildFragments(1);
                    launchActivity.rightActionBarLayout.rebuildFragments(1);
                }
            } else if (str10 != null || str11 != null) {
                final TLRPC.User user6 = MessagesController.getInstance(i3).getUser(l3);
                if (user6 == null || (user6.bot && user6.bot_nochats)) {
                    try {
                        if (launchActivity.mainFragmentsStack.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList3 = launchActivity.mainFragmentsStack;
                        BulletinFactory.of((BaseFragment) arrayList3.get(arrayList3.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.BotCantJoinGroups)).show();
                        return;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlySelect", true);
                bundle2.putInt("dialogsType", 2);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("closeFragment", false);
                bundle2.putBoolean("allowGroups", str10 != null);
                bundle2.putBoolean("allowChannels", str11 != null);
                String str38 = TextUtils.isEmpty(str10) ? TextUtils.isEmpty(str11) ? null : str11 : str10;
                final DialogsActivity dialogsActivity2 = new DialogsActivity(bundle2);
                final String str39 = str38;
                dialogsActivity2.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda110
                    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                    public /* synthetic */ boolean canSelectStories() {
                        return DialogsActivity.DialogsActivityDelegate.-CC.$default$canSelectStories(this);
                    }

                    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                    public final boolean didSelectDialogs(DialogsActivity dialogsActivity3, ArrayList arrayList4, CharSequence charSequence, boolean z14, boolean z15, int i9, int i10, TopicsFragment topicsFragment) {
                        return LaunchActivity.$r8$lambda$DkrKcjzFumY7hla92PKOilJSaUQ(LaunchActivity.this, i3, user6, str12, str39, dialogsActivity2, dialogsActivity3, arrayList4, charSequence, z14, z15, i9, i10, topicsFragment);
                    }

                    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                    public /* synthetic */ boolean didSelectStories(DialogsActivity dialogsActivity3) {
                        return DialogsActivity.DialogsActivityDelegate.-CC.$default$didSelectStories(this, dialogsActivity3);
                    }
                });
                launchActivity.presentFragment(dialogsActivity2);
            } else {
                Bundle bundle3 = new Bundle();
                TLRPC.User user7 = MessagesController.getInstance(i3).getUser(l3);
                if (l3.longValue() < 0) {
                    final TLRPC.Chat chat = MessagesController.getInstance(i3).getChat(Long.valueOf(-l3.longValue()));
                    if (z11 && chat.linked_monoforum_id != 0) {
                        if (MessagesController.getInstance(i3).getChat(Long.valueOf(chat.linked_monoforum_id)) == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = MessagesController.getInputChannel(chat);
                            ConnectionsManager.getInstance(i3).sendRequest(tL_channels_getFullChannel, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda108
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    LaunchActivity.$r8$lambda$ADSsFZ8xbfJ6ouER5a9oDvJ8WFI(LaunchActivity.this, i3, chat, runnable, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z3, num, l, l2, num2, str, hashMap, str17, str18, str19, str20, tL_wallPaper, str21, str22, str23, str2, z2, str3, i4, i5, str24, str25, str26, str4, str31, progress, z4, i, z, i2, i6, str27, str28, z5, str29, z6, z7, z8, z9, z10, str30, num3, z11, bArr, tLObject, tL_error);
                                }
                            });
                            return;
                        }
                        runnable2 = runnable;
                        str32 = str2;
                        str33 = str3;
                        i7 = i5;
                        str35 = str24;
                        str36 = str25;
                        i8 = i6;
                        bArr2 = bArr;
                        user = user7;
                        j = 0;
                        str34 = str9;
                        bundle3.putLong("chat_id", chat.linked_monoforum_id);
                        j3 = -chat.linked_monoforum_id;
                    } else {
                        runnable2 = runnable;
                        str32 = str2;
                        str33 = str3;
                        str34 = str9;
                        i7 = i5;
                        str35 = str24;
                        str36 = str25;
                        i8 = i6;
                        bArr2 = bArr;
                        user = user7;
                        j = 0;
                        bundle3.putLong("chat_id", -l3.longValue());
                        j3 = l3.longValue();
                    }
                    str37 = "chat_id";
                } else {
                    runnable2 = runnable;
                    str32 = str2;
                    str33 = str3;
                    str34 = str9;
                    String str40 = str16;
                    str35 = str24;
                    str36 = str25;
                    bArr2 = bArr;
                    j = 0;
                    user = user7;
                    i7 = i5;
                    i8 = i6;
                    bundle3.putLong("user_id", l3.longValue());
                    long longValue = l3.longValue();
                    str37 = "chat_id";
                    if (str40 != null) {
                        if (str40.startsWith("@")) {
                            StringBuilder sb = new StringBuilder();
                            j2 = longValue;
                            sb.append(" ");
                            sb.append(str40);
                            str40 = sb.toString();
                        } else {
                            j2 = longValue;
                        }
                        bundle3.putString("start_text", str40);
                    } else {
                        j2 = longValue;
                    }
                    j3 = j2;
                }
                if (str34 == null || user == null || !user.bot) {
                    z12 = false;
                } else {
                    bundle3.putString("botUser", str34);
                    z12 = true;
                }
                if (launchActivity.navigateToPremiumBot) {
                    launchActivity.navigateToPremiumBot = false;
                    z13 = z12;
                    bundle3.putBoolean("premium_bot", true);
                } else {
                    z13 = z12;
                }
                if (num != null) {
                    bundle3.putInt("message_id", num.intValue());
                    if (num3 != null) {
                        bundle3.putInt("task_id", num3.intValue());
                    }
                    if (bArr2 != null) {
                        bundle3.putByteArray("poll_option_id", bArr2);
                    }
                }
                if (str32 != null) {
                    bundle3.putString("voicechat", str32);
                }
                if (z2) {
                    bundle3.putBoolean("videochat", true);
                }
                if (str33 != null) {
                    bundle3.putString("livestream", str33);
                }
                if (i7 >= 0) {
                    bundle3.putInt("video_timestamp", i7);
                }
                if (str36 != null) {
                    bundle3.putString("attach_bot", str36);
                }
                if (str35 != null) {
                    bundle3.putString("attach_bot_start_command", str35);
                }
                if (launchActivity.mainFragmentsStack.isEmpty() || str32 != null) {
                    baseFragment = null;
                } else {
                    ArrayList arrayList4 = launchActivity.mainFragmentsStack;
                    baseFragment = (BaseFragment) arrayList4.get(arrayList4.size() - 1);
                }
                if (baseFragment == null || MessagesController.getInstance(i3).checkCanOpenChat(bundle3, baseFragment)) {
                    boolean z14 = (baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getDialogId() == j3;
                    if (z13 && z14) {
                        ((ChatActivity) baseFragment).setBotUser(str34);
                    } else if (str36 != null && z14) {
                        ((ChatActivity) baseFragment).openAttachBotLayout(str36);
                    } else {
                        long j4 = -j3;
                        TLRPC.Chat chat2 = MessagesController.getInstance(launchActivity.currentAccount).getChat(Long.valueOf(j4));
                        if (z9 || i8 > 0) {
                            String str41 = str37;
                            try {
                                runnable.run();
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                            if (launchActivity.isFinishing()) {
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            if (l3.longValue() < j) {
                                bundle4.putLong(str41, -l3.longValue());
                            } else {
                                bundle4.putLong("user_id", l3.longValue());
                            }
                            if (i8 > 0) {
                                bundle4.putBoolean("open_gifts", true);
                                bundle4.putInt("open_gifts_collection", i8);
                                if (l3.longValue() == UserConfig.getInstance(launchActivity.currentAccount).getClientUserId()) {
                                    bundle4.putBoolean("my_profile", true);
                                }
                            }
                            launchActivity.getActionBarLayout().presentFragment(new ProfileActivity(bundle4));
                            return;
                        }
                        if (chat2 != null && chat2.forum) {
                            Long valueOf = (l2 != null || num == null) ? l2 : Long.valueOf(num.intValue());
                            if (valueOf != null && valueOf.longValue() != j) {
                                launchActivity.openForumFromLink(j3, num, null, num3, bArr, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda109
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        LaunchActivity.$r8$lambda$vL7GFgscDDuyMsnutvW_ffLiAlk(runnable2);
                                    }
                                }, 0, -1);
                                return;
                            }
                            Bundle bundle5 = new Bundle();
                            bundle5.putLong(str37, j4);
                            if (str32 != null) {
                                bundle5.putString("voicechat", str32);
                            }
                            if (z2) {
                                bundle5.putBoolean("videochat", true);
                            }
                            launchActivity.presentFragment(TopicsFragment.getTopicsOrChat(launchActivity, bundle5));
                            try {
                                runnable2.run();
                                return;
                            } catch (Exception e4) {
                                FileLog.e(e4);
                                return;
                            }
                        }
                        MessagesController.getInstance(i3).ensureMessagesLoaded(j3, num == null ? 0 : num.intValue(), launchActivity.new 14(runnable2, str33, baseFragment, j3, num, bundle3));
                        return;
                    }
                }
            }
        } else {
            try {
                BaseFragment lastFragment = getLastFragment();
                if (lastFragment != null) {
                    if (lastFragment instanceof ChatActivity) {
                        ((ChatActivity) lastFragment).shakeContent();
                    }
                    if (AndroidUtilities.isNumeric(str5)) {
                        BulletinFactory.of(lastFragment).createErrorBulletin(LocaleController.getString(R.string.NoPhoneFound)).show();
                    } else {
                        BulletinFactory.of(lastFragment).createErrorBulletin(LocaleController.getString(R.string.NoUsernameFound)).show();
                    }
                }
            } catch (Exception e5) {
                FileLog.e(e5);
            }
        }
        try {
            runnable.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static /* synthetic */ void $r8$lambda$EKHLt88XnKGkdcM9Ths98am_A_o(LaunchActivity launchActivity, Runnable runnable, Long l, TL_stories.StoryItem storyItem) {
        launchActivity.getClass();
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        BaseFragment lastFragment = getLastFragment();
        if (storyItem == null) {
            BulletinFactory global = BulletinFactory.global();
            if (global != null) {
                global.createSimpleBulletin(R.raw.story_bomb2, LocaleController.getString(R.string.StoryNotFound)).show();
                return;
            }
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            BulletinFactory global2 = BulletinFactory.global();
            if (global2 != null) {
                global2.createSimpleBulletin(R.raw.story_bomb1, LocaleController.getString(R.string.StoryNotFound)).show();
                return;
            }
            return;
        }
        if (lastFragment != null) {
            storyItem.dialogId = l.longValue();
            StoryViewer createOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
            createOverlayStoryViewer.instantClose();
            createOverlayStoryViewer.open(launchActivity, storyItem, (StoryViewer.PlaceProvider) null);
        }
    }

    public static /* synthetic */ void $r8$lambda$zYvaDOB43AH2RJCfprgKWc6l81U(LaunchActivity launchActivity, Runnable runnable, Long l, TL_stories.StoryItem storyItem) {
        launchActivity.getClass();
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        BaseFragment lastFragment = getLastFragment();
        if (storyItem == null) {
            BulletinFactory global = BulletinFactory.global();
            if (global != null) {
                global.createSimpleBulletin(R.raw.story_bomb2, LocaleController.getString(R.string.StoryNotFound)).show();
                return;
            }
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            BulletinFactory global2 = BulletinFactory.global();
            if (global2 != null) {
                global2.createSimpleBulletin(R.raw.story_bomb1, LocaleController.getString(R.string.StoryNotFound)).show();
                return;
            }
            return;
        }
        if (lastFragment != null) {
            storyItem.dialogId = l.longValue();
            StoryViewer createOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
            createOverlayStoryViewer.instantClose();
            createOverlayStoryViewer.open(launchActivity, storyItem, (StoryViewer.PlaceProvider) null);
        }
    }

    public static /* synthetic */ void $r8$lambda$ZDOTUIMFYA8z2RmrXCsM9XODhP8(LaunchActivity launchActivity, Runnable runnable, Long l, int i, TL_stories.TL_storyAlbum tL_storyAlbum) {
        launchActivity.getClass();
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        getLastFragment();
        if (tL_storyAlbum == null) {
            BulletinFactory global = BulletinFactory.global();
            if (global != null) {
                global.createSimpleBulletin(R.raw.story_bomb2, LocaleController.getString(R.string.StoryAlbumNotFound)).show();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        if (l.longValue() > 0) {
            bundle.putLong("user_id", l.longValue());
            bundle.putBoolean("my_profile", l.longValue() == UserConfig.getInstance(launchActivity.currentAccount).getClientUserId());
        } else {
            bundle.putLong("chat_id", -l.longValue());
        }
        bundle.putInt("open_story_album_id", i);
        launchActivity.presentFragment(new ProfileActivity(bundle));
    }

    public static /* synthetic */ void $r8$lambda$c011pomATnucppcEdJqaPouAT7k(final LaunchActivity launchActivity, final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final Browser.Progress progress, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final String str26, final String str27, final boolean z5, final String str28, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str29, final Integer num3, final boolean z11, final byte[] bArr, final Long l3, final String str30, final String str31, final TLRPC.User user, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda155
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$PhJ6O_5WbRoYsdHXOiTsmY5YSO0(LaunchActivity.this, tL_error, i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, progress, z3, i4, z4, i5, i6, str26, str27, z5, str28, z6, z7, z8, z9, z10, str29, num3, z11, bArr, tLObject, l3, str30, str31, user, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$PhJ6O_5WbRoYsdHXOiTsmY5YSO0(final LaunchActivity launchActivity, TLRPC.TL_error tL_error, final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final Browser.Progress progress, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final String str26, final String str27, final boolean z5, final String str28, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str29, final Integer num3, final boolean z11, final byte[] bArr, TLObject tLObject, final Long l3, final String str30, final String str31, final TLRPC.User user, final Runnable runnable) {
        launchActivity.getClass();
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda168
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.this.runLinkRequest(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, null, null, progress, z3, i4, z4, i5, i6, str26, str27, z5, str28, z6, z7, z8, z9, z10, str29, num3, z11, bArr);
                }
            });
            return;
        }
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            final TLRPC.TL_attachMenuBot tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject).bot;
            final boolean z12 = tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu);
            if ((tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) && z12) {
                WebAppDisclaimerAlert.show(launchActivity, new com.google.android.exoplayer2.util.Consumer() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda169
                    @Override // com.google.android.exoplayer2.util.Consumer
                    public final void accept(Object obj) {
                        LaunchActivity.$r8$lambda$BA8Z5A6m9F9svJanAsgPusbnFhc(LaunchActivity.this, tL_attachMenuBot, i, l3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str30, str31, progress, z3, i4, i5, i6, z5, str28, user, runnable, z12, z6, z7, z8, z9, z10, str29, z11, (Boolean) obj);
                    }
                }, null, progress != null ? new ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda14(progress) : null);
            } else if (tL_attachMenuBot.request_write_access || z3) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                AlertsCreator.createBotLaunchAlert(getLastFragment(), atomicBoolean, user, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda170
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.$r8$lambda$PQHg5hU36GQq1AUxVADzSrLPlL8(LaunchActivity.this, l3, tL_attachMenuBot, atomicBoolean, i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str30, str31, progress, z3, i4, i5, i6, z5, str28, user, runnable, z6, z7, z8, z9, z10, str29, z11);
                    }
                });
            } else {
                launchActivity.processWebAppBot(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str30, str31, progress, z3, i4, false, i5, i6, z5, str28, user, runnable, false, false, z6, z7, z8, z9, z10, str29, z11);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$BA8Z5A6m9F9svJanAsgPusbnFhc(LaunchActivity launchActivity, TLRPC.TL_attachMenuBot tL_attachMenuBot, final int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l2, Long l3, Integer num2, String str13, HashMap hashMap, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, int i3, String str23, String str24, String str25, String str26, String str27, Browser.Progress progress, boolean z3, int i4, int i5, int i6, boolean z4, String str28, TLRPC.User user, Runnable runnable, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str29, boolean z11, Boolean bool) {
        launchActivity.getClass();
        tL_attachMenuBot.inactive = false;
        tL_attachMenuBot.request_write_access = false;
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i).getInputUser(l.longValue());
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda181
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda184
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.$r8$lambda$f1hwps9oc9oZgPLVuduSZ37xuTU(TLObject.this, r2);
                    }
                });
            }
        }, 66);
        launchActivity.processWebAppBot(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l2, l3, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str26, str27, progress, z3, i4, false, i5, i6, z4, str28, user, runnable, z5, true, z6, z7, z8, z9, z10, str29, z11);
    }

    public static /* synthetic */ void $r8$lambda$f1hwps9oc9oZgPLVuduSZ37xuTU(TLObject tLObject, int i) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            MediaDataController.getInstance(i).loadAttachMenuBots(false, true, null);
        }
    }

    public static /* synthetic */ void $r8$lambda$PQHg5hU36GQq1AUxVADzSrLPlL8(LaunchActivity launchActivity, Long l, TLRPC.TL_attachMenuBot tL_attachMenuBot, AtomicBoolean atomicBoolean, final int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l2, Long l3, Integer num2, String str13, HashMap hashMap, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, int i3, String str23, String str24, String str25, String str26, String str27, Browser.Progress progress, boolean z3, int i4, int i5, int i6, boolean z4, String str28, TLRPC.User user, Runnable runnable, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str29, boolean z10) {
        SharedPrefsHelper.setWebViewConfirmShown(launchActivity.currentAccount, l.longValue(), true);
        tL_attachMenuBot.inactive = false;
        tL_attachMenuBot.request_write_access = !atomicBoolean.get();
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i).getInputUser(l.longValue());
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda180
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda187
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.$r8$lambda$_93IPlECPsCPG-NtcyKC13VJ6ag(TLObject.this, r2);
                    }
                });
            }
        }, 66);
        launchActivity.processWebAppBot(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l2, l3, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str26, str27, progress, z3, i4, false, i5, i6, z4, str28, user, runnable, false, false, z5, z6, z7, z8, z9, str29, z10);
    }

    public static /* synthetic */ void $r8$lambda$_93IPlECPsCPG-NtcyKC13VJ6ag(TLObject tLObject, int i) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            MediaDataController.getInstance(i).loadAttachMenuBots(false, true, null);
        }
    }

    public static /* synthetic */ boolean $r8$lambda$NKLzs-QEjwrak18C-Yg3MOZaOdI(LaunchActivity launchActivity, String str, int i, TLRPC.User user, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
        launchActivity.getClass();
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
        TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
        tL_inputMediaGame.id = tL_inputGameShortName;
        tL_inputGameShortName.short_name = str;
        tL_inputGameShortName.bot_id = MessagesController.getInstance(i).getInputUser(user);
        SendMessagesHelper.getInstance(i).sendGame(MessagesController.getInstance(i).getInputPeer(j), tL_inputMediaGame, 0L, 0L);
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j));
        } else if (DialogObject.isUserDialog(j)) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        if (MessagesController.getInstance(i).checkCanOpenChat(bundle, dialogsActivity)) {
            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.closeChats, new Object[0]);
            launchActivity.getActionBarLayout().presentFragment(new ChatActivity(bundle), true, false, true, false);
        }
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$DkrKcjzFumY7hla92PKOilJSaUQ(final LaunchActivity launchActivity, final int i, final TLRPC.User user, final String str, final String str2, final DialogsActivity dialogsActivity, DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        launchActivity.getClass();
        final long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.currentAccount).getChat(Long.valueOf(-j));
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda159
                @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
                public final void run(boolean z3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    LaunchActivity.$r8$lambda$6_4wx_7TREN2ULor5goEypwEqX8(LaunchActivity.this, str, str2, i, chat, dialogsActivity, user, j, z3, tL_chatAdminRights2, str3);
                }
            });
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity);
            int i4 = R.string.AddBot;
            builder.setTitle(LocaleController.getString(i4));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title)));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.setPositiveButton(LocaleController.getString(i4), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda160
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i5) {
                    LaunchActivity.$r8$lambda$zaSbWAd1Pm0g167Vmt1iaSPuRSQ(LaunchActivity.this, j, i, user, str2, alertDialog, i5);
                }
            });
            builder.show();
        }
        return true;
    }

    public static /* synthetic */ void $r8$lambda$6_4wx_7TREN2ULor5goEypwEqX8(final LaunchActivity launchActivity, final String str, final String str2, final int i, final TLRPC.Chat chat, final DialogsActivity dialogsActivity, final TLRPC.User user, final long j, final boolean z, final TLRPC.TL_chatAdminRights tL_chatAdminRights, final String str3) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda161
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$SWaxTu0DqoygEDT3ETr00gxFZ0w(LaunchActivity.this, str, tL_chatAdminRights, z, str2, i, chat, dialogsActivity, user, j, str3);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$SWaxTu0DqoygEDT3ETr00gxFZ0w(final LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z, String str2, final int i, final TLRPC.Chat chat, final DialogsActivity dialogsActivity, TLRPC.User user, long j, String str3) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        launchActivity.getClass();
        if (str != null) {
            String[] split = str.split("\\+| ");
            tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
            for (String str4 : split) {
                str4.getClass();
                switch (str4) {
                    case "ban_users":
                    case "restrict_members":
                        tL_chatAdminRights2.ban_users = true;
                        break;
                    case "anonymous":
                        tL_chatAdminRights2.anonymous = true;
                        break;
                    case "change_info":
                        tL_chatAdminRights2.change_info = true;
                        break;
                    case "delete_messages":
                        tL_chatAdminRights2.delete_messages = true;
                        break;
                    case "edit_messages":
                        tL_chatAdminRights2.edit_messages = true;
                        break;
                    case "manage_call":
                    case "manage_video_chats":
                        tL_chatAdminRights2.manage_call = true;
                        break;
                    case "manage_chat":
                    case "other":
                        tL_chatAdminRights2.other = true;
                        break;
                    case "manage_topics":
                    case "manage_topic":
                        tL_chatAdminRights2.manage_topics = true;
                        break;
                    case "promote_members":
                    case "add_admins":
                        tL_chatAdminRights2.add_admins = true;
                        break;
                    case "invite_users":
                        tL_chatAdminRights2.invite_users = true;
                        break;
                    case "post_messages":
                        tL_chatAdminRights2.post_messages = true;
                        break;
                    case "pin_messages":
                        tL_chatAdminRights2.pin_messages = true;
                        break;
                }
            }
        } else {
            tL_chatAdminRights2 = null;
        }
        if (tL_chatAdminRights2 == null && tL_chatAdminRights == null) {
            tL_chatAdminRights3 = null;
        } else {
            if (tL_chatAdminRights2 != null) {
                if (tL_chatAdminRights == null) {
                    tL_chatAdminRights3 = tL_chatAdminRights2;
                } else {
                    tL_chatAdminRights.change_info = tL_chatAdminRights2.change_info || tL_chatAdminRights.change_info;
                    tL_chatAdminRights.post_messages = tL_chatAdminRights2.post_messages || tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.edit_messages = tL_chatAdminRights2.edit_messages || tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.add_admins = tL_chatAdminRights2.add_admins || tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.delete_messages = tL_chatAdminRights2.delete_messages || tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.ban_users = tL_chatAdminRights2.ban_users || tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.invite_users = tL_chatAdminRights2.invite_users || tL_chatAdminRights.invite_users;
                    tL_chatAdminRights.pin_messages = tL_chatAdminRights2.pin_messages || tL_chatAdminRights.pin_messages;
                    tL_chatAdminRights.manage_call = tL_chatAdminRights2.manage_call || tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.anonymous = tL_chatAdminRights2.anonymous || tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.other = tL_chatAdminRights2.other || tL_chatAdminRights.other;
                }
            }
            tL_chatAdminRights3 = tL_chatAdminRights;
        }
        if (z && tL_chatAdminRights2 == null && !TextUtils.isEmpty(str2)) {
            MessagesController.getInstance(launchActivity.currentAccount).addUserToChat(chat.id, user, 0, str2, dialogsActivity, true, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda179
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$gfDdsv3O9NwRtrpaSBTnBEd8Izw(LaunchActivity.this, i, chat, dialogsActivity);
                }
            }, null);
            return;
        }
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(user.id, -j, tL_chatAdminRights3, null, null, str3, 2, true, !z, str2);
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() { // from class: org.telegram.ui.LaunchActivity.13
            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didChangeOwner(TLRPC.User user2) {
            }

            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didSetRights(int i2, TLRPC.TL_chatAdminRights tL_chatAdminRights4, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str5) {
                dialogsActivity.removeSelfFromStack();
                NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.closeChats, new Object[0]);
            }
        });
        launchActivity.getActionBarLayout().presentFragment(chatRightsEditActivity, false);
    }

    public static /* synthetic */ void $r8$lambda$gfDdsv3O9NwRtrpaSBTnBEd8Izw(LaunchActivity launchActivity, int i, TLRPC.Chat chat, DialogsActivity dialogsActivity) {
        launchActivity.getClass();
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.closeChats, new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putLong("chat_id", chat.id);
        if (MessagesController.getInstance(launchActivity.currentAccount).checkCanOpenChat(bundle, dialogsActivity)) {
            launchActivity.presentFragment(new ChatActivity(bundle), true, false);
        }
    }

    public static /* synthetic */ void $r8$lambda$zaSbWAd1Pm0g167Vmt1iaSPuRSQ(LaunchActivity launchActivity, long j, int i, TLRPC.User user, String str, AlertDialog alertDialog, int i2) {
        launchActivity.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        long j2 = -j;
        bundle.putLong("chat_id", j2);
        ChatActivity chatActivity = new ChatActivity(bundle);
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.closeChats, new Object[0]);
        MessagesController.getInstance(i).addUserToChat(j2, user, 0, str, chatActivity, null);
        launchActivity.getActionBarLayout().presentFragment(chatActivity, true, false, true, false);
    }

    public static /* synthetic */ void $r8$lambda$ADSsFZ8xbfJ6ouER5a9oDvJ8WFI(final LaunchActivity launchActivity, final int i, final TLRPC.Chat chat, final Runnable runnable, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final String str26, final String str27, final Browser.Progress progress, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final String str28, final String str29, final boolean z5, final String str30, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str31, final Integer num3, final boolean z11, final byte[] bArr, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda140
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$LLDAFUZXaxcirWGRm5eVbq0RwfA(LaunchActivity.this, tLObject, i, chat, runnable, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str26, str27, progress, z3, i4, z4, i5, i6, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$LLDAFUZXaxcirWGRm5eVbq0RwfA(LaunchActivity launchActivity, TLObject tLObject, int i, TLRPC.Chat chat, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l, Long l2, Integer num2, String str13, HashMap hashMap, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, int i3, String str23, String str24, String str25, String str26, String str27, Browser.Progress progress, boolean z3, int i4, boolean z4, int i5, int i6, String str28, String str29, boolean z5, String str30, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str31, Integer num3, boolean z11, byte[] bArr) {
        launchActivity.getClass();
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(i).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(i).putChats(tL_messages_chatFull.chats, false);
            MessagesStorage.getInstance(i).putUsersAndChats(tL_messages_chatFull.users, tL_messages_chatFull.chats, false, true);
            if (MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_monoforum_id)) == null) {
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            launchActivity.runLinkRequest(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str26, str27, progress, z3, i4, z4, i5, i6, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr);
            return;
        }
        try {
            runnable.run();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static /* synthetic */ void $r8$lambda$vL7GFgscDDuyMsnutvW_ffLiAlk(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    class 14 implements MessagesController.MessagesLoadedCallback {
        final /* synthetic */ Bundle val$args;
        final /* synthetic */ long val$dialog_id;
        final /* synthetic */ Runnable val$dismissLoading;
        final /* synthetic */ BaseFragment val$lastFragment;
        final /* synthetic */ String val$livestream;
        final /* synthetic */ Integer val$messageId;

        14(Runnable runnable, String str, BaseFragment baseFragment, long j, Integer num, Bundle bundle) {
            this.val$dismissLoading = runnable;
            this.val$livestream = str;
            this.val$lastFragment = baseFragment;
            this.val$dialog_id = j;
            this.val$messageId = num;
            this.val$args = bundle;
        }

        @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
        public void onMessagesLoaded(boolean z) {
            BaseFragment chatActivity;
            try {
                this.val$dismissLoading.run();
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (LaunchActivity.this.isFinishing()) {
                return;
            }
            if (this.val$livestream != null) {
                BaseFragment baseFragment = this.val$lastFragment;
                if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getDialogId() == this.val$dialog_id) {
                    chatActivity = this.val$lastFragment;
                    final BaseFragment baseFragment2 = chatActivity;
                    final String str = this.val$livestream;
                    final long j = this.val$dialog_id;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$14$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LaunchActivity.14.$r8$lambda$zteOVJYkDRy3gztcKVA5u1oRGrI(LaunchActivity.14.this, str, j, baseFragment2);
                        }
                    }, 150L);
                }
            }
            BaseFragment baseFragment3 = this.val$lastFragment;
            if ((baseFragment3 instanceof ChatActivity) && ((ChatActivity) baseFragment3).getDialogId() == this.val$dialog_id && this.val$messageId == null) {
                ChatActivity chatActivity2 = (ChatActivity) this.val$lastFragment;
                AndroidUtilities.shakeViewSpring(chatActivity2.getChatListView(), 5.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ChatActivityEnterView chatActivityEnterView = chatActivity2.getChatActivityEnterView();
                for (int i = 0; i < chatActivityEnterView.getChildCount(); i++) {
                    AndroidUtilities.shakeViewSpring(chatActivityEnterView.getChildAt(i), 5.0f);
                }
                ActionBar actionBar = chatActivity2.getActionBar();
                for (int i2 = 0; i2 < actionBar.getChildCount(); i2++) {
                    AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i2), 5.0f);
                }
                chatActivity = this.val$lastFragment;
            } else {
                chatActivity = new ChatActivity(this.val$args);
                LaunchActivity.this.getActionBarLayout().presentFragment(chatActivity);
            }
            final BaseFragment baseFragment22 = chatActivity;
            final String str2 = this.val$livestream;
            final long j2 = this.val$dialog_id;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$14$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.14.$r8$lambda$zteOVJYkDRy3gztcKVA5u1oRGrI(LaunchActivity.14.this, str2, j2, baseFragment22);
                }
            }, 150L);
        }

        public static /* synthetic */ void $r8$lambda$zteOVJYkDRy3gztcKVA5u1oRGrI(final 14 r9, String str, final long j, final BaseFragment baseFragment) {
            if (str == null) {
                r9.getClass();
                return;
            }
            final AccountInstance accountInstance = AccountInstance.getInstance(LaunchActivity.this.currentAccount);
            long j2 = -j;
            if (accountInstance.getMessagesController().getGroupCall(j2, false) != null) {
                VoIPHelper.startCall(accountInstance.getMessagesController().getChat(Long.valueOf(j2)), accountInstance.getMessagesController().getInputPeer(j), null, false, Boolean.valueOf(!r10.call.rtmp_stream), LaunchActivity.this, baseFragment, accountInstance);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j2);
            if (chatFull != null) {
                if (chatFull.call != null) {
                    accountInstance.getMessagesController().getGroupCall(j2, true, new Runnable() { // from class: org.telegram.ui.LaunchActivity$14$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            LaunchActivity.14.$r8$lambda$k8wDjQPlkDIIM0XoPR45IBSVmpg(LaunchActivity.14.this, accountInstance, j, baseFragment);
                        }
                    });
                } else if (baseFragment.getParentActivity() != null) {
                    BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.InviteExpired)).show();
                }
            }
        }

        public static /* synthetic */ void $r8$lambda$k8wDjQPlkDIIM0XoPR45IBSVmpg(final 14 r6, final AccountInstance accountInstance, final long j, final BaseFragment baseFragment) {
            r6.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$14$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.14.$r8$lambda$1TUo1ApdzRWdK38eYHJfqZokCU8(LaunchActivity.14.this, accountInstance, j, baseFragment);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$1TUo1ApdzRWdK38eYHJfqZokCU8(14 r15, AccountInstance accountInstance, long j, BaseFragment baseFragment) {
            r15.getClass();
            long j2 = -j;
            ChatObject.Call groupCall = accountInstance.getMessagesController().getGroupCall(j2, false);
            VoIPHelper.startCall(accountInstance.getMessagesController().getChat(Long.valueOf(j2)), accountInstance.getMessagesController().getInputPeer(j), null, false, Boolean.valueOf(groupCall == null || !groupCall.call.rtmp_stream), LaunchActivity.this, baseFragment, accountInstance);
        }

        @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
        public void onError() {
            if (!LaunchActivity.this.isFinishing()) {
                AlertsCreator.showSimpleAlert((BaseFragment) LaunchActivity.this.mainFragmentsStack.get(LaunchActivity.this.mainFragmentsStack.size() - 1), LocaleController.getString(R.string.JoinToGroupErrorNotExist));
            }
            try {
                this.val$dismissLoading.run();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$0Rv2Fhvgz35KPuWwsuhPfcAwN1s(final LaunchActivity launchActivity, final int i, final AlertDialog alertDialog, final Runnable runnable, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda126
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$zOK3oiFO_agCz0-U9fGYaYrrfsI(LaunchActivity.this, tL_error, tLObject, i, alertDialog, runnable, str);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        if (r8.chat.has_geo != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r0.checkCanOpenChat(r10, (org.telegram.ui.ActionBar.BaseFragment) r3.get(r3.size() - 1)) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$zOK3oiFO_agCz0-U9fGYaYrrfsI(final LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, AlertDialog alertDialog, final Runnable runnable, String str) {
        Runnable runnable2;
        if (launchActivity.isFinishing()) {
            return;
        }
        if (tL_error == null && launchActivity.actionBarLayout != null) {
            final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject;
            TLRPC.Chat chat = chatInvite.chat;
            if (chat != null) {
                if (ChatObject.isLeftFromChat(chat)) {
                    TLRPC.Chat chat2 = chatInvite.chat;
                    if (!chat2.kicked) {
                        if (!ChatObject.isPublic(chat2)) {
                            if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                            }
                        }
                    }
                }
                MessagesController.getInstance(i).putChat(chatInvite.chat, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(chatInvite.chat);
                MessagesStorage.getInstance(i).putUsersAndChats(null, arrayList, false, true);
                final Bundle bundle = new Bundle();
                bundle.putLong("chat_id", chatInvite.chat.id);
                if (!launchActivity.mainFragmentsStack.isEmpty()) {
                    MessagesController messagesController = MessagesController.getInstance(i);
                    ArrayList arrayList2 = launchActivity.mainFragmentsStack;
                }
                final boolean[] zArr = new boolean[1];
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda151
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        LaunchActivity.$r8$lambda$hbC4H-Qj0FoPgx-fRHPeVFN1hdc(zArr, dialogInterface);
                    }
                });
                if (chatInvite.chat.forum) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", chatInvite.chat.id);
                    launchActivity.presentFragment(TopicsFragment.getTopicsOrChat(launchActivity, bundle2));
                    runnable2 = runnable;
                } else {
                    MessagesController.getInstance(i).ensureMessagesLoaded(-chatInvite.chat.id, 0, new MessagesController.MessagesLoadedCallback() { // from class: org.telegram.ui.LaunchActivity.15
                        @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
                        public void onMessagesLoaded(boolean z) {
                            try {
                                runnable.run();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (zArr[0]) {
                                return;
                            }
                            ChatActivity chatActivity = new ChatActivity(bundle);
                            TLRPC.ChatInvite chatInvite2 = chatInvite;
                            if (chatInvite2 instanceof TLRPC.TL_chatInvitePeek) {
                                chatActivity.setChatInvite(chatInvite2);
                            }
                            LaunchActivity.this.getActionBarLayout().presentFragment(chatActivity);
                        }

                        @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
                        public void onError() {
                            if (!LaunchActivity.this.isFinishing()) {
                                AlertsCreator.showSimpleAlert((BaseFragment) LaunchActivity.this.mainFragmentsStack.get(LaunchActivity.this.mainFragmentsStack.size() - 1), LocaleController.getString(R.string.JoinToGroupErrorNotExist));
                            }
                            try {
                                runnable.run();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    });
                    return;
                }
            }
            runnable2 = runnable;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
            if (tL_starsSubscriptionPricing != null && !chatInvite.can_refulfill_subscription) {
                final long j = tL_starsSubscriptionPricing.amount;
                MessagesController.getInstance(i).putChat(chatInvite.chat, false);
                StarsController.getInstance(launchActivity.currentAccount).subscribeTo(str, chatInvite, new Utilities.Callback2() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda152
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        LaunchActivity.$r8$lambda$gIAdcsPeFe3O12uHB9ut-Sw0knA(LaunchActivity.this, j, (String) obj, (Long) obj2);
                    }
                });
            } else {
                ArrayList arrayList3 = launchActivity.mainFragmentsStack;
                BaseFragment baseFragment = (BaseFragment) arrayList3.get(arrayList3.size() - 1);
                baseFragment.showDialog(new JoinGroupAlert(launchActivity, chatInvite, str, baseFragment, baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).themeDelegate : null));
            }
        } else {
            runnable2 = runnable;
            AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity);
            builder.setTitle(LocaleController.getString(R.string.AppName));
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                builder.setMessage(LocaleController.getString(R.string.FloodWait));
            } else if (tL_error.text.startsWith("INVITE_HASH_EXPIRED")) {
                builder.setTitle(LocaleController.getString(R.string.ExpiredLink));
                builder.setMessage(LocaleController.getString(R.string.InviteExpired));
            } else {
                builder.setMessage(LocaleController.getString(R.string.JoinToGroupErrorNotExist));
            }
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
            launchActivity.showAlertDialog(builder);
        }
        try {
            runnable2.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$hbC4H-Qj0FoPgx-fRHPeVFN1hdc(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public static /* synthetic */ void $r8$lambda$gIAdcsPeFe3O12uHB9ut-Sw0knA(final LaunchActivity launchActivity, final long j, String str, final Long l) {
        launchActivity.getClass();
        if (!"paid".equals(str) || l.longValue() == 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda167
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$ZrGh28U_brlaiAlp9e5485PSTsI(LaunchActivity.this, l, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$ZrGh28U_brlaiAlp9e5485PSTsI(LaunchActivity launchActivity, Long l, final long j) {
        launchActivity.getClass();
        BaseFragment safeLastFragment = getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        final ChatActivity of = ChatActivity.of(l.longValue());
        safeLastFragment.presentFragment(of);
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.currentAccount).getChat(Long.valueOf(-l.longValue()));
        if (chat != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda173
                @Override // java.lang.Runnable
                public final void run() {
                    BulletinFactory.of(BaseFragment.this).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j, chat.title))).show(true);
                }
            }, 250L);
        }
    }

    public static /* synthetic */ void $r8$lambda$divvYjw3YmYwb2XnSTDy5__LR64(final LaunchActivity launchActivity, final Runnable runnable, final int i, TLRPC.ChatInviteJoinResult chatInviteJoinResult, final TLRPC.TL_error tL_error) {
        final TLRPC.Updates updates;
        launchActivity.getClass();
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(launchActivity.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                final TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda138
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.$r8$lambda$f4lsOaXsi7Vd4V56NaXwaeSWlqw(LaunchActivity.this, tL_chatInviteJoinResultWebView);
                    }
                });
            }
            updates = null;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda139
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$aIp0pPzUZHwin7swWbpAyPzjKYo(LaunchActivity.this, runnable, tL_error, updates, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$f4lsOaXsi7Vd4V56NaXwaeSWlqw(LaunchActivity launchActivity, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView) {
        MessagesController.getInstance(launchActivity.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity.currentAccount);
        long j = tL_chatInviteJoinResultWebView.bot_id;
        botGuardHelper.openGuardBotWebApp(j, j, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void $r8$lambda$aIp0pPzUZHwin7swWbpAyPzjKYo(LaunchActivity launchActivity, Runnable runnable, TLRPC.TL_error tL_error, TLRPC.Updates updates, int i) {
        if (launchActivity.isFinishing()) {
            return;
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tL_error == null) {
            if (launchActivity.actionBarLayout == null || updates == null || updates.chats.isEmpty()) {
                return;
            }
            TLRPC.Chat chat = updates.chats.get(0);
            chat.left = false;
            chat.kicked = false;
            MessagesController.getInstance(i).putUsers(updates.users, false);
            MessagesController.getInstance(i).putChats(updates.chats, false);
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (!launchActivity.mainFragmentsStack.isEmpty()) {
                if (!MessagesController.getInstance(i).checkCanOpenChat(bundle, (BaseFragment) launchActivity.mainFragmentsStack.get(r0.size() - 1))) {
                    return;
                }
            }
            ChatActivity chatActivity = new ChatActivity(bundle);
            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.closeChats, new Object[0]);
            launchActivity.getActionBarLayout().presentFragment(chatActivity, false, true, true, false);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        if (tL_error.text.startsWith("FLOOD_WAIT")) {
            builder.setMessage(LocaleController.getString(R.string.FloodWait));
        } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
            builder.setMessage(LocaleController.getString(R.string.JoinToGroupErrorFull));
        } else {
            builder.setMessage(LocaleController.getString(R.string.JoinToGroupErrorNotExist));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        launchActivity.showAlertDialog(builder);
    }

    public static /* synthetic */ boolean $r8$lambda$AVrpjPGBBcjmhOq1Ko7IvhplP4E(LaunchActivity launchActivity, boolean z, int i, String str, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z2, boolean z3, int i2, int i3, TopicsFragment topicsFragment) {
        launchActivity.getClass();
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", z);
        if (DialogObject.isEncryptedDialog(j)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j));
        } else if (DialogObject.isUserDialog(j)) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        if (MessagesController.getInstance(i).checkCanOpenChat(bundle, dialogsActivity)) {
            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i).saveDraft(j, 0, str, null, null, false, 0L);
            launchActivity.getActionBarLayout().presentFragment(new ChatActivity(bundle), true, false, true, false);
        }
        return true;
    }

    public static /* synthetic */ void $r8$lambda$90iQfbq4f5TDEiRQE6hj2E1O5y4(final LaunchActivity launchActivity, int[] iArr, final int i, final Runnable runnable, final TL_account.getAuthorizationForm getauthorizationform, final String str, final String str2, final String str3, TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        final TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
        if (authorizationform != null) {
            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda124
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    LaunchActivity.$r8$lambda$orAOVdliPDFBvAyfM1zLFYQG8-U(LaunchActivity.this, runnable, i, authorizationform, getauthorizationform, str, str2, str3, tLObject2, tL_error2);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda125
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$g-N0Ns2fb89XFQJpc8_GUWcxx-8(LaunchActivity.this, runnable, tL_error);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$orAOVdliPDFBvAyfM1zLFYQG8-U(final LaunchActivity launchActivity, final Runnable runnable, final int i, final TL_account.authorizationForm authorizationform, final TL_account.getAuthorizationForm getauthorizationform, final String str, final String str2, final String str3, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda149
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$k6mKqqkX_htm-7fWP9B8Z4PCstI(LaunchActivity.this, runnable, tLObject, i, authorizationform, getauthorizationform, str, str2, str3);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$k6mKqqkX_htm-7fWP9B8Z4PCstI(LaunchActivity launchActivity, Runnable runnable, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        launchActivity.getClass();
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            MessagesController.getInstance(i).putUsers(authorizationform.users, false);
            launchActivity.presentFragment(new PassportActivity(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject));
        }
    }

    public static /* synthetic */ void $r8$lambda$g-N0Ns2fb89XFQJpc8_GUWcxx-8(LaunchActivity launchActivity, Runnable runnable, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        try {
            runnable.run();
            if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                AlertsCreator.showUpdateAppAlert(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$Ro6UGIYBh6umRgI-jM0l9mHaVZ8(final LaunchActivity launchActivity, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda134
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$JlVcxIKsBxFF5RMH8n8fMeJKBgE(LaunchActivity.this, runnable, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$JlVcxIKsBxFF5RMH8n8fMeJKBgE(LaunchActivity launchActivity, Runnable runnable, TLObject tLObject) {
        launchActivity.getClass();
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_help_deepLinkInfo) {
            TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject;
            AlertsCreator.showUpdateAppAlert(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
        }
    }

    public static /* synthetic */ void $r8$lambda$DYQb4Mgb6DcqBDPXE0EOqa7ZUMw(final LaunchActivity launchActivity, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda136
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$mDin1UFqmt0iTPozd469YFhQtZs(LaunchActivity.this, runnable, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$mDin1UFqmt0iTPozd469YFhQtZs(LaunchActivity launchActivity, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_langPackLanguage) {
            launchActivity.showAlertDialog(AlertsCreator.createLanguageAlert(launchActivity, (TLRPC.TL_langPackLanguage) tLObject));
            return;
        }
        if (tL_error != null) {
            if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error.text)) {
                launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.LanguageUnsupportedError)));
                return;
            }
            launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text));
        }
    }

    public static /* synthetic */ void $r8$lambda$gjbEng6lKRjnK0jkEdg0k213Glw(final LaunchActivity launchActivity, final Runnable runnable, final TLRPC.TL_wallPaper tL_wallPaper, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda132
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$7PPNxSkPEQkg8mX-qPS-B99s0Gk(LaunchActivity.this, runnable, tLObject, tL_wallPaper, tL_error);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void $r8$lambda$7PPNxSkPEQkg8mX-qPS-B99s0Gk(LaunchActivity launchActivity, Runnable runnable, TLObject tLObject, TLRPC.TL_wallPaper tL_wallPaper, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tLObject;
            if (tL_wallPaper2.pattern) {
                String str = tL_wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                WallpapersListActivity.ColorWallpaper colorWallpaper = new WallpapersListActivity.ColorWallpaper(str, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r11.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                colorWallpaper.pattern = tL_wallPaper2;
                tL_wallPaper2 = colorWallpaper;
            }
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(tL_wallPaper2, null, true, false);
            TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
            themePreviewActivity.setInitialModes(wallPaperSettings2.blur, wallPaperSettings2.motion, wallPaperSettings2.intensity);
            launchActivity.presentFragment(themePreviewActivity);
            return;
        }
        launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text));
    }

    public static /* synthetic */ void $r8$lambda$RDGbpXTA-by6blh4WjXhYlXdrzE(LaunchActivity launchActivity, Browser.Progress progress) {
        launchActivity.loadingThemeFileName = null;
        launchActivity.loadingThemeWallpaperName = null;
        launchActivity.loadingThemeWallpaper = null;
        launchActivity.loadingThemeInfo = null;
        launchActivity.loadingThemeProgressDialog = null;
        launchActivity.loadingTheme = null;
        if (progress != null) {
            progress.end();
        }
    }

    public static /* synthetic */ void $r8$lambda$8o6qztisjUWaFehHIvxkHpOs3z4(final LaunchActivity launchActivity, final AlertDialog alertDialog, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda100
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$631n0k788iBPgEGhz-t4v9bVT5E(LaunchActivity.this, tLObject, alertDialog, runnable, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$631n0k788iBPgEGhz-t4v9bVT5E(LaunchActivity launchActivity, TLObject tLObject, AlertDialog alertDialog, Runnable runnable, TLRPC.TL_error tL_error) {
        char c;
        launchActivity.getClass();
        if (tLObject instanceof TLRPC.TL_theme) {
            TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject;
            TLRPC.TL_wallPaper tL_wallPaper = null;
            c = 0;
            TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
            if (themeSettings != null) {
                Theme.ThemeInfo theme = Theme.getTheme(Theme.getBaseThemeKey(themeSettings));
                if (theme != null) {
                    TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                    if (wallPaper instanceof TLRPC.TL_wallPaper) {
                        tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                        if (!FileLoader.getInstance(launchActivity.currentAccount).getPathToAttach(tL_wallPaper.document, true).exists()) {
                            launchActivity.loadingThemeProgressDialog = alertDialog;
                            launchActivity.loadingThemeAccent = true;
                            launchActivity.loadingThemeInfo = theme;
                            launchActivity.loadingTheme = tL_theme;
                            launchActivity.loadingThemeWallpaper = tL_wallPaper;
                            launchActivity.loadingThemeWallpaperName = FileLoader.getAttachFileName(tL_wallPaper.document);
                            FileLoader.getInstance(launchActivity.currentAccount).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                            return;
                        }
                    }
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.openThemeAccentPreview(tL_theme, tL_wallPaper, theme);
                }
                c = 1;
            } else {
                TLRPC.Document document = tL_theme.document;
                if (document != null) {
                    launchActivity.loadingThemeAccent = false;
                    launchActivity.loadingTheme = tL_theme;
                    launchActivity.loadingThemeFileName = FileLoader.getAttachFileName(document);
                    launchActivity.loadingThemeProgressDialog = alertDialog;
                    FileLoader.getInstance(launchActivity.currentAccount).loadFile(launchActivity.loadingTheme.document, tL_theme, 1, 1);
                }
                c = 1;
            }
        } else {
            if (tL_error == null || !"THEME_FORMAT_INVALID".equals(tL_error.text)) {
                c = 2;
            }
            c = 1;
        }
        if (c != 0) {
            try {
                runnable.run();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            if (c == 1) {
                launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
            } else {
                launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$seqAGN02m3Envl6a3uP1JRO4G6k(final LaunchActivity launchActivity, final int[] iArr, final int i, final Runnable runnable, final Integer num, final Integer num2, final Long l, final Integer num3, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda101
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$NTZ_vJuXuuiwYrzOD4NLZayUZCI(LaunchActivity.this, tLObject, iArr, i, runnable, num, num2, l, num3);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$NTZ_vJuXuuiwYrzOD4NLZayUZCI(LaunchActivity launchActivity, TLObject tLObject, int[] iArr, int i, Runnable runnable, Integer num, Integer num2, Long l, Integer num3) {
        launchActivity.getClass();
        if (tLObject instanceof TLRPC.TL_messages_chats) {
            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
            if (!tL_messages_chats.chats.isEmpty()) {
                MessagesController.getInstance(launchActivity.currentAccount).putChats(tL_messages_chats.chats, false);
                iArr[0] = launchActivity.runCommentRequest(i, runnable, num, num2, l, num3, tL_messages_chats.chats.get(0));
                return;
            }
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        launchActivity.showAlertDialog(AlertsCreator.createNoAccessAlert(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound), null));
    }

    public static /* synthetic */ void $r8$lambda$XNe2F-LqGs0mRlipvOGxRBN2nig(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$5vJApXAPSDtKi583nPviPu5yl8Q(final LaunchActivity launchActivity, final Bundle bundle, final Long l, int[] iArr, final Runnable runnable, final boolean z, final Browser.Progress progress, final Long l2, final Integer num, final Integer num2, final byte[] bArr, final BaseFragment baseFragment, final int i) {
        if (launchActivity.getActionBarLayout().presentFragment(new ChatActivity(bundle))) {
            return;
        }
        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
        tL_inputChannel.channel_id = l.longValue();
        tL_channels_getChannels.id.add(tL_inputChannel);
        iArr[0] = ConnectionsManager.getInstance(launchActivity.currentAccount).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda128
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.$r8$lambda$V22w-imaqW9WsgdLZAxdpCGVyWc(LaunchActivity.this, runnable, z, l, progress, l2, num, num2, bArr, baseFragment, i, bundle, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$V22w-imaqW9WsgdLZAxdpCGVyWc(final LaunchActivity launchActivity, final Runnable runnable, final boolean z, final Long l, final Browser.Progress progress, final Long l2, final Integer num, final Integer num2, final byte[] bArr, final BaseFragment baseFragment, final int i, final Bundle bundle, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda153
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$6rHbZ5cB2mqbckXnwxHLPncj13o(LaunchActivity.this, runnable, tLObject, z, l, progress, l2, num, num2, bArr, baseFragment, i, bundle);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$6rHbZ5cB2mqbckXnwxHLPncj13o(LaunchActivity launchActivity, Runnable runnable, TLObject tLObject, boolean z, Long l, Browser.Progress progress, Long l2, Integer num, Integer num2, byte[] bArr, BaseFragment baseFragment, int i, Bundle bundle) {
        launchActivity.getClass();
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_messages_chats) {
            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
            if (!tL_messages_chats.chats.isEmpty()) {
                MessagesController.getInstance(launchActivity.currentAccount).putChats(tL_messages_chats.chats, false);
                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                if (chat != null && z && ChatObject.isBoostSupported(chat)) {
                    launchActivity.processBoostDialog(Long.valueOf(-l.longValue()), null, progress);
                } else if (chat != null && chat.forum) {
                    if (l2 != null) {
                        launchActivity.openForumFromLink(-l.longValue(), num, null, num2, bArr, null, 0, -1);
                    } else {
                        launchActivity.openForumFromLink(-l.longValue(), null, null, num2, bArr, null, 0, -1);
                    }
                }
                if (baseFragment == null || MessagesController.getInstance(i).checkCanOpenChat(bundle, baseFragment)) {
                    launchActivity.getActionBarLayout().presentFragment(new ChatActivity(bundle));
                    return;
                }
                return;
            }
        }
        launchActivity.showAlertDialog(AlertsCreator.createNoAccessAlert(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound), null));
    }

    public static /* synthetic */ void $r8$lambda$w14zS2k4vqUMscyFFuuHaFvJ-wE(final LaunchActivity launchActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda115
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$PL_ZUI3tn_p1LArgJl9SnV-cGKg(LaunchActivity.this, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$PL_ZUI3tn_p1LArgJl9SnV-cGKg(LaunchActivity launchActivity, TLObject tLObject) {
        launchActivity.getClass();
        if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
            TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
            MessagesController.getInstance(launchActivity.currentAccount).putUsers(resolvedbusinesschatlinks.users, false);
            MessagesController.getInstance(launchActivity.currentAccount).putChats(resolvedbusinesschatlinks.chats, false);
            MessagesStorage.getInstance(launchActivity.currentAccount).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
            Bundle bundle = new Bundle();
            TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
            if (peer instanceof TLRPC.TL_peerUser) {
                bundle.putLong("user_id", peer.user_id);
            } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                bundle.putLong("chat_id", peer.channel_id);
            }
            ChatActivity chatActivity = new ChatActivity(bundle);
            chatActivity.setResolvedChatLink(resolvedbusinesschatlinks);
            launchActivity.presentFragment(chatActivity, false, true);
            return;
        }
        launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
    }

    public static /* synthetic */ void $r8$lambda$b8_jE36SgVCmV2pCHxxTTVUeQKg(int i, int[] iArr, Runnable runnable, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void $r8$lambda$TM6JX28wzkzxsvR5ekD00J0O4F0(int i, int[] iArr, Runnable runnable) {
        ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
        if (runnable != null) {
            runnable.run();
        }
    }

    private void processWebAppBot(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, String str26, final String str27, final Browser.Progress progress, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final boolean z5, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final boolean z12, final String str29, final boolean z13) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getBotApp, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda148
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.$r8$lambda$Aj11cwE_4CdiEuNKuc9HhHdAc1E(LaunchActivity.this, progress, i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, z3, i4, z4, i5, i6, z5, str28, z8, z9, z10, z11, z12, str29, z13, runnable, user, str27, z7, z6, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Aj11cwE_4CdiEuNKuc9HhHdAc1E(final LaunchActivity launchActivity, final Browser.Progress progress, final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final boolean z5, final String str26, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str27, final boolean z11, final Runnable runnable, final TLRPC.User user, final String str28, final boolean z12, final boolean z13, TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        if (progress != null) {
            progress.end();
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda162
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.this.runLinkRequest(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, null, null, progress, z3, i4, z4, i5, i6, null, null, z5, str26, z6, z7, z8, z9, z10, str27, null, z11, null);
                }
            });
        } else {
            final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda163
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$L7HwOwFQPSAkUvVOXkIX9pILwyM(LaunchActivity.this, runnable, i, user, tL_messages_botApp, str28, z6, z7, z8, z3, z12, z13, progress);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$L7HwOwFQPSAkUvVOXkIX9pILwyM(final LaunchActivity launchActivity, Runnable runnable, final int i, final TLRPC.User user, final TLRPC.TL_messages_botApp tL_messages_botApp, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, boolean z5, boolean z6, Browser.Progress progress) {
        final BaseFragment baseFragment;
        launchActivity.getClass();
        runnable.run();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        ArrayList arrayList = launchActivity.mainFragmentsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            baseFragment = null;
        } else {
            baseFragment = (BaseFragment) launchActivity.mainFragmentsStack.get(r15.size() - 1);
        }
        final Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda175
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$Q6vaWw5O9GJfe2HhMdC1AA40m2U(LaunchActivity.this, baseFragment, i, user, tL_messages_botApp, atomicBoolean, str, z, z2, z3, z4);
            }
        };
        if (z5) {
            runnable2.run();
            return;
        }
        if (tL_messages_botApp.inactive && z6) {
            WebAppDisclaimerAlert.show(launchActivity, new com.google.android.exoplayer2.util.Consumer() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda176
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    runnable2.run();
                }
            }, null, progress != null ? new ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda14(progress) : null);
        } else if (tL_messages_botApp.request_write_access || z4) {
            AlertsCreator.createBotLaunchAlert(baseFragment, atomicBoolean, user, runnable2);
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void $r8$lambda$Q6vaWw5O9GJfe2HhMdC1AA40m2U(LaunchActivity launchActivity, BaseFragment baseFragment, int i, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        launchActivity.getClass();
        if (baseFragment == null || !isActive || launchActivity.isFinishing() || launchActivity.isDestroyed()) {
            return;
        }
        long j = user.id;
        WebViewRequestProps of = WebViewRequestProps.of(i, j, j, null, null, 3, 0, 0L, false, tL_messages_botApp.app, atomicBoolean.get(), str, user, 0, z, z2);
        if (launchActivity.getBottomSheetTabs() == null || launchActivity.getBottomSheetTabs().tryReopenTab(of) == null) {
            SharedPrefsHelper.setWebViewConfirmShown(launchActivity.currentAccount, user.id, true);
            BotWebViewSheet botWebViewSheet = new BotWebViewSheet(launchActivity, baseFragment.getResourceProvider());
            botWebViewSheet.setWasOpenedByLinkIntent(z3);
            botWebViewSheet.setDefaultFullsize(!z);
            if (z2) {
                botWebViewSheet.setFullscreen(true, false);
            }
            botWebViewSheet.setNeedsContext(false);
            botWebViewSheet.setParentActivity(launchActivity);
            botWebViewSheet.requestWebView(baseFragment, of);
            botWebViewSheet.show();
            if (tL_messages_botApp.inactive || z4) {
                botWebViewSheet.showJustAddedBulletin();
            }
        }
    }

    private void processAttachedMenuBotFromShortcut(final long j) {
        for (int i = 0; i < this.visibleDialogs.size(); i++) {
            if (this.visibleDialogs.get(i) instanceof BotWebViewSheet) {
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.visibleDialogs.get(i);
                if (botWebViewSheet.isShowing() && botWebViewSheet.getBotId() == j) {
                    return;
                }
            }
        }
        BaseFragment safeLastFragment = getSafeLastFragment();
        if (safeLastFragment != null && safeLastFragment.sheetsStack != null) {
            for (int i2 = 0; i2 < safeLastFragment.sheetsStack.size(); i2++) {
                if (safeLastFragment.sheetsStack.get(i2).isShown()) {
                    safeLastFragment.sheetsStack.get(i2);
                }
            }
        }
        EmptyBaseFragment sheetFragment = this.actionBarLayout.getSheetFragment(false);
        if (sheetFragment != null && sheetFragment.sheetsStack != null) {
            for (int i3 = 0; i3 < sheetFragment.sheetsStack.size(); i3++) {
                if (sheetFragment.sheetsStack.get(i3).isShown()) {
                    sheetFragment.sheetsStack.get(i3);
                }
            }
        }
        final Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda64
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                MessagesController.getInstance(LaunchActivity.this.currentAccount).openApp((TLRPC.User) obj, 0);
            }
        };
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        if (user != null) {
            callback.run(user);
        } else {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda65
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$nNMJqV6r2QDer77a6pX132lcyZI(LaunchActivity.this, j, callback);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$nNMJqV6r2QDer77a6pX132lcyZI(final LaunchActivity launchActivity, long j, final Utilities.Callback callback) {
        final TLRPC.User user = MessagesStorage.getInstance(launchActivity.currentAccount).getUser(j);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda113
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$QvXjTIhlxiPjSDsAddWTs79Hyk8(LaunchActivity.this, user, callback);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$QvXjTIhlxiPjSDsAddWTs79Hyk8(LaunchActivity launchActivity, TLRPC.User user, Utilities.Callback callback) {
        MessagesController.getInstance(launchActivity.currentAccount).putUser(user, true);
        callback.run(user);
    }

    private void processBoostDialog(Long l, Runnable runnable, Browser.Progress progress) {
        processBoostDialog(l, runnable, progress, null);
    }

    private void processBoostDialog(final Long l, final Runnable runnable, final Browser.Progress progress, final ChatMessageCell chatMessageCell) {
        final ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
        if (progress != null) {
            progress.init();
        }
        boostsController.getBoostsStats(l.longValue(), new com.google.android.exoplayer2.util.Consumer() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda69
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                LaunchActivity.$r8$lambda$Jk38H7PhS3dm7coLvs1HdDZJmLs(LaunchActivity.this, progress, runnable, boostsController, l, chatMessageCell, (TL_stories.TL_premium_boostsStatus) obj);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Jk38H7PhS3dm7coLvs1HdDZJmLs(final LaunchActivity launchActivity, final Browser.Progress progress, final Runnable runnable, ChannelBoostsController channelBoostsController, final Long l, final ChatMessageCell chatMessageCell, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        launchActivity.getClass();
        if (tL_premium_boostsStatus != null) {
            channelBoostsController.userCanBoostChannel(l.longValue(), tL_premium_boostsStatus, new com.google.android.exoplayer2.util.Consumer() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda129
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    LaunchActivity.$r8$lambda$eT7-OKwmS6OzWk3YiJvE7RoXQKk(LaunchActivity.this, progress, l, tL_premium_boostsStatus, chatMessageCell, runnable, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
            return;
        }
        if (progress != null) {
            progress.end();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void $r8$lambda$eT7-OKwmS6OzWk3YiJvE7RoXQKk(LaunchActivity launchActivity, Browser.Progress progress, Long l, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChatMessageCell chatMessageCell, Runnable runnable, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        launchActivity.getClass();
        if (progress != null) {
            progress.end();
        }
        BaseFragment lastFragmentIncludeMainTabs = getLastFragmentIncludeMainTabs();
        if (lastFragmentIncludeMainTabs == null) {
            return;
        }
        Theme.ResourcesProvider resourceProvider = lastFragmentIncludeMainTabs.getResourceProvider();
        if (lastFragmentIncludeMainTabs.getLastStoryViewer() != null && lastFragmentIncludeMainTabs.getLastStoryViewer().isFullyVisible()) {
            resourceProvider = lastFragmentIncludeMainTabs.getLastStoryViewer().getResourceProvider();
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(lastFragmentIncludeMainTabs, launchActivity, 19, launchActivity.currentAccount, resourceProvider);
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        boolean z = false;
        if (!(lastFragmentIncludeMainTabs instanceof ChatActivity) ? !(!(lastFragmentIncludeMainTabs instanceof DialogsActivity) || (rightSlidingDialogContainer = ((DialogsActivity) lastFragmentIncludeMainTabs).rightSlidingDialogContainer) == null || rightSlidingDialogContainer.getCurrentFragmetDialogId() != l.longValue()) : ((ChatActivity) lastFragmentIncludeMainTabs).getDialogId() == l.longValue()) {
            z = true;
        }
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, z);
        limitReachedBottomSheet.setDialogId(l.longValue());
        limitReachedBottomSheet.setChatMessageCell(chatMessageCell);
        lastFragmentIncludeMainTabs.showDialog(limitReachedBottomSheet);
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private void processAttachMenuBot(final int i, final long j, final String str, final TLRPC.User user, final String str2, final String str3) {
        TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
        tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(i).getInputUser(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda150
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.$r8$lambda$PYFroL5awjMU-iB_M5T2qOd_VLs(LaunchActivity.this, i, str3, str, user, str2, j, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$PYFroL5awjMU-iB_M5T2qOd_VLs(final LaunchActivity launchActivity, final int i, final String str, final String str2, final TLRPC.User user, final String str3, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda166
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$bAr9u9hxC-0FRjv0rX8-SdjX3Rc(LaunchActivity.this, tLObject, i, str, str2, user, str3, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$bAr9u9hxC-0FRjv0rX8-SdjX3Rc(final LaunchActivity launchActivity, TLObject tLObject, final int i, String str, String str2, final TLRPC.User user, final String str3, final long j) {
        final DialogsActivity dialogsActivity;
        launchActivity.getClass();
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(i).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (str != null) {
                showAttachMenuBot(launchActivity, launchActivity.currentAccount, tL_attachMenuBot, str, false);
                return;
            }
            ArrayList arrayList = launchActivity.mainFragmentsStack;
            BaseFragment baseFragment = (BaseFragment) arrayList.get(arrayList.size() - 1);
            if (AndroidUtilities.isTablet() && !(baseFragment instanceof ChatActivity) && !launchActivity.rightFragmentsStack.isEmpty()) {
                ArrayList arrayList2 = launchActivity.rightFragmentsStack;
                baseFragment = (BaseFragment) arrayList2.get(arrayList2.size() - 1);
            }
            final BaseFragment baseFragment2 = baseFragment;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str2)) {
                for (String str4 : str2.split(" ")) {
                    if (MediaDataController.canShowAttachMenuBotForTarget(tL_attachMenuBot, str4)) {
                        arrayList3.add(str4);
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                dialogsActivity = null;
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("dialogsType", 14);
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("allowGroups", arrayList3.contains("groups"));
                bundle.putBoolean("allowMegagroups", arrayList3.contains("groups"));
                bundle.putBoolean("allowLegacyGroups", arrayList3.contains("groups"));
                bundle.putBoolean("allowUsers", arrayList3.contains("users"));
                bundle.putBoolean("allowChannels", arrayList3.contains("channels"));
                bundle.putBoolean("allowBots", arrayList3.contains("bots"));
                DialogsActivity dialogsActivity2 = new DialogsActivity(bundle);
                dialogsActivity2.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda182
                    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                    public /* synthetic */ boolean canSelectStories() {
                        return DialogsActivity.DialogsActivityDelegate.-CC.$default$canSelectStories(this);
                    }

                    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                    public final boolean didSelectDialogs(DialogsActivity dialogsActivity3, ArrayList arrayList4, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
                        return LaunchActivity.$r8$lambda$5LFi9HGIk9Kphv4c0tptOEyoZ9g(LaunchActivity.this, user, str3, i, dialogsActivity3, arrayList4, charSequence, z, z2, i2, i3, topicsFragment);
                    }

                    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                    public /* synthetic */ boolean didSelectStories(DialogsActivity dialogsActivity3) {
                        return DialogsActivity.DialogsActivityDelegate.-CC.$default$didSelectStories(this, dialogsActivity3);
                    }
                });
                dialogsActivity = dialogsActivity2;
            }
            if (tL_attachMenuBot.inactive) {
                AttachBotIntroTopView attachBotIntroTopView = new AttachBotIntroTopView(launchActivity);
                attachBotIntroTopView.setColor(Theme.getColor(Theme.key_chat_attachIcon));
                attachBotIntroTopView.setBackgroundColor(Theme.getColor(Theme.key_dialogTopBackground));
                attachBotIntroTopView.setAttachBot(tL_attachMenuBot);
                WebAppDisclaimerAlert.show(launchActivity, new com.google.android.exoplayer2.util.Consumer() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda183
                    @Override // com.google.android.exoplayer2.util.Consumer
                    public final void accept(Object obj) {
                        LaunchActivity.$r8$lambda$3mP4C_ZVd7EyS80TA1xdQ-l3zio(LaunchActivity.this, i, j, dialogsActivity, baseFragment2, user, str3, (Boolean) obj);
                    }
                }, tL_attachMenuBot.request_write_access ? user : null, null);
                return;
            }
            if (dialogsActivity != null) {
                if (baseFragment2 != null) {
                    baseFragment2.dismissCurrentDialog();
                }
                for (int i2 = 0; i2 < launchActivity.visibleDialogs.size(); i2++) {
                    if (((Dialog) launchActivity.visibleDialogs.get(i2)).isShowing()) {
                        ((Dialog) launchActivity.visibleDialogs.get(i2)).dismiss();
                    }
                }
                launchActivity.visibleDialogs.clear();
                launchActivity.presentFragment(dialogsActivity);
                return;
            }
            if (baseFragment2 instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment2;
                if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, chatActivity.getCurrentUser() != null ? chatActivity.getCurrentUser() : chatActivity.getCurrentChat())) {
                    BulletinFactory.of(baseFragment2).createErrorBulletin(LocaleController.getString(R.string.BotAlreadyAddedToAttachMenu)).show();
                    return;
                } else {
                    chatActivity.openAttachBotLayout(user.id, str3, false);
                    return;
                }
            }
            BulletinFactory.of(baseFragment2).createErrorBulletin(LocaleController.getString(R.string.BotAlreadyAddedToAttachMenu)).show();
            return;
        }
        ArrayList arrayList4 = launchActivity.mainFragmentsStack;
        BulletinFactory.of((BaseFragment) arrayList4.get(arrayList4.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.BotCantAddToAttachMenu)).show();
    }

    public static /* synthetic */ boolean $r8$lambda$5LFi9HGIk9Kphv4c0tptOEyoZ9g(LaunchActivity launchActivity, TLRPC.User user, String str, int i, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
        launchActivity.getClass();
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
        bundle.putString("attach_bot", UserObject.getPublicUsername(user));
        if (str != null) {
            bundle.putString("attach_bot_start_command", str);
        }
        if (MessagesController.getInstance(i).checkCanOpenChat(bundle, dialogsActivity)) {
            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.closeChats, new Object[0]);
            launchActivity.getActionBarLayout().presentFragment(new ChatActivity(bundle), true, false, true, false);
        }
        return true;
    }

    public static /* synthetic */ void $r8$lambda$3mP4C_ZVd7EyS80TA1xdQ-l3zio(final LaunchActivity launchActivity, final int i, long j, final DialogsActivity dialogsActivity, final BaseFragment baseFragment, final TLRPC.User user, final String str, Boolean bool) {
        launchActivity.getClass();
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i).getInputUser(j);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda186
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.$r8$lambda$Lq1at6LEYqcBKOwOkCbexP99U84(LaunchActivity.this, i, dialogsActivity, baseFragment, user, str, tLObject, tL_error);
            }
        }, 66);
    }

    public static /* synthetic */ void $r8$lambda$Lq1at6LEYqcBKOwOkCbexP99U84(final LaunchActivity launchActivity, final int i, final DialogsActivity dialogsActivity, final BaseFragment baseFragment, final TLRPC.User user, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda188
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$UVcXrxsVw5r-GGUpj7Lgl8Av11w(LaunchActivity.this, tLObject, i, dialogsActivity, baseFragment, user, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$UVcXrxsVw5r-GGUpj7Lgl8Av11w(final LaunchActivity launchActivity, TLObject tLObject, int i, final DialogsActivity dialogsActivity, final BaseFragment baseFragment, final TLRPC.User user, final String str) {
        launchActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            MediaDataController.getInstance(i).loadAttachMenuBots(false, true, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda189
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$8qscYNHIQbn5cASH5nTiKmgjfac(LaunchActivity.this, dialogsActivity, baseFragment, user, str);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$8qscYNHIQbn5cASH5nTiKmgjfac(LaunchActivity launchActivity, DialogsActivity dialogsActivity, BaseFragment baseFragment, TLRPC.User user, String str) {
        launchActivity.getClass();
        if (dialogsActivity != null) {
            if (baseFragment != null) {
                baseFragment.dismissCurrentDialog();
            }
            for (int i = 0; i < launchActivity.visibleDialogs.size(); i++) {
                if (((Dialog) launchActivity.visibleDialogs.get(i)).isShowing()) {
                    ((Dialog) launchActivity.visibleDialogs.get(i)).dismiss();
                }
            }
            launchActivity.visibleDialogs.clear();
            launchActivity.presentFragment(dialogsActivity);
            return;
        }
        if (baseFragment instanceof ChatActivity) {
            ((ChatActivity) baseFragment).openAttachBotLayout(user.id, str, true);
        }
    }

    private void openForumFromLink(final long j, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i, final int i2) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            presentFragment(TopicsFragment.getTopicsOrChat(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-j);
        tL_channels_getMessages.id.add(num);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda111
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.$r8$lambda$glz8n8HnsbIvlnxTQ0-QM-ITZzU(LaunchActivity.this, num, num2, bArr, j, runnable, str, i, i2, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$glz8n8HnsbIvlnxTQ0-QM-ITZzU(final LaunchActivity launchActivity, final Integer num, final Integer num2, final byte[] bArr, final long j, final Runnable runnable, final String str, final int i, final int i2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda144
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$CmAnv6TnemeYzyhyCtwNPv4HaQY(LaunchActivity.this, tLObject, num, num2, bArr, j, runnable, str, i, i2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$CmAnv6TnemeYzyhyCtwNPv4HaQY(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j, Runnable runnable, String str, int i, int i2) {
        TLRPC.Message message;
        launchActivity.getClass();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3) != null && arrayList.get(i3).id == num.intValue()) {
                    message = arrayList.get(i3);
                    break;
                }
            }
        }
        message = null;
        if (message != null) {
            int i4 = launchActivity.currentAccount;
            Integer valueOf = Integer.valueOf(message.id);
            int i5 = launchActivity.currentAccount;
            launchActivity.runCommentRequest(i4, null, valueOf, null, Long.valueOf(MessageObject.getTopicId(i5, message, MessagesController.getInstance(i5).isForum(message))), num2, bArr, MessagesController.getInstance(launchActivity.currentAccount).getChat(Long.valueOf(-j)), runnable, str, i, i2);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j);
        launchActivity.presentFragment(TopicsFragment.getTopicsOrChat(launchActivity, bundle));
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List findContacts(String str, String str2, boolean z) {
        String str3;
        String lowerCase;
        TLRPC.User user;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ContactsController contactsController = ContactsController.getInstance(this.currentAccount);
        ArrayList arrayList = new ArrayList(contactsController.contacts);
        ArrayList arrayList2 = new ArrayList();
        String str4 = null;
        int i = 0;
        if (str2 != null) {
            String stripExceptNumbers = PhoneFormat.stripExceptNumbers(str2);
            TLRPC.TL_contact tL_contact = contactsController.contactsByPhone.get(stripExceptNumbers);
            if (tL_contact == null) {
                tL_contact = contactsController.contactsByShortPhone.get(stripExceptNumbers.substring(Math.max(0, stripExceptNumbers.length() - 7)));
            }
            if (tL_contact != null) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(tL_contact.user_id));
                if (user2 != null && (!user2.self || z)) {
                    arrayList2.add(tL_contact);
                } else {
                    str3 = null;
                    if (arrayList2.isEmpty() && str3 != null) {
                        lowerCase = str3.trim().toLowerCase();
                        if (!TextUtils.isEmpty(lowerCase)) {
                            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                                translitString = null;
                            }
                            String[] strArr = {lowerCase, translitString};
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList.get(i2);
                                if (tL_contact2 != null && (user = messagesController.getUser(Long.valueOf(tL_contact2.user_id))) != null && (!user.self || z)) {
                                    int i3 = 3;
                                    String[] strArr2 = new String[3];
                                    strArr2[i] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                                    String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[i]);
                                    strArr2[1] = translitString2;
                                    if (strArr2[i].equals(translitString2)) {
                                        strArr2[1] = str4;
                                    }
                                    int i4 = 2;
                                    if (UserObject.isReplyUser(user)) {
                                        strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                                    } else if (user.self) {
                                        strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                    }
                                    int i5 = 0;
                                    boolean z2 = false;
                                    while (true) {
                                        if (i5 >= i4) {
                                            break;
                                        }
                                        String str5 = strArr[i5];
                                        if (str5 != null) {
                                            while (i < i3) {
                                                String str6 = strArr2[i];
                                                if (str6 != null) {
                                                    if (!str6.startsWith(str5)) {
                                                        if (str6.contains(" " + str5)) {
                                                        }
                                                    }
                                                    z2 = true;
                                                    break;
                                                }
                                                i++;
                                                i3 = 3;
                                            }
                                            String publicUsername = UserObject.getPublicUsername(user);
                                            if (!z2 && publicUsername != null && publicUsername.startsWith(str5)) {
                                                z2 = true;
                                            }
                                            if (z2) {
                                                arrayList2.add(tL_contact2);
                                                break;
                                            }
                                        }
                                        i5++;
                                        i = 0;
                                        i3 = 3;
                                        i4 = 2;
                                    }
                                }
                                i2++;
                                str4 = null;
                                i = 0;
                            }
                        }
                    }
                    return arrayList2;
                }
            }
        }
        str3 = str;
        if (arrayList2.isEmpty()) {
            lowerCase = str3.trim().toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
            }
        }
        return arrayList2;
    }

    public void checkAppUpdate(boolean z, final Browser.Progress progress) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    final BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    final boolean z2 = this.firstAppUpdateCheck;
                    this.firstAppUpdateCheck = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z, new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda46
                        @Override // java.lang.Runnable
                        public final void run() {
                            LaunchActivity.$r8$lambda$YzxvArwJoxqAJS67rb5yOcGfFng(LaunchActivity.this, progress, z2, update);
                        }
                    });
                    return;
                }
                if (z || Math.abs(System.currentTimeMillis() - SharedConfig.lastUpdateCheckTime) >= MessagesController.getInstance(0).updateCheckDelay * MediaDataController.MAX_STYLE_RUNS_COUNT) {
                    TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                    try {
                        tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
                    } catch (Exception unused) {
                    }
                    if (tL_help_getAppUpdate.source == null) {
                        tL_help_getAppUpdate.source = "";
                    }
                    final int i = this.currentAccount;
                    final int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_help_getAppUpdate, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda47
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            LaunchActivity.$r8$lambda$yo2Gi3Su38wQ7mwDjRyF56aFnxc(LaunchActivity.this, i, progress, tLObject, tL_error);
                        }
                    });
                    if (progress != null) {
                        progress.init();
                        progress.onCancel(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda48
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConnectionsManager.getInstance(LaunchActivity.this.currentAccount).cancelRequest(sendRequest, true);
                            }
                        });
                    }
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$YzxvArwJoxqAJS67rb5yOcGfFng(LaunchActivity launchActivity, Browser.Progress progress, boolean z, BetaUpdate betaUpdate) {
        BaseFragment lastFragment;
        launchActivity.getClass();
        BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
        if (progress != null) {
            progress.end();
            if (update == null && (lastFragment = getLastFragment()) != null) {
                BulletinFactory.of(lastFragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(R.string.YourVersionIsLatest)).show();
            }
        }
        if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            return;
        }
        if (z || betaUpdate == null || update.higherThan(betaUpdate)) {
            ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity, update, launchActivity.currentAccount);
        }
    }

    public static /* synthetic */ void $r8$lambda$yo2Gi3Su38wQ7mwDjRyF56aFnxc(final LaunchActivity launchActivity, final int i, final Browser.Progress progress, TLObject tLObject, final TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
        SharedConfig.saveConfig();
        if (tLObject instanceof TLRPC.TL_help_appUpdate) {
            final TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda116
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$p-98bJps-mfeYDwRzWRoVr27a0g(LaunchActivity.this, tL_help_appUpdate, i, progress);
                }
            });
        } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda117
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$wapiHdG72FN5MFPmWd4jD5OYV-Q(Browser.Progress.this);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda118
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$UEG0c11n5e6iSiI_ljqGyB01yc0(Browser.Progress.this, tL_error);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$p-98bJps-mfeYDwRzWRoVr27a0g(LaunchActivity launchActivity, TLRPC.TL_help_appUpdate tL_help_appUpdate, int i, Browser.Progress progress) {
        BaseFragment lastFragment;
        launchActivity.getClass();
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if (tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) {
            boolean newAppVersionAvailable = SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate);
            if (newAppVersionAvailable) {
                if (tL_help_appUpdate.can_not_skip) {
                    launchActivity.showUpdateActivity(i, tL_help_appUpdate, false);
                } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                    ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i);
                }
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.appUpdateAvailable, new Object[0]);
            }
            if (progress != null) {
                progress.end();
                if (newAppVersionAvailable || (lastFragment = getLastFragment()) == null) {
                    return;
                }
                BulletinFactory.of(lastFragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(R.string.YourVersionIsLatest)).show();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$wapiHdG72FN5MFPmWd4jD5OYV-Q(Browser.Progress progress) {
        if (progress != null) {
            progress.end();
            BaseFragment lastFragment = getLastFragment();
            if (lastFragment != null) {
                BulletinFactory.of(lastFragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(R.string.YourVersionIsLatest)).show();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$UEG0c11n5e6iSiI_ljqGyB01yc0(Browser.Progress progress, TLRPC.TL_error tL_error) {
        if (progress != null) {
            progress.end();
            BaseFragment lastFragment = getLastFragment();
            if (lastFragment != null) {
                BulletinFactory.of(lastFragment).showForError(tL_error);
            }
        }
    }

    public Dialog showAlertDialog(AlertDialog.Builder builder) {
        try {
            final AlertDialog show = builder.show();
            show.setCanceledOnTouchOutside(true);
            show.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda99
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LaunchActivity.$r8$lambda$aZQ37mMjDdc3qIQhJcJ9DH_PqDk(LaunchActivity.this, show, dialogInterface);
                }
            });
            this.visibleDialogs.add(show);
            return show;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static /* synthetic */ void $r8$lambda$aZQ37mMjDdc3qIQhJcJ9DH_PqDk(LaunchActivity launchActivity, AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (alertDialog != null) {
            if (alertDialog == launchActivity.localeDialog) {
                ActionBarLayout actionBarLayout = launchActivity.actionBarLayout;
                BaseFragment lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                try {
                    String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                    if (lastFragment != null) {
                        BulletinFactory.of(lastFragment).createSimpleBulletin(R.raw.msg_translate, launchActivity.getStringForLanguageAlert(str.equals("en") ? launchActivity.englishLocaleStrings : launchActivity.systemLocaleStrings, "ChangeLanguageLater", R.string.ChangeLanguageLater)).setDuration(5000).show();
                    } else {
                        BulletinFactory.of(Bulletin.BulletinWindow.make(launchActivity), null).createSimpleBulletin(R.raw.msg_translate, launchActivity.getStringForLanguageAlert(str.equals("en") ? launchActivity.englishLocaleStrings : launchActivity.systemLocaleStrings, "ChangeLanguageLater", R.string.ChangeLanguageLater)).setDuration(5000).show();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                launchActivity.localeDialog = null;
            } else if (alertDialog == launchActivity.proxyErrorDialog) {
                MessagesController.getGlobalMainSettings();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putBoolean("proxy_enabled", false);
                edit.putBoolean("proxy_enabled_calls", false);
                edit.commit();
                ConnectionsManager.setProxySettings(false, "", 1080, "", "", "");
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.proxySettingsChanged, new Object[0]);
                launchActivity.proxyErrorDialog = null;
            }
        }
        launchActivity.visibleDialogs.remove(alertDialog);
    }

    public void showBulletin(Function function) {
        BaseFragment baseFragment;
        if (!this.layerFragmentsStack.isEmpty()) {
            baseFragment = (BaseFragment) this.layerFragmentsStack.get(r0.size() - 1);
        } else if (!this.rightFragmentsStack.isEmpty()) {
            baseFragment = (BaseFragment) this.rightFragmentsStack.get(r0.size() - 1);
        } else if (this.mainFragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            baseFragment = (BaseFragment) this.mainFragmentsStack.get(r0.size() - 1);
        }
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            ((Bulletin) function.apply(BulletinFactory.of(baseFragment))).show();
        }
    }

    public void setNavigateToPremiumBot(boolean z) {
        this.navigateToPremiumBot = z;
    }

    public void setNavigateToPremiumGiftCallback(Runnable runnable) {
        this.navigateToPremiumGiftCallback = runnable;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent, true, false, false, null, true, true);
    }

    public void onNewIntent(Intent intent, Browser.Progress progress) {
        super.onNewIntent(intent);
        handleIntent(intent, true, false, false, progress, true, false);
    }

    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
    public boolean canSelectStories() {
        ArrayList arrayList = this.photoPathsArray;
        return (arrayList != null && arrayList.size() == 1) || this.videoPath != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r5 == null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0083 A[RETURN] */
    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        StoryEntry storyEntry;
        StoryEntry fromPhotoEntry;
        FileOutputStream fileOutputStream;
        ArrayList arrayList = this.photoPathsArray;
        if (arrayList != null && !arrayList.isEmpty()) {
            fromPhotoEntry = StoryEntry.fromMedia(this.photoPathsArray);
        } else {
            String str = this.videoPath;
            if (str == null) {
                storyEntry = null;
                if (storyEntry != null) {
                    return false;
                }
                StoriesController.StoryLimit checkStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit();
                if (dialogsActivity != null && checkStoryLimit != null && checkStoryLimit.active(this.currentAccount, 1)) {
                    dialogsActivity.showDialog(new LimitReachedBottomSheet(dialogsActivity, this, checkStoryLimit.getLimitReachedType(), this.currentAccount, null));
                    return false;
                }
                storyEntry.isShare = true;
                storyEntry.fileDeletable = false;
                StoryRecorder.getInstance(this, this.currentAccount).openEdit(null, storyEntry, 0L, true);
                if (dialogsActivity != null) {
                    dialogsActivity.finishFragment();
                }
                this.photoPathsArray = null;
                this.videoPath = null;
                this.voicePath = null;
                this.sendingText = null;
                this.documentsPathsArray = null;
                this.documentsOriginalPathsArray = null;
                this.contactsToSend = null;
                this.contactsToSendUri = null;
                this.exportingChatUri = null;
                return true;
            }
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            try {
                Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(this.videoPath, 1);
                File file = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        photoEntry.thumbPath = file.getAbsolutePath();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            FileLog.e(th);
                        } catch (Throwable th2) {
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
            fromPhotoEntry = StoryEntry.fromPhotoEntry(photoEntry);
        }
        storyEntry = fromPhotoEntry;
        if (storyEntry != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05c8 A[LOOP:3: B:189:0x05c0->B:191:0x05c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03c1  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v22, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v23 */
    @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean didSelectDialogs(final DialogsActivity dialogsActivity, final ArrayList arrayList, final CharSequence charSequence, final boolean z, boolean z2, int i, final int i2, TopicsFragment topicsFragment) {
        int i3;
        ChatActivity chatActivity;
        LaunchActivity launchActivity;
        CharSequence charSequence2;
        boolean z3;
        int i4;
        MessageObject messageObject;
        long j;
        long j2;
        ChatActivity chatActivity2;
        AccountInstance accountInstance;
        long j3;
        MessageObject messageObject2;
        boolean z4;
        boolean z5;
        boolean z6;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int size;
        ArrayList arrayList2;
        CharSequence charSequence5;
        long j4;
        ChatActivity chatActivity3;
        LaunchActivity launchActivity2;
        AccountInstance accountInstance2;
        ArrayList arrayList3;
        CharSequence charSequence6;
        int i5;
        ArrayList arrayList4;
        LaunchActivity launchActivity3;
        ?? r10;
        final int currentAccount = dialogsActivity != null ? dialogsActivity.getCurrentAccount() : this.currentAccount;
        final Uri uri = this.exportingChatUri;
        if (uri != null) {
            final ArrayList arrayList5 = this.documentsUrisArray != null ? new ArrayList(this.documentsUrisArray) : null;
            final AlertDialog alertDialog = new AlertDialog(this, 3);
            SendMessagesHelper.getInstance(currentAccount).prepareImportHistory(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, this.exportingChatUri, this.documentsUrisArray, new MessagesStorage.LongCallback() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda51
                @Override // org.telegram.messenger.MessagesStorage.LongCallback
                public final void run(long j5) {
                    LaunchActivity.$r8$lambda$eIl--7BASICIZ-V-AKvTkezaY9Y(LaunchActivity.this, currentAccount, dialogsActivity, z, arrayList5, uri, alertDialog, j5);
                }
            });
            try {
                alertDialog.showDelayed(300L);
            } catch (Exception unused) {
            }
            launchActivity3 = this;
            r10 = 0;
        } else {
            DialogsActivity dialogsActivity2 = dialogsActivity;
            final boolean z7 = dialogsActivity2 == null || dialogsActivity2.notify || z2;
            if (i != 0) {
                i3 = i;
            } else {
                i3 = dialogsActivity2 == null ? 0 : dialogsActivity2.scheduleDate;
            }
            if (arrayList.size() <= 1) {
                long j5 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                if (!AndroidUtilities.isTablet()) {
                    NotificationCenter.getInstance(currentAccount).postNotificationName(NotificationCenter.closeChats, new Object[0]);
                }
                if (DialogObject.isEncryptedDialog(j5)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j5));
                } else if (DialogObject.isUserDialog(j5)) {
                    bundle.putLong("user_id", j5);
                } else {
                    bundle.putLong("chat_id", -j5);
                }
                if (!MessagesController.getInstance(currentAccount).checkCanOpenChat(bundle, dialogsActivity2)) {
                    return false;
                }
                ChatActivity chatActivity4 = new ChatActivity(bundle);
                ForumUtilities.applyTopic(chatActivity4, (MessagesStorage.TopicKey) arrayList.get(0));
                chatActivity = chatActivity4;
            } else {
                chatActivity = null;
            }
            ArrayList arrayList6 = this.contactsToSend;
            int size2 = arrayList6 != null ? arrayList6.size() : 0;
            if (this.videoPath != null) {
                size2++;
            }
            if (this.voicePath != null) {
                size2++;
            }
            ArrayList arrayList7 = this.photoPathsArray;
            if (arrayList7 != null) {
                size2 += arrayList7.size();
            }
            ArrayList arrayList8 = this.documentsPathsArray;
            if (arrayList8 != null) {
                size2 += arrayList8.size();
            }
            ArrayList arrayList9 = this.documentsUrisArray;
            if (arrayList9 != null) {
                size2 += arrayList9.size();
            }
            if (this.videoPath == null && this.voicePath == null && this.photoPathsArray == null && this.documentsPathsArray == null && this.documentsUrisArray == null && this.sendingText != null) {
                size2++;
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                if (AlertsCreator.checkSlowMode(this, this.currentAccount, ((MessagesStorage.TopicKey) arrayList.get(i6)).dialogId, size2 > 1)) {
                    return false;
                }
            }
            if (topicsFragment != null) {
                topicsFragment.removeSelfFromStack();
            }
            ArrayList arrayList10 = this.contactsToSend;
            if (arrayList10 != null && arrayList10.size() == 1 && !this.mainFragmentsStack.isEmpty()) {
                ArrayList arrayList11 = this.mainFragmentsStack;
                PhonebookShareAlert phonebookShareAlert = new PhonebookShareAlert((BaseFragment) arrayList11.get(arrayList11.size() - 1), null, null, this.contactsToSendUri, null, null, null);
                final ChatActivity chatActivity5 = chatActivity;
                final int i7 = i3;
                launchActivity = this;
                chatActivity = chatActivity5;
                phonebookShareAlert.setDelegate(new ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda52
                    @Override // org.telegram.ui.Components.ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate
                    public final void didSelectContact(TLRPC.User user, boolean z8, int i8, long j6, boolean z9, long j7) {
                        LaunchActivity.$r8$lambda$u6SAkv6Y9tj3edHm3qmGEum9YCs(LaunchActivity.this, chatActivity5, arrayList, i7, i2, charSequence, currentAccount, z7, user, z8, i8, j6, z9, j7);
                    }

                    @Override // org.telegram.ui.Components.ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate
                    public /* synthetic */ void didSelectContacts(ArrayList arrayList12, String str, boolean z8, int i8, long j6, boolean z9, long j7) {
                        ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate.-CC.$default$didSelectContacts(this, arrayList12, str, z8, i8, j6, z9, j7);
                    }
                });
                ArrayList arrayList12 = launchActivity.mainFragmentsStack;
                ((BaseFragment) arrayList12.get(arrayList12.size() - 1)).showDialog(phonebookShareAlert);
                z3 = true;
            } else {
                launchActivity = this;
                ArrayList arrayList13 = arrayList;
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence2 = charSequence;
                } else {
                    launchActivity.sendingText = charSequence;
                    charSequence2 = null;
                }
                boolean z8 = dialogsActivity2 != null && dialogsActivity2.hasSharedMediaEntries();
                if (z8) {
                    ArrayList buildSendingInfosFromEntries = buildSendingInfosFromEntries(dialogsActivity2.getSharedMediaEntries());
                    launchActivity.photoPathsArray = buildSendingInfosFromEntries;
                    if (!buildSendingInfosFromEntries.isEmpty()) {
                        CharSequence charSequence7 = launchActivity.sendingText;
                        if (charSequence7 == null) {
                            charSequence7 = "";
                        }
                        CharSequence[] charSequenceArr = {charSequence7};
                        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(launchActivity.currentAccount).getEntities(charSequenceArr, false);
                        CharSequence charSequence8 = charSequenceArr[0];
                        String charSequence9 = charSequence8 == null ? null : charSequence8.toString();
                        for (int i8 = 0; i8 < launchActivity.photoPathsArray.size(); i8++) {
                            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) launchActivity.photoPathsArray.get(i8);
                            if (i8 == 0) {
                                sendingMediaInfo.caption = charSequence9;
                                sendingMediaInfo.entities = entities;
                            } else {
                                sendingMediaInfo.caption = null;
                                sendingMediaInfo.entities = null;
                            }
                        }
                    }
                    launchActivity.videoPath = null;
                    launchActivity.sendingText = null;
                }
                CharSequence charSequence10 = null;
                int i9 = 0;
                z3 = false;
                while (i9 < arrayList13.size()) {
                    long j6 = ((MessagesStorage.TopicKey) arrayList13.get(i9)).dialogId;
                    long j7 = ((MessagesStorage.TopicKey) arrayList13.get(i9)).topicId;
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    if (j7 != 0) {
                        i4 = i9;
                        TLRPC.TL_forumTopic findTopic = accountInstance3.getMessagesController().getTopicsController().findTopic(-j6, j7);
                        if (findTopic != null && findTopic.topicStartMessage != null) {
                            MessageObject messageObject3 = new MessageObject(accountInstance3.getCurrentAccount(), findTopic.topicStartMessage, false, false);
                            messageObject3.isTopicMainMessage = true;
                            messageObject = messageObject3;
                            if (chatActivity == null) {
                                j2 = j7;
                                launchActivity.getActionBarLayout().presentFragment(chatActivity, dialogsActivity2 != null, dialogsActivity2 == null || launchActivity.videoPath != null || ((arrayList4 = launchActivity.photoPathsArray) != null && arrayList4.size() > 0), true, false);
                                chatActivity2 = chatActivity;
                                z3 = dialogsActivity2 != null;
                                String str = launchActivity.videoPath;
                                if (str != null && j7 == 0 && !z8) {
                                    chatActivity2.openVideoEditor(str, launchActivity.sendingText);
                                    launchActivity.sendingText = null;
                                    z4 = z3;
                                    j = j6;
                                    accountInstance = accountInstance3;
                                    z5 = false;
                                    z6 = true;
                                    if (launchActivity.documentsPathsArray == null) {
                                    }
                                    charSequence3 = launchActivity.sendingText;
                                    if (charSequence3 != null) {
                                        ArrayList arrayList14 = launchActivity.documentsPathsArray;
                                        if (arrayList14 == null) {
                                        }
                                        arrayList2 = launchActivity.documentsUrisArray;
                                        if (size + (arrayList2 == null ? arrayList2.size() : 0) == 1) {
                                        }
                                    }
                                    CharSequence charSequence11 = charSequence10;
                                    int i10 = i3;
                                    SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) launchActivity.documentsPathsArray, (ArrayList<String>) launchActivity.documentsOriginalPathsArray, (ArrayList<Uri>) launchActivity.documentsUrisArray, charSequence11, launchActivity.documentsMimeType, j, messageObject, messageObject, (TL_stories.StoryItem) null, (ChatActivity.ReplyQuote) null, (MessageObject) null, z7, i10, (InputContentInfoCompat) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                    i3 = i10;
                                    charSequence4 = charSequence11;
                                    AccountInstance accountInstance4 = accountInstance;
                                    if (launchActivity.voicePath != null) {
                                    }
                                    ChatActivity chatActivity6 = chatActivity2;
                                    charSequence5 = launchActivity.sendingText;
                                    int i11 = i4;
                                    if (charSequence5 == null) {
                                    }
                                    arrayList3 = launchActivity2.contactsToSend;
                                    if (arrayList3 != null) {
                                        while (i5 < launchActivity2.contactsToSend.size()) {
                                        }
                                    }
                                    if (TextUtils.isEmpty(charSequence2)) {
                                    }
                                    charSequence6 = charSequence2;
                                    dialogsActivity2 = dialogsActivity;
                                    arrayList13 = arrayList;
                                    charSequence2 = charSequence6;
                                    chatActivity = chatActivity3;
                                    charSequence10 = charSequence4;
                                    z3 = z4;
                                    i9 = i11 + 1;
                                    launchActivity = launchActivity2;
                                } else {
                                    ArrayList arrayList15 = launchActivity.photoPathsArray;
                                    if (arrayList15 != null && arrayList15.size() > 0 && j7 == 0 && !z8) {
                                        boolean openPhotosEditor = chatActivity2.openPhotosEditor(launchActivity.photoPathsArray, (charSequence2 == null || charSequence2.length() == 0) ? launchActivity.sendingText : charSequence2);
                                        if (openPhotosEditor) {
                                            launchActivity.sendingText = null;
                                        }
                                        z4 = z3;
                                        j = j6;
                                        accountInstance = accountInstance3;
                                        z5 = openPhotosEditor;
                                        z6 = false;
                                        if (launchActivity.documentsPathsArray == null || launchActivity.documentsUrisArray != null) {
                                            charSequence3 = launchActivity.sendingText;
                                            if (charSequence3 != null && charSequence3.length() <= 1024) {
                                                ArrayList arrayList142 = launchActivity.documentsPathsArray;
                                                size = arrayList142 == null ? arrayList142.size() : 0;
                                                arrayList2 = launchActivity.documentsUrisArray;
                                                if (size + (arrayList2 == null ? arrayList2.size() : 0) == 1) {
                                                    charSequence10 = launchActivity.sendingText;
                                                    launchActivity.sendingText = null;
                                                }
                                            }
                                            CharSequence charSequence112 = charSequence10;
                                            int i102 = i3;
                                            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) launchActivity.documentsPathsArray, (ArrayList<String>) launchActivity.documentsOriginalPathsArray, (ArrayList<Uri>) launchActivity.documentsUrisArray, charSequence112, launchActivity.documentsMimeType, j, messageObject, messageObject, (TL_stories.StoryItem) null, (ChatActivity.ReplyQuote) null, (MessageObject) null, z7, i102, (InputContentInfoCompat) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                            i3 = i102;
                                            charSequence4 = charSequence112;
                                        } else {
                                            charSequence4 = charSequence10;
                                        }
                                        AccountInstance accountInstance42 = accountInstance;
                                        if (launchActivity.voicePath != null) {
                                            File file = new File(launchActivity.voicePath);
                                            if (file.exists()) {
                                                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                                                tL_document.file_reference = new byte[0];
                                                tL_document.dc_id = TLObject.FLAG_31;
                                                tL_document.id = SharedConfig.getLastLocalId();
                                                tL_document.user_id = accountInstance42.getUserConfig().getClientUserId();
                                                tL_document.mime_type = "audio/ogg";
                                                tL_document.date = accountInstance42.getConnectionsManager().getCurrentTime();
                                                tL_document.size = (int) file.length();
                                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                                tL_documentAttributeAudio.voice = true;
                                                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                                                tL_documentAttributeAudio.waveform = waveform;
                                                if (waveform != null) {
                                                    tL_documentAttributeAudio.flags |= 4;
                                                }
                                                tL_document.attributes.add(tL_documentAttributeAudio);
                                                CharSequence[] charSequenceArr2 = {launchActivity.sendingText};
                                                ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(launchActivity.currentAccount).getEntities(charSequenceArr2, false);
                                                SendMessagesHelper sendMessagesHelper = accountInstance42.getSendMessagesHelper();
                                                String absolutePath = file.getAbsolutePath();
                                                CharSequence charSequence12 = charSequenceArr2[0];
                                                long j8 = j;
                                                MessageObject messageObject4 = messageObject;
                                                SendMessagesHelper.SendMessageParams of = SendMessagesHelper.SendMessageParams.of(tL_document, null, absolutePath, j8, messageObject4, messageObject, charSequence12 == null ? null : charSequence12.toString(), entities2, null, null, z7, i3, i2, 0, null, null, false);
                                                j = j8;
                                                messageObject = messageObject4;
                                                sendMessagesHelper.sendMessage(of);
                                                if (launchActivity.sendingText != null) {
                                                    launchActivity.sendingText = null;
                                                }
                                            }
                                        }
                                        ChatActivity chatActivity62 = chatActivity2;
                                        charSequence5 = launchActivity.sendingText;
                                        int i112 = i4;
                                        if (charSequence5 == null) {
                                            j4 = j2;
                                            chatActivity3 = chatActivity62;
                                            launchActivity2 = launchActivity;
                                            accountInstance2 = accountInstance42;
                                            sendShareText(accountInstance2, dialogsActivity2, charSequence5, j, messageObject, j4, z7, i3, i2);
                                        } else {
                                            j4 = j2;
                                            chatActivity3 = chatActivity62;
                                            launchActivity2 = launchActivity;
                                            accountInstance2 = accountInstance42;
                                        }
                                        arrayList3 = launchActivity2.contactsToSend;
                                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                                            for (i5 = 0; i5 < launchActivity2.contactsToSend.size(); i5++) {
                                                TLRPC.User user = (TLRPC.User) launchActivity2.contactsToSend.get(i5);
                                                SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(currentAccount);
                                                long j9 = j;
                                                MessageObject messageObject5 = messageObject;
                                                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, j9, messageObject5, messageObject, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z7, i3, i2);
                                                j = j9;
                                                messageObject = messageObject5;
                                                sendMessagesHelper2.sendMessage(of2);
                                            }
                                        }
                                        if (!TextUtils.isEmpty(charSequence2) || z6 || z5) {
                                            charSequence6 = charSequence2;
                                        } else {
                                            charSequence6 = charSequence2;
                                            sendShareText(accountInstance2, dialogsActivity, charSequence6, j, messageObject, j4, z7, i3, i2);
                                        }
                                        dialogsActivity2 = dialogsActivity;
                                        arrayList13 = arrayList;
                                        charSequence2 = charSequence6;
                                        chatActivity = chatActivity3;
                                        charSequence10 = charSequence4;
                                        z3 = z4;
                                        i9 = i112 + 1;
                                        launchActivity = launchActivity2;
                                    } else if (launchActivity.videoPath != null) {
                                        CharSequence charSequence13 = launchActivity.sendingText;
                                        if (charSequence13 != null && charSequence13.length() <= 1024) {
                                            charSequence10 = launchActivity.sendingText;
                                            launchActivity.sendingText = null;
                                        }
                                        CharSequence charSequence14 = charSequence10;
                                        ArrayList arrayList16 = new ArrayList();
                                        arrayList16.add(launchActivity.videoPath);
                                        int i12 = i3;
                                        j = j6;
                                        accountInstance = accountInstance3;
                                        SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList16, (ArrayList<String>) arrayList16, (ArrayList<Uri>) null, charSequence14, (String) null, j, messageObject, messageObject, (TL_stories.StoryItem) null, (ChatActivity.ReplyQuote) null, (MessageObject) null, z7, i12, (InputContentInfoCompat) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                        z4 = z3;
                                        charSequence10 = charSequence14;
                                        i3 = i12;
                                    } else {
                                        j = j6;
                                        accountInstance = accountInstance3;
                                        ArrayList arrayList17 = launchActivity.photoPathsArray;
                                        if (arrayList17 != null && arrayList17.size() > 0) {
                                            CharSequence charSequence15 = launchActivity.sendingText;
                                            if (charSequence15 != null && charSequence15.length() <= 1024 && launchActivity.photoPathsArray.size() == 1) {
                                                CharSequence[] charSequenceArr3 = {launchActivity.sendingText};
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.photoPathsArray.get(0)).entities = MediaDataController.getInstance(launchActivity.currentAccount).getEntities(charSequenceArr3, false);
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.photoPathsArray.get(0)).caption = charSequenceArr3[0].toString();
                                                launchActivity.sendingText = null;
                                            }
                                            ArrayList arrayList18 = launchActivity.photoPathsArray;
                                            j3 = j;
                                            messageObject2 = messageObject;
                                            SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList18, j3, messageObject2, messageObject2, null, null, false, arrayList18.size() > 1, null, z7, i3, i2, 0, false, null, null, 0L, false, 0L, 0L, null);
                                            j = j3;
                                            messageObject = messageObject2;
                                        }
                                        z4 = z3;
                                    }
                                }
                            } else {
                                j = j6;
                                j2 = j7;
                                chatActivity2 = chatActivity;
                                accountInstance = accountInstance3;
                                if (launchActivity.videoPath != null) {
                                    CharSequence charSequence16 = launchActivity.sendingText;
                                    if (charSequence16 != null && charSequence16.length() <= 1024) {
                                        charSequence10 = launchActivity.sendingText;
                                        launchActivity.sendingText = null;
                                    }
                                    CharSequence charSequence17 = charSequence10;
                                    ArrayList arrayList19 = new ArrayList();
                                    arrayList19.add(launchActivity.videoPath);
                                    int i13 = i3;
                                    SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList19, (ArrayList<String>) arrayList19, (ArrayList<Uri>) null, charSequence17, (String) null, j, messageObject, messageObject, (TL_stories.StoryItem) null, (ChatActivity.ReplyQuote) null, (MessageObject) null, z7, i13, (InputContentInfoCompat) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                    i3 = i13;
                                    charSequence10 = charSequence17;
                                }
                                if (launchActivity.photoPathsArray != null) {
                                    CharSequence charSequence18 = launchActivity.sendingText;
                                    if (charSequence18 != null && charSequence18.length() <= 1024 && launchActivity.photoPathsArray.size() == 1) {
                                        CharSequence[] charSequenceArr4 = {launchActivity.sendingText};
                                        ((SendMessagesHelper.SendingMediaInfo) launchActivity.photoPathsArray.get(0)).entities = MediaDataController.getInstance(launchActivity.currentAccount).getEntities(charSequenceArr4, false);
                                        ((SendMessagesHelper.SendingMediaInfo) launchActivity.photoPathsArray.get(0)).caption = charSequenceArr4[0].toString();
                                        launchActivity.sendingText = null;
                                    }
                                    ArrayList arrayList20 = launchActivity.photoPathsArray;
                                    j3 = j;
                                    messageObject2 = messageObject;
                                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList20, j3, messageObject2, messageObject2, null, null, false, arrayList20.size() > 1, null, z7, i3, i2, 0, false, null, null, 0L, false, 0L, 0L, null);
                                    j = j3;
                                    messageObject = messageObject2;
                                }
                                z4 = z3;
                            }
                            z5 = false;
                            z6 = false;
                            if (launchActivity.documentsPathsArray == null) {
                            }
                            charSequence3 = launchActivity.sendingText;
                            if (charSequence3 != null) {
                            }
                            CharSequence charSequence1122 = charSequence10;
                            int i1022 = i3;
                            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) launchActivity.documentsPathsArray, (ArrayList<String>) launchActivity.documentsOriginalPathsArray, (ArrayList<Uri>) launchActivity.documentsUrisArray, charSequence1122, launchActivity.documentsMimeType, j, messageObject, messageObject, (TL_stories.StoryItem) null, (ChatActivity.ReplyQuote) null, (MessageObject) null, z7, i1022, (InputContentInfoCompat) null, (SendMessageChatArguments) null, 0L, false, 0L);
                            i3 = i1022;
                            charSequence4 = charSequence1122;
                            AccountInstance accountInstance422 = accountInstance;
                            if (launchActivity.voicePath != null) {
                            }
                            ChatActivity chatActivity622 = chatActivity2;
                            charSequence5 = launchActivity.sendingText;
                            int i1122 = i4;
                            if (charSequence5 == null) {
                            }
                            arrayList3 = launchActivity2.contactsToSend;
                            if (arrayList3 != null) {
                            }
                            if (TextUtils.isEmpty(charSequence2)) {
                            }
                            charSequence6 = charSequence2;
                            dialogsActivity2 = dialogsActivity;
                            arrayList13 = arrayList;
                            charSequence2 = charSequence6;
                            chatActivity = chatActivity3;
                            charSequence10 = charSequence4;
                            z3 = z4;
                            i9 = i1122 + 1;
                            launchActivity = launchActivity2;
                        }
                    } else {
                        i4 = i9;
                    }
                    messageObject = null;
                    if (chatActivity == null) {
                    }
                    z5 = false;
                    z6 = false;
                    if (launchActivity.documentsPathsArray == null) {
                    }
                    charSequence3 = launchActivity.sendingText;
                    if (charSequence3 != null) {
                    }
                    CharSequence charSequence11222 = charSequence10;
                    int i10222 = i3;
                    SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) launchActivity.documentsPathsArray, (ArrayList<String>) launchActivity.documentsOriginalPathsArray, (ArrayList<Uri>) launchActivity.documentsUrisArray, charSequence11222, launchActivity.documentsMimeType, j, messageObject, messageObject, (TL_stories.StoryItem) null, (ChatActivity.ReplyQuote) null, (MessageObject) null, z7, i10222, (InputContentInfoCompat) null, (SendMessageChatArguments) null, 0L, false, 0L);
                    i3 = i10222;
                    charSequence4 = charSequence11222;
                    AccountInstance accountInstance4222 = accountInstance;
                    if (launchActivity.voicePath != null) {
                    }
                    ChatActivity chatActivity6222 = chatActivity2;
                    charSequence5 = launchActivity.sendingText;
                    int i11222 = i4;
                    if (charSequence5 == null) {
                    }
                    arrayList3 = launchActivity2.contactsToSend;
                    if (arrayList3 != null) {
                    }
                    if (TextUtils.isEmpty(charSequence2)) {
                    }
                    charSequence6 = charSequence2;
                    dialogsActivity2 = dialogsActivity;
                    arrayList13 = arrayList;
                    charSequence2 = charSequence6;
                    chatActivity = chatActivity3;
                    charSequence10 = charSequence4;
                    z3 = z4;
                    i9 = i11222 + 1;
                    launchActivity = launchActivity2;
                }
            }
            launchActivity3 = launchActivity;
            ChatActivity chatActivity7 = chatActivity;
            if (dialogsActivity != null && chatActivity7 == null && !z3) {
                dialogsActivity.finishFragment();
            }
            r10 = 0;
        }
        launchActivity3.photoPathsArray = r10;
        launchActivity3.videoPath = r10;
        launchActivity3.voicePath = r10;
        launchActivity3.sendingText = r10;
        launchActivity3.documentsPathsArray = r10;
        launchActivity3.documentsOriginalPathsArray = r10;
        launchActivity3.contactsToSend = r10;
        launchActivity3.contactsToSendUri = r10;
        launchActivity3.exportingChatUri = r10;
        return true;
    }

    public static /* synthetic */ void $r8$lambda$eIl--7BASICIZ-V-AKvTkezaY9Y(LaunchActivity launchActivity, int i, DialogsActivity dialogsActivity, boolean z, ArrayList arrayList, Uri uri, AlertDialog alertDialog, long j) {
        if (j != 0) {
            launchActivity.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("scrollToTopOnResume", true);
            if (!AndroidUtilities.isTablet()) {
                NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.closeChats, new Object[0]);
            }
            if (DialogObject.isUserDialog(j)) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            ChatActivity chatActivity = new ChatActivity(bundle);
            chatActivity.setOpenImport();
            launchActivity.getActionBarLayout().presentFragment(chatActivity, dialogsActivity != null || z, dialogsActivity == null, true, false);
        } else {
            launchActivity.documentsUrisArray = arrayList;
            if (arrayList == null) {
                launchActivity.documentsUrisArray = new ArrayList();
            }
            launchActivity.documentsUrisArray.add(0, uri);
            launchActivity.openDialogsToSend(true);
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$u6SAkv6Y9tj3edHm3qmGEum9YCs(LaunchActivity launchActivity, ChatActivity chatActivity, ArrayList arrayList, int i, int i2, CharSequence charSequence, int i3, boolean z, TLRPC.User user, boolean z2, int i4, long j, boolean z3, long j2) {
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        if (chatActivity != null) {
            launchActivity.getActionBarLayout().presentFragment(chatActivity, true, false, true, false);
        } else {
            launchActivity.getClass();
        }
        AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(i5)).dialogId;
            long j4 = ((MessagesStorage.TopicKey) arrayList.get(i5)).topicId;
            if (j4 == 0 || (findTopic = accountInstance.getMessagesController().getTopicsController().findTopic(-j3, j4)) == null || findTopic.topicStartMessage == null) {
                messageObject = null;
            } else {
                messageObject = new MessageObject(accountInstance.getCurrentAccount(), findTopic.topicStartMessage, false, false);
                messageObject.isTopicMainMessage = true;
            }
            MessageObject messageObject2 = messageObject;
            SendMessagesHelper.SendMessageParams of = SendMessagesHelper.SendMessageParams.of(user, j3, messageObject2, messageObject2, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z2, i4 != 0 ? i4 : i, i2);
            if (TextUtils.isEmpty(charSequence)) {
                of.effect_id = j;
            }
            of.invert_media = z3;
            SendMessagesHelper.getInstance(i3).sendMessage(of);
            if (!TextUtils.isEmpty(charSequence)) {
                SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j3, z, i4 != 0 ? i4 : i, i2, j);
            }
        }
    }

    private static void sendShareText(AccountInstance accountInstance, DialogsActivity dialogsActivity, CharSequence charSequence, long j, MessageObject messageObject, long j2, boolean z, int i, int i2) {
        boolean z2 = dialogsActivity == null || dialogsActivity.isWebPagePreviewEnabled();
        TLRPC.WebPage sharedWebPage = (!z2 || dialogsActivity == null) ? null : dialogsActivity.getSharedWebPage();
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (sharedWebPage == null && z2) {
            SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j, j2, z, i, i2, 0L);
            return;
        }
        CharSequence trimmedString = SendMessagesHelper.getTrimmedString(charSequence);
        if (trimmedString == null || trimmedString.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = {trimmedString};
        accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j, messageObject, messageObject, sharedWebPage, z2, accountInstance.getMediaDataController().getEntities(charSequenceArr, true), null, null, z, i, i2, null, false));
    }

    private static ArrayList buildSendingInfosFromEntries(ArrayList arrayList) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                boolean z = photoEntry.isVideo;
                if (!z && (str = photoEntry.imagePath) != null) {
                    sendingMediaInfo.path = str;
                } else {
                    String str2 = photoEntry.path;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    }
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.isVideo = z;
                sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                sendingMediaInfo.highQuality = photoEntry.isHighQuality();
                arrayList2.add(sendingMediaInfo);
            }
        }
        return arrayList2;
    }

    private void onFinish() {
        Runnable runnable = this.lockRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.lockRunnable = null;
        }
        if (this.finished) {
            return;
        }
        this.finished = true;
        NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.observersGroup = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.globalObserversGroup;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.globalObserversGroup = null;
        }
        Utilities.Callback callback = this.onPowerSaverCallback;
        if (callback != null) {
            LiteMode.removeOnPowerSaverAppliedListener(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPowerSaver(boolean z) {
        BaseFragment lastFragment;
        if (this.actionBarLayout == null || !z || LiteMode.getPowerSaverLevel() >= 100 || (lastFragment = this.actionBarLayout.getLastFragment()) == null || (lastFragment instanceof LiteModeSettingsActivity)) {
            return;
        }
        int batteryLevel = LiteMode.getBatteryLevel();
        BulletinFactory.of(lastFragment).createSimpleBulletin(new BatteryDrawable(batteryLevel / 100.0f, -1, lastFragment.getThemedColor(Theme.key_dialogSwipeRemove), 1.3f), LocaleController.getString(R.string.LowPowerEnabledTitle), LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel))), LocaleController.getString(R.string.Disable), new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda70
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$zznh3fU23Z807r_FlJJ9Y-Q_LjM(LaunchActivity.this);
            }
        }).setDuration(5000).show();
    }

    public static /* synthetic */ void $r8$lambda$zznh3fU23Z807r_FlJJ9Y-Q_LjM(LaunchActivity launchActivity) {
        launchActivity.getClass();
        launchActivity.presentFragment(new LiteModeSettingsActivity());
    }

    public void presentFragment(BaseFragment baseFragment) {
        getActionBarLayout().presentFragment(baseFragment);
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2) {
        return getActionBarLayout().presentFragment(baseFragment, z, z2, true, false);
    }

    public INavigationLayout getActionBarLayout() {
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (this.sheetFragmentsStack.isEmpty()) {
            return actionBarLayout;
        }
        return (INavigationLayout) this.sheetFragmentsStack.get(r0.size() - 1);
    }

    public INavigationLayout getLayersActionBarLayout() {
        return this.layersActionBarLayout;
    }

    public INavigationLayout getRightActionBarLayout() {
        return this.rightActionBarLayout;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        VoIPService sharedInstance;
        boolean canDrawOverlays;
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onActivityResult");
            }
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        if (i == 105) {
            if (Build.VERSION.SDK_INT >= 23) {
                canDrawOverlays = Settings.canDrawOverlays(this);
                ApplicationLoader.canDrawOverlays = canDrawOverlays;
                if (canDrawOverlays) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                    if (groupCallActivity != null) {
                        groupCallActivity.dismissInternal();
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda42
                        @Override // java.lang.Runnable
                        public final void run() {
                            LaunchActivity.$r8$lambda$5x35tCuVVktvhU7fm5hJxmSylFg(LaunchActivity.this);
                        }
                    }, 200L);
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 520) {
            if (i2 != -1 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
            sharedInstance.createCaptureDevice(true);
            return;
        }
        if (i == 140) {
            LocationController.getInstance(this.currentAccount).startFusedLocationRequest(i2 == -1);
            return;
        }
        if (i == 521) {
            Utilities.Callback callback = this.webviewShareAPIDoneListener;
            if (callback != null) {
                callback.run(Boolean.valueOf(i2 == -1));
                this.webviewShareAPIDoneListener = null;
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.getInstance();
        if (themeEditorView != null) {
            themeEditorView.onActivityResult(i, i2, intent);
        }
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
            BaseFragment baseFragment = this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1);
            baseFragment.onActivityResultFragment(i, i2, intent);
            if (baseFragment.getLastStoryViewer() != null) {
                baseFragment.getLastStoryViewer().onActivityResult(i, i2, intent);
            }
        }
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout2 = this.rightActionBarLayout;
            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                this.rightActionBarLayout.getFragmentStack().get(this.rightActionBarLayout.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
            }
            ActionBarLayout actionBarLayout3 = this.layersActionBarLayout;
            if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                this.layersActionBarLayout.getFragmentStack().get(this.layersActionBarLayout.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
            }
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.onActivityResultReceived, Integer.valueOf(i), Integer.valueOf(i2), intent);
    }

    public static /* synthetic */ void $r8$lambda$5x35tCuVVktvhU7fm5hJxmSylFg(LaunchActivity launchActivity) {
        launchActivity.getClass();
        GroupCallPip.clearForce();
        GroupCallPip.updateVisibility(launchActivity);
    }

    public void whenWebviewShareAPIDone(Utilities.Callback callback) {
        this.webviewShareAPIDoneListener = callback;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (checkPermissionsResult(i, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader == null || !applicationLoader.checkRequestPermissionResult(i, strArr, iArr)) {
                if (this.actionBarLayout.getFragmentStack().size() != 0) {
                    this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                }
                if (AndroidUtilities.isTablet()) {
                    if (this.rightActionBarLayout.getFragmentStack().size() != 0) {
                        this.rightActionBarLayout.getFragmentStack().get(this.rightActionBarLayout.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                    }
                    if (this.layersActionBarLayout.getFragmentStack().size() != 0) {
                        this.layersActionBarLayout.getFragmentStack().get(this.layersActionBarLayout.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                    }
                }
                VoIPFragment.onRequestPermissionsResult(i, strArr, iArr);
                StoryRecorder.onRequestPermissionsResult(i, strArr, iArr);
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i), strArr, iArr);
                if (this.requestedPermissions.get(i, -1) >= 0) {
                    int i2 = this.requestedPermissions.get(i, -1);
                    this.requestedPermissions.delete(i);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.permissionsGranted, Integer.valueOf(i2));
                }
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.activityPermissionsGranted, Integer.valueOf(i), strArr, iArr);
            }
        }
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        this.voipLaunchedInBackground = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        isResumed = false;
        this.pipActivityHandler.onPause();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        final int i = this.currentAccount;
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$UzebAUMBPS6SjrqNt0yVXi5i5vc(i);
            }
        });
        onPasscodePause();
        this.actionBarLayout.onPause();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.rightActionBarLayout;
            if (actionBarLayout != null) {
                actionBarLayout.onPause();
            }
            ActionBarLayout actionBarLayout2 = this.layersActionBarLayout;
            if (actionBarLayout2 != null) {
                actionBarLayout2.onPause();
            }
        }
        PasscodeViewDialog passcodeViewDialog = this.passcodeDialog;
        if (passcodeViewDialog != null) {
            passcodeViewDialog.passcodeView.onPause();
        }
        Iterator it = this.overlayPasscodeViews.iterator();
        while (it.hasNext()) {
            ((PasscodeView) it.next()).onPause();
        }
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(!(ApplicationLoader.applicationLoaderInstance != null ? r1.onPause() : false), false);
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().onPause();
        }
        StoryRecorder.onPause();
        if (VoIPFragment.getInstance() != null) {
            VoIPFragment.onPause();
        }
        SpoilerEffect2.pause(true);
    }

    public static /* synthetic */ void $r8$lambda$UzebAUMBPS6SjrqNt0yVXi5i5vc(int i) {
        ApplicationLoader.mainInterfacePausedStageQueue = true;
        ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
        if (VoIPService.getSharedInstance() == null) {
            MessagesController.getInstance(i).ignoreSetOnline = false;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.isStarted = true;
        this.pipActivityHandler.onStart();
        Browser.bindCustomTabsService(this);
        ApplicationLoader.mainInterfaceStopped = false;
        GroupCallPip.updateVisibility(this);
        GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.onResume();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.isStarted = false;
        this.pipActivityHandler.onStop();
        Browser.unbindCustomTabsService(this);
        ApplicationLoader.mainInterfaceStopped = true;
        GroupCallPip.updateVisibility(this);
        GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.onPause();
        }
    }

    @Override // android.app.Activity
    public boolean onPictureInPictureRequested() {
        this.pipActivityHandler.onPictureInPictureRequested();
        return super.onPictureInPictureRequested();
    }

    @Override // android.app.Activity
    public void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        this.pipActivityHandler.setPictureInPictureParams(pictureInPictureParams);
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.pipActivityHandler.onPictureInPictureUiStateChanged(pictureInPictureUiState);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        this.pipActivityHandler.onPictureInPictureModeChanged(z, configuration);
        if (z || this.isStarted) {
            return;
        }
        if (RTMPStreamPipOverlay.isVisible()) {
            RTMPStreamPipOverlay.dismiss();
        }
        if (LiveStoryPipOverlay.isVisible()) {
            LiveStoryPipOverlay.dismiss();
        }
        if (PipVideoOverlay.isVisible()) {
            PipVideoOverlay.dismiss();
        }
        GroupCallActivity.onLeaveClick(this, null, false, true);
        if (PhotoViewer.getPipInstance() != null) {
            PhotoViewer.getPipInstance().destroyPhotoViewer();
        }
        if (PhotoViewer.hasInstance()) {
            PhotoViewer.getInstance().closePhoto(false, false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        FrameMetricsOverlayView frameMetricsOverlayView;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        isActive = false;
        activeInstanceCount--;
        unregisterReceiver(this.batteryReceiver);
        if (activeInstanceCount == 0) {
            onDestroyStaticResources();
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.feedbackView, false);
        for (int i = 0; i < this.visibleDialogs.size(); i++) {
            try {
                if (((Dialog) this.visibleDialogs.get(i)).isShowing()) {
                    ((Dialog) this.visibleDialogs.get(i)).dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.visibleDialogs.clear();
        try {
            if (this.onGlobalLayoutListener != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            if (LaunchActivity$$ExternalSyntheticApiModelOutline4.m(this.onBackAnimationCallback)) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.unregisterOnBackInvokedCallback(LaunchActivity$$ExternalSyntheticApiModelOutline3.m(this.onBackAnimationCallback));
            }
        } else if (i2 >= 33 && LaunchActivity$$ExternalSyntheticApiModelOutline5.m(this.onBackAnimationCallback)) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticApiModelOutline0.m(this.onBackInvokedCallback));
        }
        Bulletin.removeDelegate(this.frameLayout);
        VideoAds.dropCache();
        clearFragments();
        super.onDestroy();
        onFinish();
        FlagSecureReason flagSecureReason = this.flagSecureReason;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i2 < 24 || (frameMetricsOverlayView = this.frameMetricsOverlayView) == null) {
            return;
        }
        frameMetricsOverlayView.detach();
    }

    private static void onDestroyStaticResources() {
        if (PhotoViewer.getPipInstance() != null) {
            PhotoViewer.getPipInstance().destroyPhotoViewer();
        }
        if (PhotoViewer.hasInstance()) {
            PhotoViewer.getInstance().destroyPhotoViewer();
        }
        if (SecretMediaViewer.hasInstance()) {
            SecretMediaViewer.getInstance().destroyPhotoViewer();
        }
        if (ArticleViewer.hasInstance()) {
            ArticleViewer.getInstance().destroyArticleViewer();
        }
        if (ContentPreviewViewer.hasInstance()) {
            ContentPreviewViewer.getInstance().destroy();
        }
        GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.dismissInternal();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.getInstance();
        if (pipRoundVideoView != null) {
            pipRoundVideoView.close(false);
        }
        Theme.destroyResources();
        EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.getInstance();
        if (embedBottomSheet != null) {
            embedBottomSheet.destroy();
        }
        ThemeEditorView themeEditorView = ThemeEditorView.getInstance();
        if (themeEditorView != null) {
            themeEditorView.destroy();
        }
        FloatingDebugController.onDestroy();
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        this.pipActivityHandler.onUserLeaveHint();
        Iterator it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (actionBarLayout != null) {
            actionBarLayout.onUserLeaveHint();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        boolean canDrawOverlays;
        MessageObject playingMessageObject;
        super.onResume();
        isResumed = true;
        this.pipActivityHandler.onResume();
        Runnable runnable = onResumeStaticCallback;
        if (runnable != null) {
            runnable.run();
            onResumeStaticCallback = null;
        }
        if (Theme.selectedAutoNightType == 3) {
            Theme.checkAutoNightThemeConditions();
        }
        checkWasMutedByAdmin(true);
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.actionBarLayout.getView();
        this.feedbackView = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.currentAccount).sortDialogs(null);
        showLanguageAlert(false);
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$JZs5Xv-OtGdaFncjFq2P6uuXA1Q();
            }
        });
        checkFreeDiscSpace(0);
        MediaController.checkGallery();
        onPasscodeResume();
        PasscodeViewDialog passcodeViewDialog = this.passcodeDialog;
        if (passcodeViewDialog == null || passcodeViewDialog.passcodeView.getVisibility() != 0) {
            this.actionBarLayout.onResume();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.rightActionBarLayout;
                if (actionBarLayout != null) {
                    actionBarLayout.onResume();
                }
                ActionBarLayout actionBarLayout2 = this.layersActionBarLayout;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.onResume();
                }
            }
        } else {
            this.actionBarLayout.dismissDialogs();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.rightActionBarLayout;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.dismissDialogs();
                }
                ActionBarLayout actionBarLayout4 = this.layersActionBarLayout;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.dismissDialogs();
                }
            }
            this.passcodeDialog.passcodeView.onResume();
            Iterator it = this.overlayPasscodeViews.iterator();
            while (it.hasNext()) {
                ((PasscodeView) it.next()).onResume();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        updateCurrentConnectionState(this.currentAccount);
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().onResume();
        }
        StoryRecorder.onResume();
        if (PipRoundVideoView.getInstance() != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            MediaController.getInstance().seekToProgress(playingMessageObject, playingMessageObject.audioProgress);
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).unacceptedTermsOfService != null) {
            int i = UserConfig.selectedAccount;
            showTosActivity(i, UserConfig.getInstance(i).unacceptedTermsOfService);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = SharedConfig.pendingAppUpdate;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                showUpdateActivity(UserConfig.selectedAccount, SharedConfig.pendingAppUpdate, true);
            }
        }
        checkAppUpdate(false, null);
        if (Build.VERSION.SDK_INT >= 23) {
            canDrawOverlays = Settings.canDrawOverlays(this);
            ApplicationLoader.canDrawOverlays = canDrawOverlays;
        }
        if (VoIPFragment.getInstance() != null) {
            VoIPFragment.onResume();
        }
        invalidateTabletMode();
        SpoilerEffect2.pause(false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onResume();
        }
        Runnable runnable2 = whenResumed;
        if (runnable2 != null) {
            runnable2.run();
            whenResumed = null;
        }
        if (MessagesController.getInstance(this.currentAccount).hasSetupEmailSuggestion()) {
            MessagesController.getInstance(this.currentAccount).checkPromoInfo(true);
        }
    }

    public static /* synthetic */ void $r8$lambda$JZs5Xv-OtGdaFncjFq2P6uuXA1Q() {
        ApplicationLoader.mainInterfacePausedStageQueue = false;
        ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
    }

    private void invalidateTabletMode() {
        long j;
        Boolean wasTablet = AndroidUtilities.getWasTablet();
        if (wasTablet == null) {
            return;
        }
        AndroidUtilities.resetWasTabletFlag();
        if (wasTablet.booleanValue() != AndroidUtilities.isTablet()) {
            int i = 0;
            long j2 = 0;
            if (wasTablet.booleanValue()) {
                this.mainFragmentsStack.addAll(this.rightFragmentsStack);
                this.mainFragmentsStack.addAll(this.layerFragmentsStack);
                this.rightFragmentsStack.clear();
                this.layerFragmentsStack.clear();
                j = 0;
            } else {
                ArrayList arrayList = new ArrayList(this.mainFragmentsStack);
                this.mainFragmentsStack.clear();
                this.rightFragmentsStack.clear();
                this.layerFragmentsStack.clear();
                int size = arrayList.size();
                long j3 = 0;
                j = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    BaseFragment baseFragment = (BaseFragment) obj;
                    if (!(baseFragment instanceof MainTabsActivity)) {
                        if (baseFragment instanceof DialogsActivity) {
                            DialogsActivity dialogsActivity = (DialogsActivity) baseFragment;
                            if (dialogsActivity.isMainDialogList() && !dialogsActivity.isArchive() && !dialogsActivity.isCommunity()) {
                            }
                        }
                        if (baseFragment instanceof ChatActivity) {
                            ChatActivity chatActivity = (ChatActivity) baseFragment;
                            if (!chatActivity.isInScheduleMode()) {
                                this.rightFragmentsStack.add(baseFragment);
                                if (j3 == 0) {
                                    j3 = chatActivity.getDialogId();
                                    j = chatActivity.getTopicId();
                                }
                            }
                        }
                        this.layerFragmentsStack.add(baseFragment);
                    }
                    this.mainFragmentsStack.add(baseFragment);
                }
                j2 = j3;
            }
            setupActionBarLayout();
            this.actionBarLayout.rebuildFragments(1);
            if (AndroidUtilities.isTablet()) {
                this.rightActionBarLayout.rebuildFragments(1);
                this.layersActionBarLayout.rebuildFragments(1);
                ArrayList arrayList2 = this.mainFragmentsStack;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    Object obj3 = (BaseFragment) obj2;
                    if (obj3 instanceof MainTabsActivity) {
                        obj3 = ((MainTabsActivity) obj3).getDialogsActivity();
                    }
                    if (obj3 instanceof DialogsActivity) {
                        DialogsActivity dialogsActivity2 = (DialogsActivity) obj3;
                        if (dialogsActivity2.isMainDialogList()) {
                            dialogsActivity2.setOpenedDialogId(j2, j);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        this.pipActivityHandler.onConfigurationChanged(configuration);
        AndroidUtilities.resetTabletFlag();
        invalidateTabletMode();
        checkLayout();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.getInstance();
        if (pipRoundVideoView != null) {
            pipRoundVideoView.onConfigurationChanged();
        }
        EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.getInstance();
        if (embedBottomSheet != null) {
            embedBottomSheet.onConfigurationChanged(configuration);
        }
        BoostPagerBottomSheet boostPagerBottomSheet = BoostPagerBottomSheet.getInstance();
        if (boostPagerBottomSheet != null) {
            boostPagerBottomSheet.onConfigurationChanged(configuration);
        }
        PhotoViewer pipInstance = PhotoViewer.getPipInstance();
        if (pipInstance != null) {
            pipInstance.onConfigurationChanged(configuration);
        }
        ThemeEditorView themeEditorView = ThemeEditorView.getInstance();
        if (themeEditorView != null) {
            themeEditorView.onConfigurationChanged();
        }
        if (Theme.selectedAutoNightType == 3) {
            Theme.checkAutoNightThemeConditions();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        AndroidUtilities.isInMultiwindow = z;
        checkLayout();
        super.onMultiWindowModeChanged(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02be, code lost:
    
        if (((org.telegram.ui.ProfileActivity) r2.get(r2.size() - 1)).isSettings() == false) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05fa  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void didReceivedNotification(int i, final int i2, Object... objArr) {
        BulletinFactory global;
        final Bulletin createSimpleBulletinWithIconSize;
        BaseFragment baseFragment;
        GroupCallActivity groupCallActivity;
        BaseFragment baseFragment2;
        char c;
        boolean z;
        ActionBarLayout actionBarLayout;
        boolean z2;
        BaseFragment baseFragment3;
        boolean z3 = false;
        if (i == NotificationCenter.appDidLogout) {
            switchToAvailableAccountOrLogout();
            return;
        }
        if (i == NotificationCenter.openBoostForUsersDialog) {
            Long l = (Long) objArr[0];
            l.getClass();
            processBoostDialog(l, null, null, objArr.length > 1 ? (ChatMessageCell) objArr[1] : null);
            return;
        }
        if (i == NotificationCenter.closeOtherAppActivities) {
            if (objArr[0] != this) {
                onFinish();
                finish();
                return;
            }
            return;
        }
        if (i == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(i2).getConnectionState();
            if (this.currentConnectionState != connectionState) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("switch to state " + connectionState);
                }
                this.currentConnectionState = connectionState;
                updateCurrentConnectionState(i2);
                return;
            }
            return;
        }
        if (i == NotificationCenter.mainUserInfoChanged || i == NotificationCenter.attachMenuBotsDidLoad) {
            return;
        }
        if (i == NotificationCenter.needShowAlert) {
            Integer num = (Integer) objArr[0];
            if (num.intValue() != 6) {
                if (num.intValue() != 3 || this.proxyErrorDialog == null) {
                    if (num.intValue() == 4) {
                        showTosActivity(i2, (TLRPC.TL_help_termsOfService) objArr[1]);
                        return;
                    }
                    if (this.mainFragmentsStack.isEmpty()) {
                        baseFragment3 = null;
                    } else {
                        ArrayList arrayList = this.mainFragmentsStack;
                        baseFragment3 = (BaseFragment) arrayList.get(arrayList.size() - 1);
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle(LocaleController.getString(R.string.AppName));
                    if (baseFragment3 != null) {
                        Map hashMap = new HashMap();
                        int i3 = Theme.key_dialogTopBackground;
                        hashMap.put("info1", Integer.valueOf(baseFragment3.getThemedColor(i3)));
                        hashMap.put("info2", Integer.valueOf(baseFragment3.getThemedColor(i3)));
                        builder.setTopAnimation(R.raw.not_available, 52, false, baseFragment3.getThemedColor(i3), hashMap);
                        builder.setTopAnimationIsNew(true);
                    }
                    if (num.intValue() != 2 && num.intValue() != 3) {
                        builder.setNegativeButton(LocaleController.getString(R.string.MoreInfo), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda8
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i4) {
                                LaunchActivity.$r8$lambda$4EhJFoDtzDzLUcDrGY3A_DOcjqI(LaunchActivity.this, i2, alertDialog, i4);
                            }
                        });
                    }
                    if (num.intValue() == 5) {
                        builder.setMessage(LocaleController.getString(R.string.NobodyLikesSpam3));
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    } else if (num.intValue() == 0) {
                        builder.setMessage(LocaleController.getString(R.string.NobodyLikesSpam1));
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    } else if (num.intValue() == 1) {
                        builder.setMessage(LocaleController.getString(R.string.NobodyLikesSpam2));
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    } else if (num.intValue() == 2) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf((String) objArr[1]);
                        String str = (String) objArr[2];
                        if (str.startsWith("PREMIUM_GIFT_SELF_REQUIRED_")) {
                            String str2 = (String) objArr[1];
                            int indexOf = str2.indexOf(42);
                            int i4 = indexOf + 1;
                            int indexOf2 = str2.indexOf(42, i4);
                            if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
                                valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) str2.substring(i4, indexOf2));
                                valueOf.setSpan(new ClickableSpan() { // from class: org.telegram.ui.LaunchActivity.16
                                    @Override // android.text.style.ClickableSpan
                                    public void onClick(View view) {
                                        LaunchActivity.this.getActionBarLayout().presentFragment(new PremiumPreviewFragment("gift"));
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public void updateDrawState(TextPaint textPaint) {
                                        super.updateDrawState(textPaint);
                                        textPaint.setUnderlineText(false);
                                    }
                                }, indexOf, indexOf2 - 1, 33);
                            }
                        }
                        builder.setMessage(valueOf);
                        if (str.startsWith("AUTH_KEY_DROP_")) {
                            builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
                            builder.setNegativeButton(LocaleController.getString(R.string.LogOut), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda13
                                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                                public final void onClick(AlertDialog alertDialog, int i5) {
                                    MessagesController.getInstance(LaunchActivity.this.currentAccount).performLogout(2);
                                }
                            });
                        } else if (str.startsWith("PREMIUM_")) {
                            builder.setTitle(LocaleController.getString(R.string.TelegramPremium));
                            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        } else {
                            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        }
                    } else if (num.intValue() == 3) {
                        builder.setTitle(LocaleController.getString(R.string.Proxy));
                        builder.setMessage(LocaleController.getString(R.string.UseProxyTelegramError));
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        this.proxyErrorDialog = showAlertDialog(builder);
                        return;
                    }
                    builder.show();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.wasUnableToFindCurrentLocation) {
            final HashMap hashMap2 = (HashMap) objArr[0];
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setTitle(LocaleController.getString(R.string.AppName));
            builder2.setPositiveButton(LocaleController.getString(R.string.OK), null);
            builder2.setNegativeButton(LocaleController.getString(R.string.ShareYouLocationUnableManually), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda14
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i5) {
                    LaunchActivity.$r8$lambda$8OEH3UiTGtThBaLqBOqGm5jGeqU(LaunchActivity.this, hashMap2, i2, alertDialog, i5);
                }
            });
            builder2.setMessage(LocaleController.getString(R.string.ShareYouLocationUnable));
            if (this.mainFragmentsStack.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.mainFragmentsStack;
            ((BaseFragment) arrayList2.get(arrayList2.size() - 1)).showDialog(builder2.create());
            return;
        }
        if (i == NotificationCenter.didSetNewWallpapper) {
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.backgroundTablet;
            if (sizeNotifierFrameLayout != null) {
                sizeNotifierFrameLayout.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion());
                return;
            }
            return;
        }
        if (i == NotificationCenter.didSetPasscode) {
            this.flagSecureReason.invalidate();
            return;
        }
        if (i == NotificationCenter.reloadInterface) {
            if (this.mainFragmentsStack.size() > 1) {
                ArrayList arrayList3 = this.mainFragmentsStack;
                if (arrayList3.get(arrayList3.size() - 1) instanceof ProfileActivity) {
                    z2 = true;
                    if (z2) {
                        ArrayList arrayList4 = this.mainFragmentsStack;
                    }
                    z3 = z2;
                    rebuildAllFragments(z3);
                    return;
                }
            }
            z2 = false;
            if (z2) {
            }
            z3 = z2;
            rebuildAllFragments(z3);
            return;
        }
        if (i == NotificationCenter.suggestedLangpack) {
            showLanguageAlert(false);
            return;
        }
        if (i == NotificationCenter.openArticle) {
            if (this.mainFragmentsStack.isEmpty()) {
                return;
            }
            LaunchActivity launchActivity = instance;
            if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || instance.getBottomSheetTabs().tryReopenTab((TLRPC.TL_webPage) objArr[0]) == null) {
                ArrayList arrayList5 = this.mainFragmentsStack;
                ((BaseFragment) arrayList5.get(arrayList5.size() - 1)).createArticleViewer(false).open((TLRPC.TL_webPage) objArr[0], (String) objArr[1]);
                return;
            }
            return;
        }
        if (i == NotificationCenter.hasNewContactsToImport) {
            ActionBarLayout actionBarLayout2 = this.actionBarLayout;
            if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                return;
            }
            ((Integer) objArr[0]).getClass();
            final HashMap hashMap3 = (HashMap) objArr[1];
            final boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            final boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            BaseFragment baseFragment4 = this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1);
            AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
            builder3.setTopAnimation(R.raw.permission_request_contacts, 72, false, Theme.getColor(Theme.key_dialogTopBackground));
            builder3.setTitle(LocaleController.getString(R.string.UpdateContactsTitle));
            builder3.setMessage(LocaleController.getString(R.string.UpdateContactsMessage));
            builder3.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda15
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i5) {
                    ContactsController.getInstance(i2).syncPhoneBookByAlert(hashMap3, booleanValue, booleanValue2, false);
                }
            });
            builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda16
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i5) {
                    ContactsController.getInstance(i2).syncPhoneBookByAlert(hashMap3, booleanValue, booleanValue2, true);
                }
            });
            builder3.setOnBackButtonListener(new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda17
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i5) {
                    ContactsController.getInstance(i2).syncPhoneBookByAlert(hashMap3, booleanValue, booleanValue2, true);
                }
            });
            AlertDialog create = builder3.create();
            baseFragment4.showDialog(create);
            create.setCanceledOnTouchOutside(false);
            return;
        }
        if (i == NotificationCenter.didSetNewTheme) {
            if (!((Boolean) objArr[0]).booleanValue()) {
                try {
                    setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, Theme.getColor(Theme.key_actionBarDefault) | (-16777216)));
                } catch (Exception unused) {
                }
            }
            boolean booleanValue3 = objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : true;
            boolean z4 = objArr.length > 2 && ((Boolean) objArr[2]).booleanValue();
            if (booleanValue3 && !this.isNavigationBarColorFrozen && !this.actionBarLayout.isTransitionAnimationInProgress()) {
                z3 = true;
            }
            checkSystemBarColors(z4, true, z3);
            return;
        }
        if (i == NotificationCenter.needSetDayNightTheme) {
            if (objArr[2] != null) {
                if (this.themeSwitchImageView.getVisibility() == 0) {
                    return;
                }
                try {
                    int[] iArr = (int[]) objArr[2];
                    final boolean booleanValue4 = ((Boolean) objArr[4]).booleanValue();
                    final RLottieImageView rLottieImageView = (RLottieImageView) objArr[5];
                    c = 3;
                    try {
                        if (objArr.length > 8) {
                            ((Boolean) objArr[8]).getClass();
                        }
                        int measuredWidth = this.drawerLayoutContainer.getMeasuredWidth();
                        int measuredHeight = this.drawerLayoutContainer.getMeasuredHeight();
                        if (!booleanValue4 && rLottieImageView != null) {
                            rLottieImageView.setVisibility(4);
                        }
                        this.rippleAbove = null;
                        if (objArr.length > 6) {
                            this.rippleAbove = (View) objArr[6];
                        }
                        this.isNavigationBarColorFrozen = true;
                        invalidateCachedViews(this.drawerLayoutContainer);
                        View view = this.rippleAbove;
                        if (view != null && view.getBackground() != null) {
                            this.rippleAbove.getBackground().setAlpha(0);
                        }
                        Bitmap bitmapFromWindow = Build.VERSION.SDK_INT >= 26 ? AndroidUtilities.getBitmapFromWindow(getWindow()) : null;
                        if (bitmapFromWindow == null) {
                            bitmapFromWindow = AndroidUtilities.snapshotView(this.drawerLayoutContainer);
                        }
                        View view2 = this.rippleAbove;
                        if (view2 != null && view2.getBackground() != null) {
                            this.rippleAbove.getBackground().setAlpha(NotificationCenter.didReceiveSmsCode);
                        }
                        this.frameLayout.removeView(this.themeSwitchImageView);
                        this.themeSwitchImageView = new ImageView(this);
                        final RLottieDrawable animatedDrawable = rLottieImageView != null ? rLottieImageView.getAnimatedDrawable() : null;
                        this.themeSwitchSunView.setImageDrawable(animatedDrawable);
                        if (booleanValue4) {
                            this.frameLayout.addView(this.themeSwitchImageView, 0, LayoutHelper.createFrame(-1, -1.0f));
                            this.themeSwitchSunView.setVisibility(8);
                        } else {
                            this.frameLayout.addView(this.themeSwitchImageView, 1, LayoutHelper.createFrame(-1, -1.0f));
                            this.themeSwitchSunView.setTranslationX(iArr[0] - AndroidUtilities.dp(24.0f));
                            this.themeSwitchSunView.setTranslationY(iArr[1] - AndroidUtilities.dp(24.0f));
                            this.themeSwitchSunView.setVisibility(0);
                            this.themeSwitchSunView.invalidate();
                        }
                        this.themeSwitchImageView.setImageBitmap(bitmapFromWindow);
                        this.themeSwitchImageView.setVisibility(0);
                        int i5 = measuredWidth - iArr[0];
                        int i6 = measuredHeight - iArr[1];
                        double sqrt = Math.sqrt((i5 * i5) + (i6 * i6));
                        int i7 = iArr[0];
                        int i8 = measuredHeight - iArr[1];
                        float max = (float) Math.max(sqrt, Math.sqrt((i7 * i7) + (i8 * i8)));
                        int i9 = measuredWidth - iArr[0];
                        int i10 = iArr[1];
                        double sqrt2 = Math.sqrt((i9 * i9) + (i10 * i10));
                        int i11 = iArr[0];
                        int i12 = iArr[1];
                        float max2 = Math.max(max, (float) Math.max(sqrt2, Math.sqrt((i11 * i11) + (i12 * i12))));
                        View view3 = booleanValue4 ? this.drawerLayoutContainer : this.themeSwitchImageView;
                        int i13 = iArr[0];
                        int i14 = iArr[1];
                        float f = booleanValue4 ? 0.0f : max2;
                        if (!booleanValue4) {
                            max2 = 0.0f;
                        }
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view3, i13, i14, f, max2);
                        createCircularReveal.setDuration(400L);
                        createCircularReveal.setInterpolator(Easings.easeInOutQuad);
                        createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LaunchActivity.17
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                RLottieImageView rLottieImageView2;
                                LaunchActivity.this.rippleAbove = null;
                                LaunchActivity.this.drawerLayoutContainer.invalidate();
                                LaunchActivity.this.themeSwitchImageView.invalidate();
                                LaunchActivity.this.themeSwitchImageView.setImageDrawable(null);
                                LaunchActivity.this.themeSwitchImageView.setVisibility(8);
                                LaunchActivity.this.themeSwitchSunView.setVisibility(8);
                                RLottieImageView rLottieImageView3 = rLottieImageView;
                                if (rLottieImageView3 != null) {
                                    rLottieImageView3.setImageDrawable(animatedDrawable);
                                }
                                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.themeAccentListUpdated, new Object[0]);
                                if (!booleanValue4 && (rLottieImageView2 = rLottieImageView) != null) {
                                    rLottieImageView2.setVisibility(0);
                                }
                                DialogsActivity.switchingTheme = false;
                            }
                        });
                        if (this.rippleAbove != null) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda18
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    LaunchActivity.this.frameLayout.invalidate();
                                }
                            });
                            ofFloat.setDuration(createCircularReveal.getDuration());
                            ofFloat.start();
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda19
                            @Override // java.lang.Runnable
                            public final void run() {
                                LaunchActivity.$r8$lambda$1tgVAvOYsaDlZBP0lLxo4zkcjBs(LaunchActivity.this);
                            }
                        }, booleanValue4 ? (measuredHeight - iArr[1]) / AndroidUtilities.dp(2.25f) : 50L);
                        createCircularReveal.start();
                        z = true;
                    } catch (Throwable th) {
                        th = th;
                        FileLog.e(th);
                        try {
                            this.themeSwitchImageView.setImageDrawable(null);
                            this.frameLayout.removeView(this.themeSwitchImageView);
                            DialogsActivity.switchingTheme = false;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        z = false;
                        Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) objArr[0];
                        boolean booleanValue5 = ((Boolean) objArr[1]).booleanValue();
                        int intValue = ((Integer) objArr[c]).intValue();
                        if (objArr.length > 7) {
                        }
                        actionBarLayout = this.actionBarLayout;
                        if (actionBarLayout == null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c = 3;
                }
                Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) objArr[0];
                boolean booleanValue52 = ((Boolean) objArr[1]).booleanValue();
                int intValue2 = ((Integer) objArr[c]).intValue();
                Runnable runnable = objArr.length > 7 ? (Runnable) objArr[7] : null;
                actionBarLayout = this.actionBarLayout;
                if (actionBarLayout == null) {
                    return;
                }
                actionBarLayout.animateThemedValues(themeInfo2, intValue2, booleanValue52, z, runnable);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout3 = this.layersActionBarLayout;
                    if (actionBarLayout3 != null) {
                        actionBarLayout3.animateThemedValues(themeInfo2, intValue2, booleanValue52, z);
                    }
                    ActionBarLayout actionBarLayout4 = this.rightActionBarLayout;
                    if (actionBarLayout4 != null) {
                        actionBarLayout4.animateThemedValues(themeInfo2, intValue2, booleanValue52, z);
                        return;
                    }
                    return;
                }
                return;
            }
            c = 3;
            DialogsActivity.switchingTheme = false;
            z = false;
            Theme.ThemeInfo themeInfo22 = (Theme.ThemeInfo) objArr[0];
            boolean booleanValue522 = ((Boolean) objArr[1]).booleanValue();
            int intValue22 = ((Integer) objArr[c]).intValue();
            if (objArr.length > 7) {
            }
            actionBarLayout = this.actionBarLayout;
            if (actionBarLayout == null) {
            }
        } else {
            if (i == NotificationCenter.needShowPlayServicesAlert) {
                try {
                    ((Status) objArr[0]).startResolutionForResult(this, NotificationCenter.fileUploadProgressChanged);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            if (i == NotificationCenter.fileLoaded) {
                String str3 = (String) objArr[0];
                String str4 = this.loadingThemeFileName;
                if (str4 != null) {
                    if (str4.equals(str3)) {
                        this.loadingThemeFileName = null;
                        File file = new File(ApplicationLoader.getFilesDirFixed(), "remote" + this.loadingTheme.id + ".attheme");
                        TLRPC.TL_theme tL_theme = this.loadingTheme;
                        final Theme.ThemeInfo fillThemeValues = Theme.fillThemeValues(file, tL_theme.title, tL_theme);
                        if (fillThemeValues != null) {
                            if (fillThemeValues.pathToWallpaper != null && !new File(fillThemeValues.pathToWallpaper).exists()) {
                                TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = fillThemeValues.slug;
                                getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                ConnectionsManager.getInstance(fillThemeValues.account).sendRequest(getwallpaper, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda20
                                    @Override // org.telegram.tgnet.RequestDelegate
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        LaunchActivity.$r8$lambda$tSKcQSQIUKWdtxhXsfpfHRe8yyk(LaunchActivity.this, fillThemeValues, tLObject, tL_error);
                                    }
                                });
                                return;
                            }
                            TLRPC.TL_theme tL_theme2 = this.loadingTheme;
                            Theme.ThemeInfo applyThemeFile = Theme.applyThemeFile(file, tL_theme2.title, tL_theme2, true);
                            if (applyThemeFile != null) {
                                presentFragment(new ThemePreviewActivity(applyThemeFile, true, 0, false, false));
                            }
                        }
                        onThemeLoadFinish();
                        return;
                    }
                    return;
                }
                String str5 = this.loadingThemeWallpaperName;
                if (str5 == null || !str5.equals(str3)) {
                    return;
                }
                this.loadingThemeWallpaperName = null;
                final File file2 = (File) objArr[1];
                if (this.loadingThemeAccent) {
                    openThemeAccentPreview(this.loadingTheme, this.loadingThemeWallpaper, this.loadingThemeInfo);
                    onThemeLoadFinish();
                    return;
                } else {
                    final Theme.ThemeInfo themeInfo3 = this.loadingThemeInfo;
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda21
                        @Override // java.lang.Runnable
                        public final void run() {
                            LaunchActivity.$r8$lambda$onMRqE6LmlV1-czc7oFXOPLVf4Q(LaunchActivity.this, themeInfo3, file2);
                        }
                    });
                    return;
                }
            }
            if (i == NotificationCenter.fileLoadFailed) {
                String str6 = (String) objArr[0];
                if (str6.equals(this.loadingThemeFileName) || str6.equals(this.loadingThemeWallpaperName)) {
                    onThemeLoadFinish();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.screenStateChanged) {
                if (ApplicationLoader.mainInterfacePaused) {
                    return;
                }
                if (ApplicationLoader.isScreenOn) {
                    onPasscodeResume();
                    return;
                } else {
                    onPasscodePause();
                    return;
                }
            }
            if (i == NotificationCenter.needCheckSystemBarColors) {
                if (objArr.length > 0 && ((Boolean) objArr[0]).booleanValue()) {
                    z3 = true;
                }
                checkSystemBarColors(z3);
                return;
            }
            if (i == NotificationCenter.historyImportProgressChanged) {
                if (objArr.length <= 1 || this.mainFragmentsStack.isEmpty()) {
                    return;
                }
                int i15 = this.currentAccount;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) objArr[2];
                ArrayList arrayList6 = this.mainFragmentsStack;
                AlertsCreator.processError(i15, tL_error, (BaseFragment) arrayList6.get(arrayList6.size() - 1), (TLObject) objArr[1], new Object[0]);
                return;
            }
            if (i == NotificationCenter.billingConfirmPurchaseError) {
                int i16 = this.currentAccount;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) objArr[1];
                ArrayList arrayList7 = this.mainFragmentsStack;
                AlertsCreator.processError(i16, tL_error2, (BaseFragment) arrayList7.get(arrayList7.size() - 1), (TLObject) objArr[0], new Object[0]);
                return;
            }
            if (i == NotificationCenter.stickersImportComplete) {
                MediaDataController mediaDataController = MediaDataController.getInstance(i2);
                TLObject tLObject = (TLObject) objArr[0];
                if (this.mainFragmentsStack.isEmpty()) {
                    baseFragment2 = null;
                } else {
                    ArrayList arrayList8 = this.mainFragmentsStack;
                    baseFragment2 = (BaseFragment) arrayList8.get(arrayList8.size() - 1);
                }
                mediaDataController.toggleStickerSet(this, tLObject, 2, baseFragment2, false, true);
                return;
            }
            if (i == NotificationCenter.showBulletin) {
                if (this.mainFragmentsStack.isEmpty()) {
                    return;
                }
                int intValue3 = ((Integer) objArr[0]).intValue();
                BottomSheet.ContainerView container = (!GroupCallActivity.groupCallUiVisible || (groupCallActivity = GroupCallActivity.groupCallInstance) == null) ? null : groupCallActivity.getContainer();
                if (container == null) {
                    ArrayList arrayList9 = this.mainFragmentsStack;
                    baseFragment = (BaseFragment) arrayList9.get(arrayList9.size() - 1);
                } else {
                    baseFragment = null;
                }
                switch (intValue3) {
                    case 0:
                        TLRPC.Document document = (TLRPC.Document) objArr[1];
                        int intValue4 = ((Integer) objArr[2]).intValue();
                        StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(this, null, intValue4, document, null);
                        int i17 = (intValue4 == 6 || intValue4 == 7) ? 3500 : 1500;
                        if (baseFragment != null) {
                            Bulletin.make(baseFragment, stickerSetBulletinLayout, i17).show();
                            break;
                        } else {
                            Bulletin.make(container, stickerSetBulletinLayout, i17).show();
                            break;
                        }
                        break;
                    case 1:
                        if (baseFragment != null) {
                            BulletinFactory.of(baseFragment).createErrorBulletin((String) objArr[1]).show();
                            break;
                        } else {
                            BulletinFactory.of(container, null).createErrorBulletin((String) objArr[1]).show();
                            break;
                        }
                    case 2:
                        (container != null ? BulletinFactory.of(container, null) : BulletinFactory.of(baseFragment)).createErrorBulletin(LocaleController.getString(((Long) objArr[1]).longValue() > 0 ? R.string.YourBioChanged : R.string.ChannelDescriptionChanged)).show();
                        break;
                    case 3:
                        (container != null ? BulletinFactory.of(container, null) : BulletinFactory.of(baseFragment)).createErrorBulletin(LocaleController.getString(((Long) objArr[1]).longValue() > 0 ? R.string.YourNameChanged : R.string.ChannelTitleChanged)).show();
                        break;
                    case 4:
                        if (baseFragment != null) {
                            BulletinFactory.of(baseFragment).createErrorBulletinSubtitle((String) objArr[1], (String) objArr[2], baseFragment.getResourceProvider()).show();
                            break;
                        } else {
                            BulletinFactory.of(container, null).createErrorBulletinSubtitle((String) objArr[1], (String) objArr[2], null).show();
                            break;
                        }
                    case 5:
                        AppIconBulletinLayout appIconBulletinLayout = new AppIconBulletinLayout(this, (LauncherIconController.LauncherIcon) objArr[1], null);
                        if (baseFragment != null) {
                            Bulletin.make(baseFragment, appIconBulletinLayout, 1500).show();
                            break;
                        } else {
                            Bulletin.make(container, appIconBulletinLayout, 1500).show();
                            break;
                        }
                    case 6:
                        if (baseFragment != null) {
                            BulletinFactory.of(baseFragment).createSuccessBulletin((String) objArr[1]).show();
                            break;
                        } else {
                            BulletinFactory.of(container, null).createSuccessBulletin((String) objArr[1]).show();
                            break;
                        }
                }
                return;
            }
            if (i == NotificationCenter.groupCallUpdated) {
                checkWasMutedByAdmin(false);
                return;
            }
            if (i == NotificationCenter.currentUserShowLimitReachedDialog) {
                if (this.mainFragmentsStack.isEmpty()) {
                    return;
                }
                ArrayList arrayList10 = this.mainFragmentsStack;
                BaseFragment baseFragment5 = (BaseFragment) arrayList10.get(arrayList10.size() - 1);
                if (baseFragment5.getParentActivity() != null) {
                    baseFragment5.showDialog(new LimitReachedBottomSheet(baseFragment5, baseFragment5.getParentActivity(), ((Integer) objArr[0]).intValue(), this.currentAccount, null));
                    return;
                }
                return;
            }
            if (i == NotificationCenter.currentUserPremiumStatusChanged) {
                MessagesController.getMainSettings(this.currentAccount).edit().remove("transcribeButtonPressed").apply();
                return;
            }
            if (i == NotificationCenter.requestPermissions) {
                int intValue5 = ((Integer) objArr[0]).intValue();
                String[] strArr = (intValue5 != 0 || Build.VERSION.SDK_INT < 31) ? null : new String[]{"android.permission.BLUETOOTH_CONNECT"};
                if (strArr != null) {
                    int i18 = this.requsetPermissionsPointer + 1;
                    this.requsetPermissionsPointer = i18;
                    this.requestedPermissions.put(i18, intValue5);
                    ActivityCompat.requestPermissions(this, strArr, this.requsetPermissionsPointer);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.chatSwitchedForum) {
                long longValue = ((Long) objArr[0]).longValue();
                if (((Boolean) objArr[1]).booleanValue()) {
                    ForumUtilities.switchAllFragmentsInStackToForum(longValue, this.actionBarLayout);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.tlSchemeParseException) {
                if (this.tlErrorAlertDialog == null) {
                    TLParseException tLParseException = (TLParseException) objArr[0];
                    StringBuilder sb = new StringBuilder();
                    sb.append(tLParseException.getMessage());
                    sb.append('\n');
                    sb.append('\n');
                    sb.append(AndroidUtilities.getBuildVersionInfo());
                    final StringBuilder sb2 = new StringBuilder();
                    StringWriter stringWriter = new StringWriter();
                    tLParseException.printStackTrace(new PrintWriter(stringWriter));
                    sb2.append(AndroidUtilities.getBuildVersionInfo());
                    sb2.append('\n');
                    sb2.append('\n');
                    sb2.append(stringWriter);
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(this, null);
                    builder4.setTitle("TL Error");
                    builder4.setMessage(sb);
                    builder4.setNegativeButton(getString(R.string.Copy), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda9
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i19) {
                            AndroidUtilities.addToClipboard(sb2);
                        }
                    });
                    builder4.setPositiveButton(getString(R.string.OK), null);
                    builder4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda10
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            LaunchActivity.$r8$lambda$pvLhW8v1A1sRtSQtsVeU3K__k1Q(LaunchActivity.this, dialogInterface);
                        }
                    });
                    AlertDialog show = builder4.show();
                    this.tlErrorAlertDialog = show;
                    show.setCanceledOnTouchOutside(true);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.memoryLeakFoundException) {
                if (this.memoryLeakErrorAlertDialog == null) {
                    Class cls = (Class) objArr[0];
                    int intValue6 = ((Integer) objArr[1]).intValue();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(cls.toString());
                    sb3.append('\n');
                    sb3.append(intValue6);
                    sb3.append('\n');
                    sb3.append(AndroidUtilities.getBuildVersionInfo());
                    AlertDialog.Builder builder5 = new AlertDialog.Builder(this, null);
                    builder5.setTitle("Memory Leak Found");
                    builder5.setMessage(sb3);
                    builder5.setPositiveButton(getString(R.string.OK), null);
                    builder5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda11
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            LaunchActivity.$r8$lambda$99BpoOulhSC1zod2Ls87SwgNuBY(LaunchActivity.this, dialogInterface);
                        }
                    });
                    AlertDialog show2 = builder5.show();
                    this.memoryLeakErrorAlertDialog = show2;
                    show2.setCanceledOnTouchOutside(true);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.guardBotDecisionResult) {
                BotGuardHelper.GuardBotDecisionResultNotification guardBotDecisionResultNotification = (BotGuardHelper.GuardBotDecisionResultNotification) objArr[0];
                BaseFragment lastFragment = getLastFragment();
                if (lastFragment instanceof ChatActivity) {
                    global = BulletinFactory.of(lastFragment);
                } else {
                    global = BulletinFactory.global();
                }
                String shortName = DialogObject.getShortName(this.currentAccount, guardBotDecisionResultNotification.dialogId);
                TLRPC.JoinChatBotResult joinChatBotResult = guardBotDecisionResultNotification.result;
                if (joinChatBotResult instanceof TLRPC.TL_joinChatBotResultApproved) {
                    createSimpleBulletinWithIconSize = global.createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotJoinRequestApproved, shortName)));
                } else if (joinChatBotResult instanceof TLRPC.TL_joinChatBotResultDeclined) {
                    createSimpleBulletinWithIconSize = global.createSimpleBulletin(R.raw.e_hand_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotJoinRequestDeclined, shortName)));
                } else {
                    createSimpleBulletinWithIconSize = joinChatBotResult instanceof TLRPC.TL_joinChatBotResultQueued ? global.createSimpleBulletinWithIconSize(R.raw.timer_toast, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotJoinRequestQueued, shortName)), 24) : null;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchActivity.$r8$lambda$sIX59BDFH5ikAgQbbPGrgwkno3I(LaunchActivity.this, createSimpleBulletinWithIconSize);
                    }
                }, 400L);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$4EhJFoDtzDzLUcDrGY3A_DOcjqI(LaunchActivity launchActivity, int i, AlertDialog alertDialog, int i2) {
        if (launchActivity.mainFragmentsStack.isEmpty()) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i);
        ArrayList arrayList = launchActivity.mainFragmentsStack;
        messagesController.openByUserName("spambot", (BaseFragment) arrayList.get(arrayList.size() - 1), 1);
    }

    public static /* synthetic */ void $r8$lambda$8OEH3UiTGtThBaLqBOqGm5jGeqU(LaunchActivity launchActivity, final HashMap hashMap, final int i, AlertDialog alertDialog, int i2) {
        if (launchActivity.mainFragmentsStack.isEmpty()) {
            return;
        }
        if (AndroidUtilities.isMapsInstalled((BaseFragment) launchActivity.mainFragmentsStack.get(r3.size() - 1))) {
            LocationActivity locationActivity = new LocationActivity(0);
            locationActivity.setDelegate(new LocationActivity.LocationActivityDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda55
                @Override // org.telegram.ui.LocationActivity.LocationActivityDelegate
                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i3, boolean z, int i4, long j) {
                    LaunchActivity.$r8$lambda$gkkwTFFpse1NuQzyas2R7laOiFg(hashMap, i, messageMedia, i3, z, i4, j);
                }
            });
            launchActivity.presentFragment(locationActivity);
        }
    }

    public static /* synthetic */ void $r8$lambda$gkkwTFFpse1NuQzyas2R7laOiFg(HashMap hashMap, int i, TLRPC.MessageMedia messageMedia, int i2, boolean z, int i3, long j) {
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z, i3, 0));
        }
    }

    public static /* synthetic */ void $r8$lambda$1tgVAvOYsaDlZBP0lLxo4zkcjBs(LaunchActivity launchActivity) {
        if (launchActivity.isNavigationBarColorFrozen) {
            launchActivity.isNavigationBarColorFrozen = false;
            launchActivity.checkSystemBarColors(false, true);
        }
    }

    public static /* synthetic */ void $r8$lambda$tSKcQSQIUKWdtxhXsfpfHRe8yyk(final LaunchActivity launchActivity, final Theme.ThemeInfo themeInfo, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$BQzYklyn1YT6KVGLFLdHiCn0ZYs(LaunchActivity.this, tLObject, themeInfo);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$BQzYklyn1YT6KVGLFLdHiCn0ZYs(LaunchActivity launchActivity, TLObject tLObject, Theme.ThemeInfo themeInfo) {
        launchActivity.getClass();
        if (tLObject instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
            launchActivity.loadingThemeInfo = themeInfo;
            launchActivity.loadingThemeWallpaperName = FileLoader.getAttachFileName(tL_wallPaper.document);
            launchActivity.loadingThemeWallpaper = tL_wallPaper;
            FileLoader.getInstance(themeInfo.account).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
            return;
        }
        launchActivity.onThemeLoadFinish();
    }

    public static /* synthetic */ void $r8$lambda$onMRqE6LmlV1-czc7oFXOPLVf4Q(final LaunchActivity launchActivity, Theme.ThemeInfo themeInfo, File file) {
        launchActivity.getClass();
        themeInfo.createBackground(file, themeInfo.pathToWallpaper);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda68
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$0T3MnoZcoCenO7T8L18i_RvQvCc(LaunchActivity.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$0T3MnoZcoCenO7T8L18i_RvQvCc(LaunchActivity launchActivity) {
        if (launchActivity.loadingTheme == null) {
            return;
        }
        File file = new File(ApplicationLoader.getFilesDirFixed(), "remote" + launchActivity.loadingTheme.id + ".attheme");
        TLRPC.TL_theme tL_theme = launchActivity.loadingTheme;
        Theme.ThemeInfo applyThemeFile = Theme.applyThemeFile(file, tL_theme.title, tL_theme, true);
        if (applyThemeFile != null) {
            launchActivity.presentFragment(new ThemePreviewActivity(applyThemeFile, true, 0, false, false));
        }
        launchActivity.onThemeLoadFinish();
    }

    public static /* synthetic */ void $r8$lambda$pvLhW8v1A1sRtSQtsVeU3K__k1Q(final LaunchActivity launchActivity, DialogInterface dialogInterface) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda71
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.this.tlErrorAlertDialog = null;
            }
        }, 30000L);
    }

    public static /* synthetic */ void $r8$lambda$99BpoOulhSC1zod2Ls87SwgNuBY(final LaunchActivity launchActivity, DialogInterface dialogInterface) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda73
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.this.memoryLeakErrorAlertDialog = null;
            }
        }, 30000L);
    }

    public static /* synthetic */ void $r8$lambda$sIX59BDFH5ikAgQbbPGrgwkno3I(LaunchActivity launchActivity, Bulletin bulletin) {
        if (launchActivity.finished || !isResumed) {
            return;
        }
        bulletin.show();
    }

    private void invalidateCachedViews(View view) {
        if (view.getLayerType() != 0) {
            view.invalidate();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                invalidateCachedViews(viewGroup.getChildAt(i));
            }
        }
    }

    private void checkWasMutedByAdmin(boolean z) {
        ChatObject.Call call;
        long j;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = false;
        if (sharedInstance != null && (call = sharedInstance.groupCall) != null) {
            boolean z3 = this.wasMutedByAdminRaisedHand;
            TLRPC.InputPeer groupCallPeer = sharedInstance.getGroupCallPeer();
            if (groupCallPeer != null) {
                j = groupCallPeer.user_id;
                if (j == 0) {
                    long j2 = groupCallPeer.chat_id;
                    if (j2 == 0) {
                        j2 = groupCallPeer.channel_id;
                    }
                    j = -j2;
                }
            } else {
                j = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(j);
            boolean z4 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted) ? false : true;
            if (z4 && groupCallParticipant.raise_hand_rating != 0) {
                z2 = true;
            }
            this.wasMutedByAdminRaisedHand = z2;
            if (z || !z3 || z2 || z4 || GroupCallActivity.groupCallInstance != null) {
                return;
            }
            showVoiceChatTooltip(38);
            return;
        }
        this.wasMutedByAdminRaisedHand = false;
    }

    private void showVoiceChatTooltip(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || this.mainFragmentsStack.isEmpty() || sharedInstance.groupCall == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        BaseFragment baseFragment = this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1);
        if (baseFragment instanceof MainTabsActivity) {
            baseFragment = ((MainTabsActivity) baseFragment).getCurrentVisibleFragment();
        }
        UndoView undoView = null;
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            if (chat != null && chatActivity.getDialogId() == (-chat.id)) {
                chat = null;
            }
            undoView = chatActivity.getUndoView();
        } else if (baseFragment instanceof DialogsActivity) {
            undoView = ((DialogsActivity) baseFragment).getUndoView();
        } else if (baseFragment instanceof ProfileActivity) {
            undoView = ((ProfileActivity) baseFragment).getUndoView();
        }
        if (undoView != null) {
            undoView.showWithAction(0L, i, chat);
        }
        if (i != 38 || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().playAllowTalkSound();
    }

    private String getStringForLanguageAlert(HashMap hashMap, String str, int i) {
        String str2 = (String) hashMap.get(str);
        return str2 == null ? LocaleController.getString(str, i) : str2;
    }

    private void openThemeAccentPreview(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, Theme.ThemeInfo themeInfo) {
        int i = themeInfo.lastAccentId;
        Theme.ThemeAccent createNewAccent = themeInfo.createNewAccent(tL_theme, this.currentAccount);
        themeInfo.prevAccentId = themeInfo.currentAccentId;
        themeInfo.setCurrentAccentId(createNewAccent.id);
        createNewAccent.pattern = tL_wallPaper;
        presentFragment(new ThemePreviewActivity(themeInfo, i != themeInfo.lastAccentId, 0, false, false));
    }

    private void onThemeLoadFinish() {
        AlertDialog alertDialog = this.loadingThemeProgressDialog;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } finally {
                this.loadingThemeProgressDialog = null;
            }
        }
        this.loadingThemeWallpaperName = null;
        this.loadingThemeWallpaper = null;
        this.loadingThemeInfo = null;
        this.loadingThemeFileName = null;
        this.loadingTheme = null;
    }

    private void checkFreeDiscSpace(final int i) {
        staticInstanceForAlerts = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT < 26 || i != 0) && !this.checkFreeDiscSpaceShown) {
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$VBE7kwtRTjnXliVht57QzwkGv9Y(LaunchActivity.this, i);
                }
            }, 2000L);
        }
    }

    public static /* synthetic */ void $r8$lambda$VBE7kwtRTjnXliVht57QzwkGv9Y(final LaunchActivity launchActivity, int i) {
        File directory;
        if (UserConfig.getInstance(launchActivity.currentAccount).isClientActivated()) {
            try {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if ((((i == 2 || i == 1) && Math.abs(launchActivity.alreadyShownFreeDiscSpaceAlertForced - System.currentTimeMillis()) > 240000) || Math.abs(globalMainSettings.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (directory = FileLoader.getDirectory(4)) != null) {
                    StatFs statFs = new StatFs(directory.getAbsolutePath());
                    long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                    if (i > 0 || availableBlocksLong < 52428800) {
                        if (i > 0) {
                            launchActivity.alreadyShownFreeDiscSpaceAlertForced = System.currentTimeMillis();
                        }
                        globalMainSettings.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda60
                            @Override // java.lang.Runnable
                            public final void run() {
                                LaunchActivity.$r8$lambda$ROSkrz6iJnY_Y4xjNnKeGIDDyz4(LaunchActivity.this);
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$ROSkrz6iJnY_Y4xjNnKeGIDDyz4(final LaunchActivity launchActivity) {
        if (launchActivity.checkFreeDiscSpaceShown) {
            return;
        }
        try {
            Dialog createFreeSpaceDialog = AlertsCreator.createFreeSpaceDialog(launchActivity);
            createFreeSpaceDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda135
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LaunchActivity.this.checkFreeDiscSpaceShown = false;
                }
            });
            launchActivity.checkFreeDiscSpaceShown = true;
            createFreeSpaceDialog.show();
        } catch (Throwable unused) {
        }
    }

    public static void checkFreeDiscSpaceStatic(int i) {
        LaunchActivity launchActivity = staticInstanceForAlerts;
        if (launchActivity != null) {
            launchActivity.checkFreeDiscSpace(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:3:0x0009, B:5:0x0011, B:9:0x0022, B:14:0x005b, B:17:0x0066, B:19:0x006d, B:22:0x0080, B:26:0x00a2, B:31:0x00bd), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showLanguageAlertInternal(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, String str) {
        boolean z;
        int i;
        try {
            this.loadingLocaleDialog = false;
            LocaleController.LocaleInfo localeInfo3 = localeInfo;
            if (!localeInfo3.builtIn && !LocaleController.getInstance().isCurrentLocalLocale()) {
                z = false;
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                HashMap hashMap = this.systemLocaleStrings;
                int i2 = R.string.ChooseYourLanguage;
                builder.setTitle(getStringForLanguageAlert(hashMap, "ChooseYourLanguage", i2));
                builder.setSubtitle(getStringForLanguageAlert(this.englishLocaleStrings, "ChooseYourLanguage", i2));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                final LanguageCell[] languageCellArr = new LanguageCell[2];
                String stringForLanguageAlert = getStringForLanguageAlert(this.systemLocaleStrings, "English", R.string.English);
                LocaleController.LocaleInfo[] localeInfoArr = {!z ? localeInfo3 : localeInfo2, !z ? localeInfo2 : localeInfo3};
                if (z) {
                    localeInfo3 = localeInfo2;
                }
                final LocaleController.LocaleInfo[] localeInfoArr2 = {localeInfo3};
                i = 0;
                while (i < 2) {
                    LanguageCell languageCell = new LanguageCell(this);
                    languageCellArr[i] = languageCell;
                    LocaleController.LocaleInfo localeInfo4 = localeInfoArr[i];
                    languageCell.setLanguage(localeInfo4, localeInfo4 == localeInfo2 ? stringForLanguageAlert : null, true);
                    languageCellArr[i].setTag(Integer.valueOf(i));
                    languageCellArr[i].setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector), 2));
                    languageCellArr[i].setLanguageSelected(i == 0, false);
                    linearLayout.addView(languageCellArr[i], LayoutHelper.createLinear(-1, 50));
                    languageCellArr[i].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda156
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LaunchActivity.$r8$lambda$tIJLkKkzRRL1JTCd9dlNI1Y6RgI(localeInfoArr2, languageCellArr, view);
                        }
                    });
                    i++;
                }
                LanguageCell languageCell2 = new LanguageCell(this);
                HashMap hashMap2 = this.systemLocaleStrings;
                int i3 = R.string.ChooseYourLanguageOther;
                languageCell2.setValue(getStringForLanguageAlert(hashMap2, "ChooseYourLanguageOther", i3), getStringForLanguageAlert(this.englishLocaleStrings, "ChooseYourLanguageOther", i3));
                languageCell2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector), 2));
                languageCell2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda157
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LaunchActivity.$r8$lambda$PyXhANbSXjViUSRA42pkD93_J6E(LaunchActivity.this, view);
                    }
                });
                linearLayout.addView(languageCell2, LayoutHelper.createLinear(-1, 50));
                builder.setView(linearLayout);
                builder.setNegativeButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda158
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        LaunchActivity.$r8$lambda$alwRnKInv82mqr2mfkWx2xri3jc(LaunchActivity.this, localeInfoArr2, alertDialog, i4);
                    }
                });
                this.localeDialog = showAlertDialog(builder);
                MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str).commit();
            }
            z = true;
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            HashMap hashMap3 = this.systemLocaleStrings;
            int i22 = R.string.ChooseYourLanguage;
            builder2.setTitle(getStringForLanguageAlert(hashMap3, "ChooseYourLanguage", i22));
            builder2.setSubtitle(getStringForLanguageAlert(this.englishLocaleStrings, "ChooseYourLanguage", i22));
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            final LanguageCell[] languageCellArr2 = new LanguageCell[2];
            String stringForLanguageAlert2 = getStringForLanguageAlert(this.systemLocaleStrings, "English", R.string.English);
            LocaleController.LocaleInfo[] localeInfoArr3 = {!z ? localeInfo3 : localeInfo2, !z ? localeInfo2 : localeInfo3};
            if (z) {
            }
            final LocaleController.LocaleInfo[] localeInfoArr22 = {localeInfo3};
            i = 0;
            while (i < 2) {
            }
            LanguageCell languageCell22 = new LanguageCell(this);
            HashMap hashMap22 = this.systemLocaleStrings;
            int i32 = R.string.ChooseYourLanguageOther;
            languageCell22.setValue(getStringForLanguageAlert(hashMap22, "ChooseYourLanguageOther", i32), getStringForLanguageAlert(this.englishLocaleStrings, "ChooseYourLanguageOther", i32));
            languageCell22.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector), 2));
            languageCell22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda157
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LaunchActivity.$r8$lambda$PyXhANbSXjViUSRA42pkD93_J6E(LaunchActivity.this, view);
                }
            });
            linearLayout2.addView(languageCell22, LayoutHelper.createLinear(-1, 50));
            builder2.setView(linearLayout2);
            builder2.setNegativeButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda158
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i4) {
                    LaunchActivity.$r8$lambda$alwRnKInv82mqr2mfkWx2xri3jc(LaunchActivity.this, localeInfoArr22, alertDialog, i4);
                }
            });
            this.localeDialog = showAlertDialog(builder2);
            MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str).commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$tIJLkKkzRRL1JTCd9dlNI1Y6RgI(LocaleController.LocaleInfo[] localeInfoArr, LanguageCell[] languageCellArr, View view) {
        Integer num = (Integer) view.getTag();
        localeInfoArr[0] = ((LanguageCell) view).getCurrentLocale();
        int i = 0;
        while (i < languageCellArr.length) {
            languageCellArr[i].setLanguageSelected(i == num.intValue(), true);
            i++;
        }
    }

    public static /* synthetic */ void $r8$lambda$PyXhANbSXjViUSRA42pkD93_J6E(LaunchActivity launchActivity, View view) {
        launchActivity.localeDialog = null;
        launchActivity.presentFragment(new LanguageSelectActivity());
        for (int i = 0; i < launchActivity.visibleDialogs.size(); i++) {
            if (((Dialog) launchActivity.visibleDialogs.get(i)).isShowing()) {
                ((Dialog) launchActivity.visibleDialogs.get(i)).dismiss();
            }
        }
        launchActivity.visibleDialogs.clear();
    }

    public static /* synthetic */ void $r8$lambda$alwRnKInv82mqr2mfkWx2xri3jc(LaunchActivity launchActivity, LocaleController.LocaleInfo[] localeInfoArr, AlertDialog alertDialog, int i) {
        launchActivity.getClass();
        LocaleController.getInstance().applyLanguage(localeInfoArr[0], true, false, launchActivity.currentAccount);
        launchActivity.rebuildAllFragments(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawRippleAbove(Canvas canvas, View view) {
        View view2;
        if (view == null || (view2 = this.rippleAbove) == null || view2.getBackground() == null) {
            return;
        }
        if (this.tempLocation == null) {
            this.tempLocation = new int[2];
        }
        this.rippleAbove.getLocationInWindow(this.tempLocation);
        int[] iArr = this.tempLocation;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.tempLocation;
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        canvas.save();
        canvas.translate(i3, i4);
        this.rippleAbove.getBackground().draw(canvas);
        canvas.restore();
    }

    private void showLanguageAlert(boolean z) {
        String str;
        char c;
        LocaleController.LocaleInfo localeInfo;
        if (UserConfig.getInstance(this.currentAccount).isClientActivated()) {
            try {
                if (!this.loadingLocaleDialog && !ApplicationLoader.mainInterfacePaused) {
                    String string = MessagesController.getGlobalMainSettings().getString("language_showed2", "");
                    final String str2 = MessagesController.getInstance(this.currentAccount).suggestedLangCode;
                    if (!z && string.equals(str2)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("alert already showed for " + string);
                            return;
                        }
                        return;
                    }
                    final LocaleController.LocaleInfo[] localeInfoArr = new LocaleController.LocaleInfo[2];
                    String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
                    if ("in".equals(str3)) {
                        str = "id";
                    } else if ("iw".equals(str3)) {
                        str = "he";
                    } else {
                        str = "jw".equals(str3) ? "jv" : null;
                    }
                    int i = 0;
                    while (true) {
                        if (i >= LocaleController.getInstance().languages.size()) {
                            c = 0;
                            break;
                        }
                        LocaleController.LocaleInfo localeInfo2 = LocaleController.getInstance().languages.get(i);
                        c = 0;
                        if (localeInfo2.shortName.equals("en")) {
                            localeInfoArr[0] = localeInfo2;
                        }
                        if (localeInfo2.shortName.replace("_", "-").equals(str2) || localeInfo2.shortName.equals(str3) || localeInfo2.shortName.equals(str)) {
                            localeInfoArr[1] = localeInfo2;
                        }
                        if (localeInfoArr[0] != null && localeInfoArr[1] != null) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    LocaleController.LocaleInfo localeInfo3 = localeInfoArr[c];
                    if (localeInfo3 != null && (localeInfo = localeInfoArr[1]) != null && localeInfo3 != localeInfo) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("show lang alert for " + localeInfoArr[c].getKey() + " and " + localeInfoArr[1].getKey());
                        }
                        this.systemLocaleStrings = null;
                        this.englishLocaleStrings = null;
                        this.loadingLocaleDialog = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = localeInfoArr[1].getLangCode();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_langpack_getStrings, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda49
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                LaunchActivity.$r8$lambda$OyCFXR07nrFKkwAEGxNkAT43wJ4(LaunchActivity.this, localeInfoArr, str2, tLObject, tL_error);
                            }
                        }, 8);
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings2 = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings2.lang_code = localeInfoArr[c].getLangCode();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_langpack_getStrings2, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda50
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                LaunchActivity.$r8$lambda$EcoJV_TMhYxSVGMJhsudzv_nqfQ(LaunchActivity.this, localeInfoArr, str2, tLObject, tL_error);
                            }
                        }, 8);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$OyCFXR07nrFKkwAEGxNkAT43wJ4(final LaunchActivity launchActivity, final LocaleController.LocaleInfo[] localeInfoArr, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        final HashMap hashMap = new HashMap();
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < vector.objects.size(); i++) {
                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i);
                hashMap.put(langPackString.key, langPackString.value);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda122
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$DCnZVOKiiHzil86BJ_amq1bpu4k(LaunchActivity.this, hashMap, localeInfoArr, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$DCnZVOKiiHzil86BJ_amq1bpu4k(LaunchActivity launchActivity, HashMap hashMap, LocaleController.LocaleInfo[] localeInfoArr, String str) {
        launchActivity.systemLocaleStrings = hashMap;
        if (launchActivity.englishLocaleStrings == null || hashMap == null) {
            return;
        }
        launchActivity.showLanguageAlertInternal(localeInfoArr[1], localeInfoArr[0], str);
    }

    public static /* synthetic */ void $r8$lambda$EcoJV_TMhYxSVGMJhsudzv_nqfQ(final LaunchActivity launchActivity, final LocaleController.LocaleInfo[] localeInfoArr, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        final HashMap hashMap = new HashMap();
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < vector.objects.size(); i++) {
                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i);
                hashMap.put(langPackString.key, langPackString.value);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda102
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$joM0vBM8QDJx8yIVWHOgJOqzRls(LaunchActivity.this, hashMap, localeInfoArr, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$joM0vBM8QDJx8yIVWHOgJOqzRls(LaunchActivity launchActivity, HashMap hashMap, LocaleController.LocaleInfo[] localeInfoArr, String str) {
        launchActivity.englishLocaleStrings = hashMap;
        if (hashMap == null || launchActivity.systemLocaleStrings == null) {
            return;
        }
        launchActivity.showLanguageAlertInternal(localeInfoArr[1], localeInfoArr[0], str);
    }

    private void onPasscodePause() {
        if (this.lockRunnable != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodePause");
            }
            AndroidUtilities.cancelRunOnUIThread(this.lockRunnable);
            this.lockRunnable = null;
        }
        if (SharedConfig.passcodeHash.length() != 0) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.LaunchActivity.18
                @Override // java.lang.Runnable
                public void run() {
                    if (LaunchActivity.this.lockRunnable == this) {
                        if (AndroidUtilities.needShowPasscode(true)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("lock app");
                            }
                            LaunchActivity.this.showPasscodeActivity(true, false, -1, -1, null, null);
                            try {
                                NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("didn't pass lock check");
                        }
                        LaunchActivity.this.lockRunnable = null;
                    }
                }
            };
            this.lockRunnable = runnable;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(runnable, 1000L);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in 1000");
                }
            } else if (SharedConfig.autoLockIn != 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in " + ((SharedConfig.autoLockIn * 1000) + 1000));
                }
                AndroidUtilities.runOnUIThread(this.lockRunnable, (SharedConfig.autoLockIn * 1000) + 1000);
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
    }

    public void addOverlayPasscodeView(PasscodeView passcodeView) {
        this.overlayPasscodeViews.add(passcodeView);
    }

    public void removeOverlayPasscodeView(PasscodeView passcodeView) {
        this.overlayPasscodeViews.remove(passcodeView);
    }

    private void onPasscodeResume() {
        if (this.lockRunnable != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodeResume");
            }
            AndroidUtilities.cancelRunOnUIThread(this.lockRunnable);
            this.lockRunnable = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            showPasscodeActivity(true, false, -1, -1, null, null);
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    private void updateCurrentConnectionState(int i) {
        int i2;
        String str;
        if (this.actionBarLayout == null) {
            return;
        }
        int connectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        this.currentConnectionState = connectionState;
        if (connectionState == 2) {
            i2 = R.string.WaitingForNetwork;
            str = "WaitingForNetwork";
        } else if (connectionState == 5) {
            i2 = R.string.Updating;
            str = "Updating";
        } else if (connectionState == 4) {
            i2 = R.string.ConnectingToProxyWithDots;
            str = "ConnectingToProxyWithDots";
        } else if (connectionState == 1) {
            i2 = R.string.Connecting;
            str = "Connecting";
        } else {
            i2 = 0;
            str = null;
        }
        this.actionBarLayout.setTitleOverlayText(str, i2, (connectionState == 1 || connectionState == 4) ? new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda57
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$XtMbnKfTunSewwj5p9RPhbsRr70(LaunchActivity.this);
            }
        } : null);
    }

    public static /* synthetic */ void $r8$lambda$XtMbnKfTunSewwj5p9RPhbsRr70(LaunchActivity launchActivity) {
        BaseFragment baseFragment;
        launchActivity.getClass();
        if (AndroidUtilities.isTablet()) {
            if (!launchActivity.layerFragmentsStack.isEmpty()) {
                baseFragment = (BaseFragment) launchActivity.layerFragmentsStack.get(r0.size() - 1);
            }
            baseFragment = null;
        } else {
            if (!launchActivity.mainFragmentsStack.isEmpty()) {
                baseFragment = (BaseFragment) launchActivity.mainFragmentsStack.get(r0.size() - 1);
            }
            baseFragment = null;
        }
        if ((baseFragment instanceof ProxyListActivity) || (baseFragment instanceof ProxySettingsActivity)) {
            return;
        }
        launchActivity.presentFragment(new ProxyListActivity());
    }

    public void hideVisibleActionMode() {
        ActionMode actionMode = this.visibleActionMode;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a8 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x000d, B:8:0x0017, B:10:0x00a8, B:14:0x00b6, B:15:0x011c, B:19:0x00bf, B:22:0x00c5, B:23:0x00ce, B:25:0x00d2, B:26:0x00d8, B:28:0x00dc, B:30:0x00e5, B:31:0x00eb, B:34:0x00f3, B:35:0x00fc, B:38:0x0102, B:40:0x010a, B:41:0x0113, B:43:0x0117, B:45:0x0034, B:47:0x0038, B:49:0x0042, B:50:0x005b, B:52:0x0067, B:54:0x0080, B:56:0x008c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onSaveInstanceState(Bundle bundle) {
        BaseFragment baseFragment;
        try {
            super.onSaveInstanceState(bundle);
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.layersActionBarLayout;
                if (actionBarLayout != null && !actionBarLayout.getFragmentStack().isEmpty()) {
                    baseFragment = this.layersActionBarLayout.getFragmentStack().get(this.layersActionBarLayout.getFragmentStack().size() - 1);
                } else {
                    ActionBarLayout actionBarLayout2 = this.rightActionBarLayout;
                    if (actionBarLayout2 != null && !actionBarLayout2.getFragmentStack().isEmpty()) {
                        baseFragment = this.rightActionBarLayout.getFragmentStack().get(this.rightActionBarLayout.getFragmentStack().size() - 1);
                    } else {
                        if (!this.actionBarLayout.getFragmentStack().isEmpty()) {
                            baseFragment = this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1);
                        }
                        baseFragment = null;
                    }
                }
                if (baseFragment != null) {
                    Bundle arguments = baseFragment.getArguments();
                    if ((baseFragment instanceof ChatActivity) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "chat");
                    } else if ((baseFragment instanceof GroupCreateFinalActivity) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "group");
                    } else if (baseFragment instanceof WallpapersListActivity) {
                        bundle.putString("fragment", "wallpapers");
                    } else if (baseFragment instanceof ProfileActivity) {
                        ProfileActivity profileActivity = (ProfileActivity) baseFragment;
                        if (profileActivity.isSettings()) {
                            bundle.putString("fragment", "settings");
                        } else if (profileActivity.isChat() && arguments != null) {
                            bundle.putBundle("args", arguments);
                            bundle.putString("fragment", "chat_profile");
                        }
                    } else if ((baseFragment instanceof ChannelCreateActivity) && arguments != null && arguments.getInt("step") == 0) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "channel");
                    } else if (baseFragment instanceof SettingsActivity) {
                        bundle.putString("fragment", "settings2");
                    }
                    baseFragment.saveSelfArgs(bundle);
                    return;
                }
                return;
            }
            if (!this.actionBarLayout.getFragmentStack().isEmpty()) {
                baseFragment = this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1);
                if (baseFragment != null) {
                }
            }
            baseFragment = null;
            if (baseFragment != null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (onBackPressed(true)) {
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.layersActionBarLayout;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.layersActionBarLayout.onBackPressed();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.rightActionBarLayout;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                    BaseFragment baseFragment = this.rightActionBarLayout.getFragmentStack().get(this.rightActionBarLayout.getFragmentStack().size() - 1);
                    if (baseFragment.onBackPressed(true)) {
                        baseFragment.finishFragment();
                        return;
                    }
                    return;
                }
                this.actionBarLayout.onBackPressed();
                return;
            }
            this.actionBarLayout.onBackPressed();
        }
    }

    public boolean onBackPressed(boolean z) {
        if (FloatingDebugController.onBackPressed(z)) {
            return false;
        }
        PasscodeViewDialog passcodeViewDialog = this.passcodeDialog;
        if (passcodeViewDialog != null && passcodeViewDialog.passcodeView.getVisibility() == 0) {
            if (z) {
                finish();
            }
            return false;
        }
        BottomSheetTabsOverlay bottomSheetTabsOverlay = this.bottomSheetTabsOverlay;
        if (bottomSheetTabsOverlay != null && bottomSheetTabsOverlay.isOpen) {
            if (z) {
                bottomSheetTabsOverlay.onBackPressed();
            }
            return false;
        }
        if (!SearchTagsList.onBackPressedRenameTagAlert(z)) {
            return false;
        }
        if (ContentPreviewViewer.hasInstance() && ContentPreviewViewer.getInstance().isVisible()) {
            if (z) {
                ContentPreviewViewer.getInstance().closeWithMenu();
            }
            return false;
        }
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
            if (z) {
                SecretMediaViewer.getInstance().closePhoto(true, false);
            }
            return false;
        }
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            if (z) {
                PhotoViewer.getInstance().closePhoto(true, false);
            }
            return false;
        }
        if (!ArticleViewer.hasInstance() || !ArticleViewer.getInstance().isVisible()) {
            return true;
        }
        if (z) {
            ArticleViewer.getInstance().close(true, false);
        }
        return false;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (actionBarLayout != null) {
            actionBarLayout.onLowMemory();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.rightActionBarLayout;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.onLowMemory();
                }
                ActionBarLayout actionBarLayout3 = this.layersActionBarLayout;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.onLowMemory();
                }
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        int type;
        super.onActionModeStarted(actionMode);
        this.visibleActionMode = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.actionBarLayout.extendActionMode(menu) && AndroidUtilities.isTablet() && !this.rightActionBarLayout.extendActionMode(menu)) {
                this.layersActionBarLayout.extendActionMode(menu);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            type = actionMode.getType();
            if (type == 1) {
                return;
            }
        }
        this.actionBarLayout.onActionModeStarted(actionMode);
        if (AndroidUtilities.isTablet()) {
            this.rightActionBarLayout.onActionModeStarted(actionMode);
            this.layersActionBarLayout.onActionModeStarted(actionMode);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        int type;
        super.onActionModeFinished(actionMode);
        if (this.visibleActionMode == actionMode) {
            this.visibleActionMode = null;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            type = actionMode.getType();
            if (type == 1) {
                return;
            }
        }
        this.actionBarLayout.onActionModeFinished(actionMode);
        if (AndroidUtilities.isTablet()) {
            this.rightActionBarLayout.onActionModeFinished(actionMode);
            this.layersActionBarLayout.onActionModeFinished(actionMode);
        }
    }

    @Override // org.telegram.ui.ActionBar.INavigationLayout.INavigationLayoutDelegate
    public boolean onPreIme() {
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
            SecretMediaViewer.getInstance().closePhoto(true, false);
            return true;
        }
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(true, false);
            return true;
        }
        if (!ArticleViewer.hasInstance() || !ArticleViewer.getInstance().isVisible()) {
            return false;
        }
        ArticleViewer.getInstance().close(true, false);
        return true;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        BaseFragment lastFragment;
        int streamMinVolume;
        keyEvent.getKeyCode();
        if ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && (lastFragment = getLastFragment()) != null && lastFragment.getLastStoryViewer() != null) {
            lastFragment.getLastStoryViewer().dispatchKeyEvent(keyEvent);
            return true;
        }
        if (keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            if (VoIPService.getSharedInstance() != null) {
                if (Build.VERSION.SDK_INT >= 32) {
                    boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
                    AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    streamMinVolume = audioManager.getStreamMinVolume(0);
                    boolean z = audioManager.getStreamVolume(0) == streamMinVolume && keyEvent.getKeyCode() == 25;
                    WebRtcAudioTrack.setSpeakerMute(z);
                    if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                        showVoiceChatTooltip(z ? 42 : 43);
                    }
                }
            } else if (!this.mainFragmentsStack.isEmpty() && ((!PhotoViewer.hasInstance() || !PhotoViewer.getInstance().isVisible()) && keyEvent.getRepeatCount() == 0)) {
                ArrayList arrayList = this.mainFragmentsStack;
                BaseFragment baseFragment = (BaseFragment) arrayList.get(arrayList.size() - 1);
                if ((baseFragment instanceof ChatActivity) && !BaseFragment.hasSheets(baseFragment) && ((ChatActivity) baseFragment).maybePlayVisibleVideo()) {
                    return true;
                }
                if (AndroidUtilities.isTablet() && !this.rightFragmentsStack.isEmpty()) {
                    ArrayList arrayList2 = this.rightFragmentsStack;
                    BaseFragment baseFragment2 = (BaseFragment) arrayList2.get(arrayList2.size() - 1);
                    if ((baseFragment2 instanceof ChatActivity) && !BaseFragment.hasSheets(baseFragment2) && ((ChatActivity) baseFragment2).maybePlayVisibleVideo()) {
                        return true;
                    }
                }
            }
        }
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82 && !SharedConfig.isWaitingForPasscodeEnter) {
            if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
                return super.onKeyUp(i, keyEvent);
            }
            if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
                return super.onKeyUp(i, keyEvent);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.layersActionBarLayout.getView().getVisibility() == 0 && !this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    this.layersActionBarLayout.getView().onKeyUp(i, keyEvent);
                } else if (this.rightActionBarLayout.getView().getVisibility() == 0 && !this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                    this.rightActionBarLayout.getView().onKeyUp(i, keyEvent);
                } else {
                    this.actionBarLayout.getView().onKeyUp(i, keyEvent);
                }
            } else {
                this.actionBarLayout.getView().onKeyUp(i, keyEvent);
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.INavigationLayout.INavigationLayoutDelegate
    public boolean needPresentFragment(INavigationLayout iNavigationLayout, INavigationLayout.NavigationParams navigationParams) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        ActionBarLayout actionBarLayout4;
        BaseFragment baseFragment = navigationParams.fragment;
        boolean z = navigationParams.removeLast;
        boolean z2 = navigationParams.noAnimation;
        if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
            ArticleViewer.getInstance().close(false, true);
        }
        if (AndroidUtilities.isTablet()) {
            if (baseFragment instanceof MainTabsActivity) {
                ActionBarLayout actionBarLayout5 = this.actionBarLayout;
                if (iNavigationLayout != actionBarLayout5) {
                    actionBarLayout5.removeAllFragments();
                    getActionBarLayout().presentFragment(navigationParams.setRemoveLast(z).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                    this.layersActionBarLayout.removeAllFragments();
                    this.layersActionBarLayout.getView().setVisibility(8);
                    if (!this.tabletFullSize && this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                        this.backgroundTablet.setVisibility(0);
                    }
                    return false;
                }
            } else if (baseFragment instanceof DialogsActivity) {
                DialogsActivity dialogsActivity = (DialogsActivity) baseFragment;
                if (dialogsActivity.isMainDialogList() && iNavigationLayout != (actionBarLayout = this.actionBarLayout)) {
                    actionBarLayout.removeAllFragments();
                    getActionBarLayout().presentFragment(navigationParams.setRemoveLast(z).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                    this.layersActionBarLayout.removeAllFragments();
                    this.layersActionBarLayout.getView().setVisibility(8);
                    if (!this.tabletFullSize && this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                        this.backgroundTablet.setVisibility(0);
                    }
                    return false;
                }
                if (iNavigationLayout == this.actionBarLayout && dialogsActivity.getArguments() != null && (dialogsActivity.getArguments().getInt("folderId", 0) == 1 || dialogsActivity.getArguments().getLong("community_id", 0L) != 0)) {
                    return true;
                }
            }
            if (((baseFragment instanceof ChatActivity) && !((ChatActivity) baseFragment).isInScheduleMode()) || navigationParams.forceRightLayout || (iNavigationLayout == (actionBarLayout2 = this.rightActionBarLayout) && (actionBarLayout2.getFragmentStack().size() > 1 || !(this.rightActionBarLayout.getLastFragment() instanceof ChatActivity)))) {
                boolean z3 = this.tabletFullSize;
                if ((!z3 && iNavigationLayout == this.rightActionBarLayout) || (z3 && iNavigationLayout == this.actionBarLayout)) {
                    ActionBarLayout actionBarLayout6 = this.rightActionBarLayout;
                    if (iNavigationLayout == actionBarLayout6) {
                        if (actionBarLayout6.getView() != null) {
                            this.rightActionBarLayout.getView().setVisibility(0);
                        }
                        this.backgroundTablet.setVisibility(8);
                    }
                    boolean z4 = (this.tabletFullSize && iNavigationLayout == (actionBarLayout4 = this.actionBarLayout) && actionBarLayout4.getFragmentStack().size() == 1) ? false : true;
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout7 = this.layersActionBarLayout;
                            actionBarLayout7.removeFragmentFromStack(actionBarLayout7.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(!z2);
                    }
                    if (!z4) {
                        getActionBarLayout().presentFragment(navigationParams.setNoAnimation(z2).setCheckPresentFromDelegate(false));
                    }
                    return z4;
                }
                if (!z3 && iNavigationLayout != (actionBarLayout3 = this.rightActionBarLayout) && actionBarLayout3 != null) {
                    if (actionBarLayout3.getView() != null) {
                        this.rightActionBarLayout.getView().setVisibility(0);
                    }
                    this.backgroundTablet.setVisibility(8);
                    this.rightActionBarLayout.removeAllFragments();
                    this.rightActionBarLayout.presentFragment(navigationParams.setNoAnimation(true).setRemoveLast(z).setCheckPresentFromDelegate(false));
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout8 = this.layersActionBarLayout;
                            actionBarLayout8.removeFragmentFromStack(actionBarLayout8.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(!z2);
                    }
                    return false;
                }
                if (z3 && iNavigationLayout != this.actionBarLayout) {
                    getActionBarLayout().presentFragment(navigationParams.setRemoveLast(this.actionBarLayout.getFragmentStack().size() > 1).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout9 = this.layersActionBarLayout;
                            actionBarLayout9.removeFragmentFromStack(actionBarLayout9.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(!z2);
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout10 = this.layersActionBarLayout;
                if (actionBarLayout10 != null && actionBarLayout10.getFragmentStack() != null && !this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                        ActionBarLayout actionBarLayout11 = this.layersActionBarLayout;
                        actionBarLayout11.removeFragmentFromStack(actionBarLayout11.getFragmentStack().get(0));
                    }
                    this.layersActionBarLayout.closeLastFragment(!z2);
                }
                getActionBarLayout().presentFragment(navigationParams.setRemoveLast(this.actionBarLayout.getFragmentStack().size() > 1).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                return false;
            }
            ActionBarLayout actionBarLayout12 = this.layersActionBarLayout;
            if (actionBarLayout12 != null && iNavigationLayout != actionBarLayout12) {
                actionBarLayout12.getView().setVisibility(0);
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        i = -1;
                        break;
                    }
                    if (UserConfig.getInstance(i).isClientActivated()) {
                        break;
                    }
                    i++;
                }
                if ((baseFragment instanceof LoginActivity) && i == -1) {
                    this.backgroundTablet.setVisibility(0);
                    this.shadowTablet.setBackgroundColor(0);
                } else {
                    this.shadowTablet.setBackgroundColor(2130706432);
                }
                this.layersActionBarLayout.presentFragment(navigationParams.setRemoveLast(z).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.INavigationLayout.INavigationLayoutDelegate
    public boolean needAddFragmentToStack(BaseFragment baseFragment, INavigationLayout iNavigationLayout) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (AndroidUtilities.isTablet()) {
            boolean z = baseFragment instanceof DialogsActivity;
            if (z || (baseFragment instanceof MainTabsActivity)) {
                boolean z2 = iNavigationLayout != this.actionBarLayout;
                if (z2 && z && !((DialogsActivity) baseFragment).isMainDialogList()) {
                    z2 = false;
                }
                if (z2) {
                    this.actionBarLayout.removeAllFragments();
                    this.actionBarLayout.addFragmentToStack(baseFragment);
                    this.layersActionBarLayout.removeAllFragments();
                    this.layersActionBarLayout.getView().setVisibility(8);
                    if (!this.tabletFullSize && this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                        this.backgroundTablet.setVisibility(0);
                    }
                    return false;
                }
            } else if ((baseFragment instanceof ChatActivity) && !((ChatActivity) baseFragment).isInScheduleMode()) {
                boolean z3 = this.tabletFullSize;
                if (!z3 && iNavigationLayout != (actionBarLayout2 = this.rightActionBarLayout)) {
                    actionBarLayout2.getView().setVisibility(0);
                    this.backgroundTablet.setVisibility(8);
                    this.rightActionBarLayout.removeAllFragments();
                    this.rightActionBarLayout.addFragmentToStack(baseFragment);
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout3 = this.layersActionBarLayout;
                            actionBarLayout3.removeFragmentFromStack(actionBarLayout3.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(true);
                    }
                    return false;
                }
                if (z3 && iNavigationLayout != (actionBarLayout = this.actionBarLayout)) {
                    actionBarLayout.addFragmentToStack(baseFragment);
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout4 = this.layersActionBarLayout;
                            actionBarLayout4.removeFragmentFromStack(actionBarLayout4.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(true);
                    }
                    return false;
                }
            } else {
                ActionBarLayout actionBarLayout5 = this.layersActionBarLayout;
                if (iNavigationLayout != actionBarLayout5) {
                    actionBarLayout5.getView().setVisibility(0);
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                            break;
                        }
                        if (UserConfig.getInstance(i).isClientActivated()) {
                            break;
                        }
                        i++;
                    }
                    if ((baseFragment instanceof LoginActivity) && i == -1) {
                        this.backgroundTablet.setVisibility(0);
                        this.shadowTablet.setBackgroundColor(0);
                    } else {
                        this.shadowTablet.setBackgroundColor(2130706432);
                    }
                    this.layersActionBarLayout.addFragmentToStack(baseFragment);
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.INavigationLayout.INavigationLayoutDelegate
    public boolean needCloseLastFragment(INavigationLayout iNavigationLayout) {
        if (AndroidUtilities.isTablet()) {
            if (iNavigationLayout == this.actionBarLayout && iNavigationLayout.getFragmentStack().size() <= 1 && !this.switchingAccount) {
                onFinish();
                finish();
                return false;
            }
            if (iNavigationLayout == this.rightActionBarLayout) {
                if (!this.tabletFullSize) {
                    this.backgroundTablet.setVisibility(0);
                }
            } else if (iNavigationLayout == this.layersActionBarLayout && this.actionBarLayout.getFragmentStack().isEmpty() && this.layersActionBarLayout.getFragmentStack().size() == 1) {
                onFinish();
                finish();
                return false;
            }
        } else if (iNavigationLayout.getFragmentStack().size() <= 1) {
            onFinish();
            finish();
            return false;
        }
        return true;
    }

    public void rebuildAllFragments(boolean z) {
        ActionBarLayout actionBarLayout = this.layersActionBarLayout;
        if (actionBarLayout != null) {
            actionBarLayout.rebuildAllFragmentViews(z, z);
        } else {
            this.actionBarLayout.rebuildAllFragmentViews(z, z);
        }
    }

    @Override // org.telegram.ui.ActionBar.INavigationLayout.INavigationLayoutDelegate
    public void onRebuildAllFragments(INavigationLayout iNavigationLayout, boolean z) {
        if (AndroidUtilities.isTablet() && iNavigationLayout == this.layersActionBarLayout) {
            this.rightActionBarLayout.rebuildAllFragmentViews(z, z);
            this.actionBarLayout.rebuildAllFragmentViews(z, z);
        }
    }

    public static BaseFragment getLastFragmentIncludeMainTabs() {
        BaseFragment lastFragment = getLastFragment();
        return lastFragment instanceof MainTabsActivity ? ((MainTabsActivity) lastFragment).getCurrentVisibleFragment() : lastFragment;
    }

    public static BaseFragment getLastFragment() {
        INavigationLayout iNavigationLayout;
        BubbleActivity bubbleActivity = BubbleActivity.instance;
        if (bubbleActivity != null && (iNavigationLayout = bubbleActivity.actionBarLayout) != null) {
            return iNavigationLayout.getLastFragment();
        }
        LaunchActivity launchActivity = instance;
        if (launchActivity != null && !launchActivity.sheetFragmentsStack.isEmpty()) {
            return ((INavigationLayout) instance.sheetFragmentsStack.get(r0.size() - 1)).getLastFragment();
        }
        LaunchActivity launchActivity2 = instance;
        if (launchActivity2 == null || launchActivity2.getActionBarLayout() == null) {
            return null;
        }
        return instance.getActionBarLayout().getLastFragment();
    }

    public static BaseFragment findFragment(Class cls) {
        INavigationLayout iNavigationLayout;
        BubbleActivity bubbleActivity = BubbleActivity.instance;
        if (bubbleActivity != null && (iNavigationLayout = bubbleActivity.actionBarLayout) != null) {
            return iNavigationLayout.findFragment(cls);
        }
        LaunchActivity launchActivity = instance;
        if (launchActivity != null && !launchActivity.sheetFragmentsStack.isEmpty()) {
            return ((INavigationLayout) instance.sheetFragmentsStack.get(r0.size() - 1)).findFragment(cls);
        }
        LaunchActivity launchActivity2 = instance;
        if (launchActivity2 == null || launchActivity2.getActionBarLayout() == null) {
            return null;
        }
        return instance.getActionBarLayout().findFragment(cls);
    }

    public static BaseFragment getSafeLastFragment() {
        INavigationLayout iNavigationLayout;
        BubbleActivity bubbleActivity = BubbleActivity.instance;
        if (bubbleActivity != null && (iNavigationLayout = bubbleActivity.actionBarLayout) != null) {
            return iNavigationLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = instance;
        if (launchActivity != null && !launchActivity.sheetFragmentsStack.isEmpty()) {
            return ((INavigationLayout) instance.sheetFragmentsStack.get(r0.size() - 1)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = instance;
        if (launchActivity2 == null || launchActivity2.getActionBarLayout() == null) {
            return null;
        }
        return instance.getActionBarLayout().getSafeLastFragment();
    }

    public int getNavigationBarColor() {
        if (Build.VERSION.SDK_INT >= 26) {
            return getWindow().getNavigationBarColor();
        }
        return 0;
    }

    public void setNavigationBarColor(int i) {
        this.drawerLayoutContainer.setInternalNavigationBarColor(i);
        BottomSheetTabs bottomSheetTabs = getBottomSheetTabs();
        if (bottomSheetTabs != null) {
            bottomSheetTabs.setNavigationBarColor(i);
        }
    }

    public BottomSheetTabs getBottomSheetTabs() {
        ActionBarLayout actionBarLayout = this.rightActionBarLayout;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.rightActionBarLayout.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.actionBarLayout;
        if (actionBarLayout2 == null || actionBarLayout2.getBottomSheetTabs() == null) {
            return null;
        }
        return this.actionBarLayout.getBottomSheetTabs();
    }

    public void animateNavigationBarColor(final int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.navBarAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.navBarAnimator = null;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(getNavigationBarColor(), i);
        this.navBarAnimator = ofArgb;
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda58
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LaunchActivity.$r8$lambda$BEKlB8jIczVKP68ncp7UeB_bA4Y(LaunchActivity.this, valueAnimator2);
            }
        });
        this.navBarAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LaunchActivity.19
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LaunchActivity.this.setNavigationBarColor(i);
            }
        });
        this.navBarAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.navBarAnimator.setDuration(320L);
        this.navBarAnimator.start();
    }

    public static /* synthetic */ void $r8$lambda$BEKlB8jIczVKP68ncp7UeB_bA4Y(LaunchActivity launchActivity, ValueAnimator valueAnimator) {
        launchActivity.getClass();
        launchActivity.setNavigationBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public boolean isLightNavigationBar() {
        return AndroidUtilities.getLightNavigationBar(getWindow());
    }

    private void openStory(final long j, final int i, final boolean z) {
        TL_stories.StoryItem storyItem;
        StoriesController.StoriesList storiesList;
        StoriesController.StoriesList storiesList2;
        MessageObject findMessageObject;
        MessageObject findMessageObject2;
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        TL_stories.PeerStories stories = storiesController.getStories(j);
        StoriesListPlaceProvider storiesListPlaceProvider = null;
        if (stories != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= stories.stories.size()) {
                    storyItem = null;
                    break;
                } else {
                    if (stories.stories.get(i2).id == i) {
                        storyItem = stories.stories.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (storyItem != null) {
                storyItem.dialogId = j;
                BaseFragment lastFragment = getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                if (lastFragment instanceof DialogsActivity) {
                    try {
                        storiesListPlaceProvider = StoriesListPlaceProvider.of(((DialogsActivity) lastFragment).dialogStoriesCell.recyclerListView);
                    } catch (Exception unused) {
                    }
                }
                lastFragment.getOrCreateStoryViewer().instantClose();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                if (z) {
                    lastFragment.getOrCreateStoryViewer().showViewsAfterOpening();
                }
                lastFragment.getOrCreateStoryViewer().open(this, storyItem, arrayList, 0, null, stories, storiesListPlaceProvider, false);
                return;
            }
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            StoriesController.StoriesList storiesList3 = storiesController.getStoriesList(j, 0);
            if (storiesList3 == null || (findMessageObject2 = storiesList3.findMessageObject(i)) == null) {
                storiesList3 = null;
            } else {
                storyItem = findMessageObject2.storyItem;
            }
            if (storyItem != null || (storiesList2 = storiesController.getStoriesList(j, 1)) == null || (findMessageObject = storiesList2.findMessageObject(i)) == null) {
                storiesList = storiesList3;
            } else {
                storyItem = findMessageObject.storyItem;
                storiesList = storiesList2;
            }
            if (storyItem != null && storiesList != null) {
                storyItem.dialogId = j;
                BaseFragment lastFragment2 = getLastFragment();
                if (lastFragment2 == null) {
                    return;
                }
                if (lastFragment2 instanceof DialogsActivity) {
                    try {
                        storiesListPlaceProvider = StoriesListPlaceProvider.of(((DialogsActivity) lastFragment2).dialogStoriesCell.recyclerListView);
                    } catch (Exception unused2) {
                    }
                }
                lastFragment2.getOrCreateStoryViewer().instantClose();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z) {
                    lastFragment2.getOrCreateStoryViewer().showViewsAfterOpening();
                }
                lastFragment2.getOrCreateStoryViewer().open(this, storyItem, arrayList2, 0, storiesList, null, storiesListPlaceProvider, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda56
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.$r8$lambda$4GuyTCIoll1J2DeWZ7LtFZKkRQ4(LaunchActivity.this, i, j, z, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$4GuyTCIoll1J2DeWZ7LtFZKkRQ4(final LaunchActivity launchActivity, final int i, final long j, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        launchActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda114
            @Override // java.lang.Runnable
            public final void run() {
                LaunchActivity.$r8$lambda$SlgqNNSSN_d1lWCxxzcQmI1Ao_s(LaunchActivity.this, tLObject, i, j, z);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$SlgqNNSSN_d1lWCxxzcQmI1Ao_s(LaunchActivity launchActivity, TLObject tLObject, int i, long j, boolean z) {
        StoriesListPlaceProvider storiesListPlaceProvider;
        TL_stories.StoryItem storyItem;
        launchActivity.getClass();
        if (tLObject instanceof TL_stories.TL_stories_stories) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            int i2 = 0;
            while (true) {
                storiesListPlaceProvider = null;
                if (i2 >= tL_stories_stories.stories.size()) {
                    storyItem = null;
                    break;
                } else {
                    if (tL_stories_stories.stories.get(i2).id == i) {
                        storyItem = tL_stories_stories.stories.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (storyItem != null) {
                storyItem.dialogId = j;
                BaseFragment lastFragment = getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                if (lastFragment instanceof DialogsActivity) {
                    try {
                        storiesListPlaceProvider = StoriesListPlaceProvider.of(((DialogsActivity) lastFragment).dialogStoriesCell.recyclerListView);
                    } catch (Exception unused) {
                    }
                }
                StoriesListPlaceProvider storiesListPlaceProvider2 = storiesListPlaceProvider;
                lastFragment.getOrCreateStoryViewer().instantClose();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j));
                if (z) {
                    lastFragment.getOrCreateStoryViewer().showViewsAfterOpening();
                }
                lastFragment.getOrCreateStoryViewer().open(launchActivity, storyItem, arrayList, 0, null, null, storiesListPlaceProvider2, false);
                return;
            }
        }
        BulletinFactory.global().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.StoryNotFound)).show(false);
    }

    private void openStories(long[] jArr, boolean z) {
        boolean z2;
        final long[] jArr2;
        StoriesListPlaceProvider of;
        int i = 0;
        while (true) {
            if (i >= jArr.length) {
                z2 = true;
                break;
            }
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jArr[i]));
            if (user != null && !user.stories_hidden) {
                z2 = false;
                break;
            }
            i++;
        }
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment == null) {
            return;
        }
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        ArrayList arrayList = new ArrayList(z2 ? storiesController.getHiddenList() : storiesController.getDialogListStories());
        boolean z3 = z2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (z3) {
            jArr2 = jArr;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jArr[i2]));
                if (user2 == null || !user2.stories_hidden) {
                    arrayList4.add(Long.valueOf(jArr[i2]));
                }
            }
            jArr2 = Longs.toArray(arrayList4);
        }
        if (z) {
            for (long j : jArr2) {
                arrayList3.add(Long.valueOf(j));
            }
        } else {
            for (long j2 : jArr2) {
                arrayList2.add(Long.valueOf(j2));
            }
        }
        if (!arrayList3.isEmpty() && z) {
            final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            final int[] iArr = {arrayList3.size()};
            final Runnable runnable = new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda53
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchActivity.$r8$lambda$A-VLXf7Ilyb2hDlX_KSUmB_Zlv8(LaunchActivity.this, iArr, jArr2);
                }
            };
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                final long longValue = ((Long) arrayList3.get(i3)).longValue();
                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                TLRPC.InputPeer inputPeer = messagesController.getInputPeer(longValue);
                tL_stories_getPeerStories.peer = inputPeer;
                if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
                    iArr[0] = iArr[0] - 1;
                } else if (inputPeer == null) {
                    iArr[0] = iArr[0] - 1;
                } else {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getPeerStories, new RequestDelegate() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda54
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda121
                                @Override // java.lang.Runnable
                                public final void run() {
                                    LaunchActivity.$r8$lambda$PzVaguVmmdUSDrqf0yTShFVY8Q0(TLObject.this, r2, r3, r5);
                                }
                            });
                        }
                    });
                }
            }
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i4)).peer);
            if (peerDialogId != clientUserId && !arrayList2.contains(Long.valueOf(peerDialogId)) && storiesController.hasUnreadStories(peerDialogId)) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (lastFragment instanceof DialogsActivity) {
            try {
                of = StoriesListPlaceProvider.of(((DialogsActivity) lastFragment).dialogStoriesCell.recyclerListView);
            } catch (Exception unused) {
            }
            StoriesListPlaceProvider storiesListPlaceProvider = of;
            lastFragment.getOrCreateStoryViewer().instantClose();
            lastFragment.getOrCreateStoryViewer().open(this, null, arrayList2, 0, null, null, storiesListPlaceProvider, false);
        }
        of = null;
        StoriesListPlaceProvider storiesListPlaceProvider2 = of;
        lastFragment.getOrCreateStoryViewer().instantClose();
        lastFragment.getOrCreateStoryViewer().open(this, null, arrayList2, 0, null, null, storiesListPlaceProvider2, false);
    }

    public static /* synthetic */ void $r8$lambda$A-VLXf7Ilyb2hDlX_KSUmB_Zlv8(LaunchActivity launchActivity, int[] iArr, long[] jArr) {
        launchActivity.getClass();
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            NotificationCenter.getInstance(launchActivity.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
            launchActivity.openStories(jArr, false);
        }
    }

    public static /* synthetic */ void $r8$lambda$PzVaguVmmdUSDrqf0yTShFVY8Q0(TLObject tLObject, MessagesController messagesController, long j, Runnable runnable) {
        if (tLObject instanceof TL_stories.TL_stories_peerStories) {
            TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
            messagesController.putUsers(tL_stories_peerStories.users, false);
            messagesController.getStoriesController().putStories(j, tL_stories_peerStories.stories);
            runnable.run();
            return;
        }
        runnable.run();
    }

    public static void dismissAllWeb() {
        ArrayList<BaseFragment.AttachedSheet> arrayList;
        BaseFragment safeLastFragment = getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        int i = 0;
        EmptyBaseFragment sheetFragment = safeLastFragment.getParentLayout() instanceof ActionBarLayout ? ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment(false) : null;
        if (sheetFragment != null && (arrayList = sheetFragment.sheetsStack) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                sheetFragment.sheetsStack.get(size).dismiss(true);
            }
        }
        ArrayList<BaseFragment.AttachedSheet> arrayList2 = safeLastFragment.sheetsStack;
        if (arrayList2 != null) {
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                safeLastFragment.sheetsStack.get(size2).dismiss(true);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = BotWebViewSheet.activeSheets.iterator();
        while (it.hasNext()) {
            arrayList3.add((BotWebViewSheet) it.next());
        }
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj = arrayList3.get(i);
            i++;
            ((BotWebViewSheet) obj).dismiss(true);
        }
    }

    public static void makeRipple(float f, float f2, float f3) {
        LaunchActivity launchActivity = instance;
        if (launchActivity == null) {
            return;
        }
        launchActivity.makeRippleInternal(f, f2, f3);
    }

    private void makeRippleInternal(float f, float f2, float f3) {
        ISuperRipple iSuperRipple;
        View decorView = getWindow().getDecorView();
        if (decorView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && ((iSuperRipple = this.currentRipple) == null || iSuperRipple.view != decorView)) {
            this.currentRipple = new SuperRipple(decorView);
        }
        ISuperRipple iSuperRipple2 = this.currentRipple;
        if (iSuperRipple2 != null) {
            iSuperRipple2.animate(f, f2, f3);
        }
    }

    public int getMainFragmentsStackSize() {
        return this.mainFragmentsStack.size();
    }

    @Override // org.telegram.messenger.pip.activity.IPipActivity
    public PipActivityController getPipController() {
        return this.pipActivityController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateReasonsToHideMainContent(boolean z, boolean z2) {
        int i = this.reasonsToHideMainContent + (z ? 1 : -1);
        this.reasonsToHideMainContent = i;
        if (z2) {
            this.reasonsToHideDecorView += z ? 1 : -1;
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(i > 0 ? 8 : 0);
        }
        checkDecorViewVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkDecorViewVisibility() {
        getWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ActivityVisibilityController createActivityVisibilityController(boolean z) {
        return new ActivityVisibilityController(z);
    }

    public static WindowVisibilityManager.Controller obtainActivityVisibilityController() {
        LaunchActivity launchActivity = instance;
        if (launchActivity != null) {
            return launchActivity.createActivityVisibilityController(true);
        }
        return null;
    }

    public static class ActivityVisibilityController implements WindowVisibilityManager.Controller {
        private final WeakReference activity;
        private boolean destroyed;
        private boolean hidden;
        private final boolean withDecorView;

        private ActivityVisibilityController(LaunchActivity launchActivity, boolean z) {
            this.activity = new WeakReference(launchActivity);
            this.withDecorView = z;
        }

        @Override // org.telegram.messenger.utils.WindowVisibilityManager.Controller
        public void setHidden(boolean z) {
            if (this.hidden == z || this.destroyed) {
                return;
            }
            this.hidden = z;
            LaunchActivity launchActivity = (LaunchActivity) this.activity.get();
            if (launchActivity != null) {
                launchActivity.updateReasonsToHideMainContent(z, this.withDecorView);
            }
        }

        @Override // org.telegram.messenger.utils.WindowVisibilityManager.Controller
        public void destroy() {
            setHidden(false);
            this.destroyed = true;
        }

        public void show() {
            setHidden(false);
        }

        public void hide() {
            setHidden(true);
        }
    }

    private class ActivityContentLayout extends FrameLayout {
        public ActivityContentLayout(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            LaunchActivity.this.drawRippleAbove(canvas, this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
            return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
        }
    }
}
