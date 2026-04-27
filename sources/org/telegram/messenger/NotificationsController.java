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
import com.google.common.collect.Lists;
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
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$48(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$49(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerNotificationsSettings$50(TLObject tLObject, TLRPC.TL_error tL_error) {
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
        this.checkStoryPushesRunnable = new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda68
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
        this.notificationDelayRunnable = new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda69
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda32
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
                    id = NotificationsController$$ExternalSyntheticApiModelOutline15.m(notificationChannels.get(i)).getId();
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda33
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda58
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda49
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
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !DialogObject.isEncryptedDialog(dialogId) && ((messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) && dialogId != UserObject.VERIFY && dialogId != UserObject.OAUTH)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void forceShowPopupForReply() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda76
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
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda37
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda72
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
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda39
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
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda40
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda27
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
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda29
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
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda30
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda45
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processDeleteStory$14(j, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processDeleteStory$14(long j, int i) {
        boolean z;
        int i2;
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            storyNotification.dateByIds.remove(Integer.valueOf(i));
            if (storyNotification.dateByIds.isEmpty()) {
                this.storyPushMessagesDict.remove(j);
                this.storyPushMessages.remove(storyNotification);
                getMessagesStorage().deleteStoryPushMessage(j);
                z = true;
                i2 = 0;
                while (i2 < this.pushMessages.size()) {
                    MessageObject messageObject = this.pushMessages.get(i2);
                    if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() == i) {
                        this.pushMessages.remove(i2);
                        i2--;
                        SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(messageObject.getDialogId());
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            this.pushMessagesDict.remove(messageObject.getDialogId());
                        }
                        z = true;
                    }
                    i2++;
                }
                if (z) {
                    return;
                }
                showOrUpdateNotification(false);
                return;
            }
            getMessagesStorage().putStoryPushMessage(storyNotification);
        }
        z = false;
        i2 = 0;
        while (i2 < this.pushMessages.size()) {
        }
        if (z) {
        }
    }

    public void processReadStories(final long j, final int i) {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda61
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processReadStories$15(j, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processReadStories$15(long j, int i) {
        boolean z;
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            this.storyPushMessagesDict.remove(j);
            this.storyPushMessages.remove(storyNotification);
            getMessagesStorage().deleteStoryPushMessage(j);
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i2);
            if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() <= i) {
                this.pushMessages.remove(i2);
                i2--;
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i2++;
        }
        if (z) {
            showOrUpdateNotification(false);
            updateStoryPushesRunnable();
        }
    }

    public void processIgnoreStories() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda56
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda28
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda41
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda71
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
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda64
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

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (r0 == 2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda77
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
            notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda70
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$processNewMessages$26(arrayList, arrayList2, z2, z, countDownLatch);
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
    /* JADX WARN: Removed duplicated region for block: B:70:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processNewMessages$26(ArrayList arrayList, final ArrayList arrayList2, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean z3;
        int i;
        int i2;
        Integer num;
        boolean z4;
        boolean z5;
        long j;
        long j2;
        long j3;
        int i3;
        MessageObject messageObject;
        int i4;
        boolean z6;
        long j4;
        long j5;
        String str;
        long j6;
        long j7;
        long j8;
        boolean z7;
        long j9;
        MessageObject messageObject2;
        boolean z8;
        long j10;
        MessageObject messageObject3;
        ArrayList arrayList3 = arrayList;
        LongSparseArray longSparseArray = new LongSparseArray();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        boolean z9 = notificationsSettings.getBoolean("PinnedMessages", true);
        int i5 = 0;
        int i6 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (i6 < arrayList.size()) {
            MessageObject messageObject4 = (MessageObject) arrayList3.get(i6);
            if (messageObject4.messageOwner != null) {
                if (!messageObject4.isImportedForward()) {
                    TLRPC.Message message = messageObject4.messageOwner;
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
                i3 = i5;
                z4 = z9;
                i4 = i6;
                z6 = z10;
                z10 = z6;
                i5 = i3;
                i6 = i4 + 1;
                arrayList3 = arrayList;
                z9 = z4;
            }
            if (!MessageObject.isTopicActionMessage(messageObject4)) {
                if (messageObject4.isStoryPush) {
                    long currentTimeMillis = messageObject4.messageOwner == null ? System.currentTimeMillis() : r0.date * 1000;
                    long dialogId = messageObject4.getDialogId();
                    int id = messageObject4.getId();
                    StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.get(dialogId);
                    if (storyNotification != null) {
                        storyNotification.dateByIds.put(Integer.valueOf(id), new Pair<>(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z14 = storyNotification.hidden;
                        boolean z15 = messageObject4.isStoryPushHidden;
                        if (z14 != z15) {
                            storyNotification.hidden = z15;
                            z13 = true;
                        }
                        storyNotification.date = storyNotification.getLeastDate();
                        getMessagesStorage().putStoryPushMessage(storyNotification);
                        z11 = true;
                    } else {
                        StoryNotification storyNotification2 = new StoryNotification(dialogId, messageObject4.localName, id, currentTimeMillis);
                        storyNotification2.hidden = messageObject4.isStoryPushHidden;
                        this.storyPushMessages.add(storyNotification2);
                        this.storyPushMessagesDict.put(dialogId, storyNotification2);
                        getMessagesStorage().putStoryPushMessage(storyNotification2);
                        z10 = true;
                        z13 = true;
                    }
                    Collections.sort(this.storyPushMessages, Comparator$-CC.comparingLong(new ToLongFunction() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda51
                        @Override // java.util.function.ToLongFunction
                        public final long applyAsLong(Object obj) {
                            long j11;
                            j11 = ((NotificationsController.StoryNotification) obj).date;
                            return j11;
                        }
                    }));
                    z4 = z9;
                    i4 = i6;
                } else {
                    if (messageObject4.isOauthPush) {
                        TLRPC.Message message2 = messageObject4.messageOwner;
                        if (message2 != null) {
                            final int i7 = message2.id;
                            long j11 = message2.date + 60;
                            z4 = z9;
                            long currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                            if (currentTime > j11) {
                                i3 = i5;
                                i4 = i6;
                                z6 = z10;
                                z10 = z6;
                                i5 = i3;
                            } else {
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda52
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        NotificationsController.this.lambda$processNewMessages$23(i7);
                                    }
                                }, (j11 - currentTime) * 1000);
                            }
                        }
                        i3 = i5;
                        z4 = z9;
                        i4 = i6;
                        z6 = z10;
                        z10 = z6;
                        i5 = i3;
                    } else {
                        z4 = z9;
                    }
                    int id2 = messageObject4.getId();
                    long j12 = messageObject4.isFcmMessage() ? messageObject4.messageOwner.random_id : 0L;
                    long dialogId2 = messageObject4.getDialogId();
                    if (messageObject4.isFcmMessage()) {
                        z5 = messageObject4.localChannel;
                    } else {
                        if (DialogObject.isChatDialog(dialogId2)) {
                            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-dialogId2));
                            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                                z5 = true;
                            }
                        }
                        z5 = false;
                    }
                    if (messageObject4.isStoryReactionPush) {
                        j2 = messageObject4.getDialogId();
                        j = dialogId2;
                    } else {
                        j = dialogId2;
                        long j13 = messageObject4.messageOwner.peer_id.channel_id;
                        j2 = j13 != 0 ? -j13 : 0L;
                    }
                    SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(j2);
                    MessageObject messageObject5 = sparseArray != null ? (MessageObject) sparseArray.get(id2) : null;
                    MessageObject messageObject6 = messageObject5;
                    if (messageObject5 == null) {
                        j3 = j12;
                        long j14 = messageObject4.messageOwner.random_id;
                        if (j14 != 0) {
                            messageObject = (MessageObject) this.fcmRandomMessagesDict.get(j14);
                            if (messageObject != null) {
                                i3 = i5;
                                this.fcmRandomMessagesDict.remove(messageObject4.messageOwner.random_id);
                            } else {
                                i3 = i5;
                            }
                            if (messageObject == null) {
                                if (messageObject.isFcmMessage()) {
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        this.pushMessagesDict.put(j2, sparseArray);
                                    }
                                    sparseArray.put(id2, messageObject4);
                                    int indexOf = this.pushMessages.indexOf(messageObject);
                                    if (indexOf >= 0) {
                                        this.pushMessages.set(indexOf, messageObject4);
                                        long j15 = j;
                                        i4 = i6;
                                        z8 = z10;
                                        j10 = j2;
                                        messageObject3 = messageObject4;
                                        i5 = addToPopupMessages(arrayList2, messageObject4, j15, z5, notificationsSettings);
                                    } else {
                                        messageObject3 = messageObject4;
                                        i4 = i6;
                                        z8 = z10;
                                        j10 = j2;
                                        i5 = i3;
                                    }
                                    if (z) {
                                        boolean z16 = messageObject3.localEdit;
                                        if (z16) {
                                            getMessagesStorage().putPushMessage(messageObject3);
                                        }
                                        z11 = z16;
                                    }
                                } else {
                                    i4 = i6;
                                    z8 = z10;
                                    j10 = j2;
                                    i5 = i3;
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + j10 + ", mid=" + id2);
                                }
                                z10 = z8;
                            } else {
                                long j16 = j;
                                i4 = i6;
                                z6 = z10;
                                long j17 = j2;
                                if (z11) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("skipped message because edited");
                                    }
                                } else {
                                    if (z && !messageObject4.isOauthPush) {
                                        getMessagesStorage().putPushMessage(messageObject4);
                                    }
                                    long topicId = MessageObject.getTopicId(this.currentAccount, messageObject4.messageOwner, getMessagesController().isForum(messageObject4));
                                    if (j16 == this.openedDialogId && ApplicationLoader.isScreenOn && !messageObject4.isStoryReactionPush && !messageObject4.isOauthPush) {
                                        if (!z) {
                                            playInChatSound();
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("skipped message because chat is already opened (openedDialogId = " + this.openedDialogId + ")");
                                        }
                                    } else {
                                        TLRPC.Message message3 = messageObject4.messageOwner;
                                        if (!message3.mentioned) {
                                            j4 = j16;
                                        } else if (!z4 && (message3.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("skipped message because message is mention of pinned");
                                            }
                                        } else {
                                            j4 = messageObject4.getFromChatId();
                                        }
                                        if (isPersonalMessage(messageObject4)) {
                                            this.personalCount++;
                                        }
                                        DialogObject.isChatDialog(j4);
                                        int indexOfKey = longSparseArray.indexOfKey(j4);
                                        if (indexOfKey >= 0 && topicId == 0) {
                                            j6 = j16;
                                            j5 = j17;
                                            j7 = j3;
                                            str = ")";
                                            long j18 = j4;
                                            z7 = ((Boolean) longSparseArray.valueAt(indexOfKey)).booleanValue();
                                            j8 = j18;
                                        } else {
                                            long j19 = j4;
                                            j5 = j17;
                                            str = ")";
                                            j6 = j16;
                                            j7 = j3;
                                            int notifyOverride = getNotifyOverride(notificationsSettings, j19, topicId);
                                            if (notifyOverride == -1) {
                                                z7 = isGlobalNotificationsEnabled(j19, Boolean.valueOf(z5), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                                if (BuildVars.LOGS_ENABLED) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                    j8 = j19;
                                                    sb.append(j8);
                                                    sb.append(", ");
                                                    sb.append(z5);
                                                    sb.append(", ");
                                                    sb.append(messageObject4.isReactionPush);
                                                    sb.append(", ");
                                                    sb.append(messageObject4.isStoryReactionPush);
                                                    sb.append(") = ");
                                                    sb.append(z7);
                                                    FileLog.d(sb.toString());
                                                } else {
                                                    j8 = j19;
                                                }
                                            } else {
                                                j8 = j19;
                                                z7 = notifyOverride != 2;
                                            }
                                            longSparseArray.put(j8, Boolean.valueOf(z7));
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("NotificationsController: process new messages, value is " + z7 + " (" + j8 + ", " + z5 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + str);
                                        }
                                        if (z7) {
                                            if (z) {
                                                j9 = j8;
                                                messageObject2 = messageObject4;
                                                i5 = i3;
                                            } else {
                                                j9 = j8;
                                                messageObject2 = messageObject4;
                                                i5 = addToPopupMessages(arrayList2, messageObject4, j8, z5, notificationsSettings);
                                            }
                                            if (!z12) {
                                                z12 = messageObject2.messageOwner.from_scheduled;
                                            }
                                            this.delayedPushMessages.add(messageObject2);
                                            appendMessage(messageObject2);
                                            if (id2 != 0) {
                                                if (sparseArray == null) {
                                                    sparseArray = new SparseArray();
                                                    this.pushMessagesDict.put(j5, sparseArray);
                                                }
                                                sparseArray.put(id2, messageObject2);
                                            } else {
                                                long j20 = j7;
                                                if (j20 != 0) {
                                                    this.fcmRandomMessagesDict.put(j20, messageObject2);
                                                }
                                            }
                                            long j21 = j6;
                                            if (j21 != j9) {
                                                Integer num2 = (Integer) this.pushDialogsOverrideMention.get(j21);
                                                this.pushDialogsOverrideMention.put(j21, Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1));
                                            }
                                        } else {
                                            j9 = j8;
                                            messageObject2 = messageObject4;
                                            i5 = i3;
                                        }
                                        if (messageObject2.isReactionPush) {
                                            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                            sparseBooleanArray.put(id2, true);
                                            getMessagesController().checkUnreadReactions(j9, topicId, sparseBooleanArray);
                                        }
                                        z10 = true;
                                    }
                                }
                                z10 = z6;
                                i5 = i3;
                            }
                        }
                    } else {
                        j3 = j12;
                    }
                    i3 = i5;
                    messageObject = messageObject6;
                    if (messageObject == null) {
                    }
                }
                i6 = i4 + 1;
                arrayList3 = arrayList;
                z9 = z4;
            }
            if (BuildVars.LOGS_ENABLED) {
            }
            i3 = i5;
            z4 = z9;
            i4 = i6;
            z6 = z10;
            z10 = z6;
            i5 = i3;
            i6 = i4 + 1;
            arrayList3 = arrayList;
            z9 = z4;
        }
        final int i8 = i5;
        boolean z17 = z10;
        if (z17) {
            this.notifyCheck = z2;
        }
        if (!arrayList2.isEmpty() && !AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda53
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$processNewMessages$24(arrayList2, i8);
                }
            });
        }
        if (z || z12) {
            if (z11) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + this.notifyCheck);
                }
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else if (z17) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: added branch");
                }
                MessageObject messageObject7 = (MessageObject) arrayList.get(0);
                long dialogId3 = messageObject7.getDialogId();
                long topicId2 = MessageObject.getTopicId(this.currentAccount, messageObject7.messageOwner, getMessagesController().isForum(dialogId3));
                Boolean valueOf = messageObject7.isFcmMessage() ? Boolean.valueOf(messageObject7.localChannel) : null;
                int i9 = this.total_unread_count;
                int notifyOverride2 = getNotifyOverride(notificationsSettings, dialogId3, topicId2);
                if (notifyOverride2 == -1) {
                    z3 = isGlobalNotificationsEnabled(dialogId3, valueOf, messageObject7.isReactionPush, messageObject7.isStoryReactionPush);
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
                if (z3 && !messageObject7.isStoryPush) {
                    if (getMessagesController().isForum(dialogId3)) {
                        int i10 = this.total_unread_count - ((num3 == null || num3.intValue() <= 0) ? 0 : 1);
                        this.total_unread_count = i10;
                        if (i2 <= 0) {
                            i = 0;
                        }
                        this.total_unread_count = i10 + i;
                    } else {
                        if (num3 != null) {
                            this.total_unread_count -= num3.intValue();
                        }
                        this.total_unread_count += i2;
                    }
                    this.pushDialogs.put(dialogId3, Integer.valueOf(i2));
                }
                if (i9 != this.total_unread_count || z13) {
                    this.delayedPushMessages.clear();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("NotificationsController processNewMessages: added branch: " + this.notifyCheck);
                    }
                    showOrUpdateNotification(this.notifyCheck);
                    final int size = this.pushDialogs.size();
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda54
                        @Override // java.lang.Runnable
                        public final void run() {
                            NotificationsController.this.lambda$processNewMessages$25(size);
                        }
                    });
                }
                this.notifyCheck = false;
                if (this.showBadgeNumber) {
                    setBadge(getTotalAllUnreadCount());
                }
            }
        }
        if (z13) {
            updateStoryPushesRunnable();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processNewMessages$23(int i) {
        LongSparseArray longSparseArray = new LongSparseArray();
        longSparseArray.put(0L, Lists.newArrayList(Integer.valueOf(i)));
        removeDeletedMessagesFromNotifications(longSparseArray, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processNewMessages$24(ArrayList arrayList, int i) {
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
    public /* synthetic */ void lambda$processNewMessages$25(int i) {
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processDialogsUpdateRead$29(longSparseIntArray, arrayList);
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
    public /* synthetic */ void lambda$processDialogsUpdateRead$29(LongSparseIntArray longSparseIntArray, final ArrayList arrayList) {
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
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$processDialogsUpdateRead$27(arrayList);
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
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$processDialogsUpdateRead$28(size);
                }
            });
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDialogsUpdateRead$27(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDialogsUpdateRead$28(int i) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void processLoadedUnreadMessages(final LongSparseArray longSparseArray, final ArrayList<TLRPC.Message> arrayList, final ArrayList<MessageObject> arrayList2, ArrayList<TLRPC.User> arrayList3, ArrayList<TLRPC.Chat> arrayList4, ArrayList<TLRPC.EncryptedChat> arrayList5, final Collection<StoryNotification> collection) {
        getMessagesController().putUsers(arrayList3, true);
        getMessagesController().putChats(arrayList4, true);
        getMessagesController().putEncryptedChats(arrayList5, true);
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processLoadedUnreadMessages$32(arrayList, longSparseArray, arrayList2, collection);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedUnreadMessages$32(ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, Collection collection) {
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
            Collections.sort(this.storyPushMessages, Comparator$-CC.comparingLong(new ToLongFunction() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda66
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long j15;
                    j15 = ((NotificationsController.StoryNotification) obj).date;
                    return j15;
                }
            }));
        }
        final int size = this.pushDialogs.size();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda67
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$processLoadedUnreadMessages$31(size);
            }
        });
        showOrUpdateNotification(SystemClock.elapsedRealtime() / 1000 < 60);
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processLoadedUnreadMessages$31(int i) {
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
    public /* synthetic */ void lambda$updateBadge$33() {
        setBadge(getTotalAllUnreadCount());
    }

    public void updateBadge() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda57
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$updateBadge$33();
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
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageService) == false) goto L738;
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
    
        if (r5 >= r27.messageOwner.action.users.size()) goto L918;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0460, code lost:
    
        r7 = getMessagesController().getUser(r27.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0474, code lost:
    
        if (r7 == null) goto L920;
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
    
        if (r5 >= r27.messageOwner.action.users.size()) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0560, code lost:
    
        r7 = getMessagesController().getUser(r27.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0574, code lost:
    
        if (r7 == null) goto L923;
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
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditPhoto) != false) goto L720;
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
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSuggestBirthday) == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06b9, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06bc, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPinMessage) == false) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x06c2, code lost:
    
        if (r4 == null) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06c8, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r4) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x06cc, code lost:
    
        if (r4.megagroup == false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06d3, code lost:
    
        r1 = r27.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x06d5, code lost:
    
        if (r1 != null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x06ea, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x06f2, code lost:
    
        if (r1.isMusic() == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0704, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusic, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0709, code lost:
    
        if (r1.isVideo() == false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0713, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x073e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r0, "📹 " + r1.messageOwner.message, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0752, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideo, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0757, code lost:
    
        if (r1.isGif() == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0761, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x078c, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r0, "🎬 " + r1.messageOwner.message, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x07a0, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGif, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x07a8, code lost:
    
        if (r1.isVoice() == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x07ba, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoice, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x07bf, code lost:
    
        if (r1.isRoundVideo() == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x07d1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRound, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x07d6, code lost:
    
        if (r1.isSticker() != false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x07dc, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x07e2, code lost:
    
        r6 = r1.messageOwner;
        r8 = r6.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x07e8, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x07f0, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x081b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r0, "📎 " + r1.messageOwner.message, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x082f, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFile, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0832, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0836, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x083f, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0854, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLive, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0857, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0859, code lost:
    
        r8 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0879, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContact2, r0, r3.getTitle(r4), org.telegram.messenger.ContactsController.formatName(r8.first_name, r8.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x087c, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x087e, code lost:
    
        r8 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0884, code lost:
    
        if (r8.poll.quiz == false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x08a2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuiz2, r0, r3.getTitle(r4), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x08bf, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPoll2, r0, r3.getTitle(r4), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x08c2, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x08e2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodo2, r0, r3.getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r8).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x08e5, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x08ed, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0918, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r0, "🖼 " + r1.messageOwner.message, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x092c, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhoto, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0932, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0944, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGame, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0945, code lost:
    
        r6 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0947, code lost:
    
        if (r6 == null) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x094d, code lost:
    
        if (r6.length() <= 0) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x094f, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0955, code lost:
    
        if (r1.length() <= 20) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0957, code lost:
    
        r6 = new java.lang.StringBuilder();
        r8 = 0;
        r6.append((java.lang.Object) r1.subSequence(0, 20));
        r6.append("...");
        r1 = r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x096d, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedText;
        r4 = r3.getTitle(r4);
        r5 = new java.lang.Object[3];
        r5[r8] = r0;
        r5[1] = r1;
        r5[2] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0982, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x096c, code lost:
    
        r8 = 0;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0996, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x09a7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeo, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x09a8, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x09ac, code lost:
    
        if (r1 == null) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r7.getBoolean("EnablePreviewGroup", true) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x09c2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmoji, r0, r3.getTitle(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x09d4, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedSticker, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x09d5, code lost:
    
        if (r4 == null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x09d7, code lost:
    
        r0 = r27.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x09d9, code lost:
    
        if (r0 != null) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x09e9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x09ee, code lost:
    
        if (r0.isMusic() == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x09fe, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0a03, code lost:
    
        if (r0.isVideo() == false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0a0d, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.messageOwner.message) != false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0a35, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, r3.getTitle(r4), "📹 " + r0.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0a46, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0a4b, code lost:
    
        if (r0.isGif() == false) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0a55, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.messageOwner.message) != false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0a7d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, r3.getTitle(r4), "🎬 " + r0.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0a8e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0a95, code lost:
    
        if (r0.isVoice() == false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0aa5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0aaa, code lost:
    
        if (r0.isRoundVideo() == false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0aba, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0abf, code lost:
    
        if (r0.isSticker() != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (r7.getBoolean("EnablePreviewChannel", r0) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0ac5, code lost:
    
        if (r0.isAnimatedSticker() == false) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0acb, code lost:
    
        r1 = r0.messageOwner;
        r6 = r1.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0ad1, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0ad9, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.message) != false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0b01, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, r3.getTitle(r4), "📎 " + r0.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0b12, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0b15, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0b19, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0b21, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b33, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0b36, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0b38, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0b55, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactChannel2, r3.getTitle(r4), org.telegram.messenger.ContactsController.formatName(r6.first_name, r6.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0b58, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0b5a, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0b60, code lost:
    
        if (r6.poll.quiz == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0b7b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizChannel2, r3.getTitle(r4), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0b95, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollChannel2, r3.getTitle(r4), r6.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0b98, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0bb5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoChannel2, r3.getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r6).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0bb8, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0bc0, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.message) != false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0be8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, r3.getTitle(r4), "🖼 " + r0.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0bf9, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0bfe, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0c0e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0c0f, code lost:
    
        r1 = r0.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0c11, code lost:
    
        if (r1 == null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0c17, code lost:
    
        if (r1.length() <= 0) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0c19, code lost:
    
        r0 = r0.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0c1f, code lost:
    
        if (r0.length() <= 20) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0c21, code lost:
    
        r1 = new java.lang.StringBuilder();
        r6 = 0;
        r1.append((java.lang.Object) r0.subSequence(0, 20));
        r1.append("...");
        r0 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c37, code lost:
    
        r1 = org.telegram.messenger.R.string.NotificationActionPinnedTextChannel;
        r2 = r3.getTitle(r4);
        r4 = new java.lang.Object[2];
        r4[r6] = r2;
        r4[1] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0c49, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0c36, code lost:
    
        r6 = 0;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0c5a, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0c69, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0c6a, code lost:
    
        r0 = r0.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0c6e, code lost:
    
        if (r0 == null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0c81, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiChannel, r3.getTitle(r4), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0c90, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerChannel, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0c91, code lost:
    
        r1 = r27.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0c95, code lost:
    
        if (r1 != null) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0ca1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0ca6, code lost:
    
        if (r1.isMusic() == false) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0cb2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0cb7, code lost:
    
        if (r1.isVideo() == false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0cc1, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0ce5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r0, "📹 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0cf2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0cf7, code lost:
    
        if (r1.isGif() == false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0d01, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.messageOwner.message) != false) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0d25, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r0, "🎬 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0d32, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0d39, code lost:
    
        if (r1.isVoice() == false) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0d45, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0d4a, code lost:
    
        if (r1.isRoundVideo() == false) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0d56, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0d5b, code lost:
    
        if (r1.isSticker() != false) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0d61, code lost:
    
        if (r1.isAnimatedSticker() == false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0d67, code lost:
    
        r4 = r1.messageOwner;
        r6 = r4.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0d6d, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0d75, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0d99, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r0, "📎 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0da6, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0da9, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0dad, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0db5, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0dc3, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0dc7, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0dc9, code lost:
    
        r6 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0de1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactUser, r0, org.telegram.messenger.ContactsController.formatName(r6.first_name, r6.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0de4, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0de6, code lost:
    
        r1 = ((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r6).poll;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0dec, code lost:
    
        if (r1.quiz == false) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0e01, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizUser, r0, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0e15, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollUser, r0, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0e18, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0e31, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoUser, r0, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r6).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0e34, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0e3c, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.message) != false) goto L652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0e60, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextUser, r0, "🖼 " + r1.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0e6d, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0e72, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0e7e, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0e7f, code lost:
    
        r4 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0e81, code lost:
    
        if (r4 == null) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0e87, code lost:
    
        if (r4.length() <= 0) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0e89, code lost:
    
        r1 = r1.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0e8f, code lost:
    
        if (r1.length() <= 20) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0e91, code lost:
    
        r4 = new java.lang.StringBuilder();
        r6 = 0;
        r4.append((java.lang.Object) r1.subSequence(0, 20));
        r4.append("...");
        r1 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0ea7, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedTextUser;
        r4 = new java.lang.Object[2];
        r4[r6] = r0;
        r4[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0eb5, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0ea6, code lost:
    
        r6 = 0;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0ec2, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0ecd, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0ece, code lost:
    
        r1 = r1.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0ed2, code lost:
    
        if (r1 == null) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0ee1, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiUser, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0eec, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerUser, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0eef, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0ef1, code lost:
    
        r1 = org.telegram.messenger.utils.tlutils.TlUtils.getThemeEmoticonOrGiftTitle(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r5).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0efd, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0f01, code lost:
    
        if (r8 != r21) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:?, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabledYou, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:?, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabled, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0f21, code lost:
    
        if (r8 != r21) goto L689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:?, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedYou, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0f3b, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedTo, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0f3e, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByRequest) == false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0f46, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0f49, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) == false) goto L706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0f4b, code lost:
    
        r5 = (org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) r5;
        r0 = org.telegram.messenger.DialogObject.getPeerDialogId(r5.boost_peer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0f57, code lost:
    
        if (r0 < 0) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0f59, code lost:
    
        r6 = org.telegram.messenger.UserObject.getForcedFirstName(getMessagesController().getUser(java.lang.Long.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0f8f, code lost:
    
        return org.telegram.messenger.LocaleController.formatPluralStringComma("BoostingReceivedStars", (int) r5.stars, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0f6a, code lost:
    
        r0 = getMessagesController().getChat(java.lang.Long.valueOf(-r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0f77, code lost:
    
        if (r0 != null) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0f79, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0f7c, code lost:
    
        r6 = r3.getTitle(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0f92, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPaymentRefunded) == false) goto L710;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0f9a, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0f9d, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoCompletions) == false) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0fa5, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0fa8, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoAppendTasks) == false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0fb0, code lost:
    
        return r27.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0fb1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0fbb, code lost:
    
        if (r2.peer_id.channel_id == 0) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0fbf, code lost:
    
        if (r4.megagroup != false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x0fc5, code lost:
    
        if (r27.isVideoAvatar() == false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0fd7, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelVideoEditNotification, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0fe8, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelPhotoEditNotification, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0fee, code lost:
    
        if (r27.isVideoAvatar() == false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x1002, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupVideo, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x1015, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupPhoto, r0, r3.getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x1020, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationContactJoined, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x1027, code lost:
    
        if (r27.isMediaEmpty() == false) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x1031, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x1037, code lost:
    
        return replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x103e, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x1043, code lost:
    
        if (r27.type != 29) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x104b, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r27) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x104d, code lost:
    
        r0 = (org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.MessageObject.getMedia(r27);
        r1 = r0.extended_media.size();
        r2 = false;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x105b, code lost:
    
        if (r4 >= r1) goto L925;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x105d, code lost:
    
        r5 = r0.extended_media.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x1067, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) == false) goto L760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x1069, code lost:
    
        r2 = ((org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) r5).media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x106f, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x1077, code lost:
    
        if (org.telegram.messenger.MessageObject.isVideoDocument(r2.document) == false) goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x1089, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x108e, code lost:
    
        if (r2 == false) goto L769;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x1092, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x1095, code lost:
    
        r0 = org.telegram.messenger.R.string.AttachPaidMedia;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x1097, code lost:
    
        if (r1 != 1) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x1099, code lost:
    
        if (r2 == false) goto L774;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x109b, code lost:
    
        r1 = org.telegram.messenger.R.string.AttachVideo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x10a0, code lost:
    
        r1 = org.telegram.messenger.LocaleController.getString(r1);
        r2 = 1;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x10b7, code lost:
    
        r2 = new java.lang.Object[r2];
        r2[r4] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x10bf, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x109e, code lost:
    
        r1 = org.telegram.messenger.R.string.AttachPhoto;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x10a7, code lost:
    
        if (r2 == false) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x10a9, code lost:
    
        r2 = "Media";
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x10ab, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x10b0, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralString(r2, r1, new java.lang.Object[0]);
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x10ad, code lost:
    
        r2 = "Photos";
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x108b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x107f, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) == false) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x1087, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r5).flags & 4) == 0) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x10c4, code lost:
    
        if (r27.isVoiceOnce() == false) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x10cc, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x10d1, code lost:
    
        if (r27.isRoundOnce() == false) goto L791;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x10d9, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachOnceRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x10da, code lost:
    
        r0 = r27.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x10e0, code lost:
    
        if ((r0.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L803;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x10e8, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.message) != false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x10fd, code lost:
    
        return "🖼 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x1104, code lost:
    
        if (r27.messageOwner.media.ttl_seconds == 0) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x110c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x1113, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachPhoto);
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x1118, code lost:
    
        if (r27.isVideo() == false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x1122, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x1137, code lost:
    
        return "📹 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x113e, code lost:
    
        if (r27.messageOwner.media.ttl_seconds == 0) goto L813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x1146, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDestructingVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x114d, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachVideo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x1152, code lost:
    
        if (r27.isGame() == false) goto L819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x115a, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGame);
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x115f, code lost:
    
        if (r27.isVoice() == false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x1167, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachAudio);
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x116c, code lost:
    
        if (r27.isRoundVideo() == false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x1174, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachRound);
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x1179, code lost:
    
        if (r27.isMusic() == false) goto L831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x1181, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachMusic);
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x1182, code lost:
    
        r0 = r27.messageOwner.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x1188, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x1190, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachContact);
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x1193, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x119b, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r0).poll.quiz == false) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x11a3, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.QuizPoll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x11aa, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Poll);
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x11ad, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L847;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x11b5, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Todo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x11b8, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x11c0, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveaway);
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x11c3, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L855;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x11cb, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingGiveawayResults);
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x11ce, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x11d2, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L860;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x11d8, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x11e0, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLiveLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x11e3, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x11e9, code lost:
    
        if (r27.isSticker() != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x11ef, code lost:
    
        if (r27.isAnimatedSticker() == false) goto L871;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x11f6, code lost:
    
        if (r27.isGif() == false) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x1200, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x1215, code lost:
    
        return "🎬 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x121c, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachGif);
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x1225, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageOwner.message) != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x123a, code lost:
    
        return "📎 " + replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x1241, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachDocument);
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x1242, code lost:
    
        r0 = r27.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x1246, code lost:
    
        if (r0 == null) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x1262, code lost:
    
        return r0 + " " + org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachSticker);
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x1269, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachSticker);
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x126c, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaStory) == false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x1272, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaStory) r0).via_mention == false) goto L902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x1274, code lost:
    
        r0 = org.telegram.messenger.R.string.StoryNotificationMention;
        r2 = r28[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x1279, code lost:
    
        if (r2 != null) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x127b, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x1289, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x127f, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x1290, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Story);
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x1297, code lost:
    
        if (android.text.TextUtils.isEmpty(r27.messageText) != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x129d, code lost:
    
        return replaceSpoilers(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x12a4, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.Message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x12ab, code lost:
    
        return org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.AttachLocation);
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x0249, code lost:
    
        if (r7.getBoolean("EnablePreviewGroup", r10) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0252, code lost:
    
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

    /* JADX WARN: Code restructure failed: missing block: B:311:0x06d3, code lost:
    
        if (r6.getBoolean(r24, true) == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06e1, code lost:
    
        r2 = r29.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x06e5, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageService) == false) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x06e7, code lost:
    
        r5 = r2.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x06ed, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatAddUser) == false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x06ef, code lost:
    
        r6 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x06f5, code lost:
    
        if (r6 != 0) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x06fe, code lost:
    
        if (r5.users.size() != 1) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0700, code lost:
    
        r6 = r29.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0715, code lost:
    
        if (r6 == 0) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x071f, code lost:
    
        if (r29.messageOwner.peer_id.channel_id == 0) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0723, code lost:
    
        if (r4.megagroup != false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0725, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelAddedByNotification, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x073f, code lost:
    
        if (r6 != r19) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0741, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroup, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0753, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x075f, code lost:
    
        if (r1 != null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0761, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0767, code lost:
    
        if (r13 != r1.id) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x076b, code lost:
    
        if (r4.megagroup == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x076d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelfMega, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0782, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddSelf, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0797, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r3, getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x07b3, code lost:
    
        r2 = new java.lang.StringBuilder();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x07c3, code lost:
    
        if (r5 >= r29.messageOwner.action.users.size()) goto L867;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x07c5, code lost:
    
        r6 = getMessagesController().getUser(r29.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x07d9, code lost:
    
        if (r6 == null) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x07db, code lost:
    
        r6 = org.telegram.messenger.UserObject.getUserName(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x07e3, code lost:
    
        if (r2.length() == 0) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x07e5, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x07e8, code lost:
    
        r2.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x07eb, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x07ee, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupAddMember, r3, getTitle(r4), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x080c, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCall) == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0810, code lost:
    
        if (r5.duration == 0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0825, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupEndedCall, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0839, code lost:
    
        return org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupCreatedCall, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x083c, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCallScheduled) == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x083e, code lost:
    
        r1 = r29.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0848, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionInviteToGroupCall) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x084a, code lost:
    
        r6 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0850, code lost:
    
        if (r6 != 0) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0859, code lost:
    
        if (r5.users.size() != 1) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x085b, code lost:
    
        r6 = r29.messageOwner.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0870, code lost:
    
        if (r6 == 0) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0874, code lost:
    
        if (r6 != r19) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0876, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedYouToCall, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x088b, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0897, code lost:
    
        if (r1 != null) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0899, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x089b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r3, getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x08b7, code lost:
    
        r2 = new java.lang.StringBuilder();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x08c7, code lost:
    
        if (r5 >= r29.messageOwner.action.users.size()) goto L870;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x08c9, code lost:
    
        r6 = getMessagesController().getUser(r29.messageOwner.action.users.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x08dd, code lost:
    
        if (r6 == null) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x08df, code lost:
    
        r6 = org.telegram.messenger.UserObject.getUserName(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x08e7, code lost:
    
        if (r2.length() == 0) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x08e9, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x08ec, code lost:
    
        r2.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x08ef, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x08f2, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupInvitedToCall, r3, getTitle(r4), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0910, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) == false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0912, code lost:
    
        r5 = (org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) r5;
        r1 = org.telegram.messenger.MessagesController.getInstance(r28.currentAccount).getChat(java.lang.Long.valueOf(-org.telegram.messenger.DialogObject.getPeerDialogId(r5.boost_peer)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0929, code lost:
    
        if (r1 != null) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x092b, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0931, code lost:
    
        if (r15 != null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0933, code lost:
    
        r1 = org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.BoostingReceivedGiftNoName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x093b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGiftCode, r15, org.telegram.messenger.LocaleController.formatPluralString("Months", r5.months, new java.lang.Object[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x092d, code lost:
    
        r15 = getTitle(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x095c, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByLink) == false) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x095e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationInvitedToGroupByLink, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0973, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditTitle) == false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0975, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupName, r3, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0988, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoCompletions) == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x098a, code lost:
    
        r1 = r29.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0994, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoAppendTasks) == false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0996, code lost:
    
        r1 = r29.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x09a0, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditPhoto) != false) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x09a4, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeletePhoto) == false) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x09aa, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeleteUser) == false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x09ac, code lost:
    
        r5 = r5.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x09b0, code lost:
    
        if (r5 != r19) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x09b2, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickYou, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x09cc, code lost:
    
        if (r5 != r13) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x09ce, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupLeftMember, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x09e0, code lost:
    
        r1 = getMessagesController().getUser(java.lang.Long.valueOf(r29.messageOwner.action.user_id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x09f2, code lost:
    
        if (r1 != null) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x09f4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x09f6, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationGroupKickMember, r3, getTitle(r4), org.telegram.messenger.UserObject.getUserName(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0a12, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0a15, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatCreate) == false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0a17, code lost:
    
        r1 = r29.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0a21, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelCreate) == false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0a23, code lost:
    
        r1 = r29.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0a2d, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatMigrateTo) == false) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0a2f, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0a45, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0a47, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ActionMigrateFromGroupNotify, r5.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0a57, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionScreenshotTaken) == false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0a59, code lost:
    
        r1 = r29.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0a63, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPinMessage) == false) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0a6d, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r4) == false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0a71, code lost:
    
        if (r4.megagroup == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0a77, code lost:
    
        r2 = r29.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0a79, code lost:
    
        if (r2 != null) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0a7b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0a93, code lost:
    
        if (r2.isMusic() == false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0a95, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusicChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0aa9, code lost:
    
        if (r2.isVideo() == false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0ab3, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.messageOwner.message) != false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0ab5, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "📹 " + r2.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0add, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideoChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0af3, code lost:
    
        if (r2.isGif() == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0afd, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.messageOwner.message) != false) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0aff, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "🎬 " + r2.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0b27, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGifChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0b3f, code lost:
    
        if (r2.isVoice() == false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0b41, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoiceChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0b55, code lost:
    
        if (r2.isRoundVideo() == false) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0b57, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRoundChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0b6b, code lost:
    
        if (r2.isSticker() != false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0b71, code lost:
    
        if (r2.isAnimatedSticker() == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0b77, code lost:
    
        r3 = r2.messageOwner;
        r7 = r3.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0b7d, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0b85, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.message) != false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0b87, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "📎 " + r2.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0baf, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFileChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0bc3, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0bc7, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0bcf, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0bd1, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLiveChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0be5, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0be7, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r29.messageOwner.media;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContactChannel2, getTitle(r4), org.telegram.messenger.ContactsController.formatName(r1.first_name, r1.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0c0c, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0c0e, code lost:
    
        r7 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0c14, code lost:
    
        if (r7.poll.quiz == false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0c16, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuizChannel2, getTitle(r4), r7.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0c31, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPollChannel2, getTitle(r4), r7.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0c4e, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0c50, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodoChannel2, getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r7).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0c6f, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0c77, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.message) != false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0c79, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTextChannel, getTitle(r4), "🖼 " + r2.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0ca1, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhotoChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0cb7, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0cb9, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGameChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0cc9, code lost:
    
        r1 = r2.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0ccb, code lost:
    
        if (r1 == null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0cd1, code lost:
    
        if (r1.length() <= 0) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0cd3, code lost:
    
        r1 = r2.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0cd9, code lost:
    
        if (r1.length() <= 20) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0cdb, code lost:
    
        r2 = new java.lang.StringBuilder();
        r7 = 0;
        r2.append((java.lang.Object) r1.subSequence(0, 20));
        r2.append("...");
        r1 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0cf1, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedTextChannel;
        r3 = getTitle(r4);
        r4 = new java.lang.Object[2];
        r4[r7] = r3;
        r4[1] = r1;
        r1 = org.telegram.messenger.LocaleController.formatString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0cf0, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0d05, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoTextChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0d17, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0d27, code lost:
    
        r1 = r2.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0d2b, code lost:
    
        if (r1 == null) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0d2d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0d40, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerChannel, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0d50, code lost:
    
        r2 = r29.replyMessageObject;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0d52, code lost:
    
        if (r2 != null) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0d54, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d6c, code lost:
    
        if (r2.isMusic() == false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0d6e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedMusic, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0d84, code lost:
    
        if (r2.isVideo() == false) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0d8e, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.messageOwner.message) != false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0d90, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r3, "📹 " + r2.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0dbb, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVideo, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0dd4, code lost:
    
        if (r2.isGif() == false) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0dde, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.messageOwner.message) != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0de0, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r3, "🎬 " + r2.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0e0b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGif, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0e27, code lost:
    
        if (r2.isVoice() == false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0e29, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedVoice, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0e3f, code lost:
    
        if (r2.isRoundVideo() == false) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0e41, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedRound, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0e57, code lost:
    
        if (r2.isSticker() != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0e5d, code lost:
    
        if (r2.isAnimatedSticker() == false) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0e63, code lost:
    
        r7 = r2.messageOwner;
        r8 = r7.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0e69, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0e71, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0e73, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r3, "📎 " + r2.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0e9e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedFile, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0eb5, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0eb9, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0ec2, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0ec4, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeoLive, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0edb, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0edd, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r29.messageOwner.media;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedContact2, r3, getTitle(r4), org.telegram.messenger.ContactsController.formatName(r1.first_name, r1.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0f05, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0f07, code lost:
    
        r8 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0f0d, code lost:
    
        if (r8.poll.quiz == false) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0f0f, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedQuiz2, r3, getTitle(r4), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0f2d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPoll2, r3, getTitle(r4), r8.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0f4d, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0f4f, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedTodo2, r3, getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r8).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0f71, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0f79, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0f7b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedText, r3, "🖼 " + r2.messageOwner.message, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0fa6, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedPhoto, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0fc0, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0fc2, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGame, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0fd4, code lost:
    
        r1 = r2.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0fd6, code lost:
    
        if (r1 == null) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0fdc, code lost:
    
        if (r1.length() <= 0) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0fde, code lost:
    
        r1 = r2.messageText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0fe4, code lost:
    
        if (r1.length() <= 20) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0fe6, code lost:
    
        r2 = new java.lang.StringBuilder();
        r7 = 0;
        r2.append((java.lang.Object) r1.subSequence(0, 20));
        r2.append("...");
        r1 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0ffc, code lost:
    
        r2 = org.telegram.messenger.R.string.NotificationActionPinnedText;
        r4 = getTitle(r4);
        r5 = new java.lang.Object[3];
        r5[r7] = r3;
        r5[1] = r1;
        r5[2] = r4;
        r1 = org.telegram.messenger.LocaleController.formatString(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0ffb, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x1013, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedNoText, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x1028, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedGeo, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x103a, code lost:
    
        r1 = r2.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x103e, code lost:
    
        if (r1 == null) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x1040, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedStickerEmoji, r3, getTitle(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x1056, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationActionPinnedSticker, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x106b, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGameScore) == false) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x106d, code lost:
    
        r1 = r29.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x1077, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x1079, code lost:
    
        r1 = org.telegram.messenger.utils.tlutils.TlUtils.getThemeEmoticonOrGiftTitle(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r5).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x1085, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x1089, code lost:
    
        if (r7 != r19) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x108b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeDisabledYou, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x1096, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString("ChatThemeDisabled", org.telegram.messenger.R.string.ChatThemeDisabled, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x10ad, code lost:
    
        if (r7 != r19) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x10af, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedYou, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x10bb, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChatThemeChangedTo, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x10cc, code lost:
    
        if ((r5 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByRequest) == false) goto L861;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x10ce, code lost:
    
        r1 = r29.messageText.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x10de, code lost:
    
        if (r2.peer_id.channel_id == 0) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x10e2, code lost:
    
        if (r4.megagroup != false) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x10e8, code lost:
    
        if (r29.isVideoAvatar() == false) goto L657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x10ea, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelVideoEditNotification, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x10fc, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelPhotoEditNotification, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x1113, code lost:
    
        if (r29.isVideoAvatar() == false) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x1115, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupVideo, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x1129, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationEditedGroupPhoto, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x1141, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r4) == false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x1145, code lost:
    
        if (r4.megagroup != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x114b, code lost:
    
        if (r29.isMediaEmpty() == false) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x114d, code lost:
    
        if (r30 != false) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x1157, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageOwner.message) != false) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x1159, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r3, r29.messageOwner.message);
        r31[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x1170, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageNoText, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x1182, code lost:
    
        if (r29.type != 29) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x118a, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r29) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x118c, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", (int) ((org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.MessageObject.getMedia(r29)).stars_amount, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x11a7, code lost:
    
        r2 = r29.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x11ad, code lost:
    
        if ((r2.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x11af, code lost:
    
        if (r30 != false) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x11b7, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x11b9, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r3, "🖼 " + r29.messageOwner.message);
        r31[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x11df, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessagePhoto, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x11f1, code lost:
    
        if (r29.isVideo() == false) goto L692;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x11f3, code lost:
    
        if (r30 != false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x11fd, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageOwner.message) != false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x11ff, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r3, "📹 " + r29.messageOwner.message);
        r31[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x1225, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageVideo, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x1239, code lost:
    
        if (r29.isVoice() == false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x123b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageAudio, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x124b, code lost:
    
        if (r29.isRoundVideo() == false) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x124d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageRound, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x125d, code lost:
    
        if (r29.isMusic() == false) goto L701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x125f, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageMusic, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x126b, code lost:
    
        r2 = r29.messageOwner.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x1271, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L704;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x1273, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r2;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageContact2, r3, org.telegram.messenger.ContactsController.formatName(r2.first_name, r2.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x1290, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L710;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x1292, code lost:
    
        r1 = ((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r2).poll;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x1298, code lost:
    
        if (r1.quiz == false) goto L709;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x129a, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageQuiz2, r3, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x12af, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessagePoll2, r3, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x12c6, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x12c8, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageTodo2, r3, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r2).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x12e3, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x12e5, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) r2;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageChannelGiveaway, getTitle(r4), java.lang.Integer.valueOf(r2.quantity), java.lang.Integer.valueOf(r2.months));
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x130d, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x1311, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L721;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x1319, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x131b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageLiveLocation, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x132b, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x1331, code lost:
    
        if (r29.isSticker() != false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x1337, code lost:
    
        if (r29.isAnimatedSticker() == false) goto L731;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1341, code lost:
    
        if (r29.isGif() == false) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x1343, code lost:
    
        if (r30 != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x134d, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageOwner.message) != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x134f, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r3, "🎬 " + r29.messageOwner.message);
        r31[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x1375, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageGIF, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x1383, code lost:
    
        if (r30 != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x138d, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageOwner.message) != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x138f, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r3, "📎 " + r29.messageOwner.message);
        r31[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x13b5, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageDocument, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x13c3, code lost:
    
        r1 = r29.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x13c7, code lost:
    
        if (r1 == null) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x13c9, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageStickerEmoji, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x13d8, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageSticker, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x13e5, code lost:
    
        if (r30 != false) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x13ed, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageText) != false) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x13ef, code lost:
    
        r15 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageText, r3, r29.messageText);
        r31[0] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x1403, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageNoText, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x1410, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.ChannelMessageMap, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x1420, code lost:
    
        if (r29.isMediaEmpty() == false) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x1422, code lost:
    
        if (r30 != false) goto L760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x142c, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageOwner.message) != false) goto L760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x142e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r3, getTitle(r4), r29.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x144a, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupNoText, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x1463, code lost:
    
        if (r29.type != 29) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x146b, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r29) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x146d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralString("NotificationChatMessagePaidMedia", (int) ((org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.MessageObject.getMedia(r29)).stars_amount, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x148b, code lost:
    
        r2 = r29.messageOwner;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x1491, code lost:
    
        if ((r2.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1493, code lost:
    
        if (r30 != false) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x149b, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x149d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r3, getTitle(r4), "🖼 " + r29.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x14c8, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupPhoto, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x14e1, code lost:
    
        if (r29.isVideo() == false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x14e3, code lost:
    
        if (r30 != false) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x14ed, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageOwner.message) != false) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x14ef, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r3, getTitle(r4), "📹 " + r29.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x151a, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupVideo, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1536, code lost:
    
        if (r29.isVoice() == false) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1538, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupAudio, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x154e, code lost:
    
        if (r29.isRoundVideo() == false) goto L786;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x1550, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupRound, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x1566, code lost:
    
        if (r29.isMusic() == false) goto L789;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x1568, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupMusic, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x157a, code lost:
    
        r2 = r29.messageOwner.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x1580, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x1582, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r2;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupContact2, r3, getTitle(r4), org.telegram.messenger.ContactsController.formatName(r2.first_name, r2.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x15a6, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x15a8, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x15ae, code lost:
    
        if (r2.poll.quiz == false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x15b0, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupQuiz2, r3, getTitle(r4), r2.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x15ce, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupPoll2, r3, getTitle(r4), r2.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x15ee, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x15f0, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupTodo2, r3, getTitle(r4), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r2).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x1612, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x1614, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupGame, r3, getTitle(r4), r29.messageOwner.media.game.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x1636, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x1638, code lost:
    
        r2 = (org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) r2;
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageChannelGiveaway, getTitle(r4), java.lang.Integer.valueOf(r2.quantity), java.lang.Integer.valueOf(r2.months));
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x1661, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x1663, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.BoostingGiveawayResults, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x166f, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L814;
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x1673, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x167c, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x167e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupLiveLocation, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x1695, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x169b, code lost:
    
        if (r29.isSticker() != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x16a1, code lost:
    
        if (r29.isAnimatedSticker() == false) goto L825;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x16ab, code lost:
    
        if (r29.isGif() == false) goto L832;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x16ad, code lost:
    
        if (r30 != false) goto L831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x16b7, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageOwner.message) != false) goto L831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x16b9, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r3, getTitle(r4), "🎬 " + r29.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x16e4, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupGif, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x16f9, code lost:
    
        if (r30 != false) goto L836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x1703, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageOwner.message) != false) goto L836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x1705, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r3, getTitle(r4), "📎 " + r29.messageOwner.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x1730, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupDocument, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x1745, code lost:
    
        r1 = r29.getStickerEmoji();
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x1749, code lost:
    
        if (r1 == null) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x174b, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupStickerEmoji, r3, getTitle(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x1761, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupSticker, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x1774, code lost:
    
        if (r30 != false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x177c, code lost:
    
        if (android.text.TextUtils.isEmpty(r29.messageText) != false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x177e, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupText, r3, getTitle(r4), r29.messageText);
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x1798, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.NotificationMessageGroupNoText, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x17ad, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString("NotificationMessageGroupMap", org.telegram.messenger.R.string.NotificationMessageGroupMap, r3, getTitle(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x06df, code lost:
    
        if (r6.getBoolean(r25, r11) != false) goto L333;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getStringForMessage(MessageObject messageObject, boolean z, boolean[] zArr, boolean[] zArr2) {
        String str;
        String str2;
        String string;
        TLRPC.Chat chat;
        String formatString;
        String str3;
        char c;
        boolean z2;
        String formatString2;
        String str4;
        String string2;
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
        boolean z3 = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + j, true);
        if (messageObject.isFcmMessage()) {
            if (j2 == 0 && j3 != 0) {
                if (!z3 || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    return LocaleController.formatString(R.string.NotificationMessageNoText, messageObject.localName);
                }
            } else if (j2 != 0 && (!z3 || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true))))) {
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
        if (messageObject.getDialogId() == UserObject.OAUTH || messageObject.isOauthPush) {
            str = "EnablePreviewChannel";
            str2 = "EnablePreviewGroup";
            string = LocaleController.getString(R.string.BotAuthNotificationTitle);
        } else if (j3 > 0) {
            if (messageObject.messageOwner.from_scheduled) {
                if (j == clientUserId) {
                    string2 = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                } else {
                    string2 = LocaleController.getString(R.string.NotificationMessageScheduledName);
                }
                str2 = "EnablePreviewGroup";
                String str5 = string2;
                str = "EnablePreviewChannel";
                string = str5;
            } else {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    str = "EnablePreviewChannel";
                    str2 = "EnablePreviewGroup";
                    string = UserObject.getUserName(user);
                } else {
                    str = "EnablePreviewChannel";
                    str2 = "EnablePreviewGroup";
                    string = null;
                }
            }
        } else {
            str = "EnablePreviewChannel";
            str2 = "EnablePreviewGroup";
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
            if (chat2 != null) {
                string = getTitle(chat2);
            }
            string = null;
        }
        if (string == null) {
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
            String str6 = str2;
            String str7 = str;
            if (j2 != 0 || j3 == 0) {
                if (j2 != 0) {
                    boolean z4 = ChatObject.isChannel(chat) && !chat.megagroup;
                    if (z3) {
                        boolean z5 = !z4 ? true : true;
                        if (z4) {
                        }
                    }
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        formatString = LocaleController.formatString(R.string.ChannelMessageNoText, string);
                    } else if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        formatString = LocaleController.formatPluralString("NotificationMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, string);
                    } else {
                        formatString = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                    }
                }
                str3 = null;
            } else if (z3 && notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                TLRPC.Message message2 = messageObject.messageOwner;
                if (message2 instanceof TLRPC.TL_messageService) {
                    TLRPC.MessageAction messageAction = message2.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionChangeCreator) || (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending)) {
                        formatString = messageObject.messageText.toString();
                    } else if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
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
                        formatString = LocaleController.formatString(R.string.NotificationContactJoined, string);
                    } else if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        formatString = LocaleController.formatString(R.string.NotificationContactNewPhoto, string);
                    } else if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                        String formatString3 = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(messageObject.messageOwner.date * 1000), LocaleController.getInstance().getFormatterDay().format(messageObject.messageOwner.date * 1000));
                        int i = R.string.NotificationUnrecognizedDevice;
                        String str8 = getUserConfig().getCurrentUser().first_name;
                        TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                        formatString = LocaleController.formatString(i, str8, formatString3, messageAction2.title, messageAction2.address);
                    } else if ((messageAction instanceof TLRPC.TL_messageActionGameScore) || (messageAction instanceof TLRPC.TL_messageActionPaymentSent) || (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe)) {
                        formatString = messageObject.messageText.toString();
                    } else if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionGiftPremium) || (messageAction instanceof TLRPC.TL_messageActionGiftTon)) {
                        formatString = messageObject.messageText.toString();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        formatString = messageObject.messageText.toString();
                    } else if (messageAction instanceof TLRPC.TL_messageActionSuggestBirthday) {
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
                                z2 = true;
                                if (j == clientUserId) {
                                    formatString2 = LocaleController.formatString(R.string.ChatThemeChangedYou, themeEmoticonOrGiftTitle);
                                } else {
                                    formatString2 = LocaleController.formatString(R.string.ChatThemeChangedTo, string, themeEmoticonOrGiftTitle);
                                }
                            } else {
                                if (j == clientUserId) {
                                    c = 0;
                                    str4 = LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]);
                                    z2 = true;
                                    zArr[c] = z2;
                                    return str4;
                                }
                                c = 0;
                                z2 = true;
                                formatString2 = LocaleController.formatString(R.string.ChatThemeDisabled, string, themeEmoticonOrGiftTitle);
                            }
                            str4 = formatString2;
                            zArr[c] = z2;
                            return str4;
                        }
                        str3 = null;
                    }
                } else if (!messageObject.isMediaEmpty()) {
                    TLRPC.Message message3 = messageObject.messageOwner;
                    if (message3.media instanceof TLRPC.TL_messageMediaPhoto) {
                        if (!z && !TextUtils.isEmpty(message3.message)) {
                            String formatString4 = LocaleController.formatString(R.string.NotificationMessageText, string, "🖼 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return formatString4;
                        }
                        if (messageObject.messageOwner.media.ttl_seconds != 0) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageSDPhoto, string);
                        } else {
                            formatString = LocaleController.formatString(R.string.NotificationMessagePhoto, string);
                        }
                    } else if (messageObject.isVideo()) {
                        if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            String formatString5 = LocaleController.formatString(R.string.NotificationMessageText, string, "📹 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return formatString5;
                        }
                        if (messageObject.messageOwner.media.ttl_seconds != 0) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageSDVideo, string);
                        } else {
                            formatString = LocaleController.formatString(R.string.NotificationMessageVideo, string);
                        }
                    } else if (messageObject.isGame()) {
                        formatString = LocaleController.formatString(R.string.NotificationMessageGame, string, messageObject.messageOwner.media.game.title);
                    } else if (messageObject.isVoice()) {
                        formatString = LocaleController.formatString(R.string.NotificationMessageAudio, string);
                    } else if (messageObject.isRoundVideo()) {
                        formatString = LocaleController.formatString(R.string.NotificationMessageRound, string);
                    } else if (messageObject.isMusic()) {
                        formatString = LocaleController.formatString(R.string.NotificationMessageMusic, string);
                    } else {
                        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                            TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageMedia;
                            formatString = LocaleController.formatString(R.string.NotificationMessageContact2, string, ContactsController.formatName(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                            formatString = LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, string, Integer.valueOf(tL_messageMediaGiveaway.quantity), Integer.valueOf(tL_messageMediaGiveaway.months));
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            formatString = LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                            if (poll.quiz) {
                                formatString = LocaleController.formatString(R.string.NotificationMessageQuiz2, string, poll.question.text);
                            } else {
                                formatString = LocaleController.formatString(R.string.NotificationMessagePoll2, string, poll.question.text);
                            }
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageTodo2, string, ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                        } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageMap, string);
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
                            formatString = LocaleController.formatString(R.string.NotificationMessageLiveLocation, string);
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                            if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                                String stickerEmoji = messageObject.getStickerEmoji();
                                if (stickerEmoji != null) {
                                    formatString = LocaleController.formatString(R.string.NotificationMessageStickerEmoji, string, stickerEmoji);
                                } else {
                                    formatString = LocaleController.formatString(R.string.NotificationMessageSticker, string);
                                }
                            } else if (messageObject.isGif()) {
                                if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    String formatString6 = LocaleController.formatString(R.string.NotificationMessageText, string, "🎬 " + messageObject.messageOwner.message);
                                    zArr[0] = true;
                                    return formatString6;
                                }
                                formatString = LocaleController.formatString(R.string.NotificationMessageGif, string);
                            } else {
                                if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    String formatString7 = LocaleController.formatString(R.string.NotificationMessageText, string, "📎 " + messageObject.messageOwner.message);
                                    zArr[0] = true;
                                    return formatString7;
                                }
                                formatString = LocaleController.formatString(R.string.NotificationMessageDocument, string);
                            }
                        } else {
                            if (!z && !TextUtils.isEmpty(messageObject.messageText)) {
                                String formatString8 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageText);
                                zArr[0] = true;
                                return formatString8;
                            }
                            formatString = LocaleController.formatString(R.string.NotificationMessageNoText, string);
                        }
                    }
                } else if (!z) {
                    if (!TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        String formatString9 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageOwner.message);
                        zArr[0] = true;
                        return formatString9;
                    }
                    formatString = LocaleController.formatString(R.string.NotificationMessageNoText, string);
                } else {
                    formatString = LocaleController.formatString(R.string.NotificationMessageNoText, string);
                }
            } else {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                formatString = LocaleController.formatString(R.string.NotificationMessageNoText, string);
            }
            return str3;
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
    public /* synthetic */ void lambda$showNotifications$34() {
        showOrUpdateNotification(false);
    }

    public void showNotifications() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda75
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$showNotifications$34();
            }
        });
    }

    public void hideNotifications() {
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$hideNotifications$35();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideNotifications$35() {
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
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.lambda$dismissNotification$36();
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dismissNotification$36() {
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
            notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationsController.this.lambda$playInChatSound$38();
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playInChatSound$38() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundPlay) <= 500) {
            return;
        }
        try {
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda65
                    @Override // android.media.SoundPool.OnLoadCompleteListener
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.lambda$playInChatSound$37(soundPool2, i, i2);
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
    public static /* synthetic */ void lambda$playInChatSound$37(SoundPool soundPool, int i, int i2) {
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$repeatNotificationMaybe$39();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repeatNotificationMaybe$39() {
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
    public void lambda$deleteNotificationChannel$40(long j, long j2, int i) {
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$deleteNotificationChannel$40(j, j2, i);
            }
        });
    }

    public void deleteNotificationChannelGlobal(int i) {
        deleteNotificationChannelGlobal(i, -1);
    }

    /* renamed from: deleteNotificationChannelGlobalInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$deleteNotificationChannelGlobal$41(int i, int i2) {
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda59
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$deleteNotificationChannelGlobal$41(i, i2);
            }
        });
    }

    public void deleteAllNotificationChannels() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$deleteAllNotificationChannels$42();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllNotificationChannels$42() {
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
                    NotificationChannel m = NotificationsController$$ExternalSyntheticApiModelOutline15.m(notificationChannels.get(i));
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
            id2 = NotificationsController$$ExternalSyntheticApiModelOutline18.m(notificationChannelGroups.get(i2)).getId();
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x05db A[LOOP:1: B:99:0x05d8->B:101:0x05db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x060d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x058b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05ca A[ADDED_TO_REGION] */
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

    /* JADX WARN: Can't wrap try/catch for region: R(54:133|134|135|(3:556|557|(1:559)(4:(1:(2:569|(1:571)(1:572))(1:563))(1:573)|564|(1:566)(1:568)|567))(4:138|(4:140|(7:142|(2:144|(1:146))(1:164)|149|(1:151)|152|(1:163)(2:(1:156)(2:159|(1:161)(1:162))|157)|158)(1:165)|147|148)|166|167)|(49:175|(48:177|(1:553)(3:180|(1:182)(1:552)|(2:184|(1:186)(2:544|(1:546)(2:547|(1:549)(1:550))))(1:551))|(2:189|(40:191|192|(4:194|(1:196)(1:540)|197|(1:199)(1:539))(1:541)|200|(5:530|531|(1:533)(1:538)|534|(1:536)(1:537))(1:(1:(3:206|(1:208)(1:507)|209)(3:508|(1:510)(1:512)|511))(2:513|(5:(1:516)(1:528)|517|(1:519)(2:(1:525)(1:527)|526)|520|(1:522)(1:523))(33:529|(1:212)(1:506)|213|(1:505)(1:217)|218|(1:221)|(1:225)|(1:504)(1:229)|(6:231|(1:233)|234|(1:236)|237|(1:239)(1:240))|(3:244|245|(1:249))|(1:255)(1:503)|256|(1:258)|259|260|(1:262)(2:441|(2:(1:444)(2:446|(1:448))|445)(20:449|(4:451|(2:454|452)|455|456)(18:459|(5:461|(1:(1:464)(2:465|(1:467)))|468|(1:497)(2:472|(16:(2:477|(1:485))(2:486|(2:488|(1:496)))|265|(1:272)|273|274|275|(1:277)|278|(3:280|281|282)(1:437)|283|(1:285)(1:(12:421|(1:423)(3:424|425|(4:427|(1:429)(1:434)|430|(1:432)))|287|(2:417|418)(1:(4:292|293|(1:295)|397)(2:398|(4:413|414|(1:416)|397)(3:402|(2:404|(1:406))(2:407|(2:409|(2:411|412)))|397)))|(1:396)(7:(3:391|(1:393)(1:395)|394)|(2:305|(8:307|(1:(5:313|(1:315)(1:372)|316|(1:318)(2:359|(1:361)(7:(2:370|371)(2:365|(1:367)(1:368))|369|321|(1:358)(4:329|(4:331|(3:333|(4:335|(1:337)(1:341)|338|339)(2:342|343)|340)|344|345)|346|347)|(1:355)|356|357))|319)(6:373|374|(0)(0)|316|(0)(0)|319))|375|374|(0)(0)|316|(0)(0)|319)(2:376|(1:378)(3:379|(2:381|(2:385|386))|389)))|390|(0)(0)|316|(0)(0)|319)|320|321|(1:323)|358|(4:349|351|353|355)|356|357))|286|287|(1:289)|417|418))|458)(2:498|(1:502))|264|265|(3:268|270|272)|273|274|275|(0)|278|(0)(0)|283|(0)(0)|286|287|(0)|417|418)|457|458|264|265|(0)|273|274|275|(0)|278|(0)(0)|283|(0)(0)|286|287|(0)|417|418))|263|264|265|(0)|273|274|275|(0)|278|(0)(0)|283|(0)(0)|286|287|(0)|417|418)))|210|(0)(0)|213|(1:215)|505|218|(1:221)|(2:223|225)|(0)|504|(0)|(4:242|244|245|(2:247|249))|(0)(0)|256|(0)|259|260|(0)(0)|263|264|265|(0)|273|274|275|(0)|278|(0)(0)|283|(0)(0)|286|287|(0)|417|418))(1:543)|542|192|(0)(0)|200|(1:202)|530|531|(0)(0)|534|(0)(0)|210|(0)(0)|213|(0)|505|218|(0)|(0)|(0)|504|(0)|(0)|(0)(0)|256|(0)|259|260|(0)(0)|263|264|265|(0)|273|274|275|(0)|278|(0)(0)|283|(0)(0)|286|287|(0)|417|418)(1:554)|187|(0)(0)|542|192|(0)(0)|200|(0)|530|531|(0)(0)|534|(0)(0)|210|(0)(0)|213|(0)|505|218|(0)|(0)|(0)|504|(0)|(0)|(0)(0)|256|(0)|259|260|(0)(0)|263|264|265|(0)|273|274|275|(0)|278|(0)(0)|283|(0)(0)|286|287|(0)|417|418)|555|(0)(0)|187|(0)(0)|542|192|(0)(0)|200|(0)|530|531|(0)(0)|534|(0)(0)|210|(0)(0)|213|(0)|505|218|(0)|(0)|(0)|504|(0)|(0)|(0)(0)|256|(0)|259|260|(0)(0)|263|264|265|(0)|273|274|275|(0)|278|(0)(0)|283|(0)(0)|286|287|(0)|417|418) */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0c9c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0bda, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0bf7, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x03dd, code lost:
    
        if (r3 == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x03df, code lost:
    
        r4 = org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.NotificationHiddenChatName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x03e6, code lost:
    
        r4 = org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.NotificationHiddenName);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f9 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0417 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0735 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x077b A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x081b A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x095b A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x096b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0971 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x097e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x098a A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x09fa A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a08 A[Catch: Exception -> 0x0061, TRY_ENTER, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0b92 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0bd2 A[Catch: all -> 0x0bda, TryCatch #2 {all -> 0x0bda, blocks: (B:275:0x0bb7, B:277:0x0bd2, B:278:0x0bdd, B:282:0x0be5, B:283:0x0bed), top: B:274:0x0bb7 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0bfc A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0da9 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0db9 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a26 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0915 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0922 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x05f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x040c A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0146 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:12:0x0036, B:13:0x0042, B:15:0x004a, B:19:0x005f, B:23:0x0068, B:25:0x0072, B:27:0x0082, B:29:0x0087, B:35:0x008c, B:38:0x0092, B:39:0x00a7, B:41:0x00af, B:43:0x00e6, B:45:0x0109, B:47:0x0111, B:49:0x011a, B:52:0x0121, B:54:0x0139, B:56:0x020b, B:57:0x023d, B:59:0x024f, B:61:0x0255, B:63:0x0259, B:65:0x0277, B:66:0x0280, B:69:0x0297, B:73:0x02a3, B:75:0x02af, B:76:0x02b5, B:78:0x02c0, B:80:0x02c6, B:82:0x02d4, B:83:0x02f3, B:85:0x0307, B:87:0x0317, B:89:0x031d, B:91:0x0357, B:93:0x0374, B:97:0x0396, B:99:0x039c, B:101:0x03ad, B:103:0x03b3, B:107:0x03bb, B:110:0x03cb, B:115:0x03f5, B:117:0x03f9, B:123:0x0417, B:125:0x0420, B:127:0x0428, B:128:0x0456, B:130:0x0461, B:134:0x04e0, B:138:0x0505, B:140:0x0529, B:142:0x0541, B:144:0x0545, B:148:0x05bc, B:151:0x0557, B:152:0x055d, B:156:0x056a, B:158:0x05b2, B:159:0x0581, B:161:0x0588, B:162:0x059c, B:167:0x05cb, B:170:0x0656, B:180:0x0671, B:182:0x068b, B:184:0x06c4, B:186:0x06ce, B:189:0x0735, B:192:0x075b, B:194:0x077b, B:196:0x07bd, B:197:0x07db, B:199:0x07ed, B:200:0x0812, B:202:0x081b, B:206:0x0829, B:208:0x0839, B:209:0x084e, B:213:0x0955, B:215:0x095b, B:223:0x0971, B:225:0x0977, B:231:0x098a, B:234:0x0994, B:237:0x099d, B:253:0x09bc, B:256:0x09c9, B:258:0x09fa, B:259:0x0a01, B:262:0x0a08, B:265:0x0b3b, B:268:0x0b94, B:270:0x0b98, B:272:0x0b9e, B:285:0x0bfc, B:293:0x0c61, B:299:0x0ca9, B:303:0x0cea, B:305:0x0cf2, B:307:0x0cf6, B:309:0x0cfe, B:313:0x0d09, B:315:0x0da9, B:318:0x0db9, B:321:0x0dfe, B:323:0x0e04, B:325:0x0e08, B:327:0x0e13, B:329:0x0e19, B:331:0x0e23, B:333:0x0e34, B:335:0x0e42, B:337:0x0e61, B:338:0x0e6b, B:340:0x0e9e, B:345:0x0eb0, B:349:0x0ed3, B:351:0x0ed9, B:353:0x0ee1, B:355:0x0ee7, B:356:0x0f09, B:361:0x0dc6, B:367:0x0dda, B:371:0x0de8, B:373:0x0d33, B:375:0x0d3a, B:376:0x0d3d, B:378:0x0d49, B:381:0x0d54, B:383:0x0d5c, B:388:0x0d95, B:389:0x0d9e, B:391:0x0cb5, B:393:0x0cbd, B:394:0x0ce5, B:396:0x0df0, B:404:0x0c76, B:409:0x0c84, B:414:0x0c8d, B:418:0x0c97, B:421:0x0c04, B:423:0x0c11, B:440:0x0bf7, B:441:0x0a26, B:444:0x0a2c, B:445:0x0a43, B:448:0x0a3c, B:449:0x0a58, B:451:0x0a6d, B:452:0x0a78, B:454:0x0a80, B:456:0x0a8f, B:459:0x0a9b, B:461:0x0aa3, B:464:0x0ab2, B:467:0x0abc, B:468:0x0abf, B:470:0x0ac5, B:472:0x0ace, B:474:0x0ad7, B:477:0x0adf, B:479:0x0ae5, B:481:0x0ae9, B:483:0x0af1, B:488:0x0afd, B:490:0x0b03, B:492:0x0b07, B:494:0x0b0f, B:498:0x0b1a, B:500:0x0b2b, B:502:0x0b31, B:507:0x0846, B:508:0x086d, B:510:0x087d, B:511:0x0892, B:512:0x088a, B:517:0x08bc, B:519:0x08c4, B:520:0x08de, B:526:0x08d8, B:531:0x0909, B:533:0x0915, B:534:0x092a, B:538:0x0922, B:540:0x07c9, B:544:0x06e6, B:546:0x06f9, B:547:0x0705, B:549:0x0709, B:557:0x05e0, B:563:0x05f9, B:564:0x063b, B:567:0x0644, B:569:0x060d, B:571:0x0612, B:572:0x0626, B:574:0x0470, B:577:0x047d, B:579:0x049a, B:580:0x0435, B:583:0x0401, B:585:0x040c, B:588:0x03df, B:590:0x03e6, B:591:0x03ed, B:594:0x03a3, B:595:0x03a8, B:600:0x032c, B:602:0x0332, B:607:0x02e1, B:609:0x0294, B:611:0x0146, B:613:0x014c, B:614:0x014f, B:617:0x0158, B:618:0x0161, B:619:0x0174, B:621:0x017b, B:622:0x0195, B:624:0x019c, B:626:0x01a4, B:627:0x01db, B:628:0x012c, B:630:0x022d, B:245:0x09ad, B:386:0x0d66), top: B:11:0x0036, inners: #1, #3 }] */
    /* JADX WARN: Type inference failed for: r12v60, types: [org.telegram.messenger.MessageObject] */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r2v71, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v74, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v76, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v47, types: [android.net.Uri] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showOrUpdateNotification(boolean z) {
        String str;
        String str2;
        int i;
        MessageObject messageObject;
        Bitmap bitmap;
        long j;
        String str3;
        String str4;
        String str5;
        long j2;
        TLRPC.Chat chat;
        boolean z2;
        long j3;
        boolean z3;
        String userName;
        boolean z4;
        boolean equalsIgnoreCase;
        String str6;
        boolean z5;
        String str7;
        String string;
        TLRPC.User user;
        boolean z6;
        String str8;
        long j4;
        String str9;
        String str10;
        String str11;
        NotificationCompat.Builder builder;
        boolean z7;
        NotificationCompat.Builder builder2;
        SharedPreferences sharedPreferences;
        String str12;
        MessageObject messageObject2;
        String stringForMessage;
        String str13;
        String str14;
        String str15;
        boolean z8;
        boolean z9;
        String str16;
        boolean z10;
        String str17;
        long j5;
        SharedPreferences sharedPreferences2;
        String str18;
        long j6;
        boolean z11;
        boolean z12;
        TLRPC.Chat chat2;
        NotificationCompat.Builder builder3;
        String str19;
        int i2;
        String str20;
        int i3;
        Integer num;
        boolean z13;
        long j7;
        boolean z14;
        long j8;
        String string2;
        boolean z15;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str21;
        boolean z16;
        boolean z17;
        boolean z18;
        int i10;
        int i11;
        int i12;
        String str22;
        String str23;
        int i13;
        int i14;
        NotificationsController notificationsController;
        boolean z19;
        Object obj;
        TLRPC.Chat chat3;
        TLRPC.User user2;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        TLRPC.FileLocation fileLocation3;
        String str24;
        NotificationCompat.Builder builder4;
        long[] jArr;
        boolean z20;
        int i15;
        int i16;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        int i17;
        long j9;
        boolean z21;
        TLRPC.ReplyMarkup replyMarkup;
        int i18;
        TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow;
        int i19;
        MessageObject messageObject3;
        int i20;
        long j10;
        int i21;
        long[] jArr5;
        int i22;
        ?? r2;
        int i23;
        String str25;
        int ringerMode;
        String propertyString;
        boolean z22;
        int i24;
        int i25;
        String str26;
        int i26;
        boolean z23;
        String replace;
        int i27;
        String formatPluralString;
        String str27 = "file://";
        if (!getUserConfig().isClientActivated() || ((this.pushMessages.isEmpty() && this.storyPushMessages.isEmpty()) || (!SharedConfig.showNotificationsForAllAccounts && this.currentAccount != UserConfig.selectedAccount))) {
            dismissNotification();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            long j11 = 0;
            StoryNotification storyNotification = null;
            for (int i28 = 0; i28 < this.pushMessages.size(); i28++) {
                MessageObject messageObject4 = this.pushMessages.get(i28);
                long j12 = messageObject4.messageOwner.date;
                if (j11 < j12) {
                    j11 = j12;
                    storyNotification = messageObject4;
                }
            }
            StoryNotification storyNotification2 = storyNotification;
            for (int i29 = 0; i29 < this.storyPushMessages.size(); i29++) {
                StoryNotification storyNotification3 = this.storyPushMessages.get(i29);
                long j13 = storyNotification3.date;
                if (j11 < j13 / 1000) {
                    j11 = j13 / 1000;
                    storyNotification2 = storyNotification3;
                }
            }
            if (storyNotification2 == null) {
                return;
            }
            if (!(storyNotification2 instanceof StoryNotification)) {
                str = "file://";
                str2 = "userId";
                i = 0;
                messageObject = this.pushMessages.get(0);
                bitmap = null;
            } else {
                StoryNotification storyNotification4 = storyNotification2;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                str2 = "userId";
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                int i30 = 0;
                int i31 = 0;
                boolean z24 = false;
                while (i31 < this.storyPushMessages.size()) {
                    z24 |= this.storyPushMessages.get(i31).hidden;
                    tL_message.date = Math.min(tL_message.date, (int) (this.storyPushMessages.get(i31).date / 1000));
                    i30 += this.storyPushMessages.get(i31).dateByIds.size();
                    i31++;
                    str27 = str27;
                }
                str = str27;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j14 = storyNotification4.dialogId;
                tL_peerUser.user_id = j14;
                tL_message.dialog_id = j14;
                tL_message.peer_id = tL_peerUser;
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<Object> arrayList2 = new ArrayList<>();
                parseStoryPushes(arrayList, arrayList2);
                Bitmap loadMultipleAvatars = SharedConfig.getDevicePerformanceClass() >= 1 ? loadMultipleAvatars(arrayList2) : null;
                if (!z24 && this.storyPushMessages.size() < 2 && !arrayList.isEmpty()) {
                    formatPluralString = arrayList.get(0);
                    i27 = 0;
                    if (!z24) {
                        tL_message.message = LocaleController.formatPluralString("StoryNotificationHidden", i30, new Object[i27]);
                    } else if (arrayList.isEmpty()) {
                        tL_message.message = "";
                    } else if (arrayList.size() == 1) {
                        if (i30 == 1) {
                            tL_message.message = LocaleController.getString("StoryNotificationSingle");
                        } else {
                            tL_message.message = LocaleController.formatPluralString("StoryNotification1", i30, arrayList.get(0));
                        }
                    } else if (arrayList.size() == 2) {
                        tL_message.message = LocaleController.formatString(R.string.StoryNotification2, arrayList.get(0), arrayList.get(1));
                    } else if (arrayList.size() == 3 && this.storyPushMessages.size() == 3) {
                        tL_message.message = LocaleController.formatString(R.string.StoryNotification3, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)), cutLastName(arrayList.get(2)));
                    } else {
                        tL_message.message = LocaleController.formatPluralString("StoryNotification4", this.storyPushMessages.size() - 2, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)));
                        MessageObject messageObject5 = new MessageObject(this.currentAccount, tL_message, tL_message.message, formatPluralString, formatPluralString, false, false, false, false);
                        messageObject5.isStoryPush = true;
                        messageObject = messageObject5;
                        bitmap = loadMultipleAvatars;
                        i = 0;
                    }
                    MessageObject messageObject52 = new MessageObject(this.currentAccount, tL_message, tL_message.message, formatPluralString, formatPluralString, false, false, false, false);
                    messageObject52.isStoryPush = true;
                    messageObject = messageObject52;
                    bitmap = loadMultipleAvatars;
                    i = 0;
                }
                i27 = 0;
                formatPluralString = LocaleController.formatPluralString("Stories", i30, new Object[0]);
                if (!z24) {
                }
                MessageObject messageObject522 = new MessageObject(this.currentAccount, tL_message, tL_message.message, formatPluralString, formatPluralString, false, false, false, false);
                messageObject522.isStoryPush = true;
                messageObject = messageObject522;
                bitmap = loadMultipleAvatars;
                i = 0;
            }
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            int i32 = notificationsSettings.getInt("dismissDate", i);
            if (!messageObject.isStoryPush && messageObject.messageOwner.date <= i32) {
                dismissNotification();
                return;
            }
            long dialogId = messageObject.getDialogId();
            long topicId = MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, getMessagesController().isForum(messageObject));
            boolean z25 = messageObject.isStoryPush;
            long fromChatId = messageObject.messageOwner.mentioned ? messageObject.getFromChatId() : dialogId;
            messageObject.getId();
            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
            long j15 = peer.chat_id;
            if (j15 == 0) {
                j15 = peer.channel_id;
            }
            long j16 = j15;
            long j17 = peer.user_id;
            if (messageObject.isFromUser() && (j17 == 0 || j17 == getUserConfig().getClientUserId())) {
                j17 = messageObject.messageOwner.from_id.user_id;
            }
            if (messageObject.getDialogId() != UserObject.VERIFY || messageObject.getForwardedFromId() == null) {
                j = j16;
                str3 = "";
            } else if (messageObject.getForwardedFromId().longValue() >= 0) {
                j17 = messageObject.getForwardedFromId().longValue();
                str3 = "";
                j = 0;
            } else {
                j = messageObject.getForwardedFromId().longValue();
                str3 = "";
                j17 = 0;
            }
            TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j17));
            if (j != 0) {
                long j18 = j17;
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(j));
                if (chat4 == null && messageObject.isFcmMessage()) {
                    chat = chat4;
                    z2 = messageObject.localChannel;
                    str4 = "com.android.systemui";
                    str5 = ".provider";
                    j3 = j18;
                } else if (!ChatObject.isChannel(chat4) || chat4.megagroup) {
                    chat = chat4;
                    str4 = "com.android.systemui";
                    str5 = ".provider";
                    j3 = j18;
                    z2 = false;
                } else {
                    chat = chat4;
                    str4 = "com.android.systemui";
                    str5 = ".provider";
                    j3 = j18;
                    z2 = true;
                }
                j2 = topicId;
            } else {
                str4 = "com.android.systemui";
                str5 = ".provider";
                j2 = topicId;
                chat = null;
                z2 = false;
                j3 = j17;
            }
            Bitmap bitmap2 = bitmap;
            long j19 = j;
            TLRPC.Chat chat5 = chat;
            String str28 = str3;
            int i33 = i32;
            int notifyOverride = getNotifyOverride(notificationsSettings, fromChatId, j2);
            if (notifyOverride == -1) {
                Boolean valueOf = Boolean.valueOf(z2);
                boolean z26 = messageObject.isReactionPush;
                z3 = isGlobalNotificationsEnabled(dialogId, valueOf, z26, z26);
            } else {
                z3 = notifyOverride != 2;
            }
            if (((j != 0 && chat5 == null) || user3 == null) && messageObject.isFcmMessage()) {
                userName = messageObject.localName;
            } else if (chat5 != null) {
                userName = getTitle(chat5);
            } else {
                userName = UserObject.getUserName(user3);
            }
            String str29 = userName;
            if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
                z4 = false;
                equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                if (!DialogObject.isEncryptedDialog(dialogId) && ((equalsIgnoreCase || this.pushDialogs.size() <= 1) && !z4)) {
                    str6 = str29;
                    z5 = true;
                    if (!messageObject.isReactionPush && !messageObject.isStoryReactionPush) {
                        str7 = str6;
                        string = str7;
                        if (equalsIgnoreCase) {
                            user = user3;
                            z6 = z25;
                            str8 = "currentAccount";
                            j4 = j3;
                            str9 = "chatId";
                            str10 = str28;
                        } else {
                            str8 = "currentAccount";
                            if (UserConfig.getActivatedAccountsCount() <= 1) {
                                str11 = str28;
                            } else if (this.pushDialogs.size() == 1) {
                                str11 = UserObject.getFirstName(getUserConfig().getCurrentUser());
                            } else {
                                str11 = UserObject.getFirstName(getUserConfig().getCurrentUser()) + "・";
                            }
                            user = user3;
                            if (this.pushDialogs.size() == 1 && Build.VERSION.SDK_INT >= 23) {
                                z6 = z25;
                                j4 = j3;
                                str9 = "chatId";
                                builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                                if (this.pushMessages.size() > 1 || equalsIgnoreCase) {
                                    z7 = z3;
                                    builder2 = builder;
                                    String str30 = str11;
                                    sharedPreferences = notificationsSettings;
                                    str12 = str28;
                                    boolean[] zArr = new boolean[1];
                                    messageObject2 = messageObject;
                                    stringForMessage = getStringForMessage(messageObject2, false, zArr, null);
                                    boolean isSilentMessage = isSilentMessage(messageObject2);
                                    if (stringForMessage != null) {
                                        return;
                                    }
                                    if (!z5) {
                                        str13 = stringForMessage;
                                    } else if (chat5 != null && !equalsIgnoreCase) {
                                        str13 = stringForMessage.replace(" @ " + string, str12);
                                    } else if (zArr[0]) {
                                        str13 = stringForMessage.replace(string + ": ", str12);
                                    } else {
                                        str13 = stringForMessage.replace(string + " ", str12);
                                    }
                                    builder2.setContentText(str13);
                                    String str31 = equalsIgnoreCase ? str13 : str30;
                                    builder2.setStyle(new NotificationCompat.BigTextStyle().bigText(str13));
                                    str14 = stringForMessage;
                                    str15 = str31;
                                    z8 = isSilentMessage;
                                } else {
                                    builder.setContentText(str11);
                                    NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                                    inboxStyle.setBigContentTitle(string);
                                    int min = Math.min(10, this.pushMessages.size());
                                    sharedPreferences = notificationsSettings;
                                    boolean[] zArr2 = new boolean[1];
                                    z7 = z3;
                                    int i34 = 0;
                                    ?? r14 = 2;
                                    String str32 = null;
                                    while (i34 < min) {
                                        int i35 = min;
                                        MessageObject messageObject6 = this.pushMessages.get(i34);
                                        NotificationCompat.Builder builder5 = builder;
                                        MessageObject messageObject7 = messageObject;
                                        String str33 = str11;
                                        String stringForMessage2 = getStringForMessage(messageObject6, false, zArr2, null);
                                        if (stringForMessage2 != null) {
                                            if (messageObject6.isStoryPush) {
                                                i26 = i33;
                                            } else {
                                                i26 = i33;
                                                if (messageObject6.messageOwner.date <= i26) {
                                                    str26 = str28;
                                                    z23 = r14;
                                                }
                                            }
                                            boolean z27 = r14;
                                            if (r14 == 2) {
                                                str32 = stringForMessage2;
                                                z27 = isSilentMessage(messageObject6);
                                            }
                                            if (this.pushDialogs.size() == 1 && z5) {
                                                if (chat5 != null) {
                                                    str26 = str28;
                                                    replace = stringForMessage2.replace(" @ " + string, str26);
                                                } else {
                                                    str26 = str28;
                                                    replace = zArr2[0] ? stringForMessage2.replace(string + ": ", str26) : stringForMessage2.replace(string + " ", str26);
                                                }
                                                stringForMessage2 = replace;
                                            } else {
                                                str26 = str28;
                                            }
                                            inboxStyle.addLine(stringForMessage2);
                                            z23 = z27;
                                        } else {
                                            str26 = str28;
                                            i26 = i33;
                                            z23 = r14;
                                        }
                                        i34++;
                                        i33 = i26;
                                        str28 = str26;
                                        min = i35;
                                        str11 = str33;
                                        messageObject = messageObject7;
                                        builder = builder5;
                                        r14 = z23;
                                    }
                                    NotificationCompat.Builder builder6 = builder;
                                    str15 = str11;
                                    str12 = str28;
                                    inboxStyle.setSummaryText(str15);
                                    builder2 = builder6;
                                    builder2.setStyle(inboxStyle);
                                    str14 = str32;
                                    messageObject2 = messageObject;
                                    z8 = r14;
                                }
                                if (z && z7 && !MediaController.getInstance().isRecordingAudio() && !z8) {
                                    z9 = false;
                                    if (z9) {
                                        j5 = dialogId;
                                        if (j5 != fromChatId || chat5 == null) {
                                            str16 = str15;
                                            str18 = str14;
                                            z10 = z9;
                                            str17 = str12;
                                            sharedPreferences2 = sharedPreferences;
                                        } else {
                                            sharedPreferences2 = sharedPreferences;
                                            if (sharedPreferences2.getBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + j5, false)) {
                                                i25 = sharedPreferences2.getInt("smart_max_count_" + j5, 2);
                                                StringBuilder sb = new StringBuilder();
                                                z10 = z9;
                                                sb.append("smart_delay_");
                                                sb.append(j5);
                                                i24 = sharedPreferences2.getInt(sb.toString(), NotificationCenter.needDeleteDialog);
                                            } else {
                                                z10 = z9;
                                                i24 = NotificationCenter.needDeleteDialog;
                                                i25 = 2;
                                            }
                                            if (i25 != 0) {
                                                Point point = (Point) this.smartNotificationsDialogs.get(j5);
                                                if (point == null) {
                                                    str17 = str12;
                                                    this.smartNotificationsDialogs.put(j5, new Point(1, (int) (SystemClock.elapsedRealtime() / 1000)));
                                                    str16 = str15;
                                                } else {
                                                    str17 = str12;
                                                    int i36 = point.y + i24;
                                                    str16 = str15;
                                                    str18 = str14;
                                                    if (i36 < SystemClock.elapsedRealtime() / 1000) {
                                                        point.set(1, (int) (SystemClock.elapsedRealtime() / 1000));
                                                    } else {
                                                        int i37 = point.x;
                                                        if (i37 < i25) {
                                                            point.set(i37 + 1, (int) (SystemClock.elapsedRealtime() / 1000));
                                                        } else {
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                str16 = str15;
                                                str18 = str14;
                                                str17 = str12;
                                            }
                                        }
                                        if (z10) {
                                            j6 = j2;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("sound_enabled_");
                                            j6 = j2;
                                            sb2.append(getSharedPrefKey(j5, j6));
                                            if (!sharedPreferences2.getBoolean(sb2.toString(), true)) {
                                                z11 = true;
                                                String path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                                z12 = ApplicationLoader.mainInterfacePaused;
                                                boolean z28 = !z12;
                                                getSharedPrefKey(j5, j6);
                                                if (this.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j5, j6, false)) {
                                                    chat2 = chat5;
                                                    builder3 = builder2;
                                                    str19 = string;
                                                    i2 = 0;
                                                    str20 = null;
                                                    i3 = 3;
                                                    num = null;
                                                    z13 = false;
                                                } else {
                                                    int property = this.dialogsNotificationsFacade.getProperty("vibrate_", j5, j6, 0);
                                                    int property2 = this.dialogsNotificationsFacade.getProperty("priority_", j5, j6, 3);
                                                    str19 = string;
                                                    long property3 = this.dialogsNotificationsFacade.getProperty("sound_document_id_", j5, j6, 0L);
                                                    chat2 = chat5;
                                                    builder3 = builder2;
                                                    if (property3 != 0) {
                                                        propertyString = getMediaDataController().ringtoneDataStore.getSoundPath(property3);
                                                        z22 = true;
                                                    } else {
                                                        propertyString = this.dialogsNotificationsFacade.getPropertyString("sound_path_", j5, j6, null);
                                                        z22 = false;
                                                    }
                                                    int property4 = this.dialogsNotificationsFacade.getProperty("color_", j5, j6, 0);
                                                    if (property4 != 0) {
                                                        z13 = z22;
                                                        num = Integer.valueOf(property4);
                                                        i2 = property;
                                                        i3 = property2;
                                                        str20 = propertyString;
                                                    } else {
                                                        str20 = propertyString;
                                                        z13 = z22;
                                                        i2 = property;
                                                        i3 = property2;
                                                        num = null;
                                                    }
                                                }
                                                long j20 = j6;
                                                if (!messageObject2.isReactionPush || messageObject2.isStoryReactionPush) {
                                                    j7 = j5;
                                                    z14 = z8;
                                                    j8 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                                    if (j8 == 0) {
                                                        string2 = getMediaDataController().ringtoneDataStore.getSoundPath(j8);
                                                        z15 = true;
                                                    } else {
                                                        string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                                        z15 = false;
                                                    }
                                                    i4 = sharedPreferences2.getInt("vibrate_react", 0);
                                                    i5 = sharedPreferences2.getInt("priority_react", 1);
                                                    i6 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                                    if (messageObject2.isStoryReactionPush) {
                                                        i7 = 4;
                                                        i8 = 4;
                                                    } else {
                                                        i7 = 4;
                                                        i8 = 5;
                                                    }
                                                } else if (j == 0) {
                                                    j7 = j5;
                                                    z14 = z8;
                                                    if (j4 != 0) {
                                                        long j21 = sharedPreferences2.getLong(z6 ? "StoriesSoundDocId" : "GlobalSoundDocId", 0L);
                                                        if (j21 != 0) {
                                                            string2 = getMediaDataController().ringtoneDataStore.getSoundPath(j21);
                                                            z15 = true;
                                                        } else {
                                                            string2 = sharedPreferences2.getString(z6 ? "StoriesSoundPath" : "GlobalSoundPath", path);
                                                            z15 = false;
                                                        }
                                                        i4 = sharedPreferences2.getInt("vibrate_messages", 0);
                                                        i5 = sharedPreferences2.getInt("priority_messages", 1);
                                                        i6 = sharedPreferences2.getInt("MessagesLed", -16776961);
                                                        i7 = 4;
                                                        i8 = z6 ? 3 : 1;
                                                    } else {
                                                        z15 = false;
                                                        str21 = null;
                                                        i9 = -16776961;
                                                        i4 = 0;
                                                        i5 = 0;
                                                        i7 = 4;
                                                        i8 = 1;
                                                        if (i4 == i7) {
                                                            i4 = 0;
                                                            z16 = true;
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        if (!TextUtils.isEmpty(str20) || TextUtils.equals(str21, str20)) {
                                                            z17 = true;
                                                        } else {
                                                            str21 = str20;
                                                            z15 = z13;
                                                            z17 = false;
                                                        }
                                                        if (i3 != 3 && i5 != i3) {
                                                            i5 = i3;
                                                            z17 = false;
                                                        }
                                                        if (num != null && num.intValue() != i9) {
                                                            i9 = num.intValue();
                                                            z17 = false;
                                                        }
                                                        if (i2 != 0 || i2 == i7 || i2 == i4) {
                                                            z18 = z17;
                                                            i2 = i4;
                                                        } else {
                                                            z18 = false;
                                                        }
                                                        if (!z12) {
                                                            if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                                                                str21 = null;
                                                            }
                                                            if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                                                                i2 = 2;
                                                            }
                                                            i5 = sharedPreferences2.getBoolean("EnableInAppPopup", true) ? 2 : 0;
                                                        }
                                                        if (z16 && i2 != 2) {
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
                                                            i11 = 0;
                                                            i10 = 0;
                                                            str21 = null;
                                                            i12 = 0;
                                                        } else {
                                                            i10 = i2;
                                                            i11 = i5;
                                                            i12 = i9;
                                                        }
                                                        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append("com.tmessages.openchat");
                                                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                                                        sb3.append(Math.random());
                                                        sb3.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                        intent.setAction(sb3.toString());
                                                        intent.setFlags(67108864);
                                                        if (messageObject2.isOauthPush) {
                                                            intent.putExtra("oauth_url", messageObject2.localName);
                                                        }
                                                        if (messageObject2.isStoryReactionPush) {
                                                            intent.putExtra("storyId", Math.abs(messageObject2.getId()));
                                                            z19 = z15;
                                                            obj = path;
                                                            i14 = i10;
                                                            str22 = str21;
                                                            str23 = str16;
                                                        } else if (messageObject2.isLiveStoryPush) {
                                                            if (j != 0) {
                                                                str24 = str16;
                                                                intent.putExtra(str9, j19);
                                                            } else {
                                                                str24 = str16;
                                                                if (j4 != 0) {
                                                                    intent.putExtra(str2, j4);
                                                                }
                                                            }
                                                            intent.putExtra("storyId", Math.abs(messageObject2.getId()));
                                                            z19 = z15;
                                                            obj = path;
                                                            i14 = i10;
                                                            str22 = str21;
                                                            str23 = str24;
                                                        } else {
                                                            str22 = str21;
                                                            str23 = str16;
                                                            i13 = i12;
                                                            String str34 = str9;
                                                            long j22 = j4;
                                                            String str35 = str2;
                                                            i14 = i10;
                                                            if (messageObject2.isStoryPush) {
                                                                notificationsController = this;
                                                                long[] jArr6 = new long[notificationsController.storyPushMessages.size()];
                                                                for (int i38 = 0; i38 < notificationsController.storyPushMessages.size(); i38++) {
                                                                    jArr6[i38] = notificationsController.storyPushMessages.get(i38).dialogId;
                                                                }
                                                                intent.putExtra("storyDialogIds", jArr6);
                                                                z19 = z15;
                                                                obj = path;
                                                            } else {
                                                                notificationsController = this;
                                                                if (!DialogObject.isEncryptedDialog(j7)) {
                                                                    z19 = z15;
                                                                    obj = path;
                                                                    if (notificationsController.pushDialogs.size() == 1) {
                                                                        if (j != 0) {
                                                                            intent.putExtra(str34, j19);
                                                                        } else if (j22 != 0) {
                                                                            intent.putExtra(str35, j22);
                                                                        }
                                                                    }
                                                                    if (AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
                                                                        chat3 = chat2;
                                                                    } else if (notificationsController.pushDialogs.size() == 1 && Build.VERSION.SDK_INT < 28) {
                                                                        if (chat2 != null) {
                                                                            chat3 = chat2;
                                                                            TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                                            if (chatPhoto != null && (fileLocation3 = chatPhoto.photo_small) != null && fileLocation3.volume_id != 0 && fileLocation3.local_id != 0) {
                                                                                fileLocation2 = fileLocation3;
                                                                                user2 = user;
                                                                            }
                                                                        } else {
                                                                            chat3 = chat2;
                                                                            if (user != null) {
                                                                                user2 = user;
                                                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                                                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                                                                    fileLocation2 = fileLocation;
                                                                                }
                                                                            }
                                                                        }
                                                                        String str36 = str8;
                                                                        intent.putExtra(str36, notificationsController.currentAccount);
                                                                        builder4 = builder3;
                                                                        String str37 = str22;
                                                                        builder4.setContentTitle(str19).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                        builder4.setCategory("msg");
                                                                        if (chat3 == null && user2 != null && (str25 = user2.phone) != null && str25.length() > 0) {
                                                                            builder4.addPerson("tel:+" + user2.phone);
                                                                        }
                                                                        Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                        intent2.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                        intent2.putExtra(str36, notificationsController.currentAccount);
                                                                        if (messageObject2.isStoryPush) {
                                                                            intent2.putExtra("story", true);
                                                                        }
                                                                        if (messageObject2.isStoryReactionPush) {
                                                                            i23 = 1;
                                                                        } else {
                                                                            i23 = 1;
                                                                            intent2.putExtra("storyReaction", true);
                                                                        }
                                                                        builder4.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i23, intent2, 167772160));
                                                                        if (bitmap2 == null) {
                                                                            builder4.setLargeIcon(bitmap2);
                                                                        } else if (fileLocation2 != null) {
                                                                            jArr = null;
                                                                            BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation2, null, "50_50");
                                                                            if (imageFromMemory != null) {
                                                                                builder4.setLargeIcon(imageFromMemory.getBitmap());
                                                                            } else {
                                                                                try {
                                                                                    File pathToAttach = getFileLoader().getPathToAttach(fileLocation2, true);
                                                                                    if (pathToAttach.exists()) {
                                                                                        float dp = 160.0f / AndroidUtilities.dp(50.0f);
                                                                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                        options.inSampleSize = dp < 1.0f ? 1 : (int) dp;
                                                                                        Bitmap decodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                                                                                        if (decodeFile != null) {
                                                                                            builder4.setLargeIcon(decodeFile);
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable unused) {
                                                                                }
                                                                            }
                                                                            boolean z29 = z14;
                                                                            if (z || z29) {
                                                                                builder4.setPriority(-1);
                                                                            } else if (i11 == 0) {
                                                                                builder4.setPriority(0);
                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                    z20 = true;
                                                                                    i15 = 3;
                                                                                }
                                                                                z20 = true;
                                                                                i15 = 0;
                                                                            } else if (i11 == 1 || i11 == 2) {
                                                                                builder4.setPriority(1);
                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                    z20 = true;
                                                                                    i15 = 4;
                                                                                }
                                                                                z20 = true;
                                                                                i15 = 0;
                                                                            } else {
                                                                                if (i11 == 4) {
                                                                                    builder4.setPriority(-2);
                                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                                        z20 = true;
                                                                                        i15 = 1;
                                                                                    }
                                                                                } else if (i11 == 5) {
                                                                                    builder4.setPriority(-1);
                                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                                        z20 = true;
                                                                                        i15 = 2;
                                                                                    }
                                                                                }
                                                                                z20 = true;
                                                                                i15 = 0;
                                                                            }
                                                                            if (z29 != z20 && !z11) {
                                                                                if (z12 || (sharedPreferences3.getBoolean("EnableInAppPreview", z20) && str18 != null)) {
                                                                                    builder4.setTicker(str18.length() > 100 ? str18.substring(0, 100).replace('\n', ' ').trim() + "..." : str18);
                                                                                }
                                                                                if (str37 != null && !str37.equalsIgnoreCase("NoSound")) {
                                                                                    int i39 = Build.VERSION.SDK_INT;
                                                                                    if (i39 >= 26) {
                                                                                        if (!str37.equalsIgnoreCase("Default") && !str37.equals(obj)) {
                                                                                            if (z19) {
                                                                                                ?? uriForFile = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + str5, new File(str37));
                                                                                                ApplicationLoader.applicationContext.grantUriPermission(str4, uriForFile, 1);
                                                                                                jArr5 = uriForFile;
                                                                                                if (i13 == 0) {
                                                                                                    i16 = i13;
                                                                                                    builder4.setLights(i16, MediaDataController.MAX_STYLE_RUNS_COUNT, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                                                                                } else {
                                                                                                    i16 = i13;
                                                                                                }
                                                                                                i22 = i14;
                                                                                                if (i22 != 2) {
                                                                                                    jArr2 = new long[]{0, 0};
                                                                                                    builder4.setVibrate(jArr2);
                                                                                                } else if (i22 == 1) {
                                                                                                    jArr2 = new long[]{0, 100, 0, 100};
                                                                                                    builder4.setVibrate(jArr2);
                                                                                                } else {
                                                                                                    if (i22 == 0 || i22 == 4) {
                                                                                                        builder4.setDefaults(2);
                                                                                                        jArr4 = new long[0];
                                                                                                    } else if (i22 == 3) {
                                                                                                        long[] jArr7 = {0, 1000};
                                                                                                        builder4.setVibrate(jArr7);
                                                                                                        jArr2 = jArr7;
                                                                                                    } else {
                                                                                                        jArr4 = jArr;
                                                                                                    }
                                                                                                    jArr3 = jArr5;
                                                                                                    if (!AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter || messageObject2.getDialogId() != 777000 || (replyMarkup = messageObject2.messageOwner.reply_markup) == null) {
                                                                                                        i17 = i15;
                                                                                                        j9 = j7;
                                                                                                        z21 = false;
                                                                                                    } else {
                                                                                                        ArrayList<TLRPC.TL_keyboardButtonRow> arrayList3 = replyMarkup.rows;
                                                                                                        int size = arrayList3.size();
                                                                                                        int i40 = 0;
                                                                                                        boolean z30 = false;
                                                                                                        while (i40 < size) {
                                                                                                            TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow2 = arrayList3.get(i40);
                                                                                                            int size2 = tL_keyboardButtonRow2.buttons.size();
                                                                                                            boolean z31 = z30;
                                                                                                            int i41 = 0;
                                                                                                            while (i41 < size2) {
                                                                                                                TLRPC.KeyboardButton keyboardButton = tL_keyboardButtonRow2.buttons.get(i41);
                                                                                                                ArrayList<TLRPC.TL_keyboardButtonRow> arrayList4 = arrayList3;
                                                                                                                if (keyboardButton instanceof TLRPC.TL_keyboardButtonCallback) {
                                                                                                                    i18 = size;
                                                                                                                    tL_keyboardButtonRow = tL_keyboardButtonRow2;
                                                                                                                    Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                                                                    intent3.putExtra(str36, notificationsController.currentAccount);
                                                                                                                    i19 = size2;
                                                                                                                    j10 = j7;
                                                                                                                    intent3.putExtra("did", j10);
                                                                                                                    byte[] bArr = keyboardButton.data;
                                                                                                                    if (bArr != null) {
                                                                                                                        i20 = i15;
                                                                                                                        intent3.putExtra("data", bArr);
                                                                                                                    } else {
                                                                                                                        i20 = i15;
                                                                                                                    }
                                                                                                                    intent3.putExtra("mid", messageObject2.getId());
                                                                                                                    String str38 = keyboardButton.text;
                                                                                                                    Context context = ApplicationLoader.applicationContext;
                                                                                                                    int i42 = notificationsController.lastButtonId;
                                                                                                                    messageObject3 = messageObject2;
                                                                                                                    notificationsController.lastButtonId = i42 + 1;
                                                                                                                    builder4.addAction(0, str38, PendingIntent.getBroadcast(context, i42, intent3, 167772160));
                                                                                                                    i21 = 1;
                                                                                                                    z31 = true;
                                                                                                                } else {
                                                                                                                    i18 = size;
                                                                                                                    tL_keyboardButtonRow = tL_keyboardButtonRow2;
                                                                                                                    i19 = size2;
                                                                                                                    messageObject3 = messageObject2;
                                                                                                                    i20 = i15;
                                                                                                                    j10 = j7;
                                                                                                                    i21 = 1;
                                                                                                                }
                                                                                                                i41 += i21;
                                                                                                                size = i18;
                                                                                                                j7 = j10;
                                                                                                                arrayList3 = arrayList4;
                                                                                                                tL_keyboardButtonRow2 = tL_keyboardButtonRow;
                                                                                                                size2 = i19;
                                                                                                                i15 = i20;
                                                                                                                messageObject2 = messageObject3;
                                                                                                            }
                                                                                                            i40++;
                                                                                                            size = size;
                                                                                                            z30 = z31;
                                                                                                        }
                                                                                                        i17 = i15;
                                                                                                        j9 = j7;
                                                                                                        z21 = z30;
                                                                                                    }
                                                                                                    if (!z21 && Build.VERSION.SDK_INT < 24 && SharedConfig.passcodeHash.length() == 0 && hasMessagesToReply()) {
                                                                                                        Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                                        intent4.putExtra(str36, notificationsController.currentAccount);
                                                                                                        builder4.addAction(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent4, 167772160));
                                                                                                    }
                                                                                                    showExtraNotifications(builder4, str23, j9, j20, str29, jArr4, i16, jArr3, i17, z18, z28, z11, i8);
                                                                                                    scheduleNotificationRepeat();
                                                                                                    return;
                                                                                                }
                                                                                                jArr3 = jArr5;
                                                                                            } else {
                                                                                                r2 = Uri.parse(str37);
                                                                                                jArr5 = r2;
                                                                                                if (i13 == 0) {
                                                                                                }
                                                                                                i22 = i14;
                                                                                                if (i22 != 2) {
                                                                                                }
                                                                                                jArr3 = jArr5;
                                                                                            }
                                                                                        }
                                                                                        r2 = Settings.System.DEFAULT_NOTIFICATION_URI;
                                                                                        jArr5 = r2;
                                                                                        if (i13 == 0) {
                                                                                        }
                                                                                        i22 = i14;
                                                                                        if (i22 != 2) {
                                                                                        }
                                                                                        jArr3 = jArr5;
                                                                                    } else {
                                                                                        String str39 = str4;
                                                                                        String str40 = str5;
                                                                                        if (str37.equals(obj)) {
                                                                                            builder4.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, 5);
                                                                                        } else {
                                                                                            if (i39 >= 24) {
                                                                                                String str41 = str;
                                                                                                if (str37.startsWith(str41) && !AndroidUtilities.isInternalUri(Uri.parse(str37))) {
                                                                                                    try {
                                                                                                        Uri uriForFile2 = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + str40, new File(str37.replace(str41, str17)));
                                                                                                        ApplicationLoader.applicationContext.grantUriPermission(str39, uriForFile2, 1);
                                                                                                        builder4.setSound(uriForFile2, 5);
                                                                                                    } catch (Exception unused2) {
                                                                                                        builder4.setSound(Uri.parse(str37), 5);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            builder4.setSound(Uri.parse(str37), 5);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                jArr5 = jArr;
                                                                                if (i13 == 0) {
                                                                                }
                                                                                i22 = i14;
                                                                                if (i22 != 2) {
                                                                                }
                                                                                jArr3 = jArr5;
                                                                            } else {
                                                                                i16 = i13;
                                                                                long[] jArr8 = {0, 0};
                                                                                builder4.setVibrate(jArr8);
                                                                                jArr2 = jArr8;
                                                                                jArr3 = jArr;
                                                                            }
                                                                            jArr4 = jArr2;
                                                                            if (AndroidUtilities.needShowPasscode()) {
                                                                            }
                                                                            i17 = i15;
                                                                            j9 = j7;
                                                                            z21 = false;
                                                                            if (!z21) {
                                                                                Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                                                intent42.putExtra(str36, notificationsController.currentAccount);
                                                                                builder4.addAction(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent42, 167772160));
                                                                            }
                                                                            showExtraNotifications(builder4, str23, j9, j20, str29, jArr4, i16, jArr3, i17, z18, z28, z11, i8);
                                                                            scheduleNotificationRepeat();
                                                                            return;
                                                                        }
                                                                        jArr = null;
                                                                        boolean z292 = z14;
                                                                        if (z) {
                                                                        }
                                                                        builder4.setPriority(-1);
                                                                    }
                                                                    user2 = user;
                                                                } else {
                                                                    z19 = z15;
                                                                    obj = path;
                                                                    chat3 = chat2;
                                                                    user2 = user;
                                                                    if (notificationsController.pushDialogs.size() == 1 && j7 != globalSecretChatId) {
                                                                        intent.putExtra("encId", DialogObject.getEncryptedChatId(j7));
                                                                    }
                                                                }
                                                                fileLocation2 = null;
                                                                String str362 = str8;
                                                                intent.putExtra(str362, notificationsController.currentAccount);
                                                                builder4 = builder3;
                                                                String str372 = str22;
                                                                builder4.setContentTitle(str19).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                                builder4.setCategory("msg");
                                                                if (chat3 == null) {
                                                                    builder4.addPerson("tel:+" + user2.phone);
                                                                }
                                                                Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                                intent22.putExtra("messageDate", messageObject2.messageOwner.date);
                                                                intent22.putExtra(str362, notificationsController.currentAccount);
                                                                if (messageObject2.isStoryPush) {
                                                                }
                                                                if (messageObject2.isStoryReactionPush) {
                                                                }
                                                                builder4.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i23, intent22, 167772160));
                                                                if (bitmap2 == null) {
                                                                }
                                                                jArr = null;
                                                                boolean z2922 = z14;
                                                                if (z) {
                                                                }
                                                                builder4.setPriority(-1);
                                                            }
                                                            chat3 = chat2;
                                                            user2 = user;
                                                            fileLocation2 = null;
                                                            String str3622 = str8;
                                                            intent.putExtra(str3622, notificationsController.currentAccount);
                                                            builder4 = builder3;
                                                            String str3722 = str22;
                                                            builder4.setContentTitle(str19).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                            builder4.setCategory("msg");
                                                            if (chat3 == null) {
                                                            }
                                                            Intent intent222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                            intent222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                            intent222.putExtra(str3622, notificationsController.currentAccount);
                                                            if (messageObject2.isStoryPush) {
                                                            }
                                                            if (messageObject2.isStoryReactionPush) {
                                                            }
                                                            builder4.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i23, intent222, 167772160));
                                                            if (bitmap2 == null) {
                                                            }
                                                            jArr = null;
                                                            boolean z29222 = z14;
                                                            if (z) {
                                                            }
                                                            builder4.setPriority(-1);
                                                        }
                                                        i13 = i12;
                                                        chat3 = chat2;
                                                        user2 = user;
                                                        notificationsController = this;
                                                        fileLocation2 = null;
                                                        String str36222 = str8;
                                                        intent.putExtra(str36222, notificationsController.currentAccount);
                                                        builder4 = builder3;
                                                        String str37222 = str22;
                                                        builder4.setContentTitle(str19).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                        builder4.setCategory("msg");
                                                        if (chat3 == null) {
                                                        }
                                                        Intent intent2222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                        intent2222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                        intent2222.putExtra(str36222, notificationsController.currentAccount);
                                                        if (messageObject2.isStoryPush) {
                                                        }
                                                        if (messageObject2.isStoryReactionPush) {
                                                        }
                                                        builder4.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i23, intent2222, 167772160));
                                                        if (bitmap2 == null) {
                                                        }
                                                        jArr = null;
                                                        boolean z292222 = z14;
                                                        if (z) {
                                                        }
                                                        builder4.setPriority(-1);
                                                    }
                                                } else if (z2) {
                                                    j7 = j5;
                                                    z14 = z8;
                                                    long j23 = sharedPreferences2.getLong("ChannelSoundDocId", 0L);
                                                    if (j23 != 0) {
                                                        string2 = getMediaDataController().ringtoneDataStore.getSoundPath(j23);
                                                        z15 = true;
                                                    } else {
                                                        string2 = sharedPreferences2.getString("ChannelSoundPath", path);
                                                        z15 = false;
                                                    }
                                                    i4 = sharedPreferences2.getInt("vibrate_channel", 0);
                                                    i5 = sharedPreferences2.getInt("priority_channel", 1);
                                                    i6 = sharedPreferences2.getInt("ChannelLed", -16776961);
                                                    i7 = 4;
                                                    i8 = 2;
                                                } else {
                                                    j7 = j5;
                                                    z14 = z8;
                                                    long j24 = sharedPreferences2.getLong("GroupSoundDocId", 0L);
                                                    if (j24 != 0) {
                                                        string2 = getMediaDataController().ringtoneDataStore.getSoundPath(j24);
                                                        z15 = true;
                                                    } else {
                                                        string2 = sharedPreferences2.getString("GroupSoundPath", path);
                                                        z15 = false;
                                                    }
                                                    i4 = sharedPreferences2.getInt("vibrate_group", 0);
                                                    i5 = sharedPreferences2.getInt("priority_group", 1);
                                                    i6 = sharedPreferences2.getInt("GroupLed", -16776961);
                                                    i7 = 4;
                                                    i8 = 0;
                                                }
                                                String str42 = string2;
                                                i9 = i6;
                                                str21 = str42;
                                                if (i4 == i7) {
                                                }
                                                if (TextUtils.isEmpty(str20)) {
                                                }
                                                z17 = true;
                                                if (i3 != 3) {
                                                    i5 = i3;
                                                    z17 = false;
                                                }
                                                if (num != null) {
                                                    i9 = num.intValue();
                                                    z17 = false;
                                                }
                                                if (i2 != 0) {
                                                }
                                                z18 = z17;
                                                i2 = i4;
                                                if (!z12) {
                                                }
                                                if (z16) {
                                                    ringerMode = audioManager.getRingerMode();
                                                    if (ringerMode != 0) {
                                                        i2 = 2;
                                                    }
                                                }
                                                if (z11) {
                                                }
                                                Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                StringBuilder sb32 = new StringBuilder();
                                                sb32.append("com.tmessages.openchat");
                                                SharedPreferences sharedPreferences32 = sharedPreferences2;
                                                sb32.append(Math.random());
                                                sb32.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent5.setAction(sb32.toString());
                                                intent5.setFlags(67108864);
                                                if (messageObject2.isOauthPush) {
                                                }
                                                if (messageObject2.isStoryReactionPush) {
                                                }
                                                i13 = i12;
                                                chat3 = chat2;
                                                user2 = user;
                                                notificationsController = this;
                                                fileLocation2 = null;
                                                String str362222 = str8;
                                                intent5.putExtra(str362222, notificationsController.currentAccount);
                                                builder4 = builder3;
                                                String str372222 = str22;
                                                builder4.setContentTitle(str19).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent5, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                                builder4.setCategory("msg");
                                                if (chat3 == null) {
                                                }
                                                Intent intent22222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent22222.putExtra("messageDate", messageObject2.messageOwner.date);
                                                intent22222.putExtra(str362222, notificationsController.currentAccount);
                                                if (messageObject2.isStoryPush) {
                                                }
                                                if (messageObject2.isStoryReactionPush) {
                                                }
                                                builder4.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i23, intent22222, 167772160));
                                                if (bitmap2 == null) {
                                                }
                                                jArr = null;
                                                boolean z2922222 = z14;
                                                if (z) {
                                                }
                                                builder4.setPriority(-1);
                                            }
                                        }
                                        z11 = z10;
                                        String path2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                        z12 = ApplicationLoader.mainInterfacePaused;
                                        boolean z282 = !z12;
                                        getSharedPrefKey(j5, j6);
                                        if (this.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j5, j6, false)) {
                                        }
                                        long j202 = j6;
                                        if (messageObject2.isReactionPush) {
                                        }
                                        j7 = j5;
                                        z14 = z8;
                                        j8 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                        if (j8 == 0) {
                                        }
                                        i4 = sharedPreferences2.getInt("vibrate_react", 0);
                                        i5 = sharedPreferences2.getInt("priority_react", 1);
                                        i6 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                        if (messageObject2.isStoryReactionPush) {
                                        }
                                        String str422 = string2;
                                        i9 = i6;
                                        str21 = str422;
                                        if (i4 == i7) {
                                        }
                                        if (TextUtils.isEmpty(str20)) {
                                        }
                                        z17 = true;
                                        if (i3 != 3) {
                                        }
                                        if (num != null) {
                                        }
                                        if (i2 != 0) {
                                        }
                                        z18 = z17;
                                        i2 = i4;
                                        if (!z12) {
                                        }
                                        if (z16) {
                                        }
                                        if (z11) {
                                        }
                                        Intent intent52 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                        StringBuilder sb322 = new StringBuilder();
                                        sb322.append("com.tmessages.openchat");
                                        SharedPreferences sharedPreferences322 = sharedPreferences2;
                                        sb322.append(Math.random());
                                        sb322.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                        intent52.setAction(sb322.toString());
                                        intent52.setFlags(67108864);
                                        if (messageObject2.isOauthPush) {
                                        }
                                        if (messageObject2.isStoryReactionPush) {
                                        }
                                        i13 = i12;
                                        chat3 = chat2;
                                        user2 = user;
                                        notificationsController = this;
                                        fileLocation2 = null;
                                        String str3622222 = str8;
                                        intent52.putExtra(str3622222, notificationsController.currentAccount);
                                        builder4 = builder3;
                                        String str3722222 = str22;
                                        builder4.setContentTitle(str19).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent52, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                        builder4.setCategory("msg");
                                        if (chat3 == null) {
                                        }
                                        Intent intent222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                        intent222222.putExtra("messageDate", messageObject2.messageOwner.date);
                                        intent222222.putExtra(str3622222, notificationsController.currentAccount);
                                        if (messageObject2.isStoryPush) {
                                        }
                                        if (messageObject2.isStoryReactionPush) {
                                        }
                                        builder4.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i23, intent222222, 167772160));
                                        if (bitmap2 == null) {
                                        }
                                        jArr = null;
                                        boolean z29222222 = z14;
                                        if (z) {
                                        }
                                        builder4.setPriority(-1);
                                    } else {
                                        str16 = str15;
                                        z10 = z9;
                                        str17 = str12;
                                        j5 = dialogId;
                                        sharedPreferences2 = sharedPreferences;
                                    }
                                    str18 = str14;
                                    if (z10) {
                                    }
                                    z11 = z10;
                                    String path22 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                    z12 = ApplicationLoader.mainInterfacePaused;
                                    boolean z2822 = !z12;
                                    getSharedPrefKey(j5, j6);
                                    if (this.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j5, j6, false)) {
                                    }
                                    long j2022 = j6;
                                    if (messageObject2.isReactionPush) {
                                    }
                                    j7 = j5;
                                    z14 = z8;
                                    j8 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                    if (j8 == 0) {
                                    }
                                    i4 = sharedPreferences2.getInt("vibrate_react", 0);
                                    i5 = sharedPreferences2.getInt("priority_react", 1);
                                    i6 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                    if (messageObject2.isStoryReactionPush) {
                                    }
                                    String str4222 = string2;
                                    i9 = i6;
                                    str21 = str4222;
                                    if (i4 == i7) {
                                    }
                                    if (TextUtils.isEmpty(str20)) {
                                    }
                                    z17 = true;
                                    if (i3 != 3) {
                                    }
                                    if (num != null) {
                                    }
                                    if (i2 != 0) {
                                    }
                                    z18 = z17;
                                    i2 = i4;
                                    if (!z12) {
                                    }
                                    if (z16) {
                                    }
                                    if (z11) {
                                    }
                                    Intent intent522 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                    StringBuilder sb3222 = new StringBuilder();
                                    sb3222.append("com.tmessages.openchat");
                                    SharedPreferences sharedPreferences3222 = sharedPreferences2;
                                    sb3222.append(Math.random());
                                    sb3222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    intent522.setAction(sb3222.toString());
                                    intent522.setFlags(67108864);
                                    if (messageObject2.isOauthPush) {
                                    }
                                    if (messageObject2.isStoryReactionPush) {
                                    }
                                    i13 = i12;
                                    chat3 = chat2;
                                    user2 = user;
                                    notificationsController = this;
                                    fileLocation2 = null;
                                    String str36222222 = str8;
                                    intent522.putExtra(str36222222, notificationsController.currentAccount);
                                    builder4 = builder3;
                                    String str37222222 = str22;
                                    builder4.setContentTitle(str19).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent522, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                    builder4.setCategory("msg");
                                    if (chat3 == null) {
                                    }
                                    Intent intent2222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                    intent2222222.putExtra("messageDate", messageObject2.messageOwner.date);
                                    intent2222222.putExtra(str36222222, notificationsController.currentAccount);
                                    if (messageObject2.isStoryPush) {
                                    }
                                    if (messageObject2.isStoryReactionPush) {
                                    }
                                    builder4.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i23, intent2222222, 167772160));
                                    if (bitmap2 == null) {
                                    }
                                    jArr = null;
                                    boolean z292222222 = z14;
                                    if (z) {
                                    }
                                    builder4.setPriority(-1);
                                }
                                z9 = true;
                                if (z9) {
                                }
                                str18 = str14;
                                if (z10) {
                                }
                                z11 = z10;
                                String path222 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                z12 = ApplicationLoader.mainInterfacePaused;
                                boolean z28222 = !z12;
                                getSharedPrefKey(j5, j6);
                                if (this.dialogsNotificationsFacade.getProperty(NotificationsSettingsFacade.PROPERTY_CUSTOM, j5, j6, false)) {
                                }
                                long j20222 = j6;
                                if (messageObject2.isReactionPush) {
                                }
                                j7 = j5;
                                z14 = z8;
                                j8 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                if (j8 == 0) {
                                }
                                i4 = sharedPreferences2.getInt("vibrate_react", 0);
                                i5 = sharedPreferences2.getInt("priority_react", 1);
                                i6 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                if (messageObject2.isStoryReactionPush) {
                                }
                                String str42222 = string2;
                                i9 = i6;
                                str21 = str42222;
                                if (i4 == i7) {
                                }
                                if (TextUtils.isEmpty(str20)) {
                                }
                                z17 = true;
                                if (i3 != 3) {
                                }
                                if (num != null) {
                                }
                                if (i2 != 0) {
                                }
                                z18 = z17;
                                i2 = i4;
                                if (!z12) {
                                }
                                if (z16) {
                                }
                                if (z11) {
                                }
                                Intent intent5222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                StringBuilder sb32222 = new StringBuilder();
                                sb32222.append("com.tmessages.openchat");
                                SharedPreferences sharedPreferences32222 = sharedPreferences2;
                                sb32222.append(Math.random());
                                sb32222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent5222.setAction(sb32222.toString());
                                intent5222.setFlags(67108864);
                                if (messageObject2.isOauthPush) {
                                }
                                if (messageObject2.isStoryReactionPush) {
                                }
                                i13 = i12;
                                chat3 = chat2;
                                user2 = user;
                                notificationsController = this;
                                fileLocation2 = null;
                                String str362222222 = str8;
                                intent5222.putExtra(str362222222, notificationsController.currentAccount);
                                builder4 = builder3;
                                String str372222222 = str22;
                                builder4.setContentTitle(str19).setSmallIcon(R.drawable.notification).setAutoCancel(true).setNumber(notificationsController.total_unread_count).setContentIntent(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent5222, 1140850688)).setGroup(notificationsController.notificationGroup).setGroupSummary(true).setShowWhen(true).setWhen(messageObject2.messageOwner.date * 1000).setColor(-15618822);
                                builder4.setCategory("msg");
                                if (chat3 == null) {
                                }
                                Intent intent22222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent22222222.putExtra("messageDate", messageObject2.messageOwner.date);
                                intent22222222.putExtra(str362222222, notificationsController.currentAccount);
                                if (messageObject2.isStoryPush) {
                                }
                                if (messageObject2.isStoryReactionPush) {
                                }
                                builder4.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i23, intent22222222, 167772160));
                                if (bitmap2 == null) {
                                }
                                jArr = null;
                                boolean z2922222222 = z14;
                                if (z) {
                                }
                                builder4.setPriority(-1);
                            }
                            str9 = "chatId";
                            if (this.pushDialogs.size() == 1) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(str11);
                                z6 = z25;
                                sb4.append(LocaleController.formatPluralString("NewMessages", this.total_unread_count, new Object[0]));
                                str10 = sb4.toString();
                                j4 = j3;
                            } else {
                                z6 = z25;
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(str11);
                                j4 = j3;
                                sb5.append(LocaleController.formatString(R.string.NotificationMessagesPeopleDisplayOrder, LocaleController.formatPluralString("NewMessages", this.total_unread_count, new Object[0]), LocaleController.formatPluralString("FromChats", this.pushDialogs.size(), new Object[0])));
                                str10 = sb5.toString();
                            }
                        }
                        str11 = str10;
                        builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                        if (this.pushMessages.size() > 1) {
                        }
                        z7 = z3;
                        builder2 = builder;
                        String str302 = str11;
                        sharedPreferences = notificationsSettings;
                        str12 = str28;
                        boolean[] zArr3 = new boolean[1];
                        messageObject2 = messageObject;
                        stringForMessage = getStringForMessage(messageObject2, false, zArr3, null);
                        boolean isSilentMessage2 = isSilentMessage(messageObject2);
                        if (stringForMessage != null) {
                        }
                    }
                    str7 = str6;
                    if (!notificationsSettings.getBoolean("EnableReactionsPreview", true)) {
                        string = LocaleController.getString(R.string.NotificationHiddenName);
                        if (equalsIgnoreCase) {
                        }
                        str11 = str10;
                        builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                        if (this.pushMessages.size() > 1) {
                        }
                        z7 = z3;
                        builder2 = builder;
                        String str3022 = str11;
                        sharedPreferences = notificationsSettings;
                        str12 = str28;
                        boolean[] zArr32 = new boolean[1];
                        messageObject2 = messageObject;
                        stringForMessage = getStringForMessage(messageObject2, false, zArr32, null);
                        boolean isSilentMessage22 = isSilentMessage(messageObject2);
                        if (stringForMessage != null) {
                        }
                    }
                    string = str7;
                    if (equalsIgnoreCase) {
                    }
                    str11 = str10;
                    builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                    if (this.pushMessages.size() > 1) {
                    }
                    z7 = z3;
                    builder2 = builder;
                    String str30222 = str11;
                    sharedPreferences = notificationsSettings;
                    str12 = str28;
                    boolean[] zArr322 = new boolean[1];
                    messageObject2 = messageObject;
                    stringForMessage = getStringForMessage(messageObject2, false, zArr322, null);
                    boolean isSilentMessage222 = isSilentMessage(messageObject2);
                    if (stringForMessage != null) {
                    }
                }
                String string3 = LocaleController.getString(R.string.AppName);
                str6 = string3;
                z5 = false;
                if (!messageObject.isReactionPush) {
                    str7 = str6;
                    string = str7;
                    if (equalsIgnoreCase) {
                    }
                    str11 = str10;
                    builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                    if (this.pushMessages.size() > 1) {
                    }
                    z7 = z3;
                    builder2 = builder;
                    String str302222 = str11;
                    sharedPreferences = notificationsSettings;
                    str12 = str28;
                    boolean[] zArr3222 = new boolean[1];
                    messageObject2 = messageObject;
                    stringForMessage = getStringForMessage(messageObject2, false, zArr3222, null);
                    boolean isSilentMessage2222 = isSilentMessage(messageObject2);
                    if (stringForMessage != null) {
                    }
                }
                str7 = str6;
                if (!notificationsSettings.getBoolean("EnableReactionsPreview", true)) {
                }
                string = str7;
                if (equalsIgnoreCase) {
                }
                str11 = str10;
                builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                if (this.pushMessages.size() > 1) {
                }
                z7 = z3;
                builder2 = builder;
                String str3022222 = str11;
                sharedPreferences = notificationsSettings;
                str12 = str28;
                boolean[] zArr32222 = new boolean[1];
                messageObject2 = messageObject;
                stringForMessage = getStringForMessage(messageObject2, false, zArr32222, null);
                boolean isSilentMessage22222 = isSilentMessage(messageObject2);
                if (stringForMessage != null) {
                }
            }
            z4 = true;
            equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            if (!DialogObject.isEncryptedDialog(dialogId)) {
                str6 = str29;
                z5 = true;
                if (!messageObject.isReactionPush) {
                }
                str7 = str6;
                if (!notificationsSettings.getBoolean("EnableReactionsPreview", true)) {
                }
                string = str7;
                if (equalsIgnoreCase) {
                }
                str11 = str10;
                builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
                if (this.pushMessages.size() > 1) {
                }
                z7 = z3;
                builder2 = builder;
                String str30222222 = str11;
                sharedPreferences = notificationsSettings;
                str12 = str28;
                boolean[] zArr322222 = new boolean[1];
                messageObject2 = messageObject;
                stringForMessage = getStringForMessage(messageObject2, false, zArr322222, null);
                boolean isSilentMessage222222 = isSilentMessage(messageObject2);
                if (stringForMessage != null) {
                }
            }
            String string32 = LocaleController.getString(R.string.AppName);
            str6 = string32;
            z5 = false;
            if (!messageObject.isReactionPush) {
            }
            str7 = str6;
            if (!notificationsSettings.getBoolean("EnableReactionsPreview", true)) {
            }
            string = str7;
            if (equalsIgnoreCase) {
            }
            str11 = str10;
            builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext);
            if (this.pushMessages.size() > 1) {
            }
            z7 = z3;
            builder2 = builder;
            String str302222222 = str11;
            sharedPreferences = notificationsSettings;
            str12 = str28;
            boolean[] zArr3222222 = new boolean[1];
            messageObject2 = messageObject;
            stringForMessage = getStringForMessage(messageObject2, false, zArr3222222, null);
            boolean isSilentMessage2222222 = isSilentMessage(messageObject2);
            if (stringForMessage != null) {
            }
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
            getNotificationsController().lambda$deleteNotificationChannelGlobal$41(i3, -1);
        } else {
            edit.putString("sound_" + getSharedPrefKey(j, j2), string);
            edit.putString("sound_path_" + getSharedPrefKey(j, j2), uri3);
            lambda$deleteNotificationChannel$40(j, j2, -1);
        }
        edit.commit();
        builder.setChannelId(validateChannelId(j, j2, str, jArr, i, uri2, i2, z, z2, z3, i3));
        notificationManager.notify(this.notificationId, builder.build());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(99:50|(2:52|(4:54|55|56|57)(4:58|(2:61|59)|62|63))(1:813)|64|(1:66)(1:(1:811)(1:812))|67|68|(4:71|(2:73|74)(1:76)|75|69)|77|78|(4:80|(2:(1:83)(1:679)|84)(1:680)|(1:678)(2:90|(80:94|95|(1:101)|(4:103|(1:105)(1:674)|106|107)(1:675)|(3:109|(3:111|(1:113)(3:661|662|(3:664|(1:666)(1:668)|667))|114)(1:672)|669)(1:673)|(3:116|(1:122)|123)(1:660)|124|(3:655|(1:657)(1:659)|658)(2:127|128)|129|(1:131)|132|(1:134)(1:645)|135|(2:643|644)(1:139)|140|141|(3:144|(1:146)|(3:148|149|(66:153|154|155|(57:159|160|161|162|163|(1:631)(1:167)|168|(1:630)(1:171)|172|173|(1:629)|180|(1:628)(1:187)|188|(14:190|(1:192)(2:382|(3:384|385|57)(2:386|(1:(1:389)(11:390|194|195|196|(2:199|197)|200|201|(1:381)(1:204)|205|(1:207)(1:380)|208))(2:391|(11:393|195|196|(1:197)|200|201|(0)|381|205|(0)(0)|208)(11:394|(1:399)(1:398)|196|(1:197)|200|201|(0)|381|205|(0)(0)|208))))|193|194|195|196|(1:197)|200|201|(0)|381|205|(0)(0)|208)(4:400|(5:402|(1:404)(3:408|(1:410)(2:613|(2:618|(1:620)(2:621|(1:625)))(1:617))|(3:412|(1:414)|415)(18:416|(1:418)|419|(3:608|(1:610)(1:612)|611)(1:425)|426|(3:600|(1:(1:603)(2:604|(1:606)))|607)(1:430)|431|(11:(7:434|(1:(2:437|(1:439))(1:594))(2:595|(1:597))|(3:534|(1:592)(4:540|(2:590|591)(4:543|(1:547)|(1:589)(2:553|(1:557))|588)|(2:562|(2:564|(1:574))(2:575|(1:585)))|586)|587)(1:444)|445|(6:447|(1:532)(7:460|(1:531)(2:464|(6:519|520|521|522|523|524)(1:466))|467|(1:469)(1:518)|470|471|(7:506|507|508|509|510|511|(5:477|(1:479)|480|481|(2:486|(3:488|(2:493|494)(1:490)|(1:492))))(1:503))(4:473|(2:505|(0)(0))|475|(0)(0)))|504|480|481|(3:484|486|(0)))(1:533)|497|(3:501|502|407))(1:598)|593|(1:442)|534|(1:536)|592|587|445|(0)(0)|497|(4:499|501|502|407))(1:599)|440|(0)|534|(0)|592|587|445|(0)(0)|497|(0)))|405|406|407)|626|627)|209|(1:(38:354|(2:365|(4:367|(2:370|368)|371|372)(2:373|(1:375)(2:376|(1:378)(1:379))))(3:358|(1:360)(2:362|(1:364))|361)|215|(1:217)|218|(1:220)|221|(2:223|(1:225)(1:345))(2:346|(1:348)(1:349))|(1:227)(1:344)|228|(4:230|(2:233|231)|234|235)(1:343)|236|(1:238)|239|240|241|(1:243)|(1:247)|248|(1:250)|(1:338)(4:256|(5:259|(2:260|(1:336)(2:262|(2:265|266)(1:264)))|267|(1:270)(1:269)|257)|337|271)|(1:273)|274|(2:(1:279)|(1:286))|287|(1:335)(1:293)|294|(1:296)|(1:298)|299|(3:304|(4:306|(3:308|(4:310|(1:312)|313|314)(2:316|317)|315)|318|319)|320)|321|(1:334)(2:324|(1:328))|329|(1:331)|332|333|57)(1:353))(1:213)|214|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(2:245|247)|248|(0)|(1:252)|338|(0)|274|(3:276|(0)|(2:281|286))|287|(1:289)|335|294|(0)|(0)|299|(4:301|304|(0)|320)|321|(0)|334|329|(0)|332|333|57)|635|163|(1:165)|631|168|(0)|630|172|173|(1:175)|629|180|(1:183)|628|188|(0)(0)|209|(1:211)|(1:351)|354|(1:356)|365|(0)(0)|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(0)|248|(0)|(0)|338|(0)|274|(0)|287|(0)|335|294|(0)|(0)|299|(0)|321|(0)|334|329|(0)|332|333|57)))|642|635|163|(0)|631|168|(0)|630|172|173|(0)|629|180|(0)|628|188|(0)(0)|209|(0)|(0)|354|(0)|365|(0)(0)|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(0)|248|(0)|(0)|338|(0)|274|(0)|287|(0)|335|294|(0)|(0)|299|(0)|321|(0)|334|329|(0)|332|333|57))|676)(5:681|(4:(1:794)(1:690)|691|(98:693|(2:695|(1:697)(3:744|(1:746)|747))(3:748|(1:758)(2:752|(96:756|699|(1:701)(2:733|(1:735)(2:736|(1:738)(2:739|(1:741)(93:742|743|703|(1:732)(2:708|(89:718|719|(1:721)(1:722)|(3:97|99|101)|(0)(0)|(0)(0)|(0)(0)|124|(0)|647|649|651|653|655|(0)(0)|658|129|(0)|132|(0)(0)|135|(1:137)|643|644|140|141|(3:144|(0)|(0))|642|635|163|(0)|631|168|(0)|630|172|173|(0)|629|180|(0)|628|188|(0)(0)|209|(0)|(0)|354|(0)|365|(0)(0)|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(0)|248|(0)|(0)|338|(0)|274|(0)|287|(0)|335|294|(0)|(0)|299|(0)|321|(0)|334|329|(0)|332|333))|723|719|(0)(0)|(0)|(0)(0)|(0)(0)|(0)(0)|124|(0)|647|649|651|653|655|(0)(0)|658|129|(0)|132|(0)(0)|135|(0)|643|644|140|141|(0)|642|635|163|(0)|631|168|(0)|630|172|173|(0)|629|180|(0)|628|188|(0)(0)|209|(0)|(0)|354|(0)|365|(0)(0)|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(0)|248|(0)|(0)|338|(0)|274|(0)|287|(0)|335|294|(0)|(0)|299|(0)|321|(0)|334|329|(0)|332|333))))|702|703|(0)|732|723|719|(0)(0)|(0)|(0)(0)|(0)(0)|(0)(0)|124|(0)|647|649|651|653|655|(0)(0)|658|129|(0)|132|(0)(0)|135|(0)|643|644|140|141|(0)|642|635|163|(0)|631|168|(0)|630|172|173|(0)|629|180|(0)|628|188|(0)(0)|209|(0)|(0)|354|(0)|365|(0)(0)|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(0)|248|(0)|(0)|338|(0)|274|(0)|287|(0)|335|294|(0)|(0)|299|(0)|321|(0)|334|329|(0)|332|333))|757)|698|699|(0)(0)|702|703|(0)|732|723|719|(0)(0)|(0)|(0)(0)|(0)(0)|(0)(0)|124|(0)|647|649|651|653|655|(0)(0)|658|129|(0)|132|(0)(0)|135|(0)|643|644|140|141|(0)|642|635|163|(0)|631|168|(0)|630|172|173|(0)|629|180|(0)|628|188|(0)(0)|209|(0)|(0)|354|(0)|365|(0)(0)|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(0)|248|(0)|(0)|338|(0)|274|(0)|287|(0)|335|294|(0)|(0)|299|(0)|321|(0)|334|329|(0)|332|333)(95:759|(2:761|(1:763)(3:765|(1:767)|747))(9:768|(1:793)(1:772)|773|(1:792)(2:777|(1:779))|791|781|(2:783|(2:785|(1:787)(94:788|743|703|(0)|732|723|719|(0)(0)|(0)|(0)(0)|(0)(0)|(0)(0)|124|(0)|647|649|651|653|655|(0)(0)|658|129|(0)|132|(0)(0)|135|(0)|643|644|140|141|(0)|642|635|163|(0)|631|168|(0)|630|172|173|(0)|629|180|(0)|628|188|(0)(0)|209|(0)|(0)|354|(0)|365|(0)(0)|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(0)|248|(0)|(0)|338|(0)|274|(0)|287|(0)|335|294|(0)|(0)|299|(0)|321|(0)|334|329|(0)|332|333)))(1:790)|789|(0)(0))|764|703|(0)|732|723|719|(0)(0)|(0)|(0)(0)|(0)(0)|(0)(0)|124|(0)|647|649|651|653|655|(0)(0)|658|129|(0)|132|(0)(0)|135|(0)|643|644|140|141|(0)|642|635|163|(0)|631|168|(0)|630|172|173|(0)|629|180|(0)|628|188|(0)(0)|209|(0)|(0)|354|(0)|365|(0)(0)|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(0)|248|(0)|(0)|338|(0)|274|(0)|287|(0)|335|294|(0)|(0)|299|(0)|321|(0)|334|329|(0)|332|333)|57)(3:795|(3:797|(2:799|(1:801))(2:803|(2:805|(1:807)))|802)(1:809)|808)|55|56|57)|677|95|(0)|(0)(0)|(0)(0)|(0)(0)|124|(0)|647|649|651|653|655|(0)(0)|658|129|(0)|132|(0)(0)|135|(0)|643|644|140|141|(0)|642|635|163|(0)|631|168|(0)|630|172|173|(0)|629|180|(0)|628|188|(0)(0)|209|(0)|(0)|354|(0)|365|(0)(0)|215|(0)|218|(0)|221|(0)(0)|(0)(0)|228|(0)(0)|236|(0)|239|240|241|(0)|(0)|248|(0)|(0)|338|(0)|274|(0)|287|(0)|335|294|(0)|(0)|299|(0)|321|(0)|334|329|(0)|332|333|57) */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x13cd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x13ec, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x054f, code lost:
    
        if (r2.local_id != 0) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x077f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0894 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x091d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x094a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0acf A[LOOP:5: B:197:0x0ac7->B:199:0x0acf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0aeb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x10e7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x11dd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x11fe  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x125a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x12c2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1307  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x136c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x13c5 A[Catch: Exception -> 0x13cd, TryCatch #5 {Exception -> 0x13cd, blocks: (B:241:0x13a7, B:243:0x13c5, B:245:0x13d1, B:247:0x13d5, B:248:0x13dc), top: B:240:0x13a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x13d1 A[Catch: Exception -> 0x13cd, TryCatch #5 {Exception -> 0x13cd, blocks: (B:241:0x13a7, B:243:0x13c5, B:245:0x13d1, B:247:0x13d5, B:248:0x13dc), top: B:240:0x13a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x13f1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x13fc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1453  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x1495  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x149b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x14b8  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x14d0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x14d6  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x14e2  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x14ef  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x1576 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x15a8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x1334  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x12e7  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x1299  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x1104  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x111a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x115d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x1194  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0e3e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0f32  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0f69  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0fc1  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1014  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x106e  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0ff1  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0f3f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0f36  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x1059  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x05a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:721:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x165b  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x16da  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x1742  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x16a7  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x0219 A[EDGE_INSN: B:868:0x0219->B:816:0x0219 BREAK  A[LOOP:2: B:47:0x01f9->B:57:0x1631], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:869:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06b1  */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showExtraNotifications(NotificationCompat.Builder builder, String str, long j, long j2, String str2, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        NotificationCompat.Builder builder2;
        int i4;
        boolean z4;
        long clientUserId;
        boolean z5;
        LongSparseArray longSparseArray;
        int size;
        LongSparseArray longSparseArray2;
        NotificationsController notificationsController;
        ArrayList arrayList;
        int i5;
        int size2;
        int i6;
        LongSparseArray longSparseArray3;
        boolean z6;
        ArrayList arrayList2;
        Notification notification;
        ArrayList<StoryNotification> arrayList3;
        int id;
        MessageObject messageObject;
        String str8;
        boolean z7;
        LongSparseArray longSparseArray4;
        long j3;
        long j4;
        long j5;
        int i7;
        LongSparseArray longSparseArray5;
        String str9;
        ArrayList<StoryNotification> arrayList4;
        long j6;
        Integer num;
        long j7;
        TLRPC.User user;
        TLRPC.User user2;
        String string;
        LongSparseArray longSparseArray6;
        SharedPreferences sharedPreferences;
        NotificationsController notificationsController2;
        int i8;
        ArrayList arrayList5;
        Notification notification2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z8;
        boolean z9;
        long j8;
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        boolean z12;
        String str15;
        TLRPC.Chat chat2;
        TLRPC.FileLocation fileLocation3;
        TLRPC.User user3;
        TLRPC.User user4;
        TLRPC.Chat chat3;
        TLRPC.User user5;
        TLRPC.FileLocation fileLocation4;
        TLRPC.Chat chat4;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation5;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ArrayList<StoryNotification> arrayList6;
        String str16;
        String string2;
        SharedPreferences sharedPreferences2;
        String str17;
        TLRPC.User user6;
        MessageObject messageObject2;
        File file;
        Bitmap bitmap;
        DialogKey dialogKey;
        String str18;
        Bitmap bitmap2;
        DialogKey dialogKey2;
        TLRPC.Chat chat5;
        String str19;
        int i9;
        ?? r9;
        String formatString;
        NotificationCompat.Action build;
        Integer num2;
        DialogKey dialogKey3;
        int max;
        long j9;
        Person person;
        NotificationCompat.Action action;
        String str20;
        String str21;
        MessageObject messageObject3;
        NotificationCompat.MessagingStyle messagingStyle;
        NotificationCompat.MessagingStyle messagingStyle2;
        int i10;
        long j10;
        long j11;
        DialogKey dialogKey4;
        long j12;
        StringBuilder sb;
        String str22;
        LongSparseArray longSparseArray7;
        String str23;
        ArrayList<TLRPC.TL_keyboardButtonRow> arrayList7;
        Bitmap bitmap3;
        int i11;
        String str24;
        boolean[] zArr;
        String str25;
        String str26;
        String str27;
        String str28;
        long j13;
        StringBuilder sb2;
        String str29;
        LongSparseArray longSparseArray8;
        String[] strArr;
        String str30;
        String str31;
        long j14;
        boolean z13;
        File file2;
        TLRPC.ChatPhoto chatPhoto2;
        TLRPC.FileLocation fileLocation6;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation7;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation8;
        String str32;
        String str33;
        TLRPC.ReplyMarkup replyMarkup;
        List messages;
        Uri uri2;
        final File file3;
        Context context;
        StringBuilder sb3;
        final Uri uriForFile;
        Bitmap createScaledBitmap;
        Canvas canvas;
        String str34;
        String str35;
        MessageObject messageObject4;
        DialogKey dialogKey5;
        Bitmap bitmap4;
        ArrayList<TLRPC.TL_keyboardButtonRow> arrayList8;
        LongSparseArray longSparseArray9;
        LongSparseArray longSparseArray10;
        long j15;
        int i12;
        NotificationCompat.Action action2;
        String str36;
        MessageObject messageObject5;
        NotificationCompat.Action action3;
        int i13;
        long j16;
        ArrayList<StoryNotification> arrayList9;
        long j17;
        NotificationCompat.Builder category;
        TLRPC.TL_keyboardButtonCopy tL_keyboardButtonCopy;
        long j18;
        TLRPC.User user7;
        int i14;
        int size3;
        int i15;
        int i16;
        ArrayList<TLRPC.TL_keyboardButtonRow> arrayList10;
        String str37;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup2;
        Intent intent;
        LongSparseArray longSparseArray11;
        int i17;
        TLRPC.User user8;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        TLRPC.FileLocation fileLocation9;
        Bitmap bitmap5;
        Bitmap decodeFile;
        String string3;
        String formatPluralString;
        TLRPC.UserProfilePhoto userProfilePhoto5;
        FileLog.d("showExtraNotifications pushMessages.size()=" + this.pushMessages.size());
        if (Build.VERSION.SDK_INT >= 26) {
            str3 = "%1$s: %2$s";
            i4 = -1;
            str4 = ".provider";
            str5 = "storyId";
            str6 = "chatId";
            str7 = "userId";
            builder2 = builder;
            builder2.setChannelId(validateChannelId(j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
        } else {
            str3 = "%1$s: %2$s";
            str4 = ".provider";
            str5 = "storyId";
            str6 = "chatId";
            str7 = "userId";
            builder2 = builder;
            i4 = -1;
        }
        Notification build2 = builder.build();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        ArrayList arrayList11 = new ArrayList();
        NotificationsController notificationsController3 = this;
        if (!notificationsController3.storyPushMessages.isEmpty()) {
            arrayList11.add(new DialogKey(0L, 0L, true));
        }
        LongSparseArray longSparseArray12 = new LongSparseArray();
        for (int i18 = 0; i18 < notificationsController3.pushMessages.size(); i18++) {
            MessageObject messageObject6 = notificationsController3.pushMessages.get(i18);
            long dialogId = messageObject6.getDialogId();
            long topicId = MessageObject.getTopicId(notificationsController3.currentAccount, messageObject6.messageOwner, getMessagesController().isForum(messageObject6));
            int i19 = notificationsSettings.getInt("dismissDate" + dialogId, 0);
            if (!messageObject6.isStoryPush && messageObject6.messageOwner.date <= i19) {
                FileLog.d("showExtraNotifications: dialog " + dialogId + " is skipped, message date (" + messageObject6.messageOwner.date + " <= " + i19 + ")");
            } else {
                ArrayList arrayList12 = (ArrayList) longSparseArray12.get(dialogId);
                if (arrayList12 == null) {
                    arrayList12 = new ArrayList();
                    longSparseArray12.put(dialogId, arrayList12);
                    FileLog.d("showExtraNotifications: sortedDialogs += " + dialogId);
                    arrayList11.add(new DialogKey(dialogId, topicId, false));
                }
                arrayList12.add(messageObject6);
            }
        }
        int i20 = 0;
        LongSparseArray longSparseArray13 = new LongSparseArray();
        for (int i21 = 0; i21 < notificationsController3.wearNotificationsIds.size(); i21++) {
            longSparseArray13.put(notificationsController3.wearNotificationsIds.keyAt(i21), (Integer) notificationsController3.wearNotificationsIds.valueAt(i21));
        }
        notificationsController3.wearNotificationsIds.clear();
        ArrayList arrayList13 = new ArrayList();
        int i22 = Build.VERSION.SDK_INT;
        if (i22 > 27) {
            if (arrayList11.size() <= (notificationsController3.storyPushMessages.isEmpty() ? 1 : 2)) {
                z4 = false;
                if (z4 && i22 >= 26) {
                    checkOtherNotificationsChannel();
                }
                clientUserId = getUserConfig().getClientUserId();
                z5 = !AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter;
                FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() <= 0) + " waitingForPasscode=" + z5 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z4);
                longSparseArray = new LongSparseArray();
                size = arrayList11.size();
                while (true) {
                    if (i20 < size) {
                        break;
                    }
                    int i23 = size;
                    if (arrayList13.size() >= 7) {
                        FileLog.d("showExtraNotifications: break from holders, count over 7");
                        break;
                    }
                    DialogKey dialogKey6 = (DialogKey) arrayList11.get(i20);
                    ArrayList arrayList14 = arrayList13;
                    int i24 = i20;
                    if (dialogKey6.story) {
                        ArrayList<StoryNotification> arrayList15 = new ArrayList<>();
                        if (notificationsController3.storyPushMessages.isEmpty()) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("showExtraNotifications: [");
                            arrayList2 = arrayList11;
                            sb4.append(dialogKey6.dialogId);
                            sb4.append("] continue; story but storyPushMessages is empty");
                            FileLog.d(sb4.toString());
                            z9 = z4;
                            j8 = clientUserId;
                            longSparseArray6 = longSparseArray;
                            longSparseArray5 = longSparseArray13;
                            longSparseArray4 = longSparseArray12;
                            sharedPreferences = notificationsSettings;
                            notificationsController2 = notificationsController3;
                            i8 = i23;
                            arrayList5 = arrayList14;
                            notification2 = build2;
                            str10 = str3;
                            str11 = str4;
                            str12 = str5;
                            str13 = str6;
                            str14 = str7;
                            z8 = z5;
                            i14 = i24;
                            i20 = i14 + 1;
                            arrayList13 = arrayList5;
                            size = i8;
                            str5 = str12;
                            z5 = z8;
                            arrayList11 = arrayList2;
                            z4 = z9;
                            longSparseArray12 = longSparseArray4;
                            clientUserId = j8;
                            str6 = str13;
                            str7 = str14;
                            str4 = str11;
                            longSparseArray13 = longSparseArray5;
                            longSparseArray = longSparseArray6;
                            build2 = notification2;
                            notificationsController3 = notificationsController2;
                            str3 = str10;
                            notificationsSettings = sharedPreferences;
                            i4 = -1;
                        } else {
                            arrayList2 = arrayList11;
                            notification = build2;
                            boolean z14 = z4;
                            z6 = z5;
                            long j19 = notificationsController3.storyPushMessages.get(0).dialogId;
                            Iterator<Integer> it = notificationsController3.storyPushMessages.get(0).dateByIds.keySet().iterator();
                            int i25 = 0;
                            while (it.hasNext()) {
                                i25 = Math.max(i25, it.next().intValue());
                                arrayList15 = arrayList15;
                            }
                            str8 = "showExtraNotifications: [";
                            longSparseArray4 = longSparseArray12;
                            id = i25;
                            j3 = 0;
                            messageObject = null;
                            z7 = z14;
                            j4 = j19;
                            arrayList3 = arrayList15;
                        }
                    } else {
                        z6 = z5;
                        arrayList2 = arrayList11;
                        notification = build2;
                        boolean z15 = z4;
                        long j20 = dialogKey6.dialogId;
                        long j21 = dialogKey6.topicId;
                        ArrayList<StoryNotification> arrayList16 = (ArrayList) longSparseArray12.get(j20);
                        arrayList3 = arrayList16;
                        id = ((MessageObject) arrayList16.get(0)).getId();
                        messageObject = (MessageObject) arrayList16.get(0);
                        str8 = "showExtraNotifications: [";
                        z7 = z15;
                        longSparseArray4 = longSparseArray12;
                        j3 = j21;
                        j4 = j20;
                    }
                    int i26 = (Integer) longSparseArray13.get(dialogKey6.dialogId);
                    if (dialogKey6.story) {
                        i26 = 2147483646;
                        j5 = j3;
                    } else if (i26 == null) {
                        j5 = j3;
                        long j22 = dialogKey6.dialogId;
                        i26 = Integer.valueOf(((int) j22) + ((int) (j22 >> 32)));
                    } else {
                        j5 = j3;
                        longSparseArray13.remove(dialogKey6.dialogId);
                    }
                    Integer num3 = i26;
                    int i27 = 0;
                    for (int i28 = 0; i28 < arrayList3.size(); i28++) {
                        if (i27 < ((MessageObject) arrayList3.get(i28)).messageOwner.date) {
                            i27 = ((MessageObject) arrayList3.get(i28)).messageOwner.date;
                        }
                    }
                    if (dialogKey6.story) {
                        TLRPC.User user9 = getMessagesController().getUser(Long.valueOf(j4));
                        longSparseArray5 = longSparseArray13;
                        if (notificationsController3.storyPushMessages.size() == 1) {
                            if (user9 != null) {
                                formatPluralString = UserObject.getFirstName(user9);
                            } else {
                                formatPluralString = notificationsController3.storyPushMessages.get(0).localName;
                            }
                            i7 = i27;
                        } else {
                            i7 = i27;
                            formatPluralString = LocaleController.formatPluralString("Stories", notificationsController3.storyPushMessages.size(), new Object[0]);
                        }
                        if (user9 == null || (userProfilePhoto5 = user9.photo) == null || (fileLocation4 = userProfilePhoto5.photo_small) == null) {
                            str9 = "Stories";
                        } else {
                            str9 = "Stories";
                            if (fileLocation4.volume_id != 0 && fileLocation4.local_id != 0) {
                                user2 = user9;
                                arrayList4 = arrayList3;
                                string = formatPluralString;
                                j6 = clientUserId;
                                num = num3;
                                j7 = j5;
                                z10 = false;
                                chat4 = null;
                                z12 = false;
                                z11 = false;
                                if (messageObject != null && messageObject.isStoryReactionPush && !notificationsSettings.getBoolean("EnableReactionsPreview", true)) {
                                    string = LocaleController.getString(R.string.NotificationHiddenChatName);
                                    fileLocation4 = null;
                                    z10 = false;
                                }
                                if (z6) {
                                    sharedPreferences2 = notificationsSettings;
                                    str17 = string;
                                } else {
                                    if (DialogObject.isChatDialog(j4)) {
                                        string3 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                    } else {
                                        string3 = LocaleController.getString(R.string.NotificationHiddenName);
                                    }
                                    sharedPreferences2 = notificationsSettings;
                                    str17 = string3;
                                    fileLocation4 = null;
                                    z10 = false;
                                }
                                if (fileLocation4 == null) {
                                    File pathToAttach = getFileLoader().getPathToAttach(fileLocation4, true);
                                    user6 = user2;
                                    if (Build.VERSION.SDK_INT < 28) {
                                        messageObject2 = messageObject;
                                        bitmap5 = null;
                                        BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation4, null, "50_50");
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
                                        messageObject2 = messageObject;
                                        bitmap5 = null;
                                    }
                                    file = pathToAttach;
                                    bitmap = bitmap5;
                                } else {
                                    user6 = user2;
                                    messageObject2 = messageObject;
                                    file = null;
                                    bitmap = null;
                                }
                                if (chat4 == null) {
                                    Person.Builder name = new Person.Builder().setName(str17);
                                    if (file != null && file.exists() && Build.VERSION.SDK_INT >= 28) {
                                        loadRoundAvatar(j4, file, name);
                                    }
                                    dialogKey = dialogKey6;
                                    str18 = str17;
                                    longSparseArray.put(-chat4.id, name.build());
                                } else {
                                    dialogKey = dialogKey6;
                                    str18 = str17;
                                }
                                File file4 = file;
                                if ((z12 || z11) && z10 && !SharedConfig.isWaitingForPasscodeEnter && j6 != j4 && !UserObject.isReplyUser(j4) && MessagesController.getInstance(notificationsController3.currentAccount).getSendPaidMessagesStars(j4) <= 0) {
                                    bitmap2 = bitmap;
                                    Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                    intent2.putExtra("dialog_id", j4);
                                    int i29 = id;
                                    intent2.putExtra("max_id", i29);
                                    intent2.putExtra("topic_id", j7);
                                    intent2.putExtra("currentAccount", notificationsController3.currentAccount);
                                    dialogKey2 = dialogKey;
                                    chat5 = chat4;
                                    PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent2, 167772160);
                                    RemoteInput build3 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                                    if (!DialogObject.isChatDialog(j4)) {
                                        str19 = "max_id";
                                        formatString = LocaleController.formatString(R.string.ReplyToGroup, str18);
                                        i9 = i29;
                                        r9 = 1;
                                    } else {
                                        str19 = "max_id";
                                        i9 = i29;
                                        r9 = 1;
                                        formatString = LocaleController.formatString(R.string.ReplyToUser, str18);
                                    }
                                    build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build3).setShowsUserInterface(false).build();
                                } else {
                                    str19 = "max_id";
                                    chat5 = chat4;
                                    bitmap2 = bitmap;
                                    i9 = id;
                                    dialogKey2 = dialogKey;
                                    build = null;
                                }
                                num2 = (Integer) notificationsController3.pushDialogs.get(j4);
                                if (num2 == null) {
                                    num2 = 0;
                                }
                                dialogKey3 = dialogKey2;
                                if (!dialogKey3.story) {
                                    max = notificationsController3.storyPushMessages.size();
                                } else {
                                    max = Math.max(num2.intValue(), arrayList4.size());
                                }
                                String format = (max > 1 || Build.VERSION.SDK_INT >= 28) ? str18 : String.format("%1$s (%2$d)", str18, Integer.valueOf(max));
                                long j23 = j4;
                                j9 = j6;
                                person = (Person) longSparseArray.get(j9);
                                if (Build.VERSION.SDK_INT >= 28 && person == null) {
                                    user8 = getMessagesController().getUser(Long.valueOf(j9));
                                    if (user8 == null) {
                                        user8 = getUserConfig().getCurrentUser();
                                    }
                                    if (user8 != null) {
                                        try {
                                            userProfilePhoto4 = user8.photo;
                                        } catch (Throwable th) {
                                            th = th;
                                            action = build;
                                            str20 = "dialog_id";
                                        }
                                        if (userProfilePhoto4 != null && (fileLocation9 = userProfilePhoto4.photo_small) != null) {
                                            action = build;
                                            str20 = "dialog_id";
                                            try {
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str21 = "currentAccount";
                                                FileLog.e(th);
                                                messageObject3 = messageObject2;
                                                if (messageObject2 == null) {
                                                }
                                                String str38 = "";
                                                if (person == null) {
                                                }
                                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                                messagingStyle2 = messagingStyle;
                                                i10 = Build.VERSION.SDK_INT;
                                                if (i10 >= 28) {
                                                }
                                                messagingStyle2.setConversationTitle(format);
                                                messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j23)) || UserObject.isReplyUser(j23));
                                                StringBuilder sb5 = new StringBuilder();
                                                String str39 = str21;
                                                String[] strArr2 = new String[1];
                                                boolean[] zArr2 = new boolean[1];
                                                if (!dialogKey3.story) {
                                                }
                                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                intent3.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent3.setFlags(67108864);
                                                intent3.addCategory("android.intent.category.LAUNCHER");
                                                if (messageObject3 == null) {
                                                }
                                                if (messageObject3 == null) {
                                                }
                                                String str40 = str5;
                                                if (messageObject3 == null) {
                                                }
                                                LongSparseArray longSparseArray14 = longSparseArray7;
                                                str34 = str6;
                                                str35 = str7;
                                                messageObject4 = messageObject3;
                                                dialogKey5 = dialogKey4;
                                                if (!dialogKey5.story) {
                                                }
                                                StringBuilder sb6 = new StringBuilder();
                                                sb6.append("show extra notifications chatId ");
                                                sb6.append(j11);
                                                sb6.append(" topicId ");
                                                j15 = j12;
                                                sb6.append(j15);
                                                FileLog.d(sb6.toString());
                                                if (j15 != 0) {
                                                }
                                                String str41 = str39;
                                                intent3.putExtra(str41, notificationsController3.currentAccount);
                                                PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3, 1140850688);
                                                NotificationCompat.WearableExtender wearableExtender = new NotificationCompat.WearableExtender();
                                                NotificationCompat.Action action4 = action;
                                                if (action != null) {
                                                }
                                                String str42 = str22;
                                                Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                intent4.addFlags(32);
                                                intent4.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                intent4.putExtra(str20, j11);
                                                int i30 = i9;
                                                intent4.putExtra(str19, i30);
                                                intent4.putExtra(str41, notificationsController3.currentAccount);
                                                String str43 = str34;
                                                String str44 = str35;
                                                NotificationCompat.Action build4 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent4, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                if (DialogObject.isEncryptedDialog(j11)) {
                                                }
                                                if (str36 != null) {
                                                }
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append("tgaccount");
                                                int i31 = i12;
                                                long j24 = j10;
                                                sb7.append(j24);
                                                wearableExtender.setBridgeTag(sb7.toString());
                                                if (dialogKey5.story) {
                                                }
                                                NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                                if (dialogKey5.story) {
                                                }
                                                category = autoCancel.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity).extend(wearableExtender).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent.putExtra("messageDate", i7);
                                                intent.putExtra("dialogId", j11);
                                                intent.putExtra(str41, notificationsController3.currentAccount);
                                                if (dialogKey5.story) {
                                                }
                                                if (messageObject5 != null) {
                                                }
                                                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                                if (z7) {
                                                }
                                                if (messageObject5 != null) {
                                                }
                                                tL_keyboardButtonCopy = null;
                                                if (tL_keyboardButtonCopy != null) {
                                                }
                                                j18 = dialogKey5.dialogId;
                                                if (j18 != UserObject.VERIFY) {
                                                }
                                                if (arrayList2.size() != 1) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j11)) {
                                                }
                                                if (bitmap4 != null) {
                                                }
                                                if (!AndroidUtilities.needShowPasscode(false)) {
                                                }
                                                if (chat5 == null) {
                                                }
                                                user7 = user6;
                                                Notification notification3 = notification;
                                                boolean z16 = z7;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                FileLog.d("showExtraNotifications: holders.add " + j11);
                                                i8 = i23;
                                                str10 = str23;
                                                z8 = z6;
                                                j8 = j16;
                                                z9 = z16;
                                                longSparseArray6 = longSparseArray9;
                                                str12 = str5;
                                                i14 = i24;
                                                str11 = str42;
                                                notification2 = notification3;
                                                str14 = str44;
                                                sharedPreferences = sharedPreferences2;
                                                str13 = str43;
                                                arrayList5 = arrayList14;
                                                arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                                notificationsController2 = this;
                                                notificationsController2.wearNotificationsIds.put(j11, num);
                                                i20 = i14 + 1;
                                                arrayList13 = arrayList5;
                                                size = i8;
                                                str5 = str12;
                                                z5 = z8;
                                                arrayList11 = arrayList2;
                                                z4 = z9;
                                                longSparseArray12 = longSparseArray4;
                                                clientUserId = j8;
                                                str6 = str13;
                                                str7 = str14;
                                                str4 = str11;
                                                longSparseArray13 = longSparseArray5;
                                                longSparseArray = longSparseArray6;
                                                build2 = notification2;
                                                notificationsController3 = notificationsController2;
                                                str3 = str10;
                                                notificationsSettings = sharedPreferences;
                                                i4 = -1;
                                            }
                                            if (fileLocation9.volume_id != 0 && fileLocation9.local_id != 0) {
                                                Person.Builder name2 = new Person.Builder().setName(LocaleController.getString(R.string.FromYou));
                                                str21 = "currentAccount";
                                                try {
                                                    loadRoundAvatar(getUserConfig().getClientUserId(), getFileLoader().getPathToAttach(user8.photo.photo_small, true), name2);
                                                    person = name2.build();
                                                    longSparseArray.put(j9, person);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    FileLog.e(th);
                                                    messageObject3 = messageObject2;
                                                    if (messageObject2 == null) {
                                                    }
                                                    String str382 = "";
                                                    if (person == null) {
                                                    }
                                                    messagingStyle = new NotificationCompat.MessagingStyle("");
                                                    messagingStyle2 = messagingStyle;
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 >= 28) {
                                                    }
                                                    messagingStyle2.setConversationTitle(format);
                                                    messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j23)) || UserObject.isReplyUser(j23));
                                                    StringBuilder sb52 = new StringBuilder();
                                                    String str392 = str21;
                                                    String[] strArr22 = new String[1];
                                                    boolean[] zArr22 = new boolean[1];
                                                    if (!dialogKey3.story) {
                                                    }
                                                    Intent intent32 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                    intent32.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                    intent32.setFlags(67108864);
                                                    intent32.addCategory("android.intent.category.LAUNCHER");
                                                    if (messageObject3 == null) {
                                                    }
                                                    if (messageObject3 == null) {
                                                    }
                                                    String str402 = str5;
                                                    if (messageObject3 == null) {
                                                    }
                                                    LongSparseArray longSparseArray142 = longSparseArray7;
                                                    str34 = str6;
                                                    str35 = str7;
                                                    messageObject4 = messageObject3;
                                                    dialogKey5 = dialogKey4;
                                                    if (!dialogKey5.story) {
                                                    }
                                                    StringBuilder sb62 = new StringBuilder();
                                                    sb62.append("show extra notifications chatId ");
                                                    sb62.append(j11);
                                                    sb62.append(" topicId ");
                                                    j15 = j12;
                                                    sb62.append(j15);
                                                    FileLog.d(sb62.toString());
                                                    if (j15 != 0) {
                                                    }
                                                    String str412 = str392;
                                                    intent32.putExtra(str412, notificationsController3.currentAccount);
                                                    PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32, 1140850688);
                                                    NotificationCompat.WearableExtender wearableExtender2 = new NotificationCompat.WearableExtender();
                                                    NotificationCompat.Action action42 = action;
                                                    if (action != null) {
                                                    }
                                                    String str422 = str22;
                                                    Intent intent42 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                    intent42.addFlags(32);
                                                    intent42.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                    intent42.putExtra(str20, j11);
                                                    int i302 = i9;
                                                    intent42.putExtra(str19, i302);
                                                    intent42.putExtra(str412, notificationsController3.currentAccount);
                                                    String str432 = str34;
                                                    String str442 = str35;
                                                    NotificationCompat.Action build42 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent42, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                    if (DialogObject.isEncryptedDialog(j11)) {
                                                    }
                                                    if (str36 != null) {
                                                    }
                                                    StringBuilder sb72 = new StringBuilder();
                                                    sb72.append("tgaccount");
                                                    int i312 = i12;
                                                    long j242 = j10;
                                                    sb72.append(j242);
                                                    wearableExtender2.setBridgeTag(sb72.toString());
                                                    if (dialogKey5.story) {
                                                    }
                                                    NotificationCompat.Builder autoCancel2 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                                    if (dialogKey5.story) {
                                                    }
                                                    category = autoCancel2.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity2).extend(wearableExtender2).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                    intent.putExtra("messageDate", i7);
                                                    intent.putExtra("dialogId", j11);
                                                    intent.putExtra(str412, notificationsController3.currentAccount);
                                                    if (dialogKey5.story) {
                                                    }
                                                    if (messageObject5 != null) {
                                                    }
                                                    category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                                    if (z7) {
                                                    }
                                                    if (messageObject5 != null) {
                                                    }
                                                    tL_keyboardButtonCopy = null;
                                                    if (tL_keyboardButtonCopy != null) {
                                                    }
                                                    j18 = dialogKey5.dialogId;
                                                    if (j18 != UserObject.VERIFY) {
                                                    }
                                                    if (arrayList2.size() != 1) {
                                                    }
                                                    if (DialogObject.isEncryptedDialog(j11)) {
                                                    }
                                                    if (bitmap4 != null) {
                                                    }
                                                    if (!AndroidUtilities.needShowPasscode(false)) {
                                                    }
                                                    if (chat5 == null) {
                                                    }
                                                    user7 = user6;
                                                    Notification notification32 = notification;
                                                    boolean z162 = z7;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                    }
                                                    FileLog.d("showExtraNotifications: holders.add " + j11);
                                                    i8 = i23;
                                                    str10 = str23;
                                                    z8 = z6;
                                                    j8 = j16;
                                                    z9 = z162;
                                                    longSparseArray6 = longSparseArray9;
                                                    str12 = str5;
                                                    i14 = i24;
                                                    str11 = str422;
                                                    notification2 = notification32;
                                                    str14 = str442;
                                                    sharedPreferences = sharedPreferences2;
                                                    str13 = str432;
                                                    arrayList5 = arrayList14;
                                                    arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                                    notificationsController2 = this;
                                                    notificationsController2.wearNotificationsIds.put(j11, num);
                                                    i20 = i14 + 1;
                                                    arrayList13 = arrayList5;
                                                    size = i8;
                                                    str5 = str12;
                                                    z5 = z8;
                                                    arrayList11 = arrayList2;
                                                    z4 = z9;
                                                    longSparseArray12 = longSparseArray4;
                                                    clientUserId = j8;
                                                    str6 = str13;
                                                    str7 = str14;
                                                    str4 = str11;
                                                    longSparseArray13 = longSparseArray5;
                                                    longSparseArray = longSparseArray6;
                                                    build2 = notification2;
                                                    notificationsController3 = notificationsController2;
                                                    str3 = str10;
                                                    notificationsSettings = sharedPreferences;
                                                    i4 = -1;
                                                }
                                                messageObject3 = messageObject2;
                                                boolean z17 = (messageObject2 == null && (messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                                String str3822 = "";
                                                if (person == null && z17) {
                                                    messagingStyle = new NotificationCompat.MessagingStyle(person);
                                                } else {
                                                    messagingStyle = new NotificationCompat.MessagingStyle("");
                                                }
                                                messagingStyle2 = messagingStyle;
                                                i10 = Build.VERSION.SDK_INT;
                                                if (i10 >= 28 || ((DialogObject.isChatDialog(j23) && !z12) || UserObject.isReplyUser(j23))) {
                                                    messagingStyle2.setConversationTitle(format);
                                                }
                                                messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j23)) || UserObject.isReplyUser(j23));
                                                StringBuilder sb522 = new StringBuilder();
                                                String str3922 = str21;
                                                String[] strArr222 = new String[1];
                                                boolean[] zArr222 = new boolean[1];
                                                if (!dialogKey3.story) {
                                                    ArrayList<String> arrayList17 = new ArrayList<>();
                                                    ArrayList<Object> arrayList18 = new ArrayList<>();
                                                    Pair<Integer, Boolean> parseStoryPushes = notificationsController3.parseStoryPushes(arrayList17, arrayList18);
                                                    int intValue = ((Integer) parseStoryPushes.first).intValue();
                                                    boolean booleanValue = ((Boolean) parseStoryPushes.second).booleanValue();
                                                    if (booleanValue) {
                                                        sb522.append(LocaleController.formatPluralString("StoryNotificationHidden", intValue, new Object[0]));
                                                    } else if (arrayList17.isEmpty()) {
                                                        FileLog.d(str8 + j23 + "] continue; story but names is empty");
                                                        longSparseArray6 = longSparseArray;
                                                        notificationsController2 = notificationsController3;
                                                        i8 = i23;
                                                        arrayList5 = arrayList14;
                                                        notification2 = notification;
                                                        str10 = str3;
                                                        str11 = str4;
                                                        str12 = str5;
                                                        str14 = str7;
                                                        z8 = z6;
                                                        z9 = z7;
                                                        sharedPreferences = sharedPreferences2;
                                                        j8 = j9;
                                                        i14 = i24;
                                                        str13 = str6;
                                                        i20 = i14 + 1;
                                                        arrayList13 = arrayList5;
                                                        size = i8;
                                                        str5 = str12;
                                                        z5 = z8;
                                                        arrayList11 = arrayList2;
                                                        z4 = z9;
                                                        longSparseArray12 = longSparseArray4;
                                                        clientUserId = j8;
                                                        str6 = str13;
                                                        str7 = str14;
                                                        str4 = str11;
                                                        longSparseArray13 = longSparseArray5;
                                                        longSparseArray = longSparseArray6;
                                                        build2 = notification2;
                                                        notificationsController3 = notificationsController2;
                                                        str3 = str10;
                                                        notificationsSettings = sharedPreferences;
                                                        i4 = -1;
                                                    } else if (arrayList17.size() != 1) {
                                                        dialogKey4 = dialogKey3;
                                                        if (arrayList17.size() != 2) {
                                                            longSparseArray11 = longSparseArray;
                                                            if (arrayList17.size() == 3 && notificationsController3.storyPushMessages.size() == 3) {
                                                                j10 = j9;
                                                                sb522.append(LocaleController.formatString(R.string.StoryNotification3, notificationsController3.cutLastName(arrayList17.get(0)), notificationsController3.cutLastName(arrayList17.get(1)), notificationsController3.cutLastName(arrayList17.get(2))));
                                                            } else {
                                                                j10 = j9;
                                                                sb522.append(LocaleController.formatPluralString("StoryNotification4", notificationsController3.storyPushMessages.size() - 2, notificationsController3.cutLastName(arrayList17.get(0)), notificationsController3.cutLastName(arrayList17.get(1))));
                                                            }
                                                            long j25 = Long.MAX_VALUE;
                                                            while (i17 < notificationsController3.storyPushMessages.size()) {
                                                            }
                                                            messagingStyle2.setGroupConversation(false);
                                                            if (arrayList17.size() == 1) {
                                                            }
                                                            messagingStyle2.addMessage(sb522, j25, new Person.Builder().setName(r0).build());
                                                            if (booleanValue) {
                                                            }
                                                            str23 = str3;
                                                        } else {
                                                            longSparseArray11 = longSparseArray;
                                                            sb522.append(LocaleController.formatString(R.string.StoryNotification2, arrayList17.get(0), arrayList17.get(1)));
                                                            j10 = j9;
                                                            long j252 = Long.MAX_VALUE;
                                                            while (i17 < notificationsController3.storyPushMessages.size()) {
                                                            }
                                                            messagingStyle2.setGroupConversation(false);
                                                            if (arrayList17.size() == 1) {
                                                            }
                                                            messagingStyle2.addMessage(sb522, j252, new Person.Builder().setName(r0).build());
                                                            if (booleanValue) {
                                                            }
                                                            str23 = str3;
                                                        }
                                                    } else if (intValue == 1) {
                                                        sb522.append(LocaleController.getString("StoryNotificationSingle"));
                                                    } else {
                                                        dialogKey4 = dialogKey3;
                                                        sb522.append(LocaleController.formatPluralString("StoryNotification1", intValue, arrayList17.get(0)));
                                                        longSparseArray11 = longSparseArray;
                                                        j10 = j9;
                                                        long j2522 = Long.MAX_VALUE;
                                                        for (i17 = 0; i17 < notificationsController3.storyPushMessages.size(); i17++) {
                                                            j2522 = Math.min(notificationsController3.storyPushMessages.get(i17).date, j2522);
                                                        }
                                                        messagingStyle2.setGroupConversation(false);
                                                        String formatPluralString2 = (arrayList17.size() == 1 || booleanValue) ? LocaleController.formatPluralString(str9, intValue, new Object[0]) : arrayList17.get(0);
                                                        messagingStyle2.addMessage(sb522, j2522, new Person.Builder().setName(formatPluralString2).build());
                                                        if (booleanValue) {
                                                            j12 = j7;
                                                            sb = sb522;
                                                            bitmap3 = loadMultipleAvatars(arrayList18);
                                                            str22 = str4;
                                                            j11 = j23;
                                                            longSparseArray7 = longSparseArray11;
                                                            arrayList7 = null;
                                                            i11 = 0;
                                                            str24 = formatPluralString2;
                                                        } else {
                                                            str24 = formatPluralString2;
                                                            j12 = j7;
                                                            sb = sb522;
                                                            str22 = str4;
                                                            j11 = j23;
                                                            longSparseArray7 = longSparseArray11;
                                                            bitmap3 = null;
                                                            arrayList7 = null;
                                                            i11 = 0;
                                                        }
                                                        str23 = str3;
                                                    }
                                                    dialogKey4 = dialogKey3;
                                                    longSparseArray11 = longSparseArray;
                                                    j10 = j9;
                                                    long j25222 = Long.MAX_VALUE;
                                                    while (i17 < notificationsController3.storyPushMessages.size()) {
                                                    }
                                                    messagingStyle2.setGroupConversation(false);
                                                    if (arrayList17.size() == 1) {
                                                    }
                                                    messagingStyle2.addMessage(sb522, j25222, new Person.Builder().setName(formatPluralString2).build());
                                                    if (booleanValue) {
                                                    }
                                                    str23 = str3;
                                                } else {
                                                    LongSparseArray longSparseArray15 = longSparseArray;
                                                    j10 = j9;
                                                    String str45 = str8;
                                                    j11 = j23;
                                                    dialogKey4 = dialogKey3;
                                                    int size4 = arrayList4.size() - 1;
                                                    int i32 = 0;
                                                    ArrayList<TLRPC.TL_keyboardButtonRow> arrayList19 = null;
                                                    while (size4 >= 0) {
                                                        int i33 = i32;
                                                        MessageObject messageObject7 = (MessageObject) arrayList4.get(size4);
                                                        int i34 = size4;
                                                        NotificationCompat.MessagingStyle messagingStyle3 = messagingStyle2;
                                                        long topicId2 = MessageObject.getTopicId(notificationsController3.currentAccount, messageObject7.messageOwner, getMessagesController().isForum(messageObject7));
                                                        if (j7 != topicId2) {
                                                            FileLog.d(str45 + j11 + "] continue; topic id is not equal: topicId=" + j7 + " messageTopicId=" + topicId2 + "; selfId=" + getUserConfig().getClientUserId());
                                                            zArr = zArr222;
                                                            j14 = j7;
                                                            sb2 = sb522;
                                                            z13 = z12;
                                                            strArr = strArr222;
                                                            str29 = str18;
                                                            str32 = str4;
                                                            longSparseArray8 = longSparseArray15;
                                                            messagingStyle2 = messagingStyle3;
                                                            str31 = str3;
                                                            str27 = str45;
                                                            str33 = str3822;
                                                        } else {
                                                            String shortStringForMessage = notificationsController3.getShortStringForMessage(messageObject7, strArr222, zArr222);
                                                            if (j11 == UserObject.OAUTH) {
                                                                strArr222[0] = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                                                zArr = zArr222;
                                                                str25 = str3822;
                                                            } else if (j11 != UserObject.VERIFY || messageObject7.getForwardedFromId() == null) {
                                                                zArr = zArr222;
                                                                str25 = str3822;
                                                                if (j11 == j10) {
                                                                    strArr222[0] = str18;
                                                                } else if (DialogObject.isChatDialog(j11) && messageObject7.messageOwner.from_scheduled) {
                                                                    strArr222[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                                                }
                                                            } else {
                                                                zArr = zArr222;
                                                                str25 = str3822;
                                                                strArr222[0] = getMessagesController().getPeerName(messageObject7.getForwardedFromId().longValue());
                                                            }
                                                            if (shortStringForMessage == null) {
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    FileLog.w("message text is null for " + messageObject7.getId() + " did = " + messageObject7.getDialogId());
                                                                }
                                                                j14 = j7;
                                                                sb2 = sb522;
                                                                z13 = z12;
                                                                strArr = strArr222;
                                                                str29 = str18;
                                                                str32 = str4;
                                                                longSparseArray8 = longSparseArray15;
                                                                messagingStyle2 = messagingStyle3;
                                                                str31 = str3;
                                                                str27 = str45;
                                                                str33 = str25;
                                                            } else {
                                                                if (sb522.length() > 0) {
                                                                    sb522.append("\n\n");
                                                                }
                                                                if (j11 != j10 && messageObject7.messageOwner.from_scheduled && DialogObject.isUserDialog(j11)) {
                                                                    str26 = str3;
                                                                    String format2 = String.format(str26, LocaleController.getString(R.string.NotificationMessageScheduledName), shortStringForMessage);
                                                                    sb522.append(format2);
                                                                    str28 = format2;
                                                                    str27 = str45;
                                                                } else {
                                                                    str26 = str3;
                                                                    String str46 = strArr222[0];
                                                                    if (str46 != null) {
                                                                        str27 = str45;
                                                                        sb522.append(String.format(str26, str46, shortStringForMessage));
                                                                    } else {
                                                                        str27 = str45;
                                                                        sb522.append(shortStringForMessage);
                                                                    }
                                                                    str28 = shortStringForMessage;
                                                                }
                                                                if (j11 == UserObject.VERIFY && messageObject7.getForwardedFromId() != null) {
                                                                    j13 = messageObject7.getForwardedFromId().longValue();
                                                                } else {
                                                                    if (!DialogObject.isUserDialog(j11)) {
                                                                        if (z12) {
                                                                            j13 = -j11;
                                                                        } else if (DialogObject.isChatDialog(j11)) {
                                                                            j13 = messageObject7.getSenderId();
                                                                        }
                                                                    }
                                                                    j13 = j11;
                                                                }
                                                                sb2 = sb522;
                                                                str29 = str18;
                                                                longSparseArray8 = longSparseArray15;
                                                                Person person2 = (Person) longSparseArray8.get(j13 + (j7 << 16));
                                                                String str47 = strArr222[0];
                                                                if (str47 == null) {
                                                                    if (z6) {
                                                                        if (!DialogObject.isChatDialog(j11)) {
                                                                            strArr = strArr222;
                                                                            if (Build.VERSION.SDK_INT > 27) {
                                                                                str47 = LocaleController.getString(R.string.NotificationHiddenName);
                                                                            }
                                                                        } else if (z12) {
                                                                            strArr = strArr222;
                                                                            if (Build.VERSION.SDK_INT > 27) {
                                                                                str47 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                                            }
                                                                        } else {
                                                                            strArr = strArr222;
                                                                            str47 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                                                        }
                                                                        if (person2 == null && TextUtils.equals(person2.getName(), str30)) {
                                                                            str31 = str26;
                                                                            j14 = j7;
                                                                            z13 = z12;
                                                                        } else {
                                                                            Person.Builder name3 = new Person.Builder().setName(str30);
                                                                            if (zArr[0] || DialogObject.isEncryptedDialog(j11) || Build.VERSION.SDK_INT < 28) {
                                                                                str31 = str26;
                                                                                j14 = j7;
                                                                                z13 = z12;
                                                                            } else {
                                                                                if (DialogObject.isUserDialog(j11) || z12) {
                                                                                    str31 = str26;
                                                                                    j14 = j7;
                                                                                    z13 = z12;
                                                                                    file2 = file4;
                                                                                } else {
                                                                                    long senderId = messageObject7.getSenderId();
                                                                                    str31 = str26;
                                                                                    z13 = z12;
                                                                                    TLRPC.User user10 = getMessagesController().getUser(Long.valueOf(senderId));
                                                                                    if (user10 == null && (user10 = getMessagesStorage().getUserSync(senderId)) != null) {
                                                                                        getMessagesController().putUser(user10, true);
                                                                                    }
                                                                                    if (user10 == null || (userProfilePhoto3 = user10.photo) == null || (fileLocation8 = userProfilePhoto3.photo_small) == null) {
                                                                                        j14 = j7;
                                                                                    } else {
                                                                                        j14 = j7;
                                                                                        if (fileLocation8.volume_id != 0 && fileLocation8.local_id != 0) {
                                                                                            file2 = getFileLoader().getPathToAttach(user10.photo.photo_small, true);
                                                                                        }
                                                                                    }
                                                                                    file2 = null;
                                                                                }
                                                                                if (file2 == null && j11 == UserObject.VERIFY && messageObject7.getForwardedFromId() != null) {
                                                                                    if (j13 >= 0) {
                                                                                        TLRPC.User user11 = getMessagesController().getUser(Long.valueOf(j13));
                                                                                        if (user11 != null && (userProfilePhoto2 = user11.photo) != null && (fileLocation7 = userProfilePhoto2.photo_small) != null && fileLocation7.volume_id != 0 && fileLocation7.local_id != 0) {
                                                                                            file2 = getFileLoader().getPathToAttach(user11.photo.photo_small, true);
                                                                                        }
                                                                                    } else {
                                                                                        TLRPC.Chat chat6 = getMessagesController().getChat(Long.valueOf(-j13));
                                                                                        if (chat6 != null && (chatPhoto2 = chat6.photo) != null && (fileLocation6 = chatPhoto2.photo_small) != null && fileLocation6.volume_id != 0 && fileLocation6.local_id != 0) {
                                                                                            file2 = getFileLoader().getPathToAttach(chat6.photo.photo_small, true);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                loadRoundAvatar(j11, file2, name3);
                                                                            }
                                                                            person2 = name3.build();
                                                                            longSparseArray8.put(j13, person2);
                                                                        }
                                                                        if (!DialogObject.isEncryptedDialog(j11)) {
                                                                            if (!zArr[0] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).isLowRamDevice() || z6 || messageObject7.isSecretMedia() || !(messageObject7.type == 1 || messageObject7.isSticker())) {
                                                                                str32 = str4;
                                                                                messagingStyle2 = messagingStyle3;
                                                                                str33 = str25;
                                                                            } else {
                                                                                File pathToMessage = getFileLoader().getPathToMessage(messageObject7.messageOwner);
                                                                                if (pathToMessage.exists() && messageObject7.hasMediaSpoilers()) {
                                                                                    file3 = new File(pathToMessage.getParentFile(), pathToMessage.getName() + ".blur.jpg");
                                                                                    if (!file3.exists()) {
                                                                                        try {
                                                                                            Bitmap decodeFile2 = BitmapFactory.decodeFile(pathToMessage.getAbsolutePath());
                                                                                            Bitmap stackBlurBitmapMax = Utilities.stackBlurBitmapMax(decodeFile2);
                                                                                            decodeFile2.recycle();
                                                                                            createScaledBitmap = Bitmap.createScaledBitmap(stackBlurBitmapMax, decodeFile2.getWidth(), decodeFile2.getHeight(), true);
                                                                                            Utilities.stackBlurBitmap(createScaledBitmap, 5);
                                                                                            stackBlurBitmapMax.recycle();
                                                                                            canvas = new Canvas(createScaledBitmap);
                                                                                        } catch (Exception e) {
                                                                                            e = e;
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
                                                                                            NotificationCompat.MessagingStyle.Message message2 = new NotificationCompat.MessagingStyle.Message(str28, messageObject7.messageOwner.date * 1000, person2);
                                                                                            String str48 = !messageObject7.isSticker() ? "image/webp" : "image/jpeg";
                                                                                            if (!pathToMessage.exists()) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    file3 = null;
                                                                                }
                                                                                NotificationCompat.MessagingStyle.Message message22 = new NotificationCompat.MessagingStyle.Message(str28, messageObject7.messageOwner.date * 1000, person2);
                                                                                String str482 = !messageObject7.isSticker() ? "image/webp" : "image/jpeg";
                                                                                if (!pathToMessage.exists()) {
                                                                                    try {
                                                                                        context = ApplicationLoader.applicationContext;
                                                                                        sb3 = new StringBuilder();
                                                                                        sb3.append(ApplicationLoader.getApplicationId());
                                                                                        str32 = str4;
                                                                                    } catch (Exception e3) {
                                                                                        e = e3;
                                                                                        str32 = str4;
                                                                                    }
                                                                                    try {
                                                                                        sb3.append(str32);
                                                                                        uriForFile = FileProvider.getUriForFile(context, sb3.toString(), pathToMessage);
                                                                                        str33 = str25;
                                                                                    } catch (Exception e4) {
                                                                                        e = e4;
                                                                                        FileLog.e(e);
                                                                                        str33 = str25;
                                                                                        uriForFile = null;
                                                                                        if (uriForFile == null) {
                                                                                        }
                                                                                    }
                                                                                    if (uriForFile == null) {
                                                                                        message22.setData(str482, uriForFile);
                                                                                        messagingStyle2 = messagingStyle3;
                                                                                        messagingStyle2.addMessage(message22);
                                                                                        ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriForFile, 1);
                                                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda50
                                                                                            @Override // java.lang.Runnable
                                                                                            public final void run() {
                                                                                                NotificationsController.lambda$showExtraNotifications$43(uriForFile, file3);
                                                                                            }
                                                                                        }, 20000L);
                                                                                        if (!TextUtils.isEmpty(messageObject7.caption)) {
                                                                                            messagingStyle2.addMessage(messageObject7.caption, messageObject7.messageOwner.date * 1000, person2);
                                                                                        }
                                                                                        if (zArr[0] && !z6 && messageObject7.isVoice()) {
                                                                                            messages = messagingStyle2.getMessages();
                                                                                            if (!messages.isEmpty()) {
                                                                                                File pathToMessage2 = getFileLoader().getPathToMessage(messageObject7.messageOwner);
                                                                                                if (Build.VERSION.SDK_INT >= 24) {
                                                                                                    try {
                                                                                                        uri2 = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + str32, pathToMessage2);
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
                                                                                        messagingStyle2 = messagingStyle3;
                                                                                    }
                                                                                } else {
                                                                                    str32 = str4;
                                                                                    if (getFileLoader().isLoadingFile(pathToMessage.getName())) {
                                                                                        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority(NotificationImageProvider.getAuthority()).appendPath("msg_media_raw");
                                                                                        StringBuilder sb8 = new StringBuilder();
                                                                                        sb8.append(notificationsController3.currentAccount);
                                                                                        str33 = str25;
                                                                                        sb8.append(str33);
                                                                                        uriForFile = appendPath.appendPath(sb8.toString()).appendPath(pathToMessage.getName()).appendQueryParameter("final_path", pathToMessage.getAbsolutePath()).build();
                                                                                        if (uriForFile == null) {
                                                                                        }
                                                                                    }
                                                                                    str33 = str25;
                                                                                    uriForFile = null;
                                                                                    if (uriForFile == null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            messagingStyle2.addMessage(str28, messageObject7.messageOwner.date * 1000, person2);
                                                                            if (zArr[0]) {
                                                                                messages = messagingStyle2.getMessages();
                                                                                if (!messages.isEmpty()) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str32 = str4;
                                                                            messagingStyle2 = messagingStyle3;
                                                                            str33 = str25;
                                                                            messagingStyle2.addMessage(str28, messageObject7.messageOwner.date * 1000, person2);
                                                                        }
                                                                        if (j11 == 777000 && (replyMarkup = messageObject7.messageOwner.reply_markup) != null) {
                                                                            arrayList19 = replyMarkup.rows;
                                                                            i32 = messageObject7.getId();
                                                                            size4 = i34 - 1;
                                                                            str3822 = str33;
                                                                            str4 = str32;
                                                                            str45 = str27;
                                                                            str3 = str31;
                                                                            zArr222 = zArr;
                                                                            strArr222 = strArr;
                                                                            sb522 = sb2;
                                                                            z12 = z13;
                                                                            j7 = j14;
                                                                            i4 = -1;
                                                                            longSparseArray15 = longSparseArray8;
                                                                            str18 = str29;
                                                                        }
                                                                    } else {
                                                                        strArr = strArr222;
                                                                    }
                                                                    str30 = str25;
                                                                    if (person2 == null) {
                                                                    }
                                                                    Person.Builder name32 = new Person.Builder().setName(str30);
                                                                    if (zArr[0]) {
                                                                    }
                                                                    str31 = str26;
                                                                    j14 = j7;
                                                                    z13 = z12;
                                                                    person2 = name32.build();
                                                                    longSparseArray8.put(j13, person2);
                                                                    if (!DialogObject.isEncryptedDialog(j11)) {
                                                                    }
                                                                    if (j11 == 777000) {
                                                                        arrayList19 = replyMarkup.rows;
                                                                        i32 = messageObject7.getId();
                                                                        size4 = i34 - 1;
                                                                        str3822 = str33;
                                                                        str4 = str32;
                                                                        str45 = str27;
                                                                        str3 = str31;
                                                                        zArr222 = zArr;
                                                                        strArr222 = strArr;
                                                                        sb522 = sb2;
                                                                        z12 = z13;
                                                                        j7 = j14;
                                                                        i4 = -1;
                                                                        longSparseArray15 = longSparseArray8;
                                                                        str18 = str29;
                                                                    }
                                                                } else {
                                                                    strArr = strArr222;
                                                                }
                                                                str30 = str47;
                                                                if (person2 == null) {
                                                                }
                                                                Person.Builder name322 = new Person.Builder().setName(str30);
                                                                if (zArr[0]) {
                                                                }
                                                                str31 = str26;
                                                                j14 = j7;
                                                                z13 = z12;
                                                                person2 = name322.build();
                                                                longSparseArray8.put(j13, person2);
                                                                if (!DialogObject.isEncryptedDialog(j11)) {
                                                                }
                                                                if (j11 == 777000) {
                                                                }
                                                            }
                                                        }
                                                        i32 = i33;
                                                        size4 = i34 - 1;
                                                        str3822 = str33;
                                                        str4 = str32;
                                                        str45 = str27;
                                                        str3 = str31;
                                                        zArr222 = zArr;
                                                        strArr222 = strArr;
                                                        sb522 = sb2;
                                                        z12 = z13;
                                                        j7 = j14;
                                                        i4 = -1;
                                                        longSparseArray15 = longSparseArray8;
                                                        str18 = str29;
                                                    }
                                                    j12 = j7;
                                                    sb = sb522;
                                                    String str49 = str18;
                                                    str22 = str4;
                                                    longSparseArray7 = longSparseArray15;
                                                    str23 = str3;
                                                    arrayList7 = arrayList19;
                                                    bitmap3 = bitmap2;
                                                    i11 = i32;
                                                    str24 = str49;
                                                }
                                                Intent intent322 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                intent322.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent322.setFlags(67108864);
                                                intent322.addCategory("android.intent.category.LAUNCHER");
                                                if (messageObject3 == null && messageObject3.isOauthPush) {
                                                    intent322.putExtra("oauth_url", messageObject3.localName);
                                                } else if (messageObject3 == null && messageObject3.isStoryReactionPush) {
                                                    intent322.putExtra(str5, Math.abs(messageObject3.getId()));
                                                } else {
                                                    String str4022 = str5;
                                                    if (messageObject3 == null && messageObject3.isLiveStoryPush) {
                                                        if (j11 < 0) {
                                                            longSparseArray10 = longSparseArray7;
                                                            String str50 = str6;
                                                            intent322.putExtra(str50, -j11);
                                                            str34 = str50;
                                                            str35 = str7;
                                                        } else {
                                                            longSparseArray10 = longSparseArray7;
                                                            str34 = str6;
                                                            str35 = str7;
                                                            if (j11 > 0) {
                                                                intent322.putExtra(str35, j11);
                                                            }
                                                        }
                                                        intent322.putExtra(str4022, Math.abs(messageObject3.getId()));
                                                        bitmap4 = bitmap3;
                                                        arrayList8 = arrayList7;
                                                        messageObject4 = messageObject3;
                                                        str5 = str4022;
                                                        longSparseArray9 = longSparseArray10;
                                                        dialogKey5 = dialogKey4;
                                                    } else {
                                                        LongSparseArray longSparseArray1422 = longSparseArray7;
                                                        str34 = str6;
                                                        str35 = str7;
                                                        messageObject4 = messageObject3;
                                                        dialogKey5 = dialogKey4;
                                                        if (!dialogKey5.story) {
                                                            long[] jArr2 = new long[notificationsController3.storyPushMessages.size()];
                                                            str5 = str4022;
                                                            longSparseArray9 = longSparseArray1422;
                                                            int i35 = 0;
                                                            while (i35 < notificationsController3.storyPushMessages.size()) {
                                                                jArr2[i35] = notificationsController3.storyPushMessages.get(i35).dialogId;
                                                                i35++;
                                                                bitmap3 = bitmap3;
                                                                arrayList7 = arrayList7;
                                                            }
                                                            bitmap4 = bitmap3;
                                                            arrayList8 = arrayList7;
                                                            intent322.putExtra("storyDialogIds", jArr2);
                                                        } else {
                                                            bitmap4 = bitmap3;
                                                            arrayList8 = arrayList7;
                                                            str5 = str4022;
                                                            longSparseArray9 = longSparseArray1422;
                                                            if (DialogObject.isEncryptedDialog(j11)) {
                                                                intent322.putExtra("encId", DialogObject.getEncryptedChatId(j11));
                                                            } else if (DialogObject.isUserDialog(j11)) {
                                                                intent322.putExtra(str35, j11);
                                                            } else {
                                                                intent322.putExtra(str34, -j11);
                                                            }
                                                        }
                                                    }
                                                    StringBuilder sb622 = new StringBuilder();
                                                    sb622.append("show extra notifications chatId ");
                                                    sb622.append(j11);
                                                    sb622.append(" topicId ");
                                                    j15 = j12;
                                                    sb622.append(j15);
                                                    FileLog.d(sb622.toString());
                                                    if (j15 != 0) {
                                                        intent322.putExtra("topicId", j15);
                                                    }
                                                    String str4122 = str3922;
                                                    intent322.putExtra(str4122, notificationsController3.currentAccount);
                                                    PendingIntent activity22 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322, 1140850688);
                                                    NotificationCompat.WearableExtender wearableExtender22 = new NotificationCompat.WearableExtender();
                                                    NotificationCompat.Action action422 = action;
                                                    if (action != null) {
                                                        wearableExtender22.addAction(action422);
                                                    }
                                                    String str4222 = str22;
                                                    Intent intent422 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                    intent422.addFlags(32);
                                                    intent422.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                    intent422.putExtra(str20, j11);
                                                    int i3022 = i9;
                                                    intent422.putExtra(str19, i3022);
                                                    intent422.putExtra(str4122, notificationsController3.currentAccount);
                                                    String str4322 = str34;
                                                    String str4422 = str35;
                                                    NotificationCompat.Action build422 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent422, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                    if (DialogObject.isEncryptedDialog(j11)) {
                                                        i12 = i11;
                                                        action2 = action422;
                                                        str36 = j11 != globalSecretChatId ? "tgenc" + DialogObject.getEncryptedChatId(j11) + "_" + i3022 : null;
                                                    } else if (DialogObject.isUserDialog(j11)) {
                                                        str36 = "tguser" + j11 + "_" + i3022;
                                                        i12 = i11;
                                                        action2 = action422;
                                                    } else {
                                                        StringBuilder sb9 = new StringBuilder();
                                                        sb9.append("tgchat");
                                                        i12 = i11;
                                                        action2 = action422;
                                                        sb9.append(-j11);
                                                        sb9.append("_");
                                                        sb9.append(i3022);
                                                        str36 = sb9.toString();
                                                    }
                                                    if (str36 != null) {
                                                        wearableExtender22.setDismissalId(str36);
                                                        NotificationCompat.WearableExtender wearableExtender3 = new NotificationCompat.WearableExtender();
                                                        wearableExtender3.setDismissalId("summary_" + str36);
                                                        messageObject5 = messageObject4;
                                                        builder.extend(wearableExtender3);
                                                    } else {
                                                        messageObject5 = messageObject4;
                                                    }
                                                    StringBuilder sb722 = new StringBuilder();
                                                    sb722.append("tgaccount");
                                                    int i3122 = i12;
                                                    long j2422 = j10;
                                                    sb722.append(j2422);
                                                    wearableExtender22.setBridgeTag(sb722.toString());
                                                    if (dialogKey5.story) {
                                                        j16 = j2422;
                                                        j17 = Long.MAX_VALUE;
                                                        int i36 = 0;
                                                        while (i36 < notificationsController3.storyPushMessages.size()) {
                                                            j17 = Math.min(notificationsController3.storyPushMessages.get(i36).date, j17);
                                                            i36++;
                                                            build422 = build422;
                                                            i3122 = i3122;
                                                        }
                                                        action3 = build422;
                                                        i13 = i3122;
                                                        arrayList9 = arrayList4;
                                                    } else {
                                                        action3 = build422;
                                                        i13 = i3122;
                                                        j16 = j2422;
                                                        arrayList9 = arrayList4;
                                                        j17 = ((MessageObject) arrayList9.get(0)).messageOwner.date * 1000;
                                                    }
                                                    NotificationCompat.Builder autoCancel22 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                                    if (dialogKey5.story) {
                                                        arrayList9 = notificationsController3.storyPushMessages;
                                                    }
                                                    category = autoCancel22.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity22).extend(wearableExtender22).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                    intent.putExtra("messageDate", i7);
                                                    intent.putExtra("dialogId", j11);
                                                    intent.putExtra(str4122, notificationsController3.currentAccount);
                                                    if (dialogKey5.story) {
                                                        intent.putExtra("story", true);
                                                    }
                                                    if (messageObject5 != null && messageObject5.isStoryReactionPush) {
                                                        intent.putExtra("storyReaction", true);
                                                    }
                                                    category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                                    if (z7) {
                                                        category.setGroup(notificationsController3.notificationGroup);
                                                        category.setGroupAlertBehavior(1);
                                                    }
                                                    if (messageObject5 != null || (message = messageObject5.messageOwner) == null || (replyMarkup2 = message.reply_markup) == null) {
                                                        tL_keyboardButtonCopy = null;
                                                    } else {
                                                        TLRPC.TL_keyboardButtonCopy tL_keyboardButtonCopy2 = null;
                                                        for (int i37 = 0; i37 < replyMarkup2.rows.size(); i37++) {
                                                            int i38 = 0;
                                                            while (true) {
                                                                if (i38 >= replyMarkup2.rows.get(i37).buttons.size()) {
                                                                    break;
                                                                }
                                                                if (replyMarkup2.rows.get(i37).buttons.get(i38) instanceof TLRPC.TL_keyboardButtonCopy) {
                                                                    tL_keyboardButtonCopy2 = (TLRPC.TL_keyboardButtonCopy) replyMarkup2.rows.get(i37).buttons.get(i38);
                                                                    break;
                                                                }
                                                                i38++;
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
                                                        category.addAction(new NotificationCompat.Action.Builder(R.drawable.msg_copy, tL_keyboardButtonCopy.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent5, 167772160)).setShowsUserInterface(false).build());
                                                    }
                                                    j18 = dialogKey5.dialogId;
                                                    if (j18 != UserObject.VERIFY && j18 != UserObject.OAUTH) {
                                                        if (action2 != null) {
                                                            category.addAction(action2);
                                                        }
                                                        if (!z6 && !dialogKey5.story && (messageObject5 == null || !messageObject5.isStoryReactionPush)) {
                                                            category.addAction(action3);
                                                        }
                                                    }
                                                    if (arrayList2.size() != 1 && !TextUtils.isEmpty(str) && !dialogKey5.story) {
                                                        category.setSubText(str);
                                                    }
                                                    if (DialogObject.isEncryptedDialog(j11)) {
                                                        category.setLocalOnly(true);
                                                    }
                                                    if (bitmap4 != null) {
                                                        category.setLargeIcon(bitmap4);
                                                    }
                                                    if (!AndroidUtilities.needShowPasscode(false) && !SharedConfig.isWaitingForPasscodeEnter && arrayList8 != null) {
                                                        size3 = arrayList8.size();
                                                        i15 = 0;
                                                        while (i15 < size3) {
                                                            ArrayList<TLRPC.TL_keyboardButtonRow> arrayList20 = arrayList8;
                                                            TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow = arrayList20.get(i15);
                                                            int size5 = tL_keyboardButtonRow.buttons.size();
                                                            int i39 = 0;
                                                            while (i39 < size5) {
                                                                TLRPC.KeyboardButton keyboardButton = tL_keyboardButtonRow.buttons.get(i39);
                                                                if (keyboardButton instanceof TLRPC.TL_keyboardButtonCallback) {
                                                                    i16 = size3;
                                                                    arrayList10 = arrayList20;
                                                                    Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                    intent6.putExtra(str4122, notificationsController3.currentAccount);
                                                                    intent6.putExtra("did", j11);
                                                                    byte[] bArr = keyboardButton.data;
                                                                    if (bArr != null) {
                                                                        intent6.putExtra("data", bArr);
                                                                    }
                                                                    intent6.putExtra("mid", i13);
                                                                    String str51 = keyboardButton.text;
                                                                    Context context2 = ApplicationLoader.applicationContext;
                                                                    int i40 = notificationsController3.lastButtonId;
                                                                    str37 = str4122;
                                                                    notificationsController3.lastButtonId = i40 + 1;
                                                                    category.addAction(0, str51, PendingIntent.getBroadcast(context2, i40, intent6, 167772160));
                                                                } else {
                                                                    i16 = size3;
                                                                    arrayList10 = arrayList20;
                                                                    str37 = str4122;
                                                                }
                                                                i39++;
                                                                size3 = i16;
                                                                arrayList20 = arrayList10;
                                                                str4122 = str37;
                                                            }
                                                            arrayList8 = arrayList20;
                                                            i15++;
                                                            str4122 = str4122;
                                                        }
                                                    }
                                                    if (chat5 == null || user6 == null) {
                                                        user7 = user6;
                                                    } else {
                                                        user7 = user6;
                                                        String str52 = user7.phone;
                                                        if (str52 != null && str52.length() > 0) {
                                                            category.addPerson("tel:+" + user7.phone);
                                                        }
                                                    }
                                                    Notification notification322 = notification;
                                                    boolean z1622 = z7;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                        notificationsController3.setNotificationChannel(notification322, category, z1622);
                                                    }
                                                    FileLog.d("showExtraNotifications: holders.add " + j11);
                                                    i8 = i23;
                                                    str10 = str23;
                                                    z8 = z6;
                                                    j8 = j16;
                                                    z9 = z1622;
                                                    longSparseArray6 = longSparseArray9;
                                                    str12 = str5;
                                                    i14 = i24;
                                                    str11 = str4222;
                                                    notification2 = notification322;
                                                    str14 = str4422;
                                                    sharedPreferences = sharedPreferences2;
                                                    str13 = str4322;
                                                    arrayList5 = arrayList14;
                                                    arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                                    notificationsController2 = this;
                                                    notificationsController2.wearNotificationsIds.put(j11, num);
                                                    i20 = i14 + 1;
                                                    arrayList13 = arrayList5;
                                                    size = i8;
                                                    str5 = str12;
                                                    z5 = z8;
                                                    arrayList11 = arrayList2;
                                                    z4 = z9;
                                                    longSparseArray12 = longSparseArray4;
                                                    clientUserId = j8;
                                                    str6 = str13;
                                                    str7 = str14;
                                                    str4 = str11;
                                                    longSparseArray13 = longSparseArray5;
                                                    longSparseArray = longSparseArray6;
                                                    build2 = notification2;
                                                    notificationsController3 = notificationsController2;
                                                    str3 = str10;
                                                    notificationsSettings = sharedPreferences;
                                                    i4 = -1;
                                                }
                                                bitmap4 = bitmap3;
                                                messageObject4 = messageObject3;
                                                longSparseArray9 = longSparseArray7;
                                                str34 = str6;
                                                str35 = str7;
                                                dialogKey5 = dialogKey4;
                                                arrayList8 = arrayList7;
                                                StringBuilder sb6222 = new StringBuilder();
                                                sb6222.append("show extra notifications chatId ");
                                                sb6222.append(j11);
                                                sb6222.append(" topicId ");
                                                j15 = j12;
                                                sb6222.append(j15);
                                                FileLog.d(sb6222.toString());
                                                if (j15 != 0) {
                                                }
                                                String str41222 = str3922;
                                                intent322.putExtra(str41222, notificationsController3.currentAccount);
                                                PendingIntent activity222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322, 1140850688);
                                                NotificationCompat.WearableExtender wearableExtender222 = new NotificationCompat.WearableExtender();
                                                NotificationCompat.Action action4222 = action;
                                                if (action != null) {
                                                }
                                                String str42222 = str22;
                                                Intent intent4222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                intent4222.addFlags(32);
                                                intent4222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                intent4222.putExtra(str20, j11);
                                                int i30222 = i9;
                                                intent4222.putExtra(str19, i30222);
                                                intent4222.putExtra(str41222, notificationsController3.currentAccount);
                                                String str43222 = str34;
                                                String str44222 = str35;
                                                NotificationCompat.Action build4222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent4222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                if (DialogObject.isEncryptedDialog(j11)) {
                                                }
                                                if (str36 != null) {
                                                }
                                                StringBuilder sb7222 = new StringBuilder();
                                                sb7222.append("tgaccount");
                                                int i31222 = i12;
                                                long j24222 = j10;
                                                sb7222.append(j24222);
                                                wearableExtender222.setBridgeTag(sb7222.toString());
                                                if (dialogKey5.story) {
                                                }
                                                NotificationCompat.Builder autoCancel222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                                if (dialogKey5.story) {
                                                }
                                                category = autoCancel222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity222).extend(wearableExtender222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent.putExtra("messageDate", i7);
                                                intent.putExtra("dialogId", j11);
                                                intent.putExtra(str41222, notificationsController3.currentAccount);
                                                if (dialogKey5.story) {
                                                }
                                                if (messageObject5 != null) {
                                                    intent.putExtra("storyReaction", true);
                                                }
                                                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                                if (z7) {
                                                }
                                                if (messageObject5 != null) {
                                                }
                                                tL_keyboardButtonCopy = null;
                                                if (tL_keyboardButtonCopy != null) {
                                                }
                                                j18 = dialogKey5.dialogId;
                                                if (j18 != UserObject.VERIFY) {
                                                    if (action2 != null) {
                                                    }
                                                    if (!z6) {
                                                        category.addAction(action3);
                                                    }
                                                }
                                                if (arrayList2.size() != 1) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j11)) {
                                                }
                                                if (bitmap4 != null) {
                                                }
                                                if (!AndroidUtilities.needShowPasscode(false)) {
                                                    size3 = arrayList8.size();
                                                    i15 = 0;
                                                    while (i15 < size3) {
                                                    }
                                                }
                                                if (chat5 == null) {
                                                }
                                                user7 = user6;
                                                Notification notification3222 = notification;
                                                boolean z16222 = z7;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                FileLog.d("showExtraNotifications: holders.add " + j11);
                                                i8 = i23;
                                                str10 = str23;
                                                z8 = z6;
                                                j8 = j16;
                                                z9 = z16222;
                                                longSparseArray6 = longSparseArray9;
                                                str12 = str5;
                                                i14 = i24;
                                                str11 = str42222;
                                                notification2 = notification3222;
                                                str14 = str44222;
                                                sharedPreferences = sharedPreferences2;
                                                str13 = str43222;
                                                arrayList5 = arrayList14;
                                                arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                                notificationsController2 = this;
                                                notificationsController2.wearNotificationsIds.put(j11, num);
                                                i20 = i14 + 1;
                                                arrayList13 = arrayList5;
                                                size = i8;
                                                str5 = str12;
                                                z5 = z8;
                                                arrayList11 = arrayList2;
                                                z4 = z9;
                                                longSparseArray12 = longSparseArray4;
                                                clientUserId = j8;
                                                str6 = str13;
                                                str7 = str14;
                                                str4 = str11;
                                                longSparseArray13 = longSparseArray5;
                                                longSparseArray = longSparseArray6;
                                                build2 = notification2;
                                                notificationsController3 = notificationsController2;
                                                str3 = str10;
                                                notificationsSettings = sharedPreferences;
                                                i4 = -1;
                                            }
                                            str21 = "currentAccount";
                                            messageObject3 = messageObject2;
                                            if (messageObject2 == null) {
                                            }
                                            String str38222 = "";
                                            if (person == null) {
                                            }
                                            messagingStyle = new NotificationCompat.MessagingStyle("");
                                            messagingStyle2 = messagingStyle;
                                            i10 = Build.VERSION.SDK_INT;
                                            if (i10 >= 28) {
                                            }
                                            messagingStyle2.setConversationTitle(format);
                                            messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j23)) || UserObject.isReplyUser(j23));
                                            StringBuilder sb5222 = new StringBuilder();
                                            String str39222 = str21;
                                            String[] strArr2222 = new String[1];
                                            boolean[] zArr2222 = new boolean[1];
                                            if (!dialogKey3.story) {
                                            }
                                            Intent intent3222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                            intent3222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent3222.setFlags(67108864);
                                            intent3222.addCategory("android.intent.category.LAUNCHER");
                                            if (messageObject3 == null) {
                                            }
                                            if (messageObject3 == null) {
                                            }
                                            String str40222 = str5;
                                            if (messageObject3 == null) {
                                            }
                                            LongSparseArray longSparseArray14222 = longSparseArray7;
                                            str34 = str6;
                                            str35 = str7;
                                            messageObject4 = messageObject3;
                                            dialogKey5 = dialogKey4;
                                            if (!dialogKey5.story) {
                                            }
                                            StringBuilder sb62222 = new StringBuilder();
                                            sb62222.append("show extra notifications chatId ");
                                            sb62222.append(j11);
                                            sb62222.append(" topicId ");
                                            j15 = j12;
                                            sb62222.append(j15);
                                            FileLog.d(sb62222.toString());
                                            if (j15 != 0) {
                                            }
                                            String str412222 = str39222;
                                            intent3222.putExtra(str412222, notificationsController3.currentAccount);
                                            PendingIntent activity2222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3222, 1140850688);
                                            NotificationCompat.WearableExtender wearableExtender2222 = new NotificationCompat.WearableExtender();
                                            NotificationCompat.Action action42222 = action;
                                            if (action != null) {
                                            }
                                            String str422222 = str22;
                                            Intent intent42222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                            intent42222.addFlags(32);
                                            intent42222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                            intent42222.putExtra(str20, j11);
                                            int i302222 = i9;
                                            intent42222.putExtra(str19, i302222);
                                            intent42222.putExtra(str412222, notificationsController3.currentAccount);
                                            String str432222 = str34;
                                            String str442222 = str35;
                                            NotificationCompat.Action build42222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent42222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                            if (DialogObject.isEncryptedDialog(j11)) {
                                            }
                                            if (str36 != null) {
                                            }
                                            StringBuilder sb72222 = new StringBuilder();
                                            sb72222.append("tgaccount");
                                            int i312222 = i12;
                                            long j242222 = j10;
                                            sb72222.append(j242222);
                                            wearableExtender2222.setBridgeTag(sb72222.toString());
                                            if (dialogKey5.story) {
                                            }
                                            NotificationCompat.Builder autoCancel2222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                            if (dialogKey5.story) {
                                            }
                                            category = autoCancel2222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity2222).extend(wearableExtender2222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                            intent.putExtra("messageDate", i7);
                                            intent.putExtra("dialogId", j11);
                                            intent.putExtra(str412222, notificationsController3.currentAccount);
                                            if (dialogKey5.story) {
                                            }
                                            if (messageObject5 != null) {
                                            }
                                            category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                            if (z7) {
                                            }
                                            if (messageObject5 != null) {
                                            }
                                            tL_keyboardButtonCopy = null;
                                            if (tL_keyboardButtonCopy != null) {
                                            }
                                            j18 = dialogKey5.dialogId;
                                            if (j18 != UserObject.VERIFY) {
                                            }
                                            if (arrayList2.size() != 1) {
                                            }
                                            if (DialogObject.isEncryptedDialog(j11)) {
                                            }
                                            if (bitmap4 != null) {
                                            }
                                            if (!AndroidUtilities.needShowPasscode(false)) {
                                            }
                                            if (chat5 == null) {
                                            }
                                            user7 = user6;
                                            Notification notification32222 = notification;
                                            boolean z162222 = z7;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                            }
                                            FileLog.d("showExtraNotifications: holders.add " + j11);
                                            i8 = i23;
                                            str10 = str23;
                                            z8 = z6;
                                            j8 = j16;
                                            z9 = z162222;
                                            longSparseArray6 = longSparseArray9;
                                            str12 = str5;
                                            i14 = i24;
                                            str11 = str422222;
                                            notification2 = notification32222;
                                            str14 = str442222;
                                            sharedPreferences = sharedPreferences2;
                                            str13 = str432222;
                                            arrayList5 = arrayList14;
                                            arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                            notificationsController2 = this;
                                            notificationsController2.wearNotificationsIds.put(j11, num);
                                            i20 = i14 + 1;
                                            arrayList13 = arrayList5;
                                            size = i8;
                                            str5 = str12;
                                            z5 = z8;
                                            arrayList11 = arrayList2;
                                            z4 = z9;
                                            longSparseArray12 = longSparseArray4;
                                            clientUserId = j8;
                                            str6 = str13;
                                            str7 = str14;
                                            str4 = str11;
                                            longSparseArray13 = longSparseArray5;
                                            longSparseArray = longSparseArray6;
                                            build2 = notification2;
                                            notificationsController3 = notificationsController2;
                                            str3 = str10;
                                            notificationsSettings = sharedPreferences;
                                            i4 = -1;
                                        }
                                    }
                                }
                                action = build;
                                str20 = "dialog_id";
                                str21 = "currentAccount";
                                messageObject3 = messageObject2;
                                if (messageObject2 == null) {
                                }
                                String str382222 = "";
                                if (person == null) {
                                }
                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                messagingStyle2 = messagingStyle;
                                i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 28) {
                                }
                                messagingStyle2.setConversationTitle(format);
                                messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j23)) || UserObject.isReplyUser(j23));
                                StringBuilder sb52222 = new StringBuilder();
                                String str392222 = str21;
                                String[] strArr22222 = new String[1];
                                boolean[] zArr22222 = new boolean[1];
                                if (!dialogKey3.story) {
                                }
                                Intent intent32222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                intent32222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent32222.setFlags(67108864);
                                intent32222.addCategory("android.intent.category.LAUNCHER");
                                if (messageObject3 == null) {
                                }
                                if (messageObject3 == null) {
                                }
                                String str402222 = str5;
                                if (messageObject3 == null) {
                                }
                                LongSparseArray longSparseArray142222 = longSparseArray7;
                                str34 = str6;
                                str35 = str7;
                                messageObject4 = messageObject3;
                                dialogKey5 = dialogKey4;
                                if (!dialogKey5.story) {
                                }
                                StringBuilder sb622222 = new StringBuilder();
                                sb622222.append("show extra notifications chatId ");
                                sb622222.append(j11);
                                sb622222.append(" topicId ");
                                j15 = j12;
                                sb622222.append(j15);
                                FileLog.d(sb622222.toString());
                                if (j15 != 0) {
                                }
                                String str4122222 = str392222;
                                intent32222.putExtra(str4122222, notificationsController3.currentAccount);
                                PendingIntent activity22222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32222, 1140850688);
                                NotificationCompat.WearableExtender wearableExtender22222 = new NotificationCompat.WearableExtender();
                                NotificationCompat.Action action422222 = action;
                                if (action != null) {
                                }
                                String str4222222 = str22;
                                Intent intent422222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                intent422222.addFlags(32);
                                intent422222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                intent422222.putExtra(str20, j11);
                                int i3022222 = i9;
                                intent422222.putExtra(str19, i3022222);
                                intent422222.putExtra(str4122222, notificationsController3.currentAccount);
                                String str4322222 = str34;
                                String str4422222 = str35;
                                NotificationCompat.Action build422222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent422222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                if (DialogObject.isEncryptedDialog(j11)) {
                                }
                                if (str36 != null) {
                                }
                                StringBuilder sb722222 = new StringBuilder();
                                sb722222.append("tgaccount");
                                int i3122222 = i12;
                                long j2422222 = j10;
                                sb722222.append(j2422222);
                                wearableExtender22222.setBridgeTag(sb722222.toString());
                                if (dialogKey5.story) {
                                }
                                NotificationCompat.Builder autoCancel22222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                if (dialogKey5.story) {
                                }
                                category = autoCancel22222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity22222).extend(wearableExtender22222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent.putExtra("messageDate", i7);
                                intent.putExtra("dialogId", j11);
                                intent.putExtra(str4122222, notificationsController3.currentAccount);
                                if (dialogKey5.story) {
                                }
                                if (messageObject5 != null) {
                                }
                                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                if (z7) {
                                }
                                if (messageObject5 != null) {
                                }
                                tL_keyboardButtonCopy = null;
                                if (tL_keyboardButtonCopy != null) {
                                }
                                j18 = dialogKey5.dialogId;
                                if (j18 != UserObject.VERIFY) {
                                }
                                if (arrayList2.size() != 1) {
                                }
                                if (DialogObject.isEncryptedDialog(j11)) {
                                }
                                if (bitmap4 != null) {
                                }
                                if (!AndroidUtilities.needShowPasscode(false)) {
                                }
                                if (chat5 == null) {
                                }
                                user7 = user6;
                                Notification notification322222 = notification;
                                boolean z1622222 = z7;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                FileLog.d("showExtraNotifications: holders.add " + j11);
                                i8 = i23;
                                str10 = str23;
                                z8 = z6;
                                j8 = j16;
                                z9 = z1622222;
                                longSparseArray6 = longSparseArray9;
                                str12 = str5;
                                i14 = i24;
                                str11 = str4222222;
                                notification2 = notification322222;
                                str14 = str4422222;
                                sharedPreferences = sharedPreferences2;
                                str13 = str4322222;
                                arrayList5 = arrayList14;
                                arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                notificationsController2 = this;
                                notificationsController2.wearNotificationsIds.put(j11, num);
                                i20 = i14 + 1;
                                arrayList13 = arrayList5;
                                size = i8;
                                str5 = str12;
                                z5 = z8;
                                arrayList11 = arrayList2;
                                z4 = z9;
                                longSparseArray12 = longSparseArray4;
                                clientUserId = j8;
                                str6 = str13;
                                str7 = str14;
                                str4 = str11;
                                longSparseArray13 = longSparseArray5;
                                longSparseArray = longSparseArray6;
                                build2 = notification2;
                                notificationsController3 = notificationsController2;
                                str3 = str10;
                                notificationsSettings = sharedPreferences;
                                i4 = -1;
                            }
                        }
                        user2 = user9;
                        arrayList4 = arrayList3;
                        string = formatPluralString;
                        j6 = clientUserId;
                        num = num3;
                        j7 = j5;
                    } else {
                        i7 = i27;
                        longSparseArray5 = longSparseArray13;
                        str9 = "Stories";
                        if (!DialogObject.isEncryptedDialog(j4)) {
                            z10 = (messageObject == null || messageObject.isReactionPush || messageObject.isStoryReactionPush || j4 == 777000) ? false : true;
                            if (DialogObject.isUserDialog(j4)) {
                                user3 = getMessagesController().getUser(Long.valueOf(j4));
                                if (user3 == null) {
                                    if (messageObject.isFcmMessage()) {
                                        str15 = messageObject.localName;
                                        arrayList6 = arrayList3;
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.w("not found user to show dialog notification " + j4);
                                        }
                                        longSparseArray6 = longSparseArray;
                                        sharedPreferences = notificationsSettings;
                                        notificationsController2 = notificationsController3;
                                        i8 = i23;
                                        arrayList5 = arrayList14;
                                        notification2 = notification;
                                        str10 = str3;
                                        str11 = str4;
                                        str12 = str5;
                                        str13 = str6;
                                        str14 = str7;
                                        z8 = z6;
                                        z9 = z7;
                                        j8 = clientUserId;
                                    }
                                } else {
                                    String userName = UserObject.getUserName(user3);
                                    TLRPC.UserProfilePhoto userProfilePhoto6 = user3.photo;
                                    if (userProfilePhoto6 == null || (fileLocation3 = userProfilePhoto6.photo_small) == null) {
                                        arrayList6 = arrayList3;
                                        str16 = userName;
                                    } else {
                                        arrayList6 = arrayList3;
                                        str16 = userName;
                                        if (fileLocation3.volume_id != 0 && fileLocation3.local_id != 0) {
                                            str15 = str16;
                                            if (j4 != UserObject.OAUTH) {
                                                string2 = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                            } else if (j4 == UserObject.VERIFY) {
                                                string2 = LocaleController.getString(R.string.VerifyCodesNotifications);
                                            } else if (UserObject.isReplyUser(j4)) {
                                                string2 = LocaleController.getString(R.string.RepliesTitle);
                                            } else if (j4 == clientUserId) {
                                                string2 = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                                            } else {
                                                j6 = clientUserId;
                                                arrayList4 = arrayList6;
                                                num = num3;
                                                j7 = j5;
                                                chat2 = null;
                                                z12 = false;
                                                z11 = false;
                                                TLRPC.Chat chat7 = chat2;
                                                user4 = user3;
                                                chat = chat7;
                                                if (j4 == UserObject.VERIFY || messageObject == null || messageObject.getForwardedFromId() == null) {
                                                    chat3 = chat;
                                                    user5 = user4;
                                                    string = str15;
                                                } else {
                                                    chat3 = chat;
                                                    Long forwardedFromId = messageObject.getForwardedFromId();
                                                    user5 = user4;
                                                    string = str15;
                                                    long longValue = forwardedFromId.longValue();
                                                    if (!DialogObject.isUserDialog(longValue) ? !((chatPhoto = getMessagesController().getChat(Long.valueOf(-longValue)).photo) == null || (fileLocation5 = chatPhoto.photo_small) == null || fileLocation5.volume_id == 0 || fileLocation5.local_id == 0) : !((userProfilePhoto = getMessagesController().getUser(forwardedFromId).photo) == null || (fileLocation5 = userProfilePhoto.photo_small) == null || fileLocation5.volume_id == 0 || fileLocation5.local_id == 0)) {
                                                        fileLocation4 = fileLocation5;
                                                        chat4 = chat3;
                                                        if (j4 != UserObject.VERIFY) {
                                                            user2 = user5;
                                                            z10 = false;
                                                        } else {
                                                            user2 = user5;
                                                        }
                                                        if (messageObject != null) {
                                                            string = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                            fileLocation4 = null;
                                                            z10 = false;
                                                        }
                                                        if (z6) {
                                                        }
                                                        if (fileLocation4 == null) {
                                                        }
                                                        if (chat4 == null) {
                                                        }
                                                        File file42 = file;
                                                        if (z12) {
                                                        }
                                                        bitmap2 = bitmap;
                                                        Intent intent22 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                                        intent22.putExtra("dialog_id", j4);
                                                        int i292 = id;
                                                        intent22.putExtra("max_id", i292);
                                                        intent22.putExtra("topic_id", j7);
                                                        intent22.putExtra("currentAccount", notificationsController3.currentAccount);
                                                        dialogKey2 = dialogKey;
                                                        chat5 = chat4;
                                                        PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent22, 167772160);
                                                        RemoteInput build32 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                                                        if (!DialogObject.isChatDialog(j4)) {
                                                        }
                                                        build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast2).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build32).setShowsUserInterface(false).build();
                                                        num2 = (Integer) notificationsController3.pushDialogs.get(j4);
                                                        if (num2 == null) {
                                                        }
                                                        dialogKey3 = dialogKey2;
                                                        if (!dialogKey3.story) {
                                                        }
                                                        if (max > 1) {
                                                        }
                                                        long j232 = j4;
                                                        j9 = j6;
                                                        person = (Person) longSparseArray.get(j9);
                                                        if (Build.VERSION.SDK_INT >= 28) {
                                                            user8 = getMessagesController().getUser(Long.valueOf(j9));
                                                            if (user8 == null) {
                                                            }
                                                            if (user8 != null) {
                                                            }
                                                        }
                                                        action = build;
                                                        str20 = "dialog_id";
                                                        str21 = "currentAccount";
                                                        messageObject3 = messageObject2;
                                                        if (messageObject2 == null) {
                                                        }
                                                        String str3822222 = "";
                                                        if (person == null) {
                                                        }
                                                        messagingStyle = new NotificationCompat.MessagingStyle("");
                                                        messagingStyle2 = messagingStyle;
                                                        i10 = Build.VERSION.SDK_INT;
                                                        if (i10 >= 28) {
                                                        }
                                                        messagingStyle2.setConversationTitle(format);
                                                        messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j232)) || UserObject.isReplyUser(j232));
                                                        StringBuilder sb522222 = new StringBuilder();
                                                        String str3922222 = str21;
                                                        String[] strArr222222 = new String[1];
                                                        boolean[] zArr222222 = new boolean[1];
                                                        if (!dialogKey3.story) {
                                                        }
                                                        Intent intent322222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                        intent322222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                        intent322222.setFlags(67108864);
                                                        intent322222.addCategory("android.intent.category.LAUNCHER");
                                                        if (messageObject3 == null) {
                                                        }
                                                        if (messageObject3 == null) {
                                                        }
                                                        String str4022222 = str5;
                                                        if (messageObject3 == null) {
                                                        }
                                                        LongSparseArray longSparseArray1422222 = longSparseArray7;
                                                        str34 = str6;
                                                        str35 = str7;
                                                        messageObject4 = messageObject3;
                                                        dialogKey5 = dialogKey4;
                                                        if (!dialogKey5.story) {
                                                        }
                                                        StringBuilder sb6222222 = new StringBuilder();
                                                        sb6222222.append("show extra notifications chatId ");
                                                        sb6222222.append(j11);
                                                        sb6222222.append(" topicId ");
                                                        j15 = j12;
                                                        sb6222222.append(j15);
                                                        FileLog.d(sb6222222.toString());
                                                        if (j15 != 0) {
                                                        }
                                                        String str41222222 = str3922222;
                                                        intent322222.putExtra(str41222222, notificationsController3.currentAccount);
                                                        PendingIntent activity222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322222, 1140850688);
                                                        NotificationCompat.WearableExtender wearableExtender222222 = new NotificationCompat.WearableExtender();
                                                        NotificationCompat.Action action4222222 = action;
                                                        if (action != null) {
                                                        }
                                                        String str42222222 = str22;
                                                        Intent intent4222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                        intent4222222.addFlags(32);
                                                        intent4222222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                        intent4222222.putExtra(str20, j11);
                                                        int i30222222 = i9;
                                                        intent4222222.putExtra(str19, i30222222);
                                                        intent4222222.putExtra(str41222222, notificationsController3.currentAccount);
                                                        String str43222222 = str34;
                                                        String str44222222 = str35;
                                                        NotificationCompat.Action build4222222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent4222222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                        if (DialogObject.isEncryptedDialog(j11)) {
                                                        }
                                                        if (str36 != null) {
                                                        }
                                                        StringBuilder sb7222222 = new StringBuilder();
                                                        sb7222222.append("tgaccount");
                                                        int i31222222 = i12;
                                                        long j24222222 = j10;
                                                        sb7222222.append(j24222222);
                                                        wearableExtender222222.setBridgeTag(sb7222222.toString());
                                                        if (dialogKey5.story) {
                                                        }
                                                        NotificationCompat.Builder autoCancel222222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                                        if (dialogKey5.story) {
                                                        }
                                                        category = autoCancel222222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity222222).extend(wearableExtender222222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                                        intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                        intent.putExtra("messageDate", i7);
                                                        intent.putExtra("dialogId", j11);
                                                        intent.putExtra(str41222222, notificationsController3.currentAccount);
                                                        if (dialogKey5.story) {
                                                        }
                                                        if (messageObject5 != null) {
                                                        }
                                                        category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                                        if (z7) {
                                                        }
                                                        if (messageObject5 != null) {
                                                        }
                                                        tL_keyboardButtonCopy = null;
                                                        if (tL_keyboardButtonCopy != null) {
                                                        }
                                                        j18 = dialogKey5.dialogId;
                                                        if (j18 != UserObject.VERIFY) {
                                                        }
                                                        if (arrayList2.size() != 1) {
                                                        }
                                                        if (DialogObject.isEncryptedDialog(j11)) {
                                                        }
                                                        if (bitmap4 != null) {
                                                        }
                                                        if (!AndroidUtilities.needShowPasscode(false)) {
                                                        }
                                                        if (chat5 == null) {
                                                        }
                                                        user7 = user6;
                                                        Notification notification3222222 = notification;
                                                        boolean z16222222 = z7;
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                        }
                                                        FileLog.d("showExtraNotifications: holders.add " + j11);
                                                        i8 = i23;
                                                        str10 = str23;
                                                        z8 = z6;
                                                        j8 = j16;
                                                        z9 = z16222222;
                                                        longSparseArray6 = longSparseArray9;
                                                        str12 = str5;
                                                        i14 = i24;
                                                        str11 = str42222222;
                                                        notification2 = notification3222222;
                                                        str14 = str44222222;
                                                        sharedPreferences = sharedPreferences2;
                                                        str13 = str43222222;
                                                        arrayList5 = arrayList14;
                                                        arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                                        notificationsController2 = this;
                                                        notificationsController2.wearNotificationsIds.put(j11, num);
                                                    }
                                                }
                                                fileLocation4 = fileLocation3;
                                                chat4 = chat3;
                                                if (j4 != UserObject.VERIFY) {
                                                }
                                                if (messageObject != null) {
                                                }
                                                if (z6) {
                                                }
                                                if (fileLocation4 == null) {
                                                }
                                                if (chat4 == null) {
                                                }
                                                File file422 = file;
                                                if (z12) {
                                                }
                                                bitmap2 = bitmap;
                                                Intent intent222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                                intent222.putExtra("dialog_id", j4);
                                                int i2922 = id;
                                                intent222.putExtra("max_id", i2922);
                                                intent222.putExtra("topic_id", j7);
                                                intent222.putExtra("currentAccount", notificationsController3.currentAccount);
                                                dialogKey2 = dialogKey;
                                                chat5 = chat4;
                                                PendingIntent broadcast22 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent222, 167772160);
                                                RemoteInput build322 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                                                if (!DialogObject.isChatDialog(j4)) {
                                                }
                                                build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast22).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build322).setShowsUserInterface(false).build();
                                                num2 = (Integer) notificationsController3.pushDialogs.get(j4);
                                                if (num2 == null) {
                                                }
                                                dialogKey3 = dialogKey2;
                                                if (!dialogKey3.story) {
                                                }
                                                if (max > 1) {
                                                }
                                                long j2322 = j4;
                                                j9 = j6;
                                                person = (Person) longSparseArray.get(j9);
                                                if (Build.VERSION.SDK_INT >= 28) {
                                                }
                                                action = build;
                                                str20 = "dialog_id";
                                                str21 = "currentAccount";
                                                messageObject3 = messageObject2;
                                                if (messageObject2 == null) {
                                                }
                                                String str38222222 = "";
                                                if (person == null) {
                                                }
                                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                                messagingStyle2 = messagingStyle;
                                                i10 = Build.VERSION.SDK_INT;
                                                if (i10 >= 28) {
                                                }
                                                messagingStyle2.setConversationTitle(format);
                                                messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j2322)) || UserObject.isReplyUser(j2322));
                                                StringBuilder sb5222222 = new StringBuilder();
                                                String str39222222 = str21;
                                                String[] strArr2222222 = new String[1];
                                                boolean[] zArr2222222 = new boolean[1];
                                                if (!dialogKey3.story) {
                                                }
                                                Intent intent3222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                intent3222222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent3222222.setFlags(67108864);
                                                intent3222222.addCategory("android.intent.category.LAUNCHER");
                                                if (messageObject3 == null) {
                                                }
                                                if (messageObject3 == null) {
                                                }
                                                String str40222222 = str5;
                                                if (messageObject3 == null) {
                                                }
                                                LongSparseArray longSparseArray14222222 = longSparseArray7;
                                                str34 = str6;
                                                str35 = str7;
                                                messageObject4 = messageObject3;
                                                dialogKey5 = dialogKey4;
                                                if (!dialogKey5.story) {
                                                }
                                                StringBuilder sb62222222 = new StringBuilder();
                                                sb62222222.append("show extra notifications chatId ");
                                                sb62222222.append(j11);
                                                sb62222222.append(" topicId ");
                                                j15 = j12;
                                                sb62222222.append(j15);
                                                FileLog.d(sb62222222.toString());
                                                if (j15 != 0) {
                                                }
                                                String str412222222 = str39222222;
                                                intent3222222.putExtra(str412222222, notificationsController3.currentAccount);
                                                PendingIntent activity2222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3222222, 1140850688);
                                                NotificationCompat.WearableExtender wearableExtender2222222 = new NotificationCompat.WearableExtender();
                                                NotificationCompat.Action action42222222 = action;
                                                if (action != null) {
                                                }
                                                String str422222222 = str22;
                                                Intent intent42222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                intent42222222.addFlags(32);
                                                intent42222222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                intent42222222.putExtra(str20, j11);
                                                int i302222222 = i9;
                                                intent42222222.putExtra(str19, i302222222);
                                                intent42222222.putExtra(str412222222, notificationsController3.currentAccount);
                                                String str432222222 = str34;
                                                String str442222222 = str35;
                                                NotificationCompat.Action build42222222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent42222222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                if (DialogObject.isEncryptedDialog(j11)) {
                                                }
                                                if (str36 != null) {
                                                }
                                                StringBuilder sb72222222 = new StringBuilder();
                                                sb72222222.append("tgaccount");
                                                int i312222222 = i12;
                                                long j242222222 = j10;
                                                sb72222222.append(j242222222);
                                                wearableExtender2222222.setBridgeTag(sb72222222.toString());
                                                if (dialogKey5.story) {
                                                }
                                                NotificationCompat.Builder autoCancel2222222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                                if (dialogKey5.story) {
                                                }
                                                category = autoCancel2222222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity2222222).extend(wearableExtender2222222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent.putExtra("messageDate", i7);
                                                intent.putExtra("dialogId", j11);
                                                intent.putExtra(str412222222, notificationsController3.currentAccount);
                                                if (dialogKey5.story) {
                                                }
                                                if (messageObject5 != null) {
                                                }
                                                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                                if (z7) {
                                                }
                                                if (messageObject5 != null) {
                                                }
                                                tL_keyboardButtonCopy = null;
                                                if (tL_keyboardButtonCopy != null) {
                                                }
                                                j18 = dialogKey5.dialogId;
                                                if (j18 != UserObject.VERIFY) {
                                                }
                                                if (arrayList2.size() != 1) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j11)) {
                                                }
                                                if (bitmap4 != null) {
                                                }
                                                if (!AndroidUtilities.needShowPasscode(false)) {
                                                }
                                                if (chat5 == null) {
                                                }
                                                user7 = user6;
                                                Notification notification32222222 = notification;
                                                boolean z162222222 = z7;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                FileLog.d("showExtraNotifications: holders.add " + j11);
                                                i8 = i23;
                                                str10 = str23;
                                                z8 = z6;
                                                j8 = j16;
                                                z9 = z162222222;
                                                longSparseArray6 = longSparseArray9;
                                                str12 = str5;
                                                i14 = i24;
                                                str11 = str422222222;
                                                notification2 = notification32222222;
                                                str14 = str442222222;
                                                sharedPreferences = sharedPreferences2;
                                                str13 = str432222222;
                                                arrayList5 = arrayList14;
                                                arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                                notificationsController2 = this;
                                                notificationsController2.wearNotificationsIds.put(j11, num);
                                            }
                                            str15 = string2;
                                            j6 = clientUserId;
                                            arrayList4 = arrayList6;
                                            num = num3;
                                            j7 = j5;
                                            z12 = false;
                                            z11 = false;
                                            user4 = user3;
                                            chat = null;
                                            if (j4 == UserObject.VERIFY) {
                                            }
                                            chat3 = chat;
                                            user5 = user4;
                                            string = str15;
                                            fileLocation4 = fileLocation3;
                                            chat4 = chat3;
                                            if (j4 != UserObject.VERIFY) {
                                            }
                                            if (messageObject != null) {
                                            }
                                            if (z6) {
                                            }
                                            if (fileLocation4 == null) {
                                            }
                                            if (chat4 == null) {
                                            }
                                            File file4222 = file;
                                            if (z12) {
                                            }
                                            bitmap2 = bitmap;
                                            Intent intent2222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                            intent2222.putExtra("dialog_id", j4);
                                            int i29222 = id;
                                            intent2222.putExtra("max_id", i29222);
                                            intent2222.putExtra("topic_id", j7);
                                            intent2222.putExtra("currentAccount", notificationsController3.currentAccount);
                                            dialogKey2 = dialogKey;
                                            chat5 = chat4;
                                            PendingIntent broadcast222 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent2222, 167772160);
                                            RemoteInput build3222 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                                            if (!DialogObject.isChatDialog(j4)) {
                                            }
                                            build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast222).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build3222).setShowsUserInterface(false).build();
                                            num2 = (Integer) notificationsController3.pushDialogs.get(j4);
                                            if (num2 == null) {
                                            }
                                            dialogKey3 = dialogKey2;
                                            if (!dialogKey3.story) {
                                            }
                                            if (max > 1) {
                                            }
                                            long j23222 = j4;
                                            j9 = j6;
                                            person = (Person) longSparseArray.get(j9);
                                            if (Build.VERSION.SDK_INT >= 28) {
                                            }
                                            action = build;
                                            str20 = "dialog_id";
                                            str21 = "currentAccount";
                                            messageObject3 = messageObject2;
                                            if (messageObject2 == null) {
                                            }
                                            String str382222222 = "";
                                            if (person == null) {
                                            }
                                            messagingStyle = new NotificationCompat.MessagingStyle("");
                                            messagingStyle2 = messagingStyle;
                                            i10 = Build.VERSION.SDK_INT;
                                            if (i10 >= 28) {
                                            }
                                            messagingStyle2.setConversationTitle(format);
                                            messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j23222)) || UserObject.isReplyUser(j23222));
                                            StringBuilder sb52222222 = new StringBuilder();
                                            String str392222222 = str21;
                                            String[] strArr22222222 = new String[1];
                                            boolean[] zArr22222222 = new boolean[1];
                                            if (!dialogKey3.story) {
                                            }
                                            Intent intent32222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                            intent32222222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent32222222.setFlags(67108864);
                                            intent32222222.addCategory("android.intent.category.LAUNCHER");
                                            if (messageObject3 == null) {
                                            }
                                            if (messageObject3 == null) {
                                            }
                                            String str402222222 = str5;
                                            if (messageObject3 == null) {
                                            }
                                            LongSparseArray longSparseArray142222222 = longSparseArray7;
                                            str34 = str6;
                                            str35 = str7;
                                            messageObject4 = messageObject3;
                                            dialogKey5 = dialogKey4;
                                            if (!dialogKey5.story) {
                                            }
                                            StringBuilder sb622222222 = new StringBuilder();
                                            sb622222222.append("show extra notifications chatId ");
                                            sb622222222.append(j11);
                                            sb622222222.append(" topicId ");
                                            j15 = j12;
                                            sb622222222.append(j15);
                                            FileLog.d(sb622222222.toString());
                                            if (j15 != 0) {
                                            }
                                            String str4122222222 = str392222222;
                                            intent32222222.putExtra(str4122222222, notificationsController3.currentAccount);
                                            PendingIntent activity22222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32222222, 1140850688);
                                            NotificationCompat.WearableExtender wearableExtender22222222 = new NotificationCompat.WearableExtender();
                                            NotificationCompat.Action action422222222 = action;
                                            if (action != null) {
                                            }
                                            String str4222222222 = str22;
                                            Intent intent422222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                            intent422222222.addFlags(32);
                                            intent422222222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                            intent422222222.putExtra(str20, j11);
                                            int i3022222222 = i9;
                                            intent422222222.putExtra(str19, i3022222222);
                                            intent422222222.putExtra(str4122222222, notificationsController3.currentAccount);
                                            String str4322222222 = str34;
                                            String str4422222222 = str35;
                                            NotificationCompat.Action build422222222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent422222222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                            if (DialogObject.isEncryptedDialog(j11)) {
                                            }
                                            if (str36 != null) {
                                            }
                                            StringBuilder sb722222222 = new StringBuilder();
                                            sb722222222.append("tgaccount");
                                            int i3122222222 = i12;
                                            long j2422222222 = j10;
                                            sb722222222.append(j2422222222);
                                            wearableExtender22222222.setBridgeTag(sb722222222.toString());
                                            if (dialogKey5.story) {
                                            }
                                            NotificationCompat.Builder autoCancel22222222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                            if (dialogKey5.story) {
                                            }
                                            category = autoCancel22222222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity22222222).extend(wearableExtender22222222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                            intent.putExtra("messageDate", i7);
                                            intent.putExtra("dialogId", j11);
                                            intent.putExtra(str4122222222, notificationsController3.currentAccount);
                                            if (dialogKey5.story) {
                                            }
                                            if (messageObject5 != null) {
                                            }
                                            category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                            if (z7) {
                                            }
                                            if (messageObject5 != null) {
                                            }
                                            tL_keyboardButtonCopy = null;
                                            if (tL_keyboardButtonCopy != null) {
                                            }
                                            j18 = dialogKey5.dialogId;
                                            if (j18 != UserObject.VERIFY) {
                                            }
                                            if (arrayList2.size() != 1) {
                                            }
                                            if (DialogObject.isEncryptedDialog(j11)) {
                                            }
                                            if (bitmap4 != null) {
                                            }
                                            if (!AndroidUtilities.needShowPasscode(false)) {
                                            }
                                            if (chat5 == null) {
                                            }
                                            user7 = user6;
                                            Notification notification322222222 = notification;
                                            boolean z1622222222 = z7;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                            }
                                            FileLog.d("showExtraNotifications: holders.add " + j11);
                                            i8 = i23;
                                            str10 = str23;
                                            z8 = z6;
                                            j8 = j16;
                                            z9 = z1622222222;
                                            longSparseArray6 = longSparseArray9;
                                            str12 = str5;
                                            i14 = i24;
                                            str11 = str4222222222;
                                            notification2 = notification322222222;
                                            str14 = str4422222222;
                                            sharedPreferences = sharedPreferences2;
                                            str13 = str4322222222;
                                            arrayList5 = arrayList14;
                                            arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                            notificationsController2 = this;
                                            notificationsController2.wearNotificationsIds.put(j11, num);
                                        }
                                    }
                                    str15 = str16;
                                }
                                fileLocation3 = null;
                                if (j4 != UserObject.OAUTH) {
                                }
                                str15 = string2;
                                j6 = clientUserId;
                                arrayList4 = arrayList6;
                                num = num3;
                                j7 = j5;
                                z12 = false;
                                z11 = false;
                                user4 = user3;
                                chat = null;
                                if (j4 == UserObject.VERIFY) {
                                }
                                chat3 = chat;
                                user5 = user4;
                                string = str15;
                                fileLocation4 = fileLocation3;
                                chat4 = chat3;
                                if (j4 != UserObject.VERIFY) {
                                }
                                if (messageObject != null) {
                                }
                                if (z6) {
                                }
                                if (fileLocation4 == null) {
                                }
                                if (chat4 == null) {
                                }
                                File file42222 = file;
                                if (z12) {
                                }
                                bitmap2 = bitmap;
                                Intent intent22222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                intent22222.putExtra("dialog_id", j4);
                                int i292222 = id;
                                intent22222.putExtra("max_id", i292222);
                                intent22222.putExtra("topic_id", j7);
                                intent22222.putExtra("currentAccount", notificationsController3.currentAccount);
                                dialogKey2 = dialogKey;
                                chat5 = chat4;
                                PendingIntent broadcast2222 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent22222, 167772160);
                                RemoteInput build32222 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                                if (!DialogObject.isChatDialog(j4)) {
                                }
                                build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast2222).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build32222).setShowsUserInterface(false).build();
                                num2 = (Integer) notificationsController3.pushDialogs.get(j4);
                                if (num2 == null) {
                                }
                                dialogKey3 = dialogKey2;
                                if (!dialogKey3.story) {
                                }
                                if (max > 1) {
                                }
                                long j232222 = j4;
                                j9 = j6;
                                person = (Person) longSparseArray.get(j9);
                                if (Build.VERSION.SDK_INT >= 28) {
                                }
                                action = build;
                                str20 = "dialog_id";
                                str21 = "currentAccount";
                                messageObject3 = messageObject2;
                                if (messageObject2 == null) {
                                }
                                String str3822222222 = "";
                                if (person == null) {
                                }
                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                messagingStyle2 = messagingStyle;
                                i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 28) {
                                }
                                messagingStyle2.setConversationTitle(format);
                                messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j232222)) || UserObject.isReplyUser(j232222));
                                StringBuilder sb522222222 = new StringBuilder();
                                String str3922222222 = str21;
                                String[] strArr222222222 = new String[1];
                                boolean[] zArr222222222 = new boolean[1];
                                if (!dialogKey3.story) {
                                }
                                Intent intent322222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                intent322222222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent322222222.setFlags(67108864);
                                intent322222222.addCategory("android.intent.category.LAUNCHER");
                                if (messageObject3 == null) {
                                }
                                if (messageObject3 == null) {
                                }
                                String str4022222222 = str5;
                                if (messageObject3 == null) {
                                }
                                LongSparseArray longSparseArray1422222222 = longSparseArray7;
                                str34 = str6;
                                str35 = str7;
                                messageObject4 = messageObject3;
                                dialogKey5 = dialogKey4;
                                if (!dialogKey5.story) {
                                }
                                StringBuilder sb6222222222 = new StringBuilder();
                                sb6222222222.append("show extra notifications chatId ");
                                sb6222222222.append(j11);
                                sb6222222222.append(" topicId ");
                                j15 = j12;
                                sb6222222222.append(j15);
                                FileLog.d(sb6222222222.toString());
                                if (j15 != 0) {
                                }
                                String str41222222222 = str3922222222;
                                intent322222222.putExtra(str41222222222, notificationsController3.currentAccount);
                                PendingIntent activity222222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322222222, 1140850688);
                                NotificationCompat.WearableExtender wearableExtender222222222 = new NotificationCompat.WearableExtender();
                                NotificationCompat.Action action4222222222 = action;
                                if (action != null) {
                                }
                                String str42222222222 = str22;
                                Intent intent4222222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                intent4222222222.addFlags(32);
                                intent4222222222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                intent4222222222.putExtra(str20, j11);
                                int i30222222222 = i9;
                                intent4222222222.putExtra(str19, i30222222222);
                                intent4222222222.putExtra(str41222222222, notificationsController3.currentAccount);
                                String str43222222222 = str34;
                                String str44222222222 = str35;
                                NotificationCompat.Action build4222222222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent4222222222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                if (DialogObject.isEncryptedDialog(j11)) {
                                }
                                if (str36 != null) {
                                }
                                StringBuilder sb7222222222 = new StringBuilder();
                                sb7222222222.append("tgaccount");
                                int i31222222222 = i12;
                                long j24222222222 = j10;
                                sb7222222222.append(j24222222222);
                                wearableExtender222222222.setBridgeTag(sb7222222222.toString());
                                if (dialogKey5.story) {
                                }
                                NotificationCompat.Builder autoCancel222222222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                if (dialogKey5.story) {
                                }
                                category = autoCancel222222222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity222222222).extend(wearableExtender222222222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent.putExtra("messageDate", i7);
                                intent.putExtra("dialogId", j11);
                                intent.putExtra(str41222222222, notificationsController3.currentAccount);
                                if (dialogKey5.story) {
                                }
                                if (messageObject5 != null) {
                                }
                                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                if (z7) {
                                }
                                if (messageObject5 != null) {
                                }
                                tL_keyboardButtonCopy = null;
                                if (tL_keyboardButtonCopy != null) {
                                }
                                j18 = dialogKey5.dialogId;
                                if (j18 != UserObject.VERIFY) {
                                }
                                if (arrayList2.size() != 1) {
                                }
                                if (DialogObject.isEncryptedDialog(j11)) {
                                }
                                if (bitmap4 != null) {
                                }
                                if (!AndroidUtilities.needShowPasscode(false)) {
                                }
                                if (chat5 == null) {
                                }
                                user7 = user6;
                                Notification notification3222222222 = notification;
                                boolean z16222222222 = z7;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                FileLog.d("showExtraNotifications: holders.add " + j11);
                                i8 = i23;
                                str10 = str23;
                                z8 = z6;
                                j8 = j16;
                                z9 = z16222222222;
                                longSparseArray6 = longSparseArray9;
                                str12 = str5;
                                i14 = i24;
                                str11 = str42222222222;
                                notification2 = notification3222222222;
                                str14 = str44222222222;
                                sharedPreferences = sharedPreferences2;
                                str13 = str43222222222;
                                arrayList5 = arrayList14;
                                arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                notificationsController2 = this;
                                notificationsController2.wearNotificationsIds.put(j11, num);
                            } else {
                                ArrayList<StoryNotification> arrayList21 = arrayList3;
                                chat = getMessagesController().getChat(Long.valueOf(-j4));
                                if (chat == null) {
                                    if (messageObject.isFcmMessage()) {
                                        boolean isSupergroup = messageObject.isSupergroup();
                                        String str53 = messageObject.localName;
                                        z11 = isSupergroup;
                                        j6 = clientUserId;
                                        arrayList4 = arrayList21;
                                        num = num3;
                                        j7 = j5;
                                        z10 = false;
                                        fileLocation3 = null;
                                        z12 = messageObject.localChannel;
                                        str15 = str53;
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.w("not found chat to show dialog notification " + j4);
                                        }
                                        longSparseArray6 = longSparseArray;
                                        sharedPreferences = notificationsSettings;
                                        notificationsController2 = notificationsController3;
                                        i8 = i23;
                                        arrayList5 = arrayList14;
                                        notification2 = notification;
                                        str10 = str3;
                                        str11 = str4;
                                        str12 = str5;
                                        str13 = str6;
                                        str14 = str7;
                                        z8 = z6;
                                        z9 = z7;
                                        j8 = clientUserId;
                                    }
                                } else {
                                    boolean z18 = chat.megagroup;
                                    boolean z19 = ChatObject.isChannel(chat) && !chat.megagroup;
                                    String title = notificationsController3.getTitle(chat);
                                    z11 = z18;
                                    TLRPC.ChatPhoto chatPhoto3 = chat.photo;
                                    if (chatPhoto3 == null || (fileLocation = chatPhoto3.photo_small) == null) {
                                        arrayList4 = arrayList21;
                                        num = num3;
                                    } else {
                                        arrayList4 = arrayList21;
                                        num = num3;
                                        if (fileLocation.volume_id != 0) {
                                        }
                                    }
                                    fileLocation = null;
                                    if (j5 != 0) {
                                        fileLocation2 = fileLocation;
                                        z12 = z19;
                                        j6 = clientUserId;
                                        j7 = j5;
                                        TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(chat.id, j7);
                                        if (findTopic != null) {
                                            str15 = findTopic.title + " in " + title;
                                            if (!z10) {
                                                z10 = ChatObject.canSendPlain(chat);
                                                fileLocation3 = fileLocation2;
                                            } else {
                                                chat2 = chat;
                                                fileLocation3 = fileLocation2;
                                                user3 = null;
                                                TLRPC.Chat chat72 = chat2;
                                                user4 = user3;
                                                chat = chat72;
                                                if (j4 == UserObject.VERIFY) {
                                                }
                                                chat3 = chat;
                                                user5 = user4;
                                                string = str15;
                                                fileLocation4 = fileLocation3;
                                                chat4 = chat3;
                                                if (j4 != UserObject.VERIFY) {
                                                }
                                                if (messageObject != null) {
                                                }
                                                if (z6) {
                                                }
                                                if (fileLocation4 == null) {
                                                }
                                                if (chat4 == null) {
                                                }
                                                File file422222 = file;
                                                if (z12) {
                                                }
                                                bitmap2 = bitmap;
                                                Intent intent222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                                intent222222.putExtra("dialog_id", j4);
                                                int i2922222 = id;
                                                intent222222.putExtra("max_id", i2922222);
                                                intent222222.putExtra("topic_id", j7);
                                                intent222222.putExtra("currentAccount", notificationsController3.currentAccount);
                                                dialogKey2 = dialogKey;
                                                chat5 = chat4;
                                                PendingIntent broadcast22222 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent222222, 167772160);
                                                RemoteInput build322222 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                                                if (!DialogObject.isChatDialog(j4)) {
                                                }
                                                build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast22222).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build322222).setShowsUserInterface(false).build();
                                                num2 = (Integer) notificationsController3.pushDialogs.get(j4);
                                                if (num2 == null) {
                                                }
                                                dialogKey3 = dialogKey2;
                                                if (!dialogKey3.story) {
                                                }
                                                if (max > 1) {
                                                }
                                                long j2322222 = j4;
                                                j9 = j6;
                                                person = (Person) longSparseArray.get(j9);
                                                if (Build.VERSION.SDK_INT >= 28) {
                                                }
                                                action = build;
                                                str20 = "dialog_id";
                                                str21 = "currentAccount";
                                                messageObject3 = messageObject2;
                                                if (messageObject2 == null) {
                                                }
                                                String str38222222222 = "";
                                                if (person == null) {
                                                }
                                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                                messagingStyle2 = messagingStyle;
                                                i10 = Build.VERSION.SDK_INT;
                                                if (i10 >= 28) {
                                                }
                                                messagingStyle2.setConversationTitle(format);
                                                messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j2322222)) || UserObject.isReplyUser(j2322222));
                                                StringBuilder sb5222222222 = new StringBuilder();
                                                String str39222222222 = str21;
                                                String[] strArr2222222222 = new String[1];
                                                boolean[] zArr2222222222 = new boolean[1];
                                                if (!dialogKey3.story) {
                                                }
                                                Intent intent3222222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                                intent3222222222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent3222222222.setFlags(67108864);
                                                intent3222222222.addCategory("android.intent.category.LAUNCHER");
                                                if (messageObject3 == null) {
                                                }
                                                if (messageObject3 == null) {
                                                }
                                                String str40222222222 = str5;
                                                if (messageObject3 == null) {
                                                }
                                                LongSparseArray longSparseArray14222222222 = longSparseArray7;
                                                str34 = str6;
                                                str35 = str7;
                                                messageObject4 = messageObject3;
                                                dialogKey5 = dialogKey4;
                                                if (!dialogKey5.story) {
                                                }
                                                StringBuilder sb62222222222 = new StringBuilder();
                                                sb62222222222.append("show extra notifications chatId ");
                                                sb62222222222.append(j11);
                                                sb62222222222.append(" topicId ");
                                                j15 = j12;
                                                sb62222222222.append(j15);
                                                FileLog.d(sb62222222222.toString());
                                                if (j15 != 0) {
                                                }
                                                String str412222222222 = str39222222222;
                                                intent3222222222.putExtra(str412222222222, notificationsController3.currentAccount);
                                                PendingIntent activity2222222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent3222222222, 1140850688);
                                                NotificationCompat.WearableExtender wearableExtender2222222222 = new NotificationCompat.WearableExtender();
                                                NotificationCompat.Action action42222222222 = action;
                                                if (action != null) {
                                                }
                                                String str422222222222 = str22;
                                                Intent intent42222222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                                intent42222222222.addFlags(32);
                                                intent42222222222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                intent42222222222.putExtra(str20, j11);
                                                int i302222222222 = i9;
                                                intent42222222222.putExtra(str19, i302222222222);
                                                intent42222222222.putExtra(str412222222222, notificationsController3.currentAccount);
                                                String str432222222222 = str34;
                                                String str442222222222 = str35;
                                                NotificationCompat.Action build42222222222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent42222222222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                                if (DialogObject.isEncryptedDialog(j11)) {
                                                }
                                                if (str36 != null) {
                                                }
                                                StringBuilder sb72222222222 = new StringBuilder();
                                                sb72222222222.append("tgaccount");
                                                int i312222222222 = i12;
                                                long j242222222222 = j10;
                                                sb72222222222.append(j242222222222);
                                                wearableExtender2222222222.setBridgeTag(sb72222222222.toString());
                                                if (dialogKey5.story) {
                                                }
                                                NotificationCompat.Builder autoCancel2222222222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                                if (dialogKey5.story) {
                                                }
                                                category = autoCancel2222222222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity2222222222).extend(wearableExtender2222222222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                                intent.putExtra("messageDate", i7);
                                                intent.putExtra("dialogId", j11);
                                                intent.putExtra(str412222222222, notificationsController3.currentAccount);
                                                if (dialogKey5.story) {
                                                }
                                                if (messageObject5 != null) {
                                                }
                                                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                                if (z7) {
                                                }
                                                if (messageObject5 != null) {
                                                }
                                                tL_keyboardButtonCopy = null;
                                                if (tL_keyboardButtonCopy != null) {
                                                }
                                                j18 = dialogKey5.dialogId;
                                                if (j18 != UserObject.VERIFY) {
                                                }
                                                if (arrayList2.size() != 1) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j11)) {
                                                }
                                                if (bitmap4 != null) {
                                                }
                                                if (!AndroidUtilities.needShowPasscode(false)) {
                                                }
                                                if (chat5 == null) {
                                                }
                                                user7 = user6;
                                                Notification notification32222222222 = notification;
                                                boolean z162222222222 = z7;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                FileLog.d("showExtraNotifications: holders.add " + j11);
                                                i8 = i23;
                                                str10 = str23;
                                                z8 = z6;
                                                j8 = j16;
                                                z9 = z162222222222;
                                                longSparseArray6 = longSparseArray9;
                                                str12 = str5;
                                                i14 = i24;
                                                str11 = str422222222222;
                                                notification2 = notification32222222222;
                                                str14 = str442222222222;
                                                sharedPreferences = sharedPreferences2;
                                                str13 = str432222222222;
                                                arrayList5 = arrayList14;
                                                arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                                notificationsController2 = this;
                                                notificationsController2.wearNotificationsIds.put(j11, num);
                                            }
                                        }
                                    } else {
                                        fileLocation2 = fileLocation;
                                        z12 = z19;
                                        j6 = clientUserId;
                                        j7 = j5;
                                    }
                                    str15 = title;
                                    if (!z10) {
                                    }
                                }
                                user4 = null;
                                if (j4 == UserObject.VERIFY) {
                                }
                                chat3 = chat;
                                user5 = user4;
                                string = str15;
                                fileLocation4 = fileLocation3;
                                chat4 = chat3;
                                if (j4 != UserObject.VERIFY) {
                                }
                                if (messageObject != null) {
                                }
                                if (z6) {
                                }
                                if (fileLocation4 == null) {
                                }
                                if (chat4 == null) {
                                }
                                File file4222222 = file;
                                if (z12) {
                                }
                                bitmap2 = bitmap;
                                Intent intent2222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                intent2222222.putExtra("dialog_id", j4);
                                int i29222222 = id;
                                intent2222222.putExtra("max_id", i29222222);
                                intent2222222.putExtra("topic_id", j7);
                                intent2222222.putExtra("currentAccount", notificationsController3.currentAccount);
                                dialogKey2 = dialogKey;
                                chat5 = chat4;
                                PendingIntent broadcast222222 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent2222222, 167772160);
                                RemoteInput build3222222 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                                if (!DialogObject.isChatDialog(j4)) {
                                }
                                build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast222222).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build3222222).setShowsUserInterface(false).build();
                                num2 = (Integer) notificationsController3.pushDialogs.get(j4);
                                if (num2 == null) {
                                }
                                dialogKey3 = dialogKey2;
                                if (!dialogKey3.story) {
                                }
                                if (max > 1) {
                                }
                                long j23222222 = j4;
                                j9 = j6;
                                person = (Person) longSparseArray.get(j9);
                                if (Build.VERSION.SDK_INT >= 28) {
                                }
                                action = build;
                                str20 = "dialog_id";
                                str21 = "currentAccount";
                                messageObject3 = messageObject2;
                                if (messageObject2 == null) {
                                }
                                String str382222222222 = "";
                                if (person == null) {
                                }
                                messagingStyle = new NotificationCompat.MessagingStyle("");
                                messagingStyle2 = messagingStyle;
                                i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 28) {
                                }
                                messagingStyle2.setConversationTitle(format);
                                messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j23222222)) || UserObject.isReplyUser(j23222222));
                                StringBuilder sb52222222222 = new StringBuilder();
                                String str392222222222 = str21;
                                String[] strArr22222222222 = new String[1];
                                boolean[] zArr22222222222 = new boolean[1];
                                if (!dialogKey3.story) {
                                }
                                Intent intent32222222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                intent32222222222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent32222222222.setFlags(67108864);
                                intent32222222222.addCategory("android.intent.category.LAUNCHER");
                                if (messageObject3 == null) {
                                }
                                if (messageObject3 == null) {
                                }
                                String str402222222222 = str5;
                                if (messageObject3 == null) {
                                }
                                LongSparseArray longSparseArray142222222222 = longSparseArray7;
                                str34 = str6;
                                str35 = str7;
                                messageObject4 = messageObject3;
                                dialogKey5 = dialogKey4;
                                if (!dialogKey5.story) {
                                }
                                StringBuilder sb622222222222 = new StringBuilder();
                                sb622222222222.append("show extra notifications chatId ");
                                sb622222222222.append(j11);
                                sb622222222222.append(" topicId ");
                                j15 = j12;
                                sb622222222222.append(j15);
                                FileLog.d(sb622222222222.toString());
                                if (j15 != 0) {
                                }
                                String str4122222222222 = str392222222222;
                                intent32222222222.putExtra(str4122222222222, notificationsController3.currentAccount);
                                PendingIntent activity22222222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent32222222222, 1140850688);
                                NotificationCompat.WearableExtender wearableExtender22222222222 = new NotificationCompat.WearableExtender();
                                NotificationCompat.Action action422222222222 = action;
                                if (action != null) {
                                }
                                String str4222222222222 = str22;
                                Intent intent422222222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                intent422222222222.addFlags(32);
                                intent422222222222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                intent422222222222.putExtra(str20, j11);
                                int i3022222222222 = i9;
                                intent422222222222.putExtra(str19, i3022222222222);
                                intent422222222222.putExtra(str4122222222222, notificationsController3.currentAccount);
                                String str4322222222222 = str34;
                                String str4422222222222 = str35;
                                NotificationCompat.Action build422222222222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent422222222222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                                if (DialogObject.isEncryptedDialog(j11)) {
                                }
                                if (str36 != null) {
                                }
                                StringBuilder sb722222222222 = new StringBuilder();
                                sb722222222222.append("tgaccount");
                                int i3122222222222 = i12;
                                long j2422222222222 = j10;
                                sb722222222222.append(j2422222222222);
                                wearableExtender22222222222.setBridgeTag(sb722222222222.toString());
                                if (dialogKey5.story) {
                                }
                                NotificationCompat.Builder autoCancel22222222222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                                if (dialogKey5.story) {
                                }
                                category = autoCancel22222222222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity22222222222).extend(wearableExtender22222222222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent.putExtra("messageDate", i7);
                                intent.putExtra("dialogId", j11);
                                intent.putExtra(str4122222222222, notificationsController3.currentAccount);
                                if (dialogKey5.story) {
                                }
                                if (messageObject5 != null) {
                                }
                                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                                if (z7) {
                                }
                                if (messageObject5 != null) {
                                }
                                tL_keyboardButtonCopy = null;
                                if (tL_keyboardButtonCopy != null) {
                                }
                                j18 = dialogKey5.dialogId;
                                if (j18 != UserObject.VERIFY) {
                                }
                                if (arrayList2.size() != 1) {
                                }
                                if (DialogObject.isEncryptedDialog(j11)) {
                                }
                                if (bitmap4 != null) {
                                }
                                if (!AndroidUtilities.needShowPasscode(false)) {
                                }
                                if (chat5 == null) {
                                }
                                user7 = user6;
                                Notification notification322222222222 = notification;
                                boolean z1622222222222 = z7;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                FileLog.d("showExtraNotifications: holders.add " + j11);
                                i8 = i23;
                                str10 = str23;
                                z8 = z6;
                                j8 = j16;
                                z9 = z1622222222222;
                                longSparseArray6 = longSparseArray9;
                                str12 = str5;
                                i14 = i24;
                                str11 = str4222222222222;
                                notification2 = notification322222222222;
                                str14 = str4422222222222;
                                sharedPreferences = sharedPreferences2;
                                str13 = str4322222222222;
                                arrayList5 = arrayList14;
                                arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                notificationsController2 = this;
                                notificationsController2.wearNotificationsIds.put(j11, num);
                            }
                            i20 = i14 + 1;
                            arrayList13 = arrayList5;
                            size = i8;
                            str5 = str12;
                            z5 = z8;
                            arrayList11 = arrayList2;
                            z4 = z9;
                            longSparseArray12 = longSparseArray4;
                            clientUserId = j8;
                            str6 = str13;
                            str7 = str14;
                            str4 = str11;
                            longSparseArray13 = longSparseArray5;
                            longSparseArray = longSparseArray6;
                            build2 = notification2;
                            notificationsController3 = notificationsController2;
                            str3 = str10;
                            notificationsSettings = sharedPreferences;
                            i4 = -1;
                        } else {
                            arrayList4 = arrayList3;
                            j6 = clientUserId;
                            num = num3;
                            j7 = j5;
                            if (j4 != globalSecretChatId) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(j4);
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
                                longSparseArray6 = longSparseArray;
                                sharedPreferences = notificationsSettings;
                                notificationsController2 = notificationsController3;
                                i8 = i23;
                                arrayList5 = arrayList14;
                                notification2 = notification;
                                str10 = str3;
                                str11 = str4;
                                str12 = str5;
                                str13 = str6;
                                str14 = str7;
                                z8 = z6;
                                z9 = z7;
                                j8 = j6;
                            } else {
                                user = null;
                            }
                            user2 = user;
                            string = LocaleController.getString(R.string.SecretChatName);
                        }
                        i14 = i24;
                        i20 = i14 + 1;
                        arrayList13 = arrayList5;
                        size = i8;
                        str5 = str12;
                        z5 = z8;
                        arrayList11 = arrayList2;
                        z4 = z9;
                        longSparseArray12 = longSparseArray4;
                        clientUserId = j8;
                        str6 = str13;
                        str7 = str14;
                        str4 = str11;
                        longSparseArray13 = longSparseArray5;
                        longSparseArray = longSparseArray6;
                        build2 = notification2;
                        notificationsController3 = notificationsController2;
                        str3 = str10;
                        notificationsSettings = sharedPreferences;
                        i4 = -1;
                    }
                    fileLocation4 = null;
                    z10 = false;
                    chat4 = null;
                    z12 = false;
                    z11 = false;
                    if (messageObject != null) {
                    }
                    if (z6) {
                    }
                    if (fileLocation4 == null) {
                    }
                    if (chat4 == null) {
                    }
                    File file42222222 = file;
                    if (z12) {
                    }
                    bitmap2 = bitmap;
                    Intent intent22222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                    intent22222222.putExtra("dialog_id", j4);
                    int i292222222 = id;
                    intent22222222.putExtra("max_id", i292222222);
                    intent22222222.putExtra("topic_id", j7);
                    intent22222222.putExtra("currentAccount", notificationsController3.currentAccount);
                    dialogKey2 = dialogKey;
                    chat5 = chat4;
                    PendingIntent broadcast2222222 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent22222222, 167772160);
                    RemoteInput build32222222 = new RemoteInput.Builder(EXTRA_VOICE_REPLY).setLabel(LocaleController.getString(R.string.Reply)).build();
                    if (!DialogObject.isChatDialog(j4)) {
                    }
                    build = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, formatString, broadcast2222222).setAllowGeneratedReplies(r9).setSemanticAction(r9).addRemoteInput(build32222222).setShowsUserInterface(false).build();
                    num2 = (Integer) notificationsController3.pushDialogs.get(j4);
                    if (num2 == null) {
                    }
                    dialogKey3 = dialogKey2;
                    if (!dialogKey3.story) {
                    }
                    if (max > 1) {
                    }
                    long j232222222 = j4;
                    j9 = j6;
                    person = (Person) longSparseArray.get(j9);
                    if (Build.VERSION.SDK_INT >= 28) {
                    }
                    action = build;
                    str20 = "dialog_id";
                    str21 = "currentAccount";
                    messageObject3 = messageObject2;
                    if (messageObject2 == null) {
                    }
                    String str3822222222222 = "";
                    if (person == null) {
                    }
                    messagingStyle = new NotificationCompat.MessagingStyle("");
                    messagingStyle2 = messagingStyle;
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 28) {
                    }
                    messagingStyle2.setConversationTitle(format);
                    messagingStyle2.setGroupConversation(i10 >= 28 || (!z12 && DialogObject.isChatDialog(j232222222)) || UserObject.isReplyUser(j232222222));
                    StringBuilder sb522222222222 = new StringBuilder();
                    String str3922222222222 = str21;
                    String[] strArr222222222222 = new String[1];
                    boolean[] zArr222222222222 = new boolean[1];
                    if (!dialogKey3.story) {
                    }
                    Intent intent322222222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                    intent322222222222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent322222222222.setFlags(67108864);
                    intent322222222222.addCategory("android.intent.category.LAUNCHER");
                    if (messageObject3 == null) {
                    }
                    if (messageObject3 == null) {
                    }
                    String str4022222222222 = str5;
                    if (messageObject3 == null) {
                    }
                    LongSparseArray longSparseArray1422222222222 = longSparseArray7;
                    str34 = str6;
                    str35 = str7;
                    messageObject4 = messageObject3;
                    dialogKey5 = dialogKey4;
                    if (!dialogKey5.story) {
                    }
                    StringBuilder sb6222222222222 = new StringBuilder();
                    sb6222222222222.append("show extra notifications chatId ");
                    sb6222222222222.append(j11);
                    sb6222222222222.append(" topicId ");
                    j15 = j12;
                    sb6222222222222.append(j15);
                    FileLog.d(sb6222222222222.toString());
                    if (j15 != 0) {
                    }
                    String str41222222222222 = str3922222222222;
                    intent322222222222.putExtra(str41222222222222, notificationsController3.currentAccount);
                    PendingIntent activity222222222222 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent322222222222, 1140850688);
                    NotificationCompat.WearableExtender wearableExtender222222222222 = new NotificationCompat.WearableExtender();
                    NotificationCompat.Action action4222222222222 = action;
                    if (action != null) {
                    }
                    String str42222222222222 = str22;
                    Intent intent4222222222222 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                    intent4222222222222.addFlags(32);
                    intent4222222222222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent4222222222222.putExtra(str20, j11);
                    int i30222222222222 = i9;
                    intent4222222222222.putExtra(str19, i30222222222222);
                    intent4222222222222.putExtra(str41222222222222, notificationsController3.currentAccount);
                    String str43222222222222 = str34;
                    String str44222222222222 = str35;
                    NotificationCompat.Action build4222222222222 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent4222222222222, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                    if (DialogObject.isEncryptedDialog(j11)) {
                    }
                    if (str36 != null) {
                    }
                    StringBuilder sb7222222222222 = new StringBuilder();
                    sb7222222222222.append("tgaccount");
                    int i31222222222222 = i12;
                    long j24222222222222 = j10;
                    sb7222222222222.append(j24222222222222);
                    wearableExtender222222222222.setBridgeTag(sb7222222222222.toString());
                    if (dialogKey5.story) {
                    }
                    NotificationCompat.Builder autoCancel222222222222 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str24).setSmallIcon(R.drawable.notification).setContentText(sb.toString()).setAutoCancel(true);
                    if (dialogKey5.story) {
                    }
                    category = autoCancel222222222222.setNumber(arrayList9.size()).setColor(-15618822).setGroupSummary(false).setWhen(j17).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity222222222222).extend(wearableExtender222222222222).setSortKey(String.valueOf(Long.MAX_VALUE - j17)).setCategory("msg");
                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                    intent.putExtra("messageDate", i7);
                    intent.putExtra("dialogId", j11);
                    intent.putExtra(str41222222222222, notificationsController3.currentAccount);
                    if (dialogKey5.story) {
                    }
                    if (messageObject5 != null) {
                    }
                    category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num.intValue(), intent, 167772160));
                    if (z7) {
                    }
                    if (messageObject5 != null) {
                    }
                    tL_keyboardButtonCopy = null;
                    if (tL_keyboardButtonCopy != null) {
                    }
                    j18 = dialogKey5.dialogId;
                    if (j18 != UserObject.VERIFY) {
                    }
                    if (arrayList2.size() != 1) {
                    }
                    if (DialogObject.isEncryptedDialog(j11)) {
                    }
                    if (bitmap4 != null) {
                    }
                    if (!AndroidUtilities.needShowPasscode(false)) {
                    }
                    if (chat5 == null) {
                    }
                    user7 = user6;
                    Notification notification3222222222222 = notification;
                    boolean z16222222222222 = z7;
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    FileLog.d("showExtraNotifications: holders.add " + j11);
                    i8 = i23;
                    str10 = str23;
                    z8 = z6;
                    j8 = j16;
                    z9 = z16222222222222;
                    longSparseArray6 = longSparseArray9;
                    str12 = str5;
                    i14 = i24;
                    str11 = str42222222222222;
                    notification2 = notification3222222222222;
                    str14 = str44222222222222;
                    sharedPreferences = sharedPreferences2;
                    str13 = str43222222222222;
                    arrayList5 = arrayList14;
                    arrayList5.add(new 1NotificationHolder(num.intValue(), j11, dialogKey5.story, j15, str24, user7, chat5, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                    notificationsController2 = this;
                    notificationsController2.wearNotificationsIds.put(j11, num);
                    i20 = i14 + 1;
                    arrayList13 = arrayList5;
                    size = i8;
                    str5 = str12;
                    z5 = z8;
                    arrayList11 = arrayList2;
                    z4 = z9;
                    longSparseArray12 = longSparseArray4;
                    clientUserId = j8;
                    str6 = str13;
                    str7 = str14;
                    str4 = str11;
                    longSparseArray13 = longSparseArray5;
                    longSparseArray = longSparseArray6;
                    build2 = notification2;
                    notificationsController3 = notificationsController2;
                    str3 = str10;
                    notificationsSettings = sharedPreferences;
                    i4 = -1;
                }
                LongSparseArray longSparseArray16 = longSparseArray;
                longSparseArray2 = longSparseArray13;
                Notification notification4 = build2;
                NotificationsController notificationsController4 = notificationsController3;
                ArrayList arrayList22 = arrayList13;
                if (!z4) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("show summary with id " + notificationsController4.notificationId);
                    }
                    try {
                        notificationManager.notify(notificationsController4.notificationId, notification4);
                        notificationsController = notificationsController4;
                        arrayList = arrayList22;
                    } catch (SecurityException e5) {
                        FileLog.e(e5);
                        notificationsController = this;
                        arrayList = arrayList22;
                        notificationsController.resetNotificationSound(builder, j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                    }
                } else {
                    notificationsController = notificationsController4;
                    arrayList = arrayList22;
                    if (notificationsController.openedInBubbleDialogs.isEmpty()) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("cancel summary with id " + notificationsController.notificationId);
                        }
                        notificationManager.cancel(notificationsController.notificationId);
                    }
                }
                i5 = 0;
                while (i5 < longSparseArray2.size()) {
                    LongSparseArray longSparseArray17 = longSparseArray2;
                    if (!notificationsController.openedInBubbleDialogs.contains(Long.valueOf(longSparseArray17.keyAt(i5)))) {
                        Integer num4 = (Integer) longSparseArray17.valueAt(i5);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("cancel notification id " + num4);
                        }
                        notificationManager.cancel(num4.intValue());
                    }
                    i5++;
                    longSparseArray2 = longSparseArray17;
                }
                ArrayList arrayList23 = new ArrayList(arrayList.size());
                FileLog.d("showExtraNotifications: holders.size()=" + arrayList.size());
                size2 = arrayList.size();
                i6 = 0;
                while (i6 < size2) {
                    ArrayList arrayList24 = arrayList;
                    1NotificationHolder r5 = (1NotificationHolder) arrayList24.get(i6);
                    arrayList23.clear();
                    if (Build.VERSION.SDK_INT < 29 || DialogObject.isEncryptedDialog(r5.dialogId)) {
                        longSparseArray3 = longSparseArray16;
                    } else {
                        NotificationCompat.Builder builder3 = r5.notification;
                        long j26 = r5.dialogId;
                        longSparseArray3 = longSparseArray16;
                        String createNotificationShortcut = createNotificationShortcut(builder3, j26, r5.name, r5.user, r5.chat, (Person) longSparseArray3.get(j26), !r5.story);
                        if (createNotificationShortcut != null) {
                            arrayList23.add(createNotificationShortcut);
                        }
                    }
                    FileLog.d("showExtraNotifications: holders[" + i6 + "].call()");
                    r5.call();
                    if (!unsupportedNotificationShortcut() && !arrayList23.isEmpty()) {
                        ShortcutManagerCompat.removeDynamicShortcuts(ApplicationLoader.applicationContext, arrayList23);
                    }
                    i6++;
                    arrayList = arrayList24;
                    longSparseArray16 = longSparseArray3;
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
        size = arrayList11.size();
        while (true) {
            if (i20 < size) {
            }
            i20 = i14 + 1;
            arrayList13 = arrayList5;
            size = i8;
            str5 = str12;
            z5 = z8;
            arrayList11 = arrayList2;
            z4 = z9;
            longSparseArray12 = longSparseArray4;
            clientUserId = j8;
            str6 = str13;
            str7 = str14;
            str4 = str11;
            longSparseArray13 = longSparseArray5;
            longSparseArray = longSparseArray6;
            build2 = notification2;
            notificationsController3 = notificationsController2;
            str3 = str10;
            notificationsSettings = sharedPreferences;
            i4 = -1;
        }
        LongSparseArray longSparseArray162 = longSparseArray;
        longSparseArray2 = longSparseArray13;
        Notification notification42 = build2;
        NotificationsController notificationsController42 = notificationsController3;
        ArrayList arrayList222 = arrayList13;
        if (!z4) {
        }
        i5 = 0;
        while (i5 < longSparseArray2.size()) {
        }
        ArrayList arrayList232 = new ArrayList(arrayList.size());
        FileLog.d("showExtraNotifications: holders.size()=" + arrayList.size());
        size2 = arrayList.size();
        i6 = 0;
        while (i6 < size2) {
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
    public static /* synthetic */ void lambda$showExtraNotifications$43(Uri uri, File file) {
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

    public static Person.Builder loadRoundAvatar(long j, File file, Person.Builder builder) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (j == UserObject.OAUTH) {
            builder.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.ic_launcher_dr));
            return builder;
        }
        if (file != null && Build.VERSION.SDK_INT >= 28) {
            try {
                createSource = ImageDecoder.createSource(file);
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda42
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        NotificationsController.lambda$loadRoundAvatar$45(imageDecoder, imageInfo, source);
                    }
                });
                builder.setIcon(IconCompat.createWithBitmap(decodeBitmap));
            } catch (Throwable unused) {
            }
        }
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadRoundAvatar$45(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setPostProcessor(new PostProcessor() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda38
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                int lambda$loadRoundAvatar$44;
                lambda$loadRoundAvatar$44 = NotificationsController.lambda$loadRoundAvatar$44(canvas);
                return lambda$loadRoundAvatar$44;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$loadRoundAvatar$44(Canvas canvas) {
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
        notificationsQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda62
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$playOutChatSound$47();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playOutChatSound$47() {
        try {
            if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundOutPlay) <= 100) {
                return;
            }
            this.lastSoundOutPlay = SystemClock.elapsedRealtime();
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda55
                    @Override // android.media.SoundPool.OnLoadCompleteListener
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.lambda$playOutChatSound$46(soundPool2, i, i2);
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
    public static /* synthetic */ void lambda$playOutChatSound$46(SoundPool soundPool, int i, int i2) {
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
        getConnectionsManager().sendRequest(updatenotifysettings, new RequestDelegate() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda74
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsController.lambda$updateServerNotificationsSettings$48(tLObject, tL_error);
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
            getConnectionsManager().sendRequest(setreactionsnotifysettings, new RequestDelegate() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda48
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    NotificationsController.lambda$updateServerNotificationsSettings$49(tLObject, tL_error);
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
        getConnectionsManager().sendRequest(updatenotifysettings, new RequestDelegate() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda47
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsController.lambda$updateServerNotificationsSettings$50(tLObject, tL_error);
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
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda73
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.this.lambda$loadTopicsNotificationsExceptions$52(j, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadTopicsNotificationsExceptions$52(long j, final Consumer consumer) {
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
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.NotificationsController$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                NotificationsController.lambda$loadTopicsNotificationsExceptions$51(Consumer.this, hashSet);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadTopicsNotificationsExceptions$51(Consumer consumer, HashSet hashSet) {
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
