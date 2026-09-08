package org.telegram.messenger;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.IconCompat;
import e0.r;
import j$.util.Comparator$-CC;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class NotificationsController extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    public static final String EXTRA_VOICE_REPLY = "extra_voice_reply";
    private static volatile NotificationsController[] Instance = null;
    public static String OTHER_NOTIFICATIONS_CHANNEL = null;
    public static final int SETTING_MUTE_2_DAYS = 2;
    public static final int SETTING_MUTE_8_HOURS = 1;
    public static final int SETTING_MUTE_CUSTOM = 5;
    public static final int SETTING_MUTE_FOREVER = 3;
    public static final int SETTING_MUTE_HOUR = 0;
    public static final int SETTING_MUTE_UNMUTE = 4;
    public static final int SETTING_SOUND_OFF = 1;
    public static final int SETTING_SOUND_ON = 0;
    public static final int TYPE_CHANNEL = 2;
    public static final int TYPE_GROUP = 0;
    public static final int TYPE_PRIVATE = 1;
    public static final int TYPE_REACTIONS_MESSAGES = 4;
    public static final int TYPE_REACTIONS_STORIES = 5;
    public static final int TYPE_STORIES = 3;
    protected static AudioManager audioManager;
    private static final Object[] lockObjects;
    private static e0.n0 notificationManager;
    private static final a0.i sharedPrefCachedKeys;
    private static NotificationManager systemNotificationManager;
    private AlarmManager alarmManager;
    private boolean channelGroupsCreated;
    private Runnable checkStoryPushesRunnable;
    private final ArrayList<MessageObject> delayedPushMessages;
    NotificationsSettingsFacade dialogsNotificationsFacade;
    private final a0.i fcmRandomMessagesDict;
    private Boolean groupsCreated;
    private boolean inChatSoundEnabled;
    private int lastBadgeCount;
    private int lastButtonId;
    public long lastNotificationChannelCreateTime;
    private int lastOnlineFromOtherDevice;
    private long lastSoundOutPlay;
    private long lastSoundPlay;
    private final a0.i lastWearNotifiedMessageId;
    private String launcherClassName;
    private wh.h mediaSpoilerEffect;
    private Runnable notificationDelayRunnable;
    private PowerManager.WakeLock notificationDelayWakelock;
    private String notificationGroup;
    private int notificationId;
    private boolean notifyCheck;
    private long openedDialogId;
    private final HashSet<Long> openedInBubbleDialogs;
    private long openedTopicId;
    private final HashSet<String> pendingVoiceLoads;
    private int personalCount;
    public final ArrayList<MessageObject> popupMessages;
    public ArrayList<MessageObject> popupReplyMessages;
    private final a0.i pushDialogs;
    private final a0.i pushDialogsOverrideMention;
    private final ArrayList<MessageObject> pushMessages;
    private final a0.i pushMessagesDict;
    public boolean showBadgeMessages;
    public boolean showBadgeMuted;
    public boolean showBadgeNumber;
    private final a0.i smartNotificationsDialogs;
    private int soundIn;
    private boolean soundInLoaded;
    private int soundOut;
    private boolean soundOutLoaded;
    private SoundPool soundPool;
    private int soundRecord;
    private boolean soundRecordLoaded;
    char[] spoilerChars;
    private final ArrayList<StoryNotification> storyPushMessages;
    private final a0.i storyPushMessagesDict;
    private int total_unread_count;
    private final a0.i wearNotificationsIds;
    private static final DispatchQueue notificationsQueue = new DispatchQueue("notificationsQueue");
    public static long globalSecretChatId = DialogObject.makeEncryptedDialogId(1);

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public class 1NotificationHolder {
        TLRPC.Chat chat;
        long dialogId;
        int id;
        String name;
        e0.t notification;
        boolean story;
        long topicId;
        TLRPC.User user;
        final /* synthetic */ String val$chatName;
        final /* synthetic */ int val$chatType;
        final /* synthetic */ int val$importance;
        final /* synthetic */ boolean val$isDefault;
        final /* synthetic */ boolean val$isInApp;
        final /* synthetic */ boolean val$isSilent;
        final /* synthetic */ long val$lastTopicId;
        final /* synthetic */ int val$ledColor;
        final /* synthetic */ Uri val$sound;
        final /* synthetic */ long[] val$vibrationPattern;

        public 1NotificationHolder(int i10, long j3, boolean z10, long j10, String str, TLRPC.User user, TLRPC.Chat chat, e0.t tVar, long j11, String str2, long[] jArr, int i11, Uri uri, int i12, boolean z11, boolean z12, boolean z13, int i13) {
            this.val$lastTopicId = j11;
            this.val$chatName = str2;
            this.val$vibrationPattern = jArr;
            this.val$ledColor = i11;
            this.val$sound = uri;
            this.val$importance = i12;
            this.val$isDefault = z11;
            this.val$isInApp = z12;
            this.val$isSilent = z13;
            this.val$chatType = i13;
            this.id = i10;
            this.name = str;
            this.user = user;
            this.chat = chat;
            this.notification = tVar;
            this.dialogId = j3;
            this.story = z10;
            this.topicId = j10;
        }

        public void call() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("show dialog notification with id " + this.id + " " + this.dialogId + " user=" + this.user + " chat=" + this.chat);
            }
            try {
                NotificationsController.notificationManager.d(this.id, this.notification.b());
            } catch (SecurityException e7) {
                FileLog.e(e7);
                NotificationsController.this.resetNotificationSound(this.notification, this.dialogId, this.val$lastTopicId, this.val$chatName, this.val$vibrationPattern, this.val$ledColor, this.val$sound, this.val$importance, this.val$isDefault, this.val$isInApp, this.val$isSilent, this.val$chatType);
            }
        }
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static class DialogKey {
        final long dialogId;
        final boolean story;
        final long topicId;

        private DialogKey(long j3, long j10, boolean z10) {
            this.dialogId = j3;
            this.topicId = j10;
            this.story = z10;
        }
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static class StoryNotification {
        public long date;
        final HashMap<Integer, Pair<Long, Long>> dateByIds;
        final long dialogId;
        boolean hidden;
        String localName;

        public StoryNotification(long j3, String str, int i10, long j10) {
            this(j3, str, i10, j10, j10 + 86400000);
        }

        public long getLeastDate() {
            long j3 = -1;
            for (Pair<Long, Long> pair : this.dateByIds.values()) {
                if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                    j3 = ((Long) pair.first).longValue();
                }
            }
            return j3;
        }

        public StoryNotification(long j3, String str, int i10, long j10, long j11) {
            HashMap<Integer, Pair<Long, Long>> hashMap = new HashMap<>();
            this.dateByIds = hashMap;
            this.dialogId = j3;
            this.localName = str;
            hashMap.put(Integer.valueOf(i10), new Pair<>(Long.valueOf(j10), Long.valueOf(j11)));
            this.date = j10;
        }
    }

    static {
        notificationManager = null;
        systemNotificationManager = null;
        if (Build.VERSION.SDK_INT >= 26 && ApplicationLoader.applicationContext != null) {
            notificationManager = new e0.n0(ApplicationLoader.applicationContext);
            systemNotificationManager = (NotificationManager) ApplicationLoader.applicationContext.getSystemService("notification");
            checkOtherNotificationsChannel();
        }
        audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        Instance = new NotificationsController[4];
        lockObjects = new Object[4];
        for (int i10 = 0; i10 < 4; i10++) {
            lockObjects[i10] = new Object();
        }
        sharedPrefCachedKeys = new a0.i();
    }

    public NotificationsController(int i10) {
        super(i10);
        this.pushMessages = new ArrayList<>();
        this.delayedPushMessages = new ArrayList<>();
        this.pushMessagesDict = new a0.i();
        this.fcmRandomMessagesDict = new a0.i();
        this.smartNotificationsDialogs = new a0.i();
        this.pushDialogs = new a0.i();
        this.wearNotificationsIds = new a0.i();
        this.lastWearNotifiedMessageId = new a0.i();
        this.pushDialogsOverrideMention = new a0.i();
        this.pendingVoiceLoads = new HashSet<>();
        this.popupMessages = new ArrayList<>();
        this.popupReplyMessages = new ArrayList<>();
        this.openedInBubbleDialogs = new HashSet<>();
        this.storyPushMessages = new ArrayList<>();
        this.storyPushMessagesDict = new a0.i();
        this.openedDialogId = 0L;
        this.openedTopicId = 0L;
        this.lastButtonId = 5000;
        this.total_unread_count = 0;
        this.personalCount = 0;
        this.notifyCheck = false;
        this.lastOnlineFromOtherDevice = 0;
        this.lastBadgeCount = -1;
        this.mediaSpoilerEffect = new wh.h();
        this.spoilerChars = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.checkStoryPushesRunnable = new bh(this, 7);
        this.notificationId = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i11 = this.currentAccount;
        sb2.append(i11 == 0 ? "" : Integer.valueOf(i11));
        this.notificationGroup = sb2.toString();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        this.inChatSoundEnabled = notificationsSettings.getBoolean("EnableInChatSound", true);
        this.showBadgeNumber = notificationsSettings.getBoolean("badgeNumber", true);
        this.showBadgeMuted = notificationsSettings.getBoolean("badgeNumberMuted", false);
        this.showBadgeMessages = notificationsSettings.getBoolean("badgeNumberMessages", true);
        notificationManager = new e0.n0(ApplicationLoader.applicationContext);
        systemNotificationManager = (NotificationManager) ApplicationLoader.applicationContext.getSystemService("notification");
        try {
            audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            this.alarmManager = (AlarmManager) ApplicationLoader.applicationContext.getSystemService("alarm");
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.notificationDelayWakelock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        this.notificationDelayRunnable = new bh(this, 8);
        this.dialogsNotificationsFacade = new NotificationsSettingsFacade(this.currentAccount);
        AndroidUtilities.runOnUIThread(new bh(this, 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if (r0 == 2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int addToPopupMessages(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j3, boolean z10, SharedPreferences sharedPreferences) {
        int i10;
        if (messageObject.isStoryReactionPush) {
            return 0;
        }
        if (!DialogObject.isEncryptedDialog(j3)) {
            if (w1.v(NotificationsSettingsFacade.PROPERTY_CUSTOM, j3, sharedPreferences, false)) {
                i10 = sharedPreferences.getInt("popup_" + j3, 0);
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                if (z10) {
                    i10 = sharedPreferences.getInt("popupChannel", 0);
                } else {
                    i10 = sharedPreferences.getInt(DialogObject.isChatDialog(j3) ? "popupGroup" : "popupAll", 0);
                }
            } else if (i10 == 1) {
                i10 = 3;
            }
            if (i10 != 0 && messageObject.messageOwner.peer_id.channel_id != 0 && !messageObject.isSupergroup()) {
                i10 = 0;
            }
            if (i10 != 0) {
                arrayList.add(0, messageObject);
            }
            return i10;
        }
        i10 = 0;
        if (i10 != 0) {
            i10 = 0;
        }
        if (i10 != 0) {
        }
        return i10;
    }

    private void appendMessage(MessageObject messageObject) {
        for (int i10 = 0; i10 < this.pushMessages.size(); i10++) {
            if (this.pushMessages.get(i10).getId() == messageObject.getId() && this.pushMessages.get(i10).getDialogId() == messageObject.getDialogId() && this.pushMessages.get(i10).isStoryPush == messageObject.isStoryPush) {
                return;
            }
        }
        this.pushMessages.add(0, messageObject);
    }

    public static void checkOtherNotificationsChannel() {
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (OTHER_NOTIFICATIONS_CHANNEL == null) {
            sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0);
            OTHER_NOTIFICATIONS_CHANNEL = sharedPreferences.getString("OtherKey", "Other3");
        } else {
            sharedPreferences = null;
        }
        NotificationChannel notificationChannel = systemNotificationManager.getNotificationChannel(OTHER_NOTIFICATIONS_CHANNEL);
        if (notificationChannel != null && notificationChannel.getImportance() == 0) {
            try {
                systemNotificationManager.deleteNotificationChannel(OTHER_NOTIFICATIONS_CHANNEL);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            OTHER_NOTIFICATIONS_CHANNEL = null;
            notificationChannel = null;
        }
        if (OTHER_NOTIFICATIONS_CHANNEL == null) {
            if (sharedPreferences == null) {
                sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0);
            }
            OTHER_NOTIFICATIONS_CHANNEL = "Other" + Utilities.random.nextLong();
            sharedPreferences.edit().putString("OtherKey", OTHER_NOTIFICATIONS_CHANNEL).commit();
        }
        if (notificationChannel == null) {
            NotificationChannel notificationChannel2 = new NotificationChannel(OTHER_NOTIFICATIONS_CHANNEL, "Internal notifications", 3);
            notificationChannel2.enableLights(false);
            notificationChannel2.enableVibration(false);
            notificationChannel2.setSound(null, null);
            try {
                systemNotificationManager.createNotificationChannel(notificationChannel2);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkStoryPushes() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.storyPushMessages.size()) {
            StoryNotification storyNotification = this.storyPushMessages.get(i10);
            Iterator<Map.Entry<Integer, Pair<Long, Long>>> it = storyNotification.dateByIds.entrySet().iterator();
            while (it.hasNext()) {
                if (currentTimeMillis >= ((Long) it.next().getValue().second).longValue()) {
                    it.remove();
                    z10 = true;
                }
            }
            if (z10) {
                if (storyNotification.dateByIds.isEmpty()) {
                    getMessagesStorage().deleteStoryPushMessage(storyNotification.dialogId);
                    this.storyPushMessages.remove(i10);
                    i10--;
                } else {
                    getMessagesStorage().putStoryPushMessage(storyNotification);
                }
            }
            i10++;
        }
        if (z10) {
            showOrUpdateNotification(false);
        }
        updateStoryPushesRunnable();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6 A[Catch: Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:8:0x0024, B:11:0x005d, B:12:0x0068, B:15:0x007c, B:17:0x009c, B:19:0x00a8, B:20:0x00ae, B:22:0x00b6, B:24:0x00ba, B:26:0x00bd, B:28:0x00cd, B:30:0x00d1, B:32:0x00d6, B:33:0x00dd, B:35:0x00e1, B:36:0x00e6, B:38:0x010d, B:39:0x0115, B:41:0x011e, B:43:0x0145, B:45:0x014f, B:50:0x015d, B:55:0x0179, B:56:0x0180, B:57:0x0181, B:60:0x012b, B:62:0x0131, B:63:0x0136, B:64:0x0134, B:65:0x013b, B:66:0x0111, B:67:0x0185, B:68:0x018c, B:69:0x018d, B:70:0x0194, B:72:0x0078, B:73:0x0064), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d A[Catch: Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:8:0x0024, B:11:0x005d, B:12:0x0068, B:15:0x007c, B:17:0x009c, B:19:0x00a8, B:20:0x00ae, B:22:0x00b6, B:24:0x00ba, B:26:0x00bd, B:28:0x00cd, B:30:0x00d1, B:32:0x00d6, B:33:0x00dd, B:35:0x00e1, B:36:0x00e6, B:38:0x010d, B:39:0x0115, B:41:0x011e, B:43:0x0145, B:45:0x014f, B:50:0x015d, B:55:0x0179, B:56:0x0180, B:57:0x0181, B:60:0x012b, B:62:0x0131, B:63:0x0136, B:64:0x0134, B:65:0x013b, B:66:0x0111, B:67:0x0185, B:68:0x018c, B:69:0x018d, B:70:0x0194, B:72:0x0078, B:73:0x0064), top: B:7:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String createNotificationShortcut(e0.t tVar, long j3, String str, TLRPC.User user, TLRPC.Chat chat, e0.p0 p0Var, boolean z10) {
        Bitmap bitmap;
        IconCompat d;
        if (unsupportedNotificationShortcut() || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            return null;
        }
        try {
            String str2 = "ndid_" + j3;
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
            intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (j3 > 0) {
                intent.putExtra("userId", j3);
            } else {
                intent.putExtra("chatId", -j3);
            }
            Context context = ApplicationLoader.applicationContext;
            g0.c cVar = new g0.c();
            cVar.a = context;
            cVar.b = str2;
            cVar.e = chat != null ? str : UserObject.getFirstName(user);
            cVar.f = str;
            new Intent("android.intent.action.VIEW");
            cVar.c = new Intent[]{intent};
            cVar.l = true;
            cVar.k = new f0.h(str2);
            if (p0Var != null) {
                cVar.i = new e0.p0[]{p0Var};
                IconCompat iconCompat = p0Var.b;
                cVar.h = iconCompat;
                if (iconCompat != null) {
                    bitmap = iconCompat.f();
                    if (!TextUtils.isEmpty(cVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = cVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    g0.f.m(ApplicationLoader.applicationContext, cVar);
                    tVar.getClass();
                    String str3 = cVar.b;
                    tVar.z = str3;
                    if (tVar.A == null) {
                        f0.h hVar = cVar.k;
                        if (hVar != null) {
                            tVar.A = hVar;
                        } else if (str3 != null) {
                            tVar.A = new f0.h(str3);
                        }
                    }
                    if (tVar.e == null) {
                        tVar.g(cVar.e);
                    }
                    Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) BubbleActivity.class);
                    StringBuilder sb2 = new StringBuilder("com.tmessages.openchat");
                    Bitmap bitmap2 = bitmap;
                    sb2.append(Math.random());
                    sb2.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent2.setAction(sb2.toString());
                    if (DialogObject.isUserDialog(j3)) {
                        intent2.putExtra("userId", j3);
                    } else {
                        intent2.putExtra("chatId", -j3);
                    }
                    intent2.putExtra("currentAccount", this.currentAccount);
                    if (bitmap2 != null) {
                        d = new IconCompat(5);
                        d.b = bitmap2;
                    } else if (user != null) {
                        d = IconCompat.d(ApplicationLoader.applicationContext, user.bot ? R.drawable.book_bot : R.drawable.book_user);
                    } else {
                        d = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
                    }
                    if (!z10) {
                        tVar.D = null;
                        return str2;
                    }
                    PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160);
                    if (activity == null) {
                        throw new NullPointerException("Bubble requires non-null pending intent");
                    }
                    int i10 = (this.openedDialogId > j3 ? 1 : (this.openedDialogId == j3 ? 0 : -1)) == 0 ? 2 : 0;
                    int max = Math.max(AndroidUtilities.dp(640.0f), 0);
                    r rVar = new r();
                    rVar.a = activity;
                    rVar.b = d;
                    rVar.c = max;
                    rVar.d = i10 & (-2);
                    tVar.D = rVar;
                    return str2;
                }
            }
            bitmap = null;
            if (!TextUtils.isEmpty(cVar.e)) {
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    private String cutLastName(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf < 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, indexOf));
        sb2.append(str.endsWith("…") ? "…" : "");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deleteNotificationChannelInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$deleteNotificationChannel$42(long j3, long j10, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            SharedPreferences.Editor edit = notificationsSettings.edit();
            if (i10 == 0 || i10 == -1) {
                String str = "org.telegram.key" + j3;
                if (j10 != 0) {
                    str = str + ".topic" + j10;
                }
                String string = notificationsSettings.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel internal ".concat(string));
                    }
                }
            }
            if (i10 == 1 || i10 == -1) {
                String str2 = "org.telegram.keyia" + j3;
                String string2 = notificationsSettings.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2 + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string2);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel internal ".concat(string2));
                    }
                }
            }
            edit.commit();
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    private void dismissNotification() {
        FileLog.d("NotificationsController dismissNotification");
        try {
            notificationManager.b(this.notificationId);
            this.pushMessages.clear();
            this.pushMessagesDict.b();
            this.lastWearNotifiedMessageId.b();
            for (int i10 = 0; i10 < this.wearNotificationsIds.m(); i10++) {
                if (!this.openedInBubbleDialogs.contains(Long.valueOf(this.wearNotificationsIds.j(i10)))) {
                    notificationManager.b(((Integer) this.wearNotificationsIds.n(i10)).intValue());
                }
            }
            this.wearNotificationsIds.b();
            AndroidUtilities.runOnUIThread(new u1(17));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static String getGlobalNotificationsKey(int i10) {
        return i10 == 0 ? "EnableGroup2" : i10 == 1 ? "EnableAll2" : "EnableChannel2";
    }

    private TLRPC.NotificationSound getInputSound(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j3 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j3 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j3;
            return tL_notificationSoundRingtone;
        }
        if (string == null) {
            return new TLRPC.TL_notificationSoundDefault();
        }
        if (string.equalsIgnoreCase("NoSound")) {
            return new TLRPC.TL_notificationSoundNone();
        }
        TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
        tL_notificationSoundLocal.title = sharedPreferences.getString(str, null);
        tL_notificationSoundLocal.data = string;
        return tL_notificationSoundLocal;
    }

    public static NotificationsController getInstance(int i10) {
        NotificationsController notificationsController;
        NotificationsController notificationsController2 = Instance[i10];
        if (notificationsController2 != null) {
            return notificationsController2;
        }
        synchronized (lockObjects[i10]) {
            try {
                notificationsController = Instance[i10];
                if (notificationsController == null) {
                    NotificationsController[] notificationsControllerArr = Instance;
                    NotificationsController notificationsController3 = new NotificationsController(i10);
                    notificationsControllerArr[i10] = notificationsController3;
                    notificationsController = notificationsController3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return notificationsController;
    }

    private int getNotifyOverride(SharedPreferences sharedPreferences, long j3, long j10) {
        int property = this.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_NOTIFY, j3, j10, -1);
        if (property != 3 || this.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, j3, j10, 0) < getConnectionsManager().getCurrentTime()) {
            return property;
        }
        return 2;
    }

    public static String getSharedPrefKey(long j3, long j10) {
        return getSharedPrefKey(j3, j10, false);
    }

    private String getStringForMessage(MessageObject messageObject, boolean z10, boolean[] zArr, boolean[] zArr2) {
        long j3;
        String string;
        TLRPC.Chat chat;
        char c10;
        char c11;
        char c12;
        boolean z11;
        String formatString;
        if (AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return LocaleController.getString(R.string.YouHaveNewMessage);
        }
        if (messageObject.isStoryPush || messageObject.isStoryMentionPush) {
            return "!" + messageObject.messageOwner.message;
        }
        TLRPC.Message message = messageObject.messageOwner;
        long j10 = message.dialog_id;
        TLRPC.Peer peer = message.peer_id;
        long j11 = peer.chat_id;
        if (j11 == 0) {
            j11 = peer.channel_id;
        }
        long j12 = peer.user_id;
        if (zArr2 != null) {
            zArr2[0] = true;
        }
        if (messageObject.getDialogId() == UserObject.VERIFY && messageObject.getForwardedFromId() != null) {
            j12 = messageObject.getForwardedFromId().longValue();
            j11 = j12 < 0 ? -j12 : 0L;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        boolean v = w1.v(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, j10, notificationsSettings, true);
        if (messageObject.isFcmMessage()) {
            if (j11 != 0 || j12 == 0) {
                if (j11 != 0 && (!v || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true))))) {
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    return (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, messageObject.localUserName, messageObject.localName) : LocaleController.formatString(R.string.ChannelMessageNoText, messageObject.localName);
                }
            } else if (!v || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return LocaleController.formatString(R.string.NotificationMessageNoText, messageObject.localName);
            }
            zArr[0] = true;
            return (String) messageObject.messageText;
        }
        long clientUserId = getUserConfig().getClientUserId();
        if (j12 == 0) {
            j12 = messageObject.getFromChatId();
            if (j12 == 0) {
                j12 = -j11;
            }
        } else if (j12 == clientUserId) {
            j12 = messageObject.getFromChatId();
        }
        if (j10 == 0) {
            if (j11 != 0) {
                j10 = -j11;
            } else if (j12 != 0) {
                j10 = j12;
            }
        }
        if (messageObject.getDialogId() == UserObject.OAUTH || messageObject.isOauthPush) {
            j3 = j10;
            string = LocaleController.getString(R.string.BotAuthNotificationTitle);
        } else if (j12 > 0) {
            if (messageObject.messageOwner.from_scheduled) {
                string = j10 == clientUserId ? LocaleController.getString(R.string.MessageScheduledReminderNotification) : LocaleController.getString(R.string.NotificationMessageScheduledName);
            } else {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(j12));
                string = user != null ? UserObject.getUserName(user) : null;
            }
            j3 = j10;
        } else {
            j3 = j10;
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j12));
            string = chat2 != null ? getTitle(chat2) : null;
        }
        if (string == null) {
            return null;
        }
        if (j11 != 0) {
            chat = getMessagesController().getChat(Long.valueOf(j11));
            if (chat == null) {
                return null;
            }
        } else {
            chat = null;
        }
        if (DialogObject.isEncryptedDialog(j3)) {
            return LocaleController.getString(R.string.YouHaveNewMessage);
        }
        if (j11 == 0 && j12 != 0) {
            if (!v || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return LocaleController.formatString(R.string.NotificationMessageNoText, string);
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            if (!(message2 instanceof TLRPC.TL_messageService)) {
                if (messageObject.isMediaEmpty()) {
                    if (!z10 && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        String formatString2 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageOwner.message);
                        zArr[0] = true;
                        return formatString2;
                    }
                    return LocaleController.formatString(R.string.NotificationMessageNoText, string);
                }
                TLRPC.Message message3 = messageObject.messageOwner;
                if (message3.media instanceof TLRPC.TL_messageMediaPhoto) {
                    if (z10 || TextUtils.isEmpty(message3.message)) {
                        return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDPhoto, string) : LocaleController.formatString(R.string.NotificationMessagePhoto, string);
                    }
                    String formatString3 = LocaleController.formatString(R.string.NotificationMessageText, string, "🖼 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString3;
                }
                if (messageObject.isVideo()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDVideo, string) : LocaleController.formatString(R.string.NotificationMessageVideo, string);
                    }
                    String formatString4 = LocaleController.formatString(R.string.NotificationMessageText, string, "📹 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString4;
                }
                if (messageObject.isGame()) {
                    return LocaleController.formatString(R.string.NotificationMessageGame, string, messageObject.messageOwner.media.game.title);
                }
                if (messageObject.isVoice()) {
                    return LocaleController.formatString(R.string.NotificationMessageAudio, string);
                }
                if (messageObject.isRoundVideo()) {
                    return LocaleController.formatString(R.string.NotificationMessageRound, string);
                }
                if (messageObject.isMusic()) {
                    return LocaleController.formatString(R.string.NotificationMessageMusic, string);
                }
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                    TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageMedia;
                    return LocaleController.formatString(R.string.NotificationMessageContact2, string, ContactsController.formatName(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                    return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, string, Integer.valueOf(tL_messageMediaGiveaway.quantity), Integer.valueOf(tL_messageMediaGiveaway.months));
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    return poll.quiz ? LocaleController.formatString(R.string.NotificationMessageQuiz2, string, poll.question.text) : LocaleController.formatString(R.string.NotificationMessagePoll2, string, poll.question.text);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    return LocaleController.formatString(R.string.NotificationMessageTodo2, string, ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                }
                if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                    return LocaleController.formatString(R.string.NotificationMessageMap, string);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
                    return LocaleController.formatString(R.string.NotificationMessageLiveLocation, string);
                }
                if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageText)) {
                        return LocaleController.formatString(R.string.NotificationMessageNoText, string);
                    }
                    String formatString5 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageText);
                    zArr[0] = true;
                    return formatString5;
                }
                if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                    String stickerEmoji = messageObject.getStickerEmoji();
                    return stickerEmoji != null ? LocaleController.formatString(R.string.NotificationMessageStickerEmoji, string, stickerEmoji) : LocaleController.formatString(R.string.NotificationMessageSticker, string);
                }
                if (messageObject.isGif()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageGif, string);
                    }
                    String formatString6 = LocaleController.formatString(R.string.NotificationMessageText, string, "🎬 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString6;
                }
                if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                    return LocaleController.formatString(R.string.NotificationMessageDocument, string);
                }
                String formatString7 = LocaleController.formatString(R.string.NotificationMessageText, string, "📎 " + messageObject.messageOwner.message);
                zArr[0] = true;
                return formatString7;
            }
            TLRPC.MessageAction messageAction = message2.action;
            if ((messageAction instanceof TLRPC.TL_messageActionChangeCreator) || (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending)) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                return LocaleController.getString(R.string.WallpaperSameNotification);
            }
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                return LocaleController.getString(R.string.WallpaperNotification);
            }
            if (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                return messageObject.messageText.toString();
            }
            if ((messageAction instanceof TLRPC.TL_messageActionUserJoined) || (messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                return LocaleController.formatString(R.string.NotificationContactJoined, string);
            }
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return LocaleController.formatString(R.string.NotificationContactNewPhoto, string);
            }
            if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                String formatString8 = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(messageObject.messageOwner.date * 1000), LocaleController.getInstance().getFormatterDay().format(messageObject.messageOwner.date * 1000));
                int i10 = R.string.NotificationUnrecognizedDevice;
                String str = getUserConfig().getCurrentUser().first_name;
                TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                return LocaleController.formatString(i10, str, formatString8, messageAction2.title, messageAction2.address);
            }
            if ((messageAction instanceof TLRPC.TL_messageActionGameScore) || (messageAction instanceof TLRPC.TL_messageActionPaymentSent) || (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe)) {
                return messageObject.messageText.toString();
            }
            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionGiftPremium) || (messageAction instanceof TLRPC.TL_messageActionGiftTon)) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionSuggestBirthday) {
                return messageObject.messageText.toString();
            }
            if ((messageAction instanceof TLRPC.TL_messageActionPaidMessagesRefunded) || (messageAction instanceof TLRPC.TL_messageActionPaidMessagesPrice)) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                return messageAction.video ? LocaleController.getString(R.string.CallMessageVideoIncomingMissed) : LocaleController.getString(R.string.CallMessageIncomingMissed);
            }
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                return messageAction.video ? LocaleController.getString(R.string.CallMessageVideoIncomingConferenceMissed) : LocaleController.getString(R.string.CallMessageIncomingConferenceMissed);
            }
            if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                String f7 = zf.d.f(((TLRPC.TL_messageActionSetChatTheme) messageAction).theme);
                if (!TextUtils.isEmpty(f7)) {
                    c12 = 0;
                    z11 = true;
                    formatString = j3 == clientUserId ? LocaleController.formatString(R.string.ChatThemeChangedYou, f7) : LocaleController.formatString(R.string.ChatThemeChangedTo, string, f7);
                } else if (j3 == clientUserId) {
                    c12 = 0;
                    formatString = LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]);
                    z11 = true;
                } else {
                    c12 = 0;
                    z11 = true;
                    formatString = LocaleController.formatString(R.string.ChatThemeDisabled, string, f7);
                }
                zArr[c12] = z11;
                return formatString;
            }
        } else if (j11 != 0) {
            boolean z12 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (!v || ((z12 || !notificationsSettings.getBoolean("EnablePreviewGroup", true)) && !(z12 && notificationsSettings.getBoolean("EnablePreviewChannel", true)))) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return (!ChatObject.isChannel(chat) || chat.megagroup) ? (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) ? LocaleController.formatPluralString("NotificationMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, string) : LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat)) : LocaleController.formatString(R.string.ChannelMessageNoText, string);
            }
            TLRPC.Message message4 = messageObject.messageOwner;
            if (!(message4 instanceof TLRPC.TL_messageService)) {
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    if (messageObject.isMediaEmpty()) {
                        return (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), messageObject.messageOwner.message);
                    }
                    if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        return LocaleController.formatPluralString("NotificationChatMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, string, getTitle(chat));
                    }
                    TLRPC.Message message5 = messageObject.messageOwner;
                    if (message5.media instanceof TLRPC.TL_messageMediaPhoto) {
                        if (z10 || TextUtils.isEmpty(message5.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "🖼 " + messageObject.messageOwner.message);
                    }
                    if (messageObject.isVideo()) {
                        if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "📹 " + messageObject.messageOwner.message);
                    }
                    if (messageObject.isVoice()) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupAudio, string, getTitle(chat));
                    }
                    if (messageObject.isRoundVideo()) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupRound, string, getTitle(chat));
                    }
                    if (messageObject.isMusic()) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupMusic, string, getTitle(chat));
                    }
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact2 = (TLRPC.TL_messageMediaContact) messageMedia2;
                        return LocaleController.formatString(R.string.NotificationMessageGroupContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact2.first_name, tL_messageMediaContact2.last_name));
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                        return tL_messageMediaPoll.poll.quiz ? LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text) : LocaleController.formatString(R.string.NotificationMessageGroupPoll2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia2).todo.title.text);
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupGame, string, getTitle(chat), messageObject.messageOwner.media.game.title);
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageMedia2;
                        return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway2.quantity), Integer.valueOf(tL_messageMediaGiveaway2.months));
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                        return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                    }
                    if ((messageMedia2 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia2 instanceof TLRPC.TL_messageMediaVenue)) {
                        return LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, string, getTitle(chat));
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaGeoLive) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupLiveLocation, string, getTitle(chat));
                    }
                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                        return (z10 || TextUtils.isEmpty(messageObject.messageText)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), messageObject.messageText);
                    }
                    if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                        String stickerEmoji2 = messageObject.getStickerEmoji();
                        return stickerEmoji2 != null ? LocaleController.formatString(R.string.NotificationMessageGroupStickerEmoji, string, getTitle(chat), stickerEmoji2) : LocaleController.formatString(R.string.NotificationMessageGroupSticker, string, getTitle(chat));
                    }
                    if (messageObject.isGif()) {
                        if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGroupGif, string, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "🎬 " + messageObject.messageOwner.message);
                    }
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupDocument, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "📎 " + messageObject.messageOwner.message);
                }
                if (messageObject.isMediaEmpty()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.ChannelMessageNoText, string);
                    }
                    String formatString9 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString9;
                }
                if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    return LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, getTitle(chat));
                }
                TLRPC.Message message6 = messageObject.messageOwner;
                if (message6.media instanceof TLRPC.TL_messageMediaPhoto) {
                    if (z10 || TextUtils.isEmpty(message6.message)) {
                        return LocaleController.formatString(R.string.ChannelMessagePhoto, string);
                    }
                    String formatString10 = LocaleController.formatString(R.string.NotificationMessageText, string, "🖼 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString10;
                }
                if (messageObject.isVideo()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.ChannelMessageVideo, string);
                    }
                    String formatString11 = LocaleController.formatString(R.string.NotificationMessageText, string, "📹 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString11;
                }
                if (messageObject.isVoice()) {
                    return LocaleController.formatString(R.string.ChannelMessageAudio, string);
                }
                if (messageObject.isRoundVideo()) {
                    return LocaleController.formatString(R.string.ChannelMessageRound, string);
                }
                if (messageObject.isMusic()) {
                    return LocaleController.formatString(R.string.ChannelMessageMusic, string);
                }
                TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
                if (messageMedia3 instanceof TLRPC.TL_messageMediaContact) {
                    TLRPC.TL_messageMediaContact tL_messageMediaContact3 = (TLRPC.TL_messageMediaContact) messageMedia3;
                    return LocaleController.formatString(R.string.ChannelMessageContact2, string, ContactsController.formatName(tL_messageMediaContact3.first_name, tL_messageMediaContact3.last_name));
                }
                if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll2 = ((TLRPC.TL_messageMediaPoll) messageMedia3).poll;
                    return poll2.quiz ? LocaleController.formatString(R.string.ChannelMessageQuiz2, string, poll2.question.text) : LocaleController.formatString(R.string.ChannelMessagePoll2, string, poll2.question.text);
                }
                if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                    return LocaleController.formatString(R.string.ChannelMessageTodo2, string, ((TLRPC.TL_messageMediaToDo) messageMedia3).todo.title.text);
                }
                if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveaway) {
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
                    return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway3.quantity), Integer.valueOf(tL_messageMediaGiveaway3.months));
                }
                if ((messageMedia3 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia3 instanceof TLRPC.TL_messageMediaVenue)) {
                    return LocaleController.formatString(R.string.ChannelMessageMap, string);
                }
                if (messageMedia3 instanceof TLRPC.TL_messageMediaGeoLive) {
                    return LocaleController.formatString(R.string.ChannelMessageLiveLocation, string);
                }
                if (!(messageMedia3 instanceof TLRPC.TL_messageMediaDocument)) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageText)) {
                        return LocaleController.formatString(R.string.ChannelMessageNoText, string);
                    }
                    String formatString12 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageText);
                    zArr[0] = true;
                    return formatString12;
                }
                if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                    String stickerEmoji3 = messageObject.getStickerEmoji();
                    return stickerEmoji3 != null ? LocaleController.formatString(R.string.ChannelMessageStickerEmoji, string, stickerEmoji3) : LocaleController.formatString(R.string.ChannelMessageSticker, string);
                }
                if (messageObject.isGif()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.ChannelMessageGIF, string);
                    }
                    String formatString13 = LocaleController.formatString(R.string.NotificationMessageText, string, "🎬 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return formatString13;
                }
                if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                    return LocaleController.formatString(R.string.ChannelMessageDocument, string);
                }
                String formatString14 = LocaleController.formatString(R.string.NotificationMessageText, string, "📎 " + messageObject.messageOwner.message);
                zArr[0] = true;
                return formatString14;
            }
            TLRPC.MessageAction messageAction3 = message4.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                long j13 = messageAction3.user_id;
                if (j13 == 0 && messageAction3.users.size() == 1) {
                    j13 = messageObject.messageOwner.action.users.get(0).longValue();
                }
                if (j13 != 0) {
                    if (messageObject.messageOwner.peer_id.channel_id != 0 && !chat.megagroup) {
                        return LocaleController.formatString(R.string.ChannelAddedByNotification, string, getTitle(chat));
                    }
                    if (j13 == clientUserId) {
                        return LocaleController.formatString(R.string.NotificationInvitedToGroup, string, getTitle(chat));
                    }
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j13));
                    if (user2 == null) {
                        return null;
                    }
                    return j12 == user2.id ? chat.megagroup ? LocaleController.formatString(R.string.NotificationGroupAddSelfMega, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupAddSelf, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), UserObject.getUserName(user2));
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < messageObject.messageOwner.action.users.size(); i11++) {
                    TLRPC.User user3 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i11));
                    if (user3 != null) {
                        String userName = UserObject.getUserName(user3);
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(userName);
                    }
                }
                return LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), sb2.toString());
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionGroupCall) {
                return messageAction3.duration != 0 ? LocaleController.formatString(R.string.NotificationGroupEndedCall, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupCreatedCall, string, getTitle(chat));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                long j14 = messageAction3.user_id;
                if (j14 == 0 && messageAction3.users.size() == 1) {
                    j14 = messageObject.messageOwner.action.users.get(0).longValue();
                }
                if (j14 != 0) {
                    if (j14 == clientUserId) {
                        return LocaleController.formatString(R.string.NotificationGroupInvitedYouToCall, string, getTitle(chat));
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j14));
                    if (user4 == null) {
                        return null;
                    }
                    return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), UserObject.getUserName(user4));
                }
                StringBuilder sb3 = new StringBuilder();
                for (int i12 = 0; i12 < messageObject.messageOwner.action.users.size(); i12++) {
                    TLRPC.User user5 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i12));
                    if (user5 != null) {
                        String userName2 = UserObject.getUserName(user5);
                        if (sb3.length() != 0) {
                            sb3.append(", ");
                        }
                        sb3.append(userName2);
                    }
                }
                return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), sb3.toString());
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionGiftCode) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction3;
                TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
                String title = chat3 == null ? null : getTitle(chat3);
                return title == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString(R.string.NotificationMessageGiftCode, title, LocaleController.formatPluralString("Months", tL_messageActionGiftCode.months, new Object[0]));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                return LocaleController.formatString(R.string.NotificationInvitedToGroupByLink, string, getTitle(chat));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatEditTitle) {
                return LocaleController.formatString(R.string.NotificationEditedGroupName, string, messageAction3.title);
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionTodoCompletions) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                return messageObject.messageText.toString();
            }
            if ((messageAction3 instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction3 instanceof TLRPC.TL_messageActionChatDeletePhoto)) {
                return (message4.peer_id.channel_id == 0 || chat.megagroup) ? messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.NotificationEditedGroupVideo, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationEditedGroupPhoto, string, getTitle(chat)) : messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.ChannelVideoEditNotification, getTitle(chat)) : LocaleController.formatString(R.string.ChannelPhotoEditNotification, getTitle(chat));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatDeleteUser) {
                long j15 = messageAction3.user_id;
                if (j15 == clientUserId) {
                    return LocaleController.formatString(R.string.NotificationGroupKickYou, string, getTitle(chat));
                }
                if (j15 == j12) {
                    return LocaleController.formatString(R.string.NotificationGroupLeftMember, string, getTitle(chat));
                }
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.action.user_id));
                if (user6 == null) {
                    return null;
                }
                return LocaleController.formatString(R.string.NotificationGroupKickMember, string, getTitle(chat), UserObject.getUserName(user6));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatCreate) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChannelCreate) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatMigrateTo) {
                return LocaleController.formatString(R.string.ActionMigrateFromGroupNotify, getTitle(chat));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                return LocaleController.formatString(R.string.ActionMigrateFromGroupNotify, messageAction3.title);
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionScreenshotTaken) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) {
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    MessageObject messageObject2 = messageObject.replyMessageObject;
                    if (messageObject2 == null) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                    }
                    if (messageObject2.isMusic()) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedMusicChannel, getTitle(chat));
                    }
                    if (messageObject2.isVideo()) {
                        if (TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedVideoChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📹 " + messageObject2.messageOwner.message);
                    }
                    if (messageObject2.isGif()) {
                        if (TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🎬 " + messageObject2.messageOwner.message);
                    }
                    if (messageObject2.isVoice()) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedVoiceChannel, getTitle(chat));
                    }
                    if (messageObject2.isRoundVideo()) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedRoundChannel, getTitle(chat));
                    }
                    if (messageObject2.isSticker() || messageObject2.isAnimatedSticker()) {
                        String stickerEmoji4 = messageObject2.getStickerEmoji();
                        return stickerEmoji4 != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(chat), stickerEmoji4) : LocaleController.formatString(R.string.NotificationActionPinnedStickerChannel, getTitle(chat));
                    }
                    TLRPC.Message message7 = messageObject2.messageOwner;
                    TLRPC.MessageMedia messageMedia4 = message7.media;
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaDocument) {
                        if (TextUtils.isEmpty(message7.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedFileChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📎 " + messageObject2.messageOwner.message);
                    }
                    if ((messageMedia4 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia4 instanceof TLRPC.TL_messageMediaVenue)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, getTitle(chat));
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaGeoLive) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, getTitle(chat));
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact4 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                        return LocaleController.formatString(R.string.NotificationActionPinnedContactChannel2, getTitle(chat), ContactsController.formatName(tL_messageMediaContact4.first_name, tL_messageMediaContact4.last_name));
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia4;
                        return tL_messageMediaPoll2.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, getTitle(chat), tL_messageMediaPoll2.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, getTitle(chat), tL_messageMediaPoll2.poll.question.text);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaToDo) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia4).todo.title.text);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaPhoto) {
                        if (TextUtils.isEmpty(message7.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedPhotoChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🖼 " + messageObject2.messageOwner.message);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaGame) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, getTitle(chat));
                    }
                    CharSequence charSequence = messageObject2.messageText;
                    if (charSequence == null || charSequence.length() <= 0) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                    }
                    CharSequence charSequence2 = messageObject2.messageText;
                    if (charSequence2.length() > 20) {
                        StringBuilder sb4 = new StringBuilder();
                        c11 = 0;
                        sb4.append((Object) charSequence2.subSequence(0, 20));
                        sb4.append("...");
                        charSequence2 = sb4.toString();
                    } else {
                        c11 = 0;
                    }
                    int i13 = R.string.NotificationActionPinnedTextChannel;
                    Object[] objArr = new Object[2];
                    objArr[c11] = getTitle(chat);
                    objArr[1] = charSequence2;
                    return LocaleController.formatString(i13, objArr);
                }
                MessageObject messageObject3 = messageObject.replyMessageObject;
                if (messageObject3 == null) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedNoText, string, getTitle(chat));
                }
                if (messageObject3.isMusic()) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedMusic, string, getTitle(chat));
                }
                if (messageObject3.isVideo()) {
                    if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedVideo, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "📹 " + messageObject3.messageOwner.message, getTitle(chat));
                }
                if (messageObject3.isGif()) {
                    if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGif, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "🎬 " + messageObject3.messageOwner.message, getTitle(chat));
                }
                if (messageObject3.isVoice()) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedVoice, string, getTitle(chat));
                }
                if (messageObject3.isRoundVideo()) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedRound, string, getTitle(chat));
                }
                if (messageObject3.isSticker() || messageObject3.isAnimatedSticker()) {
                    String stickerEmoji5 = messageObject3.getStickerEmoji();
                    return stickerEmoji5 != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmoji, string, getTitle(chat), stickerEmoji5) : LocaleController.formatString(R.string.NotificationActionPinnedSticker, string, getTitle(chat));
                }
                TLRPC.Message message8 = messageObject3.messageOwner;
                TLRPC.MessageMedia messageMedia5 = message8.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaDocument) {
                    if (TextUtils.isEmpty(message8.message)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedFile, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "📎 " + messageObject3.messageOwner.message, getTitle(chat));
                }
                if ((messageMedia5 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia5 instanceof TLRPC.TL_messageMediaVenue)) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedGeo, string, getTitle(chat));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaGeoLive) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, string, getTitle(chat));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaContact) {
                    TLRPC.TL_messageMediaContact tL_messageMediaContact5 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                    return LocaleController.formatString(R.string.NotificationActionPinnedContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact5.first_name, tL_messageMediaContact5.last_name));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) messageMedia5;
                    return tL_messageMediaPoll3.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, string, getTitle(chat), tL_messageMediaPoll3.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPoll2, string, getTitle(chat), tL_messageMediaPoll3.poll.question.text);
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaToDo) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia5).todo.title.text);
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaPhoto) {
                    if (TextUtils.isEmpty(message8.message)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedPhoto, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "🖼 " + messageObject3.messageOwner.message, getTitle(chat));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaGame) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedGame, string, getTitle(chat));
                }
                CharSequence charSequence3 = messageObject3.messageText;
                if (charSequence3 == null || charSequence3.length() <= 0) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedNoText, string, getTitle(chat));
                }
                CharSequence charSequence4 = messageObject3.messageText;
                if (charSequence4.length() > 20) {
                    StringBuilder sb5 = new StringBuilder();
                    c10 = 0;
                    sb5.append((Object) charSequence4.subSequence(0, 20));
                    sb5.append("...");
                    charSequence4 = sb5.toString();
                } else {
                    c10 = 0;
                }
                int i14 = R.string.NotificationActionPinnedText;
                String title2 = getTitle(chat);
                Object[] objArr2 = new Object[3];
                objArr2[c10] = string;
                objArr2[1] = charSequence4;
                objArr2[2] = title2;
                return LocaleController.formatString(i14, objArr2);
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionGameScore) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionSetChatTheme) {
                String f10 = zf.d.f(((TLRPC.TL_messageActionSetChatTheme) messageAction3).theme);
                return TextUtils.isEmpty(f10) ? j3 == clientUserId ? LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]) : LocaleController.formatString("ChatThemeDisabled", R.string.ChatThemeDisabled, string, f10) : j3 == clientUserId ? LocaleController.formatString(R.string.ChatThemeChangedYou, f10) : LocaleController.formatString(R.string.ChatThemeChangedTo, string, f10);
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                return messageObject.messageText.toString();
            }
        }
        return null;
    }

    private String getTitle(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        return chat.monoforum ? og.d.i(chat, this.currentAccount, false) : chat.title;
    }

    private int getTotalAllUnreadCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            if (UserConfig.getInstance(i11).isClientActivated() && (SharedConfig.showNotificationsForAllAccounts || UserConfig.selectedAccount == i11)) {
                NotificationsController notificationsController = getInstance(i11);
                if (notificationsController.showBadgeNumber) {
                    if (notificationsController.showBadgeMessages) {
                        if (notificationsController.showBadgeMuted) {
                            try {
                                ArrayList arrayList = new ArrayList(MessagesController.getInstance(i11).allDialogs);
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
                                    if (dialog != null && DialogObject.isChatDialog(dialog.id)) {
                                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-dialog.id));
                                        if (!ChatObject.isNotInChat(chat)) {
                                            if (ChatObject.isCommunity(chat)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i10 += MessagesController.getInstance(i11).getDialogUnreadCount(dialog);
                                    }
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                        } else {
                            i10 += notificationsController.total_unread_count;
                        }
                    } else if (notificationsController.showBadgeMuted) {
                        try {
                            int size2 = MessagesController.getInstance(i11).allDialogs.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                TLRPC.Dialog dialog2 = MessagesController.getInstance(i11).allDialogs.get(i13);
                                if (DialogObject.isChatDialog(dialog2.id)) {
                                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-dialog2.id));
                                    if (!ChatObject.isNotInChat(chat2)) {
                                        if (ChatObject.isCommunity(chat2)) {
                                        }
                                    }
                                }
                                if (MessagesController.getInstance(i11).getDialogUnreadCount(dialog2) != 0) {
                                    i10++;
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    } else {
                        i10 += notificationsController.pushDialogs.m();
                    }
                }
            }
        }
        return i10;
    }

    private boolean isEmptyVibration(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        for (long j3 : jArr) {
            if (j3 != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isPersonalMessage(MessageObject messageObject) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.Peer peer = message.peer_id;
        return (peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || messageObject.isStoryReactionPush;
    }

    private boolean isSilentMessage(MessageObject messageObject) {
        return messageObject.messageOwner.silent || messageObject.isReactionPush;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cleanup$2() {
        this.openedDialogId = 0L;
        this.openedTopicId = 0L;
        this.total_unread_count = 0;
        this.personalCount = 0;
        this.pushMessages.clear();
        this.pushMessagesDict.b();
        this.fcmRandomMessagesDict.b();
        this.pushDialogs.b();
        this.wearNotificationsIds.b();
        this.lastWearNotifiedMessageId.b();
        this.openedInBubbleDialogs.clear();
        this.delayedPushMessages.clear();
        this.notifyCheck = false;
        this.lastBadgeCount = 0;
        try {
            if (this.notificationDelayWakelock.isHeld()) {
                this.notificationDelayWakelock.release();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        dismissNotification();
        setBadge(getTotalAllUnreadCount());
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                systemNotificationManager.deleteNotificationChannelGroup("channels" + this.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("groups" + this.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("private" + this.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("stories" + this.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("other" + this.currentAccount);
                String str = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String id2 = zg.a(notificationChannels.get(i10)).getId();
                    if (id2.startsWith(str)) {
                        try {
                            systemNotificationManager.deleteNotificationChannel(id2);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllNotificationChannels$44() {
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            Map<String, ?> all = notificationsSettings.getAll();
            SharedPreferences.Editor edit = notificationsSettings.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        systemNotificationManager.deleteNotificationChannel(str);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$38(String str) {
        if (this.pendingVoiceLoads.remove(str)) {
            showOrUpdateNotification(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dismissNotification$37() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forceShowPopupForReply$6(ArrayList arrayList) {
        this.popupReplyMessages = arrayList;
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupNotificationActivity.class);
        intent.putExtra("force", true);
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setFlags(268763140);
        ApplicationLoader.applicationContext.startActivity(intent);
        ApplicationLoader.applicationContext.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forceShowPopupForReply$7() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.pushMessages.size(); i10++) {
            MessageObject messageObject = this.pushMessages.get(i10);
            long dialogId = messageObject.getDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !DialogObject.isEncryptedDialog(dialogId) && (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup())) {
                arrayList.add(0, messageObject);
            }
        }
        if (arrayList.isEmpty() || AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ch(this, arrayList, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideNotifications$36() {
        notificationManager.b(this.notificationId);
        this.lastWearNotifiedMessageId.b();
        for (int i10 = 0; i10 < this.wearNotificationsIds.m(); i10++) {
            notificationManager.b(((Integer) this.wearNotificationsIds.n(i10)).intValue());
        }
        this.wearNotificationsIds.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$loadRoundAvatar$46(Canvas canvas) {
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        int width = canvas.getWidth();
        float f7 = width / 2;
        path.addRoundRect(0.0f, 0.0f, width, canvas.getHeight(), f7, f7, Path.Direction.CW);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        canvas.drawPath(path, paint);
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadRoundAvatar$47(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setPostProcessor(new hh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadTopicsNotificationsExceptions$53(Consumer consumer, HashSet hashSet) {
        if (consumer != null) {
            consumer.x(hashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopicsNotificationsExceptions$54(long j3, Consumer consumer) {
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it = MessagesController.getNotificationsSettings(this.currentAccount).getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.startsWith(NotificationsSettingsFacade.PROPERTY_NOTIFY + j3)) {
                Integer parseInt = Utilities.parseInt((CharSequence) key.replace(NotificationsSettingsFacade.PROPERTY_NOTIFY + j3, ""));
                int intValue = parseInt.intValue();
                if (intValue != 0 && getMessagesController().isDialogMuted(j3, intValue) != getMessagesController().isDialogMuted(j3, 0L)) {
                    hashSet.add(parseInt);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new wg(2, consumer, hashSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("delay reached");
        }
        if (!this.delayedPushMessages.isEmpty()) {
            showOrUpdateNotification(true);
            this.delayedPushMessages.clear();
        }
        try {
            if (this.notificationDelayWakelock.isHeld()) {
                this.notificationDelayWakelock.release();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$playInChatSound$39(SoundPool soundPool, int i10, int i11) {
        if (i11 == 0) {
            try {
                soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playInChatSound$40() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundPlay) <= 500) {
            return;
        }
        try {
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new eh(1));
            }
            if (this.soundIn == 0 && !this.soundInLoaded) {
                this.soundInLoaded = true;
                this.soundIn = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_in, 1);
            }
            int i10 = this.soundIn;
            if (i10 != 0) {
                try {
                    this.soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$playOutChatSound$48(SoundPool soundPool, int i10, int i11) {
        if (i11 == 0) {
            try {
                soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playOutChatSound$49() {
        try {
            if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundOutPlay) <= 100) {
                return;
            }
            this.lastSoundOutPlay = SystemClock.elapsedRealtime();
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new eh(0));
            }
            if (this.soundOut == 0 && !this.soundOutLoaded) {
                this.soundOutLoaded = true;
                this.soundOut = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_out, 1);
            }
            int i10 = this.soundOut;
            if (i10 != 0) {
                try {
                    this.soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processDeleteStory$15(long j3, int i10) {
        boolean z10;
        int i11;
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.f(j3);
        if (storyNotification != null) {
            storyNotification.dateByIds.remove(Integer.valueOf(i10));
            if (storyNotification.dateByIds.isEmpty()) {
                this.storyPushMessagesDict.l(j3);
                this.storyPushMessages.remove(storyNotification);
                getMessagesStorage().deleteStoryPushMessage(j3);
                z10 = true;
                i11 = 0;
                while (i11 < this.pushMessages.size()) {
                    MessageObject messageObject = this.pushMessages.get(i11);
                    if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() == i10) {
                        this.pushMessages.remove(i11);
                        i11--;
                        SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(messageObject.getDialogId());
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            this.pushMessagesDict.l(messageObject.getDialogId());
                        }
                        z10 = true;
                    }
                    i11++;
                }
                if (z10) {
                    return;
                }
                showOrUpdateNotification(false);
                return;
            }
            getMessagesStorage().putStoryPushMessage(storyNotification);
        }
        z10 = false;
        i11 = 0;
        while (i11 < this.pushMessages.size()) {
        }
        if (z10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDialogsUpdateRead$28(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDialogsUpdateRead$29(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processDialogsUpdateRead$30(LongSparseIntArray longSparseIntArray, ArrayList arrayList) {
        int i10;
        boolean z10;
        boolean z11;
        Integer num;
        int i11 = this.total_unread_count;
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        int i12 = 0;
        while (true) {
            if (i12 >= longSparseIntArray.size()) {
                break;
            }
            long keyAt = longSparseIntArray.keyAt(i12);
            Integer num2 = (Integer) this.pushDialogs.f(keyAt);
            int i13 = longSparseIntArray.get(keyAt);
            if (DialogObject.isChatDialog(keyAt)) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat == null || chat.min || ChatObject.isNotInChat(chat) || ChatObject.isCommunity(chat)) {
                    i13 = 0;
                }
                if (chat != null) {
                    z10 = chat.forum;
                    i10 = i13;
                    if (!z10) {
                        int notifyOverride = getNotifyOverride(notificationsSettings, keyAt, 0L);
                        if (notifyOverride == -1) {
                            z11 = isGlobalNotificationsEnabled(keyAt, false, false);
                        } else if (notifyOverride == 2) {
                            z11 = false;
                        }
                        if (this.notifyCheck && !z11 && (num = (Integer) this.pushDialogsOverrideMention.f(keyAt)) != null && num.intValue() != 0) {
                            i10 = num.intValue();
                            z11 = true;
                        }
                        if (i10 == 0) {
                            this.smartNotificationsDialogs.l(keyAt);
                        }
                        if (i10 < 0) {
                            if (num2 == null) {
                                i12++;
                            } else {
                                i10 += num2.intValue();
                            }
                        }
                        if ((!z11 || i10 == 0) && num2 != null) {
                            if (getMessagesController().isForum(keyAt)) {
                                this.total_unread_count -= num2.intValue() > 0 ? 1 : 0;
                            } else {
                                this.total_unread_count -= num2.intValue();
                            }
                        }
                        if (i10 == 0) {
                            this.pushDialogs.l(keyAt);
                            this.pushDialogsOverrideMention.l(keyAt);
                            int i14 = 0;
                            while (i14 < this.pushMessages.size()) {
                                MessageObject messageObject = this.pushMessages.get(i14);
                                if (!messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == keyAt && !messageObject.isStoryReactionPush) {
                                    if (isPersonalMessage(messageObject)) {
                                        this.personalCount--;
                                    }
                                    this.pushMessages.remove(i14);
                                    i14--;
                                    this.delayedPushMessages.remove(messageObject);
                                    long j3 = messageObject.messageOwner.peer_id.channel_id;
                                    long j10 = j3 != 0 ? -j3 : 0L;
                                    SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j10);
                                    if (sparseArray != null) {
                                        sparseArray.remove(messageObject.getId());
                                        if (sparseArray.size() == 0) {
                                            this.pushMessagesDict.l(j10);
                                        }
                                    }
                                    arrayList.add(messageObject);
                                }
                                i14++;
                            }
                        } else if (z11) {
                            if (!getMessagesController().isCommunity(keyAt)) {
                                if (getMessagesController().isForum(keyAt)) {
                                    this.total_unread_count += i10 <= 0 ? 0 : 1;
                                } else {
                                    this.total_unread_count += i10;
                                }
                            }
                            this.pushDialogs.k(Integer.valueOf(i10), keyAt);
                        }
                        i12++;
                    }
                    z11 = true;
                    if (this.notifyCheck) {
                        i10 = num.intValue();
                        z11 = true;
                    }
                    if (i10 == 0) {
                    }
                    if (i10 < 0) {
                    }
                    if (!z11) {
                    }
                    if (getMessagesController().isForum(keyAt)) {
                    }
                    if (i10 == 0) {
                    }
                    i12++;
                }
            }
            i10 = i13;
            z10 = false;
            if (!z10) {
            }
            z11 = true;
            if (this.notifyCheck) {
            }
            if (i10 == 0) {
            }
            if (i10 < 0) {
            }
            if (!z11) {
            }
            if (getMessagesController().isForum(keyAt)) {
            }
            if (i10 == 0) {
            }
            i12++;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new ch(this, arrayList, 4));
        }
        if (i11 != this.total_unread_count) {
            if (this.notifyCheck) {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            } else {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            }
            AndroidUtilities.runOnUIThread(new ah(this, this.pushDialogs.m(), 0));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processEditedMessages$22(a0.i iVar) {
        long j3;
        int m10 = iVar.m();
        boolean z10 = false;
        for (int i10 = 0; i10 < m10; i10++) {
            iVar.j(i10);
            ArrayList arrayList = (ArrayList) iVar.n(i10);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i11);
                if (messageObject.isStoryReactionPush) {
                    j3 = messageObject.getDialogId();
                } else {
                    long j10 = messageObject.messageOwner.peer_id.channel_id;
                    j3 = j10 != 0 ? -j10 : 0L;
                }
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j3);
                if (sparseArray == null) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.get(messageObject.getId());
                if (messageObject2 != null && (messageObject2.isReactionPush || messageObject2.isStoryReactionPush)) {
                    messageObject2 = null;
                }
                if (messageObject2 != null) {
                    sparseArray.put(messageObject.getId(), messageObject);
                    int indexOf = this.pushMessages.indexOf(messageObject2);
                    if (indexOf >= 0) {
                        this.pushMessages.set(indexOf, messageObject);
                    }
                    int indexOf2 = this.delayedPushMessages.indexOf(messageObject2);
                    if (indexOf2 >= 0) {
                        this.delayedPushMessages.set(indexOf2, messageObject);
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            showOrUpdateNotification(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIgnoreStories$17() {
        boolean isEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.b();
        getMessagesStorage().deleteAllStoryPushMessages();
        if (isEmpty) {
            return;
        }
        showOrUpdateNotification(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIgnoreStories$19(long j3) {
        boolean isEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.b();
        getMessagesStorage().deleteStoryPushMessage(j3);
        if (isEmpty) {
            return;
        }
        showOrUpdateNotification(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIgnoreStoryReactions$18() {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i10);
            if (messageObject != null && messageObject.isStoryReactionPush) {
                this.pushMessages.remove(i10);
                i10--;
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.l(messageObject.getDialogId());
                }
                z10 = true;
            }
            i10++;
        }
        getMessagesStorage().deleteAllStoryReactionPushMessages();
        if (z10) {
            showOrUpdateNotification(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedUnreadMessages$32(int i10) {
        if (this.total_unread_count == 0) {
            this.popupMessages.clear();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedUnreadMessages$33(ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        MessageObject messageObject;
        boolean z10;
        long j3;
        SharedPreferences sharedPreferences;
        boolean isGlobalNotificationsEnabled;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j10;
        long j11;
        int i10;
        TLRPC.Message message;
        long j12;
        int i11;
        long j13;
        TLRPC.Message message2;
        boolean z11;
        SharedPreferences sharedPreferences2;
        NotificationsController notificationsController = this;
        notificationsController.pushDialogs.b();
        notificationsController.pushMessages.clear();
        notificationsController.pushMessagesDict.b();
        notificationsController.storyPushMessages.clear();
        notificationsController.storyPushMessagesDict.b();
        boolean z12 = false;
        notificationsController.total_unread_count = 0;
        notificationsController.personalCount = 0;
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        a0.i iVar2 = new a0.i();
        long j14 = 0;
        if (arrayList != null) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i12);
                if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                    TLRPC.MessageAction messageAction = message3.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                        long j15 = message3.peer_id.channel_id;
                        if (j15 != j14) {
                            j10 = -j15;
                            j11 = j14;
                        } else {
                            j10 = j14;
                            j11 = j10;
                        }
                        SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.f(j10);
                        if (sparseArray == null || sparseArray.indexOfKey(message3.id) < 0) {
                            MessageObject messageObject2 = new MessageObject(notificationsController.currentAccount, message3, z12, z12);
                            if (notificationsController.isPersonalMessage(messageObject2)) {
                                notificationsController.personalCount++;
                            }
                            long dialogId = messageObject2.getDialogId();
                            long topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject2.messageOwner, getMessagesController().isForum(messageObject2));
                            if (messageObject2.messageOwner.mentioned) {
                                i10 = i12;
                                message = message3;
                                j12 = messageObject2.getFromChatId();
                            } else {
                                i10 = i12;
                                message = message3;
                                j12 = dialogId;
                            }
                            int h = iVar2.h(j12);
                            if (h < 0 || topicId != j11) {
                                i11 = i10;
                                j13 = j10;
                                TLRPC.Message message4 = message;
                                notificationsController = this;
                                int notifyOverride = notificationsController.getNotifyOverride(notificationsSettings, j12, topicId);
                                boolean isGlobalNotificationsEnabled2 = notifyOverride == -1 ? notificationsController.isGlobalNotificationsEnabled(j12, messageObject2.isReactionPush, messageObject2.isStoryReactionPush) : notifyOverride != 2;
                                message2 = message4;
                                iVar2.k(Boolean.valueOf(isGlobalNotificationsEnabled2), j12);
                                z11 = isGlobalNotificationsEnabled2;
                            } else {
                                z11 = ((Boolean) iVar2.n(h)).booleanValue();
                                i11 = i10;
                                j13 = j10;
                                message2 = message;
                                notificationsController = this;
                            }
                            sharedPreferences2 = notificationsSettings;
                            if (z11) {
                                long j16 = j12;
                                if (j16 != notificationsController.openedDialogId || !ApplicationLoader.isScreenOn) {
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        notificationsController.pushMessagesDict.k(sparseArray, j13);
                                    }
                                    sparseArray.put(message2.id, messageObject2);
                                    notificationsController.appendMessage(messageObject2);
                                    if (dialogId != j16) {
                                        Integer num = (Integer) notificationsController.pushDialogsOverrideMention.f(dialogId);
                                        notificationsController.pushDialogsOverrideMention.k(Integer.valueOf(num == null ? 1 : num.intValue() + 1), dialogId);
                                    }
                                }
                            }
                            i12 = i11 + 1;
                            notificationsSettings = sharedPreferences2;
                            j14 = j11;
                            z12 = false;
                        } else {
                            sharedPreferences2 = notificationsSettings;
                            i11 = i12;
                            i12 = i11 + 1;
                            notificationsSettings = sharedPreferences2;
                            j14 = j11;
                            z12 = false;
                        }
                    }
                }
                sharedPreferences2 = notificationsSettings;
                i11 = i12;
                j11 = j14;
                i12 = i11 + 1;
                notificationsSettings = sharedPreferences2;
                j14 = j11;
                z12 = false;
            }
        }
        SharedPreferences sharedPreferences3 = notificationsSettings;
        long j17 = j14;
        int i13 = 0;
        while (i13 < iVar.m()) {
            long j18 = iVar.j(i13);
            int h10 = iVar2.h(j18);
            if (h10 >= 0) {
                isGlobalNotificationsEnabled = ((Boolean) iVar2.n(h10)).booleanValue();
                sharedPreferences = sharedPreferences3;
            } else {
                sharedPreferences = sharedPreferences3;
                int notifyOverride2 = notificationsController.getNotifyOverride(sharedPreferences, j18, 0L);
                isGlobalNotificationsEnabled = notifyOverride2 == -1 ? notificationsController.isGlobalNotificationsEnabled(j18, false, false) : notifyOverride2 != 2;
                iVar2.k(Boolean.valueOf(isGlobalNotificationsEnabled), j18);
            }
            if (isGlobalNotificationsEnabled) {
                Integer num2 = (Integer) iVar.n(i13);
                int intValue = num2.intValue();
                notificationsController.pushDialogs.k(num2, j18);
                if (!notificationsController.getMessagesController().isCommunity(j18)) {
                    if (notificationsController.getMessagesController().isForum(j18)) {
                        notificationsController.total_unread_count += intValue > 0 ? 1 : 0;
                    } else {
                        notificationsController.total_unread_count += intValue;
                    }
                }
            }
            i13++;
            sharedPreferences3 = sharedPreferences;
        }
        SharedPreferences sharedPreferences4 = sharedPreferences3;
        if (arrayList2 != null) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList2.get(i14);
                int id2 = messageObject3.getId();
                if (notificationsController.pushMessagesDict.h(id2) < 0) {
                    if (notificationsController.isPersonalMessage(messageObject3)) {
                        notificationsController.personalCount++;
                    }
                    long dialogId2 = messageObject3.getDialogId();
                    long topicId2 = MessageObject.getTopicId(notificationsController.currentAccount, messageObject3.messageOwner, notificationsController.getMessagesController().isForum(messageObject3));
                    TLRPC.Message message5 = messageObject3.messageOwner;
                    long j19 = message5.random_id;
                    long fromChatId = message5.mentioned ? messageObject3.getFromChatId() : dialogId2;
                    int h11 = iVar2.h(fromChatId);
                    if (h11 < 0 || topicId2 != j17) {
                        int notifyOverride3 = notificationsController.getNotifyOverride(sharedPreferences4, fromChatId, topicId2);
                        if (notifyOverride3 == -1) {
                            messageObject = messageObject3;
                            z10 = notificationsController.isGlobalNotificationsEnabled(fromChatId, messageObject.isReactionPush, messageObject.isStoryReactionPush);
                        } else {
                            messageObject = messageObject3;
                            z10 = notifyOverride3 != 2;
                        }
                        iVar2.k(Boolean.valueOf(z10), fromChatId);
                    } else {
                        z10 = ((Boolean) iVar2.n(h11)).booleanValue();
                        messageObject = messageObject3;
                    }
                    if (z10 && (fromChatId != notificationsController.openedDialogId || !ApplicationLoader.isScreenOn)) {
                        if (id2 != 0) {
                            if (messageObject.isStoryReactionPush) {
                                j3 = messageObject.getDialogId();
                            } else {
                                long j20 = messageObject.messageOwner.peer_id.channel_id;
                                j3 = j20 != j17 ? -j20 : j17;
                            }
                            SparseArray sparseArray2 = (SparseArray) notificationsController.pushMessagesDict.f(j3);
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                notificationsController.pushMessagesDict.k(sparseArray2, j3);
                            }
                            sparseArray2.put(id2, messageObject);
                        } else if (j19 != j17) {
                            notificationsController.fcmRandomMessagesDict.k(messageObject, j19);
                        }
                        notificationsController.appendMessage(messageObject);
                        if (dialogId2 != fromChatId) {
                            Integer num3 = (Integer) notificationsController.pushDialogsOverrideMention.f(dialogId2);
                            notificationsController.pushDialogsOverrideMention.k(Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1), dialogId2);
                        }
                        Integer num4 = (Integer) notificationsController.pushDialogs.f(fromChatId);
                        int intValue2 = num4 != null ? num4.intValue() + 1 : 1;
                        if (!notificationsController.getMessagesController().isCommunity(fromChatId)) {
                            if (notificationsController.getMessagesController().isForum(fromChatId)) {
                                if (num4 != null) {
                                    notificationsController.total_unread_count -= num4.intValue() > 0 ? 1 : 0;
                                }
                                notificationsController.total_unread_count += intValue2 > 0 ? 1 : 0;
                            } else {
                                if (num4 != null) {
                                    notificationsController.total_unread_count -= num4.intValue();
                                }
                                notificationsController.total_unread_count += intValue2;
                            }
                        }
                        notificationsController.pushDialogs.k(Integer.valueOf(intValue2), fromChatId);
                    }
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                StoryNotification storyNotification = (StoryNotification) it.next();
                long j21 = storyNotification.dialogId;
                StoryNotification storyNotification2 = (StoryNotification) notificationsController.storyPushMessagesDict.f(j21);
                if (storyNotification2 != null) {
                    storyNotification2.dateByIds.putAll(storyNotification.dateByIds);
                } else {
                    notificationsController.storyPushMessages.add(storyNotification);
                    notificationsController.storyPushMessagesDict.k(storyNotification, j21);
                }
            }
            Collections.sort(notificationsController.storyPushMessages, Comparator$-CC.comparingLong(new je(2)));
        }
        AndroidUtilities.runOnUIThread(new ah(notificationsController, notificationsController.pushDialogs.m(), 6));
        notificationsController.showOrUpdateNotification(SystemClock.elapsedRealtime() / 1000 < 60);
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processNewMessages$24(int i10) {
        a0.i iVar = new a0.i();
        iVar.k(e9.q.p(Integer.valueOf(i10)), 0L);
        removeDeletedMessagesFromNotifications(iVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processNewMessages$25(ArrayList arrayList, int i10) {
        this.popupMessages.addAll(0, arrayList);
        if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
            if (i10 == 3 || ((i10 == 1 && ApplicationLoader.isScreenOn) || (i10 == 2 && !ApplicationLoader.isScreenOn))) {
                Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupNotificationActivity.class);
                intent.setFlags(268763140);
                try {
                    ApplicationLoader.applicationContext.startActivity(intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processNewMessages$26(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processNewMessages$27(ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        long j3;
        boolean z12;
        Integer num;
        boolean z13;
        int i10;
        SharedPreferences sharedPreferences;
        boolean z14;
        long j10;
        long j11;
        long j12;
        long j13;
        String str;
        int i11;
        boolean z15;
        boolean z16;
        long j14;
        MessageObject messageObject;
        SparseArray sparseArray;
        long j15;
        NotificationsController notificationsController = this;
        ArrayList arrayList3 = arrayList;
        a0.i iVar = new a0.i();
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        boolean z17 = notificationsSettings.getBoolean("PinnedMessages", true);
        int i12 = 0;
        boolean z18 = false;
        int i13 = 0;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        while (i12 < arrayList3.size()) {
            MessageObject messageObject2 = (MessageObject) arrayList3.get(i12);
            if (messageObject2.messageOwner != null) {
                if (!messageObject2.isImportedForward()) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    TLRPC.MessageAction messageAction = message.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL)) {
                        if (message.silent) {
                            if (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                            }
                        }
                    }
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("skipped message because 1");
                }
                sharedPreferences = notificationsSettings;
                z13 = z17;
                i10 = i12;
                i12 = i10 + 1;
                arrayList3 = arrayList;
                z17 = z13;
                notificationsSettings = sharedPreferences;
            }
            if (!MessageObject.isTopicActionMessage(messageObject2)) {
                if (messageObject2.isStoryPush) {
                    long currentTimeMillis = messageObject2.messageOwner == null ? System.currentTimeMillis() : r3.date * 1000;
                    long dialogId = messageObject2.getDialogId();
                    int id2 = messageObject2.getId();
                    StoryNotification storyNotification = (StoryNotification) notificationsController.storyPushMessagesDict.f(dialogId);
                    if (storyNotification != null) {
                        storyNotification.dateByIds.put(Integer.valueOf(id2), new Pair<>(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z22 = storyNotification.hidden;
                        boolean z23 = messageObject2.isStoryPushHidden;
                        if (z22 != z23) {
                            storyNotification.hidden = z23;
                            z21 = true;
                        }
                        storyNotification.date = storyNotification.getLeastDate();
                        notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification);
                        z19 = true;
                    } else {
                        StoryNotification storyNotification2 = new StoryNotification(dialogId, messageObject2.localName, id2, currentTimeMillis);
                        storyNotification2.hidden = messageObject2.isStoryPushHidden;
                        notificationsController.storyPushMessages.add(storyNotification2);
                        notificationsController.storyPushMessagesDict.k(storyNotification2, dialogId);
                        notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification2);
                        z18 = true;
                        z21 = true;
                    }
                    Collections.sort(notificationsController.storyPushMessages, Comparator$-CC.comparingLong(new je(1)));
                    sharedPreferences = notificationsSettings;
                    z13 = z17;
                    i10 = i12;
                } else {
                    if (messageObject2.isOauthPush) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        if (message2 != null) {
                            int i14 = message2.id;
                            z13 = z17;
                            long j16 = message2.date + 60;
                            i10 = i12;
                            long currentTime = ConnectionsManager.getInstance(notificationsController.currentAccount).getCurrentTime();
                            if (currentTime <= j16) {
                                AndroidUtilities.runOnUIThread(new ah(notificationsController, i14, 3), (j16 - currentTime) * 1000);
                            }
                            sharedPreferences = notificationsSettings;
                        }
                        sharedPreferences = notificationsSettings;
                        z13 = z17;
                        i10 = i12;
                    } else {
                        z13 = z17;
                        i10 = i12;
                    }
                    int id3 = messageObject2.getId();
                    long j17 = messageObject2.isFcmMessage() ? messageObject2.messageOwner.random_id : 0L;
                    long dialogId2 = messageObject2.getDialogId();
                    if (messageObject2.isFcmMessage()) {
                        z14 = messageObject2.localChannel;
                    } else {
                        if (DialogObject.isChatDialog(dialogId2)) {
                            TLRPC.Chat chat = notificationsController.getMessagesController().getChat(Long.valueOf(-dialogId2));
                            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                                z14 = true;
                            }
                        }
                        z14 = false;
                    }
                    if (messageObject2.isStoryReactionPush) {
                        j10 = messageObject2.getDialogId();
                    } else {
                        long j18 = messageObject2.messageOwner.peer_id.channel_id;
                        j10 = j18 != 0 ? -j18 : 0L;
                    }
                    SparseArray sparseArray2 = (SparseArray) notificationsController.pushMessagesDict.f(j10);
                    MessageObject messageObject3 = sparseArray2 != null ? (MessageObject) sparseArray2.get(id3) : null;
                    SharedPreferences sharedPreferences2 = notificationsSettings;
                    if (messageObject3 == null) {
                        j11 = j17;
                        long j19 = messageObject2.messageOwner.random_id;
                        if (j19 != 0 && (messageObject3 = (MessageObject) notificationsController.fcmRandomMessagesDict.f(j19)) != null) {
                            notificationsController.fcmRandomMessagesDict.l(messageObject2.messageOwner.random_id);
                        }
                    } else {
                        j11 = j17;
                    }
                    MessageObject messageObject4 = messageObject3;
                    if (messageObject4 != null) {
                        if (messageObject4.isFcmMessage()) {
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                notificationsController.pushMessagesDict.k(sparseArray2, j10);
                            }
                            sparseArray2.put(id3, messageObject2);
                            int indexOf = notificationsController.pushMessages.indexOf(messageObject4);
                            if (indexOf >= 0) {
                                notificationsController.pushMessages.set(indexOf, messageObject2);
                                j15 = j10;
                                i13 = notificationsController.addToPopupMessages(arrayList2, messageObject2, dialogId2, z14, sharedPreferences2);
                                notificationsSettings = sharedPreferences2;
                            } else {
                                j15 = j10;
                                notificationsSettings = sharedPreferences2;
                            }
                            if (z10 && (z19 = messageObject2.localEdit)) {
                                notificationsController.getMessagesStorage().putPushMessage(messageObject2);
                            }
                        } else {
                            j15 = j10;
                            notificationsSettings = sharedPreferences2;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + j15 + ", mid=" + id3);
                        }
                    } else {
                        notificationsSettings = sharedPreferences2;
                        long j20 = j10;
                        boolean z24 = z14;
                        if (!z19) {
                            if (z10 && !messageObject2.isOauthPush) {
                                notificationsController.getMessagesStorage().putPushMessage(messageObject2);
                            }
                            sharedPreferences = notificationsSettings;
                            long topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject2.messageOwner, notificationsController.getMessagesController().isForum(messageObject2));
                            if (dialogId2 != notificationsController.openedDialogId || !ApplicationLoader.isScreenOn || messageObject2.isStoryReactionPush || messageObject2.isOauthPush) {
                                TLRPC.Message message3 = messageObject2.messageOwner;
                                if (!message3.mentioned) {
                                    j12 = dialogId2;
                                } else if (z13 || !(message3.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                    j12 = messageObject2.getFromChatId();
                                } else if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because message is mention of pinned");
                                }
                                if (notificationsController.isPersonalMessage(messageObject2)) {
                                    notificationsController.personalCount++;
                                }
                                DialogObject.isChatDialog(j12);
                                int h = iVar.h(j12);
                                if (h < 0 || topicId != 0) {
                                    j13 = dialogId2;
                                    str = ")";
                                    i11 = i13;
                                    z15 = z19;
                                    long j21 = j12;
                                    int notifyOverride = notificationsController.getNotifyOverride(sharedPreferences, j21, topicId);
                                    sharedPreferences = sharedPreferences;
                                    j12 = j21;
                                    topicId = topicId;
                                    if (notifyOverride == -1) {
                                        boolean isGlobalNotificationsEnabled = isGlobalNotificationsEnabled(j12, Boolean.valueOf(z24), messageObject2.isReactionPush, messageObject2.isStoryReactionPush);
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + j12 + ", " + z24 + ", " + messageObject2.isReactionPush + ", " + messageObject2.isStoryReactionPush + ") = " + isGlobalNotificationsEnabled);
                                        }
                                        z16 = isGlobalNotificationsEnabled;
                                    } else {
                                        z16 = notifyOverride != 2;
                                    }
                                    iVar.k(Boolean.valueOf(z16), j12);
                                } else {
                                    j13 = dialogId2;
                                    z16 = ((Boolean) iVar.n(h)).booleanValue();
                                    i11 = i13;
                                    z15 = z19;
                                    str = ")";
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("NotificationsController: process new messages, value is " + z16 + " (" + j12 + ", " + z24 + ", " + messageObject2.isReactionPush + ", " + messageObject2.isStoryReactionPush + str);
                                }
                                if (z16) {
                                    notificationsController = this;
                                    j14 = j12;
                                    messageObject = messageObject2;
                                    i13 = !z10 ? notificationsController.addToPopupMessages(arrayList2, messageObject, j14, z24, sharedPreferences) : i11;
                                    if (!z20) {
                                        z20 = messageObject.messageOwner.from_scheduled;
                                    }
                                    notificationsController.delayedPushMessages.add(messageObject);
                                    notificationsController.appendMessage(messageObject);
                                    if (id3 != 0) {
                                        if (sparseArray2 == null) {
                                            sparseArray = new SparseArray();
                                            notificationsController.pushMessagesDict.k(sparseArray, j20);
                                        } else {
                                            sparseArray = sparseArray2;
                                        }
                                        sparseArray.put(id3, messageObject);
                                    } else if (j11 != 0) {
                                        notificationsController.fcmRandomMessagesDict.k(messageObject, j11);
                                    }
                                    long j22 = j13;
                                    if (j22 != j14) {
                                        Integer num2 = (Integer) notificationsController.pushDialogsOverrideMention.f(j22);
                                        notificationsController.pushDialogsOverrideMention.k(Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1), j22);
                                    }
                                } else {
                                    notificationsController = this;
                                    j14 = j12;
                                    messageObject = messageObject2;
                                    i13 = i11;
                                }
                                if (messageObject.isReactionPush) {
                                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                    sparseBooleanArray.put(id3, true);
                                    notificationsController.getMessagesController().checkUnreadReactions(j14, topicId, sparseBooleanArray);
                                }
                                z19 = z15;
                                z18 = true;
                            } else {
                                if (!z10) {
                                    notificationsController.playInChatSound();
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because chat is already opened (openedDialogId = " + notificationsController.openedDialogId + ")");
                                }
                            }
                        } else if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("skipped message because edited");
                        }
                    }
                    sharedPreferences = notificationsSettings;
                }
                i12 = i10 + 1;
                arrayList3 = arrayList;
                z17 = z13;
                notificationsSettings = sharedPreferences;
            }
            if (BuildVars.LOGS_ENABLED) {
            }
            sharedPreferences = notificationsSettings;
            z13 = z17;
            i10 = i12;
            i12 = i10 + 1;
            arrayList3 = arrayList;
            z17 = z13;
            notificationsSettings = sharedPreferences;
        }
        SharedPreferences sharedPreferences3 = notificationsSettings;
        int i15 = i13;
        boolean z25 = z19;
        if (z18) {
            notificationsController.notifyCheck = z11;
        }
        if (!arrayList2.isEmpty() && !AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            AndroidUtilities.runOnUIThread(new q4(notificationsController, arrayList2, i15, 20));
        }
        if (z10 || z20) {
            if (z25) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + notificationsController.notifyCheck);
                }
                notificationsController.delayedPushMessages.clear();
                notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
            } else if (z18) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: added branch");
                }
                MessageObject messageObject5 = (MessageObject) arrayList.get(0);
                long dialogId3 = messageObject5.getDialogId();
                long topicId2 = MessageObject.getTopicId(notificationsController.currentAccount, messageObject5.messageOwner, notificationsController.getMessagesController().isForum(dialogId3));
                Boolean valueOf = messageObject5.isFcmMessage() ? Boolean.valueOf(messageObject5.localChannel) : null;
                int i16 = notificationsController.total_unread_count;
                int notifyOverride2 = notificationsController.getNotifyOverride(sharedPreferences3, dialogId3, topicId2);
                if (notifyOverride2 == -1) {
                    notificationsController = this;
                    j3 = dialogId3;
                    z12 = notificationsController.isGlobalNotificationsEnabled(dialogId3, valueOf, messageObject5.isReactionPush, messageObject5.isStoryReactionPush);
                } else {
                    notificationsController = this;
                    j3 = dialogId3;
                    z12 = notifyOverride2 != 2;
                }
                Integer num3 = (Integer) notificationsController.pushDialogs.f(j3);
                int intValue = num3 != null ? num3.intValue() + 1 : 1;
                if (notificationsController.notifyCheck && !z12 && (num = (Integer) notificationsController.pushDialogsOverrideMention.f(j3)) != null && num.intValue() != 0) {
                    intValue = num.intValue();
                    z12 = true;
                }
                if (z12 && !messageObject5.isStoryPush) {
                    if (!notificationsController.getMessagesController().isCommunity(j3)) {
                        if (notificationsController.getMessagesController().isForum(j3)) {
                            int i17 = notificationsController.total_unread_count - ((num3 == null || num3.intValue() <= 0) ? 0 : 1);
                            notificationsController.total_unread_count = i17;
                            notificationsController.total_unread_count = i17 + (intValue > 0 ? 1 : 0);
                        } else {
                            if (num3 != null) {
                                notificationsController.total_unread_count -= num3.intValue();
                            }
                            notificationsController.total_unread_count += intValue;
                        }
                    }
                    notificationsController.pushDialogs.k(Integer.valueOf(intValue), j3);
                }
                if (i16 != notificationsController.total_unread_count || z21) {
                    notificationsController.delayedPushMessages.clear();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("NotificationsController processNewMessages: added branch: " + notificationsController.notifyCheck);
                    }
                    notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
                    AndroidUtilities.runOnUIThread(new ah(notificationsController, notificationsController.pushDialogs.m(), 4));
                }
                notificationsController.notifyCheck = false;
                if (notificationsController.showBadgeNumber) {
                    notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
                }
            }
        }
        if (z21) {
            notificationsController.updateStoryPushesRunnable();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processReadMessages$20(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processReadMessages$21(LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        long j10;
        SparseArray sparseArray;
        long j11;
        long j12;
        long j13 = 0;
        if (longSparseIntArray != null) {
            for (int i12 = 0; i12 < longSparseIntArray.size(); i12++) {
                long keyAt = longSparseIntArray.keyAt(i12);
                int i13 = longSparseIntArray.get(keyAt);
                int i14 = 0;
                while (i14 < this.pushMessages.size()) {
                    MessageObject messageObject = this.pushMessages.get(i14);
                    if (messageObject.messageOwner.from_scheduled || messageObject.getDialogId() != keyAt || messageObject.getId() > i13 || messageObject.isStoryReactionPush) {
                        j11 = j13;
                    } else {
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                        if (messageObject.isStoryReactionPush) {
                            j12 = messageObject.getDialogId();
                        } else {
                            long j14 = messageObject.messageOwner.peer_id.channel_id;
                            j12 = j14 != j13 ? -j14 : j13;
                        }
                        SparseArray sparseArray2 = (SparseArray) this.pushMessagesDict.f(j12);
                        j11 = j13;
                        if (sparseArray2 != null) {
                            sparseArray2.remove(messageObject.getId());
                            if (sparseArray2.size() == 0) {
                                this.pushMessagesDict.l(j12);
                            }
                        }
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(i14);
                        i14--;
                    }
                    i14++;
                    j13 = j11;
                }
            }
        }
        long j15 = j13;
        if (j3 != j15 && (i10 != 0 || i11 != 0)) {
            int i15 = 0;
            while (i15 < this.pushMessages.size()) {
                MessageObject messageObject2 = this.pushMessages.get(i15);
                if (messageObject2.getDialogId() == j3 && !messageObject2.isStoryReactionPush) {
                    if (i11 != 0) {
                        if (messageObject2.messageOwner.date > i11) {
                        }
                        if (isPersonalMessage(messageObject2)) {
                            this.personalCount--;
                        }
                        if (messageObject2.isStoryReactionPush) {
                            j10 = messageObject2.getDialogId();
                        } else {
                            long j16 = messageObject2.messageOwner.peer_id.channel_id;
                            j10 = j16 != j15 ? -j16 : j15;
                        }
                        sparseArray = (SparseArray) this.pushMessagesDict.f(j10);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject2.getId());
                            if (sparseArray.size() == 0) {
                                this.pushMessagesDict.l(j10);
                            }
                        }
                        this.pushMessages.remove(i15);
                        this.delayedPushMessages.remove(messageObject2);
                        arrayList.add(messageObject2);
                        i15--;
                    } else if (z10) {
                        if (messageObject2.getId() != i10 && i10 >= 0) {
                        }
                        if (isPersonalMessage(messageObject2)) {
                        }
                        if (messageObject2.isStoryReactionPush) {
                        }
                        sparseArray = (SparseArray) this.pushMessagesDict.f(j10);
                        if (sparseArray != null) {
                        }
                        this.pushMessages.remove(i15);
                        this.delayedPushMessages.remove(messageObject2);
                        arrayList.add(messageObject2);
                        i15--;
                    } else {
                        if (messageObject2.getId() > i10 && i10 >= 0) {
                        }
                        if (isPersonalMessage(messageObject2)) {
                        }
                        if (messageObject2.isStoryReactionPush) {
                        }
                        sparseArray = (SparseArray) this.pushMessagesDict.f(j10);
                        if (sparseArray != null) {
                        }
                        this.pushMessages.remove(i15);
                        this.delayedPushMessages.remove(messageObject2);
                        arrayList.add(messageObject2);
                        i15--;
                    }
                }
                i15++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ch(this, arrayList, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processReadStories$16(long j3, int i10) {
        boolean z10;
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.f(j3);
        if (storyNotification != null) {
            this.storyPushMessagesDict.l(j3);
            this.storyPushMessages.remove(storyNotification);
            getMessagesStorage().deleteStoryPushMessage(j3);
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 0;
        while (i11 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i11);
            if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() <= i10) {
                this.pushMessages.remove(i11);
                i11--;
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.l(messageObject.getDialogId());
                }
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            showOrUpdateNotification(false);
            updateStoryPushesRunnable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSeenStoryReactions$14(int i10) {
        int i11 = 0;
        boolean z10 = false;
        while (i11 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i11);
            if (messageObject.isStoryReactionPush && Math.abs(messageObject.getId()) == i10) {
                this.pushMessages.remove(i11);
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.l(messageObject.getDialogId());
                }
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(messageObject.getId()));
                getMessagesStorage().deletePushMessages(messageObject.getDialogId(), arrayList);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            showOrUpdateNotification(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedHisoryFromNotifications$11(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedHisoryFromNotifications$12(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedHisoryFromNotifications$13(LongSparseIntArray longSparseIntArray, ArrayList arrayList) {
        Integer num;
        int i10 = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        Integer num2 = 0;
        int i11 = 0;
        while (i11 < longSparseIntArray.size()) {
            long keyAt = longSparseIntArray.keyAt(i11);
            long j3 = -keyAt;
            long j10 = longSparseIntArray.get(keyAt);
            Integer num3 = (Integer) this.pushDialogs.f(j3);
            if (num3 == null) {
                num3 = num2;
            }
            Integer num4 = num3;
            int i12 = 0;
            while (i12 < this.pushMessages.size()) {
                MessageObject messageObject = this.pushMessages.get(i12);
                if (messageObject.getDialogId() == j3) {
                    num = num2;
                    if (messageObject.getId() <= j10) {
                        SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j3);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                            if (sparseArray.size() == 0) {
                                this.pushMessagesDict.l(j3);
                            }
                        }
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(messageObject);
                        i12--;
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                        num4 = Integer.valueOf(num4.intValue() - 1);
                    }
                } else {
                    num = num2;
                }
                i12++;
                num2 = num;
            }
            Integer num5 = num2;
            if (num4.intValue() <= 0) {
                this.smartNotificationsDialogs.l(j3);
                num4 = num5;
            }
            if (!num4.equals(num3)) {
                if (!getMessagesController().isCommunity(j3)) {
                    if (getMessagesController().isForum(j3)) {
                        int i13 = this.total_unread_count - (num3.intValue() > 0 ? 1 : 0);
                        this.total_unread_count = i13;
                        this.total_unread_count = i13 + (num4.intValue() > 0 ? 1 : 0);
                    } else {
                        int intValue = this.total_unread_count - num3.intValue();
                        this.total_unread_count = intValue;
                        this.total_unread_count = num4.intValue() + intValue;
                    }
                }
                this.pushDialogs.k(num4, j3);
            }
            if (num4.intValue() == 0) {
                this.pushDialogs.l(j3);
                this.pushDialogsOverrideMention.l(j3);
            }
            i11++;
            num2 = num5;
        }
        if (arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new ch(this, arrayList, 0));
        }
        if (i10 != this.total_unread_count) {
            if (this.notifyCheck) {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            } else {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            }
            AndroidUtilities.runOnUIThread(new ah(this, this.pushDialogs.m(), 1));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedMessagesFromNotifications$10(a0.i iVar, boolean z10, ArrayList arrayList) {
        Integer num;
        int i10;
        Integer num2;
        int i11;
        Integer num3;
        a0.i iVar2 = iVar;
        int i12 = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        Integer num4 = 0;
        int i13 = 0;
        while (i13 < iVar2.m()) {
            long j3 = iVar2.j(i13);
            SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j3);
            if (sparseArray == null) {
                num = num4;
                i10 = i13;
            } else {
                ArrayList arrayList2 = (ArrayList) iVar2.f(j3);
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    int intValue = ((Integer) arrayList2.get(i14)).intValue();
                    MessageObject messageObject = (MessageObject) sparseArray.get(intValue);
                    if (messageObject == null) {
                        num2 = num4;
                        i11 = i13;
                    } else if (!messageObject.isStoryReactionPush && (!z10 || messageObject.isReactionPush)) {
                        num2 = num4;
                        long dialogId = messageObject.getDialogId();
                        Integer num5 = (Integer) this.pushDialogs.f(dialogId);
                        if (num5 == null) {
                            num5 = num2;
                        }
                        int intValue2 = num5.intValue() - 1;
                        Integer valueOf = Integer.valueOf(intValue2);
                        if (intValue2 <= 0) {
                            this.smartNotificationsDialogs.l(dialogId);
                            num3 = num2;
                        } else {
                            num3 = valueOf;
                        }
                        if (num3.equals(num5)) {
                            i11 = i13;
                        } else {
                            i11 = i13;
                            if (!getMessagesController().isCommunity(dialogId)) {
                                if (getMessagesController().isForum(dialogId)) {
                                    int i15 = this.total_unread_count - (num5.intValue() > 0 ? 1 : 0);
                                    this.total_unread_count = i15;
                                    this.total_unread_count = i15 + (num3.intValue() > 0 ? 1 : 0);
                                } else {
                                    int intValue3 = this.total_unread_count - num5.intValue();
                                    this.total_unread_count = intValue3;
                                    this.total_unread_count = num3.intValue() + intValue3;
                                }
                            }
                            this.pushDialogs.k(num3, dialogId);
                        }
                        if (num3.intValue() == 0) {
                            this.pushDialogs.l(dialogId);
                            this.pushDialogsOverrideMention.l(dialogId);
                        }
                        sparseArray.remove(intValue);
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(messageObject);
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                    } else {
                        num2 = num4;
                        i11 = i13;
                    }
                    i14++;
                    num4 = num2;
                    i13 = i11;
                }
                num = num4;
                i10 = i13;
                if (sparseArray.size() == 0) {
                    this.pushMessagesDict.l(j3);
                }
            }
            i13 = i10 + 1;
            iVar2 = iVar;
            num4 = num;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new ch(this, arrayList, 3));
        }
        if (i12 != this.total_unread_count) {
            if (this.notifyCheck) {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            } else {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            }
            AndroidUtilities.runOnUIThread(new ah(this, this.pushDialogs.m(), 7));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedMessagesFromNotifications$8(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedMessagesFromNotifications$9(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repeatNotificationMaybe$41() {
        int i10 = Calendar.getInstance().get(11);
        if (i10 < 11 || i10 > 22) {
            scheduleNotificationRepeat();
        } else {
            notificationManager.b(this.notificationId);
            showOrUpdateNotification(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLastOnlineFromOtherDevice$5(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set last online from other device = " + i10);
        }
        this.lastOnlineFromOtherDevice = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpenedDialogId$3(long j3, long j10) {
        this.openedDialogId = j3;
        this.openedTopicId = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpenedInBubble$4(boolean z10, long j3) {
        if (z10) {
            this.openedInBubbleDialogs.add(Long.valueOf(j3));
        } else {
            this.openedInBubbleDialogs.remove(Long.valueOf(j3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showExtraNotifications$45(Uri uri, File file) {
        try {
            ApplicationLoader.applicationContext.revokeUriPermission(uri, 1);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifications$35() {
        showOrUpdateNotification(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateBadge$34() {
        setBadge(getTotalAllUnreadCount());
    }

    public static Bitmap loadMultipleAvatars(ArrayList<Object> arrayList) {
        int i10;
        Bitmap bitmap;
        Paint paint;
        float f7;
        float size;
        float size2;
        float f10;
        float f11;
        float f12;
        float f13;
        Object obj;
        ArrayList<Object> arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2 == null || arrayList2.size() == 0) {
            return null;
        }
        int dp = AndroidUtilities.dp(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint2 = new Paint(3);
        Paint paint3 = new Paint(1);
        Rect rect = new Rect();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        float f14 = arrayList2.size() == 1 ? 1.0f : arrayList2.size() == 2 ? 0.65f : 0.5f;
        int i11 = 0;
        TextPaint textPaint = null;
        while (i11 < arrayList2.size()) {
            float f15 = dp;
            float f16 = (1.0f - f14) * f15;
            try {
                size = (f16 / arrayList2.size()) * ((arrayList2.size() - 1) - i11);
                size2 = i11 * (f16 / arrayList2.size());
                f10 = f15 * f14;
                f11 = f10 / 2.0f;
                i10 = dp;
                f12 = size + f11;
                bitmap = createBitmap;
                f13 = size2 + f11;
                f7 = f14;
                try {
                    canvas.drawCircle(f12, f13, AndroidUtilities.dp(2.0f) + f11, paint3);
                    obj = arrayList2.get(i11);
                    paint = paint3;
                } catch (Throwable unused) {
                    paint = paint3;
                }
            } catch (Throwable unused2) {
                i10 = dp;
                bitmap = createBitmap;
                paint = paint3;
                f7 = f14;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i11)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath, options);
                    int i12 = (int) f10;
                    options.inSampleSize = di.o8.d(options, i12, i12);
                    options.inJustDecodeBounds = false;
                    options.inDither = true;
                    Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                    matrix.reset();
                    matrix.postScale(f10 / decodeFile.getWidth(), f10 / decodeFile.getHeight());
                    matrix.postTranslate(size, size2);
                    bitmapShader.setLocalMatrix(matrix);
                    paint2.setShader(bitmapShader);
                    canvas.drawCircle(f12, f13, f11, paint2);
                    decodeFile.recycle();
                } catch (Throwable unused3) {
                    i11++;
                    arrayList2 = arrayList;
                    dp = i10;
                    createBitmap = bitmap;
                    f14 = f7;
                    paint3 = paint;
                }
                i11++;
                arrayList2 = arrayList;
                dp = i10;
                createBitmap = bitmap;
                f14 = f7;
                paint3 = paint;
            } else {
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    try {
                        paint2.setShader(new LinearGradient(size, size2, size, size2 + f10, new int[]{org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.i9.e(user.id)], false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.i9.e(user.id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        canvas.drawCircle(f12, f13, f11, paint2);
                        if (textPaint == null) {
                            try {
                                try {
                                    TextPaint textPaint2 = new TextPaint(1);
                                    try {
                                        textPaint2.setTypeface(AndroidUtilities.bold());
                                        textPaint2.setTextSize(f15 * 0.25f);
                                        textPaint2.setColor(-1);
                                        textPaint = textPaint2;
                                    } catch (Throwable unused4) {
                                        textPaint = textPaint2;
                                        i11++;
                                        arrayList2 = arrayList;
                                        dp = i10;
                                        createBitmap = bitmap;
                                        f14 = f7;
                                        paint3 = paint;
                                    }
                                } catch (Throwable unused5) {
                                }
                            } catch (Throwable unused6) {
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.ui.Components.i9.a(user.first_name, user.last_name, null, sb2);
                        String sb3 = sb2.toString();
                        try {
                            textPaint.getTextBounds(sb3, 0, sb3.length(), rect);
                            canvas.drawText(sb3, (f12 - (rect.width() / 2.0f)) - rect.left, (f13 - (rect.height() / 2.0f)) - rect.top, textPaint);
                        } catch (Throwable unused7) {
                        }
                    } catch (Throwable unused8) {
                    }
                    i11++;
                    arrayList2 = arrayList;
                    dp = i10;
                    createBitmap = bitmap;
                    f14 = f7;
                    paint3 = paint;
                }
                i11++;
                arrayList2 = arrayList;
                dp = i10;
                createBitmap = bitmap;
                f14 = f7;
                paint3 = paint;
            }
        }
        return createBitmap;
    }

    public static e0.o0 loadRoundAvatar(long j3, File file, e0.o0 o0Var) {
        if (j3 == UserObject.OAUTH) {
            o0Var.b = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.ic_launcher_dr);
            return o0Var;
        }
        if (file != null && Build.VERSION.SDK_INT >= 28) {
            try {
                o0Var.b = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new dh()));
            } catch (Throwable unused) {
            }
        }
        return o0Var;
    }

    private Pair<Integer, Boolean> parseStoryPushes(ArrayList<String> arrayList, ArrayList<Object> arrayList2) {
        int i10;
        String str;
        TLRPC.FileLocation fileLocation;
        int min = Math.min(3, this.storyPushMessages.size());
        boolean z10 = false;
        int i11 = 0;
        while (i10 < min) {
            StoryNotification storyNotification = this.storyPushMessages.get(i10);
            i11 += storyNotification.dateByIds.size();
            z10 |= storyNotification.hidden;
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(storyNotification.dialogId));
            if (user == null && (user = getMessagesStorage().getUserSync(storyNotification.dialogId)) != null) {
                getMessagesController().putUser(user, true);
            }
            Object obj = null;
            if (user != null) {
                str = UserObject.getUserName(user);
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    File pathToAttach = getFileLoader().getPathToAttach(user.photo.photo_small, true);
                    if (!pathToAttach.exists()) {
                        pathToAttach = user.photo.photo_big != null ? getFileLoader().getPathToAttach(user.photo.photo_big, true) : null;
                        if (pathToAttach != null && !pathToAttach.exists()) {
                            pathToAttach = null;
                        }
                    }
                    if (pathToAttach != null) {
                        obj = pathToAttach;
                    }
                }
            } else {
                str = storyNotification.localName;
                i10 = str == null ? i10 + 1 : 0;
            }
            if (str.length() > 50) {
                str = str.substring(0, 25) + "…";
            }
            arrayList.add(str);
            if (obj == null && user != null) {
                arrayList2.add(user);
            } else if (obj != null) {
                arrayList2.add(obj);
            }
        }
        if (z10) {
            arrayList2.clear();
        }
        return new Pair<>(Integer.valueOf(i11), Boolean.valueOf(z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (org.telegram.messenger.NotificationsController.audioManager.getRingerMode() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void playInChatSound() {
        if (this.inChatSoundEnabled && !MediaController.getInstance().isRecordingAudio()) {
            try {
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return;
        try {
            try {
                if (getNotifyOverride(getAccountInstance().getNotificationsSettings(), this.openedDialogId, this.openedTopicId) == 2) {
                    return;
                }
                notificationsQueue.postRunnable(new bh(this, 13));
            } catch (Exception e10) {
                e = e10;
                FileLog.e(e);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private String replaceSpoilers(MessageObject messageObject) {
        TLRPC.Message message;
        String str;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (str = message.message) == null || message.entities == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (messageObject.didSpoilLoginCode()) {
            return sb2.toString();
        }
        for (int i10 = 0; i10 < messageObject.messageOwner.entities.size(); i10++) {
            if (messageObject.messageOwner.entities.get(i10) instanceof TLRPC.TL_messageEntitySpoiler) {
                TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) messageObject.messageOwner.entities.get(i10);
                for (int i11 = 0; i11 < tL_messageEntitySpoiler.length; i11++) {
                    int i12 = tL_messageEntitySpoiler.offset + i11;
                    char[] cArr = this.spoilerChars;
                    sb2.setCharAt(i12, cArr[i11 % cArr.length]);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetNotificationSound(e0.t tVar, long j3, long j10, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        FileLog.d("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 == null || uri == null || TextUtils.equals(uri2.toString(), uri.toString())) {
            return;
        }
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        String uri3 = uri2.toString();
        String string = LocaleController.getString(R.string.DefaultRingtone);
        if (z10) {
            if (i12 == 2) {
                edit.putString("ChannelSound", string);
            } else if (i12 == 0) {
                edit.putString("GroupSound", string);
            } else if (i12 == 1) {
                edit.putString("GlobalSound", string);
            } else if (i12 == 3) {
                edit.putString("StoriesSound", string);
            } else if (i12 == 4 || i12 == 5) {
                edit.putString("ReactionSound", string);
            }
            if (i12 == 2) {
                edit.putString("ChannelSoundPath", uri3);
            } else if (i12 == 0) {
                edit.putString("GroupSoundPath", uri3);
            } else if (i12 == 1) {
                edit.putString("GlobalSoundPath", uri3);
            } else if (i12 == 3) {
                edit.putString("StoriesSoundPath", uri3);
            } else if (i12 == 4 || i12 == 5) {
                edit.putString("ReactionSound", uri3);
            }
            getNotificationsController().lambda$deleteNotificationChannelGlobal$43(i12, -1);
        } else {
            edit.putString(w1.i(j3, j10, new StringBuilder("sound_")), string);
            edit.putString(w1.i(j3, j10, new StringBuilder("sound_path_")), uri3);
            lambda$deleteNotificationChannel$42(j3, j10, -1);
        }
        edit.commit();
        tVar.y = validateChannelId(j3, j10, str, jArr, i10, uri2, i11, z10, z11, z12, i12);
        notificationManager.d(this.notificationId, tVar.b());
    }

    private void scheduleNotificationDelay(boolean z10) {
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("delay notification start, onlineReason = " + z10);
            }
            this.notificationDelayWakelock.acquire(10000L);
            DispatchQueue dispatchQueue = notificationsQueue;
            dispatchQueue.cancelRunnable(this.notificationDelayRunnable);
            dispatchQueue.postRunnable(this.notificationDelayRunnable, z10 ? 3000 : MediaDataController.MAX_STYLE_RUNS_COUNT);
        } catch (Exception e7) {
            FileLog.e(e7);
            showOrUpdateNotification(this.notifyCheck);
        }
    }

    private void scheduleNotificationRepeat() {
        try {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(ApplicationLoader.applicationContext, 0, intent, 33554432);
            if (getAccountInstance().getNotificationsSettings().getInt("repeat_messages", 60) <= 0 || this.personalCount <= 0) {
                this.alarmManager.cancel(service);
            } else {
                this.alarmManager.set(2, SystemClock.elapsedRealtime() + (r1 * 60000), service);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    private void setBadge(int i10) {
        if (this.lastBadgeCount == i10) {
            return;
        }
        FileLog.d("setBadge " + i10);
        this.lastBadgeCount = i10;
        NotificationBadge.applyCount(i10);
    }

    private void setNotificationChannel(Notification notification, e0.t tVar, boolean z10) {
        if (z10) {
            tVar.y = OTHER_NOTIFICATIONS_CHANNEL;
        } else {
            tVar.y = notification.getChannelId();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(79:113|(1:115)(3:723|724|(3:726|(1:728)(1:730)|729)(1:731))|116|(3:118|(1:124)|125)|126|(2:685|(78:687|(5:689|(4:692|(2:700|701)|702|690)|707|708|(78:710|(1:712)|713|714|715|(1:717)(1:719)|718|131|(1:133)|134|(1:136)(1:677)|137|(1:676)(1:141)|142|143|(3:146|(1:148)|(3:150|151|(56:155|156|157|(4:161|162|163|164)|169|(1:669)(1:173)|(1:668)(1:176)|177|(1:667)|184|(1:666)(1:191)|192|(11:194|(1:196)(2:396|(5:398|399|56|57|58)(2:400|(1:(1:403)(1:404))(2:405|(1:407)(2:408|(1:413)(1:412)))))|197|(2:200|198)|201|202|(1:395)(1:205)|206|(1:208)|(1:210)(1:394)|211)(3:414|(2:415|(6:417|(1:419)(3:424|(1:426)(2:651|(2:656|(1:658)(2:659|(1:663)))(1:655))|(3:428|(1:430)|431)(17:432|(1:434)|435|(2:647|(1:649)(1:650))(1:441)|442|443|(3:639|(1:(1:642)(2:643|(1:645)))|646)(1:447)|448|(2:(2:451|(1:(2:454|(1:456))(1:633))(2:634|(1:636)))(1:637)|632)(1:638)|(4:573|(1:631)(2:577|(5:579|(2:628|629)(3:582|(1:586)|(1:627)(1:596))|(2:601|(2:603|(1:613))(2:614|(1:624)))|625|626))|630|626)(1:460)|461|(9:463|(1:569)(8:476|(1:568)(3:480|(12:544|545|546|547|548|549|550|551|552|553|554|555)(1:482)|483)|484|(1:486)(1:543)|487|488|(2:538|539)(3:490|(1:537)|492)|(9:494|(1:496)|497|(2:499|(1:501))|502|503|(2:508|(2:510|(3:512|(2:517|518)(1:514)|(1:516))(2:521|(2:523|(2:525|526)))))|533|526))|534|(5:536|503|(3:506|508|(0))|533|526)|502|503|(0)|533|526)(2:570|(1:572))|527|(2:529|(3:531|532|423))|421|422|423))|420|421|422|423)(1:664))|665)|212|213|(2:364|(2:369|(41:379|(4:381|(2:384|382)|385|386)(2:387|(1:389)(2:390|(1:392)(1:393)))|219|(1:221)|222|(1:224)|225|(2:227|(1:229)(1:359))(2:360|(1:362)(1:363))|(1:231)(1:358)|232|(4:234|(2:237|235)|238|239)(1:357)|240|(1:242)(1:356)|243|244|245|(1:247)|(4:249|250|251|(1:253))(1:352)|254|(1:256)|(2:260|(21:262|(4:265|(2:266|(2:268|(2:271|272)(1:270))(1:345))|(1:275)(1:274)|263)|346|276|(1:278)|279|(2:(1:284)|(1:291))|292|(1:344)(1:298)|299|(1:301)|(1:303)|304|(3:309|(4:311|(3:313|(4:315|(1:317)|318|319)(2:321|322)|320)|323|324)|325)|326|(1:343)(2:329|(2:333|(1:337)))|338|(1:340)|341|342|58))|347|(0)|279|(3:281|(0)|(2:286|291))|292|(1:294)|344|299|(0)|(0)|304|(4:306|309|(0)|325)|326|(0)|343|338|(0)|341|342|58)(3:373|(1:375)(1:(1:378))|376))(1:368))(1:217)|218|219|(0)|222|(0)|225|(0)(0)|(0)(0)|232|(0)(0)|240|(0)(0)|243|244|245|(0)|(0)(0)|254|(0)|(3:258|260|(0))|347|(0)|279|(0)|292|(0)|344|299|(0)|(0)|304|(0)|326|(0)|343|338|(0)|341|342|58)))|675|169|(1:171)|669|(0)|668|177|(1:179)|667|184|(1:187)|666|192|(0)(0)|212|213|(1:215)|364|(1:366)|369|(1:371)|379|(0)(0)|219|(0)|222|(0)|225|(0)(0)|(0)(0)|232|(0)(0)|240|(0)(0)|243|244|245|(0)|(0)(0)|254|(0)|(0)|347|(0)|279|(0)|292|(0)|344|299|(0)|(0)|304|(0)|326|(0)|343|338|(0)|341|342|58))(1:721)|720|715|(0)(0)|718|131|(0)|134|(0)(0)|137|(1:139)|676|142|143|(3:146|(0)|(0))|675|169|(0)|669|(0)|668|177|(0)|667|184|(0)|666|192|(0)(0)|212|213|(0)|364|(0)|369|(0)|379|(0)(0)|219|(0)|222|(0)|225|(0)(0)|(0)(0)|232|(0)(0)|240|(0)(0)|243|244|245|(0)|(0)(0)|254|(0)|(0)|347|(0)|279|(0)|292|(0)|344|299|(0)|(0)|304|(0)|326|(0)|343|338|(0)|341|342|58)(1:722))(1:129)|130|131|(0)|134|(0)(0)|137|(0)|676|142|143|(0)|675|169|(0)|669|(0)|668|177|(0)|667|184|(0)|666|192|(0)(0)|212|213|(0)|364|(0)|369|(0)|379|(0)(0)|219|(0)|222|(0)|225|(0)(0)|(0)(0)|232|(0)(0)|240|(0)(0)|243|244|245|(0)|(0)(0)|254|(0)|(0)|347|(0)|279|(0)|292|(0)|344|299|(0)|(0)|304|(0)|326|(0)|343|338|(0)|341|342|58) */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x131d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x131e, code lost:
    
        r6 = r66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x049c, code lost:
    
        if (r0.local_id != 0) goto L180;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x080a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0824 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0888 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x08b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x10ba  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1181  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x11d9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x1239  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x126a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x12c6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x1315 A[Catch: Exception -> 0x131d, TRY_LEAVE, TryCatch #11 {Exception -> 0x131d, blocks: (B:245:0x12f7, B:247:0x1315), top: B:244:0x12f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1323  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x134b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x1354  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x135e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x13ab  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x13ed  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x13f3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x1410  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x1428  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x142d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x143a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x1447  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x14c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x14fe  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x1333  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x12cd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x1290  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x124f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x1213  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x10ce  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x10e5  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x1109  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x1130  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0ea8  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0ed5  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0f9a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0fae  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x1047  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0f92  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0eb5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0eac  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x04dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:783:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:878:0x157f  */
    /* JADX WARN: Removed duplicated region for block: B:887:0x15e6  */
    /* JADX WARN: Removed duplicated region for block: B:899:0x1648  */
    /* JADX WARN: Removed duplicated region for block: B:922:0x15be  */
    /* JADX WARN: Removed duplicated region for block: B:928:0x1578 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:930:0x0173  */
    /* JADX WARN: Type inference failed for: r6v118 */
    /* JADX WARN: Type inference failed for: r6v119, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v121 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showExtraNotifications(e0.t tVar, String str, long j3, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        boolean z13;
        long clientUserId;
        boolean z14;
        a0.i iVar;
        int size;
        Notification notification;
        ArrayList arrayList;
        a0.i iVar2;
        ArrayList arrayList2;
        int i13;
        int size2;
        int i14;
        a0.i iVar3;
        boolean z15;
        int i15;
        boolean z16;
        long j11;
        long j12;
        long j13;
        int id2;
        MessageObject messageObject;
        ArrayList arrayList3;
        a0.i iVar4;
        ArrayList arrayList4;
        Integer num;
        ArrayList arrayList5;
        Notification notification2;
        int i16;
        a0.i iVar5;
        DialogKey dialogKey;
        String str3;
        TLRPC.User user;
        String string;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        boolean z17;
        boolean z18;
        boolean z19;
        SharedPreferences sharedPreferences;
        a0.i iVar6;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i17;
        long j14;
        Notification notification3;
        TLRPC.FileLocation fileLocation2;
        TLRPC.FileLocation fileLocation3;
        TLRPC.Chat chat2;
        String str4;
        TLRPC.Chat chat3;
        String str5;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation4;
        TLRPC.UserProfilePhoto userProfilePhoto;
        String str6;
        String str7;
        String string2;
        String str8;
        File file;
        Bitmap bitmap;
        String str9;
        NotificationsController notificationsController;
        File file2;
        TLRPC.User user3;
        String str10;
        Bitmap bitmap2;
        e0.k b10;
        Integer num2;
        DialogKey dialogKey2;
        long j15;
        long j16;
        e0.a0 a0Var;
        int i18;
        e0.k kVar;
        MessageObject messageObject2;
        a0.i iVar7;
        String str11;
        long j17;
        String str12;
        Bitmap bitmap3;
        int i19;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList8;
        DialogKey dialogKey3;
        ArrayList arrayList9;
        int i20;
        boolean[] zArr;
        long j18;
        String str13;
        StringBuilder sb2;
        String[] strArr;
        e0.p0 p0Var;
        String str14;
        long j19;
        e0.p0 a2;
        int i21;
        File file3;
        TLRPC.ChatPhoto chatPhoto2;
        TLRPC.FileLocation fileLocation5;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation6;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation7;
        NotificationsController notificationsController2;
        a0.i iVar8;
        int id3;
        ArrayList arrayList10;
        char c10;
        ArrayList arrayList11;
        Uri uri2;
        File file4;
        File file5;
        Uri d;
        File file6;
        DialogKey dialogKey4;
        MessageObject messageObject3;
        DialogKey dialogKey5;
        long j20;
        Bitmap bitmap4;
        e0.k kVar2;
        MessageObject messageObject4;
        String str15;
        e0.k kVar3;
        ArrayList arrayList12;
        long j21;
        MessageObject messageObject5;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        long j22;
        TLRPC.User user4;
        int size3;
        int i22;
        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup;
        ArrayList<Object> arrayList13;
        boolean z20;
        ?? r62;
        String formatPluralString;
        TLRPC.User user5;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        TLRPC.FileLocation fileLocation8;
        TLRPC.UserProfilePhoto userProfilePhoto5;
        TLRPC.FileLocation fileLocation9;
        NotificationsController notificationsController3 = this;
        FileLog.d("showExtraNotifications pushMessages.size()=" + notificationsController3.pushMessages.size());
        if (Build.VERSION.SDK_INT >= 26) {
            tVar.e(notificationsController3.validateChannelId(j3, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12));
        }
        Notification b11 = tVar.b();
        SharedPreferences notificationsSettings = notificationsController3.getAccountInstance().getNotificationsSettings();
        ArrayList arrayList14 = new ArrayList();
        if (!notificationsController3.storyPushMessages.isEmpty()) {
            arrayList14.add(new DialogKey(0L, 0L, true));
        }
        a0.i iVar9 = new a0.i();
        int i23 = 0;
        for (int i24 = 0; i24 < notificationsController3.pushMessages.size(); i24++) {
            MessageObject messageObject6 = notificationsController3.pushMessages.get(i24);
            long dialogId = messageObject6.getDialogId();
            long topicId = MessageObject.getTopicId(notificationsController3.currentAccount, messageObject6.messageOwner, notificationsController3.getMessagesController().isForum(messageObject6));
            int i25 = notificationsSettings.getInt("dismissDate" + dialogId, 0);
            if (messageObject6.isStoryPush || messageObject6.messageOwner.date > i25) {
                ArrayList arrayList15 = (ArrayList) iVar9.f(dialogId);
                if (arrayList15 == null) {
                    ArrayList k10 = w1.k(dialogId, iVar9);
                    FileLog.d("showExtraNotifications: sortedDialogs += " + dialogId);
                    arrayList14.add(new DialogKey(dialogId, topicId, false));
                    arrayList15 = k10;
                }
                arrayList15.add(messageObject6);
            } else {
                StringBuilder t10 = a4.a.t(dialogId, "showExtraNotifications: dialog ", " is skipped, message date (");
                t10.append(messageObject6.messageOwner.date);
                t10.append(" <= ");
                t10.append(i25);
                t10.append(")");
                FileLog.d(t10.toString());
            }
        }
        a0.i iVar10 = new a0.i();
        for (int i26 = 0; i26 < notificationsController3.wearNotificationsIds.m(); i26++) {
            iVar10.k((Integer) notificationsController3.wearNotificationsIds.n(i26), notificationsController3.wearNotificationsIds.j(i26));
        }
        notificationsController3.wearNotificationsIds.b();
        ArrayList arrayList16 = new ArrayList();
        int i27 = Build.VERSION.SDK_INT;
        if (i27 > 27) {
            if (arrayList14.size() <= (notificationsController3.storyPushMessages.isEmpty() ? 1 : 2)) {
                z13 = false;
                if (z13 && i27 >= 26) {
                    checkOtherNotificationsChannel();
                }
                clientUserId = notificationsController3.getUserConfig().getClientUserId();
                z14 = !AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter;
                FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() <= 0) + " waitingForPasscode=" + z14 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z13);
                iVar = new a0.i();
                size = arrayList14.size();
                while (true) {
                    if (i23 < size) {
                        notification = b11;
                        arrayList = arrayList16;
                        break;
                    }
                    ArrayList arrayList17 = arrayList16;
                    if (arrayList16.size() >= 7) {
                        FileLog.d("showExtraNotifications: break from holders, count over 7");
                        notification = b11;
                        arrayList = arrayList17;
                        break;
                    }
                    DialogKey dialogKey6 = (DialogKey) arrayList14.get(i23);
                    ArrayList arrayList18 = arrayList14;
                    int i28 = i23;
                    if (dialogKey6.story) {
                        ArrayList arrayList19 = new ArrayList();
                        if (notificationsController3.storyPushMessages.isEmpty()) {
                            FileLog.d("showExtraNotifications: [" + dialogKey6.dialogId + "] continue; story but storyPushMessages is empty");
                            notification3 = b11;
                            sharedPreferences = notificationsSettings;
                            iVar4 = iVar9;
                            z15 = z14;
                            iVar5 = iVar10;
                            iVar6 = iVar;
                            i15 = size;
                            z16 = z13;
                            j14 = clientUserId;
                            arrayList6 = arrayList17;
                            arrayList7 = arrayList18;
                            i17 = i28;
                            i23 = i17 + 1;
                            arrayList16 = arrayList6;
                            arrayList14 = arrayList7;
                            z14 = z15;
                            z13 = z16;
                            size = i15;
                            iVar9 = iVar4;
                            iVar10 = iVar5;
                            notificationsSettings = sharedPreferences;
                            clientUserId = j14;
                            b11 = notification3;
                            iVar = iVar6;
                        } else {
                            z15 = z14;
                            i15 = size;
                            z16 = z13;
                            long j23 = notificationsController3.storyPushMessages.get(0).dialogId;
                            Iterator<Integer> it = notificationsController3.storyPushMessages.get(0).dateByIds.keySet().iterator();
                            int i29 = 0;
                            while (it.hasNext()) {
                                i29 = Math.max(i29, it.next().intValue());
                                arrayList19 = arrayList19;
                            }
                            arrayList3 = arrayList19;
                            j11 = clientUserId;
                            j12 = 0;
                            j13 = j23;
                            id2 = i29;
                            messageObject = null;
                        }
                    } else {
                        z15 = z14;
                        i15 = size;
                        z16 = z13;
                        long j24 = dialogKey6.dialogId;
                        j11 = clientUserId;
                        long j25 = dialogKey6.topicId;
                        ArrayList arrayList20 = (ArrayList) iVar9.f(j24);
                        j12 = j25;
                        j13 = j24;
                        id2 = ((MessageObject) arrayList20.get(0)).getId();
                        messageObject = (MessageObject) arrayList20.get(0);
                        arrayList3 = arrayList20;
                    }
                    iVar4 = iVar9;
                    Integer num3 = (Integer) iVar10.f(dialogKey6.dialogId);
                    if (dialogKey6.story) {
                        num = 2147483646;
                        arrayList4 = arrayList3;
                    } else {
                        if (num3 == null) {
                            arrayList4 = arrayList3;
                            long j26 = dialogKey6.dialogId;
                            num3 = Integer.valueOf(((int) j26) + ((int) (j26 >> 32)));
                        } else {
                            arrayList4 = arrayList3;
                            iVar10.l(dialogKey6.dialogId);
                        }
                        num = num3;
                    }
                    int i30 = 0;
                    int i31 = 0;
                    while (true) {
                        arrayList5 = arrayList4;
                        if (i30 >= arrayList5.size()) {
                            break;
                        }
                        arrayList4 = arrayList5;
                        Integer num4 = num;
                        if (i31 < ((MessageObject) arrayList4.get(i30)).messageOwner.date) {
                            i31 = ((MessageObject) arrayList4.get(i30)).messageOwner.date;
                        }
                        i30++;
                        num = num4;
                    }
                    Integer num5 = num;
                    ArrayList arrayList21 = arrayList5;
                    if (dialogKey6.story) {
                        iVar5 = iVar10;
                        TLRPC.User user6 = notificationsController3.getMessagesController().getUser(Long.valueOf(j13));
                        notification2 = b11;
                        if (notificationsController3.storyPushMessages.size() == 1) {
                            string = user6 != null ? UserObject.getFirstName(user6) : notificationsController3.storyPushMessages.get(0).localName;
                            i16 = i31;
                        } else {
                            i16 = i31;
                            string = LocaleController.formatPluralString("Stories", notificationsController3.storyPushMessages.size(), new Object[0]);
                        }
                        if (user6 == null || (userProfilePhoto5 = user6.photo) == null || (fileLocation9 = userProfilePhoto5.photo_small) == null) {
                            dialogKey = dialogKey6;
                        } else {
                            dialogKey = dialogKey6;
                            if (fileLocation9.volume_id != 0 && fileLocation9.local_id != 0) {
                                str3 = "Stories";
                                fileLocation = fileLocation9;
                                chat = null;
                                z17 = false;
                                z18 = false;
                                z19 = false;
                                user2 = user6;
                            }
                        }
                        str3 = "Stories";
                        chat = null;
                        fileLocation = null;
                        z17 = false;
                        z18 = false;
                        z19 = false;
                        user2 = user6;
                    } else {
                        notification2 = b11;
                        i16 = i31;
                        iVar5 = iVar10;
                        dialogKey = dialogKey6;
                        if (DialogObject.isEncryptedDialog(j13)) {
                            str3 = "Stories";
                            if (j13 != globalSecretChatId) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(j13);
                                TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                                if (encryptedChat != null) {
                                    user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                                    if (user == null) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.w("not found secret chat user to show dialog notification " + encryptedChat.user_id);
                                        }
                                    }
                                } else if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("not found secret chat to show dialog notification " + encryptedChatId);
                                }
                                notificationsController3 = this;
                                sharedPreferences = notificationsSettings;
                                iVar6 = iVar;
                                arrayList6 = arrayList17;
                                arrayList7 = arrayList18;
                                i17 = i28;
                                j14 = j11;
                                notification3 = notification2;
                                i23 = i17 + 1;
                                arrayList16 = arrayList6;
                                arrayList14 = arrayList7;
                                z14 = z15;
                                z13 = z16;
                                size = i15;
                                iVar9 = iVar4;
                                iVar10 = iVar5;
                                notificationsSettings = sharedPreferences;
                                clientUserId = j14;
                                b11 = notification3;
                                iVar = iVar6;
                            } else {
                                user = null;
                            }
                            string = LocaleController.getString(R.string.SecretChatName);
                            user2 = user;
                            chat = null;
                            fileLocation = null;
                            z17 = false;
                            z18 = false;
                            z19 = false;
                        } else {
                            boolean z21 = (messageObject == null || messageObject.isReactionPush || messageObject.isStoryReactionPush || j13 == 777000) ? false : true;
                            if (DialogObject.isUserDialog(j13)) {
                                TLRPC.User user7 = notificationsController3.getMessagesController().getUser(Long.valueOf(j13));
                                if (user7 != null) {
                                    String userName = UserObject.getUserName(user7);
                                    TLRPC.UserProfilePhoto userProfilePhoto6 = user7.photo;
                                    if (userProfilePhoto6 == null || (fileLocation = userProfilePhoto6.photo_small) == null) {
                                        str3 = "Stories";
                                        str6 = userName;
                                    } else {
                                        str3 = "Stories";
                                        str6 = userName;
                                        if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                            str7 = str6;
                                            if (j13 != UserObject.OAUTH) {
                                                string2 = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                            } else if (j13 == UserObject.VERIFY) {
                                                string2 = LocaleController.getString(R.string.VerifyCodesNotifications);
                                            } else if (UserObject.isReplyUser(j13)) {
                                                string2 = LocaleController.getString(R.string.RepliesTitle);
                                            } else if (j13 == j11) {
                                                string2 = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                                            } else {
                                                user2 = user7;
                                                str4 = str7;
                                                chat2 = null;
                                                z18 = false;
                                                z19 = false;
                                                if (j13 == UserObject.VERIFY || messageObject == null || messageObject.getForwardedFromId() == null) {
                                                    z17 = z21;
                                                    chat3 = chat2;
                                                    str5 = str4;
                                                } else {
                                                    z17 = z21;
                                                    Long forwardedFromId = messageObject.getForwardedFromId();
                                                    chat3 = chat2;
                                                    str5 = str4;
                                                    long longValue = forwardedFromId.longValue();
                                                    if (!DialogObject.isUserDialog(longValue) ? !((chatPhoto = getMessagesController().getChat(Long.valueOf(-longValue)).photo) == null || (fileLocation4 = chatPhoto.photo_small) == null || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0) : !((userProfilePhoto = getMessagesController().getUser(forwardedFromId).photo) == null || (fileLocation4 = userProfilePhoto.photo_small) == null || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0)) {
                                                        fileLocation = fileLocation4;
                                                    }
                                                }
                                                string = str5;
                                                chat = chat3;
                                                if (j13 == UserObject.VERIFY) {
                                                    z17 = false;
                                                }
                                            }
                                            String str16 = string2;
                                            user2 = user7;
                                            str4 = str16;
                                            chat2 = null;
                                            z18 = false;
                                            z19 = false;
                                            if (j13 == UserObject.VERIFY) {
                                            }
                                            z17 = z21;
                                            chat3 = chat2;
                                            str5 = str4;
                                            string = str5;
                                            chat = chat3;
                                            if (j13 == UserObject.VERIFY) {
                                            }
                                        }
                                    }
                                    str7 = str6;
                                } else if (messageObject.isFcmMessage()) {
                                    str7 = messageObject.localName;
                                    str3 = "Stories";
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.w("not found user to show dialog notification " + j13);
                                    }
                                    sharedPreferences = notificationsSettings;
                                    iVar6 = iVar;
                                    arrayList6 = arrayList17;
                                    arrayList7 = arrayList18;
                                    i17 = i28;
                                    j14 = j11;
                                    notification3 = notification2;
                                    i23 = i17 + 1;
                                    arrayList16 = arrayList6;
                                    arrayList14 = arrayList7;
                                    z14 = z15;
                                    z13 = z16;
                                    size = i15;
                                    iVar9 = iVar4;
                                    iVar10 = iVar5;
                                    notificationsSettings = sharedPreferences;
                                    clientUserId = j14;
                                    b11 = notification3;
                                    iVar = iVar6;
                                }
                                fileLocation = null;
                                if (j13 != UserObject.OAUTH) {
                                }
                                String str162 = string2;
                                user2 = user7;
                                str4 = str162;
                                chat2 = null;
                                z18 = false;
                                z19 = false;
                                if (j13 == UserObject.VERIFY) {
                                }
                                z17 = z21;
                                chat3 = chat2;
                                str5 = str4;
                                string = str5;
                                chat = chat3;
                                if (j13 == UserObject.VERIFY) {
                                }
                            } else {
                                str3 = "Stories";
                                TLRPC.Chat chat4 = notificationsController3.getMessagesController().getChat(Long.valueOf(-j13));
                                if (chat4 != null) {
                                    boolean z22 = chat4.megagroup;
                                    boolean z23 = ChatObject.isChannel(chat4) && !chat4.megagroup;
                                    String title = notificationsController3.getTitle(chat4);
                                    boolean z24 = z21;
                                    TLRPC.ChatPhoto chatPhoto3 = chat4.photo;
                                    if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                        z18 = z22;
                                        z19 = z23;
                                    } else {
                                        z18 = z22;
                                        z19 = z23;
                                        if (fileLocation2.volume_id != 0) {
                                        }
                                    }
                                    fileLocation2 = null;
                                    if (j12 != 0) {
                                        fileLocation3 = fileLocation2;
                                        TLRPC.TL_forumTopic findTopic = notificationsController3.getMessagesController().getTopicsController().findTopic(chat4.id, j12);
                                        if (findTopic != null) {
                                            title = a4.a.q(findTopic.title, " in ", title, new StringBuilder());
                                        }
                                    } else {
                                        fileLocation3 = fileLocation2;
                                    }
                                    if (z24) {
                                        z21 = ChatObject.canSendPlain(chat4);
                                        chat2 = chat4;
                                        str4 = title;
                                    } else {
                                        chat2 = chat4;
                                        str4 = title;
                                        z21 = z24;
                                    }
                                    user2 = null;
                                    fileLocation = fileLocation3;
                                } else if (messageObject.isFcmMessage()) {
                                    z18 = messageObject.isSupergroup();
                                    chat2 = chat4;
                                    str4 = messageObject.localName;
                                    z19 = messageObject.localChannel;
                                    z21 = false;
                                    user2 = null;
                                    fileLocation = null;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.w("not found chat to show dialog notification " + j13);
                                    }
                                    sharedPreferences = notificationsSettings;
                                    iVar6 = iVar;
                                    arrayList6 = arrayList17;
                                    arrayList7 = arrayList18;
                                    i17 = i28;
                                    j14 = j11;
                                    notification3 = notification2;
                                    i23 = i17 + 1;
                                    arrayList16 = arrayList6;
                                    arrayList14 = arrayList7;
                                    z14 = z15;
                                    z13 = z16;
                                    size = i15;
                                    iVar9 = iVar4;
                                    iVar10 = iVar5;
                                    notificationsSettings = sharedPreferences;
                                    clientUserId = j14;
                                    b11 = notification3;
                                    iVar = iVar6;
                                }
                                if (j13 == UserObject.VERIFY) {
                                }
                                z17 = z21;
                                chat3 = chat2;
                                str5 = str4;
                                string = str5;
                                chat = chat3;
                                if (j13 == UserObject.VERIFY) {
                                }
                            }
                        }
                    }
                    if (messageObject != null && messageObject.isStoryReactionPush && !notificationsSettings.getBoolean("EnableReactionsPreview", true)) {
                        string = LocaleController.getString(R.string.NotificationHiddenChatName);
                        fileLocation = null;
                        z17 = false;
                    }
                    if (z15) {
                        string = DialogObject.isChatDialog(j13) ? LocaleController.getString(R.string.NotificationHiddenChatName) : LocaleController.getString(R.string.NotificationHiddenName);
                        fileLocation = null;
                        z17 = false;
                    }
                    if (fileLocation != null) {
                        File pathToAttach = getFileLoader().getPathToAttach(fileLocation, true);
                        sharedPreferences = notificationsSettings;
                        if (Build.VERSION.SDK_INT < 28) {
                            str8 = str3;
                            BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                            if (imageFromMemory != null) {
                                bitmap = imageFromMemory.getBitmap();
                            } else {
                                try {
                                    if (pathToAttach.exists()) {
                                        float dp = 160.0f / AndroidUtilities.dp(50.0f);
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inSampleSize = dp < 1.0f ? 1 : (int) dp;
                                        bitmap = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                                    } else {
                                        bitmap = null;
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            file = pathToAttach;
                            if (chat != null) {
                                e0.o0 o0Var = new e0.o0();
                                o0Var.a = string;
                                if (file != null && file.exists() && Build.VERSION.SDK_INT >= 28) {
                                    loadRoundAvatar(j13, file, o0Var);
                                }
                                iVar.k(o0Var.a(), -chat.id);
                            }
                            TLRPC.Chat chat5 = chat;
                            String str17 = "currentAccount";
                            if (!(z19 || z18) || !z17 || SharedConfig.isWaitingForPasscodeEnter || j11 == j13 || UserObject.isReplyUser(j13)) {
                                str9 = string;
                                file2 = file;
                                user3 = user2;
                                str10 = "max_id";
                                bitmap2 = bitmap;
                                notificationsController = this;
                            } else {
                                str9 = string;
                                notificationsController = this;
                                if (MessagesController.getInstance(notificationsController.currentAccount).getSendPaidMessagesStars(j13) > 0) {
                                    file2 = file;
                                    bitmap2 = bitmap;
                                    Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                    intent.putExtra("dialog_id", j13);
                                    intent.putExtra("max_id", id2);
                                    intent.putExtra("topic_id", j12);
                                    intent.putExtra("currentAccount", notificationsController.currentAccount);
                                    if (arrayList21.isEmpty()) {
                                        user3 = user2;
                                    } else {
                                        ArrayList arrayList22 = new ArrayList();
                                        user3 = user2;
                                        for (int i32 = 0; i32 < arrayList21.size(); i32++) {
                                            MessageObject messageObject7 = (MessageObject) arrayList21.get(i32);
                                            if (messageObject7 != null && messageObject7.isVoice() && messageObject7.isContentUnread() && !messageObject7.isOut()) {
                                                arrayList22.add(Integer.valueOf(messageObject7.getId()));
                                            }
                                        }
                                        if (!arrayList22.isEmpty()) {
                                            int size4 = arrayList22.size();
                                            int[] iArr = new int[size4];
                                            str10 = "max_id";
                                            for (int i33 = 0; i33 < size4; i33++) {
                                                iArr[i33] = ((Integer) arrayList22.get(i33)).intValue();
                                            }
                                            intent.putExtra("voice_msg_ids", iArr);
                                            PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent, 167772160);
                                            e0.r0 r0Var = new e0.r0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                                            e0.j jVar = new e0.j(R.drawable.ic_reply_icon, !DialogObject.isChatDialog(j13) ? LocaleController.formatString(R.string.ReplyToGroup, str9) : LocaleController.formatString(R.string.ReplyToUser, str9), broadcast);
                                            jVar.c();
                                            jVar.g = 1;
                                            jVar.a(r0Var);
                                            jVar.h = false;
                                            b10 = jVar.b();
                                            num2 = (Integer) notificationsController.pushDialogs.f(j13);
                                            if (num2 == null) {
                                                num2 = 0;
                                            }
                                            dialogKey2 = dialogKey;
                                            int size5 = dialogKey2.story ? notificationsController.storyPushMessages.size() : Math.max(num2.intValue(), arrayList21.size());
                                            String format = (size5 > 1 || Build.VERSION.SDK_INT >= 28) ? str9 : String.format("%1$s (%2$d)", str9, Integer.valueOf(size5));
                                            j15 = j11;
                                            e0.p0 p0Var2 = (e0.p0) iVar.f(j15);
                                            int i34 = id2;
                                            if (Build.VERSION.SDK_INT >= 28 && p0Var2 == null) {
                                                user5 = notificationsController.getMessagesController().getUser(Long.valueOf(j15));
                                                if (user5 == null) {
                                                    user5 = notificationsController.getUserConfig().getCurrentUser();
                                                }
                                                if (user5 != null) {
                                                    try {
                                                        userProfilePhoto4 = user5.photo;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        j16 = j12;
                                                    }
                                                    if (userProfilePhoto4 != null && (fileLocation8 = userProfilePhoto4.photo_small) != null) {
                                                        j16 = j12;
                                                        try {
                                                            if (fileLocation8.volume_id != 0 && fileLocation8.local_id != 0) {
                                                                e0.o0 o0Var2 = new e0.o0();
                                                                o0Var2.a = LocaleController.getString(R.string.FromYou);
                                                                loadRoundAvatar(notificationsController.getUserConfig().getClientUserId(), notificationsController.getFileLoader().getPathToAttach(user5.photo.photo_small, true), o0Var2);
                                                                e0.p0 a10 = o0Var2.a();
                                                                try {
                                                                    iVar.k(a10, j15);
                                                                    p0Var2 = a10;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    p0Var2 = a10;
                                                                    FileLog.e(th);
                                                                    e0.p0 p0Var3 = p0Var2;
                                                                    if (p0Var3 == null) {
                                                                    }
                                                                    i18 = Build.VERSION.SDK_INT;
                                                                    if (i18 >= 28) {
                                                                    }
                                                                    a0Var.f(format);
                                                                    a0Var.i = Boolean.valueOf(i18 >= 28 || (!z19 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                                                                    StringBuilder sb3 = new StringBuilder();
                                                                    String[] strArr2 = new String[1];
                                                                    j14 = j15;
                                                                    boolean[] zArr2 = new boolean[1];
                                                                    if (dialogKey2.story) {
                                                                    }
                                                                    NotificationsController notificationsController4 = notificationsController;
                                                                    dialogKey4 = dialogKey2;
                                                                    ArrayList arrayList23 = arrayList21;
                                                                    StringBuilder sb4 = sb3;
                                                                    a0.i iVar11 = iVar7;
                                                                    Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                                    intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                                    intent2.setFlags(67108864);
                                                                    intent2.addCategory("android.intent.category.LAUNCHER");
                                                                    messageObject3 = messageObject2;
                                                                    if (messageObject2 == null) {
                                                                    }
                                                                    if (messageObject3 == null) {
                                                                    }
                                                                    if (messageObject3 == null) {
                                                                    }
                                                                    dialogKey5 = dialogKey4;
                                                                    if (dialogKey5.story) {
                                                                    }
                                                                    j20 = j17;
                                                                    i2.g.w(a4.a.t(j13, "show extra notifications chatId ", " topicId "), j20);
                                                                    if (j20 != 0) {
                                                                    }
                                                                    String str18 = str11;
                                                                    intent2.putExtra(str18, notificationsController4.currentAccount);
                                                                    PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 1140850688);
                                                                    e0.g0 g0Var = new e0.g0();
                                                                    e0.k kVar4 = kVar;
                                                                    if (kVar != null) {
                                                                    }
                                                                    int i35 = i19;
                                                                    Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                                    intent3.addFlags(32);
                                                                    intent3.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                                    intent3.putExtra("dialog_id", j13);
                                                                    intent3.putExtra(str10, i34);
                                                                    intent3.putExtra(str18, notificationsController4.currentAccount);
                                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList24 = arrayList8;
                                                                    bitmap4 = bitmap3;
                                                                    e0.j jVar2 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent3, 167772160));
                                                                    jVar2.g = 2;
                                                                    jVar2.h = false;
                                                                    e0.k b12 = jVar2.b();
                                                                    if (!DialogObject.isEncryptedDialog(j13)) {
                                                                    }
                                                                    if (str15 == null) {
                                                                    }
                                                                    StringBuilder sb5 = new StringBuilder("tgaccount");
                                                                    e0.k kVar5 = kVar2;
                                                                    sb5.append(j14);
                                                                    g0Var.b(sb5.toString());
                                                                    if (dialogKey5.story) {
                                                                    }
                                                                    e0.t tVar2 = new e0.t(ApplicationLoader.applicationContext);
                                                                    tVar2.g(str12);
                                                                    ArrayList arrayList25 = arrayList12;
                                                                    tVar2.E.icon = R.drawable.notification;
                                                                    tVar2.f(sb4.toString());
                                                                    tVar2.h(16, true);
                                                                    tVar2.i = !dialogKey5.story ? notificationsController4.storyPushMessages.size() : arrayList25.size();
                                                                    tVar2.w = -15618822;
                                                                    tVar2.r = false;
                                                                    tVar2.E.when = j21;
                                                                    tVar2.k = true;
                                                                    tVar2.n(a0Var);
                                                                    tVar2.g = activity;
                                                                    tVar2.c(g0Var);
                                                                    tVar2.l(String.valueOf(Long.MAX_VALUE - j21));
                                                                    tVar2.u = "msg";
                                                                    Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                    intent4.putExtra("messageDate", i16);
                                                                    intent4.putExtra("dialogId", j13);
                                                                    intent4.putExtra(str18, notificationsController4.currentAccount);
                                                                    if (dialogKey5.story) {
                                                                    }
                                                                    if (messageObject4 == null) {
                                                                    }
                                                                    tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent4, 167772160);
                                                                    if (z16) {
                                                                    }
                                                                    if (messageObject5 != null) {
                                                                    }
                                                                    keyboardInlineButton = null;
                                                                    tL_inlineButtonTypeCopy = null;
                                                                    if (keyboardInlineButton != null) {
                                                                    }
                                                                    j22 = dialogKey5.dialogId;
                                                                    if (j22 != UserObject.VERIFY) {
                                                                    }
                                                                    if (arrayList18.size() != 1) {
                                                                    }
                                                                    if (DialogObject.isEncryptedDialog(j13)) {
                                                                    }
                                                                    if (bitmap4 != null) {
                                                                    }
                                                                    if (!AndroidUtilities.needShowPasscode(false)) {
                                                                    }
                                                                    if (chat5 == null) {
                                                                    }
                                                                    user4 = user3;
                                                                    boolean z25 = z16;
                                                                    Notification notification4 = notification2;
                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                    }
                                                                    FileLog.d("showExtraNotifications: holders.add " + j13);
                                                                    int intValue = num5.intValue();
                                                                    boolean z26 = dialogKey5.story;
                                                                    notification3 = notification4;
                                                                    z16 = z25;
                                                                    notificationsController3 = notificationsController4;
                                                                    long j27 = j13;
                                                                    arrayList7 = arrayList18;
                                                                    i17 = i28;
                                                                    iVar6 = iVar11;
                                                                    1NotificationHolder r02 = notificationsController3.new 1NotificationHolder(intValue, j27, z26, j20, str12, user4, chat5, tVar2, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                                    arrayList6 = arrayList17;
                                                                    arrayList6.add(r02);
                                                                    notificationsController3.wearNotificationsIds.k(num5, j27);
                                                                    i23 = i17 + 1;
                                                                    arrayList16 = arrayList6;
                                                                    arrayList14 = arrayList7;
                                                                    z14 = z15;
                                                                    z13 = z16;
                                                                    size = i15;
                                                                    iVar9 = iVar4;
                                                                    iVar10 = iVar5;
                                                                    notificationsSettings = sharedPreferences;
                                                                    clientUserId = j14;
                                                                    b11 = notification3;
                                                                    iVar = iVar6;
                                                                }
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                        }
                                                        e0.p0 p0Var32 = p0Var2;
                                                        a0Var = (p0Var32 == null && (messageObject != null || !(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.a0(p0Var32) : new e0.a0();
                                                        i18 = Build.VERSION.SDK_INT;
                                                        if (i18 >= 28 || ((DialogObject.isChatDialog(j13) && !z19) || UserObject.isReplyUser(j13))) {
                                                            a0Var.f(format);
                                                        }
                                                        a0Var.i = Boolean.valueOf(i18 >= 28 || (!z19 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                                                        StringBuilder sb32 = new StringBuilder();
                                                        String[] strArr22 = new String[1];
                                                        j14 = j15;
                                                        boolean[] zArr22 = new boolean[1];
                                                        if (dialogKey2.story) {
                                                            ArrayList<String> arrayList26 = new ArrayList<>();
                                                            ArrayList<Object> arrayList27 = new ArrayList<>();
                                                            Pair<Integer, Boolean> parseStoryPushes = notificationsController.parseStoryPushes(arrayList26, arrayList27);
                                                            int intValue2 = ((Integer) parseStoryPushes.first).intValue();
                                                            boolean booleanValue = ((Boolean) parseStoryPushes.second).booleanValue();
                                                            if (booleanValue) {
                                                                arrayList13 = arrayList27;
                                                                z20 = booleanValue;
                                                                sb32.append(LocaleController.formatPluralString("StoryNotificationHidden", intValue2, new Object[0]));
                                                            } else {
                                                                arrayList13 = arrayList27;
                                                                z20 = booleanValue;
                                                                if (arrayList26.isEmpty()) {
                                                                    FileLog.d("showExtraNotifications: [" + j13 + "] continue; story but names is empty");
                                                                    notificationsController3 = notificationsController;
                                                                    iVar6 = iVar;
                                                                    arrayList6 = arrayList17;
                                                                    arrayList7 = arrayList18;
                                                                    i17 = i28;
                                                                    notification3 = notification2;
                                                                    i23 = i17 + 1;
                                                                    arrayList16 = arrayList6;
                                                                    arrayList14 = arrayList7;
                                                                    z14 = z15;
                                                                    z13 = z16;
                                                                    size = i15;
                                                                    iVar9 = iVar4;
                                                                    iVar10 = iVar5;
                                                                    notificationsSettings = sharedPreferences;
                                                                    clientUserId = j14;
                                                                    b11 = notification3;
                                                                    iVar = iVar6;
                                                                } else if (arrayList26.size() == 1) {
                                                                    if (intValue2 == 1) {
                                                                        sb32.append(LocaleController.getString("StoryNotificationSingle"));
                                                                    } else {
                                                                        sb32.append(LocaleController.formatPluralString("StoryNotification1", intValue2, arrayList26.get(0)));
                                                                    }
                                                                } else if (arrayList26.size() == 2) {
                                                                    sb32.append(LocaleController.formatString(R.string.StoryNotification2, arrayList26.get(0), arrayList26.get(1)));
                                                                } else if (arrayList26.size() == 3 && notificationsController.storyPushMessages.size() == 3) {
                                                                    sb32.append(LocaleController.formatString(R.string.StoryNotification3, notificationsController.cutLastName(arrayList26.get(0)), notificationsController.cutLastName(arrayList26.get(1)), notificationsController.cutLastName(arrayList26.get(2))));
                                                                } else {
                                                                    sb32.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList26.get(0)), notificationsController.cutLastName(arrayList26.get(1))));
                                                                }
                                                            }
                                                            kVar = b10;
                                                            long j28 = Long.MAX_VALUE;
                                                            int i36 = 0;
                                                            while (i36 < notificationsController.storyPushMessages.size()) {
                                                                j28 = Math.min(notificationsController.storyPushMessages.get(i36).date, j28);
                                                                i36++;
                                                                iVar = iVar;
                                                                messageObject = messageObject;
                                                            }
                                                            messageObject2 = messageObject;
                                                            iVar7 = iVar;
                                                            a0Var.i = Boolean.FALSE;
                                                            if (arrayList26.size() != 1 || z20) {
                                                                r62 = 0;
                                                                formatPluralString = LocaleController.formatPluralString(str8, intValue2, new Object[0]);
                                                            } else {
                                                                r62 = 0;
                                                                formatPluralString = arrayList26.get(0);
                                                            }
                                                            e0.p0 p0Var4 = new e0.p0();
                                                            p0Var4.a = formatPluralString;
                                                            arrayList8 = null;
                                                            p0Var4.b = null;
                                                            p0Var4.c = null;
                                                            p0Var4.d = null;
                                                            p0Var4.e = r62;
                                                            p0Var4.f = r62;
                                                            e0.z zVar = new e0.z(sb32, j28, p0Var4);
                                                            ArrayList arrayList28 = a0Var.e;
                                                            arrayList28.add(zVar);
                                                            if (arrayList28.size() > 25) {
                                                                arrayList28.remove((int) r62);
                                                            }
                                                            str11 = "currentAccount";
                                                            bitmap3 = !z20 ? loadMultipleAvatars(arrayList13) : null;
                                                            j17 = j16;
                                                            i19 = 0;
                                                            str12 = formatPluralString;
                                                        } else {
                                                            kVar = b10;
                                                            messageObject2 = messageObject;
                                                            iVar7 = iVar;
                                                            String str19 = "showExtraNotifications: [";
                                                            int size6 = arrayList21.size() - 1;
                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList29 = null;
                                                            int i37 = 0;
                                                            while (true) {
                                                                int i38 = size6;
                                                                if (i38 < 0) {
                                                                    break;
                                                                }
                                                                MessageObject messageObject8 = (MessageObject) arrayList21.get(i38);
                                                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList30 = arrayList29;
                                                                long topicId2 = MessageObject.getTopicId(notificationsController.currentAccount, messageObject8.messageOwner, notificationsController.getMessagesController().isForum(messageObject8));
                                                                if (j16 != topicId2) {
                                                                    StringBuilder t11 = a4.a.t(j13, str19, "] continue; topic id is not equal: topicId=");
                                                                    dialogKey3 = dialogKey2;
                                                                    arrayList9 = arrayList21;
                                                                    long j29 = j16;
                                                                    t11.append(j29);
                                                                    t11.append(" messageTopicId=");
                                                                    t11.append(topicId2);
                                                                    t11.append("; selfId=");
                                                                    t11.append(notificationsController.getUserConfig().getClientUserId());
                                                                    FileLog.d(t11.toString());
                                                                    str14 = str17;
                                                                    notificationsController2 = notificationsController;
                                                                    j19 = j29;
                                                                    sb2 = sb32;
                                                                    zArr = zArr22;
                                                                    i20 = i37;
                                                                } else {
                                                                    dialogKey3 = dialogKey2;
                                                                    arrayList9 = arrayList21;
                                                                    long j30 = j16;
                                                                    String shortStringForMessage = notificationsController.getShortStringForMessage(messageObject8, strArr22, zArr22);
                                                                    if (j13 == UserObject.OAUTH) {
                                                                        strArr22[0] = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                                                        i20 = i37;
                                                                    } else if (j13 != UserObject.VERIFY || messageObject8.getForwardedFromId() == null) {
                                                                        i20 = i37;
                                                                        if (j13 == j14) {
                                                                            strArr22[0] = str9;
                                                                        } else if (DialogObject.isChatDialog(j13) && messageObject8.messageOwner.from_scheduled) {
                                                                            strArr22[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                                                        }
                                                                    } else {
                                                                        i20 = i37;
                                                                        strArr22[0] = notificationsController.getMessagesController().getPeerName(messageObject8.getForwardedFromId().longValue());
                                                                    }
                                                                    if (shortStringForMessage == null) {
                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                            FileLog.w("message text is null for " + messageObject8.getId() + " did = " + messageObject8.getDialogId());
                                                                        }
                                                                        str14 = str17;
                                                                        notificationsController2 = notificationsController;
                                                                        j19 = j30;
                                                                        sb2 = sb32;
                                                                        zArr = zArr22;
                                                                    } else {
                                                                        if (sb32.length() > 0) {
                                                                            sb32.append("\n\n");
                                                                        }
                                                                        if (j13 != j14 && messageObject8.messageOwner.from_scheduled && DialogObject.isUserDialog(j13)) {
                                                                            zArr = zArr22;
                                                                            shortStringForMessage = String.format("%1$s: %2$s", LocaleController.getString(R.string.NotificationMessageScheduledName), shortStringForMessage);
                                                                            sb32.append(shortStringForMessage);
                                                                        } else {
                                                                            zArr = zArr22;
                                                                            String str20 = strArr22[0];
                                                                            if (str20 != null) {
                                                                                sb32.append(String.format("%1$s: %2$s", str20, shortStringForMessage));
                                                                            } else {
                                                                                sb32.append(shortStringForMessage);
                                                                            }
                                                                        }
                                                                        String str21 = shortStringForMessage;
                                                                        int i39 = (j13 > UserObject.VERIFY ? 1 : (j13 == UserObject.VERIFY ? 0 : -1));
                                                                        if (i39 != 0 || messageObject8.getForwardedFromId() == null) {
                                                                            if (!DialogObject.isUserDialog(j13)) {
                                                                                if (z19) {
                                                                                    j18 = -j13;
                                                                                } else if (DialogObject.isChatDialog(j13)) {
                                                                                    j18 = messageObject8.getSenderId();
                                                                                }
                                                                            }
                                                                            j18 = j13;
                                                                        } else {
                                                                            j18 = messageObject8.getForwardedFromId().longValue();
                                                                        }
                                                                        String[] strArr3 = strArr22;
                                                                        str13 = str19;
                                                                        sb2 = sb32;
                                                                        a0.i iVar12 = iVar7;
                                                                        e0.p0 p0Var5 = (e0.p0) iVar12.f(j18 + (j30 << 16));
                                                                        String str22 = strArr3[0];
                                                                        strArr = strArr3;
                                                                        if (str22 == null) {
                                                                            if (!z15) {
                                                                                p0Var = p0Var5;
                                                                            } else if (!DialogObject.isChatDialog(j13)) {
                                                                                p0Var = p0Var5;
                                                                                if (Build.VERSION.SDK_INT > 27) {
                                                                                    str22 = LocaleController.getString(R.string.NotificationHiddenName);
                                                                                }
                                                                            } else if (z19) {
                                                                                p0Var = p0Var5;
                                                                                if (Build.VERSION.SDK_INT > 27) {
                                                                                    str22 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                                                }
                                                                            } else {
                                                                                p0Var = p0Var5;
                                                                                str22 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                                                            }
                                                                            str22 = "";
                                                                        } else {
                                                                            p0Var = p0Var5;
                                                                        }
                                                                        if (p0Var == null || !TextUtils.equals(p0Var.b(), str22)) {
                                                                            e0.o0 o0Var3 = new e0.o0();
                                                                            o0Var3.a = str22;
                                                                            if (!zArr[0] || DialogObject.isEncryptedDialog(j13)) {
                                                                                str14 = str17;
                                                                            } else {
                                                                                str14 = str17;
                                                                                if (Build.VERSION.SDK_INT >= 28) {
                                                                                    if (DialogObject.isUserDialog(j13) || z19) {
                                                                                        i21 = i39;
                                                                                        j19 = j30;
                                                                                        file3 = file2;
                                                                                    } else {
                                                                                        long senderId = messageObject8.getSenderId();
                                                                                        i21 = i39;
                                                                                        j19 = j30;
                                                                                        TLRPC.User user8 = notificationsController.getMessagesController().getUser(Long.valueOf(senderId));
                                                                                        if (user8 == null && (user8 = notificationsController.getMessagesStorage().getUserSync(senderId)) != null) {
                                                                                            notificationsController.getMessagesController().putUser(user8, true);
                                                                                        }
                                                                                        file3 = (user8 == null || (userProfilePhoto3 = user8.photo) == null || (fileLocation7 = userProfilePhoto3.photo_small) == null || fileLocation7.volume_id == 0 || fileLocation7.local_id == 0) ? null : getFileLoader().getPathToAttach(user8.photo.photo_small, true);
                                                                                    }
                                                                                    if (file3 == null && i21 == 0 && messageObject8.getForwardedFromId() != null) {
                                                                                        if (j18 >= 0) {
                                                                                            TLRPC.User user9 = getMessagesController().getUser(Long.valueOf(j18));
                                                                                            if (user9 != null && (userProfilePhoto2 = user9.photo) != null && (fileLocation6 = userProfilePhoto2.photo_small) != null && fileLocation6.volume_id != 0 && fileLocation6.local_id != 0) {
                                                                                                file3 = getFileLoader().getPathToAttach(user9.photo.photo_small, true);
                                                                                            }
                                                                                        } else {
                                                                                            TLRPC.Chat chat6 = getMessagesController().getChat(Long.valueOf(-j18));
                                                                                            if (chat6 != null && (chatPhoto2 = chat6.photo) != null && (fileLocation5 = chatPhoto2.photo_small) != null && fileLocation5.volume_id != 0 && fileLocation5.local_id != 0) {
                                                                                                file3 = getFileLoader().getPathToAttach(chat6.photo.photo_small, true);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    loadRoundAvatar(j13, file3, o0Var3);
                                                                                    a2 = o0Var3.a();
                                                                                    iVar12.k(a2, j18);
                                                                                }
                                                                            }
                                                                            j19 = j30;
                                                                            a2 = o0Var3.a();
                                                                            iVar12.k(a2, j18);
                                                                        } else {
                                                                            j19 = j30;
                                                                            a2 = p0Var;
                                                                            str14 = str17;
                                                                        }
                                                                        if (DialogObject.isEncryptedDialog(j13)) {
                                                                            notificationsController2 = this;
                                                                            iVar8 = iVar12;
                                                                            e0.z zVar2 = new e0.z(str21, messageObject8.messageOwner.date * 1000, a2);
                                                                            ArrayList arrayList31 = a0Var.e;
                                                                            arrayList31.add(zVar2);
                                                                            if (arrayList31.size() > 25) {
                                                                                arrayList31.remove(0);
                                                                            }
                                                                        } else {
                                                                            if (!zArr[0] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).isLowRamDevice() || z15 || messageObject8.isSecretMedia() || !(messageObject8.type == 1 || messageObject8.isSticker())) {
                                                                                notificationsController2 = this;
                                                                                iVar8 = iVar12;
                                                                            } else {
                                                                                File pathToMessage = getFileLoader().getPathToMessage(messageObject8.messageOwner);
                                                                                if (pathToMessage.exists() && messageObject8.hasMediaSpoilers()) {
                                                                                    file5 = new File(pathToMessage.getParentFile(), pathToMessage.getName() + ".blur.jpg");
                                                                                    if (file5.exists()) {
                                                                                        notificationsController2 = this;
                                                                                        file6 = pathToMessage;
                                                                                        iVar8 = iVar12;
                                                                                    } else {
                                                                                        try {
                                                                                            Bitmap decodeFile = BitmapFactory.decodeFile(pathToMessage.getAbsolutePath());
                                                                                            Bitmap stackBlurBitmapMax = Utilities.stackBlurBitmapMax(decodeFile);
                                                                                            decodeFile.recycle();
                                                                                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(stackBlurBitmapMax, decodeFile.getWidth(), decodeFile.getHeight(), true);
                                                                                            Utilities.stackBlurBitmap(createScaledBitmap, 5);
                                                                                            stackBlurBitmapMax.recycle();
                                                                                            Canvas canvas = new Canvas(createScaledBitmap);
                                                                                            notificationsController2 = this;
                                                                                            try {
                                                                                                file6 = pathToMessage;
                                                                                            } catch (Exception e7) {
                                                                                                e = e7;
                                                                                                file6 = pathToMessage;
                                                                                                iVar8 = iVar12;
                                                                                                FileLog.e(e);
                                                                                                file4 = file6;
                                                                                                e0.z zVar3 = new e0.z(str21, messageObject8.messageOwner.date * 1000, a2);
                                                                                                String str23 = !messageObject8.isSticker() ? "image/webp" : "image/jpeg";
                                                                                                if (file4.exists()) {
                                                                                                }
                                                                                                if (d != null) {
                                                                                                }
                                                                                                e0.z zVar4 = new e0.z(str21, messageObject8.messageOwner.date * 1000, a2);
                                                                                                arrayList10 = a0Var.e;
                                                                                                arrayList10.add(zVar4);
                                                                                                if (arrayList10.size() > 25) {
                                                                                                }
                                                                                                c10 = 0;
                                                                                                if (zArr[c10]) {
                                                                                                }
                                                                                                if (j13 == 777000) {
                                                                                                }
                                                                                                id3 = i20;
                                                                                                arrayList29 = arrayList30;
                                                                                                size6 = i38 - 1;
                                                                                                i37 = id3;
                                                                                                notificationsController = notificationsController2;
                                                                                                zArr22 = zArr;
                                                                                                strArr22 = strArr;
                                                                                                arrayList21 = arrayList9;
                                                                                                dialogKey2 = dialogKey3;
                                                                                                sb32 = sb2;
                                                                                                str17 = str14;
                                                                                                str19 = str13;
                                                                                                iVar7 = iVar8;
                                                                                                j16 = j19;
                                                                                            }
                                                                                            try {
                                                                                                notificationsController2.mediaSpoilerEffect.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                                                                                                iVar8 = iVar12;
                                                                                            } catch (Exception e10) {
                                                                                                e = e10;
                                                                                                iVar8 = iVar12;
                                                                                                FileLog.e(e);
                                                                                                file4 = file6;
                                                                                                e0.z zVar32 = new e0.z(str21, messageObject8.messageOwner.date * 1000, a2);
                                                                                                String str232 = !messageObject8.isSticker() ? "image/webp" : "image/jpeg";
                                                                                                if (file4.exists()) {
                                                                                                }
                                                                                                if (d != null) {
                                                                                                }
                                                                                                e0.z zVar42 = new e0.z(str21, messageObject8.messageOwner.date * 1000, a2);
                                                                                                arrayList10 = a0Var.e;
                                                                                                arrayList10.add(zVar42);
                                                                                                if (arrayList10.size() > 25) {
                                                                                                }
                                                                                                c10 = 0;
                                                                                                if (zArr[c10]) {
                                                                                                }
                                                                                                if (j13 == 777000) {
                                                                                                }
                                                                                                id3 = i20;
                                                                                                arrayList29 = arrayList30;
                                                                                                size6 = i38 - 1;
                                                                                                i37 = id3;
                                                                                                notificationsController = notificationsController2;
                                                                                                zArr22 = zArr;
                                                                                                strArr22 = strArr;
                                                                                                arrayList21 = arrayList9;
                                                                                                dialogKey2 = dialogKey3;
                                                                                                sb32 = sb2;
                                                                                                str17 = str14;
                                                                                                str19 = str13;
                                                                                                iVar7 = iVar8;
                                                                                                j16 = j19;
                                                                                            }
                                                                                            try {
                                                                                                notificationsController2.mediaSpoilerEffect.setBounds(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                                                                                                notificationsController2.mediaSpoilerEffect.draw(canvas);
                                                                                                FileOutputStream fileOutputStream = new FileOutputStream(file5);
                                                                                                createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                                                fileOutputStream.close();
                                                                                                createScaledBitmap.recycle();
                                                                                                file4 = file5;
                                                                                            } catch (Exception e11) {
                                                                                                e = e11;
                                                                                                FileLog.e(e);
                                                                                                file4 = file6;
                                                                                                e0.z zVar322 = new e0.z(str21, messageObject8.messageOwner.date * 1000, a2);
                                                                                                String str2322 = !messageObject8.isSticker() ? "image/webp" : "image/jpeg";
                                                                                                if (file4.exists()) {
                                                                                                }
                                                                                                if (d != null) {
                                                                                                }
                                                                                                e0.z zVar422 = new e0.z(str21, messageObject8.messageOwner.date * 1000, a2);
                                                                                                arrayList10 = a0Var.e;
                                                                                                arrayList10.add(zVar422);
                                                                                                if (arrayList10.size() > 25) {
                                                                                                }
                                                                                                c10 = 0;
                                                                                                if (zArr[c10]) {
                                                                                                }
                                                                                                if (j13 == 777000) {
                                                                                                }
                                                                                                id3 = i20;
                                                                                                arrayList29 = arrayList30;
                                                                                                size6 = i38 - 1;
                                                                                                i37 = id3;
                                                                                                notificationsController = notificationsController2;
                                                                                                zArr22 = zArr;
                                                                                                strArr22 = strArr;
                                                                                                arrayList21 = arrayList9;
                                                                                                dialogKey2 = dialogKey3;
                                                                                                sb32 = sb2;
                                                                                                str17 = str14;
                                                                                                str19 = str13;
                                                                                                iVar7 = iVar8;
                                                                                                j16 = j19;
                                                                                            }
                                                                                        } catch (Exception e12) {
                                                                                            e = e12;
                                                                                            notificationsController2 = this;
                                                                                        }
                                                                                    }
                                                                                    file4 = file6;
                                                                                } else {
                                                                                    notificationsController2 = this;
                                                                                    iVar8 = iVar12;
                                                                                    file4 = pathToMessage;
                                                                                    file5 = null;
                                                                                }
                                                                                e0.z zVar3222 = new e0.z(str21, messageObject8.messageOwner.date * 1000, a2);
                                                                                String str23222 = !messageObject8.isSticker() ? "image/webp" : "image/jpeg";
                                                                                if (file4.exists()) {
                                                                                    if (notificationsController2.getFileLoader().isLoadingFile(file4.getName())) {
                                                                                        d = new Uri.Builder().scheme("content").authority(NotificationImageProvider.getAuthority()).appendPath("msg_media_raw").appendPath(notificationsController2.currentAccount + "").appendPath(file4.getName()).appendQueryParameter("final_path", file4.getAbsolutePath()).build();
                                                                                    }
                                                                                    d = null;
                                                                                } else {
                                                                                    try {
                                                                                        d = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", file4);
                                                                                    } catch (Exception e13) {
                                                                                        FileLog.e(e13);
                                                                                    }
                                                                                }
                                                                                if (d != null) {
                                                                                    zVar3222.e = str23222;
                                                                                    zVar3222.f = d;
                                                                                    ArrayList arrayList32 = a0Var.e;
                                                                                    arrayList32.add(zVar3222);
                                                                                    if (arrayList32.size() > 25) {
                                                                                        arrayList32.remove(0);
                                                                                    }
                                                                                    ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", d, 1);
                                                                                    AndroidUtilities.runOnUIThread(new wg(1, d, file5), 20000L);
                                                                                    if (!TextUtils.isEmpty(messageObject8.caption)) {
                                                                                        e0.z zVar5 = new e0.z(messageObject8.caption, messageObject8.messageOwner.date * 1000, a2);
                                                                                        ArrayList arrayList33 = a0Var.e;
                                                                                        arrayList33.add(zVar5);
                                                                                        if (arrayList33.size() > 25) {
                                                                                            arrayList33.remove(0);
                                                                                        }
                                                                                    }
                                                                                    c10 = 0;
                                                                                    if (zArr[c10] && !z15 && messageObject8.isVoice()) {
                                                                                        arrayList11 = (ArrayList) a0Var.d();
                                                                                        if (!arrayList11.isEmpty()) {
                                                                                            File pathToMessage2 = notificationsController2.getFileLoader().getPathToMessage(messageObject8.messageOwner);
                                                                                            if (pathToMessage2.exists()) {
                                                                                                if (Build.VERSION.SDK_INT >= 24) {
                                                                                                    try {
                                                                                                        uri2 = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", pathToMessage2);
                                                                                                    } catch (Exception unused2) {
                                                                                                        uri2 = null;
                                                                                                    }
                                                                                                } else {
                                                                                                    uri2 = Uri.fromFile(pathToMessage2);
                                                                                                }
                                                                                                if (uri2 != null) {
                                                                                                    e0.z zVar6 = (e0.z) i2.g.h(1, arrayList11);
                                                                                                    zVar6.e = "audio/ogg";
                                                                                                    zVar6.f = uri2;
                                                                                                }
                                                                                            } else if (messageObject8.getDocument() != null) {
                                                                                                String attachFileName = FileLoader.getAttachFileName(messageObject8.getDocument());
                                                                                                if (!notificationsController2.pendingVoiceLoads.contains(attachFileName)) {
                                                                                                    notificationsController2.pendingVoiceLoads.add(attachFileName);
                                                                                                    notificationsController2.getFileLoader().loadFile(messageObject8.getDocument(), messageObject8, 3, 0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            e0.z zVar4222 = new e0.z(str21, messageObject8.messageOwner.date * 1000, a2);
                                                                            arrayList10 = a0Var.e;
                                                                            arrayList10.add(zVar4222);
                                                                            if (arrayList10.size() > 25) {
                                                                                c10 = 0;
                                                                                arrayList10.remove(0);
                                                                                if (zArr[c10]) {
                                                                                    arrayList11 = (ArrayList) a0Var.d();
                                                                                    if (!arrayList11.isEmpty()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            c10 = 0;
                                                                            if (zArr[c10]) {
                                                                            }
                                                                        }
                                                                        if (j13 == 777000) {
                                                                            TLRPC.ReplyMarkup replyMarkup2 = messageObject8.messageOwner.reply_markup;
                                                                            if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList34 = ((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows;
                                                                                id3 = messageObject8.getId();
                                                                                arrayList29 = arrayList34;
                                                                                size6 = i38 - 1;
                                                                                i37 = id3;
                                                                                notificationsController = notificationsController2;
                                                                                zArr22 = zArr;
                                                                                strArr22 = strArr;
                                                                                arrayList21 = arrayList9;
                                                                                dialogKey2 = dialogKey3;
                                                                                sb32 = sb2;
                                                                                str17 = str14;
                                                                                str19 = str13;
                                                                                iVar7 = iVar8;
                                                                                j16 = j19;
                                                                            }
                                                                        }
                                                                        id3 = i20;
                                                                        arrayList29 = arrayList30;
                                                                        size6 = i38 - 1;
                                                                        i37 = id3;
                                                                        notificationsController = notificationsController2;
                                                                        zArr22 = zArr;
                                                                        strArr22 = strArr;
                                                                        arrayList21 = arrayList9;
                                                                        dialogKey2 = dialogKey3;
                                                                        sb32 = sb2;
                                                                        str17 = str14;
                                                                        str19 = str13;
                                                                        iVar7 = iVar8;
                                                                        j16 = j19;
                                                                    }
                                                                }
                                                                str13 = str19;
                                                                iVar8 = iVar7;
                                                                strArr = strArr22;
                                                                id3 = i20;
                                                                arrayList29 = arrayList30;
                                                                size6 = i38 - 1;
                                                                i37 = id3;
                                                                notificationsController = notificationsController2;
                                                                zArr22 = zArr;
                                                                strArr22 = strArr;
                                                                arrayList21 = arrayList9;
                                                                dialogKey2 = dialogKey3;
                                                                sb32 = sb2;
                                                                str17 = str14;
                                                                str19 = str13;
                                                                iVar7 = iVar8;
                                                                j16 = j19;
                                                            }
                                                            str11 = str17;
                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList35 = arrayList29;
                                                            j17 = j16;
                                                            str12 = str9;
                                                            bitmap3 = bitmap2;
                                                            i19 = i37;
                                                            arrayList8 = arrayList35;
                                                        }
                                                        NotificationsController notificationsController42 = notificationsController;
                                                        dialogKey4 = dialogKey2;
                                                        ArrayList arrayList232 = arrayList21;
                                                        StringBuilder sb42 = sb32;
                                                        a0.i iVar112 = iVar7;
                                                        Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                        intent22.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                        intent22.setFlags(67108864);
                                                        intent22.addCategory("android.intent.category.LAUNCHER");
                                                        messageObject3 = messageObject2;
                                                        if (messageObject2 == null && messageObject3.isOauthPush) {
                                                            intent22.putExtra("oauth_url", messageObject3.localName);
                                                        } else if (messageObject3 == null && messageObject3.isStoryReactionPush) {
                                                            intent22.putExtra("storyId", Math.abs(messageObject3.getId()));
                                                        } else if (messageObject3 == null && messageObject3.isLiveStoryPush) {
                                                            if (j13 < 0) {
                                                                intent22.putExtra("chatId", -j13);
                                                            } else if (j13 > 0) {
                                                                intent22.putExtra("userId", j13);
                                                            }
                                                            intent22.putExtra("storyId", Math.abs(messageObject3.getId()));
                                                        } else {
                                                            dialogKey5 = dialogKey4;
                                                            if (dialogKey5.story) {
                                                                long[] jArr2 = new long[notificationsController42.storyPushMessages.size()];
                                                                for (int i40 = 0; i40 < notificationsController42.storyPushMessages.size(); i40++) {
                                                                    jArr2[i40] = notificationsController42.storyPushMessages.get(i40).dialogId;
                                                                }
                                                                intent22.putExtra("storyDialogIds", jArr2);
                                                            } else if (DialogObject.isEncryptedDialog(j13)) {
                                                                intent22.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                                                            } else if (DialogObject.isUserDialog(j13)) {
                                                                intent22.putExtra("userId", j13);
                                                            } else {
                                                                intent22.putExtra("chatId", -j13);
                                                            }
                                                            j20 = j17;
                                                            i2.g.w(a4.a.t(j13, "show extra notifications chatId ", " topicId "), j20);
                                                            if (j20 != 0) {
                                                                intent22.putExtra("topicId", j20);
                                                            }
                                                            String str182 = str11;
                                                            intent22.putExtra(str182, notificationsController42.currentAccount);
                                                            PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent22, 1140850688);
                                                            e0.g0 g0Var2 = new e0.g0();
                                                            e0.k kVar42 = kVar;
                                                            if (kVar != null) {
                                                                g0Var2.a(kVar42);
                                                            }
                                                            int i352 = i19;
                                                            Intent intent32 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                            intent32.addFlags(32);
                                                            intent32.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                            intent32.putExtra("dialog_id", j13);
                                                            intent32.putExtra(str10, i34);
                                                            intent32.putExtra(str182, notificationsController42.currentAccount);
                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList242 = arrayList8;
                                                            bitmap4 = bitmap3;
                                                            e0.j jVar22 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent32, 167772160));
                                                            jVar22.g = 2;
                                                            jVar22.h = false;
                                                            e0.k b122 = jVar22.b();
                                                            if (!DialogObject.isEncryptedDialog(j13)) {
                                                                kVar2 = b122;
                                                                messageObject4 = messageObject3;
                                                                str15 = j13 != globalSecretChatId ? "tgenc" + DialogObject.getEncryptedChatId(j13) + "_" + i34 : null;
                                                            } else if (DialogObject.isUserDialog(j13)) {
                                                                kVar2 = b122;
                                                                messageObject4 = messageObject3;
                                                                str15 = "tguser" + j13 + "_" + i34;
                                                            } else {
                                                                StringBuilder sb6 = new StringBuilder("tgchat");
                                                                kVar2 = b122;
                                                                messageObject4 = messageObject3;
                                                                sb6.append(-j13);
                                                                sb6.append("_");
                                                                sb6.append(i34);
                                                                str15 = sb6.toString();
                                                            }
                                                            if (str15 == null) {
                                                                g0Var2.g = str15;
                                                                e0.g0 g0Var3 = new e0.g0();
                                                                g0Var3.g = "summary_".concat(str15);
                                                                tVar.c(g0Var3);
                                                            }
                                                            StringBuilder sb52 = new StringBuilder("tgaccount");
                                                            e0.k kVar52 = kVar2;
                                                            sb52.append(j14);
                                                            g0Var2.b(sb52.toString());
                                                            if (dialogKey5.story) {
                                                                kVar3 = kVar52;
                                                                j14 = j14;
                                                                arrayList12 = arrayList232;
                                                                j21 = ((MessageObject) arrayList12.get(0)).messageOwner.date * 1000;
                                                            } else {
                                                                j14 = j14;
                                                                j21 = Long.MAX_VALUE;
                                                                int i41 = 0;
                                                                while (i41 < notificationsController42.storyPushMessages.size()) {
                                                                    j21 = Math.min(notificationsController42.storyPushMessages.get(i41).date, j21);
                                                                    i41++;
                                                                    kVar52 = kVar52;
                                                                }
                                                                kVar3 = kVar52;
                                                                arrayList12 = arrayList232;
                                                            }
                                                            e0.t tVar22 = new e0.t(ApplicationLoader.applicationContext);
                                                            tVar22.g(str12);
                                                            ArrayList arrayList252 = arrayList12;
                                                            tVar22.E.icon = R.drawable.notification;
                                                            tVar22.f(sb42.toString());
                                                            tVar22.h(16, true);
                                                            tVar22.i = !dialogKey5.story ? notificationsController42.storyPushMessages.size() : arrayList252.size();
                                                            tVar22.w = -15618822;
                                                            tVar22.r = false;
                                                            tVar22.E.when = j21;
                                                            tVar22.k = true;
                                                            tVar22.n(a0Var);
                                                            tVar22.g = activity2;
                                                            tVar22.c(g0Var2);
                                                            tVar22.l(String.valueOf(Long.MAX_VALUE - j21));
                                                            tVar22.u = "msg";
                                                            Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                            intent42.putExtra("messageDate", i16);
                                                            intent42.putExtra("dialogId", j13);
                                                            intent42.putExtra(str182, notificationsController42.currentAccount);
                                                            if (dialogKey5.story) {
                                                                intent42.putExtra("story", true);
                                                            }
                                                            if (messageObject4 == null) {
                                                                messageObject5 = messageObject4;
                                                                try {
                                                                    if (messageObject5.isStoryReactionPush) {
                                                                        intent42.putExtra("storyReaction", true);
                                                                    }
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    FileLog.e(e);
                                                                    if (z16) {
                                                                    }
                                                                    if (messageObject5 != null) {
                                                                    }
                                                                    keyboardInlineButton = null;
                                                                    tL_inlineButtonTypeCopy = null;
                                                                    if (keyboardInlineButton != null) {
                                                                    }
                                                                    j22 = dialogKey5.dialogId;
                                                                    if (j22 != UserObject.VERIFY) {
                                                                    }
                                                                    if (arrayList18.size() != 1) {
                                                                    }
                                                                    if (DialogObject.isEncryptedDialog(j13)) {
                                                                    }
                                                                    if (bitmap4 != null) {
                                                                    }
                                                                    if (!AndroidUtilities.needShowPasscode(false)) {
                                                                    }
                                                                    if (chat5 == null) {
                                                                    }
                                                                    user4 = user3;
                                                                    boolean z252 = z16;
                                                                    Notification notification42 = notification2;
                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                    }
                                                                    FileLog.d("showExtraNotifications: holders.add " + j13);
                                                                    int intValue3 = num5.intValue();
                                                                    boolean z262 = dialogKey5.story;
                                                                    notification3 = notification42;
                                                                    z16 = z252;
                                                                    notificationsController3 = notificationsController42;
                                                                    long j272 = j13;
                                                                    arrayList7 = arrayList18;
                                                                    i17 = i28;
                                                                    iVar6 = iVar112;
                                                                    1NotificationHolder r022 = notificationsController3.new 1NotificationHolder(intValue3, j272, z262, j20, str12, user4, chat5, tVar22, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                                    arrayList6 = arrayList17;
                                                                    arrayList6.add(r022);
                                                                    notificationsController3.wearNotificationsIds.k(num5, j272);
                                                                    i23 = i17 + 1;
                                                                    arrayList16 = arrayList6;
                                                                    arrayList14 = arrayList7;
                                                                    z14 = z15;
                                                                    z13 = z16;
                                                                    size = i15;
                                                                    iVar9 = iVar4;
                                                                    iVar10 = iVar5;
                                                                    notificationsSettings = sharedPreferences;
                                                                    clientUserId = j14;
                                                                    b11 = notification3;
                                                                    iVar = iVar6;
                                                                }
                                                            } else {
                                                                messageObject5 = messageObject4;
                                                            }
                                                            tVar22.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent42, 167772160);
                                                            if (z16) {
                                                                tVar22.q = notificationsController42.notificationGroup;
                                                                tVar22.i();
                                                            }
                                                            if (messageObject5 != null && (message = messageObject5.messageOwner) != null) {
                                                                replyMarkup = message.reply_markup;
                                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                    TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                                                    tL_inlineButtonTypeCopy = null;
                                                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = null;
                                                                    for (int i42 = 0; i42 < tL_replyInlineMarkup.rows.size(); i42++) {
                                                                        int i43 = 0;
                                                                        while (true) {
                                                                            if (i43 >= tL_replyInlineMarkup.rows.get(i42).buttons.size()) {
                                                                                break;
                                                                            }
                                                                            TL_keyboard.KeyboardInlineButton keyboardInlineButton3 = tL_replyInlineMarkup.rows.get(i42).buttons.get(i43);
                                                                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardInlineButton3, TL_keyboard.TL_inlineButtonTypeCopy.class);
                                                                            if (tL_inlineButtonTypeCopy2 != null) {
                                                                                keyboardInlineButton2 = keyboardInlineButton3;
                                                                                tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                                                break;
                                                                            } else {
                                                                                i43++;
                                                                                tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                                            }
                                                                        }
                                                                        if (keyboardInlineButton2 != null) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    keyboardInlineButton = keyboardInlineButton2;
                                                                    if (keyboardInlineButton != null) {
                                                                        Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                                                                        intent5.addFlags(32);
                                                                        intent5.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                                                                        intent5.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                                                                        e0.j jVar3 = new e0.j(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent5, 167772160));
                                                                        jVar3.h = false;
                                                                        tVar22.b.add(jVar3.b());
                                                                    }
                                                                    j22 = dialogKey5.dialogId;
                                                                    if (j22 != UserObject.VERIFY && j22 != UserObject.OAUTH) {
                                                                        if (kVar42 != null) {
                                                                            tVar22.b.add(kVar42);
                                                                        }
                                                                        if (!z15 && !dialogKey5.story && (messageObject5 == null || !messageObject5.isStoryReactionPush)) {
                                                                            tVar22.b.add(kVar3);
                                                                        }
                                                                    }
                                                                    if (arrayList18.size() != 1 && !TextUtils.isEmpty(str) && !dialogKey5.story) {
                                                                        tVar22.o(str);
                                                                    }
                                                                    if (DialogObject.isEncryptedDialog(j13)) {
                                                                        tVar22.k();
                                                                    }
                                                                    if (bitmap4 != null) {
                                                                        tVar22.j(bitmap4);
                                                                    }
                                                                    if (!AndroidUtilities.needShowPasscode(false) && !SharedConfig.isWaitingForPasscodeEnter && arrayList242 != null) {
                                                                        size3 = arrayList242.size();
                                                                        i22 = 0;
                                                                        while (i22 < size3) {
                                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList36 = arrayList242;
                                                                            TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList36.get(i22);
                                                                            int size7 = keyboardInlineButtonRow2.buttons.size();
                                                                            int i44 = 0;
                                                                            while (i44 < size7) {
                                                                                TL_keyboard.KeyboardInlineButton keyboardInlineButton4 = keyboardInlineButtonRow2.buttons.get(i44);
                                                                                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) zf.c.a(keyboardInlineButton4, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                                int i45 = size3;
                                                                                if (tL_inlineButtonTypeCallback != null) {
                                                                                    keyboardInlineButtonRow = keyboardInlineButtonRow2;
                                                                                    Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                                    intent6.putExtra(str182, notificationsController42.currentAccount);
                                                                                    intent6.putExtra("did", j13);
                                                                                    byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                                    if (bArr != null) {
                                                                                        intent6.putExtra("data", bArr);
                                                                                    }
                                                                                    intent6.putExtra("mid", i352);
                                                                                    String str24 = keyboardInlineButton4.text;
                                                                                    Context context = ApplicationLoader.applicationContext;
                                                                                    int i46 = notificationsController42.lastButtonId;
                                                                                    notificationsController42.lastButtonId = i46 + 1;
                                                                                    tVar22.a(0, str24, PendingIntent.getBroadcast(context, i46, intent6, 167772160));
                                                                                } else {
                                                                                    keyboardInlineButtonRow = keyboardInlineButtonRow2;
                                                                                }
                                                                                i44++;
                                                                                size3 = i45;
                                                                                keyboardInlineButtonRow2 = keyboardInlineButtonRow;
                                                                            }
                                                                            i22++;
                                                                            arrayList242 = arrayList36;
                                                                        }
                                                                    }
                                                                    if (chat5 == null || user3 == null) {
                                                                        user4 = user3;
                                                                    } else {
                                                                        user4 = user3;
                                                                        String str25 = user4.phone;
                                                                        if (str25 != null && str25.length() > 0) {
                                                                            String str26 = "tel:+" + user4.phone;
                                                                            if (str26 != null && !str26.isEmpty()) {
                                                                                tVar22.F.add(str26);
                                                                            }
                                                                        }
                                                                    }
                                                                    boolean z2522 = z16;
                                                                    Notification notification422 = notification2;
                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                        notificationsController42.setNotificationChannel(notification422, tVar22, z2522);
                                                                    }
                                                                    FileLog.d("showExtraNotifications: holders.add " + j13);
                                                                    int intValue32 = num5.intValue();
                                                                    boolean z2622 = dialogKey5.story;
                                                                    notification3 = notification422;
                                                                    z16 = z2522;
                                                                    notificationsController3 = notificationsController42;
                                                                    long j2722 = j13;
                                                                    arrayList7 = arrayList18;
                                                                    i17 = i28;
                                                                    iVar6 = iVar112;
                                                                    1NotificationHolder r0222 = notificationsController3.new 1NotificationHolder(intValue32, j2722, z2622, j20, str12, user4, chat5, tVar22, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                                    arrayList6 = arrayList17;
                                                                    arrayList6.add(r0222);
                                                                    notificationsController3.wearNotificationsIds.k(num5, j2722);
                                                                    i23 = i17 + 1;
                                                                    arrayList16 = arrayList6;
                                                                    arrayList14 = arrayList7;
                                                                    z14 = z15;
                                                                    z13 = z16;
                                                                    size = i15;
                                                                    iVar9 = iVar4;
                                                                    iVar10 = iVar5;
                                                                    notificationsSettings = sharedPreferences;
                                                                    clientUserId = j14;
                                                                    b11 = notification3;
                                                                    iVar = iVar6;
                                                                }
                                                            }
                                                            keyboardInlineButton = null;
                                                            tL_inlineButtonTypeCopy = null;
                                                            if (keyboardInlineButton != null) {
                                                            }
                                                            j22 = dialogKey5.dialogId;
                                                            if (j22 != UserObject.VERIFY) {
                                                                if (kVar42 != null) {
                                                                }
                                                                if (!z15) {
                                                                    tVar22.b.add(kVar3);
                                                                }
                                                            }
                                                            if (arrayList18.size() != 1) {
                                                            }
                                                            if (DialogObject.isEncryptedDialog(j13)) {
                                                            }
                                                            if (bitmap4 != null) {
                                                            }
                                                            if (!AndroidUtilities.needShowPasscode(false)) {
                                                                size3 = arrayList242.size();
                                                                i22 = 0;
                                                                while (i22 < size3) {
                                                                }
                                                            }
                                                            if (chat5 == null) {
                                                            }
                                                            user4 = user3;
                                                            boolean z25222 = z16;
                                                            Notification notification4222 = notification2;
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                            }
                                                            FileLog.d("showExtraNotifications: holders.add " + j13);
                                                            int intValue322 = num5.intValue();
                                                            boolean z26222 = dialogKey5.story;
                                                            notification3 = notification4222;
                                                            z16 = z25222;
                                                            notificationsController3 = notificationsController42;
                                                            long j27222 = j13;
                                                            arrayList7 = arrayList18;
                                                            i17 = i28;
                                                            iVar6 = iVar112;
                                                            1NotificationHolder r02222 = notificationsController3.new 1NotificationHolder(intValue322, j27222, z26222, j20, str12, user4, chat5, tVar22, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                            arrayList6 = arrayList17;
                                                            arrayList6.add(r02222);
                                                            notificationsController3.wearNotificationsIds.k(num5, j27222);
                                                            i23 = i17 + 1;
                                                            arrayList16 = arrayList6;
                                                            arrayList14 = arrayList7;
                                                            z14 = z15;
                                                            z13 = z16;
                                                            size = i15;
                                                            iVar9 = iVar4;
                                                            iVar10 = iVar5;
                                                            notificationsSettings = sharedPreferences;
                                                            clientUserId = j14;
                                                            b11 = notification3;
                                                            iVar = iVar6;
                                                        }
                                                        dialogKey5 = dialogKey4;
                                                        j20 = j17;
                                                        i2.g.w(a4.a.t(j13, "show extra notifications chatId ", " topicId "), j20);
                                                        if (j20 != 0) {
                                                        }
                                                        String str1822 = str11;
                                                        intent22.putExtra(str1822, notificationsController42.currentAccount);
                                                        PendingIntent activity22 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent22, 1140850688);
                                                        e0.g0 g0Var22 = new e0.g0();
                                                        e0.k kVar422 = kVar;
                                                        if (kVar != null) {
                                                        }
                                                        int i3522 = i19;
                                                        Intent intent322 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                        intent322.addFlags(32);
                                                        intent322.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                        intent322.putExtra("dialog_id", j13);
                                                        intent322.putExtra(str10, i34);
                                                        intent322.putExtra(str1822, notificationsController42.currentAccount);
                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList2422 = arrayList8;
                                                        bitmap4 = bitmap3;
                                                        e0.j jVar222 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent322, 167772160));
                                                        jVar222.g = 2;
                                                        jVar222.h = false;
                                                        e0.k b1222 = jVar222.b();
                                                        if (!DialogObject.isEncryptedDialog(j13)) {
                                                        }
                                                        if (str15 == null) {
                                                        }
                                                        StringBuilder sb522 = new StringBuilder("tgaccount");
                                                        e0.k kVar522 = kVar2;
                                                        sb522.append(j14);
                                                        g0Var22.b(sb522.toString());
                                                        if (dialogKey5.story) {
                                                        }
                                                        e0.t tVar222 = new e0.t(ApplicationLoader.applicationContext);
                                                        tVar222.g(str12);
                                                        ArrayList arrayList2522 = arrayList12;
                                                        tVar222.E.icon = R.drawable.notification;
                                                        tVar222.f(sb42.toString());
                                                        tVar222.h(16, true);
                                                        tVar222.i = !dialogKey5.story ? notificationsController42.storyPushMessages.size() : arrayList2522.size();
                                                        tVar222.w = -15618822;
                                                        tVar222.r = false;
                                                        tVar222.E.when = j21;
                                                        tVar222.k = true;
                                                        tVar222.n(a0Var);
                                                        tVar222.g = activity22;
                                                        tVar222.c(g0Var22);
                                                        tVar222.l(String.valueOf(Long.MAX_VALUE - j21));
                                                        tVar222.u = "msg";
                                                        Intent intent422 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                        intent422.putExtra("messageDate", i16);
                                                        intent422.putExtra("dialogId", j13);
                                                        intent422.putExtra(str1822, notificationsController42.currentAccount);
                                                        if (dialogKey5.story) {
                                                        }
                                                        if (messageObject4 == null) {
                                                        }
                                                        tVar222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent422, 167772160);
                                                        if (z16) {
                                                        }
                                                        if (messageObject5 != null) {
                                                            replyMarkup = message.reply_markup;
                                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                            }
                                                        }
                                                        keyboardInlineButton = null;
                                                        tL_inlineButtonTypeCopy = null;
                                                        if (keyboardInlineButton != null) {
                                                        }
                                                        j22 = dialogKey5.dialogId;
                                                        if (j22 != UserObject.VERIFY) {
                                                        }
                                                        if (arrayList18.size() != 1) {
                                                        }
                                                        if (DialogObject.isEncryptedDialog(j13)) {
                                                        }
                                                        if (bitmap4 != null) {
                                                        }
                                                        if (!AndroidUtilities.needShowPasscode(false)) {
                                                        }
                                                        if (chat5 == null) {
                                                        }
                                                        user4 = user3;
                                                        boolean z252222 = z16;
                                                        Notification notification42222 = notification2;
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                        }
                                                        FileLog.d("showExtraNotifications: holders.add " + j13);
                                                        int intValue3222 = num5.intValue();
                                                        boolean z262222 = dialogKey5.story;
                                                        notification3 = notification42222;
                                                        z16 = z252222;
                                                        notificationsController3 = notificationsController42;
                                                        long j272222 = j13;
                                                        arrayList7 = arrayList18;
                                                        i17 = i28;
                                                        iVar6 = iVar112;
                                                        1NotificationHolder r022222 = notificationsController3.new 1NotificationHolder(intValue3222, j272222, z262222, j20, str12, user4, chat5, tVar222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                        arrayList6 = arrayList17;
                                                        arrayList6.add(r022222);
                                                        notificationsController3.wearNotificationsIds.k(num5, j272222);
                                                        i23 = i17 + 1;
                                                        arrayList16 = arrayList6;
                                                        arrayList14 = arrayList7;
                                                        z14 = z15;
                                                        z13 = z16;
                                                        size = i15;
                                                        iVar9 = iVar4;
                                                        iVar10 = iVar5;
                                                        notificationsSettings = sharedPreferences;
                                                        clientUserId = j14;
                                                        b11 = notification3;
                                                        iVar = iVar6;
                                                    }
                                                }
                                            }
                                            j16 = j12;
                                            e0.p0 p0Var322 = p0Var2;
                                            if (p0Var322 == null) {
                                            }
                                            i18 = Build.VERSION.SDK_INT;
                                            if (i18 >= 28) {
                                            }
                                            a0Var.f(format);
                                            a0Var.i = Boolean.valueOf(i18 >= 28 || (!z19 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                                            StringBuilder sb322 = new StringBuilder();
                                            String[] strArr222 = new String[1];
                                            j14 = j15;
                                            boolean[] zArr222 = new boolean[1];
                                            if (dialogKey2.story) {
                                            }
                                            NotificationsController notificationsController422 = notificationsController;
                                            dialogKey4 = dialogKey2;
                                            ArrayList arrayList2322 = arrayList21;
                                            StringBuilder sb422 = sb322;
                                            a0.i iVar1122 = iVar7;
                                            Intent intent222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                            intent222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent222.setFlags(67108864);
                                            intent222.addCategory("android.intent.category.LAUNCHER");
                                            messageObject3 = messageObject2;
                                            if (messageObject2 == null) {
                                            }
                                            if (messageObject3 == null) {
                                            }
                                            if (messageObject3 == null) {
                                            }
                                            dialogKey5 = dialogKey4;
                                            if (dialogKey5.story) {
                                            }
                                            j20 = j17;
                                            i2.g.w(a4.a.t(j13, "show extra notifications chatId ", " topicId "), j20);
                                            if (j20 != 0) {
                                            }
                                            String str18222 = str11;
                                            intent222.putExtra(str18222, notificationsController422.currentAccount);
                                            PendingIntent activity222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent222, 1140850688);
                                            e0.g0 g0Var222 = new e0.g0();
                                            e0.k kVar4222 = kVar;
                                            if (kVar != null) {
                                            }
                                            int i35222 = i19;
                                            Intent intent3222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                            intent3222.addFlags(32);
                                            intent3222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                            intent3222.putExtra("dialog_id", j13);
                                            intent3222.putExtra(str10, i34);
                                            intent3222.putExtra(str18222, notificationsController422.currentAccount);
                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList24222 = arrayList8;
                                            bitmap4 = bitmap3;
                                            e0.j jVar2222 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent3222, 167772160));
                                            jVar2222.g = 2;
                                            jVar2222.h = false;
                                            e0.k b12222 = jVar2222.b();
                                            if (!DialogObject.isEncryptedDialog(j13)) {
                                            }
                                            if (str15 == null) {
                                            }
                                            StringBuilder sb5222 = new StringBuilder("tgaccount");
                                            e0.k kVar5222 = kVar2;
                                            sb5222.append(j14);
                                            g0Var222.b(sb5222.toString());
                                            if (dialogKey5.story) {
                                            }
                                            e0.t tVar2222 = new e0.t(ApplicationLoader.applicationContext);
                                            tVar2222.g(str12);
                                            ArrayList arrayList25222 = arrayList12;
                                            tVar2222.E.icon = R.drawable.notification;
                                            tVar2222.f(sb422.toString());
                                            tVar2222.h(16, true);
                                            tVar2222.i = !dialogKey5.story ? notificationsController422.storyPushMessages.size() : arrayList25222.size();
                                            tVar2222.w = -15618822;
                                            tVar2222.r = false;
                                            tVar2222.E.when = j21;
                                            tVar2222.k = true;
                                            tVar2222.n(a0Var);
                                            tVar2222.g = activity222;
                                            tVar2222.c(g0Var222);
                                            tVar2222.l(String.valueOf(Long.MAX_VALUE - j21));
                                            tVar2222.u = "msg";
                                            Intent intent4222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                            intent4222.putExtra("messageDate", i16);
                                            intent4222.putExtra("dialogId", j13);
                                            intent4222.putExtra(str18222, notificationsController422.currentAccount);
                                            if (dialogKey5.story) {
                                            }
                                            if (messageObject4 == null) {
                                            }
                                            tVar2222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent4222, 167772160);
                                            if (z16) {
                                            }
                                            if (messageObject5 != null) {
                                            }
                                            keyboardInlineButton = null;
                                            tL_inlineButtonTypeCopy = null;
                                            if (keyboardInlineButton != null) {
                                            }
                                            j22 = dialogKey5.dialogId;
                                            if (j22 != UserObject.VERIFY) {
                                            }
                                            if (arrayList18.size() != 1) {
                                            }
                                            if (DialogObject.isEncryptedDialog(j13)) {
                                            }
                                            if (bitmap4 != null) {
                                            }
                                            if (!AndroidUtilities.needShowPasscode(false)) {
                                            }
                                            if (chat5 == null) {
                                            }
                                            user4 = user3;
                                            boolean z2522222 = z16;
                                            Notification notification422222 = notification2;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                            }
                                            FileLog.d("showExtraNotifications: holders.add " + j13);
                                            int intValue32222 = num5.intValue();
                                            boolean z2622222 = dialogKey5.story;
                                            notification3 = notification422222;
                                            z16 = z2522222;
                                            notificationsController3 = notificationsController422;
                                            long j2722222 = j13;
                                            arrayList7 = arrayList18;
                                            i17 = i28;
                                            iVar6 = iVar1122;
                                            1NotificationHolder r0222222 = notificationsController3.new 1NotificationHolder(intValue32222, j2722222, z2622222, j20, str12, user4, chat5, tVar2222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                            arrayList6 = arrayList17;
                                            arrayList6.add(r0222222);
                                            notificationsController3.wearNotificationsIds.k(num5, j2722222);
                                            i23 = i17 + 1;
                                            arrayList16 = arrayList6;
                                            arrayList14 = arrayList7;
                                            z14 = z15;
                                            z13 = z16;
                                            size = i15;
                                            iVar9 = iVar4;
                                            iVar10 = iVar5;
                                            notificationsSettings = sharedPreferences;
                                            clientUserId = j14;
                                            b11 = notification3;
                                            iVar = iVar6;
                                        }
                                    }
                                    str10 = "max_id";
                                    PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent, 167772160);
                                    e0.r0 r0Var2 = new e0.r0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                                    e0.j jVar4 = new e0.j(R.drawable.ic_reply_icon, !DialogObject.isChatDialog(j13) ? LocaleController.formatString(R.string.ReplyToGroup, str9) : LocaleController.formatString(R.string.ReplyToUser, str9), broadcast2);
                                    jVar4.c();
                                    jVar4.g = 1;
                                    jVar4.a(r0Var2);
                                    jVar4.h = false;
                                    b10 = jVar4.b();
                                    num2 = (Integer) notificationsController.pushDialogs.f(j13);
                                    if (num2 == null) {
                                    }
                                    dialogKey2 = dialogKey;
                                    if (dialogKey2.story) {
                                    }
                                    if (size5 > 1) {
                                    }
                                    j15 = j11;
                                    e0.p0 p0Var22 = (e0.p0) iVar.f(j15);
                                    int i342 = id2;
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        user5 = notificationsController.getMessagesController().getUser(Long.valueOf(j15));
                                        if (user5 == null) {
                                        }
                                        if (user5 != null) {
                                        }
                                    }
                                    j16 = j12;
                                    e0.p0 p0Var3222 = p0Var22;
                                    if (p0Var3222 == null) {
                                    }
                                    i18 = Build.VERSION.SDK_INT;
                                    if (i18 >= 28) {
                                    }
                                    a0Var.f(format);
                                    a0Var.i = Boolean.valueOf(i18 >= 28 || (!z19 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                                    StringBuilder sb3222 = new StringBuilder();
                                    String[] strArr2222 = new String[1];
                                    j14 = j15;
                                    boolean[] zArr2222 = new boolean[1];
                                    if (dialogKey2.story) {
                                    }
                                    NotificationsController notificationsController4222 = notificationsController;
                                    dialogKey4 = dialogKey2;
                                    ArrayList arrayList23222 = arrayList21;
                                    StringBuilder sb4222 = sb3222;
                                    a0.i iVar11222 = iVar7;
                                    Intent intent2222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                    intent2222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    intent2222.setFlags(67108864);
                                    intent2222.addCategory("android.intent.category.LAUNCHER");
                                    messageObject3 = messageObject2;
                                    if (messageObject2 == null) {
                                    }
                                    if (messageObject3 == null) {
                                    }
                                    if (messageObject3 == null) {
                                    }
                                    dialogKey5 = dialogKey4;
                                    if (dialogKey5.story) {
                                    }
                                    j20 = j17;
                                    i2.g.w(a4.a.t(j13, "show extra notifications chatId ", " topicId "), j20);
                                    if (j20 != 0) {
                                    }
                                    String str182222 = str11;
                                    intent2222.putExtra(str182222, notificationsController4222.currentAccount);
                                    PendingIntent activity2222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2222, 1140850688);
                                    e0.g0 g0Var2222 = new e0.g0();
                                    e0.k kVar42222 = kVar;
                                    if (kVar != null) {
                                    }
                                    int i352222 = i19;
                                    Intent intent32222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                    intent32222.addFlags(32);
                                    intent32222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                    intent32222.putExtra("dialog_id", j13);
                                    intent32222.putExtra(str10, i342);
                                    intent32222.putExtra(str182222, notificationsController4222.currentAccount);
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList242222 = arrayList8;
                                    bitmap4 = bitmap3;
                                    e0.j jVar22222 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent32222, 167772160));
                                    jVar22222.g = 2;
                                    jVar22222.h = false;
                                    e0.k b122222 = jVar22222.b();
                                    if (!DialogObject.isEncryptedDialog(j13)) {
                                    }
                                    if (str15 == null) {
                                    }
                                    StringBuilder sb52222 = new StringBuilder("tgaccount");
                                    e0.k kVar52222 = kVar2;
                                    sb52222.append(j14);
                                    g0Var2222.b(sb52222.toString());
                                    if (dialogKey5.story) {
                                    }
                                    e0.t tVar22222 = new e0.t(ApplicationLoader.applicationContext);
                                    tVar22222.g(str12);
                                    ArrayList arrayList252222 = arrayList12;
                                    tVar22222.E.icon = R.drawable.notification;
                                    tVar22222.f(sb4222.toString());
                                    tVar22222.h(16, true);
                                    tVar22222.i = !dialogKey5.story ? notificationsController4222.storyPushMessages.size() : arrayList252222.size();
                                    tVar22222.w = -15618822;
                                    tVar22222.r = false;
                                    tVar22222.E.when = j21;
                                    tVar22222.k = true;
                                    tVar22222.n(a0Var);
                                    tVar22222.g = activity2222;
                                    tVar22222.c(g0Var2222);
                                    tVar22222.l(String.valueOf(Long.MAX_VALUE - j21));
                                    tVar22222.u = "msg";
                                    Intent intent42222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                    intent42222.putExtra("messageDate", i16);
                                    intent42222.putExtra("dialogId", j13);
                                    intent42222.putExtra(str182222, notificationsController4222.currentAccount);
                                    if (dialogKey5.story) {
                                    }
                                    if (messageObject4 == null) {
                                    }
                                    tVar22222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent42222, 167772160);
                                    if (z16) {
                                    }
                                    if (messageObject5 != null) {
                                    }
                                    keyboardInlineButton = null;
                                    tL_inlineButtonTypeCopy = null;
                                    if (keyboardInlineButton != null) {
                                    }
                                    j22 = dialogKey5.dialogId;
                                    if (j22 != UserObject.VERIFY) {
                                    }
                                    if (arrayList18.size() != 1) {
                                    }
                                    if (DialogObject.isEncryptedDialog(j13)) {
                                    }
                                    if (bitmap4 != null) {
                                    }
                                    if (!AndroidUtilities.needShowPasscode(false)) {
                                    }
                                    if (chat5 == null) {
                                    }
                                    user4 = user3;
                                    boolean z25222222 = z16;
                                    Notification notification4222222 = notification2;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                    }
                                    FileLog.d("showExtraNotifications: holders.add " + j13);
                                    int intValue322222 = num5.intValue();
                                    boolean z26222222 = dialogKey5.story;
                                    notification3 = notification4222222;
                                    z16 = z25222222;
                                    notificationsController3 = notificationsController4222;
                                    long j27222222 = j13;
                                    arrayList7 = arrayList18;
                                    i17 = i28;
                                    iVar6 = iVar11222;
                                    1NotificationHolder r02222222 = notificationsController3.new 1NotificationHolder(intValue322222, j27222222, z26222222, j20, str12, user4, chat5, tVar22222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                    arrayList6 = arrayList17;
                                    arrayList6.add(r02222222);
                                    notificationsController3.wearNotificationsIds.k(num5, j27222222);
                                    i23 = i17 + 1;
                                    arrayList16 = arrayList6;
                                    arrayList14 = arrayList7;
                                    z14 = z15;
                                    z13 = z16;
                                    size = i15;
                                    iVar9 = iVar4;
                                    iVar10 = iVar5;
                                    notificationsSettings = sharedPreferences;
                                    clientUserId = j14;
                                    b11 = notification3;
                                    iVar = iVar6;
                                } else {
                                    file2 = file;
                                    user3 = user2;
                                    str10 = "max_id";
                                    bitmap2 = bitmap;
                                }
                            }
                            b10 = null;
                            num2 = (Integer) notificationsController.pushDialogs.f(j13);
                            if (num2 == null) {
                            }
                            dialogKey2 = dialogKey;
                            if (dialogKey2.story) {
                            }
                            if (size5 > 1) {
                            }
                            j15 = j11;
                            e0.p0 p0Var222 = (e0.p0) iVar.f(j15);
                            int i3422 = id2;
                            if (Build.VERSION.SDK_INT >= 28) {
                            }
                            j16 = j12;
                            e0.p0 p0Var32222 = p0Var222;
                            if (p0Var32222 == null) {
                            }
                            i18 = Build.VERSION.SDK_INT;
                            if (i18 >= 28) {
                            }
                            a0Var.f(format);
                            a0Var.i = Boolean.valueOf(i18 >= 28 || (!z19 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                            StringBuilder sb32222 = new StringBuilder();
                            String[] strArr22222 = new String[1];
                            j14 = j15;
                            boolean[] zArr22222 = new boolean[1];
                            if (dialogKey2.story) {
                            }
                            NotificationsController notificationsController42222 = notificationsController;
                            dialogKey4 = dialogKey2;
                            ArrayList arrayList232222 = arrayList21;
                            StringBuilder sb42222 = sb32222;
                            a0.i iVar112222 = iVar7;
                            Intent intent22222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                            intent22222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                            intent22222.setFlags(67108864);
                            intent22222.addCategory("android.intent.category.LAUNCHER");
                            messageObject3 = messageObject2;
                            if (messageObject2 == null) {
                            }
                            if (messageObject3 == null) {
                            }
                            if (messageObject3 == null) {
                            }
                            dialogKey5 = dialogKey4;
                            if (dialogKey5.story) {
                            }
                            j20 = j17;
                            i2.g.w(a4.a.t(j13, "show extra notifications chatId ", " topicId "), j20);
                            if (j20 != 0) {
                            }
                            String str1822222 = str11;
                            intent22222.putExtra(str1822222, notificationsController42222.currentAccount);
                            PendingIntent activity22222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent22222, 1140850688);
                            e0.g0 g0Var22222 = new e0.g0();
                            e0.k kVar422222 = kVar;
                            if (kVar != null) {
                            }
                            int i3522222 = i19;
                            Intent intent322222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                            intent322222.addFlags(32);
                            intent322222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                            intent322222.putExtra("dialog_id", j13);
                            intent322222.putExtra(str10, i3422);
                            intent322222.putExtra(str1822222, notificationsController42222.currentAccount);
                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList2422222 = arrayList8;
                            bitmap4 = bitmap3;
                            e0.j jVar222222 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent322222, 167772160));
                            jVar222222.g = 2;
                            jVar222222.h = false;
                            e0.k b1222222 = jVar222222.b();
                            if (!DialogObject.isEncryptedDialog(j13)) {
                            }
                            if (str15 == null) {
                            }
                            StringBuilder sb522222 = new StringBuilder("tgaccount");
                            e0.k kVar522222 = kVar2;
                            sb522222.append(j14);
                            g0Var22222.b(sb522222.toString());
                            if (dialogKey5.story) {
                            }
                            e0.t tVar222222 = new e0.t(ApplicationLoader.applicationContext);
                            tVar222222.g(str12);
                            ArrayList arrayList2522222 = arrayList12;
                            tVar222222.E.icon = R.drawable.notification;
                            tVar222222.f(sb42222.toString());
                            tVar222222.h(16, true);
                            tVar222222.i = !dialogKey5.story ? notificationsController42222.storyPushMessages.size() : arrayList2522222.size();
                            tVar222222.w = -15618822;
                            tVar222222.r = false;
                            tVar222222.E.when = j21;
                            tVar222222.k = true;
                            tVar222222.n(a0Var);
                            tVar222222.g = activity22222;
                            tVar222222.c(g0Var22222);
                            tVar222222.l(String.valueOf(Long.MAX_VALUE - j21));
                            tVar222222.u = "msg";
                            Intent intent422222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent422222.putExtra("messageDate", i16);
                            intent422222.putExtra("dialogId", j13);
                            intent422222.putExtra(str1822222, notificationsController42222.currentAccount);
                            if (dialogKey5.story) {
                            }
                            if (messageObject4 == null) {
                            }
                            tVar222222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num5.intValue(), intent422222, 167772160);
                            if (z16) {
                            }
                            if (messageObject5 != null) {
                            }
                            keyboardInlineButton = null;
                            tL_inlineButtonTypeCopy = null;
                            if (keyboardInlineButton != null) {
                            }
                            j22 = dialogKey5.dialogId;
                            if (j22 != UserObject.VERIFY) {
                            }
                            if (arrayList18.size() != 1) {
                            }
                            if (DialogObject.isEncryptedDialog(j13)) {
                            }
                            if (bitmap4 != null) {
                            }
                            if (!AndroidUtilities.needShowPasscode(false)) {
                            }
                            if (chat5 == null) {
                            }
                            user4 = user3;
                            boolean z252222222 = z16;
                            Notification notification42222222 = notification2;
                            if (Build.VERSION.SDK_INT >= 26) {
                            }
                            FileLog.d("showExtraNotifications: holders.add " + j13);
                            int intValue3222222 = num5.intValue();
                            boolean z262222222 = dialogKey5.story;
                            notification3 = notification42222222;
                            z16 = z252222222;
                            notificationsController3 = notificationsController42222;
                            long j272222222 = j13;
                            arrayList7 = arrayList18;
                            i17 = i28;
                            iVar6 = iVar112222;
                            1NotificationHolder r022222222 = notificationsController3.new 1NotificationHolder(intValue3222222, j272222222, z262222222, j20, str12, user4, chat5, tVar222222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                            arrayList6 = arrayList17;
                            arrayList6.add(r022222222);
                            notificationsController3.wearNotificationsIds.k(num5, j272222222);
                            i23 = i17 + 1;
                            arrayList16 = arrayList6;
                            arrayList14 = arrayList7;
                            z14 = z15;
                            z13 = z16;
                            size = i15;
                            iVar9 = iVar4;
                            iVar10 = iVar5;
                            notificationsSettings = sharedPreferences;
                            clientUserId = j14;
                            b11 = notification3;
                            iVar = iVar6;
                        } else {
                            str8 = str3;
                        }
                        file = pathToAttach;
                    } else {
                        sharedPreferences = notificationsSettings;
                        str8 = str3;
                        file = null;
                    }
                    bitmap = null;
                    if (chat != null) {
                    }
                    TLRPC.Chat chat52 = chat;
                    String str172 = "currentAccount";
                    if (z19) {
                    }
                    str9 = string;
                    notificationsController = this;
                    if (MessagesController.getInstance(notificationsController.currentAccount).getSendPaidMessagesStars(j13) > 0) {
                    }
                }
                iVar2 = iVar10;
                a0.i iVar13 = iVar;
                if (z13) {
                    arrayList2 = arrayList;
                    if (notificationsController3.openedInBubbleDialogs.isEmpty()) {
                        if (BuildVars.LOGS_ENABLED) {
                            i2.g.o(notificationsController3.notificationId, new StringBuilder("cancel summary with id "));
                        }
                        notificationManager.b(notificationsController3.notificationId);
                    }
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        i2.g.o(notificationsController3.notificationId, new StringBuilder("show summary with id "));
                    }
                    try {
                        notificationManager.d(notificationsController3.notificationId, notification);
                        arrayList2 = arrayList;
                    } catch (SecurityException e15) {
                        FileLog.e(e15);
                        arrayList2 = arrayList;
                        notificationsController3.resetNotificationSound(tVar, j3, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                    }
                }
                i13 = 0;
                while (i13 < iVar2.m()) {
                    a0.i iVar14 = iVar2;
                    if (!notificationsController3.openedInBubbleDialogs.contains(Long.valueOf(iVar14.j(i13)))) {
                        Integer num6 = (Integer) iVar14.n(i13);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("cancel notification id " + num6);
                        }
                        notificationManager.b(num6.intValue());
                    }
                    i13++;
                    iVar2 = iVar14;
                }
                ArrayList arrayList37 = new ArrayList(arrayList2.size());
                FileLog.d("showExtraNotifications: holders.size()=" + arrayList2.size());
                size2 = arrayList2.size();
                i14 = 0;
                while (i14 < size2) {
                    ArrayList arrayList38 = arrayList2;
                    1NotificationHolder r42 = (1NotificationHolder) arrayList38.get(i14);
                    arrayList37.clear();
                    if (Build.VERSION.SDK_INT < 29 || DialogObject.isEncryptedDialog(r42.dialogId)) {
                        iVar3 = iVar13;
                    } else {
                        e0.t tVar3 = r42.notification;
                        long j31 = r42.dialogId;
                        iVar3 = iVar13;
                        String createNotificationShortcut = notificationsController3.createNotificationShortcut(tVar3, j31, r42.name, r42.user, r42.chat, (e0.p0) iVar3.f(j31), !r42.story);
                        if (createNotificationShortcut != null) {
                            arrayList37.add(createNotificationShortcut);
                        }
                    }
                    FileLog.d("showExtraNotifications: holders[" + i14 + "].call()");
                    r42.call();
                    if (!unsupportedNotificationShortcut() && !arrayList37.isEmpty()) {
                        g0.f.o(ApplicationLoader.applicationContext, arrayList37);
                    }
                    i14++;
                    notificationsController3 = this;
                    arrayList2 = arrayList38;
                    iVar13 = iVar3;
                }
            }
        }
        z13 = true;
        if (z13) {
            checkOtherNotificationsChannel();
        }
        clientUserId = notificationsController3.getUserConfig().getClientUserId();
        if (AndroidUtilities.needShowPasscode()) {
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
        }
        FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() <= 0) + " waitingForPasscode=" + z14 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z13);
        iVar = new a0.i();
        size = arrayList14.size();
        while (true) {
            if (i23 < size) {
            }
            i23 = i17 + 1;
            arrayList16 = arrayList6;
            arrayList14 = arrayList7;
            z14 = z15;
            z13 = z16;
            size = i15;
            iVar9 = iVar4;
            iVar10 = iVar5;
            notificationsSettings = sharedPreferences;
            clientUserId = j14;
            b11 = notification3;
            iVar = iVar6;
        }
        iVar2 = iVar10;
        a0.i iVar132 = iVar;
        if (z13) {
        }
        i13 = 0;
        while (i13 < iVar2.m()) {
        }
        ArrayList arrayList372 = new ArrayList(arrayList2.size());
        FileLog.d("showExtraNotifications: holders.size()=" + arrayList2.size());
        size2 = arrayList2.size();
        i14 = 0;
        while (i14 < size2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(78:126|(7:128|(2:130|(1:132)(1:598))(1:599)|133|(1:138)|593|594|(1:596)(1:597))(1:600)|139|140|(3:575|576|(2:578|579)(4:(1:(2:588|(1:590)(1:591))(1:583))(1:592)|584|(1:586)|587))(4:143|(3:145|(2:167|168)(6:151|(1:153)|154|(1:166)(1:(1:158)(2:162|(1:164)(1:165)))|159|160)|161)|169|170)|171|(70:179|(1:573)(5:184|(1:186)(1:572)|(2:188|(1:190)(2:191|(2:193|194)(2:567|(1:569)(68:570|(2:197|(1:199))(1:566)|200|(4:202|(1:204)(1:564)|205|(57:207|208|209|(7:552|553|(1:555)(1:562)|556|557|(1:559)(1:561)|560)(1:(1:(4:215|(1:217)(1:526)|218|219)(4:527|(1:529)(1:532)|530|531))(2:533|(56:(1:536)(1:550)|537|(1:539)(2:(1:547)(1:549)|548)|540|541|(1:543)(1:545)|544|221|(1:223)(1:525)|224|(1:524)(1:228)|229|(1:523)(1:232)|(1:236)|(1:522)(1:241)|(6:243|(1:245)|246|(1:248)|249|(1:251)(1:520))(1:521)|(3:255|256|(1:260))|264|(1:266)(1:519)|267|268|(1:270)|271|272|(1:274)(3:457|458|(2:(2:461|462)(2:464|(1:466))|463)(2:467|(34:469|(2:472|470)|473|474|276|277|278|279|(2:286|(1:290))|291|292|293|(1:295)|296|(3:298|299|300)(1:453)|301|(1:303)(1:(13:437|(1:439)(3:440|441|(4:443|(1:445)(1:450)|446|(1:448)))|305|(4:432|433|(2:435|428)|413)(1:(4:310|311|(1:313)|413)(5:414|(2:416|(1:418)(3:419|(2:421|(1:423))(2:424|(1:426))|413))|429|(1:431)|413))|314|(1:412)(7:(3:407|(1:409)(1:411)|410)|(3:324|325|(7:327|(5:(1:333)(1:391)|(1:335)(1:390)|336|(1:338)(2:378|(1:380)(2:(2:385|(1:387)(1:388))|389))|339)|392|(0)(0)|336|(0)(0)|339)(2:393|(1:395)(2:(2:397|(2:401|402))|405)))|406|(0)(0)|336|(0)(0)|339)|340|341|(2:347|(7:349|(4:351|(3:353|(4:355|(1:357)|358|359)(2:361|362)|360)|363|364)|365|366|(1:374)|375|376))|377|(4:368|370|372|374)|375|376))|304|305|(1:307)|432|433|(0)|413|314|(0)|412|340|341|(4:343|345|347|(0))|377|(0)|375|376)(30:475|(5:477|(1:(1:480)(2:481|(1:483)))|484|(28:(3:493|(1:501)|502)(3:503|(2:505|(1:513))|502)|279|(4:282|284|286|(2:288|290))|291|292|293|(0)|296|(0)(0)|301|(0)(0)|304|305|(0)|432|433|(0)|413|314|(0)|412|340|341|(0)|377|(0)|375|376)|277)(2:514|(1:518))|278|279|(0)|291|292|293|(0)|296|(0)(0)|301|(0)(0)|304|305|(0)|432|433|(0)|413|314|(0)|412|340|341|(0)|377|(0)|375|376)))|275|276|277|278|279|(0)|291|292|293|(0)|296|(0)(0)|301|(0)(0)|304|305|(0)|432|433|(0)|413|314|(0)|412|340|341|(0)|377|(0)|375|376)(52:551|(0)(0)|224|(1:226)|524|229|(0)|523|(2:234|236)|(1:238)|522|(0)(0)|(4:253|255|256|(2:258|260))|264|(0)(0)|267|268|(0)|271|272|(0)(0)|275|276|277|278|279|(0)|291|292|293|(0)|296|(0)(0)|301|(0)(0)|304|305|(0)|432|433|(0)|413|314|(0)|412|340|341|(0)|377|(0)|375|376)))|220|221|(0)(0)|224|(0)|524|229|(0)|523|(0)|(0)|522|(0)(0)|(0)|264|(0)(0)|267|268|(0)|271|272|(0)(0)|275|276|277|278|279|(0)|291|292|293|(0)|296|(0)(0)|301|(0)(0)|304|305|(0)|432|433|(0)|413|314|(0)|412|340|341|(0)|377|(0)|375|376))(1:565)|563|208|209|(1:211)|552|553|(0)(0)|556|557|(0)(0)|560|220|221|(0)(0)|224|(0)|524|229|(0)|523|(0)|(0)|522|(0)(0)|(0)|264|(0)(0)|267|268|(0)|271|272|(0)(0)|275|276|277|278|279|(0)|291|292|293|(0)|296|(0)(0)|301|(0)(0)|304|305|(0)|432|433|(0)|413|314|(0)|412|340|341|(0)|377|(0)|375|376))))|571|194)|195|(0)(0)|200|(0)(0)|563|208|209|(0)|552|553|(0)(0)|556|557|(0)(0)|560|220|221|(0)(0)|224|(0)|524|229|(0)|523|(0)|(0)|522|(0)(0)|(0)|264|(0)(0)|267|268|(0)|271|272|(0)(0)|275|276|277|278|279|(0)|291|292|293|(0)|296|(0)(0)|301|(0)(0)|304|305|(0)|432|433|(0)|413|314|(0)|412|340|341|(0)|377|(0)|375|376)|574|(1:181)|573|195|(0)(0)|200|(0)(0)|563|208|209|(0)|552|553|(0)(0)|556|557|(0)(0)|560|220|221|(0)(0)|224|(0)|524|229|(0)|523|(0)|(0)|522|(0)(0)|(0)|264|(0)(0)|267|268|(0)|271|272|(0)(0)|275|276|277|278|279|(0)|291|292|293|(0)|296|(0)(0)|301|(0)(0)|304|305|(0)|432|433|(0)|413|314|(0)|412|340|341|(0)|377|(0)|375|376) */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0bf1, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0b49, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0b66, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ce A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e9 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06c5 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0707 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0773 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08df A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08f8 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0910 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0988 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0996 A[Catch: Exception -> 0x0056, TRY_ENTER, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0af7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0b41 A[Catch: all -> 0x0b49, TryCatch #2 {all -> 0x0b49, blocks: (B:293:0x0b26, B:295:0x0b41, B:296:0x0b4b, B:300:0x0b53, B:301:0x0b5b), top: B:292:0x0b26 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b6b A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0c0a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0cff A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0d1d A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0d6c A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0d83 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0e47 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0b5a  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x09ad A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0895 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x08a2 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x03e1 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x03c2 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0137 A[Catch: Exception -> 0x0056, TryCatch #4 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:621:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:135:0x0431, B:139:0x04a5, B:143:0x04c7, B:145:0x04eb, B:147:0x0501, B:149:0x0505, B:153:0x0511, B:154:0x0517, B:158:0x0524, B:159:0x056c, B:161:0x056f, B:162:0x053a, B:164:0x0542, B:165:0x0556, B:170:0x057a, B:174:0x05f9, B:184:0x0612, B:186:0x0630, B:188:0x0661, B:190:0x066b, B:191:0x0683, B:193:0x0694, B:197:0x06c5, B:200:0x06e8, B:202:0x0707, B:204:0x0732, B:205:0x074e, B:207:0x075e, B:209:0x076d, B:211:0x0773, B:215:0x0785, B:217:0x0799, B:219:0x07ae, B:224:0x08d9, B:226:0x08df, B:234:0x08f8, B:236:0x08fe, B:243:0x0910, B:246:0x091a, B:249:0x0923, B:263:0x0948, B:268:0x0957, B:270:0x0988, B:271:0x098f, B:274:0x0996, B:279:0x0ab1, B:282:0x0af9, B:284:0x0afd, B:286:0x0b03, B:288:0x0b19, B:290:0x0b1f, B:303:0x0b6b, B:311:0x0bce, B:318:0x0c0e, B:322:0x0c4d, B:324:0x0c55, B:327:0x0c5d, B:329:0x0c65, B:333:0x0c70, B:335:0x0cff, B:338:0x0d1d, B:341:0x0d66, B:343:0x0d6c, B:345:0x0d70, B:347:0x0d7b, B:349:0x0d83, B:351:0x0d8f, B:353:0x0da0, B:355:0x0db2, B:357:0x0dd4, B:358:0x0dd9, B:360:0x0e08, B:364:0x0e1a, B:368:0x0e47, B:370:0x0e4d, B:372:0x0e55, B:374:0x0e5b, B:375:0x0e7d, B:380:0x0d2d, B:387:0x0d41, B:389:0x0d4f, B:391:0x0c95, B:392:0x0c9a, B:393:0x0c9d, B:395:0x0ca5, B:397:0x0cad, B:399:0x0cb5, B:404:0x0ced, B:405:0x0cf5, B:407:0x0c18, B:409:0x0c20, B:410:0x0c48, B:412:0x0d58, B:421:0x0be1, B:426:0x0bec, B:429:0x0bf5, B:433:0x0bfd, B:437:0x0b74, B:439:0x0b81, B:456:0x0b66, B:457:0x09ad, B:462:0x09c0, B:463:0x09d3, B:466:0x09ce, B:467:0x09df, B:469:0x09f1, B:470:0x09fa, B:472:0x0a02, B:474:0x0a11, B:475:0x0a18, B:477:0x0a1e, B:480:0x0a2b, B:483:0x0a35, B:484:0x0a38, B:486:0x0a3e, B:488:0x0a47, B:490:0x0a50, B:493:0x0a58, B:495:0x0a5e, B:497:0x0a62, B:499:0x0a6a, B:505:0x0a79, B:507:0x0a7f, B:509:0x0a83, B:511:0x0a8b, B:514:0x0a92, B:516:0x0aa1, B:518:0x0aa7, B:526:0x07a6, B:527:0x07d3, B:529:0x07e7, B:531:0x07fc, B:532:0x07f4, B:537:0x0832, B:539:0x083a, B:541:0x0854, B:548:0x084e, B:553:0x0889, B:555:0x0895, B:557:0x08aa, B:562:0x08a2, B:564:0x073f, B:567:0x06a0, B:569:0x06a4, B:576:0x0589, B:583:0x059f, B:584:0x05e2, B:587:0x05e8, B:588:0x05b3, B:590:0x05b9, B:591:0x05cd, B:593:0x043d, B:596:0x044a, B:597:0x0465, B:598:0x0405, B:601:0x03d6, B:603:0x03e1, B:606:0x03b4, B:608:0x03bb, B:609:0x03c2, B:614:0x036a, B:615:0x036f, B:627:0x02ff, B:629:0x0305, B:634:0x026f, B:636:0x0137, B:638:0x013d, B:639:0x0143, B:642:0x014d, B:643:0x0157, B:644:0x0169, B:646:0x016f, B:647:0x0186, B:649:0x018d, B:651:0x0195, B:652:0x01c5, B:653:0x011e, B:655:0x020e, B:402:0x0cbf, B:256:0x093a), top: B:11:0x002c, inners: #1, #3 }] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r3v81, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v43, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r4v44, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r4v45, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v100, types: [org.telegram.messenger.MessageObject] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showOrUpdateNotification(boolean z10) {
        String str;
        long j3;
        long j10;
        MessageObject messageObject;
        Bitmap bitmap;
        NotificationsController notificationsController;
        String str2;
        String str3;
        boolean z11;
        int i10;
        TLRPC.Chat chat;
        boolean z12;
        long j11;
        SharedPreferences sharedPreferences;
        long j12;
        long j13;
        NotificationsController notificationsController2;
        Bitmap bitmap2;
        TLRPC.User user;
        long j14;
        long j15;
        boolean isGlobalNotificationsEnabled;
        SharedPreferences sharedPreferences2;
        boolean z13;
        boolean z14;
        String string;
        boolean z15;
        boolean z16;
        long j16;
        long j17;
        TLRPC.Chat chat2;
        String str4;
        long j18;
        SharedPreferences sharedPreferences3;
        long j19;
        String str5;
        String stringForMessage;
        String str6;
        boolean z17;
        boolean z18;
        String str7;
        String str8;
        e0.t tVar;
        String str9;
        SharedPreferences sharedPreferences4;
        long j20;
        boolean z19;
        long j21;
        boolean z20;
        long j22;
        long j23;
        long j24;
        int i11;
        int i12;
        boolean z21;
        String str10;
        Integer num;
        boolean z22;
        String str11;
        Integer num2;
        String str12;
        long j25;
        String string2;
        boolean z23;
        String str13;
        int i13;
        int i14;
        int i15;
        boolean z24;
        int i16;
        boolean z25;
        int i17;
        int i18;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        int i19;
        String str14;
        int i20;
        int i21;
        boolean z30;
        int i22;
        Object obj;
        boolean z31;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        long[] jArr;
        int i23;
        int i24;
        long[] jArr2;
        long[] jArr3;
        int i25;
        long[] jArr4;
        long j26;
        boolean z32;
        TLRPC.ReplyMarkup replyMarkup;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i26;
        int i27;
        int i28;
        long[] jArr5;
        long j27;
        long[] jArr6;
        int i29;
        int i30;
        String str15;
        String str16;
        int ringerMode;
        String string3;
        boolean z33;
        String string4;
        boolean z34;
        String string5;
        boolean z35;
        int i31;
        String str17;
        String formatPluralString;
        if (!getUserConfig().isClientActivated() || ((this.pushMessages.isEmpty() && this.storyPushMessages.isEmpty()) || !(SharedConfig.showNotificationsForAllAccounts || this.currentAccount == UserConfig.selectedAccount))) {
            dismissNotification();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            long j28 = 0;
            StoryNotification storyNotification = null;
            for (int i32 = 0; i32 < this.pushMessages.size(); i32++) {
                MessageObject messageObject2 = this.pushMessages.get(i32);
                long j29 = messageObject2.messageOwner.date;
                if (j28 < j29) {
                    storyNotification = messageObject2;
                    j28 = j29;
                }
            }
            for (int i33 = 0; i33 < this.storyPushMessages.size(); i33++) {
                StoryNotification storyNotification2 = this.storyPushMessages.get(i33);
                long j30 = storyNotification2.date;
                if (j28 < j30 / 1000) {
                    storyNotification = storyNotification2;
                    j28 = j30 / 1000;
                }
            }
            if (storyNotification == null) {
                return;
            }
            String str18 = "";
            if (storyNotification instanceof StoryNotification) {
                StoryNotification storyNotification3 = storyNotification;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                j3 = 1000;
                int i34 = 0;
                boolean z36 = false;
                int i35 = 0;
                j10 = 0;
                while (i34 < this.storyPushMessages.size()) {
                    z36 |= this.storyPushMessages.get(i34).hidden;
                    tL_message.date = Math.min(tL_message.date, (int) (this.storyPushMessages.get(i34).date / 1000));
                    i35 += this.storyPushMessages.get(i34).dateByIds.size();
                    i34++;
                    str18 = str18;
                }
                String str19 = str18;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j31 = storyNotification3.dialogId;
                tL_peerUser.user_id = j31;
                tL_message.dialog_id = j31;
                tL_message.peer_id = tL_peerUser;
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<Object> arrayList3 = new ArrayList<>();
                parseStoryPushes(arrayList2, arrayList3);
                Bitmap loadMultipleAvatars = SharedConfig.getDevicePerformanceClass() >= 1 ? loadMultipleAvatars(arrayList3) : null;
                if (!z36 && this.storyPushMessages.size() < 2 && !arrayList2.isEmpty()) {
                    formatPluralString = arrayList2.get(0);
                    String str20 = formatPluralString;
                    if (!z36) {
                        tL_message.message = LocaleController.formatPluralString("StoryNotificationHidden", i35, new Object[0]);
                        str = str19;
                    } else if (arrayList2.isEmpty()) {
                        str = str19;
                        tL_message.message = str;
                    } else {
                        str = str19;
                        if (arrayList2.size() == 1) {
                            if (i35 == 1) {
                                tL_message.message = LocaleController.getString("StoryNotificationSingle");
                            } else {
                                tL_message.message = LocaleController.formatPluralString("StoryNotification1", i35, arrayList2.get(0));
                            }
                        } else if (arrayList2.size() == 2) {
                            tL_message.message = LocaleController.formatString(R.string.StoryNotification2, arrayList2.get(0), arrayList2.get(1));
                        } else if (arrayList2.size() == 3 && this.storyPushMessages.size() == 3) {
                            tL_message.message = LocaleController.formatString(R.string.StoryNotification3, cutLastName(arrayList2.get(0)), cutLastName(arrayList2.get(1)), cutLastName(arrayList2.get(2)));
                        } else {
                            tL_message.message = LocaleController.formatPluralString("StoryNotification4", this.storyPushMessages.size() - 2, cutLastName(arrayList2.get(0)), cutLastName(arrayList2.get(1)));
                        }
                    }
                    MessageObject messageObject3 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str20, str20, false, false, false, false);
                    messageObject3.isStoryPush = true;
                    messageObject = messageObject3;
                    bitmap = loadMultipleAvatars;
                }
                formatPluralString = LocaleController.formatPluralString("Stories", i35, new Object[0]);
                String str202 = formatPluralString;
                if (!z36) {
                }
                MessageObject messageObject32 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str202, str202, false, false, false, false);
                messageObject32.isStoryPush = true;
                messageObject = messageObject32;
                bitmap = loadMultipleAvatars;
            } else {
                str = "";
                j3 = 1000;
                j10 = 0;
                messageObject = this.pushMessages.get(0);
                bitmap = null;
            }
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            int i36 = notificationsSettings.getInt("dismissDate", 0);
            if (!messageObject.isStoryPush && messageObject.messageOwner.date <= i36) {
                dismissNotification();
                return;
            }
            long dialogId = messageObject.getDialogId();
            long topicId = MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, getMessagesController().isForum(messageObject));
            boolean z37 = messageObject.isStoryPush;
            long fromChatId = messageObject.messageOwner.mentioned ? messageObject.getFromChatId() : dialogId;
            messageObject.getId();
            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
            long j32 = peer.chat_id;
            if (j32 == j10) {
                j32 = peer.channel_id;
            }
            String str21 = str;
            long j33 = peer.user_id;
            if (messageObject.isFromUser() && (j33 == j10 || j33 == getUserConfig().getClientUserId())) {
                j33 = messageObject.messageOwner.from_id.user_id;
            }
            if (messageObject.getDialogId() == UserObject.VERIFY && messageObject.getForwardedFromId() != null) {
                if (messageObject.getForwardedFromId().longValue() >= j10) {
                    j33 = messageObject.getForwardedFromId().longValue();
                    j32 = j10;
                } else {
                    j32 = messageObject.getForwardedFromId().longValue();
                    j33 = j10;
                }
            }
            TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j33));
            int i37 = (j32 > j10 ? 1 : (j32 == j10 ? 0 : -1));
            if (i37 != 0) {
                long j34 = j32;
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(j34));
                z12 = (chat4 == null && messageObject.isFcmMessage()) ? messageObject.localChannel : ChatObject.isChannel(chat4) && !chat4.megagroup;
                sharedPreferences = notificationsSettings;
                j12 = fromChatId;
                str2 = "file://";
                str3 = "currentAccount";
                z11 = z37;
                i10 = i37;
                j13 = topicId;
                j11 = j34;
                chat = chat4;
                notificationsController = this;
            } else {
                notificationsController = this;
                str2 = "file://";
                str3 = "currentAccount";
                z11 = z37;
                i10 = i37;
                chat = null;
                z12 = false;
                j11 = j32;
                sharedPreferences = notificationsSettings;
                j12 = fromChatId;
                j13 = topicId;
            }
            int notifyOverride = notificationsController.getNotifyOverride(sharedPreferences, j12, j13);
            long j35 = j12;
            long j36 = j13;
            if (notifyOverride == -1) {
                try {
                    Boolean valueOf = Boolean.valueOf(z12);
                    boolean z38 = messageObject.isReactionPush;
                    notificationsController2 = this;
                    SharedPreferences sharedPreferences5 = sharedPreferences;
                    bitmap2 = bitmap;
                    user = user3;
                    j14 = dialogId;
                    j15 = j36;
                    isGlobalNotificationsEnabled = notificationsController2.isGlobalNotificationsEnabled(j14, valueOf, z38, z38);
                    sharedPreferences2 = sharedPreferences5;
                } catch (Exception e7) {
                    e = e7;
                    FileLog.e(e);
                }
            } else {
                notificationsController2 = this;
                sharedPreferences2 = sharedPreferences;
                bitmap2 = bitmap;
                user = user3;
                j14 = dialogId;
                j15 = j36;
                isGlobalNotificationsEnabled = notifyOverride != 2;
            }
            String title = (((i10 == 0 || chat != null) && user != null) || !messageObject.isFcmMessage()) ? chat != null ? notificationsController2.getTitle(chat) : UserObject.getUserName(user) : messageObject.localName;
            if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
                z13 = false;
                boolean z39 = isGlobalNotificationsEnabled;
                String str22 = title;
                boolean equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                if (DialogObject.isEncryptedDialog(j14)) {
                    if (equalsIgnoreCase) {
                        z14 = equalsIgnoreCase;
                    } else {
                        z14 = equalsIgnoreCase;
                        if (notificationsController2.pushDialogs.m() <= 1) {
                        }
                    }
                    if (!z13) {
                        string = str22;
                        z15 = true;
                        if (!messageObject.isReactionPush && !messageObject.isStoryReactionPush) {
                            z16 = z15;
                            if (z14) {
                                j16 = j11;
                                j17 = j33;
                                chat2 = chat;
                                str4 = str21;
                            } else {
                                if (UserConfig.getActivatedAccountsCount() <= 1) {
                                    str4 = str21;
                                } else if (notificationsController2.pushDialogs.m() == 1) {
                                    str4 = UserObject.getFirstName(notificationsController2.getUserConfig().getCurrentUser());
                                } else {
                                    str4 = UserObject.getFirstName(notificationsController2.getUserConfig().getCurrentUser()) + "・";
                                }
                                chat2 = chat;
                                if (notificationsController2.pushDialogs.m() == 1 && Build.VERSION.SDK_INT >= 23) {
                                    j16 = j11;
                                    j17 = j33;
                                }
                                j17 = j33;
                                if (notificationsController2.pushDialogs.m() == 1) {
                                    str4 = str4 + LocaleController.formatPluralString("NewMessages", notificationsController2.total_unread_count, new Object[0]);
                                    j16 = j11;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str4);
                                    j16 = j11;
                                    sb2.append(LocaleController.formatString(R.string.NotificationMessagesPeopleDisplayOrder, LocaleController.formatPluralString("NewMessages", notificationsController2.total_unread_count, new Object[0]), LocaleController.formatPluralString("FromChats", notificationsController2.pushDialogs.m(), new Object[0])));
                                    str4 = sb2.toString();
                                }
                            }
                            e0.t tVar2 = new e0.t(ApplicationLoader.applicationContext);
                            if (notificationsController2.pushMessages.size() > 1 || z14) {
                                j18 = j14;
                                sharedPreferences3 = sharedPreferences2;
                                j19 = j15;
                                str5 = str21;
                                boolean[] zArr = new boolean[1];
                                stringForMessage = notificationsController2.getStringForMessage(messageObject, false, zArr, null);
                                boolean isSilentMessage = notificationsController2.isSilentMessage(messageObject);
                                if (stringForMessage == null) {
                                    return;
                                }
                                if (!z16) {
                                    str6 = stringForMessage;
                                } else if (chat2 != null && !z14) {
                                    str6 = stringForMessage.replace(" @ " + string, str5);
                                } else if (zArr[0]) {
                                    str6 = stringForMessage.replace(string + ": ", str5);
                                } else {
                                    str6 = stringForMessage.replace(string + " ", str5);
                                }
                                tVar2.f(str6);
                                if (z14) {
                                    str4 = str6;
                                }
                                e0.o oVar = new e0.o(0);
                                oVar.e(str6);
                                tVar2.n(oVar);
                                z17 = isSilentMessage;
                            } else {
                                tVar2.f(str4);
                                e0.o oVar2 = new e0.o(1);
                                oVar2.f(string);
                                j19 = j15;
                                int min = Math.min(10, notificationsController2.pushMessages.size());
                                boolean[] zArr2 = new boolean[1];
                                sharedPreferences3 = sharedPreferences2;
                                int i38 = 0;
                                ?? r14 = 2;
                                String str23 = null;
                                while (i38 < min) {
                                    int i39 = min;
                                    MessageObject messageObject4 = notificationsController2.pushMessages.get(i38);
                                    long j37 = j14;
                                    int i40 = i38;
                                    String stringForMessage2 = notificationsController2.getStringForMessage(messageObject4, false, zArr2, null);
                                    if (stringForMessage2 == null || (!messageObject4.isStoryPush && messageObject4.messageOwner.date <= i36)) {
                                        str17 = str21;
                                    } else {
                                        r14 = r14;
                                        if (r14 == 2) {
                                            str23 = stringForMessage2;
                                            r14 = notificationsController2.isSilentMessage(messageObject4);
                                        }
                                        if (notificationsController2.pushDialogs.m() != 1 || !z16) {
                                            str17 = str21;
                                        } else if (chat2 != null) {
                                            str17 = str21;
                                            stringForMessage2 = stringForMessage2.replace(" @ " + string, str17);
                                        } else {
                                            str17 = str21;
                                            stringForMessage2 = zArr2[0] ? stringForMessage2.replace(string + ": ", str17) : stringForMessage2.replace(string + " ", str17);
                                        }
                                        oVar2.d(stringForMessage2);
                                    }
                                    str21 = str17;
                                    min = i39;
                                    i38 = i40 + 1;
                                    j14 = j37;
                                    r14 = r14;
                                }
                                j18 = j14;
                                str5 = str21;
                                oVar2.g(str4);
                                tVar2.n(oVar2);
                                stringForMessage = str23;
                                z17 = r14;
                            }
                            String str24 = str4;
                            if (z10 && z39 && !MediaController.getInstance().isRecordingAudio() && !z17) {
                                z18 = false;
                                if (z18 && j18 == j35 && chat2 != null) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(NotificationsSettingsFacade.PROPERTY_CUSTOM);
                                    j20 = j18;
                                    sb3.append(j20);
                                    sharedPreferences4 = sharedPreferences3;
                                    int i41 = 180;
                                    if (sharedPreferences4.getBoolean(sb3.toString(), false)) {
                                        i31 = sharedPreferences4.getInt("smart_max_count_" + j20, 2);
                                        i41 = sharedPreferences4.getInt("smart_delay_" + j20, 180);
                                    } else {
                                        i31 = 2;
                                    }
                                    if (i31 != 0) {
                                        Point point = (Point) notificationsController2.smartNotificationsDialogs.f(j20);
                                        if (point == null) {
                                            notificationsController2.smartNotificationsDialogs.k(new Point(1, (int) (SystemClock.elapsedRealtime() / j3)), j20);
                                        } else {
                                            int i42 = point.y + i41;
                                            str7 = str24;
                                            str8 = str5;
                                            if (i42 < SystemClock.elapsedRealtime() / j3) {
                                                point.set(1, (int) (SystemClock.elapsedRealtime() / j3));
                                                tVar = tVar2;
                                                str9 = stringForMessage;
                                            } else {
                                                int i43 = point.x;
                                                if (i43 >= i31) {
                                                    tVar = tVar2;
                                                    str9 = stringForMessage;
                                                    z19 = true;
                                                    if (z19) {
                                                        j21 = j19;
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder();
                                                        sb4.append("sound_enabled_");
                                                        j21 = j19;
                                                        sb4.append(getSharedPrefKey(j20, j21));
                                                        if (!sharedPreferences4.getBoolean(sb4.toString(), true)) {
                                                            z19 = true;
                                                        }
                                                    }
                                                    String path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                                    z20 = ApplicationLoader.mainInterfacePaused;
                                                    boolean z40 = !z20;
                                                    getSharedPrefKey(j20, j21);
                                                    j22 = j21;
                                                    j23 = j20;
                                                    if (notificationsController2.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j23, j22, false)) {
                                                        i11 = notificationsController2.dialogsNotificationsFacade.getProperty("vibrate_", j23, j22, 0);
                                                        i12 = notificationsController2.dialogsNotificationsFacade.getProperty("priority_", j23, j22, 3);
                                                        long property = notificationsController2.dialogsNotificationsFacade.getProperty("sound_document_id_", j23, j22, 0L);
                                                        if (property != j10) {
                                                            str10 = notificationsController2.getMediaDataController().ringtoneDataStore.e(property);
                                                            z21 = true;
                                                        } else {
                                                            str10 = notificationsController2.dialogsNotificationsFacade.getPropertyString("sound_path_", j23, j22, null);
                                                            z21 = false;
                                                        }
                                                        int property2 = notificationsController2.dialogsNotificationsFacade.getProperty("color_", j23, j22, 0);
                                                        j24 = j23;
                                                        if (property2 != 0) {
                                                            num = Integer.valueOf(property2);
                                                            e0.t tVar3 = tVar;
                                                            if (!messageObject.isReactionPush || messageObject.isStoryReactionPush) {
                                                                z22 = z19;
                                                                str11 = str9;
                                                                num2 = num;
                                                                str12 = str7;
                                                                j25 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                                                if (j25 == 0) {
                                                                    string2 = notificationsController2.getMediaDataController().ringtoneDataStore.e(j25);
                                                                    z23 = true;
                                                                } else {
                                                                    string2 = sharedPreferences4.getString("ReactionSoundPath", path);
                                                                    z23 = false;
                                                                }
                                                                str13 = string2;
                                                                int i44 = sharedPreferences4.getInt("vibrate_react", 0);
                                                                i13 = sharedPreferences4.getInt("priority_react", 1);
                                                                i14 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                                                i15 = !messageObject.isStoryReactionPush ? 5 : 4;
                                                                z24 = z23;
                                                                i16 = i44;
                                                            } else {
                                                                if (i10 == 0) {
                                                                    z22 = z19;
                                                                    str11 = str9;
                                                                    num2 = num;
                                                                    str12 = str7;
                                                                    long j38 = j10;
                                                                    if (j17 == j38) {
                                                                        z25 = z21;
                                                                        i14 = -16776961;
                                                                        i16 = 0;
                                                                        str13 = null;
                                                                        i17 = 4;
                                                                        i13 = 0;
                                                                        i15 = 1;
                                                                        z24 = false;
                                                                        if (i16 != i17) {
                                                                        }
                                                                        if (TextUtils.isEmpty(str10)) {
                                                                        }
                                                                        str10 = str13;
                                                                        z25 = z24;
                                                                        z27 = true;
                                                                        z28 = z26;
                                                                        if (i12 != 3) {
                                                                        }
                                                                        i12 = i13;
                                                                        if (num2 != null) {
                                                                            i14 = num2.intValue();
                                                                            z27 = false;
                                                                        }
                                                                        if (i11 != 0) {
                                                                        }
                                                                        z29 = z27;
                                                                        i11 = i18;
                                                                        if (z20) {
                                                                        }
                                                                        if (z28) {
                                                                            ringerMode = audioManager.getRingerMode();
                                                                            if (ringerMode != 0) {
                                                                                i19 = 2;
                                                                            }
                                                                        }
                                                                        int i45 = i15;
                                                                        if (z22) {
                                                                        }
                                                                        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                                        StringBuilder sb5 = new StringBuilder();
                                                                        sb5.append("com.tmessages.openchat");
                                                                        int i46 = i19;
                                                                        sb5.append(Math.random());
                                                                        sb5.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                                        intent.setAction(sb5.toString());
                                                                        intent.setFlags(67108864);
                                                                        if (messageObject.isOauthPush) {
                                                                        }
                                                                        if (!messageObject.isStoryReactionPush) {
                                                                        }
                                                                        i22 = i20;
                                                                        obj = path;
                                                                        z31 = z20;
                                                                        user2 = user;
                                                                        chat3 = chat2;
                                                                        fileLocation = null;
                                                                        String str25 = str3;
                                                                        intent.putExtra(str25, notificationsController2.currentAccount);
                                                                        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                                                        tVar3.g(string);
                                                                        tVar3.E.icon = R.drawable.notification;
                                                                        tVar3.h(16, true);
                                                                        tVar3.i = notificationsController2.total_unread_count;
                                                                        tVar3.g = activity;
                                                                        tVar3.q = notificationsController2.notificationGroup;
                                                                        tVar3.r = true;
                                                                        tVar3.k = true;
                                                                        tVar3.E.when = messageObject.messageOwner.date * j3;
                                                                        tVar3.w = -15618822;
                                                                        tVar3.u = "msg";
                                                                        if (chat3 == null) {
                                                                        }
                                                                        Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                        intent2.putExtra("messageDate", messageObject.messageOwner.date);
                                                                        intent2.putExtra(str25, notificationsController2.currentAccount);
                                                                        if (messageObject.isStoryPush) {
                                                                        }
                                                                        if (messageObject.isStoryReactionPush) {
                                                                        }
                                                                        tVar3.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i30, intent2, 167772160);
                                                                        if (bitmap2 != null) {
                                                                        }
                                                                        jArr = null;
                                                                        if (z10) {
                                                                        }
                                                                        tVar3.j = -1;
                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                        }
                                                                        i23 = 0;
                                                                        if (!z17) {
                                                                        }
                                                                        i24 = i22;
                                                                        jArr2 = new long[]{0, 0};
                                                                        tVar3.E.vibrate = jArr2;
                                                                        jArr3 = jArr;
                                                                        if (!AndroidUtilities.needShowPasscode()) {
                                                                        }
                                                                        i25 = i24;
                                                                        jArr4 = jArr3;
                                                                        j26 = j24;
                                                                        z32 = false;
                                                                        if (!z32) {
                                                                        }
                                                                        notificationsController2.showExtraNotifications(tVar3, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z40, z22, i45);
                                                                        scheduleNotificationRepeat();
                                                                        return;
                                                                    }
                                                                    long j39 = sharedPreferences4.getLong(z11 ? "StoriesSoundDocId" : "GlobalSoundDocId", j38);
                                                                    if (j39 != j38) {
                                                                        string3 = notificationsController2.getMediaDataController().ringtoneDataStore.e(j39);
                                                                        z33 = true;
                                                                    } else {
                                                                        string3 = sharedPreferences4.getString(z11 ? "StoriesSoundPath" : "GlobalSoundPath", path);
                                                                        z33 = false;
                                                                    }
                                                                    str13 = string3;
                                                                    int i47 = sharedPreferences4.getInt("vibrate_messages", 0);
                                                                    i13 = sharedPreferences4.getInt("priority_messages", 1);
                                                                    i14 = sharedPreferences4.getInt("MessagesLed", -16776961);
                                                                    i15 = z11 ? 3 : 1;
                                                                    z24 = z33;
                                                                    z25 = z21;
                                                                    i16 = i47;
                                                                    i17 = 4;
                                                                    if (i16 != i17) {
                                                                        z26 = true;
                                                                        i18 = 0;
                                                                    } else {
                                                                        i18 = i16;
                                                                        z26 = false;
                                                                    }
                                                                    if (!TextUtils.isEmpty(str10) || TextUtils.equals(str13, str10)) {
                                                                        str10 = str13;
                                                                        z25 = z24;
                                                                        z27 = true;
                                                                    } else {
                                                                        z27 = false;
                                                                    }
                                                                    z28 = z26;
                                                                    if (i12 != 3 || i13 == i12) {
                                                                        i12 = i13;
                                                                    } else {
                                                                        z27 = false;
                                                                    }
                                                                    if (num2 != null && num2.intValue() != i14) {
                                                                        i14 = num2.intValue();
                                                                        z27 = false;
                                                                    }
                                                                    if (i11 != 0 || i11 == 4 || i11 == i18) {
                                                                        z29 = z27;
                                                                        i11 = i18;
                                                                    } else {
                                                                        z29 = false;
                                                                    }
                                                                    if (z20) {
                                                                        if (!sharedPreferences4.getBoolean("EnableInAppSounds", true)) {
                                                                            str10 = null;
                                                                        }
                                                                        if (!sharedPreferences4.getBoolean("EnableInAppVibrate", true)) {
                                                                            i11 = 2;
                                                                        }
                                                                        if (sharedPreferences4.getBoolean("EnableInAppPopup", true)) {
                                                                            i19 = i11;
                                                                            str14 = str10;
                                                                            i12 = 2;
                                                                        } else {
                                                                            i19 = i11;
                                                                            str14 = str10;
                                                                            i12 = 0;
                                                                        }
                                                                    } else {
                                                                        i19 = i11;
                                                                        str14 = str10;
                                                                    }
                                                                    if (z28 && i19 != 2) {
                                                                        try {
                                                                            ringerMode = audioManager.getRingerMode();
                                                                            if (ringerMode != 0 && ringerMode != 1) {
                                                                                i19 = 2;
                                                                            }
                                                                        } catch (Exception e10) {
                                                                            FileLog.e(e10);
                                                                        }
                                                                    }
                                                                    int i452 = i15;
                                                                    if (z22) {
                                                                        i20 = i14;
                                                                    } else {
                                                                        i19 = 0;
                                                                        str14 = null;
                                                                        i12 = 0;
                                                                        i20 = 0;
                                                                    }
                                                                    Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                                    StringBuilder sb52 = new StringBuilder();
                                                                    sb52.append("com.tmessages.openchat");
                                                                    int i462 = i19;
                                                                    sb52.append(Math.random());
                                                                    sb52.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                                    intent3.setAction(sb52.toString());
                                                                    intent3.setFlags(67108864);
                                                                    if (messageObject.isOauthPush) {
                                                                        intent3.putExtra("oauth_url", messageObject.localName);
                                                                    }
                                                                    if (!messageObject.isStoryReactionPush) {
                                                                        intent3.putExtra("storyId", Math.abs(messageObject.getId()));
                                                                        i21 = i462;
                                                                        z30 = z29;
                                                                    } else {
                                                                        if (!messageObject.isLiveStoryPush) {
                                                                            i21 = i462;
                                                                            z30 = z29;
                                                                            long j40 = j16;
                                                                            long j41 = j17;
                                                                            i22 = i20;
                                                                            obj = path;
                                                                            if (!messageObject.isStoryPush) {
                                                                                if (DialogObject.isEncryptedDialog(j24)) {
                                                                                    z31 = z20;
                                                                                    user2 = user;
                                                                                    chat3 = chat2;
                                                                                    if (notificationsController2.pushDialogs.m() == 1 && j24 != globalSecretChatId) {
                                                                                        intent3.putExtra("encId", DialogObject.getEncryptedChatId(j24));
                                                                                    }
                                                                                } else {
                                                                                    z31 = z20;
                                                                                    if (notificationsController2.pushDialogs.m() == 1) {
                                                                                        if (i10 != 0) {
                                                                                            intent3.putExtra("chatId", j40);
                                                                                        } else if (j41 != 0) {
                                                                                            intent3.putExtra("userId", j41);
                                                                                        }
                                                                                    }
                                                                                    if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter && notificationsController2.pushDialogs.m() == 1 && Build.VERSION.SDK_INT < 28) {
                                                                                        if (chat2 != null) {
                                                                                            chat3 = chat2;
                                                                                            TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                                                            if (chatPhoto != null && (fileLocation2 = chatPhoto.photo_small) != null && fileLocation2.volume_id != 0 && fileLocation2.local_id != 0) {
                                                                                                fileLocation = fileLocation2;
                                                                                                user2 = user;
                                                                                            }
                                                                                            user2 = user;
                                                                                        } else {
                                                                                            chat3 = chat2;
                                                                                            if (user != null) {
                                                                                                user2 = user;
                                                                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                                                                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                                                                                }
                                                                                            }
                                                                                            user2 = user;
                                                                                        }
                                                                                        String str252 = str3;
                                                                                        intent3.putExtra(str252, notificationsController2.currentAccount);
                                                                                        PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3, 1140850688);
                                                                                        tVar3.g(string);
                                                                                        tVar3.E.icon = R.drawable.notification;
                                                                                        tVar3.h(16, true);
                                                                                        tVar3.i = notificationsController2.total_unread_count;
                                                                                        tVar3.g = activity2;
                                                                                        tVar3.q = notificationsController2.notificationGroup;
                                                                                        tVar3.r = true;
                                                                                        tVar3.k = true;
                                                                                        tVar3.E.when = messageObject.messageOwner.date * j3;
                                                                                        tVar3.w = -15618822;
                                                                                        tVar3.u = "msg";
                                                                                        if (chat3 == null) {
                                                                                            str16 = "tel:+" + user2.phone;
                                                                                            if (str16 != null) {
                                                                                                tVar3.F.add(str16);
                                                                                            }
                                                                                        }
                                                                                        Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                                        intent22.putExtra("messageDate", messageObject.messageOwner.date);
                                                                                        intent22.putExtra(str252, notificationsController2.currentAccount);
                                                                                        if (messageObject.isStoryPush) {
                                                                                        }
                                                                                        if (messageObject.isStoryReactionPush) {
                                                                                        }
                                                                                        tVar3.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i30, intent22, 167772160);
                                                                                        if (bitmap2 != null) {
                                                                                        }
                                                                                        jArr = null;
                                                                                        if (z10) {
                                                                                        }
                                                                                        tVar3.j = -1;
                                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                                        }
                                                                                        i23 = 0;
                                                                                        if (!z17) {
                                                                                        }
                                                                                        i24 = i22;
                                                                                        jArr2 = new long[]{0, 0};
                                                                                        tVar3.E.vibrate = jArr2;
                                                                                        jArr3 = jArr;
                                                                                        if (!AndroidUtilities.needShowPasscode()) {
                                                                                        }
                                                                                        i25 = i24;
                                                                                        jArr4 = jArr3;
                                                                                        j26 = j24;
                                                                                        z32 = false;
                                                                                        if (!z32) {
                                                                                        }
                                                                                        notificationsController2.showExtraNotifications(tVar3, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z40, z22, i452);
                                                                                        scheduleNotificationRepeat();
                                                                                        return;
                                                                                    }
                                                                                    user2 = user;
                                                                                    chat3 = chat2;
                                                                                }
                                                                                fileLocation = null;
                                                                                String str2522 = str3;
                                                                                intent3.putExtra(str2522, notificationsController2.currentAccount);
                                                                                PendingIntent activity22 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3, 1140850688);
                                                                                tVar3.g(string);
                                                                                tVar3.E.icon = R.drawable.notification;
                                                                                tVar3.h(16, true);
                                                                                tVar3.i = notificationsController2.total_unread_count;
                                                                                tVar3.g = activity22;
                                                                                tVar3.q = notificationsController2.notificationGroup;
                                                                                tVar3.r = true;
                                                                                tVar3.k = true;
                                                                                tVar3.E.when = messageObject.messageOwner.date * j3;
                                                                                tVar3.w = -15618822;
                                                                                tVar3.u = "msg";
                                                                                if (chat3 == null) {
                                                                                }
                                                                                Intent intent222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                                intent222.putExtra("messageDate", messageObject.messageOwner.date);
                                                                                intent222.putExtra(str2522, notificationsController2.currentAccount);
                                                                                if (messageObject.isStoryPush) {
                                                                                }
                                                                                if (messageObject.isStoryReactionPush) {
                                                                                }
                                                                                tVar3.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i30, intent222, 167772160);
                                                                                if (bitmap2 != null) {
                                                                                }
                                                                                jArr = null;
                                                                                if (z10) {
                                                                                }
                                                                                tVar3.j = -1;
                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                }
                                                                                i23 = 0;
                                                                                if (!z17) {
                                                                                }
                                                                                i24 = i22;
                                                                                jArr2 = new long[]{0, 0};
                                                                                tVar3.E.vibrate = jArr2;
                                                                                jArr3 = jArr;
                                                                                if (!AndroidUtilities.needShowPasscode()) {
                                                                                }
                                                                                i25 = i24;
                                                                                jArr4 = jArr3;
                                                                                j26 = j24;
                                                                                z32 = false;
                                                                                if (!z32) {
                                                                                }
                                                                                notificationsController2.showExtraNotifications(tVar3, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z40, z22, i452);
                                                                                scheduleNotificationRepeat();
                                                                                return;
                                                                            }
                                                                            long[] jArr7 = new long[notificationsController2.storyPushMessages.size()];
                                                                            for (int i48 = 0; i48 < notificationsController2.storyPushMessages.size(); i48++) {
                                                                                jArr7[i48] = notificationsController2.storyPushMessages.get(i48).dialogId;
                                                                            }
                                                                            intent3.putExtra("storyDialogIds", jArr7);
                                                                            z31 = z20;
                                                                            user2 = user;
                                                                            chat3 = chat2;
                                                                            fileLocation = null;
                                                                            String str25222 = str3;
                                                                            intent3.putExtra(str25222, notificationsController2.currentAccount);
                                                                            PendingIntent activity222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3, 1140850688);
                                                                            tVar3.g(string);
                                                                            tVar3.E.icon = R.drawable.notification;
                                                                            tVar3.h(16, true);
                                                                            tVar3.i = notificationsController2.total_unread_count;
                                                                            tVar3.g = activity222;
                                                                            tVar3.q = notificationsController2.notificationGroup;
                                                                            tVar3.r = true;
                                                                            tVar3.k = true;
                                                                            tVar3.E.when = messageObject.messageOwner.date * j3;
                                                                            tVar3.w = -15618822;
                                                                            tVar3.u = "msg";
                                                                            if (chat3 == null && user2 != null && (str15 = user2.phone) != null && str15.length() > 0) {
                                                                                str16 = "tel:+" + user2.phone;
                                                                                if (str16 != null && !str16.isEmpty()) {
                                                                                    tVar3.F.add(str16);
                                                                                }
                                                                            }
                                                                            Intent intent2222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                            intent2222.putExtra("messageDate", messageObject.messageOwner.date);
                                                                            intent2222.putExtra(str25222, notificationsController2.currentAccount);
                                                                            if (messageObject.isStoryPush) {
                                                                                intent2222.putExtra("story", true);
                                                                            }
                                                                            if (messageObject.isStoryReactionPush) {
                                                                                i30 = 1;
                                                                                intent2222.putExtra("storyReaction", true);
                                                                            } else {
                                                                                i30 = 1;
                                                                            }
                                                                            tVar3.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i30, intent2222, 167772160);
                                                                            if (bitmap2 != null) {
                                                                                tVar3.j(bitmap2);
                                                                            } else if (fileLocation != null) {
                                                                                jArr = null;
                                                                                BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                                                                if (imageFromMemory != null) {
                                                                                    tVar3.j(imageFromMemory.getBitmap());
                                                                                } else {
                                                                                    try {
                                                                                        File pathToAttach = notificationsController2.getFileLoader().getPathToAttach(fileLocation, true);
                                                                                        if (pathToAttach.exists()) {
                                                                                            float dp = 160.0f / AndroidUtilities.dp(50.0f);
                                                                                            BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                            options.inSampleSize = dp < 1.0f ? 1 : (int) dp;
                                                                                            Bitmap decodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                                                                                            if (decodeFile != null) {
                                                                                                tVar3.j(decodeFile);
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable unused) {
                                                                                    }
                                                                                }
                                                                                if (z10 || z17) {
                                                                                    tVar3.j = -1;
                                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                                        i23 = 2;
                                                                                    }
                                                                                    i23 = 0;
                                                                                } else if (i12 == 0) {
                                                                                    tVar3.j = 0;
                                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                                        i23 = 3;
                                                                                    }
                                                                                    i23 = 0;
                                                                                } else {
                                                                                    int i49 = 1;
                                                                                    if (i12 != 1) {
                                                                                        if (i12 == 2) {
                                                                                            i49 = 1;
                                                                                        } else {
                                                                                            if (i12 == 4) {
                                                                                                tVar3.j = -2;
                                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                                    i23 = 1;
                                                                                                }
                                                                                            } else if (i12 == 5) {
                                                                                                tVar3.j = -1;
                                                                                            }
                                                                                            i23 = 0;
                                                                                        }
                                                                                    }
                                                                                    tVar3.j = i49;
                                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                                        i23 = 4;
                                                                                    }
                                                                                    i23 = 0;
                                                                                }
                                                                                if (!z17 || z22) {
                                                                                    i24 = i22;
                                                                                    jArr2 = new long[]{0, 0};
                                                                                    tVar3.E.vibrate = jArr2;
                                                                                    jArr3 = jArr;
                                                                                } else {
                                                                                    if (z31 || (sharedPreferences4.getBoolean("EnableInAppPreview", true) && str11 != null)) {
                                                                                        tVar3.p(str11.length() > 100 ? str11.substring(0, 100).replace('\n', ' ').trim() + "..." : str11);
                                                                                    }
                                                                                    if (str14 != null && !str14.equalsIgnoreCase("NoSound")) {
                                                                                        int i50 = Build.VERSION.SDK_INT;
                                                                                        if (i50 >= 26) {
                                                                                            if (!str14.equalsIgnoreCase("Default") && !str14.equals(obj)) {
                                                                                                if (z25) {
                                                                                                    ?? d = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", new File(str14));
                                                                                                    ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", d, 1);
                                                                                                    jArr6 = d;
                                                                                                } else {
                                                                                                    jArr6 = Uri.parse(str14);
                                                                                                }
                                                                                                if (i22 != 0) {
                                                                                                    Notification notification = tVar3.E;
                                                                                                    i24 = i22;
                                                                                                    notification.ledARGB = i24;
                                                                                                    notification.ledOnMS = MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                                                    notification.ledOffMS = MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                                                    notification.flags = ((-2) & notification.flags) | 1;
                                                                                                } else {
                                                                                                    i24 = i22;
                                                                                                }
                                                                                                i29 = i21;
                                                                                                if (i29 == 2) {
                                                                                                    jArr2 = new long[]{0, 0};
                                                                                                    tVar3.E.vibrate = jArr2;
                                                                                                } else if (i29 == 1) {
                                                                                                    jArr2 = new long[]{0, 100, 0, 100};
                                                                                                    tVar3.E.vibrate = jArr2;
                                                                                                } else {
                                                                                                    if (i29 != 0 && i29 != 4) {
                                                                                                        if (i29 == 3) {
                                                                                                            jArr2 = new long[]{0, 1000};
                                                                                                            tVar3.E.vibrate = jArr2;
                                                                                                        } else {
                                                                                                            jArr3 = jArr6;
                                                                                                            jArr2 = jArr;
                                                                                                        }
                                                                                                    }
                                                                                                    tVar3.E.defaults = 2;
                                                                                                    jArr2 = new long[0];
                                                                                                }
                                                                                                jArr3 = jArr6;
                                                                                            }
                                                                                            jArr6 = Settings.System.DEFAULT_NOTIFICATION_URI;
                                                                                            if (i22 != 0) {
                                                                                            }
                                                                                            i29 = i21;
                                                                                            if (i29 == 2) {
                                                                                            }
                                                                                            jArr3 = jArr6;
                                                                                        } else if (str14.equals(obj)) {
                                                                                            tVar3.m(Settings.System.DEFAULT_NOTIFICATION_URI);
                                                                                        } else {
                                                                                            if (i50 >= 24) {
                                                                                                String str26 = str2;
                                                                                                if (str14.startsWith(str26) && !AndroidUtilities.isInternalUri(Uri.parse(str14))) {
                                                                                                    try {
                                                                                                        Uri d10 = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", new File(str14.replace(str26, str8)));
                                                                                                        ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", d10, 1);
                                                                                                        tVar3.m(d10);
                                                                                                    } catch (Exception unused2) {
                                                                                                        tVar3.m(Uri.parse(str14));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            tVar3.m(Uri.parse(str14));
                                                                                        }
                                                                                    }
                                                                                    jArr6 = jArr;
                                                                                    if (i22 != 0) {
                                                                                    }
                                                                                    i29 = i21;
                                                                                    if (i29 == 2) {
                                                                                    }
                                                                                    jArr3 = jArr6;
                                                                                }
                                                                                if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter && messageObject.getDialogId() == 777000) {
                                                                                    replyMarkup = messageObject.messageOwner.reply_markup;
                                                                                    if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                                        int size = arrayList4.size();
                                                                                        int i51 = 0;
                                                                                        boolean z41 = false;
                                                                                        while (i51 < size) {
                                                                                            TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList4.get(i51);
                                                                                            int size2 = keyboardInlineButtonRow.buttons.size();
                                                                                            boolean z42 = z41;
                                                                                            int i52 = 0;
                                                                                            while (i52 < size2) {
                                                                                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i52);
                                                                                                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) zf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                                                if (tL_inlineButtonTypeCallback != null) {
                                                                                                    arrayList = arrayList4;
                                                                                                    i26 = size;
                                                                                                    i27 = i24;
                                                                                                    Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                                                    intent4.putExtra(str25222, notificationsController2.currentAccount);
                                                                                                    i28 = i52;
                                                                                                    long[] jArr8 = jArr3;
                                                                                                    j27 = j24;
                                                                                                    intent4.putExtra("did", j27);
                                                                                                    byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                                                    if (bArr != null) {
                                                                                                        intent4.putExtra("data", bArr);
                                                                                                    }
                                                                                                    intent4.putExtra("mid", messageObject.getId());
                                                                                                    String str27 = keyboardInlineButton.text;
                                                                                                    Context context = ApplicationLoader.applicationContext;
                                                                                                    int i53 = notificationsController2.lastButtonId;
                                                                                                    jArr5 = jArr8;
                                                                                                    notificationsController2.lastButtonId = i53 + 1;
                                                                                                    tVar3.a(0, str27, PendingIntent.getBroadcast(context, i53, intent4, 167772160));
                                                                                                    z42 = true;
                                                                                                } else {
                                                                                                    arrayList = arrayList4;
                                                                                                    i26 = size;
                                                                                                    i27 = i24;
                                                                                                    i28 = i52;
                                                                                                    jArr5 = jArr3;
                                                                                                    j27 = j24;
                                                                                                }
                                                                                                j24 = j27;
                                                                                                arrayList4 = arrayList;
                                                                                                size = i26;
                                                                                                jArr3 = jArr5;
                                                                                                i24 = i27;
                                                                                                i52 = i28 + 1;
                                                                                            }
                                                                                            i51++;
                                                                                            z41 = z42;
                                                                                            size = size;
                                                                                            jArr3 = jArr3;
                                                                                        }
                                                                                        i25 = i24;
                                                                                        z32 = z41;
                                                                                        jArr4 = jArr3;
                                                                                        j26 = j24;
                                                                                        if (!z32 && Build.VERSION.SDK_INT < 24 && SharedConfig.passcodeHash.length() == 0 && notificationsController2.hasMessagesToReply()) {
                                                                                            Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                            intent5.putExtra(str25222, notificationsController2.currentAccount);
                                                                                            tVar3.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent5, 167772160));
                                                                                        }
                                                                                        notificationsController2.showExtraNotifications(tVar3, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z40, z22, i452);
                                                                                        scheduleNotificationRepeat();
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                i25 = i24;
                                                                                jArr4 = jArr3;
                                                                                j26 = j24;
                                                                                z32 = false;
                                                                                if (!z32) {
                                                                                    Intent intent52 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                    intent52.putExtra(str25222, notificationsController2.currentAccount);
                                                                                    tVar3.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent52, 167772160));
                                                                                }
                                                                                notificationsController2.showExtraNotifications(tVar3, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z40, z22, i452);
                                                                                scheduleNotificationRepeat();
                                                                                return;
                                                                            }
                                                                            jArr = null;
                                                                            if (z10) {
                                                                            }
                                                                            tVar3.j = -1;
                                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                            }
                                                                            i23 = 0;
                                                                            if (!z17) {
                                                                            }
                                                                            i24 = i22;
                                                                            jArr2 = new long[]{0, 0};
                                                                            tVar3.E.vibrate = jArr2;
                                                                            jArr3 = jArr;
                                                                            if (!AndroidUtilities.needShowPasscode()) {
                                                                                replyMarkup = messageObject.messageOwner.reply_markup;
                                                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                }
                                                                            }
                                                                            i25 = i24;
                                                                            jArr4 = jArr3;
                                                                            j26 = j24;
                                                                            z32 = false;
                                                                            if (!z32) {
                                                                            }
                                                                            notificationsController2.showExtraNotifications(tVar3, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z40, z22, i452);
                                                                            scheduleNotificationRepeat();
                                                                            return;
                                                                        }
                                                                        if (i10 != 0) {
                                                                            i21 = i462;
                                                                            z30 = z29;
                                                                            intent3.putExtra("chatId", j16);
                                                                        } else {
                                                                            i21 = i462;
                                                                            z30 = z29;
                                                                            if (j17 != 0) {
                                                                                intent3.putExtra("userId", j17);
                                                                            }
                                                                        }
                                                                        intent3.putExtra("storyId", Math.abs(messageObject.getId()));
                                                                    }
                                                                    i22 = i20;
                                                                    obj = path;
                                                                    z31 = z20;
                                                                    user2 = user;
                                                                    chat3 = chat2;
                                                                    fileLocation = null;
                                                                    String str252222 = str3;
                                                                    intent3.putExtra(str252222, notificationsController2.currentAccount);
                                                                    PendingIntent activity2222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3, 1140850688);
                                                                    tVar3.g(string);
                                                                    tVar3.E.icon = R.drawable.notification;
                                                                    tVar3.h(16, true);
                                                                    tVar3.i = notificationsController2.total_unread_count;
                                                                    tVar3.g = activity2222;
                                                                    tVar3.q = notificationsController2.notificationGroup;
                                                                    tVar3.r = true;
                                                                    tVar3.k = true;
                                                                    tVar3.E.when = messageObject.messageOwner.date * j3;
                                                                    tVar3.w = -15618822;
                                                                    tVar3.u = "msg";
                                                                    if (chat3 == null) {
                                                                    }
                                                                    Intent intent22222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                    intent22222.putExtra("messageDate", messageObject.messageOwner.date);
                                                                    intent22222.putExtra(str252222, notificationsController2.currentAccount);
                                                                    if (messageObject.isStoryPush) {
                                                                    }
                                                                    if (messageObject.isStoryReactionPush) {
                                                                    }
                                                                    tVar3.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i30, intent22222, 167772160);
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    jArr = null;
                                                                    if (z10) {
                                                                    }
                                                                    tVar3.j = -1;
                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                    }
                                                                    i23 = 0;
                                                                    if (!z17) {
                                                                    }
                                                                    i24 = i22;
                                                                    jArr2 = new long[]{0, 0};
                                                                    tVar3.E.vibrate = jArr2;
                                                                    jArr3 = jArr;
                                                                    if (!AndroidUtilities.needShowPasscode()) {
                                                                    }
                                                                    i25 = i24;
                                                                    jArr4 = jArr3;
                                                                    j26 = j24;
                                                                    z32 = false;
                                                                    if (!z32) {
                                                                    }
                                                                    notificationsController2.showExtraNotifications(tVar3, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z40, z22, i452);
                                                                    scheduleNotificationRepeat();
                                                                    return;
                                                                }
                                                                if (z12) {
                                                                    z22 = z19;
                                                                    str11 = str9;
                                                                    num2 = num;
                                                                    str12 = str7;
                                                                    long j42 = j10;
                                                                    long j43 = sharedPreferences4.getLong("ChannelSoundDocId", j42);
                                                                    if (j43 != j42) {
                                                                        string5 = notificationsController2.getMediaDataController().ringtoneDataStore.e(j43);
                                                                        z35 = true;
                                                                    } else {
                                                                        string5 = sharedPreferences4.getString("ChannelSoundPath", path);
                                                                        z35 = false;
                                                                    }
                                                                    str13 = string5;
                                                                    int i54 = sharedPreferences4.getInt("vibrate_channel", 0);
                                                                    i13 = sharedPreferences4.getInt("priority_channel", 1);
                                                                    i14 = sharedPreferences4.getInt("ChannelLed", -16776961);
                                                                    z24 = z35;
                                                                    i16 = i54;
                                                                    i15 = 2;
                                                                } else {
                                                                    z22 = z19;
                                                                    str11 = str9;
                                                                    num2 = num;
                                                                    str12 = str7;
                                                                    long j44 = sharedPreferences4.getLong("GroupSoundDocId", 0L);
                                                                    if (j44 != 0) {
                                                                        string4 = notificationsController2.getMediaDataController().ringtoneDataStore.e(j44);
                                                                        z34 = true;
                                                                    } else {
                                                                        string4 = sharedPreferences4.getString("GroupSoundPath", path);
                                                                        z34 = false;
                                                                    }
                                                                    str13 = string4;
                                                                    int i55 = sharedPreferences4.getInt("vibrate_group", 0);
                                                                    i13 = sharedPreferences4.getInt("priority_group", 1);
                                                                    i14 = sharedPreferences4.getInt("GroupLed", -16776961);
                                                                    z24 = z34;
                                                                    i16 = i55;
                                                                    i15 = 0;
                                                                }
                                                            }
                                                            z25 = z21;
                                                            i17 = 4;
                                                            if (i16 != i17) {
                                                            }
                                                            if (TextUtils.isEmpty(str10)) {
                                                            }
                                                            str10 = str13;
                                                            z25 = z24;
                                                            z27 = true;
                                                            z28 = z26;
                                                            if (i12 != 3) {
                                                            }
                                                            i12 = i13;
                                                            if (num2 != null) {
                                                            }
                                                            if (i11 != 0) {
                                                            }
                                                            z29 = z27;
                                                            i11 = i18;
                                                            if (z20) {
                                                            }
                                                            if (z28) {
                                                            }
                                                            int i4522 = i15;
                                                            if (z22) {
                                                            }
                                                            Intent intent32 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                            StringBuilder sb522 = new StringBuilder();
                                                            sb522.append("com.tmessages.openchat");
                                                            int i4622 = i19;
                                                            sb522.append(Math.random());
                                                            sb522.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                            intent32.setAction(sb522.toString());
                                                            intent32.setFlags(67108864);
                                                            if (messageObject.isOauthPush) {
                                                            }
                                                            if (!messageObject.isStoryReactionPush) {
                                                            }
                                                            i22 = i20;
                                                            obj = path;
                                                            z31 = z20;
                                                            user2 = user;
                                                            chat3 = chat2;
                                                            fileLocation = null;
                                                            String str2522222 = str3;
                                                            intent32.putExtra(str2522222, notificationsController2.currentAccount);
                                                            PendingIntent activity22222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32, 1140850688);
                                                            tVar3.g(string);
                                                            tVar3.E.icon = R.drawable.notification;
                                                            tVar3.h(16, true);
                                                            tVar3.i = notificationsController2.total_unread_count;
                                                            tVar3.g = activity22222;
                                                            tVar3.q = notificationsController2.notificationGroup;
                                                            tVar3.r = true;
                                                            tVar3.k = true;
                                                            tVar3.E.when = messageObject.messageOwner.date * j3;
                                                            tVar3.w = -15618822;
                                                            tVar3.u = "msg";
                                                            if (chat3 == null) {
                                                            }
                                                            Intent intent222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                            intent222222.putExtra("messageDate", messageObject.messageOwner.date);
                                                            intent222222.putExtra(str2522222, notificationsController2.currentAccount);
                                                            if (messageObject.isStoryPush) {
                                                            }
                                                            if (messageObject.isStoryReactionPush) {
                                                            }
                                                            tVar3.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i30, intent222222, 167772160);
                                                            if (bitmap2 != null) {
                                                            }
                                                            jArr = null;
                                                            if (z10) {
                                                            }
                                                            tVar3.j = -1;
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                            }
                                                            i23 = 0;
                                                            if (!z17) {
                                                            }
                                                            i24 = i22;
                                                            jArr2 = new long[]{0, 0};
                                                            tVar3.E.vibrate = jArr2;
                                                            jArr3 = jArr;
                                                            if (!AndroidUtilities.needShowPasscode()) {
                                                            }
                                                            i25 = i24;
                                                            jArr4 = jArr3;
                                                            j26 = j24;
                                                            z32 = false;
                                                            if (!z32) {
                                                            }
                                                            notificationsController2.showExtraNotifications(tVar3, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z40, z22, i4522);
                                                            scheduleNotificationRepeat();
                                                            return;
                                                        }
                                                    } else {
                                                        j24 = j23;
                                                        i11 = 0;
                                                        i12 = 3;
                                                        z21 = false;
                                                        str10 = null;
                                                    }
                                                    num = null;
                                                    e0.t tVar32 = tVar;
                                                    if (messageObject.isReactionPush) {
                                                    }
                                                    z22 = z19;
                                                    str11 = str9;
                                                    num2 = num;
                                                    str12 = str7;
                                                    j25 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                                    if (j25 == 0) {
                                                    }
                                                    str13 = string2;
                                                    int i442 = sharedPreferences4.getInt("vibrate_react", 0);
                                                    i13 = sharedPreferences4.getInt("priority_react", 1);
                                                    i14 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                                    if (!messageObject.isStoryReactionPush) {
                                                    }
                                                    z24 = z23;
                                                    i16 = i442;
                                                    z25 = z21;
                                                    i17 = 4;
                                                    if (i16 != i17) {
                                                    }
                                                    if (TextUtils.isEmpty(str10)) {
                                                    }
                                                    str10 = str13;
                                                    z25 = z24;
                                                    z27 = true;
                                                    z28 = z26;
                                                    if (i12 != 3) {
                                                    }
                                                    i12 = i13;
                                                    if (num2 != null) {
                                                    }
                                                    if (i11 != 0) {
                                                    }
                                                    z29 = z27;
                                                    i11 = i18;
                                                    if (z20) {
                                                    }
                                                    if (z28) {
                                                    }
                                                    int i45222 = i15;
                                                    if (z22) {
                                                    }
                                                    Intent intent322 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                    StringBuilder sb5222 = new StringBuilder();
                                                    sb5222.append("com.tmessages.openchat");
                                                    int i46222 = i19;
                                                    sb5222.append(Math.random());
                                                    sb5222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                    intent322.setAction(sb5222.toString());
                                                    intent322.setFlags(67108864);
                                                    if (messageObject.isOauthPush) {
                                                    }
                                                    if (!messageObject.isStoryReactionPush) {
                                                    }
                                                    i22 = i20;
                                                    obj = path;
                                                    z31 = z20;
                                                    user2 = user;
                                                    chat3 = chat2;
                                                    fileLocation = null;
                                                    String str25222222 = str3;
                                                    intent322.putExtra(str25222222, notificationsController2.currentAccount);
                                                    PendingIntent activity222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322, 1140850688);
                                                    tVar32.g(string);
                                                    tVar32.E.icon = R.drawable.notification;
                                                    tVar32.h(16, true);
                                                    tVar32.i = notificationsController2.total_unread_count;
                                                    tVar32.g = activity222222;
                                                    tVar32.q = notificationsController2.notificationGroup;
                                                    tVar32.r = true;
                                                    tVar32.k = true;
                                                    tVar32.E.when = messageObject.messageOwner.date * j3;
                                                    tVar32.w = -15618822;
                                                    tVar32.u = "msg";
                                                    if (chat3 == null) {
                                                    }
                                                    Intent intent2222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                    intent2222222.putExtra("messageDate", messageObject.messageOwner.date);
                                                    intent2222222.putExtra(str25222222, notificationsController2.currentAccount);
                                                    if (messageObject.isStoryPush) {
                                                    }
                                                    if (messageObject.isStoryReactionPush) {
                                                    }
                                                    tVar32.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i30, intent2222222, 167772160);
                                                    if (bitmap2 != null) {
                                                    }
                                                    jArr = null;
                                                    if (z10) {
                                                    }
                                                    tVar32.j = -1;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                    }
                                                    i23 = 0;
                                                    if (!z17) {
                                                    }
                                                    i24 = i22;
                                                    jArr2 = new long[]{0, 0};
                                                    tVar32.E.vibrate = jArr2;
                                                    jArr3 = jArr;
                                                    if (!AndroidUtilities.needShowPasscode()) {
                                                    }
                                                    i25 = i24;
                                                    jArr4 = jArr3;
                                                    j26 = j24;
                                                    z32 = false;
                                                    if (!z32) {
                                                    }
                                                    notificationsController2.showExtraNotifications(tVar32, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z40, z22, i45222);
                                                    scheduleNotificationRepeat();
                                                    return;
                                                }
                                                tVar = tVar2;
                                                str9 = stringForMessage;
                                                point.set(i43 + 1, (int) (SystemClock.elapsedRealtime() / j3));
                                            }
                                        }
                                    }
                                    str7 = str24;
                                    str8 = str5;
                                    tVar = tVar2;
                                    str9 = stringForMessage;
                                } else {
                                    str7 = str24;
                                    str8 = str5;
                                    tVar = tVar2;
                                    str9 = stringForMessage;
                                    sharedPreferences4 = sharedPreferences3;
                                    j20 = j18;
                                }
                                z19 = z18;
                                if (z19) {
                                }
                                String path2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                z20 = ApplicationLoader.mainInterfacePaused;
                                boolean z402 = !z20;
                                getSharedPrefKey(j20, j21);
                                j22 = j21;
                                j23 = j20;
                                if (notificationsController2.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j23, j22, false)) {
                                }
                                num = null;
                                e0.t tVar322 = tVar;
                                if (messageObject.isReactionPush) {
                                }
                                z22 = z19;
                                str11 = str9;
                                num2 = num;
                                str12 = str7;
                                j25 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                if (j25 == 0) {
                                }
                                str13 = string2;
                                int i4422 = sharedPreferences4.getInt("vibrate_react", 0);
                                i13 = sharedPreferences4.getInt("priority_react", 1);
                                i14 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                if (!messageObject.isStoryReactionPush) {
                                }
                                z24 = z23;
                                i16 = i4422;
                                z25 = z21;
                                i17 = 4;
                                if (i16 != i17) {
                                }
                                if (TextUtils.isEmpty(str10)) {
                                }
                                str10 = str13;
                                z25 = z24;
                                z27 = true;
                                z28 = z26;
                                if (i12 != 3) {
                                }
                                i12 = i13;
                                if (num2 != null) {
                                }
                                if (i11 != 0) {
                                }
                                z29 = z27;
                                i11 = i18;
                                if (z20) {
                                }
                                if (z28) {
                                }
                                int i452222 = i15;
                                if (z22) {
                                }
                                Intent intent3222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                StringBuilder sb52222 = new StringBuilder();
                                sb52222.append("com.tmessages.openchat");
                                int i462222 = i19;
                                sb52222.append(Math.random());
                                sb52222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent3222.setAction(sb52222.toString());
                                intent3222.setFlags(67108864);
                                if (messageObject.isOauthPush) {
                                }
                                if (!messageObject.isStoryReactionPush) {
                                }
                                i22 = i20;
                                obj = path2;
                                z31 = z20;
                                user2 = user;
                                chat3 = chat2;
                                fileLocation = null;
                                String str252222222 = str3;
                                intent3222.putExtra(str252222222, notificationsController2.currentAccount);
                                PendingIntent activity2222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3222, 1140850688);
                                tVar322.g(string);
                                tVar322.E.icon = R.drawable.notification;
                                tVar322.h(16, true);
                                tVar322.i = notificationsController2.total_unread_count;
                                tVar322.g = activity2222222;
                                tVar322.q = notificationsController2.notificationGroup;
                                tVar322.r = true;
                                tVar322.k = true;
                                tVar322.E.when = messageObject.messageOwner.date * j3;
                                tVar322.w = -15618822;
                                tVar322.u = "msg";
                                if (chat3 == null) {
                                }
                                Intent intent22222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent22222222.putExtra("messageDate", messageObject.messageOwner.date);
                                intent22222222.putExtra(str252222222, notificationsController2.currentAccount);
                                if (messageObject.isStoryPush) {
                                }
                                if (messageObject.isStoryReactionPush) {
                                }
                                tVar322.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i30, intent22222222, 167772160);
                                if (bitmap2 != null) {
                                }
                                jArr = null;
                                if (z10) {
                                }
                                tVar322.j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                i23 = 0;
                                if (!z17) {
                                }
                                i24 = i22;
                                jArr2 = new long[]{0, 0};
                                tVar322.E.vibrate = jArr2;
                                jArr3 = jArr;
                                if (!AndroidUtilities.needShowPasscode()) {
                                }
                                i25 = i24;
                                jArr4 = jArr3;
                                j26 = j24;
                                z32 = false;
                                if (!z32) {
                                }
                                notificationsController2.showExtraNotifications(tVar322, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z402, z22, i452222);
                                scheduleNotificationRepeat();
                                return;
                            }
                            z18 = true;
                            if (z18) {
                            }
                            str7 = str24;
                            str8 = str5;
                            tVar = tVar2;
                            str9 = stringForMessage;
                            sharedPreferences4 = sharedPreferences3;
                            j20 = j18;
                            z19 = z18;
                            if (z19) {
                            }
                            String path22 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                            z20 = ApplicationLoader.mainInterfacePaused;
                            boolean z4022 = !z20;
                            getSharedPrefKey(j20, j21);
                            j22 = j21;
                            j23 = j20;
                            if (notificationsController2.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j23, j22, false)) {
                            }
                            num = null;
                            e0.t tVar3222 = tVar;
                            if (messageObject.isReactionPush) {
                            }
                            z22 = z19;
                            str11 = str9;
                            num2 = num;
                            str12 = str7;
                            j25 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                            if (j25 == 0) {
                            }
                            str13 = string2;
                            int i44222 = sharedPreferences4.getInt("vibrate_react", 0);
                            i13 = sharedPreferences4.getInt("priority_react", 1);
                            i14 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                            if (!messageObject.isStoryReactionPush) {
                            }
                            z24 = z23;
                            i16 = i44222;
                            z25 = z21;
                            i17 = 4;
                            if (i16 != i17) {
                            }
                            if (TextUtils.isEmpty(str10)) {
                            }
                            str10 = str13;
                            z25 = z24;
                            z27 = true;
                            z28 = z26;
                            if (i12 != 3) {
                            }
                            i12 = i13;
                            if (num2 != null) {
                            }
                            if (i11 != 0) {
                            }
                            z29 = z27;
                            i11 = i18;
                            if (z20) {
                            }
                            if (z28) {
                            }
                            int i4522222 = i15;
                            if (z22) {
                            }
                            Intent intent32222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                            StringBuilder sb522222 = new StringBuilder();
                            sb522222.append("com.tmessages.openchat");
                            int i4622222 = i19;
                            sb522222.append(Math.random());
                            sb522222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                            intent32222.setAction(sb522222.toString());
                            intent32222.setFlags(67108864);
                            if (messageObject.isOauthPush) {
                            }
                            if (!messageObject.isStoryReactionPush) {
                            }
                            i22 = i20;
                            obj = path22;
                            z31 = z20;
                            user2 = user;
                            chat3 = chat2;
                            fileLocation = null;
                            String str2522222222 = str3;
                            intent32222.putExtra(str2522222222, notificationsController2.currentAccount);
                            PendingIntent activity22222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32222, 1140850688);
                            tVar3222.g(string);
                            tVar3222.E.icon = R.drawable.notification;
                            tVar3222.h(16, true);
                            tVar3222.i = notificationsController2.total_unread_count;
                            tVar3222.g = activity22222222;
                            tVar3222.q = notificationsController2.notificationGroup;
                            tVar3222.r = true;
                            tVar3222.k = true;
                            tVar3222.E.when = messageObject.messageOwner.date * j3;
                            tVar3222.w = -15618822;
                            tVar3222.u = "msg";
                            if (chat3 == null) {
                            }
                            Intent intent222222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent222222222.putExtra("messageDate", messageObject.messageOwner.date);
                            intent222222222.putExtra(str2522222222, notificationsController2.currentAccount);
                            if (messageObject.isStoryPush) {
                            }
                            if (messageObject.isStoryReactionPush) {
                            }
                            tVar3222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i30, intent222222222, 167772160);
                            if (bitmap2 != null) {
                            }
                            jArr = null;
                            if (z10) {
                            }
                            tVar3222.j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                            }
                            i23 = 0;
                            if (!z17) {
                            }
                            i24 = i22;
                            jArr2 = new long[]{0, 0};
                            tVar3222.E.vibrate = jArr2;
                            jArr3 = jArr;
                            if (!AndroidUtilities.needShowPasscode()) {
                            }
                            i25 = i24;
                            jArr4 = jArr3;
                            j26 = j24;
                            z32 = false;
                            if (!z32) {
                            }
                            notificationsController2.showExtraNotifications(tVar3222, str12, j26, j22, str22, jArr2, i25, jArr4, i23, z30, z4022, z22, i4522222);
                            scheduleNotificationRepeat();
                            return;
                        }
                        z16 = z15;
                        if (!sharedPreferences2.getBoolean("EnableReactionsPreview", true)) {
                            string = LocaleController.getString(R.string.NotificationHiddenName);
                        }
                        if (z14) {
                        }
                        e0.t tVar22 = new e0.t(ApplicationLoader.applicationContext);
                        if (notificationsController2.pushMessages.size() > 1) {
                        }
                        j18 = j14;
                        sharedPreferences3 = sharedPreferences2;
                        j19 = j15;
                        str5 = str21;
                        boolean[] zArr3 = new boolean[1];
                        stringForMessage = notificationsController2.getStringForMessage(messageObject, false, zArr3, null);
                        boolean isSilentMessage2 = notificationsController2.isSilentMessage(messageObject);
                        if (stringForMessage == null) {
                        }
                    }
                } else {
                    z14 = equalsIgnoreCase;
                }
                string = !z13 ? i10 != 0 ? LocaleController.getString(R.string.NotificationHiddenChatName) : LocaleController.getString(R.string.NotificationHiddenName) : LocaleController.getString(R.string.AppName);
                z15 = false;
                if (!messageObject.isReactionPush) {
                    z16 = z15;
                    if (z14) {
                    }
                    e0.t tVar222 = new e0.t(ApplicationLoader.applicationContext);
                    if (notificationsController2.pushMessages.size() > 1) {
                    }
                    j18 = j14;
                    sharedPreferences3 = sharedPreferences2;
                    j19 = j15;
                    str5 = str21;
                    boolean[] zArr32 = new boolean[1];
                    stringForMessage = notificationsController2.getStringForMessage(messageObject, false, zArr32, null);
                    boolean isSilentMessage22 = notificationsController2.isSilentMessage(messageObject);
                    if (stringForMessage == null) {
                    }
                }
                z16 = z15;
                if (!sharedPreferences2.getBoolean("EnableReactionsPreview", true)) {
                }
                if (z14) {
                }
                e0.t tVar2222 = new e0.t(ApplicationLoader.applicationContext);
                if (notificationsController2.pushMessages.size() > 1) {
                }
                j18 = j14;
                sharedPreferences3 = sharedPreferences2;
                j19 = j15;
                str5 = str21;
                boolean[] zArr322 = new boolean[1];
                stringForMessage = notificationsController2.getStringForMessage(messageObject, false, zArr322, null);
                boolean isSilentMessage222 = notificationsController2.isSilentMessage(messageObject);
                if (stringForMessage == null) {
                }
            }
            z13 = true;
            boolean z392 = isGlobalNotificationsEnabled;
            String str222 = title;
            boolean equalsIgnoreCase2 = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            if (DialogObject.isEncryptedDialog(j14)) {
            }
            string = !z13 ? i10 != 0 ? LocaleController.getString(R.string.NotificationHiddenChatName) : LocaleController.getString(R.string.NotificationHiddenName) : LocaleController.getString(R.string.AppName);
            z15 = false;
            if (!messageObject.isReactionPush) {
            }
            z16 = z15;
            if (!sharedPreferences2.getBoolean("EnableReactionsPreview", true)) {
            }
            if (z14) {
            }
            e0.t tVar22222 = new e0.t(ApplicationLoader.applicationContext);
            if (notificationsController2.pushMessages.size() > 1) {
            }
            j18 = j14;
            sharedPreferences3 = sharedPreferences2;
            j19 = j15;
            str5 = str21;
            boolean[] zArr3222 = new boolean[1];
            stringForMessage = notificationsController2.getStringForMessage(messageObject, false, zArr3222, null);
            boolean isSilentMessage2222 = notificationsController2.isSilentMessage(messageObject);
            if (stringForMessage == null) {
            }
        } catch (Exception e11) {
            e = e11;
            FileLog.e(e);
        }
    }

    private boolean unsupportedNotificationShortcut() {
        return Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBubbles;
    }

    private void updateStoryPushesRunnable() {
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.storyPushMessages.size(); i10++) {
            Iterator<Pair<Long, Long>> it = this.storyPushMessages.get(i10).dateByIds.values().iterator();
            while (it.hasNext()) {
                j3 = Math.min(j3, ((Long) it.next().second).longValue());
            }
        }
        DispatchQueue dispatchQueue = notificationsQueue;
        dispatchQueue.cancelRunnable(this.checkStoryPushesRunnable);
        long currentTimeMillis = j3 - System.currentTimeMillis();
        if (j3 != Long.MAX_VALUE) {
            dispatchQueue.postRunnable(this.checkStoryPushesRunnable, Math.max(0L, currentTimeMillis));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x053d A[LOOP:1: B:100:0x053a->B:102:0x053d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0556 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0567 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x052f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String validateChannelId(long j3, long j10, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        String str2;
        String str3;
        String str4;
        char c10;
        String str5;
        String str6;
        String str7;
        SharedPreferences sharedPreferences;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z13;
        boolean z14;
        String str13;
        long[] jArr2;
        boolean z15;
        int i13;
        String str14;
        StringBuilder sb2;
        String str15;
        String str16;
        boolean z16;
        String str17;
        String str18;
        String str19;
        boolean z17;
        long j11;
        long[] jArr3;
        boolean z18;
        String str20;
        String str21;
        String str22;
        long[] jArr4;
        boolean z19;
        boolean z20;
        long[] jArr5;
        SharedPreferences.Editor editor;
        String str23;
        String str24;
        ensureGroupsCreated();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        String str25 = "groups";
        if (z12) {
            str2 = "other" + this.currentAccount;
            str4 = "reactions";
            str3 = null;
        } else {
            if (i12 == 2) {
                str2 = "channels" + this.currentAccount;
                str3 = "overwrite_channel";
            } else if (i12 == 0) {
                str2 = "groups" + this.currentAccount;
                str3 = "overwrite_group";
            } else if (i12 == 3) {
                str2 = "stories" + this.currentAccount;
                str3 = "overwrite_stories";
            } else if (i12 == 4 || i12 == 5) {
                str2 = "reactions" + this.currentAccount;
                str3 = "overwrite_reactions";
            } else {
                str2 = "private" + this.currentAccount;
                str3 = "overwrite_private";
            }
            str4 = "reactions";
        }
        boolean z21 = !z10 && DialogObject.isEncryptedDialog(j3);
        boolean z22 = (z11 || str3 == null || !notificationsSettings.getBoolean(str3, false)) ? false : true;
        String MD5 = Utilities.MD5(uri == null ? "NoSound2" : uri.toString());
        if (MD5 != null && MD5.length() > 5) {
            MD5 = MD5.substring(0, 5);
        }
        if (z12) {
            str25 = "silent";
            str5 = LocaleController.getString(R.string.NotificationsSilent);
            c10 = 0;
        } else if (z10) {
            str5 = LocaleController.getString(z11 ? R.string.NotificationsInAppDefault : R.string.NotificationsDefault);
            c10 = 0;
            if (i12 == 2) {
                str25 = z11 ? "channels_ia" : "channels";
            } else if (i12 == 0) {
                if (z11) {
                    str25 = "groups_ia";
                }
            } else if (i12 == 3) {
                str25 = z11 ? "stories_ia" : "stories";
            } else if (i12 == 4 || i12 == 5) {
                if (z11) {
                    str4 = "reactions_ia";
                }
                str25 = str4;
            } else {
                str25 = z11 ? "private_ia" : "private";
            }
        } else {
            c10 = 0;
            String formatString = z11 ? LocaleController.formatString(R.string.NotificationsChatInApp, str) : str;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(z11 ? "org.telegram.keyia" : "org.telegram.key");
            sb3.append(j3);
            sb3.append("_");
            sb3.append(j10);
            str25 = sb3.toString();
            str5 = formatString;
        }
        String C = a4.a.C(str25, "_", MD5);
        String string = notificationsSettings.getString(C, null);
        String string2 = notificationsSettings.getString(C + "_s", null);
        StringBuilder sb4 = new StringBuilder();
        if (string != null) {
            sharedPreferences = notificationsSettings;
            NotificationChannel notificationChannel = systemNotificationManager.getNotificationChannel(string);
            str11 = str5;
            if (BuildVars.LOGS_ENABLED) {
                z13 = z22;
                FileLog.d("current channel for " + string + " = " + notificationChannel);
            } else {
                z13 = z22;
            }
            if (notificationChannel == null) {
                str13 = "_s";
                jArr2 = jArr;
                str7 = "secret";
                str8 = C;
                str10 = "_";
                str12 = str2;
                z14 = false;
                i13 = i10;
                sb2 = sb4;
                z15 = z13;
                str16 = null;
                str15 = null;
                str14 = null;
                z16 = false;
                if (z16) {
                }
                str17 = str8;
                if (!z15) {
                }
                while (r4 < jArr2.length) {
                }
                sb2.append(i13);
                if (uri != null) {
                }
                sb2.append(i11);
                if (!z10) {
                    sb2.append(str7);
                }
                str15 = Utilities.MD5(sb2.toString());
                if (!z12) {
                    systemNotificationManager.deleteNotificationChannel(str14);
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    str18 = str15;
                    str19 = null;
                    if (str19 == null) {
                    }
                    return str19;
                }
                str18 = str15;
                str19 = str14;
                if (str19 == null) {
                }
                return str19;
            }
            if (!z12 && !z13) {
                int importance = notificationChannel.getImportance();
                Uri sound = notificationChannel.getSound();
                long[] vibrationPattern = notificationChannel.getVibrationPattern();
                boolean shouldVibrate = notificationChannel.shouldVibrate();
                str12 = str2;
                if (shouldVibrate || vibrationPattern != null) {
                    j11 = 0;
                    jArr3 = vibrationPattern;
                } else {
                    j11 = 0;
                    jArr3 = new long[2];
                    jArr3[c10] = 0;
                    jArr3[1] = 0;
                }
                int lightColor = notificationChannel.getLightColor();
                str8 = C;
                str10 = "_";
                if (jArr3 != null) {
                    int i14 = 0;
                    while (true) {
                        z18 = shouldVibrate;
                        if (i14 >= jArr3.length) {
                            break;
                        }
                        sb4.append(jArr3[i14]);
                        i14++;
                        shouldVibrate = z18;
                    }
                } else {
                    z18 = shouldVibrate;
                }
                sb4.append(lightColor);
                if (sound != null) {
                    sb4.append(sound.toString());
                }
                sb4.append(importance);
                if (!z10 && z21) {
                    sb4.append("secret");
                }
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb5 = new StringBuilder("current channel settings for ");
                    sb5.append(string);
                    sb5.append(" = ");
                    sb5.append((Object) sb4);
                    sb5.append(" old = ");
                    com.google.android.gms.internal.vision.e2.t(string2, sb5);
                }
                String MD52 = Utilities.MD5(sb4.toString());
                sb4.setLength(0);
                if (z11 && i11 != importance) {
                    jArr4 = jArr;
                    i13 = i10;
                    str20 = string2;
                    str7 = "secret";
                    str21 = string;
                    z14 = false;
                    z20 = false;
                    str13 = "_s";
                    sb2 = sb4;
                    str22 = MD52;
                    z19 = true;
                } else if (MD52.equals(string2)) {
                    i13 = i10;
                    str20 = string2;
                    str7 = "secret";
                    str21 = string;
                    z14 = false;
                    str13 = "_s";
                    sb2 = sb4;
                    str22 = MD52;
                    jArr4 = jArr;
                    z19 = z13;
                    z20 = false;
                } else {
                    str20 = string2;
                    if (importance == 0) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (z10) {
                            if (!z11) {
                                if (i12 == 3) {
                                    edit.putBoolean("EnableAllStories", false);
                                } else if (i12 == 4) {
                                    edit.putBoolean("EnableReactionsMessages", true);
                                    edit.putBoolean("EnableReactionsStories", true);
                                } else {
                                    edit.putInt(getGlobalNotificationsKey(i12), ConnectionsManager.DEFAULT_DATACENTER_ID);
                                }
                                updateServerNotificationsSettings(i12);
                            }
                            str24 = "_s";
                            str23 = "secret";
                        } else {
                            if (i12 == 3) {
                                edit.putBoolean(w1.i(j3, j11, new StringBuilder(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY)), false);
                            } else {
                                edit.putInt(w1.i(j3, j11, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 2);
                            }
                            str23 = "secret";
                            str24 = "_s";
                            updateServerNotificationsSettings(j3, 0L, true);
                        }
                        editor = edit;
                        str22 = MD52;
                        str7 = str23;
                        str21 = string;
                        str13 = str24;
                        jArr4 = jArr3;
                        sb2 = sb4;
                        z14 = false;
                        z20 = true;
                        jArr5 = jArr;
                    } else {
                        str21 = string;
                        jArr4 = jArr3;
                        str13 = "_s";
                        str22 = MD52;
                        sb2 = sb4;
                        if (importance != i11) {
                            if (z11) {
                                str7 = "secret";
                                z14 = false;
                                editor = null;
                            } else {
                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                str7 = "secret";
                                int i15 = (importance == 4 || importance == 5) ? 1 : importance == 1 ? 4 : importance == 2 ? 5 : 0;
                                if (z10) {
                                    if (i12 == 3) {
                                        edit2.putBoolean("EnableAllStories", true);
                                    } else if (i12 == 4) {
                                        edit2.putBoolean("EnableReactionsMessages", true);
                                        edit2.putBoolean("EnableReactionsStories", true);
                                    } else {
                                        z14 = false;
                                        edit2.putInt(getGlobalNotificationsKey(i12), 0);
                                        if (i12 != 2) {
                                            edit2.putInt("priority_channel", i15);
                                        } else if (i12 == 0) {
                                            edit2.putInt("priority_group", i15);
                                        } else if (i12 == 3) {
                                            edit2.putInt("priority_stories", i15);
                                        } else if (i12 == 4 || i12 == 5) {
                                            edit2.putInt("priority_react", i15);
                                        } else {
                                            edit2.putInt("priority_messages", i15);
                                        }
                                    }
                                    z14 = false;
                                    if (i12 != 2) {
                                    }
                                } else {
                                    z14 = false;
                                    if (i12 == 3) {
                                        edit2.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + j3, true);
                                    } else {
                                        edit2.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + j3, 0);
                                        edit2.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + j3);
                                        edit2.putInt("priority_" + j3, i15);
                                    }
                                }
                                editor = edit2;
                            }
                            jArr5 = jArr;
                            z20 = true;
                        } else {
                            str7 = "secret";
                            z14 = false;
                            jArr5 = jArr;
                            editor = null;
                            z20 = false;
                        }
                    }
                    boolean z23 = z18;
                    if ((!isEmptyVibration(jArr5)) != z23) {
                        if (!z11) {
                            if (editor == null) {
                                editor = sharedPreferences.edit();
                            }
                            if (!z10) {
                                editor.putInt(a4.a.o(j3, "vibrate_"), z23 ? 0 : 2);
                            } else if (i12 == 2) {
                                editor.putInt("vibrate_channel", z23 ? 0 : 2);
                            } else if (i12 == 0) {
                                editor.putInt("vibrate_group", z23 ? 0 : 2);
                            } else if (i12 == 3) {
                                editor.putInt("vibrate_stories", z23 ? 0 : 2);
                            } else if (i12 == 4 || i12 == 5) {
                                editor.putInt("vibrate_react", z23 ? 0 : 2);
                            } else {
                                editor.putInt("vibrate_messages", z23 ? 0 : 2);
                            }
                        }
                        z20 = true;
                    } else {
                        jArr4 = jArr5;
                    }
                    i13 = i10;
                    if (lightColor != i13) {
                        if (!z11) {
                            if (editor == null) {
                                editor = sharedPreferences.edit();
                            }
                            if (!z10) {
                                editor.putInt("color_" + j3, lightColor);
                            } else if (i12 == 2) {
                                editor.putInt("ChannelLed", lightColor);
                            } else if (i12 == 0) {
                                editor.putInt("GroupLed", lightColor);
                            } else if (i12 == 3) {
                                editor.putInt("StoriesLed", lightColor);
                            } else if (i12 == 5 || i12 == 4) {
                                editor.putInt("ReactionsLed", lightColor);
                            } else {
                                editor.putInt("MessagesLed", lightColor);
                            }
                        }
                        i13 = lightColor;
                        z20 = true;
                    }
                    if (editor != null) {
                        editor.commit();
                    }
                    z19 = z13;
                }
                z15 = z19;
                z16 = z20;
                str14 = str21;
                jArr2 = jArr4;
                str16 = str20;
                str15 = str22;
                if (z16 || str15 == null) {
                    str17 = str8;
                    if (!z15 || str15 == null || !z11 || !z10) {
                        for (long j12 : jArr2) {
                            sb2.append(j12);
                        }
                        sb2.append(i13);
                        if (uri != null) {
                            sb2.append(uri.toString());
                        }
                        sb2.append(i11);
                        if (!z10 && z21) {
                            sb2.append(str7);
                        }
                        str15 = Utilities.MD5(sb2.toString());
                        if (!z12 && str14 != null && (z15 || !str16.equals(str15))) {
                            try {
                                systemNotificationManager.deleteNotificationChannel(str14);
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("delete channel by settings change ".concat(str14));
                            }
                            str18 = str15;
                            str19 = null;
                            if (str19 == null) {
                                str19 = z10 ? this.currentAccount + "channel_" + str17 + str10 + Utilities.random.nextLong() : this.currentAccount + "channel_" + j3 + str10 + Utilities.random.nextLong();
                                NotificationChannel notificationChannel2 = new NotificationChannel(str19, z21 ? LocaleController.getString(R.string.SecretChatName) : str11, i11);
                                notificationChannel2.setGroup(str12);
                                if (i13 != 0) {
                                    z17 = true;
                                    notificationChannel2.enableLights(true);
                                    notificationChannel2.setLightColor(i13);
                                } else {
                                    z17 = true;
                                    notificationChannel2.enableLights(z14);
                                }
                                if (isEmptyVibration(jArr2)) {
                                    notificationChannel2.enableVibration(z14);
                                } else {
                                    notificationChannel2.enableVibration(z17);
                                    if (jArr2.length > 0) {
                                        notificationChannel2.setVibrationPattern(jArr2);
                                    }
                                }
                                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                                builder.setContentType(4);
                                builder.setUsage(5);
                                if (uri != null) {
                                    notificationChannel2.setSound(uri, builder.build());
                                } else {
                                    notificationChannel2.setSound(null, builder.build());
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("create new channel " + str19);
                                }
                                this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                                systemNotificationManager.createNotificationChannel(notificationChannel2);
                                sharedPreferences.edit().putString(str17, str19).putString(str17 + str13, str18).commit();
                            }
                            return str19;
                        }
                    }
                } else {
                    str17 = str8;
                    sharedPreferences.edit().putString(str17, str14).putString(str17 + str13, str15).commit();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("change edited channel " + str14);
                    }
                }
                str18 = str15;
                str19 = str14;
                if (str19 == null) {
                }
                return str19;
            }
            jArr2 = jArr;
            str6 = string2;
            str7 = "secret";
            str8 = C;
            str9 = string;
            str10 = "_";
            str12 = str2;
            z14 = false;
            str13 = "_s";
        } else {
            str6 = string2;
            str7 = "secret";
            sharedPreferences = notificationsSettings;
            str8 = C;
            str9 = string;
            str10 = "_";
            str11 = str5;
            str12 = str2;
            z13 = z22;
            z14 = false;
            str13 = "_s";
            jArr2 = jArr;
        }
        i13 = i10;
        sb2 = sb4;
        z15 = z13;
        str14 = str9;
        str16 = str6;
        str15 = null;
        z16 = false;
        if (z16) {
        }
        str17 = str8;
        if (!z15) {
        }
        while (r4 < jArr2.length) {
        }
        sb2.append(i13);
        if (uri != null) {
        }
        sb2.append(i11);
        if (!z10) {
        }
        str15 = Utilities.MD5(sb2.toString());
        if (!z12) {
        }
        str18 = str15;
        str19 = str14;
        if (str19 == null) {
        }
        return str19;
    }

    public void cleanup() {
        this.popupMessages.clear();
        this.popupReplyMessages.clear();
        this.channelGroupsCreated = false;
        notificationsQueue.postRunnable(new bh(this, 0));
    }

    public void clearDialogNotificationsSettings(long j3, long j10) {
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        String sharedPrefKey = getSharedPrefKey(j3, j10);
        edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey).remove(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey);
        getMessagesStorage().setDialogFlags(j3, 0L);
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j3);
        if (dialog != null) {
            dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
        }
        edit.commit();
        getNotificationsController().updateServerNotificationsSettings(j3, j10, true);
    }

    public void deleteAllNotificationChannels() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new bh(this, 5));
    }

    public void deleteNotificationChannel(long j3, long j10) {
        deleteNotificationChannel(j3, j10, -1);
    }

    public void deleteNotificationChannelGlobal(int i10) {
        deleteNotificationChannelGlobal(i10, -1);
    }

    /* renamed from: deleteNotificationChannelGlobalInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$deleteNotificationChannelGlobal$43(int i10, int i11) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            SharedPreferences.Editor edit = notificationsSettings.edit();
            if (i11 == 0 || i11 == -1) {
                if (i10 == 2) {
                    str = "channels";
                } else if (i10 == 0) {
                    str = "groups";
                } else if (i10 == 3) {
                    str = "stories";
                } else {
                    if (i10 != 4 && i10 != 5) {
                        str = "private";
                    }
                    str = "reactions";
                }
                String string = notificationsSettings.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str.concat("_s"));
                    try {
                        systemNotificationManager.deleteNotificationChannel(string);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel global internal ".concat(string));
                    }
                }
            }
            if (i11 == 1 || i11 == -1) {
                if (i10 == 2) {
                    str2 = "channels_ia";
                } else if (i10 == 0) {
                    str2 = "groups_ia";
                } else if (i10 == 3) {
                    str2 = "stories_ia";
                } else {
                    if (i10 != 4 && i10 != 5) {
                        str2 = "private_ia";
                    }
                    str2 = "reactions_ia";
                }
                String string2 = notificationsSettings.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        systemNotificationManager.deleteNotificationChannel(string2);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel global internal ".concat(string2));
                    }
                }
            }
            if (i10 == 2) {
                str3 = "overwrite_channel";
            } else if (i10 == 0) {
                str3 = "overwrite_group";
            } else if (i10 == 3) {
                str3 = "overwrite_stories";
            } else {
                if (i10 != 4 && i10 != 5) {
                    str3 = "overwrite_private";
                }
                str3 = "overwrite_reactions";
            }
            edit.remove(str3);
            edit.commit();
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            notificationsQueue.postRunnable(new wg(3, this, (String) objArr[0]));
        }
    }

    public void ensureGroupsCreated() {
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        if (this.groupsCreated == null) {
            this.groupsCreated = Boolean.valueOf(notificationsSettings.getBoolean("groupsCreated5", false));
        }
        if (!this.groupsCreated.booleanValue()) {
            try {
                String str = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                SharedPreferences.Editor editor = null;
                for (int i10 = 0; i10 < size; i10++) {
                    NotificationChannel a2 = zg.a(notificationChannels.get(i10));
                    String id2 = a2.getId();
                    if (id2.startsWith(str)) {
                        int importance = a2.getImportance();
                        if (importance != 4 && importance != 5 && !id2.contains("_ia_")) {
                            if (id2.contains("_channels_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_channel").remove("vibrate_channel").remove("ChannelSoundPath").remove("ChannelSound");
                            } else if (id2.contains("_reactions_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_react").remove("vibrate_react").remove("ReactionSoundPath").remove("ReactionSound");
                            } else if (id2.contains("_groups_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_group").remove("vibrate_group").remove("GroupSoundPath").remove("GroupSound");
                            } else if (id2.contains("_private_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_messages");
                                editor.remove("priority_group").remove("vibrate_messages").remove("GlobalSoundPath").remove("GlobalSound");
                            } else {
                                long longValue = Utilities.parseLong(id2.substring(9, id2.indexOf(95, 9))).longValue();
                                if (longValue != 0) {
                                    if (editor == null) {
                                        editor = getAccountInstance().getNotificationsSettings().edit();
                                    }
                                    editor.remove("priority_" + longValue).remove("vibrate_" + longValue).remove("sound_path_" + longValue).remove("sound_" + longValue);
                                }
                            }
                        }
                        systemNotificationManager.deleteNotificationChannel(id2);
                    }
                }
                if (editor != null) {
                    editor.commit();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            notificationsSettings.edit().putBoolean("groupsCreated5", true).commit();
            this.groupsCreated = Boolean.TRUE;
        }
        if (this.channelGroupsCreated) {
            return;
        }
        List<NotificationChannelGroup> notificationChannelGroups = systemNotificationManager.getNotificationChannelGroups();
        String str2 = "channels" + this.currentAccount;
        String str3 = "groups" + this.currentAccount;
        String str4 = "private" + this.currentAccount;
        String str5 = "stories" + this.currentAccount;
        String str6 = "reactions" + this.currentAccount;
        String str7 = "other" + this.currentAccount;
        int size2 = notificationChannelGroups.size();
        String str8 = str7;
        String str9 = str6;
        String str10 = str5;
        String str11 = str4;
        for (int i11 = 0; i11 < size2; i11++) {
            String id3 = notificationChannelGroups.get(i11).getId();
            if (str2 != null && str2.equals(id3)) {
                str2 = null;
            } else if (str3 != null && str3.equals(id3)) {
                str3 = null;
            } else if (str10 != null && str10.equals(id3)) {
                str10 = null;
            } else if (str9 != null && str9.equals(id3)) {
                str9 = null;
            } else if (str11 != null && str11.equals(id3)) {
                str11 = null;
            } else if (str8 != null && str8.equals(id3)) {
                str8 = null;
            }
            if (str2 == null && str10 == null && str9 == null && str3 == null && str11 == null && str8 == null) {
                break;
            }
        }
        if (str2 != null || str3 != null || str9 != null || str10 != null || str11 != null || str8 != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                getUserConfig().getCurrentUser();
            }
            String str12 = user != null ? " (" + ContactsController.formatName(user.first_name, user.last_name) + ")" : "";
            ArrayList arrayList = new ArrayList();
            if (str2 != null) {
                arrayList.add(new NotificationChannelGroup(str2, LocaleController.getString(R.string.NotificationsChannels) + str12));
            }
            if (str3 != null) {
                arrayList.add(new NotificationChannelGroup(str3, LocaleController.getString(R.string.NotificationsGroups) + str12));
            }
            if (str10 != null) {
                arrayList.add(new NotificationChannelGroup(str10, LocaleController.getString(R.string.NotificationsStories) + str12));
            }
            if (str9 != null) {
                arrayList.add(new NotificationChannelGroup(str9, LocaleController.getString(R.string.NotificationsReactions) + str12));
            }
            if (str11 != null) {
                arrayList.add(new NotificationChannelGroup(str11, LocaleController.getString(R.string.NotificationsPrivateChats) + str12));
            }
            if (str8 != null) {
                arrayList.add(new NotificationChannelGroup(str8, LocaleController.getString(R.string.NotificationsOther) + str12));
            }
            systemNotificationManager.createNotificationChannelGroups(arrayList);
        }
        this.channelGroupsCreated = true;
    }

    public void forceShowPopupForReply() {
        notificationsQueue.postRunnable(new bh(this, 11));
    }

    public NotificationsSettingsFacade getNotificationsSettingsFacade() {
        return this.dialogsNotificationsFacade;
    }

    public ArrayList<MessageObject> getPushMessagesSnapshot() {
        ArrayList<MessageObject> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>(this.pushMessages);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0208, code lost:
    
        if (r12.getBoolean("EnablePreviewAll", true) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x021e, code lost:
    
        r3 = r28.messageOwner;
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0231, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageService) == false) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0233, code lost:
    
        r29[0] = r23;
        r3 = r3.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0239, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetSameChatWallPaper) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0241, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.WallpaperSameNotification);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0244, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatWallPaper) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x024c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.WallpaperNotification);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x024f, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGeoProximityReached) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0257, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x025a, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x025e, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionContactSignUp) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0265, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserUpdatedPhoto) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0272, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationContactNewPhoto, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0276, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionLoginUnknownLocation) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0278, code lost:
    
        r2 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.formatDateAtTime, org.telegram.messenger.LocaleController.getInstance().getFormatterYear().format(r28.messageOwner.date * 1000), org.telegram.messenger.LocaleController.getInstance().getFormatterDay().format(r28.messageOwner.date * 1000));
        r3 = org.telegram.messenger.R.string.NotificationUnrecognizedDevice;
        r4 = getUserConfig().getCurrentUser().first_name;
        r1 = r28.messageOwner.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r3, r4, r2, r1.title, r1.address);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x030b, code lost:
    
        if (zf.d.g(r3, org.telegram.tgnet.TLRPC.TL_messageActionGameScore.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSent.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSentMe.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGift.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftPremium.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesPrice.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesRefunded.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftTon.class) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0313, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0314, code lost:
    
        r3 = r28.messageOwner;
        r5 = r3.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x031a, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPhoneCall) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x031e, code lost:
    
        if (r5.video == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0326, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageVideoIncomingMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x032d, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageIncomingMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0330, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionConferenceCall) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0334, code lost:
    
        if (r5.video == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x033c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageVideoIncomingConferenceMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0343, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageIncomingConferenceMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0348, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatAddUser) == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x034a, code lost:
    
        r6 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x034e, code lost:
    
        if (r6 != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0357, code lost:
    
        if (r5.users.size() != 1) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0359, code lost:
    
        r6 = r28.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x036c, code lost:
    
        if (r6 == 0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0376, code lost:
    
        if (r28.messageOwner.peer_id.channel_id == 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x037a, code lost:
    
        if (r4.megagroup != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0391, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelAddedByNotification, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0399, code lost:
    
        if (r6 != r20) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03ab, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroup, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03ac, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03b8, code lost:
    
        if (r1 != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03ba, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03bf, code lost:
    
        if (r9 != r1.id) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03c3, code lost:
    
        if (r4.megagroup == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03da, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelfMega, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03f0, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelf, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x040c, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r2, getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x040d, code lost:
    
        r3 = new java.lang.StringBuilder();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x041d, code lost:
    
        if (r5 >= r28.messageOwner.action.users.size()) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x041f, code lost:
    
        r6 = getMessagesController().getUser(r28.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0433, code lost:
    
        if (r6 == null) goto L918;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0435, code lost:
    
        r6 = org.telegram.messenger.UserObject.getUserName(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x043d, code lost:
    
        if (r3.length() == 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x043f, code lost:
    
        r3.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0442, code lost:
    
        r3.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0445, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0463, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r2, getTitle(r4), r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0467, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCall) == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x046b, code lost:
    
        if (r5.duration == 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0481, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupEndedCall, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0496, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupCreatedCall, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0499, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCallScheduled) == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04a1, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04a4, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionInviteToGroupCall) == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04a6, code lost:
    
        r6 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04aa, code lost:
    
        if (r6 != 0) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04b3, code lost:
    
        if (r5.users.size() != 1) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04b5, code lost:
    
        r6 = r28.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04c8, code lost:
    
        if (r6 == 0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04cc, code lost:
    
        if (r6 != r20) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04e3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedYouToCall, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04e4, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04f0, code lost:
    
        if (r1 != null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04f2, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0510, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r2, getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0511, code lost:
    
        r3 = new java.lang.StringBuilder();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0521, code lost:
    
        if (r5 >= r28.messageOwner.action.users.size()) goto L919;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0523, code lost:
    
        r6 = getMessagesController().getUser(r28.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0537, code lost:
    
        if (r6 == null) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0539, code lost:
    
        r6 = org.telegram.messenger.UserObject.getUserName(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0541, code lost:
    
        if (r3.length() == 0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0543, code lost:
    
        r3.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0546, code lost:
    
        r3.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0549, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0569, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r2, getTitle(r4), r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x056c, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0574, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingReceivedGiftNoName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0577, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByLink) == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x058e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroupByLink, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0596, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditTitle) == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x05a6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupName, r2, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x05a9, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditPhoto) != false) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05ad, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeletePhoto) == false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x05b3, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeleteUser) == false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x05b5, code lost:
    
        r5 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x05b9, code lost:
    
        if (r5 != r20) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x05d0, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickYou, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x05d8, code lost:
    
        if (r5 != r9) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x05ea, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupLeftMember, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x05eb, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r28.messageOwner.action.user_id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x05fd, code lost:
    
        if (r1 != null) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x05ff, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x061d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickMember, r2, getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0620, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatCreate) == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0628, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x062b, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelCreate) == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0633, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0636, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatMigrateTo) == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0649, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x064f, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x065d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0660, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionScreenshotTaken) == false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0668, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x066b, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayLaunch) == false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0673, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0676, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayResults) == false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x067e, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0681, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSuggestBirthday) == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0689, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x068c, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPinMessage) == false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0692, code lost:
    
        if (r4 == null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0698, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r4) == false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x069c, code lost:
    
        if (r4.megagroup == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x06a3, code lost:
    
        r1 = r28.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x06a5, code lost:
    
        if (r1 != null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x06bc, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x06c6, code lost:
    
        if (r1.isMusic() == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x06d8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusic, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x06dd, code lost:
    
        if (r1.isVideo() == false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x06e7, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0711, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r2, "📹 " + r1.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0727, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideo, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x072c, code lost:
    
        if (r1.isGif() == false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0736, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0760, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r2, "🎬 " + r1.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0776, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGif, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0780, code lost:
    
        if (r1.isVoice() == false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0792, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoice, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0797, code lost:
    
        if (r1.isRoundVideo() == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x07a9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRound, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x07ae, code lost:
    
        if (r1.isSticker() != false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x07b4, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x07ba, code lost:
    
        r6 = r1.messageOwner;
        r7 = r6.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x07c0, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x07c8, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x07f2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r2, "📎 " + r1.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0808, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFile, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x080b, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x080f, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0818, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x082f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLive, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0832, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0834, code lost:
    
        r7 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0857, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContact2, r2, getTitle(r4), org.telegram.messenger.ContactsController.formatName(r7.first_name, r7.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x085a, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x085c, code lost:
    
        r7 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0862, code lost:
    
        if (r7.poll.quiz == false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0883, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuiz2, r2, getTitle(r4), r7.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x08a3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPoll2, r2, getTitle(r4), r7.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x08a6, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x08c9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodo2, r2, getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r7).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08cc, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x08d4, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x08fe, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r2, "🖼 " + r1.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0914, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhoto, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x091c, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x092e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGame, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x092f, code lost:
    
        r6 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0931, code lost:
    
        if (r6 == null) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0937, code lost:
    
        if (r6.length() <= 0) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0939, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x093f, code lost:
    
        if (r1.length() <= 20) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0941, code lost:
    
        r6 = new java.lang.StringBuilder();
        r7 = 0;
        r6.append((java.lang.Object) r1.subSequence(0, 20));
        r6.append("...");
        r1 = r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0957, code lost:
    
        r3 = org.telegram.messenger.R.string.NotificationActionPinnedText;
        r4 = getTitle(r4);
        r5 = new java.lang.Object[3];
        r5[r7] = r2;
        r5[1] = r1;
        r5[2] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x096c, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0956, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0980, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0991, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeo, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0992, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0996, code lost:
    
        if (r1 == null) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x09ac, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmoji, r2, getTitle(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x09be, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedSticker, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x09bf, code lost:
    
        if (r4 == null) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x09c1, code lost:
    
        r1 = r28.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x09c3, code lost:
    
        if (r1 != null) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x09d3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x09d8, code lost:
    
        if (r1.isMusic() == false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x09e8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x09ed, code lost:
    
        if (r1.isVideo() == false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x09f7, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0a1d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "📹 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a2f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0a34, code lost:
    
        if (r1.isGif() == false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0a3e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0a64, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "🎬 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0a76, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0a7e, code lost:
    
        if (r1.isVoice() == false) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0a8e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0a93, code lost:
    
        if (r1.isRoundVideo() == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0aa3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0aa8, code lost:
    
        if (r1.isSticker() != false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0aae, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0ab4, code lost:
    
        r2 = r1.messageOwner;
        r6 = r2.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0aba, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0ac2, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0ae8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "📎 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0afa, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0afd, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b01, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0b09, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0b1c, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0b1f, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0b21, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0b40, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactChannel2, getTitle(r4), org.telegram.messenger.ContactsController.formatName(r6.first_name, r6.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0b43, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0b45, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0b4b, code lost:
    
        if (r6.poll.quiz == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0b68, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizChannel2, getTitle(r4), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0b84, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollChannel2, getTitle(r4), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0b87, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0ba6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoChannel2, getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r6).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0ba9, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0bb1, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0bd7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "🖼 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0be9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0bef, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0bff, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0c00, code lost:
    
        r2 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0c02, code lost:
    
        if (r2 == null) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0c08, code lost:
    
        if (r2.length() <= 0) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c0a, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0c10, code lost:
    
        if (r1.length() <= 20) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0c12, code lost:
    
        r2 = new java.lang.StringBuilder();
        r7 = 0;
        r2.append((java.lang.Object) r1.subSequence(0, 20));
        r2.append("...");
        r1 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0c28, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedTextChannel;
        r3 = getTitle(r4);
        r4 = new java.lang.Object[2];
        r4[r7] = r3;
        r4[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0c3a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0c27, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0c4b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0c5a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0c5b, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0c5f, code lost:
    
        if (r1 == null) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0c72, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0c81, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0c82, code lost:
    
        r1 = r28.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0c84, code lost:
    
        if (r1 != null) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0c90, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0c95, code lost:
    
        if (r1.isMusic() == false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0ca1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0ca6, code lost:
    
        if (r1.isVideo() == false) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0cb0, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0cd2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r2, "📹 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0ce0, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0ce5, code lost:
    
        if (r1.isGif() == false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0cef, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d11, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r2, "🎬 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d1f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0d27, code lost:
    
        if (r1.isVoice() == false) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0d33, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0d38, code lost:
    
        if (r1.isRoundVideo() == false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0d44, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0d49, code lost:
    
        if (r1.isSticker() != false) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0d4f, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0d55, code lost:
    
        r4 = r1.messageOwner;
        r6 = r4.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0d5b, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0d63, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0d85, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r2, "📎 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0d93, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0d96, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0d9a, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0da2, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0db1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0db6, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0db8, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0dd1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactUser, r2, org.telegram.messenger.ContactsController.formatName(r6.first_name, r6.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0dd4, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0dd6, code lost:
    
        r1 = ((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r6).poll;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0ddc, code lost:
    
        if (r1.quiz == false) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0df3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizUser, r2, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0e09, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollUser, r2, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0e0c, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0e27, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoUser, r2, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r6).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0e2a, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0e32, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L649;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0e54, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r2, "🖼 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0e62, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0e68, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0e74, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0e75, code lost:
    
        r4 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0e77, code lost:
    
        if (r4 == null) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0e7d, code lost:
    
        if (r4.length() <= 0) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0e7f, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0e85, code lost:
    
        if (r1.length() <= 20) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0e87, code lost:
    
        r4 = new java.lang.StringBuilder();
        r7 = 0;
        r4.append((java.lang.Object) r1.subSequence(0, 20));
        r4.append("...");
        r1 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0e9d, code lost:
    
        r3 = org.telegram.messenger.R.string.NotificationActionPinnedTextUser;
        r4 = new java.lang.Object[2];
        r4[r7] = r2;
        r4[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0eab, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0e9c, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0eb8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0ec3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0ec4, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0ec8, code lost:
    
        if (r1 == null) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0ed7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiUser, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0ee2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0ee5, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0ee7, code lost:
    
        r1 = zf.d.f(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r5).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0ef3, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0ef7, code lost:
    
        if (r25 != r20) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0f02, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabledYou, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0f12, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabled, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0f17, code lost:
    
        if (r25 != r20) goto L689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0f23, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedYou, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0f31, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedTo, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0f34, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByRequest) == false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0f3c, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0f3f, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) == false) goto L707;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0f41, code lost:
    
        r5 = (org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) r5;
        r1 = org.telegram.messenger.DialogObject.getPeerDialogId(r5.boost_peer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0f4b, code lost:
    
        if (r1 < 0) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0f4d, code lost:
    
        r1 = org.telegram.messenger.UserObject.getForcedFirstName(getMessagesController().getUser(java.lang.Long.valueOf(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0f83, code lost:
    
        return org.telegram.messenger.LocaleController.formatPluralStringComma("BoostingReceivedStars", (int) r5.stars, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0f5e, code lost:
    
        r1 = getMessagesController().getChat(java.lang.Long.valueOf(-r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x0f6b, code lost:
    
        if (r1 != null) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0f6e, code lost:
    
        r7 = getTitle(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0f72, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0f86, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPaymentRefunded) == false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0f8e, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x0f91, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoCompletions) == false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0f99, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0f9c, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoAppendTasks) == false) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0fa4, code lost:
    
        return r28.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0fa5, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0fac, code lost:
    
        if (r3.peer_id.channel_id == 0) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x0fb0, code lost:
    
        if (r4.megagroup != false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0fb6, code lost:
    
        if (r28.isVideoAvatar() == false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x0fc9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelVideoEditNotification, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0fdb, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelPhotoEditNotification, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x0fe2, code lost:
    
        if (r28.isVideoAvatar() == false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0ff6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupVideo, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x1009, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupPhoto, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1014, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationContactJoined, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x1019, code lost:
    
        if (r28.isMediaEmpty() == false) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x1023, code lost:
    
        if (android.text.TextUtils.isEmpty(r28.messageOwner.message) != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x1029, code lost:
    
        return replaceSpoilers(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x1030, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x1035, code lost:
    
        if (r28.type != 29) goto L782;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x103d, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r28) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L782;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x103f, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.MessageObject.getMedia(r28);
        r2 = r1.extended_media.size();
        r3 = 0;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x104d, code lost:
    
        if (r3 >= r2) goto L922;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x104f, code lost:
    
        r5 = r1.extended_media.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x1059, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) == false) goto L760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x105b, code lost:
    
        r4 = ((org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) r5).media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x1061, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x1069, code lost:
    
        if (org.telegram.messenger.MessageObject.isVideoDocument(r4.document) == false) goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x106b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x107b, code lost:
    
        if (r4 == false) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x107e, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x1081, code lost:
    
        r1 = org.telegram.messenger.R.string.AttachPaidMedia;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x1084, code lost:
    
        if (r2 != 1) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x1086, code lost:
    
        if (r4 == false) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x1088, code lost:
    
        r2 = org.telegram.messenger.R.string.AttachVideo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x108d, code lost:
    
        r2 = org.telegram.messenger.LocaleController.getString(r2);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x10a4, code lost:
    
        r3 = new java.lang.Object[1];
        r3[r7] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x10ac, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x108b, code lost:
    
        r2 = org.telegram.messenger.R.string.AttachPhoto;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x1094, code lost:
    
        if (r4 == false) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x1096, code lost:
    
        r3 = "Media";
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x1098, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x109d, code lost:
    
        r2 = org.telegram.messenger.LocaleController.formatPluralString(r3, r2, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x109a, code lost:
    
        r3 = "Photos";
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x106d, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1071, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) == false) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x1078, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r5).flags & 4) == 0) goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x10b1, code lost:
    
        if (r28.isVoiceOnce() == false) goto L786;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x10b9, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x10be, code lost:
    
        if (r28.isRoundOnce() == false) goto L790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x10c6, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x10c7, code lost:
    
        r2 = r28.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x10cd, code lost:
    
        if ((r2.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x10d5, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x10e7, code lost:
    
        return "🖼 " + replaceSpoilers(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x10ee, code lost:
    
        if (r28.messageOwner.media.ttl_seconds == 0) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x10f6, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x10fd, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x1102, code lost:
    
        if (r28.isVideo() == false) goto L814;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x110c, code lost:
    
        if (android.text.TextUtils.isEmpty(r28.messageOwner.message) != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x111e, code lost:
    
        return "📹 " + replaceSpoilers(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x1125, code lost:
    
        if (r28.messageOwner.media.ttl_seconds == 0) goto L812;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x112d, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x1134, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x1139, code lost:
    
        if (r28.isGame() == false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x1141, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGame);
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x1146, code lost:
    
        if (r28.isVoice() == false) goto L822;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x114e, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x1153, code lost:
    
        if (r28.isRoundVideo() == false) goto L826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x115b, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x1160, code lost:
    
        if (r28.isMusic() == false) goto L830;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x1168, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachMusic);
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x1169, code lost:
    
        r2 = r28.messageOwner.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x116f, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x1177, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachContact);
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x117a, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L842;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x1182, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r2).poll.quiz == false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x118a, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.QuizPoll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x1191, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Poll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x1194, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L846;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x119c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Todo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x119f, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L850;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x11a7, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveaway);
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x11aa, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L854;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x11b2, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveawayResults);
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x11b5, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x11b9, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L859;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x11bf, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L863;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x11c7, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLiveLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x11ca, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L890;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x11d0, code lost:
    
        if (r28.isSticker() != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x11d6, code lost:
    
        if (r28.isAnimatedSticker() == false) goto L870;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x11dd, code lost:
    
        if (r28.isGif() == false) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x11e7, code lost:
    
        if (android.text.TextUtils.isEmpty(r28.messageOwner.message) != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x11f9, code lost:
    
        return "🎬 " + replaceSpoilers(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x1200, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGif);
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x1209, code lost:
    
        if (android.text.TextUtils.isEmpty(r28.messageOwner.message) != false) goto L882;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x121b, code lost:
    
        return "📎 " + replaceSpoilers(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x1222, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDocument);
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x1223, code lost:
    
        r1 = r28.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x1227, code lost:
    
        if (r1 == null) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x1235, code lost:
    
        return org.telegram.messenger.w1.h(org.telegram.messenger.R.string.AttachSticker, w.f.g(r1, " "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x123c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachSticker);
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x123f, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaStory) == false) goto L902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x1245, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaStory) r2).via_mention == false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x1247, code lost:
    
        r1 = org.telegram.messenger.R.string.StoryNotificationMention;
        r2 = r29[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x124d, code lost:
    
        if (r2 != null) goto L897;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x125b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x1251, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x1262, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Story);
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x1269, code lost:
    
        if (android.text.TextUtils.isEmpty(r28.messageText) != false) goto L906;
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x126f, code lost:
    
        return replaceSpoilers(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x1276, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x127d, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0214, code lost:
    
        if (r12.getBoolean("EnablePreviewGroup", r6) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x021c, code lost:
    
        if (r12.getBoolean("EnablePreviewChannel", r6) != false) goto L161;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getShortStringForMessage(MessageObject messageObject, String[] strArr, boolean[] zArr) {
        String str;
        long j3;
        String str2;
        TLRPC.Chat chat;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Chat chat2;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer2;
        if (AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return LocaleController.getString(R.string.NotificationHiddenMessage);
        }
        TLRPC.Message message = messageObject.messageOwner;
        long j10 = message.dialog_id;
        TLRPC.Peer peer3 = message.peer_id;
        long j11 = peer3.chat_id;
        if (j11 == 0) {
            j11 = peer3.channel_id;
        }
        long j12 = peer3.user_id;
        if (zArr != null) {
            zArr[0] = true;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        boolean v = w1.v(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, j10, notificationsSettings, true);
        if (messageObject.isFcmMessage()) {
            if (j11 == 0 && j12 != 0) {
                if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = messageObject.localName;
                }
                if (!v || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                    if (zArr != null) {
                        zArr[0] = false;
                    }
                    return LocaleController.getString(R.string.Message);
                }
            } else if (j11 != 0) {
                if (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) {
                    strArr[0] = messageObject.localUserName;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = messageObject.localName;
                }
                if (!v || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true)))) {
                    if (zArr != null) {
                        zArr[0] = false;
                    }
                    return (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, messageObject.localUserName, messageObject.localName) : LocaleController.formatString(R.string.ChannelMessageNoText, messageObject.localName);
                }
            }
            return replaceSpoilers(messageObject);
        }
        long clientUserId = getUserConfig().getClientUserId();
        if (j12 == 0) {
            j12 = messageObject.getFromChatId();
            if (j12 == 0) {
                j12 = -j11;
            }
        } else if (j12 == clientUserId) {
            j12 = messageObject.getFromChatId();
        }
        if (j10 == 0) {
            if (j11 != 0) {
                j10 = -j11;
            } else if (j12 != 0) {
                j10 = j12;
            }
        }
        if (UserObject.isReplyUser(j10) && (messageFwdHeader2 = messageObject.messageOwner.fwd_from) != null && (peer2 = messageFwdHeader2.from_id) != null) {
            j12 = MessageObject.getPeerId(peer2);
        }
        if (j12 > 0) {
            str = null;
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j12));
            if (user != null) {
                str2 = UserObject.getUserName(user);
                if (j11 != 0) {
                    strArr[0] = str2;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str2;
                } else {
                    strArr[0] = null;
                }
            } else {
                str2 = null;
            }
            j3 = j10;
        } else {
            str = null;
            j3 = j10;
            TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j12));
            if (chat3 != null) {
                str2 = getTitle(chat3);
                strArr[0] = str2;
            } else {
                str2 = null;
            }
        }
        if (str2 != null && j12 > 0 && UserObject.isReplyUser(j3) && (messageFwdHeader = messageObject.messageOwner.fwd_from) != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long peerId = MessageObject.getPeerId(peer);
            if (DialogObject.isChatDialog(peerId) && (chat2 = getMessagesController().getChat(Long.valueOf(-peerId))) != null) {
                StringBuilder g10 = w.f.g(str2, " @ ");
                g10.append(getTitle(chat2));
                str2 = g10.toString();
                if (strArr[0] != null) {
                    strArr[0] = str2;
                }
            }
        }
        if (str2 == null) {
            return str;
        }
        if (j11 != 0) {
            chat = getMessagesController().getChat(Long.valueOf(j11));
            if (chat == null) {
                return str;
            }
            if (ChatObject.isChannel(chat) && !chat.megagroup && Build.VERSION.SDK_INT <= 27) {
                strArr[0] = str;
            }
        } else {
            chat = str;
        }
        if (DialogObject.isEncryptedDialog(j3)) {
            strArr[0] = str;
            return LocaleController.getString(R.string.NotificationHiddenMessage);
        }
        boolean z10 = ChatObject.isChannel(chat) && !chat.megagroup;
        TLRPC.Message message2 = messageObject.messageOwner;
        if (message2 != null && message2.rich_message != null) {
            return messageObject.messageText.toString();
        }
        if (v) {
            boolean z11 = (j11 != 0 || j12 == 0) ? true : true;
            if (j11 != 0) {
                if (!z10) {
                }
                if (z10) {
                }
            }
        }
        if (zArr != null) {
            zArr[0] = false;
        }
        return LocaleController.getString(R.string.Message);
    }

    public int getTotalUnreadCount() {
        return this.total_unread_count;
    }

    public boolean hasMessagesToReply() {
        for (int i10 = 0; i10 < this.pushMessages.size(); i10++) {
            MessageObject messageObject = this.pushMessages.get(i10);
            long dialogId = messageObject.getDialogId();
            if (!messageObject.isReactionPush) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !DialogObject.isEncryptedDialog(dialogId) && ((messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) && dialogId != UserObject.VERIFY && dialogId != UserObject.OAUTH)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void hideNotifications() {
        notificationsQueue.postRunnable(new bh(this, 1));
    }

    public boolean isGlobalNotificationsEnabled(long j3, boolean z10, boolean z11) {
        return isGlobalNotificationsEnabled(j3, null, z10, z11);
    }

    public void loadTopicsNotificationsExceptions(long j3, Consumer<HashSet<Integer>> consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new b4(this, j3, consumer, 25));
    }

    public void muteDialog(long j3, long j10, boolean z10) {
        if (z10) {
            getInstance(this.currentAccount).muteUntil(j3, j10, ConnectionsManager.DEFAULT_DATACENTER_ID);
            return;
        }
        boolean isGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
        boolean z11 = j10 != 0;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        if (!isGlobalNotificationsEnabled || z11) {
            edit.putInt(w1.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 0);
        } else {
            edit.remove(w1.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)));
        }
        if (j10 == 0) {
            getMessagesStorage().setDialogFlags(j3, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j3);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        updateServerNotificationsSettings(j3, j10);
    }

    public void muteUntil(long j3, long j10, int i10) {
        long j11;
        if (j3 != 0) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            boolean z10 = j10 != 0;
            boolean isGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
            String sharedPrefKey = getSharedPrefKey(j3, j10);
            if (i10 != Integer.MAX_VALUE) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 3);
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + sharedPrefKey, getConnectionsManager().getCurrentTime() + i10);
                j11 = (((long) i10) << 32) | 1;
            } else if (isGlobalNotificationsEnabled || z10) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 2);
                j11 = 1L;
            } else {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                j11 = 0;
            }
            edit.apply();
            if (j10 == 0) {
                getInstance(this.currentAccount).removeNotificationsForDialog(j3);
                MessagesStorage.getInstance(this.currentAccount).setDialogFlags(j3, j11);
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.f(j3);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i10 != Integer.MAX_VALUE || isGlobalNotificationsEnabled) {
                        tL_peerNotifySettings.mute_until = i10;
                    }
                }
            }
            getInstance(this.currentAccount).updateServerNotificationsSettings(j3, j10);
        }
    }

    public void playOutChatSound() {
        if (!this.inChatSoundEnabled || MediaController.getInstance().isRecordingAudio()) {
            return;
        }
        try {
            if (audioManager.getRingerMode() == 0) {
                return;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        notificationsQueue.postRunnable(new bh(this, 6));
    }

    public void processDeleteStory(long j3, int i10) {
        notificationsQueue.postRunnable(new fh(this, j3, i10, 0));
    }

    public void processDialogsUpdateRead(LongSparseIntArray longSparseIntArray) {
        notificationsQueue.postRunnable(new gh(this, longSparseIntArray, new ArrayList(), 0));
    }

    public void processEditedMessages(a0.i iVar) {
        TLRPC.Message message;
        if (iVar == null || iVar.m() == 0) {
            return;
        }
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            ArrayList arrayList = (ArrayList) iVar.n(i10);
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                            TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                            if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                VoIPGroupNotification.hide(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getId());
                            }
                        }
                    }
                }
            }
        }
        new ArrayList(0);
        notificationsQueue.postRunnable(new wg(4, this, iVar));
    }

    public void processIgnoreStories() {
        notificationsQueue.postRunnable(new bh(this, 3));
    }

    public void processIgnoreStoryReactions() {
        notificationsQueue.postRunnable(new bh(this, 12));
    }

    public void processLoadedUnreadMessages(a0.i iVar, ArrayList<TLRPC.Message> arrayList, ArrayList<MessageObject> arrayList2, ArrayList<TLRPC.User> arrayList3, ArrayList<TLRPC.Chat> arrayList4, ArrayList<TLRPC.EncryptedChat> arrayList5, Collection<StoryNotification> collection) {
        getMessagesController().putUsers(arrayList3, true);
        getMessagesController().putChats(arrayList4, true);
        getMessagesController().putEncryptedChats(arrayList5, true);
        notificationsQueue.postRunnable(new b5(this, arrayList, iVar, arrayList2, collection));
    }

    public void processNewMessages(ArrayList<MessageObject> arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            sb2.append(arrayList == null ? BuildConfig.BETA_URL : Integer.valueOf(arrayList.size()));
            sb2.append(" isLast=");
            z12 = z10;
            sb2.append(z12);
            sb2.append(" isFcm=");
            z13 = z11;
            sb2.append(z13);
            sb2.append(")");
            FileLog.d(sb2.toString());
        } else {
            z12 = z10;
            z13 = z11;
        }
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MessageObject messageObject = arrayList.get(i10);
                if (messageObject != null && messageObject.messageOwner != null && !messageObject.isOutOwner()) {
                    TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed || getConnectionsManager().getCurrentTime() - messageObject.messageOwner.date >= getMessagesController().callRingTimeout / 1000) {
                            VoIPGroupNotification.hide(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getId());
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(messageObject.getDialogId()));
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TLRPC.Peer peer = arrayList2.get(i11);
                                i11++;
                                hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                            }
                            StringBuilder sb3 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(DialogObject.getShortName(this.currentAccount, longValue));
                            }
                            VoIPGroupNotification.request(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getDialogId(), sb3.toString(), tL_messageActionConferenceCall.call_id, messageObject.getId(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i10);
                            i10--;
                        }
                    }
                }
                i10++;
            }
        }
        if (!arrayList.isEmpty()) {
            notificationsQueue.postRunnable(new td(this, arrayList, new ArrayList(0), z13, z12, countDownLatch, 1));
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void processReadMessages(LongSparseIntArray longSparseIntArray, long j3, int i10, int i11, boolean z10) {
        notificationsQueue.postRunnable(new o8(this, longSparseIntArray, new ArrayList(0), j3, i11, i10, z10));
    }

    public void processReadStories() {
    }

    public void processSeenStoryReactions(long j3, int i10) {
        if (j3 != getUserConfig().getClientUserId()) {
            return;
        }
        notificationsQueue.postRunnable(new ah(this, i10, 2));
    }

    public void removeDeletedHisoryFromNotifications(LongSparseIntArray longSparseIntArray) {
        notificationsQueue.postRunnable(new gh(this, longSparseIntArray, new ArrayList(0), 1));
    }

    public void removeDeletedMessagesFromNotifications(a0.i iVar, boolean z10) {
        notificationsQueue.postRunnable(new vj(this, iVar, z10, new ArrayList(0), 14));
    }

    public void removeNotificationsForDialog(long j3) {
        processReadMessages(null, j3, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j3, 0);
        processDialogsUpdateRead(longSparseIntArray);
    }

    public void repeatNotificationMaybe() {
        notificationsQueue.postRunnable(new bh(this, 2));
    }

    public void setDialogNotificationsSettings(long j3, long j10, int i10) {
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(UserConfig.selectedAccount).dialogs_dict.f(j3);
        if (i10 == 4) {
            if (isGlobalNotificationsEnabled(j3, false, false)) {
                edit.remove(w1.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)));
            } else {
                edit.putInt(w1.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 0);
            }
            getMessagesStorage().setDialogFlags(j3, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            if (i10 == 0) {
                currentTime += 3600;
            } else if (i10 == 1) {
                currentTime += 28800;
            } else if (i10 == 2) {
                currentTime += 172800;
            } else if (i10 == 3) {
                currentTime = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            long j11 = 1;
            if (i10 == 3) {
                edit.putInt(w1.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 2);
            } else {
                edit.putInt(w1.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 3);
                edit.putInt(w1.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL)), currentTime);
                j11 = 1 | (currentTime << 32);
            }
            getInstance(UserConfig.selectedAccount).removeNotificationsForDialog(j3);
            MessagesStorage.getInstance(UserConfig.selectedAccount).setDialogFlags(j3, j11);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        updateServerNotificationsSettings(j3, j10);
    }

    public void setGlobalNotificationsEnabled(int i10, int i11) {
        getAccountInstance().getNotificationsSettings().edit().putInt(getGlobalNotificationsKey(i10), i11).commit();
        updateServerNotificationsSettings(i10);
        getMessagesStorage().updateMutedDialogsFiltersCounters();
        deleteNotificationChannelGlobal(i10);
    }

    public void setInChatSoundEnabled(boolean z10) {
        this.inChatSoundEnabled = z10;
    }

    public void setLastOnlineFromOtherDevice(int i10) {
        notificationsQueue.postRunnable(new ah(this, i10, 5));
    }

    public void setOpenedDialogId(long j3, long j10) {
        notificationsQueue.postRunnable(new hd(this, j3, j10, 1));
    }

    public void setOpenedInBubble(long j3, boolean z10) {
        notificationsQueue.postRunnable(new di.q9(this, z10, j3, 3));
    }

    public void showNotifications() {
        notificationsQueue.postRunnable(new bh(this, 10));
    }

    public void updateBadge() {
        notificationsQueue.postRunnable(new bh(this, 4));
    }

    public void updateServerNotificationsSettings(long j3, long j10) {
        updateServerNotificationsSettings(j3, j10, true);
    }

    public static String getSharedPrefKey(long j3, long j10, boolean z10) {
        String valueOf;
        if (z10) {
            if (j10 == 0) {
                return String.valueOf(j3);
            }
            Locale locale = Locale.US;
            return j3 + "_" + j10;
        }
        long j11 = (j10 << 12) + j3;
        a0.i iVar = sharedPrefCachedKeys;
        int h = iVar.h(j11);
        if (h >= 0) {
            return (String) iVar.n(h);
        }
        if (j10 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j3 + "_" + j10;
        } else {
            valueOf = String.valueOf(j3);
        }
        iVar.k(valueOf, j11);
        return valueOf;
    }

    public void deleteNotificationChannel(long j3, long j10, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new t7(this, j3, j10, i10, 1));
    }

    public void deleteNotificationChannelGlobal(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new q6(this, i10, i11, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        if (r3.booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r1.megagroup == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isGlobalNotificationsEnabled(long j3, Boolean bool, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            i10 = 4;
        } else if (z11) {
            i10 = 5;
        } else if (!DialogObject.isChatDialog(j3)) {
            i10 = 1;
        } else if (bool == null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
            if (ChatObject.isChannel(chat)) {
            }
            i10 = 0;
        }
        return isGlobalNotificationsEnabled(i10);
    }

    public void processIgnoreStories(long j3) {
        notificationsQueue.postRunnable(new bi.g(this, j3, 14));
    }

    public void processReadStories(long j3, int i10) {
        notificationsQueue.postRunnable(new fh(this, j3, i10, 1));
    }

    public void updateServerNotificationsSettings(long j3, long j10, boolean z10) {
        if (z10) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
        if (DialogObject.isEncryptedDialog(j3)) {
            return;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String sharedPrefKey = getSharedPrefKey(j3, j10);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + sharedPrefKey, false);
        if (notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + sharedPrefKey)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + sharedPrefKey, true);
        }
        int i10 = notificationsSettings.getInt(w1.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), -1);
        if (i10 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i10 == 3) {
                tL_inputPeerNotifySettings4.mute_until = notificationsSettings.getInt(w1.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL)), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i10 == 2 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
            }
        }
        long j11 = notificationsSettings.getLong(w1.i(j3, j10, new StringBuilder("sound_document_id_")), 0L);
        String string = notificationsSettings.getString(w1.i(j3, j10, new StringBuilder("sound_path_")), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags |= 8;
        if (j11 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j11;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string == null) {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        } else if (string.equalsIgnoreCase("NoSound")) {
            updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
        } else {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
            tL_notificationSoundLocal.title = notificationsSettings.getString(w1.i(j3, j10, new StringBuilder("sound_")), null);
            tL_notificationSoundLocal.data = string;
            updatenotifysettings.settings.sound = tL_notificationSoundLocal;
        }
        if (j10 != 0 && j3 != getUserConfig().getClientUserId()) {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().getInputPeer(j3);
            tL_inputNotifyForumTopic.top_msg_id = (int) j10;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else if (ChatObject.isCommunity(this.currentAccount, j3)) {
            TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
            tL_inputNotifyCommunity.community = getMessagesController().getInputChannel(-j3);
            updatenotifysettings.peer = tL_inputNotifyCommunity;
        } else {
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(j3);
            updatenotifysettings.peer = tL_inputNotifyPeer;
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new id(7));
    }

    public boolean isGlobalNotificationsEnabled(int i10) {
        if (i10 == 4) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableReactionsMessages", true);
        }
        if (i10 == 5) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableReactionsStories", true);
        }
        if (i10 == 3) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableAllStories", true);
        }
        return getAccountInstance().getNotificationsSettings().getInt(getGlobalNotificationsKey(i10), 0) < getConnectionsManager().getCurrentTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$50(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$51(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$52(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void updateServerNotificationsSettings(int i10) {
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        if (i10 != 4 && i10 != 5) {
            TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
            updatenotifysettings.settings = tL_inputPeerNotifySettings;
            tL_inputPeerNotifySettings.flags = 5;
            if (i10 == 0) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableGroup2", 0);
                updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings2.flags |= 8;
                tL_inputPeerNotifySettings2.sound = getInputSound(notificationsSettings, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
            } else if (i10 != 1 && i10 != 3) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableChannel2", 0);
                updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewChannel", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings3.flags |= 8;
                tL_inputPeerNotifySettings3.sound = getInputSound(notificationsSettings, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
            } else {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableAll2", 0);
                updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewAll", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 128;
                tL_inputPeerNotifySettings4.stories_hide_sender = notificationsSettings.getBoolean("EnableHideStoriesSenders", false);
                if (notificationsSettings.contains("EnableAllStories")) {
                    TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
                    tL_inputPeerNotifySettings5.flags |= 64;
                    tL_inputPeerNotifySettings5.stories_muted = !notificationsSettings.getBoolean("EnableAllStories", true);
                }
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings6.flags |= 8;
                tL_inputPeerNotifySettings6.sound = getInputSound(notificationsSettings, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings7.flags |= 256;
                tL_inputPeerNotifySettings7.stories_sound = getInputSound(notificationsSettings, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
            }
            getConnectionsManager().sendRequest(updatenotifysettings, new id(6));
            return;
        }
        TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
        setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
        if (notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
            setreactionsnotifysettings.settings.flags |= 1;
            if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        if (notificationsSettings.getBoolean("EnableReactionsStories", true)) {
            setreactionsnotifysettings.settings.flags |= 2;
            if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        setreactionsnotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnableReactionsPreview", true);
        setreactionsnotifysettings.settings.sound = getInputSound(notificationsSettings, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new id(5));
    }
}
