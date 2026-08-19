package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.ChannelColorActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.LoginOrView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.boosts.BoostCounterView;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GroupColorActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.ChannelBoostUtilities;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryRecorder;

/* loaded from: classes5.dex */
public class LimitReachedBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    TextView actionBtn;
    ArrayList boostFeatures;
    int boostFeaturesStartRow;
    ButtonWithCounterView boostMiniBtn;
    private ButtonWithCounterView boostToUnlockGroupBtn;
    private TL_stories.TL_premium_boostsStatus boostsStatus;
    int bottomRow;
    private ChannelBoostsController.CanApplyBoost canApplyBoost;
    private boolean canSendLink;
    int chatEndRow;
    private ChatMessageCell chatMessageCell;
    int chatStartRow;
    ArrayList chats;
    int chatsTitleRow;
    private int currentValue;
    private long dialogId;
    View divider;
    int dividerRow;
    int emptyViewDividerRow;
    RecyclerItemsEnterAnimator enterAnimator;
    FireworksOverlay fireworksOverlay;
    private String forceLink;
    private TLRPC.Chat fromChat;
    int headerRow;
    private HeaderView headerView;
    private ArrayList inactiveChats;
    private ArrayList inactiveChatsSignatures;
    private boolean isCurrentChat;
    private boolean isVeryLargeFile;
    LimitParams limitParams;
    LimitPreviewView limitPreviewView;
    private int linkRow;
    private boolean loading;
    boolean loadingAdminedChannels;
    int loadingRow;
    private boolean lockInvalidation;
    public Runnable onShowPremiumScreenRunnable;
    public Runnable onSuccessRunnable;
    BaseFragment parentFragment;
    public boolean parentIsChannel;
    boolean premiumButtonSetSubscribe;
    PremiumButtonView premiumButtonView;
    private ArrayList premiumInviteBlockedUsers;
    private ArrayList premiumMessagingBlockedUsers;
    private int requiredLvl;
    private ArrayList restrictedUsers;
    int rowCount;
    HashSet selectedChats;
    private int shiftDp;
    Runnable statisticClickRunnable;
    protected int storiesCount;
    final int type;

    public static class LimitParams {
        int icon = 0;
        String descriptionStr = null;
        String descriptionStrPremium = null;
        String descriptionStrLocked = null;
        int defaultLimit = 0;
        int premiumLimit = 0;
    }

    private static boolean hasFixedSize(int i) {
        return i == 0 || i == 33 || i == 3 || i == 4 || i == 6 || i == 7 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16;
    }

    protected int channelColorLevelMin() {
        return 0;
    }

    public static String limitTypeToServerString(int i) {
        switch (i) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    private static class BoostFeature {
        public final int countPlural;
        public final String countValue;
        public final int iconResId;
        public boolean incremental;
        public final int textKey;
        public final String textKeyPlural;

        private BoostFeature(int i, int i2, String str, String str2, int i3) {
            this.iconResId = i;
            this.textKey = i2;
            this.countValue = str;
            this.textKeyPlural = str2;
            this.countPlural = i3;
        }

        public static BoostFeature of(int i, int i2) {
            return new BoostFeature(i, i2, null, null, -1);
        }

        public static BoostFeature of(int i, int i2, String str) {
            return new BoostFeature(i, i2, str, null, -1);
        }

        public static BoostFeature of(int i, String str, int i2) {
            return new BoostFeature(i, -1, null, str, i2);
        }

        public boolean equals(BoostFeature boostFeature) {
            if (boostFeature == null) {
                return false;
            }
            if (!this.incremental || this.countPlural <= 2) {
                return this.iconResId == boostFeature.iconResId && this.textKey == boostFeature.textKey && TextUtils.equals(this.countValue, boostFeature.countValue) && TextUtils.equals(this.textKeyPlural, boostFeature.textKeyPlural) && this.countPlural == boostFeature.countPlural;
            }
            return true;
        }

        public BoostFeature asIncremental() {
            this.incremental = true;
            return this;
        }

        public static boolean arraysEqual(ArrayList arrayList, ArrayList arrayList2) {
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if ((arrayList != null && arrayList2 == null) || ((arrayList == null && arrayList2 != null) || arrayList.size() != arrayList2.size())) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (!((BoostFeature) arrayList.get(i)).equals((BoostFeature) arrayList2.get(i))) {
                    return false;
                }
            }
            return true;
        }

        public static class BoostFeatureLevel extends BoostFeature {
            public final boolean isFirst;
            public final int lvl;

            @Override // org.telegram.ui.Components.Premium.LimitReachedBottomSheet.BoostFeature
            public /* bridge */ /* synthetic */ BoostFeature asIncremental() {
                return super.asIncremental();
            }

            @Override // org.telegram.ui.Components.Premium.LimitReachedBottomSheet.BoostFeature
            public /* bridge */ /* synthetic */ boolean equals(BoostFeature boostFeature) {
                return super.equals(boostFeature);
            }

            public BoostFeatureLevel(int i, boolean z) {
                super(-1, -1, null, null, -1);
                this.lvl = i;
                this.isFirst = z;
            }
        }
    }

    public LimitReachedBottomSheet(BaseFragment baseFragment, Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(context, baseFragment, false, hasFixedSize(i), false, resourcesProvider);
        this.linkRow = -1;
        this.lockInvalidation = false;
        this.chats = new ArrayList();
        this.headerRow = -1;
        this.dividerRow = -1;
        this.chatsTitleRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.loadingRow = -1;
        this.emptyViewDividerRow = -1;
        this.bottomRow = -1;
        this.boostFeaturesStartRow = -1;
        this.currentValue = -1;
        this.selectedChats = new HashSet();
        this.inactiveChats = new ArrayList();
        this.inactiveChatsSignatures = new ArrayList();
        this.restrictedUsers = new ArrayList();
        this.premiumMessagingBlockedUsers = new ArrayList();
        this.premiumInviteBlockedUsers = new ArrayList();
        this.loading = false;
        this.requiredLvl = 0;
        this.shiftDp = -4;
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        this.parentFragment = baseFragment;
        this.currentAccount = i2;
        this.type = i;
        updateTitle();
        updateRows();
        if (i == 2) {
            loadAdminedChannels();
        } else if (i == 5) {
            loadInactiveChannels();
        }
        updatePremiumButtonText();
        if (i == 32 || isBoostingForAdminPossible()) {
            FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
            this.fireworksOverlay = fireworksOverlay;
            this.container.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35 || i == 31) {
            ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            View view = this.divider;
            if (view != null) {
                ((ViewGroup) view.getParent()).removeView(this.divider);
            }
            this.recyclerListView.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.actionBtn = textView;
            textView.setGravity(17);
            this.actionBtn.setEllipsize(TextUtils.TruncateAt.END);
            this.actionBtn.setSingleLine(true);
            this.actionBtn.setTextSize(1, 14.0f);
            this.actionBtn.setTypeface(AndroidUtilities.bold());
            this.actionBtn.setText(this.premiumButtonView.getTextView().getText());
            this.actionBtn.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            this.actionBtn.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LimitReachedBottomSheet.$r8$lambda$8sPXYsfS6jQJV7bAoCY9loxFc1o(LimitReachedBottomSheet.this, view2);
                }
            });
            this.actionBtn.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), 120)));
        }
        if (i == 32) {
            ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            this.boostToUnlockGroupBtn = buttonWithCounterView;
            buttonWithCounterView.withCounterIcon();
            this.boostToUnlockGroupBtn.setText(LocaleController.getString(R.string.BoostGroup), false);
            this.boostToUnlockGroupBtn.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LimitReachedBottomSheet.$r8$lambda$pM7k7TR0ymI4bqFT5eETBzJklbs(LimitReachedBottomSheet.this, view2);
                }
            });
            this.containerView.addView(this.boostToUnlockGroupBtn, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    r0.boostToUnlockGroupBtn.setCount(LimitReachedBottomSheet.this.getNeededBoostsForUnlockGroup(), false);
                }
            });
        }
        if (i == 19 || i == 18) {
            this.containerView.post(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    LimitReachedBottomSheet.$r8$lambda$gCE9Xu_7dKKCUmbrZk20hMPR-hU(LimitReachedBottomSheet.this);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$8sPXYsfS6jQJV7bAoCY9loxFc1o(LimitReachedBottomSheet limitReachedBottomSheet, View view) {
        AndroidUtilities.addToClipboard(limitReachedBottomSheet.getBoostLink());
        limitReachedBottomSheet.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$pM7k7TR0ymI4bqFT5eETBzJklbs(LimitReachedBottomSheet limitReachedBottomSheet, View view) {
        if (limitReachedBottomSheet.premiumButtonView.isShowOverlay()) {
            limitReachedBottomSheet.premiumButtonView.overlayTextView.performClick();
        } else {
            limitReachedBottomSheet.premiumButtonView.buttonLayout.performClick();
        }
    }

    public static /* synthetic */ void $r8$lambda$gCE9Xu_7dKKCUmbrZk20hMPR-hU(LimitReachedBottomSheet limitReachedBottomSheet) {
        if (ChatObject.hasAdminRights(limitReachedBottomSheet.getChat())) {
            if (limitReachedBottomSheet.premiumButtonView.getParent() != null) {
                ((ViewGroup) limitReachedBottomSheet.premiumButtonView.getParent()).removeView(limitReachedBottomSheet.premiumButtonView);
            }
            View view = limitReachedBottomSheet.divider;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) limitReachedBottomSheet.divider.getParent()).removeView(limitReachedBottomSheet.divider);
            }
            limitReachedBottomSheet.recyclerListView.setPadding(0, 0, 0, 0);
        }
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    public void onViewCreated(FrameLayout frameLayout) {
        int i;
        super.onViewCreated(frameLayout);
        final Context context = frameLayout.getContext();
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        this.boostMiniBtn = buttonWithCounterView;
        buttonWithCounterView.setFlickeringLoading(true);
        this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), false);
        this.boostMiniBtn.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LimitReachedBottomSheet.$r8$lambda$8k1IM18OauDQ1lyBNn_nUxNaaUM(LimitReachedBottomSheet.this, view);
            }
        });
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, true, this.resourcesProvider) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.1
            @Override // android.view.View
            public void invalidate() {
                if (LimitReachedBottomSheet.this.lockInvalidation) {
                    return;
                }
                super.invalidate();
            }
        };
        this.premiumButtonView = premiumButtonView;
        ScaleStateListAnimator.apply(premiumButtonView, 0.02f, 1.2f);
        if (!this.hasFixedSize && (i = this.type) != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
            View view = new View(context) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.2
                @Override // android.view.View
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                    if (limitReachedBottomSheet.chatEndRow - limitReachedBottomSheet.chatStartRow > 1) {
                        Paint themePaint = Theme.getThemePaint("paintDivider", ((BottomSheet) limitReachedBottomSheet).resourcesProvider);
                        if (themePaint == null) {
                            themePaint = Theme.dividerPaint;
                        }
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, themePaint);
                    }
                }
            };
            this.divider = view;
            view.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
            frameLayout.addView(this.divider, LayoutHelper.createFrame(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        PremiumButtonView premiumButtonView2 = this.premiumButtonView;
        float f = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        frameLayout.addView(premiumButtonView2, LayoutHelper.createFrame(-1, 48.0f, 80, f, 0.0f, f, 12.0f));
        this.recyclerListView.setPadding(0, 0, 0, AndroidUtilities.dp(72.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setClipChildren(false);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda6
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view2, int i2) {
                LimitReachedBottomSheet.$r8$lambda$xd4RS7mAXpbIREx4SDB327VVUb0(LimitReachedBottomSheet.this, view2, i2);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda7
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view2, int i2) {
                return LimitReachedBottomSheet.$r8$lambda$Ov-tIN_h6Km8FuZvyq8gjxWurl0(LimitReachedBottomSheet.this, view2, i2);
            }
        });
        this.premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LimitReachedBottomSheet.$r8$lambda$x5owksAeIFvZxm_ZLh37BQf0SLs(LimitReachedBottomSheet.this, context, view2);
            }
        });
        this.premiumButtonView.overlayTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LimitReachedBottomSheet.$r8$lambda$_wWh7f4SEaxR5GZ4jFdnx8HLidk(LimitReachedBottomSheet.this, view2);
            }
        });
        this.enterAnimator = new RecyclerItemsEnterAnimator(this.recyclerListView, true);
    }

    public static /* synthetic */ void $r8$lambda$8k1IM18OauDQ1lyBNn_nUxNaaUM(LimitReachedBottomSheet limitReachedBottomSheet, View view) {
        if (limitReachedBottomSheet.premiumButtonView.isShowOverlay()) {
            limitReachedBottomSheet.premiumButtonView.overlayTextView.performClick();
        } else {
            limitReachedBottomSheet.premiumButtonView.buttonLayout.performClick();
        }
    }

    public static /* synthetic */ void $r8$lambda$xd4RS7mAXpbIREx4SDB327VVUb0(LimitReachedBottomSheet limitReachedBottomSheet, View view, int i) {
        int i2;
        limitReachedBottomSheet.getClass();
        if (view instanceof AdminedChannelCell) {
            AdminedChannelCell adminedChannelCell = (AdminedChannelCell) view;
            TLRPC.Chat currentChannel = adminedChannelCell.getCurrentChannel();
            if (limitReachedBottomSheet.selectedChats.contains(currentChannel)) {
                limitReachedBottomSheet.selectedChats.remove(currentChannel);
            } else {
                limitReachedBottomSheet.selectedChats.add(currentChannel);
            }
            adminedChannelCell.setChecked(limitReachedBottomSheet.selectedChats.contains(currentChannel), true);
            limitReachedBottomSheet.updateButton();
            return;
        }
        if (view instanceof GroupCreateUserCell) {
            if (limitReachedBottomSheet.canSendLink || !((i2 = limitReachedBottomSheet.type) == 11 || i2 == 34)) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                Object object = groupCreateUserCell.getObject();
                if (groupCreateUserCell.isBlocked()) {
                    if (object instanceof TLRPC.User) {
                        limitReachedBottomSheet.showPremiumBlockedToast(groupCreateUserCell, ((TLRPC.User) object).id);
                    }
                } else {
                    if (limitReachedBottomSheet.selectedChats.contains(object)) {
                        limitReachedBottomSheet.selectedChats.remove(object);
                    } else {
                        limitReachedBottomSheet.selectedChats.add(object);
                    }
                    groupCreateUserCell.setChecked(limitReachedBottomSheet.selectedChats.contains(object), true);
                    limitReachedBottomSheet.updateButton();
                }
            }
        }
    }

    public static /* synthetic */ boolean $r8$lambda$Ov-tIN_h6Km8FuZvyq8gjxWurl0(LimitReachedBottomSheet limitReachedBottomSheet, View view, int i) {
        limitReachedBottomSheet.recyclerListView.getOnItemClickListener().onItemClick(view, i);
        if (limitReachedBottomSheet.type != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static /* synthetic */ void $r8$lambda$x5owksAeIFvZxm_ZLh37BQf0SLs(final LimitReachedBottomSheet limitReachedBottomSheet, Context context, View view) {
        int i = limitReachedBottomSheet.type;
        if (i == 11 || i == 34) {
            return;
        }
        if (i == 19 || i == 32 || limitReachedBottomSheet.isMiniBoostBtnForAdminAvailable()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = limitReachedBottomSheet.canApplyBoost;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(limitReachedBottomSheet.currentAccount).isPremium() && BoostRepository.isMultiBoostsAvailable()) {
                    BoostDialogs.showMoreBoostsNeeded(limitReachedBottomSheet.dialogId, limitReachedBottomSheet);
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context, limitReachedBottomSheet.resourcesProvider);
                builder.setTitle(LocaleController.getString(R.string.PremiumNeeded));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(limitReachedBottomSheet.isGroup() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting)));
                builder.setPositiveButton(LocaleController.getString(R.string.CheckPhoneNumberYes), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda15
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        LimitReachedBottomSheet.$r8$lambda$msJjoRRU1fKhq3gtb6tVAngPb94(LimitReachedBottomSheet.this, alertDialog, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda16
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        alertDialog.dismiss();
                    }
                });
                builder.show();
                return;
            }
            boolean z = canApplyBoost.canApply;
            if (z && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && BoostRepository.isMultiBoostsAvailable()) {
                    limitReachedBottomSheet.lockInvalidation = true;
                    limitReachedBottomSheet.limitPreviewView.invalidationEnabled = false;
                    BaseFragment baseFragment = limitReachedBottomSheet.getBaseFragment();
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = limitReachedBottomSheet.canApplyBoost;
                    ReassignBoostBottomSheet.show(baseFragment, canApplyBoost2.myBoosts, canApplyBoost2.currentChat).setOnHideListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda17
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            LimitReachedBottomSheet.$r8$lambda$8Dmwk_1USxqLDJyi_aLhusfnT1c(LimitReachedBottomSheet.this, dialogInterface);
                        }
                    });
                    return;
                }
                limitReachedBottomSheet.boostChannel();
                return;
            }
            if (z) {
                FrameLayout frameLayout = new FrameLayout(limitReachedBottomSheet.getContext());
                BackupImageView backupImageView = new BackupImageView(limitReachedBottomSheet.getContext());
                backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(60, 60.0f));
                frameLayout.setClipChildren(false);
                final Paint paint = new Paint(1);
                paint.setColor(Theme.getColor(Theme.key_dialogBackground));
                final Drawable drawable = ContextCompat.getDrawable(limitReachedBottomSheet.getContext(), R.drawable.filled_limit_boost);
                frameLayout.addView(new View(limitReachedBottomSheet.getContext()) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.3
                    @Override // android.view.View
                    protected void onDraw(Canvas canvas) {
                        float measuredWidth = getMeasuredWidth() / 2.0f;
                        float measuredHeight = getMeasuredHeight() / 2.0f;
                        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, paint);
                        PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), -AndroidUtilities.dp(10.0f), 0.0f);
                        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), PremiumGradient.getInstance().getMainGradientPaint());
                        float dp = AndroidUtilities.dp(18.0f) / 2.0f;
                        drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
                        drawable.draw(canvas);
                    }
                }, LayoutHelper.createFrame(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(limitReachedBottomSheet.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                imageView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon));
                frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
                BackupImageView backupImageView2 = new BackupImageView(limitReachedBottomSheet.getContext());
                backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(limitReachedBottomSheet.getContext());
                frameLayout2.addView(frameLayout, LayoutHelper.createFrame(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, LayoutHelper.createLinear(-1, -2, 0, 24, 80, 24, 0));
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                TLRPC.Chat chat = MessagesController.getInstance(limitReachedBottomSheet.currentAccount).getChat(Long.valueOf(-limitReachedBottomSheet.canApplyBoost.replaceDialogId));
                avatarDrawable.setInfo(limitReachedBottomSheet.currentAccount, chat);
                backupImageView.setForUserOrChat(chat, avatarDrawable);
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                TLRPC.Chat chat2 = MessagesController.getInstance(limitReachedBottomSheet.currentAccount).getChat(Long.valueOf(-limitReachedBottomSheet.dialogId));
                avatarDrawable2.setInfo(limitReachedBottomSheet.currentAccount, chat2);
                backupImageView2.setForUserOrChat(chat2, avatarDrawable2);
                AlertDialog.Builder builder2 = new AlertDialog.Builder(context);
                builder2.setView(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                builder2.setPositiveButton(LocaleController.getString(R.string.Replace), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda18
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        LimitReachedBottomSheet.$r8$lambda$1fClF4kl1Uj3KAIbmX_4RXw--BY(LimitReachedBottomSheet.this, alertDialog, i2);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda19
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        alertDialog.dismiss();
                    }
                });
                builder2.show();
                return;
            }
            int i2 = canApplyBoost.floodWait;
            if (i2 != 0) {
                BoostDialogs.showFloodWait(i2);
                return;
            }
            return;
        }
        int i3 = limitReachedBottomSheet.type;
        if (i3 == 18 || i3 == 20 || i3 == 24 || i3 == 25 || i3 == 26 || i3 == 29 || i3 == 22 || i3 == 23 || i3 == 21 || i3 == 27 || i3 == 28 || i3 == 30 || i3 == 35) {
            AndroidUtilities.addToClipboard(limitReachedBottomSheet.getBoostLink());
            limitReachedBottomSheet.dismiss();
            return;
        }
        if (UserConfig.getInstance(limitReachedBottomSheet.currentAccount).isPremium() || MessagesController.getInstance(limitReachedBottomSheet.currentAccount).premiumFeaturesBlocked() || limitReachedBottomSheet.isVeryLargeFile) {
            limitReachedBottomSheet.dismiss();
            return;
        }
        BaseFragment baseFragment2 = limitReachedBottomSheet.parentFragment;
        if (baseFragment2 == null) {
            return;
        }
        if (baseFragment2.getVisibleDialog() != null) {
            limitReachedBottomSheet.parentFragment.getVisibleDialog().dismiss();
        }
        limitReachedBottomSheet.parentFragment.presentFragment(new PremiumPreviewFragment(limitTypeToServerString(limitReachedBottomSheet.type)));
        Runnable runnable = limitReachedBottomSheet.onShowPremiumScreenRunnable;
        if (runnable != null) {
            runnable.run();
        }
        limitReachedBottomSheet.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$msJjoRRU1fKhq3gtb6tVAngPb94(LimitReachedBottomSheet limitReachedBottomSheet, AlertDialog alertDialog, int i) {
        limitReachedBottomSheet.parentFragment.presentFragment(new PremiumPreviewFragment(null));
        limitReachedBottomSheet.dismiss();
        alertDialog.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$8Dmwk_1USxqLDJyi_aLhusfnT1c(LimitReachedBottomSheet limitReachedBottomSheet, DialogInterface dialogInterface) {
        limitReachedBottomSheet.lockInvalidation = false;
        limitReachedBottomSheet.limitPreviewView.invalidationEnabled = true;
        limitReachedBottomSheet.premiumButtonView.invalidate();
        limitReachedBottomSheet.limitPreviewView.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$1fClF4kl1Uj3KAIbmX_4RXw--BY(LimitReachedBottomSheet limitReachedBottomSheet, AlertDialog alertDialog, int i) {
        limitReachedBottomSheet.getClass();
        alertDialog.dismiss();
        limitReachedBottomSheet.boostChannel();
    }

    public static /* synthetic */ void $r8$lambda$_wWh7f4SEaxR5GZ4jFdnx8HLidk(final LimitReachedBottomSheet limitReachedBottomSheet, View view) {
        if (limitReachedBottomSheet.premiumButtonSetSubscribe) {
            if (limitReachedBottomSheet.parentFragment == null) {
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            limitReachedBottomSheet.parentFragment.showAsSheet(new PremiumPreviewFragment("invite_privacy"), bottomSheetParams);
        } else {
            int i = limitReachedBottomSheet.type;
            if (i == 19 || i == 32 || limitReachedBottomSheet.isMiniBoostBtnForAdminAvailable()) {
                ChannelBoostsController.CanApplyBoost canApplyBoost = limitReachedBottomSheet.canApplyBoost;
                if (canApplyBoost.canApply) {
                    limitReachedBottomSheet.premiumButtonView.buttonLayout.callOnClick();
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = limitReachedBottomSheet.canApplyBoost;
                    if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda12
                            @Override // java.lang.Runnable
                            public final void run() {
                                LimitReachedBottomSheet.$r8$lambda$wLZy5aWpvXQKBfGZgGkKdSbuGXk(LimitReachedBottomSheet.this);
                            }
                        }, limitReachedBottomSheet.canApplyBoost.needSelector ? 300L : 0L);
                        return;
                    }
                    return;
                }
                if (canApplyBoost.alreadyActive && BoostRepository.isMultiBoostsAvailable() && !limitReachedBottomSheet.canApplyBoost.isMaxLvl) {
                    BoostDialogs.showMoreBoostsNeeded(limitReachedBottomSheet.dialogId, limitReachedBottomSheet);
                    return;
                } else {
                    limitReachedBottomSheet.dismiss();
                    return;
                }
            }
        }
        int i2 = limitReachedBottomSheet.type;
        if (i2 == 11 || i2 == 34) {
            if (limitReachedBottomSheet.selectedChats.isEmpty()) {
                limitReachedBottomSheet.dismiss();
                return;
            } else {
                limitReachedBottomSheet.sendInviteMessages(null);
                return;
            }
        }
        if (limitReachedBottomSheet.selectedChats.isEmpty()) {
            return;
        }
        int i3 = limitReachedBottomSheet.type;
        if (i3 == 2) {
            limitReachedBottomSheet.revokeSelectedLinks();
        } else if (i3 == 5) {
            limitReachedBottomSheet.leaveFromSelectedGroups();
        }
    }

    public static /* synthetic */ void $r8$lambda$wLZy5aWpvXQKBfGZgGkKdSbuGXk(LimitReachedBottomSheet limitReachedBottomSheet) {
        limitReachedBottomSheet.limitPreviewView.setBoosts(limitReachedBottomSheet.boostsStatus, false);
        limitReachedBottomSheet.limitPreviewIncreaseCurrentValue();
    }

    private void limitPreviewIncreaseCurrentValue() {
        LimitPreviewView limitPreviewView = this.limitPreviewView;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        int i = tL_premium_boostsStatus.boosts;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        limitPreviewView.increaseCurrentValue(i, i - i2, tL_premium_boostsStatus.next_level_boosts - i2);
    }

    private void showPremiumBlockedToast(View view, long j) {
        String str;
        Bulletin createSimpleBulletin;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(view, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j < 0) {
            str = "";
        } else {
            str = UserObject.getForcedFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            createSimpleBulletin = BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            createSimpleBulletin = BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    LimitReachedBottomSheet.$r8$lambda$sHa0hheeddeZ-aiureo5eCN9LUw(LimitReachedBottomSheet.this);
                }
            });
        }
        createSimpleBulletin.show();
    }

    public static /* synthetic */ void $r8$lambda$sHa0hheeddeZ-aiureo5eCN9LUw(LimitReachedBottomSheet limitReachedBottomSheet) {
        limitReachedBottomSheet.getClass();
        if (LaunchActivity.getLastFragment() == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        limitReachedBottomSheet.parentFragment.showAsSheet(new PremiumPreviewFragment("noncontacts"), bottomSheetParams);
    }

    private void boostChannel(Loadable loadable) {
        boostChannel(loadable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void boostChannel(final Loadable loadable, boolean z) {
        if (!loadable.isLoading() || z) {
            loadable.setLoading(true);
            MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.dialogId, this.canApplyBoost.slot, new Utilities.Callback() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda22
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    MessagesController.getInstance(r0.currentAccount).getBoostsController().getBoostsStats(r0.dialogId, new Consumer() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda28
                        @Override // com.google.android.exoplayer2.util.Consumer
                        public final void accept(Object obj2) {
                            LimitReachedBottomSheet.$r8$lambda$cImTKV1UbviDFSaQWqI552ohZLc(LimitReachedBottomSheet.this, r2, r3, (TL_stories.TL_premium_boostsStatus) obj2);
                        }
                    });
                }
            }, new Utilities.Callback() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda23
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    LimitReachedBottomSheet.$r8$lambda$LdX9xHHdPEtiFXztJLIg9e6iSL8(LimitReachedBottomSheet.this, loadable, (TLRPC.TL_error) obj);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$cImTKV1UbviDFSaQWqI552ohZLc(LimitReachedBottomSheet limitReachedBottomSheet, Loadable loadable, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        TLRPC.ChatFull chatFull;
        limitReachedBottomSheet.getClass();
        loadable.setLoading(false);
        if (tL_premium_boostsStatus == null) {
            return;
        }
        limitReachedBottomSheet.boostsStatus.boosts++;
        if (limitReachedBottomSheet.type == 32 && (chatFull = limitReachedBottomSheet.getChatFull()) != null) {
            chatFull.boosts_applied++;
        }
        limitReachedBottomSheet.limitPreviewIncreaseCurrentValue();
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, limitReachedBottomSheet.isCurrentChat);
        ChannelBoostsController.CanApplyBoost canApplyBoost = limitReachedBottomSheet.canApplyBoost;
        canApplyBoost.isMaxLvl = limitReachedBottomSheet.boostsStatus.next_level_boosts <= 0;
        canApplyBoost.boostedNow = true;
        canApplyBoost.setMyBoosts(tL_premium_myBoosts);
        limitReachedBottomSheet.onBoostSuccess();
    }

    public static /* synthetic */ void $r8$lambda$LdX9xHHdPEtiFXztJLIg9e6iSL8(final LimitReachedBottomSheet limitReachedBottomSheet, final Loadable loadable, TLRPC.TL_error tL_error) {
        limitReachedBottomSheet.getClass();
        if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue <= 5) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda27
                    @Override // java.lang.Runnable
                    public final void run() {
                        LimitReachedBottomSheet.this.boostChannel(loadable, true);
                    }
                }, intValue * 1000);
                return;
            }
            BoostDialogs.showFloodWait(intValue);
        }
        loadable.setLoading(false);
    }

    private void boostChannel() {
        if (this.boostMiniBtn.isAttachedToWindow()) {
            boostChannel(this.boostMiniBtn);
            return;
        }
        ButtonWithCounterView buttonWithCounterView = this.boostToUnlockGroupBtn;
        if (buttonWithCounterView != null && buttonWithCounterView.isAttachedToWindow()) {
            boostChannel(this.boostToUnlockGroupBtn);
        } else {
            boostChannel(this.premiumButtonView);
        }
    }

    private boolean onBoostSuccess() {
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.boostsStatus, this.canApplyBoost.copy(), Long.valueOf(this.dialogId));
        if (this.boostToUnlockGroupBtn != null) {
            int neededBoostsForUnlockGroup = getNeededBoostsForUnlockGroup();
            if (neededBoostsForUnlockGroup == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                dismiss();
                return false;
            }
            this.boostToUnlockGroupBtn.setCount(neededBoostsForUnlockGroup, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new Visibility() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.4
            @Override // android.transition.Visibility
            public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(20.0f), 0.0f));
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                return animatorSet;
            }

            @Override // android.transition.Visibility
            public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -AndroidUtilities.dp(20.0f)));
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                return animatorSet;
            }
        });
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.headerView, transitionSet);
        this.headerView.recreateTitleAndDescription();
        this.headerView.title.setText(getBoostsTitleString());
        this.headerView.description.setText(AndroidUtilities.replaceTags(getBoostDescriptionStringAfterBoost()));
        updateButton();
        this.fireworksOverlay.start();
        try {
            this.fireworksOverlay.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.headerView.boostCounterView.setCount(this.canApplyBoost.boostCount, true);
        this.recyclerListView.smoothScrollToPosition(0);
        if (this.type == 32) {
            this.headerView.boostCounterView.setVisibility(8);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInviteMessages(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.forceLink)) {
            str = this.forceLink;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.fromChat.id);
            if (chatFull == null) {
                dismiss();
                return;
            }
            if (this.fromChat.username != null) {
                str = "@" + this.fromChat.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported != null) {
                    str = tL_chatInviteExported.link;
                } else {
                    dismiss();
                    return;
                }
            }
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.selectedChats.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.id));
            }
            (sendPaidMessagesStars >= 0 ? arrayList : arrayList2).add(user);
        }
        int i = 0;
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList3, 1, new Utilities.Callback() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda25
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    LimitReachedBottomSheet.this.sendInviteMessages((HashMap) obj2);
                }
            });
            return;
        }
        Iterator it2 = this.selectedChats.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            SendMessagesHelper.SendMessageParams of = SendMessagesHelper.SendMessageParams.of(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            of.payStars = longValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of);
            hashMap2 = hashMap;
            it2 = it2;
            if (of.payStars > 0) {
                z = true;
            }
        }
        if (!z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    LimitReachedBottomSheet.$r8$lambda$VoIRhJQTPYbtfA2UKCMwVqkKEd8(LimitReachedBottomSheet.this);
                }
            });
        }
        dismiss();
    }

    public static /* synthetic */ void $r8$lambda$VoIRhJQTPYbtfA2UKCMwVqkKEd8(LimitReachedBottomSheet limitReachedBottomSheet) {
        limitReachedBottomSheet.getClass();
        BulletinFactory global = BulletinFactory.global();
        if (global != null) {
            if (limitReachedBottomSheet.selectedChats.size() == 1) {
                global.createSimpleBulletin(R.raw.voip_invite, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC.User) limitReachedBottomSheet.selectedChats.iterator().next())))).show();
            } else {
                global.createSimpleBulletin(R.raw.voip_invite, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", limitReachedBottomSheet.selectedChats.size(), Integer.valueOf(limitReachedBottomSheet.selectedChats.size())))).show();
            }
        }
    }

    public void setRequiredLvl(int i) {
        this.requiredLvl = i;
    }

    public void updatePremiumButtonText() {
        String string;
        if (this.premiumButtonSetSubscribe) {
            this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i = this.type;
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            if (BoostRepository.isMultiBoostsAvailable()) {
                AnimatedTextView animatedTextView = this.premiumButtonView.buttonTextView;
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
                if (canApplyBoost != null && canApplyBoost.alreadyActive) {
                    string = LocaleController.getString(R.string.BoostingBoostAgain);
                } else {
                    string = LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
                }
                animatedTextView.setText(string);
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
                if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                    return;
                }
                this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.OK));
                return;
            }
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel));
            return;
        }
        int i2 = this.type;
        if (i2 == 18 || i2 == 20 || i2 == 24 || i2 == 25 || i2 == 26 || i2 == 29 || i2 == 22 || i2 == 23 || i2 == 21 || i2 == 27 || i2 == 28 || i2 == 30 || i2 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.premiumButtonView.buttonTextView.setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.isVeryLargeFile) {
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.OK));
            this.premiumButtonView.hideIcon();
            return;
        }
        this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.IncreaseLimit));
        LimitParams limitParams = this.limitParams;
        if (limitParams != null) {
            int i3 = limitParams.defaultLimit;
            int i4 = i3 + 1;
            int i5 = limitParams.premiumLimit;
            if (i4 == i5) {
                this.premiumButtonView.setIcon(R.raw.addone_icon);
                return;
            }
            if (i3 != 0 && i5 != 0) {
                float f = i5 / i3;
                if (f >= 1.6f && f <= 2.5f) {
                    this.premiumButtonView.setIcon(R.raw.double_icon);
                    return;
                }
            }
            this.premiumButtonView.hideIcon();
            return;
        }
        this.premiumButtonView.hideIcon();
    }

    private void leaveFromSelectedGroups() {
        final TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.selectedChats.iterator();
        while (it.hasNext()) {
            arrayList.add((TLRPC.Chat) it.next());
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.formatPluralString("LeaveCommunities", arrayList.size(), new Object[0]));
        if (arrayList.size() == 1) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList.get(0)).title)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupLeave), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda21
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                LimitReachedBottomSheet.$r8$lambda$-_HIog-_mZHdTCsJcIwVJXnxLh0(LimitReachedBottomSheet.this, arrayList, user, alertDialog, i);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        }
    }

    public static /* synthetic */ void $r8$lambda$-_HIog-_mZHdTCsJcIwVJXnxLh0(LimitReachedBottomSheet limitReachedBottomSheet, ArrayList arrayList, TLRPC.User user, AlertDialog alertDialog, int i) {
        limitReachedBottomSheet.dismiss();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i2);
            MessagesController.getInstance(limitReachedBottomSheet.currentAccount).putChat(chat, false);
            MessagesController.getInstance(limitReachedBottomSheet.currentAccount).deleteParticipantFromChat(chat.id, user);
        }
    }

    private void updateButton() {
        String formatPluralString;
        if (this.premiumButtonSetSubscribe) {
            this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i = this.type;
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            boolean z = canApplyBoost.canApply;
            if ((z || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
                if (canApplyBoost.isMaxLvl) {
                    this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.OK), true, true);
                    return;
                } else {
                    this.premiumButtonView.clearOverlayText();
                    return;
                }
            }
            if (z) {
                if (BoostRepository.isMultiBoostsAvailable()) {
                    this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
                } else {
                    this.premiumButtonView.setOverlayText(LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
                }
                this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), true);
                ButtonWithCounterView buttonWithCounterView = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setText(LocaleController.getString(R.string.BoostGroup), true);
                    return;
                }
                return;
            }
            if (canApplyBoost.isMaxLvl) {
                ButtonWithCounterView buttonWithCounterView2 = this.boostMiniBtn;
                int i2 = R.string.OK;
                buttonWithCounterView2.setText(LocaleController.getString(i2), true);
                ButtonWithCounterView buttonWithCounterView3 = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView3 != null) {
                    buttonWithCounterView3.setText(LocaleController.getString(i2), true);
                }
                this.premiumButtonView.setOverlayText(LocaleController.getString(i2), true, true);
                return;
            }
            if (BoostRepository.isMultiBoostsAvailable()) {
                ButtonWithCounterView buttonWithCounterView4 = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView4 != null) {
                    buttonWithCounterView4.setText(LocaleController.getString(R.string.BoostGroup), true);
                }
                this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), true);
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
                return;
            }
            ButtonWithCounterView buttonWithCounterView5 = this.boostToUnlockGroupBtn;
            if (buttonWithCounterView5 != null) {
                buttonWithCounterView5.setText(LocaleController.getString(R.string.OK), true);
            }
            ButtonWithCounterView buttonWithCounterView6 = this.boostMiniBtn;
            int i3 = R.string.OK;
            buttonWithCounterView6.setText(LocaleController.getString(i3), true);
            this.premiumButtonView.setOverlayText(LocaleController.getString(i3), true, true);
            return;
        }
        int i4 = this.type;
        if (i4 == 11 || i4 == 34) {
            this.premiumButtonView.checkCounterView();
            if (!this.canSendLink) {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.Close), true, true);
            } else if (this.selectedChats.size() > 0) {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            this.premiumButtonView.counterView.setCount(this.selectedChats.size(), true);
            this.premiumButtonView.invalidate();
            return;
        }
        if (this.selectedChats.size() > 0) {
            int i5 = this.type;
            if (i5 == 2) {
                formatPluralString = LocaleController.formatPluralString("RevokeLinks", this.selectedChats.size(), new Object[0]);
            } else {
                formatPluralString = i5 == 5 ? LocaleController.formatPluralString("LeaveCommunities", this.selectedChats.size(), new Object[0]) : null;
            }
            this.premiumButtonView.setOverlayText(formatPluralString, true, true);
            return;
        }
        this.premiumButtonView.clearOverlayText();
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    public CharSequence getTitle() {
        int i = this.type;
        if (i == 11) {
            return LocaleController.getString(R.string.ChannelInviteViaLink2);
        }
        if (i == 34) {
            return LocaleController.getString(R.string.CallInviteViaLink);
        }
        if (i != 35) {
            switch (i) {
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
                case 19:
                case 30:
                    return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
                case 31:
                    return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
                case 32:
                    return LocaleController.getString(R.string.BoostGroup);
                default:
                    return LocaleController.getString(R.string.LimitReached);
            }
        }
        return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i3 = 0;
        if (i == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            BaseFragment lastFragment = getBaseFragment().getParentLayout().getLastFragment();
            if (lastFragment instanceof ChatCustomReactionsEditActivity) {
                List fragmentStack = getBaseFragment().getParentLayout().getFragmentStack();
                BaseFragment baseFragment = fragmentStack.size() >= 2 ? (BaseFragment) fragmentStack.get(fragmentStack.size() - 2) : null;
                BaseFragment baseFragment2 = fragmentStack.size() >= 3 ? (BaseFragment) fragmentStack.get(fragmentStack.size() - 3) : null;
                r5 = fragmentStack.size() >= 4 ? (BaseFragment) fragmentStack.get(fragmentStack.size() - 4) : null;
                if (baseFragment instanceof ChatEditActivity) {
                    getBaseFragment().getParentLayout().removeFragmentFromStack(baseFragment);
                }
                dismiss();
                if (booleanValue) {
                    if (baseFragment2 instanceof ProfileActivity) {
                        getBaseFragment().getParentLayout().removeFragmentFromStack(baseFragment2);
                    }
                    lastFragment.finishFragment();
                    BoostDialogs.showBulletin(r5, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                BoostDialogs.showBulletin(baseFragment2, chat, false);
                return;
            }
            if ((lastFragment instanceof ChatActivity) && booleanValue) {
                BoostDialogs.showBulletin(lastFragment, chat, true);
                return;
            }
            if ((lastFragment instanceof ChannelColorActivity) && booleanValue) {
                List fragmentStack2 = getBaseFragment().getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    BaseFragment baseFragment3 = (BaseFragment) fragmentStack2.get(size);
                    if ((baseFragment3 instanceof ChatActivity) || (baseFragment3 instanceof DialogsActivity)) {
                        r5 = baseFragment3;
                        break;
                    }
                    arrayList.add(baseFragment3);
                }
                if (r5 == null) {
                    return;
                }
                int size2 = arrayList.size();
                while (i3 < size2) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    getBaseFragment().getParentLayout().removeFragmentFromStack((BaseFragment) obj);
                }
                getBaseFragment().finishFragment();
                dismiss();
                BoostDialogs.showBulletin(r5, chat, true);
                return;
            }
            if (booleanValue) {
                if (StoryRecorder.isVisible()) {
                    ChatActivity of = ChatActivity.of(-chat.id);
                    LaunchActivity.getLastFragment().presentFragment(of, false, false);
                    StoryRecorder.destroyInstance();
                    dismiss();
                    BoostDialogs.showBulletin(of, chat, true);
                    return;
                }
                List fragmentStack3 = getBaseFragment().getParentLayout().getFragmentStack();
                r5 = fragmentStack3.size() >= 2 ? (BaseFragment) fragmentStack3.get(fragmentStack3.size() - 2) : null;
                getBaseFragment().finishFragment();
                dismiss();
                if (r5 instanceof ChatActivity) {
                    BoostDialogs.showBulletin(r5, chat, true);
                    return;
                }
                return;
            }
            if (StoryRecorder.isVisible()) {
                ChatActivity of2 = ChatActivity.of(-chat.id);
                LaunchActivity.getLastFragment().presentFragment(of2, false, false);
                StoryRecorder.destroyInstance();
                dismiss();
                BoostDialogs.showBulletin(of2, chat, false);
                return;
            }
            dismiss();
            BoostDialogs.showBulletin(LaunchActivity.getLastFragment(), chat, false);
            return;
        }
        if (i == NotificationCenter.boostedChannelByUser) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.canApplyBoost == null) {
                return;
            }
            this.boostsStatus.boosts += intValue;
            if (this.type == 32 && (chatFull = getChatFull()) != null) {
                chatFull.boosts_applied += intValue;
            }
            limitPreviewIncreaseCurrentValue();
            setBoostsStats(tL_premium_boostsStatus, this.isCurrentChat);
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            canApplyBoost.isMaxLvl = this.boostsStatus.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_premium_myBoosts);
            if (onBoostSuccess()) {
                BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_boosts_replace, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])), 30).setDuration(4000).show(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.didStartedMultiGiftsSelector) {
            dismiss();
        }
    }

    class 5 extends RecyclerListView.SelectionAdapter {
        5() {
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
            int i = limitReachedBottomSheet.type;
            if ((i == 11 || i == 34) && !limitReachedBottomSheet.canSendLink) {
                return false;
            }
            return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = viewGroup.getContext();
            switch (i) {
                case 1:
                    view = new AdminedChannelCell(context, new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.5.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            AdminedChannelCell adminedChannelCell = (AdminedChannelCell) view2.getParent();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(adminedChannelCell.getCurrentChannel());
                            LimitReachedBottomSheet.this.revokeLinks(arrayList);
                        }
                    }, true, 9);
                    break;
                case 2:
                    view = new ShadowSectionCell(context, 12, Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    break;
                case 3:
                    View headerCell = new HeaderCell(context);
                    headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    view = headerCell;
                    break;
                case 4:
                    View groupCreateUserCell = new GroupCreateUserCell(context, 1, 0, false, false, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                    groupCreateUserCell.setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0);
                    view = groupCreateUserCell;
                    break;
                case 5:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                    flickerLoadingView.setViewType(LimitReachedBottomSheet.this.type == 2 ? 22 : 21);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setIgnoreHeightCheck(true);
                    flickerLoadingView.setItemsCount(10);
                    view = flickerLoadingView;
                    break;
                case 6:
                    view = new View(LimitReachedBottomSheet.this.getContext()) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.5.3
                        @Override // android.view.View
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
                        }
                    };
                    break;
                case 7:
                    FrameLayout frameLayout = new FrameLayout(LimitReachedBottomSheet.this.getContext());
                    frameLayout.setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
                    TextView textView = new TextView(context);
                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                    if (limitReachedBottomSheet.statisticClickRunnable == null && ChatObject.hasAdminRights(limitReachedBottomSheet.getChat())) {
                        LimitReachedBottomSheet.this.statisticClickRunnable = new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                LimitReachedBottomSheet.this.getBaseFragment().presentFragment(StatisticActivity.create(LimitReachedBottomSheet.this.getChat()));
                            }
                        };
                    }
                    textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(LimitReachedBottomSheet.this.statisticClickRunnable == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                    textView.setTextSize(1, 16.0f);
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    textView.setSingleLine(true);
                    frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                    int dp = AndroidUtilities.dp(8.0f);
                    int color = Theme.getColor(Theme.key_graySection, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                    int i2 = Theme.key_listSelector;
                    textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(dp, color, ColorUtils.setAlphaComponent(Theme.getColor(i2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 76)));
                    textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
                        }
                    });
                    if (LimitReachedBottomSheet.this.statisticClickRunnable != null) {
                        ImageView imageView = new ImageView(LimitReachedBottomSheet.this.getContext());
                        imageView.setImageResource(R.drawable.msg_stats);
                        imageView.setColorFilter(Theme.getColor(Theme.key_dialogTextBlack, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(i2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 76)));
                        frameLayout.addView(imageView, LayoutHelper.createFrame(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                LimitReachedBottomSheet.5.$r8$lambda$z092EITfr1rzRJvEZlCLqGwTbvI(LimitReachedBottomSheet.5.this, view2);
                            }
                        });
                    }
                    textView.setText(LimitReachedBottomSheet.this.getBoostLink());
                    textView.setGravity(17);
                    view = frameLayout;
                    break;
                case 8:
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
                    linearLayout.setOrientation(1);
                    LoginOrView loginOrView = new LoginOrView(context);
                    final LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(LimitReachedBottomSheet.this.isGroup() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                    spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.5.1
                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            textPaint.setUnderlineText(false);
                            textPaint.setColor(Theme.getColor(Theme.key_chat_messageLinkIn, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View view2) {
                            BoostPagerBottomSheet.show(LimitReachedBottomSheet.this.getBaseFragment(), LimitReachedBottomSheet.this.dialogId, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        }
                    }, 0, spannableStringBuilder.length(), 33);
                    SpannableString spannableString = new SpannableString(">");
                    Drawable mutate = LimitReachedBottomSheet.this.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                    int i3 = Theme.key_chat_messageLinkIn;
                    mutate.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(mutate);
                    coloredImageSpan.setColorKey(i3);
                    coloredImageSpan.setSize(AndroidUtilities.dp(18.0f));
                    coloredImageSpan.setWidth(AndroidUtilities.dp(11.0f));
                    coloredImageSpan.setTranslateX(-AndroidUtilities.dp(5.0f));
                    spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
                    linksTextView.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                    linksTextView.setTextSize(1, 14.0f);
                    linksTextView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                    if (((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider instanceof DarkThemeResourceProvider) {
                        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    } else {
                        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    }
                    linksTextView.setGravity(1);
                    linksTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BoostPagerBottomSheet.show(LimitReachedBottomSheet.this.getBaseFragment(), LimitReachedBottomSheet.this.dialogId, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        }
                    });
                    loginOrView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            linksTextView.performClick();
                        }
                    });
                    if (LimitReachedBottomSheet.this.isMiniBoostBtnForAdminAvailable()) {
                        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.Copy), false);
                        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                LimitReachedBottomSheet.5.$r8$lambda$5ASLZH3CR67pMiXZJ9FpgjrL4Rs(LimitReachedBottomSheet.5.this, view2);
                            }
                        });
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.addView(LimitReachedBottomSheet.this.boostMiniBtn, LayoutHelper.createLinear(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, 44, 12.0f, 12.0f, 12.0f, 8.0f));
                    } else {
                        linearLayout.addView(LimitReachedBottomSheet.this.actionBtn, LayoutHelper.createLinear(-1, 48, 12.0f, 12.0f, 12.0f, 8.0f));
                    }
                    linearLayout.addView(loginOrView, LayoutHelper.createLinear(-1, 48, 0.0f, -5.0f, 0.0f, 0.0f));
                    linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 12.0f, -6.0f, 12.0f, 17.0f));
                    view = linearLayout;
                    break;
                case 9:
                    LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                    view = limitReachedBottomSheet2.new BoostFeatureCell(context, ((BottomSheet) limitReachedBottomSheet2).resourcesProvider);
                    break;
                default:
                    view = LimitReachedBottomSheet.this.headerView = LimitReachedBottomSheet.this.new HeaderView(context);
                    break;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        public static /* synthetic */ void $r8$lambda$5ASLZH3CR67pMiXZJ9FpgjrL4Rs(5 r0, View view) {
            AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
            LimitReachedBottomSheet.this.dismiss();
        }

        public static /* synthetic */ void $r8$lambda$z092EITfr1rzRJvEZlCLqGwTbvI(5 r0, View view) {
            LimitReachedBottomSheet.this.statisticClickRunnable.run();
            LimitReachedBottomSheet.this.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String formatUserStatus;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 1) {
                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                TLRPC.Chat chat = (TLRPC.Chat) limitReachedBottomSheet.chats.get(i - limitReachedBottomSheet.chatStartRow);
                AdminedChannelCell adminedChannelCell = (AdminedChannelCell) viewHolder.itemView;
                TLRPC.Chat currentChannel = adminedChannelCell.getCurrentChannel();
                adminedChannelCell.setChannel(chat, false);
                adminedChannelCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(chat), currentChannel == chat);
                return;
            }
            if (itemViewType == 9) {
                LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                int i2 = i - limitReachedBottomSheet2.boostFeaturesStartRow;
                ArrayList arrayList = limitReachedBottomSheet2.boostFeatures;
                if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
                    return;
                }
                ((BoostFeatureCell) viewHolder.itemView).set((BoostFeature) LimitReachedBottomSheet.this.boostFeatures.get(i2));
                return;
            }
            if (itemViewType == 3) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                LimitReachedBottomSheet limitReachedBottomSheet3 = LimitReachedBottomSheet.this;
                int i3 = limitReachedBottomSheet3.type;
                if (i3 != 11 && i3 != 34) {
                    if (i3 == 2) {
                        headerCell.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (!limitReachedBottomSheet3.canSendLink) {
                    if (LimitReachedBottomSheet.this.restrictedUsers.size() == 1) {
                        headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                        return;
                    }
                }
                headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                return;
            }
            if (itemViewType != 4) {
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            LimitReachedBottomSheet limitReachedBottomSheet4 = LimitReachedBottomSheet.this;
            int i4 = limitReachedBottomSheet4.type;
            if (i4 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) limitReachedBottomSheet4.inactiveChats.get(i - LimitReachedBottomSheet.this.chatStartRow);
                groupCreateUserCell.setObject(chat2, chat2.title, (String) LimitReachedBottomSheet.this.inactiveChatsSignatures.get(i - LimitReachedBottomSheet.this.chatStartRow), ((float) i) != ((float) LimitReachedBottomSheet.this.chatEndRow) - 1.0f);
                groupCreateUserCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(chat2), false);
            } else if (i4 == 11 || i4 == 34) {
                TLRPC.User user = (TLRPC.User) limitReachedBottomSheet4.restrictedUsers.get(i - LimitReachedBottomSheet.this.chatStartRow);
                boolean z = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null && LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.contains(Long.valueOf(user.id));
                groupCreateUserCell.overridePremiumBlocked(z ? new TL_account.requirementToContactPremium() : null, false);
                if (!z) {
                    formatUserStatus = LocaleController.formatUserStatus(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, user, null, null);
                } else {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                }
                groupCreateUserCell.setObject(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i) != ((float) LimitReachedBottomSheet.this.chatEndRow) - 1.0f);
                groupCreateUserCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(user), false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int i2;
            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
            if (limitReachedBottomSheet.headerRow == i) {
                return 0;
            }
            if (limitReachedBottomSheet.dividerRow == i) {
                return 2;
            }
            if (limitReachedBottomSheet.chatsTitleRow == i) {
                return 3;
            }
            if (limitReachedBottomSheet.loadingRow == i) {
                return 5;
            }
            if (limitReachedBottomSheet.emptyViewDividerRow == i) {
                return 6;
            }
            if (limitReachedBottomSheet.linkRow == i) {
                return 7;
            }
            LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
            if (limitReachedBottomSheet2.bottomRow == i) {
                return 8;
            }
            ArrayList arrayList = limitReachedBottomSheet2.boostFeatures;
            if (arrayList != null && i >= (i2 = limitReachedBottomSheet2.boostFeaturesStartRow) && i <= i2 + arrayList.size()) {
                return 9;
            }
            int i3 = LimitReachedBottomSheet.this.type;
            return (i3 == 5 || i3 == 11 || i3 == 34) ? 4 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return LimitReachedBottomSheet.this.rowCount;
        }
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new 5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMiniBoostBtnForAdminAvailable() {
        return isBoostingForAdminPossible() && ChatObject.hasAdminRights(getChat());
    }

    private boolean isBoostingForAdminPossible() {
        int i = this.type;
        return i == 19 || i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 27 || i == 28 || i == 23 || i == 30 || i == 35;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBoostLink() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.boostsStatus.boost_url;
        }
        return ChannelBoostUtilities.createLink(this.currentAccount, this.dialogId);
    }

    public void setCurrentValue(int i) {
        this.currentValue = i;
    }

    public void setVeryLargeFile(boolean z) {
        this.isVeryLargeFile = z;
        updatePremiumButtonText();
    }

    public void setRestrictedUsers(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.fromChat = chat;
        this.forceLink = str;
        this.canSendLink = !TextUtils.isEmpty(str) || ChatObject.canUserDoAdminAction(chat, 3);
        this.restrictedUsers = new ArrayList(arrayList);
        this.premiumMessagingBlockedUsers = arrayList2;
        this.premiumInviteBlockedUsers = arrayList3;
        this.selectedChats.clear();
        if (this.canSendLink) {
            ArrayList arrayList4 = this.restrictedUsers;
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    this.selectedChats.add(user);
                }
            }
        }
        updateRows();
        updateButton();
        int i2 = this.type;
        if ((i2 == 11 || i2 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.restrictedUsers.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            PremiumButtonView premiumButtonView = this.premiumButtonView;
            if (premiumButtonView != null && premiumButtonView.getParent() != null) {
                ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            }
            View view = this.divider;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) this.divider.getParent()).removeView(this.divider);
            }
            RecyclerListView recyclerListView = this.recyclerListView;
            if (recyclerListView != null) {
                recyclerListView.setPadding(0, 0, 0, 0);
            }
        }
    }

    public void setDialogId(long j) {
        this.dialogId = j;
        updateRows();
    }

    public void setChatMessageCell(ChatMessageCell chatMessageCell) {
        this.chatMessageCell = chatMessageCell;
    }

    public void setBoostsStats(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        this.boostsStatus = tL_premium_boostsStatus;
        this.isCurrentChat = z;
        updateRows();
    }

    public void setCanApplyBoost(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.canApplyBoost = canApplyBoost;
        updateButton();
        updatePremiumButtonText();
    }

    public void showStatisticButtonInLink(Runnable runnable) {
        this.statisticClickRunnable = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    class HeaderView extends LinearLayout {
        BoostCounterView boostCounterView;
        TextView description;
        TextView title;
        LinearLayout titleLinearLayout;

        /* JADX WARN: Removed duplicated region for block: B:102:0x0e21  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0e4e  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0e35  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0e10  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0c39  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0c44  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0c98  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x04d4  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0595  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x05cd A[LOOP:0: B:222:0x05cb->B:223:0x05cd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:227:0x066f  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0678  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0694  */
        /* JADX WARN: Removed duplicated region for block: B:240:0x07e9  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x07f9  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x0807  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0500 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:259:0x07fb  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x07eb  */
        /* JADX WARN: Removed duplicated region for block: B:264:0x06c2  */
        /* JADX WARN: Removed duplicated region for block: B:287:0x0671  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x059a  */
        /* JADX WARN: Removed duplicated region for block: B:298:0x048c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0542  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x054b  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0dea  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x047a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public HeaderView(Context context) {
            super(context);
            String formatString;
            String formatPluralString;
            String str;
            int i;
            int i2;
            float f;
            int i3;
            boolean z;
            ArrayList arrayList;
            int min;
            int i4;
            String str2;
            String str3;
            int i5;
            int i6;
            int size;
            int size2;
            int i7;
            int i8;
            float f2;
            int i9;
            float f3;
            float f4;
            setOrientation(1);
            setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
            LimitParams limitParams = LimitReachedBottomSheet.getLimitParams(LimitReachedBottomSheet.this.type, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
            LimitReachedBottomSheet.this.limitParams = limitParams;
            int i10 = limitParams.icon;
            MessagesController messagesController = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
            boolean premiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
            boolean isGroup = LimitReachedBottomSheet.this.isGroup();
            int i11 = LimitReachedBottomSheet.this.type;
            if (i11 == 31) {
                formatString = LocaleController.getString(isGroup ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
            } else if (i11 == 32) {
                formatString = LimitReachedBottomSheet.this.getBoostsDescriptionString(true);
            } else if (i11 == 19) {
                if (LimitReachedBottomSheet.this.chatMessageCell != null) {
                    int i12 = LimitReachedBottomSheet.this.chatMessageCell.getMessageObject().messageOwner.from_boosts_applied;
                    TLRPC.Chat chat = LimitReachedBottomSheet.this.getChat();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i12, UserObject.getFirstName(LimitReachedBottomSheet.this.chatMessageCell.getCurrentUser())));
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.GroupBoostedByUserWithDescription, chat == null ? "" : chat.title));
                    formatString = spannableStringBuilder.toString();
                } else if (LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity) {
                    formatString = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", BoostRepository.giveawayBoostsPerPremium(), new Object[0]);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LimitReachedBottomSheet.this.getBoostsDescriptionString(true));
                    if (ChatObject.hasAdminRights(LimitReachedBottomSheet.this.getChat()) && isGroup) {
                        spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                    }
                    formatString = spannableStringBuilder2.toString();
                }
            } else if (i11 == 18) {
                formatString = LimitReachedBottomSheet.this.boostsStatus.level == 0 ? LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription, LocaleController.formatPluralString("MoreBoosts", LimitReachedBottomSheet.this.boostsStatus.next_level_boosts, Integer.valueOf(LimitReachedBottomSheet.this.boostsStatus.next_level_boosts))) : LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel, LocaleController.formatPluralString("MoreBoosts", LimitReachedBottomSheet.this.boostsStatus.next_level_boosts - LimitReachedBottomSheet.this.boostsStatus.boosts, Integer.valueOf(LimitReachedBottomSheet.this.boostsStatus.next_level_boosts - LimitReachedBottomSheet.this.boostsStatus.boosts)), LocaleController.formatPluralString("BoostStories", LimitReachedBottomSheet.this.boostsStatus.level + 1, new Object[0]));
            } else if (i11 == 20) {
                formatString = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(LimitReachedBottomSheet.this.channelColorLevelMin()));
            } else if (i11 == 24) {
                formatString = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(LimitReachedBottomSheet.this.channelColorLevelMin()));
            } else if (i11 == 29) {
                formatString = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
            } else if (i11 == 30) {
                formatString = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
            } else if (i11 == 35) {
                formatString = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
            } else if (i11 == 25) {
                formatString = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(isGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
            } else if (i11 == 26) {
                formatString = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(isGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
            } else if (i11 == 27) {
                formatString = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
            } else if (i11 == 28) {
                formatString = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(isGroup ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
            } else if (i11 == 22) {
                formatString = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(isGroup ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
            } else if (i11 == 23) {
                formatString = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(isGroup ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
            } else if (i11 == 21) {
                formatString = LocaleController.formatPluralString("ReactionReachLvlForReaction", LimitReachedBottomSheet.this.requiredLvl, Integer.valueOf(LimitReachedBottomSheet.this.requiredLvl));
            } else {
                if (i11 == 11) {
                    if (!LimitReachedBottomSheet.this.canSendLink) {
                        if (ChatObject.isChannelAndNotMegaGroup(LimitReachedBottomSheet.this.fromChat)) {
                            formatPluralString = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                        } else {
                            formatPluralString = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                        }
                    } else if (!ChatObject.isChannelAndNotMegaGroup(LimitReachedBottomSheet.this.fromChat)) {
                        if (LimitReachedBottomSheet.this.restrictedUsers.size() != 1) {
                            formatPluralString = LocaleController.formatPluralString("InviteRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                        } else {
                            formatPluralString = LocaleController.formatString(R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0)));
                        }
                    } else {
                        formatPluralString = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                    }
                    str = formatPluralString;
                    premiumFeaturesBlocked = true;
                    LimitParams limitParams2 = LimitReachedBottomSheet.this.limitParams;
                    int i13 = limitParams2.defaultLimit;
                    int i14 = limitParams2.premiumLimit;
                    i = LimitReachedBottomSheet.this.currentValue;
                    i2 = LimitReachedBottomSheet.this.type;
                    if (i2 != 3) {
                        i = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).dialogFilters.size() - 1;
                    } else if (i2 == 7) {
                        i = UserConfig.getActivatedAccountsCount();
                    } else if (i2 == 0) {
                        ArrayList<TLRPC.Dialog> dialogs = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getDialogs(0);
                        int size3 = dialogs.size();
                        int i15 = 0;
                        for (int i16 = 0; i16 < size3; i16++) {
                            TLRPC.Dialog dialog = dialogs.get(i16);
                            if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                                i15++;
                            }
                        }
                        i = i15;
                        if (!UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) {
                            i = i14;
                            f = 1.0f;
                        } else {
                            i = i < 0 ? i13 : i;
                            if (LimitReachedBottomSheet.this.type != 7) {
                                f3 = i;
                                f4 = i14;
                            } else if (i > i13) {
                                f3 = i - i13;
                                f4 = i14 - i13;
                            } else {
                                f = 0.5f;
                            }
                            f = f3 / f4;
                        }
                        float f5 = i13 / i14;
                        i3 = LimitReachedBottomSheet.this.type;
                        if (i3 == 18 && i3 != 20 && i3 != 24) {
                            if (i3 != 25 && i3 != 26 && i3 != 29 && i3 != 22 && i3 != 23 && i3 != 19 && i3 != 30 && i3 != 35 && i3 != 21 && i3 != 27 && i3 != 28 && i3 != 32) {
                                z = false;
                                i = z ? 0 : i;
                                if ((i3 != 11 || i3 == 34) && !MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).premiumFeaturesBlocked() && ((LimitReachedBottomSheet.this.premiumInviteBlockedUsers != null && !LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) || (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null && LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size() >= LimitReachedBottomSheet.this.restrictedUsers.size()))) {
                                    arrayList = !LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty() ? LimitReachedBottomSheet.this.premiumMessagingBlockedUsers : LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                                    AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
                                    avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                                    avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                                    avatarsImageView.setStepFactor(0.4f);
                                    min = Math.min(arrayList.size(), 3);
                                    avatarsImageView.setCount(min);
                                    for (i4 = 0; i4 < min; i4++) {
                                        Long l = (Long) arrayList.get(i4);
                                        l.getClass();
                                        avatarsImageView.setObject(i4, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l));
                                    }
                                    avatarsImageView.commitTransition(false);
                                    addView(avatarsImageView, LayoutHelper.createLinear(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                                    TextView textView = new TextView(context);
                                    textView.setGravity(17);
                                    textView.setTypeface(AndroidUtilities.bold());
                                    textView.setTextSize(1, 20.0f);
                                    int i17 = Theme.key_dialogTextBlack;
                                    textView.setTextColor(Theme.getColor(i17, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    textView.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                                    addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                                    TextView textView2 = new TextView(context);
                                    textView2.setGravity(17);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setTextColor(Theme.getColor(i17, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                                    boolean z2 = LimitReachedBottomSheet.this.type != 34;
                                    boolean z3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null && LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size() >= LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                                    if (arrayList.size() != 1) {
                                        if (z2) {
                                            i7 = R.string.InviteCallMessagePremiumBlockedOne;
                                        } else {
                                            i7 = z3 ? R.string.InviteMessagePremiumBlockedOne : R.string.InvitePremiumBlockedOne;
                                        }
                                        str3 = LocaleController.formatString(i7, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                                    } else if (arrayList.size() == 2) {
                                        if (z2) {
                                            i6 = R.string.InviteCallMessagePremiumBlockedTwo;
                                        } else {
                                            i6 = z3 ? R.string.InviteMessagePremiumBlockedTwo : R.string.InvitePremiumBlockedTwo;
                                        }
                                        str3 = LocaleController.formatString(i6, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                                    } else if (arrayList.size() == 3) {
                                        if (z2) {
                                            i5 = R.string.InviteCallMessagePremiumBlockedThree;
                                        } else {
                                            i5 = z3 ? R.string.InviteMessagePremiumBlockedThree : R.string.InvitePremiumBlockedThree;
                                        }
                                        str3 = LocaleController.formatString(i5, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                                    } else {
                                        if (z2) {
                                            str2 = "InviteCallMessagePremiumBlockedMany";
                                        } else {
                                            str2 = z3 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany";
                                        }
                                        String formatPluralString2 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                                        avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                                        str3 = formatPluralString2;
                                    }
                                    textView2.setText(AndroidUtilities.replaceTags(str3));
                                    size = LimitReachedBottomSheet.this.premiumInviteBlockedUsers != null ? 0 : LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                                    size2 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null ? 0 : LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
                                    if (size - size2 <= 0 && ((size != 1 || size2 != 1) && LimitReachedBottomSheet.this.canSendLink)) {
                                        PremiumButtonView premiumButtonView = new PremiumButtonView(context, false, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                        ScaleStateListAnimator.apply(premiumButtonView, 0.02f, 1.2f);
                                        premiumButtonView.setButton(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$HeaderView$$ExternalSyntheticLambda0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                LimitReachedBottomSheet.HeaderView.$r8$lambda$mLV7pqEY9cmVooda8cBdLg5yrH8(LimitReachedBottomSheet.HeaderView.this, view);
                                            }
                                        });
                                        addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, (((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 0.0f, (((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 18.0f));
                                        TextView textView3 = new TextView(context) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.HeaderView.1
                                            private final Paint paint = new Paint(1);

                                            @Override // android.view.View
                                            protected void dispatchDraw(Canvas canvas) {
                                                this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 0.8f));
                                                this.paint.setStyle(Paint.Style.STROKE);
                                                this.paint.setStrokeWidth(1.0f);
                                                float height = getHeight() / 2.0f;
                                                Layout layout = getLayout();
                                                int i18 = 0;
                                                for (int i19 = 0; i19 < layout.getLineCount(); i19++) {
                                                    i18 = Math.max(i18, (int) layout.getLineWidth(i19));
                                                }
                                                float f6 = i18 / 2.0f;
                                                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f6) - AndroidUtilities.dp(8.0f), height, this.paint);
                                                canvas.drawLine((getWidth() / 2.0f) + f6 + AndroidUtilities.dp(8.0f), height, getWidth(), height, this.paint);
                                                super.dispatchDraw(canvas);
                                            }
                                        };
                                        textView3.setGravity(17);
                                        textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        textView3.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                        textView3.setTextSize(14.0f);
                                        addView(textView3, LayoutHelper.createLinear(NotificationCenter.boostedChannelByUser, -2, 1, 12, 0, 12, 20));
                                        TextView textView4 = new TextView(context);
                                        textView4.setGravity(17);
                                        textView4.setTypeface(AndroidUtilities.bold());
                                        textView4.setTextSize(1, 20.0f);
                                        textView4.setTextColor(Theme.getColor(i17, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        textView4.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                        addView(textView4, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                                        TextView textView5 = new TextView(context);
                                        textView5.setGravity(17);
                                        textView5.setTextSize(1, 14.0f);
                                        textView5.setTextColor(Theme.getColor(i17, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size() <= 1) {
                                            textView5.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                        } else {
                                            textView5.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                        }
                                        addView(textView5, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                                    } else {
                                        ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                        LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                                    }
                                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                                }
                                int i18 = LimitReachedBottomSheet.this.type;
                                if (i18 == 31 || i18 == 34) {
                                    i8 = 19;
                                    f2 = 14.0f;
                                } else {
                                    i8 = 19;
                                    f2 = 14.0f;
                                    LimitPreviewView limitPreviewView = new LimitPreviewView(context, i10, i, i14, f5, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.HeaderView.2
                                        @Override // android.view.View
                                        public void invalidate() {
                                            if (LimitReachedBottomSheet.this.lockInvalidation) {
                                                return;
                                            }
                                            super.invalidate();
                                        }
                                    };
                                    LimitReachedBottomSheet.this.limitPreviewView = limitPreviewView;
                                    if (z) {
                                        if (LimitReachedBottomSheet.this.boostsStatus != null) {
                                            LimitReachedBottomSheet.this.limitPreviewView.setBoosts(LimitReachedBottomSheet.this.boostsStatus, LimitReachedBottomSheet.this.canApplyBoost != null && LimitReachedBottomSheet.this.canApplyBoost.boostedNow);
                                        }
                                    } else {
                                        limitPreviewView.setBagePosition(f);
                                        LimitReachedBottomSheet.this.limitPreviewView.setType(LimitReachedBottomSheet.this.type);
                                        LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(8);
                                        if (!premiumFeaturesBlocked) {
                                            if (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) {
                                                LimitReachedBottomSheet.this.limitPreviewView.premiumCount.setVisibility(8);
                                                if (LimitReachedBottomSheet.this.type == 6) {
                                                    LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText("2 GB");
                                                } else {
                                                    LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText(Integer.toString(i13));
                                                }
                                                LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(0);
                                            }
                                        } else {
                                            LimitReachedBottomSheet.this.limitPreviewView.setPremiumLocked();
                                        }
                                    }
                                    int i19 = LimitReachedBottomSheet.this.type;
                                    if (i19 == 2 || i19 == 5) {
                                        LimitReachedBottomSheet.this.limitPreviewView.setDelayedAnimation();
                                    }
                                    addView(LimitReachedBottomSheet.this.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                                }
                                if (LimitReachedBottomSheet.this.type == 31) {
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    imageView.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.large_boosts));
                                    frameLayout.addView(imageView, LayoutHelper.createFrame(-2, -2, 17));
                                    frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(79.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                                    addView(frameLayout, LayoutHelper.createLinear(79, 79, 1, 0, 23, 0, 0));
                                }
                                TextView textView6 = new TextView(context);
                                this.title = textView6;
                                textView6.setTypeface(AndroidUtilities.bold());
                                int i20 = LimitReachedBottomSheet.this.type;
                                if (i20 == 31) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                                } else if (i20 == 32) {
                                    this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                } else if (i20 == i8) {
                                    if (!(LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity)) {
                                        this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                    } else {
                                        this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                    }
                                } else if (i20 == 30) {
                                    this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                } else if (i20 == 35) {
                                    this.title.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                                } else if (i20 == 18) {
                                    if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableStories));
                                    } else {
                                        this.title.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                                    }
                                } else if (i20 == 21) {
                                    this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                                } else if (i20 == 20) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
                                } else if (i20 == 24) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                                } else if (i20 == 27) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                                } else if (i20 == 28) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                                } else if (i20 == 25) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                                } else if (i20 == 26) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                                } else if (i20 == 29) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                                } else {
                                    if (i20 == 22 || i20 == 23) {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                    } else if (i20 == 11) {
                                        if (LimitReachedBottomSheet.this.canSendLink) {
                                            this.title.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                                        } else {
                                            this.title.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted));
                                        }
                                    } else if (i20 == 34) {
                                        this.title.setText(LocaleController.getString(R.string.CallInviteViaLinkTitle));
                                    } else if (i20 == 6) {
                                        this.title.setText(LocaleController.getString(R.string.FileTooLarge));
                                    } else if (i20 == 14 && LimitReachedBottomSheet.this.storiesCount > 1) {
                                        this.title.setText(LocaleController.getString(R.string.CreateMultipleStories));
                                    } else {
                                        this.title.setText(LocaleController.getString(R.string.LimitReached));
                                    }
                                    this.title.setTextSize(1, 20.0f);
                                    TextView textView7 = this.title;
                                    int i21 = Theme.key_windowBackgroundWhiteBlackText;
                                    textView7.setTextColor(Theme.getColor(i21, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    this.title.setGravity(17);
                                    i9 = LimitReachedBottomSheet.this.type;
                                    if (i9 != i8 || i9 == 32 || LimitReachedBottomSheet.this.isMiniBoostBtnForAdminAvailable()) {
                                        BoostCounterView boostCounterView = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                        this.boostCounterView = boostCounterView;
                                        boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                        if (LimitReachedBottomSheet.this.type == 32) {
                                            this.boostCounterView.setVisibility(8);
                                        }
                                        if (!LimitReachedBottomSheet.this.isCurrentChat) {
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            this.titleLinearLayout = linearLayout;
                                            linearLayout.setOrientation(0);
                                            this.titleLinearLayout.setWeightSum(1.0f);
                                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                            this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                            addView(this.titleLinearLayout, LayoutHelper.createLinear(-2, -2, 1, 12, premiumFeaturesBlocked ? 8 : 22, 12, 9));
                                        } else {
                                            addView(this.title, LayoutHelper.createLinear(-2, -2, 1, 0, premiumFeaturesBlocked ? 8 : 22, 0, 0));
                                            LinearLayout linearLayout2 = new LinearLayout(getContext());
                                            linearLayout2.setOrientation(0);
                                            linearLayout2.setClipChildren(false);
                                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                                            frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                            BackupImageView backupImageView = new BackupImageView(getContext());
                                            backupImageView.setRoundRadius(AndroidUtilities.dp(f2));
                                            TLRPC.Chat chat2 = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                            AvatarDrawable avatarDrawable = new AvatarDrawable();
                                            avatarDrawable.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat2);
                                            backupImageView.setForUserOrChat(chat2, avatarDrawable);
                                            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(28, 28.0f));
                                            TextView textView8 = new TextView(getContext());
                                            if (chat2 != null) {
                                                textView8.setText(chat2.title);
                                            }
                                            textView8.setSingleLine(true);
                                            textView8.setMaxLines(1);
                                            textView8.setEllipsize(TextUtils.TruncateAt.END);
                                            textView8.setTextSize(1, 13.0f);
                                            textView8.setTextColor(Theme.getColor(i21, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                            frameLayout2.addView(textView8, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                            linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                            LayoutTransition layoutTransition = new LayoutTransition();
                                            layoutTransition.setDuration(100L);
                                            layoutTransition.enableTransitionType(4);
                                            linearLayout2.setLayoutTransition(layoutTransition);
                                            linearLayout2.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                            addView(linearLayout2, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                            ScaleStateListAnimator.apply(linearLayout2);
                                            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$HeaderView$$ExternalSyntheticLambda1
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    LimitReachedBottomSheet.HeaderView.$r8$lambda$0dQzoSgt80Zip5H9SqIt0Gdkw0w(LimitReachedBottomSheet.HeaderView.this, view);
                                                }
                                            });
                                        }
                                    } else {
                                        addView(this.title, LayoutHelper.createLinear(-2, -2, 1, 0, premiumFeaturesBlocked ? 8 : 22, 0, 10));
                                    }
                                    TextView textView9 = new TextView(context);
                                    this.description = textView9;
                                    textView9.setText(AndroidUtilities.replaceTags(str));
                                    this.description.setTextSize(1, 14.0f);
                                    this.description.setGravity(1);
                                    TextView textView10 = this.description;
                                    textView10.setLineSpacing(textView10.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                                    if (LimitReachedBottomSheet.this.type != 18) {
                                        if (((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider instanceof DarkThemeResourceProvider) {
                                            this.description.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        } else {
                                            this.description.setTextColor(Theme.getColor(i21, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        }
                                    } else {
                                        this.description.setTextColor(Theme.getColor(i21, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    }
                                    if (LimitReachedBottomSheet.this.type != i8) {
                                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                                    } else {
                                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                                    }
                                    if (LimitReachedBottomSheet.this.type == 31) {
                                        ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                    }
                                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                                    return;
                                }
                                this.title.setTextSize(1, 20.0f);
                                TextView textView72 = this.title;
                                int i212 = Theme.key_windowBackgroundWhiteBlackText;
                                textView72.setTextColor(Theme.getColor(i212, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                this.title.setGravity(17);
                                i9 = LimitReachedBottomSheet.this.type;
                                if (i9 != i8) {
                                }
                                BoostCounterView boostCounterView2 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                this.boostCounterView = boostCounterView2;
                                boostCounterView2.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                if (LimitReachedBottomSheet.this.type == 32) {
                                }
                                if (!LimitReachedBottomSheet.this.isCurrentChat) {
                                }
                                TextView textView92 = new TextView(context);
                                this.description = textView92;
                                textView92.setText(AndroidUtilities.replaceTags(str));
                                this.description.setTextSize(1, 14.0f);
                                this.description.setGravity(1);
                                TextView textView102 = this.description;
                                textView102.setLineSpacing(textView102.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                                if (LimitReachedBottomSheet.this.type != 18) {
                                }
                                if (LimitReachedBottomSheet.this.type != i8) {
                                }
                                if (LimitReachedBottomSheet.this.type == 31) {
                                }
                                LimitReachedBottomSheet.this.updatePremiumButtonText();
                                return;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                        if (i3 != 11) {
                        }
                        if (!LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                        }
                        AvatarsImageView avatarsImageView2 = new AvatarsImageView(context, false);
                        avatarsImageView2.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                        avatarsImageView2.setSize(AndroidUtilities.dp(72.0f));
                        avatarsImageView2.setStepFactor(0.4f);
                        min = Math.min(arrayList.size(), 3);
                        avatarsImageView2.setCount(min);
                        while (i4 < min) {
                        }
                        avatarsImageView2.commitTransition(false);
                        addView(avatarsImageView2, LayoutHelper.createLinear(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                        TextView textView11 = new TextView(context);
                        textView11.setGravity(17);
                        textView11.setTypeface(AndroidUtilities.bold());
                        textView11.setTextSize(1, 20.0f);
                        int i172 = Theme.key_dialogTextBlack;
                        textView11.setTextColor(Theme.getColor(i172, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        textView11.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                        addView(textView11, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                        TextView textView22 = new TextView(context);
                        textView22.setGravity(17);
                        textView22.setTextSize(1, 14.0f);
                        textView22.setTextColor(Theme.getColor(i172, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        addView(textView22, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                        if (LimitReachedBottomSheet.this.type != 34) {
                        }
                        if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                        }
                        if (arrayList.size() != 1) {
                        }
                        textView22.setText(AndroidUtilities.replaceTags(str3));
                        if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers != null) {
                        }
                        if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                        }
                        if (size - size2 <= 0) {
                        }
                        ((ViewGroup.MarginLayoutParams) textView22.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                        LimitReachedBottomSheet.this.updatePremiumButtonText();
                    }
                    if (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium()) {
                    }
                    i = i14;
                    f = 1.0f;
                    float f52 = i13 / i14;
                    i3 = LimitReachedBottomSheet.this.type;
                    if (i3 == 18) {
                    }
                    z = true;
                    if (z) {
                    }
                    if (i3 != 11) {
                    }
                    if (!LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                    }
                    AvatarsImageView avatarsImageView22 = new AvatarsImageView(context, false);
                    avatarsImageView22.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                    avatarsImageView22.setSize(AndroidUtilities.dp(72.0f));
                    avatarsImageView22.setStepFactor(0.4f);
                    min = Math.min(arrayList.size(), 3);
                    avatarsImageView22.setCount(min);
                    while (i4 < min) {
                    }
                    avatarsImageView22.commitTransition(false);
                    addView(avatarsImageView22, LayoutHelper.createLinear(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView112 = new TextView(context);
                    textView112.setGravity(17);
                    textView112.setTypeface(AndroidUtilities.bold());
                    textView112.setTextSize(1, 20.0f);
                    int i1722 = Theme.key_dialogTextBlack;
                    textView112.setTextColor(Theme.getColor(i1722, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    textView112.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView112, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                    TextView textView222 = new TextView(context);
                    textView222.setGravity(17);
                    textView222.setTextSize(1, 14.0f);
                    textView222.setTextColor(Theme.getColor(i1722, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    addView(textView222, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                    if (LimitReachedBottomSheet.this.type != 34) {
                    }
                    if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                    }
                    if (arrayList.size() != 1) {
                    }
                    textView222.setText(AndroidUtilities.replaceTags(str3));
                    if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers != null) {
                    }
                    if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                    }
                    if (size - size2 <= 0) {
                    }
                    ((ViewGroup.MarginLayoutParams) textView222.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                }
                formatString = i11 == 34 ? LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteCallRestrictedUsersOne, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteCallRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size())) : premiumFeaturesBlocked ? LimitReachedBottomSheet.this.limitParams.descriptionStrLocked : (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) ? LimitReachedBottomSheet.this.limitParams.descriptionStrPremium : LimitReachedBottomSheet.this.limitParams.descriptionStr;
            }
            str = formatString;
            LimitParams limitParams22 = LimitReachedBottomSheet.this.limitParams;
            int i132 = limitParams22.defaultLimit;
            int i142 = limitParams22.premiumLimit;
            i = LimitReachedBottomSheet.this.currentValue;
            i2 = LimitReachedBottomSheet.this.type;
            if (i2 != 3) {
            }
            if (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium()) {
            }
            i = i142;
            f = 1.0f;
            float f522 = i132 / i142;
            i3 = LimitReachedBottomSheet.this.type;
            if (i3 == 18) {
            }
            z = true;
            if (z) {
            }
            if (i3 != 11) {
            }
            if (!LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
            }
            AvatarsImageView avatarsImageView222 = new AvatarsImageView(context, false);
            avatarsImageView222.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
            avatarsImageView222.setSize(AndroidUtilities.dp(72.0f));
            avatarsImageView222.setStepFactor(0.4f);
            min = Math.min(arrayList.size(), 3);
            avatarsImageView222.setCount(min);
            while (i4 < min) {
            }
            avatarsImageView222.commitTransition(false);
            addView(avatarsImageView222, LayoutHelper.createLinear(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
            TextView textView1122 = new TextView(context);
            textView1122.setGravity(17);
            textView1122.setTypeface(AndroidUtilities.bold());
            textView1122.setTextSize(1, 20.0f);
            int i17222 = Theme.key_dialogTextBlack;
            textView1122.setTextColor(Theme.getColor(i17222, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            textView1122.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
            addView(textView1122, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
            TextView textView2222 = new TextView(context);
            textView2222.setGravity(17);
            textView2222.setTextSize(1, 14.0f);
            textView2222.setTextColor(Theme.getColor(i17222, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            addView(textView2222, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
            if (LimitReachedBottomSheet.this.type != 34) {
            }
            if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
            }
            if (arrayList.size() != 1) {
            }
            textView2222.setText(AndroidUtilities.replaceTags(str3));
            if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers != null) {
            }
            if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
            }
            if (size - size2 <= 0) {
            }
            ((ViewGroup.MarginLayoutParams) textView2222.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
            LimitReachedBottomSheet.this.updatePremiumButtonText();
        }

        public static /* synthetic */ void $r8$lambda$mLV7pqEY9cmVooda8cBdLg5yrH8(HeaderView headerView, View view) {
            if (LimitReachedBottomSheet.this.parentFragment == null) {
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            LimitReachedBottomSheet.this.parentFragment.showAsSheet(new PremiumPreviewFragment("invite_privacy"), bottomSheetParams);
        }

        public static /* synthetic */ void $r8$lambda$0dQzoSgt80Zip5H9SqIt0Gdkw0w(HeaderView headerView, View view) {
            LimitReachedBottomSheet.this.getBaseFragment().presentFragment(ChatActivity.of(LimitReachedBottomSheet.this.dialogId));
            LimitReachedBottomSheet.this.dismiss();
        }

        public void recreateTitleAndDescription() {
            int indexOfChild = indexOfChild(this.description);
            if (LimitReachedBottomSheet.this.isCurrentChat) {
                int indexOfChild2 = indexOfChild(this.titleLinearLayout);
                removeView(this.titleLinearLayout);
                this.titleLinearLayout.removeView(this.title);
                this.titleLinearLayout.removeView(this.boostCounterView);
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.titleLinearLayout = linearLayout;
                linearLayout.setOrientation(0);
                this.titleLinearLayout.setWeightSum(1.0f);
                this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                addView(this.titleLinearLayout, indexOfChild2, LayoutHelper.createLinear(-2, -2, 1, 25, 22, 12, 9));
            } else {
                int indexOfChild3 = indexOfChild(this.title);
                removeView(this.title);
                TextView textView = new TextView(getContext());
                this.title = textView;
                textView.setTypeface(AndroidUtilities.bold());
                this.title.setTextSize(1, 20.0f);
                this.title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                this.title.setGravity(17);
                addView(this.title, indexOfChild3, LayoutHelper.createLinear(-2, -2, 1, 0, 22, 0, 0));
            }
            removeView(this.description);
            TextView textView2 = new TextView(getContext());
            this.description = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.description;
            textView3.setLineSpacing(textView3.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
            this.description.setGravity(1);
            this.description.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            addView(this.description, indexOfChild, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBoostsTitleString() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.canApplyBoost.alreadyActive) {
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        if (this.isCurrentChat) {
            if (this.type == 32) {
                return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            if (this.canApplyBoost.alreadyActive) {
                return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
            }
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        if (this.type == 32) {
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        if (this.canApplyBoost.alreadyActive) {
            return LocaleController.getString(isGroup() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
        }
        return LocaleController.getString(isGroup() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TLRPC.Chat getChat() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
    }

    private TLRPC.ChatFull getChatFull() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isGroup() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)));
    }

    private String getDescriptionForRemoveRestrictions() {
        TLRPC.Chat chat = getChat();
        return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", getNeededBoostsForUnlockGroup(), chat == null ? "" : chat.title);
    }

    private int getNeededBoostsForUnlockGroup() {
        TLRPC.ChatFull chatFull = getChatFull();
        return Math.max(chatFull.boosts_unrestrict - chatFull.boosts_applied, 0);
    }

    private String getBoostDescriptionStringAfterBoost() {
        String str;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean isGroup = isGroup();
        int i = this.type;
        if (i == 20) {
            str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(channelColorLevelMin()));
        } else if (i == 24) {
            str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(channelColorLevelMin()));
        } else if (i == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i == 25) {
            str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(isGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i == 26) {
            str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(isGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i == 27) {
            str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i == 28) {
            str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(isGroup ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i == 22) {
            str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(isGroup ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i == 23) {
            str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(isGroup ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else {
            str = null;
        }
        return str != null ? str : getBoostsDescriptionString(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBoostsDescriptionString(boolean z) {
        String str;
        if (this.type == 32) {
            return getDescriptionForRemoveRestrictions();
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        if (chat == null) {
            str = LocaleController.getString(isGroup() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        boolean z2 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (isMiniBoostBtnForAdminAvailable() && this.boostsStatus.next_level_boosts != 0 && z) {
            int i = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.boostsStatus;
            int i2 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i, str, LocaleController.formatPluralString("MoreBoosts", i2, Integer.valueOf(i2)));
        }
        if (z2 && this.canApplyBoost.alreadyActive) {
            if (this.boostsStatus.level == 1) {
                return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level, new Object[0]));
        }
        if (this.canApplyBoost.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.boostsStatus;
            if (tL_premium_boostsStatus3.level == 0) {
                int i3 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.boostsStatus;
                int i4 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i3, str, LocaleController.formatPluralString("MoreBoosts", i4, Integer.valueOf(i4)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level + 1, new Object[0]));
            }
            int i5 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.boostsStatus;
            int i6 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return LocaleController.formatString(i5, str, LocaleController.formatPluralString("MoreBoosts", i6, Integer.valueOf(i6)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.boostsStatus;
        if (tL_premium_boostsStatus6.level == 0) {
            int i7 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.boostsStatus;
            int i8 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return LocaleController.formatString(i7, str, LocaleController.formatPluralString("MoreBoosts", i8, Integer.valueOf(i8)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level + 1, new Object[0]));
        }
        int i9 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.boostsStatus;
        int i10 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return LocaleController.formatString(i9, str, LocaleController.formatPluralString("MoreBoosts", i10, Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LimitParams getLimitParams(int i, int i2) {
        LimitParams limitParams = new LimitParams();
        if (i == 0) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersPinnedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersPinnedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_pin;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 33) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).savedDialogsPinnedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).savedDialogsPinnedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_pin;
            limitParams.descriptionStr = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 2) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).publicLinksLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).publicLinksLimitPremium;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 12) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).chatlistInvitesLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).chatlistInvitesLimitPremium;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 13) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).chatlistJoinedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).chatlistJoinedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 3) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersLimitPremium;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 4) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersChatsLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersChatsLimitPremium;
            limitParams.icon = R.drawable.msg_limit_chats;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 5) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).channelsLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).channelsLimitPremium;
            limitParams.icon = R.drawable.msg_limit_groups;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 6) {
            limitParams.defaultLimit = 100;
            limitParams.premiumLimit = NotificationCenter.dialogPhotosUpdate;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return limitParams;
        }
        if (i == 7) {
            limitParams.defaultLimit = 3;
            limitParams.premiumLimit = 4;
            limitParams.icon = R.drawable.msg_limit_accounts;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(limitParams.premiumLimit));
            int i3 = R.string.LimitReachedAccountsPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 11) {
            limitParams.defaultLimit = 0;
            limitParams.premiumLimit = 0;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = "";
            limitParams.descriptionStrLocked = "";
            return limitParams;
        }
        if (i == 14) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storyExpiringLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storyExpiringLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", limitParams.defaultLimit) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", limitParams.premiumLimit);
            limitParams.descriptionStrPremium = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", limitParams.premiumLimit);
            limitParams.descriptionStrLocked = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", limitParams.defaultLimit);
            return limitParams;
        }
        if (i == 15) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentWeeklyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentWeeklyLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i4 = R.string.LimitReachedStoriesWeeklyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i4, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i4, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i == 16) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i5 = R.string.LimitReachedStoriesMonthlyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i5, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i5, Integer.valueOf(limitParams.defaultLimit));
            return limitParams;
        }
        if (i != 18 && i != 32 && i != 20 && i != 24 && i != 27 && i != 28 && i != 25 && i != 30 && i != 35 && i != 29 && i != 22 && i != 23 && i != 19 && i != 21 && i != 26) {
            return limitParams;
        }
        limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitDefault;
        limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitPremium;
        limitParams.icon = R.drawable.filled_limit_boost;
        limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
        int i6 = R.string.LimitReachedStoriesMonthlyPremium;
        limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(limitParams.premiumLimit));
        limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(limitParams.defaultLimit));
        return limitParams;
    }

    private void loadAdminedChannels() {
        this.loadingAdminedChannels = true;
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new RequestDelegate() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda10
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LimitReachedBottomSheet.$r8$lambda$aRkRubIvuitLgxYkZfg3wM7VblM(LimitReachedBottomSheet.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$aRkRubIvuitLgxYkZfg3wM7VblM(final LimitReachedBottomSheet limitReachedBottomSheet, final TLObject tLObject, TLRPC.TL_error tL_error) {
        limitReachedBottomSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                LimitReachedBottomSheet.$r8$lambda$OW5FaB36HtlspltcESV2Nwfshx8(LimitReachedBottomSheet.this, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$OW5FaB36HtlspltcESV2Nwfshx8(LimitReachedBottomSheet limitReachedBottomSheet, TLObject tLObject) {
        int i;
        limitReachedBottomSheet.loadingAdminedChannels = false;
        if (tLObject != null) {
            limitReachedBottomSheet.chats.clear();
            limitReachedBottomSheet.chats.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
            limitReachedBottomSheet.loading = false;
            limitReachedBottomSheet.enterAnimator.showItemsAnimated(limitReachedBottomSheet.chatsTitleRow + 4);
            int i2 = 0;
            while (true) {
                if (i2 >= limitReachedBottomSheet.recyclerListView.getChildCount()) {
                    i = 0;
                    break;
                } else {
                    if (limitReachedBottomSheet.recyclerListView.getChildAt(i2) instanceof HeaderView) {
                        i = limitReachedBottomSheet.recyclerListView.getChildAt(i2).getTop();
                        break;
                    }
                    i2++;
                }
            }
            limitReachedBottomSheet.updateRows();
            if (limitReachedBottomSheet.headerRow >= 0 && i != 0) {
                ((LinearLayoutManager) limitReachedBottomSheet.recyclerListView.getLayoutManager()).scrollToPositionWithOffset(limitReachedBottomSheet.headerRow + 1, i);
            }
        }
        int max = Math.max(limitReachedBottomSheet.chats.size(), limitReachedBottomSheet.limitParams.defaultLimit);
        limitReachedBottomSheet.limitPreviewView.setIconValue(max, false);
        limitReachedBottomSheet.limitPreviewView.setBagePosition(max / limitReachedBottomSheet.limitParams.premiumLimit);
        limitReachedBottomSheet.limitPreviewView.startDelayedAnimation();
    }

    private void updateRows() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.dividerRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.loadingRow = -1;
        this.linkRow = -1;
        this.emptyViewDividerRow = -1;
        this.boostFeaturesStartRow = -1;
        this.rowCount = 1;
        this.headerRow = 0;
        int i = this.type;
        if (i == 19 || i == 18 || i == 20 || i == 24 || i == 27 || i == 28 || i == 22 || i == 23 || i == 25 || i == 26 || i == 29 || i == 21 || i == 30 || i == 35) {
            if (i != 19 || ChatObject.hasAdminRights(getChat())) {
                this.topPadding = 0.24f;
                int i2 = this.rowCount;
                this.rowCount = i2 + 1;
                this.linkRow = i2;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i3 = this.rowCount;
                    this.rowCount = i3 + 1;
                    this.bottomRow = i3;
                }
            }
            setupBoostFeatures();
            int i4 = this.rowCount;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.boostFeaturesStartRow = i4;
            this.rowCount = i5 + (this.boostFeatures.size() - 1);
        } else if (i == 31 || i == 32) {
            this.topPadding = 0.24f;
            setupBoostFeatures();
            int i6 = this.rowCount;
            this.chatStartRow = i6;
            int i7 = i6 + 1;
            this.rowCount = i7;
            this.boostFeaturesStartRow = i6;
            int size = i7 + (this.boostFeatures.size() - 1);
            this.rowCount = size;
            this.chatEndRow = size;
        } else if (!hasFixedSize(i)) {
            int i8 = this.type;
            if (i8 != 11 && i8 != 34) {
                int i9 = this.rowCount;
                this.dividerRow = i9;
                this.rowCount = i9 + 2;
                this.chatsTitleRow = i9 + 1;
            } else {
                this.topPadding = 0.24f;
            }
            if (this.loading) {
                int i10 = this.rowCount;
                this.rowCount = i10 + 1;
                this.loadingRow = i10;
            } else if (i8 != 11 || this.canSendLink) {
                if (i8 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.premiumInviteBlockedUsers) == null || arrayList.isEmpty()) && ((arrayList2 = this.premiumMessagingBlockedUsers) == null || arrayList2.size() < this.restrictedUsers.size())) || (arrayList3 = this.premiumInviteBlockedUsers) == null || arrayList3.size() != 1 || (arrayList4 = this.premiumMessagingBlockedUsers) == null || arrayList4.size() != 1 || !this.canSendLink)) {
                    int i11 = this.rowCount;
                    this.chatStartRow = i11;
                    int i12 = this.type;
                    if (i12 == 11 || i12 == 34) {
                        this.rowCount = i11 + this.restrictedUsers.size();
                    } else if (i12 == 5) {
                        this.rowCount = i11 + this.inactiveChats.size();
                    } else {
                        this.rowCount = i11 + this.chats.size();
                    }
                    this.chatEndRow = this.rowCount;
                }
                if (this.chatEndRow - this.chatStartRow > 1) {
                    int i13 = this.rowCount;
                    this.rowCount = i13 + 1;
                    this.emptyViewDividerRow = i13;
                }
            }
        }
        notifyDataSetChanged();
    }

    private void revokeSelectedLinks() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.selectedChats.iterator();
        while (it.hasNext()) {
            this.chats.add((TLRPC.Chat) it.next());
        }
        revokeLinks(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void revokeLinks(final ArrayList arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]));
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.parentIsChannel) {
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title)));
            } else {
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title)));
            }
        } else if (this.parentIsChannel) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0])));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda13
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                LimitReachedBottomSheet.$r8$lambda$16R3_eR5czSDiaAFK4z5PfcNyrY(LimitReachedBottomSheet.this, arrayList, alertDialog, i);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        }
    }

    public static /* synthetic */ void $r8$lambda$16R3_eR5czSDiaAFK4z5PfcNyrY(final LimitReachedBottomSheet limitReachedBottomSheet, ArrayList arrayList, AlertDialog alertDialog, int i) {
        limitReachedBottomSheet.dismiss();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i2));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(limitReachedBottomSheet.currentAccount).sendRequest(tL_channels_updateUsername, new RequestDelegate() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda24
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LimitReachedBottomSheet.$r8$lambda$TrBtSSoT0XLUy4XJtHUixMzLvrc(LimitReachedBottomSheet.this, tLObject, tL_error);
                }
            }, 64);
        }
    }

    public static /* synthetic */ void $r8$lambda$TrBtSSoT0XLUy4XJtHUixMzLvrc(LimitReachedBottomSheet limitReachedBottomSheet, TLObject tLObject, TLRPC.TL_error tL_error) {
        limitReachedBottomSheet.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            AndroidUtilities.runOnUIThread(limitReachedBottomSheet.onSuccessRunnable);
        }
    }

    private void loadInactiveChannels() {
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new RequestDelegate() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LimitReachedBottomSheet.$r8$lambda$tc4eyxY6fGej7abvHRI6TQJNMkM(LimitReachedBottomSheet.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$tc4eyxY6fGej7abvHRI6TQJNMkM(final LimitReachedBottomSheet limitReachedBottomSheet, TLObject tLObject, TLRPC.TL_error tL_error) {
        String formatPluralString;
        limitReachedBottomSheet.getClass();
        if (tL_error == null) {
            final TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            final ArrayList arrayList = new ArrayList();
            final int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i = 0; i < min; i++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                int currentTime = (ConnectionsManager.getInstance(limitReachedBottomSheet.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                if (currentTime < 30) {
                    formatPluralString = LocaleController.formatPluralString("Days", currentTime, new Object[0]);
                } else if (currentTime < 365) {
                    formatPluralString = LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                }
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    LimitReachedBottomSheet.$r8$lambda$5gDKfGafmteExgaxfiacCLEjUVQ(LimitReachedBottomSheet.this, arrayList, min, tL_messages_inactiveChats);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$5gDKfGafmteExgaxfiacCLEjUVQ(LimitReachedBottomSheet limitReachedBottomSheet, ArrayList arrayList, int i, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i2;
        limitReachedBottomSheet.inactiveChatsSignatures.clear();
        limitReachedBottomSheet.inactiveChats.clear();
        limitReachedBottomSheet.inactiveChatsSignatures.addAll(arrayList);
        for (int i3 = 0; i3 < i; i3++) {
            limitReachedBottomSheet.inactiveChats.add(tL_messages_inactiveChats.chats.get(i3));
        }
        limitReachedBottomSheet.loading = false;
        limitReachedBottomSheet.enterAnimator.showItemsAnimated(limitReachedBottomSheet.chatsTitleRow + 4);
        int i4 = 0;
        while (true) {
            if (i4 >= limitReachedBottomSheet.recyclerListView.getChildCount()) {
                i2 = 0;
                break;
            } else {
                if (limitReachedBottomSheet.recyclerListView.getChildAt(i4) instanceof HeaderView) {
                    i2 = limitReachedBottomSheet.recyclerListView.getChildAt(i4).getTop();
                    break;
                }
                i4++;
            }
        }
        limitReachedBottomSheet.updateRows();
        if (limitReachedBottomSheet.headerRow >= 0 && i2 != 0) {
            ((LinearLayoutManager) limitReachedBottomSheet.recyclerListView.getLayoutManager()).scrollToPositionWithOffset(limitReachedBottomSheet.headerRow + 1, i2);
        }
        if (limitReachedBottomSheet.limitParams == null) {
            limitReachedBottomSheet.limitParams = getLimitParams(limitReachedBottomSheet.type, limitReachedBottomSheet.currentAccount);
        }
        int max = Math.max(limitReachedBottomSheet.inactiveChats.size(), limitReachedBottomSheet.limitParams.defaultLimit);
        LimitPreviewView limitPreviewView = limitReachedBottomSheet.limitPreviewView;
        if (limitPreviewView != null) {
            limitPreviewView.setIconValue(max, false);
            limitReachedBottomSheet.limitPreviewView.setBagePosition(max / limitReachedBottomSheet.limitParams.premiumLimit);
            limitReachedBottomSheet.limitPreviewView.startDelayedAnimation();
        }
    }

    private void setupBoostFeatures() {
        this.boostFeatures = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList arrayList = null;
        int i = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int max = Math.max(10, peerColors != null ? peerColors.maxLevel(isGroup()) : 0);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            int max2 = Math.max(max, peerColors2 != null ? peerColors2.maxLevel(isGroup()) : 0);
            if (isGroup()) {
                i = Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin);
            } else {
                i = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
            }
        }
        for (int i2 = this.type != 31 ? tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1 : 1; i2 <= i; i2++) {
            ArrayList boostFeaturesForLevel = boostFeaturesForLevel(i2);
            if (arrayList == null || !BoostFeature.arraysEqual(arrayList, boostFeaturesForLevel)) {
                ArrayList arrayList2 = this.boostFeatures;
                arrayList2.add(new BoostFeature.BoostFeatureLevel(i2, arrayList2.isEmpty()));
                this.boostFeatures.addAll(boostFeaturesForLevel);
                arrayList = boostFeaturesForLevel;
            }
        }
    }

    private ArrayList boostFeaturesForLevel(int i) {
        boolean isGroup = isGroup();
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (messagesController == null) {
            return arrayList;
        }
        if (!isGroup && i >= messagesController.channelAutotranslationLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
        }
        arrayList.add(BoostFeature.of(R.drawable.menu_feature_stories, "BoostFeatureStoriesPerDay", i).asIncremental());
        if (!isGroup) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_reactions, "BoostFeatureCustomReaction", i).asIncremental());
        }
        MessagesController.PeerColors peerColors = messagesController.peerColors;
        int colorsAvailable = peerColors != null ? peerColors.colorsAvailable(i, false) : 0;
        MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
        int colorsAvailable2 = peerColors2 != null ? peerColors2.colorsAvailable(i, isGroup) : 0;
        if (!isGroup && colorsAvailable > 0) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_color_name, "BoostFeatureNameColor", 7));
        }
        if (!isGroup && colorsAvailable > 0) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_links, "BoostFeatureReplyColor", colorsAvailable));
        }
        if (!isGroup && i >= messagesController.channelBgIconLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
        }
        if (colorsAvailable2 > 0) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_color_profile, isGroup ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor", colorsAvailable2));
        }
        if (isGroup && i >= messagesController.groupEmojiStickersLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
        }
        if ((!isGroup && i >= messagesController.channelProfileIconLevelMin) || (isGroup && i >= messagesController.groupProfileBgIconLevelMin)) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_cover, isGroup ? R.string.BoostFeatureProfileIconGroup : R.string.BoostFeatureProfileIcon));
        }
        if (isGroup && i >= messagesController.groupTranscribeLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
        }
        if ((!isGroup && i >= messagesController.channelEmojiStatusLevelMin) || (isGroup && i >= messagesController.groupEmojiStatusLevelMin)) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, "1000+"));
        }
        if ((!isGroup && i >= messagesController.channelWallpaperLevelMin) || (isGroup && i >= messagesController.groupWallpaperLevelMin)) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_wallpaper, isGroup ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground", 8));
        }
        if ((!isGroup && i >= messagesController.channelCustomWallpaperLevelMin) || (isGroup && i >= messagesController.groupCustomWallpaperLevelMin)) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_custombg, isGroup ? R.string.BoostFeatureCustomBackgroundGroup : R.string.BoostFeatureCustomBackground));
        }
        if (!isGroup && i >= messagesController.channelRestrictSponsoredLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    private class BoostFeatureCell extends FrameLayout {
        public BoostFeature feature;
        private final ImageView imageView;
        public BoostFeature.BoostFeatureLevel level;
        private final FrameLayout levelLayout;
        private final SimpleTextView levelTextView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final SimpleTextView textView;

        public BoostFeatureCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_premiumGradient1, resourcesProvider), PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setWidthWrapContent(true);
            simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            simpleTextView.setTextSize(14);
            boolean z = LocaleController.isRTL;
            addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 16, z ? 30.0f : 60.0f, 0.0f, z ? 60.0f : 30.0f, 0.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.levelTextView = simpleTextView2;
            simpleTextView2.setTextColor(-1);
            simpleTextView2.setWidthWrapContent(true);
            simpleTextView2.setTypeface(AndroidUtilities.bold());
            simpleTextView2.setTextSize(14);
            FrameLayout frameLayout = new FrameLayout(context, LimitReachedBottomSheet.this, resourcesProvider) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.BoostFeatureCell.1
                private final Paint dividerPaint;
                private final PremiumGradient.PremiumGradientTools gradientTools;
                final /* synthetic */ Theme.ResourcesProvider val$resourcesProvider;
                final /* synthetic */ LimitReachedBottomSheet val$this$0;

                {
                    this.val$resourcesProvider = resourcesProvider;
                    this.gradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, resourcesProvider);
                    Paint paint = new Paint(1);
                    this.dividerPaint = paint;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(1.0f);
                }

                @Override // android.view.ViewGroup, android.view.View
                protected void dispatchDraw(Canvas canvas) {
                    this.dividerPaint.setColor(Theme.getColor(Theme.key_sheet_scrollUp, this.val$resourcesProvider));
                    canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, BoostFeatureCell.this.levelTextView.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, this.dividerPaint);
                    canvas.drawLine(BoostFeatureCell.this.levelTextView.getRight() + AndroidUtilities.dp(20.0f), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, this.dividerPaint);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(BoostFeatureCell.this.levelTextView.getLeft() - AndroidUtilities.dp(15.0f), ((BoostFeatureCell.this.levelTextView.getTop() + BoostFeatureCell.this.levelTextView.getBottom()) - AndroidUtilities.dp(30.0f)) / 2.0f, BoostFeatureCell.this.levelTextView.getRight() + AndroidUtilities.dp(15.0f), ((BoostFeatureCell.this.levelTextView.getTop() + BoostFeatureCell.this.levelTextView.getBottom()) + AndroidUtilities.dp(30.0f)) / 2.0f);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.set(0.0f, 0.0f, rectF.width(), rectF.height());
                    this.gradientTools.gradientMatrix(rectF);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.gradientTools.paint);
                    canvas.restore();
                    super.dispatchDraw(canvas);
                }
            };
            this.levelLayout = frameLayout;
            frameLayout.setWillNotDraw(false);
            frameLayout.addView(simpleTextView2, LayoutHelper.createFrame(-2, -2, 17));
            addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f));
        }

        public void set(BoostFeature boostFeature) {
            if (boostFeature instanceof BoostFeature.BoostFeatureLevel) {
                this.level = (BoostFeature.BoostFeatureLevel) boostFeature;
                this.feature = null;
                this.imageView.setVisibility(8);
                this.textView.setVisibility(8);
                this.levelLayout.setVisibility(0);
                SimpleTextView simpleTextView = this.levelTextView;
                BoostFeature.BoostFeatureLevel boostFeatureLevel = this.level;
                simpleTextView.setText(LocaleController.formatPluralString(boostFeatureLevel.isFirst ? "BoostLevelUnlocks" : "BoostLevel", boostFeatureLevel.lvl, new Object[0]));
                return;
            }
            if (boostFeature != null) {
                this.level = null;
                this.feature = boostFeature;
                this.imageView.setVisibility(0);
                this.imageView.setImageResource(this.feature.iconResId);
                this.textView.setVisibility(0);
                BoostFeature boostFeature2 = this.feature;
                if (boostFeature2.textKeyPlural != null) {
                    String string = LocaleController.getString(this.feature.textKeyPlural + "_" + LocaleController.getStringParamForNumber(this.feature.countPlural));
                    if (string == null || string.startsWith("LOC_ERR")) {
                        string = LocaleController.getString(this.feature.textKeyPlural + "_other");
                    }
                    if (string == null) {
                        string = "";
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf("%d");
                    if (indexOf >= 0) {
                        spannableStringBuilder = new SpannableStringBuilder(string);
                        SpannableString spannableString = new SpannableString(this.feature.countPlural + "");
                        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                        spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                    }
                    this.textView.setText(spannableStringBuilder);
                } else {
                    String string2 = LocaleController.getString(boostFeature2.textKey);
                    String str = string2 != null ? string2 : "";
                    if (this.feature.countValue != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        int indexOf2 = str.indexOf("%s");
                        if (indexOf2 >= 0) {
                            spannableStringBuilder2 = new SpannableStringBuilder(str);
                            SpannableString spannableString2 = new SpannableString(this.feature.countValue);
                            spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                            spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                        }
                        this.textView.setText(spannableStringBuilder2);
                    } else {
                        this.textView.setText(str);
                    }
                }
                this.levelLayout.setVisibility(8);
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.level != null ? 49.0f : 36.0f), TLObject.FLAG_30));
        }
    }

    public static LimitReachedBottomSheet openBoostsForRemoveRestrictions(BaseFragment baseFragment, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j, boolean z) {
        if (baseFragment == null || tL_premium_boostsStatus == null || canApplyBoost == null || baseFragment.getContext() == null) {
            return null;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 32, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        if (z) {
            baseFragment.showDialog(limitReachedBottomSheet);
            return limitReachedBottomSheet;
        }
        limitReachedBottomSheet.show();
        return limitReachedBottomSheet;
    }

    public static void openBoostsForUsers(BaseFragment baseFragment, boolean z, long j, ChannelBoostsController.CanApplyBoost canApplyBoost, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChatMessageCell chatMessageCell) {
        if (baseFragment == null || canApplyBoost == null || tL_premium_boostsStatus == null || baseFragment.getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 19, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, z);
        limitReachedBottomSheet.setDialogId(j);
        limitReachedBottomSheet.setChatMessageCell(chatMessageCell);
        baseFragment.showDialog(limitReachedBottomSheet);
    }

    public static void openBoostsForPostingStories(BaseFragment baseFragment, long j, ChannelBoostsController.CanApplyBoost canApplyBoost, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, Runnable runnable) {
        if (baseFragment == null || canApplyBoost == null || tL_premium_boostsStatus == null || baseFragment.getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 18, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        limitReachedBottomSheet.showStatisticButtonInLink(runnable);
        limitReachedBottomSheet.show();
    }
}
