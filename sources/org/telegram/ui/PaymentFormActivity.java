package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.stripe.android.Stripe;
import com.stripe.android.TokenCallback;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.exception.APIException;
import com.stripe.android.model.Card;
import com.stripe.android.model.Token;
import com.stripe.android.net.TokenParser;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditTextSettingsCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PaymentInfoCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.RecurrentPaymentsAcceptCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextDetailSettingsCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextPriceCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmbedBottomSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.HintEditText;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda31;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.StarsIntroActivity;

/* loaded from: classes4.dex */
public class PaymentFormActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private TLRPC.User botUser;
    private TextInfoPrivacyCell[] bottomCell;
    private BottomFrameLayout bottomLayout;
    private boolean canceled;
    private String cardName;
    private TextCheckCell checkCell1;
    private EditTextSettingsCell codeFieldCell;
    private HashMap codesMap;
    private ArrayList countriesArray;
    private HashMap countriesMap;
    private CountrySelectActivity.Country country;
    private String countryName;
    private String currentBotName;
    private String currentItemName;
    private TL_account.Password currentPassword;
    private int currentStep;
    private PaymentFormActivityDelegate delegate;
    private TextDetailSettingsCell[] detailSettingsCell;
    private ArrayList dividers;
    private ActionBarMenuItem doneItem;
    private AnimatorSet doneItemAnimation;
    private boolean donePressed;
    private int emailCodeLength;
    private FrameLayout googlePayButton;
    private FrameLayout googlePayContainer;
    private String googlePayCountryCode;
    private TLRPC.TL_inputPaymentCredentialsGooglePay googlePayCredentials;
    private JSONObject googlePayParameters;
    private String googlePayPublicKey;
    private HeaderCell[] headerCell;
    private boolean ignoreOnCardChange;
    private boolean ignoreOnPhoneChange;
    private boolean ignoreOnTextChange;
    private boolean initGooglePay;
    private EditTextBoldCursor[] inputFields;
    private TLRPC.InputInvoice invoiceInput;
    private String invoiceSlug;
    private InvoiceStatus invoiceStatus;
    private boolean isCheckoutPreview;
    private boolean isWebView;
    private LinearLayout linearLayout2;
    private boolean loadingPasswordInfo;
    private MessageObject messageObject;
    private boolean needPayAfterTransition;
    private boolean need_card_country;
    private boolean need_card_name;
    private boolean need_card_postcode;
    private BaseFragment parentFragment;
    private PaymentFormActivity passwordFragment;
    private boolean passwordOk;
    private TextView payTextView;
    private TLRPC.PaymentForm paymentForm;
    private PaymentFormCallback paymentFormCallback;
    private TLRPC.TL_paymentFormMethod paymentFormMethod;
    private PaymentInfoCell paymentInfoCell;
    private String paymentJson;
    private TLRPC.PaymentReceipt paymentReceipt;
    private boolean paymentStatusSent;
    private PaymentsClient paymentsClient;
    private HashMap phoneFormatMap;
    private ArrayList prices;
    private ContextProgressView progressView;
    private ContextProgressView progressViewButton;
    private String providerApiKey;
    private RadioCell[] radioCells;
    private RecurrentPaymentsAcceptCell recurrentAcceptCell;
    private boolean recurrentAccepted;
    private TLRPC.TL_payments_validatedRequestedInfo requestedInfo;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean saveCardInfo;
    private boolean saveShippingInfo;
    private TLRPC.TL_paymentSavedCredentialsCard savedCredentialsCard;
    private ScrollView scrollView;
    private ShadowSectionCell[] sectionCell;
    private TextSettingsCell[] settingsCell;
    private float shiftDp;
    private TLRPC.TL_shippingOption shippingOption;
    private Runnable shortPollRunnable;
    private boolean shouldNavigateBack;
    private boolean swipeBackEnabled;
    private TextView textView;
    private Long tipAmount;
    private LinearLayout tipLayout;
    private TextPriceCell totalCell;
    private String[] totalPrice;
    private String totalPriceDecimal;
    private TLRPC.TL_payments_validateRequestedInfo validateRequest;
    private boolean waitingForEmail;
    private WebView webView;
    private String webViewUrl;
    private boolean webviewLoading;
    private static final List WEBVIEW_PROTOCOLS = Arrays.asList("http", "https");
    private static final List BLACKLISTED_PROTOCOLS = Collections.singletonList("tg");

    public enum InvoiceStatus {
        PAID,
        CANCELLED,
        PENDING,
        FAILED
    }

    private interface PaymentFormActivityDelegate {

        public abstract /* synthetic */ class -CC {
            public static void $default$currentPasswordUpdated(PaymentFormActivityDelegate paymentFormActivityDelegate, TL_account.Password password) {
            }

            public static void $default$didSelectNewAddress(PaymentFormActivityDelegate paymentFormActivityDelegate, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
            }

            public static boolean $default$didSelectNewCard(PaymentFormActivityDelegate paymentFormActivityDelegate, String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return false;
            }

            public static void $default$onFragmentDestroyed(PaymentFormActivityDelegate paymentFormActivityDelegate) {
            }
        }

        void currentPasswordUpdated(TL_account.Password password);

        void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo);

        boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard);

        void onFragmentDestroyed();
    }

    public interface PaymentFormCallback {
        void onInvoiceStatusChanged(InvoiceStatus invoiceStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createView$10(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createView$26(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendForm$52(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    class TelegramWebviewProxy {
        private TelegramWebviewProxy() {
        }

        @JavascriptInterface
        public void postEvent(final String str, final String str2) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$TelegramWebviewProxy$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.TelegramWebviewProxy.this.lambda$postEvent$0(str, str2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postEvent$0(String str, String str2) {
            if (PaymentFormActivity.this.getParentActivity() != null && str.equals("payment_form_submit")) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("credentials");
                    PaymentFormActivity.this.paymentJson = jSONObject2.toString();
                    PaymentFormActivity.this.cardName = jSONObject.getString("title");
                } catch (Throwable th) {
                    PaymentFormActivity.this.paymentJson = str2;
                    FileLog.e(th);
                }
                PaymentFormActivity.this.goToNextStep();
            }
        }
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
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            paymentFormActivity.presentFragment(new TwoStepVerificationSetupActivity(6, paymentFormActivity.currentPassword));
        }
    }

    public PaymentFormActivity(TLRPC.PaymentReceipt paymentReceipt) {
        this.countriesArray = new ArrayList();
        this.countriesMap = new HashMap();
        this.codesMap = new HashMap();
        this.phoneFormatMap = new HashMap();
        this.swipeBackEnabled = true;
        this.headerCell = new HeaderCell[3];
        this.dividers = new ArrayList();
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCell = new TextInfoPrivacyCell[3];
        this.settingsCell = new TextSettingsCell[2];
        this.detailSettingsCell = new TextDetailSettingsCell[7];
        this.shiftDp = -4.5f;
        this.emailCodeLength = 6;
        this.currentStep = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.paymentForm = paymentForm;
        this.paymentReceipt = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.shippingOption = paymentReceipt.shipping;
        long j = paymentReceipt.tip_amount;
        if (j != 0) {
            this.tipAmount = Long.valueOf(j);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.botUser = user;
        if (user != null) {
            this.currentBotName = user.first_name;
        } else {
            this.currentBotName = "";
        }
        this.currentItemName = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.validateRequest = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.messageObject != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
                this.validateRequest.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.invoiceSlug;
                this.validateRequest.invoice = tL_inputInvoiceSlug;
            }
            this.validateRequest.info = paymentReceipt.info;
        }
        this.cardName = paymentReceipt.credentials_title;
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, String str, BaseFragment baseFragment) {
        this(paymentForm, null, str, baseFragment);
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, BaseFragment baseFragment) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, baseFragment);
        this.isCheckoutPreview = true;
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, MessageObject messageObject, BaseFragment baseFragment) {
        this(paymentForm, messageObject, null, baseFragment);
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, BaseFragment baseFragment) {
        this.countriesArray = new ArrayList();
        this.countriesMap = new HashMap();
        this.codesMap = new HashMap();
        this.phoneFormatMap = new HashMap();
        this.swipeBackEnabled = true;
        this.headerCell = new HeaderCell[3];
        this.dividers = new ArrayList();
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCell = new TextInfoPrivacyCell[3];
        this.settingsCell = new TextSettingsCell[2];
        this.detailSettingsCell = new TextDetailSettingsCell[7];
        this.shiftDp = -4.5f;
        this.emailCodeLength = 6;
        this.isCheckoutPreview = true;
        init(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, baseFragment);
    }

    private PaymentFormActivity(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, BaseFragment baseFragment) {
        this.countriesArray = new ArrayList();
        this.countriesMap = new HashMap();
        this.codesMap = new HashMap();
        this.phoneFormatMap = new HashMap();
        this.swipeBackEnabled = true;
        this.headerCell = new HeaderCell[3];
        this.dividers = new ArrayList();
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCell = new TextInfoPrivacyCell[3];
        this.settingsCell = new TextSettingsCell[2];
        this.detailSettingsCell = new TextDetailSettingsCell[7];
        this.shiftDp = -4.5f;
        this.emailCodeLength = 6;
        init(inputInvoice, paymentForm, messageObject, str, i, tL_payments_validatedRequestedInfo, tL_shippingOption, l, str2, str3, tL_payments_validateRequestedInfo, z, tL_inputPaymentCredentialsGooglePay, baseFragment);
    }

    public void setPaymentFormCallback(PaymentFormCallback paymentFormCallback) {
        this.paymentFormCallback = paymentFormCallback;
    }

    private void setCurrentPassword(TL_account.Password password) {
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            goToNextStep();
        } else {
            this.currentPassword = password;
            this.waitingForEmail = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            updatePasswordFields();
        }
    }

    private void setDelegate(PaymentFormActivityDelegate paymentFormActivityDelegate) {
        this.delegate = paymentFormActivityDelegate;
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    private void init(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, BaseFragment baseFragment) {
        this.currentStep = i;
        this.parentFragment = baseFragment;
        this.paymentJson = str2;
        this.googlePayCredentials = tL_inputPaymentCredentialsGooglePay;
        this.requestedInfo = tL_payments_validatedRequestedInfo;
        this.paymentForm = paymentForm;
        this.shippingOption = tL_shippingOption;
        this.tipAmount = l;
        this.messageObject = messageObject;
        this.invoiceSlug = str;
        this.invoiceInput = inputInvoice;
        this.saveCardInfo = z;
        this.isWebView = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.paymentForm.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.botUser = user;
        if (user != null) {
            this.currentBotName = user.first_name;
        } else {
            this.currentBotName = "";
        }
        this.currentItemName = paymentForm.title;
        this.validateRequest = tL_payments_validateRequestedInfo;
        this.saveShippingInfo = true;
        if (z || this.currentStep == 4) {
            this.saveCardInfo = z;
        } else {
            this.saveCardInfo = !this.paymentForm.saved_credentials.isEmpty();
        }
        if (str3 == null) {
            if (this.paymentForm.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.paymentForm.saved_credentials.get(0);
            this.savedCredentialsCard = tL_paymentSavedCredentialsCard;
            this.cardName = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.cardName = str3;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i = this.currentStep;
                if ((i == 2 || i == 6) && !this.paymentForm.invoice.test) {
                    getParentActivity().getWindow().setFlags(8192, 8192);
                    AndroidUtilities.logFlagSecure();
                } else if (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture) {
                    getParentActivity().getWindow().clearFlags(8192);
                    AndroidUtilities.logFlagSecure();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0307, code lost:
    
        if (r15.email_requested == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0f95, code lost:
    
        if (r10.email_requested == false) goto L468;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0bb4  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0cd2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x1934  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x194c  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x197b  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x19c0  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x1b69  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x19d9  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x1a00  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x1a53  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x1aa6  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x1af7  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x1b2e  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x19dc  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x19c2  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x19b8  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v107, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v108 */
    /* JADX WARN: Type inference failed for: r14v98, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v169, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v205, types: [org.telegram.ui.Components.EditTextBoldCursor[]] */
    /* JADX WARN: Type inference failed for: r4v206, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v211, types: [org.telegram.ui.Components.EditTextBoldCursor[]] */
    /* JADX WARN: Type inference failed for: r4v212, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v256, types: [org.telegram.ui.Components.EditTextBoldCursor[]] */
    /* JADX WARN: Type inference failed for: r4v257, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v325, types: [org.telegram.ui.Components.EditTextBoldCursor[]] */
    /* JADX WARN: Type inference failed for: r4v326, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v141, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r6v144, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v145, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v183, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View createView(Context context) {
        char c;
        char c2;
        int i;
        int i2;
        TLRPC.User user;
        char c3;
        final String str;
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        char c4;
        TLRPC.PaymentForm paymentForm;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        String str2;
        final long longValue;
        boolean z;
        int i3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String str3;
        String str4;
        TelephonyManager telephonyManager;
        ?? frameLayout;
        String str5;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str6;
        String str7;
        BufferedReader bufferedReader;
        ?? r10 = 0;
        switch (this.currentStep) {
            case 0:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingInfo));
                break;
            case 1:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingMethod));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.paymentFormMethod;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.paymentFormMethod.title);
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCardInfo));
                    break;
                }
                break;
            case 4:
                if (this.paymentForm.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentCheckout));
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCheckout));
                    break;
                }
            case 5:
                if (this.paymentForm.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentReceipt));
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentReceipt));
                    break;
                }
            case 6:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentPassword));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.PaymentFormActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i4) {
                if (i4 == -1) {
                    if (PaymentFormActivity.this.donePressed) {
                        return;
                    }
                    PaymentFormActivity.this.lambda$onBackPressed$355();
                    return;
                }
                if (i4 != 1 || PaymentFormActivity.this.donePressed) {
                    return;
                }
                if (PaymentFormActivity.this.currentStep != 3) {
                    AndroidUtilities.hideKeyboard(PaymentFormActivity.this.getParentActivity().getCurrentFocus());
                }
                int i5 = PaymentFormActivity.this.currentStep;
                if (i5 == 0) {
                    PaymentFormActivity.this.setDonePressed(true);
                    PaymentFormActivity.this.sendForm();
                    return;
                }
                int i6 = 0;
                if (i5 == 1) {
                    while (true) {
                        if (i6 >= PaymentFormActivity.this.radioCells.length) {
                            break;
                        }
                        if (PaymentFormActivity.this.radioCells[i6].isChecked()) {
                            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                            paymentFormActivity.shippingOption = paymentFormActivity.requestedInfo.shipping_options.get(i6);
                            break;
                        }
                        i6++;
                    }
                    PaymentFormActivity.this.goToNextStep();
                    return;
                }
                if (i5 == 2) {
                    PaymentFormActivity.this.sendCardData();
                } else if (i5 == 3) {
                    PaymentFormActivity.this.checkPassword();
                } else {
                    if (i5 != 6) {
                        return;
                    }
                    PaymentFormActivity.this.sendSavePassword(false);
                }
            }
        });
        ActionBarMenu createMenu = this.actionBar.createMenu();
        int i4 = this.currentStep;
        int i5 = 3;
        if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 6) {
            this.doneItem = createMenu.addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
            ContextProgressView contextProgressView = new ContextProgressView(context, 1);
            this.progressView = contextProgressView;
            contextProgressView.setAlpha(0.0f);
            this.progressView.setScaleX(0.1f);
            this.progressView.setScaleY(0.1f);
            this.progressView.setVisibility(4);
            this.doneItem.addView(this.progressView, LayoutHelper.createFrame(-1, -1.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, getThemedColor(Theme.key_actionBarDefault));
        frameLayout2.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.currentStep == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout2 = linearLayout;
        linearLayout.setOrientation(1);
        this.linearLayout2.setClipChildren(false);
        int i6 = -2;
        this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        int i7 = this.currentStep;
        String str8 = "";
        if (i7 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e) {
                FileLog.e(e);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.countriesArray.add(0, split[2]);
                    this.countriesMap.put(split[2], split[0]);
                    this.codesMap.put(split[0], split[2]);
                    hashMap2.put(split[1], split[2]);
                    if (split.length > 3) {
                        this.phoneFormatMap.put(split[0], split[3]);
                    }
                    hashMap.put(split[1], split[2]);
                } else {
                    bufferedReader.close();
                    Collections.sort(this.countriesArray, new BoostRepository$$ExternalSyntheticLambda31());
                    int i8 = 10;
                    this.inputFields = new EditTextBoldCursor[10];
                    int i9 = 0;
                    while (i9 < i8) {
                        if (i9 == 0) {
                            this.headerCell[r10] = new HeaderCell(context, this.resourcesProvider);
                            this.headerCell[r10].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            this.headerCell[r10].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                            this.linearLayout2.addView(this.headerCell[r10], LayoutHelper.createLinear(-1, i6));
                        } else if (i9 == 6) {
                            this.sectionCell[r10] = new ShadowSectionCell(context, this.resourcesProvider);
                            this.linearLayout2.addView(this.sectionCell[r10], LayoutHelper.createLinear(-1, i6));
                            this.headerCell[1] = new HeaderCell(context, this.resourcesProvider);
                            this.headerCell[1].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            this.headerCell[1].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                            this.linearLayout2.addView(this.headerCell[1], LayoutHelper.createLinear(-1, i6));
                        }
                        if (i9 == 8) {
                            frameLayout = new LinearLayout(context);
                            frameLayout.setClipChildren(r10);
                            frameLayout.setOrientation(r10);
                            this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
                            frameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        } else if (i9 == 9) {
                            frameLayout = (ViewGroup) this.inputFields[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(r10);
                            this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
                            int i10 = Theme.key_windowBackgroundWhite;
                            frameLayout.setBackgroundColor(getThemedColor(i10));
                            boolean z2 = i9 != 5;
                            if (z2) {
                                if (i9 != 7 || this.paymentForm.invoice.phone_requested) {
                                    if (i9 == 6) {
                                        TLRPC.TL_invoice tL_invoice = this.paymentForm.invoice;
                                        if (!tL_invoice.phone_requested) {
                                        }
                                    }
                                }
                                z2 = false;
                            }
                            if (z2) {
                                View view = new View(context) { // from class: org.telegram.ui.PaymentFormActivity.2
                                    @Override // android.view.View
                                    protected void onDraw(Canvas canvas) {
                                        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                                    }
                                };
                                view.setBackgroundColor(getThemedColor(i10));
                                this.dividers.add(view);
                                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                        }
                        if (i9 == 9) {
                            this.inputFields[i9] = new HintEditText(context);
                        } else {
                            this.inputFields[i9] = new EditTextBoldCursor(context);
                        }
                        this.inputFields[i9].setTag(Integer.valueOf(i9));
                        this.inputFields[i9].setTextSize(1, 16.0f);
                        this.inputFields[i9].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                        EditTextBoldCursor editTextBoldCursor = this.inputFields[i9];
                        int i11 = Theme.key_windowBackgroundWhiteBlackText;
                        editTextBoldCursor.setTextColor(getThemedColor(i11));
                        this.inputFields[i9].setBackgroundDrawable(null);
                        this.inputFields[i9].setCursorColor(getThemedColor(i11));
                        this.inputFields[i9].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.inputFields[i9].setCursorWidth(1.5f);
                        if (i9 == 4) {
                            this.inputFields[i9].setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda14
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                    boolean lambda$createView$1;
                                    lambda$createView$1 = PaymentFormActivity.this.lambda$createView$1(view2, motionEvent);
                                    return lambda$createView$1;
                                }
                            });
                            this.inputFields[i9].setInputType(r10);
                        }
                        if (i9 == 9 || i9 == 8) {
                            this.inputFields[i9].setInputType(i5);
                        } else if (i9 == 7) {
                            this.inputFields[i9].setInputType(1);
                        } else {
                            this.inputFields[i9].setInputType(16385);
                        }
                        this.inputFields[i9].setImeOptions(268435461);
                        switch (i9) {
                            case 0:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str9 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str10 = this.paymentForm.saved_info.shipping_address.country_iso2;
                                    this.countryName = str10;
                                    EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i9];
                                    if (str9 == null) {
                                        str9 = str10;
                                    }
                                    editTextBoldCursor2.setText(str9);
                                    break;
                                }
                                break;
                            case 5:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str6 = tL_paymentRequestedInfo10.name) != null) {
                                    this.inputFields[i9].setText(str6);
                                    break;
                                }
                                break;
                            case 7:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str7 = tL_paymentRequestedInfo11.email) != null) {
                                    this.inputFields[i9].setText(str7);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.inputFields[i9];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i9 == 8) {
                            TextView textView = new TextView(context);
                            this.textView = textView;
                            textView.setText("+");
                            this.textView.setTextColor(getThemedColor(i11));
                            this.textView.setTextSize(1, 16.0f);
                            frameLayout.addView(this.textView, LayoutHelper.createLinear(-2, -2, 21.0f, 12.0f, 0.0f, 6.0f));
                            this.inputFields[i9].setPadding(AndroidUtilities.dp(10.0f), r10, r10, r10);
                            this.inputFields[i9].setGravity(19);
                            InputFilter[] inputFilterArr = new InputFilter[1];
                            inputFilterArr[r10] = new InputFilter.LengthFilter(5);
                            this.inputFields[i9].setFilters(inputFilterArr);
                            frameLayout.addView(this.inputFields[i9], LayoutHelper.createLinear(55, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                            this.inputFields[i9].addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.PaymentFormActivity.3
                                @Override // android.text.TextWatcher
                                public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                }

                                @Override // android.text.TextWatcher
                                public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                }

                                @Override // android.text.TextWatcher
                                public void afterTextChanged(Editable editable) {
                                    String str11;
                                    boolean z3;
                                    String str12;
                                    if (PaymentFormActivity.this.ignoreOnTextChange) {
                                        return;
                                    }
                                    PaymentFormActivity.this.ignoreOnTextChange = true;
                                    String stripExceptNumbers = PhoneFormat.stripExceptNumbers(PaymentFormActivity.this.inputFields[8].getText().toString());
                                    PaymentFormActivity.this.inputFields[8].setText(stripExceptNumbers);
                                    HintEditText hintEditText = (HintEditText) PaymentFormActivity.this.inputFields[9];
                                    if (stripExceptNumbers.length() == 0) {
                                        hintEditText.setHintText((String) null);
                                        hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                    } else {
                                        int i12 = 4;
                                        if (stripExceptNumbers.length() > 4) {
                                            while (true) {
                                                if (i12 < 1) {
                                                    str11 = null;
                                                    z3 = false;
                                                    break;
                                                }
                                                String substring = stripExceptNumbers.substring(0, i12);
                                                if (((String) PaymentFormActivity.this.codesMap.get(substring)) != null) {
                                                    String str13 = stripExceptNumbers.substring(i12) + PaymentFormActivity.this.inputFields[9].getText().toString();
                                                    PaymentFormActivity.this.inputFields[8].setText(substring);
                                                    z3 = true;
                                                    str11 = str13;
                                                    stripExceptNumbers = substring;
                                                    break;
                                                }
                                                i12--;
                                            }
                                            if (!z3) {
                                                str11 = stripExceptNumbers.substring(1) + PaymentFormActivity.this.inputFields[9].getText().toString();
                                                EditTextBoldCursor editTextBoldCursor4 = PaymentFormActivity.this.inputFields[8];
                                                stripExceptNumbers = stripExceptNumbers.substring(0, 1);
                                                editTextBoldCursor4.setText(stripExceptNumbers);
                                            }
                                        } else {
                                            str11 = null;
                                            z3 = false;
                                        }
                                        String str14 = (String) PaymentFormActivity.this.codesMap.get(stripExceptNumbers);
                                        if (str14 != null && PaymentFormActivity.this.countriesArray.indexOf(str14) != -1 && (str12 = (String) PaymentFormActivity.this.phoneFormatMap.get(stripExceptNumbers)) != null) {
                                            hintEditText.setHintText(str12.replace('X', (char) 8211));
                                            hintEditText.setHint((CharSequence) null);
                                        } else {
                                            hintEditText.setHintText((String) null);
                                            hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                        }
                                        if (!z3) {
                                            PaymentFormActivity.this.inputFields[8].setSelection(PaymentFormActivity.this.inputFields[8].getText().length());
                                        }
                                        if (str11 != null) {
                                            hintEditText.requestFocus();
                                            hintEditText.setText(str11);
                                            hintEditText.setSelection(hintEditText.length());
                                        }
                                    }
                                    PaymentFormActivity.this.ignoreOnTextChange = false;
                                }
                            });
                        } else if (i9 == 9) {
                            this.inputFields[i9].setPadding(r10, r10, r10, r10);
                            this.inputFields[i9].setGravity(19);
                            frameLayout.addView(this.inputFields[i9], LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                            this.inputFields[i9].addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.PaymentFormActivity.4
                                private int actionPosition;
                                private int characterAction = -1;

                                @Override // android.text.TextWatcher
                                public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                }

                                @Override // android.text.TextWatcher
                                public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                    if (i13 == 0 && i14 == 1) {
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i13 == 1 && i14 == 0) {
                                        if (charSequence.charAt(i12) == ' ' && i12 > 0) {
                                            this.characterAction = 3;
                                            this.actionPosition = i12 - 1;
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
                                    int i12;
                                    int i13;
                                    if (PaymentFormActivity.this.ignoreOnPhoneChange) {
                                        return;
                                    }
                                    HintEditText hintEditText = (HintEditText) PaymentFormActivity.this.inputFields[9];
                                    int selectionStart = hintEditText.getSelectionStart();
                                    String obj = hintEditText.getText().toString();
                                    if (this.characterAction == 3) {
                                        obj = obj.substring(0, this.actionPosition) + obj.substring(this.actionPosition + 1);
                                        selectionStart--;
                                    }
                                    StringBuilder sb = new StringBuilder(obj.length());
                                    int i14 = 0;
                                    while (i14 < obj.length()) {
                                        int i15 = i14 + 1;
                                        String substring = obj.substring(i14, i15);
                                        if ("0123456789".contains(substring)) {
                                            sb.append(substring);
                                        }
                                        i14 = i15;
                                    }
                                    PaymentFormActivity.this.ignoreOnPhoneChange = true;
                                    String hintText = hintEditText.getHintText();
                                    if (hintText != null) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= sb.length()) {
                                                break;
                                            }
                                            if (i16 < hintText.length()) {
                                                if (hintText.charAt(i16) == ' ') {
                                                    sb.insert(i16, ' ');
                                                    i16++;
                                                    if (selectionStart == i16 && (i13 = this.characterAction) != 2 && i13 != 3) {
                                                        selectionStart++;
                                                    }
                                                }
                                                i16++;
                                            } else {
                                                sb.insert(i16, ' ');
                                                if (selectionStart == i16 + 1 && (i12 = this.characterAction) != 2 && i12 != 3) {
                                                    selectionStart++;
                                                }
                                            }
                                        }
                                    }
                                    hintEditText.setText(sb);
                                    if (selectionStart >= 0) {
                                        hintEditText.setSelection(Math.min(selectionStart, hintEditText.length()));
                                    }
                                    hintEditText.onTextChange();
                                    PaymentFormActivity.this.ignoreOnPhoneChange = false;
                                }
                            });
                        } else {
                            this.inputFields[i9].setPadding(r10, r10, r10, AndroidUtilities.dp(6.0f));
                            this.inputFields[i9].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout.addView(this.inputFields[i9], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        this.inputFields[i9].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda21
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i12, KeyEvent keyEvent) {
                                boolean lambda$createView$2;
                                lambda$createView$2 = PaymentFormActivity.this.lambda$createView$2(textView2, i12, keyEvent);
                                return lambda$createView$2;
                            }
                        });
                        if (i9 == 9) {
                            TLRPC.TL_invoice tL_invoice2 = this.paymentForm.invoice;
                            if (tL_invoice2.email_to_provider || tL_invoice2.phone_to_provider) {
                                TLRPC.User user2 = null;
                                int i12 = 0;
                                while (i12 < this.paymentForm.users.size()) {
                                    TLRPC.User user3 = this.paymentForm.users.get(i12);
                                    String str11 = str8;
                                    if (user3.id == this.paymentForm.provider_id) {
                                        user2 = user3;
                                    }
                                    i12++;
                                    str8 = str11;
                                }
                                str5 = str8;
                                String formatName = user2 != null ? ContactsController.formatName(user2.first_name, user2.last_name) : str5;
                                this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                                this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                                TLRPC.TL_invoice tL_invoice3 = this.paymentForm.invoice;
                                boolean z3 = tL_invoice3.email_to_provider;
                                if (z3 && tL_invoice3.phone_to_provider) {
                                    this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, formatName));
                                } else if (z3) {
                                    this.bottomCell[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, formatName));
                                } else {
                                    this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, formatName));
                                }
                            } else {
                                this.sectionCell[1] = new ShadowSectionCell(context, this.resourcesProvider);
                                this.linearLayout2.addView(this.sectionCell[1], LayoutHelper.createLinear(-1, i6));
                                str5 = str8;
                            }
                            TextCheckCell textCheckCell = new TextCheckCell(context, this.resourcesProvider);
                            this.checkCell1 = textCheckCell;
                            textCheckCell.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                            this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentShippingSave), this.saveShippingInfo, false);
                            this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                            this.checkCell1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda22
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    PaymentFormActivity.this.lambda$createView$3(view2);
                                }
                            });
                            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                            this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                        } else {
                            str5 = str8;
                        }
                        i9++;
                        str8 = str5;
                        i8 = 10;
                        i5 = 3;
                        r10 = 0;
                        i6 = -2;
                    }
                    if (this.paymentForm.invoice.name_requested) {
                        i3 = 8;
                    } else {
                        i3 = 8;
                        ((ViewGroup) this.inputFields[6].getParent()).setVisibility(8);
                    }
                    if (!this.paymentForm.invoice.phone_requested) {
                        ((ViewGroup) this.inputFields[i3].getParent()).setVisibility(i3);
                    }
                    if (!this.paymentForm.invoice.email_requested) {
                        ((ViewGroup) this.inputFields[7].getParent()).setVisibility(i3);
                    }
                    TLRPC.TL_invoice tL_invoice4 = this.paymentForm.invoice;
                    if (tL_invoice4.phone_requested) {
                        this.inputFields[9].setImeOptions(268435462);
                    } else if (tL_invoice4.email_requested) {
                        this.inputFields[7].setImeOptions(268435462);
                    } else if (tL_invoice4.name_requested) {
                        this.inputFields[6].setImeOptions(268435462);
                    } else {
                        this.inputFields[5].setImeOptions(268435462);
                    }
                    ShadowSectionCell shadowSectionCell = this.sectionCell[1];
                    if (shadowSectionCell != null) {
                        TLRPC.TL_invoice tL_invoice5 = this.paymentForm.invoice;
                        shadowSectionCell.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        TextInfoPrivacyCell textInfoPrivacyCell = this.bottomCell[1];
                        if (textInfoPrivacyCell != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.paymentForm.invoice;
                            textInfoPrivacyCell.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    HeaderCell headerCell = this.headerCell[1];
                    TLRPC.TL_invoice tL_invoice7 = this.paymentForm.invoice;
                    headerCell.setVisibility((tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.paymentForm.invoice.shipping_address_requested) {
                        this.headerCell[0].setVisibility(8);
                        this.sectionCell[0].setVisibility(8);
                        ((ViewGroup) this.inputFields[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.inputFields[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.inputFields[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.inputFields[3].getParent()).setVisibility(8);
                        ((ViewGroup) this.inputFields[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.inputFields[5].getParent()).setVisibility(8);
                    }
                    TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = this.paymentForm.saved_info;
                    if (tL_paymentRequestedInfo12 != null && !TextUtils.isEmpty(tL_paymentRequestedInfo12.phone)) {
                        fillNumber(this.paymentForm.saved_info.phone);
                    } else {
                        fillNumber(null);
                    }
                    if (this.inputFields[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm3 = this.paymentForm;
                        if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo3 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone))) {
                            try {
                                telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            if (telephonyManager != null) {
                                str3 = telephonyManager.getSimCountryIso().toUpperCase();
                                if (str3 != null && (str4 = (String) hashMap.get(str3)) != null && this.countriesArray.indexOf(str4) != -1) {
                                    this.inputFields[8].setText((CharSequence) this.countriesMap.get(str4));
                                }
                            }
                            str3 = null;
                            if (str3 != null) {
                                this.inputFields[8].setText((CharSequence) this.countriesMap.get(str4));
                            }
                        }
                    }
                }
            }
        } else if (i7 == 2) {
            if (this.paymentForm.native_params != null) {
                try {
                    JSONObject jSONObject = new JSONObject(this.paymentForm.native_params.data);
                    String optString = jSONObject.optString("google_pay_public_key");
                    if (!TextUtils.isEmpty(optString)) {
                        this.googlePayPublicKey = optString;
                    }
                    this.googlePayCountryCode = jSONObject.optString("acquirer_bank_country");
                    this.googlePayParameters = jSONObject.optJSONObject("gpay_parameters");
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            }
            if (this.isWebView || this.paymentFormMethod != null) {
                if (this.googlePayPublicKey != null || this.googlePayParameters != null) {
                    initGooglePay(context);
                }
                createGooglePayButton(context);
                this.linearLayout2.addView(this.googlePayContainer, LayoutHelper.createLinear(-1, 50));
                this.webviewLoading = true;
                showEditDoneProgress(true, true);
                this.progressView.setVisibility(0);
                this.doneItem.setEnabled(false);
                this.doneItem.getContentView().setVisibility(4);
                AndroidUtilities.checkAndroidTheme(context, true);
                WebView webView = new WebView(context) { // from class: org.telegram.ui.PaymentFormActivity.5
                    @Override // android.webkit.WebView, android.view.View
                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        ((ViewGroup) PaymentFormActivity.this.fragmentView).requestDisallowInterceptTouchEvent(true);
                        return super.onTouchEvent(motionEvent);
                    }

                    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
                    protected void onMeasure(int i13, int i14) {
                        super.onMeasure(i13, i14);
                    }
                };
                this.webView = webView;
                webView.getSettings().setJavaScriptEnabled(true);
                this.webView.getSettings().setDomStorageEnabled(true);
                this.webView.getSettings().setSupportZoom(true);
                this.webView.getSettings().setBuiltInZoomControls(true);
                this.webView.getSettings().setDisplayZoomControls(false);
                this.webView.getSettings().setUseWideViewPort(true);
                this.webView.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
                this.webView.addJavascriptInterface(new TelegramWebviewProxy(), "TelegramWebviewProxy");
                this.webView.setWebViewClient(new 6(context));
                this.linearLayout2.addView(this.webView, LayoutHelper.createFrame(-1, -2.0f));
                this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
                this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                TextCheckCell textCheckCell2 = new TextCheckCell(context, this.resourcesProvider);
                this.checkCell1 = textCheckCell2;
                textCheckCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                this.checkCell1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda26
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PaymentFormActivity.this.lambda$createView$4(view2);
                    }
                });
                this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                updateSavePaymentField();
                this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
            } else {
                if (this.paymentForm.native_params != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(this.paymentForm.native_params.data);
                        try {
                            this.need_card_country = jSONObject2.getBoolean("need_country");
                        } catch (Exception unused) {
                            this.need_card_country = false;
                        }
                        try {
                            this.need_card_postcode = jSONObject2.getBoolean("need_zip");
                        } catch (Exception unused2) {
                            this.need_card_postcode = false;
                        }
                        try {
                            this.need_card_name = jSONObject2.getBoolean("need_cardholder_name");
                        } catch (Exception unused3) {
                            this.need_card_name = false;
                        }
                        if (jSONObject2.has("public_token")) {
                            this.providerApiKey = jSONObject2.getString("public_token");
                        } else {
                            try {
                                this.providerApiKey = jSONObject2.getString("publishable_key");
                            } catch (Exception unused4) {
                                this.providerApiKey = "";
                            }
                        }
                        this.initGooglePay = !jSONObject2.optBoolean("google_pay_hidden", false);
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                }
                if (this.initGooglePay && ((!TextUtils.isEmpty(this.providerApiKey) && "stripe".equals(this.paymentForm.native_provider)) || this.googlePayParameters != null)) {
                    initGooglePay(context);
                }
                this.inputFields = new EditTextBoldCursor[6];
                int i13 = 0;
                for (int i14 = 6; i13 < i14; i14 = 6) {
                    if (i13 == 0) {
                        this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                        this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        this.headerCell[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                        this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i13 == 4) {
                        this.headerCell[1] = new HeaderCell(context, this.resourcesProvider);
                        this.headerCell[1].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        this.headerCell[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                        this.linearLayout2.addView(this.headerCell[1], LayoutHelper.createLinear(-1, -2));
                    }
                    boolean z4 = (i13 == 3 || i13 == 5 || (i13 == 4 && !this.need_card_postcode)) ? false : true;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    frameLayout3.setClipChildren(false);
                    int i15 = Theme.key_windowBackgroundWhite;
                    frameLayout3.setBackgroundColor(getThemedColor(i15));
                    this.linearLayout2.addView(frameLayout3, LayoutHelper.createLinear(-1, 50));
                    this.inputFields[i13] = new EditTextBoldCursor(context);
                    this.inputFields[i13].setTag(Integer.valueOf(i13));
                    this.inputFields[i13].setTextSize(1, 16.0f);
                    this.inputFields[i13].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                    EditTextBoldCursor editTextBoldCursor4 = this.inputFields[i13];
                    int i16 = Theme.key_windowBackgroundWhiteBlackText;
                    editTextBoldCursor4.setTextColor(getThemedColor(i16));
                    this.inputFields[i13].setBackgroundDrawable(null);
                    this.inputFields[i13].setCursorColor(getThemedColor(i16));
                    this.inputFields[i13].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.inputFields[i13].setCursorWidth(1.5f);
                    if (i13 == 3) {
                        this.inputFields[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                        this.inputFields[i13].setInputType(NotificationCenter.dialogTranslate);
                        this.inputFields[i13].setTypeface(Typeface.DEFAULT);
                        this.inputFields[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else if (i13 == 0) {
                        this.inputFields[i13].setInputType(3);
                    } else if (i13 == 4) {
                        this.inputFields[i13].setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda23
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                boolean lambda$createView$6;
                                lambda$createView$6 = PaymentFormActivity.this.lambda$createView$6(view2, motionEvent);
                                return lambda$createView$6;
                            }
                        });
                        this.inputFields[i13].setInputType(0);
                    } else if (i13 == 1) {
                        this.inputFields[i13].setInputType(16386);
                    } else if (i13 == 2) {
                        this.inputFields[i13].setInputType(4097);
                    } else {
                        this.inputFields[i13].setInputType(16385);
                        this.inputFields[i13].setImeOptions(268435461);
                        if (i13 != 0) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                        } else if (i13 == 1) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                        } else if (i13 == 2) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardName));
                        } else if (i13 == 3) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                        } else if (i13 == 4) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                        } else if (i13 == 5) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                        }
                        if (i13 != 0) {
                            this.inputFields[i13].addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.PaymentFormActivity.7
                                private int actionPosition;
                                public final String[] PREFIXES_15 = {"34", "37"};
                                public final String[] PREFIXES_14 = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
                                public final String[] PREFIXES_16 = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
                                private int characterAction = -1;

                                @Override // android.text.TextWatcher
                                public void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override // android.text.TextWatcher
                                public void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                    if (i18 == 0 && i19 == 1) {
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i18 == 1 && i19 == 0) {
                                        if (charSequence.charAt(i17) == ' ' && i17 > 0) {
                                            this.characterAction = 3;
                                            this.actionPosition = i17 - 1;
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
                                    boolean z5;
                                    int i17;
                                    int i18;
                                    String[] strArr;
                                    int i19;
                                    String str12;
                                    if (PaymentFormActivity.this.ignoreOnCardChange) {
                                        return;
                                    }
                                    EditTextBoldCursor editTextBoldCursor5 = PaymentFormActivity.this.inputFields[0];
                                    int selectionStart = editTextBoldCursor5.getSelectionStart();
                                    String obj = editTextBoldCursor5.getText().toString();
                                    if (this.characterAction == 3) {
                                        obj = obj.substring(0, this.actionPosition) + obj.substring(this.actionPosition + 1);
                                        selectionStart--;
                                    }
                                    StringBuilder sb = new StringBuilder(obj.length());
                                    int i20 = 0;
                                    while (i20 < obj.length()) {
                                        int i21 = i20 + 1;
                                        String substring = obj.substring(i20, i21);
                                        if ("0123456789".contains(substring)) {
                                            sb.append(substring);
                                        }
                                        i20 = i21;
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = true;
                                    String str13 = null;
                                    int i22 = 100;
                                    if (sb.length() > 0) {
                                        String sb2 = sb.toString();
                                        int i23 = 0;
                                        for (int i24 = 3; i23 < i24; i24 = 3) {
                                            if (i23 == 0) {
                                                strArr = this.PREFIXES_16;
                                                i19 = 16;
                                                str12 = "xxxx xxxx xxxx xxxx";
                                            } else if (i23 == 1) {
                                                strArr = this.PREFIXES_15;
                                                i19 = 15;
                                                str12 = "xxxx xxxx xxxx xxx";
                                            } else {
                                                strArr = this.PREFIXES_14;
                                                i19 = 14;
                                                str12 = "xxxx xxxx xxxx xx";
                                            }
                                            for (String str14 : strArr) {
                                                if (sb2.length() <= str14.length()) {
                                                    if (str14.startsWith(sb2)) {
                                                        i22 = i19;
                                                        str13 = str12;
                                                        break;
                                                    }
                                                } else {
                                                    if (sb2.startsWith(str14)) {
                                                        i22 = i19;
                                                        str13 = str12;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (str13 != null) {
                                                break;
                                            }
                                            i23++;
                                        }
                                        if (sb.length() > i22) {
                                            sb.setLength(i22);
                                        }
                                    }
                                    if (str13 != null) {
                                        if (sb.length() == i22) {
                                            PaymentFormActivity.this.inputFields[1].requestFocus();
                                        }
                                        editTextBoldCursor5.setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 >= sb.length()) {
                                                break;
                                            }
                                            if (i25 < str13.length()) {
                                                if (str13.charAt(i25) == ' ') {
                                                    sb.insert(i25, ' ');
                                                    i25++;
                                                    if (selectionStart == i25 && (i18 = this.characterAction) != 2 && i18 != 3) {
                                                        selectionStart++;
                                                    }
                                                }
                                                i25++;
                                            } else {
                                                sb.insert(i25, ' ');
                                                if (selectionStart == i25 + 1 && (i17 = this.characterAction) != 2 && i17 != 3) {
                                                    selectionStart++;
                                                }
                                            }
                                        }
                                    }
                                    if (sb.toString().equals(editable.toString())) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                        editable.replace(0, editable.length(), sb);
                                    }
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor5.setSelection(Math.min(selectionStart, editTextBoldCursor5.length()));
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = z5;
                                }
                            });
                        } else if (i13 == 1) {
                            this.inputFields[i13].addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.PaymentFormActivity.8
                                private int actionPosition;
                                private int characterAction = -1;
                                private boolean isYear;

                                @Override // android.text.TextWatcher
                                public void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override // android.text.TextWatcher
                                public void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                    if (i18 == 0 && i19 == 1) {
                                        this.isYear = TextUtils.indexOf((CharSequence) PaymentFormActivity.this.inputFields[1].getText(), '/') != -1;
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i18 == 1 && i19 == 0) {
                                        if (charSequence.charAt(i17) == '/' && i17 > 0) {
                                            this.isYear = false;
                                            this.characterAction = 3;
                                            this.actionPosition = i17 - 1;
                                            return;
                                        }
                                        this.characterAction = 2;
                                        return;
                                    }
                                    this.characterAction = -1;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:51:0x019f  */
                                /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
                                /* JADX WARN: Removed duplicated region for block: B:59:0x01c1  */
                                /* JADX WARN: Removed duplicated region for block: B:63:0x01dc  */
                                /* JADX WARN: Removed duplicated region for block: B:66:0x01c7  */
                                @Override // android.text.TextWatcher
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public void afterTextChanged(Editable editable) {
                                    if (PaymentFormActivity.this.ignoreOnCardChange) {
                                        return;
                                    }
                                    boolean z5 = true;
                                    EditTextBoldCursor editTextBoldCursor5 = PaymentFormActivity.this.inputFields[1];
                                    int selectionStart = editTextBoldCursor5.getSelectionStart();
                                    String obj = editTextBoldCursor5.getText().toString();
                                    if (this.characterAction == 3) {
                                        obj = obj.substring(0, this.actionPosition) + obj.substring(this.actionPosition + 1);
                                        selectionStart--;
                                    }
                                    StringBuilder sb = new StringBuilder(obj.length());
                                    int i17 = 0;
                                    while (i17 < obj.length()) {
                                        int i18 = i17 + 1;
                                        String substring = obj.substring(i17, i18);
                                        if ("0123456789".contains(substring)) {
                                            sb.append(substring);
                                        }
                                        i17 = i18;
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = true;
                                    PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                    if (sb.length() > 4) {
                                        sb.setLength(4);
                                    }
                                    if (sb.length() < 2) {
                                        this.isYear = false;
                                    }
                                    if (this.isYear) {
                                        int i19 = sb.length() > 2 ? 2 : 1;
                                        String[] strArr = new String[i19];
                                        strArr[0] = sb.substring(0, 2);
                                        if (i19 == 2) {
                                            strArr[1] = sb.substring(2);
                                        }
                                        if (sb.length() == 4 && i19 == 2) {
                                            int intValue = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                            int intValue2 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
                                            Calendar calendar = Calendar.getInstance();
                                            boolean z6 = UserConfig.getInstance(((BaseFragment) PaymentFormActivity.this).currentAccount).getClientPhone().startsWith("7") || (PaymentFormActivity.this.country != null && PaymentFormActivity.this.country.code.equals("7"));
                                            int i20 = z6 ? 2022 : calendar.get(1);
                                            int i21 = z6 ? 1 : calendar.get(2) + 1;
                                            if (intValue2 < i20 || (intValue2 == i20 && intValue < i21)) {
                                                PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                                if (!z5) {
                                                }
                                                if (sb.length() != 2) {
                                                }
                                                selectionStart++;
                                                editTextBoldCursor5.setText(sb);
                                                if (selectionStart >= 0) {
                                                }
                                                PaymentFormActivity.this.ignoreOnCardChange = false;
                                            }
                                            z5 = false;
                                            if (!z5) {
                                            }
                                            if (sb.length() != 2) {
                                            }
                                            selectionStart++;
                                            editTextBoldCursor5.setText(sb);
                                            if (selectionStart >= 0) {
                                            }
                                            PaymentFormActivity.this.ignoreOnCardChange = false;
                                        }
                                        int intValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                        if (intValue3 > 12 || intValue3 == 0) {
                                            PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                            if (!z5 && sb.length() == 4) {
                                                PaymentFormActivity.this.inputFields[PaymentFormActivity.this.need_card_name ? (char) 2 : (char) 3].requestFocus();
                                            }
                                            if (sb.length() != 2) {
                                                sb.append('/');
                                            } else {
                                                if (sb.length() > 2 && sb.charAt(2) != '/') {
                                                    sb.insert(2, '/');
                                                }
                                                editTextBoldCursor5.setText(sb);
                                                if (selectionStart >= 0) {
                                                    editTextBoldCursor5.setSelection(Math.min(selectionStart, editTextBoldCursor5.length()));
                                                }
                                                PaymentFormActivity.this.ignoreOnCardChange = false;
                                            }
                                            selectionStart++;
                                            editTextBoldCursor5.setText(sb);
                                            if (selectionStart >= 0) {
                                            }
                                            PaymentFormActivity.this.ignoreOnCardChange = false;
                                        }
                                        z5 = false;
                                        if (!z5) {
                                            PaymentFormActivity.this.inputFields[PaymentFormActivity.this.need_card_name ? (char) 2 : (char) 3].requestFocus();
                                        }
                                        if (sb.length() != 2) {
                                        }
                                        selectionStart++;
                                        editTextBoldCursor5.setText(sb);
                                        if (selectionStart >= 0) {
                                        }
                                        PaymentFormActivity.this.ignoreOnCardChange = false;
                                    }
                                    if (sb.length() == 1) {
                                        int intValue4 = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                                        if (intValue4 != 1 && intValue4 != 0) {
                                            sb.insert(0, "0");
                                            selectionStart++;
                                        }
                                    } else if (sb.length() == 2) {
                                        int intValue5 = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                                        if (intValue5 > 12 || intValue5 == 0) {
                                            PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                        } else {
                                            z5 = false;
                                        }
                                        selectionStart++;
                                        if (!z5) {
                                        }
                                        if (sb.length() != 2) {
                                        }
                                        selectionStart++;
                                        editTextBoldCursor5.setText(sb);
                                        if (selectionStart >= 0) {
                                        }
                                        PaymentFormActivity.this.ignoreOnCardChange = false;
                                    }
                                    z5 = false;
                                    if (!z5) {
                                    }
                                    if (sb.length() != 2) {
                                    }
                                    selectionStart++;
                                    editTextBoldCursor5.setText(sb);
                                    if (selectionStart >= 0) {
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = false;
                                }
                            });
                        }
                        this.inputFields[i13].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.inputFields[i13].setGravity(!LocaleController.isRTL ? 5 : 3);
                        frameLayout3.addView(this.inputFields[i13], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        this.inputFields[i13].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda24
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i17, KeyEvent keyEvent) {
                                boolean lambda$createView$7;
                                lambda$createView$7 = PaymentFormActivity.this.lambda$createView$7(textView2, i17, keyEvent);
                                return lambda$createView$7;
                            }
                        });
                        if (i13 != 3) {
                            this.sectionCell[0] = new ShadowSectionCell(context, this.resourcesProvider);
                            this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
                        } else if (i13 == 5) {
                            this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
                            this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                            TextCheckCell textCheckCell3 = new TextCheckCell(context, this.resourcesProvider);
                            this.checkCell1 = textCheckCell3;
                            textCheckCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                            this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                            this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                            this.checkCell1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda25
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    PaymentFormActivity.this.lambda$createView$8(view2);
                                }
                            });
                            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                            updateSavePaymentField();
                            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                        } else if (i13 == 0) {
                            createGooglePayButton(context);
                            frameLayout3.addView(this.googlePayContainer, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                        }
                        if (z4) {
                            View view2 = new View(context) { // from class: org.telegram.ui.PaymentFormActivity.9
                                @Override // android.view.View
                                protected void onDraw(Canvas canvas) {
                                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                                }
                            };
                            view2.setBackgroundColor(getThemedColor(i15));
                            this.dividers.add(view2);
                            frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        if ((i13 == 4 && !this.need_card_country) || ((i13 == 5 && !this.need_card_postcode) || (i13 == 2 && !this.need_card_name))) {
                            frameLayout3.setVisibility(8);
                        }
                        i13++;
                    }
                    this.inputFields[i13].setImeOptions(268435461);
                    if (i13 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    this.inputFields[i13].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.inputFields[i13].setGravity(!LocaleController.isRTL ? 5 : 3);
                    frameLayout3.addView(this.inputFields[i13], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    this.inputFields[i13].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda24
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView2, int i17, KeyEvent keyEvent) {
                            boolean lambda$createView$7;
                            lambda$createView$7 = PaymentFormActivity.this.lambda$createView$7(textView2, i17, keyEvent);
                            return lambda$createView$7;
                        }
                    });
                    if (i13 != 3) {
                    }
                    if (z4) {
                    }
                    if (i13 == 4) {
                        frameLayout3.setVisibility(8);
                        i13++;
                    }
                    frameLayout3.setVisibility(8);
                    i13++;
                }
                if (!this.need_card_country && !this.need_card_postcode) {
                    this.headerCell[1].setVisibility(8);
                    this.sectionCell[0].setVisibility(8);
                }
                if (this.need_card_postcode) {
                    this.inputFields[5].setImeOptions(268435462);
                } else {
                    this.inputFields[3].setImeOptions(268435462);
                }
            }
        } else if (i7 == 1) {
            ArrayList<TLRPC.TL_shippingOption> arrayList = this.requestedInfo.shipping_options;
            int size = arrayList == null ? 0 : arrayList.size();
            this.radioCells = new RadioCell[size];
            int i17 = 0;
            while (i17 < size) {
                TLRPC.TL_shippingOption tL_shippingOption = this.requestedInfo.shipping_options.get(i17);
                this.radioCells[i17] = new RadioCell(context);
                this.radioCells[i17].setTag(Integer.valueOf(i17));
                this.radioCells[i17].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.radioCells[i17].setText(String.format("%s - %s", getTotalPriceString(tL_shippingOption.prices), tL_shippingOption.title), i17 == 0, i17 != size + (-1));
                this.radioCells[i17].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda27
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        PaymentFormActivity.this.lambda$createView$9(view3);
                    }
                });
                this.linearLayout2.addView(this.radioCells[i17]);
                i17++;
            }
            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
        } else if (i7 == 3) {
            this.inputFields = new EditTextBoldCursor[2];
            int i18 = 0;
            for (int i19 = 2; i18 < i19; i19 = 2) {
                if (i18 == 0) {
                    z = false;
                    this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                    this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                } else {
                    z = false;
                }
                FrameLayout frameLayout4 = new FrameLayout(context);
                frameLayout4.setClipChildren(z);
                this.linearLayout2.addView(frameLayout4, LayoutHelper.createLinear(-1, 50));
                int i20 = Theme.key_windowBackgroundWhite;
                frameLayout4.setBackgroundColor(getThemedColor(i20));
                boolean z5 = i18 != 1;
                if (z5) {
                    if (i18 != 7 || this.paymentForm.invoice.phone_requested) {
                        if (i18 == 6) {
                            TLRPC.TL_invoice tL_invoice8 = this.paymentForm.invoice;
                            if (!tL_invoice8.phone_requested) {
                            }
                        }
                    }
                    z5 = false;
                }
                if (z5) {
                    View view3 = new View(context) { // from class: org.telegram.ui.PaymentFormActivity.10
                        @Override // android.view.View
                        protected void onDraw(Canvas canvas) {
                            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                        }
                    };
                    view3.setBackgroundColor(getThemedColor(i20));
                    this.dividers.add(view3);
                    frameLayout4.addView(view3, new FrameLayout.LayoutParams(-1, 1, 83));
                }
                this.inputFields[i18] = new EditTextBoldCursor(context);
                this.inputFields[i18].setTag(Integer.valueOf(i18));
                this.inputFields[i18].setTextSize(1, 16.0f);
                this.inputFields[i18].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor5 = this.inputFields[i18];
                int i21 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor5.setTextColor(getThemedColor(i21));
                this.inputFields[i18].setBackgroundDrawable(null);
                this.inputFields[i18].setCursorColor(getThemedColor(i21));
                this.inputFields[i18].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i18].setCursorWidth(1.5f);
                if (i18 == 0) {
                    this.inputFields[i18].setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda28
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view4, MotionEvent motionEvent) {
                            boolean lambda$createView$10;
                            lambda$createView$10 = PaymentFormActivity.lambda$createView$10(view4, motionEvent);
                            return lambda$createView$10;
                        }
                    });
                    this.inputFields[i18].setInputType(0);
                } else {
                    this.inputFields[i18].setInputType(NotificationCenter.dialogIsTranslatable);
                    this.inputFields[i18].setTypeface(Typeface.DEFAULT);
                }
                this.inputFields[i18].setImeOptions(268435462);
                if (i18 == 0) {
                    EditTextBoldCursor editTextBoldCursor6 = this.inputFields[i18];
                    TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.savedCredentialsCard;
                    editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                } else if (i18 == 1) {
                    this.inputFields[i18].setHint(LocaleController.getString(R.string.LoginPassword));
                    this.inputFields[i18].requestFocus();
                }
                this.inputFields[i18].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[i18].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout4.addView(this.inputFields[i18], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.inputFields[i18].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda4
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView2, int i22, KeyEvent keyEvent) {
                        boolean lambda$createView$11;
                        lambda$createView$11 = PaymentFormActivity.this.lambda$createView$11(textView2, i22, keyEvent);
                        return lambda$createView$11;
                    }
                });
                if (i18 == 1) {
                    this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    TextInfoPrivacyCell textInfoPrivacyCell2 = this.bottomCell[0];
                    int i22 = R.string.PaymentConfirmationMessage;
                    TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.savedCredentialsCard;
                    textInfoPrivacyCell2.setText(LocaleController.formatString("PaymentConfirmationMessage", i22, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                    TextInfoPrivacyCell textInfoPrivacyCell3 = this.bottomCell[0];
                    int i23 = R.drawable.greydivider;
                    int i24 = Theme.key_windowBackgroundGrayShadow;
                    textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i23, i24));
                    this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                    this.settingsCell[0] = new TextSettingsCell(context, this.resourcesProvider);
                    this.settingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    this.settingsCell[0].setText(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                    this.linearLayout2.addView(this.settingsCell[0], LayoutHelper.createLinear(-1, -2));
                    this.settingsCell[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            PaymentFormActivity.this.lambda$createView$12(view4);
                        }
                    });
                    this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i24));
                    this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                }
                i18++;
            }
        } else if (i7 == 4 || i7 == 5) {
            PaymentInfoCell paymentInfoCell = new PaymentInfoCell(context);
            this.paymentInfoCell = paymentInfoCell;
            paymentInfoCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                this.paymentInfoCell.setInvoice((TLRPC.TL_messageMediaInvoice) messageObject.messageOwner.media, this.currentBotName);
            } else {
                TLRPC.PaymentReceipt paymentReceipt = this.paymentReceipt;
                if (paymentReceipt != null) {
                    this.paymentInfoCell.setReceipt(paymentReceipt, this.currentBotName);
                } else if (this.invoiceSlug != null || this.invoiceInput != null) {
                    PaymentInfoCell paymentInfoCell2 = this.paymentInfoCell;
                    TLRPC.PaymentForm paymentForm4 = this.paymentForm;
                    paymentInfoCell2.setInfo(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.currentBotName, paymentForm4);
                }
            }
            this.linearLayout2.addView(this.paymentInfoCell, LayoutHelper.createLinear(-1, -2));
            this.sectionCell[0] = new ShadowSectionCell(context, this.resourcesProvider);
            this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
            ArrayList arrayList2 = new ArrayList(this.paymentForm.invoice.prices);
            this.prices = arrayList2;
            TLRPC.TL_shippingOption tL_shippingOption2 = this.shippingOption;
            if (tL_shippingOption2 != null) {
                arrayList2.addAll(tL_shippingOption2.prices);
            }
            this.totalPrice = new String[1];
            for (int i25 = 0; i25 < this.prices.size(); i25++) {
                TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.prices.get(i25);
                TextPriceCell textPriceCell = new TextPriceCell(context);
                textPriceCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                textPriceCell.setTextAndValue(tL_labeledPrice.label, LocaleController.getInstance().formatCurrencyString(tL_labeledPrice.amount, this.paymentForm.invoice.currency), false);
                this.linearLayout2.addView(textPriceCell);
            }
            if (this.currentStep == 5 && this.tipAmount != null) {
                TextPriceCell textPriceCell2 = new TextPriceCell(context);
                textPriceCell2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                textPriceCell2.setTextAndValue(LocaleController.getString(R.string.PaymentTip), LocaleController.getInstance().formatCurrencyString(this.tipAmount.longValue(), this.paymentForm.invoice.currency), false);
                this.linearLayout2.addView(textPriceCell2);
            }
            TextPriceCell textPriceCell3 = new TextPriceCell(context);
            this.totalCell = textPriceCell3;
            int i26 = Theme.key_windowBackgroundWhite;
            textPriceCell3.setBackgroundColor(getThemedColor(i26));
            this.totalPrice[0] = getTotalPriceString(this.prices);
            this.totalCell.setTextAndValue(LocaleController.getString(R.string.PaymentTransactionTotal), this.totalPrice[0], true);
            if (this.currentStep == 4 && (this.paymentForm.invoice.flags & 256) != 0) {
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setClipChildren(false);
                frameLayout5.setBackgroundColor(getThemedColor(i26));
                this.linearLayout2.addView(frameLayout5, LayoutHelper.createLinear(-1, this.paymentForm.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda10
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        PaymentFormActivity.this.lambda$createView$13(view4);
                    }
                });
                TextPriceCell textPriceCell4 = new TextPriceCell(context);
                textPriceCell4.setBackgroundColor(getThemedColor(i26));
                textPriceCell4.setTextAndValue(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                frameLayout5.addView(textPriceCell4);
                this.inputFields = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                this.inputFields[0].setTag(0);
                this.inputFields[0].setTextSize(1, 16.0f);
                EditTextBoldCursor editTextBoldCursor7 = this.inputFields[0];
                int i27 = Theme.key_windowBackgroundWhiteGrayText2;
                editTextBoldCursor7.setHintTextColor(getThemedColor(i27));
                this.inputFields[0].setTextColor(getThemedColor(i27));
                this.inputFields[0].setBackgroundDrawable(null);
                this.inputFields[0].setCursorColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                this.inputFields[0].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[0].setCursorWidth(1.5f);
                this.inputFields[0].setInputType(3);
                this.inputFields[0].setImeOptions(268435462);
                this.inputFields[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.paymentForm.invoice.currency));
                this.inputFields[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[0].setGravity(LocaleController.isRTL ? 3 : 5);
                frameLayout5.addView(this.inputFields[0], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                this.inputFields[0].addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.PaymentFormActivity.11
                    private boolean anyBefore;
                    private int beforeTextLength;
                    char[] commas = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
                    private int enteredCharacterStart;
                    private boolean isDeletedChar;
                    private boolean lastDotEntered;
                    private String overrideText;

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i28, int i29, int i30) {
                    }

                    private int indexOfComma(String str12) {
                        int i28 = 0;
                        while (true) {
                            char[] cArr = this.commas;
                            if (i28 >= cArr.length) {
                                return -1;
                            }
                            int indexOf = str12.indexOf(cArr[i28]);
                            if (indexOf >= 0) {
                                return indexOf;
                            }
                            i28++;
                        }
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i28, int i29, int i30) {
                        if (PaymentFormActivity.this.ignoreOnTextChange) {
                            return;
                        }
                        this.anyBefore = !TextUtils.isEmpty(charSequence);
                        this.overrideText = null;
                        this.beforeTextLength = charSequence == null ? 0 : charSequence.length();
                        this.enteredCharacterStart = i28;
                        boolean z6 = i29 == 1 && i30 == 0;
                        this.isDeletedChar = z6;
                        if (!z6) {
                            return;
                        }
                        String fixNumbers = LocaleController.fixNumbers(charSequence);
                        char charAt = fixNumbers.charAt(i28);
                        int indexOfComma = indexOfComma(fixNumbers);
                        String substring = indexOfComma >= 0 ? fixNumbers.substring(indexOfComma + 1) : "";
                        long longValue2 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(substring)).longValue();
                        if ((charAt >= '0' && charAt <= '9') || (substring.length() != 0 && longValue2 == 0)) {
                            if (indexOfComma <= 0 || i28 <= indexOfComma || longValue2 != 0) {
                                return;
                            }
                            this.overrideText = fixNumbers.substring(0, indexOfComma - 1);
                            return;
                        }
                        while (true) {
                            int i31 = i28 - 1;
                            if (i31 < 0) {
                                return;
                            }
                            char charAt2 = fixNumbers.charAt(i31);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                                this.overrideText = fixNumbers.substring(0, i31) + fixNumbers.substring(i28);
                                return;
                            }
                            i28 = i31;
                        }
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        boolean z6;
                        String substring;
                        if (PaymentFormActivity.this.ignoreOnTextChange) {
                            return;
                        }
                        long longValue2 = PaymentFormActivity.this.tipAmount != null ? PaymentFormActivity.this.tipAmount.longValue() : 0L;
                        String str12 = this.overrideText;
                        if (str12 == null) {
                            str12 = LocaleController.fixNumbers(editable.toString());
                        }
                        int indexOfComma = indexOfComma(str12);
                        boolean z7 = indexOfComma >= 0;
                        int currencyExpDivider = LocaleController.getCurrencyExpDivider(PaymentFormActivity.this.paymentForm.invoice.currency);
                        String substring2 = indexOfComma >= 0 ? str12.substring(0, indexOfComma) : str12;
                        String str13 = "";
                        String substring3 = indexOfComma >= 0 ? str12.substring(indexOfComma + 1) : "";
                        long longValue3 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(substring2)).longValue() * currencyExpDivider;
                        long longValue4 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(substring3)).longValue();
                        String str14 = "" + longValue4;
                        String str15 = "" + (currencyExpDivider - 1);
                        if (indexOfComma > 0 && str14.length() > str15.length()) {
                            if (this.enteredCharacterStart - indexOfComma < str14.length()) {
                                substring = str14.substring(0, str15.length());
                            } else {
                                substring = str14.substring(str14.length() - str15.length());
                            }
                            longValue4 = Utilities.parseLong(substring).longValue();
                        }
                        PaymentFormActivity.this.tipAmount = Long.valueOf(longValue3 + longValue4);
                        if (PaymentFormActivity.this.paymentForm.invoice.max_tip_amount != 0 && PaymentFormActivity.this.tipAmount.longValue() > PaymentFormActivity.this.paymentForm.invoice.max_tip_amount) {
                            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                            paymentFormActivity.tipAmount = Long.valueOf(paymentFormActivity.paymentForm.invoice.max_tip_amount);
                        }
                        int selectionStart = PaymentFormActivity.this.inputFields[0].getSelectionStart();
                        PaymentFormActivity.this.ignoreOnTextChange = true;
                        if (PaymentFormActivity.this.tipAmount.longValue() == 0) {
                            PaymentFormActivity.this.inputFields[0].setText("");
                            z6 = z7;
                        } else {
                            EditTextBoldCursor editTextBoldCursor8 = PaymentFormActivity.this.inputFields[0];
                            z6 = z7;
                            str13 = LocaleController.getInstance().formatCurrencyString(PaymentFormActivity.this.tipAmount.longValue(), false, z7, true, PaymentFormActivity.this.paymentForm.invoice.currency);
                            editTextBoldCursor8.setText(str13);
                        }
                        if (longValue2 < PaymentFormActivity.this.tipAmount.longValue() && longValue2 != 0 && this.anyBefore && selectionStart >= 0) {
                            PaymentFormActivity.this.inputFields[0].setSelection(Math.min(selectionStart, PaymentFormActivity.this.inputFields[0].length()));
                        } else if (this.isDeletedChar && this.beforeTextLength != PaymentFormActivity.this.inputFields[0].length()) {
                            PaymentFormActivity.this.inputFields[0].setSelection(Math.max(0, Math.min(selectionStart, PaymentFormActivity.this.inputFields[0].length())));
                        } else if (this.lastDotEntered || !z6 || indexOfComma < 0) {
                            PaymentFormActivity.this.inputFields[0].setSelection(PaymentFormActivity.this.inputFields[0].length());
                        } else {
                            int indexOfComma2 = indexOfComma(str13);
                            if (indexOfComma2 > 0) {
                                PaymentFormActivity.this.inputFields[0].setSelection(indexOfComma2 + 1);
                            } else {
                                PaymentFormActivity.this.inputFields[0].setSelection(PaymentFormActivity.this.inputFields[0].length());
                            }
                        }
                        this.lastDotEntered = z6;
                        PaymentFormActivity.this.updateTotalPrice();
                        this.overrideText = null;
                        PaymentFormActivity.this.ignoreOnTextChange = false;
                    }
                });
                this.inputFields[0].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda11
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView2, int i28, KeyEvent keyEvent) {
                        boolean lambda$createView$14;
                        lambda$createView$14 = PaymentFormActivity.lambda$createView$14(textView2, i28, keyEvent);
                        return lambda$createView$14;
                    }
                });
                this.inputFields[0].requestFocus();
                if (!this.paymentForm.invoice.suggested_tip_amounts.isEmpty()) {
                    HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                    horizontalScrollView.setHorizontalScrollBarEnabled(false);
                    horizontalScrollView.setVerticalScrollBarEnabled(false);
                    horizontalScrollView.setClipToPadding(false);
                    horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                    horizontalScrollView.setFillViewport(true);
                    frameLayout5.addView(horizontalScrollView, LayoutHelper.createFrame(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                    final int[] iArr = new int[1];
                    final int[] iArr2 = new int[1];
                    final int size2 = this.paymentForm.invoice.suggested_tip_amounts.size();
                    c = 6;
                    c2 = 5;
                    LinearLayout linearLayout2 = new LinearLayout(context) { // from class: org.telegram.ui.PaymentFormActivity.12
                        boolean ignoreLayout;

                        @Override // android.widget.LinearLayout, android.view.View
                        protected void onMeasure(int i28, int i29) {
                            int size3 = View.MeasureSpec.getSize(i28);
                            this.ignoreLayout = true;
                            int dp = AndroidUtilities.dp(9.0f);
                            int i30 = size2;
                            int i31 = dp * (i30 - 1);
                            int i32 = (iArr[0] * i30) + i31;
                            float f = 1.0f;
                            if (i32 <= size3) {
                                setWeightSum(1.0f);
                                int childCount = getChildCount();
                                for (int i33 = 0; i33 < childCount; i33++) {
                                    getChildAt(i33).getLayoutParams().width = 0;
                                    ((LinearLayout.LayoutParams) getChildAt(i33).getLayoutParams()).weight = 1.0f / childCount;
                                }
                            } else if (iArr2[0] + i31 <= size3) {
                                setWeightSum(1.0f);
                                int i34 = size3 - i31;
                                int childCount2 = getChildCount();
                                for (int i35 = 0; i35 < childCount2; i35++) {
                                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i35).getLayoutParams();
                                    layoutParams.width = 0;
                                    float intValue = ((Integer) r7.getTag(R.id.width_tag)).intValue() / i34;
                                    layoutParams.weight = intValue;
                                    f -= intValue;
                                }
                                float f2 = f / (size2 - 1);
                                if (f2 > 0.0f) {
                                    int childCount3 = getChildCount();
                                    for (int i36 = 0; i36 < childCount3; i36++) {
                                        View childAt = getChildAt(i36);
                                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                                        if (((Integer) childAt.getTag(R.id.width_tag)).intValue() != iArr[0]) {
                                            layoutParams2.weight += f2;
                                        }
                                    }
                                }
                            } else {
                                setWeightSum(0.0f);
                                int childCount4 = getChildCount();
                                for (int i37 = 0; i37 < childCount4; i37++) {
                                    getChildAt(i37).getLayoutParams().width = -2;
                                    ((LinearLayout.LayoutParams) getChildAt(i37).getLayoutParams()).weight = 0.0f;
                                }
                            }
                            this.ignoreLayout = false;
                            super.onMeasure(i28, i29);
                        }

                        @Override // android.view.View, android.view.ViewParent
                        public void requestLayout() {
                            if (this.ignoreLayout) {
                                return;
                            }
                            super.requestLayout();
                        }
                    };
                    this.tipLayout = linearLayout2;
                    linearLayout2.setOrientation(0);
                    horizontalScrollView.addView(this.tipLayout, LayoutHelper.createScroll(-1, 30, 51));
                    int themedColor = getThemedColor(Theme.key_contacts_inviteBackground);
                    int i28 = 0;
                    while (i28 < size2) {
                        if (LocaleController.isRTL) {
                            longValue = this.paymentForm.invoice.suggested_tip_amounts.get((size2 - i28) - 1).longValue();
                        } else {
                            longValue = this.paymentForm.invoice.suggested_tip_amounts.get(i28).longValue();
                        }
                        String formatCurrencyString = LocaleController.getInstance().formatCurrencyString(longValue, this.paymentForm.invoice.currency);
                        final TextView textView2 = new TextView(context);
                        textView2.setTextSize(1, 14.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setLines(1);
                        textView2.setTag(Long.valueOf(longValue));
                        textView2.setMaxLines(1);
                        textView2.setText(formatCurrencyString);
                        textView2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                        textView2.setTextColor(getThemedColor(Theme.key_chats_secretName));
                        textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(15.0f), 536870911 & themedColor));
                        textView2.setSingleLine(true);
                        textView2.setGravity(17);
                        this.tipLayout.addView(textView2, LayoutHelper.createLinear(-2, -1, 19, 0, 0, i28 != size2 + (-1) ? 9 : 0, 0));
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda12
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                PaymentFormActivity.this.lambda$createView$15(textView2, longValue, view4);
                            }
                        });
                        int ceil = ((int) Math.ceil(textView2.getPaint().measureText(formatCurrencyString))) + AndroidUtilities.dp(30.0f);
                        textView2.setTag(R.id.width_tag, Integer.valueOf(ceil));
                        iArr[0] = Math.max(iArr[0], ceil);
                        iArr2[0] = iArr2[0] + ceil;
                        i28++;
                    }
                    this.linearLayout2.addView(this.totalCell);
                    this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
                    this.sectionCell[2].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                    this.detailSettingsCell[0] = new TextDetailSettingsCell(context);
                    this.detailSettingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    TextDetailSettingsCell textDetailSettingsCell = this.detailSettingsCell[0];
                    String str12 = this.cardName;
                    textDetailSettingsCell.setTextAndValueAndIcon((str12 != null || str12.length() <= 1) ? this.cardName : this.cardName.substring(0, 1).toUpperCase() + this.cardName.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), R.drawable.msg_payment_card, true);
                    i = (this.isCheckoutPreview || ((str2 = this.cardName) != null && str2.length() > 1)) ? 0 : 8;
                    this.detailSettingsCell[0].setVisibility(i);
                    this.linearLayout2.addView(this.detailSettingsCell[0]);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda13
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                PaymentFormActivity.this.lambda$createView$16(view4);
                            }
                        });
                    }
                    user = null;
                    for (i2 = 0; i2 < this.paymentForm.users.size(); i2++) {
                        TLRPC.User user4 = this.paymentForm.users.get(i2);
                        if (user4.id == this.paymentForm.provider_id) {
                            user = user4;
                        }
                    }
                    this.detailSettingsCell[1] = new TextDetailSettingsCell(context);
                    this.detailSettingsCell[1].setBackground(Theme.getSelectorDrawable(true));
                    if (user == null) {
                        TextDetailSettingsCell textDetailSettingsCell2 = this.detailSettingsCell[1];
                        str = ContactsController.formatName(user.first_name, user.last_name);
                        String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                        int i29 = R.drawable.msg_payment_provider;
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.validateRequest;
                        textDetailSettingsCell2.setTextAndValueAndIcon(str, string, i29, ((tL_payments_validateRequestedInfo2 == null || (tL_payments_validateRequestedInfo2.info.shipping_address == null && this.shippingOption == null)) && ((tL_paymentRequestedInfo2 = this.paymentForm.saved_info) == null || tL_paymentRequestedInfo2.shipping_address == null)) ? false : true);
                        c3 = 1;
                        this.linearLayout2.addView(this.detailSettingsCell[1]);
                    } else {
                        c3 = 1;
                        str = "";
                    }
                    this.detailSettingsCell[c3].setVisibility(user == null ? i : 8);
                    tL_payments_validateRequestedInfo = this.validateRequest;
                    if (tL_payments_validateRequestedInfo == null || (this.isCheckoutPreview && (paymentForm2 = this.paymentForm) != null && paymentForm2.saved_info != null)) {
                        tL_paymentRequestedInfo = tL_payments_validateRequestedInfo == null ? tL_payments_validateRequestedInfo.info : this.paymentForm.saved_info;
                        this.detailSettingsCell[2] = new TextDetailSettingsCell(context);
                        this.detailSettingsCell[2].setVisibility(8);
                        this.linearLayout2.addView(this.detailSettingsCell[2]);
                        if (tL_paymentRequestedInfo.shipping_address != null) {
                            this.detailSettingsCell[2].setVisibility(0);
                            if (this.currentStep == 4) {
                                this.detailSettingsCell[2].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                                this.detailSettingsCell[2].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda15
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        PaymentFormActivity.this.lambda$createView$17(view4);
                                    }
                                });
                            } else {
                                this.detailSettingsCell[2].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            }
                        }
                        this.detailSettingsCell[3] = new TextDetailSettingsCell(context);
                        this.detailSettingsCell[3].setVisibility(8);
                        this.linearLayout2.addView(this.detailSettingsCell[3]);
                        if (tL_paymentRequestedInfo.name != null) {
                            this.detailSettingsCell[3].setVisibility(0);
                            if (this.currentStep == 4) {
                                this.detailSettingsCell[3].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                                this.detailSettingsCell[3].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda16
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        PaymentFormActivity.this.lambda$createView$18(view4);
                                    }
                                });
                            } else {
                                this.detailSettingsCell[3].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            }
                        }
                        this.detailSettingsCell[4] = new TextDetailSettingsCell(context);
                        this.detailSettingsCell[4].setVisibility(8);
                        this.linearLayout2.addView(this.detailSettingsCell[4]);
                        if (tL_paymentRequestedInfo.phone != null) {
                            this.detailSettingsCell[4].setVisibility(0);
                            if (this.currentStep == 4) {
                                this.detailSettingsCell[4].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                                this.detailSettingsCell[4].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda17
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        PaymentFormActivity.this.lambda$createView$19(view4);
                                    }
                                });
                            } else {
                                this.detailSettingsCell[4].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            }
                        }
                        this.detailSettingsCell[c2] = new TextDetailSettingsCell(context);
                        this.detailSettingsCell[c2].setVisibility(8);
                        this.linearLayout2.addView(this.detailSettingsCell[c2]);
                        if (tL_paymentRequestedInfo.email != null) {
                            this.detailSettingsCell[c2].setVisibility(0);
                            if (this.currentStep == 4) {
                                this.detailSettingsCell[c2].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                                this.detailSettingsCell[c2].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda18
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        PaymentFormActivity.this.lambda$createView$20(view4);
                                    }
                                });
                            } else {
                                this.detailSettingsCell[c2].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            }
                        }
                        if (this.shippingOption != null) {
                            this.detailSettingsCell[c] = new TextDetailSettingsCell(context);
                            this.detailSettingsCell[c].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            this.detailSettingsCell[c].setTextAndValueAndIcon(this.shippingOption.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), R.drawable.msg_payment_delivery, false);
                            this.linearLayout2.addView(this.detailSettingsCell[c]);
                        }
                        setAddressFields(tL_paymentRequestedInfo);
                    }
                    if (this.currentStep == 4) {
                        this.recurrentAccepted = !this.isCheckoutPreview;
                        if (this.invoiceInput instanceof TLRPC.TL_inputInvoiceStars) {
                            this.recurrentAccepted = true;
                        }
                        this.bottomLayout = new BottomFrameLayout(context, this.paymentForm);
                        View view4 = new View(context);
                        int i30 = Theme.key_listSelector;
                        view4.setBackground(Theme.getSelectorDrawable(getThemedColor(i30), false));
                        this.bottomLayout.addView(view4, LayoutHelper.createFrame(-1, -1.0f));
                        frameLayout2.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 80));
                        this.bottomLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda19
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view5) {
                                PaymentFormActivity.this.lambda$createView$23(str, view5);
                            }
                        });
                        TextView textView3 = new TextView(context);
                        this.payTextView = textView3;
                        int i31 = Theme.key_contacts_inviteText;
                        textView3.setTextColor(getThemedColor(i31));
                        this.payTextView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.totalPrice[0]));
                        this.payTextView.setTextSize(1, 14.0f);
                        this.payTextView.setGravity(17);
                        this.payTextView.setTypeface(AndroidUtilities.bold());
                        this.bottomLayout.addView(this.payTextView, LayoutHelper.createFrame(-1, -1.0f));
                        ContextProgressView contextProgressView2 = new ContextProgressView(context, 0);
                        this.progressViewButton = contextProgressView2;
                        contextProgressView2.setVisibility(4);
                        int themedColor2 = getThemedColor(i31);
                        this.progressViewButton.setColors(805306367 & themedColor2, themedColor2);
                        this.bottomLayout.addView(this.progressViewButton, LayoutHelper.createFrame(-1, -1.0f));
                        this.bottomLayout.setChecked(this.recurrentAccepted, false);
                        this.payTextView.setAlpha(!this.recurrentAccepted ? 0.8f : 1.0f);
                        this.doneItem.setEnabled(false);
                        this.doneItem.getContentView().setVisibility(4);
                        AndroidUtilities.checkAndroidTheme(context, true);
                        WebView webView2 = new WebView(context) { // from class: org.telegram.ui.PaymentFormActivity.17
                            @Override // android.webkit.WebView, android.view.View
                            public boolean onTouchEvent(MotionEvent motionEvent) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return super.onTouchEvent(motionEvent);
                            }
                        };
                        this.webView = webView2;
                        webView2.setBackgroundColor(-1);
                        this.webView.getSettings().setJavaScriptEnabled(true);
                        this.webView.getSettings().setDomStorageEnabled(true);
                        this.webView.getSettings().setSupportZoom(true);
                        this.webView.getSettings().setBuiltInZoomControls(true);
                        this.webView.getSettings().setDisplayZoomControls(false);
                        this.webView.getSettings().setUseWideViewPort(true);
                        this.webView.getSettings().setMixedContentMode(0);
                        CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
                        this.webView.setWebViewClient(new 18(context));
                        this.recurrentAcceptCell = null;
                        if (this.paymentForm.invoice.terms_url != null) {
                            RecurrentPaymentsAcceptCell recurrentPaymentsAcceptCell = new RecurrentPaymentsAcceptCell(context, getResourceProvider());
                            this.recurrentAcceptCell = recurrentPaymentsAcceptCell;
                            recurrentPaymentsAcceptCell.setChecked(this.recurrentAccepted);
                            String string2 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                            int indexOf = string2.indexOf(42);
                            int lastIndexOf = string2.lastIndexOf(42);
                            if (indexOf != -1 && lastIndexOf != -1) {
                                SpannableString spannableString = new SpannableString(string2.substring(indexOf + 1, lastIndexOf));
                                spannableString.setSpan(new URLSpanNoUnderline(this.paymentForm.invoice.terms_url), 0, spannableString.length(), 33);
                                int i32 = lastIndexOf + 1;
                                spannableStringBuilder.replace(indexOf, i32, (CharSequence) spannableString);
                                string2 = string2.substring(0, indexOf) + ((Object) spannableString) + string2.substring(i32);
                            }
                            int indexOf2 = string2.indexOf("%1$s");
                            if (indexOf2 != -1) {
                                spannableStringBuilder.replace(indexOf2, indexOf2 + 4, (CharSequence) this.currentBotName);
                                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), indexOf2, this.currentBotName.length() + indexOf2, 33);
                            }
                            this.recurrentAcceptCell.setText(spannableStringBuilder);
                            this.recurrentAcceptCell.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(Theme.key_windowBackgroundWhite), getThemedColor(i30)));
                            this.recurrentAcceptCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda20
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view5) {
                                    PaymentFormActivity.this.lambda$createView$24(view5);
                                }
                            });
                            frameLayout2.addView(this.recurrentAcceptCell, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                        frameLayout2.addView(this.webView, LayoutHelper.createFrame(-1, -1.0f));
                        this.webView.setVisibility(8);
                    }
                    this.sectionCell[1] = new ShadowSectionCell(context, this.resourcesProvider);
                    this.sectionCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    if (i == 0 && this.currentStep == 4 && this.validateRequest == null && ((paymentForm = this.paymentForm) == null || paymentForm.saved_info == null)) {
                        c4 = 1;
                        this.sectionCell[1].setVisibility(i);
                    } else {
                        c4 = 1;
                    }
                    this.linearLayout2.addView(this.sectionCell[c4], LayoutHelper.createLinear(-1, -2));
                }
            }
            c = 6;
            c2 = 5;
            this.linearLayout2.addView(this.totalCell);
            this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
            this.sectionCell[2].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
            this.detailSettingsCell[0] = new TextDetailSettingsCell(context);
            this.detailSettingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
            TextDetailSettingsCell textDetailSettingsCell3 = this.detailSettingsCell[0];
            String str122 = this.cardName;
            if (str122 != null) {
            }
            textDetailSettingsCell3.setTextAndValueAndIcon((str122 != null || str122.length() <= 1) ? this.cardName : this.cardName.substring(0, 1).toUpperCase() + this.cardName.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), R.drawable.msg_payment_card, true);
            if (this.isCheckoutPreview) {
            }
            this.detailSettingsCell[0].setVisibility(i);
            this.linearLayout2.addView(this.detailSettingsCell[0]);
            if (this.currentStep == 4) {
            }
            user = null;
            while (i2 < this.paymentForm.users.size()) {
            }
            this.detailSettingsCell[1] = new TextDetailSettingsCell(context);
            this.detailSettingsCell[1].setBackground(Theme.getSelectorDrawable(true));
            if (user == null) {
            }
            this.detailSettingsCell[c3].setVisibility(user == null ? i : 8);
            tL_payments_validateRequestedInfo = this.validateRequest;
            if (tL_payments_validateRequestedInfo == null) {
            }
            if (tL_payments_validateRequestedInfo == null) {
            }
            this.detailSettingsCell[2] = new TextDetailSettingsCell(context);
            this.detailSettingsCell[2].setVisibility(8);
            this.linearLayout2.addView(this.detailSettingsCell[2]);
            if (tL_paymentRequestedInfo.shipping_address != null) {
            }
            this.detailSettingsCell[3] = new TextDetailSettingsCell(context);
            this.detailSettingsCell[3].setVisibility(8);
            this.linearLayout2.addView(this.detailSettingsCell[3]);
            if (tL_paymentRequestedInfo.name != null) {
            }
            this.detailSettingsCell[4] = new TextDetailSettingsCell(context);
            this.detailSettingsCell[4].setVisibility(8);
            this.linearLayout2.addView(this.detailSettingsCell[4]);
            if (tL_paymentRequestedInfo.phone != null) {
            }
            this.detailSettingsCell[c2] = new TextDetailSettingsCell(context);
            this.detailSettingsCell[c2].setVisibility(8);
            this.linearLayout2.addView(this.detailSettingsCell[c2]);
            if (tL_paymentRequestedInfo.email != null) {
            }
            if (this.shippingOption != null) {
            }
            setAddressFields(tL_paymentRequestedInfo);
            if (this.currentStep == 4) {
            }
            this.sectionCell[1] = new ShadowSectionCell(context, this.resourcesProvider);
            this.sectionCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            if (i == 0) {
            }
            c4 = 1;
            this.linearLayout2.addView(this.sectionCell[c4], LayoutHelper.createLinear(-1, -2));
        } else if (i7 == 6) {
            EditTextSettingsCell editTextSettingsCell = new EditTextSettingsCell(context);
            this.codeFieldCell = editTextSettingsCell;
            editTextSettingsCell.setTextAndHint("", LocaleController.getString(R.string.PasswordCode), false);
            this.codeFieldCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            EditTextBoldCursor textView4 = this.codeFieldCell.getTextView();
            textView4.setInputType(3);
            textView4.setImeOptions(6);
            textView4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda6
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView5, int i33, KeyEvent keyEvent) {
                    boolean lambda$createView$25;
                    lambda$createView$25 = PaymentFormActivity.this.lambda$createView$25(textView5, i33, keyEvent);
                    return lambda$createView$25;
                }
            });
            textView4.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.PaymentFormActivity.19
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i33, int i34, int i35) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i33, int i34, int i35) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    if (PaymentFormActivity.this.emailCodeLength == 0 || editable.length() != PaymentFormActivity.this.emailCodeLength) {
                        return;
                    }
                    PaymentFormActivity.this.sendSavePassword(false);
                }
            });
            this.linearLayout2.addView(this.codeFieldCell, LayoutHelper.createLinear(-1, -2));
            this.bottomCell[2] = new TextInfoPrivacyCell(context, this.resourcesProvider);
            this.bottomCell[2].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.bottomCell[2], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[1] = new TextSettingsCell(context, this.resourcesProvider);
            this.settingsCell[1].setBackgroundDrawable(Theme.getSelectorDrawable(true));
            TextSettingsCell textSettingsCell = this.settingsCell[1];
            int i33 = Theme.key_windowBackgroundWhiteBlackText;
            textSettingsCell.setTag(Integer.valueOf(i33));
            this.settingsCell[1].setTextColor(getThemedColor(i33));
            this.settingsCell[1].setText(LocaleController.getString(R.string.ResendCode), true);
            this.linearLayout2.addView(this.settingsCell[1], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    PaymentFormActivity.this.lambda$createView$27(view5);
                }
            });
            this.settingsCell[0] = new TextSettingsCell(context, this.resourcesProvider);
            this.settingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
            TextSettingsCell textSettingsCell2 = this.settingsCell[0];
            int i34 = Theme.key_text_RedRegular;
            textSettingsCell2.setTag(Integer.valueOf(i34));
            this.settingsCell[0].setTextColor(getThemedColor(i34));
            this.settingsCell[0].setText(LocaleController.getString(R.string.AbortPassword), false);
            this.linearLayout2.addView(this.settingsCell[0], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    PaymentFormActivity.this.lambda$createView$29(view5);
                }
            });
            this.inputFields = new EditTextBoldCursor[3];
            int i35 = 0;
            for (int i36 = 3; i35 < i36; i36 = 3) {
                if (i35 == 0) {
                    this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                    this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                } else if (i35 == 2) {
                    this.headerCell[1] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[1].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                    this.linearLayout2.addView(this.headerCell[1], LayoutHelper.createLinear(-1, -2));
                }
                FrameLayout frameLayout6 = new FrameLayout(context);
                frameLayout6.setClipChildren(false);
                this.linearLayout2.addView(frameLayout6, LayoutHelper.createLinear(-1, 50));
                int i37 = Theme.key_windowBackgroundWhite;
                frameLayout6.setBackgroundColor(getThemedColor(i37));
                if (i35 == 0) {
                    View view5 = new View(context) { // from class: org.telegram.ui.PaymentFormActivity.20
                        @Override // android.view.View
                        protected void onDraw(Canvas canvas) {
                            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                        }
                    };
                    view5.setBackgroundColor(getThemedColor(i37));
                    this.dividers.add(view5);
                    frameLayout6.addView(view5, new FrameLayout.LayoutParams(-1, 1, 83));
                }
                this.inputFields[i35] = new EditTextBoldCursor(context);
                this.inputFields[i35].setTag(Integer.valueOf(i35));
                this.inputFields[i35].setTextSize(1, 16.0f);
                this.inputFields[i35].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor8 = this.inputFields[i35];
                int i38 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor8.setTextColor(getThemedColor(i38));
                this.inputFields[i35].setBackgroundDrawable(null);
                this.inputFields[i35].setCursorColor(getThemedColor(i38));
                this.inputFields[i35].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i35].setCursorWidth(1.5f);
                if (i35 == 0 || i35 == 1) {
                    this.inputFields[i35].setInputType(NotificationCenter.dialogIsTranslatable);
                    this.inputFields[i35].setTypeface(Typeface.DEFAULT);
                    this.inputFields[i35].setImeOptions(268435461);
                } else {
                    this.inputFields[i35].setInputType(33);
                    this.inputFields[i35].setImeOptions(268435462);
                }
                if (i35 == 0) {
                    this.inputFields[i35].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                    this.inputFields[i35].requestFocus();
                } else if (i35 == 1) {
                    this.inputFields[i35].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                } else if (i35 == 2) {
                    this.inputFields[i35].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                }
                this.inputFields[i35].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[i35].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout6.addView(this.inputFields[i35], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.inputFields[i35].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda9
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i39, KeyEvent keyEvent) {
                        boolean lambda$createView$30;
                        lambda$createView$30 = PaymentFormActivity.this.lambda$createView$30(textView5, i39, keyEvent);
                        return lambda$createView$30;
                    }
                });
                if (i35 == 1) {
                    this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                    this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                } else if (i35 == 2) {
                    this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    this.bottomCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                    this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                }
                i35++;
            }
            updatePasswordFields();
        }
        return this.fragmentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$1(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setDisableAnonymousNumbers(true);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda43
                @Override // org.telegram.ui.CountrySelectActivity.CountrySelectActivityDelegate
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    PaymentFormActivity.this.lambda$createView$0(country);
                }
            });
            presentFragment(countrySelectActivity);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$0(CountrySelectActivity.Country country) {
        this.country = country;
        this.inputFields[4].setText(country.name);
        this.countryName = country.shortname;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            if (i != 6) {
                return false;
            }
            this.doneItem.performClick();
            return true;
        }
        int intValue = ((Integer) textView.getTag()).intValue();
        while (true) {
            intValue++;
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            if (intValue < editTextBoldCursorArr.length) {
                if (intValue != 4 && ((View) editTextBoldCursorArr[intValue].getParent()).getVisibility() == 0) {
                    this.inputFields[intValue].requestFocus();
                    break;
                }
            } else {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3(View view) {
        boolean z = !this.saveShippingInfo;
        this.saveShippingInfo = z;
        this.checkCell1.setChecked(z);
    }

    class 6 extends WebViewClient {
        final /* synthetic */ Context val$context;

        6(Context context) {
            this.val$context = context;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                if (!AndroidUtilities.isSafeToShow(PaymentFormActivity.this.getContext())) {
                    return true;
                }
                new AlertDialog.Builder(PaymentFormActivity.this.getContext(), PaymentFormActivity.this.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$6$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaymentFormActivity.6.this.lambda$onRenderProcessGone$0();
                    }
                })).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRenderProcessGone$0() {
            Browser.openUrl(PaymentFormActivity.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse;
            PaymentFormActivity.this.shouldNavigateBack = !str.equals(r0.webViewUrl);
            try {
                parse = Uri.parse(str);
            } catch (Exception unused) {
            }
            if ("t.me".equals(parse.getHost())) {
                PaymentFormActivity.this.goToNextStep();
                return true;
            }
            if (PaymentFormActivity.BLACKLISTED_PROTOCOLS.contains(parse.getScheme())) {
                return true;
            }
            if (!PaymentFormActivity.WEBVIEW_PROTOCOLS.contains(parse.getScheme())) {
                try {
                    if (PaymentFormActivity.this.getContext() instanceof Activity) {
                        ((Activity) PaymentFormActivity.this.getContext()).startActivityForResult(new Intent("android.intent.action.VIEW", parse), NotificationCenter.timezonesUpdated);
                    }
                } catch (ActivityNotFoundException unused2) {
                    new AlertDialog.Builder(this.val$context).setTitle(PaymentFormActivity.this.currentBotName).setMessage(LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PaymentFormActivity.this.webviewLoading = false;
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.updateSavePaymentField();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$4(View view) {
        boolean z = !this.saveCardInfo;
        this.saveCardInfo = z;
        this.checkCell1.setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$6(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setDisableAnonymousNumbers(true);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda32
                @Override // org.telegram.ui.CountrySelectActivity.CountrySelectActivityDelegate
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    PaymentFormActivity.this.lambda$createView$5(country);
                }
            });
            presentFragment(countrySelectActivity);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$5(CountrySelectActivity.Country country) {
        this.country = country;
        this.inputFields[4].setText(country.name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$7(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            if (i != 6) {
                return false;
            }
            this.doneItem.performClick();
            return true;
        }
        int intValue = ((Integer) textView.getTag()).intValue();
        while (true) {
            int i2 = intValue + 1;
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            if (i2 >= editTextBoldCursorArr.length) {
                break;
            }
            intValue = i2 == 4 ? intValue + 2 : i2;
            if (((View) editTextBoldCursorArr[intValue].getParent()).getVisibility() == 0) {
                this.inputFields[intValue].requestFocus();
                break;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$8(View view) {
        boolean z = !this.saveCardInfo;
        this.saveCardInfo = z;
        this.checkCell1.setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$9(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        int i = 0;
        while (true) {
            RadioCell[] radioCellArr = this.radioCells;
            if (i >= radioCellArr.length) {
                return;
            }
            radioCellArr[i].setChecked(intValue == i, true);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$11(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.doneItem.performClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$12(View view) {
        this.passwordOk = false;
        goToNextStep();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$13(View view) {
        this.inputFields[0].requestFocus();
        AndroidUtilities.showKeyboard(this.inputFields[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createView$14(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        AndroidUtilities.hideKeyboard(textView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$15(TextView textView, long j, View view) {
        long longValue = ((Long) textView.getTag()).longValue();
        Long l = this.tipAmount;
        if (l != null && longValue == l.longValue()) {
            this.ignoreOnTextChange = true;
            this.inputFields[0].setText("");
            this.ignoreOnTextChange = false;
            this.tipAmount = 0L;
            updateTotalPrice();
        } else {
            this.inputFields[0].setText(LocaleController.getInstance().formatCurrencyString(j, false, true, true, this.paymentForm.invoice.currency));
        }
        EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$16(View view) {
        if (getParentActivity() == null) {
            return;
        }
        showChoosePaymentMethod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$17(View view) {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment);
        paymentFormActivity.setDelegate(new PaymentFormActivityDelegate() { // from class: org.telegram.ui.PaymentFormActivity.13
            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.-CC.$default$currentPasswordUpdated(this, password);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.-CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void onFragmentDestroyed() {
                PaymentFormActivityDelegate.-CC.$default$onFragmentDestroyed(this);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.setAddressFields(paymentFormActivity2.validateRequest.info);
            }
        });
        presentFragment(paymentFormActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$18(View view) {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment);
        paymentFormActivity.setDelegate(new PaymentFormActivityDelegate() { // from class: org.telegram.ui.PaymentFormActivity.14
            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.-CC.$default$currentPasswordUpdated(this, password);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.-CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void onFragmentDestroyed() {
                PaymentFormActivityDelegate.-CC.$default$onFragmentDestroyed(this);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.setAddressFields(paymentFormActivity2.validateRequest.info);
            }
        });
        presentFragment(paymentFormActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$19(View view) {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment);
        paymentFormActivity.setDelegate(new PaymentFormActivityDelegate() { // from class: org.telegram.ui.PaymentFormActivity.15
            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.-CC.$default$currentPasswordUpdated(this, password);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.-CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void onFragmentDestroyed() {
                PaymentFormActivityDelegate.-CC.$default$onFragmentDestroyed(this);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.setAddressFields(paymentFormActivity2.validateRequest.info);
            }
        });
        presentFragment(paymentFormActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$20(View view) {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment);
        paymentFormActivity.setDelegate(new PaymentFormActivityDelegate() { // from class: org.telegram.ui.PaymentFormActivity.16
            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.-CC.$default$currentPasswordUpdated(this, password);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.-CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void onFragmentDestroyed() {
                PaymentFormActivityDelegate.-CC.$default$onFragmentDestroyed(this);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.setAddressFields(paymentFormActivity2.validateRequest.info);
            }
        });
        presentFragment(paymentFormActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r7.phone_requested == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006d, code lost:
    
        if (r21.googlePayCredentials == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0077, code lost:
    
        if (r4.invoice.flexible != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$createView$23(String str, final View view) {
        int i;
        RecurrentPaymentsAcceptCell recurrentPaymentsAcceptCell = this.recurrentAcceptCell;
        if (recurrentPaymentsAcceptCell != null && !this.recurrentAccepted) {
            this.shiftDp = -this.shiftDp;
            AndroidUtilities.shakeViewSpring(recurrentPaymentsAcceptCell.getTextView(), this.shiftDp);
            AndroidUtilities.shakeViewSpring(this.recurrentAcceptCell.getCheckBox(), this.shiftDp);
            try {
                this.recurrentAcceptCell.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z = this.isCheckoutPreview;
        if (z && this.paymentForm.saved_info != null && this.validateRequest == null) {
            setDonePressed(true);
            sendSavedForm(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda30
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.this.lambda$createView$21(view);
                }
            });
            return;
        }
        if (z) {
            TLRPC.PaymentForm paymentForm = this.paymentForm;
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = paymentForm.saved_info;
            if (tL_paymentRequestedInfo == null) {
                TLRPC.TL_invoice tL_invoice = paymentForm.invoice;
                if (!tL_invoice.shipping_address_requested) {
                    if (!tL_invoice.email_requested) {
                        if (!tL_invoice.name_requested) {
                        }
                    }
                }
                if (tL_paymentRequestedInfo == null) {
                    TLRPC.TL_invoice tL_invoice2 = paymentForm.invoice;
                    if (tL_invoice2.shipping_address_requested || tL_invoice2.email_requested || tL_invoice2.name_requested || tL_invoice2.phone_requested) {
                        i = 0;
                        if (i != 2 && !paymentForm.additional_methods.isEmpty()) {
                            Objects.requireNonNull(view);
                            showChoosePaymentMethod(new EmbedBottomSheet$$ExternalSyntheticLambda6(view));
                            return;
                        } else {
                            presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment));
                            return;
                        }
                    }
                }
                i = (this.savedCredentialsCard == null && this.paymentJson == null && this.googlePayCredentials == null) ? 2 : 1;
                if (i != 2) {
                }
                presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment));
                return;
            }
            if (this.savedCredentialsCard == null) {
                if (this.paymentJson == null) {
                }
            }
            if (this.shippingOption == null) {
            }
        }
        if (!this.paymentForm.password_missing && this.savedCredentialsCard != null) {
            if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                UserConfig.getInstance(this.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(this.currentAccount).tmpPassword == null) {
                this.needPayAfterTransition = true;
                presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 3, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment));
                this.needPayAfterTransition = false;
                return;
            } else if (this.isCheckoutPreview) {
                this.isCheckoutPreview = false;
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
            }
        }
        TLRPC.User user = this.botUser;
        if (user != null && !user.verified) {
            String str2 = "payment_warning_" + this.botUser.id;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            if (!notificationsSettings.getBoolean(str2, false)) {
                notificationsSettings.edit().putBoolean(str2, true).commit();
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString(R.string.PaymentWarning));
                builder.setMessage(LocaleController.formatString("PaymentWarningText", R.string.PaymentWarningText, this.currentBotName, str));
                builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda31
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        PaymentFormActivity.this.lambda$createView$22(alertDialog, i2);
                    }
                });
                showDialog(builder.create());
                return;
            }
            showPayAlert(this.totalPrice[0]);
            return;
        }
        showPayAlert(this.totalPrice[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$21(View view) {
        setDonePressed(false);
        view.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$22(AlertDialog alertDialog, int i) {
        showPayAlert(this.totalPrice[0]);
    }

    class 18 extends WebViewClient {
        final /* synthetic */ Context val$context;

        18(Context context) {
            this.val$context = context;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                if (!AndroidUtilities.isSafeToShow(PaymentFormActivity.this.getContext())) {
                    return true;
                }
                new AlertDialog.Builder(PaymentFormActivity.this.getContext(), PaymentFormActivity.this.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$18$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaymentFormActivity.18.this.lambda$onRenderProcessGone$0();
                    }
                })).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRenderProcessGone$0() {
            Browser.openUrl(PaymentFormActivity.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PaymentFormActivity.this.webviewLoading = false;
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.updateSavePaymentField();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                Uri parse = Uri.parse(str);
                if ("t.me".equals(parse.getHost())) {
                    PaymentFormActivity.this.goToNextStep();
                    return true;
                }
                if (PaymentFormActivity.BLACKLISTED_PROTOCOLS.contains(parse.getScheme())) {
                    return true;
                }
                if (PaymentFormActivity.WEBVIEW_PROTOCOLS.contains(parse.getScheme())) {
                    return false;
                }
                try {
                    if (PaymentFormActivity.this.getContext() instanceof Activity) {
                        ((Activity) PaymentFormActivity.this.getContext()).startActivityForResult(new Intent("android.intent.action.VIEW", parse), NotificationCenter.timezonesUpdated);
                    }
                } catch (ActivityNotFoundException unused) {
                    new AlertDialog.Builder(this.val$context).setTitle(PaymentFormActivity.this.currentBotName).setMessage(LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                }
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$24(View view) {
        if (this.donePressed) {
            return;
        }
        boolean z = !this.recurrentAccepted;
        this.recurrentAccepted = z;
        this.recurrentAcceptCell.setChecked(z);
        this.bottomLayout.setChecked(this.recurrentAccepted, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$25(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        sendSavePassword(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$27(View view) {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda41
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.lambda$createView$26(tLObject, tL_error);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setMessage(LocaleController.getString(R.string.ResendCodeInfo));
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(builder.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$29(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
        if (this.currentPassword.has_secure_values) {
            string = string + "\n\n" + LocaleController.getString(R.string.TurnPasswordOffPassport);
        }
        builder.setMessage(string);
        builder.setTitle(LocaleController.getString(R.string.TurnPasswordOffQuestionTitle));
        builder.setPositiveButton(LocaleController.getString(R.string.Disable), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda34
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                PaymentFormActivity.this.lambda$createView$28(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog create = builder.create();
        showDialog(create);
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$28(AlertDialog alertDialog, int i) {
        sendSavePassword(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$30(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.doneItem.performClick();
            return true;
        }
        if (i != 5) {
            return false;
        }
        int intValue = ((Integer) textView.getTag()).intValue();
        if (intValue == 0) {
            this.inputFields[1].requestFocus();
            return false;
        }
        if (intValue != 1) {
            return false;
        }
        this.inputFields[2].requestFocus();
        return false;
    }

    private void showChoosePaymentMethod() {
        showChoosePaymentMethod(null);
    }

    private void showChoosePaymentMethod(final Runnable runnable) {
        BottomSheet.Builder title = new BottomSheet.Builder(getParentActivity()).setTitle(LocaleController.getString(R.string.PaymentCheckoutMethod), true);
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.savedCredentialsCard;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.cardName;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        final ArrayList arrayList3 = new ArrayList();
        Iterator<TLRPC.TL_paymentSavedCredentialsCard> it = this.paymentForm.saved_credentials.iterator();
        while (it.hasNext()) {
            TLRPC.TL_paymentSavedCredentialsCard next = it.next();
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.savedCredentialsCard;
            if (tL_paymentSavedCredentialsCard2 == null || !Objects.equals(next.id, tL_paymentSavedCredentialsCard2.id)) {
                arrayList.add(next.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(next);
            }
        }
        Iterator<TLRPC.TL_paymentFormMethod> it2 = this.paymentForm.additional_methods.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(LocaleController.getString(R.string.PaymentCheckoutMethodNewCard));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i = 0; i < arrayList2.size(); i++) {
            iArr[i] = ((Integer) arrayList2.get(i)).intValue();
        }
        title.setItems((CharSequence[]) arrayList.toArray(new CharSequence[0]), iArr, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda44
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PaymentFormActivity.this.lambda$showChoosePaymentMethod$31(runnable, arrayList3, arrayList, dialogInterface, i2);
            }
        });
        showDialog(title.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showChoosePaymentMethod$31(final Runnable runnable, List list, List list2, DialogInterface dialogInterface, int i) {
        PaymentFormActivityDelegate paymentFormActivityDelegate = new PaymentFormActivityDelegate() { // from class: org.telegram.ui.PaymentFormActivity.21
            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.-CC.$default$currentPasswordUpdated(this, password);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivityDelegate.-CC.$default$didSelectNewAddress(this, tL_payments_validateRequestedInfo);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public /* synthetic */ void onFragmentDestroyed() {
                PaymentFormActivityDelegate.-CC.$default$onFragmentDestroyed(this);
            }

            @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
            public boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                String str3;
                PaymentFormActivity.this.savedCredentialsCard = tL_paymentSavedCredentialsCard;
                PaymentFormActivity.this.paymentJson = str;
                PaymentFormActivity.this.saveCardInfo = z;
                PaymentFormActivity.this.cardName = str2;
                PaymentFormActivity.this.googlePayCredentials = tL_inputPaymentCredentialsGooglePay;
                if (PaymentFormActivity.this.detailSettingsCell[0] != null) {
                    PaymentFormActivity.this.detailSettingsCell[0].setVisibility(0);
                    TextDetailSettingsCell textDetailSettingsCell = PaymentFormActivity.this.detailSettingsCell[0];
                    if (PaymentFormActivity.this.cardName == null || PaymentFormActivity.this.cardName.length() <= 1) {
                        str3 = PaymentFormActivity.this.cardName;
                    } else {
                        str3 = PaymentFormActivity.this.cardName.substring(0, 1).toUpperCase() + PaymentFormActivity.this.cardName.substring(1);
                    }
                    textDetailSettingsCell.setTextAndValueAndIcon(str3, LocaleController.getString(R.string.PaymentCheckoutMethod), R.drawable.msg_payment_card, true);
                    if (PaymentFormActivity.this.detailSettingsCell[1] != null) {
                        PaymentFormActivity.this.detailSettingsCell[1].setVisibility(0);
                    }
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                return false;
            }
        };
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.savedCredentialsCard;
        int i2 = (tL_paymentSavedCredentialsCard == null && this.cardName == null) ? 0 : 1;
        if (!(tL_paymentSavedCredentialsCard == null && this.cardName == null) && i == 0) {
            return;
        }
        if (i >= i2 && i < list.size() + i2) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) list.get(i - i2);
            this.savedCredentialsCard = tL_paymentSavedCredentialsCard2;
            paymentFormActivityDelegate.didSelectNewCard(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
        } else {
            if (i < list2.size() - 1) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.paymentForm.additional_methods.get((i - list.size()) - i2);
                PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 2, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment);
                paymentFormActivity.setPaymentMethod(tL_paymentFormMethod);
                paymentFormActivity.setDelegate(paymentFormActivityDelegate);
                presentFragment(paymentFormActivity);
                return;
            }
            if (i == list2.size() - 1) {
                PaymentFormActivity paymentFormActivity2 = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 2, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment);
                paymentFormActivity2.setDelegate(paymentFormActivityDelegate);
                presentFragment(paymentFormActivity2);
            }
        }
    }

    private void setPaymentMethod(TLRPC.TL_paymentFormMethod tL_paymentFormMethod) {
        this.paymentFormMethod = tL_paymentFormMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressFields(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        if (tL_postAddress != null) {
            this.detailSettingsCell[2].setTextAndValueAndIcon(String.format("%s %s, %s, %s, %s, %s", tL_postAddress.street_line1, tL_postAddress.street_line2, tL_postAddress.city, tL_postAddress.state, tL_postAddress.country_iso2, tL_postAddress.post_code), LocaleController.getString(R.string.PaymentShippingAddress), R.drawable.msg_payment_address, true);
        }
        this.detailSettingsCell[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str = tL_paymentRequestedInfo.name;
        if (str != null) {
            this.detailSettingsCell[3].setTextAndValueAndIcon(str, LocaleController.getString(R.string.PaymentCheckoutName), R.drawable.msg_contacts, true);
        }
        this.detailSettingsCell[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            this.detailSettingsCell[4].setTextAndValueAndIcon(PhoneFormat.getInstance().format(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), R.drawable.msg_calls, (tL_paymentRequestedInfo.email == null && this.shippingOption == null) ? false : true);
        }
        this.detailSettingsCell[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str2 = tL_paymentRequestedInfo.email;
        if (str2 != null) {
            this.detailSettingsCell[5].setTextAndValueAndIcon(str2, LocaleController.getString(R.string.PaymentCheckoutEmail), R.drawable.msg_mention, this.shippingOption != null);
        }
        this.detailSettingsCell[5].setVisibility(tL_paymentRequestedInfo.email == null ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTotalPrice() {
        this.totalPrice[0] = getTotalPriceString(this.prices);
        this.totalCell.setTextAndValue(LocaleController.getString(R.string.PaymentTransactionTotal), this.totalPrice[0], true);
        TextView textView = this.payTextView;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.totalPrice[0]));
        }
        if (this.tipLayout != null) {
            int themedColor = getThemedColor(Theme.key_contacts_inviteBackground);
            int childCount = this.tipLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextView textView2 = (TextView) this.tipLayout.getChildAt(i);
                if (textView2.getTag().equals(this.tipAmount)) {
                    Theme.setDrawableColor(textView2.getBackground(), themedColor);
                    textView2.setTextColor(getThemedColor(Theme.key_contacts_inviteText));
                } else {
                    Theme.setDrawableColor(textView2.getBackground(), 536870911 & themedColor);
                    textView2.setTextColor(getThemedColor(Theme.key_chats_secretName));
                }
                textView2.invalidate();
            }
        }
    }

    private void createGooglePayButton(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.googlePayContainer = frameLayout;
        frameLayout.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        this.googlePayContainer.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.googlePayButton = frameLayout2;
        frameLayout2.setClickable(true);
        this.googlePayButton.setFocusable(true);
        this.googlePayButton.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.googlePayPublicKey == null) {
            this.googlePayButton.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.googlePayButton.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.googlePayContainer.addView(this.googlePayButton, LayoutHelper.createFrame(-1, 48.0f));
        this.googlePayButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentFormActivity.this.lambda$createGooglePayButton$32(view);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.googlePayButton.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, LayoutHelper.createLinear(-1, 0, 1.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.googlePayButton.addView(imageView2, LayoutHelper.createFrame(-1, -1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGooglePayButton$32(View view) {
        this.googlePayButton.setClickable(false);
        try {
            JSONObject baseRequest = getBaseRequest();
            JSONObject baseCardPaymentMethod = getBaseCardPaymentMethod();
            if (this.googlePayPublicKey != null && this.googlePayParameters == null) {
                baseCardPaymentMethod.put("tokenizationSpecification", new JSONObject() { // from class: org.telegram.ui.PaymentFormActivity.22
                    {
                        put("type", "DIRECT");
                        put("parameters", new JSONObject() { // from class: org.telegram.ui.PaymentFormActivity.22.1
                            {
                                put("protocolVersion", "ECv2");
                                put("publicKey", PaymentFormActivity.this.googlePayPublicKey);
                            }
                        });
                    }
                });
            } else {
                baseCardPaymentMethod.put("tokenizationSpecification", new JSONObject() { // from class: org.telegram.ui.PaymentFormActivity.23
                    {
                        put("type", "PAYMENT_GATEWAY");
                        if (PaymentFormActivity.this.googlePayParameters != null) {
                            put("parameters", PaymentFormActivity.this.googlePayParameters);
                        } else {
                            put("parameters", new JSONObject() { // from class: org.telegram.ui.PaymentFormActivity.23.1
                                {
                                    put("gateway", "stripe");
                                    put("stripe:publishableKey", PaymentFormActivity.this.providerApiKey);
                                    put("stripe:version", "3.5.0");
                                }
                            });
                        }
                    }
                });
            }
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(baseCardPaymentMethod));
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = new ArrayList(this.paymentForm.invoice.prices);
            TLRPC.TL_shippingOption tL_shippingOption = this.shippingOption;
            if (tL_shippingOption != null) {
                arrayList.addAll(tL_shippingOption.prices);
            }
            String totalPriceDecimalString = getTotalPriceDecimalString(arrayList);
            this.totalPriceDecimal = totalPriceDecimalString;
            jSONObject.put("totalPrice", totalPriceDecimalString);
            jSONObject.put("totalPriceStatus", "FINAL");
            if (!TextUtils.isEmpty(this.googlePayCountryCode)) {
                jSONObject.put("countryCode", this.googlePayCountryCode);
            }
            jSONObject.put("currencyCode", this.paymentForm.invoice.currency);
            jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
            baseRequest.put("transactionInfo", jSONObject);
            baseRequest.put("merchantInfo", new JSONObject().put("merchantName", this.currentBotName));
            PaymentDataRequest fromJson = PaymentDataRequest.fromJson(baseRequest.toString());
            if (fromJson != null) {
                AutoResolveHelper.resolveTask(this.paymentsClient.loadPaymentData(fromJson), getParentActivity(), 991);
            }
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    private void updatePasswordFields() {
        int i = 0;
        if (this.currentStep != 6 || this.bottomCell[2] == null) {
            return;
        }
        this.doneItem.setVisibility(0);
        if (this.currentPassword == null) {
            showEditDoneProgress(true, true);
            this.bottomCell[2].setVisibility(8);
            this.settingsCell[0].setVisibility(8);
            this.settingsCell[1].setVisibility(8);
            this.codeFieldCell.setVisibility(8);
            this.headerCell[0].setVisibility(8);
            this.headerCell[1].setVisibility(8);
            this.bottomCell[0].setVisibility(8);
            for (int i2 = 0; i2 < 3; i2++) {
                ((View) this.inputFields[i2].getParent()).setVisibility(8);
            }
            while (i < this.dividers.size()) {
                ((View) this.dividers.get(i)).setVisibility(8);
                i++;
            }
            return;
        }
        showEditDoneProgress(true, false);
        if (this.waitingForEmail) {
            TextInfoPrivacyCell textInfoPrivacyCell = this.bottomCell[2];
            int i3 = R.string.EmailPasswordConfirmText2;
            String str = this.currentPassword.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            textInfoPrivacyCell.setText(LocaleController.formatString("EmailPasswordConfirmText2", i3, str));
            this.bottomCell[2].setVisibility(0);
            this.settingsCell[0].setVisibility(0);
            this.settingsCell[1].setVisibility(0);
            this.codeFieldCell.setVisibility(0);
            this.bottomCell[1].setText("");
            this.headerCell[0].setVisibility(8);
            this.headerCell[1].setVisibility(8);
            this.bottomCell[0].setVisibility(8);
            for (int i4 = 0; i4 < 3; i4++) {
                ((View) this.inputFields[i4].getParent()).setVisibility(8);
            }
            while (i < this.dividers.size()) {
                ((View) this.dividers.get(i)).setVisibility(8);
                i++;
            }
            return;
        }
        this.bottomCell[2].setVisibility(8);
        this.settingsCell[0].setVisibility(8);
        this.settingsCell[1].setVisibility(8);
        this.bottomCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
        this.codeFieldCell.setVisibility(8);
        this.headerCell[0].setVisibility(0);
        this.headerCell[1].setVisibility(0);
        this.bottomCell[0].setVisibility(0);
        for (int i5 = 0; i5 < 3; i5++) {
            ((View) this.inputFields[i5].getParent()).setVisibility(0);
        }
        for (int i6 = 0; i6 < this.dividers.size(); i6++) {
            ((View) this.dividers.get(i6)).setVisibility(0);
        }
    }

    private void loadPasswordInfo() {
        if (this.loadingPasswordInfo) {
            return;
        }
        this.loadingPasswordInfo = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda3
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.this.lambda$loadPasswordInfo$35(tLObject, tL_error);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPasswordInfo$35(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$loadPasswordInfo$34(tL_error, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPasswordInfo$34(TLRPC.TL_error tL_error, TLObject tLObject) {
        this.loadingPasswordInfo = false;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            TLRPC.PaymentForm paymentForm = this.paymentForm;
            if (paymentForm != null && this.currentPassword.has_password) {
                paymentForm.password_missing = false;
                paymentForm.can_save_credentials = true;
                updateSavePaymentField();
            }
            TwoStepVerificationActivity.initPasswordNewAlgo(this.currentPassword);
            PaymentFormActivity paymentFormActivity = this.passwordFragment;
            if (paymentFormActivity != null) {
                paymentFormActivity.setCurrentPassword(this.currentPassword);
            }
            if (this.currentPassword.has_password || this.shortPollRunnable != null) {
                return;
            }
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda52
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.this.lambda$loadPasswordInfo$33();
                }
            };
            this.shortPollRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadPasswordInfo$33() {
        if (this.shortPollRunnable == null) {
            return;
        }
        loadPasswordInfo();
        this.shortPollRunnable = null;
    }

    private void showAlertWithText(String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setTitle(str);
        builder.setMessage(str2);
        showDialog(builder.create());
    }

    private void showPayAlert(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.PaymentTransactionReview));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.currentBotName, this.currentItemName)));
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda50
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                PaymentFormActivity.this.lambda$showPayAlert$36(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPayAlert$36(AlertDialog alertDialog, int i) {
        setDonePressed(true);
        sendData();
    }

    private JSONObject getBaseRequest() {
        return new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
    }

    private JSONObject getBaseCardPaymentMethod() {
        List asList = Arrays.asList("AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA");
        List asList2 = Arrays.asList("PAN_ONLY", "CRYPTOGRAM_3DS");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "CARD");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray((Collection) asList2));
        jSONObject2.put("allowedCardNetworks", new JSONArray((Collection) asList));
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public Optional getIsReadyToPayRequest() {
        try {
            JSONObject baseRequest = getBaseRequest();
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(getBaseCardPaymentMethod()));
            return Optional.of(baseRequest);
        } catch (JSONException unused) {
            return Optional.empty();
        }
    }

    private void initGooglePay(Context context) {
        IsReadyToPayRequest fromJson;
        if (getParentActivity() == null) {
            return;
        }
        this.paymentsClient = Wallet.getPaymentsClient(context, new Wallet.WalletOptions.Builder().setEnvironment(this.paymentForm.invoice.test ? 3 : 1).setTheme(1).build());
        Optional isReadyToPayRequest = getIsReadyToPayRequest();
        if (isReadyToPayRequest.isPresent() && (fromJson = IsReadyToPayRequest.fromJson(((JSONObject) isReadyToPayRequest.get()).toString())) != null) {
            this.paymentsClient.isReadyToPay(fromJson).addOnCompleteListener(getParentActivity(), new OnCompleteListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda29
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    PaymentFormActivity.this.lambda$initGooglePay$37(task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGooglePay$37(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.googlePayContainer;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }

    private String getTotalPriceString(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        Long l = this.tipAmount;
        if (l != null) {
            j += l.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j, this.paymentForm.invoice.currency);
    }

    private String getTotalPriceDecimalString(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        return LocaleController.getInstance().formatCurrencyDecimalString(j, this.paymentForm.invoice.currency, false);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.currentStep != 4 || this.isCheckoutPreview) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    public int getOtherSameFragmentDiff() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        int i = 0;
        if (iNavigationLayout == null || iNavigationLayout.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i >= this.parentLayout.getFragmentStack().size()) {
                i = indexOf;
                break;
            }
            if (((BaseFragment) this.parentLayout.getFragmentStack().get(i)) instanceof PaymentFormActivity) {
                break;
            }
            i++;
        }
        return i - indexOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r0 != 6) goto L43;
     */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFragmentDestroy() {
        PaymentFormActivityDelegate paymentFormActivityDelegate = this.delegate;
        if (paymentFormActivityDelegate != null) {
            paymentFormActivityDelegate.onFragmentDestroyed();
        }
        AndroidUtilities.checkAndroidTheme(getContext(), false);
        if (!this.paymentStatusSent) {
            this.invoiceStatus = InvoiceStatus.CANCELLED;
            if (this.paymentFormCallback != null && getOtherSameFragmentDiff() == 0) {
                this.paymentFormCallback.onInvoiceStatusChanged(this.invoiceStatus);
            }
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.currentStep != 4 || this.isCheckoutPreview) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        WebView webView = this.webView;
        if (webView != null) {
            try {
                ViewParent parent = webView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.webView);
                }
                this.webView.stopLoading();
                this.webView.loadUrl("about:blank");
                this.webViewUrl = null;
                this.webView.destroy();
                this.webView = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        try {
            int i = this.currentStep;
            if (i != 2) {
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (SharedConfig.passcodeHash.length() != 0) {
                    if (SharedConfig.allowScreenCapture) {
                    }
                }
                getParentActivity().getWindow().clearFlags(8192);
                AndroidUtilities.logFlagSecure();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.onFragmentDestroy();
        this.canceled = true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.currentStep == 4 && this.needPayAfterTransition) {
            this.needPayAfterTransition = false;
            this.bottomLayout.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || z2) {
            return;
        }
        WebView webView = this.webView;
        if (webView != null) {
            if (this.currentStep != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.paymentFormMethod;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.webViewUrl = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.paymentForm.url;
                    this.webViewUrl = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i = this.currentStep;
        if (i == 2) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.this.lambda$onTransitionAnimationEnd$38();
                }
            }, 100L);
            return;
        }
        if (i == 3) {
            this.inputFields[1].requestFocus();
            AndroidUtilities.showKeyboard(this.inputFields[1]);
            return;
        }
        if (i == 4) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
            return;
        }
        if (i != 6 || this.waitingForEmail) {
            return;
        }
        this.inputFields[0].requestFocus();
        AndroidUtilities.showKeyboard(this.inputFields[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTransitionAnimationEnd$38() {
        this.inputFields[0].requestFocus();
        AndroidUtilities.showKeyboard(this.inputFields[0]);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.paymentForm;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            updateSavePaymentField();
            return;
        }
        if (i == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.paymentForm;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            updateSavePaymentField();
            return;
        }
        if (i == NotificationCenter.paymentFinished) {
            this.paymentStatusSent = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onActivityResultFragment(int i, final int i2, final Intent intent) {
        if (i == 991) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.this.lambda$onActivityResultFragment$39(i2, intent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityResultFragment$39(int i, Intent intent) {
        String json;
        if (i == -1) {
            PaymentData fromIntent = PaymentData.getFromIntent(intent);
            if (fromIntent == null || (json = fromIntent.toJson()) == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(json).getJSONObject("paymentMethodData");
                JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                jSONObject2.getString("type");
                String string = jSONObject2.getString("token");
                if (this.googlePayPublicKey == null && this.googlePayParameters == null) {
                    Token parseToken = TokenParser.parseToken(string);
                    this.paymentJson = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", parseToken.getType(), parseToken.getId());
                    Card card = parseToken.getCard();
                    this.cardName = card.getBrand() + " *" + card.getLast4();
                    goToNextStep();
                }
                TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                this.googlePayCredentials = tL_inputPaymentCredentialsGooglePay;
                tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                this.googlePayCredentials.payment_token.data = jSONObject2.toString();
                String optString = jSONObject.optString("description");
                if (!TextUtils.isEmpty(optString)) {
                    this.cardName = optString;
                } else {
                    this.cardName = "Android Pay";
                }
                goToNextStep();
            } catch (JSONException e) {
                FileLog.e(e);
            }
        } else if (i == 1) {
            Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
            StringBuilder sb = new StringBuilder();
            sb.append("android pay error ");
            sb.append(statusFromIntent != null ? statusFromIntent.getStatusMessage() : "");
            FileLog.e(sb.toString());
        }
        showEditDoneProgress(true, false);
        setDonePressed(false);
        FrameLayout frameLayout = this.googlePayButton;
        if (frameLayout != null) {
            frameLayout.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goToNextStep() {
        int i;
        int i2;
        boolean z;
        int i3 = this.currentStep;
        if (i3 == 0) {
            PaymentFormActivityDelegate paymentFormActivityDelegate = this.delegate;
            if (paymentFormActivityDelegate != null) {
                paymentFormActivityDelegate.didSelectNewAddress(this.validateRequest);
                lambda$onBackPressed$355();
                return;
            }
            if (this.paymentForm.invoice.flexible) {
                i = 1;
            } else if (this.savedCredentialsCard == null && this.paymentJson == null) {
                i = 2;
            } else {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                i = UserConfig.getInstance(this.currentAccount).tmpPassword != null ? 4 : 3;
            }
            if (i == 2 && this.savedCredentialsCard == null && this.paymentJson == null && !this.paymentForm.additional_methods.isEmpty()) {
                showChoosePaymentMethod(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda39
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaymentFormActivity.this.goToNextStep();
                    }
                });
                return;
            } else {
                presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i, this.requestedInfo, null, null, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment), this.isWebView);
                return;
            }
        }
        if (i3 == 1) {
            if (this.paymentJson == null && this.cardName == null) {
                if (this.savedCredentialsCard != null) {
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                        UserConfig.getInstance(this.currentAccount).saveConfig(false);
                    }
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword == null) {
                        i2 = 3;
                    }
                } else {
                    i2 = 2;
                }
                if (i2 != 2 && this.cardName == null && this.savedCredentialsCard == null && this.paymentJson == null && !this.paymentForm.additional_methods.isEmpty()) {
                    showChoosePaymentMethod(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda39
                        @Override // java.lang.Runnable
                        public final void run() {
                            PaymentFormActivity.this.goToNextStep();
                        }
                    });
                    return;
                } else {
                    presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i2, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment), this.isWebView);
                    return;
                }
            }
            i2 = 4;
            if (i2 != 2) {
            }
            presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i2, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment), this.isWebView);
            return;
        }
        if (i3 == 2) {
            TLRPC.PaymentForm paymentForm = this.paymentForm;
            if (paymentForm.password_missing && (z = this.saveCardInfo)) {
                PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, paymentForm, this.messageObject, this.invoiceSlug, 6, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, z, this.googlePayCredentials, this.parentFragment);
                this.passwordFragment = paymentFormActivity;
                paymentFormActivity.setCurrentPassword(this.currentPassword);
                this.passwordFragment.setDelegate(new PaymentFormActivityDelegate() { // from class: org.telegram.ui.PaymentFormActivity.24
                    @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
                    public /* synthetic */ void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                        PaymentFormActivityDelegate.-CC.$default$didSelectNewAddress(this, tL_payments_validateRequestedInfo);
                    }

                    @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
                    public boolean didSelectNewCard(String str, String str2, boolean z2, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                        if (PaymentFormActivity.this.delegate != null) {
                            PaymentFormActivity.this.delegate.didSelectNewCard(str, str2, z2, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
                        }
                        if (PaymentFormActivity.this.isWebView) {
                            PaymentFormActivity.this.removeSelfFromStack();
                        }
                        return PaymentFormActivity.this.delegate != null;
                    }

                    @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
                    public void onFragmentDestroyed() {
                        PaymentFormActivity.this.passwordFragment = null;
                    }

                    @Override // org.telegram.ui.PaymentFormActivity.PaymentFormActivityDelegate
                    public void currentPasswordUpdated(TL_account.Password password) {
                        PaymentFormActivity.this.currentPassword = password;
                    }
                });
                presentFragment(this.passwordFragment, this.isWebView);
                return;
            }
            PaymentFormActivityDelegate paymentFormActivityDelegate2 = this.delegate;
            if (paymentFormActivityDelegate2 != null) {
                paymentFormActivityDelegate2.didSelectNewCard(this.paymentJson, this.cardName, this.saveCardInfo, this.googlePayCredentials, null);
                lambda$onBackPressed$355();
                return;
            } else {
                presentFragment(new PaymentFormActivity(this.invoiceInput, paymentForm, this.messageObject, this.invoiceSlug, 4, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment), this.isWebView);
                return;
            }
        }
        if (i3 == 3) {
            presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, this.passwordOk ? 4 : 2, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment), true);
            return;
        }
        if (i3 != 4) {
            if (i3 != 6) {
                return;
            }
            if (!this.delegate.didSelectNewCard(this.paymentJson, this.cardName, this.saveCardInfo, this.googlePayCredentials, this.savedCredentialsCard)) {
                presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 4, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment), true);
                return;
            } else {
                lambda$onBackPressed$355();
                return;
            }
        }
        if (this.isCheckoutPreview) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback == null) {
            if (onCheckoutSuccess(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            lambda$onBackPressed$355();
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$goToNextStep$40();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$goToNextStep$40() {
        getMessagesController().newMessageCallback = null;
        if (this.invoiceStatus == InvoiceStatus.PENDING && !isFinishing()) {
            InvoiceStatus invoiceStatus = InvoiceStatus.FAILED;
            this.invoiceStatus = invoiceStatus;
            PaymentFormCallback paymentFormCallback = this.paymentFormCallback;
            if (paymentFormCallback != null) {
                paymentFormCallback.onInvoiceStatusChanged(invoiceStatus);
            }
            lambda$onBackPressed$355();
            return;
        }
        if (this.invoiceStatus != InvoiceStatus.PAID || isFinishing()) {
            return;
        }
        lambda$onBackPressed$355();
    }

    private boolean onCheckoutSuccess(INavigationLayout iNavigationLayout, Activity activity) {
        if (this.invoiceInput != null) {
            if (iNavigationLayout == null) {
                return false;
            }
            Iterator it = new ArrayList(iNavigationLayout.getFragmentStack()).iterator();
            while (it.hasNext()) {
                BaseFragment baseFragment = (BaseFragment) it.next();
                if (baseFragment instanceof PaymentFormActivity) {
                    baseFragment.removeSelfFromStack();
                }
            }
            return true;
        }
        String str = this.botUser.username;
        if ((!(str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.invoiceSlug == null) && (this.invoiceSlug == null || getMessagesController().premiumInvoiceSlug == null || !Objects.equals(this.invoiceSlug, getMessagesController().premiumInvoiceSlug))) || iNavigationLayout == null) {
            return false;
        }
        Iterator it2 = new ArrayList(iNavigationLayout.getFragmentStack()).iterator();
        while (it2.hasNext()) {
            BaseFragment baseFragment2 = (BaseFragment) it2.next();
            if ((baseFragment2 instanceof ChatActivity) || (baseFragment2 instanceof PremiumPreviewFragment)) {
                baseFragment2.removeSelfFromStack();
            }
        }
        iNavigationLayout.presentFragment(new PremiumPreviewFragment(null).setForcePremium(), !isFinishing());
        if (activity instanceof LaunchActivity) {
            try {
                this.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            ((LaunchActivity) activity).getFireworksOverlay().start();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSavePaymentField() {
        if (this.bottomCell[0] == null || this.sectionCell[2] == null) {
            return;
        }
        TLRPC.PaymentForm paymentForm = this.paymentForm;
        if ((paymentForm.password_missing || paymentForm.can_save_credentials) && (this.webView == null || !this.webviewLoading)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
            if (this.paymentForm.password_missing) {
                loadPasswordInfo();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) string);
                if (indexOf != -1 && lastIndexOf != -1) {
                    int i = indexOf + length;
                    int i2 = lastIndexOf + length;
                    this.bottomCell[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i, i + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new LinkSpan(), i, i2 - 1, 33);
                }
            }
            this.checkCell1.setEnabled(true);
            this.bottomCell[0].setText(spannableStringBuilder);
            this.checkCell1.setVisibility(0);
            this.bottomCell[0].setVisibility(0);
            ShadowSectionCell shadowSectionCell = this.sectionCell[2];
            shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(shadowSectionCell.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            return;
        }
        this.checkCell1.setVisibility(8);
        this.bottomCell[0].setVisibility(8);
        ShadowSectionCell shadowSectionCell2 = this.sectionCell[2];
        shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(shadowSectionCell2.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:21:0x0039, B:22:0x0041, B:24:0x0047, B:28:0x0053, B:32:0x0061, B:34:0x0074, B:30:0x006e, B:38:0x0085), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:21:0x0039, B:22:0x0041, B:24:0x0047, B:28:0x0053, B:32:0x0061, B:34:0x0074, B:30:0x006e, B:38:0x0085), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fillNumber(String str) {
        boolean z;
        boolean z2;
        int checkSelfPermission;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                checkSelfPermission = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE");
                if (checkSelfPermission != 0) {
                    z = false;
                    if (str == null || z) {
                        if (str == null) {
                            str = PhoneFormat.stripExceptNumbers(telephonyManager.getLine1Number());
                        }
                        if (TextUtils.isEmpty(str)) {
                            int i = 4;
                            String str2 = null;
                            if (str.length() > 4) {
                                while (true) {
                                    if (i < 1) {
                                        z2 = false;
                                        break;
                                    }
                                    String substring = str.substring(0, i);
                                    if (((String) this.codesMap.get(substring)) != null) {
                                        str2 = str.substring(i);
                                        this.inputFields[8].setText(substring);
                                        z2 = true;
                                        break;
                                    }
                                    i--;
                                }
                                if (!z2) {
                                    str2 = str.substring(1);
                                    this.inputFields[8].setText(str.substring(0, 1));
                                }
                            }
                            if (str2 != null) {
                                this.inputFields[9].setText(str2);
                                EditTextBoldCursor editTextBoldCursor = this.inputFields[9];
                                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z = true;
            if (str == null) {
            }
            if (str == null) {
            }
            if (TextUtils.isEmpty(str)) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSavePassword(final boolean z) {
        final String str;
        final String str2;
        if (!z && this.codeFieldCell.getVisibility() == 0) {
            String text = this.codeFieldCell.getText();
            if (text.length() == 0) {
                shakeView(this.codeFieldCell);
                return;
            }
            showEditDoneProgress(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda35
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    PaymentFormActivity.this.lambda$sendSavePassword$42(tLObject, tL_error);
                }
            }, 10);
            return;
        }
        final TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z) {
            this.doneItem.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            str2 = null;
        } else {
            String obj = this.inputFields[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                shakeField(0);
                return;
            }
            if (!obj.equals(this.inputFields[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                shakeField(1);
                return;
            }
            String obj2 = this.inputFields[2].getText().toString();
            if (obj2.length() < 3) {
                shakeField(2);
                return;
            }
            int lastIndexOf = obj2.lastIndexOf(46);
            int lastIndexOf2 = obj2.lastIndexOf(64);
            if (lastIndexOf2 < 0 || lastIndexOf < lastIndexOf2) {
                shakeField(2);
                return;
            }
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings2;
            int i = passwordinputsettings2.flags;
            passwordinputsettings2.flags = i | 1;
            passwordinputsettings2.hint = "";
            passwordinputsettings2.new_algo = this.currentPassword.new_algo;
            passwordinputsettings2.flags = i | 3;
            passwordinputsettings2.email = obj2.trim();
            str = obj2;
            str2 = obj;
        }
        showEditDoneProgress(true, true);
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$sendSavePassword$48(z, str, str2, updatepasswordsettings);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavePassword$42(TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$sendSavePassword$41(tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavePassword$41(TLRPC.TL_error tL_error) {
        String formatPluralString;
        showEditDoneProgress(true, false);
        if (tL_error == null) {
            if (getParentActivity() == null) {
                return;
            }
            Runnable runnable = this.shortPollRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.shortPollRunnable = null;
            }
            goToNextStep();
            return;
        }
        if (tL_error.text.startsWith("CODE_INVALID")) {
            shakeView(this.codeFieldCell);
            this.codeFieldCell.setText("", false);
        } else {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (intValue < 60) {
                    formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                }
                showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                return;
            }
            showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavePassword$47(final boolean z, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda55
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$sendSavePassword$46(tL_error, z, tLObject, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavePassword$48(final boolean z, final String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda45
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.this.lambda$sendSavePassword$47(z, str, tLObject, tL_error);
            }
        };
        if (!z) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    requestDelegate.run(null, tL_error);
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, requestDelegate, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            requestDelegate.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, requestDelegate, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavePassword$46(TLRPC.TL_error tL_error, final boolean z, TLObject tLObject, final String str) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda64
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    PaymentFormActivity.this.lambda$sendSavePassword$44(z, tLObject2, tL_error2);
                }
            }, 8);
            return;
        }
        showEditDoneProgress(true, false);
        if (z) {
            TL_account.Password password = this.currentPassword;
            password.has_password = false;
            password.current_algo = null;
            this.delegate.currentPasswordUpdated(password);
            lambda$onBackPressed$355();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (getParentActivity() == null) {
                return;
            }
            goToNextStep();
            return;
        }
        if (tL_error != null) {
            if (tL_error.text.equals("EMAIL_UNCONFIRMED") || tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                this.emailCodeLength = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda65
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        PaymentFormActivity.this.lambda$sendSavePassword$45(str, alertDialog, i);
                    }
                });
                builder.setMessage(LocaleController.getString(R.string.YourEmailAlmostThereText));
                builder.setTitle(LocaleController.getString(R.string.YourEmailAlmostThere));
                Dialog showDialog = showDialog(builder.create());
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            }
            if (tL_error.text.equals("EMAIL_INVALID")) {
                showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                return;
            }
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (intValue < 60) {
                    formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                }
                showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                return;
            }
            showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavePassword$44(final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda70
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$sendSavePassword$43(tL_error, tLObject, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavePassword$43(TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            sendSavePassword(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavePassword$45(String str, AlertDialog alertDialog, int i) {
        this.waitingForEmail = true;
        this.currentPassword.email_unconfirmed_pattern = str;
        updatePasswordFields();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sendCardData() {
        Integer num;
        Integer num2;
        String[] split = this.inputFields[1].getText().toString().split("/");
        if (split.length == 2) {
            num2 = Utilities.parseInt((CharSequence) split[0]);
            num = Utilities.parseInt((CharSequence) split[1]);
        } else {
            num = null;
            num2 = null;
        }
        final Card card = new Card(this.inputFields[0].getText().toString(), num2, num, this.inputFields[3].getText().toString(), this.inputFields[2].getText().toString(), null, null, null, null, this.inputFields[5].getText().toString(), this.inputFields[4].getText().toString(), null);
        this.cardName = card.getBrand() + " *" + card.getLast4();
        boolean z = num2 != null && num != null && UserConfig.getInstance(this.currentAccount).getClientPhone().startsWith("7") && "smartglocal".equals(this.paymentForm.native_provider) && (num.intValue() > 22 || (num.intValue() == 22 && num2.intValue() > 1));
        if (!card.validateNumber()) {
            shakeField(0);
            return false;
        }
        if (!z && (!card.validateExpMonth() || !card.validateExpYear() || !card.validateExpiryDate())) {
            shakeField(1);
            return false;
        }
        if (this.need_card_name && this.inputFields[2].length() == 0) {
            shakeField(2);
            return false;
        }
        if (!card.validateCVC()) {
            shakeField(3);
            return false;
        }
        if (this.need_card_country && this.inputFields[4].length() == 0) {
            shakeField(4);
            return false;
        }
        if (this.need_card_postcode && this.inputFields[5].length() == 0) {
            shakeField(5);
            return false;
        }
        showEditDoneProgress(true, true);
        try {
            if ("stripe".equals(this.paymentForm.native_provider)) {
                new Stripe(this.providerApiKey).createToken(card, new 25());
            } else if ("smartglocal".equals(this.paymentForm.native_provider)) {
                new AsyncTask() { // from class: org.telegram.ui.PaymentFormActivity.26
                    /* JADX INFO: Access modifiers changed from: protected */
                    /* JADX WARN: Can't wrap try/catch for region: R(9:3|4|(9:(12:45|46|(3:48|49|(1:51))|(1:8)(2:41|(1:43)(1:44))|9|10|11|12|13|14|15|(4:23|(1:25)|26|27)(3:19|20|21))|13|14|15|(1:17)|23|(0)|26|27)|6|(0)(0)|9|10|11|12) */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x014b, code lost:
                    
                        r13 = e;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:38:0x0178, code lost:
                    
                        org.telegram.messenger.FileLog.e(r13);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:39:0x017b, code lost:
                    
                        if (r6 == null) goto L54;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
                    
                        if (r6.endsWith(".smart-glocal.com/cds/v1/tokenize/card") == false) goto L15;
                     */
                    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0149: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:64:0x0149 */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0151 A[Catch: all -> 0x0148, Exception -> 0x014b, TRY_LEAVE, TryCatch #2 {Exception -> 0x014b, blocks: (B:12:0x00d6, B:15:0x010d, B:19:0x011c, B:23:0x014d, B:25:0x0151, B:31:0x0177, B:36:0x0174), top: B:11:0x00d6 }] */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[Catch: all -> 0x009e, Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:4:0x0009, B:8:0x00a9, B:9:0x00ce, B:41:0x00b3, B:43:0x00bf, B:44:0x00c7), top: B:3:0x0009 }] */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x00a9 A[Catch: all -> 0x009e, Exception -> 0x00af, TRY_ENTER, TryCatch #0 {Exception -> 0x00af, blocks: (B:4:0x0009, B:8:0x00a9, B:9:0x00ce, B:41:0x00b3, B:43:0x00bf, B:44:0x00c7), top: B:3:0x0009 }] */
                    @Override // android.os.AsyncTask
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public String doInBackground(Object... objArr) {
                        HttpURLConnection httpURLConnection;
                        HttpURLConnection httpURLConnection2;
                        JSONObject jSONObject;
                        String string;
                        URL url;
                        OutputStream outputStream;
                        int responseCode;
                        HttpURLConnection httpURLConnection3 = null;
                        try {
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection3 = httpURLConnection;
                        }
                        try {
                            try {
                                jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("number", card.getNumber());
                                jSONObject2.put("expiration_month", String.format(Locale.US, "%02d", card.getExpMonth()));
                                jSONObject2.put("expiration_year", "" + card.getExpYear());
                                jSONObject2.put("security_code", "" + card.getCVC());
                                jSONObject.put("card", jSONObject2);
                            } catch (Exception e) {
                                e = e;
                                httpURLConnection2 = null;
                            }
                            try {
                                if (PaymentFormActivity.this.paymentForm.native_params != null) {
                                    try {
                                        string = new JSONObject(PaymentFormActivity.this.paymentForm.native_params.data).getString("tokenize_url");
                                        if (string != null) {
                                            try {
                                                if (string.startsWith("https://")) {
                                                }
                                            } catch (Exception unused) {
                                            }
                                        }
                                    } catch (Exception unused2) {
                                    }
                                    if (string != null) {
                                        if (PaymentFormActivity.this.paymentForm.invoice.test) {
                                            url = new URL("https://tgb-playground.smart-glocal.com/cds/v1/tokenize/card");
                                        } else {
                                            url = new URL("https://tgb.smart-glocal.com/cds/v1/tokenize/card");
                                        }
                                    } else {
                                        url = new URL(string);
                                    }
                                    httpURLConnection2 = (HttpURLConnection) url.openConnection();
                                    httpURLConnection2.setConnectTimeout(30000);
                                    httpURLConnection2.setReadTimeout(80000);
                                    httpURLConnection2.setUseCaches(false);
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.setRequestMethod("POST");
                                    httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                                    httpURLConnection2.setRequestProperty("X-PUBLIC-TOKEN", PaymentFormActivity.this.providerApiKey);
                                    outputStream = httpURLConnection2.getOutputStream();
                                    outputStream.write(jSONObject.toString().getBytes("UTF-8"));
                                    outputStream.close();
                                    responseCode = httpURLConnection2.getResponseCode();
                                    if (responseCode < 200 && responseCode < 300) {
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("token", new JSONObject(PaymentFormActivity.getResponseBody(httpURLConnection2.getInputStream())).getJSONObject("data").getString("token"));
                                        jSONObject3.put("type", "card");
                                        String jSONObject4 = jSONObject3.toString();
                                        httpURLConnection2.disconnect();
                                        return jSONObject4;
                                    }
                                    if (BuildVars.DEBUG_VERSION) {
                                        FileLog.e("" + PaymentFormActivity.getResponseBody(httpURLConnection2.getErrorStream()));
                                    }
                                    httpURLConnection2.disconnect();
                                    return null;
                                }
                                outputStream.write(jSONObject.toString().getBytes("UTF-8"));
                                outputStream.close();
                                responseCode = httpURLConnection2.getResponseCode();
                                if (responseCode < 200) {
                                }
                                if (BuildVars.DEBUG_VERSION) {
                                }
                                httpURLConnection2.disconnect();
                                return null;
                            } catch (Throwable th2) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                            string = null;
                            if (string != null) {
                            }
                            httpURLConnection2 = (HttpURLConnection) url.openConnection();
                            httpURLConnection2.setConnectTimeout(30000);
                            httpURLConnection2.setReadTimeout(80000);
                            httpURLConnection2.setUseCaches(false);
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.setRequestMethod("POST");
                            httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                            httpURLConnection2.setRequestProperty("X-PUBLIC-TOKEN", PaymentFormActivity.this.providerApiKey);
                            outputStream = httpURLConnection2.getOutputStream();
                        } catch (Throwable th4) {
                            th = th4;
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            throw th;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onPostExecute(String str) {
                        if (PaymentFormActivity.this.canceled) {
                            return;
                        }
                        if (str != null) {
                            PaymentFormActivity.this.paymentJson = str;
                            PaymentFormActivity.this.goToNextStep();
                        } else {
                            AlertsCreator.showSimpleToast(PaymentFormActivity.this, LocaleController.getString(R.string.PaymentConnectionFailed));
                        }
                        PaymentFormActivity.this.showEditDoneProgress(true, false);
                        PaymentFormActivity.this.setDonePressed(false);
                    }
                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return true;
    }

    class 25 implements TokenCallback {
        25() {
        }

        @Override // com.stripe.android.TokenCallback
        public void onSuccess(Token token) {
            if (PaymentFormActivity.this.canceled) {
                return;
            }
            PaymentFormActivity.this.paymentJson = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", token.getType(), token.getId());
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$25$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.25.this.lambda$onSuccess$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0() {
            PaymentFormActivity.this.goToNextStep();
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.setDonePressed(false);
        }

        @Override // com.stripe.android.TokenCallback
        public void onError(Exception exc) {
            if (PaymentFormActivity.this.canceled) {
                return;
            }
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.setDonePressed(false);
            if ((exc instanceof APIConnectionException) || (exc instanceof APIException)) {
                AlertsCreator.showSimpleToast(PaymentFormActivity.this, LocaleController.getString(R.string.PaymentConnectionFailed));
            } else {
                AlertsCreator.showSimpleToast(PaymentFormActivity.this, exc.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getResponseBody(InputStream inputStream) {
        String next = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
        inputStream.close();
        return next;
    }

    private void sendSavedForm(final Runnable runnable) {
        if (this.canceled) {
            return;
        }
        showEditDoneProgress(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        this.validateRequest = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (this.messageObject != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.messageObject.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.messageObject.getId();
            this.validateRequest.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.invoiceSlug;
            this.validateRequest.invoice = tL_inputInvoiceSlug;
        }
        final TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.validateRequest;
        tL_payments_validateRequestedInfo2.save = true;
        tL_payments_validateRequestedInfo2.info = this.paymentForm.saved_info;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda49
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.this.lambda$sendSavedForm$51(runnable, tL_payments_validateRequestedInfo2, tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavedForm$51(final Runnable runnable, final TLObject tLObject, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        if (tLObject2 instanceof TLRPC.TL_payments_validatedRequestedInfo) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda59
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.this.lambda$sendSavedForm$49(tLObject2, runnable);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda60
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.this.lambda$sendSavedForm$50(tL_error, tLObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavedForm$49(TLObject tLObject, Runnable runnable) {
        this.requestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) tLObject;
        runnable.run();
        setDonePressed(false);
        showEditDoneProgress(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSavedForm$50(TLRPC.TL_error tL_error, TLObject tLObject) {
        setDonePressed(false);
        showEditDoneProgress(true, false);
        if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, this, tLObject, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendForm() {
        if (this.canceled) {
            return;
        }
        showEditDoneProgress(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        this.validateRequest = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (this.messageObject != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.messageObject.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.messageObject.getId();
            this.validateRequest.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.invoiceSlug;
            this.validateRequest.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.validateRequest;
        tL_payments_validateRequestedInfo2.save = this.saveShippingInfo;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (this.paymentForm.invoice.name_requested) {
            this.validateRequest.info.name = this.inputFields[6].getText().toString();
            this.validateRequest.info.flags |= 1;
        }
        if (this.paymentForm.invoice.phone_requested) {
            this.validateRequest.info.phone = "+" + this.inputFields[8].getText().toString() + this.inputFields[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = this.validateRequest.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (this.paymentForm.invoice.email_requested) {
            this.validateRequest.info.email = this.inputFields[7].getText().toString().trim();
            this.validateRequest.info.flags |= 4;
        }
        if (this.paymentForm.invoice.shipping_address_requested) {
            this.validateRequest.info.shipping_address = new TLRPC.TL_postAddress();
            this.validateRequest.info.shipping_address.street_line1 = this.inputFields[0].getText().toString();
            this.validateRequest.info.shipping_address.street_line2 = this.inputFields[1].getText().toString();
            this.validateRequest.info.shipping_address.city = this.inputFields[2].getText().toString();
            this.validateRequest.info.shipping_address.state = this.inputFields[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = this.validateRequest.info.shipping_address;
            String str = this.countryName;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = this.inputFields[5].getText().toString();
            this.validateRequest.info.flags |= 8;
        }
        final TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = this.validateRequest;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(this.validateRequest, new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda40
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.this.lambda$sendForm$55(tL_payments_validateRequestedInfo3, tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendForm$55(final TLObject tLObject, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        if (tLObject2 instanceof TLRPC.TL_payments_validatedRequestedInfo) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda47
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.this.lambda$sendForm$53(tLObject2);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda48
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.this.lambda$sendForm$54(tL_error, tLObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendForm$53(TLObject tLObject) {
        this.requestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) tLObject;
        if (this.paymentForm.saved_info != null && !this.saveShippingInfo) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_clearSavedInfo, new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda61
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    PaymentFormActivity.lambda$sendForm$52(tLObject2, tL_error);
                }
            });
        }
        goToNextStep();
        setDonePressed(false);
        showEditDoneProgress(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendForm$54(TLRPC.TL_error tL_error, TLObject tLObject) {
        setDonePressed(false);
        showEditDoneProgress(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.hashCode();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    shakeField(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    shakeField(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    shakeField(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    shakeField(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    shakeField(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    shakeField(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    shakeField(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    shakeField(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    shakeField(7);
                    break;
                default:
                    AlertsCreator.processError(this.currentAccount, tL_error, this, tLObject, new Object[0]);
                    break;
            }
        }
    }

    private void sendData() {
        String str;
        if (this.canceled) {
            return;
        }
        showEditDoneProgress(false, true);
        final TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.messageObject != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.messageObject.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.messageObject.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.invoiceSlug;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.paymentForm.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && this.savedCredentialsCard != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.id = this.savedCredentialsCard.id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.googlePayCredentials;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.saveCardInfo;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.paymentJson;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.requestedInfo;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.shippingOption;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.paymentForm.invoice.flags & 256) != 0) {
            Long l = this.tipAmount;
            tL_payments_sendPaymentForm.tip_amount = l != null ? l.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda51
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.this.lambda$sendData$69(tL_payments_sendPaymentForm, tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$69(final TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                final TLRPC.Message[] messageArr = new TLRPC.Message[1];
                int size = updates.updates.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    TLRPC.Update update = updates.updates.get(i);
                    if (update instanceof TLRPC.TL_updateNewMessage) {
                        messageArr[0] = ((TLRPC.TL_updateNewMessage) update).message;
                        break;
                    } else {
                        if (update instanceof TLRPC.TL_updateNewChannelMessage) {
                            messageArr[0] = ((TLRPC.TL_updateNewChannelMessage) update).message;
                            break;
                        }
                        i++;
                    }
                }
                getMessagesController().processUpdates(updates, false);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda56
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaymentFormActivity.this.lambda$sendData$60(messageArr);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda57
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaymentFormActivity.this.lambda$sendData$67(tLObject);
                    }
                });
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda58
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$sendData$68(tL_error, tL_payments_sendPaymentForm);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$60(final TLRPC.Message[] messageArr) {
        String str;
        TLRPC.Chat chat;
        int i;
        int i2;
        String string;
        String formatString;
        final Bulletin createSimpleBulletin;
        PaymentFormCallback paymentFormCallback;
        PaymentFormCallback paymentFormCallback2;
        Context context = getContext();
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            context = LaunchActivity.instance;
        }
        if (context == null) {
            return;
        }
        this.paymentStatusSent = true;
        InvoiceStatus invoiceStatus = InvoiceStatus.PAID;
        this.invoiceStatus = invoiceStatus;
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        boolean z = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        final boolean z2 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
        boolean z3 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
        if (!z && (paymentFormCallback2 = this.paymentFormCallback) != null) {
            paymentFormCallback2.onInvoiceStatusChanged(invoiceStatus);
        }
        goToNextStep();
        if (z && (paymentFormCallback = this.paymentFormCallback) != null) {
            paymentFormCallback.onInvoiceStatusChanged(this.invoiceStatus);
        }
        final long starsGiftUserId = getStarsGiftUserId();
        if (starsGiftUserId > 0) {
            str = UserObject.getForcedFirstName(getMessagesController().getUser(Long.valueOf(starsGiftUserId)));
        } else {
            str = "";
            if (starsGiftUserId < 0 && (chat = getMessagesController().getChat(Long.valueOf(-starsGiftUserId))) != null) {
                str = chat.title;
            }
        }
        long stars = getStars();
        if (z) {
            i = (z2 || z3) ? R.raw.stars_send : R.raw.stars_topup;
        } else {
            i = R.raw.payment_success;
        }
        int i3 = i;
        if (z) {
            if (z3) {
                i2 = R.string.StarsGiveawaySentPopup;
            } else {
                i2 = z2 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired;
            }
            string = LocaleController.getString(i2);
        } else {
            string = null;
        }
        if (!z) {
            formatString = LocaleController.formatString(R.string.PaymentInfoHint, this.totalPrice[0], this.currentItemName);
        } else if (z3) {
            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) stars);
        } else {
            formatString = LocaleController.formatPluralStringComma(z2 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) stars, str);
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BulletinFactory of = BulletinFactory.of(safeLastFragment);
        if (starsGiftUserId != 0 && string != null && !z3) {
            createSimpleBulletin = of.createSimpleBulletin(i3, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda66
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.lambda$sendData$56(starsGiftUserId);
                }
            });
        } else if (string != null) {
            createSimpleBulletin = of.createSimpleBulletin(i3, string, replaceTags);
        } else {
            createSimpleBulletin = of.createSimpleBulletin(i3, replaceTags);
        }
        createSimpleBulletin.hideAfterBottomSheet = false;
        createSimpleBulletin.setDuration(5000);
        if (messageArr[0] != null) {
            createSimpleBulletin.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda67
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentFormActivity.this.lambda$sendData$59(createSimpleBulletin, z2, messageArr, view);
                }
            });
        }
        createSimpleBulletin.show(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendData$56(long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$59(Bulletin bulletin, boolean z, TLRPC.Message[] messageArr, View view) {
        bulletin.hide();
        if (z) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(ChatActivity.of(MessageObject.getDialogId(messageArr[0]), messageArr[0].id));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageArr[0].peer_id);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda68
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.this.lambda$sendData$58(tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$58(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda74
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$sendData$57(tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$57(TLObject tLObject) {
        BaseFragment lastFragment;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            StarsIntroActivity.showTransactionSheet(getContext(), false, this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, getResourceProvider());
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject), bottomSheetParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$67(TLObject tLObject) {
        setDonePressed(false);
        this.webviewLoading = true;
        showEditDoneProgress(true, true);
        ContextProgressView contextProgressView = this.progressView;
        if (contextProgressView != null) {
            contextProgressView.setVisibility(0);
        }
        ActionBarMenuItem actionBarMenuItem = this.doneItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setEnabled(false);
            this.doneItem.getContentView().setVisibility(4);
        }
        final INavigationLayout parentLayout = getParentLayout();
        final Activity parentActivity = getParentActivity();
        getMessagesController().newMessageCallback = new MessagesController.NewMessageCallback() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda62
            @Override // org.telegram.messenger.MessagesController.NewMessageCallback
            public final boolean onMessageReceived(TLRPC.Message message) {
                boolean lambda$sendData$66;
                lambda$sendData$66 = PaymentFormActivity.this.lambda$sendData$66(parentLayout, parentActivity, message);
                return lambda$sendData$66;
            }
        };
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
            WebView webView2 = this.webView;
            String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
            this.webViewUrl = str;
            webView2.loadUrl(str);
        }
        this.paymentStatusSent = true;
        InvoiceStatus invoiceStatus = InvoiceStatus.PENDING;
        this.invoiceStatus = invoiceStatus;
        PaymentFormCallback paymentFormCallback = this.paymentFormCallback;
        if (paymentFormCallback != null) {
            paymentFormCallback.onInvoiceStatusChanged(invoiceStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$sendData$66(final INavigationLayout iNavigationLayout, final Activity activity, final TLRPC.Message message) {
        if (MessageObject.getPeerId(message.peer_id) != this.botUser.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda69
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$sendData$65(iNavigationLayout, activity, message);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$65(INavigationLayout iNavigationLayout, Activity activity, final TLRPC.Message message) {
        String str;
        TLRPC.Chat chat;
        int i;
        int i2;
        String string;
        String formatString;
        final Bulletin createSimpleBulletin;
        PaymentFormCallback paymentFormCallback;
        PaymentFormCallback paymentFormCallback2;
        this.paymentStatusSent = true;
        this.invoiceStatus = InvoiceStatus.PAID;
        onCheckoutSuccess(iNavigationLayout, activity);
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        boolean z = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        final boolean z2 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
        boolean z3 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
        if (!z && (paymentFormCallback2 = this.paymentFormCallback) != null) {
            paymentFormCallback2.onInvoiceStatusChanged(this.invoiceStatus);
        }
        goToNextStep();
        if (z && (paymentFormCallback = this.paymentFormCallback) != null) {
            paymentFormCallback.onInvoiceStatusChanged(this.invoiceStatus);
        }
        final long starsGiftUserId = getStarsGiftUserId();
        if (starsGiftUserId > 0) {
            str = UserObject.getForcedFirstName(getMessagesController().getUser(Long.valueOf(starsGiftUserId)));
        } else {
            str = "";
            if (starsGiftUserId < 0 && (chat = getMessagesController().getChat(Long.valueOf(-starsGiftUserId))) != null) {
                str = chat.title;
            }
        }
        long stars = getStars();
        if (z) {
            i = (z2 || z3) ? R.raw.stars_send : R.raw.stars_topup;
        } else {
            i = R.raw.payment_success;
        }
        int i3 = i;
        if (z) {
            if (z3) {
                i2 = R.string.StarsGiveawaySentPopup;
            } else {
                i2 = z2 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired;
            }
            string = LocaleController.getString(i2);
        } else {
            string = null;
        }
        if (!z) {
            formatString = LocaleController.formatString(R.string.PaymentInfoHint, this.totalPrice[0], this.currentItemName);
        } else if (z3) {
            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) stars);
        } else {
            formatString = LocaleController.formatPluralStringComma(z2 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) stars, str);
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BulletinFactory of = BulletinFactory.of(safeLastFragment);
        if (starsGiftUserId != 0 && string != null && !z3) {
            createSimpleBulletin = of.createSimpleBulletin(i3, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda72
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentFormActivity.lambda$sendData$61(starsGiftUserId);
                }
            });
        } else if (string != null) {
            createSimpleBulletin = of.createSimpleBulletin(i3, string, replaceTags);
        } else {
            createSimpleBulletin = of.createSimpleBulletin(i3, replaceTags);
        }
        createSimpleBulletin.hideAfterBottomSheet = false;
        createSimpleBulletin.setDuration(5000);
        if (message != null) {
            createSimpleBulletin.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda73
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentFormActivity.this.lambda$sendData$64(createSimpleBulletin, z2, message, view);
                }
            });
        }
        createSimpleBulletin.show(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendData$61(long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$64(Bulletin bulletin, boolean z, TLRPC.Message message, View view) {
        bulletin.hide();
        if (z) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(ChatActivity.of(MessageObject.getDialogId(message), message.id));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(message.peer_id);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda75
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.this.lambda$sendData$63(tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$63(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$sendData$62(tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$62(TLObject tLObject) {
        BaseFragment lastFragment;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            StarsIntroActivity.showTransactionSheet(getContext(), false, this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, getResourceProvider());
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject), bottomSheetParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendData$68(TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        AlertsCreator.processError(this.currentAccount, tL_error, this, tL_payments_sendPaymentForm, new Object[0]);
        setDonePressed(false);
        showEditDoneProgress(false, false);
        this.paymentStatusSent = true;
        InvoiceStatus invoiceStatus = InvoiceStatus.FAILED;
        this.invoiceStatus = invoiceStatus;
        PaymentFormCallback paymentFormCallback = this.paymentFormCallback;
        if (paymentFormCallback != null) {
            paymentFormCallback.onInvoiceStatusChanged(invoiceStatus);
        }
    }

    private long getStars() {
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
            return ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).stars;
        }
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) {
            return ((TLRPC.TL_inputStorePaymentStarsTopup) inputStorePaymentPurpose).stars;
        }
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) {
            return ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).stars;
        }
        return 0L;
    }

    private long getStarsGiftUserId() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
            TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
            if (inputUser != null) {
                return inputUser.user_id;
            }
            return 0L;
        }
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) == null) {
            return 0L;
        }
        return DialogObject.getPeerDialogId(inputPeer);
    }

    private void shakeField(int i) {
        shakeView(this.inputFields[i]);
    }

    private void shakeView(View view) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 2.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDonePressed(boolean z) {
        this.donePressed = z;
        this.swipeBackEnabled = !z;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.donePressed);
        }
        TextDetailSettingsCell textDetailSettingsCell = this.detailSettingsCell[0];
        if (textDetailSettingsCell != null) {
            textDetailSettingsCell.setEnabled(!this.donePressed);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPassword() {
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(this.currentAccount).tmpPassword = null;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null) {
            sendData();
            return;
        }
        if (this.inputFields[1].length() == 0) {
            try {
                this.inputFields[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(this.inputFields[1], 2.5f);
            return;
        }
        final String obj = this.inputFields[1].getText().toString();
        showEditDoneProgress(true, true);
        setDonePressed(true);
        final TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpassword, new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda42
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.this.lambda$checkPassword$74(obj, getpassword, tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkPassword$74(final String str, final TL_account.getPassword getpassword, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda53
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$checkPassword$73(tL_error, tLObject, str, getpassword);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkPassword$73(TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            final TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            } else if (!password.has_password) {
                this.passwordOk = false;
                goToNextStep();
                return;
            } else {
                final byte[] stringBytes = AndroidUtilities.getStringBytes(str);
                Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda54
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaymentFormActivity.this.lambda$checkPassword$72(password, stringBytes);
                    }
                });
                return;
            }
        }
        AlertsCreator.processError(this.currentAccount, tL_error, this, getpassword, new Object[0]);
        showEditDoneProgress(true, false);
        setDonePressed(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkPassword$72(TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        final TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda63
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.this.lambda$checkPassword$71(gettmppassword, tLObject, tL_error);
            }
        };
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                requestDelegate.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, requestDelegate, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        requestDelegate.run(null, tL_error2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkPassword$71(final TL_account.getTmpPassword gettmppassword, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda71
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFormActivity.this.lambda$checkPassword$70(tLObject, tL_error, gettmppassword);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkPassword$70(TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        showEditDoneProgress(true, false);
        setDonePressed(false);
        if (tLObject != null) {
            this.passwordOk = true;
            UserConfig.getInstance(this.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
            goToNextStep();
            return;
        }
        if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                this.inputFields[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(this.inputFields[1], 3.25f);
            this.inputFields[1].setText("");
            return;
        }
        AlertsCreator.processError(this.currentAccount, tL_error, this, gettmppassword, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEditDoneProgress(boolean z, final boolean z2) {
        AnimatorSet animatorSet = this.doneItemAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z && this.doneItem != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.doneItemAnimation = animatorSet2;
            if (z2) {
                this.progressView.setVisibility(0);
                this.doneItem.setEnabled(false);
                AnimatorSet animatorSet3 = this.doneItemAnimation;
                View contentView = this.doneItem.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property, 0.1f);
                View contentView2 = this.doneItem.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property2, 0.1f);
                View contentView3 = this.doneItem.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property3, 1.0f));
            } else if (this.webView != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.ALPHA, 0.0f));
            } else {
                this.doneItem.getContentView().setVisibility(0);
                this.doneItem.setEnabled(true);
                AnimatorSet animatorSet4 = this.doneItemAnimation;
                ContextProgressView contextProgressView = this.progressView;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(contextProgressView, (Property<ContextProgressView, Float>) property4, 0.1f);
                ContextProgressView contextProgressView2 = this.progressView;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(contextProgressView2, (Property<ContextProgressView, Float>) property5, 0.1f);
                ContextProgressView contextProgressView3 = this.progressView;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(contextProgressView3, (Property<ContextProgressView, Float>) property6, 0.0f));
                if (!isFinishing()) {
                    this.doneItemAnimation.playTogether(ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property6, 1.0f));
                }
            }
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.PaymentFormActivity.27
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    if (!z2) {
                        PaymentFormActivity.this.progressView.setVisibility(4);
                    } else {
                        PaymentFormActivity.this.doneItem.getContentView().setVisibility(4);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    PaymentFormActivity.this.doneItemAnimation = null;
                }
            });
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
            return;
        }
        if (this.payTextView != null) {
            this.doneItemAnimation = new AnimatorSet();
            if (z2) {
                this.progressViewButton.setVisibility(0);
                this.bottomLayout.setEnabled(false);
                AnimatorSet animatorSet5 = this.doneItemAnimation;
                TextView textView = this.payTextView;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property7, 0.1f);
                TextView textView2 = this.payTextView;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property8, 0.1f);
                TextView textView3 = this.payTextView;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property9, 1.0f));
            } else {
                this.payTextView.setVisibility(0);
                this.bottomLayout.setEnabled(true);
                AnimatorSet animatorSet6 = this.doneItemAnimation;
                ContextProgressView contextProgressView4 = this.progressViewButton;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(contextProgressView4, (Property<ContextProgressView, Float>) property10, 0.1f);
                ContextProgressView contextProgressView5 = this.progressViewButton;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(contextProgressView5, (Property<ContextProgressView, Float>) property11, 0.1f);
                ContextProgressView contextProgressView6 = this.progressViewButton;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(contextProgressView6, (Property<ContextProgressView, Float>) property12, 0.0f), ObjectAnimator.ofFloat(this.payTextView, (Property<TextView, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.payTextView, (Property<TextView, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.payTextView, (Property<TextView, Float>) property12, 1.0f));
            }
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.PaymentFormActivity.28
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    if (!z2) {
                        PaymentFormActivity.this.progressViewButton.setVisibility(4);
                    } else {
                        PaymentFormActivity.this.payTextView.setVisibility(4);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    PaymentFormActivity.this.doneItemAnimation = null;
                }
            });
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean presentFragment(BaseFragment baseFragment) {
        onPresentFragment(baseFragment);
        return super.presentFragment(baseFragment);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean presentFragment(BaseFragment baseFragment, boolean z) {
        onPresentFragment(baseFragment);
        return super.presentFragment(baseFragment, z);
    }

    private void onPresentFragment(BaseFragment baseFragment) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (baseFragment instanceof PaymentFormActivity) {
            PaymentFormActivity paymentFormActivity = (PaymentFormActivity) baseFragment;
            paymentFormActivity.paymentFormCallback = this.paymentFormCallback;
            paymentFormActivity.resourcesProvider = this.resourcesProvider;
            paymentFormActivity.needPayAfterTransition = this.needPayAfterTransition;
            paymentFormActivity.savedCredentialsCard = this.savedCredentialsCard;
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed() {
        if (this.shouldNavigateBack) {
            this.webView.loadUrl(this.webViewUrl);
            this.shouldNavigateBack = false;
            return false;
        }
        return !this.donePressed;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.scrollView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        ContextProgressView contextProgressView = this.progressView;
        int i3 = Theme.key_contextProgressInner2;
        arrayList.add(new ThemeDescription(contextProgressView, 0, null, null, null, null, i3));
        ContextProgressView contextProgressView2 = this.progressView;
        int i4 = Theme.key_contextProgressOuter2;
        arrayList.add(new ThemeDescription(contextProgressView2, 0, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i4));
        if (this.inputFields != null) {
            for (int i5 = 0; i5 < this.inputFields.length; i5++) {
                arrayList.add(new ThemeDescription((View) this.inputFields[i5].getParent(), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
                arrayList.add(new ThemeDescription(this.inputFields[i5], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
                arrayList.add(new ThemeDescription(this.inputFields[i5], ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
            }
        } else {
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
        }
        if (this.radioCells != null) {
            for (int i6 = 0; i6 < this.radioCells.length; i6++) {
                arrayList.add(new ThemeDescription(this.radioCells[i6], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_windowBackgroundWhite));
                arrayList.add(new ThemeDescription(this.radioCells[i6], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
                arrayList.add(new ThemeDescription(this.radioCells[i6], 0, new Class[]{RadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
                arrayList.add(new ThemeDescription(this.radioCells[i6], ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackground));
                arrayList.add(new ThemeDescription(this.radioCells[i6], ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackgroundChecked));
            }
        } else {
            arrayList.add(new ThemeDescription((View) null, 0, new Class[]{RadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription((View) null, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackground));
            arrayList.add(new ThemeDescription((View) null, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackgroundChecked));
        }
        for (int i7 = 0; i7 < this.headerCell.length; i7++) {
            arrayList.add(new ThemeDescription(this.headerCell[i7], ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.headerCell[i7], 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        }
        for (int i8 = 0; i8 < this.sectionCell.length; i8++) {
            arrayList.add(new ThemeDescription(this.sectionCell[i8], ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        }
        for (int i9 = 0; i9 < this.bottomCell.length; i9++) {
            arrayList.add(new ThemeDescription(this.bottomCell[i9], ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
            arrayList.add(new ThemeDescription(this.bottomCell[i9], 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
            arrayList.add(new ThemeDescription(this.bottomCell[i9], ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteLinkText));
        }
        for (int i10 = 0; i10 < this.dividers.size(); i10++) {
            arrayList.add(new ThemeDescription((View) this.dividers.get(i10), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
        }
        EditTextSettingsCell editTextSettingsCell = this.codeFieldCell;
        int i11 = ThemeDescription.FLAG_BACKGROUND;
        int i12 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(editTextSettingsCell, i11, null, null, null, null, i12));
        int i13 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.codeFieldCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.codeFieldCell, ThemeDescription.FLAG_HINTTEXTCOLOR, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteHintText));
        arrayList.add(new ThemeDescription(this.textView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.checkCell1, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.checkCell1, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.checkCell1, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.checkCell1, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.checkCell1, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
        for (int i14 = 0; i14 < this.settingsCell.length; i14++) {
            arrayList.add(new ThemeDescription(this.settingsCell[i14], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.settingsCell[i14], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(this.settingsCell[i14], 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        }
        arrayList.add(new ThemeDescription(this.payTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlueText6));
        int i15 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextPriceCell.class}, null, null, null, i15));
        int i16 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextPriceCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextPriceCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        int i17 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextPriceCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i17));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextPriceCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i17));
        arrayList.add(new ThemeDescription(this.detailSettingsCell[0], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, i15));
        arrayList.add(new ThemeDescription(this.detailSettingsCell[0], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
        for (int i18 = 1; i18 < this.detailSettingsCell.length; i18++) {
            arrayList.add(new ThemeDescription(this.detailSettingsCell[i18], ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.detailSettingsCell[i18], 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(this.detailSettingsCell[i18], 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        }
        PaymentInfoCell paymentInfoCell = this.paymentInfoCell;
        int i19 = ThemeDescription.FLAG_BACKGROUND;
        int i20 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(paymentInfoCell, i19, null, null, null, null, i20));
        int i21 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.paymentInfoCell, 0, new Class[]{PaymentInfoCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i21));
        arrayList.add(new ThemeDescription(this.paymentInfoCell, 0, new Class[]{PaymentInfoCell.class}, new String[]{"detailTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i21));
        arrayList.add(new ThemeDescription(this.paymentInfoCell, 0, new Class[]{PaymentInfoCell.class}, new String[]{"detailExTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.bottomLayout, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, i20));
        arrayList.add(new ThemeDescription(this.bottomLayout, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    class BottomFrameLayout extends FrameLayout {
        Paint paint;
        float progress;
        SpringAnimation springAnimation;

        public BottomFrameLayout(Context context, TLRPC.PaymentForm paymentForm) {
            super(context);
            this.paint = new Paint(1);
            setWillNotDraw(false);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(PaymentFormActivity.this.getThemedColor(Theme.key_switchTrackBlue));
            this.paint.setColor(PaymentFormActivity.this.getThemedColor(Theme.key_contacts_inviteBackground));
            canvas.drawCircle(LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(28.0f), -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.progress, this.paint);
        }

        public void setChecked(boolean z, boolean z2) {
            SpringAnimation springAnimation = this.springAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            float f = z ? 1.0f : 0.0f;
            if (!z2) {
                this.progress = f;
                if (PaymentFormActivity.this.payTextView != null) {
                    PaymentFormActivity.this.payTextView.setAlpha((this.progress * 0.2f) + 0.8f);
                }
                invalidate();
                return;
            }
            if (this.progress == f) {
                return;
            }
            SpringAnimation spring = new SpringAnimation(new FloatValueHolder(this.progress * 100.0f)).setSpring(new SpringForce(f * 100.0f).setStiffness(z ? 500.0f : 650.0f).setDampingRatio(1.0f));
            this.springAnimation = spring;
            spring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.PaymentFormActivity$BottomFrameLayout$$ExternalSyntheticLambda0
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                    PaymentFormActivity.BottomFrameLayout.this.lambda$setChecked$0(dynamicAnimation, f2, f3);
                }
            });
            this.springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.PaymentFormActivity$BottomFrameLayout$$ExternalSyntheticLambda1
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f2, float f3) {
                    PaymentFormActivity.BottomFrameLayout.this.lambda$setChecked$1(dynamicAnimation, z3, f2, f3);
                }
            });
            this.springAnimation.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setChecked$0(DynamicAnimation dynamicAnimation, float f, float f2) {
            this.progress = f / 100.0f;
            if (PaymentFormActivity.this.payTextView != null) {
                PaymentFormActivity.this.payTextView.setAlpha((this.progress * 0.2f) + 0.8f);
            }
            invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setChecked$1(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            if (dynamicAnimation == this.springAnimation) {
                this.springAnimation = null;
            }
        }
    }
}
