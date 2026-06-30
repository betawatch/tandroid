package org.telegram.ui.community;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityChatsToAddSheet;

/* loaded from: classes3.dex */
public abstract class CommunityUtils {
    public static void fillLinkedPeers(int i, ArrayList arrayList, long j, boolean z) {
        boolean z2;
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i).buildCommunityPeers(j);
        if (buildCommunityPeers == null) {
            return;
        }
        if (buildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z2 = false;
        } else {
            arrayList.add(UItem.asHeader(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
            Iterator<MessagesController.CommunityPeerDialog> it = buildCommunityPeers.chatsYouAreIn.iterator();
            while (it.hasNext()) {
                arrayList.add(DialogCellFactory.asCell(it.next().chat));
            }
            z2 = z;
        }
        if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
            if (z2) {
                arrayList.add(UItem.asSpace(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(UItem.asHeader(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
            Iterator<MessagesController.CommunityPeerDialog> it2 = buildCommunityPeers.chatsYouCanView.iterator();
            while (it2.hasNext()) {
                arrayList.add(DialogCellFactory.asCell(it2.next().chat));
            }
            z2 = z;
        }
        if (buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
            z = z2;
        } else {
            if (z2) {
                arrayList.add(UItem.asSpace(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(UItem.asHeader(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
            Iterator<MessagesController.CommunityPeerDialog> it3 = buildCommunityPeers.chatsYouCanJoin.iterator();
            while (it3.hasNext()) {
                arrayList.add(DialogCellFactory.asCell(it3.next().chat));
            }
        }
        if (buildCommunityPeers.chatsOther.isEmpty()) {
            return;
        }
        if (z) {
            arrayList.add(UItem.asSpace(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(UItem.asHeader(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        Iterator<MessagesController.CommunityPeerDialog> it4 = buildCommunityPeers.chatsOther.iterator();
        while (it4.hasNext()) {
            arrayList.add(DialogCellFactory.asCell(it4.next().chat));
        }
    }

    public static void fillPendingRequests(int i, ArrayList arrayList, ArrayList arrayList2, LongSparseArray longSparseArray, CommunityPendingRequestCell.ClickDelegate clickDelegate) {
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList2.get(i2);
            long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
            if (longSparseArray == null || !longSparseArray.containsKey(peerDialogId)) {
                long j = -peerDialogId;
                arrayList.add(CommunityPendingRequestCell.Factory.asPendingRequest(MessagesController.getInstance(i).getChat(Long.valueOf(j)), MessagesController.getInstance(i).getChatFull(j), MessagesController.getInstance(i).getUser(Long.valueOf(communityPeerRequest.requested_by)), !communityPeerRequest.visible, clickDelegate, i2 < size + (-1)));
            }
            i2++;
        }
    }

    public static class PendingRequests implements CommunityPendingRequestCell.ClickDelegate {
        private final BulletinFactory bulletinFactory;
        private TLRPC.Chat community;
        private final long communityId;
        private final Context context;
        private final int currentAccount;
        private Delegate delegate;
        private Runnable doCommitRunnable;
        private boolean finished;
        private long lastViewTime;
        private boolean loading;
        private String nextOffset;
        private AlertDialog progressDialog;
        private int reqId;
        private final Theme.ResourcesProvider resourcesProvider;
        private int totalCount;
        private int unreadPendingRequests;
        private final LongSparseArray hiddenJoinRequests = new LongSparseArray();
        private ArrayList pendingRequests = new ArrayList();

        public interface Delegate {
            void close();

            void onClickGroupOwner(long j);

            void updateAdapter();
        }

        public PendingRequests(Context context, Theme.ResourcesProvider resourcesProvider, BulletinFactory bulletinFactory, int i, long j) {
            this.context = context;
            this.resourcesProvider = resourcesProvider;
            this.bulletinFactory = bulletinFactory;
            this.currentAccount = i;
            this.communityId = j;
            this.community = MessagesController.getInstance(i).getChat(Long.valueOf(j));
            this.lastViewTime = MessagesController.getMainSettings(i).getLong("community_requests_last_view_time_" + j, 0L);
        }

        public void setDelegate(Delegate delegate) {
            this.delegate = delegate;
        }

        public boolean isSingle() {
            ArrayList arrayList;
            return this.finished && this.totalCount == 1 && (arrayList = this.pendingRequests) != null && arrayList.size() == 1;
        }

        public void fillItems(ArrayList arrayList) {
            ArrayList arrayList2 = this.pendingRequests;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                return;
            }
            CommunityUtils.fillPendingRequests(this.currentAccount, arrayList, this.pendingRequests, this.hiddenJoinRequests, this);
            if (this.finished) {
                return;
            }
            arrayList.add(UItem.asFlicker(29));
        }

        public boolean isFinished() {
            return this.finished;
        }

        public int getTotalCount() {
            return this.totalCount;
        }

        public int getUnreadCount() {
            return this.unreadPendingRequests;
        }

        public void markAsViewed() {
            long currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            this.lastViewTime = currentTime;
            MessagesController.getMainSettings(this.currentAccount).edit().putLong("community_requests_last_view_time_" + this.communityId, currentTime).apply();
            calcUnreadPendingRequests();
        }

        private void calcUnreadPendingRequests() {
            this.unreadPendingRequests = 0;
            ArrayList arrayList = this.pendingRequests;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!this.hiddenJoinRequests.containsKey(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.pendingRequests.get(i)).peer))) {
                    if (r2.date <= this.lastViewTime) {
                        return;
                    } else {
                        this.unreadPendingRequests++;
                    }
                }
            }
        }

        public void loadNext() {
            if (this.loading || this.finished || !ChatObject.canUserDoAdminAction(this.community, 27)) {
                return;
            }
            this.loading = true;
            MessagesController.getInstance(this.currentAccount).fetchCommunityPendingJoinRequests(this.communityId, this.nextOffset, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunityUtils$PendingRequests$$ExternalSyntheticLambda3
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    CommunityUtils.PendingRequests.this.lambda$loadNext$0((TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadNext$0(TL_communities.PeerLinkRequests peerLinkRequests, TLRPC.TL_error tL_error) {
            this.loading = false;
            if (peerLinkRequests != null) {
                ArrayList arrayList = this.pendingRequests;
                if (arrayList == null) {
                    this.pendingRequests = new ArrayList(peerLinkRequests.requests);
                } else {
                    arrayList.addAll(peerLinkRequests.requests);
                }
                String str = peerLinkRequests.next_offset;
                this.nextOffset = str;
                this.totalCount = peerLinkRequests.total_count;
                this.finished = str == null;
                calcUnreadPendingRequests();
                Delegate delegate = this.delegate;
                if (delegate != null) {
                    delegate.updateAdapter();
                }
            }
        }

        public void checkLoadNext(UniversalRecyclerView universalRecyclerView) {
            if (this.loading || this.finished || universalRecyclerView.layoutManager.findLastVisibleItemPosition() + 10 <= universalRecyclerView.adapter.getItemCount()) {
                return;
            }
            loadNext();
        }

        public void commit() {
            Runnable runnable = this.doCommitRunnable;
            if (runnable != null) {
                runnable.run();
            }
            this.doCommitRunnable = null;
        }

        private void onResolveJoinRequest(final long j, final boolean z) {
            int i;
            int i2;
            this.hiddenJoinRequests.put(j, null);
            this.totalCount--;
            calcUnreadPendingRequests();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateAdapter();
            }
            if (z) {
                i = R.string.CommunityRequestApprovedToast;
            } else {
                i = R.string.CommunityRequestDeclinedToast;
            }
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i, DialogObject.getShortName(this.currentAccount, j)));
            commit();
            this.doCommitRunnable = new Runnable() { // from class: org.telegram.ui.community.CommunityUtils$PendingRequests$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    CommunityUtils.PendingRequests.this.lambda$onResolveJoinRequest$2(j, z);
                }
            };
            Bulletin.UsersLayout usersLayout = new Bulletin.UsersLayout(this.context, false, this.resourcesProvider);
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (chat != null) {
                usersLayout.avatarsImageView.setCount(1);
                usersLayout.avatarsImageView.setObject(0, UserConfig.selectedAccount, chat);
                i2 = 1;
            } else {
                i2 = 0;
            }
            usersLayout.avatarsImageView.setTranslationX(AndroidUtilities.dp(7.0f));
            usersLayout.avatarsImageView.setScaleX(1.333f);
            usersLayout.avatarsImageView.setScaleY(1.333f);
            usersLayout.avatarsImageView.commitTransition(false);
            usersLayout.textView.setSingleLine(false);
            usersLayout.textView.setMaxLines(2);
            usersLayout.textView.setTextSize(1, 14.0f);
            usersLayout.textView.setText(replaceTags);
            if (usersLayout.textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(74 - ((3 - i2) * 12));
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) usersLayout.textView.getLayoutParams()).leftMargin = dp;
                }
            }
            if (LocaleController.isRTL) {
                usersLayout.avatarsImageView.setTranslationX(AndroidUtilities.dp(32 - ((i2 - 1) * 12)));
            }
            usersLayout.setButton(new Bulletin.UndoButton(this.context, true, false, this.resourcesProvider).setText(LocaleController.getString(R.string.UndoNoCaps)).setUndoAction(new Runnable() { // from class: org.telegram.ui.community.CommunityUtils$PendingRequests$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    CommunityUtils.PendingRequests.this.lambda$onResolveJoinRequest$3(j);
                }
            }).setDelayedAction(this.doCommitRunnable));
            this.bulletinFactory.create(usersLayout, 5000).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResolveJoinRequest$2(long j, boolean z) {
            this.doCommitRunnable = null;
            this.hiddenJoinRequests.remove(j);
            ArrayList arrayList = this.pendingRequests;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.pendingRequests.get(size)).peer) == j) {
                        this.pendingRequests.remove(size);
                    }
                }
            }
            calcUnreadPendingRequests();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateAdapter();
            }
            MessagesController.getInstance(this.currentAccount).resolveCommunityJoinPendingRequest(this.communityId, j, !z, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunityUtils$PendingRequests$$ExternalSyntheticLambda6
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    CommunityUtils.PendingRequests.this.lambda$onResolveJoinRequest$1((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResolveJoinRequest$1(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
            if (tL_error != null) {
                this.bulletinFactory.showForError(tL_error);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResolveJoinRequest$3(long j) {
            this.doCommitRunnable = null;
            this.hiddenJoinRequests.remove(j);
            this.totalCount++;
            calcUnreadPendingRequests();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateAdapter();
            }
        }

        public void onResolveAllJoinRequests(boolean z) {
            onResolveAllJoinRequests(z, true);
        }

        private void onResolveAllJoinRequests(final boolean z, boolean z2) {
            TextView textView;
            if (this.progressDialog == null && this.reqId == 0) {
                if (z2) {
                    AlertDialog createSimpleConfirmAlert = AlertsCreator.createSimpleConfirmAlert(this.context, this.resourcesProvider, LocaleController.getString(z ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.totalCount, new Object[0])), LocaleController.getString(z ? R.string.Add : R.string.Decline), new Runnable() { // from class: org.telegram.ui.community.CommunityUtils$PendingRequests$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommunityUtils.PendingRequests.this.lambda$onResolveAllJoinRequests$4(z);
                        }
                    });
                    createSimpleConfirmAlert.show();
                    if (z || (textView = (TextView) createSimpleConfirmAlert.getButton(-1)) == null) {
                        return;
                    }
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                commit();
                AlertDialog alertDialog = new AlertDialog(this.context, 3, this.resourcesProvider);
                this.progressDialog = alertDialog;
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.community.CommunityUtils$PendingRequests$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        CommunityUtils.PendingRequests.this.lambda$onResolveAllJoinRequests$5(dialogInterface);
                    }
                });
                this.progressDialog.showDelayed(500L);
                this.reqId = MessagesController.getInstance(this.currentAccount).resolveCommunityAllJoinPendingRequests(this.communityId, !z, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunityUtils$PendingRequests$$ExternalSyntheticLambda2
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        CommunityUtils.PendingRequests.this.lambda$onResolveAllJoinRequests$6((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResolveAllJoinRequests$4(boolean z) {
            onResolveAllJoinRequests(z, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResolveAllJoinRequests$5(DialogInterface dialogInterface) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.progressDialog = null;
            this.reqId = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResolveAllJoinRequests$6(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
            this.progressDialog.dismiss();
            this.progressDialog = null;
            this.reqId = 0;
            if (tL_error != null) {
                this.bulletinFactory.showForError(tL_error);
                return;
            }
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.close();
            }
        }

        @Override // org.telegram.ui.community.cells.CommunityPendingRequestCell.ClickDelegate
        public void onClickApprove(long j) {
            onResolveJoinRequest(j, true);
        }

        @Override // org.telegram.ui.community.cells.CommunityPendingRequestCell.ClickDelegate
        public void onClickDecline(long j) {
            onResolveJoinRequest(j, false);
        }

        @Override // org.telegram.ui.community.cells.CommunityPendingRequestCell.ClickDelegate
        public void onClickGroupOwner(long j) {
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onClickGroupOwner(j);
            }
        }
    }

    public static void showChatsToAddToCommunity(final AlertDialog[] alertDialogArr, final BaseFragment baseFragment, final int i, final TLRPC.Chat chat) {
        if (alertDialogArr[0] != null) {
            return;
        }
        final int fetchChatsToAddToCommunity = MessagesController.getInstance(i).fetchChatsToAddToCommunity(new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunityUtils.lambda$showChatsToAddToCommunity$0(alertDialogArr, baseFragment, i, chat, (ArrayList) obj, (TLRPC.TL_error) obj2);
            }
        });
        ConnectionsManager.getInstance(i).bindRequestToGuid(fetchChatsToAddToCommunity, baseFragment.getClassGuid());
        AlertDialog alertDialog = new AlertDialog(baseFragment.getContext(), 3);
        alertDialogArr[0] = alertDialog;
        alertDialog.showDelayed(500L);
        alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                CommunityUtils.lambda$showChatsToAddToCommunity$1(i, fetchChatsToAddToCommunity, alertDialogArr, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showChatsToAddToCommunity$0(AlertDialog[] alertDialogArr, BaseFragment baseFragment, int i, TLRPC.Chat chat, ArrayList arrayList, TLRPC.TL_error tL_error) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
            alertDialogArr[0] = null;
        }
        if (tL_error != null) {
            BulletinFactory.of(baseFragment).showForError(tL_error);
        } else if (arrayList != null) {
            if (arrayList.isEmpty()) {
                BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.info, LocaleController.getString(R.string.CommunityNoChatsToAdd)).show();
            } else {
                showChatsToAddSheet(baseFragment, i, chat, arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showChatsToAddToCommunity$1(int i, int i2, AlertDialog[] alertDialogArr, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
        alertDialogArr[0] = null;
    }

    private static void showChatsToAddSheet(final BaseFragment baseFragment, final int i, final TLRPC.Chat chat, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            baseFragment.showDialog(new CommunityChatsToAddSheet(baseFragment.getContext(), arrayList, new Utilities.Callback() { // from class: org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda2
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    CommunityUtils.lambda$showChatsToAddSheet$3(BaseFragment.this, chat, i, (TLRPC.Chat) obj);
                }
            }));
        } else {
            BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.info, "").show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showChatsToAddSheet$3(final BaseFragment baseFragment, final TLRPC.Chat chat, final int i, final TLRPC.Chat chat2) {
        baseFragment.showDialog(new CommunityAddOptionsSheet(baseFragment.getContext(), chat, chat2, new Utilities.Callback() { // from class: org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda3
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                CommunityUtils.lambda$showChatsToAddSheet$2(BaseFragment.this, i, chat2, chat, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showChatsToAddSheet$2(BaseFragment baseFragment, int i, TLRPC.Chat chat, TLRPC.Chat chat2, Boolean bool) {
        linkToCommunityAndConvertIfNeeded(baseFragment, i, chat, chat2.id, bool.booleanValue());
    }

    public static void linkToCommunityAndConvertIfNeeded(final BaseFragment baseFragment, final int i, TLRPC.Chat chat, final long j, final boolean z) {
        if (!ChatObject.isChannel(chat)) {
            final AlertDialog alertDialog = new AlertDialog(baseFragment.getContext(), 3);
            alertDialog.showDelayed(250L);
            MessagesController.getInstance(i).convertToMegaGroup(baseFragment.getParentActivity(), chat.id, baseFragment, new MessagesStorage.LongCallback() { // from class: org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda4
                @Override // org.telegram.messenger.MessagesStorage.LongCallback
                public final void run(long j2) {
                    CommunityUtils.lambda$linkToCommunityAndConvertIfNeeded$4(AlertDialog.this, baseFragment, i, j, z, j2);
                }
            });
            return;
        }
        linkToCommunityWithoutConvert(baseFragment, i, chat.id, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkToCommunityAndConvertIfNeeded$4(AlertDialog alertDialog, BaseFragment baseFragment, int i, long j, boolean z, long j2) {
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        linkToCommunityWithoutConvert(baseFragment, i, j2, j, z);
    }

    public static void linkToCommunityWithoutConvert(final BaseFragment baseFragment, int i, final long j, long j2, boolean z) {
        MessagesController.getInstance(i).linkCommunity(-j, j2, z, new Utilities.Callback2() { // from class: org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda5
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunityUtils.lambda$linkToCommunityWithoutConvert$5(BaseFragment.this, j, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkToCommunityWithoutConvert$5(BaseFragment baseFragment, long j, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                onCommunityLinkSuccess(baseFragment, -j, 2);
                return;
            } else {
                BulletinFactory.of(baseFragment).showForError(tL_error);
                return;
            }
        }
        onCommunityLinkSuccess(baseFragment, -j, 1);
    }

    public static void onCommunityLinkSuccess(BaseFragment baseFragment, long j, final int i) {
        INavigationLayout iNavigationLayout;
        final ChatActivity chatActivity;
        int i2;
        List list = null;
        if (AndroidUtilities.isTablet()) {
            iNavigationLayout = null;
            chatActivity = null;
        } else {
            iNavigationLayout = baseFragment.getParentLayout();
            if (iNavigationLayout != null) {
                List fragmentStack = iNavigationLayout.getFragmentStack();
                i2 = fragmentStack.size() - 2;
                while (i2 >= 0) {
                    BaseFragment baseFragment2 = (BaseFragment) fragmentStack.get(i2);
                    if (baseFragment2 instanceof ChatActivity) {
                        chatActivity = (ChatActivity) baseFragment2;
                        if (chatActivity.getDialogId() == j) {
                            list = fragmentStack;
                            break;
                        }
                    }
                    i2--;
                }
                chatActivity = null;
                list = fragmentStack;
            } else {
                chatActivity = null;
            }
        }
        i2 = -1;
        if (i2 != -1) {
            for (int size = list.size() - 2; size > i2; size--) {
                iNavigationLayout.removeFragmentFromStack((BaseFragment) list.get(size));
            }
            baseFragment.finishFragment();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    CommunityUtils.lambda$onCommunityLinkSuccess$6(i, chatActivity);
                }
            }, 250L);
            return;
        }
        if (!(baseFragment instanceof DialogsActivity)) {
            baseFragment.finishFragment();
        }
        showCommunityLinkSuccessToast(BulletinFactory.global(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCommunityLinkSuccess$6(int i, ChatActivity chatActivity) {
        if (i != 2) {
            chatActivity.onPageDownClicked();
            chatActivity.startFireworks();
        }
        showCommunityLinkSuccessToast(BulletinFactory.of(chatActivity), i);
    }

    public static void showCommunityLinkSuccessToast(BulletinFactory bulletinFactory, int i) {
        String string;
        int i2 = i == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i3 = i == 2 ? 24 : 36;
        if (i == 0) {
            string = LocaleController.getString(R.string.CommunityCommunityCreated);
        } else if (i == 1) {
            string = LocaleController.getString(R.string.CommunityCommunityJoined);
        } else {
            string = LocaleController.getString(R.string.CommunityCommunityPending);
        }
        bulletinFactory.createSimpleBulletin(i2, string, i3).show();
    }

    public static CommunityChatType getCommunityChatType(int i, TLRPC.Chat chat) {
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (chat != null && chat.linked_community_id != 0 && (chatFull = MessagesController.getInstance(i).getChatFull(chat.linked_community_id)) != null && (arrayList = chatFull.linked_peers) != null) {
            Iterator<TL_communities.CommunityPeer> it = arrayList.iterator();
            while (it.hasNext()) {
                TL_communities.CommunityPeer next = it.next();
                if (DialogObject.getPeerDialogId(next.peer) == (-chat.id)) {
                    return getCommunityChatType(chat, next);
                }
            }
        }
        return null;
    }

    public static CommunityChatType getCommunityChatType(TLRPC.Chat chat, TL_communities.CommunityPeer communityPeer) {
        if (chat == null || communityPeer == null) {
            return null;
        }
        if (ChatObject.isInChat(chat)) {
            return CommunityChatType.YouAreIn;
        }
        if (ChatObject.isPublic(chat) || communityPeer.can_view_history) {
            return CommunityChatType.YouCanView;
        }
        if (ChatObject.isCommunityPeerHidden(communityPeer)) {
            return CommunityChatType.HiddenUnavailable;
        }
        return CommunityChatType.YouCanSendJoinRequest;
    }

    public static class DialogCellFactory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new DialogCellFactory());
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public boolean equals(UItem uItem, UItem uItem2) {
            return uItem.id == uItem2.id;
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public boolean contentsEquals(UItem uItem, UItem uItem2) {
            return equals(uItem, uItem2);
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public DialogCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            DialogCell dialogCell = new DialogCell(null, context, false, false, i, resourcesProvider);
            dialogCell.insideCommunityList = true;
            return dialogCell;
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            DialogCell dialogCell = (DialogCell) view;
            TLRPC.Chat chat = (TLRPC.Chat) uItem.object;
            dialogCell.isHiddenInCommunity = ChatObject.isChatHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            dialogCell.insideCommunityListNoDialog = dialog == null;
            if (dialog != null) {
                dialogCell.setCustomMessageWithoutRebuild(null);
                dialogCell.setDialog(dialog, 0, 0);
            } else {
                dialogCell.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                dialogCell.setDialog(-chat.id, null, 0, false, false);
            }
        }

        public static UItem asCell(TLRPC.Chat chat) {
            UItem ofFactory = UItem.ofFactory(DialogCellFactory.class);
            ofFactory.id = chat != null ? SessionDetails$$ExternalSyntheticBackport0.m(chat.id) : 0;
            ofFactory.object = chat;
            return ofFactory;
        }
    }
}
