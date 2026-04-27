package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.AwayMessagesActivity;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Business.TimezonesController;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.Premium.AboutPremiumView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.PremiumNotAvailableBottomSheet;
import org.telegram.ui.Components.Premium.PremiumTierCell;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanBotCommand;
import org.telegram.ui.Components.URLSpanBrowser;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.recorder.HintView2;

/* loaded from: classes4.dex */
public class PremiumPreviewFragment extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    BackgroundView backgroundView;
    private FrameLayout buttonContainer;
    private FrameLayout buttonContainerInternal;
    private FrameLayout contentView;
    SubscriptionTier currentSubscriptionTier;
    private int currentYOffset;
    PremiumFeatureCell dummyCell;
    PremiumTierCell dummyTierCell;
    int featuresEndRow;
    int featuresStartRow;
    private int firstViewHeight;
    private boolean forcePremium;
    final Canvas gradientCanvas;
    Paint gradientPaint;
    final Bitmap gradientTextureBitmap;
    PremiumGradient.PremiumGradientTools gradientTools;
    int helpUsRow;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryBg;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSource iBlur3Source;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    boolean inc;
    private boolean isDialogVisible;
    boolean isLandscapeMode;
    int lastPaddingRow;
    FillLastLinearLayoutManager layoutManager;
    RecyclerListView listView;
    Matrix matrix;
    int moreFeaturesEndRow;
    int moreFeaturesStartRow;
    int moreHeaderRow;
    ArrayList morePremiumFeatures;
    private BlurredBackgroundWithFadeDrawable navbarProtectionDrawable;
    int paddingRow;
    StarParticlesView particlesView;
    private PremiumButtonView premiumButtonView;
    ArrayList premiumFeatures;
    int privacyRow;
    float progress;
    float progressToFull;
    int rowCount;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    int sectionRow;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
    private boolean selectAnnualByDefault;
    int selectedTierIndex;
    FrameLayout settingsView;
    Shader shader;
    Drawable shadowDrawable;
    int showAdsHeaderRow;
    int showAdsInfoRow;
    int showAdsRow;
    private String source;
    private int statusBarHeight;
    int statusRow;
    Paint strokePaint;
    Shader strokeShader;
    final ArrayList subscriptionTiers;
    PremiumGradient.PremiumGradientTools tiersGradientTools;
    int totalGradientHeight;
    float totalProgress;
    int totalTiersGradientHeight;
    private final int type;
    private final boolean whiteBackground;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sentPremiumButtonClick$21(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sentPremiumBuyCanceled$22(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sentShowFeaturePreview$23(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sentShowScreenStat$20(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateButtonText$18(View view) {
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int serverStringToFeatureType(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2145993328:
                if (str.equals("animated_userpics")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2080028929:
                if (str.equals("infinite_reactions")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -2022719725:
                if (str.equals("stories__caption")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1975141450:
                if (str.equals("away_message")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1953490480:
                if (str.equals("business_hours")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1952597715:
                if (str.equals("business_intro")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1949982086:
                if (str.equals("business_links")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1924078036:
                if (str.equals("stories__quality")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1919626711:
                if (str.equals("stories__save_stories_to_gallery")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1884266413:
                if (str.equals("stories")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1833928446:
                if (str.equals("effects")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1777612460:
                if (str.equals("business_location")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1761847571:
                if (str.equals("peer_colors")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1755514268:
                if (str.equals("voice_to_text")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1529105743:
                if (str.equals("wallpapers")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1516580016:
                if (str.equals("message_privacy")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1425144150:
                if (str.equals("animated_emoji")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1225497630:
                if (str.equals("translations")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1146830912:
                if (str.equals("business")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1040323278:
                if (str.equals("no_ads")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1023650261:
                if (str.equals("more_upload")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -969043445:
                if (str.equals("emoji_status")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -730864243:
                if (str.equals("profile_badge")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -448825858:
                if (str.equals("faster_download")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -294265343:
                if (str.equals("greeting_message")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -165039170:
                if (str.equals("premium_stickers")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -96210874:
                if (str.equals("double_limits")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 3565638:
                if (str.equals("todo")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 98352451:
                if (str.equals("gifts")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 110781770:
                if (str.equals("folder_tags")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 234735554:
                if (str.equals("stories__expiration_durations")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 388416338:
                if (str.equals("stories__stealth_mode")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 480338102:
                if (str.equals("quick_replies")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 622623867:
                if (str.equals("ai_compose")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 629542059:
                if (str.equals("business_bots")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 705083174:
                if (str.equals("stories__priority_order")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1054743185:
                if (str.equals("pm_noforwards")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 1080006662:
                if (str.equals("stories__links_and_formatting")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 1219849581:
                if (str.equals("advanced_chat_management")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1438966047:
                if (str.equals("stories__permanent_views_history")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 1537309393:
                if (str.equals("saved_tags")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 1832801148:
                if (str.equals("app_icons")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 2013274756:
                if (str.equals("last_seen")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 7;
            case 1:
                return 4;
            case 2:
                return 21;
            case 3:
                return 33;
            case 4:
                return 30;
            case 5:
                return 36;
            case 6:
                return 37;
            case 7:
                return 25;
            case '\b':
                return 18;
            case '\t':
                return 14;
            case '\n':
                return 38;
            case 11:
                return 29;
            case '\f':
                return 23;
            case '\r':
                return 8;
            case 14:
                return 22;
            case 15:
                return 27;
            case 16:
                return 11;
            case 17:
                return 13;
            case 18:
                return 28;
            case 19:
                return 3;
            case 20:
                return 1;
            case 21:
                return 12;
            case 22:
                return 6;
            case 23:
                return 2;
            case 24:
                return 32;
            case 25:
                return 5;
            case 26:
                return 0;
            case 27:
                return 39;
            case 28:
                return 40;
            case 29:
                return 35;
            case 30:
                return 17;
            case 31:
                return 15;
            case ' ':
                return 31;
            case '!':
                return 42;
            case '\"':
                return 34;
            case '#':
                return 20;
            case '$':
                return 41;
            case '%':
                return 19;
            case '&':
                return 9;
            case '\'':
                return 16;
            case '(':
                return 24;
            case ')':
                return 10;
            case '*':
                return 26;
            default:
                return -1;
        }
    }

    public static String featureTypeToServerString(int i) {
        switch (i) {
            case 0:
                return "double_limits";
            case 1:
                return "more_upload";
            case 2:
                return "faster_download";
            case 3:
                return "no_ads";
            case 4:
                return "infinite_reactions";
            case 5:
                return "premium_stickers";
            case 6:
                return "profile_badge";
            case 7:
                return "animated_userpics";
            case 8:
                return "voice_to_text";
            case 9:
                return "advanced_chat_management";
            case 10:
                return "app_icons";
            case 11:
                return "animated_emoji";
            case 12:
                return "emoji_status";
            case 13:
                return "translations";
            case 14:
                return "stories";
            case 15:
                return "stories__stealth_mode";
            case 16:
                return "stories__permanent_views_history";
            case 17:
                return "stories__expiration_durations";
            case 18:
                return "stories__save_stories_to_gallery";
            case 19:
                return "stories__links_and_formatting";
            case 20:
                return "stories__priority_order";
            case 21:
                return "stories__caption";
            case 22:
                return "wallpapers";
            case 23:
                return "peer_colors";
            case 24:
                return "saved_tags";
            case 25:
                return "stories__quality";
            case 26:
                return "last_seen";
            case 27:
                return "message_privacy";
            case 28:
                return "business";
            case 29:
                return "business_location";
            case 30:
                return "business_hours";
            case 31:
                return "quick_replies";
            case 32:
                return "greeting_message";
            case 33:
                return "away_message";
            case 34:
                return "business_bots";
            case 35:
                return "folder_tags";
            case 36:
                return "business_intro";
            case 37:
                return "business_links";
            case 38:
                return "effects";
            case 39:
                return "todo";
            case 40:
                return "gifts";
            case 41:
                return "pm_noforwards";
            case 42:
                return "ai_compose";
            default:
                return null;
        }
    }

    public PremiumPreviewFragment setForcePremium() {
        this.forcePremium = true;
        return this;
    }

    public PremiumPreviewFragment(String str) {
        this(0, str);
    }

    public PremiumPreviewFragment(int i, String str) {
        this.premiumFeatures = new ArrayList();
        this.morePremiumFeatures = new ArrayList();
        this.subscriptionTiers = new ArrayList();
        boolean z = false;
        this.selectedTierIndex = 0;
        this.strokePaint = new Paint(1);
        this.matrix = new Matrix();
        this.gradientPaint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.gradientTextureBitmap = createBitmap;
        this.gradientCanvas = new Canvas(createBitmap);
        this.gradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradientBackground1, Theme.key_premiumGradientBackground2, Theme.key_premiumGradientBackground3, Theme.key_premiumGradientBackground4);
        PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1);
        this.tiersGradientTools = premiumGradientTools;
        premiumGradientTools.exactly = true;
        premiumGradientTools.x1 = 0.0f;
        premiumGradientTools.y1 = 0.0f;
        premiumGradientTools.x2 = 0.0f;
        premiumGradientTools.y2 = 1.0f;
        premiumGradientTools.cx = 0.0f;
        premiumGradientTools.cy = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionMainTabs = rectF;
        arrayList.add(rectF);
        this.type = i;
        if (!Theme.isCurrentThemeDark() && i == 1) {
            z = true;
        }
        this.whiteBackground = z;
        this.source = str;
        BlurredBackgroundSource blurredBackgroundSource = new BlurredBackgroundSource() { // from class: org.telegram.ui.PremiumPreviewFragment.1
            private final Paint p = new Paint();

            @Override // org.telegram.ui.Components.blur3.source.BlurredBackgroundSource
            public /* synthetic */ void dispatchOnDrawablesRelativePositionChange() {
                BlurredBackgroundSource.-CC.$default$dispatchOnDrawablesRelativePositionChange(this);
            }

            @Override // org.telegram.ui.Components.blur3.source.BlurredBackgroundSource
            public BlurredBackgroundDrawable createDrawable() {
                return new BlurredBackgroundDrawableSource(this);
            }

            @Override // org.telegram.ui.Components.blur3.source.BlurredBackgroundSource
            public void draw(Canvas canvas, float f, float f2, float f3, float f4) {
                if (PremiumPreviewFragment.this.whiteBackground) {
                    this.p.setColor(PremiumPreviewFragment.this.getThemedColor(Theme.key_windowBackgroundGray));
                    canvas.drawRect(f, f2, f3, f4, this.p);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    premiumPreviewFragment.gradientTools.gradientMatrix(0, 0, premiumPreviewFragment.contentView.getMeasuredWidth(), PremiumPreviewFragment.this.contentView.getMeasuredHeight(), (-PremiumPreviewFragment.this.contentView.getMeasuredWidth()) * 0.1f * PremiumPreviewFragment.this.progress, 0.0f);
                    canvas.drawRect(f, f2, f3, f4, PremiumPreviewFragment.this.gradientTools.paint);
                }
            }
        };
        this.iBlur3Source = blurredBackgroundSource;
        if (Build.VERSION.SDK_INT >= 31) {
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(true, true);
            this.scrollableViewNoiseSuppressor = downscaleScrollableNoiseSuppressor;
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setScrollableNoiseSuppressor(downscaleScrollableNoiseSuppressor, -3);
            blurredBackgroundSourceRenderNode.setUnderSource(blurredBackgroundSource);
            this.iBlur3Factory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3Factory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSource);
        }
        this.iBlur3FactoryBg = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSource);
    }

    public PremiumPreviewFragment setSelectAnnualByDefault() {
        this.selectAnnualByDefault = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$0(Canvas canvas, RectF rectF) {
        RecyclerListView recyclerListView = this.listView;
        Blur3Utils.captureRelativeParent(recyclerListView, canvas, rectF, recyclerListView, this.contentView);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        this.iBlur3Capture = new IBlur3Capture() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda4
            @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
            public final void capture(Canvas canvas, RectF rectF) {
                PremiumPreviewFragment.this.lambda$createView$0(canvas, rectF);
            }

            @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
            public /* synthetic */ void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
                iBlur3Hash.unsupported();
            }
        };
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        this.strokeShader = linearGradient;
        this.strokePaint.setShader(linearGradient);
        this.strokePaint.setStyle(Paint.Style.STROKE);
        int color = Theme.getColor(Theme.key_premiumGradient4);
        int color2 = Theme.getColor(Theme.key_premiumGradient3);
        int i = Theme.key_premiumGradient2;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{color, color2, Theme.getColor(i), Theme.getColor(Theme.key_premiumGradient1), Theme.getColor(Theme.key_premiumGradient0)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.shader = linearGradient2;
        linearGradient2.setLocalMatrix(this.matrix);
        this.gradientPaint.setShader(this.shader);
        this.dummyCell = new PremiumFeatureCell(context);
        this.dummyTierCell = new PremiumTierCell(context);
        this.premiumFeatures.clear();
        this.morePremiumFeatures.clear();
        if (this.type == 0) {
            fillPremiumFeaturesList(this.premiumFeatures, this.currentAccount, false);
        } else {
            fillBusinessFeaturesList(this.premiumFeatures, this.currentAccount, false);
            fillBusinessFeaturesList(this.morePremiumFeatures, this.currentAccount, true);
            QuickRepliesController.getInstance(this.currentAccount).load();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                BusinessChatbotController.getInstance(this.currentAccount).load(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                BusinessLinksController.getInstance(this.currentAccount).load(false);
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.statusBarHeight = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
        this.contentView = new FrameLayout(context) { // from class: org.telegram.ui.PremiumPreviewFragment.2
            private final Paint backgroundPaint = new Paint(1);
            boolean iconInterceptedTouch;
            boolean ignoreLayout;
            int lastSize;
            boolean listInterceptedTouch;

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                float x = PremiumPreviewFragment.this.backgroundView.getX() + PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getX();
                float y = PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getY();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(x, y, (PremiumPreviewFragment.this.backgroundView.imageView == null ? 0 : PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredWidth()) + x, (PremiumPreviewFragment.this.backgroundView.imageView == null ? 0 : PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredHeight()) + y);
                if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.iconInterceptedTouch) && !PremiumPreviewFragment.this.listView.scrollingByUser) {
                    motionEvent.offsetLocation(-x, -y);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.iconInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.iconInterceptedTouch = false;
                    }
                    PremiumPreviewFragment.this.backgroundView.imageView.dispatchTouchEvent(motionEvent);
                    return true;
                }
                float x2 = PremiumPreviewFragment.this.backgroundView.getX() + PremiumPreviewFragment.this.backgroundView.tierListView.getX();
                float y2 = PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.tierListView.getY();
                rectF.set(x2, y2, PremiumPreviewFragment.this.backgroundView.tierListView.getWidth() + x2, PremiumPreviewFragment.this.backgroundView.tierListView.getHeight() + y2);
                if (PremiumPreviewFragment.this.progressToFull < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.listInterceptedTouch) && !PremiumPreviewFragment.this.listView.scrollingByUser)) {
                    motionEvent.offsetLocation(-x2, -y2);
                    if (motionEvent.getAction() == 0) {
                        this.listInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.listInterceptedTouch = false;
                    }
                    PremiumPreviewFragment.this.backgroundView.tierListView.dispatchTouchEvent(motionEvent);
                    if (this.listInterceptedTouch) {
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i2, int i3) {
                int i4 = 0;
                if (View.MeasureSpec.getSize(i2) > View.MeasureSpec.getSize(i3)) {
                    PremiumPreviewFragment.this.isLandscapeMode = true;
                } else {
                    PremiumPreviewFragment.this.isLandscapeMode = false;
                }
                PremiumPreviewFragment.this.statusBarHeight = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                PremiumPreviewFragment.this.backgroundView.measure(i2, View.MeasureSpec.makeMeasureSpec(0, 0));
                PremiumPreviewFragment.this.particlesView.getLayoutParams().height = PremiumPreviewFragment.this.backgroundView.getMeasuredHeight();
                if (PremiumPreviewFragment.this.buttonContainer != null) {
                    this.ignoreLayout = true;
                    PremiumPreviewFragment.this.buttonContainer.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.navigationBarHeight);
                    this.ignoreLayout = false;
                }
                if (PremiumPreviewFragment.this.buttonContainer != null && PremiumPreviewFragment.this.buttonContainer.getVisibility() != 8) {
                    i4 = AndroidUtilities.dp(68.0f);
                }
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.layoutManager.setAdditionalHeight((premiumPreviewFragment.statusBarHeight + i4) - AndroidUtilities.dp(16.0f));
                PremiumPreviewFragment.this.layoutManager.setMinimumLastViewHeight(i4);
                super.onMeasure(i2, i3);
                if (this.lastSize != ((getMeasuredHeight() + getMeasuredWidth()) << 16)) {
                    PremiumPreviewFragment.this.updateBackgroundImage();
                }
            }

            @Override // android.view.View, android.view.ViewParent
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientScaleX = PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredWidth() / getMeasuredWidth();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientScaleY = PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredHeight() / getMeasuredHeight();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartX = (PremiumPreviewFragment.this.backgroundView.getX() + PremiumPreviewFragment.this.backgroundView.imageView.getX()) / getMeasuredWidth();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartY = (PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.imageView.getY()) / getMeasuredHeight();
            }

            @Override // android.view.View
            protected void onSizeChanged(int i2, int i3, int i4, int i5) {
                super.onSizeChanged(i2, i3, i4, i5);
                PremiumPreviewFragment.this.measureGradient(i2, i3);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && PremiumPreviewFragment.this.scrollableViewNoiseSuppressor != null) {
                    PremiumPreviewFragment.this.blur3_InvalidateBlur();
                }
                if (!PremiumPreviewFragment.this.isDialogVisible) {
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.inc) {
                        float f = premiumPreviewFragment.progress + 0.016f;
                        premiumPreviewFragment.progress = f;
                        if (f > 3.0f) {
                            premiumPreviewFragment.inc = false;
                        }
                    } else {
                        float f2 = premiumPreviewFragment.progress - 0.016f;
                        premiumPreviewFragment.progress = f2;
                        if (f2 < 1.0f) {
                            premiumPreviewFragment.inc = true;
                        }
                    }
                }
                View findViewByPosition = PremiumPreviewFragment.this.listView.getLayoutManager() != null ? PremiumPreviewFragment.this.listView.getLayoutManager().findViewByPosition(0) : null;
                PremiumPreviewFragment.this.currentYOffset = findViewByPosition == null ? 0 : findViewByPosition.getBottom();
                int bottom = ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom() + AndroidUtilities.dp(16.0f);
                PremiumPreviewFragment.this.totalProgress = 1.0f - ((r5.currentYOffset - bottom) / (PremiumPreviewFragment.this.firstViewHeight - bottom));
                PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                premiumPreviewFragment2.totalProgress = Utilities.clamp(premiumPreviewFragment2.totalProgress, 1.0f, 0.0f);
                int bottom2 = ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom() + AndroidUtilities.dp(16.0f);
                if (PremiumPreviewFragment.this.currentYOffset < bottom2) {
                    PremiumPreviewFragment.this.currentYOffset = bottom2;
                }
                PremiumPreviewFragment premiumPreviewFragment3 = PremiumPreviewFragment.this;
                float f3 = premiumPreviewFragment3.progressToFull;
                premiumPreviewFragment3.progressToFull = 0.0f;
                if (premiumPreviewFragment3.currentYOffset < AndroidUtilities.dp(30.0f) + bottom2) {
                    PremiumPreviewFragment.this.progressToFull = ((bottom2 + AndroidUtilities.dp(30.0f)) - PremiumPreviewFragment.this.currentYOffset) / AndroidUtilities.dp(30.0f);
                }
                PremiumPreviewFragment premiumPreviewFragment4 = PremiumPreviewFragment.this;
                if (premiumPreviewFragment4.isLandscapeMode) {
                    premiumPreviewFragment4.progressToFull = 1.0f;
                    premiumPreviewFragment4.totalProgress = 1.0f;
                }
                if (f3 != premiumPreviewFragment4.progressToFull) {
                    premiumPreviewFragment4.listView.invalidate();
                }
                float max = Math.max((((((((BaseFragment) PremiumPreviewFragment.this).actionBar.getMeasuredHeight() - PremiumPreviewFragment.this.statusBarHeight) - PremiumPreviewFragment.this.backgroundView.titleView.getMeasuredHeight()) / 2.0f) + PremiumPreviewFragment.this.statusBarHeight) - PremiumPreviewFragment.this.backgroundView.getTop()) - PremiumPreviewFragment.this.backgroundView.titleView.getTop(), (PremiumPreviewFragment.this.currentYOffset - ((((BaseFragment) PremiumPreviewFragment.this).actionBar.getMeasuredHeight() + PremiumPreviewFragment.this.backgroundView.getMeasuredHeight()) - PremiumPreviewFragment.this.statusBarHeight)) + AndroidUtilities.dp(PremiumPreviewFragment.this.backgroundView.tierListView.getVisibility() == 0 ? 24.0f : 16.0f) + AndroidUtilities.dp(24.0f));
                float dp = ((-max) / 4.0f) + AndroidUtilities.dp(16.0f);
                PremiumPreviewFragment.this.backgroundView.setTranslationY(max);
                PremiumPreviewFragment.this.backgroundView.imageView.setTranslationY(dp + AndroidUtilities.dp(PremiumPreviewFragment.this.type == 1 ? 9.0f : 16.0f));
                PremiumPreviewFragment premiumPreviewFragment5 = PremiumPreviewFragment.this;
                float f4 = premiumPreviewFragment5.totalProgress;
                float f5 = ((1.0f - f4) * 0.4f) + 0.6f;
                float f6 = 1.0f - (f4 > 0.5f ? (f4 - 0.5f) / 0.5f : 0.0f);
                premiumPreviewFragment5.backgroundView.imageView.setScaleX(f5);
                PremiumPreviewFragment.this.backgroundView.imageView.setScaleY(f5);
                PremiumPreviewFragment.this.backgroundView.imageView.setAlpha(f6);
                PremiumPreviewFragment.this.backgroundView.subtitleView.setAlpha(f6);
                PremiumPreviewFragment.this.backgroundView.tierListView.setAlpha(f6);
                PremiumPreviewFragment premiumPreviewFragment6 = PremiumPreviewFragment.this;
                premiumPreviewFragment6.particlesView.setAlpha(1.0f - premiumPreviewFragment6.totalProgress);
                PremiumPreviewFragment.this.particlesView.setTranslationY(((-(r0.getMeasuredHeight() - PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredWidth())) / 2.0f) + PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getY());
                float dp2 = AndroidUtilities.dp(72.0f) - PremiumPreviewFragment.this.backgroundView.titleView.getLeft();
                PremiumPreviewFragment premiumPreviewFragment7 = PremiumPreviewFragment.this;
                float f7 = premiumPreviewFragment7.totalProgress;
                premiumPreviewFragment7.backgroundView.titleView.setTranslationX(dp2 * (1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - (f7 > 0.3f ? (f7 - 0.3f) / 0.7f : 0.0f))));
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartX = ((PremiumPreviewFragment.this.backgroundView.getX() + PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getX()) + ((getMeasuredWidth() * 0.1f) * PremiumPreviewFragment.this.progress)) / getMeasuredWidth();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartY = (PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.imageFrameLayout.getY()) / getMeasuredHeight();
                if (!PremiumPreviewFragment.this.isDialogVisible) {
                    invalidate();
                    PremiumPreviewFragment.this.buttonContainerInternal.invalidate();
                    PremiumPreviewFragment.this.buttonContainer.invalidate();
                }
                PremiumPreviewFragment.this.gradientTools.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), (-getMeasuredWidth()) * 0.1f * PremiumPreviewFragment.this.progress, 0.0f);
                if (PremiumPreviewFragment.this.whiteBackground) {
                    Paint paint = this.backgroundPaint;
                    PremiumPreviewFragment premiumPreviewFragment8 = PremiumPreviewFragment.this;
                    int i2 = Theme.key_windowBackgroundGray;
                    paint.setColor(premiumPreviewFragment8.getThemedColor(i2));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
                    PremiumPreviewFragment premiumPreviewFragment9 = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment9.progressToFull > 0.0f && ((BaseFragment) premiumPreviewFragment9).actionBar != null) {
                        this.backgroundPaint.setColor(ColorUtils.blendARGB(PremiumPreviewFragment.this.getThemedColor(i2), PremiumPreviewFragment.this.getThemedColor(Theme.key_windowBackgroundWhite), PremiumPreviewFragment.this.progressToFull));
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ((BaseFragment) PremiumPreviewFragment.this).actionBar.getHeight(), this.backgroundPaint);
                    }
                } else {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), PremiumPreviewFragment.this.gradientTools.paint);
                }
                super.dispatchDraw(canvas);
                if (PremiumPreviewFragment.this.buttonContainer.getVisibility() != 0) {
                    PremiumPreviewFragment.this.navbarProtectionDrawable.setFadeHeight(AndroidUtilities.navigationBarHeight, false);
                    PremiumPreviewFragment.this.navbarProtectionDrawable.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                    PremiumPreviewFragment.this.navbarProtectionDrawable.draw(canvas);
                }
                if (((BaseFragment) PremiumPreviewFragment.this).parentLayout == null || !PremiumPreviewFragment.this.whiteBackground) {
                    return;
                }
                INavigationLayout iNavigationLayout = ((BaseFragment) PremiumPreviewFragment.this).parentLayout;
                PremiumPreviewFragment premiumPreviewFragment10 = PremiumPreviewFragment.this;
                iNavigationLayout.drawHeaderShadow(canvas, (int) (premiumPreviewFragment10.progressToFull * 255.0f), ((BaseFragment) premiumPreviewFragment10).actionBar.getBottom());
            }
        };
        this.iBlur3Factory.setSourceRootView(new ViewPositionWatcher(this.contentView), this.contentView);
        this.iBlur3FactoryBg.setSourceRootView(new ViewPositionWatcher(this.contentView), this.contentView);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setClipToOutline(true);
        this.listView.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.PremiumPreviewFragment.3
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), view.getMeasuredHeight() + AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
        });
        this.listView.addEdgeEffectListener(new Runnable() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                PremiumPreviewFragment.this.lambda$createView$1();
            }
        });
        this.listView.setCaptureSectionsDecoratorAllowed(true);
        this.listView.setSections(true);
        this.listView.setClipToPadding(false);
        this.listView.setPadding(0, AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight(), 0, AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
        RecyclerListView recyclerListView2 = this.listView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, (AndroidUtilities.dp(68.0f) + this.statusBarHeight) - AndroidUtilities.dp(16.0f), this.listView);
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView2.setLayoutManager(fillLastLinearLayoutManager);
        this.layoutManager.setFixedLastItemHeight();
        this.listView.setAdapter(new Adapter());
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.PremiumPreviewFragment.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                super.onScrollStateChanged(recyclerView, i2);
                if (i2 == 0) {
                    int bottom = ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom() + AndroidUtilities.dp(16.0f);
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.totalProgress > 0.5f) {
                        premiumPreviewFragment.listView.smoothScrollBy(0, premiumPreviewFragment.currentYOffset - bottom);
                        return;
                    }
                    View findViewByPosition = premiumPreviewFragment.listView.getLayoutManager() != null ? PremiumPreviewFragment.this.listView.getLayoutManager().findViewByPosition(0) : null;
                    if (findViewByPosition == null || findViewByPosition.getTop() >= 0) {
                        return;
                    }
                    PremiumPreviewFragment.this.listView.smoothScrollBy(0, findViewByPosition.getTop());
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                super.onScrolled(recyclerView, i2, i3);
                PremiumPreviewFragment.this.contentView.invalidate();
                if (Build.VERSION.SDK_INT < 31 || PremiumPreviewFragment.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                PremiumPreviewFragment.this.scrollableViewNoiseSuppressor.onScrolled(i2, i3);
                PremiumPreviewFragment.this.blur3_InvalidateBlur();
            }
        });
        this.backgroundView = new BackgroundView(context);
        StarParticlesView starParticlesView = new StarParticlesView(context);
        this.particlesView = starParticlesView;
        starParticlesView.setClipWithGradient();
        if (this.type == 1) {
            if (this.whiteBackground) {
                StarParticlesView.Drawable drawable = this.particlesView.drawable;
                drawable.useGradient = true;
                drawable.useBlur = false;
                drawable.checkBounds = true;
                drawable.isCircle = true;
                drawable.centerOffsetY = AndroidUtilities.dp(-14.0f);
                StarParticlesView.Drawable drawable2 = this.particlesView.drawable;
                drawable2.minLifeTime = 2000L;
                drawable2.randLifeTime = 3000;
                drawable2.size1 = 16;
                drawable2.useRotate = false;
                drawable2.type = 28;
                drawable2.colorKey = i;
            } else {
                StarParticlesView.Drawable drawable3 = this.particlesView.drawable;
                drawable3.isCircle = true;
                drawable3.centerOffsetY = AndroidUtilities.dp(28.0f);
                StarParticlesView.Drawable drawable4 = this.particlesView.drawable;
                drawable4.minLifeTime = 2000L;
                drawable4.randLifeTime = 3000;
                drawable4.size1 = 16;
                drawable4.useRotate = false;
                drawable4.type = 28;
            }
        }
        this.backgroundView.imageView.setStarParticlesView(this.particlesView);
        this.contentView.addView(this.particlesView, LayoutHelper.createFrame(-1, -2.0f));
        this.contentView.addView(this.backgroundView, LayoutHelper.createFrame(-1, -2.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda6
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i2) {
                PremiumPreviewFragment.this.lambda$createView$5(view, i2);
            }
        });
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.buttonContainerInternal = new FrameLayout(context);
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, false, getResourceProvider());
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.setNonClickable();
        updateButtonText(false);
        this.buttonContainer = new FrameLayout(context);
        this.buttonContainerInternal.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.buttonContainerInternal.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = this.buttonContainerInternal;
        frameLayout.setBackground(this.iBlur3Factory.create(frameLayout).setColorProvider(BlurredBackgroundProviderImpl.premiumButton(this.resourceProvider)).setRadius(AndroidUtilities.dp(28.0f)).setPadding(AndroidUtilities.dp(8.0f)));
        ScaleStateListAnimator.apply(this.buttonContainerInternal, 0.02f, 1.5f);
        this.buttonContainer.addView(this.buttonContainerInternal, LayoutHelper.createFrame(-1, 72.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(this.iBlur3Factory.create(this.buttonContainer));
        blurredBackgroundWithFadeDrawable.setFadeHeight(AndroidUtilities.dp(40.0f), false);
        this.navbarProtectionDrawable = new BlurredBackgroundWithFadeDrawable(this.iBlur3Factory.create(this.contentView));
        this.buttonContainer.setBackground(blurredBackgroundWithFadeDrawable);
        if (getUserConfig().isClientActivated()) {
            this.contentView.addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 80));
        }
        this.fragmentView = this.contentView;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.PremiumPreviewFragment.5
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    PremiumPreviewFragment.this.finishFragment();
                }
            }
        });
        this.actionBar.setForceSkipTouches(true);
        this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        updateColors();
        updateRows();
        this.backgroundView.imageView.startEnterAnimation(-180, 200L);
        if (this.forcePremium) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    PremiumPreviewFragment.this.lambda$createView$6();
                }
            }, 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        sentShowScreenStat(this.source);
        return this.fragmentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$1() {
        this.listView.postOnAnimation(new Runnable() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                PremiumPreviewFragment.this.blur3_InvalidateBlur();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$5(View view, int i) {
        if (getUserConfig().isClientActivated()) {
            if (i == this.showAdsRow) {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                if (userFull == null) {
                    return;
                }
                TextCell textCell = (TextCell) view;
                textCell.setChecked(!textCell.isChecked());
                userFull.sponsored_enabled = textCell.isChecked();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = userFull.sponsored_enabled;
                getConnectionsManager().sendRequest(togglesponsoredmessages, new RequestDelegate() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda13
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        PremiumPreviewFragment.this.lambda$createView$3(tLObject, tL_error);
                    }
                });
                getMessagesStorage().updateUserInfo(userFull, false);
                return;
            }
            if (view instanceof PremiumFeatureCell) {
                final PremiumFeatureCell premiumFeatureCell = (PremiumFeatureCell) view;
                SubscriptionTier subscriptionTier = null;
                if (this.type == 1 && getUserConfig().isPremium()) {
                    int i2 = premiumFeatureCell.data.type;
                    if (i2 == 29) {
                        presentFragment(new org.telegram.ui.Business.LocationActivity());
                        return;
                    }
                    if (i2 == 32) {
                        presentFragment(new GreetMessagesActivity());
                        return;
                    }
                    if (i2 == 33) {
                        presentFragment(new AwayMessagesActivity());
                        return;
                    }
                    if (i2 == 30) {
                        presentFragment(new OpeningHoursActivity());
                        return;
                    }
                    if (i2 == 34) {
                        presentFragment(new ChatbotsActivity());
                        return;
                    }
                    if (i2 == 31) {
                        presentFragment(new QuickRepliesActivity());
                        return;
                    }
                    if (i2 == 14) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle.putInt("type", 1);
                        presentFragment(new MediaActivity(bundle, null));
                        return;
                    }
                    if (i2 == 12) {
                        showSelectStatusDialog(premiumFeatureCell, UserObject.getEmojiStatusDocumentId(getUserConfig().getCurrentUser()), new Utilities.Callback2() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda14
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                PremiumPreviewFragment.this.lambda$createView$4(premiumFeatureCell, (Long) obj, (Integer) obj2);
                            }
                        });
                        return;
                    }
                    if (i2 == 35) {
                        presentFragment(new FiltersSetupActivity().highlightTags());
                        return;
                    } else if (i2 == 36) {
                        presentFragment(new BusinessIntroActivity());
                        return;
                    } else {
                        if (i2 == 37) {
                            presentFragment(new BusinessLinksActivity());
                            return;
                        }
                        return;
                    }
                }
                sentShowFeaturePreview(this.currentAccount, premiumFeatureCell.data.type);
                int i3 = this.selectedTierIndex;
                if (i3 >= 0 && i3 < this.subscriptionTiers.size()) {
                    subscriptionTier = (SubscriptionTier) this.subscriptionTiers.get(this.selectedTierIndex);
                }
                showDialog(new PremiumFeatureBottomSheet(this, getContext(), this.currentAccount, this.type == 1, premiumFeatureCell.data.type, false, subscriptionTier));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                PremiumPreviewFragment.this.lambda$createView$2(tL_error, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$2(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            BulletinFactory.showError(tL_error);
        } else {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                return;
            }
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$4(PremiumFeatureCell premiumFeatureCell, Long l, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        if (l == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l.longValue();
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
            }
            emojiStatus = tL_emojiStatus;
        }
        getMessagesController().updateEmojiStatus(emojiStatus);
        premiumFeatureCell.setEmoji(l == null ? 0L : l.longValue(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$6() {
        getMediaDataController().loadPremiumPromo(false);
    }

    public static void buyPremium(BaseFragment baseFragment) {
        buyPremium(baseFragment, "settings");
    }

    public static void fillPremiumFeaturesList(ArrayList arrayList, int i, boolean z) {
        final MessagesController messagesController = MessagesController.getInstance(i);
        int i2 = 0;
        arrayList.add(new PremiumFeatureData(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new PremiumFeatureData(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new PremiumFeatureData(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new PremiumFeatureData(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new PremiumFeatureData(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new PremiumFeatureData(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new PremiumFeatureData(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new PremiumFeatureData(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new PremiumFeatureData(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new PremiumFeatureData(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new PremiumFeatureData(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new PremiumFeatureData(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new PremiumFeatureData(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new PremiumFeatureData(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        int i3 = R.drawable.msg_premium_icons;
        arrayList.add(new PremiumFeatureData(10, i3, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new PremiumFeatureData(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new PremiumFeatureData(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new PremiumFeatureData(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new PremiumFeatureData(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new PremiumFeatureData(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new PremiumFeatureData(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new PremiumFeatureData(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new PremiumFeatureData(39, i3, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new PremiumFeatureData(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new PremiumFeatureData(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i2 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((PremiumFeatureData) arrayList.get(i2)).type, -1) == -1 && !BuildVars.DEBUG_PRIVATE_VERSION) {
                    arrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda10
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$fillPremiumFeaturesList$7;
                lambda$fillPremiumFeaturesList$7 = PremiumPreviewFragment.lambda$fillPremiumFeaturesList$7(MessagesController.this, (PremiumPreviewFragment.PremiumFeatureData) obj, (PremiumPreviewFragment.PremiumFeatureData) obj2);
                return lambda$fillPremiumFeaturesList$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$fillPremiumFeaturesList$7(MessagesController messagesController, PremiumFeatureData premiumFeatureData, PremiumFeatureData premiumFeatureData2) {
        return messagesController.premiumFeaturesTypesToPosition.get(premiumFeatureData.type, ConnectionsManager.DEFAULT_DATACENTER_ID) - messagesController.premiumFeaturesTypesToPosition.get(premiumFeatureData2.type, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static void fillBusinessFeaturesList(ArrayList arrayList, int i, boolean z) {
        final MessagesController messagesController = MessagesController.getInstance(i);
        if (!z) {
            arrayList.add(new PremiumFeatureData(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new PremiumFeatureData(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new PremiumFeatureData(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new PremiumFeatureData(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new PremiumFeatureData(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new PremiumFeatureData(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new PremiumFeatureData(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new PremiumFeatureData(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        } else {
            arrayList.add(new PremiumFeatureData(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new PremiumFeatureData(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new PremiumFeatureData(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i2 = 0;
            while (i2 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((PremiumFeatureData) arrayList.get(i2)).type, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$fillBusinessFeaturesList$8;
                lambda$fillBusinessFeaturesList$8 = PremiumPreviewFragment.lambda$fillBusinessFeaturesList$8(MessagesController.this, (PremiumPreviewFragment.PremiumFeatureData) obj, (PremiumPreviewFragment.PremiumFeatureData) obj2);
                return lambda$fillBusinessFeaturesList$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$fillBusinessFeaturesList$8(MessagesController messagesController, PremiumFeatureData premiumFeatureData, PremiumFeatureData premiumFeatureData2) {
        return messagesController.businessFeaturesTypesToPosition.get(premiumFeatureData.type, ConnectionsManager.DEFAULT_DATACENTER_ID) - messagesController.businessFeaturesTypesToPosition.get(premiumFeatureData2.type, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public static CharSequence applyNewSpan(String str) {
        return applyNewSpan(str, -1);
    }

    public static CharSequence applyNewSpan(String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(false, i);
        newSpan.setColor(Theme.getColor(Theme.key_premiumGradient1));
        spannableStringBuilder.setSpan(newSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBackgroundImage() {
        BackgroundView backgroundView;
        if (this.contentView.getMeasuredWidth() == 0 || this.contentView.getMeasuredHeight() == 0 || (backgroundView = this.backgroundView) == null || backgroundView.imageView == null) {
            return;
        }
        if (this.whiteBackground) {
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(ColorUtils.blendARGB(getThemedColor(Theme.key_premiumGradient2), getThemedColor(Theme.key_dialogBackground), 0.5f));
            this.backgroundView.imageView.setBackgroundBitmap(createBitmap);
        } else {
            this.gradientTools.gradientMatrix(0, 0, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), 0.0f, 0.0f);
            this.gradientCanvas.save();
            this.gradientCanvas.scale(100.0f / this.contentView.getMeasuredWidth(), 100.0f / this.contentView.getMeasuredHeight());
            this.gradientCanvas.drawRect(0.0f, 0.0f, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), this.gradientTools.paint);
            this.gradientCanvas.restore();
            this.backgroundView.imageView.setBackgroundBitmap(this.gradientTextureBitmap);
        }
    }

    public static void buyPremium(BaseFragment baseFragment, String str) {
        buyPremium(baseFragment, null, str, true);
    }

    public static void buyPremium(BaseFragment baseFragment, SubscriptionTier subscriptionTier, String str) {
        buyPremium(baseFragment, subscriptionTier, str, true);
    }

    public static void buyPremium(BaseFragment baseFragment, SubscriptionTier subscriptionTier, String str, boolean z) {
        buyPremium(baseFragment, subscriptionTier, str, z, null);
    }

    public static void buyPremium(final BaseFragment baseFragment, SubscriptionTier subscriptionTier, String str, boolean z, final BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams) {
        final SubscriptionTier subscriptionTier2;
        final boolean z2;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (baseFragment == null) {
                new PremiumNotAvailableBottomSheet(baseFragment).show();
                return;
            } else {
                baseFragment.showDialog(new PremiumNotAvailableBottomSheet(baseFragment));
                return;
            }
        }
        final int currentAccount = baseFragment == null ? UserConfig.selectedAccount : baseFragment.getCurrentAccount();
        if (MessagesController.getInstance(currentAccount).isFrozen()) {
            AccountFrozenAlert.show(currentAccount);
            return;
        }
        if (subscriptionTier == null) {
            TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(currentAccount).getPremiumPromo();
            if (premiumPromo != null) {
                Iterator<TLRPC.TL_premiumSubscriptionOption> it = premiumPromo.period_options.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TLRPC.TL_premiumSubscriptionOption next = it.next();
                    int i = next.months;
                    if (i == 1) {
                        subscriptionTier = new SubscriptionTier(next);
                    } else if (i == 12) {
                        subscriptionTier = new SubscriptionTier(next);
                        break;
                    }
                }
            }
            subscriptionTier2 = subscriptionTier;
            z2 = true;
        } else {
            subscriptionTier2 = subscriptionTier;
            z2 = z;
        }
        sentPremiumButtonClick();
        if (BuildVars.useInvoiceBilling()) {
            Activity parentActivity = baseFragment != null ? baseFragment.getParentActivity() : LaunchActivity.instance;
            if (parentActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) parentActivity;
                if (subscriptionTier2 == null || (tL_premiumSubscriptionOption = subscriptionTier2.subscriptionOption) == null || (str2 = tL_premiumSubscriptionOption.bot_url) == null) {
                    MessagesController messagesController = MessagesController.getInstance(currentAccount);
                    if (!TextUtils.isEmpty(messagesController.premiumBotUsername)) {
                        launchActivity.setNavigateToPremiumBot(true);
                        launchActivity.onNewIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + messagesController.premiumBotUsername + "?start=" + str)), null);
                        return;
                    }
                    if (TextUtils.isEmpty(messagesController.premiumInvoiceSlug)) {
                        return;
                    }
                    launchActivity.onNewIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + messagesController.premiumInvoiceSlug)), null);
                    return;
                }
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.setNavigateToPremiumBot(true);
                }
                Browser.openUrl(launchActivity, subscriptionTier2.subscriptionOption.bot_url);
                return;
            }
            return;
        }
        ProductDetails productDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
        if (productDetails == null || productDetails.getSubscriptionOfferDetails().isEmpty()) {
            return;
        }
        if (subscriptionTier2.getGooglePlayProductDetails() == null) {
            subscriptionTier2.setGooglePlayProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS);
        }
        if (subscriptionTier2.getOfferDetails() == null) {
            return;
        }
        BillingController.getInstance().queryPurchases("subs", new PurchasesResponseListener() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda11
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                PremiumPreviewFragment.lambda$buyPremium$16(BaseFragment.this, z2, currentAccount, subscriptionUpdateParams, subscriptionTier2, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buyPremium$16(final BaseFragment baseFragment, final boolean z, final int i, final BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams, final SubscriptionTier subscriptionTier, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                PremiumPreviewFragment.lambda$buyPremium$15(BillingResult.this, baseFragment, z, list, i, subscriptionUpdateParams, subscriptionTier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buyPremium$15(BillingResult billingResult, final BaseFragment baseFragment, final boolean z, List list, final int i, final BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams, final SubscriptionTier subscriptionTier) {
        if (billingResult.getResponseCode() == 0) {
            final Runnable runnable = new Runnable() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    PremiumPreviewFragment.lambda$buyPremium$9(BaseFragment.this, z);
                }
            };
            if (list != null && !list.isEmpty() && !UserConfig.getInstance(i).isPremium()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    if (purchase.getProducts().contains(BillingController.PREMIUM_PRODUCT_ID)) {
                        final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                        tL_dataJSON.data = purchase.getOriginalJson();
                        TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                        tL_inputStorePaymentPremiumSubscription.restore = true;
                        if (subscriptionUpdateParams != null) {
                            tL_inputStorePaymentPremiumSubscription.upgrade = true;
                        }
                        tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                        ConnectionsManager.getInstance(i).sendRequest(tL_payments_assignPlayMarketTransaction, new RequestDelegate() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda21
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                PremiumPreviewFragment.lambda$buyPremium$11(i, runnable, baseFragment, tL_payments_assignPlayMarketTransaction, tLObject, tL_error);
                            }
                        }, 66);
                        return;
                    }
                }
            }
            BillingController.getInstance().addResultListener(BillingController.PREMIUM_PRODUCT_ID, new Consumer() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda22
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    PremiumPreviewFragment.lambda$buyPremium$12(runnable, (BillingResult) obj);
                }
            });
            final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
            final TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
            if (subscriptionUpdateParams != null) {
                tL_inputStorePaymentPremiumSubscription2.upgrade = true;
            }
            tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_canPurchaseStore, new RequestDelegate() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda23
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    PremiumPreviewFragment.lambda$buyPremium$14(BaseFragment.this, tL_inputStorePaymentPremiumSubscription2, subscriptionTier, subscriptionUpdateParams, i, tL_payments_canPurchaseStore, tLObject, tL_error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buyPremium$9(BaseFragment baseFragment, boolean z) {
        if (baseFragment instanceof PremiumPreviewFragment) {
            PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) baseFragment;
            if (z) {
                premiumPreviewFragment.setForcePremium();
            }
            premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
            premiumPreviewFragment.listView.smoothScrollToPosition(0);
        } else {
            PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(null);
            if (z) {
                premiumPreviewFragment2.setForcePremium();
            }
            if (baseFragment != null) {
                baseFragment.presentFragment(premiumPreviewFragment2);
            } else {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(premiumPreviewFragment2);
                }
            }
        }
        if (baseFragment == null || !(baseFragment.getParentActivity() instanceof LaunchActivity)) {
            return;
        }
        try {
            baseFragment.getFragmentView().performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ((LaunchActivity) baseFragment.getParentActivity()).getFireworksOverlay().start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buyPremium$11(final int i, Runnable runnable, final BaseFragment baseFragment, final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(runnable);
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    PremiumPreviewFragment.lambda$buyPremium$10(i, tL_error, baseFragment, tL_payments_assignPlayMarketTransaction);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buyPremium$10(int i, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        AlertsCreator.processError(i, tL_error, baseFragment, tL_payments_assignPlayMarketTransaction, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buyPremium$12(Runnable runnable, BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buyPremium$14(final BaseFragment baseFragment, final TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, final SubscriptionTier subscriptionTier, final BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams, final int i, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                PremiumPreviewFragment.lambda$buyPremium$13(TLObject.this, baseFragment, tL_inputStorePaymentPremiumSubscription, subscriptionTier, subscriptionUpdateParams, i, tL_error, tL_payments_canPurchaseStore);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buyPremium$13(TLObject tLObject, BaseFragment baseFragment, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, SubscriptionTier subscriptionTier, BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams, int i, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BillingController.getInstance().launchBillingFlow(baseFragment != null ? baseFragment.getParentActivity() : AndroidUtilities.getActivity(), baseFragment.getAccountInstance(), tL_inputStorePaymentPremiumSubscription, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS).setOfferToken(subscriptionTier.getOfferDetails().getOfferToken()).build()), subscriptionUpdateParams, false);
        } else {
            AlertsCreator.processError(i, tL_error, baseFragment, tL_payments_canPurchaseStore, new Object[0]);
        }
    }

    public static String getPremiumButtonText(int i, SubscriptionTier subscriptionTier) {
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i2 = R.string.SubscribeToPremium;
        if (subscriptionTier == null) {
            String str = null;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = null;
            str = null;
            str = null;
            if (BuildVars.useInvoiceBilling()) {
                TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i).getPremiumPromo();
                if (premiumPromo != null) {
                    Iterator<TLRPC.TL_premiumSubscriptionOption> it = premiumPromo.period_options.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        TLRPC.TL_premiumSubscriptionOption next = it.next();
                        int i3 = next.months;
                        if (i3 == 12) {
                            tL_premiumSubscriptionOption = next;
                            break;
                        }
                        if (tL_premiumSubscriptionOption == null && i3 == 1) {
                            tL_premiumSubscriptionOption = next;
                        }
                    }
                    if (tL_premiumSubscriptionOption == null) {
                        return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
                    }
                    if (tL_premiumSubscriptionOption.months == 12) {
                        if (MessagesController.getInstance(i).showAnnualPerMonth) {
                            formatCurrency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption.amount / 12, tL_premiumSubscriptionOption.currency);
                        } else {
                            i2 = R.string.SubscribeToPremiumPerYear;
                            formatCurrency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption.amount, tL_premiumSubscriptionOption.currency);
                        }
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption.amount, tL_premiumSubscriptionOption.currency);
                    }
                    return LocaleController.formatString(i2, formatCurrency);
                }
                return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
            }
            ProductDetails productDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (productDetails != null) {
                List subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
                if (!subscriptionOfferDetails.isEmpty()) {
                    Iterator it2 = ((ProductDetails.SubscriptionOfferDetails) subscriptionOfferDetails.get(0)).getPricingPhases().getPricingPhaseList().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) it2.next();
                        if (pricingPhase.getBillingPeriod().equals("P1M")) {
                            str = pricingPhase.getFormattedPrice();
                        } else if (pricingPhase.getBillingPeriod().equals("P1Y")) {
                            if (MessagesController.getInstance(i).showAnnualPerMonth) {
                                str = BillingController.getInstance().formatCurrency(pricingPhase.getPriceAmountMicros() / 12, pricingPhase.getPriceCurrencyCode(), 6);
                            } else {
                                i2 = R.string.SubscribeToPremiumPerYear;
                                str = BillingController.getInstance().formatCurrency(pricingPhase.getPriceAmountMicros(), pricingPhase.getPriceCurrencyCode(), 6);
                            }
                        }
                    }
                }
            }
            return str == null ? LocaleController.getString(R.string.Loading) : LocaleController.formatString(i2, str);
        }
        if (!BuildVars.useInvoiceBilling() && subscriptionTier.getOfferDetails() == null) {
            return LocaleController.getString(R.string.Loading);
        }
        boolean isPremium = UserConfig.getInstance(i).isPremium();
        boolean z = subscriptionTier.getMonths() > 12 && subscriptionTier.getMonths() % 12 == 0;
        boolean z2 = subscriptionTier.getMonths() == 12;
        String formattedPricePerYear = z2 ? subscriptionTier.getFormattedPricePerYear() : subscriptionTier.getFormattedPricePerMonth();
        if (isPremium) {
            i2 = z2 ? R.string.UpgradePremiumPerYear : R.string.UpgradePremiumPerMonth;
        } else if (z2) {
            if (MessagesController.getInstance(i).showAnnualPerMonth) {
                formattedPricePerYear = subscriptionTier.getFormattedPricePerMonth();
            } else {
                i2 = R.string.SubscribeToPremiumPerYear;
                formattedPricePerYear = subscriptionTier.getFormattedPrice();
            }
        } else if (z) {
            if (MessagesController.getInstance(i).showAnnualPerMonth) {
                formattedPricePerYear = subscriptionTier.getFormattedPricePerMonth();
            } else {
                return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, subscriptionTier.getFormattedPrice(), LocaleController.formatPluralString("Years", subscriptionTier.getMonths() / 12, new Object[0]));
            }
        } else {
            formattedPricePerYear = subscriptionTier.getFormattedPricePerMonth();
        }
        return LocaleController.formatString(i2, formattedPricePerYear);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void measureGradient(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.premiumFeatures.size(); i4++) {
            this.dummyCell.setData((PremiumFeatureData) this.premiumFeatures.get(i4), false);
            this.dummyCell.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
            ((PremiumFeatureData) this.premiumFeatures.get(i4)).yOffset = i3;
            i3 += this.dummyCell.getMeasuredHeight();
        }
        for (int i5 = 0; i5 < this.morePremiumFeatures.size(); i5++) {
            this.dummyCell.setData((PremiumFeatureData) this.morePremiumFeatures.get(i5), false);
            this.dummyCell.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
            ((PremiumFeatureData) this.morePremiumFeatures.get(i5)).yOffset = i3;
            i3 += this.dummyCell.getMeasuredHeight();
        }
        this.totalGradientHeight = i3;
    }

    private void updateRows() {
        SubscriptionTier subscriptionTier;
        this.sectionRow = -1;
        this.privacyRow = -1;
        this.moreHeaderRow = -1;
        this.moreFeaturesStartRow = -1;
        this.moreFeaturesEndRow = -1;
        this.showAdsHeaderRow = -1;
        this.showAdsRow = -1;
        this.showAdsInfoRow = -1;
        boolean z = true;
        this.rowCount = 1;
        this.paddingRow = 0;
        this.featuresStartRow = 1;
        int size = this.premiumFeatures.size() + 1;
        this.rowCount = size;
        this.featuresEndRow = size;
        if (this.type == 1 && getUserConfig().isPremium()) {
            int i = this.rowCount;
            int i2 = i + 1;
            this.sectionRow = i;
            int i3 = i + 2;
            this.rowCount = i3;
            this.moreHeaderRow = i2;
            this.moreFeaturesStartRow = i3;
            int size2 = i3 + this.morePremiumFeatures.size();
            this.rowCount = size2;
            this.moreFeaturesEndRow = size2;
        }
        int i4 = this.rowCount;
        this.statusRow = i4;
        this.rowCount = i4 + 2;
        this.lastPaddingRow = i4 + 1;
        if (this.type == 1 && getUserConfig().isPremium()) {
            int i5 = this.rowCount;
            this.showAdsHeaderRow = i5;
            this.showAdsRow = i5 + 1;
            this.rowCount = i5 + 3;
            this.showAdsInfoRow = i5 + 2;
        }
        FrameLayout frameLayout = this.buttonContainer;
        if (getUserConfig().isPremium() && ((subscriptionTier = this.currentSubscriptionTier) == null || subscriptionTier.getMonths() >= ((SubscriptionTier) this.subscriptionTiers.get(this.selectedTierIndex)).getMonths() || this.forcePremium)) {
            z = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z, 1.0f, false);
        int dp = this.buttonContainer.getVisibility() == 0 ? AndroidUtilities.dp(64.0f) : 0;
        this.layoutManager.setAdditionalHeight((this.statusBarHeight + dp) - AndroidUtilities.dp(16.0f));
        this.layoutManager.setMinimumLastViewHeight(dp);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        if (getMessagesController().premiumFeaturesBlocked()) {
            return false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.premiumPromoUpdated);
        if (getMediaDataController().getPremiumPromo() != null) {
            Iterator<TLRPC.Document> it = getMediaDataController().getPremiumPromo().videos.iterator();
            while (it.hasNext()) {
                FileLoader.getInstance(this.currentAccount).loadFile(it.next(), getMediaDataController().getPremiumPromo(), 3, 0);
            }
        }
        if (this.type == 1) {
            TimezonesController.getInstance(this.currentAccount).load();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.premiumPromoUpdated);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.billingProductDetailsUpdated || i == NotificationCenter.premiumPromoUpdated) {
            updateButtonText(false);
            this.backgroundView.updatePremiumTiers();
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged || i == NotificationCenter.premiumPromoUpdated) {
            this.backgroundView.updateText();
            this.backgroundView.updatePremiumTiers();
            updateRows();
            this.listView.getAdapter().notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class Adapter extends RecyclerListView.SelectionAdapter {
        private Adapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = viewGroup.getContext();
            switch (i) {
                case 1:
                    view = new PremiumFeatureCell(context) { // from class: org.telegram.ui.PremiumPreviewFragment.Adapter.2
                        @Override // org.telegram.ui.PremiumFeatureCell, android.view.ViewGroup, android.view.View
                        protected void dispatchDraw(Canvas canvas) {
                            float dp = AndroidUtilities.dp(10.0f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(this.imageView.getLeft(), this.imageView.getTop(), this.imageView.getRight(), this.imageView.getBottom());
                            PremiumPreviewFragment.this.matrix.reset();
                            PremiumPreviewFragment.this.matrix.postScale(1.0f, r2.totalGradientHeight / 100.0f, 0.0f, 0.0f);
                            PremiumPreviewFragment.this.matrix.postTranslate(0.0f, -this.data.yOffset);
                            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                            premiumPreviewFragment.shader.setLocalMatrix(premiumPreviewFragment.matrix);
                            canvas.drawRoundRect(rectF, dp, dp, PremiumPreviewFragment.this.gradientPaint);
                            if (((BaseFragment) PremiumPreviewFragment.this).resourceProvider != null ? ((BaseFragment) PremiumPreviewFragment.this).resourceProvider.isDark() : Theme.isCurrentThemeDark()) {
                                float dp2 = AndroidUtilities.dp(1.0f);
                                PremiumPreviewFragment.this.strokePaint.setStrokeWidth(dp2);
                                canvas.save();
                                canvas.translate(rectF.left, rectF.top);
                                rectF.offset(-rectF.left, -rectF.top);
                                float f = dp2 / 2.0f;
                                rectF.inset(f, f);
                                canvas.drawRoundRect(rectF, dp, dp, PremiumPreviewFragment.this.strokePaint);
                                canvas.restore();
                            }
                            super.dispatchDraw(canvas);
                        }
                    };
                    break;
                case 2:
                    view = new ShadowSectionCell(context, 12, 0);
                    break;
                case 3:
                default:
                    view = new View(context) { // from class: org.telegram.ui.PremiumPreviewFragment.Adapter.1
                        @Override // android.view.View
                        protected void onMeasure(int i2, int i3) {
                            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                            if (premiumPreviewFragment.isLandscapeMode) {
                                premiumPreviewFragment.firstViewHeight = 0;
                            } else {
                                int dp = AndroidUtilities.dp(64.0f);
                                if (PremiumPreviewFragment.this.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(8.0f) > dp) {
                                    dp = PremiumPreviewFragment.this.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                                }
                                PremiumPreviewFragment.this.firstViewHeight = dp;
                            }
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(PremiumPreviewFragment.this.firstViewHeight, TLObject.FLAG_30));
                        }
                    };
                    view.setTag(-33024);
                    break;
                case 4:
                    view = new AboutPremiumView(context);
                    break;
                case 5:
                    view = new TextInfoPrivacyCell(context);
                    break;
                case 6:
                    view = new View(context);
                    view.setTag(-33024);
                    break;
                case 7:
                    view = new HeaderCell(context);
                    break;
                case 8:
                    view = new TextCell(context, 23, false, true, ((BaseFragment) PremiumPreviewFragment.this).resourceProvider);
                    break;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x0312  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x031e A[SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.TL_help_premiumPromo premiumPromo;
            String str;
            int i2;
            final Adapter adapter = this;
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            int i3 = premiumPreviewFragment.featuresStartRow;
            int i4 = 0;
            boolean z = true;
            if (i >= i3 && i < premiumPreviewFragment.featuresEndRow) {
                ((PremiumFeatureCell) viewHolder.itemView).setData((PremiumFeatureData) premiumPreviewFragment.premiumFeatures.get(i - i3), i != PremiumPreviewFragment.this.featuresEndRow - 1);
                return;
            }
            int i5 = premiumPreviewFragment.moreFeaturesStartRow;
            if (i >= i5 && i < premiumPreviewFragment.moreFeaturesEndRow) {
                ((PremiumFeatureCell) viewHolder.itemView).setData((PremiumFeatureData) premiumPreviewFragment.morePremiumFeatures.get(i - i5), i != PremiumPreviewFragment.this.moreFeaturesEndRow - 1);
                return;
            }
            if (i == premiumPreviewFragment.sectionRow) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setText("");
                textInfoPrivacyCell.setFixedSize(12);
                return;
            }
            if (i == premiumPreviewFragment.statusRow || i == premiumPreviewFragment.privacyRow || i == premiumPreviewFragment.showAdsInfoRow) {
                TextInfoPrivacyCell textInfoPrivacyCell2 = (TextInfoPrivacyCell) viewHolder.itemView;
                if (!premiumPreviewFragment.whiteBackground) {
                    textInfoPrivacyCell2.setTextColor(Theme.multAlpha(-1, 0.75f));
                    textInfoPrivacyCell2.getTextView().setLinkTextColor(-1);
                    textInfoPrivacyCell2.setLinkTextRippleColor(Integer.valueOf(Theme.multAlpha(-1, 0.15f)));
                }
                textInfoPrivacyCell2.setFixedSize(0);
                PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                if (i == premiumPreviewFragment2.showAdsInfoRow) {
                    textInfoPrivacyCell2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new Runnable() { // from class: org.telegram.ui.PremiumPreviewFragment$Adapter$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            PremiumPreviewFragment.Adapter.this.lambda$onBindViewHolder$0();
                        }
                    }), true));
                    return;
                }
                if (i == premiumPreviewFragment2.statusRow && premiumPreviewFragment2.type == 1) {
                    textInfoPrivacyCell2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
                    return;
                }
                PremiumPreviewFragment premiumPreviewFragment3 = PremiumPreviewFragment.this;
                if (i != premiumPreviewFragment3.statusRow || (premiumPromo = premiumPreviewFragment3.getMediaDataController().getPremiumPromo()) == null) {
                    return;
                }
                SpannableString spannableString = new SpannableString(premiumPromo.status_text);
                MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
                TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spannableString.getSpans(0, spannableString.length(), TextStyleSpan.class);
                int length = textStyleSpanArr.length;
                while (i4 < length) {
                    TextStyleSpan.TextStyleRun textStyleRun = textStyleSpanArr[i4].getTextStyleRun();
                    TLRPC.MessageEntity messageEntity = textStyleRun.urlEntity;
                    if (messageEntity != null) {
                        String str2 = premiumPromo.status_text;
                        int i6 = messageEntity.offset;
                        str = TextUtils.substring(str2, i6, messageEntity.length + i6);
                    } else {
                        str = null;
                    }
                    TLRPC.MessageEntity messageEntity2 = textStyleRun.urlEntity;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                        spannableString.setSpan(new URLSpanBotCommand(str, 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                    } else {
                        if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                            i2 = 33;
                            spannableString.setSpan(new URLSpanNoUnderline(str, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                            spannableString.setSpan(new URLSpanReplacement("mailto:" + str, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                            if (!str.toLowerCase().contains("://")) {
                                spannableString.setSpan(new URLSpanBrowser("http://" + str, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                            } else {
                                spannableString.setSpan(new URLSpanBrowser(str, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                            }
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                            spannableString.setSpan(new URLSpanNoUnderline("card:" + str, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                            String stripExceptNumbers = PhoneFormat.stripExceptNumbers(str);
                            if (str.startsWith("+")) {
                                stripExceptNumbers = "+" + stripExceptNumbers;
                            }
                            spannableString.setSpan(new URLSpanBrowser("tel:" + stripExceptNumbers, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                            URLSpanReplacement uRLSpanReplacement = new URLSpanReplacement(textStyleRun.urlEntity.url, textStyleRun);
                            uRLSpanReplacement.setNavigateToPremiumBot(z);
                            spannableString.setSpan(uRLSpanReplacement, textStyleRun.start, textStyleRun.end, 33);
                            if (!PremiumPreviewFragment.this.whiteBackground) {
                                spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), textStyleRun.start, textStyleRun.end, 33);
                            }
                        } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                            spannableString.setSpan(new URLSpanUserMention("" + ((TLRPC.TL_messageEntityMentionName) textStyleRun.urlEntity).user_id, 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                        } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            spannableString.setSpan(new URLSpanUserMention("" + ((TLRPC.TL_inputMessageEntityMentionName) textStyleRun.urlEntity).user_id.user_id, 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                        } else if ((textStyleRun.flags & 4) != 0) {
                            i2 = 33;
                            spannableString.setSpan(new URLSpanMono(spannableString, textStyleRun.start, textStyleRun.end, (byte) 0, textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                        } else {
                            spannableString.setSpan(new TextStyleSpan(textStyleRun), textStyleRun.start, textStyleRun.end, 33);
                            i4++;
                            z = true;
                            adapter = this;
                        }
                        if ((textStyleRun.flags & 256) == 0) {
                            spannableString.setSpan(new TextStyleSpan(textStyleRun), textStyleRun.start, textStyleRun.end, i2);
                        }
                        i4++;
                        z = true;
                        adapter = this;
                    }
                    i2 = 33;
                    if ((textStyleRun.flags & 256) == 0) {
                    }
                    i4++;
                    z = true;
                    adapter = this;
                }
                textInfoPrivacyCell2.setText(spannableString);
                return;
            }
            if (i == premiumPreviewFragment.moreHeaderRow) {
                ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                return;
            }
            if (i == premiumPreviewFragment.showAdsHeaderRow) {
                ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.ShowAdsTitle));
                return;
            }
            if (i == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(PremiumPreviewFragment.this.getUserConfig().getClientUserId());
                TextCell textCell = (TextCell) viewHolder.itemView;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    z = false;
                }
                textCell.setTextAndCheck(string, z, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0() {
            PremiumPreviewFragment.this.showDialog(new RevenueSharingAdsInfoBottomSheet(PremiumPreviewFragment.this.getContext(), false, PremiumPreviewFragment.this.getResourceProvider(), null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return PremiumPreviewFragment.this.rowCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            if (i == premiumPreviewFragment.paddingRow) {
                return 0;
            }
            if (i >= premiumPreviewFragment.featuresStartRow && i < premiumPreviewFragment.featuresEndRow) {
                return 1;
            }
            if (i >= premiumPreviewFragment.moreFeaturesStartRow && i < premiumPreviewFragment.moreFeaturesEndRow) {
                return 1;
            }
            if (i == premiumPreviewFragment.helpUsRow) {
                return 4;
            }
            if (i == premiumPreviewFragment.sectionRow || i == premiumPreviewFragment.statusRow || i == premiumPreviewFragment.privacyRow || i == premiumPreviewFragment.showAdsInfoRow) {
                return 5;
            }
            if (i == premiumPreviewFragment.lastPaddingRow) {
                return 6;
            }
            if (i == premiumPreviewFragment.moreHeaderRow || i == premiumPreviewFragment.showAdsHeaderRow) {
                return 7;
            }
            return i == premiumPreviewFragment.showAdsRow ? 8 : 0;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 8;
        }
    }

    public static class PremiumFeatureData {
        public final String description;
        public final int icon;
        public final CharSequence title;
        public final int type;
        public int yOffset;

        public PremiumFeatureData(int i, int i2, CharSequence charSequence, String str) {
            this.type = i;
            this.icon = i2;
            this.title = charSequence;
            this.description = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class BackgroundView extends LinearLayout {
        private final FrameLayout imageFrameLayout;
        private final GLIconTextureView imageView;
        private boolean setTierListViewVisibility;
        private final TextView subtitleView;
        private RecyclerListView tierListView;
        private boolean tierListViewVisible;
        TextView titleView;

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        public BackgroundView(final Context context) {
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            this.imageFrameLayout = frameLayout;
            int i = PremiumPreviewFragment.this.type == 1 ? NotificationCenter.groupCallVisibilityChanged : NotificationCenter.boostedChannelByUser;
            addView(frameLayout, LayoutHelper.createLinear(i, i, 1));
            GLIconTextureView gLIconTextureView = new GLIconTextureView(context, PremiumPreviewFragment.this.whiteBackground ? 1 : 0, PremiumPreviewFragment.this.type == 1 ? 1 : 0) { // from class: org.telegram.ui.PremiumPreviewFragment.BackgroundView.1
                @Override // org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView
                public void onLongPress() {
                    super.onLongPress();
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.settingsView == null && BuildVars.DEBUG_PRIVATE_VERSION) {
                        premiumPreviewFragment.settingsView = new FrameLayout(context);
                        ScrollView scrollView = new ScrollView(context);
                        scrollView.addView(new GLIconSettingsView(context, BackgroundView.this.imageView.mRenderer));
                        PremiumPreviewFragment.this.settingsView.addView(scrollView);
                        PremiumPreviewFragment.this.settingsView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground));
                        PremiumPreviewFragment.this.contentView.addView(PremiumPreviewFragment.this.settingsView, LayoutHelper.createFrame(-1, -1, 80));
                        ((ViewGroup.MarginLayoutParams) PremiumPreviewFragment.this.settingsView.getLayoutParams()).topMargin = PremiumPreviewFragment.this.currentYOffset;
                        PremiumPreviewFragment.this.settingsView.setTranslationY(AndroidUtilities.dp(1000.0f));
                        PremiumPreviewFragment.this.settingsView.animate().translationY(1.0f).setDuration(300L);
                    }
                }
            };
            this.imageView = gLIconTextureView;
            frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(-1, -1.0f));
            frameLayout.setClipChildren(false);
            setClipChildren(false);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 22.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setGravity(1);
            addView(this.titleView, LayoutHelper.createLinear(-2, -2, 0.0f, 1, 16, PremiumPreviewFragment.this.type == 1 ? 8 : 20, 16, 0));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setGravity(1);
            addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 1, 16, 7, 16, 0));
            RecyclerListView recyclerListView = new RecyclerListView(context) { // from class: org.telegram.ui.PremiumPreviewFragment.BackgroundView.2
                Paint paint;
                private Path path;

                {
                    Paint paint = new Paint(1);
                    this.paint = paint;
                    paint.setColor(Theme.getColor(Theme.key_dialogBackground));
                    this.path = new Path();
                }

                @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
                public void dispatchDraw(Canvas canvas) {
                    this.path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    this.path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                    canvas.drawPath(this.path, this.paint);
                    canvas.save();
                    canvas.clipPath(this.path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }

                @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
                protected void onSizeChanged(int i2, int i3, int i4, int i5) {
                    super.onSizeChanged(i2, i3, i4, i5);
                    BackgroundView.this.measureGradient(i2, i3);
                }

                @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (PremiumPreviewFragment.this.progressToFull >= 1.0f) {
                        return false;
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (PremiumPreviewFragment.this.progressToFull >= 1.0f) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            this.tierListView = recyclerListView;
            recyclerListView.setOverScrollMode(2);
            this.tierListView.setLayoutManager(new LinearLayoutManager(context));
            this.tierListView.setAdapter(new 3(PremiumPreviewFragment.this, context));
            this.tierListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.PremiumPreviewFragment$BackgroundView$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                public final void onItemClick(View view, int i2) {
                    PremiumPreviewFragment.BackgroundView.this.lambda$new$0(view, i2);
                }
            });
            final Path path = new Path();
            final float[] fArr = new float[8];
            this.tierListView.setSelectorTransformer(new Consumer() { // from class: org.telegram.ui.PremiumPreviewFragment$BackgroundView$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    PremiumPreviewFragment.BackgroundView.this.lambda$new$1(path, fArr, (Canvas) obj);
                }
            });
            setClipChildren(false);
            setClipToPadding(false);
            addView(this.tierListView, LayoutHelper.createLinear(-1, -2, 12.0f, 16.0f, 12.0f, 4.0f));
            updatePremiumTiers();
            updateText();
        }

        class 3 extends RecyclerListView.SelectionAdapter {
            final /* synthetic */ Context val$context;
            final /* synthetic */ PremiumPreviewFragment val$this$0;

            3(PremiumPreviewFragment premiumPreviewFragment, Context context) {
                this.val$this$0 = premiumPreviewFragment;
                this.val$context = context;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                final PremiumTierCell premiumTierCell = new PremiumTierCell(this.val$context) { // from class: org.telegram.ui.PremiumPreviewFragment.BackgroundView.3.1
                    @Override // org.telegram.ui.Components.Premium.PremiumTierCell, android.view.ViewGroup, android.view.View
                    protected void dispatchDraw(Canvas canvas) {
                        if (this.discountView.getVisibility() == 0) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(this.discountView.getLeft(), this.discountView.getTop(), this.discountView.getRight(), this.discountView.getBottom());
                            PremiumPreviewFragment.this.tiersGradientTools.gradientMatrix(0, 0, getMeasuredWidth(), PremiumPreviewFragment.this.totalTiersGradientHeight, 0.0f, -this.tier.yOffset);
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), PremiumPreviewFragment.this.tiersGradientTools.paint);
                        }
                        super.dispatchDraw(canvas);
                    }
                };
                premiumTierCell.setCirclePaintProvider(new GenericProvider() { // from class: org.telegram.ui.PremiumPreviewFragment$BackgroundView$3$$ExternalSyntheticLambda0
                    @Override // org.telegram.messenger.GenericProvider
                    public final Object provide(Object obj) {
                        Paint lambda$onCreateViewHolder$0;
                        lambda$onCreateViewHolder$0 = PremiumPreviewFragment.BackgroundView.3.this.lambda$onCreateViewHolder$0(premiumTierCell, (Void) obj);
                        return lambda$onCreateViewHolder$0;
                    }
                });
                return new RecyclerListView.Holder(premiumTierCell);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ Paint lambda$onCreateViewHolder$0(PremiumTierCell premiumTierCell, Void r9) {
                PremiumPreviewFragment.this.tiersGradientTools.gradientMatrix(0, 0, premiumTierCell.getMeasuredWidth(), PremiumPreviewFragment.this.totalTiersGradientHeight, 0.0f, -premiumTierCell.getTier().yOffset);
                return PremiumPreviewFragment.this.tiersGradientTools.paint;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                PremiumTierCell premiumTierCell = (PremiumTierCell) viewHolder.itemView;
                premiumTierCell.bind((SubscriptionTier) PremiumPreviewFragment.this.subscriptionTiers.get(i), i != getItemCount() - 1);
                premiumTierCell.setChecked(PremiumPreviewFragment.this.selectedTierIndex == i, false);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return !((SubscriptionTier) PremiumPreviewFragment.this.subscriptionTiers.get(viewHolder.getAdapterPosition())).subscriptionOption.current;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return PremiumPreviewFragment.this.subscriptionTiers.size();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00ed, code lost:
        
            if (r5.this$0.forcePremium == false) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$new$0(View view, int i) {
            if (view.isEnabled() && (view instanceof PremiumTierCell)) {
                PremiumTierCell premiumTierCell = (PremiumTierCell) view;
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.selectedTierIndex = premiumPreviewFragment.subscriptionTiers.indexOf(premiumTierCell.getTier());
                boolean z = true;
                PremiumPreviewFragment.this.updateButtonText(true);
                premiumTierCell.setChecked(true, true);
                for (int i2 = 0; i2 < this.tierListView.getChildCount(); i2++) {
                    View childAt = this.tierListView.getChildAt(i2);
                    if (childAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell2 = (PremiumTierCell) childAt;
                        if (premiumTierCell2.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell2.setChecked(false, true);
                        }
                    }
                }
                for (int i3 = 0; i3 < this.tierListView.getHiddenChildCount(); i3++) {
                    View hiddenChildAt = this.tierListView.getHiddenChildAt(i3);
                    if (hiddenChildAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell3 = (PremiumTierCell) hiddenChildAt;
                        if (premiumTierCell3.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell3.setChecked(false, true);
                        }
                    }
                }
                for (int i4 = 0; i4 < this.tierListView.getCachedChildCount(); i4++) {
                    View cachedChildAt = this.tierListView.getCachedChildAt(i4);
                    if (cachedChildAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell4 = (PremiumTierCell) cachedChildAt;
                        if (premiumTierCell4.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell4.setChecked(false, true);
                        }
                    }
                }
                for (int i5 = 0; i5 < this.tierListView.getAttachedScrapChildCount(); i5++) {
                    View attachedScrapChildAt = this.tierListView.getAttachedScrapChildAt(i5);
                    if (attachedScrapChildAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell5 = (PremiumTierCell) attachedScrapChildAt;
                        if (premiumTierCell5.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell5.setChecked(false, true);
                        }
                    }
                }
                FrameLayout frameLayout = PremiumPreviewFragment.this.buttonContainer;
                if (PremiumPreviewFragment.this.getUserConfig().isPremium()) {
                    SubscriptionTier subscriptionTier = PremiumPreviewFragment.this.currentSubscriptionTier;
                    if (subscriptionTier != null) {
                        int months = subscriptionTier.getMonths();
                        PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                        if (months < ((SubscriptionTier) premiumPreviewFragment2.subscriptionTiers.get(premiumPreviewFragment2.selectedTierIndex)).getMonths()) {
                        }
                    }
                    z = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(Path path, float[] fArr, Canvas canvas) {
            View pressedChildView = this.tierListView.getPressedChildView();
            int adapterPosition = pressedChildView == null ? -1 : this.tierListView.getChildViewHolder(pressedChildView).getAdapterPosition();
            path.rewind();
            Rect selectorRect = this.tierListView.getSelectorRect();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
            Arrays.fill(fArr, 0.0f);
            if (adapterPosition == 0) {
                Arrays.fill(fArr, 0, 4, AndroidUtilities.dp(12.0f));
            }
            if (adapterPosition == this.tierListView.getAdapter().getItemCount() - 1) {
                Arrays.fill(fArr, 4, 8, AndroidUtilities.dp(12.0f));
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void measureGradient(int i, int i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < PremiumPreviewFragment.this.subscriptionTiers.size(); i4++) {
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.dummyTierCell.bind((SubscriptionTier) premiumPreviewFragment.subscriptionTiers.get(i4), false);
                PremiumPreviewFragment.this.dummyTierCell.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
                ((SubscriptionTier) PremiumPreviewFragment.this.subscriptionTiers.get(i4)).yOffset = i3;
                i3 += PremiumPreviewFragment.this.dummyTierCell.getMeasuredHeight();
            }
            PremiumPreviewFragment.this.totalTiersGradientHeight = i3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:109:0x00db, code lost:
        
            if (j$.util.Objects.equals(r0, (r9 == null || (r9 = r9.transaction) == null) ? null : r9.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1")) != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x00e9, code lost:
        
            r13.this$0.subscriptionTiers.clear();
            r13.this$0.currentSubscriptionTier = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x00e7, code lost:
        
            if (r0.getMonths() == 12) goto L49;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void updatePremiumTiers() {
            long j;
            PremiumPreviewFragment.this.subscriptionTiers.clear();
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            premiumPreviewFragment.selectedTierIndex = -1;
            premiumPreviewFragment.currentSubscriptionTier = null;
            long j2 = 0;
            if (premiumPreviewFragment.getMediaDataController().getPremiumPromo() != null) {
                Iterator<TLRPC.TL_premiumSubscriptionOption> it = PremiumPreviewFragment.this.getMediaDataController().getPremiumPromo().period_options.iterator();
                j = 0;
                while (it.hasNext()) {
                    TLRPC.TL_premiumSubscriptionOption next = it.next();
                    if (!PremiumPreviewFragment.this.getUserConfig().isPremium() || next.can_purchase_upgrade || next.current) {
                        SubscriptionTier subscriptionTier = new SubscriptionTier(next);
                        PremiumPreviewFragment.this.subscriptionTiers.add(subscriptionTier);
                        if (PremiumPreviewFragment.this.selectAnnualByDefault && next.months == 12) {
                            PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                            premiumPreviewFragment2.selectedTierIndex = premiumPreviewFragment2.subscriptionTiers.size() - 1;
                        }
                        if (next.current) {
                            PremiumPreviewFragment.this.currentSubscriptionTier = subscriptionTier;
                        }
                        if (BuildVars.useInvoiceBilling() && subscriptionTier.getPricePerYear() > j) {
                            j = subscriptionTier.getPricePerYear();
                        }
                    }
                }
            } else {
                j = 0;
            }
            if (BuildVars.useInvoiceBilling() && PremiumPreviewFragment.this.getUserConfig().isPremium()) {
                PremiumPreviewFragment.this.subscriptionTiers.clear();
                PremiumPreviewFragment.this.currentSubscriptionTier = null;
            } else {
                if (!BuildVars.useInvoiceBilling() && PremiumPreviewFragment.this.currentSubscriptionTier != null) {
                    String lastPremiumTransaction = BillingController.getInstance().getLastPremiumTransaction();
                    TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = PremiumPreviewFragment.this.currentSubscriptionTier.subscriptionOption;
                }
                SubscriptionTier subscriptionTier2 = PremiumPreviewFragment.this.currentSubscriptionTier;
                if (subscriptionTier2 != null) {
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                Iterator it2 = PremiumPreviewFragment.this.subscriptionTiers.iterator();
                while (it2.hasNext()) {
                    ((SubscriptionTier) it2.next()).setPricePerYearRegular(j);
                }
            } else if (BillingController.getInstance().isReady() && BillingController.PREMIUM_PRODUCT_DETAILS != null) {
                Iterator it3 = PremiumPreviewFragment.this.subscriptionTiers.iterator();
                boolean z = false;
                while (it3.hasNext()) {
                    SubscriptionTier subscriptionTier3 = (SubscriptionTier) it3.next();
                    subscriptionTier3.setGooglePlayProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS);
                    if (subscriptionTier3.getPricePerYear() > j2) {
                        j2 = subscriptionTier3.getPricePerYear();
                    }
                    if (subscriptionTier3.getOfferDetails() != null) {
                        z = true;
                    }
                }
                if (z) {
                    int i = 0;
                    while (i < PremiumPreviewFragment.this.subscriptionTiers.size()) {
                        if (((SubscriptionTier) PremiumPreviewFragment.this.subscriptionTiers.get(i)).getOfferDetails() == null) {
                            PremiumPreviewFragment.this.subscriptionTiers.remove(i);
                            i--;
                        }
                        i++;
                    }
                }
                Iterator it4 = PremiumPreviewFragment.this.subscriptionTiers.iterator();
                while (it4.hasNext()) {
                    ((SubscriptionTier) it4.next()).setPricePerYearRegular(j2);
                }
            }
            if (PremiumPreviewFragment.this.selectedTierIndex == -1) {
                int i2 = 0;
                while (true) {
                    if (i2 >= PremiumPreviewFragment.this.subscriptionTiers.size()) {
                        break;
                    }
                    if (((SubscriptionTier) PremiumPreviewFragment.this.subscriptionTiers.get(i2)).getMonths() == 12) {
                        PremiumPreviewFragment.this.selectedTierIndex = i2;
                        break;
                    }
                    i2++;
                }
                PremiumPreviewFragment premiumPreviewFragment3 = PremiumPreviewFragment.this;
                if (premiumPreviewFragment3.selectedTierIndex == -1) {
                    premiumPreviewFragment3.selectedTierIndex = 0;
                }
            }
            PremiumPreviewFragment.this.updateButtonText(false);
            this.tierListView.getAdapter().notifyDataSetChanged();
        }

        public void updateText() {
            if (PremiumPreviewFragment.this.type != 0) {
                if (PremiumPreviewFragment.this.type == 1) {
                    this.titleView.setText(LocaleController.getString(PremiumPreviewFragment.this.forcePremium ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramBusiness));
                    this.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.getString((PremiumPreviewFragment.this.getUserConfig().isPremium() || PremiumPreviewFragment.this.forcePremium) ? R.string.TelegramBusinessSubscribedSubtitleTemp : R.string.TelegramBusinessSubtitleTemp)));
                }
            } else {
                this.titleView.setText(LocaleController.getString(PremiumPreviewFragment.this.forcePremium ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramPremium));
                this.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.getString((PremiumPreviewFragment.this.getUserConfig().isPremium() || PremiumPreviewFragment.this.forcePremium) ? R.string.TelegramPremiumSubscribedSubtitle : R.string.TelegramPremiumSubtitle)));
            }
            this.subtitleView.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), HintView2.cutInFancyHalf(this.subtitleView.getText(), this.subtitleView.getPaint()));
            boolean z = PremiumPreviewFragment.this.forcePremium || BuildVars.IS_BILLING_UNAVAILABLE || PremiumPreviewFragment.this.subscriptionTiers.size() <= 1;
            if (!this.setTierListViewVisibility || !z) {
                this.tierListView.setVisibility(z ? 8 : 0);
                this.setTierListViewVisibility = true;
            } else if (this.tierListView.getVisibility() == 0 && z && this.tierListViewVisible == z) {
                final RecyclerListView recyclerListView = this.tierListView;
                final ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.PremiumPreviewFragment$BackgroundView$$ExternalSyntheticLambda2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PremiumPreviewFragment.BackgroundView.this.lambda$updateText$2(recyclerListView, duration, valueAnimator);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.PremiumPreviewFragment.BackgroundView.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        recyclerListView.setVisibility(8);
                        for (int i = 0; i < PremiumPreviewFragment.this.backgroundView.getChildCount(); i++) {
                            View childAt = PremiumPreviewFragment.this.backgroundView.getChildAt(i);
                            if (childAt != BackgroundView.this.tierListView) {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    }
                });
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                duration.start();
            }
            this.tierListViewVisible = !z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updateText$2(View view, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
            float dp;
            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
            view.setAlpha(floatValue);
            view.setScaleX(floatValue);
            view.setScaleY(floatValue);
            float animatedFraction = valueAnimator.getAnimatedFraction();
            for (int i = 0; i < PremiumPreviewFragment.this.backgroundView.getChildCount(); i++) {
                View childAt = PremiumPreviewFragment.this.backgroundView.getChildAt(i);
                if (childAt != this.tierListView) {
                    if (childAt == this.imageFrameLayout) {
                        dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                    } else {
                        dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                    }
                    childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateButtonText(boolean z) {
        if (this.premiumButtonView == null) {
            return;
        }
        if (!getUserConfig().isPremium() || this.currentSubscriptionTier == null || this.selectedTierIndex >= this.subscriptionTiers.size() || ((SubscriptionTier) this.subscriptionTiers.get(this.selectedTierIndex)).getMonths() >= this.currentSubscriptionTier.getMonths()) {
            if (LocaleController.isRTL) {
                z = false;
            }
            if (BuildVars.IS_BILLING_UNAVAILABLE && this.selectedTierIndex < this.subscriptionTiers.size()) {
                this.premiumButtonView.setButton(getPremiumButtonText(this.currentAccount, (SubscriptionTier) this.subscriptionTiers.get(this.selectedTierIndex)), null, z);
                this.buttonContainerInternal.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PremiumPreviewFragment.this.lambda$updateButtonText$17(view);
                    }
                });
                return;
            }
            if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || this.subscriptionTiers.isEmpty() || this.selectedTierIndex >= this.subscriptionTiers.size() || ((SubscriptionTier) this.subscriptionTiers.get(this.selectedTierIndex)).googlePlayProductDetails == null)) {
                this.premiumButtonView.setButton(LocaleController.getString(R.string.Loading), null, z);
                this.buttonContainerInternal.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PremiumPreviewFragment.lambda$updateButtonText$18(view);
                    }
                });
                this.premiumButtonView.setFlickerDisabled(true);
            } else {
                if (this.subscriptionTiers.isEmpty() || this.selectedTierIndex >= this.subscriptionTiers.size()) {
                    return;
                }
                this.premiumButtonView.setButton(getPremiumButtonText(this.currentAccount, (SubscriptionTier) this.subscriptionTiers.get(this.selectedTierIndex)), null, z);
                this.buttonContainerInternal.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PremiumPreviewFragment.this.lambda$updateButtonText$19(view);
                    }
                });
                this.premiumButtonView.setFlickerDisabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateButtonText$17(View view) {
        buyPremium(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateButtonText$19(View view) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        SubscriptionTier subscriptionTier = (SubscriptionTier) this.subscriptionTiers.get(this.selectedTierIndex);
        SubscriptionTier subscriptionTier2 = this.currentSubscriptionTier;
        buyPremium(this, subscriptionTier, "settings", true, (subscriptionTier2 == null || (tL_premiumSubscriptionOption = subscriptionTier2.subscriptionOption) == null || tL_premiumSubscriptionOption.transaction == null) ? null : BillingFlowParams.SubscriptionUpdateParams.newBuilder().setOldPurchaseToken(BillingController.getInstance().getLastPremiumToken()).setSubscriptionReplacementMode(5).build());
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isLightStatusBar() {
        return this.whiteBackground;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null && backgroundView.imageView != null) {
            this.backgroundView.imageView.setPaused(false);
            this.backgroundView.imageView.setDialogVisible(false);
        }
        this.particlesView.setPaused(false);
        Bulletin.addDelegate(this, new Bulletin.Delegate() { // from class: org.telegram.ui.PremiumPreviewFragment.6
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
                return AndroidUtilities.navigationBarHeight;
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null && backgroundView.imageView != null) {
            this.backgroundView.imageView.setDialogVisible(true);
        }
        StarParticlesView starParticlesView = this.particlesView;
        if (starParticlesView != null) {
            starParticlesView.setPaused(true);
        }
        Bulletin.removeDelegate(this);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean canBeginSlide() {
        BackgroundView backgroundView = this.backgroundView;
        return backgroundView == null || backgroundView.imageView == null || !this.backgroundView.imageView.touched;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda3
            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public final void didSetColor() {
                PremiumPreviewFragment.this.updateColors();
            }

            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public /* synthetic */ void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.-CC.$default$onAnimationProgress(this, f);
            }
        }, Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4, Theme.key_premiumGradientBackground1, Theme.key_premiumGradientBackground2, Theme.key_premiumGradientBackground3, Theme.key_premiumGradientBackground4, Theme.key_premiumGradientBackgroundOverlay, Theme.key_premiumStarGradient1, Theme.key_premiumStarGradient2, Theme.key_premiumStartSmallStarsColor, Theme.key_premiumStartSmallStarsColor2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateColors() {
        ActionBar actionBar;
        if (this.backgroundView == null || (actionBar = this.actionBar) == null) {
            return;
        }
        actionBar.setItemsColor(Theme.getColor(this.whiteBackground ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_premiumGradientBackgroundOverlay), false);
        this.actionBar.setItemsColor(Theme.getColor(this.whiteBackground ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_premiumGradientBackgroundOverlay), true);
        ActionBar actionBar2 = this.actionBar;
        int i = Theme.key_premiumGradientBackgroundOverlay;
        actionBar2.setItemsBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(i), 60), false);
        this.particlesView.drawable.updateColors();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null) {
            backgroundView.titleView.setTextColor(Theme.getColor(this.whiteBackground ? Theme.key_windowBackgroundWhiteBlackText : i));
            TextView textView = this.backgroundView.subtitleView;
            if (this.whiteBackground) {
                i = Theme.key_windowBackgroundWhiteBlackText;
            }
            textView.setTextColor(Theme.getColor(i));
            if (this.backgroundView.imageView != null && this.backgroundView.imageView.mRenderer != null) {
                if (this.whiteBackground) {
                    this.backgroundView.imageView.mRenderer.colorKey1 = Theme.key_premiumCoinGradient1;
                    this.backgroundView.imageView.mRenderer.colorKey2 = Theme.key_premiumCoinGradient2;
                }
                this.backgroundView.imageView.mRenderer.updateColors();
            }
        }
        updateBackgroundImage();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        if (this.settingsView == null) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        closeSetting();
        return false;
    }

    private void closeSetting() {
        this.settingsView.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.PremiumPreviewFragment.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PremiumPreviewFragment.this.contentView.removeView(PremiumPreviewFragment.this.settingsView);
                PremiumPreviewFragment.this.settingsView = null;
                super.onAnimationEnd(animator);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        updateDialogVisibility(showDialog != null);
        return showDialog;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    protected void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        updateDialogVisibility(false);
    }

    private void updateDialogVisibility(boolean z) {
        if (z != this.isDialogVisible) {
            this.isDialogVisible = z;
            BackgroundView backgroundView = this.backgroundView;
            if (backgroundView != null && backgroundView.imageView != null) {
                this.backgroundView.imageView.setDialogVisible(z);
            }
            this.particlesView.setPaused(z);
            this.contentView.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void sentShowScreenStat(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = connectionsManager.getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_show";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        if (str != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = str;
            tL_jsonNull = tL_jsonString;
        } else {
            tL_jsonNull = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "source";
        tL_jsonObjectValue.value = tL_jsonNull;
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        connectionsManager.sendRequest(tL_help_saveAppLog, new RequestDelegate() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PremiumPreviewFragment.lambda$sentShowScreenStat$20(tLObject, tL_error);
            }
        });
    }

    public static void sentPremiumButtonClick() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new RequestDelegate() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda17
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PremiumPreviewFragment.lambda$sentPremiumButtonClick$21(tLObject, tL_error);
            }
        });
    }

    public static void sentPremiumBuyCanceled() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_fail";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new RequestDelegate() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda15
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PremiumPreviewFragment.lambda$sentPremiumBuyCanceled$22(tLObject, tL_error);
            }
        });
    }

    public static void sentShowFeaturePreview(int i, int i2) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String featureTypeToServerString = featureTypeToServerString(i2);
        if (featureTypeToServerString != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = featureTypeToServerString;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i).sendRequest(tL_help_saveAppLog, new RequestDelegate() { // from class: org.telegram.ui.PremiumPreviewFragment$$ExternalSyntheticLambda16
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PremiumPreviewFragment.lambda$sentShowFeaturePreview$23(tLObject, tL_error);
            }
        });
    }

    public static final class SubscriptionTier {
        private int discount;
        private ProductDetails googlePlayProductDetails;
        private ProductDetails.SubscriptionOfferDetails offerDetails;
        private long pricePerMonth;
        private long pricePerYear;
        private long pricePerYearRegular;
        public final TLRPC.TL_premiumSubscriptionOption subscriptionOption;
        public int yOffset;

        public SubscriptionTier(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
            this.subscriptionOption = tL_premiumSubscriptionOption;
        }

        public ProductDetails getGooglePlayProductDetails() {
            return this.googlePlayProductDetails;
        }

        public ProductDetails.SubscriptionOfferDetails getOfferDetails() {
            checkOfferDetails();
            return this.offerDetails;
        }

        public void setGooglePlayProductDetails(ProductDetails productDetails) {
            this.googlePlayProductDetails = productDetails;
        }

        public void setPricePerYearRegular(long j) {
            this.pricePerYearRegular = j;
        }

        public int getMonths() {
            return this.subscriptionOption.months;
        }

        public int getDiscount() {
            if (this.discount == 0) {
                if (getPricePerMonth() == 0) {
                    return 0;
                }
                if (this.pricePerYearRegular != 0) {
                    int pricePerYear = (int) ((1.0d - (getPricePerYear() / this.pricePerYearRegular)) * 100.0d);
                    this.discount = pricePerYear;
                    if (pricePerYear == 0) {
                        this.discount = -1;
                    }
                }
            }
            return this.discount;
        }

        public long getPricePerYear() {
            if (this.pricePerYear == 0) {
                long price = getPrice();
                if (price != 0) {
                    this.pricePerYear = (long) ((price / this.subscriptionOption.months) * 12.0d);
                }
            }
            return this.pricePerYear;
        }

        public long getPricePerMonth() {
            if (this.pricePerMonth == 0) {
                long price = getPrice();
                if (price != 0) {
                    this.pricePerMonth = price / this.subscriptionOption.months;
                }
            }
            return this.pricePerMonth;
        }

        public String getFormattedPricePerYearRegular() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(this.pricePerYearRegular, getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(this.pricePerYearRegular, getCurrency(), 6);
        }

        public String getFormattedPricePerYear() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(getPricePerYear(), getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPricePerYear(), getCurrency(), 6);
        }

        public String getFormattedPricePerMonth() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(getPricePerMonth(), getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPricePerMonth(), getCurrency(), 6);
        }

        public String getFormattedPrice() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(getPrice(), getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPrice(), getCurrency(), 6);
        }

        public long getPrice() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return this.subscriptionOption.amount;
            }
            if (this.googlePlayProductDetails == null) {
                return 0L;
            }
            checkOfferDetails();
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = this.offerDetails;
            if (subscriptionOfferDetails == null) {
                return 0L;
            }
            return ((ProductDetails.PricingPhase) subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0)).getPriceAmountMicros();
        }

        public String getCurrency() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return this.subscriptionOption.currency;
            }
            if (this.googlePlayProductDetails == null) {
                return "";
            }
            checkOfferDetails();
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = this.offerDetails;
            return subscriptionOfferDetails == null ? "" : ((ProductDetails.PricingPhase) subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0)).getPriceCurrencyCode();
        }

        private void checkOfferDetails() {
            ProductDetails productDetails = this.googlePlayProductDetails;
            if (productDetails != null && this.offerDetails == null) {
                for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails : productDetails.getSubscriptionOfferDetails()) {
                    String billingPeriod = ((ProductDetails.PricingPhase) subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0)).getBillingPeriod();
                    if (getMonths() == 12) {
                        if (billingPeriod.equals("P1Y")) {
                            this.offerDetails = subscriptionOfferDetails;
                            return;
                        }
                    } else if (billingPeriod.equals(String.format(Locale.ROOT, "P%dM", Integer.valueOf(getMonths())))) {
                        this.offerDetails = subscriptionOfferDetails;
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showSelectStatusDialog(PremiumFeatureCell premiumFeatureCell, Long l, final Utilities.Callback2 callback2) {
        PremiumFeatureCell premiumFeatureCell2;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        int i;
        int i2;
        int dp;
        if (this.selectAnimatedEmojiDialog != null || premiumFeatureCell == null) {
            return;
        }
        final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
        boolean z = ((float) (premiumFeatureCell.getTop() + premiumFeatureCell.getHeight())) > ((float) this.listView.getMeasuredHeight()) / 2.0f;
        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = premiumFeatureCell.imageDrawable;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.removeOldDrawable();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = premiumFeatureCell.imageDrawable;
            if (swapAnimatedEmojiDrawable3 != null) {
                swapAnimatedEmojiDrawable3.play();
                premiumFeatureCell.updateImageBounds();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(premiumFeatureCell.imageDrawable.getBounds());
                if (z) {
                    dp = ((-rect.centerY()) + AndroidUtilities.dp(12.0f)) - min;
                } else {
                    dp = (-(premiumFeatureCell.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                }
                i = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable3;
                i2 = dp;
                premiumFeatureCell2 = premiumFeatureCell;
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), true, Integer.valueOf(i), !z ? 12 : 0, true, getResourceProvider(), !z ? 24 : 16) { // from class: org.telegram.ui.PremiumPreviewFragment.8
                    @Override // org.telegram.ui.SelectAnimatedEmojiDialog
                    protected float getScrimDrawableTranslationY() {
                        return 0.0f;
                    }

                    @Override // org.telegram.ui.SelectAnimatedEmojiDialog
                    protected void onEmojiSelected(View view, Long l2, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                        Utilities.Callback2 callback22 = callback2;
                        if (callback22 != null) {
                            callback22.run(l2, num);
                        }
                        if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                            PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                            selectAnimatedEmojiDialogWindowArr[0].dismiss();
                        }
                    }
                };
                selectAnimatedEmojiDialog.useAccentForPlus = true;
                selectAnimatedEmojiDialog.setSelected(l);
                selectAnimatedEmojiDialog.setSaveState(3);
                selectAnimatedEmojiDialog.setScrimDrawable(swapAnimatedEmojiDrawable, premiumFeatureCell2);
                int i3 = -2;
                SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, i3, i3) { // from class: org.telegram.ui.PremiumPreviewFragment.9
                    @Override // org.telegram.ui.SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow, android.widget.PopupWindow
                    public void dismiss() {
                        super.dismiss();
                        PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                    }
                };
                this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
                selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow;
                selectAnimatedEmojiDialogWindow.showAsDropDown(premiumFeatureCell, 0, i2, 53);
                selectAnimatedEmojiDialogWindowArr[0].dimBehind();
            }
            swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable3;
            premiumFeatureCell2 = premiumFeatureCell;
        } else {
            premiumFeatureCell2 = null;
            swapAnimatedEmojiDrawable = null;
        }
        i = 0;
        i2 = 0;
        if (!z) {
        }
        View selectAnimatedEmojiDialog2 = new SelectAnimatedEmojiDialog(this, getContext(), true, Integer.valueOf(i), !z ? 12 : 0, true, getResourceProvider(), !z ? 24 : 16) { // from class: org.telegram.ui.PremiumPreviewFragment.8
            @Override // org.telegram.ui.SelectAnimatedEmojiDialog
            protected float getScrimDrawableTranslationY() {
                return 0.0f;
            }

            @Override // org.telegram.ui.SelectAnimatedEmojiDialog
            protected void onEmojiSelected(View view, Long l2, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                Utilities.Callback2 callback22 = callback2;
                if (callback22 != null) {
                    callback22.run(l2, num);
                }
                if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                    PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
                    selectAnimatedEmojiDialogWindowArr[0].dismiss();
                }
            }
        };
        selectAnimatedEmojiDialog2.useAccentForPlus = true;
        selectAnimatedEmojiDialog2.setSelected(l);
        selectAnimatedEmojiDialog2.setSaveState(3);
        selectAnimatedEmojiDialog2.setScrimDrawable(swapAnimatedEmojiDrawable, premiumFeatureCell2);
        int i32 = -2;
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow2 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog2, i32, i32) { // from class: org.telegram.ui.PremiumPreviewFragment.9
            @Override // org.telegram.ui.SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow, android.widget.PopupWindow
            public void dismiss() {
                super.dismiss();
                PremiumPreviewFragment.this.selectAnimatedEmojiDialog = null;
            }
        };
        this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow2;
        selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow2;
        selectAnimatedEmojiDialogWindow2.showAsDropDown(premiumFeatureCell, 0, i2, 53);
        selectAnimatedEmojiDialogWindowArr[0].dimBehind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        this.iBlur3PositionMainTabs.set(0.0f, (this.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight() + AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, 1);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }
}
