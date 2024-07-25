package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_channels_getAdminedPublicChannels;
import org.telegram.tgnet.TLRPC$TL_channels_getInactiveChannels;
import org.telegram.tgnet.TLRPC$TL_channels_updateUsername;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_dialogFolder;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_chats;
import org.telegram.tgnet.TLRPC$TL_messages_inactiveChats;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.tgnet.tl.TL_stories$TL_premium_myBoosts;
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
/* loaded from: classes3.dex */
public class LimitReachedBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    TextView actionBtn;
    ArrayList<BoostFeature> boostFeatures;
    int boostFeaturesStartRow;
    ButtonWithCounterView boostMiniBtn;
    private ButtonWithCounterView boostToUnlockGroupBtn;
    private TL_stories$TL_premium_boostsStatus boostsStatus;
    int bottomRow;
    private ChannelBoostsController.CanApplyBoost canApplyBoost;
    private boolean canSendLink;
    int chatEndRow;
    private ChatMessageCell chatMessageCell;
    int chatStartRow;
    ArrayList<TLRPC$Chat> chats;
    int chatsTitleRow;
    private int currentValue;
    private long dialogId;
    View divider;
    int dividerRow;
    int emptyViewDividerRow;
    RecyclerItemsEnterAnimator enterAnimator;
    FireworksOverlay fireworksOverlay;
    private TLRPC$Chat fromChat;
    int headerRow;
    private HeaderView headerView;
    private ArrayList<TLRPC$Chat> inactiveChats;
    private ArrayList<String> inactiveChatsSignatures;
    private boolean isCurrentChat;
    private boolean isVeryLargeFile;
    LimitParams limitParams;
    LimitPreviewView limitPreviewView;
    private int linkRow;
    private boolean loading;
    int loadingRow;
    private boolean lockInvalidation;
    public Runnable onShowPremiumScreenRunnable;
    public Runnable onSuccessRunnable;
    BaseFragment parentFragment;
    public boolean parentIsChannel;
    PremiumButtonView premiumButtonView;
    private ArrayList<Long> premiumInviteBlockedUsers;
    private ArrayList<Long> premiumMessagingBlockedUsers;
    private int requiredLvl;
    private ArrayList<TLRPC$User> restrictedUsers;
    int rowCount;
    HashSet<Object> selectedChats;
    private int shiftDp;
    Runnable statisticClickRunnable;
    final int type;

    /* loaded from: classes3.dex */
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

    protected int channelColorLevelMin() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class BoostFeature {
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

        public static boolean arraysEqual(ArrayList<BoostFeature> arrayList, ArrayList<BoostFeature> arrayList2) {
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if ((arrayList == null || arrayList2 != null) && ((arrayList != null || arrayList2 == null) && arrayList.size() == arrayList2.size())) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!arrayList.get(i).equals(arrayList2.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        /* loaded from: classes3.dex */
        public static class BoostFeatureLevel extends BoostFeature {
            public final boolean isFirst;
            public final int lvl;

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
        this.chats = new ArrayList<>();
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
        this.selectedChats = new HashSet<>();
        this.inactiveChats = new ArrayList<>();
        this.inactiveChatsSignatures = new ArrayList<>();
        this.restrictedUsers = new ArrayList<>();
        this.premiumMessagingBlockedUsers = new ArrayList<>();
        this.premiumInviteBlockedUsers = new ArrayList<>();
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
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 29 || i == 22 || i == 23 || i == 21 || i == 26 || i == 27 || i == 30 || i == 31) {
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
            this.actionBtn.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LimitReachedBottomSheet.this.lambda$new$0(view2);
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
            this.boostToUnlockGroupBtn.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LimitReachedBottomSheet.this.lambda$new$1(view2);
                }
            });
            this.containerView.addView(this.boostToUnlockGroupBtn, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    LimitReachedBottomSheet.this.lambda$new$2();
                }
            });
        }
        if (i == 19 || i == 18) {
            this.containerView.post(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    LimitReachedBottomSheet.this.lambda$new$3();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        AndroidUtilities.addToClipboard(getBoostLink());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        if (this.premiumButtonView.isShowOverlay()) {
            this.premiumButtonView.overlayTextView.performClick();
        } else {
            this.premiumButtonView.buttonLayout.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        this.boostToUnlockGroupBtn.setCount(getNeededBoostsForUnlockGroup(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        if (ChatObject.hasAdminRights(getChat())) {
            if (this.premiumButtonView.getParent() != null) {
                ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            }
            View view = this.divider;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) this.divider.getParent()).removeView(this.divider);
            }
            this.recyclerListView.setPadding(0, 0, 0, 0);
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
        this.boostMiniBtn.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$4(view);
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
        if (!this.hasFixedSize && (i = this.type) != 18 && i != 20 && i != 24 && i != 25 && i != 29 && i != 22 && i != 23 && i != 21 && i != 26 && i != 27 && i != 30) {
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
        int i2 = this.backgroundPaddingLeft;
        float f = AndroidUtilities.density;
        frameLayout.addView(premiumButtonView2, LayoutHelper.createFrame(-1, 48.0f, 80, (i2 / f) + 16.0f, 0.0f, 16.0f + (i2 / f), 12.0f));
        this.recyclerListView.setPadding(0, 0, 0, AndroidUtilities.dp(72.0f));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda26
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view2, int i3) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$5(view2, i3);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda27
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view2, int i3) {
                boolean lambda$onViewCreated$6;
                lambda$onViewCreated$6 = LimitReachedBottomSheet.this.lambda$onViewCreated$6(view2, i3);
                return lambda$onViewCreated$6;
            }
        });
        this.premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$12(context, view2);
            }
        });
        this.premiumButtonView.overlayTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$14(view2);
            }
        });
        this.enterAnimator = new RecyclerItemsEnterAnimator(this.recyclerListView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$4(View view) {
        if (this.premiumButtonView.isShowOverlay()) {
            this.premiumButtonView.overlayTextView.performClick();
        } else {
            this.premiumButtonView.buttonLayout.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$5(View view, int i) {
        if (view instanceof AdminedChannelCell) {
            AdminedChannelCell adminedChannelCell = (AdminedChannelCell) view;
            TLRPC$Chat currentChannel = adminedChannelCell.getCurrentChannel();
            if (this.selectedChats.contains(currentChannel)) {
                this.selectedChats.remove(currentChannel);
            } else {
                this.selectedChats.add(currentChannel);
            }
            adminedChannelCell.setChecked(this.selectedChats.contains(currentChannel), true);
            updateButton();
        } else if (view instanceof GroupCreateUserCell) {
            if (this.canSendLink || this.type != 11) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                Object object = groupCreateUserCell.getObject();
                if (groupCreateUserCell.isBlocked()) {
                    if (object instanceof TLRPC$User) {
                        showPremiumBlockedToast(groupCreateUserCell, ((TLRPC$User) object).id);
                        return;
                    }
                    return;
                }
                if (this.selectedChats.contains(object)) {
                    this.selectedChats.remove(object);
                } else {
                    this.selectedChats.add(object);
                }
                groupCreateUserCell.setChecked(this.selectedChats.contains(object), true);
                updateButton();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onViewCreated$6(View view, int i) {
        this.recyclerListView.getOnItemClickListener().onItemClick(view, i);
        if (this.type != 19) {
            view.performHapticFeedback(0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$12(Context context, View view) {
        int i = this.type;
        if (i == 11) {
            return;
        }
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(this.currentAccount).isPremium() && BoostRepository.isMultiBoostsAvailable()) {
                    BoostDialogs.showMoreBoostsNeeded(this.dialogId, this);
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context, this.resourcesProvider);
                builder.setTitle(LocaleController.getString("PremiumNeeded", R.string.PremiumNeeded));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(isGroup() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting)));
                builder.setPositiveButton(LocaleController.getString("CheckPhoneNumberYes", R.string.CheckPhoneNumberYes), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        LimitReachedBottomSheet.this.lambda$onViewCreated$7(dialogInterface, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
                return;
            }
            boolean z = canApplyBoost.canApply;
            if (z && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && BoostRepository.isMultiBoostsAvailable()) {
                    this.lockInvalidation = true;
                    this.limitPreviewView.invalidationEnabled = false;
                    BaseFragment baseFragment = getBaseFragment();
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
                    ReassignBoostBottomSheet.show(baseFragment, canApplyBoost2.myBoosts, canApplyBoost2.currentChat).setOnHideListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda6
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            LimitReachedBottomSheet.this.lambda$onViewCreated$9(dialogInterface);
                        }
                    });
                    return;
                }
                boostChannel();
                return;
            } else if (z) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                BackupImageView backupImageView = new BackupImageView(getContext());
                backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(60, 60.0f));
                frameLayout.setClipChildren(false);
                final Paint paint = new Paint(1);
                paint.setColor(Theme.getColor(Theme.key_dialogBackground));
                final Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.filled_limit_boost);
                frameLayout.addView(new View(this, getContext()) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.3
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
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                imageView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon));
                frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
                BackupImageView backupImageView2 = new BackupImageView(getContext());
                backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                frameLayout2.addView(frameLayout, LayoutHelper.createFrame(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                if (Build.VERSION.SDK_INT >= 21) {
                    textView.setLetterSpacing(0.025f);
                }
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, LayoutHelper.createLinear(-1, -2, 0, 24, 80, 24, 0));
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.canApplyBoost.replaceDialogId));
                avatarDrawable.setInfo(this.currentAccount, chat);
                backupImageView.setForUserOrChat(chat, avatarDrawable);
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                TLRPC$Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                avatarDrawable2.setInfo(this.currentAccount, chat2);
                backupImageView2.setForUserOrChat(chat2, avatarDrawable2);
                AlertDialog.Builder builder2 = new AlertDialog.Builder(context);
                builder2.setView(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                builder2.setPositiveButton(LocaleController.getString("Replace", R.string.Replace), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        LimitReachedBottomSheet.this.lambda$onViewCreated$10(dialogInterface, i2);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda5
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                    }
                });
                builder2.show();
                return;
            } else {
                int i2 = canApplyBoost.floodWait;
                if (i2 != 0) {
                    BoostDialogs.showFloodWait(i2);
                    return;
                }
                return;
            }
        }
        int i3 = this.type;
        if (i3 == 18 || i3 == 20 || i3 == 24 || i3 == 25 || i3 == 29 || i3 == 22 || i3 == 23 || i3 == 21 || i3 == 26 || i3 == 27 || i3 == 30) {
            AndroidUtilities.addToClipboard(getBoostLink());
            dismiss();
        } else if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.isVeryLargeFile) {
            dismiss();
        } else {
            BaseFragment baseFragment2 = this.parentFragment;
            if (baseFragment2 == null) {
                return;
            }
            if (baseFragment2.getVisibleDialog() != null) {
                this.parentFragment.getVisibleDialog().dismiss();
            }
            this.parentFragment.presentFragment(new PremiumPreviewFragment(limitTypeToServerString(this.type)));
            Runnable runnable = this.onShowPremiumScreenRunnable;
            if (runnable != null) {
                runnable.run();
            }
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$7(DialogInterface dialogInterface, int i) {
        this.parentFragment.presentFragment(new PremiumPreviewFragment(null));
        dismiss();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$9(DialogInterface dialogInterface) {
        this.lockInvalidation = false;
        this.limitPreviewView.invalidationEnabled = true;
        this.premiumButtonView.invalidate();
        this.limitPreviewView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$10(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        boostChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$14(View view) {
        int i = this.type;
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            if (canApplyBoost.canApply) {
                this.premiumButtonView.buttonLayout.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda13
                        @Override // java.lang.Runnable
                        public final void run() {
                            LimitReachedBottomSheet.this.lambda$onViewCreated$13();
                        }
                    }, this.canApplyBoost.needSelector ? 300L : 0L);
                }
            } else if (canApplyBoost.alreadyActive && BoostRepository.isMultiBoostsAvailable() && !this.canApplyBoost.isMaxLvl) {
                BoostDialogs.showMoreBoostsNeeded(this.dialogId, this);
            } else {
                dismiss();
            }
        } else if (this.type == 11) {
            if (this.selectedChats.isEmpty()) {
                dismiss();
            } else {
                sendInviteMessages();
            }
        } else if (this.selectedChats.isEmpty()) {
        } else {
            int i2 = this.type;
            if (i2 == 2) {
                revokeSelectedLinks();
            } else if (i2 == 5) {
                leaveFromSelectedGroups();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$13() {
        this.limitPreviewView.setBoosts(this.boostsStatus, false);
        limitPreviewIncreaseCurrentValue();
    }

    private void limitPreviewIncreaseCurrentValue() {
        LimitPreviewView limitPreviewView = this.limitPreviewView;
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
        int i = tL_stories$TL_premium_boostsStatus.boosts;
        int i2 = tL_stories$TL_premium_boostsStatus.current_level_boosts;
        limitPreviewView.increaseCurrentValue(i, i - i2, tL_stories$TL_premium_boostsStatus.next_level_boosts - i2);
    }

    private void showPremiumBlockedToast(View view, long j) {
        Bulletin createSimpleBulletin;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(view, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String forcedFirstName = j >= 0 ? UserObject.getForcedFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) : "";
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            createSimpleBulletin = BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)));
        } else {
            createSimpleBulletin = BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    LimitReachedBottomSheet.this.lambda$showPremiumBlockedToast$15();
                }
            });
        }
        createSimpleBulletin.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremiumBlockedToast$15() {
        if (LaunchActivity.getLastFragment() == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        this.parentFragment.showAsSheet(new PremiumPreviewFragment("noncontacts"), bottomSheetParams);
    }

    private void boostChannel(Loadable loadable) {
        boostChannel(loadable, false);
    }

    private void boostChannel(final Loadable loadable, boolean z) {
        if (!loadable.isLoading() || z) {
            loadable.setLoading(true);
            MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.dialogId, this.canApplyBoost.slot, new Utilities.Callback() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda22
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    LimitReachedBottomSheet.this.lambda$boostChannel$17(loadable, (TL_stories$TL_premium_myBoosts) obj);
                }
            }, new Utilities.Callback() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda21
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    LimitReachedBottomSheet.this.lambda$boostChannel$19(loadable, (TLRPC$TL_error) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$boostChannel$17(final Loadable loadable, final TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts) {
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(this.dialogId, new Consumer() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda12
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                LimitReachedBottomSheet.this.lambda$boostChannel$16(loadable, tL_stories$TL_premium_myBoosts, (TL_stories$TL_premium_boostsStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$boostChannel$16(Loadable loadable, TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        TLRPC$ChatFull chatFull;
        loadable.setLoading(false);
        if (tL_stories$TL_premium_boostsStatus == null) {
            return;
        }
        this.boostsStatus.boosts++;
        if (this.type == 32 && (chatFull = getChatFull()) != null) {
            chatFull.boosts_applied++;
        }
        limitPreviewIncreaseCurrentValue();
        setBoostsStats(tL_stories$TL_premium_boostsStatus, this.isCurrentChat);
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
        canApplyBoost.isMaxLvl = this.boostsStatus.next_level_boosts <= 0;
        canApplyBoost.boostedNow = true;
        canApplyBoost.setMyBoosts(tL_stories$TL_premium_myBoosts);
        onBoostSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$boostChannel$19(final Loadable loadable, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tLRPC$TL_error.text).intValue();
            if (intValue <= 5) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda20
                    @Override // java.lang.Runnable
                    public final void run() {
                        LimitReachedBottomSheet.this.lambda$boostChannel$18(loadable);
                    }
                }, intValue * 1000);
                return;
            }
            BoostDialogs.showFloodWait(intValue);
        }
        loadable.setLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$boostChannel$18(Loadable loadable) {
        boostChannel(loadable, true);
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
        transitionSet.addTransition(new Visibility(this) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.4
            @Override // android.transition.Visibility
            public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, AndroidUtilities.dp(20.0f), 0.0f));
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                return animatorSet;
            }

            @Override // android.transition.Visibility
            public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, -AndroidUtilities.dp(20.0f)));
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
        this.fireworksOverlay.performHapticFeedback(3);
        this.headerView.boostCounterView.setCount(this.canApplyBoost.boostCount, true);
        this.recyclerListView.smoothScrollToPosition(0);
        if (this.type == 32) {
            this.headerView.boostCounterView.setVisibility(8);
        }
        return true;
    }

    private void sendInviteMessages() {
        String str;
        TLRPC$ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.fromChat.id);
        if (chatFull == null) {
            dismiss();
            return;
        }
        if (this.fromChat.username != null) {
            str = "@" + this.fromChat.username;
        } else {
            TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = chatFull.exported_invite;
            if (tLRPC$TL_chatInviteExported != null) {
                str = tLRPC$TL_chatInviteExported.link;
            } else {
                dismiss();
                return;
            }
        }
        Iterator<Object> it = this.selectedChats.iterator();
        while (it.hasNext()) {
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(str, ((TLRPC$User) it.next()).id, null, null, null, true, null, null, null, false, 0, null, false));
            str = str;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                LimitReachedBottomSheet.this.lambda$sendInviteMessages$20();
            }
        });
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendInviteMessages$20() {
        BulletinFactory global = BulletinFactory.global();
        if (global != null) {
            if (this.selectedChats.size() == 1) {
                global.createSimpleBulletin(R.raw.voip_invite, AndroidUtilities.replaceTags(LocaleController.formatString("InviteLinkSentSingle", R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC$User) this.selectedChats.iterator().next())))).show();
            } else {
                global.createSimpleBulletin(R.raw.voip_invite, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", this.selectedChats.size(), Integer.valueOf(this.selectedChats.size())))).show();
            }
        }
    }

    public void setRequiredLvl(int i) {
        this.requiredLvl = i;
    }

    public void updatePremiumButtonText() {
        String string;
        int i = this.type;
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            if (BoostRepository.isMultiBoostsAvailable()) {
                AnimatedTextView animatedTextView = this.premiumButtonView.buttonTextView;
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
                if (canApplyBoost != null && canApplyBoost.alreadyActive) {
                    string = LocaleController.getString("BoostingBoostAgain", R.string.BoostingBoostAgain);
                } else {
                    string = LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
                }
                animatedTextView.setText(string);
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
                if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                    return;
                }
                this.premiumButtonView.buttonTextView.setText(LocaleController.getString("OK", R.string.OK));
                return;
            }
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel));
            return;
        }
        int i2 = this.type;
        if (i2 == 18 || i2 == 20 || i2 == 24 || i2 == 25 || i2 == 29 || i2 == 22 || i2 == 23 || i2 == 21 || i2 == 26 || i2 == 27 || i2 == 30) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString("CopyLink", R.string.CopyLink));
            this.premiumButtonView.buttonTextView.setText(spannableStringBuilder);
        } else if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.isVeryLargeFile) {
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString("OK", R.string.OK));
            this.premiumButtonView.hideIcon();
        } else {
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString("IncreaseLimit", R.string.IncreaseLimit));
            LimitParams limitParams = this.limitParams;
            if (limitParams != null) {
                int i3 = limitParams.defaultLimit;
                int i4 = i3 + 1;
                int i5 = limitParams.premiumLimit;
                if (i4 == i5) {
                    this.premiumButtonView.setIcon(R.raw.addone_icon);
                    return;
                } else if (i3 != 0 && i5 != 0 && i5 / i3 >= 1.6f && i5 / i3 <= 2.5f) {
                    this.premiumButtonView.setIcon(R.raw.double_icon);
                    return;
                } else {
                    this.premiumButtonView.hideIcon();
                    return;
                }
            }
            this.premiumButtonView.hideIcon();
        }
    }

    private void leaveFromSelectedGroups() {
        final TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        final ArrayList arrayList = new ArrayList();
        Iterator<Object> it = this.selectedChats.iterator();
        while (it.hasNext()) {
            arrayList.add((TLRPC$Chat) it.next());
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.formatPluralString("LeaveCommunities", arrayList.size(), new Object[0]));
        if (arrayList.size() == 1) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC$Chat) arrayList.get(0)).title)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupLeave), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LimitReachedBottomSheet.this.lambda$leaveFromSelectedGroups$21(arrayList, user, dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$leaveFromSelectedGroups$21(ArrayList arrayList, TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
        dismiss();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) arrayList.get(i2);
            MessagesController.getInstance(this.currentAccount).putChat(tLRPC$Chat, false);
            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(tLRPC$Chat.id, tLRPC$User);
        }
    }

    private void updateButton() {
        int i = this.type;
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            boolean z = canApplyBoost.canApply;
            if ((z || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
                if (canApplyBoost.isMaxLvl) {
                    this.premiumButtonView.setOverlayText(LocaleController.getString("OK", R.string.OK), true, true);
                } else {
                    this.premiumButtonView.clearOverlayText();
                }
            } else if (z) {
                if (BoostRepository.isMultiBoostsAvailable()) {
                    this.premiumButtonView.setOverlayText(LocaleController.getString("BoostingBoostAgain", R.string.BoostingBoostAgain), true, true);
                } else {
                    this.premiumButtonView.setOverlayText(LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
                }
                this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), true);
                ButtonWithCounterView buttonWithCounterView = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setText(LocaleController.getString(R.string.BoostGroup), true);
                }
            } else if (canApplyBoost.isMaxLvl) {
                ButtonWithCounterView buttonWithCounterView2 = this.boostMiniBtn;
                int i2 = R.string.OK;
                buttonWithCounterView2.setText(LocaleController.getString(i2), true);
                ButtonWithCounterView buttonWithCounterView3 = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView3 != null) {
                    buttonWithCounterView3.setText(LocaleController.getString(i2), true);
                }
                this.premiumButtonView.setOverlayText(LocaleController.getString("OK", i2), true, true);
            } else if (BoostRepository.isMultiBoostsAvailable()) {
                ButtonWithCounterView buttonWithCounterView4 = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView4 != null) {
                    buttonWithCounterView4.setText(LocaleController.getString(R.string.BoostGroup), true);
                }
                this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), true);
                this.premiumButtonView.setOverlayText(LocaleController.getString("BoostingBoostAgain", R.string.BoostingBoostAgain), true, true);
            } else {
                ButtonWithCounterView buttonWithCounterView5 = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView5 != null) {
                    buttonWithCounterView5.setText(LocaleController.getString(R.string.OK), true);
                }
                ButtonWithCounterView buttonWithCounterView6 = this.boostMiniBtn;
                int i3 = R.string.OK;
                buttonWithCounterView6.setText(LocaleController.getString(i3), true);
                this.premiumButtonView.setOverlayText(LocaleController.getString("OK", i3), true, true);
            }
        } else if (this.type == 11) {
            this.premiumButtonView.checkCounterView();
            if (!this.canSendLink) {
                this.premiumButtonView.setOverlayText(LocaleController.getString("Close", R.string.Close), true, true);
            } else if (this.selectedChats.size() > 0) {
                this.premiumButtonView.setOverlayText(LocaleController.getString("SendInviteLink", R.string.SendInviteLink), true, true);
            } else {
                this.premiumButtonView.setOverlayText(LocaleController.getString("ActionSkip", R.string.ActionSkip), true, true);
            }
            this.premiumButtonView.counterView.setCount(this.selectedChats.size(), true);
            this.premiumButtonView.invalidate();
        } else if (this.selectedChats.size() > 0) {
            String str = null;
            int i4 = this.type;
            if (i4 == 2) {
                str = LocaleController.formatPluralString("RevokeLinks", this.selectedChats.size(), new Object[0]);
            } else if (i4 == 5) {
                str = LocaleController.formatPluralString("LeaveCommunities", this.selectedChats.size(), new Object[0]);
            }
            this.premiumButtonView.setOverlayText(str, true, true);
        } else {
            this.premiumButtonView.clearOverlayText();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence getTitle() {
        int i = this.type;
        if (i != 11) {
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
                    return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
                case 19:
                    return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
                default:
                    switch (i) {
                        case 29:
                            break;
                        case 30:
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
                        case 32:
                            return LocaleController.getString(R.string.BoostGroup);
                        default:
                            return LocaleController.getString(R.string.LimitReached);
                    }
            }
        } else {
            return LocaleController.getString(R.string.ChannelInviteViaLink2);
        }
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
        TLRPC$ChatFull chatFull;
        if (i == NotificationCenter.boostByChannelCreated) {
            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            BaseFragment lastFragment = getBaseFragment().getParentLayout().getLastFragment();
            if (lastFragment instanceof ChatCustomReactionsEditActivity) {
                List<BaseFragment> fragmentStack = getBaseFragment().getParentLayout().getFragmentStack();
                BaseFragment baseFragment = fragmentStack.size() >= 2 ? fragmentStack.get(fragmentStack.size() - 2) : null;
                BaseFragment baseFragment2 = fragmentStack.size() >= 3 ? fragmentStack.get(fragmentStack.size() - 3) : null;
                r5 = fragmentStack.size() >= 4 ? fragmentStack.get(fragmentStack.size() - 4) : null;
                if (baseFragment instanceof ChatEditActivity) {
                    getBaseFragment().getParentLayout().removeFragmentFromStack(baseFragment);
                }
                dismiss();
                if (booleanValue) {
                    if (baseFragment2 instanceof ProfileActivity) {
                        getBaseFragment().getParentLayout().removeFragmentFromStack(baseFragment2);
                    }
                    lastFragment.finishFragment();
                    BoostDialogs.showBulletin(r5, tLRPC$Chat, true);
                    return;
                }
                lastFragment.finishFragment();
                BoostDialogs.showBulletin(baseFragment2, tLRPC$Chat, false);
            } else if ((lastFragment instanceof ChatActivity) && booleanValue) {
                BoostDialogs.showBulletin(lastFragment, tLRPC$Chat, true);
            } else if ((lastFragment instanceof ChannelColorActivity) && booleanValue) {
                List<BaseFragment> fragmentStack2 = getBaseFragment().getParentLayout().getFragmentStack();
                ArrayList<BaseFragment> arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    BaseFragment baseFragment3 = fragmentStack2.get(size);
                    if ((baseFragment3 instanceof ChatActivity) || (baseFragment3 instanceof DialogsActivity)) {
                        r5 = baseFragment3;
                        break;
                    }
                    arrayList.add(baseFragment3);
                }
                if (r5 == null) {
                    return;
                }
                for (BaseFragment baseFragment4 : arrayList) {
                    getBaseFragment().getParentLayout().removeFragmentFromStack(baseFragment4);
                }
                getBaseFragment().finishFragment();
                dismiss();
                BoostDialogs.showBulletin(r5, tLRPC$Chat, true);
            } else if (booleanValue) {
                if (StoryRecorder.isVisible()) {
                    ChatActivity of = ChatActivity.of(-tLRPC$Chat.id);
                    LaunchActivity.getLastFragment().presentFragment(of, false, false);
                    StoryRecorder.destroyInstance();
                    dismiss();
                    BoostDialogs.showBulletin(of, tLRPC$Chat, true);
                    return;
                }
                List<BaseFragment> fragmentStack3 = getBaseFragment().getParentLayout().getFragmentStack();
                r5 = fragmentStack3.size() >= 2 ? fragmentStack3.get(fragmentStack3.size() - 2) : null;
                getBaseFragment().finishFragment();
                dismiss();
                if (r5 instanceof ChatActivity) {
                    BoostDialogs.showBulletin(r5, tLRPC$Chat, true);
                }
            } else if (StoryRecorder.isVisible()) {
                ChatActivity of2 = ChatActivity.of(-tLRPC$Chat.id);
                LaunchActivity.getLastFragment().presentFragment(of2, false, false);
                StoryRecorder.destroyInstance();
                dismiss();
                BoostDialogs.showBulletin(of2, tLRPC$Chat, false);
            } else {
                dismiss();
                BoostDialogs.showBulletin(LaunchActivity.getLastFragment(), tLRPC$Chat, false);
            }
        } else if (i == NotificationCenter.boostedChannelByUser) {
            TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts = (TL_stories$TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = (TL_stories$TL_premium_boostsStatus) objArr[3];
            if (tL_stories$TL_premium_boostsStatus == null || this.canApplyBoost == null) {
                return;
            }
            this.boostsStatus.boosts += intValue;
            if (this.type == 32 && (chatFull = getChatFull()) != null) {
                chatFull.boosts_applied += intValue;
            }
            limitPreviewIncreaseCurrentValue();
            setBoostsStats(tL_stories$TL_premium_boostsStatus, this.isCurrentChat);
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            canApplyBoost.isMaxLvl = this.boostsStatus.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_stories$TL_premium_myBoosts);
            if (onBoostSuccess()) {
                BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_boosts_replace, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])), 30).setDuration(4000).show(true);
            }
        } else if (i == NotificationCenter.didStartedMultiGiftsSelector) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class 5 extends RecyclerListView.SelectionAdapter {
        5() {
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
            if (limitReachedBottomSheet.type != 11 || limitReachedBottomSheet.canSendLink) {
                return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            LinearLayout linearLayout;
            Context context = viewGroup.getContext();
            switch (i) {
                case 1:
                    linearLayout = new AdminedChannelCell(context, new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.5.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(((AdminedChannelCell) view.getParent()).getCurrentChannel());
                            LimitReachedBottomSheet.this.revokeLinks(arrayList);
                        }
                    }, true, 9);
                    break;
                case 2:
                    linearLayout = new ShadowSectionCell(context, 12, Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    break;
                case 3:
                    View headerCell = new HeaderCell(context);
                    headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    linearLayout = headerCell;
                    break;
                case 4:
                    View groupCreateUserCell = new GroupCreateUserCell(context, 1, 0, false);
                    groupCreateUserCell.setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0);
                    linearLayout = groupCreateUserCell;
                    break;
                case 5:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                    flickerLoadingView.setViewType(LimitReachedBottomSheet.this.type == 2 ? 22 : 21);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setIgnoreHeightCheck(true);
                    flickerLoadingView.setItemsCount(10);
                    linearLayout = flickerLoadingView;
                    break;
                case 6:
                    linearLayout = new View(this, LimitReachedBottomSheet.this.getContext()) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.5.3
                        @Override // android.view.View
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                        }
                    };
                    break;
                case 7:
                    FrameLayout frameLayout = new FrameLayout(LimitReachedBottomSheet.this.getContext());
                    frameLayout.setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
                    TextView textView = new TextView(context);
                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                    if (limitReachedBottomSheet.statisticClickRunnable == null && ChatObject.hasAdminRights(limitReachedBottomSheet.getChat())) {
                        LimitReachedBottomSheet.this.statisticClickRunnable = new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda5
                            @Override // java.lang.Runnable
                            public final void run() {
                                LimitReachedBottomSheet.5.this.lambda$onCreateViewHolder$3();
                            }
                        };
                    }
                    textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(LimitReachedBottomSheet.this.statisticClickRunnable != null ? 50.0f : 18.0f), AndroidUtilities.dp(13.0f));
                    textView.setTextSize(1, 16.0f);
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    textView.setSingleLine(true);
                    frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                    int dp = AndroidUtilities.dp(8.0f);
                    int color = Theme.getColor(Theme.key_graySection, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                    int i2 = Theme.key_listSelector;
                    textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(dp, color, ColorUtils.setAlphaComponent(Theme.getColor(i2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 76)));
                    textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LimitReachedBottomSheet.5.this.lambda$onCreateViewHolder$4(view);
                        }
                    });
                    if (LimitReachedBottomSheet.this.statisticClickRunnable != null) {
                        ImageView imageView = new ImageView(LimitReachedBottomSheet.this.getContext());
                        imageView.setImageResource(R.drawable.msg_stats);
                        imageView.setColorFilter(Theme.getColor(Theme.key_dialogTextBlack, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(i2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 76)));
                        frameLayout.addView(imageView, LayoutHelper.createFrame(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LimitReachedBottomSheet.5.this.lambda$onCreateViewHolder$5(view);
                            }
                        });
                    }
                    textView.setText(LimitReachedBottomSheet.this.getBoostLink());
                    textView.setGravity(17);
                    linearLayout = frameLayout;
                    break;
                case 8:
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
                    linearLayout2.setOrientation(1);
                    LoginOrView loginOrView = new LoginOrView(context);
                    final LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(LimitReachedBottomSheet.this.isGroup() ? R.string.BoostingStoriesByGiftingGroup : R.string.BoostingStoriesByGiftingChannel));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                    spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.5.1
                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            textPaint.setUnderlineText(false);
                            textPaint.setColor(Theme.getColor(Theme.key_chat_messageLinkIn, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View view) {
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
                    linksTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LimitReachedBottomSheet.5.this.lambda$onCreateViewHolder$0(view);
                        }
                    });
                    loginOrView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            linksTextView.performClick();
                        }
                    });
                    if (LimitReachedBottomSheet.this.isMiniBoostBtnForAdminAvailable()) {
                        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.Copy), false);
                        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$5$$ExternalSyntheticLambda3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LimitReachedBottomSheet.5.this.lambda$onCreateViewHolder$2(view);
                            }
                        });
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.addView(LimitReachedBottomSheet.this.boostMiniBtn, LayoutHelper.createLinear(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                        linearLayout3.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                        linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-1, 44, 12.0f, 12.0f, 12.0f, 8.0f));
                    } else {
                        linearLayout2.addView(LimitReachedBottomSheet.this.actionBtn, LayoutHelper.createLinear(-1, 48, 12.0f, 12.0f, 12.0f, 8.0f));
                    }
                    linearLayout2.addView(loginOrView, LayoutHelper.createLinear(-1, 48, 0.0f, -5.0f, 0.0f, 0.0f));
                    linearLayout2.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 12.0f, -6.0f, 12.0f, 17.0f));
                    linearLayout = linearLayout2;
                    break;
                case 9:
                    LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                    linearLayout = new BoostFeatureCell(limitReachedBottomSheet2, context, ((BottomSheet) limitReachedBottomSheet2).resourcesProvider);
                    break;
                default:
                    linearLayout = LimitReachedBottomSheet.this.headerView = new HeaderView(context);
                    break;
            }
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(linearLayout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateViewHolder$0(View view) {
            BoostPagerBottomSheet.show(LimitReachedBottomSheet.this.getBaseFragment(), LimitReachedBottomSheet.this.dialogId, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateViewHolder$2(View view) {
            AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
            LimitReachedBottomSheet.this.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateViewHolder$3() {
            LimitReachedBottomSheet.this.getBaseFragment().presentFragment(StatisticActivity.create(LimitReachedBottomSheet.this.getChat()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateViewHolder$4(View view) {
            AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateViewHolder$5(View view) {
            LimitReachedBottomSheet.this.statisticClickRunnable.run();
            LimitReachedBottomSheet.this.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String formatUserStatus;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 1) {
                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                TLRPC$Chat tLRPC$Chat = limitReachedBottomSheet.chats.get(i - limitReachedBottomSheet.chatStartRow);
                AdminedChannelCell adminedChannelCell = (AdminedChannelCell) viewHolder.itemView;
                TLRPC$Chat currentChannel = adminedChannelCell.getCurrentChannel();
                adminedChannelCell.setChannel(tLRPC$Chat, false);
                adminedChannelCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(tLRPC$Chat), currentChannel == tLRPC$Chat);
            } else if (itemViewType == 9) {
                LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                int i2 = i - limitReachedBottomSheet2.boostFeaturesStartRow;
                ArrayList<BoostFeature> arrayList = limitReachedBottomSheet2.boostFeatures;
                if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
                    return;
                }
                ((BoostFeatureCell) viewHolder.itemView).set(LimitReachedBottomSheet.this.boostFeatures.get(i2));
            } else if (itemViewType == 3) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                LimitReachedBottomSheet limitReachedBottomSheet3 = LimitReachedBottomSheet.this;
                int i3 = limitReachedBottomSheet3.type;
                if (i3 != 11) {
                    if (i3 == 2) {
                        headerCell.setText(LocaleController.getString("YourPublicCommunities", R.string.YourPublicCommunities));
                    } else {
                        headerCell.setText(LocaleController.getString("LastActiveCommunities", R.string.LastActiveCommunities));
                    }
                } else if (!limitReachedBottomSheet3.canSendLink) {
                    if (LimitReachedBottomSheet.this.restrictedUsers.size() == 1) {
                        headerCell.setText(LocaleController.getString("ChannelInviteViaLinkRestricted2", R.string.ChannelInviteViaLinkRestricted2));
                    } else {
                        headerCell.setText(LocaleController.getString("ChannelInviteViaLinkRestricted3", R.string.ChannelInviteViaLinkRestricted3));
                    }
                } else {
                    headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                }
            } else if (itemViewType != 4) {
            } else {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
                LimitReachedBottomSheet limitReachedBottomSheet4 = LimitReachedBottomSheet.this;
                int i4 = limitReachedBottomSheet4.type;
                if (i4 == 5) {
                    TLRPC$Chat tLRPC$Chat2 = (TLRPC$Chat) limitReachedBottomSheet4.inactiveChats.get(i - LimitReachedBottomSheet.this.chatStartRow);
                    groupCreateUserCell.setObject(tLRPC$Chat2, tLRPC$Chat2.title, (String) LimitReachedBottomSheet.this.inactiveChatsSignatures.get(i - LimitReachedBottomSheet.this.chatStartRow), ((float) i) != ((float) LimitReachedBottomSheet.this.chatEndRow) - 1.0f);
                    groupCreateUserCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(tLRPC$Chat2), false);
                } else if (i4 == 11) {
                    TLRPC$User tLRPC$User = (TLRPC$User) limitReachedBottomSheet4.restrictedUsers.get(i - LimitReachedBottomSheet.this.chatStartRow);
                    boolean z = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null && LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.contains(Long.valueOf(tLRPC$User.id));
                    groupCreateUserCell.overridePremiumBlocked(z, false);
                    if (!z) {
                        formatUserStatus = LocaleController.formatUserStatus(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, tLRPC$User, null, null);
                    } else {
                        formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                    }
                    groupCreateUserCell.setObject(tLRPC$User, ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name), formatUserStatus, ((float) i) != ((float) LimitReachedBottomSheet.this.chatEndRow) - 1.0f);
                    groupCreateUserCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(tLRPC$User), false);
                }
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
            ArrayList<BoostFeature> arrayList = limitReachedBottomSheet2.boostFeatures;
            if (arrayList == null || i < (i2 = limitReachedBottomSheet2.boostFeaturesStartRow) || i > i2 + arrayList.size()) {
                int i3 = LimitReachedBottomSheet.this.type;
                return (i3 == 5 || i3 == 11) ? 4 : 1;
            }
            return 9;
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
        return i == 19 || i == 18 || i == 20 || i == 24 || i == 25 || i == 29 || i == 22 || i == 26 || i == 27 || i == 23 || i == 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBoostLink() {
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
        if (tL_stories$TL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_stories$TL_premium_boostsStatus.boost_url)) {
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

    public void setRestrictedUsers(TLRPC$Chat tLRPC$Chat, ArrayList<TLRPC$User> arrayList, ArrayList<Long> arrayList2, ArrayList<Long> arrayList3) {
        this.fromChat = tLRPC$Chat;
        ChatObject.canUserDoAdminAction(tLRPC$Chat, 3);
        this.canSendLink = true;
        this.restrictedUsers = new ArrayList<>(arrayList);
        this.premiumMessagingBlockedUsers = arrayList2;
        this.premiumInviteBlockedUsers = arrayList3;
        this.selectedChats.clear();
        if (this.canSendLink) {
            Iterator<TLRPC$User> it = this.restrictedUsers.iterator();
            while (it.hasNext()) {
                TLRPC$User next = it.next();
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(next.id))) {
                    this.selectedChats.add(next);
                }
            }
        }
        updateRows();
        updateButton();
        if (this.type != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            return;
        }
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

    public void setDialogId(long j) {
        this.dialogId = j;
        updateRows();
    }

    public void setChatMessageCell(ChatMessageCell chatMessageCell) {
        this.chatMessageCell = chatMessageCell;
    }

    public void setBoostsStats(TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, boolean z) {
        this.boostsStatus = tL_stories$TL_premium_boostsStatus;
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
    /* loaded from: classes3.dex */
    public class HeaderView extends LinearLayout {
        BoostCounterView boostCounterView;
        TextView description;
        TextView title;
        LinearLayout titleLinearLayout;

        /* JADX WARN: Removed duplicated region for block: B:141:0x0405  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x0485  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x04bd  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x04c7  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x04ca  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x04d4  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x0881  */
        /* JADX WARN: Removed duplicated region for block: B:312:0x0943  */
        /* JADX WARN: Removed duplicated region for block: B:315:0x099d  */
        /* JADX WARN: Removed duplicated region for block: B:318:0x09b0  */
        /* JADX WARN: Removed duplicated region for block: B:375:0x0b09 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:386:0x0b48  */
        /* JADX WARN: Removed duplicated region for block: B:389:0x0b53  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x0ba2  */
        /* JADX WARN: Removed duplicated region for block: B:404:0x0cf3  */
        /* JADX WARN: Removed duplicated region for block: B:408:0x0d19  */
        /* JADX WARN: Removed duplicated region for block: B:411:0x0d2c  */
        /* JADX WARN: Removed duplicated region for block: B:412:0x0d44  */
        /* JADX WARN: Removed duplicated region for block: B:415:0x0d5f  */
        @SuppressLint({"SetTextI18n"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public HeaderView(Context context) {
            super(context);
            String str;
            String formatPluralString;
            String str2;
            boolean z;
            int i;
            int i2;
            int i3;
            float f;
            int i4;
            boolean z2;
            int i5;
            int i6;
            int i7;
            int i8;
            String str3;
            float f2;
            float f3;
            setOrientation(1);
            setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
            LimitParams limitParams = LimitReachedBottomSheet.getLimitParams(LimitReachedBottomSheet.this.type, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
            LimitReachedBottomSheet.this.limitParams = limitParams;
            int i9 = limitParams.icon;
            MessagesController messagesController = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
            boolean premiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
            boolean isGroup = LimitReachedBottomSheet.this.isGroup();
            int i10 = LimitReachedBottomSheet.this.type;
            if (i10 == 31) {
                str = LocaleController.getString(isGroup ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
            } else if (i10 == 32) {
                str = LimitReachedBottomSheet.this.getBoostsDescriptionString(true);
            } else if (i10 == 19) {
                if (LimitReachedBottomSheet.this.chatMessageCell != null) {
                    int i11 = LimitReachedBottomSheet.this.chatMessageCell.getMessageObject().messageOwner.from_boosts_applied;
                    TLRPC$Chat chat = LimitReachedBottomSheet.this.getChat();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i11, UserObject.getFirstName(LimitReachedBottomSheet.this.chatMessageCell.getCurrentUser())));
                    spannableStringBuilder.append((CharSequence) " ");
                    int i12 = R.string.GroupBoostedByUserWithDescription;
                    Object[] objArr = new Object[1];
                    objArr[0] = chat == null ? "" : chat.title;
                    spannableStringBuilder.append((CharSequence) LocaleController.formatString(i12, objArr));
                    str = spannableStringBuilder.toString();
                } else if (LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity) {
                    str = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", BoostRepository.giveawayBoostsPerPremium(), new Object[0]);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LimitReachedBottomSheet.this.getBoostsDescriptionString(true));
                    if (ChatObject.hasAdminRights(LimitReachedBottomSheet.this.getChat()) && isGroup) {
                        spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                    }
                    str = spannableStringBuilder2.toString();
                }
            } else if (i10 == 18) {
                str = LimitReachedBottomSheet.this.boostsStatus.level == 0 ? LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription, LocaleController.formatPluralString("MoreBoosts", LimitReachedBottomSheet.this.boostsStatus.next_level_boosts, Integer.valueOf(LimitReachedBottomSheet.this.boostsStatus.next_level_boosts))) : LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel, LocaleController.formatPluralString("MoreBoosts", LimitReachedBottomSheet.this.boostsStatus.next_level_boosts - LimitReachedBottomSheet.this.boostsStatus.boosts, Integer.valueOf(LimitReachedBottomSheet.this.boostsStatus.next_level_boosts - LimitReachedBottomSheet.this.boostsStatus.boosts)), LocaleController.formatPluralString("BoostStories", LimitReachedBottomSheet.this.boostsStatus.level + 1, new Object[0]));
            } else if (i10 == 20) {
                str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(LimitReachedBottomSheet.this.channelColorLevelMin()));
            } else if (i10 == 24) {
                str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(LimitReachedBottomSheet.this.channelColorLevelMin()));
            } else if (i10 == 29) {
                str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
            } else if (i10 == 30) {
                str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
            } else if (i10 == 25) {
                int i13 = isGroup ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription;
                Object[] objArr2 = new Object[1];
                objArr2[0] = Integer.valueOf(isGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin);
                str = LocaleController.formatString(i13, objArr2);
            } else if (i10 == 26) {
                str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
            } else if (i10 == 27) {
                int i14 = isGroup ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription;
                Object[] objArr3 = new Object[1];
                objArr3[0] = Integer.valueOf(isGroup ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin);
                str = LocaleController.formatString(i14, objArr3);
            } else if (i10 == 22) {
                int i15 = isGroup ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription;
                Object[] objArr4 = new Object[1];
                objArr4[0] = Integer.valueOf(isGroup ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin);
                str = LocaleController.formatString(i15, objArr4);
            } else if (i10 == 23) {
                int i16 = isGroup ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription;
                Object[] objArr5 = new Object[1];
                objArr5[0] = Integer.valueOf(isGroup ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin);
                str = LocaleController.formatString(i16, objArr5);
            } else if (i10 == 21) {
                str = LocaleController.formatPluralString("ReactionReachLvlForReaction", LimitReachedBottomSheet.this.requiredLvl, Integer.valueOf(LimitReachedBottomSheet.this.requiredLvl));
            } else if (i10 == 11) {
                if (!LimitReachedBottomSheet.this.canSendLink) {
                    if (ChatObject.isChannelAndNotMegaGroup(LimitReachedBottomSheet.this.fromChat)) {
                        formatPluralString = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString("InviteChannelRestrictedUsers2One", R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC$User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                    } else {
                        formatPluralString = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString("InviteRestrictedUsers2One", R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC$User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                    }
                } else if (!ChatObject.isChannelAndNotMegaGroup(LimitReachedBottomSheet.this.fromChat)) {
                    if (LimitReachedBottomSheet.this.restrictedUsers.size() != 1) {
                        formatPluralString = LocaleController.formatPluralString("InviteRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                    } else {
                        formatPluralString = LocaleController.formatString("InviteRestrictedUsersOne", R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC$User) LimitReachedBottomSheet.this.restrictedUsers.get(0)));
                    }
                } else {
                    formatPluralString = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString("InviteChannelRestrictedUsersOne", R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC$User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                }
                str2 = formatPluralString;
                z = true;
                LimitParams limitParams2 = LimitReachedBottomSheet.this.limitParams;
                int i17 = limitParams2.defaultLimit;
                i = limitParams2.premiumLimit;
                i2 = LimitReachedBottomSheet.this.currentValue;
                i3 = LimitReachedBottomSheet.this.type;
                if (i3 != 3) {
                    i2 = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).dialogFilters.size() - 1;
                } else if (i3 == 7) {
                    i2 = UserConfig.getActivatedAccountsCount();
                } else if (i3 == 0) {
                    ArrayList<TLRPC$Dialog> dialogs = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getDialogs(0);
                    int size = dialogs.size();
                    int i18 = 0;
                    for (int i19 = 0; i19 < size; i19++) {
                        TLRPC$Dialog tLRPC$Dialog = dialogs.get(i19);
                        if (!(tLRPC$Dialog instanceof TLRPC$TL_dialogFolder) && tLRPC$Dialog.pinned) {
                            i18++;
                        }
                    }
                    i2 = i18;
                }
                if (!UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) {
                    i2 = i;
                    f = 1.0f;
                } else {
                    i2 = i2 < 0 ? i17 : i2;
                    if (LimitReachedBottomSheet.this.type != 7) {
                        f2 = i2;
                        f3 = i;
                    } else if (i2 > i17) {
                        f2 = i2 - i17;
                        f3 = i - i17;
                    } else {
                        f = 0.5f;
                    }
                    f = f2 / f3;
                }
                float f4 = i17 / i;
                i4 = LimitReachedBottomSheet.this.type;
                if (i4 != 18) {
                    if (i4 != 20 && i4 != 24 && i4 != 25 && i4 != 29) {
                        if (i4 != 22 && i4 != 23 && i4 != 19 && i4 != 30 && i4 != 21 && i4 != 26 && i4 != 27) {
                            if (i4 != 32) {
                                z2 = false;
                                int i20 = !z2 ? 0 : i2;
                                if (i4 != 11 && !MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).premiumFeaturesBlocked() && ((LimitReachedBottomSheet.this.premiumInviteBlockedUsers != null && !LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) || (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null && LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size() >= LimitReachedBottomSheet.this.restrictedUsers.size()))) {
                                    ArrayList arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty() ? LimitReachedBottomSheet.this.premiumMessagingBlockedUsers : LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                                    AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
                                    avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                                    avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                                    avatarsImageView.setStepFactor(0.4f);
                                    int min = Math.min(arrayList.size(), 3);
                                    avatarsImageView.setCount(min);
                                    for (int i21 = 0; i21 < min; i21++) {
                                        avatarsImageView.setObject(i21, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(Long.valueOf(((Long) arrayList.get(i21)).longValue())));
                                    }
                                    avatarsImageView.commitTransition(false);
                                    addView(avatarsImageView, LayoutHelper.createLinear(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                                    TextView textView = new TextView(context);
                                    textView.setGravity(17);
                                    textView.setTypeface(AndroidUtilities.bold());
                                    textView.setTextSize(1, 20.0f);
                                    int i22 = Theme.key_dialogTextBlack;
                                    textView.setTextColor(Theme.getColor(i22));
                                    textView.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                                    addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                                    TextView textView2 = new TextView(context);
                                    textView2.setGravity(17);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setTextColor(Theme.getColor(i22));
                                    addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                                    boolean z3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null && LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size() >= LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                                    if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers != null) {
                                        LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty();
                                    }
                                    if (arrayList.size() == 1) {
                                        str3 = LocaleController.formatString(z3 ? R.string.InviteMessagePremiumBlockedOne : R.string.InvitePremiumBlockedOne, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                                    } else if (arrayList.size() == 2) {
                                        str3 = LocaleController.formatString(z3 ? R.string.InviteMessagePremiumBlockedTwo : R.string.InvitePremiumBlockedTwo, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                                    } else if (arrayList.size() == 3) {
                                        str3 = LocaleController.formatString(z3 ? R.string.InviteMessagePremiumBlockedThree : R.string.InvitePremiumBlockedThree, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                                    } else {
                                        String formatPluralString2 = LocaleController.formatPluralString(z3 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany", arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                                        avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                                        str3 = formatPluralString2;
                                    }
                                    textView2.setText(AndroidUtilities.replaceTags(str3));
                                    PremiumButtonView premiumButtonView = new PremiumButtonView(context, false, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                    ScaleStateListAnimator.apply(premiumButtonView, 0.02f, 1.2f);
                                    premiumButtonView.setButton(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$HeaderView$$ExternalSyntheticLambda0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            LimitReachedBottomSheet.HeaderView.this.lambda$new$0(view);
                                        }
                                    });
                                    addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, (((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 0.0f, (((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 18.0f));
                                    int size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null ? 0 : LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                                    int size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null ? LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size() : 0;
                                    if (size2 - size3 > 0 && ((size2 != 1 || size3 != 1) && LimitReachedBottomSheet.this.canSendLink)) {
                                        SimpleTextView simpleTextView = new SimpleTextView(context, LimitReachedBottomSheet.this) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.HeaderView.1
                                            private final Paint paint = new Paint(1);

                                            @Override // android.view.View
                                            protected void dispatchDraw(Canvas canvas) {
                                                this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 0.8f));
                                                this.paint.setStyle(Paint.Style.STROKE);
                                                this.paint.setStrokeWidth(1.0f);
                                                float height = getHeight() / 2.0f;
                                                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - AndroidUtilities.dp(8.0f), height, this.paint);
                                                canvas.drawLine((getWidth() / 2.0f) + (getTextWidth() / 2.0f) + AndroidUtilities.dp(8.0f), height, getWidth(), height, this.paint);
                                                super.dispatchDraw(canvas);
                                            }
                                        };
                                        simpleTextView.setGravity(17);
                                        simpleTextView.setAlignment(Layout.Alignment.ALIGN_CENTER);
                                        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        simpleTextView.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                        simpleTextView.setTextSize(14);
                                        addView(simpleTextView, LayoutHelper.createLinear(190, -2, 1, 12, 0, 12, 20));
                                        TextView textView3 = new TextView(context);
                                        textView3.setGravity(17);
                                        textView3.setTypeface(AndroidUtilities.bold());
                                        textView3.setTextSize(1, 20.0f);
                                        textView3.setTextColor(Theme.getColor(i22));
                                        textView3.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                        addView(textView3, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                                        TextView textView4 = new TextView(context);
                                        textView4.setGravity(17);
                                        textView4.setTextSize(1, 14.0f);
                                        textView4.setTextColor(Theme.getColor(i22));
                                        if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size() <= 1) {
                                            textView4.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                        } else {
                                            textView4.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                        }
                                        addView(textView4, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                                    }
                                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                                    return;
                                }
                                if (LimitReachedBottomSheet.this.type != 31) {
                                    float f5 = f;
                                    LimitPreviewView limitPreviewView = new LimitPreviewView(context, i9, i20, i, f4, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider, LimitReachedBottomSheet.this) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.HeaderView.2
                                        @Override // android.view.View
                                        public void invalidate() {
                                            if (LimitReachedBottomSheet.this.lockInvalidation) {
                                                return;
                                            }
                                            super.invalidate();
                                        }
                                    };
                                    LimitReachedBottomSheet.this.limitPreviewView = limitPreviewView;
                                    if (z2) {
                                        if (LimitReachedBottomSheet.this.boostsStatus != null) {
                                            LimitReachedBottomSheet.this.limitPreviewView.setBoosts(LimitReachedBottomSheet.this.boostsStatus, LimitReachedBottomSheet.this.canApplyBoost != null && LimitReachedBottomSheet.this.canApplyBoost.boostedNow);
                                        }
                                    } else {
                                        limitPreviewView.setBagePosition(f5);
                                        LimitReachedBottomSheet.this.limitPreviewView.setType(LimitReachedBottomSheet.this.type);
                                        LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(8);
                                        if (!z) {
                                            if (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) {
                                                LimitReachedBottomSheet.this.limitPreviewView.premiumCount.setVisibility(8);
                                                if (LimitReachedBottomSheet.this.type == 6) {
                                                    LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText("2 GB");
                                                } else {
                                                    LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText(Integer.toString(i17));
                                                }
                                                LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(0);
                                            }
                                        } else {
                                            LimitReachedBottomSheet.this.limitPreviewView.setPremiumLocked();
                                        }
                                    }
                                    int i23 = LimitReachedBottomSheet.this.type;
                                    if (i23 == 2 || i23 == 5) {
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
                                TextView textView5 = new TextView(context);
                                this.title = textView5;
                                textView5.setTypeface(AndroidUtilities.bold());
                                i5 = LimitReachedBottomSheet.this.type;
                                if (i5 != 31) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                                    i6 = 32;
                                } else {
                                    i6 = 32;
                                    if (i5 == 32) {
                                        this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                    } else if (i5 == 19) {
                                        if (!(LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity)) {
                                            this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                        } else {
                                            this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                        }
                                    } else if (i5 == 30) {
                                        this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                    } else {
                                        i7 = 18;
                                        if (i5 == 18) {
                                            if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                                                this.title.setText(LocaleController.getString("BoostingEnableStories", R.string.BoostingEnableStories));
                                            } else {
                                                this.title.setText(LocaleController.getString("BoostingIncreaseLevel", R.string.BoostingIncreaseLevel));
                                            }
                                        } else if (i5 == 21) {
                                            this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                                        } else if (i5 == 20) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
                                        } else if (i5 == 24) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                                        } else if (i5 == 26) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                                        } else if (i5 == 27) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                                        } else if (i5 == 25) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                                        } else if (i5 == 29) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                                        } else {
                                            if (i5 == 22 || i5 == 23) {
                                                this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                            } else if (i5 == 11) {
                                                if (LimitReachedBottomSheet.this.canSendLink) {
                                                    this.title.setText(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink));
                                                } else {
                                                    this.title.setText(LocaleController.getString("ChannelInviteViaLinkRestricted", R.string.ChannelInviteViaLinkRestricted));
                                                }
                                            } else if (i5 == 6) {
                                                this.title.setText(LocaleController.getString("FileTooLarge", R.string.FileTooLarge));
                                            } else {
                                                this.title.setText(LocaleController.getString("LimitReached", R.string.LimitReached));
                                            }
                                            this.title.setTextSize(1, 20.0f);
                                            TextView textView6 = this.title;
                                            int i24 = Theme.key_windowBackgroundWhiteBlackText;
                                            textView6.setTextColor(Theme.getColor(i24, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                            this.title.setGravity(17);
                                            i8 = LimitReachedBottomSheet.this.type;
                                            if (i8 != 19 || i8 == i6 || LimitReachedBottomSheet.this.isMiniBoostBtnForAdminAvailable()) {
                                                BoostCounterView boostCounterView = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                                this.boostCounterView = boostCounterView;
                                                boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                                if (LimitReachedBottomSheet.this.type == i6) {
                                                    this.boostCounterView.setVisibility(8);
                                                }
                                                if (!LimitReachedBottomSheet.this.isCurrentChat) {
                                                    LinearLayout linearLayout = new LinearLayout(context);
                                                    this.titleLinearLayout = linearLayout;
                                                    linearLayout.setOrientation(0);
                                                    this.titleLinearLayout.setWeightSum(1.0f);
                                                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                                    this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                                    addView(this.titleLinearLayout, LayoutHelper.createLinear(-2, -2, 1, 12, z ? 8 : 22, 12, 9));
                                                } else {
                                                    addView(this.title, LayoutHelper.createLinear(-2, -2, 1, 0, z ? 8 : 22, 0, 0));
                                                    LinearLayout linearLayout2 = new LinearLayout(getContext());
                                                    linearLayout2.setOrientation(0);
                                                    linearLayout2.setClipChildren(false);
                                                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                                                    frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                                    BackupImageView backupImageView = new BackupImageView(getContext());
                                                    backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
                                                    TLRPC$Chat chat2 = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                                    AvatarDrawable avatarDrawable = new AvatarDrawable();
                                                    avatarDrawable.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat2);
                                                    backupImageView.setForUserOrChat(chat2, avatarDrawable);
                                                    frameLayout2.addView(backupImageView, LayoutHelper.createFrame(28, 28.0f));
                                                    TextView textView7 = new TextView(getContext());
                                                    if (chat2 != null) {
                                                        textView7.setText(chat2.title);
                                                    }
                                                    textView7.setSingleLine(true);
                                                    textView7.setMaxLines(1);
                                                    textView7.setEllipsize(TextUtils.TruncateAt.END);
                                                    textView7.setTextSize(1, 13.0f);
                                                    textView7.setTextColor(Theme.getColor(i24, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                                    frameLayout2.addView(textView7, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
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
                                                            LimitReachedBottomSheet.HeaderView.this.lambda$new$1(view);
                                                        }
                                                    });
                                                }
                                            } else {
                                                addView(this.title, LayoutHelper.createLinear(-2, -2, 1, 0, z ? 8 : 22, 0, 10));
                                            }
                                            TextView textView8 = new TextView(context);
                                            this.description = textView8;
                                            textView8.setText(AndroidUtilities.replaceTags(str2));
                                            this.description.setTextSize(1, 14.0f);
                                            this.description.setGravity(1);
                                            TextView textView9 = this.description;
                                            textView9.setLineSpacing(textView9.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                                            if (LimitReachedBottomSheet.this.type != i7) {
                                                if (((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider instanceof DarkThemeResourceProvider) {
                                                    this.description.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                                } else {
                                                    this.description.setTextColor(Theme.getColor(i24, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                                }
                                            } else {
                                                this.description.setTextColor(Theme.getColor(i24, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                            }
                                            if (LimitReachedBottomSheet.this.type != 19) {
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
                                        }
                                        this.title.setTextSize(1, 20.0f);
                                        TextView textView62 = this.title;
                                        int i242 = Theme.key_windowBackgroundWhiteBlackText;
                                        textView62.setTextColor(Theme.getColor(i242, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        this.title.setGravity(17);
                                        i8 = LimitReachedBottomSheet.this.type;
                                        if (i8 != 19) {
                                        }
                                        BoostCounterView boostCounterView2 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                        this.boostCounterView = boostCounterView2;
                                        boostCounterView2.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                        if (LimitReachedBottomSheet.this.type == i6) {
                                        }
                                        if (!LimitReachedBottomSheet.this.isCurrentChat) {
                                        }
                                        TextView textView82 = new TextView(context);
                                        this.description = textView82;
                                        textView82.setText(AndroidUtilities.replaceTags(str2));
                                        this.description.setTextSize(1, 14.0f);
                                        this.description.setGravity(1);
                                        TextView textView92 = this.description;
                                        textView92.setLineSpacing(textView92.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                                        if (LimitReachedBottomSheet.this.type != i7) {
                                        }
                                        if (LimitReachedBottomSheet.this.type != 19) {
                                        }
                                        if (LimitReachedBottomSheet.this.type == 31) {
                                        }
                                        LimitReachedBottomSheet.this.updatePremiumButtonText();
                                    }
                                }
                                i7 = 18;
                                this.title.setTextSize(1, 20.0f);
                                TextView textView622 = this.title;
                                int i2422 = Theme.key_windowBackgroundWhiteBlackText;
                                textView622.setTextColor(Theme.getColor(i2422, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                this.title.setGravity(17);
                                i8 = LimitReachedBottomSheet.this.type;
                                if (i8 != 19) {
                                }
                                BoostCounterView boostCounterView22 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                this.boostCounterView = boostCounterView22;
                                boostCounterView22.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                if (LimitReachedBottomSheet.this.type == i6) {
                                }
                                if (!LimitReachedBottomSheet.this.isCurrentChat) {
                                }
                                TextView textView822 = new TextView(context);
                                this.description = textView822;
                                textView822.setText(AndroidUtilities.replaceTags(str2));
                                this.description.setTextSize(1, 14.0f);
                                this.description.setGravity(1);
                                TextView textView922 = this.description;
                                textView922.setLineSpacing(textView922.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                                if (LimitReachedBottomSheet.this.type != i7) {
                                }
                                if (LimitReachedBottomSheet.this.type != 19) {
                                }
                                if (LimitReachedBottomSheet.this.type == 31) {
                                }
                                LimitReachedBottomSheet.this.updatePremiumButtonText();
                            }
                        }
                        z2 = true;
                        if (!z2) {
                        }
                        if (i4 != 11) {
                        }
                        if (LimitReachedBottomSheet.this.type != 31) {
                        }
                        if (LimitReachedBottomSheet.this.type == 31) {
                        }
                        TextView textView52 = new TextView(context);
                        this.title = textView52;
                        textView52.setTypeface(AndroidUtilities.bold());
                        i5 = LimitReachedBottomSheet.this.type;
                        if (i5 != 31) {
                        }
                        i7 = 18;
                        this.title.setTextSize(1, 20.0f);
                        TextView textView6222 = this.title;
                        int i24222 = Theme.key_windowBackgroundWhiteBlackText;
                        textView6222.setTextColor(Theme.getColor(i24222, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        this.title.setGravity(17);
                        i8 = LimitReachedBottomSheet.this.type;
                        if (i8 != 19) {
                        }
                        BoostCounterView boostCounterView222 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        this.boostCounterView = boostCounterView222;
                        boostCounterView222.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                        if (LimitReachedBottomSheet.this.type == i6) {
                        }
                        if (!LimitReachedBottomSheet.this.isCurrentChat) {
                        }
                        TextView textView8222 = new TextView(context);
                        this.description = textView8222;
                        textView8222.setText(AndroidUtilities.replaceTags(str2));
                        this.description.setTextSize(1, 14.0f);
                        this.description.setGravity(1);
                        TextView textView9222 = this.description;
                        textView9222.setLineSpacing(textView9222.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                        if (LimitReachedBottomSheet.this.type != i7) {
                        }
                        if (LimitReachedBottomSheet.this.type != 19) {
                        }
                        if (LimitReachedBottomSheet.this.type == 31) {
                        }
                        LimitReachedBottomSheet.this.updatePremiumButtonText();
                    }
                }
                z2 = true;
                if (!z2) {
                }
                if (i4 != 11) {
                }
                if (LimitReachedBottomSheet.this.type != 31) {
                }
                if (LimitReachedBottomSheet.this.type == 31) {
                }
                TextView textView522 = new TextView(context);
                this.title = textView522;
                textView522.setTypeface(AndroidUtilities.bold());
                i5 = LimitReachedBottomSheet.this.type;
                if (i5 != 31) {
                }
                i7 = 18;
                this.title.setTextSize(1, 20.0f);
                TextView textView62222 = this.title;
                int i242222 = Theme.key_windowBackgroundWhiteBlackText;
                textView62222.setTextColor(Theme.getColor(i242222, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                this.title.setGravity(17);
                i8 = LimitReachedBottomSheet.this.type;
                if (i8 != 19) {
                }
                BoostCounterView boostCounterView2222 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                this.boostCounterView = boostCounterView2222;
                boostCounterView2222.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                if (LimitReachedBottomSheet.this.type == i6) {
                }
                if (!LimitReachedBottomSheet.this.isCurrentChat) {
                }
                TextView textView82222 = new TextView(context);
                this.description = textView82222;
                textView82222.setText(AndroidUtilities.replaceTags(str2));
                this.description.setTextSize(1, 14.0f);
                this.description.setGravity(1);
                TextView textView92222 = this.description;
                textView92222.setLineSpacing(textView92222.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                if (LimitReachedBottomSheet.this.type != i7) {
                }
                if (LimitReachedBottomSheet.this.type != 19) {
                }
                if (LimitReachedBottomSheet.this.type == 31) {
                }
                LimitReachedBottomSheet.this.updatePremiumButtonText();
            } else {
                str = premiumFeaturesBlocked ? LimitReachedBottomSheet.this.limitParams.descriptionStrLocked : (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) ? LimitReachedBottomSheet.this.limitParams.descriptionStrPremium : LimitReachedBottomSheet.this.limitParams.descriptionStr;
            }
            str2 = str;
            z = premiumFeaturesBlocked;
            LimitParams limitParams22 = LimitReachedBottomSheet.this.limitParams;
            int i172 = limitParams22.defaultLimit;
            i = limitParams22.premiumLimit;
            i2 = LimitReachedBottomSheet.this.currentValue;
            i3 = LimitReachedBottomSheet.this.type;
            if (i3 != 3) {
            }
            if (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium()) {
            }
            i2 = i;
            f = 1.0f;
            float f42 = i172 / i;
            i4 = LimitReachedBottomSheet.this.type;
            if (i4 != 18) {
            }
            z2 = true;
            if (!z2) {
            }
            if (i4 != 11) {
            }
            if (LimitReachedBottomSheet.this.type != 31) {
            }
            if (LimitReachedBottomSheet.this.type == 31) {
            }
            TextView textView5222 = new TextView(context);
            this.title = textView5222;
            textView5222.setTypeface(AndroidUtilities.bold());
            i5 = LimitReachedBottomSheet.this.type;
            if (i5 != 31) {
            }
            i7 = 18;
            this.title.setTextSize(1, 20.0f);
            TextView textView622222 = this.title;
            int i2422222 = Theme.key_windowBackgroundWhiteBlackText;
            textView622222.setTextColor(Theme.getColor(i2422222, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            this.title.setGravity(17);
            i8 = LimitReachedBottomSheet.this.type;
            if (i8 != 19) {
            }
            BoostCounterView boostCounterView22222 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
            this.boostCounterView = boostCounterView22222;
            boostCounterView22222.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
            if (LimitReachedBottomSheet.this.type == i6) {
            }
            if (!LimitReachedBottomSheet.this.isCurrentChat) {
            }
            TextView textView822222 = new TextView(context);
            this.description = textView822222;
            textView822222.setText(AndroidUtilities.replaceTags(str2));
            this.description.setTextSize(1, 14.0f);
            this.description.setGravity(1);
            TextView textView922222 = this.description;
            textView922222.setLineSpacing(textView922222.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
            if (LimitReachedBottomSheet.this.type != i7) {
            }
            if (LimitReachedBottomSheet.this.type != 19) {
            }
            if (LimitReachedBottomSheet.this.type == 31) {
            }
            LimitReachedBottomSheet.this.updatePremiumButtonText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            if (LimitReachedBottomSheet.this.parentFragment == null) {
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            LimitReachedBottomSheet.this.parentFragment.showAsSheet(new PremiumPreviewFragment("invite_privacy"), bottomSheetParams);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(View view) {
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
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
        if (tL_stories$TL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_stories$TL_premium_boostsStatus.level > 0 && !this.canApplyBoost.alreadyActive) {
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        } else if (this.isCurrentChat) {
            if (this.type == 32) {
                return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            if (this.canApplyBoost.alreadyActive) {
                return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
            }
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        } else if (this.type == 32) {
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        } else if (this.canApplyBoost.alreadyActive) {
            return LocaleController.getString(isGroup() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
        } else {
            return LocaleController.getString(isGroup() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TLRPC$Chat getChat() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
    }

    private TLRPC$ChatFull getChatFull() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isGroup() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)));
    }

    private String getDescriptionForRemoveRestrictions() {
        TLRPC$Chat chat = getChat();
        int neededBoostsForUnlockGroup = getNeededBoostsForUnlockGroup();
        Object[] objArr = new Object[1];
        objArr[0] = chat == null ? "" : chat.title;
        return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", neededBoostsForUnlockGroup, objArr);
    }

    private int getNeededBoostsForUnlockGroup() {
        TLRPC$ChatFull chatFull = getChatFull();
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
        } else if (i == 25) {
            int i2 = isGroup ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(isGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin);
            str = LocaleController.formatString(i2, objArr);
        } else if (i == 26) {
            str = LocaleController.formatString(isGroup ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i == 27) {
            int i3 = isGroup ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription;
            Object[] objArr2 = new Object[1];
            objArr2[0] = Integer.valueOf(isGroup ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin);
            str = LocaleController.formatString(i3, objArr2);
        } else if (i == 22) {
            int i4 = isGroup ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription;
            Object[] objArr3 = new Object[1];
            objArr3[0] = Integer.valueOf(isGroup ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin);
            str = LocaleController.formatString(i4, objArr3);
        } else if (i == 23) {
            int i5 = isGroup ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription;
            Object[] objArr4 = new Object[1];
            objArr4[0] = Integer.valueOf(isGroup ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin);
            str = LocaleController.formatString(i5, objArr4);
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
        TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        if (chat == null) {
            str = LocaleController.getString(isGroup() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            str = chat.title;
        }
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
        boolean z2 = tL_stories$TL_premium_boostsStatus.boosts == tL_stories$TL_premium_boostsStatus.current_level_boosts;
        if (isMiniBoostBtnForAdminAvailable() && this.boostsStatus.next_level_boosts != 0 && z) {
            int i = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus2 = this.boostsStatus;
            int i2 = tL_stories$TL_premium_boostsStatus2.next_level_boosts;
            int i3 = tL_stories$TL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i, str, LocaleController.formatPluralString("MoreBoosts", i2 - i3, Integer.valueOf(i2 - i3)));
        } else if (z2 && this.canApplyBoost.alreadyActive) {
            if (this.boostsStatus.level == 1) {
                return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level, new Object[0]));
        } else if (this.canApplyBoost.alreadyActive) {
            TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus3 = this.boostsStatus;
            if (tL_stories$TL_premium_boostsStatus3.level == 0) {
                int i4 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus4 = this.boostsStatus;
                int i5 = tL_stories$TL_premium_boostsStatus4.next_level_boosts;
                int i6 = tL_stories$TL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i4, str, LocaleController.formatPluralString("MoreBoosts", i5 - i6, Integer.valueOf(i5 - i6)));
            } else if (tL_stories$TL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level + 1, new Object[0]));
            } else {
                int i7 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus5 = this.boostsStatus;
                int i8 = tL_stories$TL_premium_boostsStatus5.next_level_boosts;
                int i9 = tL_stories$TL_premium_boostsStatus5.boosts;
                return LocaleController.formatString(i7, str, LocaleController.formatPluralString("MoreBoosts", i8 - i9, Integer.valueOf(i8 - i9)));
            }
        } else {
            TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus6 = this.boostsStatus;
            if (tL_stories$TL_premium_boostsStatus6.level == 0) {
                int i10 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus7 = this.boostsStatus;
                int i11 = tL_stories$TL_premium_boostsStatus7.next_level_boosts;
                int i12 = tL_stories$TL_premium_boostsStatus7.boosts;
                return LocaleController.formatString(i10, str, LocaleController.formatPluralString("MoreBoosts", i11 - i12, Integer.valueOf(i11 - i12)));
            } else if (tL_stories$TL_premium_boostsStatus6.next_level_boosts == 0) {
                return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level + 1, new Object[0]));
            } else {
                int i13 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus8 = this.boostsStatus;
                int i14 = tL_stories$TL_premium_boostsStatus8.next_level_boosts;
                int i15 = tL_stories$TL_premium_boostsStatus8.boosts;
                return LocaleController.formatString(i13, str, LocaleController.formatPluralString("MoreBoosts", i14 - i15, Integer.valueOf(i14 - i15)));
            }
        }
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
        } else if (i == 33) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).savedDialogsPinnedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).savedDialogsPinnedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_pin;
            limitParams.descriptionStr = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 2) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).publicLinksLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).publicLinksLimitPremium;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 12) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).chatlistInvitesLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).chatlistInvitesLimitPremium;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 13) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).chatlistJoinedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).chatlistJoinedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 3) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersLimitPremium;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 4) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersChatsLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersChatsLimitPremium;
            limitParams.icon = R.drawable.msg_limit_chats;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 5) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).channelsLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).channelsLimitPremium;
            limitParams.icon = R.drawable.msg_limit_groups;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 6) {
            limitParams.defaultLimit = 100;
            limitParams.premiumLimit = 200;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
        } else if (i == 7) {
            limitParams.defaultLimit = 3;
            limitParams.premiumLimit = 4;
            limitParams.icon = R.drawable.msg_limit_accounts;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(limitParams.premiumLimit));
            int i3 = R.string.LimitReachedAccountsPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 11) {
            limitParams.defaultLimit = 0;
            limitParams.premiumLimit = 0;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = "";
            limitParams.descriptionStrLocked = "";
        } else if (i == 14) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storyExpiringLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storyExpiringLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesCount", R.string.LimitReachedStoriesCount, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i4 = R.string.LimitReachedStoriesCountPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesCountPremium", i4, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesCountPremium", i4, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 15) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentWeeklyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentWeeklyLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i5 = R.string.LimitReachedStoriesWeeklyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i5, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i5, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 16) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i6 = R.string.LimitReachedStoriesMonthlyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 18 || i == 32 || i == 20 || i == 24 || i == 26 || i == 27 || i == 25 || i == 30 || i == 29 || i == 22 || i == 23 || i == 19 || i == 21) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitPremium;
            limitParams.icon = R.drawable.filled_limit_boost;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i7 = R.string.LimitReachedStoriesMonthlyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i7, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i7, Integer.valueOf(limitParams.defaultLimit));
        }
        return limitParams;
    }

    private void loadAdminedChannels() {
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_channels_getAdminedPublicChannels(), new RequestDelegate() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda23
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                LimitReachedBottomSheet.this.lambda$loadAdminedChannels$23(tLObject, tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAdminedChannels$23(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                LimitReachedBottomSheet.this.lambda$loadAdminedChannels$22(tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAdminedChannels$22(TLObject tLObject) {
        int i;
        if (tLObject != null) {
            this.chats.clear();
            this.chats.addAll(((TLRPC$TL_messages_chats) tLObject).chats);
            this.loading = false;
            this.enterAnimator.showItemsAnimated(this.chatsTitleRow + 4);
            int i2 = 0;
            while (true) {
                if (i2 >= this.recyclerListView.getChildCount()) {
                    i = 0;
                    break;
                } else if (this.recyclerListView.getChildAt(i2) instanceof HeaderView) {
                    i = this.recyclerListView.getChildAt(i2).getTop();
                    break;
                } else {
                    i2++;
                }
            }
            updateRows();
            if (this.headerRow >= 0 && i != 0) {
                ((LinearLayoutManager) this.recyclerListView.getLayoutManager()).scrollToPositionWithOffset(this.headerRow + 1, i);
            }
        }
        int max = Math.max(this.chats.size(), this.limitParams.defaultLimit);
        this.limitPreviewView.setIconValue(max, false);
        this.limitPreviewView.setBagePosition(max / this.limitParams.premiumLimit);
        this.limitPreviewView.startDelayedAnimation();
    }

    private void updateRows() {
        ArrayList<Long> arrayList;
        ArrayList<Long> arrayList2;
        ArrayList<Long> arrayList3;
        ArrayList<Long> arrayList4;
        this.rowCount = 0;
        this.dividerRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.loadingRow = -1;
        this.linkRow = -1;
        this.emptyViewDividerRow = -1;
        this.boostFeaturesStartRow = -1;
        this.rowCount = 0 + 1;
        this.headerRow = 0;
        int i = this.type;
        if (i == 19 || i == 18 || i == 20 || i == 24 || i == 26 || i == 27 || i == 22 || i == 23 || i == 25 || i == 29 || i == 21 || i == 30) {
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
            if (i8 != 11) {
                int i9 = this.rowCount;
                int i10 = i9 + 1;
                this.rowCount = i10;
                this.dividerRow = i9;
                this.rowCount = i10 + 1;
                this.chatsTitleRow = i10;
            } else {
                this.topPadding = 0.24f;
            }
            if (this.loading) {
                int i11 = this.rowCount;
                this.rowCount = i11 + 1;
                this.loadingRow = i11;
            } else {
                if (i8 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.premiumInviteBlockedUsers) == null || arrayList.isEmpty()) && ((arrayList2 = this.premiumMessagingBlockedUsers) == null || arrayList2.size() < this.restrictedUsers.size())) || (arrayList3 = this.premiumInviteBlockedUsers) == null || arrayList3.size() != 1 || (arrayList4 = this.premiumMessagingBlockedUsers) == null || arrayList4.size() != 1 || !this.canSendLink)) {
                    int i12 = this.rowCount;
                    this.chatStartRow = i12;
                    int i13 = this.type;
                    if (i13 == 11) {
                        this.rowCount = i12 + this.restrictedUsers.size();
                    } else if (i13 == 5) {
                        this.rowCount = i12 + this.inactiveChats.size();
                    } else {
                        this.rowCount = i12 + this.chats.size();
                    }
                    this.chatEndRow = this.rowCount;
                }
                if (this.chatEndRow - this.chatStartRow > 1) {
                    int i14 = this.rowCount;
                    this.rowCount = i14 + 1;
                    this.emptyViewDividerRow = i14;
                }
            }
        }
        notifyDataSetChanged();
    }

    private void revokeSelectedLinks() {
        ArrayList<TLRPC$Chat> arrayList = new ArrayList<>();
        Iterator<Object> it = this.selectedChats.iterator();
        while (it.hasNext()) {
            this.chats.add((TLRPC$Chat) it.next());
        }
        revokeLinks(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void revokeLinks(final ArrayList<TLRPC$Chat> arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]));
        if (arrayList.size() == 1) {
            TLRPC$Chat tLRPC$Chat = arrayList.get(0);
            if (this.parentIsChannel) {
                int i = R.string.RevokeLinkAlertChannel;
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(tLRPC$Chat), tLRPC$Chat.title)));
            } else {
                int i2 = R.string.RevokeLinkAlert;
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i2, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(tLRPC$Chat), tLRPC$Chat.title)));
            }
        } else if (this.parentIsChannel) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0])));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("RevokeButton", R.string.RevokeButton), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                LimitReachedBottomSheet.this.lambda$revokeLinks$25(arrayList, dialogInterface, i3);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$revokeLinks$25(ArrayList arrayList, DialogInterface dialogInterface, int i) {
        dismiss();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername = new TLRPC$TL_channels_updateUsername();
            tLRPC$TL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC$Chat) arrayList.get(i2));
            tLRPC$TL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_updateUsername, new RequestDelegate() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda24
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LimitReachedBottomSheet.this.lambda$revokeLinks$24(tLObject, tLRPC$TL_error);
                }
            }, 64);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$revokeLinks$24(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            AndroidUtilities.runOnUIThread(this.onSuccessRunnable);
        }
    }

    private void loadInactiveChannels() {
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_channels_getInactiveChannels(), new RequestDelegate() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda25
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                LimitReachedBottomSheet.this.lambda$loadInactiveChannels$27(tLObject, tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadInactiveChannels$27(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        String formatPluralString;
        if (tLRPC$TL_error == null) {
            final TLRPC$TL_messages_inactiveChats tLRPC$TL_messages_inactiveChats = (TLRPC$TL_messages_inactiveChats) tLObject;
            final ArrayList arrayList = new ArrayList();
            final int min = Math.min(tLRPC$TL_messages_inactiveChats.chats.size(), tLRPC$TL_messages_inactiveChats.dates.size());
            for (int i = 0; i < min; i++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$TL_messages_inactiveChats.chats.get(i);
                int currentTime = (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - tLRPC$TL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                if (currentTime < 30) {
                    formatPluralString = LocaleController.formatPluralString("Days", currentTime, new Object[0]);
                } else if (currentTime < 365) {
                    formatPluralString = LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                }
                if (ChatObject.isMegagroup(tLRPC$Chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", tLRPC$Chat.participants_count, new Object[0]), formatPluralString));
                } else if (ChatObject.isChannel(tLRPC$Chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", tLRPC$Chat.participants_count, new Object[0]), formatPluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    LimitReachedBottomSheet.this.lambda$loadInactiveChannels$26(arrayList, min, tLRPC$TL_messages_inactiveChats);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadInactiveChannels$26(ArrayList arrayList, int i, TLRPC$TL_messages_inactiveChats tLRPC$TL_messages_inactiveChats) {
        int i2;
        this.inactiveChatsSignatures.clear();
        this.inactiveChats.clear();
        this.inactiveChatsSignatures.addAll(arrayList);
        for (int i3 = 0; i3 < i; i3++) {
            this.inactiveChats.add(tLRPC$TL_messages_inactiveChats.chats.get(i3));
        }
        this.loading = false;
        this.enterAnimator.showItemsAnimated(this.chatsTitleRow + 4);
        int i4 = 0;
        while (true) {
            if (i4 >= this.recyclerListView.getChildCount()) {
                i2 = 0;
                break;
            } else if (this.recyclerListView.getChildAt(i4) instanceof HeaderView) {
                i2 = this.recyclerListView.getChildAt(i4).getTop();
                break;
            } else {
                i4++;
            }
        }
        updateRows();
        if (this.headerRow >= 0 && i2 != 0) {
            ((LinearLayoutManager) this.recyclerListView.getLayoutManager()).scrollToPositionWithOffset(this.headerRow + 1, i2);
        }
        if (this.limitParams == null) {
            this.limitParams = getLimitParams(this.type, this.currentAccount);
        }
        int max = Math.max(this.inactiveChats.size(), this.limitParams.defaultLimit);
        LimitPreviewView limitPreviewView = this.limitPreviewView;
        if (limitPreviewView != null) {
            limitPreviewView.setIconValue(max, false);
            this.limitPreviewView.setBagePosition(max / this.limitParams.premiumLimit);
            this.limitPreviewView.startDelayedAnimation();
        }
    }

    private void setupBoostFeatures() {
        this.boostFeatures = new ArrayList<>();
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
        int i = 10;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int max = Math.max(10, peerColors != null ? peerColors.maxLevel(isGroup()) : 0);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            int max2 = Math.max(max, peerColors2 != null ? peerColors2.maxLevel(isGroup()) : 0);
            if (isGroup()) {
                i = Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin);
            } else {
                i = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin);
            }
        }
        ArrayList<BoostFeature> arrayList = null;
        for (int i2 = this.type != 31 ? tL_stories$TL_premium_boostsStatus != null ? tL_stories$TL_premium_boostsStatus.level + 1 : 1 : 1; i2 <= i; i2++) {
            ArrayList<BoostFeature> boostFeaturesForLevel = boostFeaturesForLevel(i2);
            if (arrayList == null || !BoostFeature.arraysEqual(arrayList, boostFeaturesForLevel)) {
                ArrayList<BoostFeature> arrayList2 = this.boostFeatures;
                arrayList2.add(new BoostFeature.BoostFeatureLevel(i2, arrayList2.isEmpty()));
                this.boostFeatures.addAll(boostFeaturesForLevel);
                arrayList = boostFeaturesForLevel;
            }
        }
    }

    private ArrayList<BoostFeature> boostFeaturesForLevel(int i) {
        boolean isGroup = isGroup();
        ArrayList<BoostFeature> arrayList = new ArrayList<>();
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (messagesController == null) {
            return arrayList;
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

    /* loaded from: classes3.dex */
    private class BoostFeatureCell extends FrameLayout {
        public BoostFeature feature;
        private final ImageView imageView;
        public BoostFeature.BoostFeatureLevel level;
        private final FrameLayout levelLayout;
        private final SimpleTextView levelTextView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final SimpleTextView textView;

        public BoostFeatureCell(LimitReachedBottomSheet limitReachedBottomSheet, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setPadding(((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0, ((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0);
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
            FrameLayout frameLayout = new FrameLayout(context, limitReachedBottomSheet, resourcesProvider) { // from class: org.telegram.ui.Components.Premium.LimitReachedBottomSheet.BoostFeatureCell.1
                private final Paint dividerPaint;
                private final PremiumGradient.PremiumGradientTools gradientTools;
                final /* synthetic */ Theme.ResourcesProvider val$resourcesProvider;

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
            } else if (boostFeature != null) {
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
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.level != null ? 49.0f : 36.0f), 1073741824));
        }
    }

    public static LimitReachedBottomSheet openBoostsForRemoveRestrictions(BaseFragment baseFragment, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j, boolean z) {
        if (baseFragment == null || tL_stories$TL_premium_boostsStatus == null || canApplyBoost == null || baseFragment.getContext() == null) {
            return null;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 32, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_stories$TL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        if (z) {
            baseFragment.showDialog(limitReachedBottomSheet);
        } else {
            limitReachedBottomSheet.show();
        }
        return limitReachedBottomSheet;
    }

    public static void openBoostsForUsers(BaseFragment baseFragment, boolean z, long j, ChannelBoostsController.CanApplyBoost canApplyBoost, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, ChatMessageCell chatMessageCell) {
        if (baseFragment == null || canApplyBoost == null || tL_stories$TL_premium_boostsStatus == null || baseFragment.getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 19, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_stories$TL_premium_boostsStatus, z);
        limitReachedBottomSheet.setDialogId(j);
        limitReachedBottomSheet.setChatMessageCell(chatMessageCell);
        baseFragment.showDialog(limitReachedBottomSheet);
    }

    public static void openBoostsForPostingStories(BaseFragment baseFragment, long j, ChannelBoostsController.CanApplyBoost canApplyBoost, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, Runnable runnable) {
        if (baseFragment == null || canApplyBoost == null || tL_stories$TL_premium_boostsStatus == null || baseFragment.getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 18, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_stories$TL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        limitReachedBottomSheet.showStatisticButtonInLink(runnable);
        limitReachedBottomSheet.show();
    }
}
