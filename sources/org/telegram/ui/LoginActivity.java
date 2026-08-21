package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
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
import org.scilab.forge.jlatexmath.TeXSymbolParser;
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
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
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
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
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
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
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
import org.telegram.ui.Components.chat.ViewPositionWatcher;
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
    private FragmentFloatingButton floatingButton;
    private TransformableLoginButtonView floatingButtonIcon;
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

    /* JADX INFO: Access modifiers changed from: private */
    static class ProgressView extends View {
    }

    public LoginActivity setIntroView(View view, TextView textView) {
        return this;
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
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        return super.onFragmentCreate();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x047a A[EDGE_INSN: B:115:0x047a->B:116:0x047a BREAK  A[LOOP:1: B:68:0x03ee->B:103:0x0476], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0458 A[ADDED_TO_REGION] */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View createView(Context context) {
        Bundle bundle;
        int i;
        SlideView[] slideViewArr;
        boolean z;
        int i2;
        View view = this.cachedFragmentView;
        if (view != null) {
            this.fragmentView = view;
            this.cachedFragmentView = null;
            return view;
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.LoginActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i3) {
                if (i3 == 1) {
                    LoginActivity.this.onDoneButtonPressed();
                } else if (i3 == -1 && LoginActivity.this.onBackPressed(true)) {
                    LoginActivity.this.finishFragment();
                }
            }
        });
        this.currentDoneType = 0;
        boolean[] zArr = this.doneButtonVisible;
        zArr[0] = true;
        zArr[1] = false;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.LoginActivity.2
            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i3, int i4) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LoginActivity.this.floatingButton.getLayoutParams();
                int dp = LoginActivity.this.isCustomKeyboardVisible() ? AndroidUtilities.dp(226.0f) : 0;
                if (LoginActivity.this.isCustomKeyboardVisible() && measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    dp -= measureKeyboardHeight();
                }
                if (Bulletin.getVisibleBulletin() != null && Bulletin.getVisibleBulletin().isShowing()) {
                    super.onMeasure(i3, i4);
                    marginLayoutParams.bottomMargin = ((AndroidUtilities.dp(14.0f) + Bulletin.getVisibleBulletin().getLayout().getMeasuredHeight()) - AndroidUtilities.dp(10.0f)) + dp;
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + dp;
                }
                int i5 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) LoginActivity.this.backButtonView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i5;
                ((ViewGroup.MarginLayoutParams) LoginActivity.this.proxyButtonView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i5;
                ((ViewGroup.MarginLayoutParams) LoginActivity.this.radialProgressView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i5;
                if (LoginActivity.this.emailChangeSkipButton != null) {
                    ((ViewGroup.MarginLayoutParams) LoginActivity.this.emailChangeSkipButton.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i5;
                }
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f) && LoginActivity.this.keyboardView.getVisibility() != 8 && !LoginActivity.this.isCustomKeyboardForceDisabled() && !LoginActivity.this.customKeyboardWasVisible) {
                    if (LoginActivity.this.keyboardAnimator != null) {
                        LoginActivity.this.keyboardAnimator.cancel();
                    }
                    LoginActivity.this.keyboardView.setVisibility(8);
                }
                super.onMeasure(i3, i4);
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda8
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate
            public final void onSizeChanged(int i3, boolean z2) {
                LoginActivity.$r8$lambda$q5ChveneUapvhYlla6JcwXPBjxo(LoginActivity.this, i3, z2);
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
            protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
                super.onLayout(z2, i3, i4, i5, i6);
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
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
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
        int i3 = 18;
        this.views[18] = new LoginPayView(context);
        int i4 = 0;
        while (true) {
            SlideView[] slideViewArr2 = this.views;
            if (i4 >= slideViewArr2.length) {
                break;
            }
            slideViewArr2[i4].setVisibility(i4 == 0 ? 0 : 8);
            this.slideViewsContainer.addView(this.views[i4], LayoutHelper.createFrame(-1, -1.0f, 17, AndroidUtilities.isTablet() ? 26.0f : 18.0f, i4 != i3 ? 30.0f : 0.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
            i4++;
            i3 = 18;
        }
        Bundle loadCurrentState = this.activityMode == 0 ? loadCurrentState(this.newAccount, this.currentAccount) : null;
        if (loadCurrentState != null && ((i2 = loadCurrentState.getInt("currentViewNum", 0)) < 0 || i2 >= this.views.length)) {
            loadCurrentState = null;
        }
        if (loadCurrentState != null) {
            this.currentViewNum = loadCurrentState.getInt("currentViewNum", 0);
            this.syncContacts = loadCurrentState.getInt("syncContacts", 1) == 1;
            int i5 = this.currentViewNum;
            if (i5 >= 1 && i5 <= 4) {
                int i6 = loadCurrentState.getInt("open");
                if (i6 != 0 && Math.abs((System.currentTimeMillis() / 1000) - i6) >= 86400) {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundle = null;
                }
            } else if (i5 == 6) {
                if (((LoginActivityPasswordView) this.views[6]).currentPassword == null) {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundle = null;
                }
            } else if (i5 == 7 && ((LoginActivityRecoverView) this.views[7]).passwordString == null) {
                this.currentViewNum = 0;
                clearCurrentState();
                bundle = null;
            }
            FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
            this.floatingButton = fragmentFloatingButton;
            fragmentFloatingButton.setButtonVisible(this.doneButtonVisible[0], false);
            this.floatingAutoAnimator = VerticalPositionAutoAnimator.attach(this.floatingButton);
            this.sizeNotifierFrameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParamsBig());
            this.floatingButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.this.onDoneButtonPressed();
                }
            });
            this.floatingAutoAnimator.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda10
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    LoginActivity.$r8$lambda$8HSHuuCDEZWrFgEC9n1MdRwhaac(LoginActivity.this, dynamicAnimation, f, f2);
                }
            });
            ImageView imageView = new ImageView(context);
            this.backButtonView = imageView;
            imageView.setImageResource(R.drawable.ic_ab_back);
            this.backButtonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.$r8$lambda$rP_z0SmrR9Pqdh2YUHBLXuuiW0Y(LoginActivity.this, view2);
                }
            });
            this.backButtonView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
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
                this.emailChangeSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.emailChangeSkipButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
                this.sizeNotifierFrameLayout.addView(this.emailChangeSkipButton, LayoutHelper.createFrame(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                this.emailChangeSkipButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        LoginActivity.$r8$lambda$AQoW_GgTffAeeq8WIA6-NgIDKZs(LoginActivity.this, view2);
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
                    LoginActivity.$r8$lambda$SJAv2wWiqAlsCdlebWAu3FEngxM(LoginActivity.this, view2);
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
            this.floatingButton.setContentDescription(LocaleController.getString(R.string.Done));
            this.floatingButton.addView(this.floatingButtonIcon, LayoutHelper.createFrame(56, 56, 17));
            this.floatingButton.addAdditionalView(this.floatingButtonIcon);
            if (bundle != null) {
                this.restoringState = true;
            }
            i = 0;
            while (true) {
                slideViewArr = this.views;
                if (i < slideViewArr.length) {
                    break;
                }
                SlideView slideView = slideViewArr[i];
                if (bundle != null) {
                    if (i >= 1 && i <= 4) {
                        if (i == this.currentViewNum) {
                            slideView.restoreStateParams(bundle);
                        }
                    } else {
                        slideView.restoreStateParams(bundle);
                    }
                }
                if (this.currentViewNum == i) {
                    this.backButtonView.setVisibility((slideView.needBackButton() || this.newAccount || this.activityMode == 2) ? 0 : 8);
                    slideView.setVisibility(0);
                    slideView.onShow();
                    setCustomKeyboardVisible(slideView.hasCustomKeyboard(), false);
                    this.currentDoneType = 0;
                    if (i != 0 && i != 5 && i != 6) {
                        if (i != 9) {
                            if (i != 10 && i != 12) {
                                z = false;
                                showDoneButton(z, false);
                                if (i != 1 || i == 2 || i == 3 || i == 4) {
                                    this.currentDoneType = 1;
                                }
                            }
                            z = true;
                            showDoneButton(z, false);
                            if (i != 1) {
                            }
                            this.currentDoneType = 1;
                        }
                    }
                    z = true;
                    showDoneButton(z, false);
                    if (i != 1) {
                    }
                    this.currentDoneType = 1;
                } else if (slideView.getVisibility() != 8) {
                    slideView.setVisibility(8);
                    slideView.onHide();
                }
                i++;
            }
            this.restoringState = false;
            updateColors();
            if (isInCancelAccountDeletionMode()) {
                fillNextCodeParams(this.cancelDeletionParams, this.cancelDeletionCode, false);
            }
            return this.fragmentView;
        }
        bundle = loadCurrentState;
        FragmentFloatingButton fragmentFloatingButton2 = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton2;
        fragmentFloatingButton2.setButtonVisible(this.doneButtonVisible[0], false);
        this.floatingAutoAnimator = VerticalPositionAutoAnimator.attach(this.floatingButton);
        this.sizeNotifierFrameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParamsBig());
        this.floatingButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoginActivity.this.onDoneButtonPressed();
            }
        });
        this.floatingAutoAnimator.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda10
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                LoginActivity.$r8$lambda$8HSHuuCDEZWrFgEC9n1MdRwhaac(LoginActivity.this, dynamicAnimation, f, f2);
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.backButtonView = imageView3;
        imageView3.setImageResource(R.drawable.ic_ab_back);
        this.backButtonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoginActivity.$r8$lambda$rP_z0SmrR9Pqdh2YUHBLXuuiW0Y(LoginActivity.this, view2);
            }
        });
        this.backButtonView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
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
            this.emailChangeSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
            this.emailChangeSkipButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.sizeNotifierFrameLayout.addView(this.emailChangeSkipButton, LayoutHelper.createFrame(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            this.emailChangeSkipButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.$r8$lambda$AQoW_GgTffAeeq8WIA6-NgIDKZs(LoginActivity.this, view2);
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
                LoginActivity.$r8$lambda$SJAv2wWiqAlsCdlebWAu3FEngxM(LoginActivity.this, view2);
            }
        });
        this.proxyButtonView.setAlpha(0.0f);
        this.proxyButtonView.setVisibility(8);
        this.sizeNotifierFrameLayout.addView(this.proxyButtonView, LayoutHelper.createFrame(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        updateProxyButton(false, true);
        RadialProgressView radialProgressView2 = new RadialProgressView(context);
        this.radialProgressView = radialProgressView2;
        radialProgressView2.setSize(AndroidUtilities.dp(20.0f));
        this.radialProgressView.setAlpha(0.0f);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.sizeNotifierFrameLayout.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        TransformableLoginButtonView transformableLoginButtonView2 = new TransformableLoginButtonView(context);
        this.floatingButtonIcon = transformableLoginButtonView2;
        transformableLoginButtonView2.setTransformType(0);
        this.floatingButtonIcon.setProgress(1.0f);
        this.floatingButtonIcon.setDrawBackground(false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Done));
        this.floatingButton.addView(this.floatingButtonIcon, LayoutHelper.createFrame(56, 56, 17));
        this.floatingButton.addAdditionalView(this.floatingButtonIcon);
        if (bundle != null) {
        }
        i = 0;
        while (true) {
            slideViewArr = this.views;
            if (i < slideViewArr.length) {
            }
            i++;
        }
        this.restoringState = false;
        updateColors();
        if (isInCancelAccountDeletionMode()) {
        }
        return this.fragmentView;
    }

    public static /* synthetic */ void $r8$lambda$q5ChveneUapvhYlla6JcwXPBjxo(LoginActivity loginActivity, int i, boolean z) {
        Runnable runnable;
        loginActivity.getClass();
        if (i > AndroidUtilities.dp(20.0f) && loginActivity.isCustomKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(loginActivity.fragmentView);
        }
        if (i > AndroidUtilities.dp(20.0f) || (runnable = loginActivity.keyboardHideCallback) == null) {
            return;
        }
        runnable.run();
        loginActivity.keyboardHideCallback = null;
    }

    public static /* synthetic */ void $r8$lambda$8HSHuuCDEZWrFgEC9n1MdRwhaac(LoginActivity loginActivity, DynamicAnimation dynamicAnimation, float f, float f2) {
        PhoneNumberConfirmView phoneNumberConfirmView = loginActivity.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.updateFabPosition();
        }
    }

    public static /* synthetic */ void $r8$lambda$rP_z0SmrR9Pqdh2YUHBLXuuiW0Y(LoginActivity loginActivity, View view) {
        if (loginActivity.onBackPressed(true)) {
            loginActivity.finishFragment();
        }
    }

    public static /* synthetic */ void $r8$lambda$AQoW_GgTffAeeq8WIA6-NgIDKZs(LoginActivity loginActivity, View view) {
        Runnable runnable = loginActivity.emailChangeSkipCallback;
        if (runnable != null) {
            runnable.run();
        }
        loginActivity.finishFragment();
    }

    public static /* synthetic */ void $r8$lambda$SJAv2wWiqAlsCdlebWAu3FEngxM(LoginActivity loginActivity, View view) {
        loginActivity.getClass();
        loginActivity.presentFragment(new ProxyListActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCustomKeyboardForceDisabled() {
        return AndroidUtilities.isAccessibilityTouchExplorationEnabled();
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
                        LoginActivity.$r8$lambda$TFlKJ2r31imXsuyvhCeHgvhg68o(LoginActivity.this, valueAnimator);
                    }
                });
                this.keyboardAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.5
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
                    LoginActivity.$r8$lambda$uSxXefo0zmed2n8QiDUiVnvLQs0(LoginActivity.this, valueAnimator);
                }
            });
            this.keyboardAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.6
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

    public static /* synthetic */ void $r8$lambda$TFlKJ2r31imXsuyvhCeHgvhg68o(LoginActivity loginActivity, ValueAnimator valueAnimator) {
        loginActivity.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        loginActivity.keyboardView.setAlpha(floatValue);
        loginActivity.keyboardView.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
    }

    public static /* synthetic */ void $r8$lambda$uSxXefo0zmed2n8QiDUiVnvLQs0(LoginActivity loginActivity, ValueAnimator valueAnimator) {
        loginActivity.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        loginActivity.keyboardView.setAlpha(floatValue);
        loginActivity.keyboardView.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
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
                this.views[this.currentViewNum].onNextPressed(null);
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
                    LoginActivity.LoginActivityRegisterView.this.imageUpdater.openGallery();
                }
            });
        }
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
                            LoginActivity.this.needRequestPermissions = false;
                        }
                    }, 200L);
                    getParentActivity().requestPermissions((String[]) this.permissionsShowItems.toArray(new String[0]), 7);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.emailChangeIsSuggestion;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        int i = 0;
        if (this.emailChangeIsSuggestion && this.currentViewNum == 12) {
            return false;
        }
        int i2 = this.currentViewNum;
        if (i2 == 0 || (this.activityMode == 3 && i2 == 12)) {
            if (z) {
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
                clearCurrentState();
            }
            return true;
        }
        if (i2 == 6) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(0, true, null, true);
            }
        } else if (i2 == 7 || i2 == 8) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(6, true, null, true);
            }
        } else if ((i2 >= 1 && i2 <= 4) || i2 == 11 || i2 == 15) {
            if (z && this.views[i2].onBackPressed(false)) {
                setPage(0, true, null, true);
            }
        } else if (i2 == 5) {
            if (z) {
                ((LoginActivityRegisterView) this.views[i2]).wrongNumber.callOnClick();
            }
        } else if (i2 == 9) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(7, true, null, true);
            }
        } else if (i2 == 10) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(9, true, null, true);
            }
        } else if (i2 == 13) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(12, true, null, true);
            }
        } else if (z && this.views[i2].onBackPressed(true)) {
            setPage(0, true, null, true);
        }
        return false;
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
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
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
            int i = R.id.timeout_callback;
            Runnable runnable = (Runnable) view.getTag(i);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            final OutlineTextContainerView outlineTextContainerView = (OutlineTextContainerView) view;
            AtomicReference atomicReference = new AtomicReference();
            final EditText attachedEditText = outlineTextContainerView.getAttachedEditText();
            final 7 r3 = new 7(attachedEditText, atomicReference);
            outlineTextContainerView.animateError(1.0f);
            Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda34
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.$r8$lambda$Q6A9KXbCCv9eN5RGiAuvKxNklYw(OutlineTextContainerView.this, view, attachedEditText, r3);
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

    class 7 implements TextWatcher {
        final /* synthetic */ EditText val$editText;
        final /* synthetic */ AtomicReference val$timeoutCallbackRef;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        7(EditText editText, AtomicReference atomicReference) {
            this.val$editText = editText;
            this.val$timeoutCallbackRef = atomicReference;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            final EditText editText = this.val$editText;
            final AtomicReference atomicReference = this.val$timeoutCallbackRef;
            editText.post(new Runnable() { // from class: org.telegram.ui.LoginActivity$7$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.7.$r8$lambda$ttrkBSDQzrDg1-u3lvKJfpneB1M(LoginActivity.7.this, editText, atomicReference);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$ttrkBSDQzrDg1-u3lvKJfpneB1M(7 r0, EditText editText, AtomicReference atomicReference) {
            r0.getClass();
            editText.removeTextChangedListener(r0);
            editText.removeCallbacks((Runnable) atomicReference.get());
            ((Runnable) atomicReference.get()).run();
        }
    }

    public static /* synthetic */ void $r8$lambda$Q6A9KXbCCv9eN5RGiAuvKxNklYw(OutlineTextContainerView outlineTextContainerView, View view, final EditText editText, final TextWatcher textWatcher) {
        outlineTextContainerView.animateError(0.0f);
        view.setTag(R.id.timeout_callback, null);
        if (editText != null) {
            editText.post(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda37
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
            builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber));
        } else if (phoneInputData == null || phoneInputData.patterns == null || phoneInputData.patterns.isEmpty() || phoneInputData.country == null) {
            builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString(R.string.InvalidPhoneNumber));
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
                builder.setTitle(LocaleController.getString(R.string.WrongNumberFormat));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, phoneInputData.country.name, phoneInputData.phoneNumber)));
            } else {
                builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
                builder.setMessage(LocaleController.getString(R.string.InvalidPhoneNumber));
            }
        }
        builder.setNeutralButton(LocaleController.getString("BotHelp", R.string.BotHelp), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda30
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i2) {
                LoginActivity.$r8$lambda$NEA2cL-pdJBDTcnTMniC1pbQLJI(z, str, baseFragment, alertDialog, i2);
            }
        });
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        baseFragment.showDialog(builder.create());
    }

    public static /* synthetic */ void $r8$lambda$NEA2cL-pdJBDTcnTMniC1pbQLJI(boolean z, String str, BaseFragment baseFragment, AlertDialog alertDialog, int i) {
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
            builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
            builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
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
            if (z3) {
                this.floatingButton.setButtonVisible(z, z2);
                return;
            }
            return;
        }
        this.showDoneAnimation[i2] = new AnimatorSet();
        if (z3) {
            this.floatingButton.setButtonVisible(z, z2);
        }
        this.showDoneAnimation[this.currentDoneType].addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] == null || !LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0].equals(animator) || z || !z3 || LoginActivity.this.floatingButtonIcon.getAlpha() == 1.0f) {
                    return;
                }
                LoginActivity.this.floatingButtonIcon.setAlpha(1.0f);
                LoginActivity.this.floatingButtonIcon.setScaleX(1.0f);
                LoginActivity.this.floatingButtonIcon.setScaleY(1.0f);
                LoginActivity.this.floatingButtonIcon.setVisibility(0);
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
            i3 = NotificationCenter.dialogPhotosUpdate;
        } else {
            timeInterpolator = AndroidUtilities.accelerateInterpolator;
        }
        this.showDoneAnimation[this.currentDoneType].setDuration(i3);
        this.showDoneAnimation[this.currentDoneType].setInterpolator(timeInterpolator);
        this.showDoneAnimation[this.currentDoneType].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDoneButtonPressed() {
        if (this.doneButtonVisible[this.currentDoneType]) {
            if (this.radialProgressView.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle));
                builder.setMessage(LocaleController.getString("StopLoading", R.string.StopLoading));
                builder.setPositiveButton(LocaleController.getString("WaitMore", R.string.WaitMore), null);
                builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda31
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.$r8$lambda$V_reFiXScvuotNahIZHVeDlxId4(LoginActivity.this, alertDialog, i);
                    }
                });
                showDialog(builder.create());
                return;
            }
            this.views[this.currentViewNum].onNextPressed(null);
        }
    }

    public static /* synthetic */ void $r8$lambda$V_reFiXScvuotNahIZHVeDlxId4(LoginActivity loginActivity, AlertDialog alertDialog, int i) {
        loginActivity.views[loginActivity.currentViewNum].onCancelPressed();
        loginActivity.needHideProgress(true);
    }

    private void showEditDoneProgress(boolean z, boolean z2) {
        showEditDoneProgress(z, z2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEditDoneProgress(final boolean z, final boolean z2, final boolean z3) {
        if (z2 && this.doneProgressVisible[this.currentDoneType] == z && !z3) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.showEditDoneProgress(z, z2, z3);
                }
            });
            return;
        }
        final int i = this.currentDoneType;
        boolean z4 = i == 0;
        if (!z3 && !z4) {
            this.doneProgressVisible[i] = z;
            if (z2) {
                if (this.postedEditDoneCallback[i]) {
                    AndroidUtilities.cancelRunOnUIThread(this.editDoneCallback[i]);
                    this.postedEditDoneCallback[this.currentDoneType] = false;
                    return;
                } else if (z) {
                    Runnable[] runnableArr = this.editDoneCallback;
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda25
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.$r8$lambda$E2IWdBjywMGJGdWL9fUPUQloFzo(LoginActivity.this, i, z, z2);
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
        if (z4) {
            this.floatingButton.setProgressVisible(z, z2);
            return;
        }
        if (z2) {
            this.doneItemAnimation = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.9
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    if (z) {
                        LoginActivity.this.radialProgressView.setVisibility(0);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (!z) {
                        LoginActivity.this.radialProgressView.setVisibility(4);
                    }
                    if (LoginActivity.this.doneItemAnimation == null || !LoginActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    LoginActivity.this.doneItemAnimation = null;
                }
            });
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda26
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.$r8$lambda$x9YONjY1miyvs_7B7q2SUr3SvXk(LoginActivity.this, valueAnimator);
                }
            });
            this.doneItemAnimation.playTogether(ofFloat);
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
            return;
        }
        if (z) {
            this.radialProgressView.setVisibility(0);
            this.radialProgressView.setScaleX(1.0f);
            this.radialProgressView.setScaleY(1.0f);
            this.radialProgressView.setAlpha(1.0f);
            return;
        }
        this.radialProgressView.setTag(null);
        this.radialProgressView.setVisibility(4);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.radialProgressView.setAlpha(0.0f);
    }

    public static /* synthetic */ void $r8$lambda$E2IWdBjywMGJGdWL9fUPUQloFzo(LoginActivity loginActivity, int i, boolean z, boolean z2) {
        int i2 = loginActivity.currentDoneType;
        loginActivity.currentDoneType = i;
        loginActivity.showEditDoneProgress(z, z2, true);
        loginActivity.currentDoneType = i2;
    }

    public static /* synthetic */ void $r8$lambda$x9YONjY1miyvs_7B7q2SUr3SvXk(LoginActivity loginActivity, ValueAnimator valueAnimator) {
        loginActivity.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = (0.9f * floatValue) + 0.1f;
        loginActivity.radialProgressView.setScaleX(f);
        loginActivity.radialProgressView.setScaleY(f);
        loginActivity.radialProgressView.setAlpha(floatValue);
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
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.10
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
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        clearCurrentState();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.newAccount) {
                this.newAccount = false;
                this.pendingSwitchingAccount = true;
                ((LaunchActivity) getParentActivity()).switchToAccount(this.currentAccount, true, new GenericProvider() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda41
                    @Override // org.telegram.messenger.GenericProvider
                    public final Object provide(Object obj) {
                        return LoginActivity.$r8$lambda$Jc3JimM27ezyirJ4BlgosEcEtks(z, (Void) obj);
                    }
                });
                this.pendingSwitchingAccount = false;
                finishFragment();
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
                MainTabsActivity mainTabsActivity = new MainTabsActivity();
                mainTabsActivity.prepareDialogsActivity(bundle);
                presentFragment(mainTabsActivity, true);
            }
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
            LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            RestrictedLanguagesSelectActivity.checkRestrictedLanguages(true);
            return;
        }
        if (getParentActivity() instanceof ExternalActionActivity) {
            ((ExternalActionActivity) getParentActivity()).onFinishLogin();
        }
    }

    public static /* synthetic */ MainTabsActivity $r8$lambda$Jc3JimM27ezyirJ4BlgosEcEtks(boolean z, Void r2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("afterSignup", z);
        MainTabsActivity mainTabsActivity = new MainTabsActivity();
        mainTabsActivity.prepareDialogsActivity(bundle);
        return mainTabsActivity;
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
        MessagesController.getInstance(this.currentAccount).loadWebBrowserConfig();
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
    public void fillNextCodeParams(Bundle bundle, TLRPC.auth_SentCode auth_sentcode) {
        fillNextCodeParams(bundle, auth_sentcode, true);
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda28
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.$r8$lambda$V7DuHSHxr7Oq9RT-fUno_faW6r4(LoginActivity.this, bundle, tLObject, tL_error);
                }
            }, 10);
        }
    }

    public static /* synthetic */ void $r8$lambda$V7DuHSHxr7Oq9RT-fUno_faW6r4(final LoginActivity loginActivity, final Bundle bundle, final TLObject tLObject, TLRPC.TL_error tL_error) {
        loginActivity.getClass();
        if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda35
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.$r8$lambda$YwWSeKXRF5mwSbzrLCfK2wnYhc4(LoginActivity.this, bundle, tLObject);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.$r8$lambda$lCAphzIcs_CxNbo_bbPhp2d9ptE(LoginActivity.this);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$YwWSeKXRF5mwSbzrLCfK2wnYhc4(LoginActivity loginActivity, Bundle bundle, TLObject tLObject) {
        loginActivity.getClass();
        loginActivity.fillNextCodeParams(bundle, (TLRPC.auth_SentCode) tLObject);
    }

    public static /* synthetic */ void $r8$lambda$lCAphzIcs_CxNbo_bbPhp2d9ptE(final LoginActivity loginActivity) {
        if (loginActivity.getParentActivity() == null || loginActivity.getParentActivity().isFinishing() || loginActivity.getContext() == null) {
            return;
        }
        new AlertDialog.Builder(loginActivity.getContext()).setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString(R.string.SafetyNetErrorOccurred)).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda38
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                LoginActivity.$r8$lambda$hnx7ki7l-g6B73N8DMuR1-jKtC0(LoginActivity.this, alertDialog, i);
            }
        }).show();
    }

    public static /* synthetic */ void $r8$lambda$hnx7ki7l-g6B73N8DMuR1-jKtC0(LoginActivity loginActivity, AlertDialog alertDialog, int i) {
        loginActivity.forceDisableSafetyNet = true;
        if (loginActivity.currentViewNum != 0) {
            loginActivity.setPage(0, true, null, true);
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
        fillNextCodeParams(bundle, auth_sentcode, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillNextCodeParams(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, final boolean z) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
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
                            LoginActivity.$r8$lambda$epwEcITs8hkl6X7xHKyIlSZQ1ak(LoginActivity.this, bundle, auth_sentcode, string, z, (IntegrityTokenResponse) obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda21
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception exc) {
                            LoginActivity.$r8$lambda$3ckN170ulONR68Rt2Q_f1C-rLdU(LoginActivity.this, bundle, auth_sentcode, exc);
                        }
                    });
                    return;
                }
                SafetyNet.getClient(ApplicationLoader.applicationContext).attest(auth_sentcode.type.nonce, BuildVars.SAFETYNET_KEY).addOnSuccessListener(new OnSuccessListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda22
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        LoginActivity.$r8$lambda$RbczoxBSiujwziZbio5CUyCQsyM(LoginActivity.this, string, auth_sentcode, bundle, z, (SafetyNetApi.AttestationResponse) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda23
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        LoginActivity.$r8$lambda$JfBOaiGNalhyeBwMSCy9YYMsHLo(LoginActivity.this, bundle, auth_sentcode, exc);
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
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
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
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(4, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            setPage(3, z, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            setPage(2, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(15, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 11);
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

    public static /* synthetic */ void $r8$lambda$epwEcITs8hkl6X7xHKyIlSZQ1ak(final LoginActivity loginActivity, final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, String str, final boolean z, IntegrityTokenResponse integrityTokenResponse) {
        loginActivity.getClass();
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(loginActivity.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda27
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LoginActivity.$r8$lambda$qm_5_C3rBZozQPcOyC_SMvrIShg(LoginActivity.this, auth_sentcode, bundle, z, tLObject, tL_error);
            }
        }, 10);
    }

    public static /* synthetic */ void $r8$lambda$qm_5_C3rBZozQPcOyC_SMvrIShg(final LoginActivity loginActivity, final TLRPC.auth_SentCode auth_sentcode, final Bundle bundle, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        loginActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            loginActivity.needHideProgress(false);
            loginActivity.isRequestingFirebaseSms = false;
            auth_sentcode.type.verifiedFirebase = true;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda33
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.fillNextCodeParams(bundle, auth_sentcode, z);
                }
            });
            return;
        }
        FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
    }

    public static /* synthetic */ void $r8$lambda$3ckN170ulONR68Rt2Q_f1C-rLdU(LoginActivity loginActivity, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, Exception exc) {
        loginActivity.getClass();
        String str = "PLAYINTEGRITY_EXCEPTION_" + errorString(exc);
        FileLog.e("{" + str + "} Resend firebase sms because integrity threw error", exc);
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, str);
    }

    public static /* synthetic */ void $r8$lambda$RbczoxBSiujwziZbio5CUyCQsyM(final LoginActivity loginActivity, String str, final TLRPC.auth_SentCode auth_sentcode, final Bundle bundle, final boolean z, SafetyNetApi.AttestationResponse attestationResponse) {
        loginActivity.getClass();
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
                        ConnectionsManager.getInstance(loginActivity.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda29
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                LoginActivity.$r8$lambda$kQEATZpqd40HpYoOnfIJ1QqASAw(LoginActivity.this, auth_sentcode, bundle, z, tLObject, tL_error);
                            }
                        }, 10);
                        return;
                    }
                    if (!optBoolean && !optBoolean2) {
                        FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        return;
                    } else if (!optBoolean) {
                        FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        return;
                    } else {
                        if (optBoolean2) {
                            return;
                        }
                        FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                        return;
                    }
                } catch (JSONException e) {
                    FileLog.e(e);
                    FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                    loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    return;
                }
            }
            FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
    }

    public static /* synthetic */ void $r8$lambda$kQEATZpqd40HpYoOnfIJ1QqASAw(final LoginActivity loginActivity, final TLRPC.auth_SentCode auth_sentcode, final Bundle bundle, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        loginActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            loginActivity.needHideProgress(false);
            loginActivity.isRequestingFirebaseSms = false;
            auth_sentcode.type.verifiedFirebase = true;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda32
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.fillNextCodeParams(bundle, auth_sentcode, z);
                }
            });
            return;
        }
        FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
    }

    public static /* synthetic */ void $r8$lambda$JfBOaiGNalhyeBwMSCy9YYMsHLo(LoginActivity loginActivity, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, Exception exc) {
        loginActivity.getClass();
        FileLog.e(exc);
        String str = "SAFETYNET_EXCEPTION_" + errorString(exc);
        FileLog.d("{" + str + "} Resend firebase sms because of safetynet exception");
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, str);
    }

    public class PhoneView extends SlideView implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
        private Runnable cancelRequestingPasskey;
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
        private boolean requestedPasskey;
        private boolean requestingPasskey;
        private LinkSpanDrawable.LinksTextView subtitleView;
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
            new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.SettingsDebug)).setItems(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda22
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LoginActivity.PhoneView.$r8$lambda$Z8vwk7-AYmAor-OzKbZqxpy9IZg(LoginActivity.PhoneView.this, dialogInterface, i);
                }
            }).show();
        }

        public static /* synthetic */ void $r8$lambda$Z8vwk7-AYmAor-OzKbZqxpy9IZg(PhoneView phoneView, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                phoneView.getClass();
                BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                BulletinFactory.of(LoginActivity.this).createSimpleBulletin(R.raw.chats_infotip, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").show();
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
            this.requestedPasskey = false;
            this.requestingPasskey = false;
            setOrientation(1);
            setGravity(17);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode == 2 ? R.string.ChangePhoneNewNumber : R.string.YourNumber));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
            this.titleView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.PhoneView.$r8$lambda$we9E3ag9GKHkPK9vDsYPMD_IVEY(LoginActivity.PhoneView.this, context, view);
                }
            });
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleView = linksTextView;
            linksTextView.setText(LocaleController.getString(LoginActivity.this.activityMode == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
            this.subtitleView.setTextSize(1, 14.0f);
            this.subtitleView.setGravity(17);
            this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.subtitleView, LayoutHelper.createLinear(-1, -2, 1, 32, 8, 32, 0));
            TextViewSwitcher textViewSwitcher = new TextViewSwitcher(context);
            this.countryButton = textViewSwitcher;
            textViewSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda6
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    return LoginActivity.PhoneView.$r8$lambda$H3QknSvHpPSXjvO9NWPeRB8o_IM(context);
                }
            });
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
            loadAnimation.setInterpolator(Easings.easeInOutQuad);
            this.countryButton.setInAnimation(loadAnimation);
            ImageView imageView = new ImageView(context);
            this.chevronRight = imageView;
            imageView.setImageResource(R.drawable.msg_inputarrow);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.addView(this.countryButton, LayoutHelper.createLinear(0, -2, 1.0f, 0, 0, 0, 0));
            linearLayout.addView(this.chevronRight, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
            this.countryOutlineView = outlineTextContainerView;
            int i2 = R.string.Country;
            outlineTextContainerView.setText(LocaleController.getString(i2));
            this.countryOutlineView.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.countryOutlineView.setForceUseCenter(true);
            this.countryOutlineView.setFocusable(true);
            this.countryOutlineView.setContentDescription(LocaleController.getString(i2));
            this.countryOutlineView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda7
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    LoginActivity.PhoneView.this.countryOutlineView.animateSelection(r2 ? 1.0f : 0.0f);
                }
            });
            addView(this.countryOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 14.0f));
            this.countryOutlineView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.PhoneView.$r8$lambda$1a2SeS5o2eqzbnbYnMwL8j0LBWE(LoginActivity.PhoneView.this, view);
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.phoneOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
            OutlineTextContainerView outlineTextContainerView3 = this.phoneOutlineView;
            int i3 = R.string.PhoneNumber;
            outlineTextContainerView3.setText(LocaleController.getString(i3));
            addView(this.phoneOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 8.0f, 16.0f, 8.0f));
            TextView textView2 = new TextView(context);
            this.plusTextView = textView2;
            textView2.setText("+");
            this.plusTextView.setTextSize(1, 16.0f);
            this.plusTextView.setFocusable(false);
            linearLayout2.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2));
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = new AnimatedPhoneNumberEditText(context) { // from class: org.telegram.ui.LoginActivity.PhoneView.1
                @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
                protected void onFocusChanged(boolean z, int i4, Rect rect) {
                    super.onFocusChanged(z, i4, rect);
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
            this.codeField.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
            linearLayout2.addView(this.codeField, LayoutHelper.createLinear(55, 36, -9.0f, 0.0f, 0.0f, 0.0f));
            this.codeField.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.PhoneView.2
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
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
                        int i4 = 4;
                        if (stripExceptNumbers.length() > 4) {
                            while (true) {
                                if (i4 < 1) {
                                    str = null;
                                    z = false;
                                    break;
                                }
                                String substring = stripExceptNumbers.substring(0, i4);
                                List list = (List) PhoneView.this.codesMap.get(substring);
                                if (list == null) {
                                    country2 = null;
                                } else if (list.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                    country2 = (CountrySelectActivity.Country) list.get(list.size() - 1);
                                    if (string != null) {
                                        ArrayList arrayList = PhoneView.this.countriesArray;
                                        int size = arrayList.size();
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= size) {
                                                break;
                                            }
                                            Object obj = arrayList.get(i5);
                                            i5++;
                                            CountrySelectActivity.Country country3 = (CountrySelectActivity.Country) obj;
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
                                    String str2 = stripExceptNumbers.substring(i4) + PhoneView.this.phoneField.getText().toString();
                                    PhoneView.this.codeField.setText(substring);
                                    str = str2;
                                    stripExceptNumbers = substring;
                                    z = true;
                                    break;
                                }
                                i4--;
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
                        ArrayList arrayList2 = PhoneView.this.countriesArray;
                        int size2 = arrayList2.size();
                        CountrySelectActivity.Country country4 = null;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < size2) {
                            Object obj2 = arrayList2.get(i6);
                            i6++;
                            CountrySelectActivity.Country country5 = (CountrySelectActivity.Country) obj2;
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
                                ArrayList arrayList3 = PhoneView.this.countriesArray;
                                int size3 = arrayList3.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size3) {
                                        break;
                                    }
                                    Object obj3 = arrayList3.get(i9);
                                    i9++;
                                    CountrySelectActivity.Country country6 = (CountrySelectActivity.Country) obj3;
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
                public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                    return LoginActivity.PhoneView.$r8$lambda$a2Ar91Zm1mD8yVWIynV71Tl58Vk(LoginActivity.PhoneView.this, textView3, i4, keyEvent);
                }
            });
            this.codeDividerView = new View(context);
            LinearLayout.LayoutParams createLinear = LayoutHelper.createLinear(0, -1, 4.0f, 8.0f, 12.0f, 8.0f);
            createLinear.width = Math.max(2, AndroidUtilities.dp(0.5f));
            linearLayout2.addView(this.codeDividerView, createLinear);
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = new AnimatedPhoneNumberEditText(context) { // from class: org.telegram.ui.LoginActivity.PhoneView.3
                @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
                public boolean onKeyDown(int i4, KeyEvent keyEvent) {
                    if (i4 == 67 && PhoneView.this.phoneField.length() == 0) {
                        PhoneView.this.codeField.requestFocus();
                        PhoneView.this.codeField.setSelection(PhoneView.this.codeField.length());
                        PhoneView.this.codeField.dispatchKeyEvent(keyEvent);
                    }
                    return super.onKeyDown(i4, keyEvent);
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
                protected void onFocusChanged(boolean z, int i4, Rect rect) {
                    super.onFocusChanged(z, i4, rect);
                    PhoneView.this.phoneOutlineView.animateSelection((z || PhoneView.this.codeField.isFocused()) ? 1.0f : 0.0f);
                    if (z) {
                        LoginActivity.this.keyboardView.setEditText(this);
                        LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
                        if (PhoneView.this.countryState == 2) {
                            PhoneView.this.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
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
            this.phoneField.setContentDescription(LocaleController.getString(i3));
            linearLayout2.addView(this.phoneField, LayoutHelper.createFrame(-1, 36.0f));
            this.phoneField.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.PhoneView.4
                private int actionPosition;
                private int characterAction = -1;

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    if (i5 == 0 && i6 == 1) {
                        this.characterAction = 1;
                        return;
                    }
                    if (i5 == 1 && i6 == 0) {
                        if (charSequence.charAt(i4) == ' ' && i4 > 0) {
                            this.characterAction = 3;
                            this.actionPosition = i4 - 1;
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
                    int i4;
                    int i5;
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
                    int i6 = 0;
                    while (i6 < obj.length()) {
                        int i7 = i6 + 1;
                        String substring = obj.substring(i6, i7);
                        if ("0123456789".contains(substring)) {
                            sb.append(substring);
                        }
                        i6 = i7;
                    }
                    PhoneView.this.ignoreOnPhoneChange = true;
                    String hintText = PhoneView.this.phoneField.getHintText();
                    if (hintText != null) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= sb.length()) {
                                break;
                            }
                            if (i8 < hintText.length()) {
                                if (hintText.charAt(i8) == ' ') {
                                    sb.insert(i8, ' ');
                                    i8++;
                                    if (selectionStart == i8 && (i5 = this.characterAction) != 2 && i5 != 3) {
                                        selectionStart++;
                                    }
                                }
                                i8++;
                            } else {
                                sb.insert(i8, ' ');
                                if (selectionStart == i8 + 1 && (i4 = this.characterAction) != 2 && i4 != 3) {
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
                public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                    return LoginActivity.PhoneView.$r8$lambda$tx72ht9k6z3zQDkSrtznR0iGxW0(LoginActivity.PhoneView.this, textView3, i4, keyEvent);
                }
            });
            if (LoginActivity.this.newAccount && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(context, 2);
                this.syncContactsBox = checkBoxCell;
                checkBoxCell.setText(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", LoginActivity.this.syncContacts, false);
                addView(this.syncContactsBox, LayoutHelper.createLinear(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
                this.syncContactsBox.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginActivity.PhoneView.$r8$lambda$OFFLDFoWvHWTnl_xJtRux1hNYxs(LoginActivity.PhoneView.this, view);
                    }
                });
                i = 48;
            } else {
                i = 72;
            }
            final boolean z = BuildVars.DEBUG_VERSION || LoginActivity.this.getConnectionsManager().isTestBackend();
            if (z && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell2 = new CheckBoxCell(context, 2);
                this.testBackendCheckBox = checkBoxCell2;
                checkBoxCell2.setText(LocaleController.getString(R.string.DebugTestBackend), "", LoginActivity.this.testBackend = LoginActivity.this.getConnectionsManager().isTestBackend(), false);
                addView(this.testBackendCheckBox, LayoutHelper.createLinear(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
                i -= 24;
                this.testBackendCheckBox.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda12
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginActivity.PhoneView.$r8$lambda$__lZ-XJR2vt7-Ut6WNXld0Ef-Zw(LoginActivity.PhoneView.this, z, view);
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
                    LoginActivity.PhoneView.$r8$lambda$SqBjgeMo9rwxi-03jS4mIhx0cDk(LoginActivity.PhoneView.this, hashMap, tLObject, tL_error);
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

        public static /* synthetic */ void $r8$lambda$we9E3ag9GKHkPK9vDsYPMD_IVEY(PhoneView phoneView, Context context, View view) {
            Toast toast = phoneView.lastTitleToast;
            if (toast != null) {
                toast.cancel();
                phoneView.lastTitleToast = null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (phoneView.titleClickCount > 0 && currentTimeMillis - phoneView.lastTitleClick > 1500) {
                phoneView.titleClickCount = 0;
            }
            int i = phoneView.titleClickCount + 1;
            phoneView.titleClickCount = i;
            phoneView.lastTitleClick = currentTimeMillis;
            if (i >= 5) {
                phoneView.titleClickCount = 0;
                phoneView.lastTitleClick = 0L;
                phoneView.showDebugMenu();
            } else if (i > 1) {
                Toast makeText = Toast.makeText(context, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i, new Object[0]), 0);
                phoneView.lastTitleToast = makeText;
                makeText.show();
            }
        }

        public static /* synthetic */ View $r8$lambda$H3QknSvHpPSXjvO9NWPeRB8o_IM(Context context) {
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

        public static /* synthetic */ void $r8$lambda$1a2SeS5o2eqzbnbYnMwL8j0LBWE(final PhoneView phoneView, View view) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(true, phoneView.countriesArray);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda20
                @Override // org.telegram.ui.CountrySelectActivity.CountrySelectActivityDelegate
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    LoginActivity.PhoneView.$r8$lambda$z9qlHmpqfIylKA8yZiPeqU-7TuE(LoginActivity.PhoneView.this, country);
                }
            });
            LoginActivity.this.presentFragment(countrySelectActivity);
        }

        public static /* synthetic */ void $r8$lambda$z9qlHmpqfIylKA8yZiPeqU-7TuE(final PhoneView phoneView, CountrySelectActivity.Country country) {
            phoneView.selectCountry(country);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.showKeyboard(LoginActivity.PhoneView.this.phoneField);
                }
            }, 300L);
            phoneView.phoneField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = phoneView.phoneField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        }

        public static /* synthetic */ boolean $r8$lambda$a2Ar91Zm1mD8yVWIynV71Tl58Vk(PhoneView phoneView, TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                phoneView.getClass();
                return false;
            }
            phoneView.phoneField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = phoneView.phoneField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
            return true;
        }

        public static /* synthetic */ boolean $r8$lambda$tx72ht9k6z3zQDkSrtznR0iGxW0(PhoneView phoneView, TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                phoneView.getClass();
                return false;
            }
            if (LoginActivity.this.phoneNumberConfirmView != null) {
                LoginActivity.this.phoneNumberConfirmView.fabButton.callOnClick();
                return true;
            }
            phoneView.onNextPressed(null);
            return true;
        }

        public static /* synthetic */ void $r8$lambda$OFFLDFoWvHWTnl_xJtRux1hNYxs(PhoneView phoneView, View view) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity.this.syncContacts = !r0.syncContacts;
            ((CheckBoxCell) view).setChecked(LoginActivity.this.syncContacts, true);
            if (LoginActivity.this.syncContacts) {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.contacts_sync_on, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).show();
            } else {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.contacts_sync_off, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).show();
            }
        }

        public static /* synthetic */ void $r8$lambda$__lZ-XJR2vt7-Ut6WNXld0Ef-Zw(PhoneView phoneView, boolean z, View view) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity.this.testBackend = !r0.testBackend;
            ((CheckBoxCell) view).setChecked(LoginActivity.this.testBackend, true);
            if ((z && LoginActivity.this.getConnectionsManager().isTestBackend()) != LoginActivity.this.testBackend) {
                LoginActivity.this.getConnectionsManager().switchBackend(false);
            }
            phoneView.loadCountries();
        }

        public static /* synthetic */ void $r8$lambda$SqBjgeMo9rwxi-03jS4mIhx0cDk(final PhoneView phoneView, final HashMap hashMap, final TLObject tLObject, TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.$r8$lambda$Md1RDA8A7KItwr1-UNSDl31JbMk(LoginActivity.PhoneView.this, tLObject, hashMap);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$Md1RDA8A7KItwr1-UNSDl31JbMk(PhoneView phoneView, TLObject tLObject, HashMap hashMap) {
            phoneView.getClass();
            if (tLObject == null) {
                return;
            }
            TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject;
            if (phoneView.codeField.length() == 0) {
                phoneView.setCountry(hashMap, tL_nearestDc.country.toUpperCase());
            }
        }

        private void loadCountries() {
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            LoginActivity.this.getConnectionsManager().sendRequest(tL_help_getCountriesList, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda19
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.PhoneView.$r8$lambda$k-0240A9om3DIbVXK_fxAtnZKhE(LoginActivity.PhoneView.this, tLObject, tL_error);
                }
            }, 10);
        }

        public static /* synthetic */ void $r8$lambda$k-0240A9om3DIbVXK_fxAtnZKhE(final PhoneView phoneView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.$r8$lambda$XH3kLHOe4VpkBoi9Ynw-kLTG7uE(LoginActivity.PhoneView.this, tL_error, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$XH3kLHOe4VpkBoi9Ynw-kLTG7uE(PhoneView phoneView, TLRPC.TL_error tL_error, TLObject tLObject) {
            if (tL_error != null) {
                phoneView.getClass();
                return;
            }
            phoneView.countriesArray.clear();
            phoneView.codesMap.clear();
            phoneView.phoneFormatMap.clear();
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
                        phoneView.countriesArray.add(country);
                        List list = (List) phoneView.codesMap.get(tL_help_countryCode.country_code);
                        if (list == null) {
                            HashMap hashMap = phoneView.codesMap;
                            String str3 = tL_help_countryCode.country_code;
                            ArrayList arrayList = new ArrayList();
                            hashMap.put(str3, arrayList);
                            list = arrayList;
                        }
                        list.add(country);
                        if (tL_help_countryCode.patterns.size() > 0) {
                            phoneView.phoneFormatMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
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
                        List list2 = (List) phoneView.codesMap.get(substring);
                        CountrySelectActivity.Country country2 = null;
                        if (list2 != null) {
                            if (list2.size() > 1) {
                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                if (string != null) {
                                    CountrySelectActivity.Country country3 = (CountrySelectActivity.Country) list2.get(list2.size() - 1);
                                    ArrayList arrayList2 = phoneView.countriesArray;
                                    int size = arrayList2.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= size) {
                                            country2 = country3;
                                            break;
                                        }
                                        Object obj = arrayList2.get(i4);
                                        i4++;
                                        CountrySelectActivity.Country country4 = (CountrySelectActivity.Country) obj;
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
                            phoneView.codeField.setText(substring);
                            return;
                        }
                    }
                    phoneView.codeField.setText(stripExceptNumbers.substring(0, 1));
                }
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.subtitleView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
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
            Animation loadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.countryButton.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
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
        /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
        @Override // org.telegram.ui.Components.SlideView
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onNextPressed(final String str) {
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
                            LoginActivity.PhoneView.$r8$lambda$brZe1jOme6wExW45FVWT8XBeehk(LoginActivity.PhoneView.this, str);
                        }
                    };
                    AndroidUtilities.hideKeyboard(LoginActivity.this.fragmentView);
                    return;
                }
                LoginActivity loginActivity = LoginActivity.this;
                Context context = LoginActivity.this.fragmentView.getContext();
                LoginActivity loginActivity2 = LoginActivity.this;
                loginActivity.phoneNumberConfirmView = new PhoneNumberConfirmView(context, (ViewGroup) loginActivity2.fragmentView, loginActivity2.floatingButton, str2, new 6(str));
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
                                        builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                                        if (!z && (!z2 || !z3)) {
                                            builder.setMessage(LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog));
                                            i2 = R.raw.calls_log;
                                        } else if (!z2 || !z3) {
                                            builder.setMessage(LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog));
                                            i2 = R.raw.calls_log;
                                        } else {
                                            builder.setMessage(LocaleController.getString("AllowReadCall", R.string.AllowReadCall));
                                            i2 = R.raw.incoming_calls;
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
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                LoginActivity.this.needHideProgress(false);
                return;
            }
            if (i4 == 2 && !BuildVars.DEBUG_VERSION) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                LoginActivity.this.needHideProgress(false);
                return;
            }
            final String stripExceptNumbers = PhoneFormat.stripExceptNumbers("" + ((Object) this.codeField.getText()) + ((Object) this.phoneField.getText()));
            if (LoginActivity.this.activityMode == 0 && (LoginActivity.this.getParentActivity() instanceof LaunchActivity)) {
                for (final int i5 = 0; i5 < 4; i5++) {
                    UserConfig userConfig = UserConfig.getInstance(i5);
                    if (userConfig.isClientActivated() && PhoneNumberUtils.compare(stripExceptNumbers, userConfig.getCurrentUser().phone) && ConnectionsManager.getInstance(i5).isTestBackend() == LoginActivity.this.testBackend) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                        builder2.setTitle(LocaleController.getString(R.string.AppName));
                        builder2.setMessage(LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn));
                        builder2.setPositiveButton(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda3
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i6) {
                                LoginActivity.PhoneView.$r8$lambda$T6CYZLnp89wu4uS8rodpL4CE8ZE(LoginActivity.PhoneView.this, i5, alertDialog, i6);
                            }
                        });
                        builder2.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
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
                    LoginActivity.PhoneView.$r8$lambda$fXLD1vIsjyo85f2a8BM8C6ujJfs(LoginActivity.PhoneView.this, bundle, stripExceptNumbers, phoneInputData, tL_auth_sendCode3, tLObject, tL_error);
                }
            }, 27));
        }

        public static /* synthetic */ void $r8$lambda$brZe1jOme6wExW45FVWT8XBeehk(final PhoneView phoneView, final String str) {
            phoneView.getClass();
            phoneView.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.this.onNextPressed(str);
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
                                            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                                            if (!z3 && (!z4 || !z)) {
                                                builder.setMessage(LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog));
                                                i = R.raw.calls_log;
                                            } else if (!z4 || !z) {
                                                builder.setMessage(LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog));
                                                i = R.raw.calls_log;
                                            } else {
                                                builder.setMessage(LocaleController.getString("AllowReadCall", R.string.AllowReadCall));
                                                i = R.raw.incoming_calls;
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
                        LoginActivity.PhoneView.6.$r8$lambda$uKaYNa8eigZAzDp-_TfREBFnipg(LoginActivity.PhoneView.6.this, phoneNumberConfirmView, str);
                    }
                });
            }

            public static /* synthetic */ void $r8$lambda$uKaYNa8eigZAzDp-_TfREBFnipg(final 6 r1, final PhoneNumberConfirmView phoneNumberConfirmView, final String str) {
                r1.getClass();
                phoneNumberConfirmView.dismiss();
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$6$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.PhoneView.6.$r8$lambda$12dPGGDo54zrrbPFJnXrkz5HUPQ(LoginActivity.PhoneView.6.this, str, phoneNumberConfirmView);
                    }
                }, 150L);
            }

            public static /* synthetic */ void $r8$lambda$12dPGGDo54zrrbPFJnXrkz5HUPQ(6 r1, String str, PhoneNumberConfirmView phoneNumberConfirmView) {
                PhoneView.this.onNextPressed(str);
                LoginActivity.this.floatingButton.progressView.sync(phoneNumberConfirmView.fabButton.progressView);
            }
        }

        public static /* synthetic */ void $r8$lambda$T6CYZLnp89wu4uS8rodpL4CE8ZE(PhoneView phoneView, int i, AlertDialog alertDialog, int i2) {
            phoneView.getClass();
            if (UserConfig.selectedAccount != i) {
                ((LaunchActivity) LoginActivity.this.getParentActivity()).switchToAccount(i, true);
            }
            LoginActivity.this.finishFragment();
        }

        public static /* synthetic */ void $r8$lambda$fXLD1vIsjyo85f2a8BM8C6ujJfs(final PhoneView phoneView, final Bundle bundle, final String str, final PhoneInputData phoneInputData, final TLObject tLObject, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.$r8$lambda$rPHRyRT_n4mTPOLSE6PcF-7RSFA(LoginActivity.PhoneView.this, tL_error, tLObject2, bundle, str, phoneInputData, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$rPHRyRT_n4mTPOLSE6PcF-7RSFA(final PhoneView phoneView, TLRPC.TL_error tL_error, TLObject tLObject, Bundle bundle, final String str, PhoneInputData phoneInputData, TLObject tLObject2) {
            phoneView.nextPressed = false;
            if (tL_error == null) {
                if (!(tLObject instanceof TLRPC.TL_auth_sentCodeSuccess)) {
                    LoginActivity.this.fillNextCodeParams(bundle, (TLRPC.auth_SentCode) tLObject);
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
                        ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda27
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                LoginActivity.PhoneView.$r8$lambda$I_Q-XQJu7g-JAQrrBfl8XRsugsM(LoginActivity.PhoneView.this, str, tLObject3, tL_error2);
                            }
                        }, 10);
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.needShowInvalidAlert(LoginActivity.this, str, phoneInputData, false);
                    } else if (tL_error.text.contains("PHONE_PASSWORD_FLOOD")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else if (tL_error.text.contains("PHONE_NUMBER_FLOOD")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                    } else if (tL_error.text.contains("PHONE_NUMBER_BANNED")) {
                        LoginActivity.needShowInvalidAlert(LoginActivity.this, str, phoneInputData, true);
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        phoneView.onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
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

        public static /* synthetic */ void $r8$lambda$I_Q-XQJu7g-JAQrrBfl8XRsugsM(final PhoneView phoneView, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.$r8$lambda$JCmxSg72RYUWId2ahURfmueLQLM(LoginActivity.PhoneView.this, tL_error, tLObject, str);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$JCmxSg72RYUWId2ahURfmueLQLM(PhoneView phoneView, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            phoneView.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", str);
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:6:0x0012, B:8:0x0022, B:10:0x0028, B:15:0x003d, B:18:0x0050, B:22:0x005c, B:24:0x0067, B:27:0x0074, B:28:0x007d, B:30:0x0089, B:32:0x00a1, B:35:0x00a7, B:38:0x00ad, B:42:0x00bb, B:44:0x00d4, B:47:0x00de, B:53:0x013c, B:55:0x014d, B:51:0x0147, B:56:0x00ee, B:58:0x00f4, B:60:0x011a, B:62:0x0123, B:68:0x0134, B:72:0x015c, B:73:0x016f, B:75:0x0179, B:77:0x01aa), top: B:5:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:6:0x0012, B:8:0x0022, B:10:0x0028, B:15:0x003d, B:18:0x0050, B:22:0x005c, B:24:0x0067, B:27:0x0074, B:28:0x007d, B:30:0x0089, B:32:0x00a1, B:35:0x00a7, B:38:0x00ad, B:42:0x00bb, B:44:0x00d4, B:47:0x00de, B:53:0x013c, B:55:0x014d, B:51:0x0147, B:56:0x00ee, B:58:0x00f4, B:60:0x011a, B:62:0x0123, B:68:0x0134, B:72:0x015c, B:73:0x016f, B:75:0x0179, B:77:0x01aa), top: B:5:0x0012 }] */
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
                                                LoginActivity.PhoneView.$r8$lambda$uXEmcVKGsdlN3ltlc_gXBB8gZWg(LoginActivity.PhoneView.this, arrayList);
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
                                            ArrayList arrayList2 = this.countriesArray;
                                            int size = arrayList2.size();
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 >= size) {
                                                    break;
                                                }
                                                Object obj = arrayList2.get(i3);
                                                i3++;
                                                CountrySelectActivity.Country country2 = (CountrySelectActivity.Country) obj;
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

        public static /* synthetic */ void $r8$lambda$uXEmcVKGsdlN3ltlc_gXBB8gZWg(PhoneView phoneView, List list) {
            boolean shouldShowRequestPermissionRationale;
            phoneView.getClass();
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
            builder.setTopAnimation(R.raw.incoming_calls, 46, false, Theme.getColor(Theme.key_dialogTopBackground));
            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
            builder.setMessage(LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber));
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
                    LoginActivity.PhoneView.$r8$lambda$o-skZSkeOzXb-aTP--iJnzRwTRg(LoginActivity.PhoneView.this);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static /* synthetic */ void $r8$lambda$o-skZSkeOzXb-aTP--iJnzRwTRg(PhoneView phoneView) {
            if (phoneView.phoneField != null) {
                if (LoginActivity.this.needRequestPermissions) {
                    phoneView.codeField.clearFocus();
                    phoneView.phoneField.clearFocus();
                } else if (phoneView.codeField.length() != 0) {
                    phoneView.phoneField.requestFocus();
                    if (!phoneView.numberFilled) {
                        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = phoneView.phoneField;
                        animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
                    }
                    LoginActivity.this.showKeyboard(phoneView.phoneField);
                } else {
                    phoneView.codeField.requestFocus();
                    LoginActivity.this.showKeyboard(phoneView.codeField);
                }
            }
            if (LoginActivity.this.activityMode == 0) {
                phoneView.requestPasskey(false);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onDestroyActivity() {
            super.onDestroyActivity();
            Runnable runnable = this.cancelRequestingPasskey;
            if (runnable != null) {
                runnable.run();
                this.cancelRequestingPasskey = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestPasskey(boolean z) {
            if (LoginActivity.this.activityMode == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.requestingPasskey) {
                if (z || !this.requestedPasskey) {
                    this.requestingPasskey = true;
                    this.requestedPasskey = true;
                    this.cancelRequestingPasskey = PasskeysController.login(getContext(), ((BaseFragment) LoginActivity.this).currentAccount, z, new Utilities.Callback3() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda18
                        @Override // org.telegram.messenger.Utilities.Callback3
                        public final void run(Object obj, Object obj2, Object obj3) {
                            LoginActivity.PhoneView.$r8$lambda$oIkEb0rQvIZM4efXOsv9kIPHyUo(LoginActivity.PhoneView.this, (Long) obj, (TLRPC.auth_Authorization) obj2, (String) obj3);
                        }
                    });
                }
            }
        }

        public static /* synthetic */ void $r8$lambda$oIkEb0rQvIZM4efXOsv9kIPHyUo(final PhoneView phoneView, Long l, TLRPC.auth_Authorization auth_authorization, String str) {
            phoneView.cancelRequestingPasskey = null;
            phoneView.requestingPasskey = false;
            if (str != null && ("EMPTY".equals(str) || "CANCELLED".equals(str))) {
                if (phoneView.subtitleView == null || !"CANCELLED".equals(str)) {
                    return;
                }
                phoneView.subtitleView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StartTextPasskey), new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda23
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.PhoneView.this.requestPasskey(true);
                    }
                }), true));
                return;
            }
            if (l.longValue() != 0 && (LoginActivity.this.getParentActivity() instanceof LaunchActivity)) {
                for (int i = 0; i < 4; i++) {
                    UserConfig userConfig = UserConfig.getInstance(i);
                    if (userConfig.isClientActivated() && userConfig.getClientUserId() == l.longValue() && ConnectionsManager.getInstance(i).isTestBackend() == LoginActivity.this.testBackend) {
                        if (UserConfig.selectedAccount != i) {
                            ((LaunchActivity) LoginActivity.this.getParentActivity()).switchToAccount(i, true);
                        }
                        LoginActivity.this.finishFragment();
                        LoginActivity.this.needHideProgress(false);
                        return;
                    }
                }
            }
            if (str != null && str.contains("SESSION_PASSWORD_NEEDED")) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda24
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.PhoneView.$r8$lambda$PucrEHfbDJHHVHB4Bl0OCZns1Ow(LoginActivity.PhoneView.this, tLObject, tL_error);
                    }
                }, 10);
            } else if (str != null) {
                if (BuildVars.DEBUG_VERSION) {
                    BulletinFactory.of(LoginActivity.this).showForError(str);
                    return;
                }
                return;
            }
            if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) auth_authorization);
            }
        }

        public static /* synthetic */ void $r8$lambda$PucrEHfbDJHHVHB4Bl0OCZns1Ow(final PhoneView phoneView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$PhoneView$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.PhoneView.$r8$lambda$zqNnbg21ig_CbrJjRmRti1QNCz0(LoginActivity.PhoneView.this, tL_error, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$zqNnbg21ig_CbrJjRmRti1QNCz0(PhoneView phoneView, TLRPC.TL_error tL_error, TLObject tLObject) {
            phoneView.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("YourPhone", R.string.YourPhone);
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

        public static /* synthetic */ void $r8$lambda$gKyVJVXs5FXqCJwgMxzY5MPqX6U(TLObject tLObject, TLRPC.TL_error tL_error) {
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

        public static /* synthetic */ void $r8$lambda$OFCJ62txobci_RPmBKO18gKHdJY(LoginActivitySmsView loginActivitySmsView) {
            int i = 0;
            loginActivitySmsView.postedErrorColorTimeout = false;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivitySmsView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
            if (loginActivitySmsView.errorViewSwitcher.getCurrentView() != (loginActivitySmsView.currentType == 15 ? loginActivitySmsView.openFragmentButton : loginActivitySmsView.problemFrame)) {
                loginActivitySmsView.errorViewSwitcher.showNext();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x03cc  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x03ee  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x04bd  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0638  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0685  */
        /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0667  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0525  */
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
                    LoginActivity.LoginActivitySmsView.$r8$lambda$OFCJ62txobci_RPmBKO18gKHdJY(LoginActivity.LoginActivitySmsView.this);
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
            String string = LoginActivity.this.activityMode != 1 ? null : LocaleController.getString(R.string.CancelAccountReset);
            int i2 = this.currentType;
            if (i2 == 11) {
                this.titleTextView.setText(string == null ? LocaleController.getString(R.string.MissedCallDescriptionTitle) : string);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.missedCallArrowIcon = new ImageView(context);
                this.missedCallPhoneIcon = new ImageView(context);
                frameLayout2.addView(this.missedCallArrowIcon);
                frameLayout2.addView(this.missedCallPhoneIcon);
                this.missedCallArrowIcon.setImageResource(R.drawable.login_arrow1);
                this.missedCallPhoneIcon.setImageResource(R.drawable.login_phone1);
                addView(frameLayout2, LayoutHelper.createLinear(64, 64, 1, 0, 16, 0, 0));
                addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 8, 0, 0));
                TextView textView3 = new TextView(context);
                this.missedCallDescriptionSubtitle = textView3;
                textView3.setTextSize(1, 14.0f);
                this.missedCallDescriptionSubtitle.setGravity(1);
                this.missedCallDescriptionSubtitle.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.missedCallDescriptionSubtitle.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MissedCallDescriptionSubtitle)));
                addView(this.missedCallDescriptionSubtitle, LayoutHelper.createLinear(-1, -2, 49, 36, 16, 36, 0));
                this.codeFieldContainer = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.1
                    @Override // org.telegram.ui.CodeFieldContainer
                    protected void processNextPressed() {
                        LoginActivitySmsView.this.onNextPressed(null);
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
                this.missedCallDescriptionSubtitle2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MissedCallDescriptionSubtitle2)));
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
                    int i3 = R.raw.phone_flash_call;
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, String.valueOf(i3), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                    this.hintDrawable = rLottieDrawable;
                    this.blueImageView.setAnimation(rLottieDrawable);
                    frameLayout4.addView(this.blueImageView, LayoutHelper.createFrame(64, 64.0f));
                    this.titleTextView.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                    linearLayout2.addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 0));
                    linearLayout2.addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
                    frameLayout = frameLayout3;
                    if (this.currentType != 11) {
                        CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivitySmsView.2
                            @Override // org.telegram.ui.CodeFieldContainer
                            protected void processNextPressed() {
                                LoginActivitySmsView.this.onNextPressed(null);
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
                            LoginActivity.LoginActivitySmsView.this.onBackPressed(true);
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
                            if (getVisibility() == 0) {
                                return LoginActivitySmsView.this.time <= 0 || LoginActivitySmsView.this.timeTimer == null;
                            }
                            return false;
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
                            LoginActivity.LoginActivitySmsView.$r8$lambda$YY_A19CbMQly1broy1Vhir2WCA4(LoginActivity.LoginActivitySmsView.this, view);
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
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                        Interpolator interpolator = Easings.easeInOutQuad;
                        loadAnimation.setInterpolator(interpolator);
                        this.errorViewSwitcher.setInAnimation(loadAnimation);
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
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
                                if (isClickable() && getVisibility() == 0 && !LoginActivitySmsView.this.nextPressed) {
                                    return (LoginActivitySmsView.this.timeText == null || LoginActivitySmsView.this.timeText.getVisibility() == 8) && !LoginActivitySmsView.this.isResendingCode;
                                }
                                return false;
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
                        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                        loadAnimation3.setInterpolator(cubicBezierInterpolator);
                        this.errorViewSwitcher.setInAnimation(loadAnimation3);
                        Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
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
                                LoginActivity.LoginActivitySmsView.$r8$lambda$PLrx4prHddFU43NFApm9985Vpcc(LoginActivity.LoginActivitySmsView.this, view);
                            }
                        });
                        this.errorViewSwitcher.addView(this.openFragmentButton, LayoutHelper.createFrame(-1, 52.0f));
                        RLottieImageView rLottieImageView = new RLottieImageView(context);
                        this.openFragmentImageView = rLottieImageView;
                        rLottieImageView.setAnimation(R.raw.fragment, 36, 36);
                        this.openFragmentButton.addView(this.openFragmentImageView, LayoutHelper.createLinear(36, 36, 16, 0, 0, 2, 0));
                        TextView textView6 = new TextView(context);
                        this.openFragmentButtonText = textView6;
                        textView6.setText(LocaleController.getString(R.string.OpenFragment));
                        this.openFragmentButtonText.setTextColor(-1);
                        this.openFragmentButtonText.setTextSize(1, 15.0f);
                        this.openFragmentButtonText.setGravity(17);
                        this.openFragmentButtonText.setTypeface(AndroidUtilities.bold());
                        this.openFragmentButton.addView(this.openFragmentButtonText);
                    }
                    TextView textView7 = new TextView(context);
                    this.wrongCode = textView7;
                    textView7.setText(LocaleController.getString(R.string.WrongCode));
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
                                LoginActivity.LoginActivitySmsView.$r8$lambda$7ZoMlW9TVedLaXI4g3lXFPF8wag(LoginActivity.LoginActivitySmsView.this, context, view);
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
                    int i7 = R.raw.code_laptop;
                    float f = i6;
                    this.hintDrawable = new RLottieDrawable(i7, String.valueOf(i7), AndroidUtilities.dp(f), AndroidUtilities.dp(f), true, null);
                } else {
                    int i8 = R.raw.sms_incoming_info;
                    float f2 = i6;
                    this.hintDrawable = new RLottieDrawable(i8, String.valueOf(i8), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                    int i9 = R.raw.phone_stars_to_dots;
                    this.starsToDotsDrawable = new RLottieDrawable(i9, String.valueOf(i9), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                    int i10 = R.raw.phone_dots;
                    this.dotsDrawable = new RLottieDrawable(i10, String.valueOf(i10), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                    int i11 = R.raw.phone_dots_to_stars;
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
                    string = LocaleController.getString(this.currentType == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
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
                    LoginActivity.LoginActivitySmsView.this.onBackPressed(true);
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
                    if (getVisibility() == 0) {
                        return LoginActivitySmsView.this.time <= 0 || LoginActivitySmsView.this.timeTimer == null;
                    }
                    return false;
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
                    LoginActivity.LoginActivitySmsView.$r8$lambda$YY_A19CbMQly1broy1Vhir2WCA4(LoginActivity.LoginActivitySmsView.this, view);
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
            textView72.setText(LocaleController.getString(R.string.WrongCode));
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

        public static /* synthetic */ void $r8$lambda$YY_A19CbMQly1broy1Vhir2WCA4(final LoginActivitySmsView loginActivitySmsView, View view) {
            if (loginActivitySmsView.time <= 0 || loginActivitySmsView.timeTimer == null) {
                loginActivitySmsView.isResendingCode = true;
                loginActivitySmsView.timeText.invalidate();
                loginActivitySmsView.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                int i = loginActivitySmsView.nextType;
                if (i != 4 && i != 2 && i != 17 && i != 16 && i != 11 && i != 15) {
                    if (i == 3) {
                        AndroidUtilities.setWaitingForSms(false);
                        NotificationCenter.getGlobalInstance().removeObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                        loginActivitySmsView.waitingForEvent = false;
                        loginActivitySmsView.destroyCodeTimer();
                        loginActivitySmsView.isResendingCode = false;
                        loginActivitySmsView.resendCode();
                        return;
                    }
                    return;
                }
                if (i == 4 || i == 11) {
                    loginActivitySmsView.timeText.setText(LocaleController.getString(R.string.Calling));
                } else {
                    loginActivitySmsView.timeText.setText(LocaleController.getString(R.string.SendingSms));
                }
                final Bundle bundle = new Bundle();
                bundle.putString("phone", loginActivitySmsView.phone);
                bundle.putString("ephone", loginActivitySmsView.emailPhone);
                bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                bundle.putInt("prevType", loginActivitySmsView.currentType);
                loginActivitySmsView.createCodeTimer();
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = loginActivitySmsView.requestPhone;
                tL_auth_resendCode.phone_code_hash = loginActivitySmsView.phoneHash;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda25
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$g0qM-geJ3UOfHAqn0fue6qPp8b4(LoginActivity.LoginActivitySmsView.this, bundle, tLObject, tL_error);
                    }
                }, 10);
            }
        }

        public static /* synthetic */ void $r8$lambda$g0qM-geJ3UOfHAqn0fue6qPp8b4(final LoginActivitySmsView loginActivitySmsView, final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            if (tLObject != null) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda31
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$zTDVnU3-r3dMzF_actJIFLwErqM(LoginActivity.LoginActivitySmsView.this, bundle, tLObject);
                    }
                });
            } else {
                if (tL_error == null || tL_error.text == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda32
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$9rRQOUgnpYpD237N91mITVLI5Vw(LoginActivity.LoginActivitySmsView.this, tL_error);
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$zTDVnU3-r3dMzF_actJIFLwErqM(LoginActivitySmsView loginActivitySmsView, Bundle bundle, TLObject tLObject) {
            loginActivitySmsView.nextCodeParams = bundle;
            TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
            loginActivitySmsView.nextCodeAuth = tL_auth_sentCode;
            TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
            if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                loginActivitySmsView.nextType = 17;
            } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                loginActivitySmsView.nextType = 16;
            }
            LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
        }

        public static /* synthetic */ void $r8$lambda$9rRQOUgnpYpD237N91mITVLI5Vw(LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            loginActivitySmsView.lastError = tL_error.text;
        }

        public static /* synthetic */ void $r8$lambda$PLrx4prHddFU43NFApm9985Vpcc(LoginActivitySmsView loginActivitySmsView, View view) {
            loginActivitySmsView.getClass();
            try {
                loginActivitySmsView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(loginActivitySmsView.url)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static /* synthetic */ void $r8$lambda$7ZoMlW9TVedLaXI4g3lXFPF8wag(final LoginActivitySmsView loginActivitySmsView, final Context context, View view) {
            TLRPC.TL_auth_sentCode tL_auth_sentCode;
            Bundle bundle = loginActivitySmsView.nextCodeParams;
            if (bundle != null && (tL_auth_sentCode = loginActivitySmsView.nextCodeAuth) != null) {
                LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
                return;
            }
            if (loginActivitySmsView.nextPressed) {
                return;
            }
            LoadingTextView loadingTextView = loginActivitySmsView.timeText;
            if ((loadingTextView == null || loadingTextView.getVisibility() == 8) && !loginActivitySmsView.isResendingCode) {
                if (loginActivitySmsView.nextType != 0) {
                    if (LoginActivity.this.radialProgressView.getTag() != null) {
                        return;
                    }
                    loginActivitySmsView.resendCode();
                    return;
                }
                TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                tL_auth_reportMissingCode.phone_number = loginActivitySmsView.requestPhone;
                tL_auth_reportMissingCode.phone_code_hash = loginActivitySmsView.phoneHash;
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
                new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, loginActivitySmsView.phone))).setNeutralButton(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$7KaHB4zRU_Z7aRtrdv5j9LeSWvg(LoginActivity.LoginActivitySmsView.this, context, alertDialog, i);
                    }
                }).setPositiveButton(LocaleController.getString(R.string.Close), null).setNegativeButton(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda24
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.this.setPage(0, true, null, true);
                    }
                }).show();
            }
        }

        public static /* synthetic */ void $r8$lambda$7KaHB4zRU_Z7aRtrdv5j9LeSWvg(LoginActivitySmsView loginActivitySmsView, Context context, AlertDialog alertDialog, int i) {
            Object systemService;
            Object systemService2;
            SignalStrength signalStrength;
            int level;
            SubscriptionManager from;
            String number;
            int simSlotIndex;
            int mcc;
            int mnc;
            CharSequence carrierName;
            loginActivitySmsView.getClass();
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                String format = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                StringBuilder sb = new StringBuilder();
                sb.append(loginActivitySmsView.emailPhone);
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
                sb2.append(loginActivitySmsView.requestPhone);
                sb2.append("\n");
                sb2.append("\n");
                try {
                    if (i2 >= 22) {
                        from = SubscriptionManager.from(loginActivitySmsView.getContext());
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
                String str = (i3 == 1 || i3 == 2) ? "store" : ApplicationLoader.isStandaloneBuild() ? "direct" : ApplicationLoader.isBetaBuild() ? "beta" : ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
                sb2.append("App version: ");
                sb2.append(format);
                sb2.append(" ");
                sb2.append(str);
                sb2.append("\n");
                sb2.append("\n");
                sb2.append("Issue: ");
                sb2.append(LoginActivity.this.paid ? "no_otp" : "no_otp_paid");
                sb2.append("\n");
                if (!TextUtils.isEmpty(loginActivitySmsView.lastError)) {
                    sb2.append("Error: ");
                    sb2.append(loginActivitySmsView.lastError);
                    sb2.append("\n");
                }
                sb2.append("\n\n================================================\n");
                sb2.append("WRITE YOUR COMMENT HERE:\n");
                sb2.append("\n");
                sb2.append("\n");
                intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                loginActivitySmsView.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
            } catch (Exception unused) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
            }
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
                rLottieDrawable.setLayerColor("Bubble", Theme.getColor(Theme.key_chats_actionBackground));
                int i = Theme.key_windowBackgroundWhiteBlackText;
                rLottieDrawable.setLayerColor("Phone", Theme.getColor(i));
                rLottieDrawable.setLayerColor("Note", Theme.getColor(i));
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
                    LoginActivity.LoginActivitySmsView.$r8$lambda$9s858Dym6RQwsnm1hQnxlFQJ4gk(LoginActivity.LoginActivitySmsView.this, bundle, tLObject, tL_error);
                }
            }, 10));
        }

        public static /* synthetic */ void $r8$lambda$9s858Dym6RQwsnm1hQnxlFQJ4gk(final LoginActivitySmsView loginActivitySmsView, final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda40
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$MhPtbTePJVhI5lIZG3o0b7qJuyQ(LoginActivity.LoginActivitySmsView.this, tL_error, bundle, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$MhPtbTePJVhI5lIZG3o0b7qJuyQ(LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
            loginActivitySmsView.nextPressed = false;
            if (tL_error == null) {
                loginActivitySmsView.nextCodeParams = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                loginActivitySmsView.nextCodeAuth = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    loginActivitySmsView.nextType = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    loginActivitySmsView.nextType = 16;
                }
                LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
            } else {
                String str = tL_error.text;
                if (str != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        loginActivitySmsView.onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                }
            }
            loginActivitySmsView.tryHideProgress(false);
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
            tryShowProgress(i, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tryShowProgress(final int i, final boolean z) {
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
                        LoginActivity.LoginActivitySmsView.$r8$lambda$QvFcGAtw6xZjEc5v8hp9GJP5URI(LoginActivity.LoginActivitySmsView.this, i, z);
                    }
                });
                return;
            }
            this.starsToDotsDrawable.setOnAnimationEndListener(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$mNHl9TTseTAyhleGH7oqpsDOlM8(LoginActivity.LoginActivitySmsView.this);
                }
            });
            this.blueImageView.setAutoRepeat(false);
            this.starsToDotsDrawable.setCurrentFrame(0, false);
            this.blueImageView.setAnimation(this.starsToDotsDrawable);
            this.blueImageView.playAnimation();
        }

        public static /* synthetic */ void $r8$lambda$QvFcGAtw6xZjEc5v8hp9GJP5URI(final LoginActivitySmsView loginActivitySmsView, final int i, final boolean z) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.this.tryShowProgress(i, z);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$mNHl9TTseTAyhleGH7oqpsDOlM8(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$6BPjU0k5MUxe9Ke2efwIs3MWlc8(LoginActivity.LoginActivitySmsView.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$6BPjU0k5MUxe9Ke2efwIs3MWlc8(LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.blueImageView.setAutoRepeat(true);
            loginActivitySmsView.dotsDrawable.setCurrentFrame(0, false);
            loginActivitySmsView.dotsDrawable.setAutoRepeat(1);
            loginActivitySmsView.blueImageView.setAnimation(loginActivitySmsView.dotsDrawable);
            loginActivitySmsView.blueImageView.playAnimation();
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
                        LoginActivity.LoginActivitySmsView.$r8$lambda$5uVAeYIco1KWdytuEGpFpJt2k3s(LoginActivity.LoginActivitySmsView.this);
                    }
                }, this.dotsDrawable.getFramesCount() - 1);
            }
        }

        public static /* synthetic */ void $r8$lambda$5uVAeYIco1KWdytuEGpFpJt2k3s(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda38
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$nM9uVh2kVO1NN34Z54rIgWZJemY(LoginActivity.LoginActivitySmsView.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$nM9uVh2kVO1NN34Z54rIgWZJemY(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.dotsToStarsDrawable.setOnAnimationEndListener(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda47
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$yz6-98qafBBTSrgKN61gSKN3UO0(LoginActivity.LoginActivitySmsView.this);
                }
            });
            loginActivitySmsView.blueImageView.setAutoRepeat(false);
            loginActivitySmsView.dotsToStarsDrawable.setCurrentFrame(0, false);
            loginActivitySmsView.blueImageView.setAnimation(loginActivitySmsView.dotsToStarsDrawable);
            loginActivitySmsView.blueImageView.playAnimation();
        }

        public static /* synthetic */ void $r8$lambda$yz6-98qafBBTSrgKN61gSKN3UO0(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda50
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$UdfHSOFaxh7eo1-uNjq502FpY7w(LoginActivity.LoginActivitySmsView.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$UdfHSOFaxh7eo1-uNjq502FpY7w(LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.blueImageView.setAutoRepeat(false);
            loginActivitySmsView.blueImageView.setAnimation(loginActivitySmsView.hintDrawable);
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            int i = this.currentType;
            if (i == 3 || i == 11) {
                return this.phone;
            }
            return LocaleController.getString("YourCode", R.string.YourCode);
        }

        public static /* synthetic */ void $r8$lambda$Q4MeovcEViVloqaB8jqSemLcqRI(LoginActivitySmsView loginActivitySmsView, View view, boolean z) {
            if (!z) {
                loginActivitySmsView.getClass();
            } else {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:142:0x03cf, code lost:
        
            if (r12 != 3) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x049d, code lost:
        
            if (r6 == 16) goto L188;
         */
        /* JADX WARN: Removed duplicated region for block: B:226:0x047d  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0488  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0577  */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        @Override // org.telegram.ui.Components.SlideView
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void setParams(Bundle bundle, boolean z) {
            char c;
            String str;
            char c2;
            int i;
            int i2;
            String str2;
            String string;
            int i3;
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
                    int i4 = this.nextType;
                    if (i4 == 17) {
                        i3 = R.string.ReturnEnteringPhrase;
                    } else if (i4 == 16) {
                        i3 = R.string.ReturnEnteringWord;
                    } else {
                        i3 = R.string.ReturnEnteringSMS;
                    }
                    this.problemText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i3), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            }
            this.waitingForEvent = true;
            int i5 = this.currentType;
            if (i5 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 3) {
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
                    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
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
                        LoginActivity.LoginActivitySmsView.$r8$lambda$Q4MeovcEViVloqaB8jqSemLcqRI(LoginActivity.LoginActivitySmsView.this, view, z2);
                    }
                });
            }
            int i6 = this.prevType;
            if (i6 == 17) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i6 == 16) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else {
                this.prevTypeTextView.setVisibility(8);
            }
            if (this.phone == null) {
                return;
            }
            String format = PhoneFormat.getInstance().format(this.phone);
            if (LoginActivity.this.isInCancelAccountDeletionMode()) {
                c = 0;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, PhoneFormat.getInstance().format("+" + format))));
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
                c = 0;
                int i7 = this.currentType;
                str = i7 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentAppCodeWithPhone", R.string.SentAppCodeWithPhone, LocaleController.addNbsp(format))) : i7 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(format))) : i7 == 3 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(format))) : i7 == 4 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(format))) : i7 == 15 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentFragmentCode", R.string.SentFragmentCode, LocaleController.addNbsp(format))) : "";
            }
            this.confirmTextView.setText(str);
            int i8 = this.currentType;
            if (i8 != 15) {
                if (i8 == 1) {
                    int i9 = this.nextType;
                    if (i9 == 3 || i9 == 4 || i9 == 11) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                    } else if (i9 == 15) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i9 == 0) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                    } else {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
                    }
                } else {
                    this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                }
            }
            if (this.currentType != 3) {
                LoginActivity.this.showKeyboard(this.codeFieldContainer.codeField[c]);
                this.codeFieldContainer.codeField[c].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.codeFieldContainer.codeField[c]);
            }
            destroyTimer();
            destroyCodeTimer();
            this.lastCurrentTime = System.currentTimeMillis();
            int i10 = this.currentType;
            if (i10 == 1) {
                setProblemTextVisible(true);
                this.timeText.setVisibility(8);
                LoadingTextView loadingTextView2 = this.problemText;
                if (loadingTextView2 != null) {
                    loadingTextView2.setVisibility(0);
                }
            } else if (i10 == 3) {
                int i11 = this.nextType;
                if (i11 == 4 || i11 == 2 || i11 == 17 || i11 == 16 || i11 == 11) {
                    setProblemTextVisible(false);
                    this.timeText.setVisibility(0);
                    this.problemText.setVisibility(8);
                    int i12 = this.nextType;
                    if (i12 == 4 || i12 == 11) {
                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                    } else if (i12 == 2 || i12 == 17 || i12 == 16) {
                        this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                    }
                } else {
                    this.timeText.setVisibility(8);
                }
                String obtainLoginPhoneCall = z ? AndroidUtilities.obtainLoginPhoneCall(this.pattern) : null;
                if (obtainLoginPhoneCall != null) {
                    onNextPressed(obtainLoginPhoneCall);
                } else {
                    String str3 = this.catchedPhone;
                    if (str3 != null) {
                        onNextPressed(str3);
                    } else {
                        int i13 = this.nextType;
                        if (i13 == 4 || i13 == 2 || i13 == 17 || i13 == 16 || i13 == 11) {
                            createTimer();
                        }
                    }
                }
            } else {
                if (i10 == 2) {
                    int i14 = this.nextType;
                    if (i14 != 2) {
                        i2 = 17;
                        c2 = 1;
                        i = 16;
                        if (i14 != 17) {
                            if (i14 != 16) {
                                if (i14 != 4) {
                                }
                            }
                        }
                    } else {
                        i = 16;
                        i2 = 17;
                        c2 = 1;
                    }
                    if (i14 == 2 || i14 == i2 || i14 == i) {
                        LoadingTextView loadingTextView3 = this.timeText;
                        int i15 = R.string.SmsAvailableIn;
                        Object[] objArr = new Object[2];
                        objArr[0] = 1;
                        objArr[c2] = 0;
                        loadingTextView3.setText(LocaleController.formatString("SmsAvailableIn", i15, objArr));
                    } else {
                        LoadingTextView loadingTextView4 = this.timeText;
                        int i16 = R.string.CallAvailableIn;
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = 2;
                        objArr2[c2] = 0;
                        loadingTextView4.setText(LocaleController.formatString("CallAvailableIn", i16, objArr2));
                    }
                    setProblemTextVisible(this.time < 1000);
                    this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                    LoadingTextView loadingTextView5 = this.problemText;
                    if (loadingTextView5 != null) {
                        loadingTextView5.setVisibility(this.time < 1000 ? 0 : 8);
                    }
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                    String string2 = sharedPreferences.getString("sms_hash", null);
                    if (!TextUtils.isEmpty(string2) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                        if (string.contains(string2 + "|") && !LoginActivity.this.newAccount) {
                            str2 = string.substring(string.indexOf(124) + 1);
                            if (str2 == null) {
                                this.codeFieldContainer.setCode(str2);
                                onNextPressed(null);
                            } else {
                                createTimer();
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
                                return;
                            }
                            return;
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                    if (this.currentType == 11) {
                    }
                } else {
                    c2 = 1;
                }
                if (i10 == 4) {
                    int i19 = this.nextType;
                    int i20 = (i19 == 2 || i19 == 17 || i19 == 11) ? 16 : 16;
                    if (i19 == 2 || i19 == 17 || i19 == i20) {
                        LoadingTextView loadingTextView6 = this.timeText;
                        int i21 = R.string.SmsAvailableIn;
                        Object[] objArr3 = new Object[2];
                        objArr3[0] = 1;
                        objArr3[c2] = 0;
                        loadingTextView6.setText(LocaleController.formatString("SmsAvailableIn", i21, objArr3));
                    } else {
                        LoadingTextView loadingTextView7 = this.timeText;
                        int i22 = R.string.CallAvailableIn;
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = 2;
                        objArr4[c2] = 0;
                        loadingTextView7.setText(LocaleController.formatString("CallAvailableIn", i22, objArr4));
                    }
                    setProblemTextVisible(this.time < 1000);
                    this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                    LoadingTextView loadingTextView8 = this.problemText;
                    if (loadingTextView8 != null) {
                        loadingTextView8.setVisibility(this.time < 1000 ? 0 : 8);
                    }
                    createTimer();
                    if (this.currentType == 11) {
                    }
                }
                if (i10 == 11) {
                    int i23 = this.nextType;
                    if (i23 == 4 || i23 == 2 || i23 == 17 || i23 == 16 || i23 == 11) {
                        setProblemTextVisible(false);
                        this.timeText.setVisibility(0);
                        this.problemText.setVisibility(8);
                        int i24 = this.nextType;
                        if (i24 == 4 || i24 == 11) {
                            LoadingTextView loadingTextView9 = this.timeText;
                            int i25 = R.string.CallAvailableIn;
                            Object[] objArr5 = new Object[2];
                            objArr5[0] = 1;
                            objArr5[c2] = 0;
                            loadingTextView9.setText(LocaleController.formatString("CallAvailableIn", i25, objArr5));
                        } else if (i24 == 2 || i24 == 17 || i24 == 16) {
                            LoadingTextView loadingTextView10 = this.timeText;
                            int i26 = R.string.SmsAvailableIn;
                            Object[] objArr6 = new Object[2];
                            objArr6[0] = 1;
                            objArr6[c2] = 0;
                            loadingTextView10.setText(LocaleController.formatString("SmsAvailableIn", i26, objArr6));
                        }
                        createTimer();
                    }
                } else {
                    this.timeText.setVisibility(8);
                    LoadingTextView loadingTextView11 = this.problemText;
                    if (loadingTextView11 != null) {
                        loadingTextView11.setVisibility(0);
                    }
                    setProblemTextVisible(false);
                    createCodeTimer();
                }
                if (this.currentType == 11) {
                }
            }
            if (this.currentType == 11) {
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
                        LoginActivity.LoginActivitySmsView.7.$r8$lambda$-w-W2BEGwyw8poyWzOiSyvv_1wM(LoginActivity.LoginActivitySmsView.7.this);
                    }
                });
            }

            public static /* synthetic */ void $r8$lambda$-w-W2BEGwyw8poyWzOiSyvv_1wM(7 r5) {
                r5.getClass();
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
                    } catch (Throwable th) {
                        throw th;
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
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
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
                        LoginActivity.LoginActivitySmsView.8.$r8$lambda$yg1mB9dwovRkikD4GHs74K3pdSo(LoginActivity.LoginActivitySmsView.8.this);
                    }
                });
            }

            public static /* synthetic */ void $r8$lambda$yg1mB9dwovRkikD4GHs74K3pdSo(8 r11) {
                r11.getClass();
                double currentTimeMillis = System.currentTimeMillis();
                double d = currentTimeMillis - LoginActivitySmsView.this.lastCurrentTime;
                LoginActivitySmsView.this.lastCurrentTime = currentTimeMillis;
                LoginActivitySmsView.access$8626(LoginActivitySmsView.this, d);
                if (LoginActivitySmsView.this.time >= 1000) {
                    int i = (LoginActivitySmsView.this.time / MediaDataController.MAX_STYLE_RUNS_COUNT) / 60;
                    int i2 = (LoginActivitySmsView.this.time / MediaDataController.MAX_STYLE_RUNS_COUNT) - (i * 60);
                    if (LoginActivitySmsView.this.nextType == 4 || LoginActivitySmsView.this.nextType == 3 || LoginActivitySmsView.this.nextType == 11) {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i), Integer.valueOf(i2)));
                    } else if (LoginActivitySmsView.this.currentType != 2 || (LoginActivitySmsView.this.nextType != 2 && LoginActivitySmsView.this.nextType != 17 && LoginActivitySmsView.this.nextType != 16)) {
                        if (LoginActivitySmsView.this.nextType == 2 || LoginActivitySmsView.this.nextType == 17 || LoginActivitySmsView.this.nextType == 16) {
                            LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i), Integer.valueOf(i2)));
                        }
                    } else {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i), Integer.valueOf(i2)));
                    }
                    LoginActivitySmsView.access$10300(LoginActivitySmsView.this);
                    return;
                }
                LoginActivitySmsView.this.destroyTimer();
                if (LoginActivitySmsView.this.nextType == 3 || LoginActivitySmsView.this.nextType == 4 || LoginActivitySmsView.this.nextType == 2 || LoginActivitySmsView.this.nextType == 17 || LoginActivitySmsView.this.nextType == 16 || LoginActivitySmsView.this.nextType == 11) {
                    if (LoginActivitySmsView.this.nextType == 4) {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (LoginActivitySmsView.this.nextType == 11 || LoginActivitySmsView.this.nextType == 3) {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.getString(R.string.RequestMissedCall));
                    } else {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    }
                    LoadingTextView loadingTextView = LoginActivitySmsView.this.timeText;
                    int i3 = Theme.key_chats_actionBackground;
                    loadingTextView.setTextColor(Theme.getColor(i3));
                    LoginActivitySmsView.this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i3));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void destroyTimer() {
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            loadingTextView.setTextColor(Theme.getColor(i));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.timeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.timeTimer = null;
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onNextPressed(String str) {
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
                            LoginActivity.LoginActivitySmsView.$r8$lambda$BLKsRQL8tF9NsW00-cKWuJP4GQs(LoginActivity.LoginActivitySmsView.this, confirmphone, tLObject, tL_error);
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
                    tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(changephone, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda15
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            LoginActivity.LoginActivitySmsView.$r8$lambda$626WCZcV5b4cnKb_qK_Se-iz5xc(LoginActivity.LoginActivitySmsView.this, tLObject, tL_error);
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
                tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_signIn, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda14
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$XLOVqDD_geoQZgX3OjM7N3Hjx0w(LoginActivity.LoginActivitySmsView.this, tL_auth_signIn, tLObject, tL_error);
                    }
                }, 10), true);
                LoginActivity.this.showDoneButton(true, true);
            }
        }

        public static /* synthetic */ void $r8$lambda$626WCZcV5b4cnKb_qK_Se-iz5xc(final LoginActivitySmsView loginActivitySmsView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$lG9D0uJ4SxlyTkY-KaA3wSf1HLI(LoginActivity.LoginActivitySmsView.this, tL_error, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$lG9D0uJ4SxlyTkY-KaA3wSf1HLI(final LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, TLObject tLObject) {
            int i;
            int i2;
            int i3;
            loginActivitySmsView.tryHideProgress(false, true);
            loginActivitySmsView.nextPressed = false;
            if (tL_error == null) {
                TLRPC.User user = (TLRPC.User) tLObject;
                loginActivitySmsView.destroyTimer();
                loginActivitySmsView.destroyCodeTimer();
                UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).setCurrentUser(user);
                UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).saveConfig(true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                MessagesStorage.getInstance(((BaseFragment) LoginActivity.this).currentAccount).putUsersAndChats(arrayList, null, true, true);
                MessagesController.getInstance(((BaseFragment) LoginActivity.this).currentAccount).putUser(user, false);
                NotificationCenter.getInstance(((BaseFragment) LoginActivity.this).currentAccount).postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
                LoginActivity.this.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                if (loginActivitySmsView.currentType == 3) {
                    AndroidUtilities.endIncomingCall();
                }
                loginActivitySmsView.animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda30
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$BHz5j1iSfh39aSY9iPDVkwyQE10(LoginActivity.LoginActivitySmsView.this);
                    }
                });
                return;
            }
            loginActivitySmsView.lastError = tL_error.text;
            loginActivitySmsView.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            int i4 = loginActivitySmsView.currentType;
            if ((i4 == 3 && ((i3 = loginActivitySmsView.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = loginActivitySmsView.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = loginActivitySmsView.nextType) == 2 || i == 17 || i == 16)))) {
                loginActivitySmsView.createTimer();
            }
            int i5 = loginActivitySmsView.currentType;
            if (i5 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
            }
            loginActivitySmsView.waitingForEvent = true;
            if (loginActivitySmsView.currentType == 3) {
                return;
            }
            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
            } else {
                if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    loginActivitySmsView.shakeWrongCode();
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    loginActivitySmsView.onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                }
            }
            int i6 = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = loginActivitySmsView.codeFieldContainer;
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

        public static /* synthetic */ void $r8$lambda$BHz5j1iSfh39aSY9iPDVkwyQE10(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            try {
                LoginActivity.this.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            new AlertDialog.Builder(loginActivitySmsView.getContext()).setTitle(LocaleController.getString(R.string.YourPasswordSuccess)).setMessage(LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, PhoneFormat.getInstance().format("+" + loginActivitySmsView.requestPhone))).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda46
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LoginActivity.this.finishFragment();
                }
            }).show();
        }

        public static /* synthetic */ void $r8$lambda$BLKsRQL8tF9NsW00-cKWuJP4GQs(final LoginActivitySmsView loginActivitySmsView, final TL_account.confirmPhone confirmphone, TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$vrQe9l__5K21Z4gDefk0BUYmT2I(LoginActivity.LoginActivitySmsView.this, tL_error, confirmphone);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$vrQe9l__5K21Z4gDefk0BUYmT2I(final LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, TL_account.confirmPhone confirmphone) {
            int i;
            int i2;
            int i3;
            loginActivitySmsView.tryHideProgress(false);
            loginActivitySmsView.nextPressed = false;
            if (tL_error == null) {
                final Activity parentActivity = LoginActivity.this.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                loginActivitySmsView.animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$QvMrqk4bMRquh8t2gzvYh8D8M9Q(LoginActivity.LoginActivitySmsView.this, parentActivity);
                    }
                });
                return;
            }
            loginActivitySmsView.lastError = tL_error.text;
            int i4 = loginActivitySmsView.currentType;
            if ((i4 == 3 && ((i3 = loginActivitySmsView.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = loginActivitySmsView.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = loginActivitySmsView.nextType) == 2 || i == 17 || i == 16)))) {
                loginActivitySmsView.createTimer();
            }
            int i5 = loginActivitySmsView.currentType;
            if (i5 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
            }
            loginActivitySmsView.waitingForEvent = true;
            if (loginActivitySmsView.currentType != 3) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, confirmphone, new Object[0]);
            }
            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                loginActivitySmsView.shakeWrongCode();
            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                loginActivitySmsView.onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
            }
        }

        public static /* synthetic */ void $r8$lambda$QvMrqk4bMRquh8t2gzvYh8D8M9Q(final LoginActivitySmsView loginActivitySmsView, Activity activity) {
            loginActivitySmsView.getClass();
            new AlertDialog.Builder(activity).setTitle(LocaleController.getString(R.string.CancelLinkSuccessTitle)).setMessage(LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, PhoneFormat.getInstance().format("+" + loginActivitySmsView.phone))).setPositiveButton(LocaleController.getString(R.string.Close), null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda43
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LoginActivity.this.finishFragment();
                }
            }).show();
        }

        public static /* synthetic */ void $r8$lambda$XLOVqDD_geoQZgX3OjM7N3Hjx0w(final LoginActivitySmsView loginActivitySmsView, final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$6fy6W3JOq0p-qDMBHQ0gtZWSCH0(LoginActivity.LoginActivitySmsView.this, tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$6fy6W3JOq0p-qDMBHQ0gtZWSCH0(final LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, final TLObject tLObject, final TLRPC.TL_auth_signIn tL_auth_signIn) {
            int i;
            int i2;
            int i3;
            loginActivitySmsView.tryHideProgress(false, true);
            if (tL_error == null) {
                loginActivitySmsView.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                loginActivitySmsView.destroyTimer();
                loginActivitySmsView.destroyCodeTimer();
                if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    final Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                    bundle.putString("phoneHash", loginActivitySmsView.phoneHash);
                    bundle.putString("code", tL_auth_signIn.phone_code);
                    loginActivitySmsView.animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda33
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.this.setPage(5, true, bundle, false);
                        }
                    });
                } else {
                    loginActivitySmsView.animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda34
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
                        }
                    });
                }
            } else {
                String str = tL_error.text;
                loginActivitySmsView.lastError = str;
                if (str.contains("SESSION_PASSWORD_NEEDED")) {
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            LoginActivity.LoginActivitySmsView.$r8$lambda$ZCW-7tk9kWgtApB9OThnyLZJan8(LoginActivity.LoginActivitySmsView.this, tL_auth_signIn, tLObject2, tL_error2);
                        }
                    }, 10);
                    loginActivitySmsView.destroyTimer();
                    loginActivitySmsView.destroyCodeTimer();
                } else {
                    loginActivitySmsView.nextPressed = false;
                    LoginActivity.this.showDoneButton(false, true);
                    int i4 = loginActivitySmsView.currentType;
                    if ((i4 == 3 && ((i3 = loginActivitySmsView.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = loginActivitySmsView.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = loginActivitySmsView.nextType) == 2 || i == 17 || i == 16)))) {
                        loginActivitySmsView.createTimer();
                    }
                    int i5 = loginActivitySmsView.currentType;
                    if (i5 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                    } else if (i5 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                    } else if (i5 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda36
                            @Override // java.lang.Runnable
                            public final void run() {
                                CallReceiver.checkLastReceivedCall();
                            }
                        });
                    }
                    loginActivitySmsView.waitingForEvent = true;
                    if (loginActivitySmsView.currentType == 3) {
                        return;
                    }
                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else {
                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            loginActivitySmsView.shakeWrongCode();
                            return;
                        }
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            loginActivitySmsView.onBackPressed(true);
                            LoginActivity.this.setPage(0, true, null, true);
                            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    }
                    int i6 = 0;
                    while (true) {
                        CodeFieldContainer codeFieldContainer = loginActivitySmsView.codeFieldContainer;
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
            if (loginActivitySmsView.currentType == 3) {
                AndroidUtilities.endIncomingCall();
                AndroidUtilities.setWaitingForCall(false);
            }
        }

        public static /* synthetic */ void $r8$lambda$ZCW-7tk9kWgtApB9OThnyLZJan8(final LoginActivitySmsView loginActivitySmsView, final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$z-mjjO3lyM9L-WgHM8zIZrmfs2g(LoginActivity.LoginActivitySmsView.this, tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$z-mjjO3lyM9L-WgHM8zIZrmfs2g(final LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            loginActivitySmsView.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            final Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
            bundle.putString("phoneHash", loginActivitySmsView.phoneHash);
            bundle.putString("code", tL_auth_signIn.phone_code);
            loginActivitySmsView.animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda48
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.setPage(6, true, bundle, false);
                }
            });
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
                            LoginActivity.LoginActivitySmsView.this.codeFieldContainer.codeField[i].animateSuccessProgress(1.0f);
                        }
                    }, i * 75);
                    i++;
                } else {
                    codeFieldContainer.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda45
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivitySmsView.$r8$lambda$02WegkLULEDZ9hWnpScbLdsPM7g(LoginActivity.LoginActivitySmsView.this, runnable);
                        }
                    }, (this.codeFieldContainer.codeField.length * 75) + 400);
                    return;
                }
            }
        }

        public static /* synthetic */ void $r8$lambda$02WegkLULEDZ9hWnpScbLdsPM7g(LoginActivitySmsView loginActivitySmsView, Runnable runnable) {
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivitySmsView.codeFieldContainer.codeField;
                if (i < codeNumberFieldArr.length) {
                    codeNumberFieldArr[i].animateSuccessProgress(0.0f);
                    i++;
                } else {
                    runnable.run();
                    loginActivitySmsView.codeFieldContainer.isFocusSuppressed = false;
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
                    LoginActivity.LoginActivitySmsView.$r8$lambda$XPs08z92pnOI8-SB9nfzzzdp0Ls(LoginActivity.LoginActivitySmsView.this);
                }
            });
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 5000L);
            this.postedErrorColorTimeout = true;
        }

        public static /* synthetic */ void $r8$lambda$XPs08z92pnOI8-SB9nfzzzdp0Ls(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            loginActivitySmsView.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda49
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$sZF4ZTSXJ4EKYIAl07yPIsAqOMk(LoginActivity.LoginActivitySmsView.this);
                }
            }, 150L);
        }

        public static /* synthetic */ void $r8$lambda$sZF4ZTSXJ4EKYIAl07yPIsAqOMk(LoginActivitySmsView loginActivitySmsView) {
            CodeFieldContainer codeFieldContainer = loginActivitySmsView.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivitySmsView.codeFieldContainer.codeField;
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
                LoginActivity.this.finishFragment();
                return false;
            }
            int i = this.prevType;
            if (i != 0) {
                LoginActivity.this.setPage(i, true, null, true);
                return false;
            }
            if (!z) {
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.showDialog(new AlertDialog.Builder(loginActivity.getParentActivity()).setTitle(LocaleController.getString(R.string.EditNumber)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.phone))).setPositiveButton(LocaleController.getString(R.string.Close), null).setNegativeButton(LocaleController.getString(R.string.Edit), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda17
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$0i7wQ-cl8-PHNkEvWQbf1Ij1itM(LoginActivity.LoginActivitySmsView.this, alertDialog, i2);
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
                    LoginActivity.LoginActivitySmsView.$r8$lambda$gKyVJVXs5FXqCJwgMxzY5MPqX6U(tLObject, tL_error);
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

        public static /* synthetic */ void $r8$lambda$0i7wQ-cl8-PHNkEvWQbf1Ij1itM(LoginActivitySmsView loginActivitySmsView, AlertDialog alertDialog, int i) {
            loginActivitySmsView.onBackPressed(true);
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
                    LoginActivity.LoginActivitySmsView.$r8$lambda$wCOm_qXJPVcU4rSH-LUcsksy2jg(LoginActivity.LoginActivitySmsView.this);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static /* synthetic */ void $r8$lambda$wCOm_qXJPVcU4rSH-LUcsksy2jg(LoginActivitySmsView loginActivitySmsView) {
            CodeNumberField[] codeNumberFieldArr;
            if (loginActivitySmsView.currentType != 3 && (codeNumberFieldArr = loginActivitySmsView.codeFieldContainer.codeField) != null) {
                for (int length = codeNumberFieldArr.length - 1; length >= 0; length--) {
                    if (length == 0 || loginActivitySmsView.codeFieldContainer.codeField[length].length() != 0) {
                        loginActivitySmsView.codeFieldContainer.codeField[length].requestFocus();
                        CodeNumberField codeNumberField = loginActivitySmsView.codeFieldContainer.codeField[length];
                        codeNumberField.setSelection(codeNumberField.length());
                        LoginActivity.this.showKeyboard(loginActivitySmsView.codeFieldContainer.codeField[length]);
                        break;
                    }
                }
            }
            RLottieDrawable rLottieDrawable = loginActivitySmsView.hintDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.start();
            }
            if (loginActivitySmsView.currentType == 15) {
                loginActivitySmsView.openFragmentImageView.getAnimatedDrawable().setCurrentFrame(0, false);
                loginActivitySmsView.openFragmentImageView.getAnimatedDrawable().start();
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
                    onNextPressed(null);
                    return;
                }
                if (i == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.pattern, str)) {
                        if (!this.pattern.equals("*")) {
                            this.catchedPhone = str;
                            AndroidUtilities.endIncomingCall();
                        }
                        onNextPressed(str);
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
                this.rippleDrawable.setState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed});
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
            rLottieImageView.setAnimation(R.raw.tsv_setup_intro, 120, 120);
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
                    this.titleView.setText(LocaleController.getString(R.string.YourPasswordHeader));
                    this.titleView.setGravity(17);
                    this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    this.confirmTextView = textView2;
                    textView2.setTextSize(1, 14.0f);
                    this.confirmTextView.setGravity(1);
                    this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.confirmTextView.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
                    addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
                    OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                    this.outlineCodeField = outlineTextContainerView;
                    outlineTextContainerView.setText(LocaleController.getString(R.string.EnterPassword));
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
                    this.codeField.setInputType(NotificationCenter.messageTranslating);
                    this.codeField.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.codeField.setTypeface(Typeface.DEFAULT);
                    this.codeField.setGravity(!LocaleController.isRTL ? 5 : 3);
                    this.codeField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            LoginActivity.LoginActivityPasswordView.this.outlineCodeField.animateSelection(r2 ? 1.0f : 0.0f);
                        }
                    });
                    this.outlineCodeField.attachEditText(this.codeField);
                    this.outlineCodeField.addView(this.codeField, LayoutHelper.createFrame(-1, -2, 48));
                    this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda2
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                            return LoginActivity.LoginActivityPasswordView.$r8$lambda$SJ0VO2rtSy-2RzAav_DCR9Z8NP0(LoginActivity.LoginActivityPasswordView.this, textView3, i2, keyEvent);
                        }
                    });
                    addView(this.outlineCodeField, LayoutHelper.createLinear(-1, -2, 1, 16, 32, 16, 0));
                    TextView textView3 = new TextView(context);
                    this.cancelButton = textView3;
                    textView3.setGravity(19);
                    this.cancelButton.setText(LocaleController.getString(R.string.ForgotPassword));
                    this.cancelButton.setTextSize(1, 15.0f);
                    this.cancelButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.cancelButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.addView(this.cancelButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout2, LayoutHelper.createLinear(-1, -1, 80));
                    VerticalPositionAutoAnimator.attach(this.cancelButton);
                    this.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityPasswordView.$r8$lambda$xYxvf4N9y4TrtOppdo3HNmC9e5E(LoginActivity.LoginActivityPasswordView.this, context, view);
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
            this.titleView.setText(LocaleController.getString(R.string.YourPasswordHeader));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView22 = new TextView(context);
            this.confirmTextView = textView22;
            textView22.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(1);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.confirmTextView.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.outlineCodeField = outlineTextContainerView2;
            outlineTextContainerView2.setText(LocaleController.getString(R.string.EnterPassword));
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
            this.codeField.setInputType(NotificationCenter.messageTranslating);
            this.codeField.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.codeField.setTypeface(Typeface.DEFAULT);
            this.codeField.setGravity(!LocaleController.isRTL ? 5 : 3);
            this.codeField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    LoginActivity.LoginActivityPasswordView.this.outlineCodeField.animateSelection(r2 ? 1.0f : 0.0f);
                }
            });
            this.outlineCodeField.attachEditText(this.codeField);
            this.outlineCodeField.addView(this.codeField, LayoutHelper.createFrame(-1, -2, 48));
            this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda2
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView32, int i2, KeyEvent keyEvent) {
                    return LoginActivity.LoginActivityPasswordView.$r8$lambda$SJ0VO2rtSy-2RzAav_DCR9Z8NP0(LoginActivity.LoginActivityPasswordView.this, textView32, i2, keyEvent);
                }
            });
            addView(this.outlineCodeField, LayoutHelper.createLinear(-1, -2, 1, 16, 32, 16, 0));
            TextView textView32 = new TextView(context);
            this.cancelButton = textView32;
            textView32.setGravity(19);
            this.cancelButton.setText(LocaleController.getString(R.string.ForgotPassword));
            this.cancelButton.setTextSize(1, 15.0f);
            this.cancelButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.cancelButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            FrameLayout frameLayout22 = new FrameLayout(context);
            frameLayout22.addView(this.cancelButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout22, LayoutHelper.createLinear(-1, -1, 80));
            VerticalPositionAutoAnimator.attach(this.cancelButton);
            this.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$xYxvf4N9y4TrtOppdo3HNmC9e5E(LoginActivity.LoginActivityPasswordView.this, context, view);
                }
            });
        }

        public static /* synthetic */ boolean $r8$lambda$SJ0VO2rtSy-2RzAav_DCR9Z8NP0(LoginActivityPasswordView loginActivityPasswordView, TextView textView, int i, KeyEvent keyEvent) {
            if (i == 5) {
                loginActivityPasswordView.onNextPressed(null);
                return true;
            }
            loginActivityPasswordView.getClass();
            return false;
        }

        public static /* synthetic */ void $r8$lambda$xYxvf4N9y4TrtOppdo3HNmC9e5E(final LoginActivityPasswordView loginActivityPasswordView, Context context, View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            if (loginActivityPasswordView.currentPassword.has_recovery) {
                LoginActivity.this.needShowProgress(0);
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivityPasswordView.$r8$lambda$0sB2H4eWXW0DTiRG9GclcgIMNqg(LoginActivity.LoginActivityPasswordView.this, tLObject, tL_error);
                    }
                }, 10);
            } else {
                AndroidUtilities.hideKeyboard(loginActivityPasswordView.codeField);
                new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString(R.string.RestorePasswordNoEmailText)).setPositiveButton(LocaleController.getString(R.string.Close), null).setNegativeButton(LocaleController.getString(R.string.ResetAccount), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda6
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.this.tryResetAccount(r0.requestPhone, r0.phoneHash, LoginActivity.LoginActivityPasswordView.this.phoneCode);
                    }
                }).show();
            }
        }

        public static /* synthetic */ void $r8$lambda$0sB2H4eWXW0DTiRG9GclcgIMNqg(final LoginActivityPasswordView loginActivityPasswordView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$LP3SNFRNMU83_6eEvjUAWDPBUgo(LoginActivity.LoginActivityPasswordView.this, tL_error, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$LP3SNFRNMU83_6eEvjUAWDPBUgo(final LoginActivityPasswordView loginActivityPasswordView, TLRPC.TL_error tL_error, TLObject tLObject) {
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
                builder.setMessage(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf));
                builder.setTitle(LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle));
                builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda10
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        LoginActivity.LoginActivityPasswordView.$r8$lambda$l0KF8-0oes2c05ofA7rpf3PBTRU(LoginActivity.LoginActivityPasswordView.this, tL_auth_passwordRecovery, alertDialog, i2);
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
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        }

        public static /* synthetic */ void $r8$lambda$l0KF8-0oes2c05ofA7rpf3PBTRU(LoginActivityPasswordView loginActivityPasswordView, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery, AlertDialog alertDialog, int i) {
            loginActivityPasswordView.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("email_unconfirmed_pattern", tL_auth_passwordRecovery.email_pattern);
            bundle.putString("password", loginActivityPasswordView.passwordString);
            bundle.putString("requestPhone", loginActivityPasswordView.requestPhone);
            bundle.putString("phoneHash", loginActivityPasswordView.phoneHash);
            bundle.putString("phoneCode", loginActivityPasswordView.phoneCode);
            LoginActivity.this.setPage(7, true, bundle, false);
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
            return LocaleController.getString("LoginPassword", R.string.LoginPassword);
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
        public void onNextPressed(String str) {
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
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$RZyI8uXtqfbDP6SppH4bBToCKPo(LoginActivity.LoginActivityPasswordView.this, obj);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$RZyI8uXtqfbDP6SppH4bBToCKPo(final LoginActivityPasswordView loginActivityPasswordView, String str) {
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = loginActivityPasswordView.currentPassword.current_algo;
            boolean z = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
            byte[] x = z ? SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda7
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$u9Fia_jB8nb-WLc2KoZ7UGkDrN4(LoginActivity.LoginActivityPasswordView.this, tLObject, tL_error);
                }
            };
            if (z) {
                TL_account.Password password = loginActivityPasswordView.currentPassword;
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

        public static /* synthetic */ void $r8$lambda$u9Fia_jB8nb-WLc2KoZ7UGkDrN4(final LoginActivityPasswordView loginActivityPasswordView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$lK4fLZDNSrfsJqYOczhPnZ3jQeQ(LoginActivity.LoginActivityPasswordView.this, tL_error, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$lK4fLZDNSrfsJqYOczhPnZ3jQeQ(final LoginActivityPasswordView loginActivityPasswordView, TLRPC.TL_error tL_error, final TLObject tLObject) {
            String formatPluralString;
            loginActivityPasswordView.nextPressed = false;
            if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda11
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        LoginActivity.LoginActivityPasswordView.$r8$lambda$vCTxB-LNkfBN9vsWF3UGcU13szo(LoginActivity.LoginActivityPasswordView.this, tLObject2, tL_error2);
                    }
                }, 8);
                return;
            }
            if (tLObject instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.showDoneButton(false, true);
                loginActivityPasswordView.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityPasswordView.$r8$lambda$gVfh-8JHGRjQN-irIkpkBXF6E-8(LoginActivity.LoginActivityPasswordView.this, tLObject);
                    }
                }, 150L);
                return;
            }
            LoginActivity.this.needHideProgress(false);
            if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                loginActivityPasswordView.onPasscodeError(true);
                return;
            }
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        }

        public static /* synthetic */ void $r8$lambda$vCTxB-LNkfBN9vsWF3UGcU13szo(final LoginActivityPasswordView loginActivityPasswordView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$swQem0Znss2QSBPrCeuJ-2q6Qg0(LoginActivity.LoginActivityPasswordView.this, tL_error, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$swQem0Znss2QSBPrCeuJ-2q6Qg0(LoginActivityPasswordView loginActivityPasswordView, TLRPC.TL_error tL_error, TLObject tLObject) {
            loginActivityPasswordView.getClass();
            if (tL_error == null) {
                loginActivityPasswordView.currentPassword = (TL_account.Password) tLObject;
                loginActivityPasswordView.onNextPressed(null);
            }
        }

        public static /* synthetic */ void $r8$lambda$gVfh-8JHGRjQN-irIkpkBXF6E-8(LoginActivityPasswordView loginActivityPasswordView, TLObject tLObject) {
            LoginActivity.this.needHideProgress(false, false);
            AndroidUtilities.hideKeyboard(loginActivityPasswordView.codeField);
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
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$2E72vs0vs3_afXQFwZ_cwUEmP4c(LoginActivity.LoginActivityPasswordView.this);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static /* synthetic */ void $r8$lambda$2E72vs0vs3_afXQFwZ_cwUEmP4c(LoginActivityPasswordView loginActivityPasswordView) {
            EditTextBoldCursor editTextBoldCursor = loginActivityPasswordView.codeField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = loginActivityPasswordView.codeField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                LoginActivity.this.showKeyboard(loginActivityPasswordView.codeField);
                loginActivityPasswordView.lockImageView.getAnimatedDrawable().setCurrentFrame(0, false);
                loginActivityPasswordView.lockImageView.playAnimation();
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
            this.waitImageView.setAnimation(R.raw.sandclock, 120, 120);
            frameLayout.addView(this.waitImageView, LayoutHelper.createFrame(120, 120, 1));
            Point point = AndroidUtilities.displaySize;
            frameLayout.setVisibility((point.x <= point.y || AndroidUtilities.isTablet()) ? 0 : 8);
            linearLayout.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            TextView textView2 = this.titleView;
            int i = R.string.ResetAccount;
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
            this.resetAccountText.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
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
                    LoginActivity.LoginActivityResetWaitView.$r8$lambda$F8iChuPVf8RL09SZOLiAPjKfNnE(LoginActivity.LoginActivityResetWaitView.this, view);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$F8iChuPVf8RL09SZOLiAPjKfNnE(final LoginActivityResetWaitView loginActivityResetWaitView, View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.showDialog(new AlertDialog.Builder(loginActivity.getParentActivity()).setTitle(LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning)).setMessage(LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText)).setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityResetWaitView$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.LoginActivityResetWaitView.$r8$lambda$ikyyFm92ykkFTX7dMIEQSTX_1Z4(LoginActivity.LoginActivityResetWaitView.this, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).create());
        }

        public static /* synthetic */ void $r8$lambda$ikyyFm92ykkFTX7dMIEQSTX_1Z4(final LoginActivityResetWaitView loginActivityResetWaitView, AlertDialog alertDialog, int i) {
            LoginActivity.this.needShowProgress(0);
            TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
            deleteaccount.reason = "Forgot password";
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(deleteaccount, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityResetWaitView$$ExternalSyntheticLambda2
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityResetWaitView.$r8$lambda$cktPbHmwqxyIp0cFNUiI3I9awtM(LoginActivity.LoginActivityResetWaitView.this, tLObject, tL_error);
                }
            }, 10);
        }

        public static /* synthetic */ void $r8$lambda$cktPbHmwqxyIp0cFNUiI3I9awtM(final LoginActivityResetWaitView loginActivityResetWaitView, TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityResetWaitView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityResetWaitView$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityResetWaitView.$r8$lambda$WoC_cvjmzl-Z0Q04f6MugQ1U0yc(LoginActivity.LoginActivityResetWaitView.this, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$WoC_cvjmzl-Z0Q04f6MugQ1U0yc(LoginActivityResetWaitView loginActivityResetWaitView, TLRPC.TL_error tL_error) {
            LoginActivity.this.needHideProgress(false);
            if (tL_error == null) {
                if (loginActivityResetWaitView.requestPhone == null || loginActivityResetWaitView.phoneHash == null || loginActivityResetWaitView.phoneCode == null) {
                    LoginActivity.this.setPage(0, true, null, true);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", loginActivityResetWaitView.requestPhone);
                bundle.putString("phoneHash", loginActivityResetWaitView.phoneHash);
                bundle.putString("code", loginActivityResetWaitView.phoneCode);
                LoginActivity.this.setPage(5, true, bundle, false);
                return;
            }
            if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            } else {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
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
            return LocaleController.getString("ResetAccount", R.string.ResetAccount);
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
            this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", R.string.ResetAccountInfo, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + this.requestPhone)))));
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
            rLottieImageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
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
                    this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? R.string.EnterNewEmail : R.string.AddEmailTitle));
                    this.titleView.setGravity(17);
                    this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
                    this.subtitleView = linksTextView;
                    linksTextView.setTextSize(1, 14.0f);
                    this.subtitleView.setGravity(17);
                    this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.subtitleView.setText(LocaleController.getString(R.string.AddEmailSubtitle));
                    addView(this.subtitleView, LayoutHelper.createLinear(-2, -2, 1, 32, 8, 32, 0));
                    OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                    this.emailOutlineView = outlineTextContainerView;
                    outlineTextContainerView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? R.string.YourNewEmail : R.string.YourEmail));
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
                            LoginActivity.LoginActivitySetupEmail.this.emailOutlineView.animateSelection(r2 ? 1.0f : 0.0f);
                        }
                    });
                    this.emailField.setBackground(null);
                    this.emailField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.emailOutlineView.attachEditText(this.emailField);
                    this.emailOutlineView.addView(this.emailField, LayoutHelper.createFrame(-1, -2, 48));
                    this.emailField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda4
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                            return LoginActivity.LoginActivitySetupEmail.$r8$lambda$W_tqXh0dukwXHfv0k9qwDrxcpkQ(LoginActivity.LoginActivitySetupEmail.this, textView2, i2, keyEvent);
                        }
                    });
                    addView(this.emailOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    this.signInWithGoogleView = textView2;
                    textView2.setGravity(3);
                    this.signInWithGoogleView.setTextSize(1, 14.0f);
                    this.signInWithGoogleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.signInWithGoogleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.signInWithGoogleView.setMaxLines(2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                    Drawable drawable = ContextCompat.getDrawable(context, R.drawable.googleg_standard_color_18);
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
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
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
                            LoginActivity.LoginActivitySetupEmail.$r8$lambda$rmxHYoUXaoN7LjLi3Y-stB0UX_Y(LoginActivity.LoginActivitySetupEmail.this, view);
                        }
                    });
                }
            }
            i = 8;
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView3 = new TextView(context);
            this.titleView = textView3;
            textView3.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? R.string.EnterNewEmail : R.string.AddEmailTitle));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleView = linksTextView2;
            linksTextView2.setTextSize(1, 14.0f);
            this.subtitleView.setGravity(17);
            this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.subtitleView.setText(LocaleController.getString(R.string.AddEmailSubtitle));
            addView(this.subtitleView, LayoutHelper.createLinear(-2, -2, 1, 32, 8, 32, 0));
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.emailOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? R.string.YourNewEmail : R.string.YourEmail));
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
                    LoginActivity.LoginActivitySetupEmail.this.emailOutlineView.animateSelection(r2 ? 1.0f : 0.0f);
                }
            });
            this.emailField.setBackground(null);
            this.emailField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.emailOutlineView.attachEditText(this.emailField);
            this.emailOutlineView.addView(this.emailField, LayoutHelper.createFrame(-1, -2, 48));
            this.emailField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda4
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView22, int i2, KeyEvent keyEvent) {
                    return LoginActivity.LoginActivitySetupEmail.$r8$lambda$W_tqXh0dukwXHfv0k9qwDrxcpkQ(LoginActivity.LoginActivitySetupEmail.this, textView22, i2, keyEvent);
                }
            });
            addView(this.emailOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 0.0f));
            TextView textView22 = new TextView(context);
            this.signInWithGoogleView = textView22;
            textView22.setGravity(3);
            this.signInWithGoogleView.setTextSize(1, 14.0f);
            this.signInWithGoogleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.signInWithGoogleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.signInWithGoogleView.setMaxLines(2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
            Drawable drawable2 = ContextCompat.getDrawable(context, R.drawable.googleg_standard_color_18);
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
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
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
                    LoginActivity.LoginActivitySetupEmail.$r8$lambda$rmxHYoUXaoN7LjLi3Y-stB0UX_Y(LoginActivity.LoginActivitySetupEmail.this, view);
                }
            });
        }

        public static /* synthetic */ boolean $r8$lambda$W_tqXh0dukwXHfv0k9qwDrxcpkQ(LoginActivitySetupEmail loginActivitySetupEmail, TextView textView, int i, KeyEvent keyEvent) {
            if (i == 5) {
                loginActivitySetupEmail.onNextPressed(null);
                return true;
            }
            loginActivitySetupEmail.getClass();
            return false;
        }

        public static /* synthetic */ void $r8$lambda$rmxHYoUXaoN7LjLi3Y-stB0UX_Y(final LoginActivitySetupEmail loginActivitySetupEmail, View view) {
            loginActivitySetupEmail.getClass();
            NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.LoginActivity.LoginActivitySetupEmail.2
                @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                public void didReceivedNotification(int i, int i2, Object... objArr) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    ((Integer) objArr[1]).getClass();
                    Intent intent = (Intent) objArr[2];
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                    if (intValue == 200) {
                        try {
                            LoginActivitySetupEmail.this.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                            LoginActivitySetupEmail.this.onNextPressed(null);
                        } catch (ApiException e) {
                            FileLog.e(e);
                        }
                    }
                }
            }, NotificationCenter.onActivityResultReceived);
            final GoogleSignInClient client = GoogleSignIn.getClient(loginActivitySetupEmail.getContext(), new GoogleSignInOptions.Builder().requestIdToken(BuildVars.GOOGLE_AUTH_CLIENT_ID).requestEmail().build());
            client.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda9
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    LoginActivity.LoginActivitySetupEmail.$r8$lambda$WNlTg2BPzcsBRo4qDVF49Pe8Uw0(LoginActivity.LoginActivitySetupEmail.this, client, task);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$WNlTg2BPzcsBRo4qDVF49Pe8Uw0(LoginActivitySetupEmail loginActivitySetupEmail, GoogleSignInClient googleSignInClient, Task task) {
            if (LoginActivity.this.getParentActivity() == null || LoginActivity.this.getParentActivity().isFinishing()) {
                return;
            }
            LoginActivity.this.getParentActivity().startActivityForResult(googleSignInClient.getSignInIntent(), NotificationCenter.dialogPhotosUpdate);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.subtitleView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
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
            return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
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
                    LoginActivity.LoginActivitySetupEmail.this.emailField.requestFocus();
                }
            }, 300L);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onNextPressed(String str) {
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
                        LoginActivity.LoginActivitySetupEmail.$r8$lambda$VC3_d3qZ4clcry3tjbgQatWLL2s(LoginActivity.LoginActivitySetupEmail.this, bundle, verifyemail, tLObject, tL_error);
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
                    LoginActivity.LoginActivitySetupEmail.$r8$lambda$YjEb7EpfCt3u5XAaSgWCr5-taIk(LoginActivity.LoginActivitySetupEmail.this, bundle, sendverifyemailcode, tLObject, tL_error);
                }
            }, 10);
        }

        public static /* synthetic */ void $r8$lambda$VC3_d3qZ4clcry3tjbgQatWLL2s(final LoginActivitySetupEmail loginActivitySetupEmail, final Bundle bundle, final TL_account.verifyEmail verifyemail, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySetupEmail.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.$r8$lambda$ZtFz69K5ioM-0PpaQ1IHBwtUhpA(LoginActivity.LoginActivitySetupEmail.this, tLObject, bundle, tL_error, verifyemail);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$ZtFz69K5ioM-0PpaQ1IHBwtUhpA(LoginActivitySetupEmail loginActivitySetupEmail, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TL_account.verifyEmail verifyemail) {
            loginActivitySetupEmail.getClass();
            if ((tLObject instanceof TL_account.TL_emailVerified) && LoginActivity.this.activityMode == 3) {
                LoginActivity.this.finishFragment();
                LoginActivity.this.emailChangeFinishCallback.run();
                return;
            }
            if (tLObject instanceof TL_account.TL_emailVerifiedLogin) {
                TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject;
                bundle.putString("email", tL_emailVerifiedLogin.email);
                LoginActivity.this.fillNextCodeParams(bundle, tL_emailVerifiedLogin.sent_code);
            } else if (tL_error != null) {
                if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                } else if (tL_error.code != -1000) {
                    AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, verifyemail, new Object[0]);
                }
            }
        }

        public static /* synthetic */ void $r8$lambda$YjEb7EpfCt3u5XAaSgWCr5-taIk(final LoginActivitySetupEmail loginActivitySetupEmail, final Bundle bundle, final TL_account.sendVerifyEmailCode sendverifyemailcode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySetupEmail.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.$r8$lambda$GiqjsYzolpT2K_wOcvkXau9QWP4(LoginActivity.LoginActivitySetupEmail.this, tLObject, bundle, tL_error, sendverifyemailcode);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$GiqjsYzolpT2K_wOcvkXau9QWP4(LoginActivitySetupEmail loginActivitySetupEmail, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TL_account.sendVerifyEmailCode sendverifyemailcode) {
            LoginActivity.this.needHideProgress(false);
            loginActivitySetupEmail.nextPressed = false;
            if (tLObject instanceof TL_account.sentEmailCode) {
                LoginActivity.this.fillNextCodeParams(bundle, (TL_account.sentEmailCode) tLObject);
                return;
            }
            String str = tL_error.text;
            if (str != null) {
                if (str.contains("EMAIL_INVALID")) {
                    loginActivitySetupEmail.onPasscodeError(false);
                    return;
                }
                if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                    return;
                }
                if (tL_error.text.contains("PHONE_PASSWORD_FLOOD")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    return;
                }
                if (tL_error.text.contains("PHONE_NUMBER_FLOOD")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    loginActivitySetupEmail.onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                } else if (tL_error.code != -1000) {
                    AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, sendverifyemailcode, loginActivitySetupEmail.requestPhone);
                }
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.$r8$lambda$-NhKYOUS3TTyUv0drjcDsWZ0GHA(LoginActivity.LoginActivitySetupEmail.this);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static /* synthetic */ void $r8$lambda$-NhKYOUS3TTyUv0drjcDsWZ0GHA(LoginActivitySetupEmail loginActivitySetupEmail) {
            loginActivitySetupEmail.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            loginActivitySetupEmail.inboxImageView.playAnimation();
            loginActivitySetupEmail.emailField.requestFocus();
            AndroidUtilities.showKeyboard(loginActivitySetupEmail.emailField);
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

        public static /* synthetic */ void $r8$lambda$JXbNUwOI-GeBs88HcSuaOiqvqhw(LoginActivityEmailCodeView loginActivityEmailCodeView) {
            boolean z = false;
            loginActivityEmailCodeView.postedErrorColorTimeout = false;
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
            if (loginActivityEmailCodeView.errorViewSwitcher.getCurrentView() != loginActivityEmailCodeView.resendFrameLayout) {
                loginActivityEmailCodeView.errorViewSwitcher.showNext();
                FrameLayout frameLayout = loginActivityEmailCodeView.cantAccessEmailFrameLayout;
                if (loginActivityEmailCodeView.resendCodeView.getVisibility() != 0 && LoginActivity.this.activityMode != 3 && !loginActivityEmailCodeView.isSetup) {
                    z = true;
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z, 1.0f, true);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0336  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x034f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
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
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$JXbNUwOI-GeBs88HcSuaOiqvqhw(LoginActivity.LoginActivityEmailCodeView.this);
                }
            };
            this.resendCodeTimeout = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.this.showResendCodeView(true);
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
                this.inboxImageView.setAnimation(R.raw.email_check_inbox, 120, 120);
            } else {
                this.inboxImageView.setAnimation(R.raw.email_setup_heart, 120, 120);
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
                    this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? R.string.CheckYourNewEmail : z ? R.string.VerificationCode : R.string.CheckYourEmail));
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
                            LoginActivityEmailCodeView.this.onNextPressed(null);
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
                    Drawable drawable = ContextCompat.getDrawable(context, R.drawable.googleg_standard_color_18);
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
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
                    this.signInWithGoogleView.setText(spannableStringBuilder);
                    this.signInWithGoogleView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityEmailCodeView.$r8$lambda$dryLsq58iv0_RPXUqFrHg_5LorU(LoginActivity.LoginActivityEmailCodeView.this, view);
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
                    textView3.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
                    this.cantAccessEmailView.setGravity(17);
                    this.cantAccessEmailView.setTextSize(1, 14.0f);
                    this.cantAccessEmailView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.cantAccessEmailView.setMaxLines(2);
                    this.cantAccessEmailView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityEmailCodeView.$r8$lambda$wVBcfI3f4yvar6WQqxWSKCEk07Q(LoginActivity.LoginActivityEmailCodeView.this, context, view);
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
                            LoginActivity.LoginActivityEmailCodeView.this.requestEmailReset();
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
                    this.resendCodeView.setText(LocaleController.getString(R.string.ResendCode));
                    this.resendCodeView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityEmailCodeView.$r8$lambda$c9i1S3v9tVSB4UnIHCJXbDH74_o(LoginActivity.LoginActivityEmailCodeView.this, view);
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
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = Easings.easeInOutQuad;
                    loadAnimation.setInterpolator(interpolator);
                    this.errorViewSwitcher.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    this.errorViewSwitcher.setOutAnimation(loadAnimation2);
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    this.resendFrameLayout = frameLayout3;
                    frameLayout3.addView(this.resendCodeView, LayoutHelper.createFrame(-2, -2, 17));
                    this.errorViewSwitcher.addView(this.resendFrameLayout);
                    TextView textView6 = new TextView(context);
                    this.wrongCodeView = textView6;
                    textView6.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
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
            this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode != 3 ? R.string.CheckYourNewEmail : z ? R.string.VerificationCode : R.string.CheckYourEmail));
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
                    LoginActivityEmailCodeView.this.onNextPressed(null);
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
            Drawable drawable2 = ContextCompat.getDrawable(context, R.drawable.googleg_standard_color_18);
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
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
            this.signInWithGoogleView.setText(spannableStringBuilder2);
            this.signInWithGoogleView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$dryLsq58iv0_RPXUqFrHg_5LorU(LoginActivity.LoginActivityEmailCodeView.this, view);
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
            textView32.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
            this.cantAccessEmailView.setGravity(17);
            this.cantAccessEmailView.setTextSize(1, 14.0f);
            this.cantAccessEmailView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.cantAccessEmailView.setMaxLines(2);
            this.cantAccessEmailView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$wVBcfI3f4yvar6WQqxWSKCEk07Q(LoginActivity.LoginActivityEmailCodeView.this, context, view);
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
                    LoginActivity.LoginActivityEmailCodeView.this.requestEmailReset();
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
            this.resendCodeView.setText(LocaleController.getString(R.string.ResendCode));
            this.resendCodeView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$c9i1S3v9tVSB4UnIHCJXbDH74_o(LoginActivity.LoginActivityEmailCodeView.this, view);
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
            Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
            Interpolator interpolator2 = Easings.easeInOutQuad;
            loadAnimation3.setInterpolator(interpolator2);
            this.errorViewSwitcher.setInAnimation(loadAnimation3);
            Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
            loadAnimation22.setInterpolator(interpolator2);
            this.errorViewSwitcher.setOutAnimation(loadAnimation22);
            FrameLayout frameLayout32 = new FrameLayout(context);
            this.resendFrameLayout = frameLayout32;
            frameLayout32.addView(this.resendCodeView, LayoutHelper.createFrame(-2, -2, 17));
            this.errorViewSwitcher.addView(this.resendFrameLayout);
            TextView textView62 = new TextView(context);
            this.wrongCodeView = textView62;
            textView62.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
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

        public static /* synthetic */ void $r8$lambda$dryLsq58iv0_RPXUqFrHg_5LorU(final LoginActivityEmailCodeView loginActivityEmailCodeView, View view) {
            loginActivityEmailCodeView.getClass();
            NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.LoginActivity.LoginActivityEmailCodeView.3
                @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                public void didReceivedNotification(int i, int i2, Object... objArr) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    ((Integer) objArr[1]).getClass();
                    Intent intent = (Intent) objArr[2];
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                    if (intValue == 200) {
                        try {
                            LoginActivityEmailCodeView.this.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                            LoginActivityEmailCodeView.this.onNextPressed(null);
                        } catch (ApiException e) {
                            FileLog.e(e);
                        }
                    }
                }
            }, NotificationCenter.onActivityResultReceived);
            final GoogleSignInClient client = GoogleSignIn.getClient(loginActivityEmailCodeView.getContext(), new GoogleSignInOptions.Builder().requestIdToken(BuildVars.GOOGLE_AUTH_CLIENT_ID).requestEmail().build());
            client.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda11
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$3iCNdFe34I7px-8ksCdw3CXyjvQ(LoginActivity.LoginActivityEmailCodeView.this, client, task);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$3iCNdFe34I7px-8ksCdw3CXyjvQ(LoginActivityEmailCodeView loginActivityEmailCodeView, GoogleSignInClient googleSignInClient, Task task) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity.this.getParentActivity().startActivityForResult(googleSignInClient.getSignInIntent(), NotificationCenter.dialogPhotosUpdate);
        }

        public static /* synthetic */ void $r8$lambda$wVBcfI3f4yvar6WQqxWSKCEk07Q(final LoginActivityEmailCodeView loginActivityEmailCodeView, Context context, View view) {
            String string = loginActivityEmailCodeView.currentParams.getString("emailPattern");
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
            new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.LoginEmailResetTitle)).setMessage(AndroidUtilities.formatSpannable(AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage)), spannableStringBuilder, loginActivityEmailCodeView.getTimePattern(loginActivityEmailCodeView.resetAvailablePeriod))).setPositiveButton(LocaleController.getString(R.string.LoginEmailResetButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda15
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i2) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$vE_NePmZOl-m7EoNOQmwINm8Fvg(LoginActivity.LoginActivityEmailCodeView.this, alertDialog, i2);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }

        public static /* synthetic */ void $r8$lambda$vE_NePmZOl-m7EoNOQmwINm8Fvg(final LoginActivityEmailCodeView loginActivityEmailCodeView, AlertDialog alertDialog, int i) {
            loginActivityEmailCodeView.getClass();
            final Bundle bundle = new Bundle();
            bundle.putString("phone", loginActivityEmailCodeView.phone);
            bundle.putString("ephone", loginActivityEmailCodeView.emailPhone);
            bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
            final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
            tL_auth_resetLoginEmail.phone_number = loginActivityEmailCodeView.requestPhone;
            tL_auth_resetLoginEmail.phone_code_hash = loginActivityEmailCodeView.phoneHash;
            LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda19
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$6DZFoSiNBh-GKvlTqKBxsFtQ_qo(LoginActivity.LoginActivityEmailCodeView.this, bundle, tL_auth_resetLoginEmail, tLObject, tL_error);
                }
            }, 10);
        }

        public static /* synthetic */ void $r8$lambda$6DZFoSiNBh-GKvlTqKBxsFtQ_qo(final LoginActivityEmailCodeView loginActivityEmailCodeView, final Bundle bundle, final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$Vty85d_PqpMwPW5A5rHcMn6LAGs(LoginActivity.LoginActivityEmailCodeView.this, tLObject, bundle, tL_error, tL_auth_resetLoginEmail);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$Vty85d_PqpMwPW5A5rHcMn6LAGs(LoginActivityEmailCodeView loginActivityEmailCodeView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail) {
            String str;
            loginActivityEmailCodeView.getClass();
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                    auth_sentcodetype.email_pattern = loginActivityEmailCodeView.currentParams.getString("emailPattern");
                    loginActivityEmailCodeView.resetRequestPending = true;
                }
                LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (!str.contains("PHONE_CODE_EXPIRED")) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resetLoginEmail, new Object[0]);
                return;
            }
            loginActivityEmailCodeView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
        }

        public static /* synthetic */ void $r8$lambda$c9i1S3v9tVSB4UnIHCJXbDH74_o(final LoginActivityEmailCodeView loginActivityEmailCodeView, View view) {
            if (loginActivityEmailCodeView.resendCodeView.getVisibility() == 0 && loginActivityEmailCodeView.resendCodeView.getAlpha() == 1.0f) {
                loginActivityEmailCodeView.showResendCodeView(false);
                final TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = loginActivityEmailCodeView.requestPhone;
                tL_auth_resendCode.phone_code_hash = loginActivityEmailCodeView.phoneHash;
                final Bundle bundle = new Bundle();
                bundle.putString("phone", loginActivityEmailCodeView.phone);
                bundle.putString("ephone", loginActivityEmailCodeView.emailPhone);
                bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda10
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivityEmailCodeView.$r8$lambda$4_dEnDdbPw0R5IepiP0RyIbXw0k(LoginActivity.LoginActivityEmailCodeView.this, bundle, tL_auth_resendCode, tLObject, tL_error);
                    }
                }, 10);
            }
        }

        public static /* synthetic */ void $r8$lambda$4_dEnDdbPw0R5IepiP0RyIbXw0k(final LoginActivityEmailCodeView loginActivityEmailCodeView, final Bundle bundle, final TLRPC.TL_auth_resendCode tL_auth_resendCode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$ivlqSIYxesPGOXTFWg-gkpR1vm8(LoginActivity.LoginActivityEmailCodeView.this, tLObject, bundle, tL_error, tL_auth_resendCode);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$ivlqSIYxesPGOXTFWg-gkpR1vm8(LoginActivityEmailCodeView loginActivityEmailCodeView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
            loginActivityEmailCodeView.getClass();
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                LoginActivity.this.fillNextCodeParams(bundle, (TLRPC.TL_auth_sentCode) tLObject);
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
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$K6ZtIJuqm2PQaJ0UfSczYknDJGE(LoginActivity.LoginActivityEmailCodeView.this, bundle, tL_auth_resetLoginEmail, tLObject, tL_error);
                }
            }, 10);
        }

        public static /* synthetic */ void $r8$lambda$K6ZtIJuqm2PQaJ0UfSczYknDJGE(final LoginActivityEmailCodeView loginActivityEmailCodeView, final Bundle bundle, final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$_GqVJsdesYalmDNLVYYEq-gG5LY(LoginActivity.LoginActivityEmailCodeView.this, tLObject, bundle, tL_error, tL_auth_resetLoginEmail);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$_GqVJsdesYalmDNLVYYEq-gG5LY(LoginActivityEmailCodeView loginActivityEmailCodeView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail) {
            String str;
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            loginActivityEmailCodeView.requestingEmailReset = false;
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                LoginActivity.this.fillNextCodeParams(bundle, (TLRPC.TL_auth_sentCode) tLObject);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (str.contains("TASK_ALREADY_EXISTS")) {
                new AlertDialog.Builder(loginActivityEmailCodeView.getContext()).setTitle(LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + loginActivityEmailCodeView.requestPhone))))).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
            if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resetLoginEmail, new Object[0]);
                return;
            }
            loginActivityEmailCodeView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
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

        /* JADX INFO: Access modifiers changed from: private */
        public void showResendCodeView(boolean z) {
            AndroidUtilities.updateViewVisibilityAnimated(this.resendCodeView, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, (z || LoginActivity.this.activityMode == 3 || this.isSetup) ? false : true);
            if (this.loginOrView.getVisibility() != 8) {
                this.loginOrView.setLayoutParams(LayoutHelper.createFrame(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z ? 8.0f : 16.0f));
                this.loginOrView.requestLayout();
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString(R.string.VerificationCode);
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
                this.confirmTextView.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.email));
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, false, 1.0f, false);
            } else if (this.isSetup) {
                this.confirmTextView.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.email));
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
                        LoginActivity.LoginActivityEmailCodeView.$r8$lambda$KlYesQ3ywiwQcIlKoe1rNFVG6Kw(LoginActivity.LoginActivityEmailCodeView.this, view, z2);
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
                this.confirmTextView.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
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

        public static /* synthetic */ void $r8$lambda$KlYesQ3ywiwQcIlKoe1rNFVG6Kw(LoginActivityEmailCodeView loginActivityEmailCodeView, View view, boolean z) {
            if (!z) {
                loginActivityEmailCodeView.getClass();
            } else {
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
                return LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i2, new Object[0]));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i4 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i4)) : "");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "%02d:", Integer.valueOf(i6)));
            sb.append(String.format(locale, "%02d", Integer.valueOf(i7)));
            return LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb.toString());
        }

        private String getTimePattern(int i) {
            int i2 = i / 86400;
            int i3 = i % 86400;
            int i4 = i3 / 3600;
            int i5 = (i3 % 3600) / 60;
            if (i2 == 0 && i4 == 0) {
                i5 = Math.max(1, i5);
            }
            return (i2 == 0 || i4 == 0) ? (i4 == 0 || i5 == 0) ? i2 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i2, new Object[0])) : i4 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i2, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i5, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i4, new Object[0]), LocaleController.formatPluralString("Minutes", i5, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i2, new Object[0]), LocaleController.formatPluralString("Hours", i4, new Object[0]));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateResetPendingDate() {
            int currentTimeMillis = (int) (this.resetPendingDate - (System.currentTimeMillis() / 1000));
            if (this.resetPendingDate <= 0 || currentTimeMillis <= 0) {
                this.emailResetInView.setVisibility(0);
                this.emailResetInView.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityEmailCodeView.this.requestEmailReset();
                    }
                }, 1000L);
                return;
            }
            String formatString = LocaleController.formatString(R.string.LoginEmailResetInTime, getTimePatternForTimer(currentTimeMillis));
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
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$UN1AEM9BLdVnd9AjBoCj8hUgMQo(LoginActivity.LoginActivityEmailCodeView.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$UN1AEM9BLdVnd9AjBoCj8hUgMQo(final LoginActivityEmailCodeView loginActivityEmailCodeView) {
            loginActivityEmailCodeView.getClass();
            loginActivityEmailCodeView.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$XCalTS1RX8_QjxqMrlD-og1Dfr4(LoginActivity.LoginActivityEmailCodeView.this);
                }
            }, 150L);
            loginActivityEmailCodeView.removeCallbacks(loginActivityEmailCodeView.errorColorTimeout);
            loginActivityEmailCodeView.postDelayed(loginActivityEmailCodeView.errorColorTimeout, 3000L);
            loginActivityEmailCodeView.postedErrorColorTimeout = true;
        }

        public static /* synthetic */ void $r8$lambda$XCalTS1RX8_QjxqMrlD-og1Dfr4(LoginActivityEmailCodeView loginActivityEmailCodeView) {
            CodeFieldContainer codeFieldContainer = loginActivityEmailCodeView.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.telegram.ui.Components.SlideView
        public void onNextPressed(String str) {
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
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$dqSoH07sEuzM_DjXcgIVyOrtv38(LoginActivity.LoginActivityEmailCodeView.this, code, tLObject, tL_error);
                }
            }, 10);
        }

        public static /* synthetic */ void $r8$lambda$dqSoH07sEuzM_DjXcgIVyOrtv38(final LoginActivityEmailCodeView loginActivityEmailCodeView, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$LfTtP1qO-d7ME5zvpVnO_Vdz628(LoginActivity.LoginActivityEmailCodeView.this, tL_error, str, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$LfTtP1qO-d7ME5zvpVnO_Vdz628(final LoginActivityEmailCodeView loginActivityEmailCodeView, TLRPC.TL_error tL_error, final String str, final TLObject tLObject) {
            CodeNumberField[] codeNumberFieldArr;
            LoginActivity.this.needHideProgress(false);
            if (tL_error == null) {
                loginActivityEmailCodeView.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                final Bundle bundle = new Bundle();
                bundle.putString("phone", loginActivityEmailCodeView.phone);
                bundle.putString("ephone", loginActivityEmailCodeView.emailPhone);
                bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
                bundle.putString("phoneHash", loginActivityEmailCodeView.phoneHash);
                bundle.putString("code", str);
                if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    loginActivityEmailCodeView.animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda21
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.this.setPage(5, true, bundle, false);
                        }
                    });
                } else {
                    loginActivityEmailCodeView.animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda22
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivityEmailCodeView.$r8$lambda$RLZ-pnb9fB9e5mN_NCIPpNmkkVc(LoginActivity.LoginActivityEmailCodeView.this, tLObject, bundle);
                        }
                    });
                }
            } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda23
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        LoginActivity.LoginActivityEmailCodeView.$r8$lambda$-EFtpRRnoBzzFqJXgRTlz37aZcs(LoginActivity.LoginActivityEmailCodeView.this, str, tLObject2, tL_error2);
                    }
                }, 10);
            } else {
                loginActivityEmailCodeView.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    loginActivityEmailCodeView.shakeWrongCode();
                } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                    loginActivityEmailCodeView.onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                }
                if (loginActivityEmailCodeView.codeFieldContainer.codeField != null) {
                    int i = 0;
                    while (true) {
                        codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                        if (i >= codeNumberFieldArr.length) {
                            break;
                        }
                        codeNumberFieldArr[i].setText("");
                        i++;
                    }
                    codeNumberFieldArr[0].requestFocus();
                }
                loginActivityEmailCodeView.codeFieldContainer.isFocusSuppressed = false;
            }
            loginActivityEmailCodeView.googleAccount = null;
        }

        public static /* synthetic */ void $r8$lambda$RLZ-pnb9fB9e5mN_NCIPpNmkkVc(LoginActivityEmailCodeView loginActivityEmailCodeView, TLObject tLObject, Bundle bundle) {
            loginActivityEmailCodeView.getClass();
            if ((tLObject instanceof TL_account.TL_emailVerified) && LoginActivity.this.activityMode == 3) {
                LoginActivity.this.finishFragment();
                LoginActivity.this.emailChangeFinishCallback.run();
            } else if (tLObject instanceof TL_account.TL_emailVerifiedLogin) {
                LoginActivity.this.fillNextCodeParams(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject).sent_code);
            } else if (tLObject instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
            }
        }

        public static /* synthetic */ void $r8$lambda$-EFtpRRnoBzzFqJXgRTlz37aZcs(final LoginActivityEmailCodeView loginActivityEmailCodeView, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$VeY6r7pyJdx6Kmqm6M7BN38-nGs(LoginActivity.LoginActivityEmailCodeView.this, tL_error, tLObject, str);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$VeY6r7pyJdx6Kmqm6M7BN38-nGs(final LoginActivityEmailCodeView loginActivityEmailCodeView, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            loginActivityEmailCodeView.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            final Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
            bundle.putString("phoneHash", loginActivityEmailCodeView.phoneHash);
            bundle.putString("code", str);
            loginActivityEmailCodeView.animateSuccess(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.this.setPage(6, true, bundle, false);
                }
            });
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
                            LoginActivity.LoginActivityEmailCodeView.this.codeFieldContainer.codeField[i].animateSuccessProgress(1.0f);
                        }
                    }, i * 75);
                    i++;
                } else {
                    codeFieldContainer.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda27
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginActivityEmailCodeView.$r8$lambda$I8d6kJKSbzdPSTGbHEmztieMo4c(LoginActivity.LoginActivityEmailCodeView.this, runnable);
                        }
                    }, (this.codeFieldContainer.codeField.length * 75) + 400);
                    return;
                }
            }
        }

        public static /* synthetic */ void $r8$lambda$I8d6kJKSbzdPSTGbHEmztieMo4c(LoginActivityEmailCodeView loginActivityEmailCodeView, Runnable runnable) {
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                if (i < codeNumberFieldArr.length) {
                    codeNumberFieldArr[i].animateSuccessProgress(0.0f);
                    i++;
                } else {
                    runnable.run();
                    loginActivityEmailCodeView.codeFieldContainer.isFocusSuppressed = false;
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
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$u97Sjf9PHo4sp2z91ZHS4B_1f70(LoginActivity.LoginActivityEmailCodeView.this);
                }
            });
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 5000L);
            this.postedErrorColorTimeout = true;
        }

        public static /* synthetic */ void $r8$lambda$u97Sjf9PHo4sp2z91ZHS4B_1f70(final LoginActivityEmailCodeView loginActivityEmailCodeView) {
            loginActivityEmailCodeView.getClass();
            loginActivityEmailCodeView.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda30
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$puenDNv2suVuV4Qv6wLRtLn6AkQ(LoginActivity.LoginActivityEmailCodeView.this);
                }
            }, 150L);
        }

        public static /* synthetic */ void $r8$lambda$puenDNv2suVuV4Qv6wLRtLn6AkQ(LoginActivityEmailCodeView loginActivityEmailCodeView) {
            CodeFieldContainer codeFieldContainer = loginActivityEmailCodeView.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
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
                        LoginActivity.LoginActivityEmailCodeView.$r8$lambda$jywRvzP5Q-MFuihc_Mv68VLQHhU(LoginActivity.LoginActivityEmailCodeView.this);
                    }
                }, LoginActivity.SHOW_DELAY);
            }
        }

        public static /* synthetic */ void $r8$lambda$jywRvzP5Q-MFuihc_Mv68VLQHhU(LoginActivityEmailCodeView loginActivityEmailCodeView) {
            loginActivityEmailCodeView.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            loginActivityEmailCodeView.inboxImageView.playAnimation();
            CodeFieldContainer codeFieldContainer = loginActivityEmailCodeView.codeFieldContainer;
            if (codeFieldContainer == null || codeFieldContainer.codeField == null) {
                return;
            }
            codeFieldContainer.setText("");
            loginActivityEmailCodeView.codeFieldContainer.codeField[0].requestFocus();
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

        public static /* synthetic */ void $r8$lambda$_WPo86BsOX6OBu7X1KurpZdt1_w(LoginActivityRecoverView loginActivityRecoverView) {
            int i = 0;
            loginActivityRecoverView.postedErrorColorTimeout = false;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityRecoverView.codeFieldContainer.codeField;
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
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$_WPo86BsOX6OBu7X1KurpZdt1_w(LoginActivity.LoginActivityRecoverView.this);
                }
            };
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.inboxImageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
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
                    this.titleView.setText(LocaleController.getString(R.string.EnterCode));
                    this.titleView.setGravity(17);
                    this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    this.confirmTextView = textView2;
                    textView2.setTextSize(1, 14.0f);
                    this.confirmTextView.setGravity(17);
                    this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.confirmTextView.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
                    addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
                    CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityRecoverView.1
                        @Override // org.telegram.ui.CodeFieldContainer
                        protected void processNextPressed() {
                            LoginActivityRecoverView.this.onNextPressed(null);
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
                                LoginActivity.LoginActivityRecoverView.$r8$lambda$9FTO_tedF8MpnR-Ft7EbQtksig4(LoginActivity.LoginActivityRecoverView.this, view, z);
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
                            LoginActivity.LoginActivityRecoverView.$r8$lambda$LBliBZMZQH0Mj0dmU-nRe_L4_g0(LoginActivity.LoginActivityRecoverView.this, view);
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
            this.titleView.setText(LocaleController.getString(R.string.EnterCode));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView22 = new TextView(context);
            this.confirmTextView = textView22;
            textView22.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(17);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.confirmTextView.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            CodeFieldContainer codeFieldContainer2 = new CodeFieldContainer(context) { // from class: org.telegram.ui.LoginActivity.LoginActivityRecoverView.1
                @Override // org.telegram.ui.CodeFieldContainer
                protected void processNextPressed() {
                    LoginActivityRecoverView.this.onNextPressed(null);
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
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$LBliBZMZQH0Mj0dmU-nRe_L4_g0(LoginActivity.LoginActivityRecoverView.this, view);
                }
            });
            FrameLayout frameLayout22 = new FrameLayout(context);
            frameLayout22.addView(this.troubleButton, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout22, LayoutHelper.createLinear(-1, 0, 1.0f));
            VerticalPositionAutoAnimator.attach(this.troubleButton);
        }

        public static /* synthetic */ void $r8$lambda$9FTO_tedF8MpnR-Ft7EbQtksig4(LoginActivityRecoverView loginActivityRecoverView, View view, boolean z) {
            if (!z) {
                loginActivityRecoverView.getClass();
            } else {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        public static /* synthetic */ void $r8$lambda$LBliBZMZQH0Mj0dmU-nRe_L4_g0(final LoginActivityRecoverView loginActivityRecoverView, View view) {
            Dialog showDialog = LoginActivity.this.showDialog(new AlertDialog.Builder(LoginActivity.this.getParentActivity()).setTitle(LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText)).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda6
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.this.setPage(6, true, new Bundle(), true);
                }
            }).setNegativeButton(LocaleController.getString(R.string.ResetAccount), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda7
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.this.tryResetAccount(r0.requestPhone, r0.phoneHash, LoginActivity.LoginActivityRecoverView.this.phoneCode);
                }
            }).create());
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
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
            return LocaleController.getString("LoginPassword", R.string.LoginPassword);
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
            this.troubleButton.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
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
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$Ox2N2YG1FFZKspIT7IH10aZhn-k(LoginActivity.LoginActivityRecoverView.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$Ox2N2YG1FFZKspIT7IH10aZhn-k(final LoginActivityRecoverView loginActivityRecoverView) {
            loginActivityRecoverView.getClass();
            loginActivityRecoverView.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$kqzd6hXmjOZ5IhhGe_aF18tuR0s(LoginActivity.LoginActivityRecoverView.this);
                }
            }, 150L);
            loginActivityRecoverView.removeCallbacks(loginActivityRecoverView.errorColorTimeout);
            loginActivityRecoverView.postDelayed(loginActivityRecoverView.errorColorTimeout, 3000L);
            loginActivityRecoverView.postedErrorColorTimeout = true;
        }

        public static /* synthetic */ void $r8$lambda$kqzd6hXmjOZ5IhhGe_aF18tuR0s(LoginActivityRecoverView loginActivityRecoverView) {
            CodeFieldContainer codeFieldContainer = loginActivityRecoverView.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityRecoverView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        @Override // org.telegram.ui.Components.SlideView
        public void onNextPressed(String str) {
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
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$jmnhJDSk2HULcYlNfuVOsuhOx2c(LoginActivity.LoginActivityRecoverView.this, code, tLObject, tL_error);
                }
            }, 10);
        }

        public static /* synthetic */ void $r8$lambda$jmnhJDSk2HULcYlNfuVOsuhOx2c(final LoginActivityRecoverView loginActivityRecoverView, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityRecoverView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$4QMxkQz95tbwuTwZ1D1XGBaHSzc(LoginActivity.LoginActivityRecoverView.this, tLObject, str, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$4QMxkQz95tbwuTwZ1D1XGBaHSzc(LoginActivityRecoverView loginActivityRecoverView, TLObject tLObject, String str, TLRPC.TL_error tL_error) {
            String formatPluralString;
            LoginActivity.this.needHideProgress(false);
            loginActivityRecoverView.nextPressed = false;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", str);
                bundle.putString("password", loginActivityRecoverView.passwordString);
                LoginActivity.this.setPage(9, true, bundle, false);
                return;
            }
            if (tL_error == null || tL_error.text.startsWith("CODE_INVALID")) {
                loginActivityRecoverView.onPasscodeError(true);
                return;
            }
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
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
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$pkQsUE3z-KPoxGfeBmdXAeQeUiY(LoginActivity.LoginActivityRecoverView.this);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static /* synthetic */ void $r8$lambda$pkQsUE3z-KPoxGfeBmdXAeQeUiY(LoginActivityRecoverView loginActivityRecoverView) {
            loginActivityRecoverView.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            loginActivityRecoverView.inboxImageView.playAnimation();
            CodeFieldContainer codeFieldContainer = loginActivityRecoverView.codeFieldContainer;
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
            this.titleTextView.setText(LocaleController.getString(R.string.SetNewPassword));
            addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 8, AndroidUtilities.isSmallScreen() ? 16 : 72, 8, 0));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 16.0f);
            this.confirmTextView.setGravity(1);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 6, 8, 16));
            final int i4 = 0;
            while (i4 < this.codeField.length) {
                final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                this.outlineFields[i4] = outlineTextContainerView;
                if (i == 0) {
                    i2 = i4 == 0 ? R.string.PleaseEnterNewFirstPasswordHint : R.string.PleaseEnterNewSecondPasswordHint;
                } else {
                    i2 = R.string.PasswordHintPlaceholder;
                }
                outlineTextContainerView.setText(LocaleController.getString(i2));
                this.codeField[i4] = new EditTextBoldCursor(context);
                this.codeField[i4].setCursorSize(AndroidUtilities.dp(20.0f));
                this.codeField[i4].setCursorWidth(1.5f);
                this.codeField[i4].setImeOptions(268435461);
                this.codeField[i4].setTextSize(1, f);
                this.codeField[i4].setMaxLines(1);
                this.codeField[i4].setBackground(null);
                int dp = AndroidUtilities.dp(16.0f);
                this.codeField[i4].setPadding(dp, dp, dp, dp);
                if (i == 0) {
                    this.codeField[i4].setInputType(NotificationCenter.messageTranslating);
                    this.codeField[i4].setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                this.codeField[i4].setTypeface(Typeface.DEFAULT);
                this.codeField[i4].setGravity(LocaleController.isRTL ? 5 : 3);
                EditTextBoldCursor editTextBoldCursor = this.codeField[i4];
                final boolean z = i4 == 0 && i == 0;
                editTextBoldCursor.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.LoginActivity.LoginActivityNewPasswordView.1
                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
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
                this.codeField[i4].setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        OutlineTextContainerView.this.animateSelection(r2 ? 1.0f : 0.0f);
                    }
                });
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(16);
                    linearLayout.addView(this.codeField[i4], LayoutHelper.createLinear(0, -2, 1.0f));
                    ImageView imageView = new ImageView(context);
                    this.passwordButton = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    AndroidUtilities.updateViewVisibilityAnimated(this.passwordButton, true, 0.1f, false);
                    this.passwordButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityNewPasswordView.$r8$lambda$XPHXvBBxN0_ooG71Y0YMlszcBlQ(LoginActivity.LoginActivityNewPasswordView.this, view);
                        }
                    });
                    linearLayout.addView(this.passwordButton, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    outlineTextContainerView.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f));
                } else {
                    outlineTextContainerView.addView(this.codeField[i4], LayoutHelper.createFrame(-1, -2.0f));
                }
                outlineTextContainerView.attachEditText(this.codeField[i4]);
                addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2, 1, 16, 16, 16, 0));
                this.codeField[i4].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda4
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView3, int i5, KeyEvent keyEvent) {
                        return LoginActivity.LoginActivityNewPasswordView.$r8$lambda$2r2uKeE5ds9UTbM0EURDPD5TlzM(LoginActivity.LoginActivityNewPasswordView.this, i4, textView3, i5, keyEvent);
                    }
                });
                i4++;
                f = 18.0f;
            }
            if (i == 0) {
                this.confirmTextView.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
            } else {
                this.confirmTextView.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
            }
            TextView textView3 = new TextView(context);
            this.cancelButton = textView3;
            textView3.setGravity(19);
            this.cancelButton.setTextSize(1, 15.0f);
            this.cancelButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.cancelButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.cancelButton.setText(LocaleController.getString(R.string.YourEmailSkip));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(this.cancelButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout, LayoutHelper.createLinear(-1, -1, 80));
            VerticalPositionAutoAnimator.attach(this.cancelButton);
            this.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$8eBmBfeWw1e6ju44Ut7J1ccSFxg(LoginActivity.LoginActivityNewPasswordView.this, view);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$XPHXvBBxN0_ooG71Y0YMlszcBlQ(LoginActivityNewPasswordView loginActivityNewPasswordView, View view) {
            loginActivityNewPasswordView.isPasswordVisible = !loginActivityNewPasswordView.isPasswordVisible;
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = loginActivityNewPasswordView.codeField;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                int selectionStart = editTextBoldCursorArr[i].getSelectionStart();
                int selectionEnd = loginActivityNewPasswordView.codeField[i].getSelectionEnd();
                loginActivityNewPasswordView.codeField[i].setInputType((loginActivityNewPasswordView.isPasswordVisible ? NotificationCenter.filePreparingStarted : 128) | 1);
                loginActivityNewPasswordView.codeField[i].setSelection(selectionStart, selectionEnd);
                i++;
            }
            loginActivityNewPasswordView.passwordButton.setTag(Boolean.valueOf(loginActivityNewPasswordView.isPasswordVisible));
            loginActivityNewPasswordView.passwordButton.setColorFilter(Theme.getColor(loginActivityNewPasswordView.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText));
        }

        public static /* synthetic */ boolean $r8$lambda$2r2uKeE5ds9UTbM0EURDPD5TlzM(LoginActivityNewPasswordView loginActivityNewPasswordView, int i, TextView textView, int i2, KeyEvent keyEvent) {
            if (i == 0) {
                EditTextBoldCursor[] editTextBoldCursorArr = loginActivityNewPasswordView.codeField;
                if (editTextBoldCursorArr.length == 2) {
                    editTextBoldCursorArr[1].requestFocus();
                    return true;
                }
            }
            if (i2 == 5) {
                loginActivityNewPasswordView.onNextPressed(null);
                return true;
            }
            loginActivityNewPasswordView.getClass();
            return false;
        }

        public static /* synthetic */ void $r8$lambda$8eBmBfeWw1e6ju44Ut7J1ccSFxg(LoginActivityNewPasswordView loginActivityNewPasswordView, View view) {
            if (loginActivityNewPasswordView.currentStage == 0) {
                loginActivityNewPasswordView.recoverPassword(null, null);
            } else {
                loginActivityNewPasswordView.recoverPassword(loginActivityNewPasswordView.newPassword, null);
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
            return LocaleController.getString("NewPassword", R.string.NewPassword);
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
        public void onNextPressed(String str) {
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
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$4-MWa4jQ4NR8_4V6vjmE3WyGL5g(LoginActivity.LoginActivityNewPasswordView.this, str, str2, tL_auth_recoverPassword);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$4-MWa4jQ4NR8_4V6vjmE3WyGL5g(final LoginActivityNewPasswordView loginActivityNewPasswordView, final String str, final String str2, TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword) {
            loginActivityNewPasswordView.getClass();
            byte[] stringBytes = str != null ? AndroidUtilities.getStringBytes(str) : null;
            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$L6rgYxDNLk2Sl6TTubKNFKMdUo8(LoginActivity.LoginActivityNewPasswordView.this, str, str2, tLObject, tL_error);
                }
            };
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = loginActivityNewPasswordView.currentPassword.new_algo;
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

        public static /* synthetic */ void $r8$lambda$L6rgYxDNLk2Sl6TTubKNFKMdUo8(final LoginActivityNewPasswordView loginActivityNewPasswordView, final String str, final String str2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityNewPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$3P9NG-SFXdTu5ZTNLliyNE85tDI(LoginActivity.LoginActivityNewPasswordView.this, tL_error, str, str2, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$3P9NG-SFXdTu5ZTNLliyNE85tDI(final LoginActivityNewPasswordView loginActivityNewPasswordView, TLRPC.TL_error tL_error, final String str, final String str2, final TLObject tLObject) {
            String formatPluralString;
            if (tL_error != null) {
                loginActivityNewPasswordView.getClass();
                if ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda8
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            LoginActivity.LoginActivityNewPasswordView.$r8$lambda$jJCIuh8Vgot_1oWZeGoaiqiQA60(LoginActivity.LoginActivityNewPasswordView.this, str, str2, tLObject2, tL_error2);
                        }
                    }, 8);
                    return;
                }
            }
            LoginActivity.this.needHideProgress(false);
            if (tLObject instanceof TLRPC.auth_Authorization) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda9
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
                    }
                });
                if (TextUtils.isEmpty(str)) {
                    builder.setMessage(LocaleController.getString(R.string.YourPasswordReset));
                } else {
                    builder.setMessage(LocaleController.getString(R.string.YourPasswordChangedSuccessText));
                }
                builder.setTitle(LocaleController.getString(R.string.TwoStepVerificationTitle));
                Dialog showDialog = LoginActivity.this.showDialog(builder.create());
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            }
            if (tL_error != null) {
                loginActivityNewPasswordView.nextPressed = false;
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                }
                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (intValue < 60) {
                    formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                }
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
            }
        }

        public static /* synthetic */ void $r8$lambda$jJCIuh8Vgot_1oWZeGoaiqiQA60(final LoginActivityNewPasswordView loginActivityNewPasswordView, final String str, final String str2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityNewPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$SKzM07cQej449NtO9wXpvFE1bCQ(LoginActivity.LoginActivityNewPasswordView.this, tL_error, tLObject, str, str2);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$SKzM07cQej449NtO9wXpvFE1bCQ(LoginActivityNewPasswordView loginActivityNewPasswordView, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
            loginActivityNewPasswordView.getClass();
            if (tL_error == null) {
                TL_account.Password password = (TL_account.Password) tLObject;
                loginActivityNewPasswordView.currentPassword = password;
                TwoStepVerificationActivity.initPasswordNewAlgo(password);
                loginActivityNewPasswordView.recoverPassword(str, str2);
            }
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
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$NND6V5VLrRxWRCOJ0SK1TJKFz7g(LoginActivity.LoginActivityNewPasswordView.this);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static /* synthetic */ void $r8$lambda$NND6V5VLrRxWRCOJ0SK1TJKFz7g(LoginActivityNewPasswordView loginActivityNewPasswordView) {
            EditTextBoldCursor[] editTextBoldCursorArr = loginActivityNewPasswordView.codeField;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                EditTextBoldCursor editTextBoldCursor = loginActivityNewPasswordView.codeField[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                AndroidUtilities.showKeyboard(loginActivityNewPasswordView.codeField[0]);
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
            builder.setTitle(LocaleController.getString("TermsOfService", R.string.TermsOfService));
            if (z) {
                builder.setPositiveButton(LocaleController.getString("Accept", R.string.Accept), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda10
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivityRegisterView.$r8$lambda$rIcdV2sR8XWBUwPip_f0z7dIk6o(LoginActivity.LoginActivityRegisterView.this, alertDialog, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Decline", R.string.Decline), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda11
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivityRegisterView.$r8$lambda$AFO6k8IADV71mlR2RwCY0fbq_dU(LoginActivity.LoginActivityRegisterView.this, alertDialog, i);
                    }
                });
            } else {
                builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LoginActivity.this.currentTermsOfService.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, LoginActivity.this.currentTermsOfService.entities, false, false, false, false);
            builder.setMessage(spannableStringBuilder);
            LoginActivity.this.showDialog(builder.create());
        }

        public static /* synthetic */ void $r8$lambda$rIcdV2sR8XWBUwPip_f0z7dIk6o(LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            LoginActivity.this.currentTermsOfService.popup = false;
            loginActivityRegisterView.onNextPressed(null);
        }

        public static /* synthetic */ void $r8$lambda$AFO6k8IADV71mlR2RwCY0fbq_dU(final LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("TermsOfService", R.string.TermsOfService));
            builder.setMessage(LocaleController.getString("TosDecline", R.string.TosDecline));
            builder.setPositiveButton(LocaleController.getString("SignUp", R.string.SignUp), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda15
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$8cdFNTt4qn_ULPTp4GnEAYgiW9w(LoginActivity.LoginActivityRegisterView.this, alertDialog2, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Decline", R.string.Decline), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda16
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$1KtzzPDE6V09fl6JdbRSlQIeZ0c(LoginActivity.LoginActivityRegisterView.this, alertDialog2, i2);
                }
            });
            LoginActivity.this.showDialog(builder.create());
        }

        public static /* synthetic */ void $r8$lambda$8cdFNTt4qn_ULPTp4GnEAYgiW9w(LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            LoginActivity.this.currentTermsOfService.popup = false;
            loginActivityRegisterView.onNextPressed(null);
        }

        public static /* synthetic */ void $r8$lambda$1KtzzPDE6V09fl6JdbRSlQIeZ0c(LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            loginActivityRegisterView.onBackPressed(true);
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
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$JN6oYOQBmfyOTr0Kpi0h0xBSj2E(LoginActivity.LoginActivityRegisterView.this, view2);
                }
            });
            int i = R.raw.camera;
            this.cameraDrawable = new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
            int i2 = R.raw.camera_wait;
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
            textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
            this.titleTextView.setTextSize(1, 18.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.titleTextView.setGravity(1);
            addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 12, 8, 0));
            TextView textView2 = new TextView(context);
            this.descriptionTextView = textView2;
            textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
            this.descriptionTextView.setGravity(1);
            this.descriptionTextView.setTextSize(1, 14.0f);
            this.descriptionTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.descriptionTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 6, 8, 0));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.editTextContainer = frameLayout2;
            addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 8.0f, 21.0f, 8.0f, 0.0f));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
            this.firstNameOutlineView = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(R.string.FirstName));
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
                    LoginActivity.LoginActivityRegisterView.this.firstNameOutlineView.animateSelection(r2 ? 1.0f : 0.0f);
                }
            });
            this.firstNameField.setBackground(null);
            this.firstNameField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.firstNameOutlineView.attachEditText(this.firstNameField);
            this.firstNameOutlineView.addView(this.firstNameField, LayoutHelper.createFrame(-1, -2, 48));
            this.firstNameField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda4
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i3, KeyEvent keyEvent) {
                    return LoginActivity.LoginActivityRegisterView.$r8$lambda$U_jebr_R60OuGoYvYnIyPDnBkiU(LoginActivity.LoginActivityRegisterView.this, textView3, i3, keyEvent);
                }
            });
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.lastNameOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.setText(LocaleController.getString(R.string.LastName));
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
                    LoginActivity.LoginActivityRegisterView.this.lastNameOutlineView.animateSelection(r2 ? 1.0f : 0.0f);
                }
            });
            this.lastNameField.setBackground(null);
            this.lastNameField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.lastNameOutlineView.attachEditText(this.lastNameField);
            this.lastNameOutlineView.addView(this.lastNameField, LayoutHelper.createFrame(-1, -2, 48));
            this.lastNameField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda6
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i3, KeyEvent keyEvent) {
                    return LoginActivity.LoginActivityRegisterView.$r8$lambda$hUxQIPwUaurUw__ZhHNkOa40gP4(LoginActivity.LoginActivityRegisterView.this, textView3, i3, keyEvent);
                }
            });
            buildEditTextLayout(AndroidUtilities.isSmallScreen());
            TextView textView3 = new TextView(context);
            this.wrongNumber = textView3;
            textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
            this.wrongNumber.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
            this.wrongNumber.setTextSize(1, 14.0f);
            this.wrongNumber.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.wrongNumber.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
            this.wrongNumber.setVisibility(8);
            addView(this.wrongNumber, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
            this.wrongNumber.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$lsBucEdxDwwqbibchKTjHHXvcME(LoginActivity.LoginActivityRegisterView.this, view2);
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
            String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
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

        public static /* synthetic */ void $r8$lambda$JN6oYOQBmfyOTr0Kpi0h0xBSj2E(final LoginActivityRegisterView loginActivityRegisterView, View view) {
            loginActivityRegisterView.imageUpdater.openMenu(loginActivityRegisterView.avatar != null, new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$3cVfhXTcft5V_hjS5aoK0etI6Bw(LoginActivity.LoginActivityRegisterView.this);
                }
            }, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda13
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$0PV0KcMOQy5Ccli0wGgZrzfjUEY(LoginActivity.LoginActivityRegisterView.this, dialogInterface);
                }
            }, 0);
            loginActivityRegisterView.isCameraWaitAnimationAllowed = false;
            loginActivityRegisterView.avatarEditor.setAnimation(loginActivityRegisterView.cameraDrawable);
            loginActivityRegisterView.cameraDrawable.setCurrentFrame(0);
            loginActivityRegisterView.cameraDrawable.setCustomEndFrame(43);
            loginActivityRegisterView.avatarEditor.playAnimation();
        }

        public static /* synthetic */ void $r8$lambda$3cVfhXTcft5V_hjS5aoK0etI6Bw(LoginActivityRegisterView loginActivityRegisterView) {
            loginActivityRegisterView.avatar = null;
            loginActivityRegisterView.avatarBig = null;
            loginActivityRegisterView.showAvatarProgress(false, true);
            loginActivityRegisterView.avatarImage.setImage((ImageLocation) null, (String) null, loginActivityRegisterView.avatarDrawable, (Object) null);
            loginActivityRegisterView.avatarEditor.setAnimation(loginActivityRegisterView.cameraDrawable);
            loginActivityRegisterView.cameraDrawable.setCurrentFrame(0);
            loginActivityRegisterView.isCameraWaitAnimationAllowed = true;
        }

        public static /* synthetic */ void $r8$lambda$0PV0KcMOQy5Ccli0wGgZrzfjUEY(final LoginActivityRegisterView loginActivityRegisterView, DialogInterface dialogInterface) {
            if (!loginActivityRegisterView.imageUpdater.isUploadingImage()) {
                loginActivityRegisterView.avatarEditor.setAnimation(loginActivityRegisterView.cameraDrawable);
                loginActivityRegisterView.cameraDrawable.setCustomEndFrame(86);
                loginActivityRegisterView.avatarEditor.setOnAnimationEndListener(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityRegisterView.this.isCameraWaitAnimationAllowed = true;
                    }
                });
                loginActivityRegisterView.avatarEditor.playAnimation();
                return;
            }
            loginActivityRegisterView.avatarEditor.setAnimation(loginActivityRegisterView.cameraDrawable);
            loginActivityRegisterView.cameraDrawable.setCurrentFrame(0, false);
            loginActivityRegisterView.isCameraWaitAnimationAllowed = true;
        }

        class 4 implements View.OnAttachStateChangeListener {
            private boolean isAttached;
            final /* synthetic */ LoginActivity val$this$0;
            private long lastRun = System.currentTimeMillis();
            private Runnable cameraWaitCallback = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.4.$r8$lambda$0a3Aws-JnQVHnFW_I-6UJarLsvE(LoginActivity.LoginActivityRegisterView.4.this);
                }
            };

            4(LoginActivity loginActivity) {
                this.val$this$0 = loginActivity;
            }

            public static /* synthetic */ void $r8$lambda$0a3Aws-JnQVHnFW_I-6UJarLsvE(final 4 r5) {
                if (r5.isAttached) {
                    if (LoginActivityRegisterView.this.isCameraWaitAnimationAllowed && System.currentTimeMillis() - r5.lastRun >= 10000) {
                        LoginActivityRegisterView.this.avatarEditor.setAnimation(LoginActivityRegisterView.this.cameraWaitDrawable);
                        LoginActivityRegisterView.this.cameraWaitDrawable.setCurrentFrame(0, false);
                        LoginActivityRegisterView.this.cameraWaitDrawable.setOnAnimationEndListener(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                LoginActivity.LoginActivityRegisterView.4.$r8$lambda$GcjdM1Z5Y9BIBYAhou2iaI_yBLM(LoginActivity.LoginActivityRegisterView.4.this);
                            }
                        });
                        LoginActivityRegisterView.this.avatarEditor.playAnimation();
                        r5.lastRun = System.currentTimeMillis();
                    }
                    LoginActivityRegisterView.this.avatarEditor.postDelayed(r5.cameraWaitCallback, 1000L);
                }
            }

            public static /* synthetic */ void $r8$lambda$GcjdM1Z5Y9BIBYAhou2iaI_yBLM(final 4 r1) {
                r1.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginActivityRegisterView.4.$r8$lambda$HT68tKDpqtoKglxvwdcla2X7TkI(LoginActivity.LoginActivityRegisterView.4.this);
                    }
                });
            }

            public static /* synthetic */ void $r8$lambda$HT68tKDpqtoKglxvwdcla2X7TkI(4 r2) {
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

        public static /* synthetic */ boolean $r8$lambda$U_jebr_R60OuGoYvYnIyPDnBkiU(LoginActivityRegisterView loginActivityRegisterView, TextView textView, int i, KeyEvent keyEvent) {
            if (i == 5) {
                loginActivityRegisterView.lastNameField.requestFocus();
                return true;
            }
            loginActivityRegisterView.getClass();
            return false;
        }

        public static /* synthetic */ boolean $r8$lambda$hUxQIPwUaurUw__ZhHNkOa40gP4(LoginActivityRegisterView loginActivityRegisterView, TextView textView, int i, KeyEvent keyEvent) {
            loginActivityRegisterView.getClass();
            if (i != 6 && i != 5) {
                return false;
            }
            loginActivityRegisterView.onNextPressed(null);
            return true;
        }

        public static /* synthetic */ void $r8$lambda$lsBucEdxDwwqbibchKTjHHXvcME(LoginActivityRegisterView loginActivityRegisterView, View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            loginActivityRegisterView.onBackPressed(false);
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
                this.firstNameOutlineView.setText(LocaleController.getString(R.string.FirstNameSmall));
                this.lastNameOutlineView.setText(LocaleController.getString(R.string.LastNameSmall));
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
            this.firstNameOutlineView.setText(LocaleController.getString(R.string.FirstName));
            this.lastNameOutlineView.setText(LocaleController.getString(R.string.LastName));
            this.editTextContainer.addView(this.firstNameOutlineView, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            this.editTextContainer.addView(this.lastNameOutlineView, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$XA9NKZ7TLE8JjcyDyncZ-fxDxZQ(LoginActivity.LoginActivityRegisterView.this, photoSize2, photoSize);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$XA9NKZ7TLE8JjcyDyncZ-fxDxZQ(LoginActivityRegisterView loginActivityRegisterView, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
            loginActivityRegisterView.getClass();
            TLRPC.FileLocation fileLocation = photoSize.location;
            loginActivityRegisterView.avatar = fileLocation;
            loginActivityRegisterView.avatarBig = photoSize2.location;
            loginActivityRegisterView.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", loginActivityRegisterView.avatarDrawable, (Object) null);
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
            if (z2) {
                this.avatarAnimation = new AnimatorSet();
                Property property = View.ALPHA;
                if (z) {
                    this.avatarProgressView.setVisibility(0);
                    this.avatarAnimation.playTogether(ObjectAnimator.ofFloat(this.avatarEditor, (Property<RLottieImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property, 1.0f));
                } else {
                    this.avatarEditor.setVisibility(0);
                    this.avatarAnimation.playTogether(ObjectAnimator.ofFloat(this.avatarEditor, (Property<RLottieImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property, 0.0f));
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
                return;
            }
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
            builder.setTitle(LocaleController.getString(R.string.Warning));
            builder.setMessage(LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration));
            builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$3Ebd-dTRnTGzZr18N0B6vtGw8aQ(LoginActivity.LoginActivityRegisterView.this, alertDialog, i);
                }
            });
            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
            LoginActivity.this.showDialog(builder.create());
            return false;
        }

        public static /* synthetic */ void $r8$lambda$3Ebd-dTRnTGzZr18N0B6vtGw8aQ(LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            loginActivityRegisterView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            loginActivityRegisterView.hidePrivacyView();
        }

        @Override // org.telegram.ui.Components.SlideView
        public String getHeaderName() {
            return LocaleController.getString("YourName", R.string.YourName);
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
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$bok-g0yscbshxMDA0fca4xD_1Rs(LoginActivity.LoginActivityRegisterView.this);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static /* synthetic */ void $r8$lambda$bok-g0yscbshxMDA0fca4xD_1Rs(LoginActivityRegisterView loginActivityRegisterView) {
            EditTextBoldCursor editTextBoldCursor = loginActivityRegisterView.firstNameField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = loginActivityRegisterView.firstNameField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(loginActivityRegisterView.firstNameField);
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
        public void onNextPressed(String str) {
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
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$twzdupSaqt6lpKt9SSQmsjI9Va4(LoginActivity.LoginActivityRegisterView.this, tLObject, tL_error);
                }
            }, 10);
        }

        public static /* synthetic */ void $r8$lambda$twzdupSaqt6lpKt9SSQmsjI9Va4(final LoginActivityRegisterView loginActivityRegisterView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityRegisterView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$_JdSnufHokzgGzvUOOWRIU2TeMw(LoginActivity.LoginActivityRegisterView.this, tLObject, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$_JdSnufHokzgGzvUOOWRIU2TeMw(final LoginActivityRegisterView loginActivityRegisterView, final TLObject tLObject, TLRPC.TL_error tL_error) {
            loginActivityRegisterView.nextPressed = false;
            if (!(tLObject instanceof TLRPC.TL_auth_authorization)) {
                LoginActivity.this.needHideProgress(false);
                if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    loginActivityRegisterView.onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    return;
                } else if (tL_error.text.contains("FIRSTNAME_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                    return;
                } else if (tL_error.text.contains("LASTNAME_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                    return;
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                }
            }
            loginActivityRegisterView.hidePrivacyView();
            LoginActivity.this.showDoneButton(false, true);
            loginActivityRegisterView.postDelayed(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$sGqWlHBixjzE_hsNrx0qI0AvXJM(LoginActivity.LoginActivityRegisterView.this, tLObject);
                }
            }, 150L);
        }

        public static /* synthetic */ void $r8$lambda$sGqWlHBixjzE_hsNrx0qI0AvXJM(final LoginActivityRegisterView loginActivityRegisterView, TLObject tLObject) {
            LoginActivity.this.needHideProgress(false, false);
            AndroidUtilities.hideKeyboard(LoginActivity.this.fragmentView.findFocus());
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject, true);
            final TLRPC.FileLocation fileLocation = loginActivityRegisterView.avatarBig;
            if (fileLocation != null) {
                Utilities.cacheClearQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda19
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessagesController.getInstance(((BaseFragment) LoginActivity.this).currentAccount).uploadAndApplyUserAvatar(fileLocation);
                    }
                });
            }
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
        final int width2 = (((getParentLayout().getView().getWidth() - this.floatingButtonIcon.getLayoutParams().width) - AndroidUtilities.dp(20.0f)) - getParentLayout().getView().getPaddingLeft()) - getParentLayout().getView().getPaddingRight();
        final int height2 = ((((getParentLayout().getView().getHeight() - this.floatingButtonIcon.getLayoutParams().height) - AndroidUtilities.dp(14.0f)) - (isCustomKeyboardVisible() ? AndroidUtilities.dp(230.0f) : 0)) - getParentLayout().getView().getPaddingTop()) - getParentLayout().getView().getPaddingBottom();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.11
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                LoginActivity.this.floatingButton.setButtonVisible(false, false);
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
                LoginActivity.this.floatingButton.setButtonVisible(true, false);
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
                LoginActivity.$r8$lambda$5NKu5w8b_S9mhNYgHE3jAyCs3P8(LoginActivity.this, color, alpha, layoutParams, width, i, height, transformableLoginButtonView, f, width2, f2, height2, valueAnimator);
            }
        });
        ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ofFloat);
        animatorSet.start();
        return animatorSet;
    }

    public static /* synthetic */ void $r8$lambda$5NKu5w8b_S9mhNYgHE3jAyCs3P8(LoginActivity loginActivity, int i, int i2, ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4, int i5, TransformableLoginButtonView transformableLoginButtonView, float f, int i6, float f2, int i7, ValueAnimator valueAnimator) {
        loginActivity.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        loginActivity.keyboardLinearLayout.setAlpha(floatValue);
        loginActivity.fragmentView.setBackgroundColor(ColorUtils.setAlphaComponent(i, (int) (i2 * floatValue)));
        float f3 = 1.0f - floatValue;
        loginActivity.slideViewsContainer.setTranslationY(AndroidUtilities.dp(20.0f) * f3);
        if (!loginActivity.isCustomKeyboardForceDisabled()) {
            loginActivity.keyboardView.setTranslationY(r4.getLayoutParams().height * f3);
            loginActivity.floatingButton.setTranslationY(loginActivity.keyboardView.getLayoutParams().height * f3);
        }
        loginActivity.introView.setTranslationY((-AndroidUtilities.dp(20.0f)) * floatValue);
        float f4 = (f3 * 0.05f) + 0.95f;
        loginActivity.introView.setScaleX(f4);
        loginActivity.introView.setScaleY(f4);
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
        ImageView imageView = this.backButtonView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        imageView.setColorFilter(Theme.getColor(i));
        ImageView imageView2 = this.backButtonView;
        int i2 = Theme.key_listSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i2)));
        this.proxyDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.SRC_IN));
        this.proxyButtonView.setBackground(Theme.createSelectorDrawable(Theme.getColor(i2)));
        RadialProgressView radialProgressView = this.radialProgressView;
        int i3 = Theme.key_chats_actionBackground;
        radialProgressView.setProgressColor(Theme.getColor(i3));
        this.floatingButton.updateColors();
        this.floatingButtonIcon.setColor(Theme.getColor(Theme.key_chats_actionIcon));
        this.floatingButtonIcon.setBackgroundColor(Theme.getColor(i3));
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
        builder.setMessage(LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText));
        builder.setTitle(LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning));
        builder.setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda39
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                LoginActivity.$r8$lambda$TXfKC0d7XHZpXoIx2B_fXR678Vs(LoginActivity.this, str, str2, str3, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showDialog(builder.create());
    }

    public static /* synthetic */ void $r8$lambda$TXfKC0d7XHZpXoIx2B_fXR678Vs(final LoginActivity loginActivity, final String str, final String str2, final String str3, AlertDialog alertDialog, int i) {
        loginActivity.needShowProgress(0);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(loginActivity.currentAccount).sendRequest(deleteaccount, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda40
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LoginActivity.$r8$lambda$zTSN9LkZ4aREZHHefveI1ruVHVc(LoginActivity.this, str, str2, str3, tLObject, tL_error);
            }
        }, 10);
    }

    public static /* synthetic */ void $r8$lambda$zTSN9LkZ4aREZHHefveI1ruVHVc(final LoginActivity loginActivity, final String str, final String str2, final String str3, TLObject tLObject, final TLRPC.TL_error tL_error) {
        loginActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                LoginActivity.$r8$lambda$M_6asKFL6VqfPfwtYO2cr28szrA(LoginActivity.this, tL_error, str, str2, str3);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$M_6asKFL6VqfPfwtYO2cr28szrA(LoginActivity loginActivity, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        loginActivity.needHideProgress(false);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                loginActivity.setPage(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            loginActivity.setPage(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            return;
        }
        if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(loginActivity.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            loginActivity.setPage(8, true, bundle2, false);
            return;
        }
        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
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
        private FragmentFloatingButton fabButton;
        private View fabContainer;
        private TransformableLoginButtonView fabTransform;
        private ViewGroup fragmentView;
        private TextView numberView;
        private final PointF pointF;
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
            this.pointF = new PointF();
            this.fragmentView = viewGroup;
            this.fabContainer = view;
            this.callback = iConfirmDialogCallback;
            View view2 = new View(getContext());
            this.blurredView = view2;
            view2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    LoginActivity.PhoneNumberConfirmView.this.dismiss();
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
            FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, null);
            this.fabButton = fragmentFloatingButton;
            fragmentFloatingButton.addView(this.fabTransform, LayoutHelper.createFrame(56, 56, 17));
            this.fabButton.addAdditionalView(this.fabTransform);
            this.fabButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    iConfirmDialogCallback.onFabPressed(r0, LoginActivity.PhoneNumberConfirmView.this.fabTransform);
                }
            });
            this.fabButton.setContentDescription(LocaleController.getString(R.string.Done));
            addView(this.fabButton, LayoutHelper.createFrame(56, 56, 51));
            FrameLayout frameLayout = new FrameLayout(context);
            this.popupLayout = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
            TextView textView = new TextView(context);
            this.confirmMessageView = textView;
            textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
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
            textView3.setText(LocaleController.getString(R.string.Edit));
            this.editTextView.setSingleLine();
            this.editTextView.setTextSize(1, 16.0f);
            TextView textView4 = this.editTextView;
            int dp2 = AndroidUtilities.dp(6.0f);
            int i = Theme.key_changephoneinfo_image2;
            textView4.setBackground(Theme.getRoundRectSelectorDrawable(dp2, Theme.getColor(i)));
            this.editTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    iConfirmDialogCallback.onEditPressed(r0, LoginActivity.PhoneNumberConfirmView.this.editTextView);
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
            textView6.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
            this.confirmTextView.setSingleLine();
            this.confirmTextView.setTextSize(1, 16.0f);
            this.confirmTextView.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(i)));
            this.confirmTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    iConfirmDialogCallback.onConfirmPressed(r0, LoginActivity.PhoneNumberConfirmView.this.confirmTextView);
                }
            });
            this.confirmTextView.setTypeface(typeface);
            this.confirmTextView.setPadding(dp, i2, dp, i2);
            this.popupLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f, f, f, f));
            updateFabPosition();
            updateColors();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateFabPosition() {
            ViewPositionWatcher.computeCoordinatesInParent(this.fabContainer, this.fragmentView, this.pointF);
            this.fabButton.setTranslationX(this.pointF.x);
            this.fabButton.setTranslationY(this.pointF.y);
            requestLayout();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateColors() {
            this.fabTransform.setColor(Theme.getColor(Theme.key_chats_actionIcon));
            this.fabTransform.setBackgroundColor(Theme.getColor(Theme.key_chats_actionBackground));
            this.popupLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(Theme.key_dialogBackground)));
            this.confirmMessageView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2));
            this.numberView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            TextView textView = this.editTextView;
            int i = Theme.key_changephoneinfo_image2;
            textView.setTextColor(Theme.getColor(i));
            this.confirmTextView.setTextColor(Theme.getColor(i));
            this.fabButton.updateColors();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int measuredHeight = this.popupLayout.getMeasuredHeight();
            int translationY = (int) (this.fabButton.getTranslationY() - AndroidUtilities.dp(32.0f));
            FrameLayout frameLayout = this.popupLayout;
            frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, this.popupLayout.getRight(), translationY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void show() {
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
                        PhoneNumberConfirmView.this.fabButton.requestFocus();
                    }
                }
            });
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.PhoneNumberConfirmView.$r8$lambda$8lSEz0M3g7XU2ApnlPokJF8sTGs(LoginActivity.PhoneNumberConfirmView.this, valueAnimator);
                }
            });
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.start();
        }

        public static /* synthetic */ void $r8$lambda$8lSEz0M3g7XU2ApnlPokJF8sTGs(PhoneNumberConfirmView phoneNumberConfirmView, ValueAnimator valueAnimator) {
            phoneNumberConfirmView.getClass();
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            phoneNumberConfirmView.fabTransform.setProgress(floatValue);
            phoneNumberConfirmView.blurredView.setAlpha(floatValue);
            phoneNumberConfirmView.dimmView.setAlpha(floatValue);
            phoneNumberConfirmView.popupLayout.setAlpha(floatValue);
            float f = (floatValue * 0.5f) + 0.5f;
            phoneNumberConfirmView.popupLayout.setScaleX(f);
            phoneNumberConfirmView.popupLayout.setScaleY(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void animateProgress(Runnable runnable) {
            this.fabButton.setProgressVisible(true, true);
            AndroidUtilities.runOnUIThread(runnable, 400L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dismiss() {
            if (this.dismissed) {
                return;
            }
            this.dismissed = true;
            this.callback.onDismiss(this);
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
            duration.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LoginActivity.PhoneNumberConfirmView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (PhoneNumberConfirmView.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) PhoneNumberConfirmView.this.getParent()).removeView(PhoneNumberConfirmView.this);
                    }
                    PhoneNumberConfirmView.this.fabContainer.setVisibility(0);
                }
            });
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.PhoneNumberConfirmView.$r8$lambda$DIH_br9JtU29eA9JyAntMpZhCNc(LoginActivity.PhoneNumberConfirmView.this, valueAnimator);
                }
            });
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.start();
        }

        public static /* synthetic */ void $r8$lambda$DIH_br9JtU29eA9JyAntMpZhCNc(PhoneNumberConfirmView phoneNumberConfirmView, ValueAnimator valueAnimator) {
            phoneNumberConfirmView.getClass();
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            phoneNumberConfirmView.blurredView.setAlpha(floatValue);
            phoneNumberConfirmView.dimmView.setAlpha(floatValue);
            phoneNumberConfirmView.fabTransform.setProgress(floatValue);
            phoneNumberConfirmView.popupLayout.setAlpha(floatValue);
            float f = (floatValue * 0.5f) + 0.5f;
            phoneNumberConfirmView.popupLayout.setScaleX(f);
            phoneNumberConfirmView.popupLayout.setScaleY(f);
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
                LoginActivity.$r8$lambda$BBOPR-vYSPl-mIXRXGbVF55jGUk(LoginActivity.this);
            }
        };
        this.showProxyButtonDelayed = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 5000L);
    }

    public static /* synthetic */ void $r8$lambda$BBOPR-vYSPl-mIXRXGbVF55jGUk(LoginActivity loginActivity) {
        loginActivity.proxyButtonVisible = false;
        loginActivity.showProxyButton(true, true);
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
                    LoginActivity.$r8$lambda$q05MnCIKrdA-uMUWjyHtYYpC-wM(LoginActivity.this, z);
                }
            }).start();
        } else {
            this.proxyButtonView.setVisibility(z ? 0 : 8);
            this.proxyButtonView.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public static /* synthetic */ void $r8$lambda$q05MnCIKrdA-uMUWjyHtYYpC-wM(LoginActivity loginActivity, boolean z) {
        if (z) {
            loginActivity.getClass();
        } else {
            loginActivity.proxyButtonView.setVisibility(8);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didUpdateConnectionState) {
            updateProxyButton(true, false);
        } else if (i == NotificationCenter.newSuggestionsAvailable && this.emailChangeIsSuggestion && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
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

        /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x030e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0311  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x02bc  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
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
                    LoginActivity.LoginActivityPhraseView.this.checkPaste(true);
                }
            };
            this.dismissField = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.this.animateError(false);
                }
            };
            this.shiftDp = -3.0f;
            this.currentType = i;
            boolean z2 = i != 16;
            setOrientation(1);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.setAnimation(R.raw.bubble, 95, 95);
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
                    textView.setText(LocaleController.getString(z2 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
                    addView(textView, LayoutHelper.createLinear(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
                    TextView textView2 = new TextView(context);
                    this.confirmTextView = textView2;
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 8, 5, 8, 16));
                    OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                    this.outlineField = outlineTextContainerView;
                    outlineTextContainerView.setText(LocaleController.getString(z2 ? R.string.SMSWord : R.string.SMSPhrase));
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
                    r11.setHint(LocaleController.getString(z2 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
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
                            LoginActivity.LoginActivityPhraseView.this.outlineField.animateSelection(r2 ? 1.0f : 0.0f);
                        }
                    });
                    TextView textView3 = new TextView(context);
                    this.pasteTextView = textView3;
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setText(LocaleController.getString(R.string.Paste));
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
                            LoginActivity.LoginActivityPhraseView.$r8$lambda$IDJ9sYwXGDNEBSdkcAbYamnDKyc(LoginActivity.LoginActivityPhraseView.this, view);
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
                            return LoginActivity.LoginActivityPhraseView.$r8$lambda$wbKra1xwGJZaemJlIn9C2xH249Q(LoginActivity.LoginActivityPhraseView.this, textView4, i2, keyEvent);
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
                            LoginActivity.LoginActivityPhraseView.this.onBackPressed(true);
                        }
                    });
                    addView(loadingTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
                    loadingTextView.setVisibility(8);
                    TextView textView4 = new TextView(context);
                    this.errorTextView = textView4;
                    textView4.setPivotX(0.0f);
                    textView4.setPivotY(0.0f);
                    textView4.setText(LocaleController.getString(z2 ? R.string.SMSWordError : R.string.SMSPhraseError));
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
                    textView5.setText(LocaleController.getString(z2 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
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
                            if (getVisibility() == 0) {
                                return LoginActivityPhraseView.this.time <= 0 || LoginActivityPhraseView.this.timeTimer == null;
                            }
                            return false;
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
                            LoginActivity.LoginActivityPhraseView.$r8$lambda$c2F4HEjKzlNpbO7OTB1OkdvMQEw(LoginActivity.LoginActivityPhraseView.this, view);
                        }
                    });
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.addView(loadingTextView2, LayoutHelper.createFrame(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
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
            textView6.setText(LocaleController.getString(z2 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
            addView(textView6, LayoutHelper.createLinear(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
            TextView textView22 = new TextView(context);
            this.confirmTextView = textView22;
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(1);
            textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView22, LayoutHelper.createLinear(-2, -2, 1, 8, 5, 8, 16));
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.outlineField = outlineTextContainerView2;
            outlineTextContainerView2.setText(LocaleController.getString(z2 ? R.string.SMSWord : R.string.SMSPhrase));
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
            r112.setHint(LocaleController.getString(z2 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
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
                    LoginActivity.LoginActivityPhraseView.this.outlineField.animateSelection(r2 ? 1.0f : 0.0f);
                }
            });
            TextView textView32 = new TextView(context);
            this.pasteTextView = textView32;
            textView32.setTextSize(1, 12.0f);
            textView32.setTypeface(AndroidUtilities.bold());
            textView32.setText(LocaleController.getString(R.string.Paste));
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
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$IDJ9sYwXGDNEBSdkcAbYamnDKyc(LoginActivity.LoginActivityPhraseView.this, view);
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
                    return LoginActivity.LoginActivityPhraseView.$r8$lambda$wbKra1xwGJZaemJlIn9C2xH249Q(LoginActivity.LoginActivityPhraseView.this, textView42, i22, keyEvent);
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
                    LoginActivity.LoginActivityPhraseView.this.onBackPressed(true);
                }
            });
            addView(loadingTextView3, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
            loadingTextView3.setVisibility(8);
            TextView textView42 = new TextView(context);
            this.errorTextView = textView42;
            textView42.setPivotX(0.0f);
            textView42.setPivotY(0.0f);
            textView42.setText(LocaleController.getString(z2 ? R.string.SMSWordError : R.string.SMSPhraseError));
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
            textView52.setText(LocaleController.getString(z2 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
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
                    if (getVisibility() == 0) {
                        return LoginActivityPhraseView.this.time <= 0 || LoginActivityPhraseView.this.timeTimer == null;
                    }
                    return false;
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
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$c2F4HEjKzlNpbO7OTB1OkdvMQEw(LoginActivity.LoginActivityPhraseView.this, view);
                }
            });
            FrameLayout frameLayout22 = new FrameLayout(context);
            frameLayout22.addView(loadingTextView22, LayoutHelper.createFrame(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
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
                            LoginActivity.LoginActivityPhraseView.this.pasting = false;
                        }
                    }, 1000L);
                }
                return super.onTextContextMenuItem(i);
            }
        }

        public static /* synthetic */ void $r8$lambda$IDJ9sYwXGDNEBSdkcAbYamnDKyc(LoginActivityPhraseView loginActivityPhraseView, View view) {
            CharSequence charSequence;
            try {
                charSequence = ((ClipboardManager) loginActivityPhraseView.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(loginActivityPhraseView.getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequence = null;
            }
            if (charSequence != null) {
                Editable text = loginActivityPhraseView.codeField.getText();
                loginActivityPhraseView.pasted = true;
                loginActivityPhraseView.pasting = true;
                if (text != null) {
                    int max = Math.max(0, loginActivityPhraseView.codeField.getSelectionStart());
                    text.replace(max, Math.max(max, loginActivityPhraseView.codeField.getSelectionEnd()), charSequence);
                }
                loginActivityPhraseView.pasting = false;
            }
            loginActivityPhraseView.checkPaste(true);
        }

        public static /* synthetic */ boolean $r8$lambda$wbKra1xwGJZaemJlIn9C2xH249Q(LoginActivityPhraseView loginActivityPhraseView, TextView textView, int i, KeyEvent keyEvent) {
            if (i == 5) {
                loginActivityPhraseView.onNextPressed(null);
                return true;
            }
            loginActivityPhraseView.getClass();
            return false;
        }

        public static /* synthetic */ void $r8$lambda$c2F4HEjKzlNpbO7OTB1OkdvMQEw(final LoginActivityPhraseView loginActivityPhraseView, View view) {
            TLRPC.TL_auth_sentCode tL_auth_sentCode;
            if (loginActivityPhraseView.time <= 0 || loginActivityPhraseView.timeTimer == null) {
                Bundle bundle = loginActivityPhraseView.nextCodeParams;
                if (bundle != null && (tL_auth_sentCode = loginActivityPhraseView.nextCodeAuth) != null) {
                    LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
                    return;
                }
                int i = loginActivityPhraseView.nextType;
                if (i != 4 && i != 2 && i != 11 && i != 15) {
                    if (i == 3) {
                        AndroidUtilities.setWaitingForSms(false);
                        loginActivityPhraseView.waitingForEvent = false;
                        loginActivityPhraseView.resendCode();
                        return;
                    }
                    return;
                }
                loginActivityPhraseView.isResendingCode = true;
                loginActivityPhraseView.timeText.invalidate();
                loginActivityPhraseView.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                loginActivityPhraseView.timeText.setTextSize(1, 15.0f);
                int i2 = loginActivityPhraseView.nextType;
                if (i2 == 4 || i2 == 11) {
                    loginActivityPhraseView.timeText.setText(LocaleController.getString(R.string.Calling));
                } else {
                    loginActivityPhraseView.timeText.setText(LocaleController.getString(R.string.SendingSms));
                }
                final Bundle bundle2 = new Bundle();
                bundle2.putString("phone", loginActivityPhraseView.phone);
                bundle2.putString("ephone", loginActivityPhraseView.emailPhone);
                bundle2.putString("phoneFormated", loginActivityPhraseView.requestPhone);
                bundle2.putInt("prevType", loginActivityPhraseView.currentType);
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = loginActivityPhraseView.requestPhone;
                tL_auth_resendCode.phone_code_hash = loginActivityPhraseView.phoneHash;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda10
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivityPhraseView.$r8$lambda$trGDnTPoE7zd4hgy2xpgFmSrHb8(LoginActivity.LoginActivityPhraseView.this, bundle2, tLObject, tL_error);
                    }
                }, 10);
            }
        }

        public static /* synthetic */ void $r8$lambda$trGDnTPoE7zd4hgy2xpgFmSrHb8(final LoginActivityPhraseView loginActivityPhraseView, final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPhraseView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$dOyaJxAqR8VQ54azfD2k0ZHC0mU(LoginActivity.LoginActivityPhraseView.this, tLObject, bundle, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$dOyaJxAqR8VQ54azfD2k0ZHC0mU(LoginActivityPhraseView loginActivityPhraseView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
            String str;
            loginActivityPhraseView.isResendingCode = false;
            loginActivityPhraseView.timeText.invalidate();
            if (tLObject != null) {
                loginActivityPhraseView.nextCodeParams = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                loginActivityPhraseView.nextCodeAuth = tL_auth_sentCode;
                LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (str.contains("PHONE_NUMBER_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                loginActivityPhraseView.onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
            } else if (tL_error.code != -1000) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
            }
            loginActivityPhraseView.lastError = tL_error.text;
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
            return LocaleController.getString("NewPassword", R.string.NewPassword);
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
                    i = R.string.ReturnEnteringPhrase;
                } else if (i2 == 16) {
                    i = R.string.ReturnEnteringWord;
                } else if (i2 == 3) {
                    i = R.string.ReturnPhoneCall;
                } else {
                    i = R.string.ReturnEnteringSMS;
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
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i3 == 16) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i3 == 1 || i3 == 2 || i3 == 4 || i3 == 3 || i3 == 15) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
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
                this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(!z2 ? R.string.SMSWordText : R.string.SMSPhraseText, str)));
            } else {
                this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(!z2 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, str, str2)));
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
                this.errorTextView.setText(LocaleController.getString(!z2 ? R.string.SMSWordBeginningError : R.string.SMSPhraseBeginningError));
            } else if (TextUtils.isEmpty(this.codeField.getText())) {
                this.errorTextView.setText("");
            } else {
                this.errorTextView.setText(LocaleController.getString(!z2 ? R.string.SMSWordError : R.string.SMSPhraseError));
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
        public void onNextPressed(String str) {
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
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$SUPa56ZEdpYp-PhTm7-2TEmBFVA(LoginActivity.LoginActivityPhraseView.this, tL_auth_signIn, tLObject, tL_error);
                }
            }, 10), true);
            LoginActivity.this.showDoneButton(true, true);
        }

        public static /* synthetic */ void $r8$lambda$SUPa56ZEdpYp-PhTm7-2TEmBFVA(final LoginActivityPhraseView loginActivityPhraseView, final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPhraseView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$C0UnXMTbRw-wrQUo-FJZ6SF5h8A(LoginActivity.LoginActivityPhraseView.this, tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$C0UnXMTbRw-wrQUo-FJZ6SF5h8A(final LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_error tL_error, TLObject tLObject, final TLRPC.TL_auth_signIn tL_auth_signIn) {
            LoginActivity.this.needHideProgress(false, true);
            if (tL_error == null) {
                loginActivityPhraseView.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                loginActivityPhraseView.destroyTimer();
                if (!(tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired)) {
                    LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
                } else {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", loginActivityPhraseView.requestPhone);
                    bundle.putString("phoneHash", loginActivityPhraseView.phoneHash);
                    bundle.putString("code", tL_auth_signIn.phone_code);
                    LoginActivity.this.setPage(5, true, bundle, false);
                }
            } else {
                String str = tL_error.text;
                loginActivityPhraseView.lastError = str;
                if (str.contains("SESSION_PASSWORD_NEEDED")) {
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda14
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            LoginActivity.LoginActivityPhraseView.$r8$lambda$BOux35gVm73huOkzScPjzJ3DNE0(LoginActivity.LoginActivityPhraseView.this, tL_auth_signIn, tLObject2, tL_error2);
                        }
                    }, 10);
                    loginActivityPhraseView.destroyTimer();
                } else {
                    loginActivityPhraseView.nextPressed = false;
                    if (loginActivityPhraseView.currentType != 3) {
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        } else {
                            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                loginActivityPhraseView.onInputError(false);
                                loginActivityPhraseView.codeField.post(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda15
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        LoginActivity.LoginActivityPhraseView.$r8$lambda$jQTjCeET-blZRmkZZgC1UAYq2Dw(LoginActivity.LoginActivityPhraseView.this);
                                    }
                                });
                                return;
                            }
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                loginActivityPhraseView.onBackPressed(true);
                                LoginActivity.this.setPage(0, true, null, true);
                                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                        }
                        loginActivityPhraseView.codeField.setText("");
                        loginActivityPhraseView.codeField.requestFocus();
                        return;
                    }
                    return;
                }
            }
            if (loginActivityPhraseView.currentType == 3) {
                AndroidUtilities.endIncomingCall();
                AndroidUtilities.setWaitingForCall(false);
            }
        }

        public static /* synthetic */ void $r8$lambda$BOux35gVm73huOkzScPjzJ3DNE0(final LoginActivityPhraseView loginActivityPhraseView, final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPhraseView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$ZDF1oP-RbWaIcNjomO30PvqRUvA(LoginActivity.LoginActivityPhraseView.this, tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$ZDF1oP-RbWaIcNjomO30PvqRUvA(LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            loginActivityPhraseView.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", loginActivityPhraseView.requestPhone);
            bundle.putString("phoneHash", loginActivityPhraseView.phoneHash);
            bundle.putString("code", tL_auth_signIn.phone_code);
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        public static /* synthetic */ void $r8$lambda$jQTjCeET-blZRmkZZgC1UAYq2Dw(LoginActivityPhraseView loginActivityPhraseView) {
            loginActivityPhraseView.codeField.requestFocus();
            String str = loginActivityPhraseView.beginning;
            if (str != null) {
                if (str.length() > 1) {
                    String obj = loginActivityPhraseView.codeField.getText().toString();
                    int trimLeftLen = loginActivityPhraseView.trimLeftLen(obj) + loginActivityPhraseView.beginning.length();
                    loginActivityPhraseView.codeField.setSelection(Utilities.clamp(trimLeftLen + ((trimLeftLen < 0 || trimLeftLen >= obj.length() || obj.charAt(trimLeftLen) != ' ') ? 0 : 1), obj.length(), 0), loginActivityPhraseView.codeField.getText().length());
                    return;
                }
            }
            EditTextBoldCursor editTextBoldCursor = loginActivityPhraseView.codeField;
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
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$ZilxKWCtTlIBLsW965W8aOGLbfw(LoginActivity.LoginActivityPhraseView.this, bundle, tLObject, tL_error);
                }
            }, 10));
        }

        public static /* synthetic */ void $r8$lambda$ZilxKWCtTlIBLsW965W8aOGLbfw(final LoginActivityPhraseView loginActivityPhraseView, final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPhraseView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$h4QlFQqohNoD9affIQsXGmMJdBE(LoginActivity.LoginActivityPhraseView.this, tL_error, bundle, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$h4QlFQqohNoD9affIQsXGmMJdBE(LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
            loginActivityPhraseView.nextPressed = false;
            if (tL_error == null) {
                LoginActivity.this.fillNextCodeParams(bundle, (TLRPC.TL_auth_sentCode) tLObject);
            } else {
                String str = tL_error.text;
                if (str != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        loginActivityPhraseView.onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
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
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$7eU05cg3rXadVMbuLAefTyN1kGQ(LoginActivity.LoginActivityPhraseView.this);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static /* synthetic */ void $r8$lambda$7eU05cg3rXadVMbuLAefTyN1kGQ(LoginActivityPhraseView loginActivityPhraseView) {
            EditTextBoldCursor editTextBoldCursor = loginActivityPhraseView.codeField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = loginActivityPhraseView.codeField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(loginActivityPhraseView.codeField);
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
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
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
                        LoginActivity.LoginActivityPhraseView.4.$r8$lambda$iwRBwV9mv0xeA1CmB5I1MJyOXIg(LoginActivity.LoginActivityPhraseView.4.this);
                    }
                });
            }

            public static /* synthetic */ void $r8$lambda$iwRBwV9mv0xeA1CmB5I1MJyOXIg(4 r10) {
                r10.getClass();
                double currentTimeMillis = System.currentTimeMillis();
                double d = currentTimeMillis - LoginActivityPhraseView.this.lastCurrentTime;
                LoginActivityPhraseView.this.lastCurrentTime = currentTimeMillis;
                LoginActivityPhraseView.access$18226(LoginActivityPhraseView.this, d);
                if (LoginActivityPhraseView.this.time >= 1000) {
                    int i = (LoginActivityPhraseView.this.time / MediaDataController.MAX_STYLE_RUNS_COUNT) / 60;
                    int i2 = (LoginActivityPhraseView.this.time / MediaDataController.MAX_STYLE_RUNS_COUNT) - (i * 60);
                    LoginActivityPhraseView.this.timeText.setTextSize(1, 13.0f);
                    if (LoginActivityPhraseView.this.nextType == 4 || LoginActivityPhraseView.this.nextType == 3 || LoginActivityPhraseView.this.nextType == 11) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i), Integer.valueOf(i2)));
                        return;
                    } else {
                        if (LoginActivityPhraseView.this.nextType == 2) {
                            LoginActivityPhraseView.this.timeText.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i), Integer.valueOf(i2)));
                            return;
                        }
                        return;
                    }
                }
                LoginActivityPhraseView.this.destroyTimer();
                if (LoginActivityPhraseView.this.nextType == 3 || LoginActivityPhraseView.this.nextType == 4 || LoginActivityPhraseView.this.nextType == 2 || LoginActivityPhraseView.this.nextType == 11) {
                    LoginActivityPhraseView.this.timeText.setTextSize(1, 15.0f);
                    if (LoginActivityPhraseView.this.nextType == 4) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (LoginActivityPhraseView.this.nextType == 15) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (LoginActivityPhraseView.this.nextType == 11 || LoginActivityPhraseView.this.nextType == 3) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.getString(R.string.RequestMissedCall));
                    } else {
                        LoginActivityPhraseView.this.timeText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    }
                    LoadingTextView loadingTextView = LoginActivityPhraseView.this.timeText;
                    int i3 = Theme.key_chats_actionBackground;
                    loadingTextView.setTextColor(Theme.getColor(i3));
                    LoginActivityPhraseView.this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i3));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void destroyTimer() {
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText;
            loadingTextView.setTextColor(Theme.getColor(i));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.timeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.timeTimer = null;
                        }
                    } finally {
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
            addView(frameLayout, LayoutHelper.createLinear(-1, NotificationCenter.dialogPhotosUpdate));
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
            frameLayout.addView(starParticlesView, LayoutHelper.createFrame(-1, NotificationCenter.dialogPhotosUpdate, 119));
            ImageView imageView = new ImageView(context);
            this.optionsButton = imageView;
            imageView.setImageResource(R.drawable.ic_ab_other);
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
            frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(NotificationCenter.screenshotTook, NotificationCenter.screenshotTook, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
            textView.setTextColor(Theme.getColor(i));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
            this.cells[0] = new ExplainStarsSheet.FeatureCell(context, 1, ((BaseFragment) LoginActivity.this).resourceProvider);
            this.cells[0].set(R.drawable.menu_high_price, LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text));
            addView(this.cells[0], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            this.cells[1] = new ExplainStarsSheet.FeatureCell(context, 1, ((BaseFragment) LoginActivity.this).resourceProvider);
            this.cells[1].set(R.drawable.menu_feature_code, LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text));
            addView(this.cells[1], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            this.cells[2] = new ExplainStarsSheet.FeatureCell(context, 1, ((BaseFragment) LoginActivity.this).resourceProvider);
            this.cells[2].set(R.drawable.menu_feature_hands, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$-368aoO8FvkgNz49iU0VIhRsqrc(LoginActivity.LoginPayView.this);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text));
            addView(this.cells[2], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            addView(new Space(context), LayoutHelper.createLinear(0, 0, 1.0f, 119));
            ButtonWithCounterView round = new ButtonWithCounterView(context, null).setRound();
            this.button = round;
            round.setLoading(true);
            addView(this.button, LayoutHelper.createLinear(-1, 48, 7, 0, 16, 0, 16));
        }

        public static /* synthetic */ void $r8$lambda$-368aoO8FvkgNz49iU0VIhRsqrc(LoginPayView loginPayView) {
            loginPayView.getClass();
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment("sms");
            premiumPreviewFragment.setCurrentAccount(((BaseFragment) LoginActivity.this).currentAccount);
            LoginActivity.this.presentFragment(premiumPreviewFragment);
        }

        @Override // org.telegram.ui.Components.SlideView
        public void setParams(Bundle bundle, boolean z) {
            long j;
            int i;
            super.setParams(bundle, z);
            this.params = bundle;
            String countryName = LocaleController.getCountryName(bundle == null ? null : bundle.getString("country"));
            String string = bundle == null ? null : bundle.getString("product");
            final String string2 = bundle == null ? null : bundle.getString("phoneFormated");
            String string3 = bundle == null ? null : bundle.getString("phoneHash");
            final String string4 = bundle == null ? null : bundle.getString("support_email_email");
            final String string5 = bundle == null ? null : bundle.getString("support_email_subject");
            String string6 = bundle == null ? null : bundle.getString("currency");
            long j2 = bundle == null ? 0L : bundle.getLong("amount");
            if (bundle == null) {
                i = 0;
                j = 0;
            } else {
                j = 0;
                i = bundle.getInt("premium_days");
            }
            if (TextUtils.isEmpty(countryName)) {
                this.cells[0].subtitleView.setText(LocaleController.getString(R.string.SMSFee1Text));
            } else {
                this.cells[0].subtitleView.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
            }
            this.cells[2].setSubtitle(i == 7 ? LocaleController.getString(R.string.SMSFee3Text) : LocaleController.formatPluralStringComma("SMSFee3TextDays", i));
            this.optionsButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemOptions.makeOptions(LoginActivity.this, r0.optionsButton).add(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda12
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginActivity.LoginPayView.$r8$lambda$8rdGfME7ha_Bs5msGVixDcULgQw(LoginActivity.LoginPayView.this, r2, r3, r4);
                        }
                    }).setGravity(5).show();
                }
            });
            this.button.setEnabled(true);
            this.button.setOnClickListener(null);
            if (BuildVars.useInvoiceBilling()) {
                if (!TextUtils.isEmpty(string6) && j2 > j) {
                    this.button.setVisibility(0);
                    this.button.setLoading(false);
                    this.button.setText(LocaleController.formatString(R.string.SMSFeePurchaseTitle, BillingController.getInstance().formatCurrency(j2, string6)), false);
                    this.button.setSubText(i == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i), false);
                    final int i2 = i;
                    final String str = string2;
                    final String str2 = string6;
                    final long j3 = j2;
                    final String str3 = string3;
                    this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginActivity.LoginPayView.$r8$lambda$HInN8J1if4c8UKkWp3OxUDp6aD8(LoginActivity.LoginPayView.this, str2, j3, str3, str, i2, view);
                        }
                    });
                    return;
                }
                this.button.setVisibility(0);
                this.button.setLoading(false);
                this.button.setEnabled(false);
                this.button.setText(LocaleController.getString(R.string.Unavailable), false);
                return;
            }
            final int i3 = i;
            final String str4 = string3;
            if (TextUtils.isEmpty(string)) {
                this.button.setVisibility(8);
                return;
            }
            this.button.setVisibility(0);
            this.button.setLoading(true);
            final String str5 = string;
            final String str6 = string2;
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$S7Mx6i8HC1-pwDMdCgXPdE4U1Vw(LoginActivity.LoginPayView.this, str5, str4, str6, i3);
                }
            };
            if (!BillingController.getInstance().isReady()) {
                BillingController.getInstance().whenSetuped(runnable);
            } else {
                runnable.run();
            }
        }

        public static /* synthetic */ void $r8$lambda$8rdGfME7ha_Bs5msGVixDcULgQw(LoginPayView loginPayView, String str, String str2, String str3) {
            Object systemService;
            Object systemService2;
            SignalStrength signalStrength;
            int level;
            SubscriptionManager from;
            String number;
            int simSlotIndex;
            int mcc;
            int mnc;
            CharSequence carrierName;
            loginPayView.getClass();
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                String format = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                if (TextUtils.isEmpty(str)) {
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                } else {
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                }
                if (TextUtils.isEmpty(str2)) {
                    intent.putExtra("android.intent.extra.SUBJECT", "Android Registration/Login Billing Issue #billing_issue");
                } else {
                    intent.putExtra("android.intent.extra.SUBJECT", str2);
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
                        from = SubscriptionManager.from(loginPayView.getContext());
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
                        systemService = loginPayView.getContext().getSystemService((Class<Object>) TelephonyManager.class);
                        systemService2 = loginPayView.getContext().getSystemService((Class<Object>) ConnectivityManager.class);
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
                sb.append(AndroidUtilities.isWifiEnabled(loginPayView.getContext()));
                sb.append("\n");
                sb.append("Airplane Mode: ");
                sb.append(AndroidUtilities.isInAirplaneMode(loginPayView.getContext()));
                sb.append("\n");
                sb.append("\n");
                sb.append("App: ");
                sb.append(BuildVars.APP_ID);
                sb.append("\n");
                int i2 = packageInfo.versionCode % 10;
                String str4 = (i2 == 1 || i2 == 2) ? "store" : ApplicationLoader.isStandaloneBuild() ? "direct" : ApplicationLoader.isBetaBuild() ? "beta" : ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
                sb.append("App version: ");
                sb.append(format);
                sb.append(" ");
                sb.append(str4);
                sb.append("\n");
                sb.append("\n");
                sb.append("Issue: ");
                sb.append("billing_issue");
                sb.append("\n");
                if (!TextUtils.isEmpty(loginPayView.lastError)) {
                    sb.append("Error: ");
                    sb.append(loginPayView.lastError);
                    sb.append("\n");
                }
                sb.append("\n\n================================================\n");
                sb.append("WRITE YOUR COMMENT HERE:\n");
                sb.append("\n");
                sb.append("\n");
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                loginPayView.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
            } catch (Exception unused) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
            }
        }

        public static /* synthetic */ void $r8$lambda$HInN8J1if4c8UKkWp3OxUDp6aD8(final LoginPayView loginPayView, String str, long j, String str2, String str3, int i, View view) {
            if (loginPayView.button.isLoading()) {
                return;
            }
            loginPayView.button.setLoading(true);
            final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
            tL_inputStorePaymentAuthCode.currency = str;
            tL_inputStorePaymentAuthCode.amount = j;
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            tL_inputStorePaymentAuthCode.phone_code_hash = str2;
            tL_inputStorePaymentAuthCode.phone_number = str3;
            tL_inputStorePaymentAuthCode.premium_days = i;
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
                    LoginActivity.LoginPayView.$r8$lambda$NyNkgZnwpa8fli3YasNSnHXh7_c(LoginActivity.LoginPayView.this, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, tLObject, tL_error);
                }
            }, 74);
        }

        public static /* synthetic */ void $r8$lambda$NyNkgZnwpa8fli3YasNSnHXh7_c(final LoginPayView loginPayView, final TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$fXurjq4V7TtrE0iEy0Ud4pbCfN0(LoginActivity.LoginPayView.this, tLObject, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$fXurjq4V7TtrE0iEy0Ud4pbCfN0(final LoginPayView loginPayView, TLObject tLObject, TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.TL_error tL_error) {
            loginPayView.button.setLoading(false);
            if (tLObject instanceof TLRPC.PaymentForm) {
                final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                LoginActivity.this.getMessagesController().putUsers(paymentForm.users, false);
                PaymentFormActivity paymentFormActivity = new PaymentFormActivity(paymentForm, (TLRPC.InputInvoice) tL_inputInvoicePremiumAuthCode, true, (BaseFragment) LoginActivity.this);
                paymentFormActivity.setCustomResultReceiver(new Utilities.Callback() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda16
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        LoginActivity.LoginPayView.$r8$lambda$p8ViQWFlbywcTysmXS1rbRX_tUg(LoginActivity.LoginPayView.this, tL_inputStorePaymentAuthCode, paymentForm, (TLRPC.TL_payments_paymentResult) obj);
                    }
                });
                paymentFormActivity.setCustomAnyResultReceiver(new Utilities.Callback() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda17
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        LoginActivity.LoginPayView.$r8$lambda$LZ7bx-bgRA06O5O6p55QLfe4mTA(LoginActivity.LoginPayView.this, tL_inputStorePaymentAuthCode, paymentForm, (TLRPC.payments_PaymentResult) obj);
                    }
                });
                paymentFormActivity.setCustomErrorReceiver(new Utilities.CallbackReturn() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda18
                    @Override // org.telegram.messenger.Utilities.CallbackReturn
                    public final Object run(Object obj) {
                        return LoginActivity.LoginPayView.$r8$lambda$qr4uZwovPHDjTrg0py8-TazTUg0(LoginActivity.LoginPayView.this, (TLRPC.TL_error) obj);
                    }
                });
                LoginActivity.this.presentFragment(paymentFormActivity);
                return;
            }
            if (tL_error == null) {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError));
            } else if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda19
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginPayView.$r8$lambda$2njTIIyVUOmEpEo7VcFQV37M_tA(LoginActivity.LoginPayView.this);
                    }
                });
            } else {
                loginPayView.lastError = tL_error.text;
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text));
            }
        }

        public static /* synthetic */ void $r8$lambda$p8ViQWFlbywcTysmXS1rbRX_tUg(final LoginPayView loginPayView, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.PaymentForm paymentForm, TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$CZ4PA46w4lFpWSK6lxy2QvH1IM0(LoginActivity.LoginPayView.this, tL_inputStorePaymentAuthCode, paymentForm);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$CZ4PA46w4lFpWSK6lxy2QvH1IM0(LoginPayView loginPayView, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm) {
            loginPayView.getClass();
            loginPayView.startPoll(tL_inputStorePaymentAuthCode.phone_number, tL_inputStorePaymentAuthCode.phone_code_hash, paymentForm.form_id);
        }

        public static /* synthetic */ void $r8$lambda$LZ7bx-bgRA06O5O6p55QLfe4mTA(final LoginPayView loginPayView, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.PaymentForm paymentForm, TLRPC.payments_PaymentResult payments_paymentresult) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$zEH41GNz53FC31jrZZncn_lpTnY(LoginActivity.LoginPayView.this, tL_inputStorePaymentAuthCode, paymentForm);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$zEH41GNz53FC31jrZZncn_lpTnY(LoginPayView loginPayView, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm) {
            loginPayView.getClass();
            loginPayView.startPoll(tL_inputStorePaymentAuthCode.phone_number, tL_inputStorePaymentAuthCode.phone_code_hash, paymentForm.form_id);
        }

        public static /* synthetic */ Boolean $r8$lambda$qr4uZwovPHDjTrg0py8-TazTUg0(final LoginPayView loginPayView, TLRPC.TL_error tL_error) {
            loginPayView.getClass();
            if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda21
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginPayView.$r8$lambda$MYsv4UTZHRbRajoh-V-m7K02SGg(LoginActivity.LoginPayView.this);
                    }
                });
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public static /* synthetic */ void $r8$lambda$MYsv4UTZHRbRajoh-V-m7K02SGg(LoginPayView loginPayView) {
            loginPayView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
        }

        public static /* synthetic */ void $r8$lambda$2njTIIyVUOmEpEo7VcFQV37M_tA(LoginPayView loginPayView) {
            loginPayView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
        }

        public static /* synthetic */ void $r8$lambda$S7Mx6i8HC1-pwDMdCgXPdE4U1Vw(final LoginPayView loginPayView, final String str, final String str2, final String str3, final int i) {
            loginPayView.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(str).build());
            FileLog.d("LoginBilling querying \"" + str + "\" product");
            BillingController.getInstance().queryProductDetails(arrayList, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda10
                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                    LoginActivity.LoginPayView.$r8$lambda$CSxhLttvqzdZPWFjDvFBLs-OnnA(LoginActivity.LoginPayView.this, str, str2, str3, i, billingResult, list);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$CSxhLttvqzdZPWFjDvFBLs-OnnA(final LoginPayView loginPayView, final String str, final String str2, final String str3, final int i, final BillingResult billingResult, final List list) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$WaOM10Yh6RASg9t8qOaI202sd_Y(LoginActivity.LoginPayView.this, str, billingResult, list, str2, str3, i);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$WaOM10Yh6RASg9t8qOaI202sd_Y(final LoginPayView loginPayView, final String str, BillingResult billingResult, List list, String str2, String str3, final int i) {
            loginPayView.getClass();
            FileLog.d("LoginBilling queried \"" + str + "\" product: " + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            if (billingResult.getResponseCode() != 0) {
                loginPayView.lastError = "BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode());
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(billingResult.getResponseCode())));
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
                tL_inputStorePaymentAuthCode.premium_days = i;
                FileLog.d("LoginBilling found \"" + str + "\" product, with currency=" + tL_inputStorePaymentAuthCode.currency + " amount=" + tL_inputStorePaymentAuthCode.amount + "; phone=" + str3 + ", phone_code_hash=" + str2);
                final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_payments_canPurchaseStore, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda15
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginPayView.$r8$lambda$__Aj5VhX7qjXdaUkUvkSjwMww3U(LoginActivity.LoginPayView.this, oneTimePurchaseOfferDetails, i, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore, tLObject, tL_error);
                    }
                }, 10);
                return;
            }
            loginPayView.lastError = "PRODUCT_NOT_FOUND";
            BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
        }

        public static /* synthetic */ void $r8$lambda$__Aj5VhX7qjXdaUkUvkSjwMww3U(final LoginPayView loginPayView, final ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, final int i, final ProductDetails productDetails, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final String str, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$XRpgSoAA9SoIKsr5-GEFAkevz88(LoginActivity.LoginPayView.this, tLObject, tL_error, oneTimePurchaseOfferDetails, i, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$XRpgSoAA9SoIKsr5-GEFAkevz88(final LoginPayView loginPayView, TLObject tLObject, TLRPC.TL_error tL_error, ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, int i, final ProductDetails productDetails, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final String str, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
            loginPayView.getClass();
            FileLog.d("LoginBilling canPurchaseStore returned " + tLObject + " " + tL_error);
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                loginPayView.button.setText(LocaleController.formatString(R.string.SMSFeePurchaseTitle, oneTimePurchaseOfferDetails.getFormattedPrice()), false);
                loginPayView.button.setSubText(i == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i), false);
                loginPayView.button.setLoading(false);
                loginPayView.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda25
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginActivity.LoginPayView.$r8$lambda$QtMXIMnw4EdmCQvpBHrei8zu7Dw(LoginActivity.LoginPayView.this, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore, view);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                loginPayView.lastError = "RESPONSE_FALSE";
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
            } else if (tL_error != null) {
                loginPayView.lastError = tL_error.text;
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).showForError(tL_error);
            }
        }

        public static /* synthetic */ void $r8$lambda$QtMXIMnw4EdmCQvpBHrei8zu7Dw(final LoginPayView loginPayView, final ProductDetails productDetails, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final String str, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, View view) {
            if (loginPayView.button.isLoading()) {
                return;
            }
            loginPayView.button.setLoading(true);
            final Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda27
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    LoginActivity.LoginPayView.$r8$lambda$0PWtj3T3WFL3tPQn04WmR1DQgG0(LoginActivity.LoginPayView.this, (String) obj);
                }
            };
            FileLog.d("LoginBilling, querying done purchases...");
            final Runnable runnable = new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$Rd7APdQNVLJXMb-lsaqRZRj1iHw(LoginActivity.LoginPayView.this, productDetails, callback, tL_inputStorePaymentAuthCode);
                }
            };
            BillingController.getInstance().queryPurchases("inapp", new PurchasesResponseListener() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda29
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    LoginActivity.LoginPayView.$r8$lambda$pQeITiK-wN2bq7Sx-GfN9LzUTb0(LoginActivity.LoginPayView.this, str, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, runnable, billingResult, list);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$0PWtj3T3WFL3tPQn04WmR1DQgG0(LoginPayView loginPayView, String str) {
            loginPayView.getClass();
            FileLog.d("LoginBilling purchased done " + str);
            if ("CANCELLED".equalsIgnoreCase(str)) {
                loginPayView.button.setLoading(false);
            }
        }

        public static /* synthetic */ void $r8$lambda$Rd7APdQNVLJXMb-lsaqRZRj1iHw(LoginPayView loginPayView, ProductDetails productDetails, final Utilities.Callback callback, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode) {
            LoginActivity.this.paid = true;
            BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda31
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    LoginActivity.LoginPayView.$r8$lambda$pAGp1uDnxfAJNNKcngfU5B1nZnE(Utilities.Callback.this, (BillingResult) obj);
                }
            });
            BillingController.getInstance().setOnCanceled(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda32
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Utilities.Callback.this.run("CANCELLED");
                        }
                    });
                }
            });
            BillingController.getInstance().launchBillingFlow(LoginActivity.this.getParentActivity(), AccountInstance.getInstance(((BaseFragment) LoginActivity.this).currentAccount), tL_inputStorePaymentAuthCode, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build()));
        }

        public static /* synthetic */ void $r8$lambda$pAGp1uDnxfAJNNKcngfU5B1nZnE(final Utilities.Callback callback, BillingResult billingResult) {
            final String responseCodeString = billingResult.getResponseCode() == 0 ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Utilities.Callback.this.run(responseCodeString);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$pQeITiK-wN2bq7Sx-GfN9LzUTb0(final LoginPayView loginPayView, final String str, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final Runnable runnable, final BillingResult billingResult, final List list) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda33
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$iFkBAoCvmFnvgkuDKeX4nJl3jA8(LoginActivity.LoginPayView.this, billingResult, list, str, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, runnable);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$iFkBAoCvmFnvgkuDKeX4nJl3jA8(final LoginPayView loginPayView, BillingResult billingResult, List list, String str, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final Runnable runnable) {
            loginPayView.getClass();
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
                        LoginActivity.this.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                LoginActivity.LoginPayView.$r8$lambda$7I87C6O_AXqlifR9Bboj0Hr9Rls(LoginActivity.LoginPayView.this, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore, runnable, tLObject, tL_error);
                            }
                        }, 74);
                        return;
                    }
                }
            }
            runnable.run();
        }

        public static /* synthetic */ void $r8$lambda$7I87C6O_AXqlifR9Bboj0Hr9Rls(final LoginPayView loginPayView, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, Purchase purchase, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
            loginPayView.getClass();
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
            ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
            int size = findUpdatesAndRemove.size();
            int i = 0;
            while (i < size) {
                Object obj = findUpdatesAndRemove.get(i);
                i++;
                final TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) obj;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.LoginPayView.$r8$lambda$cSESROmtP8HL5FFGEGntlwl15no(LoginActivity.LoginPayView.this, tL_inputStorePaymentAuthCode, tL_updateSentPhoneCode);
                    }
                });
            }
            LoginActivity.this.getMessagesController().processUpdates(updates, false);
            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.this.button.setLoading(false);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$cSESROmtP8HL5FFGEGntlwl15no(LoginPayView loginPayView, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
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

        private void closeAllPaymentFormActivities() {
            INavigationLayout parentLayout = LoginActivity.this.getParentLayout();
            if (parentLayout == null || parentLayout.getFragmentStack() == null) {
                return;
            }
            List fragmentStack = parentLayout.getFragmentStack();
            BaseFragment baseFragment = fragmentStack.isEmpty() ? null : (BaseFragment) fragmentStack.get(fragmentStack.size() - 1);
            ArrayList arrayList = new ArrayList(fragmentStack);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                BaseFragment baseFragment2 = (BaseFragment) obj;
                if ((baseFragment2 instanceof PaymentFormActivity) && baseFragment2 != baseFragment) {
                    baseFragment2.removeSelfFromStack();
                }
            }
            if (baseFragment instanceof PaymentFormActivity) {
                parentLayout.closeLastFragment(true);
            }
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
                this.pollingRequestId = ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_checkPaidAuth, new RequestDelegate() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda24
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginPayView.$r8$lambda$gWN3mG6QInzISjcaO27raOnqYis(LoginActivity.LoginPayView.this, tLObject, tL_error);
                    }
                }, 1096);
            }
        }

        public static /* synthetic */ void $r8$lambda$gWN3mG6QInzISjcaO27raOnqYis(final LoginPayView loginPayView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$9DpUPrSEsO-cOsfDzF97I2lHX0E(LoginActivity.LoginPayView.this, tLObject, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$9DpUPrSEsO-cOsfDzF97I2lHX0E(final LoginPayView loginPayView, TLObject tLObject, TLRPC.TL_error tL_error) {
            loginPayView.pollingRequestId = -1;
            if (tLObject instanceof TLRPC.auth_SentCode) {
                loginPayView.polling = false;
                loginPayView.button.setLoading(false);
                loginPayView.closeAllPaymentFormActivities();
                LoginActivity.this.fillNextCodeParams(loginPayView.params, (TLRPC.auth_SentCode) tLObject);
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
                    loginPayView.onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                } else {
                    loginPayView.lastError = tL_error.text;
                    loginPayView.polling = false;
                    loginPayView.button.setLoading(false);
                    BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text));
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
