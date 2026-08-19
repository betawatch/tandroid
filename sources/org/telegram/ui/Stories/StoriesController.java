package org.telegram.ui.Stories;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.ToIntFunction;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Timer;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

/* loaded from: classes5.dex */
public class StoriesController {
    public static final Comparator storiesComparator = Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda4
        @Override // java.util.function.ToIntFunction
        public final int applyAsInt(Object obj) {
            int i;
            i = ((TL_stories.StoryItem) obj).date;
            return i;
        }
    });
    boolean allHiddenStoriesLoaded;
    boolean allStoriesLoaded;
    private int blocklistCount;
    private int blocklistReqId;
    private final int currentAccount;
    private final DraftsController draftsController;
    boolean hasMore;
    private boolean loadedSendAs;
    boolean loadingFromDatabase;
    private boolean loadingFromServer;
    private boolean loadingFromServerHidden;
    private boolean loadingSendAs;
    SharedPreferences mainSettings;
    private final HashSet requestingUnsupportedStories;
    public final ArrayList sendAs;
    final Runnable sortStoriesRunnable;
    String state;
    private String stateHidden;
    private TL_stories.TL_storiesStealthMode stealthMode;
    private boolean storiesReadLoaded;
    StoriesStorage storiesStorage;
    private StoryLimit storyLimitCached;
    private boolean storyLimitFetched;
    private int totalStoriesCount;
    private int totalStoriesCountHidden;
    private final HashSet unsupportedStoriesChecked;
    private final LongSparseArray uploadingStoriesByDialogId = new LongSparseArray();
    private final LongSparseArray uploadingAndEditingStories = new LongSparseArray();
    public int uploadedStories = 0;
    private final LongSparseArray editingStories = new LongSparseArray();
    public LongSparseIntArray dialogIdToMaxReadId = new LongSparseIntArray();
    private ArrayList dialogListStories = new ArrayList();
    private ArrayList hiddenListStories = new ArrayList();
    private LongSparseArray allStoriesMap = new LongSparseArray();
    private LongSparseIntArray loadingDialogsStories = new LongSparseIntArray();
    final LongSparseArray pollingViewsForSelfStoriesRequester = new LongSparseArray();
    public LongSparseArray selfViewsModel = new LongSparseArray();
    private boolean hasMoreHidden = true;
    private boolean firstLoad = true;
    HashSet allStoriesLoading = new HashSet();
    HashSet loadingAllStories = new HashSet();
    LongSparseArray resolvedStories = new LongSparseArray();
    private final LongSparseArray storiesCollections = new LongSparseArray();
    private final HashMap[] storiesLists = new HashMap[5];
    private final HashMap storiesAlbumsLists = new HashMap();
    public final ArrayList attachedSearchLists = new ArrayList();
    private final Comparator peerStoriesComparator = new Comparator() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return StoriesController.$r8$lambda$C1EmZbpto-qPQWy_B-TlzKzaBBY(StoriesController.this, (TL_stories.PeerStories) obj, (TL_stories.PeerStories) obj2);
        }
    };
    public HashSet blocklist = new HashSet();
    private LongSparseArray blockedOverride = new LongSparseArray();
    public boolean blocklistFull = false;
    private boolean blocklistLoadingReset = false;
    private boolean blocklistLoading = false;
    private long lastBlocklistRequested = 0;

    public static /* synthetic */ void $r8$lambda$5K2JLy0hG6eCW4OXirUJjmxFt-A(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static /* synthetic */ void $r8$lambda$FDReLXvkuVMpZP1ESK9p3bSxCTk() {
    }

    public static /* synthetic */ void $r8$lambda$Z08eppSsM_W6suoD9FF3t5wlXkg(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public StoriesController(final int i) {
        this.state = "";
        ArrayList arrayList = new ArrayList();
        this.sendAs = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.loadingSendAs = false;
        this.loadedSendAs = false;
        this.requestingUnsupportedStories = new HashSet();
        this.currentAccount = i;
        this.storiesStorage = new StoriesStorage(i);
        SharedPreferences mainSettings = MessagesController.getInstance(i).getMainSettings();
        this.mainSettings = mainSettings;
        this.state = mainSettings.getString("last_stories_state", "");
        this.stateHidden = this.mainSettings.getString("last_stories_state_hidden", "");
        this.totalStoriesCountHidden = this.mainSettings.getInt("total_stores_hidden", 0);
        this.totalStoriesCount = this.mainSettings.getInt("total_stores", 0);
        this.storiesReadLoaded = this.mainSettings.getBoolean("read_loaded", false);
        this.unsupportedStoriesChecked = new HashSet(this.mainSettings.getStringSet("unsupported_stories_checked", new HashSet()));
        this.stealthMode = readStealthMode(this.mainSettings.getString("stories_stealth_mode", null));
        this.storiesStorage.getMaxReadIds(new Consumer() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda2
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                StoriesController.this.dialogIdToMaxReadId = (LongSparseIntArray) obj;
            }
        });
        this.sortStoriesRunnable = new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$ETSG1Yp3ZmQCNkNk52NE6b6Qf7k(StoriesController.this, i);
            }
        };
        this.draftsController = new DraftsController(i);
    }

    public static /* synthetic */ void $r8$lambda$ETSG1Yp3ZmQCNkNk52NE6b6Qf7k(StoriesController storiesController, int i) {
        storiesController.sortDialogStories(storiesController.dialogListStories);
        storiesController.sortDialogStories(storiesController.hiddenListStories);
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
    }

    private TL_stories.TL_storiesStealthMode readStealthMode(String str) {
        if (str == null) {
            return null;
        }
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
        try {
            return TL_stories.TL_storiesStealthMode.TLdeserialize(serializedData, serializedData.readInt32(true), true);
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    private void writeStealthMode(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        if (tL_storiesStealthMode == null) {
            edit.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        edit.putString("stories_stealth_mode", Utilities.bytesToHex(serializedData.toByteArray())).apply();
    }

    public void loadAllStories() {
        if (this.firstLoad) {
            return;
        }
        loadStories();
        loadStoriesRead();
    }

    private void loadStoriesRead() {
        if (this.storiesReadLoaded) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoriesController.$r8$lambda$5WWQkfSflcxPDcX3212jFEbxhiU(StoriesController.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$5WWQkfSflcxPDcX3212jFEbxhiU(final StoriesController storiesController, TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.getClass();
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        if (updates == null) {
            return;
        }
        MessagesController.getInstance(storiesController.currentAccount).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$TXuDKspcesRH5BmfN1BXz1xNOUg(StoriesController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$TXuDKspcesRH5BmfN1BXz1xNOUg(StoriesController storiesController) {
        storiesController.storiesReadLoaded = true;
        storiesController.mainSettings.edit().putBoolean("read_loaded", true).apply();
    }

    private void sortDialogStories(ArrayList arrayList) {
        fixDeletedAndNonContactsStories(arrayList);
        Collections.sort(arrayList, this.peerStoriesComparator);
    }

    private void fixDeletedAndNonContactsStories(ArrayList arrayList) {
        boolean z;
        TLRPC.User user;
        int i = 0;
        while (i < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (peerDialogId <= 0 || (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) == null || isContactOrService(user)) {
                z = false;
            } else {
                arrayList.remove(i);
                i--;
                z = true;
            }
            int i2 = 0;
            while (i2 < peerStories.stories.size()) {
                if (peerStories.stories.get(i2) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (!z && peerStories.stories.isEmpty() && !hasUploadingStories(peerDialogId)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    public DraftsController getDraftsController() {
        return this.draftsController;
    }

    public boolean hasStories(long j) {
        if (j == 0) {
            return false;
        }
        if (hasUploadingStories(j) || isLastUploadingFailed(j)) {
            return true;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (peerStories == null) {
            peerStories = getStoriesFromFullPeer(j);
        }
        return (peerStories == null || peerStories.stories.isEmpty()) ? false : true;
    }

    public TL_stories.PeerStories getStoriesFromFullPeer(long j) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        if (j > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j);
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.checkedExpired) {
                checkExpireStories(peerStories2);
            }
            if (userFull == null) {
                return null;
            }
            return userFull.stories;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j);
        if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.checkedExpired) {
            checkExpireStories(peerStories);
        }
        if (chatFull == null) {
            return null;
        }
        return chatFull.stories;
    }

    public boolean hasStories() {
        ArrayList arrayList = this.dialogListStories;
        return (arrayList != null && arrayList.size() > 0) || hasSelfStories();
    }

    public void loadStories() {
        if (this.firstLoad) {
            this.loadingFromDatabase = true;
            this.storiesStorage.getAllStories(new Consumer() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda6
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    StoriesController.$r8$lambda$wyrfhXC8Ry7C3KVXpSwUNUKooro(StoriesController.this, (TL_stories.TL_stories_allStories) obj);
                }
            });
        } else {
            loadFromServer(false);
            loadFromServer(true);
        }
        this.firstLoad = false;
    }

    public static /* synthetic */ void $r8$lambda$wyrfhXC8Ry7C3KVXpSwUNUKooro(StoriesController storiesController, TL_stories.TL_stories_allStories tL_stories_allStories) {
        storiesController.loadingFromDatabase = false;
        if (tL_stories_allStories != null) {
            storiesController.processAllStoriesResponse(tL_stories_allStories, false, true, false);
            storiesController.loadFromServer(false);
            storiesController.loadFromServer(true);
        } else {
            storiesController.cleanup();
            storiesController.loadStories();
        }
    }

    public void loadHiddenStories() {
        if (this.hasMoreHidden) {
            loadFromServer(true);
        }
    }

    public void toggleHidden(long j, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TL_stories.PeerStories peerStories;
        if (z) {
            arrayList = this.dialogListStories;
            arrayList2 = this.hiddenListStories;
        } else {
            arrayList = this.hiddenListStories;
            arrayList2 = this.dialogListStories;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                peerStories = null;
                break;
            } else {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i)).peer) == j) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i);
                    break;
                }
                i++;
            }
        }
        if (peerStories != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    arrayList2.add(0, peerStories);
                    AndroidUtilities.cancelRunOnUIThread(this.sortStoriesRunnable);
                    this.sortStoriesRunnable.run();
                    break;
                } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i2)).peer) == j) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (z3) {
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
        }
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
        if (z2) {
            if (j >= 0) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                user.stories_hidden = z;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(Collections.singletonList(user), null, false, true);
                MessagesController.getInstance(this.currentAccount).putUser(user, false);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                chat.stories_hidden = z;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                MessagesController.getInstance(this.currentAccount).putChat(chat, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            tL_stories_togglePeerStoriesHidden.hidden = z;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_togglePeerStoriesHidden, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda25
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesController.$r8$lambda$Z08eppSsM_W6suoD9FF3t5wlXkg(tLObject, tL_error);
                }
            });
        }
    }

    private void loadFromServer(final boolean z) {
        if (z && this.loadingFromServerHidden) {
            return;
        }
        if ((z || !this.loadingFromServer) && !this.loadingFromDatabase) {
            final boolean z2 = true;
            if (z) {
                this.loadingFromServerHidden = true;
            } else {
                this.loadingFromServer = true;
            }
            final TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            String str = z ? this.stateHidden : this.state;
            boolean z3 = z ? this.hasMoreHidden : this.hasMore;
            if (!TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.state = str;
                tL_stories_getAllStories.flags |= 1;
            }
            if (!z3 || TextUtils.isEmpty(str)) {
                z2 = false;
            } else {
                tL_stories_getAllStories.next = true;
            }
            tL_stories_getAllStories.include_hidden = z;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getAllStories, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda5
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesController.$r8$lambda$WSyginMi23xDB2k0KWOuAUBeKIc(StoriesController.this, z, tL_stories_getAllStories, z2, tLObject, tL_error);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$WSyginMi23xDB2k0KWOuAUBeKIc(final StoriesController storiesController, final boolean z, final TL_stories.TL_stories_getAllStories tL_stories_getAllStories, final boolean z2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$yzOZ7qpj3IBeT2BlwlTi82PRqLY(StoriesController.this, z, tL_stories_getAllStories, tLObject, z2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$yzOZ7qpj3IBeT2BlwlTi82PRqLY(StoriesController storiesController, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z2) {
        if (z) {
            storiesController.loadingFromServerHidden = false;
        } else {
            storiesController.loadingFromServer = false;
        }
        FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
        if (tLObject instanceof TL_stories.TL_stories_allStories) {
            TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
            MessagesStorage.getInstance(storiesController.currentAccount).putUsersAndChats(tL_stories_allStories.users, null, true, true);
            if (!z) {
                storiesController.totalStoriesCount = tL_stories_allStories.count;
                storiesController.hasMore = tL_stories_allStories.has_more;
                storiesController.state = tL_stories_allStories.state;
                storiesController.mainSettings.edit().putString("last_stories_state", storiesController.state).putBoolean("last_stories_has_more", storiesController.hasMore).putInt("total_stores", storiesController.totalStoriesCount).apply();
            } else {
                storiesController.totalStoriesCountHidden = tL_stories_allStories.count;
                storiesController.hasMoreHidden = tL_stories_allStories.has_more;
                storiesController.stateHidden = tL_stories_allStories.state;
                storiesController.mainSettings.edit().putString("last_stories_state_hidden", storiesController.stateHidden).putBoolean("last_stories_has_more_hidden", storiesController.hasMoreHidden).putInt("total_stores_hidden", storiesController.totalStoriesCountHidden).apply();
            }
            storiesController.processAllStoriesResponse(tL_stories_allStories, z, false, z2);
            return;
        }
        if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
            if (!z) {
                storiesController.hasMore = storiesController.mainSettings.getBoolean("last_stories_has_more", false);
                storiesController.state = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                storiesController.mainSettings.edit().putString("last_stories_state", storiesController.state).apply();
            } else {
                storiesController.hasMoreHidden = storiesController.mainSettings.getBoolean("last_stories_has_more_hidden", false);
                storiesController.stateHidden = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                storiesController.mainSettings.edit().putString("last_stories_state_hidden", storiesController.stateHidden).apply();
            }
            if (z ? storiesController.hasMoreHidden : storiesController.hasMore) {
                NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
    }

    private void processAllStoriesResponse(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            if (!z) {
                this.dialogListStories.clear();
            } else {
                this.hiddenListStories.clear();
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tL_stories_allStories.peer_stories.size(); i++) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(DialogObject.getPeerDialogId(tL_stories_allStories.peer_stories.get(i).peer));
            }
            FileLog.d("StoriesController cache=" + z2 + " hidden=" + z + " processAllStoriesResponse {" + ((Object) sb) + "}");
        }
        MessagesController.getInstance(this.currentAccount).putUsers(tL_stories_allStories.users, z2);
        MessagesController.getInstance(this.currentAccount).putChats(tL_stories_allStories.chats, z2);
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        for (int i2 = 0; i2 < tL_stories_allStories.peer_stories.size(); i2++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i2);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i3 = 0;
            while (i3 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i3);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    NotificationsController.getInstance(this.currentAccount).processDeleteStory(peerDialogId, storyItem.id);
                    peerStories.stories.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (!peerStories.stories.isEmpty()) {
                putToAllStories(peerDialogId, peerStories);
                int i4 = 0;
                while (i4 < 2) {
                    ArrayList arrayList = i4 == 0 ? this.hiddenListStories : this.dialogListStories;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            break;
                        }
                        if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i5)).peer) == peerDialogId) {
                            arrayList.remove(i5);
                            break;
                        }
                        i5++;
                    }
                    i4++;
                }
                if (peerDialogId > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (user != null) {
                        if (user.stories_hidden) {
                            addUserToHiddenList(peerStories);
                        } else {
                            this.dialogListStories.add(peerStories);
                            preloadUserStories(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        if (chat.stories_hidden) {
                            addUserToHiddenList(peerStories);
                        } else {
                            this.dialogListStories.add(peerStories);
                            preloadUserStories(peerStories);
                        }
                    }
                }
            } else {
                this.allStoriesMap.remove(peerDialogId);
            }
        }
        if (!z2) {
            this.storiesStorage.saveAllStories(tL_stories_allStories.peer_stories, z3, z, new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.$r8$lambda$FDReLXvkuVMpZP1ESK9p3bSxCTk();
                }
            });
        }
        sortUserStories();
    }

    private void addUserToHiddenList(TL_stories.PeerStories peerStories) {
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.hiddenListStories.size(); i++) {
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) this.hiddenListStories.get(i)).peer) == peerDialogId) {
                z = true;
            }
        }
        if (!z) {
            this.hiddenListStories.add(peerStories);
        }
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
    }

    private void sortUserStories() {
        AndroidUtilities.cancelRunOnUIThread(this.sortStoriesRunnable);
        this.sortStoriesRunnable.run();
    }

    public void preloadUserStories(TL_stories.PeerStories peerStories) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= peerStories.stories.size()) {
                break;
            }
            if (peerStories.stories.get(i2).id > peerStories.max_read_id) {
                i = i2;
                break;
            }
            i2++;
        }
        if (peerStories.stories.isEmpty()) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        preloadStory(peerDialogId, peerStories.stories.get(i));
        if (i > 0) {
            preloadStory(peerDialogId, peerStories.stories.get(i - 1));
        }
        if (i < peerStories.stories.size() - 1) {
            preloadStory(peerDialogId, peerStories.stories.get(i + 1));
        }
    }

    private void preloadStory(long j, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath == null && DownloadController.getInstance(this.currentAccount).canPreloadStories()) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            boolean z = messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument());
            storyItem.dialogId = j;
            if (z) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                FileLoader.getInstance(this.currentAccount).loadFile(storyItem.media.getDocument(), storyItem, 0, 1);
                FileLoader.getInstance(this.currentAccount).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
            } else {
                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                TLRPC.Photo photo = messageMedia2 == null ? null : messageMedia2.photo;
                if (photo != null && (arrayList = photo.sizes) != null) {
                    FileLoader.getInstance(this.currentAccount).loadFile(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), photo), storyItem, "jpg", 0, 1);
                }
            }
            if (storyItem.media_areas != null) {
                for (int i = 0; i < Math.min(2, storyItem.media_areas.size()); i++) {
                    if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        ReactionImageHolder.preload(this.currentAccount, ReactionsLayoutInBubble.VisibleReaction.fromTL(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i)).reaction));
                    }
                }
            }
        }
    }

    public void uploadStory(StoryEntry storyEntry, boolean z) {
        StoriesController storiesController;
        boolean z2;
        boolean z3;
        UploadingStory uploadingStory = new UploadingStory(storyEntry);
        if (z) {
            long j = uploadingStory.dialogId;
            if (storyEntry.isEdit) {
                HashMap hashMap = (HashMap) this.editingStories.get(j);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    this.editingStories.put(j, hashMap);
                }
                hashMap.put(Integer.valueOf(storyEntry.editStoryId), uploadingStory);
                storiesController = this;
            } else {
                storiesController = this;
                storiesController.addUploadingStoryToList(j, uploadingStory, this.uploadingStoriesByDialogId, false);
            }
            storiesController.addUploadingStoryToList(j, uploadingStory, storiesController.uploadingAndEditingStories, true);
            if (j != UserConfig.getInstance(storiesController.currentAccount).clientUserId) {
                int i = 0;
                while (true) {
                    z2 = true;
                    if (i >= storiesController.dialogListStories.size()) {
                        z3 = false;
                        break;
                    } else {
                        if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) storiesController.dialogListStories.get(i)).peer) == j) {
                            storiesController.dialogListStories.add(0, (TL_stories.PeerStories) storiesController.dialogListStories.remove(i));
                            z3 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (!z3) {
                    for (int i2 = 0; i2 < storiesController.hiddenListStories.size(); i2++) {
                        if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) storiesController.hiddenListStories.get(i2)).peer) == j) {
                            storiesController.hiddenListStories.add(0, (TL_stories.PeerStories) storiesController.hiddenListStories.remove(i2));
                            break;
                        }
                    }
                }
                z2 = z3;
                if (!z2) {
                    TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                    tL_peerStories.peer = MessagesController.getInstance(storiesController.currentAccount).getPeer(j);
                    putToAllStories(j, tL_peerStories);
                    storiesController.dialogListStories.add(0, tL_peerStories);
                    loadAllStoriesForDialog(j);
                }
            }
        } else {
            storiesController = this;
        }
        uploadingStory.start();
        NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
    }

    private void addUploadingStoryToList(long j, UploadingStory uploadingStory, LongSparseArray longSparseArray, boolean z) {
        ArrayList arrayList = (ArrayList) longSparseArray.get(j);
        if (z && (arrayList == null || arrayList.isEmpty())) {
            this.uploadedStories = 0;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            longSparseArray.put(j, arrayList);
        }
        arrayList.add(uploadingStory);
    }

    public void putUploadingDrafts(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            UploadingStory uploadingStory = new UploadingStory((StoryEntry) obj);
            addUploadingStoryToList(uploadingStory.dialogId, uploadingStory, this.uploadingStoriesByDialogId, false);
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public ArrayList getDialogListStories() {
        return this.dialogListStories;
    }

    public TL_stories.PeerStories getStories(long j) {
        return (TL_stories.PeerStories) this.allStoriesMap.get(j);
    }

    public ArrayList getUploadingStories(long j) {
        return (ArrayList) this.uploadingStoriesByDialogId.get(j);
    }

    public boolean isLastUploadingFailed(long j) {
        ArrayList arrayList = (ArrayList) this.uploadingStoriesByDialogId.get(j);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return ((UploadingStory) arrayList.get(arrayList.size() - 1)).failed;
    }

    public ArrayList getUploadingAndEditingStories(long j) {
        return (ArrayList) this.uploadingAndEditingStories.get(j);
    }

    public int getMyStoriesCount() {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList arrayList2 = (ArrayList) this.uploadingAndEditingStories.get(getSelfUserId());
        int size = arrayList2 == null ? 0 : arrayList2.size();
        TL_stories.PeerStories stories = getStories(getSelfUserId());
        return (stories == null || (arrayList = stories.stories) == null) ? size : size + arrayList.size();
    }

    public UploadingStory findEditingStory(long j, TL_stories.StoryItem storyItem) {
        HashMap hashMap;
        if (storyItem == null || (hashMap = (HashMap) this.editingStories.get(j)) == null || hashMap.isEmpty()) {
            return null;
        }
        return (UploadingStory) hashMap.get(Integer.valueOf(storyItem.id));
    }

    public UploadingStory getEditingStory(long j) {
        HashMap hashMap = (HashMap) this.editingStories.get(j);
        if (hashMap == null || hashMap.isEmpty()) {
            return null;
        }
        Collection values = hashMap.values();
        if (values.isEmpty()) {
            return null;
        }
        return (UploadingStory) values.iterator().next();
    }

    private void applyNewStories(TL_stories.PeerStories peerStories) {
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        putToAllStories(peerDialogId, peerStories);
        if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            applyToList(peerStories);
            if (user != null && !user.stories_hidden) {
                preloadUserStories(peerStories);
            }
        }
        FileLog.d("StoriesController applyNewStories " + peerDialogId);
        updateStoriesInLists(peerDialogId, peerStories.stories);
    }

    private void putToAllStories(long j, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i = 0; i < peerStories.stories.size(); i++) {
                if (peerStories.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                    int i2 = peerStories.stories.get(i).id;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i3).id == i2 && (peerStories2.stories.get(i3) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i, peerStories2.stories.get(i3));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        this.allStoriesMap.put(j, peerStories);
    }

    public static TL_stories.StoryItem applyStoryUpdate(TL_stories.StoryItem storyItem, TL_stories.StoryItem storyItem2) {
        if (storyItem2 == null) {
            return storyItem;
        }
        if (storyItem == null || !storyItem2.min) {
            return storyItem2;
        }
        storyItem.pinned = storyItem2.pinned;
        storyItem.isPublic = storyItem2.isPublic;
        storyItem.close_friends = storyItem2.close_friends;
        int i = storyItem2.date;
        if (i != 0) {
            storyItem.date = i;
        }
        int i2 = storyItem2.expire_date;
        if (i2 != 0) {
            storyItem.expire_date = i2;
        }
        storyItem.caption = storyItem2.caption;
        storyItem.entities = storyItem2.entities;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia != null) {
            storyItem.media = messageMedia;
        }
        return storyItem;
    }

    public void processUpdate(final TL_stories.TL_updateStory tL_updateStory) {
        TLRPC.User user;
        if (tL_updateStory.story == null) {
            return;
        }
        final long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
        if (peerDialogId == 0) {
            FileLog.d("StoriesController can't update story dialogId == 0");
            return;
        }
        if (peerDialogId > 0) {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (user != null && (isContactOrService(user) || user.self)) {
                this.storiesStorage.processUpdate(tL_updateStory);
            }
        } else {
            this.storiesStorage.processUpdate(tL_updateStory);
            user = null;
        }
        final TLRPC.User user2 = user;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$qBetTgpI2zfR0P5VmLpJniDYmOs(StoriesController.this, peerDialogId, tL_updateStory, user2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$qBetTgpI2zfR0P5VmLpJniDYmOs(StoriesController storiesController, long j, TL_stories.TL_updateStory tL_updateStory, TLRPC.User user) {
        boolean z;
        boolean z2;
        boolean z3;
        storiesController.getClass();
        FileLog.d("StoriesController update stories for dialog " + j);
        storiesController.updateStoriesInLists(j, Collections.singletonList(tL_updateStory.story));
        storiesController.updateStoriesForFullPeer(j, Collections.singletonList(tL_updateStory.story), true);
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.allStoriesMap.get(j);
        ArrayList arrayList = new ArrayList();
        int i = storiesController.totalStoriesCount;
        if (peerStories != null) {
            TL_stories.StoryItem storyItem = tL_updateStory.story;
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                NotificationsController.getInstance(storiesController.currentAccount).processDeleteStory(j, storyItem.id);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= peerStories.stories.size()) {
                    z2 = false;
                    break;
                }
                if (peerStories.stories.get(i2).id != storyItem.id) {
                    i2++;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i2);
                    FileLog.d("StoriesController remove story id=" + storyItem.id);
                    z2 = true;
                    z3 = true;
                } else {
                    TL_stories.StoryItem storyItem2 = peerStories.stories.get(i2);
                    storyItem = applyStoryUpdate(storyItem2, storyItem);
                    arrayList.add(storyItem);
                    peerStories.stories.set(i2, storyItem);
                    if (storyItem.attachPath == null) {
                        storyItem.attachPath = storyItem2.attachPath;
                    }
                    if (storyItem.firstFramePath == null) {
                        storyItem.firstFramePath = storyItem2.firstFramePath;
                    }
                    FileLog.d("StoriesController update story id=" + storyItem.id);
                    z2 = true;
                }
            }
            z3 = false;
            if (z2) {
                z = false;
            } else {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    FileLog.d("StoriesController can't add new story DELETED");
                    return;
                }
                if (StoriesUtilities.isExpired(storiesController.currentAccount, storyItem)) {
                    FileLog.d("StoriesController can't add new story isExpired");
                    return;
                }
                if (j > 0 && (user == null || (!user.self && !storiesController.isContactOrService(user)))) {
                    FileLog.d("StoriesController can't add new story user is not contact");
                    return;
                }
                arrayList.add(storyItem);
                peerStories.stories.add(storyItem);
                FileLog.d("StoriesController add new story id=" + storyItem.id + " total stories count " + peerStories.stories.size());
                storiesController.preloadStory(j, storyItem);
                storiesController.applyToList(peerStories);
                z = true;
                z3 = true;
            }
            if (z3) {
                if (peerStories.stories.isEmpty() && !storiesController.hasUploadingStories(j)) {
                    storiesController.dialogListStories.remove(peerStories);
                    storiesController.hiddenListStories.remove(peerStories);
                    storiesController.allStoriesMap.remove(DialogObject.getPeerDialogId(peerStories.peer));
                    storiesController.totalStoriesCount--;
                } else {
                    Collections.sort(peerStories.stories, storiesComparator);
                }
            }
            if (i != storiesController.totalStoriesCount) {
                storiesController.mainSettings.edit().putInt("total_stores", storiesController.totalStoriesCount).apply();
            }
            storiesController.fixDeletedAndNonContactsStories(storiesController.dialogListStories);
            storiesController.fixDeletedAndNonContactsStories(storiesController.hiddenListStories);
            if (z) {
                if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                    NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storyDeleted, Long.valueOf(j), Integer.valueOf(tL_updateStory.story.id));
                }
                NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
            }
            MessagesController.getInstance(storiesController.currentAccount).checkArchiveFolder();
        }
        TL_stories.StoryItem storyItem3 = tL_updateStory.story;
        if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
            FileLog.d("StoriesController can't add user " + j + " with new story DELETED");
            return;
        }
        if (StoriesUtilities.isExpired(storiesController.currentAccount, storyItem3)) {
            FileLog.d("StoriesController can't add user " + j + " with new story isExpired");
            return;
        }
        if (j > 0 && (user == null || (!user.self && !storiesController.isContactOrService(user)))) {
            FileLog.d("StoriesController can't add user cause is not contact");
            return;
        }
        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
        tL_peerStories.peer = tL_updateStory.peer;
        tL_peerStories.stories.add(tL_updateStory.story);
        FileLog.d("StoriesController add new user with story id=" + tL_updateStory.story.id);
        storiesController.applyNewStories(tL_peerStories);
        storiesController.totalStoriesCount = storiesController.totalStoriesCount + 1;
        storiesController.loadAllStoriesForDialog(j);
        z = true;
        if (i != storiesController.totalStoriesCount) {
        }
        storiesController.fixDeletedAndNonContactsStories(storiesController.dialogListStories);
        storiesController.fixDeletedAndNonContactsStories(storiesController.hiddenListStories);
        if (z) {
        }
        MessagesController.getInstance(storiesController.currentAccount).checkArchiveFolder();
    }

    private void updateStoriesForFullPeer(long j, List list, boolean z) {
        TL_stories.PeerStories peerStories;
        boolean z2;
        if (j > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j);
            if (userFull == null) {
                return;
            }
            if (userFull.stories == null) {
                if (!z) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                userFull.stories = tL_peerStories;
                tL_peerStories.peer = MessagesController.getInstance(this.currentAccount).getPeer(j);
                userFull.stories.max_read_id = getMaxStoriesReadId(j);
            }
            peerStories = userFull.stories;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j);
            if (chatFull == null) {
                return;
            }
            if (chatFull.stories == null) {
                if (!z) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                chatFull.stories = tL_peerStories2;
                tL_peerStories2.peer = MessagesController.getInstance(this.currentAccount).getPeer(j);
                chatFull.stories.max_read_id = getMaxStoriesReadId(j);
            }
            peerStories = chatFull.stories;
        }
        for (int i = 0; i < list.size(); i++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= peerStories.stories.size()) {
                    z2 = false;
                    break;
                }
                if (peerStories.stories.get(i2).id == storyItem.id) {
                    z2 = true;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        peerStories.stories.remove(i2);
                    } else {
                        TL_stories.StoryItem storyItem2 = peerStories.stories.get(i2);
                        storyItem = applyStoryUpdate(storyItem2, storyItem);
                        peerStories.stories.set(i2, storyItem);
                        if (storyItem.attachPath == null) {
                            storyItem.attachPath = storyItem2.attachPath;
                        }
                        if (storyItem.firstFramePath == null) {
                            storyItem.firstFramePath = storyItem2.firstFramePath;
                        }
                        FileLog.d("StoriesController update story for full peer storyId=" + storyItem.id);
                    }
                } else {
                    i2++;
                }
            }
            if (!z2) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    FileLog.d("StoriesController story is not found, but already deleted storyId=" + storyItem.id);
                } else if (z) {
                    FileLog.d("StoriesController add new story for full peer storyId=" + storyItem.id);
                    peerStories.stories.add(storyItem);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    private boolean isContactOrService(TLRPC.User user) {
        if (user != null) {
            return user.contact || user.id == MessagesController.getInstance(this.currentAccount).storiesChangelogUserId;
        }
        return false;
    }

    private void applyToList(TL_stories.PeerStories peerStories) {
        TLRPC.Chat chat;
        boolean z;
        boolean z2;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        TLRPC.User user = null;
        if (peerDialogId > 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (user2 == null) {
                FileLog.d("StoriesController can't apply story user == null");
                return;
            } else {
                user = user2;
                chat = null;
            }
        } else {
            chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
            if (chat == null) {
                FileLog.d("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i = 0;
        while (true) {
            z = true;
            if (i >= this.dialogListStories.size()) {
                z2 = false;
                break;
            } else {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) this.dialogListStories.get(i)).peer) == peerDialogId) {
                    this.dialogListStories.remove(i);
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.hiddenListStories.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) this.hiddenListStories.get(i2)).peer) == peerDialogId) {
                this.hiddenListStories.remove(i2);
                z2 = true;
                break;
            }
            i2++;
        }
        if ((user == null || !user.stories_hidden) && (chat == null || !chat.stories_hidden)) {
            z = false;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("StoriesController move user stories to first hidden=" + z + " did=" + peerDialogId);
        }
        if (z) {
            this.hiddenListStories.add(0, peerStories);
        } else {
            this.dialogListStories.add(0, peerStories);
        }
        if (!z2) {
            loadAllStoriesForDialog(peerDialogId);
        }
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
    }

    private void loadAllStoriesForDialog(final long j) {
        if (this.allStoriesLoading.contains(Long.valueOf(j))) {
            return;
        }
        this.allStoriesLoading.add(Long.valueOf(j));
        FileLog.d("StoriesController loadAllStoriesForDialog " + j);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getPeerStories, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda15
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoriesController.$r8$lambda$0sZShQicEM_hbyp27CfKD8pQkEg(StoriesController.this, j, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$0sZShQicEM_hbyp27CfKD8pQkEg(final StoriesController storiesController, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$BiBW_G8QxZ8C5PFSuqG-h_SPRak(StoriesController.this, j, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$BiBW_G8QxZ8C5PFSuqG-h_SPRak(StoriesController storiesController, long j, TLObject tLObject) {
        storiesController.allStoriesLoading.remove(Long.valueOf(j));
        if (tLObject == null) {
            return;
        }
        TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
        MessagesController.getInstance(storiesController.currentAccount).putUsers(tL_stories_peerStories.users, false);
        TLRPC.User user = MessagesController.getInstance(storiesController.currentAccount).getUser(Long.valueOf(j));
        TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
        storiesController.allStoriesMap.put(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
        if (user != null && (storiesController.isContactOrService(user) || user.self)) {
            storiesController.applyToList(peerStories);
            storiesController.storiesStorage.putPeerStories(peerStories);
        }
        FileLog.d("StoriesController processAllStoriesResponse dialogId=" + j + " overwrite stories " + tL_stories_peerStories.stories.stories.size());
        NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public boolean hasSelfStories() {
        long j = UserConfig.getInstance(this.currentAccount).clientUserId;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        return ((peerStories == null || peerStories.stories.isEmpty()) && Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) ? false : true;
    }

    public int getSelfStoriesCount() {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(UserConfig.getInstance(this.currentAccount).clientUserId);
        return (peerStories != null ? peerStories.stories.size() : 0) + this.uploadingStoriesByDialogId.size();
    }

    public void deleteStory(long j, TL_stories.StoryItem storyItem) {
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            TL_stories.PeerStories peerStories = null;
            if (i == 0) {
                chatFull = null;
                peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
                userFull = null;
            } else if (j >= 0) {
                userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j);
                if (userFull != null) {
                    chatFull = null;
                    peerStories = userFull.stories;
                } else {
                    chatFull = null;
                }
            } else {
                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(this.currentAccount).getChatFull(-j);
                if (chatFull2 != null) {
                    TL_stories.PeerStories peerStories2 = chatFull2.stories;
                    userFull = null;
                    peerStories = peerStories2;
                    chatFull = chatFull2;
                } else {
                    chatFull = chatFull2;
                    userFull = null;
                }
            }
            if (peerStories != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= peerStories.stories.size()) {
                        break;
                    }
                    if (peerStories.stories.get(i2).id == storyItem.id) {
                        peerStories.stories.remove(i2);
                        if (peerStories.stories.size() == 0) {
                            if (!hasUploadingStories(j)) {
                                this.allStoriesMap.remove(j);
                                this.dialogListStories.remove(peerStories);
                                this.hiddenListStories.remove(peerStories);
                            }
                            if (j > 0) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                                if (user != null) {
                                    user.stories_unavailable = true;
                                }
                            } else {
                                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                                if (chat != null) {
                                    chat.stories_unavailable = true;
                                }
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
            if (chatFull != null) {
                MessagesStorage.getInstance(this.currentAccount).updateChatInfo(chatFull, false);
            }
            if (userFull != null) {
                MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull, false);
            }
        }
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        tL_stories_deleteStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem.id));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_deleteStories, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda40
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoriesController.$r8$lambda$dWbru4vSZUZvNshi7fVpZUCrUvw(StoriesController.this, tLObject, tL_error);
            }
        });
        this.storiesStorage.deleteStory(j, storyItem.id);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
        updateDeletedStoriesInLists(j, Arrays.asList(storyItem));
    }

    public static /* synthetic */ void $r8$lambda$dWbru4vSZUZvNshi7fVpZUCrUvw(StoriesController storiesController, TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.getClass();
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda31(storiesController));
        }
    }

    public void deleteStories(long j, ArrayList arrayList) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        if (arrayList == null) {
            return;
        }
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_stories_deleteStories.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i2).id == storyItem.id) {
                            peerStories2.stories.remove(i2);
                            if (peerStories2.stories.isEmpty()) {
                                this.allStoriesMap.remove(j);
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                tL_stories_deleteStories.id.add(Integer.valueOf(storyItem.id));
            }
        }
        if (j < 0 ? !((chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j)) == null || (peerStories = chatFull.stories) == null) : !((userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j)) == null || (peerStories = userFull.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i3);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= peerStories2.stories.size()) {
                        break;
                    }
                    if (peerStories2.stories.get(i4).id == storyItem2.id) {
                        peerStories2.stories.remove(i4);
                        break;
                    }
                    i4++;
                }
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_deleteStories, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda27
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoriesController.$r8$lambda$iOnOJjm5GkqnEPwpGVjU-pkhY4w(StoriesController.this, tLObject, tL_error);
            }
        });
        updateDeletedStoriesInLists(j, arrayList);
        this.storiesStorage.deleteStories(j, tL_stories_deleteStories.id);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$iOnOJjm5GkqnEPwpGVjU-pkhY4w(StoriesController storiesController, TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.getClass();
        AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda31(storiesController));
    }

    public void updateStoriesPinned(long j, ArrayList arrayList, boolean z, final Utilities.Callback callback) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories stories = getStories(j);
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z;
                togglepinned.id.add(Integer.valueOf(storyItem.id));
                if (stories != null) {
                    for (int i2 = 0; i2 < stories.stories.size(); i2++) {
                        if (stories.stories.get(i2).id == storyItem.id) {
                            stories.stories.get(i2).pinned = z;
                            this.storiesStorage.updateStoryItem(j, storyItem);
                        }
                    }
                }
            }
        }
        FileLog.d("StoriesController updateStoriesPinned");
        updateStoriesInLists(j, arrayList);
        updateStoriesForFullPeer(j, arrayList, false);
        togglepinned.pinned = z;
        togglepinned.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(togglepinned, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda20
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        StoriesController.$r8$lambda$b7OkWgFOuLvuxCAhP7cd-mXUtw8(Utilities.Callback.this, tL_error);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$b7OkWgFOuLvuxCAhP7cd-mXUtw8(Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (callback != null) {
            callback.run(Boolean.valueOf(tL_error == null));
        }
    }

    private long getSelfUserId() {
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public void updateStoryItem(long j, TL_stories.StoryItem storyItem, boolean z) {
        updateStoryItem(j, storyItem, false, z);
    }

    public void updateStoryItem(long j, TL_stories.StoryItem storyItem, boolean z, boolean z2) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("StoriesController updateStoryItem ");
        sb.append(j);
        sb.append(" ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.id + "@" + storyItem.dialogId;
        }
        sb.append(str);
        FileLog.d(sb.toString());
        updateStoriesInLists(j, Collections.singletonList(storyItem), z);
        this.storiesStorage.updateStoryItem(j, storyItem);
        updateStoriesForFullPeer(j, Collections.singletonList(storyItem), !z2);
    }

    public boolean markStoryAsRead(long j, TL_stories.StoryItem storyItem) {
        TL_stories.PeerStories stories = getStories(j);
        if (stories == null) {
            stories = getStoriesFromFullPeer(j);
        }
        return markStoryAsRead(stories, storyItem, false);
    }

    public boolean markStoryAsRead(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z) {
        if (storyItem != null && peerStories != null) {
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i = this.dialogIdToMaxReadId.get(peerDialogId);
            int max = Math.max(peerStories.max_read_id, Math.max(i, storyItem.id));
            NotificationsController.getInstance(this.currentAccount).processReadStories(peerDialogId, max);
            peerStories.max_read_id = max;
            this.dialogIdToMaxReadId.put(peerDialogId, max);
            if (max > i) {
                if (!z) {
                    this.storiesStorage.updateMaxReadId(peerDialogId, max);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(peerDialogId);
                tL_stories_readStories.max_id = storyItem.id;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_readStories, null);
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesReadUpdated, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public int getMaxStoriesReadId(long j) {
        TL_stories.PeerStories stories = getStories(j);
        if (stories == null) {
            stories = getStoriesFromFullPeer(j);
        }
        if (stories != null) {
            return Math.max(stories.max_read_id, this.dialogIdToMaxReadId.get(j, 0));
        }
        return this.dialogIdToMaxReadId.get(j, 0);
    }

    public void markStoriesAsReadFromServer(final long j, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$aJyKHuk1ZpMs-OydvNgHsZIia2w(StoriesController.this, j, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$aJyKHuk1ZpMs-OydvNgHsZIia2w(StoriesController storiesController, long j, int i) {
        int max = Math.max(storiesController.dialogIdToMaxReadId.get(j, 0), i);
        storiesController.dialogIdToMaxReadId.put(j, max);
        storiesController.storiesStorage.updateMaxReadId(j, max);
        TL_stories.PeerStories stories = storiesController.getStories(j);
        if (stories != null && i > stories.max_read_id) {
            stories.max_read_id = i;
            Collections.sort(storiesController.dialogListStories, storiesController.peerStoriesComparator);
            NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    public boolean hasUnreadStories(long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (peerStories == null) {
            peerStories = getStoriesFromFullPeer(j);
        }
        if (peerStories == null) {
            return false;
        }
        if (j == UserConfig.getInstance(this.currentAccount).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) {
            return true;
        }
        for (int i = 0; i < peerStories.stories.size(); i++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i);
            if (storyItem != null && storyItem.id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public int hasUnreadStoriesLive(long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (peerStories == null) {
            peerStories = getStoriesFromFullPeer(j);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j == UserConfig.getInstance(this.currentAccount).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) {
            return 1;
        }
        for (int i = 0; i < peerStories.stories.size(); i++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i);
            if (storyItem != null) {
                if (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) {
                    return 2;
                }
                if (storyItem.id > peerStories.max_read_id) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public boolean hasLiveStory(long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (peerStories == null) {
            peerStories = getStoriesFromFullPeer(j);
        }
        if (peerStories == null) {
            return false;
        }
        for (int size = peerStories.stories.size() - 1; size >= 0; size--) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(size);
            if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                return true;
            }
        }
        return false;
    }

    public int getUnreadState(long j) {
        return getUnreadState(j, 0);
    }

    public int getUnreadState(long j, int i) {
        if (j == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (peerStories == null) {
            peerStories = getStoriesFromFullPeer(j);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j == UserConfig.getInstance(this.currentAccount).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.dialogIdToMaxReadId.get(j, 0));
        boolean z = false;
        for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
            if (peerStories.stories.get(i2).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i == 0 || peerStories.stories.get(i2).id == i) && peerStories.stories.get(i2).id > max) {
                if (peerStories.stories.get(i2).close_friends) {
                    return 2;
                }
                z = true;
            }
        }
        return (!isLastUploadingFailed(j) && z) ? 1 : 0;
    }

    public boolean hasUploadingStories(long j) {
        ArrayList arrayList = (ArrayList) this.uploadingStoriesByDialogId.get(j);
        HashMap hashMap = (HashMap) this.editingStories.get(j);
        if (arrayList == null || arrayList.isEmpty()) {
            return (hashMap == null || hashMap.isEmpty()) ? false : true;
        }
        return true;
    }

    public void cleanup() {
        this.allStoriesLoaded = false;
        this.allHiddenStoriesLoaded = false;
        this.storiesReadLoaded = false;
        this.stateHidden = "";
        this.state = "";
        this.mainSettings.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        final DraftsController draftsController = this.draftsController;
        Objects.requireNonNull(draftsController);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                DraftsController.this.cleanup();
            }
        });
        loadStories();
        loadStoriesRead();
    }

    public void pollViewsForSelfStories(long j, boolean z) {
        ViewsForPeerStoriesRequester viewsForPeerStoriesRequester = (ViewsForPeerStoriesRequester) this.pollingViewsForSelfStoriesRequester.get(j);
        if (viewsForPeerStoriesRequester == null) {
            viewsForPeerStoriesRequester = new ViewsForPeerStoriesRequester(this, j, this.currentAccount);
            this.pollingViewsForSelfStoriesRequester.put(j, viewsForPeerStoriesRequester);
        }
        viewsForPeerStoriesRequester.start(z);
    }

    public void stopAllPollers() {
        for (int i = 0; i < this.pollingViewsForSelfStoriesRequester.size(); i++) {
            ((ViewsForPeerStoriesRequester) this.pollingViewsForSelfStoriesRequester.valueAt(i)).start(false);
        }
    }

    void loadSkippedStories(long j) {
        boolean z;
        TL_stories.PeerStories stories = getStories(j);
        if (stories == null) {
            stories = getStoriesFromFullPeer(j);
            z = true;
        } else {
            z = false;
        }
        loadSkippedStories(stories, z);
    }

    void loadSkippedStories(final TL_stories.PeerStories peerStories, final boolean z) {
        if (peerStories == null) {
            return;
        }
        final long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        final long j = peerDialogId * (z ? -1 : 1);
        if (this.loadingAllStories.contains(Long.valueOf(j))) {
            return;
        }
        ArrayList<Integer> arrayList = null;
        for (int i = 0; i < peerStories.stories.size(); i++) {
            if (peerStories.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(Integer.valueOf(peerStories.stories.get(i).id));
            }
            if (arrayList != null && arrayList.size() > 14) {
                break;
            }
        }
        if (arrayList != null) {
            this.loadingAllStories.add(Long.valueOf(j));
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.id = arrayList;
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(peerDialogId);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda21
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesController.$r8$lambda$yfRmCcSLLd5mKWe0nG82BBm2feI(StoriesController.this, j, z, peerStories, peerDialogId, tLObject, tL_error);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$yfRmCcSLLd5mKWe0nG82BBm2feI(final StoriesController storiesController, final long j, final boolean z, final TL_stories.PeerStories peerStories, final long j2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$pado3A6gZmaWG5WuyM-wx4bVIJA(StoriesController.this, j, z, peerStories, j2, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$pado3A6gZmaWG5WuyM-wx4bVIJA(StoriesController storiesController, long j, boolean z, TL_stories.PeerStories peerStories, long j2, TLObject tLObject) {
        storiesController.loadingAllStories.remove(Long.valueOf(j));
        if (!z) {
            peerStories = storiesController.getStories(j2);
        }
        if (peerStories == null) {
            return;
        }
        if (tLObject instanceof TL_stories.TL_stories_stories) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                    if (peerStories.stories.get(i2).id == tL_stories_stories.stories.get(i).id) {
                        peerStories.stories.set(i2, tL_stories_stories.stories.get(i));
                        storiesController.preloadStory(j2, tL_stories_stories.stories.get(i));
                    }
                }
            }
            if (!z) {
                storiesController.storiesStorage.updateStories(peerStories);
            }
        }
        NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public void loadNextStories(boolean z) {
        if (z) {
            if (!this.hasMoreHidden) {
                return;
            }
        } else if (!this.hasMore) {
            return;
        }
        loadFromServer(z);
    }

    public void fillMessagesWithStories(LongSparseArray longSparseArray, Runnable runnable, int i, Timer timer) {
        this.storiesStorage.fillMessagesWithStories(longSparseArray, runnable, i, timer);
    }

    public void resolveStoryAlbumLink(long j, final int i, final Consumer consumer) {
        StoriesCollections storyAlbumsList = getStoryAlbumsList(j, false);
        if (storyAlbumsList != null) {
            StoryAlbum findById = storyAlbumsList.findById(i);
            if (findById != null) {
                consumer.accept(findById.toTl());
                return;
            } else if (storyAlbumsList.loaded) {
                consumer.accept(null);
                return;
            }
        }
        TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
        tL_getAlbums.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getAlbums, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda24
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda30
                    @Override // java.lang.Runnable
                    public final void run() {
                        StoriesController.$r8$lambda$B2LG_gRvrAT08kQkY2FYnEPrC1k(TLObject.this, r2, r3);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$B2LG_gRvrAT08kQkY2FYnEPrC1k(TLObject tLObject, int i, Consumer consumer) {
        if (tLObject instanceof TL_stories.TL_albums) {
            ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject).albums;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i2);
                i2++;
                TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                if (tL_storyAlbum2.album_id == i) {
                    consumer.accept(tL_storyAlbum2);
                    return;
                }
            }
        }
        consumer.accept(null);
    }

    public void resolveLiveStoryLink(long j, Consumer consumer) {
        TL_stories.PeerStories stories = getStories(j);
        if (stories != null) {
            for (int i = 0; i < stories.stories.size(); i++) {
                if ((stories.stories.get(i).media instanceof TLRPC.TL_messageMediaVideoStream) && !(stories.stories.get(i) instanceof TL_stories.TL_storyItemSkipped)) {
                    consumer.accept(stories.stories.get(i));
                    return;
                }
            }
        }
        long j2 = ((-93321425) + j) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.resolvedStories.get(j2);
        if (storyItem != null) {
            consumer.accept(storyItem);
            return;
        }
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getPeerStories, new 1(j2, consumer));
    }

    class 1 implements RequestDelegate {
        final /* synthetic */ Consumer val$consumer;
        final /* synthetic */ long val$hash;

        1(long j, Consumer consumer) {
            this.val$hash = j;
            this.val$consumer = consumer;
        }

        @Override // org.telegram.tgnet.RequestDelegate
        public void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
            final long j = this.val$hash;
            final Consumer consumer = this.val$consumer;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.1.$r8$lambda$wmoHkW99TsPD01jeW1suRRodb1M(StoriesController.1.this, tLObject, j, consumer);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$wmoHkW99TsPD01jeW1suRRodb1M(1 r3, TLObject tLObject, long j, Consumer consumer) {
            TL_stories.StoryItem storyItem;
            r3.getClass();
            if (tLObject != null) {
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                MessagesController.getInstance(StoriesController.this.currentAccount).putUsers(tL_stories_peerStories.users, false);
                MessagesController.getInstance(StoriesController.this.currentAccount).putChats(tL_stories_peerStories.chats, false);
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                if (peerStories != null) {
                    for (int i = 0; i < peerStories.stories.size(); i++) {
                        if ((peerStories.stories.get(i).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories.stories.get(i) instanceof TL_stories.TL_storyItemSkipped)) {
                            LongSparseArray longSparseArray = StoriesController.this.resolvedStories;
                            storyItem = peerStories.stories.get(i);
                            longSparseArray.put(j, storyItem);
                            break;
                        }
                    }
                }
            }
            storyItem = null;
            consumer.accept(storyItem);
        }
    }

    public void resolveStoryLink(long j, int i, Consumer consumer) {
        TL_stories.PeerStories stories = getStories(j);
        if (stories != null) {
            for (int i2 = 0; i2 < stories.stories.size(); i2++) {
                if (stories.stories.get(i2).id == i && !(stories.stories.get(i2) instanceof TL_stories.TL_storyItemSkipped)) {
                    consumer.accept(stories.stories.get(i2));
                    return;
                }
            }
        }
        long j2 = (i + j) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.resolvedStories.get(j2);
        if (storyItem != null) {
            consumer.accept(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoriesByID, new 2(j2, consumer));
    }

    class 2 implements RequestDelegate {
        final /* synthetic */ Consumer val$consumer;
        final /* synthetic */ long val$hash;

        2(long j, Consumer consumer) {
            this.val$hash = j;
            this.val$consumer = consumer;
        }

        @Override // org.telegram.tgnet.RequestDelegate
        public void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
            final long j = this.val$hash;
            final Consumer consumer = this.val$consumer;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.2.$r8$lambda$fA3qY-1YsKxkwGpC_5CQNf-5Njc(StoriesController.2.this, tLObject, j, consumer);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$fA3qY-1YsKxkwGpC_5CQNf-5Njc(2 r3, TLObject tLObject, long j, Consumer consumer) {
            TL_stories.StoryItem storyItem;
            r3.getClass();
            if (tLObject != null) {
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                MessagesController.getInstance(StoriesController.this.currentAccount).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(StoriesController.this.currentAccount).putChats(tL_stories_stories.chats, false);
                if (tL_stories_stories.stories.size() > 0) {
                    LongSparseArray longSparseArray = StoriesController.this.resolvedStories;
                    storyItem = tL_stories_stories.stories.get(0);
                    longSparseArray.put(j, storyItem);
                    consumer.accept(storyItem);
                }
            }
            storyItem = null;
            consumer.accept(storyItem);
        }
    }

    public ArrayList getHiddenList() {
        return this.hiddenListStories;
    }

    public int getTotalStoriesCount(boolean z) {
        return z ? this.hasMoreHidden ? Math.max(1, this.totalStoriesCountHidden) : this.hiddenListStories.size() : this.hasMore ? Math.max(1, this.totalStoriesCount) : this.dialogListStories.size();
    }

    public void putStories(long j, TL_stories.PeerStories peerStories) {
        putToAllStories(j, peerStories);
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            if (isContactOrService(user) || user.self) {
                this.storiesStorage.putPeerStories(peerStories);
                return;
            }
            return;
        }
        if (ChatObject.isInChat(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j)))) {
            this.storiesStorage.putPeerStories(peerStories);
        }
    }

    public void setLoading(long j, boolean z) {
        if (z) {
            this.loadingDialogsStories.put(j, 1);
        } else {
            this.loadingDialogsStories.delete(j);
        }
    }

    public boolean isLoading(long j) {
        return this.loadingDialogsStories.get(j, 0) == 1;
    }

    public void removeContact(long j) {
        int i = 0;
        while (true) {
            if (i >= this.dialogListStories.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) this.dialogListStories.get(i)).peer) == j) {
                this.dialogListStories.remove(i);
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.hiddenListStories.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) this.hiddenListStories.get(i2)).peer) == j) {
                this.hiddenListStories.remove(i2);
                break;
            }
            i2++;
        }
        this.storiesStorage.deleteAllUserStories(j);
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public StoriesStorage getStoriesStorage() {
        return this.storiesStorage;
    }

    public boolean hasHiddenStories() {
        return !this.hiddenListStories.isEmpty();
    }

    public void checkExpiredStories() {
        checkExpireStories(this.dialogListStories);
        checkExpireStories(this.hiddenListStories);
    }

    private void checkExpireStories(ArrayList arrayList) {
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i2 = 0;
            while (i2 < peerStories.stories.size()) {
                if (StoriesUtilities.isExpired(this.currentAccount, peerStories.stories.get(i2))) {
                    peerStories.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (peerStories.stories.isEmpty() && !hasUploadingStories(peerDialogId)) {
                this.allStoriesMap.remove(peerDialogId);
                arrayList.remove(peerStories);
                z = true;
            }
        }
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    private void checkExpireStories(TL_stories.PeerStories peerStories) {
        if (peerStories == null || peerStories.stories == null) {
            return;
        }
        int i = 0;
        while (i < peerStories.stories.size()) {
            if (StoriesUtilities.isExpired(this.currentAccount, peerStories.stories.get(i))) {
                peerStories.stories.remove(i);
                i--;
            }
            i++;
        }
        peerStories.checkedExpired = true;
    }

    public void checkExpiredStories(long j) {
        TL_stories.PeerStories stories = getStories(j);
        if (stories == null) {
            return;
        }
        int i = 0;
        while (i < stories.stories.size()) {
            if (StoriesUtilities.isExpired(this.currentAccount, stories.stories.get(i))) {
                stories.stories.remove(i);
                i--;
            }
            i++;
        }
        if (!stories.stories.isEmpty() || hasUnreadStories(j)) {
            return;
        }
        this.dialogListStories.remove(stories);
        this.hiddenListStories.remove(stories);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public boolean hasLoadingStories() {
        return this.loadingDialogsStories.size() > 0;
    }

    public TL_stories.TL_storiesStealthMode getStealthMode() {
        return this.stealthMode;
    }

    public void setStealthMode(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.stealthMode = tL_storiesStealthMode;
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.stealthModeChanged, new Object[0]);
        writeStealthMode(tL_storiesStealthMode);
    }

    public void setStoryReaction(long j, TL_stories.StoryItem storyItem, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.id;
        tL_stories_sendReaction.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        if (visibleReaction == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (visibleReaction.documentId != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = visibleReaction.documentId;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (visibleReaction.emojicon != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = visibleReaction.emojicon;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        updateStoryItem(j, storyItem, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_sendReaction, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda36
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoriesController.$r8$lambda$5K2JLy0hG6eCW4OXirUJjmxFt-A(tLObject, tL_error);
            }
        });
    }

    public void updateStoryReaction(long j, int i, TLRPC.Reaction reaction) {
        TL_stories.StoryItem findStory = findStory(j, i);
        if (findStory != null) {
            findStory.sent_reaction = reaction;
            if (reaction != null) {
                findStory.flags |= 32768;
            } else {
                findStory.flags &= -32769;
            }
            updateStoryItem(j, findStory, true);
        }
    }

    public TL_stories.StoryItem findStory(long j, int i) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (peerStories == null) {
            return null;
        }
        for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
            if (peerStories.stories.get(i2).id == i) {
                return peerStories.stories.get(i2);
            }
        }
        return null;
    }

    public void onPremiumChanged() {
        this.selfViewsModel.clear();
    }

    public void updateStoriesFromFullPeer(long j, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories == null || (peerStories2 = (TL_stories.PeerStories) this.allStoriesMap.get(j)) == null) {
            return;
        }
        FileLog.d("StoriesController update stories from full peer " + j);
        for (int i = 0; i < peerStories2.stories.size(); i++) {
            if (peerStories2.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                int i2 = peerStories2.stories.get(i).id;
                int i3 = 0;
                while (true) {
                    if (i3 >= peerStories.stories.size()) {
                        break;
                    }
                    if (peerStories.stories.get(i3).id == i2 && (peerStories.stories.get(i3) instanceof TL_stories.TL_storyItem)) {
                        peerStories2.stories.set(i, peerStories.stories.get(i3));
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    public class UploadingStory implements NotificationCenter.NotificationCenterDelegate {
        boolean canceled;
        float convertingProgress;
        private int currentRequest;
        long dialogId;
        private long duration;
        public final boolean edit;
        public final StoryEntry entry;
        private boolean entryDestroyed;
        public boolean failed;
        public String firstFramePath;
        public boolean hadFailed;
        public VideoEditedInfo info;
        public boolean isCloseFriends;
        boolean isVideo;
        public MessageObject messageObject;
        String path;
        private TL_bots.botPreviewMedia previewMedia;
        public float progress;
        public boolean putMessages;
        boolean ready;
        public MessageObject sharedMessageObject;
        float uploadProgress;
        private long firstSecondSize = -1;
        public final long random_id = Utilities.random.nextLong();

        public UploadingStory(StoryEntry storyEntry) {
            this.entry = storyEntry;
            this.edit = storyEntry.isEdit;
            File file = storyEntry.uploadThumbFile;
            if (file != null) {
                this.firstFramePath = file.getAbsolutePath();
            }
            boolean z = storyEntry.isError;
            this.hadFailed = z;
            this.failed = z;
            long j = storyEntry.botId;
            if (j != 0) {
                this.dialogId = j;
                return;
            }
            if (storyEntry.isEdit) {
                this.dialogId = storyEntry.editStoryPeerId;
                return;
            }
            TLRPC.InputPeer inputPeer = storyEntry.peer;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.dialogId = UserConfig.getInstance(StoriesController.this.currentAccount).clientUserId;
            } else {
                this.dialogId = DialogObject.getPeerDialogId(inputPeer);
            }
        }

        private void startForeground() {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) StoryUploadingService.class);
            intent.putExtra("path", this.path);
            intent.putExtra("currentAccount", StoriesController.this.currentAccount);
            try {
                ApplicationLoader.applicationContext.startService(intent);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        public void start() {
            StoryEntry storyEntry = this.entry;
            if (storyEntry.isEditingCover) {
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.entry.editingCoverDocument);
                sendUploadedRequest(tL_inputFileStoryDocument);
            } else if ((storyEntry.isEdit || (storyEntry.isRepost && storyEntry.repostMedia != null)) && !storyEntry.editedMedia && storyEntry.round == null) {
                sendUploadedRequest(null);
                return;
            }
            StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = this.entry.privacy;
            this.isCloseFriends = storyPrivacy != null && storyPrivacy.isCloseFriends();
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            boolean wouldBeVideo = this.entry.wouldBeVideo();
            this.isVideo = wouldBeVideo;
            if (!wouldBeVideo) {
                final File makeCacheFile = StoryEntry.makeCacheFile(StoriesController.this.currentAccount, false);
                this.path = makeCacheFile.getAbsolutePath();
                Utilities.themeQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        StoriesController.UploadingStory.$r8$lambda$OX4g-rbIbv81epEI_JCtFOuBaa8(StoriesController.UploadingStory.this, makeCacheFile);
                    }
                });
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 1;
                String absolutePath = StoryEntry.makeCacheFile(StoriesController.this.currentAccount, true).getAbsolutePath();
                tL_message.attachPath = absolutePath;
                this.path = absolutePath;
                this.messageObject = new MessageObject(StoriesController.this.currentAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                this.entry.getVideoEditedInfo(new Utilities.Callback() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda7
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        StoriesController.UploadingStory.$r8$lambda$uTpomscd7BfTynfVqpzGN-08dEU(StoriesController.UploadingStory.this, (VideoEditedInfo) obj);
                    }
                });
            }
            startForeground();
        }

        public static /* synthetic */ void $r8$lambda$uTpomscd7BfTynfVqpzGN-08dEU(UploadingStory uploadingStory, VideoEditedInfo videoEditedInfo) {
            uploadingStory.info = videoEditedInfo;
            uploadingStory.messageObject.videoEditedInfo = videoEditedInfo;
            uploadingStory.duration = videoEditedInfo.estimatedDuration / 1000;
            if (videoEditedInfo.needConvert()) {
                MediaController.getInstance().scheduleVideoConvert(uploadingStory.messageObject, false, false, false);
            } else if (new File(uploadingStory.messageObject.videoEditedInfo.originalPath).renameTo(new File(uploadingStory.path))) {
                FileLoader.getInstance(StoriesController.this.currentAccount).uploadFile(uploadingStory.path, false, false, 33554432);
            }
        }

        public static /* synthetic */ void $r8$lambda$OX4g-rbIbv81epEI_JCtFOuBaa8(final UploadingStory uploadingStory, File file) {
            uploadingStory.entry.buildPhoto(file);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.UploadingStory.$r8$lambda$KBav6hcRMHtwuz-QIp8putyg_UE(StoriesController.UploadingStory.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$KBav6hcRMHtwuz-QIp8putyg_UE(UploadingStory uploadingStory) {
            uploadingStory.ready = true;
            uploadingStory.upload();
        }

        public void tryAgain() {
            this.failed = false;
            this.entryDestroyed = false;
            this.progress = 0.0f;
            this.uploadProgress = 0.0f;
            this.convertingProgress = 0.0f;
            if (this.path != null) {
                try {
                    new File(this.path).delete();
                    this.path = null;
                } catch (Exception unused) {
                }
            }
            start();
        }

        private void upload() {
            if (this.entry.shareUserIds == null) {
                FileLoader fileLoader = FileLoader.getInstance(StoriesController.this.currentAccount);
                String str = this.path;
                boolean z = !this.entry.isVideo;
                if (this.isVideo) {
                    VideoEditedInfo videoEditedInfo = this.info;
                    r5 = Math.max(1, (int) (videoEditedInfo != null ? videoEditedInfo.estimatedSize : 0L));
                }
                fileLoader.uploadFile(str, false, z, r5, this.entry.isVideo ? 33554432 : 16777216, true);
                return;
            }
            putMessages();
        }

        public void cleanup() {
            HashMap hashMap;
            ArrayList arrayList;
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            if (!this.failed && (arrayList = (ArrayList) StoriesController.this.uploadingStoriesByDialogId.get(this.dialogId)) != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = (ArrayList) StoriesController.this.uploadingAndEditingStories.get(this.dialogId);
            if (arrayList2 != null) {
                arrayList2.remove(this);
                if (!arrayList2.isEmpty()) {
                    StoriesController.this.uploadedStories++;
                } else {
                    StoriesController.this.uploadedStories = 0;
                }
            }
            if (this.edit && (hashMap = (HashMap) StoriesController.this.editingStories.get(this.dialogId)) != null) {
                hashMap.remove(Integer.valueOf(this.entry.editStoryId));
            }
            if (this.previewMedia != null) {
                StoriesList storiesList = StoriesController.this.getStoriesList(this.dialogId, 4, false);
                StoryEntry storyEntry = this.entry;
                if (storyEntry != null && storyEntry.isEdit) {
                    if (storiesList instanceof BotPreviewsList) {
                        ((BotPreviewsList) storiesList).edit(storyEntry.editingBotPreview, this.previewMedia);
                    }
                    int i = StoriesController.this.currentAccount;
                    long j = this.dialogId;
                    StoryEntry storyEntry2 = this.entry;
                    BotPreviewsEditContainer.edit(i, j, storyEntry2.botLang, storyEntry2.editingBotPreview, this.previewMedia);
                } else {
                    if (storiesList instanceof BotPreviewsList) {
                        ((BotPreviewsList) storiesList).push(this.previewMedia);
                    }
                    BotPreviewsEditContainer.push(StoriesController.this.currentAccount, this.dialogId, this.entry.botLang, this.previewMedia);
                }
                this.previewMedia = null;
            }
            NotificationCenter.getInstance(StoriesController.this.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
            StoryEntry storyEntry3 = this.entry;
            if (storyEntry3 != null && !storyEntry3.isEditSaved && !this.entryDestroyed) {
                storyEntry3.destroy(false);
                this.entryDestroyed = true;
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.uploadStoryEnd, this.path);
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.filePreparingStarted) {
                if (objArr[0] == this.messageObject) {
                    this.path = (String) objArr[1];
                    upload();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.fileNewChunkAvailable) {
                if (objArr[0] == this.messageObject) {
                    String str = (String) objArr[1];
                    long longValue = ((Long) objArr[2]).longValue();
                    long longValue2 = ((Long) objArr[3]).longValue();
                    float floatValue = ((Float) objArr[4]).floatValue();
                    this.convertingProgress = floatValue;
                    this.progress = (floatValue * 0.3f) + (this.uploadProgress * 0.7f);
                    NotificationCenter.getInstance(StoriesController.this.currentAccount).postNotificationName(NotificationCenter.uploadStoryProgress, this.path, Float.valueOf(this.progress));
                    if (this.firstSecondSize < 0 && this.convertingProgress * this.duration >= 1000.0f) {
                        this.firstSecondSize = longValue;
                    }
                    FileLoader.getInstance(StoriesController.this.currentAccount).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.convertingProgress));
                    if (longValue2 > 0) {
                        if (this.firstSecondSize < 0) {
                            this.firstSecondSize = longValue2;
                        }
                        this.ready = true;
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == NotificationCenter.filePreparingFailed) {
                if (objArr[0] == this.messageObject) {
                    if (!this.edit) {
                        StoryEntry storyEntry = this.entry;
                        storyEntry.isError = true;
                        storyEntry.error = new TLRPC.TL_error();
                        TLRPC.TL_error tL_error = this.entry.error;
                        tL_error.code = 400;
                        tL_error.text = "FILE_PREPARE_FAILED";
                        this.entryDestroyed = true;
                        this.failed = true;
                        this.hadFailed = true;
                        StoriesController.this.getDraftsController().edit(this.entry);
                    }
                    cleanup();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.fileUploaded) {
                String str2 = (String) objArr[0];
                String str3 = this.path;
                if (str3 == null || !str2.equals(str3)) {
                    return;
                }
                sendUploadedRequest((TLRPC.InputFile) objArr[1]);
                return;
            }
            if (i == NotificationCenter.fileUploadFailed) {
                String str4 = (String) objArr[0];
                String str5 = this.path;
                if (str5 == null || !str4.equals(str5)) {
                    return;
                }
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                cleanup();
                return;
            }
            if (i == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.path)) {
                float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
                this.uploadProgress = min;
                this.progress = (this.convertingProgress * 0.3f) + (min * 0.7f);
                NotificationCenter.getInstance(StoriesController.this.currentAccount).postNotificationName(NotificationCenter.uploadStoryProgress, this.path, Float.valueOf(this.progress));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
        
            if (r14.isEmpty() == false) goto L73;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:140:0x02eb  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void sendUploadedRequest(TLRPC.InputFile inputFile) {
            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
            boolean z;
            TL_stories.TL_stories_sendStory tL_stories_sendStory;
            RequestDelegate requestDelegate;
            CharSequence charSequence;
            CharSequence charSequence2;
            String str;
            List list;
            TLRPC.MessageMedia messageMedia;
            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
            if (this.canceled) {
                return;
            }
            StoryEntry storyEntry = this.entry;
            if (storyEntry.shareUserIds != null) {
                return;
            }
            int i = 0;
            if (storyEntry.isRepost && !storyEntry.editedMedia && (messageMedia = storyEntry.repostMedia) != null) {
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.MessageMedia messageMedia2 = this.entry.repostMedia;
                    TLRPC.Document document = messageMedia2.document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.id = tL_inputDocument;
                    tL_inputMediaDocument.spoiler = messageMedia2.spoiler;
                    tL_inputMediaPhoto2 = tL_inputMediaDocument;
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = new TLRPC.TL_inputMediaPhoto();
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    TLRPC.Photo photo = this.entry.repostMedia.photo;
                    tL_inputPhoto.id = photo.id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    tL_inputMediaPhoto3.id = tL_inputPhoto;
                    tL_inputMediaPhoto2 = tL_inputMediaPhoto3;
                }
                z = true;
                tL_inputMediaPhoto = tL_inputMediaPhoto2;
                TLRPC.InputMedia inputMedia = tL_inputMediaPhoto;
                inputMedia = tL_inputMediaPhoto;
                if (tL_inputMediaPhoto == null && inputFile != null) {
                    if (!this.entry.wouldBeVideo()) {
                        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                        tL_inputMediaUploadedDocument.file = inputFile;
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                        if (this.entry.editingCoverDocument != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= this.entry.editingCoverDocument.attributes.size()) {
                                    break;
                                }
                                if (this.entry.editingCoverDocument.attributes.get(i2) instanceof TLRPC.TL_documentAttributeVideo) {
                                    tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) this.entry.editingCoverDocument.attributes.get(i2);
                                    break;
                                }
                                i2++;
                            }
                        } else {
                            SendMessagesHelper.fillVideoAttribute(this.path, tL_documentAttributeVideo, null);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                        tL_documentAttributeVideo.supports_streaming = true;
                        int i3 = tL_documentAttributeVideo.flags;
                        tL_documentAttributeVideo.flags = i3 | 4;
                        tL_documentAttributeVideo.preload_prefix_size = (int) this.firstSecondSize;
                        StoryEntry storyEntry2 = this.entry;
                        if (storyEntry2.cover >= 0) {
                            tL_documentAttributeVideo.flags = i3 | 20;
                            tL_documentAttributeVideo.video_start_ts = (r9 - (storyEntry2.left * storyEntry2.duration)) / 1000.0d;
                        }
                        List list2 = storyEntry2.stickers;
                        if (list2 != null && (!list2.isEmpty() || ((list = this.entry.editStickers) != null && !list.isEmpty()))) {
                            tL_inputMediaUploadedDocument.flags |= 1;
                            ArrayList<TLRPC.InputDocument> arrayList = new ArrayList<>(this.entry.stickers);
                            tL_inputMediaUploadedDocument.stickers = arrayList;
                            List list3 = this.entry.editStickers;
                            if (list3 != null) {
                                arrayList.addAll(list3);
                            }
                            tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                        }
                        StoryEntry storyEntry3 = this.entry;
                        tL_inputMediaUploadedDocument.nosound_video = storyEntry3.audioPath == null && (storyEntry3.muted || !storyEntry3.isVideo);
                        tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                        inputMedia = tL_inputMediaUploadedDocument;
                    } else {
                        TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                        tL_inputMediaUploadedPhoto.file = inputFile;
                        MimeTypeMap singleton = MimeTypeMap.getSingleton();
                        int lastIndexOf = this.path.lastIndexOf(46);
                        if (lastIndexOf == -1) {
                            str = "txt";
                        } else {
                            str = this.path.substring(lastIndexOf + 1).toLowerCase();
                        }
                        tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(str);
                        List list4 = this.entry.stickers;
                        inputMedia = tL_inputMediaUploadedPhoto;
                        if (list4 != null) {
                            if (list4.isEmpty()) {
                                List list5 = this.entry.editStickers;
                                inputMedia = tL_inputMediaUploadedPhoto;
                                if (list5 != null) {
                                    inputMedia = tL_inputMediaUploadedPhoto;
                                }
                            }
                            tL_inputMediaUploadedPhoto.flags |= 1;
                            List list6 = this.entry.editStickers;
                            if (list6 != null) {
                                tL_inputMediaUploadedPhoto.stickers.addAll(list6);
                            }
                            tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(this.entry.stickers);
                            inputMedia = tL_inputMediaUploadedPhoto;
                        }
                    }
                }
                int i4 = !UserConfig.getInstance(StoriesController.this.currentAccount).isPremium() ? MessagesController.getInstance(StoriesController.this.currentAccount).storyCaptionLengthLimitPremium : MessagesController.getInstance(StoriesController.this.currentAccount).storyCaptionLengthLimitDefault;
                if (this.edit) {
                    if (this.entry.botId != 0) {
                        TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                        addpreviewmedia.bot = MessagesController.getInstance(StoriesController.this.currentAccount).getInputUser(this.entry.botId);
                        addpreviewmedia.media = inputMedia;
                        addpreviewmedia.lang_code = this.entry.botLang;
                        tL_stories_sendStory = addpreviewmedia;
                    } else {
                        TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                        tL_stories_sendStory2.random_id = this.random_id;
                        tL_stories_sendStory2.peer = MessagesController.getInstance(StoriesController.this.currentAccount).getInputPeer(this.dialogId);
                        tL_stories_sendStory2.media = inputMedia;
                        tL_stories_sendStory2.privacy_rules.addAll(this.entry.privacyRules);
                        StoryEntry storyEntry4 = this.entry;
                        tL_stories_sendStory2.pinned = storyEntry4.pinned;
                        tL_stories_sendStory2.noforwards = !storyEntry4.allowScreenshots;
                        tL_stories_sendStory2.albums = storyEntry4.albums != null ? new ArrayList<>(this.entry.albums) : null;
                        StoryEntry storyEntry5 = this.entry;
                        TLRPC.InputDocument inputDocument = storyEntry5.audioDocument;
                        if (inputDocument != null) {
                            tL_stories_sendStory2.flags |= 512;
                            tL_stories_sendStory2.music = inputDocument;
                        }
                        CharSequence charSequence3 = storyEntry5.caption;
                        if (charSequence3 != null) {
                            tL_stories_sendStory2.flags |= 3;
                            CharSequence[] charSequenceArr = {charSequence3};
                            if (charSequence3.length() > i4) {
                                charSequenceArr[0] = charSequenceArr[0].subSequence(0, i4);
                            }
                            if (MessagesController.getInstance(StoriesController.this.currentAccount).storyEntitiesAllowed()) {
                                tL_stories_sendStory2.entities = MediaDataController.getInstance(StoriesController.this.currentAccount).getEntities(charSequenceArr, true);
                            } else {
                                tL_stories_sendStory2.entities.clear();
                            }
                            if (charSequenceArr[0].length() > i4) {
                                charSequenceArr[0] = charSequenceArr[0].subSequence(0, i4);
                            }
                            tL_stories_sendStory2.caption = charSequenceArr[0].toString();
                        }
                        if (this.entry.isRepost) {
                            tL_stories_sendStory2.flags |= 64;
                            tL_stories_sendStory2.fwd_from_id = MessagesController.getInstance(StoriesController.this.currentAccount).getInputPeer(this.entry.repostPeer);
                            tL_stories_sendStory2.fwd_from_story = this.entry.repostStoryId;
                            tL_stories_sendStory2.fwd_modified = !z;
                        }
                        StoryEntry storyEntry6 = this.entry;
                        int i5 = storyEntry6.period;
                        if (i5 == Integer.MAX_VALUE) {
                            tL_stories_sendStory2.pinned = true;
                        } else {
                            tL_stories_sendStory2.flags |= 8;
                            tL_stories_sendStory2.period = i5;
                        }
                        if (storyEntry6.mediaEntities != null) {
                            while (i < this.entry.mediaEntities.size()) {
                                TL_stories.MediaArea mediaArea = ((VideoEditedInfo.MediaEntity) this.entry.mediaEntities.get(i)).mediaArea;
                                if (mediaArea != null) {
                                    tL_stories_sendStory2.media_areas.add(mediaArea);
                                }
                                i++;
                            }
                            if (!tL_stories_sendStory2.media_areas.isEmpty()) {
                                tL_stories_sendStory2.flags |= 32;
                            }
                        }
                        tL_stories_sendStory = tL_stories_sendStory2;
                    }
                } else if (this.entry.botId != 0) {
                    TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                    editpreviewmedia.bot = MessagesController.getInstance(StoriesController.this.currentAccount).getInputUser(this.entry.botId);
                    StoryEntry storyEntry7 = this.entry;
                    editpreviewmedia.media = storyEntry7.editingBotPreview;
                    editpreviewmedia.new_media = inputMedia;
                    editpreviewmedia.lang_code = storyEntry7.botLang;
                    tL_stories_sendStory = editpreviewmedia;
                } else {
                    TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                    tL_stories_editStory.id = this.entry.editStoryId;
                    tL_stories_editStory.peer = MessagesController.getInstance(StoriesController.this.currentAccount).getInputPeer(this.dialogId);
                    tL_stories_editStory.flags |= 16;
                    TLRPC.InputDocument inputDocument2 = this.entry.audioDocument;
                    if (inputDocument2 != null) {
                        tL_stories_editStory.music = inputDocument2;
                    } else {
                        tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                    }
                    if (inputMedia != null && this.entry.editedMedia) {
                        tL_stories_editStory.flags |= 1;
                        tL_stories_editStory.media = inputMedia;
                    }
                    StoryEntry storyEntry8 = this.entry;
                    if (storyEntry8.editedCaption && (charSequence2 = storyEntry8.caption) != null) {
                        tL_stories_editStory.flags |= 2;
                        CharSequence[] charSequenceArr2 = {charSequence2};
                        if (charSequence2.length() > i4) {
                            charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i4);
                        }
                        if (MessagesController.getInstance(StoriesController.this.currentAccount).storyEntitiesAllowed()) {
                            tL_stories_editStory.entities = MediaDataController.getInstance(StoriesController.this.currentAccount).getEntities(charSequenceArr2, true);
                        } else {
                            tL_stories_editStory.entities.clear();
                        }
                        if (charSequenceArr2[0].length() > i4) {
                            charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i4);
                        }
                        tL_stories_editStory.caption = charSequenceArr2[0].toString();
                    }
                    StoryEntry storyEntry9 = this.entry;
                    if (storyEntry9.editedPrivacy) {
                        tL_stories_editStory.flags |= 4;
                        tL_stories_editStory.privacy_rules.addAll(storyEntry9.privacyRules);
                    }
                    ArrayList arrayList2 = this.entry.editedMediaAreas;
                    if (arrayList2 != null) {
                        tL_stories_editStory.media_areas.addAll(arrayList2);
                    }
                    if (this.entry.mediaEntities != null) {
                        while (i < this.entry.mediaEntities.size()) {
                            TL_stories.MediaArea mediaArea2 = ((VideoEditedInfo.MediaEntity) this.entry.mediaEntities.get(i)).mediaArea;
                            if (mediaArea2 != null) {
                                tL_stories_editStory.media_areas.add(mediaArea2);
                            }
                            i++;
                        }
                    }
                    if (!tL_stories_editStory.media_areas.isEmpty()) {
                        tL_stories_editStory.flags |= 8;
                    }
                    tL_stories_sendStory = tL_stories_editStory;
                }
                requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda0
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StoriesController.UploadingStory.$r8$lambda$IafFf-R_l2LMoVw69bV3rF_QOfI(StoriesController.UploadingStory.this, tLObject, tL_error);
                    }
                };
                if (BuildVars.DEBUG_PRIVATE_VERSION || this.edit || (charSequence = this.entry.caption) == null || !charSequence.toString().contains("#failtest") || this.hadFailed) {
                    this.currentRequest = ConnectionsManager.getInstance(StoriesController.this.currentAccount).sendRequest(tL_stories_sendStory, requestDelegate, 64);
                }
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.code = 400;
                tL_error.text = "FORCED_TO_FAIL";
                requestDelegate.run(null, tL_error);
                return;
            }
            tL_inputMediaPhoto = null;
            z = false;
            TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
            inputMedia2 = tL_inputMediaPhoto;
            if (tL_inputMediaPhoto == null) {
                if (!this.entry.wouldBeVideo()) {
                }
            }
            if (!UserConfig.getInstance(StoriesController.this.currentAccount).isPremium()) {
            }
            if (this.edit) {
            }
            requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    StoriesController.UploadingStory.$r8$lambda$IafFf-R_l2LMoVw69bV3rF_QOfI(StoriesController.UploadingStory.this, tLObject, tL_error2);
                }
            };
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
            }
            this.currentRequest = ConnectionsManager.getInstance(StoriesController.this.currentAccount).sendRequest(tL_stories_sendStory, requestDelegate, 64);
        }

        public static /* synthetic */ void $r8$lambda$IafFf-R_l2LMoVw69bV3rF_QOfI(final UploadingStory uploadingStory, TLObject tLObject, final TLRPC.TL_error tL_error) {
            Utilities.Callback callback;
            uploadingStory.getClass();
            if (tLObject instanceof TLRPC.Updates) {
                uploadingStory.failed = false;
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (uploadingStory.entry.isEditingCover) {
                    MessagesController.getInstance(StoriesController.this.currentAccount).processUpdates(updates, false);
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            StoriesController.UploadingStory.this.cleanup();
                        }
                    });
                    return;
                }
                final TL_stories.StoryItem storyItem = null;
                int i = 0;
                for (int i2 = 0; i2 < updates.updates.size(); i2++) {
                    if (updates.updates.get(i2) instanceof TL_stories.TL_updateStory) {
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates.updates.get(i2)).story;
                        storyItem2.attachPath = uploadingStory.path;
                        storyItem2.firstFramePath = uploadingStory.firstFramePath;
                        storyItem2.justUploaded = !uploadingStory.edit;
                        int i3 = storyItem2.id;
                        if (storyItem == null) {
                            storyItem = storyItem2;
                        } else {
                            storyItem.media = storyItem2.media;
                        }
                        i = i3;
                    }
                    if (updates.updates.get(i2) instanceof TL_update.TL_updateStoryID) {
                        TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) updates.updates.get(i2);
                        if (storyItem == null) {
                            storyItem = new TL_stories.TL_storyItem();
                            int currentTime = ConnectionsManager.getInstance(StoriesController.this.currentAccount).getCurrentTime();
                            storyItem.date = currentTime;
                            StoryEntry storyEntry = uploadingStory.entry;
                            int i4 = storyEntry.period;
                            if (i4 == Integer.MAX_VALUE) {
                                i4 = 86400;
                            }
                            storyItem.expire_date = currentTime + i4;
                            storyItem.parsedPrivacy = null;
                            storyItem.privacy = StoryPrivacyBottomSheet.StoryPrivacy.toOutput(storyEntry.privacyRules);
                            storyItem.pinned = uploadingStory.entry.period == Integer.MAX_VALUE;
                            storyItem.dialogId = UserConfig.getInstance(StoriesController.this.currentAccount).clientUserId;
                            storyItem.attachPath = uploadingStory.path;
                            storyItem.firstFramePath = uploadingStory.firstFramePath;
                            storyItem.id = tL_updateStoryID.id;
                            storyItem.justUploaded = !uploadingStory.edit;
                        }
                    }
                }
                final long j = uploadingStory.dialogId;
                if (uploadingStory.canceled) {
                    TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                    TLRPC.InputPeer inputPeer = MessagesController.getInstance(StoriesController.this.currentAccount).getInputPeer(uploadingStory.dialogId);
                    tL_stories_deleteStories.peer = inputPeer;
                    if (inputPeer != null) {
                        tL_stories_deleteStories.id.add(Integer.valueOf(i));
                        ConnectionsManager.getInstance(StoriesController.this.currentAccount).sendRequest(tL_stories_deleteStories, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda2
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda31(StoriesController.this));
                            }
                        });
                    }
                } else {
                    if ((i == 0 || uploadingStory.edit) && storyItem != null) {
                        final TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                        tL_updateStory.peer = MessagesController.getInstance(StoriesController.this.currentAccount).getPeer(j);
                        tL_updateStory.story = storyItem;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                MessagesController.getInstance(StoriesController.this.currentAccount).getStoriesController().processUpdate(tL_updateStory);
                            }
                        });
                    }
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia != null && storyItem.attachPath != null) {
                        if (messageMedia.document != null) {
                            FileLoader.getInstance(StoriesController.this.currentAccount).setLocalPathTo(storyItem.media.document, storyItem.attachPath);
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                FileLoader.getInstance(StoriesController.this.currentAccount).setLocalPathTo(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID), storyItem.attachPath);
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            StoriesController.UploadingStory.$r8$lambda$7Z8jxAox56gy7p7EFz-Org-6Vjw(StoriesController.UploadingStory.this, j, storyItem);
                        }
                    });
                    MessagesController.getInstance(StoriesController.this.currentAccount).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                }
            } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                uploadingStory.previewMedia = (TL_bots.botPreviewMedia) tLObject;
            } else {
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
                    StoryEntry storyEntry2 = uploadingStory.entry;
                    if (storyEntry2.editingCoverDocument != null && (callback = storyEntry2.updateDocumentRef) != null) {
                        callback.run(new Utilities.Callback() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda5
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj) {
                                StoriesController.UploadingStory.$r8$lambda$QWT3iCam8anmYJxatO4t0H1HaJo(StoriesController.UploadingStory.this, (TLRPC.Document) obj);
                            }
                        });
                        uploadingStory.entry.updateDocumentRef = null;
                        return;
                    }
                }
                if (tL_error != null && !uploadingStory.edit) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            StoriesController.UploadingStory.$r8$lambda$oQ6zzh5n3WypuEm-R-fWcCzaFis(StoriesController.UploadingStory.this, tL_error);
                        }
                    });
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$UploadingStory$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.UploadingStory.this.cleanup();
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$7Z8jxAox56gy7p7EFz-Org-6Vjw(UploadingStory uploadingStory, long j, TL_stories.StoryItem storyItem) {
            uploadingStory.entryDestroyed = true;
            if (uploadingStory.entry.isError) {
                StoriesController.this.getDraftsController().delete(uploadingStory.entry);
            }
            StoryEntry storyEntry = uploadingStory.entry;
            storyEntry.isError = false;
            storyEntry.error = null;
            if (!storyEntry.isEditingCover) {
                StoriesController.this.getDraftsController().saveForEdit(uploadingStory.entry, j, storyItem);
            }
            if (uploadingStory.edit) {
                return;
            }
            StoriesController.this.invalidateStoryLimit();
        }

        public static /* synthetic */ void $r8$lambda$QWT3iCam8anmYJxatO4t0H1HaJo(UploadingStory uploadingStory, TLRPC.Document document) {
            uploadingStory.entry.editingCoverDocument = document;
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(uploadingStory.entry.editingCoverDocument);
            uploadingStory.sendUploadedRequest(tL_inputFileStoryDocument);
        }

        public static /* synthetic */ void $r8$lambda$oQ6zzh5n3WypuEm-R-fWcCzaFis(UploadingStory uploadingStory, TLRPC.TL_error tL_error) {
            uploadingStory.entry.isError = true;
            if (StoriesController.this.checkStoryError(tL_error)) {
                uploadingStory.entry.error = null;
            } else {
                uploadingStory.entry.error = tL_error;
            }
            uploadingStory.entryDestroyed = true;
            uploadingStory.failed = true;
            uploadingStory.hadFailed = true;
            StoriesController.this.getDraftsController().edit(uploadingStory.entry);
        }

        private void putMessages() {
            ArrayList<TLRPC.MessageEntity> arrayList;
            int i = 0;
            ArrayList arrayList2 = this.entry.shareUserIds;
            if (arrayList2 == null || this.putMessages) {
                return;
            }
            int size = arrayList2.size();
            CharSequence charSequence = this.entry.caption;
            String charSequence2 = charSequence == null ? null : charSequence.toString();
            ArrayList<TLRPC.MessageEntity> entities = this.entry.caption != null ? MediaDataController.getInstance(StoriesController.this.currentAccount).getEntities(new CharSequence[]{this.entry.caption}, true) : null;
            while (i < size) {
                long longValue = ((Long) this.entry.shareUserIds.get(i)).longValue();
                if (this.entry.wouldBeVideo()) {
                    arrayList = entities;
                    SendMessagesHelper.prepareSendingVideo(AccountInstance.getInstance(StoriesController.this.currentAccount), this.path, null, null, null, longValue, null, null, null, null, arrayList, 0, null, !r4.silent, this.entry.scheduleDate, 0, false, false, charSequence2, null, 0L, 0L);
                } else {
                    String str = charSequence2;
                    SendMessagesHelper.prepareSendingPhoto(AccountInstance.getInstance(StoriesController.this.currentAccount), this.path, null, null, longValue, null, null, null, null, entities, null, null, 0, null, null, !r4.silent, this.entry.scheduleDate, 0, false, str, null, 0L, 0L);
                    arrayList = entities;
                    charSequence2 = str;
                }
                i++;
                entities = arrayList;
            }
            this.putMessages = true;
        }

        public void cancel() {
            if (this.failed) {
                StoriesController.this.getDraftsController().delete(this.entry);
                ((ArrayList) StoriesController.this.uploadingStoriesByDialogId.get(this.dialogId)).remove(this);
            }
            this.canceled = true;
            if (this.entry.wouldBeVideo()) {
                MediaController.getInstance().cancelVideoConvert(this.messageObject);
            }
            FileLoader.getInstance(StoriesController.this.currentAccount).cancelFileUpload(this.path, false);
            if (this.currentRequest >= 0) {
                ConnectionsManager.getInstance(StoriesController.this.currentAccount).cancelRequest(this.currentRequest, true);
            }
            cleanup();
        }

        public boolean isCloseFriends() {
            return this.isCloseFriends;
        }
    }

    public StoriesCollections getStoryAlbumsList(long j) {
        return getStoryAlbumsList(j, true);
    }

    private StoriesCollections getStoryAlbumsList(long j, boolean z) {
        StoriesCollections storiesCollections = (StoriesCollections) this.storiesCollections.get(j);
        if (storiesCollections != null || !z) {
            return storiesCollections;
        }
        LongSparseArray longSparseArray = this.storiesCollections;
        StoriesCollections storiesCollections2 = new StoriesCollections(this, this.currentAccount, j, (1) null);
        longSparseArray.put(j, storiesCollections2);
        return storiesCollections2;
    }

    public StoriesList getStoriesList(long j, int i) {
        return getStoriesList(j, i, -1, true);
    }

    public StoriesList getStoriesList(long j, int i, int i2) {
        return getStoriesList(j, i, i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StoriesList getStoriesList(long j, int i, boolean z) {
        return getStoriesList(j, i, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StoriesList getStoriesList(long j, int i, int i2, boolean z) {
        if (i == 0 && i2 > 0) {
            HashMap hashMap = (HashMap) this.storiesAlbumsLists.get(Long.valueOf(j));
            if (hashMap == null) {
                hashMap = new HashMap();
                this.storiesAlbumsLists.put(Long.valueOf(j), hashMap);
            }
            HashMap hashMap2 = hashMap;
            StoriesList storiesList = (StoriesList) hashMap2.get(Integer.valueOf(i2));
            if (storiesList != null || !z) {
                return storiesList;
            }
            StoriesList storiesList2 = new StoriesList(this.currentAccount, j, i, i2, new Utilities.Callback() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda12
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    StoriesController.this.destroyStoryList((StoriesController.StoriesList) obj);
                }
            }, null);
            hashMap2.put(Integer.valueOf(i2), storiesList2);
            return storiesList2;
        }
        HashMap[] hashMapArr = this.storiesLists;
        if (hashMapArr[i] == null) {
            hashMapArr[i] = new HashMap();
        }
        StoriesList storiesList3 = (StoriesList) this.storiesLists[i].get(Long.valueOf(j));
        if (storiesList3 != null || !z) {
            return storiesList3;
        }
        if (i == 4) {
            HashMap hashMap3 = this.storiesLists[i];
            Long valueOf = Long.valueOf(j);
            BotPreviewsList botPreviewsList = new BotPreviewsList(this.currentAccount, j, null, new Utilities.Callback() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda12
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    StoriesController.this.destroyStoryList((StoriesController.StoriesList) obj);
                }
            });
            hashMap3.put(valueOf, botPreviewsList);
            return botPreviewsList;
        }
        HashMap hashMap4 = this.storiesLists[i];
        Long valueOf2 = Long.valueOf(j);
        StoriesList storiesList4 = new StoriesList(this.currentAccount, j, i, i2, new Utilities.Callback() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda12
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StoriesController.this.destroyStoryList((StoriesController.StoriesList) obj);
            }
        }, null);
        hashMap4.put(valueOf2, storiesList4);
        return storiesList4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String storyItemIds(List list) {
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            try {
                if (i > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories.StoryItem) list.get(i)).id + "@" + ((TL_stories.StoryItem) list.get(i)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String storyItemMessageIds(List list) {
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            try {
                if (i > 0) {
                    str = str + ", ";
                }
                TL_stories.StoryItem storyItem = ((MessageObject) list.get(i)).storyItem;
                str = storyItem == null ? str + "null" : str + storyItem.id + "@" + storyItem.dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public void updateStoriesInLists(long j, List list) {
        updateStoriesInLists(j, list, false);
    }

    public void updateStoriesInLists(long j, List list, boolean z) {
        ArrayList arrayList;
        FileLog.d("updateStoriesInLists " + j + " storyItems[" + list.size() + "] {" + storyItemIds(list) + "}");
        int i = 0;
        StoriesList storiesList = getStoriesList(j, 0, false);
        StoriesList storiesList2 = getStoriesList(j, 1, false);
        if (storiesList != null) {
            storiesList.updateStories(list, z);
        }
        if (storiesList2 != null) {
            storiesList2.updateStories(list, z);
        }
        ArrayList arrayList2 = this.attachedSearchLists;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((SearchStoriesList) obj).updateStories(list, z);
        }
        StoriesCollections storyAlbumsList = getStoryAlbumsList(j, false);
        if (storyAlbumsList == null || (arrayList = storyAlbumsList.collections) == null) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            long j2 = j;
            StoriesList storiesList3 = getStoriesList(j2, 0, ((StoryAlbum) obj2).album_id, false);
            if (storiesList3 != null) {
                storiesList3.updateStories(list, z);
            }
            j = j2;
        }
    }

    public void updateDeletedStoriesInLists(long j, List list) {
        ArrayList arrayList;
        FileLog.d("updateDeletedStoriesInLists " + j + " storyItems[" + list.size() + "] {" + storyItemIds(list) + "}");
        int i = 0;
        StoriesList storiesList = getStoriesList(j, 0, false);
        StoriesList storiesList2 = getStoriesList(j, 1, false);
        if (storiesList != null) {
            storiesList.updateDeletedStories(list);
        }
        if (storiesList2 != null) {
            storiesList2.updateDeletedStories(list);
        }
        StoriesCollections storyAlbumsList = getStoryAlbumsList(j, false);
        if (storyAlbumsList == null || (arrayList = storyAlbumsList.collections) == null) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long j2 = j;
            StoriesList storiesList3 = getStoriesList(j2, 0, ((StoryAlbum) obj).album_id, false);
            if (storiesList3 != null) {
                storiesList3.updateDeletedStories(list);
            }
            j = j2;
        }
    }

    public void destroyStoryList(StoriesList storiesList) {
        int i = storiesList.type;
        if (i == 0 && storiesList.albumId > 0) {
            HashMap hashMap = (HashMap) this.storiesAlbumsLists.get(Long.valueOf(storiesList.dialogId));
            if (hashMap == null) {
                return;
            }
            hashMap.remove(Integer.valueOf(storiesList.albumId));
            if (hashMap.isEmpty()) {
                this.storiesAlbumsLists.remove(Long.valueOf(storiesList.dialogId));
                return;
            }
            return;
        }
        HashMap hashMap2 = this.storiesLists[i];
        if (hashMap2 != null) {
            hashMap2.remove(Long.valueOf(storiesList.dialogId));
        }
    }

    public static class BotPreview extends TL_stories.StoryItem {
        public final BotPreviewsList list;

        public BotPreview(BotPreviewsList botPreviewsList, long j, TL_bots.botPreviewMedia botpreviewmedia) {
            this.list = botPreviewsList;
            this.dialogId = j;
            TLRPC.MessageMedia messageMedia = botpreviewmedia.media;
            this.media = messageMedia;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                document.date = botpreviewmedia.date;
                return;
            }
            TLRPC.Photo photo = messageMedia.photo;
            if (photo != null) {
                photo.date = botpreviewmedia.date;
            }
        }
    }

    public static class BotPreviewsList extends StoriesList {
        private final ArrayList fakeDays;
        public final String lang_code;
        public final ArrayList lang_codes;
        private int lastId;
        private boolean loaded;
        private boolean loading;
        private int reqId;

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected void invalidateCache() {
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public boolean isOnlyCache() {
            return false;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected boolean markAsRead(int i) {
            return false;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected void preloadCache() {
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected void saveCache() {
        }

        public BotPreviewsList(int i, long j, String str, Utilities.Callback callback) {
            super(i, j, 4, -1, callback, null);
            this.lang_codes = new ArrayList();
            this.fakeDays = new ArrayList();
            this.lastId = 0;
            this.lang_code = str;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public boolean load(boolean z, int i, List list) {
            return loadInternal(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean loadInternal(final Runnable runnable) {
            TL_bots.getPreviewMedias getpreviewmedias;
            if (this.loading || this.loaded) {
                return false;
            }
            if (this.lang_code != null) {
                TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
                getpreviewinfo.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
                getpreviewinfo.lang_code = this.lang_code;
                getpreviewmedias = getpreviewinfo;
            } else {
                TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
                getpreviewmedias2.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
                getpreviewmedias = getpreviewmedias2;
            }
            this.loading = true;
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpreviewmedias, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$BotPreviewsList$$ExternalSyntheticLambda1
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesController.BotPreviewsList.$r8$lambda$iv1Iu95x_H6USURhSeIx2jQXLm0(StoriesController.BotPreviewsList.this, runnable, tLObject, tL_error);
                }
            });
            return true;
        }

        public static /* synthetic */ void $r8$lambda$iv1Iu95x_H6USURhSeIx2jQXLm0(final BotPreviewsList botPreviewsList, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
            botPreviewsList.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$BotPreviewsList$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.BotPreviewsList.$r8$lambda$EH-UlG18qTWDtUsWIZM9iNlxOEE(StoriesController.BotPreviewsList.this, tLObject, runnable);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$EH-UlG18qTWDtUsWIZM9iNlxOEE(BotPreviewsList botPreviewsList, TLObject tLObject, Runnable runnable) {
            MessageObject messageObject;
            int id;
            botPreviewsList.reqId = 0;
            botPreviewsList.loading = false;
            botPreviewsList.loaded = true;
            botPreviewsList.done = true;
            ArrayList arrayList = new ArrayList();
            if (tLObject instanceof Vector) {
                ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList.add((TL_bots.botPreviewMedia) obj);
                }
            } else {
                if (!(tLObject instanceof TL_bots.previewInfo)) {
                    return;
                }
                TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject;
                botPreviewsList.lang_codes.clear();
                botPreviewsList.lang_codes.addAll(previewinfo.lang_codes);
                arrayList.addAll(previewinfo.media);
            }
            ArrayList arrayList3 = new ArrayList(botPreviewsList.messageObjects);
            botPreviewsList.messageObjects.clear();
            botPreviewsList.fakeDays.clear();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                MessageObject messageObject2 = new MessageObject(botPreviewsList.currentAccount, new BotPreview(botPreviewsList, botPreviewsList.dialogId, botpreviewmedia));
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList3.size()) {
                        messageObject = null;
                        break;
                    } else {
                        if (MessagesController.equals(((MessageObject) arrayList3.get(i3)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList3.get(i3);
                            break;
                        }
                        i3++;
                    }
                }
                TL_stories.StoryItem storyItem = messageObject2.storyItem;
                TLRPC.Message message = messageObject2.messageOwner;
                if (messageObject == null) {
                    id = botPreviewsList.lastId;
                    botPreviewsList.lastId = id + 1;
                } else {
                    id = messageObject.getId();
                }
                message.id = id;
                storyItem.id = id;
                messageObject2.parentStoriesList = botPreviewsList;
                messageObject2.generateThumbs(false);
                if (botPreviewsList.fakeDays.isEmpty()) {
                    botPreviewsList.fakeDays.add(new ArrayList());
                }
                ((ArrayList) botPreviewsList.fakeDays.get(0)).add(Integer.valueOf(messageObject2.getId()));
                botPreviewsList.messageObjects.add(messageObject2);
            }
            AndroidUtilities.cancelRunOnUIThread(((StoriesList) botPreviewsList).notify);
            AndroidUtilities.runOnUIThread(((StoriesList) botPreviewsList).notify);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }

        public void push(TL_bots.botPreviewMedia botpreviewmedia) {
            MessageObject messageObject = new MessageObject(this.currentAccount, new BotPreview(this, this.dialogId, botpreviewmedia));
            TL_stories.StoryItem storyItem = messageObject.storyItem;
            TLRPC.Message message = messageObject.messageOwner;
            int i = this.lastId;
            this.lastId = i + 1;
            message.id = i;
            storyItem.id = i;
            messageObject.parentStoriesList = this;
            messageObject.generateThumbs(false);
            if (this.fakeDays.isEmpty()) {
                this.fakeDays.add(new ArrayList());
            }
            ((ArrayList) this.fakeDays.get(0)).add(0, Integer.valueOf(messageObject.getId()));
            this.messageObjects.add(0, messageObject);
            notifyUpdate();
        }

        public void edit(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
            MessageObject messageObject;
            int id;
            TL_stories.StoryItem storyItem;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Document document;
            int i = 0;
            while (true) {
                if (i >= this.messageObjects.size()) {
                    messageObject = null;
                    i = 0;
                    break;
                }
                messageObject = (MessageObject) this.messageObjects.get(i);
                if (inputMedia != null && (storyItem = messageObject.storyItem) != null && (messageMedia = storyItem.media) != null) {
                    if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.Photo photo = messageMedia.photo;
                        if (photo != null && photo.id == ((TLRPC.TL_inputMediaPhoto) inputMedia).id.id) {
                            break;
                        }
                    } else if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && (document = messageMedia.document) != null && document.id == ((TLRPC.TL_inputMediaDocument) inputMedia).id.id) {
                        break;
                    }
                }
                i++;
            }
            if (messageObject != null) {
                this.messageObjects.remove(messageObject);
                if (this.fakeDays.isEmpty()) {
                    this.fakeDays.add(new ArrayList());
                }
                if (i > 0 && i < ((ArrayList) this.fakeDays.get(0)).size()) {
                    ((ArrayList) this.fakeDays.get(0)).remove(i);
                }
            }
            MessageObject messageObject2 = new MessageObject(this.currentAccount, new BotPreview(this, this.dialogId, botpreviewmedia));
            TL_stories.StoryItem storyItem2 = messageObject2.storyItem;
            TLRPC.Message message = messageObject2.messageOwner;
            if (messageObject == null) {
                id = this.lastId;
                this.lastId = id + 1;
            } else {
                id = messageObject.getId();
            }
            message.id = id;
            storyItem2.id = id;
            messageObject2.parentStoriesList = this;
            messageObject2.generateThumbs(false);
            if (this.fakeDays.isEmpty()) {
                this.fakeDays.add(new ArrayList());
            }
            ((ArrayList) this.fakeDays.get(0)).add(i, Integer.valueOf(messageObject2.getId()));
            this.messageObjects.add(i, messageObject2);
            notifyUpdate();
        }

        public void notifyUpdate() {
            AndroidUtilities.cancelRunOnUIThread(((StoriesList) this).notify);
            AndroidUtilities.runOnUIThread(((StoriesList) this).notify);
        }

        public void reload(Runnable runnable) {
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            this.loading = false;
            this.loaded = false;
            loadInternal(runnable);
        }

        public void requestReference(final BotPreview botPreview, final Utilities.Callback callback) {
            reload(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$BotPreviewsList$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.BotPreviewsList.$r8$lambda$61SkrtUP88OMRioHNLk_KP1lINQ(StoriesController.BotPreviewsList.this, botPreview, callback);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$61SkrtUP88OMRioHNLk_KP1lINQ(BotPreviewsList botPreviewsList, BotPreview botPreview, Utilities.Callback callback) {
            TL_stories.StoryItem storyItem;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Photo photo;
            for (int i = 0; i < botPreviewsList.messageObjects.size(); i++) {
                MessageObject messageObject = (MessageObject) botPreviewsList.messageObjects.get(i);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null && (messageMedia = storyItem.media) != null) {
                    TLRPC.MessageMedia messageMedia2 = botPreview.media;
                    TLRPC.Document document = messageMedia2.document;
                    if (document != null) {
                        TLRPC.Document document2 = messageMedia.document;
                        if (document2 == null) {
                            continue;
                        } else if (document2.id == document.id) {
                            callback.run((BotPreview) storyItem);
                            return;
                        }
                    }
                    TLRPC.Photo photo2 = messageMedia2.photo;
                    if (photo2 != null && (photo = messageMedia.photo) != null && photo.id == photo2.id) {
                        callback.run((BotPreview) storyItem);
                        return;
                    }
                }
            }
            callback.run(null);
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public int getCount() {
            return this.messageObjects.size();
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public int getLoadedCount() {
            return this.messageObjects.size();
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public boolean isLoading() {
            return this.loading;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected ArrayList getDays() {
            return this.fakeDays;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public MessageObject findMessageObject(int i) {
            for (int i2 = 0; i2 < this.messageObjects.size(); i2++) {
                if (((MessageObject) this.messageObjects.get(i2)).getId() == i) {
                    return (MessageObject) this.messageObjects.get(i2);
                }
            }
            return null;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public void updatePinnedOrder(ArrayList arrayList, boolean z) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
            reorderpreviewmedias.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
            reorderpreviewmedias.lang_code = this.lang_code;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Integer num = (Integer) obj;
                MessageObject findMessageObject = findMessageObject(num.intValue());
                if (findMessageObject != null) {
                    reorderpreviewmedias.order.add(MessagesController.toInputMedia(findMessageObject.storyItem.media));
                    arrayList2.add(findMessageObject);
                    arrayList3.add(num);
                }
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(reorderpreviewmedias, null);
            if (this.fakeDays.isEmpty()) {
                this.fakeDays.add(new ArrayList());
            }
            ((ArrayList) this.fakeDays.get(0)).clear();
            ((ArrayList) this.fakeDays.get(0)).addAll(arrayList3);
            this.messageObjects.clear();
            this.messageObjects.addAll(arrayList2);
        }

        public void delete(ArrayList arrayList) {
            if (arrayList == null) {
                return;
            }
            int i = 0;
            while (i < this.messageObjects.size()) {
                MessageObject messageObject = (MessageObject) this.messageObjects.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (MessagesController.equals(messageObject.storyItem.media, (TLRPC.MessageMedia) arrayList.get(i2))) {
                        this.messageObjects.remove(i);
                        if (!this.fakeDays.isEmpty() && messageObject.getId() < ((ArrayList) this.fakeDays.get(0)).size()) {
                            ((ArrayList) this.fakeDays.get(0)).remove(messageObject.getId());
                        }
                        i--;
                    } else {
                        i2++;
                    }
                }
                i++;
            }
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            deletepreviewmedia.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                deletepreviewmedia.media.add(MessagesController.toInputMedia((TLRPC.MessageMedia) arrayList.get(i3)));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletepreviewmedia, null);
            AndroidUtilities.cancelRunOnUIThread(((StoriesList) this).notify);
            AndroidUtilities.runOnUIThread(((StoriesList) this).notify);
        }

        public void delete(TLRPC.MessageMedia messageMedia) {
            delete(new ArrayList(Arrays.asList(messageMedia)));
        }
    }

    public static class SearchStoriesList extends StoriesList {
        private int count;
        private final ArrayList fakeDays;
        private String last_offset;
        private boolean loading;
        public final String query;
        public final TL_stories.MediaArea queryArea;
        private int reqId;
        public final String username;

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected void invalidateCache() {
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public boolean isOnlyCache() {
            return false;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected boolean markAsRead(int i) {
            return false;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected void preloadCache() {
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected void saveCache() {
        }

        public SearchStoriesList(int i, String str, String str2) {
            super(i, 0L, 3, -1, null, null);
            this.fakeDays = new ArrayList();
            this.last_offset = "";
            this.query = str2;
            this.username = str;
            this.queryArea = null;
        }

        public SearchStoriesList(int i, TL_stories.MediaArea mediaArea) {
            super(i, 0L, 3, -1, null, null);
            this.fakeDays = new ArrayList();
            this.last_offset = "";
            this.query = null;
            this.username = null;
            this.queryArea = mediaArea;
        }

        public void cancel() {
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public boolean load(final boolean z, final int i, final List list) {
            TLObject tLObject;
            if (this.loading || this.last_offset == null) {
                return false;
            }
            TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
            tL_stories_searchPosts.offset = this.last_offset;
            tL_stories_searchPosts.limit = i;
            String str = this.query;
            if (str != null) {
                tL_stories_searchPosts.flags |= 1;
                tL_stories_searchPosts.hashtag = str;
            }
            TL_stories.MediaArea mediaArea = this.queryArea;
            if (mediaArea != null) {
                tL_stories_searchPosts.flags |= 2;
                tL_stories_searchPosts.area = mediaArea;
            }
            this.loading = true;
            if (TextUtils.isEmpty(this.username)) {
                tLObject = null;
            } else {
                tLObject = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.username);
                if (tLObject == null) {
                    MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(this.username, new Consumer() { // from class: org.telegram.ui.Stories.StoriesController$SearchStoriesList$$ExternalSyntheticLambda0
                        @Override // com.google.android.exoplayer2.util.Consumer
                        public final void accept(Object obj) {
                            StoriesController.SearchStoriesList.$r8$lambda$IO3bqlxrM-rYAcEXzZw18nR5Y7o(StoriesController.SearchStoriesList.this, z, i, list, (Long) obj);
                        }
                    });
                    return true;
                }
            }
            if (tLObject != null) {
                tL_stories_searchPosts.flags |= 4;
                tL_stories_searchPosts.peer = MessagesController.getInputPeer(tLObject);
            }
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_searchPosts, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$SearchStoriesList$$ExternalSyntheticLambda1
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    StoriesController.SearchStoriesList.$r8$lambda$YvByloQGoDwS4TX8-0j4fdXbCVQ(StoriesController.SearchStoriesList.this, tLObject2, tL_error);
                }
            });
            return true;
        }

        public static /* synthetic */ void $r8$lambda$IO3bqlxrM-rYAcEXzZw18nR5Y7o(SearchStoriesList searchStoriesList, boolean z, int i, List list, Long l) {
            TLObject userOrChat = MessagesController.getInstance(searchStoriesList.currentAccount).getUserOrChat(searchStoriesList.username);
            searchStoriesList.loading = false;
            if (userOrChat != null) {
                searchStoriesList.load(z, i, list);
                return;
            }
            searchStoriesList.count = 0;
            searchStoriesList.last_offset = "";
            AndroidUtilities.cancelRunOnUIThread(((StoriesList) searchStoriesList).notify);
            AndroidUtilities.runOnUIThread(((StoriesList) searchStoriesList).notify);
        }

        public static /* synthetic */ void $r8$lambda$YvByloQGoDwS4TX8-0j4fdXbCVQ(final SearchStoriesList searchStoriesList, final TLObject tLObject, TLRPC.TL_error tL_error) {
            searchStoriesList.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$SearchStoriesList$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.SearchStoriesList.$r8$lambda$uUicIc1fAHeCR3qQtCfRMx0FvQM(StoriesController.SearchStoriesList.this, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$uUicIc1fAHeCR3qQtCfRMx0FvQM(SearchStoriesList searchStoriesList, TLObject tLObject) {
            searchStoriesList.reqId = 0;
            if (tLObject instanceof TL_stories.TL_foundStories) {
                TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                MessagesController.getInstance(searchStoriesList.currentAccount).putUsers(tL_foundStories.users, false);
                MessagesController.getInstance(searchStoriesList.currentAccount).putChats(tL_foundStories.chats, false);
                ArrayList<TL_stories.TL_foundStory> arrayList = tL_foundStories.stories;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TL_stories.TL_foundStory tL_foundStory = arrayList.get(i);
                    i++;
                    TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                    tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                    tL_foundStory2.storyItem.messageId = searchStoriesList.messageObjects.size();
                    MessageObject messageObject = new MessageObject(searchStoriesList.currentAccount, tL_foundStory2.storyItem);
                    messageObject.generateThumbs(false);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(searchStoriesList.messageObjects.size()));
                    searchStoriesList.fakeDays.add(arrayList2);
                    searchStoriesList.messageObjects.add(messageObject);
                }
                searchStoriesList.count = Math.max(searchStoriesList.messageObjects.size(), tL_foundStories.count);
                if (tL_foundStories.stories.isEmpty()) {
                    searchStoriesList.count = searchStoriesList.messageObjects.size();
                }
                searchStoriesList.last_offset = (searchStoriesList.messageObjects.size() >= tL_foundStories.count || tL_foundStories.stories.isEmpty()) ? null : tL_foundStories.next_offset;
                searchStoriesList.loading = false;
                AndroidUtilities.cancelRunOnUIThread(((StoriesList) searchStoriesList).notify);
                AndroidUtilities.runOnUIThread(((StoriesList) searchStoriesList).notify);
            }
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public int getCount() {
            return this.count;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public int getLoadedCount() {
            return this.messageObjects.size();
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public boolean isLoading() {
            return this.loading;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected ArrayList getDays() {
            return this.fakeDays;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public MessageObject findMessageObject(int i) {
            if (i < 0 || i >= this.messageObjects.size()) {
                return null;
            }
            return (MessageObject) this.messageObjects.get(i);
        }
    }

    public static class StoryRepostsList extends StoriesList {
        private final ArrayList fakeDays;

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected void invalidateCache() {
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public boolean isLoading() {
            return false;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public boolean isOnlyCache() {
            return false;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public boolean load(boolean z, int i, List list) {
            return false;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected boolean markAsRead(int i) {
            return false;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected void preloadCache() {
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected void saveCache() {
        }

        public StoryRepostsList(int i, ArrayList arrayList) {
            super(i, 0L, 3, -1, null, null);
            this.fakeDays = new ArrayList();
            append(arrayList);
        }

        public int append(ArrayList arrayList) {
            if (arrayList == null) {
                return -1;
            }
            int size = this.messageObjects.size();
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
                if (storyItem != null) {
                    storyItem.messageId = this.messageObjects.size();
                    MessageObject messageObject = new MessageObject(this.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(this.messageObjects.size()));
                    this.fakeDays.add(arrayList2);
                    this.messageObjects.add(messageObject);
                    i++;
                }
            }
            if (i > 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesListUpdated, this);
            }
            return size;
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public int getCount() {
            return this.messageObjects.size();
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public int getLoadedCount() {
            return this.messageObjects.size();
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        protected ArrayList getDays() {
            return new ArrayList(this.fakeDays);
        }

        @Override // org.telegram.ui.Stories.StoriesController.StoriesList
        public MessageObject findMessageObject(int i) {
            if (i < 0 || i >= this.messageObjects.size()) {
                return null;
            }
            return (MessageObject) this.messageObjects.get(i);
        }
    }

    public static class StoriesList {
        private static HashMap lastLoadTime;
        public final int albumId;
        private final Set cachedObjects;
        public final int currentAccount;
        private final Runnable destroyRunnable;
        public final long dialogId;
        public boolean done;
        private boolean error;
        public final HashMap groupedByDay;
        private boolean invalidateAfterPreload;
        private final ArrayList links;
        private final Set loadedObjects;
        private boolean loading;
        private int maxLinkId;
        public final ArrayList messageObjects;
        private final HashMap messageObjectsMap;
        private final Runnable notify;
        public final ArrayList pinnedIds;
        protected boolean preloading;
        private int reqId;
        private boolean saving;
        public final HashSet seenStories;
        private boolean showPhotos;
        private boolean showVideos;
        private final ArrayList tempArr;
        protected Utilities.CallbackReturn toLoad;
        private int totalCount;
        public final int type;

        public static /* synthetic */ void $r8$lambda$I2mzpsXgJt70KibSxQrcG7HZlLs() {
        }

        public static /* synthetic */ void $r8$lambda$gJ3kJ5LzpL6UzbdwoosGHx6lf3E() {
        }

        public static /* synthetic */ void $r8$lambda$wPVWlmQxR7Fe-aHAIEf-7YfYwlM(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        /* synthetic */ StoriesList(int i, long j, int i2, int i3, Utilities.Callback callback, 1 r7) {
            this(i, j, i2, i3, callback);
        }

        public int link() {
            int i = this.maxLinkId;
            this.maxLinkId = i + 1;
            this.links.add(Integer.valueOf(i));
            Runnable runnable = this.destroyRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            return i;
        }

        public void unlink(int i) {
            Runnable runnable;
            this.links.remove(Integer.valueOf(i));
            if (!this.links.isEmpty() || (runnable = this.destroyRunnable) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(this.destroyRunnable, 300000L);
        }

        public void updateFilters(boolean z, boolean z2) {
            this.showPhotos = z;
            this.showVideos = z2;
            fill(true);
        }

        public boolean isOnlyCache() {
            return this.loadedObjects.isEmpty() && canLoad();
        }

        public boolean showPhotos() {
            return this.showPhotos;
        }

        public boolean showVideos() {
            return this.showVideos;
        }

        public void fill(boolean z) {
            fill(this.messageObjects, this.showPhotos, this.showVideos);
            if (z) {
                AndroidUtilities.cancelRunOnUIThread(this.notify);
                AndroidUtilities.runOnUIThread(this.notify);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x00b5, code lost:
        
            if (r4 >= r2) goto L73;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void fill(ArrayList arrayList, boolean z, boolean z2) {
            this.tempArr.clear();
            if (this.type == 0 && this.albumId <= 0) {
                ArrayList arrayList2 = this.pinnedIds;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    Integer num = (Integer) obj;
                    num.getClass();
                    MessageObject messageObject = (MessageObject) this.messageObjectsMap.get(num);
                    if (filter(messageObject, z, z2)) {
                        this.tempArr.add(messageObject);
                    }
                }
            }
            int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (Integer num2 : this.loadedObjects) {
                int intValue = num2.intValue();
                MessageObject messageObject2 = (MessageObject) this.messageObjectsMap.get(num2);
                if (this.type != 0 || this.albumId > 0 || !this.pinnedIds.contains(num2)) {
                    if (filter(messageObject2, z, z2)) {
                        this.tempArr.add(messageObject2);
                    }
                    if (intValue < i2) {
                        i2 = intValue;
                    }
                }
            }
            if (!this.done) {
                Iterator it = this.cachedObjects.iterator();
                while (it.hasNext() && (this.totalCount == -1 || this.tempArr.size() < this.totalCount)) {
                    Integer num3 = (Integer) it.next();
                    int intValue2 = num3.intValue();
                    if (this.type != 0 || this.albumId > 0 || !this.pinnedIds.contains(num3)) {
                        MessageObject messageObject3 = (MessageObject) this.messageObjectsMap.get(num3);
                        if (filter(messageObject3, z, z2)) {
                            this.tempArr.add(messageObject3);
                        }
                    }
                }
            }
            arrayList.clear();
            arrayList.addAll(this.tempArr);
        }

        private boolean filter(MessageObject messageObject, boolean z, boolean z2) {
            if (messageObject == null || !messageObject.isStory()) {
                return false;
            }
            if (z && messageObject.isPhoto()) {
                return true;
            }
            return (z2 && messageObject.isVideo()) || (messageObject.storyItem.media instanceof TLRPC.TL_messageMediaUnsupported);
        }

        private StoriesList(int i, long j, int i2, int i3, final Utilities.Callback callback) {
            this.maxLinkId = 0;
            this.links = new ArrayList();
            this.pinnedIds = new ArrayList();
            this.groupedByDay = new HashMap();
            this.messageObjects = new ArrayList();
            this.messageObjectsMap = new HashMap();
            this.seenStories = new HashSet();
            this.showPhotos = true;
            this.showVideos = true;
            this.tempArr = new ArrayList();
            this.notify = new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationCenter.getInstance(r0.currentAccount).postNotificationName(NotificationCenter.storiesListUpdated, StoriesController.StoriesList.this);
                }
            };
            this.totalCount = -1;
            this.reqId = -1;
            this.currentAccount = i;
            this.dialogId = j;
            this.type = i2;
            this.albumId = i3;
            this.destroyRunnable = new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesList.$r8$lambda$JA_fVTBVMIcY5AU-96-ne5zKVbs(StoriesController.StoriesList.this, callback);
                }
            };
            if (i2 == 0 && i3 > 0) {
                this.cachedObjects = new LinkedHashSet();
                this.loadedObjects = new LinkedHashSet();
            } else {
                this.cachedObjects = new TreeSet(Comparator$-CC.reverseOrder());
                this.loadedObjects = new TreeSet(Comparator$-CC.reverseOrder());
            }
            preloadCache();
        }

        public static /* synthetic */ void $r8$lambda$JA_fVTBVMIcY5AU-96-ne5zKVbs(StoriesList storiesList, Utilities.Callback callback) {
            storiesList.getClass();
            callback.run(storiesList);
        }

        protected void preloadCache() {
            if (this.preloading || this.loading || this.error) {
                return;
            }
            this.preloading = true;
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesList.$r8$lambda$sltJ-ojAx9M9o1O0Vy1GEBXIgZM(StoriesController.StoriesList.this, messagesStorage);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$sltJ-ojAx9M9o1O0Vy1GEBXIgZM(final StoriesList storiesList, MessagesStorage messagesStorage) {
            NativeByteBuffer nativeByteBuffer;
            TLRPC.Peer peer;
            StoriesList storiesList2 = storiesList;
            storiesList2.getClass();
            final ArrayList arrayList = new ArrayList();
            final HashSet hashSet = new HashSet();
            HashSet<Long> hashSet2 = new HashSet<>();
            HashSet hashSet3 = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
            final ArrayList<TLRPC.Chat> arrayList4 = new ArrayList<>();
            SQLiteCursor sQLiteCursor = null;
            try {
                messagesStorage.getDatabase();
                sQLiteCursor = messagesStorage.createLoadStoriesCursor(storiesList2.dialogId, storiesList2.albumId, storiesList2.type);
                while (sQLiteCursor.next()) {
                    int i = 0;
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        TLdeserialize.dialogId = storiesList2.dialogId;
                        TLdeserialize.messageId = TLdeserialize.id;
                        MessageObject messageObject = new MessageObject(storiesList2.currentAccount, TLdeserialize);
                        ArrayList<TLRPC.PrivacyRule> arrayList5 = TLdeserialize.privacy;
                        int size = arrayList5.size();
                        while (i < size) {
                            TLRPC.PrivacyRule privacyRule = arrayList5.get(i);
                            int i2 = i + 1;
                            TLRPC.PrivacyRule privacyRule2 = privacyRule;
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                                hashSet2.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                                hashSet2.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                            }
                            i = i2;
                        }
                        TL_stories.StoryFwdHeader storyFwdHeader = TLdeserialize.fwd_from;
                        if (storyFwdHeader == null || (peer = storyFwdHeader.from) == null) {
                            nativeByteBuffer = byteBufferValue;
                        } else {
                            nativeByteBuffer = byteBufferValue;
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            if (peerDialogId >= 0) {
                                hashSet2.add(Long.valueOf(peerDialogId));
                            } else {
                                hashSet3.add(Long.valueOf(-peerDialogId));
                            }
                        }
                        for (int i3 = 0; i3 < TLdeserialize.media_areas.size(); i3++) {
                            if (TLdeserialize.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                hashSet3.add(Long.valueOf(((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i3)).channel_id));
                            }
                        }
                        TLRPC.Peer peer2 = TLdeserialize.from_id;
                        if (peer2 != null) {
                            long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                            if (peerDialogId2 >= 0) {
                                hashSet2.add(Long.valueOf(peerDialogId2));
                            } else {
                                hashSet3.add(Long.valueOf(-peerDialogId2));
                            }
                        }
                        messageObject.generateThumbs(false);
                        arrayList2.add(messageObject);
                        nativeByteBuffer.reuse();
                        if (sQLiteCursor.intValue(1) == 1) {
                            hashSet.add(Integer.valueOf(TLdeserialize.id));
                        }
                        int intValue = sQLiteCursor.intValue(2);
                        if (intValue > 0) {
                            arrayList.add(Utilities.clamp(intValue, arrayList.size() - 1, 0), Integer.valueOf(TLdeserialize.id));
                        }
                    }
                    storiesList2 = storiesList;
                }
                sQLiteCursor.dispose();
                if (!hashSet2.isEmpty()) {
                    messagesStorage.getUsersInternal(hashSet2, arrayList3);
                }
                if (!hashSet3.isEmpty()) {
                    messagesStorage.getChatsInternal(TextUtils.join(",", hashSet3), arrayList4);
                }
            } catch (Throwable th) {
                try {
                    messagesStorage.checkSQLException(th);
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesList.$r8$lambda$61D73H49geQLI6NRV29e2Z1lT14(StoriesController.StoriesList.this, arrayList2, arrayList, arrayList3, arrayList4, hashSet);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$61D73H49geQLI6NRV29e2Z1lT14(StoriesList storiesList, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet) {
            storiesList.getClass();
            FileLog.d("StoriesList " + storiesList.type + "{" + storiesList.dialogId + "} preloadCache {" + StoriesController.storyItemMessageIds(arrayList) + "}");
            storiesList.pinnedIds.clear();
            storiesList.pinnedIds.addAll(arrayList2);
            storiesList.preloading = false;
            MessagesController.getInstance(storiesList.currentAccount).putUsers(arrayList3, true);
            MessagesController.getInstance(storiesList.currentAccount).putChats(arrayList4, true);
            if (storiesList.invalidateAfterPreload) {
                storiesList.invalidateAfterPreload = false;
                storiesList.toLoad = null;
                storiesList.invalidateCache();
                return;
            }
            storiesList.seenStories.addAll(hashSet);
            storiesList.cachedObjects.clear();
            for (int i = 0; i < arrayList.size(); i++) {
                storiesList.pushObject((MessageObject) arrayList.get(i), true);
            }
            storiesList.fill(false);
            Utilities.CallbackReturn callbackReturn = storiesList.toLoad;
            if (callbackReturn != null) {
                callbackReturn.run(0);
                storiesList.toLoad = null;
            }
            NotificationCenter.getInstance(storiesList.currentAccount).postNotificationName(NotificationCenter.storiesListUpdated, storiesList);
        }

        private void pushObject(MessageObject messageObject, boolean z) {
            if (messageObject == null) {
                return;
            }
            this.messageObjectsMap.put(Integer.valueOf(messageObject.getId()), messageObject);
            (z ? this.cachedObjects : this.loadedObjects).add(Integer.valueOf(messageObject.getId()));
            long day = day(messageObject);
            TreeSet treeSet = (TreeSet) this.groupedByDay.get(Long.valueOf(day));
            if (treeSet == null) {
                HashMap hashMap = this.groupedByDay;
                Long valueOf = Long.valueOf(day);
                TreeSet treeSet2 = new TreeSet(Comparator$-CC.reverseOrder());
                hashMap.put(valueOf, treeSet2);
                treeSet = treeSet2;
            }
            treeSet.add(Integer.valueOf(messageObject.getId()));
        }

        private boolean removeObject(int i, boolean z) {
            MessageObject messageObject = (MessageObject) this.messageObjectsMap.remove(Integer.valueOf(i));
            if (z) {
                this.cachedObjects.remove(Integer.valueOf(i));
            }
            this.loadedObjects.remove(Integer.valueOf(i));
            this.pinnedIds.remove(Integer.valueOf(i));
            if (messageObject == null) {
                return false;
            }
            long day = day(messageObject);
            Collection collection = (Collection) this.groupedByDay.get(Long.valueOf(day));
            if (collection == null) {
                return true;
            }
            collection.remove(Integer.valueOf(i));
            if (!collection.isEmpty()) {
                return true;
            }
            this.groupedByDay.remove(Long.valueOf(day));
            return true;
        }

        public static long day(MessageObject messageObject) {
            if (messageObject == null) {
                return 0L;
            }
            long j = messageObject.messageOwner.date;
            Calendar.getInstance().setTimeInMillis(j * 1000);
            return (r6.get(1) * 10000) + (r6.get(2) * 100) + r6.get(5);
        }

        protected ArrayList getDays() {
            ArrayList arrayList = new ArrayList(this.groupedByDay.keySet());
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return StoriesController.StoriesList.$r8$lambda$p509TyV4xK3Z7-Fg5n4CU4UIas8((Long) obj, (Long) obj2);
                }
            });
            ArrayList arrayList2 = new ArrayList();
            int i = this.type;
            int i2 = 0;
            if (i == 0 && this.albumId > 0) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = this.messageObjects;
                int size = arrayList4.size();
                while (i2 < size) {
                    Object obj = arrayList4.get(i2);
                    i2++;
                    arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.id));
                }
                arrayList2.add(arrayList3);
                return arrayList2;
            }
            if (i == 0 && !this.pinnedIds.isEmpty()) {
                arrayList2.add(new ArrayList(this.pinnedIds));
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                TreeSet treeSet = (TreeSet) this.groupedByDay.get((Long) obj2);
                if (treeSet != null) {
                    ArrayList arrayList5 = new ArrayList(treeSet);
                    if (this.type == 0 && !this.pinnedIds.isEmpty()) {
                        ArrayList arrayList6 = this.pinnedIds;
                        int size3 = arrayList6.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Object obj3 = arrayList6.get(i4);
                            i4++;
                            Integer num = (Integer) obj3;
                            num.getClass();
                            arrayList5.remove(num);
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        arrayList2.add(arrayList5);
                    }
                }
            }
            return arrayList2;
        }

        public static /* synthetic */ int $r8$lambda$p509TyV4xK3Z7-Fg5n4CU4UIas8(Long l, Long l2) {
            return (int) (l2.longValue() - l.longValue());
        }

        protected void invalidateCache() {
            if (this.preloading) {
                this.invalidateAfterPreload = true;
                return;
            }
            resetCanLoad();
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesList.$r8$lambda$OvFE7x-vB7HKZttVO-pHveMD5vw(StoriesController.StoriesList.this, messagesStorage);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$OvFE7x-vB7HKZttVO-pHveMD5vw(final StoriesList storiesList, MessagesStorage messagesStorage) {
            storiesList.getClass();
            try {
                messagesStorage.getDatabase().executeFast(String.format(Locale.US, "DELETE FROM profile_stories WHERE dialog_id = %d AND type = %d", Long.valueOf(storiesList.dialogId), Integer.valueOf(storiesList.type))).stepThis().dispose();
            } catch (Throwable th) {
                messagesStorage.checkSQLException(th);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesList.$r8$lambda$Brr_vBTuG31kTGjk8LtP8mCOKb4(StoriesController.StoriesList.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$Brr_vBTuG31kTGjk8LtP8mCOKb4(StoriesList storiesList) {
            storiesList.cachedObjects.clear();
            storiesList.fill(true);
        }

        protected void saveCache() {
            if (this.saving) {
                return;
            }
            this.saving = true;
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList(this.pinnedIds);
            fill(arrayList, true, true);
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesList.$r8$lambda$NqYwSC8mm8q7rYCJa4I1cMKS8AE(StoriesController.StoriesList.this, arrayList, messagesStorage, arrayList2);
                }
            });
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00e9, code lost:
        
            if (r3 != null) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void $r8$lambda$NqYwSC8mm8q7rYCJa4I1cMKS8AE(final StoriesList storiesList, ArrayList arrayList, MessagesStorage messagesStorage, ArrayList arrayList2) {
            SQLitePreparedStatement sQLitePreparedStatement;
            storiesList.getClass();
            FileLog.d("StoriesList " + storiesList.type + "{" + storiesList.dialogId + "} saveCache {" + StoriesController.storyItemMessageIds(arrayList) + "}");
            SQLitePreparedStatement sQLitePreparedStatement2 = null;
            try {
                SQLiteDatabase database = messagesStorage.getDatabase();
                SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                try {
                    database.executeFast(String.format(Locale.US, "DELETE FROM profile_stories_albums_links WHERE dialog_id = %d AND album_id = %d", Long.valueOf(storiesList.dialogId), Integer.valueOf(storiesList.albumId))).stepThis().dispose();
                    sQLitePreparedStatement2 = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                    for (int i = 0; i < arrayList.size(); i++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) arrayList.get(i)).storyItem;
                        if (storyItem != null) {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                            storyItem.serializeToStream(nativeByteBuffer);
                            executeFast.requery();
                            executeFast.bindLong(1, storiesList.dialogId);
                            executeFast.bindInteger(2, storyItem.id);
                            executeFast.bindByteBuffer(3, nativeByteBuffer);
                            executeFast.bindInteger(4, storiesList.type);
                            executeFast.bindInteger(5, storiesList.seenStories.contains(Integer.valueOf(storyItem.id)) ? 1 : 0);
                            executeFast.bindInteger(6, arrayList2.indexOf(Integer.valueOf(storyItem.id)) + 1);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindLong(1, storiesList.dialogId);
                            sQLitePreparedStatement2.bindInteger(2, storiesList.albumId);
                            sQLitePreparedStatement2.bindInteger(3, storyItem.id);
                            sQLitePreparedStatement2.bindInteger(4, i);
                            sQLitePreparedStatement2.step();
                        }
                    }
                    if (executeFast != null) {
                        executeFast.dispose();
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLitePreparedStatement = sQLitePreparedStatement2;
                    sQLitePreparedStatement2 = executeFast;
                    try {
                        messagesStorage.checkSQLException(th);
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement2 = sQLitePreparedStatement;
                            sQLitePreparedStatement2.dispose();
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda11
                            @Override // java.lang.Runnable
                            public final void run() {
                                StoriesController.StoriesList.this.saving = false;
                            }
                        });
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                sQLitePreparedStatement = null;
            }
        }

        protected boolean markAsRead(int i) {
            if (this.seenStories.contains(Integer.valueOf(i))) {
                return false;
            }
            this.seenStories.add(Integer.valueOf(i));
            saveCache();
            TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
            tL_stories_incrementStoryViews.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_stories_incrementStoryViews.id.add(Integer.valueOf(i));
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_incrementStoryViews, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda17
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesController.StoriesList.$r8$lambda$wPVWlmQxR7Fe-aHAIEf-7YfYwlM(tLObject, tL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesReadUpdated, new Object[0]);
            return true;
        }

        protected boolean canLoad() {
            Long l;
            return lastLoadTime == null || (l = (Long) lastLoadTime.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.currentAccount), Integer.valueOf(this.type), Long.valueOf(this.dialogId), Integer.valueOf(this.albumId))))) == null || System.currentTimeMillis() - l.longValue() > 120000;
        }

        protected void resetCanLoad() {
            HashMap hashMap = lastLoadTime;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.currentAccount), Integer.valueOf(this.type), Long.valueOf(this.dialogId), Integer.valueOf(this.albumId))));
            }
        }

        public boolean load(boolean z, int i) {
            return load(z, i, Collections.EMPTY_LIST);
        }

        public boolean load(List list) {
            boolean z;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (!this.messageObjectsMap.containsKey((Integer) it.next())) {
                    z = true;
                    break;
                }
            }
            return load(z, 0, list);
        }

        public int lastLoadedId() {
            if (this.loadedObjects.isEmpty()) {
                return -1;
            }
            ArrayList arrayList = new ArrayList(this.loadedObjects);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.pinnedIds.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }

        public int firstLoadedId() {
            if (this.loadedObjects.isEmpty()) {
                return -1;
            }
            ArrayList arrayList = new ArrayList(this.loadedObjects);
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = (Integer) arrayList.get(i);
                int intValue = num.intValue();
                if (!this.pinnedIds.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean load(final boolean z, final int i, final List list) {
            final int lastLoadedId;
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
            if (this.loading || ((this.done || this.error || !canLoad()) && !z)) {
                return false;
            }
            if (this.preloading) {
                this.toLoad = new Utilities.CallbackReturn() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda5
                    @Override // org.telegram.messenger.Utilities.CallbackReturn
                    public final Object run(Object obj) {
                        Boolean valueOf;
                        valueOf = Boolean.valueOf(StoriesController.StoriesList.this.load(z, i, list));
                        return valueOf;
                    }
                };
                return false;
            }
            int i2 = this.type;
            if (i2 == 0 && this.albumId > 0) {
                TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
                tL_stories_getAlbumStories.album_id = this.albumId;
                tL_stories_getAlbumStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                lastLoadedId = this.loadedObjects.size();
                tL_stories_getAlbumStories.offset = lastLoadedId;
                tL_stories_getAlbumStories.limit = i;
                tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
            } else if (i2 == 0) {
                TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
                tL_stories_getPinnedStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                lastLoadedId = lastLoadedId();
                tL_stories_getPinnedStories.offset_id = lastLoadedId;
                tL_stories_getPinnedStories.limit = i;
                tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
            } else if (i2 == 2) {
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                tL_stories_getStoriesByID.id.addAll(list);
                lastLoadedId = -1;
                tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
            } else {
                TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
                tL_stories_getStoriesArchive2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                lastLoadedId = lastLoadedId();
                tL_stories_getStoriesArchive2.offset_id = lastLoadedId;
                tL_stories_getStoriesArchive2.limit = i;
                tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
            }
            FileLog.d("StoriesList " + this.type + "{" + this.dialogId + "} load");
            this.loading = true;
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoriesArchive, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesController.StoriesList.$r8$lambda$rPEPBtDOH3vTyqxEVLizo8pJVuE(StoriesController.StoriesList.this, lastLoadedId, tLObject, tL_error);
                }
            });
            return true;
        }

        public static /* synthetic */ void $r8$lambda$rPEPBtDOH3vTyqxEVLizo8pJVuE(final StoriesList storiesList, final int i, TLObject tLObject, TLRPC.TL_error tL_error) {
            storiesList.getClass();
            if (tLObject instanceof TL_stories.TL_stories_stories) {
                final ArrayList arrayList = new ArrayList();
                final TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                for (int i2 = 0; i2 < tL_stories_stories.stories.size(); i2++) {
                    arrayList.add(storiesList.toMessageObject(tL_stories_stories.stories.get(i2), tL_stories_stories));
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        StoriesController.StoriesList.$r8$lambda$gg3fS5s-oI23BB07hvagAM63VVA(StoriesController.StoriesList.this, arrayList, tL_stories_stories, i);
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesList.$r8$lambda$2l6wqJDg0hm5XJyBR6QmFUBK3_A(StoriesController.StoriesList.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$gg3fS5s-oI23BB07hvagAM63VVA(StoriesList storiesList, ArrayList arrayList, TL_stories.TL_stories_stories tL_stories_stories, int i) {
            storiesList.reqId = -1;
            FileLog.d("StoriesList " + storiesList.type + "{" + storiesList.dialogId + "} loaded {" + StoriesController.storyItemMessageIds(arrayList) + "}");
            storiesList.pinnedIds.clear();
            storiesList.pinnedIds.addAll(tL_stories_stories.pinned_to_top);
            MessagesController.getInstance(storiesList.currentAccount).putUsers(tL_stories_stories.users, false);
            MessagesController.getInstance(storiesList.currentAccount).putChats(tL_stories_stories.chats, false);
            MessagesStorage.getInstance(storiesList.currentAccount).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
            storiesList.loading = false;
            storiesList.totalCount = tL_stories_stories.count;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                storiesList.pushObject((MessageObject) arrayList.get(i2), false);
            }
            boolean z = storiesList.loadedObjects.size() >= storiesList.totalCount;
            storiesList.done = z;
            if (!z) {
                if (storiesList.albumId <= 0) {
                    if (i == -1) {
                        i = storiesList.firstLoadedId();
                    }
                    int lastLoadedId = storiesList.lastLoadedId();
                    Iterator it = storiesList.cachedObjects.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!storiesList.loadedObjects.contains(num) && intValue >= i && intValue <= lastLoadedId) {
                            it.remove();
                            storiesList.removeObject(intValue, false);
                        }
                    }
                }
            } else {
                Iterator it2 = storiesList.cachedObjects.iterator();
                while (it2.hasNext()) {
                    Integer num2 = (Integer) it2.next();
                    int intValue2 = num2.intValue();
                    if (!storiesList.loadedObjects.contains(num2)) {
                        it2.remove();
                        storiesList.removeObject(intValue2, false);
                    }
                }
            }
            storiesList.fill(true);
            if (storiesList.done) {
                if (lastLoadTime == null) {
                    lastLoadTime = new HashMap();
                }
                lastLoadTime.put(Integer.valueOf(Objects.hash(Integer.valueOf(storiesList.currentAccount), Integer.valueOf(storiesList.type), Long.valueOf(storiesList.dialogId), Integer.valueOf(storiesList.albumId))), Long.valueOf(System.currentTimeMillis()));
            } else {
                storiesList.resetCanLoad();
            }
            storiesList.saveCache();
        }

        public static /* synthetic */ void $r8$lambda$2l6wqJDg0hm5XJyBR6QmFUBK3_A(StoriesList storiesList) {
            storiesList.loading = false;
            storiesList.error = true;
            NotificationCenter.getInstance(storiesList.currentAccount).postNotificationName(NotificationCenter.storiesListUpdated, storiesList, Boolean.FALSE);
        }

        public void reload() {
            if (this.reqId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = -1;
            }
            resetCanLoad();
            int size = this.messageObjects.size();
            this.messageObjectsMap.clear();
            this.loadedObjects.clear();
            this.cachedObjects.clear();
            invalidateCache();
            this.done = false;
            this.error = false;
            load(true, Utilities.clamp(size, 50, 10));
        }

        public void updateDeletedStories(List list) {
            FileLog.d("StoriesList " + this.type + "{" + this.dialogId + "} updateDeletedStories {" + StoriesController.storyItemIds(list) + "}");
            if (list == null) {
                return;
            }
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i);
                if (storyItem != null) {
                    if (this.loadedObjects.contains(Integer.valueOf(storyItem.id)) || this.cachedObjects.contains(Integer.valueOf(storyItem.id))) {
                        this.loadedObjects.remove(Integer.valueOf(storyItem.id));
                        this.cachedObjects.remove(Integer.valueOf(storyItem.id));
                        int i2 = this.totalCount;
                        if (i2 != -1) {
                            this.totalCount = i2 - 1;
                        }
                        z = true;
                    }
                    removeObject(storyItem.id, true);
                }
            }
            if (z) {
                fill(true);
                saveCache();
            }
        }

        public void updateStoryViews(List list, ArrayList arrayList) {
            TL_stories.StoryItem storyItem;
            if (list == null || arrayList == null) {
                return;
            }
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                num.getClass();
                if (i >= arrayList.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = (TL_stories.StoryViews) arrayList.get(i);
                MessageObject messageObject = (MessageObject) this.messageObjectsMap.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z = true;
                }
            }
            if (z) {
                saveCache();
            }
        }

        public void updateStories(List list, boolean z) {
            MessageObject messageObject;
            FileLog.d("StoriesList " + this.type + "{" + this.dialogId + "} updateStories {" + StoriesController.storyItemIds(list) + "}");
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (int i = 0; i < list.size(); i++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i);
                if (storyItem != null) {
                    boolean z3 = this.loadedObjects.contains(Integer.valueOf(storyItem.id)) || this.cachedObjects.contains(Integer.valueOf(storyItem.id));
                    boolean z4 = this.type == 1 || storyItem.pinned;
                    int i2 = this.albumId;
                    if (i2 > 0) {
                        ArrayList<Integer> arrayList2 = storyItem.albums;
                        z4 = arrayList2 != null && arrayList2.contains(Integer.valueOf(i2));
                    }
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        z4 = false;
                    }
                    if (z3 != z4) {
                        if (!z4) {
                            FileLog.d("StoriesList remove story " + storyItem.id);
                            removeObject(storyItem.id, true);
                            int i3 = this.totalCount;
                            if (i3 != -1) {
                                this.totalCount = i3 - 1;
                            }
                        } else if (this.done) {
                            FileLog.d("StoriesList put story " + storyItem.id);
                            pushObject(toMessageObject(storyItem, null), false);
                            arrayList.add(Integer.valueOf(storyItem.id));
                            int i4 = this.totalCount;
                            if (i4 != -1) {
                                this.totalCount = i4 + 1;
                            }
                        } else if (!this.loading) {
                            FileLog.d("StoriesList cannot put story " + storyItem.id + " -> reload");
                            reload();
                        }
                    } else if (z3 && z4 && ((messageObject = (MessageObject) this.messageObjectsMap.get(Integer.valueOf(storyItem.id))) == null || z || !equal(messageObject.storyItem, storyItem))) {
                        FileLog.d("StoriesList update story " + storyItem.id);
                        this.messageObjectsMap.put(Integer.valueOf(storyItem.id), toMessageObject(storyItem, null));
                    }
                    z2 = true;
                }
            }
            if (this.albumId > 0 && !arrayList.isEmpty()) {
                updateOrderInAlbum(arrayList, false);
            }
            if (z2) {
                fill(true);
                saveCache();
            }
        }

        public void updateStoryItemsAlbums(int i, List list, boolean z) {
            TL_stories.StoryItem storyItem;
            Iterator it = list.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                num.getClass();
                MessageObject messageObject = (MessageObject) this.messageObjectsMap.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    z2 |= StoriesController.addOrRemoveStoryItemAlbum(storyItem, i, z);
                }
            }
            if (z2) {
                fill(true);
                saveCache();
            }
        }

        public MessageObject findMessageObject(int i) {
            return (MessageObject) this.messageObjectsMap.get(Integer.valueOf(i));
        }

        public boolean equal(TL_stories.StoryItem storyItem, TL_stories.StoryItem storyItem2) {
            if (storyItem == null && storyItem2 == null) {
                return true;
            }
            if ((storyItem == null) != (storyItem2 == null)) {
                return false;
            }
            return storyItem == storyItem2 || (storyItem.id == storyItem2.id && storyItem.media == storyItem2.media && TextUtils.equals(storyItem.caption, storyItem2.caption));
        }

        private MessageObject toMessageObject(TL_stories.StoryItem storyItem, TL_stories.TL_stories_stories tL_stories_stories) {
            storyItem.dialogId = this.dialogId;
            storyItem.messageId = storyItem.id;
            MessageObject messageObject = new MessageObject(this.currentAccount, storyItem);
            messageObject.generateThumbs(false);
            return messageObject;
        }

        public boolean isLoading() {
            return this.preloading || this.loading;
        }

        public boolean isFull() {
            return this.done;
        }

        public int getLoadedCount() {
            return this.loadedObjects.size();
        }

        public int getCount() {
            if (this.showVideos && this.showPhotos) {
                if (this.totalCount < 0) {
                    return this.messageObjects.size();
                }
                return Math.max(this.messageObjects.size(), this.totalCount);
            }
            return this.messageObjects.size();
        }

        public boolean isPinned(int i) {
            if (this.type != 0 || this.albumId > 0) {
                return false;
            }
            return this.pinnedIds.contains(Integer.valueOf(i));
        }

        public boolean updatePinned(ArrayList arrayList, boolean z) {
            int i;
            ArrayList arrayList2 = new ArrayList(this.pinnedIds);
            int size = arrayList.size() - 1;
            while (true) {
                i = 0;
                if (size < 0) {
                    break;
                }
                Integer num = (Integer) arrayList.get(size);
                num.getClass();
                if (z && !arrayList2.contains(num)) {
                    arrayList2.add(0, num);
                } else if (!z && arrayList2.contains(num)) {
                    arrayList2.remove(num);
                }
                size--;
            }
            boolean z2 = arrayList2.size() > MessagesController.getInstance(this.currentAccount).storiesPinnedToTopCountMax;
            if (z2) {
                return true;
            }
            boolean z3 = this.pinnedIds.size() != arrayList2.size();
            if (!z3) {
                while (true) {
                    if (i >= this.pinnedIds.size()) {
                        break;
                    }
                    if (this.pinnedIds.get(i) != arrayList2.get(i)) {
                        z3 = true;
                        break;
                    }
                    i++;
                }
            }
            if (z3) {
                this.pinnedIds.clear();
                this.pinnedIds.addAll(arrayList2);
                fill(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(this.pinnedIds);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_togglePinnedToTop, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda14
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda16
                            @Override // java.lang.Runnable
                            public final void run() {
                                StoriesController.StoriesList.$r8$lambda$gJ3kJ5LzpL6UzbdwoosGHx6lf3E();
                            }
                        });
                    }
                });
            }
            return z2;
        }

        public void updateOrderInAlbum(List list, boolean z) {
            reorder(this.cachedObjects, list);
            reorder(this.loadedObjects, list);
            fill(false);
            if (z) {
                TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
                tL_updateAlbum.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                tL_updateAlbum.album_id = this.albumId;
                tL_updateAlbum.order = new ArrayList<>(list);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_updateAlbum, null);
            }
        }

        public void updatePinnedOrder(ArrayList arrayList, boolean z) {
            if (this.albumId > 0) {
                updateOrderInAlbum(arrayList, z);
                return;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i = MessagesController.getInstance(this.currentAccount).storiesPinnedToTopCountMax;
            if (arrayList2.size() > i) {
                arrayList2.subList(i, arrayList2.size()).clear();
            }
            if (this.pinnedIds.size() == arrayList2.size()) {
                for (int i2 = 0; i2 < this.pinnedIds.size() && this.pinnedIds.get(i2) == arrayList2.get(i2); i2++) {
                }
            }
            this.pinnedIds.clear();
            this.pinnedIds.addAll(arrayList2);
            fill(false);
            if (z) {
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(this.pinnedIds);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_togglePinnedToTop, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda15
                            @Override // java.lang.Runnable
                            public final void run() {
                                StoriesController.StoriesList.$r8$lambda$I2mzpsXgJt70KibSxQrcG7HZlLs();
                            }
                        });
                    }
                });
            }
        }

        private static void reorder(Set set, List list) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (set.contains(num)) {
                    linkedHashSet.add(num);
                }
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                if (!linkedHashSet.contains(num2)) {
                    linkedHashSet.add(num2);
                }
            }
            set.clear();
            set.addAll(linkedHashSet);
        }
    }

    public static /* synthetic */ int $r8$lambda$C1EmZbpto-qPQWy_B-TlzKzaBBY(StoriesController storiesController, TL_stories.PeerStories peerStories, TL_stories.PeerStories peerStories2) {
        int i;
        storiesController.getClass();
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
        boolean hasUploadingStories = storiesController.hasUploadingStories(peerDialogId);
        boolean hasUploadingStories2 = storiesController.hasUploadingStories(peerDialogId2);
        boolean hasUnreadStories = storiesController.hasUnreadStories(peerDialogId);
        boolean hasUnreadStories2 = storiesController.hasUnreadStories(peerDialogId2);
        boolean hasLiveStory = storiesController.hasLiveStory(peerDialogId);
        boolean hasLiveStory2 = storiesController.hasLiveStory(peerDialogId2);
        if (hasLiveStory != hasLiveStory2) {
            return (hasLiveStory2 ? 1 : 0) - (hasLiveStory ? 1 : 0);
        }
        if (hasUploadingStories != hasUploadingStories2) {
            return (hasUploadingStories2 ? 1 : 0) - (hasUploadingStories ? 1 : 0);
        }
        if (hasUnreadStories != hasUnreadStories2) {
            return (hasUnreadStories2 ? 1 : 0) - (hasUnreadStories ? 1 : 0);
        }
        boolean isService = UserObject.isService(peerDialogId);
        boolean isService2 = UserObject.isService(peerDialogId2);
        if (isService != isService2) {
            return (isService2 ? 1 : 0) - (isService ? 1 : 0);
        }
        boolean isPremium = storiesController.isPremium(peerDialogId);
        boolean isPremium2 = storiesController.isPremium(peerDialogId2);
        if (isPremium != isPremium2) {
            return (isPremium2 ? 1 : 0) - (isPremium ? 1 : 0);
        }
        int i2 = 0;
        if (peerStories.stories.isEmpty()) {
            i = 0;
        } else {
            i = peerStories.stories.get(r10.size() - 1).date;
        }
        if (!peerStories2.stories.isEmpty()) {
            i2 = peerStories2.stories.get(r11.size() - 1).date;
        }
        return i2 - i;
    }

    private boolean isPremium(long j) {
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public void scheduleSort() {
        AndroidUtilities.cancelRunOnUIThread(this.sortStoriesRunnable);
        this.sortStoriesRunnable.run();
    }

    public boolean hasOnlySelfStories() {
        return hasSelfStories() && (getDialogListStories().isEmpty() || (getDialogListStories().size() == 1 && DialogObject.getPeerDialogId(((TL_stories.PeerStories) getDialogListStories().get(0)).peer) == UserConfig.getInstance(this.currentAccount).clientUserId));
    }

    public void sortHiddenStories() {
        sortDialogStories(this.hiddenListStories);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public void loadBlocklistAtFirst() {
        if (this.lastBlocklistRequested == 0) {
            loadBlocklist(false);
        }
    }

    public void loadBlocklist(boolean z) {
        if (this.blocklistLoading) {
            if (!z || this.blocklistLoadingReset) {
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.blocklistReqId, true);
            this.blocklistReqId = 0;
            this.blocklistLoadingReset = false;
            this.blocklistLoading = false;
        }
        if (!z || System.currentTimeMillis() - this.lastBlocklistRequested >= 1800000) {
            if (z || !this.blocklistFull) {
                this.blocklistLoading = true;
                this.blocklistLoadingReset = z;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
                tL_contacts_getBlocked.my_stories_from = true;
                if (z) {
                    tL_contacts_getBlocked.offset = 0;
                    tL_contacts_getBlocked.limit = 100;
                    this.blocklistFull = false;
                } else {
                    tL_contacts_getBlocked.offset = this.blocklist.size();
                    tL_contacts_getBlocked.limit = 25;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_getBlocked, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda19
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StoriesController.$r8$lambda$itJ90aq6c59O4Cxh7wKj68aWqyY(StoriesController.this, tLObject, tL_error);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$itJ90aq6c59O4Cxh7wKj68aWqyY(final StoriesController storiesController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$d48mKrezimTHT-R1vvl55EHLL20(StoriesController.this, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$d48mKrezimTHT-R1vvl55EHLL20(StoriesController storiesController, TLObject tLObject) {
        storiesController.getClass();
        if (tLObject instanceof TLRPC.TL_contacts_blocked) {
            TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject;
            MessagesController.getInstance(storiesController.currentAccount).putUsers(tL_contacts_blocked.users, false);
            MessagesController.getInstance(storiesController.currentAccount).putChats(tL_contacts_blocked.chats, false);
            storiesController.blocklist.clear();
            ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i);
                i++;
                storiesController.blocklist.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
            }
            storiesController.blocklistCount = Math.max(storiesController.blocklist.size(), tL_contacts_blocked.count);
            storiesController.blocklistFull = true;
        } else {
            if (!(tLObject instanceof TLRPC.TL_contacts_blockedSlice)) {
                return;
            }
            TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject;
            MessagesController.getInstance(storiesController.currentAccount).putUsers(tL_contacts_blockedSlice.users, false);
            MessagesController.getInstance(storiesController.currentAccount).putChats(tL_contacts_blockedSlice.chats, false);
            ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i2);
                i2++;
                storiesController.blocklist.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
            }
            storiesController.blocklistCount = tL_contacts_blockedSlice.count;
            storiesController.blocklistFull = storiesController.blocklist.size() >= storiesController.blocklistCount;
        }
        NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
        storiesController.blocklistLoading = false;
        storiesController.lastBlocklistRequested = System.currentTimeMillis();
    }

    public int getBlocklistCount() {
        return this.blocklistCount;
    }

    public void updateBlockedUsers(HashSet hashSet, final Runnable runnable) {
        TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
        tL_contacts_setBlocked.my_stories_from = true;
        tL_contacts_setBlocked.limit = this.blocklist.size();
        int size = this.blocklistCount - this.blocklist.size();
        this.blocklistCount = size;
        if (size < 0) {
            this.blocklistCount = 0;
        }
        this.blocklist.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(l.longValue());
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                this.blocklist.add(l);
                tL_contacts_setBlocked.id.add(inputPeer);
            }
        }
        this.blocklistCount += this.blocklist.size();
        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, this.blocklist.size());
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_setBlocked, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda39
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda41
                    @Override // java.lang.Runnable
                    public final void run() {
                        StoriesController.$r8$lambda$G2O6l9H-r4Go5O9xxhY9RL6YO_0(r1);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$G2O6l9H-r4Go5O9xxhY9RL6YO_0(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean isBlocked(TL_stories.StoryView storyView) {
        if (storyView == null) {
            return false;
        }
        if (this.blockedOverride.containsKey(storyView.user_id)) {
            return ((Boolean) this.blockedOverride.get(storyView.user_id)).booleanValue();
        }
        return this.lastBlocklistRequested == 0 ? storyView.blocked_my_stories_from || storyView.blocked : this.blocklist.contains(Long.valueOf(storyView.user_id)) || storyView.blocked_my_stories_from || storyView.blocked;
    }

    public void applyStoryViewsBlocked(TL_stories.StoryViewsList storyViewsList) {
        if (storyViewsList == null || storyViewsList.views == null) {
            return;
        }
        for (int i = 0; i < storyViewsList.views.size(); i++) {
            TL_stories.StoryView storyView = storyViewsList.views.get(i);
            if (this.blockedOverride.containsKey(storyView.user_id)) {
                this.blockedOverride.put(storyView.user_id, Boolean.valueOf(storyView.blocked_my_stories_from));
            }
        }
    }

    public void updateBlockUser(long j, boolean z) {
        updateBlockUser(j, z, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateBlockUser(long j, boolean z, boolean z2) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
            return;
        }
        this.blockedOverride.put(j, Boolean.valueOf(z));
        if (this.blocklist.contains(Long.valueOf(j)) != z) {
            if (z) {
                this.blocklist.add(Long.valueOf(j));
                this.blocklistCount++;
            } else {
                this.blocklist.remove(Long.valueOf(j));
                this.blocklistCount--;
            }
        }
        if (z2) {
            if (z) {
                TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                tL_contacts_block.my_stories_from = true;
                tL_contacts_block.id = inputPeer;
                tL_contacts_unblock = tL_contacts_block;
            } else {
                TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                tL_contacts_unblock2.my_stories_from = true;
                tL_contacts_unblock2.id = inputPeer;
                tL_contacts_unblock = tL_contacts_unblock2;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_unblock, null);
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
    }

    public StoryLimit checkStoryLimit() {
        int i;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            i = MessagesController.getInstance(this.currentAccount).storyExpiringLimitPremium;
        } else {
            i = MessagesController.getInstance(this.currentAccount).storyExpiringLimitDefault;
        }
        if (getMyStoriesCount() >= i) {
            return new StoryLimit(1, 0, 0L);
        }
        if (this.storyLimitFetched) {
            return this.storyLimitCached;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_canSendStory, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda11
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoriesController.$r8$lambda$3jZisqIyh8Wla-lkc5VPCvdGOkA(StoriesController.this, tLObject, tL_error);
            }
        }, 1024);
        return null;
    }

    public static /* synthetic */ void $r8$lambda$3jZisqIyh8Wla-lkc5VPCvdGOkA(final StoriesController storiesController, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        storiesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$qtgHouqbURBg-6jOGHNEMvBSyMs(StoriesController.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$qtgHouqbURBg-6jOGHNEMvBSyMs(StoriesController storiesController, TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.storyLimitFetched = true;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            storiesController.storyLimitCached = null;
            NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesLimitUpdate, new Object[0]);
        } else if (tLObject instanceof TL_stories.canSendStoryCount) {
            storiesController.storyLimitCached = new StoryLimit(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
            NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesLimitUpdate, new Object[0]);
        } else {
            storiesController.checkStoryError(tL_error);
        }
    }

    public void canSendStoryFor(final long j, final Consumer consumer, final boolean z, final Theme.ResourcesProvider resourcesProvider) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_canSendStory, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda16
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoriesController.$r8$lambda$0zpGbyY-vQKe8LDN-Q7zv1Bf_v4(StoriesController.this, z, j, consumer, resourcesProvider, tLObject, tL_error);
            }
        }, 1024);
    }

    public static /* synthetic */ void $r8$lambda$0zpGbyY-vQKe8LDN-Q7zv1Bf_v4(final StoriesController storiesController, final boolean z, final long j, final Consumer consumer, final Theme.ResourcesProvider resourcesProvider, TLObject tLObject, final TLRPC.TL_error tL_error) {
        storiesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$K2L4eqInfER6I6s9q1ojJ6dsHwE(StoriesController.this, tL_error, z, j, consumer, resourcesProvider);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$K2L4eqInfER6I6s9q1ojJ6dsHwE(final StoriesController storiesController, TLRPC.TL_error tL_error, boolean z, final long j, final Consumer consumer, Theme.ResourcesProvider resourcesProvider) {
        storiesController.getClass();
        if (tL_error != null) {
            if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                if (z) {
                    final MessagesController messagesController = MessagesController.getInstance(storiesController.currentAccount);
                    messagesController.getBoostsController().getBoostsStats(j, new Consumer() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda33
                        @Override // com.google.android.exoplayer2.util.Consumer
                        public final void accept(Object obj) {
                            StoriesController.$r8$lambda$c6npND0iz5-bk2UKh-boUXMb2Tw(StoriesController.this, consumer, messagesController, j, (TL_stories.TL_premium_boostsStatus) obj);
                        }
                    });
                    return;
                } else {
                    consumer.accept(Boolean.FALSE);
                    return;
                }
            }
            if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (z && lastFragment != null) {
                    new AlertDialog.Builder(lastFragment.getContext(), resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle)).setMessage(LocaleController.getString(R.string.LiveStoryAlreadyStreaming)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                }
                consumer.accept(Boolean.FALSE);
                return;
            }
            if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                if (z && lastFragment2 != null) {
                    lastFragment2.showDialog(new PremiumFeatureBottomSheet(lastFragment2, 14, true));
                }
                consumer.accept(Boolean.FALSE);
                return;
            }
            BulletinFactory global = BulletinFactory.global();
            if (global != null) {
                global.showForError(tL_error);
            }
            consumer.accept(Boolean.FALSE);
            return;
        }
        consumer.accept(Boolean.TRUE);
    }

    public static /* synthetic */ void $r8$lambda$c6npND0iz5-bk2UKh-boUXMb2Tw(final StoriesController storiesController, final Consumer consumer, MessagesController messagesController, final long j, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        storiesController.getClass();
        if (tL_premium_boostsStatus == null) {
            consumer.accept(Boolean.FALSE);
        } else {
            messagesController.getBoostsController().userCanBoostChannel(j, tL_premium_boostsStatus, new Consumer() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda35
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    StoriesController.$r8$lambda$11xl5G2Isp4G-dXj5bUzcnOCMb0(StoriesController.this, consumer, j, tL_premium_boostsStatus, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
            consumer.accept(Boolean.FALSE);
        }
    }

    public static /* synthetic */ void $r8$lambda$11xl5G2Isp4G-dXj5bUzcnOCMb0(final StoriesController storiesController, Consumer consumer, final long j, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        storiesController.getClass();
        if (canApplyBoost == null) {
            consumer.accept(Boolean.FALSE);
        } else {
            LimitReachedBottomSheet.openBoostsForPostingStories(LaunchActivity.getLastFragment(), j, canApplyBoost, tL_premium_boostsStatus, storiesController.canPostStories(j) ? new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda38
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.$r8$lambda$d_ZOEkRyVakiCcm5b0pV3TOmBoA(StoriesController.this, j);
                }
            } : null);
            consumer.accept(Boolean.FALSE);
        }
    }

    public static /* synthetic */ void $r8$lambda$d_ZOEkRyVakiCcm5b0pV3TOmBoA(StoriesController storiesController, long j) {
        BaseFragment create = StatisticActivity.create(MessagesController.getInstance(storiesController.currentAccount).getChat(Long.valueOf(-j)));
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            if (StoryRecorder.isVisible()) {
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                lastFragment.showAsSheet(create, bottomSheetParams);
                return;
            }
            lastFragment.presentFragment(create);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean checkStoryError(TLRPC.TL_error tL_error) {
        boolean z;
        String str;
        if (tL_error != null && (str = tL_error.text) != null) {
            long j = 0;
            z = true;
            if (str.startsWith("STORY_SEND_FLOOD_WEEKLY_")) {
                try {
                    j = Long.parseLong(tL_error.text.substring(24));
                } catch (Exception unused) {
                }
                this.storyLimitCached = new StoryLimit(2, 0, j);
            } else if (tL_error.text.startsWith("STORY_SEND_FLOOD_MONTHLY_")) {
                try {
                    j = Long.parseLong(tL_error.text.substring(25));
                } catch (Exception unused2) {
                }
                this.storyLimitCached = new StoryLimit(3, 0, j);
            } else if (tL_error.text.equals("STORIES_TOO_MUCH")) {
                this.storyLimitCached = new StoryLimit(1, 0, 0L);
            } else if (tL_error.text.equals("PREMIUM_ACCOUNT_REQUIRED")) {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                if ("enabled".equals(messagesController.storiesPosting)) {
                    SharedPreferences.Editor edit = messagesController.getMainSettings().edit();
                    messagesController.storiesPosting = "premium";
                    edit.putString("storiesPosting", "premium").apply();
                    NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesEnabledUpdate, new Object[0]);
                }
            }
            if (z) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storiesLimitUpdate, new Object[0]);
            }
            return z;
        }
        z = false;
        if (z) {
        }
        return z;
    }

    public boolean hasStoryLimit(int i) {
        StoryLimit checkStoryLimit = checkStoryLimit();
        return checkStoryLimit != null && checkStoryLimit.active(this.currentAccount, i);
    }

    public void invalidateStoryLimit() {
        this.storyLimitFetched = false;
        this.storyLimitCached = null;
    }

    public static class StoryLimit {
        public int remains_count;
        public int type;
        public long until;

        public StoryLimit(int i, int i2, long j) {
            this.type = i;
            this.until = j;
            this.remains_count = i2;
        }

        public int getLimitReachedType() {
            int i = this.type;
            if (i != 2) {
                return i != 3 ? 14 : 16;
            }
            return 15;
        }

        public boolean active(int i) {
            return active(i, 1);
        }

        public boolean active(int i, int i2) {
            int i3 = this.type;
            return i3 != 1 ? !(i3 == 2 || i3 == 3) || ((long) ConnectionsManager.getInstance(i).getCurrentTime()) < this.until : this.remains_count < i2;
        }
    }

    public void loadSendAs() {
        if (this.loadingSendAs || this.loadedSendAs) {
            return;
        }
        this.loadingSendAs = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda17
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoriesController.$r8$lambda$zVdAa01pvmIx4uCe3KBSJN1hM3E(StoriesController.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$zVdAa01pvmIx4uCe3KBSJN1hM3E(final StoriesController storiesController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$aSb-JZoSnlULx3POhV404ooQc68(StoriesController.this, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$aSb-JZoSnlULx3POhV404ooQc68(StoriesController storiesController, TLObject tLObject) {
        storiesController.sendAs.clear();
        storiesController.sendAs.add(new TLRPC.TL_inputPeerSelf());
        if (tLObject instanceof TLRPC.TL_messages_chats) {
            ArrayList<TLRPC.Chat> arrayList = ((TLRPC.TL_messages_chats) tLObject).chats;
            MessagesController.getInstance(storiesController.currentAccount).putChats(arrayList, false);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Chat chat = arrayList.get(i);
                i++;
                storiesController.sendAs.add(MessagesController.getInputPeer(chat));
            }
        }
        storiesController.loadingSendAs = false;
        storiesController.loadedSendAs = true;
        NotificationCenter.getInstance(storiesController.currentAccount).postNotificationName(NotificationCenter.storiesSendAsUpdate, new Object[0]);
    }

    public String getAlbumName(long j, int i) {
        StoryAlbum findById;
        StoriesCollections storyAlbumsList = getStoryAlbumsList(j, false);
        if (storyAlbumsList == null || (findById = storyAlbumsList.findById(i)) == null) {
            return null;
        }
        return findById.title;
    }

    public boolean canEditStories(long j) {
        TLRPC.Chat chat;
        if (j >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j))) == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return tL_chatAdminRights != null && tL_chatAdminRights.edit_stories;
    }

    public boolean canEditStoryAlbums(long j) {
        return UserConfig.getInstance(this.currentAccount).getClientUserId() == j || canEditStories(j);
    }

    public boolean canPostStories(TLRPC.Chat chat) {
        if (chat == null || !ChatObject.isBoostSupported(chat)) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return tL_chatAdminRights != null && tL_chatAdminRights.post_stories;
    }

    public boolean canEditStories(TLRPC.Chat chat) {
        if (chat == null || !ChatObject.isBoostSupported(chat)) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return tL_chatAdminRights != null && tL_chatAdminRights.edit_stories;
    }

    public boolean canPostStories(long j) {
        TLRPC.User user;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (j >= 0) {
            return j > 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) != null && user.bot && user.bot_can_edit;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        if (chat == null || !ChatObject.isBoostSupported(chat)) {
            return false;
        }
        return chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_stories);
    }

    public boolean canEditStory(TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User user;
        if (storyItem == null || storyItem.dialogId == getSelfUserId()) {
            return false;
        }
        if (storyItem.dialogId > 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(storyItem.dialogId))) != null && user.bot && user.bot_can_edit) {
            return true;
        }
        if (storyItem.dialogId >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-storyItem.dialogId))) == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        boolean z = storyItem.out;
        if (z && (tL_chatAdminRights2 = chat.admin_rights) != null && (tL_chatAdminRights2.post_stories || tL_chatAdminRights2.edit_stories)) {
            return true;
        }
        return (z || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories) ? false : true;
    }

    public boolean canDeleteStory(TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User user;
        if (storyItem == null || storyItem.dialogId == getSelfUserId()) {
            return false;
        }
        if (storyItem.dialogId > 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(storyItem.dialogId))) != null && user.bot && user.bot_can_edit) {
            return true;
        }
        if (storyItem.dialogId >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-storyItem.dialogId))) == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        boolean z = storyItem.out;
        if (z && (tL_chatAdminRights2 = chat.admin_rights) != null && (tL_chatAdminRights2.post_stories || tL_chatAdminRights2.delete_stories)) {
            return true;
        }
        return (z || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.delete_stories) ? false : true;
    }

    public boolean canCreateNewAlbum(long j) {
        StoriesCollections storyAlbumsList = getStoryAlbumsList(j, false);
        return storyAlbumsList != null && storyAlbumsList.canCreateNewAlbum();
    }

    public void createAlbum(long j, String str, Utilities.Callback callback) {
        getStoryAlbumsList(j).createCollection(str, callback);
    }

    public void renameAlbum(long j, int i, String str) {
        getStoryAlbumsList(j).renameCollection(i, str);
    }

    public void removeAlbum(long j, int i) {
        getStoryAlbumsList(j).removeCollection(i);
    }

    public void addStoriesToAlbum(long j, int i, ArrayList arrayList) {
        getStoryAlbumsList(j).addStories(i, arrayList);
    }

    public void addStoryToAlbum(long j, int i, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        addStoriesToAlbum(j, i, arrayList);
    }

    public void removeStoriesFromAlbum(long j, int i, ArrayList arrayList) {
        getStoryAlbumsList(j).removeStories(i, arrayList);
    }

    public void removeStoryFromAlbum(long j, int i, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        removeStoriesFromAlbum(j, i, arrayList);
    }

    public static class StoryAlbum {
        public int album_id;
        public TLRPC.Photo icon_photo;
        public TLRPC.Document icon_video;
        public String title;

        private StoryAlbum() {
        }

        public TL_stories.TL_storyAlbum toTl() {
            TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
            tL_storyAlbum.album_id = this.album_id;
            tL_storyAlbum.title = this.title;
            tL_storyAlbum.icon_photo = this.icon_photo;
            tL_storyAlbum.icon_video = this.icon_video;
            return tL_storyAlbum;
        }

        public static StoryAlbum from(TL_stories.TL_storyAlbum tL_storyAlbum) {
            StoryAlbum storyAlbum = new StoryAlbum();
            storyAlbum.album_id = tL_storyAlbum.album_id;
            storyAlbum.title = tL_storyAlbum.title;
            storyAlbum.icon_photo = tL_storyAlbum.icon_photo;
            storyAlbum.icon_video = tL_storyAlbum.icon_video;
            return storyAlbum;
        }
    }

    public class StoriesCollections {
        public ArrayList collections;
        public boolean creating;
        public final int currentAccount;
        public int currentRequestId;
        public final long dialogId;
        public final boolean isSelf;
        private ArrayList lastCollections;
        public boolean loaded;
        private boolean loadedCache;
        public boolean loading;

        /* synthetic */ StoriesCollections(StoriesController storiesController, int i, long j, 1 r5) {
            this(storiesController, i, j);
        }

        private StoriesCollections(StoriesController storiesController, int i, long j) {
            this(i, j, true);
        }

        private StoriesCollections(int i, long j, boolean z) {
            this.lastCollections = new ArrayList();
            this.collections = new ArrayList();
            this.currentRequestId = -1;
            this.currentAccount = i;
            this.dialogId = j;
            this.isSelf = j == UserConfig.getInstance(i).getClientUserId();
            if (z) {
                load();
            }
        }

        public boolean canCreateNewAlbum() {
            return (this.isSelf || StoriesController.this.canEditStoryAlbums(this.dialogId)) && this.loaded && this.collections.size() < MessagesController.getInstance(this.currentAccount).config.storiesAlbumsLimit.get();
        }

        public void load() {
            if (this.loading || this.loaded) {
                return;
            }
            this.loading = true;
            if (!this.loadedCache) {
                MessagesStorage.getInstance(this.currentAccount).loadStoryAlbumsCache(this.dialogId, new java.util.function.Consumer() { // from class: org.telegram.ui.Stories.StoriesController$StoriesCollections$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void s(Object obj) {
                        StoriesController.StoriesCollections.$r8$lambda$SzXeHmut5-Nnt8mHlln6iilYlRE(StoriesController.StoriesCollections.this, (List) obj);
                    }

                    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                        return Consumer$-CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            this.currentRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getAlbums, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$StoriesCollections$$ExternalSyntheticLambda1
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesController.StoriesCollections.$r8$lambda$Y4-nOFI7eL9xccqH55_GYBFtQ0E(StoriesController.StoriesCollections.this, tLObject, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$SzXeHmut5-Nnt8mHlln6iilYlRE(final StoriesCollections storiesCollections, final List list) {
            storiesCollections.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesCollections$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesCollections.$r8$lambda$hq5N3fiWOzheRY79mb8VerarHsU(StoriesController.StoriesCollections.this, list);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$hq5N3fiWOzheRY79mb8VerarHsU(StoriesCollections storiesCollections, List list) {
            storiesCollections.collections.clear();
            storiesCollections.collections.addAll(list);
            storiesCollections.loadedCache = true;
            storiesCollections.loading = false;
            storiesCollections.load();
            NotificationCenter.getInstance(storiesCollections.currentAccount).postNotificationName(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(storiesCollections.dialogId), storiesCollections);
        }

        public static /* synthetic */ void $r8$lambda$Y4-nOFI7eL9xccqH55_GYBFtQ0E(final StoriesCollections storiesCollections, final TLObject tLObject, TLRPC.TL_error tL_error) {
            storiesCollections.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesCollections$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesCollections.$r8$lambda$YPJ4AXPsuzozL_k3EW-cELHHeRc(StoriesController.StoriesCollections.this, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$YPJ4AXPsuzozL_k3EW-cELHHeRc(StoriesCollections storiesCollections, TLObject tLObject) {
            storiesCollections.getClass();
            if (tLObject instanceof TL_stories.TL_albums) {
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject;
                ArrayList arrayList = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList2 = tL_albums.albums;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList2.get(i);
                    i++;
                    arrayList.add(StoryAlbum.from(tL_storyAlbum));
                }
                storiesCollections.collections.clear();
                storiesCollections.collections.addAll(arrayList);
                storiesCollections.lastCollections.clear();
                storiesCollections.lastCollections.addAll(arrayList);
                storiesCollections.loaded = true;
                storiesCollections.loading = false;
                storiesCollections.updateAlbumsListCache(true);
                return;
            }
            if (tLObject instanceof TL_stories.TL_albumsNotModified) {
                storiesCollections.collections.clear();
                storiesCollections.collections.addAll(storiesCollections.lastCollections);
                storiesCollections.loaded = true;
                storiesCollections.loading = false;
                NotificationCenter.getInstance(storiesCollections.currentAccount).postNotificationName(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(storiesCollections.dialogId), storiesCollections);
            }
        }

        private void updateAlbumsListCache(boolean z) {
            MessagesStorage.getInstance(this.currentAccount).saveStoryAlbumsCache(this.dialogId, this.collections);
            if (z) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(this.dialogId), this);
            }
        }

        public void createCollection(String str, final Utilities.Callback callback) {
            if (this.creating) {
                return;
            }
            this.creating = true;
            TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
            tL_createAlbum.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_createAlbum.title = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_createAlbum, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$StoriesCollections$$ExternalSyntheticLambda4
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesController.StoriesCollections.$r8$lambda$5hCQv_GVTPnt3FeJU4omRJ4GkQ4(StoriesController.StoriesCollections.this, callback, tLObject, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$5hCQv_GVTPnt3FeJU4omRJ4GkQ4(final StoriesCollections storiesCollections, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            storiesCollections.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$StoriesCollections$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    StoriesController.StoriesCollections.$r8$lambda$Uqv161d1C_QNMZE3xI2IbKjhJfQ(StoriesController.StoriesCollections.this, tLObject, callback, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$Uqv161d1C_QNMZE3xI2IbKjhJfQ(StoriesCollections storiesCollections, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
            BaseFragment safeLastFragment;
            storiesCollections.creating = false;
            if (tLObject instanceof TL_stories.TL_storyAlbum) {
                StoryAlbum from = StoryAlbum.from((TL_stories.TL_storyAlbum) tLObject);
                storiesCollections.collections.add(from);
                storiesCollections.updateAlbumsListCache(true);
                if (callback != null) {
                    callback.run(from);
                    return;
                }
                return;
            }
            if (tL_error != null && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null) {
                BulletinFactory.of(safeLastFragment).showForError(tL_error);
            }
            NotificationCenter.getInstance(storiesCollections.currentAccount).postNotificationName(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(storiesCollections.dialogId), storiesCollections);
        }

        public StoryAlbum findById(int i) {
            for (int i2 = 0; i2 < this.collections.size(); i2++) {
                StoryAlbum storyAlbum = (StoryAlbum) this.collections.get(i2);
                if (i == storyAlbum.album_id) {
                    return storyAlbum;
                }
            }
            return null;
        }

        public int indexOf(int i) {
            for (int i2 = 0; i2 < this.collections.size(); i2++) {
                if (i == ((StoryAlbum) this.collections.get(i2)).album_id) {
                    return i2;
                }
            }
            return -1;
        }

        public void removeCollection(int i) {
            int indexOf = indexOf(i);
            if (indexOf == -1) {
                return;
            }
            StoryAlbum storyAlbum = (StoryAlbum) this.collections.remove(indexOf);
            TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
            tL_deleteAlbum.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_deleteAlbum.album_id = storyAlbum.album_id;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_deleteAlbum, null);
            updateAlbumsListCache(true);
        }

        public void renameCollection(int i, String str) {
            int indexOf = indexOf(i);
            if (indexOf == -1) {
                return;
            }
            ((StoryAlbum) this.collections.get(indexOf)).title = str;
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            tL_updateAlbum.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_updateAlbum.album_id = i;
            tL_updateAlbum.title = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_updateAlbum, null);
            updateAlbumsListCache(true);
        }

        public void addStories(int i, ArrayList arrayList) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            tL_updateAlbum.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_updateAlbum.album_id = i;
            tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList<Integer> arrayList2 = storyItem.albums;
                if (arrayList2 == null) {
                    ArrayList<Integer> arrayList3 = new ArrayList<>();
                    storyItem.albums = arrayList3;
                    arrayList3.add(Integer.valueOf(i));
                } else if (!arrayList2.contains(Integer.valueOf(i))) {
                    storyItem.albums.add(Integer.valueOf(i));
                }
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_updateAlbum, null);
            StoriesList storiesList = StoriesController.this.getStoriesList(this.dialogId, 0, i, false);
            if (storiesList != null) {
                storiesList.updateStories(arrayList, true);
            }
            ArrayList arrayList4 = this.collections;
            int size3 = arrayList4.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList4.get(i4);
                i4++;
                StoriesList storiesList2 = StoriesController.this.getStoriesList(this.dialogId, 0, ((StoryAlbum) obj3).album_id, false);
                if (storiesList2 != null) {
                    storiesList2.updateStoryItemsAlbums(i, tL_updateAlbum.add_stories, false);
                }
            }
        }

        public void removeStories(int i, ArrayList arrayList) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            tL_updateAlbum.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_updateAlbum.album_id = i;
            tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
            }
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList<Integer> arrayList2 = storyItem.albums;
                if (arrayList2 != null) {
                    arrayList2.remove(Integer.valueOf(i));
                    if (storyItem.albums.isEmpty()) {
                        storyItem.albums = null;
                    }
                }
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_updateAlbum, null);
            StoriesList storiesList = StoriesController.this.getStoriesList(this.dialogId, 0, i, false);
            if (storiesList != null) {
                storiesList.updateDeletedStories(arrayList);
            }
            ArrayList arrayList3 = this.collections;
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                StoriesList storiesList2 = StoriesController.this.getStoriesList(this.dialogId, 0, ((StoryAlbum) obj3).album_id, false);
                if (storiesList2 != null) {
                    storiesList2.updateStoryItemsAlbums(i, tL_updateAlbum.delete_stories, true);
                }
            }
        }

        public void reorderStep(ArrayList arrayList) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = this.collections;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                StoryAlbum storyAlbum = (StoryAlbum) obj;
                hashMap.put(Integer.valueOf(storyAlbum.album_id), storyAlbum);
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                Integer num = (Integer) obj2;
                num.getClass();
                StoryAlbum storyAlbum2 = (StoryAlbum) hashMap.get(num);
                if (storyAlbum2 != null) {
                    arrayList3.add(storyAlbum2);
                }
            }
            this.collections.clear();
            this.collections.addAll(arrayList3);
        }

        public void reorderComplete(boolean z) {
            sendOrder();
            updateAlbumsListCache(z);
        }

        public void sendOrder() {
            TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
            tL_reorderAlbums.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_reorderAlbums.order = new ArrayList<>();
            ArrayList arrayList = this.collections;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                tL_reorderAlbums.order.add(Integer.valueOf(((StoryAlbum) obj).album_id));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_reorderAlbums, null);
        }
    }

    public static boolean addOrRemoveStoryItemAlbum(TL_stories.StoryItem storyItem, int i, boolean z) {
        if (storyItem == null) {
            return false;
        }
        HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
        boolean remove = z ? hashSet.remove(Integer.valueOf(i)) : hashSet.add(Integer.valueOf(i));
        storyItem.albums = !hashSet.isEmpty() ? new ArrayList<>(hashSet) : null;
        return remove;
    }

    public void checkUnsupportedStory(final long j, final int i) {
        final String str = "229:" + j + ":" + i;
        if (this.requestingUnsupportedStories.contains(str) || this.unsupportedStoriesChecked.contains(str)) {
            return;
        }
        this.requestingUnsupportedStories.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda32
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoriesController.$r8$lambda$542OF3ZHNu4p0nNmqqxCZMrgW4E(StoriesController.this, i, str, j, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$542OF3ZHNu4p0nNmqqxCZMrgW4E(final StoriesController storiesController, final int i, final String str, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        storiesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.$r8$lambda$zWNiPvp8tv7pQJH7FpHbBgFV0gE(StoriesController.this, tLObject, i, str, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$zWNiPvp8tv7pQJH7FpHbBgFV0gE(StoriesController storiesController, TLObject tLObject, int i, String str, long j) {
        TL_stories.StoryItem storyItem;
        if (tLObject != null) {
            storiesController.getClass();
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            MessagesController.getInstance(storiesController.currentAccount).putUsers(tL_stories_stories.users, false);
            MessagesController.getInstance(storiesController.currentAccount).putChats(tL_stories_stories.chats, false);
            for (int i2 = 0; i2 < tL_stories_stories.stories.size(); i2++) {
                if (tL_stories_stories.stories.get(i2).id == i) {
                    storyItem = tL_stories_stories.stories.get(i2);
                    break;
                }
            }
        }
        storyItem = null;
        storiesController.requestingUnsupportedStories.remove(str);
        if (storyItem != null) {
            storyItem.dialogId = j;
            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
            tL_updateStory.peer = MessagesController.getInstance(storiesController.currentAccount).getPeer(j);
            tL_updateStory.story = storyItem;
            storiesController.processUpdate(tL_updateStory);
            return;
        }
        Iterator it = storiesController.unsupportedStoriesChecked.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (str2.endsWith(":" + j + ":" + i)) {
                storiesController.unsupportedStoriesChecked.remove(str2);
                break;
            }
        }
        storiesController.unsupportedStoriesChecked.add(str);
        storiesController.mainSettings.edit().putStringSet("unsupported_stories_checked", storiesController.unsupportedStoriesChecked).apply();
    }
}
