package org.telegram.messenger;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class MusicPlayerService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private static final int ID_NOTIFICATION = 5;
    public static final String NOTIFY_CLOSE = "org.telegram.android.musicplayer.close";
    public static final String NOTIFY_NEXT = "org.telegram.android.musicplayer.next";
    public static final String NOTIFY_PAUSE = "org.telegram.android.musicplayer.pause";
    public static final String NOTIFY_PLAY = "org.telegram.android.musicplayer.play";
    public static final String NOTIFY_PREVIOUS = "org.telegram.android.musicplayer.previous";
    public static final String NOTIFY_REPEAT = "org.telegram.android.musicplayer.repeat";
    public static final String NOTIFY_SEEK = "org.telegram.android.musicplayer.seek";
    public static final String NOTIFY_SHUFFLE = "org.telegram.android.musicplayer.shuffle";
    private static boolean supportBigNotifications = true;
    private static boolean supportLockScreenControls = true ^ TextUtils.isEmpty(AndroidUtilities.getSystemProperty("ro.miui.ui.version.code"));
    private Bitmap albumArtPlaceholder;
    private AudioManager audioManager;
    private boolean foregroundServiceIsStarted;
    private BroadcastReceiver headsetPlugReceiver = new BroadcastReceiver() { // from class: org.telegram.messenger.MusicPlayerService.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
            }
        }
    };
    private ImageReceiver imageReceiver;
    private String loadingFilePath;
    private android.support.v4.media.session.b0 mediaSession;
    private int notificationMessageID;
    private android.support.v4.media.session.e0 playbackState;
    private RemoteControlClient remoteControlClient;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:203:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createNotification(MessageObject messageObject, boolean z10) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap avatarBitmap;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        String str;
        long j3;
        String str2;
        String str3;
        jf.a aVar;
        String str4;
        int i10;
        PendingIntent pendingIntent3;
        MessageObject messageObject2;
        String str5;
        jf.a aVar2;
        String str6;
        Bitmap bitmap3;
        String musicTitle = messageObject.getMusicTitle();
        String musicAuthor = messageObject.getMusicAuthor();
        jf.a audioInfo = MediaController.getInstance().getAudioInfo();
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        if (messageObject.isMusic()) {
            intent.setAction("com.tmessages.openplayer");
            intent.addCategory("android.intent.category.LAUNCHER");
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            intent.setAction("android.intent.action.VIEW");
            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
            boolean z11 = peer instanceof TLRPC.TL_peerUser;
            long j10 = z11 ? peer.user_id : peer instanceof TLRPC.TL_peerChat ? peer.chat_id : peer instanceof TLRPC.TL_peerChannel ? peer.channel_id : 0L;
            if (j10 != 0) {
                if (z11) {
                    StringBuilder t10 = a4.a.t(j10, "tg://openmessage?user_id=", "&message_id=");
                    t10.append(messageObject.getId());
                    intent.setData(Uri.parse(t10.toString()));
                } else {
                    StringBuilder t11 = a4.a.t(j10, "tg://openmessage?chat_id=", "&message_id=");
                    t11.append(messageObject.getId());
                    intent.setData(Uri.parse(t11.toString()));
                }
            }
        }
        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, fixIntentFlags(33554432));
        long duration = (long) (messageObject.getDuration() * 1000.0d);
        if (messageObject.isMusic()) {
            String artworkUrl = messageObject.getArtworkUrl(true);
            String artworkUrl2 = messageObject.getArtworkUrl(false);
            bitmap2 = audioInfo != null ? audioInfo.p : null;
            bitmap = audioInfo != null ? audioInfo.o : null;
            this.loadingFilePath = null;
            this.imageReceiver.setImageBitmap((Drawable) null);
            if (bitmap2 != null || TextUtils.isEmpty(artworkUrl)) {
                this.loadingFilePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(messageObject.getDocument()).getAbsolutePath();
            } else {
                boolean z12 = !z10;
                Bitmap loadArtworkFromUrl = loadArtworkFromUrl(artworkUrl2, true, z12);
                if (loadArtworkFromUrl == null) {
                    bitmap2 = loadArtworkFromUrl(artworkUrl, false, z12);
                    bitmap = bitmap2;
                } else {
                    bitmap2 = loadArtworkFromUrl(artworkUrl2, false, z12);
                    bitmap = loadArtworkFromUrl;
                }
            }
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            long senderId = messageObject.getSenderId();
            if (messageObject.isFromUser()) {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(senderId));
                if (user != null) {
                    musicTitle = UserObject.getUserName(user);
                    boolean z13 = !z10;
                    bitmap = getAvatarBitmap(user, true, z13);
                    avatarBitmap = getAvatarBitmap(user, false, z13);
                } else {
                    avatarBitmap = null;
                    bitmap = null;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-senderId));
                if (chat != null) {
                    musicTitle = chat.title;
                    boolean z14 = !z10;
                    bitmap = getAvatarBitmap(chat, true, z14);
                    avatarBitmap = getAvatarBitmap(chat, false, z14);
                } else {
                    bitmap = null;
                    bitmap2 = null;
                    if (bitmap == null && bitmap2 != null) {
                        bitmap = bitmap2;
                    }
                    musicAuthor = !messageObject.isVoice() ? LocaleController.getString(R.string.AttachAudio) : LocaleController.getString(R.string.AttachRound);
                }
            }
            bitmap2 = avatarBitmap;
            if (bitmap == null) {
                bitmap = bitmap2;
            }
            if (!messageObject.isVoice()) {
            }
        } else {
            bitmap = null;
            bitmap2 = null;
        }
        int i11 = Build.VERSION.SDK_INT;
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z15 = !isMessagePaused;
        Bitmap bitmap4 = bitmap;
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_PREVIOUS).setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, new Intent(this, getClass()).setAction(getPackageName() + ".STOP_PLAYER"), fixIntentFlags(301989888));
        PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(!isMessagePaused ? NOTIFY_PAUSE : NOTIFY_PLAY).setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_NEXT).setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_SEEK).setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast4 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_REPEAT).setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast5 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_SHUFFLE).setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession((MediaSession.Token) this.mediaSession.a.c.b);
        if (messageObject.isMusic()) {
            pendingIntent = broadcast5;
            pendingIntent2 = broadcast3;
            str = NOTIFY_SHUFFLE;
            mediaSession.setShowActionsInCompactView(0, 1, 2, 3, 4);
        } else {
            pendingIntent = broadcast5;
            pendingIntent2 = broadcast3;
            str = NOTIFY_SHUFFLE;
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                mediaSession.setShowActionsInCompactView(0);
            }
        }
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.player).setOngoing(z15).setContentTitle(musicTitle).setContentText(musicAuthor).setSubText((audioInfo == null || !messageObject.isMusic()) ? null : audioInfo.f).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(mediaSession);
        if (i11 >= 26) {
            NotificationsController.checkOtherNotificationsChannel();
            builder.setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
        }
        if (bitmap2 != null) {
            builder.setLargeIcon(bitmap2);
        } else {
            builder.setLargeIcon(this.albumArtPlaceholder);
        }
        String string = LocaleController.getString(R.string.Next);
        String string2 = LocaleController.getString(R.string.AccDescrPrevious);
        this.playbackState = new android.support.v4.media.session.e0();
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            android.support.v4.media.session.e0 e0Var = this.playbackState;
            j3 = 1000;
            e0Var.c(6, 0L, 1.0f);
            e0Var.e = 0L;
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, string2, broadcast).build());
            }
            builder.addAction(new Notification.Action.Builder(R.drawable.loading_animation2, LocaleController.getString(R.string.Loading), (PendingIntent) null).build());
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, string, pendingIntent2).build());
            }
            str2 = musicTitle;
            str3 = musicAuthor;
            aVar = audioInfo;
            i10 = i11;
            str5 = null;
            messageObject2 = messageObject;
        } else {
            PendingIntent pendingIntent4 = pendingIntent2;
            j3 = 1000;
            long j11 = messageObject.isMusic() ? 2360118L : 2360070L;
            if (messageObject.isMusic()) {
                i10 = i11;
                int i12 = SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                aVar = audioInfo;
                android.support.v4.media.session.e0 e0Var2 = this.playbackState;
                str2 = musicTitle;
                String string3 = LocaleController.getString(R.string.ShuffleList);
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string3)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i12 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                str3 = musicAuthor;
                str4 = string;
                String str7 = str;
                pendingIntent3 = pendingIntent4;
                e0Var2.a(new PlaybackStateCompat.CustomAction(str7, string3, i12, null));
            } else {
                str2 = musicTitle;
                str3 = musicAuthor;
                aVar = audioInfo;
                str4 = string;
                i10 = i11;
                pendingIntent3 = pendingIntent4;
            }
            android.support.v4.media.session.e0 e0Var3 = this.playbackState;
            messageObject2 = messageObject;
            e0Var3.c(!isMessagePaused ? 3 : 2, MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, getPlaybackSpeed(z15, messageObject2));
            e0Var3.e = j11;
            if (messageObject2.isMusic()) {
                int i13 = SharedConfig.repeatMode;
                int i14 = i13 != 1 ? i13 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                android.support.v4.media.session.e0 e0Var4 = this.playbackState;
                String string4 = LocaleController.getString(R.string.RepeatSong);
                if (TextUtils.isEmpty(NOTIFY_REPEAT)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string4)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i14 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                str5 = null;
                e0Var4.a(new PlaybackStateCompat.CustomAction(NOTIFY_REPEAT, string4, i14, null));
            } else {
                str5 = null;
            }
            String string5 = LocaleController.getString(!isMessagePaused ? R.string.AccActionPause : R.string.AccActionPlay);
            if (messageObject2.isMusic()) {
                builder.addAction(new Notification.Action.Builder(SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off, LocaleController.getString(R.string.ShuffleList), pendingIntent).build());
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, string2, broadcast).build());
            }
            builder.addAction(new Notification.Action.Builder(!isMessagePaused ? R.drawable.ic_action_pause : R.drawable.ic_action_play, string5, broadcast2).build());
            if (messageObject2.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, str4, pendingIntent3).build());
                int i15 = SharedConfig.repeatMode;
                builder.addAction(new Notification.Action.Builder(i15 != 1 ? i15 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall, LocaleController.getString(R.string.RepeatSong), broadcast4).build());
            }
        }
        this.mediaSession.f(this.playbackState.b());
        updateRepeatMode();
        updateShuffleMode();
        android.support.v4.media.c cVar = new android.support.v4.media.c();
        String str8 = str3;
        cVar.j("android.media.metadata.ALBUM_ARTIST", str8);
        cVar.j("android.media.metadata.ARTIST", str8);
        cVar.i(duration);
        String str9 = str2;
        cVar.j("android.media.metadata.TITLE", str9);
        if (aVar == null || !messageObject2.isMusic()) {
            aVar2 = aVar;
            str6 = str5;
        } else {
            aVar2 = aVar;
            str6 = aVar2.f;
        }
        cVar.j("android.media.metadata.ALBUM", str6);
        if (bitmap4 == null || bitmap4.isRecycled()) {
            bitmap3 = bitmap4;
        } else {
            bitmap3 = bitmap4;
            cVar.h("android.media.metadata.ALBUM_ART", bitmap3);
        }
        this.mediaSession.e(new MediaMetadataCompat(cVar.a));
        builder.setVisibility(1);
        Notification build = builder.build();
        if (i10 >= 31) {
            if (this.foregroundServiceIsStarted) {
                ((NotificationManager) getSystemService("notification")).notify(5, build);
            } else {
                this.foregroundServiceIsStarted = true;
                startForeground(5, build);
            }
        } else if (isMessagePaused) {
            stopForeground(false);
            ((NotificationManager) getSystemService("notification")).notify(5, build);
        } else {
            startForeground(5, build);
        }
        if (this.remoteControlClient != null) {
            int id2 = MediaController.getInstance().getPlayingMessageObject().getId();
            if (this.notificationMessageID != id2) {
                this.notificationMessageID = id2;
                RemoteControlClient.MetadataEditor editMetadata = this.remoteControlClient.editMetadata(true);
                editMetadata.putString(2, str8);
                editMetadata.putString(7, str9);
                if (aVar2 != null && !TextUtils.isEmpty(aVar2.f)) {
                    editMetadata.putString(1, aVar2.f);
                }
                editMetadata.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * j3);
                if (bitmap3 != null) {
                    try {
                        editMetadata.putBitmap(100, bitmap3);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                }
                editMetadata.apply();
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MusicPlayerService.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MusicPlayerService.this.remoteControlClient == null || MediaController.getInstance().getPlayingMessageObject() == null) {
                            return;
                        }
                        if (MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration == -9223372036854775807L) {
                            AndroidUtilities.runOnUIThread(this, 500L);
                            return;
                        }
                        RemoteControlClient.MetadataEditor editMetadata2 = MusicPlayerService.this.remoteControlClient.editMetadata(false);
                        editMetadata2.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
                        editMetadata2.apply();
                        MusicPlayerService.this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
                    }
                }, j3);
            }
            if (MediaController.getInstance().isDownloadingCurrentMessage()) {
                this.remoteControlClient.setPlaybackState(8);
                return;
            }
            RemoteControlClient.MetadataEditor editMetadata2 = this.remoteControlClient.editMetadata(false);
            editMetadata2.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
            editMetadata2.apply();
            this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
        }
    }

    private int fixIntentFlags(int i10) {
        return (Build.VERSION.SDK_INT >= 31 || !XiaomiUtilities.isMIUI()) ? i10 : i10 & (-100663297);
    }

    private Bitmap getAvatarBitmap(TLObject tLObject, boolean z10, boolean z11) {
        int i10 = z10 ? 600 : 100;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.FileLocation fileLocation = z10 ? user.photo.photo_big : user.photo.photo_small;
                if (fileLocation != null) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation, true);
                    if (pathToAttach.exists()) {
                        float f7 = i10;
                        return ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, f7, f7, false);
                    }
                    if (z10) {
                        if (z11) {
                            this.loadingFilePath = FileLoader.getAttachFileName(fileLocation);
                            this.imageReceiver.setImage(ImageLocation.getForUser(UserConfig.selectedAccount, user, 0), "", null, null, null, 0);
                        } else {
                            this.loadingFilePath = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                TLRPC.FileLocation fileLocation2 = z10 ? chat.photo.photo_big : chat.photo.photo_small;
                if (fileLocation2 != null) {
                    File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation2, true);
                    if (pathToAttach2.exists()) {
                        float f10 = i10;
                        return ImageLoader.loadBitmap(pathToAttach2.getAbsolutePath(), null, f10, f10, false);
                    }
                    if (z10) {
                        if (z11) {
                            this.loadingFilePath = FileLoader.getAttachFileName(fileLocation2);
                            this.imageReceiver.setImage(ImageLocation.getForChat(chat, 0), "", null, null, null, 0);
                        } else {
                            this.loadingFilePath = null;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        if (z10) {
            return null;
        }
        org.telegram.ui.ActionBar.j6.R(this);
        org.telegram.ui.Components.g9 g9Var = tLObject instanceof TLRPC.User ? new org.telegram.ui.Components.g9(0, (TLRPC.User) tLObject) : new org.telegram.ui.Components.g9((TLRPC.Chat) tLObject);
        g9Var.r = 1;
        float f11 = i10;
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), Bitmap.Config.ARGB_8888);
        g9Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        g9Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private float getPlaybackSpeed(boolean z10, MessageObject messageObject) {
        if (!z10) {
            return 0.0f;
        }
        if (messageObject == null) {
            return 1.0f;
        }
        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            return MediaController.getInstance().getPlaybackSpeed(false);
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (!z10 || TextUtils.isEmpty(this.loadingFilePath)) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            createNotification(playingMessageObject, true);
        }
        this.loadingFilePath = null;
    }

    private Bitmap loadArtworkFromUrl(String str, boolean z10, boolean z11) {
        File httpFilePath = ImageLoader.getHttpFilePath(str, "jpg");
        if (httpFilePath.exists()) {
            return ImageLoader.loadBitmap(httpFilePath.getAbsolutePath(), null, z10 ? 600.0f : 100.0f, z10 ? 600.0f : 100.0f, false);
        }
        if (z11) {
            this.loadingFilePath = httpFilePath.getAbsolutePath();
            if (!z10) {
                this.imageReceiver.setImage(str, "48_48", null, null, 0L);
            }
        } else {
            this.loadingFilePath = null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackState(long j3) {
        long j10;
        this.playbackState = new android.support.v4.media.session.e0();
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z10 = !isMessagePaused;
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            android.support.v4.media.session.e0 e0Var = this.playbackState;
            e0Var.c(6, 0L, 1.0f);
            e0Var.e = 0L;
        } else {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                j10 = 2360070;
            } else {
                int i10 = SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                android.support.v4.media.session.e0 e0Var2 = this.playbackState;
                String string = LocaleController.getString(R.string.ShuffleList);
                if (TextUtils.isEmpty(NOTIFY_SHUFFLE)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i10 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                e0Var2.a(new PlaybackStateCompat.CustomAction(NOTIFY_SHUFFLE, string, i10, null));
                j10 = 2360118;
            }
            android.support.v4.media.session.e0 e0Var3 = this.playbackState;
            e0Var3.c(!isMessagePaused ? 3 : 2, j3, getPlaybackSpeed(z10, playingMessageObject));
            e0Var3.e = j10;
            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                int i11 = SharedConfig.repeatMode;
                int i12 = i11 != 1 ? i11 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                android.support.v4.media.session.e0 e0Var4 = this.playbackState;
                String string2 = LocaleController.getString(R.string.RepeatSong);
                if (TextUtils.isEmpty(NOTIFY_REPEAT)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string2)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i12 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                e0Var4.a(new PlaybackStateCompat.CustomAction(NOTIFY_REPEAT, string2, i12, null));
            }
        }
        this.mediaSession.f(this.playbackState.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatMode() {
        android.support.v4.media.session.b0 b0Var = this.mediaSession;
        if (b0Var != null) {
            int i10 = SharedConfig.repeatMode;
            b0Var.h(i10 != 1 ? i10 != 2 ? 0 : 1 : 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleMode() {
        android.support.v4.media.session.b0 b0Var = this.mediaSession;
        if (b0Var != null) {
            b0Var.i(SharedConfig.shuffleMusic ? 1 : 0);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        String str2;
        if (i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                createNotification(playingMessageObject, false);
                return;
            } else {
                stopSelf();
                return;
            }
        }
        if (i10 == NotificationCenter.messagePlayingDidSeek) {
            if (MediaController.getInstance().getPlayingMessageObject() == null) {
                return;
            }
            long round = Math.round(((Float) objArr[1]).floatValue() * r3.audioPlayerDuration) * 1000;
            updatePlaybackState(round);
            RemoteControlClient remoteControlClient = this.remoteControlClient;
            if (remoteControlClient != null) {
                remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, round, MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.httpFileDidLoad) {
            String str3 = (String) objArr[0];
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null || (str2 = this.loadingFilePath) == null || !str2.equals(str3)) {
                return;
            }
            createNotification(playingMessageObject2, false);
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            String str4 = (String) objArr[0];
            MessageObject playingMessageObject3 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject3 == null || (str = this.loadingFilePath) == null || !str.equals(str4)) {
                return;
            }
            createNotification(playingMessageObject3, false);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.imageReceiver = imageReceiver;
        imageReceiver.setDelegate(new c0(this, 9));
        this.mediaSession = new android.support.v4.media.session.b0(this, "telegramAudioPlayer", null, null);
        this.playbackState = new android.support.v4.media.session.e0();
        this.albumArtPlaceholder = Bitmap.createBitmap(AndroidUtilities.dp(102.0f), AndroidUtilities.dp(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.albumArtPlaceholder.getWidth(), this.albumArtPlaceholder.getHeight());
        drawable.draw(new Canvas(this.albumArtPlaceholder));
        this.mediaSession.d(new android.support.v4.media.session.s() { // from class: org.telegram.messenger.MusicPlayerService.2
            @Override // android.support.v4.media.session.s
            public void onCustomAction(String str, Bundle bundle) {
                if (MusicPlayerService.NOTIFY_REPEAT.equals(str)) {
                    SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                    MusicPlayerService.this.updateRepeatMode();
                    org.telegram.ui.Components.j8 j8Var = org.telegram.ui.Components.j8.T0;
                    if (j8Var != null) {
                        j8Var.H0();
                    }
                } else if (MusicPlayerService.NOTIFY_SHUFFLE.equals(str)) {
                    if (SharedConfig.shuffleMusic) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(2);
                    }
                    MusicPlayerService.this.updateShuffleMode();
                    org.telegram.ui.Components.j8 j8Var2 = org.telegram.ui.Components.j8.T0;
                    if (j8Var2 != null) {
                        j8Var2.H0();
                    }
                }
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override // android.support.v4.media.session.s
            public void onPause() {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
            }

            @Override // android.support.v4.media.session.s
            public void onPlay() {
                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
            }

            @Override // android.support.v4.media.session.s
            public void onSeekTo(long j3) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MediaController.getInstance().seekToProgress(playingMessageObject, (j3 / 1000) / ((float) playingMessageObject.getDuration()));
                    MusicPlayerService.this.updatePlaybackState(j3);
                }
            }

            @Override // android.support.v4.media.session.s
            public void onSetRepeatMode(int i11) {
                SharedConfig.setRepeatMode(i11 != 1 ? (i11 == 2 || i11 == 3) ? 1 : 0 : 2);
                MusicPlayerService.this.updateRepeatMode();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override // android.support.v4.media.session.s
            public void onSetShuffleMode(int i11) {
                if (i11 == 1 || i11 == 2) {
                    if (!SharedConfig.shuffleMusic) {
                        MediaController.getInstance().setPlaybackOrderType(2);
                    }
                } else if (SharedConfig.shuffleMusic) {
                    MediaController.getInstance().setPlaybackOrderType(0);
                }
                MusicPlayerService.this.updateShuffleMode();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
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
            public void onStop() {
            }
        }, null);
        this.mediaSession.c(true);
        updateRepeatMode();
        updateShuffleMode();
        registerReceiver(this.headsetPlugReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        unregisterReceiver(this.headsetPlugReceiver);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.remoteControlClient;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.audioManager.unregisterRemoteControlClient(this.remoteControlClient);
        }
        android.support.v4.media.session.b0 b0Var = this.mediaSession;
        if (b0Var != null) {
            b0Var.b();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                    return 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            AndroidUtilities.runOnUIThread(new dh(this, 0));
            return 1;
        }
        if (supportLockScreenControls) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.remoteControlClient == null) {
                    this.audioManager.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, fixIntentFlags(33554432)));
                    this.remoteControlClient = remoteControlClient;
                    this.audioManager.registerRemoteControlClient(remoteControlClient);
                }
                this.remoteControlClient.setTransportControlFlags(189);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        createNotification(playingMessageObject, false);
        return 1;
    }

    public void setListeners(RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(R.id.player_previous, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_PREVIOUS), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_close, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_CLOSE), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_pause, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_PAUSE), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_next, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_NEXT), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_play, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(NOTIFY_PLAY), fixIntentFlags(167772160)));
    }
}
