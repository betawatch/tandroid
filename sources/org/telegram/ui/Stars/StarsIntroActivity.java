package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda14;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.StarAppsSheet;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.ImageReceiverSpan;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PostSuggestionsEditActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

/* loaded from: classes5.dex */
public class StarsIntroActivity extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    private static DecimalFormat floatFormat;
    private static DecimalFormat floatFormat2;
    private FrameLayout aboveTitleView;
    private UniversalAdapter adapter;
    private LinearLayout balanceLayout;
    private ButtonWithCounterView buyButton;
    private View emptyLayout;
    private FireworksOverlay fireworksOverlay;
    private ButtonWithCounterView giftButton;
    private boolean hadTransactions;
    private GLIconTextureView iconTextureView;
    private FrameLayout oneButtonsLayout;
    private SpannableStringBuilder starBalanceIcon;
    private AnimatedTextView starBalanceTextView;
    private TextView starBalanceTitleView;
    private ButtonWithCounterView topupButton;
    private StarsTransactionsLayout transactionsLayout;
    private boolean twoButtons;
    private LinearLayout twoButtonsLayout;
    private ButtonWithCounterView withdrawButton;
    private boolean expanded = false;
    private final int BUTTON_EXPAND = -1;
    private final int BUTTON_GIFT = -2;
    private final int BUTTON_SUBSCRIPTIONS_EXPAND = -3;
    private final int BUTTON_AFFILIATE = -4;

    public StarsIntroActivity() {
        setWhiteBackground(true);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
        StarsController.getInstance(this.currentAccount).invalidateSubscriptions(true);
        StarsController.getInstance(this.currentAccount).getOptions();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starOptionsLoaded) {
            saveScrollPosition();
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(true);
            }
            if (this.savedScrollPosition == 0 && this.savedScrollOffset < 0) {
                this.savedScrollOffset = 0;
            }
            applyScrolledPosition();
            return;
        }
        if (i == NotificationCenter.starTransactionsLoaded) {
            StarsController starsController = StarsController.getInstance(this.currentAccount);
            if (this.hadTransactions != starsController.hasTransactions()) {
                this.hadTransactions = starsController.hasTransactions();
                saveScrollPosition();
                UniversalAdapter universalAdapter2 = this.adapter;
                if (universalAdapter2 != null) {
                    universalAdapter2.update(true);
                }
                if (this.savedScrollPosition == 0 && this.savedScrollOffset < 0) {
                    this.savedScrollOffset = 0;
                }
                applyScrolledPosition();
                return;
            }
            return;
        }
        if (i == NotificationCenter.starSubscriptionsLoaded) {
            UniversalAdapter universalAdapter3 = this.adapter;
            if (universalAdapter3 != null) {
                universalAdapter3.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.starBalanceUpdated) {
            updateBalance();
        } else if (i == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            updateBalance();
        }
    }

    @Override // org.telegram.ui.GradientHeaderActivity, org.telegram.ui.ActionBar.BaseFragment
    public View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        this.transactionsLayout = new StarsTransactionsLayout(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.emptyLayout = new View(context) { // from class: org.telegram.ui.Stars.StarsIntroActivity.1
            @Override // android.view.View
            protected void onMeasure(int i, int i2) {
                int i3;
                StarsIntroActivity starsIntroActivity = StarsIntroActivity.this;
                if (starsIntroActivity.isLandscapeMode) {
                    i3 = (starsIntroActivity.statusBarHeight + ((BaseFragment) starsIntroActivity).actionBar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f);
                    StarsIntroActivity starsIntroActivity2 = StarsIntroActivity.this;
                    int i4 = dp + starsIntroActivity2.statusBarHeight;
                    if (starsIntroActivity2.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(24.0f) > i4) {
                        i3 = AndroidUtilities.dp(24.0f) + StarsIntroActivity.this.backgroundView.getMeasuredHeight();
                    } else {
                        i3 = i4;
                    }
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - (((GradientHeaderActivity) StarsIntroActivity.this).yOffset * 2.5f)), TLObject.FLAG_30));
            }
        };
        super.createView(context);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isRightLayout()) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.aboveTitleView = frameLayout;
        frameLayout.setClickable(true);
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
        this.iconTextureView = gLIconTextureView;
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        this.iconTextureView.setStarParticlesView(this.particlesView);
        this.aboveTitleView.addView(this.iconTextureView, LayoutHelper.createFrame(NotificationCenter.boostedChannelByUser, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        configureHeader(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                new ExplainStarsSheet(context).show();
            }
        }), true), this.aboveTitleView, null);
        this.listView.setOverScrollMode(2);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda34
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i) {
                StarsIntroActivity.$r8$lambda$1cCgxU9h4FtsqvLhyRUNTZSvpkI(StarsIntroActivity.this, view, i);
            }
        });
        FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
        this.fireworksOverlay = fireworksOverlay;
        this.contentView.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        StarsController starsController = StarsController.getInstance(this.currentAccount);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.balanceLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.balanceLayout.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), false, true, false);
        this.starBalanceTextView = animatedTextView;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        this.starBalanceTextView.setTextSize(AndroidUtilities.dp(32.0f));
        this.starBalanceTextView.setGravity(17);
        this.starBalanceTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourceProvider));
        this.starBalanceIcon = new SpannableStringBuilder("S");
        ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(this.starBalanceTextView, this.currentAccount, 42.0f);
        ImageReceiver imageReceiver = imageReceiverSpan.imageReceiver;
        int i = R.raw.star_reaction;
        imageReceiver.setImageBitmap(new RLottieDrawable(i, "s" + i, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f)));
        imageReceiverSpan.imageReceiver.setAutoRepeat(2);
        imageReceiverSpan.enableShadow(false);
        imageReceiverSpan.translate((float) (-AndroidUtilities.dp(3.0f)), 0.0f);
        this.starBalanceIcon.setSpan(imageReceiverSpan, 0, 1, 33);
        this.balanceLayout.addView(this.starBalanceTextView, LayoutHelper.createFrame(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.starBalanceTitleView = textView;
        textView.setTextSize(1, 14.0f);
        this.starBalanceTitleView.setGravity(17);
        this.starBalanceTitleView.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.starBalanceTitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourceProvider));
        this.balanceLayout.addView(this.starBalanceTitleView, LayoutHelper.createFrame(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        FrameLayout frameLayout3 = new FrameLayout(getContext()) { // from class: org.telegram.ui.Stars.StarsIntroActivity.2
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (StarsIntroActivity.this.twoButtons) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.oneButtonsLayout = frameLayout3;
        frameLayout2.addView(frameLayout3);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourceProvider);
        this.buyButton = buttonWithCounterView;
        buttonWithCounterView.setRound();
        this.buyButton.setText("", false);
        this.buyButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.$r8$lambda$r2ax3eGjnQIfvNKgo5GgMeWW8gw(StarsIntroActivity.this, context, view);
            }
        });
        this.oneButtonsLayout.addView(this.buyButton, LayoutHelper.createFrame(-1, 48, 119));
        LinearLayout linearLayout2 = new LinearLayout(getContext()) { // from class: org.telegram.ui.Stars.StarsIntroActivity.3
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (StarsIntroActivity.this.twoButtons) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.twoButtonsLayout = linearLayout2;
        frameLayout2.addView(linearLayout2);
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(getContext(), this.resourceProvider);
        this.topupButton = buttonWithCounterView2;
        buttonWithCounterView2.setRound();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.topupButton.setText(spannableStringBuilder, false);
        this.topupButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.$r8$lambda$LCz-RMi_lFXq4FrWRWbTOp_8E18(StarsIntroActivity.this, context, view);
            }
        });
        this.twoButtonsLayout.addView(this.topupButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(getContext(), this.resourceProvider);
        this.withdrawButton = buttonWithCounterView3;
        buttonWithCounterView3.setRound();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.withdrawButton.setText(spannableStringBuilder2, false);
        this.withdrawButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r0.presentFragment(new BotStarsActivity(0, StarsIntroActivity.this.getUserConfig().getClientUserId()));
            }
        });
        this.twoButtonsLayout.addView(this.withdrawButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.balanceLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView4 = new ButtonWithCounterView(getContext(), false, this.resourceProvider);
        this.giftButton = buttonWithCounterView4;
        buttonWithCounterView4.setRound();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new ColoredImageSpan(R.drawable.menu_stars_gift), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.giftButton.setText(spannableStringBuilder3, false);
        this.giftButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.$r8$lambda$UzfR1UOWLsFIJODcy492GqK_z10(StarsIntroActivity.this, view);
            }
        });
        this.balanceLayout.addView(this.giftButton, LayoutHelper.createFrame(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        updateBalance();
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
        BotStarsController.getInstance(this.currentAccount).preloadStarsStats(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(getUserConfig().getClientUserId());
        updateButtonsLayouts(starsController.getBalance().amount > 0 && starsRevenueStats != null && (tL_starsRevenueStatus = starsRevenueStats.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    public static /* synthetic */ void $r8$lambda$1cCgxU9h4FtsqvLhyRUNTZSvpkI(StarsIntroActivity starsIntroActivity, View view, int i) {
        UItem item;
        UniversalAdapter universalAdapter = starsIntroActivity.adapter;
        if (universalAdapter == null || (item = universalAdapter.getItem(i)) == null) {
            return;
        }
        starsIntroActivity.onItemClick(item, i);
    }

    public static /* synthetic */ void $r8$lambda$r2ax3eGjnQIfvNKgo5GgMeWW8gw(StarsIntroActivity starsIntroActivity, Context context, View view) {
        if (MessagesController.getInstance(starsIntroActivity.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(starsIntroActivity.currentAccount);
        } else {
            new StarsOptionsSheet(context, starsIntroActivity.resourceProvider).show();
        }
    }

    public static /* synthetic */ void $r8$lambda$LCz-RMi_lFXq4FrWRWbTOp_8E18(StarsIntroActivity starsIntroActivity, Context context, View view) {
        starsIntroActivity.getClass();
        new StarsOptionsSheet(context, starsIntroActivity.resourceProvider).show();
    }

    public static /* synthetic */ void $r8$lambda$UzfR1UOWLsFIJODcy492GqK_z10(StarsIntroActivity starsIntroActivity, View view) {
        StarsController.getInstance(starsIntroActivity.currentAccount).getGiftOptions();
        UserSelectorBottomSheet.open(1, 0L, BirthdayController.getInstance(starsIntroActivity.currentAccount).getState());
    }

    private void updateBalance() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        StarsController starsController = StarsController.getInstance(this.currentAccount);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.starBalanceIcon);
        spannableStringBuilder.append(formatStarsAmount(starsController.getBalance(), 0.66f, ' '));
        this.starBalanceTextView.setText(spannableStringBuilder);
        this.buyButton.setText(LocaleController.getString(starsController.getBalance().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true);
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(getUserConfig().getClientUserId());
        updateButtonsLayouts((starsRevenueStats == null || (tL_starsRevenueStatus = starsRevenueStats.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true, true);
    }

    private void updateButtonsLayouts(final boolean z, boolean z2) {
        this.twoButtons = z;
        if (z2) {
            this.oneButtonsLayout.setVisibility(0);
            this.twoButtonsLayout.setVisibility(0);
            this.oneButtonsLayout.animate().alpha(z ? 0.0f : 1.0f).withEndAction(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.$r8$lambda$Zjj5RR39A0Q5A4AHxafZvbDbBnQ(StarsIntroActivity.this, z);
                }
            }).start();
            this.twoButtonsLayout.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda40
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.$r8$lambda$hw3mdsdosYyLbqBI6hHKuO2Traw(StarsIntroActivity.this, z);
                }
            }).start();
            return;
        }
        this.oneButtonsLayout.animate().cancel();
        this.twoButtonsLayout.animate().cancel();
        this.twoButtonsLayout.setAlpha(z ? 1.0f : 0.0f);
        this.oneButtonsLayout.setAlpha(z ? 0.0f : 1.0f);
        this.twoButtonsLayout.setVisibility(z ? 0 : 8);
        this.oneButtonsLayout.setVisibility(z ? 8 : 0);
    }

    public static /* synthetic */ void $r8$lambda$Zjj5RR39A0Q5A4AHxafZvbDbBnQ(StarsIntroActivity starsIntroActivity, boolean z) {
        if (z) {
            starsIntroActivity.oneButtonsLayout.setVisibility(8);
        } else {
            starsIntroActivity.getClass();
        }
    }

    public static /* synthetic */ void $r8$lambda$hw3mdsdosYyLbqBI6hHKuO2Traw(StarsIntroActivity starsIntroActivity, boolean z) {
        if (z) {
            starsIntroActivity.getClass();
        } else {
            starsIntroActivity.twoButtonsLayout.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    protected GradientHeaderActivity.ContentView createContentView() {
        return new NestedFrameLayout(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    class NestedFrameLayout extends GradientHeaderActivity.ContentView implements NestedScrollingParent3 {
        private NestedScrollingParentHelper nestedScrollingParentHelper;

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent2
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent2
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return i == 2;
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, android.view.ViewGroup, android.view.ViewParent
        public void onStopNestedScroll(View view) {
        }

        public NestedFrameLayout(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent3
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            try {
                if (view == ((GradientHeaderActivity) StarsIntroActivity.this).listView && StarsIntroActivity.this.transactionsLayout.isAttachedToWindow()) {
                    RecyclerListView currentListView = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                    if ((((GradientHeaderActivity) StarsIntroActivity.this).listView.getHeight() - ((GradientHeaderActivity) StarsIntroActivity.this).listView.getPaddingBottom()) - ((View) StarsIntroActivity.this.transactionsLayout.getParent()).getBottom() >= 0) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$NestedFrameLayout$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.NestedFrameLayout.$r8$lambda$UgOvpUFptBz64Fh5cblK0jQwjwo(StarsIntroActivity.NestedFrameLayout.this);
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$UgOvpUFptBz64Fh5cblK0jQwjwo(NestedFrameLayout nestedFrameLayout) {
            nestedFrameLayout.getClass();
            try {
                RecyclerListView currentListView = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                if (currentListView == null || currentListView.getAdapter() == null) {
                    return;
                }
                currentListView.getAdapter().notifyDataSetChanged();
            } catch (Throwable unused) {
            }
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, android.view.ViewGroup, android.view.ViewParent
        public boolean onNestedPreFling(View view, float f, float f2) {
            return super.onNestedPreFling(view, f, f2);
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent2
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            if (view == ((GradientHeaderActivity) StarsIntroActivity.this).listView && StarsIntroActivity.this.transactionsLayout.isAttachedToWindow()) {
                boolean isSearchFieldVisible = ((BaseFragment) StarsIntroActivity.this).actionBar.isSearchFieldVisible();
                int top = (((View) StarsIntroActivity.this.transactionsLayout.getParent()).getTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
                int bottom = ((View) StarsIntroActivity.this.transactionsLayout.getParent()).getBottom();
                boolean z = false;
                if (i2 < 0) {
                    if ((((GradientHeaderActivity) StarsIntroActivity.this).listView.getHeight() - ((GradientHeaderActivity) StarsIntroActivity.this).listView.getPaddingBottom()) - bottom >= 0) {
                        RecyclerListView currentListView = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                        int findFirstVisibleItemPosition = ((LinearLayoutManager) currentListView.getLayoutManager()).findFirstVisibleItemPosition();
                        if (findFirstVisibleItemPosition != -1) {
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = currentListView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                            int top2 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView.getTop() : -1;
                            int paddingTop = currentListView.getPaddingTop();
                            if (top2 != paddingTop || findFirstVisibleItemPosition != 0) {
                                iArr[1] = findFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                                currentListView.scrollBy(0, i2);
                                z = true;
                            }
                        }
                    }
                    if (isSearchFieldVisible) {
                        if (!z && top < 0) {
                            iArr[1] = i2 - Math.max(top, i2);
                            return;
                        } else {
                            iArr[1] = i2;
                            return;
                        }
                    }
                    return;
                }
                if (isSearchFieldVisible) {
                    RecyclerListView currentListView2 = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                    iArr[1] = i2;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i4 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i4);
                    return;
                }
                if (i2 > 0) {
                    RecyclerListView currentListView3 = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                    if ((((GradientHeaderActivity) StarsIntroActivity.this).listView.getHeight() - ((GradientHeaderActivity) StarsIntroActivity.this).listView.getPaddingBottom()) - bottom < 0 || currentListView3 == null || currentListView3.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i2;
                    ((GradientHeaderActivity) StarsIntroActivity.this).listView.stopScroll();
                }
            }
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent2
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent2
        public void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
        }
    }

    public boolean attachedTransactionsLayout() {
        StarsTransactionsLayout starsTransactionsLayout = this.transactionsLayout;
        if (starsTransactionsLayout != null && (starsTransactionsLayout.getParent() instanceof View)) {
            if ((this.listView.getHeight() - this.listView.getPaddingBottom()) - ((View) this.transactionsLayout.getParent()).getBottom() >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    protected boolean drawActionBarShadow() {
        return !attachedTransactionsLayout();
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    public StarParticlesView createParticlesView() {
        return makeParticlesView(getContext(), 75, 1);
    }

    class 4 extends StarParticlesView {
        Paint[] paints;
        final /* synthetic */ int val$particlesCount;
        final /* synthetic */ int val$type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        4(Context context, int i, int i2) {
            super(context);
            this.val$particlesCount = i;
            this.val$type = i2;
            setClipWithGradient();
        }

        @Override // org.telegram.ui.Components.Premium.StarParticlesView
        protected void configure() {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(this.val$particlesCount);
            this.drawable = drawable;
            drawable.type = 105;
            int i = 0;
            drawable.roundEffect = false;
            drawable.useRotate = false;
            drawable.useBlur = true;
            drawable.checkBounds = true;
            drawable.isCircle = false;
            drawable.useScale = true;
            drawable.startFromCenter = true;
            if (this.val$type == 1) {
                drawable.centerOffsetY = AndroidUtilities.dp(24.0f);
            }
            this.paints = new Paint[20];
            while (true) {
                Paint[] paintArr = this.paints;
                if (i < paintArr.length) {
                    paintArr[i] = new Paint(1);
                    this.paints[i].setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-371690, -14281, i / (this.paints.length - 1)), PorterDuff.Mode.SRC_IN));
                    i++;
                } else {
                    this.drawable.getPaint = new Utilities.CallbackReturn() { // from class: org.telegram.ui.Stars.StarsIntroActivity$4$$ExternalSyntheticLambda0
                        @Override // org.telegram.messenger.Utilities.CallbackReturn
                        public final Object run(Object obj) {
                            return StarsIntroActivity.4.$r8$lambda$ECDkGjS75q-X-98nxJrSYx7aORY(StarsIntroActivity.4.this, (Integer) obj);
                        }
                    };
                    StarParticlesView.Drawable drawable2 = this.drawable;
                    drawable2.size1 = 17;
                    drawable2.size2 = 18;
                    drawable2.size3 = 19;
                    drawable2.colorKey = Theme.key_windowBackgroundWhiteBlackText;
                    drawable2.init();
                    return;
                }
            }
        }

        public static /* synthetic */ Paint $r8$lambda$ECDkGjS75q-X-98nxJrSYx7aORY(4 r1, Integer num) {
            return r1.paints[num.intValue() % r1.paints.length];
        }

        @Override // org.telegram.ui.Components.Premium.StarParticlesView
        protected int getStarsRectWidth() {
            return getMeasuredWidth();
        }
    }

    public static StarParticlesView makeParticlesView(Context context, int i, int i2) {
        return new 4(context, i, i2);
    }

    @Override // org.telegram.ui.GradientHeaderActivity, org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(false);
            this.iconTextureView.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.GradientHeaderActivity, org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(true);
            this.iconTextureView.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    protected View getHeader(Context context) {
        return super.getHeader(context);
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    protected RecyclerView.Adapter createAdapter() {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.listView, getContext(), this.currentAccount, this.classGuid, true, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda67
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StarsIntroActivity.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, getResourceProvider()) { // from class: org.telegram.ui.Stars.StarsIntroActivity.5
            @Override // org.telegram.ui.Components.UniversalAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i == 42) {
                    HeaderCell headerCell = new HeaderCell(StarsIntroActivity.this.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, false, ((BaseFragment) StarsIntroActivity.this).resourceProvider);
                    headerCell.setHeight(25);
                    return new RecyclerListView.Holder(headerCell);
                }
                return super.onCreateViewHolder(viewGroup, i);
            }
        };
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (getContext() == null) {
            return;
        }
        StarsController starsController = StarsController.getInstance(this.currentAccount);
        arrayList.add(UItem.asFullyCustom(getHeader(getContext())));
        arrayList.add(UItem.asCustom(this.balanceLayout));
        ButtonWithCounterView buttonWithCounterView = this.giftButton;
        if (buttonWithCounterView != null) {
            buttonWithCounterView.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(UItem.asShadow(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(AffiliateProgramFragment.ColorfulTextCell.Factory.as(-4, getThemedColor(Theme.key_color_green), R.drawable.filled_earn_stars, ChatEditActivity.applyNewSpan(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(UItem.asShadow(null));
        }
        if (starsController.hasSubscriptions()) {
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.StarMySubscriptions)));
            for (int i = 0; i < starsController.subscriptions.size(); i++) {
                arrayList.add(StarsSubscriptionView.Factory.asSubscription((TL_stars.StarsSubscription) starsController.subscriptions.get(i)));
            }
            if (starsController.isLoadingSubscriptions()) {
                arrayList.add(UItem.asFlicker(arrayList.size(), 33));
            } else if (!starsController.didFullyLoadSubscriptions()) {
                arrayList.add(UItem.asButton(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand)).accent());
            }
            arrayList.add(UItem.asShadow(null));
        }
        boolean hasTransactions = starsController.hasTransactions();
        this.hadTransactions = hasTransactions;
        if (hasTransactions) {
            arrayList.add(UItem.asFullscreenCustom(this.transactionsLayout, ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.dp(24.0f) + AndroidUtilities.navigationBarHeight));
        } else {
            arrayList.add(UItem.asCustomShadow(this.emptyLayout));
        }
    }

    public void onItemClick(final UItem uItem, int i) {
        int i2 = uItem.id;
        if (i2 == -1) {
            this.expanded = !this.expanded;
            this.adapter.update(true);
            return;
        }
        if (i2 == -2) {
            StarsController.getInstance(this.currentAccount).getGiftOptions();
            UserSelectorBottomSheet.open(1, 0L, BirthdayController.getInstance(this.currentAccount).getState());
            return;
        }
        if (i2 == -3) {
            StarsController.getInstance(this.currentAccount).loadSubscriptions();
            this.adapter.update(true);
            return;
        }
        if (i2 == -4) {
            if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                AccountFrozenAlert.show(this.currentAccount);
                return;
            } else {
                presentFragment(new ChannelAffiliateProgramsFragment(getUserConfig().getClientUserId()));
                return;
            }
        }
        if (uItem.instanceOf(StarTierView.Factory.class)) {
            if (uItem.object instanceof TL_stars.TL_starsTopupOption) {
                StarsController.getInstance(this.currentAccount).buy(getParentActivity(), (TL_stars.TL_starsTopupOption) uItem.object, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda53
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        StarsIntroActivity.$r8$lambda$ThZ4R5C0vWGOF-U21pqsmKYvE8s(StarsIntroActivity.this, uItem, (Boolean) obj, (String) obj2);
                    }
                }, null);
            }
        } else if (uItem.instanceOf(StarsSubscriptionView.Factory.class) && (uItem.object instanceof TL_stars.StarsSubscription)) {
            showSubscriptionSheet(getContext(), this.currentAccount, (TL_stars.StarsSubscription) uItem.object, getResourceProvider());
        }
    }

    public static /* synthetic */ void $r8$lambda$ThZ4R5C0vWGOF-U21pqsmKYvE8s(StarsIntroActivity starsIntroActivity, UItem uItem, Boolean bool, String str) {
        if (starsIntroActivity.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            BulletinFactory.of(starsIntroActivity).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0]))).show();
            starsIntroActivity.fireworksOverlay.start(true);
            StarsController.getInstance(starsIntroActivity.currentAccount).invalidateTransactions(true);
        } else if (str != null) {
            BulletinFactory.of(starsIntroActivity).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
        }
    }

    public static class StarsBalanceView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private final AnimatedTextView amountTextView;
        private ValueAnimator bounceAnimator;
        private final int currentAccount;
        private long dialogId;
        private final TextView headerTextView;
        public long lastBalance;
        private SpannableString loadingString;
        private final ColoredImageSpan[] ref;
        private final ColoredImageSpan[] refTon;
        private final Theme.ResourcesProvider resourcesProvider;
        private boolean withTon;

        public StarsBalanceView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.lastBalance = -1L;
            this.ref = new ColoredImageSpan[1];
            this.refTon = new ColoredImageSpan[1];
            this.resourcesProvider = resourcesProvider;
            this.currentAccount = i;
            this.dialogId = UserConfig.getInstance(i).getClientUserId();
            setOrientation(1);
            setGravity(21);
            TextView textView = new TextView(context);
            this.headerTextView = textView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setTextSize(1, 13.0f);
            textView.setText(LocaleController.getString(R.string.StarsBalance));
            textView.setGravity(5);
            textView.setTypeface(AndroidUtilities.bold());
            addView(textView, LayoutHelper.createLinear(-2, -2, 5));
            final Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
            AnimatedTextView animatedTextView = new AnimatedTextView(context) { // from class: org.telegram.ui.Stars.StarsIntroActivity.StarsBalanceView.1
                @Override // android.view.View
                protected void dispatchDraw(Canvas canvas) {
                    if (!StarsBalanceView.this.withTon) {
                        int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().getCurrentWidth()) - AndroidUtilities.dp(20.0f));
                        mutate.setBounds(measuredWidth, (getMeasuredHeight() - AndroidUtilities.dp(17.0f)) / 2, AndroidUtilities.dp(17.0f) + measuredWidth, (getMeasuredHeight() + AndroidUtilities.dp(17.0f)) / 2);
                        mutate.draw(canvas);
                    }
                    super.dispatchDraw(canvas);
                }
            };
            this.amountTextView = animatedTextView;
            animatedTextView.adaptWidth = true;
            animatedTextView.getDrawable().setHacks(false, true, true);
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
            animatedTextView.setGravity(5);
            animatedTextView.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
            addView(animatedTextView, LayoutHelper.createLinear(-2, 20, 5, 0, -2, 0, 0));
            updateBalance(false);
            setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
        }

        public void withTon() {
            this.withTon = true;
        }

        public void setDialogId(long j) {
            if (this.dialogId != j) {
                this.dialogId = j;
                updateBalance(true);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateBalance(false);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starBalanceUpdated) {
                updateBalance(true);
            } else if (i == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.dialogId) {
                updateBalance(true);
            }
        }

        public void updateBalance(boolean z) {
            long j;
            boolean z2;
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
            StarsController starsController = StarsController.getInstance(this.currentAccount);
            StarsController tonInstance = this.withTon ? StarsController.getTonInstance(this.currentAccount) : null;
            long j2 = 0;
            AmountUtils$Amount fromNano = AmountUtils$Amount.fromNano(0L, AmountUtils$Currency.TON);
            this.amountTextView.cancelAnimation();
            if (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                z2 = !starsController.balanceAvailable();
                j = starsController.getBalance().amount;
                if (tonInstance != null) {
                    z2 |= !tonInstance.balanceAvailable();
                    fromNano = tonInstance.getBalanceAmount();
                }
            } else {
                TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(this.dialogId);
                boolean z3 = starsRevenueStats == null || starsRevenueStats.status == null;
                if (starsRevenueStats != null && (tL_starsRevenueStatus = starsRevenueStats.status) != null) {
                    j2 = tL_starsRevenueStatus.current_balance.amount;
                }
                j = j2;
                z2 = z3;
            }
            long j3 = this.lastBalance;
            if (j > j3 && j3 != -1) {
                bounce();
            }
            if (z2) {
                if (this.loadingString == null) {
                    SpannableString spannableString = new SpannableString("x");
                    this.loadingString = spannableString;
                    spannableString.setSpan(new LoadingSpan(this.amountTextView, AndroidUtilities.dp(48.0f)), 0, this.loadingString.length(), 33);
                }
                this.amountTextView.setText(this.loadingString, z);
                this.lastBalance = -1L;
                return;
            }
            if (this.withTon) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (!fromNano.isZero()) {
                    spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStarsWithPlain(true, (CharSequence) ("⭐️" + fromNano.asFormatString()), 0.62f, this.refTon));
                    ColoredImageSpan coloredImageSpan = this.refTon[0];
                    if (coloredImageSpan != null) {
                        coloredImageSpan.setColorKey(Theme.key_telegram_color_text);
                    }
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                spannableStringBuilder.append((CharSequence) StarsIntroActivity.replaceStarsWithPlain("⭐️" + LocaleController.formatNumber(j, ' '), 0.62f, this.ref));
                this.amountTextView.setText(spannableStringBuilder);
            } else {
                this.amountTextView.setText(LocaleController.formatNumber(j, ' '));
            }
            this.lastBalance = j;
        }

        public void bounce() {
            ValueAnimator valueAnimator = this.bounceAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.bounceAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsBalanceView$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StarsIntroActivity.StarsBalanceView.$r8$lambda$_2U21APNk2Vxo8_2UfXBZIICIAU(StarsIntroActivity.StarsBalanceView.this, valueAnimator2);
                }
            });
            this.bounceAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarsIntroActivity.StarsBalanceView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    StarsBalanceView.this.amountTextView.setScaleX(1.0f);
                    StarsBalanceView.this.amountTextView.setScaleY(1.0f);
                }
            });
            this.bounceAnimator.setDuration(320L);
            this.bounceAnimator.setInterpolator(new OvershootInterpolator());
            this.bounceAnimator.start();
        }

        public static /* synthetic */ void $r8$lambda$_2U21APNk2Vxo8_2UfXBZIICIAU(StarsBalanceView starsBalanceView, ValueAnimator valueAnimator) {
            starsBalanceView.getClass();
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            starsBalanceView.amountTextView.setScaleX(floatValue);
            starsBalanceView.amountTextView.setScaleY(floatValue);
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), TLObject.FLAG_30));
        }
    }

    public static class StarTierView extends FrameLayout {
        private final AnimatedFloat animatedStarsCount;
        private SpannableString loading;
        private boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        private final Drawable starDrawable;
        private final Drawable starDrawableOutline;
        private int starsCount;
        private final TextView textView;
        private final AnimatedTextView textView2;

        public StarTierView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.animatedStarsCount = new AnimatedFloat(this, 0L, 500L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.resourcesProvider = resourcesProvider;
            Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
            this.starDrawableOutline = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.starDrawable = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 15.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            addView(textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.textView2 = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            animatedTextView.setGravity(LocaleController.isRTL ? 3 : 5);
            addView(animatedTextView, LayoutHelper.createFrameRelatively(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
        }

        public void set(int i, CharSequence charSequence, CharSequence charSequence2, boolean z) {
            boolean equals = TextUtils.equals(this.textView.getText(), charSequence);
            this.starsCount = i;
            if (!equals) {
                this.animatedStarsCount.set(i, true);
            }
            this.textView.setText(charSequence);
            if (charSequence2 == null) {
                if (this.loading == null) {
                    SpannableString spannableString = new SpannableString("x");
                    this.loading = spannableString;
                    spannableString.setSpan(new LoadingSpan(this.textView2, AndroidUtilities.dp(55.0f)), 0, this.loading.length(), 33);
                }
                charSequence2 = this.loading;
            }
            this.textView2.setText(charSequence2);
            float f = LocaleController.isRTL ? -1.0f : 1.0f;
            if (equals) {
                this.textView.animate().translationX(f * (i - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            } else {
                this.textView.setTranslationX(f * (i - 1) * AndroidUtilities.dp(2.66f));
            }
            this.needDivider = z;
            invalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float f = this.animatedStarsCount.set(this.starsCount);
            float f2 = LocaleController.isRTL ? -1.0f : 1.0f;
            float dp = AndroidUtilities.dp(24.0f);
            float dp2 = AndroidUtilities.dp(24.0f);
            float dp3 = AndroidUtilities.dp(2.5f);
            float width = LocaleController.isRTL ? (getWidth() - AndroidUtilities.dp(19.0f)) - dp : AndroidUtilities.dp(19.0f);
            int ceil = (int) Math.ceil(f);
            while (true) {
                ceil--;
                if (ceil < 0) {
                    break;
                }
                float clamp = Utilities.clamp(f - ceil, 1.0f, 0.0f);
                float f3 = (((ceil - 1) - (1.0f - clamp)) * dp3 * f2) + width;
                float measuredHeight = (getMeasuredHeight() - dp2) / 2.0f;
                int i = (int) f3;
                int i2 = (int) measuredHeight;
                int i3 = (int) (f3 + dp);
                int i4 = (int) (measuredHeight + dp2);
                this.starDrawableOutline.setBounds(i, i2, i3, i4);
                int i5 = (int) (clamp * 255.0f);
                this.starDrawableOutline.setAlpha(i5);
                this.starDrawableOutline.draw(canvas);
                this.starDrawable.setBounds(i, i2, i3, i4);
                this.starDrawable.setAlpha(i5);
                this.starDrawable.draw(canvas);
            }
            if (this.needDivider) {
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : null;
                if (paint == null) {
                    paint = Theme.dividerPaint;
                }
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), paint);
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public StarTierView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new StarTierView(context, resourcesProvider);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((StarTierView) view).set(uItem.intValue, uItem.text, uItem.subtext, z);
            }

            public static UItem asStarTier(int i, int i2, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.intValue = i2;
                long j = tL_starsTopupOption.stars;
                ofFactory.longValue = j;
                ofFactory.text = LocaleController.formatPluralStringSpaced("StarsCount", (int) j);
                ofFactory.subtext = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
                ofFactory.object = tL_starsTopupOption;
                return ofFactory;
            }

            public static UItem asStarTier(int i, int i2, TL_stars.TL_starsGiftOption tL_starsGiftOption) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.intValue = i2;
                long j = tL_starsGiftOption.stars;
                ofFactory.longValue = j;
                ofFactory.text = LocaleController.formatPluralStringSpaced("StarsCount", (int) j);
                ofFactory.subtext = tL_starsGiftOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                ofFactory.object = tL_starsGiftOption;
                return ofFactory;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.intValue == uItem2.intValue && uItem.id == uItem2.id && TextUtils.equals(uItem.subtext, uItem2.subtext);
            }
        }
    }

    public static class ExpandView extends FrameLayout {
        public final ImageView arrowView;
        private int lastId;
        private boolean needDivider;
        public final AnimatedTextView textView;

        public ExpandView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.textView = animatedTextView;
            animatedTextView.getDrawable().setHacks(true, true, true);
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            addView(animatedTextView, LayoutHelper.createFrameRelatively(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.arrowView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.arrow_more);
            addView(imageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
        }

        public void set(UItem uItem, boolean z) {
            int i = this.lastId;
            int i2 = uItem.id;
            boolean z2 = i == i2;
            this.lastId = i2;
            this.textView.setText(uItem.text, z2);
            int color = Theme.getColor(uItem.accent ? Theme.key_windowBackgroundWhiteBlueText2 : Theme.key_windowBackgroundWhiteBlackText);
            this.textView.setTextColor(color);
            this.arrowView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            if (z2) {
                this.arrowView.animate().rotation(uItem.collapsed ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                this.arrowView.setRotation(uItem.collapsed ? 0.0f : 180.0f);
            }
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        public void set(String str, boolean z, boolean z2, boolean z3) {
            boolean z4 = this.lastId == -1;
            this.lastId = -1;
            this.textView.setText(str, z4);
            int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2);
            this.textView.setTextColor(color);
            this.arrowView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            if (z4) {
                this.arrowView.animate().rotation(z ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                this.arrowView.setRotation(z ? 0.0f : 180.0f);
            }
            this.needDivider = z3;
            setWillNotDraw(!z3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.lastId = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public ExpandView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new ExpandView(context, resourcesProvider);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((ExpandView) view).set(uItem, z);
            }

            public static UItem asExpand(int i, CharSequence charSequence, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.text = charSequence;
                ofFactory.collapsed = z;
                return ofFactory;
            }
        }
    }

    public static class StarsTransactionsLayout extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private final PageAdapter adapter;
        private final long bot_id;
        private final int currentAccount;
        private final ViewPagerFixed.TabsView tabsView;
        private final boolean ton;
        private final ViewPagerFixed viewPager;

        private static class PageAdapter extends ViewPagerFixed.Adapter {
            private final long bot_id;
            private final int classGuid;
            private final Context context;
            private final int currentAccount;
            private final ArrayList items = new ArrayList();
            private final Theme.ResourcesProvider resourcesProvider;
            private final boolean ton;

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public void bindView(View view, int i, int i2) {
            }

            public PageAdapter(Context context, int i, boolean z, long j, int i2, Theme.ResourcesProvider resourcesProvider) {
                this.context = context;
                this.currentAccount = i;
                this.ton = z;
                this.classGuid = i2;
                this.resourcesProvider = resourcesProvider;
                this.bot_id = j;
                fill();
            }

            public void fill() {
                this.items.clear();
                if (this.bot_id == 0) {
                    StarsController starsController = StarsController.getInstance(this.currentAccount, this.ton);
                    this.items.add(UItem.asSpace(0));
                    if (starsController.hasTransactions(1)) {
                        this.items.add(UItem.asSpace(1));
                    }
                    if (starsController.hasTransactions(2)) {
                        this.items.add(UItem.asSpace(2));
                        return;
                    }
                    return;
                }
                BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
                this.items.add(UItem.asSpace(0));
                if (botStarsController.hasTransactions(this.bot_id, 1)) {
                    this.items.add(UItem.asSpace(1));
                }
                if (botStarsController.hasTransactions(this.bot_id, 2)) {
                    this.items.add(UItem.asSpace(2));
                }
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemCount() {
                return this.items.size();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public View createView(int i) {
                return new Page(this.context, this.ton, this.bot_id, i, this.currentAccount, this.classGuid, this.resourcesProvider);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemViewType(int i) {
                if (i < 0 || i >= this.items.size()) {
                    return 0;
                }
                return ((UItem) this.items.get(i)).intValue;
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public String getItemTitle(int i) {
                int itemViewType = getItemViewType(i);
                if (itemViewType == 0) {
                    return LocaleController.getString(R.string.StarsTransactionsAll);
                }
                if (itemViewType == 1) {
                    return LocaleController.getString(R.string.StarsTransactionsIncoming);
                }
                if (itemViewType == 2) {
                    return LocaleController.getString(R.string.StarsTransactionsOutgoing);
                }
                return "";
            }
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starTransactionsLoaded) {
                this.adapter.fill();
                this.viewPager.fillTabs(true);
            }
        }

        public StarsTransactionsLayout(Context context, int i, boolean z, long j, int i2, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.ton = z;
            this.bot_id = j;
            setOrientation(1);
            ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context);
            this.viewPager = viewPagerFixed;
            PageAdapter pageAdapter = new PageAdapter(context, i, z, j, i2, resourcesProvider);
            this.adapter = pageAdapter;
            viewPagerFixed.setAdapter(pageAdapter);
            ViewPagerFixed.TabsView createTabsView = viewPagerFixed.createTabsView(true, 3);
            this.tabsView = createTabsView;
            View view = new View(context);
            view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
            addView(createTabsView, LayoutHelper.createLinear(-1, 48));
            addView(view, LayoutHelper.createLinear(-1.0f, 1.0f / AndroidUtilities.density));
            addView(viewPagerFixed, LayoutHelper.createLinear(-1, -1));
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            this.adapter.fill();
            this.viewPager.fillTabs(false);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
            super.onAttachedToWindow();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
            super.onDetachedFromWindow();
        }

        public RecyclerListView getCurrentListView() {
            View currentView = this.viewPager.getCurrentView();
            if (currentView instanceof Page) {
                return ((Page) currentView).listView;
            }
            return null;
        }

        public static class Page extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
            private final long bot_id;
            private final int currentAccount;
            private final UniversalRecyclerView listView;
            private final Runnable loadTransactionsRunnable;
            private final Theme.ResourcesProvider resourcesProvider;
            private final boolean ton;
            private final int type;

            public Page(Context context, final boolean z, final long j, final int i, final int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                this.type = i;
                this.ton = z;
                this.currentAccount = i2;
                this.bot_id = j;
                this.resourcesProvider = resourcesProvider;
                this.loadTransactionsRunnable = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsTransactionsLayout$Page$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.StarsTransactionsLayout.Page.$r8$lambda$BdY5IePEJVmjFRMp_wLAQjLeH9U(j, i2, i, z);
                    }
                };
                UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i2, i3, true, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsTransactionsLayout$Page$$ExternalSyntheticLambda1
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        StarsIntroActivity.StarsTransactionsLayout.Page.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                    }
                }, new Utilities.Callback5() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsTransactionsLayout$Page$$ExternalSyntheticLambda2
                    @Override // org.telegram.messenger.Utilities.Callback5
                    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        StarsIntroActivity.StarsTransactionsLayout.Page.this.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                    }
                }, null, resourcesProvider);
                this.listView = universalRecyclerView;
                addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f));
                universalRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity.StarsTransactionsLayout.Page.1
                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                        if (!Page.this.listView.canScrollVertically(1) || Page.this.isLoadingVisible()) {
                            Page.this.loadTransactionsRunnable.run();
                        }
                    }
                });
            }

            public static /* synthetic */ void $r8$lambda$BdY5IePEJVmjFRMp_wLAQjLeH9U(long j, int i, int i2, boolean z) {
                if (j != 0) {
                    BotStarsController.getInstance(i).loadTransactions(j, i2);
                } else {
                    StarsController.getInstance(i, z).loadTransactions(i2);
                }
            }

            public boolean isLoadingVisible() {
                for (int i = 0; i < this.listView.getChildCount(); i++) {
                    if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                        return true;
                    }
                }
                return false;
            }

            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public void didReceivedNotification(int i, int i2, Object... objArr) {
                if (i == NotificationCenter.starTransactionsLoaded) {
                    this.listView.adapter.update(true);
                    if (!this.listView.canScrollVertically(1) || isLoadingVisible()) {
                        this.loadTransactionsRunnable.run();
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.bot_id) {
                    this.listView.adapter.update(true);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                if (this.bot_id != 0) {
                    NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
                } else {
                    NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
                }
                this.listView.adapter.update(false);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                if (this.bot_id != 0) {
                    NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
                } else {
                    NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
                int i = 0;
                if (this.bot_id != 0) {
                    BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
                    ArrayList transactions = botStarsController.getTransactions(this.bot_id, this.type);
                    int size = transactions.size();
                    while (i < size) {
                        Object obj = transactions.get(i);
                        i++;
                        arrayList.add(StarsTransactionView.Factory.asTransaction((TL_stars.StarsTransaction) obj, true));
                    }
                    if (botStarsController.didFullyLoadTransactions(this.bot_id, this.type)) {
                        return;
                    }
                    arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                    arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                    arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                    return;
                }
                StarsController starsController = StarsController.getInstance(this.currentAccount, this.ton);
                ArrayList arrayList2 = starsController.transactions[this.type];
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    arrayList.add(StarsTransactionView.Factory.asTransaction((TL_stars.StarsTransaction) obj2, false));
                }
                if (starsController.didFullyLoadTransactions(this.type)) {
                    return;
                }
                arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                arrayList.add(UItem.asFlicker(arrayList.size(), 7));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void onClick(UItem uItem, View view, int i, float f, float f2) {
                if (uItem.object instanceof TL_stars.StarsTransaction) {
                    StarsIntroActivity.showTransactionSheet(getContext(), false, 0L, this.currentAccount, (TL_stars.StarsTransaction) uItem.object, this.resourcesProvider);
                }
            }
        }
    }

    public static class StarsTransactionView extends LinearLayout {
        public static HashMap cachedPlatformDrawables;
        private final TextView amountTextView;
        private final AvatarDrawable avatarDrawable;
        private Runnable cancelCurrentGift;
        private final int currentAccount;
        private final TextView dateTextView;
        private final LinearLayout.LayoutParams dateTextViewParams;
        private final BackupImageView imageView;
        private final BackupImageView imageView2;
        private final FrameLayout imageViewContainer;
        private int imageViewCount;
        private boolean needDivider;
        private final SpannableString star;
        private final TextView subtitleTextView;
        private final LinearLayout textLayout;
        private boolean threeLines;
        private final TextView titleTextView;
        private final LinearLayout.LayoutParams titleTextViewParams;
        private final SpannableString ton;

        public StarsTransactionView(Context context, int i, final Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.imageViewCount = 1;
            this.currentAccount = i;
            setOrientation(0);
            FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.Stars.StarsIntroActivity.StarsTransactionView.1
                private final Paint backgroundPaint = new Paint(1);

                @Override // android.view.ViewGroup
                protected boolean drawChild(Canvas canvas, View view, long j) {
                    if (StarsTransactionView.this.imageViewCount > 1) {
                        this.backgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                        rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.backgroundPaint);
                    }
                    return super.drawChild(canvas, view, j);
                }
            };
            this.imageViewContainer = frameLayout;
            addView(frameLayout, LayoutHelper.createLinear(72, -1, 0.0f, 115));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView2 = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(46.0f));
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.imageView = backupImageView2;
            backupImageView2.setRoundRadius(AndroidUtilities.dp(46.0f));
            frameLayout.addView(backupImageView2, LayoutHelper.createFrame(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setGravity(19);
            addView(linearLayout, LayoutHelper.createLinear(-2, -1, 1.0f, 119));
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setTextSize(1, 16.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setSingleLine(true);
            LinearLayout.LayoutParams createLinear = LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 4.33f);
            this.titleTextViewParams = createLinear;
            linearLayout.addView(textView, createLinear);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleTextView = linksTextView;
            linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setEllipsize(truncateAt);
            linksTextView.setSingleLine(true);
            linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.33f));
            TextView textView2 = new TextView(context);
            this.dateTextView = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView2.setTextSize(1, 14.0f);
            textView2.setEllipsize(truncateAt);
            textView2.setSingleLine(true);
            LinearLayout.LayoutParams createLinear2 = LayoutHelper.createLinear(-1, -2);
            this.dateTextViewParams = createLinear2;
            linearLayout.addView(textView2, createLinear2);
            TextView textView3 = new TextView(context);
            this.amountTextView = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 15.3f);
            textView3.setGravity(5);
            addView(textView3, LayoutHelper.createLinear(-2, -2, 0.0f, 21, 8, 0, 20, 0));
            SpannableString spannableString = new SpannableString("⭐️");
            this.star = spannableString;
            Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
            mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
            spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
            SpannableString spannableString2 = new SpannableString("TON");
            this.ton = spannableString2;
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
            coloredImageSpan.setSize(AndroidUtilities.dp(18.0f));
            coloredImageSpan.setTranslateY(AndroidUtilities.dp(0.5f));
            spannableString2.setSpan(coloredImageSpan, 0, spannableString2.length(), 33);
        }

        public static CombinedDrawable getPlatformDrawable(String str) {
            return getPlatformDrawable(str, 44);
        }

        public static CombinedDrawable getPlatformDrawable(String str, int i) {
            if (i != 44) {
                return SessionCell.createDrawable(i, str);
            }
            if (cachedPlatformDrawables == null) {
                cachedPlatformDrawables = new HashMap();
            }
            CombinedDrawable combinedDrawable = (CombinedDrawable) cachedPlatformDrawables.get(str);
            if (combinedDrawable != null) {
                return combinedDrawable;
            }
            HashMap hashMap = cachedPlatformDrawables;
            CombinedDrawable createDrawable = SessionCell.createDrawable(44, str);
            hashMap.put(str, createDrawable);
            return createDrawable;
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x07f9  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x07fc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void set(TL_stars.StarsTransaction starsTransaction, boolean z, boolean z2) {
            int i;
            char c;
            boolean z3;
            String str;
            ImageLocation imageLocation;
            ImageLocation forDocument;
            long j;
            long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
            boolean z4 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
            int i2 = starsTransaction.flags;
            Integer num = 0;
            boolean z5 = (131072 & i2) == 0 && (i2 & 65536) != 0;
            boolean z6 = !(peerDialogId == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
            this.threeLines = z6;
            this.titleTextViewParams.bottomMargin = z6 ? 0 : AndroidUtilities.dp(4.33f);
            this.subtitleTextView.setVisibility(this.threeLines ? 0 : 8);
            this.dateTextView.setTextSize(1, this.threeLines ? 13.0f : 14.0f);
            this.dateTextView.setText(LocaleController.formatShortDateTime(starsTransaction.date));
            if (starsTransaction.refund) {
                TextView textView = this.dateTextView;
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsRefunded)));
            } else if (starsTransaction.failed) {
                TextView textView2 = this.dateTextView;
                textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.StarsFailed)));
            } else if (starsTransaction.pending) {
                TextView textView3 = this.dateTextView;
                textView3.setText(TextUtils.concat(textView3.getText(), " — ", LocaleController.getString(R.string.StarsPending)));
            }
            Runnable runnable = this.cancelCurrentGift;
            if (runnable != null) {
                runnable.run();
                this.cancelCurrentGift = null;
            }
            this.imageView.setTranslationX(0.0f);
            this.imageView.setTranslationY(0.0f);
            this.imageView2.setVisibility(8);
            this.imageView.setRoundRadius(AndroidUtilities.dp(46.0f));
            if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
                this.imageView.setImageDrawable(new StarGiftSheet.StarGiftDrawableIcon(this.imageView, starsTransaction.stargift, 46, 0.25f));
                this.titleTextView.setText(LocaleController.getString(R.string.Gift2TransactionUpgraded));
                this.subtitleTextView.setVisibility(8);
            } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
                this.imageView.setImageDrawable(new StarGiftSheet.StarGiftDrawableIcon(this.imageView, starsTransaction.stargift, 46, 0.25f));
                this.titleTextView.setText(LocaleController.getString(R.string.Gift2TransactionRemovedDescription));
                this.subtitleTextView.setVisibility(8);
            } else if (starsTransaction.posts_search) {
                this.imageView.setImageDrawable(getPlatformDrawable("search"));
                this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionPostsSearch));
                this.subtitleTextView.setVisibility(8);
            } else {
                if (peerDialogId != 0) {
                    if (UserObject.isService(peerDialogId)) {
                        str = LocaleController.getString(R.string.StarsTransactionUnknown);
                        this.imageView.setImageDrawable(getPlatformDrawable("fragment"));
                        z3 = false;
                    } else if (peerDialogId >= 0) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                        z3 = user == null;
                        this.avatarDrawable.setInfo(user);
                        this.imageView.setForUserOrChat(user, this.avatarDrawable);
                        str = UserObject.getUserName(user);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        z3 = chat == null;
                        this.avatarDrawable.setInfo(chat);
                        this.imageView.setForUserOrChat(chat, this.avatarDrawable);
                        str = chat == null ? "" : chat.title;
                    }
                    if (starsTransaction.stargift != null) {
                        ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(this.subtitleTextView, this.currentAccount, 16.0f);
                        imageReceiverSpan.setRoundRadius(4.0f);
                        imageReceiverSpan.enableShadow(false);
                        SpannableString spannableString = new SpannableString("x");
                        spannableString.setSpan(imageReceiverSpan, 0, 1, 33);
                        StarsIntroActivity.setGiftImage(imageReceiverSpan.imageReceiver, starsTransaction.stargift, 16);
                        this.titleTextView.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(starsTransaction.stargift.getDocument(), this.subtitleTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftOffer));
                            } else {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftOfferRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            this.subtitleTextView.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(starsTransaction.stargift.getDocument(), this.subtitleTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftPurchase));
                            } else {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftPurchaseRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            this.subtitleTextView.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            this.subtitleTextView.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade)));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            this.subtitleTextView.setText(LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftTransferRefund : R.string.StarGiftTransactionGiftTransfer));
                        } else if (starsTransaction.refund) {
                            this.subtitleTextView.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionRefundedAuctionBid : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted)));
                        } else {
                            this.subtitleTextView.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionAuctionBid : starsTransaction.amount.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent)));
                        }
                    } else if (starsTransaction.subscription) {
                        this.titleTextView.setText(str);
                        int i3 = starsTransaction.subscription_period;
                        if (i3 == 2592000) {
                            this.subtitleTextView.setVisibility(0);
                            this.subtitleTextView.setText(LocaleController.getString(R.string.StarsTransactionSubscriptionMonthly));
                        } else {
                            String str2 = i3 == 300 ? "5 minutes" : "Minute";
                            this.subtitleTextView.setVisibility(0);
                            this.subtitleTextView.setText(String.format(Locale.US, "%s subscription fee", str2));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        this.titleTextView.setText(str);
                        this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                        this.subtitleTextView.setText(LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee));
                    } else if (starsTransaction.paid_message) {
                        this.titleTextView.setText(str);
                        this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                        this.subtitleTextView.setText(LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        this.titleTextView.setText(str);
                        this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                        this.subtitleTextView.setText(LocaleController.getString(R.string.StarsTransactionPremiumGift));
                    } else if (z5) {
                        this.titleTextView.setText(str);
                        this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                        this.subtitleTextView.setText(LocaleController.formatString(R.string.StarTransactionCommission, AffiliateProgramFragment.percents(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        this.titleTextView.setText(str);
                        this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                        this.subtitleTextView.setText(LocaleController.getString(R.string.StarsGiftReceived));
                    } else if ((starsTransaction.flags & 8192) != 0) {
                        this.titleTextView.setText(str);
                        this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                        this.subtitleTextView.setText(LocaleController.getString(R.string.StarsGiveawayPrizeReceived));
                    } else if (starsTransaction.reaction) {
                        this.titleTextView.setText(str);
                        this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                        this.subtitleTextView.setText(LocaleController.getString(R.string.StarsReactionsSent));
                    } else if (!starsTransaction.extended_media.isEmpty()) {
                        if (z) {
                            this.titleTextView.setText(str);
                            this.subtitleTextView.setVisibility(0);
                            this.subtitleTextView.setText(LocaleController.getString(R.string.StarMediaPurchase));
                        } else {
                            this.titleTextView.setText(LocaleController.getString(R.string.StarMediaPurchase));
                            this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                            this.subtitleTextView.setText(str);
                        }
                        this.imageViewCount = 0;
                        int i4 = 0;
                        while (i4 < Math.min(2, starsTransaction.extended_media.size())) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i4);
                            BackupImageView backupImageView = i4 == 0 ? this.imageView : this.imageView2;
                            backupImageView.setRoundRadius(AndroidUtilities.dp(12.0f));
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(46.0f), true), messageMedia.photo);
                            } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(46.0f), true), messageMedia.document);
                            } else {
                                imageLocation = null;
                                backupImageView.setVisibility(0);
                                Integer num2 = num;
                                backupImageView.setImage(imageLocation, "46_46", (ImageLocation) null, (String) null, (Drawable) null, num2);
                                this.imageViewCount++;
                                i4++;
                                num = num2;
                            }
                            imageLocation = forDocument;
                            backupImageView.setVisibility(0);
                            Integer num22 = num;
                            backupImageView.setImage(imageLocation, "46_46", (ImageLocation) null, (String) null, (Drawable) null, num22);
                            this.imageViewCount++;
                            i4++;
                            num = num22;
                        }
                        i = 8;
                        int i5 = 0;
                        while (i5 < this.imageViewCount) {
                            BackupImageView backupImageView2 = i5 == 0 ? this.imageView : this.imageView2;
                            float f = i5;
                            backupImageView2.setTranslationX(AndroidUtilities.dp(2.0f) + ((f - (this.imageViewCount / 2.0f)) * AndroidUtilities.dp(4.33f)));
                            backupImageView2.setTranslationY((f - (this.imageViewCount / 2.0f)) * AndroidUtilities.dp(4.33f));
                            i5++;
                        }
                        c = 2;
                    } else {
                        i = 8;
                        if (starsTransaction.photo != null) {
                            c = 2;
                            ImageReceiverSpan imageReceiverSpan2 = new ImageReceiverSpan(this.subtitleTextView, this.currentAccount, 14.0f);
                            imageReceiverSpan2.setRoundRadius(4.0f);
                            imageReceiverSpan2.enableShadow(false);
                            SpannableString spannableString2 = new SpannableString("x");
                            spannableString2.setSpan(imageReceiverSpan2, 0, 1, 33);
                            imageReceiverSpan2.imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "14_14", null, null, num, 0);
                            this.titleTextView.setText(str);
                            this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                            TextView textView4 = this.subtitleTextView;
                            String str3 = starsTransaction.title;
                            if (str3 == null) {
                                str3 = "";
                            }
                            textView4.setText(Emoji.replaceEmoji(TextUtils.concat(spannableString2, " ", str3), this.subtitleTextView.getPaint().getFontMetricsInt(), false));
                        } else {
                            c = 2;
                            this.titleTextView.setText(str);
                            this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                            TextView textView5 = this.subtitleTextView;
                            String str4 = starsTransaction.title;
                            if (str4 == null) {
                                str4 = "";
                            }
                            textView5.setText(Emoji.replaceEmoji(str4, textView5.getPaint().getFontMetricsInt(), false));
                        }
                    }
                } else {
                    i = 8;
                    c = 2;
                    if (starsTransaction.floodskip) {
                        this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionFloodskip));
                        this.subtitleTextView.setText(LocaleController.formatPluralStringComma("StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        this.imageView.setImageDrawable(getPlatformDrawable("api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            this.imageView.setImageDrawable(getPlatformDrawable("ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            this.imageView.setImageDrawable(getPlatformDrawable("android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                this.titleTextView.setText(LocaleController.getString(R.string.StarsGiftReceived));
                                this.subtitleTextView.setText(LocaleController.getString(z4 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown));
                                this.subtitleTextView.setVisibility(0);
                            } else {
                                this.titleTextView.setText(LocaleController.getString((z || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                            }
                            this.imageView.setImageDrawable(getPlatformDrawable("fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionBot));
                            this.imageView.setImageDrawable(getPlatformDrawable("premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                            this.imageView.setImageDrawable(getPlatformDrawable("?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionAds));
                            this.imageView.setImageDrawable(getPlatformDrawable("ads"));
                        } else {
                            this.titleTextView.setText("");
                            this.imageView.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j = starsAmount.amount;
                if (j <= 0 || (j == 0 && starsAmount.nanos > 0)) {
                    this.amountTextView.setVisibility(0);
                    this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_green));
                    TextView textView6 = this.amountTextView;
                    CharSequence formatStarsAmount = StarsIntroActivity.formatStarsAmount(starsTransaction.amount);
                    SpannableString spannableString3 = !z4 ? this.ton : this.star;
                    CharSequence[] charSequenceArr = new CharSequence[4];
                    charSequenceArr[0] = "+";
                    charSequenceArr[1] = formatStarsAmount;
                    charSequenceArr[c] = " ";
                    charSequenceArr[3] = spannableString3;
                    textView6.setText(TextUtils.concat(charSequenceArr));
                } else if (j < 0 || (j == 0 && starsAmount.nanos < 0)) {
                    this.amountTextView.setVisibility(0);
                    this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_red));
                    TextView textView7 = this.amountTextView;
                    CharSequence formatStarsAmount2 = StarsIntroActivity.formatStarsAmount(starsTransaction.amount);
                    SpannableString spannableString4 = z4 ? this.ton : this.star;
                    CharSequence[] charSequenceArr2 = new CharSequence[3];
                    charSequenceArr2[0] = formatStarsAmount2;
                    charSequenceArr2[1] = " ";
                    charSequenceArr2[c] = spannableString4;
                    textView7.setText(TextUtils.concat(charSequenceArr2));
                } else {
                    this.amountTextView.setVisibility(i);
                }
                this.needDivider = z2;
                setWillNotDraw(!z2);
            }
            i = 8;
            c = 2;
            TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
            j = starsAmount2.amount;
            if (j <= 0) {
            }
            this.amountTextView.setVisibility(0);
            this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_green));
            TextView textView62 = this.amountTextView;
            CharSequence formatStarsAmount3 = StarsIntroActivity.formatStarsAmount(starsTransaction.amount);
            if (!z4) {
            }
            CharSequence[] charSequenceArr3 = new CharSequence[4];
            charSequenceArr3[0] = "+";
            charSequenceArr3[1] = formatStarsAmount3;
            charSequenceArr3[c] = " ";
            charSequenceArr3[3] = spannableString3;
            textView62.setText(TextUtils.concat(charSequenceArr3));
            this.needDivider = z2;
            setWillNotDraw(!z2);
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.threeLines ? 71.0f : 58.0f), TLObject.FLAG_30));
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public StarsTransactionView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                StarsTransactionView starsTransactionView = (StarsTransactionView) getCached();
                return starsTransactionView != null ? starsTransactionView : new StarsTransactionView(context, i, resourcesProvider);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((StarsTransactionView) view).set((TL_stars.StarsTransaction) uItem.object, uItem.accent, z);
            }

            public static UItem asTransaction(TL_stars.StarsTransaction starsTransaction, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = starsTransaction;
                ofFactory.accent = z;
                return ofFactory;
            }
        }
    }

    public static class StarsSubscriptionView extends LinearLayout {
        private final int currentAccount;
        public final BackupImageView imageView;
        private boolean needDivider;
        public final LinearLayout priceLayout;
        public final TextView priceSubtitleView;
        public final TextView priceTitleView;
        public final TextView productView;
        private final Theme.ResourcesProvider resourcesProvider;
        public final TextView subtitleView;
        public final LinearLayout textLayout;
        private boolean threeLines;
        public final SimpleTextView titleView;

        public StarsSubscriptionView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            setOrientation(0);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(46.0f));
            addView(backupImageView, LayoutHelper.createLinear(46, 46, 0.0f, 19, 13, 0, 13, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 16, 0, 0, 0, 0));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleView = simpleTextView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            simpleTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            simpleTextView.setTextSize(16);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            NotificationCenter.listenEmojiLoading(simpleTextView);
            linearLayout.addView(simpleTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 2.0f));
            TextView textView = new TextView(context);
            this.productView = textView;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setTextSize(1, 13.0f);
            textView.setVisibility(8);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 1.0f));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            int i3 = Theme.key_windowBackgroundWhiteGrayText2;
            textView2.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView2.setTextSize(1, 14.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.priceLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 0, 18, 0));
            TextView textView3 = new TextView(context);
            this.priceTitleView = textView3;
            textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(5);
            linearLayout2.addView(textView3, LayoutHelper.createLinear(-1, -2, 5, 0, 0, 0, 1));
            TextView textView4 = new TextView(context);
            this.priceSubtitleView = textView4;
            textView4.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView4.setTextSize(1, 13.0f);
            textView4.setGravity(5);
            linearLayout2.addView(textView4, LayoutHelper.createLinear(-1, -2, 5, 0, 0, 0, 0));
        }

        public void set(TL_stars.StarsSubscription starsSubscription, boolean z) {
            boolean z2;
            String str;
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            this.threeLines = !TextUtils.isEmpty(starsSubscription.title);
            if (peerDialogId < 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(chat);
                this.imageView.setForUserOrChat(chat, avatarDrawable);
                str = chat != null ? chat.title : null;
                z2 = false;
            } else {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                avatarDrawable2.setInfo(user);
                this.imageView.setForUserOrChat(user, avatarDrawable2);
                String userName = UserObject.getUserName(user);
                z2 = !UserObject.isBot(user);
                str = userName;
            }
            long currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            SimpleTextView simpleTextView = this.titleView;
            simpleTextView.setText(Emoji.replaceEmoji(str, simpleTextView.getPaint().getFontMetricsInt(), false));
            if (!TextUtils.isEmpty(starsSubscription.title)) {
                this.productView.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starsSubscription.photo != null) {
                    ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(this.productView, this.currentAccount, 14.0f);
                    imageReceiverSpan.setRoundRadius(4.0f);
                    imageReceiverSpan.enableShadow(false);
                    SpannableString spannableString = new SpannableString("x");
                    spannableString.setSpan(imageReceiverSpan, 0, 1, 33);
                    imageReceiverSpan.imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                    spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                }
                spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, this.titleView.getPaint().getFontMetricsInt(), false));
                this.productView.setText(spannableStringBuilder);
            } else {
                this.productView.setVisibility(8);
            }
            this.subtitleView.setTextSize(1, this.threeLines ? 13.0f : 14.0f);
            if (starsSubscription.canceled || starsSubscription.bot_canceled) {
                TextView textView = this.subtitleView;
                long j = starsSubscription.until_date;
                textView.setText(LocaleController.formatString(j < currentTime ? R.string.StarsSubscriptionExpired : R.string.StarsSubscriptionExpires, LocaleController.formatDateChat(j)));
                this.priceTitleView.setVisibility(8);
                this.priceSubtitleView.setTextColor(Theme.getColor(Theme.key_color_red, this.resourcesProvider));
                this.priceSubtitleView.setText(LocaleController.getString(starsSubscription.bot_canceled ? z2 ? R.string.StarsSubscriptionStatusBizCancelled : R.string.StarsSubscriptionStatusBotCancelled : R.string.StarsSubscriptionStatusCancelled));
            } else {
                long j2 = starsSubscription.until_date;
                if (j2 < currentTime) {
                    this.subtitleView.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j2)));
                    this.priceTitleView.setVisibility(8);
                    this.priceSubtitleView.setTextColor(Theme.getColor(Theme.key_color_red, this.resourcesProvider));
                    this.priceSubtitleView.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
                } else {
                    this.subtitleView.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j2)));
                    this.priceTitleView.setVisibility(0);
                    this.priceTitleView.setText(StarsIntroActivity.replaceStarsWithPlain("⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f));
                    this.priceSubtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider));
                    int i = starsSubscription.pricing.period;
                    if (i == 2592000) {
                        this.priceSubtitleView.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                    } else if (i == 60) {
                        this.priceSubtitleView.setText("per minute");
                    } else if (i == 300) {
                        this.priceSubtitleView.setText("per 5 minutes");
                    }
                }
            }
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.threeLines ? 68.0f : 58.0f), TLObject.FLAG_30));
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public StarsSubscriptionView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                StarsSubscriptionView starsSubscriptionView = (StarsSubscriptionView) getCached();
                return starsSubscriptionView != null ? starsSubscriptionView : new StarsSubscriptionView(context, i, resourcesProvider);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((StarsSubscriptionView) view).set((TL_stars.StarsSubscription) uItem.object, z);
            }

            public static UItem asSubscription(TL_stars.StarsSubscription starsSubscription) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = starsSubscription;
                return ofFactory;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean equals(UItem uItem, UItem uItem2) {
                if (uItem == null && uItem2 == null) {
                    return true;
                }
                if (uItem != null && uItem2 != null) {
                    Object obj = uItem.object;
                    if (obj instanceof TL_stars.StarsSubscription) {
                        Object obj2 = uItem2.object;
                        if (obj2 instanceof TL_stars.StarsSubscription) {
                            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
                        }
                    }
                }
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x040c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BottomSheet openConfirmPurchaseSheet(final Context context, Theme.ResourcesProvider resourcesProvider, int i, MessageObject messageObject, long j, String str, long j2, TLRPC.WebDocument webDocument, int i2, final Utilities.Callback callback, final Runnable runnable) {
        ViewGroup viewGroup;
        float f;
        TLRPC.Message message;
        String str2;
        boolean z;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i3;
        int i4;
        int i5;
        String formatPluralString;
        String formatPluralString2;
        String str3;
        char c;
        String formatPluralString3;
        char c2;
        String formatPluralString4;
        boolean z2;
        int i6;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        BackupImageView backupImageView;
        ImageLocation imageLocation;
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(makeParticlesView(context, 40, 0), LayoutHelper.createFrame(-1, -1.0f));
        if (messageObject != null) {
            f = 16.0f;
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                BackupImageView backupImageView2 = new BackupImageView(context, context) { // from class: org.telegram.ui.Stars.StarsIntroActivity.6
                    private Path clipPath = new Path();
                    private RectF clipRect = new RectF();
                    private Drawable lock;
                    private SpoilerEffect2 spoilerEffect2;
                    final /* synthetic */ Context val$context;

                    {
                        this.val$context = context;
                        this.lock = context.getResources().getDrawable(R.drawable.large_locked_post).mutate();
                    }

                    @Override // android.view.View
                    protected void dispatchDraw(Canvas canvas) {
                        6 r3;
                        Canvas canvas2;
                        super.dispatchDraw(canvas);
                        if (this.spoilerEffect2 == null) {
                            this.spoilerEffect2 = SpoilerEffect2.getInstance(this);
                        }
                        if (this.spoilerEffect2 != null) {
                            this.clipRect.set(0.0f, 0.0f, getWidth(), getHeight());
                            this.clipPath.rewind();
                            this.clipPath.addRoundRect(this.clipRect, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), Path.Direction.CW);
                            canvas.save();
                            canvas.clipPath(this.clipPath);
                            r3 = this;
                            canvas2 = canvas;
                            this.spoilerEffect2.draw(canvas2, r3, getWidth(), getHeight(), 1.0f);
                            canvas2.restore();
                        } else {
                            r3 = this;
                            canvas2 = canvas;
                        }
                        r3.lock.setBounds((getWidth() - r3.lock.getIntrinsicWidth()) / 2, (getHeight() - r3.lock.getIntrinsicHeight()) / 2, (getWidth() + r3.lock.getIntrinsicWidth()) / 2, (getHeight() + r3.lock.getIntrinsicHeight()) / 2);
                        r3.lock.draw(canvas2);
                    }

                    @Override // org.telegram.ui.Components.BackupImageView, android.view.View
                    protected void onAttachedToWindow() {
                        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
                        if (spoilerEffect2 != null) {
                            spoilerEffect2.attach(this);
                        }
                        super.onAttachedToWindow();
                    }

                    @Override // org.telegram.ui.Components.BackupImageView, android.view.View
                    protected void onDetachedFromWindow() {
                        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
                        if (spoilerEffect2 != null) {
                            spoilerEffect2.detach(this);
                        }
                        super.onDetachedFromWindow();
                    }
                };
                backupImageView2.setRoundRadius(AndroidUtilities.dp(24.0f));
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
                if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                    backupImageView = backupImageView2;
                    viewGroup = frameLayout;
                } else {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(0);
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        imageLocation = ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner);
                    } else {
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                imageLocation = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(80.0f), true), messageMedia.photo);
                            } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                imageLocation = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(80.0f), true), messageMedia.document);
                            }
                        }
                        imageLocation = null;
                    }
                    backupImageView = backupImageView2;
                    viewGroup = frameLayout;
                    backupImageView.setImage(imageLocation, "80_80_b2", (ImageLocation) null, (String) null, (Drawable) null, messageObject);
                }
                viewGroup.addView(backupImageView, LayoutHelper.createFrame(80, 80, 17));
                final StarsBalanceView starsBalanceView = new StarsBalanceView(context, i, resourcesProvider);
                ScaleStateListAnimator.apply(starsBalanceView);
                starsBalanceView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda43
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarsIntroActivity.$r8$lambda$mUY6Qqoo42-WFKMz3Ac4XQviAI8(StarsIntroActivity.StarsBalanceView.this, view);
                    }
                });
                viewGroup.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                linearLayout.addView(viewGroup, LayoutHelper.createLinear(-1, 117, 7));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.bold());
                int i7 = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i7, resourcesProvider));
                if (i2 <= 0) {
                    textView.setText(Emoji.replaceEmoji(webDocument != null ? str : LocaleController.getString(R.string.StarsConfirmSubscriptionTitle), textView.getPaint().getFontMetricsInt(), false));
                } else {
                    textView.setText(Emoji.replaceEmoji(webDocument != null ? str : LocaleController.getString(R.string.StarsConfirmPurchaseTitle), textView.getPaint().getFontMetricsInt(), false));
                }
                NotificationCenter.listenEmojiLoading(textView);
                textView.setGravity(17);
                linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider)));
                    BackupImageView backupImageView3 = new BackupImageView(context);
                    backupImageView3.setRoundRadius(AndroidUtilities.dp(14.0f));
                    AvatarDrawable avatarDrawable = new AvatarDrawable();
                    avatarDrawable.setInfo(user2);
                    backupImageView3.setForUserOrChat(user2, avatarDrawable);
                    linearLayout2.addView(backupImageView3, LayoutHelper.createLinear(28, 28));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                    textView2.setText(UserObject.getUserName(user2));
                    linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 10, 0));
                    linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, 28, 1, 0, 8, 0, 2));
                }
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(Theme.getColor(i7, resourcesProvider));
                if (messageObject == null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    long dialogId = messageObject.getDialogId();
                    TLRPC.Message message3 = messageObject.messageOwner;
                    if (message3 != null && (messageFwdHeader = message3.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        dialogId = DialogObject.getPeerDialogId(peer);
                    }
                    if (dialogId < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(i).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                        dialogId = user.id;
                    }
                    if (dialogId >= 0) {
                        TLRPC.User user3 = MessagesController.getInstance(i).getUser(Long.valueOf(dialogId));
                        str2 = UserObject.getUserName(user3);
                        if (user3 != null && user3.bot) {
                            z = true;
                            tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
                            i3 = 0;
                            i4 = 0;
                            int i8 = 0;
                            while (i3 < tL_messageMediaPaidMedia.extended_media.size()) {
                                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i3);
                                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                                    if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).flags & 4) != 0) {
                                        z2 = true;
                                    }
                                    z2 = false;
                                } else {
                                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                                        z2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media instanceof TLRPC.TL_messageMediaDocument;
                                    }
                                    z2 = false;
                                }
                                if (z2) {
                                    i6 = 1;
                                    i4++;
                                } else {
                                    i6 = 1;
                                    i8++;
                                }
                                i3 += i6;
                            }
                            int i9 = 1;
                            if (i4 != 0) {
                                str3 = z ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                int i10 = (int) j2;
                                if (i8 == 1) {
                                    formatPluralString4 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                                    c2 = 0;
                                } else {
                                    c2 = 0;
                                    formatPluralString4 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i8, new Object[0]);
                                }
                                Object[] objArr = new Object[2];
                                objArr[c2] = formatPluralString4;
                                objArr[1] = str2;
                                formatPluralString2 = LocaleController.formatPluralString(str3, i10, objArr);
                            } else if (i8 == 0) {
                                str3 = z ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                int i11 = (int) j2;
                                if (i4 == 1) {
                                    formatPluralString3 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                                    c = 0;
                                } else {
                                    c = 0;
                                    formatPluralString3 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i4, new Object[0]);
                                }
                                Object[] objArr2 = new Object[2];
                                objArr2[c] = formatPluralString3;
                                objArr2[1] = str2;
                                formatPluralString2 = LocaleController.formatPluralString(str3, i11, objArr2);
                            } else {
                                String str4 = z ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                                int i12 = (int) j2;
                                if (i8 == 1) {
                                    formatPluralString = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                                    i5 = 0;
                                } else {
                                    i5 = 0;
                                    formatPluralString = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i8, new Object[0]);
                                    i9 = 1;
                                }
                                String string = i4 == i9 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i4, new Object[i5]);
                                Object[] objArr3 = new Object[3];
                                objArr3[i5] = formatPluralString;
                                objArr3[i9] = string;
                                objArr3[2] = str2;
                                formatPluralString2 = LocaleController.formatPluralString(str4, i12, objArr3);
                            }
                            textView3.setText(AndroidUtilities.replaceTags(formatPluralString2));
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-dialogId));
                        str2 = chat == null ? "" : chat.title;
                    }
                    z = false;
                    tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
                    i3 = 0;
                    i4 = 0;
                    int i82 = 0;
                    while (i3 < tL_messageMediaPaidMedia.extended_media.size()) {
                    }
                    int i92 = 1;
                    if (i4 != 0) {
                    }
                    textView3.setText(AndroidUtilities.replaceTags(formatPluralString2));
                } else if (i2 <= 0) {
                    textView3.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j2, str, UserObject.getUserName(user2))));
                } else {
                    textView3.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j2, str, UserObject.getUserName(user2))));
                }
                textView3.setMaxWidth(HintView2.cutInFancyHalf(textView3.getText(), textView3.getPaint()));
                textView3.setGravity(17);
                linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 18));
                final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
                if (i2 <= 0) {
                    buttonWithCounterView.setText(replaceStars(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j2))), false);
                } else {
                    buttonWithCounterView.setText(replaceStars(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j2))), false);
                }
                linearLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f));
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                linksTextView.setTextSize(1, 14.0f);
                linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i2 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda44
                    @Override // java.lang.Runnable
                    public final void run() {
                        Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
                    }
                }));
                linksTextView.setGravity(17);
                linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 0.0f, 2.0f));
                builder.setCustomView(linearLayout);
                final BottomSheet create = builder.create();
                buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda45
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarsIntroActivity.$r8$lambda$vpIjOReXh8zTLIY2rdvSW-lDLes(Utilities.Callback.this, create, buttonWithCounterView, view);
                    }
                });
                create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda46
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        StarsIntroActivity.$r8$lambda$w4FKhkRtIxAaT0-VafeHKHV_kH8(runnable, dialogInterface);
                    }
                });
                create.fixNavigationBar();
                create.show();
                return create;
            }
            viewGroup = frameLayout;
        } else {
            viewGroup = frameLayout;
            f = 16.0f;
        }
        if (webDocument == null) {
            BackupImageView backupImageView4 = new BackupImageView(context);
            backupImageView4.setRoundRadius(AndroidUtilities.dp(80.0f));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(user2);
            backupImageView4.setForUserOrChat(user2, avatarDrawable2);
            viewGroup.addView(backupImageView4, LayoutHelper.createFrame(80, 80, 17));
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            BackupImageView backupImageView5 = new BackupImageView(context);
            backupImageView5.setRoundRadius(AndroidUtilities.dp(18.0f));
            backupImageView5.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "80_80", (Drawable) null, 0, (Object) null);
            frameLayout2.addView(backupImageView5, LayoutHelper.createFrame(80, 80, 48));
            viewGroup.addView(frameLayout2, LayoutHelper.createFrame(80, 87, 17));
            TextView textView4 = new TextView(context);
            textView4.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(-1);
            textView4.setText(replaceStars("XTR " + LocaleController.formatNumber((int) j2, ','), 0.85f));
            textView4.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView4.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f), -1133566));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), Theme.getColor(Theme.key_dialogBackground, resourcesProvider)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            frameLayout3.addView(textView4, LayoutHelper.createLinear(-2, 16, 119));
            frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-2.0f, 18.66f, 81));
        }
        final StarsBalanceView starsBalanceView2 = new StarsBalanceView(context, i, resourcesProvider);
        ScaleStateListAnimator.apply(starsBalanceView2);
        starsBalanceView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.$r8$lambda$mUY6Qqoo42-WFKMz3Ac4XQviAI8(StarsIntroActivity.StarsBalanceView.this, view);
            }
        });
        viewGroup.addView(starsBalanceView2, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        linearLayout.addView(viewGroup, LayoutHelper.createLinear(-1, 117, 7));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 20.0f);
        textView5.setTypeface(AndroidUtilities.bold());
        int i72 = Theme.key_dialogTextBlack;
        textView5.setTextColor(Theme.getColor(i72, resourcesProvider));
        if (i2 <= 0) {
        }
        NotificationCenter.listenEmojiLoading(textView5);
        textView5.setGravity(17);
        linearLayout.addView(textView5, LayoutHelper.createLinear(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        TextView textView32 = new TextView(context);
        textView32.setTextSize(1, 14.0f);
        textView32.setTextColor(Theme.getColor(i72, resourcesProvider));
        if (messageObject == null) {
        }
        if (i2 <= 0) {
        }
        textView32.setMaxWidth(HintView2.cutInFancyHalf(textView32.getText(), textView32.getPaint()));
        textView32.setGravity(17);
        linearLayout.addView(textView32, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 18));
        final ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider);
        if (i2 <= 0) {
        }
        linearLayout.addView(buttonWithCounterView2, LayoutHelper.createFrame(-1, 48.0f));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i2 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
            }
        }));
        linksTextView2.setGravity(17);
        linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 0.0f, 2.0f));
        builder.setCustomView(linearLayout);
        final BottomSheet create2 = builder.create();
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.$r8$lambda$vpIjOReXh8zTLIY2rdvSW-lDLes(Utilities.Callback.this, create2, buttonWithCounterView2, view);
            }
        });
        create2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda46
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StarsIntroActivity.$r8$lambda$w4FKhkRtIxAaT0-VafeHKHV_kH8(runnable, dialogInterface);
            }
        });
        create2.fixNavigationBar();
        create2.show();
        return create2;
    }

    public static /* synthetic */ void $r8$lambda$mUY6Qqoo42-WFKMz3Ac4XQviAI8(StarsBalanceView starsBalanceView, View view) {
        BaseFragment lastFragment;
        if (starsBalanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
        }
    }

    public static /* synthetic */ void $r8$lambda$vpIjOReXh8zTLIY2rdvSW-lDLes(Utilities.Callback callback, final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, View view) {
        if (callback != null) {
            bottomSheet.setCanDismissWithSwipe(false);
            buttonWithCounterView.setLoading(true);
            callback.run(new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda59
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    StarsIntroActivity.$r8$lambda$K77avHa9Rwc1kDpemc6ka6K4cnM(BottomSheet.this, buttonWithCounterView, (Boolean) obj);
                }
            });
            return;
        }
        bottomSheet.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$K77avHa9Rwc1kDpemc6ka6K4cnM(final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, Boolean bool) {
        if (bool.booleanValue()) {
            bottomSheet.dismiss();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda76
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.$r8$lambda$bGnYDScq0MjNpc_G0Ilw5ZT_LYE(BottomSheet.this, buttonWithCounterView);
                }
            }, 400L);
        }
    }

    public static /* synthetic */ void $r8$lambda$bGnYDScq0MjNpc_G0Ilw5ZT_LYE(BottomSheet bottomSheet, ButtonWithCounterView buttonWithCounterView) {
        bottomSheet.setCanDismissWithSwipe(false);
        buttonWithCounterView.setLoading(false);
    }

    public static /* synthetic */ void $r8$lambda$w4FKhkRtIxAaT0-VafeHKHV_kH8(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static BottomSheet openStarsChannelInviteSheet(final Context context, Theme.ResourcesProvider resourcesProvider, int i, TLRPC.ChatInvite chatInvite, final Utilities.Callback callback, final Runnable runnable) {
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(makeParticlesView(context, 40, 0), LayoutHelper.createFrame(-1, -1.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(80.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setPeerColor(chatInvite.color);
        avatarDrawable.setText(chatInvite.title);
        TLRPC.Photo photo = chatInvite.photo;
        if (photo != null) {
            backupImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", avatarDrawable, chatInvite);
        } else {
            backupImageView.setImageDrawable(avatarDrawable);
        }
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(80, 80, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        int i2 = Theme.key_dialogBackground;
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, LayoutHelper.createFrame(26, 26, 17));
        imageView.setTranslationX(AndroidUtilities.dp(26.0f));
        imageView.setTranslationY(AndroidUtilities.dp(26.0f));
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, LayoutHelper.createFrame(26, 26, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
        final StarsBalanceView starsBalanceView = new StarsBalanceView(context, i, resourcesProvider);
        ScaleStateListAnimator.apply(starsBalanceView);
        starsBalanceView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.$r8$lambda$3DQ58Z8O7JOUMF1JDyPIPT8HuYQ(StarsIntroActivity.StarsBalanceView.this, view);
            }
        });
        frameLayout.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 117, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i3 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i3, resourcesProvider));
        textView.setText(LocaleController.getString(R.string.StarsSubscribeTitle));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(i3, resourcesProvider));
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
        int i4 = tL_starsSubscriptionPricing.period;
        if (i4 == 2592000) {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
        } else {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, i4 == 300 ? "5 minutes" : "a minute")));
        }
        textView2.setMaxWidth(HintView2.cutInFancyHalf(textView2.getText(), textView2.getPaint()));
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 22));
        if (!TextUtils.isEmpty(chatInvite.about)) {
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView3.setText(Emoji.replaceEmoji(chatInvite.about, textView3.getPaint().getFontMetricsInt(), false));
            textView3.setGravity(17);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 22));
        }
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.StarsSubscribeButton), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda87
            @Override // java.lang.Runnable
            public final void run() {
                Browser.openUrl(context, LocaleController.getString(R.string.StarsSubscribeInfoLink));
            }
        }));
        linksTextView.setGravity(17);
        linksTextView.setTextSize(1, 13.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 49, 14, 14, 14, 6));
        builder.setCustomView(linearLayout);
        final BottomSheet create = builder.create();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.$r8$lambda$s2eX6YGfcp0ExqVgIcYOP7jBPFw(Utilities.Callback.this, create, buttonWithCounterView, view);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda89
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StarsIntroActivity.$r8$lambda$FveBt0RZL2ASfWZl8Ig9iYOYCbY(runnable, dialogInterface);
            }
        });
        create.fixNavigationBar(Theme.getColor(i2, resourcesProvider));
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet() && safeLastFragment != null && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
            create.makeAttached(safeLastFragment);
        }
        create.show();
        return create;
    }

    public static /* synthetic */ void $r8$lambda$3DQ58Z8O7JOUMF1JDyPIPT8HuYQ(StarsBalanceView starsBalanceView, View view) {
        BaseFragment lastFragment;
        if (starsBalanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
        }
    }

    public static /* synthetic */ void $r8$lambda$s2eX6YGfcp0ExqVgIcYOP7jBPFw(Utilities.Callback callback, final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, View view) {
        if (callback != null) {
            bottomSheet.setCanDismissWithSwipe(false);
            buttonWithCounterView.setLoading(true);
            callback.run(new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda96
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    StarsIntroActivity.$r8$lambda$JRR6PFwiWj5tVezMdJ3uZhRENKU(BottomSheet.this, buttonWithCounterView, (Boolean) obj);
                }
            });
            return;
        }
        bottomSheet.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$JRR6PFwiWj5tVezMdJ3uZhRENKU(final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, Boolean bool) {
        if (bool.booleanValue()) {
            bottomSheet.dismiss();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda97
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.$r8$lambda$u-EYXk9CvtRo81sov3k2iYxLQ08(BottomSheet.this, buttonWithCounterView);
                }
            }, 400L);
        }
    }

    public static /* synthetic */ void $r8$lambda$u-EYXk9CvtRo81sov3k2iYxLQ08(BottomSheet bottomSheet, ButtonWithCounterView buttonWithCounterView) {
        bottomSheet.setCanDismissWithSwipe(false);
        buttonWithCounterView.setLoading(false);
    }

    public static /* synthetic */ void $r8$lambda$FveBt0RZL2ASfWZl8Ig9iYOYCbY(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static class StarsOptionsSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private final int BUTTON_EXPAND;
        private UniversalAdapter adapter;
        private boolean expanded;
        private final FireworksOverlay fireworksOverlay;
        private final FrameLayout footerView;

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if ((i == NotificationCenter.starOptionsLoaded || i == NotificationCenter.starBalanceUpdated) && (universalAdapter = this.adapter) != null) {
                universalAdapter.update(true);
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
        public void show() {
            long j = StarsController.getInstance(this.currentAccount).getBalance().amount;
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.isKeyboardVisible() && chatActivity.getChatActivityEnterView() != null) {
                    chatActivity.getChatActivityEnterView().closeKeyboard();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet
        public void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        public StarsOptionsSheet(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, null, false, false, false, resourcesProvider);
            this.BUTTON_EXPAND = -1;
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsOptionsSheet$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                public final void onItemClick(View view, int i2) {
                    StarsIntroActivity.StarsOptionsSheet.$r8$lambda$IxG8OmiCqjvDUj2D6h4xui4HZDc(StarsIntroActivity.StarsOptionsSheet.this, view, i2);
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            int i2 = Theme.key_windowBackgroundWhite;
            setBackgroundColor(Theme.getColor(i2, resourcesProvider));
            fixNavigationBar(Theme.getColor(i2, resourcesProvider));
            this.actionBar.setTitle(getTitle());
            FrameLayout frameLayout = new FrameLayout(context);
            this.footerView = frameLayout;
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsOptionsSheet$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Browser.openUrl(StarsIntroActivity.StarsOptionsSheet.this.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                }
            }));
            linksTextView.setGravity(17);
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
            frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -1, 17));
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
            this.fireworksOverlay = fireworksOverlay;
            this.containerView.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(false);
            }
        }

        public static /* synthetic */ void $r8$lambda$IxG8OmiCqjvDUj2D6h4xui4HZDc(StarsOptionsSheet starsOptionsSheet, View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = starsOptionsSheet.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            starsOptionsSheet.onItemClick(item, starsOptionsSheet.adapter);
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected CharSequence getTitle() {
            return LocaleController.getString(R.string.StarsBuy);
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsOptionsSheet$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    StarsIntroActivity.StarsOptionsSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.setApplyBackground(false);
            return this.adapter;
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.TelegramStarsChoose)));
            ArrayList options = StarsController.getInstance(this.currentAccount).getOptions();
            if (options != null && !options.isEmpty()) {
                int i = 0;
                int i2 = 1;
                for (int i3 = 0; i3 < options.size(); i3++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) options.get(i3);
                    if (!tL_starsTopupOption.extended || this.expanded) {
                        arrayList.add(StarTierView.Factory.asStarTier(i3, i2, tL_starsTopupOption));
                        i2++;
                    } else {
                        i++;
                    }
                }
                boolean z = this.expanded;
                if (!z && i > 0) {
                    arrayList.add(ExpandView.Factory.asExpand(-1, LocaleController.getString(z ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions), !this.expanded).accent());
                }
            } else {
                arrayList.add(UItem.asFlicker(31));
                arrayList.add(UItem.asFlicker(31));
                arrayList.add(UItem.asFlicker(31));
                arrayList.add(UItem.asFlicker(31));
                arrayList.add(UItem.asFlicker(31));
            }
            arrayList.add(UItem.asCustom(this.footerView));
        }

        public void onItemClick(final UItem uItem, UniversalAdapter universalAdapter) {
            if (uItem.id == -1) {
                this.expanded = !this.expanded;
                universalAdapter.update(true);
                this.recyclerListView.smoothScrollBy(0, AndroidUtilities.dp(300.0f));
            } else if (uItem.instanceOf(StarTierView.Factory.class) && (uItem.object instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.instance;
                }
                if (findActivity == null) {
                    return;
                }
                StarsController.getInstance(this.currentAccount).buy(findActivity, (TL_stars.TL_starsTopupOption) uItem.object, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsOptionsSheet$$ExternalSyntheticLambda3
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        StarsIntroActivity.StarsOptionsSheet.$r8$lambda$Y3BA_qnLEPSeylt3e8NjD-_SbpI(StarsIntroActivity.StarsOptionsSheet.this, uItem, (Boolean) obj, (String) obj2);
                    }
                }, null);
            }
        }

        public static /* synthetic */ void $r8$lambda$Y3BA_qnLEPSeylt3e8NjD-_SbpI(StarsOptionsSheet starsOptionsSheet, UItem uItem, Boolean bool, String str) {
            if (starsOptionsSheet.getContext() == null) {
                return;
            }
            starsOptionsSheet.dismiss();
            StarsController.getInstance(starsOptionsSheet.currentAccount).invalidateTransactions(true);
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            if (!bool.booleanValue()) {
                if (str != null) {
                    BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
                }
            } else {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0]))).show();
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity != null) {
                    launchActivity.getFireworksOverlay().start(true);
                }
            }
        }
    }

    public static class StarsNeededSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private final int BUTTON_EXPAND;
        private UniversalAdapter adapter;
        private final boolean canBuy;
        private boolean expanded;
        private final FireworksOverlay fireworksOverlay;
        private final FrameLayout footerView;
        private final HeaderView headerView;
        private final TLRPC.InputPeer purposePeer;
        private final long starsNeeded;
        private Runnable whenPurchased;

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            Runnable runnable;
            if (i == NotificationCenter.starOptionsLoaded || i == NotificationCenter.starBalanceUpdated) {
                UniversalAdapter universalAdapter = this.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                }
                long j = StarsController.getInstance(this.currentAccount).getBalance().amount;
                this.headerView.titleView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (this.starsNeeded - j)));
                ActionBar actionBar = this.actionBar;
                if (actionBar != null) {
                    actionBar.setTitle(getTitle());
                }
                if (j < this.starsNeeded || (runnable = this.whenPurchased) == null) {
                    return;
                }
                runnable.run();
                this.whenPurchased = null;
                dismiss();
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
        public void show() {
            if (!this.canBuy) {
                BulletinFactory.of(Bulletin.BulletinWindow.make(getContext()), this.resourcesProvider).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.PaymentInvoiceDisabledStarsText)).show();
                return;
            }
            if (StarsController.getInstance(this.currentAccount).getBalance().amount >= this.starsNeeded) {
                Runnable runnable = this.whenPurchased;
                if (runnable != null) {
                    runnable.run();
                    this.whenPurchased = null;
                    return;
                }
                return;
            }
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.isKeyboardVisible() && chatActivity.getChatActivityEnterView() != null) {
                    chatActivity.getChatActivityEnterView().closeKeyboard();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet
        public void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
        
            if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r7)) == null) goto L63;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public StarsNeededSheet(Context context, Theme.ResourcesProvider resourcesProvider, long j, int i, String str, Runnable runnable, long j2) {
            super(context, null, false, false, false, resourcesProvider);
            String str2;
            String str3;
            this.BUTTON_EXPAND = -1;
            this.topPadding = 0.2f;
            this.whenPurchased = runnable;
            TLRPC.InputPeer inputPeer = j2 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
            this.purposePeer = inputPeer;
            boolean canBuy = StarsController.getInstance(this.currentAccount).canBuy(inputPeer);
            this.canBuy = canBuy;
            fixNavigationBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i2 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i2, 0, i2, 0);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                public final void onItemClick(View view, int i3) {
                    StarsIntroActivity.StarsNeededSheet.$r8$lambda$94_khXAg706NUcIGvxR92vVj7YM(StarsIntroActivity.StarsNeededSheet.this, view, i3);
                }
            });
            this.recyclerListView.setSections();
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray, resourcesProvider));
            this.starsNeeded = j;
            HeaderView headerView = new HeaderView(context, this.currentAccount, resourcesProvider);
            this.headerView = headerView;
            headerView.titleView.setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j - StarsController.getInstance(this.currentAccount).getBalance().amount), new Object[0]));
            if (i == 1) {
                str2 = "StarsNeededTextBuySubscription";
            } else {
                if (i != 2) {
                    if (i == 7) {
                        str2 = "StarsNeededTextKeepBotSubscription";
                    } else if (i == 8) {
                        str2 = "StarsNeededTextKeepBizSubscription";
                    } else if (i != 3) {
                        if (i == 4) {
                            str2 = "StarsNeededTextLink";
                            if (str == null) {
                                str3 = "StarsNeededTextLink";
                            } else {
                                str3 = "StarsNeededTextLink_" + str.toLowerCase();
                            }
                        } else if (i == 5) {
                            str2 = "StarsNeededTextReactions";
                        } else if (i == 6) {
                            str2 = "StarsNeededTextGift";
                        } else if (i == 12) {
                            str2 = "StarsNeededTextGiftChannel";
                        } else if (i == 13) {
                            str2 = "StarsNeededTextPrivateMessage";
                        } else if (i == 10) {
                            str2 = "StarsNeededTextGiftUpgrade";
                        } else if (i == 11) {
                            str2 = "StarsNeededTextGiftTransfer";
                        } else if (i == 9) {
                            str2 = "StarsNeededBizText";
                        } else if (i == 14) {
                            str2 = "StarsNeededTextGiftBuyResale";
                        } else if (i == 15) {
                            str2 = "StarsNeededTextSearch";
                        } else if (i == 16) {
                            str2 = "StarsNeededRemoveGiftDescription";
                        } else if (i == 17) {
                            str2 = "StarsNeededLiveComments";
                        } else {
                            str2 = "StarsNeededText";
                        }
                    }
                }
                str2 = "StarsNeededTextKeepSubscription";
            }
            str3 = str2;
            if (TextUtils.isEmpty(str3)) {
                headerView.subtitleView.setText("");
            } else {
                String nullable = LocaleController.nullable(LocaleController.formatString(str3, LocaleController.getStringResId(str3), str));
                headerView.subtitleView.setText(AndroidUtilities.replaceTags(nullable == null ? LocaleController.getString(str3) : nullable));
                TextView textView = headerView.subtitleView;
                textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), headerView.subtitleView.getPaint()));
            }
            this.actionBar.setTitle(getTitle());
            FrameLayout frameLayout = new FrameLayout(context);
            this.footerView = frameLayout;
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            if (canBuy) {
                linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Browser.openUrl(StarsIntroActivity.StarsNeededSheet.this.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                    }
                }));
            } else {
                linksTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StarsPurchaseUnavailable)));
            }
            linksTextView.setGravity(17);
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
            frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -1, 17));
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
            this.fireworksOverlay = fireworksOverlay;
            this.containerView.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(false);
            }
        }

        public static /* synthetic */ void $r8$lambda$94_khXAg706NUcIGvxR92vVj7YM(StarsNeededSheet starsNeededSheet, View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = starsNeededSheet.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            starsNeededSheet.onItemClick(item, starsNeededSheet.adapter);
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected CharSequence getTitle() {
            HeaderView headerView = this.headerView;
            if (headerView == null) {
                return null;
            }
            return headerView.titleView.getText();
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet$$ExternalSyntheticLambda2
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    StarsIntroActivity.StarsNeededSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, this.resourcesProvider);
            this.adapter = universalAdapter;
            return universalAdapter;
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            arrayList.add(UItem.asCustomShadow(this.headerView));
            if (this.canBuy) {
                arrayList.add(UItem.asHeader(LocaleController.getString(R.string.TelegramStarsChoose)));
            }
            ArrayList options = StarsController.getInstance(this.currentAccount).getOptions();
            if (this.canBuy) {
                if (options != null && !options.isEmpty()) {
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    boolean z = false;
                    int i4 = 1;
                    for (int i5 = 0; i5 < options.size(); i5++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) options.get(i5);
                        if (tL_starsTopupOption.stars >= this.starsNeeded) {
                            if (tL_starsTopupOption.extended && !this.expanded && z) {
                                i3++;
                            } else {
                                arrayList.add(StarTierView.Factory.asStarTier(i5, i4, tL_starsTopupOption));
                                i2++;
                                i4++;
                                z = true;
                            }
                        }
                    }
                    if (i2 < 3) {
                        arrayList.clear();
                        arrayList.add(UItem.asCustom(this.headerView));
                        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.TelegramStarsChoose)));
                        int i6 = 0;
                        for (int i7 = 0; i7 < options.size(); i7++) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) options.get(i7);
                            if (tL_starsTopupOption2.stars >= this.starsNeeded) {
                                arrayList.add(StarTierView.Factory.asStarTier(i7, i4, tL_starsTopupOption2));
                                i6++;
                                i4++;
                            }
                        }
                        if (i6 == 0) {
                            while (i < options.size()) {
                                arrayList.add(StarTierView.Factory.asStarTier(i, i4, (TL_stars.TL_starsTopupOption) options.get(i)));
                                i++;
                                i4++;
                            }
                            boolean z2 = this.expanded;
                            if (!z2 && i3 > 0) {
                                arrayList.add(ExpandView.Factory.asExpand(-1, LocaleController.getString(z2 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions), !this.expanded).accent());
                            }
                        } else {
                            this.expanded = true;
                        }
                    } else if (i2 > 0) {
                        boolean z3 = this.expanded;
                        if (!z3 && i3 > 0) {
                            arrayList.add(ExpandView.Factory.asExpand(-1, LocaleController.getString(z3 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions), !this.expanded).accent());
                        }
                    } else {
                        while (i < options.size()) {
                            arrayList.add(StarTierView.Factory.asStarTier(i, i4, (TL_stars.TL_starsTopupOption) options.get(i)));
                            i++;
                            i4++;
                        }
                    }
                } else {
                    arrayList.add(UItem.asFlicker(31));
                    arrayList.add(UItem.asFlicker(31));
                    arrayList.add(UItem.asFlicker(31));
                }
            }
            arrayList.add(UItem.asCustom(this.footerView));
        }

        public void onItemClick(final UItem uItem, UniversalAdapter universalAdapter) {
            if (uItem.id == -1) {
                this.expanded = !this.expanded;
                universalAdapter.update(true);
            } else if (uItem.instanceOf(StarTierView.Factory.class) && (uItem.object instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.instance;
                }
                if (findActivity == null) {
                    return;
                }
                StarsController.getInstance(this.currentAccount).buy(findActivity, (TL_stars.TL_starsTopupOption) uItem.object, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet$$ExternalSyntheticLambda3
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        StarsIntroActivity.StarsNeededSheet.$r8$lambda$ltA80qvLDc7-URXEwviEJy7dRtw(StarsIntroActivity.StarsNeededSheet.this, uItem, (Boolean) obj, (String) obj2);
                    }
                }, this.purposePeer);
            }
        }

        public static /* synthetic */ void $r8$lambda$ltA80qvLDc7-URXEwviEJy7dRtw(StarsNeededSheet starsNeededSheet, UItem uItem, Boolean bool, String str) {
            if (starsNeededSheet.getContext() == null) {
                return;
            }
            if (bool.booleanValue()) {
                BulletinFactory.of((FrameLayout) starsNeededSheet.containerView, starsNeededSheet.resourcesProvider).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0]))).show();
                starsNeededSheet.fireworksOverlay.start(true);
                StarsController.getInstance(starsNeededSheet.currentAccount).invalidateTransactions(true);
            } else if (str != null) {
                BulletinFactory.of((FrameLayout) starsNeededSheet.containerView, starsNeededSheet.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public void dismiss() {
            super.dismiss();
            HeaderView headerView = this.headerView;
            if (headerView != null) {
                headerView.iconView.setPaused(true);
            }
        }

        public static class HeaderView extends LinearLayout {
            public final StarsBalanceView balanceView;
            public final GLIconTextureView iconView;
            public final StarParticlesView particlesView;
            public final TextView subtitleView;
            public final TextView titleView;
            private final FrameLayout topView;

            public HeaderView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                this.topView = frameLayout;
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                StarParticlesView makeParticlesView = StarsIntroActivity.makeParticlesView(context, 70, 0);
                this.particlesView = makeParticlesView;
                frameLayout.addView(makeParticlesView, LayoutHelper.createFrame(-1, -1.0f));
                GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
                this.iconView = gLIconTextureView;
                GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
                gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
                gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
                gLIconRenderer.updateColors();
                gLIconTextureView.setStarParticlesView(makeParticlesView);
                frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(NotificationCenter.activeGroupCallsUpdated, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                gLIconTextureView.setPaused(false);
                StarsBalanceView starsBalanceView = new StarsBalanceView(context, i, resourcesProvider);
                this.balanceView = starsBalanceView;
                ScaleStateListAnimator.apply(starsBalanceView);
                starsBalanceView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet$HeaderView$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarsIntroActivity.StarsNeededSheet.HeaderView.$r8$lambda$Cfc_EDwwE5P5DxgMc3IK2qP7pEw(StarsIntroActivity.StarsNeededSheet.HeaderView.this, view);
                    }
                });
                frameLayout.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                addView(frameLayout, LayoutHelper.createFrame(-1, 150.0f));
                TextView textView = new TextView(context);
                this.titleView = textView;
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.bold());
                int i2 = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i2, resourcesProvider));
                textView.setGravity(17);
                addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.subtitleView = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
                textView2.setGravity(17);
                addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 18));
            }

            public static /* synthetic */ void $r8$lambda$Cfc_EDwwE5P5DxgMc3IK2qP7pEw(HeaderView headerView, View view) {
                BaseFragment lastFragment;
                if (headerView.balanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    bottomSheetParams.allowNestedScroll = false;
                    lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
                }
            }
        }
    }

    public static class GiftStarsSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private final int BUTTON_EXPAND;
        private UniversalAdapter adapter;
        private boolean expanded;
        private final FireworksOverlay fireworksOverlay;
        private final FrameLayout footerView;
        private final HeaderView headerView;
        private final TLRPC.User user;
        private final Runnable whenPurchased;

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if ((i == NotificationCenter.starGiftOptionsLoaded || i == NotificationCenter.starBalanceUpdated) && (universalAdapter = this.adapter) != null) {
                universalAdapter.update(true);
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
        public void show() {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.isKeyboardVisible() && chatActivity.getChatActivityEnterView() != null) {
                    chatActivity.getChatActivityEnterView().closeKeyboard();
                }
            }
            super.show();
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet
        public void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        public GiftStarsSheet(Context context, Theme.ResourcesProvider resourcesProvider, TLRPC.User user, Runnable runnable) {
            super(context, null, false, false, false, resourcesProvider);
            this.BUTTON_EXPAND = -1;
            this.user = user;
            this.whenPurchased = runnable;
            this.topPadding = 0.2f;
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
            fixNavigationBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                public final void onItemClick(View view, int i2) {
                    StarsIntroActivity.GiftStarsSheet.$r8$lambda$bHARWeRw6LNoTricP1XhDSSXc1M(StarsIntroActivity.GiftStarsSheet.this, view, i2);
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray, resourcesProvider));
            HeaderView headerView = new HeaderView(context, this.currentAccount, resourcesProvider);
            this.headerView = headerView;
            headerView.titleView.setText(LocaleController.getString(R.string.GiftStarsTitle));
            headerView.subtitleView.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.GiftStarsSheet.$r8$lambda$f9pnQrlT0O9orWnloIdt2_Rtr2g(StarsIntroActivity.GiftStarsSheet.this);
                }
            }), true)));
            LinkSpanDrawable.LinksTextView linksTextView = headerView.subtitleView;
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), headerView.subtitleView.getPaint()) + 1);
            this.actionBar.setTitle(getTitle());
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(user);
            headerView.avatarImageView.setForUserOrChat(user, avatarDrawable);
            FrameLayout frameLayout = new FrameLayout(context);
            this.footerView = frameLayout;
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            linksTextView2.setTextSize(1, 12.0f);
            linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
            linksTextView2.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Browser.openUrl(StarsIntroActivity.GiftStarsSheet.this.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                }
            }));
            linksTextView2.setGravity(17);
            linksTextView2.setMaxWidth(HintView2.cutInFancyHalf(linksTextView2.getText(), linksTextView2.getPaint()));
            frameLayout.addView(linksTextView2, LayoutHelper.createFrame(-2, -1, 17));
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
            this.fireworksOverlay = fireworksOverlay;
            this.containerView.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(false);
            }
        }

        public static /* synthetic */ void $r8$lambda$bHARWeRw6LNoTricP1XhDSSXc1M(GiftStarsSheet giftStarsSheet, View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = giftStarsSheet.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            giftStarsSheet.onItemClick(item, giftStarsSheet.adapter);
        }

        public static /* synthetic */ void $r8$lambda$f9pnQrlT0O9orWnloIdt2_Rtr2g(GiftStarsSheet giftStarsSheet) {
            BaseFragment baseFragment;
            StarAppsSheet starAppsSheet = new StarAppsSheet(giftStarsSheet.getContext());
            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(giftStarsSheet.attachedFragment) && (baseFragment = giftStarsSheet.attachedFragment) != null) {
                starAppsSheet.makeAttached(baseFragment);
            }
            starAppsSheet.show();
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected CharSequence getTitle() {
            HeaderView headerView = this.headerView;
            if (headerView == null) {
                return null;
            }
            return headerView.titleView.getText();
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda3
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    StarsIntroActivity.GiftStarsSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, this.resourcesProvider);
            this.adapter = universalAdapter;
            return universalAdapter;
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            arrayList.add(UItem.asCustom(this.headerView));
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.TelegramStarsChoose)));
            ArrayList giftOptions = StarsController.getInstance(this.currentAccount).getGiftOptions();
            if (giftOptions != null && !giftOptions.isEmpty()) {
                int i = 0;
                int i2 = 1;
                for (int i3 = 0; i3 < giftOptions.size(); i3++) {
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) giftOptions.get(i3);
                    if (this.expanded || !tL_starsGiftOption.extended) {
                        arrayList.add(StarTierView.Factory.asStarTier(i3, i2, tL_starsGiftOption));
                        i2++;
                    } else {
                        i++;
                    }
                }
                boolean z = this.expanded;
                if (!z && i > 0) {
                    arrayList.add(ExpandView.Factory.asExpand(-1, LocaleController.getString(z ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions), !this.expanded).accent());
                }
            } else {
                arrayList.add(UItem.asFlicker(31));
                arrayList.add(UItem.asFlicker(31));
                arrayList.add(UItem.asFlicker(31));
            }
            arrayList.add(UItem.asCustom(this.footerView));
        }

        public void onItemClick(final UItem uItem, UniversalAdapter universalAdapter) {
            if (uItem.id == -1) {
                this.expanded = !this.expanded;
                universalAdapter.update(true);
                this.recyclerListView.smoothScrollBy(0, AndroidUtilities.dp(200.0f), CubicBezierInterpolator.EASE_OUT);
            } else if (uItem.instanceOf(StarTierView.Factory.class) && (uItem.object instanceof TL_stars.TL_starsGiftOption)) {
                Activity findActivity = AndroidUtilities.findActivity(getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.instance;
                }
                Activity activity = findActivity;
                if (activity == null) {
                    return;
                }
                final long j = this.user.id;
                StarsController.getInstance(this.currentAccount).buyGift(activity, (TL_stars.TL_starsGiftOption) uItem.object, j, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        StarsIntroActivity.GiftStarsSheet.$r8$lambda$uZYaJQOU7r2NXt_Fr9rsaCXH5xk(StarsIntroActivity.GiftStarsSheet.this, uItem, j, (Boolean) obj, (String) obj2);
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$uZYaJQOU7r2NXt_Fr9rsaCXH5xk(GiftStarsSheet giftStarsSheet, UItem uItem, final long j, Boolean bool, String str) {
            Runnable runnable;
            if (giftStarsSheet.getContext() == null) {
                return;
            }
            if ((bool.booleanValue() || str != null) && (runnable = giftStarsSheet.whenPurchased) != null) {
                runnable.run();
            }
            giftStarsSheet.dismiss();
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            FireworksOverlay fireworksOverlay = LaunchActivity.instance.getFireworksOverlay();
            if (safeLastFragment == null) {
                return;
            }
            if (!bool.booleanValue()) {
                if (str != null) {
                    BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
                }
            } else {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) uItem.longValue, UserObject.getForcedFirstName(giftStarsSheet.user))), LocaleController.getString(R.string.ViewInChat), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.GiftStarsSheet.$r8$lambda$XJR9mtiHZI9jRwVOKA2h0N0l6G0(j);
                    }
                }).setDuration(5000).show(true);
                if (fireworksOverlay != null) {
                    fireworksOverlay.start(true);
                }
                StarsController.getInstance(giftStarsSheet.currentAccount).invalidateTransactions(true);
            }
        }

        public static /* synthetic */ void $r8$lambda$XJR9mtiHZI9jRwVOKA2h0N0l6G0(long j) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(ChatActivity.of(j));
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public void dismiss() {
            super.dismiss();
        }

        public static class HeaderView extends LinearLayout {
            public final BackupImageView avatarImageView;
            public final StarParticlesView particlesView;
            public final LinkSpanDrawable.LinksTextView subtitleView;
            public final TextView titleView;
            private final FrameLayout topView;

            public HeaderView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                this.topView = frameLayout;
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                StarParticlesView makeParticlesView = StarsIntroActivity.makeParticlesView(context, 70, 0);
                this.particlesView = makeParticlesView;
                frameLayout.addView(makeParticlesView, LayoutHelper.createFrame(-1, -1.0f));
                BackupImageView backupImageView = new BackupImageView(context);
                this.avatarImageView = backupImageView;
                backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout, LayoutHelper.createFrame(-1, 150.0f));
                TextView textView = new TextView(context);
                this.titleView = textView;
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.bold());
                int i2 = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i2, resourcesProvider));
                textView.setGravity(17);
                addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 2, 0, 0));
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                this.subtitleView = linksTextView;
                linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                linksTextView.setTextSize(1, 14.0f);
                linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
                linksTextView.setGravity(17);
                addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 18));
            }
        }
    }

    public static SpannableStringBuilder replaceStars(boolean z, CharSequence charSequence) {
        return replaceStars(z, charSequence, 1.13f);
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence) {
        return replaceStars(charSequence, 1.13f);
    }

    public static SpannableStringBuilder replaceStars(boolean z, CharSequence charSequence, float f) {
        return replaceStars(z, charSequence, f, null);
    }

    public static SpannableStringBuilder replaceStars(TL_stars.StarsAmount starsAmount, CharSequence charSequence, float f) {
        return replaceStars(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, f, null);
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, float f) {
        return replaceStars(charSequence, f, (ColoredImageSpan[]) null);
    }

    public static SpannableStringBuilder replaceStars(boolean z, CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr) {
        return replaceStars(z, charSequence, f, coloredImageSpanArr, 0.0f, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr) {
        return replaceStars(charSequence, f, coloredImageSpanArr, 0.0f, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr, float f2, float f3, float f4) {
        return replaceStars(false, charSequence, f, coloredImageSpanArr, f2, f3, f4);
    }

    public static SpannableStringBuilder replaceStars(boolean z, CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr, float f2, float f3, float f4) {
        SpannableStringBuilder spannableStringBuilder;
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString((z ? "TON" : "⭐") + " ");
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            coloredImageSpan = new ColoredImageSpan(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar);
            if (coloredImageSpanArr != null) {
                coloredImageSpanArr[0] = coloredImageSpan;
            }
        }
        coloredImageSpan.translate(f2, f3);
        coloredImageSpan.spaceScaleX = f4;
        if (z) {
            float f5 = f * 0.2f;
            coloredImageSpan.setScale(f5, f5);
        } else {
            coloredImageSpan.setScale(f, f);
        }
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceDiamond(CharSequence charSequence) {
        return replaceDiamond(charSequence, 0.9f, null, 0.0f, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceDiamond(CharSequence charSequence, float f) {
        return replaceDiamond(charSequence, f, null, 0.0f, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceDiamond(CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr, float f2, float f3, float f4) {
        SpannableStringBuilder spannableStringBuilder;
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString("💎 ");
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            coloredImageSpan = new ColoredImageSpan(R.drawable.diamond);
            if (coloredImageSpanArr != null) {
                coloredImageSpanArr[0] = coloredImageSpan;
            }
        }
        coloredImageSpan.recolorDrawable = false;
        coloredImageSpan.translate(f2, f3);
        coloredImageSpan.spaceScaleX = f4;
        coloredImageSpan.setScale(f, f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, ColoredImageSpan[] coloredImageSpanArr) {
        return replaceStars(false, charSequence, coloredImageSpanArr);
    }

    public static SpannableStringBuilder replaceStars(boolean z, CharSequence charSequence, ColoredImageSpan[] coloredImageSpanArr) {
        SpannableStringBuilder spannableStringBuilder;
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            coloredImageSpan = new ColoredImageSpan(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar);
            coloredImageSpan.setScale(z ? 0.222f : 1.13f, z ? 0.222f : 1.13f);
        }
        if (coloredImageSpanArr != null) {
            coloredImageSpanArr[0] = coloredImageSpan;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceStarsWithPlain(CharSequence charSequence, float f) {
        return replaceStarsWithPlain(charSequence, f, (ColoredImageSpan[]) null);
    }

    public static SpannableStringBuilder replaceStarsWithPlain(boolean z, CharSequence charSequence, float f) {
        return replaceStarsWithPlain(z, charSequence, f, (ColoredImageSpan[]) null);
    }

    public static SpannableStringBuilder replaceStarsWithPlain(TL_stars.StarsAmount starsAmount, CharSequence charSequence, float f) {
        return replaceStarsWithPlain(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, f, (ColoredImageSpan[]) null);
    }

    public static SpannableStringBuilder replaceStarsWithPlain(CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr) {
        return replaceStarsWithPlain(false, charSequence, f, coloredImageSpanArr);
    }

    public static SpannableStringBuilder replaceStarsWithPlain(TL_stars.StarsAmount starsAmount, CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr) {
        return replaceStarsWithPlain(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, f, coloredImageSpanArr);
    }

    public static SpannableStringBuilder replaceStarsWithPlain(boolean z, CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr) {
        SpannableStringBuilder spannableStringBuilder;
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        String str = z ? "TON" : "⭐";
        int i = z ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str + " ");
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            if (coloredImageSpanArr != null && coloredImageSpanArr.length > 0) {
                coloredImageSpan = new ColoredImageSpan(i);
                coloredImageSpanArr[0] = coloredImageSpan;
            } else {
                coloredImageSpan = new ColoredImageSpan(i);
            }
        }
        if (z) {
            f *= 0.33f;
        } else {
            coloredImageSpan.recolorDrawable = false;
        }
        coloredImageSpan.setScale(f, f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0186, code lost:
    
        r5 = org.telegram.messenger.R.string.StarsTransactionFragment;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence getTransactionTitle(int i, boolean z, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.stargift_drop_original_details) {
            return LocaleController.getString(R.string.StarsTransactionRemovedDescription);
        }
        if (starsTransaction.posts_search) {
            return LocaleController.getString(R.string.StarsTransactionPostsSearch);
        }
        if (starsTransaction.premium_gift) {
            return LocaleController.getString(R.string.StarsTransactionPremiumGift);
        }
        if (starsTransaction.phonegroup_message) {
            return LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee);
        }
        if (starsTransaction.paid_message) {
            return LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return LocaleController.getString(R.string.StarsTransactionFloodskip);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return LocaleController.getString(R.string.StarMediaPurchase);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        boolean z2 = starsAmount instanceof TL_stars.TL_starsTonAmount;
        int i2 = starsTransaction.flags;
        if ((131072 & i2) == 0 && (65536 & i2) != 0) {
            return LocaleController.formatString(R.string.StarTransactionCommission, AffiliateProgramFragment.percents(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade);
            }
            if (starsTransaction.refund) {
                return LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionRefundedAuctionBid : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted);
            }
            return LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionAuctionBid : starsAmount.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent);
        }
        if (starsTransaction.subscription) {
            int i3 = starsTransaction.subscription_period;
            if (i3 == 2592000) {
                return LocaleController.getString(R.string.StarSubscriptionPurchase);
            }
            if (i3 == 300) {
                return "5-minute subscription fee";
            }
            if (i3 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i2 & 8192) != 0) {
            return LocaleController.getString(R.string.StarsGiveawayPrizeReceived);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return LocaleController.getString(UserObject.isUserSelf(MessagesController.getInstance(i).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction.sent_by)))) ? R.string.StarsGiftSent : R.string.StarsGiftReceived);
            }
            return LocaleController.getString(R.string.StarsGiftReceived);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        if (peerDialogId != 0) {
            if (peerDialogId >= 0) {
                return UserObject.getUserName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(peerDialogId)));
            }
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-peerDialogId));
            return chat == null ? "" : chat.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
            if (!z) {
                if (starsTransaction.refund) {
                }
                return LocaleController.getString(r5);
            }
            int i4 = R.string.StarsTransactionWithdrawFragment;
            return LocaleController.getString(i4);
        }
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
            return LocaleController.getString(R.string.StarsTransactionBot);
        }
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
            return LocaleController.getString(R.string.StarsTransactionAds);
        }
        return LocaleController.getString(R.string.StarsTransactionUnsupported);
    }

    public static BottomSheet showTransactionSheet(Context context, int i, int i2, TLRPC.Peer peer, TLRPC.Peer peer2, TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars, Theme.ResourcesProvider resourcesProvider) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPrizeStars.boost_peer;
        starsTransaction.date = i2;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
        starsTransaction.id = tL_messageActionPrizeStars.transaction_id;
        starsTransaction.gift = true;
        starsTransaction.flags |= 8192;
        starsTransaction.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
        starsTransaction.sent_by = peer;
        starsTransaction.received_by = peer2;
        return showTransactionSheet(context, false, 0L, i, starsTransaction, resourcesProvider);
    }

    public static BottomSheet showTransactionSheet(Context context, int i, int i2, TLRPC.Peer peer, TLRPC.Peer peer2, TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars, Theme.ResourcesProvider resourcesProvider) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = peer;
        starsTransaction.date = i2;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
        starsTransaction.id = tL_messageActionGiftStars.transaction_id;
        starsTransaction.gift = true;
        starsTransaction.sent_by = peer;
        starsTransaction.received_by = peer2;
        return showTransactionSheet(context, false, 0L, i, starsTransaction, resourcesProvider);
    }

    public static BottomSheet showTransactionSheet(Context context, int i, int i2, TLRPC.Peer peer, TLRPC.Peer peer2, TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon, Theme.ResourcesProvider resourcesProvider) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = peer;
        starsTransaction.date = i2;
        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
        starsTransaction.amount = tL_starsTonAmount;
        tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
        starsTransaction.id = tL_messageActionGiftTon.transaction_id;
        starsTransaction.gift = true;
        starsTransaction.sent_by = peer;
        starsTransaction.received_by = peer2;
        return showTransactionSheet(context, false, 0L, i, starsTransaction, resourcesProvider);
    }

    public static BottomSheet showTransactionSheet(Context context, int i, int i2, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, Theme.ResourcesProvider resourcesProvider) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i2;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.id = tL_messageActionPaymentRefunded.charge.id;
        starsTransaction.refund = true;
        return showTransactionSheet(context, false, 0L, i, starsTransaction, resourcesProvider);
    }

    public static BottomSheet showTransactionSheet(Context context, boolean z, int i, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, Theme.ResourcesProvider resourcesProvider) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        return showTransactionSheet(context, z, 0L, i, starsTransaction, resourcesProvider);
    }

    public static String getGiftStarsEmoji(long j) {
        if (j <= 1000) {
            return "2⃣";
        }
        if (j < 2500) {
            return "3⃣";
        }
        return "4⃣";
    }

    public static Runnable setGiftImage(View view, ImageReceiver imageReceiver, long j) {
        return setGiftImage(view, imageReceiver, getGiftStarsEmoji(j));
    }

    public static Runnable setTonGiftImage(View view, ImageReceiver imageReceiver, long j) {
        return setGiftImage(view, imageReceiver, getTonGiftEmoji(j), true);
    }

    public static String getPremiumGiftMonthsEmoji(int i) {
        if (i == 3) {
            return "2⃣";
        }
        if (i == 6) {
            return "3⃣";
        }
        if (i == 12) {
            return "4⃣";
        }
        if (i == 24) {
            return "5⃣";
        }
        return "1⃣";
    }

    public static String getTonGiftEmoji(long j) {
        if (j <= 10000000000L) {
            return "2⃣";
        }
        if (j <= 50000000000L) {
            return "1⃣";
        }
        return "3⃣";
    }

    public static Runnable setPremiumGiftImage(View view, ImageReceiver imageReceiver, int i) {
        return setGiftImage(view, imageReceiver, getPremiumGiftMonthsEmoji(i));
    }

    public static Runnable setGiftImage(View view, ImageReceiver imageReceiver, String str) {
        return setGiftImage(view, imageReceiver, str, false);
    }

    public static Runnable setGiftImage(View view, final ImageReceiver imageReceiver, final String str, final boolean z) {
        final boolean[] zArr = new boolean[1];
        final int currentAccount = imageReceiver.getCurrentAccount();
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda49
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.$r8$lambda$Thc2AVcSQy69lVnyvZDeWdPLg14(z, currentAccount, str, imageReceiver, zArr);
            }
        };
        runnable.run();
        final Runnable listen = NotificationCenter.getInstance(currentAccount).listen(view, z ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda50
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                runnable.run();
            }
        });
        final Runnable listen2 = NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda51
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                runnable.run();
            }
        });
        return new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.$r8$lambda$sFFyu7tglm5UYol-9TNRZbCKkGk(listen, listen2);
            }
        };
    }

    public static /* synthetic */ void $r8$lambda$Thc2AVcSQy69lVnyvZDeWdPLg14(boolean z, int i, String str, ImageReceiver imageReceiver, final boolean[] zArr) {
        String str2;
        TLRPC.Document document;
        if (z) {
            str2 = UserConfig.getInstance(i).premiumTonStickerPack;
            if (str2 == null) {
                MediaDataController.getInstance(i).checkTonGiftStickers();
                return;
            }
        } else {
            str2 = UserConfig.getInstance(i).premiumGiftsStickerPack;
            if (str2 == null) {
                MediaDataController.getInstance(i).checkPremiumGiftStickers();
                return;
            }
        }
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i).getStickerSetByName(str2);
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i).getStickerSetByEmojiOrName(str2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= tL_messages_stickerSet.packs.size()) {
                    break;
                }
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i2);
                if (TextUtils.equals(tL_stickerPack.emoticon, str) && !tL_stickerPack.documents.isEmpty()) {
                    long longValue = tL_stickerPack.documents.get(0).longValue();
                    for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                        document = tL_messages_stickerSet.documents.get(i3);
                        if (document != null && document.id == longValue) {
                            break;
                        }
                    }
                } else {
                    i2++;
                }
            }
            document = null;
            if (document == null && !tL_messages_stickerSet.documents.isEmpty()) {
                document = tL_messages_stickerSet.documents.get(0);
            }
        } else {
            document = null;
        }
        if (document != null) {
            imageReceiver.setAllowStartLottieAnimation(true);
            imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity.7
                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public /* synthetic */ void didSetImageBitmap(int i4, String str3, Drawable drawable) {
                    ImageReceiver.ImageReceiverDelegate.-CC.$default$didSetImageBitmap(this, i4, str3, drawable);
                }

                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver2) {
                    ImageReceiver.ImageReceiverDelegate.-CC.$default$onAnimationReady(this, imageReceiver2);
                }

                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public void didSetImage(ImageReceiver imageReceiver2, boolean z2, boolean z3, boolean z4) {
                    RLottieDrawable lottieAnimation;
                    if (!z2 || (lottieAnimation = imageReceiver2.getLottieAnimation()) == null || zArr[0]) {
                        return;
                    }
                    lottieAnimation.setCurrentFrame(0, false);
                    AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda14(lottieAnimation));
                    zArr[0] = true;
                }
            });
            Drawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, NotificationCenter.screenshotTook, true, null, true);
            imageReceiver.setAutoRepeat(0);
            imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
            return;
        }
        MediaDataController.getInstance(i).loadStickersByEmojiOrName(str2, false, tL_messages_stickerSet == null);
    }

    public static /* synthetic */ void $r8$lambda$sFFyu7tglm5UYol-9TNRZbCKkGk(Runnable runnable, Runnable runnable2) {
        runnable.run();
        runnable2.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0f6a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0fa0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0fe6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x107e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x10a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1089  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x104d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x102f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0d56  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0d64  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0d75  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0ee6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0ef8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0efb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0f09  */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BottomSheet showTransactionSheet(final Context context, final boolean z, final long j, final int i, final TL_stars.StarsTransaction starsTransaction, final Theme.ResourcesProvider resourcesProvider) {
        BottomSheet.Builder builder;
        BottomSheet[] bottomSheetArr;
        CharSequence charSequence;
        final Context context2;
        final int i2;
        TL_stars.StarsTransaction starsTransaction2;
        ViewGroup viewGroup;
        String str;
        boolean z2;
        final long j2;
        final Theme.ResourcesProvider resourcesProvider2;
        String str2;
        TLRPC.Peer peer;
        long j3;
        int i3;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i4;
        final BottomSheet[] bottomSheetArr2;
        int i5;
        String string;
        TL_stars.StarGift starGift;
        final TL_stars.StarsTransaction starsTransaction3;
        ViewGroup viewGroup2;
        final BottomSheet[] bottomSheetArr3;
        float f;
        final Theme.ResourcesProvider resourcesProvider3;
        final Context context3;
        final BottomSheet[] bottomSheetArr4;
        TableView tableView;
        TableView tableView2;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z3;
        TL_stars.StarGift starGift2;
        final Context context4;
        BaseFragment safeLastFragment;
        TLRPC.Chat chat;
        int i6;
        ImageLocation forDocument2;
        int i7;
        final BottomSheet[] bottomSheetArr5;
        TableView tableView3;
        TableView tableView4;
        TableView tableView5;
        long j4;
        final long j5;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsTransaction starsTransaction4;
        BottomSheet[] bottomSheetArr6;
        TableView tableView6;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        final boolean z4 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i8 = starsTransaction.flags;
        boolean z5 = (i8 & 8192) != 0;
        boolean z6 = ((131072 & i8) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z7 = (z6 || (i8 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false, resourcesProvider);
        BottomSheet[] bottomSheetArr7 = new BottomSheet[1];
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp((z5 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(null, AndroidUtilities.dp(20.0f));
                final RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                final Paint paint = new Paint(1);
                final Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                charSequence = "";
                bottomSheetArr = bottomSheetArr7;
                builder = builder2;
                LinearLayout linearLayout2 = new LinearLayout(context) { // from class: org.telegram.ui.Stars.StarsIntroActivity.8
                    private final Path clipPath = new Path();

                    @Override // android.view.ViewGroup, android.view.View
                    protected void dispatchDraw(Canvas canvas) {
                        float dp = AndroidUtilities.dp(10.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, AndroidUtilities.dp(2.0f) + 1, getWidth(), getHeight() + dp);
                        this.clipPath.rewind();
                        this.clipPath.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(this.clipPath);
                        matrix.reset();
                        matrix.postTranslate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
                        radialGradient.setLocalMatrix(matrix);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                        canvas.save();
                        canvas.translate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
                        StarGiftPatterns.drawPattern(canvas, swapAnimatedEmojiDrawable, getWidth(), AndroidUtilities.dp(180.0f), 1.0f, 1.0f);
                        canvas.restore();
                        super.dispatchDraw(canvas);
                        canvas.restore();
                    }

                    @Override // android.view.ViewGroup, android.view.View
                    protected void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        swapAnimatedEmojiDrawable.attach();
                    }

                    @Override // android.view.ViewGroup, android.view.View
                    protected void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        swapAnimatedEmojiDrawable.detach();
                    }
                };
                swapAnimatedEmojiDrawable.setParentView(linearLayout2);
                swapAnimatedEmojiDrawable.set(stargiftattributepattern.document, false);
                linearLayout2.setOrientation(1);
                BackupImageView backupImageView = new BackupImageView(context);
                setGiftImage(backupImageView.getImageReceiver(), starsTransaction.stargift, NotificationCenter.screenshotTook);
                linearLayout2.addView(backupImageView, LayoutHelper.createLinear(NotificationCenter.screenshotTook, NotificationCenter.screenshotTook, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    ScaleStateListAnimator.apply(backupImageView);
                    backupImageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Browser.openUrl(context, "https://" + MessagesController.getInstance(i).linkPrefix + "/nft/" + tL_starGiftUnique.slug);
                        }
                    });
                }
                TextView makeTextView = TextHelper.makeTextView(context, 20.0f, 0, true);
                makeTextView.setTextColor(-1);
                makeTextView.setText(tL_starGiftUnique.title);
                linearLayout2.addView(makeTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 1, 0, 0));
                TextView makeTextView2 = TextHelper.makeTextView(context, 13.0f, 0, false);
                makeTextView2.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                makeTextView2.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                linearLayout2.addView(makeTextView2, LayoutHelper.createLinear(-2, -2, 17, 0, 5, 0, 0));
                TextView makeTextView3 = TextHelper.makeTextView(context, 18.0f, 0, true);
                makeTextView3.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                makeTextView3.setText(replaceStars(starsAmount3, TextUtils.concat(positive ? "+" : charSequence, formatStarsAmount(starsAmount3), " ⭐️"), 1.25f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(makeTextView3.getText());
                if (starsTransaction.refund) {
                    appendStatus(spannableStringBuilder, makeTextView3, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    appendStatus(spannableStringBuilder, makeTextView3, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    appendStatus(spannableStringBuilder, makeTextView3, LocaleController.getString(R.string.StarsPending));
                }
                makeTextView3.setText(spannableStringBuilder);
                linearLayout2.addView(makeTextView3, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 17));
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2));
                resourcesProvider2 = resourcesProvider;
                context2 = context;
                i2 = i;
                starsTransaction2 = starsTransaction;
                viewGroup = linearLayout;
                str = "/";
                bottomSheetArr2 = bottomSheetArr;
                TableView tableView7 = new TableView(context2, resourcesProvider2);
                starGift = starsTransaction2.stargift;
                if (starGift == null) {
                    if (starsTransaction2.stargift_upgrade) {
                        if ((starsTransaction2.flags & 256) != 0 && starsTransaction2.msg_id > 0) {
                            final ButtonSpan.TextViewButtons textViewButtons = (ButtonSpan.TextViewButtons) ((TableView.TableRowContent) tableView7.addRow(LocaleController.getString(R.string.StarGiftReason), LocaleController.getString(R.string.StarGiftReasonUpgrade)).getChildAt(1)).getChildAt(0);
                            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                            tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                            StarsController.getInstance(i2).getUserStarGift(tL_inputSavedStarGiftUser, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda27
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    StarsIntroActivity.$r8$lambda$fQMhWWgBnGNgmShghlmbb77XPAg(ButtonSpan.TextViewButtons.this, i2, context2, resourcesProvider2, (TL_stars.SavedStarGift) obj);
                                }
                            });
                        }
                        TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction2.peer;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                            final long peerDialogId = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer2).peer);
                            CharSequence string2 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                            ViewGroup viewGroup3 = viewGroup;
                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda28
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarsIntroActivity.$r8$lambda$z6029uLjkfSiuWjHimoYCU9kjbI(bottomSheetArr2, peerDialogId);
                                }
                            };
                            bottomSheetArr6 = bottomSheetArr2;
                            resourcesProvider3 = resourcesProvider2;
                            starsTransaction4 = starsTransaction2;
                            TableView tableView8 = tableView7;
                            tableView8.addRowUser(string2, i2, peerDialogId, runnable);
                            viewGroup2 = viewGroup3;
                            tableView6 = tableView8;
                        } else {
                            starsTransaction4 = starsTransaction2;
                            bottomSheetArr6 = bottomSheetArr2;
                            resourcesProvider3 = resourcesProvider2;
                            tableView6 = tableView7;
                            viewGroup2 = viewGroup;
                        }
                        context3 = context2;
                        starsTransaction3 = starsTransaction4;
                        bottomSheetArr4 = bottomSheetArr6;
                        f = 9.33f;
                        tableView2 = tableView6;
                    } else {
                        final TL_stars.StarsTransaction starsTransaction5 = starsTransaction2;
                        TableView tableView9 = tableView7;
                        ViewGroup viewGroup4 = viewGroup;
                        final BottomSheet[] bottomSheetArr8 = bottomSheetArr2;
                        resourcesProvider3 = resourcesProvider2;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            final String str3 = starGift.slug;
                            if (!TextUtils.isEmpty(str3)) {
                                tableView9.addRowLink(LocaleController.getString(R.string.Gift2Gift), starsTransaction5.stargift.title + " #" + starsTransaction5.stargift.num, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda29
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Browser.openUrl(context2, "https://" + MessagesController.getInstance(i2).linkPrefix + "/nft/" + str3);
                                    }
                                });
                            }
                            final long clientUserId = UserConfig.getInstance(i2).getClientUserId();
                            long peerDialogId2 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction5.peer).peer);
                            if (!starsTransaction5.offer) {
                                if (starsTransaction5.stargift_resale) {
                                    if (!negative) {
                                        tableView9.addRow(LocaleController.getString(R.string.StarGiftReason), LocaleController.getString(starsTransaction5.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale));
                                        j5 = peerDialogId2;
                                        j4 = clientUserId;
                                    } else {
                                        tableView9.addRow(LocaleController.getString(R.string.StarGiftReason), LocaleController.getString(starsTransaction5.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase));
                                    }
                                } else if (starsTransaction5.stargift_drop_original_details) {
                                    tableView9.addRow(LocaleController.getString(R.string.StarGiftReason), LocaleController.getString(R.string.StarGiftReasonRemovedDescription));
                                    j4 = clientUserId;
                                    j5 = j4;
                                } else {
                                    tableView9.addRow(LocaleController.getString(R.string.StarGiftReason), LocaleController.getString(R.string.StarGiftReasonTransfer));
                                }
                                j4 = peerDialogId2;
                                j5 = clientUserId;
                            } else if (!negative) {
                                tableView9.addRow(LocaleController.getString(R.string.StarGiftReason), LocaleController.getString(starsTransaction5.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale));
                                j5 = peerDialogId2;
                                j4 = clientUserId;
                            } else {
                                tableView9.addRow(LocaleController.getString(R.string.StarGiftReason), LocaleController.getString(starsTransaction5.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer));
                                j4 = peerDialogId2;
                                j5 = clientUserId;
                            }
                            if (j5 != clientUserId) {
                                tableView9.addRowUser(LocaleController.getString(R.string.Gift2From), i2, j5, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda30
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.$r8$lambda$8D3iPuiORhRvfU_OginKQroc44M(bottomSheetArr8, j5, clientUserId);
                                    }
                                });
                            }
                            if (j4 != clientUserId) {
                                final long j6 = j4;
                                bottomSheetArr3 = bottomSheetArr8;
                                f = 9.33f;
                                tableView9.addRowUser(LocaleController.getString(R.string.Gift2To), i, j6, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda31
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.$r8$lambda$EvGo8SDEtLNryPvpxOeqUYlVN2U(bottomSheetArr8, j6, clientUserId);
                                    }
                                });
                            } else {
                                bottomSheetArr3 = bottomSheetArr8;
                                f = 9.33f;
                            }
                            if ((j5 == clientUserId || starsTransaction5.stargift_resale) && (starsAmount = starsTransaction5.starref_amount) != null && starsTransaction5.starref_commission_permille > 0) {
                                TL_stars.StarsAmount starsAmount4 = starsTransaction5.amount;
                                if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                    TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                    tL_starsTonAmount.amount = starsTransaction5.amount.amount + starsTransaction5.starref_amount.amount;
                                    ColoredImageSpan[] coloredImageSpanArr = new ColoredImageSpan[1];
                                    tableView9.addRow(LocaleController.getString(R.string.StarsTransactionFullPrice), replaceStarsWithPlain(starsTransaction5.amount, "⭐️ " + ((Object) formatStarsAmount(tL_starsTonAmount)), 0.8f, coloredImageSpanArr));
                                    ColoredImageSpan coloredImageSpan = coloredImageSpanArr[0];
                                    if (coloredImageSpan != null) {
                                        coloredImageSpan.setOverrideColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider3));
                                    }
                                } else {
                                    long abs = Math.abs(Math.round(starsAmount4.toDouble() + starsTransaction5.starref_amount.toDouble()));
                                    tableView9.addRow(LocaleController.getString(R.string.StarsTransactionFullPrice), replaceStarsWithPlain(starsTransaction5.amount, "⭐️ " + LocaleController.formatNumber(abs, ','), 0.8f));
                                }
                            }
                            i2 = i;
                            viewGroup2 = viewGroup4;
                            context3 = context2;
                            tableView5 = tableView9;
                        } else {
                            bottomSheetArr3 = bottomSheetArr8;
                            f = 9.33f;
                            if (starsTransaction5.refund) {
                                viewGroup2 = viewGroup4;
                                context3 = context;
                                i2 = i;
                                tableView5 = tableView9;
                            } else {
                                long clientUserId2 = j == 0 ? UserConfig.getInstance(i).getClientUserId() : j;
                                final long peerDialogId3 = DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                                TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId3));
                                if (positive) {
                                    if (peerDialogId3 != clientUserId2) {
                                        CharSequence string3 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                        Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda32
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StarsIntroActivity.$r8$lambda$6hn_iMyOY89r07iYM9YWg76FlrU(bottomSheetArr3, starsTransaction5, peerDialogId3);
                                            }
                                        };
                                        CharSequence string4 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId3)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                        final Context context5 = context2;
                                        i2 = i;
                                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StarsIntroActivity.$r8$lambda$FwyKMEFKgz9Jb0qoH1k8JITszdc(context5, i2, peerDialogId3, bottomSheetArr3);
                                            }
                                        };
                                        bottomSheetArr3 = bottomSheetArr3;
                                        viewGroup2 = viewGroup4;
                                        TableView tableView10 = tableView9;
                                        tableView10.addRowUser(string3, i2, peerDialogId3, runnable2, string4, runnable3);
                                        tableView4 = tableView10;
                                    } else {
                                        i2 = i;
                                        viewGroup2 = viewGroup4;
                                        tableView4 = tableView9;
                                    }
                                    tableView4.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeTo), i2, clientUserId2, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarsIntroActivity.$r8$lambda$JNtk_W-66tT8hy6JhNUu67YLzwQ(bottomSheetArr3, i2);
                                        }
                                    });
                                    tableView3 = tableView4;
                                } else {
                                    viewGroup2 = viewGroup4;
                                    long j7 = clientUserId2;
                                    if (peerDialogId3 != j7) {
                                        bottomSheetArr5 = bottomSheetArr3;
                                        tableView9.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i, j7, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StarsIntroActivity.$r8$lambda$_IUToQOzpzvbwAo5dB-KoOwLDHs(bottomSheetArr5, i);
                                            }
                                        });
                                    } else {
                                        bottomSheetArr5 = bottomSheetArr3;
                                    }
                                    final BottomSheet[] bottomSheetArr9 = bottomSheetArr5;
                                    i2 = i;
                                    bottomSheetArr3 = bottomSheetArr9;
                                    TableView tableView11 = tableView9;
                                    tableView11.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeTo), i2, peerDialogId3, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarsIntroActivity.$r8$lambda$ijwwvAb1HAyZEdCFM3nAGJid1YU(bottomSheetArr5, starsTransaction5, peerDialogId3);
                                        }
                                    }, (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId3)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarsIntroActivity.$r8$lambda$wy1kOU9z83jNUQez4ncO4QHItIU(context, i2, peerDialogId3, bottomSheetArr9);
                                        }
                                    });
                                    tableView3 = tableView11;
                                }
                                context3 = context;
                                tableView5 = tableView3;
                            }
                        }
                        starsTransaction3 = starsTransaction5;
                        tableView = tableView5;
                        bottomSheetArr4 = bottomSheetArr3;
                        tableView2 = tableView;
                    }
                } else {
                    starsTransaction3 = starsTransaction2;
                    TableView tableView12 = tableView7;
                    viewGroup2 = viewGroup;
                    bottomSheetArr3 = bottomSheetArr2;
                    f = 9.33f;
                    resourcesProvider3 = resourcesProvider2;
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long peerDialogId4 = DialogObject.getPeerDialogId(starsTransactionPeer3.peer);
                        if (starsTransaction3.paid_message) {
                            tableView12.addRowUser(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarsIntroActivity.$r8$lambda$arICYNa0jsYeQfgRMGJO7B296U8(bottomSheetArr3, peerDialogId4);
                                }
                            });
                            if (starsTransaction3.starref_amount != null && starsTransaction3.starref_commission_permille > 0) {
                                long abs2 = Math.abs(Math.round(starsTransaction3.amount.toDouble() + starsTransaction3.starref_amount.toDouble()));
                                tableView12.addRow(LocaleController.getString(R.string.StarsTransactionFullPrice), replaceStarsWithPlain(starsTransaction3.amount, "⭐️ " + LocaleController.formatNumber(abs2, ','), 0.8f));
                            }
                            context3 = context;
                            i2 = i;
                            tableView = tableView12;
                        } else if (z6) {
                            final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransaction3.starref_peer);
                            tableView12.addRowLink(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarsIntroActivity.$r8$lambda$_RrERp9YKwmIu91kpuMRrq1VWIk(bottomSheetArr3, j);
                                }
                            });
                            i2 = i;
                            tableView12.addRowUser(LocaleController.getString(R.string.StarAffiliate), i2, peerDialogId5, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarsIntroActivity.$r8$lambda$Q1S9j1Mq-eefuyJam-TixcTBvy8(bottomSheetArr3, peerDialogId5);
                                }
                            });
                            tableView12.addRowUser(LocaleController.getString(R.string.StarAffiliateReferredUser), i2, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarsIntroActivity.$r8$lambda$csuf9Cdy-sUOI37q7ZUM6flepIQ(bottomSheetArr3, peerDialogId4);
                                }
                            });
                            tableView12.addRow(LocaleController.getString(R.string.StarAffiliateCommission), AffiliateProgramFragment.percents(starsTransaction3.starref_commission_permille));
                            context3 = context;
                            tableView = tableView12;
                        } else if (z7) {
                            bottomSheetArr4 = bottomSheetArr3;
                            context3 = context;
                            tableView12.addRowLink(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda10
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BotStarsController.getInstance(r0).getConnectedBot(r1, r2, peerDialogId4, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda41
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj) {
                                            StarsIntroActivity.$r8$lambda$-1gNBS7abUvYE_OQhlnhhwW5IvY(r1, r2, r3, r4, r6, (TL_payments.connectedBotStarRef) obj);
                                        }
                                    });
                                }
                            });
                            i2 = i;
                            TableView tableView13 = tableView12;
                            tableView13.addRowUser(LocaleController.getString(R.string.StarAffiliateMiniApp), i2, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda12
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarsIntroActivity.$r8$lambda$0nn0Z8n1ThaLHuZ7S1hDAreDjCQ(bottomSheetArr4, peerDialogId4);
                                }
                            });
                            tableView2 = tableView13;
                        } else {
                            context3 = context;
                            TableView tableView14 = tableView12;
                            bottomSheetArr4 = bottomSheetArr3;
                            if (z5) {
                                tableView14.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda13
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.$r8$lambda$-RJA1IKlB-ZwzeHkVpaZ9gg-EB4(bottomSheetArr4, starsTransaction3, peerDialogId4);
                                    }
                                });
                                tableView14.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeTo), i, UserConfig.getInstance(i).getClientUserId(), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda14
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.$r8$lambda$nY1AL9mt5yQeTz_aj8eKbpZ5x8s(bottomSheetArr4, i);
                                    }
                                });
                                tableView14.addRowLink(LocaleController.getString(R.string.StarGiveawayReason), LocaleController.getString(R.string.StarGiveawayReasonLink), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda15
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.$r8$lambda$K5aoLQnR0i1OzFEjMT7d81gKMDA(bottomSheetArr4, starsTransaction3, peerDialogId4);
                                    }
                                });
                                tableView14.addRow(LocaleController.getString(R.string.StarGiveawayGift), formatStarsAmountString(starsTransaction3.amount));
                            } else if (starsTransaction3.subscription && !z) {
                                i2 = i;
                                tableView14.addRowUser(LocaleController.getString(R.string.StarSubscriptionTo), i2, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda16
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.$r8$lambda$p9IR0r-rjiVLGiCJ5k3b28eFKgY(bottomSheetArr4, peerDialogId4, context3);
                                    }
                                });
                                tableView2 = tableView14;
                            } else if (starsTransaction3.premium_gift) {
                                tableView14.addRowUser(LocaleController.getString(R.string.Gift2To), i, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda17
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.$r8$lambda$PSexWNx2HdW3KaXu6-hbjpsViEA(bottomSheetArr4, peerDialogId4, context3);
                                    }
                                });
                                tableView14.addRow(LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration), LocaleController.formatPluralStringComma("Months", starsTransaction3.premium_gift_months));
                            } else if (!starsTransaction3.posts_search) {
                                i2 = i;
                                tableView14.addRowUser(LocaleController.getString(R.string.StarsTransactionRecipient), i2, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda18
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.$r8$lambda$VNiD53id_Djtqbi-CiksxVpI83A(bottomSheetArr4, peerDialogId4, context3);
                                    }
                                });
                                tableView2 = tableView14;
                            }
                            i2 = i;
                            tableView2 = tableView14;
                        }
                        bottomSheetArr4 = bottomSheetArr3;
                        tableView2 = tableView;
                    } else {
                        context3 = context;
                        i2 = i;
                        bottomSheetArr4 = bottomSheetArr3;
                        if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction3.gift) {
                                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context3, resourcesProvider3);
                                linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                linksTextView.setEllipsize(TextUtils.TruncateAt.END);
                                int i9 = Theme.key_chat_messageLinkIn;
                                linksTextView.setTextColor(Theme.getColor(i9, resourcesProvider3));
                                linksTextView.setLinkTextColor(Theme.getColor(i9, resourcesProvider3));
                                linksTextView.setTextSize(1, 14.0f);
                                linksTextView.setSingleLine(true);
                                linksTextView.setDisablePaddingsOffsetY(true);
                                AvatarSpan avatarSpan = new AvatarSpan(linksTextView, i2, 24.0f);
                                String string5 = LocaleController.getString(z4 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                                CombinedDrawable platformDrawable = StarsTransactionView.getPlatformDrawable("fragment", 24);
                                platformDrawable.setIconSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                                avatarSpan.setImageDrawable(platformDrawable);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) string5));
                                spannableStringBuilder2.setSpan(avatarSpan, 0, 1, 33);
                                spannableStringBuilder2.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarsIntroActivity.10
                                    @Override // android.text.style.ClickableSpan
                                    public void onClick(View view) {
                                        bottomSheetArr4[0].dismiss();
                                        Browser.openUrl(context3, LocaleController.getString(z4 ? R.string.StarsTransactionTONFromFragmentLink : R.string.StarsTransactionUnknownLink));
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public void updateDrawState(TextPaint textPaint) {
                                        textPaint.setUnderlineText(false);
                                    }
                                }, 3, spannableStringBuilder2.length(), 33);
                                linksTextView.setText(spannableStringBuilder2);
                                tableView12.addRowUnpadded(LocaleController.getString(R.string.StarsTransactionRecipient), linksTextView);
                                tableView2 = tableView12;
                            } else {
                                tableView12.addRow(LocaleController.getString(R.string.StarsTransactionSource), LocaleController.getString(R.string.Fragment));
                                tableView2 = tableView12;
                            }
                        } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            tableView12.addRow(LocaleController.getString(R.string.StarsTransactionSource), LocaleController.getString(R.string.AppStore));
                            tableView2 = tableView12;
                        } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            tableView12.addRow(LocaleController.getString(R.string.StarsTransactionSource), LocaleController.getString(R.string.PlayMarket));
                            tableView2 = tableView12;
                        } else {
                            tableView2 = tableView12;
                            if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                tableView12.addRow(LocaleController.getString(R.string.StarsTransactionSource), LocaleController.getString(R.string.StarsTransactionBot));
                                tableView2 = tableView12;
                            }
                        }
                    }
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction3.flags & 256) != 0) {
                    final long peerDialogId6 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z) {
                        peerDialogId6 = j;
                    }
                    chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-peerDialogId6));
                    if (chat != null) {
                        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context3, resourcesProvider3);
                        linksTextView2.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(f));
                        linksTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        int i10 = Theme.key_chat_messageLinkIn;
                        linksTextView2.setTextColor(Theme.getColor(i10, resourcesProvider3));
                        linksTextView2.setLinkTextColor(Theme.getColor(i10, resourcesProvider3));
                        linksTextView2.setTextSize(1, 14.0f);
                        linksTextView2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence);
                        if (!starsTransaction3.extended_media.isEmpty()) {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                            int size = arrayList.size();
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i11);
                                int i13 = i11 + 1;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                z3 = z4;
                                ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(linksTextView2, i2, 24.0f);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    i6 = size;
                                    forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                } else {
                                    i6 = size;
                                    forDocument2 = messageMedia2 instanceof TLRPC.TL_messageMediaDocument ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document) : null;
                                }
                                if (forDocument2 != null) {
                                    imageReceiverSpan.setRoundRadius(6.0f);
                                    imageReceiverSpan.imageReceiver.setImage(forDocument2, "24_24", null, null, null, 0);
                                    SpannableString spannableString = new SpannableString("x");
                                    spannableString.setSpan(imageReceiverSpan, 0, spannableString.length(), 33);
                                    i7 = i6;
                                    spannableStringBuilder3.append((CharSequence) spannableString);
                                    spannableStringBuilder3.append((CharSequence) " ");
                                    i12++;
                                } else {
                                    i7 = i6;
                                }
                                int i14 = i12;
                                if (i14 >= 3) {
                                    break;
                                }
                                i12 = i14;
                                size = i7;
                                arrayList = arrayList2;
                                z4 = z3;
                                i11 = i13;
                            }
                        }
                        z3 = z4;
                        spannableStringBuilder3.append((CharSequence) " ");
                        int length = spannableStringBuilder3.length();
                        String publicUsername = ChatObject.getPublicUsername(chat);
                        if (TextUtils.isEmpty(publicUsername)) {
                            spannableStringBuilder3.append((CharSequence) chat.title);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(MessagesController.getInstance(i2).linkPrefix);
                            String str4 = str;
                            sb.append(str4);
                            sb.append(publicUsername);
                            sb.append(str4);
                            sb.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb.toString());
                        }
                        final Runnable runnable4 = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda19
                            @Override // java.lang.Runnable
                            public final void run() {
                                StarsIntroActivity.$r8$lambda$ipPdXX7asKv2b8XGKXux2lIeVQg(bottomSheetArr4, peerDialogId6, starsTransaction3);
                            }
                        };
                        spannableStringBuilder3.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarsIntroActivity.11
                            @Override // android.text.style.ClickableSpan
                            public void onClick(View view) {
                                runnable4.run();
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public void updateDrawState(TextPaint textPaint) {
                                textPaint.setUnderlineText(false);
                            }
                        }, length, spannableStringBuilder3.length(), 33);
                        linksTextView2.setSingleLine(true);
                        linksTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        linksTextView2.setText(spannableStringBuilder3);
                        linksTextView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda20
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                runnable4.run();
                            }
                        });
                        tableView2.addRowUnpadded(LocaleController.getString(starsTransaction3.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia), linksTextView2);
                        if (!TextUtils.isEmpty(starsTransaction3.id) && !z5) {
                            CharSequence string6 = LocaleController.getString(R.string.StarsTransactionID);
                            String str5 = starsTransaction3.id;
                            tableView2.addRowMonospaced(string6, str5, str5.length() <= 25 ? 9 : 10, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BulletinFactory.of(bottomSheetArr4[0].topBulletinContainer, resourcesProvider3).createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.StarsTransactionIDCopied)).show(false);
                                }
                            });
                        }
                        if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                            tableView2.addRow(LocaleController.getString(R.string.StarsTransactionFloodskipNumberName), LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number));
                        }
                        CharSequence string7 = LocaleController.getString(R.string.StarsTransactionDate);
                        int i15 = R.string.formatDateAtTime;
                        tableView2.addRow(string7, LocaleController.formatString(i15, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))));
                        starGift2 = starsTransaction3.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                addAvailabilityRow(tableView2, i2, starGift2, resourcesProvider3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction3.description)) {
                                tableView2.addFullRow(new SpannableStringBuilder(starsTransaction3.description));
                            }
                        }
                        ViewGroup viewGroup5 = viewGroup2;
                        viewGroup5.addView(tableView2, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                        if ((starsTransaction3.flags & 32) != 0) {
                            tableView2.addRow(LocaleController.getString(R.string.StarsTransactionTONDate), LocaleController.formatString(i15, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.transaction_date * 1000))));
                        }
                        if (z3) {
                            context4 = context;
                        } else {
                            context4 = context;
                            LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context4, resourcesProvider3);
                            linksTextView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
                            linksTextView3.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
                            linksTextView3.setTextSize(1, 14.0f);
                            linksTextView3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda23
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Browser.openUrl(context4, LocaleController.getString(R.string.StarsTOSLink));
                                }
                            }));
                            linksTextView3.setGravity(17);
                            viewGroup5.addView(linksTextView3, LayoutHelper.createLinear(-1, -2, 16.0f, 15.0f, 16.0f, 0.0f));
                        }
                        ButtonWithCounterView round = new ButtonWithCounterView(context4, resourcesProvider3).setRound();
                        if ((starsTransaction3.flags & 32) != 0) {
                            round.setText(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer), false);
                        } else {
                            round.setText(LocaleController.getString(R.string.OK), false);
                        }
                        viewGroup5.addView(round, LayoutHelper.createLinear(-1, 48, 16.0f, 15.0f, 16.0f, 0.0f));
                        BottomSheet.Builder builder3 = builder;
                        builder3.setCustomView(viewGroup5);
                        BottomSheet create = builder3.create();
                        bottomSheetArr4[0] = create;
                        create.useBackgroundTopPadding = false;
                        if ((starsTransaction3.flags & 32) != 0) {
                            round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda24
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Browser.openUrl(context4, starsTransaction3.transaction_url);
                                }
                            });
                        } else {
                            round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda25
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    bottomSheetArr4[0].dismiss();
                                }
                            });
                        }
                        bottomSheetArr4[0].fixNavigationBar();
                        safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
                            bottomSheetArr4[0].makeAttached(safeLastFragment);
                        }
                        bottomSheetArr4[0].show();
                        return bottomSheetArr4[0];
                    }
                }
                z3 = z4;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    CharSequence string62 = LocaleController.getString(R.string.StarsTransactionID);
                    String str52 = starsTransaction3.id;
                    tableView2.addRowMonospaced(string62, str52, str52.length() <= 25 ? 9 : 10, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda21
                        @Override // java.lang.Runnable
                        public final void run() {
                            BulletinFactory.of(bottomSheetArr4[0].topBulletinContainer, resourcesProvider3).createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.StarsTransactionIDCopied)).show(false);
                        }
                    });
                }
                if (starsTransaction3.floodskip) {
                    tableView2.addRow(LocaleController.getString(R.string.StarsTransactionFloodskipNumberName), LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number));
                }
                CharSequence string72 = LocaleController.getString(R.string.StarsTransactionDate);
                int i152 = R.string.formatDateAtTime;
                tableView2.addRow(string72, LocaleController.formatString(i152, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup52 = viewGroup2;
                viewGroup52.addView(tableView2, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z3) {
                }
                ButtonWithCounterView round2 = new ButtonWithCounterView(context4, resourcesProvider3).setRound();
                if ((starsTransaction3.flags & 32) != 0) {
                }
                viewGroup52.addView(round2, LayoutHelper.createLinear(-1, 48, 16.0f, 15.0f, 16.0f, 0.0f));
                BottomSheet.Builder builder32 = builder;
                builder32.setCustomView(viewGroup52);
                BottomSheet create2 = builder32.create();
                bottomSheetArr4[0] = create2;
                create2.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) != 0) {
                }
                bottomSheetArr4[0].fixNavigationBar();
                safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (!AndroidUtilities.isTablet()) {
                    bottomSheetArr4[0].makeAttached(safeLastFragment);
                }
                bottomSheetArr4[0].show();
                return bottomSheetArr4[0];
            }
        }
        builder = builder2;
        bottomSheetArr = bottomSheetArr7;
        charSequence = "";
        final BackupImageView backupImageView2 = new BackupImageView(context);
        if (starsTransaction.premium_gift) {
            setPremiumGiftImage(backupImageView2, backupImageView2.getImageReceiver(), starsTransaction.premium_gift_months);
            linearLayout.addView(backupImageView2, LayoutHelper.createLinear(NotificationCenter.screenshotTook, NotificationCenter.screenshotTook, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            CombinedDrawable createDrawable = SessionCell.createDrawable(100, "search");
            createDrawable.setIconSize(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
            backupImageView2.setImageDrawable(createDrawable);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 != null) {
                if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                    backupImageView2.setImageDrawable(new StarGiftSheet.StarGiftDrawableIcon(backupImageView2, starsTransaction.stargift, 94, 0.44f));
                    linearLayout.addView(backupImageView2, LayoutHelper.createLinear(94, 94, 17, 0, 2, 0, 10));
                } else {
                    setGiftImage(backupImageView2.getImageReceiver(), starsTransaction.stargift, NotificationCenter.screenshotTook);
                    linearLayout.addView(backupImageView2, LayoutHelper.createLinear(NotificationCenter.screenshotTook, NotificationCenter.screenshotTook, 17, 0, -8, 0, 10));
                }
            } else {
                if (z5 || starsTransaction.gift) {
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    viewGroup = linearLayout;
                    str = "/";
                    z2 = z;
                    j2 = j;
                    resourcesProvider2 = resourcesProvider;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        setTonGiftImage(backupImageView2, backupImageView2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        setGiftImage(backupImageView2, backupImageView2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    viewGroup.addView(backupImageView2, LayoutHelper.createLinear(NotificationCenter.screenshotTook, NotificationCenter.screenshotTook, 17, 0, -8, 0, 10));
                } else if (!starsTransaction.extended_media.isEmpty()) {
                    backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        i3 = 0;
                        imageLocation = null;
                        backupImageView2.setImage(imageLocation, "100_100", (ImageLocation) null, (String) null, (Drawable) null, Integer.valueOf(i3));
                        linearLayout.addView(backupImageView2, LayoutHelper.createLinear(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda11
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarsIntroActivity.$r8$lambda$XnFteaku7WSmKmw_rh7NFFxndVE(z, j, starsTransaction, i, resourcesProvider, backupImageView2, linearLayout, view);
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z2 = z;
                        resourcesProvider2 = resourcesProvider;
                        i2 = i;
                        viewGroup = linearLayout;
                        j2 = j;
                        backupImageView2.setOnClickListener(onClickListener);
                        str = "/";
                    }
                    imageLocation = forDocument;
                    i3 = 0;
                    backupImageView2.setImage(imageLocation, "100_100", (ImageLocation) null, (String) null, (Drawable) null, Integer.valueOf(i3));
                    linearLayout.addView(backupImageView2, LayoutHelper.createLinear(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda11
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StarsIntroActivity.$r8$lambda$XnFteaku7WSmKmw_rh7NFFxndVE(z, j, starsTransaction, i, resourcesProvider, backupImageView2, linearLayout, view);
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z2 = z;
                    resourcesProvider2 = resourcesProvider;
                    i2 = i;
                    viewGroup = linearLayout;
                    j2 = j;
                    backupImageView2.setOnClickListener(onClickListener2);
                    str = "/";
                } else {
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    viewGroup = linearLayout;
                    z2 = z;
                    j2 = j;
                    resourcesProvider2 = resourcesProvider;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            backupImageView2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            backupImageView2.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", (Drawable) null, 0, (Object) null);
                            str = "/";
                        } else {
                            backupImageView2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z7) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z2) {
                                j3 = j2;
                                AvatarDrawable avatarDrawable = new AvatarDrawable();
                                if (j3 < 0) {
                                    str = "/";
                                    TLRPC.User user2 = MessagesController.getInstance(i2).getUser(Long.valueOf(j3));
                                    avatarDrawable.setInfo(user2);
                                    backupImageView2.setForUserOrChat(user2, avatarDrawable);
                                } else {
                                    str = "/";
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i2).getChat(Long.valueOf(-j3));
                                    avatarDrawable.setInfo(chat2);
                                    backupImageView2.setForUserOrChat(chat2, avatarDrawable);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            j3 = DialogObject.getPeerDialogId(peer);
                            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                            if (j3 < 0) {
                            }
                        }
                        viewGroup.addView(backupImageView2, LayoutHelper.createLinear(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "/";
                        if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            str2 = "ios";
                        } else if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            str2 = "android";
                        } else if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            str2 = "premiumbot";
                        } else if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            str2 = "fragment";
                        } else if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds) {
                            str2 = "ads";
                        } else if (!(starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI)) {
                            str2 = "?";
                        } else {
                            str2 = "api";
                        }
                        CombinedDrawable createDrawable2 = SessionCell.createDrawable(100, str2);
                        createDrawable2.setIconSize(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                        backupImageView2.setImageDrawable(createDrawable2);
                    }
                }
                TextView textView = new TextView(context2);
                i4 = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i4, resourcesProvider2));
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                textView.setText(getTransactionTitle(i2, z2, starsTransaction2));
                viewGroup.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                TextView textView2 = new TextView(context2);
                textView2.setTextSize(1, 18.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setGravity(17);
                textView2.setTextColor(Theme.getColor(!positive ? Theme.key_color_green : Theme.key_color_red, resourcesProvider2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                textView2.setText(replaceStarsWithPlain(starsAmount5, TextUtils.concat(!positive ? "+" : charSequence, formatStarsAmount(starsAmount5), " ⭐️"), 0.8f));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(textView2.getText());
                if (!starsTransaction2.refund) {
                    appendStatus(spannableStringBuilder4, textView2, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    textView2.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider2));
                    appendStatus(spannableStringBuilder4, textView2, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    textView2.setTextColor(Theme.getColor(Theme.key_color_yellow, resourcesProvider2));
                    appendStatus(spannableStringBuilder4, textView2, LocaleController.getString(R.string.StarsPending));
                }
                textView2.setText(spannableStringBuilder4);
                viewGroup.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    LinkSpanDrawable.LinksTextView linksTextView4 = new LinkSpanDrawable.LinksTextView(context2);
                    linksTextView4.setTextColor(Theme.getColor(i4, resourcesProvider2));
                    linksTextView4.setTextSize(1, 14.0f);
                    linksTextView4.setGravity(17);
                    linksTextView4.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
                    linksTextView4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, AffiliateProgramFragment.percents(1000 - starsTransaction2.starref_commission_permille))));
                    if (j2 == UserConfig.getInstance(i2).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i2).getChat(Long.valueOf(-j2)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda22
                            @Override // java.lang.Runnable
                            public final void run() {
                                StarsIntroActivity.$r8$lambda$zwULHCHSR6XhVIWPoGD8TwBS-pY(j2, i2);
                            }
                        }), true));
                    }
                    linksTextView4.setText(spannableStringBuilder5);
                    viewGroup.addView(linksTextView4, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                    bottomSheetArr2 = bottomSheetArr;
                    TableView tableView72 = new TableView(context2, resourcesProvider2);
                    starGift = starsTransaction2.stargift;
                    if (starGift == null) {
                    }
                    starsTransactionPeer = starsTransaction3.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z3 = z4;
                    if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    }
                    if (starsTransaction3.floodskip) {
                    }
                    CharSequence string722 = LocaleController.getString(R.string.StarsTransactionDate);
                    int i1522 = R.string.formatDateAtTime;
                    tableView2.addRow(string722, LocaleController.formatString(i1522, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))));
                    starGift2 = starsTransaction3.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup522 = viewGroup2;
                    viewGroup522.addView(tableView2, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    if (z3) {
                    }
                    ButtonWithCounterView round22 = new ButtonWithCounterView(context4, resourcesProvider3).setRound();
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    viewGroup522.addView(round22, LayoutHelper.createLinear(-1, 48, 16.0f, 15.0f, 16.0f, 0.0f));
                    BottomSheet.Builder builder322 = builder;
                    builder322.setCustomView(viewGroup522);
                    BottomSheet create22 = builder322.create();
                    bottomSheetArr4[0] = create22;
                    create22.useBackgroundTopPadding = false;
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    bottomSheetArr4[0].fixNavigationBar();
                    safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    bottomSheetArr4[0].show();
                    return bottomSheetArr4[0];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z5 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i2).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i2).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i5 = 1;
                        textView2.setText(replaceStarsWithPlain(starsAmount6, TextUtils.concat(formatStarsAmount(starsAmount6), " ⭐️"), 0.8f));
                    } else {
                        i5 = 1;
                    }
                    LinkSpanDrawable.LinksTextView linksTextView5 = new LinkSpanDrawable.LinksTextView(context2);
                    linksTextView5.setTextColor(Theme.getColor(i4, resourcesProvider2));
                    linksTextView5.setTextSize(i5, 16.0f);
                    linksTextView5.setGravity(17);
                    linksTextView5.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
                    linksTextView5.setDisablePaddingsOffsetY(i5);
                    if (isUserSelf) {
                        int i16 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i5];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i16, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    bottomSheetArr2 = bottomSheetArr;
                    linksTextView5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda26
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarsIntroActivity.$r8$lambda$7PL3orQMT_NP3BhLDG9qZ7s3bhs(context2, bottomSheetArr2);
                        }
                    }), true)));
                    viewGroup.addView(linksTextView5, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    bottomSheetArr2 = bottomSheetArr;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView3 = new TextView(context2);
                        textView3.setTextColor(Theme.getColor(i4, resourcesProvider2));
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity(17);
                        textView3.setText(starsTransaction2.description);
                        viewGroup.addView(textView3, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                TableView tableView722 = new TableView(context2, resourcesProvider2);
                starGift = starsTransaction2.stargift;
                if (starGift == null) {
                }
                starsTransactionPeer = starsTransaction3.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    final long peerDialogId62 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z) {
                    }
                    chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-peerDialogId62));
                    if (chat != null) {
                    }
                }
                z3 = z4;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                }
                if (starsTransaction3.floodskip) {
                }
                CharSequence string7222 = LocaleController.getString(R.string.StarsTransactionDate);
                int i15222 = R.string.formatDateAtTime;
                tableView2.addRow(string7222, LocaleController.formatString(i15222, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup5222 = viewGroup2;
                viewGroup5222.addView(tableView2, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z3) {
                }
                ButtonWithCounterView round222 = new ButtonWithCounterView(context4, resourcesProvider3).setRound();
                if ((starsTransaction3.flags & 32) != 0) {
                }
                viewGroup5222.addView(round222, LayoutHelper.createLinear(-1, 48, 16.0f, 15.0f, 16.0f, 0.0f));
                BottomSheet.Builder builder3222 = builder;
                builder3222.setCustomView(viewGroup5222);
                BottomSheet create222 = builder3222.create();
                bottomSheetArr4[0] = create222;
                create222.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) != 0) {
                }
                bottomSheetArr4[0].fixNavigationBar();
                safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (!AndroidUtilities.isTablet()) {
                }
                bottomSheetArr4[0].show();
                return bottomSheetArr4[0];
            }
        }
        resourcesProvider2 = resourcesProvider;
        context2 = context;
        i2 = i;
        starsTransaction2 = starsTransaction;
        viewGroup = linearLayout;
        str = "/";
        z2 = z;
        j2 = j;
        TextView textView4 = new TextView(context2);
        i4 = Theme.key_dialogTextBlack;
        textView4.setTextColor(Theme.getColor(i4, resourcesProvider2));
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setGravity(17);
        textView4.setText(getTransactionTitle(i2, z2, starsTransaction2));
        viewGroup.addView(textView4, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
        TextView textView22 = new TextView(context2);
        textView22.setTextSize(1, 18.0f);
        textView22.setTypeface(AndroidUtilities.bold());
        textView22.setGravity(17);
        textView22.setTextColor(Theme.getColor(!positive ? Theme.key_color_green : Theme.key_color_red, resourcesProvider2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        textView22.setText(replaceStarsWithPlain(starsAmount52, TextUtils.concat(!positive ? "+" : charSequence, formatStarsAmount(starsAmount52), " ⭐️"), 0.8f));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(textView22.getText());
        if (!starsTransaction2.refund) {
        }
        textView22.setText(spannableStringBuilder42);
        viewGroup.addView(textView22, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        bottomSheetArr2 = bottomSheetArr;
        if (starsTransaction2.description != null) {
            TextView textView32 = new TextView(context2);
            textView32.setTextColor(Theme.getColor(i4, resourcesProvider2));
            textView32.setTextSize(1, 16.0f);
            textView32.setGravity(17);
            textView32.setText(starsTransaction2.description);
            viewGroup.addView(textView32, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
        }
        TableView tableView7222 = new TableView(context2, resourcesProvider2);
        starGift = starsTransaction2.stargift;
        if (starGift == null) {
        }
        starsTransactionPeer = starsTransaction3.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z3 = z4;
        if (!TextUtils.isEmpty(starsTransaction3.id)) {
        }
        if (starsTransaction3.floodskip) {
        }
        CharSequence string72222 = LocaleController.getString(R.string.StarsTransactionDate);
        int i152222 = R.string.formatDateAtTime;
        tableView2.addRow(string72222, LocaleController.formatString(i152222, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))));
        starGift2 = starsTransaction3.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup52222 = viewGroup2;
        viewGroup52222.addView(tableView2, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
        if ((starsTransaction3.flags & 32) != 0) {
        }
        if (z3) {
        }
        ButtonWithCounterView round2222 = new ButtonWithCounterView(context4, resourcesProvider3).setRound();
        if ((starsTransaction3.flags & 32) != 0) {
        }
        viewGroup52222.addView(round2222, LayoutHelper.createLinear(-1, 48, 16.0f, 15.0f, 16.0f, 0.0f));
        BottomSheet.Builder builder32222 = builder;
        builder32222.setCustomView(viewGroup52222);
        BottomSheet create2222 = builder32222.create();
        bottomSheetArr4[0] = create2222;
        create2222.useBackgroundTopPadding = false;
        if ((starsTransaction3.flags & 32) != 0) {
        }
        bottomSheetArr4[0].fixNavigationBar();
        safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet()) {
        }
        bottomSheetArr4[0].show();
        return bottomSheetArr4[0];
    }

    public static /* synthetic */ void $r8$lambda$XnFteaku7WSmKmw_rh7NFFxndVE(boolean z, long j, TL_stars.StarsTransaction starsTransaction, int i, Theme.ResourcesProvider resourcesProvider, final BackupImageView backupImageView, final LinearLayout linearLayout, View view) {
        if (!z) {
            j = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        }
        final long j2 = j;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < starsTransaction.extended_media.size(); i2++) {
            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i2);
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = starsTransaction.msg_id;
            tL_message.dialog_id = j2;
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            tL_message.from_id = tL_peerChannel;
            long j3 = -j2;
            tL_peerChannel.channel_id = j3;
            TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
            tL_message.peer_id = tL_peerChannel2;
            tL_peerChannel2.channel_id = j3;
            tL_message.date = starsTransaction.date;
            tL_message.flags |= 512;
            tL_message.media = messageMedia;
            tL_message.noforwards = true;
            arrayList.add(new MessageObject(i, tL_message, false, false));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        PhotoViewer.getInstance().setParentActivity(LaunchActivity.getLastFragment(), resourcesProvider);
        PhotoViewer.getInstance().openPhoto(arrayList, 0, j2, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider() { // from class: org.telegram.ui.Stars.StarsIntroActivity.9
            @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
            public boolean forceAllInGroup() {
                return true;
            }

            @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i3, boolean z2, boolean z3) {
                ImageReceiver imageReceiver = BackupImageView.this.getImageReceiver();
                int[] iArr = new int[2];
                BackupImageView.this.getLocationInWindow(iArr);
                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                placeProviderObject.viewX = iArr[0];
                placeProviderObject.viewY = iArr[1];
                placeProviderObject.parentView = linearLayout;
                placeProviderObject.animatingImageView = null;
                placeProviderObject.imageReceiver = imageReceiver;
                if (z2) {
                    placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                }
                placeProviderObject.radius = imageReceiver.getRoundRadius(true);
                placeProviderObject.dialogId = j2;
                placeProviderObject.clipTopAddition = 0;
                placeProviderObject.clipBottomAddition = 0;
                return placeProviderObject;
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$zwULHCHSR6XhVIWPoGD8TwBS-pY(long j, int i) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (j >= 0) {
                safeLastFragment.presentFragment(new PrivacyControlActivity(10));
                return;
            }
            long j2 = -j;
            if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i).getChat(Long.valueOf(j2)))) {
                safeLastFragment.presentFragment(new PostSuggestionsEditActivity(j2));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j2);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
            chatUsersActivity.setInfo(MessagesController.getInstance(i).getChatFull(j2));
            safeLastFragment.presentFragment(chatUsersActivity);
        }
    }

    public static /* synthetic */ void $r8$lambda$7PL3orQMT_NP3BhLDG9qZ7s3bhs(Context context, BottomSheet[] bottomSheetArr) {
        BottomSheet bottomSheet;
        BaseFragment baseFragment;
        StarAppsSheet starAppsSheet = new StarAppsSheet(context);
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(bottomSheetArr[0].attachedFragment) && (bottomSheet = bottomSheetArr[0]) != null && (baseFragment = bottomSheet.attachedFragment) != null) {
            starAppsSheet.makeAttached(baseFragment);
        }
        starAppsSheet.show();
    }

    public static /* synthetic */ void $r8$lambda$fQMhWWgBnGNgmShghlmbb77XPAg(ButtonSpan.TextViewButtons textViewButtons, final int i, final Context context, final Theme.ResourcesProvider resourcesProvider, final TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textViewButtons.getText());
            spannableStringBuilder.append((CharSequence) " ").append(ButtonSpan.make(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda48
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    new StarGiftSheet(context, i2, UserConfig.getInstance(i2).getClientUserId(), resourcesProvider).set(savedStarGift, (StarsController.IGiftsList) null).show();
                }
            }, resourcesProvider));
            textViewButtons.setText(spannableStringBuilder);
        }
    }

    public static /* synthetic */ void $r8$lambda$z6029uLjkfSiuWjHimoYCU9kjbI(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public static /* synthetic */ void $r8$lambda$8D3iPuiORhRvfU_OginKQroc44M(BottomSheet[] bottomSheetArr, long j, long j2) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", j);
            if (j == j2) {
                bundle.putBoolean("my_profile", true);
            }
            bundle.putBoolean("open_gifts", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle));
        }
    }

    public static /* synthetic */ void $r8$lambda$EvGo8SDEtLNryPvpxOeqUYlVN2U(BottomSheet[] bottomSheetArr, long j, long j2) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", j);
            if (j == j2) {
                bundle.putBoolean("my_profile", true);
            }
            bundle.putBoolean("open_gifts", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle));
        }
    }

    public static /* synthetic */ void $r8$lambda$6hn_iMyOY89r07iYM9YWg76FlrU(BottomSheet[] bottomSheetArr, TL_stars.StarsTransaction starsTransaction, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if ((starsTransaction.flags & 8192) != 0) {
                safeLastFragment.presentFragment(ChatActivity.of(j, starsTransaction.giveaway_post_id));
            } else {
                safeLastFragment.presentFragment(ChatActivity.of(j));
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$FwyKMEFKgz9Jb0qoH1k8JITszdc(Context context, int i, long j, BottomSheet[] bottomSheetArr) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        Objects.requireNonNull(bottomSheet);
        new GiftSheet(context, i, j, new StarsIntroActivity$$ExternalSyntheticLambda42(bottomSheet)).show();
    }

    public static /* synthetic */ void $r8$lambda$JNtk_W-66tT8hy6JhNUu67YLzwQ(BottomSheet[] bottomSheetArr, int i) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
            bundle.putBoolean("my_profile", true);
            bundle.putBoolean("open_gifts", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle));
        }
    }

    public static /* synthetic */ void $r8$lambda$_IUToQOzpzvbwAo5dB-KoOwLDHs(BottomSheet[] bottomSheetArr, int i) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
            bundle.putBoolean("my_profile", true);
            bundle.putBoolean("open_gifts", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle));
        }
    }

    public static /* synthetic */ void $r8$lambda$ijwwvAb1HAyZEdCFM3nAGJid1YU(BottomSheet[] bottomSheetArr, TL_stars.StarsTransaction starsTransaction, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if ((starsTransaction.flags & 8192) != 0) {
                safeLastFragment.presentFragment(ChatActivity.of(j, starsTransaction.giveaway_post_id));
            } else {
                safeLastFragment.presentFragment(ChatActivity.of(j));
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$wy1kOU9z83jNUQez4ncO4QHItIU(Context context, int i, long j, BottomSheet[] bottomSheetArr) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        Objects.requireNonNull(bottomSheet);
        new GiftSheet(context, i, j, new StarsIntroActivity$$ExternalSyntheticLambda42(bottomSheet)).show();
    }

    public static /* synthetic */ void $r8$lambda$arICYNa0jsYeQfgRMGJO7B296U8(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public static /* synthetic */ void $r8$lambda$_RrERp9YKwmIu91kpuMRrq1VWIk(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(new AffiliateProgramFragment(j));
        }
    }

    public static /* synthetic */ void $r8$lambda$Q1S9j1Mq-eefuyJam-TixcTBvy8(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(j));
        }
    }

    public static /* synthetic */ void $r8$lambda$csuf9Cdy-sUOI37q7ZUM6flepIQ(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(j));
        }
    }

    public static /* synthetic */ void $r8$lambda$-1gNBS7abUvYE_OQhlnhhwW5IvY(BottomSheet[] bottomSheetArr, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider, TL_payments.connectedBotStarRef connectedbotstarref) {
        bottomSheetArr[0].dismiss();
        ChannelAffiliateProgramsFragment.showShareAffiliateAlert(context, i, connectedbotstarref, j, resourcesProvider);
    }

    public static /* synthetic */ void $r8$lambda$0nn0Z8n1ThaLHuZ7S1hDAreDjCQ(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(j));
        }
    }

    public static /* synthetic */ void $r8$lambda$-RJA1IKlB-ZwzeHkVpaZ9gg-EB4(BottomSheet[] bottomSheetArr, TL_stars.StarsTransaction starsTransaction, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if ((starsTransaction.flags & 8192) != 0) {
                safeLastFragment.presentFragment(ChatActivity.of(j, starsTransaction.giveaway_post_id));
            } else {
                safeLastFragment.presentFragment(ChatActivity.of(j));
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$nY1AL9mt5yQeTz_aj8eKbpZ5x8s(BottomSheet[] bottomSheetArr, int i) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
            bundle.putBoolean("my_profile", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle));
        }
    }

    public static /* synthetic */ void $r8$lambda$K5aoLQnR0i1OzFEjMT7d81gKMDA(BottomSheet[] bottomSheetArr, TL_stars.StarsTransaction starsTransaction, long j) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if ((starsTransaction.flags & 8192) != 0) {
                safeLastFragment.presentFragment(ChatActivity.of(j, starsTransaction.giveaway_post_id));
            } else {
                safeLastFragment.presentFragment(ChatActivity.of(j));
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$p9IR0r-rjiVLGiCJ5k3b28eFKgY(BottomSheet[] bottomSheetArr, long j, Context context) {
        bottomSheetArr[0].dismiss();
        if (UserObject.isService(j)) {
            Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public static /* synthetic */ void $r8$lambda$PSexWNx2HdW3KaXu6-hbjpsViEA(BottomSheet[] bottomSheetArr, long j, Context context) {
        bottomSheetArr[0].dismiss();
        if (UserObject.isService(j)) {
            Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public static /* synthetic */ void $r8$lambda$VNiD53id_Djtqbi-CiksxVpI83A(BottomSheet[] bottomSheetArr, long j, Context context) {
        bottomSheetArr[0].dismiss();
        if (UserObject.isService(j)) {
            Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public static /* synthetic */ void $r8$lambda$ipPdXX7asKv2b8XGKXux2lIeVQg(BottomSheet[] bottomSheetArr, long j, TL_stars.StarsTransaction starsTransaction) {
        bottomSheetArr[0].dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            bundle.putInt("message_id", starsTransaction.msg_id);
            safeLastFragment.presentFragment(new ChatActivity(bundle));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02da  */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BottomSheet showSubscriptionSheet(final Context context, final int i, final TL_stars.StarsSubscription starsSubscription, final Theme.ResourcesProvider resourcesProvider) {
        char c;
        BackupImageView backupImageView;
        String str;
        boolean z;
        boolean z2;
        TLRPC.Chat chat;
        BackupImageView backupImageView2;
        TLRPC.Chat chat2;
        boolean[] zArr;
        boolean z3;
        int i2;
        TableView tableView;
        boolean z4;
        boolean z5;
        String str2;
        boolean z6;
        long currentTime;
        ?? r15;
        final int i3;
        BottomSheet.Builder builder;
        BaseFragment safeLastFragment;
        int i4;
        if (starsSubscription == null || context == null) {
            return null;
        }
        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false, resourcesProvider);
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 10));
        final boolean[] zArr2 = new boolean[1];
        final NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity.12
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public void didReceivedNotification(int i5, int i6, Object... objArr) {
                BottomSheet bottomSheet;
                if (i5 == NotificationCenter.starSubscriptionsLoaded && zArr2[0] && (bottomSheet = bottomSheetArr[0]) != null) {
                    bottomSheet.dismiss();
                }
            }
        };
        NotificationCenter.getInstance(i).addObserver(notificationCenterDelegate, NotificationCenter.starSubscriptionsLoaded);
        final long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        BackupImageView backupImageView3 = new BackupImageView(context);
        if (peerDialogId >= 0) {
            c = 0;
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
            String userName = UserObject.getUserName(user);
            boolean isBot = UserObject.isBot(user);
            boolean z7 = !isBot;
            backupImageView = backupImageView3;
            z2 = isBot;
            str = userName;
            z = z7;
            chat = user;
        } else {
            c = 0;
            backupImageView = backupImageView3;
            TLRPC.Chat chat3 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
            str = chat3 == null ? "" : chat3.title;
            z = false;
            z2 = false;
            chat = chat3;
        }
        if (starsSubscription.photo != null) {
            backupImageView2 = backupImageView;
            backupImageView2.setRoundRadius(AndroidUtilities.dp(21.0f));
            backupImageView.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", (Drawable) null, 0, (Object) null);
            chat2 = chat;
            zArr = zArr2;
        } else {
            backupImageView2 = backupImageView;
            backupImageView2.setRoundRadius(AndroidUtilities.dp(50.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            if (peerDialogId >= 0) {
                chat2 = chat;
                zArr = zArr2;
                TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
                avatarDrawable.setInfo(user2);
                backupImageView2.setForUserOrChat(user2, avatarDrawable);
            } else {
                chat2 = chat;
                zArr = zArr2;
                z3 = z;
                TLRPC.Chat chat4 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
                avatarDrawable.setInfo(chat4);
                backupImageView2.setForUserOrChat(chat4, avatarDrawable);
                frameLayout.addView(backupImageView2, LayoutHelper.createFrame(100, 100, 17));
                Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
                if (starsSubscription.photo == null) {
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(drawable);
                    frameLayout.addView(imageView, LayoutHelper.createFrame(28, 28, 17));
                    imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                    imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                    imageView.setScaleX(1.1f);
                    imageView.setScaleY(1.1f);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageDrawable(drawable2);
                    frameLayout.addView(imageView2, LayoutHelper.createFrame(28, 28, 17));
                    imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                    imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                }
                TextView textView = new TextView(context);
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                if (TextUtils.isEmpty(starsSubscription.title)) {
                    textView.setText(starsSubscription.title);
                } else {
                    textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                }
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                i2 = tL_starsSubscriptionPricing.period;
                if (i2 != 2592000) {
                    int i5 = R.string.StarsSubscriptionPrice;
                    Object[] objArr = new Object[1];
                    objArr[c] = Long.valueOf(tL_starsSubscriptionPricing.amount);
                    textView2.setText(replaceStarsWithPlain(LocaleController.formatString(i5, objArr), 0.8f));
                } else {
                    String str3 = i2 == 300 ? "5min" : "min";
                    int i6 = R.string.StarsSubscriptionPrice;
                    Object[] objArr2 = new Object[2];
                    objArr2[c] = Long.valueOf(tL_starsSubscriptionPricing.amount);
                    objArr2[1] = str3;
                    textView2.setText(replaceStarsWithPlain(LocaleController.formatString(i6, objArr2), 0.8f));
                }
                linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
                tableView = new TableView(context, resourcesProvider);
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                linksTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = Theme.key_chat_messageLinkIn;
                linksTextView.setTextColor(Theme.getColor(i7, resourcesProvider));
                linksTextView.setLinkTextColor(Theme.getColor(i7, resourcesProvider));
                linksTextView.setTextSize(1, 14.0f);
                linksTextView.setSingleLine(true);
                linksTextView.setDisablePaddingsOffsetY(true);
                AvatarSpan avatarSpan = new AvatarSpan(linksTextView, i, 24.0f);
                if (peerDialogId < 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
                    z5 = user3 == null || UserObject.isDeleted(user3);
                    str2 = UserObject.getUserName(user3);
                    avatarSpan.setUser(user3);
                    z4 = z2;
                } else {
                    z4 = z2;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
                    z5 = chat5 == null;
                    String str4 = chat5 != null ? chat5.title : "";
                    avatarSpan.setChat(chat5);
                    str2 = str4;
                }
                z6 = z5;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
                spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarsIntroActivity.13
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        bottomSheetArr[0].dismiss();
                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment2 != null) {
                            safeLastFragment2.presentFragment(ChatActivity.of(peerDialogId));
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        textPaint.setUnderlineText(false);
                    }
                }, 3, spannableStringBuilder.length(), 33);
                linksTextView.setText(spannableStringBuilder);
                if (!z6) {
                    if (peerDialogId < 0) {
                        i4 = R.string.StarsSubscriptionChannel;
                    } else {
                        i4 = z3 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot;
                    }
                    tableView.addRowUnpadded(LocaleController.getString(i4), linksTextView);
                }
                if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                    tableView.addRow(LocaleController.getString(!z3 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title);
                }
                CharSequence string = LocaleController.getString(R.string.StarsSubscriptionSince);
                int i8 = R.string.formatDateAtTime;
                tableView.addRow(string, LocaleController.formatString(i8, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))));
                currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                tableView.addRow(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(i8, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))));
                linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 17.0f, 0.0f, 0.0f));
                LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                int i9 = Theme.key_windowBackgroundWhiteGrayText2;
                linksTextView2.setTextColor(Theme.getColor(i9, resourcesProvider));
                linksTextView2.setLinkTextColor(Theme.getColor(i7, resourcesProvider));
                linksTextView2.setTextSize(1, 14.0f);
                linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda69
                    @Override // java.lang.Runnable
                    public final void run() {
                        Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
                    }
                }));
                linksTextView2.setGravity(17);
                linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 14.0f, 15.0f, 14.0f, 7.0f));
                if (currentTime >= starsSubscription.until_date) {
                    if (starsSubscription.can_refulfill) {
                        LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                        linksTextView3.setTextColor(Theme.getColor(i9, resourcesProvider));
                        linksTextView3.setLinkTextColor(Theme.getColor(i7, resourcesProvider));
                        linksTextView3.setTextSize(1, 14.0f);
                        linksTextView3.setText(LocaleController.formatString(z4 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        linksTextView3.setSingleLine(false);
                        linksTextView3.setMaxLines(4);
                        linksTextView3.setGravity(17);
                        linearLayout.addView(linksTextView3, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
                        buttonWithCounterView.setText(LocaleController.getString(z4 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false);
                        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
                        final boolean z8 = z3;
                        final String str5 = str;
                        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda70
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarsIntroActivity.$r8$lambda$laqoFMs_J2ETEpV2XpJ2h5yFzZ8(ButtonWithCounterView.this, i, starsSubscription, bottomSheetArr, peerDialogId, context, resourcesProvider, z8, str5, view);
                            }
                        });
                    } else {
                        final String str6 = str;
                        if (starsSubscription.bot_canceled) {
                            LinkSpanDrawable.LinksTextView linksTextView4 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                            linksTextView4.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                            linksTextView4.setLinkTextColor(Theme.getColor(i7, resourcesProvider));
                            linksTextView4.setTextSize(1, 14.0f);
                            linksTextView4.setText(LocaleController.getString(z3 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            linksTextView4.setSingleLine(false);
                            linksTextView4.setMaxLines(4);
                            linksTextView4.setGravity(17);
                            linearLayout.addView(linksTextView4, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                        } else {
                            if (starsSubscription.canceled) {
                                LinkSpanDrawable.LinksTextView linksTextView5 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                                linksTextView5.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                                linksTextView5.setLinkTextColor(Theme.getColor(i7, resourcesProvider));
                                linksTextView5.setTextSize(1, 14.0f);
                                linksTextView5.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                                linksTextView5.setSingleLine(false);
                                linksTextView5.setMaxLines(4);
                                linksTextView5.setGravity(17);
                                linearLayout.addView(linksTextView5, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                                if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                    final ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, true, resourcesProvider);
                                    buttonWithCounterView2.setText(LocaleController.getString(R.string.StarsSubscriptionRenew), false);
                                    linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48));
                                    final TLRPC.Chat chat6 = chat2;
                                    i3 = i;
                                    buttonWithCounterView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda71
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            StarsIntroActivity.$r8$lambda$ZW2Ilg6RObAVl6CF3AILhSh6aKw(ButtonWithCounterView.this, starsSubscription, i3, bottomSheetArr, chat6, str6, view);
                                        }
                                    });
                                }
                            } else {
                                LinkSpanDrawable.LinksTextView linksTextView6 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                                linksTextView6.setTextColor(Theme.getColor(i9, resourcesProvider));
                                linksTextView6.setLinkTextColor(Theme.getColor(i7, resourcesProvider));
                                linksTextView6.setTextSize(1, 14.0f);
                                linksTextView6.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                                linksTextView6.setSingleLine(false);
                                linksTextView6.setMaxLines(4);
                                linksTextView6.setGravity(17);
                                linearLayout.addView(linksTextView6, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                                final ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(context, false, resourcesProvider);
                                buttonWithCounterView3.setText(LocaleController.getString(R.string.StarsSubscriptionCancel), false);
                                buttonWithCounterView3.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                                linearLayout.addView(buttonWithCounterView3, LayoutHelper.createLinear(-1, 48));
                                final TLRPC.Chat chat7 = chat2;
                                final boolean z9 = z3;
                                final boolean z10 = z4;
                                i3 = i;
                                buttonWithCounterView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda72
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        StarsIntroActivity.$r8$lambda$bMLbQQVepN-FPt99ZGB3iaHKeVg(ButtonWithCounterView.this, starsSubscription, i3, bottomSheetArr, z9, z10, chat7, view);
                                    }
                                });
                            }
                            builder = builder2;
                            r15 = 0;
                            builder.setCustomView(linearLayout);
                            BottomSheet create = builder.create();
                            bottomSheetArr[r15] = create;
                            create.useBackgroundTopPadding = r15;
                            create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda74
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    NotificationCenter.getInstance(i3).removeObserver(notificationCenterDelegate, NotificationCenter.starSubscriptionsLoaded);
                                }
                            });
                            bottomSheetArr[r15].fixNavigationBar();
                            safeLastFragment = LaunchActivity.getSafeLastFragment();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
                                bottomSheetArr[r15].makeAttached(safeLastFragment);
                            }
                            bottomSheetArr[r15].show();
                            return bottomSheetArr[r15];
                        }
                    }
                } else {
                    LinkSpanDrawable.LinksTextView linksTextView7 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                    linksTextView7.setTextColor(Theme.getColor(i9, resourcesProvider));
                    linksTextView7.setLinkTextColor(Theme.getColor(i7, resourcesProvider));
                    linksTextView7.setTextSize(1, 14.0f);
                    linksTextView7.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                    linksTextView7.setSingleLine(false);
                    linksTextView7.setMaxLines(4);
                    linksTextView7.setGravity(17);
                    linearLayout.addView(linksTextView7, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                    if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                        final ButtonWithCounterView round = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
                        r15 = 0;
                        round.setText(LocaleController.getString(R.string.StarsSubscriptionAgain), false);
                        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48));
                        final boolean[] zArr3 = zArr;
                        i3 = i;
                        round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda73
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarsIntroActivity.$r8$lambda$ipbcP8b7a053N5xSEE2QTd_sqIg(ButtonWithCounterView.this, starsSubscription, i3, bottomSheetArr, resourcesProvider, zArr3, context, view);
                            }
                        });
                        builder = builder2;
                        builder.setCustomView(linearLayout);
                        BottomSheet create2 = builder.create();
                        bottomSheetArr[r15] = create2;
                        create2.useBackgroundTopPadding = r15;
                        create2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda74
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                NotificationCenter.getInstance(i3).removeObserver(notificationCenterDelegate, NotificationCenter.starSubscriptionsLoaded);
                            }
                        });
                        bottomSheetArr[r15].fixNavigationBar();
                        safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (!AndroidUtilities.isTablet()) {
                            bottomSheetArr[r15].makeAttached(safeLastFragment);
                        }
                        bottomSheetArr[r15].show();
                        return bottomSheetArr[r15];
                    }
                }
                i3 = i;
                builder = builder2;
                r15 = 0;
                builder.setCustomView(linearLayout);
                BottomSheet create22 = builder.create();
                bottomSheetArr[r15] = create22;
                create22.useBackgroundTopPadding = r15;
                create22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda74
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        NotificationCenter.getInstance(i3).removeObserver(notificationCenterDelegate, NotificationCenter.starSubscriptionsLoaded);
                    }
                });
                bottomSheetArr[r15].fixNavigationBar();
                safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (!AndroidUtilities.isTablet()) {
                }
                bottomSheetArr[r15].show();
                return bottomSheetArr[r15];
            }
        }
        z3 = z;
        frameLayout.addView(backupImageView2, LayoutHelper.createFrame(100, 100, 17));
        Drawable drawable3 = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), PorterDuff.Mode.SRC_IN));
        Drawable drawable22 = context.getResources().getDrawable(R.drawable.star_small_inner);
        if (starsSubscription.photo == null) {
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView3.setTextSize(1, 20.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        if (TextUtils.isEmpty(starsSubscription.title)) {
        }
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TextView textView22 = new TextView(context);
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
        i2 = tL_starsSubscriptionPricing2.period;
        if (i2 != 2592000) {
        }
        linearLayout.addView(textView22, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        tableView = new TableView(context, resourcesProvider);
        LinkSpanDrawable.LinksTextView linksTextView8 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        linksTextView8.setEllipsize(TextUtils.TruncateAt.END);
        int i72 = Theme.key_chat_messageLinkIn;
        linksTextView8.setTextColor(Theme.getColor(i72, resourcesProvider));
        linksTextView8.setLinkTextColor(Theme.getColor(i72, resourcesProvider));
        linksTextView8.setTextSize(1, 14.0f);
        linksTextView8.setSingleLine(true);
        linksTextView8.setDisablePaddingsOffsetY(true);
        AvatarSpan avatarSpan2 = new AvatarSpan(linksTextView8, i, 24.0f);
        if (peerDialogId < 0) {
        }
        z6 = z5;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder2.setSpan(avatarSpan2, 0, 1, 33);
        spannableStringBuilder2.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarsIntroActivity.13
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                bottomSheetArr[0].dismiss();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    safeLastFragment2.presentFragment(ChatActivity.of(peerDialogId));
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, 3, spannableStringBuilder2.length(), 33);
        linksTextView8.setText(spannableStringBuilder2);
        if (!z6) {
        }
        if (peerDialogId >= 0) {
            tableView.addRow(LocaleController.getString(!z3 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title);
        }
        CharSequence string2 = LocaleController.getString(R.string.StarsSubscriptionSince);
        int i82 = R.string.formatDateAtTime;
        tableView.addRow(string2, LocaleController.formatString(i82, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))));
        currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        tableView.addRow(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(i82, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))));
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 17.0f, 0.0f, 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView22 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        int i92 = Theme.key_windowBackgroundWhiteGrayText2;
        linksTextView22.setTextColor(Theme.getColor(i92, resourcesProvider));
        linksTextView22.setLinkTextColor(Theme.getColor(i72, resourcesProvider));
        linksTextView22.setTextSize(1, 14.0f);
        linksTextView22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda69
            @Override // java.lang.Runnable
            public final void run() {
                Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
            }
        }));
        linksTextView22.setGravity(17);
        linearLayout.addView(linksTextView22, LayoutHelper.createLinear(-1, -2, 14.0f, 15.0f, 14.0f, 7.0f));
        if (currentTime >= starsSubscription.until_date) {
        }
        i3 = i;
        builder = builder2;
        r15 = 0;
        builder.setCustomView(linearLayout);
        BottomSheet create222 = builder.create();
        bottomSheetArr[r15] = create222;
        create222.useBackgroundTopPadding = r15;
        create222.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda74
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NotificationCenter.getInstance(i3).removeObserver(notificationCenterDelegate, NotificationCenter.starSubscriptionsLoaded);
            }
        });
        bottomSheetArr[r15].fixNavigationBar();
        safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet()) {
        }
        bottomSheetArr[r15].show();
        return bottomSheetArr[r15];
    }

    public static /* synthetic */ void $r8$lambda$laqoFMs_J2ETEpV2XpJ2h5yFzZ8(final ButtonWithCounterView buttonWithCounterView, final int i, final TL_stars.StarsSubscription starsSubscription, final BottomSheet[] bottomSheetArr, final long j, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, String str, View view) {
        long j2;
        Context context2;
        Theme.ResourcesProvider resourcesProvider2;
        String str2;
        int i2;
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        StarsController starsController = StarsController.getInstance(i);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda80
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.$r8$lambda$jdcOnrH0PgPxKN-XVE-1hEWcFE0(ButtonWithCounterView.this, starsSubscription, i, bottomSheetArr, j);
            }
        };
        if (starsController.balance.amount < starsSubscription.pricing.amount) {
            long j3 = starsSubscription.pricing.amount;
            if (z) {
                j2 = j;
                context2 = context;
                resourcesProvider2 = resourcesProvider;
                str2 = str;
                i2 = 8;
            } else if (j < 0) {
                j2 = j;
                context2 = context;
                resourcesProvider2 = resourcesProvider;
                str2 = str;
                i2 = 2;
            } else {
                j2 = j;
                context2 = context;
                resourcesProvider2 = resourcesProvider;
                str2 = str;
                i2 = 7;
            }
            new StarsNeededSheet(context2, resourcesProvider2, j3, i2, str2, runnable, j2).show();
            return;
        }
        runnable.run();
    }

    public static /* synthetic */ void $r8$lambda$jdcOnrH0PgPxKN-XVE-1hEWcFE0(final ButtonWithCounterView buttonWithCounterView, TL_stars.StarsSubscription starsSubscription, final int i, final BottomSheet[] bottomSheetArr, final long j) {
        buttonWithCounterView.setLoading(true);
        TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
        tL_fulfillStarsSubscription.subscription_id = starsSubscription.id;
        tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        ConnectionsManager.getInstance(i).sendRequest(tL_fulfillStarsSubscription, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda91
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda94
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.$r8$lambda$1aYKVcSuG2LSE-LCq-k6YGGdDaI(ButtonWithCounterView.this, r2, r3, r4);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$1aYKVcSuG2LSE-LCq-k6YGGdDaI(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, int i, long j) {
        buttonWithCounterView.setLoading(false);
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.dismiss();
        }
        StarsController.getInstance(i).invalidateSubscriptions(true);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(ChatActivity.of(j));
    }

    public static /* synthetic */ void $r8$lambda$ZW2Ilg6RObAVl6CF3AILhSh6aKw(final ButtonWithCounterView buttonWithCounterView, TL_stars.StarsSubscription starsSubscription, final int i, final BottomSheet[] bottomSheetArr, final TLObject tLObject, final String str, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
        tL_changeStarsSubscription.canceled = Boolean.FALSE;
        tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        tL_changeStarsSubscription.subscription_id = starsSubscription.id;
        ConnectionsManager.getInstance(i).sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda77
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda85
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.$r8$lambda$9YDO1oz7yQK_v-0iAyFCkVRyg_g(ButtonWithCounterView.this, r2, r3, r4, r5);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$9YDO1oz7yQK_v-0iAyFCkVRyg_g(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, int i, TLObject tLObject, String str) {
        buttonWithCounterView.setLoading(false);
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.dismiss();
        }
        StarsController.getInstance(i).invalidateSubscriptions(true);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createUsersBulletin(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str))).show(false);
        }
    }

    public static /* synthetic */ void $r8$lambda$bMLbQQVepN-FPt99ZGB3iaHKeVg(final ButtonWithCounterView buttonWithCounterView, final TL_stars.StarsSubscription starsSubscription, final int i, final BottomSheet[] bottomSheetArr, final boolean z, final boolean z2, final TLObject tLObject, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
        tL_changeStarsSubscription.canceled = Boolean.TRUE;
        tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        tL_changeStarsSubscription.subscription_id = starsSubscription.id;
        ConnectionsManager.getInstance(i).sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda81
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda92
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.$r8$lambda$HXjjolat772q5MuwE4enDUo5kC4(ButtonWithCounterView.this, r2, r3, r4, r5, r6, r7);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$HXjjolat772q5MuwE4enDUo5kC4(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, int i, boolean z, TL_stars.StarsSubscription starsSubscription, boolean z2, TLObject tLObject) {
        String formatString;
        buttonWithCounterView.setLoading(false);
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.dismiss();
        }
        StarsController.getInstance(i).invalidateSubscriptions(true);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (z && !TextUtils.isEmpty(starsSubscription.title)) {
                formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
            } else if (z2 && !TextUtils.isEmpty(starsSubscription.title)) {
                formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
            } else {
                formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
            }
            BulletinFactory.of(safeLastFragment).createUsersBulletin(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString)).show(false);
        }
    }

    public static /* synthetic */ void $r8$lambda$ipbcP8b7a053N5xSEE2QTd_sqIg(final ButtonWithCounterView buttonWithCounterView, TL_stars.StarsSubscription starsSubscription, final int i, final BottomSheet[] bottomSheetArr, final Theme.ResourcesProvider resourcesProvider, boolean[] zArr, Context context, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        if (starsSubscription.chat_invite_hash != null) {
            final TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
            tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_checkChatInvite, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda78
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda90
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarsIntroActivity.$r8$lambda$v_vgNFcTwMDDVzGV44BUag7-P1M(ButtonWithCounterView.this, tLObject, r3, r4, r5, r6);
                        }
                    });
                }
            });
        } else if (starsSubscription.invoice_slug != null) {
            zArr[0] = true;
            Browser.openUrl(context, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new Browser.Progress() { // from class: org.telegram.ui.Stars.StarsIntroActivity.14
                @Override // org.telegram.messenger.browser.Browser.Progress
                public void end() {
                    ButtonWithCounterView.this.setLoading(false);
                }
            }, null, false, true, false);
        }
    }

    public static /* synthetic */ void $r8$lambda$v_vgNFcTwMDDVzGV44BUag7-P1M(ButtonWithCounterView buttonWithCounterView, TLObject tLObject, BottomSheet[] bottomSheetArr, Theme.ResourcesProvider resourcesProvider, final int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        buttonWithCounterView.setLoading(false);
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
            if (tL_starsSubscriptionPricing == null) {
                BulletinFactory.of(bottomSheetArr[0].topBulletinContainer, resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show(false);
                return;
            } else {
                final long j = tL_starsSubscriptionPricing.amount;
                StarsController.getInstance(i).subscribeTo(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda95
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        StarsIntroActivity.$r8$lambda$AUr_XEXXRDvLDtJmB1NEsAk5IkI(i, j, (String) obj, (Long) obj2);
                    }
                });
                return;
            }
        }
        BulletinFactory.of(bottomSheetArr[0].topBulletinContainer, resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.LinkHashExpired)).show(false);
    }

    public static /* synthetic */ void $r8$lambda$AUr_XEXXRDvLDtJmB1NEsAk5IkI(final int i, final long j, String str, final Long l) {
        if (!"paid".equals(str) || l.longValue() == 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda98
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.$r8$lambda$kkYRwSdQXxOuQRsPGWqHBsjR2RY(l, i, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$kkYRwSdQXxOuQRsPGWqHBsjR2RY(Long l, int i, final long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        final ChatActivity of = ChatActivity.of(l.longValue());
        safeLastFragment.presentFragment(of);
        final TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-l.longValue()));
        if (chat != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda99
                @Override // java.lang.Runnable
                public final void run() {
                    BulletinFactory.of(BaseFragment.this).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j, chat.title))).show(true);
                }
            }, 250L);
        }
    }

    public static BottomSheet showBoostsSheet(final Context context, int i, final long j, final TL_stories.Boost boost, Theme.ResourcesProvider resourcesProvider) {
        if (boost == null || context == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 150, 7, 0, 0, 0, 10));
        StarParticlesView makeParticlesView = makeParticlesView(context, 70, 0);
        frameLayout.addView(makeParticlesView, LayoutHelper.createFrame(-1, -1.0f));
        final GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        gLIconTextureView.setStarParticlesView(makeParticlesView);
        frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(NotificationCenter.activeGroupCallsUpdated, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        gLIconTextureView.setPaused(false);
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TextView textView2 = new TextView(context);
        textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), -6915073));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 11.33f);
        textView2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        StringBuilder sb = new StringBuilder();
        sb.append("x");
        int i2 = boost.multiplier;
        if (i2 == 0) {
            i2 = 1;
        }
        sb.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i2));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_boost_badge, 2);
        coloredImageSpan.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
        textView2.setText(spannableStringBuilder);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 20, 17, 20, 4, 20, 4));
        TableView tableView = new TableView(context, resourcesProvider);
        tableView.addRowUser(LocaleController.getString(R.string.BoostFrom), i, j, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda54
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.$r8$lambda$UJrgeQXB_AWuKvlIikjNUVwiQbk(bottomSheetArr, j);
            }
        });
        tableView.addRow(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]));
        if (boost.giveaway_msg_id != 0) {
            tableView.addRowLink(LocaleController.getString(R.string.BoostReason), LocaleController.getString(R.string.BoostReasonGiveaway), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda55
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.$r8$lambda$7ZsrleWoA0mADFYg-9aN5w130ds(bottomSheetArr, j, boost);
                }
            });
        }
        String string = LocaleController.getString(R.string.BoostDate);
        int i3 = R.string.formatDateAtTime;
        tableView.addRow(string, LocaleController.formatString(i3, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))));
        tableView.addRow(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(i3, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))));
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda56
            @Override // java.lang.Runnable
            public final void run() {
                Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
            }
        }));
        linksTextView.setGravity(17);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 14.0f, 15.0f, 14.0f, 7.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.$r8$lambda$w5wFW-Peug5L7TC-VPFmCvlF4BI(bottomSheetArr, view);
            }
        });
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 8.0f, 16.0f, 0.0f));
        builder.setCustomView(linearLayout);
        BottomSheet create = builder.create();
        bottomSheetArr[0] = create;
        create.useBackgroundTopPadding = false;
        create.fixNavigationBar();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
            bottomSheetArr[0].makeAttached(safeLastFragment);
        }
        gLIconTextureView.setPaused(false);
        bottomSheetArr[0].show();
        bottomSheetArr[0].setOnDismissListener(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda58
            @Override // java.lang.Runnable
            public final void run() {
                GLIconTextureView.this.setPaused(true);
            }
        });
        return bottomSheetArr[0];
    }

    public static /* synthetic */ void $r8$lambda$UJrgeQXB_AWuKvlIikjNUVwiQbk(BottomSheet[] bottomSheetArr, long j) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.dismiss();
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(ChatActivity.of(j));
    }

    public static /* synthetic */ void $r8$lambda$7ZsrleWoA0mADFYg-9aN5w130ds(BottomSheet[] bottomSheetArr, long j, TL_stories.Boost boost) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.dismiss();
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(ChatActivity.of(j, boost.giveaway_msg_id));
    }

    public static /* synthetic */ void $r8$lambda$w5wFW-Peug5L7TC-VPFmCvlF4BI(BottomSheet[] bottomSheetArr, View view) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.dismiss();
        }
    }

    private static CharSequence appendStatus(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ReplacementSpan(textView.getCurrentTextColor(), str) { // from class: org.telegram.ui.Stars.StarsIntroActivity.15
            private final Paint backgroundPaint;
            private final Text layout;
            final /* synthetic */ int val$color;
            final /* synthetic */ String val$string;

            {
                this.val$color = r3;
                this.val$string = str;
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                paint.setColor(Theme.multAlpha(r3, 0.1f));
                this.layout = new Text(str, 13.0f, AndroidUtilities.bold());
            }

            @Override // android.text.style.ReplacementSpan
            public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                return (int) (AndroidUtilities.dp(12.0f) + this.layout.getCurrentWidth());
            }

            @Override // android.text.style.ReplacementSpan
            public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f, (r12 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f + this.layout.getCurrentWidth(), (AndroidUtilities.dp(20.0f) + r12) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.backgroundPaint);
                this.layout.draw(canvas, f + AndroidUtilities.dp(6.0f), (i3 + i5) / 2.0f, this.val$color, 1.0f);
            }
        }, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public static BottomSheet showMediaPriceSheet(final Context context, final long j, final boolean z, final Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
        final BottomSheet[] bottomSheetArr;
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 4.0f, 0.0f, 4.0f, 18.0f));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, resourcesProvider);
        outlineTextContainerView.setForceForceUseCenter(true);
        outlineTextContainerView.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(Theme.getColor(i, resourcesProvider));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        ButtonWithCounterView buttonWithCounterView = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
        editTextBoldCursor.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda60
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                OutlineTextContainerView outlineTextContainerView2 = OutlineTextContainerView.this;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                outlineTextContainerView2.animateSelection(z2, !TextUtils.isEmpty(editTextBoldCursor2.getText()));
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
        outlineTextContainerView.attachEditText(editTextBoldCursor);
        outlineTextContainerView.addView(linearLayout2, LayoutHelper.createFrame(-1, -2, 48));
        linearLayout.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3));
        outlineTextContainerView.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda61
            @Override // java.lang.Runnable
            public final void run() {
                Browser.openUrl(context, LocaleController.getString(R.string.PaidContentInfoLink));
            }
        }), true));
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 14.0f, 3.0f, 14.0f, 24.0f));
        final ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        round.setText(LocaleController.getString(j > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false);
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48));
        if (j > 0 && z) {
            buttonWithCounterView = new ButtonWithCounterView(context, false, resourcesProvider).setRound();
            buttonWithCounterView.setText(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        }
        builder.setCustomView(linearLayout);
        final BottomSheet[] bottomSheetArr2 = {builder.create()};
        editTextBoldCursor.setText(j <= 0 ? "" : Long.toString(j));
        editTextBoldCursor.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.Stars.StarsIntroActivity.16
            private boolean ignore;
            private int shakeDp = 2;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void afterTextChanged(Editable editable) {
                long j2;
                if (this.ignore) {
                    return;
                }
                try {
                    j2 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                } catch (Exception unused) {
                    j2 = 0;
                }
                try {
                    if (j2 > MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax) {
                        this.ignore = true;
                        EditTextBoldCursor editTextBoldCursor2 = EditTextBoldCursor.this;
                        j2 = MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax;
                        editTextBoldCursor2.setText(Long.toString(j2));
                        EditTextBoldCursor editTextBoldCursor3 = EditTextBoldCursor.this;
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.getText().length());
                        OutlineTextContainerView outlineTextContainerView2 = outlineTextContainerView;
                        int i2 = -this.shakeDp;
                        this.shakeDp = i2;
                        AndroidUtilities.shakeViewSpring(outlineTextContainerView2, i2);
                    }
                } catch (Exception unused2) {
                    this.ignore = true;
                    EditTextBoldCursor editTextBoldCursor4 = EditTextBoldCursor.this;
                    long j3 = j;
                    editTextBoldCursor4.setText(j3 <= 0 ? "" : Long.toString(j3));
                    EditTextBoldCursor editTextBoldCursor5 = EditTextBoldCursor.this;
                    editTextBoldCursor5.setSelection(editTextBoldCursor5.getText().length());
                    this.ignore = false;
                    if (!z) {
                    }
                    outlineTextContainerView.animateSelection(EditTextBoldCursor.this.isFocused(), true ^ TextUtils.isEmpty(EditTextBoldCursor.this.getText()));
                    if (j2 != 0) {
                    }
                }
                this.ignore = false;
                if (!z) {
                    round.setEnabled(j2 > 0);
                }
                outlineTextContainerView.animateSelection(EditTextBoldCursor.this.isFocused(), true ^ TextUtils.isEmpty(EditTextBoldCursor.this.getText()));
                if (j2 != 0) {
                    textView2.animate().alpha(0.0f).start();
                    textView2.setText("");
                    return;
                }
                textView2.animate().alpha(1.0f).start();
                textView2.setText("≈" + BillingController.getInstance().formatCurrency((long) ((j2 / 1000.0d) * MessagesController.getInstance(UserConfig.selectedAccount).starsUsdWithdrawRate1000), "USD"));
            }
        });
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda62
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                return StarsIntroActivity.$r8$lambda$PUcLBJ7bNknzy-rHru5RbTP3EEQ(zArr, callback2, round, editTextBoldCursor, bottomSheetArr2, textView3, i2, keyEvent);
            }
        });
        round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.$r8$lambda$1W7CtXtcUz2fAWNaJvsTOrY3G18(zArr, callback2, editTextBoldCursor, round, bottomSheetArr2, view);
            }
        });
        if (buttonWithCounterView != null) {
            final ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
            bottomSheetArr = bottomSheetArr2;
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda64
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarsIntroActivity.$r8$lambda$uEOd_eZkdzAo6jf3OfosQ3Ms8to(zArr, callback2, buttonWithCounterView2, editTextBoldCursor, bottomSheetArr2, view);
                }
            });
        } else {
            bottomSheetArr = bottomSheetArr2;
        }
        bottomSheetArr[0].fixNavigationBar();
        bottomSheetArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda65
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
            }
        });
        bottomSheetArr[0].show();
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda66
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.$r8$lambda$M7B49l2nlUHQOQhvgmJgBU1XyQU(bottomSheetArr, editTextBoldCursor);
            }
        }, lastFragment instanceof ChatActivity ? ((ChatActivity) lastFragment).needEnterText() : false ? 200L : 80L);
        return bottomSheetArr[0];
    }

    public static /* synthetic */ boolean $r8$lambda$PUcLBJ7bNknzy-rHru5RbTP3EEQ(boolean[] zArr, Utilities.Callback2 callback2, ButtonWithCounterView buttonWithCounterView, final EditTextBoldCursor editTextBoldCursor, final BottomSheet[] bottomSheetArr, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        if (zArr[0]) {
            return true;
        }
        if (callback2 != null) {
            zArr[0] = true;
            buttonWithCounterView.setLoading(true);
            callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor.getText().toString())), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda82
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.$r8$lambda$FSHDo5_r5iae7kqpOxT0Ppad5TU(EditTextBoldCursor.this, bottomSheetArr);
                }
            });
            return true;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        bottomSheetArr[0].dismiss();
        return true;
    }

    public static /* synthetic */ void $r8$lambda$FSHDo5_r5iae7kqpOxT0Ppad5TU(EditTextBoldCursor editTextBoldCursor, BottomSheet[] bottomSheetArr) {
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        bottomSheetArr[0].dismiss();
    }

    public static /* synthetic */ void $r8$lambda$1W7CtXtcUz2fAWNaJvsTOrY3G18(boolean[] zArr, Utilities.Callback2 callback2, final EditTextBoldCursor editTextBoldCursor, ButtonWithCounterView buttonWithCounterView, final BottomSheet[] bottomSheetArr, View view) {
        if (zArr[0]) {
            return;
        }
        if (callback2 != null) {
            String obj = editTextBoldCursor.getText().toString();
            zArr[0] = true;
            buttonWithCounterView.setLoading(true);
            callback2.run(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda79
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.$r8$lambda$GlYDQcjXmO82yQsqRy-yzMeiMAI(EditTextBoldCursor.this, bottomSheetArr);
                }
            });
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        bottomSheetArr[0].dismiss();
    }

    public static /* synthetic */ void $r8$lambda$GlYDQcjXmO82yQsqRy-yzMeiMAI(EditTextBoldCursor editTextBoldCursor, BottomSheet[] bottomSheetArr) {
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        bottomSheetArr[0].dismiss();
    }

    public static /* synthetic */ void $r8$lambda$uEOd_eZkdzAo6jf3OfosQ3Ms8to(final boolean[] zArr, Utilities.Callback2 callback2, ButtonWithCounterView buttonWithCounterView, final EditTextBoldCursor editTextBoldCursor, final BottomSheet[] bottomSheetArr, View view) {
        if (zArr[0]) {
            return;
        }
        if (callback2 != null) {
            zArr[0] = true;
            buttonWithCounterView.setLoading(true);
            callback2.run(0L, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda75
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.$r8$lambda$SUA6c15Kw-8xJ4cZLSHlpKgM6Qg(zArr, editTextBoldCursor, bottomSheetArr);
                }
            });
        } else {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            bottomSheetArr[0].dismiss();
        }
    }

    public static /* synthetic */ void $r8$lambda$SUA6c15Kw-8xJ4cZLSHlpKgM6Qg(boolean[] zArr, EditTextBoldCursor editTextBoldCursor, BottomSheet[] bottomSheetArr) {
        zArr[0] = false;
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        bottomSheetArr[0].dismiss();
    }

    public static /* synthetic */ void $r8$lambda$M7B49l2nlUHQOQhvgmJgBU1XyQU(BottomSheet[] bottomSheetArr, final EditTextBoldCursor editTextBoldCursor) {
        bottomSheetArr[0].setFocusable(true);
        editTextBoldCursor.requestFocus();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda83
            @Override // java.lang.Runnable
            public final void run() {
                AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
            }
        });
    }

    public static BottomSheet showGiftResellPriceSheet(Context context, int i, Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
        return showGiftResellPriceSheet(context, i, null, null, callback2, resourcesProvider);
    }

    public static BottomSheet showGiftResellPriceSheet(Context context, int i, TL_stars.StarGift starGift, AmountUtils$Amount amountUtils$Amount, final Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
        if (amountUtils$Amount == null) {
            if (starGift == null) {
                amountUtils$Amount = AmountUtils$Amount.fromDecimal(MessagesController.getInstance(i).config.starsStarGiftResaleAmountMin.get(), AmountUtils$Currency.STARS);
            } else if (starGift.resale_ton_only) {
                amountUtils$Amount = starGift.getResellAmount(AmountUtils$Currency.TON);
            } else {
                amountUtils$Amount = starGift.getResellAmount(AmountUtils$Currency.STARS);
            }
        }
        SellGiftEnterPriceSheet sellGiftEnterPriceSheet = new SellGiftEnterPriceSheet(context, resourcesProvider, i, amountUtils$Amount, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda84
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Utilities.Callback2.this.run((AmountUtils$Amount) obj, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda93
                    @Override // java.lang.Runnable
                    public final void run() {
                        r1[0].dismiss();
                    }
                });
            }
        });
        final SellGiftEnterPriceSheet[] sellGiftEnterPriceSheetArr = {sellGiftEnterPriceSheet};
        sellGiftEnterPriceSheet.show();
        return sellGiftEnterPriceSheetArr[0];
    }

    public static void setGiftImage(ImageReceiver imageReceiver, TLRPC.Document document, int i) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundGray, 0.35f);
        imageReceiver.setImage(ImageLocation.getForDocument(document), i + "_" + i, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), i + "_" + i, svgThumb, 0L, null, null, 0);
    }

    public static void setGiftImage(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i) {
        setGiftImage(imageReceiver, starGift == null ? null : starGift.getDocument(), i);
    }

    public static BottomSheet showSoldOutGiftSheet(Context context, int i, TL_stars.StarGift starGift, Theme.ResourcesProvider resourcesProvider) {
        if (starGift == null || context == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        BackupImageView backupImageView = new BackupImageView(context);
        setGiftImage(backupImageView.getImageReceiver(), starGift, NotificationCenter.screenshotTook);
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(NotificationCenter.screenshotTook, NotificationCenter.screenshotTook, 17, 0, -8, 0, 10));
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
        textView2.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TableView tableView = new TableView(context, resourcesProvider);
        if (starGift.first_sale_date != 0) {
            tableView.addRowDateTime(LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale), starGift.first_sale_date);
        }
        if (starGift.last_sale_date != 0) {
            tableView.addRowDateTime(LocaleController.getString(R.string.Gift2SoldOutSheetLastSale), starGift.last_sale_date);
        }
        tableView.addRow(LocaleController.getString(R.string.Gift2SoldOutSheetValue), replaceStarsWithPlain("⭐️ " + LocaleController.formatNumber(starGift.stars, ','), 0.8f));
        if (starGift.limited) {
            addAvailabilityRow(tableView, i, starGift, resourcesProvider);
        }
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 17.0f, 0.0f, 12.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
        builder.setCustomView(linearLayout);
        final BottomSheet[] bottomSheetArr = {builder.create()};
        bottomSheetArr[0].useBackgroundTopPadding = false;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bottomSheetArr[0].dismiss();
            }
        });
        bottomSheetArr[0].fixNavigationBar();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
            bottomSheetArr[0].makeAttached(safeLastFragment);
        }
        bottomSheetArr[0].show();
        return bottomSheetArr[0];
    }

    public static void addAvailabilityRow(TableView tableView, int i, TL_stars.StarGift starGift, Theme.ResourcesProvider resourcesProvider) {
        CharSequence charSequence;
        final TextView textView = (TextView) ((TableView.TableRowContent) tableView.addRow(LocaleController.getString(R.string.Gift2Availability), "").getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        LoadingSpan loadingSpan = new LoadingSpan(textView, AndroidUtilities.dp(90.0f), 0, resourcesProvider);
        loadingSpan.setColors(Theme.multAlpha(textView.getPaint().getColor(), 0.21f), Theme.multAlpha(textView.getPaint().getColor(), 0.08f));
        spannableStringBuilder.setSpan(loadingSpan, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            StarsController.getInstance(i).getStarGift(starGift.id, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda47
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    StarsIntroActivity.$r8$lambda$6yoR4Iq9GbT6hgJd2aiDqi9-OdE(textView, (TL_stars.StarGift) obj);
                }
            });
            return;
        }
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
            return;
        }
        int i2 = starGift.availability_remains;
        textView.setText(i2 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i2, LocaleController.formatNumber(starGift.availability_total, ',')));
    }

    public static /* synthetic */ void $r8$lambda$6yoR4Iq9GbT6hgJd2aiDqi9-OdE(TextView textView, TL_stars.StarGift starGift) {
        String str;
        if (starGift == null) {
            return;
        }
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                str = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                str = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(str);
            return;
        }
        int i = starGift.availability_remains;
        int i2 = starGift.availability_total;
        textView.setText(i <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", i2) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i, LocaleController.formatNumber(i2, ',')));
    }

    public static String formatTON(long j) {
        if (floatFormat2 == null) {
            floatFormat2 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j % 1000000000 != 0) {
            return floatFormat2.format(j / 1.0E9d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j < 0 ? "-" : "");
        sb.append(LocaleController.formatNumber(Math.abs(j / 1000000000), ','));
        return sb.toString();
    }

    public static CharSequence formatStarsAmount(TL_stars.StarsAmount starsAmount) {
        return formatStarsAmount(starsAmount, 0.777f, ',');
    }

    public static CharSequence formatStarsAmount(TL_stars.StarsAmount starsAmount, float f, char c) {
        double d;
        int i;
        if (floatFormat == null) {
            floatFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j = starsAmount.amount;
            if (j % 1000000000 != 0) {
                String format = floatFormat.format(j / 1.0E9d);
                spannableStringBuilder.append((CharSequence) format);
                int indexOf = format.indexOf(".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f), indexOf, spannableStringBuilder.length(), 33);
                    return spannableStringBuilder;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(starsAmount.negative() ? "-" : "");
                sb.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c));
                spannableStringBuilder.append((CharSequence) sb.toString());
                return spannableStringBuilder;
            }
        } else {
            long j2 = starsAmount.amount;
            int i2 = starsAmount.nanos;
            boolean z = false;
            if (i2 < 0 && j2 > 0) {
                d = 1.0E9d;
                i = -1;
            } else if (i2 <= 0 || j2 >= 0) {
                d = 1.0E9d;
                i = 0;
            } else {
                d = 1.0E9d;
                i = 1;
            }
            long j3 = i + j2;
            if (j2 != 0 ? j2 < 0 : i2 < 0) {
                z = true;
            }
            if (i2 != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z ? "-" : "");
                sb2.append(LocaleController.formatNumber(Math.abs(j3), c));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = floatFormat;
                int i3 = starsAmount.nanos;
                double d2 = i3;
                if (i3 < 0) {
                    d2 += d;
                }
                String format2 = decimalFormat.format(d2 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f), length + 1, spannableStringBuilder.length(), 33);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z ? "-" : "");
                sb3.append(LocaleController.formatNumber(Math.abs(j3), c));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence formatStarsAmountShort(TL_stars.StarsAmount starsAmount) {
        return formatStarsAmountShort(starsAmount, 0.777f, ' ');
    }

    public static CharSequence formatStarsAmountShort(TL_stars.StarsAmount starsAmount, float f, char c) {
        double d;
        int i;
        if (floatFormat == null) {
            floatFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = floatFormat.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j = starsAmount.amount;
            int i2 = starsAmount.nanos;
            if (i2 < 0 && j > 0) {
                i = -1;
                d = 1.0E9d;
            } else if (i2 <= 0 || j >= 0) {
                d = 1.0E9d;
                i = 0;
            } else {
                d = 1.0E9d;
                i = 1;
            }
            long j2 = i + j;
            boolean z = j != 0 ? j < 0 : i2 < 0;
            if (Math.abs(j2) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(z ? "-" : "");
                    sb.append(LocaleController.formatNumber(Math.abs(j2), c));
                    spannableStringBuilder.append((CharSequence) sb.toString());
                    return spannableStringBuilder;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z ? "-" : "");
                sb2.append(AndroidUtilities.formatWholeNumber((int) Math.abs(j2), 0));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(z ? "-" : "");
            sb3.append(LocaleController.formatNumber(Math.abs(j2), c));
            spannableStringBuilder.append((CharSequence) sb3.toString());
            DecimalFormat decimalFormat = floatFormat;
            int i3 = starsAmount.nanos;
            double d2 = i3;
            if (i3 < 0) {
                d2 += d;
            }
            String format2 = decimalFormat.format(d2 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                String substring = format2.substring(indexOf2);
                if (substring.length() > 1) {
                    spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f), length + 1, spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence formatStarsAmountString(TL_stars.StarsAmount starsAmount) {
        return formatStarsAmountString(starsAmount, 0.777f, ',');
    }

    public static CharSequence formatStarsAmountString(TL_stars.StarsAmount starsAmount, float f, char c) {
        double d;
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (floatFormat == null) {
                floatFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = floatFormat.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = starsAmount.amount;
        int i2 = starsAmount.nanos;
        boolean z = false;
        if (i2 < 0 && j > 0) {
            i = -1;
            d = 1.0E9d;
        } else if (i2 <= 0 || j >= 0) {
            d = 1.0E9d;
            i = 0;
        } else {
            d = 1.0E9d;
            i = 1;
        }
        long j2 = i + j;
        if (j != 0 ? j < 0 : i2 < 0) {
            z = true;
        }
        if (i2 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "-" : "");
            sb.append(LocaleController.formatNumber(Math.abs(j2), c));
            spannableStringBuilder.append((CharSequence) sb.toString());
            if (floatFormat == null) {
                floatFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = floatFormat;
            int i3 = starsAmount.nanos;
            double d2 = i3;
            if (i3 < 0) {
                d2 += d;
            }
            String format2 = decimalFormat.format(d2 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f), length + 1, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StarsNano));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", (int) j));
        return spannableStringBuilder;
    }
}
