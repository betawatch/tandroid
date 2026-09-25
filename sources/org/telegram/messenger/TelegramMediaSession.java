package org.telegram.messenger;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class TelegramMediaSession {
    private static final String CONTENT_STYLE_BROWSABLE_HINT = "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT";
    private static final int CONTENT_STYLE_GRID_ITEM_HINT_VALUE = 2;
    private static final int CONTENT_STYLE_LIST_ITEM_HINT_VALUE = 1;
    private static final String CONTENT_STYLE_PLAYABLE_HINT = "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT";
    private static final String CONTENT_STYLE_SUPPORTED = "android.media.browse.CONTENT_STYLE_SUPPORTED";
    private static final String MEDIA_ID_CHAT_PREFIX = "__CHAT_";
    private static final String MEDIA_ID_ROOT = "__ROOT__";
    private static final String SESSION_TAG = "TelegramMediaSession";
    private static final String SLOT_RESERVATION_QUEUE = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE";
    private static final String SLOT_RESERVATION_SKIP_TO_NEXT = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT";
    private static final String SLOT_RESERVATION_SKIP_TO_PREV = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
    private static volatile TelegramMediaSession instance;
    private final Context appContext;
    private RectF bitmapRect;
    private boolean chatsLoaded;
    private int currentAccount;
    private long lastSelectedDialog;
    private boolean loadingChats;
    private Paint roundPaint;
    private final android.support.v4.media.session.b0 session;
    private final ArrayList<Long> dialogs = new ArrayList<>();
    private final a0.i users = new a0.i();
    private final a0.i chats = new a0.i();
    private final a0.i musicObjects = new a0.i();
    private final a0.i musicQueues = new a0.i();
    private final a0.i pendingMusicLoads = new a0.i();
    private final ArrayList<PendingBrowseRequest> pendingBrowseRequests = new ArrayList<>();

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public interface BrowseChildrenCallback {
        void onResult(List<MediaBrowser.MediaItem> list);
    }

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public static final class PendingBrowseRequest {
        final BrowseChildrenCallback callback;
        final String parentMediaId;

        public PendingBrowseRequest(String str, BrowseChildrenCallback browseChildrenCallback) {
            this.parentMediaId = str;
            this.callback = browseChildrenCallback;
        }
    }

    private TelegramMediaSession(Context context) {
        this.appContext = context;
        int i10 = UserConfig.selectedAccount;
        this.currentAccount = i10;
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(i10), "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.b0 b0Var = new android.support.v4.media.session.b0(context, SESSION_TAG, null, null);
        this.session = b0Var;
        android.support.v4.media.session.v vVar = b0Var.a;
        vVar.a.setFlags(3);
        b0Var.d(new SessionCallback(), null);
        vVar.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean(SLOT_RESERVATION_QUEUE, true);
        bundle.putBoolean(SLOT_RESERVATION_SKIP_TO_PREV, true);
        bundle.putBoolean(SLOT_RESERVATION_SKIP_TO_NEXT, true);
        vVar.a.setExtras(bundle);
        b0Var.c(true);
        ArrayList arrayList = new ArrayList();
        b0Var.f(new PlaybackStateCompat(0, 0L, 0L, 1.0f, getAvailableActions(), 0, null, SystemClock.elapsedRealtime(), arrayList, -1L, null));
        updateRepeatMode();
        updateShuffleMode();
        NotificationCenter.getGlobalInstance().addObserver(new x1(this, 1), NotificationCenter.activeAccountChanged);
    }

    private void applyQueueFor(long j3) {
        if (j3 == 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.musicObjects.f(j3);
        ArrayList arrayList2 = (ArrayList) this.musicQueues.f(j3);
        if (arrayList == null || arrayList.isEmpty() || arrayList2 == null) {
            return;
        }
        this.session.g(arrayList2);
        if (DialogObject.isUserDialog(j3)) {
            TLRPC.User user = (TLRPC.User) this.users.f(j3);
            this.session.a.a.setQueueTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : "DELETED USER");
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) this.chats.f(-j3);
            this.session.a.a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
        }
        MessageObject messageObject = (MessageObject) arrayList.get(0);
        a4.m mVar = new a4.m(1);
        mVar.v0((long) (messageObject.getDuration() * 1000.0d));
        mVar.w0("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
        mVar.w0("android.media.metadata.TITLE", messageObject.getMusicTitle());
        this.session.e(new MediaMetadataCompat((Bundle) mVar.b));
    }

    private Bitmap createRoundBitmap(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            Bitmap decodeFile = BitmapFactory.decodeFile(file.toString(), options);
            if (decodeFile == null) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
            if (this.roundPaint == null) {
                this.roundPaint = new Paint(1);
                this.bitmapRect = new RectF();
            }
            this.roundPaint.setShader(bitmapShader);
            this.bitmapRect.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
            canvas.drawRoundRect(this.bitmapRect, decodeFile.getWidth(), decodeFile.getHeight(), this.roundPaint);
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    private long getDialogIdFromMediaId(String str) {
        if (str != null && str.startsWith(MEDIA_ID_CHAT_PREFIX)) {
            try {
                return Long.parseLong(str.substring(7));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0L;
    }

    public static TelegramMediaSession getInstance(Context context) {
        if (instance == null) {
            synchronized (TelegramMediaSession.class) {
                try {
                    if (instance == null) {
                        instance = new TelegramMediaSession(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensureLoaded$2(Runnable runnable, List list) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getMusicDialogsSortedByVisibleOrder$1(HashMap hashMap, Long l4, Long l10) {
        Integer num = (Integer) hashMap.get(l4);
        Integer num2 = (Integer) hashMap.get(l10);
        if (num == null && num2 == null) {
            return Long.compare(l4.longValue(), l10.longValue());
        }
        if (num == null) {
            return 1;
        }
        if (num2 == null) {
            return -1;
        }
        return Integer.compare(num.intValue(), num2.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBrowseChildren$3(BrowseChildrenCallback browseChildrenCallback, String str) {
        browseChildrenCallback.onResult(loadChildrenSync(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadChats$4(int i10, ArrayList arrayList, a0.i iVar, a0.i iVar2) {
        if (i10 != this.currentAccount) {
            return;
        }
        this.dialogs.clear();
        this.dialogs.addAll(arrayList);
        this.users.b();
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            this.users.k((TLRPC.User) iVar.n(i11), iVar.j(i11));
        }
        this.chats.b();
        for (int i12 = 0; i12 < iVar2.m(); i12++) {
            this.chats.k((TLRPC.Chat) iVar2.n(i12), iVar2.j(i12));
        }
        this.chatsLoaded = true;
        this.loadingChats = false;
        if (this.lastSelectedDialog == 0 && !this.dialogs.isEmpty()) {
            this.lastSelectedDialog = this.dialogs.get(0).longValue();
        }
        ArrayList arrayList2 = new ArrayList(this.pendingBrowseRequests);
        this.pendingBrowseRequests.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            PendingBrowseRequest pendingBrowseRequest = (PendingBrowseRequest) arrayList2.get(i13);
            loadBrowseChildren(pendingBrowseRequest.parentMediaId, pendingBrowseRequest.callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadChats$5(MessagesStorage messagesStorage, int i10) {
        ArrayList arrayList = new ArrayList();
        a0.i iVar = new a0.i();
        a0.i iVar2 = new a0.i();
        try {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            SQLiteDatabase database = messagesStorage.getDatabase();
            Locale locale = Locale.US;
            int i11 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = 4", new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (!DialogObject.isEncryptedDialog(longValue)) {
                    arrayList.add(Long.valueOf(longValue));
                    if (DialogObject.isUserDialog(longValue)) {
                        arrayList2.add(Long.valueOf(longValue));
                    } else {
                        arrayList3.add(Long.valueOf(-longValue));
                    }
                }
            }
            queryFinalized.dispose();
            if (!arrayList2.isEmpty()) {
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                messagesStorage.getUsersInternal(arrayList2, arrayList4);
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.User user = arrayList4.get(i12);
                    i12++;
                    TLRPC.User user2 = user;
                    iVar.k(user2, user2.id);
                }
            }
            if (!arrayList3.isEmpty()) {
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList3), arrayList5);
                int size2 = arrayList5.size();
                while (i11 < size2) {
                    TLRPC.Chat chat = arrayList5.get(i11);
                    i11++;
                    TLRPC.Chat chat2 = chat;
                    iVar2.k(chat2, chat2.id);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new ei.l3(this, i10, arrayList, iVar, iVar2, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMusicForDialog$6(int i10, long j3, ArrayList arrayList, ArrayList arrayList2) {
        if (i10 != this.currentAccount) {
            return;
        }
        this.musicObjects.k(arrayList, j3);
        this.musicQueues.k(arrayList2, j3);
        ArrayList arrayList3 = (ArrayList) this.pendingMusicLoads.f(j3);
        this.pendingMusicLoads.l(j3);
        if (j3 == this.lastSelectedDialog) {
            applyQueueFor(j3);
        }
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                ((Runnable) arrayList3.get(i11)).run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$loadMusicForDialog$7(MessagesStorage messagesStorage, long j3, int i10) {
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j3 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(i10).clientUserId);
                    byteBufferValue.reuse();
                    if (MessageObject.isMusicMessage(TLdeserialize)) {
                        TLdeserialize.id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j3;
                        i11 = i10;
                        try {
                            MessageObject messageObject = new MessageObject(i11, TLdeserialize, false, true);
                            arrayList.add(messageObject);
                            arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j3 + "_" + arrayList.size(), messageObject.getMusicTitle(), messageObject.getMusicAuthor(), null, null, null, null, null), arrayList2.size()));
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            AndroidUtilities.runOnUIThread(new ai.m8(this, i11, j3, arrayList, arrayList2, 7));
                        }
                    }
                }
            }
            i11 = i10;
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e7) {
            e = e7;
            i11 = i10;
        }
        AndroidUtilities.runOnUIThread(new ai.m8(this, i11, j3, arrayList, arrayList2, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.activeAccountChanged) {
            AndroidUtilities.runOnUIThread(new ug(this, 15));
        }
    }

    private void loadChats() {
        if (this.loadingChats) {
            return;
        }
        this.loadingChats = true;
        int i10 = this.currentAccount;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new q4(this, messagesStorage, i10, 22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<MediaBrowser.MediaItem> loadChildrenSync(String str) {
        long j3;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (MEDIA_ID_ROOT.equals(str)) {
            while (i10 < this.dialogs.size()) {
                long longValue = this.dialogs.get(i10).longValue();
                MediaDescription.Builder mediaId = new MediaDescription.Builder().setMediaId(MEDIA_ID_CHAT_PREFIX + longValue);
                Bitmap bitmap = null;
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = (TLRPC.User) this.users.f(longValue);
                    if (user != null) {
                        mediaId.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            fileLocation = userProfilePhoto.photo_small;
                        }
                    } else {
                        mediaId.setTitle("DELETED USER");
                    }
                    fileLocation = null;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) this.chats.f(-longValue);
                    if (chat != null) {
                        mediaId.setTitle(chat.title);
                        TLRPC.ChatPhoto chatPhoto = chat.photo;
                        if (chatPhoto != null) {
                            fileLocation = chatPhoto.photo_small;
                        }
                    } else {
                        mediaId.setTitle("DELETED CHAT");
                    }
                    fileLocation = null;
                }
                if (fileLocation != null && (bitmap = createRoundBitmap(FileLoader.getInstance(this.currentAccount).getPathToAttach(fileLocation, true))) != null) {
                    mediaId.setIconBitmap(bitmap);
                }
                if (fileLocation == null || bitmap == null) {
                    mediaId.setIconUri(Uri.parse("android.resource://" + this.appContext.getPackageName() + "/drawable/contact_blue"));
                }
                arrayList.add(new MediaBrowser.MediaItem(mediaId.build(), 1));
                i10++;
            }
        } else if (str != null && str.startsWith(MEDIA_ID_CHAT_PREFIX)) {
            try {
                j3 = Long.parseLong(str.replace(MEDIA_ID_CHAT_PREFIX, ""));
            } catch (Exception e) {
                FileLog.e(e);
                j3 = 0;
            }
            ArrayList arrayList2 = (ArrayList) this.musicObjects.f(j3);
            if (arrayList2 != null) {
                while (i10 < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i10);
                    MediaDescription.Builder mediaId2 = new MediaDescription.Builder().setMediaId(j3 + "_" + i10);
                    mediaId2.setTitle(messageObject.getMusicTitle());
                    mediaId2.setSubtitle(messageObject.getMusicAuthor());
                    arrayList.add(new MediaBrowser.MediaItem(mediaId2.build(), 2));
                    i10++;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadMusicForDialog(long j3, Runnable runnable) {
        ArrayList arrayList = (ArrayList) this.pendingMusicLoads.f(j3);
        if (arrayList != null) {
            if (runnable != null) {
                arrayList.add(runnable);
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (runnable != null) {
            arrayList2.add(runnable);
        }
        this.pendingMusicLoads.k(arrayList2, j3);
        int i10 = this.currentAccount;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new j7(this, messagesStorage, j3, i10, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAccountSwitched() {
        int i10 = UserConfig.selectedAccount;
        this.currentAccount = i10;
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(i10), "auto_lastSelectedDialog", 0L);
        this.chatsLoaded = false;
        this.loadingChats = false;
        this.dialogs.clear();
        this.users.b();
        this.chats.b();
        this.musicObjects.b();
        this.musicQueues.b();
        this.pendingMusicLoads.b();
        try {
            this.session.g(null);
            this.session.a.a.setQueueTitle(null);
        } catch (Throwable unused) {
        }
    }

    public static TelegramMediaSession peekInstance() {
        return instance;
    }

    public Bundle buildRootHints() {
        Bundle e = ok.e(2, CONTENT_STYLE_SUPPORTED, CONTENT_STYLE_BROWSABLE_HINT, true);
        e.putInt(CONTENT_STYLE_PLAYABLE_HINT, 1);
        return e;
    }

    public void ensureLoaded(Runnable runnable) {
        if (!this.chatsLoaded) {
            loadBrowseChildren(MEDIA_ID_ROOT, new h4(runnable));
        } else if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public long getAvailableActions() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return 2477828L;
        }
        long j3 = MediaController.getInstance().isMessagePaused() ? 2477828L : 2477830L;
        return playingMessageObject.isMusic() ? j3 | 48 : j3;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public MediaSession.Token getFrameworkSessionToken() {
        return (MediaSession.Token) this.session.a.c.b;
    }

    public TLRPC.Chat getMusicChat(long j3) {
        return (TLRPC.Chat) this.chats.f(j3);
    }

    public ArrayList<Long> getMusicDialogs() {
        return this.dialogs;
    }

    public ArrayList<Long> getMusicDialogsSortedByVisibleOrder() {
        ArrayList<Long> arrayList = new ArrayList<>(this.dialogs);
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (dialog != null) {
                hashMap.put(Long.valueOf(dialog.id), Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new qk(hashMap, 0));
        return arrayList;
    }

    public ArrayList<MessageObject> getMusicMessages(long j3) {
        return (ArrayList) this.musicObjects.f(j3);
    }

    public TLRPC.User getMusicUser(long j3) {
        return (TLRPC.User) this.users.f(j3);
    }

    public Bitmap getRoundedAvatar(File file) {
        return createRoundBitmap(file);
    }

    public android.support.v4.media.session.b0 getSession() {
        return this.session;
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.session.a.c;
    }

    public boolean isChatsLoaded() {
        return this.chatsLoaded;
    }

    public boolean isPasscodeLocked() {
        int i10;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (SharedConfig.passcodeHash.length() <= 0) {
            return false;
        }
        if (SharedConfig.appLocked) {
            return true;
        }
        return !(SharedConfig.autoLockIn == 0 || (i10 = SharedConfig.lastPauseTime) == 0 || i10 + SharedConfig.autoLockIn > elapsedRealtime) || elapsedRealtime + 5 < SharedConfig.lastPauseTime;
    }

    public void loadBrowseChildren(String str, BrowseChildrenCallback browseChildrenCallback) {
        if (!this.chatsLoaded) {
            this.pendingBrowseRequests.add(new PendingBrowseRequest(str, browseChildrenCallback));
            loadChats();
            return;
        }
        long dialogIdFromMediaId = getDialogIdFromMediaId(str);
        if (dialogIdFromMediaId == 0 || this.musicObjects.f(dialogIdFromMediaId) != null) {
            browseChildrenCallback.onResult(loadChildrenSync(str));
        } else {
            loadMusicForDialog(dialogIdFromMediaId, new n8(this, browseChildrenCallback, str, 27));
        }
    }

    public void publishMetadata(MessageObject messageObject, jf.a aVar, Bitmap bitmap) {
        if (messageObject == null) {
            return;
        }
        a4.m mVar = new a4.m(1);
        mVar.w0("android.media.metadata.ALBUM_ARTIST", messageObject.getMusicAuthor());
        mVar.w0("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
        mVar.v0((long) (messageObject.getDuration() * 1000.0d));
        mVar.w0("android.media.metadata.TITLE", messageObject.getMusicTitle());
        mVar.w0("android.media.metadata.ALBUM", (aVar == null || !messageObject.isMusic()) ? null : aVar.f);
        if (bitmap != null && !bitmap.isRecycled()) {
            mVar.t0("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.session.e(new MediaMetadataCompat((Bundle) mVar.b));
    }

    public void publishPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.session.f(playbackStateCompat);
    }

    public void release() {
        android.support.v4.media.session.b0 b0Var = this.session;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void updateRepeatMode() {
        int i10 = SharedConfig.repeatMode;
        this.session.h(i10 != 1 ? i10 != 2 ? 0 : 1 : 2);
    }

    public void updateShuffleMode() {
        this.session.i(SharedConfig.shuffleMusic ? 1 : 0);
    }

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public final class SessionCallback extends android.support.v4.media.session.s {
        private SessionCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$notifyPlayStateForNotificationRefresh$0() {
            NotificationCenter.getInstance(TelegramMediaSession.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, 0);
        }

        private void notifyPlayStateForNotificationRefresh() {
            AndroidUtilities.runOnUIThread(new f1(this, 10));
        }

        @Override // android.support.v4.media.session.s
        public void onCustomAction(String str, Bundle bundle) {
            if (MusicPlayerService.NOTIFY_REPEAT.equals(str)) {
                SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                TelegramMediaSession.this.updateRepeatMode();
            } else if (MusicPlayerService.NOTIFY_SHUFFLE.equals(str)) {
                MediaController.getInstance().setPlaybackOrderType(SharedConfig.shuffleMusic ? 0 : 2);
                TelegramMediaSession.this.updateShuffleMode();
            }
        }

        @Override // android.support.v4.media.session.s
        public void onPause() {
            MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
        }

        @Override // android.support.v4.media.session.s
        public void onPlay() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().playMessage(playingMessageObject);
            } else if (TelegramMediaSession.this.lastSelectedDialog != 0) {
                lambda$onPlayFromMediaId$1(TelegramMediaSession.this.lastSelectedDialog + "_0", null);
            }
        }

        @Override // android.support.v4.media.session.s
        /* renamed from: onPlayFromMediaId, reason: merged with bridge method [inline-methods] */
        public void lambda$onPlayFromMediaId$1(String str, Bundle bundle) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String[] split = str.split("_");
            if (split.length != 2) {
                return;
            }
            try {
                long parseLong = Long.parseLong(split[0]);
                int parseInt = Integer.parseInt(split[1]);
                ArrayList<MessageObject> arrayList = (ArrayList) TelegramMediaSession.this.musicObjects.f(parseLong);
                if (arrayList == null) {
                    TelegramMediaSession.this.loadMusicForDialog(parseLong, new g0(this, str, bundle, 5));
                    return;
                }
                ArrayList arrayList2 = (ArrayList) TelegramMediaSession.this.musicQueues.f(parseLong);
                if (parseInt >= 0 && parseInt < arrayList.size()) {
                    TelegramMediaSession.this.lastSelectedDialog = parseLong;
                    MessagesController.getNotificationsSettings(TelegramMediaSession.this.currentAccount).edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                    MediaController.getInstance().setPlaylist(arrayList, arrayList.get(parseInt), 0L, false, null);
                    TelegramMediaSession.this.session.g(arrayList2);
                    if (DialogObject.isUserDialog(parseLong)) {
                        TLRPC.User user = (TLRPC.User) TelegramMediaSession.this.users.f(parseLong);
                        TelegramMediaSession.this.session.a.a.setQueueTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : "DELETED USER");
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.f(-parseLong);
                        TelegramMediaSession.this.session.a.a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override // android.support.v4.media.session.s
        public void onPlayFromSearch(String str, Bundle bundle) {
            String str2;
            if (str == null || str.length() == 0) {
                return;
            }
            String lowerCase = str.toLowerCase();
            for (int i10 = 0; i10 < TelegramMediaSession.this.dialogs.size(); i10++) {
                long longValue = ((Long) TelegramMediaSession.this.dialogs.get(i10)).longValue();
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = (TLRPC.User) TelegramMediaSession.this.users.f(longValue);
                    if (user != null) {
                        String str3 = user.first_name;
                        String lowerCase2 = str3 != null ? str3.toLowerCase() : null;
                        String str4 = user.last_name;
                        String lowerCase3 = str4 != null ? str4.toLowerCase() : null;
                        if ((lowerCase2 != null && lowerCase2.contains(lowerCase)) || (lowerCase3 != null && lowerCase3.contains(lowerCase))) {
                            lambda$onPlayFromMediaId$1(longValue + "_0", null);
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.f(-longValue);
                    if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                        lambda$onPlayFromMediaId$1(longValue + "_0", null);
                        return;
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.s
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            lambda$onPlayFromMediaId$1(str, bundle);
        }

        @Override // android.support.v4.media.session.s
        public void onPrepareFromSearch(String str, Bundle bundle) {
            onPlayFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.s
        public void onSeekTo(long j3) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().seekToProgress(playingMessageObject, (float) ((j3 / 1000.0d) / playingMessageObject.getDuration()));
            }
        }

        @Override // android.support.v4.media.session.s
        public void onSetRepeatMode(int i10) {
            SharedConfig.setRepeatMode(i10 != 1 ? (i10 == 2 || i10 == 3) ? 1 : 0 : 2);
            TelegramMediaSession.this.updateRepeatMode();
            notifyPlayStateForNotificationRefresh();
        }

        @Override // android.support.v4.media.session.s
        public void onSetShuffleMode(int i10) {
            boolean z10 = true;
            if (i10 != 1 && i10 != 2) {
                z10 = false;
            }
            if (z10 != SharedConfig.shuffleMusic) {
                MediaController.getInstance().setPlaybackOrderType(z10 ? 2 : 0);
            }
            TelegramMediaSession.this.updateShuffleMode();
            notifyPlayStateForNotificationRefresh();
        }

        @Override // android.support.v4.media.session.s
        public void onSkipToNext() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                return;
            }
            MediaController.getInstance().playNextMessage();
        }

        @Override // android.support.v4.media.session.s
        public void onSkipToPrevious() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                return;
            }
            MediaController.getInstance().playPreviousMessage();
        }

        @Override // android.support.v4.media.session.s
        public void onSkipToQueueItem(long j3) {
            MediaController.getInstance().playMessageAtIndex((int) j3);
        }

        @Override // android.support.v4.media.session.s
        public void onPrepare() {
        }

        @Override // android.support.v4.media.session.s
        public void onStop() {
        }
    }
}
