package org.telegram.messenger;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
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
import android.graphics.PostProcessor;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.collection.LongSparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.Person;
import androidx.core.app.RemoteInput;
import androidx.core.content.FileProvider;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.framework.media.internal.zzo$$ExternalSyntheticApiModelOutline2;
import com.google.android.search.verification.client.SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2;
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
import java.util.function.ToLongFunction;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class NotificationsController extends BaseController {
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
    private static NotificationManagerCompat notificationManager;
    private static final LongSparseArray sharedPrefCachedKeys;
    private static NotificationManager systemNotificationManager;
    private AlarmManager alarmManager;
    private boolean channelGroupsCreated;
    private Runnable checkStoryPushesRunnable;
    private final ArrayList<MessageObject> delayedPushMessages;
    NotificationsSettingsFacade dialogsNotificationsFacade;
    private final LongSparseArray fcmRandomMessagesDict;
    private Boolean groupsCreated;
    private boolean inChatSoundEnabled;
    private int lastBadgeCount;
    private int lastButtonId;
    public long lastNotificationChannelCreateTime;
    private int lastOnlineFromOtherDevice;
    private long lastSoundOutPlay;
    private long lastSoundPlay;
    private final LongSparseArray lastWearNotifiedMessageId;
    private String launcherClassName;
    private SpoilerEffect mediaSpoilerEffect;
    private Runnable notificationDelayRunnable;
    private PowerManager.WakeLock notificationDelayWakelock;
    private String notificationGroup;
    private int notificationId;
    private boolean notifyCheck;
    private long openedDialogId;
    private final HashSet<Long> openedInBubbleDialogs;
    private long openedTopicId;
    private int personalCount;
    public final ArrayList<MessageObject> popupMessages;
    public ArrayList<MessageObject> popupReplyMessages;
    private final LongSparseArray pushDialogs;
    private final LongSparseArray pushDialogsOverrideMention;
    private final ArrayList<MessageObject> pushMessages;
    private final LongSparseArray pushMessagesDict;
    public boolean showBadgeMessages;
    public boolean showBadgeMuted;
    public boolean showBadgeNumber;
    private final LongSparseArray smartNotificationsDialogs;
    private int soundIn;
    private boolean soundInLoaded;
    private int soundOut;
    private boolean soundOutLoaded;
    private SoundPool soundPool;
    private int soundRecord;
    private boolean soundRecordLoaded;
    char[] spoilerChars;
    private final ArrayList<StoryNotification> storyPushMessages;
    private final LongSparseArray storyPushMessagesDict;
    private int total_unread_count;
    private final LongSparseArray wearNotificationsIds;
    private static final DispatchQueue notificationsQueue = new DispatchQueue("notificationsQueue");
    public static long globalSecretChatId = DialogObject.makeEncryptedDialogId(1);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$47(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$48(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$49(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void processReadStories() {
    }

    static {
        notificationManager = null;
        systemNotificationManager = null;
        if (Build.VERSION.SDK_INT >= 26 && ApplicationLoader.applicationContext != null) {
            notificationManager = NotificationManagerCompat.from(ApplicationLoader.applicationContext);
            systemNotificationManager = (NotificationManager) ApplicationLoader.applicationContext.getSystemService("notification");
            checkOtherNotificationsChannel();
        }
        audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        Instance = new NotificationsController[4];
        lockObjects = new Object[4];
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
        sharedPrefCachedKeys = new LongSparseArray();
    }

    public static NotificationsController getInstance(int i) {
        NotificationsController notificationsController = Instance[i];
        if (notificationsController == null) {
            synchronized (lockObjects[i]) {
                try {
                    notificationsController = Instance[i];
                    if (notificationsController == null) {
                        NotificationsController[] notificationsControllerArr = Instance;
                        NotificationsController notificationsController2 = new NotificationsController(i);
                        notificationsControllerArr[i] = notificationsController2;
                        notificationsController = notificationsController2;
                    }
                } finally {
                }
            }
        }
        return notificationsController;
    }

    public NotificationsController(int i) {
        super(i);
        this.pushMessages = new ArrayList<>();
        this.delayedPushMessages = new ArrayList<>();
        this.pushMessagesDict = new LongSparseArray();
        this.fcmRandomMessagesDict = new LongSparseArray();
        this.smartNotificationsDialogs = new LongSparseArray();
        this.pushDialogs = new LongSparseArray();
        this.wearNotificationsIds = new LongSparseArray();
        this.lastWearNotifiedMessageId = new LongSparseArray();
        this.pushDialogsOverrideMention = new LongSparseArray();
        this.popupMessages = new ArrayList<>();
        this.popupReplyMessages = new ArrayList<>();
        this.openedInBubbleDialogs = new HashSet<>();
        this.storyPushMessages = new ArrayList<>();
        this.storyPushMessagesDict = new LongSparseArray();
        this.openedDialogId = 0L;
        this.openedTopicId = 0L;
        this.lastButtonId = 5000;
        this.total_unread_count = 0;
        this.personalCount = 0;
        this.notifyCheck = false;
        this.lastOnlineFromOtherDevice = 0;
        this.lastBadgeCount = -1;
        this.mediaSpoilerEffect = new SpoilerEffect();
        this.spoilerChars = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.checkStoryPushesRunnable = new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda66
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.checkStoryPushes();
            }
        };
        this.notificationId = this.currentAccount + 1;
        StringBuilder sb = new StringBuilder();
        sb.append("messages");
        int i2 = this.currentAccount;
        sb.append(i2 == 0 ? "" : Integer.valueOf(i2));
        this.notificationGroup = sb.toString();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        this.inChatSoundEnabled = notificationsSettings.getBoolean("EnableInChatSound", true);
        this.showBadgeNumber = notificationsSettings.getBoolean("badgeNumber", true);
        this.showBadgeMuted = notificationsSettings.getBoolean("badgeNumberMuted", false);
        this.showBadgeMessages = notificationsSettings.getBoolean("badgeNumberMessages", true);
        notificationManager = NotificationManagerCompat.from(ApplicationLoader.applicationContext);
        systemNotificationManager = (NotificationManager) ApplicationLoader.applicationContext.getSystemService("notification");
        try {
            audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            this.alarmManager = (AlarmManager) ApplicationLoader.applicationContext.getSystemService("alarm");
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.notificationDelayWakelock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        this.notificationDelayRunnable = new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda67
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$new$0();
            }
        };
        this.dialogsNotificationsFacade = new NotificationsSettingsFacade(this.currentAccount);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void checkOtherNotificationsChannel() {
        SharedPreferences sharedPreferences;
        NotificationChannel notificationChannel;
        int importance;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (OTHER_NOTIFICATIONS_CHANNEL == null) {
            sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0);
            OTHER_NOTIFICATIONS_CHANNEL = sharedPreferences.getString("OtherKey", "Other3");
        } else {
            sharedPreferences = null;
        }
        notificationChannel = systemNotificationManager.getNotificationChannel(OTHER_NOTIFICATIONS_CHANNEL);
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance == 0) {
                try {
                    systemNotificationManager.deleteNotificationChannel(OTHER_NOTIFICATIONS_CHANNEL);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                OTHER_NOTIFICATIONS_CHANNEL = null;
                notificationChannel = null;
            }
        }
        if (OTHER_NOTIFICATIONS_CHANNEL == null) {
            if (sharedPreferences == null) {
                sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0);
            }
            OTHER_NOTIFICATIONS_CHANNEL = "Other" + Utilities.random.nextLong();
            sharedPreferences.edit().putString("OtherKey", OTHER_NOTIFICATIONS_CHANNEL).commit();
        }
        if (notificationChannel == null) {
            SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
            NotificationChannel m = zzo$$ExternalSyntheticApiModelOutline2.m(OTHER_NOTIFICATIONS_CHANNEL, "Internal notifications", 3);
            m.enableLights(false);
            m.enableVibration(false);
            m.setSound(null, null);
            try {
                systemNotificationManager.createNotificationChannel(m);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
    }

    public static String getSharedPrefKey(long j, long j2) {
        return getSharedPrefKey(j, j2, false);
    }

    public static String getSharedPrefKey(long j, long j2, boolean z) {
        String valueOf;
        if (z) {
            return j2 != 0 ? String.format(Locale.US, "%d_%d", Long.valueOf(j), Long.valueOf(j2)) : String.valueOf(j);
        }
        long j3 = (j2 << 12) + j;
        LongSparseArray longSparseArray = sharedPrefCachedKeys;
        int indexOfKey = longSparseArray.indexOfKey(j3);
        if (indexOfKey >= 0) {
            return (String) longSparseArray.valueAt(indexOfKey);
        }
        if (j2 != 0) {
            valueOf = String.format(Locale.US, "%d_%d", Long.valueOf(j), Long.valueOf(j2));
        } else {
            valueOf = String.valueOf(j);
        }
        longSparseArray.put(j3, valueOf);
        return valueOf;
    }

    public void muteUntil(long j, long j2, int i) {
        long j3;
        if (j != 0) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            boolean z = j2 != 0;
            boolean isGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j, false, false);
            String sharedPrefKey = getSharedPrefKey(j, j2);
            if (i != Integer.MAX_VALUE) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 3);
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + sharedPrefKey, getConnectionsManager().getCurrentTime() + i);
                j3 = (((long) i) << 32) | 1;
            } else if (!isGlobalNotificationsEnabled && !z) {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                j3 = 0;
            } else {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 2);
                j3 = 1L;
            }
            edit.apply();
            if (j2 == 0) {
                getInstance(this.currentAccount).removeNotificationsForDialog(j);
                MessagesStorage.getInstance(this.currentAccount).setDialogFlags(j, j3);
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(j);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i != Integer.MAX_VALUE || isGlobalNotificationsEnabled) {
                        tL_peerNotifySettings.mute_until = i;
                    }
                }
            }
            getInstance(this.currentAccount).updateServerNotificationsSettings(j, j2);
        }
    }

    public void cleanup() {
        this.popupMessages.clear();
        this.popupReplyMessages.clear();
        this.channelGroupsCreated = false;
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$cleanup$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cleanup$1() {
        List notificationChannels;
        String id;
        this.openedDialogId = 0L;
        this.openedTopicId = 0L;
        this.total_unread_count = 0;
        this.personalCount = 0;
        this.pushMessages.clear();
        this.pushMessagesDict.clear();
        this.fcmRandomMessagesDict.clear();
        this.pushDialogs.clear();
        this.wearNotificationsIds.clear();
        this.lastWearNotifiedMessageId.clear();
        this.openedInBubbleDialogs.clear();
        this.delayedPushMessages.clear();
        this.notifyCheck = false;
        this.lastBadgeCount = 0;
        try {
            if (this.notificationDelayWakelock.isHeld()) {
                this.notificationDelayWakelock.release();
            }
        } catch (Exception e) {
            FileLog.e(e);
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
                notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i = 0; i < size; i++) {
                    id = NotificationsController$$ExternalSyntheticApiModelOutline13.m(notificationChannels.get(i)).getId();
                    if (id.startsWith(str)) {
                        try {
                            systemNotificationManager.deleteNotificationChannel(id);
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel cleanup " + id);
                        }
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public void setInChatSoundEnabled(boolean z) {
        this.inChatSoundEnabled = z;
    }

    public void setOpenedDialogId(final long j, final long j2) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$setOpenedDialogId$2(j, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpenedDialogId$2(long j, long j2) {
        this.openedDialogId = j;
        this.openedTopicId = j2;
    }

    public void setOpenedInBubble(final long j, final boolean z) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda59
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$setOpenedInBubble$3(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpenedInBubble$3(boolean z, long j) {
        if (z) {
            this.openedInBubbleDialogs.add(Long.valueOf(j));
        } else {
            this.openedInBubbleDialogs.remove(Long.valueOf(j));
        }
    }

    public void setLastOnlineFromOtherDevice(final int i) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda55
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$setLastOnlineFromOtherDevice$4(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLastOnlineFromOtherDevice$4(int i) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set last online from other device = " + i);
        }
        this.lastOnlineFromOtherDevice = i;
    }

    public void removeNotificationsForDialog(long j) {
        processReadMessages(null, j, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j, 0);
        processDialogsUpdateRead(longSparseIntArray);
    }

    public boolean hasMessagesToReply() {
        for (int i = 0; i < this.pushMessages.size(); i++) {
            MessageObject messageObject = this.pushMessages.get(i);
            long dialogId = messageObject.getDialogId();
            if (!messageObject.isReactionPush) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !DialogObject.isEncryptedDialog(dialogId) && ((messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) && dialogId != UserObject.VERIFY)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void forceShowPopupForReply() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda75
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$forceShowPopupForReply$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forceShowPopupForReply$6() {
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.pushMessages.size(); i++) {
            MessageObject messageObject = this.pushMessages.get(i);
            long dialogId = messageObject.getDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !DialogObject.isEncryptedDialog(dialogId) && (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup())) {
                arrayList.add(0, messageObject);
            }
        }
        if (arrayList.isEmpty() || AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$forceShowPopupForReply$5(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forceShowPopupForReply$5(ArrayList arrayList) {
        this.popupReplyMessages = arrayList;
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupNotificationActivity.class);
        intent.putExtra("force", true);
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setFlags(268763140);
        ApplicationLoader.applicationContext.startActivity(intent);
        ApplicationLoader.applicationContext.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public void removeDeletedMessagesFromNotifications(final LongSparseArray longSparseArray, final boolean z) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda71
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$removeDeletedMessagesFromNotifications$9(longSparseArray, z, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedMessagesFromNotifications$9(LongSparseArray longSparseArray, boolean z, final ArrayList arrayList) {
        long j;
        Integer num;
        LongSparseArray longSparseArray2 = longSparseArray;
        int i = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        int i2 = 0;
        while (i2 < longSparseArray.size()) {
            long keyAt = longSparseArray2.keyAt(i2);
            SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(keyAt);
            if (sparseArray != null) {
                ArrayList arrayList2 = (ArrayList) longSparseArray2.get(keyAt);
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    int intValue = ((Integer) arrayList2.get(i3)).intValue();
                    MessageObject messageObject = (MessageObject) sparseArray.get(intValue);
                    if (messageObject == null || messageObject.isStoryReactionPush || (z && !messageObject.isReactionPush)) {
                        j = keyAt;
                    } else {
                        j = keyAt;
                        long dialogId = messageObject.getDialogId();
                        Integer num2 = (Integer) this.pushDialogs.get(dialogId);
                        if (num2 == null) {
                            num2 = 0;
                        }
                        int intValue2 = num2.intValue() - 1;
                        Integer valueOf = Integer.valueOf(intValue2);
                        if (intValue2 <= 0) {
                            this.smartNotificationsDialogs.remove(dialogId);
                            num = 0;
                        } else {
                            num = valueOf;
                        }
                        if (!num.equals(num2)) {
                            if (getMessagesController().isForum(dialogId)) {
                                int i4 = this.total_unread_count - (num2.intValue() > 0 ? 1 : 0);
                                this.total_unread_count = i4;
                                this.total_unread_count = i4 + (num.intValue() > 0 ? 1 : 0);
                            } else {
                                int intValue3 = this.total_unread_count - num2.intValue();
                                this.total_unread_count = intValue3;
                                this.total_unread_count = intValue3 + num.intValue();
                            }
                            this.pushDialogs.put(dialogId, num);
                        }
                        if (num.intValue() == 0) {
                            this.pushDialogs.remove(dialogId);
                            this.pushDialogsOverrideMention.remove(dialogId);
                        }
                        sparseArray.remove(intValue);
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(messageObject);
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                    }
                    i3++;
                    keyAt = j;
                }
                long j2 = keyAt;
                if (sparseArray.size() == 0) {
                    this.pushMessagesDict.remove(j2);
                }
            }
            i2++;
            longSparseArray2 = longSparseArray;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda44
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$removeDeletedMessagesFromNotifications$7(arrayList);
                }
            });
        }
        if (i != this.total_unread_count) {
            if (!this.notifyCheck) {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            }
            final int size2 = this.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda45
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$removeDeletedMessagesFromNotifications$8(size2);
                }
            });
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedMessagesFromNotifications$7(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedMessagesFromNotifications$8(int i) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void removeDeletedHisoryFromNotifications(final LongSparseIntArray longSparseIntArray) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$removeDeletedHisoryFromNotifications$12(longSparseIntArray, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedHisoryFromNotifications$12(LongSparseIntArray longSparseIntArray, final ArrayList arrayList) {
        Integer num;
        int i = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        Integer num2 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= longSparseIntArray.size()) {
                break;
            }
            long keyAt = longSparseIntArray.keyAt(i2);
            long j = -keyAt;
            long j2 = longSparseIntArray.get(keyAt);
            Integer num3 = (Integer) this.pushDialogs.get(j);
            if (num3 == null) {
                num3 = num2;
            }
            Integer num4 = num3;
            int i3 = 0;
            while (i3 < this.pushMessages.size()) {
                MessageObject messageObject = this.pushMessages.get(i3);
                if (messageObject.getDialogId() == j) {
                    num = num2;
                    if (messageObject.getId() <= j2) {
                        SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(j);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                            if (sparseArray.size() == 0) {
                                this.pushMessagesDict.remove(j);
                            }
                        }
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(messageObject);
                        i3--;
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                        num4 = Integer.valueOf(num4.intValue() - 1);
                    }
                } else {
                    num = num2;
                }
                i3++;
                num2 = num;
            }
            Integer num5 = num2;
            if (num4.intValue() <= 0) {
                this.smartNotificationsDialogs.remove(j);
                num4 = num5;
            }
            if (!num4.equals(num3)) {
                if (getMessagesController().isForum(j)) {
                    int i4 = this.total_unread_count - (num3.intValue() > 0 ? 1 : 0);
                    this.total_unread_count = i4;
                    this.total_unread_count = i4 + (num4.intValue() <= 0 ? 0 : 1);
                } else {
                    int intValue = this.total_unread_count - num3.intValue();
                    this.total_unread_count = intValue;
                    this.total_unread_count = intValue + num4.intValue();
                }
                this.pushDialogs.put(j, num4);
            }
            if (num4.intValue() == 0) {
                this.pushDialogs.remove(j);
                this.pushDialogsOverrideMention.remove(j);
            }
            i2++;
            num2 = num5;
        }
        if (arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$removeDeletedHisoryFromNotifications$10(arrayList);
                }
            });
        }
        if (i != this.total_unread_count) {
            if (!this.notifyCheck) {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            }
            final int size = this.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda32
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$removeDeletedHisoryFromNotifications$11(size);
                }
            });
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedHisoryFromNotifications$10(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeDeletedHisoryFromNotifications$11(int i) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void processSeenStoryReactions(long j, final int i) {
        if (j != getUserConfig().getClientUserId()) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda49
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processSeenStoryReactions$13(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSeenStoryReactions$13(int i) {
        int i2 = 0;
        boolean z = false;
        while (i2 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i2);
            if (messageObject.isStoryReactionPush && Math.abs(messageObject.getId()) == i) {
                this.pushMessages.remove(i2);
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.remove(messageObject.getDialogId());
                }
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(messageObject.getId()));
                getMessagesStorage().deletePushMessages(messageObject.getDialogId(), arrayList);
                i2--;
                z = true;
            }
            i2++;
        }
        if (z) {
            showOrUpdateNotification(false);
        }
    }

    public void processDeleteStory(final long j, final int i) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processDeleteStory$14(j, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDeleteStory$14(long j, int i) {
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            storyNotification.dateByIds.remove(Integer.valueOf(i));
            if (storyNotification.dateByIds.isEmpty()) {
                this.storyPushMessagesDict.remove(j);
                this.storyPushMessages.remove(storyNotification);
                getMessagesStorage().deleteStoryPushMessage(j);
                showOrUpdateNotification(false);
                return;
            }
            getMessagesStorage().putStoryPushMessage(storyNotification);
        }
    }

    public void processReadStories(final long j, int i) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda62
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processReadStories$15(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processReadStories$15(long j) {
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            this.storyPushMessagesDict.remove(j);
            this.storyPushMessages.remove(storyNotification);
            getMessagesStorage().deleteStoryPushMessage(j);
            showOrUpdateNotification(false);
            updateStoryPushesRunnable();
        }
    }

    public void processIgnoreStories() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda57
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processIgnoreStories$16();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIgnoreStories$16() {
        boolean isEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.clear();
        getMessagesStorage().deleteAllStoryPushMessages();
        if (isEmpty) {
            return;
        }
        showOrUpdateNotification(false);
    }

    public void processIgnoreStoryReactions() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processIgnoreStoryReactions$17();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIgnoreStoryReactions$17() {
        int i = 0;
        boolean z = false;
        while (i < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i);
            if (messageObject != null && messageObject.isStoryReactionPush) {
                this.pushMessages.remove(i);
                i--;
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i++;
        }
        getMessagesStorage().deleteAllStoryReactionPushMessages();
        if (z) {
            showOrUpdateNotification(false);
        }
    }

    public void processIgnoreStories(final long j) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processIgnoreStories$18(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIgnoreStories$18(long j) {
        boolean isEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.clear();
        getMessagesStorage().deleteStoryPushMessage(j);
        if (isEmpty) {
            return;
        }
        showOrUpdateNotification(false);
    }

    public void processReadMessages(final LongSparseIntArray longSparseIntArray, final long j, final int i, final int i2, final boolean z) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda70
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processReadMessages$20(longSparseIntArray, arrayList, j, i2, i, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processReadMessages$20(LongSparseIntArray longSparseIntArray, final ArrayList arrayList, long j, int i, int i2, boolean z) {
        long j2;
        long j3;
        long j4 = 0;
        if (longSparseIntArray != null) {
            int i3 = 0;
            while (i3 < longSparseIntArray.size()) {
                long keyAt = longSparseIntArray.keyAt(i3);
                int i4 = longSparseIntArray.get(keyAt);
                int i5 = 0;
                while (i5 < this.pushMessages.size()) {
                    MessageObject messageObject = this.pushMessages.get(i5);
                    if (!messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == keyAt && messageObject.getId() <= i4 && !messageObject.isStoryReactionPush) {
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                        if (messageObject.isStoryReactionPush) {
                            j3 = messageObject.getDialogId();
                        } else {
                            long j5 = messageObject.messageOwner.peer_id.channel_id;
                            j3 = j5 != j4 ? -j5 : j4;
                        }
                        SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(j3);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                            if (sparseArray.size() == 0) {
                                this.pushMessagesDict.remove(j3);
                            }
                        }
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(i5);
                        i5--;
                    }
                    i5++;
                    j4 = 0;
                }
                i3++;
                j4 = 0;
            }
        }
        if (j != j4 && (i != 0 || i2 != 0)) {
            int i6 = 0;
            while (i6 < this.pushMessages.size()) {
                MessageObject messageObject2 = this.pushMessages.get(i6);
                if (messageObject2.getDialogId() == j && !messageObject2.isStoryReactionPush && (i2 == 0 ? z ? messageObject2.getId() == i || i < 0 : messageObject2.getId() <= i || i < 0 : messageObject2.messageOwner.date <= i2)) {
                    if (isPersonalMessage(messageObject2)) {
                        this.personalCount--;
                    }
                    if (messageObject2.isStoryReactionPush) {
                        j2 = messageObject2.getDialogId();
                    } else {
                        long j6 = messageObject2.messageOwner.peer_id.channel_id;
                        j2 = j6 != 0 ? -j6 : 0L;
                    }
                    SparseArray sparseArray2 = (SparseArray) this.pushMessagesDict.get(j2);
                    if (sparseArray2 != null) {
                        sparseArray2.remove(messageObject2.getId());
                        if (sparseArray2.size() == 0) {
                            this.pushMessagesDict.remove(j2);
                        }
                    }
                    this.pushMessages.remove(i6);
                    this.delayedPushMessages.remove(messageObject2);
                    arrayList.add(messageObject2);
                    i6--;
                }
                i6++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda65
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processReadMessages$19(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processReadMessages$19(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        if (r0 == 2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int addToPopupMessages(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j, boolean z, SharedPreferences sharedPreferences) {
        int i;
        if (messageObject.isStoryReactionPush) {
            return 0;
        }
        if (!DialogObject.isEncryptedDialog(j)) {
            if (sharedPreferences.getBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + j, false)) {
                i = sharedPreferences.getInt("popup_" + j, 0);
            } else {
                i = 0;
            }
            if (i == 0) {
                if (z) {
                    i = sharedPreferences.getInt("popupChannel", 0);
                } else {
                    i = sharedPreferences.getInt(DialogObject.isChatDialog(j) ? "popupGroup" : "popupAll", 0);
                }
            } else if (i == 1) {
                i = 3;
            }
            if (i != 0 && messageObject.messageOwner.peer_id.channel_id != 0 && !messageObject.isSupergroup()) {
                i = 0;
            }
            if (i != 0) {
                arrayList.add(0, messageObject);
            }
            return i;
        }
        i = 0;
        if (i != 0) {
            i = 0;
        }
        if (i != 0) {
        }
        return i;
    }

    public void processEditedMessages(final LongSparseArray longSparseArray) {
        TLRPC.Message message;
        if (longSparseArray == null || longSparseArray.size() == 0) {
            return;
        }
        for (int i = 0; i < longSparseArray.size(); i++) {
            ArrayList arrayList = (ArrayList) longSparseArray.valueAt(i);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i2);
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda76
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processEditedMessages$21(longSparseArray);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processEditedMessages$21(LongSparseArray longSparseArray) {
        long j;
        int size = longSparseArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            longSparseArray.keyAt(i);
            ArrayList arrayList = (ArrayList) longSparseArray.valueAt(i);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                if (messageObject.isStoryReactionPush) {
                    j = messageObject.getDialogId();
                } else {
                    long j2 = messageObject.messageOwner.peer_id.channel_id;
                    j = j2 != 0 ? -j2 : 0L;
                }
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(j);
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
                    z = true;
                }
            }
        }
        if (z) {
            showOrUpdateNotification(false);
        }
    }

    public void processNewMessages(final ArrayList<MessageObject> arrayList, final boolean z, final boolean z2, final CountDownLatch countDownLatch) {
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationsController: processNewMessages msgs.size()=");
            sb.append(arrayList == null ? "null" : Integer.valueOf(arrayList.size()));
            sb.append(" isLast=");
            sb.append(z);
            sb.append(" isFcm=");
            sb.append(z2);
            sb.append(")");
            FileLog.d(sb.toString());
        }
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                MessageObject messageObject = arrayList.get(i);
                if (messageObject != null && messageObject.messageOwner != null && !messageObject.isOutOwner()) {
                    TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - messageObject.messageOwner.date < getMessagesController().callRingTimeout / 1000) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(messageObject.getDialogId()));
                            Iterator<TLRPC.Peer> it = tL_messageActionConferenceCall.other_participants.iterator();
                            while (it.hasNext()) {
                                hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(it.next())));
                            }
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                long longValue = ((Long) it2.next()).longValue();
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(DialogObject.getShortName(this.currentAccount, longValue));
                            }
                            VoIPGroupNotification.request(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getDialogId(), sb2.toString(), tL_messageActionConferenceCall.call_id, messageObject.getId(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i);
                            i--;
                        } else {
                            VoIPGroupNotification.hide(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getId());
                        }
                    }
                }
                i++;
            }
        }
        if (!arrayList.isEmpty()) {
            final ArrayList arrayList2 = new ArrayList(0);
            notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda69
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$processNewMessages$25(arrayList, arrayList2, z2, z, countDownLatch);
                }
            });
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processNewMessages$25(ArrayList arrayList, final ArrayList arrayList2, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean z3;
        int i;
        int i2;
        Integer num;
        boolean z4;
        long j;
        boolean z5;
        long j2;
        long j3;
        LongSparseArray longSparseArray;
        int i3;
        boolean z6;
        MessageObject messageObject;
        long j4;
        long j5;
        long j6;
        LongSparseArray longSparseArray2;
        SparseArray sparseArray;
        long j7;
        long j8;
        boolean z7;
        long j9;
        SparseArray sparseArray2;
        long j10;
        MessageObject messageObject2;
        ArrayList arrayList3 = arrayList;
        LongSparseArray longSparseArray3 = new LongSparseArray();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        boolean z8 = notificationsSettings.getBoolean("PinnedMessages", true);
        int i4 = 0;
        int i5 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (i5 < arrayList.size()) {
            MessageObject messageObject3 = (MessageObject) arrayList3.get(i5);
            if (messageObject3.messageOwner != null) {
                if (!messageObject3.isImportedForward()) {
                    TLRPC.Message message = messageObject3.messageOwner;
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
                longSparseArray = longSparseArray3;
                z4 = z8;
                i3 = i5;
                z6 = z9;
                z9 = z6;
                longSparseArray2 = longSparseArray;
                i5 = i3 + 1;
                arrayList3 = arrayList;
                longSparseArray3 = longSparseArray2;
                z8 = z4;
            }
            if (!MessageObject.isTopicActionMessage(messageObject3)) {
                if (messageObject3.isStoryPush) {
                    long currentTimeMillis = messageObject3.messageOwner == null ? System.currentTimeMillis() : r0.date * 1000;
                    long dialogId = messageObject3.getDialogId();
                    int id = messageObject3.getId();
                    StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.get(dialogId);
                    if (storyNotification != null) {
                        storyNotification.dateByIds.put(Integer.valueOf(id), new Pair<>(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z13 = storyNotification.hidden;
                        boolean z14 = messageObject3.isStoryPushHidden;
                        if (z13 != z14) {
                            storyNotification.hidden = z14;
                            z12 = true;
                        }
                        storyNotification.date = storyNotification.getLeastDate();
                        getMessagesStorage().putStoryPushMessage(storyNotification);
                        z10 = true;
                    } else {
                        StoryNotification storyNotification2 = new StoryNotification(dialogId, messageObject3.localName, id, currentTimeMillis);
                        storyNotification2.hidden = messageObject3.isStoryPushHidden;
                        this.storyPushMessages.add(storyNotification2);
                        this.storyPushMessagesDict.put(dialogId, storyNotification2);
                        getMessagesStorage().putStoryPushMessage(storyNotification2);
                        z9 = true;
                        z12 = true;
                    }
                    Collections.sort(this.storyPushMessages, Comparator$-CC.comparingLong(new ToLongFunction() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda25
                        @Override // java.util.function.ToLongFunction
                        public final long applyAsLong(Object obj) {
                            long j11;
                            j11 = ((NotificationsController.StoryNotification) obj).date;
                            return j11;
                        }
                    }));
                    longSparseArray2 = longSparseArray3;
                    z4 = z8;
                    i3 = i5;
                } else {
                    int id2 = messageObject3.getId();
                    if (messageObject3.isFcmMessage()) {
                        j = messageObject3.messageOwner.random_id;
                        z4 = z8;
                    } else {
                        z4 = z8;
                        j = 0;
                    }
                    long dialogId2 = messageObject3.getDialogId();
                    if (messageObject3.isFcmMessage()) {
                        z5 = messageObject3.localChannel;
                    } else {
                        if (DialogObject.isChatDialog(dialogId2)) {
                            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-dialogId2));
                            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                                z5 = true;
                            }
                        }
                        z5 = false;
                    }
                    if (messageObject3.isStoryReactionPush) {
                        long j11 = j;
                        j3 = messageObject3.getDialogId();
                        j2 = j11;
                    } else {
                        j2 = j;
                        long j12 = messageObject3.messageOwner.peer_id.channel_id;
                        j3 = j12 != 0 ? -j12 : 0L;
                    }
                    SparseArray sparseArray3 = (SparseArray) this.pushMessagesDict.get(j3);
                    MessageObject messageObject4 = sparseArray3 != null ? (MessageObject) sparseArray3.get(id2) : null;
                    MessageObject messageObject5 = messageObject4;
                    if (messageObject4 == null) {
                        i3 = i5;
                        z6 = z9;
                        long j13 = messageObject3.messageOwner.random_id;
                        if (j13 != 0) {
                            messageObject = (MessageObject) this.fcmRandomMessagesDict.get(j13);
                            if (messageObject != null) {
                                longSparseArray = longSparseArray3;
                                this.fcmRandomMessagesDict.remove(messageObject3.messageOwner.random_id);
                            } else {
                                longSparseArray = longSparseArray3;
                            }
                            if (messageObject == null) {
                                if (messageObject.isFcmMessage()) {
                                    if (sparseArray3 == null) {
                                        sparseArray3 = new SparseArray();
                                        this.pushMessagesDict.put(j3, sparseArray3);
                                    }
                                    sparseArray3.put(id2, messageObject3);
                                    int indexOf = this.pushMessages.indexOf(messageObject);
                                    if (indexOf >= 0) {
                                        this.pushMessages.set(indexOf, messageObject3);
                                        j10 = j3;
                                        messageObject2 = messageObject3;
                                        i4 = addToPopupMessages(arrayList2, messageObject3, dialogId2, z5, notificationsSettings);
                                    } else {
                                        j10 = j3;
                                        messageObject2 = messageObject3;
                                    }
                                    if (z) {
                                        boolean z15 = messageObject2.localEdit;
                                        if (z15) {
                                            getMessagesStorage().putPushMessage(messageObject2);
                                        }
                                        z10 = z15;
                                    }
                                } else {
                                    j10 = j3;
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + j10 + ", mid=" + id2);
                                }
                            } else {
                                long j14 = j3;
                                if (z10) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("skipped message because edited");
                                    }
                                } else {
                                    if (z) {
                                        getMessagesStorage().putPushMessage(messageObject3);
                                    }
                                    long topicId = MessageObject.getTopicId(this.currentAccount, messageObject3.messageOwner, getMessagesController().isForum(messageObject3));
                                    if (dialogId2 == this.openedDialogId && ApplicationLoader.isScreenOn && !messageObject3.isStoryReactionPush) {
                                        if (!z) {
                                            playInChatSound();
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("skipped message because chat is already opened (openedDialogId = " + this.openedDialogId + ")");
                                        }
                                    } else {
                                        TLRPC.Message message2 = messageObject3.messageOwner;
                                        if (!message2.mentioned) {
                                            j4 = dialogId2;
                                        } else if (!z4 && (message2.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("skipped message because message is mention of pinned");
                                            }
                                        } else {
                                            j4 = messageObject3.getFromChatId();
                                        }
                                        if (isPersonalMessage(messageObject3)) {
                                            this.personalCount++;
                                        }
                                        DialogObject.isChatDialog(j4);
                                        LongSparseArray longSparseArray4 = longSparseArray;
                                        int indexOfKey = longSparseArray4.indexOfKey(j4);
                                        int i6 = i4;
                                        if (indexOfKey >= 0 && topicId == 0) {
                                            z7 = ((Boolean) longSparseArray4.valueAt(indexOfKey)).booleanValue();
                                            j7 = j14;
                                            j5 = dialogId2;
                                            j6 = j2;
                                            longSparseArray2 = longSparseArray4;
                                            sparseArray = sparseArray3;
                                            j8 = j4;
                                        } else {
                                            j5 = dialogId2;
                                            j6 = j2;
                                            longSparseArray2 = longSparseArray4;
                                            long j15 = j4;
                                            sparseArray = sparseArray3;
                                            boolean z16 = z5;
                                            j7 = j14;
                                            int notifyOverride = getNotifyOverride(notificationsSettings, j4, topicId);
                                            if (notifyOverride == -1) {
                                                z7 = isGlobalNotificationsEnabled(j15, Boolean.valueOf(z16), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                                if (BuildVars.LOGS_ENABLED) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                    j8 = j15;
                                                    sb.append(j8);
                                                    sb.append(", ");
                                                    z5 = z16;
                                                    sb.append(z5);
                                                    sb.append(", ");
                                                    sb.append(messageObject3.isReactionPush);
                                                    sb.append(", ");
                                                    sb.append(messageObject3.isStoryReactionPush);
                                                    sb.append(") = ");
                                                    sb.append(z7);
                                                    FileLog.d(sb.toString());
                                                } else {
                                                    z5 = z16;
                                                    j8 = j15;
                                                }
                                            } else {
                                                z5 = z16;
                                                j8 = j15;
                                                z7 = notifyOverride != 2;
                                            }
                                            longSparseArray2.put(j8, Boolean.valueOf(z7));
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("NotificationsController: process new messages, value is " + z7 + " (" + j8 + ", " + z5 + ", " + messageObject3.isReactionPush + ", " + messageObject3.isStoryReactionPush + ")");
                                        }
                                        if (z7) {
                                            if (z) {
                                                j9 = j8;
                                                i4 = i6;
                                            } else {
                                                j9 = j8;
                                                i4 = addToPopupMessages(arrayList2, messageObject3, j8, z5, notificationsSettings);
                                            }
                                            if (!z11) {
                                                z11 = messageObject3.messageOwner.from_scheduled;
                                            }
                                            this.delayedPushMessages.add(messageObject3);
                                            appendMessage(messageObject3);
                                            if (id2 != 0) {
                                                if (sparseArray == null) {
                                                    sparseArray2 = new SparseArray();
                                                    this.pushMessagesDict.put(j7, sparseArray2);
                                                } else {
                                                    sparseArray2 = sparseArray;
                                                }
                                                sparseArray2.put(id2, messageObject3);
                                            } else {
                                                long j16 = j6;
                                                if (j16 != 0) {
                                                    this.fcmRandomMessagesDict.put(j16, messageObject3);
                                                }
                                            }
                                            if (j5 != j9) {
                                                long j17 = j5;
                                                Integer num2 = (Integer) this.pushDialogsOverrideMention.get(j17);
                                                this.pushDialogsOverrideMention.put(j17, Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1));
                                            }
                                        } else {
                                            j9 = j8;
                                            i4 = i6;
                                        }
                                        if (messageObject3.isReactionPush) {
                                            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                            sparseBooleanArray.put(id2, true);
                                            getMessagesController().checkUnreadReactions(j9, topicId, sparseBooleanArray);
                                        }
                                        z9 = true;
                                    }
                                }
                            }
                            z9 = z6;
                            longSparseArray2 = longSparseArray;
                        } else {
                            longSparseArray = longSparseArray3;
                        }
                    } else {
                        longSparseArray = longSparseArray3;
                        i3 = i5;
                        z6 = z9;
                    }
                    messageObject = messageObject5;
                    if (messageObject == null) {
                    }
                    z9 = z6;
                    longSparseArray2 = longSparseArray;
                }
                i5 = i3 + 1;
                arrayList3 = arrayList;
                longSparseArray3 = longSparseArray2;
                z8 = z4;
            }
            if (BuildVars.LOGS_ENABLED) {
            }
            longSparseArray = longSparseArray3;
            z4 = z8;
            i3 = i5;
            z6 = z9;
            z9 = z6;
            longSparseArray2 = longSparseArray;
            i5 = i3 + 1;
            arrayList3 = arrayList;
            longSparseArray3 = longSparseArray2;
            z8 = z4;
        }
        final int i7 = i4;
        boolean z17 = z9;
        if (z17) {
            this.notifyCheck = z2;
        }
        if (!arrayList2.isEmpty() && !AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$processNewMessages$23(arrayList2, i7);
                }
            });
        }
        if (z || z11) {
            if (z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + this.notifyCheck);
                }
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else if (z17) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: added branch");
                }
                MessageObject messageObject6 = (MessageObject) arrayList.get(0);
                long dialogId3 = messageObject6.getDialogId();
                long topicId2 = MessageObject.getTopicId(this.currentAccount, messageObject6.messageOwner, getMessagesController().isForum(dialogId3));
                Boolean valueOf = messageObject6.isFcmMessage() ? Boolean.valueOf(messageObject6.localChannel) : null;
                int i8 = this.total_unread_count;
                int notifyOverride2 = getNotifyOverride(notificationsSettings, dialogId3, topicId2);
                if (notifyOverride2 == -1) {
                    z3 = isGlobalNotificationsEnabled(dialogId3, valueOf, messageObject6.isReactionPush, messageObject6.isStoryReactionPush);
                } else {
                    z3 = notifyOverride2 != 2;
                }
                Integer num3 = (Integer) this.pushDialogs.get(dialogId3);
                if (num3 != null) {
                    i = 1;
                    i2 = num3.intValue() + 1;
                } else {
                    i = 1;
                    i2 = 1;
                }
                if (this.notifyCheck && !z3 && (num = (Integer) this.pushDialogsOverrideMention.get(dialogId3)) != null && num.intValue() != 0) {
                    i2 = num.intValue();
                    z3 = true;
                }
                if (z3 && !messageObject6.isStoryPush) {
                    if (getMessagesController().isForum(dialogId3)) {
                        int i9 = this.total_unread_count - ((num3 == null || num3.intValue() <= 0) ? 0 : 1);
                        this.total_unread_count = i9;
                        if (i2 <= 0) {
                            i = 0;
                        }
                        this.total_unread_count = i9 + i;
                    } else {
                        if (num3 != null) {
                            this.total_unread_count -= num3.intValue();
                        }
                        this.total_unread_count += i2;
                    }
                    this.pushDialogs.put(dialogId3, Integer.valueOf(i2));
                }
                if (i8 != this.total_unread_count || z12) {
                    this.delayedPushMessages.clear();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("NotificationsController processNewMessages: added branch: " + this.notifyCheck);
                    }
                    showOrUpdateNotification(this.notifyCheck);
                    final int size = this.pushDialogs.size();
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda27
                        @Override // java.lang.Runnable
                        public final void run() {
                            NotificationsController.this.lambda$processNewMessages$24(size);
                        }
                    });
                }
                this.notifyCheck = false;
                if (this.showBadgeNumber) {
                    setBadge(getTotalAllUnreadCount());
                }
            }
        }
        if (z12) {
            updateStoryPushesRunnable();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processNewMessages$23(ArrayList arrayList, int i) {
        this.popupMessages.addAll(0, arrayList);
        if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
            if (i == 3 || ((i == 1 && ApplicationLoader.isScreenOn) || (i == 2 && !ApplicationLoader.isScreenOn))) {
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
    public /* synthetic */ void lambda$processNewMessages$24(int i) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    private void appendMessage(MessageObject messageObject) {
        for (int i = 0; i < this.pushMessages.size(); i++) {
            if (this.pushMessages.get(i).getId() == messageObject.getId() && this.pushMessages.get(i).getDialogId() == messageObject.getDialogId() && this.pushMessages.get(i).isStoryPush == messageObject.isStoryPush) {
                return;
            }
        }
        this.pushMessages.add(0, messageObject);
    }

    public int getTotalUnreadCount() {
        return this.total_unread_count;
    }

    public void processDialogsUpdateRead(final LongSparseIntArray longSparseIntArray) {
        final ArrayList arrayList = new ArrayList();
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda50
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processDialogsUpdateRead$28(longSparseIntArray, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processDialogsUpdateRead$28(LongSparseIntArray longSparseIntArray, final ArrayList arrayList) {
        int i;
        boolean z;
        boolean z2;
        Integer num;
        int i2 = this.total_unread_count;
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        int i3 = 0;
        while (true) {
            if (i3 >= longSparseIntArray.size()) {
                break;
            }
            long keyAt = longSparseIntArray.keyAt(i3);
            Integer num2 = (Integer) this.pushDialogs.get(keyAt);
            int i4 = longSparseIntArray.get(keyAt);
            if (DialogObject.isChatDialog(keyAt)) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat == null || chat.min || ChatObject.isNotInChat(chat)) {
                    i4 = 0;
                }
                if (chat != null) {
                    z = chat.forum;
                    i = i4;
                    if (!z) {
                        int notifyOverride = getNotifyOverride(notificationsSettings, keyAt, 0L);
                        if (notifyOverride == -1) {
                            z2 = isGlobalNotificationsEnabled(keyAt, false, false);
                        } else if (notifyOverride == 2) {
                            z2 = false;
                        }
                        if (this.notifyCheck && !z2 && (num = (Integer) this.pushDialogsOverrideMention.get(keyAt)) != null && num.intValue() != 0) {
                            i = num.intValue();
                            z2 = true;
                        }
                        if (i == 0) {
                            this.smartNotificationsDialogs.remove(keyAt);
                        }
                        if (i < 0) {
                            if (num2 == null) {
                                i3++;
                            } else {
                                i = num2.intValue() + i;
                            }
                        }
                        if ((!z2 || i == 0) && num2 != null) {
                            if (getMessagesController().isForum(keyAt)) {
                                this.total_unread_count -= num2.intValue() > 0 ? 1 : 0;
                            } else {
                                this.total_unread_count -= num2.intValue();
                            }
                        }
                        if (i == 0) {
                            this.pushDialogs.remove(keyAt);
                            this.pushDialogsOverrideMention.remove(keyAt);
                            int i5 = 0;
                            while (i5 < this.pushMessages.size()) {
                                MessageObject messageObject = this.pushMessages.get(i5);
                                if (!messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == keyAt && !messageObject.isStoryReactionPush) {
                                    if (isPersonalMessage(messageObject)) {
                                        this.personalCount--;
                                    }
                                    this.pushMessages.remove(i5);
                                    i5--;
                                    this.delayedPushMessages.remove(messageObject);
                                    long j = messageObject.messageOwner.peer_id.channel_id;
                                    long j2 = j != 0 ? -j : 0L;
                                    SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(j2);
                                    if (sparseArray != null) {
                                        sparseArray.remove(messageObject.getId());
                                        if (sparseArray.size() == 0) {
                                            this.pushMessagesDict.remove(j2);
                                        }
                                    }
                                    arrayList.add(messageObject);
                                }
                                i5++;
                            }
                        } else if (z2) {
                            if (getMessagesController().isForum(keyAt)) {
                                this.total_unread_count += i <= 0 ? 0 : 1;
                            } else {
                                this.total_unread_count += i;
                            }
                            this.pushDialogs.put(keyAt, Integer.valueOf(i));
                        }
                        i3++;
                    }
                    z2 = true;
                    if (this.notifyCheck) {
                        i = num.intValue();
                        z2 = true;
                    }
                    if (i == 0) {
                    }
                    if (i < 0) {
                    }
                    if (!z2) {
                    }
                    if (getMessagesController().isForum(keyAt)) {
                    }
                    if (i == 0) {
                    }
                    i3++;
                }
            }
            i = i4;
            z = false;
            if (!z) {
            }
            z2 = true;
            if (this.notifyCheck) {
            }
            if (i == 0) {
            }
            if (i < 0) {
            }
            if (!z2) {
            }
            if (getMessagesController().isForum(keyAt)) {
            }
            if (i == 0) {
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$processDialogsUpdateRead$26(arrayList);
                }
            });
        }
        if (i2 != this.total_unread_count) {
            if (!this.notifyCheck) {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            }
            final int size = this.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda52
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$processDialogsUpdateRead$27(size);
                }
            });
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDialogsUpdateRead$26(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDialogsUpdateRead$27(int i) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void processLoadedUnreadMessages(final LongSparseArray longSparseArray, final ArrayList<TLRPC.Message> arrayList, final ArrayList<MessageObject> arrayList2, ArrayList<TLRPC.User> arrayList3, ArrayList<TLRPC.Chat> arrayList4, ArrayList<TLRPC.EncryptedChat> arrayList5, final Collection<StoryNotification> collection) {
        getMessagesController().putUsers(arrayList3, true);
        getMessagesController().putChats(arrayList4, true);
        getMessagesController().putEncryptedChats(arrayList5, true);
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processLoadedUnreadMessages$31(arrayList, longSparseArray, arrayList2, collection);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedUnreadMessages$31(ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, Collection collection) {
        long j;
        long j2;
        boolean z;
        LongSparseArray longSparseArray2;
        long j3;
        boolean z2;
        boolean z3;
        TLRPC.MessageFwdHeader messageFwdHeader;
        SharedPreferences sharedPreferences;
        MessageObject messageObject;
        SparseArray sparseArray;
        long j4;
        long j5;
        int i;
        TLRPC.Message message;
        boolean z4;
        SparseArray sparseArray2;
        ArrayList arrayList3 = arrayList;
        this.pushDialogs.clear();
        this.pushMessages.clear();
        this.pushMessagesDict.clear();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.clear();
        boolean z5 = false;
        this.total_unread_count = 0;
        this.personalCount = 0;
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        LongSparseArray longSparseArray3 = new LongSparseArray();
        long j6 = 0;
        if (arrayList3 != null) {
            int i2 = 0;
            while (i2 < arrayList.size()) {
                TLRPC.Message message2 = (TLRPC.Message) arrayList3.get(i2);
                if (message2 != null && ((messageFwdHeader = message2.fwd_from) == null || !messageFwdHeader.imported)) {
                    TLRPC.MessageAction messageAction = message2.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message2.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                        long j7 = message2.peer_id.channel_id;
                        long j8 = j7 != j6 ? -j7 : j6;
                        SparseArray sparseArray3 = (SparseArray) this.pushMessagesDict.get(j8);
                        if (sparseArray3 == null || sparseArray3.indexOfKey(message2.id) < 0) {
                            MessageObject messageObject2 = new MessageObject(this.currentAccount, message2, z5, z5);
                            if (isPersonalMessage(messageObject2)) {
                                this.personalCount++;
                            }
                            sharedPreferences = notificationsSettings;
                            long dialogId = messageObject2.getDialogId();
                            long topicId = MessageObject.getTopicId(this.currentAccount, messageObject2.messageOwner, getMessagesController().isForum(messageObject2));
                            long fromChatId = messageObject2.messageOwner.mentioned ? messageObject2.getFromChatId() : dialogId;
                            int indexOfKey = longSparseArray3.indexOfKey(fromChatId);
                            if (indexOfKey >= 0 && topicId == 0) {
                                z4 = ((Boolean) longSparseArray3.valueAt(indexOfKey)).booleanValue();
                                messageObject = messageObject2;
                                sparseArray = sparseArray3;
                                i = i2;
                                j4 = dialogId;
                                j5 = j8;
                                message = message2;
                            } else {
                                messageObject = messageObject2;
                                sparseArray = sparseArray3;
                                j4 = dialogId;
                                j5 = j8;
                                i = i2;
                                message = message2;
                                int notifyOverride = getNotifyOverride(sharedPreferences, fromChatId, topicId);
                                if (notifyOverride == -1) {
                                    z4 = isGlobalNotificationsEnabled(fromChatId, messageObject.isReactionPush, messageObject.isStoryReactionPush);
                                } else {
                                    z4 = notifyOverride != 2;
                                }
                                longSparseArray3.put(fromChatId, Boolean.valueOf(z4));
                            }
                            if (z4 && (fromChatId != this.openedDialogId || !ApplicationLoader.isScreenOn)) {
                                if (sparseArray == null) {
                                    sparseArray2 = new SparseArray();
                                    this.pushMessagesDict.put(j5, sparseArray2);
                                } else {
                                    sparseArray2 = sparseArray;
                                }
                                sparseArray2.put(message.id, messageObject);
                                appendMessage(messageObject);
                                if (j4 != fromChatId) {
                                    long j9 = j4;
                                    Integer num = (Integer) this.pushDialogsOverrideMention.get(j9);
                                    this.pushDialogsOverrideMention.put(j9, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                                }
                            }
                            i2 = i + 1;
                            arrayList3 = arrayList;
                            notificationsSettings = sharedPreferences;
                            z5 = false;
                            j6 = 0;
                        }
                    }
                }
                i = i2;
                sharedPreferences = notificationsSettings;
                i2 = i + 1;
                arrayList3 = arrayList;
                notificationsSettings = sharedPreferences;
                z5 = false;
                j6 = 0;
            }
        }
        SharedPreferences sharedPreferences2 = notificationsSettings;
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            long keyAt = longSparseArray.keyAt(i3);
            int indexOfKey2 = longSparseArray3.indexOfKey(keyAt);
            if (indexOfKey2 >= 0) {
                z3 = ((Boolean) longSparseArray3.valueAt(indexOfKey2)).booleanValue();
            } else {
                int notifyOverride2 = getNotifyOverride(sharedPreferences2, keyAt, 0L);
                if (notifyOverride2 == -1) {
                    z2 = isGlobalNotificationsEnabled(keyAt, false, false);
                } else {
                    z2 = notifyOverride2 != 2;
                }
                longSparseArray3.put(keyAt, Boolean.valueOf(z2));
                z3 = z2;
            }
            if (z3) {
                Integer num2 = (Integer) longSparseArray.valueAt(i3);
                int intValue = num2.intValue();
                this.pushDialogs.put(keyAt, num2);
                if (getMessagesController().isForum(keyAt)) {
                    this.total_unread_count += intValue > 0 ? 1 : 0;
                } else {
                    this.total_unread_count += intValue;
                }
            }
        }
        if (arrayList2 != null) {
            int i4 = 0;
            while (i4 < arrayList2.size()) {
                MessageObject messageObject3 = (MessageObject) arrayList2.get(i4);
                int id = messageObject3.getId();
                if (this.pushMessagesDict.indexOfKey(id) < 0) {
                    if (isPersonalMessage(messageObject3)) {
                        this.personalCount++;
                    }
                    long dialogId2 = messageObject3.getDialogId();
                    long topicId2 = MessageObject.getTopicId(this.currentAccount, messageObject3.messageOwner, getMessagesController().isForum(messageObject3));
                    TLRPC.Message message3 = messageObject3.messageOwner;
                    long j10 = message3.random_id;
                    long fromChatId2 = message3.mentioned ? messageObject3.getFromChatId() : dialogId2;
                    int indexOfKey3 = longSparseArray3.indexOfKey(fromChatId2);
                    if (indexOfKey3 >= 0 && topicId2 == 0) {
                        j = j10;
                        z = ((Boolean) longSparseArray3.valueAt(indexOfKey3)).booleanValue();
                        j2 = fromChatId2;
                    } else {
                        long j11 = fromChatId2;
                        j = j10;
                        int notifyOverride3 = getNotifyOverride(sharedPreferences2, j11, topicId2);
                        if (notifyOverride3 == -1) {
                            j2 = j11;
                            z = isGlobalNotificationsEnabled(j2, messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                        } else {
                            j2 = j11;
                            z = notifyOverride3 != 2;
                        }
                        longSparseArray3.put(j2, Boolean.valueOf(z));
                    }
                    if (z && (j2 != this.openedDialogId || !ApplicationLoader.isScreenOn)) {
                        if (id != 0) {
                            if (messageObject3.isStoryReactionPush) {
                                j3 = messageObject3.getDialogId();
                            } else {
                                long j12 = messageObject3.messageOwner.peer_id.channel_id;
                                j3 = j12 != 0 ? -j12 : 0L;
                            }
                            SparseArray sparseArray4 = (SparseArray) this.pushMessagesDict.get(j3);
                            if (sparseArray4 == null) {
                                sparseArray4 = new SparseArray();
                                this.pushMessagesDict.put(j3, sparseArray4);
                            }
                            sparseArray4.put(id, messageObject3);
                            longSparseArray2 = longSparseArray3;
                        } else {
                            longSparseArray2 = longSparseArray3;
                            long j13 = j;
                            if (j13 != 0) {
                                this.fcmRandomMessagesDict.put(j13, messageObject3);
                            }
                        }
                        appendMessage(messageObject3);
                        if (dialogId2 != j2) {
                            Integer num3 = (Integer) this.pushDialogsOverrideMention.get(dialogId2);
                            this.pushDialogsOverrideMention.put(dialogId2, Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1));
                        }
                        Integer num4 = (Integer) this.pushDialogs.get(j2);
                        int intValue2 = num4 != null ? num4.intValue() + 1 : 1;
                        if (getMessagesController().isForum(j2)) {
                            if (num4 != null) {
                                this.total_unread_count -= num4.intValue() > 0 ? 1 : 0;
                            }
                            this.total_unread_count += intValue2 > 0 ? 1 : 0;
                        } else {
                            if (num4 != null) {
                                this.total_unread_count -= num4.intValue();
                            }
                            this.total_unread_count += intValue2;
                        }
                        this.pushDialogs.put(j2, Integer.valueOf(intValue2));
                        i4++;
                        longSparseArray3 = longSparseArray2;
                    }
                }
                longSparseArray2 = longSparseArray3;
                i4++;
                longSparseArray3 = longSparseArray2;
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                StoryNotification storyNotification = (StoryNotification) it.next();
                long j14 = storyNotification.dialogId;
                StoryNotification storyNotification2 = (StoryNotification) this.storyPushMessagesDict.get(j14);
                if (storyNotification2 != null) {
                    storyNotification2.dateByIds.putAll(storyNotification.dateByIds);
                } else {
                    this.storyPushMessages.add(storyNotification);
                    this.storyPushMessagesDict.put(j14, storyNotification);
                }
            }
            Collections.sort(this.storyPushMessages, Comparator$-CC.comparingLong(new ToLongFunction() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda33
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long j15;
                    j15 = ((NotificationsController.StoryNotification) obj).date;
                    return j15;
                }
            }));
        }
        final int size = this.pushDialogs.size();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processLoadedUnreadMessages$30(size);
            }
        });
        showOrUpdateNotification(SystemClock.elapsedRealtime() / 1000 < 60);
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedUnreadMessages$30(int i) {
        if (this.total_unread_count == 0) {
            this.popupMessages.clear();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    private int getTotalAllUnreadCount() {
        int size;
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (UserConfig.getInstance(i2).isClientActivated() && (SharedConfig.showNotificationsForAllAccounts || UserConfig.selectedAccount == i2)) {
                NotificationsController notificationsController = getInstance(i2);
                if (notificationsController.showBadgeNumber) {
                    if (notificationsController.showBadgeMessages) {
                        if (notificationsController.showBadgeMuted) {
                            try {
                                ArrayList arrayList = new ArrayList(MessagesController.getInstance(i2).allDialogs);
                                int size2 = arrayList.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i3);
                                    if ((dialog == null || !DialogObject.isChatDialog(dialog.id) || !ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(-dialog.id)))) && dialog != null) {
                                        i += MessagesController.getInstance(i2).getDialogUnreadCount(dialog);
                                    }
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else {
                            size = notificationsController.total_unread_count;
                        }
                    } else if (notificationsController.showBadgeMuted) {
                        try {
                            int size3 = MessagesController.getInstance(i2).allDialogs.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                TLRPC.Dialog dialog2 = MessagesController.getInstance(i2).allDialogs.get(i4);
                                if ((!DialogObject.isChatDialog(dialog2.id) || !ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(-dialog2.id)))) && MessagesController.getInstance(i2).getDialogUnreadCount(dialog2) != 0) {
                                    i++;
                                }
                            }
                        } catch (Exception e2) {
                            FileLog.e((Throwable) e2, false);
                        }
                    } else {
                        size = notificationsController.pushDialogs.size();
                    }
                    i += size;
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateBadge$32() {
        setBadge(getTotalAllUnreadCount());
    }

    public void updateBadge() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda58
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$updateBadge$32();
            }
        });
    }

    private void setBadge(int i) {
        if (this.lastBadgeCount == i) {
            return;
        }
        FileLog.d("setBadge " + i);
        this.lastBadgeCount = i;
        NotificationBadge.applyCount(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x023d, code lost:
    
        if (r7.getBoolean(r25, true) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0254, code lost:
    
        r2 = r27.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0266, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageService) == false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0268, code lost:
    
        r28[0] = null;
        r2 = r2.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0270, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetSameChatWallPaper) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0278, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.WallpaperSameNotification);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x027b, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatWallPaper) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0283, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.WallpaperNotification);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0286, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGeoProximityReached) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x028e, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0291, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0295, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionContactSignUp) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x029d, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserUpdatedPhoto) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ab, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationContactNewPhoto, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ae, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionLoginUnknownLocation) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02b0, code lost:
    
        r0 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.formatDateAtTime, org.telegram.messenger.LocaleController.getInstance().getFormatterYear().format(r27.messageOwner.date * 1000), org.telegram.messenger.LocaleController.getInstance().getFormatterDay().format(r27.messageOwner.date * 1000));
        r2 = org.telegram.messenger.R.string.NotificationUnrecognizedDevice;
        r4 = getUserConfig().getCurrentUser().first_name;
        r1 = r27.messageOwner.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0310, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r4, r0, r1.title, r1.address);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x034e, code lost:
    
        if (org.telegram.messenger.utils.tlutils.TlUtils.isInstance(r2, org.telegram.tgnet.TLRPC.TL_messageActionGameScore.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSent.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSentMe.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGift.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftPremium.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesPrice.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesRefunded.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftTon.class) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0356, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0357, code lost:
    
        r2 = r27.messageOwner;
        r5 = r2.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x035d, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPhoneCall) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0361, code lost:
    
        if (r5.video == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0369, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageVideoIncomingMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0370, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageIncomingMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0373, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionConferenceCall) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0377, code lost:
    
        if (r5.video == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x037f, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageVideoIncomingConferenceMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0386, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.CallMessageIncomingConferenceMissed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x038d, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatAddUser) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x038f, code lost:
    
        r7 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0395, code lost:
    
        if (r7 != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x039e, code lost:
    
        if (r5.users.size() != 1) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a0, code lost:
    
        r7 = r27.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b5, code lost:
    
        if (r7 == 0) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03bf, code lost:
    
        if (r27.messageOwner.peer_id.channel_id == 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03c3, code lost:
    
        if (r4.megagroup != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelAddedByNotification, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03de, code lost:
    
        if (r7 != r21) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03f0, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroup, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03f1, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03fd, code lost:
    
        if (r1 != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03ff, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0405, code lost:
    
        if (r14 != r1.id) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0409, code lost:
    
        if (r4.megagroup == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x041e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelfMega, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0432, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelf, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x044d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r0, r3.getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x044e, code lost:
    
        r2 = new java.lang.StringBuilder();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x045e, code lost:
    
        if (r5 >= r27.messageOwner.action.users.size()) goto L914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0460, code lost:
    
        r7 = getMessagesController().getUser(r27.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0474, code lost:
    
        if (r7 == null) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0476, code lost:
    
        r7 = org.telegram.messenger.UserObject.getUserName(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x047e, code lost:
    
        if (r2.length() == 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0480, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0483, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0486, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04a3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r0, r3.getTitle(r4), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04a6, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCall) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04aa, code lost:
    
        if (r5.duration == 0) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04bf, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupEndedCall, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04d3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupCreatedCall, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04d6, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCallScheduled) == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04de, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04e1, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionInviteToGroupCall) == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04e3, code lost:
    
        r7 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04e9, code lost:
    
        if (r7 != 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04f2, code lost:
    
        if (r5.users.size() != 1) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04f4, code lost:
    
        r7 = r27.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0509, code lost:
    
        if (r7 == 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x050d, code lost:
    
        if (r7 != r21) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0522, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedYouToCall, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0523, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x052f, code lost:
    
        if (r1 != null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0531, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x054d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r0, r3.getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x054e, code lost:
    
        r2 = new java.lang.StringBuilder();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x055e, code lost:
    
        if (r5 >= r27.messageOwner.action.users.size()) goto L917;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0560, code lost:
    
        r7 = getMessagesController().getUser(r27.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0574, code lost:
    
        if (r7 == null) goto L919;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0576, code lost:
    
        r7 = org.telegram.messenger.UserObject.getUserName(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x057e, code lost:
    
        if (r2.length() == 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0580, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0583, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0586, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x05a3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r0, r3.getTitle(r4), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05a6, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x05ae, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingReceivedGiftNoName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x05b1, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByLink) == false) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x05c7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroupByLink, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x05cd, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditTitle) == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x05de, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupName, r0, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x05e1, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditPhoto) != false) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x05e5, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeletePhoto) == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05eb, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeleteUser) == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05ed, code lost:
    
        r5 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x05f1, code lost:
    
        if (r5 != r21) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0606, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickYou, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x060c, code lost:
    
        if (r5 != r14) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x061e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupLeftMember, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x061f, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r27.messageOwner.action.user_id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0631, code lost:
    
        if (r1 != null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0633, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x064f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickMember, r0, r3.getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0652, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatCreate) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x065a, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x065d, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelCreate) == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0665, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0668, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatMigrateTo) == false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x067a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x067f, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x068d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0690, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionScreenshotTaken) == false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0698, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x069b, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayLaunch) == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x06a3, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x06a6, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayResults) == false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x06ae, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06b1, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPinMessage) == false) goto L674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06b7, code lost:
    
        if (r4 == null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06bd, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r4) == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x06c1, code lost:
    
        if (r4.megagroup == false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x06c8, code lost:
    
        r1 = r27.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06ca, code lost:
    
        if (r1 != null) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x06df, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x06e7, code lost:
    
        if (r1.isMusic() == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x06f9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusic, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x06fe, code lost:
    
        if (r1.isVideo() == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0708, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0733, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r0, "📹 " + r1.messageOwner.message, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0747, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideo, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x074c, code lost:
    
        if (r1.isGif() == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0756, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0781, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r0, "🎬 " + r1.messageOwner.message, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0795, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGif, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x079d, code lost:
    
        if (r1.isVoice() == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x07af, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoice, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x07b4, code lost:
    
        if (r1.isRoundVideo() == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x07c6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRound, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x07cb, code lost:
    
        if (r1.isSticker() != false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x07d1, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x07d7, code lost:
    
        r6 = r1.messageOwner;
        r8 = r6.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x07dd, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x07e5, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0810, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r0, "📎 " + r1.messageOwner.message, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0824, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFile, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0827, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x082b, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0834, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0849, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLive, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x084c, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x084e, code lost:
    
        r8 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x086e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContact2, r0, r3.getTitle(r4), org.telegram.messenger.ContactsController.formatName(r8.first_name, r8.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0871, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0873, code lost:
    
        r8 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0879, code lost:
    
        if (r8.poll.quiz == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0897, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuiz2, r0, r3.getTitle(r4), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x08b4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPoll2, r0, r3.getTitle(r4), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x08b7, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x08d7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodo2, r0, r3.getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r8).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x08da, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x08e2, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x090d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r0, "🖼 " + r1.messageOwner.message, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0921, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhoto, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0927, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0939, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGame, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x093a, code lost:
    
        r6 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x093c, code lost:
    
        if (r6 == null) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0942, code lost:
    
        if (r6.length() <= 0) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0944, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x094a, code lost:
    
        if (r1.length() <= 20) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x094c, code lost:
    
        r6 = new java.lang.StringBuilder();
        r8 = 0;
        r6.append((java.lang.Object) r1.subSequence(0, 20));
        r6.append("...");
        r1 = r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0962, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedText;
        r4 = r3.getTitle(r4);
        r5 = new java.lang.Object[3];
        r5[r8] = r0;
        r5[1] = r1;
        r5[2] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0977, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0961, code lost:
    
        r8 = 0;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x098b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x099c, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeo, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x099d, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x09a1, code lost:
    
        if (r1 == null) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x09b7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmoji, r0, r3.getTitle(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x09c9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedSticker, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r7.getBoolean("EnablePreviewGroup", true) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x09ca, code lost:
    
        if (r4 == null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x09cc, code lost:
    
        r0 = r27.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x09ce, code lost:
    
        if (r0 != null) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x09de, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x09e3, code lost:
    
        if (r0.isMusic() == false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x09f3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x09f8, code lost:
    
        if (r0.isVideo() == false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0a02, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.messageOwner.message) != false) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0a2a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, r3.getTitle(r4), "📹 " + r0.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0a3b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0a40, code lost:
    
        if (r0.isGif() == false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0a4a, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.messageOwner.message) != false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0a72, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, r3.getTitle(r4), "🎬 " + r0.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0a83, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0a8a, code lost:
    
        if (r0.isVoice() == false) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0a9a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0a9f, code lost:
    
        if (r0.isRoundVideo() == false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0aaf, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0ab4, code lost:
    
        if (r0.isSticker() != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0aba, code lost:
    
        if (r0.isAnimatedSticker() == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0ac0, code lost:
    
        r1 = r0.messageOwner;
        r6 = r1.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0ac6, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (r7.getBoolean("EnablePreviewChannel", r0) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0ace, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.message) != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0af6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, r3.getTitle(r4), "📎 " + r0.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0b07, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0b0a, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0b0e, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0b16, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0b28, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0b2b, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b2d, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b4a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactChannel2, r3.getTitle(r4), org.telegram.messenger.ContactsController.formatName(r6.first_name, r6.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0b4d, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0b4f, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0b55, code lost:
    
        if (r6.poll.quiz == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0b70, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizChannel2, r3.getTitle(r4), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0b8a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollChannel2, r3.getTitle(r4), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0b8d, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0baa, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoChannel2, r3.getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r6).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0bad, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0bb5, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.message) != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0bdd, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, r3.getTitle(r4), "🖼 " + r0.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0bee, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0bf3, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0c03, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0c04, code lost:
    
        r1 = r0.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0c06, code lost:
    
        if (r1 == null) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0c0c, code lost:
    
        if (r1.length() <= 0) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0c0e, code lost:
    
        r0 = r0.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0c14, code lost:
    
        if (r0.length() <= 20) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0c16, code lost:
    
        r1 = new java.lang.StringBuilder();
        r6 = 0;
        r1.append((java.lang.Object) r0.subSequence(0, 20));
        r1.append("...");
        r0 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0c2c, code lost:
    
        r1 = org.telegram.messenger.R.string.NotificationActionPinnedTextChannel;
        r2 = r3.getTitle(r4);
        r4 = new java.lang.Object[2];
        r4[r6] = r2;
        r4[1] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0c3e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0c2b, code lost:
    
        r6 = 0;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c4f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0c5e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0c5f, code lost:
    
        r0 = r0.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0c63, code lost:
    
        if (r0 == null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0c76, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiChannel, r3.getTitle(r4), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0c85, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0c86, code lost:
    
        r1 = r27.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0c8a, code lost:
    
        if (r1 != null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0c96, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0c9b, code lost:
    
        if (r1.isMusic() == false) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0ca7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0cac, code lost:
    
        if (r1.isVideo() == false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0cb6, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0cda, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r0, "📹 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0ce7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0cec, code lost:
    
        if (r1.isGif() == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0cf6, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0d1a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r0, "🎬 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0d27, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0d2e, code lost:
    
        if (r1.isVoice() == false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0d3a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0d3f, code lost:
    
        if (r1.isRoundVideo() == false) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0d4b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0d50, code lost:
    
        if (r1.isSticker() != false) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0d56, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0d5c, code lost:
    
        r4 = r1.messageOwner;
        r6 = r4.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0d62, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0d6a, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0d8e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r0, "📎 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0d9b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0d9e, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0da2, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0daa, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0db8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0dbc, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0dbe, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0dd6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactUser, r0, org.telegram.messenger.ContactsController.formatName(r6.first_name, r6.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0dd9, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0ddb, code lost:
    
        r1 = ((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r6).poll;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0de1, code lost:
    
        if (r1.quiz == false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0df6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizUser, r0, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0e0a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollUser, r0, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0e0d, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0e26, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoUser, r0, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r6).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0e29, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0e31, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0e55, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r0, "🖼 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0e62, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0e67, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0e73, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0e74, code lost:
    
        r4 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0e76, code lost:
    
        if (r4 == null) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0e7c, code lost:
    
        if (r4.length() <= 0) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0e7e, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0e84, code lost:
    
        if (r1.length() <= 20) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0e86, code lost:
    
        r4 = new java.lang.StringBuilder();
        r6 = 0;
        r4.append((java.lang.Object) r1.subSequence(0, 20));
        r4.append("...");
        r1 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0e9c, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedTextUser;
        r4 = new java.lang.Object[2];
        r4[r6] = r0;
        r4[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0eaa, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0e9b, code lost:
    
        r6 = 0;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0eb7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0ec2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0ec3, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0ec7, code lost:
    
        if (r1 == null) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0ed6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiUser, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0ee1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0ee4, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0ee6, code lost:
    
        r1 = org.telegram.messenger.utils.tlutils.TlUtils.getThemeEmoticonOrGiftTitle(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r5).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0ef2, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0ef6, code lost:
    
        if (r8 != r21) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:?, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabledYou, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:?, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabled, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0f16, code lost:
    
        if (r8 != r21) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:?, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedYou, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0f30, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedTo, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0f33, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByRequest) == false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0f3b, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0f3e, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) == false) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0f40, code lost:
    
        r5 = (org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) r5;
        r0 = org.telegram.messenger.DialogObject.getPeerDialogId(r5.boost_peer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0f4c, code lost:
    
        if (r0 < 0) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0f4e, code lost:
    
        r6 = org.telegram.messenger.UserObject.getForcedFirstName(getMessagesController().getUser(java.lang.Long.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0f84, code lost:
    
        return org.telegram.messenger.LocaleController.formatPluralStringComma("BoostingReceivedStars", (int) r5.stars, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0f5f, code lost:
    
        r0 = getMessagesController().getChat(java.lang.Long.valueOf(-r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0f6c, code lost:
    
        if (r0 != null) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0f6e, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0f71, code lost:
    
        r6 = r3.getTitle(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0f87, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPaymentRefunded) == false) goto L706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0f8f, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0f92, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoCompletions) == false) goto L710;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0f9a, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0f9d, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoAppendTasks) == false) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0fa5, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x0fa6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0fb0, code lost:
    
        if (r2.peer_id.channel_id == 0) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0fb4, code lost:
    
        if (r4.megagroup != false) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0fba, code lost:
    
        if (r27.isVideoAvatar() == false) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0fcc, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelVideoEditNotification, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x0fdd, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelPhotoEditNotification, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0fe3, code lost:
    
        if (r27.isVideoAvatar() == false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0ff7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupVideo, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x100a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupPhoto, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x1015, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationContactJoined, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x101c, code lost:
    
        if (r27.isMediaEmpty() == false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x1026, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x102c, code lost:
    
        return replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x1033, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x1038, code lost:
    
        if (r27.type != 29) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x1040, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r27) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x1042, code lost:
    
        r0 = (org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.MessageObject.getMedia(r27);
        r1 = r0.extended_media.size();
        r2 = false;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x1050, code lost:
    
        if (r4 >= r1) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x1052, code lost:
    
        r5 = r0.extended_media.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x105c, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) == false) goto L756;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x105e, code lost:
    
        r2 = ((org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) r5).media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x1064, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x106c, code lost:
    
        if (org.telegram.messenger.MessageObject.isVideoDocument(r2.document) == false) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x107e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x1083, code lost:
    
        if (r2 == false) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x1087, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x108a, code lost:
    
        r0 = org.telegram.messenger.R.string.AttachPaidMedia;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x108c, code lost:
    
        if (r1 != 1) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x108e, code lost:
    
        if (r2 == false) goto L770;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x1090, code lost:
    
        r1 = org.telegram.messenger.R.string.AttachVideo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x1095, code lost:
    
        r1 = org.telegram.messenger.LocaleController.getString(r1);
        r2 = 1;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x10ac, code lost:
    
        r2 = new java.lang.Object[r2];
        r2[r4] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x10b4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x1093, code lost:
    
        r1 = org.telegram.messenger.R.string.AttachPhoto;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x109c, code lost:
    
        if (r2 == false) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x109e, code lost:
    
        r2 = "Media";
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x10a0, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x10a5, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralString(r2, r1, new java.lang.Object[0]);
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x10a2, code lost:
    
        r2 = "Photos";
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x1080, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x1074, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) == false) goto L762;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x107c, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r5).flags & 4) == 0) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x10b9, code lost:
    
        if (r27.isVoiceOnce() == false) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x10c1, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x10c6, code lost:
    
        if (r27.isRoundOnce() == false) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x10ce, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x10cf, code lost:
    
        r0 = r27.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x10d5, code lost:
    
        if ((r0.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L799;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x10dd, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.message) != false) goto L793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x10f2, code lost:
    
        return "🖼 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x10f9, code lost:
    
        if (r27.messageOwner.media.ttl_seconds == 0) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x1101, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x1108, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x110d, code lost:
    
        if (r27.isVideo() == false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x1117, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L805;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x112c, code lost:
    
        return "📹 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x1133, code lost:
    
        if (r27.messageOwner.media.ttl_seconds == 0) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x113b, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x1142, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x1147, code lost:
    
        if (r27.isGame() == false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x114f, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGame);
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x1154, code lost:
    
        if (r27.isVoice() == false) goto L819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x115c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x1161, code lost:
    
        if (r27.isRoundVideo() == false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x1169, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x116e, code lost:
    
        if (r27.isMusic() == false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x1176, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachMusic);
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x1177, code lost:
    
        r0 = r27.messageOwner.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x117d, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x1185, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachContact);
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x1188, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x1190, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r0).poll.quiz == false) goto L837;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x1198, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.QuizPoll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x119f, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Poll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x11a2, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x11aa, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Todo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x11ad, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L847;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x11b5, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveaway);
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x11b8, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x11c0, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveawayResults);
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x11c3, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L906;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x11c7, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L856;
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x11cd, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L860;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x11d5, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLiveLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x11d8, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L887;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x11de, code lost:
    
        if (r27.isSticker() != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x11e4, code lost:
    
        if (r27.isAnimatedSticker() == false) goto L867;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x11eb, code lost:
    
        if (r27.isGif() == false) goto L875;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x11f5, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x120a, code lost:
    
        return "🎬 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x1211, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGif);
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x121a, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x122f, code lost:
    
        return "📎 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x1236, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDocument);
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x1237, code lost:
    
        r0 = r27.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x123b, code lost:
    
        if (r0 == null) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x1257, code lost:
    
        return r0 + " " + org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachSticker);
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x125e, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachSticker);
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x1261, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaStory) == false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x1267, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaStory) r0).via_mention == false) goto L898;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x1269, code lost:
    
        r0 = org.telegram.messenger.R.string.StoryNotificationMention;
        r2 = r28[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x126e, code lost:
    
        if (r2 != null) goto L895;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x1270, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x127e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x1274, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x1285, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Story);
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x128c, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageText) != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x1292, code lost:
    
        return replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x1299, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x12a0, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x0249, code lost:
    
        if (r7.getBoolean("EnablePreviewGroup", r10) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0252, code lost:
    
        if (r7.getBoolean(r12, r10) != false) goto L161;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getShortStringForMessage(MessageObject messageObject, String[] strArr, boolean[] zArr) {
        String str;
        NotificationsController notificationsController;
        String title;
        String str2;
        char c;
        TLRPC.Chat chat;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Chat chat2;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer2;
        boolean z;
        if (AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return LocaleController.getString(R.string.NotificationHiddenMessage);
        }
        TLRPC.Message message = messageObject.messageOwner;
        long j = message.dialog_id;
        TLRPC.Peer peer3 = message.peer_id;
        long j2 = peer3.chat_id;
        if (j2 == 0) {
            j2 = peer3.channel_id;
        }
        long j3 = peer3.user_id;
        if (zArr != null) {
            zArr[0] = true;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        boolean z2 = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + j, true);
        if (messageObject.isFcmMessage()) {
            if (j2 == 0 && j3 != 0) {
                if (Build.VERSION.SDK_INT > 27) {
                    z = false;
                    strArr[0] = messageObject.localName;
                } else {
                    z = false;
                }
                if (!z2 || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                    if (zArr != null) {
                        zArr[z ? 1 : 0] = z;
                    }
                    return LocaleController.getString(R.string.Message);
                }
            } else if (j2 != 0) {
                if (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) {
                    strArr[0] = messageObject.localUserName;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = messageObject.localName;
                }
                if (z2) {
                    boolean z3 = !messageObject.localChannel ? true : true;
                    if (messageObject.localChannel) {
                    }
                }
                if (zArr != null) {
                    zArr[0] = false;
                }
                return (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, messageObject.localUserName, messageObject.localName) : LocaleController.formatString(R.string.ChannelMessageNoText, messageObject.localName);
            }
            return replaceSpoilers(messageObject);
        }
        long clientUserId = getUserConfig().getClientUserId();
        if (j3 == 0) {
            j3 = messageObject.getFromChatId();
            if (j3 == 0) {
                j3 = -j2;
            }
        } else if (j3 == clientUserId) {
            j3 = messageObject.getFromChatId();
        }
        if (j == 0) {
            if (j2 != 0) {
                j = -j2;
            } else if (j3 != 0) {
                j = j3;
            }
        }
        if (UserObject.isReplyUser(j) && (messageFwdHeader2 = messageObject.messageOwner.fwd_from) != null && (peer2 = messageFwdHeader2.from_id) != null) {
            j3 = MessageObject.getPeerId(peer2);
        }
        if (j3 > 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                title = UserObject.getUserName(user);
                if (j2 != 0) {
                    strArr[0] = title;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = title;
                } else {
                    strArr[0] = null;
                }
                notificationsController = this;
                str = "EnablePreviewChannel";
            } else {
                notificationsController = this;
                str = "EnablePreviewChannel";
                title = null;
            }
        } else {
            str = "EnablePreviewChannel";
            TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j3));
            notificationsController = this;
            if (chat3 != null) {
                title = notificationsController.getTitle(chat3);
                strArr[0] = title;
            }
            title = null;
        }
        if (title == null || j3 <= 0 || !UserObject.isReplyUser(j) || (messageFwdHeader = messageObject.messageOwner.fwd_from) == null || (peer = messageFwdHeader.saved_from_peer) == null) {
            str2 = "EnablePreviewAll";
        } else {
            str2 = "EnablePreviewAll";
            long peerId = MessageObject.getPeerId(peer);
            if (DialogObject.isChatDialog(peerId) && (chat2 = getMessagesController().getChat(Long.valueOf(-peerId))) != null) {
                title = title + " @ " + notificationsController.getTitle(chat2);
                if (strArr[0] != null) {
                    strArr[0] = title;
                }
            }
        }
        if (title == null) {
            return null;
        }
        if (j2 != 0) {
            chat = getMessagesController().getChat(Long.valueOf(j2));
            if (chat == null) {
                return null;
            }
            if (!ChatObject.isChannel(chat) || chat.megagroup || Build.VERSION.SDK_INT > 27) {
                c = 0;
            } else {
                c = 0;
                strArr[0] = null;
            }
        } else {
            c = 0;
            chat = null;
        }
        if (DialogObject.isEncryptedDialog(j)) {
            strArr[c] = null;
            return LocaleController.getString(R.string.NotificationHiddenMessage);
        }
        boolean z4 = ChatObject.isChannel(chat) && !chat.megagroup;
        if (z2) {
            boolean z5 = (j2 != 0 || j3 == 0) ? true : true;
            if (j2 != 0) {
                if (!z4) {
                }
                if (z4) {
                }
            }
        }
        if (zArr != null) {
            zArr[0] = false;
        }
        return LocaleController.getString(R.string.Message);
    }

    private String replaceSpoilers(MessageObject messageObject) {
        TLRPC.Message message;
        String str;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (str = message.message) == null || message.entities == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        if (messageObject.didSpoilLoginCode()) {
            return sb.toString();
        }
        for (int i = 0; i < messageObject.messageOwner.entities.size(); i++) {
            if (messageObject.messageOwner.entities.get(i) instanceof TLRPC.TL_messageEntitySpoiler) {
                TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) messageObject.messageOwner.entities.get(i);
                for (int i2 = 0; i2 < tL_messageEntitySpoiler.length; i2++) {
                    int i3 = tL_messageEntitySpoiler.offset + i2;
                    char[] cArr = this.spoilerChars;
                    sb.setCharAt(i3, cArr[i2 % cArr.length]);
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:297:0x0691, code lost:
    
        if (r6.getBoolean(r21, true) == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x069f, code lost:
    
        r2 = r25.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x06a3, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageService) == false) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x06a5, code lost:
    
        r5 = r2.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x06ab, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatAddUser) == false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x06ad, code lost:
    
        r6 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x06b3, code lost:
    
        if (r6 != 0) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x06bc, code lost:
    
        if (r5.users.size() != 1) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x06be, code lost:
    
        r6 = r25.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x06d3, code lost:
    
        if (r6 == 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06dd, code lost:
    
        if (r25.messageOwner.peer_id.channel_id == 0) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06e1, code lost:
    
        if (r3.megagroup != false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x06e3, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelAddedByNotification, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x06fd, code lost:
    
        if (r6 != r19) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x06ff, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroup, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0711, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x071d, code lost:
    
        if (r1 != null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x071f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0725, code lost:
    
        if (r13 != r1.id) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0729, code lost:
    
        if (r3.megagroup == false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x072b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelfMega, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0740, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelf, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0755, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r11, getTitle(r3), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0771, code lost:
    
        r2 = new java.lang.StringBuilder();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0781, code lost:
    
        if (r4 >= r25.messageOwner.action.users.size()) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0783, code lost:
    
        r5 = getMessagesController().getUser(r25.messageOwner.action.users.get(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0797, code lost:
    
        if (r5 == null) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0799, code lost:
    
        r5 = org.telegram.messenger.UserObject.getUserName(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x07a1, code lost:
    
        if (r2.length() == 0) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x07a3, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x07a6, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x07a9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x07ac, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r11, getTitle(r3), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x07ca, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCall) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x07ce, code lost:
    
        if (r5.duration == 0) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x07e3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupEndedCall, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x07f7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupCreatedCall, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x07fa, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCallScheduled) == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x07fc, code lost:
    
        r1 = r25.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0806, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionInviteToGroupCall) == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0808, code lost:
    
        r6 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x080e, code lost:
    
        if (r6 != 0) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0817, code lost:
    
        if (r5.users.size() != 1) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0819, code lost:
    
        r6 = r25.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x082e, code lost:
    
        if (r6 == 0) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0832, code lost:
    
        if (r6 != r19) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0834, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedYouToCall, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0849, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0855, code lost:
    
        if (r1 != null) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0857, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0859, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r11, getTitle(r3), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0875, code lost:
    
        r2 = new java.lang.StringBuilder();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0885, code lost:
    
        if (r4 >= r25.messageOwner.action.users.size()) goto L852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0887, code lost:
    
        r5 = getMessagesController().getUser(r25.messageOwner.action.users.get(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x089b, code lost:
    
        if (r5 == null) goto L854;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x089d, code lost:
    
        r5 = org.telegram.messenger.UserObject.getUserName(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x08a5, code lost:
    
        if (r2.length() == 0) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x08a7, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x08aa, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x08ad, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x08b0, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r11, getTitle(r3), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x08ce, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) == false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x08d0, code lost:
    
        r5 = (org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) r5;
        r1 = org.telegram.messenger.MessagesController.getInstance(r24.currentAccount).getChat(java.lang.Long.valueOf(-org.telegram.messenger.DialogObject.getPeerDialogId(r5.boost_peer)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x08e7, code lost:
    
        if (r1 != null) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x08e9, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x08ef, code lost:
    
        if (r15 != null) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x08f1, code lost:
    
        r1 = org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingReceivedGiftNoName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x08f9, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGiftCode, r15, org.telegram.messenger.LocaleController.formatPluralString("Months", r5.months, new java.lang.Object[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x08eb, code lost:
    
        r15 = getTitle(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x091a, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByLink) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x091c, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroupByLink, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0931, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditTitle) == false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0933, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupName, r11, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0946, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoCompletions) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0948, code lost:
    
        r1 = r25.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0952, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoAppendTasks) == false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0954, code lost:
    
        r1 = r25.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x095e, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditPhoto) != false) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0962, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeletePhoto) == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0968, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeleteUser) == false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x096a, code lost:
    
        r4 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x096e, code lost:
    
        if (r4 != r19) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0970, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickYou, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x098a, code lost:
    
        if (r4 != r13) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x098c, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupLeftMember, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x099e, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r25.messageOwner.action.user_id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x09b0, code lost:
    
        if (r1 != null) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x09b2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x09b4, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickMember, r11, getTitle(r3), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x09d0, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x09d3, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatCreate) == false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x09d5, code lost:
    
        r1 = r25.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x09df, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelCreate) == false) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x09e1, code lost:
    
        r1 = r25.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x09eb, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatMigrateTo) == false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x09ed, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0a03, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0a05, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0a15, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionScreenshotTaken) == false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0a17, code lost:
    
        r1 = r25.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0a21, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPinMessage) == false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0a2b, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r3) == false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0a2f, code lost:
    
        if (r3.megagroup == false) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0a35, code lost:
    
        r2 = r25.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0a37, code lost:
    
        if (r2 != null) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0a39, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0a51, code lost:
    
        if (r2.isMusic() == false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0a53, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0a67, code lost:
    
        if (r2.isVideo() == false) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0a71, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.messageOwner.message) != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0a73, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r3), "📹 " + r2.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0a9b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0ab1, code lost:
    
        if (r2.isGif() == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0abb, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.messageOwner.message) != false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0abd, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r3), "🎬 " + r2.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0ae5, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0afd, code lost:
    
        if (r2.isVoice() == false) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0aff, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0b13, code lost:
    
        if (r2.isRoundVideo() == false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0b15, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0b29, code lost:
    
        if (r2.isSticker() != false) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0b2f, code lost:
    
        if (r2.isAnimatedSticker() == false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0b35, code lost:
    
        r7 = r2.messageOwner;
        r8 = r7.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0b3b, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0b43, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0b45, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r3), "📎 " + r2.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0b6d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0b81, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0b85, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0b8d, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0b8f, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0ba3, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0ba5, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r25.messageOwner.media;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactChannel2, getTitle(r3), org.telegram.messenger.ContactsController.formatName(r1.first_name, r1.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0bca, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0bcc, code lost:
    
        r8 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0bd2, code lost:
    
        if (r8.poll.quiz == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0bd4, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizChannel2, getTitle(r3), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0bef, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollChannel2, getTitle(r3), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0c0c, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0c0e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoChannel2, getTitle(r3), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r8).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0c2d, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0c35, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0c37, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r3), "🖼 " + r2.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0c5f, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0c75, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0c77, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0c87, code lost:
    
        r1 = r2.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0c89, code lost:
    
        if (r1 == null) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0c8f, code lost:
    
        if (r1.length() <= 0) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0c91, code lost:
    
        r1 = r2.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0c97, code lost:
    
        if (r1.length() <= 20) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0c99, code lost:
    
        r2 = new java.lang.StringBuilder();
        r7 = 0;
        r2.append((java.lang.Object) r1.subSequence(0, 20));
        r2.append("...");
        r1 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0caf, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedTextChannel;
        r4 = new java.lang.Object[2];
        r4[r7] = getTitle(r3);
        r4[1] = r1;
        r1 = org.telegram.messenger.LocaleController.formatString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0cae, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0cc3, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0cd5, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0ce5, code lost:
    
        r1 = r2.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0ce9, code lost:
    
        if (r1 == null) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0ceb, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(r3), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0cfe, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerChannel, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0d0e, code lost:
    
        r2 = r25.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0d10, code lost:
    
        if (r2 != null) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0d12, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0d2a, code lost:
    
        if (r2.isMusic() == false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0d2c, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusic, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0d42, code lost:
    
        if (r2.isVideo() == false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0d4c, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.messageOwner.message) != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0d4e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r11, "📹 " + r2.messageOwner.message, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0d79, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideo, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0d92, code lost:
    
        if (r2.isGif() == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0d9c, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.messageOwner.message) != false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0d9e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r11, "🎬 " + r2.messageOwner.message, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0dc9, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGif, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0de5, code lost:
    
        if (r2.isVoice() == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0de7, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoice, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0dfd, code lost:
    
        if (r2.isRoundVideo() == false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0dff, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRound, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0e15, code lost:
    
        if (r2.isSticker() != false) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0e1b, code lost:
    
        if (r2.isAnimatedSticker() == false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0e21, code lost:
    
        r7 = r2.messageOwner;
        r8 = r7.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0e27, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0e2f, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0e31, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r11, "📎 " + r2.messageOwner.message, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0e5c, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFile, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0e73, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0e77, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0e80, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0e82, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLive, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0e99, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0e9b, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r25.messageOwner.media;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContact2, r11, getTitle(r3), org.telegram.messenger.ContactsController.formatName(r1.first_name, r1.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0ec3, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0ec5, code lost:
    
        r8 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0ecb, code lost:
    
        if (r8.poll.quiz == false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0ecd, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuiz2, r11, getTitle(r3), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0eeb, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPoll2, r11, getTitle(r3), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0f0b, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0f0d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodo2, r11, getTitle(r3), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r8).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0f2f, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0f37, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0f39, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r11, "🖼 " + r2.messageOwner.message, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0f64, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhoto, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0f7e, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0f80, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGame, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0f92, code lost:
    
        r1 = r2.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0f94, code lost:
    
        if (r1 == null) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0f9a, code lost:
    
        if (r1.length() <= 0) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0f9c, code lost:
    
        r1 = r2.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0fa2, code lost:
    
        if (r1.length() <= 20) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0fa4, code lost:
    
        r2 = new java.lang.StringBuilder();
        r4 = 0;
        r2.append((java.lang.Object) r1.subSequence(0, 20));
        r2.append("...");
        r1 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0fba, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedText;
        r3 = getTitle(r3);
        r5 = new java.lang.Object[3];
        r5[r4] = r11;
        r5[1] = r1;
        r5[2] = r3;
        r1 = org.telegram.messenger.LocaleController.formatString(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0fb9, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0fd1, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0fe6, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeo, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0ff8, code lost:
    
        r1 = r2.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0ffc, code lost:
    
        if (r1 == null) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0ffe, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmoji, r11, getTitle(r3), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x1014, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedSticker, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x1029, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGameScore) == false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x102b, code lost:
    
        r1 = r25.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x1035, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x1037, code lost:
    
        r1 = org.telegram.messenger.utils.tlutils.TlUtils.getThemeEmoticonOrGiftTitle(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r5).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x1043, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x1047, code lost:
    
        if (r7 != r19) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x1049, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabledYou, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x1054, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString("ChatThemeDisabled", org.telegram.messenger.R.string.ChatThemeDisabled, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x106b, code lost:
    
        if (r7 != r19) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x106d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedYou, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x1079, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedTo, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x108a, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByRequest) == false) goto L843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x108c, code lost:
    
        r1 = r25.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x109c, code lost:
    
        if (r2.peer_id.channel_id == 0) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x10a0, code lost:
    
        if (r3.megagroup != false) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x10a6, code lost:
    
        if (r25.isVideoAvatar() == false) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x10a8, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelVideoEditNotification, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x10ba, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelPhotoEditNotification, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x10d1, code lost:
    
        if (r25.isVideoAvatar() == false) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x10d3, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupVideo, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x10e7, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupPhoto, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x10ff, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r3) == false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x1103, code lost:
    
        if (r3.megagroup != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x1109, code lost:
    
        if (r25.isMediaEmpty() == false) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x110b, code lost:
    
        if (r26 != false) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x1115, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageOwner.message) != false) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x1117, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r11, r25.messageOwner.message);
        r27[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x112e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageNoText, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x1140, code lost:
    
        if (r25.type != 29) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x1148, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r25) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x114a, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", (int) ((org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.MessageObject.getMedia(r25)).stars_amount, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x1165, code lost:
    
        r2 = r25.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x116b, code lost:
    
        if ((r2.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L667;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x116d, code lost:
    
        if (r26 != false) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x1175, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x1177, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r11, "🖼 " + r25.messageOwner.message);
        r27[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x119d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessagePhoto, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x11af, code lost:
    
        if (r25.isVideo() == false) goto L674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x11b1, code lost:
    
        if (r26 != false) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x11bb, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageOwner.message) != false) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x11bd, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r11, "📹 " + r25.messageOwner.message);
        r27[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x11e3, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageVideo, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x11f7, code lost:
    
        if (r25.isVoice() == false) goto L677;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x11f9, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageAudio, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x1209, code lost:
    
        if (r25.isRoundVideo() == false) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x120b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageRound, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x121b, code lost:
    
        if (r25.isMusic() == false) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x121d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageMusic, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x1229, code lost:
    
        r2 = r25.messageOwner.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x122f, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x1231, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r2;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageContact2, r11, org.telegram.messenger.ContactsController.formatName(r2.first_name, r2.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x124e, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L692;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x1250, code lost:
    
        r1 = ((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r2).poll;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x1256, code lost:
    
        if (r1.quiz == false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x1258, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageQuiz2, r11, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x126d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessagePoll2, r11, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x1284, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x1286, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageTodo2, r11, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r2).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x12a1, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x12a3, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) r2;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageChannelGiveaway, getTitle(r3), java.lang.Integer.valueOf(r2.quantity), java.lang.Integer.valueOf(r2.months));
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x12cb, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x12cf, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x12d7, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x12d9, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageLiveLocation, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x12e9, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L729;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x12ef, code lost:
    
        if (r25.isSticker() != false) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x12f5, code lost:
    
        if (r25.isAnimatedSticker() == false) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x12ff, code lost:
    
        if (r25.isGif() == false) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x1301, code lost:
    
        if (r26 != false) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x130b, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageOwner.message) != false) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x130d, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r11, "🎬 " + r25.messageOwner.message);
        r27[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x1333, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageGIF, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x1341, code lost:
    
        if (r26 != false) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x134b, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageOwner.message) != false) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x134d, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r11, "📎 " + r25.messageOwner.message);
        r27[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x1373, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageDocument, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1381, code lost:
    
        r1 = r25.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x1385, code lost:
    
        if (r1 == null) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x1387, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageStickerEmoji, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x1396, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageSticker, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x13a3, code lost:
    
        if (r26 != false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x13ab, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageText) != false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x13ad, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r11, r25.messageText);
        r27[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x13c1, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageNoText, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x13ce, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageMap, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x13de, code lost:
    
        if (r25.isMediaEmpty() == false) goto L743;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x13e0, code lost:
    
        if (r26 != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x13ea, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageOwner.message) != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x13ec, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r11, getTitle(r3), r25.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x1408, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupNoText, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x1421, code lost:
    
        if (r25.type != 29) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x1429, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r25) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x142b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralString("NotificationChatMessagePaidMedia", (int) ((org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.MessageObject.getMedia(r25)).stars_amount, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x1449, code lost:
    
        r2 = r25.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x144f, code lost:
    
        if ((r2.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x1451, code lost:
    
        if (r26 != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x1459, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x145b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r11, getTitle(r3), "🖼 " + r25.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x1486, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupPhoto, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x149f, code lost:
    
        if (r25.isVideo() == false) goto L762;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x14a1, code lost:
    
        if (r26 != false) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x14ab, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageOwner.message) != false) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x14ad, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r11, getTitle(r3), "📹 " + r25.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x14d8, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupVideo, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x14f4, code lost:
    
        if (r25.isVoice() == false) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x14f6, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupAudio, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x150c, code lost:
    
        if (r25.isRoundVideo() == false) goto L768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x150e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupRound, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x1524, code lost:
    
        if (r25.isMusic() == false) goto L771;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x1526, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupMusic, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x1538, code lost:
    
        r2 = r25.messageOwner.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x153e, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L774;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x1540, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r2;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupContact2, r11, getTitle(r3), org.telegram.messenger.ContactsController.formatName(r2.first_name, r2.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x1564, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x1566, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x156c, code lost:
    
        if (r2.poll.quiz == false) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x156e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupQuiz2, r11, getTitle(r3), r2.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x158c, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupPoll2, r11, getTitle(r3), r2.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x15ac, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x15ae, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupTodo2, r11, getTitle(r3), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r2).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x15d0, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L786;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x15d2, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupGame, r11, getTitle(r3), r25.messageOwner.media.game.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x15f4, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L789;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x15f6, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) r2;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageChannelGiveaway, getTitle(r3), java.lang.Integer.valueOf(r2.quantity), java.lang.Integer.valueOf(r2.months));
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x161f, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x1621, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.BoostingGiveawayResults, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x162d, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x1631, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x163a, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x163c, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupLiveLocation, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x1653, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x1659, code lost:
    
        if (r25.isSticker() != false) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x165f, code lost:
    
        if (r25.isAnimatedSticker() == false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x1669, code lost:
    
        if (r25.isGif() == false) goto L814;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x166b, code lost:
    
        if (r26 != false) goto L813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x1675, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageOwner.message) != false) goto L813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x1677, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r11, getTitle(r3), "🎬 " + r25.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x16a2, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupGif, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x16b7, code lost:
    
        if (r26 != false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x16c1, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageOwner.message) != false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x16c3, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r11, getTitle(r3), "📎 " + r25.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x16ee, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupDocument, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x1703, code lost:
    
        r1 = r25.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x1707, code lost:
    
        if (r1 == null) goto L822;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x1709, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupStickerEmoji, r11, getTitle(r3), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x171f, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupSticker, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x1732, code lost:
    
        if (r26 != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x173a, code lost:
    
        if (android.text.TextUtils.isEmpty(r25.messageText) != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x173c, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r11, getTitle(r3), r25.messageText);
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x1756, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupNoText, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x176b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString("NotificationMessageGroupMap", org.telegram.messenger.R.string.NotificationMessageGroupMap, r11, getTitle(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x069d, code lost:
    
        if (r6.getBoolean(r22, r12) != false) goto L315;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getStringForMessage(MessageObject messageObject, boolean z, boolean[] zArr, boolean[] zArr2) {
        String str;
        String str2;
        String title;
        TLRPC.Chat chat;
        String str3;
        boolean z2;
        String formatString;
        String str4;
        char c;
        boolean z3;
        String formatString2;
        String str5;
        if (AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return LocaleController.getString(R.string.YouHaveNewMessage);
        }
        if (messageObject.isStoryPush || messageObject.isStoryMentionPush) {
            return "!" + messageObject.messageOwner.message;
        }
        TLRPC.Message message = messageObject.messageOwner;
        long j = message.dialog_id;
        TLRPC.Peer peer = message.peer_id;
        long j2 = peer.chat_id;
        if (j2 == 0) {
            j2 = peer.channel_id;
        }
        long j3 = peer.user_id;
        if (zArr2 != null) {
            zArr2[0] = true;
        }
        if (messageObject.getDialogId() == UserObject.VERIFY && messageObject.getForwardedFromId() != null) {
            j3 = messageObject.getForwardedFromId().longValue();
            j2 = j3 < 0 ? -j3 : 0L;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        boolean z4 = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + j, true);
        if (messageObject.isFcmMessage()) {
            if (j2 == 0 && j3 != 0) {
                if (!z4 || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    return LocaleController.formatString(R.string.NotificationMessageNoText, messageObject.localName);
                }
            } else if (j2 != 0 && (!z4 || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true))))) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, messageObject.localUserName, messageObject.localName) : LocaleController.formatString(R.string.ChannelMessageNoText, messageObject.localName);
            }
            zArr[0] = true;
            return (String) messageObject.messageText;
        }
        long clientUserId = getUserConfig().getClientUserId();
        if (j3 == 0) {
            j3 = messageObject.getFromChatId();
            if (j3 == 0) {
                j3 = -j2;
            }
        } else if (j3 == clientUserId) {
            j3 = messageObject.getFromChatId();
        }
        if (j == 0) {
            if (j2 != 0) {
                j = -j2;
            } else if (j3 != 0) {
                j = j3;
            }
        }
        if (j3 > 0) {
            if (!messageObject.messageOwner.from_scheduled) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    title = UserObject.getUserName(user);
                } else {
                    str = "EnablePreviewChannel";
                    str2 = "EnablePreviewGroup";
                    title = null;
                }
            } else if (j == clientUserId) {
                title = LocaleController.getString(R.string.MessageScheduledReminderNotification);
            } else {
                title = LocaleController.getString(R.string.NotificationMessageScheduledName);
            }
            str = "EnablePreviewChannel";
            str2 = "EnablePreviewGroup";
        } else {
            str = "EnablePreviewChannel";
            str2 = "EnablePreviewGroup";
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
            if (chat2 != null) {
                title = getTitle(chat2);
            }
            title = null;
        }
        if (title == null) {
            return null;
        }
        if (j2 != 0) {
            chat = getMessagesController().getChat(Long.valueOf(j2));
            if (chat == null) {
                return null;
            }
        } else {
            chat = null;
        }
        if (!DialogObject.isEncryptedDialog(j)) {
            if (j2 != 0 || j3 == 0) {
                if (j2 != 0) {
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        str3 = str2;
                        z2 = false;
                    } else {
                        str3 = str2;
                        z2 = true;
                    }
                    if (z4) {
                        boolean z5 = !z2 ? true : true;
                        if (z2) {
                        }
                    }
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        formatString = LocaleController.formatString(R.string.ChannelMessageNoText, title);
                    } else if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        formatString = LocaleController.formatPluralString("NotificationMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, title);
                    } else {
                        formatString = LocaleController.formatString(R.string.NotificationMessageGroupNoText, title, getTitle(chat));
                    }
                }
                str4 = null;
            } else if (z4 && notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                TLRPC.Message message2 = messageObject.messageOwner;
                if (message2 instanceof TLRPC.TL_messageService) {
                    TLRPC.MessageAction messageAction = message2.action;
                    if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                        formatString = LocaleController.getString(R.string.WallpaperSameNotification);
                    } else if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                        formatString = LocaleController.getString(R.string.WallpaperNotification);
                    } else if (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) {
                        formatString = messageObject.messageText.toString();
                    } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                        formatString = messageObject.messageText.toString();
                    } else if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                        formatString = messageObject.messageText.toString();
                    } else if ((messageAction instanceof TLRPC.TL_messageActionUserJoined) || (messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                        formatString = LocaleController.formatString(R.string.NotificationContactJoined, title);
                    } else if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        formatString = LocaleController.formatString(R.string.NotificationContactNewPhoto, title);
                    } else if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                        String formatString3 = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(messageObject.messageOwner.date * 1000), LocaleController.getInstance().getFormatterDay().format(messageObject.messageOwner.date * 1000));
                        int i = R.string.NotificationUnrecognizedDevice;
                        String str6 = getUserConfig().getCurrentUser().first_name;
                        TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                        formatString = LocaleController.formatString(i, str6, formatString3, messageAction2.title, messageAction2.address);
                    } else if ((messageAction instanceof TLRPC.TL_messageActionGameScore) || (messageAction instanceof TLRPC.TL_messageActionPaymentSent) || (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe)) {
                        formatString = messageObject.messageText.toString();
                    } else if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionGiftPremium) || (messageAction instanceof TLRPC.TL_messageActionGiftTon)) {
                        formatString = messageObject.messageText.toString();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        formatString = messageObject.messageText.toString();
                    } else if ((messageAction instanceof TLRPC.TL_messageActionPaidMessagesRefunded) || (messageAction instanceof TLRPC.TL_messageActionPaidMessagesPrice)) {
                        formatString = messageObject.messageText.toString();
                    } else if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                        if (messageAction.video) {
                            formatString = LocaleController.getString(R.string.CallMessageVideoIncomingMissed);
                        } else {
                            formatString = LocaleController.getString(R.string.CallMessageIncomingMissed);
                        }
                    } else if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        if (messageAction.video) {
                            formatString = LocaleController.getString(R.string.CallMessageVideoIncomingConferenceMissed);
                        } else {
                            formatString = LocaleController.getString(R.string.CallMessageIncomingConferenceMissed);
                        }
                    } else {
                        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                            String themeEmoticonOrGiftTitle = TlUtils.getThemeEmoticonOrGiftTitle(((TLRPC.TL_messageActionSetChatTheme) messageAction).theme);
                            if (!TextUtils.isEmpty(themeEmoticonOrGiftTitle)) {
                                c = 0;
                                z3 = true;
                                if (j == clientUserId) {
                                    formatString2 = LocaleController.formatString(R.string.ChatThemeChangedYou, themeEmoticonOrGiftTitle);
                                } else {
                                    formatString2 = LocaleController.formatString(R.string.ChatThemeChangedTo, title, themeEmoticonOrGiftTitle);
                                }
                            } else {
                                if (j == clientUserId) {
                                    c = 0;
                                    str5 = LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]);
                                    z3 = true;
                                    zArr[c] = z3;
                                    return str5;
                                }
                                c = 0;
                                z3 = true;
                                formatString2 = LocaleController.formatString(R.string.ChatThemeDisabled, title, themeEmoticonOrGiftTitle);
                            }
                            str5 = formatString2;
                            zArr[c] = z3;
                            return str5;
                        }
                        str4 = null;
                    }
                } else if (!messageObject.isMediaEmpty()) {
                    TLRPC.Message message3 = messageObject.messageOwner;
                    if (message3.media instanceof TLRPC.TL_messageMediaPhoto) {
                        if (!z && !TextUtils.isEmpty(message3.message)) {
                            String formatString4 = LocaleController.formatString(R.string.NotificationMessageText, title, "🖼 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return formatString4;
                        }
                        if (messageObject.messageOwner.media.ttl_seconds != 0) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageSDPhoto, title);
                        } else {
                            formatString = LocaleController.formatString(R.string.NotificationMessagePhoto, title);
                        }
                    } else if (messageObject.isVideo()) {
                        if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            String formatString5 = LocaleController.formatString(R.string.NotificationMessageText, title, "📹 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return formatString5;
                        }
                        if (messageObject.messageOwner.media.ttl_seconds != 0) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageSDVideo, title);
                        } else {
                            formatString = LocaleController.formatString(R.string.NotificationMessageVideo, title);
                        }
                    } else if (messageObject.isGame()) {
                        formatString = LocaleController.formatString(R.string.NotificationMessageGame, title, messageObject.messageOwner.media.game.title);
                    } else if (messageObject.isVoice()) {
                        formatString = LocaleController.formatString(R.string.NotificationMessageAudio, title);
                    } else if (messageObject.isRoundVideo()) {
                        formatString = LocaleController.formatString(R.string.NotificationMessageRound, title);
                    } else if (messageObject.isMusic()) {
                        formatString = LocaleController.formatString(R.string.NotificationMessageMusic, title);
                    } else {
                        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                            TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageMedia;
                            formatString = LocaleController.formatString(R.string.NotificationMessageContact2, title, ContactsController.formatName(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                            formatString = LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, title, Integer.valueOf(tL_messageMediaGiveaway.quantity), Integer.valueOf(tL_messageMediaGiveaway.months));
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            formatString = LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                            if (poll.quiz) {
                                formatString = LocaleController.formatString(R.string.NotificationMessageQuiz2, title, poll.question.text);
                            } else {
                                formatString = LocaleController.formatString(R.string.NotificationMessagePoll2, title, poll.question.text);
                            }
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageTodo2, title, ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                        } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageMap, title);
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageLiveLocation, title);
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                            if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                                String stickerEmoji = messageObject.getStickerEmoji();
                                if (stickerEmoji != null) {
                                    formatString = LocaleController.formatString(R.string.NotificationMessageStickerEmoji, title, stickerEmoji);
                                } else {
                                    formatString = LocaleController.formatString(R.string.NotificationMessageSticker, title);
                                }
                            } else if (messageObject.isGif()) {
                                if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    String formatString6 = LocaleController.formatString(R.string.NotificationMessageText, title, "🎬 " + messageObject.messageOwner.message);
                                    zArr[0] = true;
                                    return formatString6;
                                }
                                formatString = LocaleController.formatString(R.string.NotificationMessageGif, title);
                            } else {
                                if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    String formatString7 = LocaleController.formatString(R.string.NotificationMessageText, title, "📎 " + messageObject.messageOwner.message);
                                    zArr[0] = true;
                                    return formatString7;
                                }
                                formatString = LocaleController.formatString(R.string.NotificationMessageDocument, title);
                            }
                        } else {
                            if (!z && !TextUtils.isEmpty(messageObject.messageText)) {
                                String formatString8 = LocaleController.formatString(R.string.NotificationMessageText, title, messageObject.messageText);
                                zArr[0] = true;
                                return formatString8;
                            }
                            formatString = LocaleController.formatString(R.string.NotificationMessageNoText, title);
                        }
                    }
                } else if (!z) {
                    if (!TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        String formatString9 = LocaleController.formatString(R.string.NotificationMessageText, title, messageObject.messageOwner.message);
                        zArr[0] = true;
                        return formatString9;
                    }
                    formatString = LocaleController.formatString(R.string.NotificationMessageNoText, title);
                } else {
                    formatString = LocaleController.formatString(R.string.NotificationMessageNoText, title);
                }
            } else {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                formatString = LocaleController.formatString(R.string.NotificationMessageNoText, title);
            }
            return str4;
        }
        formatString = LocaleController.getString(R.string.YouHaveNewMessage);
        return formatString;
    }

    private void scheduleNotificationRepeat() {
        try {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(ApplicationLoader.applicationContext, 0, intent, 33554432);
            if (getAccountInstance().getNotificationsSettings().getInt("repeat_messages", 60) > 0 && this.personalCount > 0) {
                this.alarmManager.set(2, SystemClock.elapsedRealtime() + (r1 * 60000), service);
            } else {
                this.alarmManager.cancel(service);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private boolean isPersonalMessage(MessageObject messageObject) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.Peer peer = message.peer_id;
        return (peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || messageObject.isStoryReactionPush;
    }

    private int getNotifyOverride(SharedPreferences sharedPreferences, long j, long j2) {
        int property = this.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_NOTIFY, j, j2, -1);
        if (property != 3 || this.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, j, j2, 0) < getConnectionsManager().getCurrentTime()) {
            return property;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifications$33() {
        showOrUpdateNotification(false);
    }

    public void showNotifications() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda74
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$showNotifications$33();
            }
        });
    }

    public void hideNotifications() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda39
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$hideNotifications$34();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideNotifications$34() {
        notificationManager.cancel(this.notificationId);
        this.lastWearNotifiedMessageId.clear();
        for (int i = 0; i < this.wearNotificationsIds.size(); i++) {
            notificationManager.cancel(((Integer) this.wearNotificationsIds.valueAt(i)).intValue());
        }
        this.wearNotificationsIds.clear();
    }

    private void dismissNotification() {
        FileLog.d("NotificationsController dismissNotification");
        try {
            notificationManager.cancel(this.notificationId);
            this.pushMessages.clear();
            this.pushMessagesDict.clear();
            this.lastWearNotifiedMessageId.clear();
            for (int i = 0; i < this.wearNotificationsIds.size(); i++) {
                if (!this.openedInBubbleDialogs.contains(Long.valueOf(this.wearNotificationsIds.keyAt(i)))) {
                    notificationManager.cancel(((Integer) this.wearNotificationsIds.valueAt(i)).intValue());
                }
            }
            this.wearNotificationsIds.clear();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.lambda$dismissNotification$35();
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dismissNotification$35() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    private void playInChatSound() {
        if (!this.inChatSoundEnabled || MediaController.getInstance().isRecordingAudio()) {
            return;
        }
        try {
            if (audioManager.getRingerMode() == 0) {
                return;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            if (getNotifyOverride(getAccountInstance().getNotificationsSettings(), this.openedDialogId, this.openedTopicId) == 2) {
                return;
            }
            notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$playInChatSound$37();
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playInChatSound$37() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundPlay) <= 500) {
            return;
        }
        try {
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda43
                    @Override // android.media.SoundPool.OnLoadCompleteListener
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.lambda$playInChatSound$36(soundPool2, i, i2);
                    }
                });
            }
            if (this.soundIn == 0 && !this.soundInLoaded) {
                this.soundInLoaded = true;
                this.soundIn = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_in, 1);
            }
            int i = this.soundIn;
            if (i != 0) {
                try {
                    this.soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$playInChatSound$36(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            try {
                soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private void scheduleNotificationDelay(boolean z) {
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("delay notification start, onlineReason = " + z);
            }
            this.notificationDelayWakelock.acquire(10000L);
            DispatchQueue dispatchQueue = notificationsQueue;
            dispatchQueue.cancelRunnable(this.notificationDelayRunnable);
            dispatchQueue.postRunnable(this.notificationDelayRunnable, z ? 3000 : MediaDataController.MAX_STYLE_RUNS_COUNT);
        } catch (Exception e) {
            FileLog.e(e);
            showOrUpdateNotification(this.notifyCheck);
        }
    }

    protected void repeatNotificationMaybe() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$repeatNotificationMaybe$38();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repeatNotificationMaybe$38() {
        int i = Calendar.getInstance().get(11);
        if (i >= 11 && i <= 22) {
            notificationManager.cancel(this.notificationId);
            showOrUpdateNotification(true);
        } else {
            scheduleNotificationRepeat();
        }
    }

    private boolean isEmptyVibration(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        for (long j : jArr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public void deleteNotificationChannel(long j, long j2) {
        deleteNotificationChannel(j, j2, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deleteNotificationChannelInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$deleteNotificationChannel$39(long j, long j2, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            SharedPreferences.Editor edit = notificationsSettings.edit();
            if (i == 0 || i == -1) {
                String str = "org.telegram.key" + j;
                if (j2 != 0) {
                    str = str + ".topic" + j2;
                }
                String string = notificationsSettings.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel internal " + string);
                    }
                }
            }
            if (i == 1 || i == -1) {
                String str2 = "org.telegram.keyia" + j;
                String string2 = notificationsSettings.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2 + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel internal " + string2);
                    }
                }
            }
            edit.commit();
        } catch (Exception e3) {
            FileLog.e(e3);
        }
    }

    public void deleteNotificationChannel(final long j, final long j2, final int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda64
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$deleteNotificationChannel$39(j, j2, i);
            }
        });
    }

    public void deleteNotificationChannelGlobal(int i) {
        deleteNotificationChannelGlobal(i, -1);
    }

    /* renamed from: deleteNotificationChannelGlobalInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$deleteNotificationChannelGlobal$40(int i, int i2) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            SharedPreferences.Editor edit = notificationsSettings.edit();
            if (i2 == 0 || i2 == -1) {
                if (i == 2) {
                    str = "channels";
                } else if (i == 0) {
                    str = "groups";
                } else if (i == 3) {
                    str = "stories";
                } else {
                    if (i != 4 && i != 5) {
                        str = "private";
                    }
                    str = "reactions";
                }
                String string = notificationsSettings.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel global internal " + string);
                    }
                }
            }
            if (i2 == 1 || i2 == -1) {
                if (i == 2) {
                    str2 = "channels_ia";
                } else if (i == 0) {
                    str2 = "groups_ia";
                } else if (i == 3) {
                    str2 = "stories_ia";
                } else {
                    if (i != 4 && i != 5) {
                        str2 = "private_ia";
                    }
                    str2 = "reactions_ia";
                }
                String string2 = notificationsSettings.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2 + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel global internal " + string2);
                    }
                }
            }
            if (i == 2) {
                str3 = "overwrite_channel";
            } else if (i == 0) {
                str3 = "overwrite_group";
            } else if (i == 3) {
                str3 = "overwrite_stories";
            } else {
                if (i != 4 && i != 5) {
                    str3 = "overwrite_private";
                }
                str3 = "overwrite_reactions";
            }
            edit.remove(str3);
            edit.commit();
        } catch (Exception e3) {
            FileLog.e(e3);
        }
    }

    public void deleteNotificationChannelGlobal(final int i, final int i2) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$deleteNotificationChannelGlobal$40(i, i2);
            }
        });
    }

    public void deleteAllNotificationChannels() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda61
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$deleteAllNotificationChannels$41();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllNotificationChannels$41() {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private boolean unsupportedNotificationShortcut() {
        return Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBubbles;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:36:0x010c, B:38:0x0112, B:39:0x0117, B:40:0x0115, B:41:0x011c, B:42:0x00f8, B:44:0x0079, B:45:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:36:0x010c, B:38:0x0112, B:39:0x0117, B:40:0x0115, B:41:0x011c, B:42:0x00f8, B:44:0x0079, B:45:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:36:0x010c, B:38:0x0112, B:39:0x0117, B:40:0x0115, B:41:0x011c, B:42:0x00f8, B:44:0x0079, B:45:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154 A[Catch: Exception -> 0x0066, TRY_LEAVE, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:36:0x010c, B:38:0x0112, B:39:0x0117, B:40:0x0115, B:41:0x011c, B:42:0x00f8, B:44:0x0079, B:45:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:8:0x0021, B:11:0x0062, B:12:0x006d, B:15:0x007d, B:17:0x00a6, B:19:0x00b6, B:20:0x00c0, B:22:0x00f4, B:23:0x00fc, B:25:0x0105, B:27:0x0126, B:30:0x013d, B:34:0x0154, B:36:0x010c, B:38:0x0112, B:39:0x0117, B:40:0x0115, B:41:0x011c, B:42:0x00f8, B:44:0x0079, B:45:0x0069), top: B:7:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String createNotificationShortcut(NotificationCompat.Builder builder, long j, String str, TLRPC.User user, TLRPC.Chat chat, Person person, boolean z) {
        Bitmap bitmap;
        IconCompat createWithResource;
        if (unsupportedNotificationShortcut() || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            return null;
        }
        try {
            String str2 = "ndid_" + j;
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
            intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (j > 0) {
                intent.putExtra("userId", j);
            } else {
                intent.putExtra("chatId", -j);
            }
            ShortcutInfoCompat.Builder locusId = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, str2).setShortLabel(chat != null ? str : UserObject.getFirstName(user)).setLongLabel(str).setIntent(new Intent("android.intent.action.VIEW")).setIntent(intent).setLongLived(true).setLocusId(new LocusIdCompat(str2));
            if (person != null) {
                locusId.setPerson(person);
                locusId.setIcon(person.getIcon());
                if (person.getIcon() != null) {
                    bitmap = person.getIcon().getBitmap();
                    ShortcutInfoCompat build = locusId.build();
                    ShortcutManagerCompat.pushDynamicShortcut(ApplicationLoader.applicationContext, build);
                    builder.setShortcutInfo(build);
                    Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) BubbleActivity.class);
                    intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    if (!DialogObject.isUserDialog(j)) {
                        intent2.putExtra("userId", j);
                    } else {
                        intent2.putExtra("chatId", -j);
                    }
                    intent2.putExtra("currentAccount", this.currentAccount);
                    if (bitmap == null) {
                        createWithResource = IconCompat.createWithAdaptiveBitmap(bitmap);
                    } else if (user != null) {
                        createWithResource = IconCompat.createWithResource(ApplicationLoader.applicationContext, user.bot ? R.drawable.book_bot : R.drawable.book_user);
                    } else {
                        createWithResource = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
                    }
                    if (!z) {
                        NotificationCompat.BubbleMetadata.Builder builder2 = new NotificationCompat.BubbleMetadata.Builder(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160), createWithResource);
                        builder2.setSuppressNotification(this.openedDialogId == j);
                        builder2.setAutoExpandBubble(false);
                        builder2.setDesiredHeight(AndroidUtilities.dp(640.0f));
                        builder.setBubbleMetadata(builder2.build());
                    } else {
                        builder.setBubbleMetadata(null);
                    }
                    return str2;
                }
            }
            bitmap = null;
            ShortcutInfoCompat build2 = locusId.build();
            ShortcutManagerCompat.pushDynamicShortcut(ApplicationLoader.applicationContext, build2);
            builder.setShortcutInfo(build2);
            Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) BubbleActivity.class);
            intent22.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (!DialogObject.isUserDialog(j)) {
            }
            intent22.putExtra("currentAccount", this.currentAccount);
            if (bitmap == null) {
            }
            if (!z) {
            }
            return str2;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    protected void ensureGroupsCreated() {
        List notificationChannels;
        String id;
        int importance;
        List notificationChannelGroups;
        String id2;
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        if (this.groupsCreated == null) {
            this.groupsCreated = Boolean.valueOf(notificationsSettings.getBoolean("groupsCreated5", false));
        }
        if (!this.groupsCreated.booleanValue()) {
            try {
                String str = this.currentAccount + "channel";
                notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                SharedPreferences.Editor editor = null;
                for (int i = 0; i < size; i++) {
                    NotificationChannel m = NotificationsController$$ExternalSyntheticApiModelOutline13.m(notificationChannels.get(i));
                    id = m.getId();
                    if (id.startsWith(str)) {
                        importance = m.getImportance();
                        if (importance != 4 && importance != 5 && !id.contains("_ia_")) {
                            if (id.contains("_channels_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_channel").remove("vibrate_channel").remove("ChannelSoundPath").remove("ChannelSound");
                            } else if (id.contains("_reactions_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_react").remove("vibrate_react").remove("ReactionSoundPath").remove("ReactionSound");
                            } else if (id.contains("_groups_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_group").remove("vibrate_group").remove("GroupSoundPath").remove("GroupSound");
                            } else if (id.contains("_private_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_messages");
                                editor.remove("priority_group").remove("vibrate_messages").remove("GlobalSoundPath").remove("GlobalSound");
                            } else {
                                long longValue = Utilities.parseLong(id.substring(9, id.indexOf(95, 9))).longValue();
                                if (longValue != 0) {
                                    if (editor == null) {
                                        editor = getAccountInstance().getNotificationsSettings().edit();
                                    }
                                    editor.remove("priority_" + longValue).remove("vibrate_" + longValue).remove("sound_path_" + longValue).remove("sound_" + longValue);
                                }
                            }
                        }
                        systemNotificationManager.deleteNotificationChannel(id);
                    }
                }
                if (editor != null) {
                    editor.commit();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            notificationsSettings.edit().putBoolean("groupsCreated5", true).commit();
            this.groupsCreated = Boolean.TRUE;
        }
        if (this.channelGroupsCreated) {
            return;
        }
        notificationChannelGroups = systemNotificationManager.getNotificationChannelGroups();
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
        for (int i2 = 0; i2 < size2; i2++) {
            id2 = NotificationsController$$ExternalSyntheticApiModelOutline16.m(notificationChannelGroups.get(i2)).getId();
            if (str2 != null && str2.equals(id2)) {
                str2 = null;
            } else if (str3 != null && str3.equals(id2)) {
                str3 = null;
            } else if (str10 != null && str10.equals(id2)) {
                str10 = null;
            } else if (str9 != null && str9.equals(id2)) {
                str9 = null;
            } else if (str11 != null && str11.equals(id2)) {
                str11 = null;
            } else if (str8 != null && str8.equals(id2)) {
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
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str2, LocaleController.getString(R.string.NotificationsChannels) + str12));
            }
            if (str3 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str3, LocaleController.getString(R.string.NotificationsGroups) + str12));
            }
            if (str10 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str10, LocaleController.getString(R.string.NotificationsStories) + str12));
            }
            if (str9 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str9, LocaleController.getString(R.string.NotificationsReactions) + str12));
            }
            if (str11 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str11, LocaleController.getString(R.string.NotificationsPrivateChats) + str12));
            }
            if (str8 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str8, LocaleController.getString(R.string.NotificationsOther) + str12));
            }
            systemNotificationManager.createNotificationChannelGroups(arrayList);
        }
        this.channelGroupsCreated = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x05f0 A[LOOP:1: B:99:0x05ed->B:101:0x05f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0611 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0622 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05df A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String validateChannelId(long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String uri2;
        String str7;
        String formatString;
        String str8;
        String str9;
        String string;
        StringBuilder sb;
        String str10;
        String str11;
        String str12;
        String str13;
        NotificationsController notificationsController;
        long j3;
        String str14;
        String str15;
        boolean z4;
        String str16;
        int i4;
        String str17;
        long[] jArr2;
        String str18;
        String str19;
        String str20;
        boolean z5;
        String str21;
        int i5;
        String str22;
        Uri uri3;
        String MD5;
        boolean z6;
        boolean z7;
        NotificationChannel notificationChannel;
        int importance;
        Uri sound;
        long[] vibrationPattern;
        boolean shouldVibrate;
        boolean z8;
        long[] jArr3;
        int lightColor;
        String str23;
        String str24;
        String str25;
        int i6;
        long[] jArr4;
        SharedPreferences.Editor editor;
        boolean z9;
        boolean z10;
        int i7;
        String str26;
        String str27;
        ensureGroupsCreated();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        String str28 = "stories";
        if (z3) {
            str4 = "other" + this.currentAccount;
            str5 = null;
        } else {
            if (i3 == 2) {
                str2 = "channels" + this.currentAccount;
                str3 = "overwrite_channel";
            } else if (i3 == 0) {
                str2 = "groups" + this.currentAccount;
                str3 = "overwrite_group";
            } else if (i3 == 3) {
                str2 = "stories" + this.currentAccount;
                str3 = "overwrite_stories";
            } else if (i3 == 4 || i3 == 5) {
                str2 = "reactions" + this.currentAccount;
                str3 = "overwrite_reactions";
            } else {
                str2 = "private" + this.currentAccount;
                str3 = "overwrite_private";
            }
            String str29 = str3;
            str4 = str2;
            str5 = str29;
        }
        boolean z11 = !z && DialogObject.isEncryptedDialog(j);
        boolean z12 = (z2 || str5 == null || !notificationsSettings.getBoolean(str5, false)) ? false : true;
        if (uri == null) {
            StringBuilder sb2 = new StringBuilder();
            str6 = "reactions";
            sb2.append("NoSound");
            sb2.append(2);
            uri2 = sb2.toString();
        } else {
            str6 = "reactions";
            uri2 = uri.toString();
        }
        String MD52 = Utilities.MD5(uri2);
        if (MD52 != null) {
            str7 = "private";
            if (MD52.length() > 5) {
                MD52 = MD52.substring(0, 5);
            }
        } else {
            str7 = "private";
        }
        if (z3) {
            formatString = LocaleController.getString(R.string.NotificationsSilent);
            str28 = "silent";
        } else {
            if (z) {
                String string2 = LocaleController.getString(z2 ? R.string.NotificationsInAppDefault : R.string.NotificationsDefault);
                if (i3 == 2) {
                    if (z2) {
                        str8 = "channels_ia";
                        str9 = string2;
                    } else {
                        str9 = string2;
                        str8 = "channels";
                    }
                } else if (i3 != 0) {
                    if (i3 == 3) {
                        if (z2) {
                            str8 = "stories_ia";
                        } else {
                            str9 = string2;
                            str8 = str28;
                        }
                    } else if (i3 == 4 || i3 == 5) {
                        str8 = z2 ? "reactions_ia" : str6;
                    } else if (z2) {
                        str8 = "private_ia";
                    } else {
                        str9 = string2;
                        str8 = str7;
                    }
                    str9 = string2;
                } else if (z2) {
                    str8 = "groups_ia";
                    str9 = string2;
                } else {
                    str9 = string2;
                    str8 = "groups";
                }
                String str30 = str8 + "_" + MD52;
                string = notificationsSettings.getString(str30, null);
                String string3 = notificationsSettings.getString(str30 + "_s", null);
                StringBuilder sb3 = new StringBuilder();
                if (string != null) {
                    sb = sb3;
                    str10 = string3;
                    str11 = "_s";
                    str12 = string;
                    str13 = "secret";
                    notificationsController = this;
                    j3 = j;
                    str14 = "channel_";
                    str15 = str4;
                    z4 = z12;
                    str16 = "_";
                    i4 = i;
                    str17 = str30;
                    jArr2 = jArr;
                } else {
                    notificationChannel = systemNotificationManager.getNotificationChannel(string);
                    if (!BuildVars.LOGS_ENABLED) {
                        str14 = "channel_";
                        str15 = str4;
                    } else {
                        str15 = str4;
                        StringBuilder sb4 = new StringBuilder();
                        str14 = "channel_";
                        sb4.append("current channel for ");
                        sb4.append(string);
                        sb4.append(" = ");
                        sb4.append(notificationChannel);
                        FileLog.d(sb4.toString());
                    }
                    if (notificationChannel == null) {
                        str11 = "_s";
                        jArr2 = jArr;
                        sb = sb3;
                        str13 = "secret";
                        notificationsController = this;
                        j3 = j;
                        z4 = z12;
                        str16 = "_";
                        str17 = str30;
                        i4 = i;
                        str20 = null;
                        str19 = null;
                        str18 = null;
                        z5 = false;
                        if (z5) {
                        }
                        str21 = str11;
                        if (!z4) {
                        }
                        i5 = 0;
                        while (i5 < jArr2.length) {
                        }
                        str22 = str21;
                        sb.append(i4);
                        uri3 = uri;
                        if (uri3 != null) {
                        }
                        sb.append(i2);
                        if (!z) {
                            sb.append(str13);
                        }
                        MD5 = Utilities.MD5(sb.toString());
                        if (!z3) {
                            systemNotificationManager.deleteNotificationChannel(str18);
                            if (BuildVars.LOGS_ENABLED) {
                            }
                            str18 = null;
                        }
                        if (str18 == null) {
                        }
                        return str18;
                    }
                    if (!z3 && !z12) {
                        importance = notificationChannel.getImportance();
                        sound = notificationChannel.getSound();
                        vibrationPattern = notificationChannel.getVibrationPattern();
                        z4 = z12;
                        shouldVibrate = notificationChannel.shouldVibrate();
                        if (shouldVibrate || vibrationPattern != null) {
                            z8 = shouldVibrate;
                            jArr3 = vibrationPattern;
                        } else {
                            z8 = shouldVibrate;
                            jArr3 = new long[]{0, 0};
                        }
                        lightColor = notificationChannel.getLightColor();
                        if (jArr3 != null) {
                            for (long j4 : jArr3) {
                                sb3.append(j4);
                            }
                        }
                        sb3.append(lightColor);
                        if (sound != null) {
                            sb3.append(sound.toString());
                        }
                        sb3.append(importance);
                        if (!z && z11) {
                            sb3.append("secret");
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("current channel settings for " + string + " = " + ((Object) sb3) + " old = " + string3);
                        }
                        String MD53 = Utilities.MD5(sb3.toString());
                        sb3.setLength(0);
                        if (z2 && i2 != importance) {
                            str11 = "_s";
                            jArr2 = jArr;
                            i4 = i;
                            sb = sb3;
                            str23 = string3;
                            str24 = string;
                            str13 = "secret";
                            notificationsController = this;
                            str25 = MD53;
                            str16 = "_";
                            z5 = false;
                            z4 = true;
                            j3 = j;
                            str17 = str30;
                        } else if (MD53.equals(string3)) {
                            str11 = "_s";
                            jArr2 = jArr;
                            i4 = i;
                            sb = sb3;
                            str23 = string3;
                            str24 = string;
                            str13 = "secret";
                            notificationsController = this;
                            str25 = MD53;
                            str16 = "_";
                            j3 = j;
                            str17 = str30;
                            z5 = false;
                        } else {
                            if (importance == 0) {
                                SharedPreferences.Editor edit = notificationsSettings.edit();
                                if (z) {
                                    if (!z2) {
                                        if (i3 == 3) {
                                            edit.putBoolean("EnableAllStories", false);
                                        } else if (i3 == 4) {
                                            edit.putBoolean("EnableReactionsMessages", true);
                                            edit.putBoolean("EnableReactionsStories", true);
                                        } else {
                                            edit.putInt(getGlobalNotificationsKey(i3), ConnectionsManager.DEFAULT_DATACENTER_ID);
                                        }
                                        updateServerNotificationsSettings(i3);
                                    }
                                    str11 = "_s";
                                    str17 = str30;
                                    str24 = string;
                                    str27 = "secret";
                                    str25 = MD53;
                                    i6 = lightColor;
                                    str16 = "_";
                                    sb = sb3;
                                    str23 = string3;
                                } else {
                                    if (i3 == 3) {
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY);
                                        i6 = lightColor;
                                        sb5.append(getSharedPrefKey(j, 0L));
                                        edit.putBoolean(sb5.toString(), false);
                                        str26 = "secret";
                                    } else {
                                        str26 = "secret";
                                        i6 = lightColor;
                                        edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + getSharedPrefKey(j, 0L), 2);
                                    }
                                    str11 = "_s";
                                    str23 = string3;
                                    str17 = str30;
                                    str24 = string;
                                    sb = sb3;
                                    str25 = MD53;
                                    str16 = "_";
                                    str27 = str26;
                                    updateServerNotificationsSettings(j, 0L, true);
                                }
                                j3 = j;
                                str13 = str27;
                                editor = edit;
                                jArr4 = jArr3;
                            } else {
                                str11 = "_s";
                                str17 = str30;
                                str24 = string;
                                str13 = "secret";
                                str25 = MD53;
                                i6 = lightColor;
                                str16 = "_";
                                sb = sb3;
                                j3 = j;
                                str23 = string3;
                                if (importance == i2) {
                                    jArr4 = jArr3;
                                    editor = null;
                                    z9 = false;
                                    notificationsController = this;
                                    jArr2 = jArr;
                                    z10 = z8;
                                    if ((!notificationsController.isEmptyVibration(jArr2)) == z10) {
                                        if (!z2) {
                                            if (editor == null) {
                                                editor = notificationsSettings.edit();
                                            }
                                            if (!z) {
                                                editor.putInt("vibrate_" + j3, z10 ? 0 : 2);
                                            } else if (i3 == 2) {
                                                editor.putInt("vibrate_channel", z10 ? 0 : 2);
                                            } else if (i3 == 0) {
                                                editor.putInt("vibrate_group", z10 ? 0 : 2);
                                            } else if (i3 == 3) {
                                                editor.putInt("vibrate_stories", z10 ? 0 : 2);
                                            } else if (i3 == 4 || i3 == 5) {
                                                editor.putInt("vibrate_react", z10 ? 0 : 2);
                                            } else {
                                                editor.putInt("vibrate_messages", z10 ? 0 : 2);
                                            }
                                        }
                                        jArr2 = jArr4;
                                        i4 = i;
                                        i7 = i6;
                                        z9 = true;
                                    } else {
                                        i4 = i;
                                        i7 = i6;
                                    }
                                    if (i7 != i4) {
                                        if (!z2) {
                                            if (editor == null) {
                                                editor = notificationsSettings.edit();
                                            }
                                            if (!z) {
                                                editor.putInt("color_" + j3, i7);
                                            } else if (i3 == 2) {
                                                editor.putInt("ChannelLed", i7);
                                            } else if (i3 == 0) {
                                                editor.putInt("GroupLed", i7);
                                            } else if (i3 == 3) {
                                                editor.putInt("StoriesLed", i7);
                                            } else if (i3 == 5 || i3 == 4) {
                                                editor.putInt("ReactionsLed", i7);
                                            } else {
                                                editor.putInt("MessagesLed", i7);
                                            }
                                        }
                                        i4 = i7;
                                        z9 = true;
                                    }
                                    if (editor != null) {
                                        editor.commit();
                                    }
                                    z5 = z9;
                                } else if (z2) {
                                    jArr4 = jArr3;
                                    editor = null;
                                } else {
                                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                                    jArr4 = jArr3;
                                    int i8 = (importance == 4 || importance == 5) ? 1 : importance == 1 ? 4 : importance == 2 ? 5 : 0;
                                    if (z) {
                                        if (i3 == 3) {
                                            edit2.putBoolean("EnableAllStories", true);
                                        } else if (i3 == 4) {
                                            edit2.putBoolean("EnableReactionsMessages", true);
                                            edit2.putBoolean("EnableReactionsStories", true);
                                        } else {
                                            edit2.putInt(getGlobalNotificationsKey(i3), 0);
                                        }
                                        if (i3 == 2) {
                                            edit2.putInt("priority_channel", i8);
                                        } else if (i3 == 0) {
                                            edit2.putInt("priority_group", i8);
                                        } else if (i3 == 3) {
                                            edit2.putInt("priority_stories", i8);
                                        } else if (i3 == 4 || i3 == 5) {
                                            edit2.putInt("priority_react", i8);
                                        } else {
                                            edit2.putInt("priority_messages", i8);
                                        }
                                    } else if (i3 == 3) {
                                        edit2.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + j3, true);
                                    } else {
                                        edit2.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + j3, 0);
                                        edit2.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + j3);
                                        edit2.putInt("priority_" + j3, i8);
                                    }
                                    editor = edit2;
                                }
                            }
                            z9 = true;
                            notificationsController = this;
                            jArr2 = jArr;
                            z10 = z8;
                            if ((!notificationsController.isEmptyVibration(jArr2)) == z10) {
                            }
                            if (i7 != i4) {
                            }
                            if (editor != null) {
                            }
                            z5 = z9;
                        }
                        str19 = str25;
                        str20 = str23;
                        str18 = str24;
                        if (z5 || str19 == null) {
                            str21 = str11;
                            if (!z4 || str19 == null || !z2 || !z) {
                                i5 = 0;
                                while (i5 < jArr2.length) {
                                    sb.append(jArr2[i5]);
                                    i5++;
                                    str21 = str21;
                                }
                                str22 = str21;
                                sb.append(i4);
                                uri3 = uri;
                                if (uri3 != null) {
                                    sb.append(uri.toString());
                                }
                                sb.append(i2);
                                if (!z && z11) {
                                    sb.append(str13);
                                }
                                MD5 = Utilities.MD5(sb.toString());
                                if (!z3 && str18 != null && (z4 || !str20.equals(MD5))) {
                                    try {
                                        systemNotificationManager.deleteNotificationChannel(str18);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("delete channel by settings change " + str18);
                                    }
                                    str18 = null;
                                }
                                if (str18 == null) {
                                    str18 = z ? notificationsController.currentAccount + str14 + str17 + str16 + Utilities.random.nextLong() : notificationsController.currentAccount + str14 + j3 + str16 + Utilities.random.nextLong();
                                    SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                                    if (z11) {
                                        str9 = LocaleController.getString(R.string.SecretChatName);
                                    }
                                    NotificationChannel m = zzo$$ExternalSyntheticApiModelOutline2.m(str18, str9, i2);
                                    m.setGroup(str15);
                                    if (i4 != 0) {
                                        z6 = true;
                                        m.enableLights(true);
                                        m.setLightColor(i4);
                                        z7 = false;
                                    } else {
                                        z6 = true;
                                        z7 = false;
                                        m.enableLights(false);
                                    }
                                    if (!notificationsController.isEmptyVibration(jArr2)) {
                                        m.enableVibration(z6);
                                        if (jArr2.length > 0) {
                                            m.setVibrationPattern(jArr2);
                                        }
                                    } else {
                                        m.enableVibration(z7);
                                    }
                                    AudioAttributes.Builder builder = new AudioAttributes.Builder();
                                    builder.setContentType(4);
                                    builder.setUsage(5);
                                    if (uri3 != null) {
                                        m.setSound(uri3, builder.build());
                                    } else {
                                        m.setSound(null, builder.build());
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("create new channel " + str18);
                                    }
                                    notificationsController.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                                    systemNotificationManager.createNotificationChannel(m);
                                    notificationsSettings.edit().putString(str17, str18).putString(str17 + str22, MD5).commit();
                                }
                                return str18;
                            }
                        } else {
                            SharedPreferences.Editor putString = notificationsSettings.edit().putString(str17, str18);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str17);
                            str21 = str11;
                            sb6.append(str21);
                            putString.putString(sb6.toString(), str19).commit();
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("change edited channel " + str18);
                            }
                        }
                        MD5 = str19;
                        str22 = str21;
                        uri3 = uri;
                        if (str18 == null) {
                        }
                        return str18;
                    }
                    str11 = "_s";
                    jArr2 = jArr;
                    sb = sb3;
                    str10 = string3;
                    str12 = string;
                    str13 = "secret";
                    notificationsController = this;
                    j3 = j;
                    z4 = z12;
                    str16 = "_";
                    str17 = str30;
                    i4 = i;
                }
                str20 = str10;
                str18 = str12;
                str19 = null;
                z5 = false;
                if (z5) {
                }
                str21 = str11;
                if (!z4) {
                }
                i5 = 0;
                while (i5 < jArr2.length) {
                }
                str22 = str21;
                sb.append(i4);
                uri3 = uri;
                if (uri3 != null) {
                }
                sb.append(i2);
                if (!z) {
                }
                MD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                }
                if (str18 == null) {
                }
                return str18;
            }
            formatString = z2 ? LocaleController.formatString(R.string.NotificationsChatInApp, str) : str;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(z2 ? "org.telegram.keyia" : "org.telegram.key");
            sb7.append(j);
            sb7.append("_");
            sb7.append(j2);
            str28 = sb7.toString();
        }
        str9 = formatString;
        str8 = str28;
        String str302 = str8 + "_" + MD52;
        string = notificationsSettings.getString(str302, null);
        String string32 = notificationsSettings.getString(str302 + "_s", null);
        StringBuilder sb32 = new StringBuilder();
        if (string != null) {
        }
        str20 = str10;
        str18 = str12;
        str19 = null;
        z5 = false;
        if (z5) {
        }
        str21 = str11;
        if (!z4) {
        }
        i5 = 0;
        while (i5 < jArr2.length) {
        }
        str22 = str21;
        sb.append(i4);
        uri3 = uri;
        if (uri3 != null) {
        }
        sb.append(i2);
        if (!z) {
        }
        MD5 = Utilities.MD5(sb.toString());
        if (!z3) {
        }
        if (str18 == null) {
        }
        return str18;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:121|122|(7:124|(2:126|(1:128)(1:568))(1:569)|129|(2:134|135)|563|564|(2:566|135)(1:567))(1:570)|136|137|(3:546|547|(1:549)(4:(1:(2:558|(1:560)(1:561))(1:553))(1:562)|554|(1:556)|557))(4:140|(4:142|(7:144|(2:146|(1:148))(1:165)|151|(1:153)|154|(2:(1:158)(2:160|(1:162)(1:163))|159)|164)(1:166)|149|150)|167|168)|(45:176|(1:544)(4:181|(1:183)(1:543)|(2:185|(1:187)(2:535|(1:537)(2:538|(1:540)(43:541|(2:191|(36:193|194|(4:196|(1:198)(1:531)|199|(1:201)(1:530))(1:532)|202|(5:521|522|(1:524)(1:529)|525|(1:527)(1:528))(1:(2:(3:208|(1:210)(1:496)|211)(3:497|(1:499)(1:501)|500)|212)(2:502|(7:(1:505)(1:519)|506|507|(1:509)(2:(1:516)(1:518)|517)|510|(1:512)(1:514)|513)(1:520)))|(1:214)(1:495)|215|(2:217|(27:219|(1:222)|(1:226)|(1:492)(1:231)|(6:233|(1:235)(1:490)|236|(1:238)|239|(1:241)(1:489))(1:491)|(3:245|246|(1:250))|(1:256)(1:488)|257|(1:259)(2:436|(4:438|(2:441|439)|442|443)(18:444|(5:446|(1:(1:449)(2:450|(1:452)))|453|(1:482)(2:457|(16:(2:462|(1:470))(2:471|(2:473|(1:481)))|263|(1:270)|271|272|273|(1:275)|276|(3:278|279|280)(1:432)|281|(1:283)(1:(12:416|(1:418)(3:419|420|(4:422|(1:424)(1:429)|425|(1:427)))|285|(2:412|413)(1:(4:290|291|(1:293)|392)(5:393|(2:395|(1:397)(3:398|(2:400|(1:402))(2:403|(2:405|(2:407|408)))|392))|409|(1:411)|392))|(1:391)(7:(3:386|(1:388)(1:390)|389)|(2:303|(7:305|(5:(1:311)(1:369)|(1:313)|314|(1:316)(2:357|(1:359)(7:(2:367|368)(2:363|(1:365))|366|319|(1:356)(4:327|(4:329|(3:331|(4:333|(1:335)(1:339)|336|337)(2:340|341)|338)|342|343)|344|345)|(1:353)|354|355))|317)|370|(0)|314|(0)(0)|317)(2:371|(1:373)(2:374|(1:384)(2:380|381))))|385|(0)|314|(0)(0)|317)|318|319|(1:321)|356|(4:347|349|351|353)|354|355))|284|285|(1:287)|412|413))|261)(2:483|(1:487))|262|263|(3:266|268|270)|271|272|273|(0)|276|(0)(0)|281|(0)(0)|284|285|(0)|412|413))|260|261|262|263|(0)|271|272|273|(0)|276|(0)(0)|281|(0)(0)|284|285|(0)|412|413))(1:494)|493|(1:222)|(2:224|226)|(1:228)|492|(0)(0)|(4:243|245|246|(2:248|250))|(0)(0)|257|(0)(0)|260|261|262|263|(0)|271|272|273|(0)|276|(0)(0)|281|(0)(0)|284|285|(0)|412|413))(1:534)|533|194|(0)(0)|202|(1:204)|521|522|(0)(0)|525|(0)(0)|(0)(0)|215|(0)(0)|493|(0)|(0)|(0)|492|(0)(0)|(0)|(0)(0)|257|(0)(0)|260|261|262|263|(0)|271|272|273|(0)|276|(0)(0)|281|(0)(0)|284|285|(0)|412|413))))(1:542)|188)|189|(0)(0)|533|194|(0)(0)|202|(0)|521|522|(0)(0)|525|(0)(0)|(0)(0)|215|(0)(0)|493|(0)|(0)|(0)|492|(0)(0)|(0)|(0)(0)|257|(0)(0)|260|261|262|263|(0)|271|272|273|(0)|276|(0)(0)|281|(0)(0)|284|285|(0)|412|413)|545|(1:178)|544|189|(0)(0)|533|194|(0)(0)|202|(0)|521|522|(0)(0)|525|(0)(0)|(0)(0)|215|(0)(0)|493|(0)|(0)|(0)|492|(0)(0)|(0)|(0)(0)|257|(0)(0)|260|261|262|263|(0)|271|272|273|(0)|276|(0)(0)|281|(0)(0)|284|285|(0)|412|413) */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0c23, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0b61, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0b7e, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x035a, code lost:
    
        if (r1 != null) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d0 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f6 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06e5 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x072b A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07c7 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x093b A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0954 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x095a A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0972 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x09e6 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0b19 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0b59 A[Catch: all -> 0x0b61, TryCatch #0 {all -> 0x0b61, blocks: (B:273:0x0b3e, B:275:0x0b59, B:276:0x0b64, B:280:0x0b6c, B:281:0x0b74), top: B:272:0x0b3e }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0b83 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0d2b A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0d35 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0d3f  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x09f6 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08ea A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x08f6 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x05ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x03eb A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x03c5 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x013c A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0339 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0032, B:13:0x003e, B:15:0x0046, B:19:0x005d, B:23:0x006a, B:25:0x0074, B:27:0x0084, B:29:0x0089, B:35:0x008e, B:38:0x0094, B:39:0x00a7, B:41:0x00af, B:43:0x00e2, B:45:0x0103, B:47:0x010b, B:49:0x0114, B:52:0x011b, B:55:0x012f, B:57:0x01f8, B:58:0x0224, B:60:0x0236, B:62:0x023c, B:64:0x0240, B:66:0x025e, B:67:0x0265, B:70:0x027c, B:74:0x0288, B:76:0x0294, B:77:0x029a, B:79:0x02a5, B:81:0x02ab, B:83:0x02b9, B:84:0x02d5, B:86:0x02e7, B:88:0x02f7, B:90:0x02fd, B:91:0x0319, B:93:0x0339, B:97:0x035c, B:99:0x0362, B:101:0x037b, B:103:0x0381, B:107:0x0389, B:110:0x039a, B:116:0x03cc, B:118:0x03d0, B:124:0x03f6, B:126:0x03ff, B:128:0x0407, B:129:0x0434, B:131:0x043f, B:136:0x04b3, B:140:0x04d2, B:142:0x04f6, B:144:0x050e, B:146:0x0512, B:150:0x057f, B:153:0x0522, B:154:0x0528, B:158:0x0535, B:160:0x054a, B:162:0x054f, B:163:0x0563, B:164:0x0577, B:168:0x058b, B:171:0x060e, B:181:0x0627, B:183:0x0643, B:185:0x067c, B:187:0x0686, B:191:0x06e5, B:194:0x070b, B:196:0x072b, B:198:0x076e, B:199:0x078c, B:201:0x079e, B:202:0x07c3, B:204:0x07c7, B:208:0x07db, B:210:0x07ed, B:211:0x0800, B:215:0x0935, B:217:0x093b, B:224:0x095a, B:226:0x0960, B:233:0x0972, B:236:0x097f, B:239:0x0988, B:254:0x09aa, B:257:0x09b6, B:259:0x09e6, B:263:0x0abe, B:266:0x0b1b, B:268:0x0b1f, B:270:0x0b25, B:283:0x0b83, B:291:0x0be8, B:297:0x0c30, B:301:0x0c6f, B:303:0x0c79, B:305:0x0c7d, B:307:0x0c85, B:311:0x0c8e, B:313:0x0d2b, B:316:0x0d35, B:319:0x0d78, B:321:0x0d7e, B:323:0x0d82, B:325:0x0d8d, B:327:0x0d93, B:329:0x0d9d, B:331:0x0dac, B:333:0x0dbc, B:335:0x0dd9, B:336:0x0de3, B:338:0x0e13, B:343:0x0e23, B:347:0x0e46, B:349:0x0e4c, B:351:0x0e54, B:353:0x0e5a, B:354:0x0e7c, B:359:0x0d42, B:365:0x0d56, B:368:0x0d65, B:369:0x0cb8, B:370:0x0cbe, B:371:0x0cc1, B:373:0x0ccb, B:376:0x0cd6, B:378:0x0cde, B:383:0x0d17, B:384:0x0d20, B:386:0x0c3a, B:388:0x0c42, B:389:0x0c6a, B:391:0x0d6c, B:400:0x0bfd, B:405:0x0c0b, B:409:0x0c14, B:413:0x0c1e, B:416:0x0b8b, B:418:0x0b98, B:435:0x0b7e, B:436:0x09f6, B:438:0x09fa, B:439:0x0a03, B:441:0x0a0b, B:443:0x0a1a, B:444:0x0a22, B:446:0x0a28, B:449:0x0a33, B:452:0x0a41, B:453:0x0a47, B:455:0x0a4d, B:457:0x0a56, B:459:0x0a5f, B:462:0x0a67, B:464:0x0a6d, B:466:0x0a71, B:468:0x0a79, B:473:0x0a85, B:475:0x0a8b, B:477:0x0a8f, B:479:0x0a97, B:483:0x0aa1, B:485:0x0aae, B:487:0x0ab4, B:496:0x07f9, B:497:0x0829, B:499:0x083b, B:500:0x084e, B:501:0x0847, B:507:0x0885, B:509:0x088d, B:510:0x08a5, B:517:0x08a0, B:522:0x08de, B:524:0x08ea, B:525:0x08fd, B:529:0x08f6, B:531:0x077a, B:535:0x069e, B:537:0x06b0, B:538:0x06bc, B:540:0x06c0, B:547:0x059a, B:553:0x05b3, B:554:0x05f5, B:557:0x05fc, B:558:0x05c7, B:560:0x05cc, B:561:0x05e0, B:563:0x044b, B:566:0x0456, B:567:0x0471, B:568:0x0414, B:571:0x03dc, B:573:0x03eb, B:576:0x03b7, B:578:0x03be, B:579:0x03c5, B:584:0x036b, B:585:0x0373, B:591:0x0303, B:593:0x0309, B:599:0x02c6, B:601:0x0279, B:603:0x013c, B:605:0x0142, B:606:0x0145, B:609:0x014e, B:610:0x0157, B:611:0x0169, B:613:0x0170, B:614:0x0188, B:616:0x018f, B:618:0x0197, B:619:0x01cc, B:620:0x0124, B:622:0x0219, B:246:0x099b, B:381:0x0ce8), top: B:11:0x0032, inners: #2, #3 }] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r2v91, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v93, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v95, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r3v77, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v85, types: [org.telegram.messenger.MessageObject] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showOrUpdateNotification(boolean z) {
        MessageObject messageObject;
        Bitmap bitmap;
        long j;
        long j2;
        String str;
        TLRPC.Chat chat;
        boolean z2;
        int notifyOverride;
        boolean z3;
        TLRPC.User user;
        long j3;
        NotificationsController notificationsController;
        String userName;
        boolean z4;
        boolean equalsIgnoreCase;
        String str2;
        String string;
        boolean z5;
        String str3;
        SharedPreferences sharedPreferences;
        String str4;
        String string2;
        TLRPC.User user2;
        SharedPreferences sharedPreferences2;
        long j4;
        long j5;
        String str5;
        boolean z6;
        MessageObject messageObject2;
        String stringForMessage;
        String str6;
        String str7;
        boolean z7;
        boolean z8;
        String str8;
        NotificationCompat.Builder builder;
        String str9;
        boolean z9;
        SharedPreferences sharedPreferences3;
        long j6;
        boolean z10;
        long j7;
        boolean z11;
        boolean z12;
        String str10;
        CharSequence charSequence;
        long j8;
        String str11;
        int i;
        Integer num;
        int i2;
        boolean z13;
        String str12;
        TLRPC.Chat chat2;
        long j9;
        long j10;
        boolean z14;
        long j11;
        String string3;
        boolean z15;
        boolean z16;
        int i3;
        int i4;
        int i5;
        int i6;
        String str13;
        int i7;
        int i8;
        boolean z17;
        CharSequence charSequence2;
        boolean z18;
        String str14;
        int i9;
        boolean z19;
        String str15;
        int i10;
        int i11;
        TLRPC.Chat chat3;
        TLRPC.User user3;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        NotificationCompat.Builder builder2;
        long[] jArr;
        boolean z20;
        int i12;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        int i13;
        long j12;
        boolean z21;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow;
        int i14;
        MessageObject messageObject3;
        int i15;
        long j13;
        int i16;
        long[] jArr6;
        int i17;
        String str16;
        int ringerMode;
        String string4;
        boolean z22;
        boolean z23;
        int i18;
        int i19;
        boolean z24;
        boolean z25;
        int i20;
        int i21;
        int i22;
        boolean z26;
        String replace;
        String formatPluralString;
        String str17 = "file://";
        if (!getUserConfig().isClientActivated() || ((this.pushMessages.isEmpty() && this.storyPushMessages.isEmpty()) || (!SharedConfig.showNotificationsForAllAccounts && this.currentAccount != UserConfig.selectedAccount))) {
            dismissNotification();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            int i23 = 0;
            long j14 = 0;
            StoryNotification storyNotification = null;
            while (i23 < this.pushMessages.size()) {
                MessageObject messageObject4 = this.pushMessages.get(i23);
                String str18 = str17;
                long j15 = messageObject4.messageOwner.date;
                if (j14 < j15) {
                    j14 = j15;
                    storyNotification = messageObject4;
                }
                i23++;
                str17 = str18;
            }
            String str19 = str17;
            StoryNotification storyNotification2 = storyNotification;
            for (int i24 = 0; i24 < this.storyPushMessages.size(); i24++) {
                StoryNotification storyNotification3 = this.storyPushMessages.get(i24);
                long j16 = storyNotification3.date;
                if (j14 < j16 / 1000) {
                    j14 = j16 / 1000;
                    storyNotification2 = storyNotification3;
                }
            }
            if (storyNotification2 == null) {
                return;
            }
            if (storyNotification2 instanceof StoryNotification) {
                StoryNotification storyNotification4 = storyNotification2;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                int i25 = 0;
                boolean z27 = false;
                for (int i26 = 0; i26 < this.storyPushMessages.size(); i26++) {
                    z27 |= this.storyPushMessages.get(i26).hidden;
                    tL_message.date = Math.min(tL_message.date, (int) (this.storyPushMessages.get(i26).date / 1000));
                    i25 += this.storyPushMessages.get(i26).dateByIds.size();
                }
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j17 = storyNotification4.dialogId;
                tL_peerUser.user_id = j17;
                tL_message.dialog_id = j17;
                tL_message.peer_id = tL_peerUser;
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<Object> arrayList2 = new ArrayList<>();
                parseStoryPushes(arrayList, arrayList2);
                Bitmap loadMultipleAvatars = SharedConfig.getDevicePerformanceClass() >= 1 ? loadMultipleAvatars(arrayList2) : null;
                if (!z27 && this.storyPushMessages.size() < 2 && !arrayList.isEmpty()) {
                    formatPluralString = arrayList.get(0);
                    String str20 = formatPluralString;
                    if (!z27) {
                        tL_message.message = LocaleController.formatPluralString("StoryNotificationHidden", i25, new Object[0]);
                    } else if (arrayList.isEmpty()) {
                        tL_message.message = "";
                    } else if (arrayList.size() == 1) {
                        if (i25 == 1) {
                            tL_message.message = LocaleController.getString("StoryNotificationSingle");
                        } else {
                            tL_message.message = LocaleController.formatPluralString("StoryNotification1", i25, arrayList.get(0));
                        }
                    } else if (arrayList.size() == 2) {
                        tL_message.message = LocaleController.formatString(R.string.StoryNotification2, arrayList.get(0), arrayList.get(1));
                    } else if (arrayList.size() == 3 && this.storyPushMessages.size() == 3) {
                        tL_message.message = LocaleController.formatString(R.string.StoryNotification3, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)), cutLastName(arrayList.get(2)));
                    } else {
                        tL_message.message = LocaleController.formatPluralString("StoryNotification4", this.storyPushMessages.size() - 2, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)));
                        MessageObject messageObject5 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str20, str20, false, false, false, false);
                        messageObject5.isStoryPush = true;
                        messageObject = messageObject5;
                        bitmap = loadMultipleAvatars;
                    }
                    MessageObject messageObject52 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str20, str20, false, false, false, false);
                    messageObject52.isStoryPush = true;
                    messageObject = messageObject52;
                    bitmap = loadMultipleAvatars;
                }
                formatPluralString = LocaleController.formatPluralString("Stories", i25, new Object[0]);
                String str202 = formatPluralString;
                if (!z27) {
                }
                MessageObject messageObject522 = new MessageObject(this.currentAccount, tL_message, tL_message.message, str202, str202, false, false, false, false);
                messageObject522.isStoryPush = true;
                messageObject = messageObject522;
                bitmap = loadMultipleAvatars;
            } else {
                messageObject = this.pushMessages.get(0);
                bitmap = null;
            }
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            int i27 = notificationsSettings.getInt("dismissDate", 0);
            if (!messageObject.isStoryPush && messageObject.messageOwner.date <= i27) {
                dismissNotification();
                return;
            }
            long dialogId = messageObject.getDialogId();
            long topicId = MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, getMessagesController().isForum(messageObject));
            boolean z28 = messageObject.isStoryPush;
            long fromChatId = messageObject.messageOwner.mentioned ? messageObject.getFromChatId() : dialogId;
            messageObject.getId();
            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
            long j18 = peer.chat_id;
            if (j18 == 0) {
                j18 = peer.channel_id;
            }
            long j19 = j18;
            long j20 = peer.user_id;
            if (messageObject.isFromUser() && (j20 == 0 || j20 == getUserConfig().getClientUserId())) {
                j20 = messageObject.messageOwner.from_id.user_id;
            }
            if (messageObject.getDialogId() != UserObject.VERIFY || messageObject.getForwardedFromId() == null) {
                j = j20;
                j2 = j19;
            } else if (messageObject.getForwardedFromId().longValue() >= 0) {
                j = messageObject.getForwardedFromId().longValue();
                j2 = 0;
            } else {
                j2 = messageObject.getForwardedFromId().longValue();
                j = 0;
            }
            TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j));
            if (j2 != 0) {
                str = "currentAccount";
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(j2));
                if (chat4 == null && messageObject.isFcmMessage()) {
                    z2 = messageObject.localChannel;
                    chat = chat4;
                } else if (!ChatObject.isChannel(chat4) || chat4.megagroup) {
                    chat = chat4;
                } else {
                    chat = chat4;
                    z2 = true;
                }
                String str21 = str;
                TLRPC.Chat chat5 = chat;
                long j21 = j2;
                Bitmap bitmap2 = bitmap;
                int i28 = i27;
                notifyOverride = getNotifyOverride(notificationsSettings, fromChatId, topicId);
                if (notifyOverride != -1) {
                    Boolean valueOf = Boolean.valueOf(z2);
                    boolean z29 = messageObject.isReactionPush;
                    z3 = isGlobalNotificationsEnabled(dialogId, valueOf, z29, z29);
                } else {
                    z3 = notifyOverride != 2;
                }
                if (j2 == 0 && chat5 == null) {
                    user = user4;
                } else {
                    user = user4;
                }
                if (messageObject.isFcmMessage()) {
                    userName = messageObject.localName;
                    j3 = topicId;
                    notificationsController = this;
                    String str22 = userName;
                    if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
                        z4 = false;
                        equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                        if (DialogObject.isEncryptedDialog(dialogId)) {
                            if (equalsIgnoreCase) {
                                str2 = str22;
                            } else {
                                str2 = str22;
                                if (notificationsController.pushDialogs.size() <= 1) {
                                }
                            }
                            if (!z4) {
                                string = str2;
                                z5 = true;
                                if (!messageObject.isReactionPush && !messageObject.isStoryReactionPush) {
                                    str3 = string;
                                    sharedPreferences = notificationsSettings;
                                    str4 = str21;
                                    string2 = str3;
                                    if (equalsIgnoreCase) {
                                        user2 = user;
                                        if (UserConfig.getActivatedAccountsCount() <= 1) {
                                            str5 = "";
                                        } else if (notificationsController.pushDialogs.size() == 1) {
                                            str5 = UserObject.getFirstName(getUserConfig().getCurrentUser());
                                        } else {
                                            str5 = UserObject.getFirstName(getUserConfig().getCurrentUser()) + "・";
                                        }
                                        j4 = j3;
                                        if (notificationsController.pushDialogs.size() == 1 && Build.VERSION.SDK_INT >= 23) {
                                            sharedPreferences2 = sharedPreferences;
                                            j5 = dialogId;
                                        }
                                        if (notificationsController.pushDialogs.size() == 1) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(str5);
                                            sharedPreferences2 = sharedPreferences;
                                            sb.append(LocaleController.formatPluralString("NewMessages", notificationsController.total_unread_count, new Object[0]));
                                            str5 = sb.toString();
                                            j5 = dialogId;
                                        } else {
                                            sharedPreferences2 = sharedPreferences;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(str5);
                                            j5 = dialogId;
                                            sb2.append(LocaleController.formatString(R.string.NotificationMessagesPeopleDisplayOrder, LocaleController.formatPluralString("NewMessages", notificationsController.total_unread_count, new Object[0]), LocaleController.formatPluralString("FromChats", notificationsController.pushDialogs.size(), new Object[0])));
                                            str5 = sb2.toString();
                                        }
                                    } else {
                                        user2 = user;
                                        sharedPreferences2 = sharedPreferences;
                                        j4 = j3;
                                        j5 = dialogId;
                                        str5 = "";
                                    }
                                    NotificationCompat.Builder builder3 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                                    if (notificationsController.pushMessages.size() > 1 || equalsIgnoreCase) {
                                        z6 = z3;
                                        boolean[] zArr = new boolean[1];
                                        String str23 = str5;
                                        messageObject2 = messageObject;
                                        stringForMessage = notificationsController.getStringForMessage(messageObject2, false, zArr, null);
                                        boolean isSilentMessage = notificationsController.isSilentMessage(messageObject2);
                                        if (stringForMessage != null) {
                                            return;
                                        }
                                        if (!z5) {
                                            str6 = stringForMessage;
                                        } else if (chat5 != null && !equalsIgnoreCase) {
                                            str6 = stringForMessage.replace(" @ " + string2, "");
                                        } else if (zArr[0]) {
                                            str6 = stringForMessage.replace(string2 + ": ", "");
                                        } else {
                                            str6 = stringForMessage.replace(string2 + " ", "");
                                        }
                                        builder3.setContentText(str6);
                                        if (equalsIgnoreCase) {
                                            str23 = str6;
                                        }
                                        builder3.setStyle(new NotificationCompat.BigTextStyle().bigText(str6));
                                        str7 = str23;
                                        z7 = isSilentMessage;
                                    } else {
                                        builder3.setContentText(str5);
                                        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                                        inboxStyle.setBigContentTitle(string2);
                                        int min = Math.min(10, notificationsController.pushMessages.size());
                                        z6 = z3;
                                        boolean[] zArr2 = new boolean[1];
                                        MessageObject messageObject6 = messageObject;
                                        int i29 = 0;
                                        ?? r14 = 2;
                                        String str24 = null;
                                        while (i29 < min) {
                                            int i30 = min;
                                            MessageObject messageObject7 = notificationsController.pushMessages.get(i29);
                                            String str25 = str5;
                                            NotificationCompat.Builder builder4 = builder3;
                                            int i31 = i29;
                                            String stringForMessage2 = notificationsController.getStringForMessage(messageObject7, false, zArr2, null);
                                            if (stringForMessage2 != null) {
                                                if (messageObject7.isStoryPush) {
                                                    i22 = i28;
                                                } else {
                                                    i22 = i28;
                                                    if (messageObject7.messageOwner.date <= i22) {
                                                        z26 = r14;
                                                    }
                                                }
                                                boolean z30 = r14;
                                                if (r14 == 2) {
                                                    str24 = stringForMessage2;
                                                    z30 = notificationsController.isSilentMessage(messageObject7);
                                                }
                                                if (notificationsController.pushDialogs.size() == 1 && z5) {
                                                    if (chat5 != null) {
                                                        replace = stringForMessage2.replace(" @ " + string2, "");
                                                    } else if (zArr2[0]) {
                                                        replace = stringForMessage2.replace(string2 + ": ", "");
                                                    } else {
                                                        replace = stringForMessage2.replace(string2 + " ", "");
                                                    }
                                                    stringForMessage2 = replace;
                                                }
                                                inboxStyle.addLine(stringForMessage2);
                                                z26 = z30;
                                            } else {
                                                i22 = i28;
                                                z26 = r14;
                                            }
                                            i29 = i31 + 1;
                                            i28 = i22;
                                            min = i30;
                                            str5 = str25;
                                            builder3 = builder4;
                                            r14 = z26;
                                        }
                                        inboxStyle.setSummaryText(str5);
                                        builder3.setStyle(inboxStyle);
                                        str7 = str5;
                                        stringForMessage = str24;
                                        messageObject2 = messageObject6;
                                        z7 = r14;
                                    }
                                    if (z && z6 && !MediaController.getInstance().isRecordingAudio() && !z7) {
                                        z8 = false;
                                        if (z8 && j5 == fromChatId && chat5 != null) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(NotificationsSettingsFacade.PROPERTY_CUSTOM);
                                            j6 = j5;
                                            sb3.append(j6);
                                            sharedPreferences3 = sharedPreferences2;
                                            if (sharedPreferences3.getBoolean(sb3.toString(), false)) {
                                                i21 = sharedPreferences3.getInt("smart_max_count_" + j6, 2);
                                                StringBuilder sb4 = new StringBuilder();
                                                z9 = z8;
                                                sb4.append("smart_delay_");
                                                sb4.append(j6);
                                                i20 = sharedPreferences3.getInt(sb4.toString(), NotificationCenter.dialogFiltersUpdated);
                                            } else {
                                                z9 = z8;
                                                i20 = NotificationCenter.dialogFiltersUpdated;
                                                i21 = 2;
                                            }
                                            if (i21 != 0) {
                                                Point point = (Point) notificationsController.smartNotificationsDialogs.get(j6);
                                                if (point == null) {
                                                    str8 = stringForMessage;
                                                    builder = builder3;
                                                    notificationsController.smartNotificationsDialogs.put(j6, new Point(1, (int) (SystemClock.elapsedRealtime() / 1000)));
                                                } else {
                                                    str8 = stringForMessage;
                                                    builder = builder3;
                                                    if (point.y + i20 < SystemClock.elapsedRealtime() / 1000) {
                                                        point.set(1, (int) (SystemClock.elapsedRealtime() / 1000));
                                                    } else {
                                                        int i32 = point.x;
                                                        if (i32 < i21) {
                                                            str9 = str7;
                                                            point.set(i32 + 1, (int) (SystemClock.elapsedRealtime() / 1000));
                                                        } else {
                                                            str9 = str7;
                                                            z10 = true;
                                                            if (z10) {
                                                                j7 = j4;
                                                            } else {
                                                                StringBuilder sb5 = new StringBuilder();
                                                                sb5.append("sound_enabled_");
                                                                j7 = j4;
                                                                sb5.append(getSharedPrefKey(j6, j7));
                                                                if (!sharedPreferences3.getBoolean(sb5.toString(), true)) {
                                                                    z11 = true;
                                                                    String path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                                                    boolean z31 = ApplicationLoader.mainInterfacePaused;
                                                                    boolean z32 = !z31;
                                                                    getSharedPrefKey(j6, j7);
                                                                    if (notificationsController.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j6, j7, false)) {
                                                                        z12 = z31;
                                                                        str10 = str9;
                                                                        charSequence = string2;
                                                                        j8 = j7;
                                                                        str11 = null;
                                                                        i = 3;
                                                                        num = null;
                                                                        i2 = 0;
                                                                        z13 = false;
                                                                    } else {
                                                                        int property = notificationsController.dialogsNotificationsFacade.getProperty("vibrate_", j6, j7, 0);
                                                                        int property2 = notificationsController.dialogsNotificationsFacade.getProperty("priority_", j6, j7, 3);
                                                                        charSequence = string2;
                                                                        long property3 = notificationsController.dialogsNotificationsFacade.getProperty("sound_document_id_", j6, j7, 0L);
                                                                        z12 = z31;
                                                                        str10 = str9;
                                                                        if (property3 != 0) {
                                                                            str11 = getMediaDataController().ringtoneDataStore.getSoundPath(property3);
                                                                            z25 = true;
                                                                        } else {
                                                                            str11 = notificationsController.dialogsNotificationsFacade.getPropertyString("sound_path_", j6, j7, null);
                                                                            z25 = false;
                                                                        }
                                                                        int property4 = notificationsController.dialogsNotificationsFacade.getProperty("color_", j6, j7, 0);
                                                                        if (property4 != 0) {
                                                                            num = Integer.valueOf(property4);
                                                                            j8 = j7;
                                                                            z13 = z25;
                                                                            i2 = property;
                                                                            i = property2;
                                                                        } else {
                                                                            j8 = j7;
                                                                            z13 = z25;
                                                                            i2 = property;
                                                                            i = property2;
                                                                            num = null;
                                                                        }
                                                                    }
                                                                    if (!messageObject2.isReactionPush || messageObject2.isStoryReactionPush) {
                                                                        str12 = str11;
                                                                        chat2 = chat5;
                                                                        j9 = j6;
                                                                        j10 = j;
                                                                        z14 = z7;
                                                                        j11 = sharedPreferences3.getLong("ReactionSoundDocId", 0L);
                                                                        if (j11 == 0) {
                                                                            string3 = getMediaDataController().ringtoneDataStore.getSoundPath(j11);
                                                                            z15 = true;
                                                                        } else {
                                                                            string3 = sharedPreferences3.getString("ReactionSoundPath", path);
                                                                            z15 = false;
                                                                        }
                                                                        int i33 = sharedPreferences3.getInt("vibrate_react", 0);
                                                                        int i34 = sharedPreferences3.getInt("priority_react", 1);
                                                                        String str26 = string3;
                                                                        int i35 = sharedPreferences3.getInt("ReactionsLed", -16776961);
                                                                        z16 = z15;
                                                                        i3 = i33;
                                                                        if (messageObject2.isStoryReactionPush) {
                                                                            i4 = i34;
                                                                            i5 = 4;
                                                                            i6 = i35;
                                                                            str13 = str26;
                                                                            i7 = 4;
                                                                        } else {
                                                                            i4 = i34;
                                                                            i5 = 4;
                                                                            i6 = i35;
                                                                            str13 = str26;
                                                                            i7 = 5;
                                                                        }
                                                                    } else if (j2 != 0) {
                                                                        if (z2) {
                                                                            str12 = str11;
                                                                            chat2 = chat5;
                                                                            j9 = j6;
                                                                            long j22 = sharedPreferences3.getLong("ChannelSoundDocId", 0L);
                                                                            if (j22 != 0) {
                                                                                str13 = getMediaDataController().ringtoneDataStore.getSoundPath(j22);
                                                                                z24 = true;
                                                                            } else {
                                                                                str13 = sharedPreferences3.getString("ChannelSoundPath", path);
                                                                                z24 = false;
                                                                            }
                                                                            i18 = sharedPreferences3.getInt("vibrate_channel", 0);
                                                                            i19 = sharedPreferences3.getInt("priority_channel", 1);
                                                                            i6 = sharedPreferences3.getInt("ChannelLed", -16776961);
                                                                            z16 = z24;
                                                                            i5 = 4;
                                                                            i7 = 2;
                                                                        } else {
                                                                            str12 = str11;
                                                                            chat2 = chat5;
                                                                            j9 = j6;
                                                                            long j23 = sharedPreferences3.getLong("GroupSoundDocId", 0L);
                                                                            if (j23 != 0) {
                                                                                str13 = getMediaDataController().ringtoneDataStore.getSoundPath(j23);
                                                                                z23 = true;
                                                                            } else {
                                                                                str13 = sharedPreferences3.getString("GroupSoundPath", path);
                                                                                z23 = false;
                                                                            }
                                                                            i18 = sharedPreferences3.getInt("vibrate_group", 0);
                                                                            i19 = sharedPreferences3.getInt("priority_group", 1);
                                                                            i6 = sharedPreferences3.getInt("GroupLed", -16776961);
                                                                            z16 = z23;
                                                                            i5 = 4;
                                                                            i7 = 0;
                                                                        }
                                                                        int i36 = i19;
                                                                        i3 = i18;
                                                                        j10 = j;
                                                                        z14 = z7;
                                                                        i4 = i36;
                                                                    } else {
                                                                        str12 = str11;
                                                                        chat2 = chat5;
                                                                        j9 = j6;
                                                                        j10 = j;
                                                                        if (j10 != 0) {
                                                                            z14 = z7;
                                                                            long j24 = sharedPreferences3.getLong(z28 ? "StoriesSoundDocId" : "GlobalSoundDocId", 0L);
                                                                            if (j24 != 0) {
                                                                                string4 = getMediaDataController().ringtoneDataStore.getSoundPath(j24);
                                                                                z22 = true;
                                                                            } else {
                                                                                string4 = sharedPreferences3.getString(z28 ? "StoriesSoundPath" : "GlobalSoundPath", path);
                                                                                z22 = false;
                                                                            }
                                                                            int i37 = sharedPreferences3.getInt("vibrate_messages", 0);
                                                                            int i38 = sharedPreferences3.getInt("priority_messages", 1);
                                                                            String str27 = string4;
                                                                            int i39 = sharedPreferences3.getInt("MessagesLed", -16776961);
                                                                            z16 = z22;
                                                                            i3 = i37;
                                                                            i4 = i38;
                                                                            i5 = 4;
                                                                            i7 = z28 ? 3 : 1;
                                                                            i6 = i39;
                                                                            str13 = str27;
                                                                        } else {
                                                                            z14 = z7;
                                                                            str13 = null;
                                                                            i3 = 0;
                                                                            i6 = -16776961;
                                                                            i5 = 4;
                                                                            i4 = 0;
                                                                            i7 = 1;
                                                                            z16 = false;
                                                                        }
                                                                    }
                                                                    if (i3 != i5) {
                                                                        z17 = true;
                                                                        i8 = 0;
                                                                    } else {
                                                                        i8 = i3;
                                                                        z17 = false;
                                                                    }
                                                                    if (TextUtils.isEmpty(str12)) {
                                                                        charSequence2 = "";
                                                                        String str28 = str12;
                                                                        if (!TextUtils.equals(str13, str28)) {
                                                                            str14 = str28;
                                                                            i9 = 3;
                                                                            z18 = false;
                                                                            if (i != i9 && i4 != i) {
                                                                                i4 = i;
                                                                                z18 = false;
                                                                            }
                                                                            if (num != null && num.intValue() != i6) {
                                                                                i6 = num.intValue();
                                                                                z18 = false;
                                                                            }
                                                                            if (i2 != 0 || i2 == 4 || i2 == i8) {
                                                                                i2 = i8;
                                                                                z19 = z18;
                                                                            } else {
                                                                                z19 = false;
                                                                            }
                                                                            if (z12) {
                                                                                str15 = str14;
                                                                            } else {
                                                                                str15 = !sharedPreferences3.getBoolean("EnableInAppSounds", true) ? null : str14;
                                                                                if (!sharedPreferences3.getBoolean("EnableInAppVibrate", true)) {
                                                                                    i2 = 2;
                                                                                }
                                                                                i4 = sharedPreferences3.getBoolean("EnableInAppPopup", true) ? 2 : 0;
                                                                            }
                                                                            if (z17 && i2 != 2) {
                                                                                try {
                                                                                    ringerMode = audioManager.getRingerMode();
                                                                                    if (ringerMode != 0 && ringerMode != 1) {
                                                                                        i2 = 2;
                                                                                    }
                                                                                } catch (Exception e) {
                                                                                    FileLog.e(e);
                                                                                }
                                                                            }
                                                                            if (z11) {
                                                                                str15 = null;
                                                                                i10 = 0;
                                                                                i11 = 0;
                                                                                i4 = 0;
                                                                            } else {
                                                                                i10 = i2;
                                                                                i11 = i6;
                                                                            }
                                                                            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                                            intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                                            intent.setFlags(67108864);
                                                                            if (messageObject2.isStoryReactionPush) {
                                                                                intent.putExtra("storyId", Math.abs(messageObject2.getId()));
                                                                            } else if (messageObject2.isStoryPush) {
                                                                                long[] jArr7 = new long[notificationsController.storyPushMessages.size()];
                                                                                for (int i40 = 0; i40 < notificationsController.storyPushMessages.size(); i40++) {
                                                                                    jArr7[i40] = notificationsController.storyPushMessages.get(i40).dialogId;
                                                                                }
                                                                                intent.putExtra("storyDialogIds", jArr7);
                                                                            } else {
                                                                                if (!DialogObject.isEncryptedDialog(j9)) {
                                                                                    if (notificationsController.pushDialogs.size() == 1) {
                                                                                        if (j2 != 0) {
                                                                                            intent.putExtra("chatId", j21);
                                                                                        } else if (j10 != 0) {
                                                                                            intent.putExtra("userId", j10);
                                                                                        }
                                                                                    }
                                                                                    if (AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
                                                                                        chat3 = chat2;
                                                                                    } else if (notificationsController.pushDialogs.size() == 1 && Build.VERSION.SDK_INT < 28) {
                                                                                        if (chat2 != null) {
                                                                                            chat3 = chat2;
                                                                                            TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                                                            if (chatPhoto != null && (fileLocation2 = chatPhoto.photo_small) != null && fileLocation2.volume_id != 0 && fileLocation2.local_id != 0) {
                                                                                                fileLocation = fileLocation2;
                                                                                                user3 = user2;
                                                                                            }
                                                                                        } else {
                                                                                            chat3 = chat2;
                                                                                            if (user2 != null) {
                                                                                                user3 = user2;
                                                                                                TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                                                                                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        String str29 = str4;
                                                                                        intent.putExtra(str29, notificationsController.currentAccount);
                                                                                        boolean z33 = z19;
                                                                                        int i41 = i10;
                                                                                        builder2 = builder;
                                                                                        String str30 = str15;
                                                                                        builder2.setContentTitle(charSequence).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                                        builder2.setCategory("msg");
                                                                                        if (chat3 == null && user3 != null && (str16 = user3.phone) != null && str16.length() > 0) {
                                                                                            builder2.addPerson("tel:+" + user3.phone);
                                                                                        }
                                                                                        Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                                        intent2.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                                        intent2.putExtra(str29, notificationsController.currentAccount);
                                                                                        if (messageObject2.isStoryPush) {
                                                                                            intent2.putExtra("story", true);
                                                                                        }
                                                                                        if (messageObject2.isStoryReactionPush) {
                                                                                            i17 = 1;
                                                                                            intent2.putExtra("storyReaction", true);
                                                                                        } else {
                                                                                            i17 = 1;
                                                                                        }
                                                                                        builder2.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i17, intent2, 167772160));
                                                                                        if (bitmap2 != null) {
                                                                                            builder2.setLargeIcon(bitmap2);
                                                                                        } else if (fileLocation != null) {
                                                                                            jArr = null;
                                                                                            BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                                                                            if (imageFromMemory != null) {
                                                                                                builder2.setLargeIcon(imageFromMemory.getBitmap());
                                                                                            } else {
                                                                                                try {
                                                                                                    File pathToAttach = getFileLoader().getPathToAttach(fileLocation, true);
                                                                                                    if (pathToAttach.exists()) {
                                                                                                        float dp = 160.0f / AndroidUtilities.dp(50.0f);
                                                                                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                                        options.inSampleSize = dp < 1.0f ? 1 : (int) dp;
                                                                                                        Bitmap decodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                                                                                                        if (decodeFile != null) {
                                                                                                            builder2.setLargeIcon(decodeFile);
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable unused) {
                                                                                                }
                                                                                            }
                                                                                            boolean z34 = z14;
                                                                                            if (z || z34) {
                                                                                                builder2.setPriority(-1);
                                                                                            } else if (i4 == 0) {
                                                                                                builder2.setPriority(0);
                                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                                    z20 = true;
                                                                                                    i12 = 3;
                                                                                                }
                                                                                                z20 = true;
                                                                                                i12 = 0;
                                                                                            } else {
                                                                                                int i42 = 1;
                                                                                                if (i4 != 1) {
                                                                                                    if (i4 == 2) {
                                                                                                        i42 = 1;
                                                                                                    } else {
                                                                                                        if (i4 == 4) {
                                                                                                            builder2.setPriority(-2);
                                                                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                                                                z20 = true;
                                                                                                                i12 = 1;
                                                                                                            }
                                                                                                        } else if (i4 == 5) {
                                                                                                            builder2.setPriority(-1);
                                                                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                                                                z20 = true;
                                                                                                                i12 = 2;
                                                                                                            }
                                                                                                        }
                                                                                                        z20 = true;
                                                                                                        i12 = 0;
                                                                                                    }
                                                                                                }
                                                                                                builder2.setPriority(i42);
                                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                                    z20 = true;
                                                                                                    i12 = 4;
                                                                                                }
                                                                                                z20 = true;
                                                                                                i12 = 0;
                                                                                            }
                                                                                            if (z34 != z20 && !z11) {
                                                                                                if (z12 || (sharedPreferences3.getBoolean("EnableInAppPreview", z20) && str8 != null)) {
                                                                                                    builder2.setTicker(str8.length() > 100 ? str8.substring(0, 100).replace('\n', ' ').trim() + "..." : str8);
                                                                                                }
                                                                                                if (str30 != null && !str30.equalsIgnoreCase("NoSound")) {
                                                                                                    int i43 = Build.VERSION.SDK_INT;
                                                                                                    if (i43 >= 26) {
                                                                                                        if (!str30.equalsIgnoreCase("Default") && !str30.equals(path)) {
                                                                                                            if (z13) {
                                                                                                                ?? uriForFile = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", new File(str30));
                                                                                                                ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriForFile, 1);
                                                                                                                jArr6 = uriForFile;
                                                                                                            } else {
                                                                                                                jArr6 = Uri.parse(str30);
                                                                                                            }
                                                                                                            if (i11 != 0) {
                                                                                                                builder2.setLights(i11, MediaDataController.MAX_STYLE_RUNS_COUNT, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                                                                                            }
                                                                                                            if (i41 == 2) {
                                                                                                                jArr2 = new long[]{0, 0};
                                                                                                                builder2.setVibrate(jArr2);
                                                                                                            } else if (i41 == 1) {
                                                                                                                jArr2 = new long[]{0, 100, 0, 100};
                                                                                                                builder2.setVibrate(jArr2);
                                                                                                            } else {
                                                                                                                if (i41 == 0 || i41 == 4) {
                                                                                                                    builder2.setDefaults(2);
                                                                                                                    jArr = new long[0];
                                                                                                                } else if (i41 == 3) {
                                                                                                                    long[] jArr8 = {0, 1000};
                                                                                                                    builder2.setVibrate(jArr8);
                                                                                                                    jArr3 = jArr6;
                                                                                                                    jArr2 = jArr8;
                                                                                                                }
                                                                                                                jArr4 = jArr6;
                                                                                                                jArr5 = jArr;
                                                                                                                if (!AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter || messageObject2.getDialogId() != 777000 || (replyMarkup = messageObject2.messageOwner.reply_markup) == null) {
                                                                                                                    i13 = i12;
                                                                                                                    j12 = j9;
                                                                                                                    z21 = false;
                                                                                                                } else {
                                                                                                                    ArrayList<TLRPC.TL_keyboardButtonRow> arrayList3 = replyMarkup.rows;
                                                                                                                    int size = arrayList3.size();
                                                                                                                    int i44 = 0;
                                                                                                                    boolean z35 = false;
                                                                                                                    while (i44 < size) {
                                                                                                                        TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow2 = arrayList3.get(i44);
                                                                                                                        int size2 = tL_keyboardButtonRow2.buttons.size();
                                                                                                                        int i45 = 0;
                                                                                                                        while (i45 < size2) {
                                                                                                                            ArrayList<TLRPC.TL_keyboardButtonRow> arrayList4 = arrayList3;
                                                                                                                            TLRPC.KeyboardButton keyboardButton = tL_keyboardButtonRow2.buttons.get(i45);
                                                                                                                            int i46 = size;
                                                                                                                            if (keyboardButton instanceof TLRPC.TL_keyboardButtonCallback) {
                                                                                                                                tL_keyboardButtonRow = tL_keyboardButtonRow2;
                                                                                                                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                                                                                intent3.putExtra(str29, notificationsController.currentAccount);
                                                                                                                                i14 = size2;
                                                                                                                                j13 = j9;
                                                                                                                                intent3.putExtra("did", j13);
                                                                                                                                byte[] bArr = keyboardButton.data;
                                                                                                                                if (bArr != null) {
                                                                                                                                    i15 = i12;
                                                                                                                                    intent3.putExtra("data", bArr);
                                                                                                                                } else {
                                                                                                                                    i15 = i12;
                                                                                                                                }
                                                                                                                                intent3.putExtra("mid", messageObject2.getId());
                                                                                                                                String str31 = keyboardButton.text;
                                                                                                                                Context context = ApplicationLoader.applicationContext;
                                                                                                                                int i47 = notificationsController.lastButtonId;
                                                                                                                                messageObject3 = messageObject2;
                                                                                                                                notificationsController.lastButtonId = i47 + 1;
                                                                                                                                builder2.addAction(0, str31, PendingIntent.getBroadcast(context, i47, intent3, 167772160));
                                                                                                                                i16 = 1;
                                                                                                                                z35 = true;
                                                                                                                            } else {
                                                                                                                                tL_keyboardButtonRow = tL_keyboardButtonRow2;
                                                                                                                                i14 = size2;
                                                                                                                                messageObject3 = messageObject2;
                                                                                                                                i15 = i12;
                                                                                                                                j13 = j9;
                                                                                                                                i16 = 1;
                                                                                                                            }
                                                                                                                            i45 += i16;
                                                                                                                            size = i46;
                                                                                                                            j9 = j13;
                                                                                                                            arrayList3 = arrayList4;
                                                                                                                            tL_keyboardButtonRow2 = tL_keyboardButtonRow;
                                                                                                                            size2 = i14;
                                                                                                                            i12 = i15;
                                                                                                                            messageObject2 = messageObject3;
                                                                                                                        }
                                                                                                                        i44++;
                                                                                                                        arrayList3 = arrayList3;
                                                                                                                        messageObject2 = messageObject2;
                                                                                                                    }
                                                                                                                    i13 = i12;
                                                                                                                    j12 = j9;
                                                                                                                    z21 = z35;
                                                                                                                }
                                                                                                                if (!z21 && Build.VERSION.SDK_INT < 24 && SharedConfig.passcodeHash.length() == 0 && hasMessagesToReply()) {
                                                                                                                    Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                                                    intent4.putExtra(str29, notificationsController.currentAccount);
                                                                                                                    builder2.addAction(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent4, 167772160));
                                                                                                                }
                                                                                                                showExtraNotifications(builder2, str10, j12, j8, str2, jArr5, i11, jArr4, i13, z33, z32, z11, i7);
                                                                                                                scheduleNotificationRepeat();
                                                                                                                return;
                                                                                                            }
                                                                                                            jArr3 = jArr6;
                                                                                                        }
                                                                                                        jArr6 = Settings.System.DEFAULT_NOTIFICATION_URI;
                                                                                                        if (i11 != 0) {
                                                                                                        }
                                                                                                        if (i41 == 2) {
                                                                                                        }
                                                                                                        jArr3 = jArr6;
                                                                                                    } else if (str30.equals(path)) {
                                                                                                        builder2.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, 5);
                                                                                                    } else if (i43 >= 24 && str30.startsWith(str19) && !AndroidUtilities.isInternalUri(Uri.parse(str30))) {
                                                                                                        try {
                                                                                                            Uri uriForFile2 = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", new File(str30.replace(str19, charSequence2)));
                                                                                                            ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriForFile2, 1);
                                                                                                            builder2.setSound(uriForFile2, 5);
                                                                                                        } catch (Exception unused2) {
                                                                                                            builder2.setSound(Uri.parse(str30), 5);
                                                                                                        }
                                                                                                    } else {
                                                                                                        builder2.setSound(Uri.parse(str30), 5);
                                                                                                    }
                                                                                                }
                                                                                                jArr6 = jArr;
                                                                                                if (i11 != 0) {
                                                                                                }
                                                                                                if (i41 == 2) {
                                                                                                }
                                                                                                jArr3 = jArr6;
                                                                                            } else {
                                                                                                jArr2 = new long[]{0, 0};
                                                                                                builder2.setVibrate(jArr2);
                                                                                                jArr3 = jArr;
                                                                                            }
                                                                                            jArr5 = jArr2;
                                                                                            jArr4 = jArr3;
                                                                                            if (AndroidUtilities.needShowPasscode()) {
                                                                                            }
                                                                                            i13 = i12;
                                                                                            j12 = j9;
                                                                                            z21 = false;
                                                                                            if (!z21) {
                                                                                                Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                                intent42.putExtra(str29, notificationsController.currentAccount);
                                                                                                builder2.addAction(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent42, 167772160));
                                                                                            }
                                                                                            showExtraNotifications(builder2, str10, j12, j8, str2, jArr5, i11, jArr4, i13, z33, z32, z11, i7);
                                                                                            scheduleNotificationRepeat();
                                                                                            return;
                                                                                        }
                                                                                        jArr = null;
                                                                                        boolean z342 = z14;
                                                                                        if (z) {
                                                                                        }
                                                                                        builder2.setPriority(-1);
                                                                                    }
                                                                                    user3 = user2;
                                                                                } else {
                                                                                    chat3 = chat2;
                                                                                    user3 = user2;
                                                                                    if (notificationsController.pushDialogs.size() == 1 && j9 != globalSecretChatId) {
                                                                                        intent.putExtra("encId", DialogObject.getEncryptedChatId(j9));
                                                                                    }
                                                                                }
                                                                                fileLocation = null;
                                                                                String str292 = str4;
                                                                                intent.putExtra(str292, notificationsController.currentAccount);
                                                                                boolean z332 = z19;
                                                                                int i412 = i10;
                                                                                builder2 = builder;
                                                                                String str302 = str15;
                                                                                builder2.setContentTitle(charSequence).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                                builder2.setCategory("msg");
                                                                                if (chat3 == null) {
                                                                                    builder2.addPerson("tel:+" + user3.phone);
                                                                                }
                                                                                Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                                intent22.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                                intent22.putExtra(str292, notificationsController.currentAccount);
                                                                                if (messageObject2.isStoryPush) {
                                                                                }
                                                                                if (messageObject2.isStoryReactionPush) {
                                                                                }
                                                                                builder2.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i17, intent22, 167772160));
                                                                                if (bitmap2 != null) {
                                                                                }
                                                                                jArr = null;
                                                                                boolean z3422 = z14;
                                                                                if (z) {
                                                                                }
                                                                                builder2.setPriority(-1);
                                                                            }
                                                                            chat3 = chat2;
                                                                            user3 = user2;
                                                                            fileLocation = null;
                                                                            String str2922 = str4;
                                                                            intent.putExtra(str2922, notificationsController.currentAccount);
                                                                            boolean z3322 = z19;
                                                                            int i4122 = i10;
                                                                            builder2 = builder;
                                                                            String str3022 = str15;
                                                                            builder2.setContentTitle(charSequence).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                            builder2.setCategory("msg");
                                                                            if (chat3 == null) {
                                                                            }
                                                                            Intent intent222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                            intent222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                            intent222.putExtra(str2922, notificationsController.currentAccount);
                                                                            if (messageObject2.isStoryPush) {
                                                                            }
                                                                            if (messageObject2.isStoryReactionPush) {
                                                                            }
                                                                            builder2.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i17, intent222, 167772160));
                                                                            if (bitmap2 != null) {
                                                                            }
                                                                            jArr = null;
                                                                            boolean z34222 = z14;
                                                                            if (z) {
                                                                            }
                                                                            builder2.setPriority(-1);
                                                                        }
                                                                    } else {
                                                                        charSequence2 = "";
                                                                    }
                                                                    z13 = z16;
                                                                    z18 = true;
                                                                    str14 = str13;
                                                                    i9 = 3;
                                                                    if (i != i9) {
                                                                        i4 = i;
                                                                        z18 = false;
                                                                    }
                                                                    if (num != null) {
                                                                        i6 = num.intValue();
                                                                        z18 = false;
                                                                    }
                                                                    if (i2 != 0) {
                                                                    }
                                                                    i2 = i8;
                                                                    z19 = z18;
                                                                    if (z12) {
                                                                    }
                                                                    if (z17) {
                                                                        ringerMode = audioManager.getRingerMode();
                                                                        if (ringerMode != 0) {
                                                                            i2 = 2;
                                                                        }
                                                                    }
                                                                    if (z11) {
                                                                    }
                                                                    Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                                    intent5.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                                    intent5.setFlags(67108864);
                                                                    if (messageObject2.isStoryReactionPush) {
                                                                    }
                                                                    chat3 = chat2;
                                                                    user3 = user2;
                                                                    fileLocation = null;
                                                                    String str29222 = str4;
                                                                    intent5.putExtra(str29222, notificationsController.currentAccount);
                                                                    boolean z33222 = z19;
                                                                    int i41222 = i10;
                                                                    builder2 = builder;
                                                                    String str30222 = str15;
                                                                    builder2.setContentTitle(charSequence).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent5, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                    builder2.setCategory("msg");
                                                                    if (chat3 == null) {
                                                                    }
                                                                    Intent intent2222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                    intent2222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                    intent2222.putExtra(str29222, notificationsController.currentAccount);
                                                                    if (messageObject2.isStoryPush) {
                                                                    }
                                                                    if (messageObject2.isStoryReactionPush) {
                                                                    }
                                                                    builder2.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i17, intent2222, 167772160));
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    jArr = null;
                                                                    boolean z342222 = z14;
                                                                    if (z) {
                                                                    }
                                                                    builder2.setPriority(-1);
                                                                }
                                                            }
                                                            z11 = z10;
                                                            String path2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                                            boolean z312 = ApplicationLoader.mainInterfacePaused;
                                                            boolean z322 = !z312;
                                                            getSharedPrefKey(j6, j7);
                                                            if (notificationsController.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j6, j7, false)) {
                                                            }
                                                            if (messageObject2.isReactionPush) {
                                                            }
                                                            str12 = str11;
                                                            chat2 = chat5;
                                                            j9 = j6;
                                                            j10 = j;
                                                            z14 = z7;
                                                            j11 = sharedPreferences3.getLong("ReactionSoundDocId", 0L);
                                                            if (j11 == 0) {
                                                            }
                                                            int i332 = sharedPreferences3.getInt("vibrate_react", 0);
                                                            int i342 = sharedPreferences3.getInt("priority_react", 1);
                                                            String str262 = string3;
                                                            int i352 = sharedPreferences3.getInt("ReactionsLed", -16776961);
                                                            z16 = z15;
                                                            i3 = i332;
                                                            if (messageObject2.isStoryReactionPush) {
                                                            }
                                                            if (i3 != i5) {
                                                            }
                                                            if (TextUtils.isEmpty(str12)) {
                                                            }
                                                            z13 = z16;
                                                            z18 = true;
                                                            str14 = str13;
                                                            i9 = 3;
                                                            if (i != i9) {
                                                            }
                                                            if (num != null) {
                                                            }
                                                            if (i2 != 0) {
                                                            }
                                                            i2 = i8;
                                                            z19 = z18;
                                                            if (z12) {
                                                            }
                                                            if (z17) {
                                                            }
                                                            if (z11) {
                                                            }
                                                            Intent intent52 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                            intent52.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                            intent52.setFlags(67108864);
                                                            if (messageObject2.isStoryReactionPush) {
                                                            }
                                                            chat3 = chat2;
                                                            user3 = user2;
                                                            fileLocation = null;
                                                            String str292222 = str4;
                                                            intent52.putExtra(str292222, notificationsController.currentAccount);
                                                            boolean z332222 = z19;
                                                            int i412222 = i10;
                                                            builder2 = builder;
                                                            String str302222 = str15;
                                                            builder2.setContentTitle(charSequence).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent52, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                            builder2.setCategory("msg");
                                                            if (chat3 == null) {
                                                            }
                                                            Intent intent22222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                            intent22222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                            intent22222.putExtra(str292222, notificationsController.currentAccount);
                                                            if (messageObject2.isStoryPush) {
                                                            }
                                                            if (messageObject2.isStoryReactionPush) {
                                                            }
                                                            builder2.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i17, intent22222, 167772160));
                                                            if (bitmap2 != null) {
                                                            }
                                                            jArr = null;
                                                            boolean z3422222 = z14;
                                                            if (z) {
                                                            }
                                                            builder2.setPriority(-1);
                                                        }
                                                    }
                                                }
                                            } else {
                                                str8 = stringForMessage;
                                                builder = builder3;
                                            }
                                            str9 = str7;
                                        } else {
                                            str8 = stringForMessage;
                                            builder = builder3;
                                            str9 = str7;
                                            z9 = z8;
                                            sharedPreferences3 = sharedPreferences2;
                                            j6 = j5;
                                        }
                                        z10 = z9;
                                        if (z10) {
                                        }
                                        z11 = z10;
                                        String path22 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                        boolean z3122 = ApplicationLoader.mainInterfacePaused;
                                        boolean z3222 = !z3122;
                                        getSharedPrefKey(j6, j7);
                                        if (notificationsController.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j6, j7, false)) {
                                        }
                                        if (messageObject2.isReactionPush) {
                                        }
                                        str12 = str11;
                                        chat2 = chat5;
                                        j9 = j6;
                                        j10 = j;
                                        z14 = z7;
                                        j11 = sharedPreferences3.getLong("ReactionSoundDocId", 0L);
                                        if (j11 == 0) {
                                        }
                                        int i3322 = sharedPreferences3.getInt("vibrate_react", 0);
                                        int i3422 = sharedPreferences3.getInt("priority_react", 1);
                                        String str2622 = string3;
                                        int i3522 = sharedPreferences3.getInt("ReactionsLed", -16776961);
                                        z16 = z15;
                                        i3 = i3322;
                                        if (messageObject2.isStoryReactionPush) {
                                        }
                                        if (i3 != i5) {
                                        }
                                        if (TextUtils.isEmpty(str12)) {
                                        }
                                        z13 = z16;
                                        z18 = true;
                                        str14 = str13;
                                        i9 = 3;
                                        if (i != i9) {
                                        }
                                        if (num != null) {
                                        }
                                        if (i2 != 0) {
                                        }
                                        i2 = i8;
                                        z19 = z18;
                                        if (z12) {
                                        }
                                        if (z17) {
                                        }
                                        if (z11) {
                                        }
                                        Intent intent522 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                        intent522.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                        intent522.setFlags(67108864);
                                        if (messageObject2.isStoryReactionPush) {
                                        }
                                        chat3 = chat2;
                                        user3 = user2;
                                        fileLocation = null;
                                        String str2922222 = str4;
                                        intent522.putExtra(str2922222, notificationsController.currentAccount);
                                        boolean z3322222 = z19;
                                        int i4122222 = i10;
                                        builder2 = builder;
                                        String str3022222 = str15;
                                        builder2.setContentTitle(charSequence).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent522, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                        builder2.setCategory("msg");
                                        if (chat3 == null) {
                                        }
                                        Intent intent222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                        intent222222.putExtra("messageDate", messageObject2.messageOwner.date);
                                        intent222222.putExtra(str2922222, notificationsController.currentAccount);
                                        if (messageObject2.isStoryPush) {
                                        }
                                        if (messageObject2.isStoryReactionPush) {
                                        }
                                        builder2.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i17, intent222222, 167772160));
                                        if (bitmap2 != null) {
                                        }
                                        jArr = null;
                                        boolean z34222222 = z14;
                                        if (z) {
                                        }
                                        builder2.setPriority(-1);
                                    }
                                    z8 = true;
                                    if (z8) {
                                    }
                                    str8 = stringForMessage;
                                    builder = builder3;
                                    str9 = str7;
                                    z9 = z8;
                                    sharedPreferences3 = sharedPreferences2;
                                    j6 = j5;
                                    z10 = z9;
                                    if (z10) {
                                    }
                                    z11 = z10;
                                    String path222 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                    boolean z31222 = ApplicationLoader.mainInterfacePaused;
                                    boolean z32222 = !z31222;
                                    getSharedPrefKey(j6, j7);
                                    if (notificationsController.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j6, j7, false)) {
                                    }
                                    if (messageObject2.isReactionPush) {
                                    }
                                    str12 = str11;
                                    chat2 = chat5;
                                    j9 = j6;
                                    j10 = j;
                                    z14 = z7;
                                    j11 = sharedPreferences3.getLong("ReactionSoundDocId", 0L);
                                    if (j11 == 0) {
                                    }
                                    int i33222 = sharedPreferences3.getInt("vibrate_react", 0);
                                    int i34222 = sharedPreferences3.getInt("priority_react", 1);
                                    String str26222 = string3;
                                    int i35222 = sharedPreferences3.getInt("ReactionsLed", -16776961);
                                    z16 = z15;
                                    i3 = i33222;
                                    if (messageObject2.isStoryReactionPush) {
                                    }
                                    if (i3 != i5) {
                                    }
                                    if (TextUtils.isEmpty(str12)) {
                                    }
                                    z13 = z16;
                                    z18 = true;
                                    str14 = str13;
                                    i9 = 3;
                                    if (i != i9) {
                                    }
                                    if (num != null) {
                                    }
                                    if (i2 != 0) {
                                    }
                                    i2 = i8;
                                    z19 = z18;
                                    if (z12) {
                                    }
                                    if (z17) {
                                    }
                                    if (z11) {
                                    }
                                    Intent intent5222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                    intent5222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    intent5222.setFlags(67108864);
                                    if (messageObject2.isStoryReactionPush) {
                                    }
                                    chat3 = chat2;
                                    user3 = user2;
                                    fileLocation = null;
                                    String str29222222 = str4;
                                    intent5222.putExtra(str29222222, notificationsController.currentAccount);
                                    boolean z33222222 = z19;
                                    int i41222222 = i10;
                                    builder2 = builder;
                                    String str30222222 = str15;
                                    builder2.setContentTitle(charSequence).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent5222, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                    builder2.setCategory("msg");
                                    if (chat3 == null) {
                                    }
                                    Intent intent2222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                    intent2222222.putExtra("messageDate", messageObject2.messageOwner.date);
                                    intent2222222.putExtra(str29222222, notificationsController.currentAccount);
                                    if (messageObject2.isStoryPush) {
                                    }
                                    if (messageObject2.isStoryReactionPush) {
                                    }
                                    builder2.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i17, intent2222222, 167772160));
                                    if (bitmap2 != null) {
                                    }
                                    jArr = null;
                                    boolean z342222222 = z14;
                                    if (z) {
                                    }
                                    builder2.setPriority(-1);
                                }
                                str3 = string;
                                sharedPreferences = notificationsSettings;
                                str4 = str21;
                                if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                                    string2 = LocaleController.getString(R.string.NotificationHiddenName);
                                    if (equalsIgnoreCase) {
                                    }
                                    NotificationCompat.Builder builder32 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                                    if (notificationsController.pushMessages.size() > 1) {
                                    }
                                    z6 = z3;
                                    boolean[] zArr3 = new boolean[1];
                                    String str232 = str5;
                                    messageObject2 = messageObject;
                                    stringForMessage = notificationsController.getStringForMessage(messageObject2, false, zArr3, null);
                                    boolean isSilentMessage2 = notificationsController.isSilentMessage(messageObject2);
                                    if (stringForMessage != null) {
                                    }
                                }
                                string2 = str3;
                                if (equalsIgnoreCase) {
                                }
                                NotificationCompat.Builder builder322 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                                if (notificationsController.pushMessages.size() > 1) {
                                }
                                z6 = z3;
                                boolean[] zArr32 = new boolean[1];
                                String str2322 = str5;
                                messageObject2 = messageObject;
                                stringForMessage = notificationsController.getStringForMessage(messageObject2, false, zArr32, null);
                                boolean isSilentMessage22 = notificationsController.isSilentMessage(messageObject2);
                                if (stringForMessage != null) {
                                }
                            }
                        } else {
                            str2 = str22;
                        }
                        if (z4) {
                            string = LocaleController.getString(R.string.AppName);
                        } else if (j2 != 0) {
                            string = LocaleController.getString(R.string.NotificationHiddenChatName);
                        } else {
                            string = LocaleController.getString(R.string.NotificationHiddenName);
                        }
                        z5 = false;
                        if (!messageObject.isReactionPush) {
                            str3 = string;
                            sharedPreferences = notificationsSettings;
                            str4 = str21;
                            string2 = str3;
                            if (equalsIgnoreCase) {
                            }
                            NotificationCompat.Builder builder3222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                            if (notificationsController.pushMessages.size() > 1) {
                            }
                            z6 = z3;
                            boolean[] zArr322 = new boolean[1];
                            String str23222 = str5;
                            messageObject2 = messageObject;
                            stringForMessage = notificationsController.getStringForMessage(messageObject2, false, zArr322, null);
                            boolean isSilentMessage222 = notificationsController.isSilentMessage(messageObject2);
                            if (stringForMessage != null) {
                            }
                        }
                        str3 = string;
                        sharedPreferences = notificationsSettings;
                        str4 = str21;
                        if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                        }
                        string2 = str3;
                        if (equalsIgnoreCase) {
                        }
                        NotificationCompat.Builder builder32222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                        if (notificationsController.pushMessages.size() > 1) {
                        }
                        z6 = z3;
                        boolean[] zArr3222 = new boolean[1];
                        String str232222 = str5;
                        messageObject2 = messageObject;
                        stringForMessage = notificationsController.getStringForMessage(messageObject2, false, zArr3222, null);
                        boolean isSilentMessage2222 = notificationsController.isSilentMessage(messageObject2);
                        if (stringForMessage != null) {
                        }
                    }
                    z4 = true;
                    equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                    if (DialogObject.isEncryptedDialog(dialogId)) {
                    }
                    if (z4) {
                    }
                    z5 = false;
                    if (!messageObject.isReactionPush) {
                    }
                    str3 = string;
                    sharedPreferences = notificationsSettings;
                    str4 = str21;
                    if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                    }
                    string2 = str3;
                    if (equalsIgnoreCase) {
                    }
                    NotificationCompat.Builder builder322222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                    if (notificationsController.pushMessages.size() > 1) {
                    }
                    z6 = z3;
                    boolean[] zArr32222 = new boolean[1];
                    String str2322222 = str5;
                    messageObject2 = messageObject;
                    stringForMessage = notificationsController.getStringForMessage(messageObject2, false, zArr32222, null);
                    boolean isSilentMessage22222 = notificationsController.isSilentMessage(messageObject2);
                    if (stringForMessage != null) {
                    }
                }
                if (chat5 != null) {
                    j3 = topicId;
                    notificationsController = this;
                    userName = notificationsController.getTitle(chat5);
                } else {
                    j3 = topicId;
                    notificationsController = this;
                    userName = UserObject.getUserName(user);
                }
                String str222 = userName;
                if (!AndroidUtilities.needShowPasscode()) {
                    z4 = false;
                    equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                    if (DialogObject.isEncryptedDialog(dialogId)) {
                    }
                    if (z4) {
                    }
                    z5 = false;
                    if (!messageObject.isReactionPush) {
                    }
                    str3 = string;
                    sharedPreferences = notificationsSettings;
                    str4 = str21;
                    if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                    }
                    string2 = str3;
                    if (equalsIgnoreCase) {
                    }
                    NotificationCompat.Builder builder3222222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                    if (notificationsController.pushMessages.size() > 1) {
                    }
                    z6 = z3;
                    boolean[] zArr322222 = new boolean[1];
                    String str23222222 = str5;
                    messageObject2 = messageObject;
                    stringForMessage = notificationsController.getStringForMessage(messageObject2, false, zArr322222, null);
                    boolean isSilentMessage222222 = notificationsController.isSilentMessage(messageObject2);
                    if (stringForMessage != null) {
                    }
                }
                z4 = true;
                equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                if (DialogObject.isEncryptedDialog(dialogId)) {
                }
                if (z4) {
                }
                z5 = false;
                if (!messageObject.isReactionPush) {
                }
                str3 = string;
                sharedPreferences = notificationsSettings;
                str4 = str21;
                if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                }
                string2 = str3;
                if (equalsIgnoreCase) {
                }
                NotificationCompat.Builder builder32222222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                if (notificationsController.pushMessages.size() > 1) {
                }
                z6 = z3;
                boolean[] zArr3222222 = new boolean[1];
                String str232222222 = str5;
                messageObject2 = messageObject;
                stringForMessage = notificationsController.getStringForMessage(messageObject2, false, zArr3222222, null);
                boolean isSilentMessage2222222 = notificationsController.isSilentMessage(messageObject2);
                if (stringForMessage != null) {
                }
            } else {
                str = "currentAccount";
                chat = null;
            }
            z2 = false;
            String str212 = str;
            TLRPC.Chat chat52 = chat;
            long j212 = j2;
            Bitmap bitmap22 = bitmap;
            int i282 = i27;
            notifyOverride = getNotifyOverride(notificationsSettings, fromChatId, topicId);
            if (notifyOverride != -1) {
            }
            if (j2 == 0) {
            }
            user = user4;
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    private boolean isSilentMessage(MessageObject messageObject) {
        return messageObject.messageOwner.silent || messageObject.isReactionPush;
    }

    private void setNotificationChannel(Notification notification, NotificationCompat.Builder builder, boolean z) {
        String channelId;
        if (z) {
            builder.setChannelId(OTHER_NOTIFICATIONS_CHANNEL);
        } else {
            channelId = notification.getChannelId();
            builder.setChannelId(channelId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetNotificationSound(NotificationCompat.Builder builder, long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        FileLog.d("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 == null || uri == null || TextUtils.equals(uri2.toString(), uri.toString())) {
            return;
        }
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        String uri3 = uri2.toString();
        String string = LocaleController.getString(R.string.DefaultRingtone);
        if (z) {
            if (i3 == 2) {
                edit.putString("ChannelSound", string);
            } else if (i3 == 0) {
                edit.putString("GroupSound", string);
            } else if (i3 == 1) {
                edit.putString("GlobalSound", string);
            } else if (i3 == 3) {
                edit.putString("StoriesSound", string);
            } else if (i3 == 4 || i3 == 5) {
                edit.putString("ReactionSound", string);
            }
            if (i3 == 2) {
                edit.putString("ChannelSoundPath", uri3);
            } else if (i3 == 0) {
                edit.putString("GroupSoundPath", uri3);
            } else if (i3 == 1) {
                edit.putString("GlobalSoundPath", uri3);
            } else if (i3 == 3) {
                edit.putString("StoriesSoundPath", uri3);
            } else if (i3 == 4 || i3 == 5) {
                edit.putString("ReactionSound", uri3);
            }
            getNotificationsController().lambda$deleteNotificationChannelGlobal$40(i3, -1);
        } else {
            edit.putString("sound_" + getSharedPrefKey(j, j2), string);
            edit.putString("sound_path_" + getSharedPrefKey(j, j2), uri3);
            lambda$deleteNotificationChannel$39(j, j2, -1);
        }
        edit.commit();
        builder.setChannelId(validateChannelId(j, j2, str, jArr, i, uri2, i2, z, z2, z3, i3));
        notificationManager.notify(this.notificationId, builder.build());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(94:50|(2:52|(4:54|55|56|57)(4:58|(2:61|59)|62|63))(1:787)|64|(1:66)(1:(1:785)(1:786))|67|68|(4:71|(2:73|74)(1:76)|75|69)|77|78|(5:80|(2:(1:83)(1:656)|84)(1:657)|(1:655)(2:90|(2:94|95))|654|95)(2:658|(5:(1:768)(2:665|(4:667|668|(13:670|(2:672|(1:674)(4:719|(1:721)|722|723))(2:724|(1:732)(2:728|(1:730)))|675|676|(1:678)(2:711|(1:713)(2:714|(1:716)(8:717|718|680|(1:710)(4:685|(2:687|(3:691|(1:693)|700))(3:702|(2:704|(2:706|(1:708)))|700)|696|(1:698)(1:699))|701|700|696|(0)(0))))|679|680|(0)|710|701|700|696|(0)(0))(9:733|(2:735|(1:737)(4:738|(1:740)|722|723))(9:741|(1:766)(1:745)|746|(1:765)(2:750|(1:752))|764|754|(2:756|(2:758|(1:760)(2:761|718)))(1:763)|762|(0)(0))|680|(0)|710|701|700|696|(0)(0))|57))|767|668|(0)(0)|57)(3:769|(6:771|(2:773|(1:775))(2:777|(2:779|(1:781)))|776|55|56|57)(1:783)|782))|(1:653)(2:99|(74:101|(4:103|(1:105)(1:650)|106|107)(1:651)|(3:109|(3:111|(1:113)(3:637|638|(3:640|(1:642)(1:644)|643))|114)(1:648)|645)(1:649)|(3:116|(1:122)|123)(1:636)|124|(3:631|(1:633)(1:635)|634)(2:127|128)|129|(1:131)|132|(1:134)(1:621)|135|(2:619|620)(1:139)|140|141|(3:144|(1:146)|(3:148|149|(62:153|154|155|(51:159|160|161|(1:607)(1:165)|166|(1:606)(1:169)|170|171|(1:605)|178|(1:604)(1:185)|186|(13:188|(1:190)(2:361|(3:363|364|57)(2:365|(1:(1:368)(10:369|192|193|(2:196|194)|197|198|(1:360)(1:201)|202|(1:204)(1:359)|205))(11:370|(1:372)(2:373|(1:378)(1:377))|193|(1:194)|197|198|(0)|360|202|(0)(0)|205)))|191|192|193|(1:194)|197|198|(0)|360|202|(0)(0)|205)(4:379|(6:381|(1:383)(3:388|(2:594|(1:596)(2:597|(1:601)))(1:392)|(3:394|(1:396)|397)(17:398|(1:400)|401|(2:590|(1:592)(1:593))(1:407)|408|(3:582|(1:(1:585)(2:586|(1:588)))|589)(1:412)|413|(2:(1:428)(2:416|(2:(2:419|(1:421))(1:424)|422)(2:425|(2:427|422)))|423)|429|(3:522|(1:581)(5:528|(2:579|580)(4:531|(1:535)|(1:578)(2:541|(1:545))|577)|(3:550|(2:552|(2:558|(1:562)))(2:565|(1:575))|563)|576|563)|564)(1:433)|434|(6:436|(1:520)(7:449|(1:519)(2:453|(6:507|508|509|510|511|512)(1:455))|456|(1:458)(1:506)|459|460|(7:494|495|496|497|498|499|(5:466|(1:468)|469|470|(2:475|(3:477|(2:482|483)(1:479)|(1:481))))(1:491))(4:462|(2:493|(0)(0))|464|(0)(0)))|492|469|470|(3:473|475|(0)))(1:521)|486|(3:490|386|387)|385|386|387))|384|385|386|387)|602|603)|206|(2:344|(4:346|(2:349|347)|350|351)(2:352|(1:354)(2:355|(1:357)(1:358))))(1:210)|211|(1:213)|214|(1:216)|217|(2:219|(1:221)(1:339))(2:340|(1:342)(1:343))|(1:223)(1:338)|224|(4:226|(2:229|227)|230|231)(1:337)|232|(1:234)|235|236|237|(1:239)|(1:243)|244|(1:246)|(1:332)(4:252|(5:255|(2:256|(1:330)(2:258|(2:261|262)(1:260)))|263|(1:266)(1:265)|253)|331|267)|(1:269)|270|(2:(1:273)|(1:280))|281|(1:329)(1:287)|288|(1:290)|(1:292)|293|(3:298|(4:300|(3:302|(4:304|(1:306)|307|308)(2:310|311)|309)|312|313)|314)|315|(1:328)(2:318|(1:322))|323|(1:325)|326|327|57)|612|(1:163)|607|166|(0)|606|170|171|(1:173)|605|178|(1:181)|604|186|(0)(0)|206|(1:208)|344|(0)(0)|211|(0)|214|(0)|217|(0)(0)|(0)(0)|224|(0)(0)|232|(0)|235|236|237|(0)|(2:241|243)|244|(0)|(1:248)|332|(0)|270|(0)|281|(1:283)|329|288|(0)|(0)|293|(4:295|298|(0)|314)|315|(0)|328|323|(0)|326|327|57)))|618|612|(0)|607|166|(0)|606|170|171|(0)|605|178|(0)|604|186|(0)(0)|206|(0)|344|(0)(0)|211|(0)|214|(0)|217|(0)(0)|(0)(0)|224|(0)(0)|232|(0)|235|236|237|(0)|(0)|244|(0)|(0)|332|(0)|270|(0)|281|(0)|329|288|(0)|(0)|293|(0)|315|(0)|328|323|(0)|326|327|57))|652|(0)(0)|(0)(0)|(0)(0)|124|(0)|623|625|627|629|631|(0)(0)|634|129|(0)|132|(0)(0)|135|(1:137)|619|620|140|141|(3:144|(0)|(0))|618|612|(0)|607|166|(0)|606|170|171|(0)|605|178|(0)|604|186|(0)(0)|206|(0)|344|(0)(0)|211|(0)|214|(0)|217|(0)(0)|(0)(0)|224|(0)(0)|232|(0)|235|236|237|(0)|(0)|244|(0)|(0)|332|(0)|270|(0)|281|(0)|329|288|(0)|(0)|293|(0)|315|(0)|328|323|(0)|326|327|57) */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x1316, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x1335, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x05c5, code lost:
    
        if (r0.local_id != 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x05ee, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x05ec, code lost:
    
        if (r0.local_id != 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x047e, code lost:
    
        if (r14.local_id != 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x0537, code lost:
    
        if (r8.local_id != 0) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x089a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x08f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0925 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0aa2 A[LOOP:5: B:194:0x0a9a->B:196:0x0aa2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0abe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x10b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x113b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x115e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x11bb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1220  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1260  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x12b5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x130e A[Catch: Exception -> 0x1316, TryCatch #8 {Exception -> 0x1316, blocks: (B:237:0x12f0, B:239:0x130e, B:241:0x131a, B:243:0x131e, B:244:0x1325), top: B:236:0x12f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x131a A[Catch: Exception -> 0x1316, TryCatch #8 {Exception -> 0x1316, blocks: (B:237:0x12f0, B:239:0x130e, B:241:0x131a, B:243:0x131e, B:244:0x1325), top: B:236:0x12f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x133a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x1345  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x139c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x13df  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x13fc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x1414  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x141a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x1426  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x1433  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x14be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x14f0  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x1281  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x1243  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x11f8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x10ce  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x10f5  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0eee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0f83  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0fd6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0fb3  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0efb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0590 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:698:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x1595  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x1614  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x167c  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x15e1  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x020b A[EDGE_INSN: B:842:0x020b->B:790:0x020b BREAK  A[LOOP:2: B:47:0x01eb->B:57:0x1571], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:843:0x01b3  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showExtraNotifications(NotificationCompat.Builder builder, String str, long j, long j2, String str2, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        String str3;
        String str4;
        NotificationCompat.Builder builder2;
        int i4;
        boolean z4;
        long clientUserId;
        boolean z5;
        LongSparseArray longSparseArray;
        int size;
        int i5;
        LongSparseArray longSparseArray2;
        NotificationsController notificationsController;
        ArrayList arrayList;
        int i6;
        int size2;
        int i7;
        LongSparseArray longSparseArray3;
        ArrayList arrayList2;
        Notification notification;
        String str5;
        int id;
        ArrayList<StoryNotification> arrayList3;
        LongSparseArray longSparseArray4;
        boolean z6;
        LongSparseArray longSparseArray5;
        MessageObject messageObject;
        long j3;
        long j4;
        String str6;
        SharedPreferences sharedPreferences;
        String str7;
        LongSparseArray longSparseArray6;
        int i8;
        DialogKey dialogKey;
        long j5;
        ArrayList<StoryNotification> arrayList4;
        long j6;
        Integer num;
        String str8;
        TLRPC.User user;
        TLRPC.User user2;
        String string;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        NotificationsController notificationsController2;
        int i9;
        ArrayList arrayList5;
        int i10;
        Notification notification2;
        String str9;
        String str10;
        LongSparseArray longSparseArray7;
        SharedPreferences sharedPreferences2;
        LongSparseArray longSparseArray8;
        long j7;
        boolean z11;
        boolean z12;
        DialogKey dialogKey2;
        TLRPC.FileLocation fileLocation2;
        String str11;
        String str12;
        TLRPC.Chat chat2;
        TLRPC.FileLocation fileLocation3;
        boolean z13;
        TLRPC.User user3;
        boolean canSendPlain;
        boolean z14;
        TLRPC.User user4;
        String str13;
        TLRPC.Chat chat3;
        boolean z15;
        TLRPC.FileLocation fileLocation4;
        String userName;
        SharedPreferences sharedPreferences3;
        String str14;
        String str15;
        SharedPreferences sharedPreferences4;
        boolean z16;
        TLRPC.User user5;
        File file;
        Bitmap bitmap;
        Bitmap bitmap2;
        LongSparseArray longSparseArray9;
        TLRPC.Chat chat4;
        String str16;
        int i11;
        String str17;
        ?? r9;
        String formatString;
        NotificationCompat.Action build;
        Integer num2;
        DialogKey dialogKey3;
        int max;
        MessageObject messageObject2;
        long j8;
        NotificationCompat.Action action;
        long j9;
        Person person;
        NotificationCompat.MessagingStyle messagingStyle;
        NotificationCompat.MessagingStyle messagingStyle2;
        int i12;
        long j10;
        DialogKey dialogKey4;
        ArrayList<TLRPC.TL_keyboardButtonRow> arrayList6;
        StringBuilder sb;
        String str18;
        ArrayList<StoryNotification> arrayList7;
        long j11;
        LongSparseArray longSparseArray10;
        String str19;
        NotificationCompat.MessagingStyle messagingStyle3;
        String str20;
        int i13;
        Bitmap bitmap3;
        String str21;
        boolean z17;
        long j12;
        String str22;
        String str23;
        long j13;
        int i14;
        StringBuilder sb2;
        String str24;
        LongSparseArray longSparseArray11;
        String[] strArr;
        NotificationCompat.MessagingStyle messagingStyle4;
        boolean z18;
        String str25;
        Person person2;
        NotificationCompat.MessagingStyle messagingStyle5;
        File file2;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation5;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation6;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation7;
        NotificationCompat.MessagingStyle messagingStyle6;
        String str26;
        String str27;
        TLRPC.ReplyMarkup replyMarkup;
        ArrayList<TLRPC.TL_keyboardButtonRow> arrayList8;
        String str28;
        List messages;
        Uri uri2;
        String str29;
        final File file3;
        Context context;
        StringBuilder sb3;
        final Uri uriForFile;
        NotificationCompat.MessagingStyle messagingStyle7;
        Bitmap createScaledBitmap;
        Canvas canvas;
        String string2;
        DialogKey dialogKey5;
        long j14;
        ArrayList<TLRPC.TL_keyboardButtonRow> arrayList9;
        Bitmap bitmap4;
        NotificationCompat.Action action2;
        String str30;
        long j15;
        ArrayList<StoryNotification> arrayList10;
        long j16;
        TLRPC.TL_keyboardButtonCopy tL_keyboardButtonCopy;
        TLRPC.User user6;
        int size3;
        int i15;
        int i16;
        ArrayList<TLRPC.TL_keyboardButtonRow> arrayList11;
        DialogKey dialogKey6;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup2;
        Intent intent;
        LongSparseArray longSparseArray12;
        int i17;
        TLRPC.User user7;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation8;
        Bitmap bitmap5;
        Bitmap decodeFile;
        String string3;
        String formatPluralString;
        String str31;
        String str32;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        FileLog.d("showExtraNotifications pushMessages.size()=" + this.pushMessages.size());
        if (Build.VERSION.SDK_INT >= 26) {
            str3 = "%1$s: %2$s";
            i4 = -1;
            str4 = ".provider";
            builder2 = builder;
            builder2.setChannelId(validateChannelId(j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
        } else {
            str3 = "%1$s: %2$s";
            str4 = ".provider";
            builder2 = builder;
            i4 = -1;
        }
        Notification build2 = builder.build();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        ArrayList arrayList12 = new ArrayList();
        NotificationsController notificationsController3 = this;
        if (!notificationsController3.storyPushMessages.isEmpty()) {
            arrayList12.add(new DialogKey(0L, 0L, true));
        }
        LongSparseArray longSparseArray13 = new LongSparseArray();
        for (int i18 = 0; i18 < notificationsController3.pushMessages.size(); i18++) {
            MessageObject messageObject3 = notificationsController3.pushMessages.get(i18);
            long dialogId = messageObject3.getDialogId();
            long topicId = MessageObject.getTopicId(notificationsController3.currentAccount, messageObject3.messageOwner, getMessagesController().isForum(messageObject3));
            int i19 = notificationsSettings.getInt("dismissDate" + dialogId, 0);
            if (!messageObject3.isStoryPush && messageObject3.messageOwner.date <= i19) {
                FileLog.d("showExtraNotifications: dialog " + dialogId + " is skipped, message date (" + messageObject3.messageOwner.date + " <= " + i19 + ")");
            } else {
                ArrayList arrayList13 = (ArrayList) longSparseArray13.get(dialogId);
                if (arrayList13 == null) {
                    ArrayList arrayList14 = new ArrayList();
                    longSparseArray13.put(dialogId, arrayList14);
                    FileLog.d("showExtraNotifications: sortedDialogs += " + dialogId);
                    arrayList12.add(new DialogKey(dialogId, topicId, false));
                    arrayList13 = arrayList14;
                }
                arrayList13.add(messageObject3);
            }
        }
        LongSparseArray longSparseArray14 = new LongSparseArray();
        for (int i20 = 0; i20 < notificationsController3.wearNotificationsIds.size(); i20++) {
            longSparseArray14.put(notificationsController3.wearNotificationsIds.keyAt(i20), (Integer) notificationsController3.wearNotificationsIds.valueAt(i20));
        }
        notificationsController3.wearNotificationsIds.clear();
        ArrayList arrayList15 = new ArrayList();
        int i21 = Build.VERSION.SDK_INT;
        if (i21 > 27) {
            if (arrayList12.size() <= (notificationsController3.storyPushMessages.isEmpty() ? 1 : 2)) {
                z4 = false;
                if (z4 && i21 >= 26) {
                    checkOtherNotificationsChannel();
                }
                clientUserId = getUserConfig().getClientUserId();
                z5 = !AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter;
                FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() <= 0) + " waitingForPasscode=" + z5 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z4);
                longSparseArray = new LongSparseArray();
                size = arrayList12.size();
                i5 = 0;
                while (true) {
                    if (i5 < size) {
                        break;
                    }
                    int i22 = size;
                    if (arrayList15.size() >= 7) {
                        FileLog.d("showExtraNotifications: break from holders, count over 7");
                        break;
                    }
                    DialogKey dialogKey7 = (DialogKey) arrayList12.get(i5);
                    ArrayList arrayList16 = arrayList15;
                    int i23 = i5;
                    if (dialogKey7.story) {
                        ArrayList<StoryNotification> arrayList17 = new ArrayList<>();
                        if (notificationsController3.storyPushMessages.isEmpty()) {
                            FileLog.d("showExtraNotifications: [" + dialogKey7.dialogId + "] continue; story but storyPushMessages is empty");
                            j7 = clientUserId;
                            longSparseArray7 = longSparseArray;
                            z6 = z4;
                            z10 = z5;
                            longSparseArray8 = longSparseArray14;
                            longSparseArray5 = longSparseArray13;
                            arrayList2 = arrayList12;
                            notification2 = build2;
                            sharedPreferences2 = notificationsSettings;
                            notificationsController2 = notificationsController3;
                            i9 = i22;
                            arrayList5 = arrayList16;
                            i10 = i23;
                            str9 = str3;
                            str10 = str4;
                            i5 = i10 + 1;
                            arrayList15 = arrayList5;
                            size = i9;
                            z5 = z10;
                            arrayList12 = arrayList2;
                            str4 = str10;
                            longSparseArray13 = longSparseArray5;
                            z4 = z6;
                            longSparseArray14 = longSparseArray8;
                            clientUserId = j7;
                            str3 = str9;
                            longSparseArray = longSparseArray7;
                            build2 = notification2;
                            i4 = -1;
                            notificationsController3 = notificationsController2;
                            notificationsSettings = sharedPreferences2;
                        } else {
                            notification = build2;
                            arrayList2 = arrayList12;
                            long j17 = notificationsController3.storyPushMessages.get(0).dialogId;
                            Iterator<Integer> it = notificationsController3.storyPushMessages.get(0).dateByIds.keySet().iterator();
                            int i24 = 0;
                            while (it.hasNext()) {
                                i24 = Math.max(i24, it.next().intValue());
                                arrayList17 = arrayList17;
                            }
                            longSparseArray4 = longSparseArray;
                            z6 = z4;
                            longSparseArray5 = longSparseArray13;
                            id = i24;
                            messageObject = null;
                            str5 = "showExtraNotifications: [";
                            arrayList3 = arrayList17;
                            j4 = j17;
                            j3 = 0;
                        }
                    } else {
                        arrayList2 = arrayList12;
                        notification = build2;
                        long j18 = dialogKey7.dialogId;
                        str5 = "showExtraNotifications: [";
                        long j19 = dialogKey7.topicId;
                        ArrayList<StoryNotification> arrayList18 = (ArrayList) longSparseArray13.get(j18);
                        id = ((MessageObject) arrayList18.get(0)).getId();
                        arrayList3 = arrayList18;
                        longSparseArray4 = longSparseArray;
                        z6 = z4;
                        longSparseArray5 = longSparseArray13;
                        messageObject = (MessageObject) arrayList18.get(0);
                        j3 = j19;
                        j4 = j18;
                    }
                    int i25 = (Integer) longSparseArray14.get(dialogKey7.dialogId);
                    if (dialogKey7.story) {
                        i25 = 2147483646;
                        str6 = str5;
                        sharedPreferences = notificationsSettings;
                    } else if (i25 == null) {
                        str6 = str5;
                        sharedPreferences = notificationsSettings;
                        long j20 = dialogKey7.dialogId;
                        i25 = Integer.valueOf(((int) j20) + ((int) (j20 >> 32)));
                    } else {
                        str6 = str5;
                        sharedPreferences = notificationsSettings;
                        longSparseArray14.remove(dialogKey7.dialogId);
                    }
                    Integer num3 = i25;
                    int i26 = 0;
                    for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                        if (i26 < ((MessageObject) arrayList3.get(i27)).messageOwner.date) {
                            i26 = ((MessageObject) arrayList3.get(i27)).messageOwner.date;
                        }
                    }
                    if (dialogKey7.story) {
                        str7 = str6;
                        TLRPC.User user8 = getMessagesController().getUser(Long.valueOf(j4));
                        longSparseArray6 = longSparseArray14;
                        if (notificationsController3.storyPushMessages.size() == 1) {
                            if (user8 != null) {
                                formatPluralString = UserObject.getFirstName(user8);
                            } else {
                                formatPluralString = notificationsController3.storyPushMessages.get(0).localName;
                            }
                            i8 = i26;
                        } else {
                            i8 = i26;
                            formatPluralString = LocaleController.formatPluralString("Stories", notificationsController3.storyPushMessages.size(), new Object[0]);
                        }
                        if (user8 == null || (userProfilePhoto4 = user8.photo) == null || (fileLocation = userProfilePhoto4.photo_small) == null) {
                            str31 = formatPluralString;
                            str32 = "Stories";
                        } else {
                            str31 = formatPluralString;
                            str32 = "Stories";
                            if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                dialogKey = dialogKey7;
                                j5 = clientUserId;
                                j6 = j4;
                                string = str31;
                                chat = null;
                                z9 = false;
                                arrayList4 = arrayList3;
                                num = num3;
                                str8 = str32;
                                z7 = false;
                                z8 = false;
                                user2 = user8;
                            }
                        }
                        dialogKey = dialogKey7;
                        j5 = clientUserId;
                        j6 = j4;
                        string = str31;
                        chat = null;
                        fileLocation = null;
                        z9 = false;
                        arrayList4 = arrayList3;
                        num = num3;
                        str8 = str32;
                        z7 = false;
                        z8 = false;
                        user2 = user8;
                    } else {
                        str7 = str6;
                        longSparseArray6 = longSparseArray14;
                        i8 = i26;
                        if (!DialogObject.isEncryptedDialog(j4)) {
                            if (messageObject == null || messageObject.isReactionPush || messageObject.isStoryReactionPush) {
                                j6 = j4;
                            } else {
                                j6 = j4;
                                if (j6 != 777000) {
                                    z11 = true;
                                    if (!DialogObject.isUserDialog(j6)) {
                                        str8 = "Stories";
                                        TLRPC.User user9 = getMessagesController().getUser(Long.valueOf(j6));
                                        if (user9 == null) {
                                            if (messageObject.isFcmMessage()) {
                                                user4 = user9;
                                                arrayList4 = arrayList3;
                                                userName = messageObject.localName;
                                            } else {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.w("not found user to show dialog notification " + j6);
                                                }
                                                z10 = z5;
                                                notificationsController2 = notificationsController3;
                                                i9 = i22;
                                                arrayList5 = arrayList16;
                                                i10 = i23;
                                                notification2 = notification;
                                                str9 = str3;
                                                str10 = str4;
                                                longSparseArray7 = longSparseArray4;
                                                sharedPreferences2 = sharedPreferences;
                                                longSparseArray8 = longSparseArray6;
                                                j7 = clientUserId;
                                            }
                                        } else {
                                            userName = UserObject.getUserName(user9);
                                            TLRPC.UserProfilePhoto userProfilePhoto5 = user9.photo;
                                            if (userProfilePhoto5 == null || (fileLocation3 = userProfilePhoto5.photo_small) == null) {
                                                user4 = user9;
                                                arrayList4 = arrayList3;
                                            } else {
                                                user4 = user9;
                                                arrayList4 = arrayList3;
                                                if (fileLocation3.volume_id != 0) {
                                                }
                                            }
                                        }
                                        fileLocation3 = null;
                                        if (j6 == UserObject.VERIFY) {
                                            str13 = LocaleController.getString(R.string.VerifyCodesNotifications);
                                        } else if (UserObject.isReplyUser(j6)) {
                                            str13 = LocaleController.getString(R.string.RepliesTitle);
                                        } else if (j6 == clientUserId) {
                                            str13 = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                                        } else {
                                            dialogKey = dialogKey7;
                                            j5 = clientUserId;
                                            str12 = userName;
                                            user3 = user4;
                                            chat2 = null;
                                            z13 = false;
                                            z12 = false;
                                            num = num3;
                                            z8 = z13;
                                            canSendPlain = z11;
                                            z14 = z12;
                                            user4 = user3;
                                            str13 = str12;
                                            if (j6 == UserObject.VERIFY || messageObject == null || messageObject.getForwardedFromId() == null) {
                                                z9 = z14;
                                                chat3 = chat2;
                                            } else {
                                                Long forwardedFromId = messageObject.getForwardedFromId();
                                                z9 = z14;
                                                chat3 = chat2;
                                                long longValue = forwardedFromId.longValue();
                                                if (DialogObject.isUserDialog(longValue)) {
                                                    TLRPC.UserProfilePhoto userProfilePhoto6 = getMessagesController().getUser(forwardedFromId).photo;
                                                    if (userProfilePhoto6 != null && (fileLocation4 = userProfilePhoto6.photo_small) != null) {
                                                        string = str13;
                                                        z15 = canSendPlain;
                                                        if (fileLocation4.volume_id != 0) {
                                                        }
                                                        fileLocation = fileLocation3;
                                                    }
                                                } else {
                                                    string = str13;
                                                    z15 = canSendPlain;
                                                    TLRPC.ChatPhoto chatPhoto2 = getMessagesController().getChat(Long.valueOf(-longValue)).photo;
                                                    if (chatPhoto2 != null) {
                                                        fileLocation4 = chatPhoto2.photo_small;
                                                        if (fileLocation4 != null) {
                                                            if (fileLocation4.volume_id != 0) {
                                                            }
                                                        }
                                                    }
                                                    fileLocation = fileLocation3;
                                                }
                                                user2 = user4;
                                                if (j6 != UserObject.VERIFY) {
                                                    chat = chat3;
                                                    z7 = false;
                                                } else {
                                                    chat = chat3;
                                                    z7 = z15;
                                                }
                                            }
                                            string = str13;
                                            z15 = canSendPlain;
                                            fileLocation = fileLocation3;
                                            user2 = user4;
                                            if (j6 != UserObject.VERIFY) {
                                            }
                                        }
                                        canSendPlain = z11;
                                        dialogKey = dialogKey7;
                                        j5 = clientUserId;
                                        num = num3;
                                        z14 = false;
                                        chat2 = null;
                                        z8 = false;
                                        if (j6 == UserObject.VERIFY) {
                                        }
                                        z9 = z14;
                                        chat3 = chat2;
                                        string = str13;
                                        z15 = canSendPlain;
                                        fileLocation = fileLocation3;
                                        user2 = user4;
                                        if (j6 != UserObject.VERIFY) {
                                        }
                                    } else {
                                        arrayList4 = arrayList3;
                                        str8 = "Stories";
                                        num = num3;
                                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j6));
                                        if (chat5 == null) {
                                            if (messageObject.isFcmMessage()) {
                                                boolean isSupergroup = messageObject.isSupergroup();
                                                String str33 = messageObject.localName;
                                                z8 = messageObject.localChannel;
                                                dialogKey = dialogKey7;
                                                j5 = clientUserId;
                                                chat2 = chat5;
                                                fileLocation3 = null;
                                                user4 = null;
                                                str13 = str33;
                                                z14 = isSupergroup;
                                                canSendPlain = false;
                                            } else {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.w("not found chat to show dialog notification " + j6);
                                                }
                                                z10 = z5;
                                                notificationsController2 = notificationsController3;
                                                i9 = i22;
                                                arrayList5 = arrayList16;
                                                i10 = i23;
                                                notification2 = notification;
                                                str9 = str3;
                                                str10 = str4;
                                                longSparseArray7 = longSparseArray4;
                                                sharedPreferences2 = sharedPreferences;
                                                longSparseArray8 = longSparseArray6;
                                                j7 = clientUserId;
                                            }
                                        } else {
                                            boolean z19 = chat5.megagroup;
                                            z8 = ChatObject.isChannel(chat5) && !chat5.megagroup;
                                            String title = notificationsController3.getTitle(chat5);
                                            z12 = z19;
                                            TLRPC.ChatPhoto chatPhoto3 = chat5.photo;
                                            if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                                j5 = clientUserId;
                                                dialogKey2 = dialogKey7;
                                            } else {
                                                j5 = clientUserId;
                                                dialogKey2 = dialogKey7;
                                                if (fileLocation2.volume_id != 0) {
                                                }
                                            }
                                            fileLocation2 = null;
                                            if (j3 != 0) {
                                                dialogKey = dialogKey2;
                                                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(chat5.id, j3);
                                                if (findTopic != null) {
                                                    str11 = findTopic.title + " in " + title;
                                                    if (z11) {
                                                        str12 = str11;
                                                        chat2 = chat5;
                                                        fileLocation3 = fileLocation2;
                                                        z13 = z8;
                                                        user3 = null;
                                                        z8 = z13;
                                                        canSendPlain = z11;
                                                        z14 = z12;
                                                        user4 = user3;
                                                        str13 = str12;
                                                    } else {
                                                        fileLocation3 = fileLocation2;
                                                        canSendPlain = ChatObject.canSendPlain(chat5);
                                                        z14 = z12;
                                                        user4 = null;
                                                        str13 = str11;
                                                        chat2 = chat5;
                                                    }
                                                }
                                            } else {
                                                dialogKey = dialogKey2;
                                            }
                                            str11 = title;
                                            if (z11) {
                                            }
                                        }
                                        if (j6 == UserObject.VERIFY) {
                                        }
                                        z9 = z14;
                                        chat3 = chat2;
                                        string = str13;
                                        z15 = canSendPlain;
                                        fileLocation = fileLocation3;
                                        user2 = user4;
                                        if (j6 != UserObject.VERIFY) {
                                        }
                                    }
                                    i5 = i10 + 1;
                                    arrayList15 = arrayList5;
                                    size = i9;
                                    z5 = z10;
                                    arrayList12 = arrayList2;
                                    str4 = str10;
                                    longSparseArray13 = longSparseArray5;
                                    z4 = z6;
                                    longSparseArray14 = longSparseArray8;
                                    clientUserId = j7;
                                    str3 = str9;
                                    longSparseArray = longSparseArray7;
                                    build2 = notification2;
                                    i4 = -1;
                                    notificationsController3 = notificationsController2;
                                    notificationsSettings = sharedPreferences2;
                                }
                            }
                            z11 = false;
                            if (!DialogObject.isUserDialog(j6)) {
                            }
                            i5 = i10 + 1;
                            arrayList15 = arrayList5;
                            size = i9;
                            z5 = z10;
                            arrayList12 = arrayList2;
                            str4 = str10;
                            longSparseArray13 = longSparseArray5;
                            z4 = z6;
                            longSparseArray14 = longSparseArray8;
                            clientUserId = j7;
                            str3 = str9;
                            longSparseArray = longSparseArray7;
                            build2 = notification2;
                            i4 = -1;
                            notificationsController3 = notificationsController2;
                            notificationsSettings = sharedPreferences2;
                        } else {
                            dialogKey = dialogKey7;
                            j5 = clientUserId;
                            arrayList4 = arrayList3;
                            j6 = j4;
                            num = num3;
                            str8 = "Stories";
                            if (j6 != globalSecretChatId) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(j6);
                                TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                                if (encryptedChat == null) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.w("not found secret chat to show dialog notification " + encryptedChatId);
                                    }
                                } else {
                                    user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                                    if (user == null) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.w("not found secret chat user to show dialog notification " + encryptedChat.user_id);
                                        }
                                    }
                                }
                                z10 = z5;
                                notificationsController2 = notificationsController3;
                                i9 = i22;
                                arrayList5 = arrayList16;
                                i10 = i23;
                                notification2 = notification;
                                str9 = str3;
                                str10 = str4;
                                longSparseArray7 = longSparseArray4;
                                sharedPreferences2 = sharedPreferences;
                                longSparseArray8 = longSparseArray6;
                                j7 = j5;
                                i5 = i10 + 1;
                                arrayList15 = arrayList5;
                                size = i9;
                                z5 = z10;
                                arrayList12 = arrayList2;
                                str4 = str10;
                                longSparseArray13 = longSparseArray5;
                                z4 = z6;
                                longSparseArray14 = longSparseArray8;
                                clientUserId = j7;
                                str3 = str9;
                                longSparseArray = longSparseArray7;
                                build2 = notification2;
                                i4 = -1;
                                notificationsController3 = notificationsController2;
                                notificationsSettings = sharedPreferences2;
                            } else {
                                user = null;
                            }
                            user2 = user;
                            string = LocaleController.getString(R.string.SecretChatName);
                            chat = null;
                            fileLocation = null;
                            z7 = false;
                            z8 = false;
                            z9 = false;
                        }
                    }
                    if (messageObject == null || !messageObject.isStoryReactionPush) {
                        sharedPreferences3 = sharedPreferences;
                        str14 = string;
                    } else {
                        sharedPreferences3 = sharedPreferences;
                        str14 = string;
                        if (!sharedPreferences3.getBoolean("EnableReactionsPreview", true)) {
                            str15 = LocaleController.getString(R.string.NotificationHiddenChatName);
                            fileLocation = null;
                            z7 = false;
                            if (z5) {
                                sharedPreferences4 = sharedPreferences3;
                            } else {
                                if (DialogObject.isChatDialog(j6)) {
                                    string3 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                } else {
                                    string3 = LocaleController.getString(R.string.NotificationHiddenName);
                                }
                                str15 = string3;
                                sharedPreferences4 = sharedPreferences3;
                                fileLocation = null;
                                z7 = false;
                            }
                            if (fileLocation == null) {
                                File pathToAttach = getFileLoader().getPathToAttach(fileLocation, true);
                                user5 = user2;
                                if (Build.VERSION.SDK_INT < 28) {
                                    z16 = z5;
                                    bitmap5 = null;
                                    BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                    if (imageFromMemory != null) {
                                        decodeFile = imageFromMemory.getBitmap();
                                    } else {
                                        try {
                                            if (pathToAttach.exists()) {
                                                float dp = 160.0f / AndroidUtilities.dp(50.0f);
                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                options.inSampleSize = dp < 1.0f ? 1 : (int) dp;
                                                decodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    bitmap = decodeFile;
                                    file = pathToAttach;
                                } else {
                                    z16 = z5;
                                    bitmap5 = null;
                                }
                                file = pathToAttach;
                                bitmap = bitmap5;
                            } else {
                                z16 = z5;
                                user5 = user2;
                                file = null;
                                bitmap = null;
                            }
                            if (chat == null) {
                                Person.Builder name = new Person.Builder().setName(str15);
                                if (file != null && file.exists() && Build.VERSION.SDK_INT >= 28) {
                                    loadRoundAvatar(file, name);
                                }
                                bitmap2 = bitmap;
                                longSparseArray9 = longSparseArray4;
                                longSparseArray9.put(-chat.id, name.build());
                            } else {
                                bitmap2 = bitmap;
                                longSparseArray9 = longSparseArray4;
                            }
                            File file4 = file;
                            if ((z8 || z9) && z7 && !SharedConfig.isWaitingForPasscodeEnter && j5 != j6 && !UserObject.isReplyUser(j6) && MessagesController.getInstance(notificationsController3.currentAccount).getSendPaidMessagesStars(j6) <= 0) {
                                chat4 = chat;
                                Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                intent2.putExtra("dialog_id", j6);
                                intent2.putExtra("max_id", id);
                                intent2.putExtra("topic_id", j3);
                                intent2.putExtra("currentAccount", notificationsController3.currentAccount);
                                str16 = "max_id";
                                PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent2, 167772160);
                                RemoteInput build3 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                                if (!DialogObject.isChatDialog(j6)) {
                                    i11 = id;
                                    formatString = LocaleController.formatString(R.string.ReplyToGroup, str15);
                                    str17 = "dialog_id";
                                    r9 = 1;
                                } else {
                                    i11 = id;
                                    str17 = "dialog_id";
                                    r9 = 1;
                                    formatString = LocaleController.formatString(R.string.ReplyToUser, str15);
                                }
                                build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build3).setShowsUserInterface(false).build();
                            } else {
                                chat4 = chat;
                                str16 = "max_id";
                                str17 = "dialog_id";
                                i11 = id;
                                build = null;
                            }
                            num2 = (Integer) notificationsController3.pushDialogs.get(j6);
                            if (num2 == null) {
                                num2 = 0;
                            }
                            dialogKey3 = dialogKey;
                            if (!dialogKey3.story) {
                                max = notificationsController3.storyPushMessages.size();
                            } else {
                                max = Math.max(num2.intValue(), arrayList4.size());
                            }
                            String format = (max > 1 || Build.VERSION.SDK_INT >= 28) ? str15 : String.format("%1$s (%2$d)", str15, Integer.valueOf(max));
                            messageObject2 = messageObject;
                            j8 = j5;
                            Person person3 = (Person) longSparseArray9.get(j8);
                            action = build;
                            if (Build.VERSION.SDK_INT >= 28 && person3 == null) {
                                user7 = getMessagesController().getUser(Long.valueOf(j8));
                                if (user7 == null) {
                                    user7 = getUserConfig().getCurrentUser();
                                }
                                if (user7 != null) {
                                    try {
                                        userProfilePhoto3 = user7.photo;
                                    } catch (Throwable th) {
                                        th = th;
                                        j9 = j3;
                                    }
                                    if (userProfilePhoto3 != null && (fileLocation8 = userProfilePhoto3.photo_small) != null) {
                                        j9 = j3;
                                        try {
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (fileLocation8.volume_id != 0 && fileLocation8.local_id != 0) {
                                            Person.Builder name2 = new Person.Builder().setName(LocaleController.getString(R.string.FromYou));
                                            loadRoundAvatar(getFileLoader().getPathToAttach(user7.photo.photo_small, true), name2);
                                            person = name2.build();
                                            try {
                                                longSparseArray9.put(j8, person);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                person3 = person;
                                                FileLog.e(th);
                                                person = person3;
                                                if (messageObject2 == null) {
                                                }
                                                String str34 = "";
                                                if (person == null) {
                                                }
                                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                                messagingStyle2 = messagingStyle;
                                                i12 = Build.VERSION.SDK_INT;
                                                if (i12 >= 28) {
                                                }
                                                messagingStyle2.setConversationTitle(format);
                                                messagingStyle2.setGroupConversation(i12 >= 28 || (!z8 && DialogObject.isChatDialog(j6)) || UserObject.isReplyUser(j6));
                                                StringBuilder sb4 = new StringBuilder();
                                                String[] strArr2 = new String[1];
                                                boolean[] zArr = new boolean[1];
                                                if (dialogKey3.story) {
                                                }
                                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                StringBuilder sb5 = new StringBuilder();
                                                sb5.append("com.tmessages.openchat");
                                                String str35 = str18;
                                                sb5.append(Math.random());
                                                sb5.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent3.setAction(sb5.toString());
                                                intent3.setFlags(67108864);
                                                intent3.addCategory("android.intent.category.LAUNCHER");
                                                if (messageObject2 == null) {
                                                }
                                                dialogKey5 = dialogKey4;
                                                if (dialogKey5.story) {
                                                }
                                                StringBuilder sb6 = new StringBuilder();
                                                sb6.append("show extra notifications chatId ");
                                                sb6.append(j6);
                                                sb6.append(" topicId ");
                                                j14 = j11;
                                                sb6.append(j14);
                                                FileLog.d(sb6.toString());
                                                if (j14 != 0) {
                                                }
                                                intent3.putExtra("currentAccount", notificationsController3.currentAccount);
                                                LongSparseArray longSparseArray15 = longSparseArray10;
                                                PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3, 1140850688);
                                                NotificationCompat.WearableExtender wearableExtender = new NotificationCompat.WearableExtender();
                                                if (action != null) {
                                                }
                                                int i28 = i13;
                                                Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                intent4.addFlags(32);
                                                intent4.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                intent4.putExtra(str17, j6);
                                                int i29 = i11;
                                                intent4.putExtra(str16, i29);
                                                intent4.putExtra("currentAccount", notificationsController3.currentAccount);
                                                arrayList9 = arrayList6;
                                                bitmap4 = bitmap3;
                                                NotificationCompat.Action build4 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent4, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                if (DialogObject.isEncryptedDialog(j6)) {
                                                }
                                                if (str30 != null) {
                                                }
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append("tgaccount");
                                                long j21 = j10;
                                                sb7.append(j21);
                                                wearableExtender.setBridgeTag(sb7.toString());
                                                if (dialogKey5.story) {
                                                }
                                                NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str20).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                                if (dialogKey5.story) {
                                                }
                                                NotificationCompat.Builder category = autoCancel.setNumber(arrayList10.size()).setColor(-15618822).setGroupSummary(false).setWhen(j16).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity).extend(wearableExtender).setSortKey(String.valueOf(Long.MAX_VALUE - j16)).setCategory("msg");
                                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent.putExtra("messageDate", i8);
                                                intent.putExtra("dialogId", j6);
                                                intent.putExtra("currentAccount", notificationsController3.currentAccount);
                                                if (dialogKey5.story) {
                                                }
                                                if (messageObject2 != null) {
                                                }
                                                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                                if (z6) {
                                                }
                                                if (messageObject2 != null) {
                                                }
                                                tL_keyboardButtonCopy = null;
                                                if (tL_keyboardButtonCopy != null) {
                                                }
                                                if (dialogKey5.dialogId != UserObject.VERIFY) {
                                                }
                                                if (arrayList2.size() != 1) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j6)) {
                                                }
                                                if (bitmap4 != null) {
                                                }
                                                if (!AndroidUtilities.needShowPasscode(false)) {
                                                }
                                                DialogKey dialogKey8 = dialogKey5;
                                                if (chat4 == null) {
                                                }
                                                user6 = user5;
                                                Notification notification3 = notification;
                                                boolean z20 = z6;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                FileLog.d("showExtraNotifications: holders.add " + j6);
                                                i9 = i22;
                                                SharedPreferences sharedPreferences5 = sharedPreferences4;
                                                j7 = j15;
                                                z10 = z16;
                                                z6 = z20;
                                                longSparseArray7 = longSparseArray15;
                                                longSparseArray8 = longSparseArray6;
                                                i10 = i23;
                                                str9 = str19;
                                                notification2 = notification3;
                                                sharedPreferences2 = sharedPreferences5;
                                                Integer num4 = num;
                                                str10 = str35;
                                                arrayList5 = arrayList16;
                                                arrayList5.add(new 1NotificationHolder(num.intValue(), j6, dialogKey8.story, j14, str20, user6, chat4, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                                notificationsController2 = this;
                                                notificationsController2.wearNotificationsIds.put(j6, num4);
                                                i5 = i10 + 1;
                                                arrayList15 = arrayList5;
                                                size = i9;
                                                z5 = z10;
                                                arrayList12 = arrayList2;
                                                str4 = str10;
                                                longSparseArray13 = longSparseArray5;
                                                z4 = z6;
                                                longSparseArray14 = longSparseArray8;
                                                clientUserId = j7;
                                                str3 = str9;
                                                longSparseArray = longSparseArray7;
                                                build2 = notification2;
                                                i4 = -1;
                                                notificationsController3 = notificationsController2;
                                                notificationsSettings = sharedPreferences2;
                                            }
                                            boolean z21 = (messageObject2 == null && (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                            String str342 = "";
                                            if (person == null && z21) {
                                                messagingStyle = new NotificationCompat.MessagingStyle(person);
                                            } else {
                                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                            }
                                            messagingStyle2 = messagingStyle;
                                            i12 = Build.VERSION.SDK_INT;
                                            if (i12 >= 28 || ((DialogObject.isChatDialog(j6) && !z8) || UserObject.isReplyUser(j6))) {
                                                messagingStyle2.setConversationTitle(format);
                                            }
                                            messagingStyle2.setGroupConversation(i12 >= 28 || (!z8 && DialogObject.isChatDialog(j6)) || UserObject.isReplyUser(j6));
                                            StringBuilder sb42 = new StringBuilder();
                                            String[] strArr22 = new String[1];
                                            boolean[] zArr2 = new boolean[1];
                                            if (dialogKey3.story) {
                                                ArrayList<String> arrayList19 = new ArrayList<>();
                                                ArrayList<Object> arrayList20 = new ArrayList<>();
                                                Pair<Integer, Boolean> parseStoryPushes = notificationsController3.parseStoryPushes(arrayList19, arrayList20);
                                                int intValue = ((Integer) parseStoryPushes.first).intValue();
                                                boolean booleanValue = ((Boolean) parseStoryPushes.second).booleanValue();
                                                if (booleanValue) {
                                                    sb42.append(LocaleController.formatPluralString("StoryNotificationHidden", intValue, new Object[0]));
                                                } else if (arrayList19.isEmpty()) {
                                                    FileLog.d(str7 + j6 + "] continue; story but names is empty");
                                                    longSparseArray7 = longSparseArray9;
                                                    notificationsController2 = notificationsController3;
                                                    i9 = i22;
                                                    arrayList5 = arrayList16;
                                                    i10 = i23;
                                                    notification2 = notification;
                                                    str9 = str3;
                                                    str10 = str4;
                                                    sharedPreferences2 = sharedPreferences4;
                                                    longSparseArray8 = longSparseArray6;
                                                    z10 = z16;
                                                    j7 = j8;
                                                    i5 = i10 + 1;
                                                    arrayList15 = arrayList5;
                                                    size = i9;
                                                    z5 = z10;
                                                    arrayList12 = arrayList2;
                                                    str4 = str10;
                                                    longSparseArray13 = longSparseArray5;
                                                    z4 = z6;
                                                    longSparseArray14 = longSparseArray8;
                                                    clientUserId = j7;
                                                    str3 = str9;
                                                    longSparseArray = longSparseArray7;
                                                    build2 = notification2;
                                                    i4 = -1;
                                                    notificationsController3 = notificationsController2;
                                                    notificationsSettings = sharedPreferences2;
                                                } else if (arrayList19.size() != 1) {
                                                    dialogKey4 = dialogKey3;
                                                    if (arrayList19.size() == 2) {
                                                        longSparseArray12 = longSparseArray9;
                                                        sb42.append(LocaleController.formatString(R.string.StoryNotification2, arrayList19.get(0), arrayList19.get(1)));
                                                        j10 = j8;
                                                    } else {
                                                        longSparseArray12 = longSparseArray9;
                                                        if (arrayList19.size() == 3 && notificationsController3.storyPushMessages.size() == 3) {
                                                            j10 = j8;
                                                            sb42.append(LocaleController.formatString(R.string.StoryNotification3, notificationsController3.cutLastName(arrayList19.get(0)), notificationsController3.cutLastName(arrayList19.get(1)), notificationsController3.cutLastName(arrayList19.get(2))));
                                                        } else {
                                                            j10 = j8;
                                                            sb42.append(LocaleController.formatPluralString("StoryNotification4", notificationsController3.storyPushMessages.size() - 2, notificationsController3.cutLastName(arrayList19.get(0)), notificationsController3.cutLastName(arrayList19.get(1))));
                                                        }
                                                    }
                                                    long j22 = Long.MAX_VALUE;
                                                    while (i17 < notificationsController3.storyPushMessages.size()) {
                                                    }
                                                    messagingStyle2.setGroupConversation(false);
                                                    if (arrayList19.size() == 1) {
                                                    }
                                                    messagingStyle2.addMessage(sb42, j22, new Person.Builder().setName(r0).build());
                                                    if (booleanValue) {
                                                    }
                                                    str19 = str3;
                                                } else if (intValue == 1) {
                                                    sb42.append(LocaleController.getString("StoryNotificationSingle"));
                                                } else {
                                                    dialogKey4 = dialogKey3;
                                                    sb42.append(LocaleController.formatPluralString("StoryNotification1", intValue, arrayList19.get(0)));
                                                    j10 = j8;
                                                    longSparseArray12 = longSparseArray9;
                                                    long j222 = Long.MAX_VALUE;
                                                    for (i17 = 0; i17 < notificationsController3.storyPushMessages.size(); i17++) {
                                                        j222 = Math.min(notificationsController3.storyPushMessages.get(i17).date, j222);
                                                    }
                                                    messagingStyle2.setGroupConversation(false);
                                                    String formatPluralString2 = (arrayList19.size() == 1 || booleanValue) ? LocaleController.formatPluralString(str8, intValue, new Object[0]) : arrayList19.get(0);
                                                    messagingStyle2.addMessage(sb42, j222, new Person.Builder().setName(formatPluralString2).build());
                                                    if (booleanValue) {
                                                        str20 = formatPluralString2;
                                                        messagingStyle3 = messagingStyle2;
                                                        sb = sb42;
                                                        str18 = str4;
                                                        arrayList7 = arrayList4;
                                                        j11 = j9;
                                                        longSparseArray10 = longSparseArray12;
                                                        bitmap3 = null;
                                                        i13 = 0;
                                                        arrayList6 = null;
                                                    } else {
                                                        str20 = formatPluralString2;
                                                        messagingStyle3 = messagingStyle2;
                                                        sb = sb42;
                                                        str18 = str4;
                                                        arrayList7 = arrayList4;
                                                        j11 = j9;
                                                        longSparseArray10 = longSparseArray12;
                                                        i13 = 0;
                                                        arrayList6 = null;
                                                        bitmap3 = loadMultipleAvatars(arrayList20);
                                                    }
                                                    str19 = str3;
                                                }
                                                dialogKey4 = dialogKey3;
                                                j10 = j8;
                                                longSparseArray12 = longSparseArray9;
                                                long j2222 = Long.MAX_VALUE;
                                                while (i17 < notificationsController3.storyPushMessages.size()) {
                                                }
                                                messagingStyle2.setGroupConversation(false);
                                                if (arrayList19.size() == 1) {
                                                }
                                                messagingStyle2.addMessage(sb42, j2222, new Person.Builder().setName(formatPluralString2).build());
                                                if (booleanValue) {
                                                }
                                                str19 = str3;
                                            } else {
                                                j10 = j8;
                                                LongSparseArray longSparseArray16 = longSparseArray9;
                                                String str36 = str7;
                                                dialogKey4 = dialogKey3;
                                                int size4 = arrayList4.size() - 1;
                                                int i30 = 0;
                                                arrayList6 = null;
                                                while (size4 >= 0) {
                                                    ArrayList<StoryNotification> arrayList21 = arrayList4;
                                                    int i31 = i30;
                                                    MessageObject messageObject4 = (MessageObject) arrayList21.get(size4);
                                                    ArrayList<TLRPC.TL_keyboardButtonRow> arrayList22 = arrayList6;
                                                    String str37 = str342;
                                                    long topicId2 = MessageObject.getTopicId(notificationsController3.currentAccount, messageObject4.messageOwner, getMessagesController().isForum(messageObject4));
                                                    if (j9 != topicId2) {
                                                        StringBuilder sb8 = new StringBuilder();
                                                        sb8.append(str36);
                                                        sb8.append(j6);
                                                        sb8.append("] continue; topic id is not equal: topicId=");
                                                        str21 = str36;
                                                        z17 = z8;
                                                        long j23 = j9;
                                                        sb8.append(j23);
                                                        sb8.append(" messageTopicId=");
                                                        sb8.append(topicId2);
                                                        sb8.append("; selfId=");
                                                        sb8.append(getUserConfig().getClientUserId());
                                                        FileLog.d(sb8.toString());
                                                        strArr = strArr22;
                                                        i14 = size4;
                                                        sb2 = sb42;
                                                        j12 = j23;
                                                    } else {
                                                        str21 = str36;
                                                        z17 = z8;
                                                        long j24 = j9;
                                                        String shortStringForMessage = notificationsController3.getShortStringForMessage(messageObject4, strArr22, zArr2);
                                                        if (j6 != UserObject.VERIFY || messageObject4.getForwardedFromId() == null) {
                                                            j12 = j24;
                                                            if (j6 == j10) {
                                                                strArr22[0] = str15;
                                                            } else if (DialogObject.isChatDialog(j6) && messageObject4.messageOwner.from_scheduled) {
                                                                strArr22[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                                            }
                                                        } else {
                                                            j12 = j24;
                                                            strArr22[0] = getMessagesController().getPeerName(messageObject4.getForwardedFromId().longValue());
                                                        }
                                                        if (shortStringForMessage == null) {
                                                            if (BuildVars.LOGS_ENABLED) {
                                                                FileLog.w("message text is null for " + messageObject4.getId() + " did = " + messageObject4.getDialogId());
                                                            }
                                                            strArr = strArr22;
                                                            i14 = size4;
                                                            sb2 = sb42;
                                                        } else {
                                                            if (sb42.length() > 0) {
                                                                sb42.append("\n\n");
                                                            }
                                                            if (j6 != j10 && messageObject4.messageOwner.from_scheduled && DialogObject.isUserDialog(j6)) {
                                                                str22 = str3;
                                                                shortStringForMessage = String.format(str22, LocaleController.getString(R.string.NotificationMessageScheduledName), shortStringForMessage);
                                                                sb42.append(shortStringForMessage);
                                                                str23 = str15;
                                                            } else {
                                                                str22 = str3;
                                                                String str38 = strArr22[0];
                                                                if (str38 != null) {
                                                                    str23 = str15;
                                                                    sb42.append(String.format(str22, str38, shortStringForMessage));
                                                                } else {
                                                                    str23 = str15;
                                                                    sb42.append(shortStringForMessage);
                                                                }
                                                            }
                                                            String str39 = shortStringForMessage;
                                                            if (j6 == UserObject.VERIFY && messageObject4.getForwardedFromId() != null) {
                                                                j13 = messageObject4.getForwardedFromId().longValue();
                                                            } else {
                                                                if (!DialogObject.isUserDialog(j6)) {
                                                                    if (z17) {
                                                                        j13 = -j6;
                                                                    } else if (DialogObject.isChatDialog(j6)) {
                                                                        j13 = messageObject4.getSenderId();
                                                                    }
                                                                }
                                                                j13 = j6;
                                                            }
                                                            i14 = size4;
                                                            sb2 = sb42;
                                                            str24 = str22;
                                                            longSparseArray11 = longSparseArray16;
                                                            Person person4 = (Person) longSparseArray11.get(j13 + (j12 << 16));
                                                            String str40 = strArr22[0];
                                                            if (str40 == null) {
                                                                if (z16) {
                                                                    if (DialogObject.isChatDialog(j6)) {
                                                                        if (z17) {
                                                                            if (Build.VERSION.SDK_INT > 27) {
                                                                                string2 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                                            }
                                                                        } else {
                                                                            string2 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                                                        }
                                                                        str40 = string2;
                                                                    } else if (Build.VERSION.SDK_INT > 27) {
                                                                        string2 = LocaleController.getString(R.string.NotificationHiddenName);
                                                                        str40 = string2;
                                                                    }
                                                                }
                                                                str40 = str37;
                                                            }
                                                            if (person4 == null || !TextUtils.equals(person4.getName(), str40)) {
                                                                Person.Builder name3 = new Person.Builder().setName(str40);
                                                                if (!zArr2[0] || DialogObject.isEncryptedDialog(j6) || Build.VERSION.SDK_INT < 28) {
                                                                    strArr = strArr22;
                                                                    messagingStyle4 = messagingStyle2;
                                                                    z18 = z17;
                                                                    str25 = str39;
                                                                } else {
                                                                    if (DialogObject.isUserDialog(j6) || z17) {
                                                                        strArr = strArr22;
                                                                        messagingStyle5 = messagingStyle2;
                                                                        z18 = z17;
                                                                        str25 = str39;
                                                                        file2 = file4;
                                                                    } else {
                                                                        long senderId = messageObject4.getSenderId();
                                                                        strArr = strArr22;
                                                                        z18 = z17;
                                                                        TLRPC.User user10 = getMessagesController().getUser(Long.valueOf(senderId));
                                                                        if (user10 == null && (user10 = getMessagesStorage().getUserSync(senderId)) != null) {
                                                                            getMessagesController().putUser(user10, true);
                                                                        }
                                                                        if (user10 == null || (userProfilePhoto2 = user10.photo) == null || (fileLocation7 = userProfilePhoto2.photo_small) == null) {
                                                                            messagingStyle5 = messagingStyle2;
                                                                            str25 = str39;
                                                                        } else {
                                                                            messagingStyle5 = messagingStyle2;
                                                                            str25 = str39;
                                                                            if (fileLocation7.volume_id != 0 && fileLocation7.local_id != 0) {
                                                                                file2 = getFileLoader().getPathToAttach(user10.photo.photo_small, true);
                                                                            }
                                                                        }
                                                                        file2 = null;
                                                                    }
                                                                    if (file2 == null && j6 == UserObject.VERIFY && messageObject4.getForwardedFromId() != null) {
                                                                        if (j13 >= 0) {
                                                                            TLRPC.User user11 = getMessagesController().getUser(Long.valueOf(j13));
                                                                            if (user11 != null && (userProfilePhoto = user11.photo) != null && (fileLocation6 = userProfilePhoto.photo_small) != null) {
                                                                                messagingStyle4 = messagingStyle5;
                                                                                if (fileLocation6.volume_id != 0 && fileLocation6.local_id != 0) {
                                                                                    file2 = getFileLoader().getPathToAttach(user11.photo.photo_small, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            messagingStyle4 = messagingStyle5;
                                                                            TLRPC.Chat chat6 = getMessagesController().getChat(Long.valueOf(-j13));
                                                                            if (chat6 != null && (chatPhoto = chat6.photo) != null && (fileLocation5 = chatPhoto.photo_small) != null && fileLocation5.volume_id != 0 && fileLocation5.local_id != 0) {
                                                                                file2 = getFileLoader().getPathToAttach(chat6.photo.photo_small, true);
                                                                            }
                                                                        }
                                                                        loadRoundAvatar(file2, name3);
                                                                    }
                                                                    messagingStyle4 = messagingStyle5;
                                                                    loadRoundAvatar(file2, name3);
                                                                }
                                                                Person build5 = name3.build();
                                                                longSparseArray11.put(j13, build5);
                                                                person2 = build5;
                                                            } else {
                                                                strArr = strArr22;
                                                                messagingStyle4 = messagingStyle2;
                                                                z18 = z17;
                                                                person2 = person4;
                                                                str25 = str39;
                                                            }
                                                            if (!DialogObject.isEncryptedDialog(j6)) {
                                                                if (!zArr2[0] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).isLowRamDevice() || z16 || messageObject4.isSecretMedia() || !(messageObject4.type == 1 || messageObject4.isSticker())) {
                                                                    messagingStyle6 = messagingStyle4;
                                                                    str28 = str25;
                                                                    str26 = str4;
                                                                    str27 = str37;
                                                                } else {
                                                                    File pathToMessage = getFileLoader().getPathToMessage(messageObject4.messageOwner);
                                                                    if (pathToMessage.exists() && messageObject4.hasMediaSpoilers()) {
                                                                        file3 = new File(pathToMessage.getParentFile(), pathToMessage.getName() + ".blur.jpg");
                                                                        if (file3.exists()) {
                                                                            str29 = str25;
                                                                        } else {
                                                                            try {
                                                                                Bitmap decodeFile2 = BitmapFactory.decodeFile(pathToMessage.getAbsolutePath());
                                                                                Bitmap stackBlurBitmapMax = Utilities.stackBlurBitmapMax(decodeFile2);
                                                                                decodeFile2.recycle();
                                                                                createScaledBitmap = Bitmap.createScaledBitmap(stackBlurBitmapMax, decodeFile2.getWidth(), decodeFile2.getHeight(), true);
                                                                                Utilities.stackBlurBitmap(createScaledBitmap, 5);
                                                                                stackBlurBitmapMax.recycle();
                                                                                canvas = new Canvas(createScaledBitmap);
                                                                                str29 = str25;
                                                                            } catch (Exception e) {
                                                                                e = e;
                                                                                str29 = str25;
                                                                            }
                                                                            try {
                                                                                notificationsController3.mediaSpoilerEffect.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i4) * 0.325f)));
                                                                                notificationsController3.mediaSpoilerEffect.setBounds(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                                                                                notificationsController3.mediaSpoilerEffect.draw(canvas);
                                                                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                                                                createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                                fileOutputStream.close();
                                                                                createScaledBitmap.recycle();
                                                                                pathToMessage = file3;
                                                                            } catch (Exception e2) {
                                                                                e = e2;
                                                                                FileLog.e(e);
                                                                                str28 = str29;
                                                                                NotificationCompat.MessagingStyle.Message message2 = new NotificationCompat.MessagingStyle.Message(str28, messageObject4.messageOwner.date * 1000, person2);
                                                                                String str41 = !messageObject4.isSticker() ? "image/webp" : "image/jpeg";
                                                                                if (!pathToMessage.exists()) {
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str29 = str25;
                                                                        file3 = null;
                                                                    }
                                                                    str28 = str29;
                                                                    NotificationCompat.MessagingStyle.Message message22 = new NotificationCompat.MessagingStyle.Message(str28, messageObject4.messageOwner.date * 1000, person2);
                                                                    String str412 = !messageObject4.isSticker() ? "image/webp" : "image/jpeg";
                                                                    if (!pathToMessage.exists()) {
                                                                        try {
                                                                            context = ApplicationLoader.applicationContext;
                                                                            sb3 = new StringBuilder();
                                                                            sb3.append(ApplicationLoader.getApplicationId());
                                                                            str26 = str4;
                                                                        } catch (Exception e3) {
                                                                            e = e3;
                                                                            str26 = str4;
                                                                        }
                                                                        try {
                                                                            sb3.append(str26);
                                                                            uriForFile = FileProvider.getUriForFile(context, sb3.toString(), pathToMessage);
                                                                            messagingStyle7 = messagingStyle4;
                                                                            str27 = str37;
                                                                        } catch (Exception e4) {
                                                                            e = e4;
                                                                            FileLog.e(e);
                                                                            messagingStyle7 = messagingStyle4;
                                                                            str27 = str37;
                                                                            uriForFile = null;
                                                                            if (uriForFile == null) {
                                                                            }
                                                                        }
                                                                        if (uriForFile == null) {
                                                                            message22.setData(str412, uriForFile);
                                                                            messagingStyle6 = messagingStyle7;
                                                                            messagingStyle6.addMessage(message22);
                                                                            ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriForFile, 1);
                                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda56
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    NotificationsController.lambda$showExtraNotifications$42(uriForFile, file3);
                                                                                }
                                                                            }, 20000L);
                                                                            if (!TextUtils.isEmpty(messageObject4.caption)) {
                                                                                messagingStyle6.addMessage(messageObject4.caption, messageObject4.messageOwner.date * 1000, person2);
                                                                            }
                                                                            if (zArr2[0] && !z16 && messageObject4.isVoice()) {
                                                                                messages = messagingStyle6.getMessages();
                                                                                if (!messages.isEmpty()) {
                                                                                    File pathToMessage2 = getFileLoader().getPathToMessage(messageObject4.messageOwner);
                                                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                                                        try {
                                                                                            uri2 = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + str26, pathToMessage2);
                                                                                        } catch (Exception unused2) {
                                                                                            uri2 = null;
                                                                                        }
                                                                                    } else {
                                                                                        uri2 = Uri.fromFile(pathToMessage2);
                                                                                    }
                                                                                    if (uri2 != null) {
                                                                                        ((NotificationCompat.MessagingStyle.Message) messages.get(messages.size() - 1)).setData("audio/ogg", uri2);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            messagingStyle6 = messagingStyle7;
                                                                        }
                                                                    } else {
                                                                        str26 = str4;
                                                                        if (getFileLoader().isLoadingFile(pathToMessage.getName())) {
                                                                            Uri.Builder appendPath = new Uri.Builder().scheme("content").authority(NotificationImageProvider.getAuthority()).appendPath("msg_media_raw");
                                                                            StringBuilder sb9 = new StringBuilder();
                                                                            messagingStyle7 = messagingStyle4;
                                                                            sb9.append(notificationsController3.currentAccount);
                                                                            str27 = str37;
                                                                            sb9.append(str27);
                                                                            uriForFile = appendPath.appendPath(sb9.toString()).appendPath(pathToMessage.getName()).appendQueryParameter("final_path", pathToMessage.getAbsolutePath()).build();
                                                                            if (uriForFile == null) {
                                                                            }
                                                                        }
                                                                        messagingStyle7 = messagingStyle4;
                                                                        str27 = str37;
                                                                        uriForFile = null;
                                                                        if (uriForFile == null) {
                                                                        }
                                                                    }
                                                                }
                                                                messagingStyle6.addMessage(str28, messageObject4.messageOwner.date * 1000, person2);
                                                                if (zArr2[0]) {
                                                                    messages = messagingStyle6.getMessages();
                                                                    if (!messages.isEmpty()) {
                                                                    }
                                                                }
                                                            } else {
                                                                messagingStyle6 = messagingStyle4;
                                                                String str42 = str25;
                                                                str26 = str4;
                                                                str27 = str37;
                                                                messagingStyle6.addMessage(str42, messageObject4.messageOwner.date * 1000, person2);
                                                            }
                                                            if (j6 == 777000 && (replyMarkup = messageObject4.messageOwner.reply_markup) != null) {
                                                                arrayList8 = replyMarkup.rows;
                                                                i30 = messageObject4.getId();
                                                                size4 = i14 - 1;
                                                                messagingStyle2 = messagingStyle6;
                                                                str4 = str26;
                                                                str15 = str23;
                                                                str3 = str24;
                                                                strArr22 = strArr;
                                                                z8 = z18;
                                                                arrayList4 = arrayList21;
                                                                str36 = str21;
                                                                j9 = j12;
                                                                sb42 = sb2;
                                                                i4 = -1;
                                                                longSparseArray16 = longSparseArray11;
                                                                str342 = str27;
                                                                arrayList6 = arrayList8;
                                                            }
                                                            i30 = i31;
                                                            arrayList8 = arrayList22;
                                                            size4 = i14 - 1;
                                                            messagingStyle2 = messagingStyle6;
                                                            str4 = str26;
                                                            str15 = str23;
                                                            str3 = str24;
                                                            strArr22 = strArr;
                                                            z8 = z18;
                                                            arrayList4 = arrayList21;
                                                            str36 = str21;
                                                            j9 = j12;
                                                            sb42 = sb2;
                                                            i4 = -1;
                                                            longSparseArray16 = longSparseArray11;
                                                            str342 = str27;
                                                            arrayList6 = arrayList8;
                                                        }
                                                    }
                                                    str24 = str3;
                                                    longSparseArray11 = longSparseArray16;
                                                    str27 = str37;
                                                    str23 = str15;
                                                    z18 = z17;
                                                    str26 = str4;
                                                    messagingStyle6 = messagingStyle2;
                                                    i30 = i31;
                                                    arrayList8 = arrayList22;
                                                    size4 = i14 - 1;
                                                    messagingStyle2 = messagingStyle6;
                                                    str4 = str26;
                                                    str15 = str23;
                                                    str3 = str24;
                                                    strArr22 = strArr;
                                                    z8 = z18;
                                                    arrayList4 = arrayList21;
                                                    str36 = str21;
                                                    j9 = j12;
                                                    sb42 = sb2;
                                                    i4 = -1;
                                                    longSparseArray16 = longSparseArray11;
                                                    str342 = str27;
                                                    arrayList6 = arrayList8;
                                                }
                                                sb = sb42;
                                                int i32 = i30;
                                                str18 = str4;
                                                arrayList7 = arrayList4;
                                                j11 = j9;
                                                longSparseArray10 = longSparseArray16;
                                                str19 = str3;
                                                String str43 = str15;
                                                messagingStyle3 = messagingStyle2;
                                                str20 = str43;
                                                i13 = i32;
                                                bitmap3 = bitmap2;
                                            }
                                            Intent intent32 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                            StringBuilder sb52 = new StringBuilder();
                                            sb52.append("com.tmessages.openchat");
                                            String str352 = str18;
                                            sb52.append(Math.random());
                                            sb52.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent32.setAction(sb52.toString());
                                            intent32.setFlags(67108864);
                                            intent32.addCategory("android.intent.category.LAUNCHER");
                                            if (messageObject2 == null && messageObject2.isStoryReactionPush) {
                                                intent32.putExtra("storyId", Math.abs(messageObject2.getId()));
                                                dialogKey5 = dialogKey4;
                                            } else {
                                                dialogKey5 = dialogKey4;
                                                if (dialogKey5.story) {
                                                    long[] jArr2 = new long[notificationsController3.storyPushMessages.size()];
                                                    for (int i33 = 0; i33 < notificationsController3.storyPushMessages.size(); i33++) {
                                                        jArr2[i33] = notificationsController3.storyPushMessages.get(i33).dialogId;
                                                    }
                                                    intent32.putExtra("storyDialogIds", jArr2);
                                                } else if (DialogObject.isEncryptedDialog(j6)) {
                                                    intent32.putExtra("encId", DialogObject.getEncryptedChatId(j6));
                                                } else if (DialogObject.isUserDialog(j6)) {
                                                    intent32.putExtra("userId", j6);
                                                } else {
                                                    intent32.putExtra("chatId", -j6);
                                                }
                                            }
                                            StringBuilder sb62 = new StringBuilder();
                                            sb62.append("show extra notifications chatId ");
                                            sb62.append(j6);
                                            sb62.append(" topicId ");
                                            j14 = j11;
                                            sb62.append(j14);
                                            FileLog.d(sb62.toString());
                                            if (j14 != 0) {
                                                intent32.putExtra("topicId", j14);
                                            }
                                            intent32.putExtra("currentAccount", notificationsController3.currentAccount);
                                            LongSparseArray longSparseArray152 = longSparseArray10;
                                            PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32, 1140850688);
                                            NotificationCompat.WearableExtender wearableExtender2 = new NotificationCompat.WearableExtender();
                                            if (action != null) {
                                                wearableExtender2.addAction(action);
                                            }
                                            int i282 = i13;
                                            Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                            intent42.addFlags(32);
                                            intent42.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                            intent42.putExtra(str17, j6);
                                            int i292 = i11;
                                            intent42.putExtra(str16, i292);
                                            intent42.putExtra("currentAccount", notificationsController3.currentAccount);
                                            arrayList9 = arrayList6;
                                            bitmap4 = bitmap3;
                                            NotificationCompat.Action build42 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent42, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                            if (DialogObject.isEncryptedDialog(j6)) {
                                                action2 = action;
                                                str30 = j6 != globalSecretChatId ? "tgenc" + DialogObject.getEncryptedChatId(j6) + "_" + i292 : null;
                                            } else if (DialogObject.isUserDialog(j6)) {
                                                str30 = "tguser" + j6 + "_" + i292;
                                                action2 = action;
                                            } else {
                                                StringBuilder sb10 = new StringBuilder();
                                                sb10.append("tgchat");
                                                action2 = action;
                                                sb10.append(-j6);
                                                sb10.append("_");
                                                sb10.append(i292);
                                                str30 = sb10.toString();
                                            }
                                            if (str30 != null) {
                                                wearableExtender2.setDismissalId(str30);
                                                NotificationCompat.WearableExtender wearableExtender3 = new NotificationCompat.WearableExtender();
                                                wearableExtender3.setDismissalId("summary_" + str30);
                                                builder.extend(wearableExtender3);
                                            }
                                            StringBuilder sb72 = new StringBuilder();
                                            sb72.append("tgaccount");
                                            long j212 = j10;
                                            sb72.append(j212);
                                            wearableExtender2.setBridgeTag(sb72.toString());
                                            if (dialogKey5.story) {
                                                j15 = j212;
                                                j16 = Long.MAX_VALUE;
                                                for (int i34 = 0; i34 < notificationsController3.storyPushMessages.size(); i34++) {
                                                    j16 = Math.min(notificationsController3.storyPushMessages.get(i34).date, j16);
                                                }
                                                arrayList10 = arrayList7;
                                            } else {
                                                j15 = j212;
                                                arrayList10 = arrayList7;
                                                j16 = ((MessageObject) arrayList10.get(0)).messageOwner.date * 1000;
                                            }
                                            NotificationCompat.Builder autoCancel2 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str20).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                            if (dialogKey5.story) {
                                                arrayList10 = notificationsController3.storyPushMessages;
                                            }
                                            NotificationCompat.Builder category2 = autoCancel2.setNumber(arrayList10.size()).setColor(-15618822).setGroupSummary(false).setWhen(j16).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity2).extend(wearableExtender2).setSortKey(String.valueOf(Long.MAX_VALUE - j16)).setCategory("msg");
                                            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                            intent.putExtra("messageDate", i8);
                                            intent.putExtra("dialogId", j6);
                                            intent.putExtra("currentAccount", notificationsController3.currentAccount);
                                            if (dialogKey5.story) {
                                                intent.putExtra("story", true);
                                            }
                                            if (messageObject2 != null && messageObject2.isStoryReactionPush) {
                                                intent.putExtra("storyReaction", true);
                                            }
                                            category2.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                            if (z6) {
                                                category2.setGroup(notificationsController3.notificationGroup);
                                                category2.setGroupAlertBehavior(1);
                                            }
                                            if (messageObject2 != null || (message = messageObject2.messageOwner) == null || (replyMarkup2 = message.reply_markup) == null) {
                                                tL_keyboardButtonCopy = null;
                                            } else {
                                                TLRPC.TL_keyboardButtonCopy tL_keyboardButtonCopy2 = null;
                                                for (int i35 = 0; i35 < replyMarkup2.rows.size(); i35++) {
                                                    int i36 = 0;
                                                    while (true) {
                                                        if (i36 >= replyMarkup2.rows.get(i35).buttons.size()) {
                                                            break;
                                                        }
                                                        if (replyMarkup2.rows.get(i35).buttons.get(i36) instanceof TLRPC.TL_keyboardButtonCopy) {
                                                            tL_keyboardButtonCopy2 = (TLRPC.TL_keyboardButtonCopy) replyMarkup2.rows.get(i35).buttons.get(i36);
                                                            break;
                                                        }
                                                        i36++;
                                                    }
                                                    if (tL_keyboardButtonCopy2 != null) {
                                                        break;
                                                    }
                                                }
                                                tL_keyboardButtonCopy = tL_keyboardButtonCopy2;
                                            }
                                            if (tL_keyboardButtonCopy != null) {
                                                Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                                                intent5.addFlags(32);
                                                intent5.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                                                intent5.putExtra("text", tL_keyboardButtonCopy.copy_text);
                                                category2.addAction(new NotificationCompat.Action.Builder(R.drawable.msg_copy, tL_keyboardButtonCopy.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent5, 167772160)).setShowsUserInterface(false).build());
                                            }
                                            if (dialogKey5.dialogId != UserObject.VERIFY) {
                                                if (action2 != null) {
                                                    category2.addAction(action2);
                                                }
                                                if (!z16 && !dialogKey5.story && (messageObject2 == null || !messageObject2.isStoryReactionPush)) {
                                                    category2.addAction(build42);
                                                }
                                            }
                                            if (arrayList2.size() != 1 && !TextUtils.isEmpty(str) && !dialogKey5.story) {
                                                category2.setSubText(str);
                                            }
                                            if (DialogObject.isEncryptedDialog(j6)) {
                                                category2.setLocalOnly(true);
                                            }
                                            if (bitmap4 != null) {
                                                category2.setLargeIcon(bitmap4);
                                            }
                                            if (!AndroidUtilities.needShowPasscode(false) && !SharedConfig.isWaitingForPasscodeEnter && arrayList9 != null) {
                                                size3 = arrayList9.size();
                                                i15 = 0;
                                                while (i15 < size3) {
                                                    ArrayList<TLRPC.TL_keyboardButtonRow> arrayList23 = arrayList9;
                                                    TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow = arrayList23.get(i15);
                                                    int size5 = tL_keyboardButtonRow.buttons.size();
                                                    int i37 = 0;
                                                    while (i37 < size5) {
                                                        TLRPC.KeyboardButton keyboardButton = tL_keyboardButtonRow.buttons.get(i37);
                                                        if (keyboardButton instanceof TLRPC.TL_keyboardButtonCallback) {
                                                            i16 = size3;
                                                            arrayList11 = arrayList23;
                                                            Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                            intent6.putExtra("currentAccount", notificationsController3.currentAccount);
                                                            intent6.putExtra("did", j6);
                                                            byte[] bArr = keyboardButton.data;
                                                            if (bArr != null) {
                                                                intent6.putExtra("data", bArr);
                                                            }
                                                            intent6.putExtra("mid", i282);
                                                            String str44 = keyboardButton.text;
                                                            Context context2 = ApplicationLoader.applicationContext;
                                                            int i38 = notificationsController3.lastButtonId;
                                                            dialogKey6 = dialogKey5;
                                                            notificationsController3.lastButtonId = i38 + 1;
                                                            category2.addAction(0, str44, PendingIntent.getBroadcast(context2, i38, intent6, 167772160));
                                                        } else {
                                                            i16 = size3;
                                                            arrayList11 = arrayList23;
                                                            dialogKey6 = dialogKey5;
                                                        }
                                                        i37++;
                                                        size3 = i16;
                                                        arrayList23 = arrayList11;
                                                        dialogKey5 = dialogKey6;
                                                    }
                                                    i15++;
                                                    arrayList9 = arrayList23;
                                                    dialogKey5 = dialogKey5;
                                                }
                                            }
                                            DialogKey dialogKey82 = dialogKey5;
                                            if (chat4 == null || user5 == null) {
                                                user6 = user5;
                                            } else {
                                                user6 = user5;
                                                String str45 = user6.phone;
                                                if (str45 != null && str45.length() > 0) {
                                                    category2.addPerson("tel:+" + user6.phone);
                                                }
                                            }
                                            Notification notification32 = notification;
                                            boolean z202 = z6;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                notificationsController3.setNotificationChannel(notification32, category2, z202);
                                            }
                                            FileLog.d("showExtraNotifications: holders.add " + j6);
                                            i9 = i22;
                                            SharedPreferences sharedPreferences52 = sharedPreferences4;
                                            j7 = j15;
                                            z10 = z16;
                                            z6 = z202;
                                            longSparseArray7 = longSparseArray152;
                                            longSparseArray8 = longSparseArray6;
                                            i10 = i23;
                                            str9 = str19;
                                            notification2 = notification32;
                                            sharedPreferences2 = sharedPreferences52;
                                            Integer num42 = num;
                                            str10 = str352;
                                            arrayList5 = arrayList16;
                                            arrayList5.add(new 1NotificationHolder(num.intValue(), j6, dialogKey82.story, j14, str20, user6, chat4, category2, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                            notificationsController2 = this;
                                            notificationsController2.wearNotificationsIds.put(j6, num42);
                                            i5 = i10 + 1;
                                            arrayList15 = arrayList5;
                                            size = i9;
                                            z5 = z10;
                                            arrayList12 = arrayList2;
                                            str4 = str10;
                                            longSparseArray13 = longSparseArray5;
                                            z4 = z6;
                                            longSparseArray14 = longSparseArray8;
                                            clientUserId = j7;
                                            str3 = str9;
                                            longSparseArray = longSparseArray7;
                                            build2 = notification2;
                                            i4 = -1;
                                            notificationsController3 = notificationsController2;
                                            notificationsSettings = sharedPreferences2;
                                        }
                                        person = person3;
                                        if (messageObject2 == null) {
                                        }
                                        String str3422 = "";
                                        if (person == null) {
                                        }
                                        messagingStyle = new NotificationCompat.MessagingStyle("");
                                        messagingStyle2 = messagingStyle;
                                        i12 = Build.VERSION.SDK_INT;
                                        if (i12 >= 28) {
                                        }
                                        messagingStyle2.setConversationTitle(format);
                                        messagingStyle2.setGroupConversation(i12 >= 28 || (!z8 && DialogObject.isChatDialog(j6)) || UserObject.isReplyUser(j6));
                                        StringBuilder sb422 = new StringBuilder();
                                        String[] strArr222 = new String[1];
                                        boolean[] zArr22 = new boolean[1];
                                        if (dialogKey3.story) {
                                        }
                                        Intent intent322 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                        StringBuilder sb522 = new StringBuilder();
                                        sb522.append("com.tmessages.openchat");
                                        String str3522 = str18;
                                        sb522.append(Math.random());
                                        sb522.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                        intent322.setAction(sb522.toString());
                                        intent322.setFlags(67108864);
                                        intent322.addCategory("android.intent.category.LAUNCHER");
                                        if (messageObject2 == null) {
                                        }
                                        dialogKey5 = dialogKey4;
                                        if (dialogKey5.story) {
                                        }
                                        StringBuilder sb622 = new StringBuilder();
                                        sb622.append("show extra notifications chatId ");
                                        sb622.append(j6);
                                        sb622.append(" topicId ");
                                        j14 = j11;
                                        sb622.append(j14);
                                        FileLog.d(sb622.toString());
                                        if (j14 != 0) {
                                        }
                                        intent322.putExtra("currentAccount", notificationsController3.currentAccount);
                                        LongSparseArray longSparseArray1522 = longSparseArray10;
                                        PendingIntent activity22 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322, 1140850688);
                                        NotificationCompat.WearableExtender wearableExtender22 = new NotificationCompat.WearableExtender();
                                        if (action != null) {
                                        }
                                        int i2822 = i13;
                                        Intent intent422 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                        intent422.addFlags(32);
                                        intent422.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                        intent422.putExtra(str17, j6);
                                        int i2922 = i11;
                                        intent422.putExtra(str16, i2922);
                                        intent422.putExtra("currentAccount", notificationsController3.currentAccount);
                                        arrayList9 = arrayList6;
                                        bitmap4 = bitmap3;
                                        NotificationCompat.Action build422 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent422, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                        if (DialogObject.isEncryptedDialog(j6)) {
                                        }
                                        if (str30 != null) {
                                        }
                                        StringBuilder sb722 = new StringBuilder();
                                        sb722.append("tgaccount");
                                        long j2122 = j10;
                                        sb722.append(j2122);
                                        wearableExtender22.setBridgeTag(sb722.toString());
                                        if (dialogKey5.story) {
                                        }
                                        NotificationCompat.Builder autoCancel22 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str20).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                        if (dialogKey5.story) {
                                        }
                                        NotificationCompat.Builder category22 = autoCancel22.setNumber(arrayList10.size()).setColor(-15618822).setGroupSummary(false).setWhen(j16).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity22).extend(wearableExtender22).setSortKey(String.valueOf(Long.MAX_VALUE - j16)).setCategory("msg");
                                        intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                        intent.putExtra("messageDate", i8);
                                        intent.putExtra("dialogId", j6);
                                        intent.putExtra("currentAccount", notificationsController3.currentAccount);
                                        if (dialogKey5.story) {
                                        }
                                        if (messageObject2 != null) {
                                            intent.putExtra("storyReaction", true);
                                        }
                                        category22.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                        if (z6) {
                                        }
                                        if (messageObject2 != null) {
                                        }
                                        tL_keyboardButtonCopy = null;
                                        if (tL_keyboardButtonCopy != null) {
                                        }
                                        if (dialogKey5.dialogId != UserObject.VERIFY) {
                                        }
                                        if (arrayList2.size() != 1) {
                                        }
                                        if (DialogObject.isEncryptedDialog(j6)) {
                                        }
                                        if (bitmap4 != null) {
                                        }
                                        if (!AndroidUtilities.needShowPasscode(false)) {
                                            size3 = arrayList9.size();
                                            i15 = 0;
                                            while (i15 < size3) {
                                            }
                                        }
                                        DialogKey dialogKey822 = dialogKey5;
                                        if (chat4 == null) {
                                        }
                                        user6 = user5;
                                        Notification notification322 = notification;
                                        boolean z2022 = z6;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                        FileLog.d("showExtraNotifications: holders.add " + j6);
                                        i9 = i22;
                                        SharedPreferences sharedPreferences522 = sharedPreferences4;
                                        j7 = j15;
                                        z10 = z16;
                                        z6 = z2022;
                                        longSparseArray7 = longSparseArray1522;
                                        longSparseArray8 = longSparseArray6;
                                        i10 = i23;
                                        str9 = str19;
                                        notification2 = notification322;
                                        sharedPreferences2 = sharedPreferences522;
                                        Integer num422 = num;
                                        str10 = str3522;
                                        arrayList5 = arrayList16;
                                        arrayList5.add(new 1NotificationHolder(num.intValue(), j6, dialogKey822.story, j14, str20, user6, chat4, category22, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                        notificationsController2 = this;
                                        notificationsController2.wearNotificationsIds.put(j6, num422);
                                        i5 = i10 + 1;
                                        arrayList15 = arrayList5;
                                        size = i9;
                                        z5 = z10;
                                        arrayList12 = arrayList2;
                                        str4 = str10;
                                        longSparseArray13 = longSparseArray5;
                                        z4 = z6;
                                        longSparseArray14 = longSparseArray8;
                                        clientUserId = j7;
                                        str3 = str9;
                                        longSparseArray = longSparseArray7;
                                        build2 = notification2;
                                        i4 = -1;
                                        notificationsController3 = notificationsController2;
                                        notificationsSettings = sharedPreferences2;
                                    }
                                }
                            }
                            j9 = j3;
                            person = person3;
                            if (messageObject2 == null) {
                            }
                            String str34222 = "";
                            if (person == null) {
                            }
                            messagingStyle = new NotificationCompat.MessagingStyle("");
                            messagingStyle2 = messagingStyle;
                            i12 = Build.VERSION.SDK_INT;
                            if (i12 >= 28) {
                            }
                            messagingStyle2.setConversationTitle(format);
                            messagingStyle2.setGroupConversation(i12 >= 28 || (!z8 && DialogObject.isChatDialog(j6)) || UserObject.isReplyUser(j6));
                            StringBuilder sb4222 = new StringBuilder();
                            String[] strArr2222 = new String[1];
                            boolean[] zArr222 = new boolean[1];
                            if (dialogKey3.story) {
                            }
                            Intent intent3222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                            StringBuilder sb5222 = new StringBuilder();
                            sb5222.append("com.tmessages.openchat");
                            String str35222 = str18;
                            sb5222.append(Math.random());
                            sb5222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                            intent3222.setAction(sb5222.toString());
                            intent3222.setFlags(67108864);
                            intent3222.addCategory("android.intent.category.LAUNCHER");
                            if (messageObject2 == null) {
                            }
                            dialogKey5 = dialogKey4;
                            if (dialogKey5.story) {
                            }
                            StringBuilder sb6222 = new StringBuilder();
                            sb6222.append("show extra notifications chatId ");
                            sb6222.append(j6);
                            sb6222.append(" topicId ");
                            j14 = j11;
                            sb6222.append(j14);
                            FileLog.d(sb6222.toString());
                            if (j14 != 0) {
                            }
                            intent3222.putExtra("currentAccount", notificationsController3.currentAccount);
                            LongSparseArray longSparseArray15222 = longSparseArray10;
                            PendingIntent activity222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3222, 1140850688);
                            NotificationCompat.WearableExtender wearableExtender222 = new NotificationCompat.WearableExtender();
                            if (action != null) {
                            }
                            int i28222 = i13;
                            Intent intent4222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                            intent4222.addFlags(32);
                            intent4222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                            intent4222.putExtra(str17, j6);
                            int i29222 = i11;
                            intent4222.putExtra(str16, i29222);
                            intent4222.putExtra("currentAccount", notificationsController3.currentAccount);
                            arrayList9 = arrayList6;
                            bitmap4 = bitmap3;
                            NotificationCompat.Action build4222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent4222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                            if (DialogObject.isEncryptedDialog(j6)) {
                            }
                            if (str30 != null) {
                            }
                            StringBuilder sb7222 = new StringBuilder();
                            sb7222.append("tgaccount");
                            long j21222 = j10;
                            sb7222.append(j21222);
                            wearableExtender222.setBridgeTag(sb7222.toString());
                            if (dialogKey5.story) {
                            }
                            NotificationCompat.Builder autoCancel222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str20).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                            if (dialogKey5.story) {
                            }
                            NotificationCompat.Builder category222 = autoCancel222.setNumber(arrayList10.size()).setColor(-15618822).setGroupSummary(false).setWhen(j16).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity222).extend(wearableExtender222).setSortKey(String.valueOf(Long.MAX_VALUE - j16)).setCategory("msg");
                            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent.putExtra("messageDate", i8);
                            intent.putExtra("dialogId", j6);
                            intent.putExtra("currentAccount", notificationsController3.currentAccount);
                            if (dialogKey5.story) {
                            }
                            if (messageObject2 != null) {
                            }
                            category222.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                            if (z6) {
                            }
                            if (messageObject2 != null) {
                            }
                            tL_keyboardButtonCopy = null;
                            if (tL_keyboardButtonCopy != null) {
                            }
                            if (dialogKey5.dialogId != UserObject.VERIFY) {
                            }
                            if (arrayList2.size() != 1) {
                            }
                            if (DialogObject.isEncryptedDialog(j6)) {
                            }
                            if (bitmap4 != null) {
                            }
                            if (!AndroidUtilities.needShowPasscode(false)) {
                            }
                            DialogKey dialogKey8222 = dialogKey5;
                            if (chat4 == null) {
                            }
                            user6 = user5;
                            Notification notification3222 = notification;
                            boolean z20222 = z6;
                            if (Build.VERSION.SDK_INT >= 26) {
                            }
                            FileLog.d("showExtraNotifications: holders.add " + j6);
                            i9 = i22;
                            SharedPreferences sharedPreferences5222 = sharedPreferences4;
                            j7 = j15;
                            z10 = z16;
                            z6 = z20222;
                            longSparseArray7 = longSparseArray15222;
                            longSparseArray8 = longSparseArray6;
                            i10 = i23;
                            str9 = str19;
                            notification2 = notification3222;
                            sharedPreferences2 = sharedPreferences5222;
                            Integer num4222 = num;
                            str10 = str35222;
                            arrayList5 = arrayList16;
                            arrayList5.add(new 1NotificationHolder(num.intValue(), j6, dialogKey8222.story, j14, str20, user6, chat4, category222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                            notificationsController2 = this;
                            notificationsController2.wearNotificationsIds.put(j6, num4222);
                            i5 = i10 + 1;
                            arrayList15 = arrayList5;
                            size = i9;
                            z5 = z10;
                            arrayList12 = arrayList2;
                            str4 = str10;
                            longSparseArray13 = longSparseArray5;
                            z4 = z6;
                            longSparseArray14 = longSparseArray8;
                            clientUserId = j7;
                            str3 = str9;
                            longSparseArray = longSparseArray7;
                            build2 = notification2;
                            i4 = -1;
                            notificationsController3 = notificationsController2;
                            notificationsSettings = sharedPreferences2;
                        }
                    }
                    str15 = str14;
                    if (z5) {
                    }
                    if (fileLocation == null) {
                    }
                    if (chat == null) {
                    }
                    File file42 = file;
                    if (z8) {
                    }
                    chat4 = chat;
                    Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                    intent22.putExtra("dialog_id", j6);
                    intent22.putExtra("max_id", id);
                    intent22.putExtra("topic_id", j3);
                    intent22.putExtra("currentAccount", notificationsController3.currentAccount);
                    str16 = "max_id";
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent22, 167772160);
                    RemoteInput build32 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                    if (!DialogObject.isChatDialog(j6)) {
                    }
                    build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast2).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build32).setShowsUserInterface(false).build();
                    num2 = (Integer) notificationsController3.pushDialogs.get(j6);
                    if (num2 == null) {
                    }
                    dialogKey3 = dialogKey;
                    if (!dialogKey3.story) {
                    }
                    if (max > 1) {
                    }
                    messageObject2 = messageObject;
                    j8 = j5;
                    Person person32 = (Person) longSparseArray9.get(j8);
                    action = build;
                    if (Build.VERSION.SDK_INT >= 28) {
                        user7 = getMessagesController().getUser(Long.valueOf(j8));
                        if (user7 == null) {
                        }
                        if (user7 != null) {
                        }
                    }
                    j9 = j3;
                    person = person32;
                    if (messageObject2 == null) {
                    }
                    String str342222 = "";
                    if (person == null) {
                    }
                    messagingStyle = new NotificationCompat.MessagingStyle("");
                    messagingStyle2 = messagingStyle;
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 28) {
                    }
                    messagingStyle2.setConversationTitle(format);
                    messagingStyle2.setGroupConversation(i12 >= 28 || (!z8 && DialogObject.isChatDialog(j6)) || UserObject.isReplyUser(j6));
                    StringBuilder sb42222 = new StringBuilder();
                    String[] strArr22222 = new String[1];
                    boolean[] zArr2222 = new boolean[1];
                    if (dialogKey3.story) {
                    }
                    Intent intent32222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                    StringBuilder sb52222 = new StringBuilder();
                    sb52222.append("com.tmessages.openchat");
                    String str352222 = str18;
                    sb52222.append(Math.random());
                    sb52222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent32222.setAction(sb52222.toString());
                    intent32222.setFlags(67108864);
                    intent32222.addCategory("android.intent.category.LAUNCHER");
                    if (messageObject2 == null) {
                    }
                    dialogKey5 = dialogKey4;
                    if (dialogKey5.story) {
                    }
                    StringBuilder sb62222 = new StringBuilder();
                    sb62222.append("show extra notifications chatId ");
                    sb62222.append(j6);
                    sb62222.append(" topicId ");
                    j14 = j11;
                    sb62222.append(j14);
                    FileLog.d(sb62222.toString());
                    if (j14 != 0) {
                    }
                    intent32222.putExtra("currentAccount", notificationsController3.currentAccount);
                    LongSparseArray longSparseArray152222 = longSparseArray10;
                    PendingIntent activity2222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32222, 1140850688);
                    NotificationCompat.WearableExtender wearableExtender2222 = new NotificationCompat.WearableExtender();
                    if (action != null) {
                    }
                    int i282222 = i13;
                    Intent intent42222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                    intent42222.addFlags(32);
                    intent42222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent42222.putExtra(str17, j6);
                    int i292222 = i11;
                    intent42222.putExtra(str16, i292222);
                    intent42222.putExtra("currentAccount", notificationsController3.currentAccount);
                    arrayList9 = arrayList6;
                    bitmap4 = bitmap3;
                    NotificationCompat.Action build42222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent42222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                    if (DialogObject.isEncryptedDialog(j6)) {
                    }
                    if (str30 != null) {
                    }
                    StringBuilder sb72222 = new StringBuilder();
                    sb72222.append("tgaccount");
                    long j212222 = j10;
                    sb72222.append(j212222);
                    wearableExtender2222.setBridgeTag(sb72222.toString());
                    if (dialogKey5.story) {
                    }
                    NotificationCompat.Builder autoCancel2222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str20).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                    if (dialogKey5.story) {
                    }
                    NotificationCompat.Builder category2222 = autoCancel2222.setNumber(arrayList10.size()).setColor(-15618822).setGroupSummary(false).setWhen(j16).setShowWhen(true).setStyle(messagingStyle3).setContentIntent(activity2222).extend(wearableExtender2222).setSortKey(String.valueOf(Long.MAX_VALUE - j16)).setCategory("msg");
                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                    intent.putExtra("messageDate", i8);
                    intent.putExtra("dialogId", j6);
                    intent.putExtra("currentAccount", notificationsController3.currentAccount);
                    if (dialogKey5.story) {
                    }
                    if (messageObject2 != null) {
                    }
                    category2222.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                    if (z6) {
                    }
                    if (messageObject2 != null) {
                    }
                    tL_keyboardButtonCopy = null;
                    if (tL_keyboardButtonCopy != null) {
                    }
                    if (dialogKey5.dialogId != UserObject.VERIFY) {
                    }
                    if (arrayList2.size() != 1) {
                    }
                    if (DialogObject.isEncryptedDialog(j6)) {
                    }
                    if (bitmap4 != null) {
                    }
                    if (!AndroidUtilities.needShowPasscode(false)) {
                    }
                    DialogKey dialogKey82222 = dialogKey5;
                    if (chat4 == null) {
                    }
                    user6 = user5;
                    Notification notification32222 = notification;
                    boolean z202222 = z6;
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    FileLog.d("showExtraNotifications: holders.add " + j6);
                    i9 = i22;
                    SharedPreferences sharedPreferences52222 = sharedPreferences4;
                    j7 = j15;
                    z10 = z16;
                    z6 = z202222;
                    longSparseArray7 = longSparseArray152222;
                    longSparseArray8 = longSparseArray6;
                    i10 = i23;
                    str9 = str19;
                    notification2 = notification32222;
                    sharedPreferences2 = sharedPreferences52222;
                    Integer num42222 = num;
                    str10 = str352222;
                    arrayList5 = arrayList16;
                    arrayList5.add(new 1NotificationHolder(num.intValue(), j6, dialogKey82222.story, j14, str20, user6, chat4, category2222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                    notificationsController2 = this;
                    notificationsController2.wearNotificationsIds.put(j6, num42222);
                    i5 = i10 + 1;
                    arrayList15 = arrayList5;
                    size = i9;
                    z5 = z10;
                    arrayList12 = arrayList2;
                    str4 = str10;
                    longSparseArray13 = longSparseArray5;
                    z4 = z6;
                    longSparseArray14 = longSparseArray8;
                    clientUserId = j7;
                    str3 = str9;
                    longSparseArray = longSparseArray7;
                    build2 = notification2;
                    i4 = -1;
                    notificationsController3 = notificationsController2;
                    notificationsSettings = sharedPreferences2;
                }
                LongSparseArray longSparseArray17 = longSparseArray;
                longSparseArray2 = longSparseArray14;
                Notification notification4 = build2;
                NotificationsController notificationsController4 = notificationsController3;
                ArrayList arrayList24 = arrayList15;
                if (!z4) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("show summary with id " + notificationsController4.notificationId);
                    }
                    try {
                        notificationManager.notify(notificationsController4.notificationId, notification4);
                        notificationsController = notificationsController4;
                        arrayList = arrayList24;
                    } catch (SecurityException e5) {
                        FileLog.e(e5);
                        notificationsController = this;
                        arrayList = arrayList24;
                        notificationsController.resetNotificationSound(builder, j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                    }
                } else {
                    notificationsController = notificationsController4;
                    arrayList = arrayList24;
                    if (notificationsController.openedInBubbleDialogs.isEmpty()) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("cancel summary with id " + notificationsController.notificationId);
                        }
                        notificationManager.cancel(notificationsController.notificationId);
                    }
                }
                i6 = 0;
                while (i6 < longSparseArray2.size()) {
                    LongSparseArray longSparseArray18 = longSparseArray2;
                    if (!notificationsController.openedInBubbleDialogs.contains(Long.valueOf(longSparseArray18.keyAt(i6)))) {
                        Integer num5 = (Integer) longSparseArray18.valueAt(i6);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("cancel notification id " + num5);
                        }
                        notificationManager.cancel(num5.intValue());
                    }
                    i6++;
                    longSparseArray2 = longSparseArray18;
                }
                ArrayList arrayList25 = new ArrayList(arrayList.size());
                FileLog.d("showExtraNotifications: holders.size()=" + arrayList.size());
                size2 = arrayList.size();
                i7 = 0;
                while (i7 < size2) {
                    ArrayList arrayList26 = arrayList;
                    1NotificationHolder r4 = (1NotificationHolder) arrayList26.get(i7);
                    arrayList25.clear();
                    if (Build.VERSION.SDK_INT < 29 || DialogObject.isEncryptedDialog(r4.dialogId)) {
                        longSparseArray3 = longSparseArray17;
                    } else {
                        NotificationCompat.Builder builder3 = r4.notification;
                        long j25 = r4.dialogId;
                        longSparseArray3 = longSparseArray17;
                        String createNotificationShortcut = createNotificationShortcut(builder3, j25, r4.name, r4.user, r4.chat, (Person) longSparseArray3.get(j25), !r4.story);
                        if (createNotificationShortcut != null) {
                            arrayList25.add(createNotificationShortcut);
                        }
                    }
                    FileLog.d("showExtraNotifications: holders[" + i7 + "].call()");
                    r4.call();
                    if (!unsupportedNotificationShortcut() && !arrayList25.isEmpty()) {
                        ShortcutManagerCompat.removeDynamicShortcuts(ApplicationLoader.applicationContext, arrayList25);
                    }
                    i7++;
                    arrayList = arrayList26;
                    longSparseArray17 = longSparseArray3;
                }
            }
        }
        z4 = true;
        if (z4) {
            checkOtherNotificationsChannel();
        }
        clientUserId = getUserConfig().getClientUserId();
        if (AndroidUtilities.needShowPasscode()) {
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
        }
        FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() <= 0) + " waitingForPasscode=" + z5 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z4);
        longSparseArray = new LongSparseArray();
        size = arrayList12.size();
        i5 = 0;
        while (true) {
            if (i5 < size) {
            }
            i5 = i10 + 1;
            arrayList15 = arrayList5;
            size = i9;
            z5 = z10;
            arrayList12 = arrayList2;
            str4 = str10;
            longSparseArray13 = longSparseArray5;
            z4 = z6;
            longSparseArray14 = longSparseArray8;
            clientUserId = j7;
            str3 = str9;
            longSparseArray = longSparseArray7;
            build2 = notification2;
            i4 = -1;
            notificationsController3 = notificationsController2;
            notificationsSettings = sharedPreferences2;
        }
        LongSparseArray longSparseArray172 = longSparseArray;
        longSparseArray2 = longSparseArray14;
        Notification notification42 = build2;
        NotificationsController notificationsController42 = notificationsController3;
        ArrayList arrayList242 = arrayList15;
        if (!z4) {
        }
        i6 = 0;
        while (i6 < longSparseArray2.size()) {
        }
        ArrayList arrayList252 = new ArrayList(arrayList.size());
        FileLog.d("showExtraNotifications: holders.size()=" + arrayList.size());
        size2 = arrayList.size();
        i7 = 0;
        while (i7 < size2) {
        }
    }

    class 1NotificationHolder {
        TLRPC.Chat chat;
        long dialogId;
        int id;
        String name;
        NotificationCompat.Builder notification;
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

        1NotificationHolder(int i, long j, boolean z, long j2, String str, TLRPC.User user, TLRPC.Chat chat, NotificationCompat.Builder builder, long j3, String str2, long[] jArr, int i2, Uri uri, int i3, boolean z2, boolean z3, boolean z4, int i4) {
            this.val$lastTopicId = j3;
            this.val$chatName = str2;
            this.val$vibrationPattern = jArr;
            this.val$ledColor = i2;
            this.val$sound = uri;
            this.val$importance = i3;
            this.val$isDefault = z2;
            this.val$isInApp = z3;
            this.val$isSilent = z4;
            this.val$chatType = i4;
            this.id = i;
            this.name = str;
            this.user = user;
            this.chat = chat;
            this.notification = builder;
            this.dialogId = j;
            this.story = z;
            this.topicId = j2;
        }

        void call() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("show dialog notification with id " + this.id + " " + this.dialogId + " user=" + this.user + " chat=" + this.chat);
            }
            try {
                NotificationsController.notificationManager.notify(this.id, this.notification.build());
            } catch (SecurityException e) {
                FileLog.e(e);
                NotificationsController.this.resetNotificationSound(this.notification, this.dialogId, this.val$lastTopicId, this.val$chatName, this.val$vibrationPattern, this.val$ledColor, this.val$sound, this.val$importance, this.val$isDefault, this.val$isInApp, this.val$isSilent, this.val$chatType);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showExtraNotifications$42(Uri uri, File file) {
        try {
            ApplicationLoader.applicationContext.revokeUriPermission(uri, 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
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
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, indexOf));
        sb.append(str.endsWith("…") ? "…" : "");
        return sb.toString();
    }

    private Pair<Integer, Boolean> parseStoryPushes(ArrayList<String> arrayList, ArrayList<Object> arrayList2) {
        int i;
        String str;
        TLRPC.FileLocation fileLocation;
        int min = Math.min(3, this.storyPushMessages.size());
        boolean z = false;
        int i2 = 0;
        while (i < min) {
            StoryNotification storyNotification = this.storyPushMessages.get(i);
            i2 += storyNotification.dateByIds.size();
            z |= storyNotification.hidden;
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
                i = str == null ? i + 1 : 0;
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
        if (z) {
            arrayList2.clear();
        }
        return new Pair<>(Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public static Person.Builder loadRoundAvatar(File file, Person.Builder builder) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (file != null && Build.VERSION.SDK_INT >= 28) {
            try {
                createSource = ImageDecoder.createSource(file);
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda68
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        NotificationsController.lambda$loadRoundAvatar$44(imageDecoder, imageInfo, source);
                    }
                });
                builder.setIcon(IconCompat.createWithBitmap(decodeBitmap));
            } catch (Throwable unused) {
            }
        }
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadRoundAvatar$44(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setPostProcessor(new PostProcessor() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda35
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                int lambda$loadRoundAvatar$43;
                lambda$loadRoundAvatar$43 = NotificationsController.lambda$loadRoundAvatar$43(canvas);
                return lambda$loadRoundAvatar$43;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$loadRoundAvatar$43(Canvas canvas) {
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        int width = canvas.getWidth();
        float f = width / 2;
        path.addRoundRect(0.0f, 0.0f, width, canvas.getHeight(), f, f, Path.Direction.CW);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        canvas.drawPath(path, paint);
        return -3;
    }

    public static Bitmap loadMultipleAvatars(ArrayList<Object> arrayList) {
        int i;
        Bitmap bitmap;
        Paint paint;
        Rect rect;
        float f;
        int i2;
        TextPaint textPaint;
        float size;
        float size2;
        float f2;
        float f3;
        float f4;
        float f5;
        Object obj;
        ArrayList<Object> arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2 == null || arrayList.size() == 0) {
            return null;
        }
        int dp = AndroidUtilities.dp(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint2 = new Paint(3);
        Paint paint3 = new Paint(1);
        Rect rect2 = new Rect();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        float f6 = 1.0f;
        float f7 = arrayList.size() == 1 ? 1.0f : arrayList.size() == 2 ? 0.65f : 0.5f;
        int i3 = 0;
        TextPaint textPaint2 = null;
        while (i3 < arrayList.size()) {
            float f8 = dp;
            float f9 = (f6 - f7) * f8;
            try {
                size = ((arrayList.size() - 1) - i3) * (f9 / arrayList.size());
                size2 = i3 * (f9 / arrayList.size());
                f2 = f8 * f7;
                f3 = f2 / 2.0f;
                i = dp;
                f4 = size + f3;
                f = f7;
                f5 = size2 + f3;
                bitmap = createBitmap;
                try {
                    canvas.drawCircle(f4, f5, AndroidUtilities.dp(2.0f) + f3, paint3);
                    obj = arrayList2.get(i3);
                    paint = paint3;
                } catch (Throwable unused) {
                    paint = paint3;
                }
            } catch (Throwable unused2) {
                i = dp;
                bitmap = createBitmap;
                paint = paint3;
                rect = rect2;
                f = f7;
            }
            try {
            } catch (Throwable unused3) {
                rect = rect2;
                i2 = i3;
                textPaint = textPaint2;
                textPaint2 = textPaint;
                i3 = i2 + 1;
                arrayList2 = arrayList;
                rect2 = rect;
                dp = i;
                f7 = f;
                createBitmap = bitmap;
                paint3 = paint;
                f6 = 1.0f;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i3)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(absolutePath, options);
                int i4 = (int) f2;
                options.inSampleSize = StoryEntry.calculateInSampleSize(options, i4, i4);
                options.inJustDecodeBounds = false;
                options.inDither = true;
                Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                matrix.reset();
                matrix.postScale(f2 / decodeFile.getWidth(), f2 / decodeFile.getHeight());
                matrix.postTranslate(size, size2);
                bitmapShader.setLocalMatrix(matrix);
                paint2.setShader(bitmapShader);
                canvas.drawCircle(f4, f5, f3, paint2);
                decodeFile.recycle();
            } else if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                Rect rect3 = rect2;
                try {
                    i2 = i3;
                    textPaint = textPaint2;
                    try {
                        try {
                            paint2.setShader(new LinearGradient(size, size2, size, size2 + f2, new int[]{Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(user.id)]), Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(user.id)])}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                            canvas.drawCircle(f4, f5, f3, paint2);
                            if (textPaint == null) {
                                TextPaint textPaint3 = new TextPaint(1);
                                try {
                                    textPaint3.setTypeface(AndroidUtilities.bold());
                                    textPaint3.setTextSize(f8 * 0.25f);
                                    textPaint3.setColor(-1);
                                    textPaint2 = textPaint3;
                                } catch (Throwable unused4) {
                                    textPaint2 = textPaint3;
                                    rect = rect3;
                                }
                            } else {
                                textPaint2 = textPaint;
                            }
                            try {
                                StringBuilder sb = new StringBuilder();
                                AvatarDrawable.getAvatarSymbols(user.first_name, user.last_name, null, sb);
                                String sb2 = sb.toString();
                                rect = rect3;
                                try {
                                    textPaint2.getTextBounds(sb2, 0, sb2.length(), rect);
                                    canvas.drawText(sb2, (f4 - (rect.width() / 2.0f)) - rect.left, (f5 - (rect.height() / 2.0f)) - rect.top, textPaint2);
                                } catch (Throwable unused5) {
                                }
                            } catch (Throwable unused6) {
                                rect = rect3;
                            }
                        } catch (Throwable unused7) {
                            rect = rect3;
                        }
                    } catch (Throwable unused8) {
                        rect = rect3;
                        textPaint2 = textPaint;
                        i3 = i2 + 1;
                        arrayList2 = arrayList;
                        rect2 = rect;
                        dp = i;
                        f7 = f;
                        createBitmap = bitmap;
                        paint3 = paint;
                        f6 = 1.0f;
                    }
                } catch (Throwable unused9) {
                    i2 = i3;
                    textPaint = textPaint2;
                }
                i3 = i2 + 1;
                arrayList2 = arrayList;
                rect2 = rect;
                dp = i;
                f7 = f;
                createBitmap = bitmap;
                paint3 = paint;
                f6 = 1.0f;
            }
            rect = rect2;
            i2 = i3;
            textPaint = textPaint2;
            textPaint2 = textPaint;
            i3 = i2 + 1;
            arrayList2 = arrayList;
            rect2 = rect;
            dp = i;
            f7 = f;
            createBitmap = bitmap;
            paint3 = paint;
            f6 = 1.0f;
        }
        return createBitmap;
    }

    public void playOutChatSound() {
        if (!this.inChatSoundEnabled || MediaController.getInstance().isRecordingAudio()) {
            return;
        }
        try {
            if (audioManager.getRingerMode() == 0) {
                return;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$playOutChatSound$46();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playOutChatSound$46() {
        try {
            if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundOutPlay) <= 100) {
                return;
            }
            this.lastSoundOutPlay = SystemClock.elapsedRealtime();
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda24
                    @Override // android.media.SoundPool.OnLoadCompleteListener
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.lambda$playOutChatSound$45(soundPool2, i, i2);
                    }
                });
            }
            if (this.soundOut == 0 && !this.soundOutLoaded) {
                this.soundOutLoaded = true;
                this.soundOut = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_out, 1);
            }
            int i = this.soundOut;
            if (i != 0) {
                try {
                    this.soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$playOutChatSound$45(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            try {
                soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void clearDialogNotificationsSettings(long j, long j2) {
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        String sharedPrefKey = getSharedPrefKey(j, j2);
        edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey).remove(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey);
        getMessagesStorage().setDialogFlags(j, 0L);
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(j);
        if (dialog != null) {
            dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
        }
        edit.commit();
        getNotificationsController().updateServerNotificationsSettings(j, j2, true);
    }

    public void setDialogNotificationsSettings(long j, long j2, int i) {
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(UserConfig.selectedAccount).dialogs_dict.get(j);
        if (i == 4) {
            if (isGlobalNotificationsEnabled(j, false, false)) {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + getSharedPrefKey(j, j2));
            } else {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + getSharedPrefKey(j, j2), 0);
            }
            getMessagesStorage().setDialogFlags(j, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            if (i == 0) {
                currentTime += 3600;
            } else if (i == 1) {
                currentTime += 28800;
            } else if (i == 2) {
                currentTime += 172800;
            } else if (i == 3) {
                currentTime = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            long j3 = 1;
            if (i == 3) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + getSharedPrefKey(j, j2), 2);
            } else {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + getSharedPrefKey(j, j2), 3);
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + getSharedPrefKey(j, j2), currentTime);
                j3 = 1 | (((long) currentTime) << 32);
            }
            getInstance(UserConfig.selectedAccount).removeNotificationsForDialog(j);
            MessagesStorage.getInstance(UserConfig.selectedAccount).setDialogFlags(j, j3);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        updateServerNotificationsSettings(j, j2);
    }

    public void updateServerNotificationsSettings(long j, long j2) {
        updateServerNotificationsSettings(j, j2, true);
    }

    public void updateServerNotificationsSettings(long j, long j2, boolean z) {
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
        if (DialogObject.isEncryptedDialog(j)) {
            return;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String sharedPrefKey = getSharedPrefKey(j, j2);
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
        int i = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + getSharedPrefKey(j, j2), -1);
        if (i != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i == 3) {
                tL_inputPeerNotifySettings4.mute_until = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + getSharedPrefKey(j, j2), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i == 2 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
            }
        }
        long j3 = notificationsSettings.getLong("sound_document_id_" + getSharedPrefKey(j, j2), 0L);
        String string = notificationsSettings.getString("sound_path_" + getSharedPrefKey(j, j2), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j3 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j3;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
            } else {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
                tL_notificationSoundLocal.title = notificationsSettings.getString("sound_" + getSharedPrefKey(j, j2), null);
                tL_notificationSoundLocal.data = string;
                updatenotifysettings.settings.sound = tL_notificationSoundLocal;
            }
        } else {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        }
        if (j2 != 0 && j != getUserConfig().getClientUserId()) {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().getInputPeer(j);
            tL_inputNotifyForumTopic.top_msg_id = (int) j2;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else {
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            updatenotifysettings.peer = tL_inputNotifyPeer;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(j);
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new RequestDelegate() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda73
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsController.lambda$updateServerNotificationsSettings$47(tLObject, tL_error);
            }
        });
    }

    public void updateServerNotificationsSettings(int i) {
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        if (i == 4 || i == 5) {
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
            getConnectionsManager().sendRequest(setreactionsnotifysettings, new RequestDelegate() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda54
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    NotificationsController.lambda$updateServerNotificationsSettings$48(tLObject, tL_error);
                }
            });
            return;
        }
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
        updatenotifysettings.settings = tL_inputPeerNotifySettings;
        tL_inputPeerNotifySettings.flags = 5;
        if (i == 0) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
            updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableGroup2", 0);
            updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewGroup", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings2.flags |= 8;
            tL_inputPeerNotifySettings2.sound = getInputSound(notificationsSettings, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
        } else if (i == 1 || i == 3) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
            updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableAll2", 0);
            updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewAll", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 128;
            tL_inputPeerNotifySettings3.stories_hide_sender = notificationsSettings.getBoolean("EnableHideStoriesSenders", false);
            if (notificationsSettings.contains("EnableAllStories")) {
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 64;
                tL_inputPeerNotifySettings4.stories_muted = !notificationsSettings.getBoolean("EnableAllStories", true);
            }
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings5.flags |= 8;
            tL_inputPeerNotifySettings5.sound = getInputSound(notificationsSettings, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings6.flags |= 256;
            tL_inputPeerNotifySettings6.stories_sound = getInputSound(notificationsSettings, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
        } else {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
            updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableChannel2", 0);
            updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewChannel", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings7.flags |= 8;
            tL_inputPeerNotifySettings7.sound = getInputSound(notificationsSettings, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new RequestDelegate() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda53
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsController.lambda$updateServerNotificationsSettings$49(tLObject, tL_error);
            }
        });
    }

    private TLRPC.NotificationSound getInputSound(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j;
            return tL_notificationSoundRingtone;
        }
        if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                return new TLRPC.TL_notificationSoundNone();
            }
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
            tL_notificationSoundLocal.title = sharedPreferences.getString(str, null);
            tL_notificationSoundLocal.data = string;
            return tL_notificationSoundLocal;
        }
        return new TLRPC.TL_notificationSoundDefault();
    }

    public boolean isGlobalNotificationsEnabled(long j, boolean z, boolean z2) {
        return isGlobalNotificationsEnabled(j, null, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
    
        if (r3.booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r1.megagroup == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isGlobalNotificationsEnabled(long j, Boolean bool, boolean z, boolean z2) {
        int i;
        if (z) {
            i = 4;
        } else if (z2) {
            i = 5;
        } else if (!DialogObject.isChatDialog(j)) {
            i = 1;
        } else if (bool == null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
            if (ChatObject.isChannel(chat)) {
            }
            i = 0;
        }
        return isGlobalNotificationsEnabled(i);
    }

    public boolean isGlobalNotificationsEnabled(int i) {
        if (i == 4) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableReactionsMessages", true);
        }
        if (i == 5) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableReactionsStories", true);
        }
        if (i == 3) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableAllStories", true);
        }
        return getAccountInstance().getNotificationsSettings().getInt(getGlobalNotificationsKey(i), 0) < getConnectionsManager().getCurrentTime();
    }

    public void setGlobalNotificationsEnabled(int i, int i2) {
        getAccountInstance().getNotificationsSettings().edit().putInt(getGlobalNotificationsKey(i), i2).commit();
        updateServerNotificationsSettings(i);
        getMessagesStorage().updateMutedDialogsFiltersCounters();
        deleteNotificationChannelGlobal(i);
    }

    public static String getGlobalNotificationsKey(int i) {
        if (i == 0) {
            return "EnableGroup2";
        }
        if (i == 1) {
            return "EnableAll2";
        }
        return "EnableChannel2";
    }

    public void muteDialog(long j, long j2, boolean z) {
        if (z) {
            getInstance(this.currentAccount).muteUntil(j, j2, ConnectionsManager.DEFAULT_DATACENTER_ID);
            return;
        }
        boolean isGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j, false, false);
        boolean z2 = j2 != 0;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        if (isGlobalNotificationsEnabled && !z2) {
            edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + getSharedPrefKey(j, j2));
        } else {
            edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + getSharedPrefKey(j, j2), 0);
        }
        if (j2 == 0) {
            getMessagesStorage().setDialogFlags(j, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(j);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        updateServerNotificationsSettings(j, j2);
    }

    public NotificationsSettingsFacade getNotificationsSettingsFacade() {
        return this.dialogsNotificationsFacade;
    }

    public void loadTopicsNotificationsExceptions(final long j, final Consumer<HashSet<Integer>> consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda72
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$loadTopicsNotificationsExceptions$51(j, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopicsNotificationsExceptions$51(long j, final Consumer consumer) {
        final HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it = MessagesController.getNotificationsSettings(this.currentAccount).getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.startsWith(NotificationsSettingsFacade.PROPERTY_NOTIFY + j)) {
                Integer parseInt = Utilities.parseInt((CharSequence) key.replace(NotificationsSettingsFacade.PROPERTY_NOTIFY + j, ""));
                int intValue = parseInt.intValue();
                if (intValue != 0 && getMessagesController().isDialogMuted(j, intValue) != getMessagesController().isDialogMuted(j, 0L)) {
                    hashSet.add(parseInt);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.lambda$loadTopicsNotificationsExceptions$50(Consumer.this, hashSet);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadTopicsNotificationsExceptions$50(Consumer consumer, HashSet hashSet) {
        if (consumer != null) {
            consumer.p(hashSet);
        }
    }

    private static class DialogKey {
        final long dialogId;
        final boolean story;
        final long topicId;

        private DialogKey(long j, long j2, boolean z) {
            this.dialogId = j;
            this.topicId = j2;
            this.story = z;
        }
    }

    public static class StoryNotification {
        public long date;
        final HashMap<Integer, Pair<Long, Long>> dateByIds;
        final long dialogId;
        boolean hidden;
        String localName;

        public StoryNotification(long j, String str, int i, long j2) {
            this(j, str, i, j2, j2 + 86400000);
        }

        public StoryNotification(long j, String str, int i, long j2, long j3) {
            HashMap<Integer, Pair<Long, Long>> hashMap = new HashMap<>();
            this.dateByIds = hashMap;
            this.dialogId = j;
            this.localName = str;
            hashMap.put(Integer.valueOf(i), new Pair<>(Long.valueOf(j2), Long.valueOf(j3)));
            this.date = j2;
        }

        public long getLeastDate() {
            long j = -1;
            for (Pair<Long, Long> pair : this.dateByIds.values()) {
                if (j == -1 || j > ((Long) pair.first).longValue()) {
                    j = ((Long) pair.first).longValue();
                }
            }
            return j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkStoryPushes() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        boolean z = false;
        while (i < this.storyPushMessages.size()) {
            StoryNotification storyNotification = this.storyPushMessages.get(i);
            Iterator<Map.Entry<Integer, Pair<Long, Long>>> it = storyNotification.dateByIds.entrySet().iterator();
            while (it.hasNext()) {
                if (currentTimeMillis >= ((Long) it.next().getValue().second).longValue()) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                if (storyNotification.dateByIds.isEmpty()) {
                    getMessagesStorage().deleteStoryPushMessage(storyNotification.dialogId);
                    this.storyPushMessages.remove(i);
                    i--;
                } else {
                    getMessagesStorage().putStoryPushMessage(storyNotification);
                }
            }
            i++;
        }
        if (z) {
            showOrUpdateNotification(false);
        }
        updateStoryPushesRunnable();
    }

    private void updateStoryPushesRunnable() {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.storyPushMessages.size(); i++) {
            Iterator<Pair<Long, Long>> it = this.storyPushMessages.get(i).dateByIds.values().iterator();
            while (it.hasNext()) {
                j = Math.min(j, ((Long) it.next().second).longValue());
            }
        }
        DispatchQueue dispatchQueue = notificationsQueue;
        dispatchQueue.cancelRunnable(this.checkStoryPushesRunnable);
        long currentTimeMillis = j - System.currentTimeMillis();
        if (j != Long.MAX_VALUE) {
            dispatchQueue.postRunnable(this.checkStoryPushesRunnable, Math.max(0L, currentTimeMillis));
        }
    }

    private String getTitle(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return ForumUtilities.getMonoForumTitle(this.currentAccount, chat);
        }
        return chat.title;
    }
}
