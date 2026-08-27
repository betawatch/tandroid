package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.k61;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class DownloadController extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    public static final int AUTODOWNLOAD_TYPE_AUDIO = 2;
    public static final int AUTODOWNLOAD_TYPE_DOCUMENT = 8;
    public static final int AUTODOWNLOAD_TYPE_PHOTO = 1;
    public static final int AUTODOWNLOAD_TYPE_VIDEO = 4;
    private static volatile DownloadController[] Instance = new DownloadController[4];
    public static final int PRESET_NUM_CHANNEL = 3;
    public static final int PRESET_NUM_CONTACT = 0;
    public static final int PRESET_NUM_GROUP = 2;
    public static final int PRESET_NUM_PM = 1;
    public static final int PRESET_SIZE_NUM_AUDIO = 3;
    public static final int PRESET_SIZE_NUM_DOCUMENT = 2;
    public static final int PRESET_SIZE_NUM_PHOTO = 0;
    public static final int PRESET_SIZE_NUM_VIDEO = 1;
    private HashMap<String, FileDownloadProgressListener> addLaterArray;
    private ArrayList<DownloadObject> audioDownloadQueue;
    Runnable clearUnviewedDownloadsRunnale;
    public int currentMobilePreset;
    public int currentRoamingPreset;
    public int currentWifiPreset;
    private ArrayList<FileDownloadProgressListener> deleteLaterArray;
    private ArrayList<DownloadObject> documentDownloadQueue;
    private HashMap<String, DownloadObject> downloadQueueKeys;
    private HashMap<Pair<Long, Integer>, DownloadObject> downloadQueuePairs;
    public final ArrayList<MessageObject> downloadingFiles;
    public Preset highPreset;
    private int lastCheckMask;
    private int lastTag;
    private boolean listenerInProgress;
    private boolean loadingAutoDownloadConfig;
    private HashMap<String, ArrayList<MessageObject>> loadingFileMessagesObservers;
    private HashMap<String, ArrayList<WeakReference<FileDownloadProgressListener>>> loadingFileObservers;
    public Preset lowPreset;
    public Preset mediumPreset;
    public Preset mobilePreset;
    private SparseArray<String> observersByTag;
    private ArrayList<DownloadObject> photoDownloadQueue;
    public final ArrayList<MessageObject> recentDownloadingFiles;
    public Preset roamingPreset;
    private a0.h typingTimes;
    public final SparseArray<MessageObject> unviewedDownloads;
    private ArrayList<DownloadObject> videoDownloadQueue;
    public Preset wifiPreset;

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public class DownloadingDocumentEntry {
        int hash;
        long id;

        private DownloadingDocumentEntry() {
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface FileDownloadProgressListener {
        int getObserverTag();

        void onFailedDownload(String str, boolean z10);

        void onProgressDownload(String str, long j10, long j11);

        void onProgressUpload(String str, long j10, long j11, boolean z10);

        void onSuccessDownload(String str);
    }

    public DownloadController(int i10) {
        super(i10);
        Object obj;
        this.lastCheckMask = 0;
        this.photoDownloadQueue = new ArrayList<>();
        this.audioDownloadQueue = new ArrayList<>();
        this.documentDownloadQueue = new ArrayList<>();
        this.videoDownloadQueue = new ArrayList<>();
        this.downloadQueueKeys = new HashMap<>();
        this.downloadQueuePairs = new HashMap<>();
        this.loadingFileObservers = new HashMap<>();
        this.loadingFileMessagesObservers = new HashMap<>();
        this.observersByTag = new SparseArray<>();
        this.listenerInProgress = false;
        this.addLaterArray = new HashMap<>();
        this.deleteLaterArray = new ArrayList<>();
        this.lastTag = 0;
        this.typingTimes = new a0.h();
        this.downloadingFiles = new ArrayList<>();
        this.recentDownloadingFiles = new ArrayList<>();
        this.unviewedDownloads = new SparseArray<>();
        this.clearUnviewedDownloadsRunnale = new Runnable() { // from class: org.telegram.messenger.DownloadController.2
            @Override // java.lang.Runnable
            public void run() {
                DownloadController.this.clearUnviewedDownloads();
                DownloadController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
            }
        };
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        Preset preset = new Preset(mainSettings.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.lowPreset = preset;
        preset.preloadStories = false;
        this.mediumPreset = new Preset(mainSettings.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.highPreset = new Preset(mainSettings.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean contains = mainSettings.contains("newConfig");
        if (contains || !getUserConfig().isClientActivated()) {
            this.mobilePreset = new Preset(mainSettings.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.wifiPreset = new Preset(mainSettings.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.roamingPreset = new Preset(mainSettings.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
            this.currentMobilePreset = mainSettings.getInt("currentMobilePreset", 3);
            this.currentWifiPreset = mainSettings.getInt("currentWifiPreset", 3);
            this.currentRoamingPreset = mainSettings.getInt("currentRoamingPreset", 3);
            if (!contains) {
                mainSettings.edit().putBoolean("newConfig", true).commit();
            }
        } else {
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            int[] iArr3 = new int[4];
            long[] jArr = new long[7];
            long[] jArr2 = new long[7];
            long[] jArr3 = new long[7];
            int i11 = 0;
            for (int i12 = 4; i11 < i12; i12 = 4) {
                int i13 = i11;
                StringBuilder sb2 = new StringBuilder("mobileDataDownloadMask");
                Object obj2 = "";
                if (i13 == 0) {
                    obj = "";
                } else {
                    obj = "";
                    obj2 = Integer.valueOf(i13);
                }
                sb2.append(obj2);
                String sb3 = sb2.toString();
                if (i13 == 0 || mainSettings.contains(sb3)) {
                    iArr[i13] = mainSettings.getInt(sb3, 13);
                    StringBuilder sb4 = new StringBuilder("wifiDownloadMask");
                    sb4.append(i13 == 0 ? obj : Integer.valueOf(i13));
                    iArr2[i13] = mainSettings.getInt(sb4.toString(), 13);
                    StringBuilder sb5 = new StringBuilder("roamingDownloadMask");
                    sb5.append(i13 == 0 ? obj : Integer.valueOf(i13));
                    iArr3[i13] = mainSettings.getInt(sb5.toString(), 1);
                } else {
                    iArr[i13] = iArr[0];
                    iArr2[i13] = iArr2[0];
                    iArr3[i13] = iArr3[0];
                }
                i11 = i13 + 1;
            }
            jArr[2] = mainSettings.getLong("mobileMaxDownloadSize2", this.mediumPreset.sizes[1]);
            jArr[3] = mainSettings.getLong("mobileMaxDownloadSize3", this.mediumPreset.sizes[2]);
            jArr2[2] = mainSettings.getLong("wifiMaxDownloadSize2", this.highPreset.sizes[1]);
            jArr2[3] = mainSettings.getLong("wifiMaxDownloadSize3", this.highPreset.sizes[2]);
            jArr3[2] = mainSettings.getLong("roamingMaxDownloadSize2", this.lowPreset.sizes[1]);
            jArr3[3] = mainSettings.getLong("roamingMaxDownloadSize3", this.lowPreset.sizes[2]);
            boolean z10 = mainSettings.getBoolean("globalAutodownloadEnabled", true);
            this.mobilePreset = new Preset(iArr, this.mediumPreset.sizes[0], jArr[2], jArr[3], true, true, z10, false, 100, false);
            this.wifiPreset = new Preset(iArr2, this.highPreset.sizes[0], jArr2[2], jArr2[3], true, true, z10, false, 100, true);
            this.roamingPreset = new Preset(iArr3, this.lowPreset.sizes[0], jArr3[2], jArr3[3], false, false, z10, true, 50, true);
            SharedPreferences.Editor edit = mainSettings.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", this.mobilePreset.toString());
            edit.putString("wifiPreset", this.wifiPreset.toString());
            edit.putString("roamingPreset", this.roamingPreset.toString());
            this.currentMobilePreset = 3;
            edit.putInt("currentMobilePreset", 3);
            this.currentWifiPreset = 3;
            edit.putInt("currentWifiPreset", 3);
            this.currentRoamingPreset = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        }
        AndroidUtilities.runOnUIThread(new a2(this, 1));
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: org.telegram.messenger.DownloadController.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                DownloadController.this.checkAutodownloadSettings();
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationLoader.applicationContext.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            ApplicationLoader.applicationContext.registerReceiver(broadcastReceiver, intentFilter);
        }
        if (getUserConfig().isClientActivated()) {
            checkAutodownloadSettings();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r8.user_id)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009f, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r3.from_id.user_id)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00de, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r3.from_id.user_id)) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int canDownloadMediaInternal(MessageObject messageObject) {
        TLRPC.Message message;
        int i10;
        char c10;
        int autodownloadNetworkType;
        Preset currentMobilePreset;
        TLRPC.Message message2;
        int i11;
        long j10;
        k61 k61Var;
        long messageSize;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return 0;
        }
        if (message.media instanceof TLRPC.TL_messageMediaStory) {
            return canPreloadStories() ? 2 : 0;
        }
        boolean isVideoMessage = MessageObject.isVideoMessage(message);
        if (isVideoMessage || MessageObject.isGifMessage(message) || MessageObject.isRoundVideoMessage(message) || MessageObject.isGameMessage(message)) {
            i10 = 4;
        } else if (MessageObject.isVoiceMessage(message)) {
            i10 = 2;
        } else if (MessageObject.isPhoto(message) || MessageObject.isStickerMessage(message) || MessageObject.isAnimatedStickerMessage(message)) {
            i10 = 1;
        } else {
            if (MessageObject.getDocument(message) == null) {
                return 0;
            }
            i10 = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c10 = 2;
                } else {
                    TLRPC.Chat chat = peer.channel_id != 0 ? getMessagesController().getChat(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (ChatObject.isChannel(chat) && chat.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
                if (autodownloadNetworkType == 1) {
                    if (!this.wifiPreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentWiFiPreset();
                } else if (autodownloadNetworkType == 2) {
                    if (!this.roamingPreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentRoamingPreset();
                } else {
                    if (!this.mobilePreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentMobilePreset();
                }
                int i12 = currentMobilePreset.mask[c10];
                if (i10 == 2) {
                    message2 = message;
                    i11 = 0;
                    j10 = Math.max(524288L, currentMobilePreset.sizes[typeToIndex(i10)]);
                } else {
                    message2 = message;
                    i11 = 0;
                    j10 = currentMobilePreset.sizes[typeToIndex(i10)];
                }
                k61Var = messageObject.highestQuality;
                if (k61Var != null) {
                    messageSize = k61Var.g.size;
                } else {
                    k61 k61Var2 = messageObject.thumbQuality;
                    messageSize = k61Var2 != null ? k61Var2.g.size : MessageObject.getMessageSize(message2);
                }
                if (!isVideoMessage && currentMobilePreset.preloadVideo && messageSize > j10 && j10 > 2097152) {
                    if ((i12 & i10) != 0) {
                        return 2;
                    }
                    return i11;
                }
                if ((i10 != 1 || (messageSize != 0 && messageSize <= j10)) && (i10 == 2 || (i12 & i10) != 0)) {
                    return 1;
                }
                return i11;
            }
            c10 = 0;
            autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
            if (autodownloadNetworkType == 1) {
            }
            int i122 = currentMobilePreset.mask[c10];
            if (i10 == 2) {
            }
            k61Var = messageObject.highestQuality;
            if (k61Var != null) {
            }
            if (!isVideoMessage) {
            }
            if (i10 != 1) {
            }
            return 1;
        }
        c10 = 1;
        autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
        }
        int i1222 = currentMobilePreset.mask[c10];
        if (i10 == 2) {
        }
        k61Var = messageObject.highestQuality;
        if (k61Var != null) {
        }
        if (!isVideoMessage) {
        }
        if (i10 != 1) {
        }
        return 1;
    }

    private void checkDownloadFinished(String str, int i10) {
        DownloadObject downloadObject = this.downloadQueueKeys.get(str);
        if (downloadObject != null) {
            this.downloadQueueKeys.remove(str);
            this.downloadQueuePairs.remove(new Pair(Long.valueOf(downloadObject.id), Integer.valueOf(downloadObject.type)));
            if (i10 == 0 || i10 == 2) {
                getMessagesStorage().removeFromDownloadQueue(downloadObject.id, downloadObject.type, false);
            }
            int i11 = downloadObject.type;
            if (i11 == 1) {
                this.photoDownloadQueue.remove(downloadObject);
                if (this.photoDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(1);
                    return;
                }
                return;
            }
            if (i11 == 2) {
                this.audioDownloadQueue.remove(downloadObject);
                if (this.audioDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(2);
                    return;
                }
                return;
            }
            if (i11 == 4) {
                this.videoDownloadQueue.remove(downloadObject);
                if (this.videoDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(4);
                    return;
                }
                return;
            }
            if (i11 == 8) {
                this.documentDownloadQueue.remove(downloadObject);
                if (this.documentDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(8);
                }
            }
        }
    }

    public static DownloadController getInstance(int i10) {
        DownloadController downloadController;
        DownloadController downloadController2 = Instance[i10];
        if (downloadController2 != null) {
            return downloadController2;
        }
        synchronized (DownloadController.class) {
            try {
                downloadController = Instance[i10];
                if (downloadController == null) {
                    DownloadController[] downloadControllerArr = Instance;
                    DownloadController downloadController3 = new DownloadController(i10);
                    downloadControllerArr[i10] = downloadController3;
                    downloadController = downloadController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return downloadController;
    }

    public static float getProgress(long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            return 0.0f;
        }
        long j10 = jArr[1];
        if (j10 == 0) {
            return 0.0f;
        }
        return Math.min(1.0f, jArr[0] / j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearRecentDownloadedFiles$12() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteRecentFiles$13(ArrayList arrayList) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                executeFast.requery();
                executeFast.bindInteger(1, ((MessageObject) arrayList.get(i10)).getDocument().dc_id);
                executeFast.bindLong(2, ((MessageObject) arrayList.get(i10)).getDocument().id);
                executeFast.step();
                try {
                    FileLoader.getInstance(this.currentAccount).getPathToMessage(((MessageObject) arrayList.get(i10)).messageOwner).delete();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAutoDownloadConfig$1(TLObject tLObject) {
        this.loadingAutoDownloadConfig = false;
        getUserConfig().autoDownloadConfigLoadTime = System.currentTimeMillis();
        getUserConfig().saveConfig(false);
        if (tLObject != null) {
            TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
            this.lowPreset.set(autodownloadsettings.low);
            this.lowPreset.preloadStories = false;
            this.mediumPreset.set(autodownloadsettings.medium);
            this.highPreset.set(autodownloadsettings.high);
            int i10 = 0;
            while (i10 < 3) {
                Preset preset = i10 == 0 ? this.mobilePreset : i10 == 1 ? this.wifiPreset : this.roamingPreset;
                if (preset.equals(this.lowPreset)) {
                    preset.set(autodownloadsettings.low);
                    preset.preloadStories = false;
                } else if (preset.equals(this.mediumPreset)) {
                    preset.set(autodownloadsettings.medium);
                } else if (preset.equals(this.highPreset)) {
                    preset.set(autodownloadsettings.high);
                }
                i10++;
            }
            SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
            edit.putString("mobilePreset", this.mobilePreset.toString());
            edit.putString("wifiPreset", this.wifiPreset.toString());
            edit.putString("roamingPreset", this.roamingPreset.toString());
            edit.putString("preset0", this.lowPreset.toString());
            edit.putString("preset1", this.mediumPreset.toString());
            edit.putString("preset2", this.highPreset.toString());
            edit.commit();
            this.lowPreset.toString();
            this.mediumPreset.toString();
            this.highPreset.toString();
            checkAutodownloadSettings();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAutoDownloadConfig$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new d2(0, this, tLObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadDownloadingFiles$10(ArrayList arrayList, ArrayList arrayList2) {
        this.downloadingFiles.clear();
        this.downloadingFiles.addAll(arrayList);
        this.recentDownloadingFiles.clear();
        this.recentDownloadingFiles.addAll(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadDownloadingFiles$11() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                int intValue = queryFinalized.intValue(1);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                        MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, false);
                        arrayList3.add(messageObject);
                        if (intValue == 0) {
                            arrayList.add(messageObject);
                        } else {
                            arrayList2.add(messageObject);
                        }
                    }
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        getFileLoader().checkMediaExistance(arrayList);
        getFileLoader().checkMediaExistance(arrayList2);
        AndroidUtilities.runOnUIThread(new f0((BaseController) this, (ArrayList) arrayList, (Object) arrayList2, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoadProgressChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.fileUploadProgressChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.httpFileDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.httpFileDidFailedLoad);
        loadAutoDownloadConfig(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDownloadComplete$6(MessageObject messageObject) {
        try {
            Locale locale = Locale.ENGLISH;
            getMessagesStorage().getDatabase().executeFast("UPDATE downloading_documents SET state = 1, date = " + System.currentTimeMillis() + " WHERE hash = " + messageObject.getDocument().dc_id + " AND id = " + messageObject.getDocument().id).stepThis().dispose();
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT COUNT(*) FROM downloading_documents WHERE state = 1", new Object[0]);
            int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            SQLiteCursor queryFinalized2 = getMessagesStorage().getDatabase().queryFinalized("SELECT state FROM downloading_documents WHERE state = 1", new Object[0]);
            if (queryFinalized2.next()) {
                queryFinalized2.intValue(0);
            }
            queryFinalized2.dispose();
            if (intValue > 100) {
                SQLiteCursor queryFinalized3 = getMessagesStorage().getDatabase().queryFinalized("SELECT hash, id FROM downloading_documents WHERE state = 1 ORDER BY date ASC LIMIT " + (100 - intValue), new Object[0]);
                ArrayList arrayList = new ArrayList();
                while (queryFinalized3.next()) {
                    DownloadingDocumentEntry downloadingDocumentEntry = new DownloadingDocumentEntry();
                    downloadingDocumentEntry.hash = queryFinalized3.intValue(0);
                    downloadingDocumentEntry.id = queryFinalized3.longValue(1);
                    arrayList.add(downloadingDocumentEntry);
                }
                queryFinalized3.dispose();
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    executeFast.requery();
                    executeFast.bindInteger(1, ((DownloadingDocumentEntry) arrayList.get(i10)).hash);
                    executeFast.bindLong(2, ((DownloadingDocumentEntry) arrayList.get(i10)).id);
                    executeFast.step();
                }
                executeFast.dispose();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDownloadComplete$7(TLRPC.Document document, MessageObject messageObject) {
        for (int i10 = 0; i10 < this.downloadingFiles.size(); i10++) {
            if (this.downloadingFiles.get(i10).getDocument() != null && this.downloadingFiles.get(i10).getDocument().id == document.id) {
                this.downloadingFiles.remove(i10);
                int i11 = 0;
                while (true) {
                    if (i11 >= this.recentDownloadingFiles.size()) {
                        this.recentDownloadingFiles.add(0, messageObject);
                        putToUnviewedDownloads(messageObject);
                        break;
                    } else if (this.recentDownloadingFiles.get(i11).getDocument() != null && this.recentDownloadingFiles.get(i11).getDocument().id == document.id) {
                        break;
                    } else {
                        i11++;
                    }
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
                getMessagesStorage().getStorageQueue().postRunnable(new b2(this, messageObject, 2));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDownloadFail$8(MessageObject messageObject, int i10) {
        TLRPC.Document document = messageObject.getDocument();
        for (int i11 = 0; i11 < this.downloadingFiles.size(); i11++) {
            TLRPC.Document document2 = this.downloadingFiles.get(i11).getDocument();
            if (document2 == null || (document != null && document2.id == document.id)) {
                this.downloadingFiles.remove(i11);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
                if (i10 == 0) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.formatString("MessageNotFound", R.string.MessageNotFound, new Object[0]));
                    return;
                } else {
                    if (i10 == -1) {
                        LaunchActivity.E(2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDownloadFail$9(MessageObject messageObject) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
            executeFast.bindInteger(1, messageObject.getDocument().dc_id);
            executeFast.bindLong(2, messageObject.getDocument().id);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadFile$4(MessageObject messageObject) {
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(nativeByteBuffer);
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
            executeFast.bindByteBuffer(1, nativeByteBuffer);
            executeFast.bindInteger(2, messageObject.getDocument().dc_id);
            executeFast.bindLong(3, messageObject.getDocument().id);
            executeFast.bindLong(4, System.currentTimeMillis());
            executeFast.bindInteger(4, 0);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadFile$5(TLRPC.Document document, MessageObject messageObject) {
        boolean z10;
        boolean z11;
        TLRPC.Document document2;
        TLRPC.Document document3;
        if (document == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= this.recentDownloadingFiles.size()) {
                z11 = false;
                break;
            }
            MessageObject messageObject2 = this.recentDownloadingFiles.get(i10);
            if (messageObject2 != null && (document3 = messageObject2.getDocument()) != null && document3.id == document.id) {
                z11 = true;
                break;
            }
            i10++;
        }
        if (!z11) {
            for (int i11 = 0; i11 < this.downloadingFiles.size(); i11++) {
                MessageObject messageObject3 = this.downloadingFiles.get(i11);
                if (messageObject3 != null && (document2 = messageObject3.getDocument()) != null && document2.id == document.id) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            this.downloadingFiles.add(0, messageObject);
            getMessagesStorage().getStorageQueue().postRunnable(new b2(this, messageObject, 0));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    private void processLaterArrays() {
        for (Map.Entry<String, FileDownloadProgressListener> entry : this.addLaterArray.entrySet()) {
            addLoadingFileObserver(entry.getKey(), entry.getValue());
        }
        this.addLaterArray.clear();
        ArrayList<FileDownloadProgressListener> arrayList = this.deleteLaterArray;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            FileDownloadProgressListener fileDownloadProgressListener = arrayList.get(i10);
            i10++;
            removeLoadingFileObserver(fileDownloadProgressListener);
        }
        this.deleteLaterArray.clear();
    }

    private void putToUnviewedDownloads(MessageObject messageObject) {
        this.unviewedDownloads.put(messageObject.getId(), messageObject);
        AndroidUtilities.cancelRunOnUIThread(this.clearUnviewedDownloadsRunnale);
        AndroidUtilities.runOnUIThread(this.clearUnviewedDownloadsRunnale, 60000L);
    }

    public static int typeToIndex(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 1;
        }
        return i10 == 8 ? 2 : 0;
    }

    public void addLoadingFileObserver(String str, FileDownloadProgressListener fileDownloadProgressListener) {
        addLoadingFileObserver(str, null, fileDownloadProgressListener);
    }

    public boolean canDownloadMedia(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (messageObject.type == 23) {
            return (!SharedConfig.isAutoplayVideo() || (storyItem = ((TLRPC.TL_messageMediaStory) MessageObject.getMedia(messageObject)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? false : true;
        }
        if (messageObject.sponsoredMedia != null) {
            return true;
        }
        return !messageObject.isHiddenSensitive() && canDownloadMediaInternal(messageObject) == 1;
    }

    public int canDownloadMediaType(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (messageObject.type == 23) {
            return (!SharedConfig.isAutoplayVideo() || (storyItem = ((TLRPC.TL_messageMediaStory) MessageObject.getMedia(messageObject)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? 0 : 2;
        }
        if (messageObject.sponsoredMedia != null) {
            return 2;
        }
        if (messageObject.isHiddenSensitive()) {
            return 0;
        }
        return canDownloadMediaInternal(messageObject);
    }

    public boolean canDownloadNextTrack() {
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        return autodownloadNetworkType == 1 ? this.wifiPreset.enabled && getCurrentWiFiPreset().preloadMusic : autodownloadNetworkType == 2 ? this.roamingPreset.enabled && getCurrentRoamingPreset().preloadMusic : this.mobilePreset.enabled && getCurrentMobilePreset().preloadMusic;
    }

    public boolean canPreloadStories() {
        Preset currentMobilePreset;
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentWiFiPreset();
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentRoamingPreset();
        } else {
            if (!this.mobilePreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentMobilePreset();
        }
        return currentMobilePreset.preloadStories;
    }

    public void cancelDownloading(ArrayList<Pair<Long, Integer>> arrayList) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            DownloadObject downloadObject = this.downloadQueuePairs.get(arrayList.get(i10));
            if (downloadObject != null) {
                TLObject tLObject = downloadObject.object;
                if (tLObject instanceof TLRPC.Document) {
                    getFileLoader().cancelLoadFile((TLRPC.Document) tLObject, true);
                } else if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize())) != null) {
                    getFileLoader().cancelLoadFile(closestPhotoSizeWithSize, true);
                }
            }
        }
    }

    public void checkAutodownloadSettings() {
        int currentDownloadMask = getCurrentDownloadMask();
        if (currentDownloadMask == this.lastCheckMask) {
            return;
        }
        this.lastCheckMask = currentDownloadMask;
        if ((currentDownloadMask & 1) == 0) {
            for (int i10 = 0; i10 < this.photoDownloadQueue.size(); i10++) {
                DownloadObject downloadObject = this.photoDownloadQueue.get(i10);
                TLObject tLObject = downloadObject.object;
                if (tLObject instanceof TLRPC.Photo) {
                    getFileLoader().cancelLoadFile(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize()));
                } else if (tLObject instanceof TLRPC.Document) {
                    getFileLoader().cancelLoadFile((TLRPC.Document) downloadObject.object);
                }
            }
            this.photoDownloadQueue.clear();
        } else if (this.photoDownloadQueue.isEmpty()) {
            newDownloadObjectsAvailable(1);
        }
        if ((currentDownloadMask & 2) == 0) {
            for (int i11 = 0; i11 < this.audioDownloadQueue.size(); i11++) {
                getFileLoader().cancelLoadFile((TLRPC.Document) this.audioDownloadQueue.get(i11).object);
            }
            this.audioDownloadQueue.clear();
        } else if (this.audioDownloadQueue.isEmpty()) {
            newDownloadObjectsAvailable(2);
        }
        if ((currentDownloadMask & 8) == 0) {
            for (int i12 = 0; i12 < this.documentDownloadQueue.size(); i12++) {
                getFileLoader().cancelLoadFile((TLRPC.Document) this.documentDownloadQueue.get(i12).object);
            }
            this.documentDownloadQueue.clear();
        } else if (this.documentDownloadQueue.isEmpty()) {
            newDownloadObjectsAvailable(8);
        }
        if ((currentDownloadMask & 4) == 0) {
            for (int i13 = 0; i13 < this.videoDownloadQueue.size(); i13++) {
                getFileLoader().cancelLoadFile((TLRPC.Document) this.videoDownloadQueue.get(i13).object);
            }
            this.videoDownloadQueue.clear();
        } else if (this.videoDownloadQueue.isEmpty()) {
            newDownloadObjectsAvailable(4);
        }
        int autodownloadMaskAll = getAutodownloadMaskAll();
        if (autodownloadMaskAll == 0) {
            getMessagesStorage().clearDownloadQueue(0);
            return;
        }
        if ((autodownloadMaskAll & 1) == 0) {
            getMessagesStorage().clearDownloadQueue(1);
        }
        if ((autodownloadMaskAll & 2) == 0) {
            getMessagesStorage().clearDownloadQueue(2);
        }
        if ((autodownloadMaskAll & 4) == 0) {
            getMessagesStorage().clearDownloadQueue(4);
        }
        if ((autodownloadMaskAll & 8) == 0) {
            getMessagesStorage().clearDownloadQueue(8);
        }
    }

    public void checkUnviewedDownloads(int i10, long j10) {
        MessageObject messageObject = this.unviewedDownloads.get(i10);
        if (messageObject == null || messageObject.getDialogId() != j10) {
            return;
        }
        this.unviewedDownloads.remove(i10);
        if (this.unviewedDownloads.size() == 0) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
        }
    }

    public void cleanup() {
        this.photoDownloadQueue.clear();
        this.audioDownloadQueue.clear();
        this.documentDownloadQueue.clear();
        this.videoDownloadQueue.clear();
        this.downloadQueueKeys.clear();
        this.downloadQueuePairs.clear();
        this.typingTimes.b();
    }

    public void clearRecentDownloadedFiles() {
        this.recentDownloadingFiles.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new a2(this, 0));
    }

    public void clearUnviewedDownloads() {
        this.unviewedDownloads.clear();
    }

    public void deleteRecentFiles(ArrayList<MessageObject> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.recentDownloadingFiles.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.downloadingFiles.size()) {
                            break;
                        }
                        if (arrayList.get(i10).getId() == this.downloadingFiles.get(i12).getId() && this.downloadingFiles.get(i12).getDialogId() == arrayList.get(i10).getDialogId()) {
                            this.downloadingFiles.remove(i12);
                            break;
                        }
                        i12++;
                    }
                } else {
                    if (arrayList.get(i10).getId() == this.recentDownloadingFiles.get(i11).getId() && this.recentDownloadingFiles.get(i11).getDialogId() == arrayList.get(i10).getDialogId()) {
                        this.recentDownloadingFiles.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
            arrayList.get(i10).putInDownloadsStore = false;
            FileLoader.getInstance(this.currentAccount).loadFile(arrayList.get(i10).getDocument(), arrayList.get(i10), 0, 0);
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(arrayList.get(i10).getDocument(), true);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new e3(29, this, arrayList));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoadFailed || i10 == NotificationCenter.httpFileDidFailedLoad) {
            String str = (String) objArr[0];
            Integer num = (Integer) objArr[1];
            this.listenerInProgress = true;
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList = this.loadingFileObservers.get(str);
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    WeakReference<FileDownloadProgressListener> weakReference = arrayList.get(i12);
                    if (weakReference.get() != null) {
                        weakReference.get().onFailedDownload(str, num.intValue() == 1);
                        if (num.intValue() != 1) {
                            this.observersByTag.remove(weakReference.get().getObserverTag());
                        }
                    }
                }
                if (num.intValue() != 1) {
                    this.loadingFileObservers.remove(str);
                }
            }
            this.listenerInProgress = false;
            processLaterArrays();
            checkDownloadFinished(str, num.intValue());
            return;
        }
        if (i10 == NotificationCenter.fileLoaded || i10 == NotificationCenter.httpFileDidLoad) {
            this.listenerInProgress = true;
            String str2 = (String) objArr[0];
            ArrayList<MessageObject> arrayList2 = this.loadingFileMessagesObservers.get(str2);
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList2.get(i13).mediaExists = true;
                }
                this.loadingFileMessagesObservers.remove(str2);
            }
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList3 = this.loadingFileObservers.get(str2);
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    WeakReference<FileDownloadProgressListener> weakReference2 = arrayList3.get(i14);
                    if (weakReference2.get() != null) {
                        weakReference2.get().onSuccessDownload(str2);
                        this.observersByTag.remove(weakReference2.get().getObserverTag());
                    }
                }
                this.loadingFileObservers.remove(str2);
            }
            this.listenerInProgress = false;
            processLaterArrays();
            checkDownloadFinished(str2, 0);
            return;
        }
        if (i10 == NotificationCenter.fileLoadProgressChanged) {
            this.listenerInProgress = true;
            String str3 = (String) objArr[0];
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList4 = this.loadingFileObservers.get(str3);
            if (arrayList4 != null) {
                Long l10 = (Long) objArr[1];
                Long l11 = (Long) objArr[2];
                int size4 = arrayList4.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    WeakReference<FileDownloadProgressListener> weakReference3 = arrayList4.get(i15);
                    if (weakReference3.get() != null) {
                        weakReference3.get().onProgressDownload(str3, l10.longValue(), l11.longValue());
                    }
                }
            }
            this.listenerInProgress = false;
            processLaterArrays();
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged) {
            this.listenerInProgress = true;
            String str4 = (String) objArr[0];
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList5 = this.loadingFileObservers.get(str4);
            if (arrayList5 != null) {
                Long l12 = (Long) objArr[1];
                Long l13 = (Long) objArr[2];
                Boolean bool = (Boolean) objArr[3];
                int size5 = arrayList5.size();
                for (int i16 = 0; i16 < size5; i16++) {
                    WeakReference<FileDownloadProgressListener> weakReference4 = arrayList5.get(i16);
                    if (weakReference4.get() != null) {
                        weakReference4.get().onProgressUpload(str4, l12.longValue(), l13.longValue(), bool.booleanValue());
                    }
                }
            }
            this.listenerInProgress = false;
            processLaterArrays();
            try {
                ArrayList<SendMessagesHelper.DelayedMessage> delayedMessages = getSendMessagesHelper().getDelayedMessages(str4);
                if (delayedMessages != null) {
                    for (int i17 = 0; i17 < delayedMessages.size(); i17++) {
                        SendMessagesHelper.DelayedMessage delayedMessage = delayedMessages.get(i17);
                        if (delayedMessage.encryptedChat == null) {
                            long j10 = delayedMessage.peer;
                            int i18 = delayedMessage.topMessageId;
                            Long l14 = (Long) this.typingTimes.f(j10);
                            if (delayedMessage.type == 4) {
                                if (l14 != null && l14.longValue() + 4000 >= System.currentTimeMillis()) {
                                }
                                MessageObject messageObject = (MessageObject) delayedMessage.extraHashMap.get(str4 + "_i");
                                if (messageObject != null && messageObject.isVideo()) {
                                    getMessagesController().sendTyping(j10, i18, 5, 0);
                                } else if (messageObject == null || messageObject.getDocument() == null) {
                                    getMessagesController().sendTyping(j10, i18, 4, 0);
                                } else {
                                    getMessagesController().sendTyping(j10, i18, 3, 0);
                                }
                                this.typingTimes.k(Long.valueOf(System.currentTimeMillis()), j10);
                            } else {
                                delayedMessage.obj.getDocument();
                                if (l14 == null || l14.longValue() + 4000 < System.currentTimeMillis()) {
                                    if (delayedMessage.obj.isRoundVideo()) {
                                        getMessagesController().sendTyping(j10, i18, 8, 0);
                                    } else if (delayedMessage.obj.isVideo()) {
                                        getMessagesController().sendTyping(j10, i18, 5, 0);
                                    } else if (delayedMessage.obj.isVoice()) {
                                        getMessagesController().sendTyping(j10, i18, 9, 0);
                                    } else if (delayedMessage.obj.getDocument() != null) {
                                        getMessagesController().sendTyping(j10, i18, 3, 0);
                                    } else if (delayedMessage.photoSize != null) {
                                        getMessagesController().sendTyping(j10, i18, 4, 0);
                                    }
                                    this.typingTimes.k(Long.valueOf(System.currentTimeMillis()), j10);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public int generateObserverTag() {
        int i10 = this.lastTag;
        this.lastTag = i10 + 1;
        return i10;
    }

    public int getAutodownloadMask() {
        int[] iArr;
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return 0;
            }
            iArr = getCurrentWiFiPreset().mask;
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return 0;
            }
            iArr = getCurrentRoamingPreset().mask;
        } else {
            if (!this.mobilePreset.enabled) {
                return 0;
            }
            iArr = getCurrentMobilePreset().mask;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int i13 = (i12 & 1) != 0 ? 1 : 0;
            if ((i12 & 2) != 0) {
                i13 |= 2;
            }
            if ((i12 & 4) != 0) {
                i13 |= 4;
            }
            if ((i12 & 8) != 0) {
                i13 |= 8;
            }
            i10 |= i13 << (i11 * 8);
        }
        return i10;
    }

    public int getAutodownloadMaskAll() {
        if (!this.mobilePreset.enabled && !this.roamingPreset.enabled && !this.wifiPreset.enabled) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            if ((getCurrentMobilePreset().mask[i11] & 1) != 0 || (getCurrentWiFiPreset().mask[i11] & 1) != 0 || (getCurrentRoamingPreset().mask[i11] & 1) != 0) {
                i10 |= 1;
            }
            if ((getCurrentMobilePreset().mask[i11] & 2) != 0 || (getCurrentWiFiPreset().mask[i11] & 2) != 0 || (getCurrentRoamingPreset().mask[i11] & 2) != 0) {
                i10 |= 2;
            }
            if ((getCurrentMobilePreset().mask[i11] & 4) != 0 || (getCurrentWiFiPreset().mask[i11] & 4) != 0 || (4 & getCurrentRoamingPreset().mask[i11]) != 0) {
                i10 |= 4;
            }
            if ((getCurrentMobilePreset().mask[i11] & 8) != 0 || (getCurrentWiFiPreset().mask[i11] & 8) != 0 || (getCurrentRoamingPreset().mask[i11] & 8) != 0) {
                i10 |= 8;
            }
        }
        return i10;
    }

    public int getCurrentDownloadMask() {
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        int i10 = 0;
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return 0;
            }
            int i11 = 0;
            while (i10 < 4) {
                i11 |= getCurrentWiFiPreset().mask[i10];
                i10++;
            }
            return i11;
        }
        if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return 0;
            }
            int i12 = 0;
            while (i10 < 4) {
                i12 |= getCurrentRoamingPreset().mask[i10];
                i10++;
            }
            return i12;
        }
        if (!this.mobilePreset.enabled) {
            return 0;
        }
        int i13 = 0;
        while (i10 < 4) {
            i13 |= getCurrentMobilePreset().mask[i10];
            i10++;
        }
        return i13;
    }

    public Preset getCurrentMobilePreset() {
        int i10 = this.currentMobilePreset;
        return i10 == 0 ? this.lowPreset : i10 == 1 ? this.mediumPreset : i10 == 2 ? this.highPreset : this.mobilePreset;
    }

    public Preset getCurrentRoamingPreset() {
        int i10 = this.currentRoamingPreset;
        return i10 == 0 ? this.lowPreset : i10 == 1 ? this.mediumPreset : i10 == 2 ? this.highPreset : this.roamingPreset;
    }

    public Preset getCurrentWiFiPreset() {
        int i10 = this.currentWifiPreset;
        return i10 == 0 ? this.lowPreset : i10 == 1 ? this.mediumPreset : i10 == 2 ? this.highPreset : this.wifiPreset;
    }

    public int getMaxVideoBitrate() {
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        return autodownloadNetworkType == 1 ? getCurrentWiFiPreset().maxVideoBitrate : autodownloadNetworkType == 2 ? getCurrentRoamingPreset().maxVideoBitrate : getCurrentMobilePreset().maxVideoBitrate;
    }

    public boolean hasUnviewedDownloads() {
        return this.unviewedDownloads.size() > 0;
    }

    public boolean isDownloading(int i10) {
        for (int i11 = 0; i11 < this.downloadingFiles.size(); i11++) {
            if (this.downloadingFiles.get(i11).messageOwner.id == i10) {
                return true;
            }
        }
        return false;
    }

    public void loadAutoDownloadConfig(boolean z10) {
        if (this.loadingAutoDownloadConfig) {
            return;
        }
        if (z10 || Math.abs(System.currentTimeMillis() - getUserConfig().autoDownloadConfigLoadTime) >= 86400000) {
            this.loadingAutoDownloadConfig = true;
            getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new g0(this, 2));
        }
    }

    public void loadDownloadingFiles() {
        getMessagesStorage().getStorageQueue().postRunnable(new a2(this, 2));
    }

    public void newDownloadObjectsAvailable(int i10) {
        int currentDownloadMask = getCurrentDownloadMask();
        if ((currentDownloadMask & 1) != 0 && (i10 & 1) != 0 && this.photoDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(1);
        }
        if ((currentDownloadMask & 2) != 0 && (i10 & 2) != 0 && this.audioDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(2);
        }
        if ((currentDownloadMask & 4) != 0 && (i10 & 4) != 0 && this.videoDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(4);
        }
        if ((currentDownloadMask & 8) == 0 || (i10 & 8) == 0 || !this.documentDownloadQueue.isEmpty()) {
            return;
        }
        getMessagesStorage().getDownloadQueue(8);
    }

    public void onDownloadComplete(MessageObject messageObject) {
        if (messageObject == null || messageObject.getDocument() == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c2(this, messageObject.getDocument(), messageObject, 0));
    }

    public void onDownloadFail(MessageObject messageObject, int i10) {
        if (messageObject == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new r4(this, messageObject, i10, 2));
        getMessagesStorage().getStorageQueue().postRunnable(new b2(this, messageObject, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processDownloadObjects(int i10, ArrayList<DownloadObject> arrayList) {
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList<DownloadObject> arrayList2 = i10 == 1 ? this.photoDownloadQueue : i10 == 2 ? this.audioDownloadQueue : i10 == 4 ? this.videoDownloadQueue : this.documentDownloadQueue;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            DownloadObject downloadObject = arrayList.get(i11);
            TLObject tLObject = downloadObject.object;
            TLRPC.PhotoSize photoSize3 = null;
            if (tLObject instanceof TLRPC.Document) {
                photoSize2 = FileLoader.getAttachFileName((TLRPC.Document) tLObject);
            } else if (tLObject instanceof TLRPC.Photo) {
                photoSize3 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
                photoSize2 = FileLoader.getAttachFileName(photoSize3);
            } else {
                photoSize = null;
                if (photoSize3 != null && !this.downloadQueueKeys.containsKey(photoSize3)) {
                    if (photoSize == null) {
                        getFileLoader().loadFile(ImageLocation.getForPhoto(photoSize, (TLRPC.Photo) downloadObject.object), downloadObject.parent, null, 0, downloadObject.secret ? 2 : downloadObject.forceCache ? 1 : 0);
                    } else {
                        TLObject tLObject2 = downloadObject.object;
                        if (tLObject2 instanceof TLRPC.Document) {
                            getFileLoader().loadFile((TLRPC.Document) tLObject2, downloadObject.parent, 0, downloadObject.secret ? 2 : 0);
                        }
                    }
                    arrayList2.add(downloadObject);
                    this.downloadQueueKeys.put(photoSize3, downloadObject);
                    this.downloadQueuePairs.put(new Pair<>(Long.valueOf(downloadObject.id), Integer.valueOf(downloadObject.type)), downloadObject);
                }
            }
            TLRPC.PhotoSize photoSize4 = photoSize3;
            photoSize3 = photoSize2;
            photoSize = photoSize4;
            if (photoSize3 != null) {
                if (photoSize == null) {
                }
                arrayList2.add(downloadObject);
                this.downloadQueueKeys.put(photoSize3, downloadObject);
                this.downloadQueuePairs.put(new Pair<>(Long.valueOf(downloadObject.id), Integer.valueOf(downloadObject.type)), downloadObject);
            }
        }
    }

    public void removeLoadingFileObserver(FileDownloadProgressListener fileDownloadProgressListener) {
        if (this.listenerInProgress) {
            this.deleteLaterArray.add(fileDownloadProgressListener);
            return;
        }
        String str = this.observersByTag.get(fileDownloadProgressListener.getObserverTag());
        if (str != null) {
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList = this.loadingFileObservers.get(str);
            if (arrayList != null) {
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    WeakReference<FileDownloadProgressListener> weakReference = arrayList.get(i10);
                    if (weakReference.get() == null || weakReference.get() == fileDownloadProgressListener) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    this.loadingFileObservers.remove(str);
                }
            }
            this.observersByTag.remove(fileDownloadProgressListener.getObserverTag());
        }
    }

    public void savePresetToServer(int i10) {
        Preset currentRoamingPreset;
        boolean z10;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i10 == 0) {
            currentRoamingPreset = getCurrentMobilePreset();
            z10 = this.mobilePreset.enabled;
        } else if (i10 == 1) {
            currentRoamingPreset = getCurrentWiFiPreset();
            z10 = this.wifiPreset.enabled;
        } else {
            currentRoamingPreset = getCurrentRoamingPreset();
            z10 = this.roamingPreset.enabled;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        tL_autoDownloadSettings.audio_preload_next = currentRoamingPreset.preloadMusic;
        tL_autoDownloadSettings.video_preload_large = currentRoamingPreset.preloadVideo;
        tL_autoDownloadSettings.phonecalls_less_data = currentRoamingPreset.lessCallData;
        tL_autoDownloadSettings.video_upload_maxbitrate = currentRoamingPreset.maxVideoBitrate;
        tL_autoDownloadSettings.disabled = !z10;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            int[] iArr = currentRoamingPreset.mask;
            if (i11 >= iArr.length) {
                break;
            }
            int i12 = iArr[i11];
            if ((i12 & 1) != 0) {
                z11 = true;
            }
            if ((i12 & 4) != 0) {
                z12 = true;
            }
            if ((i12 & 8) != 0) {
                z13 = true;
            }
            if (z11 && z12 && z13) {
                break;
            } else {
                i11++;
            }
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        tL_autoDownloadSettings2.photo_size_max = z11 ? (int) currentRoamingPreset.sizes[0] : 0;
        tL_autoDownloadSettings2.video_size_max = z12 ? currentRoamingPreset.sizes[1] : 0L;
        tL_autoDownloadSettings2.file_size_max = z13 ? currentRoamingPreset.sizes[2] : 0L;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new e5(3));
    }

    public void startDownloadFile(TLRPC.Document document, MessageObject messageObject) {
        TLRPC.Document document2;
        if (messageObject == null || (document2 = messageObject.getDocument()) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c2(this, document2, messageObject, 1));
    }

    public void swapLoadingPriority(MessageObject messageObject, MessageObject messageObject2) {
        int indexOf = this.downloadingFiles.indexOf(messageObject);
        int indexOf2 = this.downloadingFiles.indexOf(messageObject2);
        if (indexOf >= 0 && indexOf2 >= 0) {
            this.downloadingFiles.set(indexOf, messageObject2);
            this.downloadingFiles.set(indexOf2, messageObject);
        }
        updateFilesLoadingPriority();
    }

    public void updateFilesLoadingPriority() {
        for (int size = this.downloadingFiles.size() - 1; size >= 0; size--) {
            if (getFileLoader().isLoadingFile(this.downloadingFiles.get(size).getFileName())) {
                getFileLoader().loadFile(this.downloadingFiles.get(size).getDocument(), this.downloadingFiles.get(size), 2, 0);
            }
        }
    }

    public void addLoadingFileObserver(String str, MessageObject messageObject, FileDownloadProgressListener fileDownloadProgressListener) {
        if (this.listenerInProgress) {
            this.addLaterArray.put(str, fileDownloadProgressListener);
            return;
        }
        removeLoadingFileObserver(fileDownloadProgressListener);
        ArrayList<WeakReference<FileDownloadProgressListener>> arrayList = this.loadingFileObservers.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.loadingFileObservers.put(str, arrayList);
        }
        arrayList.add(new WeakReference<>(fileDownloadProgressListener));
        if (messageObject != null) {
            ArrayList<MessageObject> arrayList2 = this.loadingFileMessagesObservers.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                this.loadingFileMessagesObservers.put(str, arrayList2);
            }
            arrayList2.add(messageObject);
        }
        this.observersByTag.put(fileDownloadProgressListener.getObserverTag(), str);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class Preset {
        public boolean enabled;
        public boolean lessCallData;
        public int[] mask;
        public int maxVideoBitrate;
        public boolean preloadMusic;
        public boolean preloadStories;
        public boolean preloadVideo;
        public long[] sizes;

        public Preset(int[] iArr, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, int i10, boolean z14) {
            int[] iArr2 = new int[4];
            this.mask = iArr2;
            this.sizes = new long[4];
            System.arraycopy(iArr, 0, iArr2, 0, Math.max(iArr.length, iArr2.length));
            long[] jArr = this.sizes;
            jArr[0] = j10;
            jArr[1] = j11;
            jArr[2] = j12;
            jArr[3] = 524288;
            this.preloadVideo = z10;
            this.preloadMusic = z11;
            this.lessCallData = z13;
            this.maxVideoBitrate = i10;
            this.enabled = z12;
            this.preloadStories = z14;
        }

        public boolean equals(Preset preset) {
            int[] iArr = this.mask;
            int i10 = iArr[0];
            int[] iArr2 = preset.mask;
            if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
                long[] jArr = this.sizes;
                long j10 = jArr[0];
                long[] jArr2 = preset.sizes;
                if (j10 == jArr2[0] && jArr[1] == jArr2[1] && jArr[2] == jArr2[2] && jArr[3] == jArr2[3] && this.preloadVideo == preset.preloadVideo && this.preloadMusic == preset.preloadMusic && this.maxVideoBitrate == preset.maxVideoBitrate && this.preloadStories == preset.preloadStories) {
                    return true;
                }
            }
            return false;
        }

        public boolean isEnabled() {
            int i10 = 0;
            while (true) {
                int[] iArr = this.mask;
                if (i10 >= iArr.length) {
                    return false;
                }
                if (iArr[i10] != 0) {
                    return true;
                }
                i10++;
            }
        }

        public void set(Preset preset) {
            int[] iArr = preset.mask;
            int[] iArr2 = this.mask;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            long[] jArr = preset.sizes;
            long[] jArr2 = this.sizes;
            System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
            this.preloadVideo = preset.preloadVideo;
            this.preloadMusic = preset.preloadMusic;
            this.lessCallData = preset.lessCallData;
            this.maxVideoBitrate = preset.maxVideoBitrate;
            this.preloadStories = preset.preloadStories;
        }

        public String toString() {
            return this.mask[0] + "_" + this.mask[1] + "_" + this.mask[2] + "_" + this.mask[3] + "_" + this.sizes[0] + "_" + this.sizes[1] + "_" + this.sizes[2] + "_" + this.sizes[3] + "_" + (this.preloadVideo ? 1 : 0) + "_" + (this.preloadMusic ? 1 : 0) + "_" + (this.enabled ? 1 : 0) + "_" + (this.lessCallData ? 1 : 0) + "_" + this.maxVideoBitrate + "_" + (this.preloadStories ? 1 : 0);
        }

        public void set(TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings) {
            this.preloadMusic = tL_autoDownloadSettings.audio_preload_next;
            this.preloadVideo = tL_autoDownloadSettings.video_preload_large;
            this.lessCallData = tL_autoDownloadSettings.phonecalls_less_data;
            this.maxVideoBitrate = tL_autoDownloadSettings.video_upload_maxbitrate;
            int i10 = 0;
            this.sizes[0] = Math.max(512000, tL_autoDownloadSettings.photo_size_max);
            this.sizes[1] = Math.max(512000L, tL_autoDownloadSettings.video_size_max);
            this.sizes[2] = Math.max(512000L, tL_autoDownloadSettings.file_size_max);
            while (true) {
                int[] iArr = this.mask;
                if (i10 < iArr.length) {
                    if (tL_autoDownloadSettings.photo_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                        iArr[i10] = iArr[i10] | 1;
                    } else {
                        iArr[i10] = iArr[i10] & (-2);
                    }
                    if (tL_autoDownloadSettings.video_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                        iArr[i10] = iArr[i10] | 4;
                    } else {
                        iArr[i10] = iArr[i10] & (-5);
                    }
                    if (tL_autoDownloadSettings.file_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                        iArr[i10] = iArr[i10] | 8;
                    } else {
                        iArr[i10] = iArr[i10] & (-9);
                    }
                    i10++;
                } else {
                    this.preloadStories = true;
                    return;
                }
            }
        }

        public Preset(String str, String str2) {
            String[] split;
            this.mask = new int[4];
            this.sizes = new long[4];
            String[] split2 = str.split("_");
            if (split2.length >= 11) {
                this.mask[0] = Utilities.parseInt((CharSequence) split2[0]).intValue();
                this.mask[1] = Utilities.parseInt((CharSequence) split2[1]).intValue();
                this.mask[2] = Utilities.parseInt((CharSequence) split2[2]).intValue();
                this.mask[3] = Utilities.parseInt((CharSequence) split2[3]).intValue();
                this.sizes[0] = Utilities.parseInt((CharSequence) split2[4]).intValue();
                this.sizes[1] = Utilities.parseInt((CharSequence) split2[5]).intValue();
                this.sizes[2] = Utilities.parseInt((CharSequence) split2[6]).intValue();
                this.sizes[3] = Utilities.parseInt((CharSequence) split2[7]).intValue();
                this.preloadVideo = Utilities.parseInt((CharSequence) split2[8]).intValue() == 1;
                this.preloadMusic = Utilities.parseInt((CharSequence) split2[9]).intValue() == 1;
                this.enabled = Utilities.parseInt((CharSequence) split2[10]).intValue() == 1;
                if (split2.length >= 12) {
                    this.lessCallData = Utilities.parseInt((CharSequence) split2[11]).intValue() == 1;
                    split = null;
                } else {
                    split = str2.split("_");
                    this.lessCallData = Utilities.parseInt((CharSequence) split[11]).intValue() == 1;
                }
                if (split2.length >= 13) {
                    this.maxVideoBitrate = Utilities.parseInt((CharSequence) split2[12]).intValue();
                } else {
                    split = split == null ? str2.split("_") : split;
                    this.maxVideoBitrate = Utilities.parseInt((CharSequence) split[12]).intValue();
                }
                if (split2.length >= 14) {
                    this.preloadStories = Utilities.parseInt((CharSequence) split2[13]).intValue() == 1;
                } else {
                    this.preloadStories = Utilities.parseInt((CharSequence) (split == null ? str2.split("_") : split)[13]).intValue() == 1;
                }
            }
        }
    }

    public boolean canDownloadMedia(int i10, long j10) {
        Preset currentMobilePreset;
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentWiFiPreset();
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentRoamingPreset();
        } else {
            if (!this.mobilePreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentMobilePreset();
        }
        return (i10 == 1 || (j10 != 0 && j10 <= currentMobilePreset.sizes[typeToIndex(i10)])) && (i10 == 2 || (i10 & currentMobilePreset.mask[1]) != 0);
    }

    public int canDownloadMediaType(MessageObject messageObject, long j10) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (messageObject.type == 23) {
            return (!SharedConfig.isAutoplayVideo() || (storyItem = ((TLRPC.TL_messageMediaStory) MessageObject.getMedia(messageObject)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? 0 : 2;
        }
        if (messageObject.sponsoredMedia != null) {
            return 2;
        }
        if (messageObject.isHiddenSensitive()) {
            return 0;
        }
        return canDownloadMediaInternal(messageObject, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r7.user_id)) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0092, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r18.from_id.user_id)) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d1, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r18.from_id.user_id)) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int canDownloadMedia(TLRPC.Message message) {
        int i10;
        char c10;
        int autodownloadNetworkType;
        Preset currentMobilePreset;
        long j10;
        if (message == null || (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return canPreloadStories() ? 2 : 0;
        }
        boolean isVideoMessage = MessageObject.isVideoMessage(message);
        if (isVideoMessage || MessageObject.isGifMessage(message) || MessageObject.isRoundVideoMessage(message) || MessageObject.isGameMessage(message)) {
            i10 = 4;
        } else if (MessageObject.isVoiceMessage(message)) {
            i10 = 2;
        } else if (MessageObject.isPhoto(message) || MessageObject.isStickerMessage(message) || MessageObject.isAnimatedStickerMessage(message)) {
            i10 = 1;
        } else {
            if (MessageObject.getDocument(message) == null) {
                return 0;
            }
            i10 = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c10 = 2;
                } else {
                    TLRPC.Chat chat = peer.channel_id != 0 ? getMessagesController().getChat(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (ChatObject.isChannel(chat) && chat.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
                if (autodownloadNetworkType == 1) {
                    if (!this.wifiPreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentWiFiPreset();
                } else if (autodownloadNetworkType == 2) {
                    if (!this.roamingPreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentRoamingPreset();
                } else {
                    if (!this.mobilePreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentMobilePreset();
                }
                int i11 = currentMobilePreset.mask[c10];
                if (i10 == 2) {
                    j10 = Math.max(524288L, currentMobilePreset.sizes[typeToIndex(i10)]);
                } else {
                    j10 = currentMobilePreset.sizes[typeToIndex(i10)];
                }
                long messageSize = MessageObject.getMessageSize(message);
                return (isVideoMessage || !currentMobilePreset.preloadVideo || messageSize <= j10 || j10 <= 2097152) ? ((i10 != 1 || (messageSize != 0 && messageSize <= j10)) && (i10 == 2 || (i11 & i10) != 0)) ? 1 : 0 : (i11 & i10) != 0 ? 2 : 0;
            }
            c10 = 0;
            autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
            if (autodownloadNetworkType == 1) {
            }
            int i112 = currentMobilePreset.mask[c10];
            if (i10 == 2) {
            }
            long messageSize2 = MessageObject.getMessageSize(message);
            if (isVideoMessage) {
            }
        }
        c10 = 1;
        autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
        }
        int i1122 = currentMobilePreset.mask[c10];
        if (i10 == 2) {
        }
        long messageSize22 = MessageObject.getMessageSize(message);
        if (isVideoMessage) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r5.user_id)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x009a, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r14.from_id.user_id)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d9, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r14.from_id.user_id)) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int canDownloadMediaInternal(MessageObject messageObject, long j10) {
        TLRPC.Message message;
        int i10;
        char c10;
        int autodownloadNetworkType;
        Preset currentMobilePreset;
        long j11;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return 0;
        }
        if (message.media instanceof TLRPC.TL_messageMediaStory) {
            return canPreloadStories() ? 2 : 0;
        }
        boolean isVideoMessage = MessageObject.isVideoMessage(message);
        if (isVideoMessage || MessageObject.isGifMessage(message) || MessageObject.isRoundVideoMessage(message) || MessageObject.isGameMessage(message)) {
            i10 = 4;
        } else if (MessageObject.isVoiceMessage(message)) {
            i10 = 2;
        } else if (MessageObject.isPhoto(message) || MessageObject.isStickerMessage(message) || MessageObject.isAnimatedStickerMessage(message)) {
            i10 = 1;
        } else {
            if (MessageObject.getDocument(message) == null) {
                return 0;
            }
            i10 = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c10 = 2;
                } else {
                    TLRPC.Chat chat = peer.channel_id != 0 ? getMessagesController().getChat(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (ChatObject.isChannel(chat) && chat.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
                if (autodownloadNetworkType == 1) {
                    if (!this.wifiPreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentWiFiPreset();
                } else if (autodownloadNetworkType == 2) {
                    if (!this.roamingPreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentRoamingPreset();
                } else {
                    if (!this.mobilePreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentMobilePreset();
                }
                int i11 = currentMobilePreset.mask[c10];
                if (i10 == 2) {
                    j11 = Math.max(524288L, currentMobilePreset.sizes[typeToIndex(i10)]);
                } else {
                    j11 = currentMobilePreset.sizes[typeToIndex(i10)];
                }
                return (isVideoMessage || !currentMobilePreset.preloadVideo || j10 <= j11 || j11 <= 2097152) ? ((i10 != 1 || (j10 != 0 && j10 <= j11)) && (i10 == 2 || (i11 & i10) != 0)) ? 1 : 0 : (i11 & i10) != 0 ? 2 : 0;
            }
            c10 = 0;
            autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
            if (autodownloadNetworkType == 1) {
            }
            int i112 = currentMobilePreset.mask[c10];
            if (i10 == 2) {
            }
            if (isVideoMessage) {
            }
        }
        c10 = 1;
        autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
        }
        int i1122 = currentMobilePreset.mask[c10];
        if (i10 == 2) {
        }
        if (isVideoMessage) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$savePresetToServer$3(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r5.user_id)) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006e, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r14.from_id.user_id)) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ad, code lost:
    
        if (getContactsController().contactsDict.containsKey(java.lang.Long.valueOf(r14.from_id.user_id)) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int canDownloadMedia(TLRPC.Message message, TLRPC.MessageMedia messageMedia) {
        int i10;
        boolean z10;
        char c10;
        int autodownloadNetworkType;
        Preset currentMobilePreset;
        long j10;
        if (message == null || (messageMedia instanceof TLRPC.TL_messageMediaStory)) {
            return canPreloadStories() ? 2 : 0;
        }
        if (MessageObject.isVideoDocument(messageMedia.document)) {
            i10 = 4;
            z10 = true;
        } else {
            if (MessageObject.isVoiceDocument(messageMedia.document)) {
                i10 = 2;
            } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                i10 = 1;
            } else {
                if (messageMedia.document == null) {
                    return 0;
                }
                i10 = 8;
            }
            z10 = false;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c10 = 2;
                } else {
                    TLRPC.Chat chat = peer.channel_id != 0 ? getMessagesController().getChat(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (ChatObject.isChannel(chat) && chat.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
                if (autodownloadNetworkType == 1) {
                    if (!this.wifiPreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentWiFiPreset();
                } else if (autodownloadNetworkType == 2) {
                    if (!this.roamingPreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentRoamingPreset();
                } else {
                    if (!this.mobilePreset.enabled) {
                        return 0;
                    }
                    currentMobilePreset = getCurrentMobilePreset();
                }
                int i11 = currentMobilePreset.mask[c10];
                if (i10 == 2) {
                    j10 = Math.max(524288L, currentMobilePreset.sizes[typeToIndex(i10)]);
                } else {
                    j10 = currentMobilePreset.sizes[typeToIndex(i10)];
                }
                long mediaSize = MessageObject.getMediaSize(messageMedia);
                return (z10 || !currentMobilePreset.preloadVideo || mediaSize <= j10 || j10 <= 2097152) ? ((i10 != 1 || (mediaSize != 0 && mediaSize <= j10)) && (i10 == 2 || (i11 & i10) != 0)) ? 1 : 0 : (i11 & i10) != 0 ? 2 : 0;
            }
            c10 = 0;
            autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
            if (autodownloadNetworkType == 1) {
            }
            int i112 = currentMobilePreset.mask[c10];
            if (i10 == 2) {
            }
            long mediaSize2 = MessageObject.getMediaSize(messageMedia);
            if (z10) {
            }
        }
        c10 = 1;
        autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
        }
        int i1122 = currentMobilePreset.mask[c10];
        if (i10 == 2) {
        }
        long mediaSize22 = MessageObject.getMediaSize(messageMedia);
        if (z10) {
        }
    }
}
