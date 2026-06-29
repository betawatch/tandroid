package org.telegram.ui.community;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
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
import org.telegram.ui.Components.IconBackgroundColors;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.cells.CommunityRequestsCell;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;

/* loaded from: classes3.dex */
public class CommunitySheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private ButtonWithCounterView addChatToCommunityButton;
    private final Paint backgroundPaint;
    private TLRPC.ChatFull chatInfo;
    private final ChatsToAddListPage chatsPage;
    private ArrayList chatsToAddToCommunity;
    private boolean collapsedInDialogs;
    private final long communityId;
    private final CommunityPage communityPage;
    private TLRPC.Chat currentChat;
    private final View fakeAnchorView;
    private final BaseFragment parentFragment;
    private CommunityUtils.PendingRequests pendingRequestsList;
    private final PendingRequestsPage requestsPage;
    private ViewPagerFixed viewPager;

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$1800(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickCommunity(uItem, view, i, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$1900(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsCommunity(arrayList, universalAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$2700(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickChatToAdd(uItem, view, i, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$2800(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsChatsToAdd(arrayList, universalAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$3800(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickRequest(uItem, view, i, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$3900(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsRequests(arrayList, universalAdapter);
    }

    public CommunitySheet(final BaseFragment baseFragment, long j) {
        super(baseFragment.getContext(), true, true, baseFragment.getResourceProvider());
        this.backgroundPaint = new Paint(1);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.parentFragment = baseFragment;
        Context context = baseFragment.getContext();
        init(context);
        this.fakeAnchorView = new View(getContext());
        Context context2 = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        CommunityUtils.PendingRequests pendingRequests = new CommunityUtils.PendingRequests(context2, resourcesProvider, BulletinFactory.of((FrameLayout) this.containerView, resourcesProvider), this.currentAccount, j);
        this.pendingRequestsList = pendingRequests;
        pendingRequests.setDelegate(new CommunityUtils.PendingRequests.Delegate() { // from class: org.telegram.ui.community.CommunitySheet.1
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
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        this.requestsPage = new PendingRequestsPage(context);
        this.communityPage = new CommunityPage(context);
        this.chatsPage = new ChatsToAddListPage(context);
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter() { // from class: org.telegram.ui.community.CommunitySheet.2
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
        this.pendingRequestsList.loadNext();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j, 0, true);
        Bulletin.addDelegate((FrameLayout) this.containerView, new Bulletin.Delegate() { // from class: org.telegram.ui.community.CommunitySheet.3
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
            arrayList.add(UItem.asShadow(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new Runnable() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CommunitySheet.this.lambda$fillItemsRequests$0();
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
    public /* synthetic */ void lambda$fillItemsRequests$0() {
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
            new CommunityAddOptionsSheet(getContext(), this.currentChat, chat, new Utilities.Callback() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda4
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    CommunitySheet.this.lambda$onClickChatToAdd$1(chat, (Boolean) obj2);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClickChatToAdd$1(TLRPC.Chat chat, Boolean bool) {
        linkToCommunity(chat, this.communityId, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClickCommunity(UItem uItem, View view, int i, float f, float f2) {
        TLRPC.Chat currentChat;
        if (checkPendingRequestClick(uItem)) {
            return;
        }
        int i2 = uItem.id;
        if (i2 == 101) {
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
        if (i2 == 100) {
            this.viewPager.scrollToPosition(1);
            this.pendingRequestsList.markAsViewed();
            return;
        }
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            CommunityChatType communityChatType = CommunityUtils.getCommunityChatType(this.currentAccount, chat);
            if (communityChatType == CommunityChatType.YouAreIn || communityChatType == CommunityChatType.YouCanView) {
                BaseFragment baseFragment = this.parentFragment;
                if ((baseFragment instanceof ChatActivity) && (currentChat = ((ChatActivity) baseFragment).getCurrentChat()) != null && currentChat.id == chat.id) {
                    lambda$new$0();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", chat.id);
                if (ChatObject.isForum(chat)) {
                    if (ChatObject.areTabsEnabled(chat)) {
                        ChatActivity chatActivity = new ChatActivity(bundle);
                        ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(-chat.id, MessagesController.getInstance(this.currentAccount).getForumLastTopicId(chat.id)));
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
                new JoinGroupAlert(getContext(), chat, null, this.parentFragment, this.resourcesProvider).setBulletinFactory(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider)).show();
            } else if (communityChatType == CommunityChatType.HiddenUnavailable) {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.e_hand_2, LocaleController.getString(R.string.CommunityHiddenGroupUnavailable)).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onLongClickCommunity(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        boolean z = false;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            final long j = -chat.id;
            boolean canRemoveChatFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, this.currentChat);
            if (!canRemoveChatFromCommunity) {
                return false;
            }
            ItemOptions makeOptions = ItemOptions.makeOptions(this.container, view);
            z = true;
            if (canRemoveChatFromCommunity) {
                makeOptions.add(R.drawable.msg_cancel, (CharSequence) LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new Runnable() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CommunitySheet.this.lambda$onLongClickCommunity$4(j);
                    }
                });
            }
            makeOptions.setScrimViewBackground(this.communityPage.listView.getClipBackground(view, true));
            makeOptions.show();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClickCommunity$4(final long j) {
        AlertsCreator.showSimpleConfirmAlert(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(R.string.CommunityMenuRemoveFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new Runnable() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                CommunitySheet.this.lambda$onLongClickCommunity$3(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClickCommunity$3(long j) {
        MessagesController.getInstance(this.currentAccount).unlinkCommunity(j, this.communityId, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda8
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunitySheet.this.lambda$onLongClickCommunity$2((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClickCommunity$2(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
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
        TLRPC.Chat chat = data.chatToAdd;
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            this.parentFragment.presentFragment(ChatActivity.of(-chat.id));
            return true;
        }
        new CommunityInviteOnlySheet(getContext(), chat, data.requestFromUser, new Runnable() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CommunitySheet.this.lambda$checkPendingRequestClick$5(data);
            }
        }).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkPendingRequestClick$5(CommunityPendingRequestCell.Data data) {
        this.parentFragment.presentFragment(ChatActivity.of(data.requestFromUser.id));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.communityId) {
                this.chatInfo = chatFull;
                this.communityPage.listView.adapter.update(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    /* renamed from: onBackPressed */
    public void lambda$openCrafting$8() {
        if (this.viewPager.getCurrentPosition() > 0) {
            this.viewPager.scrollToPosition(r0.getCurrentPosition() - 1);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canDismissWithSwipe() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return ((Page) currentView).wasAtTop;
        }
        return true;
    }

    private void init(Context context) {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        Paint paint = this.backgroundPaint;
        int i = Theme.key_windowBackgroundGray;
        paint.setColor(Theme.getColor(i, this.resourcesProvider));
        fixNavigationBar(Theme.getColor(i, this.resourcesProvider));
        this.containerView = new ContainerView(context);
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) { // from class: org.telegram.ui.community.CommunitySheet.4
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
        super.dismissInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    class CommunityPage extends Page {
        private BackupImageView avatarImage;

        public CommunityPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$CommunityPage$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    CommunitySheet.access$1900(CommunitySheet.this, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() { // from class: org.telegram.ui.community.CommunitySheet$CommunityPage$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback5
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$1800(CommunitySheet.this, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
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
            this.contentView.addView(this.listView, 0, LayoutHelper.createFrame(-1, -1.0f));
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
                    }
                }
            });
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(9.0f));
            this.avatarImage.setForUserOrChat(CommunitySheet.this.currentChat, new AvatarDrawable(CommunitySheet.this.currentChat));
            this.actionBar.addView(this.avatarImage, LayoutHelper.createFrame(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            ActionBarMenu createMenu = this.actionBar.createMenu();
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
        MessagesController.getInstance(this.currentAccount).fetchChatsToAddToCommunity(new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda1
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunitySheet.this.lambda$loadChatsToAddToCommunity$6((ArrayList) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadChatsToAddToCommunity$6(ArrayList arrayList, TLRPC.TL_error tL_error) {
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
                    CommunitySheet.access$2800(CommunitySheet.this, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() { // from class: org.telegram.ui.community.CommunitySheet$ChatsToAddListPage$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback5
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$2700(CommunitySheet.this, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
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
                    CommunitySheet.access$3900(CommunitySheet.this, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() { // from class: org.telegram.ui.community.CommunitySheet$PendingRequestsPage$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback5
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$3800(CommunitySheet.this, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
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
            this.actionBar.setTitleColor(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.community.CommunitySheet.PendingRequestsPage.2
                @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
                public void onItemClick(int i) {
                    if (i == -1) {
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
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, top()));
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
            this.top = Math.max(AndroidUtilities.statusBarHeight, this.top) - (AndroidUtilities.statusBarHeight * f);
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
        if (!ChatObject.isChannel(chat)) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j2, null, new MessagesStorage.LongCallback() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda5
                @Override // org.telegram.messenger.MessagesStorage.LongCallback
                public final void run(long j3) {
                    CommunitySheet.this.lambda$linkToCommunity$7(alertDialog, j, z, j3);
                }
            });
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j2, j, z, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunitySheet$$ExternalSyntheticLambda6
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunitySheet.this.lambda$linkToCommunity$8((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkToCommunity$7(AlertDialog alertDialog, long j, boolean z, long j2) {
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        linkToCommunity(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2)), j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkToCommunity$8(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                onLinkSuccess(2);
                return;
            } else {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
                return;
            }
        }
        onLinkSuccess(1);
    }

    private void onLinkSuccess(int i) {
        CommunityUtils.showCommunityLinkSuccessToast(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), i);
        this.viewPager.scrollToPosition(0);
    }
}
