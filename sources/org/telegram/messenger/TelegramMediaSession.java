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
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* loaded from: classes3.dex */
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
    private final MediaSessionCompat session;
    private final ArrayList<Long> dialogs = new ArrayList<>();
    private final LongSparseArray users = new LongSparseArray();
    private final LongSparseArray chats = new LongSparseArray();
    private final LongSparseArray musicObjects = new LongSparseArray();
    private final LongSparseArray musicQueues = new LongSparseArray();

    public interface BrowseChildrenCallback {
        void onResult(List<MediaBrowser.MediaItem> list);
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

    public static TelegramMediaSession peekInstance() {
        return instance;
    }

    private TelegramMediaSession(Context context) {
        this.appContext = context;
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(i), "auto_lastSelectedDialog", 0L);
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, SESSION_TAG);
        this.session = mediaSessionCompat;
        mediaSessionCompat.setFlags(3);
        mediaSessionCompat.setCallback(new SessionCallback());
        mediaSessionCompat.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean(SLOT_RESERVATION_QUEUE, true);
        bundle.putBoolean(SLOT_RESERVATION_SKIP_TO_PREV, true);
        bundle.putBoolean(SLOT_RESERVATION_SKIP_TO_NEXT, true);
        mediaSessionCompat.setExtras(bundle);
        mediaSessionCompat.setActive(true);
        mediaSessionCompat.setPlaybackState(new PlaybackStateCompat.Builder().setState(0, 0L, 1.0f).setActions(getAvailableActions()).build());
        updateRepeatMode();
        updateShuffleMode();
    }

    public MediaSessionCompat getSession() {
        return this.session;
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.session.getSessionToken();
    }

    public MediaSession.Token getFrameworkSessionToken() {
        return (MediaSession.Token) this.session.getSessionToken().getToken();
    }

    public void release() {
        MediaSessionCompat mediaSessionCompat = this.session;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.release();
        }
    }

    public Bundle buildRootHints() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CONTENT_STYLE_SUPPORTED, true);
        bundle.putInt(CONTENT_STYLE_BROWSABLE_HINT, 2);
        bundle.putInt(CONTENT_STYLE_PLAYABLE_HINT, 1);
        return bundle;
    }

    public boolean isPasscodeLocked() {
        int i;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        return SharedConfig.passcodeHash.length() > 0 && (SharedConfig.appLocked || (!(SharedConfig.autoLockIn == 0 || (i = SharedConfig.lastPauseTime) == 0 || i + SharedConfig.autoLockIn > elapsedRealtime) || elapsedRealtime + 5 < SharedConfig.lastPauseTime));
    }

    public void loadBrowseChildren(final String str, final BrowseChildrenCallback browseChildrenCallback) {
        if (this.chatsLoaded) {
            browseChildrenCallback.onResult(loadChildrenSync(str));
            return;
        }
        this.loadingChats = true;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TelegramMediaSession.this.lambda$loadBrowseChildren$1(messagesStorage, browseChildrenCallback, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBrowseChildren$1(MessagesStorage messagesStorage, final BrowseChildrenCallback browseChildrenCallback, final String str) {
        try {
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized(String.format(Locale.US, "SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = %d", 4), new Object[0]);
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
                SQLiteCursor queryFinalized2 = messagesStorage.getDatabase().queryFinalized(String.format(Locale.US, "SELECT uid, data, mid FROM media_v4 WHERE uid IN (%s) AND mid > 0 AND type = %d ORDER BY date DESC, mid DESC", TextUtils.join(",", this.dialogs), 4), new Object[0]);
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
                            ArrayList arrayList3 = (ArrayList) this.musicObjects.get(longValue2);
                            ArrayList arrayList4 = (ArrayList) this.musicQueues.get(longValue2);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                this.musicObjects.put(longValue2, arrayList3);
                                arrayList4 = new ArrayList();
                                this.musicQueues.put(longValue2, arrayList4);
                            }
                            MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, true);
                            arrayList3.add(0, messageObject);
                            MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(longValue2 + "_" + arrayList3.size());
                            mediaId.setTitle(messageObject.getMusicTitle());
                            mediaId.setSubtitle(messageObject.getMusicAuthor());
                            arrayList4.add(0, new MediaSessionCompat.QueueItem(mediaId.build(), (long) arrayList4.size()));
                        }
                    }
                }
                queryFinalized2.dispose();
                if (!arrayList.isEmpty()) {
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    messagesStorage.getUsersInternal(arrayList, arrayList5);
                    Iterator<TLRPC.User> it = arrayList5.iterator();
                    while (it.hasNext()) {
                        TLRPC.User next = it.next();
                        this.users.put(next.id, next);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList6);
                    Iterator<TLRPC.Chat> it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                        TLRPC.Chat next2 = it2.next();
                        this.chats.put(next2.id, next2);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TelegramMediaSession.this.lambda$loadBrowseChildren$0(browseChildrenCallback, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBrowseChildren$0(BrowseChildrenCallback browseChildrenCallback, String str) {
        this.chatsLoaded = true;
        this.loadingChats = false;
        if (this.lastSelectedDialog == 0 && !this.dialogs.isEmpty()) {
            this.lastSelectedDialog = this.dialogs.get(0).longValue();
        }
        applyQueueFor(this.lastSelectedDialog);
        browseChildrenCallback.onResult(loadChildrenSync(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<MediaBrowser.MediaItem> loadChildrenSync(String str) {
        long j;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (MEDIA_ID_ROOT.equals(str)) {
            while (i < this.dialogs.size()) {
                long longValue = this.dialogs.get(i).longValue();
                MediaDescription.Builder mediaId = new MediaDescription.Builder().setMediaId(MEDIA_ID_CHAT_PREFIX + longValue);
                Bitmap bitmap = null;
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = (TLRPC.User) this.users.get(longValue);
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
                    TLRPC.Chat chat = (TLRPC.Chat) this.chats.get(-longValue);
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
                i++;
            }
        } else if (str != null && str.startsWith(MEDIA_ID_CHAT_PREFIX)) {
            try {
                j = Long.parseLong(str.replace(MEDIA_ID_CHAT_PREFIX, ""));
            } catch (Exception e) {
                FileLog.e(e);
                j = 0;
            }
            ArrayList arrayList2 = (ArrayList) this.musicObjects.get(j);
            if (arrayList2 != null) {
                while (i < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i);
                    MediaDescription.Builder mediaId2 = new MediaDescription.Builder().setMediaId(j + "_" + i);
                    mediaId2.setTitle(messageObject.getMusicTitle());
                    mediaId2.setSubtitle(messageObject.getMusicAuthor());
                    arrayList.add(new MediaBrowser.MediaItem(mediaId2.build(), 2));
                    i++;
                }
            }
        }
        return arrayList;
    }

    private void applyQueueFor(long j) {
        String str;
        if (j == 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.musicObjects.get(j);
        ArrayList arrayList2 = (ArrayList) this.musicQueues.get(j);
        if (arrayList == null || arrayList.isEmpty() || arrayList2 == null) {
            return;
        }
        this.session.setQueue(arrayList2);
        if (DialogObject.isUserDialog(j)) {
            TLRPC.User user = (TLRPC.User) this.users.get(j);
            MediaSessionCompat mediaSessionCompat = this.session;
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = "DELETED USER";
            }
            mediaSessionCompat.setQueueTitle(str);
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) this.chats.get(-j);
            this.session.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
        }
        MessageObject messageObject = (MessageObject) arrayList.get(0);
        this.session.setMetadata(new MediaMetadataCompat.Builder().putLong("android.media.metadata.DURATION", (long) (messageObject.getDuration() * 1000.0d)).putString("android.media.metadata.ARTIST", messageObject.getMusicAuthor()).putString("android.media.metadata.TITLE", messageObject.getMusicTitle()).build());
    }

    public void publishMetadata(MessageObject messageObject, AudioInfo audioInfo, Bitmap bitmap) {
        if (messageObject == null) {
            return;
        }
        MediaMetadataCompat.Builder putString = new MediaMetadataCompat.Builder().putString("android.media.metadata.ALBUM_ARTIST", messageObject.getMusicAuthor()).putString("android.media.metadata.ARTIST", messageObject.getMusicAuthor()).putLong("android.media.metadata.DURATION", (long) (messageObject.getDuration() * 1000.0d)).putString("android.media.metadata.TITLE", messageObject.getMusicTitle()).putString("android.media.metadata.ALBUM", (audioInfo == null || !messageObject.isMusic()) ? null : audioInfo.getAlbum());
        if (bitmap != null && !bitmap.isRecycled()) {
            putString.putBitmap("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.session.setMetadata(putString.build());
    }

    public void publishPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.session.setPlaybackState(playbackStateCompat);
    }

    public long getAvailableActions() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return 2477828L;
        }
        long j = MediaController.getInstance().isMessagePaused() ? 2477828L : 2477830L;
        return playingMessageObject.isMusic() ? j | 48 : j;
    }

    public void updateRepeatMode() {
        int i = SharedConfig.repeatMode;
        this.session.setRepeatMode(i != 1 ? i != 2 ? 0 : 1 : 2);
    }

    public void updateShuffleMode() {
        this.session.setShuffleMode(SharedConfig.shuffleMusic ? 1 : 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    final class SessionCallback extends MediaSessionCompat.Callback {
        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPrepare() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onStop() {
        }

        private SessionCallback() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPlay() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().playMessage(playingMessageObject);
                return;
            }
            if (TelegramMediaSession.this.lastSelectedDialog != 0) {
                onPlayFromMediaId(TelegramMediaSession.this.lastSelectedDialog + "_0", null);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPause() {
            MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSkipToNext() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                return;
            }
            MediaController.getInstance().playNextMessage();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSkipToPrevious() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                return;
            }
            MediaController.getInstance().playPreviousMessage();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSkipToQueueItem(long j) {
            MediaController.getInstance().playMessageAtIndex((int) j);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSeekTo(long j) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().seekToProgress(playingMessageObject, (float) ((j / 1000.0d) / playingMessageObject.getDuration()));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSetRepeatMode(int i) {
            SharedConfig.setRepeatMode(i != 1 ? (i == 2 || i == 3) ? 1 : 0 : 2);
            TelegramMediaSession.this.updateRepeatMode();
            notifyPlayStateForNotificationRefresh();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSetShuffleMode(int i) {
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            if (z != SharedConfig.shuffleMusic) {
                MediaController.getInstance().setPlaybackOrderType(z ? 2 : 0);
            }
            TelegramMediaSession.this.updateShuffleMode();
            notifyPlayStateForNotificationRefresh();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$notifyPlayStateForNotificationRefresh$0() {
            NotificationCenter.getInstance(TelegramMediaSession.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, 0);
        }

        private void notifyPlayStateForNotificationRefresh() {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.TelegramMediaSession$SessionCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TelegramMediaSession.SessionCallback.this.lambda$notifyPlayStateForNotificationRefresh$0();
                }
            });
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            onPlayFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPrepareFromSearch(String str, Bundle bundle) {
            onPlayFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPlayFromMediaId(String str, Bundle bundle) {
            String str2;
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
                ArrayList<MessageObject> arrayList = (ArrayList) TelegramMediaSession.this.musicObjects.get(parseLong);
                ArrayList arrayList2 = (ArrayList) TelegramMediaSession.this.musicQueues.get(parseLong);
                if (arrayList != null && parseInt >= 0 && parseInt < arrayList.size()) {
                    TelegramMediaSession.this.lastSelectedDialog = parseLong;
                    MessagesController.getNotificationsSettings(TelegramMediaSession.this.currentAccount).edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                    MediaController.getInstance().setPlaylist(arrayList, arrayList.get(parseInt), 0L, false, null);
                    TelegramMediaSession.this.session.setQueue(arrayList2);
                    if (DialogObject.isUserDialog(parseLong)) {
                        TLRPC.User user = (TLRPC.User) TelegramMediaSession.this.users.get(parseLong);
                        MediaSessionCompat mediaSessionCompat = TelegramMediaSession.this.session;
                        if (user != null) {
                            str2 = ContactsController.formatName(user.first_name, user.last_name);
                        } else {
                            str2 = "DELETED USER";
                        }
                        mediaSessionCompat.setQueueTitle(str2);
                        return;
                    }
                    TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.get(-parseLong);
                    TelegramMediaSession.this.session.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPlayFromSearch(String str, Bundle bundle) {
            String str2;
            if (str == null || str.length() == 0) {
                return;
            }
            String lowerCase = str.toLowerCase();
            for (int i = 0; i < TelegramMediaSession.this.dialogs.size(); i++) {
                long longValue = ((Long) TelegramMediaSession.this.dialogs.get(i)).longValue();
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = (TLRPC.User) TelegramMediaSession.this.users.get(longValue);
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
                    TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.get(-longValue);
                    if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                        onPlayFromMediaId(longValue + "_0", null);
                        return;
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onCustomAction(String str, Bundle bundle) {
            if (MusicPlayerService.NOTIFY_REPEAT.equals(str)) {
                SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                TelegramMediaSession.this.updateRepeatMode();
            } else if (MusicPlayerService.NOTIFY_SHUFFLE.equals(str)) {
                MediaController.getInstance().setPlaybackOrderType(SharedConfig.shuffleMusic ? 0 : 2);
                TelegramMediaSession.this.updateShuffleMode();
            }
        }
    }
}
