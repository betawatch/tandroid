package org.telegram.ui.Adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.BotSwitchCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PremiumPreviewFragment;

/* loaded from: classes4.dex */
public class MentionsAdapter extends RecyclerListView.SelectionAdapter implements NotificationCenter.NotificationCenterDelegate {
    private LongSparseArray botInfo;
    private int botsCount;
    private HashtagHint bottomHint;
    private Runnable cancelDelayRunnable;
    private int channelLastReqId;
    private int channelReqId;
    public TLRPC.Chat chat;
    private Runnable checkAgainRunnable;
    private boolean contextMedia;
    private int contextQueryReqid;
    private Runnable contextQueryRunnable;
    private int contextUsernameReqid;
    private boolean delayLocalResults;
    private MentionsAdapterDelegate delegate;
    private long dialog_id;
    private TLRPC.User foundContextBot;
    private String hintHashtag;
    private boolean hintHashtagDivider;
    private TLRPC.ChatFull info;
    private boolean isDarkTheme;
    private boolean isSearchingMentions;
    private Object[] lastData;
    private boolean lastForSearch;
    private Location lastKnownLocation;
    private int lastPosition;
    private int lastReqId;
    private String[] lastSearchKeyboardLanguage;
    private String lastSticker;
    private String lastText;
    private boolean lastUsernameOnly;
    private final Context mContext;
    private EmojiView.ChooseStickerActionTracker mentionsStickersActionTracker;
    private ArrayList messages;
    private String nextQueryOffset;
    private boolean noUserName;
    public ChatActivity parentFragment;
    private ArrayList quickReplies;
    private String quickRepliesQuery;
    private final Theme.ResourcesProvider resourcesProvider;
    private int resultLength;
    private int resultStartPosition;
    private SearchAdapterHelper searchAdapterHelper;
    private Runnable searchGlobalRunnable;
    private ArrayList searchResultBotContext;
    private TLRPC.TL_inlineBotSwitchPM searchResultBotContextSwitch;
    private long searchResultBotContextSwitchUserId;
    private TLRPC.TL_inlineBotWebView searchResultBotWebViewSwitch;
    private ArrayList searchResultCommands;
    private ArrayList searchResultCommandsEphemeral;
    private ArrayList searchResultCommandsHelp;
    private ArrayList searchResultCommandsUsers;
    private ArrayList searchResultHashtags;
    private ArrayList searchResultSuggestions;
    private ArrayList searchResultUsernames;
    private LongSparseArray searchResultUsernamesMap;
    private String searchingContextQuery;
    private String searchingContextUsername;
    private ArrayList stickers;
    private HashMap stickersMap;
    private final boolean stories;
    private long threadMessageId;
    private HashtagHint topHint;
    private TLRPC.User user;
    private boolean visibleByStickersSearch;
    private boolean allowStickers = true;
    private boolean allowBots = true;
    private boolean allowChats = true;
    private final boolean USE_DIVIDERS = false;
    private int currentAccount = UserConfig.selectedAccount;
    private boolean needUsernames = true;
    private boolean needBotContext = true;
    private boolean inlineMediaEnabled = true;
    private boolean searchInDialogs = false;
    private ArrayList stickersToLoad = new ArrayList();
    private SendMessagesHelper.LocationProvider locationProvider = new SendMessagesHelper.LocationProvider(new SendMessagesHelper.LocationProvider.LocationProviderDelegate() { // from class: org.telegram.ui.Adapters.MentionsAdapter.1
        @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
        public void onLocationAcquired(Location location) {
            if (MentionsAdapter.this.foundContextBot == null || !MentionsAdapter.this.foundContextBot.bot_inline_geo) {
                return;
            }
            MentionsAdapter.this.lastKnownLocation = location;
            MentionsAdapter mentionsAdapter = MentionsAdapter.this;
            mentionsAdapter.searchForContextBotResults(true, mentionsAdapter.foundContextBot, MentionsAdapter.this.searchingContextQuery, "");
        }

        @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
        public void onUnableLocationAcquire() {
            MentionsAdapter.this.onLocationUnavailable();
        }
    }) { // from class: org.telegram.ui.Adapters.MentionsAdapter.2
        @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider
        public void stop() {
            super.stop();
            MentionsAdapter.this.lastKnownLocation = null;
        }
    };
    private boolean isReversed = false;
    private int lastItemCount = -1;

    public interface MentionsAdapterDelegate {
        void needChangePanelVisibility(boolean z);

        void onContextClick(TLRPC.BotInlineResult botInlineResult);

        void onContextSearch(boolean z);

        void onItemCountUpdate(int i, int i2);
    }

    static /* synthetic */ int access$1704(MentionsAdapter mentionsAdapter) {
        int i = mentionsAdapter.channelLastReqId + 1;
        mentionsAdapter.channelLastReqId = i;
        return i;
    }

    private static class StickerResult {
        public Object parent;
        public TLRPC.Document sticker;

        public StickerResult(TLRPC.Document document, Object obj) {
            this.sticker = document;
            this.parent = obj;
        }
    }

    public MentionsAdapter(Context context, boolean z, long j, long j2, MentionsAdapterDelegate mentionsAdapterDelegate, Theme.ResourcesProvider resourcesProvider, boolean z2) {
        this.resourcesProvider = resourcesProvider;
        this.mContext = context;
        this.delegate = mentionsAdapterDelegate;
        this.isDarkTheme = z;
        this.dialog_id = j;
        this.stories = z2;
        this.threadMessageId = j2;
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
        this.searchAdapterHelper = searchAdapterHelper;
        searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() { // from class: org.telegram.ui.Adapters.MentionsAdapter.3
            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public /* synthetic */ boolean canApplySearchResults(int i) {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$canApplySearchResults(this, i);
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public /* synthetic */ LongSparseArray getExcludeCallParticipants() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeCallParticipants(this);
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public /* synthetic */ LongSparseArray getExcludeUsers() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeUsers(this);
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public void onDataSetChanged(int i) {
                MentionsAdapter.this.notifyDataSetChanged();
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                if (MentionsAdapter.this.lastText != null) {
                    MentionsAdapter mentionsAdapter = MentionsAdapter.this;
                    mentionsAdapter.searchUsernameOrHashtag(mentionsAdapter.lastText, MentionsAdapter.this.lastPosition, MentionsAdapter.this.messages, MentionsAdapter.this.lastUsernameOnly, MentionsAdapter.this.lastForSearch);
                }
            }
        });
        if (!z) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public TLRPC.User getFoundContextBot() {
        return this.foundContextBot;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == NotificationCenter.fileLoaded || i == NotificationCenter.fileLoadFailed) {
            ArrayList arrayList = this.stickers;
            if (arrayList == null || arrayList.isEmpty() || this.stickersToLoad.isEmpty() || !this.visibleByStickersSearch) {
                return;
            }
            this.stickersToLoad.remove((String) objArr[0]);
            if (this.stickersToLoad.isEmpty()) {
                this.delegate.needChangePanelVisibility(getItemCountInternal() > 0);
                return;
            }
            return;
        }
        if (i == NotificationCenter.recentDocumentsDidLoad) {
            Runnable runnable2 = this.checkAgainRunnable;
            if (runnable2 != null) {
                AndroidUtilities.runOnUIThread(runnable2);
                this.checkAgainRunnable = null;
                return;
            }
            return;
        }
        if (i == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (runnable = this.checkAgainRunnable) != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.checkAgainRunnable = null;
        }
    }

    private void addStickerToResult(TLRPC.Document document, Object obj) {
        if (document == null) {
            return;
        }
        String str = document.dc_id + "_" + document.id;
        HashMap hashMap = this.stickersMap;
        if (hashMap == null || !hashMap.containsKey(str)) {
            if (UserConfig.getInstance(this.currentAccount).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.stickers == null) {
                    this.stickers = new ArrayList();
                    this.stickersMap = new HashMap();
                }
                this.stickers.add(new StickerResult(document, obj));
                this.stickersMap.put(str, document);
                EmojiView.ChooseStickerActionTracker chooseStickerActionTracker = this.mentionsStickersActionTracker;
                if (chooseStickerActionTracker != null) {
                    chooseStickerActionTracker.checkVisibility();
                }
            }
        }
    }

    private void addStickersToResult(ArrayList arrayList, Object obj) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
            String str = document.dc_id + "_" + document.id;
            HashMap hashMap = this.stickersMap;
            if ((hashMap == null || !hashMap.containsKey(str)) && (UserConfig.getInstance(this.currentAccount).isPremium() || !MessageObject.isPremiumSticker(document))) {
                int size2 = document.attributes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        obj = documentAttribute.stickerset;
                        break;
                    }
                    i2++;
                }
                if (this.stickers == null) {
                    this.stickers = new ArrayList();
                    this.stickersMap = new HashMap();
                }
                this.stickers.add(new StickerResult(document, obj));
                this.stickersMap.put(str, document);
            }
        }
    }

    private boolean checkStickerFilesExistAndDownload() {
        if (this.stickers == null) {
            return false;
        }
        this.stickersToLoad.clear();
        int min = Math.min(6, this.stickers.size());
        for (int i = 0; i < min; i++) {
            StickerResult stickerResult = (StickerResult) this.stickers.get(i);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerResult.sticker.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                this.stickersToLoad.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.currentAccount).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerResult.sticker), stickerResult.parent, "webp", 1, 1);
            }
        }
        return this.stickersToLoad.isEmpty();
    }

    private boolean isValidSticker(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i++;
        }
        return false;
    }

    private void searchServerStickers(final String str, String str2) {
        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
        tL_messages_getStickers.emoticon = str2;
        tL_messages_getStickers.hash = 0L;
        this.lastReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new RequestDelegate() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda10
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MentionsAdapter.$r8$lambda$AffoJHT-KkZmQ_azaCO4vltWJzM(MentionsAdapter.this, str, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$AffoJHT-KkZmQ_azaCO4vltWJzM(final MentionsAdapter mentionsAdapter, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mentionsAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                MentionsAdapter.$r8$lambda$wn91zgqvphjFG0n-sqFo8J1dKbc(MentionsAdapter.this, str, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$wn91zgqvphjFG0n-sqFo8J1dKbc(MentionsAdapter mentionsAdapter, String str, TLObject tLObject) {
        ArrayList arrayList;
        mentionsAdapter.lastReqId = 0;
        if (str.equals(mentionsAdapter.lastSticker) && (tLObject instanceof TLRPC.TL_messages_stickers)) {
            mentionsAdapter.delayLocalResults = false;
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            ArrayList arrayList2 = mentionsAdapter.stickers;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            mentionsAdapter.addStickersToResult(tL_messages_stickers.stickers, "sticker_search_" + str);
            ArrayList arrayList3 = mentionsAdapter.stickers;
            int size2 = arrayList3 != null ? arrayList3.size() : 0;
            if (!mentionsAdapter.visibleByStickersSearch && (arrayList = mentionsAdapter.stickers) != null && !arrayList.isEmpty()) {
                mentionsAdapter.checkStickerFilesExistAndDownload();
                mentionsAdapter.delegate.needChangePanelVisibility(mentionsAdapter.getItemCountInternal() > 0);
                mentionsAdapter.visibleByStickersSearch = true;
            }
            if (size != size2) {
                mentionsAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void notifyDataSetChanged() {
        MentionsAdapterDelegate mentionsAdapterDelegate;
        int i = this.lastItemCount;
        if (i == -1 || this.lastData == null) {
            MentionsAdapterDelegate mentionsAdapterDelegate2 = this.delegate;
            if (mentionsAdapterDelegate2 != null) {
                mentionsAdapterDelegate2.onItemCountUpdate(0, getItemCount());
            }
            super.notifyDataSetChanged();
            this.lastData = new Object[getItemCount()];
            while (true) {
                Object[] objArr = this.lastData;
                if (r2 >= objArr.length) {
                    return;
                }
                objArr[r2] = getItem(r2);
                r2++;
            }
        } else {
            int itemCount = getItemCount();
            boolean z = i != itemCount;
            int min = Math.min(i, itemCount);
            Object[] objArr2 = new Object[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                objArr2[i2] = getItem(i2);
            }
            while (r2 < min) {
                if (r2 >= 0) {
                    Object[] objArr3 = this.lastData;
                    r2 = (r2 < objArr3.length && r2 < itemCount && itemsEqual(objArr3[r2], objArr2[r2])) ? r2 + 1 : 0;
                }
                notifyItemChanged(r2);
                z = true;
            }
            notifyItemRangeRemoved(min, i - min);
            notifyItemRangeInserted(min, itemCount - min);
            if (z && (mentionsAdapterDelegate = this.delegate) != null) {
                mentionsAdapterDelegate.onItemCountUpdate(i, itemCount);
            }
            this.lastData = objArr2;
        }
    }

    private boolean itemsEqual(Object obj, Object obj2) {
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        if (obj instanceof QuickRepliesController.QuickReply) {
            return false;
        }
        if (obj == obj2) {
            return true;
        }
        if ((obj instanceof StickerResult) && (obj2 instanceof StickerResult) && ((StickerResult) obj).sticker == ((StickerResult) obj2).sticker) {
            return true;
        }
        if ((obj instanceof TLRPC.User) && (obj2 instanceof TLRPC.User) && ((TLRPC.User) obj).id == ((TLRPC.User) obj2).id) {
            return true;
        }
        if ((obj instanceof TLRPC.Chat) && (obj2 instanceof TLRPC.Chat) && ((TLRPC.Chat) obj).id == ((TLRPC.Chat) obj2).id) {
            return true;
        }
        if ((obj instanceof String) && (obj2 instanceof String) && obj.equals(obj2)) {
            return true;
        }
        if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
            if (str.equals(keywordResult2.keyword) && (str2 = keywordResult.emoji) != null && str2.equals(keywordResult2.emoji)) {
                return true;
            }
        }
        return false;
    }

    private void clearStickers() {
        this.lastSticker = null;
        this.stickers = null;
        this.stickersMap = null;
        notifyDataSetChanged();
        this.visibleByStickersSearch = false;
        if (this.lastReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.lastReqId, true);
            this.lastReqId = 0;
        }
        EmojiView.ChooseStickerActionTracker chooseStickerActionTracker = this.mentionsStickersActionTracker;
        if (chooseStickerActionTracker != null) {
            chooseStickerActionTracker.checkVisibility();
        }
    }

    public void onDestroy() {
        SendMessagesHelper.LocationProvider locationProvider = this.locationProvider;
        if (locationProvider != null) {
            locationProvider.stop();
        }
        Runnable runnable = this.contextQueryRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.contextQueryRunnable = null;
        }
        if (this.contextUsernameReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextUsernameReqid, true);
            this.contextUsernameReqid = 0;
        }
        if (this.contextQueryReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
            this.contextQueryReqid = 0;
        }
        this.foundContextBot = null;
        this.searchResultBotContextSwitch = null;
        this.inlineMediaEnabled = true;
        this.searchingContextUsername = null;
        this.searchingContextQuery = null;
        this.noUserName = false;
        if (!this.isDarkTheme) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public void setParentFragment(ChatActivity chatActivity) {
        this.parentFragment = chatActivity;
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        ChatActivity chatActivity;
        TLRPC.Chat currentChat;
        this.currentAccount = UserConfig.selectedAccount;
        this.info = chatFull;
        if (!this.inlineMediaEnabled && this.foundContextBot != null && (chatActivity = this.parentFragment) != null && (currentChat = chatActivity.getCurrentChat()) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(currentChat);
            this.inlineMediaEnabled = canSendStickers;
            if (canSendStickers) {
                this.searchResultUsernames = null;
                notifyDataSetChanged();
                this.delegate.needChangePanelVisibility(false);
                processFoundUser(this.foundContextBot);
            }
        }
        String str = this.lastText;
        if (str != null) {
            searchUsernameOrHashtag(str, this.lastPosition, this.messages, this.lastUsernameOnly, this.lastForSearch);
        }
    }

    public void setNeedUsernames(boolean z) {
        this.needUsernames = z;
    }

    public void setNeedBotContext(boolean z) {
        this.needBotContext = z;
    }

    public void setBotInfo(LongSparseArray longSparseArray) {
        this.botInfo = longSparseArray;
    }

    public void setBotsCount(int i) {
        this.botsCount = i;
    }

    public void clearRecentHashtags() {
        this.searchAdapterHelper.clearRecentHashtags();
        this.searchResultHashtags.clear();
        notifyDataSetChanged();
        MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
        if (mentionsAdapterDelegate != null) {
            mentionsAdapterDelegate.needChangePanelVisibility(false);
        }
    }

    public TLRPC.TL_inlineBotSwitchPM getBotContextSwitch() {
        TLRPC.User user = this.foundContextBot;
        if (user == null || user.id == this.searchResultBotContextSwitchUserId) {
            return this.searchResultBotContextSwitch;
        }
        return null;
    }

    public TLRPC.TL_inlineBotWebView getBotWebViewSwitch() {
        return this.searchResultBotWebViewSwitch;
    }

    public long getContextBotId() {
        TLRPC.User user = this.foundContextBot;
        if (user != null) {
            return user.id;
        }
        return 0L;
    }

    public TLRPC.User getContextBotUser() {
        return this.foundContextBot;
    }

    public String getContextBotName() {
        TLRPC.User user = this.foundContextBot;
        return user != null ? user.username : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processFoundUser(TLRPC.User user) {
        ChatActivity chatActivity;
        TLRPC.Chat currentChat;
        this.contextUsernameReqid = 0;
        this.locationProvider.stop();
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.foundContextBot = user;
            long j = user.id;
            if (j != this.searchResultBotContextSwitchUserId) {
                this.searchResultBotContextSwitch = null;
                this.searchResultBotContextSwitchUserId = j;
            }
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 != null && (currentChat = chatActivity2.getCurrentChat()) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(currentChat);
                this.inlineMediaEnabled = canSendStickers;
                if (!canSendStickers) {
                    notifyDataSetChanged();
                    this.delegate.needChangePanelVisibility(true);
                    return;
                }
            }
            if (this.foundContextBot.bot_inline_geo) {
                if (!MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("inlinegeo_" + this.foundContextBot.id, false) && (chatActivity = this.parentFragment) != null && chatActivity.getParentActivity() != null) {
                    final TLRPC.User user2 = this.foundContextBot;
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.parentFragment.getParentActivity());
                    builder.setTitle(LocaleController.getString(R.string.ShareYouLocationTitle));
                    builder.setMessage(LocaleController.getString(R.string.ShareYouLocationInline));
                    final boolean[] zArr = new boolean[1];
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda0
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i) {
                            MentionsAdapter.$r8$lambda$KDJjnBBRzDBMfFATCoi30PsSO8I(MentionsAdapter.this, zArr, user2, alertDialog, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda1
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i) {
                            MentionsAdapter.$r8$lambda$vKm2jnehT0bB-etKIrBbn4T8h2E(MentionsAdapter.this, zArr, alertDialog, i);
                        }
                    });
                    this.parentFragment.showDialog(builder.create(), new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda2
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            MentionsAdapter.$r8$lambda$wnxqc5Lojznr_6niaInwI-8KWpE(MentionsAdapter.this, zArr, dialogInterface);
                        }
                    });
                } else {
                    checkLocationPermissionsOrStart();
                }
            }
        } else {
            this.foundContextBot = null;
            this.searchResultBotContextSwitch = null;
            this.inlineMediaEnabled = true;
        }
        if (this.foundContextBot == null) {
            this.noUserName = true;
            this.searchResultBotContextSwitch = null;
        } else {
            MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
            if (mentionsAdapterDelegate != null) {
                mentionsAdapterDelegate.onContextSearch(true);
            }
            searchForContextBotResults(true, this.foundContextBot, this.searchingContextQuery, "");
        }
    }

    public static /* synthetic */ void $r8$lambda$KDJjnBBRzDBMfFATCoi30PsSO8I(MentionsAdapter mentionsAdapter, boolean[] zArr, TLRPC.User user, AlertDialog alertDialog, int i) {
        mentionsAdapter.getClass();
        zArr[0] = true;
        if (user != null) {
            MessagesController.getNotificationsSettings(mentionsAdapter.currentAccount).edit().putBoolean("inlinegeo_" + user.id, true).commit();
            mentionsAdapter.checkLocationPermissionsOrStart();
        }
    }

    public static /* synthetic */ void $r8$lambda$vKm2jnehT0bB-etKIrBbn4T8h2E(MentionsAdapter mentionsAdapter, boolean[] zArr, AlertDialog alertDialog, int i) {
        mentionsAdapter.getClass();
        zArr[0] = true;
        mentionsAdapter.onLocationUnavailable();
    }

    public static /* synthetic */ void $r8$lambda$wnxqc5Lojznr_6niaInwI-8KWpE(MentionsAdapter mentionsAdapter, boolean[] zArr, DialogInterface dialogInterface) {
        mentionsAdapter.getClass();
        if (zArr[0]) {
            return;
        }
        mentionsAdapter.onLocationUnavailable();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0089, code lost:
    
        if (r8.length() != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void searchForContextBot(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.foundContextBot;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.searchingContextQuery) == null || !str5.equals(str2)) {
            if (this.foundContextBot != null) {
                if (!this.inlineMediaEnabled && str != null && str2 != null) {
                    return;
                } else {
                    this.delegate.needChangePanelVisibility(false);
                }
            }
            Runnable runnable = this.contextQueryRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.contextQueryRunnable = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.searchingContextUsername) != null && !str3.equals(str))) {
                if (this.contextUsernameReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextUsernameReqid, true);
                    this.contextUsernameReqid = 0;
                }
                if (this.contextQueryReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
                    this.contextQueryReqid = 0;
                }
                this.foundContextBot = null;
                this.searchResultBotContextSwitch = null;
                this.inlineMediaEnabled = true;
                this.searchingContextUsername = null;
                this.searchingContextQuery = null;
                this.locationProvider.stop();
                this.noUserName = false;
                MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
                if (mentionsAdapterDelegate != null) {
                    mentionsAdapterDelegate.onContextSearch(false);
                }
                if (str != null) {
                }
            }
            if (str2 == null) {
                if (this.contextQueryReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
                    this.contextQueryReqid = 0;
                }
                this.searchingContextQuery = null;
                MentionsAdapterDelegate mentionsAdapterDelegate2 = this.delegate;
                if (mentionsAdapterDelegate2 != null) {
                    mentionsAdapterDelegate2.onContextSearch(false);
                }
            } else {
                MentionsAdapterDelegate mentionsAdapterDelegate3 = this.delegate;
                if (mentionsAdapterDelegate3 != null) {
                    if (this.foundContextBot != null) {
                        mentionsAdapterDelegate3.onContextSearch(true);
                    } else if (str.equals("gif")) {
                        this.searchingContextUsername = "gif";
                        this.delegate.onContextSearch(false);
                    }
                }
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
                this.searchingContextQuery = str2;
                4 r1 = new 4(str2, str, messagesController, messagesStorage);
                this.contextQueryRunnable = r1;
                AndroidUtilities.runOnUIThread(r1, 400L);
            }
        }
    }

    class 4 implements Runnable {
        final /* synthetic */ MessagesController val$messagesController;
        final /* synthetic */ MessagesStorage val$messagesStorage;
        final /* synthetic */ String val$query;
        final /* synthetic */ String val$username;

        4(String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
            this.val$query = str;
            this.val$username = str2;
            this.val$messagesController = messagesController;
            this.val$messagesStorage = messagesStorage;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MentionsAdapter.this.contextQueryRunnable != this) {
                return;
            }
            MentionsAdapter.this.contextQueryRunnable = null;
            if (MentionsAdapter.this.foundContextBot != null || MentionsAdapter.this.noUserName) {
                if (MentionsAdapter.this.noUserName) {
                    return;
                }
                MentionsAdapter mentionsAdapter = MentionsAdapter.this;
                mentionsAdapter.searchForContextBotResults(true, mentionsAdapter.foundContextBot, this.val$query, "");
                return;
            }
            MentionsAdapter.this.searchingContextUsername = this.val$username;
            TLObject userOrChat = this.val$messagesController.getUserOrChat(MentionsAdapter.this.searchingContextUsername);
            if (userOrChat instanceof TLRPC.User) {
                MentionsAdapter.this.processFoundUser((TLRPC.User) userOrChat);
                return;
            }
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = MentionsAdapter.this.searchingContextUsername;
            MentionsAdapter mentionsAdapter2 = MentionsAdapter.this;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(mentionsAdapter2.currentAccount);
            final String str = this.val$username;
            final MessagesController messagesController = this.val$messagesController;
            final MessagesStorage messagesStorage = this.val$messagesStorage;
            mentionsAdapter2.contextUsernameReqid = connectionsManager.sendRequest(tL_contacts_resolveUsername, new RequestDelegate() { // from class: org.telegram.ui.Adapters.MentionsAdapter$4$$ExternalSyntheticLambda0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MentionsAdapter.4.$r8$lambda$6qFBhbA5el53zmjUAQbOdy4ZCq0(MentionsAdapter.4.this, str, messagesController, messagesStorage, tLObject, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$6qFBhbA5el53zmjUAQbOdy4ZCq0(final 4 r7, final String str, final MessagesController messagesController, final MessagesStorage messagesStorage, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            r7.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.MentionsAdapter$4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MentionsAdapter.4.$r8$lambda$m8BXuePyYlp3o_W-tWb6BQAxPko(MentionsAdapter.4.this, str, tL_error, tLObject, messagesController, messagesStorage);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$m8BXuePyYlp3o_W-tWb6BQAxPko(4 r1, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
            if (MentionsAdapter.this.searchingContextUsername == null || !MentionsAdapter.this.searchingContextUsername.equals(str)) {
                return;
            }
            TLRPC.User user = null;
            if (tL_error == null) {
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                    TLRPC.User user2 = tL_contacts_resolvedPeer.users.get(0);
                    messagesController.putUser(user2, false);
                    messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer.users, null, true, true);
                    user = user2;
                }
            }
            MentionsAdapter.this.processFoundUser(user);
            MentionsAdapter.this.contextUsernameReqid = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLocationUnavailable() {
        TLRPC.User user = this.foundContextBot;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.lastKnownLocation = location;
        location.setLatitude(-1000.0d);
        this.lastKnownLocation.setLongitude(-1000.0d);
        searchForContextBotResults(true, this.foundContextBot, this.searchingContextQuery, "");
    }

    private void checkLocationPermissionsOrStart() {
        int checkSelfPermission;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null || chatActivity.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            checkSelfPermission = this.parentFragment.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
            if (checkSelfPermission != 0) {
                this.parentFragment.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            }
        }
        TLRPC.User user = this.foundContextBot;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.locationProvider.start();
    }

    public void setSearchingMentions(boolean z) {
        this.isSearchingMentions = z;
    }

    public String getBotCaption() {
        TLRPC.User user = this.foundContextBot;
        if (user != null) {
            return user.bot_inline_placeholder;
        }
        String str = this.searchingContextUsername;
        if (str == null || !str.equals("gif")) {
            return null;
        }
        return LocaleController.getString(R.string.SearchGifsTitle);
    }

    public void searchForContextBotForNextOffset() {
        String str;
        TLRPC.User user;
        String str2;
        if (this.contextQueryReqid != 0 || (str = this.nextQueryOffset) == null || str.length() == 0 || (user = this.foundContextBot) == null || (str2 = this.searchingContextQuery) == null) {
            return;
        }
        searchForContextBotResults(true, user, str2, this.nextQueryOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void searchForContextBotResults(final boolean z, final TLRPC.User user, final String str, final String str2) {
        Location location;
        if (this.contextQueryReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
            this.contextQueryReqid = 0;
        }
        if (!this.inlineMediaEnabled || !this.allowBots) {
            MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
            if (mentionsAdapterDelegate != null) {
                mentionsAdapterDelegate.onContextSearch(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.searchingContextQuery = null;
            return;
        }
        if (user.bot_inline_geo && this.lastKnownLocation == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.dialog_id);
        sb.append("_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(this.dialog_id);
        sb.append("_");
        sb.append(user.id);
        sb.append("_");
        sb.append((!user.bot_inline_geo || this.lastKnownLocation.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.lastKnownLocation.getLatitude() + this.lastKnownLocation.getLongitude()));
        final String sb2 = sb.toString();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MentionsAdapter.$r8$lambda$FEVHHL3jLtKUMGMF3s-KKFq47-k(MentionsAdapter.this, str, z, user, str2, messagesStorage, sb2, tLObject, tL_error);
            }
        };
        long j = user.id;
        if (j != this.searchResultBotContextSwitchUserId) {
            this.searchResultBotContextSwitch = null;
            this.searchResultBotContextSwitchUserId = j;
        }
        if (z) {
            messagesStorage.getBotCache(sb2, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.lastKnownLocation) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
        }
        if (DialogObject.isEncryptedDialog(this.dialog_id)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialog_id);
        }
        this.contextQueryReqid = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
    }

    public static /* synthetic */ void $r8$lambda$FEVHHL3jLtKUMGMF3s-KKFq47-k(final MentionsAdapter mentionsAdapter, final String str, final boolean z, final TLRPC.User user, final String str2, final MessagesStorage messagesStorage, final String str3, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mentionsAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                MentionsAdapter.$r8$lambda$eV3DaMEBh4F-Lqclvdf9Dshac84(MentionsAdapter.this, str, z, tLObject, user, str2, messagesStorage, str3);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$eV3DaMEBh4F-Lqclvdf9Dshac84(MentionsAdapter mentionsAdapter, String str, boolean z, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        boolean z2;
        if (str.equals(mentionsAdapter.searchingContextQuery)) {
            mentionsAdapter.contextQueryReqid = 0;
            if (z && tLObject == null) {
                mentionsAdapter.searchForContextBotResults(false, user, str, str2);
            } else {
                MentionsAdapterDelegate mentionsAdapterDelegate = mentionsAdapter.delegate;
                if (mentionsAdapterDelegate != null) {
                    mentionsAdapterDelegate.onContextSearch(false);
                }
            }
            if (tLObject instanceof TLRPC.TL_messages_botResults) {
                TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                if (!z && tL_messages_botResults.cache_time != 0) {
                    messagesStorage.saveBotCache(str3, tL_messages_botResults);
                }
                mentionsAdapter.nextQueryOffset = tL_messages_botResults.next_offset;
                if (mentionsAdapter.searchResultBotContextSwitch == null) {
                    mentionsAdapter.searchResultBotContextSwitch = tL_messages_botResults.switch_pm;
                }
                mentionsAdapter.searchResultBotWebViewSwitch = tL_messages_botResults.switch_webview;
                int i = 0;
                while (i < tL_messages_botResults.results.size()) {
                    TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i);
                    if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                        tL_messages_botResults.results.remove(i);
                        i--;
                    }
                    botInlineResult.query_id = tL_messages_botResults.query_id;
                    i++;
                }
                if (mentionsAdapter.searchResultBotContext == null || str2.length() == 0) {
                    mentionsAdapter.searchResultBotContext = tL_messages_botResults.results;
                    mentionsAdapter.contextMedia = tL_messages_botResults.gallery;
                    z2 = false;
                } else {
                    mentionsAdapter.searchResultBotContext.addAll(tL_messages_botResults.results);
                    if (tL_messages_botResults.results.isEmpty()) {
                        mentionsAdapter.nextQueryOffset = "";
                    }
                    z2 = true;
                }
                Runnable runnable = mentionsAdapter.cancelDelayRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    mentionsAdapter.cancelDelayRunnable = null;
                }
                mentionsAdapter.searchResultHashtags = null;
                mentionsAdapter.stickers = null;
                mentionsAdapter.searchResultUsernames = null;
                mentionsAdapter.searchResultUsernamesMap = null;
                mentionsAdapter.searchResultCommands = null;
                mentionsAdapter.searchResultCommandsEphemeral = null;
                mentionsAdapter.quickReplies = null;
                mentionsAdapter.searchResultSuggestions = null;
                mentionsAdapter.searchResultCommandsHelp = null;
                mentionsAdapter.searchResultCommandsUsers = null;
                mentionsAdapter.visibleByStickersSearch = false;
                mentionsAdapter.delegate.needChangePanelVisibility((mentionsAdapter.searchResultBotContext.isEmpty() && mentionsAdapter.searchResultBotContextSwitch == null && mentionsAdapter.searchResultBotWebViewSwitch == null) ? false : true);
                if (z2) {
                    int i2 = (mentionsAdapter.searchResultBotContextSwitch == null && mentionsAdapter.searchResultBotWebViewSwitch == null) ? 0 : 1;
                    mentionsAdapter.notifyItemChanged(((mentionsAdapter.searchResultBotContext.size() - tL_messages_botResults.results.size()) + i2) - 1);
                    mentionsAdapter.notifyItemRangeInserted((mentionsAdapter.searchResultBotContext.size() - tL_messages_botResults.results.size()) + i2, tL_messages_botResults.results.size());
                    return;
                }
                mentionsAdapter.notifyDataSetChanged();
            }
        }
    }

    private static ArrayList sortAndDeduplicateTopPeers(ArrayList arrayList) {
        List.-EL.sort(arrayList, new Comparator() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
                return compare;
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
            Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer.peer)), tL_topPeer);
        }
        return new ArrayList(linkedHashMap.values());
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x0714, code lost:
    
        if (r21.toLowerCase().startsWith(r14) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x074d, code lost:
    
        r6.add(r3);
        r9.put(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0727, code lost:
    
        if (r16.toLowerCase().startsWith(r14) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0737, code lost:
    
        if (r22.toLowerCase().startsWith(r14) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x074b, code lost:
    
        if (org.telegram.messenger.ContactsController.formatName(r16, r22).toLowerCase().startsWith(r14) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x07d0, code lost:
    
        if (r12.toLowerCase().startsWith(r14) == false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0805, code lost:
    
        r6.add(r5);
        r9.put(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x07e3, code lost:
    
        if (r10.toLowerCase().startsWith(r14) != false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x07f3, code lost:
    
        if (r11.toLowerCase().startsWith(r14) != false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0803, code lost:
    
        if (org.telegram.messenger.ContactsController.formatName(r10, r11).toLowerCase().startsWith(r14) != false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0413, code lost:
    
        if (r27.info != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0415, code lost:
    
        if (r15 == 0) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0417, code lost:
    
        r27.lastText = r12;
        r27.lastPosition = r3;
        r27.messages = r4;
        r27.delegate.needChangePanelVisibility(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0423, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x04bb, code lost:
    
        r27.resultStartPosition = r15;
        r27.resultLength = r11.length() + r9;
        r0 = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:535:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0121  */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37, types: [androidx.collection.LongSparseArray, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void searchUsernameOrHashtag(final CharSequence charSequence, int i, ArrayList arrayList, final boolean z, final boolean z2) {
        boolean z3;
        String str;
        boolean z4;
        final ArrayList arrayList2;
        StringBuilder sb;
        final int i2;
        String str2;
        ChatActivity chatActivity;
        char c;
        int i3;
        String str3;
        String str4;
        int i4;
        int i5;
        ?? r6;
        HashtagHint hashtagHint;
        HashtagHint hashtagHint2;
        ?? r62;
        ArrayList arrayList3;
        String str5;
        String str6;
        long j;
        long j2;
        boolean z5;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        String str7;
        boolean z6;
        TLRPC.User user;
        String str8;
        long j3;
        String str9;
        String str10;
        TLRPC.Chat chat2;
        long j4;
        ArrayList arrayList4;
        ?? r8;
        boolean z7;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat3 = this.chat;
        ChatActivity chatActivity2 = this.parentFragment;
        if (chatActivity2 != null) {
            chat3 = chatActivity2.getCurrentChat();
            this.parentFragment.getCurrentUser();
        }
        TLRPC.Chat chat4 = chat3;
        Runnable runnable = this.cancelDelayRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.cancelDelayRunnable = null;
        }
        if (this.channelReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.channelReqId, true);
            this.channelReqId = 0;
        }
        Runnable runnable2 = this.searchGlobalRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.searchGlobalRunnable = null;
        }
        Runnable runnable3 = this.checkAgainRunnable;
        if (runnable3 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable3);
            this.checkAgainRunnable = null;
        }
        if (TextUtils.isEmpty(charSequence2) || charSequence2.length() > MessagesController.getInstance(this.currentAccount).getMaxMessageLength()) {
            searchForContextBot(null, null);
            this.delegate.needChangePanelVisibility(false);
            this.lastText = null;
            clearStickers();
            return;
        }
        int i6 = charSequence2.length() > 0 ? i - 1 : i;
        this.lastText = null;
        this.lastUsernameOnly = z;
        this.lastForSearch = z2;
        StringBuilder sb2 = new StringBuilder();
        if (!z && charSequence2.length() > 0) {
            if (charSequence2.length() <= 14) {
                z3 = true;
                if (z3) {
                    str = "";
                } else {
                    int length = charSequence2.length();
                    CharSequence charSequence3 = charSequence2;
                    int i7 = 0;
                    while (i7 < length) {
                        char charAt = charSequence3.charAt(i7);
                        int i8 = length - 1;
                        char charAt2 = i7 < i8 ? charSequence3.charAt(i7 + 1) : (char) 0;
                        if (i7 < i8 && charAt == 55356 && charAt2 >= 57339 && charAt2 <= 57343) {
                            charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i7), charSequence3.subSequence(i7 + 2, charSequence3.length()));
                            length -= 2;
                        } else if (charAt == 65039) {
                            charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i7), charSequence3.subSequence(i7 + 1, charSequence3.length()));
                            length--;
                        } else {
                            i7++;
                        }
                        i7--;
                        i7++;
                    }
                    this.lastSticker = charSequence3.toString().trim();
                    str = charSequence2;
                }
                z4 = !z3 && (Emoji.isValidEmoji(str) || Emoji.isValidEmoji(this.lastSticker));
                if (z4 && (charSequence instanceof Spanned)) {
                    AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
                    z4 = animatedEmojiSpanArr != null || animatedEmojiSpanArr.length == 0;
                }
                if (!this.allowStickers && z4 && (chat4 == null || ChatObject.canSendStickers(chat4))) {
                    this.stickersToLoad.clear();
                    int i9 = SharedConfig.suggestStickers;
                    if (i9 == 2 || !z4) {
                        if (this.visibleByStickersSearch && i9 == 2) {
                            this.visibleByStickersSearch = false;
                            this.delegate.needChangePanelVisibility(false);
                            notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    this.stickers = null;
                    this.stickersMap = null;
                    if (this.lastReqId != 0) {
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.lastReqId, true);
                        r8 = 0;
                        this.lastReqId = 0;
                    } else {
                        r8 = 0;
                    }
                    boolean z8 = MessagesController.getInstance(this.currentAccount).suggestStickersApiOnly;
                    this.delayLocalResults = r8;
                    if (z8) {
                        arrayList2 = arrayList;
                        z7 = z8;
                        sb = sb2;
                        i2 = i;
                    } else {
                        sb = sb2;
                        z7 = z8;
                        i2 = i;
                        arrayList2 = arrayList;
                        this.checkAgainRunnable = new Runnable() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                MentionsAdapter.this.searchUsernameOrHashtag(charSequence, i2, arrayList2, z, z2);
                            }
                        };
                        MediaDataController.getInstance(this.currentAccount).loadRecents(r8, r8, true, r8);
                        MediaDataController.getInstance(this.currentAccount).loadRecents(2, r8, true, r8);
                        final ArrayList<TLRPC.Document> recentStickersNoCopy = MediaDataController.getInstance(this.currentAccount).getRecentStickersNoCopy(r8);
                        final ArrayList<TLRPC.Document> recentStickersNoCopy2 = MediaDataController.getInstance(this.currentAccount).getRecentStickersNoCopy(2);
                        int min = Math.min(20, recentStickersNoCopy.size());
                        int i10 = 0;
                        for (int i11 = 0; i11 < min; i11++) {
                            TLRPC.Document document = recentStickersNoCopy.get(i11);
                            if (isValidSticker(document, this.lastSticker)) {
                                addStickerToResult(document, "recent");
                                i10++;
                                if (i10 >= 5) {
                                    break;
                                }
                            }
                        }
                        int size = recentStickersNoCopy2.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.Document document2 = recentStickersNoCopy2.get(i12);
                            if (isValidSticker(document2, this.lastSticker)) {
                                addStickerToResult(document2, "fav");
                            }
                        }
                        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
                        HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.currentAccount).getAllStickers();
                        ArrayList<TLRPC.Document> arrayList5 = allStickers != null ? allStickers.get(this.lastSticker) : null;
                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                            addStickersToResult(arrayList5, null);
                        }
                        ArrayList arrayList6 = this.stickers;
                        if (arrayList6 != null) {
                            Collections.sort(arrayList6, new Comparator() { // from class: org.telegram.ui.Adapters.MentionsAdapter.5
                                private int getIndex(StickerResult stickerResult) {
                                    for (int i13 = 0; i13 < recentStickersNoCopy2.size(); i13++) {
                                        if (((TLRPC.Document) recentStickersNoCopy2.get(i13)).id == stickerResult.sticker.id) {
                                            return i13 + 2000000;
                                        }
                                    }
                                    for (int i14 = 0; i14 < Math.min(20, recentStickersNoCopy.size()); i14++) {
                                        if (((TLRPC.Document) recentStickersNoCopy.get(i14)).id == stickerResult.sticker.id) {
                                            return (recentStickersNoCopy.size() - i14) + MediaController.VIDEO_BITRATE_480;
                                        }
                                    }
                                    return -1;
                                }

                                @Override // java.util.Comparator
                                public int compare(StickerResult stickerResult, StickerResult stickerResult2) {
                                    boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(stickerResult.sticker, true);
                                    if (isAnimatedStickerDocument != MessageObject.isAnimatedStickerDocument(stickerResult2.sticker, true)) {
                                        return isAnimatedStickerDocument ? -1 : 1;
                                    }
                                    int index = getIndex(stickerResult);
                                    int index2 = getIndex(stickerResult2);
                                    if (index > index2) {
                                        return -1;
                                    }
                                    return index < index2 ? 1 : 0;
                                }
                            });
                        }
                    }
                    if (SharedConfig.suggestStickers == 0 || z7) {
                        searchServerStickers(this.lastSticker, str);
                    }
                    ArrayList arrayList7 = this.stickers;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        if (SharedConfig.suggestStickers == 0 && this.stickers.size() < 5) {
                            this.delayLocalResults = true;
                            this.delegate.needChangePanelVisibility(false);
                            this.visibleByStickersSearch = false;
                        } else {
                            checkStickerFilesExistAndDownload();
                            this.delegate.needChangePanelVisibility(this.stickersToLoad.isEmpty());
                            this.visibleByStickersSearch = true;
                        }
                        notifyDataSetChanged();
                    } else if (this.visibleByStickersSearch) {
                        this.delegate.needChangePanelVisibility(false);
                        this.visibleByStickersSearch = false;
                        c = 4;
                        str2 = null;
                    }
                    c = 4;
                    str2 = null;
                } else {
                    arrayList2 = arrayList;
                    sb = sb2;
                    i2 = i;
                    if (z && this.needBotContext && charSequence2.charAt(0) == '@') {
                        int indexOf = charSequence2.indexOf(32);
                        int length2 = charSequence2.length();
                        if (indexOf > 0) {
                            String substring = charSequence2.substring(1, indexOf);
                            str4 = charSequence2.substring(indexOf + 1);
                            str3 = substring;
                            i3 = 1;
                        } else if (charSequence2.charAt(length2 - 1) == 't' && charSequence2.charAt(length2 - 2) == 'o' && charSequence2.charAt(length2 - 3) == 'b') {
                            i3 = 1;
                            str3 = charSequence2.substring(1);
                            str4 = "";
                        } else {
                            i3 = 1;
                            searchForContextBot(null, null);
                            str3 = null;
                            str4 = null;
                        }
                        if (str3 != null && str3.length() >= i3) {
                            int i13 = 1;
                            while (true) {
                                if (i13 >= str3.length()) {
                                    str11 = str3;
                                    break;
                                }
                                char charAt3 = str3.charAt(i13);
                                if ((charAt3 < '0' || charAt3 > '9') && ((charAt3 < 'a' || charAt3 > 'z') && ((charAt3 < 'A' || charAt3 > 'Z') && charAt3 != '_'))) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        searchForContextBot(str11, str4);
                        str2 = null;
                    } else if (!this.allowStickers && (chatActivity = this.parentFragment) != null && chatActivity.getCurrentEncryptedChat() == null && ((chat4 == null || ChatObject.canSendStickers(chat4)) && charSequence2.trim().length() >= 2 && charSequence2.trim().indexOf(32) < 0)) {
                        str2 = null;
                        searchForContextBot(null, null);
                    } else {
                        str2 = null;
                        searchForContextBot(null, null);
                    }
                    c = 65535;
                }
                if (this.foundContextBot == null) {
                    return;
                }
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                String str12 = this.hintHashtag;
                this.hintHashtag = str2;
                this.hintHashtagDivider = false;
                if (z) {
                    sb.append(charSequence2.substring(1));
                    this.resultStartPosition = 0;
                    this.resultLength = sb.length();
                    c = 0;
                } else {
                    while (true) {
                        if (i6 < 0) {
                            break;
                        }
                        if (i6 < charSequence2.length()) {
                            char charAt4 = charSequence2.charAt(i6);
                            if (i6 != 0) {
                                int i14 = i6 - 1;
                                if (charSequence2.charAt(i14) != ' ' && charSequence2.charAt(i14) != '\n' && charAt4 != ':') {
                                    i5 = 0;
                                    sb.insert(i5, charAt4);
                                }
                            }
                            if (charAt4 == '@') {
                                boolean z9 = this.searchInDialogs;
                                if (z9 || this.needUsernames || (this.needBotContext && i6 == 0)) {
                                    break;
                                }
                            } else if (charAt4 == '#') {
                                if (ChatObject.isChannelAndNotMegaGroup(chat4) && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat4))) {
                                    String substring2 = charSequence2.substring(i6);
                                    this.hintHashtag = substring2;
                                    if (substring2.length() < 4 || !this.hintHashtag.matches("^[#$][\\p{L}_-]+$")) {
                                        this.hintHashtag = null;
                                    }
                                }
                                if (this.searchAdapterHelper.loadRecentHashtags()) {
                                    this.resultStartPosition = i6;
                                    this.resultLength = sb.length() + 1;
                                    sb.insert(0, charAt4);
                                    c = 1;
                                } else {
                                    this.lastText = charSequence2;
                                    this.lastPosition = i2;
                                    this.messages = arrayList2;
                                    return;
                                }
                            } else if (i6 == 0 && this.botInfo != null && charAt4 == '/') {
                                this.resultStartPosition = i6;
                                this.resultLength = sb.length() + 1;
                                c = 2;
                                break;
                            } else if (charAt4 == ':' && sb.length() > 0) {
                                if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb.charAt(0)) >= 0) {
                                    i4 = 1;
                                    if (sb.length() > 1) {
                                        break;
                                    }
                                } else {
                                    i4 = 1;
                                    break;
                                }
                            }
                            i5 = 0;
                            sb.insert(i5, charAt4);
                        }
                        i6--;
                    }
                    this.resultStartPosition = i6;
                    this.resultLength = sb.length() + 1;
                    c = 0;
                    r6 = 0;
                    if (str12 != null && this.hintHashtag != null) {
                        notifyItemRangeInserted(r6, 2);
                    } else if (str12 == null && this.hintHashtag == null) {
                        notifyItemRangeRemoved(r6, 2);
                    } else {
                        hashtagHint = this.topHint;
                        if (hashtagHint != 0) {
                            hashtagHint.set(r6, this.hintHashtag, chat4);
                        }
                        hashtagHint2 = this.bottomHint;
                        if (hashtagHint2 != null) {
                            hashtagHint2.set(1, this.hintHashtag, chat4);
                        }
                    }
                    if (c != 65535) {
                        this.contextMedia = r6;
                        this.searchResultBotContext = null;
                        this.delegate.needChangePanelVisibility(r6);
                        return;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            ArrayList arrayList8 = new ArrayList();
                            String lowerCase = sb.toString().toLowerCase();
                            ArrayList hashtags = this.searchAdapterHelper.getHashtags();
                            for (int i15 = 0; i15 < hashtags.size(); i15++) {
                                SearchAdapterHelper.HashtagObject hashtagObject = (SearchAdapterHelper.HashtagObject) hashtags.get(i15);
                                if (hashtagObject != null && (str6 = hashtagObject.hashtag) != null && str6.startsWith(lowerCase)) {
                                    arrayList8.add(hashtagObject.hashtag);
                                }
                            }
                            this.searchResultHashtags = arrayList8;
                            this.stickers = null;
                            this.searchResultUsernames = null;
                            this.searchResultUsernamesMap = null;
                            this.quickReplies = null;
                            this.searchResultCommands = null;
                            this.searchResultCommandsEphemeral = null;
                            this.searchResultCommandsHelp = null;
                            this.searchResultCommandsUsers = null;
                            this.searchResultSuggestions = null;
                            this.contextMedia = false;
                            this.searchResultBotContext = null;
                            notifyDataSetChanged();
                            this.delegate.needChangePanelVisibility((this.searchResultHashtags.isEmpty() && this.hintHashtag == null) ? false : true);
                            return;
                        }
                        if (c != 2) {
                            if (c == 3) {
                                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                if (!Arrays.equals(currentKeyboardLanguage, this.lastSearchKeyboardLanguage)) {
                                    MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                }
                                this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                                MediaDataController.getInstance(this.currentAccount).getEmojiSuggestions(this.lastSearchKeyboardLanguage, sb.toString(), false, new MediaDataController.KeywordResultCallback() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda5
                                    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
                                    public final void run(ArrayList arrayList9, String str13) {
                                        MentionsAdapter.$r8$lambda$FrjSOflCLM6nezBOA1EGIg2EtQc(MentionsAdapter.this, arrayList9, str13);
                                    }
                                }, SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(this.currentAccount).isPremium());
                                return;
                            }
                            if (c == 4) {
                                this.searchResultHashtags = null;
                                this.searchResultUsernames = null;
                                this.searchResultUsernamesMap = null;
                                this.searchResultSuggestions = null;
                                this.searchResultCommands = null;
                                this.searchResultCommandsEphemeral = null;
                                this.quickReplies = null;
                                this.searchResultCommandsHelp = null;
                                this.searchResultCommandsUsers = null;
                                return;
                            }
                            return;
                        }
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        String lowerCase2 = sb.toString().toLowerCase();
                        for (int i16 = 0; i16 < this.botInfo.size(); i16++) {
                            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i16);
                            for (int i17 = 0; i17 < botInfo.commands.size(); i17++) {
                                TLRPC.BotCommand botCommand = botInfo.commands.get(i17);
                                if (botCommand != null && (str5 = botCommand.command) != null && str5.startsWith(lowerCase2)) {
                                    arrayList9.add("/" + botCommand.command);
                                    arrayList10.add(botCommand.description);
                                    arrayList11.add(messagesController.getUser(Long.valueOf(botInfo.user_id)));
                                    arrayList12.add(Boolean.valueOf(botCommand.ephemeral));
                                }
                            }
                        }
                        if (this.parentFragment != null && !DialogObject.isEncryptedDialog(this.dialog_id) && this.parentFragment.getChatMode() == 0 && this.parentFragment.getCurrentUser() != null && !this.parentFragment.getCurrentUser().bot && !UserObject.isReplyUser(this.parentFragment.getCurrentUser()) && !UserObject.isService(this.parentFragment.getCurrentUser().id)) {
                            QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.currentAccount);
                            quickRepliesController.load();
                            this.quickRepliesQuery = lowerCase2;
                            this.quickReplies = new ArrayList();
                            for (int i18 = 0; i18 < quickRepliesController.replies.size(); i18++) {
                                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) quickRepliesController.replies.get(i18);
                                if (!quickReply.isSpecial()) {
                                    String lowerCase3 = quickReply.name.toLowerCase();
                                    if (lowerCase3.startsWith(lowerCase2) || AndroidUtilities.translitSafe(lowerCase3).startsWith(lowerCase2)) {
                                        this.quickReplies.add(quickReply);
                                    }
                                }
                            }
                            r62 = 0;
                        } else {
                            r62 = 0;
                            this.quickRepliesQuery = null;
                            this.quickReplies = null;
                        }
                        this.searchResultHashtags = r62;
                        this.stickers = r62;
                        this.searchResultUsernames = r62;
                        this.searchResultUsernamesMap = r62;
                        this.searchResultSuggestions = r62;
                        this.searchResultCommands = arrayList9;
                        this.searchResultCommandsHelp = arrayList10;
                        this.searchResultCommandsUsers = arrayList11;
                        this.searchResultCommandsEphemeral = arrayList12;
                        this.contextMedia = false;
                        this.searchResultBotContext = r62;
                        notifyDataSetChanged();
                        this.delegate.needChangePanelVisibility((arrayList9.isEmpty() && ((arrayList3 = this.quickReplies) == null || arrayList3.isEmpty())) ? false : true);
                        return;
                    }
                    this.contextMedia = r6;
                    this.searchResultBotContext = null;
                    final ArrayList arrayList13 = new ArrayList();
                    long j5 = 0;
                    if (arrayList2 != null) {
                        for (int i19 = 0; i19 < Math.min(100, arrayList2.size()); i19++) {
                            long fromChatId = ((MessageObject) arrayList2.get(i19)).getFromChatId();
                            if (fromChatId > 0 && !arrayList13.contains(Long.valueOf(fromChatId))) {
                                arrayList13.add(Long.valueOf(fromChatId));
                            }
                        }
                    }
                    String lowerCase4 = sb.toString().toLowerCase();
                    boolean z10 = lowerCase4.indexOf(32) >= 0;
                    final ArrayList arrayList14 = new ArrayList();
                    LongSparseArray longSparseArray = new LongSparseArray();
                    final LongSparseArray longSparseArray2 = new LongSparseArray();
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
                    if (chat4 == null || (!ChatObject.isMonoForum(chat4) && !ChatObject.isChannelAndNotMegaGroup(chat4))) {
                        arrayList15.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
                    }
                    ArrayList sortAndDeduplicateTopPeers = sortAndDeduplicateTopPeers(arrayList15);
                    if (!z && this.needBotContext && i6 == 0 && !sortAndDeduplicateTopPeers.isEmpty()) {
                        int i20 = 0;
                        int i21 = 0;
                        while (i20 < sortAndDeduplicateTopPeers.size()) {
                            j = j5;
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) sortAndDeduplicateTopPeers.get(i20)).peer.user_id));
                            if (user2 != null) {
                                String publicUsername = UserObject.getPublicUsername(user2);
                                if (TextUtils.isEmpty(publicUsername) || !(lowerCase4.length() == 0 || publicUsername.toLowerCase().startsWith(lowerCase4))) {
                                    arrayList4 = sortAndDeduplicateTopPeers;
                                } else {
                                    arrayList14.add(user2);
                                    arrayList4 = sortAndDeduplicateTopPeers;
                                    longSparseArray.put(user2.id, user2);
                                    longSparseArray2.put(user2.id, user2);
                                    i21++;
                                }
                                if (i21 == 5) {
                                    break;
                                }
                            } else {
                                arrayList4 = sortAndDeduplicateTopPeers;
                            }
                            i20++;
                            j5 = j;
                            sortAndDeduplicateTopPeers = arrayList4;
                        }
                    }
                    j = j5;
                    ChatActivity chatActivity3 = this.parentFragment;
                    if (chatActivity3 != null) {
                        chat4 = chatActivity3.getCurrentChat();
                        j2 = this.parentFragment.getThreadId();
                    } else {
                        TLRPC.ChatFull chatFull2 = this.info;
                        if (chatFull2 != null) {
                            chat4 = messagesController.getChat(Long.valueOf(chatFull2.id));
                        }
                        j2 = j;
                    }
                    TLRPC.Chat chat5 = chat4;
                    TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                    if (chat5 != null && (chatFull = this.info) != null && chatFull.participants != null && (!ChatObject.isChannel(chat5) || chat5.megagroup)) {
                        int i22 = -2;
                        while (i22 < this.info.participants.participants.size()) {
                            if (i22 == -2) {
                                if (currentUser != null && z) {
                                    String str13 = currentUser.first_name;
                                    String str14 = currentUser.last_name;
                                    str9 = UserObject.getPublicUsername(currentUser);
                                    str10 = str13;
                                    str8 = str14;
                                    chat2 = currentUser;
                                    str7 = lowerCase4;
                                    z6 = z10;
                                    j3 = currentUser.id;
                                    if (TextUtils.isEmpty(str9)) {
                                        j4 = j2;
                                    } else {
                                        j4 = j2;
                                    }
                                    if (!TextUtils.isEmpty(str10)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (z6) {
                                    }
                                }
                                str7 = lowerCase4;
                                z6 = z10;
                                j4 = j2;
                            } else {
                                if (i22 == -1) {
                                    if (z2) {
                                        if (lowerCase4.length() == 0) {
                                            arrayList14.add(chat5);
                                        } else {
                                            String str15 = chat5.title;
                                            str7 = lowerCase4;
                                            str9 = ChatObject.getPublicUsername(chat5);
                                            str8 = null;
                                            str10 = str15;
                                            z6 = z10;
                                            j3 = -chat5.id;
                                            chat2 = chat5;
                                        }
                                    }
                                    str7 = lowerCase4;
                                    z6 = z10;
                                    j4 = j2;
                                } else {
                                    str7 = lowerCase4;
                                    TLRPC.ChatParticipant chatParticipant = this.info.participants.participants.get(i22);
                                    z6 = z10;
                                    if ((currentUser == null || chatParticipant.user_id != currentUser.id) && (user = messagesController.getUser(Long.valueOf(chatParticipant.user_id))) != 0 && !UserObject.isUserSelf(user) && longSparseArray.indexOfKey(user.id) < 0) {
                                        if (str7.length() == 0 && !user.deleted) {
                                            arrayList14.add(user);
                                        } else {
                                            String str16 = user.first_name;
                                            String str17 = user.last_name;
                                            String publicUsername2 = UserObject.getPublicUsername(user);
                                            str8 = str17;
                                            j3 = user.id;
                                            str9 = publicUsername2;
                                            str10 = str16;
                                            chat2 = user;
                                        }
                                    }
                                    j4 = j2;
                                }
                                if (TextUtils.isEmpty(str9)) {
                                }
                                if (!TextUtils.isEmpty(str10)) {
                                }
                                if (!TextUtils.isEmpty(str8)) {
                                }
                                if (z6) {
                                }
                            }
                            i22++;
                            lowerCase4 = str7;
                            z10 = z6;
                            j2 = j4;
                        }
                    }
                    String str18 = lowerCase4;
                    boolean z11 = z10;
                    long j6 = j2;
                    if (this.searchInDialogs) {
                        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                        int i23 = 0;
                        while (i23 < allDialogs.size()) {
                            if (allDialogs.get(i23).id > j) {
                                TLRPC.User user3 = messagesController.getUser(Long.valueOf(allDialogs.get(i23).id));
                                if (user3 != null && !UserObject.isUserSelf(user3) && longSparseArray.indexOfKey(user3.id) < 0) {
                                    if (str18.length() == 0 && !user3.deleted) {
                                        arrayList14.add(user3);
                                    } else {
                                        String str19 = user3.first_name;
                                        String str20 = user3.last_name;
                                        String publicUsername3 = UserObject.getPublicUsername(user3);
                                        long j7 = user3.id;
                                        if (TextUtils.isEmpty(publicUsername3)) {
                                            z5 = z11;
                                        } else {
                                            z5 = z11;
                                        }
                                        if (!TextUtils.isEmpty(str19)) {
                                        }
                                        if (!TextUtils.isEmpty(str20)) {
                                        }
                                        if (z5) {
                                        }
                                    }
                                }
                                z5 = z11;
                            } else {
                                z5 = z11;
                                if (!TextUtils.isEmpty(str18) && (chat = messagesController.getChat(Long.valueOf(-allDialogs.get(i23).id))) != null && chat.username != null && longSparseArray.indexOfKey(chat.id) < 0) {
                                    if (str18.length() == 0) {
                                        arrayList14.add(chat);
                                    } else {
                                        String str21 = chat.title;
                                        String str22 = chat.username;
                                        long j8 = chat.id;
                                        if ((!TextUtils.isEmpty(str22) && str22.toLowerCase().startsWith(str18)) || (!TextUtils.isEmpty(str21) && str21.toLowerCase().startsWith(str18))) {
                                            arrayList14.add(chat);
                                            longSparseArray2.put(j8, chat);
                                        }
                                    }
                                }
                            }
                            i23++;
                            z11 = z5;
                        }
                    }
                    Collections.sort(arrayList14, new Comparator() { // from class: org.telegram.ui.Adapters.MentionsAdapter.6
                        private long getId(TLObject tLObject) {
                            if (tLObject instanceof TLRPC.User) {
                                return ((TLRPC.User) tLObject).id;
                            }
                            return -((TLRPC.Chat) tLObject).id;
                        }

                        @Override // java.util.Comparator
                        public int compare(TLObject tLObject, TLObject tLObject2) {
                            long id = getId(tLObject);
                            long id2 = getId(tLObject2);
                            if (longSparseArray2.indexOfKey(id) >= 0 && longSparseArray2.indexOfKey(id2) >= 0) {
                                return 0;
                            }
                            if (longSparseArray2.indexOfKey(id) >= 0) {
                                return -1;
                            }
                            if (longSparseArray2.indexOfKey(id2) >= 0) {
                                return 1;
                            }
                            int indexOf2 = arrayList13.indexOf(Long.valueOf(id));
                            int indexOf3 = arrayList13.indexOf(Long.valueOf(id2));
                            if (indexOf2 != -1 && indexOf3 != -1) {
                                if (indexOf2 < indexOf3) {
                                    return -1;
                                }
                                return indexOf2 == indexOf3 ? 0 : 1;
                            }
                            if (indexOf2 == -1 || indexOf3 != -1) {
                                return (indexOf2 != -1 || indexOf3 == -1) ? 0 : 1;
                            }
                            return -1;
                        }
                    });
                    this.searchResultHashtags = null;
                    this.stickers = null;
                    this.quickReplies = null;
                    this.searchResultCommands = null;
                    this.searchResultCommandsEphemeral = null;
                    this.searchResultCommandsHelp = null;
                    this.searchResultCommandsUsers = null;
                    this.searchResultSuggestions = null;
                    if (((chat5 != null && chat5.megagroup) || this.searchInDialogs) && str18.length() > 0) {
                        if (arrayList14.size() < 5) {
                            Runnable runnable4 = new Runnable() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MentionsAdapter.$r8$lambda$aqOFF8rYLGVmfQrjC23gXAXSy-4(MentionsAdapter.this, arrayList14, longSparseArray2);
                                }
                            };
                            this.cancelDelayRunnable = runnable4;
                            AndroidUtilities.runOnUIThread(runnable4, 1000L);
                        } else {
                            showUsersResult(arrayList14, longSparseArray2, true);
                        }
                        7 r0 = new 7(chat5, str18, j6, arrayList14, longSparseArray2, messagesController);
                        this.searchGlobalRunnable = r0;
                        AndroidUtilities.runOnUIThread(r0, 200L);
                        return;
                    }
                    showUsersResult(arrayList14, longSparseArray2, true);
                    return;
                }
                r6 = 0;
                i6 = -1;
                if (str12 != null) {
                }
                if (str12 == null) {
                }
                hashtagHint = this.topHint;
                if (hashtagHint != 0) {
                }
                hashtagHint2 = this.bottomHint;
                if (hashtagHint2 != null) {
                }
                if (c != 65535) {
                }
            }
        }
        z3 = false;
        if (z3) {
        }
        if (z3) {
        }
        if (z4) {
            AnimatedEmojiSpan[] animatedEmojiSpanArr2 = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
            if (animatedEmojiSpanArr2 != null) {
            }
        }
        if (!this.allowStickers) {
        }
        arrayList2 = arrayList;
        sb = sb2;
        i2 = i;
        if (z) {
        }
        if (!this.allowStickers) {
        }
        str2 = null;
        searchForContextBot(null, null);
        c = 65535;
        if (this.foundContextBot == null) {
        }
    }

    public static /* synthetic */ void $r8$lambda$aqOFF8rYLGVmfQrjC23gXAXSy-4(MentionsAdapter mentionsAdapter, ArrayList arrayList, LongSparseArray longSparseArray) {
        mentionsAdapter.cancelDelayRunnable = null;
        mentionsAdapter.showUsersResult(arrayList, longSparseArray, true);
    }

    class 7 implements Runnable {
        final /* synthetic */ TLRPC.Chat val$chat;
        final /* synthetic */ MessagesController val$messagesController;
        final /* synthetic */ LongSparseArray val$newMap;
        final /* synthetic */ ArrayList val$newResult;
        final /* synthetic */ long val$threadId;
        final /* synthetic */ String val$usernameString;

        7(TLRPC.Chat chat, String str, long j, ArrayList arrayList, LongSparseArray longSparseArray, MessagesController messagesController) {
            this.val$chat = chat;
            this.val$usernameString = str;
            this.val$threadId = j;
            this.val$newResult = arrayList;
            this.val$newMap = longSparseArray;
            this.val$messagesController = messagesController;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MentionsAdapter.this.searchGlobalRunnable != this) {
                return;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.val$chat);
            tL_channels_getParticipants.limit = 20;
            tL_channels_getParticipants.offset = 0;
            TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
            int i = tL_channelParticipantsMentions.flags;
            tL_channelParticipantsMentions.flags = i | 1;
            tL_channelParticipantsMentions.q = this.val$usernameString;
            long j = this.val$threadId;
            if (j != 0) {
                tL_channelParticipantsMentions.flags = i | 3;
                tL_channelParticipantsMentions.top_msg_id = (int) j;
            }
            tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
            final int access$1704 = MentionsAdapter.access$1704(MentionsAdapter.this);
            MentionsAdapter mentionsAdapter = MentionsAdapter.this;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(mentionsAdapter.currentAccount);
            final ArrayList arrayList = this.val$newResult;
            final LongSparseArray longSparseArray = this.val$newMap;
            final MessagesController messagesController = this.val$messagesController;
            mentionsAdapter.channelReqId = connectionsManager.sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: org.telegram.ui.Adapters.MentionsAdapter$7$$ExternalSyntheticLambda0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MentionsAdapter.7.$r8$lambda$GbNyoj88ET-EeDcc6FugJEVVLBI(MentionsAdapter.7.this, access$1704, arrayList, longSparseArray, messagesController, tLObject, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$GbNyoj88ET-EeDcc6FugJEVVLBI(final 7 r8, final int i, final ArrayList arrayList, final LongSparseArray longSparseArray, final MessagesController messagesController, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            r8.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.MentionsAdapter$7$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MentionsAdapter.7.$r8$lambda$K8UUnJxcF5-nCg3Gd8FW7m5C7y8(MentionsAdapter.7.this, i, arrayList, longSparseArray, tL_error, tLObject, messagesController);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$K8UUnJxcF5-nCg3Gd8FW7m5C7y8(7 r6, int i, ArrayList arrayList, LongSparseArray longSparseArray, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController) {
            if (MentionsAdapter.this.channelReqId != 0 && i == MentionsAdapter.this.channelLastReqId && MentionsAdapter.this.searchResultUsernamesMap != null && MentionsAdapter.this.searchResultUsernames != null) {
                MentionsAdapter.this.showUsersResult(arrayList, longSparseArray, false);
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    MentionsAdapter.this.searchResultUsernames.isEmpty();
                    if (!tL_channels_channelParticipants.participants.isEmpty()) {
                        long clientUserId = UserConfig.getInstance(MentionsAdapter.this.currentAccount).getClientUserId();
                        for (int i2 = 0; i2 < tL_channels_channelParticipants.participants.size(); i2++) {
                            long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i2).peer);
                            if (MentionsAdapter.this.searchResultUsernamesMap.indexOfKey(peerId) < 0 && ((peerId != 0 || MentionsAdapter.this.searchResultUsernamesMap.indexOfKey(clientUserId) < 0) && (MentionsAdapter.this.isSearchingMentions || (peerId != clientUserId && peerId != 0)))) {
                                if (peerId >= 0) {
                                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                                    if (user == null) {
                                        return;
                                    } else {
                                        MentionsAdapter.this.searchResultUsernames.add(user);
                                    }
                                } else {
                                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                                    if (chat == null) {
                                        return;
                                    } else {
                                        MentionsAdapter.this.searchResultUsernames.add(chat);
                                    }
                                }
                            }
                        }
                    }
                }
                MentionsAdapter.this.notifyDataSetChanged();
                MentionsAdapter.this.delegate.needChangePanelVisibility(!MentionsAdapter.this.searchResultUsernames.isEmpty());
            }
            MentionsAdapter.this.channelReqId = 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$FrjSOflCLM6nezBOA1EGIg2EtQc(MentionsAdapter mentionsAdapter, ArrayList arrayList, String str) {
        mentionsAdapter.searchResultSuggestions = arrayList;
        mentionsAdapter.searchResultHashtags = null;
        mentionsAdapter.stickers = null;
        mentionsAdapter.searchResultUsernames = null;
        mentionsAdapter.searchResultUsernamesMap = null;
        mentionsAdapter.searchResultCommands = null;
        mentionsAdapter.searchResultCommandsEphemeral = null;
        mentionsAdapter.quickReplies = null;
        mentionsAdapter.searchResultCommandsHelp = null;
        mentionsAdapter.searchResultCommandsUsers = null;
        mentionsAdapter.notifyDataSetChanged();
        MentionsAdapterDelegate mentionsAdapterDelegate = mentionsAdapter.delegate;
        ArrayList arrayList2 = mentionsAdapter.searchResultSuggestions;
        mentionsAdapterDelegate.needChangePanelVisibility((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }

    public void setIsReversed(boolean z) {
        if (this.isReversed != z) {
            this.isReversed = z;
            int lastItemCount = getLastItemCount();
            if (lastItemCount > 0) {
                notifyItemChanged(0);
            }
            if (lastItemCount > 1) {
                notifyItemChanged(lastItemCount - 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUsersResult(ArrayList arrayList, LongSparseArray longSparseArray, boolean z) {
        this.searchResultUsernames = arrayList;
        if ((!this.allowBots || !this.allowChats) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.allowChats) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.searchResultUsernamesMap = longSparseArray;
        Runnable runnable = this.cancelDelayRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.cancelDelayRunnable = null;
        }
        this.searchResultBotContext = null;
        this.stickers = null;
        if (z) {
            notifyDataSetChanged();
            this.delegate.needChangePanelVisibility(!this.searchResultUsernames.isEmpty());
        }
    }

    public int getResultStartPosition() {
        return this.resultStartPosition;
    }

    public int getResultLength() {
        return this.resultLength;
    }

    public ArrayList getSearchResultBotContext() {
        return this.searchResultBotContext;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int itemCountInternal = getItemCountInternal();
        this.lastItemCount = itemCountInternal;
        return itemCountInternal;
    }

    public int getLastItemCount() {
        return this.lastItemCount;
    }

    public int getItemCountInternal() {
        int i = 1;
        if (this.foundContextBot != null && !this.inlineMediaEnabled) {
            return 1;
        }
        int i2 = this.hintHashtag != null ? 2 : 0;
        ArrayList arrayList = this.stickers;
        if (arrayList != null) {
            return i2 + arrayList.size();
        }
        ArrayList arrayList2 = this.searchResultBotContext;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            if (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) {
                i = 0;
            }
            return i2 + size + i;
        }
        ArrayList arrayList3 = this.searchResultUsernames;
        if (arrayList3 != null) {
            return i2 + arrayList3.size();
        }
        ArrayList arrayList4 = this.searchResultHashtags;
        if (arrayList4 != null) {
            return i2 + arrayList4.size();
        }
        if (this.searchResultCommands != null || this.quickReplies != null) {
            ArrayList arrayList5 = this.quickReplies;
            int size2 = arrayList5 == null ? 0 : arrayList5.size();
            ArrayList arrayList6 = this.searchResultCommands;
            return i2 + size2 + (arrayList6 != null ? arrayList6.size() : 0);
        }
        ArrayList arrayList7 = this.searchResultSuggestions;
        return arrayList7 != null ? i2 + arrayList7.size() : i2;
    }

    public void clear(boolean z) {
        if (!z || (this.channelReqId == 0 && this.contextQueryReqid == 0 && this.contextUsernameReqid == 0 && this.lastReqId == 0)) {
            this.foundContextBot = null;
            this.hintHashtag = null;
            ArrayList arrayList = this.stickers;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.searchResultBotContext;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            this.searchResultBotContextSwitch = null;
            this.searchResultBotWebViewSwitch = null;
            ArrayList arrayList3 = this.searchResultUsernames;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            ArrayList arrayList4 = this.searchResultHashtags;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            ArrayList arrayList5 = this.searchResultCommands;
            if (arrayList5 != null) {
                arrayList5.clear();
            }
            ArrayList arrayList6 = this.quickReplies;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            ArrayList arrayList7 = this.searchResultSuggestions;
            if (arrayList7 != null) {
                arrayList7.clear();
            }
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.hintHashtag != null) {
            if (i < 2) {
                return 6;
            }
            i -= 2;
        }
        if (this.stickers != null) {
            return 4;
        }
        if (this.foundContextBot != null && !this.inlineMediaEnabled) {
            return 3;
        }
        if (this.searchResultBotContext == null) {
            ArrayList arrayList = this.quickReplies;
            return (arrayList == null || i < 0 || i >= arrayList.size()) ? 0 : 5;
        }
        if (i == 0) {
            return (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? 1 : 2;
        }
        return 1;
    }

    public void addHashtagsFromMessage(CharSequence charSequence) {
        this.searchAdapterHelper.addHashtagsFromMessage(charSequence);
    }

    public int getItemPosition(int i) {
        if (this.hintHashtag != null) {
            if (i < 2) {
                return 0;
            }
            i -= 2;
        }
        return this.searchResultBotContext != null ? (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? i : i - 1 : i;
    }

    public Object getItemParent(int i) {
        if (this.hintHashtag != null) {
            if (i < 2) {
                return null;
            }
            i -= 2;
        }
        ArrayList arrayList = this.stickers;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return ((StickerResult) this.stickers.get(i)).parent;
    }

    public Object getItem(int i) {
        String str;
        TLRPC.User user = null;
        if (this.hintHashtag != null) {
            if (i < 2) {
                return null;
            }
            i -= 2;
        }
        ArrayList arrayList = this.stickers;
        if (arrayList != null) {
            if (i < 0 || i >= arrayList.size()) {
                return null;
            }
            return ((StickerResult) this.stickers.get(i)).sticker;
        }
        ArrayList arrayList2 = this.searchResultBotContext;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.searchResultBotWebViewSwitch;
            if (tL_inlineBotWebView == null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.searchResultBotContextSwitch;
                if (tL_inlineBotSwitchPM != null) {
                    if (i == 0) {
                        return tL_inlineBotSwitchPM;
                    }
                }
                if (i >= 0 || i >= arrayList2.size()) {
                    return null;
                }
                return this.searchResultBotContext.get(i);
            }
            if (i == 0) {
                return tL_inlineBotWebView;
            }
            i--;
            if (i >= 0) {
            }
            return null;
        }
        ArrayList arrayList3 = this.searchResultUsernames;
        if (arrayList3 != null) {
            if (i < 0 || i >= arrayList3.size()) {
                return null;
            }
            return this.searchResultUsernames.get(i);
        }
        ArrayList arrayList4 = this.searchResultHashtags;
        if (arrayList4 != null) {
            if (i < 0 || i >= arrayList4.size()) {
                return null;
            }
            return this.searchResultHashtags.get(i);
        }
        ArrayList arrayList5 = this.searchResultSuggestions;
        if (arrayList5 != null) {
            if (i < 0 || i >= arrayList5.size()) {
                return null;
            }
            return this.searchResultSuggestions.get(i);
        }
        ArrayList arrayList6 = this.quickReplies;
        if (arrayList6 != null || this.searchResultCommands != null) {
            if (arrayList6 != null) {
                if (i >= 0 && i < arrayList6.size()) {
                    return this.quickReplies.get(i);
                }
                ArrayList arrayList7 = this.quickReplies;
                if (arrayList7 != null) {
                    i -= arrayList7.size();
                }
            }
            ArrayList arrayList8 = this.searchResultCommands;
            if (arrayList8 != null && i >= 0 && i < arrayList8.size()) {
                ArrayList arrayList9 = this.searchResultCommandsUsers;
                if (arrayList9 != null && (this.botsCount != 1 || (this.info instanceof TLRPC.TL_channelFull))) {
                    if (arrayList9.get(i) != null) {
                        user = (TLRPC.User) this.searchResultCommandsUsers.get(i);
                        str = String.format("%s@%s", this.searchResultCommands.get(i), user != null ? UserObject.getPublicUsername(user) : "");
                    } else {
                        str = String.format("%s", this.searchResultCommands.get(i));
                    }
                } else {
                    str = (String) this.searchResultCommands.get(i);
                }
                ArrayList arrayList10 = this.searchResultCommandsEphemeral;
                if (arrayList10 == null || !((Boolean) arrayList10.get(i)).booleanValue()) {
                    return str;
                }
                return new EphemeralCommand(str, user != null ? user.id : 0L);
            }
        }
        return null;
    }

    public static class EphemeralCommand {
        public final long botUserId;
        public final String command;

        public EphemeralCommand(String str, long j) {
            this.command = str;
            this.botUserId = j;
        }
    }

    public boolean isLongClickEnabled() {
        return (this.searchResultHashtags == null && this.searchResultCommands == null) ? false : true;
    }

    public boolean isBotCommands() {
        return this.searchResultCommands != null;
    }

    public boolean isStickers() {
        return this.stickers != null;
    }

    public boolean isBotContext() {
        return this.searchResultBotContext != null;
    }

    public boolean isBannedInline() {
        return (this.foundContextBot == null || this.inlineMediaEnabled) ? false : true;
    }

    public boolean isMediaLayout() {
        return this.contextMedia || this.stickers != null;
    }

    @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return (this.foundContextBot == null || this.inlineMediaEnabled) && this.stickers == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        if (i == 0) {
            MentionCell mentionCell = new MentionCell(this.mContext, this.resourcesProvider);
            mentionCell.setIsDarkTheme(this.isDarkTheme);
            view = mentionCell;
        } else if (i == 1) {
            ContextLinkCell contextLinkCell = new ContextLinkCell(this.mContext);
            contextLinkCell.setDelegate(new ContextLinkCell.ContextLinkCellDelegate() { // from class: org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda6
                @Override // org.telegram.ui.Cells.ContextLinkCell.ContextLinkCellDelegate
                public final void didPressedImage(ContextLinkCell contextLinkCell2) {
                    MentionsAdapter.this.delegate.onContextClick(contextLinkCell2.getResult());
                }
            });
            view = contextLinkCell;
        } else if (i != 2) {
            if (i == 3) {
                TextView textView = new TextView(this.mContext);
                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
                view2 = textView;
            } else if (i == 5) {
                view = new QuickRepliesActivity.QuickReplyView(this.mContext, false, this.resourcesProvider);
            } else if (i == 6) {
                view = new HashtagHint(this.mContext, this.stories, this.resourcesProvider);
            } else if (i == 7) {
                View view3 = new View(this.mContext) { // from class: org.telegram.ui.Adapters.MentionsAdapter.8
                    @Override // android.view.View
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(8.0f), TLObject.FLAG_30));
                    }
                };
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(this.stories ? Theme.multAlpha(-1, 0.15f) : Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider)), Theme.getThemedDrawable(this.mContext, R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, this.resourcesProvider)), 0, 0);
                combinedDrawable.setFullsize(true);
                view3.setBackground(combinedDrawable);
                view2 = view3;
            } else {
                view = new StickerCell(this.mContext, this.resourcesProvider);
            }
            view = view2;
        } else {
            view = new BotSwitchCell(this.mContext);
        }
        return new RecyclerListView.Holder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ChatActivity chatActivity;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.hintHashtag != null) {
            i -= 2;
        }
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 4) {
            StickerCell stickerCell = (StickerCell) viewHolder.itemView;
            if (i < 0 || i >= this.stickers.size()) {
                return;
            }
            StickerResult stickerResult = (StickerResult) this.stickers.get(i);
            stickerCell.setSticker(stickerResult.sticker, stickerResult.parent);
            stickerCell.setClearsInputField(true);
            return;
        }
        if (itemViewType == 3) {
            TextView textView = (TextView) viewHolder.itemView;
            TLRPC.Chat currentChat = this.parentFragment.getCurrentChat();
            if (currentChat != null) {
                if (!ChatObject.hasAdminRights(currentChat) && (tL_chatBannedRights = currentChat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                    return;
                } else if (AndroidUtilities.isBannedForever(currentChat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                    return;
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(currentChat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (itemViewType == 5) {
            QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
            ArrayList arrayList = this.quickReplies;
            if (arrayList == null || i < 0 || i >= arrayList.size()) {
                return;
            }
            quickReplyView.set((QuickRepliesController.QuickReply) this.quickReplies.get(i), this.quickRepliesQuery, false);
            return;
        }
        if (this.searchResultBotContext != null) {
            boolean z = (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? false : true;
            if (viewHolder.getItemViewType() == 2) {
                if (z) {
                    BotSwitchCell botSwitchCell = (BotSwitchCell) viewHolder.itemView;
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.searchResultBotContextSwitch;
                    botSwitchCell.setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.searchResultBotWebViewSwitch.text);
                    return;
                }
                return;
            }
            if (z) {
                i--;
            }
            if (i < 0 || i >= this.searchResultBotContext.size()) {
                return;
            }
            ((ContextLinkCell) viewHolder.itemView).setLink((TLRPC.BotInlineResult) this.searchResultBotContext.get(i), this.foundContextBot, this.contextMedia, i != this.searchResultBotContext.size() - 1, z && i == 0, "gif".equals(this.searchingContextUsername));
            return;
        }
        if (itemViewType == 6) {
            HashtagHint hashtagHint = (HashtagHint) viewHolder.itemView;
            int i2 = i + 2;
            if (i2 == 0) {
                this.topHint = hashtagHint;
            } else {
                this.bottomHint = hashtagHint;
            }
            TLRPC.Chat chat = this.chat;
            if (chat == null && (chatActivity = this.parentFragment) != null) {
                chat = chatActivity.getCurrentChat();
            }
            hashtagHint.set(i2, this.hintHashtag, chat);
            return;
        }
        if (itemViewType == 7) {
            return;
        }
        MentionCell mentionCell = (MentionCell) viewHolder.itemView;
        ArrayList arrayList2 = this.searchResultUsernames;
        if (arrayList2 != null) {
            TLObject tLObject = (TLObject) arrayList2.get(i);
            if (tLObject instanceof TLRPC.User) {
                mentionCell.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                mentionCell.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList3 = this.searchResultHashtags;
            if (arrayList3 != null && i >= 0 && i < arrayList3.size()) {
                mentionCell.setText((String) this.searchResultHashtags.get(i));
            } else {
                ArrayList arrayList4 = this.searchResultSuggestions;
                if (arrayList4 != null && i >= 0 && i < arrayList4.size()) {
                    mentionCell.setEmojiSuggestion((MediaDataController.KeywordResult) this.searchResultSuggestions.get(i));
                } else {
                    ArrayList arrayList5 = this.searchResultCommands;
                    if (arrayList5 != null && i >= 0 && i < arrayList5.size()) {
                        ArrayList arrayList6 = this.searchResultCommandsHelp;
                        Boolean bool = null;
                        String str = (arrayList6 == null || i < 0 || i >= arrayList6.size()) ? null : (String) this.searchResultCommandsHelp.get(i);
                        ArrayList arrayList7 = this.searchResultCommandsUsers;
                        TLRPC.User user = (arrayList7 == null || i < 0 || i >= arrayList7.size()) ? null : (TLRPC.User) this.searchResultCommandsUsers.get(i);
                        ArrayList arrayList8 = this.searchResultCommandsEphemeral;
                        if (arrayList8 != null && i >= 0 && i < arrayList8.size()) {
                            bool = (Boolean) this.searchResultCommandsEphemeral.get(i);
                        }
                        mentionCell.setBotCommand((String) this.searchResultCommands.get(i), str, user, bool.booleanValue());
                    }
                }
            }
        }
        mentionCell.setDivider(false);
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        TLRPC.User user;
        if (i == 2 && (user = this.foundContextBot) != null && user.bot_inline_geo) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.locationProvider.start();
            } else {
                onLocationUnavailable();
            }
        }
    }

    public void doSomeStickersAction() {
        MentionsAdapter mentionsAdapter;
        if (isStickers()) {
            if (this.mentionsStickersActionTracker == null) {
                mentionsAdapter = this;
                EmojiView.ChooseStickerActionTracker chooseStickerActionTracker = new EmojiView.ChooseStickerActionTracker(this.currentAccount, this.dialog_id, this.threadMessageId) { // from class: org.telegram.ui.Adapters.MentionsAdapter.9
                    @Override // org.telegram.ui.Components.EmojiView.ChooseStickerActionTracker
                    public boolean isShown() {
                        return MentionsAdapter.this.isStickers();
                    }
                };
                mentionsAdapter.mentionsStickersActionTracker = chooseStickerActionTracker;
                chooseStickerActionTracker.checkVisibility();
            } else {
                mentionsAdapter = this;
            }
            mentionsAdapter.mentionsStickersActionTracker.doSomeAction();
        }
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void setDialogId(long j) {
        if (this.dialog_id != j) {
            this.dialog_id = j;
        }
    }

    public void setUserOrChat(TLRPC.User user, TLRPC.Chat chat) {
        this.user = user;
        this.chat = chat;
    }

    public void setSearchInDialogs(boolean z) {
        this.searchInDialogs = z;
    }

    public void setAllowStickers(boolean z) {
        this.allowStickers = z;
    }

    public void setAllowBots(boolean z) {
        this.allowBots = z;
    }

    public void setAllowChats(boolean z) {
        this.allowChats = z;
    }

    public String getHashtagHint() {
        return this.hintHashtag;
    }

    public boolean isLocalHashtagHint(int i) {
        return this.hintHashtag != null && i == 1;
    }

    public boolean isGlobalHashtagHint(int i) {
        return this.hintHashtag != null && i == 0;
    }

    public static class HashtagHint extends LinearLayout {
        private final AvatarDrawable avatarDrawable;
        private final BackupImageView imageView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final LinearLayout textLayout;
        private final TextView textView;
        private final TextView titleView;
        private final boolean transparent;

        public HashtagHint(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.resourcesProvider = resourcesProvider;
            this.transparent = z;
            setOrientation(0);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            addView(backupImageView, LayoutHelper.createLinear(28, 28, 19, 12, 0, 12, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 55, 0, 4, 12, 4));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 15.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(z ? Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.5f) : Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2));
        }

        public void set(int i, String str, TLRPC.Chat chat) {
            if (str == null) {
                return;
            }
            if (i == 0) {
                CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
                combinedDrawable.setIconOffset(AndroidUtilities.dp(-0.66f), 0);
                combinedDrawable.setIconSize(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.imageView.setImageDrawable(combinedDrawable);
                this.titleView.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
                this.textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
                return;
            }
            this.avatarDrawable.setInfo(chat);
            this.imageView.setForUserOrChat(chat, this.avatarDrawable);
            this.titleView.setText(PremiumPreviewFragment.applyNewSpan(LocaleController.formatString(R.string.HashtagSuggestion2Title, str + "@" + ChatObject.getPublicUsername(chat)), 8));
            this.textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
        }
    }
}
