package org.telegram.ui.community;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.messenger.utils.TextWatcherImpl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.IconBackgroundColors;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.cells.CommunityRequestsCell;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;

/* loaded from: classes3.dex */
public class CommunitySheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private ButtonWithCounterView addChatToCommunityButton;
    private final BoolAnimator animatorSearchFieldVisible;
    private final BoolAnimator animatorSearchResultVisible;
    private final Paint backgroundPaint;
    private TLRPC.ChatFull chatInfo;
    private final ChatsToAddListPage chatsPage;
    private ArrayList chatsToAddToCommunity;
    private boolean collapsedInDialogs;
    private final long communityId;
    private final CommunityPage communityPage;
    private final FadeView communityPageFadeView;
    private TLRPC.Chat currentChat;
    private final View fakeAnchorView;
    private final FilteredSearchView filteredSearchView;
    private final GradientProtectionDrawable gradientProtectionDrawableBottom;
    private final GradientProtectionDrawable gradientProtectionDrawableTop;
    private String lastSearchString;
    private final BaseFragment parentFragment;
    private CommunityUtils.PendingRequests pendingRequestsList;
    private final PendingRequestsPage requestsPage;
    private final FragmentSearchField searchView;
    private Insets systemAndImeInsets;
    private Insets systemInsets;
    private ViewPagerFixed viewPager;

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public /* synthetic */ void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.-CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$2800(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickCommunity(uItem, view, i, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$2900(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsCommunity(arrayList, universalAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$3700(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickChatToAdd(uItem, view, i, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$3800(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsChatsToAdd(arrayList, universalAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$5000(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickRequest(uItem, view, i, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$5100(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsRequests(arrayList, universalAdapter);
    }

    public CommunitySheet(final BaseFragment baseFragment, long j) {
        super(baseFragment.getContext(), true, true, baseFragment.getResourceProvider());
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchFieldVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 350L);
        this.animatorSearchResultVisible = new BoolAnimator(2, this, cubicBezierInterpolator, 350L);
        this.gradientProtectionDrawableTop = new GradientProtectionDrawable(2);
        this.gradientProtectionDrawableBottom = new GradientProtectionDrawable(8);
        this.backgroundPaint = new Paint(1);
        Insets insets = Insets.NONE;
        this.systemAndImeInsets = insets;
        this.systemInsets = insets;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.parentFragment = baseFragment;
        Context context = baseFragment.getContext();
        init(context);
        this.communityPageFadeView = new FadeView(context);
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourcesProvider);
        this.searchView = fragmentSearchField;
        fragmentSearchField.setCloseButtonVisible(true);
        fragmentSearchField.setWhiteBackground();
        fragmentSearchField.editText.setHint(LocaleController.getString(R.string.Search));
        fragmentSearchField.editText.addTextChangedListener(new TextWatcherImpl() { // from class: org.telegram.ui.community.CommunitySheet.1
            @Override // android.text.TextWatcher
            public /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.-CC.$default$beforeTextChanged(this, charSequence, i, i2, i3);
            }

            @Override // android.text.TextWatcher
            public /* synthetic */ void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.-CC.$default$onTextChanged(this, charSequence, i, i2, i3);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CommunitySheet.this.onTextChanged(editable.toString());
            }
        });
        fragmentSearchField.setVisibility(8);
        FilteredSearchView filteredSearchView = new FilteredSearchView(baseFragment);
        this.filteredSearchView = filteredSearchView;
        filteredSearchView.setVisibility(8);
        filteredSearchView.setBackground(null);
        filteredSearchView.setChatPreviewDelegate(new SearchViewPager.ChatPreviewDelegate() { // from class: org.telegram.ui.community.CommunitySheet.2
            @Override // org.telegram.ui.Components.SearchViewPager.ChatPreviewDelegate
            public void finish() {
            }

            @Override // org.telegram.ui.Components.SearchViewPager.ChatPreviewDelegate
            public void move(float f) {
            }

            @Override // org.telegram.ui.Components.SearchViewPager.ChatPreviewDelegate
            public void startChatPreview(RecyclerListView recyclerListView, DialogCell dialogCell) {
            }
        });
        filteredSearchView.setUiCallback(new FilteredSearchView.UiCallback() { // from class: org.telegram.ui.community.CommunitySheet.3
            @Override // org.telegram.ui.FilteredSearchView.UiCallback
            public boolean actionModeShowing() {
                return false;
            }

            @Override // org.telegram.ui.FilteredSearchView.UiCallback
            public boolean isSelected(FilteredSearchView.MessageHashId messageHashId) {
                return false;
            }

            @Override // org.telegram.ui.FilteredSearchView.UiCallback
            public void showActionMode() {
            }

            @Override // org.telegram.ui.FilteredSearchView.UiCallback
            public void toggleItemSelection(MessageObject messageObject, View view, int i) {
            }

            @Override // org.telegram.ui.FilteredSearchView.UiCallback
            public void goToMessage(MessageObject messageObject) {
                CommunitySheet.this.parentFragment.presentFragment(SearchViewPager.createFragmentFromMessage(((BottomSheet) CommunitySheet.this).currentAccount, messageObject));
                CommunitySheet.this.lambda$new$0();
            }
        });
        filteredSearchView.recyclerListView.setClipToPadding(false);
        this.fakeAnchorView = new View(getContext());
        Context context2 = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        CommunityUtils.PendingRequests pendingRequests = new CommunityUtils.PendingRequests(context2, resourcesProvider, BulletinFactory.of((FrameLayout) this.containerView, resourcesProvider), this.currentAccount, j);
        this.pendingRequestsList = pendingRequests;
        pendingRequests.setDelegate(new CommunityUtils.PendingRequests.Delegate() { // from class: org.telegram.ui.community.CommunitySheet.4
            @Override // org.telegram.ui.community.CommunityUtils.PendingRequests.Delegate
            public void updateAdapter() {
                CommunitySheet.this.requestsPage.listView.adapter.update(true);
                CommunitySheet.this.communityPage.listView.adapter.update(true);
            }

            @Override // org.telegram.ui.community.CommunityUtils.PendingRequests.Delegate
            public void close() {
                CommunitySheet.this.viewPager.scrollToPosition(0);
            }

            @Override // org.telegram.ui.community.CommunityUtils.PendingRequests.Delegate
            public void onClickGroupOwner(long j2) {
                baseFragment.presentFragment(ChatActivity.of(j2));
                CommunitySheet.this.lambda$new$0();
            }
        });
        this.communityId = j;
        this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
        this.chatInfo = MessagesController.getInstance(this.currentAccount).getChatFull(j);
        TLRPC.Chat chat = this.currentChat;
        this.collapsedInDialogs = chat != null && chat.collapsed_in_dialogs;
        FiltersView.MediaFilterData mediaFilterData = new FiltersView.MediaFilterData(R.drawable.search_users_filled, DialogObject.getShortName(chat), (TLRPC.MessagesFilter) null, 4);
        mediaFilterData.setUser(this.currentChat);
        mediaFilterData.removable = false;
        fragmentSearchField.addSearchFilter(mediaFilterData);
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        this.requestsPage = new PendingRequestsPage(context);
        this.communityPage = new CommunityPage(context);
        this.chatsPage = new ChatsToAddListPage(context);
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter() { // from class: org.telegram.ui.community.CommunitySheet.5
            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemCount() {
                return 3;
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemViewType(int i) {
                if (i == 2) {
                    return 2;
                }
                return i == 0 ? 0 : 1;
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public View createView(int i) {
                if (i == 2) {
                    return CommunitySheet.this.chatsPage;
                }
                return i == 0 ? CommunitySheet.this.communityPage : CommunitySheet.this.requestsPage;
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public void bindView(View view, int i, int i2) {
                ((Page) view).bind(i2);
            }
        });
        fragmentSearchField.setCloseButtonOnClickListener(new Runnable() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CommunitySheet.this.lambda$new$0();
            }
        });
        this.pendingRequestsList.loadNext();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j, 0, true);
        Bulletin.addDelegate((FrameLayout) this.containerView, new Bulletin.Delegate() { // from class: org.telegram.ui.community.CommunitySheet.6
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
                return AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(60.0f);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(this.containerView, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets;
                onApplyWindowInsets = CommunitySheet.this.onApplyWindowInsets(view, windowInsetsCompat);
                return onApplyWindowInsets;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.communityPage.listView.layoutManager.scrollToPositionWithOffset(1, this.systemInsets.top);
        this.animatorSearchFieldVisible.setValue(false, true);
        this.animatorSearchResultVisible.setValue(false, true);
        setAllowNestedScroll(true);
        AndroidUtilities.hideKeyboard(this.searchView.editText);
        this.searchView.editText.clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillItemsCommunity(ArrayList arrayList, UniversalAdapter universalAdapter) {
        String formatPluralString;
        arrayList.add(UItem.asSpace(99, Math.min(AndroidUtilities.statusBarHeight + AndroidUtilities.dp(176.0f), (int) (AndroidUtilities.displaySize.y * 0.25f))));
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(56.0f)));
        arrayList.add(UItem.asSwitchNoIcon(101, LocaleController.getString(R.string.CommunityShowAsOneChat)).setChecked(this.collapsedInDialogs));
        arrayList.add(UItem.asShadow(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        if (this.pendingRequestsList.isSingle()) {
            arrayList.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            this.pendingRequestsList.fillItems(arrayList);
            arrayList.add(UItem.asSpace(5, AndroidUtilities.dp(14.33f)));
        } else if (this.pendingRequestsList.getTotalCount() > 0) {
            int totalCount = this.pendingRequestsList.getTotalCount();
            int unreadCount = this.pendingRequestsList.getUnreadCount();
            IconBackgroundColors iconBackgroundColors = IconBackgroundColors.BLUE_ALT;
            int i = R.drawable.filled_requests_24;
            if (totalCount == unreadCount) {
                formatPluralString = LocaleController.getString(R.string.CommunityPendingRequests);
            } else {
                formatPluralString = LocaleController.formatPluralString("CommunityPendingRequestsRow", totalCount, new Object[0]);
            }
            arrayList.add(CommunityRequestsCell.Factory.of(100, iconBackgroundColors, i, formatPluralString, unreadCount > 0 ? Integer.toString(unreadCount) : null, true));
            arrayList.add(UItem.asSpace(5, AndroidUtilities.dp(14.33f)));
        }
        CommunityUtils.fillLinkedPeers(this.currentAccount, arrayList, this.communityId, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillItemsRequests(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asSpace(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(48.0f)));
        if (ChatObject.canBlockUsers(this.currentChat)) {
            arrayList.add(UItem.asShadow(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new Runnable() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    CommunitySheet.this.lambda$fillItemsRequests$1();
                }
            }), true)));
        } else {
            arrayList.add(UItem.asShadow(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
        }
        arrayList.add(UItem.asCustom(2, this.fakeAnchorView));
        arrayList.add(UItem.asHeader(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", this.pendingRequestsList.getTotalCount(), new Object[0])));
        this.pendingRequestsList.fillItems(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillItemsRequests$1() {
        Bundle bundle = new Bundle();
        bundle.putLong("community_id", this.communityId);
        this.parentFragment.presentFragment(new CommunityEditActivity(bundle));
        lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillItemsChatsToAdd(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asSpace(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(56.0f)));
        ArrayList arrayList2 = this.chatsToAddToCommunity;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(UItem.asProfileCell((TLRPC.Chat) it.next()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClickChatToAdd(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            final TLRPC.Chat chat = (TLRPC.Chat) obj;
            new CommunityAddOptionsSheet(getContext(), this.currentChat, -chat.id, new Utilities.Callback() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda6
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    CommunitySheet.this.lambda$onClickChatToAdd$2(chat, (Boolean) obj2);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClickChatToAdd$2(TLRPC.Chat chat, Boolean bool) {
        linkToCommunity(chat, this.communityId, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClickCommunity(UItem uItem, View view, int i, float f, float f2) {
        long j;
        TLRPC.Chat chat;
        int i2;
        if (checkPendingRequestClick(uItem)) {
            return;
        }
        int i3 = uItem.id;
        boolean z = false;
        if (i3 == 101) {
            this.collapsedInDialogs = !this.collapsedInDialogs;
            MessagesController.getInstance(this.currentAccount).toggleCommunityCollapsedInDialogs(this.communityId, this.collapsedInDialogs);
            if (view instanceof TextCheckCell2) {
                ((TextCheckCell2) view).getCheckBox().setChecked(this.collapsedInDialogs, true);
                return;
            } else {
                this.communityPage.listView.adapter.update(false);
                return;
            }
        }
        if (i3 == 100) {
            this.viewPager.scrollToPosition(1);
            this.pendingRequestsList.markAsViewed();
            return;
        }
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) obj;
            z = ChatObject.isChannelAndNotMegaGroup(chat);
            j = -chat.id;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                return;
            }
            j = ((TLRPC.User) obj).id;
            chat = null;
        }
        TLRPC.Chat chat2 = chat;
        CommunityChatType communityChatType = CommunityUtils.getCommunityChatType(this.currentAccount, j);
        if (communityChatType == CommunityChatType.YouAreIn || communityChatType == CommunityChatType.YouCanView) {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment instanceof ChatActivity) {
                TLRPC.Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
                TLRPC.User currentUser = ((ChatActivity) this.parentFragment).getCurrentUser();
                if ((currentChat != null && currentChat.id == (-j)) || (currentUser != null && currentUser.id == j)) {
                    lambda$new$0();
                    return;
                }
            }
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            if (ChatObject.isForum(chat2)) {
                if (ChatObject.areTabsEnabled(chat2)) {
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(j, MessagesController.getInstance(this.currentAccount).getForumLastTopicId(chat2.id)));
                    this.parentFragment.presentFragment(chatActivity);
                } else {
                    this.parentFragment.presentFragment(new TopicsFragment(bundle));
                }
            } else {
                this.parentFragment.presentFragment(new ChatActivity(bundle));
            }
            lambda$new$0();
            return;
        }
        if (communityChatType == CommunityChatType.YouCanSendJoinRequest) {
            new JoinGroupAlert(getContext(), chat2, null, this.parentFragment, this.resourcesProvider).setBulletinFactory(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider)).show();
            return;
        }
        if (communityChatType == CommunityChatType.HiddenUnavailable) {
            BulletinFactory of = BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider);
            int i4 = R.raw.e_hand_2;
            if (z) {
                i2 = R.string.CommunityHiddenChannelUnavailable;
            } else {
                i2 = R.string.CommunityHiddenGroupUnavailable;
            }
            of.createSimpleBulletin(i4, LocaleController.getString(i2)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onLongClickCommunity(UItem uItem, View view, int i, float f, float f2) {
        boolean canRemoveBotFromCommunity;
        final boolean z;
        final long j;
        final boolean z2;
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            long j2 = -chat.id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, this.currentChat);
            z2 = isChannelAndNotMegaGroup;
            j = j2;
            z = false;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                return false;
            }
            TLRPC.User user = (TLRPC.User) obj;
            long j3 = user.id;
            boolean isBot = UserObject.isBot(user);
            canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, this.currentChat);
            z = isBot;
            j = j3;
            z2 = false;
        }
        if (!canRemoveBotFromCommunity) {
            return false;
        }
        ItemOptions makeOptions = ItemOptions.makeOptions(this.container, view);
        makeOptions.add(R.drawable.msg_cancel, (CharSequence) LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new Runnable() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CommunitySheet.this.lambda$onLongClickCommunity$5(z, z2, j);
            }
        });
        makeOptions.setScrimViewBackground(this.communityPage.listView.getClipBackground(view, true));
        makeOptions.show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClickCommunity$5(boolean z, boolean z2, final long j) {
        int i;
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z) {
            i = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z2) {
            i = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        AlertsCreator.showSimpleConfirmAlert(context, resourcesProvider, string, LocaleController.getString(i), LocaleController.getString(R.string.Remove), true, new Runnable() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                CommunitySheet.this.lambda$onLongClickCommunity$4(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClickCommunity$4(long j) {
        MessagesController.getInstance(this.currentAccount).unlinkCommunity(j, this.communityId, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda10
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunitySheet.this.lambda$onLongClickCommunity$3((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClickCommunity$3(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClickRequest(UItem uItem, View view, int i, float f, float f2) {
        checkPendingRequestClick(uItem);
    }

    private boolean checkPendingRequestClick(UItem uItem) {
        Object obj = uItem.object;
        if (!(obj instanceof CommunityPendingRequestCell.Data)) {
            return false;
        }
        final CommunityPendingRequestCell.Data data = (CommunityPendingRequestCell.Data) obj;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-data.dialogToAdd));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(data.dialogToAdd));
        if (user != null) {
            this.parentFragment.presentFragment(ChatActivity.of(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            this.parentFragment.presentFragment(ChatActivity.of(-chat.id));
            return true;
        }
        new CommunityInviteOnlySheet(getContext(), chat, data.requestFromUser, new Runnable() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CommunitySheet.this.lambda$checkPendingRequestClick$6(data);
            }
        }).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkPendingRequestClick$6(CommunityPendingRequestCell.Data data) {
        this.parentFragment.presentFragment(ChatActivity.of(data.requestFromUser.id));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.communityId) {
                this.chatInfo = chatFull;
                this.communityPage.listView.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.communityId));
            this.currentChat = chat;
            this.communityPage.actionBar.setTitle(DialogObject.getName(chat));
            this.communityPage.avatarImage.setForUserOrChat(this.currentChat, this.communityPage.avatarDrawable);
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    /* renamed from: onBackPressed */
    public void lambda$openCrafting$8() {
        if (this.viewPager.getCurrentPosition() > 0) {
            this.viewPager.scrollToPosition(0);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canDismissWithSwipe() {
        if (this.animatorSearchResultVisible.getValue()) {
            return false;
        }
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return ((Page) currentView).wasAtTop;
        }
        return true;
    }

    private void init(Context context) {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        Paint paint = this.backgroundPaint;
        int i = Theme.key_windowBackgroundGray;
        paint.setColor(Theme.getColor(i, this.resourcesProvider));
        fixNavigationBar(Theme.getColor(i, this.resourcesProvider));
        this.containerView = new ContainerView(context);
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) { // from class: org.telegram.ui.community.CommunitySheet.7
            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected boolean canScrollForward(MotionEvent motionEvent) {
                return false;
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected void onScrollEnd() {
                super.onScrollEnd();
                if (getCurrentPosition() == 1) {
                    CommunitySheet.this.communityPage.listView.adapter.update(false);
                }
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            public void onTabAnimationUpdate(boolean z) {
                ((BottomSheet) CommunitySheet.this).containerView.invalidate();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected boolean canScrollBackward(MotionEvent motionEvent) {
                return getCurrentPosition() != 2;
            }
        };
        this.viewPager = viewPagerFixed;
        int i2 = this.backgroundPaddingLeft;
        viewPagerFixed.setPadding(i2, 0, i2, 0);
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    class CommunityPage extends Page {
        private AvatarDrawable avatarDrawable;
        private BackupImageView avatarImage;

        public CommunityPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$CommunityPage$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    CommunitySheet.access$2900(CommunitySheet.this, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() { // from class: org.telegram.ui.community.CommunitySheet$CommunityPage$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback5
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$2800(CommunitySheet.this, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, new Utilities.Callback5Return() { // from class: org.telegram.ui.community.CommunitySheet$CommunityPage$$ExternalSyntheticLambda2
                @Override // org.telegram.messenger.Utilities.Callback5Return
                public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    Boolean lambda$new$2;
                    lambda$new$2 = CommunitySheet.CommunityPage.lambda$new$2(CommunitySheet.this, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                    return lambda$new$2;
                }
            }, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            this.listView.adapter.setApplyBackground(false);
            this.listView.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(60.0f));
            AndroidUtilities.removeFromParent(this.fadeView);
            this.contentView.addView(CommunitySheet.this.filteredSearchView, LayoutHelper.createFrameMatchParent());
            this.contentView.addView(this.listView, LayoutHelper.createFrameMatchParent());
            this.contentView.addView(CommunitySheet.this.communityPageFadeView, LayoutHelper.createFrameMatchParent());
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            this.actionBar.setTitleColor(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(DialogObject.getName(CommunitySheet.this.currentChat));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.community.CommunitySheet.CommunityPage.1
                @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
                public void onItemClick(int i) {
                    if (i == 2) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("community_id", CommunitySheet.this.communityId);
                        CommunitySheet.this.parentFragment.presentFragment(new CommunityEditActivity(bundle));
                        CommunitySheet.this.lambda$new$0();
                        return;
                    }
                    if (i == 3) {
                        CommunitySheet.this.animatorSearchFieldVisible.setValue(true, true);
                        CommunitySheet.this.animatorSearchResultVisible.setValue(true, true);
                        CommunitySheet.this.setAllowNestedScroll(false);
                        CommunitySheet.this.onTextChanged(null, true);
                        CommunitySheet.this.searchView.editText.getText().clear();
                        CommunitySheet.this.searchView.editText.requestFocus();
                        AndroidUtilities.showKeyboard(CommunitySheet.this.searchView.editText);
                    }
                }
            });
            this.avatarDrawable = new AvatarDrawable(CommunitySheet.this.currentChat);
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(9.0f));
            this.avatarImage.setForUserOrChat(CommunitySheet.this.currentChat, this.avatarDrawable);
            this.actionBar.addView(this.avatarImage, LayoutHelper.createFrame(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            this.contentView.addView(CommunitySheet.this.searchView, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
            ActionBarMenu createMenu = this.actionBar.createMenu();
            createMenu.setGlassMode(true);
            createMenu.setTranslationX(-AndroidUtilities.dp(7.0f));
            createMenu.addItem(3, R.drawable.outline_header_search);
            if (ChatObject.hasAdminRights(CommunitySheet.this.currentChat)) {
                createMenu.addItem(2, R.drawable.msg_download_settings);
            }
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView.setRound();
            if (ChatObject.canAddChatToCommunity(CommunitySheet.this.currentChat)) {
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.filled_add_album);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                buttonWithCounterView.setText(spannableStringBuilder);
            } else {
                buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
            }
            CommunitySheet.this.addChatToCommunityButton = buttonWithCounterView;
            CommunitySheet.this.addChatToCommunityButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.community.CommunitySheet$CommunityPage$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommunitySheet.CommunityPage.this.lambda$new$3(view);
                }
            });
            this.contentView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(12.0f)));
            afterInit();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$new$2(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
            return Boolean.valueOf(communitySheet.onLongClickCommunity(uItem, view, i, f, f2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(View view) {
            CommunitySheet.this.onAddChatToCommunityButtonClick();
        }

        @Override // org.telegram.ui.community.CommunitySheet.Page
        public float top() {
            return super.top() * FBool.not(CommunitySheet.this.animatorSearchResultVisible.getFloatValue());
        }

        @Override // org.telegram.ui.community.CommunitySheet.Page
        public void updateTops() {
            super.updateTops();
            CommunitySheet.this.searchView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight + AndroidUtilities.dp(8.0f), top() + AndroidUtilities.dp(4.0f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAddChatToCommunityButtonClick() {
        if (!ChatObject.canAddChatToCommunity(this.currentChat)) {
            lambda$new$0();
        } else {
            loadChatsToAddToCommunity();
        }
    }

    private void loadChatsToAddToCommunity() {
        if (this.addChatToCommunityButton.isLoading()) {
            return;
        }
        this.addChatToCommunityButton.setLoading(true);
        MessagesController.getInstance(this.currentAccount).fetchChatsToAddToCommunity(new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda3
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunitySheet.this.lambda$loadChatsToAddToCommunity$7((ArrayList) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadChatsToAddToCommunity$7(ArrayList arrayList, TLRPC.TL_error tL_error) {
        this.addChatToCommunityButton.setLoading(false);
        if (tL_error != null) {
            BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
            return;
        }
        if (arrayList != null) {
            this.chatsToAddToCommunity = arrayList;
            if (arrayList.isEmpty()) {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.info, LocaleController.getString(R.string.CommunityNoChatsToAdd)).show();
            } else {
                this.chatsPage.listView.adapter.update(false);
                this.viewPager.scrollToPosition(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ChatsToAddListPage extends Page {
        public ChatsToAddListPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$ChatsToAddListPage$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    CommunitySheet.access$3800(CommunitySheet.this, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() { // from class: org.telegram.ui.community.CommunitySheet$ChatsToAddListPage$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback5
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$3700(CommunitySheet.this, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, null, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            this.listView.adapter.setApplyBackground(false);
            this.listView.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(60.0f));
            this.contentView.addView(this.listView, 0, LayoutHelper.createFrame(-1, -1.0f));
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            this.actionBar.setTitleColor(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.community.CommunitySheet.ChatsToAddListPage.1
                @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
                public void onItemClick(int i) {
                    if (i == -1) {
                        CommunitySheet.this.communityPage.listView.adapter.update(false);
                        CommunitySheet.this.viewPager.scrollToPosition(0);
                    }
                }
            });
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView.setRound();
            buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.community.CommunitySheet$ChatsToAddListPage$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommunitySheet.ChatsToAddListPage.this.lambda$new$2(view);
                }
            });
            this.contentView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(12.0f)));
            afterInit();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(View view) {
            CommunitySheet.this.viewPager.scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class PendingRequestsPage extends Page {
        public PendingRequestsPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$PendingRequestsPage$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    CommunitySheet.access$5100(CommunitySheet.this, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() { // from class: org.telegram.ui.community.CommunitySheet$PendingRequestsPage$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback5
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$5000(CommunitySheet.this, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, null, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            this.listView.adapter.setApplyBackground(false);
            this.listView.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(60.0f));
            this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.community.CommunitySheet.PendingRequestsPage.1
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    CommunitySheet.this.pendingRequestsList.checkLoadNext(PendingRequestsPage.this.listView);
                }
            });
            this.contentView.addView(this.listView, 0, LayoutHelper.createFrame(-1, -1.0f));
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            ActionBar actionBar2 = this.actionBar;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            actionBar2.setTitleColor(CommunitySheet.this.getThemedColor(i));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.community.CommunitySheet.PendingRequestsPage.2
                @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
                public void onItemClick(int i2) {
                    if (i2 == -1) {
                        CommunitySheet.this.communityPage.listView.adapter.update(false);
                        CommunitySheet.this.viewPager.scrollToPosition(0);
                    }
                }
            });
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView.setNeutral();
            buttonWithCounterView.setColor(ColorUtils.blendARGB(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhite), CommunitySheet.this.getThemedColor(i), 0.125f));
            buttonWithCounterView.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
            buttonWithCounterView.setRound();
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.community.CommunitySheet$PendingRequestsPage$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommunitySheet.PendingRequestsPage.this.lambda$new$2(view);
                }
            });
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
            buttonWithCounterView2.setRound();
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.community.CommunitySheet$PendingRequestsPage$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommunitySheet.PendingRequestsPage.this.lambda$new$3(view);
                }
            });
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
            this.contentView.addView(linearLayout, LayoutHelper.createFrameMarginPx(-1, -2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
            afterInit();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2(View view) {
            CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(View view) {
            CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(true);
        }
    }

    private abstract class Page extends FrameLayout {
        protected ActionBar actionBar;
        protected final FrameLayout contentView;
        protected ChatActivityFadeView fadeView;
        protected UniversalRecyclerView listView;
        public int pageType;
        private boolean scrolling;
        public boolean wasAtBottom;
        public boolean wasAtTop;

        public Page(Context context) {
            super(context);
            FrameLayout frameLayout = new FrameLayout(context);
            this.contentView = frameLayout;
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setClipToPadding(true);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(getContext());
            this.fadeView = chatActivityFadeView;
            chatActivityFadeView.setupColorKey(Theme.key_windowBackgroundGray);
            this.fadeView.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
            this.fadeView.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            this.fadeView.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
            this.fadeView.setFadeHeightTop(AndroidUtilities.dp(20.0f), false);
            frameLayout.addView(this.fadeView, LayoutHelper.createFrameMatchParent());
        }

        protected void afterInit() {
            this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.community.CommunitySheet.Page.1
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i == 0) {
                        Page page = Page.this;
                        page.wasAtTop = page.atTop();
                        Page page2 = Page.this;
                        page2.wasAtBottom = page2.atBottom();
                    }
                    Page.this.scrolling = i != 0;
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() { // from class: org.telegram.ui.community.CommunitySheet.Page.2
                @Override // androidx.recyclerview.widget.SimpleItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
                public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
                    return true;
                }

                @Override // androidx.recyclerview.widget.DefaultItemAnimator
                protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                    Page.this.listView.invalidate();
                }

                @Override // androidx.recyclerview.widget.DefaultItemAnimator
                protected void onChangeAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                }

                @Override // androidx.recyclerview.widget.DefaultItemAnimator
                protected void onAddAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                }

                @Override // androidx.recyclerview.widget.DefaultItemAnimator
                protected void onRemoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                }
            };
            defaultItemAnimator.setDurations(350L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            this.listView.setItemAnimator(defaultItemAnimator);
        }

        public float top() {
            float f = AndroidUtilities.displaySize.y;
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(childAt);
                if (childViewHolder != null) {
                    UItem item = this.listView.adapter.getItem(childViewHolder.getAdapterPosition());
                    if (item != null && item.id != 99) {
                        f = Math.min(this.contentView.getPaddingTop() + childAt.getY(), f);
                    }
                }
            }
            return f;
        }

        public void bind(int i) {
            this.pageType = i;
        }

        public void updateTops() {
            float pVar = top();
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, pVar));
            }
        }

        public boolean atTop() {
            return !this.listView.canScrollVertically(-1);
        }

        public boolean atBottom() {
            return !this.listView.canScrollVertically(1);
        }
    }

    private class ContainerView extends FrameLayout {
        private final AnimatedFloat isActionBar;
        private final Path path;
        private float top;

        public ContainerView(Context context) {
            super(context);
            this.isActionBar = new AnimatedFloat(this, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.path = new Path();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            View[] viewPages = CommunitySheet.this.viewPager.getViewPages();
            this.top = 0.0f;
            for (View view : viewPages) {
                if (view != null) {
                    Page page = (Page) view;
                    this.top += page.top() * Utilities.clamp(1.0f - Math.abs(page.getTranslationX() / page.getMeasuredWidth()), 1.0f, 0.0f);
                    if (page.getVisibility() == 0) {
                        page.updateTops();
                    }
                }
            }
            float f = this.isActionBar.set(this.top <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f);
            this.top = (Math.max(AndroidUtilities.statusBarHeight, this.top) - (AndroidUtilities.statusBarHeight * f)) - (AndroidUtilities.dp(10.0f) * CommunitySheet.this.animatorSearchFieldVisible.getFloatValue());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((BottomSheet) CommunitySheet.this).backgroundPaddingLeft, this.top, getWidth() - ((BottomSheet) CommunitySheet.this).backgroundPaddingLeft, getHeight() + AndroidUtilities.dp(8.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, f);
            canvas.drawRoundRect(rectF, lerp, lerp, CommunitySheet.this.backgroundPaint);
            canvas.save();
            this.path.rewind();
            this.path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.top) {
                CommunitySheet.this.lambda$new$0();
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
        }
    }

    private void linkToCommunity(TLRPC.Chat chat, final long j, final boolean z) {
        long j2 = -chat.id;
        final boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j2, null, new MessagesStorage.LongCallback() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda7
                @Override // org.telegram.messenger.MessagesStorage.LongCallback
                public final void run(long j3) {
                    CommunitySheet.this.lambda$linkToCommunity$8(alertDialog, j, z, j3);
                }
            });
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j2, j, z, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda8
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunitySheet.this.lambda$linkToCommunity$9(isChannelAndNotMegaGroup, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkToCommunity$8(AlertDialog alertDialog, long j, boolean z, long j2) {
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        linkToCommunity(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2)), j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkToCommunity$9(boolean z, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                onLinkSuccess(2, z);
                return;
            } else {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
                return;
            }
        }
        onLinkSuccess(1, z);
    }

    private void onLinkSuccess(int i, boolean z) {
        CommunityUtils.showCommunityLinkSuccessToast(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), i, z);
        this.viewPager.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTextChanged(String str) {
        onTextChanged(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTextChanged(String str, boolean z) {
        boolean z2 = TextUtils.isEmpty(this.lastSearchString) ? true : z;
        this.lastSearchString = str;
        this.filteredSearchView.search(0L, this.communityId, 0L, 0L, null, false, str, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.systemAndImeInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime());
        this.systemInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        this.filteredSearchView.setPagesPaddings(this.systemAndImeInsets.top + AndroidUtilities.dp(56.0f), this.systemAndImeInsets.bottom);
        this.communityPageFadeView.invalidate();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 1) {
            float not = FBool.not(f);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, not);
            this.communityPage.actionBar.setAlpha(not);
            this.communityPage.actionBar.setScaleX(lerp);
            this.communityPage.actionBar.setScaleY(lerp);
            this.communityPage.actionBar.setVisibility(not > 0.0f ? 0 : 8);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f);
            this.searchView.setAlpha(f);
            this.searchView.setScaleX(lerp2);
            this.searchView.setScaleY(lerp2);
            this.searchView.setVisibility(f > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            return;
        }
        if (i == 2) {
            float not2 = FBool.not(f);
            this.communityPage.listView.setAlpha(not2);
            this.communityPage.listView.setVisibility(not2 > 0.0f ? 0 : 8);
            this.addChatToCommunityButton.setAlpha(not2);
            this.addChatToCommunityButton.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, not2));
            this.addChatToCommunityButton.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, not2));
            this.addChatToCommunityButton.setVisibility(not2 > 0.0f ? 0 : 8);
            this.filteredSearchView.setAlpha(f);
            this.filteredSearchView.setVisibility(f > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.communityPageFadeView.invalidate();
        }
    }

    private class FadeView extends View {
        public FadeView(Context context) {
            super(context);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float floatValue = CommunitySheet.this.animatorSearchResultVisible.getFloatValue();
            CommunitySheet.this.gradientProtectionDrawableTop.setInsets(0, CommunitySheet.this.systemInsets.top + AndroidUtilities.dp(42.0f), 0, 0);
            CommunitySheet.this.gradientProtectionDrawableTop.setBounds(0, 0, getWidth(), CommunitySheet.this.systemInsets.top + AndroidUtilities.dp(56.0f));
            GradientProtectionDrawable gradientProtectionDrawable = CommunitySheet.this.gradientProtectionDrawableTop;
            CommunitySheet communitySheet = CommunitySheet.this;
            int i = Theme.key_windowBackgroundGray;
            gradientProtectionDrawable.setColor(Theme.multAlpha(communitySheet.getThemedColor(i), AndroidUtilities.lerp(1.0f, 0.8f, floatValue)));
            CommunitySheet.this.gradientProtectionDrawableTop.draw(canvas);
            int lerp = AndroidUtilities.lerp(CommunitySheet.this.systemInsets.bottom + AndroidUtilities.dp(48.0f), 0, floatValue);
            int lerp2 = CommunitySheet.this.systemInsets.bottom + AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, floatValue);
            float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(CommunitySheet.this.systemInsets.bottom), floatValue);
            CommunitySheet.this.gradientProtectionDrawableBottom.setInsets(0, 0, 0, lerp);
            CommunitySheet.this.gradientProtectionDrawableBottom.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
            CommunitySheet.this.gradientProtectionDrawableBottom.setColor(Theme.multAlpha(CommunitySheet.this.getThemedColor(i), lerp3));
            CommunitySheet.this.gradientProtectionDrawableBottom.draw(canvas);
        }
    }
}
