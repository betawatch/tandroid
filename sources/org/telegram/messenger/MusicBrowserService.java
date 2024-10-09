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
import android.media.MediaMetadata;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* loaded from: classes3.dex */
public class MusicBrowserService extends MediaBrowserService implements NotificationCenter.NotificationCenterDelegate {
    public static final String ACTION_CMD = "com.example.android.mediabrowserservice.ACTION_CMD";
    public static final String CMD_NAME = "CMD_NAME";
    public static final String CMD_PAUSE = "CMD_PAUSE";
    private static final String MEDIA_ID_ROOT = "__ROOT__";
    private static final String SLOT_RESERVATION_QUEUE = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE";
    private static final String SLOT_RESERVATION_SKIP_TO_NEXT = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT";
    private static final String SLOT_RESERVATION_SKIP_TO_PREV = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
    private static final int STOP_DELAY = 30000;
    private RectF bitmapRect;
    private boolean chatsLoaded;
    private long lastSelectedDialog;
    private boolean loadingChats;
    private MediaSession mediaSession;
    private Paint roundPaint;
    private boolean serviceStarted;
    private int currentAccount = UserConfig.selectedAccount;
    private ArrayList<Long> dialogs = new ArrayList<>();
    private LongSparseArray users = new LongSparseArray();
    private LongSparseArray chats = new LongSparseArray();
    private LongSparseArray musicObjects = new LongSparseArray();
    private LongSparseArray musicQueues = new LongSparseArray();
    private DelayedStopHandler delayedStopHandler = new DelayedStopHandler();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class DelayedStopHandler extends Handler {
        private final WeakReference<MusicBrowserService> mWeakReference;

        private DelayedStopHandler(MusicBrowserService musicBrowserService) {
            this.mWeakReference = new WeakReference<>(musicBrowserService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MusicBrowserService musicBrowserService = this.mWeakReference.get();
            if (musicBrowserService != null) {
                if (MediaController.getInstance().getPlayingMessageObject() == null || MediaController.getInstance().isMessagePaused()) {
                    musicBrowserService.stopSelf();
                    musicBrowserService.serviceStarted = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class MediaSessionCallback extends MediaSession.Callback {
        private MediaSessionCallback() {
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPause() {
            MusicBrowserService.this.handlePauseRequest();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlay() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().playMessage(playingMessageObject);
                return;
            }
            onPlayFromMediaId(MusicBrowserService.this.lastSelectedDialog + "_0", null);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromMediaId(String str, Bundle bundle) {
            long parseLong;
            int parseInt;
            ArrayList<MessageObject> arrayList;
            ArrayList arrayList2;
            MediaSession mediaSession;
            String str2;
            String[] split = str.split("_");
            if (split.length != 2) {
                return;
            }
            try {
                parseLong = Long.parseLong(split[0]);
                parseInt = Integer.parseInt(split[1]);
                arrayList = (ArrayList) MusicBrowserService.this.musicObjects.get(parseLong);
                arrayList2 = (ArrayList) MusicBrowserService.this.musicQueues.get(parseLong);
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (arrayList != null && parseInt >= 0 && parseInt < arrayList.size()) {
                MusicBrowserService.this.lastSelectedDialog = parseLong;
                MessagesController.getNotificationsSettings(MusicBrowserService.this.currentAccount).edit().putLong("auto_lastSelectedDialog", parseLong).commit();
                MediaController.getInstance().setPlaylist(arrayList, arrayList.get(parseInt), 0L, false, null);
                MusicBrowserService.this.createMediaSession();
                MusicBrowserService.this.mediaSession.setQueue(arrayList2);
                if (parseLong > 0) {
                    TLRPC.User user = (TLRPC.User) MusicBrowserService.this.users.get(parseLong);
                    if (user != null) {
                        mediaSession = MusicBrowserService.this.mediaSession;
                        str2 = ContactsController.formatName(user.first_name, user.last_name);
                    } else {
                        mediaSession = MusicBrowserService.this.mediaSession;
                        str2 = "DELETED USER";
                    }
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) MusicBrowserService.this.chats.get(-parseLong);
                    if (chat != null) {
                        mediaSession = MusicBrowserService.this.mediaSession;
                        str2 = chat.title;
                    } else {
                        mediaSession = MusicBrowserService.this.mediaSession;
                        str2 = "DELETED CHAT";
                    }
                }
                mediaSession.setQueueTitle(str2);
                MusicBrowserService.this.handlePlayRequest();
            }
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromSearch(String str, Bundle bundle) {
            String str2;
            StringBuilder sb;
            String str3;
            String str4;
            if (str == null || str.length() == 0) {
                return;
            }
            String lowerCase = str.toLowerCase();
            for (int i = 0; i < MusicBrowserService.this.dialogs.size(); i++) {
                long longValue = ((Long) MusicBrowserService.this.dialogs.get(i)).longValue();
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = (TLRPC.User) MusicBrowserService.this.users.get(longValue);
                    if (user != null && (((str3 = user.first_name) != null && str3.startsWith(lowerCase)) || ((str4 = user.last_name) != null && str4.startsWith(lowerCase)))) {
                        sb = new StringBuilder();
                        sb.append(longValue);
                        sb.append("_");
                        sb.append(0);
                        onPlayFromMediaId(sb.toString(), null);
                        return;
                    }
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) MusicBrowserService.this.chats.get(-longValue);
                    if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                        sb = new StringBuilder();
                        sb.append(longValue);
                        sb.append("_");
                        sb.append(0);
                        onPlayFromMediaId(sb.toString(), null);
                        return;
                    }
                }
            }
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSeekTo(long j) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().seekToProgress(playingMessageObject, ((float) (j / 1000)) / ((float) playingMessageObject.getDuration()));
            }
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToNext() {
            MediaController.getInstance().playNextMessage();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToPrevious() {
            MediaController.getInstance().playPreviousMessage();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToQueueItem(long j) {
            MediaController.getInstance().playMessageAtIndex((int) j);
            MusicBrowserService.this.handlePlayRequest();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onStop() {
            MusicBrowserService.this.handleStopRequest(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createMediaSession() {
        MediaSession.Token sessionToken;
        if (this.mediaSession != null) {
            return;
        }
        MediaSession mediaSession = new MediaSession(this, "MusicService");
        this.mediaSession = mediaSession;
        sessionToken = mediaSession.getSessionToken();
        setSessionToken(sessionToken);
        this.mediaSession.setCallback(new MediaSessionCallback());
        this.mediaSession.setFlags(3);
        Context applicationContext = getApplicationContext();
        this.mediaSession.setSessionActivity(PendingIntent.getActivity(applicationContext, 99, new Intent(applicationContext, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean(SLOT_RESERVATION_QUEUE, true);
        bundle.putBoolean(SLOT_RESERVATION_SKIP_TO_PREV, true);
        bundle.putBoolean(SLOT_RESERVATION_SKIP_TO_NEXT, true);
        this.mediaSession.setExtras(bundle);
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

    private long getAvailableActions() {
        if (MediaController.getInstance().getPlayingMessageObject() != null) {
            return (MediaController.getInstance().isMessagePaused() ? 3076L : 3078L) | 48;
        }
        return 3076L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePauseRequest() {
        MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
        this.delayedStopHandler.removeCallbacksAndMessages(null);
        this.delayedStopHandler.sendEmptyMessageDelayed(0, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handlePlayRequest() {
        MediaMetadata build;
        Bitmap cover;
        boolean isActive;
        this.delayedStopHandler.removeCallbacksAndMessages(null);
        if (!this.serviceStarted) {
            try {
                startService(new Intent(getApplicationContext(), (Class<?>) MusicBrowserService.class));
            } catch (Throwable th) {
                FileLog.e(th);
            }
            this.serviceStarted = true;
        }
        MediaSession mediaSession = this.mediaSession;
        if (mediaSession != null) {
            isActive = mediaSession.isActive();
        }
        createMediaSession();
        this.mediaSession.setActive(true);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        builder.putLong("android.media.metadata.DURATION", (long) (playingMessageObject.getDuration() * 1000.0d));
        builder.putString("android.media.metadata.ARTIST", playingMessageObject.getMusicAuthor());
        builder.putString("android.media.metadata.TITLE", playingMessageObject.getMusicTitle());
        AudioInfo audioInfo = MediaController.getInstance().getAudioInfo();
        if (audioInfo != null && (cover = audioInfo.getCover()) != null) {
            builder.putBitmap("android.media.metadata.ALBUM_ART", cover);
        }
        MediaSession mediaSession2 = this.mediaSession;
        build = builder.build();
        mediaSession2.setMetadata(build);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStopRequest(String str) {
        this.delayedStopHandler.removeCallbacksAndMessages(null);
        this.delayedStopHandler.sendEmptyMessageDelayed(0, 30000L);
        updatePlaybackState(str);
        stopSelf();
        this.serviceStarted = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLoadChildren$0(String str, MediaBrowserService.Result result) {
        MediaSession mediaSession;
        String str2;
        MediaSession mediaSession2;
        String str3;
        MediaMetadata build;
        this.chatsLoaded = true;
        this.loadingChats = false;
        loadChildrenImpl(str, result);
        if (this.lastSelectedDialog == 0 && !this.dialogs.isEmpty()) {
            this.lastSelectedDialog = this.dialogs.get(0).longValue();
        }
        long j = this.lastSelectedDialog;
        if (j != 0) {
            ArrayList arrayList = (ArrayList) this.musicObjects.get(j);
            ArrayList arrayList2 = (ArrayList) this.musicQueues.get(this.lastSelectedDialog);
            if (arrayList != null && !arrayList.isEmpty()) {
                createMediaSession();
                this.mediaSession.setQueue(arrayList2);
                long j2 = this.lastSelectedDialog;
                if (j2 > 0) {
                    TLRPC.User user = (TLRPC.User) this.users.get(j2);
                    if (user != null) {
                        mediaSession2 = this.mediaSession;
                        str3 = ContactsController.formatName(user.first_name, user.last_name);
                        mediaSession2.setQueueTitle(str3);
                    } else {
                        mediaSession = this.mediaSession;
                        str2 = "DELETED USER";
                        mediaSession.setQueueTitle(str2);
                    }
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) this.chats.get(-j2);
                    if (chat != null) {
                        mediaSession2 = this.mediaSession;
                        str3 = chat.title;
                        mediaSession2.setQueueTitle(str3);
                    } else {
                        mediaSession = this.mediaSession;
                        str2 = "DELETED CHAT";
                        mediaSession.setQueueTitle(str2);
                    }
                }
                MessageObject messageObject = (MessageObject) arrayList.get(0);
                MediaMetadata.Builder builder = new MediaMetadata.Builder();
                builder.putLong("android.media.metadata.DURATION", (long) (messageObject.getDuration() * 1000.0d));
                builder.putString("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
                builder.putString("android.media.metadata.TITLE", messageObject.getMusicTitle());
                MediaSession mediaSession3 = this.mediaSession;
                build = builder.build();
                mediaSession3.setMetadata(build);
            }
        }
        updatePlaybackState(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLoadChildren$1(MessagesStorage messagesStorage, final String str, final MediaBrowserService.Result result) {
        MediaDescription.Builder mediaId;
        MediaDescription build;
        Long valueOf;
        ArrayList<Long> arrayList;
        try {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Long> arrayList3 = new ArrayList<>();
            SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized(String.format(Locale.US, "SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = %d", 4), new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (!DialogObject.isEncryptedDialog(longValue)) {
                    this.dialogs.add(Long.valueOf(longValue));
                    if (DialogObject.isUserDialog(longValue)) {
                        valueOf = Long.valueOf(longValue);
                        arrayList = arrayList2;
                    } else {
                        valueOf = Long.valueOf(-longValue);
                        arrayList = arrayList3;
                    }
                    arrayList.add(valueOf);
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
                            ArrayList arrayList4 = (ArrayList) this.musicObjects.get(longValue2);
                            ArrayList arrayList5 = (ArrayList) this.musicQueues.get(longValue2);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                this.musicObjects.put(longValue2, arrayList4);
                                arrayList5 = new ArrayList();
                                this.musicQueues.put(longValue2, arrayList5);
                            }
                            MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, true);
                            arrayList4.add(0, messageObject);
                            mediaId = new MediaDescription.Builder().setMediaId(longValue2 + "_" + arrayList4.size());
                            mediaId.setTitle(messageObject.getMusicTitle());
                            mediaId.setSubtitle(messageObject.getMusicAuthor());
                            build = mediaId.build();
                            arrayList5.add(0, new MediaSession.QueueItem(build, (long) arrayList5.size()));
                        }
                    }
                }
                queryFinalized2.dispose();
                if (!arrayList2.isEmpty()) {
                    ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
                    messagesStorage.getUsersInternal(arrayList2, arrayList6);
                    for (int i = 0; i < arrayList6.size(); i++) {
                        TLRPC.User user = arrayList6.get(i);
                        this.users.put(user.id, user);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList3), arrayList7);
                    for (int i2 = 0; i2 < arrayList7.size(); i2++) {
                        TLRPC.Chat chat = arrayList7.get(i2);
                        this.chats.put(chat.id, chat);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MusicBrowserService$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                MusicBrowserService.this.lambda$onLoadChildren$0(str, result);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void loadChildrenImpl(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        int i;
        MediaDescription.Builder mediaId;
        MediaDescription build;
        MediaDescription.Builder mediaId2;
        String str2;
        TLRPC.FileLocation fileLocation;
        MediaDescription build2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (MEDIA_ID_ROOT.equals(str)) {
            while (i2 < this.dialogs.size()) {
                long longValue = this.dialogs.get(i2).longValue();
                mediaId2 = new MediaDescription.Builder().setMediaId("__CHAT_" + longValue);
                Bitmap bitmap = null;
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = (TLRPC.User) this.users.get(longValue);
                    if (user != null) {
                        mediaId2.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            fileLocation = userProfilePhoto.photo_small;
                        }
                        fileLocation = null;
                    } else {
                        str2 = "DELETED USER";
                        mediaId2.setTitle(str2);
                        fileLocation = null;
                    }
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) this.chats.get(-longValue);
                    if (chat != null) {
                        mediaId2.setTitle(chat.title);
                        TLRPC.ChatPhoto chatPhoto = chat.photo;
                        if (chatPhoto != null) {
                            fileLocation = chatPhoto.photo_small;
                        }
                        fileLocation = null;
                    } else {
                        str2 = "DELETED CHAT";
                        mediaId2.setTitle(str2);
                        fileLocation = null;
                    }
                }
                if (fileLocation != null && (bitmap = createRoundBitmap(FileLoader.getInstance(this.currentAccount).getPathToAttach(fileLocation, true))) != null) {
                    mediaId2.setIconBitmap(bitmap);
                }
                if (fileLocation == null || bitmap == null) {
                    mediaId2.setIconUri(Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/drawable/contact_blue"));
                }
                build2 = mediaId2.build();
                arrayList.add(new MediaBrowser.MediaItem(build2, 1));
                i2++;
            }
        } else if (str != null && str.startsWith("__CHAT_")) {
            try {
                i = Integer.parseInt(str.replace("__CHAT_", ""));
            } catch (Exception e) {
                FileLog.e(e);
                i = 0;
            }
            ArrayList arrayList2 = (ArrayList) this.musicObjects.get(i);
            if (arrayList2 != null) {
                while (i2 < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i2);
                    mediaId = new MediaDescription.Builder().setMediaId(i + "_" + i2);
                    mediaId.setTitle(messageObject.getMusicTitle());
                    mediaId.setSubtitle(messageObject.getMusicAuthor());
                    build = mediaId.build();
                    arrayList.add(new MediaBrowser.MediaItem(build, 2));
                    i2++;
                }
            }
        }
        result.sendResult(arrayList);
    }

    private static boolean passcode() {
        int i;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        return SharedConfig.passcodeHash.length() > 0 && (SharedConfig.appLocked || (!(SharedConfig.autoLockIn == 0 || (i = SharedConfig.lastPauseTime) == 0 || i + SharedConfig.autoLockIn > elapsedRealtime) || elapsedRealtime + 5 < SharedConfig.lastPauseTime));
    }

    private void updatePlaybackState(String str) {
        PlaybackState.Builder actions;
        int i;
        PlaybackState build;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        long j = playingMessageObject != null ? playingMessageObject.audioProgressSec * 1000 : -1L;
        actions = new PlaybackState.Builder().setActions(getAvailableActions());
        int i2 = playingMessageObject == null ? 1 : MediaController.getInstance().isDownloadingCurrentMessage() ? 6 : MediaController.getInstance().isMessagePaused() ? 2 : 3;
        if (str != null) {
            actions.setErrorMessage(str);
            i = 7;
        } else {
            i = i2;
        }
        actions.setState(i, j, 1.0f, SystemClock.elapsedRealtime());
        actions.setActiveQueueItemId(playingMessageObject != null ? MediaController.getInstance().getPlayingMessageObjectNum() : 0L);
        MediaSession mediaSession = this.mediaSession;
        if (mediaSession != null) {
            build = actions.build();
            mediaSession.setPlaybackState(build);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        updatePlaybackState(null);
        handlePlayRequest();
    }

    @Override // android.service.media.MediaBrowserService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ApplicationLoader.postInitApplication();
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(this.currentAccount), "auto_lastSelectedDialog", 0L);
        updatePlaybackState(null);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        handleStopRequest(null);
        this.delayedStopHandler.removeCallbacksAndMessages(null);
        MediaSession mediaSession = this.mediaSession;
        if (mediaSession != null) {
            mediaSession.release();
        }
    }

    @Override // android.service.media.MediaBrowserService
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        if (str == null || (!(1000 == i || Process.myUid() == i || str.equals("com.google.android.mediasimulator") || str.equals("com.google.android.projection.gearhead")) || passcode())) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(MEDIA_ID_ROOT, null);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(final String str, final MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        if (passcode()) {
            Toast.makeText(getApplicationContext(), LocaleController.getString(R.string.EnterYourTelegramPasscode), 1).show();
            stopSelf();
            result.detach();
        } else {
            if (this.chatsLoaded) {
                loadChildrenImpl(str, result);
                return;
            }
            result.detach();
            if (this.loadingChats) {
                return;
            }
            this.loadingChats = true;
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.MusicBrowserService$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    MusicBrowserService.this.lambda$onLoadChildren$1(messagesStorage, str, result);
                }
            });
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
