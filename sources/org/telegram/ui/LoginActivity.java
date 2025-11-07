package org.telegram.ui;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.PhoneNumberUtils;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import j$.util.Collection;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import j$.util.function.Function$-CC;
import j$.util.function.Predicate$-CC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.LoginOrView;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.ProxyDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SlideView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.Components.TransformableLoginButtonView;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotWebViewSheet;

/* loaded from: classes4.dex */
public class LoginActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int SHOW_DELAY;
    private int activityMode;
    private Runnable animationFinishCallback;
    private ImageView backButtonView;
    private View cachedFragmentView;
    private AlertDialog cancelDeleteProgressDialog;
    private TLRPC.TL_auth_sentCode cancelDeletionCode;
    private Bundle cancelDeletionParams;
    private String cancelDeletionPhone;
    private boolean checkPermissions;
    private boolean checkShowPermissions;
    private int currentConnectionState;
    private int currentDoneType;
    private TLRPC.TL_help_termsOfService currentTermsOfService;
    private int currentViewNum;
    private boolean customKeyboardWasVisible;
    private boolean[] doneButtonVisible;
    private AnimatorSet doneItemAnimation;
    private boolean[] doneProgressVisible;
    private Runnable[] editDoneCallback;
    private Runnable emailChangeFinishCallback;
    private boolean emailChangeIsSuggestion;
    private boolean emailChangeNonSkippable;
    private TextView emailChangeSkipButton;
    private Runnable emailChangeSkipCallback;
    private VerticalPositionAutoAnimator floatingAutoAnimator;
    private FrameLayout floatingButtonContainer;
    private TransformableLoginButtonView floatingButtonIcon;
    private RadialProgressView floatingProgressView;
    private boolean forceDisableSafetyNet;
    private View introView;
    private boolean isAnimatingIntro;
    private boolean isRequestingFirebaseSms;
    private ValueAnimator keyboardAnimator;
    private Runnable keyboardHideCallback;
    private LinearLayout keyboardLinearLayout;
    private CustomPhoneKeyboardView keyboardView;
    private boolean needRequestPermissions;
    private boolean newAccount;
    private boolean paid;
    private boolean pendingSwitchingAccount;
    private Dialog permissionsDialog;
    private ArrayList permissionsItems;
    private Dialog permissionsShowDialog;
    private ArrayList permissionsShowItems;
    private PhoneNumberConfirmView phoneNumberConfirmView;
    private boolean[] postedEditDoneCallback;
    private int progressRequestId;
    private ImageView proxyButtonView;
    private boolean proxyButtonVisible;
    private ProxyDrawable proxyDrawable;
    private RadialProgressView radialProgressView;
    private boolean restoringState;
    private AnimatorSet[] showDoneAnimation;
    private Runnable showProxyButtonDelayed;
    private SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private FrameLayout slideViewsContainer;
    private TextView startMessagingButton;
    private boolean syncContacts;
    private boolean testBackend;
    private final SlideView[] views;

    private static class ProgressView extends View {
    }

    static {
        SHOW_DELAY = SharedConfig.getDevicePerformanceClass() <= 1 ? 150 : 100;
    }

    public LoginActivity() {
        this.views = new SlideView[19];
        this.permissionsItems = new ArrayList();
        this.permissionsShowItems = new ArrayList();
        this.checkPermissions = true;
        this.checkShowPermissions = true;
        this.syncContacts = true;
        this.testBackend = false;
        this.activityMode = 0;
        this.showDoneAnimation = new AnimatorSet[2];
        this.doneButtonVisible = new boolean[]{true, false};
        this.customKeyboardWasVisible = false;
        this.doneProgressVisible = new boolean[2];
        this.editDoneCallback = new Runnable[2];
        this.postedEditDoneCallback = new boolean[2];
    }

    public LoginActivity(int i) {
        this.views = new SlideView[19];
        this.permissionsItems = new ArrayList();
        this.permissionsShowItems = new ArrayList();
        this.checkPermissions = true;
        this.checkShowPermissions = true;
        this.syncContacts = true;
        this.testBackend = false;
        this.activityMode = 0;
        this.showDoneAnimation = new AnimatorSet[2];
        this.doneButtonVisible = new boolean[]{true, false};
        this.customKeyboardWasVisible = false;
        this.doneProgressVisible = new boolean[2];
        this.editDoneCallback = new Runnable[2];
        this.postedEditDoneCallback = new boolean[2];
        this.currentAccount = i;
        this.newAccount = true;
    }

    public LoginActivity changeEmail(Runnable runnable) {
        this.activityMode = 3;
        this.currentViewNum = 12;
        this.emailChangeFinishCallback = runnable;
        return this;
    }

    public LoginActivity changeEmail(Runnable runnable, Runnable runnable2, boolean z) {
        this.activityMode = 3;
        this.currentViewNum = 12;
        this.emailChangeFinishCallback = runnable;
        this.emailChangeSkipCallback = runnable2;
        this.emailChangeNonSkippable = z;
        this.emailChangeIsSuggestion = true;
        return this;
    }

    public LoginActivity cancelAccountDeletion(String str, Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode) {
        this.cancelDeletionPhone = str;
        this.cancelDeletionParams = bundle;
        this.cancelDeletionCode = tL_auth_sentCode;
        this.activityMode = 1;
        return this;
    }

    public LoginActivity changePhoneNumber() {
        this.activityMode = 2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInCancelAccountDeletionMode() {
        return this.activityMode == 1;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i = 0;
        while (true) {
            SlideView[] slideViewArr = this.views;
            if (i >= slideViewArr.length) {
                break;
            }
            SlideView slideView = slideViewArr[i];
            if (slideView != null) {
                slideView.onDestroyActivity();
            }
            i++;
        }
        AlertDialog alertDialog = this.cancelDeleteProgressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.cancelDeleteProgressDialog = null;
        }
        for (Runnable runnable : this.editDoneCallback) {
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x04f2, code lost:
    
        if (r2 != 4) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x051a A[EDGE_INSN: B:123:0x051a->B:124:0x051a BREAK  A[LOOP:1: B:71:0x0481->B:110:0x0516], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0486  */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View createView(Context context) {
        Bundle bundle;
        int i;
        int i2;
        SlideView[] slideViewArr;
        int i3;
        boolean z;
        int i4;
        View view = this.cachedFragmentView;
        if (view != null) {
            this.fragmentView = view;
            this.cachedFragmentView = null;
            return view;
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.LoginActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i5) {
                if (i5 == 1) {
                    LoginActivity.this.onDoneButtonPressed();
                } else if (i5 == -1 && LoginActivity.this.onBackPressed()) {
                    LoginActivity.this.lambda$onBackPressed$340();
                }
            }
        });
        this.currentDoneType = 0;
        boolean[] zArr = this.doneButtonVisible;
        zArr[0] = true;
        zArr[1] = false;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.LoginActivity.2
            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i5, int i6) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LoginActivity.this.floatingButtonContainer.getLayoutParams();
                int dp = LoginActivity.this.isCustomKeyboardVisible() ? AndroidUtilities.dp(230.0f) : 0;
                if (LoginActivity.this.isCustomKeyboardVisible() && measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    dp -= measureKeyboardHeight();
                }
                if (Bulletin.getVisibleBulletin() != null && Bulletin.getVisibleBulletin().isShowing()) {
                    super.onMeasure(i5, i6);
                    marginLayoutParams.bottomMargin = ((AndroidUtilities.dp(16.0f) + Bulletin.getVisibleBulletin().getLayout().getMeasuredHeight()) - AndroidUtilities.dp(10.0f)) + dp;
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(16.0f) + dp;
                }
                int i7 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) LoginActivity.this.backButtonView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i7;
                ((ViewGroup.MarginLayoutParams) LoginActivity.this.proxyButtonView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i7;
                ((ViewGroup.MarginLayoutParams) LoginActivity.this.radialProgressView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i7;
                if (LoginActivity.this.emailChangeSkipButton != null) {
                    ((ViewGroup.MarginLayoutParams) LoginActivity.this.emailChangeSkipButton.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i7;
                }
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f) && LoginActivity.this.keyboardView.getVisibility() != 8 && !LoginActivity.this.isCustomKeyboardForceDisabled() && !LoginActivity.this.customKeyboardWasVisible) {
                    if (LoginActivity.this.keyboardAnimator != null) {
                        LoginActivity.this.keyboardAnimator.cancel();
                    }
                    LoginActivity.this.keyboardView.setVisibility(8);
                }
                super.onMeasure(i5, i6);
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda8
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate
            public final void onSizeChanged(int i5, boolean z2) {
                LoginActivity.this.lambda$createView$0(i5, z2);
            }
        });
        this.fragmentView = this.sizeNotifierFrameLayout;
        ScrollView scrollView = new ScrollView(context) { // from class: org.telegram.ui.LoginActivity.3
            @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
            public boolean requestChildRectangleOnScreen(View view2, Rect rect, boolean z2) {
                if (LoginActivity.this.currentViewNum == 1 || LoginActivity.this.currentViewNum == 2 || LoginActivity.this.currentViewNum == 4) {
                    rect.bottom += AndroidUtilities.dp(40.0f);
                }
                return super.requestChildRectangleOnScreen(view2, rect, z2);
            }
        };
        scrollView.setFillViewport(true);
        this.sizeNotifierFrameLayout.addView(scrollView, LayoutHelper.createFrame(-1, -1.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.keyboardLinearLayout = linearLayout;
        linearLayout.setOrientation(1);
        scrollView.addView(this.keyboardLinearLayout, LayoutHelper.createScroll(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
        this.keyboardLinearLayout.addView(space);
        FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.LoginActivity.4
            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z2, int i5, int i6, int i7, int i8) {
                super.onLayout(z2, i5, i6, i7, i8);
                for (SlideView slideView : LoginActivity.this.views) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slideView.getLayoutParams();
                    int height = getHeight() + AndroidUtilities.dp(16.0f);
                    if (!slideView.hasCustomKeyboard() && LoginActivity.this.keyboardView.getVisibility() == 0) {
                        height += AndroidUtilities.dp(230.0f);
                    }
                    slideView.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, height);
                }
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i5, int i6) {
                super.onMeasure(i5, i6);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                for (SlideView slideView : LoginActivity.this.views) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slideView.getLayoutParams();
                    int dp = (measuredHeight - marginLayoutParams.topMargin) + AndroidUtilities.dp(16.0f);
                    if (!slideView.hasCustomKeyboard() && LoginActivity.this.keyboardView.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    slideView.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                }
            }
        };
        this.slideViewsContainer = frameLayout;
        this.keyboardLinearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 0, 1.0f));
        CustomPhoneKeyboardView customPhoneKeyboardView = new CustomPhoneKeyboardView(context);
        this.keyboardView = customPhoneKeyboardView;
        customPhoneKeyboardView.setViewToFindFocus(this.slideViewsContainer);
        this.keyboardLinearLayout.addView(this.keyboardView, LayoutHelper.createLinear(-1, NotificationCenter.starUserGiftsLoaded));
        this.views[0] = new PhoneView(context);
        this.views[1] = new LoginActivitySmsView(context, 1);
        this.views[2] = new LoginActivitySmsView(context, 2);
        this.views[3] = new LoginActivitySmsView(context, 3);
        this.views[4] = new LoginActivitySmsView(context, 4);
        this.views[5] = new LoginActivityRegisterView(context);
        this.views[6] = new LoginActivityPasswordView(context);
        this.views[7] = new LoginActivityRecoverView(context);
        this.views[8] = new LoginActivityResetWaitView(context);
        this.views[9] = new LoginActivityNewPasswordView(context, 0);
        this.views[10] = new LoginActivityNewPasswordView(context, 1);
        this.views[11] = new LoginActivitySmsView(context, 11);
        this.views[12] = new LoginActivitySetupEmail(context);
        this.views[13] = new LoginActivityEmailCodeView(context, true);
        this.views[14] = new LoginActivityEmailCodeView(context, false);
        this.views[15] = new LoginActivitySmsView(context, 15);
        this.views[16] = new LoginActivityPhraseView(context, 16);
        this.views[17] = new LoginActivityPhraseView(context, 17);
        this.views[18] = new LoginPayView(context);
        int i5 = 0;
        while (true) {
            SlideView[] slideViewArr2 = this.views;
            if (i5 >= slideViewArr2.length) {
                break;
            }
            slideViewArr2[i5].setVisibility(i5 == 0 ? 0 : 8);
            this.slideViewsContainer.addView(this.views[i5], LayoutHelper.createFrame(-1, -1.0f, 17, AndroidUtilities.isTablet() ? 26.0f : 18.0f, i5 != 18 ? 30.0f : 0.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
            i5++;
        }
        Bundle loadCurrentState = this.activityMode == 0 ? loadCurrentState(this.newAccount, this.currentAccount) : null;
        if (loadCurrentState != null && ((i4 = loadCurrentState.getInt("currentViewNum", 0)) < 0 || i4 >= this.views.length)) {
            loadCurrentState = null;
        }
        if (loadCurrentState != null) {
            this.currentViewNum = loadCurrentState.getInt("currentViewNum", 0);
            this.syncContacts = loadCurrentState.getInt("syncContacts", 1) == 1;
            int i6 = this.currentViewNum;
            if (i6 >= 1 && i6 <= 4) {
                int i7 = loadCurrentState.getInt("open");
                if (i7 != 0 && Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundle = null;
                }
            } else if (i6 == 6) {
                if (((LoginActivityPasswordView) this.views[6]).currentPassword == null) {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundle = null;
                }
            } else if (i6 == 7 && ((LoginActivityRecoverView) this.views[7]).passwordString == null) {
                this.currentViewNum = 0;
                clearCurrentState();
                bundle = null;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.floatingButtonContainer = frameLayout2;
            frameLayout2.setVisibility(!this.doneButtonVisible[0] ? 0 : 8);
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(new int[]{R.attr.state_pressed}, ObjectAnimator.ofFloat(this.floatingButtonIcon, "translationZ", AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f)).setDuration(200L));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButtonIcon, "translationZ", AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f)).setDuration(200L));
            this.floatingButtonContainer.setStateListAnimator(stateListAnimator);
            this.floatingButtonContainer.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.LoginActivity.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                }
            });
            this.floatingAutoAnimator = VerticalPositionAutoAnimator.attach(this.floatingButtonContainer);
            this.sizeNotifierFrameLayout.addView(this.floatingButtonContainer, LayoutHelper.createFrame(56, 56.0f, 85, 0.0f, 0.0f, 24.0f, 16.0f));
            this.floatingButtonContainer.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.this.lambda$createView$1(view2);
                }
            });
            this.floatingAutoAnimator.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda10
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    LoginActivity.this.lambda$createView$2(dynamicAnimation, f, f2);
                }
            });
            ImageView imageView = new ImageView(context);
            this.backButtonView = imageView;
            imageView.setImageResource(org.telegram.messenger.R.drawable.ic_ab_back);
            this.backButtonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.this.lambda$createView$3(view2);
                }
            });
            this.backButtonView.setContentDescription(LocaleController.getString(org.telegram.messenger.R.string.Back));
            int dp = AndroidUtilities.dp(4.0f);
            this.backButtonView.setPadding(dp, dp, dp, dp);
            this.sizeNotifierFrameLayout.addView(this.backButtonView, LayoutHelper.createFrame(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
            if (this.emailChangeSkipCallback != null && !this.emailChangeNonSkippable && this.emailChangeIsSuggestion) {
                TextView textView = new TextView(context);
                this.emailChangeSkipButton = textView;
                textView.setGravity(19);
                this.emailChangeSkipButton.setTextSize(1, 15.0f);
                this.emailChangeSkipButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.emailChangeSkipButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                this.emailChangeSkipButton.setText(LocaleController.getString(org.telegram.messenger.R.string.YourEmailSkip));
                this.emailChangeSkipButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
                this.sizeNotifierFrameLayout.addView(this.emailChangeSkipButton, LayoutHelper.createFrame(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                this.emailChangeSkipButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        LoginActivity.this.lambda$createView$4(view2);
                    }
                });
            }
            ImageView imageView2 = new ImageView(context);
            this.proxyButtonView = imageView2;
            ProxyDrawable proxyDrawable = new ProxyDrawable(context);
            this.proxyDrawable = proxyDrawable;
            imageView2.setImageDrawable(proxyDrawable);
            this.proxyButtonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda13
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.this.lambda$createView$5(view2);
                }
            });
            this.proxyButtonView.setAlpha(0.0f);
            this.proxyButtonView.setVisibility(8);
            this.sizeNotifierFrameLayout.addView(this.proxyButtonView, LayoutHelper.createFrame(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
            updateProxyButton(false, true);
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.radialProgressView = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(20.0f));
            this.radialProgressView.setAlpha(0.0f);
            this.radialProgressView.setScaleX(0.1f);
            this.radialProgressView.setScaleY(0.1f);
            this.sizeNotifierFrameLayout.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(context);
            this.floatingButtonIcon = transformableLoginButtonView;
            transformableLoginButtonView.setTransformType(0);
            this.floatingButtonIcon.setProgress(1.0f);
            this.floatingButtonIcon.setDrawBackground(false);
            this.floatingButtonContainer.setContentDescription(LocaleController.getString("Done", org.telegram.messenger.R.string.Done));
            this.floatingButtonContainer.addView(this.floatingButtonIcon, LayoutHelper.createFrame(56, 56.0f));
            RadialProgressView radialProgressView2 = new RadialProgressView(context);
            this.floatingProgressView = radialProgressView2;
            radialProgressView2.setSize(AndroidUtilities.dp(22.0f));
            this.floatingProgressView.setAlpha(0.0f);
            this.floatingProgressView.setScaleX(0.1f);
            this.floatingProgressView.setScaleY(0.1f);
            this.floatingProgressView.setVisibility(4);
            this.floatingButtonContainer.addView(this.floatingProgressView, LayoutHelper.createFrame(-1, -1.0f));
            i = 1;
            if (bundle != null) {
                this.restoringState = true;
            }
            i2 = 0;
            while (true) {
                slideViewArr = this.views;
                if (i2 < slideViewArr.length) {
                    break;
                }
                SlideView slideView = slideViewArr[i2];
                if (bundle != null) {
                    if (i2 >= i && i2 <= 4) {
                        if (i2 == this.currentViewNum) {
                            slideView.restoreStateParams(bundle);
                        }
                    } else {
                        slideView.restoreStateParams(bundle);
                    }
                }
                if (this.currentViewNum == i2) {
                    this.backButtonView.setVisibility((slideView.needBackButton() || this.newAccount || this.activityMode == 2) ? 0 : 8);
                    slideView.setVisibility(0);
                    slideView.onShow();
                    setCustomKeyboardVisible(slideView.hasCustomKeyboard(), false);
                    this.currentDoneType = 0;
                    if (i2 != 0 && i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 9) {
                                if (i2 != 10 && i2 != 12) {
                                    z = false;
                                    showDoneButton(z, false);
                                    i3 = 1;
                                    if (i2 == 1 && i2 != 2) {
                                        if (i2 != 3) {
                                        }
                                    }
                                    this.currentDoneType = 1;
                                }
                                z = true;
                                showDoneButton(z, false);
                                i3 = 1;
                                if (i2 == 1) {
                                }
                                this.currentDoneType = 1;
                            }
                            z = true;
                            showDoneButton(z, false);
                            i3 = 1;
                            if (i2 == 1) {
                            }
                            this.currentDoneType = 1;
                        }
                    }
                    z = true;
                    showDoneButton(z, false);
                    i3 = 1;
                    if (i2 == 1) {
                    }
                    this.currentDoneType = 1;
                } else {
                    i3 = 1;
                    if (slideView.getVisibility() != 8) {
                        slideView.setVisibility(8);
                        slideView.onHide();
                    }
                }
                i2 += i3;
                i = 1;
            }
            this.restoringState = false;
            updateColors();
            if (isInCancelAccountDeletionMode()) {
                lambda$fillNextCodeParams$28(this.cancelDeletionParams, this.cancelDeletionCode, false);
            }
            return this.fragmentView;
        }
        bundle = loadCurrentState;
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.floatingButtonContainer = frameLayout22;
        frameLayout22.setVisibility(!this.doneButtonVisible[0] ? 0 : 8);
        StateListAnimator stateListAnimator2 = new StateListAnimator();
        stateListAnimator2.addState(new int[]{R.attr.state_pressed}, ObjectAnimator.ofFloat(this.floatingButtonIcon, "translationZ", AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f)).setDuration(200L));
        stateListAnimator2.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButtonIcon, "translationZ", AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f)).setDuration(200L));
        this.floatingButtonContainer.setStateListAnimator(stateListAnimator2);
        this.floatingButtonContainer.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.LoginActivity.5
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            }
        });
        this.floatingAutoAnimator = VerticalPositionAutoAnimator.attach(this.floatingButtonContainer);
        this.sizeNotifierFrameLayout.addView(this.floatingButtonContainer, LayoutHelper.createFrame(56, 56.0f, 85, 0.0f, 0.0f, 24.0f, 16.0f));
        this.floatingButtonContainer.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoginActivity.this.lambda$createView$1(view2);
            }
        });
        this.floatingAutoAnimator.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda10
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                LoginActivity.this.lambda$createView$2(dynamicAnimation, f, f2);
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.backButtonView = imageView3;
        imageView3.setImageResource(org.telegram.messenger.R.drawable.ic_ab_back);
        this.backButtonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoginActivity.this.lambda$createView$3(view2);
            }
        });
        this.backButtonView.setContentDescription(LocaleController.getString(org.telegram.messenger.R.string.Back));
        int dp2 = AndroidUtilities.dp(4.0f);
        this.backButtonView.setPadding(dp2, dp2, dp2, dp2);
        this.sizeNotifierFrameLayout.addView(this.backButtonView, LayoutHelper.createFrame(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.emailChangeSkipCallback != null) {
            TextView textView2 = new TextView(context);
            this.emailChangeSkipButton = textView2;
            textView2.setGravity(19);
            this.emailChangeSkipButton.setTextSize(1, 15.0f);
            this.emailChangeSkipButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.emailChangeSkipButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.emailChangeSkipButton.setText(LocaleController.getString(org.telegram.messenger.R.string.YourEmailSkip));
            this.emailChangeSkipButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.sizeNotifierFrameLayout.addView(this.emailChangeSkipButton, LayoutHelper.createFrame(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            this.emailChangeSkipButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.this.lambda$createView$4(view2);
                }
            });
        }
        ImageView imageView22 = new ImageView(context);
        this.proxyButtonView = imageView22;
        ProxyDrawable proxyDrawable2 = new ProxyDrawable(context);
        this.proxyDrawable = proxyDrawable2;
        imageView22.setImageDrawable(proxyDrawable2);
        this.proxyButtonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoginActivity.this.lambda$createView$5(view2);
            }
        });
        this.proxyButtonView.setAlpha(0.0f);
        this.proxyButtonView.setVisibility(8);
        this.sizeNotifierFrameLayout.addView(this.proxyButtonView, LayoutHelper.createFrame(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        updateProxyButton(false, true);
        RadialProgressView radialProgressView3 = new RadialProgressView(context);
        this.radialProgressView = radialProgressView3;
        radialProgressView3.setSize(AndroidUtilities.dp(20.0f));
        this.radialProgressView.setAlpha(0.0f);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.sizeNotifierFrameLayout.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        TransformableLoginButtonView transformableLoginButtonView2 = new TransformableLoginButtonView(context);
        this.floatingButtonIcon = transformableLoginButtonView2;
        transformableLoginButtonView2.setTransformType(0);
        this.floatingButtonIcon.setProgress(1.0f);
        this.floatingButtonIcon.setDrawBackground(false);
        this.floatingButtonContainer.setContentDescription(LocaleController.getString("Done", org.telegram.messenger.R.string.Done));
        this.floatingButtonContainer.addView(this.floatingButtonIcon, LayoutHelper.createFrame(56, 56.0f));
        RadialProgressView radialProgressView22 = new RadialProgressView(context);
        this.floatingProgressView = radialProgressView22;
        radialProgressView22.setSize(AndroidUtilities.dp(22.0f));
        this.floatingProgressView.setAlpha(0.0f);
        this.floatingProgressView.setScaleX(0.1f);
        this.floatingProgressView.setScaleY(0.1f);
        this.floatingProgressView.setVisibility(4);
        this.floatingButtonContainer.addView(this.floatingProgressView, LayoutHelper.createFrame(-1, -1.0f));
        i = 1;
        if (bundle != null) {
        }
        i2 = 0;
        while (true) {
            slideViewArr = this.views;
            if (i2 < slideViewArr.length) {
            }
            i2 += i3;
            i = 1;
        }
        this.restoringState = false;
        updateColors();
        if (isInCancelAccountDeletionMode()) {
        }
        return this.fragmentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$0(int i, boolean z) {
        Runnable runnable;
        if (i > AndroidUtilities.dp(20.0f) && isCustomKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
        if (i > AndroidUtilities.dp(20.0f) || (runnable = this.keyboardHideCallback) == null) {
            return;
        }
        runnable.run();
        this.keyboardHideCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$1(View view) {
        onDoneButtonPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$2(DynamicAnimation dynamicAnimation, float f, float f2) {
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.updateFabPosition();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3(View view) {
        if (onBackPressed()) {
            lambda$onBackPressed$340();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$4(View view) {
        Runnable runnable = this.emailChangeSkipCallback;
        if (runnable != null) {
            runnable.run();
        }
        lambda$onBackPressed$340();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$5(View view) {
        presentFragment(new ProxyListActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCustomKeyboardForceDisabled() {
        Point point = AndroidUtilities.displaySize;
        return point.x > point.y || AndroidUtilities.isTablet() || AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCustomKeyboardVisible() {
        return this.views[this.currentViewNum].hasCustomKeyboard() && !isCustomKeyboardForceDisabled();
    }

    private void setCustomKeyboardVisible(boolean z, boolean z2) {
        if (this.customKeyboardWasVisible == z && z2) {
            return;
        }
        this.customKeyboardWasVisible = z;
        if (isCustomKeyboardForceDisabled()) {
            z = false;
        }
        if (z) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (z2) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.keyboardAnimator = duration;
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.keyboardAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda15
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LoginActivity.this.lambda$setCustomKeyboardVisible$6(valueAnimator);
                    }
                });
                this.keyboardAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        LoginActivity.this.keyboardView.setVisibility(0);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (LoginActivity.this.keyboardAnimator == animator) {
                            LoginActivity.this.keyboardAnimator = null;
                        }
                    }
                });
                this.keyboardAnimator.start();
                return;
            }
            this.keyboardView.setVisibility(0);
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (z2) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.keyboardAnimator = duration2;
            duration2.setInterpolator(Easings.easeInOutQuad);
            this.keyboardAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda16
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.this.lambda$setCustomKeyboardVisible$7(valueAnimator);
                }
            });
            this.keyboardAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    LoginActivity.this.keyboardView.setVisibility(8);
                    if (LoginActivity.this.keyboardAnimator == animator) {
                        LoginActivity.this.keyboardAnimator = null;
                    }
                }
            });
            this.keyboardAnimator.start();
            return;
        }
        this.keyboardView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCustomKeyboardVisible$6(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.keyboardView.setAlpha(floatValue);
        this.keyboardView.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCustomKeyboardVisible$7(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.keyboardView.setAlpha(floatValue);
        this.keyboardView.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        if (this.newAccount) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        SlideView slideView;
        int i;
        super.onResume();
        if (this.newAccount) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i2 = this.currentViewNum;
            if (i2 >= 1 && i2 <= 4) {
                SlideView slideView2 = this.views[i2];
                if ((slideView2 instanceof LoginActivitySmsView) && (i = ((LoginActivitySmsView) slideView2).openTime) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                    this.views[this.currentViewNum].onBackPressed(true);
                    setPage(0, false, null, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        int i3 = this.currentViewNum;
        if (i3 == 0 && !this.needRequestPermissions && (slideView = this.views[i3]) != null) {
            slideView.onShow();
        }
        if (isCustomKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i4 = this.currentViewNum;
        if (i4 >= 0) {
            SlideView[] slideViewArr = this.views;
            if (i4 < slideViewArr.length) {
                slideViewArr[i4].onResume();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onConfigurationChanged(Configuration configuration) {
        setCustomKeyboardVisible(this.views[this.currentViewNum].hasCustomKeyboard(), false);
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z = iArr[0] == 0;
        if (i == 6) {
            this.checkPermissions = false;
            int i2 = this.currentViewNum;
            if (i2 == 0) {
                ((PhoneView) this.views[i2]).confirmedNumber = true;
                this.views[this.currentViewNum].lambda$onNextPressed$16(null);
                return;
            }
            return;
        }
        if (i == 7) {
            this.checkShowPermissions = false;
            int i3 = this.currentViewNum;
            if (i3 == 0) {
                ((PhoneView) this.views[i3]).fillNumber();
                return;
            }
            return;
        }
        if (i == 20) {
            if (z) {
                ((LoginActivityRegisterView) this.views[5]).imageUpdater.openCamera();
            }
        } else if (i == 151 && z) {
            final LoginActivityRegisterView loginActivityRegisterView = (LoginActivityRegisterView) this.views[5];
            loginActivityRegisterView.post(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.lambda$onRequestPermissionsResultFragment$8(LoginActivity.LoginActivityRegisterView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onRequestPermissionsResultFragment$8(LoginActivityRegisterView loginActivityRegisterView) {
        loginActivityRegisterView.imageUpdater.openGallery();
    }

    public static Bundle loadCurrentState(boolean z, int i) {
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
            sb.append(z ? "_" + i : "");
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb.toString(), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] split = key.split("_\\|_");
                if (split.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (split.length == 2) {
                    Bundle bundle2 = bundle.getBundle(split[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(split[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(split[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(split[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(split[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    private void clearCurrentState() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb = new StringBuilder();
        sb.append("logininfo2");
        if (this.newAccount) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    private void putBundleToEditor(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(str + "_|_" + str2, (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(str + "_|_" + str2, ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(str + "_|_" + str2, ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                putBundleToEditor((Bundle) obj, editor, str2);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    protected void onDialogDismiss(Dialog dialog) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (dialog == this.permissionsDialog && !this.permissionsItems.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) this.permissionsItems.toArray(new String[0]), 6);
                } else {
                    if (dialog != this.permissionsShowDialog || this.permissionsShowItems.isEmpty() || getParentActivity() == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.this.lambda$onDialogDismiss$9();
                        }
                    }, 200L);
                    getParentActivity().requestPermissions((String[]) this.permissionsShowItems.toArray(new String[0]), 7);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDialogDismiss$9() {
        this.needRequestPermissions = false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.emailChangeIsSuggestion;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed() {
        int i = 0;
        if (this.emailChangeIsSuggestion && this.currentViewNum == 12) {
            return false;
        }
        int i2 = this.currentViewNum;
        if (i2 != 0 && (this.activityMode != 3 || i2 != 12)) {
            if (i2 == 6) {
                this.views[i2].onBackPressed(true);
                setPage(0, true, null, true);
            } else if (i2 == 7 || i2 == 8) {
                this.views[i2].onBackPressed(true);
                setPage(6, true, null, true);
            } else if ((i2 >= 1 && i2 <= 4) || i2 == 11 || i2 == 15) {
                if (this.views[i2].onBackPressed(false)) {
                    setPage(0, true, null, true);
                }
            } else if (i2 == 5) {
                ((LoginActivityRegisterView) this.views[i2]).wrongNumber.callOnClick();
            } else if (i2 == 9) {
                this.views[i2].onBackPressed(true);
                setPage(7, true, null, true);
            } else if (i2 == 10) {
                this.views[i2].onBackPressed(true);
                setPage(9, true, null, true);
            } else if (i2 == 13) {
                this.views[i2].onBackPressed(true);
                setPage(12, true, null, true);
            } else if (this.views[i2].onBackPressed(true)) {
                setPage(0, true, null, true);
            }
            return false;
        }
        while (true) {
            SlideView[] slideViewArr = this.views;
            if (i < slideViewArr.length) {
                SlideView slideView = slideViewArr[i];
                if (slideView != null) {
                    slideView.onDestroyActivity();
                }
                i++;
            } else {
                clearCurrentState();
                return true;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        LoginActivityRegisterView loginActivityRegisterView = (LoginActivityRegisterView) this.views[5];
        if (loginActivityRegisterView != null) {
            loginActivityRegisterView.imageUpdater.onActivityResult(i, i2, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void needShowAlert(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(LocaleController.getString("OK", org.telegram.messenger.R.string.OK), null);
        showDialog(builder.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFieldError(final View view, boolean z) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z && (view instanceof OutlineTextContainerView)) {
            int i = org.telegram.messenger.R.id.timeout_callback;
            Runnable runnable = (Runnable) view.getTag(i);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            final OutlineTextContainerView outlineTextContainerView = (OutlineTextContainerView) view;
            AtomicReference atomicReference = new AtomicReference();
            final EditText attachedEditText = outlineTextContainerView.getAttachedEditText();
            final 8 r3 = new 8(attachedEditText, atomicReference);
            outlineTextContainerView.animateError(1.0f);
            Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda37
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.lambda$onFieldError$11(OutlineTextContainerView.this, view, attachedEditText, r3);
                }
            };
            atomicReference.set(runnable2);
            view.postDelayed(runnable2, 2000L);
            view.setTag(i, runnable2);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(r3);
            }
        }
    }

    class 8 implements TextWatcher {
        final /* synthetic */ EditText val$editText;
        final /* synthetic */ AtomicReference val$timeoutCallbackRef;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        8(EditText editText, AtomicReference atomicReference) {
            this.val$editText = editText;
            this.val$timeoutCallbackRef = atomicReference;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            final EditText editText = this.val$editText;
            final AtomicReference atomicReference = this.val$timeoutCallbackRef;
            editText.post(new Runnable() { // from class: org.telegram.ui.LoginActivity$8$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.8.this.lambda$beforeTextChanged$0(editText, atomicReference);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$beforeTextChanged$0(EditText editText, AtomicReference atomicReference) {
            editText.removeTextChangedListener(this);
            editText.removeCallbacks((Runnable) atomicReference.get());
            ((Runnable) atomicReference.get()).run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onFieldError$11(OutlineTextContainerView outlineTextContainerView, View view, final EditText editText, final TextWatcher textWatcher) {
        outlineTextContainerView.animateError(0.0f);
        view.setTag(org.telegram.messenger.R.id.timeout_callback, null);
        if (editText != null) {
            editText.post(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda40
                @Override // java.lang.Runnable
                public final void run() {
                    editText.removeTextChangedListener(textWatcher);
                }
            });
        }
    }

    public static void needShowInvalidAlert(BaseFragment baseFragment, String str, boolean z) {
        needShowInvalidAlert(baseFragment, str, null, z);
    }

    public static void needShowInvalidAlert(final BaseFragment baseFragment, final String str, PhoneInputData phoneInputData, final boolean z) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
        if (z) {
            builder.setTitle(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString("BannedPhoneNumber", org.telegram.messenger.R.string.BannedPhoneNumber));
        } else if (phoneInputData == null || phoneInputData.patterns == null || phoneInputData.patterns.isEmpty() || phoneInputData.country == null) {
            builder.setTitle(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString(org.telegram.messenger.R.string.InvalidPhoneNumber));
        } else {
            Iterator it = phoneInputData.patterns.iterator();
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i) {
                    i = length;
                }
            }
            if (PhoneFormat.stripExceptNumbers(str).length() - phoneInputData.country.code.length() < i) {
                builder.setTitle(LocaleController.getString(org.telegram.messenger.R.string.WrongNumberFormat));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", org.telegram.messenger.R.string.ShortNumberInfo, phoneInputData.country.name, phoneInputData.phoneNumber)));
            } else {
                builder.setTitle(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle));
                builder.setMessage(LocaleController.getString(org.telegram.messenger.R.string.InvalidPhoneNumber));
            }
        }
        builder.setNeutralButton(LocaleController.getString("BotHelp", org.telegram.messenger.R.string.BotHelp), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda31
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i2) {
                LoginActivity.lambda$needShowInvalidAlert$12(z, str, baseFragment, alertDialog, i2);
            }
        });
        builder.setPositiveButton(LocaleController.getString("OK", org.telegram.messenger.R.string.OK), null);
        baseFragment.showDialog(builder.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$needShowInvalidAlert$12(boolean z, String str, BaseFragment baseFragment, AlertDialog alertDialog, int i) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            String format = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{z ? "recover@telegram.org" : "login@stel.com"});
            if (z) {
                intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str);
                intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + format + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
            } else {
                intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str);
                intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + format + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
            }
            baseFragment.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
            builder.setTitle(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString("NoMailInstalled", org.telegram.messenger.R.string.NoMailInstalled));
            builder.setPositiveButton(LocaleController.getString("OK", org.telegram.messenger.R.string.OK), null);
            baseFragment.showDialog(builder.create());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDoneButton(final boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        int i = this.currentDoneType;
        final boolean z3 = i == 0;
        if (this.doneButtonVisible[i] == z) {
            return;
        }
        AnimatorSet animatorSet = this.showDoneAnimation[i];
        if (animatorSet != null) {
            if (z2) {
                animatorSet.removeAllListeners();
            }
            this.showDoneAnimation[this.currentDoneType].cancel();
        }
        boolean[] zArr = this.doneButtonVisible;
        int i2 = this.currentDoneType;
        zArr[i2] = z;
        if (!z2) {
            if (z) {
                if (z3) {
                    this.floatingButtonContainer.setVisibility(0);
                    this.floatingAutoAnimator.setOffsetY(0.0f);
                    return;
                }
                return;
            }
            if (z3) {
                this.floatingButtonContainer.setVisibility(8);
                this.floatingAutoAnimator.setOffsetY(AndroidUtilities.dpf2(70.0f));
                return;
            }
            return;
        }
        this.showDoneAnimation[i2] = new AnimatorSet();
        if (z) {
            if (z3) {
                if (this.floatingButtonContainer.getVisibility() != 0) {
                    this.floatingAutoAnimator.setOffsetY(AndroidUtilities.dpf2(70.0f));
                    this.floatingButtonContainer.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.floatingAutoAnimator.getOffsetY(), 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda24
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LoginActivity.this.lambda$showDoneButton$13(valueAnimator);
                    }
                });
                this.showDoneAnimation[this.currentDoneType].play(ofFloat);
            }
        } else if (z3) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.floatingAutoAnimator.getOffsetY(), AndroidUtilities.dpf2(70.0f));
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda25
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.this.lambda$showDoneButton$14(valueAnimator);
                }
            });
            this.showDoneAnimation[this.currentDoneType].play(ofFloat2);
        }
        this.showDoneAnimation[this.currentDoneType].addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] == null || !LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0].equals(animator) || z) {
                    return;
                }
                if (z3) {
                    LoginActivity.this.floatingButtonContainer.setVisibility(8);
                }
                if (!z3 || LoginActivity.this.floatingButtonIcon.getAlpha() == 1.0f) {
                    return;
                }
                LoginActivity.this.floatingButtonIcon.setAlpha(1.0f);
                LoginActivity.this.floatingButtonIcon.setScaleX(1.0f);
                LoginActivity.this.floatingButtonIcon.setScaleY(1.0f);
                LoginActivity.this.floatingButtonIcon.setVisibility(0);
                LoginActivity.this.floatingButtonContainer.setEnabled(true);
                LoginActivity.this.floatingProgressView.setAlpha(0.0f);
                LoginActivity.this.floatingProgressView.setScaleX(0.1f);
                LoginActivity.this.floatingProgressView.setScaleY(0.1f);
                LoginActivity.this.floatingProgressView.setVisibility(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] == null || !LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0].equals(animator)) {
                    return;
                }
                LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] = null;
            }
        });
        int i3 = 150;
        if (!z3) {
            timeInterpolator = null;
        } else if (z) {
            timeInterpolator = AndroidUtilities.decelerateInterpolator;
            i3 = NotificationCenter.channelRecommendationsLoaded;
        } else {
            timeInterpolator = AndroidUtilities.accelerateInterpolator;
        }
        this.showDoneAnimation[this.currentDoneType].setDuration(i3);
        this.showDoneAnimation[this.currentDoneType].setInterpolator(timeInterpolator);
        this.showDoneAnimation[this.currentDoneType].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDoneButton$13(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.floatingAutoAnimator.setOffsetY(floatValue);
        this.floatingButtonContainer.setAlpha(1.0f - (floatValue / AndroidUtilities.dpf2(70.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDoneButton$14(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.floatingAutoAnimator.setOffsetY(floatValue);
        this.floatingButtonContainer.setAlpha(1.0f - (floatValue / AndroidUtilities.dpf2(70.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDoneButtonPressed() {
        if (this.doneButtonVisible[this.currentDoneType]) {
            if (this.radialProgressView.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString("StopLoadingTitle", org.telegram.messenger.R.string.StopLoadingTitle));
                builder.setMessage(LocaleController.getString("StopLoading", org.telegram.messenger.R.string.StopLoading));
                builder.setPositiveButton(LocaleController.getString("WaitMore", org.telegram.messenger.R.string.WaitMore), null);
                builder.setNegativeButton(LocaleController.getString("Stop", org.telegram.messenger.R.string.Stop), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda32
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.this.lambda$onDoneButtonPressed$15(alertDialog, i);
                    }
                });
                showDialog(builder.create());
                return;
            }
            this.views[this.currentViewNum].lambda$onNextPressed$16(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDoneButtonPressed$15(AlertDialog alertDialog, int i) {
        this.views[this.currentViewNum].onCancelPressed();
        needHideProgress(true);
    }

    private void showEditDoneProgress(boolean z, boolean z2) {
        lambda$showEditDoneProgress$16(z, z2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showEditDoneProgress, reason: merged with bridge method [inline-methods] */
    public void lambda$showEditDoneProgress$16(final boolean z, final boolean z2, final boolean z3) {
        if (z2 && this.doneProgressVisible[this.currentDoneType] == z && !z3) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.lambda$showEditDoneProgress$16(z, z2, z3);
                }
            });
            return;
        }
        final int i = this.currentDoneType;
        final boolean z4 = i == 0;
        if (!z3 && !z4) {
            this.doneProgressVisible[i] = z;
            if (z2) {
                if (this.postedEditDoneCallback[i]) {
                    AndroidUtilities.cancelRunOnUIThread(this.editDoneCallback[i]);
                    this.postedEditDoneCallback[this.currentDoneType] = false;
                    return;
                } else if (z) {
                    Runnable[] runnableArr = this.editDoneCallback;
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda27
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.this.lambda$showEditDoneProgress$17(i, z, z2);
                        }
                    };
                    runnableArr[i] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    this.postedEditDoneCallback[this.currentDoneType] = true;
                    return;
                }
            }
        } else {
            this.postedEditDoneCallback[i] = false;
            this.doneProgressVisible[i] = z;
        }
        AnimatorSet animatorSet = this.doneItemAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z2) {
            this.doneItemAnimation = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.10
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    if (z) {
                        if (z4) {
                            LoginActivity.this.floatingButtonIcon.setVisibility(0);
                            LoginActivity.this.floatingProgressView.setVisibility(0);
                            LoginActivity.this.floatingButtonContainer.setEnabled(false);
                            return;
                        }
                        LoginActivity.this.radialProgressView.setVisibility(0);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (z4) {
                        if (!z) {
                            LoginActivity.this.floatingProgressView.setVisibility(4);
                            LoginActivity.this.floatingButtonIcon.setVisibility(0);
                            LoginActivity.this.floatingButtonContainer.setEnabled(true);
                        } else {
                            LoginActivity.this.floatingButtonIcon.setVisibility(4);
                            LoginActivity.this.floatingProgressView.setVisibility(0);
                        }
                    } else if (!z) {
                        LoginActivity.this.radialProgressView.setVisibility(4);
                    }
                    if (LoginActivity.this.doneItemAnimation == null || !LoginActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    LoginActivity.this.doneItemAnimation = null;
                }
            });
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda28
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.this.lambda$showEditDoneProgress$18(z4, valueAnimator);
                }
            });
            this.doneItemAnimation.playTogether(ofFloat);
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
            return;
        }
        if (z) {
            if (z4) {
                this.floatingProgressView.setVisibility(0);
                this.floatingButtonIcon.setVisibility(4);
                this.floatingButtonContainer.setEnabled(false);
                this.floatingButtonIcon.setScaleX(0.1f);
                this.floatingButtonIcon.setScaleY(0.1f);
                this.floatingButtonIcon.setAlpha(0.0f);
                this.floatingProgressView.setScaleX(1.0f);
                this.floatingProgressView.setScaleY(1.0f);
                this.floatingProgressView.setAlpha(1.0f);
                return;
            }
            this.radialProgressView.setVisibility(0);
            this.radialProgressView.setScaleX(1.0f);
            this.radialProgressView.setScaleY(1.0f);
            this.radialProgressView.setAlpha(1.0f);
            return;
        }
        this.radialProgressView.setTag(null);
        if (z4) {
            this.floatingProgressView.setVisibility(4);
            this.floatingButtonIcon.setVisibility(0);
            this.floatingButtonContainer.setEnabled(true);
            this.floatingProgressView.setScaleX(0.1f);
            this.floatingProgressView.setScaleY(0.1f);
            this.floatingProgressView.setAlpha(0.0f);
            this.floatingButtonIcon.setScaleX(1.0f);
            this.floatingButtonIcon.setScaleY(1.0f);
            this.floatingButtonIcon.setAlpha(1.0f);
            return;
        }
        this.radialProgressView.setVisibility(4);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.radialProgressView.setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showEditDoneProgress$17(int i, boolean z, boolean z2) {
        int i2 = this.currentDoneType;
        this.currentDoneType = i;
        lambda$showEditDoneProgress$16(z, z2, true);
        this.currentDoneType = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showEditDoneProgress$18(boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z) {
            float f = 1.0f - floatValue;
            float f2 = (f * 0.9f) + 0.1f;
            this.floatingButtonIcon.setScaleX(f2);
            this.floatingButtonIcon.setScaleY(f2);
            this.floatingButtonIcon.setAlpha(f);
            float f3 = (0.9f * floatValue) + 0.1f;
            this.floatingProgressView.setScaleX(f3);
            this.floatingProgressView.setScaleY(f3);
            this.floatingProgressView.setAlpha(floatValue);
            return;
        }
        float f4 = (0.9f * floatValue) + 0.1f;
        this.radialProgressView.setScaleX(f4);
        this.radialProgressView.setScaleY(f4);
        this.radialProgressView.setAlpha(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void needShowProgress(int i) {
        needShowProgress(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void needShowProgress(int i, boolean z) {
        if (isInCancelAccountDeletionMode() && i == 0) {
            if (this.cancelDeleteProgressDialog != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
            this.cancelDeleteProgressDialog = alertDialog;
            alertDialog.setCanCancel(false);
            this.cancelDeleteProgressDialog.show();
            return;
        }
        this.progressRequestId = i;
        showEditDoneProgress(true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void needHideProgress(boolean z) {
        needHideProgress(z, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void needHideProgress(boolean z, boolean z2) {
        AlertDialog alertDialog;
        if (this.progressRequestId != 0) {
            if (z) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.progressRequestId, true);
            }
            this.progressRequestId = 0;
        }
        if (isInCancelAccountDeletionMode() && (alertDialog = this.cancelDeleteProgressDialog) != null) {
            alertDialog.dismiss();
            this.cancelDeleteProgressDialog = null;
        }
        showEditDoneProgress(false, z2);
    }

    public void setPage(int i, boolean z, Bundle bundle, boolean z2) {
        final boolean z3 = i == 0 || i == 5 || i == 6 || i == 9 || i == 10 || i == 12 || i == 17 || i == 16;
        if (i == this.currentViewNum) {
            z = false;
        }
        if (z3) {
            if (i == 0) {
                this.checkPermissions = true;
                this.checkShowPermissions = true;
            }
            this.currentDoneType = 1;
            showDoneButton(false, z);
            showEditDoneProgress(false, z);
            this.currentDoneType = 0;
            showEditDoneProgress(false, z);
            if (!z) {
                showDoneButton(true, false);
            }
        } else {
            this.currentDoneType = 0;
            showDoneButton(false, z);
            showEditDoneProgress(false, z);
            if (i != 8) {
                this.currentDoneType = 1;
            }
        }
        if (z) {
            SlideView[] slideViewArr = this.views;
            final SlideView slideView = slideViewArr[this.currentViewNum];
            SlideView slideView2 = slideViewArr[i];
            this.currentViewNum = i;
            this.backButtonView.setVisibility((slideView2.needBackButton() || this.newAccount) ? 0 : 8);
            slideView2.setParams(bundle, false);
            setParentActivityTitle(slideView2.getHeaderName());
            slideView2.onShow();
            slideView2.setX(z2 ? -AndroidUtilities.displaySize.x : AndroidUtilities.displaySize.x);
            slideView2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.11
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (LoginActivity.this.currentDoneType == 0 && z3) {
                        LoginActivity.this.showDoneButton(true, true);
                    }
                    slideView.setVisibility(8);
                    slideView.onHide();
                    slideView.setX(0.0f);
                }
            });
            Property property = View.TRANSLATION_X;
            animatorSet.playTogether(ObjectAnimator.ofFloat(slideView, (Property<SlideView, Float>) property, z2 ? AndroidUtilities.displaySize.x : -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(slideView2, (Property<SlideView, Float>) property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            setCustomKeyboardVisible(slideView2.hasCustomKeyboard(), true);
            return;
        }
        this.backButtonView.setVisibility((this.views[i].needBackButton() || this.newAccount) ? 0 : 8);
        this.views[this.currentViewNum].setVisibility(8);
        this.views[this.currentViewNum].onHide();
        this.currentViewNum = i;
        this.views[i].setParams(bundle, false);
        this.views[i].setVisibility(0);
        setParentActivityTitle(this.views[i].getHeaderName());
        this.views[i].onShow();
        setCustomKeyboardVisible(this.views[i].hasCustomKeyboard(), false);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.currentViewNum);
            bundle2.putInt("syncContacts", this.syncContacts ? 1 : 0);
            for (int i = 0; i <= this.currentViewNum; i++) {
                SlideView slideView = this.views[i];
                if (slideView != null) {
                    slideView.saveStateParams(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
            sb.append(this.newAccount ? "_" + this.currentAccount : "");
            SharedPreferences.Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
            edit.clear();
            putBundleToEditor(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void needFinishActivity(final boolean z, boolean z2, int i) {
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity().getWindow(), false);
        }
        clearCurrentState();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.newAccount) {
                this.newAccount = false;
                this.pendingSwitchingAccount = true;
                ((LaunchActivity) getParentActivity()).switchToAccount(this.currentAccount, false, new GenericProvider() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda43
                    @Override // org.telegram.messenger.GenericProvider
                    public final Object provide(Object obj) {
                        DialogsActivity lambda$needFinishActivity$19;
                        lambda$needFinishActivity$19 = LoginActivity.lambda$needFinishActivity$19(z, (Void) obj);
                        return lambda$needFinishActivity$19;
                    }
                });
                this.pendingSwitchingAccount = false;
                lambda$onBackPressed$340();
                return;
            }
            if (z && z2) {
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(6, null);
                twoStepVerificationSetupActivity.setBlockingAlert(i);
                twoStepVerificationSetupActivity.setFromRegistration(true);
                presentFragment(twoStepVerificationSetupActivity, true);
            } else {
                Bundle bundle = new Bundle();
                bundle.putBoolean("afterSignup", z);
                presentFragment(new DialogsActivity(bundle), true);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            RestrictedLanguagesSelectActivity.checkRestrictedLanguages(true);
            return;
        }
        if (getParentActivity() instanceof ExternalActionActivity) {
            ((ExternalActionActivity) getParentActivity()).onFinishLogin();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DialogsActivity lambda$needFinishActivity$19(boolean z, Void r2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("afterSignup", z);
        return new DialogsActivity(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAuthSuccess(TLRPC.TL_auth_authorization tL_auth_authorization) {
        onAuthSuccess(tL_auth_authorization, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAuthSuccess(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.syncContacts;
        UserConfig.getInstance(this.currentAccount).setCurrentUser(tL_auth_authorization.user);
        UserConfig.getInstance(this.currentAccount).saveConfig(true);
        MessagesStorage.getInstance(this.currentAccount).cleanup(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, true, true);
        MessagesController.getInstance(this.currentAccount).putUser(tL_auth_authorization.user, false);
        ContactsController.getInstance(this.currentAccount).checkAppAccount();
        MessagesController.getInstance(this.currentAccount).checkPromoInfo(true);
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        MessagesController.getInstance(this.currentAccount).loadAppConfig();
        MessagesController.getInstance(this.currentAccount).checkPeerColors(false);
        if (tL_auth_authorization.future_auth_token != null) {
            AuthTokensHelper.saveLogInToken(tL_auth_authorization);
        } else {
            FileLog.d("onAuthSuccess future_auth_token is empty");
        }
        if (z) {
            MessagesController.getInstance(this.currentAccount).putDialogsEndReachedAfterRegistration();
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, true);
        needFinishActivity(z, tL_auth_authorization.setup_password_required, tL_auth_authorization.otherwise_relogin_days);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillNextCodeParams(Bundle bundle, TL_account.sentEmailCode sentemailcode) {
        bundle.putString("emailPattern", sentemailcode.email_pattern);
        bundle.putInt("length", sentemailcode.length);
        setPage(13, true, bundle, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fillNextCodeParams, reason: merged with bridge method [inline-methods] */
    public void lambda$resendCodeFromSafetyNet$20(Bundle bundle, TLRPC.auth_SentCode auth_sentcode) {
        lambda$fillNextCodeParams$28(bundle, auth_sentcode, true);
    }

    private void resendCodeFromSafetyNet(final Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.isRequestingFirebaseSms) {
            needHideProgress(false);
            this.isRequestingFirebaseSms = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda30
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.this.lambda$resendCodeFromSafetyNet$23(bundle, tLObject, tL_error);
                }
            }, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resendCodeFromSafetyNet$23(final Bundle bundle, final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda34
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, tLObject);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda35
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.lambda$resendCodeFromSafetyNet$22();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resendCodeFromSafetyNet$22() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || getContext() == null) {
            return;
        }
        new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString(org.telegram.messenger.R.string.SafetyNetErrorOccurred)).setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda39
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$21(alertDialog, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resendCodeFromSafetyNet$21(AlertDialog alertDialog, int i) {
        this.forceDisableSafetyNet = true;
        if (this.currentViewNum != 0) {
            setPage(0, true, null, true);
        }
    }

    public static String errorString(Throwable th) {
        if (th == null) {
            return "NULL";
        }
        String simpleName = th.getClass().getSimpleName();
        if (th.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName + " ";
            }
            simpleName = simpleName + th.getMessage();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public void open(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.paid = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        lambda$fillNextCodeParams$28(bundle, auth_sentcode, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fillNextCodeParams, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$fillNextCodeParams$28(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, final boolean z) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            setPage(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.isRequestingFirebaseSms) {
            if (PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                needShowProgress(0);
                this.isRequestingFirebaseSms = true;
                final String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getContext());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    FileLog.d("getting classic integrity with nonce = " + str);
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new OnSuccessListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda20
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            LoginActivity.this.lambda$fillNextCodeParams$26(bundle, auth_sentcode, string, z, (IntegrityTokenResponse) obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda21
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception exc) {
                            LoginActivity.this.lambda$fillNextCodeParams$27(bundle, auth_sentcode, exc);
                        }
                    });
                    return;
                }
                SafetyNet.getClient(ApplicationLoader.applicationContext).attest(auth_sentcode.type.nonce, BuildVars.SAFETYNET_KEY).addOnSuccessListener(new OnSuccessListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda22
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        LoginActivity.this.lambda$fillNextCodeParams$30(string, auth_sentcode, bundle, z, (SafetyNetApi.AttestationResponse) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda23
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        LoginActivity.this.lambda$fillNextCodeParams$31(bundle, auth_sentcode, exc);
                    }
                });
                return;
            }
            FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
            return;
        }
        bundle.putString("phoneHash", auth_sentcode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = auth_sentcode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeMissedCall) {
            bundle.putInt("nextType", 11);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFragmentSms) {
            bundle.putInt("nextType", 15);
        }
        if (auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeApp) {
            bundle.putInt("type", 1);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(1, z, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            auth_sentcode.timeout = BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * MediaDataController.MAX_STYLE_RUNS_COUNT);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(4, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            setPage(3, z, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            setPage(2, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt("type", 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(15, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt("type", 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            setPage(11, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            setPage(12, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            setPage(14, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str2 = auth_sentcodetype2.beginning;
            if (str2 != null) {
                bundle.putString("beginning", str2);
            }
            setPage(16, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            setPage(17, z, bundle, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillNextCodeParams$26(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, String str, final boolean z, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda29
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LoginActivity.this.lambda$fillNextCodeParams$25(auth_sentcode, bundle, z, tLObject, tL_error);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillNextCodeParams$25(final TLRPC.auth_SentCode auth_sentcode, final Bundle bundle, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            needHideProgress(false);
            this.isRequestingFirebaseSms = false;
            auth_sentcode.type.verifiedFirebase = true;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda38
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.lambda$fillNextCodeParams$24(bundle, auth_sentcode, z);
                }
            });
            return;
        }
        FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
        resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillNextCodeParams$27(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, Exception exc) {
        String str = "PLAYINTEGRITY_EXCEPTION_" + errorString(exc);
        FileLog.e("{" + str + "} Resend firebase sms because integrity threw error", exc);
        resendCodeFromSafetyNet(bundle, auth_sentcode, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillNextCodeParams$30(String str, final TLRPC.auth_SentCode auth_sentcode, final Bundle bundle, final boolean z, SafetyNetApi.AttestationResponse attestationResponse) {
        String jwsResult = attestationResponse.getJwsResult();
        if (jwsResult != null) {
            TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
            tL_auth_requestFirebaseSms.phone_number = str;
            tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
            tL_auth_requestFirebaseSms.safety_net_token = jwsResult;
            tL_auth_requestFirebaseSms.flags |= 1;
            String[] split = jwsResult.split("\\.");
            if (split.length > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
                    boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
                    boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
                    if (optBoolean && optBoolean2) {
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda33
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                LoginActivity.this.lambda$fillNextCodeParams$29(auth_sentcode, bundle, z, tLObject, tL_error);
                            }
                        }, 10);
                    } else if (!optBoolean && !optBoolean2) {
                        FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                        resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                    } else if (!optBoolean) {
                        FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                        resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                    } else if (!optBoolean2) {
                        FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                        resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                    }
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                    resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    return;
                }
            }
            FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
        resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillNextCodeParams$29(final TLRPC.auth_SentCode auth_sentcode, final Bundle bundle, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            needHideProgress(false);
            this.isRequestingFirebaseSms = false;
            auth_sentcode.type.verifiedFirebase = true;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.lambda$fillNextCodeParams$28(bundle, auth_sentcode, z);
                }
            });
            return;
        }
        FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
        resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillNextCodeParams$31(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, Exception exc) {
        FileLog.e(exc);
        String str = "SAFETYNET_EXCEPTION_" + errorString(exc);
        FileLog.d("{" + str + "} Resend firebase sms because of safetynet exception");
        resendCodeFromSafetyNet(bundle, auth_sentcode, str);
    }

    public class PhoneView extends SlideView implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
        private ImageView chevronRight;
        private View codeDividerView;
        private AnimatedPhoneNumberEditText codeField;
        private HashMap codesMap;
        private boolean confirmedNumber;
        private ArrayList countriesArray;
        private TextViewSwitcher countryButton;
        private String countryCodeForHint;
        private OutlineTextContainerView countryOutlineView;
        private int countryState;
        private CountrySelectActivity.Country currentCountry;
        private boolean ignoreOnPhoneChange;
        private boolean ignoreOnPhoneChangePaste;
        private boolean ignoreOnTextChange;
        private boolean ignoreSelection;
        private long lastTitleClick;
        private Toast lastTitleToast;
        private boolean nextPressed;
        private boolean numberFilled;
        private AnimatedPhoneNumberEditText phoneField;
        private HashMap phoneFormatMap;
        private OutlineTextContainerView phoneOutlineView;
        private TextView plusTextView;
        private TextView subtitleView;
        private CheckBoxCell syncContactsBox;
        private CheckBoxCell testBackendCheckBox;
        private int titleClickCount;
        private TextView titleView;
        private int wasCountryHintIndex;

        @Override // org.telegram.ui.Components.SlideView
        public boolean hasCustomKeyboard() {
            return true;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }

        private void showDebugMenu() {
            new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(org.telegram.messenger.R.string.SettingsDebug)).setItems(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? org.telegram.messenger.R.string.DebugMenuDisableLogs : org.telegram.messenger.R.string.DebugMenuEnableLogs), LocaleController.getString(org.telegram.messenger.R.string.DebugSendLogs)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda21
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LoginActivity.PhoneView.this.lambda$showDebugMenu$0(dialogInterface, i);
                }
            }).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$showDebugMenu$0(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                BulletinFactory.of(LoginActivity.this).createSimpleBulletin(org.telegram.messenger.R.raw.chats_infotip, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").show();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("app start time = " + ApplicationLoader.startTime);
                    try {
                        FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            }
            ProfileActivity.sendLogs(LoginActivity.this.getParentActivity(), false);
        }

        public PhoneView(final Context context) {
            super(context);
            int i;
            int i2;
            int i3;
            this.countryState = 0;
            this.countriesArray = new ArrayList();
            this.codesMap = new HashMap();
            this.phoneFormatMap = new HashMap();
            this.ignoreSelection = false;
            this.ignoreOnTextChange = false;
            this.ignoreOnPhoneChange = false;
            this.ignoreOnPhoneChangePaste = false;
            this.nextPressed = false;
            this.confirmedNumber = false;
            this.titleClickCount = 0;
            this.lastTitleClick = 0L;
            this.wasCountryHintIndex = -1;
            setOrientation(1);
            setGravity(17);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode == 2 ? org.telegram.messenger.R.string.ChangePhoneNewNumber : org.telegram.messenger.R.string.YourNumber));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
            this.titleView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.PhoneView.this.lambda$new$1(context, view);
                }
            });
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setText(LocaleController.getString(LoginActivity.this.activityMode == 2 ? org.telegram.messenger.R.string.ChangePhoneHelp : org.telegram.messenger.R.string.StartText));
            this.subtitleView.setTextSize(1, 14.0f);
            this.subtitleView.setGravity(17);
            this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.subtitleView, LayoutHelper.createLinear(-1, -2, 1, 32, 8, 32, 0));
            TextViewSwitcher textViewSwitcher = new TextViewSwitcher(context);
            this.countryButton = textViewSwitcher;
            textViewSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda6
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    View lambda$new$2;
                    lambda$new$2 = LoginActivity.PhoneView.lambda$new$2(context);
                    return lambda$new$2;
                }
            });
            Animation loadAnimation = AnimationUtils.loadAnimation(context, org.telegram.messenger.R.anim.text_in);
            loadAnimation.setInterpolator(Easings.easeInOutQuad);
            this.countryButton.setInAnimation(loadAnimation);
            ImageView imageView = new ImageView(context);
            this.chevronRight = imageView;
            imageView.setImageResource(org.telegram.messenger.R.drawable.msg_inputarrow);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.addView(this.countryButton, LayoutHelper.createLinear(0, -2, 1.0f, 0, 0, 0, 0));
            linearLayout.addView(this.chevronRight, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
            this.countryOutlineView = outlineTextContainerView;
            int i4 = org.telegram.messenger.R.string.Country;
            outlineTextContainerView.setText(LocaleController.getString(i4));
            this.countryOutlineView.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.countryOutlineView.setForceUseCenter(true);
            this.countryOutlineView.setFocusable(true);
            this.countryOutlineView.setContentDescription(LocaleController.getString(i4));
            this.countryOutlineView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda7
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    LoginActivity.PhoneView.this.lambda$new$3(view, z);
                }
            });
            addView(this.countryOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 14.0f));
            this.countryOutlineView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.PhoneView.this.lambda$new$6(view);
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.phoneOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
            OutlineTextContainerView outlineTextContainerView3 = this.phoneOutlineView;
            int i5 = org.telegram.messenger.R.string.PhoneNumber;
            outlineTextContainerView3.setText(LocaleController.getString(i5));
            addView(this.phoneOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 8.0f, 16.0f, 8.0f));
            TextView textView3 = new TextView(context);
            this.plusTextView = textView3;
            textView3.setText("+");
            this.plusTextView.setTextSize(1, 16.0f);
            this.plusTextView.setFocusable(false);
            linearLayout2.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2));
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = new AnimatedPhoneNumberEditText(context) { // from class: org.telegram.ui.LoginActivity.PhoneView.1
                @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
                protected void onFocusChanged(boolean z, int i6, Rect rect) {
                    super.onFocusChanged(z, i6, rect);
                    PhoneView.this.phoneOutlineView.animateSelection((z || PhoneView.this.phoneField.isFocused()) ? 1.0f : 0.0f);
                    if (z) {
                        LoginActivity.this.keyboardView.setEditText(this);
                    }
                }
            };
            this.codeField = animatedPhoneNumberEditText;
            animatedPhoneNumberEditText.setInputType(3);
            this.codeField.setCursorSize(AndroidUtilities.dp(20.0f));
            this.codeField.setCursorWidth(1.5f);
            this.codeField.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
            this.codeField.setTextSize(1, 16.0f);
            this.codeField.setMaxLines(1);
            this.codeField.setGravity(19);
            this.codeField.setImeOptions(268435461);
            this.codeField.setBackground(null);
            this.codeField.setShowSoftInputOnFocus(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
            this.codeField.setContentDescription(LocaleController.getString(org.telegram.messenger.R.string.LoginAccessibilityCountryCode));
            linearLayout2.addView(this.codeField, LayoutHelper.createLinear(55, 36, -9.0f, 0.0f, 0.0f, 0.0f));
            this.codeField.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.PhoneView.2
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    String str;
                    boolean z;
                    CountrySelectActivity.Country country;
                    CountrySelectActivity.Country country2;
                    if (PhoneView.this.ignoreOnTextChange) {
                        return;
                    }
                    PhoneView.this.ignoreOnTextChange = true;
                    String stripExceptNumbers = PhoneFormat.stripExceptNumbers(PhoneView.this.codeField.getText().toString());
                    PhoneView.this.codeField.setText(stripExceptNumbers);
                    if (stripExceptNumbers.length() == 0) {
                        PhoneView.this.setCountryButtonText(null);
                        PhoneView.this.phoneField.setHintText((String) null);
                        PhoneView.this.countryState = 1;
                    } else {
                        int i6 = 4;
                        if (stripExceptNumbers.length() > 4) {
                            while (true) {
                                if (i6 < 1) {
                                    str = null;
                                    z = false;
                                    break;
                                }
                                String substring = stripExceptNumbers.substring(0, i6);
                                List list = (List) PhoneView.this.codesMap.get(substring);
                                if (list == null) {
                                    country2 = null;
                                } else if (list.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                    country2 = (CountrySelectActivity.Country) list.get(list.size() - 1);
                                    if (string != null) {
                                        Iterator it = PhoneView.this.countriesArray.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            CountrySelectActivity.Country country3 = (CountrySelectActivity.Country) it.next();
                                            if (Objects.equals(country3.shortname, string)) {
                                                country2 = country3;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    country2 = (CountrySelectActivity.Country) list.get(0);
                                }
                                if (country2 != null) {
                                    String str2 = stripExceptNumbers.substring(i6) + PhoneView.this.phoneField.getText().toString();
                                    PhoneView.this.codeField.setText(substring);
                                    z = true;
                                    str = str2;
                                    stripExceptNumbers = substring;
                                    break;
                                }
                                i6--;
                            }
                            if (!z) {
                                str = stripExceptNumbers.substring(1) + PhoneView.this.phoneField.getText().toString();
                                AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = PhoneView.this.codeField;
                                stripExceptNumbers = stripExceptNumbers.substring(0, 1);
                                animatedPhoneNumberEditText2.setText(stripExceptNumbers);
                            }
                        } else {
                            str = null;
                            z = false;
                        }
                        Iterator it2 = PhoneView.this.countriesArray.iterator();
                        CountrySelectActivity.Country country4 = null;
                        int i7 = 0;
                        while (it2.hasNext()) {
                            CountrySelectActivity.Country country5 = (CountrySelectActivity.Country) it2.next();
                            if (country5.code.startsWith(stripExceptNumbers)) {
                                int i8 = i7 + 1;
                                if (country5.code.equals(stripExceptNumbers)) {
                                    if (country4 == null || !country4.code.equals(country5.code)) {
                                        i7 = i8;
                                    }
                                    country4 = country5;
                                } else {
                                    i7 = i8;
                                }
                            }
                        }
                        if (i7 == 1 && country4 != null && str == null) {
                            str = stripExceptNumbers.substring(country4.code.length()) + PhoneView.this.phoneField.getText().toString();
                            AnimatedPhoneNumberEditText animatedPhoneNumberEditText3 = PhoneView.this.codeField;
                            String str3 = country4.code;
                            animatedPhoneNumberEditText3.setText(str3);
                            stripExceptNumbers = str3;
                        }
                        List list2 = (List) PhoneView.this.codesMap.get(stripExceptNumbers);
                        if (list2 == null) {
                            country = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + stripExceptNumbers, null);
                            country = (CountrySelectActivity.Country) list2.get(list2.size() - 1);
                            if (string2 != null) {
                                Iterator it3 = PhoneView.this.countriesArray.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    CountrySelectActivity.Country country6 = (CountrySelectActivity.Country) it3.next();
                                    if (Objects.equals(country6.shortname, string2)) {
                                        country = country6;
                                        break;
                                    }
                                }
                            }
                        } else {
                            country = (CountrySelectActivity.Country) list2.get(0);
                        }
                        if (country != null) {
                            PhoneView.this.ignoreSelection = true;
                            PhoneView.this.currentCountry = country;
                            PhoneView.this.setCountryHint(stripExceptNumbers, country);
                            PhoneView.this.countryState = 0;
                        } else {
                            PhoneView.this.setCountryButtonText(null);
                            PhoneView.this.phoneField.setHintText((String) null);
                            PhoneView.this.countryState = 2;
                        }
                        if (!z) {
                            PhoneView.this.codeField.setSelection(PhoneView.this.codeField.getText().length());
                        }
                        if (str != null) {
                            PhoneView.this.phoneField.requestFocus();
                            PhoneView.this.phoneField.setText(str);
                            PhoneView.this.phoneField.setSelection(PhoneView.this.phoneField.length());
                        }
                    }
                    PhoneView.this.ignoreOnTextChange = false;
                }
            });
            this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda9
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i6, KeyEvent keyEvent) {
                    boolean lambda$new$7;
                    lambda$new$7 = LoginActivity.PhoneView.this.lambda$new$7(textView4, i6, keyEvent);
                    return lambda$new$7;
                }
            });
            this.codeDividerView = new View(context);
            LinearLayout.LayoutParams createLinear = LayoutHelper.createLinear(0, -1, 4.0f, 8.0f, 12.0f, 8.0f);
            createLinear.width = Math.max(2, AndroidUtilities.dp(0.5f));
            linearLayout2.addView(this.codeDividerView, createLinear);
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = new AnimatedPhoneNumberEditText(context) { // from class: org.telegram.ui.LoginActivity.PhoneView.3
                @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
                public boolean onKeyDown(int i6, KeyEvent keyEvent) {
                    if (i6 == 67 && PhoneView.this.phoneField.length() == 0) {
                        PhoneView.this.codeField.requestFocus();
                        PhoneView.this.codeField.setSelection(PhoneView.this.codeField.length());
                        PhoneView.this.codeField.dispatchKeyEvent(keyEvent);
                    }
                    return super.onKeyDown(i6, keyEvent);
                }

                @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0 && !LoginActivity.this.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
                }

                @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
                protected void onFocusChanged(boolean z, int i6, Rect rect) {
                    super.onFocusChanged(z, i6, rect);
                    PhoneView.this.phoneOutlineView.animateSelection((z || PhoneView.this.codeField.isFocused()) ? 1.0f : 0.0f);
                    if (z) {
                        LoginActivity.this.keyboardView.setEditText(this);
                        LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
                        if (PhoneView.this.countryState == 2) {
                            PhoneView.this.setCountryButtonText(LocaleController.getString(org.telegram.messenger.R.string.WrongCountry));
                            return;
                        }
                        return;
                    }
                    if (PhoneView.this.countryState == 2) {
                        PhoneView.this.setCountryButtonText(null);
                    }
                }
            };
            this.phoneField = animatedPhoneNumberEditText2;
            animatedPhoneNumberEditText2.setInputType(3);
            this.phoneField.setPadding(0, 0, 0, 0);
            this.phoneField.setCursorSize(AndroidUtilities.dp(20.0f));
            this.phoneField.setCursorWidth(1.5f);
            this.phoneField.setTextSize(1, 16.0f);
            this.phoneField.setMaxLines(1);
            this.phoneField.setGravity(19);
            this.phoneField.setImeOptions(268435461);
            this.phoneField.setBackground(null);
            this.phoneField.setShowSoftInputOnFocus(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
            this.phoneField.setContentDescription(LocaleController.getString(i5));
            linearLayout2.addView(this.phoneField, LayoutHelper.createFrame(-1, 36.0f));
            this.phoneField.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.PhoneView.4
                private int actionPosition;
                private int characterAction = -1;

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    if (i7 == 0 && i8 == 1) {
                        this.characterAction = 1;
                        return;
                    }
                    if (i7 == 1 && i8 == 0) {
                        if (charSequence.charAt(i6) == ' ' && i6 > 0) {
                            this.characterAction = 3;
                            this.actionPosition = i6 - 1;
                            return;
                        } else {
                            this.characterAction = 2;
                            return;
                        }
                    }
                    this.characterAction = -1;
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    int i6;
                    int i7;
                    if (PhoneView.this.ignoreOnPhoneChange) {
                        return;
                    }
                    int selectionStart = PhoneView.this.phoneField.getSelectionStart();
                    String obj = PhoneView.this.phoneField.getText().toString();
                    if (this.characterAction == 3) {
                        obj = obj.substring(0, this.actionPosition) + obj.substring(this.actionPosition + 1);
                        selectionStart--;
                    }
                    StringBuilder sb = new StringBuilder(obj.length());
                    int i8 = 0;
                    while (i8 < obj.length()) {
                        int i9 = i8 + 1;
                        String substring = obj.substring(i8, i9);
                        if ("0123456789".contains(substring)) {
                            sb.append(substring);
                        }
                        i8 = i9;
                    }
                    PhoneView.this.ignoreOnPhoneChange = true;
                    String hintText = PhoneView.this.phoneField.getHintText();
                    if (hintText != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= sb.length()) {
                                break;
                            }
                            if (i10 < hintText.length()) {
                                if (hintText.charAt(i10) == ' ') {
                                    sb.insert(i10, ' ');
                                    i10++;
                                    if (selectionStart == i10 && (i7 = this.characterAction) != 2 && i7 != 3) {
                                        selectionStart++;
                                    }
                                }
                                i10++;
                            } else {
                                sb.insert(i10, ' ');
                                if (selectionStart == i10 + 1 && (i6 = this.characterAction) != 2 && i6 != 3) {
                                    selectionStart++;
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb);
                    if (selectionStart >= 0) {
                        PhoneView.this.phoneField.setSelection(Math.min(selectionStart, PhoneView.this.phoneField.length()));
                    }
                    PhoneView.this.phoneField.onTextChange();
                    PhoneView.this.invalidateCountryHint();
                    PhoneView.this.ignoreOnPhoneChange = false;
                }
            });
            this.phoneField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda10
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i6, KeyEvent keyEvent) {
                    boolean lambda$new$8;
                    lambda$new$8 = LoginActivity.PhoneView.this.lambda$new$8(textView4, i6, keyEvent);
                    return lambda$new$8;
                }
            });
            if (LoginActivity.this.newAccount && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(context, 2);
                this.syncContactsBox = checkBoxCell;
                checkBoxCell.setText(LocaleController.getString("SyncContacts", org.telegram.messenger.R.string.SyncContacts), "", LoginActivity.this.syncContacts, false);
                CheckBoxCell checkBoxCell2 = this.syncContactsBox;
                if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                    i2 = 16;
                    i3 = 56;
                } else {
                    i2 = 16;
                    i3 = 0;
                }
                addView(checkBoxCell2, LayoutHelper.createLinear(-2, -1, 51, 16, 0, i2 + i3, 0));
                this.syncContactsBox.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginActivity.PhoneView.this.lambda$new$9(view);
                    }
                });
                i = 48;
            } else {
                i = 72;
            }
            final boolean z = BuildVars.DEBUG_VERSION || LoginActivity.this.getConnectionsManager().isTestBackend();
            if (z && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell3 = new CheckBoxCell(context, 2);
                this.testBackendCheckBox = checkBoxCell3;
                checkBoxCell3.setText(LocaleController.getString(org.telegram.messenger.R.string.DebugTestBackend), "", LoginActivity.this.testBackend = LoginActivity.this.getConnectionsManager().isTestBackend(), false);
                addView(this.testBackendCheckBox, LayoutHelper.createLinear(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
                i -= 24;
                this.testBackendCheckBox.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda12
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginActivity.PhoneView.this.lambda$new$10(z, view);
                    }
                });
            }
            if (i > 0 && !AndroidUtilities.isSmallScreen()) {
                Space space = new Space(context);
                space.setMinimumHeight(AndroidUtilities.dp(i));
                addView(space, LayoutHelper.createLinear(-2, -2));
            }
            final HashMap hashMap = new HashMap();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    CountrySelectActivity.Country country = new CountrySelectActivity.Country();
                    country.name = split[2];
                    String str = split[0];
                    country.code = str;
                    country.shortname = split[1];
                    if (!TextUtils.equals(str, "FT")) {
                        String countryName = LocaleController.getCountryName(country.shortname);
                        if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(country.shortname, countryName)) {
                            country.defaultName = country.name;
                            country.name = countryName;
                        }
                    }
                    this.countriesArray.add(0, country);
                    List list = (List) this.codesMap.get(split[0]);
                    if (list == null) {
                        HashMap hashMap2 = this.codesMap;
                        String str2 = split[0];
                        ArrayList arrayList = new ArrayList();
                        hashMap2.put(str2, arrayList);
                        list = arrayList;
                    }
                    list.add(country);
                    if (split.length > 3) {
                        this.phoneFormatMap.put(split[0], Collections.singletonList(split[3]));
                    }
                    hashMap.put(split[1], split[2]);
                }
                bufferedReader.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
            Collections.sort(this.countriesArray, Comparator$-CC.comparing(new Function() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda13
                public /* synthetic */ Function andThen(Function function) {
                    return Function$-CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str3;
                    str3 = ((CountrySelectActivity.Country) obj).name;
                    return str3;
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$-CC.$default$compose(this, function);
                }
            }));
            try {
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            LoginActivity.this.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda14
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.PhoneView.this.lambda$new$13(hashMap, tLObject, tL_error);
                }
            }, 10);
            if (this.codeField.length() == 0) {
                setCountryButtonText(null);
                this.phoneField.setHintText((String) null);
                this.countryState = 1;
            }
            if (this.codeField.length() != 0) {
                this.phoneField.requestFocus();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText3 = this.phoneField;
                animatedPhoneNumberEditText3.setSelection(animatedPhoneNumberEditText3.length());
            } else {
                this.codeField.requestFocus();
            }
            loadCountries();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(Context context, View view) {
            Toast toast = this.lastTitleToast;
            if (toast != null) {
                toast.cancel();
                this.lastTitleToast = null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.titleClickCount > 0 && currentTimeMillis - this.lastTitleClick > 1500) {
                this.titleClickCount = 0;
            }
            int i = this.titleClickCount + 1;
            this.titleClickCount = i;
            this.lastTitleClick = currentTimeMillis;
            if (i >= 5) {
                this.titleClickCount = 0;
                this.lastTitleClick = 0L;
                showDebugMenu();
            } else if (i > 1) {
                Toast makeText = Toast.makeText(context, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i, new Object[0]), 0);
                this.lastTitleToast = makeText;
                makeText.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ View lambda$new$2(Context context) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            textView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
            return textView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(View view, boolean z) {
            this.countryOutlineView.animateSelection(z ? 1.0f : 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$6(View view) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(true, this.countriesArray);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda19
                @Override // org.telegram.ui.CountrySelectActivity.CountrySelectActivityDelegate
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    LoginActivity.PhoneView.this.lambda$new$5(country);
                }
            });
            LoginActivity.this.presentFragment(countrySelectActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$5(CountrySelectActivity.Country country) {
            selectCountry(country);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.this.lambda$new$4();
                }
            }, 300L);
            this.phoneField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$4() {
            LoginActivity.this.showKeyboard(this.phoneField);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$7(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            this.phoneField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$8(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            if (LoginActivity.this.phoneNumberConfirmView == null) {
                lambda$onNextPressed$16(null);
                return true;
            }
            LoginActivity.this.phoneNumberConfirmView.popupFabContainer.callOnClick();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$9(View view) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity.this.syncContacts = !r0.syncContacts;
            ((CheckBoxCell) view).setChecked(LoginActivity.this.syncContacts, true);
            if (LoginActivity.this.syncContacts) {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(org.telegram.messenger.R.raw.contacts_sync_on, LocaleController.getString("SyncContactsOn", org.telegram.messenger.R.string.SyncContactsOn)).show();
            } else {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(org.telegram.messenger.R.raw.contacts_sync_off, LocaleController.getString("SyncContactsOff", org.telegram.messenger.R.string.SyncContactsOff)).show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$10(boolean z, View view) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity.this.testBackend = !r0.testBackend;
            ((CheckBoxCell) view).setChecked(LoginActivity.this.testBackend, true);
            if ((z && LoginActivity.this.getConnectionsManager().isTestBackend()) != LoginActivity.this.testBackend) {
                LoginActivity.this.getConnectionsManager().switchBackend(false);
            }
            loadCountries();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$13(final HashMap hashMap, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.this.lambda$new$12(tLObject, hashMap);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$12(TLObject tLObject, HashMap hashMap) {
            if (tLObject == null) {
                return;
            }
            TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject;
            if (this.codeField.length() == 0) {
                setCountry(hashMap, tL_nearestDc.country.toUpperCase());
            }
        }

        private void loadCountries() {
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            LoginActivity.this.getConnectionsManager().sendRequest(tL_help_getCountriesList, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda18
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.PhoneView.this.lambda$loadCountries$15(tLObject, tL_error);
                }
            }, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCountries$15(final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.this.lambda$loadCountries$14(tL_error, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCountries$14(TLRPC.TL_error tL_error, TLObject tLObject) {
            if (tL_error == null) {
                this.countriesArray.clear();
                this.codesMap.clear();
                this.phoneFormatMap.clear();
                TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                for (int i = 0; i < tL_help_countriesList.countries.size(); i++) {
                    TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i);
                    for (int i2 = 0; i2 < tL_help_country.country_codes.size(); i2++) {
                        TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i2);
                        if (tL_help_countryCode != null) {
                            CountrySelectActivity.Country country = new CountrySelectActivity.Country();
                            String str = tL_help_country.name;
                            country.name = str;
                            String str2 = tL_help_country.default_name;
                            country.defaultName = str2;
                            if (str == null && str2 != null) {
                                country.name = str2;
                            }
                            country.code = tL_help_countryCode.country_code;
                            country.shortname = tL_help_country.iso2;
                            this.countriesArray.add(country);
                            List list = (List) this.codesMap.get(tL_help_countryCode.country_code);
                            if (list == null) {
                                HashMap hashMap = this.codesMap;
                                String str3 = tL_help_countryCode.country_code;
                                ArrayList arrayList = new ArrayList();
                                hashMap.put(str3, arrayList);
                                list = arrayList;
                            }
                            list.add(country);
                            if (tL_help_countryCode.patterns.size() > 0) {
                                this.phoneFormatMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                            }
                        }
                    }
                }
                if (LoginActivity.this.activityMode == 2) {
                    String stripExceptNumbers = PhoneFormat.stripExceptNumbers(UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).getClientPhone());
                    if (TextUtils.isEmpty(stripExceptNumbers)) {
                        return;
                    }
                    if (stripExceptNumbers.length() > 4) {
                        for (int i3 = 4; i3 >= 1; i3--) {
                            String substring = stripExceptNumbers.substring(0, i3);
                            List list2 = (List) this.codesMap.get(substring);
                            CountrySelectActivity.Country country2 = null;
                            if (list2 != null) {
                                if (list2.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                    if (string != null) {
                                        CountrySelectActivity.Country country3 = (CountrySelectActivity.Country) list2.get(list2.size() - 1);
                                        Iterator it = this.countriesArray.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                country2 = country3;
                                                break;
                                            }
                                            CountrySelectActivity.Country country4 = (CountrySelectActivity.Country) it.next();
                                            if (Objects.equals(country4.shortname, string)) {
                                                country2 = country4;
                                                break;
                                            }
                                        }
                                    } else {
                                        country2 = (CountrySelectActivity.Country) list2.get(list2.size() - 1);
                                    }
                                } else {
                                    country2 = (CountrySelectActivity.Country) list2.get(0);
                                }
                            }
                            if (country2 != null) {
                                this.codeField.setText(substring);
                                return;
                            }
                        }
                        this.codeField.setText(stripExceptNumbers.substring(0, 1));
                    }
                }
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            for (int i = 0; i < this.countryButton.getChildCount(); i++) {
                TextView textView = (TextView) this.countryButton.getChildAt(i);
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
                textView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
            }
            ImageView imageView = this.chevronRight;
            int i2 = Theme.key_windowBackgroundWhiteHintText;
            imageView.setColorFilter(Theme.getColor(i2));
            this.chevronRight.setBackground(Theme.createSelectorDrawable(LoginActivity.this.getThemedColor(Theme.key_listSelector), 1));
            TextView textView2 = this.plusTextView;
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            textView2.setTextColor(Theme.getColor(i3));
            this.codeField.setTextColor(Theme.getColor(i3));
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.codeField;
            int i4 = Theme.key_windowBackgroundWhiteInputFieldActivated;
            animatedPhoneNumberEditText.setCursorColor(Theme.getColor(i4));
            this.codeDividerView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputField));
            this.phoneField.setTextColor(Theme.getColor(i3));
            this.phoneField.setHintTextColor(Theme.getColor(i2));
            this.phoneField.setCursorColor(Theme.getColor(i4));
            CheckBoxCell checkBoxCell = this.syncContactsBox;
            if (checkBoxCell != null) {
                checkBoxCell.setSquareCheckBoxColor(Theme.key_checkboxSquareUnchecked, Theme.key_checkboxSquareBackground, Theme.key_checkboxSquareCheck);
                this.syncContactsBox.updateTextColor();
            }
            CheckBoxCell checkBoxCell2 = this.testBackendCheckBox;
            if (checkBoxCell2 != null) {
                checkBoxCell2.setSquareCheckBoxColor(Theme.key_checkboxSquareUnchecked, Theme.key_checkboxSquareBackground, Theme.key_checkboxSquareCheck);
                this.testBackendCheckBox.updateTextColor();
            }
            this.phoneOutlineView.updateColor();
            this.countryOutlineView.updateColor();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        public void selectCountry(CountrySelectActivity.Country country) {
            this.ignoreOnTextChange = true;
            String str = country.code;
            this.codeField.setText(str);
            setCountryHint(str, country);
            this.currentCountry = country;
            this.countryState = 0;
            this.ignoreOnTextChange = false;
            MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + country.code, country.shortname).apply();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryHint(String str, CountrySelectActivity.Country country) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String languageFlag = LocaleController.getLanguageFlag(country.shortname);
            if (languageFlag != null) {
                spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
                spannableStringBuilder.setSpan(new ReplacementSpan() { // from class: org.telegram.ui.LoginActivity.PhoneView.5
                    @Override // android.text.style.ReplacementSpan
                    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                    }

                    @Override // android.text.style.ReplacementSpan
                    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                        return AndroidUtilities.dp(16.0f);
                    }
                }, languageFlag.length(), languageFlag.length() + 1, 0);
            }
            spannableStringBuilder.append((CharSequence) country.name);
            setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.countryButton.getCurrentView().getPaint().getFontMetricsInt(), false));
            this.countryCodeForHint = str;
            this.wasCountryHintIndex = -1;
            invalidateCountryHint();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateCountryHint() {
            int i;
            String str = this.countryCodeForHint;
            String replace = this.phoneField.getText() != null ? this.phoneField.getText().toString().replace(" ", "") : "";
            if (this.phoneFormatMap.get(str) != null && !((List) this.phoneFormatMap.get(str)).isEmpty()) {
                List list = (List) this.phoneFormatMap.get(str);
                if (!replace.isEmpty()) {
                    i = 0;
                    while (i < list.size()) {
                        if (replace.startsWith(((String) list.get(i)).replace(" ", "").replace("X", "").replace("0", ""))) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
                if (i == -1) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        String str2 = (String) list.get(i2);
                        if (str2.startsWith("X") || str2.startsWith("0")) {
                            i = i2;
                            break;
                        }
                    }
                    if (i == -1) {
                        i = 0;
                    }
                }
                if (this.wasCountryHintIndex != i) {
                    String str3 = (String) ((List) this.phoneFormatMap.get(str)).get(i);
                    int selectionStart = this.phoneField.getSelectionStart();
                    int selectionEnd = this.phoneField.getSelectionEnd();
                    this.phoneField.setHintText(str3 != null ? str3.replace('X', '0') : null);
                    AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
                    animatedPhoneNumberEditText.setSelection(Math.max(0, Math.min(animatedPhoneNumberEditText.length(), selectionStart)), Math.max(0, Math.min(this.phoneField.length(), selectionEnd)));
                    this.wasCountryHintIndex = i;
                    return;
                }
                return;
            }
            if (this.wasCountryHintIndex != -1) {
                int selectionStart2 = this.phoneField.getSelectionStart();
                int selectionEnd2 = this.phoneField.getSelectionEnd();
                this.phoneField.setHintText((String) null);
                this.phoneField.setSelection(selectionStart2, selectionEnd2);
                this.wasCountryHintIndex = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryButtonText(CharSequence charSequence) {
            Animation loadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.countryButton.getCurrentView().getText() == null || charSequence != null) ? org.telegram.messenger.R.anim.text_out : org.telegram.messenger.R.anim.text_out_down);
            loadAnimation.setInterpolator(Easings.easeInOutQuad);
            this.countryButton.setOutAnimation(loadAnimation);
            CharSequence text = this.countryButton.getCurrentView().getText();
            this.countryButton.setText(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true);
            this.countryOutlineView.animateSelection(charSequence != null ? 1.0f : 0.0f);
        }

        private void setCountry(HashMap hashMap, String str) {
            CountrySelectActivity.Country country;
            if (((String) hashMap.get(str)) == null || this.countriesArray == null) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= this.countriesArray.size()) {
                    country = null;
                    break;
                } else {
                    if (this.countriesArray.get(i) != null && ((CountrySelectActivity.Country) this.countriesArray.get(i)).name.equals(str)) {
                        country = (CountrySelectActivity.Country) this.countriesArray.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (country != null) {
                this.codeField.setText(country.code);
                this.countryState = 0;
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (this.ignoreSelection) {
                this.ignoreSelection = false;
                return;
            }
            this.ignoreOnTextChange = true;
            this.codeField.setText(((CountrySelectActivity.Country) this.countriesArray.get(i)).code);
            this.ignoreOnTextChange = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
        @Override // org.telegram.ui.Components.SlideView
        /* renamed from: onNextPressed, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void lambda$onNextPressed$16(final String str) {
            int i;
            boolean z;
            boolean z2;
            boolean z3;
            TLRPC.TL_auth_sendCode tL_auth_sendCode;
            int checkSelfPermission;
            int checkSelfPermission2;
            boolean z4;
            int i2;
            boolean shouldShowRequestPermissionRationale;
            boolean shouldShowRequestPermissionRationale2;
            int checkSelfPermission3;
            int checkSelfPermission4;
            if (LoginActivity.this.getParentActivity() == null || this.nextPressed || LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.codeField.length() == 0 || this.phoneField.length() == 0) {
                LoginActivity.this.onFieldError(this.phoneOutlineView, false);
                return;
            }
            String str2 = "+" + ((Object) this.codeField.getText()) + " " + ((Object) this.phoneField.getText());
            if (!this.confirmedNumber) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y && !LoginActivity.this.isCustomKeyboardVisible() && LoginActivity.this.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    LoginActivity.this.keyboardHideCallback = new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.PhoneView.this.lambda$onNextPressed$17(str);
                        }
                    };
                    AndroidUtilities.hideKeyboard(LoginActivity.this.fragmentView);
                    return;
                }
                LoginActivity loginActivity = LoginActivity.this;
                Context context = LoginActivity.this.fragmentView.getContext();
                LoginActivity loginActivity2 = LoginActivity.this;
                loginActivity.phoneNumberConfirmView = new PhoneNumberConfirmView(context, (ViewGroup) loginActivity2.fragmentView, loginActivity2.floatingButtonContainer, str2, new 6(str));
                LoginActivity.this.phoneNumberConfirmView.show();
                return;
            }
            this.confirmedNumber = false;
            if (LoginActivity.this.phoneNumberConfirmView != null) {
                LoginActivity.this.phoneNumberConfirmView.dismiss();
            }
            boolean isSimAvailable = AndroidUtilities.isSimAvailable();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 23 || !isSimAvailable) {
                i = 1;
                z = true;
                z2 = true;
                z3 = true;
            } else {
                checkSelfPermission = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE");
                z = checkSelfPermission == 0;
                checkSelfPermission2 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE");
                z2 = checkSelfPermission2 == 0;
                if (i3 >= 28) {
                    checkSelfPermission4 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG");
                    if (checkSelfPermission4 != 0) {
                        z3 = false;
                        if (i3 >= 26) {
                            checkSelfPermission3 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS");
                            if (checkSelfPermission3 != 0) {
                                z4 = false;
                                if (LoginActivity.this.checkPermissions) {
                                    LoginActivity.this.permissionsItems.clear();
                                    if (!z) {
                                        LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_STATE");
                                    }
                                    if (!z2) {
                                        LoginActivity.this.permissionsItems.add("android.permission.CALL_PHONE");
                                    }
                                    if (!z3) {
                                        LoginActivity.this.permissionsItems.add("android.permission.READ_CALL_LOG");
                                    }
                                    if (!z4 && i3 >= 26) {
                                        LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_NUMBERS");
                                    }
                                    if (!LoginActivity.this.permissionsItems.isEmpty()) {
                                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                        if (!globalMainSettings.getBoolean("firstlogin", true)) {
                                            shouldShowRequestPermissionRationale = LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE");
                                            if (!shouldShowRequestPermissionRationale) {
                                                shouldShowRequestPermissionRationale2 = LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG");
                                                if (!shouldShowRequestPermissionRationale2) {
                                                    try {
                                                        LoginActivity.this.getParentActivity().requestPermissions((String[]) LoginActivity.this.permissionsItems.toArray(new String[0]), 6);
                                                        return;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                        globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                                        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                                        builder.setPositiveButton(LocaleController.getString("Continue", org.telegram.messenger.R.string.Continue), null);
                                        if (!z && (!z2 || !z3)) {
                                            builder.setMessage(LocaleController.getString("AllowReadCallAndLog", org.telegram.messenger.R.string.AllowReadCallAndLog));
                                            i2 = org.telegram.messenger.R.raw.calls_log;
                                        } else if (!z2 || !z3) {
                                            builder.setMessage(LocaleController.getString("AllowReadCallLog", org.telegram.messenger.R.string.AllowReadCallLog));
                                            i2 = org.telegram.messenger.R.raw.calls_log;
                                        } else {
                                            builder.setMessage(LocaleController.getString("AllowReadCall", org.telegram.messenger.R.string.AllowReadCall));
                                            i2 = org.telegram.messenger.R.raw.incoming_calls;
                                        }
                                        builder.setTopAnimation(i2, 46, false, Theme.getColor(Theme.key_dialogTopBackground));
                                        LoginActivity loginActivity3 = LoginActivity.this;
                                        loginActivity3.permissionsDialog = loginActivity3.showDialog(builder.create());
                                        this.confirmedNumber = true;
                                        return;
                                    }
                                }
                                i = 1;
                            }
                        }
                        z4 = true;
                        if (LoginActivity.this.checkPermissions) {
                        }
                        i = 1;
                    }
                }
                z3 = true;
                if (i3 >= 26) {
                }
                z4 = true;
                if (LoginActivity.this.checkPermissions) {
                }
                i = 1;
            }
            int i4 = this.countryState;
            if (i4 == i) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", org.telegram.messenger.R.string.ChooseCountry));
                LoginActivity.this.needHideProgress(false);
                return;
            }
            if (i4 == 2 && !BuildVars.DEBUG_VERSION) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.WrongCountry));
                LoginActivity.this.needHideProgress(false);
                return;
            }
            final String stripExceptNumbers = PhoneFormat.stripExceptNumbers("" + ((Object) this.codeField.getText()) + ((Object) this.phoneField.getText()));
            if (LoginActivity.this.activityMode == 0 && (LoginActivity.this.getParentActivity() instanceof LaunchActivity)) {
                for (final int i5 = 0; i5 < 4; i5++) {
                    UserConfig userConfig = UserConfig.getInstance(i5);
                    if (userConfig.isClientActivated() && PhoneNumberUtils.compare(stripExceptNumbers, userConfig.getCurrentUser().phone) && ConnectionsManager.getInstance(i5).isTestBackend() == LoginActivity.this.testBackend) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                        builder2.setTitle(LocaleController.getString(org.telegram.messenger.R.string.AppName));
                        builder2.setMessage(LocaleController.getString("AccountAlreadyLoggedIn", org.telegram.messenger.R.string.AccountAlreadyLoggedIn));
                        builder2.setPositiveButton(LocaleController.getString("AccountSwitch", org.telegram.messenger.R.string.AccountSwitch), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda3
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i6) {
                                LoginActivity.PhoneView.this.lambda$onNextPressed$18(i5, alertDialog, i6);
                            }
                        });
                        builder2.setNegativeButton(LocaleController.getString("OK", org.telegram.messenger.R.string.OK), null);
                        LoginActivity.this.showDialog(builder2.create());
                        LoginActivity.this.needHideProgress(false);
                        return;
                    }
                }
            }
            TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
            tL_codeSettings.allow_flashcall = isSimAvailable && z && z2 && z3;
            tL_codeSettings.allow_missed_call = isSimAvailable && z;
            boolean hasServices = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
            tL_codeSettings.allow_firebase = hasServices;
            tL_codeSettings.allow_app_hash = hasServices;
            if (LoginActivity.this.forceDisableSafetyNet || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
                tL_codeSettings.allow_firebase = false;
            }
            ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
            if (savedLogInTokens != null) {
                for (int i6 = 0; i6 < savedLogInTokens.size(); i6++) {
                    if (savedLogInTokens.get(i6).future_auth_token != null) {
                        if (tL_codeSettings.logout_tokens == null) {
                            tL_codeSettings.logout_tokens = new ArrayList<>();
                        }
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("login token to check " + new String(savedLogInTokens.get(i6).future_auth_token, StandardCharsets.UTF_8));
                        }
                        tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i6).future_auth_token);
                        if (tL_codeSettings.logout_tokens.size() >= 20) {
                            break;
                        }
                    }
                }
            }
            ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
            if (savedLogOutTokens != null) {
                for (int i7 = 0; i7 < savedLogOutTokens.size(); i7++) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i7).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
                AuthTokensHelper.saveLogOutTokens(savedLogOutTokens);
            }
            if (tL_codeSettings.logout_tokens != null) {
                tL_codeSettings.flags |= 64;
            }
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            sharedPreferences.edit().remove("sms_hash_code").apply();
            if (tL_codeSettings.allow_app_hash) {
                sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).apply();
            } else {
                sharedPreferences.edit().remove("sms_hash").apply();
            }
            if (tL_codeSettings.allow_flashcall) {
                try {
                    HashSet userPhoneNumbers = LoginActivity.this.getUserPhoneNumbers();
                    if (!userPhoneNumbers.isEmpty()) {
                        tL_codeSettings.unknown_number = false;
                        tL_codeSettings.current_number = Collection.-EL.stream(userPhoneNumbers).anyMatch(new Predicate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda4
                            public /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$-CC.$default$and(this, predicate);
                            }

                            public /* synthetic */ Predicate negate() {
                                return Predicate$-CC.$default$negate(this);
                            }

                            public /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$-CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                boolean compare;
                                compare = PhoneNumberUtils.compare(stripExceptNumbers, (String) obj);
                                return compare;
                            }
                        });
                    } else {
                        tL_codeSettings.unknown_number = true;
                        if (UserConfig.getActivatedAccountsCount() > 0) {
                            tL_codeSettings.allow_flashcall = false;
                        } else {
                            tL_codeSettings.current_number = false;
                        }
                    }
                } catch (Exception e2) {
                    tL_codeSettings.unknown_number = true;
                    FileLog.e(e2);
                }
            }
            if (LoginActivity.this.activityMode != 2) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).cleanup(false);
                TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                tL_auth_sendCode2.api_id = BuildVars.APP_ID;
                tL_auth_sendCode2.phone_number = stripExceptNumbers;
                tL_auth_sendCode2.settings = tL_codeSettings;
                tL_auth_sendCode = tL_auth_sendCode2;
            } else {
                TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                sendchangephonecode.phone_number = stripExceptNumbers;
                sendchangephonecode.settings = tL_codeSettings;
                tL_auth_sendCode = sendchangephonecode;
            }
            final TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
            final Bundle bundle = new Bundle();
            bundle.putString("phone", "+" + ((Object) this.codeField.getText()) + " " + ((Object) this.phoneField.getText()));
            try {
                bundle.putString("ephone", "+" + PhoneFormat.stripExceptNumbers(this.codeField.getText().toString()) + " " + PhoneFormat.stripExceptNumbers(this.phoneField.getText().toString()));
            } catch (Exception e3) {
                FileLog.e(e3);
                bundle.putString("ephone", "+" + stripExceptNumbers);
            }
            bundle.putString("phoneFormated", stripExceptNumbers);
            CountrySelectActivity.Country country = this.currentCountry;
            if (country != null) {
                bundle.putString("country", country.code);
            }
            this.nextPressed = true;
            final PhoneInputData phoneInputData = new PhoneInputData();
            phoneInputData.phoneNumber = "+" + ((Object) this.codeField.getText()) + " " + ((Object) this.phoneField.getText());
            phoneInputData.country = this.currentCountry;
            phoneInputData.patterns = (List) this.phoneFormatMap.get(this.codeField.getText().toString());
            LoginActivity.this.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_sendCode3, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda2
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.PhoneView.this.lambda$onNextPressed$23(bundle, stripExceptNumbers, phoneInputData, tL_auth_sendCode3, tLObject, tL_error);
                }
            }, 27));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$17(final String str) {
            postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.this.lambda$onNextPressed$16(str);
                }
            }, 200L);
        }

        class 6 implements PhoneNumberConfirmView.IConfirmDialogCallback {
            final /* synthetic */ String val$code;

            6(String str) {
                this.val$code = str;
            }

            @Override // org.telegram.ui.LoginActivity.PhoneNumberConfirmView.IConfirmDialogCallback
            public void onFabPressed(PhoneNumberConfirmView phoneNumberConfirmView, TransformableLoginButtonView transformableLoginButtonView) {
                onConfirm(phoneNumberConfirmView);
            }

            @Override // org.telegram.ui.LoginActivity.PhoneNumberConfirmView.IConfirmDialogCallback
            public void onEditPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView) {
                phoneNumberConfirmView.dismiss();
            }

            @Override // org.telegram.ui.LoginActivity.PhoneNumberConfirmView.IConfirmDialogCallback
            public void onConfirmPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView) {
                onConfirm(phoneNumberConfirmView);
            }

            @Override // org.telegram.ui.LoginActivity.PhoneNumberConfirmView.IConfirmDialogCallback
            public void onDismiss(PhoneNumberConfirmView phoneNumberConfirmView) {
                LoginActivity.this.phoneNumberConfirmView = null;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private void onConfirm(final PhoneNumberConfirmView phoneNumberConfirmView) {
                int checkSelfPermission;
                int checkSelfPermission2;
                boolean z;
                boolean z2;
                int i;
                boolean shouldShowRequestPermissionRationale;
                boolean shouldShowRequestPermissionRationale2;
                int checkSelfPermission3;
                int checkSelfPermission4;
                PhoneView.this.confirmedNumber = true;
                LoginActivity.this.currentDoneType = 0;
                LoginActivity.this.needShowProgress(0, false);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23 && AndroidUtilities.isSimAvailable()) {
                    checkSelfPermission = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE");
                    boolean z3 = checkSelfPermission == 0;
                    checkSelfPermission2 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE");
                    boolean z4 = checkSelfPermission2 == 0;
                    if (i2 >= 28) {
                        checkSelfPermission4 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG");
                        if (checkSelfPermission4 != 0) {
                            z = false;
                            if (i2 >= 26) {
                                checkSelfPermission3 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS");
                                if (checkSelfPermission3 != 0) {
                                    z2 = false;
                                    if (PhoneView.this.codeField != null && "888".equals(PhoneView.this.codeField.getText())) {
                                        z3 = true;
                                        z4 = true;
                                        z = true;
                                        z2 = true;
                                    }
                                    if (LoginActivity.this.checkPermissions) {
                                        LoginActivity.this.permissionsItems.clear();
                                        if (!z3) {
                                            LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_STATE");
                                        }
                                        if (!z4) {
                                            LoginActivity.this.permissionsItems.add("android.permission.CALL_PHONE");
                                        }
                                        if (!z) {
                                            LoginActivity.this.permissionsItems.add("android.permission.READ_CALL_LOG");
                                        }
                                        if (!z2 && i2 >= 26) {
                                            LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_NUMBERS");
                                        }
                                        if (!LoginActivity.this.permissionsItems.isEmpty()) {
                                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                            if (!globalMainSettings.getBoolean("firstlogin", true)) {
                                                shouldShowRequestPermissionRationale = LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE");
                                                if (!shouldShowRequestPermissionRationale) {
                                                    shouldShowRequestPermissionRationale2 = LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG");
                                                    if (!shouldShowRequestPermissionRationale2) {
                                                        try {
                                                            LoginActivity.this.getParentActivity().requestPermissions((String[]) LoginActivity.this.permissionsItems.toArray(new String[0]), 6);
                                                            return;
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                                            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                                            builder.setPositiveButton(LocaleController.getString("Continue", org.telegram.messenger.R.string.Continue), null);
                                            if (!z3 && (!z4 || !z)) {
                                                builder.setMessage(LocaleController.getString("AllowReadCallAndLog", org.telegram.messenger.R.string.AllowReadCallAndLog));
                                                i = org.telegram.messenger.R.raw.calls_log;
                                            } else if (!z4 || !z) {
                                                builder.setMessage(LocaleController.getString("AllowReadCallLog", org.telegram.messenger.R.string.AllowReadCallLog));
                                                i = org.telegram.messenger.R.raw.calls_log;
                                            } else {
                                                builder.setMessage(LocaleController.getString("AllowReadCall", org.telegram.messenger.R.string.AllowReadCall));
                                                i = org.telegram.messenger.R.raw.incoming_calls;
                                            }
                                            builder.setTopAnimation(i, 46, false, Theme.getColor(Theme.key_dialogTopBackground));
                                            LoginActivity loginActivity = LoginActivity.this;
                                            loginActivity.permissionsDialog = loginActivity.showDialog(builder.create());
                                            PhoneView.this.confirmedNumber = true;
                                            return;
                                        }
                                    }
                                }
                            }
                            z2 = true;
                            if (PhoneView.this.codeField != null) {
                                z3 = true;
                                z4 = true;
                                z = true;
                                z2 = true;
                            }
                            if (LoginActivity.this.checkPermissions) {
                            }
                        }
                    }
                    z = true;
                    if (i2 >= 26) {
                    }
                    z2 = true;
                    if (PhoneView.this.codeField != null) {
                    }
                    if (LoginActivity.this.checkPermissions) {
                    }
                }
                final String str = this.val$code;
                phoneNumberConfirmView.animateProgress(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$6$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.PhoneView.6.this.lambda$onConfirm$1(phoneNumberConfirmView, str);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onConfirm$1(final PhoneNumberConfirmView phoneNumberConfirmView, final String str) {
                phoneNumberConfirmView.dismiss();
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$6$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.PhoneView.6.this.lambda$onConfirm$0(str, phoneNumberConfirmView);
                    }
                }, 150L);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onConfirm$0(String str, PhoneNumberConfirmView phoneNumberConfirmView) {
                PhoneView.this.lambda$onNextPressed$16(str);
                LoginActivity.this.floatingProgressView.sync(phoneNumberConfirmView.floatingProgressView);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$18(int i, AlertDialog alertDialog, int i2) {
            if (UserConfig.selectedAccount != i) {
                ((LaunchActivity) LoginActivity.this.getParentActivity()).switchToAccount(i, false);
            }
            LoginActivity.this.lambda$onBackPressed$340();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$23(final Bundle bundle, final String str, final PhoneInputData phoneInputData, final TLObject tLObject, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.this.lambda$onNextPressed$22(tL_error, tLObject2, bundle, str, phoneInputData, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$22(TLRPC.TL_error tL_error, TLObject tLObject, Bundle bundle, final String str, PhoneInputData phoneInputData, TLObject tLObject2) {
            this.nextPressed = false;
            if (tL_error == null) {
                if (!(tLObject instanceof TLRPC.TL_auth_sentCodeSuccess)) {
                    LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, (TLRPC.auth_SentCode) tLObject);
                } else {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject).authorization;
                    if (!(auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired)) {
                        LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) auth_authorization);
                    } else {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                        }
                        LoginActivity.this.setPage(5, true, bundle, false);
                    }
                }
            } else {
                String str2 = tL_error.text;
                if (str2 != null) {
                    if (str2.contains("SESSION_PASSWORD_NEEDED")) {
                        ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda24
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                LoginActivity.PhoneView.this.lambda$onNextPressed$21(str, tLObject3, tL_error2);
                            }
                        }, 10);
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.needShowInvalidAlert(LoginActivity.this, str, phoneInputData, false);
                    } else if (tL_error.text.contains("PHONE_PASSWORD_FLOOD")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", org.telegram.messenger.R.string.FloodWait));
                    } else if (tL_error.text.contains("PHONE_NUMBER_FLOOD")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", org.telegram.messenger.R.string.PhoneNumberFlood));
                    } else if (tL_error.text.contains("PHONE_NUMBER_BANNED")) {
                        LoginActivity.needShowInvalidAlert(LoginActivity.this, str, phoneInputData, true);
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", org.telegram.messenger.R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", org.telegram.messenger.R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tLObject2, phoneInputData.phoneNumber);
                    }
                }
            }
            if (LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            LoginActivity.this.needHideProgress(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$21(final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.this.lambda$onNextPressed$20(tL_error, tLObject, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$20(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", org.telegram.messenger.R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", str);
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:6:0x0012, B:8:0x0022, B:10:0x0028, B:15:0x003d, B:18:0x0050, B:22:0x005c, B:24:0x0067, B:27:0x0074, B:28:0x007d, B:30:0x0089, B:32:0x00a1, B:35:0x00a7, B:38:0x00ad, B:42:0x00bb, B:44:0x00d4, B:47:0x00de, B:53:0x013e, B:55:0x014f, B:51:0x0149, B:56:0x00ee, B:58:0x00f4, B:60:0x011a, B:61:0x0120, B:63:0x0126, B:69:0x0136, B:73:0x015e, B:74:0x0171, B:76:0x017b, B:78:0x01ac), top: B:5:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:6:0x0012, B:8:0x0022, B:10:0x0028, B:15:0x003d, B:18:0x0050, B:22:0x005c, B:24:0x0067, B:27:0x0074, B:28:0x007d, B:30:0x0089, B:32:0x00a1, B:35:0x00a7, B:38:0x00ad, B:42:0x00bb, B:44:0x00d4, B:47:0x00de, B:53:0x013e, B:55:0x014f, B:51:0x0149, B:56:0x00ee, B:58:0x00f4, B:60:0x011a, B:61:0x0120, B:63:0x0126, B:69:0x0136, B:73:0x015e, B:74:0x0171, B:76:0x017b, B:78:0x01ac), top: B:5:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void fillNumber() {
            boolean z;
            boolean z2;
            boolean z3;
            CountrySelectActivity.Country country;
            int checkSelfPermission;
            int checkSelfPermission2;
            if (this.numberFilled || LoginActivity.this.activityMode != 0) {
                return;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                if (AndroidUtilities.isSimAvailable()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        checkSelfPermission = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE");
                        z = checkSelfPermission == 0;
                        if (i >= 26) {
                            checkSelfPermission2 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS");
                            if (checkSelfPermission2 != 0) {
                                z2 = false;
                                if (LoginActivity.this.checkShowPermissions && (!z || !z2)) {
                                    LoginActivity.this.permissionsShowItems.clear();
                                    if (!z) {
                                        LoginActivity.this.permissionsShowItems.add("android.permission.READ_PHONE_STATE");
                                    }
                                    if (!z2 && i >= 26) {
                                        LoginActivity.this.permissionsShowItems.add("android.permission.READ_PHONE_NUMBERS");
                                    }
                                    if (LoginActivity.this.permissionsShowItems.isEmpty()) {
                                        final ArrayList arrayList = new ArrayList(LoginActivity.this.permissionsShowItems);
                                        Runnable runnable = new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda15
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                LoginActivity.PhoneView.this.lambda$fillNumber$24(arrayList);
                                            }
                                        };
                                        if (LoginActivity.this.isAnimatingIntro) {
                                            LoginActivity.this.animationFinishCallback = runnable;
                                            return;
                                        } else {
                                            runnable.run();
                                            return;
                                        }
                                    }
                                    return;
                                }
                            }
                        }
                        z2 = true;
                        if (LoginActivity.this.checkShowPermissions) {
                            LoginActivity.this.permissionsShowItems.clear();
                            if (!z) {
                            }
                            if (!z2) {
                                LoginActivity.this.permissionsShowItems.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (LoginActivity.this.permissionsShowItems.isEmpty()) {
                            }
                        }
                    } else {
                        z = true;
                        z2 = true;
                    }
                    this.numberFilled = true;
                    if (!LoginActivity.this.newAccount && z && z2) {
                        this.codeField.setAlpha(0.0f);
                        this.phoneField.setAlpha(0.0f);
                        String stripExceptNumbers = PhoneFormat.stripExceptNumbers(telephonyManager.getLine1Number());
                        if (!TextUtils.isEmpty(stripExceptNumbers)) {
                            int i2 = 4;
                            String str = null;
                            if (stripExceptNumbers.length() > 4) {
                                while (true) {
                                    if (i2 < 1) {
                                        z3 = false;
                                        break;
                                    }
                                    String substring = stripExceptNumbers.substring(0, i2);
                                    List list = (List) this.codesMap.get(substring);
                                    if (list == null) {
                                        country = null;
                                    } else if (list.size() > 1) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                        country = (CountrySelectActivity.Country) list.get(list.size() - 1);
                                        if (string != null) {
                                            Iterator it = this.countriesArray.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                CountrySelectActivity.Country country2 = (CountrySelectActivity.Country) it.next();
                                                if (Objects.equals(country2.shortname, string)) {
                                                    country = country2;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        country = (CountrySelectActivity.Country) list.get(0);
                                    }
                                    if (country != null) {
                                        str = stripExceptNumbers.substring(i2);
                                        this.codeField.setText(substring);
                                        z3 = true;
                                        break;
                                    }
                                    i2--;
                                }
                                if (!z3) {
                                    str = stripExceptNumbers.substring(1);
                                    this.codeField.setText(stripExceptNumbers.substring(0, 1));
                                }
                            }
                            if (str != null) {
                                this.phoneField.requestFocus();
                                this.phoneField.setText(str);
                                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
                                animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
                            }
                        }
                        if (this.phoneField.length() > 0) {
                            AnimatorSet duration = new AnimatorSet().setDuration(300L);
                            AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = this.codeField;
                            Property property = View.ALPHA;
                            duration.playTogether(ObjectAnimator.ofFloat(animatedPhoneNumberEditText2, (Property<AnimatedPhoneNumberEditText, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.phoneField, (Property<AnimatedPhoneNumberEditText, Float>) property, 1.0f));
                            duration.start();
                            this.confirmedNumber = true;
                            return;
                        }
                        this.codeField.setAlpha(1.0f);
                        this.phoneField.setAlpha(1.0f);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fillNumber$24(List list) {
            boolean shouldShowRequestPermissionRationale;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("firstloginshow", true)) {
                shouldShowRequestPermissionRationale = LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE");
                if (!shouldShowRequestPermissionRationale) {
                    LoginActivity.this.getParentActivity().requestPermissions((String[]) list.toArray(new String[0]), 7);
                    return;
                }
            }
            globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
            builder.setTopAnimation(org.telegram.messenger.R.raw.incoming_calls, 46, false, Theme.getColor(Theme.key_dialogTopBackground));
            builder.setPositiveButton(LocaleController.getString("Continue", org.telegram.messenger.R.string.Continue), null);
            builder.setMessage(LocaleController.getString("AllowFillNumber", org.telegram.messenger.R.string.AllowFillNumber));
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.permissionsShowDialog = loginActivity.showDialog(builder.create(), true, null);
            LoginActivity.this.needRequestPermissions = true;
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            fillNumber();
            CheckBoxCell checkBoxCell = this.syncContactsBox;
            if (checkBoxCell != null) {
                checkBoxCell.setChecked(LoginActivity.this.syncContacts, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.this.lambda$onShow$25();
                }
            }, LoginActivity.SHOW_DELAY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShow$25() {
            if (this.phoneField != null) {
                if (LoginActivity.this.needRequestPermissions) {
                    this.codeField.clearFocus();
                    this.phoneField.clearFocus();
                } else {
                    if (this.codeField.length() != 0) {
                        this.phoneField.requestFocus();
                        if (!this.numberFilled) {
                            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
                            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
                        }
                        LoginActivity.this.showKeyboard(this.phoneField);
                        return;
                    }
                    this.codeField.requestFocus();
                    LoginActivity.this.showKeyboard(this.codeField);
                }
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("YourPhone", org.telegram.messenger.R.string.YourPhone);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            String obj = this.codeField.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("phoneview_code", obj);
            }
            String obj2 = this.phoneField.getText().toString();
            if (obj2.length() != 0) {
                bundle.putString("phoneview_phone", obj2);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            String string = bundle.getString("phoneview_code");
            if (string != null) {
                this.codeField.setText(string);
            }
            String string2 = bundle.getString("phoneview_phone");
            if (string2 != null) {
                this.phoneField.setText(string2);
            }
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.emojiLoaded) {
                this.countryButton.getCurrentView().invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashSet getUserPhoneNumbers() {
        SubscriptionManager from;
        String number;
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22) {
                from = SubscriptionManager.from(getContext());
                List completeActiveSubscriptionInfoList = i >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
                    completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                    completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList != null) {
                    for (int i2 = 0; i2 < completeActiveSubscriptionInfoList.size(); i2++) {
                        number = LoginActivity$$ExternalSyntheticApiModelOutline4.m(completeActiveSubscriptionInfoList.get(i2)).getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            hashSet.add(number);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return hashSet;
    }

    public class LoginActivitySmsView extends SlideView implements NotificationCenter.NotificationCenterDelegate {
        private RLottieImageView blueImageView;
        private FrameLayout bottomContainer;
        private String catchedPhone;
        private CodeFieldContainer codeFieldContainer;
        private int codeTime;
        private Timer codeTimer;
        private TextView confirmTextView;
        private Bundle currentParams;
        private int currentType;
        private RLottieDrawable dotsDrawable;
        private RLottieDrawable dotsToStarsDrawable;
        private String emailPhone;
        private Runnable errorColorTimeout;
        private ViewSwitcher errorViewSwitcher;
        RLottieDrawable hintDrawable;
        private boolean isDotsAnimationVisible;
        private boolean isResendingCode;
        private double lastCodeTime;
        private double lastCurrentTime;
        private String lastError;
        private int length;
        private ImageView missedCallArrowIcon;
        private TextView missedCallDescriptionSubtitle;
        private TextView missedCallDescriptionSubtitle2;
        private ImageView missedCallPhoneIcon;
        private TLRPC.TL_auth_sentCode nextCodeAuth;
        private Bundle nextCodeParams;
        private boolean nextPressed;
        private int nextType;
        private LinearLayout openFragmentButton;
        private TextView openFragmentButtonText;
        private RLottieImageView openFragmentImageView;
        private int openTime;
        private String pattern;
        private String phone;
        private String phoneHash;
        private boolean postedErrorColorTimeout;
        private String prefix;
        private TextView prefixTextView;
        private int prevType;
        private TextView prevTypeTextView;
        private FrameLayout problemFrame;
        private LoadingTextView problemText;
        private String requestPhone;
        private RLottieDrawable starsToDotsDrawable;
        private int time;
        private LoadingTextView timeText;
        private Timer timeTimer;
        private final Object timerSync;
        private TextView titleTextView;
        private String url;
        private boolean waitingForEvent;
        private TextView wrongCode;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onBackPressed$43(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean needBackButton() {
            return true;
        }

        static /* synthetic */ ProgressView access$10300(LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            return null;
        }

        static /* synthetic */ int access$8626(LoginActivitySmsView loginActivitySmsView, double d) {
            int i = (int) (loginActivitySmsView.time - d);
            loginActivitySmsView.time = i;
            return i;
        }

        static /* synthetic */ int access$9626(LoginActivitySmsView loginActivitySmsView, double d) {
            int i = (int) (loginActivitySmsView.codeTime - d);
            loginActivitySmsView.codeTime = i;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            int i = 0;
            this.postedErrorColorTimeout = false;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
            if (this.errorViewSwitcher.getCurrentView() != (this.currentType == 15 ? this.openFragmentButton : this.problemFrame)) {
                this.errorViewSwitcher.showNext();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x03d0  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x03f2  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x04c3  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0642  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x068e  */
        /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0670  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x052d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LoginActivitySmsView(final Context context, int i) {
            super(context);
            FrameLayout frameLayout;
            this.timerSync = new Object();
            this.time = 60000;
            this.codeTime = 15000;
            this.lastError = "";
            this.isResendingCode = false;
            this.pattern = "*";
            this.prefix = "";
            this.errorColorTimeout = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$new$0();
                }
            };
            this.currentType = i;
            setOrientation(1);
            TextView textView = new TextView(context);
            this.confirmTextView = textView;
            textView.setTextSize(1, 14.0f);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            TextView textView2 = new TextView(context);
            this.titleTextView = textView2;
            textView2.setTextSize(1, 18.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.titleTextView.setGravity(49);
            String string = LoginActivity.this.activityMode != 1 ? null : LocaleController.getString(org.telegram.messenger.R.string.CancelAccountReset);
            int i2 = this.currentType;
            if (i2 == 11) {
                this.titleTextView.setText(string == null ? LocaleController.getString(org.telegram.messenger.R.string.MissedCallDescriptionTitle) : string);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.missedCallArrowIcon = new ImageView(context);
                this.missedCallPhoneIcon = new ImageView(context);
                frameLayout2.addView(this.missedCallArrowIcon);
                frameLayout2.addView(this.missedCallPhoneIcon);
                this.missedCallArrowIcon.setImageResource(org.telegram.messenger.R.drawable.login_arrow1);
                this.missedCallPhoneIcon.setImageResource(org.telegram.messenger.R.drawable.login_phone1);
                addView(frameLayout2, LayoutHelper.createLinear(64, 64, 1, 0, 16, 0, 0));
                addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 8, 0, 0));
                TextView textView3 = new TextView(context);
                this.missedCallDescriptionSubtitle = textView3;
                textView3.setTextSize(1, 14.0f);
                this.missedCallDescriptionSubtitle.setGravity(1);
                this.missedCallDescriptionSubtitle.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.missedCallDescriptionSubtitle.setText(AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.MissedCallDescriptionSubtitle)));
                addView(this.missedCallDescriptionSubtitle, LayoutHelper.createLinear(-1, -2, 49, 36, 16, 36, 0));
                this.codeFieldContainer = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.1
                    @Override // org.telegram.ui.CodeFieldContainer
                    protected void processNextPressed() {
                        LoginActivitySmsView.this.lambda$onNextPressed$16(null);
                    }
                };
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                TextView textView4 = new TextView(context);
                this.prefixTextView = textView4;
                textView4.setTextSize(1, 20.0f);
                this.prefixTextView.setMaxLines(1);
                this.prefixTextView.setTypeface(AndroidUtilities.bold());
                this.prefixTextView.setPadding(0, 0, 0, 0);
                this.prefixTextView.setGravity(16);
                linearLayout.addView(this.prefixTextView, LayoutHelper.createLinear(-2, -1, 16, 0, 0, 4, 0));
                linearLayout.addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, -1));
                addView(linearLayout, LayoutHelper.createLinear(-2, 34, 1, 0, 28, 0, 0));
                TextView textView5 = new TextView(context);
                this.missedCallDescriptionSubtitle2 = textView5;
                textView5.setTextSize(1, 14.0f);
                this.missedCallDescriptionSubtitle2.setGravity(1);
                this.missedCallDescriptionSubtitle2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.missedCallDescriptionSubtitle2.setText(AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.MissedCallDescriptionSubtitle2)));
                addView(this.missedCallDescriptionSubtitle2, LayoutHelper.createLinear(-1, -2, 49, 36, 28, 36, 12));
            } else {
                if (i2 == 3) {
                    this.confirmTextView.setGravity(1);
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    addView(frameLayout3, LayoutHelper.createLinear(-1, 0, 1.0f));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setGravity(1);
                    frameLayout3.addView(linearLayout2, LayoutHelper.createFrame(-1, -2, 17));
                    ((FrameLayout.LayoutParams) linearLayout2.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    linearLayout2.addView(frameLayout4, LayoutHelper.createFrame(-2, -2, 1));
                    this.blueImageView = new RLottieImageView(context);
                    int i3 = org.telegram.messenger.R.raw.phone_flash_call;
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, String.valueOf(i3), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                    this.hintDrawable = rLottieDrawable;
                    this.blueImageView.setAnimation(rLottieDrawable);
                    frameLayout4.addView(this.blueImageView, LayoutHelper.createFrame(64, 64.0f));
                    this.titleTextView.setText(string == null ? LocaleController.getString(org.telegram.messenger.R.string.YourCode) : string);
                    linearLayout2.addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 0));
                    linearLayout2.addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
                    frameLayout = frameLayout3;
                    if (this.currentType != 11) {
                        CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.2
                            @Override // org.telegram.ui.CodeFieldContainer
                            protected void processNextPressed() {
                                LoginActivitySmsView.this.lambda$onNextPressed$16(null);
                            }
                        };
                        this.codeFieldContainer = codeFieldContainer;
                        addView(codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
                    }
                    if (this.currentType == 3) {
                        this.codeFieldContainer.setVisibility(8);
                    }
                    LoadingTextView loadingTextView = LoginActivity.this.new LoadingTextView(context);
                    this.prevTypeTextView = loadingTextView;
                    int i4 = Theme.key_windowBackgroundWhiteValueText;
                    loadingTextView.setLinkTextColor(Theme.getColor(i4));
                    this.prevTypeTextView.setTextColor(LoginActivity.this.getThemedColor(i4));
                    this.prevTypeTextView.setTextSize(1, 14.0f);
                    this.prevTypeTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.prevTypeTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    this.prevTypeTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivitySmsView.this.lambda$new$1(view);
                        }
                    });
                    addView(this.prevTypeTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
                    this.prevTypeTextView.setVisibility(8);
                    this.problemFrame = new FrameLayout(context);
                    LoadingTextView loadingTextView2 = new LoadingTextView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.3
                        {
                            LoginActivity loginActivity = LoginActivity.this;
                        }

                        @Override // org.telegram.ui.LoginActivity.LoadingTextView
                        protected boolean isResendingCode() {
                            return LoginActivitySmsView.this.isResendingCode;
                        }

                        @Override // org.telegram.ui.LoginActivity.LoadingTextView
                        protected boolean isRippleEnabled() {
                            return getVisibility() == 0 && (LoginActivitySmsView.this.time <= 0 || LoginActivitySmsView.this.timeTimer == null);
                        }
                    };
                    this.timeText = loadingTextView2;
                    loadingTextView2.setLinkTextColor(Theme.getColor(i4));
                    this.timeText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.timeText.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    this.timeText.setTextSize(1, 15.0f);
                    this.timeText.setGravity(51);
                    this.timeText.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivitySmsView.this.lambda$new$5(view);
                        }
                    });
                    this.problemFrame.addView(this.timeText, LayoutHelper.createFrame(-2, -2, 49));
                    this.errorViewSwitcher = new ViewSwitcher(context) { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.4
                        @Override // android.widget.FrameLayout, android.view.View
                        protected void onMeasure(int i5, int i6) {
                            super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_31));
                        }
                    };
                    if (this.currentType == 15) {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, org.telegram.messenger.R.anim.text_in);
                        Interpolator interpolator = Easings.easeInOutQuad;
                        loadAnimation.setInterpolator(interpolator);
                        this.errorViewSwitcher.setInAnimation(loadAnimation);
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, org.telegram.messenger.R.anim.text_out);
                        loadAnimation2.setInterpolator(interpolator);
                        this.errorViewSwitcher.setOutAnimation(loadAnimation2);
                        LoadingTextView loadingTextView3 = new LoadingTextView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.5
                            {
                                LoginActivity loginActivity = LoginActivity.this;
                            }

                            @Override // org.telegram.ui.LoginActivity.LoadingTextView
                            protected boolean isResendingCode() {
                                return LoginActivitySmsView.this.isResendingCode;
                            }

                            @Override // org.telegram.ui.LoginActivity.LoadingTextView
                            protected boolean isRippleEnabled() {
                                return isClickable() && getVisibility() == 0 && !LoginActivitySmsView.this.nextPressed && (LoginActivitySmsView.this.timeText == null || LoginActivitySmsView.this.timeText.getVisibility() == 8) && !LoginActivitySmsView.this.isResendingCode;
                            }
                        };
                        this.problemText = loadingTextView3;
                        loadingTextView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.problemText.setTextSize(1, 15.0f);
                        this.problemText.setGravity(49);
                        this.problemText.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                        this.problemFrame.addView(this.problemText, LayoutHelper.createFrame(-1, -2, 17));
                        this.errorViewSwitcher.addView(this.problemFrame, LayoutHelper.createFrame(-2, -2, 17));
                    } else {
                        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, org.telegram.messenger.R.anim.scale_in);
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                        loadAnimation3.setInterpolator(cubicBezierInterpolator);
                        this.errorViewSwitcher.setInAnimation(loadAnimation3);
                        Animation loadAnimation4 = AnimationUtils.loadAnimation(context, org.telegram.messenger.R.anim.scale_out);
                        loadAnimation4.setInterpolator(cubicBezierInterpolator);
                        this.errorViewSwitcher.setOutAnimation(loadAnimation4);
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        this.openFragmentButton = linearLayout3;
                        linearLayout3.setOrientation(0);
                        this.openFragmentButton.setGravity(17);
                        this.openFragmentButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        this.openFragmentButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_changephoneinfo_image2), Theme.getColor(Theme.key_chats_actionPressedBackground)));
                        this.openFragmentButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda10
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LoginActivity.LoginActivitySmsView.this.lambda$new$6(view);
                            }
                        });
                        this.errorViewSwitcher.addView(this.openFragmentButton, LayoutHelper.createFrame(-1, 52.0f));
                        RLottieImageView rLottieImageView = new RLottieImageView(context);
                        this.openFragmentImageView = rLottieImageView;
                        rLottieImageView.setAnimation(org.telegram.messenger.R.raw.fragment, 36, 36);
                        this.openFragmentButton.addView(this.openFragmentImageView, LayoutHelper.createLinear(36, 36, 16, 0, 0, 2, 0));
                        TextView textView6 = new TextView(context);
                        this.openFragmentButtonText = textView6;
                        textView6.setText(LocaleController.getString(org.telegram.messenger.R.string.OpenFragment));
                        this.openFragmentButtonText.setTextColor(-1);
                        this.openFragmentButtonText.setTextSize(1, 15.0f);
                        this.openFragmentButtonText.setGravity(17);
                        this.openFragmentButtonText.setTypeface(AndroidUtilities.bold());
                        this.openFragmentButton.addView(this.openFragmentButtonText);
                    }
                    TextView textView7 = new TextView(context);
                    this.wrongCode = textView7;
                    textView7.setText(LocaleController.getString(org.telegram.messenger.R.string.WrongCode));
                    this.wrongCode.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.wrongCode.setTextSize(1, 15.0f);
                    this.wrongCode.setGravity(49);
                    this.wrongCode.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                    this.errorViewSwitcher.addView(this.wrongCode, LayoutHelper.createFrame(-2, -2, 17));
                    if (frameLayout != null) {
                        FrameLayout frameLayout5 = new FrameLayout(context);
                        this.bottomContainer = frameLayout5;
                        frameLayout5.addView(this.errorViewSwitcher, LayoutHelper.createFrame(this.currentType == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                        addView(this.bottomContainer, LayoutHelper.createLinear(-1, 0, 1.0f));
                    } else {
                        frameLayout.addView(this.errorViewSwitcher, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    }
                    VerticalPositionAutoAnimator.attach(this.errorViewSwitcher);
                    if (this.currentType == 15) {
                        this.problemText.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda11
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LoginActivity.LoginActivitySmsView.this.lambda$new$9(context, view);
                            }
                        });
                        return;
                    }
                    return;
                }
                this.confirmTextView.setGravity(49);
                FrameLayout frameLayout6 = new FrameLayout(context);
                addView(frameLayout6, LayoutHelper.createLinear(-2, -2, 49, 0, 16, 0, 0));
                int i5 = this.currentType;
                int i6 = i5 == 1 ? 128 : 64;
                if (i5 == 1) {
                    int i7 = org.telegram.messenger.R.raw.code_laptop;
                    float f = i6;
                    this.hintDrawable = new RLottieDrawable(i7, String.valueOf(i7), AndroidUtilities.dp(f), AndroidUtilities.dp(f), true, null);
                } else {
                    int i8 = org.telegram.messenger.R.raw.sms_incoming_info;
                    float f2 = i6;
                    this.hintDrawable = new RLottieDrawable(i8, String.valueOf(i8), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                    int i9 = org.telegram.messenger.R.raw.phone_stars_to_dots;
                    this.starsToDotsDrawable = new RLottieDrawable(i9, String.valueOf(i9), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                    int i10 = org.telegram.messenger.R.raw.phone_dots;
                    this.dotsDrawable = new RLottieDrawable(i10, String.valueOf(i10), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                    int i11 = org.telegram.messenger.R.raw.phone_dots_to_stars;
                    this.dotsToStarsDrawable = new RLottieDrawable(i11, String.valueOf(i11), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                }
                RLottieImageView rLottieImageView2 = new RLottieImageView(context);
                this.blueImageView = rLottieImageView2;
                rLottieImageView2.setAnimation(this.hintDrawable);
                if (this.currentType == 1 && !AndroidUtilities.isSmallScreen()) {
                    this.blueImageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                }
                frameLayout6.addView(this.blueImageView, LayoutHelper.createFrame(i6, i6, 51, 0.0f, 0.0f, 0.0f, (this.currentType != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
                TextView textView8 = this.titleTextView;
                if (string == null) {
                    string = LocaleController.getString(this.currentType == 1 ? org.telegram.messenger.R.string.SentAppCodeTitle : org.telegram.messenger.R.string.SentSmsCodeTitle);
                }
                textView8.setText(string);
                addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 18, 0, 0));
                int i12 = this.currentType == 15 ? 16 : 0;
                addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 49, i12, 17, i12, 0));
            }
            frameLayout = null;
            if (this.currentType != 11) {
            }
            if (this.currentType == 3) {
            }
            LoadingTextView loadingTextView4 = LoginActivity.this.new LoadingTextView(context);
            this.prevTypeTextView = loadingTextView4;
            int i42 = Theme.key_windowBackgroundWhiteValueText;
            loadingTextView4.setLinkTextColor(Theme.getColor(i42));
            this.prevTypeTextView.setTextColor(LoginActivity.this.getThemedColor(i42));
            this.prevTypeTextView.setTextSize(1, 14.0f);
            this.prevTypeTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.prevTypeTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            this.prevTypeTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivitySmsView.this.lambda$new$1(view);
                }
            });
            addView(this.prevTypeTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
            this.prevTypeTextView.setVisibility(8);
            this.problemFrame = new FrameLayout(context);
            LoadingTextView loadingTextView22 = new LoadingTextView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.3
                {
                    LoginActivity loginActivity = LoginActivity.this;
                }

                @Override // org.telegram.ui.LoginActivity.LoadingTextView
                protected boolean isResendingCode() {
                    return LoginActivitySmsView.this.isResendingCode;
                }

                @Override // org.telegram.ui.LoginActivity.LoadingTextView
                protected boolean isRippleEnabled() {
                    return getVisibility() == 0 && (LoginActivitySmsView.this.time <= 0 || LoginActivitySmsView.this.timeTimer == null);
                }
            };
            this.timeText = loadingTextView22;
            loadingTextView22.setLinkTextColor(Theme.getColor(i42));
            this.timeText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.timeText.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            this.timeText.setTextSize(1, 15.0f);
            this.timeText.setGravity(51);
            this.timeText.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivitySmsView.this.lambda$new$5(view);
                }
            });
            this.problemFrame.addView(this.timeText, LayoutHelper.createFrame(-2, -2, 49));
            this.errorViewSwitcher = new ViewSwitcher(context) { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.4
                @Override // android.widget.FrameLayout, android.view.View
                protected void onMeasure(int i52, int i62) {
                    super.onMeasure(i52, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_31));
                }
            };
            if (this.currentType == 15) {
            }
            TextView textView72 = new TextView(context);
            this.wrongCode = textView72;
            textView72.setText(LocaleController.getString(org.telegram.messenger.R.string.WrongCode));
            this.wrongCode.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.wrongCode.setTextSize(1, 15.0f);
            this.wrongCode.setGravity(49);
            this.wrongCode.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            this.errorViewSwitcher.addView(this.wrongCode, LayoutHelper.createFrame(-2, -2, 17));
            if (frameLayout != null) {
            }
            VerticalPositionAutoAnimator.attach(this.errorViewSwitcher);
            if (this.currentType == 15) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(View view) {
            onBackPressed(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$5(View view) {
            if (this.time <= 0 || this.timeTimer == null) {
                this.isResendingCode = true;
                this.timeText.invalidate();
                this.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                int i = this.nextType;
                if (i != 4 && i != 2 && i != 17 && i != 16 && i != 11 && i != 15) {
                    if (i == 3) {
                        AndroidUtilities.setWaitingForSms(false);
                        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
                        this.waitingForEvent = false;
                        destroyCodeTimer();
                        this.isResendingCode = false;
                        resendCode();
                        return;
                    }
                    return;
                }
                if (i == 4 || i == 11) {
                    this.timeText.setText(LocaleController.getString(org.telegram.messenger.R.string.Calling));
                } else {
                    this.timeText.setText(LocaleController.getString(org.telegram.messenger.R.string.SendingSms));
                }
                final Bundle bundle = new Bundle();
                bundle.putString("phone", this.phone);
                bundle.putString("ephone", this.emailPhone);
                bundle.putString("phoneFormated", this.requestPhone);
                bundle.putInt("prevType", this.currentType);
                createCodeTimer();
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.requestPhone;
                tL_auth_resendCode.phone_code_hash = this.phoneHash;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda25
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivitySmsView.this.lambda$new$4(bundle, tLObject, tL_error);
                    }
                }, 10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$4(final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda31
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.this.lambda$new$2(bundle, tLObject);
                    }
                });
            } else {
                if (tL_error == null || tL_error.text == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda32
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.this.lambda$new$3(tL_error);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(Bundle bundle, TLObject tLObject) {
            this.nextCodeParams = bundle;
            TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
            this.nextCodeAuth = tL_auth_sentCode;
            TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
            if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                this.nextType = 17;
            } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                this.nextType = 16;
            }
            LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, tL_auth_sentCode);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(TLRPC.TL_error tL_error) {
            this.lastError = tL_error.text;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$6(View view) {
            try {
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.url)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$9(final Context context, View view) {
            TLRPC.TL_auth_sentCode tL_auth_sentCode;
            Bundle bundle = this.nextCodeParams;
            if (bundle != null && (tL_auth_sentCode = this.nextCodeAuth) != null) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, tL_auth_sentCode);
                return;
            }
            if (this.nextPressed) {
                return;
            }
            LoadingTextView loadingTextView = this.timeText;
            if ((loadingTextView == null || loadingTextView.getVisibility() == 8) && !this.isResendingCode) {
                if (this.nextType != 0) {
                    if (LoginActivity.this.radialProgressView.getTag() != null) {
                        return;
                    }
                    resendCode();
                    return;
                }
                TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                tL_auth_reportMissingCode.phone_number = this.requestPhone;
                tL_auth_reportMissingCode.phone_code_hash = this.phoneHash;
                tL_auth_reportMissingCode.mnc = "";
                try {
                    String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                    if (!TextUtils.isEmpty(networkOperator)) {
                        networkOperator.substring(0, 3);
                        tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                new AlertDialog.Builder(context).setTitle(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.DidNotGetTheCodeInfo, this.phone))).setNeutralButton(LocaleController.getString(org.telegram.messenger.R.string.DidNotGetTheCodeHelpButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivitySmsView.this.lambda$new$7(context, alertDialog, i);
                    }
                }).setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.Close), null).setNegativeButton(LocaleController.getString(org.telegram.messenger.R.string.DidNotGetTheCodeEditNumberButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda24
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivitySmsView.this.lambda$new$8(alertDialog, i);
                    }
                }).show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$7(Context context, AlertDialog alertDialog, int i) {
            Object systemService;
            Object systemService2;
            SignalStrength signalStrength;
            int level;
            String str;
            SubscriptionManager from;
            String number;
            int simSlotIndex;
            int mcc;
            int mnc;
            CharSequence carrierName;
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                String format = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                StringBuilder sb = new StringBuilder();
                sb.append(this.emailPhone);
                sb.append(" Android Registration/Login Issue ");
                sb.append(format);
                sb.append(LoginActivity.this.paid ? " #paidauth" : "");
                intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
                sb2.append("Device: ");
                sb2.append(Build.MANUFACTURER);
                sb2.append(" ");
                sb2.append(Build.MODEL);
                sb2.append("\n");
                sb2.append("OS version: SDK ");
                int i2 = Build.VERSION.SDK_INT;
                sb2.append(i2);
                sb2.append("\n");
                sb2.append("Locale: ");
                sb2.append(Locale.getDefault());
                sb2.append("\n");
                sb2.append("\n");
                sb2.append("Target Phone: +");
                sb2.append(this.requestPhone);
                sb2.append("\n");
                sb2.append("\n");
                try {
                    if (i2 >= 22) {
                        from = SubscriptionManager.from(getContext());
                        List completeActiveSubscriptionInfoList = i2 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                        if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i2 >= 28) {
                            completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                        }
                        if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                            completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                        }
                        if (completeActiveSubscriptionInfoList != null) {
                            Iterator it = completeActiveSubscriptionInfoList.iterator();
                            while (it.hasNext()) {
                                SubscriptionInfo m = LoginActivity$$ExternalSyntheticApiModelOutline4.m(it.next());
                                number = m.getNumber();
                                if (!TextUtils.isEmpty(number)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("SIM");
                                    simSlotIndex = m.getSimSlotIndex();
                                    sb3.append(simSlotIndex);
                                    String sb4 = sb3.toString();
                                    sb2.append(sb4);
                                    sb2.append(".Phone: ");
                                    sb2.append(number);
                                    sb2.append("\n");
                                    sb2.append(sb4);
                                    sb2.append(".MCC: ");
                                    mcc = m.getMcc();
                                    sb2.append(mcc);
                                    sb2.append("\n");
                                    sb2.append(sb4);
                                    sb2.append(".MNC: ");
                                    mnc = m.getMnc();
                                    sb2.append(mnc);
                                    sb2.append("\n");
                                    sb2.append(sb4);
                                    sb2.append(".Carrier: ");
                                    carrierName = m.getCarrierName();
                                    sb2.append(TextUtils.isEmpty(carrierName) ? "unknown" : m.getCarrierName());
                                    sb2.append("\n\n");
                                }
                            }
                        }
                    } else {
                        try {
                            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                            if (!TextUtils.isEmpty(line1Number)) {
                                sb2.append("SIM0.Phone: ");
                                sb2.append(line1Number);
                                sb2.append("\n");
                                sb2.append("SIM0.MCC: unknown\n");
                                sb2.append("SIM0.MNC: unknown\n");
                                sb2.append("SIM0.Carrier: unknown\n\n");
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        systemService = context.getSystemService((Class<Object>) TelephonyManager.class);
                        systemService2 = context.getSystemService((Class<Object>) ConnectivityManager.class);
                        signalStrength = ((TelephonyManager) systemService).getSignalStrength();
                        if (signalStrength != null) {
                            sb2.append("Signal: ");
                            level = signalStrength.getLevel();
                            sb2.append(level);
                            sb2.append("/4\n");
                        } else {
                            sb2.append("Signal: unknown\n");
                        }
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                } else {
                    sb2.append("Signal: unknown\n");
                }
                sb2.append("Wi-Fi: ");
                sb2.append(AndroidUtilities.isWifiEnabled(context));
                sb2.append("\n");
                sb2.append("Airplane Mode: ");
                sb2.append(AndroidUtilities.isInAirplaneMode(context));
                sb2.append("\n");
                sb2.append("\n");
                sb2.append("App: ");
                sb2.append(BuildVars.APP_ID);
                sb2.append("\n");
                int i3 = packageInfo.versionCode % 10;
                if (i3 == 1 || i3 == 2) {
                    str = "store";
                } else if (ApplicationLoader.isStandaloneBuild()) {
                    str = "direct";
                } else if (ApplicationLoader.isBetaBuild()) {
                    str = "beta";
                } else if (ApplicationLoader.isHuaweiStoreBuild()) {
                    str = "huawei";
                } else {
                    str = "universal";
                }
                sb2.append("App version: ");
                sb2.append(format);
                sb2.append(" ");
                sb2.append(str);
                sb2.append("\n");
                sb2.append("\n");
                sb2.append("Issue: ");
                sb2.append(LoginActivity.this.paid ? "no_otp" : "no_otp_paid");
                sb2.append("\n");
                if (!TextUtils.isEmpty(this.lastError)) {
                    sb2.append("Error: ");
                    sb2.append(this.lastError);
                    sb2.append("\n");
                }
                sb2.append("\n\n================================================\n");
                sb2.append("WRITE YOUR COMMENT HERE:\n");
                sb2.append("\n");
                sb2.append("\n");
                intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                getContext().startActivity(Intent.createChooser(intent, "Send email..."));
            } catch (Exception unused) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.AppName), LocaleController.getString("NoMailInstalled", org.telegram.messenger.R.string.NoMailInstalled));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$8(AlertDialog alertDialog, int i) {
            LoginActivity.this.setPage(0, true, null, true);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            this.confirmTextView.setTextColor(Theme.getColor(LoginActivity.this.isInCancelAccountDeletionMode() ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_windowBackgroundWhiteGrayText6));
            this.confirmTextView.setLinkTextColor(Theme.getColor(Theme.key_chats_actionBackground));
            TextView textView = this.titleTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            if (this.currentType == 11) {
                TextView textView2 = this.missedCallDescriptionSubtitle;
                int i2 = Theme.key_windowBackgroundWhiteGrayText;
                textView2.setTextColor(Theme.getColor(i2));
                this.missedCallDescriptionSubtitle2.setTextColor(Theme.getColor(i2));
                ImageView imageView = this.missedCallArrowIcon;
                int color = Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                this.missedCallPhoneIcon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), mode));
                this.prefixTextView.setTextColor(Theme.getColor(i));
            }
            applyLottieColors(this.hintDrawable);
            applyLottieColors(this.starsToDotsDrawable);
            applyLottieColors(this.dotsDrawable);
            applyLottieColors(this.dotsToStarsDrawable);
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer != null) {
                codeFieldContainer.invalidate();
            }
            Integer num = (Integer) this.timeText.getTag();
            if (num == null) {
                num = Integer.valueOf(Theme.key_windowBackgroundWhiteGrayText6);
            }
            this.timeText.setTextColor(Theme.getColor(num.intValue()));
            if (this.currentType != 15) {
                this.problemText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            }
            this.wrongCode.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }

        private void applyLottieColors(RLottieDrawable rLottieDrawable) {
            if (rLottieDrawable != null) {
                rLottieDrawable.setLayerColor("Bubble.**", Theme.getColor(Theme.key_chats_actionBackground));
                int i = Theme.key_windowBackgroundWhiteBlackText;
                rLottieDrawable.setLayerColor("Phone.**", Theme.getColor(i));
                rLottieDrawable.setLayerColor("Note.**", Theme.getColor(i));
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean hasCustomKeyboard() {
            return this.currentType != 3;
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        private void resendCode() {
            if (this.nextPressed || this.isResendingCode || LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            this.isResendingCode = true;
            this.timeText.invalidate();
            this.problemText.invalidate();
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putInt("prevType", this.currentType);
            this.nextPressed = true;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = this.requestPhone;
            tL_auth_resendCode.phone_code_hash = this.phoneHash;
            tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda37
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivitySmsView.this.lambda$resendCode$11(bundle, tLObject, tL_error);
                }
            }, 10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$resendCode$11(final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda40
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$resendCode$10(tL_error, bundle, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$resendCode$10(TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
            this.nextPressed = false;
            if (tL_error == null) {
                this.nextCodeParams = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                this.nextCodeAuth = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    this.nextType = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    this.nextType = 16;
                }
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, tL_auth_sentCode);
            } else {
                String str = tL_error.text;
                if (str != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                }
            }
            tryHideProgress(false);
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            CodeNumberField[] codeNumberFieldArr;
            super.onConfigurationChanged(configuration);
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer == null || (codeNumberFieldArr = codeFieldContainer.codeField) == null) {
                return;
            }
            for (CodeNumberField codeNumberField : codeNumberFieldArr) {
                codeNumberField.setShowSoftInputOnFocusCompat(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
            }
        }

        private void tryShowProgress(int i) {
            lambda$tryShowProgress$12(i, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: tryShowProgress, reason: merged with bridge method [inline-methods] */
        public void lambda$tryShowProgress$12(final int i, final boolean z) {
            if (this.starsToDotsDrawable == null) {
                LoginActivity.this.needShowProgress(i, z);
                return;
            }
            if (this.isDotsAnimationVisible) {
                return;
            }
            this.isDotsAnimationVisible = true;
            if (this.hintDrawable.getCurrentFrame() != this.hintDrawable.getFramesCount() - 1) {
                this.hintDrawable.setOnAnimationEndListener(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda26
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.this.lambda$tryShowProgress$13(i, z);
                    }
                });
                return;
            }
            this.starsToDotsDrawable.setOnAnimationEndListener(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$tryShowProgress$15();
                }
            });
            this.blueImageView.setAutoRepeat(false);
            this.starsToDotsDrawable.setCurrentFrame(0, false);
            this.blueImageView.setAnimation(this.starsToDotsDrawable);
            this.blueImageView.playAnimation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$tryShowProgress$13(final int i, final boolean z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$tryShowProgress$12(i, z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$tryShowProgress$15() {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$tryShowProgress$14();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$tryShowProgress$14() {
            this.blueImageView.setAutoRepeat(true);
            this.dotsDrawable.setCurrentFrame(0, false);
            this.dotsDrawable.setAutoRepeat(1);
            this.blueImageView.setAnimation(this.dotsDrawable);
            this.blueImageView.playAnimation();
        }

        private void tryHideProgress(boolean z) {
            tryHideProgress(z, true);
        }

        private void tryHideProgress(boolean z, boolean z2) {
            if (this.starsToDotsDrawable == null) {
                LoginActivity.this.needHideProgress(z, z2);
            } else if (this.isDotsAnimationVisible) {
                this.isDotsAnimationVisible = false;
                this.blueImageView.setAutoRepeat(false);
                this.dotsDrawable.setAutoRepeat(0);
                this.dotsDrawable.setOnFinishCallback(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda20
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.this.lambda$tryHideProgress$19();
                    }
                }, this.dotsDrawable.getFramesCount() - 1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$tryHideProgress$19() {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda38
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$tryHideProgress$18();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$tryHideProgress$17() {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda50
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$tryHideProgress$16();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$tryHideProgress$18() {
            this.dotsToStarsDrawable.setOnAnimationEndListener(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda47
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$tryHideProgress$17();
                }
            });
            this.blueImageView.setAutoRepeat(false);
            this.dotsToStarsDrawable.setCurrentFrame(0, false);
            this.blueImageView.setAnimation(this.dotsToStarsDrawable);
            this.blueImageView.playAnimation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$tryHideProgress$16() {
            this.blueImageView.setAutoRepeat(false);
            this.blueImageView.setAnimation(this.hintDrawable);
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            int i = this.currentType;
            if (i == 3 || i == 11) {
                return this.phone;
            }
            return LocaleController.getString("YourCode", org.telegram.messenger.R.string.YourCode);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$21(View view, boolean z) {
            if (z) {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:179:0x0483, code lost:
        
            if (r3 == 16) goto L185;
         */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0463  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x046e  */
        @Override // org.telegram.ui.Components.SlideView
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void setParams(Bundle bundle, boolean z) {
            String str;
            int i;
            String str2;
            String string;
            int i2;
            if (bundle == null) {
                if (this.nextCodeParams == null || this.nextCodeAuth == null) {
                    return;
                }
                setProblemTextVisible(true);
                this.timeText.setVisibility(8);
                LoadingTextView loadingTextView = this.problemText;
                if (loadingTextView != null) {
                    loadingTextView.setVisibility(0);
                    this.problemText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                    int i3 = this.nextType;
                    if (i3 == 17) {
                        i2 = org.telegram.messenger.R.string.ReturnEnteringPhrase;
                    } else if (i3 == 16) {
                        i2 = org.telegram.messenger.R.string.ReturnEnteringWord;
                    } else {
                        i2 = org.telegram.messenger.R.string.ReturnEnteringSMS;
                    }
                    this.problemText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i2), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            }
            this.waitingForEvent = true;
            int i4 = this.currentType;
            if (i4 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i4 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i4 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda12
                        @Override // java.lang.Runnable
                        public final void run() {
                            CallReceiver.checkLastReceivedCall();
                        }
                    });
                }
            }
            this.currentParams = bundle;
            this.phone = bundle.getString("phone");
            this.emailPhone = bundle.getString("ephone");
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.time = bundle.getInt("timeout");
            this.openTime = (int) (System.currentTimeMillis() / 1000);
            this.nextType = bundle.getInt("nextType");
            this.pattern = bundle.getString("pattern");
            this.prefix = bundle.getString("prefix");
            this.length = bundle.getInt("length");
            this.prevType = bundle.getInt("prevType", 0);
            if (this.length == 0) {
                this.length = 5;
            }
            this.url = bundle.getString("url");
            this.nextCodeParams = null;
            this.nextCodeAuth = null;
            this.codeFieldContainer.setNumbersCount(this.length, this.currentType);
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
                codeNumberField.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.6
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                        if (LoginActivitySmsView.this.postedErrorColorTimeout) {
                            LoginActivitySmsView loginActivitySmsView = LoginActivitySmsView.this;
                            loginActivitySmsView.removeCallbacks(loginActivitySmsView.errorColorTimeout);
                            LoginActivitySmsView.this.errorColorTimeout.run();
                        }
                    }
                });
                codeNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda13
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        LoginActivity.LoginActivitySmsView.this.lambda$setParams$21(view, z2);
                    }
                });
            }
            int i5 = this.prevType;
            if (i5 == 17) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(org.telegram.messenger.R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i5 == 16) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(org.telegram.messenger.R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else {
                this.prevTypeTextView.setVisibility(8);
            }
            if (this.phone == null) {
                return;
            }
            String format = PhoneFormat.getInstance().format(this.phone);
            if (LoginActivity.this.isInCancelAccountDeletionMode()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", org.telegram.messenger.R.string.CancelAccountResetInfo2, PhoneFormat.getInstance().format("+" + format))));
                int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                str = spannableStringBuilder;
                str = spannableStringBuilder;
                str = spannableStringBuilder;
                if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                    this.confirmTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new URLSpanNoUnderline("tg://settings/change_number"), indexOf, lastIndexOf - 1, 33);
                    str = spannableStringBuilder;
                }
            } else {
                int i6 = this.currentType;
                str = i6 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentAppCodeWithPhone", org.telegram.messenger.R.string.SentAppCodeWithPhone, LocaleController.addNbsp(format))) : i6 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", org.telegram.messenger.R.string.SentSmsCode, LocaleController.addNbsp(format))) : i6 == 3 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", org.telegram.messenger.R.string.SentCallCode, LocaleController.addNbsp(format))) : i6 == 4 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", org.telegram.messenger.R.string.SentCallOnly, LocaleController.addNbsp(format))) : i6 == 15 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentFragmentCode", org.telegram.messenger.R.string.SentFragmentCode, LocaleController.addNbsp(format))) : "";
            }
            this.confirmTextView.setText(str);
            int i7 = this.currentType;
            if (i7 != 15) {
                if (i7 == 1) {
                    int i8 = this.nextType;
                    if (i8 == 3 || i8 == 4 || i8 == 11) {
                        this.problemText.setText(LocaleController.getString(org.telegram.messenger.R.string.DidNotGetTheCodePhone));
                    } else if (i8 == 15) {
                        this.problemText.setText(LocaleController.getString(org.telegram.messenger.R.string.DidNotGetTheCodeFragment));
                    } else if (i8 == 0) {
                        this.problemText.setText(LocaleController.getString(org.telegram.messenger.R.string.DidNotGetTheCode));
                    } else {
                        this.problemText.setText(LocaleController.getString(org.telegram.messenger.R.string.DidNotGetTheCodeSms));
                    }
                } else {
                    this.problemText.setText(LocaleController.getString(org.telegram.messenger.R.string.DidNotGetTheCode));
                }
            }
            if (this.currentType != 3) {
                LoginActivity.this.showKeyboard(this.codeFieldContainer.codeField[0]);
                this.codeFieldContainer.codeField[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.codeFieldContainer.codeField[0]);
            }
            destroyTimer();
            destroyCodeTimer();
            this.lastCurrentTime = System.currentTimeMillis();
            int i9 = this.currentType;
            if (i9 == 1) {
                setProblemTextVisible(true);
                this.timeText.setVisibility(8);
                LoadingTextView loadingTextView2 = this.problemText;
                if (loadingTextView2 != null) {
                    loadingTextView2.setVisibility(0);
                }
            } else if (i9 == 3) {
                int i10 = this.nextType;
                if (i10 == 4 || i10 == 2 || i10 == 17 || i10 == 16 || i10 == 11) {
                    setProblemTextVisible(false);
                    this.timeText.setVisibility(0);
                    this.problemText.setVisibility(8);
                    int i11 = this.nextType;
                    if (i11 == 4 || i11 == 11) {
                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", org.telegram.messenger.R.string.CallAvailableIn, 1, 0));
                    } else if (i11 == 2 || i11 == 17 || i11 == 16) {
                        this.timeText.setText(LocaleController.formatString("SmsAvailableIn", org.telegram.messenger.R.string.SmsAvailableIn, 1, 0));
                    }
                } else {
                    this.timeText.setVisibility(8);
                }
                String obtainLoginPhoneCall = z ? AndroidUtilities.obtainLoginPhoneCall(this.pattern) : null;
                if (obtainLoginPhoneCall != null) {
                    lambda$onNextPressed$16(obtainLoginPhoneCall);
                } else {
                    String str3 = this.catchedPhone;
                    if (str3 != null) {
                        lambda$onNextPressed$16(str3);
                    } else {
                        int i12 = this.nextType;
                        if (i12 == 4 || i12 == 2 || i12 == 17 || i12 == 16 || i12 == 11) {
                            createTimer();
                        }
                    }
                }
            } else if (i9 == 2 && ((i = this.nextType) == 2 || i == 17 || i == 16 || i == 4 || i == 3)) {
                if (i == 2 || i == 17 || i == 16) {
                    this.timeText.setText(LocaleController.formatString("SmsAvailableIn", org.telegram.messenger.R.string.SmsAvailableIn, 1, 0));
                } else {
                    this.timeText.setText(LocaleController.formatString("CallAvailableIn", org.telegram.messenger.R.string.CallAvailableIn, 2, 0));
                }
                setProblemTextVisible(this.time < 1000);
                this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                LoadingTextView loadingTextView3 = this.problemText;
                if (loadingTextView3 != null) {
                    loadingTextView3.setVisibility(this.time < 1000 ? 0 : 8);
                }
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string2 = sharedPreferences.getString("sms_hash", null);
                if (!TextUtils.isEmpty(string2) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                    if (string.contains(string2 + "|") && !LoginActivity.this.newAccount) {
                        str2 = string.substring(string.indexOf(124) + 1);
                        if (str2 == null) {
                            this.codeFieldContainer.setCode(str2);
                            lambda$onNextPressed$16(null);
                        } else {
                            createTimer();
                        }
                    }
                }
                str2 = null;
                if (str2 == null) {
                }
            } else {
                if (i9 == 4) {
                    int i13 = this.nextType;
                    int i14 = (i13 == 2 || i13 == 17 || i13 == 11) ? 16 : 16;
                    if (i13 == 2 || i13 == 17 || i13 == i14) {
                        this.timeText.setText(LocaleController.formatString("SmsAvailableIn", org.telegram.messenger.R.string.SmsAvailableIn, 1, 0));
                    } else {
                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", org.telegram.messenger.R.string.CallAvailableIn, 2, 0));
                    }
                    setProblemTextVisible(this.time < 1000);
                    this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                    LoadingTextView loadingTextView4 = this.problemText;
                    if (loadingTextView4 != null) {
                        loadingTextView4.setVisibility(this.time < 1000 ? 0 : 8);
                    }
                    createTimer();
                }
                if (i9 == 11) {
                    int i15 = this.nextType;
                    if (i15 == 4 || i15 == 2 || i15 == 17 || i15 == 16 || i15 == 11) {
                        setProblemTextVisible(false);
                        this.timeText.setVisibility(0);
                        this.problemText.setVisibility(8);
                        int i16 = this.nextType;
                        if (i16 == 4 || i16 == 11) {
                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", org.telegram.messenger.R.string.CallAvailableIn, 1, 0));
                        } else if (i16 == 2 || i16 == 17 || i16 == 16) {
                            this.timeText.setText(LocaleController.formatString("SmsAvailableIn", org.telegram.messenger.R.string.SmsAvailableIn, 1, 0));
                        }
                        createTimer();
                    }
                } else {
                    this.timeText.setVisibility(8);
                    LoadingTextView loadingTextView5 = this.problemText;
                    if (loadingTextView5 != null) {
                        loadingTextView5.setVisibility(0);
                    }
                    setProblemTextVisible(false);
                    createCodeTimer();
                }
            }
            if (this.currentType == 11) {
                String str4 = this.prefix;
                for (int i17 = 0; i17 < this.length; i17++) {
                    str4 = str4 + "0";
                }
                String format2 = PhoneFormat.getInstance().format("+" + str4);
                for (int i18 = 0; i18 < this.length; i18++) {
                    int lastIndexOf2 = format2.lastIndexOf("0");
                    if (lastIndexOf2 >= 0) {
                        format2 = format2.substring(0, lastIndexOf2);
                    }
                }
                this.prefixTextView.setText(format2.replaceAll("\\)", "").replaceAll("\\(", ""));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProblemTextVisible(boolean z) {
            LoadingTextView loadingTextView = this.problemText;
            if (loadingTextView == null) {
                return;
            }
            float f = z ? 1.0f : 0.0f;
            if (loadingTextView.getAlpha() != f) {
                this.problemText.animate().cancel();
                this.problemText.animate().alpha(f).setDuration(150L).start();
            }
        }

        private void createCodeTimer() {
            if (this.codeTimer != null) {
                return;
            }
            this.codeTime = 15000;
            int i = this.time;
            if (i > 15000) {
                this.codeTime = i;
            }
            this.codeTimer = new Timer();
            this.lastCodeTime = System.currentTimeMillis();
            this.codeTimer.schedule(new 7(), 0L, 1000L);
        }

        class 7 extends TimerTask {
            7() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$7$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.7.this.lambda$run$0();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0() {
                double currentTimeMillis = System.currentTimeMillis();
                double d = currentTimeMillis - LoginActivitySmsView.this.lastCodeTime;
                LoginActivitySmsView.this.lastCodeTime = currentTimeMillis;
                LoginActivitySmsView.access$9626(LoginActivitySmsView.this, d);
                if (LoginActivitySmsView.this.codeTime <= 1000) {
                    LoginActivitySmsView.this.setProblemTextVisible(true);
                    LoginActivitySmsView.this.timeText.setVisibility(8);
                    if (LoginActivitySmsView.this.problemText != null) {
                        LoginActivitySmsView.this.problemText.setVisibility(0);
                    }
                    LoginActivitySmsView.this.destroyCodeTimer();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void destroyCodeTimer() {
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.codeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.codeTimer = null;
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        private void createTimer() {
            if (this.timeTimer != null) {
                return;
            }
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            loadingTextView.setTextColor(Theme.getColor(i));
            this.timeText.setTag(org.telegram.messenger.R.id.color_key_tag, Integer.valueOf(i));
            Timer timer = new Timer();
            this.timeTimer = timer;
            timer.schedule(new 8(), 0L, 1000L);
        }

        class 8 extends TimerTask {
            8() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (LoginActivitySmsView.this.timeTimer == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$8$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.8.this.lambda$run$0();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0() {
                double currentTimeMillis = System.currentTimeMillis();
                double d = currentTimeMillis - LoginActivitySmsView.this.lastCurrentTime;
                LoginActivitySmsView.this.lastCurrentTime = currentTimeMillis;
                LoginActivitySmsView.access$8626(LoginActivitySmsView.this, d);
                if (LoginActivitySmsView.this.time >= 1000) {
                    int i = (LoginActivitySmsView.this.time / MediaDataController.MAX_STYLE_RUNS_COUNT) / 60;
                    int i2 = (LoginActivitySmsView.this.time / MediaDataController.MAX_STYLE_RUNS_COUNT) - (i * 60);
                    if (LoginActivitySmsView.this.nextType == 4 || LoginActivitySmsView.this.nextType == 3 || LoginActivitySmsView.this.nextType == 11) {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("CallAvailableIn", org.telegram.messenger.R.string.CallAvailableIn, Integer.valueOf(i), Integer.valueOf(i2)));
                    } else if (LoginActivitySmsView.this.currentType != 2 || (LoginActivitySmsView.this.nextType != 2 && LoginActivitySmsView.this.nextType != 17 && LoginActivitySmsView.this.nextType != 16)) {
                        if (LoginActivitySmsView.this.nextType == 2 || LoginActivitySmsView.this.nextType == 17 || LoginActivitySmsView.this.nextType == 16) {
                            LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("SmsAvailableIn", org.telegram.messenger.R.string.SmsAvailableIn, Integer.valueOf(i), Integer.valueOf(i2)));
                        }
                    } else {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("ResendSmsAvailableIn", org.telegram.messenger.R.string.ResendSmsAvailableIn, Integer.valueOf(i), Integer.valueOf(i2)));
                    }
                    LoginActivitySmsView.access$10300(LoginActivitySmsView.this);
                    return;
                }
                LoginActivitySmsView.this.destroyTimer();
                if (LoginActivitySmsView.this.nextType == 3 || LoginActivitySmsView.this.nextType == 4 || LoginActivitySmsView.this.nextType == 2 || LoginActivitySmsView.this.nextType == 17 || LoginActivitySmsView.this.nextType == 16 || LoginActivitySmsView.this.nextType == 11) {
                    if (LoginActivitySmsView.this.nextType == 4) {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.getString("RequestCallButton", org.telegram.messenger.R.string.RequestCallButton));
                    } else if (LoginActivitySmsView.this.nextType == 11 || LoginActivitySmsView.this.nextType == 3) {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.getString(org.telegram.messenger.R.string.RequestMissedCall));
                    } else {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.getString("RequestSmsButton", org.telegram.messenger.R.string.RequestSmsButton));
                    }
                    LoadingTextView loadingTextView = LoginActivitySmsView.this.timeText;
                    int i3 = Theme.key_chats_actionBackground;
                    loadingTextView.setTextColor(Theme.getColor(i3));
                    LoginActivitySmsView.this.timeText.setTag(org.telegram.messenger.R.id.color_key_tag, Integer.valueOf(i3));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void destroyTimer() {
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            loadingTextView.setTextColor(Theme.getColor(i));
            this.timeText.setTag(org.telegram.messenger.R.id.color_key_tag, Integer.valueOf(i));
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.timeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.timeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        /* renamed from: onNextPressed */
        public void lambda$onNextPressed$16(String str) {
            if (LoginActivity.this.currentViewNum == 11) {
                if (this.nextPressed) {
                    return;
                }
            } else {
                if (this.nextPressed) {
                    return;
                }
                if ((LoginActivity.this.currentViewNum < 1 || LoginActivity.this.currentViewNum > 4) && LoginActivity.this.currentViewNum != 15) {
                    return;
                }
            }
            if (str == null) {
                str = this.codeFieldContainer.getCode();
            }
            int i = 0;
            if (TextUtils.isEmpty(str)) {
                LoginActivity.this.onFieldError(this.codeFieldContainer, false);
                return;
            }
            if (LoginActivity.this.currentViewNum < 1 || LoginActivity.this.currentViewNum > 4 || !this.codeFieldContainer.isFocusSuppressed) {
                this.nextPressed = true;
                int i2 = this.currentType;
                if (i2 == 15) {
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
                } else if (i2 == 2) {
                    AndroidUtilities.setWaitingForSms(false);
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
                } else if (i2 == 3) {
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
                }
                this.waitingForEvent = false;
                int i3 = LoginActivity.this.activityMode;
                if (i3 == 1) {
                    this.requestPhone = LoginActivity.this.cancelDeletionPhone;
                    final TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                    confirmphone.phone_code = str;
                    confirmphone.phone_code_hash = this.phoneHash;
                    destroyTimer();
                    CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                    codeFieldContainer.isFocusSuppressed = true;
                    CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                    int length = codeNumberFieldArr.length;
                    while (i < length) {
                        codeNumberFieldArr[i].animateFocusedProgress(0.0f);
                        i++;
                    }
                    tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(confirmphone, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda16
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$29(confirmphone, tLObject, tL_error);
                        }
                    }, 2));
                    return;
                }
                if (i3 == 2) {
                    TL_account.changePhone changephone = new TL_account.changePhone();
                    changephone.phone_number = this.requestPhone;
                    changephone.phone_code = str;
                    changephone.phone_code_hash = this.phoneHash;
                    destroyTimer();
                    CodeFieldContainer codeFieldContainer2 = this.codeFieldContainer;
                    codeFieldContainer2.isFocusSuppressed = true;
                    CodeNumberField[] codeNumberFieldArr2 = codeFieldContainer2.codeField;
                    int length2 = codeNumberFieldArr2.length;
                    while (i < length2) {
                        codeNumberFieldArr2[i].animateFocusedProgress(0.0f);
                        i++;
                    }
                    lambda$tryShowProgress$12(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(changephone, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda15
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$25(tLObject, tL_error);
                        }
                    }, 2), true);
                    LoginActivity.this.showDoneButton(true, true);
                    return;
                }
                final TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                tL_auth_signIn.phone_number = this.requestPhone;
                tL_auth_signIn.phone_code = str;
                tL_auth_signIn.phone_code_hash = this.phoneHash;
                tL_auth_signIn.flags |= 1;
                destroyTimer();
                CodeFieldContainer codeFieldContainer3 = this.codeFieldContainer;
                codeFieldContainer3.isFocusSuppressed = true;
                CodeNumberField[] codeNumberFieldArr3 = codeFieldContainer3.codeField;
                int length3 = codeNumberFieldArr3.length;
                while (i < length3) {
                    codeNumberFieldArr3[i].animateFocusedProgress(0.0f);
                    i++;
                }
                lambda$tryShowProgress$12(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_signIn, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda14
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$37(tL_auth_signIn, tLObject, tL_error);
                    }
                }, 10), true);
                LoginActivity.this.showDoneButton(true, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$25(final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$24(tL_error, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$24(TLRPC.TL_error tL_error, TLObject tLObject) {
            int i;
            int i2;
            int i3;
            tryHideProgress(false, true);
            this.nextPressed = false;
            if (tL_error == null) {
                TLRPC.User user = (TLRPC.User) tLObject;
                destroyTimer();
                destroyCodeTimer();
                UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).setCurrentUser(user);
                UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).saveConfig(true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                MessagesStorage.getInstance(((BaseFragment) LoginActivity.this).currentAccount).putUsersAndChats(arrayList, null, true, true);
                MessagesController.getInstance(((BaseFragment) LoginActivity.this).currentAccount).putUser(user, false);
                NotificationCenter.getInstance(((BaseFragment) LoginActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                LoginActivity.this.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                if (this.currentType == 3) {
                    AndroidUtilities.endIncomingCall();
                }
                animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda30
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$23();
                    }
                });
                return;
            }
            this.lastError = tL_error.text;
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            int i4 = this.currentType;
            if ((i4 == 3 && ((i3 = this.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = this.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = this.nextType) == 2 || i == 17 || i == 16)))) {
                createTimer();
            }
            int i5 = this.currentType;
            if (i5 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = true;
            if (this.currentType == 3) {
                return;
            }
            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", org.telegram.messenger.R.string.InvalidPhoneNumber));
            } else {
                if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    shakeWrongCode();
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", org.telegram.messenger.R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", org.telegram.messenger.R.string.FloodWait));
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", org.telegram.messenger.R.string.ErrorOccurred) + "\n" + tL_error.text);
                }
            }
            int i6 = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                if (i6 < codeNumberFieldArr.length) {
                    codeNumberFieldArr[i6].setText("");
                    i6++;
                } else {
                    codeFieldContainer.isFocusSuppressed = false;
                    codeNumberFieldArr[0].requestFocus();
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$23() {
            try {
                LoginActivity.this.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(org.telegram.messenger.R.string.YourPasswordSuccess)).setMessage(LocaleController.formatString(org.telegram.messenger.R.string.ChangePhoneNumberSuccessWithPhone, PhoneFormat.getInstance().format("+" + this.requestPhone))).setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda46
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$22(dialogInterface);
                }
            }).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$22(DialogInterface dialogInterface) {
            LoginActivity.this.lambda$onBackPressed$340();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$29(final TL_account.confirmPhone confirmphone, TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$28(tL_error, confirmphone);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$28(TLRPC.TL_error tL_error, TL_account.confirmPhone confirmphone) {
            int i;
            int i2;
            int i3;
            tryHideProgress(false);
            this.nextPressed = false;
            if (tL_error == null) {
                final Activity parentActivity = LoginActivity.this.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$27(parentActivity);
                    }
                });
                return;
            }
            this.lastError = tL_error.text;
            int i4 = this.currentType;
            if ((i4 == 3 && ((i3 = this.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = this.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = this.nextType) == 2 || i == 17 || i == 16)))) {
                createTimer();
            }
            int i5 = this.currentType;
            if (i5 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = true;
            if (this.currentType != 3) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, confirmphone, new Object[0]);
            }
            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                shakeWrongCode();
            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$27(Activity activity) {
            new AlertDialog.Builder(activity).setTitle(LocaleController.getString(org.telegram.messenger.R.string.CancelLinkSuccessTitle)).setMessage(LocaleController.formatString("CancelLinkSuccess", org.telegram.messenger.R.string.CancelLinkSuccess, PhoneFormat.getInstance().format("+" + this.phone))).setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.Close), null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda43
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$26(dialogInterface);
                }
            }).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$26(DialogInterface dialogInterface) {
            LoginActivity.this.lambda$onBackPressed$340();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$37(final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$36(tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$36(TLRPC.TL_error tL_error, final TLObject tLObject, final TLRPC.TL_auth_signIn tL_auth_signIn) {
            int i;
            int i2;
            int i3;
            tryHideProgress(false, true);
            if (tL_error == null) {
                this.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                destroyTimer();
                destroyCodeTimer();
                if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    final Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", this.requestPhone);
                    bundle.putString("phoneHash", this.phoneHash);
                    bundle.putString("code", tL_auth_signIn.phone_code);
                    animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda33
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$30(bundle);
                        }
                    });
                } else {
                    animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda34
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$31(tLObject);
                        }
                    });
                }
            } else {
                String str = tL_error.text;
                this.lastError = str;
                if (str.contains("SESSION_PASSWORD_NEEDED")) {
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$34(tL_auth_signIn, tLObject2, tL_error2);
                        }
                    }, 10);
                    destroyTimer();
                    destroyCodeTimer();
                } else {
                    this.nextPressed = false;
                    LoginActivity.this.showDoneButton(false, true);
                    int i4 = this.currentType;
                    if ((i4 == 3 && ((i3 = this.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = this.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = this.nextType) == 2 || i == 17 || i == 16)))) {
                        createTimer();
                    }
                    int i5 = this.currentType;
                    if (i5 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
                    } else if (i5 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
                    } else if (i5 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda36
                            @Override // java.lang.Runnable
                            public final void run() {
                                CallReceiver.checkLastReceivedCall();
                            }
                        });
                    }
                    this.waitingForEvent = true;
                    if (this.currentType == 3) {
                        return;
                    }
                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", org.telegram.messenger.R.string.InvalidPhoneNumber));
                    } else {
                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            shakeWrongCode();
                            return;
                        }
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            onBackPressed(true);
                            LoginActivity.this.setPage(0, true, null, true);
                            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", org.telegram.messenger.R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", org.telegram.messenger.R.string.FloodWait));
                        } else {
                            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", org.telegram.messenger.R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    }
                    int i6 = 0;
                    while (true) {
                        CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                        CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                        if (i6 < codeNumberFieldArr.length) {
                            codeNumberFieldArr[i6].setText("");
                            i6++;
                        } else {
                            codeFieldContainer.isFocusSuppressed = false;
                            codeNumberFieldArr[0].requestFocus();
                            return;
                        }
                    }
                }
            }
            if (this.currentType == 3) {
                AndroidUtilities.endIncomingCall();
                AndroidUtilities.setWaitingForCall(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$30(Bundle bundle) {
            LoginActivity.this.setPage(5, true, bundle, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$31(TLObject tLObject) {
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$34(final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$33(tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$33(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", org.telegram.messenger.R.string.UpdateAppAlert), true);
                return;
            }
            final Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("code", tL_auth_signIn.phone_code);
            animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda48
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$onNextPressed$32(bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$32(Bundle bundle) {
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        private void animateSuccess(final Runnable runnable) {
            if (this.currentType == 3) {
                runnable.run();
                return;
            }
            final int i = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (i < codeFieldContainer.codeField.length) {
                    codeFieldContainer.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda44
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivitySmsView.this.lambda$animateSuccess$38(i);
                        }
                    }, i * 75);
                    i++;
                } else {
                    codeFieldContainer.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda45
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivitySmsView.this.lambda$animateSuccess$39(runnable);
                        }
                    }, (this.codeFieldContainer.codeField.length * 75) + 400);
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateSuccess$38(int i) {
            this.codeFieldContainer.codeField[i].animateSuccessProgress(1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateSuccess$39(Runnable runnable) {
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i < codeNumberFieldArr.length) {
                    codeNumberFieldArr[i].animateSuccessProgress(0.0f);
                    i++;
                } else {
                    runnable.run();
                    this.codeFieldContainer.isFocusSuppressed = false;
                    return;
                }
            }
        }

        private void shakeWrongCode() {
            try {
                this.codeFieldContainer.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].setText("");
                this.codeFieldContainer.codeField[i].animateErrorProgress(1.0f);
                i++;
            }
            if (this.errorViewSwitcher.getCurrentView() != this.wrongCode) {
                this.errorViewSwitcher.showNext();
            }
            this.codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, this.currentType == 11 ? 3.5f : 10.0f, new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda42
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$shakeWrongCode$41();
                }
            });
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 5000L);
            this.postedErrorColorTimeout = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shakeWrongCode$41() {
            postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda49
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$shakeWrongCode$40();
                }
            }, 150L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shakeWrongCode$40() {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean onBackPressed(boolean z) {
            if (LoginActivity.this.activityMode != 0) {
                LoginActivity.this.lambda$onBackPressed$340();
                return false;
            }
            int i = this.prevType;
            if (i != 0) {
                LoginActivity.this.setPage(i, true, null, true);
                return false;
            }
            if (!z) {
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.showDialog(new AlertDialog.Builder(loginActivity.getParentActivity()).setTitle(LocaleController.getString(org.telegram.messenger.R.string.EditNumber)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", org.telegram.messenger.R.string.EditNumberInfo, this.phone))).setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.Close), null).setNegativeButton(LocaleController.getString(org.telegram.messenger.R.string.Edit), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda17
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        LoginActivity.LoginActivitySmsView.this.lambda$onBackPressed$42(alertDialog, i2);
                    }
                }).create());
                return false;
            }
            this.nextPressed = false;
            tryHideProgress(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.requestPhone;
            tL_auth_cancelCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_cancelCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda18
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivitySmsView.lambda$onBackPressed$43(tLObject, tL_error);
                }
            }, 10);
            destroyTimer();
            destroyCodeTimer();
            this.currentParams = null;
            int i2 = this.currentType;
            if (i2 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i2 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i2 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBackPressed$42(AlertDialog alertDialog, int i) {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onDestroyActivity() {
            super.onDestroyActivity();
            int i = this.currentType;
            if (i == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            destroyTimer();
            destroyCodeTimer();
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            RLottieDrawable rLottieDrawable = this.hintDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setCurrentFrame(0);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.lambda$onShow$44();
                }
            }, LoginActivity.SHOW_DELAY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShow$44() {
            CodeNumberField[] codeNumberFieldArr;
            if (this.currentType != 3 && (codeNumberFieldArr = this.codeFieldContainer.codeField) != null) {
                for (int length = codeNumberFieldArr.length - 1; length >= 0; length--) {
                    if (length == 0 || this.codeFieldContainer.codeField[length].length() != 0) {
                        this.codeFieldContainer.codeField[length].requestFocus();
                        CodeNumberField codeNumberField = this.codeFieldContainer.codeField[length];
                        codeNumberField.setSelection(codeNumberField.length());
                        LoginActivity.this.showKeyboard(this.codeFieldContainer.codeField[length]);
                        break;
                    }
                }
            }
            RLottieDrawable rLottieDrawable = this.hintDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.start();
            }
            if (this.currentType == 15) {
                this.openFragmentImageView.getAnimatedDrawable().setCurrentFrame(0, false);
                this.openFragmentImageView.getAnimatedDrawable().start();
            }
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (this.waitingForEvent) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (codeFieldContainer.codeField == null) {
                    return;
                }
                if (i == NotificationCenter.didReceiveSmsCode) {
                    codeFieldContainer.setText("" + objArr[0]);
                    lambda$onNextPressed$16(null);
                    return;
                }
                if (i == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.pattern, str)) {
                        if (!this.pattern.equals("*")) {
                            this.catchedPhone = str;
                            AndroidUtilities.endIncomingCall();
                        }
                        lambda$onNextPressed$16(str);
                        CallReceiver.clearLastCall();
                    }
                }
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onHide() {
            Bundle bundle;
            super.onHide();
            this.isResendingCode = false;
            this.nextPressed = false;
            if (this.prevType == 0 || (bundle = this.currentParams) == null) {
                return;
            }
            bundle.putInt("timeout", this.time);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            String code = this.codeFieldContainer.getCode();
            if (code.length() != 0) {
                bundle.putString("smsview_code_" + this.currentType, code);
            }
            String str = this.catchedPhone;
            if (str != null) {
                bundle.putString("catchedPhone", str);
            }
            if (this.currentParams != null) {
                bundle.putBundle("smsview_params_" + this.currentType, this.currentParams);
            }
            int i = this.time;
            if (i != 0) {
                bundle.putInt("time", i);
            }
            int i2 = this.openTime;
            if (i2 != 0) {
                bundle.putInt("open", i2);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("smsview_params_" + this.currentType);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("catchedPhone");
            if (string != null) {
                this.catchedPhone = string;
            }
            String string2 = bundle.getString("smsview_code_" + this.currentType);
            if (string2 != null) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (codeFieldContainer.codeField != null) {
                    codeFieldContainer.setText(string2);
                }
            }
            int i = bundle.getInt("time");
            if (i != 0) {
                this.time = i;
            }
            int i2 = bundle.getInt("open");
            if (i2 != 0) {
                this.openTime = i2;
            }
        }
    }

    public class LoadingTextView extends TextView {
        public final LoadingDrawable loadingDrawable;
        private final Drawable rippleDrawable;

        protected boolean isResendingCode() {
            return false;
        }

        protected boolean isRippleEnabled() {
            return true;
        }

        public LoadingTextView(Context context) {
            super(context);
            Drawable createSelectorDrawable = Theme.createSelectorDrawable(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteValueText), 0.1f), 7);
            this.rippleDrawable = createSelectorDrawable;
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            this.loadingDrawable = loadingDrawable;
            createSelectorDrawable.setCallback(this);
            loadingDrawable.setAppearByGradient(true);
            loadingDrawable.setSpeed(0.8f);
        }

        @Override // android.widget.TextView
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            updateLoadingLayout();
        }

        @Override // android.widget.TextView, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            updateLoadingLayout();
        }

        private void updateLoadingLayout() {
            CharSequence text;
            Layout layout = getLayout();
            if (layout == null || (text = layout.getText()) == null) {
                return;
            }
            LinkPath linkPath = new LinkPath(true);
            linkPath.setInset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
            int length = text.length();
            linkPath.setCurrentLayout(layout, 0, 0.0f);
            layout.getSelectionPath(0, length, linkPath);
            RectF rectF = AndroidUtilities.rectTmp;
            linkPath.getBounds(rectF);
            this.rippleDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.loadingDrawable.usePath(linkPath);
            this.loadingDrawable.setRadiiDp(4.0f);
            int themedColor = LoginActivity.this.getThemedColor(Theme.key_chat_linkSelectBackground);
            this.loadingDrawable.setColors(Theme.multAlpha(themedColor, 0.85f), Theme.multAlpha(themedColor, 2.0f), Theme.multAlpha(themedColor, 3.5f), Theme.multAlpha(themedColor, 6.0f));
            this.loadingDrawable.updateBounds();
        }

        @Override // android.widget.TextView, android.view.View
        protected void onDraw(Canvas canvas) {
            canvas.save();
            float paddingTop = ((getGravity() & 16) == 0 || getLayout() == null) ? getPaddingTop() : getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f);
            canvas.translate(getPaddingLeft(), paddingTop);
            this.rippleDrawable.draw(canvas);
            canvas.restore();
            super.onDraw(canvas);
            if (isResendingCode() || this.loadingDrawable.isDisappearing()) {
                canvas.save();
                canvas.translate(getPaddingLeft(), paddingTop);
                this.loadingDrawable.draw(canvas);
                canvas.restore();
                invalidate();
            }
        }

        @Override // android.widget.TextView, android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.rippleDrawable || super.verifyDrawable(drawable);
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (isRippleEnabled() && motionEvent.getAction() == 0) {
                this.rippleDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.rippleDrawable.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
                this.rippleDrawable.setState(new int[0]);
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public class LoginActivityPasswordView extends SlideView {
        private TextView cancelButton;
        private EditTextBoldCursor codeField;
        private TextView confirmTextView;
        private Bundle currentParams;
        private TL_account.Password currentPassword;
        private RLottieImageView lockImageView;
        private boolean nextPressed;
        private OutlineTextContainerView outlineCodeField;
        private String passwordString;
        private String phoneCode;
        private String phoneHash;
        private String requestPhone;
        private TextView titleView;

        @Override // org.telegram.ui.Components.SlideView
        public boolean needBackButton() {
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0142  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LoginActivityPasswordView(final Context context) {
            super(context);
            int i;
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockImageView = rLottieImageView;
            rLottieImageView.setAnimation(org.telegram.messenger.R.raw.tsv_setup_intro, 120, 120);
            this.lockImageView.setAutoRepeat(false);
            frameLayout.addView(this.lockImageView, LayoutHelper.createFrame(120, 120, 1));
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                    frameLayout.setVisibility(i);
                    addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
                    TextView textView = new TextView(context);
                    this.titleView = textView;
                    textView.setTextSize(1, 18.0f);
                    this.titleView.setTypeface(AndroidUtilities.bold());
                    this.titleView.setText(LocaleController.getString(org.telegram.messenger.R.string.YourPasswordHeader));
                    this.titleView.setGravity(17);
                    this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    this.confirmTextView = textView2;
                    textView2.setTextSize(1, 14.0f);
                    this.confirmTextView.setGravity(1);
                    this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.confirmTextView.setText(LocaleController.getString(org.telegram.messenger.R.string.LoginPasswordTextShort));
                    addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
                    OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                    this.outlineCodeField = outlineTextContainerView;
                    outlineTextContainerView.setText(LocaleController.getString(org.telegram.messenger.R.string.EnterPassword));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.codeField = editTextBoldCursor;
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.codeField.setCursorWidth(1.5f);
                    this.codeField.setBackground(null);
                    this.codeField.setImeOptions(268435461);
                    this.codeField.setTextSize(1, 18.0f);
                    this.codeField.setMaxLines(1);
                    int dp = AndroidUtilities.dp(16.0f);
                    this.codeField.setPadding(dp, dp, dp, dp);
                    this.codeField.setInputType(NotificationCenter.dialogIsTranslatable);
                    this.codeField.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.codeField.setTypeface(Typeface.DEFAULT);
                    this.codeField.setGravity(!LocaleController.isRTL ? 5 : 3);
                    this.codeField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            LoginActivity.LoginActivityPasswordView.this.lambda$new$0(view, z);
                        }
                    });
                    this.outlineCodeField.attachEditText(this.codeField);
                    this.outlineCodeField.addView(this.codeField, LayoutHelper.createFrame(-1, -2, 48));
                    this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda2
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                            boolean lambda$new$1;
                            lambda$new$1 = LoginActivity.LoginActivityPasswordView.this.lambda$new$1(textView3, i2, keyEvent);
                            return lambda$new$1;
                        }
                    });
                    addView(this.outlineCodeField, LayoutHelper.createLinear(-1, -2, 1, 16, 32, 16, 0));
                    TextView textView3 = new TextView(context);
                    this.cancelButton = textView3;
                    textView3.setGravity(19);
                    this.cancelButton.setText(LocaleController.getString(org.telegram.messenger.R.string.ForgotPassword));
                    this.cancelButton.setTextSize(1, 15.0f);
                    this.cancelButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.cancelButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.addView(this.cancelButton, LayoutHelper.createFrame(-1, 56, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout2, LayoutHelper.createLinear(-1, -1, 80));
                    VerticalPositionAutoAnimator.attach(this.cancelButton);
                    this.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityPasswordView.this.lambda$new$6(context, view);
                        }
                    });
                }
            }
            i = 8;
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView4 = new TextView(context);
            this.titleView = textView4;
            textView4.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(org.telegram.messenger.R.string.YourPasswordHeader));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView22 = new TextView(context);
            this.confirmTextView = textView22;
            textView22.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(1);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.confirmTextView.setText(LocaleController.getString(org.telegram.messenger.R.string.LoginPasswordTextShort));
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.outlineCodeField = outlineTextContainerView2;
            outlineTextContainerView2.setText(LocaleController.getString(org.telegram.messenger.R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.codeField = editTextBoldCursor2;
            editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
            this.codeField.setCursorWidth(1.5f);
            this.codeField.setBackground(null);
            this.codeField.setImeOptions(268435461);
            this.codeField.setTextSize(1, 18.0f);
            this.codeField.setMaxLines(1);
            int dp2 = AndroidUtilities.dp(16.0f);
            this.codeField.setPadding(dp2, dp2, dp2, dp2);
            this.codeField.setInputType(NotificationCenter.dialogIsTranslatable);
            this.codeField.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.codeField.setTypeface(Typeface.DEFAULT);
            this.codeField.setGravity(!LocaleController.isRTL ? 5 : 3);
            this.codeField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    LoginActivity.LoginActivityPasswordView.this.lambda$new$0(view, z);
                }
            });
            this.outlineCodeField.attachEditText(this.codeField);
            this.outlineCodeField.addView(this.codeField, LayoutHelper.createFrame(-1, -2, 48));
            this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda2
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView32, int i2, KeyEvent keyEvent) {
                    boolean lambda$new$1;
                    lambda$new$1 = LoginActivity.LoginActivityPasswordView.this.lambda$new$1(textView32, i2, keyEvent);
                    return lambda$new$1;
                }
            });
            addView(this.outlineCodeField, LayoutHelper.createLinear(-1, -2, 1, 16, 32, 16, 0));
            TextView textView32 = new TextView(context);
            this.cancelButton = textView32;
            textView32.setGravity(19);
            this.cancelButton.setText(LocaleController.getString(org.telegram.messenger.R.string.ForgotPassword));
            this.cancelButton.setTextSize(1, 15.0f);
            this.cancelButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.cancelButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            FrameLayout frameLayout22 = new FrameLayout(context);
            frameLayout22.addView(this.cancelButton, LayoutHelper.createFrame(-1, 56, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout22, LayoutHelper.createLinear(-1, -1, 80));
            VerticalPositionAutoAnimator.attach(this.cancelButton);
            this.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityPasswordView.this.lambda$new$6(context, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view, boolean z) {
            this.outlineCodeField.animateSelection(z ? 1.0f : 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$6(Context context, View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            if (this.currentPassword.has_recovery) {
                LoginActivity.this.needShowProgress(0);
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivityPasswordView.this.lambda$new$4(tLObject, tL_error);
                    }
                }, 10);
            } else {
                AndroidUtilities.hideKeyboard(this.codeField);
                new AlertDialog.Builder(context).setTitle(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailText)).setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.Close), null).setNegativeButton(LocaleController.getString(org.telegram.messenger.R.string.ResetAccount), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda6
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivityPasswordView.this.lambda$new$5(alertDialog, i);
                    }
                }).show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$4(final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.this.lambda$new$3(tL_error, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(TLRPC.TL_error tL_error, TLObject tLObject) {
            String formatPluralString;
            LoginActivity.this.needHideProgress(false);
            if (tL_error == null) {
                final TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject;
                if (LoginActivity.this.getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                String str = tL_auth_passwordRecovery.email_pattern;
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = indexOf;
                    int i = lastIndexOf + 1;
                    textStyleRun.end = i;
                    valueOf.setSpan(new TextStyleSpan(textStyleRun), indexOf, i, 0);
                }
                builder.setMessage(AndroidUtilities.formatSpannable(LocaleController.getString(org.telegram.messenger.R.string.RestoreEmailSent), valueOf));
                builder.setTitle(LocaleController.getString("RestoreEmailSentTitle", org.telegram.messenger.R.string.RestoreEmailSentTitle));
                builder.setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.Continue), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda10
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        LoginActivity.LoginActivityPasswordView.this.lambda$new$2(tL_auth_passwordRecovery, alertDialog, i2);
                    }
                });
                Dialog showDialog = LoginActivity.this.showDialog(builder.create());
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            }
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", org.telegram.messenger.R.string.FloodWaitTime, formatPluralString));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery, AlertDialog alertDialog, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("email_unconfirmed_pattern", tL_auth_passwordRecovery.email_pattern);
            bundle.putString("password", this.passwordString);
            bundle.putString("requestPhone", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("phoneCode", this.phoneCode);
            LoginActivity.this.setPage(7, true, bundle, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$5(AlertDialog alertDialog, int i) {
            LoginActivity.this.tryResetAccount(this.requestPhone, this.phoneHash, this.phoneCode);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            this.confirmTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.codeField.setTextColor(Theme.getColor(i));
            this.codeField.setCursorColor(Theme.getColor(i));
            this.codeField.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
            this.cancelButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.outlineCodeField.updateColor();
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("LoginPassword", org.telegram.messenger.R.string.LoginPassword);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            if (bundle.isEmpty()) {
                AndroidUtilities.hideKeyboard(this.codeField);
                return;
            }
            this.codeField.setText("");
            this.currentParams = bundle;
            String string = bundle.getString("password");
            this.passwordString = string;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                this.currentPassword = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            }
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.phoneCode = bundle.getString("code");
            TL_account.Password password = this.currentPassword;
            if (password != null && !TextUtils.isEmpty(password.hint)) {
                this.codeField.setHint(this.currentPassword.hint);
            } else {
                this.codeField.setHint((CharSequence) null);
            }
        }

        private void onPasscodeError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            if (z) {
                this.codeField.setText("");
            }
            LoginActivity.this.onFieldError(this.outlineCodeField, true);
        }

        @Override // org.telegram.ui.Components.SlideView
        /* renamed from: onNextPressed */
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed || this.currentPassword == null) {
                return;
            }
            final String obj = this.codeField.getText().toString();
            if (obj.length() == 0) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.this.lambda$onNextPressed$12(obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$12(String str) {
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.current_algo;
            boolean z = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
            byte[] x = z ? SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda7
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityPasswordView.this.lambda$onNextPressed$11(tLObject, tL_error);
                }
            };
            if (z) {
                TL_account.Password password = this.currentPassword;
                TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (startCheck == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "PASSWORD_HASH_INVALID";
                    requestDelegate.run(null, tL_error);
                } else {
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_checkPassword, requestDelegate, 10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$11(final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.this.lambda$onNextPressed$10(tL_error, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$10(TLRPC.TL_error tL_error, final TLObject tLObject) {
            String formatPluralString;
            this.nextPressed = false;
            if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda11
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        LoginActivity.LoginActivityPasswordView.this.lambda$onNextPressed$8(tLObject2, tL_error2);
                    }
                }, 8);
                return;
            }
            if (tLObject instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.showDoneButton(false, true);
                postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityPasswordView.this.lambda$onNextPressed$9(tLObject);
                    }
                }, 150L);
                return;
            }
            LoginActivity.this.needHideProgress(false);
            if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                onPasscodeError(true);
                return;
            }
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", org.telegram.messenger.R.string.FloodWaitTime, formatPluralString));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$8(final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.this.lambda$onNextPressed$7(tL_error, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$7(TLRPC.TL_error tL_error, TLObject tLObject) {
            if (tL_error == null) {
                this.currentPassword = (TL_account.Password) tLObject;
                lambda$onNextPressed$16(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$9(TLObject tLObject) {
            LoginActivity.this.needHideProgress(false, false);
            AndroidUtilities.hideKeyboard(this.codeField);
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean onBackPressed(boolean z) {
            this.nextPressed = false;
            LoginActivity.this.needHideProgress(true);
            this.currentParams = null;
            return true;
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.this.lambda$onShow$13();
                }
            }, LoginActivity.SHOW_DELAY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShow$13() {
            EditTextBoldCursor editTextBoldCursor = this.codeField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = this.codeField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                LoginActivity.this.showKeyboard(this.codeField);
                this.lockImageView.getAnimatedDrawable().setCurrentFrame(0, false);
                this.lockImageView.playAnimation();
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            String obj = this.codeField.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("passview_code", obj);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("passview_params", bundle2);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("passview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("passview_code");
            if (string != null) {
                this.codeField.setText(string);
            }
        }
    }

    public class LoginActivityResetWaitView extends SlideView {
        private TextView confirmTextView;
        private Bundle currentParams;
        private String phoneCode;
        private String phoneHash;
        private String requestPhone;
        private TextView resetAccountButton;
        private TextView resetAccountText;
        private TextView resetAccountTime;
        private int startTime;
        private Runnable timeRunnable;
        private TextView titleView;
        private RLottieImageView waitImageView;
        private int waitTime;
        private Boolean wasResetButtonActive;

        @Override // org.telegram.ui.Components.SlideView
        public boolean needBackButton() {
            return true;
        }

        public LoginActivityResetWaitView(Context context) {
            super(context);
            setOrientation(1);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.waitImageView = rLottieImageView;
            rLottieImageView.setAutoRepeat(true);
            this.waitImageView.setAnimation(org.telegram.messenger.R.raw.sandclock, 120, 120);
            frameLayout.addView(this.waitImageView, LayoutHelper.createFrame(120, 120, 1));
            Point point = AndroidUtilities.displaySize;
            frameLayout.setVisibility((point.x <= point.y || AndroidUtilities.isTablet()) ? 0 : 8);
            linearLayout.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            TextView textView2 = this.titleView;
            int i = org.telegram.messenger.R.string.ResetAccount;
            textView2.setText(LocaleController.getString(i));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.confirmTextView = textView3;
            textView3.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(1);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            addView(linearLayout, LayoutHelper.createLinear(-1, 0, 1.0f));
            TextView textView4 = new TextView(context);
            this.resetAccountText = textView4;
            textView4.setGravity(1);
            this.resetAccountText.setText(LocaleController.getString("ResetAccountStatus", org.telegram.messenger.R.string.ResetAccountStatus));
            this.resetAccountText.setTextSize(1, 14.0f);
            this.resetAccountText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.resetAccountText, LayoutHelper.createLinear(-2, -2, 49, 0, 24, 0, 0));
            TextView textView5 = new TextView(context);
            this.resetAccountTime = textView5;
            textView5.setGravity(1);
            this.resetAccountTime.setTextSize(1, 20.0f);
            this.resetAccountTime.setTypeface(AndroidUtilities.bold());
            this.resetAccountTime.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.resetAccountTime, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
            TextView textView6 = new TextView(context);
            this.resetAccountButton = textView6;
            textView6.setGravity(17);
            this.resetAccountButton.setText(LocaleController.getString(i));
            this.resetAccountButton.setTypeface(AndroidUtilities.bold());
            this.resetAccountButton.setTextSize(1, 15.0f);
            this.resetAccountButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.resetAccountButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            this.resetAccountButton.setTextColor(-1);
            addView(this.resetAccountButton, LayoutHelper.createLinear(-1, 50, 1, 16, 32, 16, 48));
            this.resetAccountButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityResetWaitView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityResetWaitView.this.lambda$new$3(view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.showDialog(new AlertDialog.Builder(loginActivity.getParentActivity()).setTitle(LocaleController.getString("ResetMyAccountWarning", org.telegram.messenger.R.string.ResetMyAccountWarning)).setMessage(LocaleController.getString("ResetMyAccountWarningText", org.telegram.messenger.R.string.ResetMyAccountWarningText)).setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", org.telegram.messenger.R.string.ResetMyAccountWarningReset), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityResetWaitView$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.LoginActivityResetWaitView.this.lambda$new$2(alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString("Cancel", org.telegram.messenger.R.string.Cancel), null).create());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(AlertDialog alertDialog, int i) {
            LoginActivity.this.needShowProgress(0);
            TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
            deleteaccount.reason = "Forgot password";
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(deleteaccount, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityResetWaitView$$ExternalSyntheticLambda2
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityResetWaitView.this.lambda$new$1(tLObject, tL_error);
                }
            }, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityResetWaitView$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityResetWaitView.this.lambda$new$0(tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(TLRPC.TL_error tL_error) {
            LoginActivity.this.needHideProgress(false);
            if (tL_error == null) {
                if (this.requestPhone == null || this.phoneHash == null || this.phoneCode == null) {
                    LoginActivity.this.setPage(0, true, null, true);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", this.requestPhone);
                bundle.putString("phoneHash", this.phoneHash);
                bundle.putString("code", this.phoneCode);
                LoginActivity.this.setPage(5, true, bundle, false);
                return;
            }
            if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", org.telegram.messenger.R.string.ResetAccountCancelledAlert));
            } else {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            this.confirmTextView.setTextColor(Theme.getColor(i));
            this.resetAccountText.setTextColor(Theme.getColor(i));
            this.resetAccountTime.setTextColor(Theme.getColor(i));
            this.resetAccountButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_changephoneinfo_image2), Theme.getColor(Theme.key_chats_actionPressedBackground)));
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("ResetAccount", org.telegram.messenger.R.string.ResetAccount);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateTimeText() {
            int max = Math.max(0, this.waitTime - (ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).getCurrentTime() - this.startTime));
            int i = max / 86400;
            int round = Math.round(max / 86400.0f);
            int i2 = max / 3600;
            int i3 = (max / 60) % 60;
            int i4 = max % 60;
            if (i >= 2) {
                this.resetAccountTime.setText(LocaleController.formatPluralString("Days", round, new Object[0]));
            } else {
                this.resetAccountTime.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            boolean z = max == 0;
            Boolean bool = this.wasResetButtonActive;
            if (bool == null || bool.booleanValue() != z) {
                if (!z) {
                    this.waitImageView.setAutoRepeat(true);
                    if (!this.waitImageView.isPlaying()) {
                        this.waitImageView.playAnimation();
                    }
                } else {
                    this.waitImageView.getAnimatedDrawable().setAutoRepeat(0);
                }
                this.resetAccountTime.setVisibility(z ? 4 : 0);
                this.resetAccountText.setVisibility(z ? 4 : 0);
                this.resetAccountButton.setVisibility(z ? 0 : 4);
                this.wasResetButtonActive = Boolean.valueOf(z);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.currentParams = bundle;
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.phoneCode = bundle.getString("code");
            this.startTime = bundle.getInt("startTime");
            this.waitTime = bundle.getInt("waitTime");
            this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", org.telegram.messenger.R.string.ResetAccountInfo, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + this.requestPhone)))));
            updateTimeText();
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.LoginActivity.LoginActivityResetWaitView.1
                @Override // java.lang.Runnable
                public void run() {
                    if (LoginActivityResetWaitView.this.timeRunnable != this) {
                        return;
                    }
                    LoginActivityResetWaitView.this.updateTimeText();
                    AndroidUtilities.runOnUIThread(LoginActivityResetWaitView.this.timeRunnable, 1000L);
                }
            };
            this.timeRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 1000L);
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            AndroidUtilities.cancelRunOnUIThread(this.timeRunnable);
            this.timeRunnable = null;
            this.currentParams = null;
            return true;
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("resetview_params", bundle2);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("resetview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }
    }

    public class LoginActivitySetupEmail extends SlideView {
        private Bundle currentParams;
        private EditTextBoldCursor emailField;
        private OutlineTextContainerView emailOutlineView;
        private String emailPhone;
        private GoogleSignInAccount googleAccount;
        private RLottieImageView inboxImageView;
        private LoginOrView loginOrView;
        private boolean nextPressed;
        private String phone;
        private String phoneHash;
        private String requestPhone;
        private TextView signInWithGoogleView;
        private TextView subtitleView;
        private TextView titleView;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LoginActivitySetupEmail(Context context) {
            super(context);
            int i;
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.inboxImageView = rLottieImageView;
            rLottieImageView.setAnimation(org.telegram.messenger.R.raw.tsv_setup_mail, 120, 120);
            this.inboxImageView.setAutoRepeat(false);
            frameLayout.addView(this.inboxImageView, LayoutHelper.createFrame(120, 120, 1));
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                    frameLayout.setVisibility(i);
                    addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
                    TextView textView = new TextView(context);
                    this.titleView = textView;
                    textView.setTextSize(1, 18.0f);
                    this.titleView.setTypeface(AndroidUtilities.bold());
                    this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? org.telegram.messenger.R.string.EnterNewEmail : org.telegram.messenger.R.string.AddEmailTitle));
                    this.titleView.setGravity(17);
                    this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    this.subtitleView = textView2;
                    textView2.setTextSize(1, 14.0f);
                    this.subtitleView.setGravity(17);
                    this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.subtitleView.setText(LocaleController.getString(org.telegram.messenger.R.string.AddEmailSubtitle));
                    addView(this.subtitleView, LayoutHelper.createLinear(-2, -2, 1, 32, 8, 32, 0));
                    OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                    this.emailOutlineView = outlineTextContainerView;
                    outlineTextContainerView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? org.telegram.messenger.R.string.YourNewEmail : org.telegram.messenger.R.string.YourEmail));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.emailField = editTextBoldCursor;
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.emailField.setCursorWidth(1.5f);
                    this.emailField.setImeOptions(268435461);
                    this.emailField.setTextSize(1, 17.0f);
                    this.emailField.setMaxLines(1);
                    this.emailField.setInputType(33);
                    this.emailField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            LoginActivity.LoginActivitySetupEmail.this.lambda$new$0(view, z);
                        }
                    });
                    this.emailField.setBackground(null);
                    this.emailField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.emailOutlineView.attachEditText(this.emailField);
                    this.emailOutlineView.addView(this.emailField, LayoutHelper.createFrame(-1, -2, 48));
                    this.emailField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda4
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                            boolean lambda$new$1;
                            lambda$new$1 = LoginActivity.LoginActivitySetupEmail.this.lambda$new$1(textView3, i2, keyEvent);
                            return lambda$new$1;
                        }
                    });
                    addView(this.emailOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context);
                    this.signInWithGoogleView = textView3;
                    textView3.setGravity(3);
                    this.signInWithGoogleView.setTextSize(1, 14.0f);
                    this.signInWithGoogleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.signInWithGoogleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.signInWithGoogleView.setMaxLines(2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                    Drawable drawable = ContextCompat.getDrawable(context, org.telegram.messenger.R.drawable.googleg_standard_color_18);
                    drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
                    spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                    spannableStringBuilder.setSpan(new ReplacementSpan() { // from class: org.telegram.ui.LoginActivity.LoginActivitySetupEmail.1
                        @Override // android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                        }

                        @Override // android.text.style.ReplacementSpan
                        public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                            return AndroidUtilities.dp(12.0f);
                        }
                    }, 1, 2, 33);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(org.telegram.messenger.R.string.SignInWithGoogle));
                    this.signInWithGoogleView.setText(spannableStringBuilder);
                    this.loginOrView = new LoginOrView(context);
                    addView(new Space(context), LayoutHelper.createLinear(0, 0, 1.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.addView(this.signInWithGoogleView, LayoutHelper.createFrame(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
                    frameLayout2.addView(this.loginOrView, LayoutHelper.createFrame(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
                    this.loginOrView.setMeasureAfter(this.signInWithGoogleView);
                    addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
                    VerticalPositionAutoAnimator.attach(frameLayout2);
                    frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivitySetupEmail.this.lambda$new$3(view);
                        }
                    });
                }
            }
            i = 8;
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView4 = new TextView(context);
            this.titleView = textView4;
            textView4.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? org.telegram.messenger.R.string.EnterNewEmail : org.telegram.messenger.R.string.AddEmailTitle));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView22 = new TextView(context);
            this.subtitleView = textView22;
            textView22.setTextSize(1, 14.0f);
            this.subtitleView.setGravity(17);
            this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.subtitleView.setText(LocaleController.getString(org.telegram.messenger.R.string.AddEmailSubtitle));
            addView(this.subtitleView, LayoutHelper.createLinear(-2, -2, 1, 32, 8, 32, 0));
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.emailOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? org.telegram.messenger.R.string.YourNewEmail : org.telegram.messenger.R.string.YourEmail));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.emailField = editTextBoldCursor2;
            editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
            this.emailField.setCursorWidth(1.5f);
            this.emailField.setImeOptions(268435461);
            this.emailField.setTextSize(1, 17.0f);
            this.emailField.setMaxLines(1);
            this.emailField.setInputType(33);
            this.emailField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda3
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    LoginActivity.LoginActivitySetupEmail.this.lambda$new$0(view, z);
                }
            });
            this.emailField.setBackground(null);
            this.emailField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.emailOutlineView.attachEditText(this.emailField);
            this.emailOutlineView.addView(this.emailField, LayoutHelper.createFrame(-1, -2, 48));
            this.emailField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda4
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView32, int i2, KeyEvent keyEvent) {
                    boolean lambda$new$1;
                    lambda$new$1 = LoginActivity.LoginActivitySetupEmail.this.lambda$new$1(textView32, i2, keyEvent);
                    return lambda$new$1;
                }
            });
            addView(this.emailOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 0.0f));
            TextView textView32 = new TextView(context);
            this.signInWithGoogleView = textView32;
            textView32.setGravity(3);
            this.signInWithGoogleView.setTextSize(1, 14.0f);
            this.signInWithGoogleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.signInWithGoogleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.signInWithGoogleView.setMaxLines(2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
            Drawable drawable2 = ContextCompat.getDrawable(context, org.telegram.messenger.R.drawable.googleg_standard_color_18);
            drawable2.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
            spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
            spannableStringBuilder2.setSpan(new ReplacementSpan() { // from class: org.telegram.ui.LoginActivity.LoginActivitySetupEmail.1
                @Override // android.text.style.ReplacementSpan
                public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                }

                @Override // android.text.style.ReplacementSpan
                public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                    return AndroidUtilities.dp(12.0f);
                }
            }, 1, 2, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(org.telegram.messenger.R.string.SignInWithGoogle));
            this.signInWithGoogleView.setText(spannableStringBuilder2);
            this.loginOrView = new LoginOrView(context);
            addView(new Space(context), LayoutHelper.createLinear(0, 0, 1.0f));
            FrameLayout frameLayout22 = new FrameLayout(context);
            frameLayout22.addView(this.signInWithGoogleView, LayoutHelper.createFrame(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
            frameLayout22.addView(this.loginOrView, LayoutHelper.createFrame(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
            this.loginOrView.setMeasureAfter(this.signInWithGoogleView);
            addView(frameLayout22, LayoutHelper.createLinear(-1, -2));
            VerticalPositionAutoAnimator.attach(frameLayout22);
            frameLayout22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivitySetupEmail.this.lambda$new$3(view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view, boolean z) {
            this.emailOutlineView.animateSelection(z ? 1.0f : 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(View view) {
            NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.LoginActivity.LoginActivitySetupEmail.2
                @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                public void didReceivedNotification(int i, int i2, Object... objArr) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    ((Integer) objArr[1]).intValue();
                    Intent intent = (Intent) objArr[2];
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                    if (intValue == 200) {
                        try {
                            LoginActivitySetupEmail.this.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                            LoginActivitySetupEmail.this.lambda$onNextPressed$16(null);
                        } catch (ApiException e) {
                            FileLog.e(e);
                        }
                    }
                }
            }, NotificationCenter.onActivityResultReceived);
            final GoogleSignInClient client = GoogleSignIn.getClient(getContext(), new GoogleSignInOptions.Builder().requestIdToken(BuildVars.GOOGLE_AUTH_CLIENT_ID).requestEmail().build());
            client.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda9
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    LoginActivity.LoginActivitySetupEmail.this.lambda$new$2(client, task);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(GoogleSignInClient googleSignInClient, Task task) {
            if (LoginActivity.this.getParentActivity() == null || LoginActivity.this.getParentActivity().isFinishing()) {
                return;
            }
            LoginActivity.this.getParentActivity().startActivityForResult(googleSignInClient.getSignInIntent(), NotificationCenter.channelRecommendationsLoaded);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.emailField.setTextColor(Theme.getColor(i));
            this.signInWithGoogleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.loginOrView.updateColors();
            this.emailOutlineView.invalidate();
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean needBackButton() {
            return !LoginActivity.this.emailChangeIsSuggestion;
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("AddEmailTitle", org.telegram.messenger.R.string.AddEmailTitle);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.emailField.setText("");
            this.currentParams = bundle;
            this.phone = bundle.getString("phone");
            this.emailPhone = this.currentParams.getString("ephone");
            this.requestPhone = this.currentParams.getString("phoneFormated");
            this.phoneHash = this.currentParams.getString("phoneHash");
            int i = (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) ? 0 : 8;
            this.loginOrView.setVisibility(i);
            this.signInWithGoogleView.setVisibility(i);
            LoginActivity.this.showKeyboard(this.emailField);
            this.emailField.requestFocus();
        }

        private void onPasscodeError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.emailOutlineView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (z) {
                this.emailField.setText("");
            }
            this.emailField.requestFocus();
            LoginActivity.this.onFieldError(this.emailOutlineView, true);
            postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.this.lambda$onPasscodeError$4();
                }
            }, 300L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPasscodeError$4() {
            this.emailField.requestFocus();
        }

        @Override // org.telegram.ui.Components.SlideView
        /* renamed from: onNextPressed */
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            GoogleSignInAccount googleSignInAccount = this.googleAccount;
            String email = googleSignInAccount != null ? googleSignInAccount.getEmail() : this.emailField.getText().toString();
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("email", email);
            bundle.putBoolean("setup", true);
            if (this.googleAccount != null) {
                final TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                if (LoginActivity.this.activityMode == 3) {
                    verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                } else {
                    TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                    tL_emailVerifyPurposeLoginSetup.phone_number = this.requestPhone;
                    tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.phoneHash;
                    verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
                }
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.googleAccount.getIdToken();
                verifyemail.verification = tL_emailVerificationGoogle;
                this.googleAccount = null;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(verifyemail, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivitySetupEmail.this.lambda$onNextPressed$6(bundle, verifyemail, tLObject, tL_error);
                    }
                }, 10);
                return;
            }
            if (TextUtils.isEmpty(email)) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            final TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (LoginActivity.this.activityMode == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.requestPhone;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.phoneHash;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = email;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(sendverifyemailcode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda2
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivitySetupEmail.this.lambda$onNextPressed$8(bundle, sendverifyemailcode, tLObject, tL_error);
                }
            }, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$6(final Bundle bundle, final TL_account.verifyEmail verifyemail, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.this.lambda$onNextPressed$5(tLObject, bundle, tL_error, verifyemail);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$5(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TL_account.verifyEmail verifyemail) {
            if ((tLObject instanceof TL_account.TL_emailVerified) && LoginActivity.this.activityMode == 3) {
                LoginActivity.this.lambda$onBackPressed$340();
                LoginActivity.this.emailChangeFinishCallback.run();
                return;
            }
            if (tLObject instanceof TL_account.TL_emailVerifiedLogin) {
                TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject;
                bundle.putString("email", tL_emailVerifiedLogin.email);
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, tL_emailVerifiedLogin.sent_code);
            } else if (tL_error != null) {
                if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.EmailNotAllowed));
                } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.EmailTokenInvalid));
                } else if (tL_error.code != -1000) {
                    AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, verifyemail, new Object[0]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$8(final Bundle bundle, final TL_account.sendVerifyEmailCode sendverifyemailcode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.this.lambda$onNextPressed$7(tLObject, bundle, tL_error, sendverifyemailcode);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$7(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TL_account.sendVerifyEmailCode sendverifyemailcode) {
            LoginActivity.this.needHideProgress(false);
            this.nextPressed = false;
            if (tLObject instanceof TL_account.sentEmailCode) {
                LoginActivity.this.fillNextCodeParams(bundle, (TL_account.sentEmailCode) tLObject);
                return;
            }
            String str = tL_error.text;
            if (str != null) {
                if (str.contains("EMAIL_INVALID")) {
                    onPasscodeError(false);
                    return;
                }
                if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.EmailNotAllowed));
                    return;
                }
                if (tL_error.text.contains("PHONE_PASSWORD_FLOOD")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", org.telegram.messenger.R.string.FloodWait));
                    return;
                }
                if (tL_error.text.contains("PHONE_NUMBER_FLOOD")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", org.telegram.messenger.R.string.PhoneNumberFlood));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", org.telegram.messenger.R.string.InvalidCode));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", org.telegram.messenger.R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", org.telegram.messenger.R.string.FloodWait));
                } else if (tL_error.code != -1000) {
                    AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, sendverifyemailcode, this.requestPhone);
                }
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.this.lambda$onShow$9();
                }
            }, LoginActivity.SHOW_DELAY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShow$9() {
            this.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            this.inboxImageView.playAnimation();
            this.emailField.requestFocus();
            AndroidUtilities.showKeyboard(this.emailField);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            String obj = this.emailField.getText().toString();
            if (obj != null && obj.length() != 0) {
                bundle.putString("emailsetup_email", obj);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("emailsetup_params", bundle2);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("emailsetup_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("emailsetup_email");
            if (string != null) {
                this.emailField.setText(string);
            }
        }
    }

    public class LoginActivityEmailCodeView extends SlideView {
        private FrameLayout cantAccessEmailFrameLayout;
        private TextView cantAccessEmailView;
        private CodeFieldContainer codeFieldContainer;
        private TextView confirmTextView;
        private Bundle currentParams;
        private String email;
        private String emailPhone;
        private TextView emailResetInView;
        private Runnable errorColorTimeout;
        private ViewSwitcher errorViewSwitcher;
        private GoogleSignInAccount googleAccount;
        private RLottieImageView inboxImageView;
        private boolean isFromSetup;
        private boolean isSetup;
        private int length;
        private LoginOrView loginOrView;
        private boolean nextPressed;
        private String phone;
        private String phoneHash;
        private boolean postedErrorColorTimeout;
        private String requestPhone;
        private boolean requestingEmailReset;
        private Runnable resendCodeTimeout;
        private TextView resendCodeView;
        private FrameLayout resendFrameLayout;
        private int resetAvailablePeriod;
        private int resetPendingDate;
        private boolean resetRequestPending;
        private TextView signInWithGoogleView;
        private TextView titleView;
        private Runnable updateResetPendingDateCallback;
        private TextView wrongCodeView;

        @Override // org.telegram.ui.Components.SlideView
        public boolean hasCustomKeyboard() {
            return true;
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean needBackButton() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            boolean z = false;
            this.postedErrorColorTimeout = false;
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
            if (this.errorViewSwitcher.getCurrentView() != this.resendFrameLayout) {
                this.errorViewSwitcher.showNext();
                FrameLayout frameLayout = this.cantAccessEmailFrameLayout;
                if (this.resendCodeView.getVisibility() != 0 && LoginActivity.this.activityMode != 3 && !this.isSetup) {
                    z = true;
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z, 1.0f, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1() {
            showResendCodeView(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x033e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0357  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LoginActivityEmailCodeView(final Context context, boolean z) {
            super(context);
            int i;
            this.errorColorTimeout = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$0();
                }
            };
            this.resendCodeTimeout = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$1();
                }
            };
            this.updateResetPendingDateCallback = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.updateResetPendingDate();
                }
            };
            this.isSetup = z;
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            this.inboxImageView = new RLottieImageView(context);
            if (!z || LoginActivity.this.activityMode == 3) {
                this.inboxImageView.setAnimation(org.telegram.messenger.R.raw.email_check_inbox, 120, 120);
            } else {
                this.inboxImageView.setAnimation(org.telegram.messenger.R.raw.email_setup_heart, 120, 120);
            }
            this.inboxImageView.setAutoRepeat(false);
            frameLayout.addView(this.inboxImageView, LayoutHelper.createFrame(120, 120, 1));
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                    frameLayout.setVisibility(i);
                    addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
                    TextView textView = new TextView(context);
                    this.titleView = textView;
                    textView.setTextSize(1, 18.0f);
                    this.titleView.setTypeface(AndroidUtilities.bold());
                    this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? org.telegram.messenger.R.string.CheckYourNewEmail : z ? org.telegram.messenger.R.string.VerificationCode : org.telegram.messenger.R.string.CheckYourEmail));
                    this.titleView.setGravity(17);
                    this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                    SpoilersTextView spoilersTextView = new SpoilersTextView(context, false);
                    this.confirmTextView = spoilersTextView;
                    spoilersTextView.setTextSize(1, 14.0f);
                    this.confirmTextView.setGravity(17);
                    this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 24, 8, 24, 0));
                    CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.1
                        @Override // org.telegram.ui.CodeFieldContainer
                        protected void processNextPressed() {
                            LoginActivityEmailCodeView.this.lambda$onNextPressed$16(null);
                        }
                    };
                    this.codeFieldContainer = codeFieldContainer;
                    addView(codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, !z ? 48 : 32, 0, 0));
                    TextView textView2 = new TextView(context);
                    this.signInWithGoogleView = textView2;
                    textView2.setGravity(17);
                    this.signInWithGoogleView.setTextSize(1, 14.0f);
                    this.signInWithGoogleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.signInWithGoogleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.signInWithGoogleView.setMaxLines(2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                    Drawable drawable = ContextCompat.getDrawable(context, org.telegram.messenger.R.drawable.googleg_standard_color_18);
                    drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
                    spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                    spannableStringBuilder.setSpan(new ReplacementSpan() { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.2
                        @Override // android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                        }

                        @Override // android.text.style.ReplacementSpan
                        public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                            return AndroidUtilities.dp(12.0f);
                        }
                    }, 1, 2, 33);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(org.telegram.messenger.R.string.SignInWithGoogle));
                    this.signInWithGoogleView.setText(spannableStringBuilder);
                    this.signInWithGoogleView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityEmailCodeView.this.lambda$new$3(view);
                        }
                    });
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    this.cantAccessEmailFrameLayout = frameLayout2;
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, LoginActivity.this.activityMode == 3 && !this.isSetup, 1.0f, false);
                    TextView textView3 = new TextView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.4
                        @Override // android.widget.TextView, android.view.View
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_31));
                        }
                    };
                    this.cantAccessEmailView = textView3;
                    textView3.setText(LocaleController.getString(org.telegram.messenger.R.string.LoginCantAccessThisEmail));
                    this.cantAccessEmailView.setGravity(17);
                    this.cantAccessEmailView.setTextSize(1, 14.0f);
                    this.cantAccessEmailView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.cantAccessEmailView.setMaxLines(2);
                    this.cantAccessEmailView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityEmailCodeView.this.lambda$new$7(context, view);
                        }
                    });
                    this.cantAccessEmailFrameLayout.addView(this.cantAccessEmailView);
                    TextView textView4 = new TextView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.5
                        @Override // android.widget.TextView, android.view.View
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i3), AndroidUtilities.dp(100.0f)), TLObject.FLAG_31));
                        }
                    };
                    this.emailResetInView = textView4;
                    textView4.setGravity(17);
                    this.emailResetInView.setTextSize(1, 14.0f);
                    this.emailResetInView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.emailResetInView.setMaxLines(3);
                    this.emailResetInView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityEmailCodeView.this.lambda$new$8(view);
                        }
                    });
                    this.emailResetInView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                    this.emailResetInView.setVisibility(8);
                    this.cantAccessEmailFrameLayout.addView(this.emailResetInView);
                    TextView textView5 = new TextView(context);
                    this.resendCodeView = textView5;
                    textView5.setGravity(17);
                    this.resendCodeView.setTextSize(1, 14.0f);
                    this.resendCodeView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.resendCodeView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.resendCodeView.setMaxLines(2);
                    this.resendCodeView.setText(LocaleController.getString(org.telegram.messenger.R.string.ResendCode));
                    this.resendCodeView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityEmailCodeView.this.lambda$new$11(view);
                        }
                    });
                    AndroidUtilities.updateViewVisibilityAnimated(this.resendCodeView, false, 1.0f, false);
                    LoginOrView loginOrView = new LoginOrView(context);
                    this.loginOrView = loginOrView;
                    VerticalPositionAutoAnimator.attach(loginOrView);
                    this.errorViewSwitcher = new ViewSwitcher(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.6
                        @Override // android.widget.FrameLayout, android.view.View
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_31));
                        }
                    };
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, org.telegram.messenger.R.anim.text_in);
                    Interpolator interpolator = Easings.easeInOutQuad;
                    loadAnimation.setInterpolator(interpolator);
                    this.errorViewSwitcher.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, org.telegram.messenger.R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    this.errorViewSwitcher.setOutAnimation(loadAnimation2);
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    this.resendFrameLayout = frameLayout3;
                    frameLayout3.addView(this.resendCodeView, LayoutHelper.createFrame(-2, -2, 17));
                    this.errorViewSwitcher.addView(this.resendFrameLayout);
                    TextView textView6 = new TextView(context);
                    this.wrongCodeView = textView6;
                    textView6.setText(LocaleController.getString("WrongCode", org.telegram.messenger.R.string.WrongCode));
                    this.wrongCodeView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.wrongCodeView.setTextSize(1, 15.0f);
                    this.wrongCodeView.setGravity(49);
                    this.wrongCodeView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.errorViewSwitcher.addView(this.wrongCodeView);
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    if (!z) {
                        frameLayout4.addView(this.errorViewSwitcher, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                    } else {
                        frameLayout4.addView(this.errorViewSwitcher, LayoutHelper.createFrame(-1, -2, 48));
                        frameLayout4.addView(this.cantAccessEmailFrameLayout, LayoutHelper.createFrame(-1, -2, 48));
                        frameLayout4.addView(this.loginOrView, LayoutHelper.createFrame(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                        frameLayout4.addView(this.signInWithGoogleView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                    }
                    addView(frameLayout4, LayoutHelper.createLinear(-1, 0, 1.0f));
                }
            }
            i = 8;
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView7 = new TextView(context);
            this.titleView = textView7;
            textView7.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? org.telegram.messenger.R.string.CheckYourNewEmail : z ? org.telegram.messenger.R.string.VerificationCode : org.telegram.messenger.R.string.CheckYourEmail));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            SpoilersTextView spoilersTextView2 = new SpoilersTextView(context, false);
            this.confirmTextView = spoilersTextView2;
            spoilersTextView2.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(17);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 24, 8, 24, 0));
            CodeFieldContainer codeFieldContainer2 = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.1
                @Override // org.telegram.ui.CodeFieldContainer
                protected void processNextPressed() {
                    LoginActivityEmailCodeView.this.lambda$onNextPressed$16(null);
                }
            };
            this.codeFieldContainer = codeFieldContainer2;
            addView(codeFieldContainer2, LayoutHelper.createLinear(-2, 42, 1, 0, !z ? 48 : 32, 0, 0));
            TextView textView22 = new TextView(context);
            this.signInWithGoogleView = textView22;
            textView22.setGravity(17);
            this.signInWithGoogleView.setTextSize(1, 14.0f);
            this.signInWithGoogleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.signInWithGoogleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.signInWithGoogleView.setMaxLines(2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
            Drawable drawable2 = ContextCompat.getDrawable(context, org.telegram.messenger.R.drawable.googleg_standard_color_18);
            drawable2.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
            spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
            spannableStringBuilder2.setSpan(new ReplacementSpan() { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.2
                @Override // android.text.style.ReplacementSpan
                public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                }

                @Override // android.text.style.ReplacementSpan
                public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                    return AndroidUtilities.dp(12.0f);
                }
            }, 1, 2, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(org.telegram.messenger.R.string.SignInWithGoogle));
            this.signInWithGoogleView.setText(spannableStringBuilder2);
            this.signInWithGoogleView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$3(view);
                }
            });
            FrameLayout frameLayout22 = new FrameLayout(context);
            this.cantAccessEmailFrameLayout = frameLayout22;
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout22, LoginActivity.this.activityMode == 3 && !this.isSetup, 1.0f, false);
            TextView textView32 = new TextView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.4
                @Override // android.widget.TextView, android.view.View
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_31));
                }
            };
            this.cantAccessEmailView = textView32;
            textView32.setText(LocaleController.getString(org.telegram.messenger.R.string.LoginCantAccessThisEmail));
            this.cantAccessEmailView.setGravity(17);
            this.cantAccessEmailView.setTextSize(1, 14.0f);
            this.cantAccessEmailView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.cantAccessEmailView.setMaxLines(2);
            this.cantAccessEmailView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$7(context, view);
                }
            });
            this.cantAccessEmailFrameLayout.addView(this.cantAccessEmailView);
            TextView textView42 = new TextView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.5
                @Override // android.widget.TextView, android.view.View
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i3), AndroidUtilities.dp(100.0f)), TLObject.FLAG_31));
                }
            };
            this.emailResetInView = textView42;
            textView42.setGravity(17);
            this.emailResetInView.setTextSize(1, 14.0f);
            this.emailResetInView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.emailResetInView.setMaxLines(3);
            this.emailResetInView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$8(view);
                }
            });
            this.emailResetInView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            this.emailResetInView.setVisibility(8);
            this.cantAccessEmailFrameLayout.addView(this.emailResetInView);
            TextView textView52 = new TextView(context);
            this.resendCodeView = textView52;
            textView52.setGravity(17);
            this.resendCodeView.setTextSize(1, 14.0f);
            this.resendCodeView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.resendCodeView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.resendCodeView.setMaxLines(2);
            this.resendCodeView.setText(LocaleController.getString(org.telegram.messenger.R.string.ResendCode));
            this.resendCodeView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$11(view);
                }
            });
            AndroidUtilities.updateViewVisibilityAnimated(this.resendCodeView, false, 1.0f, false);
            LoginOrView loginOrView2 = new LoginOrView(context);
            this.loginOrView = loginOrView2;
            VerticalPositionAutoAnimator.attach(loginOrView2);
            this.errorViewSwitcher = new ViewSwitcher(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.6
                @Override // android.widget.FrameLayout, android.view.View
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_31));
                }
            };
            Animation loadAnimation3 = AnimationUtils.loadAnimation(context, org.telegram.messenger.R.anim.text_in);
            Interpolator interpolator2 = Easings.easeInOutQuad;
            loadAnimation3.setInterpolator(interpolator2);
            this.errorViewSwitcher.setInAnimation(loadAnimation3);
            Animation loadAnimation22 = AnimationUtils.loadAnimation(context, org.telegram.messenger.R.anim.text_out);
            loadAnimation22.setInterpolator(interpolator2);
            this.errorViewSwitcher.setOutAnimation(loadAnimation22);
            FrameLayout frameLayout32 = new FrameLayout(context);
            this.resendFrameLayout = frameLayout32;
            frameLayout32.addView(this.resendCodeView, LayoutHelper.createFrame(-2, -2, 17));
            this.errorViewSwitcher.addView(this.resendFrameLayout);
            TextView textView62 = new TextView(context);
            this.wrongCodeView = textView62;
            textView62.setText(LocaleController.getString("WrongCode", org.telegram.messenger.R.string.WrongCode));
            this.wrongCodeView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.wrongCodeView.setTextSize(1, 15.0f);
            this.wrongCodeView.setGravity(49);
            this.wrongCodeView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.errorViewSwitcher.addView(this.wrongCodeView);
            FrameLayout frameLayout42 = new FrameLayout(context);
            if (!z) {
            }
            addView(frameLayout42, LayoutHelper.createLinear(-1, 0, 1.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(View view) {
            NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.3
                @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                public void didReceivedNotification(int i, int i2, Object... objArr) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    ((Integer) objArr[1]).intValue();
                    Intent intent = (Intent) objArr[2];
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                    if (intValue == 200) {
                        try {
                            LoginActivityEmailCodeView.this.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                            LoginActivityEmailCodeView.this.lambda$onNextPressed$16(null);
                        } catch (ApiException e) {
                            FileLog.e(e);
                        }
                    }
                }
            }, NotificationCenter.onActivityResultReceived);
            final GoogleSignInClient client = GoogleSignIn.getClient(getContext(), new GoogleSignInOptions.Builder().requestIdToken(BuildVars.GOOGLE_AUTH_CLIENT_ID).requestEmail().build());
            client.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda11
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$2(client, task);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(GoogleSignInClient googleSignInClient, Task task) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity.this.getParentActivity().startActivityForResult(googleSignInClient.getSignInIntent(), NotificationCenter.channelRecommendationsLoaded);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$7(Context context, View view) {
            String string = this.currentParams.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                textStyleRun.start = indexOf;
                int i = lastIndexOf + 1;
                textStyleRun.end = i;
                spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun), indexOf, i, 0);
            }
            new AlertDialog.Builder(context).setTitle(LocaleController.getString(org.telegram.messenger.R.string.LoginEmailResetTitle)).setMessage(AndroidUtilities.formatSpannable(AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.LoginEmailResetMessage)), spannableStringBuilder, getTimePattern(this.resetAvailablePeriod))).setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.LoginEmailResetButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda15
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i2) {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$6(alertDialog, i2);
                }
            }).setNegativeButton(LocaleController.getString(org.telegram.messenger.R.string.Cancel), null).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$6(AlertDialog alertDialog, int i) {
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
            tL_auth_resetLoginEmail.phone_number = this.requestPhone;
            tL_auth_resetLoginEmail.phone_code_hash = this.phoneHash;
            LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda19
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$5(bundle, tL_auth_resetLoginEmail, tLObject, tL_error);
                }
            }, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$5(final Bundle bundle, final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$4(tLObject, bundle, tL_error, tL_auth_resetLoginEmail);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$4(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail) {
            String str;
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                    auth_sentcodetype.email_pattern = this.currentParams.getString("emailPattern");
                    this.resetRequestPending = true;
                }
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, tL_auth_sentCode);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (!str.contains("PHONE_CODE_EXPIRED")) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resetLoginEmail, new Object[0]);
                return;
            }
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", org.telegram.messenger.R.string.CodeExpired));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$8(View view) {
            requestEmailReset();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$11(View view) {
            if (this.resendCodeView.getVisibility() == 0 && this.resendCodeView.getAlpha() == 1.0f) {
                showResendCodeView(false);
                final TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.requestPhone;
                tL_auth_resendCode.phone_code_hash = this.phoneHash;
                final Bundle bundle = new Bundle();
                bundle.putString("phone", this.phone);
                bundle.putString("ephone", this.emailPhone);
                bundle.putString("phoneFormated", this.requestPhone);
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda10
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivityEmailCodeView.this.lambda$new$10(bundle, tL_auth_resendCode, tLObject, tL_error);
                    }
                }, 10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$10(final Bundle bundle, final TLRPC.TL_auth_resendCode tL_auth_resendCode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$new$9(tLObject, bundle, tL_error, tL_auth_resendCode);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$9(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, (TLRPC.TL_auth_sentCode) tLObject);
            } else {
                if (tL_error == null || tL_error.text == null) {
                    return;
                }
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resendCode, new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestEmailReset() {
            if (this.requestingEmailReset) {
                return;
            }
            this.requestingEmailReset = true;
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
            tL_auth_resetLoginEmail.phone_number = this.requestPhone;
            tL_auth_resetLoginEmail.phone_code_hash = this.phoneHash;
            LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda12
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$requestEmailReset$13(bundle, tL_auth_resetLoginEmail, tLObject, tL_error);
                }
            }, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$requestEmailReset$13(final Bundle bundle, final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$requestEmailReset$12(tLObject, bundle, tL_error, tL_auth_resetLoginEmail);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$requestEmailReset$12(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail) {
            String str;
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            this.requestingEmailReset = false;
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, (TLRPC.TL_auth_sentCode) tLObject);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (str.contains("TASK_ALREADY_EXISTS")) {
                new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(org.telegram.messenger.R.string.LoginEmailResetPremiumRequiredTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + this.requestPhone))))).setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.OK), null).show();
                return;
            }
            if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resetLoginEmail, new Object[0]);
                return;
            }
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", org.telegram.messenger.R.string.CodeExpired));
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            TextView textView = this.confirmTextView;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            textView.setTextColor(Theme.getColor(i));
            TextView textView2 = this.signInWithGoogleView;
            int i2 = Theme.key_windowBackgroundWhiteBlueText4;
            textView2.setTextColor(Theme.getColor(i2));
            this.loginOrView.updateColors();
            this.resendCodeView.setTextColor(Theme.getColor(i2));
            this.cantAccessEmailView.setTextColor(Theme.getColor(i2));
            this.emailResetInView.setTextColor(Theme.getColor(i));
            this.wrongCodeView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            this.codeFieldContainer.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
            removeCallbacks(this.resendCodeTimeout);
        }

        private void showResendCodeView(boolean z) {
            AndroidUtilities.updateViewVisibilityAnimated(this.resendCodeView, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, (z || LoginActivity.this.activityMode == 3 || this.isSetup) ? false : true);
            if (this.loginOrView.getVisibility() != 8) {
                this.loginOrView.setLayoutParams(LayoutHelper.createFrame(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z ? 8.0f : 16.0f));
                this.loginOrView.requestLayout();
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString(org.telegram.messenger.R.string.VerificationCode);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.currentParams = bundle;
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = this.currentParams.getString("phoneHash");
            this.phone = this.currentParams.getString("phone");
            this.emailPhone = this.currentParams.getString("ephone");
            this.isFromSetup = this.currentParams.getBoolean("setup");
            this.length = this.currentParams.getInt("length");
            this.email = this.currentParams.getString("email");
            this.resetAvailablePeriod = this.currentParams.getInt("resetAvailablePeriod");
            this.resetPendingDate = this.currentParams.getInt("resetPendingDate");
            int i = 8;
            if (LoginActivity.this.activityMode == 3) {
                this.confirmTextView.setText(LocaleController.formatString(org.telegram.messenger.R.string.CheckYourNewEmailSubtitle, this.email));
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, false, 1.0f, false);
            } else if (this.isSetup) {
                this.confirmTextView.setText(LocaleController.formatString(org.telegram.messenger.R.string.VerificationCodeSubtitle, this.email));
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, false, 1.0f, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, true, 1.0f, false);
                this.cantAccessEmailView.setVisibility(this.resetPendingDate == 0 ? 0 : 8);
                this.emailResetInView.setVisibility(this.resetPendingDate != 0 ? 0 : 8);
                if (this.resetPendingDate != 0) {
                    updateResetPendingDate();
                }
            }
            this.codeFieldContainer.setNumbersCount(this.length, 1);
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
                codeNumberField.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.7
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        if (LoginActivityEmailCodeView.this.postedErrorColorTimeout) {
                            LoginActivityEmailCodeView loginActivityEmailCodeView = LoginActivityEmailCodeView.this;
                            loginActivityEmailCodeView.removeCallbacks(loginActivityEmailCodeView.errorColorTimeout);
                            LoginActivityEmailCodeView.this.errorColorTimeout.run();
                        }
                    }
                });
                codeNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        LoginActivity.LoginActivityEmailCodeView.this.lambda$setParams$14(view, z2);
                    }
                });
            }
            this.codeFieldContainer.setText("");
            if (!this.isFromSetup && LoginActivity.this.activityMode != 3) {
                String string = this.currentParams.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = indexOf;
                    int i2 = lastIndexOf + 1;
                    textStyleRun.end = i2;
                    spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun), indexOf, i2, 0);
                }
                this.confirmTextView.setText(AndroidUtilities.formatSpannable(LocaleController.getString(org.telegram.messenger.R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i = 0;
            }
            this.loginOrView.setVisibility(i);
            this.signInWithGoogleView.setVisibility(i);
            LoginActivity.this.showKeyboard(this.codeFieldContainer.codeField[0]);
            this.codeFieldContainer.requestFocus();
            if (!z && bundle.containsKey("nextType")) {
                AndroidUtilities.runOnUIThread(this.resendCodeTimeout, bundle.getInt("timeout"));
            }
            if (this.resetPendingDate != 0) {
                AndroidUtilities.runOnUIThread(this.updateResetPendingDateCallback, 1000L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$14(View view, boolean z) {
            if (z) {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onHide() {
            super.onHide();
            if (this.resetPendingDate != 0) {
                AndroidUtilities.cancelRunOnUIThread(this.updateResetPendingDateCallback);
            }
        }

        private String getTimePatternForTimer(int i) {
            int i2 = i / 86400;
            int i3 = i % 86400;
            int i4 = i3 / 3600;
            int i5 = i3 % 3600;
            int i6 = i5 / 60;
            int i7 = i5 % 60;
            if (i4 >= 16) {
                i2++;
            }
            if (i2 != 0) {
                return LocaleController.formatString(org.telegram.messenger.R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i2, new Object[0]));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i4 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i4)) : "");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "%02d:", Integer.valueOf(i6)));
            sb.append(String.format(locale, "%02d", Integer.valueOf(i7)));
            return LocaleController.formatString(org.telegram.messenger.R.string.LoginEmailResetInSinglePattern, sb.toString());
        }

        private String getTimePattern(int i) {
            int i2 = i / 86400;
            int i3 = i % 86400;
            int i4 = i3 / 3600;
            int i5 = (i3 % 3600) / 60;
            if (i2 == 0 && i4 == 0) {
                i5 = Math.max(1, i5);
            }
            return (i2 == 0 || i4 == 0) ? (i4 == 0 || i5 == 0) ? i2 != 0 ? LocaleController.formatString(org.telegram.messenger.R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i2, new Object[0])) : i4 != 0 ? LocaleController.formatString(org.telegram.messenger.R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i2, new Object[0])) : LocaleController.formatString(org.telegram.messenger.R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i5, new Object[0])) : LocaleController.formatString(org.telegram.messenger.R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i4, new Object[0]), LocaleController.formatPluralString("Minutes", i5, new Object[0])) : LocaleController.formatString(org.telegram.messenger.R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i2, new Object[0]), LocaleController.formatPluralString("Hours", i4, new Object[0]));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateResetPendingDate() {
            int currentTimeMillis = (int) (this.resetPendingDate - (System.currentTimeMillis() / 1000));
            if (this.resetPendingDate <= 0 || currentTimeMillis <= 0) {
                this.emailResetInView.setVisibility(0);
                this.emailResetInView.setText(LocaleController.getString(org.telegram.messenger.R.string.LoginEmailResetPleaseWait));
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityEmailCodeView.this.requestEmailReset();
                    }
                }, 1000L);
                return;
            }
            String formatString = LocaleController.formatString(org.telegram.messenger.R.string.LoginEmailResetInTime, getTimePatternForTimer(currentTimeMillis));
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatString);
            int indexOf = formatString.indexOf(42);
            int lastIndexOf = formatString.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new ForegroundColorSpan(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), indexOf, lastIndexOf - 1, 33);
            }
            this.emailResetInView.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.updateResetPendingDateCallback, 1000L);
        }

        private void onPasscodeError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.codeFieldContainer.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (z) {
                for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                    codeNumberField.setText("");
                }
            }
            for (CodeNumberField codeNumberField2 : this.codeFieldContainer.codeField) {
                codeNumberField2.animateErrorProgress(1.0f);
            }
            this.codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$onPasscodeError$16();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPasscodeError$16() {
            postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$onPasscodeError$15();
                }
            }, 150L);
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 3000L);
            this.postedErrorColorTimeout = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPasscodeError$15() {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.telegram.ui.Components.SlideView
        /* renamed from: onNextPressed */
        public void lambda$onNextPressed$16(String str) {
            TLRPC.TL_auth_signIn tL_auth_signIn;
            if (this.nextPressed) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.resendCodeTimeout);
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            codeFieldContainer.isFocusSuppressed = true;
            CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
            if (codeNumberFieldArr != null) {
                for (CodeNumberField codeNumberField : codeNumberFieldArr) {
                    codeNumberField.animateFocusedProgress(0.0f);
                }
            }
            final String code = this.codeFieldContainer.getCode();
            if (code.length() == 0 && this.googleAccount == null) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            if (LoginActivity.this.activityMode == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tL_auth_signIn = verifyemail;
            } else if (this.isFromSetup) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.requestPhone;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.phoneHash;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tL_auth_signIn = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
                tL_auth_signIn2.phone_number = this.requestPhone;
                tL_auth_signIn2.phone_code_hash = this.phoneHash;
                if (this.googleAccount != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.googleAccount.getIdToken();
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags |= 2;
                tL_auth_signIn = tL_auth_signIn2;
            }
            CodeFieldContainer codeFieldContainer2 = this.codeFieldContainer;
            codeFieldContainer2.isFocusSuppressed = true;
            CodeNumberField[] codeNumberFieldArr2 = codeFieldContainer2.codeField;
            if (codeNumberFieldArr2 != null) {
                for (CodeNumberField codeNumberField2 : codeNumberFieldArr2) {
                    codeNumberField2.animateFocusedProgress(0.0f);
                }
            }
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_signIn, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$onNextPressed$23(code, tLObject, tL_error);
                }
            }, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$23(final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$onNextPressed$22(tL_error, str, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$22(TLRPC.TL_error tL_error, final String str, final TLObject tLObject) {
            CodeNumberField[] codeNumberFieldArr;
            LoginActivity.this.needHideProgress(false);
            if (tL_error == null) {
                this.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                final Bundle bundle = new Bundle();
                bundle.putString("phone", this.phone);
                bundle.putString("ephone", this.emailPhone);
                bundle.putString("phoneFormated", this.requestPhone);
                bundle.putString("phoneHash", this.phoneHash);
                bundle.putString("code", str);
                if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda21
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivityEmailCodeView.this.lambda$onNextPressed$17(bundle);
                        }
                    });
                } else {
                    animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda22
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivityEmailCodeView.this.lambda$onNextPressed$18(tLObject, bundle);
                        }
                    });
                }
            } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda23
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        LoginActivity.LoginActivityEmailCodeView.this.lambda$onNextPressed$21(str, tLObject2, tL_error2);
                    }
                }, 10);
            } else {
                this.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.EmailAddressInvalid));
                } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", org.telegram.messenger.R.string.InvalidPhoneNumber));
                } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    shakeWrongCode();
                } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.EmailTokenInvalid));
                } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                    onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", org.telegram.messenger.R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", org.telegram.messenger.R.string.FloodWait));
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", org.telegram.messenger.R.string.ErrorOccurred) + "\n" + tL_error.text);
                }
                if (this.codeFieldContainer.codeField != null) {
                    int i = 0;
                    while (true) {
                        codeNumberFieldArr = this.codeFieldContainer.codeField;
                        if (i >= codeNumberFieldArr.length) {
                            break;
                        }
                        codeNumberFieldArr[i].setText("");
                        i++;
                    }
                    codeNumberFieldArr[0].requestFocus();
                }
                this.codeFieldContainer.isFocusSuppressed = false;
            }
            this.googleAccount = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$17(Bundle bundle) {
            LoginActivity.this.setPage(5, true, bundle, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$18(TLObject tLObject, Bundle bundle) {
            if ((tLObject instanceof TL_account.TL_emailVerified) && LoginActivity.this.activityMode == 3) {
                LoginActivity.this.lambda$onBackPressed$340();
                LoginActivity.this.emailChangeFinishCallback.run();
            } else if (tLObject instanceof TL_account.TL_emailVerifiedLogin) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject).sent_code);
            } else if (tLObject instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$21(final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$onNextPressed$20(tL_error, tLObject, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$20(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", org.telegram.messenger.R.string.UpdateAppAlert), true);
                return;
            }
            final Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("code", str);
            animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$onNextPressed$19(bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$19(Bundle bundle) {
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        private void animateSuccess(final Runnable runnable) {
            if (this.googleAccount != null) {
                runnable.run();
                return;
            }
            final int i = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (i < codeFieldContainer.codeField.length) {
                    codeFieldContainer.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda26
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivityEmailCodeView.this.lambda$animateSuccess$24(i);
                        }
                    }, i * 75);
                    i++;
                } else {
                    codeFieldContainer.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda27
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivityEmailCodeView.this.lambda$animateSuccess$25(runnable);
                        }
                    }, (this.codeFieldContainer.codeField.length * 75) + 400);
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateSuccess$24(int i) {
            this.codeFieldContainer.codeField[i].animateSuccessProgress(1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateSuccess$25(Runnable runnable) {
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i < codeNumberFieldArr.length) {
                    codeNumberFieldArr[i].animateSuccessProgress(0.0f);
                    i++;
                } else {
                    runnable.run();
                    this.codeFieldContainer.isFocusSuppressed = false;
                    return;
                }
            }
        }

        private void shakeWrongCode() {
            try {
                this.codeFieldContainer.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].setText("");
                this.codeFieldContainer.codeField[i].animateErrorProgress(1.0f);
                i++;
            }
            if (this.errorViewSwitcher.getCurrentView() == this.resendFrameLayout) {
                this.errorViewSwitcher.showNext();
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, false, 1.0f, true);
            }
            this.codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, 10.0f, new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$shakeWrongCode$27();
                }
            });
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 5000L);
            this.postedErrorColorTimeout = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shakeWrongCode$27() {
            postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda30
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.lambda$shakeWrongCode$26();
                }
            }, 150L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shakeWrongCode$26() {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            if (this.resetRequestPending) {
                this.resetRequestPending = false;
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityEmailCodeView.this.lambda$onShow$28();
                    }
                }, LoginActivity.SHOW_DELAY);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShow$28() {
            this.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            this.inboxImageView.playAnimation();
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer == null || codeFieldContainer.codeField == null) {
                return;
            }
            codeFieldContainer.setText("");
            this.codeFieldContainer.codeField[0].requestFocus();
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            String code = this.codeFieldContainer.getCode();
            if (code != null && code.length() != 0) {
                bundle.putString("emailcode_code", code);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("emailcode_params", bundle2);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("emailcode_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("emailcode_code");
            if (string != null) {
                this.codeFieldContainer.setText(string);
            }
        }
    }

    public class LoginActivityRecoverView extends SlideView {
        private CodeFieldContainer codeFieldContainer;
        private TextView confirmTextView;
        private Bundle currentParams;
        private Runnable errorColorTimeout;
        private RLottieImageView inboxImageView;
        private boolean nextPressed;
        private String passwordString;
        private String phoneCode;
        private String phoneHash;
        private boolean postedErrorColorTimeout;
        private String requestPhone;
        private TextView titleView;
        private TextView troubleButton;

        @Override // org.telegram.ui.Components.SlideView
        public boolean hasCustomKeyboard() {
            return true;
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean needBackButton() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            int i = 0;
            this.postedErrorColorTimeout = false;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00f3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LoginActivityRecoverView(Context context) {
            super(context);
            int i;
            this.errorColorTimeout = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.this.lambda$new$0();
                }
            };
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.inboxImageView = rLottieImageView;
            rLottieImageView.setAnimation(org.telegram.messenger.R.raw.tsv_setup_mail, 120, 120);
            this.inboxImageView.setAutoRepeat(false);
            frameLayout.addView(this.inboxImageView, LayoutHelper.createFrame(120, 120, 1));
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                    frameLayout.setVisibility(i);
                    addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
                    TextView textView = new TextView(context);
                    this.titleView = textView;
                    textView.setTextSize(1, 18.0f);
                    this.titleView.setTypeface(AndroidUtilities.bold());
                    this.titleView.setText(LocaleController.getString(org.telegram.messenger.R.string.EnterCode));
                    this.titleView.setGravity(17);
                    this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    this.confirmTextView = textView2;
                    textView2.setTextSize(1, 14.0f);
                    this.confirmTextView.setGravity(17);
                    this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.confirmTextView.setText(LocaleController.getString(org.telegram.messenger.R.string.RestoreEmailSentInfo));
                    addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
                    CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityRecoverView.1
                        @Override // org.telegram.ui.CodeFieldContainer
                        protected void processNextPressed() {
                            LoginActivityRecoverView.this.lambda$onNextPressed$16(null);
                        }
                    };
                    this.codeFieldContainer = codeFieldContainer;
                    codeFieldContainer.setNumbersCount(6, 1);
                    for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                        codeNumberField.setShowSoftInputOnFocusCompat(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
                        codeNumberField.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.LoginActivityRecoverView.2
                            @Override // android.text.TextWatcher
                            public void afterTextChanged(Editable editable) {
                            }

                            @Override // android.text.TextWatcher
                            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                            }

                            @Override // android.text.TextWatcher
                            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                                if (LoginActivityRecoverView.this.postedErrorColorTimeout) {
                                    LoginActivityRecoverView loginActivityRecoverView = LoginActivityRecoverView.this;
                                    loginActivityRecoverView.removeCallbacks(loginActivityRecoverView.errorColorTimeout);
                                    LoginActivityRecoverView.this.errorColorTimeout.run();
                                }
                            }
                        });
                        codeNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda3
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view, boolean z) {
                                LoginActivity.LoginActivityRecoverView.this.lambda$new$1(view, z);
                            }
                        });
                    }
                    addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
                    SpoilersTextView spoilersTextView = new SpoilersTextView(context, false);
                    this.troubleButton = spoilersTextView;
                    spoilersTextView.setGravity(17);
                    this.troubleButton.setTextSize(1, 14.0f);
                    this.troubleButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.troubleButton.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.troubleButton.setMaxLines(2);
                    this.troubleButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityRecoverView.this.lambda$new$4(view);
                        }
                    });
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.addView(this.troubleButton, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout2, LayoutHelper.createLinear(-1, 0, 1.0f));
                    VerticalPositionAutoAnimator.attach(this.troubleButton);
                }
            }
            i = 8;
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView3 = new TextView(context);
            this.titleView = textView3;
            textView3.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(org.telegram.messenger.R.string.EnterCode));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView22 = new TextView(context);
            this.confirmTextView = textView22;
            textView22.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(17);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.confirmTextView.setText(LocaleController.getString(org.telegram.messenger.R.string.RestoreEmailSentInfo));
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            CodeFieldContainer codeFieldContainer2 = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityRecoverView.1
                @Override // org.telegram.ui.CodeFieldContainer
                protected void processNextPressed() {
                    LoginActivityRecoverView.this.lambda$onNextPressed$16(null);
                }
            };
            this.codeFieldContainer = codeFieldContainer2;
            codeFieldContainer2.setNumbersCount(6, 1);
            while (r12 < r11) {
            }
            addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
            SpoilersTextView spoilersTextView2 = new SpoilersTextView(context, false);
            this.troubleButton = spoilersTextView2;
            spoilersTextView2.setGravity(17);
            this.troubleButton.setTextSize(1, 14.0f);
            this.troubleButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.troubleButton.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.troubleButton.setMaxLines(2);
            this.troubleButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityRecoverView.this.lambda$new$4(view);
                }
            });
            FrameLayout frameLayout22 = new FrameLayout(context);
            frameLayout22.addView(this.troubleButton, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout22, LayoutHelper.createLinear(-1, 0, 1.0f));
            VerticalPositionAutoAnimator.attach(this.troubleButton);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(View view, boolean z) {
            if (z) {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$4(View view) {
            Dialog showDialog = LoginActivity.this.showDialog(new AlertDialog.Builder(LoginActivity.this.getParentActivity()).setTitle(LocaleController.getString("RestorePasswordNoEmailTitle", org.telegram.messenger.R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString("RestoreEmailTroubleText", org.telegram.messenger.R.string.RestoreEmailTroubleText)).setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda6
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.LoginActivityRecoverView.this.lambda$new$2(alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString(org.telegram.messenger.R.string.ResetAccount), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda7
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.LoginActivityRecoverView.this.lambda$new$3(alertDialog, i);
                }
            }).create());
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(AlertDialog alertDialog, int i) {
            LoginActivity.this.setPage(6, true, new Bundle(), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(AlertDialog alertDialog, int i) {
            LoginActivity.this.tryResetAccount(this.requestPhone, this.phoneHash, this.phoneCode);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.confirmTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.troubleButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.codeFieldContainer.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("LoginPassword", org.telegram.messenger.R.string.LoginPassword);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.codeFieldContainer.setText("");
            this.currentParams = bundle;
            this.passwordString = bundle.getString("password");
            this.requestPhone = this.currentParams.getString("requestPhone");
            this.phoneHash = this.currentParams.getString("phoneHash");
            this.phoneCode = this.currentParams.getString("phoneCode");
            String string = this.currentParams.getString("email_unconfirmed_pattern");
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                textStyleRun.start = indexOf;
                int i = lastIndexOf + 1;
                textStyleRun.end = i;
                valueOf.setSpan(new TextStyleSpan(textStyleRun), indexOf, i, 0);
            }
            this.troubleButton.setText(AndroidUtilities.formatSpannable(LocaleController.getString(org.telegram.messenger.R.string.RestoreEmailNoAccess), valueOf));
            LoginActivity.this.showKeyboard(this.codeFieldContainer);
            this.codeFieldContainer.requestFocus();
        }

        private void onPasscodeError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.codeFieldContainer.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (z) {
                for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                    codeNumberField.setText("");
                }
            }
            for (CodeNumberField codeNumberField2 : this.codeFieldContainer.codeField) {
                codeNumberField2.animateErrorProgress(1.0f);
            }
            this.codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.this.lambda$onPasscodeError$6();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPasscodeError$6() {
            postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.this.lambda$onPasscodeError$5();
                }
            }, 150L);
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 3000L);
            this.postedErrorColorTimeout = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPasscodeError$5() {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        /* renamed from: onNextPressed */
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            codeFieldContainer.isFocusSuppressed = true;
            for (CodeNumberField codeNumberField : codeFieldContainer.codeField) {
                codeNumberField.animateFocusedProgress(0.0f);
            }
            final String code = this.codeFieldContainer.getCode();
            if (code.length() == 0) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
            tL_auth_checkRecoveryPassword.code = code;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda1
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityRecoverView.this.lambda$onNextPressed$8(code, tLObject, tL_error);
                }
            }, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$8(final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.this.lambda$onNextPressed$7(tLObject, str, tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$7(TLObject tLObject, String str, TLRPC.TL_error tL_error) {
            String formatPluralString;
            LoginActivity.this.needHideProgress(false);
            this.nextPressed = false;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", str);
                bundle.putString("password", this.passwordString);
                LoginActivity.this.setPage(9, true, bundle, false);
                return;
            }
            if (tL_error == null || tL_error.text.startsWith("CODE_INVALID")) {
                onPasscodeError(true);
                return;
            }
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", org.telegram.messenger.R.string.FloodWaitTime, formatPluralString));
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.this.lambda$onShow$9();
                }
            }, LoginActivity.SHOW_DELAY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShow$9() {
            this.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            this.inboxImageView.playAnimation();
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer != null) {
                codeFieldContainer.codeField[0].requestFocus();
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            String code = this.codeFieldContainer.getCode();
            if (code != null && code.length() != 0) {
                bundle.putString("recoveryview_code", code);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("recoveryview_params", bundle2);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("recoveryview_code");
            if (string != null) {
                this.codeFieldContainer.setText(string);
            }
        }
    }

    public class LoginActivityNewPasswordView extends SlideView {
        private TextView cancelButton;
        private EditTextBoldCursor[] codeField;
        private TextView confirmTextView;
        private Bundle currentParams;
        private TL_account.Password currentPassword;
        private int currentStage;
        private String emailCode;
        private boolean isPasswordVisible;
        private String newPassword;
        private boolean nextPressed;
        private OutlineTextContainerView[] outlineFields;
        private ImageView passwordButton;
        private String passwordString;
        private TextView titleTextView;

        @Override // org.telegram.ui.Components.SlideView
        public boolean needBackButton() {
            return true;
        }

        public LoginActivityNewPasswordView(Context context, int i) {
            super(context);
            int i2;
            this.currentStage = i;
            setOrientation(1);
            int i3 = i == 1 ? 1 : 2;
            this.codeField = new EditTextBoldCursor[i3];
            this.outlineFields = new OutlineTextContainerView[i3];
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            float f = 18.0f;
            textView.setTextSize(1, 18.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.titleTextView.setGravity(49);
            this.titleTextView.setText(LocaleController.getString(org.telegram.messenger.R.string.SetNewPassword));
            int i4 = 16;
            addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 8, AndroidUtilities.isSmallScreen() ? 16 : 72, 8, 0));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 16.0f);
            this.confirmTextView.setGravity(1);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 6, 8, 16));
            final int i5 = 0;
            while (i5 < this.codeField.length) {
                final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                this.outlineFields[i5] = outlineTextContainerView;
                if (i == 0) {
                    i2 = i5 == 0 ? org.telegram.messenger.R.string.PleaseEnterNewFirstPasswordHint : org.telegram.messenger.R.string.PleaseEnterNewSecondPasswordHint;
                } else {
                    i2 = org.telegram.messenger.R.string.PasswordHintPlaceholder;
                }
                outlineTextContainerView.setText(LocaleController.getString(i2));
                this.codeField[i5] = new EditTextBoldCursor(context);
                this.codeField[i5].setCursorSize(AndroidUtilities.dp(20.0f));
                this.codeField[i5].setCursorWidth(1.5f);
                this.codeField[i5].setImeOptions(268435461);
                this.codeField[i5].setTextSize(1, f);
                this.codeField[i5].setMaxLines(1);
                this.codeField[i5].setBackground(null);
                int dp = AndroidUtilities.dp(16.0f);
                this.codeField[i5].setPadding(dp, dp, dp, dp);
                if (i == 0) {
                    this.codeField[i5].setInputType(NotificationCenter.dialogIsTranslatable);
                    this.codeField[i5].setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                this.codeField[i5].setTypeface(Typeface.DEFAULT);
                this.codeField[i5].setGravity(LocaleController.isRTL ? 5 : 3);
                EditTextBoldCursor editTextBoldCursor = this.codeField[i5];
                final boolean z = i5 == 0 && i == 0;
                editTextBoldCursor.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.LoginActivityNewPasswordView.1
                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        if (z) {
                            if (LoginActivityNewPasswordView.this.passwordButton.getVisibility() == 0 || TextUtils.isEmpty(editable)) {
                                if (LoginActivityNewPasswordView.this.passwordButton.getVisibility() == 8 || !TextUtils.isEmpty(editable)) {
                                    return;
                                }
                                AndroidUtilities.updateViewVisibilityAnimated(LoginActivityNewPasswordView.this.passwordButton, false, 0.1f, true);
                                return;
                            }
                            if (LoginActivityNewPasswordView.this.isPasswordVisible) {
                                LoginActivityNewPasswordView.this.passwordButton.callOnClick();
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(LoginActivityNewPasswordView.this.passwordButton, true, 0.1f, true);
                        }
                    }
                });
                this.codeField[i5].setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        LoginActivity.LoginActivityNewPasswordView.lambda$new$0(OutlineTextContainerView.this, view, z2);
                    }
                });
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(i4);
                    linearLayout.addView(this.codeField[i5], LayoutHelper.createLinear(0, -2, 1.0f));
                    ImageView imageView = new ImageView(context);
                    this.passwordButton = imageView;
                    imageView.setImageResource(org.telegram.messenger.R.drawable.msg_message);
                    AndroidUtilities.updateViewVisibilityAnimated(this.passwordButton, true, 0.1f, false);
                    this.passwordButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityNewPasswordView.this.lambda$new$1(view);
                        }
                    });
                    linearLayout.addView(this.passwordButton, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    outlineTextContainerView.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f));
                } else {
                    outlineTextContainerView.addView(this.codeField[i5], LayoutHelper.createFrame(-1, -2.0f));
                }
                outlineTextContainerView.attachEditText(this.codeField[i5]);
                addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2, 1, 16, 16, 16, 0));
                this.codeField[i5].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda4
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView3, int i6, KeyEvent keyEvent) {
                        boolean lambda$new$2;
                        lambda$new$2 = LoginActivity.LoginActivityNewPasswordView.this.lambda$new$2(i5, textView3, i6, keyEvent);
                        return lambda$new$2;
                    }
                });
                i5++;
                f = 18.0f;
                i4 = 16;
            }
            if (i == 0) {
                this.confirmTextView.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", org.telegram.messenger.R.string.PleaseEnterNewFirstPasswordLogin));
            } else {
                this.confirmTextView.setText(LocaleController.getString("PasswordHintTextLogin", org.telegram.messenger.R.string.PasswordHintTextLogin));
            }
            TextView textView3 = new TextView(context);
            this.cancelButton = textView3;
            textView3.setGravity(19);
            this.cancelButton.setTextSize(1, 15.0f);
            this.cancelButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.cancelButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.cancelButton.setText(LocaleController.getString(org.telegram.messenger.R.string.YourEmailSkip));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(this.cancelButton, LayoutHelper.createFrame(-1, 56, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout, LayoutHelper.createLinear(-1, -1, 80));
            VerticalPositionAutoAnimator.attach(this.cancelButton);
            this.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityNewPasswordView.this.lambda$new$3(view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$0(OutlineTextContainerView outlineTextContainerView, View view, boolean z) {
            outlineTextContainerView.animateSelection(z ? 1.0f : 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(View view) {
            this.isPasswordVisible = !this.isPasswordVisible;
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                int selectionStart = editTextBoldCursorArr[i].getSelectionStart();
                int selectionEnd = this.codeField[i].getSelectionEnd();
                this.codeField[i].setInputType((this.isPasswordVisible ? NotificationCenter.fileNewChunkAvailable : 128) | 1);
                this.codeField[i].setSelection(selectionStart, selectionEnd);
                i++;
            }
            this.passwordButton.setTag(Boolean.valueOf(this.isPasswordVisible));
            this.passwordButton.setColorFilter(Theme.getColor(this.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$2(int i, TextView textView, int i2, KeyEvent keyEvent) {
            if (i == 0) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                if (editTextBoldCursorArr.length == 2) {
                    editTextBoldCursorArr[1].requestFocus();
                    return true;
                }
            }
            if (i2 != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(View view) {
            if (this.currentStage == 0) {
                recoverPassword(null, null);
            } else {
                recoverPassword(this.newPassword, null);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            this.titleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.confirmTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            for (EditTextBoldCursor editTextBoldCursor : this.codeField) {
                editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
                editTextBoldCursor.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated));
            }
            for (OutlineTextContainerView outlineTextContainerView : this.outlineFields) {
                outlineTextContainerView.updateColor();
            }
            this.cancelButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            ImageView imageView = this.passwordButton;
            if (imageView != null) {
                imageView.setColorFilter(Theme.getColor(this.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText));
                this.passwordButton.setBackground(Theme.createSelectorDrawable(LoginActivity.this.getThemedColor(Theme.key_listSelector), 1));
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("NewPassword", org.telegram.messenger.R.string.NewPassword);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                editTextBoldCursorArr[i].setText("");
                i++;
            }
            this.currentParams = bundle;
            this.emailCode = bundle.getString("emailCode");
            String string = this.currentParams.getString("password");
            this.passwordString = string;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                this.currentPassword = TLdeserialize;
                TwoStepVerificationActivity.initPasswordNewAlgo(TLdeserialize);
            }
            this.newPassword = this.currentParams.getString("new_password");
            LoginActivity.this.showKeyboard(this.codeField[0]);
            this.codeField[0].requestFocus();
        }

        private void onPasscodeError(boolean z, int i) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.codeField[i].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeView(this.codeField[i]);
        }

        @Override // org.telegram.ui.Components.SlideView
        /* renamed from: onNextPressed */
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            String obj = this.codeField[0].getText().toString();
            if (obj.length() == 0) {
                onPasscodeError(false, 0);
                return;
            }
            if (this.currentStage == 0) {
                if (!obj.equals(this.codeField[1].getText().toString())) {
                    onPasscodeError(false, 1);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.emailCode);
                bundle.putString("new_password", obj);
                bundle.putString("password", this.passwordString);
                LoginActivity.this.setPage(10, true, bundle, false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            recoverPassword(this.newPassword, obj);
        }

        private void recoverPassword(final String str, final String str2) {
            final TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.emailCode;
            if (!TextUtils.isEmpty(str)) {
                tL_auth_recoverPassword.flags |= 1;
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                tL_auth_recoverPassword.new_settings = passwordinputsettings;
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = str2 != null ? str2 : "";
                passwordinputsettings.new_algo = this.currentPassword.new_algo;
            }
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.this.lambda$recoverPassword$9(str, str2, tL_auth_recoverPassword);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$recoverPassword$9(final String str, final String str2, TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword) {
            byte[] stringBytes = str != null ? AndroidUtilities.getStringBytes(str) : null;
            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityNewPasswordView.this.lambda$recoverPassword$8(str, str2, tLObject, tL_error);
                }
            };
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        requestDelegate.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_recoverPassword, requestDelegate, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            requestDelegate.run(null, tL_error2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$recoverPassword$8(final String str, final String str2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.this.lambda$recoverPassword$7(tL_error, str, str2, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$recoverPassword$7(TLRPC.TL_error tL_error, final String str, final String str2, final TLObject tLObject) {
            String formatPluralString;
            if (tL_error == null || (!"SRP_ID_INVALID".equals(tL_error.text) && !"NEW_SALT_INVALID".equals(tL_error.text))) {
                LoginActivity.this.needHideProgress(false);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                    builder.setPositiveButton(LocaleController.getString(org.telegram.messenger.R.string.Continue), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda9
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i) {
                            LoginActivity.LoginActivityNewPasswordView.this.lambda$recoverPassword$6(tLObject, alertDialog, i);
                        }
                    });
                    if (TextUtils.isEmpty(str)) {
                        builder.setMessage(LocaleController.getString(org.telegram.messenger.R.string.YourPasswordReset));
                    } else {
                        builder.setMessage(LocaleController.getString(org.telegram.messenger.R.string.YourPasswordChangedSuccessText));
                    }
                    builder.setTitle(LocaleController.getString(org.telegram.messenger.R.string.TwoStepVerificationTitle));
                    Dialog showDialog = LoginActivity.this.showDialog(builder.create());
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                if (tL_error != null) {
                    this.nextPressed = false;
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
                        return;
                    }
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", org.telegram.messenger.R.string.FloodWaitTime, formatPluralString));
                    return;
                }
                return;
            }
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda8
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    LoginActivity.LoginActivityNewPasswordView.this.lambda$recoverPassword$5(str, str2, tLObject2, tL_error2);
                }
            }, 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$recoverPassword$5(final String str, final String str2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.this.lambda$recoverPassword$4(tL_error, tLObject, str, str2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$recoverPassword$4(TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
            if (tL_error == null) {
                TL_account.Password password = (TL_account.Password) tLObject;
                this.currentPassword = password;
                TwoStepVerificationActivity.initPasswordNewAlgo(password);
                recoverPassword(str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$recoverPassword$6(TLObject tLObject, AlertDialog alertDialog, int i) {
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.this.lambda$onShow$10();
                }
            }, LoginActivity.SHOW_DELAY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShow$10() {
            EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                EditTextBoldCursor editTextBoldCursor = this.codeField[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                AndroidUtilities.showKeyboard(this.codeField[0]);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            if (this.currentParams != null) {
                bundle.putBundle("recoveryview_params" + this.currentStage, this.currentParams);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.currentStage);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }
    }

    public class LoginActivityRegisterView extends SlideView implements ImageUpdater.ImageUpdaterDelegate {
        private TLRPC.FileLocation avatar;
        private AnimatorSet avatarAnimation;
        private TLRPC.FileLocation avatarBig;
        private AvatarDrawable avatarDrawable;
        private RLottieImageView avatarEditor;
        private BackupImageView avatarImage;
        private View avatarOverlay;
        private RadialProgressView avatarProgressView;
        private RLottieDrawable cameraDrawable;
        private RLottieDrawable cameraWaitDrawable;
        private Bundle currentParams;
        private TextView descriptionTextView;
        private FrameLayout editTextContainer;
        private EditTextBoldCursor firstNameField;
        private OutlineTextContainerView firstNameOutlineView;
        private ImageUpdater imageUpdater;
        private boolean isCameraWaitAnimationAllowed;
        private EditTextBoldCursor lastNameField;
        private OutlineTextContainerView lastNameOutlineView;
        private boolean nextPressed;
        private String phoneHash;
        private TextView privacyView;
        private String requestPhone;
        private TextView titleTextView;
        private TextView wrongNumber;

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ boolean canFinishFragment() {
            return ImageUpdater.ImageUpdaterDelegate.-CC.$default$canFinishFragment(this);
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ void didStartUpload(boolean z, boolean z2) {
            ImageUpdater.ImageUpdaterDelegate.-CC.$default$didStartUpload(this, z, z2);
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ void didUploadFailed() {
            ImageUpdater.ImageUpdaterDelegate.-CC.$default$didUploadFailed(this);
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* bridge */ /* synthetic */ PhotoViewer.PlaceProviderObject getCloseIntoObject() {
            return ImageUpdater.ImageUpdaterDelegate.-CC.$default$getCloseIntoObject(this);
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* bridge */ /* synthetic */ String getInitialSearchString() {
            return ImageUpdater.ImageUpdaterDelegate.-CC.$default$getInitialSearchString(this);
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean needBackButton() {
            return true;
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ void onUploadProgressChanged(float f) {
            ImageUpdater.ImageUpdaterDelegate.-CC.$default$onUploadProgressChanged(this, f);
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ boolean supportsBulletin() {
            return ImageUpdater.ImageUpdaterDelegate.-CC.$default$supportsBulletin(this);
        }

        public class LinkSpan extends ClickableSpan {
            public LinkSpan() {
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                LoginActivityRegisterView.this.showTermsOfService(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void showTermsOfService(boolean z) {
            if (LoginActivity.this.currentTermsOfService == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("TermsOfService", org.telegram.messenger.R.string.TermsOfService));
            if (z) {
                builder.setPositiveButton(LocaleController.getString("Accept", org.telegram.messenger.R.string.Accept), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda10
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivityRegisterView.this.lambda$showTermsOfService$0(alertDialog, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Decline", org.telegram.messenger.R.string.Decline), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda11
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivityRegisterView.this.lambda$showTermsOfService$3(alertDialog, i);
                    }
                });
            } else {
                builder.setPositiveButton(LocaleController.getString("OK", org.telegram.messenger.R.string.OK), null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LoginActivity.this.currentTermsOfService.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, LoginActivity.this.currentTermsOfService.entities, false, false, false, false);
            builder.setMessage(spannableStringBuilder);
            LoginActivity.this.showDialog(builder.create());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$showTermsOfService$0(AlertDialog alertDialog, int i) {
            LoginActivity.this.currentTermsOfService.popup = false;
            lambda$onNextPressed$16(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$showTermsOfService$3(AlertDialog alertDialog, int i) {
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("TermsOfService", org.telegram.messenger.R.string.TermsOfService));
            builder.setMessage(LocaleController.getString("TosDecline", org.telegram.messenger.R.string.TosDecline));
            builder.setPositiveButton(LocaleController.getString("SignUp", org.telegram.messenger.R.string.SignUp), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda15
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    LoginActivity.LoginActivityRegisterView.this.lambda$showTermsOfService$1(alertDialog2, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Decline", org.telegram.messenger.R.string.Decline), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda16
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    LoginActivity.LoginActivityRegisterView.this.lambda$showTermsOfService$2(alertDialog2, i2);
                }
            });
            LoginActivity.this.showDialog(builder.create());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$showTermsOfService$1(AlertDialog alertDialog, int i) {
            LoginActivity.this.currentTermsOfService.popup = false;
            lambda$onNextPressed$16(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$showTermsOfService$2(AlertDialog alertDialog, int i) {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
        }

        public LoginActivityRegisterView(Context context) {
            super(context);
            this.nextPressed = false;
            this.isCameraWaitAnimationAllowed = true;
            setOrientation(1);
            ImageUpdater imageUpdater = new ImageUpdater(false, 0, false);
            this.imageUpdater = imageUpdater;
            imageUpdater.setOpenWithFrontfaceCamera(true);
            this.imageUpdater.setSearchAvailable(false);
            this.imageUpdater.setUploadAfterSelect(false);
            ImageUpdater imageUpdater2 = this.imageUpdater;
            imageUpdater2.parentFragment = LoginActivity.this;
            imageUpdater2.setDelegate(this);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, LayoutHelper.createLinear(78, 78, 1));
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView = new BackupImageView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityRegisterView.1
                @Override // android.view.View
                public void invalidate() {
                    if (LoginActivityRegisterView.this.avatarOverlay != null) {
                        LoginActivityRegisterView.this.avatarOverlay.invalidate();
                    }
                    super.invalidate();
                }

                @Override // android.view.View
                public void invalidate(int i, int i2, int i3, int i4) {
                    if (LoginActivityRegisterView.this.avatarOverlay != null) {
                        LoginActivityRegisterView.this.avatarOverlay.invalidate();
                    }
                    super.invalidate(i, i2, i3, i4);
                }
            };
            this.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(64.0f));
            this.avatarDrawable.setAvatarType(13);
            this.avatarDrawable.setInfo(5L, null, null);
            this.avatarImage.setImageDrawable(this.avatarDrawable);
            frameLayout.addView(this.avatarImage, LayoutHelper.createFrame(-1, -1.0f));
            final Paint paint = new Paint(1);
            paint.setColor(1426063360);
            View view = new View(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityRegisterView.2
                @Override // android.view.View
                protected void onDraw(Canvas canvas) {
                    if (LoginActivityRegisterView.this.avatarImage == null || LoginActivityRegisterView.this.avatarProgressView.getVisibility() != 0) {
                        return;
                    }
                    paint.setAlpha((int) (LoginActivityRegisterView.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f * LoginActivityRegisterView.this.avatarProgressView.getAlpha()));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
            };
            this.avatarOverlay = view;
            frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
            this.avatarOverlay.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.LoginActivityRegisterView.this.lambda$new$7(view2);
                }
            });
            int i = org.telegram.messenger.R.raw.camera;
            this.cameraDrawable = new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
            int i2 = org.telegram.messenger.R.raw.camera_wait;
            this.cameraWaitDrawable = new RLottieDrawable(i2, String.valueOf(i2), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
            RLottieImageView rLottieImageView = new RLottieImageView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityRegisterView.3
                @Override // android.view.View
                public void invalidate(int i3, int i4, int i5, int i6) {
                    super.invalidate(i3, i4, i5, i6);
                    LoginActivityRegisterView.this.avatarOverlay.invalidate();
                }

                @Override // android.view.View
                public void invalidate() {
                    super.invalidate();
                    LoginActivityRegisterView.this.avatarOverlay.invalidate();
                }
            };
            this.avatarEditor = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            this.avatarEditor.setAnimation(this.cameraDrawable);
            this.avatarEditor.setEnabled(false);
            this.avatarEditor.setClickable(false);
            frameLayout.addView(this.avatarEditor, LayoutHelper.createFrame(-1, -1.0f));
            this.avatarEditor.addOnAttachStateChangeListener(new 4(LoginActivity.this));
            RadialProgressView radialProgressView = new RadialProgressView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityRegisterView.5
                @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
                public void setAlpha(float f) {
                    super.setAlpha(f);
                    LoginActivityRegisterView.this.avatarOverlay.invalidate();
                }
            };
            this.avatarProgressView = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.avatarProgressView.setProgressColor(-1);
            frameLayout.addView(this.avatarProgressView, LayoutHelper.createFrame(-1, -1.0f));
            showAvatarProgress(false, false);
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setText(LocaleController.getString(org.telegram.messenger.R.string.RegistrationProfileInfo));
            this.titleTextView.setTextSize(1, 18.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.titleTextView.setGravity(1);
            addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 12, 8, 0));
            TextView textView2 = new TextView(context);
            this.descriptionTextView = textView2;
            textView2.setText(LocaleController.getString("RegisterText2", org.telegram.messenger.R.string.RegisterText2));
            this.descriptionTextView.setGravity(1);
            this.descriptionTextView.setTextSize(1, 14.0f);
            this.descriptionTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.descriptionTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 6, 8, 0));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.editTextContainer = frameLayout2;
            addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 8.0f, 21.0f, 8.0f, 0.0f));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
            this.firstNameOutlineView = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(org.telegram.messenger.R.string.FirstName));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.firstNameField = editTextBoldCursor;
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            this.firstNameField.setCursorWidth(1.5f);
            this.firstNameField.setImeOptions(268435461);
            this.firstNameField.setTextSize(1, 17.0f);
            this.firstNameField.setMaxLines(1);
            this.firstNameField.setInputType(8192);
            this.firstNameField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    LoginActivity.LoginActivityRegisterView.this.lambda$new$8(view2, z);
                }
            });
            this.firstNameField.setBackground(null);
            this.firstNameField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.firstNameOutlineView.attachEditText(this.firstNameField);
            this.firstNameOutlineView.addView(this.firstNameField, LayoutHelper.createFrame(-1, -2, 48));
            this.firstNameField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda4
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i3, KeyEvent keyEvent) {
                    boolean lambda$new$9;
                    lambda$new$9 = LoginActivity.LoginActivityRegisterView.this.lambda$new$9(textView3, i3, keyEvent);
                    return lambda$new$9;
                }
            });
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.lastNameOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.setText(LocaleController.getString(org.telegram.messenger.R.string.LastName));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.lastNameField = editTextBoldCursor2;
            editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
            this.lastNameField.setCursorWidth(1.5f);
            this.lastNameField.setImeOptions(268435462);
            this.lastNameField.setTextSize(1, 17.0f);
            this.lastNameField.setMaxLines(1);
            this.lastNameField.setInputType(8192);
            this.lastNameField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    LoginActivity.LoginActivityRegisterView.this.lambda$new$10(view2, z);
                }
            });
            this.lastNameField.setBackground(null);
            this.lastNameField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.lastNameOutlineView.attachEditText(this.lastNameField);
            this.lastNameOutlineView.addView(this.lastNameField, LayoutHelper.createFrame(-1, -2, 48));
            this.lastNameField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda6
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i3, KeyEvent keyEvent) {
                    boolean lambda$new$11;
                    lambda$new$11 = LoginActivity.LoginActivityRegisterView.this.lambda$new$11(textView3, i3, keyEvent);
                    return lambda$new$11;
                }
            });
            buildEditTextLayout(AndroidUtilities.isSmallScreen());
            TextView textView3 = new TextView(context);
            this.wrongNumber = textView3;
            textView3.setText(LocaleController.getString("CancelRegistration", org.telegram.messenger.R.string.CancelRegistration));
            this.wrongNumber.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
            this.wrongNumber.setTextSize(1, 14.0f);
            this.wrongNumber.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.wrongNumber.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
            this.wrongNumber.setVisibility(8);
            addView(this.wrongNumber, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
            this.wrongNumber.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.LoginActivityRegisterView.this.lambda$new$12(view2);
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            addView(frameLayout3, LayoutHelper.createLinear(-1, -1, 83));
            TextView textView4 = new TextView(context);
            this.privacyView = textView4;
            textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            this.privacyView.setTextSize(1, AndroidUtilities.isSmallScreen() ? 13.0f : 14.0f);
            this.privacyView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.privacyView.setGravity(16);
            frameLayout3.addView(this.privacyView, LayoutHelper.createFrame(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
            VerticalPositionAutoAnimator.attach(this.privacyView);
            String string = LocaleController.getString("TermsOfServiceLogin", org.telegram.messenger.R.string.TermsOfServiceLogin);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new LinkSpan(), indexOf, lastIndexOf - 1, 33);
            }
            this.privacyView.setText(spannableStringBuilder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$7(View view) {
            this.imageUpdater.openMenu(this.avatar != null, new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.this.lambda$new$4();
                }
            }, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda13
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LoginActivity.LoginActivityRegisterView.this.lambda$new$6(dialogInterface);
                }
            }, 0);
            this.isCameraWaitAnimationAllowed = false;
            this.avatarEditor.setAnimation(this.cameraDrawable);
            this.cameraDrawable.setCurrentFrame(0);
            this.cameraDrawable.setCustomEndFrame(43);
            this.avatarEditor.playAnimation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$4() {
            this.avatar = null;
            this.avatarBig = null;
            showAvatarProgress(false, true);
            this.avatarImage.setImage((ImageLocation) null, (String) null, this.avatarDrawable, (Object) null);
            this.avatarEditor.setAnimation(this.cameraDrawable);
            this.cameraDrawable.setCurrentFrame(0);
            this.isCameraWaitAnimationAllowed = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$6(DialogInterface dialogInterface) {
            if (!this.imageUpdater.isUploadingImage()) {
                this.avatarEditor.setAnimation(this.cameraDrawable);
                this.cameraDrawable.setCustomEndFrame(86);
                this.avatarEditor.setOnAnimationEndListener(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityRegisterView.this.lambda$new$5();
                    }
                });
                this.avatarEditor.playAnimation();
                return;
            }
            this.avatarEditor.setAnimation(this.cameraDrawable);
            this.cameraDrawable.setCurrentFrame(0, false);
            this.isCameraWaitAnimationAllowed = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$5() {
            this.isCameraWaitAnimationAllowed = true;
        }

        class 4 implements View.OnAttachStateChangeListener {
            private boolean isAttached;
            final /* synthetic */ LoginActivity val$this$0;
            private long lastRun = System.currentTimeMillis();
            private Runnable cameraWaitCallback = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.4.this.lambda$$2();
                }
            };

            4(LoginActivity loginActivity) {
                this.val$this$0 = loginActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$$2() {
                if (this.isAttached) {
                    if (LoginActivityRegisterView.this.isCameraWaitAnimationAllowed && System.currentTimeMillis() - this.lastRun >= 10000) {
                        LoginActivityRegisterView.this.avatarEditor.setAnimation(LoginActivityRegisterView.this.cameraWaitDrawable);
                        LoginActivityRegisterView.this.cameraWaitDrawable.setCurrentFrame(0, false);
                        LoginActivityRegisterView.this.cameraWaitDrawable.setOnAnimationEndListener(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                LoginActivity.LoginActivityRegisterView.4.this.lambda$$1();
                            }
                        });
                        LoginActivityRegisterView.this.avatarEditor.playAnimation();
                        this.lastRun = System.currentTimeMillis();
                    }
                    LoginActivityRegisterView.this.avatarEditor.postDelayed(this.cameraWaitCallback, 1000L);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$$1() {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityRegisterView.4.this.lambda$$0();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$$0() {
                LoginActivityRegisterView.this.cameraDrawable.setCurrentFrame(0, false);
                LoginActivityRegisterView.this.avatarEditor.setAnimation(LoginActivityRegisterView.this.cameraDrawable);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                this.isAttached = true;
                view.post(this.cameraWaitCallback);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.isAttached = false;
                view.removeCallbacks(this.cameraWaitCallback);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$8(View view, boolean z) {
            this.firstNameOutlineView.animateSelection(z ? 1.0f : 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$9(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            this.lastNameField.requestFocus();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$10(View view, boolean z) {
            this.lastNameOutlineView.animateSelection(z ? 1.0f : 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$11(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$12(View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            onBackPressed(false);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            this.avatarDrawable.invalidateSelf();
            TextView textView = this.titleTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            TextView textView2 = this.descriptionTextView;
            int i2 = Theme.key_windowBackgroundWhiteGrayText6;
            textView2.setTextColor(Theme.getColor(i2));
            this.firstNameField.setTextColor(Theme.getColor(i));
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            int i3 = Theme.key_windowBackgroundWhiteInputFieldActivated;
            editTextBoldCursor.setCursorColor(Theme.getColor(i3));
            this.lastNameField.setTextColor(Theme.getColor(i));
            this.lastNameField.setCursorColor(Theme.getColor(i3));
            this.wrongNumber.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.privacyView.setTextColor(Theme.getColor(i2));
            this.privacyView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText));
            this.firstNameOutlineView.updateColor();
            this.lastNameOutlineView.updateColor();
        }

        private void buildEditTextLayout(boolean z) {
            boolean hasFocus = this.firstNameField.hasFocus();
            boolean hasFocus2 = this.lastNameField.hasFocus();
            this.editTextContainer.removeAllViews();
            if (z) {
                LinearLayout linearLayout = new LinearLayout(LoginActivity.this.getParentActivity());
                linearLayout.setOrientation(0);
                this.firstNameOutlineView.setText(LocaleController.getString(org.telegram.messenger.R.string.FirstNameSmall));
                this.lastNameOutlineView.setText(LocaleController.getString(org.telegram.messenger.R.string.LastNameSmall));
                linearLayout.addView(this.firstNameOutlineView, LayoutHelper.createLinear(0, -2, 1.0f, 0, 0, 8, 0));
                linearLayout.addView(this.lastNameOutlineView, LayoutHelper.createLinear(0, -2, 1.0f, 8, 0, 0, 0));
                this.editTextContainer.addView(linearLayout);
                if (hasFocus) {
                    this.firstNameField.requestFocus();
                    AndroidUtilities.showKeyboard(this.firstNameField);
                    return;
                } else {
                    if (hasFocus2) {
                        this.lastNameField.requestFocus();
                        AndroidUtilities.showKeyboard(this.lastNameField);
                        return;
                    }
                    return;
                }
            }
            this.firstNameOutlineView.setText(LocaleController.getString(org.telegram.messenger.R.string.FirstName));
            this.lastNameOutlineView.setText(LocaleController.getString(org.telegram.messenger.R.string.LastName));
            this.editTextContainer.addView(this.firstNameOutlineView, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            this.editTextContainer.addView(this.lastNameOutlineView, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.this.lambda$didUploadPhoto$13(photoSize2, photoSize);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didUploadPhoto$13(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.avatar = fileLocation;
            this.avatarBig = photoSize2.location;
            this.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, (Object) null);
        }

        private void showAvatarProgress(final boolean z, boolean z2) {
            if (this.avatarEditor == null) {
                return;
            }
            AnimatorSet animatorSet = this.avatarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.avatarAnimation = null;
            }
            if (!z2) {
                if (z) {
                    this.avatarEditor.setAlpha(1.0f);
                    this.avatarEditor.setVisibility(4);
                    this.avatarProgressView.setAlpha(1.0f);
                    this.avatarProgressView.setVisibility(0);
                    return;
                }
                this.avatarEditor.setAlpha(1.0f);
                this.avatarEditor.setVisibility(0);
                this.avatarProgressView.setAlpha(0.0f);
                this.avatarProgressView.setVisibility(4);
                return;
            }
            this.avatarAnimation = new AnimatorSet();
            if (z) {
                this.avatarProgressView.setVisibility(0);
                AnimatorSet animatorSet2 = this.avatarAnimation;
                RLottieImageView rLottieImageView = this.avatarEditor;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property, 1.0f));
            } else {
                this.avatarEditor.setVisibility(0);
                AnimatorSet animatorSet3 = this.avatarAnimation;
                RLottieImageView rLottieImageView2 = this.avatarEditor;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(rLottieImageView2, (Property<RLottieImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property2, 0.0f));
            }
            this.avatarAnimation.setDuration(180L);
            this.avatarAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.LoginActivityRegisterView.6
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (LoginActivityRegisterView.this.avatarAnimation == null || LoginActivityRegisterView.this.avatarEditor == null) {
                        return;
                    }
                    if (z) {
                        LoginActivityRegisterView.this.avatarEditor.setVisibility(4);
                    } else {
                        LoginActivityRegisterView.this.avatarProgressView.setVisibility(4);
                    }
                    LoginActivityRegisterView.this.avatarAnimation = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    LoginActivityRegisterView.this.avatarAnimation = null;
                }
            });
            this.avatarAnimation.start();
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean onBackPressed(boolean z) {
            if (z) {
                LoginActivity.this.needHideProgress(true);
                this.nextPressed = false;
                this.currentParams = null;
                return true;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString(org.telegram.messenger.R.string.Warning));
            builder.setMessage(LocaleController.getString("AreYouSureRegistration", org.telegram.messenger.R.string.AreYouSureRegistration));
            builder.setNegativeButton(LocaleController.getString("Stop", org.telegram.messenger.R.string.Stop), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.LoginActivityRegisterView.this.lambda$onBackPressed$14(alertDialog, i);
                }
            });
            builder.setPositiveButton(LocaleController.getString("Continue", org.telegram.messenger.R.string.Continue), null);
            LoginActivity.this.showDialog(builder.create());
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBackPressed$14(AlertDialog alertDialog, int i) {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            hidePrivacyView();
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("YourName", org.telegram.messenger.R.string.YourName);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            if (this.privacyView != null) {
                if (LoginActivity.this.restoringState) {
                    this.privacyView.setAlpha(1.0f);
                } else {
                    this.privacyView.setAlpha(0.0f);
                    this.privacyView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
                }
            }
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = this.firstNameField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(this.firstNameField);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.this.lambda$onShow$15();
                }
            }, LoginActivity.SHOW_DELAY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShow$15() {
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = this.firstNameField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(this.firstNameField);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.firstNameField.setText("");
            this.lastNameField.setText("");
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.currentParams = bundle;
        }

        @Override // org.telegram.ui.Components.SlideView
        /* renamed from: onNextPressed */
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            if (LoginActivity.this.currentTermsOfService != null && LoginActivity.this.currentTermsOfService.popup) {
                showTermsOfService(true);
                return;
            }
            if (this.firstNameField.length() == 0) {
                LoginActivity.this.onFieldError(this.firstNameOutlineView, true);
                return;
            }
            this.nextPressed = true;
            TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
            tL_auth_signUp.phone_code_hash = this.phoneHash;
            tL_auth_signUp.phone_number = this.requestPhone;
            tL_auth_signUp.first_name = this.firstNameField.getText().toString();
            tL_auth_signUp.last_name = this.lastNameField.getText().toString();
            LoginActivity.this.needShowProgress(0);
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_signUp, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda8
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityRegisterView.this.lambda$onNextPressed$19(tLObject, tL_error);
                }
            }, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$19(final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.this.lambda$onNextPressed$18(tLObject, tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$18(final TLObject tLObject, TLRPC.TL_error tL_error) {
            this.nextPressed = false;
            if (!(tLObject instanceof TLRPC.TL_auth_authorization)) {
                LoginActivity.this.needHideProgress(false);
                if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", org.telegram.messenger.R.string.InvalidPhoneNumber));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", org.telegram.messenger.R.string.InvalidCode));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", org.telegram.messenger.R.string.CodeExpired));
                    return;
                } else if (tL_error.text.contains("FIRSTNAME_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", org.telegram.messenger.R.string.InvalidFirstName));
                    return;
                } else if (tL_error.text.contains("LASTNAME_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", org.telegram.messenger.R.string.InvalidLastName));
                    return;
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                }
            }
            hidePrivacyView();
            LoginActivity.this.showDoneButton(false, true);
            postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.this.lambda$onNextPressed$17(tLObject);
                }
            }, 150L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$17(TLObject tLObject) {
            LoginActivity.this.needHideProgress(false, false);
            AndroidUtilities.hideKeyboard(LoginActivity.this.fragmentView.findFocus());
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject, true);
            final TLRPC.FileLocation fileLocation = this.avatarBig;
            if (fileLocation != null) {
                Utilities.cacheClearQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda19
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityRegisterView.this.lambda$onNextPressed$16(fileLocation);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$16(TLRPC.FileLocation fileLocation) {
            MessagesController.getInstance(((BaseFragment) LoginActivity.this).currentAccount).uploadAndApplyUserAvatar(fileLocation);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            String obj = this.firstNameField.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("registerview_first", obj);
            }
            String obj2 = this.lastNameField.getText().toString();
            if (obj2.length() != 0) {
                bundle.putString("registerview_last", obj2);
            }
            if (LoginActivity.this.currentTermsOfService != null) {
                SerializedData serializedData = new SerializedData(LoginActivity.this.currentTermsOfService.getObjectSize());
                LoginActivity.this.currentTermsOfService.serializeToStream(serializedData);
                bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                serializedData.cleanup();
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("registerview_params", bundle2);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            byte[] decode;
            Bundle bundle2 = bundle.getBundle("registerview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            try {
                String string = bundle.getString("terms");
                if (string != null && (decode = Base64.decode(string, 0)) != null) {
                    SerializedData serializedData = new SerializedData(decode);
                    LoginActivity.this.currentTermsOfService = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    serializedData.cleanup();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            String string2 = bundle.getString("registerview_first");
            if (string2 != null) {
                this.firstNameField.setText(string2);
            }
            String string3 = bundle.getString("registerview_last");
            if (string3 != null) {
                this.lastNameField.setText(string3);
            }
        }

        private void hidePrivacyView() {
            this.privacyView.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean showKeyboard(View view) {
        if (isCustomKeyboardVisible()) {
            return true;
        }
        return AndroidUtilities.showKeyboard(view);
    }

    public LoginActivity setIntroView(View view, TextView textView) {
        this.introView = view;
        this.startMessagingButton = textView;
        this.isAnimatingIntro = true;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public AnimatorSet onCustomTransitionAnimation(boolean z, final Runnable runnable) {
        if (!z || this.introView == null) {
            return null;
        }
        if (this.fragmentView.getParent() instanceof View) {
            ((View) this.fragmentView.getParent()).setTranslationX(0.0f);
        }
        final TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(this.fragmentView.getContext());
        transformableLoginButtonView.setButtonText(this.startMessagingButton.getPaint(), this.startMessagingButton.getText().toString());
        final int width = this.startMessagingButton.getWidth();
        final int height = this.startMessagingButton.getHeight();
        final int i = this.floatingButtonIcon.getLayoutParams().width;
        final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
        transformableLoginButtonView.setLayoutParams(layoutParams);
        int[] iArr = new int[2];
        this.fragmentView.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        this.startMessagingButton.getLocationInWindow(iArr);
        final float f = iArr[0] - i2;
        final float f2 = iArr[1] - i3;
        transformableLoginButtonView.setTranslationX(f);
        transformableLoginButtonView.setTranslationY(f2);
        final int width2 = (((getParentLayout().getView().getWidth() - this.floatingButtonIcon.getLayoutParams().width) - ((ViewGroup.MarginLayoutParams) this.floatingButtonContainer.getLayoutParams()).rightMargin) - getParentLayout().getView().getPaddingLeft()) - getParentLayout().getView().getPaddingRight();
        final int height2 = ((((getParentLayout().getView().getHeight() - this.floatingButtonIcon.getLayoutParams().height) - ((ViewGroup.MarginLayoutParams) this.floatingButtonContainer.getLayoutParams()).bottomMargin) - (isCustomKeyboardVisible() ? AndroidUtilities.dp(230.0f) : 0)) - getParentLayout().getView().getPaddingTop()) - getParentLayout().getView().getPaddingBottom();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.12
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                LoginActivity.this.floatingButtonContainer.setVisibility(4);
                LoginActivity.this.keyboardLinearLayout.setAlpha(0.0f);
                LoginActivity.this.fragmentView.setBackgroundColor(0);
                LoginActivity.this.startMessagingButton.setVisibility(4);
                ((FrameLayout) LoginActivity.this.fragmentView).addView(transformableLoginButtonView);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LoginActivity.this.keyboardLinearLayout.setAlpha(1.0f);
                LoginActivity.this.startMessagingButton.setVisibility(0);
                LoginActivity.this.fragmentView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                LoginActivity.this.floatingButtonContainer.setVisibility(0);
                ((FrameLayout) LoginActivity.this.fragmentView).removeView(transformableLoginButtonView);
                if (LoginActivity.this.animationFinishCallback != null) {
                    AndroidUtilities.runOnUIThread(LoginActivity.this.animationFinishCallback);
                    LoginActivity.this.animationFinishCallback = null;
                }
                LoginActivity.this.isAnimatingIntro = false;
                runnable.run();
            }
        });
        final int color = Theme.getColor(Theme.key_windowBackgroundWhite);
        final int alpha = Color.alpha(color);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoginActivity.this.lambda$onCustomTransitionAnimation$32(color, alpha, layoutParams, width, i, height, transformableLoginButtonView, f, width2, f2, height2, valueAnimator);
            }
        });
        ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCustomTransitionAnimation$32(int i, int i2, ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4, int i5, TransformableLoginButtonView transformableLoginButtonView, float f, int i6, float f2, int i7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.keyboardLinearLayout.setAlpha(floatValue);
        this.fragmentView.setBackgroundColor(ColorUtils.setAlphaComponent(i, (int) (i2 * floatValue)));
        float f3 = 1.0f - floatValue;
        this.slideViewsContainer.setTranslationY(AndroidUtilities.dp(20.0f) * f3);
        if (!isCustomKeyboardForceDisabled()) {
            this.keyboardView.setTranslationY(r4.getLayoutParams().height * f3);
            this.floatingButtonContainer.setTranslationY(this.keyboardView.getLayoutParams().height * f3);
        }
        this.introView.setTranslationY((-AndroidUtilities.dp(20.0f)) * floatValue);
        float f4 = (f3 * 0.05f) + 0.95f;
        this.introView.setScaleX(f4);
        this.introView.setScaleY(f4);
        marginLayoutParams.width = (int) (i3 + ((i4 - i3) * floatValue));
        marginLayoutParams.height = (int) (i5 + ((i4 - i5) * floatValue));
        transformableLoginButtonView.requestLayout();
        transformableLoginButtonView.setProgress(floatValue);
        transformableLoginButtonView.setTranslationX(f + ((i6 - f) * floatValue));
        transformableLoginButtonView.setTranslationY(f2 + ((i7 - f2) * floatValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateColors() {
        this.fragmentView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        getParentActivity();
        int dp = AndroidUtilities.dp(56.0f);
        int i = Theme.key_chats_actionBackground;
        this.floatingButtonContainer.setBackground(Theme.createSimpleSelectorCircleDrawable(dp, Theme.getColor(i), Theme.getColor(Theme.key_chats_actionPressedBackground)));
        ImageView imageView = this.backButtonView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        imageView.setColorFilter(Theme.getColor(i2));
        ImageView imageView2 = this.backButtonView;
        int i3 = Theme.key_listSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i3)));
        this.proxyDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.SRC_IN));
        this.proxyDrawable.setColorKey(i2);
        this.proxyButtonView.setBackground(Theme.createSelectorDrawable(Theme.getColor(i3)));
        this.radialProgressView.setProgressColor(Theme.getColor(i));
        TransformableLoginButtonView transformableLoginButtonView = this.floatingButtonIcon;
        int i4 = Theme.key_chats_actionIcon;
        transformableLoginButtonView.setColor(Theme.getColor(i4));
        this.floatingButtonIcon.setBackgroundColor(Theme.getColor(i));
        this.floatingProgressView.setProgressColor(Theme.getColor(i4));
        for (SlideView slideView : this.views) {
            slideView.updateColors();
        }
        this.keyboardView.updateColors();
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.updateColors();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda7
            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public final void didSetColor() {
                LoginActivity.this.updateColors();
            }

            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public /* synthetic */ void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.-CC.$default$onAnimationProgress(this, f);
            }
        }, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText6, Theme.key_windowBackgroundWhiteHintText, Theme.key_listSelector, Theme.key_chats_actionBackground, Theme.key_chats_actionIcon, Theme.key_windowBackgroundWhiteInputField, Theme.key_windowBackgroundWhiteInputFieldActivated, Theme.key_windowBackgroundWhiteValueText, Theme.key_text_RedBold, Theme.key_windowBackgroundWhiteGrayText, Theme.key_checkbox, Theme.key_windowBackgroundWhiteBlueText4, Theme.key_changephoneinfo_image2, Theme.key_chats_actionPressedBackground, Theme.key_text_RedRegular, Theme.key_windowBackgroundWhiteLinkText, Theme.key_checkboxSquareUnchecked, Theme.key_checkboxSquareBackground, Theme.key_checkboxSquareCheck, Theme.key_dialogBackground, Theme.key_dialogTextGray2, Theme.key_dialogTextBlack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryResetAccount(final String str, final String str2, final String str3) {
        if (this.radialProgressView.getTag() != null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setMessage(LocaleController.getString("ResetMyAccountWarningText", org.telegram.messenger.R.string.ResetMyAccountWarningText));
        builder.setTitle(LocaleController.getString("ResetMyAccountWarning", org.telegram.messenger.R.string.ResetMyAccountWarning));
        builder.setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", org.telegram.messenger.R.string.ResetMyAccountWarningReset), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda41
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                LoginActivity.this.lambda$tryResetAccount$35(str, str2, str3, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", org.telegram.messenger.R.string.Cancel), null);
        showDialog(builder.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryResetAccount$35(final String str, final String str2, final String str3, AlertDialog alertDialog, int i) {
        needShowProgress(0);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteaccount, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda42
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LoginActivity.this.lambda$tryResetAccount$34(str, str2, str3, tLObject, tL_error);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryResetAccount$34(final String str, final String str2, final String str3, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                LoginActivity.this.lambda$tryResetAccount$33(tL_error, str, str2, str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryResetAccount$33(TLRPC.TL_error tL_error, String str, String str2, String str3) {
        needHideProgress(false);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                setPage(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            setPage(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", org.telegram.messenger.R.string.ResetAccountCancelledAlert));
            return;
        }
        if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            setPage(8, true, bundle2, false);
            return;
        }
        needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class PhoneNumberConfirmView extends FrameLayout {
        private View blurredView;
        private IConfirmDialogCallback callback;
        private TextView confirmMessageView;
        private TextView confirmTextView;
        private View dimmView;
        private boolean dismissed;
        private TextView editTextView;
        private View fabContainer;
        private TransformableLoginButtonView fabTransform;
        private RadialProgressView floatingProgressView;
        private ViewGroup fragmentView;
        private TextView numberView;
        private FrameLayout popupFabContainer;
        private FrameLayout popupLayout;

        /* JADX INFO: Access modifiers changed from: private */
        interface IConfirmDialogCallback {
            void onConfirmPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView);

            void onDismiss(PhoneNumberConfirmView phoneNumberConfirmView);

            void onEditPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView);

            void onFabPressed(PhoneNumberConfirmView phoneNumberConfirmView, TransformableLoginButtonView transformableLoginButtonView);
        }

        private PhoneNumberConfirmView(Context context, ViewGroup viewGroup, View view, String str, final IConfirmDialogCallback iConfirmDialogCallback) {
            super(context);
            this.fragmentView = viewGroup;
            this.fabContainer = view;
            this.callback = iConfirmDialogCallback;
            View view2 = new View(getContext());
            this.blurredView = view2;
            view2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    LoginActivity.PhoneNumberConfirmView.this.lambda$new$0(view3);
                }
            });
            addView(this.blurredView, LayoutHelper.createFrame(-1, -1.0f));
            View view3 = new View(getContext());
            this.dimmView = view3;
            view3.setBackgroundColor(TLObject.FLAG_30);
            this.dimmView.setAlpha(0.0f);
            addView(this.dimmView, LayoutHelper.createFrame(-1, -1.0f));
            TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(getContext());
            this.fabTransform = transformableLoginButtonView;
            transformableLoginButtonView.setTransformType(1);
            this.fabTransform.setDrawBackground(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.popupFabContainer = frameLayout;
            frameLayout.addView(this.fabTransform, LayoutHelper.createFrame(-1, -1.0f));
            this.popupFabContainer.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    LoginActivity.PhoneNumberConfirmView.this.lambda$new$1(iConfirmDialogCallback, view4);
                }
            });
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.floatingProgressView = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(22.0f));
            this.floatingProgressView.setAlpha(0.0f);
            this.floatingProgressView.setScaleX(0.1f);
            this.floatingProgressView.setScaleY(0.1f);
            this.popupFabContainer.addView(this.floatingProgressView, LayoutHelper.createFrame(-1, -1.0f));
            this.popupFabContainer.setContentDescription(LocaleController.getString(org.telegram.messenger.R.string.Done));
            addView(this.popupFabContainer, LayoutHelper.createFrame(56, 56.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.popupLayout = frameLayout2;
            addView(frameLayout2, LayoutHelper.createFrame(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
            TextView textView = new TextView(context);
            this.confirmMessageView = textView;
            textView.setText(LocaleController.getString(org.telegram.messenger.R.string.ConfirmCorrectNumber));
            this.confirmMessageView.setTextSize(1, 14.0f);
            this.confirmMessageView.setSingleLine();
            this.popupLayout.addView(this.confirmMessageView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.numberView = textView2;
            textView2.setText(str);
            this.numberView.setTextSize(1, 18.0f);
            this.numberView.setTypeface(AndroidUtilities.bold());
            this.numberView.setSingleLine();
            this.popupLayout.addView(this.numberView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
            int dp = AndroidUtilities.dp(16.0f);
            TextView textView3 = new TextView(context);
            this.editTextView = textView3;
            textView3.setText(LocaleController.getString(org.telegram.messenger.R.string.Edit));
            this.editTextView.setSingleLine();
            this.editTextView.setTextSize(1, 16.0f);
            TextView textView4 = this.editTextView;
            int dp2 = AndroidUtilities.dp(6.0f);
            int i = Theme.key_changephoneinfo_image2;
            textView4.setBackground(Theme.getRoundRectSelectorDrawable(dp2, Theme.getColor(i)));
            this.editTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    LoginActivity.PhoneNumberConfirmView.this.lambda$new$2(iConfirmDialogCallback, view4);
                }
            });
            TextView textView5 = this.editTextView;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView5.setTypeface(typeface);
            int i2 = dp / 2;
            this.editTextView.setPadding(dp, i2, dp, i2);
            float f = 8;
            this.popupLayout.addView(this.editTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f, f, f, f));
            TextView textView6 = new TextView(context);
            this.confirmTextView = textView6;
            textView6.setText(LocaleController.getString(org.telegram.messenger.R.string.CheckPhoneNumberYes));
            this.confirmTextView.setSingleLine();
            this.confirmTextView.setTextSize(1, 16.0f);
            this.confirmTextView.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(i)));
            this.confirmTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    LoginActivity.PhoneNumberConfirmView.this.lambda$new$3(iConfirmDialogCallback, view4);
                }
            });
            this.confirmTextView.setTypeface(typeface);
            this.confirmTextView.setPadding(dp, i2, dp, i2);
            this.popupLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f, f, f, f));
            updateFabPosition();
            updateColors();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(IConfirmDialogCallback iConfirmDialogCallback, View view) {
            iConfirmDialogCallback.onFabPressed(this, this.fabTransform);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(IConfirmDialogCallback iConfirmDialogCallback, View view) {
            iConfirmDialogCallback.onEditPressed(this, this.editTextView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(IConfirmDialogCallback iConfirmDialogCallback, View view) {
            iConfirmDialogCallback.onConfirmPressed(this, this.confirmTextView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateFabPosition() {
            int[] iArr = new int[2];
            this.fragmentView.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            this.fabContainer.getLocationInWindow(iArr);
            this.popupFabContainer.setTranslationX(iArr[0] - i);
            this.popupFabContainer.setTranslationY(iArr[1] - i2);
            requestLayout();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateColors() {
            TransformableLoginButtonView transformableLoginButtonView = this.fabTransform;
            int i = Theme.key_chats_actionIcon;
            transformableLoginButtonView.setColor(Theme.getColor(i));
            TransformableLoginButtonView transformableLoginButtonView2 = this.fabTransform;
            int i2 = Theme.key_chats_actionBackground;
            transformableLoginButtonView2.setBackgroundColor(Theme.getColor(i2));
            this.popupLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(Theme.key_dialogBackground)));
            this.confirmMessageView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2));
            this.numberView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            TextView textView = this.editTextView;
            int i3 = Theme.key_changephoneinfo_image2;
            textView.setTextColor(Theme.getColor(i3));
            this.confirmTextView.setTextColor(Theme.getColor(i3));
            this.popupFabContainer.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(i2), Theme.getColor(Theme.key_chats_actionPressedBackground)));
            this.floatingProgressView.setProgressColor(Theme.getColor(i));
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int measuredHeight = this.popupLayout.getMeasuredHeight();
            int translationY = (int) (this.popupFabContainer.getTranslationY() - AndroidUtilities.dp(32.0f));
            FrameLayout frameLayout = this.popupLayout;
            frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, this.popupLayout.getRight(), translationY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void show() {
            View view = this.fabContainer;
            ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Z, view.getTranslationZ(), 0.0f).setDuration(150L).start();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.PhoneNumberConfirmView.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    PhoneNumberConfirmView.this.fabContainer.setVisibility(8);
                    int measuredWidth = (int) (PhoneNumberConfirmView.this.fragmentView.getMeasuredWidth() / 10.0f);
                    int measuredHeight = (int) (PhoneNumberConfirmView.this.fragmentView.getMeasuredHeight() / 10.0f);
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.scale(0.1f, 0.1f);
                    canvas.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    PhoneNumberConfirmView.this.fragmentView.draw(canvas);
                    Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                    PhoneNumberConfirmView.this.blurredView.setBackground(new BitmapDrawable(PhoneNumberConfirmView.this.getContext().getResources(), createBitmap));
                    PhoneNumberConfirmView.this.blurredView.setAlpha(0.0f);
                    PhoneNumberConfirmView.this.blurredView.setVisibility(0);
                    PhoneNumberConfirmView.this.fragmentView.addView(PhoneNumberConfirmView.this);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                        PhoneNumberConfirmView.this.popupFabContainer.requestFocus();
                    }
                }
            });
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.PhoneNumberConfirmView.this.lambda$show$4(valueAnimator);
                }
            });
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$show$4(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.fabTransform.setProgress(floatValue);
            this.blurredView.setAlpha(floatValue);
            this.dimmView.setAlpha(floatValue);
            this.popupLayout.setAlpha(floatValue);
            float f = (floatValue * 0.5f) + 0.5f;
            this.popupLayout.setScaleX(f);
            this.popupLayout.setScaleY(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void animateProgress(final Runnable runnable) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.PhoneNumberConfirmView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    runnable.run();
                }
            });
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.PhoneNumberConfirmView.this.lambda$animateProgress$5(valueAnimator);
                }
            });
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateProgress$5(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - floatValue;
            float f2 = (f * 0.9f) + 0.1f;
            this.fabTransform.setScaleX(f2);
            this.fabTransform.setScaleY(f2);
            this.fabTransform.setAlpha(f);
            float f3 = (0.9f * floatValue) + 0.1f;
            this.floatingProgressView.setScaleX(f3);
            this.floatingProgressView.setScaleY(f3);
            this.floatingProgressView.setAlpha(floatValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dismiss() {
            if (this.dismissed) {
                return;
            }
            this.dismissed = true;
            this.callback.onDismiss(this);
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
            duration.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.PhoneNumberConfirmView.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (PhoneNumberConfirmView.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) PhoneNumberConfirmView.this.getParent()).removeView(PhoneNumberConfirmView.this);
                    }
                    ObjectAnimator.ofFloat(PhoneNumberConfirmView.this.fabContainer, (Property<View, Float>) View.TRANSLATION_Z, 0.0f, AndroidUtilities.dp(2.0f)).setDuration(150L).start();
                    PhoneNumberConfirmView.this.fabContainer.setVisibility(0);
                }
            });
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.PhoneNumberConfirmView.this.lambda$dismiss$6(valueAnimator);
                }
            });
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dismiss$6(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.blurredView.setAlpha(floatValue);
            this.dimmView.setAlpha(floatValue);
            this.fabTransform.setProgress(floatValue);
            this.popupLayout.setAlpha(floatValue);
            float f = (floatValue * 0.5f) + 0.5f;
            this.popupLayout.setScaleX(f);
            this.popupLayout.setScaleY(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class PhoneInputData {
        private CountrySelectActivity.Country country;
        private List patterns;
        private String phoneNumber;

        private PhoneInputData() {
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, null, true)) > 0.699999988079071d;
    }

    private void updateProxyButton(boolean z, boolean z2) {
        if (this.proxyDrawable == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.currentConnectionState != connectionState || z2) {
            this.currentConnectionState = connectionState;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            boolean z3 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i = this.currentConnectionState;
            boolean z4 = i == 3 || i == 5;
            boolean z5 = i == 1 || i == 2 || i == 4;
            if (z3) {
                this.proxyDrawable.setConnected(true, z4, z);
                showProxyButton(true, z);
            } else if ((getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty()) || z5) {
                this.proxyDrawable.setConnected(true, z4, z);
                showProxyButtonDelayed();
            } else {
                showProxyButton(false, z);
            }
        }
    }

    private void showProxyButtonDelayed() {
        if (this.proxyButtonVisible) {
            return;
        }
        Runnable runnable = this.showProxyButtonDelayed;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.proxyButtonVisible = true;
        Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                LoginActivity.this.lambda$showProxyButtonDelayed$36();
            }
        };
        this.showProxyButtonDelayed = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showProxyButtonDelayed$36() {
        this.proxyButtonVisible = false;
        showProxyButton(true, true);
    }

    private void showProxyButton(final boolean z, boolean z2) {
        if (z == this.proxyButtonVisible) {
            return;
        }
        Runnable runnable = this.showProxyButtonDelayed;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.showProxyButtonDelayed = null;
        }
        this.proxyButtonVisible = z;
        this.proxyButtonView.clearAnimation();
        if (z2) {
            this.proxyButtonView.setVisibility(0);
            this.proxyButtonView.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.lambda$showProxyButton$37(z);
                }
            }).start();
        } else {
            this.proxyButtonView.setVisibility(z ? 0 : 8);
            this.proxyButtonView.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showProxyButton$37(boolean z) {
        if (z) {
            return;
        }
        this.proxyButtonView.setVisibility(8);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didUpdateConnectionState) {
            updateProxyButton(true, false);
        }
    }

    public class LoginActivityPhraseView extends SlideView {
        private String beginning;
        private final Runnable checkPasteRunnable;
        private final EditTextBoldCursor codeField;
        private int codeTime;
        private final TextView confirmTextView;
        private Bundle currentParams;
        private final int currentType;
        private final Runnable dismissField;
        private String emailPhone;
        private boolean errorShown;
        private final TextView errorTextView;
        private final LinearLayout fieldContainer;
        private final RLottieImageView imageView;
        private final FrameLayout infoContainer;
        private final TextView infoTextView;
        private boolean isResendingCode;
        private double lastCurrentTime;
        private String lastError;
        private TLRPC.TL_auth_sentCode nextCodeAuth;
        private Bundle nextCodeParams;
        private boolean nextPressed;
        private int nextType;
        private final OutlineTextContainerView outlineField;
        private boolean pasteShown;
        private final TextView pasteTextView;
        private boolean pasted;
        private boolean pasting;
        private String phone;
        private String phoneHash;
        private int prevType;
        private final TextView prevTypeTextView;
        private String requestPhone;
        private float shiftDp;
        private int time;
        private final LoadingTextView timeText;
        private Timer timeTimer;
        private final Object timerSync;
        private final TextView titleTextView;
        private boolean waitingForEvent;

        @Override // org.telegram.ui.Components.SlideView
        public boolean needBackButton() {
            return true;
        }

        static /* synthetic */ int access$18226(LoginActivityPhraseView loginActivityPhraseView, double d) {
            int i = (int) (loginActivityPhraseView.time - d);
            loginActivityPhraseView.time = i;
            return i;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0308  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x030b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x02b6  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LoginActivityPhraseView(Context context, int i) {
            super(context);
            boolean z;
            this.pasteShown = true;
            this.errorShown = false;
            this.pasting = false;
            this.pasted = false;
            this.timerSync = new Object();
            this.time = 60000;
            this.codeTime = 15000;
            this.lastError = "";
            this.checkPasteRunnable = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.this.lambda$new$7();
                }
            };
            this.dismissField = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.this.lambda$new$8();
                }
            };
            this.shiftDp = -3.0f;
            this.currentType = i;
            boolean z2 = i != 16;
            setOrientation(1);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.setAnimation(org.telegram.messenger.R.raw.bubble, 95, 95);
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    z = false;
                    rLottieImageView.setVisibility(!z ? 8 : 0);
                    addView(rLottieImageView, LayoutHelper.createLinear(95, 95, 1, 0, 10, 0, 5));
                    TextView textView = new TextView(context);
                    this.titleTextView = textView;
                    textView.setTextSize(1, 18.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    textView.setGravity(49);
                    textView.setText(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWordTitle : org.telegram.messenger.R.string.SMSPhraseTitle));
                    addView(textView, LayoutHelper.createLinear(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
                    TextView textView2 = new TextView(context);
                    this.confirmTextView = textView2;
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 8, 5, 8, 16));
                    OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                    this.outlineField = outlineTextContainerView;
                    outlineTextContainerView.setText(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWord : org.telegram.messenger.R.string.SMSPhrase));
                    1 r11 = new 1(context, LoginActivity.this);
                    this.codeField = r11;
                    r11.setSingleLine();
                    r11.setLines(1);
                    r11.setCursorSize(AndroidUtilities.dp(20.0f));
                    r11.setCursorWidth(1.5f);
                    r11.setImeOptions(268435461);
                    r11.setTextSize(1, 18.0f);
                    r11.setMaxLines(1);
                    r11.setBackground(null);
                    r11.setHint(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWordHint : org.telegram.messenger.R.string.SMSPhraseHint));
                    r11.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.LoginActivityPhraseView.2
                        private boolean ignoreTextChange;
                        private int trimmedLength;

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                            if (this.ignoreTextChange || charSequence == null || LoginActivityPhraseView.this.beginning == null) {
                                return;
                            }
                            this.trimmedLength = LoginActivityPhraseView.this.trimLeft(charSequence.toString()).length();
                        }

                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            if (this.ignoreTextChange) {
                                return;
                            }
                            LoginActivityPhraseView.this.checkPaste(true);
                            AndroidUtilities.cancelRunOnUIThread(LoginActivityPhraseView.this.dismissField);
                            LoginActivityPhraseView.this.animateError(false);
                            if (TextUtils.isEmpty(editable)) {
                                LoginActivityPhraseView.this.pasted = false;
                            }
                            if (LoginActivityPhraseView.this.beginsOk(editable.toString())) {
                                return;
                            }
                            LoginActivityPhraseView.this.onInputError(true);
                            this.ignoreTextChange = true;
                            boolean z3 = LoginActivityPhraseView.this.codeField.getSelectionEnd() >= LoginActivityPhraseView.this.codeField.getText().length();
                            if (!LoginActivityPhraseView.this.pasted) {
                                LoginActivityPhraseView.this.codeField.setText(LoginActivityPhraseView.this.beginning.substring(0, Utilities.clamp(this.trimmedLength, LoginActivityPhraseView.this.beginning.length(), 0)));
                                if (z3) {
                                    LoginActivityPhraseView.this.codeField.setSelection(LoginActivityPhraseView.this.codeField.getText().length());
                                }
                            }
                            this.ignoreTextChange = false;
                        }
                    });
                    r11.setEllipsizeByGradient(true);
                    r11.setInputType(1);
                    r11.setTypeface(Typeface.DEFAULT);
                    r11.setGravity(!LocaleController.isRTL ? 5 : 3);
                    r11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z3) {
                            LoginActivity.LoginActivityPhraseView.this.lambda$new$0(view, z3);
                        }
                    });
                    TextView textView3 = new TextView(context);
                    this.pasteTextView = textView3;
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setText(LocaleController.getString(org.telegram.messenger.R.string.Paste));
                    textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView3.setGravity(17);
                    int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, ((BaseFragment) LoginActivity.this).resourceProvider);
                    textView3.setTextColor(color);
                    textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(color, 0.12f), Theme.multAlpha(color, 0.15f)));
                    ScaleStateListAnimator.apply(textView3, 0.1f, 1.5f);
                    r11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityPhraseView.this.lambda$new$1(view);
                        }
                    });
                    outlineTextContainerView.addView(r11, LayoutHelper.createFrame(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                    outlineTextContainerView.attachEditText(r11);
                    outlineTextContainerView.addView(textView3, LayoutHelper.createFrame(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                    LinearLayout linearLayout = new LinearLayout(context);
                    this.fieldContainer = linearLayout;
                    linearLayout.setOrientation(1);
                    linearLayout.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2, 1));
                    addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1, 16, 3, 16, 0));
                    r11.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda5
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView4, int i2, KeyEvent keyEvent) {
                            boolean lambda$new$2;
                            lambda$new$2 = LoginActivity.LoginActivityPhraseView.this.lambda$new$2(textView4, i2, keyEvent);
                            return lambda$new$2;
                        }
                    });
                    FrameLayout frameLayout = new FrameLayout(context);
                    this.infoContainer = frameLayout;
                    linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
                    LoadingTextView loadingTextView = LoginActivity.this.new LoadingTextView(context);
                    this.prevTypeTextView = loadingTextView;
                    int i2 = Theme.key_windowBackgroundWhiteValueText;
                    loadingTextView.setLinkTextColor(Theme.getColor(i2));
                    loadingTextView.setTextColor(LoginActivity.this.getThemedColor(i2));
                    loadingTextView.setTextSize(1, 14.0f);
                    loadingTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    loadingTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    loadingTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityPhraseView.this.lambda$new$3(view);
                        }
                    });
                    addView(loadingTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
                    loadingTextView.setVisibility(8);
                    TextView textView4 = new TextView(context);
                    this.errorTextView = textView4;
                    textView4.setPivotX(0.0f);
                    textView4.setPivotY(0.0f);
                    textView4.setText(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWordError : org.telegram.messenger.R.string.SMSPhraseError));
                    textView4.setTextColor(LoginActivity.this.getThemedColor(Theme.key_text_RedRegular));
                    textView4.setTextSize(1, 13.0f);
                    frameLayout.addView(textView4, LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                    textView4.setAlpha(0.0f);
                    textView4.setScaleX(0.8f);
                    textView4.setScaleY(0.8f);
                    textView4.setTranslationY(-AndroidUtilities.dp(4.0f));
                    TextView textView5 = new TextView(context);
                    this.infoTextView = textView5;
                    textView5.setPivotX(0.0f);
                    textView5.setPivotY(0.0f);
                    textView5.setText(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWordPasteHint : org.telegram.messenger.R.string.SMSPhrasePasteHint));
                    textView5.setTextColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                    textView5.setTextSize(1, 13.0f);
                    frameLayout.addView(textView5, LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
                    LoadingTextView loadingTextView2 = new LoadingTextView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityPhraseView.3
                        {
                            LoginActivity loginActivity = LoginActivity.this;
                        }

                        @Override // org.telegram.ui.LoginActivity.LoadingTextView
                        protected boolean isResendingCode() {
                            return LoginActivityPhraseView.this.isResendingCode;
                        }

                        @Override // org.telegram.ui.LoginActivity.LoadingTextView
                        protected boolean isRippleEnabled() {
                            return getVisibility() == 0 && (LoginActivityPhraseView.this.time <= 0 || LoginActivityPhraseView.this.timeTimer == null);
                        }
                    };
                    this.timeText = loadingTextView2;
                    loadingTextView2.setLinkTextColor(Theme.getColor(i2));
                    loadingTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    loadingTextView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    loadingTextView2.setTextSize(1, 15.0f);
                    loadingTextView2.setGravity(19);
                    loadingTextView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityPhraseView.this.lambda$new$6(view);
                        }
                    });
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.addView(loadingTextView2, LayoutHelper.createFrame(-1, 56, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                    addView(frameLayout2, LayoutHelper.createLinear(-1, -1, 80));
                    VerticalPositionAutoAnimator.attach(loadingTextView2);
                }
            }
            z = true;
            rLottieImageView.setVisibility(!z ? 8 : 0);
            addView(rLottieImageView, LayoutHelper.createLinear(95, 95, 1, 0, 10, 0, 5));
            TextView textView6 = new TextView(context);
            this.titleTextView = textView6;
            textView6.setTextSize(1, 18.0f);
            textView6.setTypeface(AndroidUtilities.bold());
            textView6.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView6.setGravity(49);
            textView6.setText(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWordTitle : org.telegram.messenger.R.string.SMSPhraseTitle));
            addView(textView6, LayoutHelper.createLinear(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
            TextView textView22 = new TextView(context);
            this.confirmTextView = textView22;
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(1);
            textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView22, LayoutHelper.createLinear(-2, -2, 1, 8, 5, 8, 16));
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.outlineField = outlineTextContainerView2;
            outlineTextContainerView2.setText(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWord : org.telegram.messenger.R.string.SMSPhrase));
            1 r112 = new 1(context, LoginActivity.this);
            this.codeField = r112;
            r112.setSingleLine();
            r112.setLines(1);
            r112.setCursorSize(AndroidUtilities.dp(20.0f));
            r112.setCursorWidth(1.5f);
            r112.setImeOptions(268435461);
            r112.setTextSize(1, 18.0f);
            r112.setMaxLines(1);
            r112.setBackground(null);
            r112.setHint(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWordHint : org.telegram.messenger.R.string.SMSPhraseHint));
            r112.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.LoginActivityPhraseView.2
                private boolean ignoreTextChange;
                private int trimmedLength;

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i22, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i22, int i3, int i4) {
                    if (this.ignoreTextChange || charSequence == null || LoginActivityPhraseView.this.beginning == null) {
                        return;
                    }
                    this.trimmedLength = LoginActivityPhraseView.this.trimLeft(charSequence.toString()).length();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    if (this.ignoreTextChange) {
                        return;
                    }
                    LoginActivityPhraseView.this.checkPaste(true);
                    AndroidUtilities.cancelRunOnUIThread(LoginActivityPhraseView.this.dismissField);
                    LoginActivityPhraseView.this.animateError(false);
                    if (TextUtils.isEmpty(editable)) {
                        LoginActivityPhraseView.this.pasted = false;
                    }
                    if (LoginActivityPhraseView.this.beginsOk(editable.toString())) {
                        return;
                    }
                    LoginActivityPhraseView.this.onInputError(true);
                    this.ignoreTextChange = true;
                    boolean z3 = LoginActivityPhraseView.this.codeField.getSelectionEnd() >= LoginActivityPhraseView.this.codeField.getText().length();
                    if (!LoginActivityPhraseView.this.pasted) {
                        LoginActivityPhraseView.this.codeField.setText(LoginActivityPhraseView.this.beginning.substring(0, Utilities.clamp(this.trimmedLength, LoginActivityPhraseView.this.beginning.length(), 0)));
                        if (z3) {
                            LoginActivityPhraseView.this.codeField.setSelection(LoginActivityPhraseView.this.codeField.getText().length());
                        }
                    }
                    this.ignoreTextChange = false;
                }
            });
            r112.setEllipsizeByGradient(true);
            r112.setInputType(1);
            r112.setTypeface(Typeface.DEFAULT);
            r112.setGravity(!LocaleController.isRTL ? 5 : 3);
            r112.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z3) {
                    LoginActivity.LoginActivityPhraseView.this.lambda$new$0(view, z3);
                }
            });
            TextView textView32 = new TextView(context);
            this.pasteTextView = textView32;
            textView32.setTextSize(1, 12.0f);
            textView32.setTypeface(AndroidUtilities.bold());
            textView32.setText(LocaleController.getString(org.telegram.messenger.R.string.Paste));
            textView32.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView32.setGravity(17);
            int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, ((BaseFragment) LoginActivity.this).resourceProvider);
            textView32.setTextColor(color2);
            textView32.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(color2, 0.12f), Theme.multAlpha(color2, 0.15f)));
            ScaleStateListAnimator.apply(textView32, 0.1f, 1.5f);
            r112.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
            textView32.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityPhraseView.this.lambda$new$1(view);
                }
            });
            outlineTextContainerView2.addView(r112, LayoutHelper.createFrame(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            outlineTextContainerView2.attachEditText(r112);
            outlineTextContainerView2.addView(textView32, LayoutHelper.createFrame(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.fieldContainer = linearLayout2;
            linearLayout2.setOrientation(1);
            linearLayout2.addView(outlineTextContainerView2, LayoutHelper.createLinear(-1, -2, 1));
            addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1, 16, 3, 16, 0));
            r112.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda5
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView42, int i22, KeyEvent keyEvent) {
                    boolean lambda$new$2;
                    lambda$new$2 = LoginActivity.LoginActivityPhraseView.this.lambda$new$2(textView42, i22, keyEvent);
                    return lambda$new$2;
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.infoContainer = frameLayout3;
            linearLayout2.addView(frameLayout3, LayoutHelper.createLinear(-1, -2));
            LoadingTextView loadingTextView3 = LoginActivity.this.new LoadingTextView(context);
            this.prevTypeTextView = loadingTextView3;
            int i22 = Theme.key_windowBackgroundWhiteValueText;
            loadingTextView3.setLinkTextColor(Theme.getColor(i22));
            loadingTextView3.setTextColor(LoginActivity.this.getThemedColor(i22));
            loadingTextView3.setTextSize(1, 14.0f);
            loadingTextView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            loadingTextView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            loadingTextView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityPhraseView.this.lambda$new$3(view);
                }
            });
            addView(loadingTextView3, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
            loadingTextView3.setVisibility(8);
            TextView textView42 = new TextView(context);
            this.errorTextView = textView42;
            textView42.setPivotX(0.0f);
            textView42.setPivotY(0.0f);
            textView42.setText(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWordError : org.telegram.messenger.R.string.SMSPhraseError));
            textView42.setTextColor(LoginActivity.this.getThemedColor(Theme.key_text_RedRegular));
            textView42.setTextSize(1, 13.0f);
            frameLayout3.addView(textView42, LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
            textView42.setAlpha(0.0f);
            textView42.setScaleX(0.8f);
            textView42.setScaleY(0.8f);
            textView42.setTranslationY(-AndroidUtilities.dp(4.0f));
            TextView textView52 = new TextView(context);
            this.infoTextView = textView52;
            textView52.setPivotX(0.0f);
            textView52.setPivotY(0.0f);
            textView52.setText(LocaleController.getString(z2 ? org.telegram.messenger.R.string.SMSWordPasteHint : org.telegram.messenger.R.string.SMSPhrasePasteHint));
            textView52.setTextColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
            textView52.setTextSize(1, 13.0f);
            frameLayout3.addView(textView52, LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
            LoadingTextView loadingTextView22 = new LoadingTextView(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityPhraseView.3
                {
                    LoginActivity loginActivity = LoginActivity.this;
                }

                @Override // org.telegram.ui.LoginActivity.LoadingTextView
                protected boolean isResendingCode() {
                    return LoginActivityPhraseView.this.isResendingCode;
                }

                @Override // org.telegram.ui.LoginActivity.LoadingTextView
                protected boolean isRippleEnabled() {
                    return getVisibility() == 0 && (LoginActivityPhraseView.this.time <= 0 || LoginActivityPhraseView.this.timeTimer == null);
                }
            };
            this.timeText = loadingTextView22;
            loadingTextView22.setLinkTextColor(Theme.getColor(i22));
            loadingTextView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            loadingTextView22.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            loadingTextView22.setTextSize(1, 15.0f);
            loadingTextView22.setGravity(19);
            loadingTextView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityPhraseView.this.lambda$new$6(view);
                }
            });
            FrameLayout frameLayout22 = new FrameLayout(context);
            frameLayout22.addView(loadingTextView22, LayoutHelper.createFrame(-1, 56, 80, 6.0f, 0.0f, 60.0f, 28.0f));
            addView(frameLayout22, LayoutHelper.createLinear(-1, -1, 80));
            VerticalPositionAutoAnimator.attach(loadingTextView22);
        }

        class 1 extends EditTextBoldCursor {
            final /* synthetic */ LoginActivity val$this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            1(Context context, LoginActivity loginActivity) {
                super(context);
                this.val$this$0 = loginActivity;
            }

            @Override // android.widget.EditText, android.widget.TextView
            public boolean onTextContextMenuItem(int i) {
                if (i == 16908322 || i == 16908337) {
                    LoginActivityPhraseView loginActivityPhraseView = LoginActivityPhraseView.this;
                    loginActivityPhraseView.pasting = loginActivityPhraseView.pasted = true;
                    postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivityPhraseView.1.this.lambda$onTextContextMenuItem$0();
                        }
                    }, 1000L);
                }
                return super.onTextContextMenuItem(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onTextContextMenuItem$0() {
                LoginActivityPhraseView.this.pasting = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view, boolean z) {
            this.outlineField.animateSelection(z ? 1.0f : 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(View view) {
            CharSequence charSequence;
            try {
                charSequence = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequence = null;
            }
            if (charSequence != null) {
                Editable text = this.codeField.getText();
                this.pasted = true;
                this.pasting = true;
                if (text != null) {
                    int max = Math.max(0, this.codeField.getSelectionStart());
                    text.replace(max, Math.max(max, this.codeField.getSelectionEnd()), charSequence);
                }
                this.pasting = false;
            }
            checkPaste(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$2(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(View view) {
            onBackPressed(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$6(View view) {
            TLRPC.TL_auth_sentCode tL_auth_sentCode;
            if (this.time <= 0 || this.timeTimer == null) {
                Bundle bundle = this.nextCodeParams;
                if (bundle != null && (tL_auth_sentCode = this.nextCodeAuth) != null) {
                    LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, tL_auth_sentCode);
                    return;
                }
                int i = this.nextType;
                if (i != 4 && i != 2 && i != 11 && i != 15) {
                    if (i == 3) {
                        AndroidUtilities.setWaitingForSms(false);
                        this.waitingForEvent = false;
                        resendCode();
                        return;
                    }
                    return;
                }
                this.isResendingCode = true;
                this.timeText.invalidate();
                this.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                this.timeText.setTextSize(1, 15.0f);
                int i2 = this.nextType;
                if (i2 == 4 || i2 == 11) {
                    this.timeText.setText(LocaleController.getString(org.telegram.messenger.R.string.Calling));
                } else {
                    this.timeText.setText(LocaleController.getString(org.telegram.messenger.R.string.SendingSms));
                }
                final Bundle bundle2 = new Bundle();
                bundle2.putString("phone", this.phone);
                bundle2.putString("ephone", this.emailPhone);
                bundle2.putString("phoneFormated", this.requestPhone);
                bundle2.putInt("prevType", this.currentType);
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.requestPhone;
                tL_auth_resendCode.phone_code_hash = this.phoneHash;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda10
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivityPhraseView.this.lambda$new$5(bundle2, tLObject, tL_error);
                    }
                }, 10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$5(final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.this.lambda$new$4(tLObject, bundle, tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$4(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
            String str;
            this.isResendingCode = false;
            this.timeText.invalidate();
            if (tLObject != null) {
                this.nextCodeParams = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                this.nextCodeAuth = tL_auth_sentCode;
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, tL_auth_sentCode);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (str.contains("PHONE_NUMBER_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.InvalidPhoneNumber));
            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.InvalidCode));
            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.CodeExpired));
            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.FloodWait));
            } else if (tL_error.code != -1000) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.ErrorOccurred) + "\n" + tL_error.text);
            }
            this.lastError = tL_error.text;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$7() {
            checkPaste(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void checkPaste(boolean z) {
            AndroidUtilities.cancelRunOnUIThread(this.checkPasteRunnable);
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            boolean z2 = TextUtils.isEmpty(this.codeField.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
            if (this.pasteShown != z2) {
                this.pasteShown = z2;
                float f = 0.9f;
                float f2 = 0.0f;
                if (z) {
                    ViewPropertyAnimator scaleY = this.pasteTextView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.7f).scaleY(z2 ? 1.0f : 0.7f);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    scaleY.setInterpolator(cubicBezierInterpolator).setDuration(300L).start();
                    ViewPropertyAnimator scaleX = this.infoTextView.animate().scaleX((!this.pasteShown || this.errorShown) ? 0.9f : 1.0f);
                    if (this.pasteShown && !this.errorShown) {
                        f = 1.0f;
                    }
                    ViewPropertyAnimator alpha = scaleX.scaleY(f).alpha((!this.pasteShown || this.errorShown) ? 0.0f : 1.0f);
                    if (!this.pasteShown || this.errorShown) {
                        f2 = AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f);
                    }
                    alpha.translationY(f2).setInterpolator(cubicBezierInterpolator).setDuration(300L).start();
                } else {
                    this.pasteTextView.setAlpha(z2 ? 1.0f : 0.0f);
                    this.pasteTextView.setScaleX(z2 ? 1.0f : 0.7f);
                    this.pasteTextView.setScaleY(z2 ? 1.0f : 0.7f);
                    this.infoTextView.setScaleX((!this.pasteShown || this.errorShown) ? 0.9f : 1.0f);
                    TextView textView = this.infoTextView;
                    if (this.pasteShown && !this.errorShown) {
                        f = 1.0f;
                    }
                    textView.setScaleY(f);
                    this.infoTextView.setAlpha((!this.pasteShown || this.errorShown) ? 0.0f : 1.0f);
                    TextView textView2 = this.infoTextView;
                    if (!this.pasteShown || this.errorShown) {
                        f2 = AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f);
                    }
                    textView2.setTranslationY(f2);
                }
            }
            AndroidUtilities.runOnUIThread(this.checkPasteRunnable, 5000L);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            TextView textView = this.titleTextView;
            LoginActivity loginActivity = LoginActivity.this;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(loginActivity.getThemedColor(i));
            this.confirmTextView.setTextColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.codeField.setTextColor(LoginActivity.this.getThemedColor(i));
            this.codeField.setCursorColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated));
            this.codeField.setHintTextColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteHintText));
            this.outlineField.updateColor();
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("NewPassword", org.telegram.messenger.R.string.NewPassword);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            int i;
            if (bundle == null) {
                if (this.nextCodeParams == null || this.nextCodeAuth == null) {
                    return;
                }
                this.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                int i2 = this.nextType;
                if (i2 == 17) {
                    i = org.telegram.messenger.R.string.ReturnEnteringPhrase;
                } else if (i2 == 16) {
                    i = org.telegram.messenger.R.string.ReturnEnteringWord;
                } else if (i2 == 3) {
                    i = org.telegram.messenger.R.string.ReturnPhoneCall;
                } else {
                    i = org.telegram.messenger.R.string.ReturnEnteringSMS;
                }
                this.timeText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            this.codeField.setText("");
            this.currentParams = bundle;
            this.beginning = null;
            this.nextType = bundle.getInt("nextType");
            this.prevType = bundle.getInt("prevType", 0);
            this.emailPhone = bundle.getString("ephone");
            if (this.currentParams.containsKey("beginning")) {
                this.beginning = this.currentParams.getString("beginning");
            }
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.phone = this.currentParams.getString("phone");
            this.time = bundle.getInt("timeout");
            int i3 = this.prevType;
            if (i3 == 17) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(org.telegram.messenger.R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i3 == 16) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(org.telegram.messenger.R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i3 == 1 || i3 == 2 || i3 == 4 || i3 == 3 || i3 == 15) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(org.telegram.messenger.R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else {
                this.prevTypeTextView.setVisibility(8);
            }
            this.nextCodeParams = null;
            this.nextCodeAuth = null;
            this.nextPressed = false;
            this.isResendingCode = false;
            LoginActivity.this.isRequestingFirebaseSms = false;
            this.timeText.invalidate();
            boolean z2 = this.currentType != 16;
            String str = "+" + PhoneFormat.getInstance().format(PhoneFormat.stripExceptNumbers(this.phone));
            String str2 = this.beginning;
            if (str2 == null) {
                this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(!z2 ? org.telegram.messenger.R.string.SMSWordText : org.telegram.messenger.R.string.SMSPhraseText, str)));
            } else {
                this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(!z2 ? org.telegram.messenger.R.string.SMSWordBeginningText : org.telegram.messenger.R.string.SMSPhraseBeginningText, str, str2)));
            }
            LoginActivity.this.showKeyboard(this.codeField);
            this.codeField.requestFocus();
            if (this.imageView.getAnimatedDrawable() != null) {
                this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
            }
            final RLottieImageView rLottieImageView = this.imageView;
            Objects.requireNonNull(rLottieImageView);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    RLottieImageView.this.playAnimation();
                }
            }, 500L);
            checkPaste(false);
            animateError(false);
            this.lastCurrentTime = System.currentTimeMillis();
            this.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
            int i4 = this.nextType;
            if (i4 == 2 || i4 == 4 || i4 == 3) {
                createTimer();
            } else {
                this.timeText.setVisibility(8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void animateError(boolean z) {
            this.errorShown = z;
            float f = 0.0f;
            float f2 = z ? 1.0f : 0.0f;
            this.outlineField.animateError(f2);
            float f3 = (f2 * 0.1f) + 0.9f;
            ViewPropertyAnimator translationY = this.errorTextView.animate().scaleX(f3).scaleY(f3).alpha(f2).translationY((1.0f - f2) * AndroidUtilities.dp(-5.0f));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            translationY.setInterpolator(cubicBezierInterpolator).setDuration(290L).start();
            if (this.pasteShown && !this.errorShown) {
                f = 1.0f;
            }
            float f4 = (0.1f * f) + 0.9f;
            this.infoTextView.animate().scaleX(f4).scaleY(f4).alpha(f).translationY((1.0f - f) * AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f)).setInterpolator(cubicBezierInterpolator).setDuration(290L).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$8() {
            animateError(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onInputError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.codeField.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            boolean z2 = this.currentType != 16;
            if (z) {
                this.errorTextView.setText(LocaleController.getString(!z2 ? org.telegram.messenger.R.string.SMSWordBeginningError : org.telegram.messenger.R.string.SMSPhraseBeginningError));
            } else if (TextUtils.isEmpty(this.codeField.getText())) {
                this.errorTextView.setText("");
            } else {
                this.errorTextView.setText(LocaleController.getString(!z2 ? org.telegram.messenger.R.string.SMSWordError : org.telegram.messenger.R.string.SMSPhraseError));
            }
            if (!this.errorShown && !this.pasted) {
                AndroidUtilities.shakeViewSpring(this.codeField, this.shiftDp);
                AndroidUtilities.shakeViewSpring(this.errorTextView, this.shiftDp);
            }
            AndroidUtilities.cancelRunOnUIThread(this.dismissField);
            animateError(true);
            AndroidUtilities.runOnUIThread(this.dismissField, 10000L);
            this.shiftDp = -this.shiftDp;
        }

        @Override // org.telegram.ui.Components.SlideView
        /* renamed from: onNextPressed */
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            String obj = this.codeField.getText().toString();
            if (obj.length() == 0) {
                onInputError(false);
                return;
            }
            if (!beginsOk(obj)) {
                onInputError(true);
                return;
            }
            this.nextPressed = true;
            final TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.requestPhone;
            tL_auth_signIn.phone_code = obj;
            tL_auth_signIn.phone_code_hash = this.phoneHash;
            tL_auth_signIn.flags |= 1;
            LoginActivity.this.needShowProgress(LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_signIn, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityPhraseView.this.lambda$onNextPressed$13(tL_auth_signIn, tLObject, tL_error);
                }
            }, 10), true);
            LoginActivity.this.showDoneButton(true, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$13(final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.this.lambda$onNextPressed$12(tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$12(TLRPC.TL_error tL_error, TLObject tLObject, final TLRPC.TL_auth_signIn tL_auth_signIn) {
            LoginActivity.this.needHideProgress(false, true);
            if (tL_error == null) {
                this.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                destroyTimer();
                if (!(tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired)) {
                    LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
                } else {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", this.requestPhone);
                    bundle.putString("phoneHash", this.phoneHash);
                    bundle.putString("code", tL_auth_signIn.phone_code);
                    LoginActivity.this.setPage(5, true, bundle, false);
                }
            } else {
                String str = tL_error.text;
                this.lastError = str;
                if (str.contains("SESSION_PASSWORD_NEEDED")) {
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda14
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            LoginActivity.LoginActivityPhraseView.this.lambda$onNextPressed$10(tL_auth_signIn, tLObject2, tL_error2);
                        }
                    }, 10);
                    destroyTimer();
                } else {
                    this.nextPressed = false;
                    if (this.currentType != 3) {
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", org.telegram.messenger.R.string.InvalidPhoneNumber));
                        } else {
                            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                onInputError(false);
                                this.codeField.post(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda15
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        LoginActivity.LoginActivityPhraseView.this.lambda$onNextPressed$11();
                                    }
                                });
                                return;
                            }
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                onBackPressed(true);
                                LoginActivity.this.setPage(0, true, null, true);
                                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", org.telegram.messenger.R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", org.telegram.messenger.R.string.FloodWait));
                            } else {
                                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", org.telegram.messenger.R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                        }
                        this.codeField.setText("");
                        this.codeField.requestFocus();
                        return;
                    }
                    return;
                }
            }
            if (this.currentType == 3) {
                AndroidUtilities.endIncomingCall();
                AndroidUtilities.setWaitingForCall(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$10(final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.this.lambda$onNextPressed$9(tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$9(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", org.telegram.messenger.R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("code", tL_auth_signIn.phone_code);
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNextPressed$11() {
            this.codeField.requestFocus();
            String str = this.beginning;
            if (str != null) {
                if (str.length() > 1) {
                    String obj = this.codeField.getText().toString();
                    int trimLeftLen = trimLeftLen(obj) + this.beginning.length();
                    this.codeField.setSelection(Utilities.clamp(trimLeftLen + ((trimLeftLen < 0 || trimLeftLen >= obj.length() || obj.charAt(trimLeftLen) != ' ') ? 0 : 1), obj.length(), 0), this.codeField.getText().length());
                    return;
                }
            }
            EditTextBoldCursor editTextBoldCursor = this.codeField;
            editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
        }

        private void resendCode() {
            if (this.nextPressed || this.isResendingCode || LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            this.isResendingCode = true;
            this.timeText.invalidate();
            this.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            this.nextPressed = true;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = this.requestPhone;
            tL_auth_resendCode.phone_code_hash = this.phoneHash;
            LoginActivity.this.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda12
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityPhraseView.this.lambda$resendCode$15(bundle, tLObject, tL_error);
                }
            }, 10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$resendCode$15(final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.this.lambda$resendCode$14(tL_error, bundle, tLObject);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$resendCode$14(TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
            this.nextPressed = false;
            if (tL_error == null) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(bundle, (TLRPC.TL_auth_sentCode) tLObject);
            } else {
                String str = tL_error.text;
                if (str != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                }
            }
            LoginActivity.this.needHideProgress(false);
        }

        @Override // org.telegram.ui.Components.SlideView
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            int i = this.prevType;
            if (i != 0) {
                LoginActivity.this.setPage(i, true, null, true);
                return false;
            }
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onResume() {
            super.onResume();
            checkPaste(true);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.this.lambda$onShow$16();
                }
            }, LoginActivity.SHOW_DELAY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShow$16() {
            EditTextBoldCursor editTextBoldCursor = this.codeField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = this.codeField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(this.codeField);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onHide() {
            super.onHide();
            AndroidUtilities.cancelRunOnUIThread(this.checkPasteRunnable);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void saveStateParams(Bundle bundle) {
            if (this.currentParams != null) {
                bundle.putBundle("recoveryview_word" + this.currentType, this.currentParams);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.currentType);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }

        private void createTimer() {
            if (this.timeTimer != null) {
                return;
            }
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText;
            loadingTextView.setTextColor(Theme.getColor(i));
            this.timeText.setTag(org.telegram.messenger.R.id.color_key_tag, Integer.valueOf(i));
            Timer timer = new Timer();
            this.timeTimer = timer;
            timer.schedule(new 4(), 0L, 1000L);
        }

        class 4 extends TimerTask {
            4() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (LoginActivityPhraseView.this.timeTimer == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$4$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityPhraseView.4.this.lambda$run$0();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0() {
                double currentTimeMillis = System.currentTimeMillis();
                double d = currentTimeMillis - LoginActivityPhraseView.this.lastCurrentTime;
                LoginActivityPhraseView.this.lastCurrentTime = currentTimeMillis;
                LoginActivityPhraseView.access$18226(LoginActivityPhraseView.this, d);
                if (LoginActivityPhraseView.this.time >= 1000) {
                    int i = (LoginActivityPhraseView.this.time / MediaDataController.MAX_STYLE_RUNS_COUNT) / 60;
                    int i2 = (LoginActivityPhraseView.this.time / MediaDataController.MAX_STYLE_RUNS_COUNT) - (i * 60);
                    LoginActivityPhraseView.this.timeText.setTextSize(1, 13.0f);
                    if (LoginActivityPhraseView.this.nextType == 4 || LoginActivityPhraseView.this.nextType == 3 || LoginActivityPhraseView.this.nextType == 11) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.formatString(org.telegram.messenger.R.string.CallAvailableIn2, Integer.valueOf(i), Integer.valueOf(i2)));
                        return;
                    } else {
                        if (LoginActivityPhraseView.this.nextType == 2) {
                            LoginActivityPhraseView.this.timeText.setText(LocaleController.formatString(org.telegram.messenger.R.string.SmsAvailableIn2, Integer.valueOf(i), Integer.valueOf(i2)));
                            return;
                        }
                        return;
                    }
                }
                LoginActivityPhraseView.this.destroyTimer();
                if (LoginActivityPhraseView.this.nextType == 3 || LoginActivityPhraseView.this.nextType == 4 || LoginActivityPhraseView.this.nextType == 2 || LoginActivityPhraseView.this.nextType == 11) {
                    LoginActivityPhraseView.this.timeText.setTextSize(1, 15.0f);
                    if (LoginActivityPhraseView.this.nextType == 4) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.getString(org.telegram.messenger.R.string.RequestCallButton));
                    } else if (LoginActivityPhraseView.this.nextType == 15) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.getString(org.telegram.messenger.R.string.DidNotGetTheCodeFragment));
                    } else if (LoginActivityPhraseView.this.nextType == 11 || LoginActivityPhraseView.this.nextType == 3) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.getString(org.telegram.messenger.R.string.RequestMissedCall));
                    } else {
                        LoginActivityPhraseView.this.timeText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(org.telegram.messenger.R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    }
                    LoadingTextView loadingTextView = LoginActivityPhraseView.this.timeText;
                    int i3 = Theme.key_chats_actionBackground;
                    loadingTextView.setTextColor(Theme.getColor(i3));
                    LoginActivityPhraseView.this.timeText.setTag(org.telegram.messenger.R.id.color_key_tag, Integer.valueOf(i3));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void destroyTimer() {
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText;
            loadingTextView.setTextColor(Theme.getColor(i));
            this.timeText.setTag(org.telegram.messenger.R.id.color_key_tag, Integer.valueOf(i));
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.timeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.timeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean beginsOk(String str) {
            if (this.beginning == null) {
                return true;
            }
            String lowerCase = trimLeft(str).toLowerCase();
            String lowerCase2 = this.beginning.toLowerCase();
            int min = Math.min(lowerCase.length(), lowerCase2.length());
            if (min <= 0) {
                return true;
            }
            return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
        }

        private int trimLeftLen(String str) {
            int length = str.length();
            int i = 0;
            while (i < length && str.charAt(i) <= ' ') {
                i++;
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String trimLeft(String str) {
            int length = str.length();
            int i = 0;
            while (i < length && str.charAt(i) <= ' ') {
                i++;
            }
            return (i > 0 || length < str.length()) ? str.substring(i, length) : str;
        }
    }

    public class LoginPayView extends SlideView {
        private ButtonWithCounterView button;
        private ExplainStarsSheet.FeatureCell[] cells;
        private String lastError;
        private ImageView optionsButton;
        private Bundle params;
        private boolean polling;
        private long pollingFormId;
        private String pollingPhoneCodeHash;
        private String pollingPhoneNumber;
        private int pollingRequestId;
        private StarParticlesView starParticlesView;

        public LoginPayView(Context context) {
            super(context);
            this.cells = new ExplainStarsSheet.FeatureCell[3];
            this.pollingRequestId = -1;
            setOrientation(1);
            setClipChildren(false);
            setClipToPadding(false);
            setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            addView(frameLayout, LayoutHelper.createLinear(-1, NotificationCenter.channelRecommendationsLoaded));
            StarParticlesView starParticlesView = new StarParticlesView(context) { // from class: org.telegram.ui.LoginActivity.LoginPayView.1
                @Override // org.telegram.ui.Components.Premium.StarParticlesView, android.view.View
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                }

                @Override // org.telegram.ui.Components.Premium.StarParticlesView
                protected void configure() {
                    StarParticlesView.Drawable drawable = this.drawable;
                    drawable.useGradient = true;
                    drawable.useBlur = false;
                    drawable.checkBounds = true;
                    drawable.isCircle = true;
                    drawable.centerOffsetY = AndroidUtilities.dp(-14.0f);
                    StarParticlesView.Drawable drawable2 = this.drawable;
                    drawable2.minLifeTime = 2000L;
                    drawable2.randLifeTime = 3000;
                    drawable2.size1 = 16;
                    drawable2.useRotate = false;
                    drawable2.type = 28;
                    drawable2.colorKey = Theme.key_premiumGradient2;
                    drawable2.init();
                }
            };
            this.starParticlesView = starParticlesView;
            frameLayout.addView(starParticlesView, LayoutHelper.createFrame(-1, NotificationCenter.channelRecommendationsLoaded, 119));
            ImageView imageView = new ImageView(context);
            this.optionsButton = imageView;
            imageView.setImageResource(org.telegram.messenger.R.drawable.ic_ab_other);
            this.optionsButton.setScaleType(ImageView.ScaleType.CENTER);
            ImageView imageView2 = this.optionsButton;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, ((BaseFragment) LoginActivity.this).resourceProvider), PorterDuff.Mode.SRC_IN));
            this.optionsButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector)));
            frameLayout.addView(this.optionsButton, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
            GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 1) { // from class: org.telegram.ui.LoginActivity.LoginPayView.2
                @Override // org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView, android.view.TextureView, android.view.View
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    setPaused(false);
                }

                @Override // org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView, android.view.View
                protected void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    setPaused(true);
                }
            };
            gLIconTextureView.setStarParticlesView(this.starParticlesView);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i2 = Theme.key_premiumGradient2;
            canvas.drawColor(ColorUtils.blendARGB(Theme.getColor(i2), Theme.getColor(Theme.key_dialogBackground), 0.5f));
            gLIconTextureView.setBackgroundBitmap(createBitmap);
            GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
            gLIconRenderer.colorKey1 = i2;
            gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
            gLIconRenderer.updateColors();
            frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(NotificationCenter.albumsDidLoad, NotificationCenter.albumsDidLoad, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(org.telegram.messenger.R.string.SMSFeeTitle));
            textView.setTextColor(Theme.getColor(i));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
            this.cells[0] = new ExplainStarsSheet.FeatureCell(context, 1);
            this.cells[0].set(org.telegram.messenger.R.drawable.menu_high_price, LocaleController.getString(org.telegram.messenger.R.string.SMSFee1Title), LocaleController.getString(org.telegram.messenger.R.string.SMSFee1Text));
            addView(this.cells[0], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            this.cells[1] = new ExplainStarsSheet.FeatureCell(context, 1);
            this.cells[1].set(org.telegram.messenger.R.drawable.menu_feature_code, LocaleController.getString(org.telegram.messenger.R.string.SMSFee2Title), LocaleController.getString(org.telegram.messenger.R.string.SMSFee2Text));
            addView(this.cells[1], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            this.cells[2] = new ExplainStarsSheet.FeatureCell(context, 1);
            this.cells[2].set(org.telegram.messenger.R.drawable.menu_feature_hands, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(org.telegram.messenger.R.string.SMSFee3Title), new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$new$0();
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(org.telegram.messenger.R.string.SMSFee3Text));
            addView(this.cells[2], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            addView(new Space(context), LayoutHelper.createLinear(0, 0, 1.0f, 119));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setLoading(true);
            addView(this.button, LayoutHelper.createLinear(-1, 48, 7, 0, 16, 0, 16));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment("sms");
            premiumPreviewFragment.setCurrentAccount(((BaseFragment) LoginActivity.this).currentAccount);
            LoginActivity.this.presentFragment(premiumPreviewFragment);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            super.setParams(bundle, z);
            this.params = bundle;
            String countryName = LocaleController.getCountryName(bundle == null ? null : bundle.getString("country"));
            if (TextUtils.isEmpty(countryName)) {
                this.cells[0].subtitleView.setText(LocaleController.getString(org.telegram.messenger.R.string.SMSFee1Text));
            } else {
                this.cells[0].subtitleView.setText(LocaleController.formatString(org.telegram.messenger.R.string.SMSFee1TextCountry, countryName));
            }
            final String string = bundle == null ? null : bundle.getString("product");
            final String string2 = bundle == null ? null : bundle.getString("phoneFormated");
            final String string3 = bundle == null ? null : bundle.getString("phoneHash");
            final String string4 = bundle == null ? null : bundle.getString("support_email_email");
            final String string5 = bundle == null ? null : bundle.getString("support_email_subject");
            final String string6 = bundle == null ? null : bundle.getString("currency");
            long j = bundle == null ? 0L : bundle.getLong("amount");
            this.optionsButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginPayView.this.lambda$setParams$2(string4, string5, string2, view);
                }
            });
            this.button.setEnabled(true);
            this.button.setOnClickListener(null);
            if (BuildVars.useInvoiceBilling()) {
                if (!TextUtils.isEmpty(string6) && j > 0) {
                    this.button.setVisibility(0);
                    this.button.setLoading(false);
                    this.button.setText(LocaleController.formatString(org.telegram.messenger.R.string.SMSFeePurchaseTitle, BillingController.getInstance().formatCurrency(j, string6)), false);
                    this.button.setSubText(LocaleController.getString(org.telegram.messenger.R.string.SMSFeePurchaseText), false);
                    final long j2 = j;
                    this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginPayView.this.lambda$setParams$10(string6, j2, string3, string2, view);
                        }
                    });
                    return;
                }
                this.button.setVisibility(0);
                this.button.setLoading(false);
                this.button.setEnabled(false);
                this.button.setText(LocaleController.getString(org.telegram.messenger.R.string.Unavailable), false);
                return;
            }
            if (TextUtils.isEmpty(string)) {
                this.button.setVisibility(8);
                return;
            }
            this.button.setVisibility(0);
            this.button.setLoading(true);
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$setParams$28(string, string3, string2);
                }
            };
            if (!BillingController.getInstance().isReady()) {
                BillingController.getInstance().whenSetuped(runnable);
            } else {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$2(final String str, final String str2, final String str3, View view) {
            ItemOptions.makeOptions(LoginActivity.this, this.optionsButton).add(org.telegram.messenger.R.drawable.msg_help, LocaleController.getString(org.telegram.messenger.R.string.SettingsHelp), new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$setParams$1(str, str2, str3);
                }
            }).setGravity(5).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$1(String str, String str2, String str3) {
            Object systemService;
            Object systemService2;
            SignalStrength signalStrength;
            int level;
            String str4;
            SubscriptionManager from;
            String number;
            int simSlotIndex;
            int mcc;
            int mnc;
            CharSequence carrierName;
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                String format = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                if (!TextUtils.isEmpty(str)) {
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                } else {
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra("android.intent.extra.SUBJECT", str2);
                } else {
                    intent.putExtra("android.intent.extra.SUBJECT", "Android Registration/Login Billing Issue #billing_issue");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
                sb.append("Device: ");
                sb.append(Build.MANUFACTURER);
                sb.append(" ");
                sb.append(Build.MODEL);
                sb.append("\n");
                sb.append("OS version: SDK ");
                int i = Build.VERSION.SDK_INT;
                sb.append(i);
                sb.append("\n");
                sb.append("Locale: ");
                sb.append(Locale.getDefault());
                sb.append("\n");
                sb.append("\n");
                sb.append("Target Phone: +");
                sb.append(str3);
                sb.append("\n");
                sb.append("\n");
                try {
                    if (i >= 22) {
                        from = SubscriptionManager.from(getContext());
                        List completeActiveSubscriptionInfoList = i >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                        if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
                            completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                        }
                        if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                            completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                        }
                        if (completeActiveSubscriptionInfoList != null) {
                            Iterator it = completeActiveSubscriptionInfoList.iterator();
                            while (it.hasNext()) {
                                SubscriptionInfo m = LoginActivity$$ExternalSyntheticApiModelOutline4.m(it.next());
                                number = m.getNumber();
                                if (!TextUtils.isEmpty(number)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("SIM");
                                    simSlotIndex = m.getSimSlotIndex();
                                    sb2.append(simSlotIndex);
                                    String sb3 = sb2.toString();
                                    sb.append(sb3);
                                    sb.append(".Phone: ");
                                    sb.append(number);
                                    sb.append("\n");
                                    sb.append(sb3);
                                    sb.append(".MCC: ");
                                    mcc = m.getMcc();
                                    sb.append(mcc);
                                    sb.append("\n");
                                    sb.append(sb3);
                                    sb.append(".MNC: ");
                                    mnc = m.getMnc();
                                    sb.append(mnc);
                                    sb.append("\n");
                                    sb.append(sb3);
                                    sb.append(".Carrier: ");
                                    carrierName = m.getCarrierName();
                                    sb.append(TextUtils.isEmpty(carrierName) ? "unknown" : m.getCarrierName());
                                    sb.append("\n\n");
                                }
                            }
                        }
                    } else {
                        try {
                            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                            if (!TextUtils.isEmpty(line1Number)) {
                                sb.append("SIM0.Phone: ");
                                sb.append(line1Number);
                                sb.append("\n");
                                sb.append("SIM0.MCC: unknown\n");
                                sb.append("SIM0.MNC: unknown\n");
                                sb.append("SIM0.Carrier: unknown\n\n");
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        systemService = getContext().getSystemService((Class<Object>) TelephonyManager.class);
                        systemService2 = getContext().getSystemService((Class<Object>) ConnectivityManager.class);
                        signalStrength = ((TelephonyManager) systemService).getSignalStrength();
                        if (signalStrength != null) {
                            sb.append("Signal: ");
                            level = signalStrength.getLevel();
                            sb.append(level);
                            sb.append("/4\n");
                        } else {
                            sb.append("Signal: unknown\n");
                        }
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                } else {
                    sb.append("Signal: unknown\n");
                }
                sb.append("Wi-Fi: ");
                sb.append(AndroidUtilities.isWifiEnabled(getContext()));
                sb.append("\n");
                sb.append("Airplane Mode: ");
                sb.append(AndroidUtilities.isInAirplaneMode(getContext()));
                sb.append("\n");
                sb.append("\n");
                sb.append("App: ");
                sb.append(BuildVars.APP_ID);
                sb.append("\n");
                int i2 = packageInfo.versionCode % 10;
                if (i2 == 1 || i2 == 2) {
                    str4 = "store";
                } else if (ApplicationLoader.isStandaloneBuild()) {
                    str4 = "direct";
                } else if (ApplicationLoader.isBetaBuild()) {
                    str4 = "beta";
                } else if (ApplicationLoader.isHuaweiStoreBuild()) {
                    str4 = "huawei";
                } else {
                    str4 = "universal";
                }
                sb.append("App version: ");
                sb.append(format);
                sb.append(" ");
                sb.append(str4);
                sb.append("\n");
                sb.append("\n");
                sb.append("Issue: ");
                sb.append("billing_issue");
                sb.append("\n");
                if (!TextUtils.isEmpty(this.lastError)) {
                    sb.append("Error: ");
                    sb.append(this.lastError);
                    sb.append("\n");
                }
                sb.append("\n\n================================================\n");
                sb.append("WRITE YOUR COMMENT HERE:\n");
                sb.append("\n");
                sb.append("\n");
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                getContext().startActivity(Intent.createChooser(intent, "Send email..."));
            } catch (Exception unused) {
                LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.AppName), LocaleController.getString("NoMailInstalled", org.telegram.messenger.R.string.NoMailInstalled));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$10(String str, long j, String str2, String str3, View view) {
            if (this.button.isLoading()) {
                return;
            }
            this.button.setLoading(true);
            final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
            tL_inputStorePaymentAuthCode.currency = str;
            tL_inputStorePaymentAuthCode.amount = j;
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            tL_inputStorePaymentAuthCode.phone_code_hash = str2;
            tL_inputStorePaymentAuthCode.phone_number = str3;
            final TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
            tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
            JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(null);
            if (makeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = makeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            LoginActivity.this.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda11
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginPayView.this.lambda$setParams$9(tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, tLObject, tL_error);
                }
            }, 74);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$9(final TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$setParams$8(tLObject, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$8(TLObject tLObject, TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.TL_error tL_error) {
            this.button.setLoading(false);
            if (tLObject instanceof TLRPC.PaymentForm) {
                final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                LoginActivity.this.getMessagesController().putUsers(paymentForm.users, false);
                final PaymentFormActivity paymentFormActivity = new PaymentFormActivity(paymentForm, (TLRPC.InputInvoice) tL_inputInvoicePremiumAuthCode, true, (BaseFragment) LoginActivity.this);
                paymentFormActivity.setCustomResultReceiver(new Utilities.Callback() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda16
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        LoginActivity.LoginPayView.this.lambda$setParams$4(paymentFormActivity, tL_inputStorePaymentAuthCode, paymentForm, (TLRPC.TL_payments_paymentResult) obj);
                    }
                });
                paymentFormActivity.setCustomErrorReceiver(new Utilities.CallbackReturn() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda17
                    @Override // org.telegram.messenger.Utilities.CallbackReturn
                    public final Object run(Object obj) {
                        Boolean lambda$setParams$6;
                        lambda$setParams$6 = LoginActivity.LoginPayView.this.lambda$setParams$6((TLRPC.TL_error) obj);
                        return lambda$setParams$6;
                    }
                });
                LoginActivity.this.presentFragment(paymentFormActivity);
                return;
            }
            if (tL_error == null) {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(org.telegram.messenger.R.raw.error, LocaleController.getString(org.telegram.messenger.R.string.UnknownError));
            } else if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginPayView.this.lambda$setParams$7();
                    }
                });
            } else {
                this.lastError = tL_error.text;
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(org.telegram.messenger.R.raw.error, LocaleController.formatString(org.telegram.messenger.R.string.UnknownErrorCode, tL_error.text));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$4(final PaymentFormActivity paymentFormActivity, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.PaymentForm paymentForm, TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$setParams$3(paymentFormActivity, tL_inputStorePaymentAuthCode, paymentForm);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$3(PaymentFormActivity paymentFormActivity, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm) {
            paymentFormActivity.lambda$onBackPressed$340();
            startPoll(tL_inputStorePaymentAuthCode.phone_number, tL_inputStorePaymentAuthCode.phone_code_hash, paymentForm.form_id);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Boolean lambda$setParams$6(TLRPC.TL_error tL_error) {
            if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda21
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginPayView.this.lambda$setParams$5();
                    }
                });
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$5() {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.CodeExpired));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$7() {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.CodeExpired));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$28(final String str, final String str2, final String str3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(str).build());
            FileLog.d("LoginBilling querying \"" + str + "\" product");
            BillingController.getInstance().queryProductDetails(arrayList, new ProductDetailsResponseListener() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda10
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                    LoginActivity.LoginPayView.this.lambda$setParams$27(str, str2, str3, billingResult, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$27(final String str, final String str2, final String str3, final BillingResult billingResult, final List list) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$setParams$26(str, billingResult, list, str2, str3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$26(final String str, BillingResult billingResult, List list, String str2, String str3) {
            FileLog.d("LoginBilling queried \"" + str + "\" product: " + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            if (billingResult.getResponseCode() != 0) {
                this.lastError = "BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode());
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(org.telegram.messenger.R.raw.error, LocaleController.formatString(org.telegram.messenger.R.string.UnknownErrorCode, BillingController.getResponseCodeString(billingResult.getResponseCode())));
                return;
            }
            if (list != null && !list.isEmpty()) {
                final ProductDetails productDetails = (ProductDetails) list.get(0);
                final ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                tL_inputStorePaymentAuthCode.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                tL_inputStorePaymentAuthCode.amount = (long) ((oneTimePurchaseOfferDetails.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)));
                tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str2) ? "" : str2;
                tL_inputStorePaymentAuthCode.phone_number = str3;
                FileLog.d("LoginBilling found \"" + str + "\" product, with currency=" + tL_inputStorePaymentAuthCode.currency + " amount=" + tL_inputStorePaymentAuthCode.amount + "; phone=" + str3 + ", phone_code_hash=" + str2);
                final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_payments_canPurchaseStore, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda15
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginPayView.this.lambda$setParams$25(oneTimePurchaseOfferDetails, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore, tLObject, tL_error);
                    }
                }, 10);
                return;
            }
            this.lastError = "PRODUCT_NOT_FOUND";
            BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(org.telegram.messenger.R.raw.error, LocaleController.formatString(org.telegram.messenger.R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$25(final ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, final ProductDetails productDetails, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final String str, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$setParams$24(tLObject, tL_error, oneTimePurchaseOfferDetails, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$24(TLObject tLObject, TLRPC.TL_error tL_error, ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, final ProductDetails productDetails, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final String str, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
            FileLog.d("LoginBilling canPurchaseStore returned " + tLObject + " " + tL_error);
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                this.button.setText(LocaleController.formatString(org.telegram.messenger.R.string.SMSFeePurchaseTitle, oneTimePurchaseOfferDetails.getFormattedPrice()), false);
                this.button.setSubText(LocaleController.getString(org.telegram.messenger.R.string.SMSFeePurchaseText), false);
                this.button.setLoading(false);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda22
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginActivity.LoginPayView.this.lambda$setParams$23(productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore, view);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                this.lastError = "RESPONSE_FALSE";
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(org.telegram.messenger.R.raw.error, LocaleController.formatString(org.telegram.messenger.R.string.UnknownErrorCode, "RESPONSE_FALSE"));
            } else if (tL_error != null) {
                this.lastError = tL_error.text;
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).showForError(tL_error);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$23(final ProductDetails productDetails, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final String str, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, View view) {
            if (this.button.isLoading()) {
                return;
            }
            this.button.setLoading(true);
            final Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda25
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    LoginActivity.LoginPayView.this.lambda$setParams$11((String) obj);
                }
            };
            FileLog.d("LoginBilling, querying done purchases...");
            final Runnable runnable = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$setParams$16(productDetails, callback, tL_inputStorePaymentAuthCode);
                }
            };
            BillingController.getInstance().queryPurchases("inapp", new PurchasesResponseListener() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda27
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    LoginActivity.LoginPayView.this.lambda$setParams$22(str, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, runnable, billingResult, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$11(String str) {
            FileLog.d("LoginBilling purchased done " + str);
            if ("CANCELLED".equalsIgnoreCase(str)) {
                this.button.setLoading(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$16(ProductDetails productDetails, final Utilities.Callback callback, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode) {
            LoginActivity.this.paid = true;
            BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda28
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    LoginActivity.LoginPayView.lambda$setParams$13(Utilities.Callback.this, (BillingResult) obj);
                }
            });
            BillingController.getInstance().setOnCanceled(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.lambda$setParams$15(Utilities.Callback.this);
                }
            });
            BillingController.getInstance().launchBillingFlow(LoginActivity.this.getParentActivity(), AccountInstance.getInstance(((BaseFragment) LoginActivity.this).currentAccount), tL_inputStorePaymentAuthCode, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setParams$13(final Utilities.Callback callback, BillingResult billingResult) {
            final String responseCodeString = billingResult.getResponseCode() == 0 ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Utilities.Callback.this.run(responseCodeString);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setParams$15(final Utilities.Callback callback) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Utilities.Callback.this.run("CANCELLED");
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$22(final String str, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final Runnable runnable, final BillingResult billingResult, final List list) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$setParams$21(billingResult, list, str, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, runnable);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$21(BillingResult billingResult, List list, String str, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final Runnable runnable) {
            if (billingResult.getResponseCode() == 0 && list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final Purchase purchase = (Purchase) it.next();
                    if (purchase.getProducts().contains(str)) {
                        TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                        tL_dataJSON.data = purchase.getOriginalJson();
                        tL_inputStorePaymentAuthCode.restore = true;
                        tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                        LoginActivity.this.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda1
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                LoginActivity.LoginPayView.this.lambda$setParams$20(tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore, runnable, tLObject, tL_error);
                            }
                        }, 74);
                        return;
                    }
                }
            }
            runnable.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$20(final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, Purchase purchase, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (!(tLObject instanceof TLRPC.Updates)) {
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            runnable.run();
                        }
                    });
                    return;
                }
                return;
            }
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            Iterator it = MessagesController.findUpdatesAndRemove(updates, TLRPC.TL_updateSentPhoneCode.class).iterator();
            while (it.hasNext()) {
                final TLRPC.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TLRPC.TL_updateSentPhoneCode) it.next();
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginPayView.this.lambda$setParams$17(tL_inputStorePaymentAuthCode, tL_updateSentPhoneCode);
                    }
                });
            }
            LoginActivity.this.getMessagesController().processUpdates(updates, false);
            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$setParams$18();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$17(TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
            LoginActivity.this.paid = true;
            LoginActivity loginActivity = (LoginActivity) LaunchActivity.findFragment(LoginActivity.class);
            if (loginActivity == null) {
                loginActivity = new LoginActivity(((BaseFragment) LoginActivity.this).currentAccount);
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(loginActivity);
                }
            }
            loginActivity.open(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setParams$18() {
            this.button.setLoading(false);
        }

        private void startPoll(String str, String str2, long j) {
            if (this.polling) {
                return;
            }
            this.polling = true;
            this.pollingPhoneNumber = str;
            this.pollingPhoneCodeHash = str2;
            this.pollingFormId = j;
            this.button.setLoading(true);
            poll();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void poll() {
            if (this.polling) {
                TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
                tL_checkPaidAuth.form_id = this.pollingFormId;
                tL_checkPaidAuth.phone_number = this.pollingPhoneNumber;
                tL_checkPaidAuth.phone_code_hash = this.pollingPhoneCodeHash;
                this.pollingRequestId = ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_checkPaidAuth, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda23
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginPayView.this.lambda$poll$30(tLObject, tL_error);
                    }
                }, 1096);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$poll$30(final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.lambda$poll$29(tLObject, tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$poll$29(TLObject tLObject, TLRPC.TL_error tL_error) {
            this.pollingRequestId = -1;
            if (tLObject instanceof TLRPC.auth_SentCode) {
                this.polling = false;
                this.button.setLoading(false);
                LoginActivity.this.lambda$resendCodeFromSafetyNet$20(this.params, (TLRPC.auth_SentCode) tLObject);
                return;
            }
            if (tL_error != null) {
                String str = tL_error.text;
                if (str != null && str.startsWith("FLOOD_WAIT_")) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda30
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginPayView.this.poll();
                        }
                    }, Integer.parseInt(tL_error.text.substring(11)) * MediaDataController.MAX_STYLE_RUNS_COUNT);
                    return;
                }
                String str2 = tL_error.text;
                if (str2 != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(str2)) {
                    onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(org.telegram.messenger.R.string.RestorePasswordNoEmailTitle), LocaleController.getString(org.telegram.messenger.R.string.CodeExpired));
                } else {
                    this.lastError = tL_error.text;
                    this.polling = false;
                    this.button.setLoading(false);
                    BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(org.telegram.messenger.R.raw.error, LocaleController.formatString(org.telegram.messenger.R.string.UnknownErrorCode, tL_error.text));
                }
            }
        }

        private void stopPoll() {
            if (this.pollingRequestId >= 0) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).cancelRequest(this.pollingRequestId, true);
                this.pollingRequestId = -1;
            }
            this.polling = false;
            this.button.setLoading(false);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onHide() {
            super.onHide();
            stopPoll();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.pendingSwitchingAccount) {
                this.cachedFragmentView = this.fragmentView;
            }
            this.fragmentView = null;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && !this.pendingSwitchingAccount) {
            ViewGroup viewGroup2 = (ViewGroup) actionBar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }
}
