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
import android.os.Build;
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
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
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
import org.telegram.messenger.LiteMode;
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
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
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
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

/* loaded from: classes5.dex */
public class StarsIntroActivity extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    private static DecimalFormat floatFormat;
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

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Paint lambda$configure$0(Integer num) {
            return this.paints[num.intValue() % this.paints.length];
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
                if (i >= paintArr.length) {
                    this.drawable.getPaint = new Utilities.CallbackReturn() { // from class: org.telegram.ui.Stars.StarsIntroActivity$4$$ExternalSyntheticLambda0
                        @Override // org.telegram.messenger.Utilities.CallbackReturn
                        public final Object run(Object obj) {
                            Paint lambda$configure$0;
                            lambda$configure$0 = StarsIntroActivity.4.this.lambda$configure$0((Integer) obj);
                            return lambda$configure$0;
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
                paintArr[i] = new Paint(1);
                this.paints[i].setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-371690, -14281, i / (this.paints.length - 1)), PorterDuff.Mode.SRC_IN));
                i++;
            }
        }

        @Override // org.telegram.ui.Components.Premium.StarParticlesView
        protected int getStarsRectWidth() {
            return getMeasuredWidth();
        }
    }

    public static class ExpandView extends FrameLayout {
        public final ImageView arrowView;
        private int lastId;
        private boolean needDivider;
        public final AnimatedTextView textView;

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asExpand(int i, CharSequence charSequence, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.text = charSequence;
                ofFactory.collapsed = z;
                return ofFactory;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((ExpandView) view).set(uItem, z);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public ExpandView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new ExpandView(context, resourcesProvider);
            }
        }

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

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.lastId = ConnectionsManager.DEFAULT_DATACENTER_ID;
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
                    StarsIntroActivity.GiftStarsSheet.this.lambda$new$0(view, i2);
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
                    StarsIntroActivity.GiftStarsSheet.this.lambda$new$1();
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
                    StarsIntroActivity.GiftStarsSheet.this.lambda$new$2();
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

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            onItemClick(item, this.adapter);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1() {
            BaseFragment baseFragment;
            StarAppsSheet starAppsSheet = new StarAppsSheet(getContext());
            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(this.attachedFragment) && (baseFragment = this.attachedFragment) != null) {
                starAppsSheet.makeAttached(baseFragment);
            }
            starAppsSheet.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2() {
            Browser.openUrl(getContext(), LocaleController.getString(R.string.StarsTOSLink));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onItemClick$3(long j) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(ChatActivity.of(j));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$4(UItem uItem, final long j, Boolean bool, String str) {
            Runnable runnable;
            if (getContext() == null) {
                return;
            }
            if ((bool.booleanValue() || str != null) && (runnable = this.whenPurchased) != null) {
                runnable.run();
            }
            lambda$new$0();
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
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) uItem.longValue, UserObject.getForcedFirstName(this.user))), LocaleController.getString(R.string.ViewInChat), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.GiftStarsSheet.lambda$onItemClick$3(j);
                    }
                }).setDuration(5000).show(true);
                if (fireworksOverlay != null) {
                    fireworksOverlay.start(true);
                }
                StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
            }
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

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if ((i == NotificationCenter.starGiftOptionsLoaded || i == NotificationCenter.starBalanceUpdated) && (universalAdapter = this.adapter) != null) {
                universalAdapter.update(true);
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        /* renamed from: dismiss */
        public void lambda$new$0() {
            super.lambda$new$0();
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet
        public void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            UItem asFlicker;
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
                    asFlicker = ExpandView.Factory.asExpand(-1, LocaleController.getString(z ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions), !this.expanded).accent();
                }
                arrayList.add(UItem.asCustom(this.footerView));
            }
            arrayList.add(UItem.asFlicker(31));
            arrayList.add(UItem.asFlicker(31));
            asFlicker = UItem.asFlicker(31);
            arrayList.add(asFlicker);
            arrayList.add(UItem.asCustom(this.footerView));
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected CharSequence getTitle() {
            HeaderView headerView = this.headerView;
            if (headerView == null) {
                return null;
            }
            return headerView.titleView.getText();
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
                        StarsIntroActivity.GiftStarsSheet.this.lambda$onItemClick$4(uItem, j, (Boolean) obj, (String) obj2);
                    }
                });
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    class NestedFrameLayout extends GradientHeaderActivity.ContentView implements NestedScrollingParent3 {
        private NestedScrollingParentHelper nestedScrollingParentHelper;

        public NestedFrameLayout(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNestedScroll$0() {
            try {
                RecyclerListView currentListView = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                if (currentListView == null || currentListView.getAdapter() == null) {
                    return;
                }
                currentListView.getAdapter().notifyDataSetChanged();
            } catch (Throwable unused) {
            }
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
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
                    if (((GradientHeaderActivity) StarsIntroActivity.this).listView.getHeight() - bottom >= 0) {
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
                        if (z || top >= 0) {
                            iArr[1] = i2;
                            return;
                        } else {
                            iArr[1] = i2 - Math.max(top, i2);
                            return;
                        }
                    }
                    return;
                }
                if (isSearchFieldVisible) {
                    RecyclerListView currentListView2 = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                    iArr[1] = i2;
                    if (top > 0) {
                        iArr[1] = i2 - i2;
                    }
                    if (currentListView2 == null || (i4 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i4);
                    return;
                }
                if (i2 > 0) {
                    RecyclerListView currentListView3 = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                    if (((GradientHeaderActivity) StarsIntroActivity.this).listView.getHeight() - bottom < 0 || currentListView3 == null || currentListView3.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i2;
                    ((GradientHeaderActivity) StarsIntroActivity.this).listView.stopScroll();
                }
            }
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent2
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent3
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            try {
                if (view == ((GradientHeaderActivity) StarsIntroActivity.this).listView && StarsIntroActivity.this.transactionsLayout.isAttachedToWindow()) {
                    RecyclerListView currentListView = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                    if (((GradientHeaderActivity) StarsIntroActivity.this).listView.getHeight() - ((View) StarsIntroActivity.this.transactionsLayout.getParent()).getBottom() >= 0) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$NestedFrameLayout$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.NestedFrameLayout.this.lambda$onNestedScroll$0();
                    }
                });
            }
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent2
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent2
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return i == 2;
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public void onStopNestedScroll(View view) {
        }

        @Override // org.telegram.ui.Components.NestedSizeNotifierLayout, androidx.core.view.NestedScrollingParent2
        public void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
        }
    }

    public static class StarTierView extends FrameLayout {
        private final AnimatedFloat animatedStarsCount;
        private SpannableString loading;
        private boolean needDivider;
        private final Drawable starDrawable;
        private final Drawable starDrawableOutline;
        private int starsCount;
        private final TextView textView;
        private final AnimatedTextView textView2;

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
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

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((StarTierView) view).set(uItem.intValue, uItem.text, uItem.subtext, z);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.intValue == uItem2.intValue && uItem.id == uItem2.id && TextUtils.equals(uItem.subtext, uItem2.subtext);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public StarTierView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new StarTierView(context, resourcesProvider);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }
        }

        public StarTierView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.animatedStarsCount = new AnimatedFloat(this, 0L, 500L, CubicBezierInterpolator.EASE_OUT_QUINT);
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
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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
    }

    public static class StarsBalanceView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private final AnimatedTextView amountTextView;
        private ValueAnimator bounceAnimator;
        private final int currentAccount;
        private long dialogId;
        private final TextView headerTextView;
        public long lastBalance;
        private SpannableString loadingString;

        public StarsBalanceView(Context context, int i) {
            super(context);
            this.lastBalance = -1L;
            this.currentAccount = i;
            this.dialogId = UserConfig.getInstance(i).getClientUserId();
            setOrientation(1);
            setGravity(21);
            TextView textView = new TextView(context);
            this.headerTextView = textView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2));
            textView.setTextSize(1, 13.0f);
            textView.setText(LocaleController.getString(R.string.StarsBalance));
            textView.setGravity(5);
            textView.setTypeface(AndroidUtilities.bold());
            addView(textView, LayoutHelper.createLinear(-2, -2, 5));
            final Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
            AnimatedTextView animatedTextView = new AnimatedTextView(context) { // from class: org.telegram.ui.Stars.StarsIntroActivity.StarsBalanceView.1
                @Override // android.view.View
                protected void dispatchDraw(Canvas canvas) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().getCurrentWidth()) - AndroidUtilities.dp(20.0f));
                    mutate.setBounds(measuredWidth, (getMeasuredHeight() - AndroidUtilities.dp(17.0f)) / 2, AndroidUtilities.dp(17.0f) + measuredWidth, (getMeasuredHeight() + AndroidUtilities.dp(17.0f)) / 2);
                    mutate.draw(canvas);
                    super.dispatchDraw(canvas);
                }
            };
            this.amountTextView = animatedTextView;
            animatedTextView.adaptWidth = true;
            animatedTextView.getDrawable().setHacks(false, true, true);
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setTextColor(Theme.getColor(i2));
            animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
            animatedTextView.setGravity(5);
            animatedTextView.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
            addView(animatedTextView, LayoutHelper.createLinear(-2, 20, 5, 0, -2, 0, 0));
            updateBalance(false);
            setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$bounce$0(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.amountTextView.setScaleX(floatValue);
            this.amountTextView.setScaleY(floatValue);
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
                    StarsIntroActivity.StarsBalanceView.this.lambda$bounce$0(valueAnimator2);
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

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starBalanceUpdated || (i == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.dialogId)) {
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

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), 1073741824));
        }

        public void setDialogId(long j) {
            if (this.dialogId != j) {
                this.dialogId = j;
                updateBalance(true);
            }
        }

        public void updateBalance(boolean z) {
            long j;
            boolean z2;
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
            StarsController starsController = StarsController.getInstance(this.currentAccount);
            this.amountTextView.cancelAnimation();
            boolean z3 = true;
            if (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                z2 = !starsController.balanceAvailable();
                j = starsController.getBalance().amount;
            } else {
                TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(this.currentAccount).getStarsRevenueStats(this.dialogId);
                if (starsRevenueStats != null && starsRevenueStats.status != null) {
                    z3 = false;
                }
                j = (starsRevenueStats == null || (tL_starsRevenueStatus = starsRevenueStats.status) == null) ? 0L : tL_starsRevenueStatus.current_balance.amount;
                z2 = z3;
            }
            long j2 = this.lastBalance;
            if (j > j2 && j2 != -1) {
                bounce();
            }
            if (!z2) {
                this.amountTextView.setText(LocaleController.formatNumber(j, ' '));
                this.lastBalance = j;
                return;
            }
            if (this.loadingString == null) {
                SpannableString spannableString = new SpannableString("x");
                this.loadingString = spannableString;
                spannableString.setSpan(new LoadingSpan(this.amountTextView, AndroidUtilities.dp(48.0f)), 0, this.loadingString.length(), 33);
            }
            this.amountTextView.setText(this.loadingString, z);
            this.lastBalance = -1L;
        }
    }

    public static class StarsNeededSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private final int BUTTON_EXPAND;
        private UniversalAdapter adapter;
        private boolean expanded;
        private final FireworksOverlay fireworksOverlay;
        private final FrameLayout footerView;
        private final HeaderView headerView;
        private final long starsNeeded;
        private Runnable whenPurchased;

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
                frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(NotificationCenter.closeInCallActivity, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                gLIconTextureView.setPaused(false);
                StarsBalanceView starsBalanceView = new StarsBalanceView(context, i);
                this.balanceView = starsBalanceView;
                ScaleStateListAnimator.apply(starsBalanceView);
                starsBalanceView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet$HeaderView$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarsIntroActivity.StarsNeededSheet.HeaderView.this.lambda$new$0(view);
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

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$new$0(View view) {
                BaseFragment lastFragment;
                if (this.balanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    bottomSheetParams.allowNestedScroll = false;
                    lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
                }
            }
        }

        public StarsNeededSheet(Context context, Theme.ResourcesProvider resourcesProvider, long j, int i, String str, Runnable runnable) {
            super(context, null, false, false, false, resourcesProvider);
            String str2;
            String str3;
            this.BUTTON_EXPAND = -1;
            this.topPadding = 0.2f;
            this.whenPurchased = runnable;
            fixNavigationBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i2 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i2, 0, i2, 0);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                public final void onItemClick(View view, int i3) {
                    StarsIntroActivity.StarsNeededSheet.this.lambda$new$0(view, i3);
                }
            });
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
                            if (LocaleController.nullable(LocaleController.getString(str3)) != null) {
                                str2 = str3;
                            }
                        } else {
                            str2 = i == 5 ? "StarsNeededTextReactions" : i == 6 ? "StarsNeededTextGift" : i == 12 ? "StarsNeededTextGiftChannel" : i == 13 ? "StarsNeededTextPrivateMessage" : i == 10 ? "StarsNeededTextGiftUpgrade" : i == 11 ? "StarsNeededTextGiftTransfer" : i == 9 ? "StarsNeededBizText" : "StarsNeededText";
                        }
                    }
                }
                str2 = "StarsNeededTextKeepSubscription";
            }
            if (TextUtils.isEmpty(str2)) {
                headerView.subtitleView.setText("");
            } else {
                String nullable = LocaleController.nullable(LocaleController.formatString(str2, LocaleController.getStringResId(str2), str));
                headerView.subtitleView.setText(AndroidUtilities.replaceTags(nullable == null ? LocaleController.getString(str2) : nullable));
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
            linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.StarsNeededSheet.this.lambda$new$1();
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

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            onItemClick(item, this.adapter);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1() {
            Browser.openUrl(getContext(), LocaleController.getString(R.string.StarsTOSLink));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$2(UItem uItem, Boolean bool, String str) {
            if (getContext() == null) {
                return;
            }
            if (bool.booleanValue()) {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0]))).show();
                this.fireworksOverlay.start(true);
                StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
            } else if (str != null) {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
            }
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsNeededSheet$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    StarsIntroActivity.StarsNeededSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, this.resourcesProvider);
            this.adapter = universalAdapter;
            return universalAdapter;
        }

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
                lambda$new$0();
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        /* renamed from: dismiss */
        public void lambda$new$0() {
            super.lambda$new$0();
            HeaderView headerView = this.headerView;
            if (headerView != null) {
                headerView.iconView.setPaused(true);
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet
        public void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
        
            if (r15 != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
        
            r15 = org.telegram.messenger.R.string.NotifyLessOptions;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
        
            r15 = org.telegram.messenger.R.string.NotifyMoreOptions;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00dd, code lost:
        
            if (r15 != false) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            UItem asFlicker;
            int i;
            arrayList.add(UItem.asCustom(this.headerView));
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.TelegramStarsChoose)));
            ArrayList options = StarsController.getInstance(this.currentAccount).getOptions();
            if (options == null || options.isEmpty()) {
                arrayList.add(UItem.asFlicker(31));
                arrayList.add(UItem.asFlicker(31));
                asFlicker = UItem.asFlicker(31);
            } else {
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                boolean z = false;
                int i5 = 1;
                for (int i6 = 0; i6 < options.size(); i6++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) options.get(i6);
                    if (tL_starsTopupOption.stars >= this.starsNeeded) {
                        if (tL_starsTopupOption.extended && !this.expanded && z) {
                            i4++;
                        } else {
                            arrayList.add(StarTierView.Factory.asStarTier(i6, i5, tL_starsTopupOption));
                            i3++;
                            i5++;
                            z = true;
                        }
                    }
                }
                if (i3 >= 3) {
                    if (i3 > 0) {
                        boolean z2 = this.expanded;
                        if (!z2 && i4 > 0) {
                        }
                    } else {
                        while (i2 < options.size()) {
                            arrayList.add(StarTierView.Factory.asStarTier(i2, i5, (TL_stars.TL_starsTopupOption) options.get(i2)));
                            i2++;
                            i5++;
                        }
                    }
                    arrayList.add(UItem.asCustom(this.footerView));
                }
                arrayList.clear();
                arrayList.add(UItem.asCustom(this.headerView));
                arrayList.add(UItem.asHeader(LocaleController.getString(R.string.TelegramStarsChoose)));
                int i7 = 0;
                for (int i8 = 0; i8 < options.size(); i8++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) options.get(i8);
                    if (tL_starsTopupOption2.stars >= this.starsNeeded) {
                        arrayList.add(StarTierView.Factory.asStarTier(i8, i5, tL_starsTopupOption2));
                        i7++;
                        i5++;
                    }
                }
                if (i7 == 0) {
                    while (i2 < options.size()) {
                        arrayList.add(StarTierView.Factory.asStarTier(i2, i5, (TL_stars.TL_starsTopupOption) options.get(i2)));
                        i2++;
                        i5++;
                    }
                    boolean z3 = this.expanded;
                    if (!z3 && i4 > 0) {
                    }
                } else {
                    this.expanded = true;
                }
                arrayList.add(UItem.asCustom(this.footerView));
                asFlicker = ExpandView.Factory.asExpand(-1, LocaleController.getString(i), !this.expanded).accent();
            }
            arrayList.add(asFlicker);
            arrayList.add(UItem.asCustom(this.footerView));
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected CharSequence getTitle() {
            HeaderView headerView = this.headerView;
            if (headerView == null) {
                return null;
            }
            return headerView.titleView.getText();
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
                        StarsIntroActivity.StarsNeededSheet.this.lambda$onItemClick$2(uItem, (Boolean) obj, (String) obj2);
                    }
                });
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
        public void show() {
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
    }

    public static class StarsOptionsSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private final int BUTTON_EXPAND;
        private UniversalAdapter adapter;
        private boolean expanded;
        private final FireworksOverlay fireworksOverlay;
        private final FrameLayout footerView;

        public StarsOptionsSheet(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, null, false, false, false, resourcesProvider);
            this.BUTTON_EXPAND = -1;
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsOptionsSheet$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                public final void onItemClick(View view, int i2) {
                    StarsIntroActivity.StarsOptionsSheet.this.lambda$new$0(view, i2);
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
                    StarsIntroActivity.StarsOptionsSheet.this.lambda$new$1();
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

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            onItemClick(item, this.adapter);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1() {
            Browser.openUrl(getContext(), LocaleController.getString(R.string.StarsTOSLink));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$2(UItem uItem, Boolean bool, String str) {
            if (getContext() == null) {
                return;
            }
            lambda$new$0();
            StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
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

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if ((i == NotificationCenter.starOptionsLoaded || i == NotificationCenter.starBalanceUpdated) && (universalAdapter = this.adapter) != null) {
                universalAdapter.update(true);
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet
        public void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            UItem asFlicker;
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
                    asFlicker = ExpandView.Factory.asExpand(-1, LocaleController.getString(z ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions), !this.expanded).accent();
                }
                arrayList.add(UItem.asCustom(this.footerView));
            }
            arrayList.add(UItem.asFlicker(31));
            arrayList.add(UItem.asFlicker(31));
            arrayList.add(UItem.asFlicker(31));
            arrayList.add(UItem.asFlicker(31));
            asFlicker = UItem.asFlicker(31);
            arrayList.add(asFlicker);
            arrayList.add(UItem.asCustom(this.footerView));
        }

        @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
        protected CharSequence getTitle() {
            return LocaleController.getString(R.string.StarsBuy);
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
                        StarsIntroActivity.StarsOptionsSheet.this.lambda$onItemClick$2(uItem, (Boolean) obj, (String) obj2);
                    }
                });
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

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asSubscription(TL_stars.StarsSubscription starsSubscription) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = starsSubscription;
                return ofFactory;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((StarsSubscriptionView) view).set((TL_stars.StarsSubscription) uItem.object, z);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public StarsSubscriptionView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                StarsSubscriptionView starsSubscriptionView = (StarsSubscriptionView) getCached();
                return starsSubscriptionView != null ? starsSubscriptionView : new StarsSubscriptionView(context, i, resourcesProvider);
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

        @Override // android.widget.LinearLayout, android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.threeLines ? 68.0f : 58.0f), 1073741824));
        }

        public void set(TL_stars.StarsSubscription starsSubscription, boolean z) {
            boolean z2;
            String str;
            TextView textView;
            String str2;
            int i;
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            this.threeLines = !TextUtils.isEmpty(starsSubscription.title);
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            if (peerDialogId < 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerDialogId));
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(chat);
                this.imageView.setForUserOrChat(chat, avatarDrawable);
                str = chat != null ? chat.title : null;
                z2 = false;
            } else {
                TLRPC.User user = messagesController.getUser(Long.valueOf(peerDialogId));
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
            if (TextUtils.isEmpty(starsSubscription.title)) {
                this.productView.setVisibility(8);
            } else {
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
            }
            this.subtitleView.setTextSize(1, this.threeLines ? 13.0f : 14.0f);
            if (starsSubscription.canceled || starsSubscription.bot_canceled) {
                TextView textView2 = this.subtitleView;
                long j = starsSubscription.until_date;
                textView2.setText(LocaleController.formatString(j < currentTime ? R.string.StarsSubscriptionExpired : R.string.StarsSubscriptionExpires, LocaleController.formatDateChat(j)));
                this.priceTitleView.setVisibility(8);
                this.priceSubtitleView.setTextColor(Theme.getColor(Theme.key_color_red, this.resourcesProvider));
                this.priceSubtitleView.setText(LocaleController.getString(starsSubscription.bot_canceled ? z2 ? R.string.StarsSubscriptionStatusBizCancelled : R.string.StarsSubscriptionStatusBotCancelled : R.string.StarsSubscriptionStatusCancelled));
            } else {
                long j2 = starsSubscription.until_date;
                if (j2 < currentTime) {
                    this.subtitleView.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j2)));
                    this.priceTitleView.setVisibility(8);
                    this.priceSubtitleView.setTextColor(Theme.getColor(Theme.key_color_red, this.resourcesProvider));
                    textView = this.priceSubtitleView;
                    i = R.string.StarsSubscriptionStatusExpired;
                } else {
                    this.subtitleView.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j2)));
                    this.priceTitleView.setVisibility(0);
                    this.priceTitleView.setText(StarsIntroActivity.replaceStarsWithPlain("⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f));
                    this.priceSubtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider));
                    int i2 = starsSubscription.pricing.period;
                    if (i2 == 2592000) {
                        textView = this.priceSubtitleView;
                        i = R.string.StarsParticipantSubscriptionPerMonth;
                    } else {
                        if (i2 == 60) {
                            textView = this.priceSubtitleView;
                            str2 = "per minute";
                        } else if (i2 == 300) {
                            textView = this.priceSubtitleView;
                            str2 = "per 5 minutes";
                        }
                        textView.setText(str2);
                    }
                }
                str2 = LocaleController.getString(i);
                textView.setText(str2);
            }
            this.needDivider = z;
            setWillNotDraw(!z);
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

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asTransaction(TL_stars.StarsTransaction starsTransaction, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = starsTransaction;
                ofFactory.accent = z;
                return ofFactory;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((StarsTransactionView) view).set((TL_stars.StarsTransaction) uItem.object, uItem.accent, z);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public StarsTransactionView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                StarsTransactionView starsTransactionView = (StarsTransactionView) getCached();
                return starsTransactionView != null ? starsTransactionView : new StarsTransactionView(context, i, resourcesProvider);
            }
        }

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

        @Override // android.widget.LinearLayout, android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.threeLines ? 71.0f : 58.0f), 1073741824));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:223:0x04f9  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x05f2  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void set(TL_stars.StarsTransaction starsTransaction, boolean z, boolean z2) {
            TextView textView;
            CharSequence concat;
            Runnable runnable;
            int i;
            BackupImageView backupImageView;
            String str;
            CombinedDrawable platformDrawable;
            boolean z3;
            String str2;
            ImageLocation imageLocation;
            ImageLocation forDocument;
            TextView textView2;
            int i2;
            CharSequence formatString;
            TextView textView3;
            String str3;
            long j;
            TextView textView4;
            CharSequence concat2;
            long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
            int i3 = starsTransaction.flags;
            boolean z4 = (131072 & i3) == 0 && (i3 & 65536) != 0;
            boolean z5 = !(peerDialogId == 0 || starsTransaction.stargift_upgrade) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
            this.threeLines = z5;
            this.titleTextViewParams.bottomMargin = z5 ? 0 : AndroidUtilities.dp(4.33f);
            this.subtitleTextView.setVisibility(this.threeLines ? 0 : 8);
            this.dateTextView.setTextSize(1, this.threeLines ? 13.0f : 14.0f);
            this.dateTextView.setText(LocaleController.formatShortDateTime(starsTransaction.date));
            if (starsTransaction.refund) {
                textView = this.dateTextView;
                concat = TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsRefunded));
            } else {
                if (!starsTransaction.failed) {
                    if (starsTransaction.pending) {
                        textView = this.dateTextView;
                        concat = TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsPending));
                    }
                    runnable = this.cancelCurrentGift;
                    if (runnable != null) {
                        runnable.run();
                        this.cancelCurrentGift = null;
                    }
                    this.imageView.setTranslationX(0.0f);
                    this.imageView.setTranslationY(0.0f);
                    this.imageView2.setVisibility(8);
                    this.imageView.setRoundRadius(AndroidUtilities.dp(46.0f));
                    if (!starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
                        this.imageView.setImageDrawable(new StarGiftSheet.StarGiftDrawableIcon(this.imageView, starsTransaction.stargift, 46, 0.25f));
                        this.titleTextView.setText(LocaleController.getString(R.string.Gift2TransactionUpgraded));
                        this.subtitleTextView.setVisibility(8);
                    } else {
                        if (peerDialogId != 0) {
                            i = 8;
                            if (starsTransaction.floodskip) {
                                this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionFloodskip));
                                this.subtitleTextView.setText(LocaleController.formatPluralStringComma("StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                                backupImageView = this.imageView;
                                str = "api";
                            } else {
                                TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                                    this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                                    backupImageView = this.imageView;
                                    str = "ios";
                                } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                                    this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                                    backupImageView = this.imageView;
                                    str = "android";
                                } else {
                                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                                        if (starsTransaction.gift) {
                                            this.titleTextView.setText(LocaleController.getString(R.string.StarsGiftReceived));
                                            this.subtitleTextView.setText(LocaleController.getString(R.string.StarsTransactionUnknown));
                                            this.subtitleTextView.setVisibility(0);
                                        } else {
                                            this.titleTextView.setText(LocaleController.getString((z || (!starsTransaction.refund ? !starsTransaction.stars.negative() : !starsTransaction.stars.positive())) ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                                        }
                                        backupImageView = this.imageView;
                                        platformDrawable = getPlatformDrawable("fragment");
                                        backupImageView.setImageDrawable(platformDrawable);
                                        TL_stars.StarsAmount starsAmount = starsTransaction.stars;
                                        j = starsAmount.amount;
                                        if (j <= 0 || (j == 0 && starsAmount.nanos > 0)) {
                                            this.amountTextView.setVisibility(0);
                                            this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_green));
                                            textView4 = this.amountTextView;
                                            concat2 = TextUtils.concat("+", StarsIntroActivity.formatStarsAmount(starsTransaction.stars), " ", this.star);
                                        } else if (j >= 0 && (j != 0 || starsAmount.nanos >= 0)) {
                                            this.amountTextView.setVisibility(i);
                                            this.needDivider = z2;
                                            setWillNotDraw(!z2);
                                            return;
                                        } else {
                                            this.amountTextView.setVisibility(0);
                                            this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_red));
                                            textView4 = this.amountTextView;
                                            concat2 = TextUtils.concat(StarsIntroActivity.formatStarsAmount(starsTransaction.stars), " ", this.star);
                                        }
                                        textView4.setText(concat2);
                                        this.needDivider = z2;
                                        setWillNotDraw(!z2);
                                        return;
                                    }
                                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                        this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionBot));
                                        backupImageView = this.imageView;
                                        str = "premiumbot";
                                    } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                                        this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                                        backupImageView = this.imageView;
                                        str = "?";
                                    } else {
                                        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds)) {
                                            this.titleTextView.setText("");
                                            this.imageView.setImageDrawable(null);
                                            TL_stars.StarsAmount starsAmount2 = starsTransaction.stars;
                                            j = starsAmount2.amount;
                                            if (j <= 0) {
                                            }
                                            this.amountTextView.setVisibility(0);
                                            this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_green));
                                            textView4 = this.amountTextView;
                                            concat2 = TextUtils.concat("+", StarsIntroActivity.formatStarsAmount(starsTransaction.stars), " ", this.star);
                                            textView4.setText(concat2);
                                            this.needDivider = z2;
                                            setWillNotDraw(!z2);
                                            return;
                                        }
                                        this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionAds));
                                        backupImageView = this.imageView;
                                        str = "ads";
                                    }
                                }
                            }
                            platformDrawable = getPlatformDrawable(str);
                            backupImageView.setImageDrawable(platformDrawable);
                            TL_stars.StarsAmount starsAmount22 = starsTransaction.stars;
                            j = starsAmount22.amount;
                            if (j <= 0) {
                            }
                            this.amountTextView.setVisibility(0);
                            this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_green));
                            textView4 = this.amountTextView;
                            concat2 = TextUtils.concat("+", StarsIntroActivity.formatStarsAmount(starsTransaction.stars), " ", this.star);
                            textView4.setText(concat2);
                            this.needDivider = z2;
                            setWillNotDraw(!z2);
                            return;
                        }
                        if (UserObject.isService(peerDialogId)) {
                            str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                            this.imageView.setImageDrawable(getPlatformDrawable("fragment"));
                            z3 = false;
                        } else if (peerDialogId >= 0) {
                            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                            z3 = user == null;
                            this.avatarDrawable.setInfo(user);
                            this.imageView.setForUserOrChat(user, this.avatarDrawable);
                            str2 = UserObject.getUserName(user);
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                            z3 = chat == null;
                            this.avatarDrawable.setInfo(chat);
                            this.imageView.setForUserOrChat(chat, this.avatarDrawable);
                            str2 = chat == null ? "" : chat.title;
                        }
                        if (starsTransaction.stargift != null) {
                            ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(this.subtitleTextView, this.currentAccount, 16.0f);
                            imageReceiverSpan.setRoundRadius(4.0f);
                            imageReceiverSpan.enableShadow(false);
                            SpannableString spannableString = new SpannableString("x");
                            spannableString.setSpan(imageReceiverSpan, 0, 1, 33);
                            StarsIntroActivity.setGiftImage(imageReceiverSpan.imageReceiver, starsTransaction.stargift, 16);
                            this.titleTextView.setText(str2);
                            if (starsTransaction.stargift_resale) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(starsTransaction.stargift.getDocument(), this.subtitleTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(!starsTransaction.stars.negative() ? starsTransaction.refund ? R.string.StarGiftTransactionGiftPurchaseRefund : R.string.StarGiftTransactionGiftSale : starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftPurchase));
                                str3 = spannableStringBuilder;
                                textView3 = this.subtitleTextView;
                                textView3.setText(str3);
                            } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                                textView2 = this.subtitleTextView;
                                i2 = starsTransaction.refund ? R.string.StarGiftTransactionGiftTransferRefund : R.string.StarGiftTransactionGiftTransfer;
                                formatString = LocaleController.getString(i2);
                                textView2.setText(formatString);
                            } else {
                                if (starsTransaction.refund) {
                                    textView2 = this.subtitleTextView;
                                    formatString = TextUtils.concat(spannableString, " ", LocaleController.getString(starsTransaction.stars.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted));
                                } else {
                                    textView2 = this.subtitleTextView;
                                    formatString = TextUtils.concat(spannableString, " ", LocaleController.getString(starsTransaction.stars.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent));
                                }
                                textView2.setText(formatString);
                            }
                        } else {
                            if (starsTransaction.subscription) {
                                this.titleTextView.setText(str2);
                                int i4 = starsTransaction.subscription_period;
                                if (i4 == 2592000) {
                                    this.subtitleTextView.setVisibility(0);
                                    textView2 = this.subtitleTextView;
                                    i2 = R.string.StarsTransactionSubscriptionMonthly;
                                } else {
                                    String str4 = i4 == 300 ? "5 minutes" : "Minute";
                                    this.subtitleTextView.setVisibility(0);
                                    TextView textView5 = this.subtitleTextView;
                                    str3 = String.format(Locale.US, "%s subscription fee", str4);
                                    textView3 = textView5;
                                    textView3.setText(str3);
                                }
                            } else {
                                if (starsTransaction.paid_message) {
                                    this.titleTextView.setText(str2);
                                    this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                                    textView2 = this.subtitleTextView;
                                    formatString = LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages);
                                } else if (starsTransaction.premium_gift) {
                                    this.titleTextView.setText(str2);
                                    this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                                    textView2 = this.subtitleTextView;
                                    i2 = R.string.StarsTransactionPremiumGift;
                                } else if (z4) {
                                    this.titleTextView.setText(str2);
                                    this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                                    textView2 = this.subtitleTextView;
                                    formatString = LocaleController.formatString(R.string.StarTransactionCommission, AffiliateProgramFragment.percents(starsTransaction.starref_commission_permille));
                                } else if (starsTransaction.gift) {
                                    this.titleTextView.setText(str2);
                                    this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                                    textView2 = this.subtitleTextView;
                                    i2 = R.string.StarsGiftReceived;
                                } else if ((starsTransaction.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                                    this.titleTextView.setText(str2);
                                    this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                                    textView2 = this.subtitleTextView;
                                    i2 = R.string.StarsGiveawayPrizeReceived;
                                } else if (starsTransaction.reaction) {
                                    this.titleTextView.setText(str2);
                                    this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                                    textView2 = this.subtitleTextView;
                                    i2 = R.string.StarsReactionsSent;
                                } else if (!starsTransaction.extended_media.isEmpty()) {
                                    if (z) {
                                        this.titleTextView.setText(str2);
                                        this.subtitleTextView.setVisibility(0);
                                        this.subtitleTextView.setText(LocaleController.getString(R.string.StarMediaPurchase));
                                    } else {
                                        this.titleTextView.setText(LocaleController.getString(R.string.StarMediaPurchase));
                                        this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                                        this.subtitleTextView.setText(str2);
                                    }
                                    this.imageViewCount = 0;
                                    int i5 = 0;
                                    while (i5 < Math.min(2, starsTransaction.extended_media.size())) {
                                        TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i5);
                                        BackupImageView backupImageView2 = i5 == 0 ? this.imageView : this.imageView2;
                                        backupImageView2.setRoundRadius(AndroidUtilities.dp(12.0f));
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                            forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(46.0f), true), messageMedia.photo);
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                            forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(46.0f), true), messageMedia.document);
                                        } else {
                                            imageLocation = null;
                                            backupImageView2.setVisibility(0);
                                            backupImageView2.setImage(imageLocation, "46_46", (ImageLocation) null, (String) null, (Drawable) null, (Object) 0);
                                            this.imageViewCount++;
                                            i5++;
                                        }
                                        imageLocation = forDocument;
                                        backupImageView2.setVisibility(0);
                                        backupImageView2.setImage(imageLocation, "46_46", (ImageLocation) null, (String) null, (Drawable) null, (Object) 0);
                                        this.imageViewCount++;
                                        i5++;
                                    }
                                    int i6 = 0;
                                    while (i6 < this.imageViewCount) {
                                        BackupImageView backupImageView3 = i6 == 0 ? this.imageView : this.imageView2;
                                        float f = i6;
                                        backupImageView3.setTranslationX(AndroidUtilities.dp(2.0f) + ((f - (this.imageViewCount / 2.0f)) * AndroidUtilities.dp(4.33f)));
                                        backupImageView3.setTranslationY((f - (this.imageViewCount / 2.0f)) * AndroidUtilities.dp(4.33f));
                                        i6++;
                                    }
                                } else if (starsTransaction.photo != null) {
                                    ImageReceiverSpan imageReceiverSpan2 = new ImageReceiverSpan(this.subtitleTextView, this.currentAccount, 14.0f);
                                    imageReceiverSpan2.setRoundRadius(4.0f);
                                    imageReceiverSpan2.enableShadow(false);
                                    SpannableString spannableString2 = new SpannableString("x");
                                    spannableString2.setSpan(imageReceiverSpan2, 0, 1, 33);
                                    imageReceiverSpan2.imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "14_14", null, null, 0, 0);
                                    this.titleTextView.setText(str2);
                                    this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                                    TextView textView6 = this.subtitleTextView;
                                    String str5 = starsTransaction.title;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    textView6.setText(Emoji.replaceEmoji(TextUtils.concat(spannableString2, " ", str5), this.subtitleTextView.getPaint().getFontMetricsInt(), false));
                                } else {
                                    this.titleTextView.setText(str2);
                                    this.subtitleTextView.setVisibility(z3 ? 8 : 0);
                                    TextView textView7 = this.subtitleTextView;
                                    String str6 = starsTransaction.title;
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    textView7.setText(Emoji.replaceEmoji(str6, textView7.getPaint().getFontMetricsInt(), false));
                                }
                                textView2.setText(formatString);
                            }
                            formatString = LocaleController.getString(i2);
                            textView2.setText(formatString);
                        }
                    }
                    i = 8;
                    TL_stars.StarsAmount starsAmount222 = starsTransaction.stars;
                    j = starsAmount222.amount;
                    if (j <= 0) {
                    }
                    this.amountTextView.setVisibility(0);
                    this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_green));
                    textView4 = this.amountTextView;
                    concat2 = TextUtils.concat("+", StarsIntroActivity.formatStarsAmount(starsTransaction.stars), " ", this.star);
                    textView4.setText(concat2);
                    this.needDivider = z2;
                    setWillNotDraw(!z2);
                    return;
                }
                textView = this.dateTextView;
                concat = TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsFailed));
            }
            textView.setText(concat);
            runnable = this.cancelCurrentGift;
            if (runnable != null) {
            }
            this.imageView.setTranslationX(0.0f);
            this.imageView.setTranslationY(0.0f);
            this.imageView2.setVisibility(8);
            this.imageView.setRoundRadius(AndroidUtilities.dp(46.0f));
            if (!starsTransaction.stargift_upgrade) {
            }
            if (peerDialogId != 0) {
            }
        }
    }

    public static class StarsTransactionsLayout extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private final PageAdapter adapter;
        private final long bot_id;
        private final int currentAccount;
        private final ViewPagerFixed.TabsView tabsView;
        private final ViewPagerFixed viewPager;

        public static class Page extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
            private final long bot_id;
            private final int currentAccount;
            private final UniversalRecyclerView listView;
            private final Runnable loadTransactionsRunnable;
            private final Theme.ResourcesProvider resourcesProvider;
            private final int type;

            public Page(Context context, final long j, final int i, final int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                this.type = i;
                this.currentAccount = i2;
                this.bot_id = j;
                this.resourcesProvider = resourcesProvider;
                this.loadTransactionsRunnable = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$StarsTransactionsLayout$Page$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.StarsTransactionsLayout.Page.lambda$new$0(j, i2, i);
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

            /* JADX INFO: Access modifiers changed from: private */
            public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
                if (this.bot_id != 0) {
                    BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
                    Iterator it = botStarsController.getTransactions(this.bot_id, this.type).iterator();
                    while (it.hasNext()) {
                        arrayList.add(StarsTransactionView.Factory.asTransaction((TL_stars.StarsTransaction) it.next(), true));
                    }
                    if (botStarsController.didFullyLoadTransactions(this.bot_id, this.type)) {
                        return;
                    }
                } else {
                    StarsController starsController = StarsController.getInstance(this.currentAccount);
                    Iterator it2 = starsController.transactions[this.type].iterator();
                    while (it2.hasNext()) {
                        arrayList.add(StarsTransactionView.Factory.asTransaction((TL_stars.StarsTransaction) it2.next(), false));
                    }
                    if (starsController.didFullyLoadTransactions(this.type)) {
                        return;
                    }
                }
                arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                arrayList.add(UItem.asFlicker(arrayList.size(), 7));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$new$0(long j, int i, int i2) {
                if (j != 0) {
                    BotStarsController.getInstance(i).loadTransactions(j, i2);
                } else {
                    StarsController.getInstance(i).loadTransactions(i2);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void onClick(UItem uItem, View view, int i, float f, float f2) {
                if (uItem.object instanceof TL_stars.StarsTransaction) {
                    StarsIntroActivity.showTransactionSheet(getContext(), false, 0L, this.currentAccount, (TL_stars.StarsTransaction) uItem.object, this.resourcesProvider);
                }
            }

            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public void didReceivedNotification(int i, int i2, Object... objArr) {
                if (i != NotificationCenter.starTransactionsLoaded) {
                    if (i == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.bot_id) {
                        this.listView.adapter.update(true);
                        return;
                    }
                    return;
                }
                this.listView.adapter.update(true);
                if (!this.listView.canScrollVertically(1) || isLoadingVisible()) {
                    this.loadTransactionsRunnable.run();
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

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, this.bot_id != 0 ? NotificationCenter.botStarsTransactionsLoaded : NotificationCenter.starTransactionsLoaded);
                this.listView.adapter.update(false);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, this.bot_id != 0 ? NotificationCenter.botStarsTransactionsLoaded : NotificationCenter.starTransactionsLoaded);
            }
        }

        private static class PageAdapter extends ViewPagerFixed.Adapter {
            private final long bot_id;
            private final int classGuid;
            private final Context context;
            private final int currentAccount;
            private final ArrayList items = new ArrayList();
            private final Theme.ResourcesProvider resourcesProvider;

            public PageAdapter(Context context, int i, long j, int i2, Theme.ResourcesProvider resourcesProvider) {
                this.context = context;
                this.currentAccount = i;
                this.classGuid = i2;
                this.resourcesProvider = resourcesProvider;
                this.bot_id = j;
                fill();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public void bindView(View view, int i, int i2) {
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public View createView(int i) {
                return new Page(this.context, this.bot_id, i, this.currentAccount, this.classGuid, this.resourcesProvider);
            }

            public void fill() {
                this.items.clear();
                long j = this.bot_id;
                int i = this.currentAccount;
                if (j == 0) {
                    StarsController starsController = StarsController.getInstance(i);
                    this.items.add(UItem.asSpace(0));
                    if (starsController.hasTransactions(1)) {
                        this.items.add(UItem.asSpace(1));
                    }
                    if (!starsController.hasTransactions(2)) {
                        return;
                    }
                } else {
                    BotStarsController botStarsController = BotStarsController.getInstance(i);
                    this.items.add(UItem.asSpace(0));
                    if (botStarsController.hasTransactions(this.bot_id, 1)) {
                        this.items.add(UItem.asSpace(1));
                    }
                    if (!botStarsController.hasTransactions(this.bot_id, 2)) {
                        return;
                    }
                }
                this.items.add(UItem.asSpace(2));
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemCount() {
                return this.items.size();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public String getItemTitle(int i) {
                int i2;
                int itemViewType = getItemViewType(i);
                if (itemViewType == 0) {
                    i2 = R.string.StarsTransactionsAll;
                } else if (itemViewType == 1) {
                    i2 = R.string.StarsTransactionsIncoming;
                } else {
                    if (itemViewType != 2) {
                        return "";
                    }
                    i2 = R.string.StarsTransactionsOutgoing;
                }
                return LocaleController.getString(i2);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemViewType(int i) {
                if (i < 0 || i >= this.items.size()) {
                    return 0;
                }
                return ((UItem) this.items.get(i)).intValue;
            }
        }

        public StarsTransactionsLayout(Context context, int i, long j, int i2, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.bot_id = j;
            setOrientation(1);
            ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context);
            this.viewPager = viewPagerFixed;
            PageAdapter pageAdapter = new PageAdapter(context, i, j, i2, resourcesProvider);
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

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starTransactionsLoaded) {
                this.adapter.fill();
                this.viewPager.fillTabs(true);
            }
        }

        public RecyclerListView getCurrentListView() {
            View currentView = this.viewPager.getCurrentView();
            if (currentView instanceof Page) {
                return ((Page) currentView).listView;
            }
            return null;
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
    }

    public StarsIntroActivity() {
        setWhiteBackground(true);
    }

    public static void addAvailabilityRow(TableView tableView, int i, TL_stars.StarGift starGift, Theme.ResourcesProvider resourcesProvider) {
        CharSequence formatPluralStringComma;
        int i2;
        String str;
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
                    StarsIntroActivity.lambda$addAvailabilityRow$102(textView, (TL_stars.StarGift) obj);
                }
            });
            return;
        }
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            int i3 = starGift.availability_remains;
            if (i3 > 0) {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i3, LocaleController.formatNumber(starGift.availability_total, ','));
                textView.setText(formatPluralStringComma);
            } else {
                i2 = starGift.availability_total;
                str = "Gift2Availability2ValueNone";
                formatPluralStringComma = LocaleController.formatPluralStringComma(str, i2);
                textView.setText(formatPluralStringComma);
            }
        }
        if (starGift.availability_remains <= 0) {
            i2 = starGift.availability_total;
            str = "Gift2QuantityIssuedNone";
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, i2);
            textView.setText(formatPluralStringComma);
        }
        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
        textView.setText(formatPluralStringComma);
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
            public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f, (r12 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f + this.layout.getCurrentWidth(), (AndroidUtilities.dp(20.0f) + r12) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.backgroundPaint);
                this.layout.draw(canvas, f + AndroidUtilities.dp(6.0f), (i3 + i5) / 2.0f, this.val$color, 1.0f);
            }

            @Override // android.text.style.ReplacementSpan
            public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                return (int) (AndroidUtilities.dp(12.0f) + this.layout.getCurrentWidth());
            }
        }, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public static CharSequence formatStarsAmount(TL_stars.StarsAmount starsAmount) {
        return formatStarsAmount(starsAmount, 0.777f, ',');
    }

    public static CharSequence formatStarsAmount(TL_stars.StarsAmount starsAmount, float f, char c) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        long j = starsAmount.amount;
        int i = starsAmount.nanos;
        boolean z = false;
        long j2 = ((i >= 0 || j <= 0) ? (i <= 0 || j >= 0) ? 0 : 1 : -1) + j;
        if (j != 0 ? j < 0 : i < 0) {
            z = true;
        }
        if (i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "-" : "");
            sb.append(LocaleController.formatNumber(Math.abs(j2), c));
            spannableStringBuilder.append((CharSequence) sb.toString());
            if (floatFormat == null) {
                floatFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = floatFormat;
            int i2 = starsAmount.nanos;
            double d = i2;
            if (i2 < 0) {
                Double.isNaN(d);
                d += 1.0E9d;
            }
            String format = decimalFormat.format(d / 1.0E9d);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format.substring(indexOf));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f), length + 1, spannableStringBuilder.length(), 33);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "-" : "");
            sb2.append(LocaleController.formatNumber(Math.abs(j2), ' '));
            spannableStringBuilder.append((CharSequence) sb2.toString());
        }
        return spannableStringBuilder;
    }

    public static CharSequence formatStarsAmountShort(TL_stars.StarsAmount starsAmount) {
        return formatStarsAmountShort(starsAmount, 0.777f, ' ');
    }

    public static CharSequence formatStarsAmountShort(TL_stars.StarsAmount starsAmount, float f, char c) {
        StringBuilder sb;
        String formatWholeNumber;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        long j = starsAmount.amount;
        int i = starsAmount.nanos;
        long j2 = ((i >= 0 || j <= 0) ? (i <= 0 || j >= 0) ? 0 : 1 : -1) + j;
        boolean z = j != 0 ? j < 0 : i < 0;
        if (Math.abs(j2) > 1000 || starsAmount.nanos == 0) {
            if (starsAmount.amount <= 1000) {
                sb = new StringBuilder();
                sb.append(z ? "-" : "");
                formatWholeNumber = LocaleController.formatNumber(Math.abs(j2), c);
            } else {
                sb = new StringBuilder();
                sb.append(z ? "-" : "");
                formatWholeNumber = AndroidUtilities.formatWholeNumber((int) Math.abs(j2), 0);
            }
            sb.append(formatWholeNumber);
            spannableStringBuilder.append((CharSequence) sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "-" : "");
            sb2.append(LocaleController.formatNumber(Math.abs(j2), c));
            spannableStringBuilder.append((CharSequence) sb2.toString());
            if (floatFormat == null) {
                floatFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = floatFormat;
            int i2 = starsAmount.nanos;
            double d = i2;
            if (i2 < 0) {
                Double.isNaN(d);
                d += 1.0E9d;
            }
            String format = decimalFormat.format(d / 1.0E9d);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                int length = spannableStringBuilder.length();
                String substring = format.substring(indexOf);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        long j = starsAmount.amount;
        int i = starsAmount.nanos;
        boolean z = false;
        long j2 = ((i >= 0 || j <= 0) ? (i <= 0 || j >= 0) ? 0 : 1 : -1) + j;
        if (j != 0 ? j < 0 : i < 0) {
            z = true;
        }
        if (i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "-" : "");
            sb.append(LocaleController.formatNumber(Math.abs(j2), c));
            spannableStringBuilder.append((CharSequence) sb.toString());
            if (floatFormat == null) {
                floatFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = floatFormat;
            int i2 = starsAmount.nanos;
            double d = i2;
            if (i2 < 0) {
                Double.isNaN(d);
                d += 1.0E9d;
            }
            String format = decimalFormat.format(d / 1.0E9d);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format.substring(indexOf));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f), length + 1, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StarsNano));
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", (int) j));
        }
        return spannableStringBuilder;
    }

    public static String getGiftStarsEmoji(long j) {
        return j <= 1000 ? "2⃣" : j < 2500 ? "3⃣" : "4⃣";
    }

    public static String getPremiumGiftMonthsEmoji(int i) {
        return i != 3 ? i != 6 ? i != 12 ? i != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣";
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0147, code lost:
    
        r5 = org.telegram.messenger.R.string.StarsTransactionFragment;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence getTransactionTitle(int i, boolean z, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.premium_gift) {
            return LocaleController.getString(R.string.StarsTransactionPremiumGift);
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
        int i2 = starsTransaction.flags;
        if ((131072 & i2) == 0 && (65536 & i2) != 0) {
            return LocaleController.formatString(R.string.StarTransactionCommission, AffiliateProgramFragment.percents(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.refund) {
                return LocaleController.getString(starsTransaction.stars.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted);
            }
            return LocaleController.getString(starsTransaction.stars.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent);
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
        if ((i2 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
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
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? LocaleController.getString(R.string.StarsTransactionBot) : LocaleController.getString(R.string.StarsTransactionUnsupported);
        }
        if (!z) {
            if (starsTransaction.refund) {
            }
            return LocaleController.getString(r5);
        }
        int i4 = R.string.StarsTransactionWithdrawFragment;
        return LocaleController.getString(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addAvailabilityRow$102(TextView textView, TL_stars.StarGift starGift) {
        int i;
        String formatPluralStringComma;
        String str;
        if (starGift == null) {
            return;
        }
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            int i2 = starGift.availability_remains;
            i = starGift.availability_total;
            if (i2 > 0) {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i2, LocaleController.formatNumber(i, ','));
                textView.setText(formatPluralStringComma);
            } else {
                str = "Gift2Availability2ValueNone";
                formatPluralStringComma = LocaleController.formatPluralStringComma(str, i);
                textView.setText(formatPluralStringComma);
            }
        }
        if (starGift.availability_remains <= 0) {
            i = starGift.availability_total;
            str = "Gift2QuantityIssuedNone";
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, i);
            textView.setText(formatPluralStringComma);
        }
        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
        textView.setText(formatPluralStringComma);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createView$0(Context context) {
        new ExplainStarsSheet(context).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$1(View view, int i) {
        UItem item;
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter == null || (item = universalAdapter.getItem(i)) == null) {
            return;
        }
        onItemClick(item, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$2(Context context, View view) {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
        } else {
            new StarsOptionsSheet(context, this.resourceProvider).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3(Context context, View view) {
        new StarsOptionsSheet(context, this.resourceProvider).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$4(View view) {
        presentFragment(new BotStarsActivity(0, getUserConfig().getClientUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$5(View view) {
        StarsController.getInstance(this.currentAccount).getGiftOptions();
        UserSelectorBottomSheet.open(1, 0L, BirthdayController.getInstance(this.currentAccount).getState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemClick$8(UItem uItem, Boolean bool, String str) {
        if (getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0]))).show();
            this.fireworksOverlay.start(true);
            StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
        } else if (str != null) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openConfirmPurchaseSheet$10(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openConfirmPurchaseSheet$11(BottomSheet bottomSheet, ButtonWithCounterView buttonWithCounterView) {
        bottomSheet.setCanDismissWithSwipe(false);
        buttonWithCounterView.setLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openConfirmPurchaseSheet$12(final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, Boolean bool) {
        if (bool.booleanValue()) {
            bottomSheet.lambda$new$0();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda74
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$openConfirmPurchaseSheet$11(BottomSheet.this, buttonWithCounterView);
                }
            }, 400L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openConfirmPurchaseSheet$13(Utilities.Callback callback, final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, View view) {
        if (callback == null) {
            bottomSheet.lambda$new$0();
            return;
        }
        bottomSheet.setCanDismissWithSwipe(false);
        buttonWithCounterView.setLoading(true);
        callback.run(new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda59
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarsIntroActivity.lambda$openConfirmPurchaseSheet$12(BottomSheet.this, buttonWithCounterView, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openConfirmPurchaseSheet$14(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openConfirmPurchaseSheet$9(StarsBalanceView starsBalanceView, View view) {
        BaseFragment lastFragment;
        if (starsBalanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openStarsChannelInviteSheet$15(StarsBalanceView starsBalanceView, View view) {
        BaseFragment lastFragment;
        if (starsBalanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openStarsChannelInviteSheet$16(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.StarsSubscribeInfoLink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openStarsChannelInviteSheet$17(BottomSheet bottomSheet, ButtonWithCounterView buttonWithCounterView) {
        bottomSheet.setCanDismissWithSwipe(false);
        buttonWithCounterView.setLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openStarsChannelInviteSheet$18(final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, Boolean bool) {
        if (bool.booleanValue()) {
            bottomSheet.lambda$new$0();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda101
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$openStarsChannelInviteSheet$17(BottomSheet.this, buttonWithCounterView);
                }
            }, 400L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openStarsChannelInviteSheet$19(Utilities.Callback callback, final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, View view) {
        if (callback == null) {
            bottomSheet.lambda$new$0();
            return;
        }
        bottomSheet.setCanDismissWithSwipe(false);
        buttonWithCounterView.setLoading(true);
        callback.run(new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda98
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarsIntroActivity.lambda$openStarsChannelInviteSheet$18(BottomSheet.this, buttonWithCounterView, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openStarsChannelInviteSheet$20(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setGiftImage$21(int i, String str, ImageReceiver imageReceiver, final boolean[] zArr) {
        TLRPC.Document document;
        String str2 = UserConfig.getInstance(i).premiumGiftsStickerPack;
        if (str2 == null) {
            MediaDataController.getInstance(i).checkPremiumGiftStickers();
            return;
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
        if (document == null) {
            MediaDataController.getInstance(i).loadStickersByEmojiOrName(str2, false, tL_messages_stickerSet == null);
            return;
        }
        imageReceiver.setAllowStartLottieAnimation(true);
        imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity.7
            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                RLottieDrawable lottieAnimation;
                if (!z || (lottieAnimation = imageReceiver2.getLottieAnimation()) == null || zArr[0]) {
                    return;
                }
                lottieAnimation.setCurrentFrame(0, false);
                AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(lottieAnimation));
                zArr[0] = true;
            }

            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public /* synthetic */ void didSetImageBitmap(int i4, String str3, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.-CC.$default$didSetImageBitmap(this, i4, str3, drawable);
            }

            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.-CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
        Drawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, NotificationCenter.audioRecordTooShort, true, null, true);
        imageReceiver.setAutoRepeat(0);
        imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setGiftImage$24(Runnable runnable, Runnable runnable2) {
        runnable.run();
        runnable2.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBoostsSheet$78(BottomSheet[] bottomSheetArr, long j) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(ChatActivity.of(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBoostsSheet$79(BottomSheet[] bottomSheetArr, long j, TL_stories.Boost boost) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(ChatActivity.of(j, boost.giveaway_msg_id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBoostsSheet$80(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBoostsSheet$81(BottomSheet[] bottomSheetArr, View view) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showGiftResellPriceSheet$100(BottomSheet[] bottomSheetArr, final EditTextBoldCursor editTextBoldCursor) {
        bottomSheetArr[0].setFocusable(true);
        editTextBoldCursor.requestFocus();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda96
            @Override // java.lang.Runnable
            public final void run() {
                AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showGiftResellPriceSheet$94(OutlineTextContainerView outlineTextContainerView, EditTextBoldCursor editTextBoldCursor, View view, boolean z) {
        outlineTextContainerView.animateSelection(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showGiftResellPriceSheet$95(BottomSheet[] bottomSheetArr) {
        bottomSheetArr[0].lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showGiftResellPriceSheet$96(boolean[] zArr, Utilities.Callback2 callback2, ButtonWithCounterView buttonWithCounterView, EditTextBoldCursor editTextBoldCursor, long j, OutlineTextContainerView outlineTextContainerView, final BottomSheet[] bottomSheetArr, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        if (zArr[0]) {
            return true;
        }
        if (callback2 != null) {
            zArr[0] = true;
            buttonWithCounterView.setLoading(true);
            long parseLong = Long.parseLong(editTextBoldCursor.getText().toString());
            if (parseLong < j) {
                AndroidUtilities.shakeViewSpring(outlineTextContainerView);
                return true;
            }
            callback2.run(Long.valueOf(parseLong), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda99
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showGiftResellPriceSheet$95(bottomSheetArr);
                }
            });
        } else {
            bottomSheetArr[0].lambda$new$0();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showGiftResellPriceSheet$97(BottomSheet[] bottomSheetArr) {
        bottomSheetArr[0].lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showGiftResellPriceSheet$98(boolean[] zArr, Utilities.Callback2 callback2, ButtonWithCounterView buttonWithCounterView, EditTextBoldCursor editTextBoldCursor, long j, OutlineTextContainerView outlineTextContainerView, final BottomSheet[] bottomSheetArr, View view) {
        if (zArr[0]) {
            return;
        }
        if (callback2 == null) {
            bottomSheetArr[0].lambda$new$0();
            return;
        }
        zArr[0] = true;
        buttonWithCounterView.setLoading(true);
        long parseLong = Long.parseLong(editTextBoldCursor.getText().toString());
        if (parseLong < j) {
            AndroidUtilities.shakeViewSpring(outlineTextContainerView);
        } else {
            callback2.run(Long.valueOf(parseLong), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda100
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showGiftResellPriceSheet$97(bottomSheetArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showMediaPriceSheet$83(OutlineTextContainerView outlineTextContainerView, EditTextBoldCursor editTextBoldCursor, View view, boolean z) {
        outlineTextContainerView.animateSelection(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showMediaPriceSheet$84(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.PaidContentInfoLink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showMediaPriceSheet$85(EditTextBoldCursor editTextBoldCursor, BottomSheet[] bottomSheetArr) {
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        bottomSheetArr[0].lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showMediaPriceSheet$86(boolean[] zArr, Utilities.Callback2 callback2, ButtonWithCounterView buttonWithCounterView, final EditTextBoldCursor editTextBoldCursor, final BottomSheet[] bottomSheetArr, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        if (zArr[0]) {
            return true;
        }
        if (callback2 != null) {
            zArr[0] = true;
            buttonWithCounterView.setLoading(true);
            callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor.getText().toString())), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda81
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showMediaPriceSheet$85(EditTextBoldCursor.this, bottomSheetArr);
                }
            });
        } else {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            bottomSheetArr[0].lambda$new$0();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showMediaPriceSheet$87(EditTextBoldCursor editTextBoldCursor, BottomSheet[] bottomSheetArr) {
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        bottomSheetArr[0].lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showMediaPriceSheet$88(boolean[] zArr, Utilities.Callback2 callback2, final EditTextBoldCursor editTextBoldCursor, ButtonWithCounterView buttonWithCounterView, final BottomSheet[] bottomSheetArr, View view) {
        if (zArr[0]) {
            return;
        }
        if (callback2 == null) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            bottomSheetArr[0].lambda$new$0();
        } else {
            String obj = editTextBoldCursor.getText().toString();
            zArr[0] = true;
            buttonWithCounterView.setLoading(true);
            callback2.run(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda77
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showMediaPriceSheet$87(EditTextBoldCursor.this, bottomSheetArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showMediaPriceSheet$89(boolean[] zArr, EditTextBoldCursor editTextBoldCursor, BottomSheet[] bottomSheetArr) {
        zArr[0] = false;
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        bottomSheetArr[0].lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showMediaPriceSheet$90(final boolean[] zArr, Utilities.Callback2 callback2, ButtonWithCounterView buttonWithCounterView, final EditTextBoldCursor editTextBoldCursor, final BottomSheet[] bottomSheetArr, View view) {
        if (zArr[0]) {
            return;
        }
        if (callback2 == null) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            bottomSheetArr[0].lambda$new$0();
        } else {
            zArr[0] = true;
            buttonWithCounterView.setLoading(true);
            callback2.run(0L, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda73
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showMediaPriceSheet$89(zArr, editTextBoldCursor, bottomSheetArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showMediaPriceSheet$93(BottomSheet[] bottomSheetArr, final EditTextBoldCursor editTextBoldCursor) {
        bottomSheetArr[0].setFocusable(true);
        editTextBoldCursor.requestFocus();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda82
            @Override // java.lang.Runnable
            public final void run() {
                AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSoldOutGiftSheet$101(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$60(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$61(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, int i, long j) {
        buttonWithCounterView.setLoading(false);
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
        }
        StarsController.getInstance(i).invalidateSubscriptions(true);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(ChatActivity.of(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$62(final ButtonWithCounterView buttonWithCounterView, final BottomSheet[] bottomSheetArr, final int i, final long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda95
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showSubscriptionSheet$61(ButtonWithCounterView.this, bottomSheetArr, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$63(final ButtonWithCounterView buttonWithCounterView, TL_stars.StarsSubscription starsSubscription, final int i, final BottomSheet[] bottomSheetArr, final long j) {
        buttonWithCounterView.setLoading(true);
        TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
        tL_fulfillStarsSubscription.subscription_id = starsSubscription.id;
        tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        ConnectionsManager.getInstance(i).sendRequest(tL_fulfillStarsSubscription, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda93
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsIntroActivity.lambda$showSubscriptionSheet$62(ButtonWithCounterView.this, bottomSheetArr, i, j, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$64(final ButtonWithCounterView buttonWithCounterView, final int i, final TL_stars.StarsSubscription starsSubscription, final BottomSheet[] bottomSheetArr, final long j, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, String str, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        StarsController starsController = StarsController.getInstance(i);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda78
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showSubscriptionSheet$63(ButtonWithCounterView.this, starsSubscription, i, bottomSheetArr, j);
            }
        };
        if (starsController.balance.amount < starsSubscription.pricing.amount) {
            new StarsNeededSheet(context, resourcesProvider, starsSubscription.pricing.amount, z ? 8 : j < 0 ? 2 : 7, str, runnable).show();
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$65(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, int i, TLObject tLObject, String str) {
        buttonWithCounterView.setLoading(false);
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
        }
        StarsController.getInstance(i).invalidateSubscriptions(true);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createUsersBulletin(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str))).show(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$66(final ButtonWithCounterView buttonWithCounterView, final BottomSheet[] bottomSheetArr, final int i, final TLObject tLObject, final String str, TLObject tLObject2, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda83
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showSubscriptionSheet$65(ButtonWithCounterView.this, bottomSheetArr, i, tLObject, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$67(final ButtonWithCounterView buttonWithCounterView, TL_stars.StarsSubscription starsSubscription, final int i, final BottomSheet[] bottomSheetArr, final TLObject tLObject, final String str, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
        tL_changeStarsSubscription.canceled = Boolean.FALSE;
        tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        tL_changeStarsSubscription.subscription_id = starsSubscription.id;
        ConnectionsManager.getInstance(i).sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda75
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                StarsIntroActivity.lambda$showSubscriptionSheet$66(ButtonWithCounterView.this, bottomSheetArr, i, tLObject, str, tLObject2, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$68(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, int i, boolean z, TL_stars.StarsSubscription starsSubscription, boolean z2, TLObject tLObject) {
        buttonWithCounterView.setLoading(false);
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
        }
        StarsController.getInstance(i).invalidateSubscriptions(true);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createUsersBulletin(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags((!z || TextUtils.isEmpty(starsSubscription.title)) ? (!z2 || TextUtils.isEmpty(starsSubscription.title)) ? LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date)) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title))).show(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$69(final ButtonWithCounterView buttonWithCounterView, final BottomSheet[] bottomSheetArr, final int i, final boolean z, final TL_stars.StarsSubscription starsSubscription, final boolean z2, final TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda94
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showSubscriptionSheet$68(ButtonWithCounterView.this, bottomSheetArr, i, z, starsSubscription, z2, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$70(final ButtonWithCounterView buttonWithCounterView, final TL_stars.StarsSubscription starsSubscription, final int i, final BottomSheet[] bottomSheetArr, final boolean z, final boolean z2, final TLObject tLObject, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
        tL_changeStarsSubscription.canceled = Boolean.TRUE;
        tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        tL_changeStarsSubscription.subscription_id = starsSubscription.id;
        ConnectionsManager.getInstance(i).sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda79
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                StarsIntroActivity.lambda$showSubscriptionSheet$69(ButtonWithCounterView.this, bottomSheetArr, i, z, starsSubscription, z2, tLObject, tLObject2, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$71(BaseFragment baseFragment, long j, TLRPC.Chat chat) {
        BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j, chat.title))).show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$72(Long l, int i, final long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        final ChatActivity of = ChatActivity.of(l.longValue());
        safeLastFragment.presentFragment(of);
        final TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-l.longValue()));
        if (chat != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda103
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showSubscriptionSheet$71(BaseFragment.this, j, chat);
                }
            }, 250L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$73(final int i, final long j, String str, final Long l) {
        if (!"paid".equals(str) || l.longValue() == 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda102
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showSubscriptionSheet$72(l, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$74(ButtonWithCounterView buttonWithCounterView, TLObject tLObject, BottomSheet[] bottomSheetArr, Theme.ResourcesProvider resourcesProvider, final int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        buttonWithCounterView.setLoading(false);
        if (!(tLObject instanceof TLRPC.ChatInvite)) {
            BulletinFactory.of(bottomSheetArr[0].topBulletinContainer, resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.LinkHashExpired)).show(false);
            return;
        }
        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
        if (tL_starsSubscriptionPricing == null) {
            BulletinFactory.of(bottomSheetArr[0].topBulletinContainer, resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show(false);
        } else {
            final long j = tL_starsSubscriptionPricing.amount;
            StarsController.getInstance(i).subscribeTo(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda97
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    StarsIntroActivity.lambda$showSubscriptionSheet$73(i, j, (String) obj, (Long) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$75(final ButtonWithCounterView buttonWithCounterView, final BottomSheet[] bottomSheetArr, final Theme.ResourcesProvider resourcesProvider, final int i, final TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda88
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showSubscriptionSheet$74(ButtonWithCounterView.this, tLObject, bottomSheetArr, resourcesProvider, i, tL_messages_checkChatInvite);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$76(final ButtonWithCounterView buttonWithCounterView, TL_stars.StarsSubscription starsSubscription, final int i, final BottomSheet[] bottomSheetArr, final Theme.ResourcesProvider resourcesProvider, boolean[] zArr, Context context, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        if (starsSubscription.chat_invite_hash != null) {
            final TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
            tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_checkChatInvite, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda76
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsIntroActivity.lambda$showSubscriptionSheet$75(ButtonWithCounterView.this, bottomSheetArr, resourcesProvider, i, tL_messages_checkChatInvite, tLObject, tL_error);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSubscriptionSheet$77(int i, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, DialogInterface dialogInterface) {
        NotificationCenter.getInstance(i).removeObserver(notificationCenterDelegate, NotificationCenter.starSubscriptionsLoaded);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$25(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, View view) {
        Browser.openUrl(context, "https://" + MessagesController.getInstance(i).linkPrefix + "/nft/" + tL_starGiftUnique.slug);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$26(boolean z, long j, TL_stars.StarsTransaction starsTransaction, int i, Theme.ResourcesProvider resourcesProvider, final BackupImageView backupImageView, final LinearLayout linearLayout, View view) {
        final long peerDialogId = z ? j : DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < starsTransaction.extended_media.size(); i2++) {
            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i2);
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = starsTransaction.msg_id;
            tL_message.dialog_id = peerDialogId;
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            tL_message.from_id = tL_peerChannel;
            long j2 = -peerDialogId;
            tL_peerChannel.channel_id = j2;
            TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
            tL_message.peer_id = tL_peerChannel2;
            tL_peerChannel2.channel_id = j2;
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
        PhotoViewer.getInstance().openPhoto(arrayList, 0, peerDialogId, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider() { // from class: org.telegram.ui.Stars.StarsIntroActivity.9
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
                placeProviderObject.viewY = iArr[1] - (Build.VERSION.SDK_INT >= 21 ? 0 : AndroidUtilities.statusBarHeight);
                placeProviderObject.parentView = linearLayout;
                placeProviderObject.animatingImageView = null;
                placeProviderObject.imageReceiver = imageReceiver;
                if (z2) {
                    placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                }
                placeProviderObject.radius = imageReceiver.getRoundRadius(true);
                placeProviderObject.dialogId = peerDialogId;
                placeProviderObject.clipTopAddition = 0;
                placeProviderObject.clipBottomAddition = 0;
                return placeProviderObject;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$27(long j, int i) {
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
            bundle.putInt("type", 3);
            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
            chatUsersActivity.setInfo(MessagesController.getInstance(i).getChatFull(j2));
            safeLastFragment.presentFragment(chatUsersActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$28(Context context, BottomSheet[] bottomSheetArr) {
        BottomSheet bottomSheet;
        BaseFragment baseFragment;
        StarAppsSheet starAppsSheet = new StarAppsSheet(context);
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(bottomSheetArr[0].attachedFragment) && (bottomSheet = bottomSheetArr[0]) != null && (baseFragment = bottomSheet.attachedFragment) != null) {
            starAppsSheet.makeAttached(baseFragment);
        }
        starAppsSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$29(int i, Context context, Theme.ResourcesProvider resourcesProvider, TL_stars.SavedStarGift savedStarGift) {
        new StarGiftSheet(context, i, UserConfig.getInstance(i).getClientUserId(), resourcesProvider).set(savedStarGift, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$30(ButtonSpan.TextViewButtons textViewButtons, final int i, final Context context, final Theme.ResourcesProvider resourcesProvider, final TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textViewButtons.getText());
            spannableStringBuilder.append((CharSequence) " ").append(ButtonSpan.make(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda52
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showTransactionSheet$29(i, context, resourcesProvider, savedStarGift);
                }
            }, resourcesProvider));
            textViewButtons.setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$31(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$32(Context context, int i, String str) {
        Browser.openUrl(context, "https://" + MessagesController.getInstance(i).linkPrefix + "/nft/" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$33(BottomSheet[] bottomSheetArr, long j, long j2) {
        bottomSheetArr[0].lambda$new$0();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$34(BottomSheet[] bottomSheetArr, long j, long j2) {
        bottomSheetArr[0].lambda$new$0();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$35(BottomSheet[] bottomSheetArr, TL_stars.StarsTransaction starsTransaction, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment((starsTransaction.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0 ? ChatActivity.of(j, starsTransaction.giveaway_post_id) : ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$36(Context context, int i, long j, BottomSheet[] bottomSheetArr) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        Objects.requireNonNull(bottomSheet);
        new GiftSheet(context, i, j, new BottomSheet$$ExternalSyntheticLambda11(bottomSheet)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$37(BottomSheet[] bottomSheetArr, int i) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
            bundle.putBoolean("my_profile", true);
            bundle.putBoolean("open_gifts", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$38(BottomSheet[] bottomSheetArr, int i) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
            bundle.putBoolean("my_profile", true);
            bundle.putBoolean("open_gifts", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$39(BottomSheet[] bottomSheetArr, TL_stars.StarsTransaction starsTransaction, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment((starsTransaction.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0 ? ChatActivity.of(j, starsTransaction.giveaway_post_id) : ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$40(Context context, int i, long j, BottomSheet[] bottomSheetArr) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        Objects.requireNonNull(bottomSheet);
        new GiftSheet(context, i, j, new BottomSheet$$ExternalSyntheticLambda11(bottomSheet)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$41(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$42(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(new AffiliateProgramFragment(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$43(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$44(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$45(BottomSheet[] bottomSheetArr, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider, TL_payments.connectedBotStarRef connectedbotstarref) {
        bottomSheetArr[0].lambda$new$0();
        ChannelAffiliateProgramsFragment.showShareAffiliateAlert(context, i, connectedbotstarref, j, resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$46(final int i, final Context context, final long j, long j2, final BottomSheet[] bottomSheetArr, final Theme.ResourcesProvider resourcesProvider) {
        BotStarsController.getInstance(i).getConnectedBot(context, j, j2, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda41
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarsIntroActivity.lambda$showTransactionSheet$45(bottomSheetArr, context, i, j, resourcesProvider, (TL_payments.connectedBotStarRef) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$47(BottomSheet[] bottomSheetArr, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$48(BottomSheet[] bottomSheetArr, TL_stars.StarsTransaction starsTransaction, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment((starsTransaction.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0 ? ChatActivity.of(j, starsTransaction.giveaway_post_id) : ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$49(BottomSheet[] bottomSheetArr, int i) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", UserConfig.getInstance(i).getClientUserId());
            bundle.putBoolean("my_profile", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$50(BottomSheet[] bottomSheetArr, TL_stars.StarsTransaction starsTransaction, long j) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment((starsTransaction.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0 ? ChatActivity.of(j, starsTransaction.giveaway_post_id) : ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$51(BottomSheet[] bottomSheetArr, long j, Context context) {
        bottomSheetArr[0].lambda$new$0();
        if (UserObject.isService(j)) {
            Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$52(BottomSheet[] bottomSheetArr, long j, Context context) {
        bottomSheetArr[0].lambda$new$0();
        if (UserObject.isService(j)) {
            Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$53(BottomSheet[] bottomSheetArr, long j, Context context) {
        bottomSheetArr[0].lambda$new$0();
        if (UserObject.isService(j)) {
            Browser.openUrl(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$54(BottomSheet[] bottomSheetArr, long j, TL_stars.StarsTransaction starsTransaction) {
        bottomSheetArr[0].lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            bundle.putInt("message_id", starsTransaction.msg_id);
            safeLastFragment.presentFragment(new ChatActivity(bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$56(BottomSheet[] bottomSheetArr, Theme.ResourcesProvider resourcesProvider) {
        BulletinFactory.of(bottomSheetArr[0].topBulletinContainer, resourcesProvider).createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.StarsTransactionIDCopied)).show(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$57(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$58(Context context, TL_stars.StarsTransaction starsTransaction, View view) {
        Browser.openUrl(context, starsTransaction.transaction_url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTransactionSheet$59(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateButtonsLayouts$6(boolean z) {
        if (z) {
            this.oneButtonsLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateButtonsLayouts$7(boolean z) {
        if (z) {
            return;
        }
        this.twoButtonsLayout.setVisibility(8);
    }

    public static StarParticlesView makeParticlesView(Context context, int i, int i2) {
        return new 4(context, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0402  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BottomSheet openConfirmPurchaseSheet(final Context context, Theme.ResourcesProvider resourcesProvider, int i, MessageObject messageObject, long j, String str, long j2, TLRPC.WebDocument webDocument, int i2, final Utilities.Callback callback, final Runnable runnable) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i3;
        String str2;
        SpannableStringBuilder replaceTags;
        boolean z;
        SpannableStringBuilder replaceStars;
        TLRPC.Message message;
        String str3;
        boolean z2;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i4;
        int i5;
        int i6;
        String formatPluralString;
        int i7;
        String formatPluralString2;
        String str4;
        char c;
        String formatPluralString3;
        char c2;
        String formatPluralString4;
        boolean z3;
        int i8;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message2;
        BackupImageView backupImageView;
        FrameLayout frameLayout;
        ImageLocation imageLocation;
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(makeParticlesView(context, 40, 0), LayoutHelper.createFrame(-1, -1.0f));
        if (messageObject == null || (message2 = messageObject.messageOwner) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            viewGroup = frameLayout2;
            viewGroup2 = linearLayout;
            if (webDocument == null) {
                BackupImageView backupImageView2 = new BackupImageView(context);
                backupImageView2.setRoundRadius(AndroidUtilities.dp(80.0f));
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(user2);
                backupImageView2.setForUserOrChat(user2, avatarDrawable);
                viewGroup.addView(backupImageView2, LayoutHelper.createFrame(80, 80, 17));
            } else {
                FrameLayout frameLayout3 = new FrameLayout(context);
                BackupImageView backupImageView3 = new BackupImageView(context);
                backupImageView3.setRoundRadius(AndroidUtilities.dp(18.0f));
                backupImageView3.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "80_80", (Drawable) null, 0, (Object) null);
                frameLayout3.addView(backupImageView3, LayoutHelper.createFrame(80, 80, 48));
                viewGroup.addView(frameLayout3, LayoutHelper.createFrame(80, 87, 17));
                TextView textView = new TextView(context);
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(-1);
                textView.setText(replaceStars("XTR " + LocaleController.formatNumber((int) j2, ','), 0.85f));
                textView.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
                textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), -1133566));
                FrameLayout frameLayout4 = new FrameLayout(context);
                frameLayout4.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), Theme.getColor(Theme.key_dialogBackground, resourcesProvider)));
                frameLayout4.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                frameLayout4.addView(textView, LayoutHelper.createLinear(-2, 16, 119));
                frameLayout3.addView(frameLayout4, LayoutHelper.createFrame(-2.0f, 18.66f, 81));
            }
        } else {
            BackupImageView backupImageView4 = new BackupImageView(context, context) { // from class: org.telegram.ui.Stars.StarsIntroActivity.6
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
                        this.spoilerEffect2.draw(canvas, this, getWidth(), getHeight(), 1.0f);
                        canvas.restore();
                    }
                    this.lock.setBounds((getWidth() - this.lock.getIntrinsicWidth()) / 2, (getHeight() - this.lock.getIntrinsicHeight()) / 2, (getWidth() + this.lock.getIntrinsicWidth()) / 2, (getHeight() + this.lock.getIntrinsicHeight()) / 2);
                    this.lock.draw(canvas);
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
            backupImageView4.setRoundRadius(AndroidUtilities.dp(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                backupImageView = backupImageView4;
                frameLayout = frameLayout2;
                viewGroup2 = linearLayout;
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
                backupImageView = backupImageView4;
                frameLayout = frameLayout2;
                viewGroup2 = linearLayout;
                backupImageView4.setImage(imageLocation, "80_80_b2", (ImageLocation) null, (String) null, (Drawable) null, messageObject);
            }
            viewGroup = frameLayout;
            viewGroup.addView(backupImageView, LayoutHelper.createFrame(80, 80, 17));
        }
        final StarsBalanceView starsBalanceView = new StarsBalanceView(context, i);
        ScaleStateListAnimator.apply(starsBalanceView);
        starsBalanceView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$openConfirmPurchaseSheet$9(StarsIntroActivity.StarsBalanceView.this, view);
            }
        });
        viewGroup.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        ViewGroup viewGroup3 = viewGroup2;
        viewGroup3.addView(viewGroup, LayoutHelper.createLinear(-1, 117, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        int i9 = Theme.key_dialogTextBlack;
        textView2.setTextColor(Theme.getColor(i9, resourcesProvider));
        if (i2 > 0) {
            if (webDocument == null) {
                i3 = R.string.StarsConfirmSubscriptionTitle;
                str2 = LocaleController.getString(i3);
            }
            str2 = str;
        } else {
            if (webDocument == null) {
                i3 = R.string.StarsConfirmPurchaseTitle;
                str2 = LocaleController.getString(i3);
            }
            str2 = str;
        }
        textView2.setText(Emoji.replaceEmoji(str2, textView2.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setGravity(17);
        viewGroup3.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, webDocument != null ? -8 : 8, 0, 0));
        if (webDocument != null) {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider)));
            BackupImageView backupImageView5 = new BackupImageView(context);
            backupImageView5.setRoundRadius(AndroidUtilities.dp(14.0f));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(user2);
            backupImageView5.setForUserOrChat(user2, avatarDrawable2);
            linearLayout2.addView(backupImageView5, LayoutHelper.createLinear(28, 28));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            textView3.setText(UserObject.getUserName(user2));
            linearLayout2.addView(textView3, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 10, 0));
            viewGroup3.addView(linearLayout2, LayoutHelper.createLinear(-2, 28, 1, 0, 8, 0, 2));
        }
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(Theme.getColor(i9, resourcesProvider));
        if (messageObject == null || (message = messageObject.messageOwner) == null || !(message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            replaceTags = AndroidUtilities.replaceTags(i2 > 0 ? LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j2, str, UserObject.getUserName(user2)) : LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j2, str, UserObject.getUserName(user2)));
        } else {
            long dialogId = messageObject.getDialogId();
            TLRPC.Message message3 = messageObject.messageOwner;
            if (message3 != null && (messageFwdHeader = message3.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                dialogId = DialogObject.getPeerDialogId(peer);
            }
            if (dialogId < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(i).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                dialogId = user.id;
            }
            MessagesController messagesController = MessagesController.getInstance(i);
            if (dialogId >= 0) {
                TLRPC.User user3 = messagesController.getUser(Long.valueOf(dialogId));
                str3 = UserObject.getUserName(user3);
                if (user3 != null && user3.bot) {
                    z2 = true;
                    tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
                    i4 = 0;
                    i5 = 0;
                    int i10 = 0;
                    while (i4 < tL_messageMediaPaidMedia.extended_media.size()) {
                        TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i4);
                        if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                            if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).flags & 4) != 0) {
                                z3 = true;
                            }
                            z3 = false;
                        } else {
                            if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                                z3 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media instanceof TLRPC.TL_messageMediaDocument;
                            }
                            z3 = false;
                        }
                        if (z3) {
                            i8 = 1;
                            i5++;
                        } else {
                            i8 = 1;
                            i10++;
                        }
                        i4 += i8;
                    }
                    if (i5 != 0) {
                        str4 = z2 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        int i11 = (int) j2;
                        if (i10 == 1) {
                            formatPluralString4 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                            c2 = 0;
                        } else {
                            c2 = 0;
                            formatPluralString4 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i10, new Object[0]);
                        }
                        Object[] objArr = new Object[2];
                        objArr[c2] = formatPluralString4;
                        objArr[1] = str3;
                        formatPluralString2 = LocaleController.formatPluralString(str4, i11, objArr);
                    } else if (i10 == 0) {
                        str4 = z2 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        int i12 = (int) j2;
                        if (i5 == 1) {
                            formatPluralString3 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                            c = 0;
                        } else {
                            c = 0;
                            formatPluralString3 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i5, new Object[0]);
                        }
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = formatPluralString3;
                        objArr2[1] = str3;
                        formatPluralString2 = LocaleController.formatPluralString(str4, i12, objArr2);
                    } else {
                        String str5 = z2 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                        int i13 = (int) j2;
                        if (i10 == 1) {
                            formatPluralString = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                            i7 = 1;
                            i6 = 0;
                        } else {
                            i6 = 0;
                            formatPluralString = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i10, new Object[0]);
                            i7 = 1;
                        }
                        String string = i5 == i7 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i5, new Object[i6]);
                        Object[] objArr3 = new Object[3];
                        objArr3[i6] = formatPluralString;
                        objArr3[i7] = string;
                        objArr3[2] = str3;
                        formatPluralString2 = LocaleController.formatPluralString(str5, i13, objArr3);
                    }
                    replaceTags = AndroidUtilities.replaceTags(formatPluralString2);
                }
            } else {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialogId));
                str3 = chat == null ? "" : chat.title;
            }
            z2 = false;
            tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            i4 = 0;
            i5 = 0;
            int i102 = 0;
            while (i4 < tL_messageMediaPaidMedia.extended_media.size()) {
            }
            if (i5 != 0) {
            }
            replaceTags = AndroidUtilities.replaceTags(formatPluralString2);
        }
        textView4.setText(replaceTags);
        textView4.setMaxWidth(HintView2.cutInFancyHalf(textView4.getText(), textView4.getPaint()));
        textView4.setGravity(17);
        viewGroup3.addView(textView4, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 18));
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        if (i2 > 0) {
            replaceStars = replaceStars(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j2)));
            z = false;
        } else {
            z = false;
            replaceStars = replaceStars(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j2)));
        }
        buttonWithCounterView.setText(replaceStars, z);
        viewGroup3.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i2 > 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$openConfirmPurchaseSheet$10(context);
            }
        }));
        linksTextView.setGravity(17);
        viewGroup3.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 0.0f, 2.0f));
        builder.setCustomView(viewGroup3);
        final BottomSheet create = builder.create();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$openConfirmPurchaseSheet$13(Utilities.Callback.this, create, buttonWithCounterView, view);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda46
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StarsIntroActivity.lambda$openConfirmPurchaseSheet$14(runnable, dialogInterface);
            }
        });
        create.fixNavigationBar();
        create.show();
        return create;
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
        final StarsBalanceView starsBalanceView = new StarsBalanceView(context, i);
        ScaleStateListAnimator.apply(starsBalanceView);
        starsBalanceView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$openStarsChannelInviteSheet$15(StarsIntroActivity.StarsBalanceView.this, view);
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
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda85
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$openStarsChannelInviteSheet$16(context);
            }
        }));
        linksTextView.setGravity(17);
        linksTextView.setTextSize(1, 13.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 49, 14, 14, 14, 6));
        builder.setCustomView(linearLayout);
        final BottomSheet create = builder.create();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$openStarsChannelInviteSheet$19(Utilities.Callback.this, create, buttonWithCounterView, view);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda87
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StarsIntroActivity.lambda$openStarsChannelInviteSheet$20(runnable, dialogInterface);
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

    public static SpannableStringBuilder replaceStars(CharSequence charSequence) {
        return replaceStars(charSequence, 1.13f);
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, float f) {
        return replaceStars(charSequence, f, null);
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr) {
        return replaceStars(charSequence, f, coloredImageSpanArr, 0.0f, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr, float f2, float f3, float f4) {
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("⭐ ");
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            coloredImageSpan = new ColoredImageSpan(R.drawable.msg_premium_liststar);
            if (coloredImageSpanArr != null) {
                coloredImageSpanArr[0] = coloredImageSpan;
            }
        }
        coloredImageSpan.translate(f2, f3);
        coloredImageSpan.spaceScaleX = f4;
        coloredImageSpan.setScale(f, f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, ColoredImageSpan[] coloredImageSpanArr) {
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            coloredImageSpan = new ColoredImageSpan(R.drawable.msg_premium_liststar);
            coloredImageSpan.setScale(1.13f, 1.13f);
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
        return replaceStarsWithPlain(charSequence, f, null);
    }

    public static SpannableStringBuilder replaceStarsWithPlain(CharSequence charSequence, float f, ColoredImageSpan[] coloredImageSpanArr) {
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("⭐ ");
        if (coloredImageSpanArr == null || (coloredImageSpan = coloredImageSpanArr[0]) == null) {
            if (coloredImageSpanArr == null || coloredImageSpanArr.length <= 0) {
                coloredImageSpan = new ColoredImageSpan(R.drawable.star_small_inner);
            } else {
                coloredImageSpan = new ColoredImageSpan(R.drawable.star_small_inner);
                coloredImageSpanArr[0] = coloredImageSpan;
            }
        }
        coloredImageSpan.recolorDrawable = false;
        coloredImageSpan.setScale(f, f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static Runnable setGiftImage(View view, ImageReceiver imageReceiver, long j) {
        return setGiftImage(view, imageReceiver, getGiftStarsEmoji(j));
    }

    public static Runnable setGiftImage(View view, final ImageReceiver imageReceiver, final String str) {
        final boolean[] zArr = new boolean[1];
        final int currentAccount = imageReceiver.getCurrentAccount();
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$setGiftImage$21(currentAccount, str, imageReceiver, zArr);
            }
        };
        runnable.run();
        final Runnable listen = NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda49
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                runnable.run();
            }
        });
        final Runnable listen2 = NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda50
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                runnable.run();
            }
        });
        return new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda51
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$setGiftImage$24(listen, listen2);
            }
        };
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

    public static Runnable setPremiumGiftImage(View view, ImageReceiver imageReceiver, int i) {
        return setGiftImage(view, imageReceiver, getPremiumGiftMonthsEmoji(i));
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
        frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(NotificationCenter.closeInCallActivity, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
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
                StarsIntroActivity.lambda$showBoostsSheet$78(bottomSheetArr, j);
            }
        });
        tableView.addRow(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]));
        if (boost.giveaway_msg_id != 0) {
            tableView.addRowLink(LocaleController.getString(R.string.BoostReason), LocaleController.getString(R.string.BoostReasonGiveaway), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda55
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showBoostsSheet$79(bottomSheetArr, j, boost);
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
                StarsIntroActivity.lambda$showBoostsSheet$80(context);
            }
        }));
        linksTextView.setGravity(17);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 14.0f, 15.0f, 14.0f, 7.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$showBoostsSheet$81(bottomSheetArr, view);
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

    public static BottomSheet showGiftResellPriceSheet(Context context, int i, long j, final Utilities.Callback2 callback2, final Theme.ResourcesProvider resourcesProvider) {
        final long j2 = MessagesController.getInstance(i).starsStargiftResaleAmountMin;
        final long j3 = MessagesController.getInstance(i).starsStargiftResaleAmountMax;
        final int i2 = MessagesController.getInstance(i).starsStargiftResaleCommisionPermille;
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.ResellGiftTitle));
        textView.setTextSize(1, 20.0f);
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i3, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 4.0f, 0.0f, 4.0f, 14.0f));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, resourcesProvider);
        outlineTextContainerView.setForceForceUseCenter(true);
        outlineTextContainerView.setText(LocaleController.getString(R.string.ResellGiftPriceTitle));
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(Theme.getColor(i3, resourcesProvider));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
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
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda89
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                StarsIntroActivity.lambda$showGiftResellPriceSheet$94(OutlineTextContainerView.this, editTextBoldCursor, view, z);
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
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 14.0f, 3.0f, 14.0f, 21.0f));
        final LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        float f = i2 / 1000.0f;
        linksTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("ResellGiftInfo", (int) (j2 * f))));
        linksTextView.setTextSize(1, 12.0f);
        int i4 = Theme.key_windowBackgroundWhiteGrayText2;
        linksTextView.setTextColor(Theme.getColor(i4, resourcesProvider));
        int i5 = Theme.key_chat_messageLinkIn;
        linksTextView.setLinkTextColor(Theme.getColor(i5, resourcesProvider));
        linksTextView.setGravity(3);
        frameLayout.addView(linksTextView, LayoutHelper.createFrame(-1, -1, 19));
        final LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context);
        linksTextView2.setTextSize(1, 12.0f);
        linksTextView2.setTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(i5, resourcesProvider));
        linksTextView2.setGravity(5);
        frameLayout.addView(linksTextView2, LayoutHelper.createFrame(-1, -1, 21));
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.ResellGiftButton), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
        builder.setCustomView(linearLayout);
        final BottomSheet[] bottomSheetArr = {builder.create()};
        editTextBoldCursor.setText(Long.toString(j));
        linksTextView2.setAlpha(1.0f);
        StringBuilder sb = new StringBuilder();
        sb.append("≈");
        BillingController billingController = BillingController.getInstance();
        double d = j * f;
        Double.isNaN(d);
        double d2 = MessagesController.getInstance(UserConfig.selectedAccount).starsUsdWithdrawRate1000;
        Double.isNaN(d2);
        sb.append(billingController.formatCurrency((long) ((d / 1000.0d) * d2), "USD"));
        linksTextView2.setText(sb.toString());
        editTextBoldCursor.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.Stars.StarsIntroActivity.17
            private boolean ignore;
            private int shakeDp = 2;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                long j4;
                LinkSpanDrawable.LinksTextView linksTextView3;
                String formatPluralStringComma;
                if (this.ignore) {
                    return;
                }
                try {
                    j4 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                    long j5 = j3;
                    if (j4 > j5) {
                        this.ignore = true;
                        editTextBoldCursor.setText(Long.toString(j5));
                        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        OutlineTextContainerView outlineTextContainerView2 = outlineTextContainerView;
                        int i6 = -this.shakeDp;
                        this.shakeDp = i6;
                        AndroidUtilities.shakeViewSpring(outlineTextContainerView2, i6);
                        j4 = j5;
                    }
                } catch (Exception unused) {
                    this.ignore = true;
                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursor;
                    j4 = j2;
                    editTextBoldCursor3.setText(Long.toString(j4));
                    EditTextBoldCursor editTextBoldCursor4 = editTextBoldCursor;
                    editTextBoldCursor4.setSelection(editTextBoldCursor4.getText().length());
                }
                boolean z = false;
                this.ignore = false;
                ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                if (j4 >= j2 && j4 <= j3) {
                    z = true;
                }
                buttonWithCounterView2.setEnabled(z);
                long j6 = j2;
                LinkSpanDrawable.LinksTextView linksTextView4 = linksTextView;
                if (j4 < j6) {
                    linksTextView4.setTextColor(Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
                    linksTextView3 = linksTextView;
                    formatPluralStringComma = LocaleController.formatPluralStringComma("ResellGiftInfoMin", (int) j2);
                } else {
                    linksTextView4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                    linksTextView3 = linksTextView;
                    formatPluralStringComma = LocaleController.formatPluralStringComma("ResellGiftInfo", (int) (j4 * (i2 / 1000.0f)));
                }
                linksTextView3.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
                outlineTextContainerView.animateSelection(editTextBoldCursor.isFocused(), true ^ TextUtils.isEmpty(editTextBoldCursor.getText()));
                if (j4 < j2) {
                    linksTextView2.animate().alpha(0.0f).start();
                    linksTextView2.setText("");
                    return;
                }
                linksTextView2.animate().alpha(1.0f).start();
                LinkSpanDrawable.LinksTextView linksTextView5 = linksTextView2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("≈");
                BillingController billingController2 = BillingController.getInstance();
                double d3 = j4 * (i2 / 1000.0f);
                Double.isNaN(d3);
                double d4 = MessagesController.getInstance(UserConfig.selectedAccount).starsUsdWithdrawRate1000;
                Double.isNaN(d4);
                sb2.append(billingController2.formatCurrency((long) ((d3 / 1000.0d) * d4), "USD"));
                linksTextView5.setText(sb2.toString());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }
        });
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda90
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i6, KeyEvent keyEvent) {
                boolean lambda$showGiftResellPriceSheet$96;
                lambda$showGiftResellPriceSheet$96 = StarsIntroActivity.lambda$showGiftResellPriceSheet$96(zArr, callback2, buttonWithCounterView, editTextBoldCursor, j2, outlineTextContainerView, bottomSheetArr, textView2, i6, keyEvent);
                return lambda$showGiftResellPriceSheet$96;
            }
        });
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$showGiftResellPriceSheet$98(zArr, callback2, buttonWithCounterView, editTextBoldCursor, j2, outlineTextContainerView, bottomSheetArr, view);
            }
        });
        bottomSheetArr[0].fixNavigationBar();
        bottomSheetArr[0].show();
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda92
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showGiftResellPriceSheet$100(bottomSheetArr, editTextBoldCursor);
            }
        }, lastFragment instanceof ChatActivity ? ((ChatActivity) lastFragment).needEnterText() : false ? 200L : 80L);
        return bottomSheetArr[0];
    }

    public static BottomSheet showGiftResellPriceSheet(Context context, int i, Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
        return showGiftResellPriceSheet(context, i, MessagesController.getInstance(i).starsStargiftResaleAmountMin, callback2, resourcesProvider);
    }

    public static BottomSheet showMediaPriceSheet(final Context context, final long j, final boolean z, final Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
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
                StarsIntroActivity.lambda$showMediaPriceSheet$83(OutlineTextContainerView.this, editTextBoldCursor, view, z2);
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
                StarsIntroActivity.lambda$showMediaPriceSheet$84(context);
            }
        }), true));
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 14.0f, 3.0f, 14.0f, 24.0f));
        final ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView2.setText(LocaleController.getString(j > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false);
        linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48));
        if (j > 0 && z) {
            buttonWithCounterView = new ButtonWithCounterView(context, false, resourcesProvider);
            buttonWithCounterView.setText(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        }
        final ButtonWithCounterView buttonWithCounterView3 = buttonWithCounterView;
        builder.setCustomView(linearLayout);
        final BottomSheet[] bottomSheetArr = {builder.create()};
        editTextBoldCursor.setText(j <= 0 ? "" : Long.toString(j));
        editTextBoldCursor.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.Stars.StarsIntroActivity.16
            private boolean ignore;
            private int shakeDp = 2;

            /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void afterTextChanged(Editable editable) {
                long j2;
                TextView textView3;
                String str = "";
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
                    textView3.setText(str);
                }
                this.ignore = false;
                if (!z) {
                    buttonWithCounterView2.setEnabled(j2 > 0);
                }
                outlineTextContainerView.animateSelection(EditTextBoldCursor.this.isFocused(), true ^ TextUtils.isEmpty(EditTextBoldCursor.this.getText()));
                if (j2 != 0) {
                    textView2.animate().alpha(0.0f).start();
                    textView3 = textView2;
                } else {
                    textView2.animate().alpha(1.0f).start();
                    textView3 = textView2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("≈");
                    BillingController billingController = BillingController.getInstance();
                    double d = j2;
                    Double.isNaN(d);
                    double d2 = MessagesController.getInstance(UserConfig.selectedAccount).starsUsdWithdrawRate1000;
                    Double.isNaN(d2);
                    sb.append(billingController.formatCurrency((long) ((d / 1000.0d) * d2), "USD"));
                    str = sb.toString();
                }
                textView3.setText(str);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda62
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                boolean lambda$showMediaPriceSheet$86;
                lambda$showMediaPriceSheet$86 = StarsIntroActivity.lambda$showMediaPriceSheet$86(zArr, callback2, buttonWithCounterView2, editTextBoldCursor, bottomSheetArr, textView3, i2, keyEvent);
                return lambda$showMediaPriceSheet$86;
            }
        });
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$showMediaPriceSheet$88(zArr, callback2, editTextBoldCursor, buttonWithCounterView2, bottomSheetArr, view);
            }
        });
        if (buttonWithCounterView3 != null) {
            buttonWithCounterView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda64
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarsIntroActivity.lambda$showMediaPriceSheet$90(zArr, callback2, buttonWithCounterView3, editTextBoldCursor, bottomSheetArr, view);
                }
            });
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
                StarsIntroActivity.lambda$showMediaPriceSheet$93(bottomSheetArr, editTextBoldCursor);
            }
        }, lastFragment instanceof ChatActivity ? ((ChatActivity) lastFragment).needEnterText() : false ? 200L : 80L);
        return bottomSheetArr[0];
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
        setGiftImage(backupImageView.getImageReceiver(), starGift, NotificationCenter.audioRecordTooShort);
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(NotificationCenter.audioRecordTooShort, NotificationCenter.audioRecordTooShort, 17, 0, -8, 0, 10));
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
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$showSoldOutGiftSheet$101(bottomSheetArr, view);
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

    /* JADX WARN: Removed duplicated region for block: B:106:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BottomSheet showSubscriptionSheet(final Context context, final int i, final TL_stars.StarsSubscription starsSubscription, final Theme.ResourcesProvider resourcesProvider) {
        FrameLayout frameLayout;
        TLRPC.Chat chat;
        String str;
        boolean z;
        boolean z2;
        boolean[] zArr;
        int i2;
        String formatString;
        TableView tableView;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate;
        boolean z3;
        String str2;
        long currentTime;
        final NotificationCenter.NotificationCenterDelegate notificationCenterDelegate2;
        BaseFragment safeLastFragment;
        if (starsSubscription == null || context == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 10));
        final boolean[] zArr2 = new boolean[1];
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate3 = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Stars.StarsIntroActivity.12
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public void didReceivedNotification(int i3, int i4, Object... objArr) {
                BottomSheet bottomSheet;
                if (i3 == NotificationCenter.starSubscriptionsLoaded && zArr2[0] && (bottomSheet = bottomSheetArr[0]) != null) {
                    bottomSheet.lambda$new$0();
                }
            }
        };
        NotificationCenter.getInstance(i).addObserver(notificationCenterDelegate3, NotificationCenter.starSubscriptionsLoaded);
        final long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        BackupImageView backupImageView = new BackupImageView(context);
        MessagesController messagesController = MessagesController.getInstance(i);
        if (peerDialogId >= 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(peerDialogId));
            String userName = UserObject.getUserName(user);
            boolean isBot = UserObject.isBot(user);
            chat = user;
            frameLayout = frameLayout2;
            str = userName;
            z2 = isBot;
            z = !isBot;
        } else {
            frameLayout = frameLayout2;
            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-peerDialogId));
            chat = chat2;
            str = chat2 == null ? "" : chat2.title;
            z = false;
            z2 = false;
        }
        if (starsSubscription.photo != null) {
            backupImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
            backupImageView.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", (Drawable) null, 0, (Object) null);
        } else {
            backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            if (peerDialogId < 0) {
                zArr = zArr2;
                TLRPC.Chat chat3 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
                avatarDrawable.setInfo(chat3);
                backupImageView.setForUserOrChat(chat3, avatarDrawable);
                ViewGroup viewGroup = frameLayout;
                viewGroup.addView(backupImageView, LayoutHelper.createFrame(100, 100, 17));
                Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
                if (starsSubscription.photo == null) {
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(drawable);
                    viewGroup.addView(imageView, LayoutHelper.createFrame(28, 28, 17));
                    imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                    imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                    imageView.setScaleX(1.1f);
                    imageView.setScaleY(1.1f);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageDrawable(drawable2);
                    viewGroup.addView(imageView2, LayoutHelper.createFrame(28, 28, 17));
                    imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                    imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                }
                TextView textView = new TextView(context);
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                textView.setText(TextUtils.isEmpty(starsSubscription.title) ? starsSubscription.title : LocaleController.getString(R.string.StarsSubscriptionTitle));
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                i2 = tL_starsSubscriptionPricing.period;
                if (i2 != 2592000) {
                    formatString = LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount));
                } else {
                    formatString = LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i2 == 300 ? "5min" : "min");
                }
                textView2.setText(replaceStarsWithPlain(formatString, 0.8f));
                linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
                tableView = new TableView(context, resourcesProvider);
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                linksTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = Theme.key_chat_messageLinkIn;
                linksTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
                linksTextView.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
                linksTextView.setTextSize(1, 14.0f);
                linksTextView.setSingleLine(true);
                linksTextView.setDisablePaddingsOffsetY(true);
                AvatarSpan avatarSpan = new AvatarSpan(linksTextView, i, 24.0f);
                if (peerDialogId < 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
                    z3 = user2 == null || UserObject.isDeleted(user2);
                    String userName2 = UserObject.getUserName(user2);
                    avatarSpan.setUser(user2);
                    str2 = userName2;
                    notificationCenterDelegate = notificationCenterDelegate3;
                } else {
                    notificationCenterDelegate = notificationCenterDelegate3;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
                    z3 = chat4 == null;
                    String str3 = chat4 != null ? chat4.title : "";
                    avatarSpan.setChat(chat4);
                    str2 = str3;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
                spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarsIntroActivity.13
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        bottomSheetArr[0].lambda$new$0();
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
                if (!z3) {
                    tableView.addRowUnpadded(LocaleController.getString(peerDialogId < 0 ? R.string.StarsSubscriptionChannel : z ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot), linksTextView);
                }
                if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                    tableView.addRow(LocaleController.getString(!z ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title);
                }
                CharSequence string = LocaleController.getString(R.string.StarsSubscriptionSince);
                int i4 = R.string.formatDateAtTime;
                tableView.addRow(string, LocaleController.formatString(i4, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))));
                currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                tableView.addRow(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(i4, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))));
                linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 17.0f, 0.0f, 0.0f));
                LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                int i5 = Theme.key_windowBackgroundWhiteGrayText2;
                linksTextView2.setTextColor(Theme.getColor(i5, resourcesProvider));
                linksTextView2.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
                linksTextView2.setTextSize(1, 14.0f);
                linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda67
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.lambda$showSubscriptionSheet$60(context);
                    }
                }));
                linksTextView2.setGravity(17);
                linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 14.0f, 15.0f, 14.0f, 7.0f));
                if (currentTime < starsSubscription.until_date) {
                    notificationCenterDelegate2 = notificationCenterDelegate;
                    LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                    linksTextView3.setTextColor(Theme.getColor(i5, resourcesProvider));
                    linksTextView3.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
                    linksTextView3.setTextSize(1, 14.0f);
                    linksTextView3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                    linksTextView3.setSingleLine(false);
                    linksTextView3.setMaxLines(4);
                    linksTextView3.setGravity(17);
                    linearLayout.addView(linksTextView3, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                    if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.StarsSubscriptionAgain), false);
                        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
                        final boolean[] zArr3 = zArr;
                        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda71
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarsIntroActivity.lambda$showSubscriptionSheet$76(ButtonWithCounterView.this, starsSubscription, i, bottomSheetArr, resourcesProvider, zArr3, context, view);
                            }
                        });
                    }
                } else if (starsSubscription.can_refulfill) {
                    LinkSpanDrawable.LinksTextView linksTextView4 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                    linksTextView4.setTextColor(Theme.getColor(i5, resourcesProvider));
                    linksTextView4.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
                    linksTextView4.setTextSize(1, 14.0f);
                    linksTextView4.setText(LocaleController.formatString(z2 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                    linksTextView4.setSingleLine(false);
                    linksTextView4.setMaxLines(4);
                    linksTextView4.setGravity(17);
                    linearLayout.addView(linksTextView4, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                    final ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, true, resourcesProvider);
                    buttonWithCounterView2.setText(LocaleController.getString(z2 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false);
                    linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48));
                    final boolean z4 = z;
                    notificationCenterDelegate2 = notificationCenterDelegate;
                    final String str4 = str;
                    buttonWithCounterView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda68
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StarsIntroActivity.lambda$showSubscriptionSheet$64(ButtonWithCounterView.this, i, starsSubscription, bottomSheetArr, peerDialogId, context, resourcesProvider, z4, str4, view);
                        }
                    });
                } else {
                    notificationCenterDelegate2 = notificationCenterDelegate;
                    if (starsSubscription.bot_canceled) {
                        LinkSpanDrawable.LinksTextView linksTextView5 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                        linksTextView5.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                        linksTextView5.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
                        linksTextView5.setTextSize(1, 14.0f);
                        linksTextView5.setText(LocaleController.getString(z ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                        linksTextView5.setSingleLine(false);
                        linksTextView5.setMaxLines(4);
                        linksTextView5.setGravity(17);
                        linearLayout.addView(linksTextView5, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                    } else if (starsSubscription.canceled) {
                        LinkSpanDrawable.LinksTextView linksTextView6 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                        linksTextView6.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                        linksTextView6.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
                        linksTextView6.setTextSize(1, 14.0f);
                        linksTextView6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                        linksTextView6.setSingleLine(false);
                        linksTextView6.setMaxLines(4);
                        linksTextView6.setGravity(17);
                        linearLayout.addView(linksTextView6, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            final ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(context, true, resourcesProvider);
                            buttonWithCounterView3.setText(LocaleController.getString(R.string.StarsSubscriptionRenew), false);
                            linearLayout.addView(buttonWithCounterView3, LayoutHelper.createLinear(-1, 48));
                            final TLRPC.Chat chat5 = chat;
                            final String str5 = str;
                            buttonWithCounterView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda69
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarsIntroActivity.lambda$showSubscriptionSheet$67(ButtonWithCounterView.this, starsSubscription, i, bottomSheetArr, chat5, str5, view);
                                }
                            });
                        }
                    } else {
                        LinkSpanDrawable.LinksTextView linksTextView7 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                        linksTextView7.setTextColor(Theme.getColor(i5, resourcesProvider));
                        linksTextView7.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
                        linksTextView7.setTextSize(1, 14.0f);
                        linksTextView7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        linksTextView7.setSingleLine(false);
                        linksTextView7.setMaxLines(4);
                        linksTextView7.setGravity(17);
                        linearLayout.addView(linksTextView7, LayoutHelper.createLinear(-1, -2, 26.0f, 7.0f, 26.0f, 15.0f));
                        final ButtonWithCounterView buttonWithCounterView4 = new ButtonWithCounterView(context, false, resourcesProvider);
                        buttonWithCounterView4.setText(LocaleController.getString(R.string.StarsSubscriptionCancel), false);
                        buttonWithCounterView4.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                        linearLayout.addView(buttonWithCounterView4, LayoutHelper.createLinear(-1, 48));
                        final boolean z5 = z;
                        final boolean z6 = z2;
                        final TLRPC.Chat chat6 = chat;
                        buttonWithCounterView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda70
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarsIntroActivity.lambda$showSubscriptionSheet$70(ButtonWithCounterView.this, starsSubscription, i, bottomSheetArr, z5, z6, chat6, view);
                            }
                        });
                    }
                }
                builder.setCustomView(linearLayout);
                BottomSheet create = builder.create();
                bottomSheetArr[0] = create;
                create.useBackgroundTopPadding = false;
                create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda72
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        StarsIntroActivity.lambda$showSubscriptionSheet$77(i, notificationCenterDelegate2, dialogInterface);
                    }
                });
                bottomSheetArr[0].fixNavigationBar();
                safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
                    bottomSheetArr[0].makeAttached(safeLastFragment);
                }
                bottomSheetArr[0].show();
                return bottomSheetArr[0];
            }
            TLRPC.User user3 = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
            avatarDrawable.setInfo(user3);
            backupImageView.setForUserOrChat(user3, avatarDrawable);
        }
        zArr = zArr2;
        ViewGroup viewGroup2 = frameLayout;
        viewGroup2.addView(backupImageView, LayoutHelper.createFrame(100, 100, 17));
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
        textView3.setText(TextUtils.isEmpty(starsSubscription.title) ? starsSubscription.title : LocaleController.getString(R.string.StarsSubscriptionTitle));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TextView textView22 = new TextView(context);
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
        i2 = tL_starsSubscriptionPricing2.period;
        if (i2 != 2592000) {
        }
        textView22.setText(replaceStarsWithPlain(formatString, 0.8f));
        linearLayout.addView(textView22, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        tableView = new TableView(context, resourcesProvider);
        LinkSpanDrawable.LinksTextView linksTextView8 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        linksTextView8.setEllipsize(TextUtils.TruncateAt.END);
        int i32 = Theme.key_chat_messageLinkIn;
        linksTextView8.setTextColor(Theme.getColor(i32, resourcesProvider));
        linksTextView8.setLinkTextColor(Theme.getColor(i32, resourcesProvider));
        linksTextView8.setTextSize(1, 14.0f);
        linksTextView8.setSingleLine(true);
        linksTextView8.setDisablePaddingsOffsetY(true);
        AvatarSpan avatarSpan2 = new AvatarSpan(linksTextView8, i, 24.0f);
        if (peerDialogId < 0) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder2.setSpan(avatarSpan2, 0, 1, 33);
        spannableStringBuilder2.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarsIntroActivity.13
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                bottomSheetArr[0].lambda$new$0();
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
        if (!z3) {
        }
        if (peerDialogId >= 0) {
            tableView.addRow(LocaleController.getString(!z ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title);
        }
        CharSequence string2 = LocaleController.getString(R.string.StarsSubscriptionSince);
        int i42 = R.string.formatDateAtTime;
        tableView.addRow(string2, LocaleController.formatString(i42, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))));
        currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        tableView.addRow(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(i42, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))));
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 17.0f, 0.0f, 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView22 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        int i52 = Theme.key_windowBackgroundWhiteGrayText2;
        linksTextView22.setTextColor(Theme.getColor(i52, resourcesProvider));
        linksTextView22.setLinkTextColor(Theme.getColor(i32, resourcesProvider));
        linksTextView22.setTextSize(1, 14.0f);
        linksTextView22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda67
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showSubscriptionSheet$60(context);
            }
        }));
        linksTextView22.setGravity(17);
        linearLayout.addView(linksTextView22, LayoutHelper.createLinear(-1, -2, 14.0f, 15.0f, 14.0f, 7.0f));
        if (currentTime < starsSubscription.until_date) {
        }
        builder.setCustomView(linearLayout);
        BottomSheet create2 = builder.create();
        bottomSheetArr[0] = create2;
        create2.useBackgroundTopPadding = false;
        create2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda72
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StarsIntroActivity.lambda$showSubscriptionSheet$77(i, notificationCenterDelegate2, dialogInterface);
            }
        });
        bottomSheetArr[0].fixNavigationBar();
        safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet()) {
            bottomSheetArr[0].makeAttached(safeLastFragment);
        }
        bottomSheetArr[0].show();
        return bottomSheetArr[0];
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
        starsTransaction.stars = new TL_stars.StarsAmount(tL_messageActionGiftStars.stars);
        starsTransaction.id = tL_messageActionGiftStars.transaction_id;
        starsTransaction.gift = true;
        starsTransaction.sent_by = peer;
        starsTransaction.received_by = peer2;
        return showTransactionSheet(context, false, 0L, i, starsTransaction, resourcesProvider);
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
        starsTransaction.stars = new TL_stars.StarsAmount(tL_messageActionPrizeStars.stars);
        starsTransaction.id = tL_messageActionPrizeStars.transaction_id;
        starsTransaction.gift = true;
        starsTransaction.flags |= LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM;
        starsTransaction.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
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
        starsTransaction.stars = new TL_stars.StarsAmount(tL_messageActionPaymentRefunded.total_amount);
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
        starsTransaction.stars = new TL_stars.StarsAmount(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        return showTransactionSheet(context, z, 0L, i, starsTransaction, resourcesProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0d72  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0d75  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0d83  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0de2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0eab  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0ee5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0f04  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0eef  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0eb6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0bf6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0ca4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0cdd A[LOOP:0: B:68:0x0c53->B:78:0x0cdd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0ce7 A[EDGE_INSN: B:79:0x0ce7->B:80:0x0ce7 BREAK  A[LOOP:0: B:68:0x0c53->B:78:0x0cdd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0d60 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v212, types: [org.telegram.ui.Components.AnimatedEmojiDrawable$SwapAnimatedEmojiDrawable] */
    /* JADX WARN: Type inference failed for: r0v217, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, org.telegram.ui.Stars.StarsIntroActivity$8] */
    /* JADX WARN: Type inference failed for: r0v55, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.LinkSpanDrawable$LinksTextView] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3, types: [org.telegram.ui.Components.TableView] */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.view.View, org.telegram.ui.Components.TableView] */
    /* JADX WARN: Type inference failed for: r1v104, types: [org.telegram.ui.ActionBar.BottomSheet$Builder] */
    /* JADX WARN: Type inference failed for: r1v65, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v55, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v74, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.LinkSpanDrawable$LinksTextView] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BottomSheet showTransactionSheet(final Context context, final boolean z, final long j, final int i, final TL_stars.StarsTransaction starsTransaction, final Theme.ResourcesProvider resourcesProvider) {
        String str;
        String str2;
        String str3;
        String str4;
        BottomSheet.Builder builder;
        TLRPC.Peer peer;
        long j2;
        TLRPC.Chat chat;
        int i2;
        int i3;
        int i4;
        int i5;
        ImageLocation imageLocation;
        BackupImageView backupImageView;
        final Theme.ResourcesProvider resourcesProvider2;
        int i6;
        final long j3;
        CharSequence charSequence;
        boolean isUserSelf;
        int i7;
        String string;
        final BottomSheet[] bottomSheetArr;
        String str5;
        TextView textView;
        BackupImageView backupImageView2;
        TL_stars.StarGift starGift;
        CharSequence charSequence2;
        Object obj;
        final Context context2;
        final int i8;
        final TL_stars.StarsTransaction starsTransaction2;
        final Theme.ResourcesProvider resourcesProvider3;
        String string2;
        int i9;
        String string3;
        Runnable runnable;
        ?? r11;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        TL_stars.StarGift starGift2;
        boolean z2;
        String string4;
        BaseFragment safeLastFragment;
        TLRPC.Chat chat2;
        CharSequence charSequence3;
        String sb;
        Iterator<TLRPC.MessageMedia> it;
        ImageLocation imageLocation2;
        ImageLocation forDocument;
        String string5;
        int i10;
        long j4;
        long j5;
        TableView tableView;
        TableView tableView2;
        int i11;
        if (starsTransaction == null || context == null) {
            return null;
        }
        int i12 = starsTransaction.flags;
        boolean z3 = (i12 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
        boolean z4 = ((131072 & i12) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z5 = (z4 || (i12 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsTransaction.stars.positive();
        boolean negative = starsTransaction.stars.negative();
        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false, resourcesProvider);
        BottomSheet[] bottomSheetArr2 = new BottomSheet[1];
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp((z3 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                final ?? swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(null, AndroidUtilities.dp(20.0f));
                final RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                final Paint paint = new Paint(1);
                final Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                str = "";
                str2 = "fragment";
                ?? r0 = new LinearLayout(context) { // from class: org.telegram.ui.Stars.StarsIntroActivity.8
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
                swapAnimatedEmojiDrawable.setParentView(r0);
                swapAnimatedEmojiDrawable.set(stargiftattributepattern.document, false);
                r0.setOrientation(1);
                BackupImageView backupImageView3 = new BackupImageView(context);
                setGiftImage(backupImageView3.getImageReceiver(), starsTransaction.stargift, NotificationCenter.audioRecordTooShort);
                r0.addView(backupImageView3, LayoutHelper.createLinear(NotificationCenter.audioRecordTooShort, NotificationCenter.audioRecordTooShort, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    ScaleStateListAnimator.apply(backupImageView3);
                    backupImageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StarsIntroActivity.lambda$showTransactionSheet$25(context, i, tL_starGiftUnique, view);
                        }
                    });
                }
                TextView makeTextView = TextHelper.makeTextView(context, 20.0f, 0, true);
                makeTextView.setTextColor(-1);
                makeTextView.setText(tL_starGiftUnique.title);
                r0.addView(makeTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 1, 0, 0));
                TextView makeTextView2 = TextHelper.makeTextView(context, 13.0f, 0, false);
                makeTextView2.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                makeTextView2.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                r0.addView(makeTextView2, LayoutHelper.createLinear(-2, -2, 17, 0, 5, 0, 0));
                TextView makeTextView3 = TextHelper.makeTextView(context, 18.0f, 0, true);
                makeTextView3.setTextColor(-1);
                makeTextView3.setText(replaceStars(TextUtils.concat(positive ? "+" : str, formatStarsAmount(starsTransaction.stars), " ⭐️"), 1.25f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(makeTextView3.getText());
                if (starsTransaction.refund) {
                    i11 = R.string.StarsRefunded;
                } else {
                    if (!starsTransaction.failed) {
                        if (starsTransaction.pending) {
                            i11 = R.string.StarsPending;
                        }
                        makeTextView3.setText(spannableStringBuilder);
                        r0.addView(makeTextView3, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 17));
                        linearLayout.addView(r0, LayoutHelper.createLinear(-1, -2));
                        resourcesProvider2 = resourcesProvider;
                        str3 = "/";
                        str4 = "⭐️ ";
                        bottomSheetArr = bottomSheetArr2;
                        builder = builder2;
                        charSequence = " ";
                        j3 = j;
                        TableView tableView3 = new TableView(context, resourcesProvider2);
                        starGift = starsTransaction.stargift;
                        if (starGift == null) {
                            if (starsTransaction.stargift_upgrade) {
                                if ((starsTransaction.flags & 256) != 0 && starsTransaction.msg_id > 0) {
                                    final ButtonSpan.TextViewButtons textViewButtons = (ButtonSpan.TextViewButtons) ((TableView.TableRowContent) tableView3.addRow(LocaleController.getString(R.string.StarGiftReason), LocaleController.getString(R.string.StarGiftReasonUpgrade)).getChildAt(1)).getChildAt(0);
                                    TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                                    tL_inputSavedStarGiftUser.msg_id = starsTransaction.msg_id;
                                    StarsController.getInstance(i).getUserStarGift(tL_inputSavedStarGiftUser, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda27
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj2) {
                                            StarsIntroActivity.lambda$showTransactionSheet$30(ButtonSpan.TextViewButtons.this, i, context, resourcesProvider2, (TL_stars.SavedStarGift) obj2);
                                        }
                                    });
                                }
                                TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction.peer;
                                if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                                    final long peerDialogId = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer2).peer);
                                    obj = linearLayout;
                                    tableView2 = tableView3;
                                    tableView3.addRowUser(LocaleController.getString(R.string.StarGiftUpgradeGiftFrom), i, peerDialogId, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda28
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarsIntroActivity.lambda$showTransactionSheet$31(bottomSheetArr, peerDialogId);
                                        }
                                    });
                                } else {
                                    obj = linearLayout;
                                    tableView2 = tableView3;
                                }
                            } else {
                                obj = linearLayout;
                                TableView tableView4 = tableView3;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    final String str6 = starGift.slug;
                                    if (!TextUtils.isEmpty(str6)) {
                                        tableView4.addRowLink(LocaleController.getString(R.string.Gift2Gift), starsTransaction.stargift.title + " #" + starsTransaction.stargift.num, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda29
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StarsIntroActivity.lambda$showTransactionSheet$32(context, i, str6);
                                            }
                                        });
                                    }
                                    final long clientUserId = UserConfig.getInstance(i).getClientUserId();
                                    long peerDialogId2 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction.peer).peer);
                                    if (starsTransaction.stargift_resale) {
                                        string5 = LocaleController.getString(R.string.StarGiftReason);
                                        boolean z6 = starsTransaction.refund;
                                        if (negative) {
                                            i10 = z6 ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase;
                                        } else {
                                            tableView4.addRow(string5, LocaleController.getString(z6 ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale));
                                            j5 = peerDialogId2;
                                            j4 = clientUserId;
                                            if (j5 != clientUserId) {
                                                final BottomSheet[] bottomSheetArr3 = bottomSheetArr;
                                                final long j6 = j5;
                                                tableView4.addRowUser(LocaleController.getString(R.string.Gift2From), i, j5, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda30
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        StarsIntroActivity.lambda$showTransactionSheet$33(bottomSheetArr3, j6, clientUserId);
                                                    }
                                                });
                                            }
                                            if (j4 != clientUserId) {
                                                final BottomSheet[] bottomSheetArr4 = bottomSheetArr;
                                                final long j7 = j4;
                                                tableView4.addRowUser(LocaleController.getString(R.string.Gift2To), i, j4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda31
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        StarsIntroActivity.lambda$showTransactionSheet$34(bottomSheetArr4, j7, clientUserId);
                                                    }
                                                });
                                            }
                                            tableView2 = tableView4;
                                            if (j5 == clientUserId) {
                                                tableView2 = tableView4;
                                                if (starsTransaction.starref_amount != null) {
                                                    tableView2 = tableView4;
                                                    if (starsTransaction.starref_commission_permille > 0) {
                                                        long abs = Math.abs(Math.round(starsTransaction.stars.toDouble() + starsTransaction.starref_amount.toDouble()));
                                                        tableView4.addRow(LocaleController.getString(R.string.StarsTransactionFullPrice), replaceStarsWithPlain(str4 + LocaleController.formatNumber(abs, ','), 0.8f));
                                                        tableView2 = tableView4;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        string5 = LocaleController.getString(R.string.StarGiftReason);
                                        i10 = R.string.StarGiftReasonTransfer;
                                    }
                                    tableView4.addRow(string5, LocaleController.getString(i10));
                                    j4 = peerDialogId2;
                                    j5 = clientUserId;
                                    if (j5 != clientUserId) {
                                    }
                                    if (j4 != clientUserId) {
                                    }
                                    tableView2 = tableView4;
                                    if (j5 == clientUserId) {
                                    }
                                } else {
                                    if (starsTransaction.refund) {
                                        charSequence2 = charSequence;
                                    } else {
                                        long clientUserId2 = j3 == 0 ? UserConfig.getInstance(i).getClientUserId() : j3;
                                        final long peerDialogId3 = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
                                        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId3));
                                        if (positive) {
                                            if (peerDialogId3 != clientUserId2) {
                                                final BottomSheet[] bottomSheetArr5 = bottomSheetArr;
                                                charSequence2 = charSequence;
                                                tableView4.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i, peerDialogId3, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda32
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        StarsIntroActivity.lambda$showTransactionSheet$35(bottomSheetArr, starsTransaction, peerDialogId3);
                                                    }
                                                }, (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId3)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        StarsIntroActivity.lambda$showTransactionSheet$36(context, i, peerDialogId3, bottomSheetArr5);
                                                    }
                                                });
                                            } else {
                                                charSequence2 = charSequence;
                                            }
                                            tableView4.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeTo), i, clientUserId2, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    StarsIntroActivity.lambda$showTransactionSheet$37(bottomSheetArr, i);
                                                }
                                            });
                                        } else {
                                            charSequence2 = charSequence;
                                            if (peerDialogId3 != clientUserId2) {
                                                tableView4.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i, clientUserId2, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        StarsIntroActivity.lambda$showTransactionSheet$38(bottomSheetArr, i);
                                                    }
                                                });
                                            }
                                            final BottomSheet[] bottomSheetArr6 = bottomSheetArr;
                                            tableView4.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeTo), i, peerDialogId3, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda4
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    StarsIntroActivity.lambda$showTransactionSheet$39(bottomSheetArr, starsTransaction, peerDialogId3);
                                                }
                                            }, (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId3)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda5
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    StarsIntroActivity.lambda$showTransactionSheet$40(context, i, peerDialogId3, bottomSheetArr6);
                                                }
                                            });
                                        }
                                    }
                                    context2 = context;
                                    tableView = tableView4;
                                    i8 = i;
                                    starsTransaction2 = starsTransaction;
                                    resourcesProvider3 = resourcesProvider2;
                                    r11 = tableView;
                                }
                            }
                            charSequence2 = charSequence;
                            context2 = context;
                            tableView = tableView2;
                            i8 = i;
                            starsTransaction2 = starsTransaction;
                            resourcesProvider3 = resourcesProvider2;
                            r11 = tableView;
                        } else {
                            charSequence2 = charSequence;
                            final long j8 = j3;
                            obj = linearLayout;
                            ?? r112 = tableView3;
                            String str7 = str4;
                            TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction.peer;
                            if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                                final long peerDialogId4 = DialogObject.getPeerDialogId(starsTransactionPeer3.peer);
                                if (starsTransaction.paid_message) {
                                    r112.addRowUser(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarsIntroActivity.lambda$showTransactionSheet$41(bottomSheetArr, peerDialogId4);
                                        }
                                    });
                                    if (starsTransaction.starref_amount != null && starsTransaction.starref_commission_permille > 0) {
                                        long abs2 = Math.abs(Math.round(starsTransaction.stars.toDouble() + starsTransaction.starref_amount.toDouble()));
                                        r112.addRow(LocaleController.getString(R.string.StarsTransactionFullPrice), replaceStarsWithPlain(str7 + LocaleController.formatNumber(abs2, ','), 0.8f));
                                    }
                                } else if (z4) {
                                    final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransaction.starref_peer);
                                    r112.addRowLink(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarsIntroActivity.lambda$showTransactionSheet$42(bottomSheetArr, j8);
                                        }
                                    });
                                    r112.addRowUser(LocaleController.getString(R.string.StarAffiliate), i, peerDialogId5, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarsIntroActivity.lambda$showTransactionSheet$43(bottomSheetArr, peerDialogId5);
                                        }
                                    });
                                    r112.addRowUser(LocaleController.getString(R.string.StarAffiliateReferredUser), i, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarsIntroActivity.lambda$showTransactionSheet$44(bottomSheetArr, peerDialogId4);
                                        }
                                    });
                                    r112.addRow(LocaleController.getString(R.string.StarAffiliateCommission), AffiliateProgramFragment.percents(starsTransaction.starref_commission_permille));
                                } else {
                                    if (z5) {
                                        final BottomSheet[] bottomSheetArr7 = bottomSheetArr;
                                        r112.addRowLink(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda10
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StarsIntroActivity.lambda$showTransactionSheet$46(i, context, j, peerDialogId4, bottomSheetArr7, resourcesProvider);
                                            }
                                        });
                                        r112.addRowUser(LocaleController.getString(R.string.StarAffiliateMiniApp), i, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda12
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StarsIntroActivity.lambda$showTransactionSheet$47(bottomSheetArr, peerDialogId4);
                                            }
                                        });
                                        context2 = context;
                                        i8 = i;
                                        starsTransaction2 = starsTransaction;
                                    } else if (z3) {
                                        starsTransaction2 = starsTransaction;
                                        r112.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda13
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StarsIntroActivity.lambda$showTransactionSheet$48(bottomSheetArr, starsTransaction2, peerDialogId4);
                                            }
                                        });
                                        i8 = i;
                                        r112.addRowUser(LocaleController.getString(R.string.StarGiveawayPrizeTo), i, UserConfig.getInstance(i).getClientUserId(), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda14
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StarsIntroActivity.lambda$showTransactionSheet$49(bottomSheetArr, i8);
                                            }
                                        });
                                        r112.addRowLink(LocaleController.getString(R.string.StarGiveawayReason), LocaleController.getString(R.string.StarGiveawayReasonLink), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda15
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StarsIntroActivity.lambda$showTransactionSheet$50(bottomSheetArr, starsTransaction2, peerDialogId4);
                                            }
                                        });
                                        r112.addRow(LocaleController.getString(R.string.StarGiveawayGift), formatStarsAmountString(starsTransaction2.stars));
                                        context2 = context;
                                    } else {
                                        i8 = i;
                                        starsTransaction2 = starsTransaction;
                                        if (!starsTransaction2.subscription || z) {
                                            context2 = context;
                                            if (starsTransaction2.premium_gift) {
                                                r112.addRowUser(LocaleController.getString(R.string.Gift2To), i, peerDialogId4, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda17
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        StarsIntroActivity.lambda$showTransactionSheet$52(bottomSheetArr, peerDialogId4, context2);
                                                    }
                                                });
                                                r112.addRow(LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration), LocaleController.formatPluralStringComma("Months", starsTransaction2.premium_gift_months));
                                            } else {
                                                string3 = LocaleController.getString(R.string.StarsTransactionRecipient);
                                                runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda18
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        StarsIntroActivity.lambda$showTransactionSheet$53(bottomSheetArr, peerDialogId4, context2);
                                                    }
                                                };
                                            }
                                        } else {
                                            string3 = LocaleController.getString(R.string.StarSubscriptionTo);
                                            context2 = context;
                                            runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda16
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    StarsIntroActivity.lambda$showTransactionSheet$51(bottomSheetArr, peerDialogId4, context2);
                                                }
                                            };
                                        }
                                        r112.addRowUser(string3, i, peerDialogId4, runnable);
                                    }
                                    resourcesProvider3 = resourcesProvider;
                                    r11 = r112;
                                }
                                context2 = context;
                                resourcesProvider3 = resourcesProvider;
                                i8 = i;
                                starsTransaction2 = starsTransaction;
                                r11 = r112;
                            } else {
                                context2 = context;
                                i8 = i;
                                starsTransaction2 = starsTransaction;
                                if (!(starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerFragment)) {
                                    resourcesProvider3 = resourcesProvider;
                                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                                        string2 = LocaleController.getString(R.string.StarsTransactionSource);
                                        i9 = R.string.AppStore;
                                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                                        string2 = LocaleController.getString(R.string.StarsTransactionSource);
                                        i9 = R.string.PlayMarket;
                                    } else {
                                        r11 = r112;
                                        if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                            string2 = LocaleController.getString(R.string.StarsTransactionSource);
                                            i9 = R.string.StarsTransactionBot;
                                        }
                                    }
                                    r112.addRow(string2, LocaleController.getString(i9));
                                    r11 = r112;
                                } else if (starsTransaction2.gift) {
                                    resourcesProvider3 = resourcesProvider;
                                    ?? linksTextView = new LinkSpanDrawable.LinksTextView(context2, resourcesProvider3);
                                    linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                    linksTextView.setEllipsize(TextUtils.TruncateAt.END);
                                    int i13 = Theme.key_chat_messageLinkIn;
                                    linksTextView.setTextColor(Theme.getColor(i13, resourcesProvider3));
                                    linksTextView.setLinkTextColor(Theme.getColor(i13, resourcesProvider3));
                                    linksTextView.setTextSize(1, 14.0f);
                                    linksTextView.setSingleLine(true);
                                    linksTextView.setDisablePaddingsOffsetY(true);
                                    AvatarSpan avatarSpan = new AvatarSpan(linksTextView, i8, 24.0f);
                                    String string6 = LocaleController.getString(R.string.StarsTransactionUnknown);
                                    CombinedDrawable platformDrawable = StarsTransactionView.getPlatformDrawable(str2, 24);
                                    platformDrawable.setIconSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                                    avatarSpan.setImageDrawable(platformDrawable);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) string6));
                                    spannableStringBuilder2.setSpan(avatarSpan, 0, 1, 33);
                                    spannableStringBuilder2.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarsIntroActivity.10
                                        @Override // android.text.style.ClickableSpan
                                        public void onClick(View view) {
                                            bottomSheetArr[0].lambda$new$0();
                                            Browser.openUrl(context2, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                        }

                                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                        public void updateDrawState(TextPaint textPaint) {
                                            textPaint.setUnderlineText(false);
                                        }
                                    }, 3, spannableStringBuilder2.length(), 33);
                                    linksTextView.setText(spannableStringBuilder2);
                                    r112.addRowUnpadded(LocaleController.getString(R.string.StarsTransactionRecipient), linksTextView);
                                    r11 = r112;
                                } else {
                                    resourcesProvider3 = resourcesProvider;
                                    string2 = LocaleController.getString(R.string.StarsTransactionSource);
                                    i9 = R.string.Fragment;
                                    r112.addRow(string2, LocaleController.getString(i9));
                                    r11 = r112;
                                }
                            }
                        }
                        starsTransactionPeer = starsTransaction2.peer;
                        if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction2.flags & 256) != 0) {
                            final long peerDialogId6 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                            if (z) {
                                peerDialogId6 = j;
                            }
                            chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId6));
                            if (chat2 != null) {
                                ?? linksTextView2 = new LinkSpanDrawable.LinksTextView(context2, resourcesProvider3);
                                linksTextView2.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                linksTextView2.setEllipsize(TextUtils.TruncateAt.END);
                                int i14 = Theme.key_chat_messageLinkIn;
                                linksTextView2.setTextColor(Theme.getColor(i14, resourcesProvider3));
                                linksTextView2.setLinkTextColor(Theme.getColor(i14, resourcesProvider3));
                                linksTextView2.setTextSize(1, 14.0f);
                                linksTextView2.setDisablePaddingsOffsetY(true);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                                if (!starsTransaction2.extended_media.isEmpty()) {
                                    Iterator<TLRPC.MessageMedia> it2 = starsTransaction2.extended_media.iterator();
                                    int i15 = 0;
                                    while (it2.hasNext()) {
                                        TLRPC.MessageMedia next = it2.next();
                                        ImageReceiverSpan imageReceiverSpan = new ImageReceiverSpan(linksTextView2, i8, 24.0f);
                                        if (next instanceof TLRPC.TL_messageMediaPhoto) {
                                            it = it2;
                                            forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(next.photo.sizes, AndroidUtilities.dp(24.0f), true), next.photo);
                                        } else {
                                            it = it2;
                                            if (next instanceof TLRPC.TL_messageMediaDocument) {
                                                forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(next.document.thumbs, AndroidUtilities.dp(24.0f), true), next.document);
                                            } else {
                                                imageLocation2 = null;
                                                if (imageLocation2 == null) {
                                                    imageReceiverSpan.setRoundRadius(6.0f);
                                                    imageReceiverSpan.imageReceiver.setImage(imageLocation2, "24_24", null, null, null, 0);
                                                    SpannableString spannableString = new SpannableString("x");
                                                    spannableString.setSpan(imageReceiverSpan, 0, spannableString.length(), 33);
                                                    spannableStringBuilder3.append((CharSequence) spannableString);
                                                    charSequence3 = charSequence2;
                                                    spannableStringBuilder3.append(charSequence3);
                                                    i15++;
                                                } else {
                                                    charSequence3 = charSequence2;
                                                }
                                                if (i15 < 3) {
                                                    break;
                                                }
                                                charSequence2 = charSequence3;
                                                it2 = it;
                                            }
                                        }
                                        imageLocation2 = forDocument;
                                        if (imageLocation2 == null) {
                                        }
                                        if (i15 < 3) {
                                        }
                                    }
                                }
                                charSequence3 = charSequence2;
                                spannableStringBuilder3.append(charSequence3);
                                int length = spannableStringBuilder3.length();
                                String publicUsername = ChatObject.getPublicUsername(chat2);
                                if (TextUtils.isEmpty(publicUsername)) {
                                    sb = chat2.title;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(MessagesController.getInstance(i).linkPrefix);
                                    String str8 = str3;
                                    sb2.append(str8);
                                    sb2.append(publicUsername);
                                    sb2.append(str8);
                                    sb2.append(starsTransaction2.msg_id);
                                    sb = sb2.toString();
                                }
                                spannableStringBuilder3.append((CharSequence) sb);
                                final Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda19
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.lambda$showTransactionSheet$54(bottomSheetArr, peerDialogId6, starsTransaction2);
                                    }
                                };
                                spannableStringBuilder3.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarsIntroActivity.11
                                    @Override // android.text.style.ClickableSpan
                                    public void onClick(View view) {
                                        runnable2.run();
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
                                        runnable2.run();
                                    }
                                });
                                r11.addRowUnpadded(LocaleController.getString(starsTransaction2.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia), linksTextView2);
                            }
                        }
                        if (!TextUtils.isEmpty(starsTransaction2.id) && !z3) {
                            String string7 = LocaleController.getString(R.string.StarsTransactionID);
                            String str9 = starsTransaction2.id;
                            r11.addRowMonospaced(string7, str9, str9.length() <= 25 ? 9 : 10, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarsIntroActivity.lambda$showTransactionSheet$56(bottomSheetArr, resourcesProvider3);
                                }
                            });
                        }
                        if (starsTransaction2.floodskip && starsTransaction2.floodskip_number > 0) {
                            r11.addRow(LocaleController.getString(R.string.StarsTransactionFloodskipNumberName), LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction2.floodskip_number));
                        }
                        String string8 = LocaleController.getString(R.string.StarsTransactionDate);
                        int i16 = R.string.formatDateAtTime;
                        r11.addRow(string8, LocaleController.formatString(i16, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction2.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction2.date * 1000))));
                        starGift2 = starsTransaction2.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                addAvailabilityRow(r11, i8, starGift2, resourcesProvider3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction2.description)) {
                                r11.addFullRow(new SpannableStringBuilder(starsTransaction2.description));
                            }
                        }
                        ?? r3 = obj;
                        r3.addView(r11, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                        if ((starsTransaction2.flags & 32) != 0) {
                            r11.addRow(LocaleController.getString(R.string.StarsTransactionTONDate), LocaleController.formatString(i16, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction2.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction2.transaction_date * 1000))));
                        }
                        LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider3);
                        linksTextView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
                        linksTextView3.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
                        linksTextView3.setTextSize(1, 14.0f);
                        linksTextView3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda23
                            @Override // java.lang.Runnable
                            public final void run() {
                                StarsIntroActivity.lambda$showTransactionSheet$57(context);
                            }
                        }));
                        linksTextView3.setGravity(17);
                        r3.addView(linksTextView3, LayoutHelper.createLinear(-1, -2, 16.0f, 15.0f, 16.0f, 15.0f));
                        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider3);
                        if ((starsTransaction2.flags & 32) == 0) {
                            string4 = LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer);
                            z2 = false;
                        } else {
                            z2 = false;
                            string4 = LocaleController.getString(R.string.OK);
                        }
                        buttonWithCounterView.setText(string4, z2);
                        r3.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 0.0f));
                        ?? r1 = builder;
                        r1.setCustomView(r3);
                        BottomSheet create = r1.create();
                        bottomSheetArr[0] = create;
                        create.useBackgroundTopPadding = false;
                        buttonWithCounterView.setOnClickListener((starsTransaction2.flags & 32) == 0 ? new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda24
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarsIntroActivity.lambda$showTransactionSheet$58(context, starsTransaction2, view);
                            }
                        } : new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda25
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarsIntroActivity.lambda$showTransactionSheet$59(bottomSheetArr, view);
                            }
                        });
                        bottomSheetArr[0].fixNavigationBar();
                        safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
                            bottomSheetArr[0].makeAttached(safeLastFragment);
                        }
                        bottomSheetArr[0].show();
                        return bottomSheetArr[0];
                    }
                    i11 = R.string.StarsFailed;
                }
                appendStatus(spannableStringBuilder, makeTextView3, LocaleController.getString(i11));
                makeTextView3.setText(spannableStringBuilder);
                r0.addView(makeTextView3, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 17));
                linearLayout.addView(r0, LayoutHelper.createLinear(-1, -2));
                resourcesProvider2 = resourcesProvider;
                str3 = "/";
                str4 = "⭐️ ";
                bottomSheetArr = bottomSheetArr2;
                builder = builder2;
                charSequence = " ";
                j3 = j;
                TableView tableView32 = new TableView(context, resourcesProvider2);
                starGift = starsTransaction.stargift;
                if (starGift == null) {
                }
                starsTransactionPeer = starsTransaction2.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    final long peerDialogId62 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z) {
                    }
                    chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId62));
                    if (chat2 != null) {
                    }
                }
                if (!TextUtils.isEmpty(starsTransaction2.id)) {
                    String string72 = LocaleController.getString(R.string.StarsTransactionID);
                    String str92 = starsTransaction2.id;
                    r11.addRowMonospaced(string72, str92, str92.length() <= 25 ? 9 : 10, new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda21
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarsIntroActivity.lambda$showTransactionSheet$56(bottomSheetArr, resourcesProvider3);
                        }
                    });
                }
                if (starsTransaction2.floodskip) {
                    r11.addRow(LocaleController.getString(R.string.StarsTransactionFloodskipNumberName), LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction2.floodskip_number));
                }
                String string82 = LocaleController.getString(R.string.StarsTransactionDate);
                int i162 = R.string.formatDateAtTime;
                r11.addRow(string82, LocaleController.formatString(i162, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction2.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction2.date * 1000))));
                starGift2 = starsTransaction2.stargift;
                if (starGift2 != null) {
                }
                ?? r32 = obj;
                r32.addView(r11, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                if ((starsTransaction2.flags & 32) != 0) {
                }
                LinkSpanDrawable.LinksTextView linksTextView32 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider3);
                linksTextView32.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
                linksTextView32.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
                linksTextView32.setTextSize(1, 14.0f);
                linksTextView32.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda23
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsIntroActivity.lambda$showTransactionSheet$57(context);
                    }
                }));
                linksTextView32.setGravity(17);
                r32.addView(linksTextView32, LayoutHelper.createLinear(-1, -2, 16.0f, 15.0f, 16.0f, 15.0f));
                ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider3);
                if ((starsTransaction2.flags & 32) == 0) {
                }
                buttonWithCounterView2.setText(string4, z2);
                r32.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 0.0f));
                ?? r12 = builder;
                r12.setCustomView(r32);
                BottomSheet create2 = r12.create();
                bottomSheetArr[0] = create2;
                create2.useBackgroundTopPadding = false;
                buttonWithCounterView2.setOnClickListener((starsTransaction2.flags & 32) == 0 ? new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda24
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarsIntroActivity.lambda$showTransactionSheet$58(context, starsTransaction2, view);
                    }
                } : new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda25
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarsIntroActivity.lambda$showTransactionSheet$59(bottomSheetArr, view);
                    }
                });
                bottomSheetArr[0].fixNavigationBar();
                safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (!AndroidUtilities.isTablet()) {
                    bottomSheetArr[0].makeAttached(safeLastFragment);
                }
                bottomSheetArr[0].show();
                return bottomSheetArr[0];
            }
        }
        str = "";
        str2 = "fragment";
        final BackupImageView backupImageView4 = new BackupImageView(context);
        if (!starsTransaction.premium_gift) {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 != null) {
                if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                    backupImageView4.setImageDrawable(new StarGiftSheet.StarGiftDrawableIcon(backupImageView4, starsTransaction.stargift, 94, 0.44f));
                    backupImageView = backupImageView4;
                    str3 = "/";
                    str4 = "⭐️ ";
                    builder = builder2;
                    i2 = 94;
                    i3 = 94;
                    i4 = 2;
                } else {
                    setGiftImage(backupImageView4.getImageReceiver(), starsTransaction.stargift, NotificationCenter.audioRecordTooShort);
                }
            } else {
                if (!z3 && !starsTransaction.gift) {
                    if (starsTransaction.extended_media.isEmpty()) {
                        BackupImageView backupImageView5 = backupImageView4;
                        str3 = "/";
                        str4 = "⭐️ ";
                        builder = builder2;
                        TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction.peer;
                        if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                            if (starsTransaction.photo != null) {
                                backupImageView5.setRoundRadius(AndroidUtilities.dp(50.0f));
                                backupImageView5.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "100_100", (Drawable) null, 0, (Object) null);
                            } else {
                                backupImageView5.setRoundRadius(AndroidUtilities.dp(50.0f));
                                if (z5) {
                                    peer = starsTransaction.starref_peer;
                                } else if (starsTransaction.subscription && z) {
                                    j2 = j;
                                    AvatarDrawable avatarDrawable = new AvatarDrawable();
                                    if (j2 < 0) {
                                        TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(j2));
                                        avatarDrawable.setInfo(user2);
                                        chat = user2;
                                    } else {
                                        TLRPC.Chat chat3 = MessagesController.getInstance(i).getChat(Long.valueOf(-j2));
                                        avatarDrawable.setInfo(chat3);
                                        chat = chat3;
                                    }
                                    backupImageView5.setForUserOrChat(chat, avatarDrawable);
                                } else {
                                    peer = starsTransaction.peer.peer;
                                }
                                j2 = DialogObject.getPeerDialogId(peer);
                                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                                if (j2 < 0) {
                                }
                                backupImageView5.setForUserOrChat(chat, avatarDrawable2);
                            }
                            i2 = 100;
                            i3 = 100;
                            i4 = 0;
                            backupImageView = backupImageView5;
                        } else {
                            CombinedDrawable createDrawable = SessionCell.createDrawable(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? str2 : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                            createDrawable.setIconSize(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                            backupImageView5.setImageDrawable(createDrawable);
                        }
                    } else {
                        backupImageView4.setRoundRadius(AndroidUtilities.dp(30.0f));
                        TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(0);
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            imageLocation = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia.photo);
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                            imageLocation = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia.document);
                        } else {
                            i5 = 0;
                            imageLocation = null;
                            backupImageView4.setImage(imageLocation, "100_100", (ImageLocation) null, (String) null, (Drawable) null, Integer.valueOf(i5));
                            linearLayout.addView(backupImageView4, LayoutHelper.createLinear(100, 100, 17, 0, 0, 0, 10));
                            str4 = "⭐️ ";
                            builder = builder2;
                            str3 = "/";
                            backupImageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda11
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarsIntroActivity.lambda$showTransactionSheet$26(z, j, starsTransaction, i, resourcesProvider, backupImageView4, linearLayout, view);
                                }
                            });
                        }
                        i5 = 0;
                        backupImageView4.setImage(imageLocation, "100_100", (ImageLocation) null, (String) null, (Drawable) null, Integer.valueOf(i5));
                        linearLayout.addView(backupImageView4, LayoutHelper.createLinear(100, 100, 17, 0, 0, 0, 10));
                        str4 = "⭐️ ";
                        builder = builder2;
                        str3 = "/";
                        backupImageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda11
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarsIntroActivity.lambda$showTransactionSheet$26(z, j, starsTransaction, i, resourcesProvider, backupImageView4, linearLayout, view);
                            }
                        });
                    }
                    TextView textView2 = new TextView(context);
                    int i17 = Theme.key_dialogTextBlack;
                    resourcesProvider2 = resourcesProvider;
                    textView2.setTextColor(Theme.getColor(i17, resourcesProvider2));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setGravity(17);
                    textView2.setText(getTransactionTitle(i, z, starsTransaction));
                    linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                    TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 18.0f);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setGravity(17);
                    textView3.setTextColor(Theme.getColor(positive ? Theme.key_color_green : Theme.key_color_red, resourcesProvider2));
                    textView3.setText(replaceStarsWithPlain(TextUtils.concat(positive ? "+" : str, formatStarsAmount(starsTransaction.stars), " ⭐️"), 0.8f));
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(textView3.getText());
                    if (starsTransaction.refund) {
                        i6 = R.string.StarsRefunded;
                    } else {
                        if (!starsTransaction.failed) {
                            if (starsTransaction.pending) {
                                textView3.setTextColor(Theme.getColor(Theme.key_color_yellow, resourcesProvider2));
                                i6 = R.string.StarsPending;
                            }
                            textView3.setText(spannableStringBuilder4);
                            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                            if (starsTransaction.paid_message || starsTransaction.starref_commission_permille <= 0 || !positive) {
                                j3 = j;
                                charSequence = " ";
                                if (z3 && !starsTransaction.gift) {
                                    if (starsTransaction.description != null && starsTransaction.extended_media.isEmpty()) {
                                        TextView textView4 = new TextView(context);
                                        textView4.setTextColor(Theme.getColor(i17, resourcesProvider2));
                                        textView4.setTextSize(1, 16.0f);
                                        textView4.setGravity(17);
                                        textView = textView4;
                                        str5 = starsTransaction.description;
                                    }
                                    bottomSheetArr = bottomSheetArr2;
                                    TableView tableView322 = new TableView(context, resourcesProvider2);
                                    starGift = starsTransaction.stargift;
                                    if (starGift == null) {
                                    }
                                    starsTransactionPeer = starsTransaction2.peer;
                                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                                    }
                                    if (!TextUtils.isEmpty(starsTransaction2.id)) {
                                    }
                                    if (starsTransaction2.floodskip) {
                                    }
                                    String string822 = LocaleController.getString(R.string.StarsTransactionDate);
                                    int i1622 = R.string.formatDateAtTime;
                                    r11.addRow(string822, LocaleController.formatString(i1622, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction2.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction2.date * 1000))));
                                    starGift2 = starsTransaction2.stargift;
                                    if (starGift2 != null) {
                                    }
                                    ?? r322 = obj;
                                    r322.addView(r11, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                                    if ((starsTransaction2.flags & 32) != 0) {
                                    }
                                    LinkSpanDrawable.LinksTextView linksTextView322 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider3);
                                    linksTextView322.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
                                    linksTextView322.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
                                    linksTextView322.setTextSize(1, 14.0f);
                                    linksTextView322.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda23
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarsIntroActivity.lambda$showTransactionSheet$57(context);
                                        }
                                    }));
                                    linksTextView322.setGravity(17);
                                    r322.addView(linksTextView322, LayoutHelper.createLinear(-1, -2, 16.0f, 15.0f, 16.0f, 15.0f));
                                    ButtonWithCounterView buttonWithCounterView22 = new ButtonWithCounterView(context, resourcesProvider3);
                                    if ((starsTransaction2.flags & 32) == 0) {
                                    }
                                    buttonWithCounterView22.setText(string4, z2);
                                    r322.addView(buttonWithCounterView22, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 0.0f));
                                    ?? r122 = builder;
                                    r122.setCustomView(r322);
                                    BottomSheet create22 = r122.create();
                                    bottomSheetArr[0] = create22;
                                    create22.useBackgroundTopPadding = false;
                                    buttonWithCounterView22.setOnClickListener((starsTransaction2.flags & 32) == 0 ? new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda24
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            StarsIntroActivity.lambda$showTransactionSheet$58(context, starsTransaction2, view);
                                        }
                                    } : new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda25
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            StarsIntroActivity.lambda$showTransactionSheet$59(bottomSheetArr, view);
                                        }
                                    });
                                    bottomSheetArr[0].fixNavigationBar();
                                    safeLastFragment = LaunchActivity.getSafeLastFragment();
                                    if (!AndroidUtilities.isTablet()) {
                                    }
                                    bottomSheetArr[0].show();
                                    return bottomSheetArr[0];
                                }
                                TLRPC.User user3 = starsTransaction.sent_by != null ? null : MessagesController.getInstance(i).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction.sent_by)));
                                TLRPC.User user4 = starsTransaction.sent_by != null ? null : MessagesController.getInstance(i).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction.received_by)));
                                isUserSelf = UserObject.isUserSelf(user3);
                                if (isUserSelf) {
                                    i7 = 1;
                                } else {
                                    textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
                                    i7 = 1;
                                    textView3.setText(replaceStarsWithPlain(TextUtils.concat(formatStarsAmount(starsTransaction.stars), " ⭐️"), 0.8f));
                                }
                                LinkSpanDrawable.LinksTextView linksTextView4 = new LinkSpanDrawable.LinksTextView(context);
                                linksTextView4.setTextColor(Theme.getColor(i17, resourcesProvider2));
                                linksTextView4.setTextSize(i7, 16.0f);
                                linksTextView4.setGravity(17);
                                linksTextView4.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
                                linksTextView4.setDisablePaddingsOffsetY(i7);
                                if (isUserSelf) {
                                    string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                } else {
                                    int i18 = R.string.ActionGiftStarsSubtitle;
                                    Object[] objArr = new Object[i7];
                                    objArr[0] = UserObject.getForcedFirstName(user4);
                                    string = LocaleController.formatString(i18, objArr);
                                }
                                bottomSheetArr = bottomSheetArr2;
                                linksTextView4.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), charSequence, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda26
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.lambda$showTransactionSheet$28(context, bottomSheetArr);
                                    }
                                }), true)));
                                linearLayout.addView(linksTextView4, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                                TableView tableView3222 = new TableView(context, resourcesProvider2);
                                starGift = starsTransaction.stargift;
                                if (starGift == null) {
                                }
                                starsTransactionPeer = starsTransaction2.peer;
                                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                                }
                                if (!TextUtils.isEmpty(starsTransaction2.id)) {
                                }
                                if (starsTransaction2.floodskip) {
                                }
                                String string8222 = LocaleController.getString(R.string.StarsTransactionDate);
                                int i16222 = R.string.formatDateAtTime;
                                r11.addRow(string8222, LocaleController.formatString(i16222, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction2.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction2.date * 1000))));
                                starGift2 = starsTransaction2.stargift;
                                if (starGift2 != null) {
                                }
                                ?? r3222 = obj;
                                r3222.addView(r11, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                                if ((starsTransaction2.flags & 32) != 0) {
                                }
                                LinkSpanDrawable.LinksTextView linksTextView3222 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider3);
                                linksTextView3222.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
                                linksTextView3222.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
                                linksTextView3222.setTextSize(1, 14.0f);
                                linksTextView3222.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda23
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.lambda$showTransactionSheet$57(context);
                                    }
                                }));
                                linksTextView3222.setGravity(17);
                                r3222.addView(linksTextView3222, LayoutHelper.createLinear(-1, -2, 16.0f, 15.0f, 16.0f, 15.0f));
                                ButtonWithCounterView buttonWithCounterView222 = new ButtonWithCounterView(context, resourcesProvider3);
                                if ((starsTransaction2.flags & 32) == 0) {
                                }
                                buttonWithCounterView222.setText(string4, z2);
                                r3222.addView(buttonWithCounterView222, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 0.0f));
                                ?? r1222 = builder;
                                r1222.setCustomView(r3222);
                                BottomSheet create222 = r1222.create();
                                bottomSheetArr[0] = create222;
                                create222.useBackgroundTopPadding = false;
                                buttonWithCounterView222.setOnClickListener((starsTransaction2.flags & 32) == 0 ? new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda24
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        StarsIntroActivity.lambda$showTransactionSheet$58(context, starsTransaction2, view);
                                    }
                                } : new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda25
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        StarsIntroActivity.lambda$showTransactionSheet$59(bottomSheetArr, view);
                                    }
                                });
                                bottomSheetArr[0].fixNavigationBar();
                                safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (!AndroidUtilities.isTablet()) {
                                }
                                bottomSheetArr[0].show();
                                return bottomSheetArr[0];
                            }
                            LinkSpanDrawable.LinksTextView linksTextView5 = new LinkSpanDrawable.LinksTextView(context);
                            linksTextView5.setTextColor(Theme.getColor(i17, resourcesProvider2));
                            linksTextView5.setTextSize(1, 14.0f);
                            linksTextView5.setGravity(17);
                            linksTextView5.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
                            linksTextView5.setDisablePaddingsOffsetY(true);
                            ?? spannableStringBuilder5 = new SpannableStringBuilder();
                            spannableStringBuilder5.append(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, AffiliateProgramFragment.percents(1000 - starsTransaction.starref_commission_permille))));
                            j3 = j;
                            if (j3 == UserConfig.getInstance(i).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i).getChat(Long.valueOf(-j3)), 2)) {
                                charSequence = " ";
                                spannableStringBuilder5.append(charSequence);
                                spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda22
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StarsIntroActivity.lambda$showTransactionSheet$27(j3, i);
                                    }
                                }), true));
                                textView = linksTextView5;
                                str5 = spannableStringBuilder5;
                            } else {
                                charSequence = " ";
                                textView = linksTextView5;
                                str5 = spannableStringBuilder5;
                            }
                            textView.setText(str5);
                            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                            bottomSheetArr = bottomSheetArr2;
                            TableView tableView32222 = new TableView(context, resourcesProvider2);
                            starGift = starsTransaction.stargift;
                            if (starGift == null) {
                            }
                            starsTransactionPeer = starsTransaction2.peer;
                            if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                            }
                            if (!TextUtils.isEmpty(starsTransaction2.id)) {
                            }
                            if (starsTransaction2.floodskip) {
                            }
                            String string82222 = LocaleController.getString(R.string.StarsTransactionDate);
                            int i162222 = R.string.formatDateAtTime;
                            r11.addRow(string82222, LocaleController.formatString(i162222, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction2.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction2.date * 1000))));
                            starGift2 = starsTransaction2.stargift;
                            if (starGift2 != null) {
                            }
                            ?? r32222 = obj;
                            r32222.addView(r11, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                            if ((starsTransaction2.flags & 32) != 0) {
                            }
                            LinkSpanDrawable.LinksTextView linksTextView32222 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider3);
                            linksTextView32222.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
                            linksTextView32222.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
                            linksTextView32222.setTextSize(1, 14.0f);
                            linksTextView32222.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda23
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarsIntroActivity.lambda$showTransactionSheet$57(context);
                                }
                            }));
                            linksTextView32222.setGravity(17);
                            r32222.addView(linksTextView32222, LayoutHelper.createLinear(-1, -2, 16.0f, 15.0f, 16.0f, 15.0f));
                            ButtonWithCounterView buttonWithCounterView2222 = new ButtonWithCounterView(context, resourcesProvider3);
                            if ((starsTransaction2.flags & 32) == 0) {
                            }
                            buttonWithCounterView2222.setText(string4, z2);
                            r32222.addView(buttonWithCounterView2222, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 0.0f));
                            ?? r12222 = builder;
                            r12222.setCustomView(r32222);
                            BottomSheet create2222 = r12222.create();
                            bottomSheetArr[0] = create2222;
                            create2222.useBackgroundTopPadding = false;
                            buttonWithCounterView2222.setOnClickListener((starsTransaction2.flags & 32) == 0 ? new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda24
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarsIntroActivity.lambda$showTransactionSheet$58(context, starsTransaction2, view);
                                }
                            } : new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda25
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarsIntroActivity.lambda$showTransactionSheet$59(bottomSheetArr, view);
                                }
                            });
                            bottomSheetArr[0].fixNavigationBar();
                            safeLastFragment = LaunchActivity.getSafeLastFragment();
                            if (!AndroidUtilities.isTablet()) {
                            }
                            bottomSheetArr[0].show();
                            return bottomSheetArr[0];
                        }
                        textView3.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider2));
                        i6 = R.string.StarsFailed;
                    }
                    appendStatus(spannableStringBuilder4, textView3, LocaleController.getString(i6));
                    textView3.setText(spannableStringBuilder4);
                    linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                    if (starsTransaction.paid_message) {
                    }
                    j3 = j;
                    charSequence = " ";
                    if (z3) {
                    }
                    if (starsTransaction.sent_by != null) {
                    }
                    if (starsTransaction.sent_by != null) {
                    }
                    isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                    }
                    LinkSpanDrawable.LinksTextView linksTextView42 = new LinkSpanDrawable.LinksTextView(context);
                    linksTextView42.setTextColor(Theme.getColor(i17, resourcesProvider2));
                    linksTextView42.setTextSize(i7, 16.0f);
                    linksTextView42.setGravity(17);
                    linksTextView42.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
                    linksTextView42.setDisablePaddingsOffsetY(i7);
                    if (isUserSelf) {
                    }
                    bottomSheetArr = bottomSheetArr2;
                    linksTextView42.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), charSequence, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda26
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarsIntroActivity.lambda$showTransactionSheet$28(context, bottomSheetArr);
                        }
                    }), true)));
                    linearLayout.addView(linksTextView42, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
                    TableView tableView322222 = new TableView(context, resourcesProvider2);
                    starGift = starsTransaction.stargift;
                    if (starGift == null) {
                    }
                    starsTransactionPeer = starsTransaction2.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    if (!TextUtils.isEmpty(starsTransaction2.id)) {
                    }
                    if (starsTransaction2.floodskip) {
                    }
                    String string822222 = LocaleController.getString(R.string.StarsTransactionDate);
                    int i1622222 = R.string.formatDateAtTime;
                    r11.addRow(string822222, LocaleController.formatString(i1622222, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction2.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction2.date * 1000))));
                    starGift2 = starsTransaction2.stargift;
                    if (starGift2 != null) {
                    }
                    ?? r322222 = obj;
                    r322222.addView(r11, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
                    if ((starsTransaction2.flags & 32) != 0) {
                    }
                    LinkSpanDrawable.LinksTextView linksTextView322222 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider3);
                    linksTextView322222.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
                    linksTextView322222.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
                    linksTextView322222.setTextSize(1, 14.0f);
                    linksTextView322222.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda23
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarsIntroActivity.lambda$showTransactionSheet$57(context);
                        }
                    }));
                    linksTextView322222.setGravity(17);
                    r322222.addView(linksTextView322222, LayoutHelper.createLinear(-1, -2, 16.0f, 15.0f, 16.0f, 15.0f));
                    ButtonWithCounterView buttonWithCounterView22222 = new ButtonWithCounterView(context, resourcesProvider3);
                    if ((starsTransaction2.flags & 32) == 0) {
                    }
                    buttonWithCounterView22222.setText(string4, z2);
                    r322222.addView(buttonWithCounterView22222, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    ?? r122222 = builder;
                    r122222.setCustomView(r322222);
                    BottomSheet create22222 = r122222.create();
                    bottomSheetArr[0] = create22222;
                    create22222.useBackgroundTopPadding = false;
                    buttonWithCounterView22222.setOnClickListener((starsTransaction2.flags & 32) == 0 ? new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda24
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StarsIntroActivity.lambda$showTransactionSheet$58(context, starsTransaction2, view);
                        }
                    } : new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda25
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StarsIntroActivity.lambda$showTransactionSheet$59(bottomSheetArr, view);
                        }
                    });
                    bottomSheetArr[0].fixNavigationBar();
                    safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    bottomSheetArr[0].show();
                    return bottomSheetArr[0];
                }
                BackupImageView backupImageView6 = backupImageView4;
                str3 = "/";
                str4 = "⭐️ ";
                builder = builder2;
                setGiftImage(backupImageView6, backupImageView6.getImageReceiver(), starsTransaction.stars.amount);
                backupImageView2 = backupImageView6;
                i2 = NotificationCenter.audioRecordTooShort;
                i3 = NotificationCenter.audioRecordTooShort;
                i4 = -8;
                backupImageView = backupImageView2;
            }
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(i2, i3, 17, 0, i4, 0, 10));
            TextView textView22 = new TextView(context);
            int i172 = Theme.key_dialogTextBlack;
            resourcesProvider2 = resourcesProvider;
            textView22.setTextColor(Theme.getColor(i172, resourcesProvider2));
            textView22.setTextSize(1, 20.0f);
            textView22.setTypeface(AndroidUtilities.bold());
            textView22.setGravity(17);
            textView22.setText(getTransactionTitle(i, z, starsTransaction));
            linearLayout.addView(textView22, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
            TextView textView32 = new TextView(context);
            textView32.setTextSize(1, 18.0f);
            textView32.setTypeface(AndroidUtilities.bold());
            textView32.setGravity(17);
            textView32.setTextColor(Theme.getColor(positive ? Theme.key_color_green : Theme.key_color_red, resourcesProvider2));
            textView32.setText(replaceStarsWithPlain(TextUtils.concat(positive ? "+" : str, formatStarsAmount(starsTransaction.stars), " ⭐️"), 0.8f));
            SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(textView32.getText());
            if (starsTransaction.refund) {
            }
            appendStatus(spannableStringBuilder42, textView32, LocaleController.getString(i6));
            textView32.setText(spannableStringBuilder42);
            linearLayout.addView(textView32, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
            if (starsTransaction.paid_message) {
            }
            j3 = j;
            charSequence = " ";
            if (z3) {
            }
            if (starsTransaction.sent_by != null) {
            }
            if (starsTransaction.sent_by != null) {
            }
            isUserSelf = UserObject.isUserSelf(user3);
            if (isUserSelf) {
            }
            LinkSpanDrawable.LinksTextView linksTextView422 = new LinkSpanDrawable.LinksTextView(context);
            linksTextView422.setTextColor(Theme.getColor(i172, resourcesProvider2));
            linksTextView422.setTextSize(i7, 16.0f);
            linksTextView422.setGravity(17);
            linksTextView422.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
            linksTextView422.setDisablePaddingsOffsetY(i7);
            if (isUserSelf) {
            }
            bottomSheetArr = bottomSheetArr2;
            linksTextView422.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), charSequence, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showTransactionSheet$28(context, bottomSheetArr);
                }
            }), true)));
            linearLayout.addView(linksTextView422, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
            TableView tableView3222222 = new TableView(context, resourcesProvider2);
            starGift = starsTransaction.stargift;
            if (starGift == null) {
            }
            starsTransactionPeer = starsTransaction2.peer;
            if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
            }
            if (!TextUtils.isEmpty(starsTransaction2.id)) {
            }
            if (starsTransaction2.floodskip) {
            }
            String string8222222 = LocaleController.getString(R.string.StarsTransactionDate);
            int i16222222 = R.string.formatDateAtTime;
            r11.addRow(string8222222, LocaleController.formatString(i16222222, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction2.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction2.date * 1000))));
            starGift2 = starsTransaction2.stargift;
            if (starGift2 != null) {
            }
            ?? r3222222 = obj;
            r3222222.addView(r11, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
            if ((starsTransaction2.flags & 32) != 0) {
            }
            LinkSpanDrawable.LinksTextView linksTextView3222222 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider3);
            linksTextView3222222.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
            linksTextView3222222.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
            linksTextView3222222.setTextSize(1, 14.0f);
            linksTextView3222222.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.lambda$showTransactionSheet$57(context);
                }
            }));
            linksTextView3222222.setGravity(17);
            r3222222.addView(linksTextView3222222, LayoutHelper.createLinear(-1, -2, 16.0f, 15.0f, 16.0f, 15.0f));
            ButtonWithCounterView buttonWithCounterView222222 = new ButtonWithCounterView(context, resourcesProvider3);
            if ((starsTransaction2.flags & 32) == 0) {
            }
            buttonWithCounterView222222.setText(string4, z2);
            r3222222.addView(buttonWithCounterView222222, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 0.0f));
            ?? r1222222 = builder;
            r1222222.setCustomView(r3222222);
            BottomSheet create222222 = r1222222.create();
            bottomSheetArr[0] = create222222;
            create222222.useBackgroundTopPadding = false;
            buttonWithCounterView222222.setOnClickListener((starsTransaction2.flags & 32) == 0 ? new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda24
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarsIntroActivity.lambda$showTransactionSheet$58(context, starsTransaction2, view);
                }
            } : new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarsIntroActivity.lambda$showTransactionSheet$59(bottomSheetArr, view);
                }
            });
            bottomSheetArr[0].fixNavigationBar();
            safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (!AndroidUtilities.isTablet()) {
            }
            bottomSheetArr[0].show();
            return bottomSheetArr[0];
        }
        setPremiumGiftImage(backupImageView4, backupImageView4.getImageReceiver(), starsTransaction.premium_gift_months);
        backupImageView2 = backupImageView4;
        str3 = "/";
        str4 = "⭐️ ";
        builder = builder2;
        i2 = NotificationCenter.audioRecordTooShort;
        i3 = NotificationCenter.audioRecordTooShort;
        i4 = -8;
        backupImageView = backupImageView2;
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(i2, i3, 17, 0, i4, 0, 10));
        TextView textView222 = new TextView(context);
        int i1722 = Theme.key_dialogTextBlack;
        resourcesProvider2 = resourcesProvider;
        textView222.setTextColor(Theme.getColor(i1722, resourcesProvider2));
        textView222.setTextSize(1, 20.0f);
        textView222.setTypeface(AndroidUtilities.bold());
        textView222.setGravity(17);
        textView222.setText(getTransactionTitle(i, z, starsTransaction));
        linearLayout.addView(textView222, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
        TextView textView322 = new TextView(context);
        textView322.setTextSize(1, 18.0f);
        textView322.setTypeface(AndroidUtilities.bold());
        textView322.setGravity(17);
        textView322.setTextColor(Theme.getColor(positive ? Theme.key_color_green : Theme.key_color_red, resourcesProvider2));
        textView322.setText(replaceStarsWithPlain(TextUtils.concat(positive ? "+" : str, formatStarsAmount(starsTransaction.stars), " ⭐️"), 0.8f));
        SpannableStringBuilder spannableStringBuilder422 = new SpannableStringBuilder(textView322.getText());
        if (starsTransaction.refund) {
        }
        appendStatus(spannableStringBuilder422, textView322, LocaleController.getString(i6));
        textView322.setText(spannableStringBuilder422);
        linearLayout.addView(textView322, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
        if (starsTransaction.paid_message) {
        }
        j3 = j;
        charSequence = " ";
        if (z3) {
        }
        if (starsTransaction.sent_by != null) {
        }
        if (starsTransaction.sent_by != null) {
        }
        isUserSelf = UserObject.isUserSelf(user3);
        if (isUserSelf) {
        }
        LinkSpanDrawable.LinksTextView linksTextView4222 = new LinkSpanDrawable.LinksTextView(context);
        linksTextView4222.setTextColor(Theme.getColor(i1722, resourcesProvider2));
        linksTextView4222.setTextSize(i7, 16.0f);
        linksTextView4222.setGravity(17);
        linksTextView4222.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
        linksTextView4222.setDisablePaddingsOffsetY(i7);
        if (isUserSelf) {
        }
        bottomSheetArr = bottomSheetArr2;
        linksTextView4222.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), charSequence, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showTransactionSheet$28(context, bottomSheetArr);
            }
        }), true)));
        linearLayout.addView(linksTextView4222, LayoutHelper.createLinear(-1, -2, 17, 36, 0, 36, 4));
        TableView tableView32222222 = new TableView(context, resourcesProvider2);
        starGift = starsTransaction.stargift;
        if (starGift == null) {
        }
        starsTransactionPeer = starsTransaction2.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        if (!TextUtils.isEmpty(starsTransaction2.id)) {
        }
        if (starsTransaction2.floodskip) {
        }
        String string82222222 = LocaleController.getString(R.string.StarsTransactionDate);
        int i162222222 = R.string.formatDateAtTime;
        r11.addRow(string82222222, LocaleController.formatString(i162222222, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction2.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction2.date * 1000))));
        starGift2 = starsTransaction2.stargift;
        if (starGift2 != null) {
        }
        ?? r32222222 = obj;
        r32222222.addView(r11, LayoutHelper.createLinear(-1, -2, 16.0f, 17.0f, 16.0f, 0.0f));
        if ((starsTransaction2.flags & 32) != 0) {
        }
        LinkSpanDrawable.LinksTextView linksTextView32222222 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider3);
        linksTextView32222222.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider3));
        linksTextView32222222.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider3));
        linksTextView32222222.setTextSize(1, 14.0f);
        linksTextView32222222.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$showTransactionSheet$57(context);
            }
        }));
        linksTextView32222222.setGravity(17);
        r32222222.addView(linksTextView32222222, LayoutHelper.createLinear(-1, -2, 16.0f, 15.0f, 16.0f, 15.0f));
        ButtonWithCounterView buttonWithCounterView2222222 = new ButtonWithCounterView(context, resourcesProvider3);
        if ((starsTransaction2.flags & 32) == 0) {
        }
        buttonWithCounterView2222222.setText(string4, z2);
        r32222222.addView(buttonWithCounterView2222222, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        ?? r12222222 = builder;
        r12222222.setCustomView(r32222222);
        BottomSheet create2222222 = r12222222.create();
        bottomSheetArr[0] = create2222222;
        create2222222.useBackgroundTopPadding = false;
        buttonWithCounterView2222222.setOnClickListener((starsTransaction2.flags & 32) == 0 ? new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda24
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$showTransactionSheet$58(context, starsTransaction2, view);
            }
        } : new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarsIntroActivity.lambda$showTransactionSheet$59(bottomSheetArr, view);
            }
        });
        bottomSheetArr[0].fixNavigationBar();
        safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet()) {
        }
        bottomSheetArr[0].show();
        return bottomSheetArr[0];
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
                    StarsIntroActivity.this.lambda$updateButtonsLayouts$6(z);
                }
            }).start();
            this.twoButtonsLayout.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda40
                @Override // java.lang.Runnable
                public final void run() {
                    StarsIntroActivity.this.lambda$updateButtonsLayouts$7(z);
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

    public boolean attachedTransactionsLayout() {
        StarsTransactionsLayout starsTransactionsLayout = this.transactionsLayout;
        if (starsTransactionsLayout == null || !(starsTransactionsLayout.getParent() instanceof View)) {
            return false;
        }
        return this.listView.getHeight() - ((View) this.transactionsLayout.getParent()).getBottom() >= 0;
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    protected RecyclerView.Adapter createAdapter() {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.listView, getContext(), this.currentAccount, this.classGuid, true, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda42
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StarsIntroActivity.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, getResourceProvider()) { // from class: org.telegram.ui.Stars.StarsIntroActivity.5
            @Override // org.telegram.ui.Components.UniversalAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i != 42) {
                    return super.onCreateViewHolder(viewGroup, i);
                }
                HeaderCell headerCell = new HeaderCell(StarsIntroActivity.this.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, false, ((BaseFragment) StarsIntroActivity.this).resourceProvider);
                headerCell.setHeight(25);
                return new RecyclerListView.Holder(headerCell);
            }
        };
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    protected GradientHeaderActivity.ContentView createContentView() {
        return new NestedFrameLayout(getContext());
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    public StarParticlesView createParticlesView() {
        return makeParticlesView(getContext(), 75, 1);
    }

    @Override // org.telegram.ui.GradientHeaderActivity, org.telegram.ui.ActionBar.BaseFragment
    public View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        this.transactionsLayout = new StarsTransactionsLayout(context, this.currentAccount, 0L, getClassGuid(), getResourceProvider());
        View view = new View(context) { // from class: org.telegram.ui.Stars.StarsIntroActivity.1
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
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - (((GradientHeaderActivity) StarsIntroActivity.this).yOffset * 2.5f)), 1073741824));
            }
        };
        this.emptyLayout = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray));
        super.createView(context);
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
        this.aboveTitleView.addView(this.iconTextureView, LayoutHelper.createFrame(NotificationCenter.storiesLimitUpdate, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        configureHeader(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new Runnable() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                StarsIntroActivity.lambda$createView$0(context);
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
            public final void onItemClick(View view2, int i) {
                StarsIntroActivity.this.lambda$createView$1(view2, i);
            }
        });
        FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
        this.fireworksOverlay = fireworksOverlay;
        this.contentView.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        StarsController starsController = StarsController.getInstance(this.currentAccount);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.balanceLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.balanceLayout.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
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
        buttonWithCounterView.setText("", false);
        this.buyButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StarsIntroActivity.this.lambda$createView$2(context, view2);
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
        this.topupButton = new ButtonWithCounterView(getContext(), this.resourceProvider);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.topupButton.setText(spannableStringBuilder, false);
        this.topupButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StarsIntroActivity.this.lambda$createView$3(context, view2);
            }
        });
        this.twoButtonsLayout.addView(this.topupButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        this.withdrawButton = new ButtonWithCounterView(getContext(), this.resourceProvider);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.withdrawButton.setText(spannableStringBuilder2, false);
        this.withdrawButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StarsIntroActivity.this.lambda$createView$4(view2);
            }
        });
        this.twoButtonsLayout.addView(this.withdrawButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.balanceLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        this.giftButton = new ButtonWithCounterView(getContext(), false, this.resourceProvider);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new ColoredImageSpan(R.drawable.menu_stars_gift), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.giftButton.setText(spannableStringBuilder3, false);
        this.giftButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StarsIntroActivity.this.lambda$createView$5(view2);
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        r2.savedScrollOffset = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r2.savedScrollOffset < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r2.savedScrollOffset < 0) goto L23;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starOptionsLoaded) {
            saveScrollPosition();
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(true);
            }
            if (this.savedScrollPosition == 0) {
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
                if (this.savedScrollPosition == 0) {
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
        if (i == NotificationCenter.starBalanceUpdated || (i == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue())) {
            updateBalance();
        }
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    protected boolean drawActionBarShadow() {
        return !attachedTransactionsLayout();
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        UItem accent;
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
                accent = UItem.asFlicker(arrayList.size(), 33);
            } else {
                if (!starsController.didFullyLoadSubscriptions()) {
                    accent = UItem.asButton(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand)).accent();
                }
                arrayList.add(UItem.asShadow(null));
            }
            arrayList.add(accent);
            arrayList.add(UItem.asShadow(null));
        }
        boolean hasTransactions = starsController.hasTransactions();
        this.hadTransactions = hasTransactions;
        arrayList.add(hasTransactions ? UItem.asFullscreenCustom(this.transactionsLayout, ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) : UItem.asCustom(this.emptyLayout));
    }

    @Override // org.telegram.ui.GradientHeaderActivity
    protected View getHeader(Context context) {
        return super.getHeader(context);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public int getNavigationBarColor() {
        return Theme.getColor(Theme.key_dialogBackgroundGray);
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

    public void onItemClick(final UItem uItem, int i) {
        int i2 = uItem.id;
        if (i2 == -1) {
            this.expanded = !this.expanded;
        } else {
            if (i2 == -2) {
                StarsController.getInstance(this.currentAccount).getGiftOptions();
                UserSelectorBottomSheet.open(1, 0L, BirthdayController.getInstance(this.currentAccount).getState());
                return;
            }
            if (i2 != -3) {
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
                                StarsIntroActivity.this.lambda$onItemClick$8(uItem, (Boolean) obj, (String) obj2);
                            }
                        });
                        return;
                    }
                    return;
                } else {
                    if (uItem.instanceOf(StarsSubscriptionView.Factory.class) && (uItem.object instanceof TL_stars.StarsSubscription)) {
                        showSubscriptionSheet(getContext(), this.currentAccount, (TL_stars.StarsSubscription) uItem.object, getResourceProvider());
                        return;
                    }
                    return;
                }
            }
            StarsController.getInstance(this.currentAccount).loadSubscriptions();
        }
        this.adapter.update(true);
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

    @Override // org.telegram.ui.GradientHeaderActivity, org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(false);
            this.iconTextureView.setDialogVisible(false);
        }
    }
}
