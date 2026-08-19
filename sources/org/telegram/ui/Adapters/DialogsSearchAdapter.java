package org.telegram.ui.Adapters;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HashtagSearchCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TopicSearchCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilteredSearchView;

/* loaded from: classes4.dex */
public abstract class DialogsSearchAdapter extends RecyclerListView.SelectionAdapter {
    private Runnable cancelShowMoreAnimation;
    private int currentItemCount;
    private String currentMessagesQuery;
    public DialogsSearchAdapterDelegate delegate;
    private final DialogsActivity dialogsActivity;
    private int dialogsType;
    private ColoredImageSpan filterArrowsIcon;
    private ArrayList filterDialogIds;
    private FilteredSearchView.Delegate filtersDelegate;
    private int folderId;
    private boolean forceLoadingMessages;
    private RecyclerListView innerListView;
    private DefaultItemAnimator itemAnimator;
    private int lastForumReqId;
    private int lastGlobalSearchId;
    private int lastLocalSearchId;
    private int lastMessagesSearchFilterFlags;
    private int lastMessagesSearchId;
    private String lastMessagesSearchString;
    private int lastReqId;
    private int lastSearchId;
    private String lastSearchText;
    private long lastShowMoreUpdate;
    private boolean localMessagesSearchEndReached;
    private boolean localTipArchive;
    private final Context mContext;
    private EmptyLayout messagesEmptyLayout;
    private boolean messagesSearchEndReached;
    private int needMessagesSearch;
    private int nextSearchRate;
    public String publicPostsHashtag;
    public int publicPostsLastRate;
    public int publicPostsTotalCount;
    private final Theme.ResourcesProvider resourcesProvider;
    private SearchAdapterHelper searchAdapterHelper;
    private Runnable searchHashtagRunnable;
    private Runnable searchRunnable;
    private Runnable searchRunnable2;
    private boolean searchWas;
    private long selfUserId;
    public View showMoreHeader;
    private String sponsoredQuery;
    private int sponsoredReqId;
    int waitingResponseCount;
    private Filter currentMessagesFilter = Filter.All;
    private int searchHashtagRequest = -1;
    private ArrayList searchResult = new ArrayList();
    public ArrayList publicPosts = new ArrayList();
    private final ArrayList searchContacts = new ArrayList();
    private final ArrayList searchTopics = new ArrayList();
    private ArrayList searchResultNames = new ArrayList();
    private final ArrayList searchForumResultMessages = new ArrayList();
    private final ArrayList searchResultMessages = new ArrayList();
    private final ArrayList searchResultHashtags = new ArrayList();
    public final ArrayList sponsoredPeers = new ArrayList();
    private final HashSet seenSponsoredPeers = new HashSet();
    private int reqId = 0;
    private int reqForumId = 0;
    public int localMessagesLoadingRow = -1;
    public boolean showMoreAnimation = false;
    private int currentAccount = UserConfig.selectedAccount;
    private ArrayList recentSearchObjects = new ArrayList();
    private final ArrayList filteredRecentSearchObjects = new ArrayList();
    private final ArrayList filtered2RecentSearchObjects = new ArrayList();
    private String filteredRecentQuery = null;
    private LongSparseArray recentSearchObjectsById = new LongSparseArray();
    private ArrayList localTipDates = new ArrayList();
    private int messagesSectionPosition = -1;
    boolean globalSearchCollapsed = true;
    boolean phoneCollapsed = true;

    public static class DialogSearchResult {
        public int date;
        public CharSequence name;
        public TLObject object;
    }

    public interface DialogsSearchAdapterDelegate {
        void didPressedBlockedDialog(View view, long j);

        void didPressedOnSubDialog(long j);

        long getSearchForumDialogId();

        boolean isSelected(long j);

        void needClearList();

        void needRemoveHint(long j);

        void runResultsEnterAnimation();

        void searchStateChanged(boolean z, boolean z2);
    }

    public interface OnRecentSearchLoaded {
        void setRecentSearch(ArrayList arrayList, LongSparseArray longSparseArray);
    }

    public static class RecentSearchObject {
        public int date;
        public long did;
        public TLObject object;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    protected abstract void openBotApp(TLRPC.User user);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void openPublicPosts();

    protected abstract void openSponsoredOptions(ProfileSearchCell profileSearchCell, TLRPC.TL_sponsoredPeer tL_sponsoredPeer);

    public enum Filter {
        All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
        Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
        Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
        Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);

        public final int flags;
        public final int strFromResId;
        public final int strResId;

        Filter(int i, int i2, int i3) {
            this.flags = i;
            this.strResId = i2;
            this.strFromResId = i3;
        }
    }

    public void resetFilter() {
        this.currentMessagesFilter = Filter.All;
    }

    public void setFilterDialogIds(ArrayList arrayList) {
        this.filterDialogIds = arrayList;
    }

    public boolean isSearching() {
        return this.waitingResponseCount > 0;
    }

    public static class CategoryAdapterRecycler extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        private boolean drawChecked;
        private final Context mContext;
        private Theme.ResourcesProvider resourcesProvider;
        private boolean showPremiumBlock;

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public CategoryAdapterRecycler(Context context, int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
            this.drawChecked = z;
            this.mContext = context;
            this.currentAccount = i;
            this.showPremiumBlock = z2;
            this.resourcesProvider = resourcesProvider;
        }

        public void setIndex(int i) {
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            HintDialogCell hintDialogCell = new HintDialogCell(this.mContext, this.drawChecked, this.resourcesProvider);
            if (this.showPremiumBlock) {
                hintDialogCell.showPremiumBlocked();
            }
            hintDialogCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
            return new RecyclerListView.Holder(hintDialogCell);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            String monoForumTitle;
            HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
            TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(this.currentAccount).hints.get(i);
            new TLRPC.TL_dialog();
            TLRPC.Peer peer = tL_topPeer.peer;
            long j = peer.user_id;
            TLRPC.User user = null;
            if (j != 0) {
                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_topPeer.peer.user_id));
                chat = null;
            } else {
                long j2 = peer.channel_id;
                if (j2 != 0) {
                    j = -j2;
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
                } else {
                    long j3 = peer.chat_id;
                    if (j3 != 0) {
                        j = -j3;
                        chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                    } else {
                        chat = null;
                        j = 0;
                    }
                }
            }
            hintDialogCell.setTag(Long.valueOf(j));
            if (user != null) {
                monoForumTitle = UserObject.getFirstName(user);
            } else {
                monoForumTitle = chat != null ? chat.monoforum ? ForumUtilities.getMonoForumTitle(this.currentAccount, chat) : chat.title : "";
            }
            hintDialogCell.setDialog(j, true, monoForumTitle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MediaDataController.getInstance(this.currentAccount).hints.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean filter(Object obj) {
        if (this.dialogsType != 14) {
            return true;
        }
        if (obj instanceof TLRPC.User) {
            if (((TLRPC.User) obj).bot) {
                return this.dialogsActivity.allowBots;
            }
            return this.dialogsActivity.allowUsers;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        if (ChatObject.isChannel(chat)) {
            return this.dialogsActivity.allowChannels;
        }
        if (ChatObject.isMegagroup(chat)) {
            DialogsActivity dialogsActivity = this.dialogsActivity;
            return dialogsActivity.allowGroups || dialogsActivity.allowMegagroups;
        }
        DialogsActivity dialogsActivity2 = this.dialogsActivity;
        return dialogsActivity2.allowGroups || dialogsActivity2.allowLegacyGroups;
    }

    public DialogsSearchAdapter(Context context, DialogsActivity dialogsActivity, int i, int i2, DefaultItemAnimator defaultItemAnimator, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.itemAnimator = defaultItemAnimator;
        this.dialogsActivity = dialogsActivity;
        this.resourcesProvider = resourcesProvider;
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false) { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter.1
            @Override // org.telegram.ui.Adapters.SearchAdapterHelper
            protected boolean filter(TLObject tLObject) {
                return DialogsSearchAdapter.this.filter(tLObject);
            }
        };
        this.searchAdapterHelper = searchAdapterHelper;
        searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter.2
            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public /* synthetic */ LongSparseArray getExcludeCallParticipants() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeCallParticipants(this);
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public /* synthetic */ LongSparseArray getExcludeUsers() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeUsers(this);
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public void onDataSetChanged(int i3) {
                DialogsSearchAdapter dialogsSearchAdapter = DialogsSearchAdapter.this;
                dialogsSearchAdapter.waitingResponseCount--;
                dialogsSearchAdapter.lastGlobalSearchId = i3;
                if (DialogsSearchAdapter.this.lastLocalSearchId != i3) {
                    DialogsSearchAdapter.this.searchResult.clear();
                }
                if (DialogsSearchAdapter.this.lastMessagesSearchId != i3) {
                    DialogsSearchAdapter.this.searchResultMessages.clear();
                }
                DialogsSearchAdapter.this.searchWas = true;
                DialogsSearchAdapter dialogsSearchAdapter2 = DialogsSearchAdapter.this;
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter2.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(dialogsSearchAdapter2.waitingResponseCount > 0, true);
                }
                DialogsSearchAdapter.this.notifyDataSetChanged();
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = DialogsSearchAdapter.this.delegate;
                if (dialogsSearchAdapterDelegate2 != null) {
                    dialogsSearchAdapterDelegate2.runResultsEnterAnimation();
                }
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    DialogsSearchAdapter.this.searchResultHashtags.add(((SearchAdapterHelper.HashtagObject) arrayList.get(i3)).hashtag);
                }
                DialogsSearchAdapter dialogsSearchAdapter = DialogsSearchAdapter.this;
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(dialogsSearchAdapter.waitingResponseCount > 0, false);
                }
                DialogsSearchAdapter.this.notifyDataSetChanged();
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public boolean canApplySearchResults(int i3) {
                return i3 == DialogsSearchAdapter.this.lastSearchId;
            }
        });
        this.searchAdapterHelper.setAllowGlobalResults(z);
        this.mContext = context;
        this.needMessagesSearch = i;
        this.dialogsType = i2;
        this.selfUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        loadRecentSearch();
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
    }

    public RecyclerListView getInnerListView() {
        return this.innerListView;
    }

    public void setDelegate(DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate) {
        this.delegate = dialogsSearchAdapterDelegate;
    }

    public boolean isMessagesSearchEndReached() {
        return (this.delegate.getSearchForumDialogId() == 0 || this.localMessagesSearchEndReached) && this.messagesSearchEndReached;
    }

    public void loadMoreSearchMessages() {
        if ((this.reqForumId == 0 || this.reqId == 0) && this.lastMessagesSearchId == this.lastSearchId) {
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
            if (dialogsSearchAdapterDelegate != null && dialogsSearchAdapterDelegate.getSearchForumDialogId() != 0 && !this.localMessagesSearchEndReached) {
                searchForumMessagesInternal(this.lastMessagesSearchString, this.lastMessagesSearchId);
            } else {
                searchMessagesInternal(this.lastMessagesSearchString, this.lastMessagesSearchId);
            }
        }
    }

    public String getLastSearchString() {
        return this.lastMessagesSearchString;
    }

    private void searchForumMessagesInternal(final String str, final int i) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null && dialogsSearchAdapterDelegate.getSearchForumDialogId() != 0 && this.needMessagesSearch != 0 && (!TextUtils.isEmpty(this.lastMessagesSearchString) || !TextUtils.isEmpty(str))) {
            if (this.reqForumId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqForumId, true);
                this.reqForumId = 0;
            }
            if (TextUtils.isEmpty(str)) {
                this.filteredRecentQuery = null;
                this.searchResultMessages.clear();
                this.searchForumResultMessages.clear();
                this.lastForumReqId = 0;
                this.lastMessagesSearchString = null;
                this.searchWas = false;
                notifyDataSetChanged();
                return;
            }
            if (this.dialogsType != 15) {
                long searchForumDialogId = this.delegate.getSearchForumDialogId();
                final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 20;
                tL_messages_search.q = str;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(searchForumDialogId);
                if (str.equals(this.lastMessagesSearchString) && !this.searchForumResultMessages.isEmpty()) {
                    tL_messages_search.add_offset = this.searchForumResultMessages.size();
                }
                this.lastMessagesSearchString = str;
                final int i2 = this.lastForumReqId + 1;
                this.lastForumReqId = i2;
                this.reqForumId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda23
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        DialogsSearchAdapter.$r8$lambda$w7EuHJ7qQrrPagAvdzGuQ-5HZK4(DialogsSearchAdapter.this, str, i2, i, tL_messages_search, tLObject, tL_error);
                    }
                }, 2);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$w7EuHJ7qQrrPagAvdzGuQ-5HZK4(final DialogsSearchAdapter dialogsSearchAdapter, final String str, final int i, final int i2, final TLRPC.TL_messages_search tL_messages_search, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        dialogsSearchAdapter.getClass();
        final ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < messages_messages.chats.size(); i3++) {
                TLRPC.Chat chat = messages_messages.chats.get(i3);
                longSparseArray.put(chat.id, chat);
            }
            for (int i4 = 0; i4 < messages_messages.users.size(); i4++) {
                TLRPC.User user = messages_messages.users.get(i4);
                longSparseArray2.put(user.id, user);
            }
            for (int i5 = 0; i5 < messages_messages.messages.size(); i5++) {
                MessageObject messageObject = new MessageObject(dialogsSearchAdapter.currentAccount, messages_messages.messages.get(i5), longSparseArray2, longSparseArray, false, true);
                arrayList.add(messageObject);
                messageObject.setQuery(str);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$SHKztY9NDQlXE7Rn5Y4Uo2HZC9U(DialogsSearchAdapter.this, i, i2, tL_error, str, tLObject, tL_messages_search, arrayList);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$SHKztY9NDQlXE7Rn5Y4Uo2HZC9U(DialogsSearchAdapter dialogsSearchAdapter, int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLRPC.TL_messages_search tL_messages_search, ArrayList arrayList) {
        if (i == dialogsSearchAdapter.lastForumReqId && (i2 <= 0 || i2 == dialogsSearchAdapter.lastSearchId)) {
            dialogsSearchAdapter.waitingResponseCount--;
            if (tL_error == null) {
                dialogsSearchAdapter.currentMessagesQuery = str;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putChats(messages_messages.chats, false);
                if (tL_messages_search.add_offset == 0) {
                    dialogsSearchAdapter.searchForumResultMessages.clear();
                }
                dialogsSearchAdapter.nextSearchRate = messages_messages.next_rate;
                for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                    TLRPC.Message message = messages_messages.messages.get(i3);
                    int i4 = MessagesController.getInstance(dialogsSearchAdapter.currentAccount).deletedHistory.get(MessageObject.getDialogId(message));
                    if (i4 == 0 || message.id > i4) {
                        dialogsSearchAdapter.searchForumResultMessages.add((MessageObject) arrayList.get(i3));
                    }
                }
                dialogsSearchAdapter.searchWas = true;
                dialogsSearchAdapter.localMessagesSearchEndReached = messages_messages.messages.size() != 20;
                if (i2 > 0) {
                    dialogsSearchAdapter.lastMessagesSearchId = i2;
                    if (dialogsSearchAdapter.lastLocalSearchId != i2) {
                        dialogsSearchAdapter.searchResult.clear();
                    }
                    if (dialogsSearchAdapter.lastGlobalSearchId != i2) {
                        dialogsSearchAdapter.searchAdapterHelper.clear();
                    }
                }
                dialogsSearchAdapter.searchAdapterHelper.mergeResults(dialogsSearchAdapter.searchResult, dialogsSearchAdapter.filtered2RecentSearchObjects);
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(dialogsSearchAdapter.waitingResponseCount > 0, true);
                    dialogsSearchAdapter.delegate.runResultsEnterAnimation();
                }
                dialogsSearchAdapter.notifyDataSetChanged();
            }
        }
        dialogsSearchAdapter.reqForumId = 0;
    }

    private void searchTopics(String str) {
        this.searchTopics.clear();
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate == null || dialogsSearchAdapterDelegate.getSearchForumDialogId() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-this.delegate.getSearchForumDialogId());
            String trim = str.trim();
            for (int i = 0; i < topics.size(); i++) {
                if (topics.get(i) != null && topics.get(i).title.toLowerCase().contains(trim)) {
                    this.searchTopics.add(topics.get(i));
                    topics.get(i).searchQuery = trim;
                }
            }
        }
        notifyDataSetChanged();
    }

    private void searchMessagesInternal(final String str, final int i) {
        if (this.needMessagesSearch != 0 && (!TextUtils.isEmpty(this.lastMessagesSearchString) || !TextUtils.isEmpty(str))) {
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            if (TextUtils.isEmpty(str) || this.delegate.getSearchForumDialogId() != 0) {
                this.filteredRecentQuery = null;
                this.searchResultMessages.clear();
                this.searchForumResultMessages.clear();
                this.lastReqId = 0;
                this.lastMessagesSearchString = null;
                this.lastMessagesSearchFilterFlags = 0;
                this.searchWas = false;
                notifyDataSetChanged();
                return;
            }
            filterRecent(str);
            this.searchAdapterHelper.mergeResults(this.searchResult, this.filtered2RecentSearchObjects);
            if (this.dialogsType == 15) {
                int i2 = this.waitingResponseCount - 1;
                this.waitingResponseCount = i2;
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(i2 > 0, true);
                    this.delegate.runResultsEnterAnimation();
                }
            } else {
                final TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i3 = this.currentMessagesFilter.flags;
                tL_messages_searchGlobal.broadcasts_only = (i3 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i3 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i3 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.folderId;
                if (!str.equals(this.lastMessagesSearchString)) {
                    this.forceLoadingMessages = false;
                }
                if (str.equals(this.lastMessagesSearchString) && this.lastMessagesSearchFilterFlags == this.currentMessagesFilter.flags && !this.searchResultMessages.isEmpty() && this.lastMessagesSearchId == this.lastSearchId) {
                    ArrayList arrayList = this.searchResultMessages;
                    MessageObject messageObject = (MessageObject) arrayList.get(arrayList.size() - 1);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.nextSearchRate;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.lastMessagesSearchString = str;
                this.lastMessagesSearchFilterFlags = this.currentMessagesFilter.flags;
                final int i4 = this.lastReqId + 1;
                this.lastReqId = i4;
                this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda24
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        DialogsSearchAdapter.$r8$lambda$-yt0In8I2Y6ix78uslnPeXTE5Z0(DialogsSearchAdapter.this, str, i4, i, tL_messages_searchGlobal, tLObject, tL_error);
                    }
                }, 2);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$-yt0In8I2Y6ix78uslnPeXTE5Z0(final DialogsSearchAdapter dialogsSearchAdapter, final String str, final int i, final int i2, final TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        dialogsSearchAdapter.getClass();
        final ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < messages_messages.chats.size(); i3++) {
                TLRPC.Chat chat = messages_messages.chats.get(i3);
                longSparseArray.put(chat.id, chat);
            }
            for (int i4 = 0; i4 < messages_messages.users.size(); i4++) {
                TLRPC.User user = messages_messages.users.get(i4);
                longSparseArray2.put(user.id, user);
            }
            for (int i5 = 0; i5 < messages_messages.messages.size(); i5++) {
                MessageObject messageObject = new MessageObject(dialogsSearchAdapter.currentAccount, messages_messages.messages.get(i5), longSparseArray2, longSparseArray, false, true);
                arrayList.add(messageObject);
                messageObject.setQuery(str);
            }
        }
        final HashSet hashSet = new HashSet();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            for (int i6 = 0; i6 < messages_messages2.messages.size(); i6++) {
                TLRPC.Message message = messages_messages2.messages.get(i6);
                long dialogId = MessageObject.getDialogId(message);
                if ((message.out ? MessagesController.getInstance(dialogsSearchAdapter.currentAccount).dialogs_read_outbox_max : MessagesController.getInstance(dialogsSearchAdapter.currentAccount).dialogs_read_inbox_max).get(Long.valueOf(dialogId)) == null) {
                    hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(dialogId)));
                }
            }
        }
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$gWG4GhmJ11VaBp5jmaeCKnQArbw(DialogsSearchAdapter.this, i, i2, tL_error, str, tLObject, tL_messages_searchGlobal, arrayList);
            }
        };
        if (hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(runnable);
        } else {
            MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    DialogsSearchAdapter.$r8$lambda$jln6D114Kt3wEF3JuIqft4ufT4U(DialogsSearchAdapter.this, hashSet, runnable);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$gWG4GhmJ11VaBp5jmaeCKnQArbw(DialogsSearchAdapter dialogsSearchAdapter, int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, ArrayList arrayList) {
        int i3;
        if (i == dialogsSearchAdapter.lastReqId && (i2 <= 0 || i2 == dialogsSearchAdapter.lastSearchId)) {
            dialogsSearchAdapter.waitingResponseCount--;
            if (tL_error == null) {
                dialogsSearchAdapter.currentMessagesQuery = str;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putChats(messages_messages.chats, false);
                if (tL_messages_searchGlobal.offset_id == 0) {
                    dialogsSearchAdapter.searchResultMessages.clear();
                }
                dialogsSearchAdapter.nextSearchRate = messages_messages.next_rate;
                for (int i4 = 0; i4 < messages_messages.messages.size(); i4++) {
                    TLRPC.Message message = messages_messages.messages.get(i4);
                    int i5 = MessagesController.getInstance(dialogsSearchAdapter.currentAccount).deletedHistory.get(MessageObject.getDialogId(message));
                    if (i5 == 0 || message.id > i5) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i4);
                        if (!dialogsSearchAdapter.searchForumResultMessages.isEmpty()) {
                            while (i3 < dialogsSearchAdapter.searchForumResultMessages.size()) {
                                MessageObject messageObject2 = (MessageObject) dialogsSearchAdapter.searchForumResultMessages.get(i3);
                                i3 = (messageObject2 == null || messageObject == null || messageObject.getId() != messageObject2.getId() || messageObject.getDialogId() != messageObject2.getDialogId()) ? i3 + 1 : 0;
                            }
                        }
                        dialogsSearchAdapter.searchResultMessages.add(messageObject);
                        Integer num = (message.out ? MessagesController.getInstance(dialogsSearchAdapter.currentAccount).dialogs_read_outbox_max : MessagesController.getInstance(dialogsSearchAdapter.currentAccount).dialogs_read_inbox_max).get(Long.valueOf(MessageObject.getDialogId(message)));
                        if (num != null) {
                            message.unread = num.intValue() < message.id;
                        }
                    }
                }
                dialogsSearchAdapter.searchWas = true;
                dialogsSearchAdapter.messagesSearchEndReached = messages_messages.messages.size() != 20;
                if (i2 > 0) {
                    dialogsSearchAdapter.lastMessagesSearchId = i2;
                    if (dialogsSearchAdapter.lastLocalSearchId != i2) {
                        dialogsSearchAdapter.searchResult.clear();
                    }
                    if (dialogsSearchAdapter.lastGlobalSearchId != i2) {
                        dialogsSearchAdapter.searchAdapterHelper.clear();
                    }
                }
                dialogsSearchAdapter.searchAdapterHelper.mergeResults(dialogsSearchAdapter.searchResult, dialogsSearchAdapter.filtered2RecentSearchObjects);
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(dialogsSearchAdapter.waitingResponseCount > 0, true);
                    dialogsSearchAdapter.delegate.runResultsEnterAnimation();
                }
                dialogsSearchAdapter.globalSearchCollapsed = true;
                dialogsSearchAdapter.phoneCollapsed = true;
                dialogsSearchAdapter.forceLoadingMessages = false;
                EmptyLayout emptyLayout = dialogsSearchAdapter.messagesEmptyLayout;
                if (emptyLayout != null) {
                    emptyLayout.setQuery(dialogsSearchAdapter.lastMessagesSearchString);
                }
                dialogsSearchAdapter.notifyDataSetChanged();
            }
        }
        dialogsSearchAdapter.reqId = 0;
    }

    public static /* synthetic */ void $r8$lambda$jln6D114Kt3wEF3JuIqft4ufT4U(DialogsSearchAdapter dialogsSearchAdapter, HashSet hashSet, Runnable runnable) {
        MessagesController messagesController = MessagesController.getInstance(dialogsSearchAdapter.currentAccount);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            boolean booleanValue = ((Boolean) pair.first).booleanValue();
            Long l = (Long) pair.second;
            (booleanValue ? messagesController.dialogs_read_outbox_max : messagesController.dialogs_read_inbox_max).put(l, Integer.valueOf(MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).getDialogReadMaxSync(booleanValue, l.longValue())));
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public boolean hasRecentSearch() {
        return recentSearchAvailable() && getRecentItemsCount() > 0;
    }

    private boolean recentSearchAvailable() {
        int i = this.dialogsType;
        return (i == 2 || i == 4 || i == 5 || i == 6 || i == 1 || i == 11 || i == 15) ? false : true;
    }

    public boolean isSearchWas() {
        return this.searchWas;
    }

    public boolean isRecentSearchDisplayed() {
        return this.needMessagesSearch != 2 && hasRecentSearch();
    }

    public void loadRecentSearch() {
        int i = this.dialogsType;
        if (i == 15) {
            return;
        }
        loadRecentSearch(this.currentAccount, i, new OnRecentSearchLoaded() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda4
            @Override // org.telegram.ui.Adapters.DialogsSearchAdapter.OnRecentSearchLoaded
            public final void setRecentSearch(ArrayList arrayList, LongSparseArray longSparseArray) {
                DialogsSearchAdapter.this.setRecentSearch(arrayList, longSparseArray);
            }
        });
    }

    public static void loadRecentSearch(final int i, final int i2, final OnRecentSearchLoaded onRecentSearchLoaded) {
        MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$IeZY6DzfyevAnT9a9okTeQwCnus(i, i2, onRecentSearchLoaded);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$IeZY6DzfyevAnT9a9okTeQwCnus(int i, int i2, final OnRecentSearchLoaded onRecentSearchLoaded) {
        try {
            SQLiteCursor queryFinalized = MessagesStorage.getInstance(i).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            new ArrayList();
            final ArrayList arrayList4 = new ArrayList();
            final LongSparseArray longSparseArray = new LongSparseArray();
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (DialogObject.isEncryptedDialog(longValue)) {
                    if (i2 == 0 || i2 == 3) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                        if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                            arrayList3.add(Integer.valueOf(encryptedChatId));
                            RecentSearchObject recentSearchObject = new RecentSearchObject();
                            recentSearchObject.did = longValue;
                            recentSearchObject.date = queryFinalized.intValue(1);
                            arrayList4.add(recentSearchObject);
                            longSparseArray.put(recentSearchObject.did, recentSearchObject);
                        }
                    }
                } else if (DialogObject.isUserDialog(longValue)) {
                    if (i2 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                        arrayList.add(Long.valueOf(longValue));
                        RecentSearchObject recentSearchObject2 = new RecentSearchObject();
                        recentSearchObject2.did = longValue;
                        recentSearchObject2.date = queryFinalized.intValue(1);
                        arrayList4.add(recentSearchObject2);
                        longSparseArray.put(recentSearchObject2.did, recentSearchObject2);
                    }
                } else {
                    long j = -longValue;
                    if (!arrayList2.contains(Long.valueOf(j))) {
                        arrayList2.add(Long.valueOf(j));
                        RecentSearchObject recentSearchObject22 = new RecentSearchObject();
                        recentSearchObject22.did = longValue;
                        recentSearchObject22.date = queryFinalized.intValue(1);
                        arrayList4.add(recentSearchObject22);
                        longSparseArray.put(recentSearchObject22.did, recentSearchObject22);
                    }
                }
            }
            queryFinalized.dispose();
            ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
            if (!arrayList3.isEmpty()) {
                ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                MessagesStorage.getInstance(i).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                    RecentSearchObject recentSearchObject3 = (RecentSearchObject) longSparseArray.get(DialogObject.makeEncryptedDialogId(arrayList6.get(i3).id));
                    if (recentSearchObject3 != null) {
                        recentSearchObject3.object = arrayList6.get(i3);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                MessagesStorage.getInstance(i).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                for (int i4 = 0; i4 < arrayList7.size(); i4++) {
                    TLRPC.Chat chat = arrayList7.get(i4);
                    long j2 = -chat.id;
                    if (chat.migrated_to != null) {
                        RecentSearchObject recentSearchObject4 = (RecentSearchObject) longSparseArray.get(j2);
                        longSparseArray.remove(j2);
                        if (recentSearchObject4 != null) {
                            arrayList4.remove(recentSearchObject4);
                        }
                    } else {
                        RecentSearchObject recentSearchObject5 = (RecentSearchObject) longSparseArray.get(j2);
                        if (recentSearchObject5 != null) {
                            recentSearchObject5.object = chat;
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                MessagesStorage.getInstance(i).getUsersInternal(arrayList, arrayList5);
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    TLRPC.User user = arrayList5.get(i5);
                    RecentSearchObject recentSearchObject6 = (RecentSearchObject) longSparseArray.get(user.id);
                    if (recentSearchObject6 != null) {
                        recentSearchObject6.object = user;
                    }
                }
            }
            Collections.sort(arrayList4, new Comparator() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DialogsSearchAdapter.$r8$lambda$lqxExGyE7S05spp6PXDQg3CKK0w((DialogsSearchAdapter.RecentSearchObject) obj, (DialogsSearchAdapter.RecentSearchObject) obj2);
                }
            });
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    DialogsSearchAdapter.OnRecentSearchLoaded.this.setRecentSearch(arrayList4, longSparseArray);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ int $r8$lambda$lqxExGyE7S05spp6PXDQg3CKK0w(RecentSearchObject recentSearchObject, RecentSearchObject recentSearchObject2) {
        int i = recentSearchObject.date;
        int i2 = recentSearchObject2.date;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public void putRecentSearch(final long j, TLObject tLObject) {
        RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjectsById.get(j);
        if (recentSearchObject == null) {
            recentSearchObject = new RecentSearchObject();
            this.recentSearchObjectsById.put(j, recentSearchObject);
        } else {
            this.recentSearchObjects.remove(recentSearchObject);
        }
        this.recentSearchObjects.add(0, recentSearchObject);
        recentSearchObject.did = j;
        recentSearchObject.object = tLObject;
        recentSearchObject.date = (int) (System.currentTimeMillis() / 1000);
        String str = this.lastSearchText;
        filterRecent(str != null ? str.trim() : null);
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$CE8rcqC5tSOwpAR4nKuV7OhDTaI(DialogsSearchAdapter.this, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$CE8rcqC5tSOwpAR4nKuV7OhDTaI(DialogsSearchAdapter dialogsSearchAdapter, long j) {
        dialogsSearchAdapter.getClass();
        try {
            SQLitePreparedStatement executeFast = MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void clearRecentSearch() {
        final StringBuilder sb;
        if (this.searchWas) {
            sb = null;
            while (this.filtered2RecentSearchObjects.size() > 0) {
                RecentSearchObject recentSearchObject = (RecentSearchObject) this.filtered2RecentSearchObjects.remove(0);
                this.recentSearchObjects.remove(recentSearchObject);
                this.filteredRecentSearchObjects.remove(recentSearchObject);
                this.recentSearchObjectsById.remove(recentSearchObject.did);
                if (sb == null) {
                    sb = new StringBuilder("did IN (");
                    sb.append(recentSearchObject.did);
                } else {
                    sb.append(", ");
                    sb.append(recentSearchObject.did);
                }
            }
            if (sb == null) {
                sb = new StringBuilder("1");
            } else {
                sb.append(")");
            }
        } else {
            this.filtered2RecentSearchObjects.clear();
            this.filteredRecentSearchObjects.clear();
            this.recentSearchObjects.clear();
            this.recentSearchObjectsById.clear();
            sb = new StringBuilder("1");
        }
        String str = this.lastSearchText;
        filterRecent(str != null ? str.trim() : null);
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$vR29a6QaR2LB4NwIE2WBZxkXR9w(DialogsSearchAdapter.this, sb);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$vR29a6QaR2LB4NwIE2WBZxkXR9w(DialogsSearchAdapter dialogsSearchAdapter, StringBuilder sb) {
        dialogsSearchAdapter.getClass();
        try {
            sb.insert(0, "DELETE FROM search_recent WHERE ");
            MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).getDatabase().executeFast(sb.toString()).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void removeRecentSearch(final long j) {
        RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjectsById.get(j);
        if (recentSearchObject == null) {
            return;
        }
        this.recentSearchObjectsById.remove(j);
        this.recentSearchObjects.remove(recentSearchObject);
        this.filtered2RecentSearchObjects.remove(recentSearchObject);
        this.filteredRecentSearchObjects.remove(recentSearchObject);
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$DTzXG3o_XzmlQMKeFw1Lfyc0vdk(DialogsSearchAdapter.this, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$DTzXG3o_XzmlQMKeFw1Lfyc0vdk(DialogsSearchAdapter dialogsSearchAdapter, long j) {
        dialogsSearchAdapter.getClass();
        try {
            MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void addHashtagsFromMessage(CharSequence charSequence) {
        this.searchAdapterHelper.addHashtagsFromMessage(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecentSearch(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.recentSearchObjects = arrayList;
        this.recentSearchObjectsById = longSparseArray;
        for (int i = 0; i < this.recentSearchObjects.size(); i++) {
            RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjects.get(i);
            TLObject tLObject = recentSearchObject.object;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(this.currentAccount).putUser((TLRPC.User) recentSearchObject.object, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(this.currentAccount).putChat((TLRPC.Chat) recentSearchObject.object, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(this.currentAccount).putEncryptedChat((TLRPC.EncryptedChat) recentSearchObject.object, true);
            }
        }
        filterRecent(null);
        notifyDataSetChanged();
    }

    private void searchDialogsInternal(final String str, final int i) {
        if (this.needMessagesSearch == 2) {
            return;
        }
        final String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            this.lastSearchId = 0;
            updateSearchResults(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), this.lastSearchId);
        } else {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda35
                @Override // java.lang.Runnable
                public final void run() {
                    DialogsSearchAdapter.$r8$lambda$Ck-M8b2VOUBpJQiKB2SbRIDGEw4(DialogsSearchAdapter.this, lowerCase, i, str);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$Ck-M8b2VOUBpJQiKB2SbRIDGEw4(final DialogsSearchAdapter dialogsSearchAdapter, String str, int i, String str2) {
        dialogsSearchAdapter.getClass();
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList<CharSequence> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).localSearch(dialogsSearchAdapter.dialogsType, str, arrayList, arrayList2, arrayList3, dialogsSearchAdapter.filterDialogIds, -1);
        dialogsSearchAdapter.updateSearchResults(arrayList, arrayList2, arrayList3, arrayList4, i);
        FiltersView.fillTipDates(str, dialogsSearchAdapter.localTipDates);
        dialogsSearchAdapter.localTipArchive = false;
        if (str.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str) || "archive".startsWith(str2))) {
            dialogsSearchAdapter.localTipArchive = true;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$t-FcNmQj_r90HTeslPs3PrhW-s4(DialogsSearchAdapter.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$t-FcNmQj_r90HTeslPs3PrhW-s4(DialogsSearchAdapter dialogsSearchAdapter) {
        FilteredSearchView.Delegate delegate = dialogsSearchAdapter.filtersDelegate;
        if (delegate != null) {
            delegate.updateFiltersView(false, null, dialogsSearchAdapter.localTipDates, dialogsSearchAdapter.localTipArchive);
        }
    }

    private void updateSearchResults(final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, ArrayList arrayList4, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$d32xhfCOplTUigxjxJh_f70AMGc(DialogsSearchAdapter.this, i, arrayList, arrayList2, arrayList3);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$d32xhfCOplTUigxjxJh_f70AMGc(final DialogsSearchAdapter dialogsSearchAdapter, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        final long j;
        dialogsSearchAdapter.waitingResponseCount--;
        if (i != dialogsSearchAdapter.lastSearchId) {
            return;
        }
        dialogsSearchAdapter.lastLocalSearchId = i;
        if (dialogsSearchAdapter.lastGlobalSearchId != i) {
            dialogsSearchAdapter.searchAdapterHelper.clear();
        }
        if (dialogsSearchAdapter.lastMessagesSearchId != i) {
            dialogsSearchAdapter.searchResultMessages.clear();
        }
        dialogsSearchAdapter.searchWas = true;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (!dialogsSearchAdapter.filter(arrayList.get(i2))) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        int size = dialogsSearchAdapter.filtered2RecentSearchObjects.size();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            final Object obj = arrayList.get(i3);
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putUser(user, true);
                j = user.id;
            } else if (obj instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putChat(chat, true);
                j = -chat.id;
            } else {
                if (obj instanceof TLRPC.EncryptedChat) {
                    MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putEncryptedChat((TLRPC.EncryptedChat) obj, true);
                }
                j = 0;
            }
            if (j != 0 && ((TLRPC.Dialog) MessagesController.getInstance(dialogsSearchAdapter.currentAccount).dialogs_dict.get(j)) == null) {
                MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).getDialogFolderId(j, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda39
                    @Override // org.telegram.messenger.MessagesStorage.IntCallback
                    public final void run(int i4) {
                        DialogsSearchAdapter.$r8$lambda$1_Rg7fKTgHrwTTMYVSFglpO6mw8(DialogsSearchAdapter.this, j, obj, i4);
                    }
                });
            }
            if (dialogsSearchAdapter.recentSearchAvailable() && !(obj instanceof TLRPC.EncryptedChat)) {
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
                boolean z = dialogsSearchAdapterDelegate != null && dialogsSearchAdapterDelegate.getSearchForumDialogId() == j;
                for (int i4 = 0; !z && i4 < size; i4++) {
                    RecentSearchObject recentSearchObject = (RecentSearchObject) dialogsSearchAdapter.filtered2RecentSearchObjects.get(i4);
                    if (recentSearchObject != null && recentSearchObject.did == j) {
                        z = true;
                    }
                }
                if (z) {
                    arrayList.remove(i3);
                    arrayList2.remove(i3);
                    i3--;
                }
            }
            i3++;
        }
        MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putUsers(arrayList3, true);
        dialogsSearchAdapter.searchResult = arrayList;
        dialogsSearchAdapter.searchResultNames = arrayList2;
        dialogsSearchAdapter.searchAdapterHelper.mergeResults(arrayList, dialogsSearchAdapter.filtered2RecentSearchObjects);
        dialogsSearchAdapter.notifyDataSetChanged();
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = dialogsSearchAdapter.delegate;
        if (dialogsSearchAdapterDelegate2 != null) {
            dialogsSearchAdapterDelegate2.searchStateChanged(dialogsSearchAdapter.waitingResponseCount > 0, true);
            dialogsSearchAdapter.delegate.runResultsEnterAnimation();
        }
    }

    public static /* synthetic */ void $r8$lambda$1_Rg7fKTgHrwTTMYVSFglpO6mw8(DialogsSearchAdapter dialogsSearchAdapter, long j, Object obj, int i) {
        dialogsSearchAdapter.getClass();
        if (i != -1) {
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.id = j;
            if (i != 0) {
                tL_dialog.folder_id = i;
            }
            if (obj instanceof TLRPC.Chat) {
                tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj) ? 1 : 0;
            }
            MessagesController.getInstance(dialogsSearchAdapter.currentAccount).dialogs_dict.put(j, tL_dialog);
            MessagesController.getInstance(dialogsSearchAdapter.currentAccount).getAllDialogs().add(tL_dialog);
            MessagesController.getInstance(dialogsSearchAdapter.currentAccount).sortDialogs(null);
        }
    }

    public boolean isHashtagSearch() {
        return !this.searchResultHashtags.isEmpty();
    }

    public void clearRecentHashtags() {
        this.searchAdapterHelper.clearRecentHashtags();
        this.searchResultHashtags.clear();
        notifyDataSetChanged();
    }

    public void searchDialogs(final String str, int i, boolean z) {
        if (str != null && str.equals(this.lastSearchText) && (i == this.folderId || TextUtils.isEmpty(str))) {
            return;
        }
        this.lastSearchText = str;
        this.folderId = i;
        final String str2 = null;
        if (this.searchRunnable != null) {
            Utilities.searchQueue.cancelRunnable(this.searchRunnable);
            this.searchRunnable = null;
        }
        Runnable runnable = this.searchRunnable2;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.searchRunnable2 = null;
        }
        Runnable runnable2 = this.searchHashtagRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.searchHashtagRunnable = null;
        }
        if (this.searchHashtagRequest >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.searchHashtagRequest, true);
            this.searchHashtagRequest = -1;
        }
        final String trim = str != null ? str.trim() : null;
        filterRecent(trim);
        if (!TextUtils.equals(this.sponsoredQuery, trim)) {
            this.sponsoredQuery = trim;
            this.sponsoredPeers.clear();
            if (this.sponsoredReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.sponsoredReqId, true);
                this.sponsoredReqId = 0;
            }
            if (trim == null || trim.length() < 4 || (UserConfig.getInstance(this.currentAccount).isPremium() && MessagesController.getInstance(this.currentAccount).isSponsoredDisabled())) {
                this.sponsoredQuery = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.sponsoredQuery = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.sponsoredReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_getSponsoredPeers, new RequestDelegate() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda8
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        DialogsSearchAdapter.$r8$lambda$kMWPmDpvnbv3zVHm83cjZR0JrpY(DialogsSearchAdapter.this, tLObject, tL_error);
                    }
                });
            }
        }
        if (TextUtils.isEmpty(trim)) {
            this.filteredRecentQuery = null;
            this.searchAdapterHelper.unloadRecentHashtags();
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchResultHashtags.clear();
            this.publicPostsTotalCount = 0;
            this.publicPostsLastRate = 0;
            this.publicPostsHashtag = null;
            this.publicPosts.clear();
            this.searchAdapterHelper.mergeResults(null, null);
            int i2 = this.dialogsType;
            if (i2 != 15) {
                SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
                boolean z2 = i2 != 11;
                boolean z3 = i2 != 11;
                boolean z4 = i2 == 2 || i2 == 11;
                boolean z5 = i2 == 0;
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                searchAdapterHelper.queryServerSearch(null, true, true, z2, z3, z4, 0L, z5, 0, 0, dialogsSearchAdapterDelegate != null ? dialogsSearchAdapterDelegate.getSearchForumDialogId() : 0L);
            }
            this.searchWas = false;
            this.lastSearchId = 0;
            this.waitingResponseCount = 0;
            this.globalSearchCollapsed = true;
            this.phoneCollapsed = true;
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = this.delegate;
            if (dialogsSearchAdapterDelegate2 != null) {
                dialogsSearchAdapterDelegate2.searchStateChanged(false, true);
            }
            if (this.dialogsType != 15) {
                searchTopics(null);
                searchMessagesInternal(null, 0);
                searchForumMessagesInternal(null, 0);
            }
            notifyDataSetChanged();
            this.localTipDates.clear();
            this.localTipArchive = false;
            FilteredSearchView.Delegate delegate = this.filtersDelegate;
            if (delegate != null) {
                delegate.updateFiltersView(false, null, this.localTipDates, false);
                return;
            }
            return;
        }
        this.searchAdapterHelper.mergeResults(this.searchResult, this.filtered2RecentSearchObjects);
        this.publicPostsTotalCount = 0;
        this.publicPostsLastRate = 0;
        this.publicPostsHashtag = null;
        this.publicPosts.clear();
        if (this.needMessagesSearch != 2 && trim.startsWith("#") && trim.length() == 1) {
            this.messagesSearchEndReached = true;
            if (this.searchAdapterHelper.loadRecentHashtags()) {
                this.searchResultMessages.clear();
                this.searchResultHashtags.clear();
                ArrayList hashtags = this.searchAdapterHelper.getHashtags();
                for (int i3 = 0; i3 < hashtags.size(); i3++) {
                    this.searchResultHashtags.add(((SearchAdapterHelper.HashtagObject) hashtags.get(i3)).hashtag);
                }
                this.globalSearchCollapsed = true;
                this.phoneCollapsed = true;
                this.waitingResponseCount = 0;
                notifyDataSetChanged();
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate3 = this.delegate;
                if (dialogsSearchAdapterDelegate3 != null) {
                    dialogsSearchAdapterDelegate3.searchStateChanged(false, false);
                }
            }
        } else {
            this.searchResultHashtags.clear();
        }
        final int i4 = this.lastSearchId + 1;
        this.lastSearchId = i4;
        this.waitingResponseCount = 3;
        this.globalSearchCollapsed = true;
        this.phoneCollapsed = true;
        notifyDataSetChanged();
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate4 = this.delegate;
        if (dialogsSearchAdapterDelegate4 != null) {
            dialogsSearchAdapterDelegate4.searchStateChanged(true, false);
        }
        if (z && trim != null) {
            String trim2 = trim.trim();
            if (trim2.length() > 1 && (trim2.charAt(0) == '#' || trim2.charAt(0) == '$')) {
                int indexOf = trim2.indexOf(64);
                String substring = trim2.substring(1);
                if (indexOf >= 0) {
                    trim2.substring(indexOf + 1);
                }
                str2 = substring;
            }
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$rOjakSgd_QB9gmSuL6Su3Ygpfsk(DialogsSearchAdapter.this, trim, i4, str);
            }
        };
        this.searchRunnable = runnable3;
        dispatchQueue.postRunnable(runnable3, 300L);
        if (str2 != null) {
            this.waitingResponseCount++;
            Runnable runnable4 = new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    DialogsSearchAdapter.$r8$lambda$JlRRQZw6T6QgTJ8KvLuHH-lGSUk(DialogsSearchAdapter.this, i4, str2);
                }
            };
            this.searchHashtagRunnable = runnable4;
            AndroidUtilities.runOnUIThread(runnable4, 300L);
        }
    }

    public static /* synthetic */ void $r8$lambda$kMWPmDpvnbv3zVHm83cjZR0JrpY(final DialogsSearchAdapter dialogsSearchAdapter, final TLObject tLObject, TLRPC.TL_error tL_error) {
        dialogsSearchAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$ZE5LTthMendYCC-TCgBFodqtguw(DialogsSearchAdapter.this, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$ZE5LTthMendYCC-TCgBFodqtguw(DialogsSearchAdapter dialogsSearchAdapter, TLObject tLObject) {
        dialogsSearchAdapter.sponsoredReqId = 0;
        if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
            if (dialogsSearchAdapter.sponsoredPeers.isEmpty()) {
                return;
            }
            dialogsSearchAdapter.sponsoredPeers.clear();
            dialogsSearchAdapter.notifyDataSetChanged();
            return;
        }
        if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
            TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
            MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putUsers(tL_contacts_sponsoredPeers.users, true);
            MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putChats(tL_contacts_sponsoredPeers.chats, true);
            dialogsSearchAdapter.sponsoredPeers.addAll(tL_contacts_sponsoredPeers.peers);
            dialogsSearchAdapter.notifyDataSetChanged();
        }
    }

    public static /* synthetic */ void $r8$lambda$rOjakSgd_QB9gmSuL6Su3Ygpfsk(final DialogsSearchAdapter dialogsSearchAdapter, final String str, final int i, final String str2) {
        dialogsSearchAdapter.searchRunnable = null;
        dialogsSearchAdapter.searchDialogsInternal(str, i);
        if (dialogsSearchAdapter.dialogsType == 15) {
            dialogsSearchAdapter.waitingResponseCount -= 2;
            return;
        }
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$hPyOeHBX3zNauHXU_eIJ8na7b9k(DialogsSearchAdapter.this, i, str, str2);
            }
        };
        dialogsSearchAdapter.searchRunnable2 = runnable;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static /* synthetic */ void $r8$lambda$hPyOeHBX3zNauHXU_eIJ8na7b9k(DialogsSearchAdapter dialogsSearchAdapter, int i, String str, String str2) {
        int i2;
        long j;
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        dialogsSearchAdapter.searchRunnable2 = null;
        if (i != dialogsSearchAdapter.lastSearchId) {
            return;
        }
        if (dialogsSearchAdapter.needMessagesSearch != 2 && (i2 = dialogsSearchAdapter.dialogsType) != 6 && i2 != 5 && dialogsSearchAdapter.delegate.getSearchForumDialogId() == 0) {
            SearchAdapterHelper searchAdapterHelper = dialogsSearchAdapter.searchAdapterHelper;
            int i3 = dialogsSearchAdapter.dialogsType;
            boolean z4 = i3 != 4;
            if (i3 == 4 || i3 == 11) {
                j = 0;
                z = false;
            } else {
                j = 0;
                z = true;
            }
            boolean z5 = i3 == 2 || i3 == 1;
            boolean z6 = i3 == 0;
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
            if (dialogsSearchAdapterDelegate != null) {
                j2 = dialogsSearchAdapterDelegate.getSearchForumDialogId();
                z3 = z6;
                z2 = z4;
            } else {
                j2 = j;
                z2 = z4;
                z3 = z6;
            }
            searchAdapterHelper.queryServerSearch(str, true, z2, true, z, z5, 0L, z3, 0, i, j2);
        } else {
            dialogsSearchAdapter.waitingResponseCount -= 2;
        }
        if (dialogsSearchAdapter.needMessagesSearch == 0 || dialogsSearchAdapter.dialogsType == 15) {
            dialogsSearchAdapter.waitingResponseCount--;
            return;
        }
        dialogsSearchAdapter.searchTopics(str2);
        dialogsSearchAdapter.searchMessagesInternal(str2, i);
        dialogsSearchAdapter.searchForumMessagesInternal(str2, i);
    }

    public static /* synthetic */ void $r8$lambda$JlRRQZw6T6QgTJ8KvLuHH-lGSUk(final DialogsSearchAdapter dialogsSearchAdapter, final int i, final String str) {
        dialogsSearchAdapter.searchHashtagRunnable = null;
        if (i != dialogsSearchAdapter.lastSearchId) {
            return;
        }
        if (dialogsSearchAdapter.searchHashtagRequest >= 0) {
            ConnectionsManager.getInstance(dialogsSearchAdapter.currentAccount).cancelRequest(dialogsSearchAdapter.searchHashtagRequest, true);
        }
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
        tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
        tL_channels_searchPosts.hashtag = str;
        tL_channels_searchPosts.limit = 3;
        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
        dialogsSearchAdapter.searchHashtagRequest = ConnectionsManager.getInstance(dialogsSearchAdapter.currentAccount).sendRequest(tL_channels_searchPosts, new RequestDelegate() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda32
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                DialogsSearchAdapter.$r8$lambda$nImDgWWS38mUhCab77wlf_Qszy0(DialogsSearchAdapter.this, i, str, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$nImDgWWS38mUhCab77wlf_Qszy0(final DialogsSearchAdapter dialogsSearchAdapter, final int i, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        dialogsSearchAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                DialogsSearchAdapter.$r8$lambda$PBgtg9A0ryyXt5gGwsRRpMyF3GQ(DialogsSearchAdapter.this, i, tLObject, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$PBgtg9A0ryyXt5gGwsRRpMyF3GQ(DialogsSearchAdapter dialogsSearchAdapter, int i, TLObject tLObject, String str) {
        int i2;
        if (i == dialogsSearchAdapter.lastSearchId && (tLObject instanceof TLRPC.messages_Messages)) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                i2 = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
            } else {
                i2 = messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
            }
            dialogsSearchAdapter.publicPostsTotalCount = i2;
            dialogsSearchAdapter.publicPostsLastRate = messages_messages.next_rate;
            dialogsSearchAdapter.publicPostsHashtag = str;
            MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(dialogsSearchAdapter.currentAccount).putChats(messages_messages.chats, false);
            for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                dialogsSearchAdapter.publicPosts.add(new MessageObject(dialogsSearchAdapter.currentAccount, messages_messages.messages.get(i3), false, true));
            }
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
            if (dialogsSearchAdapterDelegate != null) {
                dialogsSearchAdapterDelegate.searchStateChanged(dialogsSearchAdapter.waitingResponseCount > 0, true);
            }
            dialogsSearchAdapter.notifyDataSetChanged();
        }
    }

    public int getRecentItemsCount() {
        ArrayList arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
        return (!arrayList.isEmpty() ? arrayList.size() + 1 : 0) + (hasHints() ? 1 : 0);
    }

    public int getRecentResultsCount() {
        ArrayList arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 3;
        if (this.waitingResponseCount == 3) {
            return 0;
        }
        int size = !this.publicPosts.isEmpty() ? this.publicPosts.size() + 1 : 0;
        if (!this.searchResultHashtags.isEmpty()) {
            return size + this.searchResultHashtags.size() + 1;
        }
        if (isRecentSearchDisplayed()) {
            size += getRecentItemsCount();
            if (!this.searchWas) {
                return size;
            }
        }
        if (!this.searchTopics.isEmpty()) {
            size = size + 1 + this.searchTopics.size();
        }
        if (!this.searchContacts.isEmpty()) {
            size += this.searchContacts.size() + 1;
        }
        int size2 = this.searchResult.size();
        int size3 = this.searchAdapterHelper.getLocalServerSearch().size();
        int i2 = size + size2 + size3;
        int size4 = this.searchAdapterHelper.getGlobalSearch().size();
        if (size4 > 3 && this.globalSearchCollapsed) {
            size4 = 3;
        }
        int size5 = size4 + this.sponsoredPeers.size();
        int size6 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size6 > 3 && this.phoneCollapsed) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (getRecentItemsCount() > 0 || !this.searchTopics.isEmpty() || !this.publicPosts.isEmpty())) {
            i2++;
        }
        if (size5 != 0) {
            i2 += size5 + 1;
        }
        if (size6 != 0) {
            i2 += size6;
        }
        int size7 = this.searchForumResultMessages.size();
        if (size7 != 0) {
            i2 += size7 + 1 + (!this.localMessagesSearchEndReached ? 1 : 0);
        }
        if (!this.localMessagesSearchEndReached) {
            this.localMessagesLoadingRow = i2;
        }
        int size8 = this.searchResultMessages.size();
        if ((this.currentMessagesFilter == Filter.All && !this.forceLoadingMessages) || !this.searchResultMessages.isEmpty()) {
            i = size8;
        } else if (!this.forceLoadingMessages) {
            i = 1;
        }
        int i3 = (this.searchForumResultMessages.isEmpty() || this.localMessagesSearchEndReached) ? i : 0;
        if (i3 != 0) {
            i2 += i3 + 1 + (!this.messagesSearchEndReached ? 1 : 0);
        }
        if (this.localMessagesSearchEndReached) {
            this.localMessagesLoadingRow = i2;
        }
        this.currentItemCount = i2;
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    public Object getItem(int i) {
        int i2;
        int i3;
        TLRPC.Chat chat;
        int i4;
        if (!this.publicPosts.isEmpty()) {
            if (i > 0 && i - 1 < this.publicPosts.size()) {
                return this.publicPosts.get(i4);
            }
            i -= this.publicPosts.size() + 1;
        }
        if (!this.searchResultHashtags.isEmpty()) {
            if (i > 0) {
                return this.searchResultHashtags.get(i - 1);
            }
            return null;
        }
        if (isRecentSearchDisplayed()) {
            ?? hasHints = hasHints();
            ArrayList arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
            if (i > hasHints && (i3 = (i - 1) - (hasHints == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((RecentSearchObject) arrayList.get(i3)).object;
                if (!(tLObject instanceof TLRPC.User)) {
                    return (!(tLObject instanceof TLRPC.Chat) || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : chat;
                }
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.User) tLObject).id));
                return user != null ? user : tLObject;
            }
            i -= getRecentItemsCount();
        }
        if (!this.searchTopics.isEmpty()) {
            if (i > 0 && i <= this.searchTopics.size()) {
                return this.searchTopics.get(i - 1);
            }
            i -= this.searchTopics.size() + 1;
        }
        if (!this.searchContacts.isEmpty()) {
            if (i > 0 && i <= this.searchContacts.size()) {
                return this.searchContacts.get(i - 1);
            }
            i -= this.searchContacts.size() + 1;
        }
        ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
        ArrayList localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
        ArrayList phoneSearch = this.searchAdapterHelper.getPhoneSearch();
        int size = this.searchResult.size();
        int size2 = localServerSearch.size();
        if (size + size2 > 0 && (getRecentItemsCount() > 0 || !this.searchTopics.isEmpty() || !this.publicPosts.isEmpty())) {
            if (i == 0) {
                return null;
            }
            i--;
        }
        int size3 = phoneSearch.size();
        if (size3 > 3 && this.phoneCollapsed) {
            size3 = 3;
        }
        int size4 = globalSearch.size();
        int i5 = 0;
        int size5 = (globalSearch.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : ((size4 <= 3 || !this.globalSearchCollapsed) ? size4 : 3) + this.sponsoredPeers.size() + 1;
        if (i >= 0 && i < size) {
            return this.searchResult.get(i);
        }
        int i6 = i - size;
        if (i6 >= 0 && i6 < size2) {
            return localServerSearch.get(i6);
        }
        int i7 = i6 - size2;
        if (i7 >= 0 && i7 < size3) {
            return phoneSearch.get(i7);
        }
        int i8 = i7 - size3;
        if (i8 <= 0 || i8 >= size5) {
            i2 = i8 - size5;
        } else {
            int i9 = i8 - 1;
            if (i9 >= 0 && i9 < this.sponsoredPeers.size()) {
                return this.sponsoredPeers.get(i9);
            }
            i2 = i9 - this.sponsoredPeers.size();
            if (i2 >= 0 && i2 < globalSearch.size()) {
                return globalSearch.get(i2);
            }
        }
        int size6 = this.searchForumResultMessages.isEmpty() ? 0 : this.searchForumResultMessages.size() + 1;
        if (i2 > 0 && i2 <= this.searchForumResultMessages.size()) {
            return this.searchForumResultMessages.get(i2 - 1);
        }
        if (!this.localMessagesSearchEndReached && !this.searchForumResultMessages.isEmpty()) {
            i5 = 1;
        }
        int i10 = i2 - (size6 + i5);
        if (!this.searchResultMessages.isEmpty()) {
            this.searchResultMessages.size();
        }
        if (i10 <= 0 || i10 > this.searchResultMessages.size()) {
            return null;
        }
        return this.searchResultMessages.get(i10 - 1);
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean isGlobalSearch(int i) {
        if (!this.searchWas || !this.searchResultHashtags.isEmpty()) {
            return false;
        }
        if (!this.publicPosts.isEmpty()) {
            i -= this.publicPosts.size() + 1;
        }
        if (isRecentSearchDisplayed()) {
            ?? hasHints = hasHints();
            ArrayList arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
            if (i > hasHints && (i - 1) - (hasHints == true ? 1 : 0) < arrayList.size()) {
                return false;
            }
            i -= getRecentItemsCount();
        }
        ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
        ArrayList localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
        int size = this.searchResult.size();
        int size2 = localServerSearch.size();
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size3 > 3 && this.phoneCollapsed) {
            size3 = 3;
        }
        int size4 = globalSearch.size();
        int size5 = (globalSearch.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : ((size4 <= 3 || !this.globalSearchCollapsed) ? size4 : 3) + this.sponsoredPeers.size() + 1;
        int size6 = this.searchContacts.size();
        if (size6 > 0) {
            if (i >= 0 && i < size6) {
                return false;
            }
            i -= size6 + 1;
        }
        if (size + size2 > 0 && (getRecentItemsCount() > 0 || !this.searchTopics.isEmpty() || !this.publicPosts.isEmpty())) {
            if (i == 0) {
                return false;
            }
            i--;
        }
        if (i >= 0 && i < size) {
            return false;
        }
        int i2 = i - size;
        if (i2 >= 0 && i2 < size2) {
            return false;
        }
        int i3 = i2 - size2;
        if (i3 > 0 && i3 < size3) {
            return false;
        }
        int i4 = i3 - size3;
        if (i4 > 0 && i4 < size5) {
            return true;
        }
        int i5 = i4 - size5;
        int size7 = this.searchForumResultMessages.isEmpty() ? 0 : this.searchForumResultMessages.size() + 1;
        if (i5 > 0 && i5 < size7) {
            return false;
        }
        if (!this.searchResultMessages.isEmpty()) {
            this.searchResultMessages.size();
        }
        if (this.currentMessagesFilter != Filter.All || this.forceLoadingMessages) {
            this.searchResultMessages.isEmpty();
        }
        return false;
    }

    @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return (itemViewType == 1 || itemViewType == 4 || itemViewType == 10) ? false : true;
    }

    public static /* synthetic */ void $r8$lambda$-pvv1W5vFLs_XyTXnspTPmObJts(DialogsSearchAdapter dialogsSearchAdapter, View view, int i) {
        dialogsSearchAdapter.getClass();
        if (view instanceof HintDialogCell) {
            HintDialogCell hintDialogCell = (HintDialogCell) view;
            if (hintDialogCell.isBlocked()) {
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.didPressedBlockedDialog(view, hintDialogCell.getDialogId());
                    return;
                }
                return;
            }
        }
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = dialogsSearchAdapter.delegate;
        if (dialogsSearchAdapterDelegate2 != null) {
            dialogsSearchAdapterDelegate2.didPressedOnSubDialog(((Long) view.getTag()).longValue());
        }
    }

    public static /* synthetic */ boolean $r8$lambda$VSrE8fb5RTQtdpCm6YYi7QrhjEc(DialogsSearchAdapter dialogsSearchAdapter, View view, int i) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
        if (dialogsSearchAdapterDelegate == null) {
            return true;
        }
        dialogsSearchAdapterDelegate.needRemoveHint(((Long) view.getTag()).longValue());
        return true;
    }

    public static /* synthetic */ void $r8$lambda$cgtB9Jcvb3YvksHGO4J3OFBkQhw(DialogsSearchAdapter dialogsSearchAdapter) {
        dialogsSearchAdapter.getClass();
        dialogsSearchAdapter.currentMessagesFilter = Filter.All;
        dialogsSearchAdapter.searchResultMessages.clear();
        int i = dialogsSearchAdapter.messagesSectionPosition;
        if (i >= 0 && i < dialogsSearchAdapter.getItemCount()) {
            dialogsSearchAdapter.notifyItemChanged(dialogsSearchAdapter.messagesSectionPosition);
        }
        dialogsSearchAdapter.loadMoreSearchMessages();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        switch (i) {
            case 0:
                view = new ProfileSearchCell(this.mContext).showPremiumBlock(this.dialogsType == 3);
                break;
            case 1:
                view = new GraySectionCell(this.mContext);
                break;
            case 2:
            case 9:
                view = new DialogCell(null, this.mContext, false, true) { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter.3
                    @Override // org.telegram.ui.Cells.DialogCell
                    public boolean isForumCell() {
                        return false;
                    }
                };
                break;
            case 3:
                view2 = new TopicSearchCell(this.mContext);
                view = view2;
                break;
            case 4:
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setViewType(1);
                flickerLoadingView.setIsSingleCell(true);
                view2 = flickerLoadingView;
                view = view2;
                break;
            case 5:
                view2 = new HashtagSearchCell(this.mContext);
                view = view2;
                break;
            case 6:
                RecyclerListView recyclerListView = new RecyclerListView(this.mContext) { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter.4
                    @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        if (getParent() != null && getParent().getParent() != null) {
                            ViewParent parent = getParent().getParent();
                            boolean z = true;
                            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                                z = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z);
                        }
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                };
                recyclerListView.setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector));
                recyclerListView.setTag(9);
                recyclerListView.setItemAnimator(null);
                recyclerListView.setLayoutAnimation(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext) { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter.5
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                linearLayoutManager.setOrientation(0);
                recyclerListView.setLayoutManager(linearLayoutManager);
                recyclerListView.setAdapter(new CategoryAdapterRecycler(this.mContext, this.currentAccount, false, this.dialogsType == 3, this.resourcesProvider));
                recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda6
                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                    public final void onItemClick(View view3, int i2) {
                        DialogsSearchAdapter.$r8$lambda$-pvv1W5vFLs_XyTXnspTPmObJts(DialogsSearchAdapter.this, view3, i2);
                    }
                });
                recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda7
                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
                    public final boolean onItemClick(View view3, int i2) {
                        return DialogsSearchAdapter.$r8$lambda$VSrE8fb5RTQtdpCm6YYi7QrhjEc(DialogsSearchAdapter.this, view3, i2);
                    }
                });
                this.innerListView = recyclerListView;
                view2 = recyclerListView;
                view = view2;
                break;
            case 7:
            default:
                view2 = new TextCell(this.mContext, 16, false);
                view = view2;
                break;
            case 8:
                view2 = new ProfileSearchCell(this.mContext);
                view = view2;
                break;
            case 10:
                EmptyLayout emptyLayout = new EmptyLayout(this.mContext, this.resourcesProvider, new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogsSearchAdapter.$r8$lambda$cgtB9Jcvb3YvksHGO4J3OFBkQhw(DialogsSearchAdapter.this);
                    }
                });
                this.messagesEmptyLayout = emptyLayout;
                emptyLayout.setQuery(this.lastMessagesSearchString);
                view2 = emptyLayout;
                view = view2;
                break;
        }
        if (i == 5) {
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(86.0f)));
        } else {
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        }
        return new RecyclerListView.Holder(view);
    }

    private boolean hasHints() {
        if (this.searchWas || MediaDataController.getInstance(this.currentAccount).hints.isEmpty()) {
            return false;
        }
        return this.dialogsType != 14 || this.dialogsActivity.allowUsers;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x04fb, code lost:
    
        if (r30.publicPosts.isEmpty() != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05a4, code lost:
    
        if (r2.toString().startsWith("@" + r7) != false) goto L257;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x067a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0365  */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r6v20, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        char c;
        int i2;
        Object obj;
        TLRPC.User user;
        TLRPC.Chat chat;
        String str;
        ArrayList<TLRPC.TL_username> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        ?? r5;
        String publicUsername;
        boolean z;
        int size;
        int size2;
        boolean z2;
        int size3;
        int size4;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        boolean z3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        boolean z4;
        CharSequence charSequence7;
        CharSequence charSequence8;
        int i3;
        CharSequence charSequence9;
        CharSequence charSequence10;
        String formatPluralStringSpaced;
        String str2;
        CharSequence charSequence11;
        CharSequence charSequence12;
        String str3;
        String str4;
        String str5;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        int i4;
        String str6;
        String str7;
        CharSequence charSequence13;
        final Runnable runnable;
        final int i5 = i;
        switch (viewHolder.getItemViewType()) {
            case 0:
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                profileSearchCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                long dialogId = profileSearchCell.getDialogId();
                boolean isGlobalSearch = isGlobalSearch(i5);
                Object item = getItem(i5);
                boolean z5 = item instanceof TLRPC.TL_sponsoredPeer;
                if (z5) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item;
                    seenSponsoredPeer(tL_sponsoredPeer);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_sponsoredPeer.peer);
                    if (peerDialogId >= 0) {
                        c = 2;
                        user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            arrayList = user.usernames;
                            publicUsername = DialogObject.getPublicUsername(user, this.currentMessagesQuery);
                        } else {
                            obj = item;
                            chat3 = null;
                        }
                    } else {
                        c = 2;
                        TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        if (chat4 != null) {
                            arrayList = chat4.usernames;
                            chat2 = chat4;
                            obj = item;
                            str = DialogObject.getPublicUsername(chat4, this.currentMessagesQuery);
                            user = null;
                            i2 = 1;
                            chat = chat2;
                            encryptedChat = null;
                            r5 = chat;
                            if (!this.publicPosts.isEmpty()) {
                                i5 -= this.publicPosts.size() + i2;
                            }
                            if (isRecentSearchDisplayed()) {
                                if (i5 < getRecentItemsCount()) {
                                    profileSearchCell.useSeparator = i5 != getRecentItemsCount() - i2;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                i5 -= getRecentItemsCount();
                            } else {
                                z = false;
                            }
                            if (!this.searchTopics.isEmpty()) {
                                i5 -= this.searchTopics.size() + i2;
                            }
                            ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
                            ArrayList phoneSearch = this.searchAdapterHelper.getPhoneSearch();
                            size = this.searchResult.size();
                            size2 = this.searchAdapterHelper.getLocalServerSearch().size();
                            if (size + size2 > 0) {
                                if (getRecentItemsCount() <= 0) {
                                    z2 = isGlobalSearch;
                                    if (this.searchTopics.isEmpty()) {
                                        break;
                                    }
                                } else {
                                    z2 = isGlobalSearch;
                                }
                                i5--;
                            } else {
                                z2 = isGlobalSearch;
                            }
                            size3 = phoneSearch.size();
                            if (size3 > 3 && this.phoneCollapsed) {
                                size3 = 3;
                            }
                            int i6 = (size3 > 0 || !(phoneSearch.get(size3 + (-1)) instanceof String)) ? size3 : size3 - 2;
                            size4 = globalSearch.size();
                            int i7 = i6;
                            if (size4 > 3 && this.globalSearchCollapsed) {
                                size4 = 3;
                            }
                            int size5 = (globalSearch.isEmpty() || !this.sponsoredPeers.isEmpty()) ? size4 + this.sponsoredPeers.size() + 1 : 0;
                            if (!z) {
                                profileSearchCell.useSeparator = (i5 == (getItemCount() - getRecentItemsCount()) + (-1) || i5 == ((size + i7) + size2) + (-1) || i5 == (((size + size5) + size3) + size2) + (-1)) ? false : true;
                            }
                            if (i5 >= 0 || i5 >= this.searchResult.size() || user != null) {
                                charSequence = null;
                            } else {
                                charSequence = (CharSequence) this.searchResultNames.get(i5);
                                String publicUsername2 = UserObject.getPublicUsername(user);
                                if (charSequence != null && user != null && publicUsername2 != null) {
                                    break;
                                }
                                charSequence2 = charSequence;
                                charSequence = null;
                                if (charSequence == null) {
                                    String lastFoundUsername = z ? this.filteredRecentQuery : this.searchAdapterHelper.getLastFoundUsername();
                                    if (!TextUtils.isEmpty(lastFoundUsername)) {
                                        if (user != null) {
                                            str2 = ContactsController.formatName(user.first_name, user.last_name);
                                        } else if (r5 == 0) {
                                            str2 = null;
                                        } else if (r5.monoforum) {
                                            str2 = ForumUtilities.getMonoForumTitle(this.currentAccount, r5);
                                        } else {
                                            str2 = r5.title;
                                        }
                                        if (str2 != null) {
                                            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str2, lastFoundUsername);
                                            charSequence3 = charSequence;
                                            if (indexOfIgnoreCase != -1) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                                                z3 = z5;
                                                spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), indexOfIgnoreCase, lastFoundUsername.length() + indexOfIgnoreCase, 33);
                                                charSequence11 = spannableStringBuilder;
                                                if (arrayList != null) {
                                                    int i8 = 1;
                                                    if (arrayList.size() > 1) {
                                                        String substring = lastFoundUsername.startsWith("@") ? lastFoundUsername.substring(1) : lastFoundUsername;
                                                        int size6 = arrayList.size();
                                                        int i9 = 0;
                                                        CharSequence charSequence14 = charSequence11;
                                                        while (true) {
                                                            if (i9 < size6) {
                                                                TLRPC.TL_username tL_username = arrayList.get(i9);
                                                                i9 += i8;
                                                                TLRPC.TL_username tL_username2 = tL_username;
                                                                charSequence12 = charSequence14;
                                                                if (tL_username2.active && tL_username2.username.startsWith(substring)) {
                                                                    str4 = tL_username2.username;
                                                                } else {
                                                                    charSequence14 = charSequence12;
                                                                    i8 = 1;
                                                                }
                                                            } else {
                                                                charSequence12 = charSequence14;
                                                                str4 = null;
                                                            }
                                                        }
                                                        if (str4 == null) {
                                                            int size7 = arrayList.size();
                                                            int i10 = 0;
                                                            while (i10 < size7) {
                                                                TLRPC.TL_username tL_username3 = arrayList.get(i10);
                                                                i10++;
                                                                TLRPC.TL_username tL_username4 = tL_username3;
                                                                String str8 = str4;
                                                                if (tL_username4.active && tL_username4.username.contains(substring)) {
                                                                    str5 = tL_username4.username;
                                                                    if (str5 != null) {
                                                                        str = str5;
                                                                    }
                                                                    if (str == null && (user == null || z2)) {
                                                                        if (lastFoundUsername.startsWith("@")) {
                                                                            lastFoundUsername = lastFoundUsername.substring(1);
                                                                        }
                                                                        try {
                                                                            ?? spannableStringBuilder2 = new SpannableStringBuilder();
                                                                            spannableStringBuilder2.append("@");
                                                                            spannableStringBuilder2.append(str);
                                                                            int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str, lastFoundUsername);
                                                                            str3 = spannableStringBuilder2;
                                                                            if (indexOfIgnoreCase2 != -1) {
                                                                                int length = lastFoundUsername.length();
                                                                                if (indexOfIgnoreCase2 == 0) {
                                                                                    length++;
                                                                                } else {
                                                                                    indexOfIgnoreCase2++;
                                                                                }
                                                                                spannableStringBuilder2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                                                                str3 = spannableStringBuilder2;
                                                                            }
                                                                        } catch (Exception e) {
                                                                            FileLog.e(e);
                                                                            str3 = str;
                                                                        }
                                                                        charSequence6 = charSequence12;
                                                                        charSequence5 = str3;
                                                                        profileSearchCell.setChecked(false, false);
                                                                        if (user == null) {
                                                                        }
                                                                        z4 = false;
                                                                        charSequence8 = charSequence5;
                                                                        charSequence7 = charSequence6;
                                                                        CharSequence charSequence15 = charSequence7;
                                                                        if (r5 == 0) {
                                                                        }
                                                                        if (user != null) {
                                                                            String formatPluralStringSpaced2 = LocaleController.formatPluralStringSpaced("BotUsersShort", i3);
                                                                            if (!(charSequence8 instanceof SpannableStringBuilder)) {
                                                                            }
                                                                        }
                                                                        charSequence9 = charSequence8;
                                                                        charSequence10 = charSequence9;
                                                                        profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                                                            @Override // org.telegram.messenger.Utilities.Callback
                                                                            public final void run(Object obj2) {
                                                                                DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                                                            }
                                                                        });
                                                                        profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                                                            @Override // org.telegram.messenger.Utilities.Callback2
                                                                            public final void run(Object obj2, Object obj3) {
                                                                                DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                                                            }
                                                                        });
                                                                        profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                                                                        profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence15, charSequence10, true, z4);
                                                                        profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                                                                    } else {
                                                                        charSequence4 = charSequence12;
                                                                        charSequence5 = charSequence3;
                                                                        charSequence6 = charSequence4;
                                                                        profileSearchCell.setChecked(false, false);
                                                                        if (user == null && user.id == this.selfUserId && this.dialogsType != 16) {
                                                                            charSequence8 = null;
                                                                            z4 = true;
                                                                            charSequence7 = LocaleController.getString(R.string.SavedMessages);
                                                                        } else {
                                                                            z4 = false;
                                                                            charSequence8 = charSequence5;
                                                                            charSequence7 = charSequence6;
                                                                        }
                                                                        CharSequence charSequence152 = charSequence7;
                                                                        if (r5 == 0 && r5.participants_count != 0) {
                                                                            if (ChatObject.isChannel(r5) && !r5.megagroup) {
                                                                                formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("Subscribers", r5.participants_count);
                                                                            } else {
                                                                                formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("Members", r5.participants_count);
                                                                            }
                                                                            if (charSequence8 instanceof SpannableStringBuilder) {
                                                                                ((SpannableStringBuilder) charSequence8).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced);
                                                                            } else if (TextUtils.isEmpty(charSequence8)) {
                                                                                charSequence8 = formatPluralStringSpaced;
                                                                            } else {
                                                                                CharSequence[] charSequenceArr = new CharSequence[3];
                                                                                charSequenceArr[0] = charSequence8;
                                                                                charSequenceArr[1] = ", ";
                                                                                charSequenceArr[c] = formatPluralStringSpaced;
                                                                                charSequence10 = TextUtils.concat(charSequenceArr);
                                                                                profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                                                                    @Override // org.telegram.messenger.Utilities.Callback
                                                                                    public final void run(Object obj2) {
                                                                                        DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                                                                    }
                                                                                });
                                                                                profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                                                                    @Override // org.telegram.messenger.Utilities.Callback2
                                                                                    public final void run(Object obj2, Object obj3) {
                                                                                        DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                                                                    }
                                                                                });
                                                                                profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                                                                                profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence152, charSequence10, true, z4);
                                                                                profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                                                                            }
                                                                        } else if (user != null && user.bot && (i3 = user.bot_active_users) != 0) {
                                                                            String formatPluralStringSpaced22 = LocaleController.formatPluralStringSpaced("BotUsersShort", i3);
                                                                            if (!(charSequence8 instanceof SpannableStringBuilder)) {
                                                                                ((SpannableStringBuilder) charSequence8).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced22);
                                                                            } else {
                                                                                if (TextUtils.isEmpty(charSequence8)) {
                                                                                    charSequence9 = formatPluralStringSpaced22;
                                                                                } else {
                                                                                    CharSequence[] charSequenceArr2 = new CharSequence[3];
                                                                                    charSequenceArr2[0] = charSequence8;
                                                                                    charSequenceArr2[1] = ", ";
                                                                                    charSequenceArr2[c] = formatPluralStringSpaced22;
                                                                                    charSequence9 = TextUtils.concat(charSequenceArr2);
                                                                                }
                                                                                charSequence10 = charSequence9;
                                                                                profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                                                                    @Override // org.telegram.messenger.Utilities.Callback
                                                                                    public final void run(Object obj2) {
                                                                                        DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                                                                    }
                                                                                });
                                                                                profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                                                                    @Override // org.telegram.messenger.Utilities.Callback2
                                                                                    public final void run(Object obj2, Object obj3) {
                                                                                        DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                                                                    }
                                                                                });
                                                                                profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                                                                                profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence152, charSequence10, true, z4);
                                                                                profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                                                                                break;
                                                                            }
                                                                        }
                                                                        charSequence9 = charSequence8;
                                                                        charSequence10 = charSequence9;
                                                                        profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                                                            @Override // org.telegram.messenger.Utilities.Callback
                                                                            public final void run(Object obj2) {
                                                                                DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                                                            }
                                                                        });
                                                                        profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                                                            @Override // org.telegram.messenger.Utilities.Callback2
                                                                            public final void run(Object obj2, Object obj3) {
                                                                                DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                                                            }
                                                                        });
                                                                        profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                                                                        profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence152, charSequence10, true, z4);
                                                                        profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                                                                    }
                                                                } else {
                                                                    str4 = str8;
                                                                }
                                                            }
                                                        }
                                                        str5 = str4;
                                                        if (str5 != null) {
                                                        }
                                                        if (str == null) {
                                                        }
                                                        charSequence4 = charSequence12;
                                                        charSequence5 = charSequence3;
                                                        charSequence6 = charSequence4;
                                                        profileSearchCell.setChecked(false, false);
                                                        if (user == null) {
                                                        }
                                                        z4 = false;
                                                        charSequence8 = charSequence5;
                                                        charSequence7 = charSequence6;
                                                        CharSequence charSequence1522 = charSequence7;
                                                        if (r5 == 0) {
                                                        }
                                                        if (user != null) {
                                                        }
                                                        charSequence9 = charSequence8;
                                                        charSequence10 = charSequence9;
                                                        profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                                            @Override // org.telegram.messenger.Utilities.Callback
                                                            public final void run(Object obj2) {
                                                                DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                                            }
                                                        });
                                                        profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                                            @Override // org.telegram.messenger.Utilities.Callback2
                                                            public final void run(Object obj2, Object obj3) {
                                                                DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                                            }
                                                        });
                                                        profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                                                        profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence1522, charSequence10, true, z4);
                                                        profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                                                    }
                                                }
                                                charSequence12 = charSequence11;
                                                if (str == null) {
                                                }
                                                charSequence4 = charSequence12;
                                                charSequence5 = charSequence3;
                                                charSequence6 = charSequence4;
                                                profileSearchCell.setChecked(false, false);
                                                if (user == null) {
                                                }
                                                z4 = false;
                                                charSequence8 = charSequence5;
                                                charSequence7 = charSequence6;
                                                CharSequence charSequence15222 = charSequence7;
                                                if (r5 == 0) {
                                                }
                                                if (user != null) {
                                                }
                                                charSequence9 = charSequence8;
                                                charSequence10 = charSequence9;
                                                profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                                    @Override // org.telegram.messenger.Utilities.Callback
                                                    public final void run(Object obj2) {
                                                        DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                                    }
                                                });
                                                profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                                    @Override // org.telegram.messenger.Utilities.Callback2
                                                    public final void run(Object obj2, Object obj3) {
                                                        DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                                    }
                                                });
                                                profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                                                profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence15222, charSequence10, true, z4);
                                                profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                                            }
                                        } else {
                                            charSequence3 = charSequence;
                                        }
                                        z3 = z5;
                                        charSequence11 = charSequence2;
                                        if (arrayList != null) {
                                        }
                                        charSequence12 = charSequence11;
                                        if (str == null) {
                                        }
                                        charSequence4 = charSequence12;
                                        charSequence5 = charSequence3;
                                        charSequence6 = charSequence4;
                                        profileSearchCell.setChecked(false, false);
                                        if (user == null) {
                                        }
                                        z4 = false;
                                        charSequence8 = charSequence5;
                                        charSequence7 = charSequence6;
                                        CharSequence charSequence152222 = charSequence7;
                                        if (r5 == 0) {
                                        }
                                        if (user != null) {
                                        }
                                        charSequence9 = charSequence8;
                                        charSequence10 = charSequence9;
                                        profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj2) {
                                                DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                            }
                                        });
                                        profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                            @Override // org.telegram.messenger.Utilities.Callback2
                                            public final void run(Object obj2, Object obj3) {
                                                DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                            }
                                        });
                                        profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                                        profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence152222, charSequence10, true, z4);
                                        profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                                    }
                                }
                                charSequence3 = charSequence;
                                z3 = z5;
                                charSequence4 = charSequence2;
                                charSequence5 = charSequence3;
                                charSequence6 = charSequence4;
                                profileSearchCell.setChecked(false, false);
                                if (user == null) {
                                }
                                z4 = false;
                                charSequence8 = charSequence5;
                                charSequence7 = charSequence6;
                                CharSequence charSequence1522222 = charSequence7;
                                if (r5 == 0) {
                                }
                                if (user != null) {
                                }
                                charSequence9 = charSequence8;
                                charSequence10 = charSequence9;
                                profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj2) {
                                        DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                    }
                                });
                                profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                    @Override // org.telegram.messenger.Utilities.Callback2
                                    public final void run(Object obj2, Object obj3) {
                                        DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                    }
                                });
                                profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                                profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence1522222, charSequence10, true, z4);
                                profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                            }
                            charSequence2 = null;
                            if (charSequence == null) {
                            }
                            charSequence3 = charSequence;
                            z3 = z5;
                            charSequence4 = charSequence2;
                            charSequence5 = charSequence3;
                            charSequence6 = charSequence4;
                            profileSearchCell.setChecked(false, false);
                            if (user == null) {
                            }
                            z4 = false;
                            charSequence8 = charSequence5;
                            charSequence7 = charSequence6;
                            CharSequence charSequence15222222 = charSequence7;
                            if (r5 == 0) {
                            }
                            if (user != null) {
                            }
                            charSequence9 = charSequence8;
                            charSequence10 = charSequence9;
                            profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj2) {
                                    DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                }
                            });
                            profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                @Override // org.telegram.messenger.Utilities.Callback2
                                public final void run(Object obj2, Object obj3) {
                                    DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                }
                            });
                            profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                            profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence15222222, charSequence10, true, z4);
                            profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                        } else {
                            chat3 = chat4;
                            obj = item;
                            user = null;
                        }
                    }
                    str = null;
                    arrayList = null;
                    chat2 = chat3;
                    i2 = 1;
                    chat = chat2;
                    encryptedChat = null;
                    r5 = chat;
                    if (!this.publicPosts.isEmpty()) {
                    }
                    if (isRecentSearchDisplayed()) {
                    }
                    if (!this.searchTopics.isEmpty()) {
                    }
                    ArrayList globalSearch2 = this.searchAdapterHelper.getGlobalSearch();
                    ArrayList phoneSearch2 = this.searchAdapterHelper.getPhoneSearch();
                    size = this.searchResult.size();
                    size2 = this.searchAdapterHelper.getLocalServerSearch().size();
                    if (size + size2 > 0) {
                    }
                    size3 = phoneSearch2.size();
                    if (size3 > 3) {
                        size3 = 3;
                    }
                    if (size3 > 0) {
                    }
                    size4 = globalSearch2.size();
                    int i72 = i6;
                    if (size4 > 3) {
                        size4 = 3;
                    }
                    if (globalSearch2.isEmpty()) {
                    }
                    if (!z) {
                    }
                    if (i5 >= 0) {
                    }
                    charSequence = null;
                    charSequence2 = null;
                    if (charSequence == null) {
                    }
                    charSequence3 = charSequence;
                    z3 = z5;
                    charSequence4 = charSequence2;
                    charSequence5 = charSequence3;
                    charSequence6 = charSequence4;
                    profileSearchCell.setChecked(false, false);
                    if (user == null) {
                    }
                    z4 = false;
                    charSequence8 = charSequence5;
                    charSequence7 = charSequence6;
                    CharSequence charSequence152222222 = charSequence7;
                    if (r5 == 0) {
                    }
                    if (user != null) {
                    }
                    charSequence9 = charSequence8;
                    charSequence10 = charSequence9;
                    profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj2) {
                            DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                        }
                    });
                    profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj2, Object obj3) {
                            DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                        }
                    });
                    profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                    profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence152222222, charSequence10, true, z4);
                    profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                } else {
                    c = 2;
                    if (item instanceof TLRPC.User) {
                        user = (TLRPC.User) item;
                        arrayList = user.usernames;
                        publicUsername = DialogObject.getPublicUsername(user, this.currentMessagesQuery);
                    } else {
                        if (item instanceof TLRPC.Chat) {
                            TLRPC.Chat chat5 = (TLRPC.Chat) item;
                            i2 = 1;
                            TLRPC.Chat chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat5.id));
                            if (chat6 == null) {
                                chat6 = chat5;
                            }
                            arrayList = chat6.usernames;
                            str = DialogObject.getPublicUsername(chat6, this.currentMessagesQuery);
                            chat = chat6;
                            obj = item;
                            user = null;
                        } else {
                            i2 = 1;
                            if (item instanceof TLRPC.EncryptedChat) {
                                TLRPC.EncryptedChat encryptedChat2 = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) item).id));
                                obj = item;
                                encryptedChat = encryptedChat2;
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat2.user_id));
                                r5 = 0;
                                str = null;
                                arrayList = null;
                                if (!this.publicPosts.isEmpty()) {
                                }
                                if (isRecentSearchDisplayed()) {
                                }
                                if (!this.searchTopics.isEmpty()) {
                                }
                                ArrayList globalSearch22 = this.searchAdapterHelper.getGlobalSearch();
                                ArrayList phoneSearch22 = this.searchAdapterHelper.getPhoneSearch();
                                size = this.searchResult.size();
                                size2 = this.searchAdapterHelper.getLocalServerSearch().size();
                                if (size + size2 > 0) {
                                }
                                size3 = phoneSearch22.size();
                                if (size3 > 3) {
                                }
                                if (size3 > 0) {
                                }
                                size4 = globalSearch22.size();
                                int i722 = i6;
                                if (size4 > 3) {
                                }
                                if (globalSearch22.isEmpty()) {
                                }
                                if (!z) {
                                }
                                if (i5 >= 0) {
                                }
                                charSequence = null;
                                charSequence2 = null;
                                if (charSequence == null) {
                                }
                                charSequence3 = charSequence;
                                z3 = z5;
                                charSequence4 = charSequence2;
                                charSequence5 = charSequence3;
                                charSequence6 = charSequence4;
                                profileSearchCell.setChecked(false, false);
                                if (user == null) {
                                }
                                z4 = false;
                                charSequence8 = charSequence5;
                                charSequence7 = charSequence6;
                                CharSequence charSequence1522222222 = charSequence7;
                                if (r5 == 0) {
                                }
                                if (user != null) {
                                }
                                charSequence9 = charSequence8;
                                charSequence10 = charSequence9;
                                profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj2) {
                                        DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                                    }
                                });
                                profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                                    @Override // org.telegram.messenger.Utilities.Callback2
                                    public final void run(Object obj2, Object obj3) {
                                        DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                                    }
                                });
                                profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                                profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence1522222222, charSequence10, true, z4);
                                profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                            } else {
                                obj = item;
                                user = null;
                                chat = null;
                                str = null;
                                arrayList = null;
                            }
                        }
                        encryptedChat = null;
                        r5 = chat;
                        if (!this.publicPosts.isEmpty()) {
                        }
                        if (isRecentSearchDisplayed()) {
                        }
                        if (!this.searchTopics.isEmpty()) {
                        }
                        ArrayList globalSearch222 = this.searchAdapterHelper.getGlobalSearch();
                        ArrayList phoneSearch222 = this.searchAdapterHelper.getPhoneSearch();
                        size = this.searchResult.size();
                        size2 = this.searchAdapterHelper.getLocalServerSearch().size();
                        if (size + size2 > 0) {
                        }
                        size3 = phoneSearch222.size();
                        if (size3 > 3) {
                        }
                        if (size3 > 0) {
                        }
                        size4 = globalSearch222.size();
                        int i7222 = i6;
                        if (size4 > 3) {
                        }
                        if (globalSearch222.isEmpty()) {
                        }
                        if (!z) {
                        }
                        if (i5 >= 0) {
                        }
                        charSequence = null;
                        charSequence2 = null;
                        if (charSequence == null) {
                        }
                        charSequence3 = charSequence;
                        z3 = z5;
                        charSequence4 = charSequence2;
                        charSequence5 = charSequence3;
                        charSequence6 = charSequence4;
                        profileSearchCell.setChecked(false, false);
                        if (user == null) {
                        }
                        z4 = false;
                        charSequence8 = charSequence5;
                        charSequence7 = charSequence6;
                        CharSequence charSequence15222222222 = charSequence7;
                        if (r5 == 0) {
                        }
                        if (user != null) {
                        }
                        charSequence9 = charSequence8;
                        charSequence10 = charSequence9;
                        profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj2) {
                                DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                            }
                        });
                        profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj2, Object obj3) {
                                DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                            }
                        });
                        profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                        profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence15222222222, charSequence10, true, z4);
                        profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                    }
                }
                obj = item;
                str = publicUsername;
                chat2 = null;
                i2 = 1;
                chat = chat2;
                encryptedChat = null;
                r5 = chat;
                if (!this.publicPosts.isEmpty()) {
                }
                if (isRecentSearchDisplayed()) {
                }
                if (!this.searchTopics.isEmpty()) {
                }
                ArrayList globalSearch2222 = this.searchAdapterHelper.getGlobalSearch();
                ArrayList phoneSearch2222 = this.searchAdapterHelper.getPhoneSearch();
                size = this.searchResult.size();
                size2 = this.searchAdapterHelper.getLocalServerSearch().size();
                if (size + size2 > 0) {
                }
                size3 = phoneSearch2222.size();
                if (size3 > 3) {
                }
                if (size3 > 0) {
                }
                size4 = globalSearch2222.size();
                int i72222 = i6;
                if (size4 > 3) {
                }
                if (globalSearch2222.isEmpty()) {
                }
                if (!z) {
                }
                if (i5 >= 0) {
                }
                charSequence = null;
                charSequence2 = null;
                if (charSequence == null) {
                }
                charSequence3 = charSequence;
                z3 = z5;
                charSequence4 = charSequence2;
                charSequence5 = charSequence3;
                charSequence6 = charSequence4;
                profileSearchCell.setChecked(false, false);
                if (user == null) {
                }
                z4 = false;
                charSequence8 = charSequence5;
                charSequence7 = charSequence6;
                CharSequence charSequence152222222222 = charSequence7;
                if (r5 == 0) {
                }
                if (user != null) {
                }
                charSequence9 = charSequence8;
                charSequence10 = charSequence9;
                profileSearchCell.allowBotOpenButton(z, new Utilities.Callback() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda21
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        DialogsSearchAdapter.this.openBotApp((TLRPC.User) obj2);
                    }
                });
                profileSearchCell.setOnSponsoredOptionsClick(new Utilities.Callback2() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda12
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj2, Object obj3) {
                        DialogsSearchAdapter.this.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                    }
                });
                profileSearchCell.setAd(z3 ? (TLRPC.TL_sponsoredPeer) obj : null);
                profileSearchCell.setData(user != null ? user : r5, encryptedChat, charSequence152222222222, charSequence10, true, z4);
                profileSearchCell.setChecked(this.delegate.isSelected(profileSearchCell.getDialogId()), dialogId == profileSearchCell.getDialogId());
                break;
            case 1:
                final GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (!this.searchResultHashtags.isEmpty()) {
                    graySectionCell.setText(LocaleController.getString(R.string.Hashtags), LocaleController.getString(R.string.ClearButton), new View.OnClickListener() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda11
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DialogsSearchAdapter.$r8$lambda$lFfdgXM7h_Er3kieMFs3_DbSLTk(DialogsSearchAdapter.this, view);
                        }
                    });
                    break;
                } else {
                    if (this.publicPosts.isEmpty()) {
                        i4 = i5;
                    } else if (i5 == 0) {
                        graySectionCell.setText(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda13
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                DialogsSearchAdapter.this.openPublicPosts();
                            }
                        });
                        break;
                    } else {
                        i4 = i5 - (this.publicPosts.size() + 1);
                    }
                    final ArrayList globalSearch3 = this.searchAdapterHelper.getGlobalSearch();
                    if (isRecentSearchDisplayed() || !this.searchTopics.isEmpty() || !this.searchContacts.isEmpty() || !this.publicPosts.isEmpty()) {
                        ?? hasHints = hasHints();
                        if (i4 < hasHints) {
                            graySectionCell.setText(LocaleController.getString(R.string.ChatHints));
                            break;
                        } else if (i4 != hasHints || !isRecentSearchDisplayed()) {
                            if (i4 == getRecentItemsCount() + (this.searchTopics.isEmpty() ? 0 : this.searchTopics.size() + 1) + (this.searchContacts.isEmpty() ? 0 : this.searchContacts.size() + 1) && !this.searchResult.isEmpty()) {
                                graySectionCell.setText(LocaleController.getString(R.string.SearchAllChatsShort));
                                break;
                            } else {
                                i4 -= getRecentItemsCount();
                            }
                        } else if (!this.searchWas) {
                            graySectionCell.setText(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda14
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    DialogsSearchAdapter.$r8$lambda$Of9yzltizLBeIutylE8YpEJvqbk(DialogsSearchAdapter.this, view);
                                }
                            });
                            break;
                        } else {
                            graySectionCell.setText(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda15
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    DialogsSearchAdapter.$r8$lambda$Vl0WDwJ4Z_SnbE4wiDe99XNNBqA(DialogsSearchAdapter.this, view);
                                }
                            });
                            break;
                        }
                    }
                    int size8 = this.searchResult.size();
                    int size9 = this.searchAdapterHelper.getLocalServerSearch().size();
                    int size10 = this.searchAdapterHelper.getPhoneSearch().size();
                    if (size10 > 3 && this.phoneCollapsed) {
                        size10 = 3;
                    }
                    int size11 = globalSearch3.size();
                    if (size11 > 3 && this.globalSearchCollapsed) {
                        size11 = 3;
                    }
                    int size12 = (globalSearch3.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : size11 + this.sponsoredPeers.size() + 1;
                    int size13 = this.searchForumResultMessages.isEmpty() ? 0 : this.searchForumResultMessages.size() + 1;
                    if (!this.searchResultMessages.isEmpty()) {
                        this.searchResultMessages.size();
                    }
                    if (this.currentMessagesFilter != Filter.All || this.forceLoadingMessages) {
                        this.searchResultMessages.isEmpty();
                    }
                    if (this.searchTopics.isEmpty()) {
                        str6 = null;
                    } else {
                        str6 = i4 == 0 ? LocaleController.getString(R.string.Topics) : null;
                        i4 -= this.searchTopics.size() + 1;
                    }
                    if (!this.searchContacts.isEmpty()) {
                        if (i4 == 0) {
                            str6 = LocaleController.getString(R.string.InviteToTelegramShort);
                        }
                        i4 -= this.searchContacts.size() + 1;
                    }
                    if (str6 == null) {
                        int i11 = i4 - (size8 + size9);
                        if (i11 < 0 || i11 >= size10) {
                            int i12 = i11 - size10;
                            if (i12 >= 0 && i12 < size12) {
                                str6 = LocaleController.getString(R.string.GlobalSearch);
                                if (this.searchAdapterHelper.getGlobalSearch().size() > 3) {
                                    r10 = this.globalSearchCollapsed;
                                    runnable = new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda17
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            DialogsSearchAdapter.$r8$lambda$9VVDhfzZXUG7hTG8p1Q9cXSS63s(DialogsSearchAdapter.this, globalSearch3, i5, graySectionCell);
                                        }
                                    };
                                    str7 = str6;
                                    charSequence13 = null;
                                }
                            } else if (this.delegate != null && size13 > 0 && i12 - size12 <= 1) {
                                TLRPC.Chat chat7 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.delegate.getSearchForumDialogId()));
                                str6 = LocaleController.formatString(R.string.SearchMessagesIn, chat7 == null ? "null" : chat7.monoforum ? ForumUtilities.getMonoForumTitle(this.currentAccount, chat7) : chat7.title);
                            } else {
                                this.messagesSectionPosition = i12;
                                CharSequence filterFromString = getFilterFromString(this.currentMessagesFilter);
                                Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda18
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DialogsSearchAdapter.$r8$lambda$HMqTfP94m2GjNNYvXK2dAnEU1nE(DialogsSearchAdapter.this, graySectionCell);
                                    }
                                };
                                str7 = LocaleController.getString(R.string.SearchMessages);
                                runnable = runnable2;
                                charSequence13 = filterFromString;
                            }
                        } else {
                            str6 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (this.searchAdapterHelper.getPhoneSearch().size() > 3) {
                                r10 = this.phoneCollapsed;
                                str7 = str6;
                                runnable = new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda16
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DialogsSearchAdapter.$r8$lambda$h6PEjSb9nWmEDkkDfhHDVeCoAPA(DialogsSearchAdapter.this, graySectionCell);
                                    }
                                };
                                charSequence13 = null;
                            }
                        }
                        if (runnable == null) {
                            if (charSequence13 != null) {
                                graySectionCell.setText(str7, charSequence13, new View.OnClickListener() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda19
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        runnable.run();
                                    }
                                });
                                graySectionCell.setRightTextMargin(6);
                                break;
                            } else {
                                graySectionCell.setText(str7, LocaleController.getString(r10 ? R.string.ShowMore : R.string.ShowLess), new View.OnClickListener() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda20
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        runnable.run();
                                    }
                                });
                                graySectionCell.setRightTextMargin(16);
                                break;
                            }
                        } else {
                            graySectionCell.setText(str7);
                            break;
                        }
                    }
                    str7 = str6;
                    charSequence13 = null;
                    runnable = null;
                    if (runnable == null) {
                    }
                }
                break;
            case 2:
            case 9:
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                dialogCell.useSeparator = i5 != getItemCount() - 1;
                MessageObject messageObject = (MessageObject) getItem(i5);
                dialogCell.useFromUserAsAvatar = this.searchForumResultMessages.contains(messageObject);
                if (messageObject == null) {
                    dialogCell.setDialog(0L, null, 0, false, false);
                    break;
                } else {
                    dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                    break;
                }
            case 3:
                ((TopicSearchCell) viewHolder.itemView).setTopic((TLRPC.TL_forumTopic) getItem(i5));
                break;
            case 5:
                HashtagSearchCell hashtagSearchCell = (HashtagSearchCell) viewHolder.itemView;
                hashtagSearchCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                hashtagSearchCell.setText((CharSequence) this.searchResultHashtags.get(i5 - 1));
                hashtagSearchCell.setNeedDivider(i5 != this.searchResultHashtags.size());
                break;
            case 6:
                ((CategoryAdapterRecycler) ((RecyclerListView) viewHolder.itemView).getAdapter()).setIndex(i5 / 2);
                break;
            case 7:
                String str9 = (String) getItem(i5);
                TextCell textCell = (TextCell) viewHolder.itemView;
                textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText2);
                textCell.setText(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, PhoneFormat.getInstance().format("+" + str9)), false);
                break;
            case 8:
                ProfileSearchCell profileSearchCell2 = (ProfileSearchCell) viewHolder.itemView;
                ContactsController.Contact contact = (ContactsController.Contact) getItem(i5);
                profileSearchCell2.setData(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), PhoneFormat.getInstance().format("+" + contact.shortPhones.get(0)), false, false);
                break;
        }
    }

    public static /* synthetic */ void $r8$lambda$lFfdgXM7h_Er3kieMFs3_DbSLTk(DialogsSearchAdapter dialogsSearchAdapter, View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public static /* synthetic */ void $r8$lambda$Of9yzltizLBeIutylE8YpEJvqbk(DialogsSearchAdapter dialogsSearchAdapter, View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public static /* synthetic */ void $r8$lambda$Vl0WDwJ4Z_SnbE4wiDe99XNNBqA(DialogsSearchAdapter dialogsSearchAdapter, View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public static /* synthetic */ void $r8$lambda$h6PEjSb9nWmEDkkDfhHDVeCoAPA(DialogsSearchAdapter dialogsSearchAdapter, GraySectionCell graySectionCell) {
        boolean z = dialogsSearchAdapter.phoneCollapsed;
        dialogsSearchAdapter.phoneCollapsed = !z;
        graySectionCell.setRightText(LocaleController.getString(!z ? R.string.ShowMore : R.string.ShowLess));
        dialogsSearchAdapter.notifyDataSetChanged();
    }

    public static /* synthetic */ void $r8$lambda$9VVDhfzZXUG7hTG8p1Q9cXSS63s(final DialogsSearchAdapter dialogsSearchAdapter, ArrayList arrayList, int i, GraySectionCell graySectionCell) {
        dialogsSearchAdapter.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - dialogsSearchAdapter.lastShowMoreUpdate < 300) {
            return;
        }
        dialogsSearchAdapter.lastShowMoreUpdate = elapsedRealtime;
        int size = dialogsSearchAdapter.sponsoredPeers.size();
        int size2 = arrayList.size();
        int i2 = (arrayList.isEmpty() && dialogsSearchAdapter.sponsoredPeers.isEmpty()) ? 0 : size2 + size;
        int min = size + Math.min(3, size2);
        boolean z = dialogsSearchAdapter.getItemCount() > ((dialogsSearchAdapter.globalSearchCollapsed ? min : i2) + i) + 1;
        DefaultItemAnimator defaultItemAnimator = dialogsSearchAdapter.itemAnimator;
        if (defaultItemAnimator != null) {
            defaultItemAnimator.setAddDuration(z ? 45L : 200L);
            dialogsSearchAdapter.itemAnimator.setRemoveDuration(z ? 80L : 200L);
            dialogsSearchAdapter.itemAnimator.setRemoveDelay(z ? 270L : 0L);
        }
        dialogsSearchAdapter.globalSearchCollapsed = !dialogsSearchAdapter.globalSearchCollapsed;
        graySectionCell.setRightTextMargin(16);
        graySectionCell.setRightText(LocaleController.getString(dialogsSearchAdapter.globalSearchCollapsed ? R.string.ShowMore : R.string.ShowLess), dialogsSearchAdapter.globalSearchCollapsed);
        dialogsSearchAdapter.showMoreHeader = null;
        final View view = (View) graySectionCell.getParent();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            int i3 = (!dialogsSearchAdapter.globalSearchCollapsed ? i + min : i2 + i) + 1;
            int i4 = 0;
            while (true) {
                if (i4 >= recyclerView.getChildCount()) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i4);
                if (recyclerView.getChildAdapterPosition(childAt) == i3) {
                    dialogsSearchAdapter.showMoreHeader = childAt;
                    break;
                }
                i4++;
            }
        }
        final int i5 = i + min;
        int i6 = i5 + 1;
        int max = Math.max(0, size2 - 3);
        if (!dialogsSearchAdapter.globalSearchCollapsed) {
            dialogsSearchAdapter.notifyItemChanged(i5);
            dialogsSearchAdapter.notifyItemRangeInserted(i6, max);
        } else {
            dialogsSearchAdapter.notifyItemRangeRemoved(i6, max);
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda30
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogsSearchAdapter.this.notifyItemChanged(i5);
                    }
                }, 350L);
            } else {
                dialogsSearchAdapter.notifyItemChanged(i5);
            }
        }
        Runnable runnable = dialogsSearchAdapter.cancelShowMoreAnimation;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        if (z) {
            dialogsSearchAdapter.showMoreAnimation = true;
            Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    DialogsSearchAdapter.$r8$lambda$MQRSXaDH6_oZG5VWNgZFlIjyCrw(DialogsSearchAdapter.this, view);
                }
            };
            dialogsSearchAdapter.cancelShowMoreAnimation = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 400L);
            return;
        }
        dialogsSearchAdapter.showMoreAnimation = false;
    }

    public static /* synthetic */ void $r8$lambda$MQRSXaDH6_oZG5VWNgZFlIjyCrw(DialogsSearchAdapter dialogsSearchAdapter, View view) {
        dialogsSearchAdapter.showMoreAnimation = false;
        dialogsSearchAdapter.showMoreHeader = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ void $r8$lambda$HMqTfP94m2GjNNYvXK2dAnEU1nE(final DialogsSearchAdapter dialogsSearchAdapter, final GraySectionCell graySectionCell) {
        ItemOptions makeOptions = ItemOptions.makeOptions(dialogsSearchAdapter.dialogsActivity, graySectionCell);
        for (final Filter filter : Filter.values()) {
            final boolean z = filter.flags == dialogsSearchAdapter.currentMessagesFilter.flags;
            makeOptions.addChecked(z, LocaleController.getString(filter.strResId), new Runnable() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    DialogsSearchAdapter.$r8$lambda$kFfnIS3dApWvkB9HeCFeOnXJSMY(DialogsSearchAdapter.this, z, graySectionCell, filter);
                }
            });
        }
        makeOptions.setGravity(5).setOnTopOfScrim().setDrawScrim(false).setDimAlpha(0).show();
    }

    public static /* synthetic */ void $r8$lambda$kFfnIS3dApWvkB9HeCFeOnXJSMY(DialogsSearchAdapter dialogsSearchAdapter, boolean z, GraySectionCell graySectionCell, Filter filter) {
        if (z) {
            dialogsSearchAdapter.getClass();
            return;
        }
        dialogsSearchAdapter.currentMessagesFilter = filter;
        graySectionCell.setRightText(dialogsSearchAdapter.getFilterFromString(filter));
        graySectionCell.setRightTextMargin(6);
        dialogsSearchAdapter.searchResultMessages.clear();
        dialogsSearchAdapter.forceLoadingMessages = true;
        dialogsSearchAdapter.notifyDataSetChanged();
        dialogsSearchAdapter.loadMoreSearchMessages();
    }

    private CharSequence getFilterFromString(Filter filter) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(filter.strFromResId));
        spannableStringBuilder.append((CharSequence) "v");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrows_select);
        this.filterArrowsIcon = coloredImageSpan;
        spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0177, code lost:
    
        if (r12 != 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0179, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x017a, code lost:
    
        if (r12 != r7) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x017c, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x017d, code lost:
    
        return 2;
     */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getItemViewType(int i) {
        if (!this.searchResultHashtags.isEmpty()) {
            return i == 0 ? 1 : 5;
        }
        if (!this.publicPosts.isEmpty()) {
            if (i == 0) {
                return 1;
            }
            int i2 = i - 1;
            if (i2 < this.publicPosts.size()) {
                return 9;
            }
            i = i2 - this.publicPosts.size();
        }
        if (isRecentSearchDisplayed()) {
            ?? hasHints = hasHints();
            if (i < hasHints) {
                return 6;
            }
            if (i == hasHints) {
                return 1;
            }
            if (i < getRecentItemsCount()) {
                return 0;
            }
            i -= getRecentItemsCount();
        }
        if (!this.searchTopics.isEmpty()) {
            if (i == 0) {
                return 1;
            }
            if (i <= this.searchTopics.size()) {
                return 3;
            }
            i -= this.searchTopics.size() + 1;
        }
        if (!this.searchContacts.isEmpty()) {
            if (i == 0) {
                return 1;
            }
            if (i <= this.searchContacts.size()) {
                return 8;
            }
            i -= this.searchContacts.size() + 1;
        }
        ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
        int size = this.searchResult.size();
        int size2 = this.searchAdapterHelper.getLocalServerSearch().size();
        if (size + size2 > 0 && (getRecentItemsCount() > 0 || !this.searchTopics.isEmpty() || !this.publicPosts.isEmpty())) {
            if (i == 0) {
                return 1;
            }
            i--;
        }
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size3 > 3 && this.phoneCollapsed) {
            size3 = 3;
        }
        int size4 = globalSearch.size();
        int size5 = (this.sponsoredPeers.isEmpty() && globalSearch.isEmpty()) ? 0 : ((size4 <= 3 || !this.globalSearchCollapsed) ? size4 : 3) + this.sponsoredPeers.size() + 1;
        int size6 = this.searchResultMessages.isEmpty() ? 0 : this.searchResultMessages.size() + 1;
        Filter filter = this.currentMessagesFilter;
        Filter filter2 = Filter.All;
        if ((filter != filter2 || this.forceLoadingMessages) && this.searchResultMessages.isEmpty()) {
            size6 = this.forceLoadingMessages ? 4 : 2;
        }
        if (!this.searchForumResultMessages.isEmpty() && !this.localMessagesSearchEndReached) {
            size6 = 0;
        }
        int size7 = this.searchForumResultMessages.isEmpty() ? 0 : this.searchForumResultMessages.size() + 1;
        if (i >= 0 && i < size) {
            return 0;
        }
        int i3 = i - size;
        if (i3 >= 0 && i3 < size2) {
            return 0;
        }
        int i4 = i3 - size2;
        if (i4 >= 0 && i4 < size3) {
            Object item = getItem(i4);
            if (item instanceof String) {
                return "section".equals((String) item) ? 1 : 7;
            }
            return 0;
        }
        int i5 = i4 - size3;
        if (i5 >= 0 && i5 < size5) {
            return i5 == 0 ? 1 : 0;
        }
        int i6 = i5 - size5;
        if (size7 > 0) {
            if (i6 >= 0) {
                if (this.localMessagesSearchEndReached) {
                }
            }
            i6 -= size7 + (!this.localMessagesSearchEndReached ? 1 : 0);
        }
        if (i6 < 0 || i6 >= size6) {
            return 4;
        }
        if (i6 == 0) {
            return 1;
        }
        if (this.forceLoadingMessages && this.searchResultMessages.isEmpty()) {
            return 4;
        }
        return (this.currentMessagesFilter == filter2 || !this.searchResultMessages.isEmpty()) ? 2 : 10;
    }

    public void setFiltersDelegate(FilteredSearchView.Delegate delegate, boolean z) {
        this.filtersDelegate = delegate;
        if (delegate == null || !z) {
            return;
        }
        delegate.updateFiltersView(false, null, this.localTipDates, this.localTipArchive);
    }

    public int getCurrentItemCount() {
        return this.currentItemCount;
    }

    public void filterRecent(String str) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate;
        String str2;
        String str3;
        this.filteredRecentQuery = str;
        this.filtered2RecentSearchObjects.clear();
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            this.filteredRecentSearchObjects.clear();
            int size = this.recentSearchObjects.size();
            while (i < size) {
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = this.delegate;
                if ((dialogsSearchAdapterDelegate2 == null || dialogsSearchAdapterDelegate2.getSearchForumDialogId() != ((RecentSearchObject) this.recentSearchObjects.get(i)).did) && filter(((RecentSearchObject) this.recentSearchObjects.get(i)).object)) {
                    this.filteredRecentSearchObjects.add((RecentSearchObject) this.recentSearchObjects.get(i));
                }
                i++;
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.recentSearchObjects.size();
        while (i < size2) {
            RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjects.get(i);
            if (recentSearchObject != null && recentSearchObject.object != null && (((dialogsSearchAdapterDelegate = this.delegate) == null || dialogsSearchAdapterDelegate.getSearchForumDialogId() != recentSearchObject.did) && filter(((RecentSearchObject) this.recentSearchObjects.get(i)).object))) {
                TLObject tLObject = recentSearchObject.object;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? ForumUtilities.getMonoForumTitle(this.currentAccount, chat) : chat.title;
                    str3 = ((TLRPC.Chat) recentSearchObject.object).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) recentSearchObject.object).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && wordStartsWith(str2.toLowerCase(), lowerCase)) || (str3 != null && wordStartsWith(str3.toLowerCase(), lowerCase))) {
                    this.filtered2RecentSearchObjects.add(recentSearchObject);
                }
                if (this.filtered2RecentSearchObjects.size() >= 5) {
                    return;
                }
            }
            i++;
        }
    }

    private boolean wordStartsWith(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i = 0; i < split.length; i++) {
                String str3 = split[i];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i]))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class EmptyLayout extends LinearLayout {
        private TextView textView;

        public EmptyLayout(Context context, Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
            super(context);
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            addView(backupImageView, LayoutHelper.createLinear(120, 120, 1, 0, 27, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 17.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptyTitle));
            textView.setGravity(17);
            addView(textView, LayoutHelper.createLinear(-1, -2, 1, 0, 8, 0, 9));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setTextSize(1, 14.0f);
            this.textView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.textView.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
            this.textView.setGravity(17);
            addView(this.textView, LayoutHelper.createLinear(-1, -2, 1, 0, 0, 0, 14));
            TextView textView3 = new TextView(context);
            textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
            int i2 = Theme.key_featuredStickers_addButton;
            textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(6, 0, Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 0.15f)));
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Adapters.DialogsSearchAdapter$EmptyLayout$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
            addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 38));
        }

        public void setQuery(String str) {
            this.textView.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, str));
        }
    }

    private int globalSearchPosition() {
        if (this.waitingResponseCount == 3) {
            return 0;
        }
        int size = this.publicPosts.isEmpty() ? 0 : this.publicPosts.size() + 1;
        if (!this.searchResultHashtags.isEmpty()) {
            return size + this.searchResultHashtags.size() + 1;
        }
        if (isRecentSearchDisplayed()) {
            size += getRecentItemsCount();
            if (!this.searchWas) {
                return size;
            }
        }
        if (!this.searchTopics.isEmpty()) {
            size = size + 1 + this.searchTopics.size();
        }
        if (!this.searchContacts.isEmpty()) {
            size += this.searchContacts.size() + 1;
        }
        int size2 = this.searchResult.size();
        int size3 = this.searchAdapterHelper.getLocalServerSearch().size();
        int i = size + size2 + size3;
        return size2 + size3 > 0 ? (getRecentItemsCount() <= 0 && this.searchTopics.isEmpty() && this.publicPosts.isEmpty()) ? i : i + 1 : i;
    }

    public void removeAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        int indexOf;
        int globalSearchPosition;
        if (!this.sponsoredPeers.isEmpty() && (indexOf = this.sponsoredPeers.indexOf(tL_sponsoredPeer)) >= 0 && (globalSearchPosition = globalSearchPosition()) < getItemCount()) {
            this.sponsoredPeers.remove(indexOf);
            notifyItemRemoved(globalSearchPosition + 1 + indexOf);
            int size = this.searchAdapterHelper.getGlobalSearch().size();
            int size2 = this.sponsoredPeers.size();
            if (this.globalSearchCollapsed) {
                size = Math.min(3, size);
            }
            if (size2 + size <= 0) {
                notifyItemRemoved(globalSearchPosition);
            }
        }
    }

    public void removeAllAds() {
        int globalSearchPosition;
        if (!this.sponsoredPeers.isEmpty() && (globalSearchPosition = globalSearchPosition()) < getItemCount()) {
            int size = this.sponsoredPeers.size();
            this.sponsoredPeers.clear();
            notifyItemRangeRemoved(globalSearchPosition + 1, size);
            int size2 = this.searchAdapterHelper.getGlobalSearch().size();
            if (this.globalSearchCollapsed) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                notifyItemRemoved(globalSearchPosition);
            }
        }
    }

    public void seenSponsoredPeer(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        if (tL_sponsoredPeer == null) {
            return;
        }
        Iterator it = this.seenSponsoredPeers.iterator();
        while (it.hasNext()) {
            if (Arrays.equals((byte[]) it.next(), tL_sponsoredPeer.random_id)) {
                return;
            }
        }
        this.seenSponsoredPeers.add(tL_sponsoredPeer.random_id);
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void clickedSponsoredPeer(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        if (tL_sponsoredPeer == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }
}
