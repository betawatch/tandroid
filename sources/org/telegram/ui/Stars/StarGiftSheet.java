package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetLayouted;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CompatDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.HorizontalRoundTabsLayout;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.TwoStepVerificationSetupActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotWebViewSheet;

/* loaded from: classes5.dex */
public class StarGiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private final ActionView actionView;
    private Adapter adapter;
    private final LinkSpanDrawable.LinksTextView afterTableTextView;
    private final LinkSpanDrawable.LinksTextView beforeTableTextView;
    private final FrameLayout bottomBulletinContainer;
    private final View bottomView;
    private Utilities.Callback2 boughtGift;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private final View buttonShadow;
    private final CheckBox2 checkbox;
    private final LinearLayout checkboxLayout;
    private final View checkboxSeparator;
    private final TextView checkboxTextView;
    private Runnable closeParentSheet;
    private ContainerView container;
    private HintView2 currentHintView;
    private View currentHintViewTextView;
    private PageTransition currentPage;
    private final long dialogId;
    private FireworksOverlay fireworksOverlay;
    private boolean firstSet;
    private StarsController.IGiftsList giftsList;
    private final int[] heights;
    private final LinearLayout infoLayout;
    private boolean isLearnMore;
    private Float lastTop;
    private StarGiftSheet left;
    private ColoredImageSpan lockSpan;
    private MessageObject messageObject;
    private boolean messageObjectRepolled;
    private boolean messageObjectRepolling;
    private boolean myProfile;
    private ArrayList next_prices;
    private Runnable onGiftUpdatedListener;
    private boolean onlyWearInfo;
    private int overrideNextIndex;
    private View ownerTextView;
    private ArrayList prices;
    private boolean requesting_upgrade_form;
    private boolean resale;
    private StarGiftSheet right;
    private Roller roller;
    private boolean rolling;
    private ArrayList sample_attributes;
    private TL_stars.SavedStarGift savedStarGift;
    private ShareAlert shareAlert;
    private boolean shownWearInfo;
    private String slug;
    private TL_stars.TL_starGiftUnique slugStarGift;
    private final ColoredImageSpan[] starCached;
    private ValueAnimator switchingPagesAnimator;
    private final TableView tableView;
    private final Runnable tickUpgradePriceRunnable;
    private String title;
    private final TopView topView;
    private final FrameLayout underButtonContainer;
    private final LinkSpanDrawable.LinksTextView underButtonLinkTextView;
    private Boolean unsavedFromSavedStarGift;
    private final AffiliateProgramFragment.FeatureCell[] upgradeFeatureCells;
    private ColoredImageSpan upgradeIconSpan;
    private final LinearLayout upgradeLayout;
    private UpgradePricesSheet upgradeSheet;
    private TLRPC.PaymentForm upgrade_form;
    private boolean upgradedOnce;
    private boolean userStarGiftRepolled;
    private boolean userStarGiftRepolling;
    private ViewPagerFixed viewPager;
    private final AffiliateProgramFragment.FeatureCell[] wearFeatureCells;
    private final LinearLayout wearLayout;
    private final TextView wearSubtitle;
    private final TextView wearTitle;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onResellPressed$24(AlertDialog alertDialog, int i) {
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected boolean shouldDrawBackground() {
        return false;
    }

    public StarGiftSheet setOnBoughtGift(Utilities.Callback2 callback2) {
        this.boughtGift = callback2;
        return this;
    }

    public StarGiftSheet(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, j, resourcesProvider, null);
    }

    public StarGiftSheet(final Context context, int i, long j, Theme.ResourcesProvider resourcesProvider, View view) {
        super(context, null, false, false, false, resourcesProvider);
        this.upgradedOnce = false;
        this.heights = new int[2];
        this.overrideNextIndex = -1;
        this.title = "";
        this.currentPage = new PageTransition(0, 0, 1.0f);
        this.firstSet = true;
        this.starCached = new ColoredImageSpan[1];
        this.tickUpgradePriceRunnable = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.tickUpgradePrice();
            }
        };
        this.currentAccount = i;
        this.dialogId = j;
        this.topPadding = 0.2f;
        this.containerView = new FrameLayout(context) { // from class: org.telegram.ui.Stars.StarGiftSheet.1
            @Override // android.view.View
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (StarGiftSheet.this.actionView == null || StarGiftSheet.this.actionView.getVisibility() != 0) {
                    return;
                }
                StarGiftSheet.this.actionView.invalidate();
            }
        };
        this.container = new ContainerView(context);
        2 r5 = new 2(context);
        this.viewPager = r5;
        r5.setAdapter(new ViewPagerFixed.Adapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.3
            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemCount() {
                return (StarGiftSheet.this.hasNeighbour(false) ? 1 : 0) + 1 + (StarGiftSheet.this.hasNeighbour(true) ? 1 : 0);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public View createView(int i2) {
                ContainerView containerView;
                if (i2 == 0) {
                    StarGiftSheet.this.setupNeighbour(false, false);
                    if (StarGiftSheet.this.left == null) {
                        return null;
                    }
                    containerView = StarGiftSheet.this.left.container;
                } else if (i2 == 1) {
                    containerView = StarGiftSheet.this.container;
                } else {
                    if (i2 != 2) {
                        return null;
                    }
                    StarGiftSheet.this.setupNeighbour(true, false);
                    if (StarGiftSheet.this.right == null) {
                        return null;
                    }
                    containerView = StarGiftSheet.this.right.container;
                }
                AndroidUtilities.removeFromParent(containerView);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(containerView, LayoutHelper.createFrame(-1, -1, 119));
                return frameLayout;
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public void bindView(View view2, int i2, int i3) {
                ContainerView containerView;
                if (i3 == 0) {
                    StarGiftSheet.this.setupNeighbour(false, true);
                    if (StarGiftSheet.this.left == null) {
                        return;
                    } else {
                        containerView = StarGiftSheet.this.left.container;
                    }
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    StarGiftSheet.this.setupNeighbour(true, true);
                    if (StarGiftSheet.this.right == null) {
                        return;
                    } else {
                        containerView = StarGiftSheet.this.right.container;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view2;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(containerView);
                frameLayout.addView(containerView);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemViewType(int i2) {
                return (i2 - (StarGiftSheet.this.hasNeighbour(false) ? 1 : 0)) + 1;
            }
        });
        updateViewPager();
        View view2 = new View(context);
        this.bottomView = view2;
        int i2 = Theme.key_dialogBackground;
        view2.setBackgroundColor(getThemedColor(i2));
        this.containerView.addView(view2, LayoutHelper.createFrame(-1, 50, 80));
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
        fixNavigationBar(getThemedColor(i2));
        AndroidUtilities.removeFromParent(this.recyclerListView);
        this.container.addView(this.recyclerListView, LayoutHelper.createFrame(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.infoLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(68.0f));
        this.container.addView(linearLayout, LayoutHelper.createFrame(-1, -1, 55));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.beforeTableTextView = linksTextView;
        int i3 = Theme.key_dialogTextGray2;
        linksTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setGravity(17);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i4 = Theme.key_chat_messageLinkIn;
        linksTextView.setLinkTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView.setDisablePaddingsOffsetY(true);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 4, -2, 4, 16));
        linksTextView.setVisibility(8);
        TableView tableView = new TableView(context, resourcesProvider);
        this.tableView = tableView;
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 12.0f));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.afterTableTextView = linksTextView2;
        linksTextView2.setTextColor(Theme.getColor(i3, resourcesProvider));
        linksTextView2.setTextSize(1, 12.0f);
        linksTextView2.setGravity(17);
        linksTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linksTextView2.setLinkTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView2.setDisablePaddingsOffsetY(true);
        linksTextView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-2, -2, 1, 4, 2, 4, 8));
        linksTextView2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.upgradeLayout = linearLayout2;
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        this.container.addView(linearLayout2, LayoutHelper.createFrame(-1, -1, 55));
        AffiliateProgramFragment.FeatureCell[] featureCellArr = {r10, r1, r0};
        this.upgradeFeatureCells = featureCellArr;
        AffiliateProgramFragment.FeatureCell featureCell = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        int i5 = R.drawable.menu_feature_unique;
        featureCell.set(i5, LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.Gift2UpgradeFeature1Text));
        linearLayout2.addView(featureCellArr[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell2 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell2.set(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2UpgradeFeature2Title), LocaleController.getString(R.string.Gift2UpgradeFeature2Text));
        linearLayout2.addView(featureCellArr[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell3 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell3.set(R.drawable.menu_feature_tradable, LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.Gift2UpgradeFeature3Text));
        linearLayout2.addView(featureCellArr[2], LayoutHelper.createLinear(-1, -2));
        View view3 = new View(context);
        this.checkboxSeparator = view3;
        int i6 = Theme.key_divider;
        view3.setBackgroundColor(Theme.getColor(i6, resourcesProvider));
        linearLayout2.addView(view3, LayoutHelper.createLinear(-2, 1.0f / AndroidUtilities.density, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.checkboxLayout = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 6, 6));
        CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
        this.checkbox = checkBox2;
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(false, false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.checkboxTextView = textView;
        int i7 = Theme.key_dialogTextBlack;
        textView.setTextColor(getThemedColor(i7));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout3.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 4));
        ScaleStateListAnimator.apply(linearLayout3, 0.025f, 1.5f);
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.wearLayout = linearLayout4;
        linearLayout4.setOrientation(1);
        linearLayout4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        this.container.addView(linearLayout4, LayoutHelper.createFrame(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.wearTitle = textView2;
        textView2.setTextColor(Theme.getColor(i7, resourcesProvider));
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        linearLayout4.addView(textView2, LayoutHelper.createLinear(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        this.wearSubtitle = textView3;
        textView3.setTextColor(Theme.getColor(i7, resourcesProvider));
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        linearLayout4.addView(textView3, LayoutHelper.createLinear(-1, -2, 7, 20, 6, 20, 24));
        AffiliateProgramFragment.FeatureCell[] featureCellArr2 = {r8, r8, r8};
        this.wearFeatureCells = featureCellArr2;
        AffiliateProgramFragment.FeatureCell featureCell4 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell4.set(i5, LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text));
        linearLayout4.addView(featureCellArr2[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell5 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell5.set(R.drawable.menu_feature_cover, LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text));
        linearLayout4.addView(featureCellArr2[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell6 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell6.set(R.drawable.menu_verification, LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text));
        linearLayout4.addView(featureCellArr2[2], LayoutHelper.createLinear(-1, -2));
        linearLayout.setAlpha(1.0f);
        linearLayout2.setAlpha(0.0f);
        linearLayout4.setAlpha(0.0f);
        TopView topView = new TopView(context, resourcesProvider, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.onBackPressed();
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                StarGiftSheet.this.onMenuPressed(view4);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                StarGiftSheet.this.onTransferClick(view4);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                StarGiftSheet.this.onWearPressed(view4);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda39
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                StarGiftSheet.this.onSharePressed(view4);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                StarGiftSheet.this.onResellPressed(view4);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                StarGiftSheet.this.onUpdatePriceClick(view4);
            }
        });
        this.topView = topView;
        int i8 = this.backgroundPaddingLeft;
        topView.setPadding(i8, 0, i8, 0);
        this.container.addView(topView, LayoutHelper.createFrame(-1, -2, 55));
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        this.reverseLayout = true;
        linearLayoutManager.setReverseLayout(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i2));
        View view4 = new View(context);
        this.buttonShadow = view4;
        view4.setBackgroundColor(getThemedColor(i6));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
        buttonWithCounterView.setSubText(null, false);
        FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        createFrame.leftMargin = this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f);
        createFrame.rightMargin = this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f);
        frameLayout.addView(buttonWithCounterView, createFrame);
        this.container.addView(frameLayout, LayoutHelper.createFrame(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.underButtonContainer = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i2));
        LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context);
        this.underButtonLinkTextView = linksTextView3;
        linksTextView3.setTextSize(1, 12.0f);
        int i9 = Theme.key_featuredStickers_addButton;
        linksTextView3.setTextColor(Theme.getColor(i9, resourcesProvider));
        linksTextView3.setLinkTextColor(Theme.getColor(i9, resourcesProvider));
        linksTextView3.setGravity(17);
        frameLayout2.addView(linksTextView3, LayoutHelper.createFrame(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        this.container.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Stars.StarGiftSheet.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                StarGiftSheet.this.container.updateTranslations();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda42
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                StarGiftSheet.this.lambda$new$0(view5);
            }
        });
        FireworksOverlay fireworksOverlay = new FireworksOverlay(context);
        this.fireworksOverlay = fireworksOverlay;
        this.container.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bottomBulletinContainer = frameLayout3;
        frameLayout3.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, this.backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
        this.container.addView(frameLayout3, LayoutHelper.createFrame(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.actionBar);
        this.container.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        ActionView actionView = new ActionView(context);
        this.actionView = actionView;
        this.container.addView(actionView, LayoutHelper.createFrame(-1, -2, 55));
        actionView.prepareBlur(view);
    }

    class 2 extends ViewPagerFixed {
        2(Context context) {
            super(context);
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
        @Override // org.telegram.ui.Components.ViewPagerFixed
        protected void swapViews() {
            super.swapViews();
            if (this.currentPosition != StarGiftSheet.this.hasNeighbour(false)) {
                final boolean z = this.currentPosition > StarGiftSheet.this.hasNeighbour(false);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.2.this.lambda$swapViews$0(z);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$swapViews$0(boolean z) {
            TL_stars.SavedStarGift neighbourSavedGift = StarGiftSheet.this.getNeighbourSavedGift(z);
            if (neighbourSavedGift != null) {
                StarGiftSheet.this.firstSet = true;
                StarGiftSheet starGiftSheet = StarGiftSheet.this;
                starGiftSheet.set(neighbourSavedGift, starGiftSheet.giftsList);
            } else {
                TL_stars.TL_starGiftUnique neighbourSlugGift = StarGiftSheet.this.getNeighbourSlugGift(z);
                if (neighbourSlugGift != null) {
                    StarGiftSheet.this.firstSet = true;
                    StarGiftSheet starGiftSheet2 = StarGiftSheet.this;
                    starGiftSheet2.set(neighbourSlugGift.slug, neighbourSlugGift, starGiftSheet2.giftsList);
                }
            }
            StarGiftSheet.this.overrideNextIndex = -1;
            if (Bulletin.getVisibleBulletin() != null) {
                Bulletin.getVisibleBulletin().hide(false, 0L);
            }
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed
        protected void setTranslationX(View view, float f) {
            View view2;
            if (getMeasuredWidth() <= 0) {
                view.setTranslationX(f);
                return;
            }
            float clamp = Utilities.clamp(f / getMeasuredWidth(), 1.0f, -1.0f);
            view.setTranslationX(f + ((-clamp) * 2.0f * ((BottomSheet) StarGiftSheet.this).backgroundPaddingLeft));
            view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * clamp));
            view.setRotationY(clamp * 10.0f);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() > 0) {
                    view2 = frameLayout.getChildAt(0);
                    if (StarGiftSheet.this.left != null && view2 == StarGiftSheet.this.left.container && StarGiftSheet.this.left.actionView != null) {
                        StarGiftSheet.this.left.actionView.invalidate();
                    }
                    if (view2 == StarGiftSheet.this.container && StarGiftSheet.this.actionView != null) {
                        StarGiftSheet.this.actionView.invalidate();
                    }
                    if (StarGiftSheet.this.right == null && view2 == StarGiftSheet.this.right.container && StarGiftSheet.this.right.actionView != null) {
                        StarGiftSheet.this.right.actionView.invalidate();
                        return;
                    }
                    return;
                }
            }
            view2 = null;
            if (StarGiftSheet.this.left != null) {
                StarGiftSheet.this.left.actionView.invalidate();
            }
            if (view2 == StarGiftSheet.this.container) {
                StarGiftSheet.this.actionView.invalidate();
            }
            if (StarGiftSheet.this.right == null) {
            }
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed
        protected boolean canScroll(MotionEvent motionEvent) {
            return StarGiftSheet.this.currentPage == null || StarGiftSheet.this.currentPage.is(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        if (this.button.isLoading()) {
            return;
        }
        this.checkbox.setChecked(!r3.isChecked(), true);
    }

    private class Adapter extends RecyclerListView.SelectionAdapter {
        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        private Adapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new BottomSheetLayouted.SpaceView(StarGiftSheet.this.getContext()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int length = (StarGiftSheet.this.heights.length - 1) - i;
            ((BottomSheetLayouted.SpaceView) viewHolder.itemView).setHeight(StarGiftSheet.this.heights[length], length);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return StarGiftSheet.this.heights.length;
        }

        public void setHeights(int i, int i2) {
            if (StarGiftSheet.this.heights[0] == i && StarGiftSheet.this.heights[1] == i2) {
                return;
            }
            StarGiftSheet.this.heights[0] = i;
            StarGiftSheet.this.heights[1] = i2;
            notifyDataSetChanged();
        }
    }

    private int getListPosition() {
        int indexOf;
        StarsController.IGiftsList iGiftsList = this.giftsList;
        if (iGiftsList == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            indexOf = iGiftsList.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
            if (tL_starGiftUnique != null) {
                indexOf = iGiftsList.indexOf(tL_starGiftUnique);
            }
            return -1;
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift gift = getGift();
        for (int i = 0; i < this.giftsList.getLoadedCount(); i++) {
            Object obj = this.giftsList.get(i);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                if ((savedStarGift2 != null && eq(savedStarGift2, (TL_stars.SavedStarGift) obj)) || (gift != null && eq(gift, (TL_stars.SavedStarGift) obj))) {
                    return i;
                }
            } else if ((obj instanceof TL_stars.TL_starGiftUnique) && eq(this.slugStarGift, (TL_stars.TL_starGiftUnique) obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TL_stars.SavedStarGift getNeighbourSavedGift(boolean z) {
        int listPosition = getListPosition();
        if (listPosition < 0) {
            return null;
        }
        int i = (z ? 1 : -1) + listPosition;
        int i2 = this.overrideNextIndex;
        if (i2 >= 0 && (!z ? i2 < listPosition : i2 > listPosition)) {
            i = i2;
        }
        StarsController.IGiftsList iGiftsList = this.giftsList;
        Object obj = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? null : this.giftsList.get(i);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TL_stars.TL_starGiftUnique getNeighbourSlugGift(boolean z) {
        int listPosition = getListPosition();
        if (listPosition < 0) {
            return null;
        }
        int i = (z ? 1 : -1) + listPosition;
        int i2 = this.overrideNextIndex;
        if (i2 >= 0 && (!z ? i2 < listPosition : i2 > listPosition)) {
            i = i2;
        }
        StarsController.IGiftsList iGiftsList = this.giftsList;
        Object obj = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? null : this.giftsList.get(i);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasNeighbour(boolean z) {
        return (getNeighbourSavedGift(z) == null && getNeighbourSlugGift(z) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    public void setupNeighbour(boolean z, boolean z2) {
        int listPosition = getListPosition();
        if (listPosition < 0) {
            return;
        }
        int i = (z ? 1 : -1) + listPosition;
        int i2 = this.overrideNextIndex;
        if (i2 >= 0 && (!z ? i2 < listPosition : i2 > listPosition)) {
            i = i2;
        }
        StarsController.IGiftsList iGiftsList = this.giftsList;
        TL_stars.SavedStarGift savedStarGift = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? 0 : this.giftsList.get(i);
        if (savedStarGift == 0) {
            return;
        }
        if ((z ? this.right : this.left) != null) {
            if (savedStarGift instanceof TL_stars.SavedStarGift) {
                if (eq((z ? this.right : this.left).savedStarGift, savedStarGift)) {
                    return;
                }
            }
            if (savedStarGift instanceof TL_stars.TL_starGiftUnique) {
                if (eq((z ? this.right : this.left).slugStarGift, (TL_stars.TL_starGiftUnique) savedStarGift)) {
                    return;
                }
            }
        }
        StarGiftSheet starGiftSheet = new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider, this.container.getRootView());
        if (savedStarGift instanceof TL_stars.SavedStarGift) {
            starGiftSheet.set((TL_stars.SavedStarGift) savedStarGift, this.giftsList);
        } else if (savedStarGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) savedStarGift;
            starGiftSheet.set(tL_starGiftUnique.slug, tL_starGiftUnique, this.giftsList);
        }
        AndroidUtilities.removeFromParent(starGiftSheet.containerView);
        if (z) {
            this.right = starGiftSheet;
        } else {
            this.left = starGiftSheet;
        }
    }

    private void updateViewPager() {
        this.viewPager.setPosition(hasNeighbour(false) ? 1 : 0);
        this.viewPager.rebuild(false);
        if (this.giftsList == null || hasNeighbour(true) || this.giftsList.getLoadedCount() >= this.giftsList.getTotalCount()) {
            return;
        }
        this.giftsList.load();
    }

    public boolean eq(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique == null || tL_starGiftUnique2 == null) {
            return false;
        }
        return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
    }

    public boolean eq(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift != null && savedStarGift2 != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            TL_stars.StarGift starGift2 = savedStarGift2.gift;
            if (starGift == starGift2) {
                return true;
            }
            return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
        }
        return false;
    }

    public boolean eq(TL_stars.SavedStarGift savedStarGift, TL_stars.InputSavedStarGift inputSavedStarGift) {
        TL_stars.StarGift starGift;
        if (savedStarGift == null) {
            return false;
        }
        return inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser ? savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id : inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat ? savedStarGift.saved_id == ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id : (inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) && (starGift = savedStarGift.gift) != null && TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug);
    }

    public boolean eq(TL_stars.StarGift starGift, TL_stars.SavedStarGift savedStarGift) {
        if (starGift == null || savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift2 = savedStarGift.gift;
        if (starGift == starGift2) {
            return true;
        }
        return (starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique) && starGift.id == starGift2.id;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        return adapter;
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected CharSequence getTitle() {
        return this.title;
    }

    public static boolean isMine(int i, long j) {
        if (j >= 0) {
            return UserConfig.getInstance(i).getClientUserId() == j;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i).getChat(Long.valueOf(-j)), 5);
    }

    public static boolean isMineWithActions(int i, long j) {
        if (j >= 0) {
            return UserConfig.getInstance(i).getClientUserId() == j;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        return chat != null && chat.creator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMenuPressed(View view) {
        final String link = getLink();
        ItemOptions makeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
        boolean z = (getUniqueGift() == null || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(getUniqueGift().owner_id)) || !(this.giftsList instanceof StarsController.GiftsList) || this.savedStarGift == null || getInputStarGift() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        makeOptions.addIf(z, (savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$onMenuPressed$1();
            }
        }).addIf((getUniqueGift() == null || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(getUniqueGift().owner_id)) || getUniqueGift().resell_amount == null) ? false : true, R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$onMenuPressed$2();
            }
        }).addIf(link != null, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$onMenuPressed$3(link);
            }
        }).addIf(link != null, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$onMenuPressed$4();
            }
        }).addIf(canSetAsTheme(), R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda49
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.openSetAsTheme();
            }
        }).addIf(canTransfer(), R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda50
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.openTransfer();
            }
        }).addIf(this.savedStarGift == null && getDialogId() != 0, R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda51
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.openInProfile();
            }
        }).setDrawScrim(false).setOnTopOfScrim().setDimAlpha(0).translate(0.0f, -AndroidUtilities.dp(2.0f)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMenuPressed$1() {
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            StarsController.GiftsCollections profileGiftCollectionsList = StarsController.getInstance(this.currentAccount).getProfileGiftCollectionsList(this.dialogId, false);
            if (profileGiftCollectionsList != null) {
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                profileGiftCollectionsList.updateGiftsUnsaved(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = getInputStarGift();
            savestargift.unsave = this.savedStarGift.unsaved;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = this.savedStarGift;
        boolean z = savedStarGift3.pinned_to_top;
        if (((StarsController.GiftsList) this.giftsList).togglePinned(savedStarGift3, !z, false)) {
            new ProfileGiftsContainer.UnpinSheet(getContext(), this.dialogId, this.savedStarGift, this.resourcesProvider, new Utilities.Callback0Return() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda105
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    return StarGiftSheet.this.getBulletinFactory();
                }
            }).show();
        } else if (!z) {
            getBulletinFactory().createSimpleBulletin(R.raw.ic_pin, LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle)).show();
        } else {
            getBulletinFactory().createSimpleBulletin(R.raw.ic_unpin, LocaleController.getString(R.string.Gift2Unpinned)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMenuPressed$2() {
        onUpdatePriceClick(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMenuPressed$3(String str) {
        AndroidUtilities.addToClipboard(str);
        getBulletinFactory().createCopyLinkBulletin(false).ignoreDetach().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMenuPressed$4() {
        onSharePressed(null);
    }

    private boolean canSetAsTheme() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null || !uniqueGift.theme_available) {
            return false;
        }
        long peerDialogId = DialogObject.getPeerDialogId(uniqueGift.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(uniqueGift.host_id);
        return (peerDialogId > 0 && isMineWithActions(this.currentAccount, peerDialogId)) || (peerDialogId2 > 0 && isMineWithActions(this.currentAccount, peerDialogId2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openSetAsTheme() {
        lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (safeLastFragment == null || uniqueGift == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putInt("dialogsType", 4);
        final DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda106
            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
            public /* synthetic */ boolean canSelectStories() {
                return DialogsActivity.DialogsActivityDelegate.-CC.$default$canSelectStories(this);
            }

            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, TopicsFragment topicsFragment) {
                boolean lambda$openSetAsTheme$6;
                lambda$openSetAsTheme$6 = StarGiftSheet.this.lambda$openSetAsTheme$6(uniqueGift, dialogsActivity, dialogsActivity2, arrayList, charSequence, z, z2, i, topicsFragment);
                return lambda$openSetAsTheme$6;
            }

            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
            public /* synthetic */ boolean didSelectStories(DialogsActivity dialogsActivity2) {
                return DialogsActivity.DialogsActivityDelegate.-CC.$default$didSelectStories(this, dialogsActivity2);
            }
        });
        safeLastFragment.presentFragment(dialogsActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$openSetAsTheme$6(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final DialogsActivity dialogsActivity, DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, TopicsFragment topicsFragment) {
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(this.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j) {
            AlertsCreator.showGiftThemeApplyConfirm(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda137
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$openSetAsTheme$5(j, tL_starGiftUnique, dialogsActivity);
                }
            });
            return true;
        }
        ChatThemeController.getInstance(this.currentAccount).setDialogTheme(j, ThemeKey.ofGiftSlug(tL_starGiftUnique.slug));
        dialogsActivity.presentFragment(ChatActivity.of(j), true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openSetAsTheme$5(long j, TL_stars.TL_starGiftUnique tL_starGiftUnique, DialogsActivity dialogsActivity) {
        ChatThemeController.getInstance(this.currentAccount).setDialogTheme(j, ThemeKey.ofGiftSlug(tL_starGiftUnique.slug));
        dialogsActivity.presentFragment(ChatActivity.of(j), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWearPressed(View view) {
        if (UserConfig.getInstance(this.currentAccount).isPremium() && (isWorn(this.currentAccount, getUniqueGift()) || this.shownWearInfo)) {
            toggleWear();
            return;
        }
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        TLRPC.Peer peer = uniqueGift.owner_id;
        if (peer == null) {
            peer = uniqueGift.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        this.wearTitle.setText(LocaleController.formatString(R.string.Gift2WearTitle, uniqueGift.title + " #" + LocaleController.formatNumber(uniqueGift.num, ',')));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.lockSpan == null) {
                this.lockSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
            }
            spannableStringBuilder.setSpan(this.lockSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.button.setText(spannableStringBuilder, true);
        this.button.setSubText(null, true);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StarGiftSheet.this.lambda$onWearPressed$7(view2);
            }
        });
        this.topView.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        switchPage(2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onWearPressed$7(View view) {
        this.shownWearInfo = true;
        toggleWear();
    }

    public StarGiftSheet setupWearPage() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return this;
        }
        TLRPC.Peer peer = uniqueGift.owner_id;
        if (peer == null) {
            peer = uniqueGift.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        this.wearTitle.setText(LocaleController.formatString(R.string.Gift2WearTitle, uniqueGift.title + " #" + LocaleController.formatNumber(uniqueGift.num, ',')));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.lockSpan == null) {
                this.lockSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
            }
            spannableStringBuilder.setSpan(this.lockSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.button.setText(spannableStringBuilder, true);
        this.button.setSubText(null, true);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarGiftSheet.this.lambda$setupWearPage$8(view);
            }
        });
        this.topView.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        switchPage(2, false);
        this.onlyWearInfo = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupWearPage$8(View view) {
        this.shownWearInfo = true;
        toggleWear();
    }

    public static boolean isWorn(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        if (peerDialogId == 0) {
            return false;
        }
        if (peerDialogId > 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
            if (user == null) {
                return false;
            }
            TLRPC.EmojiStatus emojiStatus = user.emoji_status;
            return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
        if (chat == null) {
            return false;
        }
        TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
        return (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id;
    }

    public void toggleWear() {
        toggleWear(false);
    }

    public void toggleWear(boolean z) {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean isWorn = isWorn(this.currentAccount, getUniqueGift());
        final boolean z2 = !isWorn;
        if (isWorn(this.currentAccount, getUniqueGift())) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(getDialogId(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long dialogId = getDialogId();
            if (dialogId >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    getBulletinFactory().createSimpleBulletinDetail(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda85
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.this.lambda$toggleWear$9();
                        }
                    })).ignoreDetach().show();
                    return;
                }
            } else if (!z) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                this.button.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(dialogId, new Consumer() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda86
                    @Override // com.google.android.exoplayer2.util.Consumer
                    public final void accept(Object obj) {
                        StarGiftSheet.this.lambda$toggleWear$12(messagesController, dialogId, (TL_stories.TL_premium_boostsStatus) obj);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = uniqueGift.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(getDialogId(), tL_inputEmojiStatusCollectible, uniqueGift);
        }
        this.topView.buttons[1].set(!isWorn ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!isWorn ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.onlyWearInfo) {
            lambda$new$0();
            return;
        }
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda87
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$toggleWear$13(z2);
            }
        };
        if (this.currentPage.is(0)) {
            runnable.run();
        } else {
            switchPage(0, true, runnable);
        }
        this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
        this.button.setSubText(null, !this.firstSet);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarGiftSheet.this.lambda$toggleWear$14(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$9() {
        new PremiumFeatureBottomSheet(getDummyFragment(), 12, false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$12(final MessagesController messagesController, final long j, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus == null || tL_premium_boostsStatus.level >= messagesController.channelEmojiStatusLevelMin) {
            this.button.setLoading(false);
            toggleWear(true);
        } else {
            messagesController.getBoostsController().userCanBoostChannel(j, tL_premium_boostsStatus, new Consumer() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda101
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    StarGiftSheet.this.lambda$toggleWear$11(tL_premium_boostsStatus, j, messagesController, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$11(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.button.setLoading(false);
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(getDummyFragment(), getContext(), 26, this.currentAccount, this.resourcesProvider);
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        final TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j));
        if (chat != null) {
            limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda142
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$toggleWear$10(chat);
                }
            });
        }
        limitReachedBottomSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$10(TLRPC.Chat chat) {
        presentFragment(StatisticActivity.create(chat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$13(boolean z) {
        showHint(AndroidUtilities.replaceTags(LocaleController.formatString(z ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, getGiftName())), this.ownerTextView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$14(View view) {
        onBackPressed();
    }

    private BaseFragment getDummyFragment() {
        return new BaseFragment() { // from class: org.telegram.ui.Stars.StarGiftSheet.5
            @Override // org.telegram.ui.ActionBar.BaseFragment
            public int getCurrentAccount() {
                return this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Context getContext() {
                return StarGiftSheet.this.getContext();
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Activity getParentActivity() {
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Dialog showDialog(Dialog dialog) {
                dialog.show();
                return dialog;
            }
        };
    }

    public void onSharePressed(View view) {
        ShareAlert shareAlert = this.shareAlert;
        if (shareAlert != null && shareAlert.isShown()) {
            this.shareAlert.lambda$new$0();
        }
        String link = getLink();
        ChatActivity chatActivity = null;
        ArrayList arrayList = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        ShareAlert shareAlert2 = new ShareAlert(getContext(), chatActivity, arrayList, link, str, z, link, str2, z2, z3, true, null, this.resourcesProvider) { // from class: org.telegram.ui.Stars.StarGiftSheet.6
            {
                this.includeStoryFromMessage = true;
            }

            @Override // org.telegram.ui.Components.ShareAlert
            protected void onShareStory(View view2) {
                StarGiftSheet.this.repostStory(view2);
            }

            @Override // org.telegram.ui.Components.ShareAlert
            protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
                if (z4) {
                    super.onSend(longSparseArray, i, tL_forumTopic, z4);
                    BulletinFactory bulletinFactory = StarGiftSheet.this.getBulletinFactory();
                    if (bulletinFactory != null) {
                        if (longSparseArray.size() == 1) {
                            long keyAt = longSparseArray.keyAt(0);
                            if (keyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                bulletinFactory.createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedToSavedMessages, new Object[0])), 5000).hideAfterBottomSheet(false).ignoreDetach().show();
                            } else if (keyAt < 0) {
                                bulletinFactory.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-keyAt)).title)), 5000).hideAfterBottomSheet(false).ignoreDetach().show();
                            } else {
                                bulletinFactory.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(keyAt)).first_name)), 5000).hideAfterBottomSheet(false).ignoreDetach().show();
                            }
                        } else {
                            bulletinFactory.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatPluralString("LinkSharedToManyChats", longSparseArray.size(), Integer.valueOf(longSparseArray.size())))).hideAfterBottomSheet(false).ignoreDetach().show();
                        }
                        try {
                            this.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        };
        this.shareAlert = shareAlert2;
        shareAlert2.setDelegate(new ShareAlert.ShareAlertDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet.7
            @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
            public /* synthetic */ void didShare() {
                ShareAlert.ShareAlertDelegate.-CC.$default$didShare(this);
            }

            @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
            public boolean didCopy() {
                StarGiftSheet.this.getBulletinFactory().createCopyLinkBulletin(false).ignoreDetach().show();
                return true;
            }
        });
        this.shareAlert.show();
    }

    public void onUpdatePriceClick(View view) {
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        StarsIntroActivity.showGiftResellPriceSheet(getContext(), this.currentAccount, uniqueGift, null, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda81
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StarGiftSheet.this.lambda$onUpdatePriceClick$18(uniqueGift, (AmountUtils$Amount) obj, (Runnable) obj2);
            }
        }, this.resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdatePriceClick$18(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable) {
        TL_stars.StarsAmount tl = amountUtils$Amount.toTl();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = tl;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda117
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$onUpdatePriceClick$17(tL_starGiftUnique, amountUtils$Amount, runnable, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdatePriceClick$17(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda132
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onUpdatePriceClick$15(tL_starGiftUnique, amountUtils$Amount, runnable);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda133
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onUpdatePriceClick$16(tL_error, runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdatePriceClick$15(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable) {
        tL_starGiftUnique.flags |= 16;
        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        tL_starGiftUnique.resale_ton_only = amountUtils$Currency == amountUtils$Currency2;
        ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
        tL_starGiftUnique.resell_amount = arrayList;
        arrayList.add(amountUtils$Amount.convertTo(AmountUtils$Currency.STARS).toTl());
        tL_starGiftUnique.resell_amount.add(amountUtils$Amount.convertTo(amountUtils$Currency2).toTl());
        this.topView.setResellPrice(amountUtils$Amount);
        Runnable runnable2 = this.onGiftUpdatedListener;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdatePriceClick$16(TLRPC.TL_error tL_error, Runnable runnable) {
        getBulletinFactory().showForError(tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onResellPressed(View view) {
        if (view.getAlpha() < 0.99f) {
            cantWithBlockchainGiftAlert(1);
            return;
        }
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        if (uniqueGift.resell_amount != null) {
            new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.formatString(R.string.Gift2UnlistTitle, getGiftName())).setMessage(LocaleController.getString(R.string.Gift2UnlistText)).setPositiveButton(LocaleController.getString(R.string.Gift2ActionUnlist), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda53
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    StarGiftSheet.this.lambda$onResellPressed$23(uniqueGift, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda54
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    StarGiftSheet.lambda$onResellPressed$24(alertDialog, i);
                }
            }).show();
        } else if (canResellAt() > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            showTimeoutAlertAt(getContext(), true, canResellAt());
        } else {
            StarsIntroActivity.showGiftResellPriceSheet(getContext(), this.currentAccount, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda55
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    StarGiftSheet.this.lambda$onResellPressed$29(uniqueGift, (AmountUtils$Amount) obj, (Runnable) obj2);
                }
            }, this.resourcesProvider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$23(final TL_stars.TL_starGiftUnique tL_starGiftUnique, AlertDialog alertDialog, int i) {
        final Browser.Progress makeButtonLoading = alertDialog.makeButtonLoading(-1);
        makeButtonLoading.init();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda108
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$onResellPressed$22(makeButtonLoading, tL_starGiftUnique, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$22(final Browser.Progress progress, final TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda128
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$19(progress, tL_starGiftUnique);
                }
            });
        } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            final long parseLong = Long.parseLong(tL_error.text.substring(26));
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda129
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$20(progress, parseLong);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda130
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$21(progress, tL_error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$19(Browser.Progress progress, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        progress.end();
        tL_starGiftUnique.flags &= -17;
        tL_starGiftUnique.resale_ton_only = false;
        tL_starGiftUnique.resell_amount = null;
        this.topView.setResellPrice(AmountUtils$Amount.fromNano(0L, AmountUtils$Currency.STARS));
        Runnable runnable = this.onGiftUpdatedListener;
        if (runnable != null) {
            runnable.run();
        }
        getBulletinFactory().createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.Gift2ResaleDisable, getGiftName())).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$20(Browser.Progress progress, long j) {
        progress.end();
        showTimeoutAlert(getContext(), true, (int) j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$21(Browser.Progress progress, TLRPC.TL_error tL_error) {
        progress.end();
        getBulletinFactory().showForError(tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$29(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable) {
        TL_stars.StarsAmount tl = amountUtils$Amount.toTl();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = tl;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda115
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$onResellPressed$28(tL_starGiftUnique, amountUtils$Amount, runnable, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$28(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda124
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$25(tL_starGiftUnique, amountUtils$Amount, runnable);
                }
            });
        } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            final long parseLong = Long.parseLong(tL_error.text.substring(26));
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda125
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$26(parseLong, runnable);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda126
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$27(tL_error, runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$25(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable) {
        tL_starGiftUnique.flags |= 16;
        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        tL_starGiftUnique.resale_ton_only = amountUtils$Currency == amountUtils$Currency2;
        ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
        tL_starGiftUnique.resell_amount = arrayList;
        arrayList.add(amountUtils$Amount.convertTo(AmountUtils$Currency.STARS).toTl());
        tL_starGiftUnique.resell_amount.add(amountUtils$Amount.convertTo(amountUtils$Currency2).toTl());
        this.topView.setResellPrice(amountUtils$Amount);
        Runnable runnable2 = this.onGiftUpdatedListener;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (runnable != null) {
            runnable.run();
        }
        getBulletinFactory().createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.Gift2ResaleEnable, getGiftName())).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$26(long j, Runnable runnable) {
        showTimeoutAlert(getContext(), true, (int) j);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$27(TLRPC.TL_error tL_error, Runnable runnable) {
        getBulletinFactory().showForError(tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void repostStory(final View view) {
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null) {
            return;
        }
        StoryRecorder.SourceView fromShareCell = view instanceof ShareDialogCell ? StoryRecorder.SourceView.fromShareCell((ShareDialogCell) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(getGift() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) getGift();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(this.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(this.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        final StoryRecorder storyRecorder = StoryRecorder.getInstance(launchActivity, this.currentAccount);
        storyRecorder.setOnPrepareCloseListener(new Utilities.Callback4() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda89
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                StarGiftSheet.this.lambda$repostStory$31(storyRecorder, view, (Long) obj, (Runnable) obj2, (Boolean) obj3, (Long) obj4);
            }
        });
        storyRecorder.openRepost(fromShareCell, StoryEntry.repostMessage(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repostStory$31(StoryRecorder storyRecorder, View view, Long l, Runnable runnable, Boolean bool, final Long l2) {
        boolean booleanValue = bool.booleanValue();
        StoryRecorder.SourceView sourceView = null;
        if (booleanValue) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda109
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$repostStory$30(l2);
                }
            });
            storyRecorder.replaceSourceView(null);
            ShareAlert shareAlert = this.shareAlert;
            if (shareAlert != null) {
                shareAlert.lambda$new$0();
                this.shareAlert = null;
            }
        } else {
            if ((view instanceof ShareDialogCell) && view.isAttachedToWindow()) {
                sourceView = StoryRecorder.SourceView.fromShareCell((ShareDialogCell) view);
            }
            storyRecorder.replaceSourceView(sourceView);
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repostStory$30(Long l) {
        String str;
        String formatString;
        TLRPC.Chat chat;
        if (l.longValue() < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-l.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        BulletinFactory bulletinFactory = getBulletinFactory();
        int i = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            formatString = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            formatString = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        bulletinFactory.createSimpleBulletin(i, AndroidUtilities.replaceTags(formatString)).ignoreDetach().show();
    }

    private void showTimeoutAlertAt(Context context, boolean z, int i) {
        showTimeoutAlert(context, z, i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
    }

    private void showTimeoutAlert(Context context, boolean z, int i) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(64.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(64, 64, 49, 0, 6, 0, 0));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(R.raw.timer_3, 42, 42);
        frameLayout.addView(rLottieImageView, LayoutHelper.createLinear(64, 64, 17));
        rLottieImageView.playAnimation();
        TextView makeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_windowBackgroundWhiteBlackText, true);
        makeTextView.setGravity(17);
        makeTextView.setText(LocaleController.getString(z ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        linearLayout.addView(makeTextView, LayoutHelper.createLinear(-1, -2, 48, 24, 14, 24, 0));
        TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText8, false);
        makeTextView2.setGravity(17);
        makeTextView2.setText(LocaleController.formatString(z ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i))));
        linearLayout.addView(makeTextView2, LayoutHelper.createLinear(-1, -2, 48, 24, 6, 24, 6));
        new AlertDialog.Builder(context, this.resourcesProvider).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected int getActionBarProgressHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    private class ContainerView extends FrameLayout {
        private final Paint backgroundPaint;
        private float dimAlpha;
        private final Path path;
        private final RectF rect;

        public ContainerView(Context context) {
            super(context);
            this.rect = new RectF();
            this.backgroundPaint = new Paint(1);
            this.path = new Path();
            this.dimAlpha = 0.0f;
            setWillNotDraw(false);
            setClipChildren(false);
            setClipToPadding(false);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < top() && ((BottomSheet) StarGiftSheet.this).containerView.isAttachedToWindow()) {
                StarGiftSheet.this.lambda$new$0();
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            StarGiftSheet.this.preDrawInternal(canvas, this);
            canvas.save();
            float pVar = top();
            float dp = AndroidUtilities.dp(12.0f);
            this.rect.set(((BottomSheet) StarGiftSheet.this).backgroundPaddingLeft, pVar, getWidth() - ((BottomSheet) StarGiftSheet.this).backgroundPaddingLeft, getHeight() + dp);
            this.backgroundPaint.setColor(StarGiftSheet.this.getThemedColor(Theme.key_dialogBackground));
            this.path.rewind();
            this.path.addRoundRect(this.rect, dp, dp, Path.Direction.CW);
            canvas.drawPath(this.path, this.backgroundPaint);
            super.dispatchDraw(canvas);
            float f = this.dimAlpha;
            if (f != 0.0f) {
                canvas.drawColor(Theme.multAlpha(-16777216, f));
            }
            updateTranslations();
            canvas.restore();
            drawView(canvas, ((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar);
            StarGiftSheet.this.postDrawInternal(canvas, this);
        }

        private void drawView(Canvas canvas, View view) {
            if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
                return;
            }
            if (view.getAlpha() < 1.0f) {
                canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight(), (int) (((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar.getAlpha() * 255.0f), 31);
            } else {
                canvas.save();
                canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + ((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar.getMeasuredHeight());
            }
            canvas.translate(view.getX(), view.getY());
            view.draw(canvas);
            canvas.restore();
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == ((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar) {
                return false;
            }
            if (view != StarGiftSheet.this.actionView) {
                canvas.save();
                canvas.clipPath(this.path);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (StarGiftSheet.this.adapter != null) {
                StarGiftSheet.this.adapter.setHeights(StarGiftSheet.this.topView.getFinalHeight(), StarGiftSheet.this.getBottomView().getMeasuredHeight() + ((StarGiftSheet.this.currentPage.to(1) && StarGiftSheet.this.underButtonContainer.getVisibility() == 0) ? StarGiftSheet.this.underButtonContainer.getMeasuredHeight() : 0));
            }
            StarGiftSheet.this.onSwitchedPage();
        }

        public void updateTranslations() {
            float pVar = top();
            StarGiftSheet.this.actionView.setTranslationY(pVar - StarGiftSheet.this.actionView.getHeight());
            float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(pVar - StarGiftSheet.this.actionView.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
            StarGiftSheet.this.actionView.setAlpha(StarGiftSheet.this.currentPage.at(0) * clamp01);
            StarGiftSheet.this.actionView.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
            StarGiftSheet.this.actionView.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
            StarGiftSheet.this.topView.setTranslationY(pVar);
            StarGiftSheet.this.infoLayout.setTranslationY(StarGiftSheet.this.topView.getRealHeight() + pVar);
            StarGiftSheet.this.upgradeLayout.setTranslationY(StarGiftSheet.this.topView.getRealHeight() + pVar);
            StarGiftSheet.this.wearLayout.setTranslationY(pVar + StarGiftSheet.this.topView.getRealHeight());
            FrameLayout frameLayout = StarGiftSheet.this.topBulletinContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY((getTranslationY() - height()) - AndroidUtilities.navigationBarHeight);
            }
            AndroidUtilities.updateViewVisibilityAnimated(StarGiftSheet.this.buttonShadow, ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.canScrollVertically(1));
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            FrameLayout frameLayout = StarGiftSheet.this.topBulletinContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY((getTranslationY() - height()) - AndroidUtilities.navigationBarHeight);
            }
        }

        public float height() {
            return StarGiftSheet.this.topView.getRealHeight() + 0.0f + (StarGiftSheet.this.currentPage.at(0) * StarGiftSheet.this.infoLayout.getMeasuredHeight()) + (StarGiftSheet.this.currentPage.at(1) * StarGiftSheet.this.upgradeLayout.getMeasuredHeight()) + (StarGiftSheet.this.currentPage.at(2) * StarGiftSheet.this.wearLayout.getMeasuredHeight());
        }

        public float top() {
            float max = Math.max(0.0f, getHeight() - height());
            int childCount = ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.getChildAt(childCount);
                int childAdapterPosition = ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    if (childAdapterPosition == 2) {
                        max = childAt.getTop() + childAt.getTranslationY() + childAt.getHeight();
                        break;
                    }
                    if (childAdapterPosition == 1) {
                        max = childAt.getY();
                        break;
                    }
                    if (childAdapterPosition == 0) {
                        max = childAt.getY() - StarGiftSheet.this.topView.getRealHeight();
                        break;
                    }
                }
                childCount--;
            }
            return (StarGiftSheet.this.lastTop == null || StarGiftSheet.this.currentPage == null || StarGiftSheet.this.currentPage.progress >= 1.0f) ? max : AndroidUtilities.lerp(StarGiftSheet.this.lastTop.floatValue(), max, StarGiftSheet.this.currentPage.progress);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            ((BottomSheetWithRecyclerListView) StarGiftSheet.this).contentHeight = size;
            int size2 = View.MeasureSpec.getSize(i);
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (!(childAt instanceof HintView2)) {
                    if (childAt == ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView) {
                        childAt.measure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                    } else {
                        childAt.measure(i, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
                    }
                } else {
                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                }
            }
            setMeasuredDimension(size2, size);
            if (StarGiftSheet.this.adapter != null) {
                Adapter adapter = StarGiftSheet.this.adapter;
                int finalHeight = StarGiftSheet.this.topView.getFinalHeight();
                int measuredHeight = StarGiftSheet.this.getBottomView().getMeasuredHeight();
                if (StarGiftSheet.this.currentPage.to(1) && StarGiftSheet.this.underButtonContainer.getVisibility() == 0) {
                    i3 = StarGiftSheet.this.underButtonContainer.getMeasuredHeight();
                }
                adapter.setHeights(finalHeight, measuredHeight + i3);
            }
        }
    }

    private static class StickersRollView extends View {
        private Roller.Sticker a;
        private boolean aIsFinish;
        private float aT;
        private Roller.Sticker b;
        private boolean bIsFinish;
        private float bT;
        private Roller.Background bgA;
        private boolean bgAIsFinish;
        private float bgAT;
        private Roller.Background bgB;
        private boolean bgBIsFinish;
        private float bgBT;
        private Roller.Background bgC;
        private boolean bgCIsFinish;
        private float bgCT;
        private Roller.Sticker c;
        private boolean cIsFinish;
        private float cT;
        private final Camera camera;
        private final GradientClip clip;
        private int lastBlurRx;
        private final RectF rect;
        private final Theme.ResourcesProvider resourcesProvider;

        public StickersRollView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.lastBlurRx = 0;
            this.camera = new Camera();
            this.clip = new GradientClip();
            this.rect = new RectF();
            this.resourcesProvider = resourcesProvider;
        }

        @Override // android.view.View
        protected void dispatchDraw(Canvas canvas) {
            drawSticker(canvas, this.a, this.aT, this.aIsFinish);
            drawSticker(canvas, this.b, this.bT, this.bIsFinish);
            drawSticker(canvas, this.c, this.cT, this.cIsFinish);
        }

        public void resetDrawing() {
            boolean z = (this.a == null && this.b == null && this.c == null && this.bgA == null && this.bgB == null && this.bgC == null) ? false : true;
            this.c = null;
            this.b = null;
            this.a = null;
            this.cT = 0.0f;
            this.bT = 0.0f;
            this.aT = 0.0f;
            this.cIsFinish = false;
            this.bIsFinish = false;
            this.aIsFinish = false;
            this.bgC = null;
            this.bgB = null;
            this.bgA = null;
            this.bgCT = 0.0f;
            this.bgBT = 0.0f;
            this.bgAT = 0.0f;
            this.bgCIsFinish = false;
            this.bgBIsFinish = false;
            this.bgAIsFinish = false;
            if (z) {
                invalidate();
            }
        }

        public void setDrawing(Roller.Sticker sticker, float f, boolean z, Roller.Sticker sticker2, float f2, boolean z2, Roller.Sticker sticker3, float f3, boolean z3, Roller.Background background, float f4, boolean z4, Roller.Background background2, float f5, boolean z5, Roller.Background background3, float f6, boolean z6) {
            this.a = sticker;
            this.b = sticker2;
            this.c = sticker3;
            this.aT = f;
            this.bT = f2;
            this.cT = f3;
            this.aIsFinish = z;
            this.bIsFinish = z2;
            this.cIsFinish = z3;
            this.bgA = background;
            this.bgB = background2;
            this.bgC = background3;
            this.bgAT = f4;
            this.bgBT = f5;
            this.bgCT = f6;
            this.bgAIsFinish = z4;
            this.bgBIsFinish = z5;
            this.bgCIsFinish = z6;
            invalidate();
        }

        public boolean hasBackgrounds() {
            return (this.bgA == null && this.bgB == null && this.bgC == null) ? false : true;
        }

        private void drawSticker(Canvas canvas, Roller.Sticker sticker, float f, boolean z) {
            if (sticker == null) {
                return;
            }
            float max = z ? Math.max(0.5f, f) : f;
            float imageX = sticker.imageReceiver.getImageX();
            float imageY = sticker.imageReceiver.getImageY();
            float imageWidth = sticker.imageReceiver.getImageWidth();
            float imageHeight = sticker.imageReceiver.getImageHeight();
            float alpha = sticker.imageReceiver.getAlpha();
            float f2 = (max - 0.5f) / 1.5f;
            float clamp01 = Utilities.clamp01(1.0f - Math.abs(f2));
            float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f2);
            float dp = AndroidUtilities.dp(80.0f);
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, clamp01);
            float dp2 = AndroidUtilities.dp(160.0f);
            canvas.save();
            float f3 = ((dp2 / 2.0f) * f2) + width;
            canvas.translate(f3, dp);
            this.camera.save();
            this.camera.rotateY(f2 * (-30.0f));
            this.camera.applyToCanvas(canvas);
            this.camera.restore();
            canvas.translate(-f3, -dp);
            float f4 = dp2 * lerp;
            float f5 = f4 / 2.0f;
            sticker.imageReceiver.setImageCoords(width - f5, dp - f5, f4, f4);
            sticker.imageReceiver.setAlpha(clamp01);
            sticker.imageReceiver.draw(canvas);
            sticker.imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
            sticker.imageReceiver.setAlpha(alpha);
            canvas.restore();
        }

        private void drawBackground(Canvas canvas, Roller.Background background, float f, float f2, float f3, int[] iArr, int[] iArr2, int[] iArr3) {
            if (background == null || background.backgroundPaint == null) {
                return;
            }
            float f4 = (f - 0.5f) / 1.5f;
            float clamp01 = Utilities.clamp01(1.0f - Math.abs(f4));
            float max = Math.max(0.8f * f2, AndroidUtilities.dp(180.0f));
            float f5 = (f2 / 2.0f) - ((f4 * max) * 1.8f);
            float min = Math.min(AndroidUtilities.dp(176.0f), f3) / 2.0f;
            float f6 = f5 - max;
            float f7 = f5 + max;
            canvas.saveLayerAlpha(f6, 0.0f, f7, f3, NotificationCenter.didApplyNewTheme, 31);
            background.backgroundMatrix.reset();
            background.backgroundMatrix.postTranslate(f5, min);
            background.backgroundGradient.setLocalMatrix(background.backgroundMatrix);
            background.backgroundPaint.setAlpha((int) (255.0f * clamp01));
            canvas.drawRect(f6, 0.0f, f7, f3, background.backgroundPaint);
            canvas.save();
            float dp = AndroidUtilities.dp(90.0f);
            this.rect.set(f6, 0.0f, f6 + dp, f3);
            this.clip.draw(canvas, this.rect, 0, 1.0f);
            this.rect.set(f7 - dp, 0.0f, f7, f3);
            this.clip.draw(canvas, this.rect, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i = 0; i < iArr.length; i++) {
                float width = i * (getWidth() / (iArr.length - 1));
                iArr[i] = Theme.blendOver(iArr[i], Theme.multAlpha(background.textColor, ((width < f6 || width > f7) ? 0.0f : Math.min(Utilities.clamp01((width - f6) / max), Utilities.clamp01(1.0f - ((width - (f7 - max)) / max)))) * clamp01));
            }
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                float width2 = i2 * (getWidth() / (iArr2.length - 1));
                iArr2[i2] = Theme.blendOver(iArr2[i2], Theme.multAlpha(background.backgroundColor, ((width2 < f6 || width2 > f7) ? 0.0f : Math.min(Utilities.clamp01((width2 - f6) / max), Utilities.clamp01(1.0f - ((width2 - (f7 - max)) / max)))) * clamp01));
            }
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                float width3 = i3 * (getWidth() / (iArr2.length - 1));
                iArr3[i3] = Theme.blendOver(iArr3[i3], Theme.multAlpha(background.patternColor, ((width3 < f6 || width3 > f7) ? 0.0f : Math.min(Utilities.clamp01((width3 - f6) / max), Utilities.clamp01(1.0f - ((width3 - (f7 - max)) / max)))) * clamp01));
            }
        }

        public void drawBackgrounds(Canvas canvas, float f, float f2, int[] iArr, int[] iArr2, int[] iArr3) {
            drawBackground(canvas, this.bgA, this.bgAT, f, f2, iArr, iArr2, iArr3);
            drawBackground(canvas, this.bgB, this.bgBT, f, f2, iArr, iArr2, iArr3);
            drawBackground(canvas, this.bgC, this.bgCT, f, f2, iArr, iArr2, iArr3);
        }
    }

    public static class TopView extends FrameLayout {
        private boolean attached;
        private BackupImageView avatarView;
        private final TL_stars.starGiftAttributeBackdrop[] backdrop;
        private BagRandomizer backdrops;
        private final int[] backgroundColors;
        private final RadialGradient[] backgroundGradient;
        private final Matrix[] backgroundMatrix;
        private final Paint[] backgroundPaint;
        public final Button[] buttons;
        private final LinearLayout buttonsLayout;
        private final Runnable checkToRotateRunnable;
        private final ImageView closeView;
        private final TextView collectionReleasedView;
        private int collectionReleasedViewColor;
        private int currentImageIndex;
        private PageTransition currentPage;
        private boolean hasLink;
        private boolean hasResellPrice;
        private final FrameLayout imageLayout;
        private final BackupImageView[] imageView;
        private final TL_stars.starGiftAttributeModel[] imageViewAttributes;
        private final StickersRollView imagesRollView;
        private final LinearLayout[] layout;
        private final FrameLayout.LayoutParams[] layoutLayoutParams;
        private BagRandomizer models;
        private View.OnClickListener onResellClick;
        private View.OnClickListener onShareClick;
        private View.OnClickListener onUpdatePriceClick;
        private final ImageView optionsView;
        private StarsReactionsSheet.Particles particles;
        private final RectF particlesBounds;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] pattern;
        private final TL_stars.starGiftAttributePattern[] patternAttribute;
        private final int[] patternColors;
        private BagRandomizer patterns;
        private RadialGradient profileBackgroundGradient;
        private final Matrix profileBackgroundMatrix;
        private Paint profileBackgroundPaint;
        private final LinkSpanDrawable.LinksTextView releasedView;
        private final TextView resellPriceView;
        private boolean resellPriceViewInProgress;
        private final Theme.ResourcesProvider resourcesProvider;
        private ValueAnimator rotationAnimator;
        private ArrayList sampleAttributes;
        private final LinkSpanDrawable.LinksTextView[] subtitleView;
        private final LinearLayout.LayoutParams[] subtitleViewLayoutParams;
        private ValueAnimator switchAnimator;
        private float switchScale;
        private final int[] textColors;
        private final LinkSpanDrawable.LinksTextView[] titleView;
        private float toggleBackdrop;
        private int toggled;
        private FrameLayout userLayout;
        private float wearImageScale;
        private float wearImageTx;
        private float wearImageTy;
        private TLObject wearPreviewObject;

        public static class Button extends FrameLayout {
            public ImageView imageView;
            public TextView textView;

            public Button(Context context) {
                super(context);
                ImageView imageView = new ImageView(context);
                this.imageView = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setTypeface(AndroidUtilities.bold());
                this.textView.setTextSize(1, 12.0f);
                this.textView.setTextColor(-1);
                this.textView.setGravity(17);
                addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
            }

            public void set(int i, CharSequence charSequence, boolean z) {
                if (z) {
                    AndroidUtilities.updateImageViewImageAnimated(this.imageView, i);
                } else {
                    this.imageView.setImageResource(i);
                }
                this.textView.setText(charSequence);
            }
        }

        public TopView(Context context, Theme.ResourcesProvider resourcesProvider, final Runnable runnable, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
            super(context);
            int i = 3;
            this.imageView = new BackupImageView[3];
            this.imageViewAttributes = new TL_stars.starGiftAttributeModel[3];
            this.currentImageIndex = 0;
            this.layout = new LinearLayout[3];
            this.layoutLayoutParams = new FrameLayout.LayoutParams[3];
            this.titleView = new LinkSpanDrawable.LinksTextView[3];
            this.subtitleView = new LinkSpanDrawable.LinksTextView[3];
            this.subtitleViewLayoutParams = new LinearLayout.LayoutParams[3];
            this.currentPage = new PageTransition(0, 0, 1.0f);
            this.backdrop = new TL_stars.starGiftAttributeBackdrop[3];
            this.checkToRotateRunnable = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.TopView.this.lambda$new$2();
                }
            };
            this.backgroundPaint = new Paint[3];
            this.backgroundGradient = new RadialGradient[3];
            this.backgroundMatrix = new Matrix[3];
            this.profileBackgroundMatrix = new Matrix();
            this.profileBackgroundPaint = new Paint(1);
            this.patternAttribute = new TL_stars.starGiftAttributePattern[2];
            this.pattern = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[2];
            int i2 = 0;
            while (true) {
                Paint[] paintArr = this.backgroundPaint;
                if (i2 >= paintArr.length) {
                    break;
                }
                paintArr[i2] = new Paint(1);
                i2++;
            }
            int i3 = 0;
            while (true) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.pattern;
                if (i3 >= swapAnimatedEmojiDrawableArr.length) {
                    break;
                }
                swapAnimatedEmojiDrawableArr[i3] = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(28.0f));
                i3++;
            }
            this.switchScale = 1.0f;
            this.particlesBounds = new RectF();
            this.backgroundColors = new int[12];
            this.textColors = new int[12];
            this.patternColors = new int[12];
            this.resourcesProvider = resourcesProvider;
            this.onShareClick = onClickListener4;
            this.onResellClick = onClickListener5;
            this.onUpdatePriceClick = onClickListener6;
            setWillNotDraw(false);
            this.imageLayout = new FrameLayout(context);
            int i4 = 0;
            while (i4 < 3) {
                this.imageView[i4] = new BackupImageView(context);
                this.imageView[i4].setLayerNum(6660);
                if (i4 > 0) {
                    this.imageView[i4].getImageReceiver().setCrossfadeDuration(1);
                }
                this.imageLayout.addView(this.imageView[i4], LayoutHelper.createFrame(-1, -1, 119));
                this.imageView[i4].setAlpha(i4 == this.currentImageIndex ? 1.0f : 0.0f);
                i4++;
            }
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.releasedView = linksTextView;
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setGravity(17);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            TextView textView = new TextView(context);
            this.collectionReleasedView = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarGiftSheet.TopView.this.lambda$new$0(view);
                }
            });
            ScaleStateListAnimator.apply(textView, 0.05f, 1.25f);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(17);
            textView.setLinkTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
            LinearLayout linearLayout = new LinearLayout(context);
            this.buttonsLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.buttons = new Button[3];
            int i5 = 0;
            while (true) {
                Button[] buttonArr = this.buttons;
                if (i5 >= buttonArr.length) {
                    break;
                }
                buttonArr[i5] = new Button(context);
                if (i5 == 0) {
                    this.buttons[i5].set(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                    this.buttons[i5].setOnClickListener(onClickListener2);
                } else if (i5 == 1) {
                    this.buttons[i5].set(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                    this.buttons[i5].setOnClickListener(onClickListener3);
                } else if (i5 == 2) {
                    this.buttons[i5].set(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                    this.buttons[i5].setOnClickListener(onClickListener4);
                }
                this.buttons[i5].setBackground(Theme.createRadSelectorDrawable(0, 285212671, 10, 10));
                ScaleStateListAnimator.apply(this.buttons[i5], 0.075f, 1.5f);
                LinearLayout linearLayout2 = this.buttonsLayout;
                Button[] buttonArr2 = this.buttons;
                linearLayout2.addView(buttonArr2[i5], LayoutHelper.createLinear(0, 56, 1.0f, 119, 0, 0, i5 != buttonArr2.length - 1 ? 11 : 0, 0));
                i5++;
            }
            int i6 = 0;
            while (true) {
                float f = 9.0f;
                if (i6 < i) {
                    this.layout[i6] = new LinearLayout(context);
                    this.layout[i6].setOrientation(1);
                    View view = this.layout[i6];
                    FrameLayout.LayoutParams[] layoutParamsArr = this.layoutLayoutParams;
                    ViewGroup.LayoutParams createFrame = LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, i6 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
                    layoutParamsArr[i6] = createFrame;
                    addView(view, createFrame);
                    if (i6 == 2) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        this.userLayout = frameLayout;
                        this.layout[i6].addView(frameLayout, LayoutHelper.createLinear(-1, NotificationCenter.fileNewChunkAvailable, 119));
                        BackupImageView backupImageView = new BackupImageView(context);
                        this.avatarView = backupImageView;
                        backupImageView.setRoundRadius(AndroidUtilities.dp(41.0f));
                        this.userLayout.addView(this.avatarView, LayoutHelper.createFrame(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                        this.titleView[i6] = new LinkSpanDrawable.LinksTextView(context);
                        this.titleView[i6].setTextColor(-1);
                        this.titleView[i6].setTextSize(1, 20.0f);
                        this.titleView[i6].setTypeface(AndroidUtilities.bold());
                        this.titleView[i6].setSingleLine();
                        LinkSpanDrawable.LinksTextView linksTextView2 = this.titleView[i6];
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        linksTextView2.setEllipsize(truncateAt);
                        this.titleView[i6].setGravity(17);
                        this.userLayout.addView(this.titleView[i6], LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                        this.subtitleView[i6] = new LinkSpanDrawable.LinksTextView(context);
                        this.subtitleView[i6].setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                        this.subtitleView[i6].setTextSize(1, 14.0f);
                        this.subtitleView[i6].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                        this.subtitleView[i6].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.subtitleView[i6].setDisablePaddingsOffsetY(true);
                        this.subtitleView[i6].setSingleLine();
                        this.subtitleView[i6].setGravity(17);
                        this.subtitleView[i6].setEllipsize(truncateAt);
                        this.userLayout.addView(this.subtitleView[i6], LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
                    } else {
                        this.titleView[i6] = new LinkSpanDrawable.LinksTextView(context);
                        LinkSpanDrawable.LinksTextView linksTextView3 = this.titleView[i6];
                        int i7 = Theme.key_dialogTextBlack;
                        linksTextView3.setTextColor(Theme.getColor(i7, resourcesProvider));
                        this.titleView[i6].setTextSize(1, 20.0f);
                        this.titleView[i6].setTypeface(AndroidUtilities.bold());
                        this.titleView[i6].setGravity(17);
                        this.layout[i6].addView(this.titleView[i6], LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, 0));
                        if (i6 == 0) {
                            this.layout[i6].addView(this.releasedView, LayoutHelper.createLinear(-2, -2, 17, 0, 4, 0, 4));
                            this.layout[i6].addView(this.collectionReleasedView, LayoutHelper.createLinear(-2, 19.33f, 17, 0, 6, 0, 2));
                        }
                        this.subtitleView[i6] = new LinkSpanDrawable.LinksTextView(context);
                        this.subtitleView[i6].setTextColor(Theme.getColor(i7, resourcesProvider));
                        this.subtitleView[i6].setTextSize(1, 14.0f);
                        this.subtitleView[i6].setGravity(17);
                        this.subtitleView[i6].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                        this.subtitleView[i6].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.subtitleView[i6].setDisablePaddingsOffsetY(true);
                        LinearLayout linearLayout3 = this.layout[i6];
                        LinkSpanDrawable.LinksTextView linksTextView4 = this.subtitleView[i6];
                        LinearLayout.LayoutParams[] layoutParamsArr2 = this.subtitleViewLayoutParams;
                        LinearLayout.LayoutParams createLinear = LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, 0);
                        layoutParamsArr2[i6] = createLinear;
                        linearLayout3.addView(linksTextView4, createLinear);
                        LinearLayout.LayoutParams layoutParams = this.subtitleViewLayoutParams[i6];
                        if (i6 == 1) {
                            f = 7.33f;
                        } else if (this.backdrop[0] != null) {
                            f = 5.66f;
                        }
                        layoutParams.topMargin = AndroidUtilities.dp(f);
                    }
                    if (i6 == 0) {
                        this.layout[i6].addView(this.buttonsLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 15, 0, 0));
                    }
                    i6++;
                    i = 3;
                } else {
                    addView(this.imageLayout, LayoutHelper.createFrame(NotificationCenter.albumsDidLoad, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                    StickersRollView stickersRollView = new StickersRollView(context, resourcesProvider);
                    this.imagesRollView = stickersRollView;
                    addView(stickersRollView, LayoutHelper.createFrame(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
                    ImageView imageView = new ImageView(context);
                    this.closeView = imageView;
                    imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(28.0f), 620756991));
                    imageView.setImageResource(R.drawable.msg_close);
                    ScaleStateListAnimator.apply(imageView);
                    addView(imageView, LayoutHelper.createFrame(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            runnable.run();
                        }
                    });
                    imageView.setVisibility(8);
                    TextView textView2 = new TextView(context);
                    this.resellPriceView = textView2;
                    textView2.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(-1);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setAlpha(0.0f);
                    textView2.setVisibility(8);
                    textView2.setGravity(17);
                    ScaleStateListAnimator.apply(textView2);
                    addView(textView2, LayoutHelper.createFrame(-2, 24.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
                    ImageView imageView2 = new ImageView(context);
                    this.optionsView = imageView2;
                    imageView2.setImageResource(R.drawable.media_more);
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setBackground(Theme.createSelectorDrawable(553648127, 1));
                    ScaleStateListAnimator.apply(imageView2);
                    addView(imageView2, LayoutHelper.createFrame(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
                    imageView2.setOnClickListener(onClickListener);
                    imageView2.setVisibility(8);
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            CharSequence text = this.collectionReleasedView.getText();
            if (text instanceof Spanned) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                if (clickableSpanArr.length > 0) {
                    clickableSpanArr[0].onClick(view);
                }
            }
        }

        public void setText(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
            this.titleView[i].setText(charSequence);
            if (i == 0 && !TextUtils.isEmpty(charSequence3)) {
                this.collectionReleasedView.setText(charSequence3);
                this.collectionReleasedView.setVisibility(0);
                this.releasedView.setVisibility(8);
                this.subtitleView[i].setVisibility(8);
                return;
            }
            if (i == 0 && !TextUtils.isEmpty(charSequence4)) {
                this.releasedView.setText(charSequence4);
                this.releasedView.setVisibility(0);
                this.collectionReleasedView.setVisibility(8);
                this.subtitleView[i].setVisibility(8);
                return;
            }
            this.subtitleView[i].setText(charSequence2);
            this.subtitleView[i].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            this.releasedView.setVisibility(8);
            this.collectionReleasedView.setVisibility(8);
        }

        public void onSwitchPage(PageTransition pageTransition) {
            int i;
            boolean z;
            this.currentPage = pageTransition;
            int i2 = 0;
            while (true) {
                LinearLayout[] linearLayoutArr = this.layout;
                if (i2 >= linearLayoutArr.length) {
                    break;
                }
                linearLayoutArr[i2].setAlpha(pageTransition.at(i2));
                i2++;
            }
            float f = 0.0f;
            this.closeView.setAlpha(Math.max(this.backdrop[0] != null ? pageTransition.at(2) : 0.0f, this.backdrop[1] != null ? pageTransition.at(1) : 0.0f));
            ImageView imageView = this.closeView;
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            int i3 = 8;
            imageView.setVisibility(((stargiftattributebackdropArr[0] == null || pageTransition.to != 2) && (stargiftattributebackdropArr[1] == null || pageTransition.to != 1)) ? 8 : 0);
            this.optionsView.setAlpha(AndroidUtilities.lerp(false, this.backdrop[0] != null, pageTransition.at(0)));
            this.optionsView.setVisibility((this.backdrop[0] == null || pageTransition.to != 0) ? 8 : 0);
            if (!this.resellPriceViewInProgress) {
                this.resellPriceView.setAlpha(AndroidUtilities.lerp(false, this.hasResellPrice, pageTransition.at(0)));
                this.resellPriceView.setScaleX(AndroidUtilities.lerp(0.4f, this.hasResellPrice ? 1.0f : 0.4f, pageTransition.at(0)));
                this.resellPriceView.setScaleY(AndroidUtilities.lerp(0.4f, this.hasResellPrice ? 1.0f : 0.4f, pageTransition.at(0)));
                TextView textView = this.resellPriceView;
                if (this.hasResellPrice && pageTransition.to == 0) {
                    i3 = 0;
                }
                textView.setVisibility(i3);
            }
            int color = Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider);
            int i4 = 0;
            while (i4 < 2) {
                this.titleView[i4].setTextColor(this.backdrop[Math.min(1, i4)] == null ? color : -1);
                LinkSpanDrawable.LinksTextView linksTextView = this.subtitleView[i4];
                if (i4 == 0 || i4 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[i4];
                    i = stargiftattributebackdrop == null ? color : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.backdrop;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr2[1];
                    int i5 = stargiftattributebackdrop2 == null ? color : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr2[2];
                    i = ColorUtils.blendARGB(i5, stargiftattributebackdrop3 == null ? color : (-16777216) | stargiftattributebackdrop3.text_color, this.toggleBackdrop);
                }
                linksTextView.setTextColor(i);
                if (this.backdrop[i4] != null) {
                    z = (AndroidUtilities.dp(184.0f) == this.layoutLayoutParams[i4].topMargin && this.layout[i4].getPaddingBottom() == AndroidUtilities.dp(18.0f)) ? false : true;
                    if (z) {
                        this.layout[i4].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                        this.layoutLayoutParams[i4].topMargin = AndroidUtilities.dp(184.0f);
                    }
                } else {
                    z = (AndroidUtilities.dp(170.0f) == this.layoutLayoutParams[i4].topMargin && this.layout[i4].getPaddingBottom() == AndroidUtilities.dp(3.0f)) ? false : true;
                    if (z) {
                        this.layout[i4].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                        this.layoutLayoutParams[i4].topMargin = AndroidUtilities.dp(170.0f);
                    }
                }
                this.subtitleViewLayoutParams[i4].topMargin = AndroidUtilities.dp(i4 == 1 ? 7.33f : this.backdrop[0] == null ? 9.0f : 5.66f);
                if (z) {
                    this.layout[i4].setLayoutParams(this.layoutLayoutParams[i4]);
                    this.subtitleView[i4].setLayoutParams(this.subtitleViewLayoutParams[i4]);
                }
                i4++;
            }
            LinkSpanDrawable.LinksTextView linksTextView2 = this.subtitleView[2];
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = this.backdrop[0];
            if (stargiftattributebackdrop4 != null) {
                color = stargiftattributebackdrop4.text_color | (-16777216);
            }
            linksTextView2.setTextColor(color);
            this.imageView[0].setAlpha(this.currentPage.at(0, 2));
            this.imageView[1].setAlpha(pageTransition.at(1) * (1.0f - this.toggleBackdrop));
            this.imageView[2].setAlpha(pageTransition.at(1) * this.toggleBackdrop);
            this.imageLayout.setScaleX(AndroidUtilities.lerp(1.0f, this.wearImageScale, pageTransition.at(2)));
            this.imageLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.wearImageScale, pageTransition.at(2)));
            this.imageLayout.setTranslationX(this.wearImageTx * pageTransition.at(2));
            this.imageLayout.setTranslationY((AndroidUtilities.dp(16.0f) * pageTransition.at(1)) + (this.wearImageTy * pageTransition.at(2)));
            LinearLayout linearLayout = this.layout[2];
            int i6 = pageTransition.from;
            if (i6 != 2 || pageTransition.to != 2) {
                if (i6 == 2) {
                    i6 = pageTransition.to;
                }
                f = (-(r0[i6].getMeasuredHeight() - this.layout[2].getMeasuredHeight())) * (1.0f - pageTransition.at(2));
            }
            linearLayout.setTranslationY(f);
            invalidate();
        }

        public void prepareSwitchPage(PageTransition pageTransition) {
            int i = pageTransition.from;
            if (i != pageTransition.to) {
                RLottieDrawable lottieAnimation = this.imageView[i].getImageReceiver().getLottieAnimation();
                RLottieDrawable lottieAnimation2 = this.imageView[pageTransition.to].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 == null || lottieAnimation == null) {
                    return;
                }
                lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
            }
        }

        public void setGift(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.hasResellPrice = false;
            boolean z6 = z || z2;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                this.backdrop[0] = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                setPattern(0, (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
                this.subtitleView[0].setTextSize(1, 13.0f);
                this.buttonsLayout.setVisibility(z6 ? 0 : 8);
                if (z6) {
                    this.buttons[1].set(z3 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z3 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), false);
                }
                float f = 1.0f;
                if (starGift.resell_amount != null) {
                    this.hasResellPrice = true;
                    AmountUtils$Amount resellAmount = starGift.getResellAmount(starGift.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS);
                    this.resellPriceView.setText(StarsIntroActivity.replaceStars(resellAmount.currency == AmountUtils$Currency.TON, "⭐️ " + ((Object) StarsIntroActivity.formatStarsAmount(resellAmount.toTl(), 1.0f, ','))));
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[0];
                    this.resellPriceView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216), 0.25f)));
                    if (StarGiftSheet.isMine(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                        this.resellPriceView.setOnClickListener(this.onUpdatePriceClick);
                        ScaleStateListAnimator.apply(this.resellPriceView);
                    } else {
                        this.resellPriceView.setOnClickListener(null);
                        ScaleStateListAnimator.reset(this.resellPriceView);
                    }
                }
                if (z) {
                    this.buttons[0].setAlpha(1.0f);
                    this.buttons[0].set(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                } else {
                    this.buttons[0].setAlpha(0.5f);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                    spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                    this.buttons[0].set(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
                }
                Button button = this.buttons[1];
                if (!z && !z2) {
                    f = 0.5f;
                }
                button.setAlpha(f);
                if (z) {
                    if (starGift.resell_amount != null) {
                        this.buttons[2].set(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                        this.buttons[2].setOnClickListener(this.onResellClick);
                    } else {
                        this.buttons[2].set(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                        this.buttons[2].setOnClickListener(this.onResellClick);
                    }
                } else {
                    this.buttons[2].set(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                    this.buttons[2].setOnClickListener(this.onShareClick);
                }
            } else {
                this.backdrop[0] = null;
                setPattern(0, null, false);
                this.subtitleView[0].setTextSize(1, 14.0f);
                this.buttonsLayout.setVisibility(8);
            }
            this.hasLink = z4;
            setBackdropPaint(0, this.backdrop[0]);
            StarsIntroActivity.setGiftImage(this.imageView[0].getImageReceiver(), starGift, NotificationCenter.albumsDidLoad);
            this.imageViewAttributes[0] = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            onSwitchPage(this.currentPage);
        }

        public BackupImageView getUpgradeImageView() {
            return this.toggleBackdrop > 0.5f ? this.imageView[2] : this.imageView[1];
        }

        public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
            return this.toggleBackdrop > 0.5f ? this.imageViewAttributes[2] : this.imageViewAttributes[1];
        }

        public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
            return this.toggleBackdrop > 0.5f ? this.backdrop[2] : this.backdrop[1];
        }

        public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
            return this.patternAttribute[1];
        }

        public void setResellPrice(AmountUtils$Amount amountUtils$Amount) {
            boolean isZero = amountUtils$Amount.isZero();
            this.hasResellPrice = !isZero;
            if (!isZero) {
                this.resellPriceView.setText(StarsIntroActivity.replaceStars(amountUtils$Amount.currency == AmountUtils$Currency.TON, "⭐️ " + ((Object) StarsIntroActivity.formatStarsAmount(amountUtils$Amount.toTl(), 1.0f, ','))));
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[0];
                this.resellPriceView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216), 0.25f)));
                this.resellPriceView.setVisibility(0);
                this.resellPriceView.setScaleX(0.4f);
                this.resellPriceView.setScaleY(0.4f);
                this.resellPriceViewInProgress = true;
                this.resellPriceView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.resellPriceViewInProgress = false;
                    }
                }).start();
            } else {
                this.resellPriceView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.resellPriceView.setVisibility(8);
                    }
                }).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.resellPriceViewInProgress = false;
                    }
                }).start();
            }
            if (this.hasResellPrice) {
                this.buttons[2].set(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
            } else {
                this.buttons[2].set(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
            }
            this.buttons[2].setOnClickListener(this.onResellClick);
        }

        public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
            this.sampleAttributes = arrayList;
            this.models = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeModel.class));
            this.patterns = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributePattern.class));
            this.backdrops = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeBackdrop.class));
            this.subtitleView[1].setTextSize(1, 14.0f);
            this.buttonsLayout.setVisibility(8);
            this.toggleBackdrop = 0.0f;
            this.toggled = 0;
            setPattern(1, (TL_stars.starGiftAttributePattern) this.patterns.next(), true);
            this.imageViewAttributes[1] = (TL_stars.starGiftAttributeModel) this.models.next();
            StarsIntroActivity.setGiftImage(this.imageView[1].getImageReceiver(), this.imageViewAttributes[1].document, NotificationCenter.albumsDidLoad);
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.backdrops.next();
            stargiftattributebackdropArr[1] = stargiftattributebackdrop;
            setBackdropPaint(1, stargiftattributebackdrop);
            this.imageViewAttributes[2] = (TL_stars.starGiftAttributeModel) this.models.getNext();
            StarsIntroActivity.setGiftImage(this.imageView[2].getImageReceiver(), this.imageViewAttributes[2].document, NotificationCenter.albumsDidLoad);
            AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
            AndroidUtilities.runOnUIThread(this.checkToRotateRunnable, 2500L);
            invalidate();
        }

        public void setWearPreview(TLObject tLObject) {
            String lowerCase;
            String str;
            String str2;
            this.wearPreviewObject = tLObject;
            if (tLObject instanceof TLRPC.User) {
                str2 = UserObject.getUserName((TLRPC.User) tLObject);
                str = LocaleController.getString(R.string.Online);
            } else {
                if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                String str3 = chat == null ? "" : chat.title;
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    int i = chat.participants_count;
                    if (i > 1) {
                        lowerCase = LocaleController.formatPluralStringComma("Subscribers", i);
                    } else {
                        lowerCase = LocaleController.getString(R.string.DiscussChannel);
                    }
                } else {
                    int i2 = chat.participants_count;
                    if (i2 > 1) {
                        lowerCase = LocaleController.formatPluralStringComma("Members", i2);
                    } else {
                        lowerCase = LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
                    }
                }
                String str4 = str3;
                str = lowerCase;
                str2 = str4;
            }
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            this.avatarView.setForUserOrChat(tLObject, avatarDrawable);
            this.titleView[2].setText(str2);
            this.subtitleView[2].setText(str);
            updateWearImageTranslation();
            onSwitchPage(this.currentPage);
        }

        private void updateWearImageTranslation() {
            this.wearImageScale = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
            this.wearImageTx = ((((-this.imageLayout.getLeft()) + this.titleView[2].getX()) + ((this.titleView[2].getWidth() + Math.min(this.titleView[2].getPaint().measureText(this.titleView[2].getText().toString()), this.titleView[2].getWidth())) / 2.0f)) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
            this.wearImageTy = ((-this.imageLayout.getTop()) + AndroidUtilities.dp(124.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2() {
            if (this.imageView[2 - this.toggled].getImageReceiver().hasImageLoaded()) {
                rotateAttributes();
            } else {
                AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
                AndroidUtilities.runOnUIThread(this.checkToRotateRunnable, 150L);
            }
        }

        private void rotateAttributes() {
            PageTransition pageTransition = this.currentPage;
            if (pageTransition != null && pageTransition.to == 1 && isAttachedToWindow()) {
                AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
                ValueAnimator valueAnimator = this.rotationAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.rotationAnimator = null;
                }
                int i = 1 - this.toggled;
                this.toggled = i;
                RLottieDrawable lottieAnimation = this.imageView[2 - i].getImageReceiver().getLottieAnimation();
                RLottieDrawable lottieAnimation2 = this.imageView[this.toggled + 1].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 != null && lottieAnimation != null) {
                    lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
                }
                this.models.next();
                int i2 = this.toggled + 1;
                TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.backdrops.next();
                stargiftattributebackdropArr[i2] = stargiftattributebackdrop;
                setBackdropPaint(i2, stargiftattributebackdrop);
                setPattern(1, (TL_stars.starGiftAttributePattern) this.patterns.next(), true);
                animateSwitch();
                float f = this.toggled;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f, f);
                this.rotationAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        StarGiftSheet.TopView.this.lambda$rotateAttributes$3(valueAnimator2);
                    }
                });
                this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.toggleBackdrop = r3.toggled;
                        TopView topView = TopView.this;
                        topView.onSwitchPage(topView.currentPage);
                        TopView.this.imageViewAttributes[2 - TopView.this.toggled] = (TL_stars.starGiftAttributeModel) TopView.this.models.getNext();
                        StarsIntroActivity.setGiftImage(TopView.this.imageView[2 - TopView.this.toggled].getImageReceiver(), TopView.this.imageViewAttributes[2 - TopView.this.toggled].document, NotificationCenter.albumsDidLoad);
                        TopView topView2 = TopView.this;
                        topView2.preloadPattern((TL_stars.starGiftAttributePattern) topView2.patterns.getNext());
                        AndroidUtilities.cancelRunOnUIThread(TopView.this.checkToRotateRunnable);
                        AndroidUtilities.runOnUIThread(TopView.this.checkToRotateRunnable, 2500L);
                    }
                });
                this.rotationAnimator.setDuration(320L);
                this.rotationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.rotationAnimator.start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$rotateAttributes$3(ValueAnimator valueAnimator) {
            this.toggleBackdrop = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            onSwitchPage(this.currentPage);
        }

        private void setBackdropPaint(int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            if (stargiftattributebackdrop == null) {
                return;
            }
            RadialGradient[] radialGradientArr = this.backgroundGradient;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            radialGradientArr[i] = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            if (i == 0) {
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
                this.profileBackgroundGradient = radialGradient;
                this.profileBackgroundPaint.setShader(radialGradient);
            }
            Matrix[] matrixArr = this.backgroundMatrix;
            if (matrixArr[i] == null) {
                matrixArr[i] = new Matrix();
            }
            this.backgroundPaint[i].setShader(this.backgroundGradient[i]);
        }

        public void setPattern(int i, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z) {
            if (stargiftattributepattern != null) {
                TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.patternAttribute;
                if (stargiftattributepatternArr[i] == stargiftattributepattern) {
                    return;
                }
                stargiftattributepatternArr[i] = stargiftattributepattern;
                this.pattern[i].set(stargiftattributepattern.document, z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void preloadPattern(TL_stars.starGiftAttributePattern stargiftattributepattern) {
            if (stargiftattributepattern == null) {
                return;
            }
            AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 7, stargiftattributepattern.document).preload();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            this.attached = true;
            super.onAttachedToWindow();
            this.pattern[0].attach();
            this.pattern[1].attach();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            this.attached = false;
            super.onDetachedFromWindow();
            this.pattern[0].detach();
            this.pattern[1].detach();
            AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
        }

        private void animateSwitch() {
            ValueAnimator valueAnimator = this.switchAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.switchAnimator = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.switchAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StarGiftSheet.TopView.this.lambda$animateSwitch$4(valueAnimator2);
                }
            });
            this.switchAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    TopView.this.switchScale = 1.0f;
                    TopView.this.imageLayout.setScaleX(TopView.this.switchScale);
                    TopView.this.imageLayout.setScaleY(TopView.this.switchScale);
                    TopView.this.invalidate();
                }
            });
            this.switchAnimator.setDuration(320L);
            this.switchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.switchAnimator.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateSwitch$4(ValueAnimator valueAnimator) {
            float pow = (((float) Math.pow((r5 * 2.0f) - 2.0f, 2.0d)) * 0.075f * ((Float) valueAnimator.getAnimatedValue()).floatValue()) + 1.0f;
            this.switchScale = pow;
            this.imageLayout.setScaleX(pow);
            this.imageLayout.setScaleY(this.switchScale);
            invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int i;
            float realHeight = getRealHeight();
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
            float width = getWidth() / 2.0f;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.currentPage.at(1)) + AndroidUtilities.dp(80.0f);
            float at = this.currentPage.at(0, 2);
            if (at > 0.0f && this.backdrop[0] != null) {
                if (this.profileBackgroundGradient == null || this.currentPage.at(2) < 1.0f) {
                    this.backgroundPaint[0].setAlpha((int) (at * 255.0f));
                    this.backgroundMatrix[0].reset();
                    this.backgroundMatrix[0].postTranslate(width, lerp);
                    this.backgroundGradient[0].setLocalMatrix(this.backgroundMatrix[0]);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.backgroundPaint[0]);
                }
                if (this.profileBackgroundGradient != null && this.currentPage.at(2) > 0.0f) {
                    this.profileBackgroundPaint.setAlpha((int) (this.currentPage.at(2) * 255.0f));
                    this.profileBackgroundMatrix.reset();
                    this.profileBackgroundMatrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                    this.profileBackgroundGradient.setLocalMatrix(this.profileBackgroundMatrix);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.profileBackgroundPaint);
                }
            }
            if (this.currentPage.at(1) > 0.0f) {
                if (this.toggled == 0) {
                    if (this.toggleBackdrop > 0.0f && this.backdrop[2] != null) {
                        this.backgroundPaint[2].setAlpha((int) (this.currentPage.at(1) * 255.0f));
                        this.backgroundMatrix[2].reset();
                        this.backgroundMatrix[2].postTranslate(width, lerp);
                        this.backgroundGradient[2].setLocalMatrix(this.backgroundMatrix[2]);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.backgroundPaint[2]);
                    }
                    if (this.toggleBackdrop < 1.0f && this.backdrop[1] != null) {
                        this.backgroundPaint[1].setAlpha((int) (this.currentPage.at(1) * 255.0f * (1.0f - this.toggleBackdrop)));
                        this.backgroundMatrix[1].reset();
                        this.backgroundMatrix[1].postTranslate(width, lerp);
                        this.backgroundGradient[1].setLocalMatrix(this.backgroundMatrix[1]);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.backgroundPaint[1]);
                    }
                } else {
                    if (this.toggleBackdrop < 1.0f && this.backdrop[1] != null) {
                        this.backgroundPaint[1].setAlpha((int) (this.currentPage.at(1) * 255.0f));
                        this.backgroundMatrix[1].reset();
                        this.backgroundMatrix[1].postTranslate(width, lerp);
                        this.backgroundGradient[1].setLocalMatrix(this.backgroundMatrix[1]);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.backgroundPaint[1]);
                    }
                    if (this.toggleBackdrop > 0.0f && this.backdrop[2] != null) {
                        this.backgroundPaint[2].setAlpha((int) (this.currentPage.at(1) * 255.0f * this.toggleBackdrop));
                        this.backgroundMatrix[2].reset();
                        this.backgroundMatrix[2].postTranslate(width, lerp);
                        this.backgroundGradient[2].setLocalMatrix(this.backgroundMatrix[2]);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.backgroundPaint[2]);
                    }
                }
            }
            if (this.backdrop[0] != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = this.backgroundColors;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    int[] iArr2 = this.textColors;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[0];
                    iArr2[i2] = stargiftattributebackdrop.text_color | (-16777216);
                    iArr[i2] = ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216), 0.25f);
                    this.patternColors[i2] = this.backdrop[0].pattern_color | (-16777216);
                    i2++;
                }
            }
            if (this.imagesRollView.hasBackgrounds()) {
                i = 2;
                this.imagesRollView.drawBackgrounds(canvas, getWidth(), realHeight, this.textColors, this.backgroundColors, this.patternColors);
                invalidate();
            } else {
                i = 2;
            }
            if (at > 0.0f && this.backdrop[0] != null) {
                int[] iArr3 = this.patternColors;
                int i3 = iArr3[iArr3.length / i];
                if (this.currentPage.at(0) > 0.0f) {
                    canvas.save();
                    canvas.translate(width, lerp);
                    this.pattern[0].setColor(Integer.valueOf(i3));
                    StarGiftPatterns.drawPattern(canvas, this.pattern[0], getWidth(), realHeight, this.currentPage.at(0), 1.0f);
                    canvas.restore();
                }
                if (this.currentPage.at(i) > 0.0f) {
                    canvas.save();
                    this.pattern[0].setColor(Integer.valueOf(i3));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.layout[i].getX() + this.userLayout.getX() + this.avatarView.getX(), this.layout[i].getY() + this.userLayout.getY() + this.avatarView.getY(), this.layout[i].getX() + this.userLayout.getX() + this.avatarView.getX() + this.avatarView.getWidth(), this.layout[i].getY() + this.userLayout.getY() + this.avatarView.getY() + this.avatarView.getHeight());
                    StarGiftPatterns.drawProfileAnimatedPattern(canvas, this.pattern[0], getWidth(), realHeight * 0.7f, 1.0f, rectF, this.currentPage.at(i));
                    canvas.restore();
                }
                for (Button button : this.buttons) {
                    if (Theme.setSelectorDrawableColor(button.getBackground(), this.backgroundColors[Utilities.clamp(Math.round(((button.getX() + (button.getWidth() / 2.0f)) / getWidth()) * (this.backgroundColors.length - 1)), this.backgroundColors.length - 1, 0)], false)) {
                        button.invalidate();
                    }
                }
                int[] iArr4 = this.textColors;
                int i4 = iArr4[iArr4.length / i];
                int[] iArr5 = this.backgroundColors;
                int i5 = iArr5[iArr5.length / i];
                TextView textView = this.collectionReleasedView;
                if (textView != null && this.collectionReleasedViewColor != i4) {
                    this.collectionReleasedViewColor = i4;
                    textView.setTextColor(i4);
                    Theme.setSelectorDrawableColor(this.collectionReleasedView.getBackground(), i5, false);
                }
                if (this.imagesRollView.hasBackgrounds()) {
                    this.subtitleView[0].setTextColor(i4);
                }
                if (this.currentPage.at(i) > 0.0f) {
                    if (this.particles == null) {
                        this.particles = new StarsReactionsSheet.Particles(1, 12);
                    }
                    float x = this.imageLayout.getX() + (this.imageLayout.getMeasuredWidth() / 2.0f);
                    float measuredWidth = (this.imageLayout.getMeasuredWidth() * this.imageLayout.getScaleX()) / 2.0f;
                    float y = this.imageLayout.getY() + (this.imageLayout.getMeasuredHeight() / 2.0f);
                    float measuredHeight = (this.imageLayout.getMeasuredHeight() * this.imageLayout.getScaleY()) / 2.0f;
                    this.particlesBounds.set(x - measuredWidth, y - measuredHeight, x + measuredWidth, y + measuredHeight);
                    this.particles.setBounds(this.particlesBounds);
                    this.particles.process();
                    this.particles.draw(canvas, Theme.multAlpha(-1, this.currentPage.at(i)));
                    invalidate();
                }
            }
            if (this.currentPage.at(1) > 0.0f) {
                canvas.save();
                canvas.translate(width, lerp);
                TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i6 = stargiftattributebackdrop2 == null ? 0 : stargiftattributebackdrop2.pattern_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i];
                this.pattern[1].setColor(Integer.valueOf(ColorUtils.blendARGB(i6, stargiftattributebackdrop3 != null ? stargiftattributebackdrop3.pattern_color | (-16777216) : 0, this.toggleBackdrop)));
                StarGiftPatterns.drawPattern(canvas, this.pattern[1], getWidth(), getRealHeight(), this.currentPage.at(1), this.switchScale);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        public float getRealHeight() {
            return ((AndroidUtilities.dp(this.backdrop[0] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f) + this.layout[0].getMeasuredHeight()) * this.currentPage.at(0)) + 0.0f + ((AndroidUtilities.dp(this.backdrop[1] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f) + this.layout[1].getMeasuredHeight()) * this.currentPage.at(1)) + ((AndroidUtilities.dp(64.0f) + this.layout[2].getMeasuredHeight()) * this.currentPage.at(2));
        }

        public int getFinalHeight() {
            int dp;
            int measuredHeight;
            if (this.currentPage.to(0)) {
                dp = AndroidUtilities.dp(this.backdrop[0] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f);
                measuredHeight = this.layout[0].getMeasuredHeight();
            } else if (this.currentPage.to(1)) {
                dp = AndroidUtilities.dp(this.backdrop[1] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f);
                measuredHeight = this.layout[1].getMeasuredHeight();
            } else {
                if (!this.currentPage.to(2)) {
                    return 0;
                }
                dp = AndroidUtilities.dp(64.0f);
                measuredHeight = this.layout[2].getMeasuredHeight();
            }
            return dp + measuredHeight;
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.currentPage.contains(2)) {
                updateWearImageTranslation();
                onSwitchPage(this.currentPage);
            }
        }
    }

    public void switchPage(int i, boolean z) {
        switchPage(i, z, null);
    }

    public void switchPage(final int i, boolean z, final Runnable runnable) {
        Roller roller;
        ValueAnimator valueAnimator = this.switchingPagesAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.switchingPagesAnimator = null;
        }
        if (i != 1) {
            AndroidUtilities.cancelRunOnUIThread(this.topView.checkToRotateRunnable);
        }
        if (!this.firstSet) {
            this.lastTop = Float.valueOf(this.container.top());
        }
        PageTransition pageTransition = this.currentPage;
        this.currentPage = new PageTransition(pageTransition == null ? 0 : pageTransition.to, i, 0.0f);
        this.adapter.setHeights(this.topView.getFinalHeight(), getBottomView().getMeasuredHeight() + ((this.currentPage.to(1) && this.underButtonContainer.getVisibility() == 0) ? this.underButtonContainer.getMeasuredHeight() : 0));
        if (this.currentPage.to == 0 && (roller = this.roller) != null) {
            roller.stopPreload();
        }
        if (z) {
            this.infoLayout.setVisibility(this.currentPage.contains(0) ? 0 : 8);
            this.upgradeLayout.setVisibility(this.currentPage.contains(1) ? 0 : 8);
            this.wearLayout.setVisibility(this.currentPage.contains(2) ? 0 : 8);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.switchingPagesAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StarGiftSheet.this.lambda$switchPage$32(valueAnimator2);
                }
            });
            this.switchingPagesAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    StarGiftSheet.this.onSwitchedPage();
                    StarGiftSheet.this.infoLayout.setVisibility(i == 0 ? 0 : 8);
                    StarGiftSheet.this.upgradeLayout.setVisibility(i == 1 ? 0 : 8);
                    StarGiftSheet.this.wearLayout.setVisibility(i == 2 ? 0 : 8);
                    StarGiftSheet.this.updateUnderButtonContainer();
                    StarGiftSheet.this.switchingPagesAnimator = null;
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
            this.switchingPagesAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.switchingPagesAnimator.setDuration(320L);
            this.switchingPagesAnimator.start();
            this.topView.prepareSwitchPage(this.currentPage);
        } else {
            this.currentPage.setProgress(1.0f);
            onSwitchedPage();
            this.infoLayout.setVisibility(i == 0 ? 0 : 8);
            this.upgradeLayout.setVisibility(i == 1 ? 0 : 8);
            this.wearLayout.setVisibility(i != 2 ? 8 : 0);
            updateUnderButtonContainer();
            if (runnable != null) {
                runnable.run();
            }
        }
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchPage$32(ValueAnimator valueAnimator) {
        this.currentPage.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        onSwitchedPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUnderButtonContainer() {
        if (this.underButtonContainer.getVisibility() == 0) {
            this.buttonContainer.setTranslationY((-this.underButtonContainer.getMeasuredHeight()) * this.currentPage.at(1));
            this.underButtonContainer.setTranslationY(r0.getMeasuredHeight() * (1.0f - this.currentPage.at(1)));
            this.bottomBulletinContainer.setTranslationY((-this.underButtonContainer.getMeasuredHeight()) * this.currentPage.at(1));
            return;
        }
        this.buttonContainer.setTranslationY(0.0f);
        this.underButtonContainer.setTranslationY(0.0f);
        this.bottomBulletinContainer.setTranslationY(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getBottomView() {
        return this.currentPage.to(1) ? this.upgradeLayout : this.currentPage.to(2) ? this.wearLayout : this.infoLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSwitchedPage() {
        this.infoLayout.setAlpha(this.currentPage.at(0));
        this.upgradeLayout.setAlpha(this.currentPage.at(1));
        this.wearLayout.setAlpha(this.currentPage.at(2));
        this.topView.onSwitchPage(this.currentPage);
        this.actionView.setAlpha(this.currentPage.at(0) * Utilities.clamp01(AndroidUtilities.ilerp(this.container.top() - this.actionView.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        this.container.updateTranslations();
        this.container.invalidate();
        updateUnderButtonContainer();
    }

    public int canTransferAt() {
        TLRPC.Message message;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
            }
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            return savedStarGift.can_transfer_at;
        }
        return 0;
    }

    public int canResellAt() {
        TLRPC.Message message;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
            }
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            return savedStarGift.can_resell_at;
        }
        return 0;
    }

    public boolean canTransfer() {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TLRPC.Message message;
        if (getInputStarGift() == null) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if ((tL_messageActionStarGiftUnique.flags & 16) == 0) {
                    return false;
                }
                TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                    return false;
                }
                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                return isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
            }
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                return isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
            }
        }
        tL_starGiftUnique = this.slugStarGift;
        if (tL_starGiftUnique == null) {
            return false;
        }
        return isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
    }

    public static void addAttributeRow(TableView tableView, TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
        }
        tableView.addRow(string, starGiftAttribute.name, AffiliateProgramFragment.percents(starGiftAttribute.rarity_permille), null);
    }

    private void addAttributeRow(final TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c;
        Roller roller;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c = 0;
        }
        if (this.rolling || ((roller = this.roller) != null && roller.isRolling())) {
            TextViewRoll textViewRoll = new TextViewRoll(getContext(), this.resourcesProvider, new Utilities.Callback3() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda92
                @Override // org.telegram.messenger.Utilities.Callback3
                public final void run(Object obj, Object obj2, Object obj3) {
                    StarGiftSheet.this.showHint((CharSequence) obj, (View) obj2, ((Boolean) obj3).booleanValue());
                }
            });
            TableRow tableRow = new TableRow(getContext());
            tableRow.addView(new TableView.TableRowTitle(this.tableView, string), new TableRow.LayoutParams(-2, -1));
            tableRow.addView(new TableView.TableRowContent(this.tableView, textViewRoll, true), new TableRow.LayoutParams(0, -1, 1.0f));
            this.tableView.addView(tableRow);
            Roller roller2 = this.roller;
            if (roller2 != null) {
                if (c == 0) {
                    roller2.backdropText = textViewRoll;
                }
                if (c == 1) {
                    roller2.patternText = textViewRoll;
                }
                if (c == 2) {
                    roller2.modelText = textViewRoll;
                    return;
                }
                return;
            }
            return;
        }
        final ButtonSpan.TextViewButtons[] textViewButtonsArr = new ButtonSpan.TextViewButtons[1];
        textViewButtonsArr[0] = (ButtonSpan.TextViewButtons) ((TableView.TableRowContent) this.tableView.addRow(string, starGiftAttribute.name, AffiliateProgramFragment.percents(starGiftAttribute.rarity_permille), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda91
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$addAttributeRow$33(starGiftAttribute, textViewButtonsArr);
            }
        }).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addAttributeRow$33(TL_stars.StarGiftAttribute starGiftAttribute, ButtonSpan.TextViewButtons[] textViewButtonsArr) {
        showHint(LocaleController.formatString(R.string.Gift2RarityHint, AffiliateProgramFragment.percents(starGiftAttribute.rarity_permille)), textViewButtonsArr[0], false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Roller {
        private AttrRoller backdropRoller;
        private AttrRoller backdropRoller2;
        TextViewRoll backdropText;
        private boolean drawing;
        private float durationT;
        private long lastFrameTime;
        private AttrRoller modelRoller;
        TextViewRoll modelText;
        TextViewRoll patternText;
        private boolean posted;
        private TL_stars.TL_starGiftUnique rollingGift;
        private AttrRoller symbolRoller;
        public final TopView topView;
        private Runnable whenDone;
        private Runnable whenDone2;
        private final ArrayList models = new ArrayList();
        private final ArrayList backgrounds = new ArrayList();
        private final ArrayList symbols = new ArrayList();
        private float realTime = 0.0f;
        private boolean rolling = false;
        private boolean sentDone = false;
        private boolean sentDone2 = false;

        public static class Attr {
            public String name;
            public int rarity_permille;

            public void detach() {
            }

            public boolean isLoaded() {
                return true;
            }
        }

        private static class AttrRoller {
            public final ArrayList attributes;
            public Attr current;
            public int currentT;
            private final AnimatedFloat fast;
            public final Attr finish;
            private final Runnable invalidate;
            private int lastNextIndex = -1;
            public Attr next;
            public Attr prev;
            private int slowing;
            private final float speedMult;
            public final Attr start;
            public float time;
            private final int totalSlowing;

            public AttrRoller(Runnable runnable, ArrayList arrayList, Attr attr, Attr attr2, float f, int i) {
                this.time = 0.0f;
                this.invalidate = runnable;
                this.attributes = arrayList;
                this.start = attr;
                this.finish = attr2;
                this.speedMult = f;
                this.totalSlowing = i;
                AnimatedFloat animatedFloat = new AnimatedFloat(runnable, 300L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.fast = animatedFloat;
                animatedFloat.force(true);
                this.time = -0.5f;
                this.currentT = 1;
                this.slowing = i;
                this.prev = attr;
                this.current = next(false);
                this.next = next(false);
            }

            public void skip() {
                this.prev = this.current;
                this.current = this.finish;
                this.next = null;
                int i = this.currentT + 1;
                this.currentT = i;
                this.time = i + 0.5f;
            }

            public boolean isFinished() {
                return this.current == this.finish && this.time >= ((float) this.currentT) + 0.5f;
            }

            public boolean isAlmostFinished() {
                return isAlmostFinished(0.25f);
            }

            public boolean isAlmostFinished(float f) {
                return this.current == this.finish && this.time + f >= ((float) this.currentT) + 0.5f;
            }

            public float step(float f, boolean z) {
                long j;
                Attr attr;
                Attr attr2;
                AnimatedFloat animatedFloat = this.fast;
                int i = this.slowing;
                int i2 = this.totalSlowing;
                if (i >= i2) {
                    j = 450;
                } else {
                    j = i2 == 3 ? 4500 : 2500;
                }
                animatedFloat.setDuration(j);
                float lerp = this.time + (f * AndroidUtilities.lerp(this.totalSlowing == 3 ? 0.75f : 2.0f, 7.5f, this.fast.set(this.slowing >= this.totalSlowing)) * this.speedMult);
                this.time = lerp;
                if (lerp >= 0.0f) {
                    double d = lerp;
                    if (Math.floor(d) + 1.0d > this.currentT && (attr = this.current) != (attr2 = this.finish)) {
                        this.prev = attr;
                        Attr attr3 = this.next;
                        this.current = attr3;
                        this.next = attr3 == attr2 ? null : next(z);
                        this.currentT = ((int) Math.floor(d)) + 1;
                    }
                }
                return this.current == this.finish ? Math.min(lerp, this.currentT + 0.5f) : lerp;
            }

            public Attr next(boolean z) {
                if (z && this.finish.isLoaded()) {
                    int i = this.slowing;
                    if (i <= 0) {
                        return this.finish;
                    }
                    this.slowing = i - 1;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.attributes.size(); i2++) {
                    if (i2 != this.lastNextIndex && ((Attr) this.attributes.get(i2)).isLoaded()) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList.isEmpty()) {
                    for (int i3 = 0; i3 < this.attributes.size(); i3++) {
                        if (((Attr) this.attributes.get(i3)).isLoaded()) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return this.start;
                    }
                }
                int intValue = ((Integer) AndroidUtilities.randomOf(arrayList)).intValue();
                this.lastNextIndex = intValue;
                return (Attr) this.attributes.get(intValue);
            }

            public void detach() {
                Attr attr = this.start;
                if (attr != null) {
                    attr.detach();
                }
                Attr attr2 = this.finish;
                if (attr2 != null) {
                    attr2.detach();
                }
            }
        }

        public Roller(TopView topView) {
            this.topView = topView;
            topView.imagesRollView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: org.telegram.ui.Stars.StarGiftSheet.Roller.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    Iterator it = Roller.this.models.iterator();
                    while (it.hasNext()) {
                        ((Sticker) it.next()).attach();
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    Iterator it = Roller.this.models.iterator();
                    while (it.hasNext()) {
                        ((Sticker) it.next()).detach();
                    }
                }
            });
        }

        public void preload(ArrayList arrayList) {
            Iterator it = this.models.iterator();
            while (it.hasNext()) {
                ((Sticker) it.next()).detach();
            }
            this.models.clear();
            this.backgrounds.clear();
            this.symbols.clear();
            Iterator it2 = StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeModel.class).iterator();
            while (it2.hasNext()) {
                Sticker sticker = new Sticker(this.topView.imagesRollView, (TL_stars.starGiftAttributeModel) it2.next());
                if (this.topView.isAttachedToWindow()) {
                    sticker.attach();
                }
                this.models.add(sticker);
            }
            Iterator it3 = StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeBackdrop.class).iterator();
            while (it3.hasNext()) {
                this.backgrounds.add(new Background((TL_stars.starGiftAttributeBackdrop) it3.next()));
            }
            Iterator it4 = StarsController.findAttributes(arrayList, TL_stars.starGiftAttributePattern.class).iterator();
            while (it4.hasNext()) {
                this.symbols.add(new Symbol((TL_stars.starGiftAttributePattern) it4.next()));
            }
        }

        public void stopPreload() {
            if (this.rolling) {
                return;
            }
            Iterator it = this.models.iterator();
            while (it.hasNext()) {
                ((Sticker) it.next()).detach();
            }
            this.models.clear();
            this.backgrounds.clear();
            this.symbols.clear();
        }

        public void detach() {
            this.rolling = false;
            this.topView.imagesRollView.resetDrawing();
            AttrRoller attrRoller = this.modelRoller;
            if (attrRoller != null) {
                attrRoller.detach();
            }
            AttrRoller attrRoller2 = this.symbolRoller;
            if (attrRoller2 != null) {
                attrRoller2.detach();
            }
            AttrRoller attrRoller3 = this.backdropRoller;
            if (attrRoller3 != null) {
                attrRoller3.detach();
            }
            AttrRoller attrRoller4 = this.backdropRoller2;
            if (attrRoller4 != null) {
                attrRoller4.detach();
            }
            stopPreload();
        }

        public boolean set(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z, Runnable runnable, Runnable runnable2) {
            boolean z2 = tL_starGiftUnique == null ? false : z;
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.rollingGift;
            if (tL_starGiftUnique2 != null && tL_starGiftUnique2.id == tL_starGiftUnique.id) {
                return this.rolling;
            }
            if (!z2) {
                return false;
            }
            BackupImageView upgradeImageView = this.topView.getUpgradeImageView();
            TL_stars.starGiftAttributeModel upgradeImageViewAttribute = this.topView.getUpgradeImageViewAttribute();
            TL_stars.starGiftAttributePattern upgradePatternAttribute = this.topView.getUpgradePatternAttribute();
            TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = this.topView.getUpgradeBackdropAttribute();
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
            this.rolling = true;
            this.rollingGift = tL_starGiftUnique;
            this.whenDone = runnable;
            this.whenDone2 = runnable2;
            this.durationT = (float) Math.random();
            this.lastFrameTime = System.currentTimeMillis();
            this.realTime = 0.0f;
            this.sentDone = false;
            this.sentDone2 = false;
            this.rolling = true;
            AttrRoller attrRoller = this.modelRoller;
            if (attrRoller != null) {
                attrRoller.detach();
            }
            Sticker sticker = new Sticker(this.topView.imagesRollView, stargiftattributemodel);
            if (this.topView.imagesRollView.isAttachedToWindow()) {
                sticker.attach();
            }
            this.modelRoller = new AttrRoller(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$Roller$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.Roller.this.invalidate();
                }
            }, this.models, new Sticker(upgradeImageView, upgradeImageViewAttribute), sticker, 0.9f, this.durationT > 0.5f ? 3 : 2);
            AttrRoller attrRoller2 = this.symbolRoller;
            if (attrRoller2 != null) {
                attrRoller2.detach();
            }
            this.symbolRoller = new AttrRoller(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$Roller$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.Roller.this.invalidate();
                }
            }, this.symbols, new Symbol(upgradePatternAttribute), new Symbol(stargiftattributepattern), 1.0f, this.durationT > 0.5f ? 2 : 1);
            AttrRoller attrRoller3 = this.backdropRoller;
            if (attrRoller3 != null) {
                attrRoller3.detach();
            }
            this.backdropRoller = new AttrRoller(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$Roller$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.Roller.this.invalidate();
                }
            }, this.backgrounds, new Background(upgradeBackdropAttribute), new Background(stargiftattributebackdrop), 0.5f, this.durationT > 0.5f ? 2 : 1);
            AttrRoller attrRoller4 = this.backdropRoller2;
            if (attrRoller4 != null) {
                attrRoller4.detach();
            }
            this.backdropRoller2 = new AttrRoller(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$Roller$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.Roller.this.invalidate();
                }
            }, this.backgrounds, new Background(upgradeBackdropAttribute), new Background(stargiftattributebackdrop), 1.25f, this.durationT > 0.5f ? 2 : 1);
            invalidate();
            return true;
        }

        public void skip() {
            this.modelRoller.skip();
            this.symbolRoller.skip();
            this.backdropRoller.skip();
            this.backdropRoller2.skip();
        }

        public boolean isRolling() {
            return this.rolling;
        }

        public void invalidate() {
            if (this.rolling && !this.posted) {
                this.posted = true;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$Roller$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.Roller.this.update();
                    }
                });
            }
        }

        public void update() {
            if (this.drawing) {
                return;
            }
            this.posted = false;
            if (this.rolling) {
                this.drawing = true;
                long currentTimeMillis = System.currentTimeMillis();
                float min = Math.min((currentTimeMillis - this.lastFrameTime) / 1000.0f, 0.25f);
                float f = this.realTime + min;
                this.realTime = f;
                float step = this.backdropRoller.step(min, f > AndroidUtilities.lerp(0.1f, 1.0f, this.durationT));
                float step2 = this.backdropRoller2.step(min, this.realTime > AndroidUtilities.lerp(0.1f, 1.0f, this.durationT));
                float step3 = this.symbolRoller.step(min, this.backdropRoller.isAlmostFinished(0.5f));
                float step4 = this.modelRoller.step(min, this.backdropRoller.isAlmostFinished(0.5f) && this.symbolRoller.isAlmostFinished(0.5f));
                this.lastFrameTime = currentTimeMillis;
                if (this.backdropRoller.isFinished() && this.symbolRoller.isFinished() && this.modelRoller.isFinished() && !this.sentDone) {
                    this.sentDone = true;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$Roller$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.Roller.this.lambda$update$0();
                        }
                    });
                }
                if (this.backdropRoller.isFinished() && this.symbolRoller.isFinished() && this.modelRoller.isAlmostFinished() && !this.sentDone2) {
                    this.sentDone2 = true;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$Roller$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.Roller.this.lambda$update$1();
                        }
                    });
                }
                TextViewRoll textViewRoll = this.modelText;
                if (textViewRoll != null) {
                    AttrRoller attrRoller = this.modelRoller;
                    Attr attr = attrRoller.prev;
                    float f2 = attrRoller.currentT - step4;
                    float f3 = f2 - 1.0f;
                    Attr attr2 = attrRoller.finish;
                    boolean z = attr == attr2;
                    Attr attr3 = attrRoller.current;
                    boolean z2 = attr3 == attr2;
                    Attr attr4 = attrRoller.next;
                    textViewRoll.update(attr, f3, z, attr3, f2, z2, attr4, f2 + 1.0f, attr4 == attr2);
                }
                TextViewRoll textViewRoll2 = this.patternText;
                if (textViewRoll2 != null) {
                    AttrRoller attrRoller2 = this.symbolRoller;
                    Attr attr5 = attrRoller2.prev;
                    float f4 = attrRoller2.currentT - step3;
                    float f5 = f4 - 1.0f;
                    Attr attr6 = attrRoller2.finish;
                    boolean z3 = attr5 == attr6;
                    Attr attr7 = attrRoller2.current;
                    boolean z4 = attr7 == attr6;
                    Attr attr8 = attrRoller2.next;
                    textViewRoll2.update(attr5, f5, z3, attr7, f4, z4, attr8, f4 + 1.0f, attr8 == attr6);
                }
                TextViewRoll textViewRoll3 = this.backdropText;
                if (textViewRoll3 != null) {
                    AttrRoller attrRoller3 = this.backdropRoller2;
                    Attr attr9 = attrRoller3.prev;
                    float f6 = attrRoller3.currentT - step2;
                    float f7 = f6 - 1.0f;
                    Attr attr10 = attrRoller3.finish;
                    boolean z5 = attr9 == attr10;
                    Attr attr11 = attrRoller3.current;
                    boolean z6 = attr11 == attr10;
                    Attr attr12 = attrRoller3.next;
                    textViewRoll3.update(attr9, f7, z5, attr11, f6, z6, attr12, f6 + 1.0f, attr12 == attr10);
                }
                this.topView.setPattern(0, ((Symbol) this.symbolRoller.current).attr, true);
                StickersRollView stickersRollView = this.topView.imagesRollView;
                AttrRoller attrRoller4 = this.modelRoller;
                Attr attr13 = attrRoller4.prev;
                Sticker sticker = (Sticker) attr13;
                float f8 = attrRoller4.currentT - step4;
                float f9 = f8 - 1.0f;
                Attr attr14 = attrRoller4.finish;
                boolean z7 = attr13 == attr14;
                Attr attr15 = attrRoller4.current;
                Sticker sticker2 = (Sticker) attr15;
                boolean z8 = attr15 == attr14;
                Attr attr16 = attrRoller4.next;
                Sticker sticker3 = (Sticker) attr16;
                float f10 = f8 + 1.0f;
                boolean z9 = attr16 == attr14;
                AttrRoller attrRoller5 = this.backdropRoller;
                Attr attr17 = attrRoller5.prev;
                Background background = (Background) attr17;
                float f11 = attrRoller5.currentT - step;
                float f12 = f11 - 1.0f;
                Attr attr18 = attrRoller5.finish;
                boolean z10 = attr17 == attr18;
                Attr attr19 = attrRoller5.current;
                Background background2 = (Background) attr19;
                boolean z11 = attr19 == attr18;
                Attr attr20 = attrRoller5.next;
                stickersRollView.setDrawing(sticker, f9, z7, sticker2, f8, z8, sticker3, f10, z9, background, f12, z10, background2, f11, z11, (Background) attr20, f11 + 1.0f, attr20 == attr18);
                this.drawing = false;
                invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$update$0() {
            this.rolling = false;
            this.topView.imagesRollView.resetDrawing();
            Runnable runnable = this.whenDone;
            if (runnable != null) {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$update$1() {
            Runnable runnable = this.whenDone2;
            if (runnable != null) {
                runnable.run();
            }
        }

        public static class Sticker extends Attr {
            public final ImageReceiver imageReceiver;
            public final boolean mine;

            public Sticker(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
                this.name = stargiftattributemodel.name;
                this.rarity_permille = stargiftattributemodel.rarity_permille;
                this.mine = true;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                this.imageReceiver = imageReceiver;
                StarsIntroActivity.setGiftImage(imageReceiver, stargiftattributemodel.document, NotificationCenter.albumsDidLoad);
            }

            public Sticker(BackupImageView backupImageView, TL_stars.starGiftAttributeModel stargiftattributemodel) {
                this.name = stargiftattributemodel.name;
                this.rarity_permille = stargiftattributemodel.rarity_permille;
                this.mine = false;
                this.imageReceiver = backupImageView.getImageReceiver();
            }

            public void attach() {
                if (this.mine) {
                    this.imageReceiver.onAttachedToWindow();
                }
            }

            @Override // org.telegram.ui.Stars.StarGiftSheet.Roller.Attr
            public void detach() {
                if (this.mine) {
                    this.imageReceiver.onDetachedFromWindow();
                }
            }

            @Override // org.telegram.ui.Stars.StarGiftSheet.Roller.Attr
            public boolean isLoaded() {
                return this.imageReceiver.getLottieAnimation() != null;
            }
        }

        public static class Symbol extends Attr {
            public final TL_stars.starGiftAttributePattern attr;

            public Symbol(TL_stars.starGiftAttributePattern stargiftattributepattern) {
                this.name = stargiftattributepattern.name;
                this.rarity_permille = stargiftattributepattern.rarity_permille;
                this.attr = stargiftattributepattern;
            }
        }

        public static class Background extends Attr {
            public final int backgroundColor;
            public final RadialGradient backgroundGradient;
            public final Matrix backgroundMatrix;
            public final Paint backgroundPaint;
            public final int patternColor;
            public final int textColor;

            public Background(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
                this.name = stargiftattributebackdrop.name;
                this.rarity_permille = stargiftattributebackdrop.rarity_permille;
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                this.backgroundMatrix = new Matrix();
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.backgroundGradient = radialGradient;
                paint.setShader(radialGradient);
                this.textColor = stargiftattributebackdrop.text_color | (-16777216);
                int i = stargiftattributebackdrop.pattern_color | (-16777216);
                this.patternColor = i;
                this.backgroundColor = ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), i, 0.25f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class TextViewRoll extends FrameLayout {
        private boolean bounced;
        private final GradientClip clip;
        private final TextView current;
        private final TextView next;
        private final TextView prev;
        private final RectF rect;
        private final Theme.ResourcesProvider resourcesProvider;
        private final Utilities.Callback3 showHint;

        public TextViewRoll(Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback3 callback3) {
            super(context);
            this.clip = new GradientClip();
            this.rect = new RectF();
            this.showHint = callback3;
            this.resourcesProvider = resourcesProvider;
            TextView textView = new TextView(context, resourcesProvider);
            this.prev = textView;
            TextView textView2 = new TextView(context, resourcesProvider);
            this.current = textView2;
            TextView textView3 = new TextView(context, resourcesProvider);
            this.next = textView3;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
            addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        }

        private void bounce(final View view) {
            if (this.bounced || view == null) {
                return;
            }
            this.bounced = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$TextViewRoll$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StarGiftSheet.TextViewRoll.lambda$bounce$0(view, valueAnimator);
                }
            });
            ofFloat.setDuration(180L);
            ofFloat.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$bounce$0(View view, ValueAnimator valueAnimator) {
            float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
            view.setScaleX(sin);
            view.setScaleY(sin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static class TextView extends ButtonSpan.TextViewButtons {
            private String lastName;
            private int lastRarity;
            private final Theme.ResourcesProvider resourcesProvider;

            public TextView(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                this.resourcesProvider = resourcesProvider;
                setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                setTextSize(1, 14.0f);
                setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            }

            public void set(String str, final int i, final Utilities.Callback3 callback3) {
                if (str == this.lastName && this.lastRarity == i) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
                spannableStringBuilder.append((CharSequence) " ").append(ButtonSpan.make(AffiliateProgramFragment.percents(i), callback3 != null ? new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$TextViewRoll$TextView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.TextViewRoll.TextView.this.lambda$set$0(callback3, i);
                    }
                } : null, this.resourcesProvider));
                setText(spannableStringBuilder);
                this.lastName = str;
                this.lastRarity = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$set$0(Utilities.Callback3 callback3, int i) {
                callback3.run(LocaleController.formatString(R.string.Gift2RarityHint, AffiliateProgramFragment.percents(i)), this, Boolean.FALSE);
            }
        }

        public void update(Roller.Attr attr, float f, boolean z, Roller.Attr attr2, float f2, boolean z2, Roller.Attr attr3, float f3, boolean z3) {
            if (attr != null) {
                float max = z ? Math.max(0.5f, f) : f;
                this.prev.setVisibility(0);
                this.prev.set(attr.name, attr.rarity_permille, this.showHint);
                this.prev.setTranslationY(AndroidUtilities.dp(36.0f) * ((max - 0.5f) / 1.5f));
            } else {
                this.prev.setVisibility(4);
            }
            if (attr2 != null) {
                float f4 = f2;
                if (z2) {
                    f4 = Math.max(0.5f, f4);
                }
                float f5 = (f4 - 0.5f) / 1.5f;
                this.current.setVisibility(0);
                this.current.set(attr2.name, attr2.rarity_permille, this.showHint);
                this.current.setTranslationY(AndroidUtilities.dp(36.0f) * f5);
                if (z2 && f5 <= 0.0f) {
                    bounce(this.current);
                }
            } else {
                this.current.setVisibility(4);
            }
            if (attr3 != null) {
                float f6 = f3;
                if (z3) {
                    f6 = Math.max(0.5f, f6);
                }
                this.next.setVisibility(0);
                this.next.set(attr3.name, attr3.rarity_permille, this.showHint);
                this.next.setTranslationY(AndroidUtilities.dp(36.0f) * ((f6 - 0.5f) / 1.5f));
                return;
            }
            this.next.setVisibility(4);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), TLObject.FLAG_30));
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), NotificationCenter.didApplyNewTheme, 31);
            super.dispatchDraw(canvas);
            canvas.save();
            this.rect.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
            this.clip.draw(canvas, this.rect, 1, 1.0f);
            this.rect.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
            this.clip.draw(canvas, this.rect, 3, 1.0f);
            canvas.restore();
            canvas.restore();
        }
    }

    public StarGiftSheet set(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, StarsController.IGiftsList iGiftsList) {
        Roller roller;
        this.slug = str;
        this.slugStarGift = tL_starGiftUnique;
        this.giftsList = iGiftsList;
        this.resale = (tL_starGiftUnique.resell_amount == null || isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.rolling && (roller = this.roller) != null && roller.isRolling() && this.roller.rollingGift != null && this.roller.rollingGift.id != tL_starGiftUnique.id) {
            this.roller.detach();
            this.roller = null;
            this.topView.imageLayout.setAlpha(1.0f);
            this.topView.imagesRollView.setAlpha(0.0f);
        }
        this.actionView.set(this.currentAccount, this.savedStarGift);
        set(tL_starGiftUnique, false);
        this.beforeTableTextView.setVisibility(8);
        String str2 = tL_starGiftUnique.owner_address;
        final String str3 = tL_starGiftUnique.gift_address;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            this.afterTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$set$34(str3);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            this.afterTableTextView.setVisibility(0);
        } else {
            this.afterTableTextView.setVisibility(8);
        }
        if (this.resale) {
            setButtonTextResale(tL_starGiftUnique);
            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda22
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarGiftSheet.this.lambda$set$35(view);
                }
            });
        }
        if (this.firstSet) {
            switchPage(0, false);
            this.layoutManager.scrollToPosition(0);
            this.firstSet = false;
        }
        updateViewPager();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$34(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$35(View view) {
        onBuyPressed();
    }

    private CharSequence releasedByText(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return releasedByText(starGift.released_by);
    }

    private CharSequence releasedByText(TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        final String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy, "@" + publicUsername), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$releasedByText$36(publicUsername);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasedByText$36(String str) {
        lambda$new$0();
        Browser.openUrl(getContext(), "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + str);
    }

    private CharSequence releasedByUniqueText(int i, TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        final String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return replaceSingleTagToLink(LocaleController.formatPluralStringComma("Gift2CollectionNumberBy", i, "@" + publicUsername), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda90
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$releasedByUniqueText$37(publicUsername);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasedByUniqueText$37(String str) {
        lambda$new$0();
        Browser.openUrl(getContext(), "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + str);
    }

    public static SpannableStringBuilder replaceSingleTagToLink(String str, final Runnable runnable) {
        int i;
        int i2;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i2 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i = 0;
        } else {
            i = i2 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarGiftSheet.9
                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(-1);
                }

                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, indexOf, i + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x03fe, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r3).drop_original_details_stars >= 0) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(final TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z) {
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        SpannableString spannableString;
        Spannable spannable;
        final CharSequence formatSpannable;
        TLRPC.Message message;
        Roller roller;
        final long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        final long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        this.title = tL_starGiftUnique.title + " #" + LocaleController.formatNumber(tL_starGiftUnique.num, ',');
        if (!this.rolling && (roller = this.roller) != null && roller.isRolling() && this.roller.rollingGift != null && this.roller.rollingGift.id != tL_starGiftUnique.id) {
            this.roller.detach();
            this.roller = null;
            this.topView.imageLayout.setAlpha(1.0f);
            this.topView.imagesRollView.setAlpha(0.0f);
        } else if (this.rolling && this.roller == null) {
            this.roller = new Roller(this.topView);
        }
        this.topView.setGift(tL_starGiftUnique, isMineWithActions(this.currentAccount, peerDialogId), isMineWithActions(this.currentAccount, peerDialogId2), isWorn(this.currentAccount, getUniqueGift()), getLink() != null, this.rolling);
        this.topView.setText(0, tL_starGiftUnique.title, tL_starGiftUnique.released_by == null ? LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num) : null, releasedByUniqueText(tL_starGiftUnique.num, tL_starGiftUnique.released_by), null);
        this.ownerTextView = null;
        this.tableView.clear();
        if (!z) {
            if (tL_starGiftUnique.host_id != null) {
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    this.tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.this.lambda$set$38();
                        }
                    });
                }
                if (peerDialogId2 != 0) {
                    this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda70
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.this.lambda$set$39(peerDialogId2);
                        }
                    }).getChildAt(1)).getChildAt(0);
                }
            } else if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                this.tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda71
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$40();
                    }
                });
            } else if (peerDialogId == 0 && tL_starGiftUnique.owner_name != null) {
                this.tableView.addRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name);
            } else if (peerDialogId != 0) {
                this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, peerDialogId, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda72
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$41(peerDialogId);
                    }
                }).getChildAt(1)).getChildAt(0);
            }
        }
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z) {
            if (this.messageObject != null) {
                if (!this.messageObjectRepolled) {
                    TextView textView = (TextView) ((TableView.TableRowContent) this.tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), "").getChildAt(1)).getChildAt(0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                    LoadingSpan loadingSpan = new LoadingSpan(textView, AndroidUtilities.dp(90.0f), 0, this.resourcesProvider);
                    int i = Theme.key_windowBackgroundWhiteBlackText;
                    loadingSpan.setColors(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.21f), Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.08f));
                    spannableStringBuilder.setSpan(loadingSpan, 0, 1, 33);
                    textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                    repollMessage();
                } else {
                    this.tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total));
                }
            } else {
                this.tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total));
            }
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                String formatCurrency = BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true);
                final String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency);
                this.tableView.addRow(LocaleController.getString(R.string.GiftValue2), "~" + formatCurrency, LocaleController.getString(R.string.GiftValue2LearnMore), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda73
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$42(tL_starGiftUnique, formatCurrency2);
                    }
                });
            }
        }
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
            if ((stargiftattributeoriginaldetails.flags & 1) != 0) {
                final long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                SpannableString spannableString2 = new SpannableString(DialogObject.getName(peerDialogId3));
                spannableString2.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarGiftSheet.10
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        StarGiftSheet.this.lambda$set$72(peerDialogId3);
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        textPaint.setColor(textPaint.linkColor);
                    }
                }, 0, spannableString2.length(), 33);
                spannableString = spannableString2;
            } else {
                spannableString = null;
            }
            final long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
            SpannableString spannableString3 = new SpannableString(DialogObject.getName(peerDialogId4));
            spannableString3.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarGiftSheet.11
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    StarGiftSheet.this.lambda$set$72(peerDialogId4);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(textPaint.linkColor);
                }
            }, 0, spannableString3.length(), 33);
            if (stargiftattributeoriginaldetails.message != null) {
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                MessageObject.addEntitiesToText(spannableStringBuilder2, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                spannable = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint.getFontMetricsInt(), false), stargiftattributeoriginaldetails.message.entities, textPaint.getFontMetricsInt());
            } else {
                spannable = null;
            }
            String replaceAll = LocaleController.getInstance().getFormatterYear().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
            if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                if (spannable == null) {
                    formatSpannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelf, spannableString, replaceAll);
                } else {
                    formatSpannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelfComment, spannableString, replaceAll, spannable);
                }
            } else if (spannableString != null) {
                if (spannable == null) {
                    formatSpannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetails, spannableString, spannableString3, replaceAll);
                } else {
                    formatSpannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsComment, spannableString, spannableString3, replaceAll, spannable);
                }
            } else if (spannable == null) {
                formatSpannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSender, spannableString3, replaceAll);
            } else {
                formatSpannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSenderComment, spannableString3, replaceAll, spannable);
            }
            if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                    MessageObject messageObject = this.messageObject;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        }
                    }
                }
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                linearLayout.setOrientation(0);
                SpoilersTextView spoilersTextView = new SpoilersTextView(getContext());
                spoilersTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
                spoilersTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
                spoilersTextView.setTextSize(1, 12.0f);
                spoilersTextView.setGravity(3);
                spoilersTextView.setText(formatSpannable);
                linearLayout.addView(spoilersTextView, LayoutHelper.createLinear(-1, -2, 1.0f, 19));
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i2 = Theme.key_featuredStickers_addButton;
                imageView.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i2, this.resourcesProvider), 0.1f), 6, 6));
                imageView.setImageResource(R.drawable.menu_delete_old);
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                ScaleStateListAnimator.apply(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda74
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$43(formatSpannable, view);
                    }
                });
                linearLayout.addView(imageView, LayoutHelper.createLinear(32, 32, 0.0f, 21, 8, 0, 0, 0));
                TableRow tableRow = new TableRow(getContext());
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                layoutParams.span = 2;
                tableRow.addView(new TableView.TableRowFullContent(this.tableView, linearLayout, true), layoutParams);
                this.tableView.addView(tableRow);
            }
            TableView.TableRowFullContent addFullRow = this.tableView.addFullRow(formatSpannable);
            addFullRow.setFilled(true);
            SpoilersTextView spoilersTextView2 = (SpoilersTextView) addFullRow.getChildAt(0);
            spoilersTextView2.setTextSize(1, 12.0f);
            spoilersTextView2.setGravity(17);
        }
        Roller roller2 = this.roller;
        if (roller2 == null || !roller2.isRolling()) {
            if (!isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) && tL_starGiftUnique.resell_amount != null) {
                this.button.setFilled(true);
                setButtonTextResale(tL_starGiftUnique);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda75
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$44(view);
                    }
                });
            } else if (this.upgradedOnce && this.viewPager != null && this.giftsList != null && getListPosition() >= 0 && this.giftsList.findGiftToUpgrade(getListPosition()) >= 0) {
                this.button.setFilled(false);
                final int findGiftToUpgrade = this.giftsList.findGiftToUpgrade(getListPosition());
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.giftsList.get(findGiftToUpgrade);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                    spannableStringBuilder3.append((CharSequence) " e");
                    spannableStringBuilder3.setSpan(new AnimatedEmojiSpan(document, this.button.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                }
                this.button.setText(spannableStringBuilder3, !this.firstSet);
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda76
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$45(findGiftToUpgrade, view);
                    }
                });
            } else {
                this.button.setFilled(true);
                this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda77
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$46(view);
                    }
                });
            }
        }
        this.actionBar.setTitle(getTitle());
        Roller roller3 = this.roller;
        if (roller3 == null || !roller3.set(tL_starGiftUnique, this.rolling, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda78
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$set$49();
            }
        }, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda67
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$set$50();
            }
        })) {
            return;
        }
        this.topView.imageLayout.setAlpha(0.0f);
        this.topView.imagesRollView.setAlpha(1.0f);
        this.button.setText(LocaleController.getString(R.string.GiftSkipAnimation), true);
        this.button.setFilled(true);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarGiftSheet.this.lambda$set$51(view);
            }
        });
        this.recyclerListView.scrollToPosition(this.adapter.getItemCount() - 1);
        this.recyclerListView.post(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda69
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$set$52();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$38() {
        getBulletinFactory().createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.WalletAddressCopied)).show(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$40() {
        getBulletinFactory().createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.WalletAddressCopied)).show(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$42(TL_stars.TL_starGiftUnique tL_starGiftUnique, String str) {
        openValueStats(tL_starGiftUnique.gift_id, tL_starGiftUnique.title, getGiftName(), str, tL_starGiftUnique.getDocument(), tL_starGiftUnique.slug);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$43(CharSequence charSequence, View view) {
        lambda$showDeleteDescriptionAlert$54(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$44(View view) {
        onBuyPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$45(int i, View view) {
        this.overrideNextIndex = i;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() + (i > getListPosition() ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$46(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$49() {
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        ImageReceiver imageReceiver = (this.roller.modelRoller == null || this.roller.modelRoller.current == null) ? null : ((Roller.Sticker) this.roller.modelRoller.current).imageReceiver;
        BackupImageView backupImageView = this.topView.imageView[0];
        if (imageReceiver != null && backupImageView != null && backupImageView.getImageReceiver() != null) {
            RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
            RLottieDrawable lottieAnimation2 = backupImageView.getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
            } else if (lottieAnimation2 == null && lottieAnimation != null) {
                imageReceiver.clearImage();
                backupImageView.setImageDrawable(lottieAnimation);
            }
        }
        this.topView.imageLayout.setAlpha(1.0f);
        this.topView.imagesRollView.setAlpha(0.0f);
        if (this.upgradedOnce && this.viewPager != null && this.giftsList != null && getListPosition() >= 0 && this.giftsList.findGiftToUpgrade(getListPosition()) >= 0) {
            this.button.setFilled(false);
            final int findGiftToUpgrade = this.giftsList.findGiftToUpgrade(getListPosition());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
            Object obj = this.giftsList.get(findGiftToUpgrade);
            if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                spannableStringBuilder.append((CharSequence) " e");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(document, this.button.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            this.button.setText(spannableStringBuilder, true);
            this.button.setSubText(null, true);
            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda102
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarGiftSheet.this.lambda$set$47(findGiftToUpgrade, view);
                }
            });
            return;
        }
        this.button.setFilled(true);
        this.button.setText(LocaleController.getString(R.string.OK), true);
        this.button.setSubText(null, true);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda103
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarGiftSheet.this.lambda$set$48(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$47(int i, View view) {
        this.overrideNextIndex = i;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() + (i > getListPosition() ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$48(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$50() {
        String str;
        if (getGift() == null) {
            str = "";
        } else {
            str = getGift().title + " #" + LocaleController.formatNumber(getGift().num, ',');
        }
        getBulletinFactory().createSimpleBulletin(R.raw.gift_upgrade, LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str))).setDuration(5000).ignoreDetach().show();
        FireworksOverlay fireworksOverlay = this.fireworksOverlay;
        if (fireworksOverlay != null) {
            fireworksOverlay.start(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$51(View view) {
        this.roller.skip();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$52() {
        this.recyclerListView.scrollToPosition(this.adapter.getItemCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDeleteDescriptionAlert, reason: merged with bridge method [inline-methods] */
    public void lambda$showDeleteDescriptionAlert$54(final CharSequence charSequence) {
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null || uniqueGift == null) {
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = inputStarGift;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
        if (makeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = makeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda112
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$showDeleteDescriptionAlert$59(charSequence, uniqueGift, tL_inputInvoiceStarGiftDropOriginalDetails, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeleteDescriptionAlert$59(final CharSequence charSequence, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda140
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$showDeleteDescriptionAlert$58(tLObject, charSequence, tL_starGiftUnique, tL_inputInvoiceStarGiftDropOriginalDetails, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeleteDescriptionAlert$58(TLObject tLObject, final CharSequence charSequence, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                getBulletinFactory().showForError(tL_error);
                return;
            }
            return;
        }
        final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        Iterator<TLRPC.TL_labeledPrice> it = paymentForm.invoice.prices.iterator();
        final long j = 0;
        while (it.hasNext()) {
            j += it.next().amount;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView makeTextView = TextHelper.makeTextView(getContext(), 16.0f, Theme.key_dialogTextBlack, false);
        makeTextView.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(makeTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 16.0f));
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        TableView.TableRowFullContent addFullRow = tableView.addFullRow(charSequence);
        addFullRow.setFilled(true);
        SpoilersTextView spoilersTextView = (SpoilersTextView) addFullRow.getChildAt(0);
        spoilersTextView.setTextSize(1, 12.0f);
        spoilersTextView.setGravity(17);
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2RemoveDescriptionTitle)).setView(linearLayout).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j))), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda153
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                StarGiftSheet.this.lambda$showDeleteDescriptionAlert$57(tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j, charSequence, alertDialog, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeleteDescriptionAlert$57(final TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, final long j, final CharSequence charSequence, final AlertDialog alertDialog, int i) {
        if (tL_starGiftUnique == null) {
            return;
        }
        final Browser.Progress makeButtonLoading = alertDialog.makeButtonLoading(-1);
        makeButtonLoading.init();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda165
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$showDeleteDescriptionAlert$56(makeButtonLoading, alertDialog, tL_starGiftUnique, j, charSequence, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeleteDescriptionAlert$56(final Browser.Progress progress, final AlertDialog alertDialog, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, final CharSequence charSequence, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda176
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$showDeleteDescriptionAlert$55(progress, alertDialog, tLObject, tL_starGiftUnique, tL_error, j, charSequence);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeleteDescriptionAlert$55(Browser.Progress progress, AlertDialog alertDialog, TLObject tLObject, final TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j, final CharSequence charSequence) {
        progress.end();
        alertDialog.dismiss();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            int i = 0;
            while (i < tL_starGiftUnique.attributes.size()) {
                if (tL_starGiftUnique.attributes.get(i) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                    tL_starGiftUnique.attributes.remove(i);
                    i--;
                }
                i++;
            }
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            set(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$showDeleteDescriptionAlert$53(tL_starGiftUnique);
                }
            });
            return;
        }
        if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 16, null, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$showDeleteDescriptionAlert$54(charSequence);
                }
            }, 0L).show();
        } else if (tL_error != null) {
            getBulletinFactory().showForError(tL_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDeleteDescriptionAlert$53(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        getBulletinFactory().createSimpleBulletin(R.raw.ic_delete, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).show();
    }

    private void setButtonTextResale(TL_stars.StarGift starGift) {
        AmountUtils$Amount resellAmount = starGift.getResellAmount(AmountUtils$Currency.STARS);
        if (starGift.resale_ton_only) {
            this.button.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(R.string.ResellGiftBuyTON, starGift.getResellAmount(AmountUtils$Currency.TON).asFormatString())), !this.firstSet);
            this.button.setSubText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.asDecimal())), !this.firstSet);
        } else {
            this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.asDecimal())), !this.firstSet);
            this.button.setSubText(null, !this.firstSet);
        }
    }

    public StarGiftSheet setOnGiftUpdatedListener(Runnable runnable) {
        this.onGiftUpdatedListener = runnable;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v69 */
    public StarGiftSheet set(TL_stars.SavedStarGift savedStarGift, StarsController.IGiftsList iGiftsList) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        long j;
        CharSequence charSequence;
        String formatString;
        char c;
        CharSequence charSequence2;
        String str;
        CharSequence charSequence3;
        CharSequence charSequence4;
        final String str2;
        boolean z;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        String str3;
        boolean z2;
        String string;
        SpannableStringBuilder replaceTags;
        ?? r2;
        Roller roller;
        if (savedStarGift == null) {
            return this;
        }
        this.myProfile = isMine(this.currentAccount, this.dialogId);
        this.savedStarGift = savedStarGift;
        this.giftsList = iGiftsList;
        this.messageObject = null;
        if (!this.rolling && (roller = this.roller) != null && roller.isRolling() && this.roller.rollingGift != null) {
            this.roller.detach();
            this.roller = null;
            this.topView.imageLayout.setVisibility(0);
            this.topView.imagesRollView.setVisibility(4);
        }
        this.actionView.set(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(this.dialogId);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = UserObject.ANONYMOUS;
        }
        long j2 = this.dialogId;
        boolean z3 = j2 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
        boolean z4 = savedStarGift.refunded;
        TL_stars.StarGift starGift2 = savedStarGift.gift;
        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
            String str4 = starGift2.owner_address;
            String str5 = starGift2.gift_address;
            z2 = starGift2.host_id != null;
            set((TL_stars.TL_starGiftUnique) starGift2, z4);
            str3 = str4;
            tL_textWithEntities = tL_textWithEntities2;
            str2 = str5;
        } else {
            boolean z5 = this.myProfile && clientUserId == peerDialogId && j2 >= 0;
            tL_textWithEntities = tL_textWithEntities2;
            this.topView.setGift(starGift2, false, false, isWorn(this.currentAccount, getUniqueGift()), getLink() != null, false);
            this.tableView.clear();
            if (z5) {
                TopView topView = this.topView;
                String string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                this.title = string2;
                if (z4) {
                    j = peerDialogId;
                    replaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                    j = peerDialogId;
                } else {
                    j = peerDialogId;
                    long j3 = savedStarGift.convert_stars;
                    replaceTags = j3 > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j3)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                topView.setText(0, string2, replaceTags, null, releasedByText(savedStarGift.gift));
            } else {
                j = peerDialogId;
                if (z3 && !this.myProfile) {
                    TopView topView2 = this.topView;
                    String string3 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.title = string3;
                    topView2.setText(0, string3, null, null, releasedByText(savedStarGift.gift.released_by));
                } else {
                    boolean z6 = this.myProfile;
                    if ((!z6 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        TopView topView3 = this.topView;
                        String string4 = LocaleController.getString(z6 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        this.title = string4;
                        topView3.setText(0, string4, (!z4 && this.myProfile) ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : null, null, releasedByText(savedStarGift.gift));
                    } else {
                        TopView topView4 = this.topView;
                        String string5 = LocaleController.getString(z6 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        this.title = string5;
                        if (z4 || !this.myProfile) {
                            charSequence = null;
                        } else {
                            if (isBot || !canConvert()) {
                                if (this.myProfile) {
                                    formatString = LocaleController.getString(savedStarGift.unsaved ? z3 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z3 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                } else {
                                    formatString = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                }
                            } else if (this.myProfile) {
                                if (currentTime <= 0) {
                                    str = z3 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired";
                                } else {
                                    str = z3 ? "Gift2Info3Channel" : "Gift2Info3";
                                }
                                formatString = LocaleController.formatPluralStringComma(str, (int) savedStarGift.convert_stars);
                            } else {
                                formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                            if (isBot || !canConvert()) {
                                c = 1;
                                charSequence2 = "";
                            } else {
                                c = 1;
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda10
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarGiftSheet.this.lambda$set$60();
                                    }
                                }), true);
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[c] = " ";
                            charSequenceArr[2] = charSequence2;
                            charSequence = TextUtils.concat(charSequenceArr);
                        }
                        topView4.setText(0, string5, charSequence, null, releasedByText(savedStarGift.gift));
                    }
                }
            }
            if (clientUserId != j || z3) {
                charSequence3 = " ";
                charSequence4 = "";
                final long j4 = j;
                this.tableView.addRowUser(LocaleController.getString(R.string.Gift2From), this.currentAccount, j4, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$61(j4);
                    }
                }, (j4 == clientUserId || j4 == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) || z3) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$62(j4);
                    }
                });
            } else {
                charSequence3 = " ";
                charSequence4 = "";
            }
            this.tableView.addRow(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))));
            this.tableView.addRow(LocaleController.getString(R.string.Gift2Value), StarsIntroActivity.replaceStarsWithPlain(TextUtils.concat("⭐️ " + LocaleController.formatNumber(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','), charSequence3, (!canConvert() || z4) ? charSequence4 : ButtonSpan.make(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new StarGiftSheet$$ExternalSyntheticLambda14(this), this.resourcesProvider)), 0.8f));
            TL_stars.StarGift starGift3 = savedStarGift.gift;
            if (starGift3.limited && !z4) {
                StarsIntroActivity.addAvailabilityRow(this.tableView, this.currentAccount, starGift3, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
            if (tL_textWithEntities3 != null && !TextUtils.isEmpty(tL_textWithEntities3.text) && !z4) {
                TableView tableView = this.tableView;
                TLRPC.TL_textWithEntities tL_textWithEntities4 = savedStarGift.message;
                tableView.addFullRow(tL_textWithEntities4.text, tL_textWithEntities4.entities);
            }
            boolean z7 = this.myProfile;
            if (z7 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.upgradeIconSpan == null) {
                    this.upgradeIconSpan = new ColoredImageSpan(new UpgradeIcon(this.button, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                }
                spannableStringBuilder.setSpan(this.upgradeIconSpan, 0, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder.append((CharSequence) string);
                this.button.setFilled(true);
                this.button.setText(spannableStringBuilder, !this.firstSet);
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda15
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$63(view);
                    }
                });
            } else if (this.upgradedOnce && z7 && this.viewPager != null && this.giftsList != null && getListPosition() >= 0 && this.giftsList.findGiftToUpgrade(getListPosition()) >= 0) {
                this.button.setFilled(false);
                final int findGiftToUpgrade = this.giftsList.findGiftToUpgrade(getListPosition());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.giftsList.get(findGiftToUpgrade);
                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift.getDocument()) == null) {
                    z = true;
                } else {
                    spannableStringBuilder2.append((CharSequence) " e");
                    z = true;
                    spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(document, this.button.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                this.button.setText(spannableStringBuilder2, this.firstSet ^ z);
                this.button.setSubText(null, this.firstSet ^ z);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda16
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$64(findGiftToUpgrade, view);
                    }
                });
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.upgradeIconSpan == null) {
                    this.upgradeIconSpan = new ColoredImageSpan(new UpgradeIcon(this.button, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                }
                spannableStringBuilder3.setSpan(this.upgradeIconSpan, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                this.button.setFilled(true);
                this.button.setText(spannableStringBuilder3, !this.firstSet);
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda17
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$65(view);
                    }
                });
            } else {
                this.button.setFilled(true);
                this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                str2 = null;
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda18
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$66(view);
                    }
                });
                str3 = str2;
                z2 = false;
            }
            str2 = null;
            str3 = str2;
            z2 = false;
        }
        if (savedStarGift.refunded) {
            this.beforeTableTextView.setVisibility(0);
            this.beforeTableTextView.setText(LocaleController.getString(R.string.Gift2Refunded));
            this.beforeTableTextView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        } else if (z2 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
            this.beforeTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$set$67(str2);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            this.beforeTableTextView.setVisibility(0);
            this.beforeTableTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && this.myProfile && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            this.beforeTableTextView.setVisibility(0);
            this.beforeTableTextView.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            this.beforeTableTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
        } else {
            this.beforeTableTextView.setVisibility(8);
        }
        if (!z2 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
            this.afterTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$set$68(str2);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r2 = 0;
            this.afterTableTextView.setVisibility(0);
        } else if (this.myProfile && isMine(this.currentAccount, this.dialogId)) {
            if (this.dialogId >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.menu_hide_gift);
                    coloredImageSpan.setScale(0.65f, 0.65f);
                    spannableStringBuilder4.setSpan(coloredImageSpan, 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new StarGiftSheet$$ExternalSyntheticLambda11(this)));
                this.afterTableTextView.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                this.afterTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new StarGiftSheet$$ExternalSyntheticLambda11(this)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r2 = 0;
            this.afterTableTextView.setVisibility(0);
        } else {
            r2 = 0;
            this.afterTableTextView.setVisibility(8);
        }
        if (this.firstSet) {
            switchPage(r2, r2);
            this.layoutManager.scrollToPosition(r2);
            this.firstSet = r2;
        }
        this.actionBar.setTitle(getTitle());
        updateViewPager();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$60() {
        new ExplainStarsSheet(getContext()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$62(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda83(this)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$63(View view) {
        openUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$64(int i, View view) {
        this.overrideNextIndex = i;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() + (i > getListPosition() ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$65(View view) {
        openUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$66(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$67(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$68(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public TL_stars.TL_starGiftUnique getUniqueGift() {
        TL_stars.StarGift gift = getGift();
        if (gift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) gift;
        }
        return null;
    }

    public String getGiftName() {
        TL_stars.StarGift gift = getGift();
        if (gift instanceof TL_stars.TL_starGiftUnique) {
            return ((TL_stars.TL_starGiftUnique) gift).title + " #" + LocaleController.formatNumber(r0.num, ',');
        }
        return "";
    }

    public static String getGiftName(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return ((TL_stars.TL_starGiftUnique) starGift).title + " #" + LocaleController.formatNumber(r3.num, ',');
        }
        if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        }
        return LocaleController.getString(R.string.Gift2Gift);
    }

    public TL_stars.StarGift getGift() {
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public StarGiftSheet set(MessageObject messageObject) {
        return set(messageObject, (StarsController.IGiftsList) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StarGiftSheet set(MessageObject messageObject, StarsController.IGiftsList iGiftsList) {
        boolean isOutOwner;
        TLRPC.Peer peer;
        TL_stars.StarGift starGift;
        long j;
        int i;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        long j2;
        boolean z;
        boolean z2;
        long j3;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        TLRPC.Peer peer2;
        boolean z6;
        CharSequence charSequence;
        boolean z7;
        CharSequence charSequence2;
        TLRPC.Peer peer3;
        String formatString;
        boolean z8;
        int i2;
        String string;
        char c;
        CharSequence charSequence3;
        CharSequence concat;
        String str2;
        final long j4;
        final long j5;
        boolean z9;
        boolean z10;
        final String str3;
        boolean z11;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        TL_stars.StarGift starGift3;
        boolean z12;
        String string2;
        String str4;
        SpannableStringBuilder replaceTags;
        SpannableStringBuilder spannableStringBuilder;
        Roller roller;
        String string3;
        boolean z13;
        Roller roller2;
        boolean z14 = false;
        if (messageObject != null && messageObject.messageOwner != null) {
            this.myProfile = false;
            TLRPC.TL_textWithEntities tL_textWithEntities2 = null;
            this.savedStarGift = null;
            this.messageObject = messageObject;
            this.giftsList = iGiftsList;
            this.actionView.set(messageObject);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            boolean z15 = messageObject.getDialogId() == clientUserId;
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (((z13 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
                if (!this.rolling && (roller = this.roller) != null && roller.isRolling() && this.roller.rollingGift != null) {
                    this.roller.detach();
                    this.roller = null;
                    this.topView.imageLayout.setVisibility(0);
                    this.topView.imagesRollView.setVisibility(4);
                }
                isOutOwner = messageObject.isOutOwner();
                if (z15) {
                    isOutOwner = false;
                }
                TLRPC.Message message = messageObject.messageOwner;
                int i3 = message.date;
                TLRPC.MessageAction messageAction2 = message.action;
                if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                    boolean z16 = tL_messageActionStarGift.converted;
                    boolean z17 = tL_messageActionStarGift.saved;
                    boolean z18 = tL_messageActionStarGift.refunded;
                    boolean z19 = tL_messageActionStarGift.name_hidden;
                    TL_stars.StarGift starGift4 = tL_messageActionStarGift.gift;
                    boolean z20 = tL_messageActionStarGift.can_upgrade;
                    long j6 = tL_messageActionStarGift.convert_stars;
                    long j7 = tL_messageActionStarGift.upgrade_stars;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageActionStarGift.message;
                    TLRPC.Peer peer4 = tL_messageActionStarGift.from_id;
                    TLRPC.Peer peer5 = tL_messageActionStarGift.peer;
                    z3 = tL_messageActionStarGift.prepaid_upgrade;
                    j3 = j7;
                    j = clientUserId;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    i = i3;
                    z2 = z19;
                    j2 = j6;
                    peer = peer4;
                    peer2 = peer5;
                    z6 = z20;
                    tL_textWithEntities = tL_textWithEntities3;
                    z4 = z18;
                    starGift = starGift4;
                    z5 = z17;
                    z = z16;
                } else {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                    boolean z21 = tL_messageActionStarGiftUnique.saved;
                    boolean z22 = tL_messageActionStarGiftUnique.refunded;
                    TL_stars.StarGift starGift5 = tL_messageActionStarGiftUnique.gift;
                    peer = tL_messageActionStarGiftUnique.from_id;
                    TLRPC.Peer peer6 = tL_messageActionStarGiftUnique.peer;
                    starGift = starGift5;
                    j = clientUserId;
                    i = i3;
                    tL_textWithEntities = null;
                    j2 = 0;
                    z = false;
                    z2 = false;
                    j3 = 0;
                    str = null;
                    z3 = false;
                    z4 = z22;
                    z5 = z21;
                    peer2 = peer6;
                    z6 = false;
                }
                String shortName = DialogObject.getShortName(this.dialogId);
                boolean z23 = z;
                boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId)));
                boolean z24 = peer2 != null && DialogObject.getPeerDialogId(peer2) < 0;
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities;
                TLRPC.Peer peer7 = peer2;
                this.topView.setGift(starGift, false, false, isWorn(this.currentAccount, getUniqueGift()), getLink() != null, false);
                if (z15) {
                    TopView topView = this.topView;
                    String string4 = LocaleController.getString(R.string.Gift2TitleSaved);
                    this.title = string4;
                    if (z4) {
                        charSequence = "";
                        str4 = string4;
                        spannableStringBuilder = null;
                    } else if (z6) {
                        charSequence = "";
                        str4 = string4;
                        spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                    } else {
                        str4 = string4;
                        if (j2 > 0) {
                            charSequence = "";
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z23 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j2));
                        } else {
                            charSequence = "";
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                        }
                        spannableStringBuilder = replaceTags;
                    }
                    topView.setText(0, str4, spannableStringBuilder, null, releasedByText(starGift));
                } else {
                    charSequence = "";
                    if (z24 && !this.myProfile) {
                        this.topView.setText(0, LocaleController.getString(R.string.Gift2TitleProfile), null, null, releasedByText(starGift));
                    } else {
                        if ((isOutOwner || z6) && j3 > 0) {
                            TopView topView2 = this.topView;
                            String string5 = LocaleController.getString(isOutOwner ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                            this.title = string5;
                            if (z4) {
                                charSequence2 = " ";
                                peer3 = peer;
                                z7 = z15;
                                formatString = null;
                            } else if (isOutOwner) {
                                z7 = z15;
                                charSequence2 = " ";
                                peer3 = peer;
                                formatString = LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                            } else {
                                charSequence2 = " ";
                                peer3 = peer;
                                formatString = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                                z7 = z15;
                            }
                            topView2.setText(0, string5, formatString, null, releasedByText(starGift));
                            z8 = z4;
                        } else {
                            charSequence2 = " ";
                            peer3 = peer;
                            z7 = z15;
                            TopView topView3 = this.topView;
                            String string6 = LocaleController.getString(isOutOwner ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                            this.title = string6;
                            if (z4) {
                                z8 = z4;
                                concat = null;
                            } else {
                                if (isBot || !canSomeoneConvert()) {
                                    z8 = z4;
                                    if (isOutOwner) {
                                        string = LocaleController.formatString((!z6 || j3 <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                    } else {
                                        if (z5) {
                                            i2 = z24 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove;
                                        } else {
                                            i2 = z24 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep;
                                        }
                                        string = LocaleController.getString(i2);
                                    }
                                } else if (isOutOwner) {
                                    if (z6 && j3 > 0) {
                                        string = LocaleController.formatString(R.string.Gift2Info2OutUpgrade, shortName);
                                    } else if (!z5 || z23) {
                                        z8 = z4;
                                        string = LocaleController.formatPluralStringComma(z23 ? "Gift2InfoOutConverted" : "Gift2InfoOut", (int) j2, shortName);
                                    } else {
                                        string = LocaleController.formatString(R.string.Gift2InfoOutPinned, shortName);
                                    }
                                    z8 = z4;
                                } else {
                                    z8 = z4;
                                    if (z23) {
                                        str2 = z24 ? "Gift2InfoChannelConverted" : "Gift2InfoConverted";
                                    } else {
                                        str2 = z24 ? "Gift2Info3Channel" : "Gift2Info3";
                                    }
                                    string = LocaleController.formatPluralStringComma(str2, (int) j2);
                                }
                                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(string);
                                if (isBot || !canConvert()) {
                                    c = 1;
                                    charSequence3 = charSequence;
                                } else {
                                    c = 1;
                                    charSequence3 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda23
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarGiftSheet.this.lambda$set$69();
                                        }
                                    }), true);
                                }
                                CharSequence[] charSequenceArr = new CharSequence[3];
                                charSequenceArr[0] = replaceTags2;
                                charSequenceArr[c] = charSequence2;
                                charSequenceArr[2] = charSequence3;
                                concat = TextUtils.concat(charSequenceArr);
                            }
                            topView3.setText(0, string6, concat, null, releasedByText(starGift));
                        }
                        this.tableView.clear();
                        if (peer3 == null) {
                            j4 = DialogObject.getPeerDialogId(peer3);
                        } else {
                            j4 = isOutOwner ? j : this.dialogId;
                        }
                        if (peer7 == null) {
                            j5 = DialogObject.getPeerDialogId(peer7);
                        } else {
                            j5 = isOutOwner ? this.dialogId : j;
                        }
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j4));
                        if (j4 == j || z3 || z24) {
                            z9 = z5;
                            z10 = z6;
                            this.tableView.addRowUser(LocaleController.getString(R.string.Gift2From), this.currentAccount, j4, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda26
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarGiftSheet.this.lambda$set$70(j4);
                                }
                            }, (j4 != j || j4 == UserObject.ANONYMOUS || UserObject.isDeleted(user) || isBot || z24) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), !z24 ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda27
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarGiftSheet.this.lambda$set$71(j4);
                                }
                            });
                        } else {
                            z9 = z5;
                            z10 = z6;
                        }
                        if (j5 == j || z24) {
                            this.tableView.addRowUser(LocaleController.getString(R.string.Gift2To), this.currentAccount, j5, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda28
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarGiftSheet.this.lambda$set$72(j5);
                                }
                            }, null, !z24 ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda29
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarGiftSheet.this.lambda$set$73(j5);
                                }
                            });
                        }
                        this.tableView.addRowDateTime(LocaleController.getString(R.string.StarsTransactionDate), i);
                        if (starGift.stars > 0) {
                            this.tableView.addRow(LocaleController.getString(R.string.Gift2Value), StarsIntroActivity.replaceStarsWithPlain(TextUtils.concat("⭐️ " + LocaleController.formatNumber(starGift.stars + j3, ','), charSequence2, (!canConvert() || z8) ? charSequence : ButtonSpan.make(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j2), new StarGiftSheet$$ExternalSyntheticLambda14(this), this.resourcesProvider)), 0.8f));
                        }
                        if (starGift.limited && !z8) {
                            StarsIntroActivity.addAvailabilityRow(this.tableView, this.currentAccount, starGift, this.resourcesProvider);
                        }
                        tL_textWithEntities2 = tL_textWithEntities4;
                        if (tL_textWithEntities4 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z8) {
                            this.tableView.addFullRow(tL_textWithEntities2.text, tL_textWithEntities2.entities);
                        }
                        if (isOutOwner && z10 && !z8) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                            if (this.upgradeIconSpan == null) {
                                this.upgradeIconSpan = new ColoredImageSpan(new UpgradeIcon(this.button, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                            }
                            spannableStringBuilder2.setSpan(this.upgradeIconSpan, 0, 1, 33);
                            if (j3 > 0) {
                                string2 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                            } else {
                                string2 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                            }
                            spannableStringBuilder2.append((CharSequence) string2);
                            this.button.setFilled(true);
                            this.button.setText(spannableStringBuilder2, !this.firstSet);
                            this.button.setSubText(null, !this.firstSet);
                            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda30
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarGiftSheet.this.lambda$set$74(view);
                                }
                            });
                        } else if (!this.upgradedOnce && this.viewPager != null && this.giftsList != null && getListPosition() >= 0 && this.giftsList.findGiftToUpgrade(getListPosition()) >= 0) {
                            this.button.setFilled(false);
                            final int findGiftToUpgrade = this.giftsList.findGiftToUpgrade(getListPosition());
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                            Object obj = this.giftsList.get(findGiftToUpgrade);
                            if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                                z11 = true;
                            } else {
                                spannableStringBuilder3.append((CharSequence) " e");
                                z11 = true;
                                spannableStringBuilder3.setSpan(new AnimatedEmojiSpan(document, this.button.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                            }
                            this.button.setText(spannableStringBuilder3, this.firstSet ^ z11);
                            this.button.setSubText(null, this.firstSet ^ z11);
                            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda31
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarGiftSheet.this.lambda$set$75(findGiftToUpgrade, view);
                                }
                            });
                        } else if (!(starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(str)) {
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("^  ");
                            if (this.upgradeIconSpan == null) {
                                this.upgradeIconSpan = new ColoredImageSpan(new UpgradeIcon(this.button, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                            }
                            spannableStringBuilder4.setSpan(this.upgradeIconSpan, 0, 1, 33);
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                            this.button.setFilled(true);
                            this.button.setText(spannableStringBuilder4, !this.firstSet);
                            this.button.setSubText(null, !this.firstSet);
                            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda32
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarGiftSheet.this.lambda$set$76(view);
                                }
                            });
                        } else {
                            this.button.setFilled(true);
                            this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                            str3 = null;
                            this.button.setSubText(null, !this.firstSet);
                            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda33
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarGiftSheet.this.lambda$set$77(view);
                                }
                            });
                            starGift3 = starGift;
                            z12 = z9;
                            z14 = z23;
                        }
                        str3 = null;
                        starGift3 = starGift;
                        z12 = z9;
                        z14 = z23;
                    }
                }
                charSequence2 = " ";
                z8 = z4;
                peer3 = peer;
                z7 = z15;
                this.tableView.clear();
                if (peer3 == null) {
                }
                if (peer7 == null) {
                }
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j4));
                if (j4 == j) {
                }
                z9 = z5;
                z10 = z6;
                this.tableView.addRowUser(LocaleController.getString(R.string.Gift2From), this.currentAccount, j4, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda26
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$70(j4);
                    }
                }, (j4 != j || j4 == UserObject.ANONYMOUS || UserObject.isDeleted(user2) || isBot || z24) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), !z24 ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda27
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$71(j4);
                    }
                });
                if (j5 == j) {
                }
                this.tableView.addRowUser(LocaleController.getString(R.string.Gift2To), this.currentAccount, j5, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda28
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$72(j5);
                    }
                }, null, !z24 ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$73(j5);
                    }
                });
                this.tableView.addRowDateTime(LocaleController.getString(R.string.StarsTransactionDate), i);
                if (starGift.stars > 0) {
                }
                if (starGift.limited) {
                    StarsIntroActivity.addAvailabilityRow(this.tableView, this.currentAccount, starGift, this.resourcesProvider);
                }
                tL_textWithEntities2 = tL_textWithEntities4;
                if (tL_textWithEntities4 != null) {
                    this.tableView.addFullRow(tL_textWithEntities2.text, tL_textWithEntities2.entities);
                }
                if (isOutOwner) {
                }
                if (!this.upgradedOnce) {
                }
                if (!(starGift instanceof TL_stars.TL_starGift)) {
                }
                this.button.setFilled(true);
                this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                str3 = null;
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda33
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$77(view);
                    }
                });
                starGift3 = starGift;
                z12 = z9;
                z14 = z23;
            } else {
                if (!z13) {
                    return this;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.StarGift starGift6 = tL_messageActionStarGiftUnique2.gift;
                if (!(starGift6 instanceof TL_stars.TL_starGiftUnique)) {
                    return this;
                }
                boolean z25 = tL_messageActionStarGiftUnique2.refunded;
                set((TL_stars.TL_starGiftUnique) starGift6, z25);
                z12 = tL_messageActionStarGiftUnique2.saved;
                starGift3 = tL_messageActionStarGiftUnique2.gift;
                isOutOwner = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
                if (messageObject.getDialogId() == clientUserId) {
                    isOutOwner = false;
                }
                repollSavedStarGift();
                if (!this.rolling && (roller2 = this.roller) != null && roller2.isRolling() && this.roller.rollingGift != null && (starGift3 == null || this.roller.rollingGift.id != starGift3.id)) {
                    this.roller.detach();
                    this.roller = null;
                    this.topView.imageLayout.setAlpha(1.0f);
                    this.topView.imagesRollView.setAlpha(0.0f);
                }
                z8 = z25;
                str3 = null;
                z7 = z15;
                z2 = false;
            }
            String str5 = starGift3 == null ? str3 : starGift3.owner_address;
            if (starGift3 != null) {
                str3 = starGift3.gift_address;
            }
            boolean z26 = (starGift3 == null || starGift3.host_id == null) ? false : true;
            if (z8) {
                this.beforeTableTextView.setVisibility(0);
                this.beforeTableTextView.setText(LocaleController.getString(R.string.Gift2Refunded));
                this.beforeTableTextView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
            } else if (z26 && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str3)) {
                this.beforeTableTextView.setVisibility(0);
                this.beforeTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda24
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$78(str3);
                    }
                }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                this.beforeTableTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
            } else if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str3) && z2 && !z7) {
                this.beforeTableTextView.setVisibility(0);
                LinkSpanDrawable.LinksTextView linksTextView = this.beforeTableTextView;
                if (isOutOwner) {
                    string3 = LocaleController.formatString((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
                } else {
                    string3 = LocaleController.getString((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
                }
                linksTextView.setText(string3);
                this.beforeTableTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
            } else {
                this.beforeTableTextView.setVisibility(8);
            }
            if (!z26 && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str3)) {
                this.afterTableTextView.setVisibility(0);
                this.afterTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda25
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$79(str3);
                    }
                }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else if (!z14 && !z8 && starGift3 != null && isMine(this.currentAccount, getDialogId())) {
                this.afterTableTextView.setVisibility(0);
                if (getDialogId() >= 0) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (!z12) {
                        spannableStringBuilder5.append((CharSequence) ". ");
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.menu_hide_gift);
                        coloredImageSpan.setScale(0.65f, 0.65f);
                        spannableStringBuilder5.setSpan(coloredImageSpan, 0, 1, 33);
                    }
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(z12 ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new StarGiftSheet$$ExternalSyntheticLambda11(this)));
                    this.afterTableTextView.setText(AndroidUtilities.replaceArrows(spannableStringBuilder5, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                } else {
                    this.afterTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(z12 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new StarGiftSheet$$ExternalSyntheticLambda11(this)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                }
            } else {
                this.afterTableTextView.setVisibility(8);
            }
            if (this.firstSet) {
                switchPage(0, false);
                this.layoutManager.scrollToPosition(0);
                this.firstSet = false;
            }
            this.actionBar.setTitle(getTitle());
            updateViewPager();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$69() {
        new ExplainStarsSheet(getContext()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$71(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda83(this)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$73(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda83(this)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$74(View view) {
        openUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$75(int i, View view) {
        this.overrideNextIndex = i;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() + (i > getListPosition() ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$76(View view) {
        openUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$77(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$78(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$79(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    private void repollMessage() {
        MessageObject messageObject;
        if (this.messageObjectRepolling || this.messageObjectRepolled || (messageObject = this.messageObject) == null) {
            return;
        }
        this.messageObjectRepolling = true;
        final int id = messageObject.getId();
        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
        tL_messages_getMessages.id.add(Integer.valueOf(id));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda93
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$repollMessage$81(id, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repollMessage$81(int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        final MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                TLRPC.Message message = messages_messages.messages.get(i2);
                if (message != null && message.id == i) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(this.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda144
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$repollMessage$80(tLObject, messageObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repollMessage$80(TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
        this.messageObjectRepolled = true;
        this.messageObjectRepolling = false;
        Boolean bool = this.unsavedFromSavedStarGift;
        if (bool != null && messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        set(messageObject);
    }

    private void repollSavedStarGift() {
        TL_stars.InputSavedStarGift inputStarGift;
        if (this.userStarGiftRepolling || this.userStarGiftRepolled || this.messageObject == null || (inputStarGift = getInputStarGift()) == null) {
            return;
        }
        this.userStarGiftRepolling = true;
        StarsController.getInstance(this.currentAccount).getUserStarGift(inputStarGift, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda62
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$repollSavedStarGift$82((TL_stars.SavedStarGift) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repollSavedStarGift$82(TL_stars.SavedStarGift savedStarGift) {
        TLRPC.Message message;
        this.userStarGiftRepolling = false;
        this.userStarGiftRepolled = true;
        if (savedStarGift != null) {
            this.unsavedFromSavedStarGift = Boolean.valueOf(savedStarGift.unsaved);
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                boolean z = tL_messageActionStarGiftUnique.saved;
                boolean z2 = !savedStarGift.unsaved;
                if (z == z2) {
                    return;
                } else {
                    tL_messageActionStarGiftUnique.saved = z2;
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                boolean z3 = tL_messageActionStarGift.saved;
                boolean z4 = !savedStarGift.unsaved;
                if (z3 == z4) {
                    return;
                } else {
                    tL_messageActionStarGift.saved = z4;
                }
            }
            set(messageObject);
        }
    }

    public void openAsLearnMore(long j, final String str) {
        this.isLearnMore = true;
        StarsController.getInstance(this.currentAccount).getStarGiftPreview(j, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda135
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$openAsLearnMore$84(str, (TL_stars.starGiftUpgradePreview) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAsLearnMore$84(String str, TL_stars.starGiftUpgradePreview stargiftupgradepreview) {
        if (stargiftupgradepreview == null) {
            return;
        }
        this.topView.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
        switchPage(1, false);
        this.topView.setText(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str), null, null);
        this.upgradeFeatureCells[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
        this.upgradeFeatureCells[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
        this.upgradeFeatureCells[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
        this.checkboxLayout.setVisibility(8);
        this.checkboxSeparator.setVisibility(8);
        this.button.setFilled(true);
        this.button.setText(LocaleController.getString(R.string.OK), false);
        this.button.setSubText(null, false);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda148
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarGiftSheet.this.lambda$openAsLearnMore$83(view);
            }
        });
        show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAsLearnMore$83(View view) {
        lambda$new$0();
    }

    private long getDialogId() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return 0L;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                if (peer2 != null) {
                    return DialogObject.getPeerDialogId(peer2);
                }
                return messageObject.isOutOwner() ? this.messageObject.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                    return DialogObject.getPeerDialogId(peer);
                }
                TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                if (peer3 != null) {
                    return DialogObject.getPeerDialogId(peer3);
                }
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    return DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
                }
                return this.dialogId;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
            if (tL_starGiftUnique != null) {
                return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
            }
        }
        return 0L;
    }

    private String getLink() {
        TL_stars.StarGift gift = getGift();
        if (!(gift instanceof TL_stars.TL_starGiftUnique) || gift.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + gift.slug;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInProfile() {
        long dialogId = getDialogId();
        if (dialogId == 0) {
            return;
        }
        lambda$set$72(dialogId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openProfile, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$set$72(long j) {
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
        lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || UserObject.isService(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
            if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("open_gifts", true);
        safeLastFragment.presentFragment(new ProfileActivity(bundle));
    }

    private boolean canSomeoneConvert() {
        TLRPC.Peer peer;
        if (getInputStarGift() == null) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return false;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z = tL_messageActionStarGift.peer != null;
            messageObject.isOutOwner();
            this.messageObject.getDialogId();
            UserConfig.getInstance(this.currentAccount).getClientUserId();
            return (!z || ((peer = tL_messageActionStarGift.peer) != null && isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageObject.messageOwner.date) > 0;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift == null) {
            return false;
        }
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        if (!isMineWithActions(this.currentAccount, this.dialogId)) {
            return false;
        }
        int i = this.savedStarGift.flags;
        return ((((this.dialogId > 0L ? 1 : (this.dialogId == 0L ? 0 : -1)) < 0 ? 2048 : 8) & i) == 0 || (i & 16) == 0 || (i & 2) == 0 || currentTime <= 0) ? false : true;
    }

    private boolean canConvert() {
        TLRPC.Peer peer;
        if (getInputStarGift() == null) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return false;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.messageObject.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.messageObject.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageObject.messageOwner.date) > 0;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift == null) {
            return false;
        }
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        if (!isMineWithActions(this.currentAccount, this.dialogId)) {
            return false;
        }
        int i = this.savedStarGift.flags;
        return ((((this.dialogId > 0L ? 1 : (this.dialogId == 0L ? 0 : -1)) < 0 ? 2048 : 8) & i) == 0 || (i & 16) == 0 || (i & 2) == 0 || currentTime <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void convert() {
        int i;
        long peerDialogId;
        long j;
        long j2;
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null) {
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            i = messageObject.messageOwner.date;
            boolean isOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = this.messageObject;
            TLRPC.Message message = messageObject2.messageOwner;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            if (peer != null) {
                j2 = DialogObject.getPeerDialogId(peer);
            } else {
                j2 = isOutOwner ? messageObject2.getDialogId() : clientUserId;
            }
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            if (peer2 != null) {
                peerDialogId = DialogObject.getPeerDialogId(peer2);
            } else {
                peerDialogId = isOutOwner ? clientUserId : this.messageObject.getDialogId();
            }
            j = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            i = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j = this.savedStarGift.convert_stars;
            j2 = this.dialogId;
        }
        final long j3 = j;
        final long j4 = j2;
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ConvertTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", Math.max(1, (MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - i)) / 86400), (UserObject.isService(peerDialogId) || peerDialogId == UserObject.ANONYMOUS) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j3)))).setPositiveButton(LocaleController.getString(R.string.Gift2ConvertButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda56
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i2) {
                StarGiftSheet.this.lambda$convert$89(inputStarGift, j4, clientUserId, j3, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$89(TL_stars.InputSavedStarGift inputSavedStarGift, final long j, final long j2, final long j3, AlertDialog alertDialog, int i) {
        final AlertDialog alertDialog2 = new AlertDialog(ApplicationLoader.applicationContext, 3);
        alertDialog2.showDelayed(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(convertstargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda111
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$convert$88(alertDialog2, j, j2, j3, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$88(final AlertDialog alertDialog, final long j, final long j2, final long j3, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda127
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$convert$87(alertDialog, tLObject, j, j2, j3, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$87(AlertDialog alertDialog, TLObject tLObject, long j, long j2, final long j3, TLRPC.TL_error tL_error) {
        alertDialog.dismissUnless(400L);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                getBulletinFactory().createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text)).show(false);
                return;
            } else {
                getBulletinFactory().createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show(false);
                return;
            }
        }
        lambda$new$0();
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j);
        if (j >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j2);
            if (userFull != null) {
                int max = Math.max(0, userFull.stargifts_count - 1);
                userFull.stargifts_count = max;
                if (max <= 0) {
                    userFull.flags2 &= -257;
                }
            }
            StarsController.getInstance(this.currentAccount).invalidateBalance();
            StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
            if (!(safeLastFragment instanceof StarsIntroActivity)) {
                final StarsIntroActivity starsIntroActivity = new StarsIntroActivity();
                starsIntroActivity.whenFullyVisible(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda163
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.lambda$convert$85(StarsIntroActivity.this, j3);
                    }
                });
                safeLastFragment.presentFragment(starsIntroActivity);
                return;
            }
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j3)).show(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j);
        bundle.putBoolean("start_from_monetization", true);
        final StatisticActivity statisticActivity = new StatisticActivity(bundle);
        BotStarsController.getInstance(this.currentAccount).invalidateStarsBalance(j);
        BotStarsController.getInstance(this.currentAccount).invalidateTransactions(j, true);
        statisticActivity.whenFullyVisible(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda164
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.lambda$convert$86(StatisticActivity.this, j3);
            }
        });
        safeLastFragment.presentFragment(statisticActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$85(StarsIntroActivity starsIntroActivity, long j) {
        BulletinFactory.of(starsIntroActivity).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j)).show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$86(StatisticActivity statisticActivity, long j) {
        BulletinFactory.of(statisticActivity).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j)).show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleShow() {
        final boolean z;
        final TLRPC.Document document;
        StarsController.GiftsCollections profileGiftCollectionsList;
        TLRPC.Message message;
        if (this.button.isLoading()) {
            return;
        }
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            z = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        }
        this.button.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z;
        savestargift.stargift = inputStarGift;
        if (this.savedStarGift != null && (profileGiftCollectionsList = StarsController.getInstance(this.currentAccount).getProfileGiftCollectionsList(this.dialogId, false)) != null) {
            profileGiftCollectionsList.updateGiftsUnsaved(this.savedStarGift, savestargift.unsave);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda63
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$toggleShow$92(document, z, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleShow$92(final TLRPC.Document document, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda104
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$toggleShow$91(tLObject, document, z, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleShow$91(TLObject tLObject, TLRPC.Document document, boolean z, TLRPC.TL_error tL_error) {
        final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                getBulletinFactory().createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text)).show(false);
                return;
            }
            return;
        }
        lambda$new$0();
        final long dialogId = getDialogId();
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(dialogId);
        if (dialogId >= 0) {
            BulletinFactory.of(safeLastFragment).createEmojiBulletin(document, LocaleController.getString(z ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), safeLastFragment instanceof ProfileActivity ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda136
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.lambda$toggleShow$90(dialogId, safeLastFragment);
                }
            })).show(true);
        } else {
            BulletinFactory.of(safeLastFragment).createEmojiBulletin(document, LocaleController.getString(z ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toggleShow$90(long j, BaseFragment baseFragment) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("my_profile", true);
        bundle.putBoolean("open_gifts", true);
        baseFragment.presentFragment(new ProfileActivity(bundle));
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
    /* renamed from: dismiss */
    public void lambda$new$0() {
        Roller roller = this.roller;
        if (roller != null) {
            roller.detach();
        }
        super.lambda$new$0();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        if (this.slug != null && this.slugStarGift == null) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.slug;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarGiftSheet.this.lambda$show$95(alertDialog, tLObject, tL_error);
                }
            });
        } else if (this.savedStarGift == null && (messageObject = this.messageObject) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                final TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        final AlertDialog alertDialog2 = new AlertDialog(getContext(), 3);
                        alertDialog2.showDelayed(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                StarGiftSheet.this.lambda$show$98(tL_messageActionStarGift, alertDialog2, tLObject, tL_error);
                            }
                        });
                        return;
                    }
                    if (getInputStarGift() != null) {
                        final AlertDialog alertDialog3 = new AlertDialog(getContext(), 3);
                        alertDialog3.showDelayed(500L);
                        StarsController.getInstance(this.currentAccount).getUserStarGift(getInputStarGift(), new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda8
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj) {
                                StarGiftSheet.this.lambda$show$99(alertDialog3, (TL_stars.SavedStarGift) obj);
                            }
                        });
                        return;
                    }
                }
            }
        }
        super.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$95(final AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            final TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda60
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$show$93(tL_payments_uniqueStarGift);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda61
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.lambda$show$94(AlertDialog.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$93(TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        this.slugStarGift = tL_starGiftUnique;
        set(tL_starGiftUnique, false);
        super.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$94(AlertDialog alertDialog) {
        alertDialog.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UniqueGiftNotFound)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$98(TLRPC.TL_messageActionStarGift tL_messageActionStarGift, final AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        final MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            for (int i = 0; i < messages_messages.messages.size(); i++) {
                TLRPC.Message message = messages_messages.messages.get(i);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(this.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda64
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$show$96(alertDialog, messageObject);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda65
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.lambda$show$97(AlertDialog.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$96(AlertDialog alertDialog, MessageObject messageObject) {
        alertDialog.dismiss();
        this.messageObjectRepolled = true;
        set(messageObject);
        super.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$97(AlertDialog alertDialog) {
        alertDialog.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.MessageNotFound)).ignoreDetach().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$99(AlertDialog alertDialog, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            alertDialog.dismiss();
            this.userStarGiftRepolled = true;
            set(savedStarGift, (StarsController.IGiftsList) null);
            super.show();
            return;
        }
        alertDialog.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.MessageNotFound)).ignoreDetach().show();
        }
    }

    private void openUpgrade() {
        TL_stars.InputSavedStarGift inputStarGift;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        long j;
        long j2;
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
        if (this.switchingPagesAnimator == null && (inputStarGift = getInputStarGift()) != null) {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j = tL_messageActionStarGift.gift.id;
                j2 = tL_messageActionStarGift.upgrade_stars;
                z4 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z2 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (tL_messageActionStarGift.prepaid_upgrade) {
                    z3 = DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.messageObject.getFromChatId();
                } else {
                    z3 = tL_messageActionStarGift.upgrade_separate;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j3 = starGift.id;
                long j4 = savedStarGift.upgrade_stars;
                boolean z5 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z2 = this.dialogId < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                str = savedStarGift2.prepaid_upgrade_hash;
                z3 = savedStarGift2.upgrade_separate;
                z4 = z5;
                j = j3;
                j2 = j4;
            }
            if (z4) {
                this.checkboxTextView.setText(LocaleController.getString(z2 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z) {
                this.checkboxTextView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                this.checkboxTextView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            this.checkbox.setChecked((z4 || j2 <= 0 || z3) ? false : true, false);
            ArrayList arrayList = this.sample_attributes;
            if (arrayList == null || (j2 <= 0 && this.upgrade_form == null)) {
                if (arrayList == null) {
                    StarsController.getInstance(this.currentAccount).getStarGiftPreview(j, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda57
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            StarGiftSheet.this.lambda$openUpgrade$100((TL_stars.starGiftUpgradePreview) obj);
                        }
                    });
                }
                if (j2 > 0 || this.upgrade_form != null) {
                    return;
                }
                this.requesting_upgrade_form = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = this.checkbox.isChecked();
                    tL_inputInvoiceStarGiftUpgrade.stargift = inputStarGift;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
                if (makeThemeParams != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = makeThemeParams.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda58
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StarGiftSheet.this.lambda$openUpgrade$102(tLObject, tL_error);
                    }
                });
                return;
            }
            openUpgradeAfter();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openUpgrade$100(TL_stars.starGiftUpgradePreview stargiftupgradepreview) {
        if (stargiftupgradepreview == null) {
            return;
        }
        this.sample_attributes = stargiftupgradepreview.sample_attributes;
        this.prices = stargiftupgradepreview.prices;
        this.next_prices = stargiftupgradepreview.next_prices;
        openUpgradeAfter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openUpgrade$102(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda116
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openUpgrade$101(tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openUpgrade$101(TLObject tLObject, TLRPC.TL_error tL_error) {
        this.requesting_upgrade_form = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
            this.upgrade_form = paymentForm;
            openUpgradeAfter();
            return;
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0034, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void openUpgradeAfter() {
        long j;
        boolean z;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j = tL_messageActionStarGift.upgrade_stars;
            if (j <= 0) {
            }
            z = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            j = savedStarGift.upgrade_stars;
            if (j <= 0) {
            }
            z = false;
        }
        if (this.sample_attributes != null) {
            if (j > 0 || this.upgrade_form != null) {
                final long j2 = 0;
                if (this.upgrade_form != null) {
                    for (int i = 0; i < this.upgrade_form.invoice.prices.size(); i++) {
                        j2 += this.upgrade_form.invoice.prices.get(i).amount;
                    }
                }
                if (this.roller == null) {
                    this.roller = new Roller(this.topView);
                }
                this.roller.preload(this.sample_attributes);
                this.topView.setPreviewingAttributes(this.sample_attributes);
                if (z) {
                    this.topView.setText(1, LocaleController.getString(R.string.Gift2PrepayUpgradeTitle), LocaleController.formatString(R.string.Gift2PrepayUpgradeText, DialogObject.getShortName(this.currentAccount, this.dialogId)), null, null);
                } else {
                    this.topView.setText(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null, null);
                }
                this.button.setFilled(true);
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = null;
                this.button.setSubText(null, true);
                if (j2 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    if (this.next_prices != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= this.next_prices.size()) {
                                break;
                            }
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) this.next_prices.get(i2);
                            if (starGiftUpgradePrice2.date >= currentTime) {
                                starGiftUpgradePrice = starGiftUpgradePrice2;
                                break;
                            }
                            i2++;
                        }
                    }
                    ArrayList arrayList = this.prices;
                    if (arrayList != null && starGiftUpgradePrice != null && !arrayList.isEmpty()) {
                        this.underButtonContainer.setVisibility(0);
                        this.underButtonLinkTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("**" + LocaleController.getString(R.string.Gift2UpgradeCostsInfo) + "**", new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda94
                            @Override // java.lang.Runnable
                            public final void run() {
                                StarGiftSheet.this.openUpgradePrices();
                            }
                        }), false, AndroidUtilities.dp(0.6666667f), AndroidUtilities.dp(0.66f)));
                    } else {
                        this.underButtonContainer.setVisibility(8);
                    }
                    updateUnderButtonContainer();
                    if (z) {
                        this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j2)), 1.13f, this.starCached), true);
                    } else {
                        this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j2)), 1.13f, this.starCached), true);
                    }
                } else {
                    this.button.setText(LocaleController.getString(R.string.Confirm), true);
                }
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda95
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$openUpgradeAfter$103(view);
                    }
                });
                if (z) {
                    this.checkboxLayout.setVisibility(8);
                    this.checkboxSeparator.setVisibility(8);
                } else {
                    this.checkboxLayout.setVisibility(0);
                    this.checkboxSeparator.setVisibility(0);
                }
                this.upgradeFeatureCells[0].set(R.drawable.menu_feature_unique, LocaleController.getString(R.string.Gift2UpgradeFeature1Title), z ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature1Text, DialogObject.getShortName(this.currentAccount, this.dialogId)) : LocaleController.getString(R.string.Gift2UpgradeFeature1Text));
                this.upgradeFeatureCells[1].set(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2UpgradeFeature2Title), z ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature2Text, DialogObject.getShortName(this.currentAccount, this.dialogId)) : LocaleController.getString(R.string.Gift2UpgradeFeature2Text));
                this.upgradeFeatureCells[2].set(R.drawable.menu_feature_tradable, LocaleController.getString(R.string.Gift2UpgradeFeature3Title), z ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature3Text, DialogObject.getShortName(this.currentAccount, this.dialogId)) : LocaleController.getString(R.string.Gift2UpgradeFeature3Text));
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda96
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$openUpgradeAfter$104(j2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openUpgradeAfter$103(View view) {
        doUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openUpgradeAfter$104(long j) {
        switchPage(1, true);
        if (j > 0) {
            AndroidUtilities.cancelRunOnUIThread(this.tickUpgradePriceRunnable);
            AndroidUtilities.runOnUIThread(this.tickUpgradePriceRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openUpgradePrices() {
        if (this.upgrade_form == null) {
            return;
        }
        long j = 0;
        for (int i = 0; i < this.upgrade_form.invoice.prices.size(); i++) {
            j += this.upgrade_form.invoice.prices.get(i).amount;
        }
        UpgradePricesSheet upgradePricesSheet = new UpgradePricesSheet(getContext(), j, this.prices, this.resourcesProvider);
        this.upgradeSheet = upgradePricesSheet;
        upgradePricesSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0044, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void tickUpgradePrice() {
        String str;
        boolean z;
        int i;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        String formatPluralString;
        if (this.currentPage.to == 1 && !isDismissed()) {
            TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
            MessageObject messageObject = this.messageObject;
            long j = 0;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                long j2 = tL_messageActionStarGift.upgrade_stars;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (j2 <= 0) {
                }
                z = false;
            } else {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null) {
                    return;
                }
                long j3 = savedStarGift.upgrade_stars;
                str = savedStarGift.prepaid_upgrade_hash;
                if (j3 <= 0) {
                }
                z = false;
            }
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.next_prices != null) {
                i = 0;
                while (i < this.next_prices.size()) {
                    starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.next_prices.get(i);
                    if (starGiftUpgradePrice.date >= currentTime) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            starGiftUpgradePrice = null;
            if (this.upgrade_form != null) {
                for (int i2 = 0; i2 < this.upgrade_form.invoice.prices.size(); i2++) {
                    j += this.upgrade_form.invoice.prices.get(i2).amount;
                }
            }
            if (i > 0 && !this.requesting_upgrade_form) {
                this.requesting_upgrade_form = true;
                if (this.next_prices != null) {
                    for (int i3 = 0; i3 < i; i3++) {
                        this.next_prices.remove(0);
                    }
                }
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = this.checkbox.isChecked();
                    tL_inputInvoiceStarGiftUpgrade.stargift = inputStarGift;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
                if (makeThemeParams != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = makeThemeParams.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda59
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StarGiftSheet.this.lambda$tickUpgradePrice$106(tLObject, tL_error);
                    }
                });
            }
            if (z) {
                this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j)), 1.13f, this.starCached), true);
            } else {
                this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j)), 1.13f, this.starCached), true);
            }
            UpgradePricesSheet upgradePricesSheet = this.upgradeSheet;
            if (upgradePricesSheet != null) {
                upgradePricesSheet.setCurrentPrice(j);
            }
            if (starGiftUpgradePrice != null) {
                int i4 = starGiftUpgradePrice.date - currentTime;
                if (i4 < 86400) {
                    formatPluralString = AndroidUtilities.formatDuration(i4, false, true);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Days", Math.round(i4 / 86400.0f), new Object[0]);
                }
                this.button.setSubTextHacks(false, true, true, false);
                this.button.setSubText(LocaleController.formatString(R.string.Gift2UpgradeButtonDecreasesIn, formatPluralString), true);
                AndroidUtilities.runOnUIThread(this.tickUpgradePriceRunnable, 1000L);
                return;
            }
            this.button.setSubText(null, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tickUpgradePrice$106(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda114
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$tickUpgradePrice$105(tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tickUpgradePrice$105(TLObject tLObject, TLRPC.TL_error tL_error) {
        this.requesting_upgrade_form = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
            this.upgrade_form = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(this.tickUpgradePriceRunnable);
            AndroidUtilities.runOnUIThread(this.tickUpgradePriceRunnable);
            return;
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    private int applyNewGiftFromUpdates(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        if (updates == null) {
            StarsController.getInstance(this.currentAccount).invalidateProfileGifts(getDialogId());
            lambda$new$0();
            return 0;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TLRPC.TL_updateNewMessage) {
            message = ((TLRPC.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i = 0; i < updates.updates.size(); i++) {
                    TLRPC.Update update2 = updates.updates.get(i);
                    if (update2 instanceof TLRPC.TL_updateNewMessage) {
                        message = ((TLRPC.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message != null) {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null && inputSavedStarGift != null && eq(savedStarGift, inputSavedStarGift)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.rolling = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    int i2 = savedStarGift2.flags | 8;
                    savedStarGift2.msg_id = message.id;
                    savedStarGift2.flags = i2 & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    set(savedStarGift2, this.giftsList);
                    this.sample_attributes = null;
                    this.rolling = false;
                    StarsController.IGiftsList iGiftsList = this.giftsList;
                    if (iGiftsList != null) {
                        iGiftsList.notifyUpdate();
                    } else {
                        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(this.dialogId);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return 1;
                }
            }
            if (this.giftsList == null) {
                StarsController.getInstance(this.currentAccount).invalidateProfileGifts(getDialogId());
            }
            this.rolling = true;
            this.savedStarGift = null;
            this.myProfile = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            set(messageObject, this.giftsList);
            this.sample_attributes = null;
            this.rolling = false;
            AndroidUtilities.runOnUIThread(runnable);
            return 1;
        }
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(getDialogId());
        lambda$new$0();
        return 0;
    }

    private void doUpgrade() {
        final TL_stars.InputSavedStarGift inputStarGift;
        long j;
        String str;
        if (this.button.isLoading() || (inputStarGift = getInputStarGift()) == null) {
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j = tL_messageActionStarGift.upgrade_stars;
            if (j <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
            str = null;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            j = savedStarGift.upgrade_stars;
            if (j <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
            str = null;
        }
        final String str2 = str;
        if (j > 0 || this.upgrade_form != null) {
            this.button.setLoading(true);
            if (j > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = this.checkbox.isChecked();
                upgradestargift.stargift = inputStarGift;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda145
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StarGiftSheet.this.lambda$doUpgrade$110(inputStarGift, tLObject, tL_error);
                    }
                });
                return;
            }
            final StarsController starsController = StarsController.getInstance(this.currentAccount);
            if (!starsController.balanceAvailable()) {
                starsController.getBalance(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda146
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$doUpgrade$111(starsController);
                    }
                });
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.upgrade_form.form_id;
            if (!TextUtils.isEmpty(str2)) {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str2;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = this.checkbox.isChecked();
                tL_inputInvoiceStarGiftUpgrade.stargift = inputStarGift;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            }
            Iterator<TLRPC.TL_labeledPrice> it = this.upgrade_form.invoice.prices.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                j2 += it.next().amount;
            }
            final long j3 = j2;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda147
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarGiftSheet.this.lambda$doUpgrade$120(str2, inputStarGift, j3, tLObject, tL_error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$110(final TL_stars.InputSavedStarGift inputSavedStarGift, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda152
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$109(tL_error, tLObject, inputSavedStarGift);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$109(TLRPC.TL_error tL_error, final TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift) {
        if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
            getBulletinFactory().showForError(tL_error);
            return;
        }
        this.upgradedOnce = true;
        this.upgrade_form = null;
        applyNewGiftFromUpdates(inputSavedStarGift, (TLRPC.Updates) tLObject, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda174
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$107();
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda175
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$108(tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$107() {
        this.button.setLoading(false);
        switchPage(0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$108(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$111(StarsController starsController) {
        if (!starsController.balanceAvailable()) {
            getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE")).ignoreDetach().show();
        } else {
            this.button.setLoading(false);
            doUpgrade();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$120(final String str, final TL_stars.InputSavedStarGift inputSavedStarGift, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda151
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$119(tLObject, str, inputSavedStarGift, tL_error, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$119(TLObject tLObject, final String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, final long j) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            StarsController.getInstance(this.currentAccount).invalidateTransactions(false);
            StarsController.getInstance(this.currentAccount).invalidateBalance();
            if (!TextUtils.isEmpty(str) && (savedStarGift = this.savedStarGift) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            this.upgradedOnce = true;
            this.upgrade_form = null;
            applyNewGiftFromUpdates(inputSavedStarGift, tL_payments_paymentResult.updates, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda167
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$doUpgrade$114(str);
                }
            });
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda168
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$doUpgrade$115(tL_payments_paymentResult);
                }
            });
            return;
        }
        if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                this.button.setLoading(false);
                StarsController.showNoSupportDialog(getContext(), this.resourcesProvider);
                return;
            } else {
                StarsController.getInstance(this.currentAccount).invalidateBalance(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda169
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$doUpgrade$118(j);
                    }
                });
                return;
            }
        }
        getBulletinFactory().showForError(tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$114(String str) {
        this.button.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            lambda$new$0();
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null) {
                return;
            }
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.getDialogId() == this.dialogId) {
                    BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(this.dialogId)))).show(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
            int i = NotificationCenter.closeProfileActivity;
            Long valueOf = Long.valueOf(this.dialogId);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i, valueOf, bool);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(this.dialogId), bool);
            final ChatActivity of = ChatActivity.of(this.dialogId);
            of.whenFullyVisible(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda181
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$doUpgrade$113(of);
                }
            });
            lastFragment.presentFragment(of);
            return;
        }
        switchPage(0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$113(ChatActivity chatActivity) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(this.dialogId))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$112();
            }
        }).show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$112() {
        Bundle bundle = new Bundle();
        long j = this.dialogId;
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        if (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        presentFragment(new ProfileActivity(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$115(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$118(long j) {
        final boolean[] zArr = {false};
        StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 10, null, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda179
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$116(zArr);
            }
        }, 0L);
        starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda180
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StarGiftSheet.this.lambda$doUpgrade$117(dialogInterface);
            }
        });
        starsNeededSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$116(boolean[] zArr) {
        zArr[0] = true;
        this.button.setLoading(false);
        doUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$117(DialogInterface dialogInterface) {
        this.button.setLoading(false);
    }

    private void cantWithBlockchainGiftAlert(int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.Gift2CantDoTitle));
        builder.setMessage(LocaleController.getString(R.string.Gift2CantDoText));
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift != null && !TextUtils.isEmpty(uniqueGift.slug)) {
            builder.setPositiveButton(LocaleController.getString(R.string.OpenFragment), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda80
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i2) {
                    StarGiftSheet.this.lambda$cantWithBlockchainGiftAlert$121(uniqueGift, alertDialog, i2);
                }
            });
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cantWithBlockchainGiftAlert$121(TL_stars.TL_starGiftUnique tL_starGiftUnique, AlertDialog alertDialog, int i) {
        Browser.openUrlInSystemBrowser(getContext(), "https://fragment.com/gift/" + tL_starGiftUnique.slug);
    }

    public void onTransferClick(View view) {
        if (view.getAlpha() < 0.99f) {
            cantWithBlockchainGiftAlert(0);
        } else {
            openTransfer();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void openTransfer() {
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i;
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
        if (canTransferAt() > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            showTimeoutAlertAt(getContext(), false, canTransferAt());
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                i = savedStarGift.can_export_at;
                final int i2 = i;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                final int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                Context context = getContext();
                int i3 = this.currentAccount;
                final UserSelectorBottomSheet[] userSelectorBottomSheetArr = {new UserSelectorBottomSheet(context, i3, 0L, BirthdayController.getInstance(i3).getState(), 3, true, this.resourcesProvider)};
                userSelectorBottomSheetArr[0].setTitle(LocaleController.getString(R.string.Gift2TransferShort));
                final int max = currentTime <= i2 ? 0 : Math.max(1, Math.round(Math.max(0, i2 - currentTime) / 86400.0f));
                userSelectorBottomSheetArr[0].addTONOption(max);
                userSelectorBottomSheetArr[0].setOnUserSelector(new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda82
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        StarGiftSheet.this.lambda$openTransfer$133(currentTime, i2, max, tL_starGiftUnique2, userSelectorBottomSheetArr, (Long) obj);
                    }
                });
                userSelectorBottomSheetArr[0].show();
            }
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                i = tL_messageActionStarGiftUnique.can_export_at;
                final int i22 = i;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique;
                final int currentTime2 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                Context context2 = getContext();
                int i32 = this.currentAccount;
                final UserSelectorBottomSheet[] userSelectorBottomSheetArr2 = {new UserSelectorBottomSheet(context2, i32, 0L, BirthdayController.getInstance(i32).getState(), 3, true, this.resourcesProvider)};
                userSelectorBottomSheetArr2[0].setTitle(LocaleController.getString(R.string.Gift2TransferShort));
                if (currentTime2 <= i22) {
                }
                userSelectorBottomSheetArr2[0].addTONOption(max);
                userSelectorBottomSheetArr2[0].setOnUserSelector(new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda82
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        StarGiftSheet.this.lambda$openTransfer$133(currentTime2, i22, max, tL_starGiftUnique22, userSelectorBottomSheetArr2, (Long) obj);
                    }
                });
                userSelectorBottomSheetArr2[0].show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$133(int i, int i2, int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final UserSelectorBottomSheet[] userSelectorBottomSheetArr, final Long l) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l.longValue() == -99) {
            if (i < i2) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle)).setMessage(LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i3), new Object[0])).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new GiftTransferTopView(getContext(), tL_starGiftUnique), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(getContext());
            int i4 = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i4, this.resourcesProvider));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(getContext());
            textView2.setTextColor(Theme.getColor(i4, this.resourcesProvider));
            textView2.setTextSize(1, 16.0f);
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ExportTONFragmentText, getGiftName())));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 0, 24, 4));
            new AlertDialog.Builder(getContext(), this.resourcesProvider).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda97
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i5) {
                    StarGiftSheet.this.lambda$openTransfer$124(userSelectorBottomSheetArr, alertDialog, i5);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
            return;
        }
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda98
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openTransfer$128(l, userSelectorBottomSheetArr);
            }
        };
        if (l.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-l.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-l.longValue());
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getFullChannel, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda99
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StarGiftSheet.this.lambda$openTransfer$130(runnable, tLObject, tL_error);
                    }
                });
                return;
            } else if (!chatFull.stargifts_available) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle)).setMessage(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
        } else if (l.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l);
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(l.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                BulletinFactory.of(userSelectorBottomSheetArr[0].container, this.resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l.longValue())))).show();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getFullUser, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda100
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StarGiftSheet.this.lambda$openTransfer$132(userSelectorBottomSheetArr, l, runnable, tLObject, tL_error);
                    }
                });
                return;
            }
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$124(final UserSelectorBottomSheet[] userSelectorBottomSheetArr, AlertDialog alertDialog, int i) {
        final Browser.Progress makeButtonLoading = alertDialog.makeButtonLoading(i);
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(2, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda121
            @Override // org.telegram.ui.TwoStepVerificationActivity.TwoStepVerificationActivityDelegate
            public final void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
                StarGiftSheet.this.lambda$openTransfer$122(twoStepVerificationActivity, inputCheckPasswordSRP);
            }
        });
        twoStepVerificationActivity.setDelegateString(getGiftName());
        makeButtonLoading.init();
        twoStepVerificationActivity.preload(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda122
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openTransfer$123(userSelectorBottomSheetArr, makeButtonLoading, twoStepVerificationActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$123(UserSelectorBottomSheet[] userSelectorBottomSheetArr, Browser.Progress progress, TwoStepVerificationActivity twoStepVerificationActivity) {
        userSelectorBottomSheetArr[0].lambda$new$0();
        progress.end();
        presentFragment(twoStepVerificationActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$128(final Long l, final UserSelectorBottomSheet[] userSelectorBottomSheetArr) {
        openTransferAlert(l.longValue(), new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda139
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$openTransfer$127(l, userSelectorBottomSheetArr, (Browser.Progress) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$127(Long l, final UserSelectorBottomSheet[] userSelectorBottomSheetArr, final Browser.Progress progress) {
        progress.init();
        doTransfer(l.longValue(), new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda155
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$openTransfer$126(progress, userSelectorBottomSheetArr, (TLRPC.TL_error) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$126(Browser.Progress progress, UserSelectorBottomSheet[] userSelectorBottomSheetArr, final TLRPC.TL_error tL_error) {
        progress.end();
        userSelectorBottomSheetArr[0].lambda$new$0();
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda171
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$openTransfer$125(tL_error);
                }
            });
        } else {
            lambda$new$0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$125(TLRPC.TL_error tL_error) {
        getBulletinFactory().showForError(tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$130(final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda141
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openTransfer$129(tLObject, runnable, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$129(TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(this.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle)).setMessage(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            } else {
                runnable.run();
                return;
            }
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$132(final UserSelectorBottomSheet[] userSelectorBottomSheetArr, final Long l, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda143
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openTransfer$131(tLObject, userSelectorBottomSheetArr, l, runnable, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$131(TLObject tLObject, UserSelectorBottomSheet[] userSelectorBottomSheetArr, Long l, Runnable runnable, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
                runnable.run();
                return;
            } else {
                BulletinFactory.of(userSelectorBottomSheetArr[0].container, this.resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l.longValue())))).show();
                return;
            }
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    public void openTransferAlert(long j, Utilities.Callback callback) {
        TLRPC.Message message;
        long j2;
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j2 = savedStarGift.transfer_stars;
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j2 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        }
        openTransferAlert(j, j2, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void openTransferAlert(long j, long j2, final Utilities.Callback callback) {
        String str;
        TLRPC.Chat chat;
        String formatString;
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (chat2 == null) {
                str = "";
                chat = chat2;
            } else {
                str = chat2.title;
                chat = chat2;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new GiftTransferTopView(getContext(), uniqueGift, chat), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setTextSize(1, 16.0f);
        if (j2 > 0) {
            formatString = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j2, getGiftName(), DialogObject.getShortName(j));
        } else {
            formatString = LocaleController.formatString(R.string.Gift2TransferText, getGiftName(), str);
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        addAttributeRow(tableView, StarsController.findAttribute(uniqueGift.attributes, TL_stars.starGiftAttributeModel.class));
        addAttributeRow(tableView, StarsController.findAttribute(uniqueGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
        addAttributeRow(tableView, StarsController.findAttribute(uniqueGift.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(uniqueGift.slug) && (uniqueGift.flags & 256) != 0) {
            String formatCurrency = BillingController.getInstance().formatCurrency(uniqueGift.value_amount, uniqueGift.value_currency, BillingController.getInstance().getCurrencyExp(uniqueGift.value_currency), true);
            tableView.addRow(LocaleController.getString(R.string.GiftValue2), "~" + formatCurrency);
        }
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setView(linearLayout).setPositiveButton(j2 > 0 ? StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j2))) : LocaleController.getString(R.string.Gift2TransferDo), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda79
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                StarGiftSheet.lambda$openTransferAlert$134(Utilities.Callback.this, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().setShowStarsBalance(true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openTransferAlert$134(Utilities.Callback callback, AlertDialog alertDialog, int i) {
        callback.run(alertDialog.makeButtonLoading(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initTONTransfer, reason: merged with bridge method [inline-methods] */
    public void lambda$openTransfer$122(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        getstargiftwithdrawalurl.stargift = inputStarGift;
        if (inputStarGift == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda154
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$initTONTransfer$139(twoStepVerificationActivity, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$139(final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda170
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$initTONTransfer$138(tL_error, twoStepVerificationActivity, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$138(TLRPC.TL_error tL_error, final TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        int i;
        if (getContext() == null) {
            return;
        }
        if (tL_error != null) {
            if ("PASSWORD_MISSING".equals(tL_error.text) || tL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.needHideProgress();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle(LocaleController.getString(R.string.Gift2TransferToTONAlertTitle));
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                TextView textView = new TextView(getContext());
                int i2 = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i2));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(getContext());
                int i3 = R.drawable.list_circle;
                imageView.setImageResource(i3);
                imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                int color = Theme.getColor(i2);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                TextView textView2 = new TextView(getContext());
                textView2.setTextColor(Theme.getColor(i2));
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText1)));
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                    linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
                    linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(i3);
                imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), mode));
                TextView textView3 = new TextView(getContext());
                textView3.setTextColor(Theme.getColor(i2));
                textView3.setTextSize(1, 16.0f);
                textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText2)));
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                    i = 5;
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
                } else {
                    i = 5;
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
                    linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    builder.setPositiveButton(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda178
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            StarGiftSheet.this.lambda$initTONTransfer$135(alertDialog, i4);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(getContext());
                    textView4.setTextColor(Theme.getColor(i2));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i = 3;
                    }
                    textView4.setGravity(i | 48);
                    textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                    linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                    builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.showDialog(builder.create());
                    return;
                } else {
                    builder.show();
                    return;
                }
            }
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda177
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        StarGiftSheet.this.lambda$initTONTransfer$137(twoStepVerificationActivity, tLObject2, tL_error2);
                    }
                }, 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.lambda$onBackPressed$355();
            }
            BulletinFactory.showError(tL_error);
            return;
        }
        twoStepVerificationActivity.needHideProgress();
        twoStepVerificationActivity.lambda$onBackPressed$355();
        if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
            Browser.openUrlInSystemBrowser(getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$135(AlertDialog alertDialog, int i) {
        presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$137(final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$initTONTransfer$136(tL_error, tLObject, twoStepVerificationActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$136(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, password);
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            lambda$openTransfer$122(twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
        }
    }

    private void presentFragment(BaseFragment baseFragment) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        safeLastFragment.showAsSheet(baseFragment, bottomSheetParams);
    }

    private TL_stars.InputSavedStarGift getInputStarGift() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        if (this.dialogId < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            MessageObject messageObject = this.messageObject;
            if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message3.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    if ((tL_messageActionStarGift.flags & 4096) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return null;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (this.slugStarGift == null || TextUtils.isEmpty(this.slug)) {
                return tL_inputSavedStarGiftChat;
            }
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = this.slug;
            return tL_inputSavedStarGiftSlug;
        }
        MessageObject messageObject2 = this.messageObject;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.messageObject.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.messageObject;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.messageObject.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.messageObject;
        if (messageObject4 != null) {
            TLRPC.Message message4 = messageObject4.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = messageObject4.getId();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.slugStarGift == null || TextUtils.isEmpty(this.slug)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.slug;
        return tL_inputSavedStarGiftSlug2;
    }

    public void doTransfer(final long j, final Utilities.Callback callback) {
        TLRPC.Message message;
        final long peerDialogId;
        long j2;
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            peerDialogId = this.dialogId;
            j2 = savedStarGift.transfer_stars;
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
            j2 = tL_messageActionStarGiftUnique.transfer_stars;
        }
        if (j2 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = inputStarGift;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda118
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarGiftSheet.this.lambda$doTransfer$142(callback, j, peerDialogId, tLObject, tL_error);
                }
            });
            return;
        }
        final StarsController starsController = StarsController.getInstance(this.currentAccount);
        if (!starsController.balanceAvailable()) {
            starsController.getBalance(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda119
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$doTransfer$143(starsController, j, callback);
                }
            });
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = inputStarGift;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
        if (makeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = makeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda120
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$doTransfer$152(tL_inputInvoiceStarGiftTransfer, j, peerDialogId, callback, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$142(final Utilities.Callback callback, final long j, final long j2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda134
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doTransfer$141(callback, tL_error, tLObject, j, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$141(Utilities.Callback callback, TLRPC.TL_error tL_error, TLObject tLObject, final long j, long j2) {
        if (callback != null) {
            callback.run(tL_error);
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (!(tLObject instanceof TLRPC.Updates)) {
                BulletinFactory.of(safeLastFragment).showForError(tL_error);
            } else if (j >= 0 && j2 >= 0) {
                final ChatActivity of = ChatActivity.of(j);
                of.whenFullyVisible(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda150
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$doTransfer$140(of, j);
                    }
                });
                safeLastFragment.presentFragment(of);
            } else {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
            }
        }
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j);
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$140(ChatActivity chatActivity, long j) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$143(StarsController starsController, long j, Utilities.Callback callback) {
        if (!starsController.balanceAvailable()) {
            getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE")).ignoreDetach().show();
        } else {
            doTransfer(j, callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$152(final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, final long j, final long j2, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda123
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doTransfer$151(tLObject, tL_inputInvoiceStarGiftTransfer, j, j2, callback, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$151(TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, final long j, final long j2, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
            Iterator<TLRPC.TL_labeledPrice> it = paymentForm.invoice.prices.iterator();
            final long j3 = 0;
            while (it.hasNext()) {
                j3 += it.next().amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda149
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    StarGiftSheet.this.lambda$doTransfer$150(j, j2, callback, j3, tLObject2, tL_error2);
                }
            });
            return;
        }
        if (callback != null) {
            callback.run(tL_error);
        }
        getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$150(final long j, final long j2, final Utilities.Callback callback, final long j3, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda166
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doTransfer$149(tLObject, j, j2, callback, tL_error, j3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$149(TLObject tLObject, final long j, long j2, final Utilities.Callback callback, TLRPC.TL_error tL_error, final long j3) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            StarsController.getInstance(this.currentAccount).invalidateTransactions(false);
            StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j);
            StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j2);
            StarsController.getInstance(this.currentAccount).invalidateBalance();
            if (callback != null) {
                callback.run(null);
            }
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                if (j >= 0 && j2 >= 0) {
                    final ChatActivity of = ChatActivity.of(j);
                    of.whenFullyVisible(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda182
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.this.lambda$doTransfer$144(of, j);
                        }
                    });
                    safeLastFragment.presentFragment(of);
                } else {
                    BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
                }
            }
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda183
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$doTransfer$145(tL_payments_paymentResult);
                }
            });
            return;
        }
        if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                this.button.setLoading(false);
                StarsController.showNoSupportDialog(getContext(), this.resourcesProvider);
                return;
            } else {
                StarsController.getInstance(this.currentAccount).invalidateBalance(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda184
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$doTransfer$148(j3, j, callback);
                    }
                });
                return;
            }
        }
        if (callback != null) {
            callback.run(tL_error);
        }
        getBulletinFactory().showForError(tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$144(ChatActivity chatActivity, long j) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$145(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$148(long j, final long j2, final Utilities.Callback callback) {
        final boolean[] zArr = {false};
        StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 11, null, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doTransfer$146(zArr, j2, callback);
            }
        }, 0L);
        starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StarGiftSheet.this.lambda$doTransfer$147(dialogInterface);
            }
        });
        starsNeededSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$146(boolean[] zArr, long j, Utilities.Callback callback) {
        zArr[0] = true;
        this.button.setLoading(false);
        doTransfer(j, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$147(DialogInterface dialogInterface) {
        this.button.setLoading(false);
    }

    public BulletinFactory getBulletinFactory() {
        return BulletinFactory.of(this.bottomBulletinContainer, this.resourcesProvider);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBuyPressed() {
        long clientUserId;
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (this.button.isLoading() || uniqueGift == null) {
            return;
        }
        this.button.setLoading(true);
        if (this.slugStarGift != null && this.resale) {
            clientUserId = this.dialogId;
        }
        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final long j = clientUserId;
        final AmountUtils$Currency amountUtils$Currency = uniqueGift.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS;
        StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(uniqueGift, j, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda44
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$onBuyPressed$155(amountUtils$Currency, uniqueGift, j, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBuyPressed$155(AmountUtils$Currency amountUtils$Currency, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        this.button.setLoading(false);
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new ResaleBuyTransferAlert(getContext(), this.resourcesProvider, tL_starGiftUnique, new PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift), this.currentAccount, j, getGiftName(), new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda113
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StarGiftSheet.this.lambda$onBuyPressed$154(tL_starGiftUnique, j, (StarGiftSheet.PaymentFormState) obj, (Browser.Progress) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBuyPressed$154(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, PaymentFormState paymentFormState, final Browser.Progress progress) {
        progress.init();
        StarsController.getInstance(this.currentAccount, paymentFormState.currency).buyResellingGift(paymentFormState.form, tL_starGiftUnique, j, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda131
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StarGiftSheet.this.lambda$onBuyPressed$153(progress, tL_starGiftUnique, j, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBuyPressed$153(Browser.Progress progress, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Boolean bool, String str) {
        progress.end();
        if (bool.booleanValue()) {
            Utilities.Callback2 callback2 = this.boughtGift;
            if (callback2 != null) {
                callback2.run(tL_starGiftUnique, Long.valueOf(j));
            }
            lambda$new$0();
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void onBackPressed() {
        if (!this.onlyWearInfo && this.currentPage.to > 0 && !this.button.isLoading() && !this.isLearnMore) {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                set(messageObject);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift != null) {
                    set(savedStarGift, this.giftsList);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
                    if (tL_starGiftUnique != null) {
                        set(this.slug, tL_starGiftUnique, this.giftsList);
                    }
                }
            }
            switchPage(0, true);
            return;
        }
        super.onBackPressed();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected void onSwipeStarts() {
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
    }

    public void showHint(CharSequence charSequence, View view, boolean z) {
        Layout layout;
        float paddingLeft;
        HintView2 hintView2 = this.currentHintView;
        if ((hintView2 != null && hintView2.shown() && this.currentHintViewTextView == view) || view == null) {
            return;
        }
        if (z) {
            if (!(view instanceof SimpleTextView)) {
                return;
            }
            SimpleTextView simpleTextView = (SimpleTextView) view;
            paddingLeft = simpleTextView.getRightDrawableX() + (simpleTextView.getRightDrawableWidth() / 2.0f);
        } else {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof SimpleTextView)) {
                return;
            } else {
                layout = ((SimpleTextView) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(0, spanned.length(), ButtonSpan.class);
            if (buttonSpanArr == null || buttonSpanArr.length <= 0) {
                return;
            }
            paddingLeft = view.getPaddingLeft() + layout.getPrimaryHorizontal(spanned.getSpanStart(buttonSpanArr[buttonSpanArr.length - 1])) + (r5.getSize() / 2.0f);
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        this.container.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        HintView2 hintView22 = this.currentHintView;
        if (hintView22 != null) {
            hintView22.hide();
            this.currentHintView = null;
        }
        final HintView2 hintView23 = new HintView2(getContext(), 3);
        hintView23.setMultilineText(!z);
        hintView23.setText(charSequence);
        hintView23.setJointPx(0.0f, (iArr[0] + paddingLeft) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        hintView23.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z ? 18 : 0) + 4.33f));
        hintView23.setDuration(3000L);
        hintView23.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        hintView23.setOnHiddenListener(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda110
            @Override // java.lang.Runnable
            public final void run() {
                AndroidUtilities.removeFromParent(HintView2.this);
            }
        });
        hintView23.show();
        this.container.addView(hintView23, LayoutHelper.createFrame(-1, 100.0f));
        this.currentHintView = hintView23;
        this.currentHintViewTextView = view;
    }

    public static class GiftTransferTopView extends View {
        private final Paint arrowPaint;
        private final Path arrowPath;
        private final StarGiftDrawableIcon giftDrawable;
        private final ImageReceiver userImageReceiver;

        public GiftTransferTopView(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
            super(context);
            Path path = new Path();
            this.arrowPath = path;
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, starGift, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.setPatternsType(3);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            path.rewind();
            path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
            path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
        }

        public GiftTransferTopView(Context context, TL_stars.StarGift starGift) {
            super(context);
            Path path = new Path();
            this.arrowPath = path;
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, starGift, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.setPatternsType(3);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setImageBitmap(SessionCell.createDrawable(60, "fragment"));
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.33f));
            path.rewind();
            path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
            path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
            int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
            this.giftDrawable.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
            this.giftDrawable.draw(canvas);
            canvas.save();
            canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
            canvas.drawPath(this.arrowPath, this.arrowPaint);
            canvas.restore();
            this.userImageReceiver.setImageCoords(width + AndroidUtilities.dp(96.0f), height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
            this.userImageReceiver.draw(canvas);
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.userImageReceiver.onAttachedToWindow();
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.userImageReceiver.onDetachedFromWindow();
        }
    }

    public static class GiftThemeReuseTopView extends View {
        private final Drawable drawable;
        private final StarGiftDrawableIcon giftDrawable;
        private final ImageReceiver userImageReceiver;

        public GiftThemeReuseTopView(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
            super(context);
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, starGift, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.setPatternsType(3);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            Drawable mutate = context.getDrawable(R.drawable.chats_undo).mutate();
            this.drawable = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2), PorterDuff.Mode.MULTIPLY));
            mutate.setBounds(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
            int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
            this.giftDrawable.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
            this.giftDrawable.draw(canvas);
            canvas.save();
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.drawable.draw(canvas);
            canvas.restore();
            this.userImageReceiver.setImageCoords(width + AndroidUtilities.dp(96.0f), height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
            this.userImageReceiver.draw(canvas);
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.userImageReceiver.onAttachedToWindow();
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.userImageReceiver.onDetachedFromWindow();
        }
    }

    public static class StarGiftDrawableIcon extends CompatDrawable {
        private RadialGradient gradient;
        private final ImageReceiver imageReceiver;
        private final Matrix matrix;
        private final Path path;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable pattern;
        private float patternsScale;
        private int patternsType;
        private final RectF rect;
        private int rounding;
        private final int sizeDp;

        public StarGiftDrawableIcon(View view, TL_stars.StarGift starGift, int i, float f) {
            super(view);
            this.path = new Path();
            this.rect = new RectF();
            this.matrix = new Matrix();
            this.rounding = AndroidUtilities.dp(16.0f);
            this.patternsType = 0;
            this.patternsScale = f;
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.imageReceiver = imageReceiver;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, AndroidUtilities.dp(i > 180 ? 24.0f : 18.0f));
            this.pattern = swapAnimatedEmojiDrawable;
            this.sizeDp = i;
            if (starGift != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                if (stargiftattributepattern != null) {
                    swapAnimatedEmojiDrawable.set(stargiftattributepattern.document, false);
                }
                if (stargiftattributebackdrop != null) {
                    this.gradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    swapAnimatedEmojiDrawable.setColor(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
                }
                if (stargiftattributemodel != null) {
                    StarsIntroActivity.setGiftImage(imageReceiver, stargiftattributemodel.document, (int) (i * 0.75f));
                }
            }
            this.paint.setShader(this.gradient);
            if (view.isAttachedToWindow()) {
                onAttachedToWindow();
            }
        }

        public StarGiftDrawableIcon setRounding(int i) {
            this.rounding = i;
            return this;
        }

        public StarGiftDrawableIcon setPatternsType(int i) {
            this.patternsType = i;
            return this;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.rect.set(getBounds());
            canvas.save();
            this.path.rewind();
            Path path = this.path;
            RectF rectF = this.rect;
            float f = this.rounding;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(this.path);
            if (this.gradient != null) {
                this.matrix.reset();
                this.matrix.postTranslate(this.rect.centerX(), this.rect.centerY());
                this.gradient.setLocalMatrix(this.matrix);
                this.paint.setShader(this.gradient);
            }
            canvas.drawPaint(this.paint);
            canvas.save();
            canvas.translate(this.rect.centerX(), this.rect.centerY());
            StarGiftPatterns.drawPattern(canvas, this.patternsType, this.pattern, this.rect.width(), this.rect.height(), 1.0f, this.patternsScale);
            canvas.restore();
            float min = Math.min(this.rect.width(), this.rect.height()) * 0.75f;
            float f2 = min / 2.0f;
            this.imageReceiver.setImageCoords(this.rect.centerX() - f2, this.rect.centerY() - f2, min, min);
            this.imageReceiver.draw(canvas);
            canvas.restore();
        }

        @Override // org.telegram.ui.Components.CompatDrawable
        public void onAttachedToWindow() {
            this.pattern.attach();
            this.imageReceiver.onAttachedToWindow();
        }

        @Override // org.telegram.ui.Components.CompatDrawable
        public void onDetachedToWindow() {
            this.pattern.detach();
            this.imageReceiver.onDetachedFromWindow();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(this.sizeDp);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(this.sizeDp);
        }
    }

    public static class UpgradeIcon extends CompatDrawable {
        private float alpha;
        private final Path arrow;
        private final long start;
        private final Paint strokePaint;
        private final View view;

        public UpgradeIcon(View view, int i) {
            super(view);
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            Path path = new Path();
            this.arrow = path;
            this.start = System.currentTimeMillis();
            this.alpha = 1.0f;
            this.view = view;
            this.paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(i);
            path.rewind();
            path.moveTo(-AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
            path.lineTo(0.0f, -AndroidUtilities.dpf2(1.08f));
            path.lineTo(AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.paint.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, this.paint);
            float currentTimeMillis = ((System.currentTimeMillis() - this.start) % 400) / 400.0f;
            int alpha = this.strokePaint.getAlpha();
            this.strokePaint.setAlpha((int) (alpha * this.alpha));
            this.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
            canvas.save();
            canvas.translate(getBounds().centerX(), getBounds().centerY() - (((AndroidUtilities.dpf2(2.16f) * 3.0f) + (AndroidUtilities.dpf2(1.166f) * 2.0f)) / 2.0f));
            int i = 0;
            while (i < 4) {
                float f = i == 0 ? 1.0f - currentTimeMillis : i == 3 ? currentTimeMillis : 1.0f;
                this.strokePaint.setAlpha((int) (f * 255.0f * this.alpha));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, f);
                canvas.scale(lerp, lerp);
                canvas.drawPath(this.arrow, this.strokePaint);
                canvas.restore();
                canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f);
                i++;
            }
            canvas.restore();
            this.strokePaint.setAlpha(alpha);
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override // org.telegram.ui.Components.CompatDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.alpha = i / 255.0f;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(18.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(18.0f);
        }
    }

    private static class PageTransition {
        public int from;
        public float progress;
        public int to;

        public PageTransition(int i, int i2, float f) {
            this.from = i;
            this.to = i2;
        }

        public void setProgress(float f) {
            this.progress = f;
        }

        public float at(int i) {
            int i2 = this.to;
            if (i2 == i && this.from == i) {
                return 1.0f;
            }
            if (i2 == i) {
                return this.progress;
            }
            if (this.from == i) {
                return 1.0f - this.progress;
            }
            return 0.0f;
        }

        public boolean to(int i) {
            return this.to == i;
        }

        public float at(int i, int i2) {
            if (contains(i) && contains(i2)) {
                return 1.0f;
            }
            return Math.max(at(i), at(i2));
        }

        public boolean contains(int i) {
            return this.from == i || this.to == i;
        }

        public boolean is(int i) {
            return this.to == i;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded) {
            if (this.giftsList == ((StarsController.GiftsList) objArr[1])) {
                updateViewPager();
            }
        }
    }

    public static class PaymentFormState {
        public final AmountUtils$Amount amount;
        public final AmountUtils$Currency currency;
        public final TLRPC.TL_payments_paymentFormStarGift form;

        public PaymentFormState(AmountUtils$Currency amountUtils$Currency, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
            this.currency = amountUtils$Currency;
            this.form = tL_payments_paymentFormStarGift;
            long formStarsPrice = StarsController.getFormStarsPrice(tL_payments_paymentFormStarGift);
            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
            if (amountUtils$Currency == amountUtils$Currency2) {
                this.amount = AmountUtils$Amount.fromDecimal(formStarsPrice, amountUtils$Currency2);
                return;
            }
            AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.TON;
            if (amountUtils$Currency == amountUtils$Currency3) {
                this.amount = AmountUtils$Amount.fromNano(formStarsPrice, amountUtils$Currency3);
            } else {
                this.amount = AmountUtils$Amount.fromNano(0L, amountUtils$Currency2);
            }
        }
    }

    public static class ResaleBuyTransferAlert {
        public final AlertDialog alertDialog;
        private BalanceCloud balanceCloud;
        private final boolean canSwitchToTON;
        public final Context context;
        private final HorizontalRoundTabsLayout currencyTabsView;
        public final int currentAccount;
        public final long dialogId;
        private final HashMap forms;
        public final TL_stars.TL_starGiftUnique gift;
        private final String giftName;
        private Browser.Progress lastPositiveButtonProgress;
        private final HashSet loadingForms;
        private TextView positiveButton;
        private final Theme.ResourcesProvider resourcesProvider;
        private FrameLayout rootView;
        private AmountUtils$Currency selectedCurrency;
        private final TextView textInfoView;
        private HintView2 tonHint;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onUpdateCurrency$3(View view) {
        }

        public ResaleBuyTransferAlert(final Context context, final Theme.ResourcesProvider resourcesProvider, TL_stars.TL_starGiftUnique tL_starGiftUnique, PaymentFormState paymentFormState, final int i, long j, String str, final Utilities.Callback2 callback2) {
            TLObject chat;
            HashMap hashMap = new HashMap();
            this.forms = hashMap;
            this.loadingForms = new HashSet();
            this.context = context;
            this.gift = tL_starGiftUnique;
            this.dialogId = j;
            this.currentAccount = i;
            AmountUtils$Currency amountUtils$Currency = paymentFormState.currency;
            this.selectedCurrency = amountUtils$Currency;
            hashMap.put(amountUtils$Currency, paymentFormState);
            this.resourcesProvider = resourcesProvider;
            this.giftName = str;
            boolean z = tL_starGiftUnique.resale_ton_only;
            this.canSwitchToTON = !z;
            if (j >= 0) {
                chat = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            } else {
                chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.Stars.StarGiftSheet.ResaleBuyTransferAlert.1
                private final int[] c = new int[2];

                @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                    super.onLayout(z2, i2, i3, i4, i5);
                    if (ResaleBuyTransferAlert.this.currencyTabsView == null || ResaleBuyTransferAlert.this.currencyTabsView.linearLayout.getChildCount() < 2 || ResaleBuyTransferAlert.this.tonHint == null || ResaleBuyTransferAlert.this.rootView == null) {
                        return;
                    }
                    ResaleBuyTransferAlert.this.rootView.getLocationInWindow(this.c);
                    float translationX = this.c[0] - ResaleBuyTransferAlert.this.rootView.getTranslationX();
                    float translationY = this.c[1] - ResaleBuyTransferAlert.this.rootView.getTranslationY();
                    View childAt = ResaleBuyTransferAlert.this.currencyTabsView.linearLayout.getChildAt(1);
                    childAt.getLocationInWindow(this.c);
                    float translationX2 = this.c[0] - childAt.getTranslationX();
                    ResaleBuyTransferAlert.this.tonHint.setTranslationY((((this.c[1] - childAt.getTranslationY()) - translationY) - ResaleBuyTransferAlert.this.tonHint.getMeasuredHeight()) - ResaleBuyTransferAlert.this.currencyTabsView.getMeasuredHeight());
                    ResaleBuyTransferAlert.this.tonHint.setJointPx(0.0f, ((translationX2 - translationX) + (childAt.getMeasuredWidth() / 2.0f)) - AndroidUtilities.dp(12.0f));
                }
            };
            frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f));
            if (!z) {
                HorizontalRoundTabsLayout horizontalRoundTabsLayout = new HorizontalRoundTabsLayout(context);
                this.currencyTabsView = horizontalRoundTabsLayout;
                ArrayList arrayList = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
                arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
                horizontalRoundTabsLayout.setTabs(arrayList, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda0
                    @Override // org.telegram.messenger.MessagesStorage.IntCallback
                    public final void run(int i2) {
                        StarGiftSheet.ResaleBuyTransferAlert.this.lambda$new$0(i2);
                    }
                });
                linearLayout.addView(horizontalRoundTabsLayout, LayoutHelper.createLinear(-2, -2, 1, 18, 0, 18, 12));
            } else {
                this.currencyTabsView = null;
                TextView textView = new TextView(context);
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
                textView.setTextSize(1, 14.0f);
                textView.setText(LocaleController.getString(R.string.Gift2BuyPriceOnlyTON));
                textView.setGravity(17);
                linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 17, 24, 4, 24, 4));
            }
            linearLayout.addView(new GiftTransferTopView(context, tL_starGiftUnique, chat), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
            TextView textView2 = new TextView(context);
            this.textInfoView = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView2.setTextSize(1, 16.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
            this.alertDialog = new AlertDialog.Builder(context, resourcesProvider).setView(frameLayout).setPositiveButton("_", new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i2) {
                    StarGiftSheet.ResaleBuyTransferAlert.this.lambda$new$1(i, context, resourcesProvider, callback2, alertDialog, i2);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(int i) {
            AmountUtils$Currency amountUtils$Currency;
            if (i == 0) {
                amountUtils$Currency = AmountUtils$Currency.STARS;
            } else {
                amountUtils$Currency = AmountUtils$Currency.TON;
            }
            this.selectedCurrency = amountUtils$Currency;
            onUpdateCurrency(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(int i, Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback2 callback2, AlertDialog alertDialog, int i2) {
            PaymentFormState paymentFormState = (PaymentFormState) this.forms.get(this.selectedCurrency);
            if (paymentFormState == null) {
                return;
            }
            StarsController starsController = StarsController.getInstance(i, this.selectedCurrency);
            AmountUtils$Amount of = starsController.balanceAvailable() ? AmountUtils$Amount.of(starsController.getBalance()) : null;
            if (of != null && paymentFormState.amount.asNano() > of.asNano()) {
                AmountUtils$Currency amountUtils$Currency = this.selectedCurrency;
                if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                    new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, paymentFormState.amount.asDecimal(), 14, null, null, 0L).show();
                    return;
                } else {
                    if (amountUtils$Currency == AmountUtils$Currency.TON) {
                        new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, paymentFormState.amount, true, null).show();
                        return;
                    }
                    return;
                }
            }
            Browser.Progress progress = this.lastPositiveButtonProgress;
            if (progress != null) {
                progress.cancel();
                this.lastPositiveButtonProgress = null;
            }
            callback2.run(paymentFormState, alertDialog.makeButtonLoading(i2));
        }

        public void show() {
            this.alertDialog.setShowStarsBalance(true).show();
            this.positiveButton = (TextView) this.alertDialog.getButton(-1);
            this.balanceCloud = this.alertDialog.getStarsBalanceCloud();
            FrameLayout fullscreenContainerView = this.alertDialog.getFullscreenContainerView();
            this.rootView = fullscreenContainerView;
            if (fullscreenContainerView != null && this.canSwitchToTON) {
                HintView2 show = new HintView2(this.context, 3).setMultilineText(true).setTextAlign(Layout.Alignment.ALIGN_NORMAL).setDuration(5000L).setText(LocaleController.getString(R.string.Gift2BuyPricePayHintTON)).show();
                this.tonHint = show;
                show.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                this.rootView.addView(this.tonHint, LayoutHelper.createFrame(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
            }
            onUpdateCurrency(false);
        }

        private void onUpdateCurrency(boolean z) {
            String formatString;
            String formatPluralStringComma;
            HintView2 hintView2;
            final AmountUtils$Currency amountUtils$Currency = this.selectedCurrency;
            PaymentFormState paymentFormState = (PaymentFormState) this.forms.get(amountUtils$Currency);
            this.textInfoView.animate().alpha(paymentFormState != null ? 1.0f : 0.25f).start();
            this.textInfoView.setEnabled(paymentFormState != null);
            this.positiveButton.setEnabled(paymentFormState != null);
            this.balanceCloud.setCurrency(amountUtils$Currency, z);
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = this.currencyTabsView;
            if (horizontalRoundTabsLayout != null) {
                horizontalRoundTabsLayout.setSelectedIndex(amountUtils$Currency == AmountUtils$Currency.TON ? 1 : 0, z);
            }
            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
            if (amountUtils$Currency == amountUtils$Currency2 && (hintView2 = this.tonHint) != null && hintView2.shown()) {
                this.tonHint.hide();
            }
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                    balanceCloud.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StarGiftSheet.ResaleBuyTransferAlert.this.lambda$onUpdateCurrency$2(view);
                        }
                    });
                } else {
                    balanceCloud.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StarGiftSheet.ResaleBuyTransferAlert.lambda$onUpdateCurrency$3(view);
                        }
                    });
                }
            }
            Browser.Progress progress = this.lastPositiveButtonProgress;
            if (progress != null) {
                progress.cancel();
                this.lastPositiveButtonProgress = null;
            }
            if (paymentFormState != null) {
                boolean z2 = this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                if (paymentFormState.currency == AmountUtils$Currency.STARS) {
                    this.positiveButton.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) paymentFormState.amount.asDecimal())));
                    TextView textView = this.textInfoView;
                    if (z2) {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) paymentFormState.amount.asDecimal(), this.giftName);
                    } else {
                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) paymentFormState.amount.asDecimal(), this.giftName, DialogObject.getShortName(this.dialogId));
                    }
                    textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
                }
                if (paymentFormState.currency == amountUtils$Currency2) {
                    this.positiveButton.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, paymentFormState.amount.asFormatString())));
                    TextView textView2 = this.textInfoView;
                    if (z2) {
                        formatString = LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, paymentFormState.amount.asFormatString(), this.giftName);
                    } else {
                        formatString = LocaleController.formatString(R.string.Gift2BuyPriceTextTON, paymentFormState.amount.asFormatString(), this.giftName, DialogObject.getShortName(this.dialogId));
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    return;
                }
                return;
            }
            Browser.Progress makeButtonLoading = this.alertDialog.makeButtonLoading(-1, false, false);
            this.lastPositiveButtonProgress = makeButtonLoading;
            makeButtonLoading.init();
            if (this.loadingForms.add(amountUtils$Currency)) {
                StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(this.gift, this.dialogId, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda4
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        StarGiftSheet.ResaleBuyTransferAlert.this.lambda$onUpdateCurrency$4(amountUtils$Currency, (TLRPC.TL_payments_paymentFormStarGift) obj);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUpdateCurrency$2(View view) {
            new StarsIntroActivity.StarsOptionsSheet(this.context, this.resourcesProvider).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUpdateCurrency$4(AmountUtils$Currency amountUtils$Currency, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
            Browser.Progress progress = this.lastPositiveButtonProgress;
            if (progress != null && amountUtils$Currency == this.selectedCurrency) {
                progress.end();
            }
            this.loadingForms.remove(amountUtils$Currency);
            if (tL_payments_paymentFormStarGift != null) {
                this.forms.put(amountUtils$Currency, new PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift));
                onUpdateCurrency(true);
            }
        }
    }

    private void openValueStats(final long j, final String str, final String str2, final String str3, final TLRPC.Document document, String str4) {
        final AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3);
        alertDialog.showDelayed(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str4;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda107
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$openValueStats$167(alertDialog, document, str3, str, str2, j, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openValueStats$167(final AlertDialog alertDialog, final TLRPC.Document document, final String str, final String str2, final String str3, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda138
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openValueStats$166(alertDialog, tLObject, document, str, str2, str3, j, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openValueStats$166(AlertDialog alertDialog, TLObject tLObject, TLRPC.Document document, String str, final String str2, String str3, final long j, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                getBulletinFactory().showForError(tL_error);
                return;
            }
            return;
        }
        final TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        BottomSheet.Builder builder = new BottomSheet.Builder(getContext(), false, this.resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        BackupImageView backupImageView = new BackupImageView(getContext());
        StarsIntroActivity.setGiftImage(backupImageView.getImageReceiver(), document, NotificationCenter.albumsDidLoad);
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(NotificationCenter.albumsDidLoad, NotificationCenter.albumsDidLoad, 1, 0, 0, 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(21.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(getContext());
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftValueAverage, str2)));
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftValueLastFragment, str3)));
        } else {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftValueLastTelegram, str3)));
        }
        final FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        final HintView2[] hintView2Arr = new HintView2[1];
        final Utilities.Callback2 callback2 = new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda156
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StarGiftSheet.this.lambda$openValueStats$158(hintView2Arr, frameLayout, (View) obj, (CharSequence) obj2);
            }
        };
        TableView tableView = new TableView(getContext(), this.resourcesProvider);
        frameLayout.addView(tableView, LayoutHelper.createFrame(-1, -1, 119));
        tableView.addRow(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true));
        tableView.addRow(LocaleController.getString(R.string.GiftValueInitialPrice), StarsIntroActivity.replaceStarsWithPlain("⭐️" + uniqueStarGiftValueInfo.initial_sale_stars + " (~" + BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency) + ")", 0.8f));
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            tableView.addRow(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true));
            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (round > 0) {
                tableView.addRow(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null);
            } else {
                tableView.addRow(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency));
            }
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            final ButtonSpan.TextViewButtons[] textViewButtonsArr = {(ButtonSpan.TextViewButtons) ((TableView.TableRowContent) r5.getChildAt(1)).getChildAt(0)};
            final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda157
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.lambda$openValueStats$159(Utilities.Callback2.this, textViewButtonsArr, uniqueStarGiftValueInfo, str2);
                }
            };
            TableRow addRow = tableView.addRow(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", runnable);
            addRow.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda158
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            final ButtonSpan.TextViewButtons[] textViewButtonsArr2 = {(ButtonSpan.TextViewButtons) ((TableView.TableRowContent) r5.getChildAt(1)).getChildAt(0)};
            final Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda159
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.lambda$openValueStats$161(Utilities.Callback2.this, textViewButtonsArr2, uniqueStarGiftValueInfo, str2);
                }
            };
            TableRow addRow2 = tableView.addRow(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", runnable2);
            addRow2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda160
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable2.run();
                }
            });
        }
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), false, this.resourcesProvider);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(document, 1.5f, buttonWithCounterView.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            buttonWithCounterView.setText(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda161
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarGiftSheet.this.lambda$openValueStats$164(str2, j, view);
                }
            });
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 42, 7, 0, 0, 0, 2));
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(getContext(), false, this.resourcesProvider);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
            spannableStringBuilder2.append((CharSequence) "e");
            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(document, 1.5f, buttonWithCounterView2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            buttonWithCounterView2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false);
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda162
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarGiftSheet.this.lambda$openValueStats$165(uniqueStarGiftValueInfo, view);
                }
            });
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 42, 7, 0, 0, 0, 0));
        }
        builder.setCustomView(linearLayout);
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openValueStats$158(HintView2[] hintView2Arr, FrameLayout frameLayout, View view, CharSequence charSequence) {
        ButtonSpan buttonSpan;
        HintView2 hintView2 = hintView2Arr[0];
        if (hintView2 != null) {
            hintView2.hide();
        }
        CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
        float x = view.getX() + ((View) view.getParent()).getX() + ((View) ((View) view.getParent()).getParent()).getX();
        float y = view.getY() + ((View) view.getParent()).getY() + ((View) ((View) view.getParent()).getParent()).getY();
        if (view instanceof ButtonSpan.TextViewButtons) {
            Layout layout = ((ButtonSpan.TextViewButtons) view).getLayout();
            CharSequence text = layout.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(0, text.length(), ButtonSpan.class);
                if (buttonSpanArr.length > 0 && (buttonSpan = buttonSpanArr[0]) != null) {
                    x += layout.getPrimaryHorizontal(spanned.getSpanStart(buttonSpan)) + (buttonSpanArr[0].getSize() / 2);
                    y += layout.getLineTop(layout.getLineForOffset(r4));
                }
            }
        }
        final HintView2 hintView22 = new HintView2(getContext(), 3);
        hintView2Arr[0] = hintView22;
        hintView22.setMultilineText(true);
        hintView22.setInnerPadding(11.0f, 8.0f, 11.0f, 7.0f);
        hintView22.setRounding(10.0f);
        hintView22.setText(replaceTags);
        hintView22.setOnHiddenListener(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda172
            @Override // java.lang.Runnable
            public final void run() {
                AndroidUtilities.removeFromParent(HintView2.this);
            }
        });
        hintView22.setTranslationY((-AndroidUtilities.dp(100.0f)) + y);
        hintView22.setMaxWidthPx(AndroidUtilities.dp(300.0f));
        hintView22.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        hintView22.setJointPx(0.0f, x - AndroidUtilities.dp(4.0f));
        frameLayout.addView(hintView22, LayoutHelper.createFrame(-1, 100, 55));
        hintView22.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openValueStats$159(Utilities.Callback2 callback2, ButtonSpan.TextViewButtons[] textViewButtonsArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str) {
        callback2.run(textViewButtonsArr[0], LocaleController.formatString(R.string.GiftValueMinPriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openValueStats$161(Utilities.Callback2 callback2, ButtonSpan.TextViewButtons[] textViewButtonsArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str) {
        callback2.run(textViewButtonsArr[0], LocaleController.formatString(R.string.GiftValueAveragePriceInfo, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openValueStats$164(String str, long j, View view) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        ResaleGiftsFragment resaleGiftsFragment = new ResaleGiftsFragment(this.dialogId, str, j, this.resourcesProvider);
        resaleGiftsFragment.setCloseParentSheet(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda173
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openValueStats$163();
            }
        });
        lastFragment.showAsSheet(resaleGiftsFragment, bottomSheetParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openValueStats$163() {
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openValueStats$165(TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, View view) {
        Browser.openUrlInSystemBrowser(getContext(), uniqueStarGiftValueInfo.fragment_listed_url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class UpgradePricesSheet extends BottomSheetLayouted {
        private LimitPreviewView limitPreviewView;
        private ArrayList prices;

        public UpgradePricesSheet(Context context, long j, ArrayList arrayList, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            int i;
            int i2;
            this.prices = arrayList;
            float f = this.backgroundPaddingLeft / AndroidUtilities.density;
            LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, 0, resourcesProvider);
            this.limitPreviewView = limitPreviewView;
            limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
            limitPreviewView.setIconScale(1.8f);
            this.layout.addView(limitPreviewView, LayoutHelper.createLinear(-1, -2, 17, f, 20.0f, f, 10.0f));
            setCurrentPrice(j);
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            TextView makeTextView = TextHelper.makeTextView(context, 20.0f, i3, true);
            makeTextView.setGravity(17);
            int i4 = R.string.Gift2UpgradeCostsTitle;
            makeTextView.setText(LocaleController.getString(i4));
            setTitle(LocaleController.getString(i4));
            this.layout.addView(makeTextView, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 0));
            TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, i3, false);
            makeTextView2.setGravity(17);
            makeTextView2.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
            this.layout.addView(makeTextView2, LayoutHelper.createLinear(-1, -2, 17, 32, 10, 32, 10));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            TableView tableView = new TableView(context, resourcesProvider);
            int i5 = 0;
            boolean z = false;
            while (i5 < arrayList.size()) {
                if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i5)).date || ((i2 = i5 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i2)).date)) {
                    i = currentTime;
                    Date date = new Date(r11.date * 1000);
                    tableView.addRow(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), StarsIntroActivity.replaceStarsWithPlain("⭐️ " + LocaleController.formatNumber((int) r11.upgrade_stars, ','), 0.8f));
                    z = true;
                } else {
                    i = currentTime;
                }
                i5++;
                currentTime = i;
            }
            if (!z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) it.next();
                    Date date2 = new Date(starGiftUpgradePrice.date * 1000);
                    tableView.addRow(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), StarsIntroActivity.replaceStarsWithPlain("⭐️ " + LocaleController.formatNumber((int) starGiftUpgradePrice.upgrade_stars, ','), 0.8f));
                }
            }
            float f2 = f + 14.0f;
            this.layout.addView(tableView, LayoutHelper.createLinear(-1, -2, 7, f2, 16.0f, f2, 15.0f));
            TextView makeTextView3 = TextHelper.makeTextView(context, 12.0f, Theme.key_windowBackgroundWhiteGrayText, false);
            makeTextView3.setGravity(17);
            makeTextView3.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
            this.layout.addView(makeTextView3, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 15));
            createButton();
            this.button.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)), false);
            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$UpgradePricesSheet$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarGiftSheet.UpgradePricesSheet.this.lambda$new$0(view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            lambda$new$0();
        }

        public void setCurrentPrice(long j) {
            ArrayList arrayList = this.prices;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            this.limitPreviewView.setStarsUpgradePrice((TL_stars.StarGiftUpgradePrice) this.prices.get(0), j, (TL_stars.StarGiftUpgradePrice) this.prices.get(r1.size() - 1));
        }
    }

    public static CharSequence replaceUnderstood(CharSequence charSequence) {
        return replaceUnderstood(charSequence, null);
    }

    public static CharSequence replaceUnderstood(CharSequence charSequence, ColoredImageSpan[] coloredImageSpanArr) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new ColoredImageSpan(R.drawable.filled_understood), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new ColoredImageSpan(R.drawable.filled_reactions), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static class ActionView extends View {
        private final Paint bgDarkerPaint;
        private final Paint bgPaint;
        private BitmapShader blurBitmapShader;
        private Matrix blurInvertMatrix;
        private Matrix blurMatrix;
        private StaticLayout layout;
        private final TextPaint paint;
        private final LinkPath path;
        private CharSequence textToSet;

        public ActionView(Context context) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.paint = textPaint;
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
            Paint paint2 = new Paint(1);
            this.bgDarkerPaint = paint2;
            paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
            this.path = new LinkPath(true);
        }

        public void prepareBlur(View view) {
            ArrayList arrayList = new ArrayList();
            if (view != null) {
                arrayList.add(view);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$ActionView$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    StarGiftSheet.ActionView.this.lambda$prepareBlur$0((Bitmap) obj);
                }
            }, 12.0f, 12, null, arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$prepareBlur$0(Bitmap bitmap) {
            this.blurMatrix = new Matrix();
            this.blurInvertMatrix = new Matrix();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.blurBitmapShader = bitmapShader;
            this.bgPaint.setShader(bitmapShader);
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.25f);
            this.bgPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            CharSequence charSequence = this.textToSet;
            if (charSequence != null) {
                set(charSequence, size);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
            StaticLayout staticLayout = this.layout;
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(staticLayout == null ? 0 : staticLayout.getHeight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
            setPivotX(getMeasuredWidth() / 2.0f);
            setPivotY(getMeasuredHeight());
        }

        public void set(MessageObject messageObject) {
            TLRPC.Message message;
            if (messageObject == null || (message = messageObject.messageOwner) == null || message.action == null) {
                setVisibility(8);
                return;
            }
            int i = messageObject.currentAccount;
            long clientUserId = UserConfig.getInstance(i).getClientUserId();
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                setVisibility(8);
                return;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.Peer peer = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).from_id;
                if (peer == null) {
                    setVisibility(8);
                    return;
                }
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (clientUserId == peerDialogId) {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftSelfTopAction, LocaleController.formatDate(messageObject.messageOwner.date))));
                } else {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i, peerDialogId), LocaleController.formatDate(messageObject.messageOwner.date))));
                }
                setVisibility(0);
                return;
            }
            setVisibility(8);
        }

        public void set(int i, TL_stars.SavedStarGift savedStarGift) {
            if (savedStarGift == null || savedStarGift.from_id == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            long clientUserId = UserConfig.getInstance(i).getClientUserId();
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            if (clientUserId == peerDialogId) {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftSelfTopAction, LocaleController.formatDate(savedStarGift.date))));
            } else {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i, peerDialogId), LocaleController.formatDate(savedStarGift.date))));
            }
        }

        public void set(CharSequence charSequence) {
            set(charSequence, getMeasuredWidth());
        }

        private void set(CharSequence charSequence, int i) {
            if (i <= 0) {
                this.textToSet = charSequence;
                return;
            }
            this.layout = new StaticLayout(charSequence, this.paint, i - AndroidUtilities.dp(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.path.rewind();
            this.path.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
            this.path.setCurrentLayout(this.layout, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.layout;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), this.path);
            this.path.closeRects();
            invalidate();
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            invalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.layout != null) {
                canvas.save();
                canvas.translate((getWidth() - this.layout.getWidth()) / 2.0f, AndroidUtilities.dp(16.0f));
                Matrix matrix = this.blurMatrix;
                if (matrix != null) {
                    matrix.reset();
                    this.blurInvertMatrix.reset();
                    View view = this;
                    while (view != null) {
                        this.blurInvertMatrix.postConcat(view.getMatrix());
                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                    }
                    this.blurInvertMatrix.invert(this.blurMatrix);
                    this.blurMatrix.preTranslate(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(16.0f));
                    this.blurMatrix.preScale(12.0f, 12.0f);
                    this.blurBitmapShader.setLocalMatrix(this.blurMatrix);
                }
                canvas.drawPath(this.path, this.bgPaint);
                this.bgDarkerPaint.setColor(Theme.multAlpha(-16777216, 0.35f));
                canvas.drawPath(this.path, this.bgDarkerPaint);
                this.layout.draw(canvas);
                canvas.restore();
            }
        }
    }
}
