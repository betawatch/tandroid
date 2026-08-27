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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    private final android.support.v4.media.session.d0 session;
    private final ArrayList<Long> dialogs = new ArrayList<>();
    private final a0.h users = new a0.h();
    private final a0.h chats = new a0.h();
    private final a0.h musicObjects = new a0.h();
    private final a0.h musicQueues = new a0.h();

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface BrowseChildrenCallback {
        void onResult(List<MediaBrowser.MediaItem> list);
    }

    private TelegramMediaSession(Context context) {
        this.appContext = context;
        int i10 = UserConfig.selectedAccount;
        this.currentAccount = i10;
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(i10), "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.d0 d0Var = new android.support.v4.media.session.d0(context, SESSION_TAG, null, null);
        this.session = d0Var;
        android.support.v4.media.session.w wVar = d0Var.a;
        wVar.a.setFlags(3);
        d0Var.d(new SessionCallback(), null);
        wVar.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean(SLOT_RESERVATION_QUEUE, true);
        bundle.putBoolean(SLOT_RESERVATION_SKIP_TO_PREV, true);
        bundle.putBoolean(SLOT_RESERVATION_SKIP_TO_NEXT, true);
        wVar.a.setExtras(bundle);
        d0Var.c(true);
        ArrayList arrayList = new ArrayList();
        d0Var.f(new PlaybackStateCompat(0, 0L, 0L, 1.0f, getAvailableActions(), 0, null, SystemClock.elapsedRealtime(), arrayList, -1L, null));
        updateRepeatMode();
        updateShuffleMode();
        NotificationCenter.getGlobalInstance().addObserver(new x1(this, 1), NotificationCenter.activeAccountChanged);
    }

    private void applyQueueFor(long j10) {
        if (j10 == 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.musicObjects.f(j10);
        ArrayList arrayList2 = (ArrayList) this.musicQueues.f(j10);
        if (arrayList == null || arrayList.isEmpty() || arrayList2 == null) {
            return;
        }
        this.session.g(arrayList2);
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user = (TLRPC.User) this.users.f(j10);
            this.session.a.a.setQueueTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : "DELETED USER");
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) this.chats.f(-j10);
            this.session.a.a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
        }
        MessageObject messageObject = (MessageObject) arrayList.get(0);
        android.support.v4.media.c cVar = new android.support.v4.media.c();
        cVar.d((long) (messageObject.getDuration() * 1000.0d), "android.media.metadata.DURATION");
        cVar.e("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
        cVar.e("android.media.metadata.TITLE", messageObject.getMusicTitle());
        this.session.e(cVar.a());
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
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
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
    public static /* synthetic */ int lambda$getMusicDialogsSortedByVisibleOrder$1(HashMap hashMap, Long l10, Long l11) {
        Integer num = (Integer) hashMap.get(l10);
        Integer num2 = (Integer) hashMap.get(l11);
        if (num == null && num2 == null) {
            return Long.compare(l10.longValue(), l11.longValue());
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
        this.chatsLoaded = true;
        this.loadingChats = false;
        if (this.lastSelectedDialog == 0 && !this.dialogs.isEmpty()) {
            this.lastSelectedDialog = this.dialogs.get(0).longValue();
        }
        applyQueueFor(this.lastSelectedDialog);
        browseChildrenCallback.onResult(loadChildrenSync(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$loadBrowseChildren$4(MessagesStorage messagesStorage, BrowseChildrenCallback browseChildrenCallback, String str) {
        try {
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            SQLiteDatabase database = messagesStorage.getDatabase();
            Locale locale = Locale.US;
            int i10 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = 4", new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (!DialogObject.isEncryptedDialog(longValue)) {
                    this.dialogs.add(Long.valueOf(longValue));
                    if (DialogObject.isUserDialog(longValue)) {
                        arrayList.add(Long.valueOf(longValue));
                    } else {
                        arrayList2.add(Long.valueOf(-longValue));
                    }
                }
            }
            queryFinalized.dispose();
            if (!this.dialogs.isEmpty()) {
                String join = TextUtils.join(",", this.dialogs);
                SQLiteDatabase database2 = messagesStorage.getDatabase();
                Locale locale2 = Locale.US;
                SQLiteCursor queryFinalized2 = database2.queryFinalized("SELECT uid, data, mid FROM media_v4 WHERE uid IN (" + join + ") AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                    if (byteBufferValue != null) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                        byteBufferValue.reuse();
                        if (MessageObject.isMusicMessage(TLdeserialize)) {
                            long longValue2 = queryFinalized2.longValue(0);
                            TLdeserialize.id = queryFinalized2.intValue(2);
                            TLdeserialize.dialog_id = longValue2;
                            ArrayList arrayList3 = (ArrayList) this.musicObjects.f(longValue2);
                            ArrayList arrayList4 = (ArrayList) this.musicQueues.f(longValue2);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                this.musicObjects.k(arrayList3, longValue2);
                                arrayList4 = new ArrayList();
                                this.musicQueues.k(arrayList4, longValue2);
                            }
                            MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, true);
                            arrayList3.add(0, messageObject);
                            arrayList4.add(0, new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(longValue2 + "_" + arrayList3.size(), messageObject.getMusicTitle(), messageObject.getMusicAuthor(), null, null, null, null, null), arrayList4.size()));
                        }
                    }
                }
                queryFinalized2.dispose();
                if (!arrayList.isEmpty()) {
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    messagesStorage.getUsersInternal(arrayList, arrayList5);
                    int size = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.User user = arrayList5.get(i11);
                        i11++;
                        TLRPC.User user2 = user;
                        this.users.k(user2, user2.id);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList6);
                    int size2 = arrayList6.size();
                    while (i10 < size2) {
                        TLRPC.Chat chat = arrayList6.get(i10);
                        i10++;
                        TLRPC.Chat chat2 = chat;
                        this.chats.k(chat2, chat2.id);
                    }
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AndroidUtilities.runOnUIThread(new a9((Object) this, (Object) browseChildrenCallback, str, 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.activeAccountChanged) {
            AndroidUtilities.runOnUIThread(new rg(this, 15));
        }
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
        long j10;
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
                j10 = Long.parseLong(str.replace(MEDIA_ID_CHAT_PREFIX, ""));
            } catch (Exception e9) {
                FileLog.e(e9);
                j10 = 0;
            }
            ArrayList arrayList2 = (ArrayList) this.musicObjects.f(j10);
            if (arrayList2 != null) {
                while (i10 < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i10);
                    MediaDescription.Builder mediaId2 = new MediaDescription.Builder().setMediaId(j10 + "_" + i10);
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
        Bundle e9 = y1.e(2, CONTENT_STYLE_SUPPORTED, CONTENT_STYLE_BROWSABLE_HINT, true);
        e9.putInt(CONTENT_STYLE_PLAYABLE_HINT, 1);
        return e9;
    }

    public void ensureLoaded(Runnable runnable) {
        if (!this.chatsLoaded) {
            loadBrowseChildren(MEDIA_ID_ROOT, new i4(runnable));
        } else if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public long getAvailableActions() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return 2477828L;
        }
        long j10 = MediaController.getInstance().isMessagePaused() ? 2477828L : 2477830L;
        return playingMessageObject.isMusic() ? j10 | 48 : j10;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public MediaSession.Token getFrameworkSessionToken() {
        return (MediaSession.Token) this.session.a.b.b;
    }

    public TLRPC.Chat getMusicChat(long j10) {
        return (TLRPC.Chat) this.chats.f(j10);
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
        Collections.sort(arrayList, new mk(hashMap, 0));
        return arrayList;
    }

    public ArrayList<MessageObject> getMusicMessages(long j10) {
        return (ArrayList) this.musicObjects.f(j10);
    }

    public TLRPC.User getMusicUser(long j10) {
        return (TLRPC.User) this.users.f(j10);
    }

    public Bitmap getRoundedAvatar(File file) {
        return createRoundBitmap(file);
    }

    public android.support.v4.media.session.d0 getSession() {
        return this.session;
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.session.a.b;
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
        if (this.chatsLoaded) {
            browseChildrenCallback.onResult(loadChildrenSync(str));
            return;
        }
        this.loadingChats = true;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new yi(this, messagesStorage, browseChildrenCallback, str, 3));
    }

    public void publishMetadata(MessageObject messageObject, se.a aVar, Bitmap bitmap) {
        if (messageObject == null) {
            return;
        }
        android.support.v4.media.c cVar = new android.support.v4.media.c();
        cVar.e("android.media.metadata.ALBUM_ARTIST", messageObject.getMusicAuthor());
        cVar.e("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
        cVar.d((long) (messageObject.getDuration() * 1000.0d), "android.media.metadata.DURATION");
        cVar.e("android.media.metadata.TITLE", messageObject.getMusicTitle());
        cVar.e("android.media.metadata.ALBUM", (aVar == null || !messageObject.isMusic()) ? null : aVar.f);
        if (bitmap != null && !bitmap.isRecycled()) {
            cVar.c("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.session.e(cVar.a());
    }

    public void publishPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.session.f(playbackStateCompat);
    }

    public void release() {
        android.support.v4.media.session.d0 d0Var = this.session;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public void updateRepeatMode() {
        int i10 = SharedConfig.repeatMode;
        this.session.h(i10 != 1 ? i10 != 2 ? 0 : 1 : 2);
    }

    public void updateShuffleMode() {
        this.session.i(SharedConfig.shuffleMusic ? 1 : 0);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public final class SessionCallback extends android.support.v4.media.session.t {
        private SessionCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$notifyPlayStateForNotificationRefresh$0() {
            NotificationCenter.getInstance(TelegramMediaSession.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, 0);
        }

        private void notifyPlayStateForNotificationRefresh() {
            AndroidUtilities.runOnUIThread(new d1(this, 10));
        }

        @Override // android.support.v4.media.session.t
        public void onCustomAction(String str, Bundle bundle) {
            if (MusicPlayerService.NOTIFY_REPEAT.equals(str)) {
                SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                TelegramMediaSession.this.updateRepeatMode();
            } else if (MusicPlayerService.NOTIFY_SHUFFLE.equals(str)) {
                MediaController.getInstance().setPlaybackOrderType(SharedConfig.shuffleMusic ? 0 : 2);
                TelegramMediaSession.this.updateShuffleMode();
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPause() {
            MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
        }

        @Override // android.support.v4.media.session.t
        public void onPlay() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().playMessage(playingMessageObject);
            } else if (TelegramMediaSession.this.lastSelectedDialog != 0) {
                onPlayFromMediaId(TelegramMediaSession.this.lastSelectedDialog + "_0", null);
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPlayFromMediaId(String str, Bundle bundle) {
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
                ArrayList arrayList2 = (ArrayList) TelegramMediaSession.this.musicQueues.f(parseLong);
                if (arrayList != null && parseInt >= 0 && parseInt < arrayList.size()) {
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
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }

        @Override // android.support.v4.media.session.t
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
                            onPlayFromMediaId(longValue + "_0", null);
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.f(-longValue);
                    if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                        onPlayFromMediaId(longValue + "_0", null);
                        return;
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.t
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            onPlayFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.t
        public void onPrepareFromSearch(String str, Bundle bundle) {
            onPlayFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.t
        public void onSeekTo(long j10) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().seekToProgress(playingMessageObject, (float) ((j10 / 1000.0d) / playingMessageObject.getDuration()));
            }
        }

        @Override // android.support.v4.media.session.t
        public void onSetRepeatMode(int i10) {
            SharedConfig.setRepeatMode(i10 != 1 ? (i10 == 2 || i10 == 3) ? 1 : 0 : 2);
            TelegramMediaSession.this.updateRepeatMode();
            notifyPlayStateForNotificationRefresh();
        }

        @Override // android.support.v4.media.session.t
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

        @Override // android.support.v4.media.session.t
        public void onSkipToNext() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                return;
            }
            MediaController.getInstance().playNextMessage();
        }

        @Override // android.support.v4.media.session.t
        public void onSkipToPrevious() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                return;
            }
            MediaController.getInstance().playPreviousMessage();
        }

        @Override // android.support.v4.media.session.t
        public void onSkipToQueueItem(long j10) {
            MediaController.getInstance().playMessageAtIndex((int) j10);
        }

        @Override // android.support.v4.media.session.t
        public void onPrepare() {
        }

        @Override // android.support.v4.media.session.t
        public void onStop() {
        }
    }
}
