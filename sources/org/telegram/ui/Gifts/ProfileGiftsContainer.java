package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.ProfileGiftsView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

/* loaded from: classes5.dex */
public abstract class ProfileGiftsContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final HashMap cachedLastEmojis = new HashMap();
    private final FrameLayout bulletinContainer;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private int buttonContainerHeightDp;
    private final View buttonShadow;
    private final CheckBox2 checkbox;
    private final LinearLayout checkboxLayout;
    private int checkboxRequestId;
    private final TextView checkboxTextView;
    private final int currentAccount;
    private final long dialogId;
    private final FrameLayout emptyView;
    private final TextView emptyViewButton;
    private final TextView emptyViewTitle;
    private final BaseFragment fragment;
    private final StarsController.GiftsList list;
    private final UniversalRecyclerView listView;
    private final ItemTouchHelper reorder;
    private boolean reordering;
    private final Theme.ResourcesProvider resourcesProvider;
    private int visibleHeight;

    public static class TextFactory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new TextFactory());
        }

        public static UItem asText(int i, int i2, float f, CharSequence charSequence, boolean z, int i3) {
            UItem ofFactory = UItem.ofFactory(TextFactory.class);
            ofFactory.text = charSequence;
            ofFactory.intValue = i2;
            ofFactory.longValue = i;
            ofFactory.floatValue = f;
            ofFactory.pad = i3;
            ofFactory.checked = z;
            return ofFactory;
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public void bindView(View view, UItem uItem, boolean z) {
            LinkSpanDrawable.LinksTextView linksTextView = (LinkSpanDrawable.LinksTextView) view;
            linksTextView.setGravity(uItem.intValue);
            linksTextView.setTextColor((int) uItem.longValue);
            linksTextView.setTextSize(1, uItem.floatValue);
            linksTextView.setTypeface(uItem.checked ? null : AndroidUtilities.bold());
            int i = uItem.pad;
            linksTextView.setPadding(i, 0, i, 0);
            linksTextView.setText(uItem.text);
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public LinkSpanDrawable.LinksTextView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new LinkSpanDrawable.LinksTextView(context) { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer.TextFactory.1
                @Override // org.telegram.ui.Components.LinkSpanDrawable.LinksTextView, android.widget.TextView, android.view.View
                protected void onMeasure(int i3, int i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i4);
                }
            };
        }
    }

    public static class UnpinSheet extends BottomSheet {
        long selectedGift;

        public UnpinSheet(Context context, long j, final TL_stars.SavedStarGift savedStarGift, Theme.ResourcesProvider resourcesProvider, final Utilities.Callback0Return callback0Return) {
            super(context, false, resourcesProvider);
            this.selectedGift = 0L;
            fixNavigationBar();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView makeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_windowBackgroundWhiteBlackText, true, resourcesProvider);
            makeTextView.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
            linearLayout.addView(makeTextView, LayoutHelper.createLinear(-1, -2, 22.0f, 12.0f, 22.0f, 0.0f));
            TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false, resourcesProvider);
            makeTextView2.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
            linearLayout.addView(makeTextView2, LayoutHelper.createLinear(-1, -2, 22.0f, 4.33f, 22.0f, 10.0f));
            final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            final StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount).getProfileGiftsList(j);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, 0, new Utilities.Callback2() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$UnpinSheet$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    ProfileGiftsContainer.UnpinSheet.this.lambda$new$0(profileGiftsList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$UnpinSheet$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback5
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ProfileGiftsContainer.UnpinSheet.this.lambda$new$1(buttonWithCounterView, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null, resourcesProvider) { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer.UnpinSheet.1
                @Override // org.telegram.ui.Components.RecyclerListView
                public Integer getSelectorColor(int i) {
                    return 0;
                }
            };
            universalRecyclerView.setSpanCount(3);
            universalRecyclerView.setOverScrollMode(2);
            universalRecyclerView.setScrollEnabled(false);
            linearLayout.addView(universalRecyclerView, LayoutHelper.createLinear(-1, -2, 11.0f, 0.0f, 11.0f, 0.0f));
            buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2UnpinAlertButton), false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 22.0f, 9.0f, 22.0f, 9.0f));
            buttonWithCounterView.setEnabled(false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$UnpinSheet$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileGiftsContainer.UnpinSheet.this.lambda$new$2(profileGiftsList, savedStarGift, callback0Return, view);
                }
            });
            setCustomView(linearLayout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(StarsController.GiftsList giftsList, ArrayList arrayList, UniversalAdapter universalAdapter) {
            Iterator it = giftsList.gifts.iterator();
            while (it.hasNext()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) it.next();
                if (savedStarGift.pinned_to_top) {
                    arrayList.add(PeerColorActivity.GiftCell.Factory.asGiftCell(savedStarGift).setChecked(this.selectedGift == savedStarGift.gift.id).setSpanCount(1));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(ButtonWithCounterView buttonWithCounterView, UItem uItem, View view, Integer num, Float f, Float f2) {
            long j = ((TL_stars.SavedStarGift) uItem.object).gift.id;
            if (this.selectedGift == j) {
                this.selectedGift = 0L;
            } else {
                this.selectedGift = j;
            }
            buttonWithCounterView.setEnabled(this.selectedGift != 0);
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof PeerColorActivity.GiftCell) {
                        PeerColorActivity.GiftCell giftCell = (PeerColorActivity.GiftCell) childAt;
                        giftCell.setSelected(this.selectedGift == giftCell.getGiftId(), true);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(StarsController.GiftsList giftsList, TL_stars.SavedStarGift savedStarGift, Utilities.Callback0Return callback0Return, View view) {
            TL_stars.SavedStarGift savedStarGift2;
            ArrayList pinned = giftsList.getPinned();
            int i = 0;
            while (true) {
                if (i >= pinned.size()) {
                    i = -1;
                    savedStarGift2 = null;
                    break;
                } else {
                    if (((TL_stars.SavedStarGift) pinned.get(i)).gift.id == this.selectedGift) {
                        savedStarGift2 = (TL_stars.SavedStarGift) pinned.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (savedStarGift2 == null) {
                return;
            }
            savedStarGift2.pinned_to_top = false;
            pinned.set(i, savedStarGift);
            savedStarGift.pinned_to_top = true;
            giftsList.setPinned(pinned);
            lambda$new$0();
            ((BulletinFactory) callback0Return.run()).createSimpleBulletin(R.raw.ic_pin, LocaleController.formatString(R.string.Gift2ReplacedPinTitle, StarGiftSheet.getGiftName(savedStarGift.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, StarGiftSheet.getGiftName(savedStarGift2.gift))).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x038a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfileGiftsContainer(final BaseFragment baseFragment, Context context, final int i, long j, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        int i2;
        String str;
        LinearLayout linearLayout;
        TLRPC.EncryptedChat encryptedChat;
        this.checkboxRequestId = -1;
        this.visibleHeight = AndroidUtilities.displaySize.y;
        this.fragment = baseFragment;
        this.currentAccount = i;
        this.dialogId = (!DialogObject.isEncryptedDialog(j) || (encryptedChat = MessagesController.getInstance(i).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)))) == null) ? j : encryptedChat.user_id;
        StarsController.getInstance(i).invalidateProfileGifts(this.dialogId);
        StarsController.GiftsList profileGiftsList = StarsController.getInstance(i).getProfileGiftsList(this.dialogId);
        this.list = profileGiftsList;
        profileGiftsList.shown = true;
        profileGiftsList.resetFilters();
        profileGiftsList.load();
        this.resourcesProvider = resourcesProvider;
        int i3 = Theme.key_windowBackgroundWhite;
        int color = Theme.getColor(i3, resourcesProvider);
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        setBackgroundColor(Theme.blendOver(color, Theme.multAlpha(Theme.getColor(i4, resourcesProvider), 0.04f)));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i, 0, false, new Utilities.Callback2() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                ProfileGiftsContainer.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda1
            @Override // org.telegram.messenger.Utilities.Callback5
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                ProfileGiftsContainer.this.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda2
            @Override // org.telegram.messenger.Utilities.Callback5Return
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(ProfileGiftsContainer.this.onItemLongPress((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        }, resourcesProvider, 3, 1);
        this.listView = universalRecyclerView;
        universalRecyclerView.adapter.setApplyBackground(false);
        universalRecyclerView.setSelectorType(9);
        universalRecyclerView.setSelectorDrawableColor(0);
        universalRecyclerView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        universalRecyclerView.setClipToPadding(false);
        universalRecyclerView.setClipChildren(false);
        addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1, 119));
        universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                if (!ProfileGiftsContainer.this.listView.canScrollVertically(1) || ProfileGiftsContainer.this.isLoadingVisible()) {
                    ProfileGiftsContainer.this.list.load();
                }
            }
        });
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer.2
            private TL_stars.SavedStarGift getSavedGift(RecyclerView.ViewHolder viewHolder) {
                View view = viewHolder.itemView;
                if (view instanceof GiftSheet.GiftCell) {
                    return ((GiftSheet.GiftCell) view).getSavedGift();
                }
                return null;
            }

            private boolean isPinnedAndSaved(TL_stars.SavedStarGift savedStarGift) {
                return (savedStarGift == null || !savedStarGift.pinned_to_top || savedStarGift.unsaved) ? false : true;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                super.clearView(recyclerView, viewHolder);
                viewHolder.itemView.setPressed(false);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                TL_stars.SavedStarGift savedGift = getSavedGift(viewHolder);
                return (ProfileGiftsContainer.this.reordering && savedGift != null && savedGift.pinned_to_top) ? ItemTouchHelper.Callback.makeMovementFlags(15, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean isItemViewSwipeEnabled() {
                return ProfileGiftsContainer.this.reordering;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean isLongPressDragEnabled() {
                return ProfileGiftsContainer.this.reordering;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                ProfileGiftsView profileGiftsView;
                if (!ProfileGiftsContainer.this.reordering || !isPinnedAndSaved(getSavedGift(viewHolder)) || !isPinnedAndSaved(getSavedGift(viewHolder2))) {
                    return false;
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = viewHolder2.getAdapterPosition();
                ProfileGiftsContainer.this.list.reorderPinned(adapterPosition - 1, adapterPosition2 - 1);
                ProfileGiftsContainer.this.listView.adapter.notifyItemMoved(adapterPosition, adapterPosition2);
                ProfileGiftsContainer.this.listView.adapter.updateWithoutNotify();
                BaseFragment baseFragment2 = baseFragment;
                if (!(baseFragment2 instanceof ProfileActivity) || (profileGiftsView = ((ProfileActivity) baseFragment2).giftsView) == null) {
                    return true;
                }
                profileGiftsView.update();
                return true;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i5) {
                ProfileGiftsContainer profileGiftsContainer = ProfileGiftsContainer.this;
                if (i5 == 0) {
                    profileGiftsContainer.list.reorderDone();
                } else {
                    if (profileGiftsContainer.listView != null) {
                        ProfileGiftsContainer.this.listView.cancelClickRunnables(false);
                    }
                    if (viewHolder != null) {
                        viewHolder.itemView.setPressed(true);
                    }
                }
                super.onSelectedChanged(viewHolder, i5);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i5) {
            }
        });
        this.reorder = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(universalRecyclerView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.emptyView = frameLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        frameLayout.addView(linearLayout2, LayoutHelper.createFrame(-2, -2, 17));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        linearLayout2.addView(backupImageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.emptyViewTitle = textView;
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(Theme.getColor(i4, resourcesProvider));
        textView.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 12, 0, 0));
        TextView textView2 = new TextView(context);
        this.emptyViewButton = textView2;
        textView2.setTextSize(1, 14.0f);
        int i5 = Theme.key_featuredStickers_addButton;
        textView2.setTextColor(Theme.getColor(i5, resourcesProvider));
        textView2.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileGiftsContainer.this.lambda$new$0(view);
            }
        });
        textView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
        textView2.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i5, resourcesProvider), 0.1f), 4, 4));
        ScaleStateListAnimator.apply(textView2);
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
        universalRecyclerView.setEmptyView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.buttonContainer = frameLayout2;
        frameLayout2.setBackgroundColor(Theme.getColor(i3, resourcesProvider));
        addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 87));
        View view = new View(context);
        this.buttonShadow = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogGrayLine, resourcesProvider));
        frameLayout2.addView(view, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bulletinContainer = frameLayout3;
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.checkboxLayout = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout3.setOrientation(0);
        linearLayout3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 6, 6));
        CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
        this.checkbox = checkBox2;
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(false, false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        this.checkboxTextView = textView3;
        textView3.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout3.addView(textView3, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        frameLayout2.addView(linearLayout3, LayoutHelper.createFrame(-2, 38.0f, 17, 0.0f, (1.0f / AndroidUtilities.density) + 6.0f, 0.0f, 6.0f));
        ScaleStateListAnimator.apply(linearLayout3, 0.025f, 1.5f);
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ProfileGiftsContainer.this.lambda$new$3(resourcesProvider, i, view2);
            }
        });
        Boolean bool = profileGiftsList.chat_notifications_enabled;
        if (bool != null) {
            checkBox2.setChecked(bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(this.dialogId));
        final boolean z = this.dialogId < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.button = buttonWithCounterView;
        StringBuilder sb = new StringBuilder();
        sb.append("G ");
        if (z) {
            long j2 = this.dialogId;
            if (j2 >= 0) {
                str = LocaleController.formatString(R.string.ProfileGiftsSendUser, DialogObject.getShortName(j2));
                sb.append(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_gift_simple), 0, 1, 33);
                buttonWithCounterView.setText(spannableStringBuilder, false);
                frameLayout2.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
                buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ProfileGiftsContainer.this.lambda$new$4(z, i, view2);
                    }
                });
                int i6 = 8;
                buttonWithCounterView.setVisibility(!canSwitchNotify() ? 8 : 0);
                if (canSwitchNotify()) {
                    linearLayout = linearLayout3;
                } else {
                    linearLayout = linearLayout3;
                    i6 = 0;
                }
                linearLayout.setVisibility(i6);
                this.buttonContainerHeightDp = !canSwitchNotify() ? 50 : 68;
                addView(frameLayout3, LayoutHelper.createFrame(-1, NotificationCenter.storyQualityUpdate, 87));
            }
            i2 = R.string.ProfileGiftsSendChannel;
        } else {
            i2 = R.string.ProfileGiftsSend;
        }
        str = LocaleController.getString(i2);
        sb.append(str);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.filled_gift_simple), 0, 1, 33);
        buttonWithCounterView.setText(spannableStringBuilder2, false);
        frameLayout2.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ProfileGiftsContainer.this.lambda$new$4(z, i, view2);
            }
        });
        int i62 = 8;
        buttonWithCounterView.setVisibility(!canSwitchNotify() ? 8 : 0);
        if (canSwitchNotify()) {
        }
        linearLayout.setVisibility(i62);
        this.buttonContainerHeightDp = !canSwitchNotify() ? 50 : 68;
        addView(frameLayout3, LayoutHelper.createFrame(-1, NotificationCenter.storyQualityUpdate, 87));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLoadingVisible() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        this.list.resetFilters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(TLRPC.TL_error tL_error, Theme.ResourcesProvider resourcesProvider) {
        this.checkboxRequestId = -1;
        if (tL_error != null) {
            BulletinFactory.of(this.bulletinContainer, resourcesProvider).showForError(tL_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(final Theme.ResourcesProvider resourcesProvider, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                ProfileGiftsContainer.this.lambda$new$1(tL_error, resourcesProvider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(final Theme.ResourcesProvider resourcesProvider, int i, View view) {
        this.checkbox.setChecked(!r7.isChecked(), true);
        boolean isChecked = this.checkbox.isChecked();
        BulletinFactory.of(this.bulletinContainer, resourcesProvider).createSimpleBulletinDetail(isChecked ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(isChecked ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).show();
        this.list.chat_notifications_enabled = Boolean.valueOf(isChecked);
        if (this.checkboxRequestId >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.checkboxRequestId, true);
            this.checkboxRequestId = -1;
        }
        TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
        togglechatstargiftnotifications.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
        togglechatstargiftnotifications.enabled = isChecked;
        ConnectionsManager.getInstance(i).sendRequest(togglechatstargiftnotifications, new RequestDelegate() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda13
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ProfileGiftsContainer.this.lambda$new$2(resourcesProvider, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(boolean z, int i, View view) {
        if (z) {
            new GiftSheet(getContext(), i, this.dialogId, null, null).setBirthday(BirthdayController.getInstance(i).isToday(this.dialogId)).show();
        } else {
            UserSelectorBottomSheet.open(2, 0L, BirthdayController.getInstance(i).getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemClick$5() {
        UniversalAdapter universalAdapter;
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongPress$10(String str) {
        AndroidUtilities.addToClipboard(str);
        BulletinFactory.of(this.fragment).createCopyLinkBulletin(false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongPress$11(TL_stars.SavedStarGift savedStarGift) {
        new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider) { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer.4
            @Override // org.telegram.ui.Stars.StarGiftSheet
            public BulletinFactory getBulletinFactory() {
                return BulletinFactory.of(ProfileGiftsContainer.this.fragment);
            }
        }.set(savedStarGift, null).onSharePressed(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongPress$12(TL_stars.SavedStarGift savedStarGift, GiftSheet.GiftCell giftCell) {
        if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
            giftCell.setPinned(false, true);
            this.list.togglePinned(savedStarGift, false, false);
        }
        savedStarGift.unsaved = !savedStarGift.unsaved;
        giftCell.setStarsGift(savedStarGift, true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.stargift = this.list.getInput(savedStarGift);
        savestargift.unsave = savedStarGift.unsaved;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongPress$13(TL_stars.SavedStarGift savedStarGift) {
        new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider) { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer.5
            @Override // org.telegram.ui.Stars.StarGiftSheet
            public BulletinFactory getBulletinFactory() {
                return BulletinFactory.of(ProfileGiftsContainer.this.fragment);
            }
        }.set(savedStarGift, null).openTransfer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BulletinFactory lambda$onItemLongPress$6(View view, boolean z) {
        ((GiftSheet.GiftCell) view).setPinned(z, true);
        this.listView.scrollToPosition(0);
        return BulletinFactory.of(this.fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongPress$7(TL_stars.SavedStarGift savedStarGift, GiftSheet.GiftCell giftCell, final View view) {
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            giftCell.setStarsGift(savedStarGift, true);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = this.list.getInput(savedStarGift);
            savestargift.unsave = savedStarGift.unsaved;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
        }
        final boolean z = !savedStarGift.pinned_to_top;
        if (this.list.togglePinned(savedStarGift, z, false)) {
            new UnpinSheet(getContext(), this.dialogId, savedStarGift, this.resourcesProvider, new Utilities.Callback0Return() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda15
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    BulletinFactory lambda$onItemLongPress$6;
                    lambda$onItemLongPress$6 = ProfileGiftsContainer.this.lambda$onItemLongPress$6(view, z);
                    return lambda$onItemLongPress$6;
                }
            }).show();
            return;
        }
        BulletinFactory of = BulletinFactory.of(this.fragment);
        (z ? of.createSimpleBulletin(R.raw.ic_pin, LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle)) : of.createSimpleBulletin(R.raw.ic_unpin, LocaleController.getString(R.string.Gift2Unpinned))).show();
        ((GiftSheet.GiftCell) view).setPinned(z, true);
        this.listView.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongPress$8() {
        setReordering(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongPress$9(TL_stars.SavedStarGift savedStarGift) {
        new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider) { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer.3
            @Override // org.telegram.ui.Stars.StarGiftSheet
            public BulletinFactory getBulletinFactory() {
                return BulletinFactory.of(ProfileGiftsContainer.this.fragment);
            }
        }.set(savedStarGift, null).toggleWear(false);
    }

    private void setReordering(boolean z) {
        if (this.reordering == z) {
            return;
        }
        this.reordering = z;
        updatedReordering(z);
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof GiftSheet.GiftCell) {
                ((GiftSheet.GiftCell) childAt).setReordering(z, true);
            }
        }
        UniversalAdapter universalAdapter = this.listView.adapter;
        if (universalAdapter != null) {
            universalAdapter.updateWithoutNotify();
        }
        if (z) {
            BaseFragment baseFragment = this.fragment;
            if (baseFragment instanceof ProfileActivity) {
                ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
            }
        }
    }

    public boolean canFilter() {
        return true;
    }

    public boolean canFilterHidden() {
        if (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        if (this.dialogId >= 0) {
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)), 5);
    }

    public boolean canReorder() {
        long j = this.dialogId;
        return j >= 0 ? j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId() : ChatObject.canUserDoAction(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)), 5);
    }

    public boolean canSwitchNotify() {
        return this.dialogId < 0 && this.list.chat_notifications_enabled != null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i != NotificationCenter.starUserGiftsLoaded) {
            if (i == NotificationCenter.updateInterfaces) {
                this.button.setVisibility(canSwitchNotify() ? 8 : 0);
                this.checkboxLayout.setVisibility(canSwitchNotify() ? 0 : 8);
                this.buttonContainerHeightDp = canSwitchNotify() ? 50 : 68;
                setVisibleHeight(this.visibleHeight);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == this.dialogId) {
            this.button.setVisibility(canSwitchNotify() ? 8 : 0);
            this.checkboxLayout.setVisibility(canSwitchNotify() ? 0 : 8);
            this.buttonContainerHeightDp = canSwitchNotify() ? 50 : 68;
            Boolean bool = this.list.chat_notifications_enabled;
            if (bool != null) {
                this.checkbox.setChecked(bool.booleanValue(), true);
            }
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                universalAdapter.update(true);
            }
            if (!this.listView.canScrollVertically(1) || isLoadingVisible()) {
                this.list.load();
            }
        }
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        int i;
        int i2;
        int i3;
        if (this.list.hasFilters() && this.list.gifts.size() <= 0) {
            StarsController.GiftsList giftsList = this.list;
            if (giftsList.endReached && !giftsList.loading) {
                return;
            }
        }
        StarsController.GiftsList giftsList2 = this.list;
        int max = Math.max(1, (giftsList2 == null || (i3 = giftsList2.totalCount) == 0) ? 3 : Math.min(3, i3));
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.setSpanCount(max);
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(12.0f)));
        StarsController.GiftsList giftsList3 = this.list;
        if (giftsList3 != null) {
            Iterator it = giftsList3.gifts.iterator();
            loop0: while (true) {
                i = 3;
                do {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, (TL_stars.SavedStarGift) it.next(), true).setReordering(this.reordering));
                    i--;
                } while (i != 0);
            }
            StarsController.GiftsList giftsList4 = this.list;
            if (giftsList4.loading || !giftsList4.endReached) {
                while (true) {
                    if (i2 >= (i <= 0 ? 3 : i)) {
                        break;
                    }
                    i2++;
                    arrayList.add(UItem.asFlicker(i2, 34).setSpanCount(1));
                }
            }
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(20.0f)));
        if (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            arrayList.add(TextFactory.asText(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider), 17, 14.0f, LocaleController.getString(R.string.ProfileGiftsInfo), true, AndroidUtilities.dp(24.0f)));
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(82.0f)));
    }

    public RecyclerListView getCurrentListView() {
        return this.listView;
    }

    public int getGiftsCount() {
        int i;
        StarsController.GiftsList giftsList = this.list;
        if (giftsList != null && (i = giftsList.totalCount) > 0) {
            return i;
        }
        long j = this.dialogId;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        long j2 = this.dialogId;
        if (j >= 0) {
            TLRPC.UserFull userFull = messagesController.getUserFull(j2);
            if (userFull != null) {
                return userFull.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull chatFull = messagesController.getChatFull(-j2);
        if (chatFull != null) {
            return chatFull.stargifts_count;
        }
        return 0;
    }

    public CharSequence getLastEmojis(Paint.FontMetricsInt fontMetricsInt) {
        CharSequence charSequence;
        if (this.list == null) {
            return "";
        }
        Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(this.dialogId));
        if (this.list.gifts.isEmpty()) {
            return (!this.list.loading || (charSequence = (CharSequence) cachedLastEmojis.get(pair)) == null) ? "" : charSequence;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; arrayList.size() < 3 && i < this.list.gifts.size(); i++) {
            TLRPC.Document document = ((TL_stars.SavedStarGift) this.list.gifts.get(i)).gift.getDocument();
            if (document != null && !hashSet.contains(Long.valueOf(document.id))) {
                hashSet.add(Long.valueOf(document.id));
                arrayList.add(document);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan((TLRPC.Document) arrayList.get(i2), 0.9f, fontMetricsInt), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        }
        cachedLastEmojis.put(pair, spannableStringBuilder);
        return spannableStringBuilder;
    }

    public long getLastEmojisHash() {
        StarsController.GiftsList giftsList = this.list;
        long j = 0;
        if (giftsList != null && !giftsList.gifts.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < this.list.gifts.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) this.list.gifts.get(i2)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.id));
                    j = Objects.hash(Long.valueOf(j), Long.valueOf(document.id));
                    i++;
                }
            }
        }
        return j;
    }

    public StarsController.GiftsList getList() {
        return this.list;
    }

    public boolean isReordering() {
        return this.reordering;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        UniversalAdapter universalAdapter;
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(false);
        }
        StarsController.GiftsList giftsList = this.list;
        if (giftsList != null) {
            giftsList.shown = true;
            giftsList.load();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        resetReordering();
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        StarsController.GiftsList giftsList = this.list;
        if (giftsList != null) {
            giftsList.shown = false;
        }
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            if (!this.reordering) {
                new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider).setOnGiftUpdatedListener(new Runnable() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfileGiftsContainer.this.lambda$onItemClick$5();
                    }
                }).set(savedStarGift, this.list).show();
                return;
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                boolean z = !savedStarGift.pinned_to_top;
                if (z && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = this.list.getInput(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
                }
                if (this.list.togglePinned(savedStarGift, z, true)) {
                    BulletinFactory.of(this.fragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit)).show();
                }
                if (z) {
                    this.listView.scrollToPosition(0);
                }
            }
        }
    }

    public boolean onItemLongPress(UItem uItem, final View view, int i, float f, float f2) {
        final String str;
        if (view instanceof GiftSheet.GiftCell) {
            Object obj = uItem.object;
            if (obj instanceof TL_stars.SavedStarGift) {
                final GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) view;
                final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                ItemOptions makeOptions = ItemOptions.makeOptions(this.fragment, view);
                if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    if (canReorder() && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                        boolean z = savedStarGift.pinned_to_top;
                        makeOptions.add(z ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z ? R.string.Gift2Unpin : R.string.Gift2Pin), new Runnable() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda6
                            @Override // java.lang.Runnable
                            public final void run() {
                                ProfileGiftsContainer.this.lambda$onItemLongPress$7(savedStarGift, giftCell, view);
                            }
                        });
                        makeOptions.addIf(savedStarGift.pinned_to_top, R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda7
                            @Override // java.lang.Runnable
                            public final void run() {
                                ProfileGiftsContainer.this.lambda$onItemLongPress$8();
                            }
                        });
                    }
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (starGift.slug != null) {
                        str = MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                    } else {
                        str = null;
                    }
                    if (StarGiftSheet.isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                        boolean isWorn = StarGiftSheet.isWorn(this.currentAccount, tL_starGiftUnique);
                        makeOptions.add(isWorn ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(isWorn ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                ProfileGiftsContainer.this.lambda$onItemLongPress$9(savedStarGift);
                            }
                        });
                    }
                    makeOptions.addIf(str != null, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new Runnable() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfileGiftsContainer.this.lambda$onItemLongPress$10(str);
                        }
                    });
                    makeOptions.addIf(str != null, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfileGiftsContainer.this.lambda$onItemLongPress$11(savedStarGift);
                        }
                    });
                }
                if (StarGiftSheet.isMineWithActions(this.currentAccount, this.dialogId)) {
                    boolean z2 = savedStarGift.unsaved;
                    makeOptions.add(z2 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z2 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new Runnable() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda11
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfileGiftsContainer.this.lambda$onItemLongPress$12(savedStarGift, giftCell);
                        }
                    });
                }
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    makeOptions.addIf(DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(this.currentAccount).getClientUserId(), R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() { // from class: org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda12
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfileGiftsContainer.this.lambda$onItemLongPress$13(savedStarGift);
                        }
                    });
                }
                if (makeOptions.getItemsCount() <= 0) {
                    return false;
                }
                makeOptions.setGravity(5);
                makeOptions.setBlur(true);
                makeOptions.allowMoveScrim();
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                makeOptions.animateToSize(min - AndroidUtilities.dp(32.0f), (int) (min * 0.6f));
                makeOptions.hideScrimUnder();
                makeOptions.forceBottom(true);
                makeOptions.show();
                giftCell.imageView.getImageReceiver().startAnimation(true);
                return true;
            }
        }
        return false;
    }

    protected abstract int processColor(int i);

    public void resetReordering() {
        if (this.reordering) {
            this.list.sendPinnedOrder();
            setReordering(false);
        }
    }

    public void setVisibleHeight(int i) {
        this.visibleHeight = i;
        if (!canSwitchNotify()) {
            this.bulletinContainer.setTranslationY(0.0f);
            this.buttonContainer.setTranslationY(0.0f);
        } else {
            this.bulletinContainer.setTranslationY(((((-r0.getTop()) + i) - AndroidUtilities.dp(this.buttonContainerHeightDp)) - 1) - AndroidUtilities.dp(200.0f));
            this.buttonContainer.setTranslationY((((-r0.getTop()) + i) - AndroidUtilities.dp(this.buttonContainerHeightDp)) - 1);
        }
    }

    public void updateColors() {
        this.button.updateColors();
        ButtonWithCounterView buttonWithCounterView = this.button;
        int dp = AndroidUtilities.dp(8.0f);
        int i = Theme.key_featuredStickers_addButton;
        buttonWithCounterView.setBackground(Theme.createRoundRectDrawable(dp, processColor(Theme.getColor(i, this.resourcesProvider))));
        this.emptyViewTitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.emptyViewButton.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.emptyViewButton.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.1f), 4, 4));
        this.buttonContainer.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
        this.buttonShadow.setBackgroundColor(Theme.getColor(Theme.key_dialogGrayLine, this.resourcesProvider));
        this.checkboxTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        this.checkboxLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 6, 6));
    }

    protected abstract void updatedReordering(boolean z);
}
