package org.telegram.ui.bots;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.ChatListItemAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputInvoice;
import org.telegram.tgnet.TLRPC$PaymentForm;
import org.telegram.tgnet.TLRPC$PaymentReceipt;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_prolongWebView;
import org.telegram.tgnet.TLRPC$TL_messages_requestWebView;
import org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars;
import org.telegram.tgnet.TLRPC$TL_webViewResultUrl;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.bots.BotWebViewAttachedSheet;
import org.telegram.ui.bots.BotWebViewContainer;
import org.telegram.ui.bots.BotWebViewMenuContainer;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
/* loaded from: classes4.dex */
public class BotWebViewMenuContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final SimpleFloatPropertyCompat<BotWebViewMenuContainer> ACTION_BAR_TRANSITION_PROGRESS_VALUE = new SimpleFloatPropertyCompat("actionBarTransitionProgress", new SimpleFloatPropertyCompat.Getter() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda22
        @Override // org.telegram.ui.Components.SimpleFloatPropertyCompat.Getter
        public final float get(Object obj) {
            float f;
            f = ((BotWebViewMenuContainer) obj).actionBarTransitionProgress;
            return f;
        }
    }, new SimpleFloatPropertyCompat.Setter() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda23
        @Override // org.telegram.ui.Components.SimpleFloatPropertyCompat.Setter
        public final void set(Object obj, float f) {
            BotWebViewMenuContainer.lambda$static$1((BotWebViewMenuContainer) obj, f);
        }
    }).setMultiplier(100.0f);
    private int actionBarColorKey;
    ActionBarColorsAnimating actionBarColors;
    private boolean actionBarIsLight;
    private ActionBar.ActionBarMenuOnItemClick actionBarOnItemClick;
    private Paint actionBarPaint;
    private float actionBarTransitionProgress;
    private ActionBarMenuSubItem addToHomeScreenItem;
    private Paint backgroundPaint;
    private ActionBarMenuItem botCollapseItem;
    private long botId;
    private ActionBarMenuItem botMenuItem;
    private String botUrl;
    private SpringAnimation botWebViewButtonAnimator;
    private boolean botWebViewButtonWasVisible;
    private final Path clipPath;
    private int currentAccount;
    private Paint dimPaint;
    private boolean dismissed;
    private boolean drawingFromOverlay;
    private Runnable globalOnDismissListener;
    private boolean ignoreLayout;
    private boolean ignoreMeasure;
    private boolean isLoaded;
    private int lineColor;
    private Paint linePaint;
    private TLObject loadedResponse;
    private long loadedResponseTime;
    private BotWebViewAttachedSheet.MainButtonSettings mainButtonSettings;
    private boolean needCloseConfirmation;
    private int overrideActionBarBackground;
    private float overrideActionBarBackgroundProgress;
    private boolean overrideBackgroundColor;
    private ChatActivityEnterView parentEnterView;
    private Runnable pollRunnable;
    private boolean preserving;
    private ChatAttachAlertBotWebViewLayout.WebProgressView progressView;
    private long queryId;
    private final RectF rect;
    private MessageObject savedEditMessageObject;
    private Editable savedEditText;
    private MessageObject savedReplyMessageObject;
    private ActionBarMenuSubItem settingsItem;
    private SpringAnimation springAnimation;
    private ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer swipeContainer;
    private Boolean wasLightStatusBar;
    private BotWebViewContainer webViewContainer;
    private BotWebViewContainer.Delegate webViewDelegate;
    private ValueAnimator webViewScrollAnimator;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(BotWebViewMenuContainer botWebViewMenuContainer, float f) {
        botWebViewMenuContainer.actionBarTransitionProgress = f;
        botWebViewMenuContainer.invalidate();
        botWebViewMenuContainer.invalidateActionBar();
        ActionBarMenuItem actionBarMenuItem = botWebViewMenuContainer.botCollapseItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setAlpha(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4() {
        if (this.dismissed) {
            return;
        }
        TLRPC$TL_messages_prolongWebView tLRPC$TL_messages_prolongWebView = new TLRPC$TL_messages_prolongWebView();
        tLRPC$TL_messages_prolongWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
        tLRPC$TL_messages_prolongWebView.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.botId);
        tLRPC$TL_messages_prolongWebView.query_id = this.queryId;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_prolongWebView, new RequestDelegate() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda20
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotWebViewMenuContainer.this.lambda$new$3(tLObject, tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewMenuContainer.this.lambda$new$2(tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(TLRPC$TL_error tLRPC$TL_error) {
        if (this.dismissed) {
            return;
        }
        if (tLRPC$TL_error != null) {
            dismiss();
        } else {
            AndroidUtilities.runOnUIThread(this.pollRunnable, 60000L);
        }
    }

    public BottomSheetTabs.WebTabData saveState() {
        this.preserving = true;
        BottomSheetTabs.WebTabData webTabData = new BottomSheetTabs.WebTabData();
        webTabData.actionBarColor = this.overrideBackgroundColor ? this.overrideActionBarBackground : this.actionBarColors.getColor(Theme.key_windowBackgroundWhite);
        webTabData.actionBarColorKey = this.actionBarColorKey;
        webTabData.overrideActionBarColor = this.overrideBackgroundColor;
        webTabData.backgroundColor = this.backgroundPaint.getColor();
        BotWebViewAttachedSheet.WebViewRequestProps webViewRequestProps = new BotWebViewAttachedSheet.WebViewRequestProps();
        webTabData.props = webViewRequestProps;
        webViewRequestProps.currentAccount = this.currentAccount;
        long j = this.botId;
        webViewRequestProps.botId = j;
        webViewRequestProps.peerId = j;
        webViewRequestProps.buttonUrl = this.botUrl;
        webViewRequestProps.type = 2;
        webViewRequestProps.response = this.loadedResponse;
        webViewRequestProps.responseTime = this.loadedResponseTime;
        BotWebViewContainer botWebViewContainer = this.webViewContainer;
        boolean z = false;
        webTabData.ready = botWebViewContainer != null && botWebViewContainer.isPageLoaded();
        BotWebViewContainer botWebViewContainer2 = this.webViewContainer;
        webTabData.lastUrl = botWebViewContainer2 != null ? botWebViewContainer2.getUrlLoaded() : null;
        webTabData.themeIsDark = Theme.isCurrentThemeDark();
        ActionBarMenuSubItem actionBarMenuSubItem = this.settingsItem;
        webTabData.settings = actionBarMenuSubItem != null && actionBarMenuSubItem.getVisibility() == 0;
        webTabData.main = this.mainButtonSettings;
        webTabData.confirmDismiss = this.needCloseConfirmation;
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        if (webViewSwipeContainer != null && 1.0f - (Math.min(webViewSwipeContainer.getTopActionBarOffsetY(), this.swipeContainer.getTranslationY() - this.swipeContainer.getTopActionBarOffsetY()) / this.swipeContainer.getTopActionBarOffsetY()) > 0.5f) {
            z = true;
        }
        webTabData.expanded = z;
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer2 = this.swipeContainer;
        webTabData.expandedOffset = webViewSwipeContainer2 != null ? webViewSwipeContainer2.getOffsetY() : Float.MAX_VALUE;
        webTabData.needsContext = true;
        BotWebViewContainer botWebViewContainer3 = this.webViewContainer;
        BotWebViewContainer.MyWebView webView = botWebViewContainer3 == null ? null : botWebViewContainer3.getWebView();
        if (webView != null) {
            this.webViewContainer.preserveWebView();
            webTabData.webView = webView;
            BotWebViewContainer botWebViewContainer4 = this.webViewContainer;
            webTabData.webViewProxy = botWebViewContainer4 == null ? null : botWebViewContainer4.getProxy();
            webTabData.webViewWidth = webView.getWidth();
            webTabData.webViewScroll = webView.getScrollY();
            webTabData.webViewHeight = webView.getHeight();
            webView.onPause();
            webView.setContainers(null, null);
        }
        return webTabData;
    }

    private void checkBotMenuItem() {
        if (this.botCollapseItem == null) {
            ActionBarMenu createMenu = this.parentEnterView.getParentFragment().getActionBar().createMenu();
            ActionBarMenuItem addItem = createMenu.addItem(R.id.menu_collapse_bot, R.drawable.arrow_more);
            this.botCollapseItem = addItem;
            createMenu.removeView(addItem);
            createMenu.addView(this.botCollapseItem, 0);
            this.botCollapseItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BotWebViewMenuContainer.this.lambda$checkBotMenuItem$5(view);
                }
            });
            this.botCollapseItem.setAlpha(this.actionBarTransitionProgress);
            this.botCollapseItem.setVisibility(8);
        }
        if (this.botMenuItem == null) {
            ActionBarMenuItem addItem2 = this.parentEnterView.getParentFragment().getActionBar().createMenu().addItem(1000, R.drawable.ic_ab_other);
            this.botMenuItem = addItem2;
            addItem2.setVisibility(8);
            this.botMenuItem.addSubItem(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            ActionBarMenuSubItem addSubItem = this.botMenuItem.addSubItem(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            this.settingsItem = addSubItem;
            addSubItem.setVisibility(8);
            this.addToHomeScreenItem = this.botMenuItem.addSubItem(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            if (this.botId != 0 && MediaDataController.getInstance(this.currentAccount).canCreateAttachedMenuBotShortcut(this.botId)) {
                this.addToHomeScreenItem.setVisibility(0);
            } else {
                this.addToHomeScreenItem.setVisibility(8);
            }
            this.botMenuItem.addSubItem(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkBotMenuItem$5(View view) {
        dismiss(true);
    }

    public BotWebViewMenuContainer(Context context, final ChatActivityEnterView chatActivityEnterView) {
        super(context);
        this.dimPaint = new Paint();
        this.backgroundPaint = new Paint(1);
        this.actionBarPaint = new Paint(1);
        this.linePaint = new Paint();
        this.actionBarColorKey = -1;
        this.pollRunnable = new Runnable() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewMenuContainer.this.lambda$new$4();
            }
        };
        this.rect = new RectF();
        this.clipPath = new Path();
        ActionBarColorsAnimating actionBarColorsAnimating = new ActionBarColorsAnimating();
        this.actionBarColors = actionBarColorsAnimating;
        actionBarColorsAnimating.setTo(0, null);
        this.actionBarColors.progress = 1.0f;
        this.parentEnterView = chatActivityEnterView;
        final ActionBar actionBar = chatActivityEnterView.getParentFragment().getActionBar();
        this.actionBarOnItemClick = actionBar.getActionBarMenuOnItemClick();
        BotWebViewContainer botWebViewContainer = new BotWebViewContainer(context, chatActivityEnterView.getParentFragment().getResourceProvider(), getColor(Theme.key_windowBackgroundWhite)) { // from class: org.telegram.ui.bots.BotWebViewMenuContainer.1
            @Override // org.telegram.ui.bots.BotWebViewContainer
            public void onWebViewCreated() {
                BotWebViewMenuContainer.this.swipeContainer.setWebView(BotWebViewMenuContainer.this.webViewContainer.getWebView());
            }
        };
        this.webViewContainer = botWebViewContainer;
        2 r4 = new 2(chatActivityEnterView, actionBar);
        this.webViewDelegate = r4;
        botWebViewContainer.setDelegate(r4);
        this.linePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.dimPaint.setColor(1073741824);
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer(context) { // from class: org.telegram.ui.bots.BotWebViewMenuContainer.3
            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
            @Override // android.widget.FrameLayout, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void onMeasure(int i, int i2) {
                int i3;
                float f;
                int size = View.MeasureSpec.getSize(i2);
                if (!AndroidUtilities.isTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i3 = (int) (size / 3.5f);
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        f = i3;
                        if (getOffsetY() != f) {
                            BotWebViewMenuContainer.this.ignoreLayout = true;
                            setOffsetY(f);
                            BotWebViewMenuContainer.this.ignoreLayout = false;
                        }
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((View.MeasureSpec.getSize(i2) - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.dp(5.0f), 1073741824));
                    }
                }
                i3 = (size / 5) * 2;
                if (i3 < 0) {
                }
                f = i3;
                if (getOffsetY() != f) {
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((View.MeasureSpec.getSize(i2) - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.dp(5.0f), 1073741824));
            }

            @Override // android.view.View, android.view.ViewParent
            public void requestLayout() {
                if (BotWebViewMenuContainer.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.swipeContainer = webViewSwipeContainer;
        webViewSwipeContainer.setScrollListener(new Runnable() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewMenuContainer.this.lambda$new$6(actionBar);
            }
        });
        this.swipeContainer.setScrollEndListener(new Runnable() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewMenuContainer.this.lambda$new$7();
            }
        });
        this.swipeContainer.addView(this.webViewContainer);
        this.swipeContainer.setDelegate(new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda24
            @Override // org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate
            public final void onDismiss() {
                BotWebViewMenuContainer.this.lambda$new$8();
            }
        });
        this.swipeContainer.setTopActionBarOffsetY((ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
        this.swipeContainer.setSwipeOffsetAnimationDisallowed(true);
        this.swipeContainer.setIsKeyboardVisible(new GenericProvider() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda19
            @Override // org.telegram.messenger.GenericProvider
            public final Object provide(Object obj) {
                Boolean lambda$new$9;
                lambda$new$9 = BotWebViewMenuContainer.lambda$new$9(ChatActivityEnterView.this, (Void) obj);
                return lambda$new$9;
            }
        });
        addView(this.swipeContainer, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 24.0f, 0.0f, 0.0f));
        ChatAttachAlertBotWebViewLayout.WebProgressView webProgressView = new ChatAttachAlertBotWebViewLayout.WebProgressView(context, chatActivityEnterView.getParentFragment().getResourceProvider());
        this.progressView = webProgressView;
        addView(webProgressView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 5.0f));
        this.webViewContainer.setWebViewProgressListener(new Consumer() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda6
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                BotWebViewMenuContainer.this.lambda$new$11((Float) obj);
            }
        });
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class 2 implements BotWebViewContainer.Delegate {
        final /* synthetic */ ActionBar val$actionBar;
        final /* synthetic */ ChatActivityEnterView val$parentEnterView;

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public /* synthetic */ void onSendWebViewData(String str) {
            BotWebViewContainer.Delegate.-CC.$default$onSendWebViewData(this, str);
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public /* synthetic */ void onWebAppReady() {
            BotWebViewContainer.Delegate.-CC.$default$onWebAppReady(this);
        }

        2(ChatActivityEnterView chatActivityEnterView, ActionBar actionBar) {
            this.val$parentEnterView = chatActivityEnterView;
            this.val$actionBar = actionBar;
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onCloseRequested(Runnable runnable) {
            BotWebViewMenuContainer.this.dismiss(runnable);
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onWebAppSetupClosingBehavior(boolean z) {
            BotWebViewMenuContainer.this.needCloseConfirmation = z;
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onWebAppSetActionBarColor(int i, final int i2, boolean z) {
            final int i3 = BotWebViewMenuContainer.this.overrideActionBarBackground;
            BotWebViewMenuContainer.this.actionBarColorKey = i;
            BotWebViewMenuContainer.this.actionBarColors = new ActionBarColorsAnimating();
            BotWebViewMenuContainer botWebViewMenuContainer = BotWebViewMenuContainer.this;
            botWebViewMenuContainer.actionBarColors.setFrom(botWebViewMenuContainer.overrideBackgroundColor ? i3 : 0, null);
            BotWebViewMenuContainer.this.overrideBackgroundColor = z;
            BotWebViewMenuContainer.this.actionBarIsLight = ColorUtils.calculateLuminance(i2) < 0.5d;
            BotWebViewMenuContainer botWebViewMenuContainer2 = BotWebViewMenuContainer.this;
            botWebViewMenuContainer2.actionBarColors.setTo(botWebViewMenuContainer2.overrideBackgroundColor ? i2 : 0, null);
            if (i3 == 0) {
                BotWebViewMenuContainer.this.overrideActionBarBackground = i2;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$2$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewMenuContainer.2.this.lambda$onWebAppSetActionBarColor$0(i3, i2, valueAnimator);
                }
            });
            duration.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onWebAppSetActionBarColor$0(int i, int i2, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (i == 0) {
                BotWebViewMenuContainer.this.overrideActionBarBackgroundProgress = floatValue;
            } else {
                BotWebViewMenuContainer.this.overrideActionBarBackground = ColorUtils.blendARGB(i, i2, floatValue);
            }
            BotWebViewMenuContainer botWebViewMenuContainer = BotWebViewMenuContainer.this;
            botWebViewMenuContainer.actionBarColors.progress = floatValue;
            botWebViewMenuContainer.actionBarPaint.setColor(BotWebViewMenuContainer.this.overrideActionBarBackground);
            BotWebViewMenuContainer.this.invalidateActionBar();
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onWebAppSetBackgroundColor(final int i) {
            BotWebViewMenuContainer.this.overrideBackgroundColor = true;
            final int color = BotWebViewMenuContainer.this.backgroundPaint.getColor();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$2$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewMenuContainer.2.this.lambda$onWebAppSetBackgroundColor$1(color, i, valueAnimator);
                }
            });
            duration.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onWebAppSetBackgroundColor$1(int i, int i2, ValueAnimator valueAnimator) {
            BotWebViewMenuContainer.this.backgroundPaint.setColor(ColorUtils.blendARGB(i, i2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            BotWebViewMenuContainer.this.invalidate();
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onWebAppExpand() {
            if (BotWebViewMenuContainer.this.swipeContainer.isSwipeInProgress()) {
                return;
            }
            BotWebViewMenuContainer.this.swipeContainer.stickTo((-BotWebViewMenuContainer.this.swipeContainer.getOffsetY()) + BotWebViewMenuContainer.this.swipeContainer.getTopActionBarOffsetY());
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onWebAppSwitchInlineQuery(final TLRPC$User tLRPC$User, final String str, List<String> list) {
            if (list.isEmpty()) {
                ChatActivityEnterView chatActivityEnterView = this.val$parentEnterView;
                chatActivityEnterView.setFieldText("@" + UserObject.getPublicUsername(tLRPC$User) + " " + str);
                BotWebViewMenuContainer.this.dismiss();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialogsType", 14);
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("allowGroups", list.contains("groups"));
            bundle.putBoolean("allowUsers", list.contains("users"));
            bundle.putBoolean("allowChannels", list.contains("channels"));
            bundle.putBoolean("allowBots", list.contains("bots"));
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$2$$ExternalSyntheticLambda4
                @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
                    boolean lambda$onWebAppSwitchInlineQuery$2;
                    lambda$onWebAppSwitchInlineQuery$2 = BotWebViewMenuContainer.2.this.lambda$onWebAppSwitchInlineQuery$2(tLRPC$User, str, dialogsActivity2, arrayList, charSequence, z, topicsFragment);
                    return lambda$onWebAppSwitchInlineQuery$2;
                }
            });
            this.val$parentEnterView.getParentFragment().presentFragment(dialogsActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$onWebAppSwitchInlineQuery$2(TLRPC$User tLRPC$User, String str, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
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
            bundle.putString("start_text", "@" + UserObject.getPublicUsername(tLRPC$User) + " " + str);
            if (MessagesController.getInstance(BotWebViewMenuContainer.this.currentAccount).checkCanOpenChat(bundle, dialogsActivity)) {
                dialogsActivity.presentFragment(new INavigationLayout.NavigationParams(new ChatActivity(bundle)).setRemoveLast(true));
            }
            return true;
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onWebAppOpenInvoice(TLRPC$InputInvoice tLRPC$InputInvoice, final String str, TLObject tLObject) {
            PaymentFormActivity paymentFormActivity;
            ChatActivity parentFragment = this.val$parentEnterView.getParentFragment();
            if (tLObject instanceof TLRPC$TL_payments_paymentFormStars) {
                final AlertDialog alertDialog = new AlertDialog(BotWebViewMenuContainer.this.getContext(), 3);
                alertDialog.showDelayed(150L);
                StarsController.getInstance(BotWebViewMenuContainer.this.currentAccount).openPaymentForm(null, tLRPC$InputInvoice, (TLRPC$TL_payments_paymentFormStars) tLObject, new Runnable() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AlertDialog.this.dismiss();
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$2$$ExternalSyntheticLambda3
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        BotWebViewMenuContainer.2.this.lambda$onWebAppOpenInvoice$4(str, (String) obj);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC$PaymentForm) {
                TLRPC$PaymentForm tLRPC$PaymentForm = (TLRPC$PaymentForm) tLObject;
                MessagesController.getInstance(BotWebViewMenuContainer.this.currentAccount).putUsers(tLRPC$PaymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(tLRPC$PaymentForm, str, parentFragment);
            } else {
                paymentFormActivity = tLObject instanceof TLRPC$PaymentReceipt ? new PaymentFormActivity((TLRPC$PaymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$2$$ExternalSyntheticLambda5
                    @Override // org.telegram.ui.PaymentFormActivity.PaymentFormCallback
                    public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                        BotWebViewMenuContainer.2.this.lambda$onWebAppOpenInvoice$5(str, invoiceStatus);
                    }
                });
                parentFragment.presentFragment(paymentFormActivity);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onWebAppOpenInvoice$4(String str, String str2) {
            BotWebViewMenuContainer.this.webViewContainer.onInvoiceStatusUpdate(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onWebAppOpenInvoice$5(String str, PaymentFormActivity.InvoiceStatus invoiceStatus) {
            BotWebViewMenuContainer.this.webViewContainer.onInvoiceStatusUpdate(str, invoiceStatus.name().toLowerCase(Locale.ROOT));
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onSetupMainButton(boolean z, boolean z2, String str, int i, int i2, boolean z3) {
            BotWebViewMenuContainer.this.setMainButton(BotWebViewAttachedSheet.MainButtonSettings.of(z, z2, str, i, i2, z3));
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onSetBackButtonVisible(boolean z) {
            if (BotWebViewMenuContainer.this.actionBarTransitionProgress == 1.0f) {
                if (z) {
                    AndroidUtilities.updateImageViewImageAnimated(this.val$actionBar.getBackButton(), this.val$actionBar.getBackButtonDrawable());
                } else {
                    AndroidUtilities.updateImageViewImageAnimated(this.val$actionBar.getBackButton(), R.drawable.ic_close_white);
                }
            }
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public void onSetSettingsButtonVisible(boolean z) {
            if (BotWebViewMenuContainer.this.settingsItem != null) {
                BotWebViewMenuContainer.this.settingsItem.setVisibility(z ? 0 : 8);
            }
        }

        @Override // org.telegram.ui.bots.BotWebViewContainer.Delegate
        public boolean isClipboardAvailable() {
            return MediaDataController.getInstance(BotWebViewMenuContainer.this.currentAccount).botInAttachMenu(BotWebViewMenuContainer.this.botId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6(ActionBar actionBar) {
        float f = 0.0f;
        if (this.swipeContainer.getSwipeOffsetY() > 0.0f) {
            this.dimPaint.setAlpha((int) ((1.0f - (Math.min(this.swipeContainer.getSwipeOffsetY(), this.swipeContainer.getHeight()) / this.swipeContainer.getHeight())) * 64.0f));
        } else {
            this.dimPaint.setAlpha(64);
        }
        invalidate();
        this.webViewContainer.invalidateViewPortHeight();
        if (this.springAnimation != null) {
            float min = 1.0f - (Math.min(this.swipeContainer.getTopActionBarOffsetY(), this.swipeContainer.getTranslationY() - this.swipeContainer.getTopActionBarOffsetY()) / this.swipeContainer.getTopActionBarOffsetY());
            if (getVisibility() == 0 && !this.preserving) {
                f = min;
            }
            float f2 = (f > 0.5f ? 1 : 0) * 100.0f;
            if (this.springAnimation.getSpring().getFinalPosition() != f2) {
                this.springAnimation.getSpring().setFinalPosition(f2);
                if (f2 == 100.0f) {
                    checkBotMenuItem();
                    ActionBarMenuItem actionBarMenuItem = this.botCollapseItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setVisibility(0);
                    }
                }
                this.springAnimation.start();
                if (!this.webViewContainer.isBackButtonVisible()) {
                    if (f2 == 100.0f) {
                        AndroidUtilities.updateImageViewImageAnimated(actionBar.getBackButton(), R.drawable.ic_close_white);
                    } else {
                        AndroidUtilities.updateImageViewImageAnimated(actionBar.getBackButton(), actionBar.getBackButtonDrawable());
                    }
                }
            }
        }
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$7() {
        this.webViewContainer.invalidateViewPortHeight(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$8() {
        dismiss(true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$new$9(ChatActivityEnterView chatActivityEnterView, Void r1) {
        return Boolean.valueOf(chatActivityEnterView.getSizeNotifierLayout().getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$11(Float f) {
        this.progressView.setLoadProgressAnimated(f.floatValue());
        if (f.floatValue() == 1.0f) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewMenuContainer.this.lambda$new$10(valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BotWebViewMenuContainer.this.progressView.setVisibility(8);
                }
            });
            duration.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$10(ValueAnimator valueAnimator) {
        this.progressView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateActionBar() {
        ChatActivity parentFragment = this.parentEnterView.getParentFragment();
        if (parentFragment == null || getVisibility() != 0) {
            return;
        }
        ActionBar actionBar = parentFragment.getActionBar();
        int i = Theme.key_actionBarDefault;
        int color = getColor(i);
        int i2 = Theme.key_windowBackgroundWhite;
        int blendARGB = ColorUtils.blendARGB(color, getColor(i2), this.actionBarTransitionProgress);
        if (this.overrideBackgroundColor) {
            blendARGB = ColorUtils.blendARGB(getColor(i), this.overrideActionBarBackground, this.actionBarTransitionProgress);
        } else {
            ColorUtils.blendARGB(getColor(i), this.actionBarColors.getColor(i2), this.actionBarTransitionProgress);
        }
        actionBar.setBackgroundColor(blendARGB);
        int i3 = Theme.key_actionBarDefaultIcon;
        int color2 = getColor(i3);
        ActionBarColorsAnimating actionBarColorsAnimating = this.actionBarColors;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setItemsColor(ColorUtils.blendARGB(color2, actionBarColorsAnimating.getColor(i4), this.actionBarTransitionProgress), false);
        ImageView imageView = actionBar.backButtonImageView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(getColor(i3), this.actionBarColors.getColor(i4), this.actionBarTransitionProgress), PorterDuff.Mode.SRC_IN));
        }
        actionBar.setItemsBackgroundColor(ColorUtils.blendARGB(getColor(Theme.key_actionBarDefaultSelector), this.actionBarColors.getColor(Theme.key_actionBarWhiteSelector), this.actionBarTransitionProgress), false);
        parentFragment.getAvatarContainer().setAlpha(1.0f - this.actionBarTransitionProgress);
        parentFragment.getOrCreateWebBotTitleView().setAlpha(this.actionBarTransitionProgress);
        parentFragment.getOrCreateWebBotTitleView().setTextColor(ColorUtils.blendARGB(getColor(i3), this.actionBarColors.getColor(i4), this.actionBarTransitionProgress));
        updateLightStatusBar();
    }

    public boolean onBackPressed() {
        if (this.webViewContainer.onBackPressed()) {
            return true;
        }
        if (getVisibility() == 0) {
            dismiss(true);
            return true;
        }
        return false;
    }

    public boolean onCheckDismissByUser() {
        if (this.needCloseConfirmation) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
            AlertDialog create = new AlertDialog.Builder(getContext()).setTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : null).setMessage(LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved)).setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BotWebViewMenuContainer.this.lambda$onCheckDismissByUser$12(dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
            create.show();
            ((TextView) create.getButton(-1)).setTextColor(getColor(Theme.key_text_RedBold));
            return false;
        }
        dismiss();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCheckDismissByUser$12(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    private void animateBotButton(final boolean z) {
        final ChatActivityBotWebViewButton botWebViewButton = this.parentEnterView.getBotWebViewButton();
        SpringAnimation springAnimation = this.botWebViewButtonAnimator;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.botWebViewButtonAnimator = null;
        }
        botWebViewButton.setProgress(z ? 0.0f : 1.0f);
        if (z) {
            botWebViewButton.setVisibility(0);
        }
        SimpleFloatPropertyCompat<ChatActivityBotWebViewButton> simpleFloatPropertyCompat = ChatActivityBotWebViewButton.PROGRESS_PROPERTY;
        SpringAnimation addEndListener = new SpringAnimation(botWebViewButton, simpleFloatPropertyCompat).setSpring(new SpringForce((z ? 1.0f : 0.0f) * simpleFloatPropertyCompat.getMultiplier()).setStiffness(z ? 600.0f : 750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda10
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                BotWebViewMenuContainer.this.lambda$animateBotButton$13(dynamicAnimation, f, f2);
            }
        }).addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda9
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                BotWebViewMenuContainer.this.lambda$animateBotButton$14(z, botWebViewButton, dynamicAnimation, z2, f, f2);
            }
        });
        this.botWebViewButtonAnimator = addEndListener;
        addEndListener.start();
        this.botWebViewButtonWasVisible = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateBotButton$13(DynamicAnimation dynamicAnimation, float f, float f2) {
        float multiplier = f / ChatActivityBotWebViewButton.PROGRESS_PROPERTY.getMultiplier();
        this.parentEnterView.setBotWebViewButtonOffsetX(AndroidUtilities.dp(64.0f) * multiplier);
        this.parentEnterView.setComposeShadowAlpha(1.0f - multiplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateBotButton$14(boolean z, ChatActivityBotWebViewButton chatActivityBotWebViewButton, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (!z) {
            chatActivityBotWebViewButton.setVisibility(8);
        }
        if (this.botWebViewButtonAnimator == dynamicAnimation) {
            this.botWebViewButtonAnimator = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.springAnimation == null) {
            this.springAnimation = new SpringAnimation(this, ACTION_BAR_TRANSITION_PROGRESS_VALUE).setSpring(new SpringForce().setStiffness(1200.0f).setDampingRatio(1.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda8
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    BotWebViewMenuContainer.this.lambda$onAttachedToWindow$15(dynamicAnimation, z, f, f2);
                }
            });
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAttachedToWindow$15(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        ChatActivity parentFragment = this.parentEnterView.getParentFragment();
        ChatAvatarContainer avatarContainer = parentFragment.getAvatarContainer();
        avatarContainer.setClickable(f == 0.0f);
        avatarContainer.getAvatarImageView().setClickable(f == 0.0f);
        ActionBar actionBar = parentFragment.getActionBar();
        if (f == 100.0f && this.parentEnterView.hasBotWebView()) {
            parentFragment.showHeaderItem(false);
            checkBotMenuItem();
            this.botMenuItem.setVisibility(0);
            this.botCollapseItem.setVisibility(0);
            actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer.5
                @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
                public void onItemClick(int i) {
                    if (i == -1) {
                        if (BotWebViewMenuContainer.this.webViewContainer.onBackPressed()) {
                            return;
                        }
                        BotWebViewMenuContainer.this.onCheckDismissByUser();
                    } else if (i == R.id.menu_reload_page) {
                        if (BotWebViewMenuContainer.this.webViewContainer.getWebView() != null) {
                            BotWebViewMenuContainer.this.webViewContainer.getWebView().animate().cancel();
                            BotWebViewMenuContainer.this.webViewContainer.getWebView().animate().alpha(0.0f).start();
                        }
                        BotWebViewMenuContainer.this.isLoaded = false;
                        BotWebViewMenuContainer.this.progressView.setLoadProgress(0.0f);
                        BotWebViewMenuContainer.this.progressView.setAlpha(1.0f);
                        BotWebViewMenuContainer.this.progressView.setVisibility(0);
                        BotWebViewMenuContainer.this.webViewContainer.setBotUser(MessagesController.getInstance(BotWebViewMenuContainer.this.currentAccount).getUser(Long.valueOf(BotWebViewMenuContainer.this.botId)));
                        BotWebViewMenuContainer.this.webViewContainer.loadFlickerAndSettingsItem(BotWebViewMenuContainer.this.currentAccount, BotWebViewMenuContainer.this.botId, BotWebViewMenuContainer.this.settingsItem);
                        BotWebViewMenuContainer.this.webViewContainer.reload();
                    } else if (i == R.id.menu_settings) {
                        BotWebViewMenuContainer.this.webViewContainer.onSettingsButtonPressed();
                    } else if (i == R.id.menu_add_to_home_screen_bot) {
                        MediaDataController.getInstance(BotWebViewMenuContainer.this.currentAccount).installShortcut(BotWebViewMenuContainer.this.botId, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                    } else if (i == R.id.menu_tos_bot) {
                        Browser.openUrl(BotWebViewMenuContainer.this.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                    }
                }
            });
            return;
        }
        parentFragment.showHeaderItem(true);
        ActionBarMenuItem actionBarMenuItem = this.botMenuItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(8);
        }
        ActionBarMenuItem actionBarMenuItem2 = this.botCollapseItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setVisibility(8);
        }
        actionBar.setActionBarMenuOnItemClick(this.actionBarOnItemClick);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpringAnimation springAnimation = this.springAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.springAnimation = null;
        }
        this.actionBarTransitionProgress = 0.0f;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.ignoreMeasure) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void onPanTransitionStart(boolean z, int i) {
        boolean z2;
        if (z) {
            float topActionBarOffsetY = (-this.swipeContainer.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY();
            if (this.swipeContainer.getSwipeOffsetY() != topActionBarOffsetY) {
                this.swipeContainer.stickTo(topActionBarOffsetY);
                z2 = true;
            } else {
                z2 = false;
            }
            int measureKeyboardHeight = this.parentEnterView.getSizeNotifierLayout().measureKeyboardHeight() + i;
            setMeasuredDimension(getMeasuredWidth(), i);
            this.ignoreMeasure = true;
            if (z2) {
                return;
            }
            ValueAnimator valueAnimator = this.webViewScrollAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.webViewScrollAnimator = null;
            }
            if (this.webViewContainer.getWebView() != null) {
                int scrollY = this.webViewContainer.getWebView().getScrollY();
                final int i2 = (measureKeyboardHeight - i) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i2).setDuration(250L);
                this.webViewScrollAnimator = duration;
                duration.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                this.webViewScrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        BotWebViewMenuContainer.this.lambda$onPanTransitionStart$16(valueAnimator2);
                    }
                });
                this.webViewScrollAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (BotWebViewMenuContainer.this.webViewContainer.getWebView() != null) {
                            BotWebViewMenuContainer.this.webViewContainer.getWebView().setScrollY(i2);
                        }
                        if (animator == BotWebViewMenuContainer.this.webViewScrollAnimator) {
                            BotWebViewMenuContainer.this.webViewScrollAnimator = null;
                        }
                    }
                });
                this.webViewScrollAnimator.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPanTransitionStart$16(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.webViewContainer.getWebView() != null) {
            this.webViewContainer.getWebView().setScrollY(intValue);
        }
    }

    public void onPanTransitionEnd() {
        this.ignoreMeasure = false;
        requestLayout();
    }

    private void updateLightStatusBar() {
        boolean z = ColorUtils.calculateLuminance(this.backgroundPaint.getColor()) >= 0.9d && this.actionBarTransitionProgress >= 0.85f;
        Boolean bool = this.wasLightStatusBar;
        if (bool == null || bool.booleanValue() != z) {
            this.wasLightStatusBar = Boolean.valueOf(z);
            if (Build.VERSION.SDK_INT >= 23) {
                int systemUiVisibility = getSystemUiVisibility();
                setSystemUiVisibility(z ? systemUiVisibility | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : systemUiVisibility & (-8193));
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.drawingFromOverlay) {
            return;
        }
        super.onDraw(canvas);
        if (!this.overrideBackgroundColor) {
            this.backgroundPaint.setColor(getColor(Theme.key_windowBackgroundWhite));
        }
        if (this.overrideActionBarBackgroundProgress == 0.0f) {
            this.actionBarPaint.setColor(getColor(Theme.key_windowBackgroundWhite));
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRect(rectF, this.dimPaint);
        float dp = AndroidUtilities.dp(16.0f) * (1.0f - this.actionBarTransitionProgress);
        rectF.set(0.0f, AndroidUtilities.lerp(this.swipeContainer.getTranslationY(), 0.0f, this.actionBarTransitionProgress), getWidth(), this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
        canvas.drawRoundRect(rectF, dp, dp, this.actionBarPaint);
        rectF.set(0.0f, this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), getWidth(), getHeight() + dp);
        canvas.drawRect(rectF, this.backgroundPaint);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() <= AndroidUtilities.lerp(this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, this.actionBarTransitionProgress)) {
            dismiss(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.drawingFromOverlay) {
            return;
        }
        super.draw(canvas);
        int color = this.actionBarColors.getColor(Theme.key_sheet_scrollUp);
        this.lineColor = color;
        this.linePaint.setColor(color);
        Paint paint = this.linePaint;
        paint.setAlpha((int) (paint.getAlpha() * (1.0f - (Math.min(0.5f, this.actionBarTransitionProgress) / 0.5f))));
        canvas.save();
        float f = 1.0f - this.actionBarTransitionProgress;
        float lerp = AndroidUtilities.lerp(this.swipeContainer.getTranslationY(), AndroidUtilities.statusBarHeight + (ActionBar.getCurrentActionBarHeight() / 2.0f), this.actionBarTransitionProgress) + AndroidUtilities.dp(12.0f);
        canvas.scale(f, f, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, this.linePaint);
        canvas.restore();
    }

    public void show(int i, long j, String str) {
        this.dismissed = false;
        if (this.currentAccount != i || this.botId != j || !Objects.equals(this.botUrl, str)) {
            this.isLoaded = false;
        }
        this.currentAccount = i;
        this.botId = j;
        this.botUrl = str;
        if (this.addToHomeScreenItem != null) {
            if (MediaDataController.getInstance(i).canCreateAttachedMenuBotShortcut(j)) {
                this.addToHomeScreenItem.setVisibility(0);
            } else {
                this.addToHomeScreenItem.setVisibility(8);
            }
        }
        this.savedEditText = this.parentEnterView.getEditText();
        this.parentEnterView.getEditField().setText((CharSequence) null);
        this.savedReplyMessageObject = this.parentEnterView.getReplyingMessageObject();
        this.savedEditMessageObject = this.parentEnterView.getEditingMessageObject();
        ChatActivity parentFragment = this.parentEnterView.getParentFragment();
        if (parentFragment != null) {
            parentFragment.hideFieldPanel(true);
            parentFragment.getOrCreateWebBotTitleView().setText(parentFragment.getCurrentUser().first_name);
        }
        if (!this.isLoaded) {
            this.overrideBackgroundColor = false;
            this.backgroundPaint.setColor(getColor(Theme.key_windowBackgroundWhite));
            loadWebView();
        }
        setVisibility(0);
        setAlpha(0.0f);
        addOnLayoutChangeListener(new 7());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class 7 implements View.OnLayoutChangeListener {
        7() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            BotWebViewMenuContainer.this.swipeContainer.setSwipeOffsetY(BotWebViewMenuContainer.this.swipeContainer.getHeight());
            BotWebViewMenuContainer.this.setAlpha(1.0f);
            new SpringAnimation(BotWebViewMenuContainer.this.swipeContainer, ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.SWIPE_OFFSET_Y, 0.0f).setSpring(new SpringForce(0.0f).setDampingRatio(0.75f).setStiffness(500.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$7$$ExternalSyntheticLambda0
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    BotWebViewMenuContainer.7.this.lambda$onLayoutChange$0(dynamicAnimation, z, f, f2);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLayoutChange$0(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            BotWebViewMenuContainer.this.webViewContainer.restoreButtonData();
            BotWebViewMenuContainer.this.webViewContainer.invalidateViewPortHeight(true);
        }
    }

    private void loadWebView() {
        this.progressView.setLoadProgress(0.0f);
        this.progressView.setAlpha(1.0f);
        this.progressView.setVisibility(0);
        this.webViewContainer.setBotUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
        this.webViewContainer.loadFlickerAndSettingsItem(this.currentAccount, this.botId, this.settingsItem);
        TLRPC$TL_messages_requestWebView tLRPC$TL_messages_requestWebView = new TLRPC$TL_messages_requestWebView();
        tLRPC$TL_messages_requestWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
        tLRPC$TL_messages_requestWebView.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.botId);
        tLRPC$TL_messages_requestWebView.platform = "android";
        tLRPC$TL_messages_requestWebView.url = this.botUrl;
        tLRPC$TL_messages_requestWebView.flags |= 2;
        ChatActivityEnterView chatActivityEnterView = this.parentEnterView;
        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams((chatActivityEnterView == null || chatActivityEnterView.getParentFragment() == null) ? null : this.parentEnterView.getParentFragment().getResourceProvider());
        if (makeThemeParams != null) {
            TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
            tLRPC$TL_messages_requestWebView.theme_params = tLRPC$TL_dataJSON;
            tLRPC$TL_dataJSON.data = makeThemeParams.toString();
            tLRPC$TL_messages_requestWebView.flags |= 4;
        }
        tLRPC$TL_messages_requestWebView.from_bot_menu = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_requestWebView, new RequestDelegate() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda21
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotWebViewMenuContainer.this.lambda$loadWebView$18(tLObject, tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadWebView$18(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewMenuContainer.this.lambda$loadWebView$17(tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processResponse */
    public void lambda$loadWebView$17(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_webViewResultUrl) {
            this.isLoaded = true;
            this.loadedResponse = tLObject;
            this.loadedResponseTime = System.currentTimeMillis();
            TLRPC$TL_webViewResultUrl tLRPC$TL_webViewResultUrl = (TLRPC$TL_webViewResultUrl) tLObject;
            this.queryId = tLRPC$TL_webViewResultUrl.query_id;
            this.webViewContainer.loadUrl(this.currentAccount, tLRPC$TL_webViewResultUrl.url);
            this.swipeContainer.setWebView(this.webViewContainer.getWebView());
            AndroidUtilities.runOnUIThread(this.pollRunnable, 60000L);
        }
    }

    private int getColor(int i) {
        return Theme.getColor(i, this.parentEnterView.getParentFragment().getResourceProvider());
    }

    public void setOnDismissGlobalListener(Runnable runnable) {
        this.globalOnDismissListener = runnable;
    }

    public void dismiss() {
        dismiss(false, null);
    }

    public void dismiss(Runnable runnable) {
        dismiss(false, runnable);
    }

    public void dismiss(boolean z) {
        dismiss(z, null);
    }

    public void dismiss(boolean z, final Runnable runnable) {
        ActionBar actionBar;
        LaunchActivity launchActivity;
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        if (z && ((launchActivity = LaunchActivity.instance) == null || launchActivity.getBottomSheetTabsOverlay() == null)) {
            z = false;
        }
        if (z) {
            SpringAnimation springAnimation = this.springAnimation;
            if (springAnimation != null) {
                springAnimation.getSpring().setFinalPosition(0.0f);
                this.springAnimation.start();
            }
            ChatActivity parentFragment = this.parentEnterView.getParentFragment();
            if (parentFragment != null && (actionBar = parentFragment.getActionBar()) != null) {
                AndroidUtilities.updateImageViewImageAnimated(actionBar.getBackButton(), actionBar.getBackButtonDrawable());
            }
            LaunchActivity.instance.getBottomSheetTabsOverlay().dismissSheet(this);
            return;
        }
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        webViewSwipeContainer.stickTo(webViewSwipeContainer.getHeight() + this.parentEnterView.getSizeNotifierLayout().measureKeyboardHeight(), new Runnable() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewMenuContainer.this.lambda$dismiss$19(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$19(Runnable runnable) {
        onDismiss();
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.globalOnDismissListener;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void onDismiss() {
        ChatActivityEnterView chatActivityEnterView = this.parentEnterView;
        final ChatActivity parentFragment = chatActivityEnterView == null ? null : chatActivityEnterView.getParentFragment();
        ActionBarMenuItem actionBarMenuItem = this.botMenuItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(8);
        }
        ActionBarMenuItem actionBarMenuItem2 = this.botCollapseItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setVisibility(8);
        }
        setVisibility(8);
        this.needCloseConfirmation = false;
        this.overrideActionBarBackground = 0;
        this.overrideActionBarBackgroundProgress = 0.0f;
        Paint paint = this.actionBarPaint;
        int i = Theme.key_windowBackgroundWhite;
        paint.setColor(getColor(i));
        this.webViewContainer.destroyWebView();
        this.swipeContainer.removeView(this.webViewContainer);
        BotWebViewContainer botWebViewContainer = new BotWebViewContainer(getContext(), this.parentEnterView.getParentFragment().getResourceProvider(), getColor(i)) { // from class: org.telegram.ui.bots.BotWebViewMenuContainer.8
            @Override // org.telegram.ui.bots.BotWebViewContainer
            public void onWebViewCreated() {
                BotWebViewMenuContainer.this.swipeContainer.setWebView(BotWebViewMenuContainer.this.webViewContainer.getWebView());
            }
        };
        this.webViewContainer = botWebViewContainer;
        botWebViewContainer.setDelegate(this.webViewDelegate);
        this.webViewContainer.setWebViewProgressListener(new Consumer() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda7
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                BotWebViewMenuContainer.this.lambda$onDismiss$21((Float) obj);
            }
        });
        this.swipeContainer.addView(this.webViewContainer);
        this.isLoaded = false;
        AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
        boolean z = this.botWebViewButtonWasVisible;
        if (z) {
            this.botWebViewButtonWasVisible = false;
            animateBotButton(false);
        }
        this.mainButtonSettings = null;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewMenuContainer.this.lambda$onDismiss$22(parentFragment);
            }
        }, z ? 200L : 0L);
        this.preserving = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDismiss$21(Float f) {
        this.progressView.setLoadProgressAnimated(f.floatValue());
        if (f.floatValue() == 1.0f) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewMenuContainer.this.lambda$onDismiss$20(valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer.9
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BotWebViewMenuContainer.this.progressView.setVisibility(8);
                }
            });
            duration.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDismiss$20(ValueAnimator valueAnimator) {
        this.progressView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDismiss$22(ChatActivity chatActivity) {
        if (this.savedEditText != null && this.parentEnterView.getEditField() != null) {
            this.parentEnterView.getEditField().setText(this.savedEditText);
            this.savedEditText = null;
        }
        MessageObject messageObject = this.savedReplyMessageObject;
        if (messageObject != null) {
            if (chatActivity != null) {
                chatActivity.showFieldPanelForReply(messageObject);
            }
            this.savedReplyMessageObject = null;
        }
        MessageObject messageObject2 = this.savedEditMessageObject;
        if (messageObject2 != null) {
            if (chatActivity != null) {
                chatActivity.showFieldPanelForEdit(true, messageObject2);
            }
            this.savedEditMessageObject = null;
        }
    }

    public boolean hasSavedText() {
        return (this.savedEditText == null && this.savedReplyMessageObject == null && this.savedEditMessageObject == null) ? false : true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.webViewResultSent) {
            if (this.queryId == ((Long) objArr[0]).longValue()) {
                dismiss();
            }
        } else if (i == NotificationCenter.didSetNewTheme) {
            this.webViewContainer.updateFlickerBackgroundColor(getColor(Theme.key_windowBackgroundWhite));
            invalidate();
            invalidateActionBar();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    BotWebViewMenuContainer.this.invalidateActionBar();
                }
            }, 300L);
        }
    }

    /* loaded from: classes4.dex */
    public static class ActionBarColorsAnimating {
        public float progress;
        SparseIntArray fromColors = new SparseIntArray();
        SparseIntArray toColors = new SparseIntArray();
        int[] colorKeys = {Theme.key_windowBackgroundWhiteBlackText, Theme.key_actionBarWhiteSelector, Theme.key_actionBarDefaultSubmenuBackground, Theme.key_actionBarDefaultSubmenuItem, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_dialogButtonSelector, Theme.key_sheet_scrollUp};

        public void setFrom(int i, Theme.ResourcesProvider resourcesProvider) {
            updateColors(this.fromColors, i, resourcesProvider);
        }

        public void setTo(int i, Theme.ResourcesProvider resourcesProvider) {
            updateColors(this.toColors, i, resourcesProvider);
        }

        private void updateColors(SparseIntArray sparseIntArray, int i, Theme.ResourcesProvider resourcesProvider) {
            int i2;
            int i3 = 0;
            if (i == 0) {
                while (true) {
                    int[] iArr = this.colorKeys;
                    if (i3 >= iArr.length) {
                        return;
                    }
                    int i4 = iArr[i3];
                    sparseIntArray.put(i4, Theme.getColor(i4, resourcesProvider));
                    i3++;
                }
            } else {
                int i5 = ColorUtils.calculateLuminance(i) < 0.5d ? -1 : -16777216;
                int alphaComponent = ColorUtils.setAlphaComponent(i5, 60);
                while (true) {
                    int[] iArr2 = this.colorKeys;
                    if (i3 >= iArr2.length) {
                        return;
                    }
                    int i6 = iArr2[i3];
                    if (i6 == Theme.key_actionBarDefaultSubmenuBackground || i6 == Theme.key_actionBarDefaultSubmenuItem || i6 == Theme.key_actionBarDefaultSubmenuItemIcon || i6 == (i2 = Theme.key_dialogButtonSelector)) {
                        sparseIntArray.put(i6, Theme.getColor(i6, resourcesProvider));
                    } else if (i6 == Theme.key_sheet_scrollUp) {
                        sparseIntArray.put(i6, ColorUtils.blendARGB(i, i5, 0.5f));
                    } else if (i6 == Theme.key_actionBarWhiteSelector || i6 == i2) {
                        sparseIntArray.put(i6, alphaComponent);
                    } else {
                        sparseIntArray.put(i6, i5);
                    }
                    i3++;
                }
            }
        }

        public int getColor(int i) {
            return ColorUtils.blendARGB(this.fromColors.get(i), this.toColors.get(i), this.progress);
        }

        public void updateActionBar(ActionBar actionBar, float f) {
            this.progress = f;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            actionBar.setTitleColor(getColor(i));
            actionBar.setItemsColor(getColor(i), false);
            ImageView imageView = actionBar.backButtonImageView;
            if (imageView != null) {
                imageView.setColorFilter(new PorterDuffColorFilter(getColor(i), PorterDuff.Mode.SRC_IN));
            }
            actionBar.setItemsBackgroundColor(getColor(Theme.key_actionBarWhiteSelector), false);
            actionBar.setPopupBackgroundColor(getColor(Theme.key_actionBarDefaultSubmenuBackground), false);
            actionBar.setPopupItemsColor(getColor(Theme.key_actionBarDefaultSubmenuItem), false, false);
            actionBar.setPopupItemsColor(getColor(Theme.key_actionBarDefaultSubmenuItemIcon), true, false);
            actionBar.setPopupItemsSelectorColor(getColor(Theme.key_dialogButtonSelector), false);
        }
    }

    public void setDrawingFromOverlay(boolean z) {
        if (this.drawingFromOverlay != z) {
            this.drawingFromOverlay = z;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.drawingFromOverlay) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public float drawInto(Canvas canvas, RectF rectF, float f, RectF rectF2) {
        this.rect.set(this.swipeContainer.getLeft(), this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), this.swipeContainer.getRight(), getHeight());
        AndroidUtilities.lerpCentered(this.rect, rectF, f, rectF2);
        canvas.save();
        this.clipPath.rewind();
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - this.actionBarTransitionProgress), AndroidUtilities.dp(10.0f), f);
        this.clipPath.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(this.clipPath);
        canvas.drawPaint(this.backgroundPaint);
        if (this.swipeContainer != null) {
            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - f) * 255.0f), 31);
            canvas.translate(this.swipeContainer.getX(), Math.max(this.swipeContainer.getY(), rectF2.top) + (f * AndroidUtilities.dp(51.0f)));
            this.swipeContainer.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }

    public void setMainButton(BotWebViewAttachedSheet.MainButtonSettings mainButtonSettings) {
        this.mainButtonSettings = mainButtonSettings;
        ChatActivityBotWebViewButton botWebViewButton = this.parentEnterView.getBotWebViewButton();
        botWebViewButton.setupButtonParams(mainButtonSettings.isActive, mainButtonSettings.text, mainButtonSettings.color, mainButtonSettings.textColor, mainButtonSettings.isProgressVisible);
        botWebViewButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bots.BotWebViewMenuContainer$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BotWebViewMenuContainer.this.lambda$setMainButton$23(view);
            }
        });
        boolean z = mainButtonSettings.isVisible;
        if (z != this.botWebViewButtonWasVisible) {
            animateBotButton(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMainButton$23(View view) {
        this.webViewContainer.onMainButtonPressed();
    }
}
