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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    private static e0.l0 notificationManager;
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
    private vh.g mediaSpoilerEffect;
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public class 1NotificationHolder {
        TLRPC.Chat chat;
        long dialogId;
        int id;
        String name;
        r notification;
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

        public 1NotificationHolder(int i10, long j3, boolean z10, long j10, String str, TLRPC.User user, TLRPC.Chat chat, r rVar, long j11, String str2, long[] jArr, int i11, Uri uri, int i12, boolean z11, boolean z12, boolean z13, int i13) {
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
            this.notification = rVar;
            this.dialogId = j3;
            this.story = z10;
            this.topicId = j10;
        }

        public void call() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("show dialog notification with id " + this.id + " " + this.dialogId + " user=" + this.user + " chat=" + this.chat);
            }
            try {
                NotificationsController.notificationManager.e(null, this.id, this.notification.b());
            } catch (SecurityException e7) {
                FileLog.e(e7);
                NotificationsController.this.resetNotificationSound(this.notification, this.dialogId, this.val$lastTopicId, this.val$chatName, this.val$vibrationPattern, this.val$ledColor, this.val$sound, this.val$importance, this.val$isDefault, this.val$isInApp, this.val$isSilent, this.val$chatType);
            }
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
            notificationManager = new e0.l0(ApplicationLoader.applicationContext);
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
        this.mediaSpoilerEffect = new vh.g();
        this.spoilerChars = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.checkStoryPushesRunnable = new zg(this, 8);
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
        notificationManager = new e0.l0(ApplicationLoader.applicationContext);
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
        this.notificationDelayRunnable = new zg(this, 9);
        this.dialogsNotificationsFacade = new NotificationsSettingsFacade(this.currentAccount);
        AndroidUtilities.runOnUIThread(new zg(this, 10));
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
            if (q.w(NotificationsSettingsFacade.PROPERTY_CUSTOM, j3, sharedPreferences, false)) {
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:8:0x0023, B:11:0x005c, B:12:0x0067, B:15:0x007b, B:17:0x009b, B:19:0x00a7, B:20:0x00ad, B:22:0x00b5, B:24:0x00b9, B:26:0x00bc, B:28:0x00cc, B:30:0x00d0, B:32:0x00d5, B:33:0x00dc, B:35:0x00e0, B:36:0x00e5, B:38:0x010c, B:39:0x0114, B:41:0x011d, B:43:0x0144, B:45:0x014e, B:50:0x015c, B:55:0x0178, B:56:0x017f, B:57:0x0180, B:60:0x012a, B:62:0x0130, B:63:0x0135, B:64:0x0133, B:65:0x013a, B:66:0x0110, B:67:0x0184, B:68:0x018b, B:69:0x018c, B:70:0x0193, B:72:0x0077, B:73:0x0063), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:8:0x0023, B:11:0x005c, B:12:0x0067, B:15:0x007b, B:17:0x009b, B:19:0x00a7, B:20:0x00ad, B:22:0x00b5, B:24:0x00b9, B:26:0x00bc, B:28:0x00cc, B:30:0x00d0, B:32:0x00d5, B:33:0x00dc, B:35:0x00e0, B:36:0x00e5, B:38:0x010c, B:39:0x0114, B:41:0x011d, B:43:0x0144, B:45:0x014e, B:50:0x015c, B:55:0x0178, B:56:0x017f, B:57:0x0180, B:60:0x012a, B:62:0x0130, B:63:0x0135, B:64:0x0133, B:65:0x013a, B:66:0x0110, B:67:0x0184, B:68:0x018b, B:69:0x018c, B:70:0x0193, B:72:0x0077, B:73:0x0063), top: B:7:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String createNotificationShortcut(r rVar, long j3, String str, TLRPC.User user, TLRPC.Chat chat, e0.n0 n0Var, boolean z10) {
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
            cVar.k = new f0.f(str2);
            if (n0Var != null) {
                cVar.i = new e0.n0[]{n0Var};
                IconCompat iconCompat = n0Var.b;
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
                    rVar.getClass();
                    String str3 = cVar.b;
                    rVar.z = str3;
                    if (rVar.A == null) {
                        f0.f fVar = cVar.k;
                        if (fVar != null) {
                            rVar.A = fVar;
                        } else if (str3 != null) {
                            rVar.A = new f0.f(str3);
                        }
                    }
                    if (rVar.e == null) {
                        rVar.g(cVar.e);
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
                        rVar.D = null;
                        return str2;
                    }
                    PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160);
                    if (activity == null) {
                        throw new NullPointerException("Bubble requires non-null pending intent");
                    }
                    int i10 = (this.openedDialogId > j3 ? 1 : (this.openedDialogId == j3 ? 0 : -1)) == 0 ? 2 : 0;
                    int max = Math.max(AndroidUtilities.dp(640.0f), 0);
                    e0.p pVar = new e0.p();
                    pVar.a = activity;
                    pVar.b = d;
                    pVar.c = max;
                    pVar.d = i10 & (-2);
                    rVar.D = pVar;
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
    public void lambda$deleteNotificationChannel$43(long j3, long j10, int i10) {
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
            notificationManager.b(this.notificationId, null);
            this.pushMessages.clear();
            this.pushMessagesDict.b();
            this.lastWearNotifiedMessageId.b();
            for (int i10 = 0; i10 < this.wearNotificationsIds.m(); i10++) {
                if (!this.openedInBubbleDialogs.contains(Long.valueOf(this.wearNotificationsIds.j(i10)))) {
                    notificationManager.b(((Integer) this.wearNotificationsIds.n(i10)).intValue(), null);
                }
            }
            this.wearNotificationsIds.b();
            AndroidUtilities.runOnUIThread(new w1(19));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static String getGlobalNotificationsKey(int i10) {
        return i10 == 0 ? "EnableGroup2" : i10 == 1 ? "EnableAll2" : "EnableChannel2";
    }

    private String getGramTransferNotification(MessageObject messageObject, String str) {
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageObject.messageOwner.action;
        boolean isService = UserObject.isService(messageObject.getDialogId());
        boolean z10 = (tL_messageActionGramTransfer.comment_encrypted || TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) ? false : true;
        return LocaleController.formatString(isService ? z10 ? R.string.NotificationGramTransferUnknownComment : R.string.NotificationGramTransferUnknown : z10 ? R.string.NotificationGramTransferComment : R.string.NotificationGramTransfer, str, org.telegram.ui.Wallet.k0.q(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
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
        boolean w10 = q.w(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, j10, notificationsSettings, true);
        if (messageObject.isFcmMessage()) {
            if (j11 != 0 || j12 == 0) {
                if (j11 != 0 && (!w10 || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true))))) {
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    return (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, messageObject.localUserName, messageObject.localName) : LocaleController.formatString(R.string.ChannelMessageNoText, messageObject.localName);
                }
            } else if (!w10 || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
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
            if (!w10 || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
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
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                return getGramTransferNotification(messageObject, string);
            }
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
            if (!w10 || ((z12 || !notificationsSettings.getBoolean("EnablePreviewGroup", true)) && !(z12 && notificationsSettings.getBoolean("EnablePreviewChannel", true)))) {
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
                String title = chat3 != null ? getTitle(chat3) : null;
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
        return chat.monoforum ? ng.d.i(chat, this.currentAccount, false) : chat.title;
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
    public /* synthetic */ void lambda$cleanup$3() {
        notificationManager.b(this.currentAccount, "wallet_tonconnect");
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
                    String id2 = yg.a(notificationChannels.get(i10)).getId();
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
    public /* synthetic */ void lambda$deleteAllNotificationChannels$45() {
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
    public /* synthetic */ void lambda$didReceivedNotification$39(String str) {
        if (this.pendingVoiceLoads.remove(str)) {
            showOrUpdateNotification(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dismissNotification$38() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forceShowPopupForReply$7(ArrayList arrayList) {
        this.popupReplyMessages = arrayList;
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupNotificationActivity.class);
        intent.putExtra("force", true);
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setFlags(268763140);
        ApplicationLoader.applicationContext.startActivity(intent);
        ApplicationLoader.applicationContext.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forceShowPopupForReply$8() {
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
        AndroidUtilities.runOnUIThread(new ch(this, arrayList, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$hideNotifications$37() {
        notificationManager.b(this.notificationId, null);
        this.lastWearNotifiedMessageId.b();
        for (int i10 = 0; i10 < this.wearNotificationsIds.m(); i10++) {
            notificationManager.b(((Integer) this.wearNotificationsIds.n(i10)).intValue(), null);
        }
        this.wearNotificationsIds.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$loadRoundAvatar$47(Canvas canvas) {
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
    public static /* synthetic */ void lambda$loadRoundAvatar$48(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setPostProcessor(new dh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadTopicsNotificationsExceptions$54(Consumer consumer, HashSet hashSet) {
        if (consumer != null) {
            consumer.x(hashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopicsNotificationsExceptions$55(long j3, Consumer consumer) {
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
        AndroidUtilities.runOnUIThread(new vg(2, consumer, hashSet));
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
    public static /* synthetic */ void lambda$playInChatSound$40(SoundPool soundPool, int i10, int i11) {
        if (i11 == 0) {
            try {
                soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playInChatSound$41() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundPlay) <= 500) {
            return;
        }
        try {
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new ah(0));
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
    public static /* synthetic */ void lambda$playOutChatSound$49(SoundPool soundPool, int i10, int i11) {
        if (i11 == 0) {
            try {
                soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playOutChatSound$50() {
        try {
            if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundOutPlay) <= 100) {
                return;
            }
            this.lastSoundOutPlay = SystemClock.elapsedRealtime();
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new ah(1));
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
    public /* synthetic */ void lambda$processDeleteStory$16(long j3, int i10) {
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
    public /* synthetic */ void lambda$processDialogsUpdateRead$29(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDialogsUpdateRead$30(int i10) {
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
    public /* synthetic */ void lambda$processDialogsUpdateRead$31(LongSparseIntArray longSparseIntArray, ArrayList arrayList) {
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
            AndroidUtilities.runOnUIThread(new ch(this, arrayList, 2));
        }
        if (i11 != this.total_unread_count) {
            if (this.notifyCheck) {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            } else {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            }
            AndroidUtilities.runOnUIThread(new fh(this, this.pushDialogs.m(), 2));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processEditedMessages$23(a0.i iVar) {
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
    public /* synthetic */ void lambda$processIgnoreStories$18() {
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
    public /* synthetic */ void lambda$processIgnoreStories$20(long j3) {
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
    public /* synthetic */ void lambda$processIgnoreStoryReactions$19() {
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
    public /* synthetic */ void lambda$processLoadedUnreadMessages$33(int i10) {
        if (this.total_unread_count == 0) {
            this.popupMessages.clear();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedUnreadMessages$34(ArrayList arrayList, a0.i iVar, ArrayList arrayList2, Collection collection) {
        MessageObject messageObject;
        boolean z10;
        long j3;
        SharedPreferences sharedPreferences;
        int i10;
        boolean z11;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j10;
        long j11;
        int i11;
        TLRPC.Message message;
        long j12;
        int i12;
        long j13;
        TLRPC.Message message2;
        boolean z12;
        SharedPreferences sharedPreferences2;
        NotificationsController notificationsController = this;
        notificationsController.pushDialogs.b();
        notificationsController.pushMessages.clear();
        notificationsController.pushMessagesDict.b();
        notificationsController.storyPushMessages.clear();
        notificationsController.storyPushMessagesDict.b();
        boolean z13 = false;
        notificationsController.total_unread_count = 0;
        notificationsController.personalCount = 0;
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        a0.i iVar2 = new a0.i();
        long j14 = 0;
        if (arrayList != null) {
            int i13 = 0;
            while (i13 < arrayList.size()) {
                TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i13);
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
                            MessageObject messageObject2 = new MessageObject(notificationsController.currentAccount, message3, z13, z13);
                            if (notificationsController.isPersonalMessage(messageObject2)) {
                                notificationsController.personalCount++;
                            }
                            long dialogId = messageObject2.getDialogId();
                            long topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject2.messageOwner, getMessagesController().isForum(messageObject2));
                            if (messageObject2.messageOwner.mentioned) {
                                i11 = i13;
                                message = message3;
                                j12 = messageObject2.getFromChatId();
                            } else {
                                i11 = i13;
                                message = message3;
                                j12 = dialogId;
                            }
                            int h = iVar2.h(j12);
                            if (h < 0 || topicId != j11) {
                                i12 = i11;
                                j13 = j10;
                                TLRPC.Message message4 = message;
                                notificationsController = this;
                                int notifyOverride = notificationsController.getNotifyOverride(notificationsSettings, j12, topicId);
                                boolean isGlobalNotificationsEnabled = notifyOverride == -1 ? notificationsController.isGlobalNotificationsEnabled(j12, messageObject2.isReactionPush, messageObject2.isStoryReactionPush) : notifyOverride != 2;
                                message2 = message4;
                                iVar2.k(Boolean.valueOf(isGlobalNotificationsEnabled), j12);
                                z12 = isGlobalNotificationsEnabled;
                            } else {
                                z12 = ((Boolean) iVar2.n(h)).booleanValue();
                                i12 = i11;
                                j13 = j10;
                                message2 = message;
                                notificationsController = this;
                            }
                            sharedPreferences2 = notificationsSettings;
                            if (z12) {
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
                            i13 = i12 + 1;
                            notificationsSettings = sharedPreferences2;
                            j14 = j11;
                            z13 = false;
                        } else {
                            sharedPreferences2 = notificationsSettings;
                            i12 = i13;
                            i13 = i12 + 1;
                            notificationsSettings = sharedPreferences2;
                            j14 = j11;
                            z13 = false;
                        }
                    }
                }
                sharedPreferences2 = notificationsSettings;
                i12 = i13;
                j11 = j14;
                i13 = i12 + 1;
                notificationsSettings = sharedPreferences2;
                j14 = j11;
                z13 = false;
            }
        }
        SharedPreferences sharedPreferences3 = notificationsSettings;
        long j17 = j14;
        int i14 = 0;
        while (i14 < iVar.m()) {
            long j18 = iVar.j(i14);
            int h10 = iVar2.h(j18);
            if (h10 >= 0) {
                z11 = ((Boolean) iVar2.n(h10)).booleanValue();
                sharedPreferences = sharedPreferences3;
                i10 = 0;
            } else {
                sharedPreferences = sharedPreferences3;
                int notifyOverride2 = notificationsController.getNotifyOverride(sharedPreferences, j18, 0L);
                if (notifyOverride2 == -1) {
                    i10 = 0;
                    z11 = notificationsController.isGlobalNotificationsEnabled(j18, false, false);
                } else {
                    i10 = 0;
                    z11 = notifyOverride2 != 2;
                }
                iVar2.k(Boolean.valueOf(z11), j18);
            }
            if (z11) {
                Integer num2 = (Integer) iVar.n(i14);
                int intValue = num2.intValue();
                notificationsController.pushDialogs.k(num2, j18);
                if (!notificationsController.getMessagesController().isCommunity(j18)) {
                    if (notificationsController.getMessagesController().isForum(j18)) {
                        notificationsController.total_unread_count += intValue > 0 ? 1 : i10;
                    } else {
                        notificationsController.total_unread_count += intValue;
                    }
                }
            }
            i14++;
            sharedPreferences3 = sharedPreferences;
        }
        SharedPreferences sharedPreferences4 = sharedPreferences3;
        if (arrayList2 != null) {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList2.get(i15);
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
            Collections.sort(notificationsController.storyPushMessages, Comparator$-CC.comparingLong(new ie(2)));
        }
        AndroidUtilities.runOnUIThread(new fh(notificationsController, notificationsController.pushDialogs.m(), 7));
        notificationsController.showOrUpdateNotification(SystemClock.elapsedRealtime() / 1000 < 60);
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processNewMessages$25(int i10) {
        a0.i iVar = new a0.i();
        iVar.k(e9.q.p(Integer.valueOf(i10)), 0L);
        removeDeletedMessagesFromNotifications(iVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processNewMessages$26(ArrayList arrayList, int i10) {
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
    public /* synthetic */ void lambda$processNewMessages$27(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5, types: [int] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processNewMessages$28(ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        long j3;
        boolean z12;
        boolean z13;
        int i10;
        Integer num;
        boolean z14;
        boolean z15;
        int i11;
        SharedPreferences sharedPreferences;
        boolean z16;
        long j10;
        long j11;
        String str;
        long j12;
        long j13;
        String str2;
        long j14;
        int i12;
        boolean z17;
        long j15;
        boolean z18;
        long j16;
        MessageObject messageObject;
        SparseArray sparseArray;
        long j17;
        NotificationsController notificationsController = this;
        ArrayList arrayList3 = arrayList;
        a0.i iVar = new a0.i();
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        boolean z19 = true;
        boolean z20 = notificationsSettings.getBoolean("PinnedMessages", true);
        int i13 = 0;
        boolean z21 = false;
        int i14 = 0;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        while (i13 < arrayList3.size()) {
            MessageObject messageObject2 = (MessageObject) arrayList3.get(i13);
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
                z15 = z20;
                i11 = i13;
                i13 = i11 + 1;
                arrayList3 = arrayList;
                z20 = z15;
                notificationsSettings = sharedPreferences;
                z19 = true;
            }
            if (!MessageObject.isTopicActionMessage(messageObject2)) {
                if (messageObject2.isStoryPush) {
                    long currentTimeMillis = messageObject2.messageOwner == null ? System.currentTimeMillis() : r3.date * 1000;
                    long dialogId = messageObject2.getDialogId();
                    int id2 = messageObject2.getId();
                    StoryNotification storyNotification = (StoryNotification) notificationsController.storyPushMessagesDict.f(dialogId);
                    if (storyNotification != null) {
                        storyNotification.dateByIds.put(Integer.valueOf(id2), new Pair<>(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z25 = storyNotification.hidden;
                        boolean z26 = messageObject2.isStoryPushHidden;
                        if (z25 != z26) {
                            storyNotification.hidden = z26;
                            z24 = z19;
                        }
                        storyNotification.date = storyNotification.getLeastDate();
                        notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification);
                        z22 = z19;
                    } else {
                        StoryNotification storyNotification2 = new StoryNotification(dialogId, messageObject2.localName, id2, currentTimeMillis);
                        storyNotification2.hidden = messageObject2.isStoryPushHidden;
                        notificationsController.storyPushMessages.add(storyNotification2);
                        notificationsController.storyPushMessagesDict.k(storyNotification2, dialogId);
                        notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification2);
                        z21 = z19;
                        z24 = z21;
                    }
                    Collections.sort(notificationsController.storyPushMessages, Comparator$-CC.comparingLong(new ie(1)));
                    sharedPreferences = notificationsSettings;
                    z15 = z20;
                    i11 = i13;
                    i13 = i11 + 1;
                    arrayList3 = arrayList;
                    z20 = z15;
                    notificationsSettings = sharedPreferences;
                    z19 = true;
                } else {
                    if (messageObject2.isOauthPush) {
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        if (message2 != null) {
                            int i15 = message2.id;
                            boolean z27 = z19;
                            z15 = z20;
                            long j18 = message2.date + 60;
                            z14 = z27;
                            i11 = i13;
                            long currentTime = ConnectionsManager.getInstance(notificationsController.currentAccount).getCurrentTime();
                            if (currentTime <= j18) {
                                AndroidUtilities.runOnUIThread(new fh(notificationsController, i15, 3), (j18 - currentTime) * 1000);
                            }
                            sharedPreferences = notificationsSettings;
                            i13 = i11 + 1;
                            arrayList3 = arrayList;
                            z20 = z15;
                            notificationsSettings = sharedPreferences;
                            z19 = true;
                        }
                        sharedPreferences = notificationsSettings;
                        z15 = z20;
                        i11 = i13;
                        i13 = i11 + 1;
                        arrayList3 = arrayList;
                        z20 = z15;
                        notificationsSettings = sharedPreferences;
                        z19 = true;
                    } else {
                        z14 = z19;
                        z15 = z20;
                        i11 = i13;
                    }
                    int id3 = messageObject2.getId();
                    long j19 = messageObject2.isFcmMessage() ? messageObject2.messageOwner.random_id : 0L;
                    long dialogId2 = messageObject2.getDialogId();
                    if (messageObject2.isFcmMessage()) {
                        z16 = messageObject2.localChannel;
                    } else {
                        if (DialogObject.isChatDialog(dialogId2)) {
                            TLRPC.Chat chat = notificationsController.getMessagesController().getChat(Long.valueOf(-dialogId2));
                            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                                z16 = z14;
                            }
                        }
                        z16 = false;
                    }
                    if (messageObject2.isStoryReactionPush) {
                        j10 = messageObject2.getDialogId();
                    } else {
                        long j20 = messageObject2.messageOwner.peer_id.channel_id;
                        j10 = j20 != 0 ? -j20 : 0L;
                    }
                    SparseArray sparseArray2 = (SparseArray) notificationsController.pushMessagesDict.f(j10);
                    MessageObject messageObject3 = sparseArray2 != null ? (MessageObject) sparseArray2.get(id3) : null;
                    SharedPreferences sharedPreferences2 = notificationsSettings;
                    if (messageObject3 == null) {
                        j11 = j19;
                        long j21 = messageObject2.messageOwner.random_id;
                        if (j21 != 0 && (messageObject3 = (MessageObject) notificationsController.fcmRandomMessagesDict.f(j21)) != null) {
                            notificationsController.fcmRandomMessagesDict.l(messageObject2.messageOwner.random_id);
                        }
                    } else {
                        j11 = j19;
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
                                j17 = j10;
                                i14 = notificationsController.addToPopupMessages(arrayList2, messageObject2, dialogId2, z16, sharedPreferences2);
                                notificationsSettings = sharedPreferences2;
                            } else {
                                j17 = j10;
                                notificationsSettings = sharedPreferences2;
                            }
                            if (z10 && (z22 = messageObject2.localEdit)) {
                                notificationsController.getMessagesStorage().putPushMessage(messageObject2);
                            }
                        } else {
                            j17 = j10;
                            notificationsSettings = sharedPreferences2;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + j17 + ", mid=" + id3);
                        }
                    } else {
                        notificationsSettings = sharedPreferences2;
                        long j22 = j10;
                        boolean z28 = z16;
                        if (!z22) {
                            if (z10 && !messageObject2.isOauthPush) {
                                notificationsController.getMessagesStorage().putPushMessage(messageObject2);
                            }
                            sharedPreferences = notificationsSettings;
                            long topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject2.messageOwner, notificationsController.getMessagesController().isForum(messageObject2));
                            if (dialogId2 != notificationsController.openedDialogId || !ApplicationLoader.isScreenOn || messageObject2.isStoryReactionPush || messageObject2.isOauthPush) {
                                TLRPC.Message message3 = messageObject2.messageOwner;
                                if (!message3.mentioned) {
                                    str = ")";
                                    j12 = dialogId2;
                                    j13 = j12;
                                } else if (z15 || !(message3.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                    str = ")";
                                    j13 = dialogId2;
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
                                    str2 = str;
                                    j14 = j13;
                                    i12 = i14;
                                    z17 = z22;
                                    int notifyOverride = notificationsController.getNotifyOverride(sharedPreferences, j12, topicId);
                                    sharedPreferences = sharedPreferences;
                                    j15 = j12;
                                    topicId = topicId;
                                    if (notifyOverride == -1) {
                                        boolean isGlobalNotificationsEnabled = isGlobalNotificationsEnabled(j15, Boolean.valueOf(z28), messageObject2.isReactionPush, messageObject2.isStoryReactionPush);
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + j15 + ", " + z28 + ", " + messageObject2.isReactionPush + ", " + messageObject2.isStoryReactionPush + ") = " + isGlobalNotificationsEnabled);
                                        }
                                        z18 = isGlobalNotificationsEnabled;
                                    } else {
                                        z18 = notifyOverride != 2 ? z14 : false;
                                    }
                                    iVar.k(Boolean.valueOf(z18), j15);
                                } else {
                                    j14 = j13;
                                    z18 = ((Boolean) iVar.n(h)).booleanValue();
                                    i12 = i14;
                                    z17 = z22;
                                    str2 = str;
                                    j15 = j12;
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("NotificationsController: process new messages, value is " + z18 + " (" + j15 + ", " + z28 + ", " + messageObject2.isReactionPush + ", " + messageObject2.isStoryReactionPush + str2);
                                }
                                if (z18) {
                                    notificationsController = this;
                                    j16 = j15;
                                    messageObject = messageObject2;
                                    i14 = !z10 ? notificationsController.addToPopupMessages(arrayList2, messageObject, j16, z28, sharedPreferences) : i12;
                                    if (!z23) {
                                        z23 = messageObject.messageOwner.from_scheduled;
                                    }
                                    notificationsController.delayedPushMessages.add(messageObject);
                                    notificationsController.appendMessage(messageObject);
                                    if (id3 != 0) {
                                        if (sparseArray2 == null) {
                                            sparseArray = new SparseArray();
                                            notificationsController.pushMessagesDict.k(sparseArray, j22);
                                        } else {
                                            sparseArray = sparseArray2;
                                        }
                                        sparseArray.put(id3, messageObject);
                                    } else if (j11 != 0) {
                                        notificationsController.fcmRandomMessagesDict.k(messageObject, j11);
                                    }
                                    long j23 = j14;
                                    if (j23 != j16) {
                                        Integer num2 = (Integer) notificationsController.pushDialogsOverrideMention.f(j23);
                                        notificationsController.pushDialogsOverrideMention.k(Integer.valueOf((int) (num2 == null ? z14 : num2.intValue() + 1)), j23);
                                    }
                                } else {
                                    notificationsController = this;
                                    j16 = j15;
                                    messageObject = messageObject2;
                                    i14 = i12;
                                }
                                if (messageObject.isReactionPush) {
                                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                    sparseBooleanArray.put(id3, z14);
                                    notificationsController.getMessagesController().checkUnreadReactions(j16, topicId, sparseBooleanArray);
                                }
                                z22 = z17;
                                z21 = true;
                            } else {
                                if (!z10) {
                                    notificationsController.playInChatSound();
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because chat is already opened (openedDialogId = " + notificationsController.openedDialogId + ")");
                                }
                            }
                            i13 = i11 + 1;
                            arrayList3 = arrayList;
                            z20 = z15;
                            notificationsSettings = sharedPreferences;
                            z19 = true;
                        } else if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("skipped message because edited");
                        }
                    }
                    sharedPreferences = notificationsSettings;
                    i13 = i11 + 1;
                    arrayList3 = arrayList;
                    z20 = z15;
                    notificationsSettings = sharedPreferences;
                    z19 = true;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
            }
            sharedPreferences = notificationsSettings;
            z15 = z20;
            i11 = i13;
            i13 = i11 + 1;
            arrayList3 = arrayList;
            z20 = z15;
            notificationsSettings = sharedPreferences;
            z19 = true;
        }
        SharedPreferences sharedPreferences3 = notificationsSettings;
        int i16 = i14;
        boolean z29 = z22;
        if (z21) {
            notificationsController.notifyCheck = z11;
        }
        if (!arrayList2.isEmpty() && !AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            AndroidUtilities.runOnUIThread(new r4(notificationsController, arrayList2, i16, 20));
        }
        if (z10 || z23) {
            if (z29) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + notificationsController.notifyCheck);
                }
                notificationsController.delayedPushMessages.clear();
                notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
            } else if (z21) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: added branch");
                }
                MessageObject messageObject5 = (MessageObject) arrayList.get(0);
                long dialogId3 = messageObject5.getDialogId();
                long topicId2 = MessageObject.getTopicId(notificationsController.currentAccount, messageObject5.messageOwner, notificationsController.getMessagesController().isForum(dialogId3));
                Boolean valueOf = messageObject5.isFcmMessage() ? Boolean.valueOf(messageObject5.localChannel) : null;
                int i17 = notificationsController.total_unread_count;
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
                if (num3 != null) {
                    z13 = true;
                    i10 = num3.intValue() + 1;
                } else {
                    z13 = true;
                    i10 = 1;
                }
                if (notificationsController.notifyCheck && !z12 && (num = (Integer) notificationsController.pushDialogsOverrideMention.f(j3)) != null && num.intValue() != 0) {
                    i10 = num.intValue();
                    z12 = z13;
                }
                if (z12 && !messageObject5.isStoryPush) {
                    if (!notificationsController.getMessagesController().isCommunity(j3)) {
                        if (notificationsController.getMessagesController().isForum(j3)) {
                            int i18 = notificationsController.total_unread_count - ((num3 == null || num3.intValue() <= 0) ? 0 : z13);
                            notificationsController.total_unread_count = i18;
                            notificationsController.total_unread_count = i18 + (i10 > 0 ? z13 : 0);
                        } else {
                            if (num3 != null) {
                                notificationsController.total_unread_count -= num3.intValue();
                            }
                            notificationsController.total_unread_count += i10;
                        }
                    }
                    notificationsController.pushDialogs.k(Integer.valueOf(i10), j3);
                }
                if (i17 != notificationsController.total_unread_count || z24) {
                    notificationsController.delayedPushMessages.clear();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("NotificationsController processNewMessages: added branch: " + notificationsController.notifyCheck);
                    }
                    notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
                    AndroidUtilities.runOnUIThread(new fh(notificationsController, notificationsController.pushDialogs.m(), 4));
                }
                notificationsController.notifyCheck = false;
                if (notificationsController.showBadgeNumber) {
                    notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
                }
            }
        }
        if (z24) {
            notificationsController.updateStoryPushesRunnable();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processReadMessages$21(ArrayList arrayList) {
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
    public /* synthetic */ void lambda$processReadMessages$22(LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
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
    public /* synthetic */ void lambda$processReadStories$17(long j3, int i10) {
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
    public /* synthetic */ void lambda$processSeenStoryReactions$15(int i10) {
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
    public /* synthetic */ void lambda$removeDeletedHisoryFromNotifications$12(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedHisoryFromNotifications$13(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedHisoryFromNotifications$14(LongSparseIntArray longSparseIntArray, ArrayList arrayList) {
        Integer num;
        int i10 = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        int i11 = 0;
        Integer num2 = 0;
        int i12 = 0;
        while (i12 < longSparseIntArray.size()) {
            long keyAt = longSparseIntArray.keyAt(i12);
            long j3 = -keyAt;
            long j10 = longSparseIntArray.get(keyAt);
            Integer num3 = (Integer) this.pushDialogs.f(j3);
            if (num3 == null) {
                num3 = num2;
            }
            int i13 = i11;
            Integer num4 = num3;
            while (i13 < this.pushMessages.size()) {
                MessageObject messageObject = this.pushMessages.get(i13);
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
                        i13--;
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                        num4 = Integer.valueOf(num4.intValue() - 1);
                    }
                } else {
                    num = num2;
                }
                i13++;
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
                        int i14 = this.total_unread_count - (num3.intValue() > 0 ? 1 : 0);
                        this.total_unread_count = i14;
                        this.total_unread_count = i14 + (num4.intValue() > 0 ? 1 : 0);
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
            i12++;
            num2 = num5;
            i11 = 0;
        }
        if (arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new ch(this, arrayList, 4));
        }
        if (i10 != this.total_unread_count) {
            if (this.notifyCheck) {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            } else {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            }
            AndroidUtilities.runOnUIThread(new fh(this, this.pushDialogs.m(), 6));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedMessagesFromNotifications$10(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedMessagesFromNotifications$11(a0.i iVar, boolean z10, ArrayList arrayList) {
        Integer num;
        int i10;
        Integer num2;
        int i11;
        Integer num3;
        a0.i iVar2 = iVar;
        int i12 = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        int i13 = 0;
        Integer num4 = 0;
        int i14 = 0;
        while (i14 < iVar2.m()) {
            long j3 = iVar2.j(i14);
            SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j3);
            if (sparseArray == null) {
                num = num4;
                i10 = i14;
            } else {
                ArrayList arrayList2 = (ArrayList) iVar2.f(j3);
                int size = arrayList2.size();
                int i15 = i13;
                while (i15 < size) {
                    int intValue = ((Integer) arrayList2.get(i15)).intValue();
                    MessageObject messageObject = (MessageObject) sparseArray.get(intValue);
                    if (messageObject == null) {
                        num2 = num4;
                        i11 = i14;
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
                            i11 = i14;
                        } else {
                            i11 = i14;
                            if (!getMessagesController().isCommunity(dialogId)) {
                                if (getMessagesController().isForum(dialogId)) {
                                    int i16 = this.total_unread_count - (num5.intValue() > 0 ? 1 : 0);
                                    this.total_unread_count = i16;
                                    this.total_unread_count = i16 + (num3.intValue() > 0 ? 1 : 0);
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
                        i11 = i14;
                    }
                    i15++;
                    num4 = num2;
                    i14 = i11;
                }
                num = num4;
                i10 = i14;
                if (sparseArray.size() == 0) {
                    this.pushMessagesDict.l(j3);
                }
            }
            i14 = i10 + 1;
            iVar2 = iVar;
            num4 = num;
            i13 = 0;
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
            AndroidUtilities.runOnUIThread(new fh(this, this.pushDialogs.m(), 5));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedMessagesFromNotifications$9(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$repeatNotificationMaybe$42() {
        int i10 = Calendar.getInstance().get(11);
        if (i10 < 11 || i10 > 22) {
            scheduleNotificationRepeat();
        } else {
            notificationManager.b(this.notificationId, null);
            showOrUpdateNotification(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLastOnlineFromOtherDevice$6(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set last online from other device = " + i10);
        }
        this.lastOnlineFromOtherDevice = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpenedDialogId$4(long j3, long j10) {
        this.openedDialogId = j3;
        this.openedTopicId = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpenedInBubble$5(boolean z10, long j3) {
        if (z10) {
            this.openedInBubbleDialogs.add(Long.valueOf(j3));
        } else {
            this.openedInBubbleDialogs.remove(Long.valueOf(j3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showExtraNotifications$46(Uri uri, File file) {
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
    public /* synthetic */ void lambda$showNotifications$36() {
        showOrUpdateNotification(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$showTonConnectNotification$2(String str, long j3) {
        boolean z10;
        String string;
        if (getUserConfig().isClientActivated()) {
            if (SharedConfig.showNotificationsForAllAccounts || this.currentAccount == UserConfig.selectedAccount) {
                try {
                    String str2 = "wallet_tonconnect_" + this.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemNotificationManager.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    boolean z11 = false;
                    if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter && getAccountInstance().getNotificationsSettings().getBoolean("EnablePreviewAll", true)) {
                        z10 = false;
                        if (!TextUtils.isEmpty(str) && !z10) {
                            string = LocaleController.formatString(R.string.NotificationWalletTonConnectRequestDapp, str);
                            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                            intent.putExtra("currentAccount", this.currentAccount);
                            intent.addFlags(67108864);
                            PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, this.currentAccount, intent, 201326592);
                            r rVar = new r(ApplicationLoader.applicationContext, str2);
                            rVar.E.icon = R.drawable.notification;
                            rVar.e = r.d(LocaleController.getString(R.string.AppName));
                            rVar.f = r.d(string);
                            e0.m mVar = new e0.m(z11);
                            mVar.f = r.d(string);
                            rVar.n(mVar);
                            rVar.u = "event";
                            rVar.x = 0;
                            rVar.E.when = j3;
                            rVar.h(16, true);
                            rVar.g = activity;
                            notificationManager.e("wallet_tonconnect", this.currentAccount, rVar.b());
                        }
                        string = LocaleController.getString(R.string.NotificationWalletTonConnectRequest);
                        Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent2.putExtra("currentAccount", this.currentAccount);
                        intent2.addFlags(67108864);
                        PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, this.currentAccount, intent2, 201326592);
                        r rVar2 = new r(ApplicationLoader.applicationContext, str2);
                        rVar2.E.icon = R.drawable.notification;
                        rVar2.e = r.d(LocaleController.getString(R.string.AppName));
                        rVar2.f = r.d(string);
                        e0.m mVar2 = new e0.m(z11);
                        mVar2.f = r.d(string);
                        rVar2.n(mVar2);
                        rVar2.u = "event";
                        rVar2.x = 0;
                        rVar2.E.when = j3;
                        rVar2.h(16, true);
                        rVar2.g = activity2;
                        notificationManager.e("wallet_tonconnect", this.currentAccount, rVar2.b());
                    }
                    z10 = true;
                    if (!TextUtils.isEmpty(str)) {
                        string = LocaleController.formatString(R.string.NotificationWalletTonConnectRequestDapp, str);
                        Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                        intent22.setAction("android.intent.action.VIEW");
                        intent22.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent22.putExtra("currentAccount", this.currentAccount);
                        intent22.addFlags(67108864);
                        PendingIntent activity22 = PendingIntent.getActivity(ApplicationLoader.applicationContext, this.currentAccount, intent22, 201326592);
                        r rVar22 = new r(ApplicationLoader.applicationContext, str2);
                        rVar22.E.icon = R.drawable.notification;
                        rVar22.e = r.d(LocaleController.getString(R.string.AppName));
                        rVar22.f = r.d(string);
                        e0.m mVar22 = new e0.m(z11);
                        mVar22.f = r.d(string);
                        rVar22.n(mVar22);
                        rVar22.u = "event";
                        rVar22.x = 0;
                        rVar22.E.when = j3;
                        rVar22.h(16, true);
                        rVar22.g = activity22;
                        notificationManager.e("wallet_tonconnect", this.currentAccount, rVar22.b());
                    }
                    string = LocaleController.getString(R.string.NotificationWalletTonConnectRequest);
                    Intent intent222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                    intent222.setAction("android.intent.action.VIEW");
                    intent222.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent222.putExtra("currentAccount", this.currentAccount);
                    intent222.addFlags(67108864);
                    PendingIntent activity222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, this.currentAccount, intent222, 201326592);
                    r rVar222 = new r(ApplicationLoader.applicationContext, str2);
                    rVar222.E.icon = R.drawable.notification;
                    rVar222.e = r.d(LocaleController.getString(R.string.AppName));
                    rVar222.f = r.d(string);
                    e0.m mVar222 = new e0.m(z11);
                    mVar222.f = r.d(string);
                    rVar222.n(mVar222);
                    rVar222.u = "event";
                    rVar222.x = 0;
                    rVar222.E.when = j3;
                    rVar222.h(16, true);
                    rVar222.g = activity222;
                    notificationManager.e("wallet_tonconnect", this.currentAccount, rVar222.b());
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateBadge$35() {
        setBadge(getTotalAllUnreadCount());
    }

    public static Bitmap loadMultipleAvatars(ArrayList<Object> arrayList) {
        int i10;
        Bitmap bitmap;
        Paint paint;
        boolean z10;
        float f7;
        char c10;
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
        boolean z11 = true;
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
                z10 = z11;
                f7 = f14;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i11)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                z10 = true;
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath, options);
                    int i12 = (int) f10;
                    options.inSampleSize = ci.l8.d(options, i12, i12);
                    try {
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
                        c10 = 2;
                    }
                } catch (Throwable unused4) {
                    c10 = 2;
                    i11++;
                    z11 = z10;
                    dp = i10;
                    createBitmap = bitmap;
                    f14 = f7;
                    paint3 = paint;
                    arrayList2 = arrayList;
                }
            } else if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                c10 = 2;
                try {
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f10, new int[]{org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.p8[org.telegram.ui.Components.j9.e(user.id)], false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q8[org.telegram.ui.Components.j9.e(user.id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawCircle(f12, f13, f11, paint2);
                    if (textPaint == null) {
                        try {
                            z10 = true;
                            try {
                                TextPaint textPaint2 = new TextPaint(1);
                                try {
                                    textPaint2.setTypeface(AndroidUtilities.bold());
                                    textPaint2.setTextSize(f15 * 0.25f);
                                    textPaint2.setColor(-1);
                                    textPaint = textPaint2;
                                } catch (Throwable unused5) {
                                    textPaint = textPaint2;
                                    i11++;
                                    z11 = z10;
                                    dp = i10;
                                    createBitmap = bitmap;
                                    f14 = f7;
                                    paint3 = paint;
                                    arrayList2 = arrayList;
                                }
                            } catch (Throwable unused6) {
                            }
                        } catch (Throwable unused7) {
                            z10 = true;
                        }
                    } else {
                        z10 = true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Components.j9.a(user.first_name, user.last_name, null, sb2);
                    String sb3 = sb2.toString();
                    try {
                        textPaint.getTextBounds(sb3, 0, sb3.length(), rect);
                        canvas.drawText(sb3, (f12 - (rect.width() / 2.0f)) - rect.left, (f13 - (rect.height() / 2.0f)) - rect.top, textPaint);
                    } catch (Throwable unused8) {
                    }
                } catch (Throwable unused9) {
                }
                i11++;
                z11 = z10;
                dp = i10;
                createBitmap = bitmap;
                f14 = f7;
                paint3 = paint;
                arrayList2 = arrayList;
            }
            c10 = 2;
            z10 = true;
            i11++;
            z11 = z10;
            dp = i10;
            createBitmap = bitmap;
            f14 = f7;
            paint3 = paint;
            arrayList2 = arrayList;
        }
        return createBitmap;
    }

    public static e0.m0 loadRoundAvatar(long j3, File file, e0.m0 m0Var) {
        if (j3 == UserObject.OAUTH) {
            m0Var.b = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.ic_launcher_dr);
            return m0Var;
        }
        if (file != null && Build.VERSION.SDK_INT >= 28) {
            try {
                m0Var.b = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new bh()));
            } catch (Throwable unused) {
            }
        }
        return m0Var;
    }

    private Pair<Integer, Boolean> parseStoryPushes(ArrayList<String> arrayList, ArrayList<Object> arrayList2) {
        int i10;
        String str;
        TLRPC.FileLocation fileLocation;
        int min = Math.min(3, this.storyPushMessages.size());
        boolean z10 = false;
        int i11 = 0;
        for (0; i10 < min; i10 + 1) {
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
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (getNotifyOverride(getAccountInstance().getNotificationsSettings(), this.openedDialogId, this.openedTopicId) == 2) {
                return;
            }
            notificationsQueue.postRunnable(new zg(this, 0));
        } catch (Exception e11) {
            e = e11;
            FileLog.e(e);
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
    public void resetNotificationSound(r rVar, long j3, long j10, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
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
            getNotificationsController().lambda$deleteNotificationChannelGlobal$44(i12, -1);
        } else {
            edit.putString(q.i(j3, j10, new StringBuilder("sound_")), string);
            edit.putString(q.i(j3, j10, new StringBuilder("sound_path_")), uri3);
            lambda$deleteNotificationChannel$43(j3, j10, -1);
        }
        edit.commit();
        rVar.y = validateChannelId(j3, j10, str, jArr, i10, uri2, i11, z10, z11, z12, i12);
        notificationManager.e(null, this.notificationId, rVar.b());
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

    private void setNotificationChannel(Notification notification, r rVar, boolean z10) {
        if (z10) {
            rVar.y = OTHER_NOTIFICATIONS_CHANNEL;
        } else {
            rVar.y = notification.getChannelId();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(106:51|(2:53|(4:55|56|57|58)(4:59|(2:62|60)|63|64))(1:897)|65|66|(1:68)(2:(1:894)(1:896)|895)|69|(4:72|(2:74|75)(1:77)|76|70)|78|79|(4:81|(2:(1:84)(1:767)|85)(1:768)|(1:766)(2:91|(83:95|96|97|(1:763)(2:101|(1:103))|(4:105|(1:107)(1:761)|108|109)(1:762)|(3:111|(3:113|(1:115)(3:747|748|(3:750|(1:752)(1:754)|753)(1:755))|116)(1:759)|758)(1:760)|(4:118|(1:745)(2:122|(1:124))|125|126)(1:746)|127|(6:711|(5:713|(4:716|(2:724|725)|726|714)|731|732|(7:734|(1:736)|737|738|739|(1:741)(1:743)|742))|744|739|(0)(0)|742)(2:130|131)|132|(1:134)|135|(1:137)(1:701)|138|(1:700)(1:142)|143|144|(1:699)(4:147|(1:149)|(3:669|670|(4:674|675|676|(63:680|681|682|683|684|685|686|153|(1:668)(1:157)|(1:667)(1:160)|161|(1:666)|168|(1:665)(1:175)|176|(11:178|(1:180)(2:382|(5:384|385|56|57|58)(2:386|(1:(1:389)(1:390))(2:391|(1:393)(2:394|(1:399)(1:398)))))|181|(2:184|182)|185|186|(1:381)(1:189)|190|(1:192)|(1:194)(1:380)|195)(4:400|(6:402|(1:404)(3:409|(1:411)(2:650|(2:655|(1:657)(2:658|(1:662)))(1:654))|(3:413|(1:415)|416)(17:417|(1:419)|420|(2:646|(1:648)(1:649))(1:426)|427|428|(3:638|(1:(1:641)(2:642|(1:644)))|645)(1:432)|433|(2:(2:436|(1:(2:439|(1:441))(1:632))(2:633|(1:635)))(1:636)|631)(1:637)|(4:565|(1:630)(2:569|(6:571|(2:627|628)(4:574|(1:578)|(1:626)(2:584|(1:588))|625)|(1:624)(4:593|(4:595|(1:610)(2:601|(2:605|606))|609|606)(2:611|(1:623)(2:617|(1:621)))|607|608)|622|607|608))|629|608)(1:445)|446|(9:448|(1:561)(8:461|(1:560)(3:465|(15:530|531|532|533|534|535|536|537|538|539|540|541|542|543|544)(1:467)|468)|469|(1:471)(1:529)|472|473|(2:524|525)(3:475|(1:523)|477)|(9:479|(1:481)|482|(2:484|(1:486))|487|488|(2:493|(2:495|(3:497|(2:502|503)(1:499)|(1:501))(2:506|(2:508|(2:510|511)))))|518|511)(1:519))|520|(5:522|488|(3:491|493|(0))|518|511)|487|488|(0)|518|511)(2:562|(1:564))|512|(2:514|(3:516|517|408))|406|407|408))|405|406|407|408)|663|664)|196|197|(2:349|(2:354|(44:365|(4:367|(2:370|368)|371|372)(2:373|(1:375)(2:376|(1:378)(1:379)))|204|(1:206)|207|(1:209)|210|(2:212|(1:214)(1:344))(2:345|(1:347)(1:348))|(1:216)(1:343)|217|(4:219|(2:222|220)|223|224)(1:342)|225|(1:227)(1:341)|228|229|230|231|232|233|(1:235)|(1:239)|240|(1:242)|(2:246|(21:248|(4:251|(2:252|(2:254|(2:257|258)(1:256))(1:331))|(1:261)(1:260)|249)|332|262|(1:264)|265|(2:(1:270)|(1:277))|278|(1:330)(1:284)|285|(1:287)|(1:289)|290|(3:295|(4:297|(3:299|(4:301|(1:303)|304|305)(2:307|308)|306)|309|310)|311)|312|(1:329)(2:315|(2:319|(1:323)))|324|(1:326)|327|328|58))|333|(0)|265|(3:267|(0)|(2:272|277))|278|(1:280)|330|285|(0)|(0)|290|(4:292|295|(0)|311)|312|(0)|329|324|(0)|327|328|58)(46:358|(1:360)(2:362|(1:364))|361|203|204|(0)|207|(0)|210|(0)(0)|(0)(0)|217|(0)(0)|225|(0)(0)|228|229|230|231|232|233|(0)|(2:237|239)|240|(0)|(3:244|246|(0))|333|(0)|265|(0)|278|(0)|330|285|(0)|(0)|290|(0)|312|(0)|329|324|(0)|327|328|58))(1:353))(1:201)|202|203|204|(0)|207|(0)|210|(0)(0)|(0)(0)|217|(0)(0)|225|(0)(0)|228|229|230|231|232|233|(0)|(0)|240|(0)|(0)|333|(0)|265|(0)|278|(0)|330|285|(0)|(0)|290|(0)|312|(0)|329|324|(0)|327|328|58)))|151)|152|153|(1:155)|668|(0)|667|161|(1:163)|666|168|(1:171)|665|176|(0)(0)|196|197|(1:199)|349|(1:351)|354|(1:356)|365|(0)(0)|204|(0)|207|(0)|210|(0)(0)|(0)(0)|217|(0)(0)|225|(0)(0)|228|229|230|231|232|233|(0)|(0)|240|(0)|(0)|333|(0)|265|(0)|278|(0)|330|285|(0)|(0)|290|(0)|312|(0)|329|324|(0)|327|328|58))|764)(7:769|(3:(1:878)(1:778)|779|(11:781|(2:783|(1:785)(2:828|(1:830)))(3:832|(1:842)(2:836|(9:840|787|(1:789)(2:819|(1:821)(2:822|(1:824)(6:825|(1:827)|791|792|(1:818)(2:797|(1:807))|808)))|790|791|792|(0)|818|808))|841)|786|787|(0)(0)|790|791|792|(0)|818|808)(6:843|(2:845|(1:847)(2:848|(1:850)))(10:851|(1:877)(1:855)|856|857|(1:876)(2:861|(1:863))|875|865|(2:867|(1:869))(1:874)|(1:871)(1:873)|872)|792|(0)|818|808))(3:879|(2:881|(2:883|(1:885))(2:886|(2:888|(1:890))))(1:892)|891)|831|385|56|57|58)|765|96|97|(1:99)|763|(0)(0)|(0)(0)|(0)(0)|127|(0)|703|705|707|709|711|(0)|744|739|(0)(0)|742|132|(0)|135|(0)(0)|138|(1:140)|700|143|144|(0)|699|152|153|(0)|668|(0)|667|161|(0)|666|168|(0)|665|176|(0)(0)|196|197|(0)|349|(0)|354|(0)|365|(0)(0)|204|(0)|207|(0)|210|(0)(0)|(0)(0)|217|(0)(0)|225|(0)(0)|228|229|230|231|232|233|(0)|(0)|240|(0)|(0)|333|(0)|265|(0)|278|(0)|330|285|(0)|(0)|290|(0)|312|(0)|329|324|(0)|327|328|58) */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x134e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x1371, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x136e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x136f, code lost:
    
        r5 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x054d, code lost:
    
        if (r13 != org.telegram.messenger.UserObject.VERIFY) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x04a5, code lost:
    
        if (r3.local_id != 0) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x089a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x08c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x10df  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x1191  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x11b2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x120b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x126b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x129b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x12f5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x1346 A[Catch: Exception -> 0x134e, TryCatch #3 {Exception -> 0x134e, blocks: (B:233:0x133f, B:235:0x1346, B:237:0x1352, B:239:0x1356, B:240:0x135d), top: B:232:0x133f }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1352 A[Catch: Exception -> 0x134e, TryCatch #3 {Exception -> 0x134e, blocks: (B:233:0x133f, B:235:0x1346, B:237:0x1352, B:239:0x1356, B:240:0x135d), top: B:232:0x133f }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1376  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x137f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x1389  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x13d5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x1418  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x141e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x143b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x1453  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x1458  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x1465  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1472  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x14ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x1525  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x12fc  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x12c0  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x1281  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x1245  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x10f6  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x110d  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x113a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0ec8  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0ef5  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0f4b  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0fc3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0fd7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0f9f  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0ed5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x04eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x15a4  */
    /* JADX WARN: Removed duplicated region for block: B:912:0x160e  */
    /* JADX WARN: Removed duplicated region for block: B:924:0x1671  */
    /* JADX WARN: Removed duplicated region for block: B:947:0x15e4  */
    /* JADX WARN: Removed duplicated region for block: B:953:0x01b8 A[EDGE_INSN: B:953:0x01b8->B:900:0x01b8 BREAK  A[LOOP:2: B:48:0x01a9->B:58:0x1586], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:954:0x0173  */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Type inference failed for: r9v79, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v80 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showExtraNotifications(r rVar, String str, long j3, long j10, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        boolean z13;
        long clientUserId;
        boolean z14;
        a0.i iVar;
        int size;
        ArrayList arrayList;
        a0.i iVar2;
        ArrayList arrayList2;
        String str3;
        int i13;
        int size2;
        int i14;
        a0.i iVar3;
        boolean z15;
        int i15;
        boolean z16;
        long j11;
        int i16;
        ArrayList arrayList3;
        a0.i iVar4;
        long j12;
        long j13;
        int id2;
        MessageObject messageObject;
        SharedPreferences sharedPreferences;
        String str4;
        int i17;
        Integer num;
        Integer num2;
        int i18;
        a0.i iVar5;
        String str5;
        DialogKey dialogKey;
        TLRPC.User user;
        TLRPC.User user2;
        String string;
        a0.i iVar6;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j14;
        TLRPC.Chat chat;
        boolean z17;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        boolean z18;
        String str6;
        TLRPC.FileLocation fileLocation3;
        TLRPC.User user3;
        boolean z19;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation4;
        TLRPC.UserProfilePhoto userProfilePhoto;
        String str7;
        String string2;
        Notification notification;
        SharedPreferences sharedPreferences2;
        TLRPC.FileLocation fileLocation5;
        TLRPC.FileLocation fileLocation6;
        String str8;
        TLRPC.User user4;
        boolean z20;
        Bitmap bitmap;
        File file;
        Bitmap bitmap2;
        File file2;
        TLRPC.Chat chat4;
        String str9;
        String str10;
        boolean z21;
        String formatString;
        e0.i b10;
        Integer num3;
        DialogKey dialogKey2;
        e0.i iVar7;
        long j15;
        String str11;
        ArrayList arrayList6;
        e0.y yVar;
        int i19;
        long j16;
        DialogKey dialogKey3;
        MessageObject messageObject2;
        ArrayList arrayList7;
        NotificationsController notificationsController;
        int i20;
        String str12;
        Bitmap bitmap3;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList8;
        MessageObject messageObject3;
        int i21;
        long j17;
        String str13;
        String[] strArr;
        long j18;
        long j19;
        e0.n0 n0Var;
        StringBuilder sb2;
        boolean[] zArr;
        String str14;
        e0.y yVar2;
        e0.n0 a2;
        int i22;
        String str15;
        File file3;
        File file4;
        File file5;
        TLRPC.ChatPhoto chatPhoto2;
        TLRPC.FileLocation fileLocation7;
        File file6;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation8;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation9;
        NotificationsController notificationsController2;
        a0.i iVar8;
        char c10;
        ArrayList arrayList9;
        Uri uri2;
        String str16;
        e0.y yVar3;
        File file7;
        File file8;
        Uri d;
        File file9;
        Bitmap createScaledBitmap;
        Canvas canvas;
        long j20;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList10;
        Bitmap bitmap4;
        DialogKey dialogKey4;
        Bitmap bitmap5;
        String str17;
        e0.i iVar9;
        String str18;
        ArrayList arrayList11;
        long j21;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        long j22;
        TLRPC.User user5;
        int size3;
        int i23;
        int i24;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup;
        Intent intent;
        ArrayList<Object> arrayList12;
        boolean z22;
        ArrayList arrayList13;
        ?? r92;
        String formatPluralString;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        TLRPC.FileLocation fileLocation10;
        String formatPluralString2;
        String str19;
        String str20;
        TLRPC.UserProfilePhoto userProfilePhoto5;
        NotificationsController notificationsController3 = this;
        FileLog.d("showExtraNotifications pushMessages.size()=" + notificationsController3.pushMessages.size());
        if (Build.VERSION.SDK_INT >= 26) {
            rVar.e(notificationsController3.validateChannelId(j3, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12));
        }
        Notification b11 = rVar.b();
        SharedPreferences notificationsSettings = notificationsController3.getAccountInstance().getNotificationsSettings();
        ArrayList arrayList14 = new ArrayList();
        if (!notificationsController3.storyPushMessages.isEmpty()) {
            arrayList14.add(new DialogKey(0L, 0L, true));
        }
        a0.i iVar10 = new a0.i();
        int i25 = 0;
        for (int i26 = 0; i26 < notificationsController3.pushMessages.size(); i26++) {
            MessageObject messageObject4 = notificationsController3.pushMessages.get(i26);
            long dialogId = messageObject4.getDialogId();
            long topicId = MessageObject.getTopicId(notificationsController3.currentAccount, messageObject4.messageOwner, notificationsController3.getMessagesController().isForum(messageObject4));
            int i27 = notificationsSettings.getInt("dismissDate" + dialogId, 0);
            if (messageObject4.isStoryPush || messageObject4.messageOwner.date > i27) {
                ArrayList arrayList15 = (ArrayList) iVar10.f(dialogId);
                if (arrayList15 == null) {
                    ArrayList j23 = q.j(dialogId, iVar10);
                    FileLog.d("showExtraNotifications: sortedDialogs += " + dialogId);
                    arrayList14.add(new DialogKey(dialogId, topicId, false));
                    arrayList15 = j23;
                }
                arrayList15.add(messageObject4);
            } else {
                StringBuilder u10 = a1.g.u(dialogId, "showExtraNotifications: dialog ", " is skipped, message date (");
                u10.append(messageObject4.messageOwner.date);
                u10.append(" <= ");
                u10.append(i27);
                u10.append(")");
                FileLog.d(u10.toString());
            }
        }
        a0.i iVar11 = new a0.i();
        for (int i28 = 0; i28 < notificationsController3.wearNotificationsIds.m(); i28++) {
            iVar11.k((Integer) notificationsController3.wearNotificationsIds.n(i28), notificationsController3.wearNotificationsIds.j(i28));
        }
        notificationsController3.wearNotificationsIds.b();
        ArrayList arrayList16 = new ArrayList();
        int i29 = Build.VERSION.SDK_INT;
        if (i29 > 27) {
            if (arrayList14.size() <= (notificationsController3.storyPushMessages.isEmpty() ? 1 : 2)) {
                z13 = false;
                if (z13 && i29 >= 26) {
                    checkOtherNotificationsChannel();
                }
                clientUserId = notificationsController3.getUserConfig().getClientUserId();
                z14 = !AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter;
                FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() <= 0) + " waitingForPasscode=" + z14 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z13);
                iVar = new a0.i();
                size = arrayList14.size();
                arrayList = arrayList16;
                while (true) {
                    if (i25 >= size) {
                        break;
                    }
                    if (arrayList.size() >= 7) {
                        FileLog.d("showExtraNotifications: break from holders, count over 7");
                        break;
                    }
                    DialogKey dialogKey5 = (DialogKey) arrayList14.get(i25);
                    ArrayList arrayList17 = arrayList14;
                    if (dialogKey5.story) {
                        ArrayList arrayList18 = new ArrayList();
                        if (notificationsController3.storyPushMessages.isEmpty()) {
                            StringBuilder sb3 = new StringBuilder("showExtraNotifications: [");
                            z15 = z14;
                            sb3.append(dialogKey5.dialogId);
                            sb3.append("] continue; story but storyPushMessages is empty");
                            FileLog.d(sb3.toString());
                            notification = b11;
                            sharedPreferences = notificationsSettings;
                            iVar4 = iVar10;
                            i16 = i25;
                            iVar5 = iVar11;
                            iVar6 = iVar;
                            i15 = size;
                            z16 = z13;
                            j14 = clientUserId;
                            arrayList4 = arrayList;
                            arrayList5 = arrayList17;
                            i25 = i16 + 1;
                            arrayList = arrayList4;
                            arrayList14 = arrayList5;
                            iVar10 = iVar4;
                            z14 = z15;
                            z13 = z16;
                            size = i15;
                            notificationsSettings = sharedPreferences;
                            iVar11 = iVar5;
                            clientUserId = j14;
                            b11 = notification;
                            iVar = iVar6;
                        } else {
                            z15 = z14;
                            i15 = size;
                            z16 = z13;
                            long j24 = notificationsController3.storyPushMessages.get(0).dialogId;
                            int i30 = 0;
                            for (Iterator<Integer> it = notificationsController3.storyPushMessages.get(0).dateByIds.keySet().iterator(); it.hasNext(); it = it) {
                                i30 = Math.max(i30, it.next().intValue());
                            }
                            i16 = i25;
                            j11 = clientUserId;
                            j13 = j24;
                            messageObject = null;
                            id2 = i30;
                            arrayList3 = arrayList18;
                            iVar4 = iVar10;
                            j12 = 0;
                        }
                    } else {
                        z15 = z14;
                        i15 = size;
                        z16 = z13;
                        long j25 = dialogKey5.dialogId;
                        j11 = clientUserId;
                        long j26 = dialogKey5.topicId;
                        ArrayList arrayList19 = (ArrayList) iVar10.f(j25);
                        i16 = i25;
                        arrayList3 = arrayList19;
                        iVar4 = iVar10;
                        j12 = j26;
                        j13 = j25;
                        id2 = ((MessageObject) arrayList19.get(0)).getId();
                        messageObject = (MessageObject) arrayList19.get(0);
                    }
                    Notification notification2 = b11;
                    sharedPreferences = notificationsSettings;
                    Integer num4 = (Integer) iVar11.f(dialogKey5.dialogId);
                    if (dialogKey5.story) {
                        num = 2147483646;
                        str4 = "showExtraNotifications: [";
                        i17 = 32;
                    } else {
                        if (num4 == null) {
                            str4 = "showExtraNotifications: [";
                            i17 = 32;
                            long j27 = dialogKey5.dialogId;
                            num4 = Integer.valueOf(((int) j27) + ((int) (j27 >> 32)));
                        } else {
                            str4 = "showExtraNotifications: [";
                            i17 = 32;
                            iVar11.l(dialogKey5.dialogId);
                        }
                        num = num4;
                    }
                    String str21 = str4;
                    int i31 = 0;
                    for (int i32 = 0; i32 < arrayList3.size(); i32++) {
                        if (i31 < ((MessageObject) arrayList3.get(i32)).messageOwner.date) {
                            i31 = ((MessageObject) arrayList3.get(i32)).messageOwner.date;
                        }
                    }
                    if (dialogKey5.story) {
                        num2 = num;
                        TLRPC.User user6 = notificationsController3.getMessagesController().getUser(Long.valueOf(j13));
                        iVar5 = iVar11;
                        if (notificationsController3.storyPushMessages.size() == 1) {
                            formatPluralString2 = user6 != null ? UserObject.getFirstName(user6) : notificationsController3.storyPushMessages.get(0).localName;
                            i18 = i31;
                        } else {
                            i18 = i31;
                            formatPluralString2 = LocaleController.formatPluralString("Stories", notificationsController3.storyPushMessages.size(), new Object[0]);
                        }
                        if (user6 == null || (userProfilePhoto5 = user6.photo) == null || (fileLocation3 = userProfilePhoto5.photo_small) == null) {
                            str19 = "Stories";
                            str20 = formatPluralString2;
                        } else {
                            str19 = "Stories";
                            str20 = formatPluralString2;
                            if (fileLocation3.volume_id != 0 && fileLocation3.local_id != 0) {
                                user2 = user6;
                                str5 = str19;
                                dialogKey = dialogKey5;
                                string = str20;
                                chat3 = null;
                                z18 = false;
                                z17 = false;
                                z19 = false;
                                if (messageObject == null && messageObject.isStoryReactionPush) {
                                    sharedPreferences2 = sharedPreferences;
                                    fileLocation5 = fileLocation3;
                                    if (!sharedPreferences2.getBoolean("EnableReactionsPreview", true)) {
                                        string = LocaleController.getString(R.string.NotificationHiddenChatName);
                                        fileLocation5 = null;
                                        z19 = false;
                                    }
                                } else {
                                    sharedPreferences2 = sharedPreferences;
                                    fileLocation5 = fileLocation3;
                                }
                                if (z15) {
                                    fileLocation6 = fileLocation5;
                                    str8 = string;
                                    sharedPreferences = sharedPreferences2;
                                } else {
                                    fileLocation6 = null;
                                    z19 = false;
                                    sharedPreferences = sharedPreferences2;
                                    str8 = DialogObject.isChatDialog(j13) ? LocaleController.getString(R.string.NotificationHiddenChatName) : LocaleController.getString(R.string.NotificationHiddenName);
                                }
                                if (fileLocation6 == null) {
                                    z20 = z18;
                                    File pathToAttach = notificationsController3.getFileLoader().getPathToAttach(fileLocation6, true);
                                    if (Build.VERSION.SDK_INT < 28) {
                                        user4 = user2;
                                        BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation6, null, "50_50");
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
                                    } else {
                                        user4 = user2;
                                    }
                                    file = pathToAttach;
                                    bitmap = null;
                                } else {
                                    user4 = user2;
                                    z20 = z18;
                                    bitmap = null;
                                    file = null;
                                }
                                if (chat3 == null) {
                                    e0.m0 m0Var = new e0.m0();
                                    m0Var.a = str8;
                                    if (file == null || !file.exists()) {
                                        bitmap2 = bitmap;
                                    } else {
                                        bitmap2 = bitmap;
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            loadRoundAvatar(j13, file, m0Var);
                                        }
                                    }
                                    file2 = file;
                                    iVar.k(m0Var.a(), -chat3.id);
                                } else {
                                    bitmap2 = bitmap;
                                    file2 = file;
                                }
                                File file10 = file2;
                                if ((z20 || z17) && z19 && !SharedConfig.isWaitingForPasscodeEnter && j11 != j13 && !UserObject.isReplyUser(j13) && MessagesController.getInstance(notificationsController3.currentAccount).getSendPaidMessagesStars(j13) <= 0) {
                                    chat4 = chat3;
                                    str9 = str8;
                                    Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                    intent2.putExtra("dialog_id", j13);
                                    intent2.putExtra("max_id", id2);
                                    intent2.putExtra("topic_id", j12);
                                    intent2.putExtra("currentAccount", notificationsController3.currentAccount);
                                    if (!arrayList3.isEmpty()) {
                                        ArrayList arrayList20 = new ArrayList();
                                        for (int i33 = 0; i33 < arrayList3.size(); i33++) {
                                            MessageObject messageObject5 = (MessageObject) arrayList3.get(i33);
                                            if (messageObject5 != null && messageObject5.isVoice() && messageObject5.isContentUnread() && !messageObject5.isOut()) {
                                                arrayList20.add(Integer.valueOf(messageObject5.getId()));
                                            }
                                        }
                                        if (!arrayList20.isEmpty()) {
                                            int size4 = arrayList20.size();
                                            int[] iArr = new int[size4];
                                            str10 = "max_id";
                                            for (int i34 = 0; i34 < size4; i34++) {
                                                iArr[i34] = ((Integer) arrayList20.get(i34)).intValue();
                                            }
                                            intent2.putExtra("voice_msg_ids", iArr);
                                            PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent2, 167772160);
                                            e0.p0 p0Var = new e0.p0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                                            if (DialogObject.isChatDialog(j13)) {
                                                formatString = LocaleController.formatString(R.string.ReplyToGroup, str9);
                                                z21 = false;
                                            } else {
                                                z21 = false;
                                                formatString = LocaleController.formatString(R.string.ReplyToUser, str9);
                                            }
                                            e0.h hVar = new e0.h(R.drawable.ic_reply_icon, formatString, broadcast);
                                            hVar.c();
                                            hVar.g = 1;
                                            hVar.a(p0Var);
                                            hVar.h = z21;
                                            b10 = hVar.b();
                                        }
                                    }
                                    str10 = "max_id";
                                    PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent2, 167772160);
                                    e0.p0 p0Var2 = new e0.p0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                                    if (DialogObject.isChatDialog(j13)) {
                                    }
                                    e0.h hVar2 = new e0.h(R.drawable.ic_reply_icon, formatString, broadcast2);
                                    hVar2.c();
                                    hVar2.g = 1;
                                    hVar2.a(p0Var2);
                                    hVar2.h = z21;
                                    b10 = hVar2.b();
                                } else {
                                    chat4 = chat3;
                                    str9 = str8;
                                    str10 = "max_id";
                                    b10 = null;
                                }
                                num3 = (Integer) notificationsController3.pushDialogs.f(j13);
                                if (num3 == null) {
                                    num3 = 0;
                                }
                                dialogKey2 = dialogKey;
                                int size5 = !dialogKey2.story ? notificationsController3.storyPushMessages.size() : Math.max(num3.intValue(), arrayList3.size());
                                String format = (size5 > 1 || Build.VERSION.SDK_INT >= 28) ? str9 : String.format("%1$s (%2$d)", str9, Integer.valueOf(size5));
                                long j28 = j11;
                                iVar7 = b10;
                                e0.n0 n0Var2 = (e0.n0) iVar.f(j28);
                                if (Build.VERSION.SDK_INT >= 28 || n0Var2 != null) {
                                    j15 = j12;
                                } else {
                                    TLRPC.User user7 = notificationsController3.getMessagesController().getUser(Long.valueOf(j28));
                                    if (user7 == null) {
                                        user7 = notificationsController3.getUserConfig().getCurrentUser();
                                    }
                                    if (user7 != null) {
                                        try {
                                            userProfilePhoto4 = user7.photo;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j15 = j12;
                                        }
                                        if (userProfilePhoto4 != null && (fileLocation10 = userProfilePhoto4.photo_small) != null) {
                                            j15 = j12;
                                            try {
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str11 = "dialog_id";
                                                arrayList6 = arrayList3;
                                                FileLog.e(th);
                                                e0.n0 n0Var3 = n0Var2;
                                                if (n0Var3 == null) {
                                                }
                                                i19 = Build.VERSION.SDK_INT;
                                                if (i19 >= 28) {
                                                }
                                                yVar.f(format);
                                                yVar.i = Boolean.valueOf(i19 >= 28 || (!z20 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                                                StringBuilder sb4 = new StringBuilder();
                                                String[] strArr2 = new String[1];
                                                boolean[] zArr2 = new boolean[1];
                                                if (dialogKey2.story) {
                                                }
                                                e0.y yVar4 = yVar;
                                                StringBuilder sb5 = sb4;
                                                a0.i iVar12 = iVar;
                                                int i35 = id2;
                                                j20 = j15;
                                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                intent3.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent3.setFlags(67108864);
                                                intent3.addCategory("android.intent.category.LAUNCHER");
                                                if (messageObject2 == null) {
                                                }
                                                if (messageObject2 == null) {
                                                }
                                                if (messageObject2 == null) {
                                                }
                                                arrayList10 = arrayList8;
                                                bitmap4 = bitmap3;
                                                dialogKey4 = dialogKey3;
                                                if (dialogKey4.story) {
                                                }
                                                q.r(a1.g.u(j13, "show extra notifications chatId ", " topicId "), j20);
                                                if (j20 != 0) {
                                                }
                                                intent3.putExtra("currentAccount", notificationsController.currentAccount);
                                                PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3, 1140850688);
                                                e0.e0 e0Var = new e0.e0();
                                                if (iVar7 != null) {
                                                }
                                                Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                intent4.addFlags(i17);
                                                intent4.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                intent4.putExtra(str11, j13);
                                                intent4.putExtra(str10, i35);
                                                intent4.putExtra("currentAccount", notificationsController.currentAccount);
                                                bitmap5 = bitmap4;
                                                int i36 = i20;
                                                e0.h hVar3 = new e0.h(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4, 167772160));
                                                hVar3.g = 2;
                                                hVar3.h = false;
                                                e0.i b12 = hVar3.b();
                                                if (DialogObject.isEncryptedDialog(j13)) {
                                                }
                                                if (str18 != null) {
                                                }
                                                StringBuilder sb6 = new StringBuilder("tgaccount");
                                                long j29 = j16;
                                                sb6.append(j29);
                                                e0Var.b(sb6.toString());
                                                if (dialogKey4.story) {
                                                }
                                                r rVar2 = new r(ApplicationLoader.applicationContext);
                                                rVar2.g(str12);
                                                String str22 = str12;
                                                rVar2.E.icon = R.drawable.notification;
                                                rVar2.f(sb5.toString());
                                                rVar2.h(16, true);
                                                rVar2.i = dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList11.size();
                                                rVar2.w = -15618822;
                                                rVar2.r = false;
                                                rVar2.E.when = j21;
                                                rVar2.k = true;
                                                rVar2.n(yVar4);
                                                rVar2.g = activity;
                                                rVar2.c(e0Var);
                                                rVar2.l(String.valueOf(Long.MAX_VALUE - j21));
                                                rVar2.u = "msg";
                                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent.putExtra("messageDate", i18);
                                                intent.putExtra("dialogId", j13);
                                                String str23 = str17;
                                                intent.putExtra(str23, notificationsController.currentAccount);
                                                if (dialogKey4.story) {
                                                }
                                                if (messageObject2 != null) {
                                                }
                                                rVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                                                if (z16) {
                                                }
                                                if (messageObject2 != null) {
                                                }
                                                tL_inlineButtonTypeCopy = null;
                                                keyboardInlineButton = null;
                                                if (keyboardInlineButton != null) {
                                                }
                                                j22 = dialogKey4.dialogId;
                                                if (j22 != UserObject.VERIFY) {
                                                }
                                                if (arrayList17.size() != 1) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j13)) {
                                                }
                                                if (bitmap5 != null) {
                                                }
                                                if (!AndroidUtilities.needShowPasscode(false)) {
                                                }
                                                if (chat4 == null) {
                                                }
                                                user5 = user4;
                                                boolean z23 = z16;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                FileLog.d("showExtraNotifications: holders.add " + j13);
                                                int intValue = num2.intValue();
                                                boolean z24 = dialogKey4.story;
                                                notification = notification2;
                                                z16 = z23;
                                                notificationsController3 = notificationsController;
                                                long j30 = j13;
                                                iVar6 = iVar12;
                                                arrayList5 = arrayList17;
                                                1NotificationHolder r02 = notificationsController3.new 1NotificationHolder(intValue, j30, z24, j20, str22, user5, chat4, rVar2, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                arrayList4 = arrayList;
                                                arrayList4.add(r02);
                                                notificationsController3.wearNotificationsIds.k(num2, j30);
                                                i25 = i16 + 1;
                                                arrayList = arrayList4;
                                                arrayList14 = arrayList5;
                                                iVar10 = iVar4;
                                                z14 = z15;
                                                z13 = z16;
                                                size = i15;
                                                notificationsSettings = sharedPreferences;
                                                iVar11 = iVar5;
                                                clientUserId = j14;
                                                b11 = notification;
                                                iVar = iVar6;
                                            }
                                            if (fileLocation10.volume_id != 0 && fileLocation10.local_id != 0) {
                                                e0.m0 m0Var2 = new e0.m0();
                                                m0Var2.a = LocaleController.getString(R.string.FromYou);
                                                str11 = "dialog_id";
                                                arrayList6 = arrayList3;
                                                try {
                                                    loadRoundAvatar(notificationsController3.getUserConfig().getClientUserId(), notificationsController3.getFileLoader().getPathToAttach(user7.photo.photo_small, true), m0Var2);
                                                    e0.n0 a10 = m0Var2.a();
                                                    try {
                                                        iVar.k(a10, j28);
                                                        n0Var2 = a10;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        n0Var2 = a10;
                                                        FileLog.e(th);
                                                        e0.n0 n0Var32 = n0Var2;
                                                        if (n0Var32 == null) {
                                                        }
                                                        i19 = Build.VERSION.SDK_INT;
                                                        if (i19 >= 28) {
                                                        }
                                                        yVar.f(format);
                                                        yVar.i = Boolean.valueOf(i19 >= 28 || (!z20 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                                                        StringBuilder sb42 = new StringBuilder();
                                                        String[] strArr22 = new String[1];
                                                        boolean[] zArr22 = new boolean[1];
                                                        if (dialogKey2.story) {
                                                        }
                                                        e0.y yVar42 = yVar;
                                                        StringBuilder sb52 = sb42;
                                                        a0.i iVar122 = iVar;
                                                        int i352 = id2;
                                                        j20 = j15;
                                                        Intent intent32 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                        intent32.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                        intent32.setFlags(67108864);
                                                        intent32.addCategory("android.intent.category.LAUNCHER");
                                                        if (messageObject2 == null) {
                                                        }
                                                        if (messageObject2 == null) {
                                                        }
                                                        if (messageObject2 == null) {
                                                        }
                                                        arrayList10 = arrayList8;
                                                        bitmap4 = bitmap3;
                                                        dialogKey4 = dialogKey3;
                                                        if (dialogKey4.story) {
                                                        }
                                                        q.r(a1.g.u(j13, "show extra notifications chatId ", " topicId "), j20);
                                                        if (j20 != 0) {
                                                        }
                                                        intent32.putExtra("currentAccount", notificationsController.currentAccount);
                                                        PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32, 1140850688);
                                                        e0.e0 e0Var2 = new e0.e0();
                                                        if (iVar7 != null) {
                                                        }
                                                        Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                        intent42.addFlags(i17);
                                                        intent42.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                        intent42.putExtra(str11, j13);
                                                        intent42.putExtra(str10, i352);
                                                        intent42.putExtra("currentAccount", notificationsController.currentAccount);
                                                        bitmap5 = bitmap4;
                                                        int i362 = i20;
                                                        e0.h hVar32 = new e0.h(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent42, 167772160));
                                                        hVar32.g = 2;
                                                        hVar32.h = false;
                                                        e0.i b122 = hVar32.b();
                                                        if (DialogObject.isEncryptedDialog(j13)) {
                                                        }
                                                        if (str18 != null) {
                                                        }
                                                        StringBuilder sb62 = new StringBuilder("tgaccount");
                                                        long j292 = j16;
                                                        sb62.append(j292);
                                                        e0Var2.b(sb62.toString());
                                                        if (dialogKey4.story) {
                                                        }
                                                        r rVar22 = new r(ApplicationLoader.applicationContext);
                                                        rVar22.g(str12);
                                                        String str222 = str12;
                                                        rVar22.E.icon = R.drawable.notification;
                                                        rVar22.f(sb52.toString());
                                                        rVar22.h(16, true);
                                                        rVar22.i = dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList11.size();
                                                        rVar22.w = -15618822;
                                                        rVar22.r = false;
                                                        rVar22.E.when = j21;
                                                        rVar22.k = true;
                                                        rVar22.n(yVar42);
                                                        rVar22.g = activity2;
                                                        rVar22.c(e0Var2);
                                                        rVar22.l(String.valueOf(Long.MAX_VALUE - j21));
                                                        rVar22.u = "msg";
                                                        intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                        intent.putExtra("messageDate", i18);
                                                        intent.putExtra("dialogId", j13);
                                                        String str232 = str17;
                                                        intent.putExtra(str232, notificationsController.currentAccount);
                                                        if (dialogKey4.story) {
                                                        }
                                                        if (messageObject2 != null) {
                                                        }
                                                        rVar22.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                                                        if (z16) {
                                                        }
                                                        if (messageObject2 != null) {
                                                        }
                                                        tL_inlineButtonTypeCopy = null;
                                                        keyboardInlineButton = null;
                                                        if (keyboardInlineButton != null) {
                                                        }
                                                        j22 = dialogKey4.dialogId;
                                                        if (j22 != UserObject.VERIFY) {
                                                        }
                                                        if (arrayList17.size() != 1) {
                                                        }
                                                        if (DialogObject.isEncryptedDialog(j13)) {
                                                        }
                                                        if (bitmap5 != null) {
                                                        }
                                                        if (!AndroidUtilities.needShowPasscode(false)) {
                                                        }
                                                        if (chat4 == null) {
                                                        }
                                                        user5 = user4;
                                                        boolean z232 = z16;
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                        }
                                                        FileLog.d("showExtraNotifications: holders.add " + j13);
                                                        int intValue2 = num2.intValue();
                                                        boolean z242 = dialogKey4.story;
                                                        notification = notification2;
                                                        z16 = z232;
                                                        notificationsController3 = notificationsController;
                                                        long j302 = j13;
                                                        iVar6 = iVar122;
                                                        arrayList5 = arrayList17;
                                                        1NotificationHolder r022 = notificationsController3.new 1NotificationHolder(intValue2, j302, z242, j20, str222, user5, chat4, rVar22, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                        arrayList4 = arrayList;
                                                        arrayList4.add(r022);
                                                        notificationsController3.wearNotificationsIds.k(num2, j302);
                                                        i25 = i16 + 1;
                                                        arrayList = arrayList4;
                                                        arrayList14 = arrayList5;
                                                        iVar10 = iVar4;
                                                        z14 = z15;
                                                        z13 = z16;
                                                        size = i15;
                                                        notificationsSettings = sharedPreferences;
                                                        iVar11 = iVar5;
                                                        clientUserId = j14;
                                                        b11 = notification;
                                                        iVar = iVar6;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                                e0.n0 n0Var322 = n0Var2;
                                                yVar = (n0Var322 == null && (messageObject != null || !(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.y(n0Var322) : new e0.y();
                                                i19 = Build.VERSION.SDK_INT;
                                                if (i19 >= 28 || ((DialogObject.isChatDialog(j13) && !z20) || UserObject.isReplyUser(j13))) {
                                                    yVar.f(format);
                                                }
                                                yVar.i = Boolean.valueOf(i19 >= 28 || (!z20 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                                                StringBuilder sb422 = new StringBuilder();
                                                String[] strArr222 = new String[1];
                                                boolean[] zArr222 = new boolean[1];
                                                if (dialogKey2.story) {
                                                    ArrayList<String> arrayList21 = new ArrayList<>();
                                                    ArrayList<Object> arrayList22 = new ArrayList<>();
                                                    Pair<Integer, Boolean> parseStoryPushes = notificationsController3.parseStoryPushes(arrayList21, arrayList22);
                                                    int intValue3 = ((Integer) parseStoryPushes.first).intValue();
                                                    boolean booleanValue = ((Boolean) parseStoryPushes.second).booleanValue();
                                                    if (booleanValue) {
                                                        arrayList12 = arrayList22;
                                                        z22 = booleanValue;
                                                        arrayList13 = arrayList6;
                                                        sb422.append(LocaleController.formatPluralString("StoryNotificationHidden", intValue3, new Object[0]));
                                                    } else {
                                                        arrayList12 = arrayList22;
                                                        z22 = booleanValue;
                                                        arrayList13 = arrayList6;
                                                        if (arrayList21.isEmpty()) {
                                                            FileLog.d(str21 + j13 + "] continue; story but names is empty");
                                                            j14 = j28;
                                                            iVar6 = iVar;
                                                            arrayList4 = arrayList;
                                                            arrayList5 = arrayList17;
                                                            notification = notification2;
                                                            i25 = i16 + 1;
                                                            arrayList = arrayList4;
                                                            arrayList14 = arrayList5;
                                                            iVar10 = iVar4;
                                                            z14 = z15;
                                                            z13 = z16;
                                                            size = i15;
                                                            notificationsSettings = sharedPreferences;
                                                            iVar11 = iVar5;
                                                            clientUserId = j14;
                                                            b11 = notification;
                                                            iVar = iVar6;
                                                        } else if (arrayList21.size() == 1) {
                                                            if (intValue3 == 1) {
                                                                sb422.append(LocaleController.getString("StoryNotificationSingle"));
                                                            } else {
                                                                sb422.append(LocaleController.formatPluralString("StoryNotification1", intValue3, arrayList21.get(0)));
                                                            }
                                                        } else if (arrayList21.size() == 2) {
                                                            sb422.append(LocaleController.formatString(R.string.StoryNotification2, arrayList21.get(0), arrayList21.get(1)));
                                                        } else if (arrayList21.size() == 3 && notificationsController3.storyPushMessages.size() == 3) {
                                                            sb422.append(LocaleController.formatString(R.string.StoryNotification3, notificationsController3.cutLastName(arrayList21.get(0)), notificationsController3.cutLastName(arrayList21.get(1)), notificationsController3.cutLastName(arrayList21.get(2))));
                                                        } else {
                                                            sb422.append(LocaleController.formatPluralString("StoryNotification4", notificationsController3.storyPushMessages.size() - 2, notificationsController3.cutLastName(arrayList21.get(0)), notificationsController3.cutLastName(arrayList21.get(1))));
                                                        }
                                                    }
                                                    j16 = j28;
                                                    long j31 = Long.MAX_VALUE;
                                                    for (int i37 = 0; i37 < notificationsController3.storyPushMessages.size(); i37++) {
                                                        j31 = Math.min(notificationsController3.storyPushMessages.get(i37).date, j31);
                                                    }
                                                    yVar.i = Boolean.FALSE;
                                                    if (arrayList21.size() != 1 || z22) {
                                                        r92 = 0;
                                                        formatPluralString = LocaleController.formatPluralString(str5, intValue3, new Object[0]);
                                                    } else {
                                                        r92 = 0;
                                                        formatPluralString = arrayList21.get(0);
                                                    }
                                                    e0.n0 n0Var4 = new e0.n0();
                                                    n0Var4.a = formatPluralString;
                                                    n0Var4.b = null;
                                                    n0Var4.c = null;
                                                    n0Var4.d = null;
                                                    n0Var4.e = r92;
                                                    n0Var4.f = r92;
                                                    e0.x xVar = new e0.x(sb422, j31, n0Var4);
                                                    ArrayList arrayList23 = yVar.e;
                                                    arrayList23.add(xVar);
                                                    if (arrayList23.size() > 25) {
                                                        arrayList23.remove((int) r92);
                                                    }
                                                    bitmap3 = !z22 ? loadMultipleAvatars(arrayList12) : null;
                                                    MessageObject messageObject6 = messageObject;
                                                    notificationsController = notificationsController3;
                                                    arrayList8 = null;
                                                    messageObject2 = messageObject6;
                                                    dialogKey3 = dialogKey2;
                                                    arrayList7 = arrayList13;
                                                    i20 = 0;
                                                    str12 = formatPluralString;
                                                } else {
                                                    j16 = j28;
                                                    ArrayList arrayList24 = arrayList6;
                                                    String str24 = str21;
                                                    int size6 = arrayList24.size() - 1;
                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList25 = null;
                                                    int i38 = 0;
                                                    while (size6 >= 0) {
                                                        ArrayList arrayList26 = arrayList24;
                                                        int i39 = size6;
                                                        MessageObject messageObject7 = (MessageObject) arrayList26.get(size6);
                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList27 = arrayList25;
                                                        DialogKey dialogKey6 = dialogKey2;
                                                        long topicId2 = MessageObject.getTopicId(notificationsController3.currentAccount, messageObject7.messageOwner, notificationsController3.getMessagesController().isForum(messageObject7));
                                                        if (j15 != topicId2) {
                                                            StringBuilder u11 = a1.g.u(j13, str24, "] continue; topic id is not equal: topicId=");
                                                            messageObject3 = messageObject;
                                                            i21 = id2;
                                                            j17 = j15;
                                                            u11.append(j17);
                                                            u11.append(" messageTopicId=");
                                                            u11.append(topicId2);
                                                            u11.append("; selfId=");
                                                            u11.append(notificationsController3.getUserConfig().getClientUserId());
                                                            FileLog.d(u11.toString());
                                                            sb2 = sb422;
                                                            str13 = str24;
                                                            strArr = strArr222;
                                                        } else {
                                                            messageObject3 = messageObject;
                                                            i21 = id2;
                                                            j17 = j15;
                                                            String shortStringForMessage = notificationsController3.getShortStringForMessage(messageObject7, strArr222, zArr222);
                                                            if (j13 == UserObject.OAUTH) {
                                                                strArr222[0] = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                                                str13 = str24;
                                                                strArr = strArr222;
                                                            } else if (j13 != UserObject.VERIFY || messageObject7.getForwardedFromId() == null) {
                                                                str13 = str24;
                                                                strArr = strArr222;
                                                                if (j13 == j16) {
                                                                    strArr[0] = str9;
                                                                } else if (DialogObject.isChatDialog(j13) && messageObject7.messageOwner.from_scheduled) {
                                                                    strArr[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                                                }
                                                            } else {
                                                                str13 = str24;
                                                                strArr = strArr222;
                                                                strArr[0] = notificationsController3.getMessagesController().getPeerName(messageObject7.getForwardedFromId().longValue());
                                                            }
                                                            if (shortStringForMessage == null) {
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    FileLog.w("message text is null for " + messageObject7.getId() + " did = " + messageObject7.getDialogId());
                                                                }
                                                                sb2 = sb422;
                                                            } else {
                                                                if (sb422.length() > 0) {
                                                                    sb422.append("\n\n");
                                                                }
                                                                if (j13 != j16 && messageObject7.messageOwner.from_scheduled && DialogObject.isUserDialog(j13)) {
                                                                    shortStringForMessage = String.format("%1$s: %2$s", LocaleController.getString(R.string.NotificationMessageScheduledName), shortStringForMessage);
                                                                    sb422.append(shortStringForMessage);
                                                                } else {
                                                                    String str25 = strArr[0];
                                                                    if (str25 != null) {
                                                                        sb422.append(String.format("%1$s: %2$s", str25, shortStringForMessage));
                                                                    } else {
                                                                        sb422.append(shortStringForMessage);
                                                                    }
                                                                }
                                                                String str26 = shortStringForMessage;
                                                                int i40 = (j13 > UserObject.VERIFY ? 1 : (j13 == UserObject.VERIFY ? 0 : -1));
                                                                if (i40 != 0 || messageObject7.getForwardedFromId() == null) {
                                                                    if (!DialogObject.isUserDialog(j13)) {
                                                                        if (z20) {
                                                                            j18 = -j13;
                                                                        } else if (DialogObject.isChatDialog(j13)) {
                                                                            j18 = messageObject7.getSenderId();
                                                                        }
                                                                    }
                                                                    j18 = j13;
                                                                } else {
                                                                    j18 = messageObject7.getForwardedFromId().longValue();
                                                                }
                                                                j19 = j17;
                                                                e0.n0 n0Var5 = (e0.n0) iVar.f(j18 + (j17 << 16));
                                                                String str27 = strArr[0];
                                                                if (str27 == null) {
                                                                    if (!z15) {
                                                                        n0Var = n0Var5;
                                                                    } else if (!DialogObject.isChatDialog(j13)) {
                                                                        n0Var = n0Var5;
                                                                        if (Build.VERSION.SDK_INT > 27) {
                                                                            str27 = LocaleController.getString(R.string.NotificationHiddenName);
                                                                        }
                                                                    } else if (z20) {
                                                                        n0Var = n0Var5;
                                                                        if (Build.VERSION.SDK_INT > 27) {
                                                                            str27 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                                        }
                                                                    } else {
                                                                        n0Var = n0Var5;
                                                                        str27 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                                                    }
                                                                    str27 = "";
                                                                } else {
                                                                    n0Var = n0Var5;
                                                                }
                                                                if (n0Var == null || !TextUtils.equals(n0Var.b(), str27)) {
                                                                    e0.m0 m0Var3 = new e0.m0();
                                                                    m0Var3.a = str27;
                                                                    if (!zArr222[0] || DialogObject.isEncryptedDialog(j13)) {
                                                                        sb2 = sb422;
                                                                    } else {
                                                                        sb2 = sb422;
                                                                        if (Build.VERSION.SDK_INT >= 28) {
                                                                            if (DialogObject.isUserDialog(j13) || z20) {
                                                                                i22 = i40;
                                                                                zArr = zArr222;
                                                                                str15 = "";
                                                                                yVar2 = yVar;
                                                                                file3 = file10;
                                                                            } else {
                                                                                e0.y yVar5 = yVar;
                                                                                long senderId = messageObject7.getSenderId();
                                                                                i22 = i40;
                                                                                zArr = zArr222;
                                                                                TLRPC.User user8 = notificationsController3.getMessagesController().getUser(Long.valueOf(senderId));
                                                                                if (user8 == null && (user8 = notificationsController3.getMessagesStorage().getUserSync(senderId)) != null) {
                                                                                    notificationsController3.getMessagesController().putUser(user8, true);
                                                                                }
                                                                                if (user8 == null || (userProfilePhoto3 = user8.photo) == null || (fileLocation9 = userProfilePhoto3.photo_small) == null) {
                                                                                    yVar2 = yVar5;
                                                                                    str15 = "";
                                                                                } else {
                                                                                    yVar2 = yVar5;
                                                                                    str15 = "";
                                                                                    if (fileLocation9.volume_id != 0 && fileLocation9.local_id != 0) {
                                                                                        file3 = notificationsController3.getFileLoader().getPathToAttach(user8.photo.photo_small, true);
                                                                                    }
                                                                                }
                                                                                file3 = null;
                                                                            }
                                                                            if (file3 == null && i22 == 0 && messageObject7.getForwardedFromId() != null) {
                                                                                if (j18 >= 0) {
                                                                                    TLRPC.User user9 = notificationsController3.getMessagesController().getUser(Long.valueOf(j18));
                                                                                    if (user9 == null || (userProfilePhoto2 = user9.photo) == null || (fileLocation8 = userProfilePhoto2.photo_small) == null) {
                                                                                        file6 = file3;
                                                                                    } else {
                                                                                        file6 = file3;
                                                                                        if (fileLocation8.volume_id != 0 && fileLocation8.local_id != 0) {
                                                                                            file5 = getFileLoader().getPathToAttach(user9.photo.photo_small, true);
                                                                                            str14 = str15;
                                                                                        }
                                                                                    }
                                                                                    file5 = file6;
                                                                                    str14 = str15;
                                                                                } else {
                                                                                    File file11 = file3;
                                                                                    str14 = str15;
                                                                                    TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j18));
                                                                                    if (chat5 == null || (chatPhoto2 = chat5.photo) == null || (fileLocation7 = chatPhoto2.photo_small) == null) {
                                                                                        file4 = file11;
                                                                                    } else {
                                                                                        file4 = file11;
                                                                                        if (fileLocation7.volume_id != 0 && fileLocation7.local_id != 0) {
                                                                                            file5 = getFileLoader().getPathToAttach(chat5.photo.photo_small, true);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                loadRoundAvatar(j13, file5, m0Var3);
                                                                                a2 = m0Var3.a();
                                                                                iVar.k(a2, j18);
                                                                            } else {
                                                                                str14 = str15;
                                                                                file4 = file3;
                                                                            }
                                                                            file5 = file4;
                                                                            loadRoundAvatar(j13, file5, m0Var3);
                                                                            a2 = m0Var3.a();
                                                                            iVar.k(a2, j18);
                                                                        }
                                                                    }
                                                                    zArr = zArr222;
                                                                    str14 = "";
                                                                    yVar2 = yVar;
                                                                    a2 = m0Var3.a();
                                                                    iVar.k(a2, j18);
                                                                } else {
                                                                    zArr = zArr222;
                                                                    str14 = "";
                                                                    a2 = n0Var;
                                                                    yVar2 = yVar;
                                                                    sb2 = sb422;
                                                                }
                                                                if (DialogObject.isEncryptedDialog(j13)) {
                                                                    notificationsController2 = this;
                                                                    iVar8 = iVar;
                                                                    e0.x xVar2 = new e0.x(str26, messageObject7.messageOwner.date * 1000, a2);
                                                                    ArrayList arrayList28 = yVar2.e;
                                                                    arrayList28.add(xVar2);
                                                                    if (arrayList28.size() > 25) {
                                                                        arrayList28.remove(0);
                                                                    }
                                                                } else {
                                                                    if (!zArr[0] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).isLowRamDevice() || z15 || messageObject7.isSecretMedia() || !(messageObject7.type == 1 || messageObject7.isSticker())) {
                                                                        notificationsController2 = this;
                                                                        iVar8 = iVar;
                                                                    } else {
                                                                        File pathToMessage = getFileLoader().getPathToMessage(messageObject7.messageOwner);
                                                                        if (pathToMessage.exists() && messageObject7.hasMediaSpoilers()) {
                                                                            file8 = new File(pathToMessage.getParentFile(), pathToMessage.getName() + ".blur.jpg");
                                                                            if (file8.exists()) {
                                                                                notificationsController2 = this;
                                                                                str16 = str14;
                                                                                file9 = pathToMessage;
                                                                                yVar3 = yVar2;
                                                                            } else {
                                                                                try {
                                                                                    Bitmap decodeFile = BitmapFactory.decodeFile(pathToMessage.getAbsolutePath());
                                                                                    Bitmap stackBlurBitmapMax = Utilities.stackBlurBitmapMax(decodeFile);
                                                                                    decodeFile.recycle();
                                                                                    createScaledBitmap = Bitmap.createScaledBitmap(stackBlurBitmapMax, decodeFile.getWidth(), decodeFile.getHeight(), true);
                                                                                    Utilities.stackBlurBitmap(createScaledBitmap, 5);
                                                                                    stackBlurBitmapMax.recycle();
                                                                                    canvas = new Canvas(createScaledBitmap);
                                                                                    notificationsController2 = this;
                                                                                } catch (Exception e7) {
                                                                                    e = e7;
                                                                                    notificationsController2 = this;
                                                                                }
                                                                                try {
                                                                                    str16 = str14;
                                                                                    try {
                                                                                        file9 = pathToMessage;
                                                                                    } catch (Exception e10) {
                                                                                        e = e10;
                                                                                        file9 = pathToMessage;
                                                                                        yVar3 = yVar2;
                                                                                        FileLog.e(e);
                                                                                        file7 = file9;
                                                                                        a0.i iVar13 = iVar;
                                                                                        e0.x xVar3 = new e0.x(str26, messageObject7.messageOwner.date * 1000, a2);
                                                                                        String str28 = messageObject7.isSticker() ? "image/webp" : "image/jpeg";
                                                                                        if (file7.exists()) {
                                                                                        }
                                                                                        if (d != null) {
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        notificationsController2.mediaSpoilerEffect.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                                                                                        yVar3 = yVar2;
                                                                                    } catch (Exception e11) {
                                                                                        e = e11;
                                                                                        yVar3 = yVar2;
                                                                                        FileLog.e(e);
                                                                                        file7 = file9;
                                                                                        a0.i iVar132 = iVar;
                                                                                        e0.x xVar32 = new e0.x(str26, messageObject7.messageOwner.date * 1000, a2);
                                                                                        String str282 = messageObject7.isSticker() ? "image/webp" : "image/jpeg";
                                                                                        if (file7.exists()) {
                                                                                        }
                                                                                        if (d != null) {
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        notificationsController2.mediaSpoilerEffect.setBounds(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                                                                                        notificationsController2.mediaSpoilerEffect.draw(canvas);
                                                                                        FileOutputStream fileOutputStream = new FileOutputStream(file8);
                                                                                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                                        fileOutputStream.close();
                                                                                        createScaledBitmap.recycle();
                                                                                        file7 = file8;
                                                                                    } catch (Exception e12) {
                                                                                        e = e12;
                                                                                        FileLog.e(e);
                                                                                        file7 = file9;
                                                                                        a0.i iVar1322 = iVar;
                                                                                        e0.x xVar322 = new e0.x(str26, messageObject7.messageOwner.date * 1000, a2);
                                                                                        String str2822 = messageObject7.isSticker() ? "image/webp" : "image/jpeg";
                                                                                        if (file7.exists()) {
                                                                                        }
                                                                                        if (d != null) {
                                                                                        }
                                                                                    }
                                                                                } catch (Exception e13) {
                                                                                    e = e13;
                                                                                    str16 = str14;
                                                                                    file9 = pathToMessage;
                                                                                    yVar3 = yVar2;
                                                                                    FileLog.e(e);
                                                                                    file7 = file9;
                                                                                    a0.i iVar13222 = iVar;
                                                                                    e0.x xVar3222 = new e0.x(str26, messageObject7.messageOwner.date * 1000, a2);
                                                                                    String str28222 = messageObject7.isSticker() ? "image/webp" : "image/jpeg";
                                                                                    if (file7.exists()) {
                                                                                    }
                                                                                    if (d != null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            file7 = file9;
                                                                        } else {
                                                                            notificationsController2 = this;
                                                                            str16 = str14;
                                                                            yVar3 = yVar2;
                                                                            file7 = pathToMessage;
                                                                            file8 = null;
                                                                        }
                                                                        a0.i iVar132222 = iVar;
                                                                        e0.x xVar32222 = new e0.x(str26, messageObject7.messageOwner.date * 1000, a2);
                                                                        String str282222 = messageObject7.isSticker() ? "image/webp" : "image/jpeg";
                                                                        if (file7.exists()) {
                                                                            try {
                                                                                d = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", file7);
                                                                            } catch (Exception e14) {
                                                                                FileLog.e(e14);
                                                                            }
                                                                        } else {
                                                                            if (notificationsController2.getFileLoader().isLoadingFile(file7.getName())) {
                                                                                d = new Uri.Builder().scheme("content").authority(NotificationImageProvider.getAuthority()).appendPath("msg_media_raw").appendPath(notificationsController2.currentAccount + str16).appendPath(file7.getName()).appendQueryParameter("final_path", file7.getAbsolutePath()).build();
                                                                            }
                                                                            d = null;
                                                                        }
                                                                        if (d != null) {
                                                                            xVar32222.e = str282222;
                                                                            xVar32222.f = d;
                                                                            yVar2 = yVar3;
                                                                            ArrayList arrayList29 = yVar2.e;
                                                                            arrayList29.add(xVar32222);
                                                                            if (arrayList29.size() > 25) {
                                                                                arrayList29.remove(0);
                                                                            }
                                                                            ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", d, 1);
                                                                            vg vgVar = new vg(3, d, file8);
                                                                            iVar8 = iVar132222;
                                                                            AndroidUtilities.runOnUIThread(vgVar, 20000L);
                                                                            if (!TextUtils.isEmpty(messageObject7.caption)) {
                                                                                e0.x xVar4 = new e0.x(messageObject7.caption, messageObject7.messageOwner.date * 1000, a2);
                                                                                ArrayList arrayList30 = yVar2.e;
                                                                                arrayList30.add(xVar4);
                                                                                if (arrayList30.size() > 25) {
                                                                                    arrayList30.remove(0);
                                                                                }
                                                                            }
                                                                            c10 = 0;
                                                                            if (zArr[c10] && !z15 && messageObject7.isVoice()) {
                                                                                arrayList9 = (ArrayList) yVar2.d();
                                                                                if (!arrayList9.isEmpty()) {
                                                                                    File pathToMessage2 = notificationsController2.getFileLoader().getPathToMessage(messageObject7.messageOwner);
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
                                                                                            e0.x xVar5 = (e0.x) hg.c.g(1, arrayList9);
                                                                                            xVar5.e = "audio/ogg";
                                                                                            xVar5.f = uri2;
                                                                                        }
                                                                                    } else if (messageObject7.getDocument() != null) {
                                                                                        String attachFileName = FileLoader.getAttachFileName(messageObject7.getDocument());
                                                                                        if (!notificationsController2.pendingVoiceLoads.contains(attachFileName)) {
                                                                                            notificationsController2.pendingVoiceLoads.add(attachFileName);
                                                                                            notificationsController2.getFileLoader().loadFile(messageObject7.getDocument(), messageObject7, 3, 0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            iVar8 = iVar132222;
                                                                            yVar2 = yVar3;
                                                                        }
                                                                    }
                                                                    e0.x xVar6 = new e0.x(str26, messageObject7.messageOwner.date * 1000, a2);
                                                                    ArrayList arrayList31 = yVar2.e;
                                                                    arrayList31.add(xVar6);
                                                                    if (arrayList31.size() > 25) {
                                                                        c10 = 0;
                                                                        arrayList31.remove(0);
                                                                        if (zArr[c10]) {
                                                                            arrayList9 = (ArrayList) yVar2.d();
                                                                            if (!arrayList9.isEmpty()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    c10 = 0;
                                                                    if (zArr[c10]) {
                                                                    }
                                                                }
                                                                if (j13 == 777000) {
                                                                    TLRPC.ReplyMarkup replyMarkup2 = messageObject7.messageOwner.reply_markup;
                                                                    if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                                                        arrayList25 = ((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows;
                                                                        i38 = messageObject7.getId();
                                                                        size6 = i39 - 1;
                                                                        iVar = iVar8;
                                                                        yVar = yVar2;
                                                                        notificationsController3 = notificationsController2;
                                                                        messageObject = messageObject3;
                                                                        strArr222 = strArr;
                                                                        str24 = str13;
                                                                        arrayList24 = arrayList26;
                                                                        dialogKey2 = dialogKey6;
                                                                        id2 = i21;
                                                                        sb422 = sb2;
                                                                        j15 = j19;
                                                                        zArr222 = zArr;
                                                                    }
                                                                }
                                                                arrayList25 = arrayList27;
                                                                size6 = i39 - 1;
                                                                iVar = iVar8;
                                                                yVar = yVar2;
                                                                notificationsController3 = notificationsController2;
                                                                messageObject = messageObject3;
                                                                strArr222 = strArr;
                                                                str24 = str13;
                                                                arrayList24 = arrayList26;
                                                                dialogKey2 = dialogKey6;
                                                                id2 = i21;
                                                                sb422 = sb2;
                                                                j15 = j19;
                                                                zArr222 = zArr;
                                                            }
                                                        }
                                                        zArr = zArr222;
                                                        iVar8 = iVar;
                                                        j19 = j17;
                                                        notificationsController2 = notificationsController3;
                                                        yVar2 = yVar;
                                                        arrayList25 = arrayList27;
                                                        size6 = i39 - 1;
                                                        iVar = iVar8;
                                                        yVar = yVar2;
                                                        notificationsController3 = notificationsController2;
                                                        messageObject = messageObject3;
                                                        strArr222 = strArr;
                                                        str24 = str13;
                                                        arrayList24 = arrayList26;
                                                        dialogKey2 = dialogKey6;
                                                        id2 = i21;
                                                        sb422 = sb2;
                                                        j15 = j19;
                                                        zArr222 = zArr;
                                                    }
                                                    dialogKey3 = dialogKey2;
                                                    messageObject2 = messageObject;
                                                    arrayList7 = arrayList24;
                                                    notificationsController = notificationsController3;
                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList32 = arrayList25;
                                                    i20 = i38;
                                                    str12 = str9;
                                                    bitmap3 = bitmap2;
                                                    arrayList8 = arrayList32;
                                                }
                                                e0.y yVar422 = yVar;
                                                StringBuilder sb522 = sb422;
                                                a0.i iVar1222 = iVar;
                                                int i3522 = id2;
                                                j20 = j15;
                                                Intent intent322 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                intent322.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent322.setFlags(67108864);
                                                intent322.addCategory("android.intent.category.LAUNCHER");
                                                if (messageObject2 == null && messageObject2.isOauthPush) {
                                                    intent322.putExtra("oauth_url", messageObject2.localName);
                                                } else if (messageObject2 == null && messageObject2.isStoryReactionPush) {
                                                    intent322.putExtra("storyId", Math.abs(messageObject2.getId()));
                                                } else if (messageObject2 == null && messageObject2.isLiveStoryPush) {
                                                    if (j13 < 0) {
                                                        arrayList10 = arrayList8;
                                                        bitmap4 = bitmap3;
                                                        intent322.putExtra("chatId", -j13);
                                                    } else {
                                                        arrayList10 = arrayList8;
                                                        bitmap4 = bitmap3;
                                                        if (j13 > 0) {
                                                            intent322.putExtra("userId", j13);
                                                        }
                                                    }
                                                    intent322.putExtra("storyId", Math.abs(messageObject2.getId()));
                                                    dialogKey4 = dialogKey3;
                                                    q.r(a1.g.u(j13, "show extra notifications chatId ", " topicId "), j20);
                                                    if (j20 != 0) {
                                                    }
                                                    intent322.putExtra("currentAccount", notificationsController.currentAccount);
                                                    PendingIntent activity22 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322, 1140850688);
                                                    e0.e0 e0Var22 = new e0.e0();
                                                    if (iVar7 != null) {
                                                    }
                                                    Intent intent422 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                    intent422.addFlags(i17);
                                                    intent422.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                    intent422.putExtra(str11, j13);
                                                    intent422.putExtra(str10, i3522);
                                                    intent422.putExtra("currentAccount", notificationsController.currentAccount);
                                                    bitmap5 = bitmap4;
                                                    int i3622 = i20;
                                                    e0.h hVar322 = new e0.h(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent422, 167772160));
                                                    hVar322.g = 2;
                                                    hVar322.h = false;
                                                    e0.i b1222 = hVar322.b();
                                                    if (DialogObject.isEncryptedDialog(j13)) {
                                                    }
                                                    if (str18 != null) {
                                                    }
                                                    StringBuilder sb622 = new StringBuilder("tgaccount");
                                                    long j2922 = j16;
                                                    sb622.append(j2922);
                                                    e0Var22.b(sb622.toString());
                                                    if (dialogKey4.story) {
                                                    }
                                                    r rVar222 = new r(ApplicationLoader.applicationContext);
                                                    rVar222.g(str12);
                                                    String str2222 = str12;
                                                    rVar222.E.icon = R.drawable.notification;
                                                    rVar222.f(sb522.toString());
                                                    rVar222.h(16, true);
                                                    rVar222.i = dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList11.size();
                                                    rVar222.w = -15618822;
                                                    rVar222.r = false;
                                                    rVar222.E.when = j21;
                                                    rVar222.k = true;
                                                    rVar222.n(yVar422);
                                                    rVar222.g = activity22;
                                                    rVar222.c(e0Var22);
                                                    rVar222.l(String.valueOf(Long.MAX_VALUE - j21));
                                                    rVar222.u = "msg";
                                                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                    intent.putExtra("messageDate", i18);
                                                    intent.putExtra("dialogId", j13);
                                                    String str2322 = str17;
                                                    intent.putExtra(str2322, notificationsController.currentAccount);
                                                    if (dialogKey4.story) {
                                                    }
                                                    if (messageObject2 != null) {
                                                        intent.putExtra("storyReaction", true);
                                                    }
                                                    rVar222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                                                    if (z16) {
                                                    }
                                                    if (messageObject2 != null) {
                                                        replyMarkup = message.reply_markup;
                                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                        }
                                                    }
                                                    tL_inlineButtonTypeCopy = null;
                                                    keyboardInlineButton = null;
                                                    if (keyboardInlineButton != null) {
                                                    }
                                                    j22 = dialogKey4.dialogId;
                                                    if (j22 != UserObject.VERIFY) {
                                                    }
                                                    if (arrayList17.size() != 1) {
                                                    }
                                                    if (DialogObject.isEncryptedDialog(j13)) {
                                                    }
                                                    if (bitmap5 != null) {
                                                    }
                                                    if (!AndroidUtilities.needShowPasscode(false)) {
                                                    }
                                                    if (chat4 == null) {
                                                    }
                                                    user5 = user4;
                                                    boolean z2322 = z16;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                    }
                                                    FileLog.d("showExtraNotifications: holders.add " + j13);
                                                    int intValue22 = num2.intValue();
                                                    boolean z2422 = dialogKey4.story;
                                                    notification = notification2;
                                                    z16 = z2322;
                                                    notificationsController3 = notificationsController;
                                                    long j3022 = j13;
                                                    iVar6 = iVar1222;
                                                    arrayList5 = arrayList17;
                                                    1NotificationHolder r0222 = notificationsController3.new 1NotificationHolder(intValue22, j3022, z2422, j20, str2222, user5, chat4, rVar222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                    arrayList4 = arrayList;
                                                    arrayList4.add(r0222);
                                                    notificationsController3.wearNotificationsIds.k(num2, j3022);
                                                    i25 = i16 + 1;
                                                    arrayList = arrayList4;
                                                    arrayList14 = arrayList5;
                                                    iVar10 = iVar4;
                                                    z14 = z15;
                                                    z13 = z16;
                                                    size = i15;
                                                    notificationsSettings = sharedPreferences;
                                                    iVar11 = iVar5;
                                                    clientUserId = j14;
                                                    b11 = notification;
                                                    iVar = iVar6;
                                                } else {
                                                    arrayList10 = arrayList8;
                                                    bitmap4 = bitmap3;
                                                    dialogKey4 = dialogKey3;
                                                    if (dialogKey4.story) {
                                                        long[] jArr2 = new long[notificationsController.storyPushMessages.size()];
                                                        for (int i41 = 0; i41 < notificationsController.storyPushMessages.size(); i41++) {
                                                            jArr2[i41] = notificationsController.storyPushMessages.get(i41).dialogId;
                                                        }
                                                        intent322.putExtra("storyDialogIds", jArr2);
                                                    } else if (DialogObject.isEncryptedDialog(j13)) {
                                                        intent322.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                                                    } else if (DialogObject.isUserDialog(j13)) {
                                                        intent322.putExtra("userId", j13);
                                                    } else {
                                                        intent322.putExtra("chatId", -j13);
                                                    }
                                                    q.r(a1.g.u(j13, "show extra notifications chatId ", " topicId "), j20);
                                                    if (j20 != 0) {
                                                        intent322.putExtra("topicId", j20);
                                                    }
                                                    intent322.putExtra("currentAccount", notificationsController.currentAccount);
                                                    PendingIntent activity222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322, 1140850688);
                                                    e0.e0 e0Var222 = new e0.e0();
                                                    if (iVar7 != null) {
                                                        e0Var222.a(iVar7);
                                                    }
                                                    Intent intent4222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                    intent4222.addFlags(i17);
                                                    intent4222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                    intent4222.putExtra(str11, j13);
                                                    intent4222.putExtra(str10, i3522);
                                                    intent4222.putExtra("currentAccount", notificationsController.currentAccount);
                                                    bitmap5 = bitmap4;
                                                    int i36222 = i20;
                                                    e0.h hVar3222 = new e0.h(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4222, 167772160));
                                                    hVar3222.g = 2;
                                                    hVar3222.h = false;
                                                    e0.i b12222 = hVar3222.b();
                                                    if (DialogObject.isEncryptedDialog(j13)) {
                                                        str17 = "currentAccount";
                                                        iVar9 = iVar7;
                                                        str18 = j13 != globalSecretChatId ? "tgenc" + DialogObject.getEncryptedChatId(j13) + "_" + i3522 : null;
                                                    } else if (DialogObject.isUserDialog(j13)) {
                                                        str17 = "currentAccount";
                                                        iVar9 = iVar7;
                                                        str18 = "tguser" + j13 + "_" + i3522;
                                                    } else {
                                                        StringBuilder sb7 = new StringBuilder("tgchat");
                                                        str17 = "currentAccount";
                                                        iVar9 = iVar7;
                                                        sb7.append(-j13);
                                                        sb7.append("_");
                                                        sb7.append(i3522);
                                                        str18 = sb7.toString();
                                                    }
                                                    if (str18 != null) {
                                                        e0Var222.g = str18;
                                                        e0.e0 e0Var3 = new e0.e0();
                                                        e0Var3.g = "summary_".concat(str18);
                                                        rVar.c(e0Var3);
                                                    }
                                                    StringBuilder sb6222 = new StringBuilder("tgaccount");
                                                    long j29222 = j16;
                                                    sb6222.append(j29222);
                                                    e0Var222.b(sb6222.toString());
                                                    if (dialogKey4.story) {
                                                        j14 = j29222;
                                                        j21 = Long.MAX_VALUE;
                                                        for (int i42 = 0; i42 < notificationsController.storyPushMessages.size(); i42++) {
                                                            j21 = Math.min(notificationsController.storyPushMessages.get(i42).date, j21);
                                                        }
                                                        arrayList11 = arrayList7;
                                                    } else {
                                                        j14 = j29222;
                                                        arrayList11 = arrayList7;
                                                        j21 = ((MessageObject) arrayList11.get(0)).messageOwner.date * 1000;
                                                    }
                                                    r rVar2222 = new r(ApplicationLoader.applicationContext);
                                                    rVar2222.g(str12);
                                                    String str22222 = str12;
                                                    rVar2222.E.icon = R.drawable.notification;
                                                    rVar2222.f(sb522.toString());
                                                    rVar2222.h(16, true);
                                                    rVar2222.i = dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList11.size();
                                                    rVar2222.w = -15618822;
                                                    rVar2222.r = false;
                                                    rVar2222.E.when = j21;
                                                    rVar2222.k = true;
                                                    rVar2222.n(yVar422);
                                                    rVar2222.g = activity222;
                                                    rVar2222.c(e0Var222);
                                                    rVar2222.l(String.valueOf(Long.MAX_VALUE - j21));
                                                    rVar2222.u = "msg";
                                                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                    intent.putExtra("messageDate", i18);
                                                    intent.putExtra("dialogId", j13);
                                                    String str23222 = str17;
                                                    intent.putExtra(str23222, notificationsController.currentAccount);
                                                    if (dialogKey4.story) {
                                                        intent.putExtra("story", true);
                                                    }
                                                    if (messageObject2 != null && messageObject2.isStoryReactionPush) {
                                                        intent.putExtra("storyReaction", true);
                                                    }
                                                    rVar2222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                                                    if (z16) {
                                                        rVar2222.q = notificationsController.notificationGroup;
                                                        rVar2222.i();
                                                    }
                                                    if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                                                        replyMarkup = message.reply_markup;
                                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                                            keyboardInlineButton = null;
                                                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = null;
                                                            for (int i43 = 0; i43 < tL_replyInlineMarkup.rows.size(); i43++) {
                                                                int i44 = 0;
                                                                while (true) {
                                                                    if (i44 >= tL_replyInlineMarkup.rows.get(i43).buttons.size()) {
                                                                        break;
                                                                    }
                                                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = tL_replyInlineMarkup.rows.get(i43).buttons.get(i44);
                                                                    tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCopy.class);
                                                                    if (tL_inlineButtonTypeCopy2 != null) {
                                                                        keyboardInlineButton = keyboardInlineButton2;
                                                                        break;
                                                                    }
                                                                    i44++;
                                                                }
                                                                if (keyboardInlineButton != null) {
                                                                    break;
                                                                }
                                                            }
                                                            tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                            if (keyboardInlineButton != null) {
                                                                Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                                                                intent5.addFlags(32);
                                                                intent5.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                                                                intent5.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                                                                e0.h hVar4 = new e0.h(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent5, 167772160));
                                                                hVar4.h = false;
                                                                rVar2222.b.add(hVar4.b());
                                                            }
                                                            j22 = dialogKey4.dialogId;
                                                            if (j22 != UserObject.VERIFY && j22 != UserObject.OAUTH) {
                                                                if (iVar9 != null) {
                                                                    rVar2222.b.add(iVar9);
                                                                }
                                                                if (!z15 && !dialogKey4.story && (messageObject2 == null || !messageObject2.isStoryReactionPush)) {
                                                                    rVar2222.b.add(b12222);
                                                                }
                                                            }
                                                            if (arrayList17.size() != 1 && !TextUtils.isEmpty(str) && !dialogKey4.story) {
                                                                rVar2222.o(str);
                                                            }
                                                            if (DialogObject.isEncryptedDialog(j13)) {
                                                                rVar2222.k();
                                                            }
                                                            if (bitmap5 != null) {
                                                                rVar2222.j(bitmap5);
                                                            }
                                                            if (!AndroidUtilities.needShowPasscode(false) && !SharedConfig.isWaitingForPasscodeEnter && arrayList10 != null) {
                                                                size3 = arrayList10.size();
                                                                i23 = 0;
                                                                while (i23 < size3) {
                                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList33 = arrayList10;
                                                                    TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList33.get(i23);
                                                                    int size7 = keyboardInlineButtonRow.buttons.size();
                                                                    int i45 = 0;
                                                                    while (i45 < size7) {
                                                                        TL_keyboard.KeyboardInlineButton keyboardInlineButton3 = keyboardInlineButtonRow.buttons.get(i45);
                                                                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) zf.c.a(keyboardInlineButton3, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                        if (tL_inlineButtonTypeCallback != null) {
                                                                            i24 = size3;
                                                                            Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                            intent6.putExtra(str23222, notificationsController.currentAccount);
                                                                            intent6.putExtra("did", j13);
                                                                            byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                            if (bArr != null) {
                                                                                intent6.putExtra("data", bArr);
                                                                            }
                                                                            intent6.putExtra("mid", i36222);
                                                                            String str29 = keyboardInlineButton3.text;
                                                                            Context context = ApplicationLoader.applicationContext;
                                                                            int i46 = notificationsController.lastButtonId;
                                                                            notificationsController.lastButtonId = i46 + 1;
                                                                            rVar2222.a(0, str29, PendingIntent.getBroadcast(context, i46, intent6, 167772160));
                                                                        } else {
                                                                            i24 = size3;
                                                                        }
                                                                        i45++;
                                                                        size3 = i24;
                                                                    }
                                                                    i23++;
                                                                    arrayList10 = arrayList33;
                                                                }
                                                            }
                                                            if (chat4 == null || user4 == null) {
                                                                user5 = user4;
                                                            } else {
                                                                user5 = user4;
                                                                String str30 = user5.phone;
                                                                if (str30 != null && str30.length() > 0) {
                                                                    String str31 = "tel:+" + user5.phone;
                                                                    if (str31 != null && !str31.isEmpty()) {
                                                                        rVar2222.F.add(str31);
                                                                    }
                                                                }
                                                            }
                                                            boolean z23222 = z16;
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                notificationsController.setNotificationChannel(notification2, rVar2222, z23222);
                                                            }
                                                            FileLog.d("showExtraNotifications: holders.add " + j13);
                                                            int intValue222 = num2.intValue();
                                                            boolean z24222 = dialogKey4.story;
                                                            notification = notification2;
                                                            z16 = z23222;
                                                            notificationsController3 = notificationsController;
                                                            long j30222 = j13;
                                                            iVar6 = iVar1222;
                                                            arrayList5 = arrayList17;
                                                            1NotificationHolder r02222 = notificationsController3.new 1NotificationHolder(intValue222, j30222, z24222, j20, str22222, user5, chat4, rVar2222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                            arrayList4 = arrayList;
                                                            arrayList4.add(r02222);
                                                            notificationsController3.wearNotificationsIds.k(num2, j30222);
                                                            i25 = i16 + 1;
                                                            arrayList = arrayList4;
                                                            arrayList14 = arrayList5;
                                                            iVar10 = iVar4;
                                                            z14 = z15;
                                                            z13 = z16;
                                                            size = i15;
                                                            notificationsSettings = sharedPreferences;
                                                            iVar11 = iVar5;
                                                            clientUserId = j14;
                                                            b11 = notification;
                                                            iVar = iVar6;
                                                        }
                                                    }
                                                    tL_inlineButtonTypeCopy = null;
                                                    keyboardInlineButton = null;
                                                    if (keyboardInlineButton != null) {
                                                    }
                                                    j22 = dialogKey4.dialogId;
                                                    if (j22 != UserObject.VERIFY) {
                                                        if (iVar9 != null) {
                                                        }
                                                        if (!z15) {
                                                            rVar2222.b.add(b12222);
                                                        }
                                                    }
                                                    if (arrayList17.size() != 1) {
                                                    }
                                                    if (DialogObject.isEncryptedDialog(j13)) {
                                                    }
                                                    if (bitmap5 != null) {
                                                    }
                                                    if (!AndroidUtilities.needShowPasscode(false)) {
                                                        size3 = arrayList10.size();
                                                        i23 = 0;
                                                        while (i23 < size3) {
                                                        }
                                                    }
                                                    if (chat4 == null) {
                                                    }
                                                    user5 = user4;
                                                    boolean z232222 = z16;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                    }
                                                    FileLog.d("showExtraNotifications: holders.add " + j13);
                                                    int intValue2222 = num2.intValue();
                                                    boolean z242222 = dialogKey4.story;
                                                    notification = notification2;
                                                    z16 = z232222;
                                                    notificationsController3 = notificationsController;
                                                    long j302222 = j13;
                                                    iVar6 = iVar1222;
                                                    arrayList5 = arrayList17;
                                                    1NotificationHolder r022222 = notificationsController3.new 1NotificationHolder(intValue2222, j302222, z242222, j20, str22222, user5, chat4, rVar2222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                    arrayList4 = arrayList;
                                                    arrayList4.add(r022222);
                                                    notificationsController3.wearNotificationsIds.k(num2, j302222);
                                                    i25 = i16 + 1;
                                                    arrayList = arrayList4;
                                                    arrayList14 = arrayList5;
                                                    iVar10 = iVar4;
                                                    z14 = z15;
                                                    z13 = z16;
                                                    size = i15;
                                                    notificationsSettings = sharedPreferences;
                                                    iVar11 = iVar5;
                                                    clientUserId = j14;
                                                    b11 = notification;
                                                    iVar = iVar6;
                                                }
                                                arrayList10 = arrayList8;
                                                bitmap4 = bitmap3;
                                                dialogKey4 = dialogKey3;
                                                q.r(a1.g.u(j13, "show extra notifications chatId ", " topicId "), j20);
                                                if (j20 != 0) {
                                                }
                                                intent322.putExtra("currentAccount", notificationsController.currentAccount);
                                                PendingIntent activity2222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322, 1140850688);
                                                e0.e0 e0Var2222 = new e0.e0();
                                                if (iVar7 != null) {
                                                }
                                                Intent intent42222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                intent42222.addFlags(i17);
                                                intent42222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                intent42222.putExtra(str11, j13);
                                                intent42222.putExtra(str10, i3522);
                                                intent42222.putExtra("currentAccount", notificationsController.currentAccount);
                                                bitmap5 = bitmap4;
                                                int i362222 = i20;
                                                e0.h hVar32222 = new e0.h(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent42222, 167772160));
                                                hVar32222.g = 2;
                                                hVar32222.h = false;
                                                e0.i b122222 = hVar32222.b();
                                                if (DialogObject.isEncryptedDialog(j13)) {
                                                }
                                                if (str18 != null) {
                                                }
                                                StringBuilder sb62222 = new StringBuilder("tgaccount");
                                                long j292222 = j16;
                                                sb62222.append(j292222);
                                                e0Var2222.b(sb62222.toString());
                                                if (dialogKey4.story) {
                                                }
                                                r rVar22222 = new r(ApplicationLoader.applicationContext);
                                                rVar22222.g(str12);
                                                String str222222 = str12;
                                                rVar22222.E.icon = R.drawable.notification;
                                                rVar22222.f(sb522.toString());
                                                rVar22222.h(16, true);
                                                rVar22222.i = dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList11.size();
                                                rVar22222.w = -15618822;
                                                rVar22222.r = false;
                                                rVar22222.E.when = j21;
                                                rVar22222.k = true;
                                                rVar22222.n(yVar422);
                                                rVar22222.g = activity2222;
                                                rVar22222.c(e0Var2222);
                                                rVar22222.l(String.valueOf(Long.MAX_VALUE - j21));
                                                rVar22222.u = "msg";
                                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent.putExtra("messageDate", i18);
                                                intent.putExtra("dialogId", j13);
                                                String str232222 = str17;
                                                intent.putExtra(str232222, notificationsController.currentAccount);
                                                if (dialogKey4.story) {
                                                }
                                                if (messageObject2 != null) {
                                                }
                                                rVar22222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                                                if (z16) {
                                                }
                                                if (messageObject2 != null) {
                                                }
                                                tL_inlineButtonTypeCopy = null;
                                                keyboardInlineButton = null;
                                                if (keyboardInlineButton != null) {
                                                }
                                                j22 = dialogKey4.dialogId;
                                                if (j22 != UserObject.VERIFY) {
                                                }
                                                if (arrayList17.size() != 1) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j13)) {
                                                }
                                                if (bitmap5 != null) {
                                                }
                                                if (!AndroidUtilities.needShowPasscode(false)) {
                                                }
                                                if (chat4 == null) {
                                                }
                                                user5 = user4;
                                                boolean z2322222 = z16;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                FileLog.d("showExtraNotifications: holders.add " + j13);
                                                int intValue22222 = num2.intValue();
                                                boolean z2422222 = dialogKey4.story;
                                                notification = notification2;
                                                z16 = z2322222;
                                                notificationsController3 = notificationsController;
                                                long j3022222 = j13;
                                                iVar6 = iVar1222;
                                                arrayList5 = arrayList17;
                                                1NotificationHolder r0222222 = notificationsController3.new 1NotificationHolder(intValue22222, j3022222, z2422222, j20, str222222, user5, chat4, rVar22222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                arrayList4 = arrayList;
                                                arrayList4.add(r0222222);
                                                notificationsController3.wearNotificationsIds.k(num2, j3022222);
                                                i25 = i16 + 1;
                                                arrayList = arrayList4;
                                                arrayList14 = arrayList5;
                                                iVar10 = iVar4;
                                                z14 = z15;
                                                z13 = z16;
                                                size = i15;
                                                notificationsSettings = sharedPreferences;
                                                iVar11 = iVar5;
                                                clientUserId = j14;
                                                b11 = notification;
                                                iVar = iVar6;
                                            }
                                        }
                                    }
                                    j15 = j12;
                                }
                                str11 = "dialog_id";
                                arrayList6 = arrayList3;
                                e0.n0 n0Var3222 = n0Var2;
                                if (n0Var3222 == null) {
                                }
                                i19 = Build.VERSION.SDK_INT;
                                if (i19 >= 28) {
                                }
                                yVar.f(format);
                                yVar.i = Boolean.valueOf(i19 >= 28 || (!z20 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                                StringBuilder sb4222 = new StringBuilder();
                                String[] strArr2222 = new String[1];
                                boolean[] zArr2222 = new boolean[1];
                                if (dialogKey2.story) {
                                }
                                e0.y yVar4222 = yVar;
                                StringBuilder sb5222 = sb4222;
                                a0.i iVar12222 = iVar;
                                int i35222 = id2;
                                j20 = j15;
                                Intent intent3222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                intent3222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent3222.setFlags(67108864);
                                intent3222.addCategory("android.intent.category.LAUNCHER");
                                if (messageObject2 == null) {
                                }
                                if (messageObject2 == null) {
                                }
                                if (messageObject2 == null) {
                                }
                                arrayList10 = arrayList8;
                                bitmap4 = bitmap3;
                                dialogKey4 = dialogKey3;
                                if (dialogKey4.story) {
                                }
                                q.r(a1.g.u(j13, "show extra notifications chatId ", " topicId "), j20);
                                if (j20 != 0) {
                                }
                                intent3222.putExtra("currentAccount", notificationsController.currentAccount);
                                PendingIntent activity22222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3222, 1140850688);
                                e0.e0 e0Var22222 = new e0.e0();
                                if (iVar7 != null) {
                                }
                                Intent intent422222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                intent422222.addFlags(i17);
                                intent422222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                intent422222.putExtra(str11, j13);
                                intent422222.putExtra(str10, i35222);
                                intent422222.putExtra("currentAccount", notificationsController.currentAccount);
                                bitmap5 = bitmap4;
                                int i3622222 = i20;
                                e0.h hVar322222 = new e0.h(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent422222, 167772160));
                                hVar322222.g = 2;
                                hVar322222.h = false;
                                e0.i b1222222 = hVar322222.b();
                                if (DialogObject.isEncryptedDialog(j13)) {
                                }
                                if (str18 != null) {
                                }
                                StringBuilder sb622222 = new StringBuilder("tgaccount");
                                long j2922222 = j16;
                                sb622222.append(j2922222);
                                e0Var22222.b(sb622222.toString());
                                if (dialogKey4.story) {
                                }
                                r rVar222222 = new r(ApplicationLoader.applicationContext);
                                rVar222222.g(str12);
                                String str2222222 = str12;
                                rVar222222.E.icon = R.drawable.notification;
                                rVar222222.f(sb5222.toString());
                                rVar222222.h(16, true);
                                rVar222222.i = dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList11.size();
                                rVar222222.w = -15618822;
                                rVar222222.r = false;
                                rVar222222.E.when = j21;
                                rVar222222.k = true;
                                rVar222222.n(yVar4222);
                                rVar222222.g = activity22222;
                                rVar222222.c(e0Var22222);
                                rVar222222.l(String.valueOf(Long.MAX_VALUE - j21));
                                rVar222222.u = "msg";
                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent.putExtra("messageDate", i18);
                                intent.putExtra("dialogId", j13);
                                String str2322222 = str17;
                                intent.putExtra(str2322222, notificationsController.currentAccount);
                                if (dialogKey4.story) {
                                }
                                if (messageObject2 != null) {
                                }
                                rVar222222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                                if (z16) {
                                }
                                if (messageObject2 != null) {
                                }
                                tL_inlineButtonTypeCopy = null;
                                keyboardInlineButton = null;
                                if (keyboardInlineButton != null) {
                                }
                                j22 = dialogKey4.dialogId;
                                if (j22 != UserObject.VERIFY) {
                                }
                                if (arrayList17.size() != 1) {
                                }
                                if (DialogObject.isEncryptedDialog(j13)) {
                                }
                                if (bitmap5 != null) {
                                }
                                if (!AndroidUtilities.needShowPasscode(false)) {
                                }
                                if (chat4 == null) {
                                }
                                user5 = user4;
                                boolean z23222222 = z16;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                FileLog.d("showExtraNotifications: holders.add " + j13);
                                int intValue222222 = num2.intValue();
                                boolean z24222222 = dialogKey4.story;
                                notification = notification2;
                                z16 = z23222222;
                                notificationsController3 = notificationsController;
                                long j30222222 = j13;
                                iVar6 = iVar12222;
                                arrayList5 = arrayList17;
                                1NotificationHolder r02222222 = notificationsController3.new 1NotificationHolder(intValue222222, j30222222, z24222222, j20, str2222222, user5, chat4, rVar222222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                arrayList4 = arrayList;
                                arrayList4.add(r02222222);
                                notificationsController3.wearNotificationsIds.k(num2, j30222222);
                                i25 = i16 + 1;
                                arrayList = arrayList4;
                                arrayList14 = arrayList5;
                                iVar10 = iVar4;
                                z14 = z15;
                                z13 = z16;
                                size = i15;
                                notificationsSettings = sharedPreferences;
                                iVar11 = iVar5;
                                clientUserId = j14;
                                b11 = notification;
                                iVar = iVar6;
                            }
                        }
                        user2 = user6;
                        str5 = str19;
                        dialogKey = dialogKey5;
                        string = str20;
                    } else {
                        num2 = num;
                        i18 = i31;
                        iVar5 = iVar11;
                        if (DialogObject.isEncryptedDialog(j13)) {
                            str5 = "Stories";
                            dialogKey = dialogKey5;
                            if (j13 != globalSecretChatId) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(j13);
                                TLRPC.EncryptedChat encryptedChat = notificationsController3.getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                                if (encryptedChat != null) {
                                    user = notificationsController3.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                                    if (user == null) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.w("not found secret chat user to show dialog notification " + encryptedChat.user_id);
                                        }
                                    }
                                } else if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("not found secret chat to show dialog notification " + encryptedChatId);
                                }
                            } else {
                                user = null;
                            }
                            user2 = user;
                            string = LocaleController.getString(R.string.SecretChatName);
                        } else {
                            boolean z25 = (messageObject == null || messageObject.isReactionPush || messageObject.isStoryReactionPush || j13 == 777000) ? false : true;
                            if (DialogObject.isUserDialog(j13)) {
                                TLRPC.User user10 = notificationsController3.getMessagesController().getUser(Long.valueOf(j13));
                                if (user10 != null) {
                                    String userName = UserObject.getUserName(user10);
                                    TLRPC.UserProfilePhoto userProfilePhoto6 = user10.photo;
                                    if (userProfilePhoto6 == null || (fileLocation3 = userProfilePhoto6.photo_small) == null) {
                                        user3 = user10;
                                        str7 = userName;
                                    } else {
                                        user3 = user10;
                                        str7 = userName;
                                        if (fileLocation3.volume_id != 0 && fileLocation3.local_id != 0) {
                                            str6 = str7;
                                            if (j13 != UserObject.OAUTH) {
                                                string2 = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                            } else if (j13 == UserObject.VERIFY) {
                                                string2 = LocaleController.getString(R.string.VerifyCodesNotifications);
                                            } else if (UserObject.isReplyUser(j13)) {
                                                string2 = LocaleController.getString(R.string.RepliesTitle);
                                            } else {
                                                if (j13 == j11) {
                                                    string2 = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                                                }
                                                str5 = "Stories";
                                                dialogKey = dialogKey5;
                                                chat = null;
                                                z18 = false;
                                                z17 = false;
                                                if (j13 == UserObject.VERIFY || messageObject == null || messageObject.getForwardedFromId() == null) {
                                                    z19 = z25;
                                                    chat2 = chat;
                                                    string = str6;
                                                } else {
                                                    z19 = z25;
                                                    Long forwardedFromId = messageObject.getForwardedFromId();
                                                    chat2 = chat;
                                                    string = str6;
                                                    long longValue = forwardedFromId.longValue();
                                                    if (!DialogObject.isUserDialog(longValue) ? !((chatPhoto = notificationsController3.getMessagesController().getChat(Long.valueOf(-longValue)).photo) == null || (fileLocation4 = chatPhoto.photo_small) == null || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0) : !((userProfilePhoto = notificationsController3.getMessagesController().getUser(forwardedFromId).photo) == null || (fileLocation4 = userProfilePhoto.photo_small) == null || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0)) {
                                                        fileLocation3 = fileLocation4;
                                                    }
                                                }
                                                user2 = user3;
                                                chat3 = chat2;
                                            }
                                            str6 = string2;
                                            str5 = "Stories";
                                            dialogKey = dialogKey5;
                                            chat = null;
                                            z18 = false;
                                            z17 = false;
                                            if (j13 == UserObject.VERIFY) {
                                            }
                                            z19 = z25;
                                            chat2 = chat;
                                            string = str6;
                                            user2 = user3;
                                            chat3 = chat2;
                                        }
                                    }
                                    str6 = str7;
                                } else if (messageObject.isFcmMessage()) {
                                    str6 = messageObject.localName;
                                    user3 = user10;
                                } else if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("not found user to show dialog notification " + j13);
                                }
                                fileLocation3 = null;
                                if (j13 != UserObject.OAUTH) {
                                }
                                str6 = string2;
                                str5 = "Stories";
                                dialogKey = dialogKey5;
                                chat = null;
                                z18 = false;
                                z17 = false;
                                if (j13 == UserObject.VERIFY) {
                                }
                                z19 = z25;
                                chat2 = chat;
                                string = str6;
                                user2 = user3;
                                chat3 = chat2;
                            } else {
                                chat = notificationsController3.getMessagesController().getChat(Long.valueOf(-j13));
                                if (chat != null) {
                                    boolean z26 = chat.megagroup;
                                    boolean z27 = ChatObject.isChannel(chat) && !chat.megagroup;
                                    boolean z28 = z25;
                                    String title = notificationsController3.getTitle(chat);
                                    z17 = z26;
                                    TLRPC.ChatPhoto chatPhoto3 = chat.photo;
                                    if (chatPhoto3 == null || (fileLocation = chatPhoto3.photo_small) == null) {
                                        str5 = "Stories";
                                        dialogKey = dialogKey5;
                                    } else {
                                        str5 = "Stories";
                                        dialogKey = dialogKey5;
                                        if (fileLocation.volume_id != 0) {
                                        }
                                    }
                                    fileLocation = null;
                                    if (j12 != 0) {
                                        fileLocation2 = fileLocation;
                                        z18 = z27;
                                        TLRPC.TL_forumTopic findTopic = notificationsController3.getMessagesController().getTopicsController().findTopic(chat.id, j12);
                                        if (findTopic != null) {
                                            title = a1.g.r(findTopic.title, " in ", title, new StringBuilder());
                                        }
                                    } else {
                                        fileLocation2 = fileLocation;
                                        z18 = z27;
                                    }
                                    if (z28) {
                                        str6 = title;
                                        z25 = ChatObject.canSendPlain(chat);
                                    } else {
                                        str6 = title;
                                        z25 = z28;
                                    }
                                    fileLocation3 = fileLocation2;
                                    user3 = null;
                                } else if (messageObject.isFcmMessage()) {
                                    boolean isSupergroup = messageObject.isSupergroup();
                                    str6 = messageObject.localName;
                                    z17 = isSupergroup;
                                    str5 = "Stories";
                                    dialogKey = dialogKey5;
                                    z25 = false;
                                    user3 = null;
                                    z18 = messageObject.localChannel;
                                    fileLocation3 = null;
                                } else if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("not found chat to show dialog notification " + j13);
                                }
                                if (j13 == UserObject.VERIFY) {
                                }
                                z19 = z25;
                                chat2 = chat;
                                string = str6;
                                user2 = user3;
                                chat3 = chat2;
                            }
                        }
                        iVar6 = iVar;
                        arrayList4 = arrayList;
                        arrayList5 = arrayList17;
                        j14 = j11;
                        notification = notification2;
                        i25 = i16 + 1;
                        arrayList = arrayList4;
                        arrayList14 = arrayList5;
                        iVar10 = iVar4;
                        z14 = z15;
                        z13 = z16;
                        size = i15;
                        notificationsSettings = sharedPreferences;
                        iVar11 = iVar5;
                        clientUserId = j14;
                        b11 = notification;
                        iVar = iVar6;
                    }
                    chat3 = null;
                    fileLocation3 = null;
                    z18 = false;
                    z17 = false;
                    z19 = false;
                    if (messageObject == null) {
                    }
                    sharedPreferences2 = sharedPreferences;
                    fileLocation5 = fileLocation3;
                    if (z15) {
                    }
                    if (fileLocation6 == null) {
                    }
                    if (chat3 == null) {
                    }
                    File file102 = file2;
                    if (z20) {
                    }
                    chat4 = chat3;
                    str9 = str8;
                    Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                    intent22.putExtra("dialog_id", j13);
                    intent22.putExtra("max_id", id2);
                    intent22.putExtra("topic_id", j12);
                    intent22.putExtra("currentAccount", notificationsController3.currentAccount);
                    if (!arrayList3.isEmpty()) {
                    }
                    str10 = "max_id";
                    PendingIntent broadcast22 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent22, 167772160);
                    e0.p0 p0Var22 = new e0.p0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                    if (DialogObject.isChatDialog(j13)) {
                    }
                    e0.h hVar22 = new e0.h(R.drawable.ic_reply_icon, formatString, broadcast22);
                    hVar22.c();
                    hVar22.g = 1;
                    hVar22.a(p0Var22);
                    hVar22.h = z21;
                    b10 = hVar22.b();
                    num3 = (Integer) notificationsController3.pushDialogs.f(j13);
                    if (num3 == null) {
                    }
                    dialogKey2 = dialogKey;
                    if (!dialogKey2.story) {
                    }
                    if (size5 > 1) {
                    }
                    long j282 = j11;
                    iVar7 = b10;
                    e0.n0 n0Var22 = (e0.n0) iVar.f(j282);
                    if (Build.VERSION.SDK_INT >= 28) {
                    }
                    j15 = j12;
                    str11 = "dialog_id";
                    arrayList6 = arrayList3;
                    e0.n0 n0Var32222 = n0Var22;
                    if (n0Var32222 == null) {
                    }
                    i19 = Build.VERSION.SDK_INT;
                    if (i19 >= 28) {
                    }
                    yVar.f(format);
                    yVar.i = Boolean.valueOf(i19 >= 28 || (!z20 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13));
                    StringBuilder sb42222 = new StringBuilder();
                    String[] strArr22222 = new String[1];
                    boolean[] zArr22222 = new boolean[1];
                    if (dialogKey2.story) {
                    }
                    e0.y yVar42222 = yVar;
                    StringBuilder sb52222 = sb42222;
                    a0.i iVar122222 = iVar;
                    int i352222 = id2;
                    j20 = j15;
                    Intent intent32222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                    intent32222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent32222.setFlags(67108864);
                    intent32222.addCategory("android.intent.category.LAUNCHER");
                    if (messageObject2 == null) {
                    }
                    if (messageObject2 == null) {
                    }
                    if (messageObject2 == null) {
                    }
                    arrayList10 = arrayList8;
                    bitmap4 = bitmap3;
                    dialogKey4 = dialogKey3;
                    if (dialogKey4.story) {
                    }
                    q.r(a1.g.u(j13, "show extra notifications chatId ", " topicId "), j20);
                    if (j20 != 0) {
                    }
                    intent32222.putExtra("currentAccount", notificationsController.currentAccount);
                    PendingIntent activity222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32222, 1140850688);
                    e0.e0 e0Var222222 = new e0.e0();
                    if (iVar7 != null) {
                    }
                    Intent intent4222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                    intent4222222.addFlags(i17);
                    intent4222222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent4222222.putExtra(str11, j13);
                    intent4222222.putExtra(str10, i352222);
                    intent4222222.putExtra("currentAccount", notificationsController.currentAccount);
                    bitmap5 = bitmap4;
                    int i36222222 = i20;
                    e0.h hVar3222222 = new e0.h(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4222222, 167772160));
                    hVar3222222.g = 2;
                    hVar3222222.h = false;
                    e0.i b12222222 = hVar3222222.b();
                    if (DialogObject.isEncryptedDialog(j13)) {
                    }
                    if (str18 != null) {
                    }
                    StringBuilder sb6222222 = new StringBuilder("tgaccount");
                    long j29222222 = j16;
                    sb6222222.append(j29222222);
                    e0Var222222.b(sb6222222.toString());
                    if (dialogKey4.story) {
                    }
                    r rVar2222222 = new r(ApplicationLoader.applicationContext);
                    rVar2222222.g(str12);
                    String str22222222 = str12;
                    rVar2222222.E.icon = R.drawable.notification;
                    rVar2222222.f(sb52222.toString());
                    rVar2222222.h(16, true);
                    rVar2222222.i = dialogKey4.story ? notificationsController.storyPushMessages.size() : arrayList11.size();
                    rVar2222222.w = -15618822;
                    rVar2222222.r = false;
                    rVar2222222.E.when = j21;
                    rVar2222222.k = true;
                    rVar2222222.n(yVar42222);
                    rVar2222222.g = activity222222;
                    rVar2222222.c(e0Var222222);
                    rVar2222222.l(String.valueOf(Long.MAX_VALUE - j21));
                    rVar2222222.u = "msg";
                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                    intent.putExtra("messageDate", i18);
                    intent.putExtra("dialogId", j13);
                    String str23222222 = str17;
                    intent.putExtra(str23222222, notificationsController.currentAccount);
                    if (dialogKey4.story) {
                    }
                    if (messageObject2 != null) {
                    }
                    rVar2222222.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                    if (z16) {
                    }
                    if (messageObject2 != null) {
                    }
                    tL_inlineButtonTypeCopy = null;
                    keyboardInlineButton = null;
                    if (keyboardInlineButton != null) {
                    }
                    j22 = dialogKey4.dialogId;
                    if (j22 != UserObject.VERIFY) {
                    }
                    if (arrayList17.size() != 1) {
                    }
                    if (DialogObject.isEncryptedDialog(j13)) {
                    }
                    if (bitmap5 != null) {
                    }
                    if (!AndroidUtilities.needShowPasscode(false)) {
                    }
                    if (chat4 == null) {
                    }
                    user5 = user4;
                    boolean z232222222 = z16;
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    FileLog.d("showExtraNotifications: holders.add " + j13);
                    int intValue2222222 = num2.intValue();
                    boolean z242222222 = dialogKey4.story;
                    notification = notification2;
                    z16 = z232222222;
                    notificationsController3 = notificationsController;
                    long j302222222 = j13;
                    iVar6 = iVar122222;
                    arrayList5 = arrayList17;
                    1NotificationHolder r022222222 = notificationsController3.new 1NotificationHolder(intValue2222222, j302222222, z242222222, j20, str22222222, user5, chat4, rVar2222222, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                    arrayList4 = arrayList;
                    arrayList4.add(r022222222);
                    notificationsController3.wearNotificationsIds.k(num2, j302222222);
                    i25 = i16 + 1;
                    arrayList = arrayList4;
                    arrayList14 = arrayList5;
                    iVar10 = iVar4;
                    z14 = z15;
                    z13 = z16;
                    size = i15;
                    notificationsSettings = sharedPreferences;
                    iVar11 = iVar5;
                    clientUserId = j14;
                    b11 = notification;
                    iVar = iVar6;
                }
                Notification notification3 = b11;
                iVar2 = iVar11;
                a0.i iVar14 = iVar;
                ArrayList arrayList34 = arrayList;
                if (z13) {
                    arrayList2 = arrayList34;
                    if (notificationsController3.openedInBubbleDialogs.isEmpty()) {
                        if (BuildVars.LOGS_ENABLED) {
                            q.o(notificationsController3.notificationId, new StringBuilder("cancel summary with id "));
                        }
                        str3 = null;
                        notificationManager.b(notificationsController3.notificationId, null);
                        i13 = 0;
                        while (i13 < iVar2.m()) {
                            a0.i iVar15 = iVar2;
                            if (!notificationsController3.openedInBubbleDialogs.contains(Long.valueOf(iVar15.j(i13)))) {
                                Integer num5 = (Integer) iVar15.n(i13);
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("cancel notification id " + num5);
                                }
                                notificationManager.b(num5.intValue(), str3);
                            }
                            i13++;
                            iVar2 = iVar15;
                        }
                        ArrayList arrayList35 = new ArrayList(arrayList2.size());
                        FileLog.d("showExtraNotifications: holders.size()=" + arrayList2.size());
                        size2 = arrayList2.size();
                        i14 = 0;
                        while (i14 < size2) {
                            ArrayList arrayList36 = arrayList2;
                            1NotificationHolder r42 = (1NotificationHolder) arrayList36.get(i14);
                            arrayList35.clear();
                            if (Build.VERSION.SDK_INT < 29 || DialogObject.isEncryptedDialog(r42.dialogId)) {
                                iVar3 = iVar14;
                            } else {
                                r rVar3 = r42.notification;
                                long j32 = r42.dialogId;
                                iVar3 = iVar14;
                                String createNotificationShortcut = notificationsController3.createNotificationShortcut(rVar3, j32, r42.name, r42.user, r42.chat, (e0.n0) iVar3.f(j32), !r42.story);
                                if (createNotificationShortcut != null) {
                                    arrayList35.add(createNotificationShortcut);
                                }
                            }
                            FileLog.d("showExtraNotifications: holders[" + i14 + "].call()");
                            r42.call();
                            if (!unsupportedNotificationShortcut() && !arrayList35.isEmpty()) {
                                g0.f.o(ApplicationLoader.applicationContext, arrayList35);
                            }
                            i14++;
                            notificationsController3 = this;
                            arrayList2 = arrayList36;
                            iVar14 = iVar3;
                        }
                    }
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        q.o(notificationsController3.notificationId, new StringBuilder("show summary with id "));
                    }
                    try {
                        notificationManager.d(notificationsController3.notificationId, notification3);
                        arrayList2 = arrayList34;
                    } catch (SecurityException e15) {
                        FileLog.e(e15);
                        arrayList2 = arrayList34;
                        notificationsController3.resetNotificationSound(rVar, j3, j10, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                    }
                }
                str3 = null;
                i13 = 0;
                while (i13 < iVar2.m()) {
                }
                ArrayList arrayList352 = new ArrayList(arrayList2.size());
                FileLog.d("showExtraNotifications: holders.size()=" + arrayList2.size());
                size2 = arrayList2.size();
                i14 = 0;
                while (i14 < size2) {
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
        arrayList = arrayList16;
        while (true) {
            if (i25 >= size) {
            }
            i25 = i16 + 1;
            arrayList = arrayList4;
            arrayList14 = arrayList5;
            iVar10 = iVar4;
            z14 = z15;
            z13 = z16;
            size = i15;
            notificationsSettings = sharedPreferences;
            iVar11 = iVar5;
            clientUserId = j14;
            b11 = notification;
            iVar = iVar6;
        }
        Notification notification32 = b11;
        iVar2 = iVar11;
        a0.i iVar142 = iVar;
        ArrayList arrayList342 = arrayList;
        if (z13) {
        }
        str3 = null;
        i13 = 0;
        while (i13 < iVar2.m()) {
        }
        ArrayList arrayList3522 = new ArrayList(arrayList2.size());
        FileLog.d("showExtraNotifications: holders.size()=" + arrayList2.size());
        size2 = arrayList2.size();
        i14 = 0;
        while (i14 < size2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(71:126|(4:128|(2:130|(1:132)(1:586))(1:587)|133|(1:135)(3:581|582|(1:584)(1:585)))(1:588)|136|137|(3:563|564|(2:566|567)(4:(1:(2:576|(1:578)(1:579))(1:571))(1:580)|572|(1:574)|575))(4:140|(3:142|(2:164|165)(6:148|(1:150)|151|(1:163)(1:(1:155)(2:159|(1:161)(1:162)))|156|157)|158)|166|167)|168|(63:176|(1:561)(4:181|(1:183)(1:560)|(2:185|(1:187)(2:188|(1:190)(2:555|(1:557)(61:558|(2:193|(1:195))(1:554)|196|(4:198|(1:200)(1:552)|201|(51:203|204|205|(6:541|542|(1:544)(1:550)|545|(1:547)(1:549)|548)(1:(1:(3:211|(1:213)(1:517)|214)(3:518|(1:520)(1:522)|521))(46:523|(6:(1:526)(1:539)|527|(1:529)(2:(1:536)(1:538)|537)|530|(1:532)(1:534)|533)(1:540)|(1:217)(1:516)|218|(1:515)(1:222)|223|(1:226)|(1:230)|(1:514)(1:235)|(6:237|(1:239)|240|(1:242)(1:512)|243|(1:245)(1:511))(1:513)|(3:249|250|(1:254))|(1:259)(1:510)|260|(1:262)|263|264|(1:266)(3:448|449|(2:(2:452|453)(2:455|(1:457))|454)(30:458|(4:460|(2:463|461)|464|465)(29:466|(4:468|(1:(1:471)(2:472|(1:474)))|475|(27:(3:484|(1:492)|493)(3:494|(2:496|(1:504))|493)|270|(2:277|(1:281))|282|283|284|(1:286)|287|(3:289|290|291)(1:444)|292|(1:294)(1:(12:428|(1:430)(3:431|432|(4:434|(1:436)(1:441)|437|(1:439)))|296|(4:423|424|(2:426|421)|403)(1:(4:301|302|(1:304)|403)(5:404|(2:406|(1:408)(3:412|(2:414|(1:416))(2:417|(1:419))|403))(1:422)|409|(1:411)|403))|305|(1:402)(6:(3:397|(1:399)(1:401)|400)|(3:315|316|(6:318|(4:(1:324)(1:381)|(1:326)(1:380)|327|(1:329)(3:367|(1:369)(2:(2:375|(1:377)(1:378))|379)|370))|382|(0)(0)|327|(0)(0))(2:383|(1:385)(2:(2:387|(2:391|392))|395)))|396|(0)(0)|327|(0)(0))|330|(2:336|(7:338|(4:340|(3:342|(4:344|(1:346)|347|348)(2:350|351)|349)|352|353)|354|355|(1:363)|364|365))|366|(4:357|359|361|363)|364|365))|295|296|(1:298)|423|424|(0)|403|305|(0)|402|330|(4:332|334|336|(0))|366|(0)|364|365))(2:505|(1:509))|269|270|(4:273|275|277|(2:279|281))|282|283|284|(0)|287|(0)(0)|292|(0)(0)|295|296|(0)|423|424|(0)|403|305|(0)|402|330|(0)|366|(0)|364|365)|268|269|270|(0)|282|283|284|(0)|287|(0)(0)|292|(0)(0)|295|296|(0)|423|424|(0)|403|305|(0)|402|330|(0)|366|(0)|364|365))|267|268|269|270|(0)|282|283|284|(0)|287|(0)(0)|292|(0)(0)|295|296|(0)|423|424|(0)|403|305|(0)|402|330|(0)|366|(0)|364|365))|215|(0)(0)|218|(1:220)|515|223|(1:226)|(2:228|230)|(1:232)|514|(0)(0)|(4:247|249|250|(2:252|254))|(0)(0)|260|(0)|263|264|(0)(0)|267|268|269|270|(0)|282|283|284|(0)|287|(0)(0)|292|(0)(0)|295|296|(0)|423|424|(0)|403|305|(0)|402|330|(0)|366|(0)|364|365))(1:553)|551|204|205|(1:207)|541|542|(0)(0)|545|(0)(0)|548|215|(0)(0)|218|(0)|515|223|(0)|(0)|(0)|514|(0)(0)|(0)|(0)(0)|260|(0)|263|264|(0)(0)|267|268|269|270|(0)|282|283|284|(0)|287|(0)(0)|292|(0)(0)|295|296|(0)|423|424|(0)|403|305|(0)|402|330|(0)|366|(0)|364|365))))|559)|191|(0)(0)|196|(0)(0)|551|204|205|(0)|541|542|(0)(0)|545|(0)(0)|548|215|(0)(0)|218|(0)|515|223|(0)|(0)|(0)|514|(0)(0)|(0)|(0)(0)|260|(0)|263|264|(0)(0)|267|268|269|270|(0)|282|283|284|(0)|287|(0)(0)|292|(0)(0)|295|296|(0)|423|424|(0)|403|305|(0)|402|330|(0)|366|(0)|364|365)|562|(1:178)|561|191|(0)(0)|196|(0)(0)|551|204|205|(0)|541|542|(0)(0)|545|(0)(0)|548|215|(0)(0)|218|(0)|515|223|(0)|(0)|(0)|514|(0)(0)|(0)|(0)(0)|260|(0)|263|264|(0)(0)|267|268|269|270|(0)|282|283|284|(0)|287|(0)(0)|292|(0)(0)|295|296|(0)|423|424|(0)|403|305|(0)|402|330|(0)|366|(0)|364|365) */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0bd6, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0b30, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0b4d, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ce A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e9 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x06b6 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06f8 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0764 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x08cb A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x08dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x08e4 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08fd A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0973 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0981 A[Catch: Exception -> 0x0056, TRY_ENTER, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0ade A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0b28 A[Catch: all -> 0x0b30, TryCatch #0 {all -> 0x0b30, blocks: (B:284:0x0b0d, B:286:0x0b28, B:287:0x0b32, B:291:0x0b3a, B:292:0x0b42), top: B:283:0x0b0d }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b52 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0bf0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0ce5 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0d03 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0d53 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0d6a A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0e0e A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0d0f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0996 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0882 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x088e A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x03e1 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x03c2 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:599:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0137 A[Catch: Exception -> 0x0056, TryCatch #2 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0088, B:41:0x009e, B:43:0x00a6, B:45:0x00dc, B:47:0x00fe, B:49:0x0106, B:51:0x010e, B:54:0x0115, B:57:0x0129, B:58:0x01ee, B:59:0x0220, B:61:0x0232, B:63:0x0238, B:65:0x023c, B:67:0x0258, B:68:0x025f, B:71:0x0272, B:75:0x027e, B:77:0x028a, B:78:0x0290, B:80:0x029b, B:82:0x02a1, B:84:0x02ad, B:85:0x02b9, B:86:0x02c3, B:88:0x02d3, B:90:0x02e3, B:92:0x02e9, B:94:0x031f, B:609:0x033c, B:102:0x035f, B:104:0x0365, B:105:0x0373, B:107:0x0379, B:112:0x0384, B:115:0x0397, B:121:0x03ca, B:123:0x03ce, B:128:0x03e9, B:130:0x03f0, B:132:0x03f8, B:133:0x0426, B:136:0x049d, B:140:0x04bf, B:142:0x04e3, B:144:0x04f9, B:146:0x04fd, B:150:0x0509, B:151:0x050f, B:155:0x051c, B:156:0x0564, B:158:0x0567, B:159:0x0532, B:161:0x053a, B:162:0x054e, B:167:0x0572, B:171:0x05f2, B:181:0x060b, B:183:0x0629, B:185:0x065a, B:187:0x0664, B:188:0x067a, B:190:0x068b, B:193:0x06b6, B:196:0x06d9, B:198:0x06f8, B:200:0x0723, B:201:0x073f, B:203:0x074f, B:205:0x075e, B:207:0x0764, B:211:0x0774, B:213:0x0786, B:214:0x0799, B:218:0x08c5, B:220:0x08cb, B:228:0x08e4, B:230:0x08ea, B:237:0x08fd, B:240:0x0907, B:243:0x0912, B:257:0x0933, B:260:0x0943, B:262:0x0973, B:263:0x097a, B:266:0x0981, B:270:0x0a97, B:273:0x0ae0, B:275:0x0ae4, B:277:0x0aea, B:279:0x0b00, B:281:0x0b06, B:294:0x0b52, B:302:0x0bb3, B:309:0x0bf4, B:313:0x0c33, B:315:0x0c3b, B:318:0x0c43, B:320:0x0c4b, B:324:0x0c56, B:326:0x0ce5, B:329:0x0d03, B:330:0x0d4d, B:332:0x0d53, B:334:0x0d57, B:336:0x0d62, B:338:0x0d6a, B:340:0x0d76, B:342:0x0d85, B:344:0x0d99, B:346:0x0db8, B:347:0x0dbd, B:349:0x0de5, B:353:0x0df1, B:357:0x0e0e, B:359:0x0e14, B:361:0x0e1c, B:363:0x0e22, B:364:0x0e44, B:369:0x0d12, B:377:0x0d27, B:379:0x0d35, B:381:0x0c7b, B:382:0x0c80, B:383:0x0c83, B:385:0x0c8b, B:387:0x0c93, B:389:0x0c9b, B:394:0x0cd3, B:395:0x0cdb, B:397:0x0bfe, B:399:0x0c06, B:400:0x0c2e, B:402:0x0d3e, B:409:0x0bdb, B:414:0x0bc6, B:419:0x0bd1, B:424:0x0be3, B:428:0x0b5b, B:430:0x0b68, B:447:0x0b4d, B:448:0x0996, B:453:0x09a6, B:454:0x09b8, B:457:0x09b3, B:458:0x09c8, B:460:0x09d6, B:461:0x09df, B:463:0x09e7, B:465:0x09f6, B:466:0x09ff, B:468:0x0a05, B:471:0x0a12, B:474:0x0a1c, B:475:0x0a1f, B:477:0x0a25, B:479:0x0a2e, B:481:0x0a37, B:484:0x0a3f, B:486:0x0a45, B:488:0x0a49, B:490:0x0a51, B:496:0x0a5f, B:498:0x0a65, B:500:0x0a69, B:502:0x0a71, B:505:0x0a78, B:507:0x0a87, B:509:0x0a8d, B:517:0x0792, B:518:0x07c1, B:520:0x07d3, B:521:0x07e6, B:522:0x07df, B:527:0x081a, B:529:0x0822, B:530:0x083a, B:537:0x0835, B:542:0x0876, B:544:0x0882, B:545:0x0895, B:550:0x088e, B:552:0x0730, B:555:0x0697, B:557:0x069b, B:564:0x0581, B:571:0x0597, B:572:0x05da, B:575:0x05e0, B:576:0x05ab, B:578:0x05b1, B:579:0x05c5, B:581:0x0436, B:584:0x0442, B:585:0x045d, B:586:0x0405, B:589:0x03d6, B:591:0x03e1, B:594:0x03b4, B:596:0x03bb, B:597:0x03c2, B:602:0x036a, B:603:0x036f, B:615:0x02ff, B:617:0x0305, B:622:0x026f, B:624:0x0137, B:626:0x013d, B:627:0x0143, B:630:0x014d, B:631:0x0157, B:632:0x0169, B:634:0x016f, B:635:0x0186, B:637:0x018d, B:639:0x0195, B:640:0x01c5, B:641:0x011e, B:643:0x020e, B:392:0x0ca5, B:250:0x0925), top: B:11:0x002c, inners: #3, #5 }] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r5v148, types: [org.telegram.messenger.MessageObject] */
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
        String str7;
        boolean z17;
        boolean z18;
        String str8;
        String str9;
        SharedPreferences sharedPreferences4;
        long j20;
        boolean z19;
        long j21;
        long j22;
        long j23;
        long j24;
        int i11;
        int i12;
        boolean z20;
        String str10;
        Integer num;
        boolean z21;
        String str11;
        boolean z22;
        r rVar;
        long j25;
        String string2;
        boolean z23;
        int i13;
        String str12;
        boolean z24;
        int i14;
        int i15;
        int i16;
        boolean z25;
        int i17;
        int i18;
        String str13;
        int i19;
        boolean z26;
        boolean z27;
        int i20;
        int i21;
        int i22;
        String str14;
        String str15;
        int i23;
        int i24;
        Object obj;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation;
        int i25;
        r rVar2;
        long[] jArr;
        int i26;
        int i27;
        long[] jArr2;
        Uri uri;
        int i28;
        long[] jArr3;
        boolean z28;
        TLRPC.ReplyMarkup replyMarkup;
        int i29;
        int i30;
        long[] jArr4;
        Uri uri2;
        int i31;
        int i32;
        int i33;
        String str16;
        String str17;
        int ringerMode;
        String string3;
        boolean z29;
        String string4;
        boolean z30;
        String string5;
        boolean z31;
        int i34;
        String str18;
        boolean z32;
        String formatPluralString;
        if (!getUserConfig().isClientActivated() || ((this.pushMessages.isEmpty() && this.storyPushMessages.isEmpty()) || !(SharedConfig.showNotificationsForAllAccounts || this.currentAccount == UserConfig.selectedAccount))) {
            dismissNotification();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            long j26 = 0;
            StoryNotification storyNotification = null;
            for (int i35 = 0; i35 < this.pushMessages.size(); i35++) {
                MessageObject messageObject2 = this.pushMessages.get(i35);
                long j27 = messageObject2.messageOwner.date;
                if (j26 < j27) {
                    storyNotification = messageObject2;
                    j26 = j27;
                }
            }
            for (int i36 = 0; i36 < this.storyPushMessages.size(); i36++) {
                StoryNotification storyNotification2 = this.storyPushMessages.get(i36);
                long j28 = storyNotification2.date;
                if (j26 < j28 / 1000) {
                    storyNotification = storyNotification2;
                    j26 = j28 / 1000;
                }
            }
            if (storyNotification == null) {
                return;
            }
            String str19 = "";
            if (storyNotification instanceof StoryNotification) {
                StoryNotification storyNotification3 = storyNotification;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                int i37 = 0;
                boolean z33 = false;
                j3 = 1000;
                j10 = 0;
                int i38 = 0;
                while (i37 < this.storyPushMessages.size()) {
                    z33 |= this.storyPushMessages.get(i37).hidden;
                    tL_message.date = Math.min(tL_message.date, (int) (this.storyPushMessages.get(i37).date / 1000));
                    i38 += this.storyPushMessages.get(i37).dateByIds.size();
                    i37++;
                    str19 = str19;
                }
                String str20 = str19;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j29 = storyNotification3.dialogId;
                tL_peerUser.user_id = j29;
                tL_message.dialog_id = j29;
                tL_message.peer_id = tL_peerUser;
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<Object> arrayList2 = new ArrayList<>();
                parseStoryPushes(arrayList, arrayList2);
                Bitmap loadMultipleAvatars = SharedConfig.getDevicePerformanceClass() >= 1 ? loadMultipleAvatars(arrayList2) : null;
                if (!z33 && this.storyPushMessages.size() < 2 && !arrayList.isEmpty()) {
                    formatPluralString = arrayList.get(0);
                    String str21 = formatPluralString;
                    if (!z33) {
                        tL_message.message = LocaleController.formatPluralString("StoryNotificationHidden", i38, new Object[0]);
                        str = str20;
                    } else if (arrayList.isEmpty()) {
                        str = str20;
                        tL_message.message = str;
                    } else {
                        str = str20;
                        if (arrayList.size() == 1) {
                            if (i38 == 1) {
                                tL_message.message = LocaleController.getString("StoryNotificationSingle");
                            } else {
                                tL_message.message = LocaleController.formatPluralString("StoryNotification1", i38, arrayList.get(0));
                            }
                        } else if (arrayList.size() == 2) {
                            tL_message.message = LocaleController.formatString(R.string.StoryNotification2, arrayList.get(0), arrayList.get(1));
                        } else if (arrayList.size() == 3 && this.storyPushMessages.size() == 3) {
                            tL_message.message = LocaleController.formatString(R.string.StoryNotification3, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)), cutLastName(arrayList.get(2)));
                        } else {
                            tL_message.message = LocaleController.formatPluralString("StoryNotification4", this.storyPushMessages.size() - 2, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)));
                        }
                    }
                    MessageObject messageObject3 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str21, str21, false, false, false, false);
                    messageObject3.isStoryPush = true;
                    messageObject = messageObject3;
                    bitmap = loadMultipleAvatars;
                }
                formatPluralString = LocaleController.formatPluralString("Stories", i38, new Object[0]);
                String str212 = formatPluralString;
                if (!z33) {
                }
                MessageObject messageObject32 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str212, str212, false, false, false, false);
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
            int i39 = notificationsSettings.getInt("dismissDate", 0);
            if (!messageObject.isStoryPush && messageObject.messageOwner.date <= i39) {
                dismissNotification();
                return;
            }
            long dialogId = messageObject.getDialogId();
            long topicId = MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, getMessagesController().isForum(messageObject));
            boolean z34 = messageObject.isStoryPush;
            long fromChatId = messageObject.messageOwner.mentioned ? messageObject.getFromChatId() : dialogId;
            messageObject.getId();
            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
            long j30 = peer.chat_id;
            if (j30 == j10) {
                j30 = peer.channel_id;
            }
            String str22 = str;
            long j31 = peer.user_id;
            if (messageObject.isFromUser() && (j31 == j10 || j31 == getUserConfig().getClientUserId())) {
                j31 = messageObject.messageOwner.from_id.user_id;
            }
            if (messageObject.getDialogId() == UserObject.VERIFY && messageObject.getForwardedFromId() != null) {
                if (messageObject.getForwardedFromId().longValue() >= j10) {
                    j31 = messageObject.getForwardedFromId().longValue();
                    j30 = j10;
                } else {
                    j30 = messageObject.getForwardedFromId().longValue();
                    j31 = j10;
                }
            }
            TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j31));
            int i40 = (j30 > j10 ? 1 : (j30 == j10 ? 0 : -1));
            if (i40 != 0) {
                long j32 = j30;
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(j32));
                z12 = (chat4 == null && messageObject.isFcmMessage()) ? messageObject.localChannel : ChatObject.isChannel(chat4) && !chat4.megagroup;
                sharedPreferences = notificationsSettings;
                j12 = fromChatId;
                str2 = "file://";
                str3 = "currentAccount";
                z11 = z34;
                i10 = i40;
                j13 = topicId;
                j11 = j32;
                chat = chat4;
                notificationsController = this;
            } else {
                notificationsController = this;
                str2 = "file://";
                str3 = "currentAccount";
                z11 = z34;
                i10 = i40;
                chat = null;
                z12 = false;
                j11 = j30;
                sharedPreferences = notificationsSettings;
                j12 = fromChatId;
                j13 = topicId;
            }
            int notifyOverride = notificationsController.getNotifyOverride(sharedPreferences, j12, j13);
            long j33 = j12;
            long j34 = j13;
            if (notifyOverride == -1) {
                try {
                    Boolean valueOf = Boolean.valueOf(z12);
                    boolean z35 = messageObject.isReactionPush;
                    notificationsController2 = this;
                    SharedPreferences sharedPreferences5 = sharedPreferences;
                    bitmap2 = bitmap;
                    user = user3;
                    j14 = dialogId;
                    j15 = j34;
                    isGlobalNotificationsEnabled = notificationsController2.isGlobalNotificationsEnabled(j14, valueOf, z35, z35);
                    sharedPreferences2 = sharedPreferences5;
                } catch (Exception e7) {
                    e = e7;
                    FileLog.e(e);
                    return;
                }
            } else {
                notificationsController2 = this;
                sharedPreferences2 = sharedPreferences;
                bitmap2 = bitmap;
                user = user3;
                j14 = dialogId;
                j15 = j34;
                isGlobalNotificationsEnabled = notifyOverride != 2;
            }
            String title = (((i10 == 0 || chat != null) && user != null) || !messageObject.isFcmMessage()) ? chat != null ? notificationsController2.getTitle(chat) : UserObject.getUserName(user) : messageObject.localName;
            if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
                z13 = false;
                boolean z36 = isGlobalNotificationsEnabled;
                String str23 = title;
                boolean equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                if (DialogObject.isEncryptedDialog(j14)) {
                    if (equalsIgnoreCase) {
                        z14 = equalsIgnoreCase;
                        z32 = true;
                    } else {
                        z14 = equalsIgnoreCase;
                        z32 = true;
                        if (notificationsController2.pushDialogs.m() <= 1) {
                        }
                    }
                    if (!z13) {
                        z15 = z32;
                        string = str23;
                        if (!messageObject.isReactionPush && !messageObject.isStoryReactionPush) {
                            z16 = z15;
                            if (z14) {
                                j16 = j11;
                                j17 = j31;
                                chat2 = chat;
                                str4 = str22;
                            } else {
                                if (UserConfig.getActivatedAccountsCount() <= 1) {
                                    str4 = str22;
                                } else if (notificationsController2.pushDialogs.m() == 1) {
                                    str4 = UserObject.getFirstName(notificationsController2.getUserConfig().getCurrentUser());
                                } else {
                                    str4 = UserObject.getFirstName(notificationsController2.getUserConfig().getCurrentUser()) + "・";
                                }
                                chat2 = chat;
                                if (notificationsController2.pushDialogs.m() == 1) {
                                    j16 = j11;
                                    j17 = j31;
                                } else {
                                    j17 = j31;
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
                            }
                            r rVar3 = new r(ApplicationLoader.applicationContext);
                            if (notificationsController2.pushMessages.size() > 1 || z14) {
                                j18 = j14;
                                sharedPreferences3 = sharedPreferences2;
                                j19 = j15;
                                str5 = str22;
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
                                rVar3.f(str6);
                                if (z14) {
                                    str4 = str6;
                                }
                                e0.m mVar = new e0.m(0);
                                mVar.e(str6);
                                rVar3.n(mVar);
                                str7 = stringForMessage;
                                z17 = isSilentMessage;
                            } else {
                                rVar3.f(str4);
                                e0.m mVar2 = new e0.m(1);
                                mVar2.f(string);
                                j19 = j15;
                                int min = Math.min(10, notificationsController2.pushMessages.size());
                                boolean[] zArr2 = new boolean[1];
                                sharedPreferences3 = sharedPreferences2;
                                int i41 = 0;
                                ?? r14 = 2;
                                String str24 = null;
                                while (i41 < min) {
                                    int i42 = min;
                                    MessageObject messageObject4 = notificationsController2.pushMessages.get(i41);
                                    long j35 = j14;
                                    int i43 = i41;
                                    String stringForMessage2 = notificationsController2.getStringForMessage(messageObject4, false, zArr2, null);
                                    if (stringForMessage2 == null || (!messageObject4.isStoryPush && messageObject4.messageOwner.date <= i39)) {
                                        str18 = str22;
                                    } else {
                                        r14 = r14;
                                        if (r14 == 2) {
                                            str24 = stringForMessage2;
                                            r14 = notificationsController2.isSilentMessage(messageObject4);
                                        }
                                        if (notificationsController2.pushDialogs.m() != 1 || !z16) {
                                            str18 = str22;
                                        } else if (chat2 != null) {
                                            str18 = str22;
                                            stringForMessage2 = stringForMessage2.replace(" @ " + string, str18);
                                        } else {
                                            str18 = str22;
                                            stringForMessage2 = zArr2[0] ? stringForMessage2.replace(string + ": ", str18) : stringForMessage2.replace(string + " ", str18);
                                        }
                                        mVar2.d(stringForMessage2);
                                    }
                                    str22 = str18;
                                    min = i42;
                                    i41 = i43 + 1;
                                    j14 = j35;
                                    r14 = r14;
                                }
                                j18 = j14;
                                str5 = str22;
                                mVar2.g(str4);
                                rVar3.n(mVar2);
                                str7 = str24;
                                z17 = r14;
                            }
                            String str25 = str4;
                            if (z10 && z36 && !MediaController.getInstance().isRecordingAudio() && !z17) {
                                z18 = false;
                                if (z18 && j18 == j33 && chat2 != null) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(NotificationsSettingsFacade.PROPERTY_CUSTOM);
                                    j20 = j18;
                                    sb3.append(j20);
                                    sharedPreferences4 = sharedPreferences3;
                                    int i44 = 180;
                                    if (sharedPreferences4.getBoolean(sb3.toString(), false)) {
                                        i34 = sharedPreferences4.getInt("smart_max_count_" + j20, 2);
                                        i44 = sharedPreferences4.getInt("smart_delay_" + j20, 180);
                                    } else {
                                        i34 = 2;
                                    }
                                    if (i34 != 0) {
                                        Point point = (Point) notificationsController2.smartNotificationsDialogs.f(j20);
                                        if (point == null) {
                                            notificationsController2.smartNotificationsDialogs.k(new Point(1, (int) (SystemClock.elapsedRealtime() / j3)), j20);
                                        } else {
                                            int i45 = point.y + i44;
                                            str8 = str25;
                                            str9 = str5;
                                            if (i45 < SystemClock.elapsedRealtime() / j3) {
                                                point.set(1, (int) (SystemClock.elapsedRealtime() / j3));
                                            } else {
                                                int i46 = point.x;
                                                if (i46 >= i34) {
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
                                                    boolean z37 = ApplicationLoader.mainInterfacePaused;
                                                    boolean z38 = !z37;
                                                    getSharedPrefKey(j20, j21);
                                                    j22 = j20;
                                                    j23 = j21;
                                                    if (notificationsController2.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j22, j23, false)) {
                                                        i11 = notificationsController2.dialogsNotificationsFacade.getProperty("vibrate_", j22, j23, 0);
                                                        i12 = notificationsController2.dialogsNotificationsFacade.getProperty("priority_", j22, j23, 3);
                                                        long property = notificationsController2.dialogsNotificationsFacade.getProperty("sound_document_id_", j22, j23, 0L);
                                                        if (property != j10) {
                                                            str10 = notificationsController2.getMediaDataController().ringtoneDataStore.e(property);
                                                            z20 = true;
                                                        } else {
                                                            str10 = notificationsController2.dialogsNotificationsFacade.getPropertyString("sound_path_", j22, j23, null);
                                                            z20 = false;
                                                        }
                                                        int property2 = notificationsController2.dialogsNotificationsFacade.getProperty("color_", j22, j23, 0);
                                                        j24 = j22;
                                                        if (property2 != 0) {
                                                            num = Integer.valueOf(property2);
                                                            z21 = z19;
                                                            if (!messageObject.isReactionPush || messageObject.isStoryReactionPush) {
                                                                str11 = str7;
                                                                z22 = z37;
                                                                rVar = rVar3;
                                                                j25 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                                                if (j25 == 0) {
                                                                    string2 = notificationsController2.getMediaDataController().ringtoneDataStore.e(j25);
                                                                    z23 = true;
                                                                } else {
                                                                    string2 = sharedPreferences4.getString("ReactionSoundPath", path);
                                                                    z23 = false;
                                                                }
                                                                i13 = sharedPreferences4.getInt("vibrate_react", 0);
                                                                str12 = string2;
                                                                int i47 = sharedPreferences4.getInt("priority_react", 1);
                                                                z24 = z23;
                                                                i14 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                                                i15 = !messageObject.isStoryReactionPush ? 5 : 4;
                                                                i16 = i47;
                                                            } else {
                                                                if (i10 == 0) {
                                                                    str11 = str7;
                                                                    z22 = z37;
                                                                    rVar = rVar3;
                                                                    long j36 = j10;
                                                                    if (j17 != j36) {
                                                                        long j37 = sharedPreferences4.getLong(z11 ? "StoriesSoundDocId" : "GlobalSoundDocId", j36);
                                                                        if (j37 != j36) {
                                                                            string3 = notificationsController2.getMediaDataController().ringtoneDataStore.e(j37);
                                                                            z29 = true;
                                                                        } else {
                                                                            string3 = sharedPreferences4.getString(z11 ? "StoriesSoundPath" : "GlobalSoundPath", path);
                                                                            z29 = false;
                                                                        }
                                                                        int i48 = sharedPreferences4.getInt("vibrate_messages", 0);
                                                                        String str26 = string3;
                                                                        int i49 = sharedPreferences4.getInt("priority_messages", 1);
                                                                        boolean z39 = z29;
                                                                        i14 = sharedPreferences4.getInt("MessagesLed", -16776961);
                                                                        i15 = z11 ? 3 : 1;
                                                                        i16 = i49;
                                                                        z25 = z20;
                                                                        i17 = 4;
                                                                        i18 = i48;
                                                                        str13 = str26;
                                                                        z24 = z39;
                                                                    } else {
                                                                        z25 = z20;
                                                                        i16 = 0;
                                                                        i14 = -16776961;
                                                                        str13 = null;
                                                                        i18 = 0;
                                                                        i17 = 4;
                                                                        i15 = 1;
                                                                        z24 = false;
                                                                    }
                                                                    if (i18 == i17) {
                                                                        z26 = true;
                                                                        i19 = 0;
                                                                    } else {
                                                                        i19 = i18;
                                                                        z26 = false;
                                                                    }
                                                                    if (!TextUtils.isEmpty(str10) || TextUtils.equals(str13, str10)) {
                                                                        str10 = str13;
                                                                        z25 = z24;
                                                                        z27 = true;
                                                                    } else {
                                                                        z27 = false;
                                                                    }
                                                                    if (i12 != 3 && i16 != i12) {
                                                                        i16 = i12;
                                                                        z27 = false;
                                                                    }
                                                                    if (num != null && num.intValue() != i14) {
                                                                        i14 = num.intValue();
                                                                        z27 = false;
                                                                    }
                                                                    if (i11 != 0 || i11 == 4 || i11 == i19) {
                                                                        i11 = i19;
                                                                    } else {
                                                                        z27 = false;
                                                                    }
                                                                    if (z22) {
                                                                        i20 = i16;
                                                                        i21 = i11;
                                                                    } else {
                                                                        if (!sharedPreferences4.getBoolean("EnableInAppSounds", true)) {
                                                                            str10 = null;
                                                                        }
                                                                        i21 = !sharedPreferences4.getBoolean("EnableInAppVibrate", true) ? 2 : i11;
                                                                        i20 = sharedPreferences4.getBoolean("EnableInAppPopup", true) ? 2 : 0;
                                                                    }
                                                                    if (z26 && i21 != 2) {
                                                                        try {
                                                                            ringerMode = audioManager.getRingerMode();
                                                                            if (ringerMode != 0 && ringerMode != 1) {
                                                                                i21 = 2;
                                                                            }
                                                                        } catch (Exception e10) {
                                                                            FileLog.e(e10);
                                                                        }
                                                                    }
                                                                    if (z21) {
                                                                        str14 = str8;
                                                                        i21 = 0;
                                                                        i20 = 0;
                                                                        i22 = 0;
                                                                        str10 = null;
                                                                    } else {
                                                                        String str27 = str8;
                                                                        i22 = i14;
                                                                        str14 = str27;
                                                                    }
                                                                    Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                                    intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                                    intent.setFlags(67108864);
                                                                    if (messageObject.isOauthPush) {
                                                                        intent.putExtra("oauth_url", messageObject.localName);
                                                                    }
                                                                    if (messageObject.isStoryReactionPush) {
                                                                        intent.putExtra("storyId", Math.abs(messageObject.getId()));
                                                                        i23 = i21;
                                                                        str15 = str14;
                                                                        obj = path;
                                                                    } else {
                                                                        if (!messageObject.isLiveStoryPush) {
                                                                            str15 = str14;
                                                                            long j38 = j17;
                                                                            i23 = i21;
                                                                            i24 = i22;
                                                                            long j39 = j16;
                                                                            if (!messageObject.isStoryPush) {
                                                                                if (DialogObject.isEncryptedDialog(j24)) {
                                                                                    obj = path;
                                                                                    user2 = user;
                                                                                    chat3 = chat2;
                                                                                    if (notificationsController2.pushDialogs.m() == 1 && j24 != globalSecretChatId) {
                                                                                        intent.putExtra("encId", DialogObject.getEncryptedChatId(j24));
                                                                                    }
                                                                                } else {
                                                                                    obj = path;
                                                                                    if (notificationsController2.pushDialogs.m() == 1) {
                                                                                        if (i10 != 0) {
                                                                                            intent.putExtra("chatId", j39);
                                                                                        } else if (j38 != 0) {
                                                                                            intent.putExtra("userId", j38);
                                                                                        }
                                                                                    }
                                                                                    if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter && notificationsController2.pushDialogs.m() == 1 && Build.VERSION.SDK_INT < 28) {
                                                                                        if (chat2 != null) {
                                                                                            chat3 = chat2;
                                                                                            TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                                                            if (chatPhoto != null && (fileLocation = chatPhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
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
                                                                                        String str28 = str3;
                                                                                        intent.putExtra(str28, notificationsController2.currentAccount);
                                                                                        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                                                                        rVar2 = rVar;
                                                                                        rVar2.g(string);
                                                                                        rVar2.E.icon = R.drawable.notification;
                                                                                        rVar2.h(16, true);
                                                                                        rVar2.i = notificationsController2.total_unread_count;
                                                                                        rVar2.g = activity;
                                                                                        rVar2.q = notificationsController2.notificationGroup;
                                                                                        rVar2.r = true;
                                                                                        rVar2.k = true;
                                                                                        String str29 = str10;
                                                                                        rVar2.E.when = messageObject.messageOwner.date * j3;
                                                                                        rVar2.w = -15618822;
                                                                                        rVar2.u = "msg";
                                                                                        if (chat3 == null && user2 != null && (str16 = user2.phone) != null && str16.length() > 0) {
                                                                                            str17 = "tel:+" + user2.phone;
                                                                                            if (str17 != null && !str17.isEmpty()) {
                                                                                                rVar2.F.add(str17);
                                                                                            }
                                                                                        }
                                                                                        Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                                        intent2.putExtra("messageDate", messageObject.messageOwner.date);
                                                                                        intent2.putExtra(str28, notificationsController2.currentAccount);
                                                                                        if (messageObject.isStoryPush) {
                                                                                            intent2.putExtra("story", true);
                                                                                        }
                                                                                        if (messageObject.isStoryReactionPush) {
                                                                                            i33 = 1;
                                                                                        } else {
                                                                                            i33 = 1;
                                                                                            intent2.putExtra("storyReaction", true);
                                                                                        }
                                                                                        rVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i33, intent2, 167772160);
                                                                                        if (bitmap2 == null) {
                                                                                            rVar2.j(bitmap2);
                                                                                        } else if (fileLocation != null) {
                                                                                            jArr = null;
                                                                                            BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                                                                            if (imageFromMemory != null) {
                                                                                                rVar2.j(imageFromMemory.getBitmap());
                                                                                            } else {
                                                                                                try {
                                                                                                    File pathToAttach = notificationsController2.getFileLoader().getPathToAttach(fileLocation, true);
                                                                                                    if (pathToAttach.exists()) {
                                                                                                        float dp = 160.0f / AndroidUtilities.dp(50.0f);
                                                                                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                                        options.inSampleSize = dp < 1.0f ? 1 : (int) dp;
                                                                                                        Bitmap decodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                                                                                                        if (decodeFile != null) {
                                                                                                            rVar2.j(decodeFile);
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable unused) {
                                                                                                }
                                                                                            }
                                                                                            if (z10 || z17) {
                                                                                                rVar2.j = -1;
                                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                                    i26 = 2;
                                                                                                }
                                                                                                i26 = 0;
                                                                                            } else if (i20 == 0) {
                                                                                                rVar2.j = 0;
                                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                                    i26 = 3;
                                                                                                }
                                                                                                i26 = 0;
                                                                                            } else {
                                                                                                if (i20 == 1) {
                                                                                                    i32 = 1;
                                                                                                } else if (i20 == 2) {
                                                                                                    i32 = 1;
                                                                                                } else {
                                                                                                    if (i20 == 4) {
                                                                                                        rVar2.j = -2;
                                                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                                                            i26 = 1;
                                                                                                        }
                                                                                                    } else if (i20 == 5) {
                                                                                                        rVar2.j = -1;
                                                                                                    }
                                                                                                    i26 = 0;
                                                                                                }
                                                                                                rVar2.j = i32;
                                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                                    i26 = 4;
                                                                                                }
                                                                                                i26 = 0;
                                                                                            }
                                                                                            if (!z17 || z21) {
                                                                                                i27 = i24;
                                                                                                long[] jArr5 = {0, 0};
                                                                                                rVar2.E.vibrate = jArr5;
                                                                                                jArr2 = jArr5;
                                                                                                uri = jArr;
                                                                                            } else {
                                                                                                if (z22 || (sharedPreferences4.getBoolean("EnableInAppPreview", true) && str11 != null)) {
                                                                                                    rVar2.p(str11.length() > 100 ? str11.substring(0, 100).replace('\n', ' ').trim() + "..." : str11);
                                                                                                }
                                                                                                if (str29 != null && !str29.equalsIgnoreCase("NoSound")) {
                                                                                                    int i50 = Build.VERSION.SDK_INT;
                                                                                                    if (i50 >= 26) {
                                                                                                        if (!str29.equalsIgnoreCase("Default") && !str29.equals(obj)) {
                                                                                                            if (z25) {
                                                                                                                uri2 = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", new File(str29));
                                                                                                                ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uri2, 1);
                                                                                                            } else {
                                                                                                                uri2 = Uri.parse(str29);
                                                                                                            }
                                                                                                            if (i24 != 0) {
                                                                                                                Notification notification = rVar2.E;
                                                                                                                i27 = i24;
                                                                                                                notification.ledARGB = i27;
                                                                                                                notification.ledOnMS = MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                                                                notification.ledOffMS = MediaDataController.MAX_STYLE_RUNS_COUNT;
                                                                                                                notification.flags = ((-2) & notification.flags) | 1;
                                                                                                            } else {
                                                                                                                i27 = i24;
                                                                                                            }
                                                                                                            i31 = i23;
                                                                                                            if (i31 == 2) {
                                                                                                                jArr2 = new long[]{0, 0};
                                                                                                                rVar2.E.vibrate = jArr2;
                                                                                                                uri = uri2;
                                                                                                            } else {
                                                                                                                if (i31 == 1) {
                                                                                                                    jArr2 = new long[]{0, 100, 0, 100};
                                                                                                                    rVar2.E.vibrate = jArr2;
                                                                                                                } else {
                                                                                                                    if (i31 != 0 && i31 != 4) {
                                                                                                                        if (i31 == 3) {
                                                                                                                            jArr2 = new long[]{0, 1000};
                                                                                                                            rVar2.E.vibrate = jArr2;
                                                                                                                        } else {
                                                                                                                            uri = uri2;
                                                                                                                            jArr2 = jArr;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    rVar2.E.defaults = 2;
                                                                                                                    jArr2 = new long[0];
                                                                                                                }
                                                                                                                uri = uri2;
                                                                                                            }
                                                                                                        }
                                                                                                        uri2 = Settings.System.DEFAULT_NOTIFICATION_URI;
                                                                                                        if (i24 != 0) {
                                                                                                        }
                                                                                                        i31 = i23;
                                                                                                        if (i31 == 2) {
                                                                                                        }
                                                                                                    } else if (str29.equals(obj)) {
                                                                                                        rVar2.m(Settings.System.DEFAULT_NOTIFICATION_URI);
                                                                                                    } else {
                                                                                                        if (i50 >= 24) {
                                                                                                            String str30 = str2;
                                                                                                            if (str29.startsWith(str30) && !AndroidUtilities.isInternalUri(Uri.parse(str29))) {
                                                                                                                try {
                                                                                                                    Uri d = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", new File(str29.replace(str30, str9)));
                                                                                                                    ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", d, 1);
                                                                                                                    rVar2.m(d);
                                                                                                                } catch (Exception unused2) {
                                                                                                                    rVar2.m(Uri.parse(str29));
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        rVar2.m(Uri.parse(str29));
                                                                                                    }
                                                                                                }
                                                                                                uri2 = jArr;
                                                                                                if (i24 != 0) {
                                                                                                }
                                                                                                i31 = i23;
                                                                                                if (i31 == 2) {
                                                                                                }
                                                                                            }
                                                                                            if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter && messageObject.getDialogId() == 777000) {
                                                                                                replyMarkup = messageObject.messageOwner.reply_markup;
                                                                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                                                    int size = arrayList3.size();
                                                                                                    boolean z40 = false;
                                                                                                    for (int i51 = 0; i51 < size; i51++) {
                                                                                                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i51);
                                                                                                        int size2 = keyboardInlineButtonRow.buttons.size();
                                                                                                        int i52 = 0;
                                                                                                        while (i52 < size2) {
                                                                                                            TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i52);
                                                                                                            int i53 = size;
                                                                                                            TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) zf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                                                            if (tL_inlineButtonTypeCallback != null) {
                                                                                                                i29 = i52;
                                                                                                                i30 = i27;
                                                                                                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                                                                intent3.putExtra(str28, notificationsController2.currentAccount);
                                                                                                                jArr4 = jArr2;
                                                                                                                long j40 = j24;
                                                                                                                intent3.putExtra("did", j40);
                                                                                                                byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                                                                if (bArr != null) {
                                                                                                                    intent3.putExtra("data", bArr);
                                                                                                                }
                                                                                                                intent3.putExtra("mid", messageObject.getId());
                                                                                                                String str31 = keyboardInlineButton.text;
                                                                                                                Context context = ApplicationLoader.applicationContext;
                                                                                                                int i54 = notificationsController2.lastButtonId;
                                                                                                                j24 = j40;
                                                                                                                notificationsController2.lastButtonId = i54 + 1;
                                                                                                                rVar2.a(0, str31, PendingIntent.getBroadcast(context, i54, intent3, 167772160));
                                                                                                                z40 = true;
                                                                                                            } else {
                                                                                                                i29 = i52;
                                                                                                                i30 = i27;
                                                                                                                jArr4 = jArr2;
                                                                                                            }
                                                                                                            i52 = i29 + 1;
                                                                                                            size = i53;
                                                                                                            jArr2 = jArr4;
                                                                                                            i27 = i30;
                                                                                                        }
                                                                                                    }
                                                                                                    i28 = i27;
                                                                                                    jArr3 = jArr2;
                                                                                                    z28 = z40;
                                                                                                    if (!z28 && Build.VERSION.SDK_INT < 24 && SharedConfig.passcodeHash.length() == 0 && notificationsController2.hasMessagesToReply()) {
                                                                                                        Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                                        intent4.putExtra(str28, notificationsController2.currentAccount);
                                                                                                        rVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent4, 167772160));
                                                                                                    }
                                                                                                    notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z38, z21, i15);
                                                                                                    scheduleNotificationRepeat();
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            i28 = i27;
                                                                                            jArr3 = jArr2;
                                                                                            z28 = false;
                                                                                            if (!z28) {
                                                                                                Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                                intent42.putExtra(str28, notificationsController2.currentAccount);
                                                                                                rVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent42, 167772160));
                                                                                            }
                                                                                            notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z38, z21, i15);
                                                                                            scheduleNotificationRepeat();
                                                                                            return;
                                                                                        }
                                                                                        jArr = null;
                                                                                        if (z10) {
                                                                                        }
                                                                                        rVar2.j = -1;
                                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                                        }
                                                                                        i26 = 0;
                                                                                        if (!z17) {
                                                                                        }
                                                                                        i27 = i24;
                                                                                        long[] jArr52 = {0, 0};
                                                                                        rVar2.E.vibrate = jArr52;
                                                                                        jArr2 = jArr52;
                                                                                        uri = jArr;
                                                                                        if (!AndroidUtilities.needShowPasscode()) {
                                                                                            replyMarkup = messageObject.messageOwner.reply_markup;
                                                                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                            }
                                                                                        }
                                                                                        i28 = i27;
                                                                                        jArr3 = jArr2;
                                                                                        z28 = false;
                                                                                        if (!z28) {
                                                                                        }
                                                                                        notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z38, z21, i15);
                                                                                        scheduleNotificationRepeat();
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                fileLocation = null;
                                                                                String str282 = str3;
                                                                                intent.putExtra(str282, notificationsController2.currentAccount);
                                                                                PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                                                                rVar2 = rVar;
                                                                                rVar2.g(string);
                                                                                rVar2.E.icon = R.drawable.notification;
                                                                                rVar2.h(16, true);
                                                                                rVar2.i = notificationsController2.total_unread_count;
                                                                                rVar2.g = activity2;
                                                                                rVar2.q = notificationsController2.notificationGroup;
                                                                                rVar2.r = true;
                                                                                rVar2.k = true;
                                                                                String str292 = str10;
                                                                                rVar2.E.when = messageObject.messageOwner.date * j3;
                                                                                rVar2.w = -15618822;
                                                                                rVar2.u = "msg";
                                                                                if (chat3 == null) {
                                                                                    str17 = "tel:+" + user2.phone;
                                                                                    if (str17 != null) {
                                                                                        rVar2.F.add(str17);
                                                                                    }
                                                                                }
                                                                                Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                                intent22.putExtra("messageDate", messageObject.messageOwner.date);
                                                                                intent22.putExtra(str282, notificationsController2.currentAccount);
                                                                                if (messageObject.isStoryPush) {
                                                                                }
                                                                                if (messageObject.isStoryReactionPush) {
                                                                                }
                                                                                rVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i33, intent22, 167772160);
                                                                                if (bitmap2 == null) {
                                                                                }
                                                                                jArr = null;
                                                                                if (z10) {
                                                                                }
                                                                                rVar2.j = -1;
                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                }
                                                                                i26 = 0;
                                                                                if (!z17) {
                                                                                }
                                                                                i27 = i24;
                                                                                long[] jArr522 = {0, 0};
                                                                                rVar2.E.vibrate = jArr522;
                                                                                jArr2 = jArr522;
                                                                                uri = jArr;
                                                                                if (!AndroidUtilities.needShowPasscode()) {
                                                                                }
                                                                                i28 = i27;
                                                                                jArr3 = jArr2;
                                                                                z28 = false;
                                                                                if (!z28) {
                                                                                }
                                                                                notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z38, z21, i15);
                                                                                scheduleNotificationRepeat();
                                                                                return;
                                                                            }
                                                                            long[] jArr6 = new long[notificationsController2.storyPushMessages.size()];
                                                                            for (int i55 = 0; i55 < notificationsController2.storyPushMessages.size(); i55++) {
                                                                                jArr6[i55] = notificationsController2.storyPushMessages.get(i55).dialogId;
                                                                            }
                                                                            intent.putExtra("storyDialogIds", jArr6);
                                                                            obj = path;
                                                                            user2 = user;
                                                                            chat3 = chat2;
                                                                            fileLocation = null;
                                                                            String str2822 = str3;
                                                                            intent.putExtra(str2822, notificationsController2.currentAccount);
                                                                            PendingIntent activity22 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                                                            rVar2 = rVar;
                                                                            rVar2.g(string);
                                                                            rVar2.E.icon = R.drawable.notification;
                                                                            rVar2.h(16, true);
                                                                            rVar2.i = notificationsController2.total_unread_count;
                                                                            rVar2.g = activity22;
                                                                            rVar2.q = notificationsController2.notificationGroup;
                                                                            rVar2.r = true;
                                                                            rVar2.k = true;
                                                                            String str2922 = str10;
                                                                            rVar2.E.when = messageObject.messageOwner.date * j3;
                                                                            rVar2.w = -15618822;
                                                                            rVar2.u = "msg";
                                                                            if (chat3 == null) {
                                                                            }
                                                                            Intent intent222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                            intent222.putExtra("messageDate", messageObject.messageOwner.date);
                                                                            intent222.putExtra(str2822, notificationsController2.currentAccount);
                                                                            if (messageObject.isStoryPush) {
                                                                            }
                                                                            if (messageObject.isStoryReactionPush) {
                                                                            }
                                                                            rVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i33, intent222, 167772160);
                                                                            if (bitmap2 == null) {
                                                                            }
                                                                            jArr = null;
                                                                            if (z10) {
                                                                            }
                                                                            rVar2.j = -1;
                                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                            }
                                                                            i26 = 0;
                                                                            if (!z17) {
                                                                            }
                                                                            i27 = i24;
                                                                            long[] jArr5222 = {0, 0};
                                                                            rVar2.E.vibrate = jArr5222;
                                                                            jArr2 = jArr5222;
                                                                            uri = jArr;
                                                                            if (!AndroidUtilities.needShowPasscode()) {
                                                                            }
                                                                            i28 = i27;
                                                                            jArr3 = jArr2;
                                                                            z28 = false;
                                                                            if (!z28) {
                                                                            }
                                                                            notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z38, z21, i15);
                                                                            scheduleNotificationRepeat();
                                                                            return;
                                                                        }
                                                                        if (i10 != 0) {
                                                                            i25 = i21;
                                                                            str15 = str14;
                                                                            intent.putExtra("chatId", j16);
                                                                        } else {
                                                                            i25 = i21;
                                                                            str15 = str14;
                                                                            if (j17 != 0) {
                                                                                intent.putExtra("userId", j17);
                                                                            }
                                                                        }
                                                                        intent.putExtra("storyId", Math.abs(messageObject.getId()));
                                                                        obj = path;
                                                                        i23 = i25;
                                                                    }
                                                                    i24 = i22;
                                                                    user2 = user;
                                                                    chat3 = chat2;
                                                                    fileLocation = null;
                                                                    String str28222 = str3;
                                                                    intent.putExtra(str28222, notificationsController2.currentAccount);
                                                                    PendingIntent activity222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                                                    rVar2 = rVar;
                                                                    rVar2.g(string);
                                                                    rVar2.E.icon = R.drawable.notification;
                                                                    rVar2.h(16, true);
                                                                    rVar2.i = notificationsController2.total_unread_count;
                                                                    rVar2.g = activity222;
                                                                    rVar2.q = notificationsController2.notificationGroup;
                                                                    rVar2.r = true;
                                                                    rVar2.k = true;
                                                                    String str29222 = str10;
                                                                    rVar2.E.when = messageObject.messageOwner.date * j3;
                                                                    rVar2.w = -15618822;
                                                                    rVar2.u = "msg";
                                                                    if (chat3 == null) {
                                                                    }
                                                                    Intent intent2222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                    intent2222.putExtra("messageDate", messageObject.messageOwner.date);
                                                                    intent2222.putExtra(str28222, notificationsController2.currentAccount);
                                                                    if (messageObject.isStoryPush) {
                                                                    }
                                                                    if (messageObject.isStoryReactionPush) {
                                                                    }
                                                                    rVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i33, intent2222, 167772160);
                                                                    if (bitmap2 == null) {
                                                                    }
                                                                    jArr = null;
                                                                    if (z10) {
                                                                    }
                                                                    rVar2.j = -1;
                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                    }
                                                                    i26 = 0;
                                                                    if (!z17) {
                                                                    }
                                                                    i27 = i24;
                                                                    long[] jArr52222 = {0, 0};
                                                                    rVar2.E.vibrate = jArr52222;
                                                                    jArr2 = jArr52222;
                                                                    uri = jArr;
                                                                    if (!AndroidUtilities.needShowPasscode()) {
                                                                    }
                                                                    i28 = i27;
                                                                    jArr3 = jArr2;
                                                                    z28 = false;
                                                                    if (!z28) {
                                                                    }
                                                                    notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z38, z21, i15);
                                                                    scheduleNotificationRepeat();
                                                                    return;
                                                                }
                                                                if (z12) {
                                                                    str11 = str7;
                                                                    z22 = z37;
                                                                    rVar = rVar3;
                                                                    long j41 = j10;
                                                                    long j42 = sharedPreferences4.getLong("ChannelSoundDocId", j41);
                                                                    if (j42 != j41) {
                                                                        string5 = notificationsController2.getMediaDataController().ringtoneDataStore.e(j42);
                                                                        z31 = true;
                                                                    } else {
                                                                        string5 = sharedPreferences4.getString("ChannelSoundPath", path);
                                                                        z31 = false;
                                                                    }
                                                                    i13 = sharedPreferences4.getInt("vibrate_channel", 0);
                                                                    str12 = string5;
                                                                    int i56 = sharedPreferences4.getInt("priority_channel", 1);
                                                                    z24 = z31;
                                                                    i14 = sharedPreferences4.getInt("ChannelLed", -16776961);
                                                                    i16 = i56;
                                                                    i15 = 2;
                                                                } else {
                                                                    str11 = str7;
                                                                    z22 = z37;
                                                                    rVar = rVar3;
                                                                    long j43 = sharedPreferences4.getLong("GroupSoundDocId", 0L);
                                                                    if (j43 != 0) {
                                                                        string4 = notificationsController2.getMediaDataController().ringtoneDataStore.e(j43);
                                                                        z30 = true;
                                                                    } else {
                                                                        string4 = sharedPreferences4.getString("GroupSoundPath", path);
                                                                        z30 = false;
                                                                    }
                                                                    i13 = sharedPreferences4.getInt("vibrate_group", 0);
                                                                    str12 = string4;
                                                                    int i57 = sharedPreferences4.getInt("priority_group", 1);
                                                                    z24 = z30;
                                                                    i14 = sharedPreferences4.getInt("GroupLed", -16776961);
                                                                    i16 = i57;
                                                                    i15 = 0;
                                                                }
                                                            }
                                                            i18 = i13;
                                                            str13 = str12;
                                                            z25 = z20;
                                                            i17 = 4;
                                                            if (i18 == i17) {
                                                            }
                                                            if (TextUtils.isEmpty(str10)) {
                                                            }
                                                            str10 = str13;
                                                            z25 = z24;
                                                            z27 = true;
                                                            if (i12 != 3) {
                                                                i16 = i12;
                                                                z27 = false;
                                                            }
                                                            if (num != null) {
                                                                i14 = num.intValue();
                                                                z27 = false;
                                                            }
                                                            if (i11 != 0) {
                                                            }
                                                            i11 = i19;
                                                            if (z22) {
                                                            }
                                                            if (z26) {
                                                                ringerMode = audioManager.getRingerMode();
                                                                if (ringerMode != 0) {
                                                                    i21 = 2;
                                                                }
                                                            }
                                                            if (z21) {
                                                            }
                                                            Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                            intent5.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                            intent5.setFlags(67108864);
                                                            if (messageObject.isOauthPush) {
                                                            }
                                                            if (messageObject.isStoryReactionPush) {
                                                            }
                                                            i24 = i22;
                                                            user2 = user;
                                                            chat3 = chat2;
                                                            fileLocation = null;
                                                            String str282222 = str3;
                                                            intent5.putExtra(str282222, notificationsController2.currentAccount);
                                                            PendingIntent activity2222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent5, 1140850688);
                                                            rVar2 = rVar;
                                                            rVar2.g(string);
                                                            rVar2.E.icon = R.drawable.notification;
                                                            rVar2.h(16, true);
                                                            rVar2.i = notificationsController2.total_unread_count;
                                                            rVar2.g = activity2222;
                                                            rVar2.q = notificationsController2.notificationGroup;
                                                            rVar2.r = true;
                                                            rVar2.k = true;
                                                            String str292222 = str10;
                                                            rVar2.E.when = messageObject.messageOwner.date * j3;
                                                            rVar2.w = -15618822;
                                                            rVar2.u = "msg";
                                                            if (chat3 == null) {
                                                            }
                                                            Intent intent22222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                            intent22222.putExtra("messageDate", messageObject.messageOwner.date);
                                                            intent22222.putExtra(str282222, notificationsController2.currentAccount);
                                                            if (messageObject.isStoryPush) {
                                                            }
                                                            if (messageObject.isStoryReactionPush) {
                                                            }
                                                            rVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i33, intent22222, 167772160);
                                                            if (bitmap2 == null) {
                                                            }
                                                            jArr = null;
                                                            if (z10) {
                                                            }
                                                            rVar2.j = -1;
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                            }
                                                            i26 = 0;
                                                            if (!z17) {
                                                            }
                                                            i27 = i24;
                                                            long[] jArr522222 = {0, 0};
                                                            rVar2.E.vibrate = jArr522222;
                                                            jArr2 = jArr522222;
                                                            uri = jArr;
                                                            if (!AndroidUtilities.needShowPasscode()) {
                                                            }
                                                            i28 = i27;
                                                            jArr3 = jArr2;
                                                            z28 = false;
                                                            if (!z28) {
                                                            }
                                                            notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z38, z21, i15);
                                                            scheduleNotificationRepeat();
                                                            return;
                                                        }
                                                    } else {
                                                        j24 = j22;
                                                        i11 = 0;
                                                        i12 = 3;
                                                        z20 = false;
                                                        str10 = null;
                                                    }
                                                    num = null;
                                                    z21 = z19;
                                                    if (messageObject.isReactionPush) {
                                                    }
                                                    str11 = str7;
                                                    z22 = z37;
                                                    rVar = rVar3;
                                                    j25 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                                    if (j25 == 0) {
                                                    }
                                                    i13 = sharedPreferences4.getInt("vibrate_react", 0);
                                                    str12 = string2;
                                                    int i472 = sharedPreferences4.getInt("priority_react", 1);
                                                    z24 = z23;
                                                    i14 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                                    i15 = !messageObject.isStoryReactionPush ? 5 : 4;
                                                    i16 = i472;
                                                    i18 = i13;
                                                    str13 = str12;
                                                    z25 = z20;
                                                    i17 = 4;
                                                    if (i18 == i17) {
                                                    }
                                                    if (TextUtils.isEmpty(str10)) {
                                                    }
                                                    str10 = str13;
                                                    z25 = z24;
                                                    z27 = true;
                                                    if (i12 != 3) {
                                                    }
                                                    if (num != null) {
                                                    }
                                                    if (i11 != 0) {
                                                    }
                                                    i11 = i19;
                                                    if (z22) {
                                                    }
                                                    if (z26) {
                                                    }
                                                    if (z21) {
                                                    }
                                                    Intent intent52 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                    intent52.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                    intent52.setFlags(67108864);
                                                    if (messageObject.isOauthPush) {
                                                    }
                                                    if (messageObject.isStoryReactionPush) {
                                                    }
                                                    i24 = i22;
                                                    user2 = user;
                                                    chat3 = chat2;
                                                    fileLocation = null;
                                                    String str2822222 = str3;
                                                    intent52.putExtra(str2822222, notificationsController2.currentAccount);
                                                    PendingIntent activity22222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent52, 1140850688);
                                                    rVar2 = rVar;
                                                    rVar2.g(string);
                                                    rVar2.E.icon = R.drawable.notification;
                                                    rVar2.h(16, true);
                                                    rVar2.i = notificationsController2.total_unread_count;
                                                    rVar2.g = activity22222;
                                                    rVar2.q = notificationsController2.notificationGroup;
                                                    rVar2.r = true;
                                                    rVar2.k = true;
                                                    String str2922222 = str10;
                                                    rVar2.E.when = messageObject.messageOwner.date * j3;
                                                    rVar2.w = -15618822;
                                                    rVar2.u = "msg";
                                                    if (chat3 == null) {
                                                    }
                                                    Intent intent222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                    intent222222.putExtra("messageDate", messageObject.messageOwner.date);
                                                    intent222222.putExtra(str2822222, notificationsController2.currentAccount);
                                                    if (messageObject.isStoryPush) {
                                                    }
                                                    if (messageObject.isStoryReactionPush) {
                                                    }
                                                    rVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i33, intent222222, 167772160);
                                                    if (bitmap2 == null) {
                                                    }
                                                    jArr = null;
                                                    if (z10) {
                                                    }
                                                    rVar2.j = -1;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                    }
                                                    i26 = 0;
                                                    if (!z17) {
                                                    }
                                                    i27 = i24;
                                                    long[] jArr5222222 = {0, 0};
                                                    rVar2.E.vibrate = jArr5222222;
                                                    jArr2 = jArr5222222;
                                                    uri = jArr;
                                                    if (!AndroidUtilities.needShowPasscode()) {
                                                    }
                                                    i28 = i27;
                                                    jArr3 = jArr2;
                                                    z28 = false;
                                                    if (!z28) {
                                                    }
                                                    notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z38, z21, i15);
                                                    scheduleNotificationRepeat();
                                                    return;
                                                }
                                                point.set(i46 + 1, (int) (SystemClock.elapsedRealtime() / j3));
                                            }
                                        }
                                    }
                                    str8 = str25;
                                    str9 = str5;
                                } else {
                                    str8 = str25;
                                    str9 = str5;
                                    sharedPreferences4 = sharedPreferences3;
                                    j20 = j18;
                                }
                                z19 = z18;
                                if (z19) {
                                }
                                String path2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                boolean z372 = ApplicationLoader.mainInterfacePaused;
                                boolean z382 = !z372;
                                getSharedPrefKey(j20, j21);
                                j22 = j20;
                                j23 = j21;
                                if (notificationsController2.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j22, j23, false)) {
                                }
                                num = null;
                                z21 = z19;
                                if (messageObject.isReactionPush) {
                                }
                                str11 = str7;
                                z22 = z372;
                                rVar = rVar3;
                                j25 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                                if (j25 == 0) {
                                }
                                i13 = sharedPreferences4.getInt("vibrate_react", 0);
                                str12 = string2;
                                int i4722 = sharedPreferences4.getInt("priority_react", 1);
                                z24 = z23;
                                i14 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                                i15 = !messageObject.isStoryReactionPush ? 5 : 4;
                                i16 = i4722;
                                i18 = i13;
                                str13 = str12;
                                z25 = z20;
                                i17 = 4;
                                if (i18 == i17) {
                                }
                                if (TextUtils.isEmpty(str10)) {
                                }
                                str10 = str13;
                                z25 = z24;
                                z27 = true;
                                if (i12 != 3) {
                                }
                                if (num != null) {
                                }
                                if (i11 != 0) {
                                }
                                i11 = i19;
                                if (z22) {
                                }
                                if (z26) {
                                }
                                if (z21) {
                                }
                                Intent intent522 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                intent522.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent522.setFlags(67108864);
                                if (messageObject.isOauthPush) {
                                }
                                if (messageObject.isStoryReactionPush) {
                                }
                                i24 = i22;
                                user2 = user;
                                chat3 = chat2;
                                fileLocation = null;
                                String str28222222 = str3;
                                intent522.putExtra(str28222222, notificationsController2.currentAccount);
                                PendingIntent activity222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent522, 1140850688);
                                rVar2 = rVar;
                                rVar2.g(string);
                                rVar2.E.icon = R.drawable.notification;
                                rVar2.h(16, true);
                                rVar2.i = notificationsController2.total_unread_count;
                                rVar2.g = activity222222;
                                rVar2.q = notificationsController2.notificationGroup;
                                rVar2.r = true;
                                rVar2.k = true;
                                String str29222222 = str10;
                                rVar2.E.when = messageObject.messageOwner.date * j3;
                                rVar2.w = -15618822;
                                rVar2.u = "msg";
                                if (chat3 == null) {
                                }
                                Intent intent2222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent2222222.putExtra("messageDate", messageObject.messageOwner.date);
                                intent2222222.putExtra(str28222222, notificationsController2.currentAccount);
                                if (messageObject.isStoryPush) {
                                }
                                if (messageObject.isStoryReactionPush) {
                                }
                                rVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i33, intent2222222, 167772160);
                                if (bitmap2 == null) {
                                }
                                jArr = null;
                                if (z10) {
                                }
                                rVar2.j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                i26 = 0;
                                if (!z17) {
                                }
                                i27 = i24;
                                long[] jArr52222222 = {0, 0};
                                rVar2.E.vibrate = jArr52222222;
                                jArr2 = jArr52222222;
                                uri = jArr;
                                if (!AndroidUtilities.needShowPasscode()) {
                                }
                                i28 = i27;
                                jArr3 = jArr2;
                                z28 = false;
                                if (!z28) {
                                }
                                notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z382, z21, i15);
                                scheduleNotificationRepeat();
                                return;
                            }
                            z18 = true;
                            if (z18) {
                            }
                            str8 = str25;
                            str9 = str5;
                            sharedPreferences4 = sharedPreferences3;
                            j20 = j18;
                            z19 = z18;
                            if (z19) {
                            }
                            String path22 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                            boolean z3722 = ApplicationLoader.mainInterfacePaused;
                            boolean z3822 = !z3722;
                            getSharedPrefKey(j20, j21);
                            j22 = j20;
                            j23 = j21;
                            if (notificationsController2.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j22, j23, false)) {
                            }
                            num = null;
                            z21 = z19;
                            if (messageObject.isReactionPush) {
                            }
                            str11 = str7;
                            z22 = z3722;
                            rVar = rVar3;
                            j25 = sharedPreferences4.getLong("ReactionSoundDocId", 0L);
                            if (j25 == 0) {
                            }
                            i13 = sharedPreferences4.getInt("vibrate_react", 0);
                            str12 = string2;
                            int i47222 = sharedPreferences4.getInt("priority_react", 1);
                            z24 = z23;
                            i14 = sharedPreferences4.getInt("ReactionsLed", -16776961);
                            i15 = !messageObject.isStoryReactionPush ? 5 : 4;
                            i16 = i47222;
                            i18 = i13;
                            str13 = str12;
                            z25 = z20;
                            i17 = 4;
                            if (i18 == i17) {
                            }
                            if (TextUtils.isEmpty(str10)) {
                            }
                            str10 = str13;
                            z25 = z24;
                            z27 = true;
                            if (i12 != 3) {
                            }
                            if (num != null) {
                            }
                            if (i11 != 0) {
                            }
                            i11 = i19;
                            if (z22) {
                            }
                            if (z26) {
                            }
                            if (z21) {
                            }
                            Intent intent5222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                            intent5222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                            intent5222.setFlags(67108864);
                            if (messageObject.isOauthPush) {
                            }
                            if (messageObject.isStoryReactionPush) {
                            }
                            i24 = i22;
                            user2 = user;
                            chat3 = chat2;
                            fileLocation = null;
                            String str282222222 = str3;
                            intent5222.putExtra(str282222222, notificationsController2.currentAccount);
                            PendingIntent activity2222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent5222, 1140850688);
                            rVar2 = rVar;
                            rVar2.g(string);
                            rVar2.E.icon = R.drawable.notification;
                            rVar2.h(16, true);
                            rVar2.i = notificationsController2.total_unread_count;
                            rVar2.g = activity2222222;
                            rVar2.q = notificationsController2.notificationGroup;
                            rVar2.r = true;
                            rVar2.k = true;
                            String str292222222 = str10;
                            rVar2.E.when = messageObject.messageOwner.date * j3;
                            rVar2.w = -15618822;
                            rVar2.u = "msg";
                            if (chat3 == null) {
                            }
                            Intent intent22222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent22222222.putExtra("messageDate", messageObject.messageOwner.date);
                            intent22222222.putExtra(str282222222, notificationsController2.currentAccount);
                            if (messageObject.isStoryPush) {
                            }
                            if (messageObject.isStoryReactionPush) {
                            }
                            rVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i33, intent22222222, 167772160);
                            if (bitmap2 == null) {
                            }
                            jArr = null;
                            if (z10) {
                            }
                            rVar2.j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                            }
                            i26 = 0;
                            if (!z17) {
                            }
                            i27 = i24;
                            long[] jArr522222222 = {0, 0};
                            rVar2.E.vibrate = jArr522222222;
                            jArr2 = jArr522222222;
                            uri = jArr;
                            if (!AndroidUtilities.needShowPasscode()) {
                            }
                            i28 = i27;
                            jArr3 = jArr2;
                            z28 = false;
                            if (!z28) {
                            }
                            notificationsController2.showExtraNotifications(rVar2, str15, j24, j23, str23, jArr3, i28, uri, i26, z27, z3822, z21, i15);
                            scheduleNotificationRepeat();
                            return;
                        }
                        z16 = z15;
                        if (!sharedPreferences2.getBoolean("EnableReactionsPreview", true)) {
                            string = LocaleController.getString(R.string.NotificationHiddenName);
                        }
                        if (z14) {
                        }
                        r rVar32 = new r(ApplicationLoader.applicationContext);
                        if (notificationsController2.pushMessages.size() > 1) {
                        }
                        j18 = j14;
                        sharedPreferences3 = sharedPreferences2;
                        j19 = j15;
                        str5 = str22;
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
                    r rVar322 = new r(ApplicationLoader.applicationContext);
                    if (notificationsController2.pushMessages.size() > 1) {
                    }
                    j18 = j14;
                    sharedPreferences3 = sharedPreferences2;
                    j19 = j15;
                    str5 = str22;
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
                r rVar3222 = new r(ApplicationLoader.applicationContext);
                if (notificationsController2.pushMessages.size() > 1) {
                }
                j18 = j14;
                sharedPreferences3 = sharedPreferences2;
                j19 = j15;
                str5 = str22;
                boolean[] zArr322 = new boolean[1];
                stringForMessage = notificationsController2.getStringForMessage(messageObject, false, zArr322, null);
                boolean isSilentMessage222 = notificationsController2.isSilentMessage(messageObject);
                if (stringForMessage == null) {
                }
            }
            z13 = true;
            boolean z362 = isGlobalNotificationsEnabled;
            String str232 = title;
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
            r rVar32222 = new r(ApplicationLoader.applicationContext);
            if (notificationsController2.pushMessages.size() > 1) {
            }
            j18 = j14;
            sharedPreferences3 = sharedPreferences2;
            j19 = j15;
            str5 = str22;
            boolean[] zArr3222 = new boolean[1];
            stringForMessage = notificationsController2.getStringForMessage(messageObject, false, zArr3222, null);
            boolean isSilentMessage2222 = notificationsController2.isSilentMessage(messageObject);
            if (stringForMessage == null) {
            }
        } catch (Exception e11) {
            e = e11;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x054d A[LOOP:1: B:100:0x054a->B:102:0x054d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x059c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String validateChannelId(long j3, long j10, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        String str2;
        String str3;
        String str4;
        int i13;
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
        int i14;
        String str13;
        long[] jArr2;
        int i15;
        StringBuilder sb2;
        boolean z14;
        boolean z15;
        String str14;
        String str15;
        String str16;
        boolean z16;
        String str17;
        int i16;
        String str18;
        String str19;
        boolean z17;
        long j11;
        long[] jArr3;
        boolean z18;
        String str20;
        String str21;
        boolean z19;
        String str22;
        boolean z20;
        long[] jArr4;
        boolean z21;
        long[] jArr5;
        SharedPreferences.Editor editor;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        String str23;
        String str24;
        boolean z27;
        boolean z28;
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
        boolean z29 = !z10 && DialogObject.isEncryptedDialog(j3);
        boolean z30 = (z11 || str3 == null || !notificationsSettings.getBoolean(str3, false)) ? false : true;
        String MD5 = Utilities.MD5(uri == null ? "NoSound2" : uri.toString());
        if (MD5 != null && MD5.length() > 5) {
            MD5 = MD5.substring(0, 5);
        }
        if (z12) {
            str25 = "silent";
            i13 = 0;
            str5 = LocaleController.getString(R.string.NotificationsSilent);
        } else if (z10) {
            str5 = LocaleController.getString(z11 ? R.string.NotificationsInAppDefault : R.string.NotificationsDefault);
            i13 = 0;
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
            i13 = 0;
            String formatString = z11 ? LocaleController.formatString(R.string.NotificationsChatInApp, str) : str;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(z11 ? "org.telegram.keyia" : "org.telegram.key");
            sb3.append(j3);
            sb3.append("_");
            sb3.append(j10);
            str25 = sb3.toString();
            str5 = formatString;
        }
        String D = a1.g.D(str25, "_", MD5);
        String string = notificationsSettings.getString(D, null);
        String string2 = notificationsSettings.getString(D + "_s", null);
        StringBuilder sb4 = new StringBuilder();
        if (string != null) {
            sharedPreferences = notificationsSettings;
            NotificationChannel notificationChannel = systemNotificationManager.getNotificationChannel(string);
            str11 = str5;
            if (BuildVars.LOGS_ENABLED) {
                z13 = z30;
                FileLog.d("current channel for " + string + " = " + notificationChannel);
            } else {
                z13 = z30;
            }
            if (notificationChannel == null) {
                str13 = "_s";
                jArr2 = jArr;
                str7 = "secret";
                str8 = D;
                str10 = "_";
                str12 = str2;
                int i17 = i13;
                i15 = i10;
                sb2 = sb4;
                z14 = i17 == true ? 1 : 0;
                z15 = z13;
                str15 = null;
                str16 = null;
                str14 = null;
                z16 = i17;
            } else if (z12 || z13) {
                jArr2 = jArr;
                str6 = string2;
                str7 = "secret";
                str8 = D;
                str9 = string;
                str10 = "_";
                str12 = str2;
                i14 = i13;
                str13 = "_s";
            } else {
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
                    jArr3[i13] = 0;
                    jArr3[1] = 0;
                }
                int lightColor = notificationChannel.getLightColor();
                str8 = D;
                str10 = "_";
                if (jArr3 != null) {
                    int i18 = i13;
                    while (true) {
                        z18 = shouldVibrate;
                        if (i18 >= jArr3.length) {
                            break;
                        }
                        sb4.append(jArr3[i18]);
                        i18++;
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
                if (!z10 && z29) {
                    sb4.append("secret");
                }
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb5 = new StringBuilder("current channel settings for ");
                    sb5.append(string);
                    sb5.append(" = ");
                    sb5.append((Object) sb4);
                    sb5.append(" old = ");
                    hg.c.t(string2, sb5);
                }
                String MD52 = Utilities.MD5(sb4.toString());
                sb4.setLength(i13);
                if (!z11 || i11 == importance) {
                    if (MD52.equals(string2)) {
                        i15 = i10;
                        str20 = string2;
                        str7 = "secret";
                        str21 = string;
                        z19 = false;
                        str13 = "_s";
                        sb2 = sb4;
                        str22 = MD52;
                        z20 = false;
                        jArr4 = jArr;
                    } else {
                        str20 = string2;
                        if (importance == 0) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            if (z10) {
                                if (z11) {
                                    str24 = "_s";
                                    str23 = "secret";
                                    z26 = true;
                                } else {
                                    if (i12 == 3) {
                                        edit.putBoolean("EnableAllStories", false);
                                        z27 = true;
                                    } else if (i12 == 4) {
                                        z27 = true;
                                        edit.putBoolean("EnableReactionsMessages", true);
                                        edit.putBoolean("EnableReactionsStories", true);
                                    } else {
                                        z27 = true;
                                        edit.putInt(getGlobalNotificationsKey(i12), ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    }
                                    updateServerNotificationsSettings(i12);
                                    str24 = "_s";
                                    z26 = z27;
                                    str23 = "secret";
                                }
                                z25 = false;
                            } else {
                                if (i12 == 3) {
                                    edit.putBoolean(q.i(j3, j11, new StringBuilder(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY)), false);
                                    z25 = false;
                                } else {
                                    z25 = false;
                                    edit.putInt(q.i(j3, j11, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 2);
                                }
                                z26 = true;
                                str23 = "secret";
                                str24 = "_s";
                                updateServerNotificationsSettings(j3, 0L, true);
                            }
                            editor = edit;
                            str22 = MD52;
                            str7 = str23;
                            z20 = z26;
                            z19 = z25;
                            sb2 = sb4;
                            jArr5 = jArr;
                            str21 = string;
                            str13 = str24;
                            jArr4 = jArr3;
                        } else {
                            str21 = string;
                            jArr4 = jArr3;
                            str13 = "_s";
                            str22 = MD52;
                            sb2 = sb4;
                            if (importance != i11) {
                                if (z11) {
                                    str7 = "secret";
                                    z22 = false;
                                    editor = null;
                                } else {
                                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                    str7 = "secret";
                                    int i19 = (importance == 4 || importance == 5) ? 1 : importance == 1 ? 4 : importance == 2 ? 5 : 0;
                                    if (z10) {
                                        if (i12 == 3) {
                                            edit2.putBoolean("EnableAllStories", true);
                                        } else if (i12 == 4) {
                                            edit2.putBoolean("EnableReactionsMessages", true);
                                            edit2.putBoolean("EnableReactionsStories", true);
                                        } else {
                                            z24 = false;
                                            edit2.putInt(getGlobalNotificationsKey(i12), 0);
                                            if (i12 != 2) {
                                                edit2.putInt("priority_channel", i19);
                                                z23 = z24;
                                            } else if (i12 == 0) {
                                                edit2.putInt("priority_group", i19);
                                                z23 = z24;
                                            } else if (i12 == 3) {
                                                edit2.putInt("priority_stories", i19);
                                                z23 = z24;
                                            } else if (i12 == 4 || i12 == 5) {
                                                edit2.putInt("priority_react", i19);
                                                z23 = z24;
                                            } else {
                                                edit2.putInt("priority_messages", i19);
                                                z23 = z24;
                                            }
                                        }
                                        z24 = false;
                                        if (i12 != 2) {
                                        }
                                    } else {
                                        z23 = false;
                                        z23 = false;
                                        if (i12 == 3) {
                                            edit2.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + j3, true);
                                        } else {
                                            edit2.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + j3, 0);
                                            edit2.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + j3);
                                            edit2.putInt("priority_" + j3, i19);
                                        }
                                    }
                                    editor = edit2;
                                    z22 = z23;
                                }
                                jArr5 = jArr;
                                z20 = true;
                                z19 = z22;
                            } else {
                                str7 = "secret";
                                z19 = false;
                                jArr5 = jArr;
                                z20 = false;
                                editor = null;
                            }
                        }
                        boolean z31 = z18;
                        if ((!isEmptyVibration(jArr5)) != z31) {
                            if (!z11) {
                                if (editor == null) {
                                    editor = sharedPreferences.edit();
                                }
                                if (!z10) {
                                    editor.putInt(a1.g.p(j3, "vibrate_"), z31 ? z19 ? 1 : 0 : 2);
                                } else if (i12 == 2) {
                                    editor.putInt("vibrate_channel", z31 ? z19 ? 1 : 0 : 2);
                                } else if (i12 == 0) {
                                    editor.putInt("vibrate_group", z31 ? z19 ? 1 : 0 : 2);
                                } else if (i12 == 3) {
                                    editor.putInt("vibrate_stories", z31 ? z19 ? 1 : 0 : 2);
                                } else if (i12 == 4 || i12 == 5) {
                                    editor.putInt("vibrate_react", z31 ? z19 ? 1 : 0 : 2);
                                } else {
                                    editor.putInt("vibrate_messages", z31 ? z19 ? 1 : 0 : 2);
                                }
                            }
                            z20 = true;
                        } else {
                            jArr4 = jArr5;
                        }
                        i15 = i10;
                        if (lightColor != i15) {
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
                            i15 = lightColor;
                            z20 = true;
                        }
                        if (editor != null) {
                            editor.commit();
                        }
                    }
                    z21 = z13;
                    z28 = z19;
                } else {
                    jArr4 = jArr;
                    i15 = i10;
                    str20 = string2;
                    str7 = "secret";
                    str21 = string;
                    z28 = false;
                    z20 = false;
                    str13 = "_s";
                    sb2 = sb4;
                    str22 = MD52;
                    z21 = true;
                }
                z15 = z21;
                z14 = z20;
                str14 = str21;
                jArr2 = jArr4;
                str15 = str20;
                str16 = str22;
                z16 = z28;
            }
            if (z14 || str16 == null) {
                str17 = str8;
                if (!z15 || str16 == null || !z11 || !z10) {
                    for (i16 = z16; i16 < jArr2.length; i16++) {
                        sb2.append(jArr2[i16]);
                    }
                    sb2.append(i15);
                    if (uri != null) {
                        sb2.append(uri.toString());
                    }
                    sb2.append(i11);
                    if (!z10 && z29) {
                        sb2.append(str7);
                    }
                    str16 = Utilities.MD5(sb2.toString());
                    if (!z12 && str14 != null && (z15 || !str15.equals(str16))) {
                        try {
                            systemNotificationManager.deleteNotificationChannel(str14);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel by settings change ".concat(str14));
                        }
                        str18 = str16;
                        str19 = null;
                        if (str19 == null) {
                            str19 = z10 ? this.currentAccount + "channel_" + str17 + str10 + Utilities.random.nextLong() : this.currentAccount + "channel_" + j3 + str10 + Utilities.random.nextLong();
                            NotificationChannel notificationChannel2 = new NotificationChannel(str19, z29 ? LocaleController.getString(R.string.SecretChatName) : str11, i11);
                            notificationChannel2.setGroup(str12);
                            if (i15 != 0) {
                                z17 = true;
                                notificationChannel2.enableLights(true);
                                notificationChannel2.setLightColor(i15);
                            } else {
                                z17 = true;
                                notificationChannel2.enableLights(z16);
                            }
                            if (isEmptyVibration(jArr2)) {
                                notificationChannel2.enableVibration(z16);
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
                sharedPreferences.edit().putString(str17, str14).putString(str17 + str13, str16).commit();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("change edited channel " + str14);
                }
            }
            str18 = str16;
            str19 = str14;
            if (str19 == null) {
            }
            return str19;
        }
        str6 = string2;
        str7 = "secret";
        sharedPreferences = notificationsSettings;
        str8 = D;
        str9 = string;
        str10 = "_";
        str11 = str5;
        str12 = str2;
        z13 = z30;
        i14 = i13;
        str13 = "_s";
        jArr2 = jArr;
        i15 = i10;
        sb2 = sb4;
        z14 = i14 == true ? 1 : 0;
        z15 = z13;
        str14 = str9;
        str15 = str6;
        str16 = null;
        z16 = i14;
        if (z14) {
        }
        str17 = str8;
        if (!z15) {
        }
        while (i16 < jArr2.length) {
        }
        sb2.append(i15);
        if (uri != null) {
        }
        sb2.append(i11);
        if (!z10) {
            sb2.append(str7);
        }
        str16 = Utilities.MD5(sb2.toString());
        if (!z12) {
            systemNotificationManager.deleteNotificationChannel(str14);
            if (BuildVars.LOGS_ENABLED) {
            }
            str18 = str16;
            str19 = null;
            if (str19 == null) {
            }
            return str19;
        }
        str18 = str16;
        str19 = str14;
        if (str19 == null) {
        }
        return str19;
    }

    public void cleanup() {
        this.popupMessages.clear();
        this.popupReplyMessages.clear();
        this.channelGroupsCreated = false;
        notificationsQueue.postRunnable(new zg(this, 1));
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
        notificationsQueue.postRunnable(new zg(this, 6));
    }

    public void deleteNotificationChannel(long j3, long j10) {
        deleteNotificationChannel(j3, j10, -1);
    }

    public void deleteNotificationChannelGlobal(int i10) {
        deleteNotificationChannelGlobal(i10, -1);
    }

    /* renamed from: deleteNotificationChannelGlobalInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$deleteNotificationChannelGlobal$44(int i10, int i11) {
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
            notificationsQueue.postRunnable(new vg(4, this, (String) objArr[0]));
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
                    NotificationChannel a2 = yg.a(notificationChannels.get(i10));
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
        notificationsQueue.postRunnable(new zg(this, 12));
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

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0211, code lost:
    
        if (r12.getBoolean("EnablePreviewAll", true) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0227, code lost:
    
        r3 = r27.messageOwner;
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x023a, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageService) == false) goto L743;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x023c, code lost:
    
        r28[0] = null;
        r3 = r3.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0242, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGramTransfer) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0248, code lost:
    
        return getGramTransferNotification(r27, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x024b, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetSameChatWallPaper) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0253, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.WallpaperSameNotification);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0256, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatWallPaper) == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x025e, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.WallpaperNotification);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0261, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGeoProximityReached) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0269, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026c, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0270, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionContactSignUp) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0277, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserUpdatedPhoto) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0284, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationContactNewPhoto, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0288, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageActionLoginUnknownLocation) == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x028a, code lost:
    
        r2 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.formatDateAtTime, org.telegram.messenger.LocaleController.getInstance().getFormatterYear().format(r27.messageOwner.date * 1000), org.telegram.messenger.LocaleController.getInstance().getFormatterDay().format(r27.messageOwner.date * 1000));
        r3 = org.telegram.messenger.R.string.NotificationUnrecognizedDevice;
        r4 = getUserConfig().getCurrentUser().first_name;
        r1 = r27.messageOwner.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02e5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r3, r4, r2, r1.title, r1.address);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x031b, code lost:
    
        if (zf.d.g(r3, org.telegram.tgnet.TLRPC.TL_messageActionGameScore.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSent.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSentMe.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGift.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftPremium.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesPrice.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesRefunded.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftTon.class) == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0323, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0324, code lost:
    
        r3 = r27.messageOwner;
        r5 = r3.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x032a, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPhoneCall) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x032e, code lost:
    
        if (r5.video == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0336, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageVideoIncomingMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x033d, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageIncomingMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0340, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionConferenceCall) == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0344, code lost:
    
        if (r5.video == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x034c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageVideoIncomingConferenceMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0353, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageIncomingConferenceMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0358, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatAddUser) == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x035a, code lost:
    
        r6 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x035e, code lost:
    
        if (r6 != 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0367, code lost:
    
        if (r5.users.size() != 1) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0369, code lost:
    
        r6 = r27.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x037d, code lost:
    
        if (r6 == 0) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0387, code lost:
    
        if (r27.messageOwner.peer_id.channel_id == 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x038b, code lost:
    
        if (r4.megagroup != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelAddedByNotification, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03aa, code lost:
    
        if (r6 != r20) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03bc, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroup, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03bd, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03c9, code lost:
    
        if (r1 != null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03cb, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03d0, code lost:
    
        if (r9 != r1.id) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03d4, code lost:
    
        if (r4.megagroup == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03eb, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelfMega, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0401, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelf, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x041d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r2, getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x041e, code lost:
    
        r3 = new java.lang.StringBuilder();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x042e, code lost:
    
        if (r5 >= r27.messageOwner.action.users.size()) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0430, code lost:
    
        r6 = getMessagesController().getUser(r27.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0444, code lost:
    
        if (r6 == null) goto L923;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0446, code lost:
    
        r6 = org.telegram.messenger.UserObject.getUserName(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x044e, code lost:
    
        if (r3.length() == 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0450, code lost:
    
        r3.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0453, code lost:
    
        r3.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0456, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0474, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r2, getTitle(r4), r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0478, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCall) == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x047c, code lost:
    
        if (r5.duration == 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0492, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupEndedCall, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04a7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupCreatedCall, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04aa, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCallScheduled) == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04b2, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04b5, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionInviteToGroupCall) == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04b7, code lost:
    
        r6 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04bb, code lost:
    
        if (r6 != 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04c4, code lost:
    
        if (r5.users.size() != 1) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04c6, code lost:
    
        r6 = r27.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04d9, code lost:
    
        if (r6 == 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04dd, code lost:
    
        if (r6 != r20) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04f4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedYouToCall, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04f5, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0501, code lost:
    
        if (r1 != null) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0503, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0521, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r2, getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0522, code lost:
    
        r3 = new java.lang.StringBuilder();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0532, code lost:
    
        if (r5 >= r27.messageOwner.action.users.size()) goto L924;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0534, code lost:
    
        r6 = getMessagesController().getUser(r27.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0548, code lost:
    
        if (r6 == null) goto L926;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x054a, code lost:
    
        r6 = org.telegram.messenger.UserObject.getUserName(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0552, code lost:
    
        if (r3.length() == 0) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0554, code lost:
    
        r3.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0557, code lost:
    
        r3.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x055a, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x057a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r2, getTitle(r4), r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x057d, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) == false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0585, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingReceivedGiftNoName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0588, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByLink) == false) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x059f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroupByLink, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05a7, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditTitle) == false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x05b7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupName, r2, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x05ba, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditPhoto) != false) goto L725;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x05be, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeletePhoto) == false) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x05c4, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeleteUser) == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x05c6, code lost:
    
        r5 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x05ca, code lost:
    
        if (r5 != r20) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x05e1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickYou, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x05e9, code lost:
    
        if (r5 != r9) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x05fb, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupLeftMember, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05fc, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r27.messageOwner.action.user_id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x060e, code lost:
    
        if (r1 != null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0610, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x062e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickMember, r2, getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0631, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatCreate) == false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0639, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x063c, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelCreate) == false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0644, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0647, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatMigrateTo) == false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x065a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0660, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x066e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0671, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionScreenshotTaken) == false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0679, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x067c, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayLaunch) == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0684, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0687, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayResults) == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x068f, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0692, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSuggestBirthday) == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x069a, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x069d, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPinMessage) == false) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x06a3, code lost:
    
        if (r4 == null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x06a9, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r4) == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x06ad, code lost:
    
        if (r4.megagroup == false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x06b4, code lost:
    
        r1 = r27.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x06b6, code lost:
    
        if (r1 != null) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x06cd, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x06d7, code lost:
    
        if (r1.isMusic() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x06e9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusic, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x06ee, code lost:
    
        if (r1.isVideo() == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06f8, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0722, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r2, "📹 " + r1.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0738, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideo, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x073d, code lost:
    
        if (r1.isGif() == false) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0747, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0771, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r2, "🎬 " + r1.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0787, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGif, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0791, code lost:
    
        if (r1.isVoice() == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x07a3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoice, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x07a8, code lost:
    
        if (r1.isRoundVideo() == false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x07ba, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRound, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x07bf, code lost:
    
        if (r1.isSticker() != false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x07c5, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x07cb, code lost:
    
        r6 = r1.messageOwner;
        r7 = r6.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x07d1, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x07d9, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0803, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r2, "📎 " + r1.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0819, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFile, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x081c, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0820, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0829, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0840, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLive, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0843, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0845, code lost:
    
        r7 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0868, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContact2, r2, getTitle(r4), org.telegram.messenger.ContactsController.formatName(r7.first_name, r7.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x086b, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x086d, code lost:
    
        r7 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0873, code lost:
    
        if (r7.poll.quiz == false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0894, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuiz2, r2, getTitle(r4), r7.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x08b4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPoll2, r2, getTitle(r4), r7.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x08b7, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x08da, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodo2, r2, getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r7).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x08dd, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x08e5, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x090f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r2, "🖼 " + r1.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0925, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhoto, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x092d, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x093f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGame, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0940, code lost:
    
        r6 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0942, code lost:
    
        if (r6 == null) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0948, code lost:
    
        if (r6.length() <= 0) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x094a, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0950, code lost:
    
        if (r1.length() <= 20) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0952, code lost:
    
        r6 = new java.lang.StringBuilder();
        r7 = 0;
        r6.append((java.lang.Object) r1.subSequence(0, 20));
        r6.append("...");
        r1 = r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0968, code lost:
    
        r3 = org.telegram.messenger.R.string.NotificationActionPinnedText;
        r4 = getTitle(r4);
        r5 = new java.lang.Object[3];
        r5[r7] = r2;
        r5[1] = r1;
        r5[2] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x097d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0967, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0991, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x09a2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeo, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x09a3, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x09a7, code lost:
    
        if (r1 == null) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x09bd, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmoji, r2, getTitle(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x09cf, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedSticker, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x09d0, code lost:
    
        if (r4 == null) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x09d2, code lost:
    
        r1 = r27.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x09d4, code lost:
    
        if (r1 != null) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x09e4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x09e9, code lost:
    
        if (r1.isMusic() == false) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x09f9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x09fe, code lost:
    
        if (r1.isVideo() == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0a08, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0a2e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "📹 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0a40, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0a45, code lost:
    
        if (r1.isGif() == false) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0a4f, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0a75, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "🎬 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0a87, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0a8f, code lost:
    
        if (r1.isVoice() == false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0a9f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0aa4, code lost:
    
        if (r1.isRoundVideo() == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0ab4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0ab9, code lost:
    
        if (r1.isSticker() != false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0abf, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0ac5, code lost:
    
        r2 = r1.messageOwner;
        r6 = r2.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0acb, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0ad3, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0af9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "📎 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b0b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0b0e, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0b12, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0b1a, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0b2d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0b30, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0b32, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0b51, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactChannel2, getTitle(r4), org.telegram.messenger.ContactsController.formatName(r6.first_name, r6.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0b54, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0b56, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0b5c, code lost:
    
        if (r6.poll.quiz == false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0b79, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizChannel2, getTitle(r4), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0b95, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollChannel2, getTitle(r4), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0b98, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0bb7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoChannel2, getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r6).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0bba, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0bc2, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0be8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "🖼 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0bfa, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0c00, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c10, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0c11, code lost:
    
        r2 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0c13, code lost:
    
        if (r2 == null) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0c19, code lost:
    
        if (r2.length() <= 0) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0c1b, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0c21, code lost:
    
        if (r1.length() <= 20) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0c23, code lost:
    
        r2 = new java.lang.StringBuilder();
        r7 = 0;
        r2.append((java.lang.Object) r1.subSequence(0, 20));
        r2.append("...");
        r1 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0c39, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedTextChannel;
        r3 = getTitle(r4);
        r4 = new java.lang.Object[2];
        r4[r7] = r3;
        r4[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0c4b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0c38, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0c5c, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0c6b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0c6c, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0c70, code lost:
    
        if (r1 == null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0c83, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0c92, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0c93, code lost:
    
        r1 = r27.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0c95, code lost:
    
        if (r1 != null) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0ca1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0ca6, code lost:
    
        if (r1.isMusic() == false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0cb2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0cb7, code lost:
    
        if (r1.isVideo() == false) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0cc1, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0ce3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r2, "📹 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0cf1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0cf6, code lost:
    
        if (r1.isGif() == false) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0d00, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0d22, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r2, "🎬 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0d30, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0d38, code lost:
    
        if (r1.isVoice() == false) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0d44, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0d49, code lost:
    
        if (r1.isRoundVideo() == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0d55, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0d5a, code lost:
    
        if (r1.isSticker() != false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0d60, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0d66, code lost:
    
        r4 = r1.messageOwner;
        r6 = r4.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0d6c, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0d74, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0d96, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r2, "📎 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0da4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0da7, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0dab, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0db3, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0dc2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0dc7, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0dc9, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0de2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactUser, r2, org.telegram.messenger.ContactsController.formatName(r6.first_name, r6.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0de5, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0de7, code lost:
    
        r1 = ((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r6).poll;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0ded, code lost:
    
        if (r1.quiz == false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0e04, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizUser, r2, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0e1a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollUser, r2, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0e1d, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0e38, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoUser, r2, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r6).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0e3b, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0e43, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0e65, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r2, "🖼 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0e73, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0e79, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0e85, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0e86, code lost:
    
        r4 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0e88, code lost:
    
        if (r4 == null) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0e8e, code lost:
    
        if (r4.length() <= 0) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0e90, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0e96, code lost:
    
        if (r1.length() <= 20) goto L667;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0e98, code lost:
    
        r4 = new java.lang.StringBuilder();
        r7 = 0;
        r4.append((java.lang.Object) r1.subSequence(0, 20));
        r4.append("...");
        r1 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0eae, code lost:
    
        r3 = org.telegram.messenger.R.string.NotificationActionPinnedTextUser;
        r4 = new java.lang.Object[2];
        r4[r7] = r2;
        r4[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0ebc, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0ead, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0ec9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0ed4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0ed5, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0ed9, code lost:
    
        if (r1 == null) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0ee8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiUser, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0ef3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerUser, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0ef6, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0ef8, code lost:
    
        r1 = zf.d.f(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r5).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0f04, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L690;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0f08, code lost:
    
        if (r24 != r20) goto L688;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0f13, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabledYou, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0f23, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabled, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0f28, code lost:
    
        if (r24 != r20) goto L694;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0f34, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedYou, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0f42, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedTo, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0f45, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByRequest) == false) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0f4d, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0f50, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) == false) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0f52, code lost:
    
        r5 = (org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) r5;
        r1 = org.telegram.messenger.DialogObject.getPeerDialogId(r5.boost_peer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x0f5c, code lost:
    
        if (r1 < 0) goto L705;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0f5e, code lost:
    
        r1 = org.telegram.messenger.UserObject.getForcedFirstName(getMessagesController().getUser(java.lang.Long.valueOf(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0f94, code lost:
    
        return org.telegram.messenger.LocaleController.formatPluralStringComma("BoostingReceivedStars", (int) r5.stars, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0f6f, code lost:
    
        r1 = getMessagesController().getChat(java.lang.Long.valueOf(-r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0f7c, code lost:
    
        if (r1 != null) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0f7f, code lost:
    
        r7 = getTitle(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0f83, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0f97, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPaymentRefunded) == false) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0f9f, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0fa2, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoCompletions) == false) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0faa, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0fad, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoAppendTasks) == false) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x0fb5, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0fb6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0fbd, code lost:
    
        if (r3.peer_id.channel_id == 0) goto L735;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0fc1, code lost:
    
        if (r4.megagroup != false) goto L735;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x0fc7, code lost:
    
        if (r27.isVideoAvatar() == false) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x0fda, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelVideoEditNotification, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0fec, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelPhotoEditNotification, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x0ff3, code lost:
    
        if (r27.isVideoAvatar() == false) goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1007, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupVideo, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x101a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupPhoto, r2, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x1025, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationContactJoined, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x102a, code lost:
    
        if (r27.isMediaEmpty() == false) goto L751;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x1034, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L749;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x103a, code lost:
    
        return replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x1041, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x1046, code lost:
    
        if (r27.type != 29) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x104e, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r27) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x1050, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.MessageObject.getMedia(r27);
        r2 = r1.extended_media.size();
        r3 = 0;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x105e, code lost:
    
        if (r3 >= r2) goto L928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x1060, code lost:
    
        r5 = r1.extended_media.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x106a, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) == false) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x106c, code lost:
    
        r4 = ((org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) r5).media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x1072, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x107a, code lost:
    
        if (org.telegram.messenger.MessageObject.isVideoDocument(r4.document) == false) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x107c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x108c, code lost:
    
        if (r4 == false) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x108f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x1092, code lost:
    
        r1 = org.telegram.messenger.R.string.AttachPaidMedia;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x1095, code lost:
    
        if (r2 != 1) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x1097, code lost:
    
        if (r4 == false) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x1099, code lost:
    
        r2 = org.telegram.messenger.R.string.AttachVideo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x109e, code lost:
    
        r2 = org.telegram.messenger.LocaleController.getString(r2);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x10b5, code lost:
    
        r3 = new java.lang.Object[1];
        r3[r7] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x10bd, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x109c, code lost:
    
        r2 = org.telegram.messenger.R.string.AttachPhoto;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x10a5, code lost:
    
        if (r4 == false) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x10a7, code lost:
    
        r3 = "Media";
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x10a9, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x10ae, code lost:
    
        r2 = org.telegram.messenger.LocaleController.formatPluralString(r3, r2, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x10ab, code lost:
    
        r3 = "Photos";
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x107e, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x1082, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) == false) goto L770;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x1089, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r5).flags & 4) == 0) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x10c2, code lost:
    
        if (r27.isVoiceOnce() == false) goto L791;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x10ca, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x10cf, code lost:
    
        if (r27.isRoundOnce() == false) goto L795;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x10d7, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x10d8, code lost:
    
        r2 = r27.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x10de, code lost:
    
        if ((r2.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x10e6, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x10f8, code lost:
    
        return "🖼 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x10ff, code lost:
    
        if (r27.messageOwner.media.ttl_seconds == 0) goto L805;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x1107, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x110e, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x1113, code lost:
    
        if (r27.isVideo() == false) goto L819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x111d, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x112f, code lost:
    
        return "📹 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x1136, code lost:
    
        if (r27.messageOwner.media.ttl_seconds == 0) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x113e, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x1145, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x114a, code lost:
    
        if (r27.isGame() == false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x1152, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGame);
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x1157, code lost:
    
        if (r27.isVoice() == false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x115f, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x1164, code lost:
    
        if (r27.isRoundVideo() == false) goto L831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x116c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x1171, code lost:
    
        if (r27.isMusic() == false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x1179, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachMusic);
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x117a, code lost:
    
        r2 = r27.messageOwner.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x1180, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x1188, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachContact);
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x118b, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L847;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x1193, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r2).poll.quiz == false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x119b, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.QuizPoll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x11a2, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Poll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x11a5, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x11ad, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Todo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x11b0, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L855;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x11b8, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveaway);
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x11bb, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L859;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x11c3, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveawayResults);
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x11c6, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L913;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x11ca, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x11d0, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x11d8, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLiveLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x11db, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L895;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x11e1, code lost:
    
        if (r27.isSticker() != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x11e7, code lost:
    
        if (r27.isAnimatedSticker() == false) goto L875;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x11ee, code lost:
    
        if (r27.isGif() == false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x11f8, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x120a, code lost:
    
        return "🎬 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x1211, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGif);
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x121a, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L887;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x122c, code lost:
    
        return "📎 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x1233, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDocument);
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x1234, code lost:
    
        r1 = r27.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x1238, code lost:
    
        if (r1 == null) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x1246, code lost:
    
        return org.telegram.messenger.q.g(org.telegram.messenger.R.string.AttachSticker, sc.v.j(r1, " "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x124d, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachSticker);
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x1250, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaStory) == false) goto L907;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x1256, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaStory) r2).via_mention == false) goto L905;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x1258, code lost:
    
        r1 = org.telegram.messenger.R.string.StoryNotificationMention;
        r2 = r28[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x125e, code lost:
    
        if (r2 != null) goto L902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x126c, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x1262, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x1273, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Story);
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x127a, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageText) != false) goto L911;
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x1280, code lost:
    
        return replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x1287, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x128e, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x021d, code lost:
    
        if (r12.getBoolean("EnablePreviewGroup", r6) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x0225, code lost:
    
        if (r12.getBoolean("EnablePreviewChannel", r6) != false) goto L162;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getShortStringForMessage(MessageObject messageObject, String[] strArr, boolean[] zArr) {
        long j3;
        String str;
        TLRPC.Chat chat;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Chat chat2;
        String str2;
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
        boolean w10 = q.w(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, j10, notificationsSettings, true);
        if (messageObject.isFcmMessage()) {
            if (j11 == 0 && j12 != 0) {
                if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = messageObject.localName;
                }
                if (!w10 || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
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
                if (!w10 || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true)))) {
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
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j12));
            if (user != null) {
                String userName = UserObject.getUserName(user);
                if (j11 != 0) {
                    strArr[0] = userName;
                    str2 = userName;
                } else {
                    str2 = userName;
                    if (Build.VERSION.SDK_INT > 27) {
                        strArr[0] = str2;
                    } else {
                        strArr[0] = null;
                    }
                }
                str = str2;
            } else {
                str = null;
            }
            j3 = j10;
        } else {
            j3 = j10;
            TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j12));
            if (chat3 != null) {
                str = getTitle(chat3);
                strArr[0] = str;
            } else {
                str = null;
            }
        }
        if (str != null && j12 > 0 && UserObject.isReplyUser(j3) && (messageFwdHeader = messageObject.messageOwner.fwd_from) != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long peerId = MessageObject.getPeerId(peer);
            if (DialogObject.isChatDialog(peerId) && (chat2 = getMessagesController().getChat(Long.valueOf(-peerId))) != null) {
                StringBuilder j13 = sc.v.j(str, " @ ");
                j13.append(getTitle(chat2));
                str = j13.toString();
                if (strArr[0] != null) {
                    strArr[0] = str;
                }
            }
        }
        if (str == null) {
            return null;
        }
        if (j11 != 0) {
            chat = getMessagesController().getChat(Long.valueOf(j11));
            if (chat == null) {
                return null;
            }
            if (ChatObject.isChannel(chat) && !chat.megagroup && Build.VERSION.SDK_INT <= 27) {
                strArr[0] = null;
            }
        } else {
            chat = null;
        }
        if (DialogObject.isEncryptedDialog(j3)) {
            strArr[0] = null;
            return LocaleController.getString(R.string.NotificationHiddenMessage);
        }
        boolean z10 = ChatObject.isChannel(chat) && !chat.megagroup;
        TLRPC.Message message2 = messageObject.messageOwner;
        if (message2 != null && message2.rich_message != null) {
            return messageObject.messageText.toString();
        }
        if (w10) {
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
        notificationsQueue.postRunnable(new zg(this, 2));
    }

    public boolean isGlobalNotificationsEnabled(long j3, boolean z10, boolean z11) {
        return isGlobalNotificationsEnabled(j3, null, z10, z11);
    }

    public void loadTopicsNotificationsExceptions(long j3, Consumer<HashSet<Integer>> consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new c4(this, j3, consumer, 26));
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
            edit.putInt(q.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 0);
        } else {
            edit.remove(q.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)));
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
        notificationsQueue.postRunnable(new zg(this, 7));
    }

    public void processDeleteStory(long j3, int i10) {
        notificationsQueue.postRunnable(new eh(this, j3, i10, 0));
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
        notificationsQueue.postRunnable(new vg(5, this, iVar));
    }

    public void processIgnoreStories() {
        notificationsQueue.postRunnable(new zg(this, 4));
    }

    public void processIgnoreStoryReactions() {
        notificationsQueue.postRunnable(new zg(this, 13));
    }

    public void processLoadedUnreadMessages(a0.i iVar, ArrayList<TLRPC.Message> arrayList, ArrayList<MessageObject> arrayList2, ArrayList<TLRPC.User> arrayList3, ArrayList<TLRPC.Chat> arrayList4, ArrayList<TLRPC.EncryptedChat> arrayList5, Collection<StoryNotification> collection) {
        getMessagesController().putUsers(arrayList3, true);
        getMessagesController().putChats(arrayList4, true);
        getMessagesController().putEncryptedChats(arrayList5, true);
        notificationsQueue.postRunnable(new c5(this, arrayList, iVar, arrayList2, collection));
    }

    public void processNewMessages(ArrayList<MessageObject> arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            sb2.append(arrayList == null ? "null" : Integer.valueOf(arrayList.size()));
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
            notificationsQueue.postRunnable(new dd(this, arrayList, new ArrayList(0), z13, z12, countDownLatch, 1));
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void processReadMessages(LongSparseIntArray longSparseIntArray, long j3, int i10, int i11, boolean z10) {
        notificationsQueue.postRunnable(new k8(this, longSparseIntArray, new ArrayList(0), j3, i11, i10, z10));
    }

    public void processReadStories() {
    }

    public void processSeenStoryReactions(long j3, int i10) {
        if (j3 != getUserConfig().getClientUserId()) {
            return;
        }
        notificationsQueue.postRunnable(new fh(this, i10, 0));
    }

    public void removeDeletedHisoryFromNotifications(LongSparseIntArray longSparseIntArray) {
        notificationsQueue.postRunnable(new gh(this, longSparseIntArray, new ArrayList(0), 1));
    }

    public void removeDeletedMessagesFromNotifications(a0.i iVar, boolean z10) {
        notificationsQueue.postRunnable(new bk(this, iVar, z10, new ArrayList(0), 14));
    }

    public void removeNotificationsForDialog(long j3) {
        processReadMessages(null, j3, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j3, 0);
        processDialogsUpdateRead(longSparseIntArray);
    }

    public void repeatNotificationMaybe() {
        notificationsQueue.postRunnable(new zg(this, 3));
    }

    public void setDialogNotificationsSettings(long j3, long j10, int i10) {
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(UserConfig.selectedAccount).dialogs_dict.f(j3);
        if (i10 == 4) {
            if (isGlobalNotificationsEnabled(j3, false, false)) {
                edit.remove(q.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)));
            } else {
                edit.putInt(q.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 0);
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
                edit.putInt(q.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 2);
            } else {
                edit.putInt(q.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), 3);
                edit.putInt(q.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL)), currentTime);
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
        notificationsQueue.postRunnable(new fh(this, i10, 1));
    }

    public void setOpenedDialogId(long j3, long j10) {
        notificationsQueue.postRunnable(new jd(this, j3, j10, 1));
    }

    public void setOpenedInBubble(long j3, boolean z10) {
        notificationsQueue.postRunnable(new ci.o9(this, z10, j3, 3));
    }

    public void showNotifications() {
        notificationsQueue.postRunnable(new zg(this, 11));
    }

    public void showTonConnectNotification(String str, long j3) {
        notificationsQueue.postRunnable(new c4(this, str, j3, 25));
    }

    public void updateBadge() {
        notificationsQueue.postRunnable(new zg(this, 5));
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
        notificationsQueue.postRunnable(new x4(this, j3, j10, i10, 2));
    }

    public void deleteNotificationChannelGlobal(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new r6(this, i10, i11, 2));
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
        notificationsQueue.postRunnable(new ai.j(this, j3, 15));
    }

    public void processReadStories(long j3, int i10) {
        notificationsQueue.postRunnable(new eh(this, j3, i10, 1));
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
        int i10 = notificationsSettings.getInt(q.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY)), -1);
        if (i10 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i10 == 3) {
                tL_inputPeerNotifySettings4.mute_until = notificationsSettings.getInt(q.i(j3, j10, new StringBuilder(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL)), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i10 == 2 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
            }
        }
        long j11 = notificationsSettings.getLong(q.i(j3, j10, new StringBuilder("sound_document_id_")), 0L);
        String string = notificationsSettings.getString(q.i(j3, j10, new StringBuilder("sound_path_")), null);
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
            tL_notificationSoundLocal.title = notificationsSettings.getString(q.i(j3, j10, new StringBuilder("sound_")), null);
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
        getConnectionsManager().sendRequest(updatenotifysettings, new ld(6));
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
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$51(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$52(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$53(TLObject tLObject, TLRPC.TL_error tL_error) {
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
            getConnectionsManager().sendRequest(updatenotifysettings, new ld(5));
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
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new ld(4));
    }
}
